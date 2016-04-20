package de.roma.cocktail.assistent.wizards;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.LinkedList;
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


/**
 * This is a wizard for new compiler projects. Its role is to create  
 * a new project with important compiler-files.
 */
public class NewWizard extends Wizard implements INewWizard
{
    private NewWizardPage pageOne;
    private IStructuredSelection selection;

    /**
     * Constructor for ComponentWizard.
     */
    public NewWizard()
    {
        super();
        setWindowTitle("New compiler project");
        setNeedsProgressMonitor(true);
    }
    
    /**
     * Adding the page to the wizard.
     */
    public void addPages()
    {
        pageOne = new NewWizardPage(selection);
        addPage(pageOne);
    }

    /**
     * This method is called when 'Finish' button is pressed in
     * the wizard. It creates an operation and runs it
     * using the wizard as execution context.
     */
    public boolean performFinish()
    {
        final String projectName = pageOne.getProjectName();
        final String cctFolderPath = pageOne.getCCTPath();
        final boolean isBtnMakeSelected  = pageOne.isBtnMakeSelected();
        final boolean isBtnRexSelected  = pageOne.isBtnRexSelected();
        final boolean isBtnLarkSelected  = pageOne.isBtnLarkSelected();
        final boolean isBtnAstSelected  = pageOne.isBtnAstSelected();

        IRunnableWithProgress op = new IRunnableWithProgress()
        {
            public void run(IProgressMonitor monitor) throws InvocationTargetException
            {
                try
                {
                    doFinish(projectName, cctFolderPath, isBtnMakeSelected, isBtnRexSelected, 
                    		isBtnLarkSelected, isBtnAstSelected, monitor);
                }
                catch (CoreException e)
                {
                    throw new InvocationTargetException(e);
                }
                finally
                {
                    monitor.done();
                }
            }
        };
        try
        {
            getContainer().run(true, false, op);
        }
        catch (InterruptedException e)
        {
            return false;
        }
        catch (InvocationTargetException e)
        {
            Throwable realException = e.getTargetException();
            MessageDialog.openError(getShell(), "Error", realException.getMessage());
            return false;
        }
        
        return true;
    }

    /**
     * The worker method. It will create the new project with its contents.
     * @param projectName 
     * @param isBtnAstSelected 
     * @param isBtnLarkSelected 
     * @param isBtnRexSelected 
     * @param isBtnMakeSelected 
     */
    private void doFinish(String projectName, String cctPath, boolean isBtnMakeSelected, 
    		boolean isBtnRexSelected, boolean isBtnLarkSelected, boolean isBtnAstSelected, 
    		IProgressMonitor monitor) throws CoreException
    {
    	
    	// Create files
        IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
        IProject project  = root.getProject(projectName);
        if (!project.exists()) project.create(monitor);
        if (!project.isOpen()) project.open(monitor);
        
        IFolder srcFolder = project.getFolder("src");
        if (!srcFolder.exists()) {
            srcFolder.create(IResource.NONE, true, monitor);
        	srcFolder.setDerived(true, monitor);
        }
        
        if (isBtnRexSelected) {
        	createFileFromTemplate(srcFolder, "scanner.scn", "/res/rpptemp.scn", monitor);
        }
        
        if (isBtnLarkSelected) {
        	createFileFromTemplate(srcFolder, "parser.prs", "/res/lpptemp.prs", monitor);
        }
        
        if (isBtnAstSelected) {
        	createFileFromTemplate(srcFolder, "syntax.ast", "/res/syntaxtemp.ast", monitor);
        }

        if (isBtnMakeSelected) {
        	createMakeFolder(project, cctPath, monitor);
		}
        
//        boolean createMake = Activator.getDefault().getPreferenceStore()
//        		.getBoolean(CCTPreferencePage.CREATEFILESFLAG);
//        if (createMake) {
//            createMakeFolder(project);
//		}
    }

    /**
     * Create a new folder and add the makefile and other related files to it.
     */
    private void createMakeFolder(IProject project, String cctPath, IProgressMonitor monitor) throws CoreException {
    	//Create a folder
    	IFolder folder = project.getFolder("config");
    	if (!project.exists()) project.create(monitor);
        if (!project.isOpen()) project.open(monitor);        
        if (!folder.exists()) {
        	folder.create(IResource.NONE, true, monitor);
        	folder.setDerived(true, monitor);
        }
        
        IFile file = folder.getFile("Makefile");
    	if (!file.exists()) {
	    	Bundle bundle = Platform.getBundle("de.roma.cocktail.assistent");
			try {
				InputStream stream = FileLocator.openStream(bundle, new Path("/res/Makefile"), false);
				String path = cctPath.replaceAll("/", Matcher.quoteReplacement("\\"));
				
				Scanner s = new Scanner(stream).useDelimiter("\\A");
			    String make = (s.hasNext() ? s.next() : "");
			    String replacedMake = make.replace("$REPLACE$", path);
			    InputStream replacedStream = new ByteArrayInputStream(replacedMake.getBytes(StandardCharsets.UTF_8));
			    
				file.create(replacedStream, IResource.NONE, monitor);
				file.setDerived(true, monitor);
			} catch (IOException e) {
				e.printStackTrace();
			}
    	}
    	
        createFileFromTemplate(folder, "default_rules.mk", "/res/default_rules.mk", monitor);
        createFileFromTemplate(folder, "util.c", "/res/util.c", monitor);
	}
    
    /**
     * Copy a specified resource from the bundle to the given folder.
     */
    private void createFileFromTemplate(IFolder folder, String name, String resource, IProgressMonitor monitor) 
    		throws CoreException{
    	IFile file = folder.getFile(name);
    	if (!file.exists()) {
	    	Bundle bundle = Platform.getBundle("de.roma.cocktail.assistent");
			try {
				InputStream stream = FileLocator.openStream(bundle, new Path(resource), false);
				file.create(stream, IResource.NONE, monitor);
				file.setDerived(true, monitor);
			} catch (IOException e) {
				e.printStackTrace();
			}
    	}
    }

	/**
     * Accepts the selection in the workbench to use it in the wizard.
     * @see IWorkbenchWizard#init(IWorkbench, IStructuredSelection)
     */
    public void init(IWorkbench workbench, IStructuredSelection selection)
    {
        this.selection = selection;
    }
}