/*
 * generated by Xtext 2.9.1
 */
package de.roma.cocktail.xtext.ide.contentassist.antlr;

import com.google.inject.Inject;
import de.roma.cocktail.xtext.ide.contentassist.antlr.internal.InternalParserParser;
import de.roma.cocktail.xtext.services.ParserGrammarAccess;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

public class ParserParser extends AbstractContentAssistParser {

	@Inject
	private ParserGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalParserParser createParser() {
		InternalParserParser result = new InternalParserParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getDefinedTokenAccess().getAlternatives(), "rule__DefinedToken__Alternatives");
					put(grammarAccess.getDefinedTokenAccess().getNameAlternatives_0_0_0(), "rule__DefinedToken__NameAlternatives_0_0_0");
					put(grammarAccess.getCodeBlockAccess().getAlternatives(), "rule__CodeBlock__Alternatives");
					put(grammarAccess.getCodeWallAccess().getAlternatives(), "rule__CodeWall__Alternatives");
					put(grammarAccess.getGrammerRulesAccess().getAlternatives_0(), "rule__GrammerRules__Alternatives_0");
					put(grammarAccess.getGrammerReferenceAccess().getAlternatives(), "rule__GrammerReference__Alternatives");
					put(grammarAccess.getRulePartAccess().getAlternatives(), "rule__RulePart__Alternatives");
					put(grammarAccess.getPrecedenceTypeAccess().getAlternatives(), "rule__PrecedenceType__Alternatives");
					put(grammarAccess.getParserModelAccess().getGroup_0(), "rule__ParserModel__Group_0__0");
					put(grammarAccess.getScannerNameAccess().getGroup(), "rule__ScannerName__Group__0");
					put(grammarAccess.getParserNameAccess().getGroup(), "rule__ParserName__Group__0");
					put(grammarAccess.getImportAccess().getGroup(), "rule__Import__Group__0");
					put(grammarAccess.getExportAccess().getGroup(), "rule__Export__Group__0");
					put(grammarAccess.getGlobalAccess().getGroup(), "rule__Global__Group__0");
					put(grammarAccess.getLocalAccess().getGroup(), "rule__Local__Group__0");
					put(grammarAccess.getBeginAccess().getGroup(), "rule__Begin__Group__0");
					put(grammarAccess.getCloseAccess().getGroup(), "rule__Close__Group__0");
					put(grammarAccess.getTokensAccess().getGroup(), "rule__Tokens__Group__0");
					put(grammarAccess.getDefinedTokenAccess().getGroup_0(), "rule__DefinedToken__Group_0__0");
					put(grammarAccess.getDefinedTokenAccess().getGroup_0_1(), "rule__DefinedToken__Group_0_1__0");
					put(grammarAccess.getDefinedTokenAccess().getGroup_0_1_2(), "rule__DefinedToken__Group_0_1_2__0");
					put(grammarAccess.getTokenExtraAccess().getGroup(), "rule__TokenExtra__Group__0");
					put(grammarAccess.getCodeBlockAccess().getGroup_1(), "rule__CodeBlock__Group_1__0");
					put(grammarAccess.getPrecedenceAccess().getGroup(), "rule__Precedence__Group__0");
					put(grammarAccess.getPrecedenceRowAccess().getGroup(), "rule__PrecedenceRow__Group__0");
					put(grammarAccess.getStartSymbolsAccess().getGroup(), "rule__StartSymbols__Group__0");
					put(grammarAccess.getGrammerRulesAccess().getGroup(), "rule__GrammerRules__Group__0");
					put(grammarAccess.getGrammarRuleAccess().getGroup(), "rule__GrammarRule__Group__0");
					put(grammarAccess.getGrammarRuleAccess().getGroup_3(), "rule__GrammarRule__Group_3__0");
					put(grammarAccess.getRuleBodyAccess().getGroup(), "rule__RuleBody__Group__0");
					put(grammarAccess.getRuleCodeAccess().getGroup_0(), "rule__RuleCode__Group_0__0");
					put(grammarAccess.getRuleCodeAccess().getGroup_1(), "rule__RuleCode__Group_1__0");
					put(grammarAccess.getParserModelAccess().getScannerAssignment_0_0(), "rule__ParserModel__ScannerAssignment_0_0");
					put(grammarAccess.getParserModelAccess().getParserAssignment_0_1(), "rule__ParserModel__ParserAssignment_0_1");
					put(grammarAccess.getParserModelAccess().getImportBlockAssignment_1(), "rule__ParserModel__ImportBlockAssignment_1");
					put(grammarAccess.getParserModelAccess().getExportBlockAssignment_2(), "rule__ParserModel__ExportBlockAssignment_2");
					put(grammarAccess.getParserModelAccess().getGlobalBlockAssignment_3(), "rule__ParserModel__GlobalBlockAssignment_3");
					put(grammarAccess.getParserModelAccess().getLocalBlockAssignment_4(), "rule__ParserModel__LocalBlockAssignment_4");
					put(grammarAccess.getParserModelAccess().getBeginBlockAssignment_5(), "rule__ParserModel__BeginBlockAssignment_5");
					put(grammarAccess.getParserModelAccess().getCloseBlockAssignment_6(), "rule__ParserModel__CloseBlockAssignment_6");
					put(grammarAccess.getParserModelAccess().getTokensAssignment_7(), "rule__ParserModel__TokensAssignment_7");
					put(grammarAccess.getParserModelAccess().getPrecedencAssignment_8(), "rule__ParserModel__PrecedencAssignment_8");
					put(grammarAccess.getParserModelAccess().getStartAssignment_9(), "rule__ParserModel__StartAssignment_9");
					put(grammarAccess.getParserModelAccess().getRulesAssignment_10(), "rule__ParserModel__RulesAssignment_10");
					put(grammarAccess.getScannerNameAccess().getNameAssignment_1(), "rule__ScannerName__NameAssignment_1");
					put(grammarAccess.getParserNameAccess().getNameAssignment_1(), "rule__ParserName__NameAssignment_1");
					put(grammarAccess.getImportAccess().getContentAssignment_2(), "rule__Import__ContentAssignment_2");
					put(grammarAccess.getExportAccess().getContentAssignment_2(), "rule__Export__ContentAssignment_2");
					put(grammarAccess.getGlobalAccess().getContentAssignment_2(), "rule__Global__ContentAssignment_2");
					put(grammarAccess.getLocalAccess().getContentAssignment_2(), "rule__Local__ContentAssignment_2");
					put(grammarAccess.getBeginAccess().getContentAssignment_2(), "rule__Begin__ContentAssignment_2");
					put(grammarAccess.getCloseAccess().getContentAssignment_2(), "rule__Close__ContentAssignment_2");
					put(grammarAccess.getTokensAccess().getTokensAssignment_1(), "rule__Tokens__TokensAssignment_1");
					put(grammarAccess.getDefinedTokenAccess().getNameAssignment_0_0(), "rule__DefinedToken__NameAssignment_0_0");
					put(grammarAccess.getDefinedTokenAccess().getNumberAssignment_0_1_1(), "rule__DefinedToken__NumberAssignment_0_1_1");
					put(grammarAccess.getDefinedTokenAccess().getExtraAssignment_0_1_2_1(), "rule__DefinedToken__ExtraAssignment_0_1_2_1");
					put(grammarAccess.getDefinedTokenAccess().getExtraAssignment_1(), "rule__DefinedToken__ExtraAssignment_1");
					put(grammarAccess.getTokenExtraAccess().getCostAssignment_0(), "rule__TokenExtra__CostAssignment_0");
					put(grammarAccess.getTokenExtraAccess().getPresentationAssignment_2(), "rule__TokenExtra__PresentationAssignment_2");
					put(grammarAccess.getPrecedenceAccess().getRowsAssignment_1(), "rule__Precedence__RowsAssignment_1");
					put(grammarAccess.getPrecedenceRowAccess().getTypeAssignment_0(), "rule__PrecedenceRow__TypeAssignment_0");
					put(grammarAccess.getPrecedenceRowAccess().getTokensAssignment_1(), "rule__PrecedenceRow__TokensAssignment_1");
					put(grammarAccess.getStartSymbolsAccess().getStatesAssignment_1(), "rule__StartSymbols__StatesAssignment_1");
					put(grammarAccess.getStartStateAccess().getNameAssignment(), "rule__StartState__NameAssignment");
					put(grammarAccess.getGrammerRulesAccess().getRulesAssignment_1(), "rule__GrammerRules__RulesAssignment_1");
					put(grammarAccess.getGrammarRuleAccess().getNameAssignment_0(), "rule__GrammarRule__NameAssignment_0");
					put(grammarAccess.getGrammarRuleAccess().getBodyAssignment_2(), "rule__GrammarRule__BodyAssignment_2");
					put(grammarAccess.getGrammarRuleAccess().getBodyAssignment_3_1(), "rule__GrammarRule__BodyAssignment_3_1");
					put(grammarAccess.getRuleBodyAccess().getPartAssignment_0(), "rule__RuleBody__PartAssignment_0");
					put(grammarAccess.getRuleBodyAccess().getCodeAssignment_1(), "rule__RuleBody__CodeAssignment_1");
					put(grammarAccess.getRulePartAccess().getRegexAssignment_0(), "rule__RulePart__RegexAssignment_0");
					put(grammarAccess.getRulePartAccess().getRulesAssignment_1(), "rule__RulePart__RulesAssignment_1");
					put(grammarAccess.getParserModelAccess().getUnorderedGroup(), "rule__ParserModel__UnorderedGroup");
					put(grammarAccess.getRuleCodeAccess().getUnorderedGroup(), "rule__RuleCode__UnorderedGroup");
				}
			};
		}
		return nameMappings.get(element);
	}

	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			InternalParserParser typedParser = (InternalParserParser) parser;
			typedParser.entryRuleParserModel();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public ParserGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(ParserGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
