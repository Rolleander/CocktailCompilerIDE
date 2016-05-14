package de.roma.cocktail.assistent.launch.process;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleConstants;
import org.eclipse.ui.console.IConsoleManager;
import org.eclipse.ui.console.IConsoleView;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;

public class ProcessLauncher {

	private ProcessOutput processFlow;
	private Process process;
	private BufferedWriter writer;
	private BufferedReader stdInput, stdError;

	public ProcessLauncher(ProcessOutput flow) {
		this.processFlow = flow;
	}

	public void write(String message) throws ProcessException {
		try {
			writer.write(message + "\n");
			writer.flush();
		} catch (IOException e) {
			e.printStackTrace();
			throw new ProcessException("Can't write to process!");
		}
	}

	public int waitForTermination() throws ProcessException {
		try {
			writer.close();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		try {
			return process.waitFor();
		} catch (InterruptedException e) {
			e.printStackTrace();
			throw new ProcessException("Can't wait for termination!");
		}
	}

	public void open(String program) throws ProcessException {
		Runtime rt = Runtime.getRuntime();
		try {
			process = rt.exec(program);
			OutputStream stdin = process.getOutputStream();
			writer = new BufferedWriter(new OutputStreamWriter(stdin));
			stdInput = new BufferedReader(new InputStreamReader(process.getInputStream()));
			stdError = new BufferedReader(new InputStreamReader(process.getErrorStream()));
			
			Thread stdOutPoll = new Thread(new StdOutputPoll());
			Thread stdErrorPoll = new Thread(new StdErrorPoll());
			stdOutPoll.start();
			stdErrorPoll.start();
		} catch (IOException e) {
			e.printStackTrace();
			throw new ProcessException("Failed to open process: \"" + program + "\"");
		}
	}

	private class StdOutputPoll implements Runnable {
		@Override
		public void run() {
			String s = null;
			try {
				while ((s = stdInput.readLine()) != null) {
					processFlow.stdout(s);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	private class StdErrorPoll implements Runnable {
		@Override
		public void run() {
			String s = null;
			try {
				while ((s = stdError.readLine()) != null) {
					processFlow.stderr(s);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void launchMake(final String projectName, String path) {		
		ProcessLauncher processLauncher=new ProcessLauncher(new ProcessOutput() {
			
			@Override
			public void stdout(String message) {
				MessageConsole myConsole = findConsole(projectName + ": Make");
				MessageConsoleStream out = myConsole.newMessageStream();
				out.println(message);
				try {
					out.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
				
				setConsoleActive(myConsole);
			}
			
			private void setConsoleActive(MessageConsole myConsole) {
				IWorkbench wb = PlatformUI.getWorkbench();
				if (wb == null) {
					return;
				}
				// bisher immer null
				IWorkbenchWindow win = wb.getActiveWorkbenchWindow();
				if (win == null) {
					return;
				}
				IWorkbenchPage page = win.getActivePage();
				if (page == null) {
					return;
				}

				// show console
				String id = IConsoleConstants.ID_CONSOLE_VIEW;
				try {
					IConsoleView view = (IConsoleView) page.showView(id);
					view.display(myConsole);
				} catch (PartInitException e) {
					e.printStackTrace();
				}
			}

			@Override
			public void stderr(String message) {
				MessageConsole myConsole = findConsole(projectName + ": Make");
				MessageConsoleStream out = myConsole.newMessageStream();
//				Display display = Display.getCurrent(); ist null, funktioniert nicht
//				Color red = display.getSystemColor(SWT.COLOR_RED);
//				out.setColor(red);
				out.println(message);
				try {
					out.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		});
		try {
			processLauncher.open("cmd.exe"); //TODO Linux make
			processLauncher.write("cd "+path);
			processLauncher.write("dir");
			
			int exitCode=processLauncher.waitForTermination();
			System.out.println("EXIT_CODE: "+exitCode);
		} catch (ProcessException e) {
			e.printStackTrace();
		} 
	}

	private static MessageConsole findConsole(String name) {
	      ConsolePlugin plugin = ConsolePlugin.getDefault();
	      IConsoleManager conMan = plugin.getConsoleManager();
	      IConsole[] existing = conMan.getConsoles();
	      for (int i = 0; i < existing.length; i++)
	         if (name.equals(existing[i].getName()))
	            return (MessageConsole) existing[i];
	      //no console found, so create a new one
	      MessageConsole myConsole = new MessageConsole(name, null);
	      conMan.addConsoles(new IConsole[]{myConsole});
	      return myConsole;
	   }
}
