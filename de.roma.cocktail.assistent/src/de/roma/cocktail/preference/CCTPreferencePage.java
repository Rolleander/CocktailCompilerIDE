package de.roma.cocktail.preference;

import org.eclipse.jface.preference.BooleanFieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.StringButtonFieldEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

import de.roma.cocktail.assistent.Activator;

public class CCTPreferencePage extends FieldEditorPreferencePage 
	implements IWorkbenchPreferencePage {

	public static String CCTPATHFIELD = "cctPath";
	public static String CREATEFILESFLAG = "createMakefile";
	public static String CREATEMAKEFLAG = "makeCommand";
	
//	Falls die Felder geordnet werden müssen
//	public CCTPreferencePage() {
//		super(GRID);
//	}

	@Override
	protected void createFieldEditors() {
		// Wert lässt sich durch String path = Activator.getDefault().getPreferenceStore()
		//.getString(CCTPreferencePage.CCTPATHFIELD); holen
		addField(new StringButtonFieldEditor(CCTPATHFIELD,
				"Path of the CCT installation:"
				,getFieldEditorParent()) {
			
			@Override
			protected String changePressed() {
				DirectoryDialog dialog = new DirectoryDialog(getShell(), SWT.OPEN);
//				dialog.setFilterExtensions(extensions); 
//				Eventuell alles später hinzufügen
//				dialog.setFileName(string);
				return dialog.open();
			}
		});
		
		addField(new BooleanFieldEditor(CREATEMAKEFLAG, "Create Make folder for new Projects", getFieldEditorParent()));
		
	}
	
	@Override
	public void init(IWorkbench workbench) {
		setPreferenceStore(Activator.getDefault().getPreferenceStore());
	}
}
