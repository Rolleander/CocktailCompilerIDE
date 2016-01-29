package de.roma.cocktail.assistent.launch;

import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.ui.AbstractLaunchConfigurationTab;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

public class MainTab extends AbstractLaunchConfigurationTab {

	
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
        label.setText("Resource Folder:");
        
        sourcePath=new Text(composite, SWT.NULL);
        sourcePath.setText("C:\\Program Files (x86)\\Example");     
        
        setControl(composite);
	}
	

	@Override
	public void setDefaults(ILaunchConfigurationWorkingCopy configuration) {

	}

	@Override
	public void initializeFrom(ILaunchConfiguration configuration) {

	}

	@Override
	public void performApply(ILaunchConfigurationWorkingCopy configuration) {

	}

	@Override
	public String getName() {
		return "Main";
	}

}
