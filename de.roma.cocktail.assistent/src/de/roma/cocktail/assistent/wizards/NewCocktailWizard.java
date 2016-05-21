package de.roma.cocktail.assistent.wizards;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;
import java.util.regex.Matcher;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWizard;
import org.osgi.framework.Bundle;

import de.roma.cocktail.assistent.Activator;
import de.roma.cocktail.preference.CCTPreferencePage;

/**
 * This is a wizard for new cocktail projects. Its role is to create a new
 * project with important cocktail spezifications and make files.
 */
public class NewCocktailWizard extends Wizard implements INewWizard {
	private NewCocktailWizardPage pageOne;
	private IStructuredSelection selection;
	public final static String SRC_FOLDER_NAME = "src";
	public final static String BUILD_FOLDER_NAME = "build";

	/**
	 * Constructor for NewCocktailWizard.
	 */
	public NewCocktailWizard() {
		super();
		setWindowTitle("New cocktail project");
		setNeedsProgressMonitor(true);
	}

	/**
	 * Adding the page to the wizard.
	 */
	public void addPages() {
		pageOne = new NewCocktailWizardPage(selection);
		addPage(pageOne);
	}

	/**
	 * This method is called when 'Finish' button is pressed in the wizard. It
	 * creates an operation and runs it using the wizard as execution context.
	 */
	public boolean performFinish() {
		final String projectName = pageOne.getProjectName();
		final String cctFolderPath = pageOne.getCCTPath();
		final String fileName = pageOne.getFileName();
		final String executableName = pageOne.getExecutableName();
		final boolean isBtnRexSelected = pageOne.isBtnRexSelected();
		final boolean isBtnLarkSelected = pageOne.isBtnLarkSelected();
		final boolean isBtnAstSelected = pageOne.isBtnAstSelected();

		IRunnableWithProgress op = new IRunnableWithProgress() {
			public void run(IProgressMonitor monitor) throws InvocationTargetException {
				try {
					doFinish(projectName, cctFolderPath, fileName, executableName, isBtnRexSelected, isBtnLarkSelected,
							isBtnAstSelected, monitor);
				} catch (CoreException e) {
					throw new InvocationTargetException(e);
				} finally {
					monitor.done();
				}
			}
		};
		try {
			getContainer().run(true, false, op);
		} catch (InterruptedException e) {
			return false;
		} catch (InvocationTargetException e) {
			Throwable realException = e.getTargetException();
			MessageDialog.openError(getShell(), "Error", realException.getMessage());
			return false;
		}

		return true;
	}

	/**
	 * The worker method. It will create the new project with its contents.
	 * 
	 * @param projectName
	 * @param fileName
	 * @param isBtnAstSelected
	 * @param isBtnLarkSelected
	 * @param isBtnRexSelected
	 * @param isBtnMakeSelected
	 */
	private void doFinish(final String projectName, final String cctPath, final String fileName,
			final String executableName, boolean isBtnRexSelected, boolean isBtnLarkSelected, boolean isBtnAstSelected,
			IProgressMonitor monitor) throws CoreException {

		// Create files
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		IProject project = root.getProject(projectName);
		if (!project.exists())
			project.create(monitor);
		if (!project.isOpen())
			project.open(monitor);

		IFolder srcFolder = project.getFolder(SRC_FOLDER_NAME);
		if (!srcFolder.exists()) {
			srcFolder.create(IResource.NONE, true, monitor);
			srcFolder.setDerived(true, monitor);
			// create main file
			createFileFromTemplate(srcFolder, "main.c", "/res/main.c", monitor,
					new ReplaceStreamOperation("$NAME$", fileName));
		}

		if (isBtnRexSelected) {
			createFileFromTemplate(srcFolder, fileName + ".scan", "/res/rpptemp.scn", monitor,
					new ReplaceStreamOperation("$NAME$", fileName));
		}

		if (isBtnLarkSelected) {
			createFileFromTemplate(srcFolder, fileName + ".pars", "/res/lpptemp.prs", monitor,
					new ReplaceStreamOperation("$NAME$", fileName));
		}

		if (isBtnAstSelected) {
			createFileFromTemplate(srcFolder, fileName + ".ast", "/res/syntaxtemp.ast", monitor,
					new DefaultStreamOperation());
		}

		if (Activator.getDefault().getPreferenceStore().getBoolean(CCTPreferencePage.CREATEMAKEFLAG)) {
			createMakeFolder(project, cctPath, fileName, executableName, monitor);
		}
	}

	/**
	 * Create a new folder and add the makefile and other related files to it.
	 */
	private void createMakeFolder(IProject project, final String cctPath, final String fileName,
			final String executableName, IProgressMonitor monitor) throws CoreException {
		// Create a folder
		IFolder folder = project.getFolder(BUILD_FOLDER_NAME);
		if (!project.exists())
			project.create(monitor);
		if (!project.isOpen())
			project.open(monitor);
		if (!folder.exists()) {
			folder.create(IResource.NONE, true, monitor);
			folder.setDerived(true, monitor);
		}

		createFileFromTemplate(folder, "Makefile", "/res/Makefile_Template", monitor, new StreamOperation() {
			@Override
			public InputStream operate(InputStream stream) {

			//	String path = cctPath.replaceAll("/", Matcher.quoteReplacement("\\"));
				String path = cctPath;
				Scanner s = new Scanner(stream).useDelimiter("\\A");
				String make = (s.hasNext() ? s.next() : "");
				make = make.replace("$COCKTAIL_PATH$", path);
				make = make.replace("$EXECUTABLE$", executableName);
				make = make.replace("$SCANNER$", fileName);
				make = make.replace("$PARSER$", fileName);
				make = make.replace("$AST$", fileName);
				make = make.replace("$MAINCLASS$", "main");

				return new ByteArrayInputStream(make.getBytes(StandardCharsets.UTF_8));
			}

		});

		createFileFromTemplate(folder, "default_rules.mk", "/res/default_rules.mk", monitor,
				new DefaultStreamOperation());

	}

	/**
	 * Copy a specified resource from the bundle to the given folder.
	 */
	private void createFileFromTemplate(IFolder folder, String name, String resource, IProgressMonitor monitor,
			StreamOperation streamOperation) throws CoreException {
		IFile file = folder.getFile(name);
		if (!file.exists()) {
			Bundle bundle = Platform.getBundle("de.roma.cocktail.assistent");
			try {
				InputStream stream = FileLocator.openStream(bundle, new Path(resource), false);
				file.create(streamOperation.operate(stream), IResource.NONE, monitor);				
				file.setDerived(false, monitor);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	private interface StreamOperation {
		public InputStream operate(InputStream stream);
	}

	// Pass stream through
	private class DefaultStreamOperation implements StreamOperation {
		@Override
		public InputStream operate(InputStream stream) {
			return stream;
		}
	}

	// Simple string replace operation
	private class ReplaceStreamOperation implements StreamOperation {
		private String replace, with;

		public ReplaceStreamOperation(String replace, String with) {
			this.replace = replace;
			this.with = with;
		}

		@Override
		public InputStream operate(InputStream stream) {
			Scanner s = new Scanner(stream).useDelimiter("\\A");
			String content = (s.hasNext() ? s.next() : "");
			content = content.replace(replace, with);
			return new ByteArrayInputStream(content.getBytes(StandardCharsets.UTF_8));
		}
	}

	/**
	 * Accepts the selection in the workbench to use it in the wizard.
	 * 
	 * @see IWorkbenchWizard#init(IWorkbench, IStructuredSelection)
	 */
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.selection = selection;
	}
}