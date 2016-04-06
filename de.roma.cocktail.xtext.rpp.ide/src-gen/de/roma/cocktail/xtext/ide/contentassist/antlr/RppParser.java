/*
 * generated by Xtext 2.9.1
 */
package de.roma.cocktail.xtext.ide.contentassist.antlr;

import com.google.inject.Inject;
import de.roma.cocktail.xtext.ide.contentassist.antlr.internal.InternalRppParser;
import de.roma.cocktail.xtext.services.RppGrammarAccess;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

public class RppParser extends AbstractContentAssistParser {

	@Inject
	private RppGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalRppParser createParser() {
		InternalRppParser result = new InternalRppParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getCodeBlockAccess().getAlternatives(), "rule__CodeBlock__Alternatives");
					put(grammarAccess.getCodeWallAccess().getAlternatives(), "rule__CodeWall__Alternatives");
					put(grammarAccess.getRuleAccess().getInfoAlternatives_0_0(), "rule__Rule__InfoAlternatives_0_0");
					put(grammarAccess.getRegexAccess().getAlternatives(), "rule__Regex__Alternatives");
					put(grammarAccess.getRulePartAccess().getAlternatives(), "rule__RulePart__Alternatives");
					put(grammarAccess.getRuleStartAccess().getAlternatives_0(), "rule__RuleStart__Alternatives_0");
					put(grammarAccess.getRuleStartAccess().getAlternatives_2(), "rule__RuleStart__Alternatives_2");
					put(grammarAccess.getModelAccess().getGroup(), "rule__Model__Group__0");
					put(grammarAccess.getCodeBlockAccess().getGroup_1(), "rule__CodeBlock__Group_1__0");
					put(grammarAccess.getScannerAccess().getGroup(), "rule__Scanner__Group__0");
					put(grammarAccess.getExportAccess().getGroup(), "rule__Export__Group__0");
					put(grammarAccess.getImportAccess().getGroup(), "rule__Import__Group__0");
					put(grammarAccess.getGlobalAccess().getGroup(), "rule__Global__Group__0");
					put(grammarAccess.getLocalAccess().getGroup(), "rule__Local__Group__0");
					put(grammarAccess.getDefaultAccess().getGroup(), "rule__Default__Group__0");
					put(grammarAccess.getEofAccess().getGroup(), "rule__Eof__Group__0");
					put(grammarAccess.getBeginAccess().getGroup(), "rule__Begin__Group__0");
					put(grammarAccess.getCloseAccess().getGroup(), "rule__Close__Group__0");
					put(grammarAccess.getDefineAccess().getGroup(), "rule__Define__Group__0");
					put(grammarAccess.getDefineRuleAccess().getGroup(), "rule__DefineRule__Group__0");
					put(grammarAccess.getStartStatesAccess().getGroup(), "rule__StartStates__Group__0");
					put(grammarAccess.getStartStatesAccess().getGroup_2(), "rule__StartStates__Group_2__0");
					put(grammarAccess.getStartStatesAccess().getGroup_3(), "rule__StartStates__Group_3__0");
					put(grammarAccess.getStartStatesAccess().getGroup_3_2(), "rule__StartStates__Group_3_2__0");
					put(grammarAccess.getRuleAccess().getGroup(), "rule__Rule__Group__0");
					put(grammarAccess.getSingleRuleAccess().getGroup(), "rule__SingleRule__Group__0");
					put(grammarAccess.getRuleStartAccess().getGroup(), "rule__RuleStart__Group__0");
					put(grammarAccess.getRuleStartAccess().getGroup_2_0(), "rule__RuleStart__Group_2_0__0");
					put(grammarAccess.getRuleStartAccess().getGroup_2_0_1(), "rule__RuleStart__Group_2_0_1__0");
					put(grammarAccess.getModelAccess().getScannerAssignment_0_0(), "rule__Model__ScannerAssignment_0_0");
					put(grammarAccess.getModelAccess().getExportAssignment_0_1(), "rule__Model__ExportAssignment_0_1");
					put(grammarAccess.getModelAccess().getImportsAssignment_0_2(), "rule__Model__ImportsAssignment_0_2");
					put(grammarAccess.getModelAccess().getGlobalAssignment_0_3(), "rule__Model__GlobalAssignment_0_3");
					put(grammarAccess.getModelAccess().getLocalAssignment_0_4(), "rule__Model__LocalAssignment_0_4");
					put(grammarAccess.getModelAccess().getDefaultAssignment_0_5(), "rule__Model__DefaultAssignment_0_5");
					put(grammarAccess.getModelAccess().getEofAssignment_0_6(), "rule__Model__EofAssignment_0_6");
					put(grammarAccess.getModelAccess().getBeginAssignment_0_7(), "rule__Model__BeginAssignment_0_7");
					put(grammarAccess.getModelAccess().getCloseAssignment_0_8(), "rule__Model__CloseAssignment_0_8");
					put(grammarAccess.getModelAccess().getDefineAssignment_0_9(), "rule__Model__DefineAssignment_0_9");
					put(grammarAccess.getModelAccess().getStatesAssignment_0_10(), "rule__Model__StatesAssignment_0_10");
					put(grammarAccess.getModelAccess().getRulesAssignment_1(), "rule__Model__RulesAssignment_1");
					put(grammarAccess.getScannerAccess().getNameAssignment_1(), "rule__Scanner__NameAssignment_1");
					put(grammarAccess.getExportAccess().getContentAssignment_2(), "rule__Export__ContentAssignment_2");
					put(grammarAccess.getImportAccess().getContentAssignment_2(), "rule__Import__ContentAssignment_2");
					put(grammarAccess.getGlobalAccess().getContentAssignment_2(), "rule__Global__ContentAssignment_2");
					put(grammarAccess.getLocalAccess().getContentAssignment_2(), "rule__Local__ContentAssignment_2");
					put(grammarAccess.getDefaultAccess().getContentAssignment_2(), "rule__Default__ContentAssignment_2");
					put(grammarAccess.getEofAccess().getContentAssignment_2(), "rule__Eof__ContentAssignment_2");
					put(grammarAccess.getBeginAccess().getContentAssignment_2(), "rule__Begin__ContentAssignment_2");
					put(grammarAccess.getCloseAccess().getContentAssignment_2(), "rule__Close__ContentAssignment_2");
					put(grammarAccess.getDefineAccess().getDefinesAssignment_1(), "rule__Define__DefinesAssignment_1");
					put(grammarAccess.getDefineRuleAccess().getNameAssignment_0(), "rule__DefineRule__NameAssignment_0");
					put(grammarAccess.getDefineRuleAccess().getRuleAssignment_2(), "rule__DefineRule__RuleAssignment_2");
					put(grammarAccess.getStartStatesAccess().getIncstatesAssignment_1(), "rule__StartStates__IncstatesAssignment_1");
					put(grammarAccess.getStartStatesAccess().getIncstatesAssignment_2_1(), "rule__StartStates__IncstatesAssignment_2_1");
					put(grammarAccess.getStartStatesAccess().getExstatesAssignment_3_1(), "rule__StartStates__ExstatesAssignment_3_1");
					put(grammarAccess.getStartStatesAccess().getExstatesAssignment_3_2_1(), "rule__StartStates__ExstatesAssignment_3_2_1");
					put(grammarAccess.getStartStateAccess().getNameAssignment(), "rule__StartState__NameAssignment");
					put(grammarAccess.getRuleAccess().getInfoAssignment_0(), "rule__Rule__InfoAssignment_0");
					put(grammarAccess.getRuleAccess().getRulesAssignment_1(), "rule__Rule__RulesAssignment_1");
					put(grammarAccess.getSingleRuleAccess().getStartAssignment_0(), "rule__SingleRule__StartAssignment_0");
					put(grammarAccess.getSingleRuleAccess().getRuleAssignment_1(), "rule__SingleRule__RuleAssignment_1");
					put(grammarAccess.getSingleRuleAccess().getContentAssignment_5(), "rule__SingleRule__ContentAssignment_5");
					put(grammarAccess.getRuleDefinitionAccess().getPartsAssignment(), "rule__RuleDefinition__PartsAssignment");
					put(grammarAccess.getRulePartAccess().getRegAssignment_0(), "rule__RulePart__RegAssignment_0");
					put(grammarAccess.getRulePartAccess().getRefAssignment_1(), "rule__RulePart__RefAssignment_1");
					put(grammarAccess.getRuleStartAccess().getRulePrecAssignment_0_0(), "rule__RuleStart__RulePrecAssignment_0_0");
					put(grammarAccess.getRuleStartAccess().getRulePrecAssignment_0_1(), "rule__RuleStart__RulePrecAssignment_0_1");
					put(grammarAccess.getRuleStartAccess().getRuleStatesAssignment_2_0_0(), "rule__RuleStart__RuleStatesAssignment_2_0_0");
					put(grammarAccess.getRuleStartAccess().getRuleStatesAssignment_2_0_1_1(), "rule__RuleStart__RuleStatesAssignment_2_0_1_1");
					put(grammarAccess.getRuleStartAccess().getRuleDefaultAssignment_2_1(), "rule__RuleStart__RuleDefaultAssignment_2_1");
					put(grammarAccess.getRuleStartAccess().getRuleDefaultAssignment_2_2(), "rule__RuleStart__RuleDefaultAssignment_2_2");
					put(grammarAccess.getModelAccess().getUnorderedGroup_0(), "rule__Model__UnorderedGroup_0");
				}
			};
		}
		return nameMappings.get(element);
	}

	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			InternalRppParser typedParser = (InternalRppParser) parser;
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

	public RppGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(RppGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}