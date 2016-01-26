package de.roma.cocktail.preference;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

import de.roma.cocktail.assistent.Activator;

public class CCTPreferenceInitializer extends AbstractPreferenceInitializer {
    
	@Override
    public void initializeDefaultPreferences() {
        IPreferenceStore store = Activator.getDefault().getPreferenceStore();

        //TODO Funktioniert noch nicht
        store.setDefault("cctPath", "einDefaultpfad");
        store.setDefault("useTemplates", true);

//        String userHome = System.getProperty("user.home");
//        String defaultPath = userHome + "\\Local Settings\\Temp\\";
//        store.setDefault(MyPreferencePage.PREF_USER_FILES_DIR, defaultPath);
    }
}
