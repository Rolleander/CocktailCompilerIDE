/*
 * generated by Xtext 2.9.1
 */
package org.xtext.cocktail.serializer;

import com.google.inject.Inject;
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
import org.xtext.cocktail.scanner.Begin;
import org.xtext.cocktail.scanner.Close;
import org.xtext.cocktail.scanner.Default;
import org.xtext.cocktail.scanner.Define;
import org.xtext.cocktail.scanner.DefineRule;
import org.xtext.cocktail.scanner.Eof;
import org.xtext.cocktail.scanner.Export;
import org.xtext.cocktail.scanner.Global;
import org.xtext.cocktail.scanner.Local;
import org.xtext.cocktail.scanner.Model;
import org.xtext.cocktail.scanner.Rule;
import org.xtext.cocktail.scanner.RuleDefinition;
import org.xtext.cocktail.scanner.RuleStart;
import org.xtext.cocktail.scanner.Scanner;
import org.xtext.cocktail.scanner.ScannerPackage;
import org.xtext.cocktail.scanner.SingleRule;
import org.xtext.cocktail.scanner.StartState;
import org.xtext.cocktail.scanner.StartStates;
import org.xtext.cocktail.services.ScannerGrammarAccess;

@SuppressWarnings("all")
public class ScannerSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private ScannerGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == ScannerPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case ScannerPackage.BEGIN:
				sequence_Begin(context, (Begin) semanticObject); 
				return; 
			case ScannerPackage.CLOSE:
				sequence_Close(context, (Close) semanticObject); 
				return; 
			case ScannerPackage.DEFAULT:
				sequence_Default(context, (Default) semanticObject); 
				return; 
			case ScannerPackage.DEFINE:
				sequence_Define(context, (Define) semanticObject); 
				return; 
			case ScannerPackage.DEFINE_RULE:
				sequence_DefineRule(context, (DefineRule) semanticObject); 
				return; 
			case ScannerPackage.EOF:
				sequence_Eof(context, (Eof) semanticObject); 
				return; 
			case ScannerPackage.EXPORT:
				sequence_Export(context, (Export) semanticObject); 
				return; 
			case ScannerPackage.GLOBAL:
				sequence_Global(context, (Global) semanticObject); 
				return; 
			case ScannerPackage.LOCAL:
				sequence_Local(context, (Local) semanticObject); 
				return; 
			case ScannerPackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case ScannerPackage.RULE:
				sequence_Rule(context, (Rule) semanticObject); 
				return; 
			case ScannerPackage.RULE_DEFINITION:
				sequence_RuleDefinition(context, (RuleDefinition) semanticObject); 
				return; 
			case ScannerPackage.RULE_START:
				if (rule == grammarAccess.getRuleStartRule()) {
					sequence_RuleStart(context, (RuleStart) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getSingleRuleRule()) {
					sequence_RuleStart_SingleRule(context, (RuleStart) semanticObject); 
					return; 
				}
				else break;
			case ScannerPackage.SCANNER:
				sequence_Scanner(context, (Scanner) semanticObject); 
				return; 
			case ScannerPackage.SINGLE_RULE:
				sequence_SingleRule(context, (SingleRule) semanticObject); 
				return; 
			case ScannerPackage.START_STATE:
				sequence_StartState(context, (StartState) semanticObject); 
				return; 
			case ScannerPackage.START_STATES:
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
			if (transientValues.isValueTransient(semanticObject, ScannerPackage.Literals.BEGIN__CONTENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ScannerPackage.Literals.BEGIN__CONTENT));
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
			if (transientValues.isValueTransient(semanticObject, ScannerPackage.Literals.CLOSE__CONTENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ScannerPackage.Literals.CLOSE__CONTENT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getCloseAccess().getContentCodeBlockParserRuleCall_2_0(), semanticObject.getContent());
		feeder.finish();
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
			if (transientValues.isValueTransient(semanticObject, ScannerPackage.Literals.DEFAULT__CONTENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ScannerPackage.Literals.DEFAULT__CONTENT));
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
			if (transientValues.isValueTransient(semanticObject, ScannerPackage.Literals.DEFINE_RULE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ScannerPackage.Literals.DEFINE_RULE__NAME));
			if (transientValues.isValueTransient(semanticObject, ScannerPackage.Literals.DEFINE_RULE__RULE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ScannerPackage.Literals.DEFINE_RULE__RULE));
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
			if (transientValues.isValueTransient(semanticObject, ScannerPackage.Literals.EOF__CONTENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ScannerPackage.Literals.EOF__CONTENT));
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
			if (transientValues.isValueTransient(semanticObject, ScannerPackage.Literals.EXPORT__CONTENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ScannerPackage.Literals.EXPORT__CONTENT));
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
			if (transientValues.isValueTransient(semanticObject, ScannerPackage.Literals.GLOBAL__CONTENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ScannerPackage.Literals.GLOBAL__CONTENT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGlobalAccess().getContentCodeBlockParserRuleCall_2_0(), semanticObject.getContent());
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
			if (transientValues.isValueTransient(semanticObject, ScannerPackage.Literals.LOCAL__CONTENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ScannerPackage.Literals.LOCAL__CONTENT));
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
	 *         scanner+=Scanner 
	 *         (
	 *             scanner+=Export | 
	 *             scanner+=Global | 
	 *             scanner+=Local | 
	 *             scanner+=Default | 
	 *             scanner+=Eof | 
	 *             scanner+=Define | 
	 *             scanner+=StartStates | 
	 *             scanner+=Rule | 
	 *             scanner+=Begin | 
	 *             scanner+=Close
	 *         )*
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
	 *     (reg+=Regex | def+=[DefineRule|ID])+
	 */
	protected void sequence_RuleDefinition(ISerializationContext context, RuleDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     RuleStart returns RuleStart
	 *
	 * Constraint:
	 *     (state+=[StartState|ID] state+=[StartState|ID]*)
	 */
	protected void sequence_RuleStart(ISerializationContext context, RuleStart semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SingleRule returns RuleStart
	 *
	 * Constraint:
	 *     (state+=[StartState|ID] state+=[StartState|ID]* rule=RuleDefinition content=CodeBlock)
	 */
	protected void sequence_RuleStart_SingleRule(ISerializationContext context, RuleStart semanticObject) {
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
			if (transientValues.isValueTransient(semanticObject, ScannerPackage.Literals.SCANNER__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ScannerPackage.Literals.SCANNER__NAME));
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
	 *     (rule=RuleDefinition content=CodeBlock)
	 */
	protected void sequence_SingleRule(ISerializationContext context, SingleRule semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ScannerPackage.Literals.SINGLE_RULE__RULE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ScannerPackage.Literals.SINGLE_RULE__RULE));
			if (transientValues.isValueTransient(semanticObject, ScannerPackage.Literals.SINGLE_RULE__CONTENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ScannerPackage.Literals.SINGLE_RULE__CONTENT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSingleRuleAccess().getRuleRuleDefinitionParserRuleCall_1_0(), semanticObject.getRule());
		feeder.accept(grammarAccess.getSingleRuleAccess().getContentCodeBlockParserRuleCall_5_0(), semanticObject.getContent());
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
			if (transientValues.isValueTransient(semanticObject, ScannerPackage.Literals.START_STATE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ScannerPackage.Literals.START_STATE__NAME));
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
