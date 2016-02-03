package de.roma.cocktail.assistent.launch.process;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

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
			throw new ProcessException("Cant write to process!");
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
			throw new ProcessException("Cant wait for termination!");
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

}
