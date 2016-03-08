package de.roma.cocktail.assistent.wizards;


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
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;


/**
 * This wizard page allows setting the input for a new compiler project. 
 * The page will only accept valid data.
 */
public class NewWizardPage extends WizardPage
{
    private Text projectName;
    private Button btnMake, btnRex, btnLark, btnAst;

    /**
     * Constructor for NewWizardPage.
     * 
     * @param pageName
     */
    public NewWizardPage(IStructuredSelection selection)
    {
        super("NewWizardPage");
        setTitle("Compiler Project");
        setDescription("Create a new Compiler project");
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
        
        createProjectField(composite);

        Label separator = new Label(composite, SWT.HORIZONTAL | SWT.SEPARATOR);
        GridData gd = new GridData(GridData.FILL_HORIZONTAL);
        gd.horizontalSpan = 3;
        separator.setLayoutData(gd);

        createCheckboxes(composite);
        
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
    private void createProjectField(Composite composite)
    {
        createLabel(composite, "Project name:");

        projectName = new Text(composite, SWT.BORDER | SWT.SINGLE);
        GridData gd = new GridData(GridData.FILL_HORIZONTAL);
        projectName.setLayoutData(gd);
        projectName.addModifyListener(new ModifyListener()
        {
            @Override
            public void modifyText(ModifyEvent e)
            {
                dialogChanged();
            }
        });
    }

	/**
     * Adds the checkboxes for the templates to the given composite.
     * @param composite
     */
    private void createCheckboxes(Composite composite) {
    	GridData gd = new GridData(GridData.FILL_HORIZONTAL);
        gd.horizontalSpan = 3;
        
        btnMake = new Button(composite, SWT.CHECK);
        btnMake.setText("Generate Make-folder");
        btnMake.setSelection(true);
        btnMake.setLayoutData(gd);
        
        Group group = new Group(composite, SWT.SHADOW_ETCHED_IN);
        group.setText("Do you want to generate templates?");
        group.setLayout(new GridLayout(1, false));
        gd = new GridData(GridData.FILL_HORIZONTAL);
        gd.horizontalSpan = 3;
        group.setLayoutData(gd);
        
    	btnRex = new Button(group, SWT.CHECK);
    	btnRex.setText("rpp-file");
    	btnRex.setSelection(true);
        
    	btnLark = new Button(group, SWT.CHECK);
    	btnLark.setText("lpp-file");
    	btnLark.setSelection(true);
    	
    	btnAst = new Button(group, SWT.CHECK);
    	btnAst.setText("ast-file");
    	btnAst.setSelection(true);
	}
    
    /**
     * Initializes the form and handles the given selection.
     */
    private void initialize()
    {
        //Initialize project or other things in the future
//        String projectName = "";
    }

    /**
     * Ensures that all inputs are valid.
     */
    private void dialogChanged()
    { 
    	String msg = null;
        // Looks for a valid name in the projectText
        if (getProjectName().isEmpty())
        {
        	msg = "Project name must be specified";
        }

//        setErrorMessage(msg);
        setMessage(msg);
        setPageComplete(msg == null);
    }

    public String getProjectName()
    {
        return projectName.getText();
    }

	public boolean isBtnMakeSelected() {
		return btnMake.getSelection();
	}

	public boolean isBtnRexSelected() {
		return btnRex.getSelection();
	}

	public boolean isBtnLarkSelected() {
		return btnLark.getSelection();
	}

	public boolean isBtnAstSelected() {
		return btnAst.getSelection();
	}
    
    
}