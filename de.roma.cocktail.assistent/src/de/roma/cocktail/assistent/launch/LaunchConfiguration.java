package de.roma.cocktail.assistent.launch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.model.ILaunchConfigurationDelegate;

import de.roma.cocktail.assistent.launch.process.ProcessLauncher;
import de.roma.cocktail.assistent.launch.process.ProcessOutput;

public class LaunchConfiguration implements ILaunchConfigurationDelegate {

	@Override
	public void launch(ILaunchConfiguration configuration, String mode, ILaunch launch, IProgressMonitor monitor)
			throws CoreException {
				
		System.out.println("TEST LAUNCH:");
		
		ProcessLauncher processLauncher=new ProcessLauncher(new ProcessOutput() {
			
			@Override
			public void stdout(String message) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void stderr(String message) {
				// TODO Auto-generated method stub
				
			}
		});
		
		
	}

}
