/*
 * generated by Xtext 2.9.1
 */
package de.roma.cocktail.xtext


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class RppStandaloneSetup extends RppStandaloneSetupGenerated {

	def static void doSetup() {
		new RppStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}