package de.roma.cocktail.assistent.launch.test;

import org.junit.Test;

import de.roma.cocktail.assistent.launch.process.ProcessException;
import de.roma.cocktail.assistent.launch.process.ProcessLauncher;
import de.roma.cocktail.assistent.launch.process.ProcessOutput;

public class LaunchTest {

	
	/**
	 *   1. Starten Shell
	 *   2. Tools aufrufen / bzw. später nur noch make
	 *   3. Ausgabe des stdout vom prozess 
	 * @throws ProcessException 
	 */
	@Test
	public void test() throws ProcessException {
		
		ProcessLauncher proc=new ProcessLauncher(new ProcessOutput() {			
			@Override
			public void stdout(String message) {
				System.out.println(message);
			}
			
			@Override
			public void stderr(String message) {
				System.err.println(message);
			}
		});
		proc.open("bash");
		
		proc.write("ls");
	
		int exitCode=proc.waitForTermination();
		System.out.println("EXIT_CODE: "+exitCode);
	}

}
