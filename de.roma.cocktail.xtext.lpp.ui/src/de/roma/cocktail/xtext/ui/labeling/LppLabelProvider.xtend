/*
 * generated by Xtext 2.9.1
 */
package de.roma.cocktail.xtext.ui.labeling

import com.google.inject.Inject
import de.roma.cocktail.xtext.lpp.Begin
import de.roma.cocktail.xtext.lpp.Close
import de.roma.cocktail.xtext.lpp.CodeBlock
import de.roma.cocktail.xtext.lpp.Export
import de.roma.cocktail.xtext.lpp.ExtensionRule
import de.roma.cocktail.xtext.lpp.Extensions
import de.roma.cocktail.xtext.lpp.Global
import de.roma.cocktail.xtext.lpp.GrammarRule
import de.roma.cocktail.xtext.lpp.GrammarRules
import de.roma.cocktail.xtext.lpp.Import
import de.roma.cocktail.xtext.lpp.Local
import de.roma.cocktail.xtext.lpp.Parser
import de.roma.cocktail.xtext.lpp.ParserName
import de.roma.cocktail.xtext.lpp.Precedence
import de.roma.cocktail.xtext.lpp.PrecedenceRow
import de.roma.cocktail.xtext.lpp.RuleBody
import de.roma.cocktail.xtext.lpp.ScannerName
import de.roma.cocktail.xtext.lpp.StartState
import de.roma.cocktail.xtext.lpp.StartSymbols
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider
import org.eclipse.jface.preference.JFacePreferences
import org.eclipse.jface.viewers.StyledString
import org.eclipse.jface.viewers.StyledString.Styler
import org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider

/**
 * Provides labels for EObjects.
 * 
 * See https://www.eclipse.org/Xtext/documentation/304_ide_concepts.html#label-provider
 */
class LppLabelProvider extends DefaultEObjectLabelProvider {

	val Styler styleBlue = StyledString.createColorRegistryStyler(JFacePreferences.ACTIVE_HYPERLINK_COLOR, null);

	@Inject
	new(AdapterFactoryLabelProvider delegate) {
		super(delegate);
	}

	// Labels and icons can be computed like this:
	def image(Parser p) {
		'parser.png'
	}

	def text(Parser p) {
		'Parser'
	}

	def image(Import o) {
		'cog.png'
	}

	def text(Import o) {
		'Import'
	}

	def image(Export o) {
		'cog.png'
	}

	def text(Export o) {
		'Export'
	}

	def image(Global o) {
		'cog.png'
	}

	def text(Global o) {
		'Global'
	}

	def image(Local o) {
		'cog.png'
	}

	def text(Local o) {
		'Local'
	}

	def image(Begin o) {
		'cog.png'
	}

	def text(Begin o) {
		'Begin'
	}

	def image(Close o) {
		'cog.png'
	}

	def text(Close o) {
		'Close'
	}

	def image(Precedence o) {
		'star.png'
	}

	def text(Precedence o) {
		'Precedences'
	}

	def text(StartSymbols o) {
		'Start Symbols'
	}

	def image(StartSymbols o) {
		'control_play.png'
	}

	def image(StartState o) {
		'control_play.png'
	}

	def image(PrecedenceRow o) {
		switch (o.type) {
			case LEFT: 'arrow_left.png'
			case NONE: 'stop.png'
			case RIGHT: 'arrow_right.png'
		}
	}

	def text(PrecedenceRow o) {
		val strings = o.strings
		val name = o.name
		val text = new StyledString
		for (string : strings) {
			text.append(string + " ")
		}
		if (name != null) {
			text.append(name, styleBlue)
		}
		return text
	}

	def image(ScannerName o) {
		'scanner.png'
	}

	def text(ScannerName o) {
		val text = new StyledString
		text.append("Scanner ")
		text.append(o.name, styleBlue)
		return text
	}

	def image(ParserName o) {
		'key.png'
	}

	def text(ParserName o) {
		val text = new StyledString
		text.append("Name ")
		text.append(o.name, styleBlue)
		return text
	}

	def image(GrammarRules o) {
		'rules.png'
	}

	def text(GrammarRules o) {
		'Grammar Rules'
	}

	def image(GrammarRule o) {
		'text_replace.png'
	}

	def text(GrammarRule o) {
		val text = new StyledString
		text.append(o.name.name + " ", styleBlue)
		decorateRuleBody(text, o.body)
		return text
	}

	def decorateRuleBody(StyledString text, RuleBody o) {
		text.append(o.nodetype + " ")
		for (part : o.part) {
			if (part.child != null) {
				val node = part.child
				if (node.selector != null) {
					text.append(node.selector + " ", styleBlue)
					text.append(": ")
				}
				text.append(node.name + " ", styleBlue)
			} else if (part.attribute != null) {
				val att = part.attribute
				text.append("[ ")
				text.append(att.attribute + " ", styleBlue)
				if (att.type != null) {
					text.append(": ")
					text.append(att.type + " ", styleBlue)
				}
				text.append("] ")
			}
		}
		if (o.token != null) {
			text.append("PREC ")
			text.append(o.token.name + " ", styleBlue)
		}
	}

	def image(ExtensionRule o) {
		'text_replace.png'
	}

	def text(ExtensionRule o) {
		val text = new StyledString
		if (o.name != null) {
			text.append(o.name.name + " ", styleBlue)
		}
		decorateRuleBody(text, o.body)
		return text
	}

	def image(Extensions o) {
		'page_white_stack.png'
	}

	def text(Extensions o) {
		"Extensions"
	}

	def text(CodeBlock o) {
		"Code Block"
	}

	def image(CodeBlock o) {
		"cog.png"
	}

}
