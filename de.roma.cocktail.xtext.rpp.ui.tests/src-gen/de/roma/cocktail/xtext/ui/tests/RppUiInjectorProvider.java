/*
 * generated by Xtext 2.9.1
 */
package de.roma.cocktail.xtext.ui.tests;

import com.google.inject.Injector;
import de.roma.cocktail.xtext.rpp.ui.internal.RppActivator;
import org.eclipse.xtext.junit4.IInjectorProvider;

public class RppUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return RppActivator.getInstance().getInjector("de.roma.cocktail.xtext.Rpp");
	}

}
