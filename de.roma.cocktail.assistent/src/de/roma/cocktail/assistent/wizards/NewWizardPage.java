package de.roma.cocktail.assistent.wizards;


import org.eclipse.jface.dialogs.IDialogPage;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;


/**
 * The "New Component" wizard page allows setting the input for the new Component. 
 * The page will only accept valid data.
 */
public class NewWizardPage extends WizardPage
{
    private Text projectText;

    /**
     * Constructor for NewWizardPage.
     * 
     * @param pageName
     */
    public NewWizardPage(IStructuredSelection selection)
    {
        super("NewWizardPage");
        setTitle("Compiler");
        setDescription("Create a new Compiler");
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

//        Label separator = new Label(composite, SWT.HORIZONTAL | SWT.SEPARATOR);
//        GridData gd = new GridData(GridData.FILL_HORIZONTAL);
//        gd = new GridData(GridData.FILL_HORIZONTAL);
//        gd.horizontalSpan = 3;
//        separator.setLayoutData(gd);


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
     * Adds a the labels, textfields and Browse-Buttons for the Base-Configuration 
     * to the given composite.
     * @param composite
     */
    private void createProjectField(Composite composite)
    {
        createLabel(composite, "Project name:");

        projectText = new Text(composite, SWT.BORDER | SWT.SINGLE);
        GridData gd = new GridData(GridData.FILL_HORIZONTAL);
        projectText.setLayoutData(gd);
        projectText.addModifyListener(new ModifyListener()
        {
            @Override
            public void modifyText(ModifyEvent e)
            {
                dialogChanged();
            }
        });
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
        // Looks for a valid project in the projectText
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
        return projectText.getText();
    }
}