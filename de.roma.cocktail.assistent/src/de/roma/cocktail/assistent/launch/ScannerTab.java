package de.roma.cocktail.assistent.launch;

import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.ui.AbstractLaunchConfigurationTab;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

public class ScannerTab extends AbstractLaunchConfigurationTab{

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
		
		Label l=new Label(composite, SWT.NULL);
		l.setText("Scanner Settings");
        setControl(composite);

	}

	@Override
	public void setDefaults(ILaunchConfigurationWorkingCopy configuration) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void initializeFrom(ILaunchConfiguration configuration) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void performApply(ILaunchConfigurationWorkingCopy configuration) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Scanner";
	}

}
