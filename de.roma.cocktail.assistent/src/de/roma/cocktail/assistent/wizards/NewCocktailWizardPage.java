package de.roma.cocktail.assistent.wizards;

import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.jface.dialogs.IDialogPage;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

import de.roma.cocktail.assistent.Activator;
import de.roma.cocktail.preference.CCTPreferencePage;

/**
 * This wizard page allows setting the input for a new cocktail project. The
 * page will only accept valid data.
 */
public class NewCocktailWizardPage extends WizardPage {
	private Text projectName, cocktailFolder, fileName, exeName;
	private Button btnRex, btnLark, btnAst;

	/**
	 * Constructor for NewCocktailWizardPage.
	 * 
	 * @param pageName
	 */
	public NewCocktailWizardPage(IStructuredSelection selection) {
		super("NewCocktailWizardPage");
		setTitle("Cocktail Project");
		setDescription("Create a new cocktail project");
	}

	/**
	 * @see IDialogPage#createControl(Composite)
	 */
	public void createControl(Composite parent) {
		Composite composite = new Composite(parent, SWT.NULL);
		GridLayout layout = new GridLayout();
		layout.marginLeft = 7;
		layout.marginRight = 7;
		layout.marginTop = 7;
		layout.numColumns = 3;
		layout.verticalSpacing = 9;
		composite.setLayout(layout);

		GridData gd = new GridData(GridData.FILL_HORIZONTAL);
		gd.horizontalSpan = 3;
		createNameField(composite);
		Label separator1 = new Label(composite, SWT.HORIZONTAL | SWT.SEPARATOR);
		separator1.setLayoutData(gd);
		createCocktailField(composite);

		Label separator2 = new Label(composite, SWT.HORIZONTAL | SWT.SEPARATOR);
		separator2.setLayoutData(gd);

		createCheckboxes(composite);

		initialize();
		dialogChanged();
		setControl(composite);
	}

	/**
	 * Adds a Label with the given lblText to the given composite.
	 * 
	 * @param composite
	 * @param lblText
	 */
	private void createLabel(Composite composite, String lblText) {
		Label label = new Label(composite, SWT.NULL);
		label.setText(lblText);
	}

	/**
	 * Adds a the name-labels and textfield to the given composite.
	 * 
	 * @param composite
	 */
	private void createNameField(Composite composite) {
		createLabel(composite, "Project name:");

		projectName = new Text(composite, SWT.BORDER | SWT.SINGLE);
		GridData gd = new GridData(GridData.FILL_HORIZONTAL);
		projectName.setLayoutData(gd);
		projectName.addModifyListener(new ModifyListener() {
			@Override
			public void modifyText(ModifyEvent e) {
				changeTextMessages();
				dialogChanged();
			}

			private void changeTextMessages() {
				String pName = projectName.getText().replaceAll("\\s+","");
				if (!pName.isEmpty()) {
					pName = pName.toLowerCase().charAt(0) + pName.substring(1);
				}
				fileName.setMessage(pName);
				exeName.setMessage(pName);
			}
		});
	}

