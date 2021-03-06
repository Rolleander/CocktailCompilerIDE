/*
 * generated by Xtext 2.9.2
 */
package de.roma.cocktail.xtext.ui;

import com.google.inject.Injector;
import de.roma.cocktail.xtext.rpp.ui.internal.RppActivator;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class RppExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return RppActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return RppActivator.getInstance().getInjector(RppActivator.DE_ROMA_COCKTAIL_XTEXT_RPP);
	}
	
}
