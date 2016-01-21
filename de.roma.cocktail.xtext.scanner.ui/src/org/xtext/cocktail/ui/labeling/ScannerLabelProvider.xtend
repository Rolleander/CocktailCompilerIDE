/*
 * generated by Xtext 2.9.1
 */
package org.xtext.cocktail.ui.labeling

import com.google.inject.Inject
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider
import org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider
import org.xtext.cocktail.scanner.Define
import org.xtext.cocktail.scanner.DefineRule
import org.xtext.cocktail.scanner.Model
import org.xtext.cocktail.scanner.Rule
import org.xtext.cocktail.scanner.Scanner
import org.xtext.cocktail.scanner.Local
import org.xtext.cocktail.scanner.Export
import org.xtext.cocktail.scanner.Default
import org.xtext.cocktail.scanner.Eof
import org.xtext.cocktail.scanner.Global
import org.xtext.cocktail.scanner.StartStates
import org.xtext.cocktail.scanner.SingleRule

/**
 * Provides labels for EObjects.
 * 
 * See https://www.eclipse.org/Xtext/documentation/304_ide_concepts.html#label-provider
 */
class ScannerLabelProvider extends DefaultEObjectLabelProvider {

	@Inject
	new(AdapterFactoryLabelProvider delegate) {
		super(delegate);
	}

	def text(SingleRule rule)
	{
		rule.getRule()
	}
	
	def image(SingleRule rule)
	{
		'page.png'
	}

	def text(StartStates s)
	{
		'Start States'
	}
	
	def image(StartStates s){
		'control_play.png'
	}

	def text(Default deff) {
		'Default'
	}

	def image(Default deff) {
		'cog.png'
	}

	def text(Eof eof) {
		'End of File'
	}

	def image(Eof eof) {
		'cog.png'
	}

	def text(Export export) {
		'Export'
	}

	def image(Export export) {
		'cog.png'
	}

	def text(Local local) {
		'Local'
	}

	def image(Local local) {
		'cog.png'
	}

	def text(Global global) {
		'Global'
	}

	def image(Global global) {
		'cog.png'
	}

	def text(Model ele) {
		'Scanner'
	}

	def image(Model ele) {
		'barcode.png'
	}

	def text(Rule ele) {
		'Rules'
	}

	def image(Rule ele) {
		'rules.png'
	}

	def text(Scanner ele) {
		ele.getName()
	}

	def image(Scanner ele) {
		'key.png'
	}

	def text(Define ele) {
		'Defined Keywords'
	}

	def image(Define ele) {
		'three_tags.png'
	}

	def text(DefineRule ele) {
		ele.getName() + " = " + ele.getRule()
	}

}
