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
 * This is a wizard for new parser specifications in a lpp-file. Its role is to create  
 * a new file with or without a template.
 */
public class NewLPPWizard extends Wizard implements INewWizard
{
    private NewLPPPage pageOne;
    private IStructuredSelection selection;

    /**
     * Constructor for NewLPPWizard.
     */
    public NewLPPWizard()
    {
        super();
        setWindowTitle("New parser specification");
        setNeedsProgressMonitor(true);
    }
    
    /**
     * Adding the page to the wizard.
     */
    public void addPages()
    {
        pageOne = new NewLPPPage(selection);
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
        final boolean isBtnPreSelected  = pageOne.isBtnPreSelected();

        IRunnableWithProgress op = new IRunnableWithProgress()
        {
            public void run(IProgressMonitor monitor) throws InvocationTargetException
            {
                try
                {
                    doFinish(folder, fileName, isBtnPreSelected, isBtnTempSelected, monitor);
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
     * The worker method. It will create a new file.
     * @param folder 
     * @param fileName
     * @param isBtnPreSelected
     * @param isBtnTempSelected 
     * @param monitor
     */
    private void doFinish(IFolder folder, String fileName, boolean isBtnPreSelected, 
    		boolean isBtnTempSelected, IProgressMonitor monitor) throws CoreException
    {
        IProject project = folder.getProject();
        if (!project.isOpen()) project.open(monitor);

		if (!folder.exists()) {
		    folder.create(IResource.NONE, true, monitor);
			folder.setDerived(true, monitor);
		}
		
		if (isBtnPreSelected) {
			IFile larkFile = folder.getFile(fileName + ".prs");
			if (!larkFile.exists()) {
				if (!isBtnTempSelected) {
			        byte[] bytes = "".getBytes();
			        InputStream source = new ByteArrayInputStream(bytes);
			        larkFile.create(source, IResource.NONE, monitor);
			        larkFile.setDerived(true, monitor);
			    }
				else {
					createFileFromTemplate(larkFile, "/res/lpptemp.prs", monitor);
				}
			}
		}
		else {
			IFile rexFile = folder.getFile(fileName + ".lrk");
			if (!rexFile.exists()) {
				if (!isBtnTempSelected) {
			        byte[] bytes = "".getBytes();
			        InputStream source = new ByteArrayInputStream(bytes);
			        rexFile.create(source, IResource.NONE, monitor);
			        rexFile.setDerived(true, monitor);
			    }
				else {
					createFileFromTemplate(rexFile, "/res/larktemp.lrk", monitor);
				}
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
			file.setDerived(false, monitor);
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