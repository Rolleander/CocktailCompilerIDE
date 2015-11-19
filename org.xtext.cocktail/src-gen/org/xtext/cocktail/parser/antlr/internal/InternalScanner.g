/*
 * generated by Xtext
 */
grammar InternalScanner;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package org.xtext.cocktail.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.xtext.cocktail.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.cocktail.services.ScannerGrammarAccess;

}

@parser::members {

 	private ScannerGrammarAccess grammarAccess;
 	
    public InternalScannerParser(TokenStream input, ScannerGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }
    
    @Override
    protected String getFirstRuleName() {
    	return "Model";	
   	}
   	
   	@Override
   	protected ScannerGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleModel
entryRuleModel returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getModelRule()); }
	 iv_ruleModel=ruleModel 
	 { $current=$iv_ruleModel.current; } 
	 EOF 
;

// Rule Model
ruleModel returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{ 
	        newCompositeNode(grammarAccess.getModelAccess().getScannerTitleParserRuleCall_0_0()); 
	    }
		lv_scanner_0_0=ruleTitle		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getModelRule());
	        }
       		add(
       			$current, 
       			"scanner",
        		lv_scanner_0_0, 
        		"Title");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getModelAccess().getScannerExportParserRuleCall_1_0()); 
	    }
		lv_scanner_1_0=ruleExport		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getModelRule());
	        }
       		add(
       			$current, 
       			"scanner",
        		lv_scanner_1_0, 
        		"Export");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getModelAccess().getScannerGlobalParserRuleCall_2_0()); 
	    }
		lv_scanner_2_0=ruleGlobal		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getModelRule());
	        }
       		add(
       			$current, 
       			"scanner",
        		lv_scanner_2_0, 
        		"Global");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getModelAccess().getScannerLocalParserRuleCall_3_0()); 
	    }
		lv_scanner_3_0=ruleLocal		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getModelRule());
	        }
       		add(
       			$current, 
       			"scanner",
        		lv_scanner_3_0, 
        		"Local");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getModelAccess().getScannerDefaultParserRuleCall_4_0()); 
	    }
		lv_scanner_4_0=ruleDefault		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getModelRule());
	        }
       		add(
       			$current, 
       			"scanner",
        		lv_scanner_4_0, 
        		"Default");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getModelAccess().getScannerEofParserRuleCall_5_0()); 
	    }
		lv_scanner_5_0=ruleEof		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getModelRule());
	        }
       		add(
       			$current, 
       			"scanner",
        		lv_scanner_5_0, 
        		"Eof");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getModelAccess().getScannerDefineParserRuleCall_6_0()); 
	    }
		lv_scanner_6_0=ruleDefine		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getModelRule());
	        }
       		add(
       			$current, 
       			"scanner",
        		lv_scanner_6_0, 
        		"Define");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getModelAccess().getScannerStartStatesParserRuleCall_7_0()); 
	    }
		lv_scanner_7_0=ruleStartStates		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getModelRule());
	        }
       		add(
       			$current, 
       			"scanner",
        		lv_scanner_7_0, 
        		"StartStates");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getModelAccess().getScannerRuleParserRuleCall_8_0()); 
	    }
		lv_scanner_8_0=ruleRule		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getModelRule());
	        }
       		add(
       			$current, 
       			"scanner",
        		lv_scanner_8_0, 
        		"Rule");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleTitle
entryRuleTitle returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getTitleRule()); }
	 iv_ruleTitle=ruleTitle 
	 { $current=$iv_ruleTitle.current; } 
	 EOF 
;

// Rule Title
ruleTitle returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='SCANNER' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getTitleAccess().getSCANNERKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getTitleAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getTitleRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
))
;





// Entry rule entryRuleExport
entryRuleExport returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getExportRule()); }
	 iv_ruleExport=ruleExport 
	 { $current=$iv_ruleExport.current; } 
	 EOF 
;

// Rule Export
ruleExport returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='EXPORT {' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getExportAccess().getEXPORTKeyword_0());
    }
(
(
		lv_content_1_0=RULE_ID
		{
			newLeafNode(lv_content_1_0, grammarAccess.getExportAccess().getContentIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getExportRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"content",
        		lv_content_1_0, 
        		"ID");
	    }

)
)	otherlv_2='}' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getExportAccess().getRightCurlyBracketKeyword_2());
    }
)
;





// Entry rule entryRuleGlobal
entryRuleGlobal returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getGlobalRule()); }
	 iv_ruleGlobal=ruleGlobal 
	 { $current=$iv_ruleGlobal.current; } 
	 EOF 
;

// Rule Global
ruleGlobal returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='GLOBAL {' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getGlobalAccess().getGLOBALKeyword_0());
    }
