package de.roma.cocktail.assistent.launch;

import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.ui.DebugUITools;
import org.eclipse.debug.ui.ILaunchShortcut;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;

public class LauncherShortcut implements ILaunchShortcut{

	/*see:
	 * http://grepcode.com/file/repository.grepcode.com/java/eclipse.org/3.5.2/org.eclipse.jdt.debug/ui/3.4.1/org/eclipse/jdt/debug/ui/launchConfigurations/JavaLaunchShortcut.java#JavaLaunchShortcut
	 */
	
	
	@Override
	public void launch(ISelection selection, String mode) {
		if(selection instanceof IStructuredSelection)
		{
			Object selected=((IStructuredSelection) selection).getFirstElement();
			System.out.println(selected.getClass());
		}
	}

	@Override
	public void launch(IEditorPart editor, String mode) {
	
		IEditorInput input = editor.getEditorInput();
		System.out.println(input.getName());
		
	}

	
//	private void launch(String mode)
//	{
//		ILaunchConfiguration config=findLaunchConfiguration();
//		if(config==null)
//		{
//			config=createLaunchConfiguration();
//		}
//		if(config!=null)
//		{
//			DebugUITools.launch(config, mode);
//		}
//	}
//	
//	/**
//	 * Sucht existierende Launch Configurations die zu der Auswahl im Editor passt
//	 * 
//	 * @return
//	 */
//	private ILaunchConfiguration findLaunchConfiguration()
//	{
//		
//	}
//	
//	/**
//	 * Erzeugt eine neue Launch Configuration
//	 * 
//	 * @return
//	 */
//	private ILaunchConfiguration createLaunchConfiguration()
//	{
//		
//	}
}
