package de.roma.cocktail.assistent.launch;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.model.ILaunchConfigurationDelegate;

import de.roma.cocktail.assistent.launch.process.MakeLauncher;
import de.roma.cocktail.assistent.launch.process.ProcessException;
import de.roma.cocktail.assistent.wizards.NewCocktailWizard;

public class LaunchConfiguration implements ILaunchConfigurationDelegate {

	private final static String PLUGIN_ID = "de.roma.cocktail.assistent";
	public final static String COCKTAIL_LAUNCHCONFIG_TYPE = "de.roma.cocktail.assistent.launchConfigurationType1";
	public final static String COCKTAIL_LAUNCHCONFIG_CMD = "bash";
	public final static String COCKTAIL_LAUNCHCONFIG_PROJECT = "project";

	@Override
	public void launch(ILaunchConfiguration configuration, String mode, ILaunch launch, IProgressMonitor monitor)
			throws CoreException {
		IProject project = ProjectUtils.getProject(configuration.getAttribute(COCKTAIL_LAUNCHCONFIG_PROJECT, ""));
		if (project == null) {
			throw new CoreException(new Status(Status.ERROR, PLUGIN_ID, "Failed to find project"));
		}
		String shellCmd = configuration.getAttribute(COCKTAIL_LAUNCHCONFIG_CMD, "bash");
		System.out.println("Launch with Configuration: " + mode + " cmd: "+shellCmd+" project: "+project.getName());
			
		precheckConditions(project);
		// 1. Copy all files from source folder into build folder
		copySourceToBuildFolder(project, monitor);
		// 2. Start Build job with make
		try {
			MakeLauncher.launchMake(shellCmd, project);
		} catch (ProcessException e) {
			throw new CoreException(new Status(Status.ERROR, PLUGIN_ID, "Exception in build process occured: "+e.getMessage()));
		}
		// 3. Delete the copied source files from the build folder
		deleteDispensableFiles(project, monitor);
	}

	private void precheckConditions(IProject project) throws CoreException {
		IFolder buildFolder = project.getFolder(NewCocktailWizard.BUILD_FOLDER_NAME);
		IFolder srcFolder = project.getFolder(NewCocktailWizard.SRC_FOLDER_NAME);
		if (!buildFolder.exists()) {
			throw new CoreException(new Status(Status.ERROR, PLUGIN_ID, "Build folder doesn't exist"));
		} else {
			if (!buildFolder.getFile("Makefile").exists()) {
				throw new CoreException(new Status(Status.ERROR, PLUGIN_ID, "Can't find Makefile"));
			}
		}
		if (!srcFolder.exists()) {
			throw new CoreException(new Status(Status.ERROR, PLUGIN_ID, "Source folder doesn't exist"));
		}
	}

	private void copySourceToBuildFolder(IProject project, IProgressMonitor monitor) throws CoreException {
		IFolder buildFolder = project.getFolder(NewCocktailWizard.BUILD_FOLDER_NAME);
		IFolder srcFolder = project.getFolder(NewCocktailWizard.SRC_FOLDER_NAME);
		for (IResource resource : srcFolder.members()) {
			if (resource instanceof IFile) {
				IFile file = (IFile) resource;
				// create same file in build folder
				IFile copiedFile = buildFolder.getFile(file.getName());
				if(copiedFile.exists()){				
					copiedFile.delete(true, monitor);
				}
				copiedFile.create(file.getContents(), true, monitor);
				copiedFile.setDerived(true, monitor);
			}
		}
	}

	private void deleteDispensableFiles(IProject project, IProgressMonitor monitor) throws CoreException {
		IFolder buildFolder = project.getFolder(NewCocktailWizard.BUILD_FOLDER_NAME);
		IFolder srcFolder = project.getFolder(NewCocktailWizard.SRC_FOLDER_NAME);
		for (IResource resource : srcFolder.members()) {
			if (resource instanceof IFile) {
				IFile file = (IFile) resource;
				IFile copiedFile = buildFolder.getFile(file.getName());
				if(copiedFile.exists())
				{
				copiedFile.delete(IResource.NONE, monitor);
				}
			}
		}
	}
}