(
(
		lv_content_1_0=RULE_ID
		{
			newLeafNode(lv_content_1_0, grammarAccess.getGlobalAccess().getContentIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getGlobalRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"content",
        		lv_content_1_0, 
        		"ID");
	    }

)
)	otherlv_2='}' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getGlobalAccess().getRightCurlyBracketKeyword_2());
    }
)
;





// Entry rule entryRuleLocal
entryRuleLocal returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getLocalRule()); }
	 iv_ruleLocal=ruleLocal 
	 { $current=$iv_ruleLocal.current; } 
	 EOF 
;

// Rule Local
ruleLocal returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='LOCAL {' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getLocalAccess().getLOCALKeyword_0());
    }
(
(
		lv_content_1_0=RULE_ID
		{
			newLeafNode(lv_content_1_0, grammarAccess.getLocalAccess().getContentIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getLocalRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"content",
        		lv_content_1_0, 
        		"ID");
	    }

)
)	otherlv_2='}' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getLocalAccess().getRightCurlyBracketKeyword_2());
    }
)
;





// Entry rule entryRuleDefault
entryRuleDefault returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getDefaultRule()); }
	 iv_ruleDefault=ruleDefault 
	 { $current=$iv_ruleDefault.current; } 
	 EOF 
;

// Rule Default
ruleDefault returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='DEFAULT {' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getDefaultAccess().getDEFAULTKeyword_0());
    }
(
(
		lv_content_1_0=RULE_ID
		{
			newLeafNode(lv_content_1_0, grammarAccess.getDefaultAccess().getContentIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getDefaultRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"content",
        		lv_content_1_0, 
        		"ID");
	    }

)
)	otherlv_2='}' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getDefaultAccess().getRightCurlyBracketKeyword_2());
    }
)
;





// Entry rule entryRuleEof
entryRuleEof returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getEofRule()); }
	 iv_ruleEof=ruleEof 
	 { $current=$iv_ruleEof.current; } 
	 EOF 
;

// Rule Eof
ruleEof returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='EOF {' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getEofAccess().getEOFKeyword_0());
    }
(
(
		lv_content_1_0=RULE_ID
		{
			newLeafNode(lv_content_1_0, grammarAccess.getEofAccess().getContentIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getEofRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"content",
        		lv_content_1_0, 
        		"ID");
	    }

)
)	otherlv_2='}' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getEofAccess().getRightCurlyBracketKeyword_2());
    }
)
;





// Entry rule entryRuleDefine
entryRuleDefine returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getDefineRule()); }
	 iv_ruleDefine=ruleDefine 
	 { $current=$iv_ruleDefine.current; } 
	 EOF 
;

// Rule Define
ruleDefine returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='DEFINE' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getDefineAccess().getDEFINEKeyword_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getDefineAccess().getDefinesDefineRuleParserRuleCall_1_0()); 
	    }
		lv_defines_1_0=ruleDefineRule		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getDefineRule());
	        }
       		add(
       			$current, 
       			"defines",
        		lv_defines_1_0, 
        		"DefineRule");
	        afterParserOrEnumRuleCall();
	    }

)
)+)
;





// Entry rule entryRuleDefineRule
entryRuleDefineRule returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getDefineRuleRule()); }
	 iv_ruleDefineRule=ruleDefineRule 
	 { $current=$iv_ruleDefineRule.current; } 
	 EOF 
;

// Rule DefineRule
ruleDefineRule returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		lv_defineName_0_0=RULE_ID
		{
			newLeafNode(lv_defineName_0_0, grammarAccess.getDefineRuleAccess().getDefineNameIDTerminalRuleCall_0_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getDefineRuleRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"defineName",
        		lv_defineName_0_0, 
        		"ID");
	    }

)
)	otherlv_1='=' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getDefineRuleAccess().getEqualsSignKeyword_1());
    }
(
(
		lv_defineRule_2_0=RULE_ID
		{
			newLeafNode(lv_defineRule_2_0, grammarAccess.getDefineRuleAccess().getDefineRuleIDTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getDefineRuleRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"defineRule",
        		lv_defineRule_2_0, 
        		"ID");
	    }

)
))
;





// Entry rule entryRuleStartStates
entryRuleStartStates returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getStartStatesRule()); }
	 iv_ruleStartStates=ruleStartStates 
	 { $current=$iv_ruleStartStates.current; } 
	 EOF 
;

// Rule StartStates
ruleStartStates returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='START' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getStartStatesAccess().getSTARTKeyword_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getStartStatesAccess().getStatesStartStateParserRuleCall_1_0()); 
	    }
		lv_states_1_0=ruleStartState		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getStartStatesRule());
	        }
       		add(
       			$current, 
       			"states",
        		lv_states_1_0, 
        		"StartState");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_2=',' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getStartStatesAccess().getCommaKeyword_2_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getStartStatesAccess().getStatesStartStateParserRuleCall_2_1_0()); 
	    }
		lv_states_3_0=ruleStartState		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getStartStatesRule());
	        }
       		add(
       			$current, 
       			"states",
        		lv_states_3_0, 
        		"StartState");
	        afterParserOrEnumRuleCall();
	    }

)
))*)
;





