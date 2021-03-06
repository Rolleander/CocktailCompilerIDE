/*
 * generated by Xtext 2.9.1
 */
package de.roma.cocktail.xtext.ui.outline

import de.roma.cocktail.xtext.parser.Begin
import de.roma.cocktail.xtext.parser.Close
import de.roma.cocktail.xtext.parser.DefinedToken
import de.roma.cocktail.xtext.parser.Export
import de.roma.cocktail.xtext.parser.Global
import de.roma.cocktail.xtext.parser.Import
import de.roma.cocktail.xtext.parser.Local
import de.roma.cocktail.xtext.parser.ParserName
import de.roma.cocktail.xtext.parser.PrecedenceRow
import de.roma.cocktail.xtext.parser.RuleBody
import de.roma.cocktail.xtext.parser.ScannerName
import de.roma.cocktail.xtext.parser.StartState
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.ui.editor.outline.impl.DefaultOutlineTreeProvider

/**
 * Customization of the default outline structure.
 * 
 * See https://www.eclipse.org/Xtext/documentation/304_ide_concepts.html#outline
 */
class ParserOutlineTreeProvider extends DefaultOutlineTreeProvider {

	override protected _isLeaf(EObject o) {

		if(o instanceof RuleBody){return true}
		if(o instanceof ParserName){return true}
		if(o instanceof ScannerName){return true}
		if(o instanceof DefinedToken){return true}
		if(o instanceof Local){return true}
		if(o instanceof Export){return true}
		if(o instanceof Import){return true}
		if(o instanceof Global){return true}
		if(o instanceof Begin){return true}
		if(o instanceof Close){return true}
		if(o instanceof PrecedenceRow){return true}
		if (o instanceof StartState) {
			return true
		}
	//  if(o instanceof ){return true}
			
	}

}
