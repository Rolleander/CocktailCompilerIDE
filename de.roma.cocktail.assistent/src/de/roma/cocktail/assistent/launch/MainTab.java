package de.roma.cocktail.assistent.launch;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.ui.AbstractLaunchConfigurationTab;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;

public class MainTab extends AbstractLaunchConfigurationTab {

	// Project UI widgets
	private Text fProjText, fCmdText, fMakeText;	
	private Button fProjButton,fCopyResourcesCheckbox;
	private WidgetListener fListener = new WidgetListener();
	
	private class WidgetListener implements ModifyListener, SelectionListener {
		public void modifyText(ModifyEvent e) {
			updateLaunchConfigurationDialog();
		}

		public void widgetSelected(SelectionEvent e) {
			Object source = e.getSource();
			if (source == fProjButton) {
				IProject project = chooseProject();
				if (project != null) {
					fProjText.setText(project.getName());
				}
			}
			else
			{
				updateLaunchConfigurationDialog();
			}
		}

		public void widgetDefaultSelected(SelectionEvent e) {
		}
	}

	private IProject getCurrentProject() {
		String project = fProjText.getText().trim();
		if (project.length() < 1) {
			return null;
		}
		return ProjectUtils.getProject(project);
	}

	protected IProject chooseProject() {
		IProject[] projects = ProjectUtils.getProjectList();

		ElementListSelectionDialog dialog = new ElementListSelectionDialog(getShell(), new LabelProvider() {
			@Override
			public String getText(Object element) {
				return ((IProject) element).getName();
			}
		});
		dialog.setTitle("Projects");
		dialog.setMessage("Select a Project");
		dialog.setElements(projects);

		IProject project = getCurrentProject();
		if (project != null) {
			dialog.setInitialSelections(new Object[] { project });
		}
		if (dialog.open() == Window.OK) {
			return (IProject) dialog.getFirstResult();
		}
		return null;
	}

	@Override
	public void createControl(Composite parent) {
		Font font = parent.getFont();
		Composite composite = new Composite(parent, SWT.NULL);
		GridLayout layout = new GridLayout();
		layout.marginLeft = 5;
		layout.marginRight = 5;
		layout.marginTop = 5;
		layout.numColumns = 3;
		layout.verticalSpacing = 9;
		composite.setLayout(layout);

		Label projLabel = new Label(composite, SWT.NONE);
		projLabel.setText("Project:");
		GridData gd = new GridData();
//		gd.horizontalSpan = 3;
//		projLabel.setLayoutData(gd);
//		projLabel.setFont(font);
		fProjText = new Text(composite, SWT.SINGLE | SWT.BORDER);
		gd = new GridData(GridData.FILL_HORIZONTAL);
		fProjText.setLayoutData(gd);
		fProjText.setFont(font);
		fProjText.addModifyListener(fListener);

		fProjButton = createPushButton(composite, "Browse", null);
		fProjButton.addSelectionListener(fListener);

		Label cmdLabel = new Label(composite, SWT.NONE);
		cmdLabel.setText("Shell command:");
//		gd = new GridData();
//		gd.horizontalSpan = 3;
//		cmdLabel.setLayoutData(gd);
		cmdLabel.setFont(font);
		fCmdText = new Text(composite, SWT.SINGLE| SWT.BORDER);
		gd = new GridData(GridData.FILL_HORIZONTAL);
		fCmdText.addModifyListener(fListener);
		fCmdText.setFont(font);
		fCmdText.setLayoutData(gd);
		Label plcLabel = new Label(composite, SWT.NONE);
		
		Label makeLabel = new Label(composite, SWT.NONE);
		makeLabel.setText("Make command:");
//		gd = new GridData();
//		gd.horizontalSpan = 3;
//		makeLabel.setLayoutData(gd);
		makeLabel.setFont(font);
		fMakeText = new Text(composite, SWT.SINGLE| SWT.BORDER);
		gd = new GridData(GridData.FILL_HORIZONTAL);
		fMakeText.addModifyListener(fListener);
		fMakeText.setFont(font);
		fMakeText.setLayoutData(gd);
		Label plcLabel2 = new Label(composite, SWT.NONE);
		
		fCopyResourcesCheckbox = new Button(composite, SWT.CHECK);
		gd = new GridData(GridData.FILL_HORIZONTAL);
		gd.horizontalSpan = 3;
		fCopyResourcesCheckbox.setText("Copy source-files into build folder while building");
		fCopyResourcesCheckbox.setLayoutData(gd);		
		fCopyResourcesCheckbox.addSelectionListener(fListener);
		setControl(composite);
	}

	@Override
	public void setDefaults(ILaunchConfigurationWorkingCopy configuration) {
		configuration.setAttribute(LaunchConfiguration.COCKTAIL_LAUNCHCONFIG_CMD, "bash");
		configuration.setAttribute(LaunchConfiguration.COCKTAIL_LAUNCHCONFIG_MAKE, "make");
		configuration.setAttribute(LaunchConfiguration.COCKTAIL_LAUNCHCONFIG_COPY_RESOURCES, true);
		try {
			configuration.doSave();
		} catch (CoreException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void initializeFrom(ILaunchConfiguration configuration) {
		try {
			String project=configuration.getAttribute(LaunchConfiguration.COCKTAIL_LAUNCHCONFIG_PROJECT, "");
			String cmd=configuration.getAttribute(LaunchConfiguration.COCKTAIL_LAUNCHCONFIG_CMD, "bash");
			String make=configuration.getAttribute(LaunchConfiguration.COCKTAIL_LAUNCHCONFIG_MAKE, "make");		
			boolean copy=configuration.getAttribute(LaunchConfiguration.COCKTAIL_LAUNCHCONFIG_COPY_RESOURCES, true);
			fProjText.setText(project);
			fCmdText.setText(cmd);
			fMakeText.setText(make);			
			fCopyResourcesCheckbox.setEnabled(copy);
		} catch (CoreException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void performApply(ILaunchConfigurationWorkingCopy configuration) {
		configuration.setAttribute(LaunchConfiguration.COCKTAIL_LAUNCHCONFIG_PROJECT, fProjText.getText());
		configuration.setAttribute(LaunchConfiguration.COCKTAIL_LAUNCHCONFIG_CMD, fCmdText.getText());
		configuration.setAttribute(LaunchConfiguration.COCKTAIL_LAUNCHCONFIG_MAKE, fMakeText.getText());	
		configuration.setAttribute(LaunchConfiguration.COCKTAIL_LAUNCHCONFIG_COPY_RESOURCES, fCopyResourcesCheckbox.getSelection());
	}

	@Override
	public String getName() {
		return "Main";
	}

	@Override
	public boolean isValid(ILaunchConfiguration launchConfig) {
		setErrorMessage(null);
		setMessage(null);
		if (getCurrentProject() == null) {
			setErrorMessage("A project folder must be specified");
			return false;
		}
		return true;
	}
}
