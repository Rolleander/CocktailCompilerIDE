package de.roma.cocktail.assistent.launch.process;

import java.io.File;
import java.io.IOException;

import org.eclipse.core.resources.IProject;
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

import de.roma.cocktail.assistent.wizards.NewCocktailWizard;

public abstract class MakeLauncher {

	public static void launchMake(String shellCmd, String makeCmd, IProject project) throws ProcessException {

		ProcessOutput flow = new MakeOutput(project.getName());
		ProcessLauncher processLauncher = new ProcessLauncher(flow);

		processLauncher.open(shellCmd);
		String cdLocation = project.getLocation().toOSString() + File.separator + NewCocktailWizard.BUILD_FOLDER_NAME;
		System.out.println("Build Folder: " + cdLocation);
		if(cdLocation.contains(":"))
		{
		String partition=cdLocation.split(":")[0]+":";
    	processLauncher.write(partition);	
		}
		processLauncher.write("cd " + cdLocation);
		processLauncher.write(makeCmd);
		int exitCode = processLauncher.waitForTermination();

	}

	private static class MakeOutput implements ProcessOutput {
		private String projectName;

		public MakeOutput(String projectName) {
			this.projectName = projectName;
		}

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
			// Display display = Display.getCurrent(); ist null, funktioniert
			// nicht
			// Color red = display.getSystemColor(SWT.COLOR_RED);
			// out.setColor(red);
			out.println(message);
			try {
				out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		private MessageConsole findConsole(String name) {
			ConsolePlugin plugin = ConsolePlugin.getDefault();
			IConsoleManager conMan = plugin.getConsoleManager();
			IConsole[] existing = conMan.getConsoles();
			for (int i = 0; i < existing.length; i++)
				if (name.equals(existing[i].getName()))
					return (MessageConsole) existing[i];
			// no console found, so create a new one
			MessageConsole myConsole = new MessageConsole(name, null);
			conMan.addConsoles(new IConsole[] { myConsole });
			return myConsole;
		}

	}

}
