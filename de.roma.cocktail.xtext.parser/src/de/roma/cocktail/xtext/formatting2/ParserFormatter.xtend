package de.roma.cocktail.xtext.formatting2

import de.roma.cocktail.xtext.parser.ScannerName
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument
import org.eclipse.emf.ecore.EObject

class ParserFormatter extends AbstractFormatter2{
	  
	  
	  
			override protected _format(EObject obj, IFormattableDocument document) {
					println("okkkkkkkkkkkkkkkkkkk")
				super._format(obj, document)
			}
		
	  
	  def dispatch void format (ScannerName name, extension IFormattableDocument document){
	  	name.prepend[setNewLines(0,1,1); noSpace]
	  
	  }
}
