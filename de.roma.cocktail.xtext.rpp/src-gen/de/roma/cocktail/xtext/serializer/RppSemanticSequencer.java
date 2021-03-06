/*
 * generated by Xtext 2.9.2
 */
package de.roma.cocktail.xtext.serializer;

import com.google.inject.Inject;
import de.roma.cocktail.xtext.rpp.Begin;
import de.roma.cocktail.xtext.rpp.Close;
import de.roma.cocktail.xtext.rpp.CodeBlock;
import de.roma.cocktail.xtext.rpp.Default;
import de.roma.cocktail.xtext.rpp.Define;
import de.roma.cocktail.xtext.rpp.DefineRule;
import de.roma.cocktail.xtext.rpp.Eof;
import de.roma.cocktail.xtext.rpp.Export;
import de.roma.cocktail.xtext.rpp.Global;
import de.roma.cocktail.xtext.rpp.Import;
import de.roma.cocktail.xtext.rpp.Local;
import de.roma.cocktail.xtext.rpp.Model;
import de.roma.cocktail.xtext.rpp.RppPackage;
import de.roma.cocktail.xtext.rpp.Rule;
import de.roma.cocktail.xtext.rpp.RuleDefinition;
import de.roma.cocktail.xtext.rpp.RuleInsert;
import de.roma.cocktail.xtext.rpp.RulePart;
import de.roma.cocktail.xtext.rpp.RuleStart;
import de.roma.cocktail.xtext.rpp.Scanner;
import de.roma.cocktail.xtext.rpp.SingleRule;
import de.roma.cocktail.xtext.rpp.StartState;
import de.roma.cocktail.xtext.rpp.StartStates;
import de.roma.cocktail.xtext.services.RppGrammarAccess;
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
public class RppSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private RppGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == RppPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case RppPackage.BEGIN:
				sequence_Begin(context, (Begin) semanticObject); 
				return; 
			case RppPackage.CLOSE:
				sequence_Close(context, (Close) semanticObject); 
				return; 
			case RppPackage.CODE_BLOCK:
				sequence_CodeBlock(context, (CodeBlock) semanticObject); 
				return; 
			case RppPackage.DEFAULT:
				sequence_Default(context, (Default) semanticObject); 
				return; 
			case RppPackage.DEFINE:
				sequence_Define(context, (Define) semanticObject); 
				return; 
			case RppPackage.DEFINE_RULE:
				sequence_DefineRule(context, (DefineRule) semanticObject); 
				return; 
			case RppPackage.EOF:
				sequence_Eof(context, (Eof) semanticObject); 
				return; 
			case RppPackage.EXPORT:
				sequence_Export(context, (Export) semanticObject); 
				return; 
			case RppPackage.GLOBAL:
				sequence_Global(context, (Global) semanticObject); 
				return; 
			case RppPackage.IMPORT:
				sequence_Import(context, (Import) semanticObject); 
				return; 
			case RppPackage.LOCAL:
				sequence_Local(context, (Local) semanticObject); 
				return; 
			case RppPackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case RppPackage.RULE:
				sequence_Rule(context, (Rule) semanticObject); 
				return; 
			case RppPackage.RULE_DEFINITION:
				sequence_RuleDefinition(context, (RuleDefinition) semanticObject); 
				return; 
			case RppPackage.RULE_INSERT:
				sequence_RuleInsert(context, (RuleInsert) semanticObject); 
				return; 
			case RppPackage.RULE_PART:
				sequence_RulePart(context, (RulePart) semanticObject); 
				return; 
			case RppPackage.RULE_START:
				sequence_RuleStart(context, (RuleStart) semanticObject); 
				return; 
			case RppPackage.SCANNER:
				sequence_Scanner(context, (Scanner) semanticObject); 
				return; 
			case RppPackage.SINGLE_RULE:
				sequence_SingleRule(context, (SingleRule) semanticObject); 
				return; 
			case RppPackage.START_STATE:
				sequence_StartState(context, (StartState) semanticObject); 
				return; 
			case RppPackage.START_STATES:
				sequence_StartStates(context, (StartStates) semanticObject); 
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
			if (transientValues.isValueTransient(semanticObject, RppPackage.Literals.BEGIN__CONTENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RppPackage.Literals.BEGIN__CONTENT));
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
			if (transientValues.isValueTransient(semanticObject, RppPackage.Literals.CLOSE__CONTENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RppPackage.Literals.CLOSE__CONTENT));
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
	 *     (wall+=CodeWall | block+=CodeBlock)+
	 */
	protected void sequence_CodeBlock(ISerializationContext context, CodeBlock semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Default returns Default
	 *
	 * Constraint:
	 *     content=CodeBlock
	 */
	protected void sequence_Default(ISerializationContext context, Default semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RppPackage.Literals.DEFAULT__CONTENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RppPackage.Literals.DEFAULT__CONTENT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDefaultAccess().getContentCodeBlockParserRuleCall_2_0(), semanticObject.getContent());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     DefineRule returns DefineRule
	 *
	 * Constraint:
	 *     (name=ID rule=DefineRegex)
	 */
	protected void sequence_DefineRule(ISerializationContext context, DefineRule semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RppPackage.Literals.DEFINE_RULE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RppPackage.Literals.DEFINE_RULE__NAME));
			if (transientValues.isValueTransient(semanticObject, RppPackage.Literals.DEFINE_RULE__RULE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RppPackage.Literals.DEFINE_RULE__RULE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDefineRuleAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getDefineRuleAccess().getRuleDefineRegexParserRuleCall_2_0(), semanticObject.getRule());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Define returns Define
	 *
	 * Constraint:
	 *     defines+=DefineRule+
	 */
	protected void sequence_Define(ISerializationContext context, Define semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Eof returns Eof
	 *
	 * Constraint:
	 *     content=CodeBlock
	 */
	protected void sequence_Eof(ISerializationContext context, Eof semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RppPackage.Literals.EOF__CONTENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RppPackage.Literals.EOF__CONTENT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getEofAccess().getContentCodeBlockParserRuleCall_2_0(), semanticObject.getContent());
		feeder.finish();
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
			if (transientValues.isValueTransient(semanticObject, RppPackage.Literals.EXPORT__CONTENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RppPackage.Literals.EXPORT__CONTENT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getExportAccess().getContentCodeBlockParserRuleCall_2_0(), semanticObject.getContent());
		feeder.finish();
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
			if (transientValues.isValueTransient(semanticObject, RppPackage.Literals.GLOBAL__CONTENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RppPackage.Literals.GLOBAL__CONTENT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGlobalAccess().getContentCodeBlockParserRuleCall_2_0(), semanticObject.getContent());
		feeder.finish();
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
			if (transientValues.isValueTransient(semanticObject, RppPackage.Literals.IMPORT__CONTENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RppPackage.Literals.IMPORT__CONTENT));
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
			if (transientValues.isValueTransient(semanticObject, RppPackage.Literals.LOCAL__CONTENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RppPackage.Literals.LOCAL__CONTENT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getLocalAccess().getContentCodeBlockParserRuleCall_2_0(), semanticObject.getContent());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     (
	 *         (
	 *             scanner=Scanner | 
	 *             export=Export | 
	 *             imports=Import | 
	 *             global=Global | 
	 *             local=Local | 
	 *             default=Default | 
	 *             eof=Eof | 
	 *             begin=Begin | 
	 *             close=Close | 
	 *             define=Define | 
	 *             states=StartStates
	 *         )* 
	 *         rules=Rule 
	 *         insert=RuleInsert?
	 *     )
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     RuleDefinition returns RuleDefinition
	 *
	 * Constraint:
	 *     parts+=RulePart+
	 */
	protected void sequence_RuleDefinition(ISerializationContext context, RuleDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     RuleInsert returns RuleInsert
	 *
	 * Constraint:
	 *     (info='INSERT' case='CASE-INSENSITIVE'? start=RuleStart? content=CodeBlock rules+=SingleRule*)
	 */
	protected void sequence_RuleInsert(ISerializationContext context, RuleInsert semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     RulePart returns RulePart
	 *
	 * Constraint:
	 *     (reg=Regex | ref=[DefineRule|ID])
	 */
	protected void sequence_RulePart(ISerializationContext context, RulePart semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     RuleStart returns RuleStart
	 *
	 * Constraint:
	 *     ((rulePrec='NOT' | rulePrec='-')? (ruleStates+=[StartState|ID] | ruleDefault='STD' | ruleDefault='*') ruleStates+=[StartState|ID]*)
	 */
	protected void sequence_RuleStart(ISerializationContext context, RuleStart semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Rule returns Rule
	 *
	 * Constraint:
	 *     ((info='RULE' | info='RULES') rules+=SingleRule*)
	 */
	protected void sequence_Rule(ISerializationContext context, Rule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Scanner returns Scanner
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Scanner(ISerializationContext context, Scanner semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RppPackage.Literals.SCANNER__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RppPackage.Literals.SCANNER__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getScannerAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     SingleRule returns SingleRule
	 *
	 * Constraint:
	 *     (start=RuleStart? rule=RuleDefinition content=CodeBlock)
	 */
	protected void sequence_SingleRule(ISerializationContext context, SingleRule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
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
			if (transientValues.isValueTransient(semanticObject, RppPackage.Literals.START_STATE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RppPackage.Literals.START_STATE__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getStartStateAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     StartStates returns StartStates
	 *
	 * Constraint:
	 *     (incstates+=StartState incstates+=StartState* (exstates+=StartState exstates+=StartState*)?)
	 */
	protected void sequence_StartStates(ISerializationContext context, StartStates semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