// Entry rule entryRuleStartState
entryRuleStartState returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getStartStateRule()); }
	 iv_ruleStartState=ruleStartState 
	 { $current=$iv_ruleStartState.current; } 
	 EOF 
;

// Rule StartState
ruleStartState returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		lv_name_0_0=RULE_ID
		{
			newLeafNode(lv_name_0_0, grammarAccess.getStartStateAccess().getNameIDTerminalRuleCall_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getStartStateRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_0_0, 
        		"ID");
	    }

)
)
;





// Entry rule entryRuleRule
entryRuleRule returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getRuleRule()); }
	 iv_ruleRule=ruleRule 
	 { $current=$iv_ruleRule.current; } 
	 EOF 
;

// Rule Rule
ruleRule returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='RULE' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getRuleAccess().getRULEKeyword_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getRuleAccess().getContentSingleRuleParserRuleCall_1_0()); 
	    }
		lv_content_1_0=ruleSingleRule		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getRuleRule());
	        }
       		set(
       			$current, 
       			"content",
        		lv_content_1_0, 
        		"SingleRule");
	        afterParserOrEnumRuleCall();
	    }

)
)*)
;





// Entry rule entryRuleSingleRule
entryRuleSingleRule returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getSingleRuleRule()); }
	 iv_ruleSingleRule=ruleSingleRule 
	 { $current=$iv_ruleSingleRule.current; } 
	 EOF 
;

// Rule SingleRule
ruleSingleRule returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='#' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getSingleRuleAccess().getNumberSignKeyword_0());
    }
((
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getSingleRuleRule());
	        }
        }
	otherlv_1=RULE_ID
	{
		newLeafNode(otherlv_1, grammarAccess.getSingleRuleAccess().getStateStartStateCrossReference_1_0_0()); 
	}

)
)
    |	otherlv_2='STD' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getSingleRuleAccess().getSTDKeyword_1_1());
    }
)	otherlv_3='#' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getSingleRuleAccess().getNumberSignKeyword_2());
    }
(
(
		lv_regex_4_0=RULE_ANY_OTHER
		{
			newLeafNode(lv_regex_4_0, grammarAccess.getSingleRuleAccess().getRegexANY_OTHERTerminalRuleCall_3_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getSingleRuleRule());
	        }
       		addWithLastConsumed(
       			$current, 
       			"regex",
        		lv_regex_4_0, 
        		"ANY_OTHER");
	    }

)
)+	otherlv_5=': {' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getSingleRuleAccess().getColonSpaceLeftCurlyBracketKeyword_4());
    }
this_STRING_6=RULE_STRING
    { 
    newLeafNode(this_STRING_6, grammarAccess.getSingleRuleAccess().getSTRINGTerminalRuleCall_5()); 
    }
	otherlv_7='}' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getSingleRuleAccess().getRightCurlyBracketKeyword_6());
    }
)
;





// Entry rule entryRuleRegularExpression
entryRuleRegularExpression returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getRegularExpressionRule()); }
	 iv_ruleRegularExpression=ruleRegularExpression 
	 { $current=$iv_ruleRegularExpression.current; } 
	 EOF 
;

// Rule RegularExpression
ruleRegularExpression returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:

    { 
        newCompositeNode(grammarAccess.getRegularExpressionAccess().getOrExpressionParserRuleCall()); 
    }
    this_OrExpression_0=ruleOrExpression
    { 
        $current = $this_OrExpression_0.current; 
        afterParserOrEnumRuleCall();
    }

;





// Entry rule entryRuleOrExpression
entryRuleOrExpression returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getOrExpressionRule()); }
	 iv_ruleOrExpression=ruleOrExpression 
	 { $current=$iv_ruleOrExpression.current; } 
	 EOF 
;

// Rule OrExpression
ruleOrExpression returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getOrExpressionAccess().getSequenceExpressionParserRuleCall_0()); 
    }
    this_SequenceExpression_0=ruleSequenceExpression
    { 
        $current = $this_SequenceExpression_0.current; 
        afterParserOrEnumRuleCall();
    }
((
    {
        $current = forceCreateModelElementAndSet(
            grammarAccess.getOrExpressionAccess().getOrExpressionLeftAction_1_0(),
            $current);
    }
)	otherlv_2='+' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getOrExpressionAccess().getPlusSignKeyword_1_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getOrExpressionAccess().getRightSequenceExpressionParserRuleCall_1_2_0()); 
	    }
		lv_right_3_0=ruleSequenceExpression		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getOrExpressionRule());
	        }
       		set(
       			$current, 
       			"right",
        		lv_right_3_0, 
        		"SequenceExpression");
	        afterParserOrEnumRuleCall();
	    }

)
))*)
;