	/**
	 * Adds a the name-labels and textfield to the given composite.
	 * 
	 * @param composite
	 */
	private void createCocktailField(Composite composite) {
		createLabel(composite, "Path of CCT installation:");

		cocktailFolder = new Text(composite, SWT.BORDER | SWT.SINGLE);
		GridData gd = new GridData(GridData.FILL_HORIZONTAL);
		cocktailFolder.setLayoutData(gd);
		cocktailFolder.addModifyListener(new ModifyListener() {
			@Override
			public void modifyText(ModifyEvent e) {
				dialogChanged();
			}
		});
		GridData btnGD = new GridData();
		btnGD.widthHint = 90;
		Button btnFolder = new Button(composite, SWT.PUSH);
		btnFolder.setText("Browse...");
		btnFolder.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				handleBrowseCCT();
			}
		});
		btnFolder.setLayoutData(btnGD);

	}

	/**
	 * Opens a FileDialog and sets the Text of the Cocktail folder
	 */
	private void handleBrowseCCT() {
		DirectoryDialog dialog = new DirectoryDialog(getShell(), SWT.OPEN);
		String folder = dialog.open();
		if (!folder.isEmpty()) {
			cocktailFolder.setText(folder);
			Activator.getDefault().getPreferenceStore().setValue(CCTPreferencePage.CCTPATHFIELD, folder);
		}
	}

	/**
	 * Adds the checkboxes for the templates to the given composite.
	 * 
	 * @param composite
	 */
	private void createCheckboxes(Composite composite) {
		GridData gd = new GridData(GridData.FILL_HORIZONTAL);
		gd.horizontalSpan = 2;

		Group group = new Group(composite, SWT.SHADOW_ETCHED_IN);
		group.setText("Do you want to generate templates?");
		group.setLayout(new GridLayout(2, false));
		group.setLayoutData(gd);

		createLabel(group, "File name:");

		fileName = new Text(group, SWT.BORDER | SWT.SINGLE);
		GridData gd2 = new GridData(GridData.FILL_HORIZONTAL);
		fileName.setLayoutData(gd2);
		fileName.addModifyListener(new ModifyListener() {
			@Override
			public void modifyText(ModifyEvent e) {
				dialogChanged();
			}
		});

		createLabel(group, "Executable name:      ");

		exeName = new Text(group, SWT.BORDER | SWT.SINGLE);
		exeName.setLayoutData(gd2);
		exeName.addModifyListener(new ModifyListener() {
			@Override
			public void modifyText(ModifyEvent e) {
				dialogChanged();
			}
		});

		gd = new GridData(GridData.FILL_HORIZONTAL);
		gd.horizontalSpan = 2;

		btnRex = new Button(group, SWT.CHECK);
		btnRex.setText("scn-file for rpp");
		btnRex.setSelection(true);
		btnRex.setLayoutData(gd);

		btnLark = new Button(group, SWT.CHECK);
		btnLark.setText("prs-file for lpp");
		btnLark.setSelection(true);
		btnLark.setLayoutData(gd);

		btnAst = new Button(group, SWT.CHECK);
		btnAst.setText("ast-file for ast");
		btnAst.setSelection(true);
		btnAst.setLayoutData(gd);
	}

	/**
	 * Initializes the form and handles the given selection.
	 */
	private void initialize() {
		String path = Activator.getDefault().getPreferenceStore()
				.getString(CCTPreferencePage.CCTPATHFIELD);
		cocktailFolder.setText(path);
	}

	/**
	 * Ensures that all inputs are valid.
	 */
	private void dialogChanged() {
		String msg = null;
		setErrorMessage(null);
		if (getProjectName().isEmpty() || getProjectName().trim().isEmpty()) {
			msg = "Project name must be specified";
		} else {
			IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
			if (root.getProject(getProjectName()).exists()) {
				msg = "A project with that name already exists in the workspace";
				setErrorMessage(msg);
			} else if (getCCTPath().isEmpty() || getCCTPath().trim().isEmpty()) {
				msg = "Path of CCT installation must be specified";
			} else if (getFileName().isEmpty() || getFileName().trim().isEmpty()) {
				msg = "File name must be specified";
			} else if (getExecutableName().isEmpty() || 
					getExecutableName().trim().isEmpty()) {
				msg = "Executable name must be specified";
			}
		}
		
		setMessage(msg);
		setPageComplete(msg == null);
	}

	public String getProjectName() {
		return projectName.getText().trim();
	}

	public String getCCTPath() {
		return cocktailFolder.getText();
	}

	public String getFileName() {
		if (fileName.getText().isEmpty()) {
			return fileName.getMessage();
		}
		return fileName.getText().trim();
	}

	public String getExecutableName() {
		if (exeName.getText().isEmpty()) {
			return exeName.getMessage();
		}
		return exeName.getText().trim();
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