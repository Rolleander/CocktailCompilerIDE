package de.roma.cocktail.assistent.wizards;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;

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
                    doFinish(projectName, isBtnMakeSelected, isBtnRexSelected, 
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
     * @param isBtnAstSelected 
     * @param isBtnLarkSelected 
     * @param isBtnRexSelected 
     * @param isBtnMakeSelected 
     */
    private void doFinish(String projectName, boolean isBtnMakeSelected, 
    		boolean isBtnRexSelected, boolean isBtnLarkSelected, boolean isBtnAstSelected, 
    		IProgressMonitor monitor) throws CoreException
    {
    	
    	// Create files
        IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
        IProject project  = root.getProject(projectName);
        if (!project.exists()) project.create(null);
        if (!project.isOpen()) project.open(null);
        
        IFolder srcFolder = project.getFolder("src");
        if (!srcFolder.exists()) {
            srcFolder.create(IResource.NONE, true, null);
        	srcFolder.setDerived(true, null);
        }
        
        IFile rexFile = srcFolder.getFile("scanner.rpp");
        if (isBtnRexSelected && !rexFile.exists()) {
            byte[] bytes = "".getBytes();
            InputStream source = new ByteArrayInputStream(bytes);
            rexFile.create(source, IResource.NONE, null);
            rexFile.setDerived(true, null);
        }
        
        IFile parsFile = srcFolder.getFile("parser.lpp");
        if (isBtnLarkSelected && !parsFile.exists()) {
            byte[] bytes = "".getBytes();
            InputStream source = new ByteArrayInputStream(bytes);
            parsFile.create(source, IResource.NONE, null);
            parsFile.setDerived(true, null);
        }
        
        IFile astFile = srcFolder.getFile("syntax.ast");
        if (isBtnAstSelected && !astFile.exists()) {
            byte[] bytes = "".getBytes();
            InputStream source = new ByteArrayInputStream(bytes);
            astFile.create(source, IResource.NONE, null);
            astFile.setDerived(true, null);
        }

        if (isBtnMakeSelected) {
        	createMakeFolder(project);
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
    private void createMakeFolder(IProject project) throws CoreException {
    	//Create a folder
    	IFolder folder = project.getFolder("config");
    	if (!project.exists()) project.create(null);
        if (!project.isOpen()) project.open(null);        
        if (!folder.exists()) {
        	folder.create(IResource.NONE, true, null);
        	folder.setDerived(true, null);
        }
        
        createFileFromTemplate(folder, "common.mk", "/res/common.mk");
        createFileFromTemplate(folder, "config.mk", "/res/config.mk");
        createFileFromTemplate(folder, "Makefile", "/res/Makefile");
        createFileFromTemplate(folder, "README", "/res/README");
        createFileFromTemplate(folder, "util.c", "/res/util.c");
	}
    
    /**
     * Copy a specified resource from the bundle to the given folder.
     */
    private void createFileFromTemplate(IFolder folder, String name, String resource) 
    		throws CoreException{
    	IFile file = folder.getFile(name);
    	
    	Bundle bundle = Platform.getBundle("de.roma.cocktail.assistent");
//    	File f = new File(FileLocator.toFileURL(bundle.getEntry("/templates/README")).toURI()‌​);
		try {
			InputStream stream = FileLocator.openStream(bundle, new Path(resource), false);
			file.create(stream, IResource.NONE, null);
		} catch (IOException e) {
			e.printStackTrace();
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