// Entry rule entryRuleSequenceExpression
entryRuleSequenceExpression returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getSequenceExpressionRule()); }
	 iv_ruleSequenceExpression=ruleSequenceExpression 
	 { $current=$iv_ruleSequenceExpression.current; } 
	 EOF 
;

// Rule SequenceExpression
ruleSequenceExpression returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getSequenceExpressionAccess().getHighBindExpressionParserRuleCall_0()); 
    }
    this_HighBindExpression_0=ruleHighBindExpression
    { 
        $current = $this_HighBindExpression_0.current; 
        afterParserOrEnumRuleCall();
    }
((
    {
        $current = forceCreateModelElementAndSet(
            grammarAccess.getSequenceExpressionAccess().getSequenceExpressionLeftAction_1_0(),
            $current);
    }
)(
(
		{ 
	        newCompositeNode(grammarAccess.getSequenceExpressionAccess().getRightHighBindExpressionParserRuleCall_1_1_0()); 
	    }
		lv_right_2_0=ruleHighBindExpression		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getSequenceExpressionRule());
	        }
       		set(
       			$current, 
       			"right",
        		lv_right_2_0, 
        		"HighBindExpression");
	        afterParserOrEnumRuleCall();
	    }

)
))*)
;





// Entry rule entryRuleHighBindExpression
entryRuleHighBindExpression returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getHighBindExpressionRule()); }
	 iv_ruleHighBindExpression=ruleHighBindExpression 
	 { $current=$iv_ruleHighBindExpression.current; } 
	 EOF 
;

// Rule HighBindExpression
ruleHighBindExpression returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getHighBindExpressionAccess().getAtomicExpressionParserRuleCall_0()); 
    }
    this_AtomicExpression_0=ruleAtomicExpression
    { 
        $current = $this_AtomicExpression_0.current; 
        afterParserOrEnumRuleCall();
    }
(	otherlv_1='*' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getHighBindExpressionAccess().getAsteriskKeyword_1_0());
    }
(
    {
        $current = forceCreateModelElementAndSet(
            grammarAccess.getHighBindExpressionAccess().getStarExpressionInnerExpressionAction_1_1(),
            $current);
    }
)(	otherlv_3='*' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getHighBindExpressionAccess().getAsteriskKeyword_1_2());
    }
)*)?)
;





// Entry rule entryRuleAtomicExpression
entryRuleAtomicExpression returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getAtomicExpressionRule()); }
	 iv_ruleAtomicExpression=ruleAtomicExpression 
	 { $current=$iv_ruleAtomicExpression.current; } 
	 EOF 
;

// Rule AtomicExpression
ruleAtomicExpression returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getAtomicExpressionAccess().getBracedExpressionParserRuleCall_0()); 
    }
    this_BracedExpression_0=ruleBracedExpression
    { 
        $current = $this_BracedExpression_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getAtomicExpressionAccess().getAtomParserRuleCall_1()); 
    }
    this_Atom_1=ruleAtom
    { 
        $current = $this_Atom_1.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleBracedExpression
entryRuleBracedExpression returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getBracedExpressionRule()); }
	 iv_ruleBracedExpression=ruleBracedExpression 
	 { $current=$iv_ruleBracedExpression.current; } 
	 EOF 
;

// Rule BracedExpression
ruleBracedExpression returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='(' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getBracedExpressionAccess().getLeftParenthesisKeyword_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getBracedExpressionAccess().getInnerExpressionRegularExpressionParserRuleCall_1_0()); 
	    }
		lv_innerExpression_1_0=ruleRegularExpression		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getBracedExpressionRule());
	        }
       		set(
       			$current, 
       			"innerExpression",
        		lv_innerExpression_1_0, 
        		"RegularExpression");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_2=')' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getBracedExpressionAccess().getRightParenthesisKeyword_2());
    }
)
;





// Entry rule entryRuleAtom
entryRuleAtom returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getAtomRule()); }
	 iv_ruleAtom=ruleAtom 
	 { $current=$iv_ruleAtom.current; } 
	 EOF 
;

// Rule Atom
ruleAtom returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		lv_value_0_0=RULE_CHAR
		{
			newLeafNode(lv_value_0_0, grammarAccess.getAtomAccess().getValueCHARTerminalRuleCall_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getAtomRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"value",
        		lv_value_0_0, 
        		"CHAR");
	    }

)
)
;





RULE_CHAR : ('a'..'z'|'A'..'Z'|'0'..'9');

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;


