package de.roma.cocktail.assistent.wizards;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
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
public class NewRPPWizard extends Wizard implements INewWizard
{
    private NewRPPPage pageOne;
    private IStructuredSelection selection;

    /**
     * Constructor for ComponentWizard.
     */
    public NewRPPWizard()
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
        pageOne = new NewRPPPage(selection);
        addPage(pageOne);
    }

    /**
     * This method is called when 'Finish' button is pressed in
     * the wizard. It creates an operation and runs it
     * using the wizard as execution context.
     */
    public boolean performFinish()
    {
    	final IFolder folder = pageOne.getFolder();
        final String fileName = pageOne.getFileName();
        final boolean isBtnTempSelected  = pageOne.isBtnTempSelected();

        IRunnableWithProgress op = new IRunnableWithProgress()
        {
            public void run(IProgressMonitor monitor) throws InvocationTargetException
            {
                try
                {
                    doFinish(folder, fileName, isBtnTempSelected, monitor);
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
     * @param folder 
     * @param projectNames 
     * @param isBtnTempSelected 
     */
    private void doFinish(IFolder folder, String fileName, boolean isBtnTempSelected, 
    		IProgressMonitor monitor) throws CoreException
    {
        IProject project = folder.getProject();
        if (!project.isOpen()) project.open(monitor);

		if (!folder.exists()) {
		    folder.create(IResource.NONE, true, monitor);
			folder.setDerived(true, monitor);
		}
		IFile rexFile = folder.getFile(fileName + ".rpp");
		if (!rexFile.exists()) {
			if (!isBtnTempSelected) {
		        byte[] bytes = "".getBytes();
		        InputStream source = new ByteArrayInputStream(bytes);
		        rexFile.create(source, IResource.NONE, monitor);
		        rexFile.setDerived(true, null);
		    }
			else {
				createFileFromTemplate(rexFile, "/res/rpptemp.rpp", monitor);
			}
		}
		project.refreshLocal(IResource.DEPTH_INFINITE, monitor);
    }
    
    /**
     * Copy a specified resource from the bundle to the given folder.
     */
    private void createFileFromTemplate(IFile file, String resource, IProgressMonitor monitor) 
    		throws CoreException{
    	
    	Bundle bundle = Platform.getBundle("de.roma.cocktail.assistent");
		try {
			InputStream stream = FileLocator.openStream(bundle, new Path(resource), false);
			file.create(stream, IResource.NONE, monitor);
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