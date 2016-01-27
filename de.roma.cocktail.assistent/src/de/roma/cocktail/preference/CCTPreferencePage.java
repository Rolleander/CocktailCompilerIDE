package de.roma.cocktail.preference;

import org.eclipse.jface.preference.BooleanFieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.StringButtonFieldEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

import de.roma.cocktail.assistent.Activator;

public class CCTPreferencePage extends FieldEditorPreferencePage 
	implements IWorkbenchPreferencePage {

	public static String CCTPATHFIELD = "cctPath";
	public static String CREATEFILESFLAG = "createMakefile";
	
//	Falls die Felder geordnet werden m�ssen
//	public CCTPreferencePage() {
//		super(GRID);
//	}

	@Override
	protected void createFieldEditors() {
		// Wert l�sst sich durch String path = Activator.getDefault().getPreferenceStore()
		//.getString(CCTPreferencePage.CCTPATHFIELD); holen
		addField(new StringButtonFieldEditor(CCTPATHFIELD,
				"Path of the CCT installation:"
				,getFieldEditorParent()) {
			
			@Override
			protected String changePressed() {
				FileDialog dialog = new FileDialog(getShell(), SWT.OPEN);
//				dialog.setFilterExtensions(extensions); 
//				Eventuell alles sp�ter hinzuf�gen
//				dialog.setFileName(string);
				return dialog.open();
			}
		});
		// F�r Sample-Text oder �hnlichem
		addField(new BooleanFieldEditor(CREATEFILESFLAG, "Create Makefile", getFieldEditorParent()));
	}
	
	@Override
	public void init(IWorkbench workbench) {
		setPreferenceStore(Activator.getDefault().getPreferenceStore());
	}
}
