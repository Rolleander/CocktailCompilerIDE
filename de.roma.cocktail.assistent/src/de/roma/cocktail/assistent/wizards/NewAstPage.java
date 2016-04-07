package de.roma.cocktail.assistent.wizards;


import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.jface.dialogs.IDialogPage;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;


/**
 * This wizard page allows setting the input for a new ast-file. 
 */
public class NewAstPage extends WizardPage
{
    private Text folderName, fileName;
    private Button btnTemp;
    private IStructuredSelection selection;

    /**
     * Constructor for NewAstPage.
     * @param selection
     */
    public NewAstPage(IStructuredSelection selection)
    {
        super("NewAstWizardPage");
        setTitle("Ast specification");
        setDescription("Create a new specification for Ast");
        this.selection = selection;
    }

    /**
     * @see IDialogPage#createControl(Composite)
     */
    public void createControl(Composite parent)
    {
        Composite composite = new Composite(parent, SWT.NULL);
        GridLayout layout = new GridLayout();
        layout.marginLeft = 5;
        layout.marginRight = 5;
        layout.marginTop = 5;
        layout.numColumns = 3;
        layout.verticalSpacing = 9;
        composite.setLayout(layout);
        
        createHeader(composite);

        Label separator = new Label(composite, SWT.HORIZONTAL | SWT.SEPARATOR);
        GridData gd = new GridData(GridData.FILL_HORIZONTAL);
        gd.horizontalSpan = 3;
        separator.setLayoutData(gd);

        createBody(composite);
        
        initialize();
        dialogChanged();
        setControl(composite);
    }

	/**
     * Adds a Label with the given lblText to the given composite.
     * @param composite
     * @param lblText
     */
    private void createLabel(Composite composite, String lblText)
    {
        Label label = new Label(composite, SWT.NULL);
        label.setText(lblText);
    }

    /**
     * Adds a the name-labels and textfield to the given composite.
     * @param composite
     */
    private void createHeader(Composite composite)
    {
    	createLabel(composite, "Source folder:");

        folderName = new Text(composite, SWT.BORDER | SWT.SINGLE);
        GridData gd = new GridData(GridData.FILL_HORIZONTAL);
        folderName.setLayoutData(gd);
        folderName.addModifyListener(new ModifyListener()
        {
            @Override
            public void modifyText(ModifyEvent e)
            {
                dialogChanged();
            }
        });
        createLabel(composite, "");
        
        createLabel(composite, "Name:");

        fileName = new Text(composite, SWT.BORDER | SWT.SINGLE);
        fileName.setLayoutData(gd);
        fileName.addModifyListener(new ModifyListener()
        {
            @Override
            public void modifyText(ModifyEvent e)
            {
                dialogChanged();
            }
        });
    }

	/**
     * Adds the checkbox for the templates to the given composite.
     * @param composite
     */
    private void createBody(Composite composite) {
    	GridData gd = new GridData(GridData.FILL_HORIZONTAL);
        gd.horizontalSpan = 3;
        
        btnTemp = new Button(composite, SWT.CHECK);
        btnTemp.setText("Generate with template");
        btnTemp.setSelection(true);
        btnTemp.setLayoutData(gd);
	}
    
    /**
     * Initializes the form and handles the given selection.
     */
    private void initialize()
    {
        //Initialize project or other things in the future
    	Object obj = selection.getFirstElement();
    	if (obj != null && obj instanceof IProject) {
    		String projectName = ((IProject) obj).getName();
    		folderName.setText(projectName + "/src");
		}
    	else if (obj != null && obj instanceof IFolder) {
    		IFolder folder  = (IFolder) obj;
    		folderName.setText(folder.getFullPath().toString().substring(1));
		}
    }

    /**
     * Ensures that all inputs are valid.
     */
    private void dialogChanged()
    { 
    	String msg = null;
    	
    	// Looks for a valid sourceFolder in the folder-Text
    	if (folderName.getText().isEmpty()){
        	msg = "A source folder must be specified";
        }
    	else {
    		String folderText = folderName.getText();
            String projectName = folderText.substring(0, folderText.indexOf("/"));
            IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
            IProject project  = root.getProject(projectName);
        	if (!project.exists()) {
        		msg = "The source folder has to be in an existing project";
        	}
        	else if (!folderName.getText().contains("/")) {
        		msg = "A source folder must be specified";
        	}
        	else if (folderName.getText().substring(folderName.getText().indexOf("/") + 1).isEmpty()) {
        		msg = "A source folder must be specified";
    		}
        	// Looks for a valid name in the name-Text
        	else if (getFileName().isEmpty()) {
            	msg = "Name must be specified";
            }
		}

//        setErrorMessage(msg);
        setMessage(msg);
        setPageComplete(msg == null);
    }

    public String getFileName()
    {
        return fileName.getText();
    }
    
    public IFolder getFolder()
    {
    	String folderText = folderName.getText();
        String projectName = folderText.substring(0, folderText.indexOf("/"));
        IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
        IProject project  = root.getProject(projectName);
        return project.getFolder(folderText.substring(folderText.indexOf("/"))); 
    }
    
	public boolean isBtnTempSelected() {
		return btnTemp.getSelection();
	}
	
}