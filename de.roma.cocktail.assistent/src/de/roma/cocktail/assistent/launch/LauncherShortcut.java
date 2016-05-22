package de.roma.cocktail.assistent.launch;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationType;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.core.ILaunchManager;
import org.eclipse.debug.ui.DebugUITools;
import org.eclipse.debug.ui.ILaunchShortcut;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;

import de.roma.cocktail.assistent.wizards.NewCocktailWizard;

public class LauncherShortcut implements ILaunchShortcut {

	/*
	 * see:
	 * http://grepcode.com/file/repository.grepcode.com/java/eclipse.org/3.5.2/
	 * org.eclipse.jdt.debug/ui/3.4.1/org/eclipse/jdt/debug/ui/
	 * launchConfigurations/JavaLaunchShortcut.java#JavaLaunchShortcut
	 */

	private ILaunchConfiguration findConfiguration(ILaunchConfigurationType type, ILaunchManager launchManager,
			IProject project) {
		try {
			// check if there exists a launch configuration for the same project
			ILaunchConfiguration[] configurations = launchManager.getLaunchConfigurations(type);
			for (int i = 0; i < configurations.length; i++) {
				ILaunchConfiguration configuration = configurations[i];
				String configProject = configuration.getAttribute(LaunchConfiguration.COCKTAIL_LAUNCHCONFIG_PROJECT,
						"");
				if (project.getName().equals(configProject)) {
					return configuration;
				}
			}
		} catch (CoreException e) {
		}
		return null;
	}

	private void checkLaunch(String mode, IProject project) {
		ILaunchManager launchManager = DebugPlugin.getDefault().getLaunchManager();
		ILaunchConfigurationType type = launchManager
				.getLaunchConfigurationType(LaunchConfiguration.COCKTAIL_LAUNCHCONFIG_TYPE);
		// search for fitting existing launch configs for this selection
		ILaunchConfiguration configuration = findConfiguration(type, launchManager, project);
		if (configuration == null) {
			// create a new launch config
			try {
				configuration = createConfiguration(type, project);
			} catch (CoreException e) {
				e.printStackTrace();
			}
		}
		if (configuration == null) {
			System.err.println("Failed to find or create launch configuration");
			return;
		}
		DebugUITools.launch(configuration, mode);
	}

	private ILaunchConfiguration createConfiguration(ILaunchConfigurationType type, IProject project)
			throws CoreException {
		ILaunchConfigurationWorkingCopy workingCopy = type.newInstance(null, project.getName());
		workingCopy.setAttribute(LaunchConfiguration.COCKTAIL_LAUNCHCONFIG_CMD, "bash");
		workingCopy.setAttribute(LaunchConfiguration.COCKTAIL_LAUNCHCONFIG_MAKE, "make");
		workingCopy.setAttribute(LaunchConfiguration.COCKTAIL_LAUNCHCONFIG_PROJECT, project.getName());
		ILaunchConfiguration configuration = workingCopy.doSave();
		return configuration;
	}

	@Override
	public void launch(ISelection selection, String mode) {

		if (selection instanceof IStructuredSelection) {
			Object selected = ((IStructuredSelection) selection).getFirstElement();

			if (selected != null && selected instanceof IFile) {
				IFile file = (IFile) selected;
				IFolder buildFolder = file.getProject().getFolder(NewCocktailWizard.BUILD_FOLDER_NAME);
				IFolder srcFolder = file.getProject().getFolder(NewCocktailWizard.SRC_FOLDER_NAME);
				if (buildFolder.exists()) {
					if (srcFolder.exists()) {
						IFile makefile = buildFolder.getFile("Makefile");
						if (makefile.exists()) {
							checkLaunch(mode, file.getProject());
						} else {
							System.err.println("No Makefile found");
						}
					} else {

						System.err.println("No folder named '" + NewCocktailWizard.SRC_FOLDER_NAME + "' found");
					}
				} else {
					System.err.println("No folder named '" + NewCocktailWizard.BUILD_FOLDER_NAME + "' found");
				}
			}
		}
	}

	@Override
	public void launch(IEditorPart editor, String mode) {

		IEditorInput input = editor.getEditorInput();
		System.out.println(input.getName());

	}

}
