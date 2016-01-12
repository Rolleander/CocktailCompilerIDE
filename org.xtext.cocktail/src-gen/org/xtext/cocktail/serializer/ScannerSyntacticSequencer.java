/*
 * generated by Xtext
 */
package org.xtext.cocktail.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.xtext.cocktail.services.ScannerGrammarAccess;

@SuppressWarnings("all")
public class ScannerSyntacticSequencer extends AbstractSyntacticSequencer {

	protected ScannerGrammarAccess grammarAccess;
	protected AbstractElementAlias match_ActionStatement_YyEchoKeyword_3_or___YyLessKeyword_4_0_INTTerminalRuleCall_4_1_RightParenthesisSemicolonKeyword_4_2__;
	protected AbstractElementAlias match_RuleStart_AsteriskKeyword_2_2_or_STDKeyword_2_1;
	protected AbstractElementAlias match_RuleStart___HyphenMinusKeyword_0_1_or_NOTKeyword_0_0__q;
	protected AbstractElementAlias match_Rule_RULEKeyword_0_0_or_RULESKeyword_0_1;
	protected AbstractElementAlias match_SingleRule_ColonHyphenMinusKeyword_2_0_or_ColonKeyword_2_1;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (ScannerGrammarAccess) access;
		match_ActionStatement_YyEchoKeyword_3_or___YyLessKeyword_4_0_INTTerminalRuleCall_4_1_RightParenthesisSemicolonKeyword_4_2__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getActionStatementAccess().getYyLessKeyword_4_0()), new TokenAlias(false, false, grammarAccess.getActionStatementAccess().getINTTerminalRuleCall_4_1()), new TokenAlias(false, false, grammarAccess.getActionStatementAccess().getRightParenthesisSemicolonKeyword_4_2())), new TokenAlias(false, false, grammarAccess.getActionStatementAccess().getYyEchoKeyword_3()));
		match_RuleStart_AsteriskKeyword_2_2_or_STDKeyword_2_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getRuleStartAccess().getAsteriskKeyword_2_2()), new TokenAlias(false, false, grammarAccess.getRuleStartAccess().getSTDKeyword_2_1()));
		match_RuleStart___HyphenMinusKeyword_0_1_or_NOTKeyword_0_0__q = new AlternativeAlias(false, true, new TokenAlias(false, false, grammarAccess.getRuleStartAccess().getHyphenMinusKeyword_0_1()), new TokenAlias(false, false, grammarAccess.getRuleStartAccess().getNOTKeyword_0_0()));
		match_Rule_RULEKeyword_0_0_or_RULESKeyword_0_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getRuleAccess().getRULEKeyword_0_0()), new TokenAlias(false, false, grammarAccess.getRuleAccess().getRULESKeyword_0_1()));
		match_SingleRule_ColonHyphenMinusKeyword_2_0_or_ColonKeyword_2_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getSingleRuleAccess().getColonHyphenMinusKeyword_2_0()), new TokenAlias(false, false, grammarAccess.getSingleRuleAccess().getColonKeyword_2_1()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getINTRule())
			return getINTToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * terminal INT returns ecore::EInt: ('0'..'9')+;
	 */
	protected String getINTToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_ActionStatement_YyEchoKeyword_3_or___YyLessKeyword_4_0_INTTerminalRuleCall_4_1_RightParenthesisSemicolonKeyword_4_2__.equals(syntax))
				emit_ActionStatement_YyEchoKeyword_3_or___YyLessKeyword_4_0_INTTerminalRuleCall_4_1_RightParenthesisSemicolonKeyword_4_2__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_RuleStart_AsteriskKeyword_2_2_or_STDKeyword_2_1.equals(syntax))
				emit_RuleStart_AsteriskKeyword_2_2_or_STDKeyword_2_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_RuleStart___HyphenMinusKeyword_0_1_or_NOTKeyword_0_0__q.equals(syntax))
				emit_RuleStart___HyphenMinusKeyword_0_1_or_NOTKeyword_0_0__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Rule_RULEKeyword_0_0_or_RULESKeyword_0_1.equals(syntax))
				emit_Rule_RULEKeyword_0_0_or_RULESKeyword_0_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_SingleRule_ColonHyphenMinusKeyword_2_0_or_ColonKeyword_2_1.equals(syntax))
				emit_SingleRule_ColonHyphenMinusKeyword_2_0_or_ColonKeyword_2_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     'yyEcho;' | ('yyLess(' INT ');')
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) (rule start)
	 */
	protected void emit_ActionStatement_YyEchoKeyword_3_or___YyLessKeyword_4_0_INTTerminalRuleCall_4_1_RightParenthesisSemicolonKeyword_4_2__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'STD' | '*'
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) ('NOT' | '-')? '#' (ambiguity) '#' (rule start)
	 */
	protected void emit_RuleStart_AsteriskKeyword_2_2_or_STDKeyword_2_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('NOT' | '-')?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) '#' ('STD' | '*') '#' (rule start)
	 *     (rule start) (ambiguity) '#' state+=[StartState|ID]
	 */
	protected void emit_RuleStart___HyphenMinusKeyword_0_1_or_NOTKeyword_0_0__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'RULE' | 'RULES'
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) (rule start)
	 *     (rule start) (ambiguity) content=SingleRule
	 */
	protected void emit_Rule_RULEKeyword_0_0_or_RULESKeyword_0_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ':-' | ':'
	 *
	 * This ambiguous syntax occurs at:
	 *     rule+=STRING (ambiguity) '{' content+=ID
	 */
	protected void emit_SingleRule_ColonHyphenMinusKeyword_2_0_or_ColonKeyword_2_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
