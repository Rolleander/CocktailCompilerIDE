/*
 * generated by Xtext 2.9.1
 */
package org.xtext.cocktail.ui

import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor
import com.google.inject.Binder
import org.xtext.cocktail.ui.syntaxcoloring.ScannerTokenMapper
import org.eclipse.xtext.ui.editor.syntaxcoloring.AbstractAntlrTokenToAttributeIdMapper

/**
 * Use this class to register components to be used within the Eclipse IDE.
 */
@FinalFieldsConstructor
class ScannerUiModule extends AbstractScannerUiModule {
	
	override configure(Binder binder) {
		super.configure(binder)
		binder.bind(AbstractAntlrTokenToAttributeIdMapper).to(ScannerTokenMapper)
	}
	
}