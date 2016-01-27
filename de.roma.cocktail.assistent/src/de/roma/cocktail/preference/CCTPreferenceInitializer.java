package de.roma.cocktail.preference;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

import de.roma.cocktail.assistent.Activator;

public class CCTPreferenceInitializer extends AbstractPreferenceInitializer {
    
	@Override
    public void initializeDefaultPreferences() {
        IPreferenceStore store = Activator.getDefault().getPreferenceStore();

        store.setDefault(CCTPreferencePage.CCTPATHFIELD, "");
        store.setDefault(CCTPreferencePage.CREATEFILESFLAG, true);

    }
}
