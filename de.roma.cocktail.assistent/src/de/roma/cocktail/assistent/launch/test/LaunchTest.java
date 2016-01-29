package de.roma.cocktail.assistent.launch.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

import org.junit.Test;

public class LaunchTest {

	
	/**
	 *   1. Starten Shell
	 *   2. Tools aufrufen / bzw. später nur noch make
	 *   3. Ausgabe des stdout vom prozess 
	 */
	@Test
	public void test() {
		try {
			Runtime rt = Runtime.getRuntime();
		//	String[] commands = {"C:\\Program Files (x86)\\Cocktail-0810\\bin\\rex.exe","-h"};
			
			String[] commands = {"cmd.exe"};
			
			//start shell
			Process proc = rt.exec(commands);

			
			OutputStream stdin = proc.getOutputStream(); 
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(stdin));
			
			//write commands
			writer.write("rex -h \n");
			writer.flush();
			writer.close();
			
			BufferedReader stdInput = new BufferedReader(new 
			     InputStreamReader(proc.getInputStream()));

			BufferedReader stdError = new BufferedReader(new 
			     InputStreamReader(proc.getErrorStream()));

			// read the output from the command
			String s = null;
			while ((s = stdInput.readLine()) != null) {
			    System.out.println(s);
			}

			System.out.println("...");
			// read any errors from the attempted command
			while ((s = stdError.readLine()) != null) {
			    System.err.println(s);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
