/*
 * generated by Xtext
 */
package org.xtext.cocktail.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import org.xtext.cocktail.services.ScannerGrammarAccess;

public class ScannerParser extends AbstractContentAssistParser {
	
	@Inject
	private ScannerGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected org.xtext.cocktail.ui.contentassist.antlr.internal.InternalScannerParser createParser() {
		org.xtext.cocktail.ui.contentassist.antlr.internal.InternalScannerParser result = new org.xtext.cocktail.ui.contentassist.antlr.internal.InternalScannerParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getSingleRuleAccess().getAlternatives_1(), "rule__SingleRule__Alternatives_1");
					put(grammarAccess.getAtomicExpressionAccess().getAlternatives(), "rule__AtomicExpression__Alternatives");
					put(grammarAccess.getModelAccess().getGroup(), "rule__Model__Group__0");
					put(grammarAccess.getTitleAccess().getGroup(), "rule__Title__Group__0");
					put(grammarAccess.getExportAccess().getGroup(), "rule__Export__Group__0");
					put(grammarAccess.getGlobalAccess().getGroup(), "rule__Global__Group__0");
					put(grammarAccess.getLocalAccess().getGroup(), "rule__Local__Group__0");
					put(grammarAccess.getDefaultAccess().getGroup(), "rule__Default__Group__0");
					put(grammarAccess.getEofAccess().getGroup(), "rule__Eof__Group__0");
					put(grammarAccess.getDefineAccess().getGroup(), "rule__Define__Group__0");
					put(grammarAccess.getDefineRuleAccess().getGroup(), "rule__DefineRule__Group__0");
					put(grammarAccess.getStartStatesAccess().getGroup(), "rule__StartStates__Group__0");
					put(grammarAccess.getStartStatesAccess().getGroup_2(), "rule__StartStates__Group_2__0");
					put(grammarAccess.getRuleAccess().getGroup(), "rule__Rule__Group__0");
					put(grammarAccess.getSingleRuleAccess().getGroup(), "rule__SingleRule__Group__0");
					put(grammarAccess.getOrExpressionAccess().getGroup(), "rule__OrExpression__Group__0");
					put(grammarAccess.getOrExpressionAccess().getGroup_1(), "rule__OrExpression__Group_1__0");
					put(grammarAccess.getSequenceExpressionAccess().getGroup(), "rule__SequenceExpression__Group__0");
					put(grammarAccess.getSequenceExpressionAccess().getGroup_1(), "rule__SequenceExpression__Group_1__0");
					put(grammarAccess.getHighBindExpressionAccess().getGroup(), "rule__HighBindExpression__Group__0");
					put(grammarAccess.getHighBindExpressionAccess().getGroup_1(), "rule__HighBindExpression__Group_1__0");
					put(grammarAccess.getBracedExpressionAccess().getGroup(), "rule__BracedExpression__Group__0");
					put(grammarAccess.getModelAccess().getScannerAssignment_0(), "rule__Model__ScannerAssignment_0");
					put(grammarAccess.getModelAccess().getScannerAssignment_1(), "rule__Model__ScannerAssignment_1");
					put(grammarAccess.getModelAccess().getScannerAssignment_2(), "rule__Model__ScannerAssignment_2");
					put(grammarAccess.getModelAccess().getScannerAssignment_3(), "rule__Model__ScannerAssignment_3");
					put(grammarAccess.getModelAccess().getScannerAssignment_4(), "rule__Model__ScannerAssignment_4");
					put(grammarAccess.getModelAccess().getScannerAssignment_5(), "rule__Model__ScannerAssignment_5");
					put(grammarAccess.getModelAccess().getScannerAssignment_6(), "rule__Model__ScannerAssignment_6");
					put(grammarAccess.getModelAccess().getScannerAssignment_7(), "rule__Model__ScannerAssignment_7");
					put(grammarAccess.getModelAccess().getScannerAssignment_8(), "rule__Model__ScannerAssignment_8");
					put(grammarAccess.getTitleAccess().getNameAssignment_1(), "rule__Title__NameAssignment_1");
					put(grammarAccess.getExportAccess().getContentAssignment_1(), "rule__Export__ContentAssignment_1");
					put(grammarAccess.getGlobalAccess().getContentAssignment_1(), "rule__Global__ContentAssignment_1");
					put(grammarAccess.getLocalAccess().getContentAssignment_1(), "rule__Local__ContentAssignment_1");
					put(grammarAccess.getDefaultAccess().getContentAssignment_1(), "rule__Default__ContentAssignment_1");
					put(grammarAccess.getEofAccess().getContentAssignment_1(), "rule__Eof__ContentAssignment_1");
					put(grammarAccess.getDefineAccess().getDefinesAssignment_1(), "rule__Define__DefinesAssignment_1");
					put(grammarAccess.getDefineRuleAccess().getDefineNameAssignment_0(), "rule__DefineRule__DefineNameAssignment_0");
					put(grammarAccess.getDefineRuleAccess().getDefineRuleAssignment_2(), "rule__DefineRule__DefineRuleAssignment_2");
					put(grammarAccess.getStartStatesAccess().getStatesAssignment_1(), "rule__StartStates__StatesAssignment_1");
					put(grammarAccess.getStartStatesAccess().getStatesAssignment_2_1(), "rule__StartStates__StatesAssignment_2_1");
					put(grammarAccess.getStartStateAccess().getNameAssignment(), "rule__StartState__NameAssignment");
					put(grammarAccess.getRuleAccess().getContentAssignment_1(), "rule__Rule__ContentAssignment_1");
					put(grammarAccess.getSingleRuleAccess().getStateAssignment_1_0(), "rule__SingleRule__StateAssignment_1_0");
					put(grammarAccess.getSingleRuleAccess().getRegexAssignment_3(), "rule__SingleRule__RegexAssignment_3");
					put(grammarAccess.getOrExpressionAccess().getRightAssignment_1_2(), "rule__OrExpression__RightAssignment_1_2");
					put(grammarAccess.getSequenceExpressionAccess().getRightAssignment_1_1(), "rule__SequenceExpression__RightAssignment_1_1");
					put(grammarAccess.getBracedExpressionAccess().getInnerExpressionAssignment_1(), "rule__BracedExpression__InnerExpressionAssignment_1");
					put(grammarAccess.getAtomAccess().getValueAssignment(), "rule__Atom__ValueAssignment");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			org.xtext.cocktail.ui.contentassist.antlr.internal.InternalScannerParser typedParser = (org.xtext.cocktail.ui.contentassist.antlr.internal.InternalScannerParser) parser;
			typedParser.entryRuleModel();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public ScannerGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(ScannerGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
