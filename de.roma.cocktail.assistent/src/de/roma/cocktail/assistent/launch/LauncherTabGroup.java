package de.roma.cocktail.assistent.launch;


import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.ui.CommonTab;
import org.eclipse.debug.ui.ILaunchConfigurationDialog;
import org.eclipse.debug.ui.ILaunchConfigurationTab;
import org.eclipse.debug.ui.ILaunchConfigurationTabGroup;

public class LauncherTabGroup implements ILaunchConfigurationTabGroup {

	private ILaunchConfigurationTab[] tabs;
	@Override
	public void createTabs(ILaunchConfigurationDialog dialog, String mode) {
		tabs = new ILaunchConfigurationTab[] {
			    new MainTab(),
				new CommonTab()
		};
	}

	@Override
	public ILaunchConfigurationTab[] getTabs() {
		return tabs;
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
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
	public void launched(ILaunch launch) {
		// TODO Auto-generated method stub
		
	}

}
