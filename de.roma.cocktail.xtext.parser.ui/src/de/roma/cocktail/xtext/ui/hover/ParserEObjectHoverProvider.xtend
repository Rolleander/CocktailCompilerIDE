package de.roma.cocktail.xtext.ui.hover

import org.eclipse.xtext.ui.editor.hover.html.DefaultEObjectHoverProvider
import org.eclipse.emf.ecore.EObject
import de.roma.cocktail.xtext.parser.ScannerName
import de.roma.cocktail.xtext.parser.ParserName
import de.roma.cocktail.xtext.parser.DefinedToken
import de.roma.cocktail.xtext.parser.StartState
import de.roma.cocktail.xtext.parser.GrammarRule

class ParserEObjectHoverProvider extends DefaultEObjectHoverProvider {

	override protected getFirstLine(EObject o) {

		if (o instanceof ScannerName) {
			return "Used scanner: <b>" + o.name + "</b>"
		}
		if (o instanceof ParserName) {
			return "This Parser's name: <b>" + o.name + "</b>"
		}
		if (o instanceof DefinedToken) {
			return "Token: <b>" + o.name + "</b> <br>Value: <b>" + o.number + "</b>"
		}
		if (o instanceof StartState) {
			return "StartState: <b>" + o.name + "</b>"
		}
		if (o instanceof GrammarRule) {
			var text=""
			val bodies = o.body
			text+="Grammar Rule: <b>"+o.name+"</b> <br>"
			text+="<br> <ul>"
			for (body : bodies) {
				text+="<li>"
				val part = body.part
				val contents = part.content				
				for (c : contents) {
					val reg = c.regex
					val ref = c.ref
					if (reg != null) {
						text+=reg + " "
					}
					if (ref != null) {
						text+="<b>"+ref.name + "</b> "
					}
				}
				text+="</li>"
			}
			text+="</ul>"
			return text
		}

		super.getFirstLine(o)
	}

}
