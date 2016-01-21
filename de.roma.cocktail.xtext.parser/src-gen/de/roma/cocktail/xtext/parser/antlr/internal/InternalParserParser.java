package de.roma.cocktail.xtext.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.roma.cocktail.xtext.services.ParserGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalParserParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_ANY_OTHER", "'SCANNER'", "'PARSER'", "'IMPORT'", "'{'", "'}'", "'EXPORT'", "'GLOBAL'", "'LOCAL'", "'BEGIN'", "'CLOSE'", "'TOKEN'", "'='", "','", "'+'", "'-'", "'('", "')'", "'*'", "'.'", "'/'", "'\\\\'", "'|'", "'?'", "'>'", "'<'", "'#'", "'$'", "'%'", "';'", "':'", "'!'", "'PREC'", "'START'", "'RULE'", "'RULES'", "'['", "']'", "'NONE'", "'LEFT'", "'RIGHT'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=7;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalParserParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalParserParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalParserParser.tokenNames; }
    public String getGrammarFileName() { return "InternalParser.g"; }



     	private ParserGrammarAccess grammarAccess;

        public InternalParserParser(TokenStream input, ParserGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "ParserModel";
       	}

       	@Override
       	protected ParserGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleParserModel"
    // InternalParser.g:65:1: entryRuleParserModel returns [EObject current=null] : iv_ruleParserModel= ruleParserModel EOF ;
    public final EObject entryRuleParserModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParserModel = null;


        try {
            // InternalParser.g:65:52: (iv_ruleParserModel= ruleParserModel EOF )
            // InternalParser.g:66:2: iv_ruleParserModel= ruleParserModel EOF
            {
             newCompositeNode(grammarAccess.getParserModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParserModel=ruleParserModel();

            state._fsp--;

             current =iv_ruleParserModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParserModel"


    // $ANTLR start "ruleParserModel"
    // InternalParser.g:72:1: ruleParserModel returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_scanner_1_0= ruleScannerName ) ) ( (lv_parser_2_0= ruleParserName ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_importBlock_3_0= ruleImport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_exportBlock_4_0= ruleExport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_globalBlock_5_0= ruleGlobal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_localBlock_6_0= ruleLocal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_beginBlock_7_0= ruleBegin ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_closeBlock_8_0= ruleClose ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_tokens_9_0= ruleTokens ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_precedenc_10_0= rulePrecedence ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_start_11_0= ruleStartSymbols ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_rules_12_0= ruleGrammerRules ) ) ) ) ) )+ {...}?) ) ) ;
    public final EObject ruleParserModel() throws RecognitionException {
        EObject current = null;

        EObject lv_scanner_1_0 = null;

        EObject lv_parser_2_0 = null;

        EObject lv_importBlock_3_0 = null;

        EObject lv_exportBlock_4_0 = null;

        EObject lv_globalBlock_5_0 = null;

        EObject lv_localBlock_6_0 = null;

        EObject lv_beginBlock_7_0 = null;

        EObject lv_closeBlock_8_0 = null;

        EObject lv_tokens_9_0 = null;

        EObject lv_precedenc_10_0 = null;

        EObject lv_start_11_0 = null;

        EObject lv_rules_12_0 = null;



        	enterRule();

        try {
            // InternalParser.g:78:2: ( ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_scanner_1_0= ruleScannerName ) ) ( (lv_parser_2_0= ruleParserName ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_importBlock_3_0= ruleImport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_exportBlock_4_0= ruleExport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_globalBlock_5_0= ruleGlobal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_localBlock_6_0= ruleLocal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_beginBlock_7_0= ruleBegin ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_closeBlock_8_0= ruleClose ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_tokens_9_0= ruleTokens ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_precedenc_10_0= rulePrecedence ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_start_11_0= ruleStartSymbols ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_rules_12_0= ruleGrammerRules ) ) ) ) ) )+ {...}?) ) ) )
            // InternalParser.g:79:2: ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_scanner_1_0= ruleScannerName ) ) ( (lv_parser_2_0= ruleParserName ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_importBlock_3_0= ruleImport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_exportBlock_4_0= ruleExport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_globalBlock_5_0= ruleGlobal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_localBlock_6_0= ruleLocal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_beginBlock_7_0= ruleBegin ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_closeBlock_8_0= ruleClose ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_tokens_9_0= ruleTokens ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_precedenc_10_0= rulePrecedence ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_start_11_0= ruleStartSymbols ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_rules_12_0= ruleGrammerRules ) ) ) ) ) )+ {...}?) ) )
            {
            // InternalParser.g:79:2: ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_scanner_1_0= ruleScannerName ) ) ( (lv_parser_2_0= ruleParserName ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_importBlock_3_0= ruleImport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_exportBlock_4_0= ruleExport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_globalBlock_5_0= ruleGlobal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_localBlock_6_0= ruleLocal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_beginBlock_7_0= ruleBegin ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_closeBlock_8_0= ruleClose ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_tokens_9_0= ruleTokens ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_precedenc_10_0= rulePrecedence ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_start_11_0= ruleStartSymbols ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_rules_12_0= ruleGrammerRules ) ) ) ) ) )+ {...}?) ) )
            // InternalParser.g:80:3: ( ( ( ({...}? => ( ({...}? => ( ( (lv_scanner_1_0= ruleScannerName ) ) ( (lv_parser_2_0= ruleParserName ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_importBlock_3_0= ruleImport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_exportBlock_4_0= ruleExport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_globalBlock_5_0= ruleGlobal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_localBlock_6_0= ruleLocal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_beginBlock_7_0= ruleBegin ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_closeBlock_8_0= ruleClose ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_tokens_9_0= ruleTokens ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_precedenc_10_0= rulePrecedence ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_start_11_0= ruleStartSymbols ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_rules_12_0= ruleGrammerRules ) ) ) ) ) )+ {...}?) )
            {
            // InternalParser.g:80:3: ( ( ( ({...}? => ( ({...}? => ( ( (lv_scanner_1_0= ruleScannerName ) ) ( (lv_parser_2_0= ruleParserName ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_importBlock_3_0= ruleImport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_exportBlock_4_0= ruleExport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_globalBlock_5_0= ruleGlobal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_localBlock_6_0= ruleLocal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_beginBlock_7_0= ruleBegin ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_closeBlock_8_0= ruleClose ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_tokens_9_0= ruleTokens ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_precedenc_10_0= rulePrecedence ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_start_11_0= ruleStartSymbols ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_rules_12_0= ruleGrammerRules ) ) ) ) ) )+ {...}?) )
            // InternalParser.g:81:4: ( ( ({...}? => ( ({...}? => ( ( (lv_scanner_1_0= ruleScannerName ) ) ( (lv_parser_2_0= ruleParserName ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_importBlock_3_0= ruleImport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_exportBlock_4_0= ruleExport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_globalBlock_5_0= ruleGlobal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_localBlock_6_0= ruleLocal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_beginBlock_7_0= ruleBegin ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_closeBlock_8_0= ruleClose ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_tokens_9_0= ruleTokens ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_precedenc_10_0= rulePrecedence ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_start_11_0= ruleStartSymbols ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_rules_12_0= ruleGrammerRules ) ) ) ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getParserModelAccess().getUnorderedGroup());
            			
            // InternalParser.g:84:4: ( ( ({...}? => ( ({...}? => ( ( (lv_scanner_1_0= ruleScannerName ) ) ( (lv_parser_2_0= ruleParserName ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_importBlock_3_0= ruleImport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_exportBlock_4_0= ruleExport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_globalBlock_5_0= ruleGlobal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_localBlock_6_0= ruleLocal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_beginBlock_7_0= ruleBegin ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_closeBlock_8_0= ruleClose ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_tokens_9_0= ruleTokens ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_precedenc_10_0= rulePrecedence ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_start_11_0= ruleStartSymbols ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_rules_12_0= ruleGrammerRules ) ) ) ) ) )+ {...}?)
            // InternalParser.g:85:5: ( ({...}? => ( ({...}? => ( ( (lv_scanner_1_0= ruleScannerName ) ) ( (lv_parser_2_0= ruleParserName ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_importBlock_3_0= ruleImport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_exportBlock_4_0= ruleExport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_globalBlock_5_0= ruleGlobal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_localBlock_6_0= ruleLocal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_beginBlock_7_0= ruleBegin ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_closeBlock_8_0= ruleClose ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_tokens_9_0= ruleTokens ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_precedenc_10_0= rulePrecedence ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_start_11_0= ruleStartSymbols ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_rules_12_0= ruleGrammerRules ) ) ) ) ) )+ {...}?
            {
            // InternalParser.g:85:5: ( ({...}? => ( ({...}? => ( ( (lv_scanner_1_0= ruleScannerName ) ) ( (lv_parser_2_0= ruleParserName ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_importBlock_3_0= ruleImport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_exportBlock_4_0= ruleExport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_globalBlock_5_0= ruleGlobal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_localBlock_6_0= ruleLocal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_beginBlock_7_0= ruleBegin ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_closeBlock_8_0= ruleClose ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_tokens_9_0= ruleTokens ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_precedenc_10_0= rulePrecedence ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_start_11_0= ruleStartSymbols ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_rules_12_0= ruleGrammerRules ) ) ) ) ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=12;
                alt1 = dfa1.predict(input);
                switch (alt1) {
            	case 1 :
            	    // InternalParser.g:86:3: ({...}? => ( ({...}? => ( ( (lv_scanner_1_0= ruleScannerName ) ) ( (lv_parser_2_0= ruleParserName ) ) ) ) ) )
            	    {
            	    // InternalParser.g:86:3: ({...}? => ( ({...}? => ( ( (lv_scanner_1_0= ruleScannerName ) ) ( (lv_parser_2_0= ruleParserName ) ) ) ) ) )
            	    // InternalParser.g:87:4: {...}? => ( ({...}? => ( ( (lv_scanner_1_0= ruleScannerName ) ) ( (lv_parser_2_0= ruleParserName ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleParserModel", "getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalParser.g:87:105: ( ({...}? => ( ( (lv_scanner_1_0= ruleScannerName ) ) ( (lv_parser_2_0= ruleParserName ) ) ) ) )
            	    // InternalParser.g:88:5: ({...}? => ( ( (lv_scanner_1_0= ruleScannerName ) ) ( (lv_parser_2_0= ruleParserName ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getParserModelAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalParser.g:91:8: ({...}? => ( ( (lv_scanner_1_0= ruleScannerName ) ) ( (lv_parser_2_0= ruleParserName ) ) ) )
            	    // InternalParser.g:91:9: {...}? => ( ( (lv_scanner_1_0= ruleScannerName ) ) ( (lv_parser_2_0= ruleParserName ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleParserModel", "true");
            	    }
            	    // InternalParser.g:91:18: ( ( (lv_scanner_1_0= ruleScannerName ) ) ( (lv_parser_2_0= ruleParserName ) ) )
            	    // InternalParser.g:91:19: ( (lv_scanner_1_0= ruleScannerName ) ) ( (lv_parser_2_0= ruleParserName ) )
            	    {
            	    // InternalParser.g:91:19: ( (lv_scanner_1_0= ruleScannerName ) )
            	    // InternalParser.g:92:9: (lv_scanner_1_0= ruleScannerName )
            	    {
            	    // InternalParser.g:92:9: (lv_scanner_1_0= ruleScannerName )
            	    // InternalParser.g:93:10: lv_scanner_1_0= ruleScannerName
            	    {

            	    										newCompositeNode(grammarAccess.getParserModelAccess().getScannerScannerNameParserRuleCall_0_0_0());
            	    									
            	    pushFollow(FOLLOW_3);
            	    lv_scanner_1_0=ruleScannerName();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getParserModelRule());
            	    										}
            	    										set(
            	    											current,
            	    											"scanner",
            	    											lv_scanner_1_0,
            	    											"de.roma.cocktail.xtext.Parser.ScannerName");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }

            	    // InternalParser.g:110:8: ( (lv_parser_2_0= ruleParserName ) )
            	    // InternalParser.g:111:9: (lv_parser_2_0= ruleParserName )
            	    {
            	    // InternalParser.g:111:9: (lv_parser_2_0= ruleParserName )
            	    // InternalParser.g:112:10: lv_parser_2_0= ruleParserName
            	    {

            	    										newCompositeNode(grammarAccess.getParserModelAccess().getParserParserNameParserRuleCall_0_1_0());
            	    									
            	    pushFollow(FOLLOW_4);
            	    lv_parser_2_0=ruleParserName();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getParserModelRule());
            	    										}
            	    										set(
            	    											current,
            	    											"parser",
            	    											lv_parser_2_0,
            	    											"de.roma.cocktail.xtext.Parser.ParserName");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getParserModelAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalParser.g:135:3: ({...}? => ( ({...}? => ( (lv_importBlock_3_0= ruleImport ) ) ) ) )
            	    {
            	    // InternalParser.g:135:3: ({...}? => ( ({...}? => ( (lv_importBlock_3_0= ruleImport ) ) ) ) )
            	    // InternalParser.g:136:4: {...}? => ( ({...}? => ( (lv_importBlock_3_0= ruleImport ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleParserModel", "getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalParser.g:136:105: ( ({...}? => ( (lv_importBlock_3_0= ruleImport ) ) ) )
            	    // InternalParser.g:137:5: ({...}? => ( (lv_importBlock_3_0= ruleImport ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getParserModelAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalParser.g:140:8: ({...}? => ( (lv_importBlock_3_0= ruleImport ) ) )
            	    // InternalParser.g:140:9: {...}? => ( (lv_importBlock_3_0= ruleImport ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleParserModel", "true");
            	    }
            	    // InternalParser.g:140:18: ( (lv_importBlock_3_0= ruleImport ) )
            	    // InternalParser.g:140:19: (lv_importBlock_3_0= ruleImport )
            	    {
            	    // InternalParser.g:140:19: (lv_importBlock_3_0= ruleImport )
            	    // InternalParser.g:141:9: lv_importBlock_3_0= ruleImport
            	    {

            	    									newCompositeNode(grammarAccess.getParserModelAccess().getImportBlockImportParserRuleCall_1_0());
            	    								
            	    pushFollow(FOLLOW_4);
            	    lv_importBlock_3_0=ruleImport();

            	    state._fsp--;


            	    									if (current==null) {
            	    										current = createModelElementForParent(grammarAccess.getParserModelRule());
            	    									}
            	    									set(
            	    										current,
            	    										"importBlock",
            	    										lv_importBlock_3_0,
            	    										"de.roma.cocktail.xtext.Parser.Import");
            	    									afterParserOrEnumRuleCall();
            	    								

            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getParserModelAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalParser.g:163:3: ({...}? => ( ({...}? => ( (lv_exportBlock_4_0= ruleExport ) ) ) ) )
            	    {
            	    // InternalParser.g:163:3: ({...}? => ( ({...}? => ( (lv_exportBlock_4_0= ruleExport ) ) ) ) )
            	    // InternalParser.g:164:4: {...}? => ( ({...}? => ( (lv_exportBlock_4_0= ruleExport ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleParserModel", "getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalParser.g:164:105: ( ({...}? => ( (lv_exportBlock_4_0= ruleExport ) ) ) )
            	    // InternalParser.g:165:5: ({...}? => ( (lv_exportBlock_4_0= ruleExport ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getParserModelAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalParser.g:168:8: ({...}? => ( (lv_exportBlock_4_0= ruleExport ) ) )
            	    // InternalParser.g:168:9: {...}? => ( (lv_exportBlock_4_0= ruleExport ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleParserModel", "true");
            	    }
            	    // InternalParser.g:168:18: ( (lv_exportBlock_4_0= ruleExport ) )
            	    // InternalParser.g:168:19: (lv_exportBlock_4_0= ruleExport )
            	    {
            	    // InternalParser.g:168:19: (lv_exportBlock_4_0= ruleExport )
            	    // InternalParser.g:169:9: lv_exportBlock_4_0= ruleExport
            	    {

            	    									newCompositeNode(grammarAccess.getParserModelAccess().getExportBlockExportParserRuleCall_2_0());
            	    								
            	    pushFollow(FOLLOW_4);
            	    lv_exportBlock_4_0=ruleExport();

            	    state._fsp--;


            	    									if (current==null) {
            	    										current = createModelElementForParent(grammarAccess.getParserModelRule());
            	    									}
            	    									set(
            	    										current,
            	    										"exportBlock",
            	    										lv_exportBlock_4_0,
            	    										"de.roma.cocktail.xtext.Parser.Export");
            	    									afterParserOrEnumRuleCall();
            	    								

            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getParserModelAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalParser.g:191:3: ({...}? => ( ({...}? => ( (lv_globalBlock_5_0= ruleGlobal ) ) ) ) )
            	    {
            	    // InternalParser.g:191:3: ({...}? => ( ({...}? => ( (lv_globalBlock_5_0= ruleGlobal ) ) ) ) )
            	    // InternalParser.g:192:4: {...}? => ( ({...}? => ( (lv_globalBlock_5_0= ruleGlobal ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleParserModel", "getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup(), 3)");
            	    }
            	    // InternalParser.g:192:105: ( ({...}? => ( (lv_globalBlock_5_0= ruleGlobal ) ) ) )
            	    // InternalParser.g:193:5: ({...}? => ( (lv_globalBlock_5_0= ruleGlobal ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getParserModelAccess().getUnorderedGroup(), 3);
            	    				
            	    // InternalParser.g:196:8: ({...}? => ( (lv_globalBlock_5_0= ruleGlobal ) ) )
            	    // InternalParser.g:196:9: {...}? => ( (lv_globalBlock_5_0= ruleGlobal ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleParserModel", "true");
            	    }
            	    // InternalParser.g:196:18: ( (lv_globalBlock_5_0= ruleGlobal ) )
            	    // InternalParser.g:196:19: (lv_globalBlock_5_0= ruleGlobal )
            	    {
            	    // InternalParser.g:196:19: (lv_globalBlock_5_0= ruleGlobal )
            	    // InternalParser.g:197:9: lv_globalBlock_5_0= ruleGlobal
            	    {

            	    									newCompositeNode(grammarAccess.getParserModelAccess().getGlobalBlockGlobalParserRuleCall_3_0());
            	    								
            	    pushFollow(FOLLOW_4);
            	    lv_globalBlock_5_0=ruleGlobal();

            	    state._fsp--;


            	    									if (current==null) {
            	    										current = createModelElementForParent(grammarAccess.getParserModelRule());
            	    									}
            	    									set(
            	    										current,
            	    										"globalBlock",
            	    										lv_globalBlock_5_0,
            	    										"de.roma.cocktail.xtext.Parser.Global");
            	    									afterParserOrEnumRuleCall();
            	    								

            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getParserModelAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalParser.g:219:3: ({...}? => ( ({...}? => ( (lv_localBlock_6_0= ruleLocal ) ) ) ) )
            	    {
            	    // InternalParser.g:219:3: ({...}? => ( ({...}? => ( (lv_localBlock_6_0= ruleLocal ) ) ) ) )
            	    // InternalParser.g:220:4: {...}? => ( ({...}? => ( (lv_localBlock_6_0= ruleLocal ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleParserModel", "getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup(), 4)");
            	    }
            	    // InternalParser.g:220:105: ( ({...}? => ( (lv_localBlock_6_0= ruleLocal ) ) ) )
            	    // InternalParser.g:221:5: ({...}? => ( (lv_localBlock_6_0= ruleLocal ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getParserModelAccess().getUnorderedGroup(), 4);
            	    				
            	    // InternalParser.g:224:8: ({...}? => ( (lv_localBlock_6_0= ruleLocal ) ) )
            	    // InternalParser.g:224:9: {...}? => ( (lv_localBlock_6_0= ruleLocal ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleParserModel", "true");
            	    }
            	    // InternalParser.g:224:18: ( (lv_localBlock_6_0= ruleLocal ) )
            	    // InternalParser.g:224:19: (lv_localBlock_6_0= ruleLocal )
            	    {
            	    // InternalParser.g:224:19: (lv_localBlock_6_0= ruleLocal )
            	    // InternalParser.g:225:9: lv_localBlock_6_0= ruleLocal
            	    {

            	    									newCompositeNode(grammarAccess.getParserModelAccess().getLocalBlockLocalParserRuleCall_4_0());
            	    								
            	    pushFollow(FOLLOW_4);
            	    lv_localBlock_6_0=ruleLocal();

            	    state._fsp--;


            	    									if (current==null) {
            	    										current = createModelElementForParent(grammarAccess.getParserModelRule());
            	    									}
            	    									set(
            	    										current,
            	    										"localBlock",
            	    										lv_localBlock_6_0,
            	    										"de.roma.cocktail.xtext.Parser.Local");
            	    									afterParserOrEnumRuleCall();
            	    								

            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getParserModelAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalParser.g:247:3: ({...}? => ( ({...}? => ( (lv_beginBlock_7_0= ruleBegin ) ) ) ) )
            	    {
            	    // InternalParser.g:247:3: ({...}? => ( ({...}? => ( (lv_beginBlock_7_0= ruleBegin ) ) ) ) )
            	    // InternalParser.g:248:4: {...}? => ( ({...}? => ( (lv_beginBlock_7_0= ruleBegin ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleParserModel", "getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup(), 5)");
            	    }
            	    // InternalParser.g:248:105: ( ({...}? => ( (lv_beginBlock_7_0= ruleBegin ) ) ) )
            	    // InternalParser.g:249:5: ({...}? => ( (lv_beginBlock_7_0= ruleBegin ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getParserModelAccess().getUnorderedGroup(), 5);
            	    				
            	    // InternalParser.g:252:8: ({...}? => ( (lv_beginBlock_7_0= ruleBegin ) ) )
            	    // InternalParser.g:252:9: {...}? => ( (lv_beginBlock_7_0= ruleBegin ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleParserModel", "true");
            	    }
            	    // InternalParser.g:252:18: ( (lv_beginBlock_7_0= ruleBegin ) )
            	    // InternalParser.g:252:19: (lv_beginBlock_7_0= ruleBegin )
            	    {
            	    // InternalParser.g:252:19: (lv_beginBlock_7_0= ruleBegin )
            	    // InternalParser.g:253:9: lv_beginBlock_7_0= ruleBegin
            	    {

            	    									newCompositeNode(grammarAccess.getParserModelAccess().getBeginBlockBeginParserRuleCall_5_0());
            	    								
            	    pushFollow(FOLLOW_4);
            	    lv_beginBlock_7_0=ruleBegin();

            	    state._fsp--;


            	    									if (current==null) {
            	    										current = createModelElementForParent(grammarAccess.getParserModelRule());
            	    									}
            	    									set(
            	    										current,
            	    										"beginBlock",
            	    										lv_beginBlock_7_0,
            	    										"de.roma.cocktail.xtext.Parser.Begin");
            	    									afterParserOrEnumRuleCall();
            	    								

            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getParserModelAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // InternalParser.g:275:3: ({...}? => ( ({...}? => ( (lv_closeBlock_8_0= ruleClose ) ) ) ) )
            	    {
            	    // InternalParser.g:275:3: ({...}? => ( ({...}? => ( (lv_closeBlock_8_0= ruleClose ) ) ) ) )
            	    // InternalParser.g:276:4: {...}? => ( ({...}? => ( (lv_closeBlock_8_0= ruleClose ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleParserModel", "getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup(), 6)");
            	    }
            	    // InternalParser.g:276:105: ( ({...}? => ( (lv_closeBlock_8_0= ruleClose ) ) ) )
            	    // InternalParser.g:277:5: ({...}? => ( (lv_closeBlock_8_0= ruleClose ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getParserModelAccess().getUnorderedGroup(), 6);
            	    				
            	    // InternalParser.g:280:8: ({...}? => ( (lv_closeBlock_8_0= ruleClose ) ) )
            	    // InternalParser.g:280:9: {...}? => ( (lv_closeBlock_8_0= ruleClose ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleParserModel", "true");
            	    }
            	    // InternalParser.g:280:18: ( (lv_closeBlock_8_0= ruleClose ) )
            	    // InternalParser.g:280:19: (lv_closeBlock_8_0= ruleClose )
            	    {
            	    // InternalParser.g:280:19: (lv_closeBlock_8_0= ruleClose )
            	    // InternalParser.g:281:9: lv_closeBlock_8_0= ruleClose
            	    {

            	    									newCompositeNode(grammarAccess.getParserModelAccess().getCloseBlockCloseParserRuleCall_6_0());
            	    								
            	    pushFollow(FOLLOW_4);
            	    lv_closeBlock_8_0=ruleClose();

            	    state._fsp--;


            	    									if (current==null) {
            	    										current = createModelElementForParent(grammarAccess.getParserModelRule());
            	    									}
            	    									set(
            	    										current,
            	    										"closeBlock",
            	    										lv_closeBlock_8_0,
            	    										"de.roma.cocktail.xtext.Parser.Close");
            	    									afterParserOrEnumRuleCall();
            	    								

            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getParserModelAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 8 :
            	    // InternalParser.g:303:3: ({...}? => ( ({...}? => ( (lv_tokens_9_0= ruleTokens ) ) ) ) )
            	    {
            	    // InternalParser.g:303:3: ({...}? => ( ({...}? => ( (lv_tokens_9_0= ruleTokens ) ) ) ) )
            	    // InternalParser.g:304:4: {...}? => ( ({...}? => ( (lv_tokens_9_0= ruleTokens ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup(), 7) ) {
            	        throw new FailedPredicateException(input, "ruleParserModel", "getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup(), 7)");
            	    }
            	    // InternalParser.g:304:105: ( ({...}? => ( (lv_tokens_9_0= ruleTokens ) ) ) )
            	    // InternalParser.g:305:5: ({...}? => ( (lv_tokens_9_0= ruleTokens ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getParserModelAccess().getUnorderedGroup(), 7);
            	    				
            	    // InternalParser.g:308:8: ({...}? => ( (lv_tokens_9_0= ruleTokens ) ) )
            	    // InternalParser.g:308:9: {...}? => ( (lv_tokens_9_0= ruleTokens ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleParserModel", "true");
            	    }
            	    // InternalParser.g:308:18: ( (lv_tokens_9_0= ruleTokens ) )
            	    // InternalParser.g:308:19: (lv_tokens_9_0= ruleTokens )
            	    {
            	    // InternalParser.g:308:19: (lv_tokens_9_0= ruleTokens )
            	    // InternalParser.g:309:9: lv_tokens_9_0= ruleTokens
            	    {

            	    									newCompositeNode(grammarAccess.getParserModelAccess().getTokensTokensParserRuleCall_7_0());
            	    								
            	    pushFollow(FOLLOW_4);
            	    lv_tokens_9_0=ruleTokens();

            	    state._fsp--;


            	    									if (current==null) {
            	    										current = createModelElementForParent(grammarAccess.getParserModelRule());
            	    									}
            	    									set(
            	    										current,
            	    										"tokens",
            	    										lv_tokens_9_0,
            	    										"de.roma.cocktail.xtext.Parser.Tokens");
            	    									afterParserOrEnumRuleCall();
            	    								

            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getParserModelAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 9 :
            	    // InternalParser.g:331:3: ({...}? => ( ({...}? => ( (lv_precedenc_10_0= rulePrecedence ) ) ) ) )
            	    {
            	    // InternalParser.g:331:3: ({...}? => ( ({...}? => ( (lv_precedenc_10_0= rulePrecedence ) ) ) ) )
            	    // InternalParser.g:332:4: {...}? => ( ({...}? => ( (lv_precedenc_10_0= rulePrecedence ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup(), 8) ) {
            	        throw new FailedPredicateException(input, "ruleParserModel", "getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup(), 8)");
            	    }
            	    // InternalParser.g:332:105: ( ({...}? => ( (lv_precedenc_10_0= rulePrecedence ) ) ) )
            	    // InternalParser.g:333:5: ({...}? => ( (lv_precedenc_10_0= rulePrecedence ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getParserModelAccess().getUnorderedGroup(), 8);
            	    				
            	    // InternalParser.g:336:8: ({...}? => ( (lv_precedenc_10_0= rulePrecedence ) ) )
            	    // InternalParser.g:336:9: {...}? => ( (lv_precedenc_10_0= rulePrecedence ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleParserModel", "true");
            	    }
            	    // InternalParser.g:336:18: ( (lv_precedenc_10_0= rulePrecedence ) )
            	    // InternalParser.g:336:19: (lv_precedenc_10_0= rulePrecedence )
            	    {
            	    // InternalParser.g:336:19: (lv_precedenc_10_0= rulePrecedence )
            	    // InternalParser.g:337:9: lv_precedenc_10_0= rulePrecedence
            	    {

            	    									newCompositeNode(grammarAccess.getParserModelAccess().getPrecedencPrecedenceParserRuleCall_8_0());
            	    								
            	    pushFollow(FOLLOW_4);
            	    lv_precedenc_10_0=rulePrecedence();

            	    state._fsp--;


            	    									if (current==null) {
            	    										current = createModelElementForParent(grammarAccess.getParserModelRule());
            	    									}
            	    									set(
            	    										current,
            	    										"precedenc",
            	    										lv_precedenc_10_0,
            	    										"de.roma.cocktail.xtext.Parser.Precedence");
            	    									afterParserOrEnumRuleCall();
            	    								

            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getParserModelAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 10 :
            	    // InternalParser.g:359:3: ({...}? => ( ({...}? => ( (lv_start_11_0= ruleStartSymbols ) ) ) ) )
            	    {
            	    // InternalParser.g:359:3: ({...}? => ( ({...}? => ( (lv_start_11_0= ruleStartSymbols ) ) ) ) )
            	    // InternalParser.g:360:4: {...}? => ( ({...}? => ( (lv_start_11_0= ruleStartSymbols ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup(), 9) ) {
            	        throw new FailedPredicateException(input, "ruleParserModel", "getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup(), 9)");
            	    }
            	    // InternalParser.g:360:105: ( ({...}? => ( (lv_start_11_0= ruleStartSymbols ) ) ) )
            	    // InternalParser.g:361:5: ({...}? => ( (lv_start_11_0= ruleStartSymbols ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getParserModelAccess().getUnorderedGroup(), 9);
            	    				
            	    // InternalParser.g:364:8: ({...}? => ( (lv_start_11_0= ruleStartSymbols ) ) )
            	    // InternalParser.g:364:9: {...}? => ( (lv_start_11_0= ruleStartSymbols ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleParserModel", "true");
            	    }
            	    // InternalParser.g:364:18: ( (lv_start_11_0= ruleStartSymbols ) )
            	    // InternalParser.g:364:19: (lv_start_11_0= ruleStartSymbols )
            	    {
            	    // InternalParser.g:364:19: (lv_start_11_0= ruleStartSymbols )
            	    // InternalParser.g:365:9: lv_start_11_0= ruleStartSymbols
            	    {

            	    									newCompositeNode(grammarAccess.getParserModelAccess().getStartStartSymbolsParserRuleCall_9_0());
            	    								
            	    pushFollow(FOLLOW_4);
            	    lv_start_11_0=ruleStartSymbols();

            	    state._fsp--;


            	    									if (current==null) {
            	    										current = createModelElementForParent(grammarAccess.getParserModelRule());
            	    									}
            	    									set(
            	    										current,
            	    										"start",
            	    										lv_start_11_0,
            	    										"de.roma.cocktail.xtext.Parser.StartSymbols");
            	    									afterParserOrEnumRuleCall();
            	    								

            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getParserModelAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 11 :
            	    // InternalParser.g:387:3: ({...}? => ( ({...}? => ( (lv_rules_12_0= ruleGrammerRules ) ) ) ) )
            	    {
            	    // InternalParser.g:387:3: ({...}? => ( ({...}? => ( (lv_rules_12_0= ruleGrammerRules ) ) ) ) )
            	    // InternalParser.g:388:4: {...}? => ( ({...}? => ( (lv_rules_12_0= ruleGrammerRules ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup(), 10) ) {
            	        throw new FailedPredicateException(input, "ruleParserModel", "getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup(), 10)");
            	    }
            	    // InternalParser.g:388:106: ( ({...}? => ( (lv_rules_12_0= ruleGrammerRules ) ) ) )
            	    // InternalParser.g:389:5: ({...}? => ( (lv_rules_12_0= ruleGrammerRules ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getParserModelAccess().getUnorderedGroup(), 10);
            	    				
            	    // InternalParser.g:392:8: ({...}? => ( (lv_rules_12_0= ruleGrammerRules ) ) )
            	    // InternalParser.g:392:9: {...}? => ( (lv_rules_12_0= ruleGrammerRules ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleParserModel", "true");
            	    }
            	    // InternalParser.g:392:18: ( (lv_rules_12_0= ruleGrammerRules ) )
            	    // InternalParser.g:392:19: (lv_rules_12_0= ruleGrammerRules )
            	    {
            	    // InternalParser.g:392:19: (lv_rules_12_0= ruleGrammerRules )
            	    // InternalParser.g:393:9: lv_rules_12_0= ruleGrammerRules
            	    {

            	    									newCompositeNode(grammarAccess.getParserModelAccess().getRulesGrammerRulesParserRuleCall_10_0());
            	    								
            	    pushFollow(FOLLOW_4);
            	    lv_rules_12_0=ruleGrammerRules();

            	    state._fsp--;


            	    									if (current==null) {
            	    										current = createModelElementForParent(grammarAccess.getParserModelRule());
            	    									}
            	    									set(
            	    										current,
            	    										"rules",
            	    										lv_rules_12_0,
            	    										"de.roma.cocktail.xtext.Parser.GrammerRules");
            	    									afterParserOrEnumRuleCall();
            	    								

            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getParserModelAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getParserModelAccess().getUnorderedGroup()) ) {
                throw new FailedPredicateException(input, "ruleParserModel", "getUnorderedGroupHelper().canLeave(grammarAccess.getParserModelAccess().getUnorderedGroup())");
            }

            }


            }

             
            			  getUnorderedGroupHelper().leave(grammarAccess.getParserModelAccess().getUnorderedGroup());
            			

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParserModel"


    // $ANTLR start "entryRuleScannerName"
    // InternalParser.g:426:1: entryRuleScannerName returns [EObject current=null] : iv_ruleScannerName= ruleScannerName EOF ;
    public final EObject entryRuleScannerName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScannerName = null;


        try {
            // InternalParser.g:426:52: (iv_ruleScannerName= ruleScannerName EOF )
            // InternalParser.g:427:2: iv_ruleScannerName= ruleScannerName EOF
            {
             newCompositeNode(grammarAccess.getScannerNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleScannerName=ruleScannerName();

            state._fsp--;

             current =iv_ruleScannerName; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleScannerName"


    // $ANTLR start "ruleScannerName"
    // InternalParser.g:433:1: ruleScannerName returns [EObject current=null] : (otherlv_0= 'SCANNER' ( (lv_name_1_0= RULE_ID ) )? ) ;
    public final EObject ruleScannerName() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalParser.g:439:2: ( (otherlv_0= 'SCANNER' ( (lv_name_1_0= RULE_ID ) )? ) )
            // InternalParser.g:440:2: (otherlv_0= 'SCANNER' ( (lv_name_1_0= RULE_ID ) )? )
            {
            // InternalParser.g:440:2: (otherlv_0= 'SCANNER' ( (lv_name_1_0= RULE_ID ) )? )
            // InternalParser.g:441:3: otherlv_0= 'SCANNER' ( (lv_name_1_0= RULE_ID ) )?
            {
            otherlv_0=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getScannerNameAccess().getSCANNERKeyword_0());
            		
            // InternalParser.g:445:3: ( (lv_name_1_0= RULE_ID ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalParser.g:446:4: (lv_name_1_0= RULE_ID )
                    {
                    // InternalParser.g:446:4: (lv_name_1_0= RULE_ID )
                    // InternalParser.g:447:5: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(lv_name_1_0, grammarAccess.getScannerNameAccess().getNameIDTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getScannerNameRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_1_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleScannerName"


    // $ANTLR start "entryRuleParserName"
    // InternalParser.g:467:1: entryRuleParserName returns [EObject current=null] : iv_ruleParserName= ruleParserName EOF ;
    public final EObject entryRuleParserName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParserName = null;


        try {
            // InternalParser.g:467:51: (iv_ruleParserName= ruleParserName EOF )
            // InternalParser.g:468:2: iv_ruleParserName= ruleParserName EOF
            {
             newCompositeNode(grammarAccess.getParserNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParserName=ruleParserName();

            state._fsp--;

             current =iv_ruleParserName; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParserName"


    // $ANTLR start "ruleParserName"
    // InternalParser.g:474:1: ruleParserName returns [EObject current=null] : (otherlv_0= 'PARSER' ( (lv_name_1_0= RULE_ID ) )? ) ;
    public final EObject ruleParserName() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalParser.g:480:2: ( (otherlv_0= 'PARSER' ( (lv_name_1_0= RULE_ID ) )? ) )
            // InternalParser.g:481:2: (otherlv_0= 'PARSER' ( (lv_name_1_0= RULE_ID ) )? )
            {
            // InternalParser.g:481:2: (otherlv_0= 'PARSER' ( (lv_name_1_0= RULE_ID ) )? )
            // InternalParser.g:482:3: otherlv_0= 'PARSER' ( (lv_name_1_0= RULE_ID ) )?
            {
            otherlv_0=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getParserNameAccess().getPARSERKeyword_0());
            		
            // InternalParser.g:486:3: ( (lv_name_1_0= RULE_ID ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalParser.g:487:4: (lv_name_1_0= RULE_ID )
                    {
                    // InternalParser.g:487:4: (lv_name_1_0= RULE_ID )
                    // InternalParser.g:488:5: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(lv_name_1_0, grammarAccess.getParserNameAccess().getNameIDTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getParserNameRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_1_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParserName"


    // $ANTLR start "entryRuleImport"
    // InternalParser.g:508:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalParser.g:508:47: (iv_ruleImport= ruleImport EOF )
            // InternalParser.g:509:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalParser.g:515:1: ruleImport returns [EObject current=null] : (otherlv_0= 'IMPORT' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_content_2_0 = null;



        	enterRule();

        try {
            // InternalParser.g:521:2: ( (otherlv_0= 'IMPORT' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' ) )
            // InternalParser.g:522:2: (otherlv_0= 'IMPORT' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' )
            {
            // InternalParser.g:522:2: (otherlv_0= 'IMPORT' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' )
            // InternalParser.g:523:3: otherlv_0= 'IMPORT' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getImportAccess().getIMPORTKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getImportAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalParser.g:531:3: ( (lv_content_2_0= ruleCodeBlock ) )
            // InternalParser.g:532:4: (lv_content_2_0= ruleCodeBlock )
            {
            // InternalParser.g:532:4: (lv_content_2_0= ruleCodeBlock )
            // InternalParser.g:533:5: lv_content_2_0= ruleCodeBlock
            {

            					newCompositeNode(grammarAccess.getImportAccess().getContentCodeBlockParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_8);
            lv_content_2_0=ruleCodeBlock();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getImportRule());
            					}
            					set(
            						current,
            						"content",
            						lv_content_2_0,
            						"de.roma.cocktail.xtext.Parser.CodeBlock");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getImportAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleExport"
    // InternalParser.g:558:1: entryRuleExport returns [EObject current=null] : iv_ruleExport= ruleExport EOF ;
    public final EObject entryRuleExport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExport = null;


        try {
            // InternalParser.g:558:47: (iv_ruleExport= ruleExport EOF )
            // InternalParser.g:559:2: iv_ruleExport= ruleExport EOF
            {
             newCompositeNode(grammarAccess.getExportRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExport=ruleExport();

            state._fsp--;

             current =iv_ruleExport; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExport"


    // $ANTLR start "ruleExport"
    // InternalParser.g:565:1: ruleExport returns [EObject current=null] : (otherlv_0= 'EXPORT' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' ) ;
    public final EObject ruleExport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_content_2_0 = null;



        	enterRule();

        try {
            // InternalParser.g:571:2: ( (otherlv_0= 'EXPORT' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' ) )
            // InternalParser.g:572:2: (otherlv_0= 'EXPORT' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' )
            {
            // InternalParser.g:572:2: (otherlv_0= 'EXPORT' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' )
            // InternalParser.g:573:3: otherlv_0= 'EXPORT' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getExportAccess().getEXPORTKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getExportAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalParser.g:581:3: ( (lv_content_2_0= ruleCodeBlock ) )
            // InternalParser.g:582:4: (lv_content_2_0= ruleCodeBlock )
            {
            // InternalParser.g:582:4: (lv_content_2_0= ruleCodeBlock )
            // InternalParser.g:583:5: lv_content_2_0= ruleCodeBlock
            {

            					newCompositeNode(grammarAccess.getExportAccess().getContentCodeBlockParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_8);
            lv_content_2_0=ruleCodeBlock();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExportRule());
            					}
            					set(
            						current,
            						"content",
            						lv_content_2_0,
            						"de.roma.cocktail.xtext.Parser.CodeBlock");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getExportAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExport"


    // $ANTLR start "entryRuleGlobal"
    // InternalParser.g:608:1: entryRuleGlobal returns [EObject current=null] : iv_ruleGlobal= ruleGlobal EOF ;
    public final EObject entryRuleGlobal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGlobal = null;


        try {
            // InternalParser.g:608:47: (iv_ruleGlobal= ruleGlobal EOF )
            // InternalParser.g:609:2: iv_ruleGlobal= ruleGlobal EOF
            {
             newCompositeNode(grammarAccess.getGlobalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGlobal=ruleGlobal();

            state._fsp--;

             current =iv_ruleGlobal; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGlobal"


    // $ANTLR start "ruleGlobal"
    // InternalParser.g:615:1: ruleGlobal returns [EObject current=null] : (otherlv_0= 'GLOBAL' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' ) ;
    public final EObject ruleGlobal() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_content_2_0 = null;



        	enterRule();

        try {
            // InternalParser.g:621:2: ( (otherlv_0= 'GLOBAL' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' ) )
            // InternalParser.g:622:2: (otherlv_0= 'GLOBAL' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' )
            {
            // InternalParser.g:622:2: (otherlv_0= 'GLOBAL' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' )
            // InternalParser.g:623:3: otherlv_0= 'GLOBAL' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getGlobalAccess().getGLOBALKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getGlobalAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalParser.g:631:3: ( (lv_content_2_0= ruleCodeBlock ) )
            // InternalParser.g:632:4: (lv_content_2_0= ruleCodeBlock )
            {
            // InternalParser.g:632:4: (lv_content_2_0= ruleCodeBlock )
            // InternalParser.g:633:5: lv_content_2_0= ruleCodeBlock
            {

            					newCompositeNode(grammarAccess.getGlobalAccess().getContentCodeBlockParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_8);
            lv_content_2_0=ruleCodeBlock();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGlobalRule());
            					}
            					set(
            						current,
            						"content",
            						lv_content_2_0,
            						"de.roma.cocktail.xtext.Parser.CodeBlock");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getGlobalAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGlobal"


    // $ANTLR start "entryRuleLocal"
    // InternalParser.g:658:1: entryRuleLocal returns [EObject current=null] : iv_ruleLocal= ruleLocal EOF ;
    public final EObject entryRuleLocal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocal = null;


        try {
            // InternalParser.g:658:46: (iv_ruleLocal= ruleLocal EOF )
            // InternalParser.g:659:2: iv_ruleLocal= ruleLocal EOF
            {
             newCompositeNode(grammarAccess.getLocalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLocal=ruleLocal();

            state._fsp--;

             current =iv_ruleLocal; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLocal"


    // $ANTLR start "ruleLocal"
    // InternalParser.g:665:1: ruleLocal returns [EObject current=null] : (otherlv_0= 'LOCAL' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' ) ;
    public final EObject ruleLocal() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_content_2_0 = null;



        	enterRule();

        try {
            // InternalParser.g:671:2: ( (otherlv_0= 'LOCAL' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' ) )
            // InternalParser.g:672:2: (otherlv_0= 'LOCAL' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' )
            {
            // InternalParser.g:672:2: (otherlv_0= 'LOCAL' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' )
            // InternalParser.g:673:3: otherlv_0= 'LOCAL' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getLocalAccess().getLOCALKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getLocalAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalParser.g:681:3: ( (lv_content_2_0= ruleCodeBlock ) )
            // InternalParser.g:682:4: (lv_content_2_0= ruleCodeBlock )
            {
            // InternalParser.g:682:4: (lv_content_2_0= ruleCodeBlock )
            // InternalParser.g:683:5: lv_content_2_0= ruleCodeBlock
            {

            					newCompositeNode(grammarAccess.getLocalAccess().getContentCodeBlockParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_8);
            lv_content_2_0=ruleCodeBlock();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLocalRule());
            					}
            					set(
            						current,
            						"content",
            						lv_content_2_0,
            						"de.roma.cocktail.xtext.Parser.CodeBlock");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getLocalAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLocal"


    // $ANTLR start "entryRuleBegin"
    // InternalParser.g:708:1: entryRuleBegin returns [EObject current=null] : iv_ruleBegin= ruleBegin EOF ;
    public final EObject entryRuleBegin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBegin = null;


        try {
            // InternalParser.g:708:46: (iv_ruleBegin= ruleBegin EOF )
            // InternalParser.g:709:2: iv_ruleBegin= ruleBegin EOF
            {
             newCompositeNode(grammarAccess.getBeginRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBegin=ruleBegin();

            state._fsp--;

             current =iv_ruleBegin; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBegin"


    // $ANTLR start "ruleBegin"
    // InternalParser.g:715:1: ruleBegin returns [EObject current=null] : (otherlv_0= 'BEGIN' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' ) ;
    public final EObject ruleBegin() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_content_2_0 = null;



        	enterRule();

        try {
            // InternalParser.g:721:2: ( (otherlv_0= 'BEGIN' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' ) )
            // InternalParser.g:722:2: (otherlv_0= 'BEGIN' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' )
            {
            // InternalParser.g:722:2: (otherlv_0= 'BEGIN' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' )
            // InternalParser.g:723:3: otherlv_0= 'BEGIN' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getBeginAccess().getBEGINKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getBeginAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalParser.g:731:3: ( (lv_content_2_0= ruleCodeBlock ) )
            // InternalParser.g:732:4: (lv_content_2_0= ruleCodeBlock )
            {
            // InternalParser.g:732:4: (lv_content_2_0= ruleCodeBlock )
            // InternalParser.g:733:5: lv_content_2_0= ruleCodeBlock
            {

            					newCompositeNode(grammarAccess.getBeginAccess().getContentCodeBlockParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_8);
            lv_content_2_0=ruleCodeBlock();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBeginRule());
            					}
            					set(
            						current,
            						"content",
            						lv_content_2_0,
            						"de.roma.cocktail.xtext.Parser.CodeBlock");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getBeginAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBegin"


    // $ANTLR start "entryRuleClose"
    // InternalParser.g:758:1: entryRuleClose returns [EObject current=null] : iv_ruleClose= ruleClose EOF ;
    public final EObject entryRuleClose() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClose = null;


        try {
            // InternalParser.g:758:46: (iv_ruleClose= ruleClose EOF )
            // InternalParser.g:759:2: iv_ruleClose= ruleClose EOF
            {
             newCompositeNode(grammarAccess.getCloseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClose=ruleClose();

            state._fsp--;

             current =iv_ruleClose; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClose"


    // $ANTLR start "ruleClose"
    // InternalParser.g:765:1: ruleClose returns [EObject current=null] : (otherlv_0= 'CLOSE' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' ) ;
    public final EObject ruleClose() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_content_2_0 = null;



        	enterRule();

        try {
            // InternalParser.g:771:2: ( (otherlv_0= 'CLOSE' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' ) )
            // InternalParser.g:772:2: (otherlv_0= 'CLOSE' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' )
            {
            // InternalParser.g:772:2: (otherlv_0= 'CLOSE' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' )
            // InternalParser.g:773:3: otherlv_0= 'CLOSE' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getCloseAccess().getCLOSEKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getCloseAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalParser.g:781:3: ( (lv_content_2_0= ruleCodeBlock ) )
            // InternalParser.g:782:4: (lv_content_2_0= ruleCodeBlock )
            {
            // InternalParser.g:782:4: (lv_content_2_0= ruleCodeBlock )
            // InternalParser.g:783:5: lv_content_2_0= ruleCodeBlock
            {

            					newCompositeNode(grammarAccess.getCloseAccess().getContentCodeBlockParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_8);
            lv_content_2_0=ruleCodeBlock();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCloseRule());
            					}
            					set(
            						current,
            						"content",
            						lv_content_2_0,
            						"de.roma.cocktail.xtext.Parser.CodeBlock");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getCloseAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClose"


    // $ANTLR start "entryRuleTokens"
    // InternalParser.g:808:1: entryRuleTokens returns [EObject current=null] : iv_ruleTokens= ruleTokens EOF ;
    public final EObject entryRuleTokens() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTokens = null;


        try {
            // InternalParser.g:808:47: (iv_ruleTokens= ruleTokens EOF )
            // InternalParser.g:809:2: iv_ruleTokens= ruleTokens EOF
            {
             newCompositeNode(grammarAccess.getTokensRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTokens=ruleTokens();

            state._fsp--;

             current =iv_ruleTokens; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTokens"


    // $ANTLR start "ruleTokens"
    // InternalParser.g:815:1: ruleTokens returns [EObject current=null] : (otherlv_0= 'TOKEN' ( (lv_tokens_1_0= ruleDefinedToken ) )* ) ;
    public final EObject ruleTokens() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_tokens_1_0 = null;



        	enterRule();

        try {
            // InternalParser.g:821:2: ( (otherlv_0= 'TOKEN' ( (lv_tokens_1_0= ruleDefinedToken ) )* ) )
            // InternalParser.g:822:2: (otherlv_0= 'TOKEN' ( (lv_tokens_1_0= ruleDefinedToken ) )* )
            {
            // InternalParser.g:822:2: (otherlv_0= 'TOKEN' ( (lv_tokens_1_0= ruleDefinedToken ) )* )
            // InternalParser.g:823:3: otherlv_0= 'TOKEN' ( (lv_tokens_1_0= ruleDefinedToken ) )*
            {
            otherlv_0=(Token)match(input,21,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getTokensAccess().getTOKENKeyword_0());
            		
            // InternalParser.g:827:3: ( (lv_tokens_1_0= ruleDefinedToken ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=RULE_ID && LA4_0<=RULE_WS)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalParser.g:828:4: (lv_tokens_1_0= ruleDefinedToken )
            	    {
            	    // InternalParser.g:828:4: (lv_tokens_1_0= ruleDefinedToken )
            	    // InternalParser.g:829:5: lv_tokens_1_0= ruleDefinedToken
            	    {

            	    					newCompositeNode(grammarAccess.getTokensAccess().getTokensDefinedTokenParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_tokens_1_0=ruleDefinedToken();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTokensRule());
            	    					}
            	    					add(
            	    						current,
            	    						"tokens",
            	    						lv_tokens_1_0,
            	    						"de.roma.cocktail.xtext.Parser.DefinedToken");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTokens"


    // $ANTLR start "entryRuleDefinedToken"
    // InternalParser.g:850:1: entryRuleDefinedToken returns [EObject current=null] : iv_ruleDefinedToken= ruleDefinedToken EOF ;
    public final EObject entryRuleDefinedToken() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefinedToken = null;


        try {
            // InternalParser.g:850:53: (iv_ruleDefinedToken= ruleDefinedToken EOF )
            // InternalParser.g:851:2: iv_ruleDefinedToken= ruleDefinedToken EOF
            {
             newCompositeNode(grammarAccess.getDefinedTokenRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDefinedToken=ruleDefinedToken();

            state._fsp--;

             current =iv_ruleDefinedToken; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDefinedToken"


    // $ANTLR start "ruleDefinedToken"
    // InternalParser.g:857:1: ruleDefinedToken returns [EObject current=null] : ( ( ( ( (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING ) ) ) (otherlv_1= '=' ( (lv_number_2_0= RULE_INT ) ) (otherlv_3= ',' ( (lv_extra_4_0= ruleTokenExtra ) ) )? ) ) | ( (lv_extra_5_0= ruleTokenExtra ) ) | this_WS_6= RULE_WS ) ;
    public final EObject ruleDefinedToken() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_1=null;
        Token lv_name_0_2=null;
        Token otherlv_1=null;
        Token lv_number_2_0=null;
        Token otherlv_3=null;
        Token this_WS_6=null;
        EObject lv_extra_4_0 = null;

        EObject lv_extra_5_0 = null;



        	enterRule();

        try {
            // InternalParser.g:863:2: ( ( ( ( ( (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING ) ) ) (otherlv_1= '=' ( (lv_number_2_0= RULE_INT ) ) (otherlv_3= ',' ( (lv_extra_4_0= ruleTokenExtra ) ) )? ) ) | ( (lv_extra_5_0= ruleTokenExtra ) ) | this_WS_6= RULE_WS ) )
            // InternalParser.g:864:2: ( ( ( ( (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING ) ) ) (otherlv_1= '=' ( (lv_number_2_0= RULE_INT ) ) (otherlv_3= ',' ( (lv_extra_4_0= ruleTokenExtra ) ) )? ) ) | ( (lv_extra_5_0= ruleTokenExtra ) ) | this_WS_6= RULE_WS )
            {
            // InternalParser.g:864:2: ( ( ( ( (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING ) ) ) (otherlv_1= '=' ( (lv_number_2_0= RULE_INT ) ) (otherlv_3= ',' ( (lv_extra_4_0= ruleTokenExtra ) ) )? ) ) | ( (lv_extra_5_0= ruleTokenExtra ) ) | this_WS_6= RULE_WS )
            int alt7=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case RULE_STRING:
                {
                alt7=1;
                }
                break;
            case RULE_INT:
                {
                alt7=2;
                }
                break;
            case RULE_WS:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalParser.g:865:3: ( ( ( (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING ) ) ) (otherlv_1= '=' ( (lv_number_2_0= RULE_INT ) ) (otherlv_3= ',' ( (lv_extra_4_0= ruleTokenExtra ) ) )? ) )
                    {
                    // InternalParser.g:865:3: ( ( ( (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING ) ) ) (otherlv_1= '=' ( (lv_number_2_0= RULE_INT ) ) (otherlv_3= ',' ( (lv_extra_4_0= ruleTokenExtra ) ) )? ) )
                    // InternalParser.g:866:4: ( ( (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING ) ) ) (otherlv_1= '=' ( (lv_number_2_0= RULE_INT ) ) (otherlv_3= ',' ( (lv_extra_4_0= ruleTokenExtra ) ) )? )
                    {
                    // InternalParser.g:866:4: ( ( (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING ) ) )
                    // InternalParser.g:867:5: ( (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING ) )
                    {
                    // InternalParser.g:867:5: ( (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING ) )
                    // InternalParser.g:868:6: (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING )
                    {
                    // InternalParser.g:868:6: (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING )
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==RULE_ID) ) {
                        alt5=1;
                    }
                    else if ( (LA5_0==RULE_STRING) ) {
                        alt5=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 0, input);

                        throw nvae;
                    }
                    switch (alt5) {
                        case 1 :
                            // InternalParser.g:869:7: lv_name_0_1= RULE_ID
                            {
                            lv_name_0_1=(Token)match(input,RULE_ID,FOLLOW_10); 

                            							newLeafNode(lv_name_0_1, grammarAccess.getDefinedTokenAccess().getNameIDTerminalRuleCall_0_0_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getDefinedTokenRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"name",
                            								lv_name_0_1,
                            								"org.eclipse.xtext.common.Terminals.ID");
                            						

                            }
                            break;
                        case 2 :
                            // InternalParser.g:884:7: lv_name_0_2= RULE_STRING
                            {
                            lv_name_0_2=(Token)match(input,RULE_STRING,FOLLOW_10); 

                            							newLeafNode(lv_name_0_2, grammarAccess.getDefinedTokenAccess().getNameSTRINGTerminalRuleCall_0_0_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getDefinedTokenRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"name",
                            								lv_name_0_2,
                            								"org.eclipse.xtext.common.Terminals.STRING");
                            						

                            }
                            break;

                    }


                    }


                    }

                    // InternalParser.g:901:4: (otherlv_1= '=' ( (lv_number_2_0= RULE_INT ) ) (otherlv_3= ',' ( (lv_extra_4_0= ruleTokenExtra ) ) )? )
                    // InternalParser.g:902:5: otherlv_1= '=' ( (lv_number_2_0= RULE_INT ) ) (otherlv_3= ',' ( (lv_extra_4_0= ruleTokenExtra ) ) )?
                    {
                    otherlv_1=(Token)match(input,22,FOLLOW_11); 

                    					newLeafNode(otherlv_1, grammarAccess.getDefinedTokenAccess().getEqualsSignKeyword_0_1_0());
                    				
                    // InternalParser.g:906:5: ( (lv_number_2_0= RULE_INT ) )
                    // InternalParser.g:907:6: (lv_number_2_0= RULE_INT )
                    {
                    // InternalParser.g:907:6: (lv_number_2_0= RULE_INT )
                    // InternalParser.g:908:7: lv_number_2_0= RULE_INT
                    {
                    lv_number_2_0=(Token)match(input,RULE_INT,FOLLOW_12); 

                    							newLeafNode(lv_number_2_0, grammarAccess.getDefinedTokenAccess().getNumberINTTerminalRuleCall_0_1_1_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getDefinedTokenRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"number",
                    								lv_number_2_0,
                    								"org.eclipse.xtext.common.Terminals.INT");
                    						

                    }


                    }

                    // InternalParser.g:924:5: (otherlv_3= ',' ( (lv_extra_4_0= ruleTokenExtra ) ) )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==23) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // InternalParser.g:925:6: otherlv_3= ',' ( (lv_extra_4_0= ruleTokenExtra ) )
                            {
                            otherlv_3=(Token)match(input,23,FOLLOW_11); 

                            						newLeafNode(otherlv_3, grammarAccess.getDefinedTokenAccess().getCommaKeyword_0_1_2_0());
                            					
                            // InternalParser.g:929:6: ( (lv_extra_4_0= ruleTokenExtra ) )
                            // InternalParser.g:930:7: (lv_extra_4_0= ruleTokenExtra )
                            {
                            // InternalParser.g:930:7: (lv_extra_4_0= ruleTokenExtra )
                            // InternalParser.g:931:8: lv_extra_4_0= ruleTokenExtra
                            {

                            								newCompositeNode(grammarAccess.getDefinedTokenAccess().getExtraTokenExtraParserRuleCall_0_1_2_1_0());
                            							
                            pushFollow(FOLLOW_2);
                            lv_extra_4_0=ruleTokenExtra();

                            state._fsp--;


                            								if (current==null) {
                            									current = createModelElementForParent(grammarAccess.getDefinedTokenRule());
                            								}
                            								set(
                            									current,
                            									"extra",
                            									lv_extra_4_0,
                            									"de.roma.cocktail.xtext.Parser.TokenExtra");
                            								afterParserOrEnumRuleCall();
                            							

                            }


                            }


                            }
                            break;

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalParser.g:952:3: ( (lv_extra_5_0= ruleTokenExtra ) )
                    {
                    // InternalParser.g:952:3: ( (lv_extra_5_0= ruleTokenExtra ) )
                    // InternalParser.g:953:4: (lv_extra_5_0= ruleTokenExtra )
                    {
                    // InternalParser.g:953:4: (lv_extra_5_0= ruleTokenExtra )
                    // InternalParser.g:954:5: lv_extra_5_0= ruleTokenExtra
                    {

                    					newCompositeNode(grammarAccess.getDefinedTokenAccess().getExtraTokenExtraParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_extra_5_0=ruleTokenExtra();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDefinedTokenRule());
                    					}
                    					set(
                    						current,
                    						"extra",
                    						lv_extra_5_0,
                    						"de.roma.cocktail.xtext.Parser.TokenExtra");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalParser.g:972:3: this_WS_6= RULE_WS
                    {
                    this_WS_6=(Token)match(input,RULE_WS,FOLLOW_2); 

                    			newLeafNode(this_WS_6, grammarAccess.getDefinedTokenAccess().getWSTerminalRuleCall_2());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDefinedToken"


    // $ANTLR start "entryRuleTokenExtra"
    // InternalParser.g:980:1: entryRuleTokenExtra returns [EObject current=null] : iv_ruleTokenExtra= ruleTokenExtra EOF ;
    public final EObject entryRuleTokenExtra() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTokenExtra = null;


        try {
            // InternalParser.g:980:51: (iv_ruleTokenExtra= ruleTokenExtra EOF )
            // InternalParser.g:981:2: iv_ruleTokenExtra= ruleTokenExtra EOF
            {
             newCompositeNode(grammarAccess.getTokenExtraRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTokenExtra=ruleTokenExtra();

            state._fsp--;

             current =iv_ruleTokenExtra; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTokenExtra"


    // $ANTLR start "ruleTokenExtra"
    // InternalParser.g:987:1: ruleTokenExtra returns [EObject current=null] : ( ( (lv_cost_0_0= RULE_INT ) ) otherlv_1= ',' ( (lv_presentation_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleTokenExtra() throws RecognitionException {
        EObject current = null;

        Token lv_cost_0_0=null;
        Token otherlv_1=null;
        Token lv_presentation_2_0=null;


        	enterRule();

        try {
            // InternalParser.g:993:2: ( ( ( (lv_cost_0_0= RULE_INT ) ) otherlv_1= ',' ( (lv_presentation_2_0= RULE_STRING ) ) ) )
            // InternalParser.g:994:2: ( ( (lv_cost_0_0= RULE_INT ) ) otherlv_1= ',' ( (lv_presentation_2_0= RULE_STRING ) ) )
            {
            // InternalParser.g:994:2: ( ( (lv_cost_0_0= RULE_INT ) ) otherlv_1= ',' ( (lv_presentation_2_0= RULE_STRING ) ) )
            // InternalParser.g:995:3: ( (lv_cost_0_0= RULE_INT ) ) otherlv_1= ',' ( (lv_presentation_2_0= RULE_STRING ) )
            {
            // InternalParser.g:995:3: ( (lv_cost_0_0= RULE_INT ) )
            // InternalParser.g:996:4: (lv_cost_0_0= RULE_INT )
            {
            // InternalParser.g:996:4: (lv_cost_0_0= RULE_INT )
            // InternalParser.g:997:5: lv_cost_0_0= RULE_INT
            {
            lv_cost_0_0=(Token)match(input,RULE_INT,FOLLOW_13); 

            					newLeafNode(lv_cost_0_0, grammarAccess.getTokenExtraAccess().getCostINTTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTokenExtraRule());
            					}
            					setWithLastConsumed(
            						current,
            						"cost",
            						lv_cost_0_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_1=(Token)match(input,23,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getTokenExtraAccess().getCommaKeyword_1());
            		
            // InternalParser.g:1017:3: ( (lv_presentation_2_0= RULE_STRING ) )
            // InternalParser.g:1018:4: (lv_presentation_2_0= RULE_STRING )
            {
            // InternalParser.g:1018:4: (lv_presentation_2_0= RULE_STRING )
            // InternalParser.g:1019:5: lv_presentation_2_0= RULE_STRING
            {
            lv_presentation_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_presentation_2_0, grammarAccess.getTokenExtraAccess().getPresentationSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTokenExtraRule());
            					}
            					setWithLastConsumed(
            						current,
            						"presentation",
            						lv_presentation_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTokenExtra"


    // $ANTLR start "entryRuleCodeBlock"
    // InternalParser.g:1039:1: entryRuleCodeBlock returns [String current=null] : iv_ruleCodeBlock= ruleCodeBlock EOF ;
    public final String entryRuleCodeBlock() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCodeBlock = null;


        try {
            // InternalParser.g:1039:49: (iv_ruleCodeBlock= ruleCodeBlock EOF )
            // InternalParser.g:1040:2: iv_ruleCodeBlock= ruleCodeBlock EOF
            {
             newCompositeNode(grammarAccess.getCodeBlockRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCodeBlock=ruleCodeBlock();

            state._fsp--;

             current =iv_ruleCodeBlock.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCodeBlock"


    // $ANTLR start "ruleCodeBlock"
    // InternalParser.g:1046:1: ruleCodeBlock returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_CodeWall_0= ruleCodeWall | (kw= '{' this_CodeBlock_2= ruleCodeBlock kw= '}' ) )* ;
    public final AntlrDatatypeRuleToken ruleCodeBlock() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_CodeWall_0 = null;

        AntlrDatatypeRuleToken this_CodeBlock_2 = null;



        	enterRule();

        try {
            // InternalParser.g:1052:2: ( (this_CodeWall_0= ruleCodeWall | (kw= '{' this_CodeBlock_2= ruleCodeBlock kw= '}' ) )* )
            // InternalParser.g:1053:2: (this_CodeWall_0= ruleCodeWall | (kw= '{' this_CodeBlock_2= ruleCodeBlock kw= '}' ) )*
            {
            // InternalParser.g:1053:2: (this_CodeWall_0= ruleCodeWall | (kw= '{' this_CodeBlock_2= ruleCodeBlock kw= '}' ) )*
            loop8:
            do {
                int alt8=3;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=RULE_ID && LA8_0<=RULE_WS)||(LA8_0>=22 && LA8_0<=41)) ) {
                    alt8=1;
                }
                else if ( (LA8_0==14) ) {
                    alt8=2;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalParser.g:1054:3: this_CodeWall_0= ruleCodeWall
            	    {

            	    			newCompositeNode(grammarAccess.getCodeBlockAccess().getCodeWallParserRuleCall_0());
            	    		
            	    pushFollow(FOLLOW_15);
            	    this_CodeWall_0=ruleCodeWall();

            	    state._fsp--;


            	    			current.merge(this_CodeWall_0);
            	    		

            	    			afterParserOrEnumRuleCall();
            	    		

            	    }
            	    break;
            	case 2 :
            	    // InternalParser.g:1065:3: (kw= '{' this_CodeBlock_2= ruleCodeBlock kw= '}' )
            	    {
            	    // InternalParser.g:1065:3: (kw= '{' this_CodeBlock_2= ruleCodeBlock kw= '}' )
            	    // InternalParser.g:1066:4: kw= '{' this_CodeBlock_2= ruleCodeBlock kw= '}'
            	    {
            	    kw=(Token)match(input,14,FOLLOW_7); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getCodeBlockAccess().getLeftCurlyBracketKeyword_1_0());
            	    			

            	    				newCompositeNode(grammarAccess.getCodeBlockAccess().getCodeBlockParserRuleCall_1_1());
            	    			
            	    pushFollow(FOLLOW_8);
            	    this_CodeBlock_2=ruleCodeBlock();

            	    state._fsp--;


            	    				current.merge(this_CodeBlock_2);
            	    			

            	    				afterParserOrEnumRuleCall();
            	    			
            	    kw=(Token)match(input,15,FOLLOW_15); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getCodeBlockAccess().getRightCurlyBracketKeyword_1_2());
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCodeBlock"


    // $ANTLR start "entryRuleCodeWall"
    // InternalParser.g:1091:1: entryRuleCodeWall returns [String current=null] : iv_ruleCodeWall= ruleCodeWall EOF ;
    public final String entryRuleCodeWall() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCodeWall = null;


        try {
            // InternalParser.g:1091:48: (iv_ruleCodeWall= ruleCodeWall EOF )
            // InternalParser.g:1092:2: iv_ruleCodeWall= ruleCodeWall EOF
            {
             newCompositeNode(grammarAccess.getCodeWallRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCodeWall=ruleCodeWall();

            state._fsp--;

             current =iv_ruleCodeWall.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCodeWall"


    // $ANTLR start "ruleCodeWall"
    // InternalParser.g:1098:1: ruleCodeWall returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_INT_1= RULE_INT | this_STRING_2= RULE_STRING | this_WS_3= RULE_WS | kw= '+' | kw= '-' | kw= '(' | kw= ')' | kw= '*' | kw= '.' | kw= '/' | kw= '\\\\' | kw= '|' | kw= '?' | kw= '>' | kw= '<' | kw= '#' | kw= '$' | kw= '%' | kw= ';' | kw= ':' | kw= '!' | kw= '=' | kw= ',' ) ;
    public final AntlrDatatypeRuleToken ruleCodeWall() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_INT_1=null;
        Token this_STRING_2=null;
        Token this_WS_3=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalParser.g:1104:2: ( (this_ID_0= RULE_ID | this_INT_1= RULE_INT | this_STRING_2= RULE_STRING | this_WS_3= RULE_WS | kw= '+' | kw= '-' | kw= '(' | kw= ')' | kw= '*' | kw= '.' | kw= '/' | kw= '\\\\' | kw= '|' | kw= '?' | kw= '>' | kw= '<' | kw= '#' | kw= '$' | kw= '%' | kw= ';' | kw= ':' | kw= '!' | kw= '=' | kw= ',' ) )
            // InternalParser.g:1105:2: (this_ID_0= RULE_ID | this_INT_1= RULE_INT | this_STRING_2= RULE_STRING | this_WS_3= RULE_WS | kw= '+' | kw= '-' | kw= '(' | kw= ')' | kw= '*' | kw= '.' | kw= '/' | kw= '\\\\' | kw= '|' | kw= '?' | kw= '>' | kw= '<' | kw= '#' | kw= '$' | kw= '%' | kw= ';' | kw= ':' | kw= '!' | kw= '=' | kw= ',' )
            {
            // InternalParser.g:1105:2: (this_ID_0= RULE_ID | this_INT_1= RULE_INT | this_STRING_2= RULE_STRING | this_WS_3= RULE_WS | kw= '+' | kw= '-' | kw= '(' | kw= ')' | kw= '*' | kw= '.' | kw= '/' | kw= '\\\\' | kw= '|' | kw= '?' | kw= '>' | kw= '<' | kw= '#' | kw= '$' | kw= '%' | kw= ';' | kw= ':' | kw= '!' | kw= '=' | kw= ',' )
            int alt9=24;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt9=1;
                }
                break;
            case RULE_INT:
                {
                alt9=2;
                }
                break;
            case RULE_STRING:
                {
                alt9=3;
                }
                break;
            case RULE_WS:
                {
                alt9=4;
                }
                break;
            case 24:
                {
                alt9=5;
                }
                break;
            case 25:
                {
                alt9=6;
                }
                break;
            case 26:
                {
                alt9=7;
                }
                break;
            case 27:
                {
                alt9=8;
                }
                break;
            case 28:
                {
                alt9=9;
                }
                break;
            case 29:
                {
                alt9=10;
                }
                break;
            case 30:
                {
                alt9=11;
                }
                break;
            case 31:
                {
                alt9=12;
                }
                break;
            case 32:
                {
                alt9=13;
                }
                break;
            case 33:
                {
                alt9=14;
                }
                break;
            case 34:
                {
                alt9=15;
                }
                break;
            case 35:
                {
                alt9=16;
                }
                break;
            case 36:
                {
                alt9=17;
                }
                break;
            case 37:
                {
                alt9=18;
                }
                break;
            case 38:
                {
                alt9=19;
                }
                break;
            case 39:
                {
                alt9=20;
                }
                break;
            case 40:
                {
                alt9=21;
                }
                break;
            case 41:
                {
                alt9=22;
                }
                break;
            case 22:
                {
                alt9=23;
                }
                break;
            case 23:
                {
                alt9=24;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalParser.g:1106:3: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_0);
                    		

                    			newLeafNode(this_ID_0, grammarAccess.getCodeWallAccess().getIDTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalParser.g:1114:3: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			current.merge(this_INT_1);
                    		

                    			newLeafNode(this_INT_1, grammarAccess.getCodeWallAccess().getINTTerminalRuleCall_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalParser.g:1122:3: this_STRING_2= RULE_STRING
                    {
                    this_STRING_2=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_2);
                    		

                    			newLeafNode(this_STRING_2, grammarAccess.getCodeWallAccess().getSTRINGTerminalRuleCall_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalParser.g:1130:3: this_WS_3= RULE_WS
                    {
                    this_WS_3=(Token)match(input,RULE_WS,FOLLOW_2); 

                    			current.merge(this_WS_3);
                    		

                    			newLeafNode(this_WS_3, grammarAccess.getCodeWallAccess().getWSTerminalRuleCall_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalParser.g:1138:3: kw= '+'
                    {
                    kw=(Token)match(input,24,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCodeWallAccess().getPlusSignKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalParser.g:1144:3: kw= '-'
                    {
                    kw=(Token)match(input,25,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCodeWallAccess().getHyphenMinusKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalParser.g:1150:3: kw= '('
                    {
                    kw=(Token)match(input,26,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCodeWallAccess().getLeftParenthesisKeyword_6());
                    		

                    }
                    break;
                case 8 :
                    // InternalParser.g:1156:3: kw= ')'
                    {
                    kw=(Token)match(input,27,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCodeWallAccess().getRightParenthesisKeyword_7());
                    		

                    }
                    break;
                case 9 :
                    // InternalParser.g:1162:3: kw= '*'
                    {
                    kw=(Token)match(input,28,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCodeWallAccess().getAsteriskKeyword_8());
                    		

                    }
                    break;
                case 10 :
                    // InternalParser.g:1168:3: kw= '.'
                    {
                    kw=(Token)match(input,29,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCodeWallAccess().getFullStopKeyword_9());
                    		

                    }
                    break;
                case 11 :
                    // InternalParser.g:1174:3: kw= '/'
                    {
                    kw=(Token)match(input,30,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCodeWallAccess().getSolidusKeyword_10());
                    		

                    }
                    break;
                case 12 :
                    // InternalParser.g:1180:3: kw= '\\\\'
                    {
                    kw=(Token)match(input,31,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCodeWallAccess().getReverseSolidusKeyword_11());
                    		

                    }
                    break;
                case 13 :
                    // InternalParser.g:1186:3: kw= '|'
                    {
                    kw=(Token)match(input,32,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCodeWallAccess().getVerticalLineKeyword_12());
                    		

                    }
                    break;
                case 14 :
                    // InternalParser.g:1192:3: kw= '?'
                    {
                    kw=(Token)match(input,33,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCodeWallAccess().getQuestionMarkKeyword_13());
                    		

                    }
                    break;
                case 15 :
                    // InternalParser.g:1198:3: kw= '>'
                    {
                    kw=(Token)match(input,34,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCodeWallAccess().getGreaterThanSignKeyword_14());
                    		

                    }
                    break;
                case 16 :
                    // InternalParser.g:1204:3: kw= '<'
                    {
                    kw=(Token)match(input,35,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCodeWallAccess().getLessThanSignKeyword_15());
                    		

                    }
                    break;
                case 17 :
                    // InternalParser.g:1210:3: kw= '#'
                    {
                    kw=(Token)match(input,36,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCodeWallAccess().getNumberSignKeyword_16());
                    		

                    }
                    break;
                case 18 :
                    // InternalParser.g:1216:3: kw= '$'
                    {
                    kw=(Token)match(input,37,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCodeWallAccess().getDollarSignKeyword_17());
                    		

                    }
                    break;
                case 19 :
                    // InternalParser.g:1222:3: kw= '%'
                    {
                    kw=(Token)match(input,38,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCodeWallAccess().getPercentSignKeyword_18());
                    		

                    }
                    break;
                case 20 :
                    // InternalParser.g:1228:3: kw= ';'
                    {
                    kw=(Token)match(input,39,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCodeWallAccess().getSemicolonKeyword_19());
                    		

                    }
                    break;
                case 21 :
                    // InternalParser.g:1234:3: kw= ':'
                    {
                    kw=(Token)match(input,40,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCodeWallAccess().getColonKeyword_20());
                    		

                    }
                    break;
                case 22 :
                    // InternalParser.g:1240:3: kw= '!'
                    {
                    kw=(Token)match(input,41,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCodeWallAccess().getExclamationMarkKeyword_21());
                    		

                    }
                    break;
                case 23 :
                    // InternalParser.g:1246:3: kw= '='
                    {
                    kw=(Token)match(input,22,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCodeWallAccess().getEqualsSignKeyword_22());
                    		

                    }
                    break;
                case 24 :
                    // InternalParser.g:1252:3: kw= ','
                    {
                    kw=(Token)match(input,23,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCodeWallAccess().getCommaKeyword_23());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCodeWall"


    // $ANTLR start "entryRulePrecedence"
    // InternalParser.g:1261:1: entryRulePrecedence returns [EObject current=null] : iv_rulePrecedence= rulePrecedence EOF ;
    public final EObject entryRulePrecedence() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrecedence = null;


        try {
            // InternalParser.g:1261:51: (iv_rulePrecedence= rulePrecedence EOF )
            // InternalParser.g:1262:2: iv_rulePrecedence= rulePrecedence EOF
            {
             newCompositeNode(grammarAccess.getPrecedenceRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrecedence=rulePrecedence();

            state._fsp--;

             current =iv_rulePrecedence; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrecedence"


    // $ANTLR start "rulePrecedence"
    // InternalParser.g:1268:1: rulePrecedence returns [EObject current=null] : (otherlv_0= 'PREC' ( (lv_rows_1_0= rulePrecedenceRow ) )* ) ;
    public final EObject rulePrecedence() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_rows_1_0 = null;



        	enterRule();

        try {
            // InternalParser.g:1274:2: ( (otherlv_0= 'PREC' ( (lv_rows_1_0= rulePrecedenceRow ) )* ) )
            // InternalParser.g:1275:2: (otherlv_0= 'PREC' ( (lv_rows_1_0= rulePrecedenceRow ) )* )
            {
            // InternalParser.g:1275:2: (otherlv_0= 'PREC' ( (lv_rows_1_0= rulePrecedenceRow ) )* )
            // InternalParser.g:1276:3: otherlv_0= 'PREC' ( (lv_rows_1_0= rulePrecedenceRow ) )*
            {
            otherlv_0=(Token)match(input,42,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getPrecedenceAccess().getPRECKeyword_0());
            		
            // InternalParser.g:1280:3: ( (lv_rows_1_0= rulePrecedenceRow ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=48 && LA10_0<=50)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalParser.g:1281:4: (lv_rows_1_0= rulePrecedenceRow )
            	    {
            	    // InternalParser.g:1281:4: (lv_rows_1_0= rulePrecedenceRow )
            	    // InternalParser.g:1282:5: lv_rows_1_0= rulePrecedenceRow
            	    {

            	    					newCompositeNode(grammarAccess.getPrecedenceAccess().getRowsPrecedenceRowParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_16);
            	    lv_rows_1_0=rulePrecedenceRow();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPrecedenceRule());
            	    					}
            	    					add(
            	    						current,
            	    						"rows",
            	    						lv_rows_1_0,
            	    						"de.roma.cocktail.xtext.Parser.PrecedenceRow");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrecedence"


    // $ANTLR start "entryRulePrecedenceRow"
    // InternalParser.g:1303:1: entryRulePrecedenceRow returns [EObject current=null] : iv_rulePrecedenceRow= rulePrecedenceRow EOF ;
    public final EObject entryRulePrecedenceRow() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrecedenceRow = null;


        try {
            // InternalParser.g:1303:54: (iv_rulePrecedenceRow= rulePrecedenceRow EOF )
            // InternalParser.g:1304:2: iv_rulePrecedenceRow= rulePrecedenceRow EOF
            {
             newCompositeNode(grammarAccess.getPrecedenceRowRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrecedenceRow=rulePrecedenceRow();

            state._fsp--;

             current =iv_rulePrecedenceRow; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrecedenceRow"


    // $ANTLR start "rulePrecedenceRow"
    // InternalParser.g:1310:1: rulePrecedenceRow returns [EObject current=null] : ( ( (lv_type_0_0= rulePrecedenceType ) ) ( (otherlv_1= RULE_ID ) )* ) ;
    public final EObject rulePrecedenceRow() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Enumerator lv_type_0_0 = null;



        	enterRule();

        try {
            // InternalParser.g:1316:2: ( ( ( (lv_type_0_0= rulePrecedenceType ) ) ( (otherlv_1= RULE_ID ) )* ) )
            // InternalParser.g:1317:2: ( ( (lv_type_0_0= rulePrecedenceType ) ) ( (otherlv_1= RULE_ID ) )* )
            {
            // InternalParser.g:1317:2: ( ( (lv_type_0_0= rulePrecedenceType ) ) ( (otherlv_1= RULE_ID ) )* )
            // InternalParser.g:1318:3: ( (lv_type_0_0= rulePrecedenceType ) ) ( (otherlv_1= RULE_ID ) )*
            {
            // InternalParser.g:1318:3: ( (lv_type_0_0= rulePrecedenceType ) )
            // InternalParser.g:1319:4: (lv_type_0_0= rulePrecedenceType )
            {
            // InternalParser.g:1319:4: (lv_type_0_0= rulePrecedenceType )
            // InternalParser.g:1320:5: lv_type_0_0= rulePrecedenceType
            {

            					newCompositeNode(grammarAccess.getPrecedenceRowAccess().getTypePrecedenceTypeEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_5);
            lv_type_0_0=rulePrecedenceType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPrecedenceRowRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_0_0,
            						"de.roma.cocktail.xtext.Parser.PrecedenceType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalParser.g:1337:3: ( (otherlv_1= RULE_ID ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalParser.g:1338:4: (otherlv_1= RULE_ID )
            	    {
            	    // InternalParser.g:1338:4: (otherlv_1= RULE_ID )
            	    // InternalParser.g:1339:5: otherlv_1= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getPrecedenceRowRule());
            	    					}
            	    				
            	    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_5); 

            	    					newLeafNode(otherlv_1, grammarAccess.getPrecedenceRowAccess().getTokensDefinedTokenCrossReference_1_0());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrecedenceRow"


    // $ANTLR start "entryRuleStartSymbols"
    // InternalParser.g:1354:1: entryRuleStartSymbols returns [EObject current=null] : iv_ruleStartSymbols= ruleStartSymbols EOF ;
    public final EObject entryRuleStartSymbols() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStartSymbols = null;


        try {
            // InternalParser.g:1354:53: (iv_ruleStartSymbols= ruleStartSymbols EOF )
            // InternalParser.g:1355:2: iv_ruleStartSymbols= ruleStartSymbols EOF
            {
             newCompositeNode(grammarAccess.getStartSymbolsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStartSymbols=ruleStartSymbols();

            state._fsp--;

             current =iv_ruleStartSymbols; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStartSymbols"


    // $ANTLR start "ruleStartSymbols"
    // InternalParser.g:1361:1: ruleStartSymbols returns [EObject current=null] : (otherlv_0= 'START' ( (lv_states_1_0= ruleStartState ) )* ) ;
    public final EObject ruleStartSymbols() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_states_1_0 = null;



        	enterRule();

        try {
            // InternalParser.g:1367:2: ( (otherlv_0= 'START' ( (lv_states_1_0= ruleStartState ) )* ) )
            // InternalParser.g:1368:2: (otherlv_0= 'START' ( (lv_states_1_0= ruleStartState ) )* )
            {
            // InternalParser.g:1368:2: (otherlv_0= 'START' ( (lv_states_1_0= ruleStartState ) )* )
            // InternalParser.g:1369:3: otherlv_0= 'START' ( (lv_states_1_0= ruleStartState ) )*
            {
            otherlv_0=(Token)match(input,43,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getStartSymbolsAccess().getSTARTKeyword_0());
            		
            // InternalParser.g:1373:3: ( (lv_states_1_0= ruleStartState ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalParser.g:1374:4: (lv_states_1_0= ruleStartState )
            	    {
            	    // InternalParser.g:1374:4: (lv_states_1_0= ruleStartState )
            	    // InternalParser.g:1375:5: lv_states_1_0= ruleStartState
            	    {

            	    					newCompositeNode(grammarAccess.getStartSymbolsAccess().getStatesStartStateParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_states_1_0=ruleStartState();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getStartSymbolsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"states",
            	    						lv_states_1_0,
            	    						"de.roma.cocktail.xtext.Parser.StartState");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStartSymbols"


    // $ANTLR start "entryRuleStartState"
    // InternalParser.g:1396:1: entryRuleStartState returns [EObject current=null] : iv_ruleStartState= ruleStartState EOF ;
    public final EObject entryRuleStartState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStartState = null;


        try {
            // InternalParser.g:1396:51: (iv_ruleStartState= ruleStartState EOF )
            // InternalParser.g:1397:2: iv_ruleStartState= ruleStartState EOF
            {
             newCompositeNode(grammarAccess.getStartStateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStartState=ruleStartState();

            state._fsp--;

             current =iv_ruleStartState; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStartState"


    // $ANTLR start "ruleStartState"
    // InternalParser.g:1403:1: ruleStartState returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleStartState() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalParser.g:1409:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalParser.g:1410:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalParser.g:1410:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalParser.g:1411:3: (lv_name_0_0= RULE_ID )
            {
            // InternalParser.g:1411:3: (lv_name_0_0= RULE_ID )
            // InternalParser.g:1412:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getStartStateAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getStartStateRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStartState"


    // $ANTLR start "entryRuleGrammerRules"
    // InternalParser.g:1431:1: entryRuleGrammerRules returns [EObject current=null] : iv_ruleGrammerRules= ruleGrammerRules EOF ;
    public final EObject entryRuleGrammerRules() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGrammerRules = null;


        try {
            // InternalParser.g:1431:53: (iv_ruleGrammerRules= ruleGrammerRules EOF )
            // InternalParser.g:1432:2: iv_ruleGrammerRules= ruleGrammerRules EOF
            {
             newCompositeNode(grammarAccess.getGrammerRulesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGrammerRules=ruleGrammerRules();

            state._fsp--;

             current =iv_ruleGrammerRules; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGrammerRules"


    // $ANTLR start "ruleGrammerRules"
    // InternalParser.g:1438:1: ruleGrammerRules returns [EObject current=null] : ( (otherlv_0= 'RULE' | otherlv_1= 'RULES' ) ( (lv_rules_2_0= ruleGrammarRule ) )* ) ;
    public final EObject ruleGrammerRules() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_rules_2_0 = null;



        	enterRule();

        try {
            // InternalParser.g:1444:2: ( ( (otherlv_0= 'RULE' | otherlv_1= 'RULES' ) ( (lv_rules_2_0= ruleGrammarRule ) )* ) )
            // InternalParser.g:1445:2: ( (otherlv_0= 'RULE' | otherlv_1= 'RULES' ) ( (lv_rules_2_0= ruleGrammarRule ) )* )
            {
            // InternalParser.g:1445:2: ( (otherlv_0= 'RULE' | otherlv_1= 'RULES' ) ( (lv_rules_2_0= ruleGrammarRule ) )* )
            // InternalParser.g:1446:3: (otherlv_0= 'RULE' | otherlv_1= 'RULES' ) ( (lv_rules_2_0= ruleGrammarRule ) )*
            {
            // InternalParser.g:1446:3: (otherlv_0= 'RULE' | otherlv_1= 'RULES' )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==44) ) {
                alt13=1;
            }
            else if ( (LA13_0==45) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalParser.g:1447:4: otherlv_0= 'RULE'
                    {
                    otherlv_0=(Token)match(input,44,FOLLOW_5); 

                    				newLeafNode(otherlv_0, grammarAccess.getGrammerRulesAccess().getRULEKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalParser.g:1452:4: otherlv_1= 'RULES'
                    {
                    otherlv_1=(Token)match(input,45,FOLLOW_5); 

                    				newLeafNode(otherlv_1, grammarAccess.getGrammerRulesAccess().getRULESKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalParser.g:1457:3: ( (lv_rules_2_0= ruleGrammarRule ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalParser.g:1458:4: (lv_rules_2_0= ruleGrammarRule )
            	    {
            	    // InternalParser.g:1458:4: (lv_rules_2_0= ruleGrammarRule )
            	    // InternalParser.g:1459:5: lv_rules_2_0= ruleGrammarRule
            	    {

            	    					newCompositeNode(grammarAccess.getGrammerRulesAccess().getRulesGrammarRuleParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_rules_2_0=ruleGrammarRule();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getGrammerRulesRule());
            	    					}
            	    					add(
            	    						current,
            	    						"rules",
            	    						lv_rules_2_0,
            	    						"de.roma.cocktail.xtext.Parser.GrammarRule");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGrammerRules"


    // $ANTLR start "entryRuleGrammarRule"
    // InternalParser.g:1480:1: entryRuleGrammarRule returns [EObject current=null] : iv_ruleGrammarRule= ruleGrammarRule EOF ;
    public final EObject entryRuleGrammarRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGrammarRule = null;


        try {
            // InternalParser.g:1480:52: (iv_ruleGrammarRule= ruleGrammarRule EOF )
            // InternalParser.g:1481:2: iv_ruleGrammarRule= ruleGrammarRule EOF
            {
             newCompositeNode(grammarAccess.getGrammarRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGrammarRule=ruleGrammarRule();

            state._fsp--;

             current =iv_ruleGrammarRule; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGrammarRule"


    // $ANTLR start "ruleGrammarRule"
    // InternalParser.g:1487:1: ruleGrammarRule returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_body_2_0= ruleRuleBody ) ) (otherlv_3= '|' ( (lv_body_4_0= ruleRuleBody ) ) )* otherlv_5= '.' ) ;
    public final EObject ruleGrammarRule() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_body_2_0 = null;

        EObject lv_body_4_0 = null;



        	enterRule();

        try {
            // InternalParser.g:1493:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_body_2_0= ruleRuleBody ) ) (otherlv_3= '|' ( (lv_body_4_0= ruleRuleBody ) ) )* otherlv_5= '.' ) )
            // InternalParser.g:1494:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_body_2_0= ruleRuleBody ) ) (otherlv_3= '|' ( (lv_body_4_0= ruleRuleBody ) ) )* otherlv_5= '.' )
            {
            // InternalParser.g:1494:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_body_2_0= ruleRuleBody ) ) (otherlv_3= '|' ( (lv_body_4_0= ruleRuleBody ) ) )* otherlv_5= '.' )
            // InternalParser.g:1495:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_body_2_0= ruleRuleBody ) ) (otherlv_3= '|' ( (lv_body_4_0= ruleRuleBody ) ) )* otherlv_5= '.'
            {
            // InternalParser.g:1495:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalParser.g:1496:4: (lv_name_0_0= RULE_ID )
            {
            // InternalParser.g:1496:4: (lv_name_0_0= RULE_ID )
            // InternalParser.g:1497:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_17); 

            					newLeafNode(lv_name_0_0, grammarAccess.getGrammarRuleAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGrammarRuleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,40,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getGrammarRuleAccess().getColonKeyword_1());
            		
            // InternalParser.g:1517:3: ( (lv_body_2_0= ruleRuleBody ) )
            // InternalParser.g:1518:4: (lv_body_2_0= ruleRuleBody )
            {
            // InternalParser.g:1518:4: (lv_body_2_0= ruleRuleBody )
            // InternalParser.g:1519:5: lv_body_2_0= ruleRuleBody
            {

            					newCompositeNode(grammarAccess.getGrammarRuleAccess().getBodyRuleBodyParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_19);
            lv_body_2_0=ruleRuleBody();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGrammarRuleRule());
            					}
            					add(
            						current,
            						"body",
            						lv_body_2_0,
            						"de.roma.cocktail.xtext.Parser.RuleBody");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalParser.g:1536:3: (otherlv_3= '|' ( (lv_body_4_0= ruleRuleBody ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==32) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalParser.g:1537:4: otherlv_3= '|' ( (lv_body_4_0= ruleRuleBody ) )
            	    {
            	    otherlv_3=(Token)match(input,32,FOLLOW_18); 

            	    				newLeafNode(otherlv_3, grammarAccess.getGrammarRuleAccess().getVerticalLineKeyword_3_0());
            	    			
            	    // InternalParser.g:1541:4: ( (lv_body_4_0= ruleRuleBody ) )
            	    // InternalParser.g:1542:5: (lv_body_4_0= ruleRuleBody )
            	    {
            	    // InternalParser.g:1542:5: (lv_body_4_0= ruleRuleBody )
            	    // InternalParser.g:1543:6: lv_body_4_0= ruleRuleBody
            	    {

            	    						newCompositeNode(grammarAccess.getGrammarRuleAccess().getBodyRuleBodyParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_19);
            	    lv_body_4_0=ruleRuleBody();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getGrammarRuleRule());
            	    						}
            	    						add(
            	    							current,
            	    							"body",
            	    							lv_body_4_0,
            	    							"de.roma.cocktail.xtext.Parser.RuleBody");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            otherlv_5=(Token)match(input,29,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getGrammarRuleAccess().getFullStopKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGrammarRule"


    // $ANTLR start "entryRuleRuleBody"
    // InternalParser.g:1569:1: entryRuleRuleBody returns [EObject current=null] : iv_ruleRuleBody= ruleRuleBody EOF ;
    public final EObject entryRuleRuleBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRuleBody = null;


        try {
            // InternalParser.g:1569:49: (iv_ruleRuleBody= ruleRuleBody EOF )
            // InternalParser.g:1570:2: iv_ruleRuleBody= ruleRuleBody EOF
            {
             newCompositeNode(grammarAccess.getRuleBodyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRuleBody=ruleRuleBody();

            state._fsp--;

             current =iv_ruleRuleBody; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRuleBody"


    // $ANTLR start "ruleRuleBody"
    // InternalParser.g:1576:1: ruleRuleBody returns [EObject current=null] : ( ( (lv_part_0_0= ruleRulePart ) ) ( (lv_code_1_0= ruleRuleCode ) ) ) ;
    public final EObject ruleRuleBody() throws RecognitionException {
        EObject current = null;

        EObject lv_part_0_0 = null;

        AntlrDatatypeRuleToken lv_code_1_0 = null;



        	enterRule();

        try {
            // InternalParser.g:1582:2: ( ( ( (lv_part_0_0= ruleRulePart ) ) ( (lv_code_1_0= ruleRuleCode ) ) ) )
            // InternalParser.g:1583:2: ( ( (lv_part_0_0= ruleRulePart ) ) ( (lv_code_1_0= ruleRuleCode ) ) )
            {
            // InternalParser.g:1583:2: ( ( (lv_part_0_0= ruleRulePart ) ) ( (lv_code_1_0= ruleRuleCode ) ) )
            // InternalParser.g:1584:3: ( (lv_part_0_0= ruleRulePart ) ) ( (lv_code_1_0= ruleRuleCode ) )
            {
            // InternalParser.g:1584:3: ( (lv_part_0_0= ruleRulePart ) )
            // InternalParser.g:1585:4: (lv_part_0_0= ruleRulePart )
            {
            // InternalParser.g:1585:4: (lv_part_0_0= ruleRulePart )
            // InternalParser.g:1586:5: lv_part_0_0= ruleRulePart
            {

            					newCompositeNode(grammarAccess.getRuleBodyAccess().getPartRulePartParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_20);
            lv_part_0_0=ruleRulePart();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRuleBodyRule());
            					}
            					set(
            						current,
            						"part",
            						lv_part_0_0,
            						"de.roma.cocktail.xtext.Parser.RulePart");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalParser.g:1603:3: ( (lv_code_1_0= ruleRuleCode ) )
            // InternalParser.g:1604:4: (lv_code_1_0= ruleRuleCode )
            {
            // InternalParser.g:1604:4: (lv_code_1_0= ruleRuleCode )
            // InternalParser.g:1605:5: lv_code_1_0= ruleRuleCode
            {

            					newCompositeNode(grammarAccess.getRuleBodyAccess().getCodeRuleCodeParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_code_1_0=ruleRuleCode();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRuleBodyRule());
            					}
            					set(
            						current,
            						"code",
            						lv_code_1_0,
            						"de.roma.cocktail.xtext.Parser.RuleCode");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRuleBody"


    // $ANTLR start "entryRuleRuleCode"
    // InternalParser.g:1626:1: entryRuleRuleCode returns [String current=null] : iv_ruleRuleCode= ruleRuleCode EOF ;
    public final String entryRuleRuleCode() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRuleCode = null;


        try {
            // InternalParser.g:1626:48: (iv_ruleRuleCode= ruleRuleCode EOF )
            // InternalParser.g:1627:2: iv_ruleRuleCode= ruleRuleCode EOF
            {
             newCompositeNode(grammarAccess.getRuleCodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRuleCode=ruleRuleCode();

            state._fsp--;

             current =iv_ruleRuleCode.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRuleCode"


    // $ANTLR start "ruleRuleCode"
    // InternalParser.g:1633:1: ruleRuleCode returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( ( ( ({...}? => ( ({...}? => (kw= '{' this_CodeBlock_2= ruleCodeBlock kw= '}' ) ) ) ) | ({...}? => ( ({...}? => (kw= '[' this_CodeBlock_5= ruleCodeBlock kw= ']' ) ) ) ) )* ) ) ) ;
    public final AntlrDatatypeRuleToken ruleRuleCode() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_CodeBlock_2 = null;

        AntlrDatatypeRuleToken this_CodeBlock_5 = null;



        	enterRule();

        try {
            // InternalParser.g:1639:2: ( ( ( ( ( ({...}? => ( ({...}? => (kw= '{' this_CodeBlock_2= ruleCodeBlock kw= '}' ) ) ) ) | ({...}? => ( ({...}? => (kw= '[' this_CodeBlock_5= ruleCodeBlock kw= ']' ) ) ) ) )* ) ) ) )
            // InternalParser.g:1640:2: ( ( ( ( ({...}? => ( ({...}? => (kw= '{' this_CodeBlock_2= ruleCodeBlock kw= '}' ) ) ) ) | ({...}? => ( ({...}? => (kw= '[' this_CodeBlock_5= ruleCodeBlock kw= ']' ) ) ) ) )* ) ) )
            {
            // InternalParser.g:1640:2: ( ( ( ( ({...}? => ( ({...}? => (kw= '{' this_CodeBlock_2= ruleCodeBlock kw= '}' ) ) ) ) | ({...}? => ( ({...}? => (kw= '[' this_CodeBlock_5= ruleCodeBlock kw= ']' ) ) ) ) )* ) ) )
            // InternalParser.g:1641:3: ( ( ( ({...}? => ( ({...}? => (kw= '{' this_CodeBlock_2= ruleCodeBlock kw= '}' ) ) ) ) | ({...}? => ( ({...}? => (kw= '[' this_CodeBlock_5= ruleCodeBlock kw= ']' ) ) ) ) )* ) )
            {
            // InternalParser.g:1641:3: ( ( ( ({...}? => ( ({...}? => (kw= '{' this_CodeBlock_2= ruleCodeBlock kw= '}' ) ) ) ) | ({...}? => ( ({...}? => (kw= '[' this_CodeBlock_5= ruleCodeBlock kw= ']' ) ) ) ) )* ) )
            // InternalParser.g:1642:4: ( ( ({...}? => ( ({...}? => (kw= '{' this_CodeBlock_2= ruleCodeBlock kw= '}' ) ) ) ) | ({...}? => ( ({...}? => (kw= '[' this_CodeBlock_5= ruleCodeBlock kw= ']' ) ) ) ) )* )
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getRuleCodeAccess().getUnorderedGroup());
            			
            // InternalParser.g:1645:4: ( ( ({...}? => ( ({...}? => (kw= '{' this_CodeBlock_2= ruleCodeBlock kw= '}' ) ) ) ) | ({...}? => ( ({...}? => (kw= '[' this_CodeBlock_5= ruleCodeBlock kw= ']' ) ) ) ) )* )
            // InternalParser.g:1646:5: ( ({...}? => ( ({...}? => (kw= '{' this_CodeBlock_2= ruleCodeBlock kw= '}' ) ) ) ) | ({...}? => ( ({...}? => (kw= '[' this_CodeBlock_5= ruleCodeBlock kw= ']' ) ) ) ) )*
            {
            // InternalParser.g:1646:5: ( ({...}? => ( ({...}? => (kw= '{' this_CodeBlock_2= ruleCodeBlock kw= '}' ) ) ) ) | ({...}? => ( ({...}? => (kw= '[' this_CodeBlock_5= ruleCodeBlock kw= ']' ) ) ) ) )*
            loop16:
            do {
                int alt16=3;
                int LA16_0 = input.LA(1);

                if ( LA16_0 == 14 && getUnorderedGroupHelper().canSelect(grammarAccess.getRuleCodeAccess().getUnorderedGroup(), 0) ) {
                    alt16=1;
                }
                else if ( LA16_0 == 46 && getUnorderedGroupHelper().canSelect(grammarAccess.getRuleCodeAccess().getUnorderedGroup(), 1) ) {
                    alt16=2;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalParser.g:1647:3: ({...}? => ( ({...}? => (kw= '{' this_CodeBlock_2= ruleCodeBlock kw= '}' ) ) ) )
            	    {
            	    // InternalParser.g:1647:3: ({...}? => ( ({...}? => (kw= '{' this_CodeBlock_2= ruleCodeBlock kw= '}' ) ) ) )
            	    // InternalParser.g:1648:4: {...}? => ( ({...}? => (kw= '{' this_CodeBlock_2= ruleCodeBlock kw= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRuleCodeAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleRuleCode", "getUnorderedGroupHelper().canSelect(grammarAccess.getRuleCodeAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalParser.g:1648:102: ( ({...}? => (kw= '{' this_CodeBlock_2= ruleCodeBlock kw= '}' ) ) )
            	    // InternalParser.g:1649:5: ({...}? => (kw= '{' this_CodeBlock_2= ruleCodeBlock kw= '}' ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getRuleCodeAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalParser.g:1652:8: ({...}? => (kw= '{' this_CodeBlock_2= ruleCodeBlock kw= '}' ) )
            	    // InternalParser.g:1652:9: {...}? => (kw= '{' this_CodeBlock_2= ruleCodeBlock kw= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleRuleCode", "true");
            	    }
            	    // InternalParser.g:1652:18: (kw= '{' this_CodeBlock_2= ruleCodeBlock kw= '}' )
            	    // InternalParser.g:1652:19: kw= '{' this_CodeBlock_2= ruleCodeBlock kw= '}'
            	    {
            	    kw=(Token)match(input,14,FOLLOW_7); 

            	    								current.merge(kw);
            	    								newLeafNode(kw, grammarAccess.getRuleCodeAccess().getLeftCurlyBracketKeyword_0_0());
            	    							

            	    								newCompositeNode(grammarAccess.getRuleCodeAccess().getCodeBlockParserRuleCall_0_1());
            	    							
            	    pushFollow(FOLLOW_8);
            	    this_CodeBlock_2=ruleCodeBlock();

            	    state._fsp--;


            	    								current.merge(this_CodeBlock_2);
            	    							

            	    								afterParserOrEnumRuleCall();
            	    							
            	    kw=(Token)match(input,15,FOLLOW_21); 

            	    								current.merge(kw);
            	    								newLeafNode(kw, grammarAccess.getRuleCodeAccess().getRightCurlyBracketKeyword_0_2());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRuleCodeAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalParser.g:1678:3: ({...}? => ( ({...}? => (kw= '[' this_CodeBlock_5= ruleCodeBlock kw= ']' ) ) ) )
            	    {
            	    // InternalParser.g:1678:3: ({...}? => ( ({...}? => (kw= '[' this_CodeBlock_5= ruleCodeBlock kw= ']' ) ) ) )
            	    // InternalParser.g:1679:4: {...}? => ( ({...}? => (kw= '[' this_CodeBlock_5= ruleCodeBlock kw= ']' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRuleCodeAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleRuleCode", "getUnorderedGroupHelper().canSelect(grammarAccess.getRuleCodeAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalParser.g:1679:102: ( ({...}? => (kw= '[' this_CodeBlock_5= ruleCodeBlock kw= ']' ) ) )
            	    // InternalParser.g:1680:5: ({...}? => (kw= '[' this_CodeBlock_5= ruleCodeBlock kw= ']' ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getRuleCodeAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalParser.g:1683:8: ({...}? => (kw= '[' this_CodeBlock_5= ruleCodeBlock kw= ']' ) )
            	    // InternalParser.g:1683:9: {...}? => (kw= '[' this_CodeBlock_5= ruleCodeBlock kw= ']' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleRuleCode", "true");
            	    }
            	    // InternalParser.g:1683:18: (kw= '[' this_CodeBlock_5= ruleCodeBlock kw= ']' )
            	    // InternalParser.g:1683:19: kw= '[' this_CodeBlock_5= ruleCodeBlock kw= ']'
            	    {
            	    kw=(Token)match(input,46,FOLLOW_22); 

            	    								current.merge(kw);
            	    								newLeafNode(kw, grammarAccess.getRuleCodeAccess().getLeftSquareBracketKeyword_1_0());
            	    							

            	    								newCompositeNode(grammarAccess.getRuleCodeAccess().getCodeBlockParserRuleCall_1_1());
            	    							
            	    pushFollow(FOLLOW_23);
            	    this_CodeBlock_5=ruleCodeBlock();

            	    state._fsp--;


            	    								current.merge(this_CodeBlock_5);
            	    							

            	    								afterParserOrEnumRuleCall();
            	    							
            	    kw=(Token)match(input,47,FOLLOW_21); 

            	    								current.merge(kw);
            	    								newLeafNode(kw, grammarAccess.getRuleCodeAccess().getRightSquareBracketKeyword_1_2());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRuleCodeAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            }


            }

             
            			  getUnorderedGroupHelper().leave(grammarAccess.getRuleCodeAccess().getUnorderedGroup());
            			

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRuleCode"


    // $ANTLR start "entryRuleRulePart"
    // InternalParser.g:1719:1: entryRuleRulePart returns [EObject current=null] : iv_ruleRulePart= ruleRulePart EOF ;
    public final EObject entryRuleRulePart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRulePart = null;


        try {
            // InternalParser.g:1719:49: (iv_ruleRulePart= ruleRulePart EOF )
            // InternalParser.g:1720:2: iv_ruleRulePart= ruleRulePart EOF
            {
             newCompositeNode(grammarAccess.getRulePartRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRulePart=ruleRulePart();

            state._fsp--;

             current =iv_ruleRulePart; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRulePart"


    // $ANTLR start "ruleRulePart"
    // InternalParser.g:1726:1: ruleRulePart returns [EObject current=null] : ( ( (lv_regex_0_0= RULE_STRING ) ) | ( (otherlv_1= RULE_ID ) ) )* ;
    public final EObject ruleRulePart() throws RecognitionException {
        EObject current = null;

        Token lv_regex_0_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalParser.g:1732:2: ( ( ( (lv_regex_0_0= RULE_STRING ) ) | ( (otherlv_1= RULE_ID ) ) )* )
            // InternalParser.g:1733:2: ( ( (lv_regex_0_0= RULE_STRING ) ) | ( (otherlv_1= RULE_ID ) ) )*
            {
            // InternalParser.g:1733:2: ( ( (lv_regex_0_0= RULE_STRING ) ) | ( (otherlv_1= RULE_ID ) ) )*
            loop17:
            do {
                int alt17=3;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_STRING) ) {
                    alt17=1;
                }
                else if ( (LA17_0==RULE_ID) ) {
                    alt17=2;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalParser.g:1734:3: ( (lv_regex_0_0= RULE_STRING ) )
            	    {
            	    // InternalParser.g:1734:3: ( (lv_regex_0_0= RULE_STRING ) )
            	    // InternalParser.g:1735:4: (lv_regex_0_0= RULE_STRING )
            	    {
            	    // InternalParser.g:1735:4: (lv_regex_0_0= RULE_STRING )
            	    // InternalParser.g:1736:5: lv_regex_0_0= RULE_STRING
            	    {
            	    lv_regex_0_0=(Token)match(input,RULE_STRING,FOLLOW_24); 

            	    					newLeafNode(lv_regex_0_0, grammarAccess.getRulePartAccess().getRegexSTRINGTerminalRuleCall_0_0());
            	    				

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getRulePartRule());
            	    					}
            	    					addWithLastConsumed(
            	    						current,
            	    						"regex",
            	    						lv_regex_0_0,
            	    						"org.eclipse.xtext.common.Terminals.STRING");
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalParser.g:1753:3: ( (otherlv_1= RULE_ID ) )
            	    {
            	    // InternalParser.g:1753:3: ( (otherlv_1= RULE_ID ) )
            	    // InternalParser.g:1754:4: (otherlv_1= RULE_ID )
            	    {
            	    // InternalParser.g:1754:4: (otherlv_1= RULE_ID )
            	    // InternalParser.g:1755:5: otherlv_1= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getRulePartRule());
            	    					}
            	    				
            	    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_24); 

            	    					newLeafNode(otherlv_1, grammarAccess.getRulePartAccess().getRulesGrammerReferenceCrossReference_1_0());
            	    				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRulePart"


    // $ANTLR start "rulePrecedenceType"
    // InternalParser.g:1770:1: rulePrecedenceType returns [Enumerator current=null] : ( (enumLiteral_0= 'NONE' ) | (enumLiteral_1= 'LEFT' ) | (enumLiteral_2= 'RIGHT' ) ) ;
    public final Enumerator rulePrecedenceType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalParser.g:1776:2: ( ( (enumLiteral_0= 'NONE' ) | (enumLiteral_1= 'LEFT' ) | (enumLiteral_2= 'RIGHT' ) ) )
            // InternalParser.g:1777:2: ( (enumLiteral_0= 'NONE' ) | (enumLiteral_1= 'LEFT' ) | (enumLiteral_2= 'RIGHT' ) )
            {
            // InternalParser.g:1777:2: ( (enumLiteral_0= 'NONE' ) | (enumLiteral_1= 'LEFT' ) | (enumLiteral_2= 'RIGHT' ) )
            int alt18=3;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt18=1;
                }
                break;
            case 49:
                {
                alt18=2;
                }
                break;
            case 50:
                {
                alt18=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalParser.g:1778:3: (enumLiteral_0= 'NONE' )
                    {
                    // InternalParser.g:1778:3: (enumLiteral_0= 'NONE' )
                    // InternalParser.g:1779:4: enumLiteral_0= 'NONE'
                    {
                    enumLiteral_0=(Token)match(input,48,FOLLOW_2); 

                    				current = grammarAccess.getPrecedenceTypeAccess().getNONEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getPrecedenceTypeAccess().getNONEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalParser.g:1786:3: (enumLiteral_1= 'LEFT' )
                    {
                    // InternalParser.g:1786:3: (enumLiteral_1= 'LEFT' )
                    // InternalParser.g:1787:4: enumLiteral_1= 'LEFT'
                    {
                    enumLiteral_1=(Token)match(input,49,FOLLOW_2); 

                    				current = grammarAccess.getPrecedenceTypeAccess().getLEFTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getPrecedenceTypeAccess().getLEFTEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalParser.g:1794:3: (enumLiteral_2= 'RIGHT' )
                    {
                    // InternalParser.g:1794:3: (enumLiteral_2= 'RIGHT' )
                    // InternalParser.g:1795:4: enumLiteral_2= 'RIGHT'
                    {
                    enumLiteral_2=(Token)match(input,50,FOLLOW_2); 

                    				current = grammarAccess.getPrecedenceTypeAccess().getRIGHTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getPrecedenceTypeAccess().getRIGHTEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrecedenceType"

    // Delegated rules


    protected DFA1 dfa1 = new DFA1(this);
    static final String dfa_1s = "\15\uffff";
    static final String dfa_2s = "\1\1\14\uffff";
    static final String dfa_3s = "\1\13\14\uffff";
    static final String dfa_4s = "\1\55\14\uffff";
    static final String dfa_5s = "\1\uffff\1\14\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13";
    static final String dfa_6s = "\1\0\14\uffff}>";
    static final String[] dfa_7s = {
            "\1\2\1\uffff\1\3\2\uffff\1\4\1\5\1\6\1\7\1\10\1\11\24\uffff\1\12\1\13\2\14",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "()+ loopback of 85:5: ( ({...}? => ( ({...}? => ( ( (lv_scanner_1_0= ruleScannerName ) ) ( (lv_parser_2_0= ruleParserName ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_importBlock_3_0= ruleImport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_exportBlock_4_0= ruleExport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_globalBlock_5_0= ruleGlobal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_localBlock_6_0= ruleLocal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_beginBlock_7_0= ruleBegin ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_closeBlock_8_0= ruleClose ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_tokens_9_0= ruleTokens ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_precedenc_10_0= rulePrecedence ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_start_11_0= ruleStartSymbols ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_rules_12_0= ruleGrammerRules ) ) ) ) ) )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA1_0 = input.LA(1);

                         
                        int index1_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA1_0==EOF) ) {s = 1;}

                        else if ( LA1_0 == 11 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup(), 0) ) {s = 2;}

                        else if ( LA1_0 == 13 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup(), 1) ) {s = 3;}

                        else if ( LA1_0 == 16 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup(), 2) ) {s = 4;}

                        else if ( LA1_0 == 17 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup(), 3) ) {s = 5;}

                        else if ( LA1_0 == 18 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup(), 4) ) {s = 6;}

                        else if ( LA1_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup(), 5) ) {s = 7;}

                        else if ( LA1_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup(), 6) ) {s = 8;}

                        else if ( LA1_0 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup(), 7) ) {s = 9;}

                        else if ( LA1_0 == 42 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup(), 8) ) {s = 10;}

                        else if ( LA1_0 == 43 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup(), 9) ) {s = 11;}

                        else if ( LA1_0 >= 44 && LA1_0 <= 45 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup(), 10) ) {s = 12;}

                         
                        input.seek(index1_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 1, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00003C00003F2802L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000003FFFFC0C0F0L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000000000F2L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000003FFFFC040F2L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0007000000000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000400000004030L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000120000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000400000004000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000400000004002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x000083FFFFC040F0L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000032L});

}
