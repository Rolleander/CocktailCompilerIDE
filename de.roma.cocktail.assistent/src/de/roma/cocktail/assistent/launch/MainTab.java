package de.roma.cocktail.assistent.launch;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.ui.AbstractLaunchConfigurationTab;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

public class MainTab extends AbstractLaunchConfigurationTab {

	public static final String CONFIG = "configFolder";
	
	private Text sourcePath;
	
	@Override
	public void createControl(Composite parent) {

		Composite composite = new Composite(parent, SWT.NULL);		  
		GridLayout layout = new GridLayout();
		layout.marginLeft = 5;
		layout.marginRight = 5;
		layout.marginTop = 5;
		layout.numColumns = 3;
		layout.verticalSpacing = 9;
		composite.setLayout(layout);
		
	    Label label = new Label(composite, SWT.NULL);
        label.setText("Config Folder:");
        
        sourcePath = new Text(composite, SWT.SINGLE | SWT.BORDER);
        sourcePath.addModifyListener(new ModifyListener() {
			
			@Override
			public void modifyText(ModifyEvent arg0) {
				updateLaunchConfigurationDialog();
			}
		});
        GridData gd = new GridData(GridData.FILL_HORIZONTAL);
        sourcePath.setLayoutData(gd);

        setControl(composite);
	}
	

	@Override
	public void setDefaults(ILaunchConfigurationWorkingCopy configuration) {
	}

	@Override
	public void initializeFrom(ILaunchConfiguration configuration) {
		System.out.println("initializeFrom");
		try {
			sourcePath.setText(configuration.getAttribute(MainTab.CONFIG, "/CocktailProject/config"));
		} catch (CoreException e) {
			sourcePath.setText("/CocktailProject/config");
		}
	}

	@Override
	public void performApply(ILaunchConfigurationWorkingCopy configuration) {
		configuration.setAttribute(MainTab.CONFIG, sourcePath.getText());
		System.out.println("performApply");
		try {
			configuration.doSave();
		} catch (CoreException e) {
			e.printStackTrace();
		}
	}

	@Override
	public String getName() {
		return "Main";
	}
	
	@Override
	public boolean isValid(ILaunchConfiguration launchConfig) {
		setErrorMessage(null);
		setMessage(null);
		if (sourcePath.getText().equals("")) {
			setErrorMessage("A config folder must be specified");
			return false;
		}
		return true;
	}
}
