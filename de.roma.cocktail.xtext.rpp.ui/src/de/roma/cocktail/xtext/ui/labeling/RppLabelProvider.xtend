/*
 * generated by Xtext 2.9.1
 */
package de.roma.cocktail.xtext.ui.labeling

import com.google.inject.Inject
import de.roma.cocktail.xtext.rpp.Begin
import de.roma.cocktail.xtext.rpp.Close
import de.roma.cocktail.xtext.rpp.Default
import de.roma.cocktail.xtext.rpp.Define
import de.roma.cocktail.xtext.rpp.DefineRule
import de.roma.cocktail.xtext.rpp.Eof
import de.roma.cocktail.xtext.rpp.Export
import de.roma.cocktail.xtext.rpp.Global
import de.roma.cocktail.xtext.rpp.Import
import de.roma.cocktail.xtext.rpp.Local
import de.roma.cocktail.xtext.rpp.Model
import de.roma.cocktail.xtext.rpp.Rule
import de.roma.cocktail.xtext.rpp.Scanner
import de.roma.cocktail.xtext.rpp.SingleRule
import de.roma.cocktail.xtext.rpp.StartState
import de.roma.cocktail.xtext.rpp.StartStates
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider
import org.eclipse.jface.preference.JFacePreferences
import org.eclipse.jface.viewers.StyledString
import org.eclipse.jface.viewers.StyledString.Styler
import org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider
import de.roma.cocktail.xtext.rpp.RuleInsert
import de.roma.cocktail.xtext.rpp.RuleStart
import de.roma.cocktail.xtext.rpp.CodeBlock

/**
 * Provides labels for EObjects.
 * 
 * See https://www.eclipse.org/Xtext/documentation/304_ide_concepts.html#label-provider
 */
class RppLabelProvider extends DefaultEObjectLabelProvider {

	val Styler styleBlue = StyledString.createColorRegistryStyler(JFacePreferences.ACTIVE_HYPERLINK_COLOR, null);
	val Styler styleTwo = StyledString.createColorRegistryStyler(JFacePreferences.COUNTER_COLOR, null);

	@Inject
	new(AdapterFactoryLabelProvider delegate) {
		super(delegate);
	}

	def image(SingleRule rule) {
		'page.png'
	}

	def text(StartStates s) {
		'Start States'
	}

	def image(StartStates s) {
		'control_play.png'
	}

	def text(Begin begin) {
		'Begin'
	}

	def image(Begin begin) {
		'cog.png'
	}

	def text(Close close) {
		'Close'
	}

	def image(Close close) {
		'cog.png'
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

	def text(Import export) {
		'Import'
	}

	def image(Import export) {
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

	def text(RuleInsert ele) {
		'Inserted Rules'
	}

	def image(RuleInsert ele) {
		'rules.png'
	}

	def text(Rule ele) {
		'Rules'
	}

	def image(Rule ele) {
		'rules.png'
	}

	def text(Scanner ele) {
		"Name: " + ele.getName()
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
		val text = new StyledString
		text.append(ele.getName(), styleBlue)
		text.append(" = " + ele.getRule())
		return text;
	}

	def image(StartState o) {
		'control_play.png'
	}

	def image(DefineRule o) {
		'blank_report.png'
	}

	def createRuleStartText(StyledString text, RuleStart begin) {
		val prec = begin.rulePrec
		val states = begin.ruleStates
		val deff = begin.ruleDefault
		if (prec != null) {
			text.append(prec + " ", styleTwo)
		}
		text.append("#")
		val size = states.size
		if (states != null && size > 0) {
			var count = 0;
			for (s : states) {
				count++;
				text.append(s.name, styleBlue)
				if (count < size) {
					text.append(",")
				}
			}
		} else {
			text.append(deff, styleBlue)
		}
		text.append("#")
	}

	def text(RuleStart o) {
		var text = new StyledString
		createRuleStartText(text, o)
	}

	def image(RuleStart o) {
		'control_play.png'
	}

	def text(CodeBlock o) {
		'Target Code'
	}
	
	
	def image(CodeBlock o) {
		'cog.png'
	}

	def text(SingleRule o) {
		var text = new StyledString
		val begin = o.start
		if (begin != null) {
			createRuleStartText(text, begin)
		}
		text.append(" : ")
		val content = o.rule
		val parts = content.parts
		for (p : parts) {
			if (p.ref != null) {
				text.append(p.ref.name, styleBlue)
			} else {
				text.append(p.reg)
			}
		}
		return text;
	}

/*	 	 
 *   	 def image( o)
 *  	{
 *   '.png'
 *   	}
 *   	
 *   	def text( o)
 *   	{
 *   ''
 *   	} 
 *    
 */
}
