/*
 * generated by Xtext 2.9.1
 */
package de.roma.cocktail.xtext.serializer;

import com.google.inject.Inject;
import de.roma.cocktail.xtext.lpp.Begin;
import de.roma.cocktail.xtext.lpp.Close;
import de.roma.cocktail.xtext.lpp.CodeBlock;
import de.roma.cocktail.xtext.lpp.Export;
import de.roma.cocktail.xtext.lpp.ExtensionRule;
import de.roma.cocktail.xtext.lpp.Extensions;
import de.roma.cocktail.xtext.lpp.Global;
import de.roma.cocktail.xtext.lpp.GrammarRule;
import de.roma.cocktail.xtext.lpp.GrammarRules;
import de.roma.cocktail.xtext.lpp.Import;
import de.roma.cocktail.xtext.lpp.Local;
import de.roma.cocktail.xtext.lpp.LppPackage;
import de.roma.cocktail.xtext.lpp.Node;
import de.roma.cocktail.xtext.lpp.NodeAttribute;
import de.roma.cocktail.xtext.lpp.NodePart;
import de.roma.cocktail.xtext.lpp.Parser;
import de.roma.cocktail.xtext.lpp.ParserName;
import de.roma.cocktail.xtext.lpp.Precedence;
import de.roma.cocktail.xtext.lpp.PrecedenceRow;
import de.roma.cocktail.xtext.lpp.RuleBody;
import de.roma.cocktail.xtext.lpp.RuleName;
import de.roma.cocktail.xtext.lpp.ScannerName;
import de.roma.cocktail.xtext.lpp.StartState;
import de.roma.cocktail.xtext.lpp.StartSymbols;
import de.roma.cocktail.xtext.lpp.TokenExtra;
import de.roma.cocktail.xtext.services.LppGrammarAccess;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class LppSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private LppGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == LppPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case LppPackage.BEGIN:
				sequence_Begin(context, (Begin) semanticObject); 
				return; 
			case LppPackage.CLOSE:
				sequence_Close(context, (Close) semanticObject); 
				return; 
			case LppPackage.CODE_BLOCK:
				sequence_CodeBlock(context, (CodeBlock) semanticObject); 
				return; 
			case LppPackage.EXPORT:
				sequence_Export(context, (Export) semanticObject); 
				return; 
			case LppPackage.EXTENSION_RULE:
				sequence_ExtensionRule(context, (ExtensionRule) semanticObject); 
				return; 
			case LppPackage.EXTENSIONS:
				sequence_Extensions(context, (Extensions) semanticObject); 
				return; 
			case LppPackage.GLOBAL:
				sequence_Global(context, (Global) semanticObject); 
				return; 
			case LppPackage.GRAMMAR_RULE:
				sequence_GrammarRule(context, (GrammarRule) semanticObject); 
				return; 
			case LppPackage.GRAMMAR_RULES:
				sequence_GrammarRules(context, (GrammarRules) semanticObject); 
				return; 
			case LppPackage.IMPORT:
				sequence_Import(context, (Import) semanticObject); 
				return; 
			case LppPackage.LOCAL:
				sequence_Local(context, (Local) semanticObject); 
				return; 
			case LppPackage.NODE:
				sequence_Node(context, (Node) semanticObject); 
				return; 
			case LppPackage.NODE_ATTRIBUTE:
				sequence_NodeAttribute(context, (NodeAttribute) semanticObject); 
				return; 
			case LppPackage.NODE_PART:
				sequence_NodePart(context, (NodePart) semanticObject); 
				return; 
			case LppPackage.PARSER:
				sequence_Parser(context, (Parser) semanticObject); 
				return; 
			case LppPackage.PARSER_NAME:
				sequence_ParserName(context, (ParserName) semanticObject); 
				return; 
			case LppPackage.PRECEDENCE:
				sequence_Precedence(context, (Precedence) semanticObject); 
				return; 
			case LppPackage.PRECEDENCE_ROW:
				sequence_PrecedenceRow(context, (PrecedenceRow) semanticObject); 
				return; 
			case LppPackage.RULE_BODY:
				sequence_RuleBody(context, (RuleBody) semanticObject); 
				return; 
			case LppPackage.RULE_NAME:
				sequence_RuleName(context, (RuleName) semanticObject); 
				return; 
			case LppPackage.SCANNER_NAME:
				sequence_ScannerName(context, (ScannerName) semanticObject); 
				return; 
			case LppPackage.START_STATE:
				sequence_StartState(context, (StartState) semanticObject); 
				return; 
			case LppPackage.START_SYMBOLS:
				sequence_StartSymbols(context, (StartSymbols) semanticObject); 
				return; 
			case LppPackage.TOKEN_EXTRA:
				sequence_TokenExtra(context, (TokenExtra) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Begin returns Begin
	 *
	 * Constraint:
	 *     content=CodeBlock
	 */
	protected void sequence_Begin(ISerializationContext context, Begin semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, LppPackage.Literals.BEGIN__CONTENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LppPackage.Literals.BEGIN__CONTENT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getBeginAccess().getContentCodeBlockParserRuleCall_2_0(), semanticObject.getContent());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Close returns Close
	 *
	 * Constraint:
	 *     content=CodeBlock
	 */
	protected void sequence_Close(ISerializationContext context, Close semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, LppPackage.Literals.CLOSE__CONTENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LppPackage.Literals.CLOSE__CONTENT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getCloseAccess().getContentCodeBlockParserRuleCall_2_0(), semanticObject.getContent());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     CodeBlock returns CodeBlock
	 *
	 * Constraint:
	 *     (wall=CodeWall | block=CodeBlock)+
	 */
	protected void sequence_CodeBlock(ISerializationContext context, CodeBlock semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Export returns Export
	 *
	 * Constraint:
	 *     content=CodeBlock
	 */
	protected void sequence_Export(ISerializationContext context, Export semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, LppPackage.Literals.EXPORT__CONTENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LppPackage.Literals.EXPORT__CONTENT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getExportAccess().getContentCodeBlockParserRuleCall_2_0(), semanticObject.getContent());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ExtensionRule returns ExtensionRule
	 *
	 * Constraint:
	 *     (name=RuleName? body=RuleBody)
	 */
	protected void sequence_ExtensionRule(ISerializationContext context, ExtensionRule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Extensions returns Extensions
	 *
	 * Constraint:
	 *     nodes+=ExtensionRule+
	 */
	protected void sequence_Extensions(ISerializationContext context, Extensions semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Global returns Global
	 *
	 * Constraint:
	 *     content=CodeBlock
	 */
	protected void sequence_Global(ISerializationContext context, Global semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, LppPackage.Literals.GLOBAL__CONTENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LppPackage.Literals.GLOBAL__CONTENT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGlobalAccess().getContentCodeBlockParserRuleCall_2_0(), semanticObject.getContent());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     GrammarRule returns GrammarRule
	 *
	 * Constraint:
	 *     (name=RuleName body=RuleBody)
	 */
	protected void sequence_GrammarRule(ISerializationContext context, GrammarRule semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, LppPackage.Literals.GRAMMAR_RULE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LppPackage.Literals.GRAMMAR_RULE__NAME));
			if (transientValues.isValueTransient(semanticObject, LppPackage.Literals.GRAMMAR_RULE__BODY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LppPackage.Literals.GRAMMAR_RULE__BODY));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGrammarRuleAccess().getNameRuleNameParserRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getGrammarRuleAccess().getBodyRuleBodyParserRuleCall_1_0(), semanticObject.getBody());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     GrammarRules returns GrammarRules
	 *
	 * Constraint:
	 *     nodes+=GrammarRule+
	 */
	protected void sequence_GrammarRules(ISerializationContext context, GrammarRules semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Import returns Import
	 *
	 * Constraint:
	 *     content=CodeBlock
	 */
	protected void sequence_Import(ISerializationContext context, Import semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, LppPackage.Literals.IMPORT__CONTENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LppPackage.Literals.IMPORT__CONTENT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getImportAccess().getContentCodeBlockParserRuleCall_2_0(), semanticObject.getContent());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Local returns Local
	 *
	 * Constraint:
	 *     content=CodeBlock
	 */
	protected void sequence_Local(ISerializationContext context, Local semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, LppPackage.Literals.LOCAL__CONTENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LppPackage.Literals.LOCAL__CONTENT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getLocalAccess().getContentCodeBlockParserRuleCall_2_0(), semanticObject.getContent());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     NodeAttribute returns NodeAttribute
	 *
	 * Constraint:
	 *     (attribute=ID type=ID?)
	 */
	protected void sequence_NodeAttribute(ISerializationContext context, NodeAttribute semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     NodePart returns NodePart
	 *
	 * Constraint:
	 *     (child=Node | attribute=NodeAttribute)
	 */
	protected void sequence_NodePart(ISerializationContext context, NodePart semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Node returns Node
	 *
	 * Constraint:
	 *     (selector=ID? (name=ID | name=STRING))
	 */
	protected void sequence_Node(ISerializationContext context, Node semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ParserName returns ParserName
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_ParserName(ISerializationContext context, ParserName semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, LppPackage.Literals.PARSER_NAME__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LppPackage.Literals.PARSER_NAME__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getParserNameAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Parser returns Parser
	 *
	 * Constraint:
	 *     (
	 *         (
	 *             scanner=ScannerName | 
	 *             parser=ParserName | 
	 *             importBlock=Import | 
	 *             exportBlock=Export | 
	 *             globalBlock=Global | 
	 *             localBlock=Local | 
	 *             beginBlock=Begin | 
	 *             closeBlock=Close | 
	 *             precedence=Precedence | 
	 *             start=StartSymbols
	 *         )* 
	 *         rules=GrammarRules
	 *     )
	 */
	protected void sequence_Parser(ISerializationContext context, Parser semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     PrecedenceRow returns PrecedenceRow
	 *
	 * Constraint:
	 *     (type=PrecedenceType strings+=STRING* name=ID?)
	 */
	protected void sequence_PrecedenceRow(ISerializationContext context, PrecedenceRow semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Precedence returns Precedence
	 *
	 * Constraint:
	 *     rows+=PrecedenceRow+
	 */
	protected void sequence_Precedence(ISerializationContext context, Precedence semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     RuleBody returns RuleBody
	 *
	 * Constraint:
	 *     (
	 *         (nodetype=NodeType (block=CodeBlock | (block=CodeBlock extension=Extensions?))) | 
	 *         (((nodetype=NodeType part+=NodePart+) | part+=NodePart+)? token=[PrecedenceRow|ID] block=CodeBlock extension=Extensions?) | 
	 *         (((nodetype=NodeType part+=NodePart+) | part+=NodePart+) (block=CodeBlock | (block=CodeBlock extension=Extensions?))) | 
	 *         block=CodeBlock | 
	 *         (block=CodeBlock extension=Extensions?)
	 *     )?
	 */
	protected void sequence_RuleBody(ISerializationContext context, RuleBody semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     RuleName returns RuleName
	 *
	 * Constraint:
	 *     (name=ID | name=STRING)
	 */
	protected void sequence_RuleName(ISerializationContext context, RuleName semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ScannerName returns ScannerName
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_ScannerName(ISerializationContext context, ScannerName semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, LppPackage.Literals.SCANNER_NAME__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LppPackage.Literals.SCANNER_NAME__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getScannerNameAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     StartState returns StartState
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_StartState(ISerializationContext context, StartState semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, LppPackage.Literals.START_STATE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LppPackage.Literals.START_STATE__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getStartStateAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     StartSymbols returns StartSymbols
	 *
	 * Constraint:
	 *     states+=StartState+
	 */
	protected void sequence_StartSymbols(ISerializationContext context, StartSymbols semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     TokenExtra returns TokenExtra
	 *
	 * Constraint:
	 *     (cost=INT presentation=STRING)
	 */
	protected void sequence_TokenExtra(ISerializationContext context, TokenExtra semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, LppPackage.Literals.TOKEN_EXTRA__COST) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LppPackage.Literals.TOKEN_EXTRA__COST));
			if (transientValues.isValueTransient(semanticObject, LppPackage.Literals.TOKEN_EXTRA__PRESENTATION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LppPackage.Literals.TOKEN_EXTRA__PRESENTATION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTokenExtraAccess().getCostINTTerminalRuleCall_0_0(), semanticObject.getCost());
		feeder.accept(grammarAccess.getTokenExtraAccess().getPresentationSTRINGTerminalRuleCall_2_0(), semanticObject.getPresentation());
		feeder.finish();
	}
	
	
}
