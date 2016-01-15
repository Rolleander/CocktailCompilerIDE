package de.roma.cocktail.preference;

import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.StringButtonFieldEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

import de.roma.cocktail.assistent.Activator;

public class CCTPreferencePage extends FieldEditorPreferencePage 
	implements IWorkbenchPreferencePage {

	protected void createFieldEditors() {
		addField(new StringButtonFieldEditor("cctPath",
				"Path of the CCT installation:"
				,getFieldEditorParent()) {
			
			@Override
			protected String changePressed() {
				FileDialog dialog = new FileDialog(getShell(), SWT.OPEN);
//				dialog.setFilterExtensions(extensions); 
//				Eventuell alles später hinzufügen
//				dialog.setFileName(string);
				return dialog.open();
			}
		});
	}
	
	public void init(IWorkbench workbench) {
		setPreferenceStore(
				Activator.getDefault().getPreferenceStore());
	}
}
