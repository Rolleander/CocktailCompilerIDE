package de.roma.cocktail.assistent.wizards;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWizard;


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

        IRunnableWithProgress op = new IRunnableWithProgress()
        {
            public void run(IProgressMonitor monitor) throws InvocationTargetException
            {
                try
                {
                    doFinish(projectName, monitor);
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
     */
    private void doFinish(String projectName, IProgressMonitor monitor) throws CoreException
    {
    	
    	// Create files
        IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
        IProject project  = root.getProject(projectName);
        IFolder folder = project.getFolder("src");
        IFile file = folder.getFile("scanner.rex");
        //at this point, no resources have been created
        
        if (!project.exists()) project.create(null);
        if (!project.isOpen()) project.open(null);
        if (!folder.exists()) 
            folder.create(IResource.NONE, true, null);
        if (!file.exists()) {
            byte[] bytes = "".getBytes();
            InputStream source = new ByteArrayInputStream(bytes);
            file.create(source, IResource.NONE, null);
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