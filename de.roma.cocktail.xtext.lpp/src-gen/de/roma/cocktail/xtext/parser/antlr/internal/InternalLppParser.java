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
import de.roma.cocktail.xtext.services.LppGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalLppParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_ANY_OTHER", "'SCANNER'", "'PARSER'", "'IMPORT'", "'{'", "'}'", "'EXPORT'", "'GLOBAL'", "'LOCAL'", "'BEGIN'", "'CLOSE'", "'TOKEN'", "'='", "','", "'+'", "'-'", "'('", "')'", "'*'", "'.'", "'/'", "'\\\\'", "'|'", "'?'", "'>'", "'<'", "'#'", "'$'", "'%'", "';'", "':'", "'!'", "'PREC'", "'START'", "'RULE'", "'RULES'", "'= <'", "'>.'", "'['", "']'", "'NONE'", "'LEFT'", "'RIGHT'"
    };
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int T__19=19;
    public static final int T__51=51;
    public static final int T__16=16;
    public static final int T__52=52;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_SL_COMMENT=9;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=5;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=7;

    // delegates
    // delegators


        public InternalLppParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalLppParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalLppParser.tokenNames; }
    public String getGrammarFileName() { return "InternalLpp.g"; }



     	private LppGrammarAccess grammarAccess;

        public InternalLppParser(TokenStream input, LppGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "ParserModel";
       	}

       	@Override
       	protected LppGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleParserModel"
    // InternalLpp.g:65:1: entryRuleParserModel returns [EObject current=null] : iv_ruleParserModel= ruleParserModel EOF ;
    public final EObject entryRuleParserModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParserModel = null;


        try {
            // InternalLpp.g:65:52: (iv_ruleParserModel= ruleParserModel EOF )
            // InternalLpp.g:66:2: iv_ruleParserModel= ruleParserModel EOF
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
    // InternalLpp.g:72:1: ruleParserModel returns [EObject current=null] : ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_scanner_1_0= ruleScannerName ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_parser_2_0= ruleParserName ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_importBlock_3_0= ruleImport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_exportBlock_4_0= ruleExport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_globalBlock_5_0= ruleGlobal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_localBlock_6_0= ruleLocal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_beginBlock_7_0= ruleBegin ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_closeBlock_8_0= ruleClose ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_tokens_9_0= ruleTokens ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_precedenc_10_0= rulePrecedence ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_start_11_0= ruleStartSymbols ) ) ) ) ) )* ) ) ) ( (lv_rules_12_0= ruleGrammarRules ) ) ) ;
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
            // InternalLpp.g:78:2: ( ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_scanner_1_0= ruleScannerName ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_parser_2_0= ruleParserName ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_importBlock_3_0= ruleImport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_exportBlock_4_0= ruleExport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_globalBlock_5_0= ruleGlobal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_localBlock_6_0= ruleLocal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_beginBlock_7_0= ruleBegin ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_closeBlock_8_0= ruleClose ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_tokens_9_0= ruleTokens ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_precedenc_10_0= rulePrecedence ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_start_11_0= ruleStartSymbols ) ) ) ) ) )* ) ) ) ( (lv_rules_12_0= ruleGrammarRules ) ) ) )
            // InternalLpp.g:79:2: ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_scanner_1_0= ruleScannerName ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_parser_2_0= ruleParserName ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_importBlock_3_0= ruleImport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_exportBlock_4_0= ruleExport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_globalBlock_5_0= ruleGlobal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_localBlock_6_0= ruleLocal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_beginBlock_7_0= ruleBegin ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_closeBlock_8_0= ruleClose ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_tokens_9_0= ruleTokens ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_precedenc_10_0= rulePrecedence ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_start_11_0= ruleStartSymbols ) ) ) ) ) )* ) ) ) ( (lv_rules_12_0= ruleGrammarRules ) ) )
            {
            // InternalLpp.g:79:2: ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_scanner_1_0= ruleScannerName ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_parser_2_0= ruleParserName ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_importBlock_3_0= ruleImport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_exportBlock_4_0= ruleExport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_globalBlock_5_0= ruleGlobal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_localBlock_6_0= ruleLocal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_beginBlock_7_0= ruleBegin ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_closeBlock_8_0= ruleClose ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_tokens_9_0= ruleTokens ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_precedenc_10_0= rulePrecedence ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_start_11_0= ruleStartSymbols ) ) ) ) ) )* ) ) ) ( (lv_rules_12_0= ruleGrammarRules ) ) )
            // InternalLpp.g:80:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_scanner_1_0= ruleScannerName ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_parser_2_0= ruleParserName ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_importBlock_3_0= ruleImport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_exportBlock_4_0= ruleExport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_globalBlock_5_0= ruleGlobal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_localBlock_6_0= ruleLocal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_beginBlock_7_0= ruleBegin ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_closeBlock_8_0= ruleClose ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_tokens_9_0= ruleTokens ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_precedenc_10_0= rulePrecedence ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_start_11_0= ruleStartSymbols ) ) ) ) ) )* ) ) ) ( (lv_rules_12_0= ruleGrammarRules ) )
            {
            // InternalLpp.g:80:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_scanner_1_0= ruleScannerName ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_parser_2_0= ruleParserName ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_importBlock_3_0= ruleImport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_exportBlock_4_0= ruleExport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_globalBlock_5_0= ruleGlobal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_localBlock_6_0= ruleLocal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_beginBlock_7_0= ruleBegin ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_closeBlock_8_0= ruleClose ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_tokens_9_0= ruleTokens ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_precedenc_10_0= rulePrecedence ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_start_11_0= ruleStartSymbols ) ) ) ) ) )* ) ) )
            // InternalLpp.g:81:4: ( ( ( ({...}? => ( ({...}? => ( (lv_scanner_1_0= ruleScannerName ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_parser_2_0= ruleParserName ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_importBlock_3_0= ruleImport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_exportBlock_4_0= ruleExport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_globalBlock_5_0= ruleGlobal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_localBlock_6_0= ruleLocal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_beginBlock_7_0= ruleBegin ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_closeBlock_8_0= ruleClose ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_tokens_9_0= ruleTokens ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_precedenc_10_0= rulePrecedence ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_start_11_0= ruleStartSymbols ) ) ) ) ) )* ) )
            {
            // InternalLpp.g:81:4: ( ( ( ({...}? => ( ({...}? => ( (lv_scanner_1_0= ruleScannerName ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_parser_2_0= ruleParserName ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_importBlock_3_0= ruleImport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_exportBlock_4_0= ruleExport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_globalBlock_5_0= ruleGlobal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_localBlock_6_0= ruleLocal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_beginBlock_7_0= ruleBegin ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_closeBlock_8_0= ruleClose ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_tokens_9_0= ruleTokens ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_precedenc_10_0= rulePrecedence ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_start_11_0= ruleStartSymbols ) ) ) ) ) )* ) )
            // InternalLpp.g:82:5: ( ( ({...}? => ( ({...}? => ( (lv_scanner_1_0= ruleScannerName ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_parser_2_0= ruleParserName ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_importBlock_3_0= ruleImport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_exportBlock_4_0= ruleExport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_globalBlock_5_0= ruleGlobal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_localBlock_6_0= ruleLocal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_beginBlock_7_0= ruleBegin ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_closeBlock_8_0= ruleClose ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_tokens_9_0= ruleTokens ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_precedenc_10_0= rulePrecedence ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_start_11_0= ruleStartSymbols ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getParserModelAccess().getUnorderedGroup_0());
            				
            // InternalLpp.g:85:5: ( ( ({...}? => ( ({...}? => ( (lv_scanner_1_0= ruleScannerName ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_parser_2_0= ruleParserName ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_importBlock_3_0= ruleImport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_exportBlock_4_0= ruleExport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_globalBlock_5_0= ruleGlobal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_localBlock_6_0= ruleLocal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_beginBlock_7_0= ruleBegin ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_closeBlock_8_0= ruleClose ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_tokens_9_0= ruleTokens ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_precedenc_10_0= rulePrecedence ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_start_11_0= ruleStartSymbols ) ) ) ) ) )* )
            // InternalLpp.g:86:6: ( ({...}? => ( ({...}? => ( (lv_scanner_1_0= ruleScannerName ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_parser_2_0= ruleParserName ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_importBlock_3_0= ruleImport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_exportBlock_4_0= ruleExport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_globalBlock_5_0= ruleGlobal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_localBlock_6_0= ruleLocal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_beginBlock_7_0= ruleBegin ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_closeBlock_8_0= ruleClose ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_tokens_9_0= ruleTokens ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_precedenc_10_0= rulePrecedence ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_start_11_0= ruleStartSymbols ) ) ) ) ) )*
            {
            // InternalLpp.g:86:6: ( ({...}? => ( ({...}? => ( (lv_scanner_1_0= ruleScannerName ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_parser_2_0= ruleParserName ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_importBlock_3_0= ruleImport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_exportBlock_4_0= ruleExport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_globalBlock_5_0= ruleGlobal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_localBlock_6_0= ruleLocal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_beginBlock_7_0= ruleBegin ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_closeBlock_8_0= ruleClose ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_tokens_9_0= ruleTokens ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_precedenc_10_0= rulePrecedence ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_start_11_0= ruleStartSymbols ) ) ) ) ) )*
            loop1:
            do {
                int alt1=12;
                alt1 = dfa1.predict(input);
                switch (alt1) {
            	case 1 :
            	    // InternalLpp.g:87:4: ({...}? => ( ({...}? => ( (lv_scanner_1_0= ruleScannerName ) ) ) ) )
            	    {
            	    // InternalLpp.g:87:4: ({...}? => ( ({...}? => ( (lv_scanner_1_0= ruleScannerName ) ) ) ) )
            	    // InternalLpp.g:88:5: {...}? => ( ({...}? => ( (lv_scanner_1_0= ruleScannerName ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleParserModel", "getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 0)");
            	    }
            	    // InternalLpp.g:88:108: ( ({...}? => ( (lv_scanner_1_0= ruleScannerName ) ) ) )
            	    // InternalLpp.g:89:6: ({...}? => ( (lv_scanner_1_0= ruleScannerName ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 0);
            	    					
            	    // InternalLpp.g:92:9: ({...}? => ( (lv_scanner_1_0= ruleScannerName ) ) )
            	    // InternalLpp.g:92:10: {...}? => ( (lv_scanner_1_0= ruleScannerName ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleParserModel", "true");
            	    }
            	    // InternalLpp.g:92:19: ( (lv_scanner_1_0= ruleScannerName ) )
            	    // InternalLpp.g:92:20: (lv_scanner_1_0= ruleScannerName )
            	    {
            	    // InternalLpp.g:92:20: (lv_scanner_1_0= ruleScannerName )
            	    // InternalLpp.g:93:10: lv_scanner_1_0= ruleScannerName
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
            	    											"de.roma.cocktail.xtext.Lpp.ScannerName");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getParserModelAccess().getUnorderedGroup_0());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalLpp.g:115:4: ({...}? => ( ({...}? => ( (lv_parser_2_0= ruleParserName ) ) ) ) )
            	    {
            	    // InternalLpp.g:115:4: ({...}? => ( ({...}? => ( (lv_parser_2_0= ruleParserName ) ) ) ) )
            	    // InternalLpp.g:116:5: {...}? => ( ({...}? => ( (lv_parser_2_0= ruleParserName ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleParserModel", "getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 1)");
            	    }
            	    // InternalLpp.g:116:108: ( ({...}? => ( (lv_parser_2_0= ruleParserName ) ) ) )
            	    // InternalLpp.g:117:6: ({...}? => ( (lv_parser_2_0= ruleParserName ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 1);
            	    					
            	    // InternalLpp.g:120:9: ({...}? => ( (lv_parser_2_0= ruleParserName ) ) )
            	    // InternalLpp.g:120:10: {...}? => ( (lv_parser_2_0= ruleParserName ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleParserModel", "true");
            	    }
            	    // InternalLpp.g:120:19: ( (lv_parser_2_0= ruleParserName ) )
            	    // InternalLpp.g:120:20: (lv_parser_2_0= ruleParserName )
            	    {
            	    // InternalLpp.g:120:20: (lv_parser_2_0= ruleParserName )
            	    // InternalLpp.g:121:10: lv_parser_2_0= ruleParserName
            	    {

            	    										newCompositeNode(grammarAccess.getParserModelAccess().getParserParserNameParserRuleCall_0_1_0());
            	    									
            	    pushFollow(FOLLOW_3);
            	    lv_parser_2_0=ruleParserName();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getParserModelRule());
            	    										}
            	    										set(
            	    											current,
            	    											"parser",
            	    											lv_parser_2_0,
            	    											"de.roma.cocktail.xtext.Lpp.ParserName");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getParserModelAccess().getUnorderedGroup_0());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalLpp.g:143:4: ({...}? => ( ({...}? => ( (lv_importBlock_3_0= ruleImport ) ) ) ) )
            	    {
            	    // InternalLpp.g:143:4: ({...}? => ( ({...}? => ( (lv_importBlock_3_0= ruleImport ) ) ) ) )
            	    // InternalLpp.g:144:5: {...}? => ( ({...}? => ( (lv_importBlock_3_0= ruleImport ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleParserModel", "getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 2)");
            	    }
            	    // InternalLpp.g:144:108: ( ({...}? => ( (lv_importBlock_3_0= ruleImport ) ) ) )
            	    // InternalLpp.g:145:6: ({...}? => ( (lv_importBlock_3_0= ruleImport ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 2);
            	    					
            	    // InternalLpp.g:148:9: ({...}? => ( (lv_importBlock_3_0= ruleImport ) ) )
            	    // InternalLpp.g:148:10: {...}? => ( (lv_importBlock_3_0= ruleImport ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleParserModel", "true");
            	    }
            	    // InternalLpp.g:148:19: ( (lv_importBlock_3_0= ruleImport ) )
            	    // InternalLpp.g:148:20: (lv_importBlock_3_0= ruleImport )
            	    {
            	    // InternalLpp.g:148:20: (lv_importBlock_3_0= ruleImport )
            	    // InternalLpp.g:149:10: lv_importBlock_3_0= ruleImport
            	    {

            	    										newCompositeNode(grammarAccess.getParserModelAccess().getImportBlockImportParserRuleCall_0_2_0());
            	    									
            	    pushFollow(FOLLOW_3);
            	    lv_importBlock_3_0=ruleImport();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getParserModelRule());
            	    										}
            	    										set(
            	    											current,
            	    											"importBlock",
            	    											lv_importBlock_3_0,
            	    											"de.roma.cocktail.xtext.Lpp.Import");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getParserModelAccess().getUnorderedGroup_0());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalLpp.g:171:4: ({...}? => ( ({...}? => ( (lv_exportBlock_4_0= ruleExport ) ) ) ) )
            	    {
            	    // InternalLpp.g:171:4: ({...}? => ( ({...}? => ( (lv_exportBlock_4_0= ruleExport ) ) ) ) )
            	    // InternalLpp.g:172:5: {...}? => ( ({...}? => ( (lv_exportBlock_4_0= ruleExport ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleParserModel", "getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 3)");
            	    }
            	    // InternalLpp.g:172:108: ( ({...}? => ( (lv_exportBlock_4_0= ruleExport ) ) ) )
            	    // InternalLpp.g:173:6: ({...}? => ( (lv_exportBlock_4_0= ruleExport ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 3);
            	    					
            	    // InternalLpp.g:176:9: ({...}? => ( (lv_exportBlock_4_0= ruleExport ) ) )
            	    // InternalLpp.g:176:10: {...}? => ( (lv_exportBlock_4_0= ruleExport ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleParserModel", "true");
            	    }
            	    // InternalLpp.g:176:19: ( (lv_exportBlock_4_0= ruleExport ) )
            	    // InternalLpp.g:176:20: (lv_exportBlock_4_0= ruleExport )
            	    {
            	    // InternalLpp.g:176:20: (lv_exportBlock_4_0= ruleExport )
            	    // InternalLpp.g:177:10: lv_exportBlock_4_0= ruleExport
            	    {

            	    										newCompositeNode(grammarAccess.getParserModelAccess().getExportBlockExportParserRuleCall_0_3_0());
            	    									
            	    pushFollow(FOLLOW_3);
            	    lv_exportBlock_4_0=ruleExport();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getParserModelRule());
            	    										}
            	    										set(
            	    											current,
            	    											"exportBlock",
            	    											lv_exportBlock_4_0,
            	    											"de.roma.cocktail.xtext.Lpp.Export");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getParserModelAccess().getUnorderedGroup_0());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalLpp.g:199:4: ({...}? => ( ({...}? => ( (lv_globalBlock_5_0= ruleGlobal ) ) ) ) )
            	    {
            	    // InternalLpp.g:199:4: ({...}? => ( ({...}? => ( (lv_globalBlock_5_0= ruleGlobal ) ) ) ) )
            	    // InternalLpp.g:200:5: {...}? => ( ({...}? => ( (lv_globalBlock_5_0= ruleGlobal ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleParserModel", "getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 4)");
            	    }
            	    // InternalLpp.g:200:108: ( ({...}? => ( (lv_globalBlock_5_0= ruleGlobal ) ) ) )
            	    // InternalLpp.g:201:6: ({...}? => ( (lv_globalBlock_5_0= ruleGlobal ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 4);
            	    					
            	    // InternalLpp.g:204:9: ({...}? => ( (lv_globalBlock_5_0= ruleGlobal ) ) )
            	    // InternalLpp.g:204:10: {...}? => ( (lv_globalBlock_5_0= ruleGlobal ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleParserModel", "true");
            	    }
            	    // InternalLpp.g:204:19: ( (lv_globalBlock_5_0= ruleGlobal ) )
            	    // InternalLpp.g:204:20: (lv_globalBlock_5_0= ruleGlobal )
            	    {
            	    // InternalLpp.g:204:20: (lv_globalBlock_5_0= ruleGlobal )
            	    // InternalLpp.g:205:10: lv_globalBlock_5_0= ruleGlobal
            	    {

            	    										newCompositeNode(grammarAccess.getParserModelAccess().getGlobalBlockGlobalParserRuleCall_0_4_0());
            	    									
            	    pushFollow(FOLLOW_3);
            	    lv_globalBlock_5_0=ruleGlobal();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getParserModelRule());
            	    										}
            	    										set(
            	    											current,
            	    											"globalBlock",
            	    											lv_globalBlock_5_0,
            	    											"de.roma.cocktail.xtext.Lpp.Global");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getParserModelAccess().getUnorderedGroup_0());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalLpp.g:227:4: ({...}? => ( ({...}? => ( (lv_localBlock_6_0= ruleLocal ) ) ) ) )
            	    {
            	    // InternalLpp.g:227:4: ({...}? => ( ({...}? => ( (lv_localBlock_6_0= ruleLocal ) ) ) ) )
            	    // InternalLpp.g:228:5: {...}? => ( ({...}? => ( (lv_localBlock_6_0= ruleLocal ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleParserModel", "getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 5)");
            	    }
            	    // InternalLpp.g:228:108: ( ({...}? => ( (lv_localBlock_6_0= ruleLocal ) ) ) )
            	    // InternalLpp.g:229:6: ({...}? => ( (lv_localBlock_6_0= ruleLocal ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 5);
            	    					
            	    // InternalLpp.g:232:9: ({...}? => ( (lv_localBlock_6_0= ruleLocal ) ) )
            	    // InternalLpp.g:232:10: {...}? => ( (lv_localBlock_6_0= ruleLocal ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleParserModel", "true");
            	    }
            	    // InternalLpp.g:232:19: ( (lv_localBlock_6_0= ruleLocal ) )
            	    // InternalLpp.g:232:20: (lv_localBlock_6_0= ruleLocal )
            	    {
            	    // InternalLpp.g:232:20: (lv_localBlock_6_0= ruleLocal )
            	    // InternalLpp.g:233:10: lv_localBlock_6_0= ruleLocal
            	    {

            	    										newCompositeNode(grammarAccess.getParserModelAccess().getLocalBlockLocalParserRuleCall_0_5_0());
            	    									
            	    pushFollow(FOLLOW_3);
            	    lv_localBlock_6_0=ruleLocal();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getParserModelRule());
            	    										}
            	    										set(
            	    											current,
            	    											"localBlock",
            	    											lv_localBlock_6_0,
            	    											"de.roma.cocktail.xtext.Lpp.Local");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getParserModelAccess().getUnorderedGroup_0());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // InternalLpp.g:255:4: ({...}? => ( ({...}? => ( (lv_beginBlock_7_0= ruleBegin ) ) ) ) )
            	    {
            	    // InternalLpp.g:255:4: ({...}? => ( ({...}? => ( (lv_beginBlock_7_0= ruleBegin ) ) ) ) )
            	    // InternalLpp.g:256:5: {...}? => ( ({...}? => ( (lv_beginBlock_7_0= ruleBegin ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleParserModel", "getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 6)");
            	    }
            	    // InternalLpp.g:256:108: ( ({...}? => ( (lv_beginBlock_7_0= ruleBegin ) ) ) )
            	    // InternalLpp.g:257:6: ({...}? => ( (lv_beginBlock_7_0= ruleBegin ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 6);
            	    					
            	    // InternalLpp.g:260:9: ({...}? => ( (lv_beginBlock_7_0= ruleBegin ) ) )
            	    // InternalLpp.g:260:10: {...}? => ( (lv_beginBlock_7_0= ruleBegin ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleParserModel", "true");
            	    }
            	    // InternalLpp.g:260:19: ( (lv_beginBlock_7_0= ruleBegin ) )
            	    // InternalLpp.g:260:20: (lv_beginBlock_7_0= ruleBegin )
            	    {
            	    // InternalLpp.g:260:20: (lv_beginBlock_7_0= ruleBegin )
            	    // InternalLpp.g:261:10: lv_beginBlock_7_0= ruleBegin
            	    {

            	    										newCompositeNode(grammarAccess.getParserModelAccess().getBeginBlockBeginParserRuleCall_0_6_0());
            	    									
            	    pushFollow(FOLLOW_3);
            	    lv_beginBlock_7_0=ruleBegin();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getParserModelRule());
            	    										}
            	    										set(
            	    											current,
            	    											"beginBlock",
            	    											lv_beginBlock_7_0,
            	    											"de.roma.cocktail.xtext.Lpp.Begin");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getParserModelAccess().getUnorderedGroup_0());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 8 :
            	    // InternalLpp.g:283:4: ({...}? => ( ({...}? => ( (lv_closeBlock_8_0= ruleClose ) ) ) ) )
            	    {
            	    // InternalLpp.g:283:4: ({...}? => ( ({...}? => ( (lv_closeBlock_8_0= ruleClose ) ) ) ) )
            	    // InternalLpp.g:284:5: {...}? => ( ({...}? => ( (lv_closeBlock_8_0= ruleClose ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 7) ) {
            	        throw new FailedPredicateException(input, "ruleParserModel", "getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 7)");
            	    }
            	    // InternalLpp.g:284:108: ( ({...}? => ( (lv_closeBlock_8_0= ruleClose ) ) ) )
            	    // InternalLpp.g:285:6: ({...}? => ( (lv_closeBlock_8_0= ruleClose ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 7);
            	    					
            	    // InternalLpp.g:288:9: ({...}? => ( (lv_closeBlock_8_0= ruleClose ) ) )
            	    // InternalLpp.g:288:10: {...}? => ( (lv_closeBlock_8_0= ruleClose ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleParserModel", "true");
            	    }
            	    // InternalLpp.g:288:19: ( (lv_closeBlock_8_0= ruleClose ) )
            	    // InternalLpp.g:288:20: (lv_closeBlock_8_0= ruleClose )
            	    {
            	    // InternalLpp.g:288:20: (lv_closeBlock_8_0= ruleClose )
            	    // InternalLpp.g:289:10: lv_closeBlock_8_0= ruleClose
            	    {

            	    										newCompositeNode(grammarAccess.getParserModelAccess().getCloseBlockCloseParserRuleCall_0_7_0());
            	    									
            	    pushFollow(FOLLOW_3);
            	    lv_closeBlock_8_0=ruleClose();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getParserModelRule());
            	    										}
            	    										set(
            	    											current,
            	    											"closeBlock",
            	    											lv_closeBlock_8_0,
            	    											"de.roma.cocktail.xtext.Lpp.Close");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getParserModelAccess().getUnorderedGroup_0());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 9 :
            	    // InternalLpp.g:311:4: ({...}? => ( ({...}? => ( (lv_tokens_9_0= ruleTokens ) ) ) ) )
            	    {
            	    // InternalLpp.g:311:4: ({...}? => ( ({...}? => ( (lv_tokens_9_0= ruleTokens ) ) ) ) )
            	    // InternalLpp.g:312:5: {...}? => ( ({...}? => ( (lv_tokens_9_0= ruleTokens ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 8) ) {
            	        throw new FailedPredicateException(input, "ruleParserModel", "getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 8)");
            	    }
            	    // InternalLpp.g:312:108: ( ({...}? => ( (lv_tokens_9_0= ruleTokens ) ) ) )
            	    // InternalLpp.g:313:6: ({...}? => ( (lv_tokens_9_0= ruleTokens ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 8);
            	    					
            	    // InternalLpp.g:316:9: ({...}? => ( (lv_tokens_9_0= ruleTokens ) ) )
            	    // InternalLpp.g:316:10: {...}? => ( (lv_tokens_9_0= ruleTokens ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleParserModel", "true");
            	    }
            	    // InternalLpp.g:316:19: ( (lv_tokens_9_0= ruleTokens ) )
            	    // InternalLpp.g:316:20: (lv_tokens_9_0= ruleTokens )
            	    {
            	    // InternalLpp.g:316:20: (lv_tokens_9_0= ruleTokens )
            	    // InternalLpp.g:317:10: lv_tokens_9_0= ruleTokens
            	    {

            	    										newCompositeNode(grammarAccess.getParserModelAccess().getTokensTokensParserRuleCall_0_8_0());
            	    									
            	    pushFollow(FOLLOW_3);
            	    lv_tokens_9_0=ruleTokens();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getParserModelRule());
            	    										}
            	    										set(
            	    											current,
            	    											"tokens",
            	    											lv_tokens_9_0,
            	    											"de.roma.cocktail.xtext.Lpp.Tokens");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getParserModelAccess().getUnorderedGroup_0());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 10 :
            	    // InternalLpp.g:339:4: ({...}? => ( ({...}? => ( (lv_precedenc_10_0= rulePrecedence ) ) ) ) )
            	    {
            	    // InternalLpp.g:339:4: ({...}? => ( ({...}? => ( (lv_precedenc_10_0= rulePrecedence ) ) ) ) )
            	    // InternalLpp.g:340:5: {...}? => ( ({...}? => ( (lv_precedenc_10_0= rulePrecedence ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 9) ) {
            	        throw new FailedPredicateException(input, "ruleParserModel", "getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 9)");
            	    }
            	    // InternalLpp.g:340:108: ( ({...}? => ( (lv_precedenc_10_0= rulePrecedence ) ) ) )
            	    // InternalLpp.g:341:6: ({...}? => ( (lv_precedenc_10_0= rulePrecedence ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 9);
            	    					
            	    // InternalLpp.g:344:9: ({...}? => ( (lv_precedenc_10_0= rulePrecedence ) ) )
            	    // InternalLpp.g:344:10: {...}? => ( (lv_precedenc_10_0= rulePrecedence ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleParserModel", "true");
            	    }
            	    // InternalLpp.g:344:19: ( (lv_precedenc_10_0= rulePrecedence ) )
            	    // InternalLpp.g:344:20: (lv_precedenc_10_0= rulePrecedence )
            	    {
            	    // InternalLpp.g:344:20: (lv_precedenc_10_0= rulePrecedence )
            	    // InternalLpp.g:345:10: lv_precedenc_10_0= rulePrecedence
            	    {

            	    										newCompositeNode(grammarAccess.getParserModelAccess().getPrecedencPrecedenceParserRuleCall_0_9_0());
            	    									
            	    pushFollow(FOLLOW_3);
            	    lv_precedenc_10_0=rulePrecedence();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getParserModelRule());
            	    										}
            	    										set(
            	    											current,
            	    											"precedenc",
            	    											lv_precedenc_10_0,
            	    											"de.roma.cocktail.xtext.Lpp.Precedence");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getParserModelAccess().getUnorderedGroup_0());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 11 :
            	    // InternalLpp.g:367:4: ({...}? => ( ({...}? => ( (lv_start_11_0= ruleStartSymbols ) ) ) ) )
            	    {
            	    // InternalLpp.g:367:4: ({...}? => ( ({...}? => ( (lv_start_11_0= ruleStartSymbols ) ) ) ) )
            	    // InternalLpp.g:368:5: {...}? => ( ({...}? => ( (lv_start_11_0= ruleStartSymbols ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 10) ) {
            	        throw new FailedPredicateException(input, "ruleParserModel", "getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 10)");
            	    }
            	    // InternalLpp.g:368:109: ( ({...}? => ( (lv_start_11_0= ruleStartSymbols ) ) ) )
            	    // InternalLpp.g:369:6: ({...}? => ( (lv_start_11_0= ruleStartSymbols ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 10);
            	    					
            	    // InternalLpp.g:372:9: ({...}? => ( (lv_start_11_0= ruleStartSymbols ) ) )
            	    // InternalLpp.g:372:10: {...}? => ( (lv_start_11_0= ruleStartSymbols ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleParserModel", "true");
            	    }
            	    // InternalLpp.g:372:19: ( (lv_start_11_0= ruleStartSymbols ) )
            	    // InternalLpp.g:372:20: (lv_start_11_0= ruleStartSymbols )
            	    {
            	    // InternalLpp.g:372:20: (lv_start_11_0= ruleStartSymbols )
            	    // InternalLpp.g:373:10: lv_start_11_0= ruleStartSymbols
            	    {

            	    										newCompositeNode(grammarAccess.getParserModelAccess().getStartStartSymbolsParserRuleCall_0_10_0());
            	    									
            	    pushFollow(FOLLOW_3);
            	    lv_start_11_0=ruleStartSymbols();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getParserModelRule());
            	    										}
            	    										set(
            	    											current,
            	    											"start",
            	    											lv_start_11_0,
            	    											"de.roma.cocktail.xtext.Lpp.StartSymbols");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getParserModelAccess().getUnorderedGroup_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getParserModelAccess().getUnorderedGroup_0());
            				

            }

            // InternalLpp.g:402:3: ( (lv_rules_12_0= ruleGrammarRules ) )
            // InternalLpp.g:403:4: (lv_rules_12_0= ruleGrammarRules )
            {
            // InternalLpp.g:403:4: (lv_rules_12_0= ruleGrammarRules )
            // InternalLpp.g:404:5: lv_rules_12_0= ruleGrammarRules
            {

            					newCompositeNode(grammarAccess.getParserModelAccess().getRulesGrammarRulesParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_rules_12_0=ruleGrammarRules();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParserModelRule());
            					}
            					set(
            						current,
            						"rules",
            						lv_rules_12_0,
            						"de.roma.cocktail.xtext.Lpp.GrammarRules");
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
    // $ANTLR end "ruleParserModel"


    // $ANTLR start "entryRuleScannerName"
    // InternalLpp.g:425:1: entryRuleScannerName returns [EObject current=null] : iv_ruleScannerName= ruleScannerName EOF ;
    public final EObject entryRuleScannerName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScannerName = null;


        try {
            // InternalLpp.g:425:52: (iv_ruleScannerName= ruleScannerName EOF )
            // InternalLpp.g:426:2: iv_ruleScannerName= ruleScannerName EOF
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
    // InternalLpp.g:432:1: ruleScannerName returns [EObject current=null] : (otherlv_0= 'SCANNER' ( (lv_name_1_0= RULE_ID ) )? ) ;
    public final EObject ruleScannerName() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalLpp.g:438:2: ( (otherlv_0= 'SCANNER' ( (lv_name_1_0= RULE_ID ) )? ) )
            // InternalLpp.g:439:2: (otherlv_0= 'SCANNER' ( (lv_name_1_0= RULE_ID ) )? )
            {
            // InternalLpp.g:439:2: (otherlv_0= 'SCANNER' ( (lv_name_1_0= RULE_ID ) )? )
            // InternalLpp.g:440:3: otherlv_0= 'SCANNER' ( (lv_name_1_0= RULE_ID ) )?
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getScannerNameAccess().getSCANNERKeyword_0());
            		
            // InternalLpp.g:444:3: ( (lv_name_1_0= RULE_ID ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalLpp.g:445:4: (lv_name_1_0= RULE_ID )
                    {
                    // InternalLpp.g:445:4: (lv_name_1_0= RULE_ID )
                    // InternalLpp.g:446:5: lv_name_1_0= RULE_ID
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
    // InternalLpp.g:466:1: entryRuleParserName returns [EObject current=null] : iv_ruleParserName= ruleParserName EOF ;
    public final EObject entryRuleParserName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParserName = null;


        try {
            // InternalLpp.g:466:51: (iv_ruleParserName= ruleParserName EOF )
            // InternalLpp.g:467:2: iv_ruleParserName= ruleParserName EOF
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
    // InternalLpp.g:473:1: ruleParserName returns [EObject current=null] : (otherlv_0= 'PARSER' ( (lv_name_1_0= RULE_ID ) )? ) ;
    public final EObject ruleParserName() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalLpp.g:479:2: ( (otherlv_0= 'PARSER' ( (lv_name_1_0= RULE_ID ) )? ) )
            // InternalLpp.g:480:2: (otherlv_0= 'PARSER' ( (lv_name_1_0= RULE_ID ) )? )
            {
            // InternalLpp.g:480:2: (otherlv_0= 'PARSER' ( (lv_name_1_0= RULE_ID ) )? )
            // InternalLpp.g:481:3: otherlv_0= 'PARSER' ( (lv_name_1_0= RULE_ID ) )?
            {
            otherlv_0=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getParserNameAccess().getPARSERKeyword_0());
            		
            // InternalLpp.g:485:3: ( (lv_name_1_0= RULE_ID ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalLpp.g:486:4: (lv_name_1_0= RULE_ID )
                    {
                    // InternalLpp.g:486:4: (lv_name_1_0= RULE_ID )
                    // InternalLpp.g:487:5: lv_name_1_0= RULE_ID
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
    // InternalLpp.g:507:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalLpp.g:507:47: (iv_ruleImport= ruleImport EOF )
            // InternalLpp.g:508:2: iv_ruleImport= ruleImport EOF
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
    // InternalLpp.g:514:1: ruleImport returns [EObject current=null] : (otherlv_0= 'IMPORT' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_content_2_0 = null;



        	enterRule();

        try {
            // InternalLpp.g:520:2: ( (otherlv_0= 'IMPORT' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' ) )
            // InternalLpp.g:521:2: (otherlv_0= 'IMPORT' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' )
            {
            // InternalLpp.g:521:2: (otherlv_0= 'IMPORT' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' )
            // InternalLpp.g:522:3: otherlv_0= 'IMPORT' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getImportAccess().getIMPORTKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getImportAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalLpp.g:530:3: ( (lv_content_2_0= ruleCodeBlock ) )
            // InternalLpp.g:531:4: (lv_content_2_0= ruleCodeBlock )
            {
            // InternalLpp.g:531:4: (lv_content_2_0= ruleCodeBlock )
            // InternalLpp.g:532:5: lv_content_2_0= ruleCodeBlock
            {

            					newCompositeNode(grammarAccess.getImportAccess().getContentCodeBlockParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_7);
            lv_content_2_0=ruleCodeBlock();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getImportRule());
            					}
            					set(
            						current,
            						"content",
            						lv_content_2_0,
            						"de.roma.cocktail.xtext.Lpp.CodeBlock");
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
    // InternalLpp.g:557:1: entryRuleExport returns [EObject current=null] : iv_ruleExport= ruleExport EOF ;
    public final EObject entryRuleExport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExport = null;


        try {
            // InternalLpp.g:557:47: (iv_ruleExport= ruleExport EOF )
            // InternalLpp.g:558:2: iv_ruleExport= ruleExport EOF
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
    // InternalLpp.g:564:1: ruleExport returns [EObject current=null] : (otherlv_0= 'EXPORT' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' ) ;
    public final EObject ruleExport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_content_2_0 = null;



        	enterRule();

        try {
            // InternalLpp.g:570:2: ( (otherlv_0= 'EXPORT' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' ) )
            // InternalLpp.g:571:2: (otherlv_0= 'EXPORT' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' )
            {
            // InternalLpp.g:571:2: (otherlv_0= 'EXPORT' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' )
            // InternalLpp.g:572:3: otherlv_0= 'EXPORT' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getExportAccess().getEXPORTKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getExportAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalLpp.g:580:3: ( (lv_content_2_0= ruleCodeBlock ) )
            // InternalLpp.g:581:4: (lv_content_2_0= ruleCodeBlock )
            {
            // InternalLpp.g:581:4: (lv_content_2_0= ruleCodeBlock )
            // InternalLpp.g:582:5: lv_content_2_0= ruleCodeBlock
            {

            					newCompositeNode(grammarAccess.getExportAccess().getContentCodeBlockParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_7);
            lv_content_2_0=ruleCodeBlock();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExportRule());
            					}
            					set(
            						current,
            						"content",
            						lv_content_2_0,
            						"de.roma.cocktail.xtext.Lpp.CodeBlock");
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
    // InternalLpp.g:607:1: entryRuleGlobal returns [EObject current=null] : iv_ruleGlobal= ruleGlobal EOF ;
    public final EObject entryRuleGlobal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGlobal = null;


        try {
            // InternalLpp.g:607:47: (iv_ruleGlobal= ruleGlobal EOF )
            // InternalLpp.g:608:2: iv_ruleGlobal= ruleGlobal EOF
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
    // InternalLpp.g:614:1: ruleGlobal returns [EObject current=null] : (otherlv_0= 'GLOBAL' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' ) ;
    public final EObject ruleGlobal() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_content_2_0 = null;



        	enterRule();

        try {
            // InternalLpp.g:620:2: ( (otherlv_0= 'GLOBAL' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' ) )
            // InternalLpp.g:621:2: (otherlv_0= 'GLOBAL' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' )
            {
            // InternalLpp.g:621:2: (otherlv_0= 'GLOBAL' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' )
            // InternalLpp.g:622:3: otherlv_0= 'GLOBAL' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getGlobalAccess().getGLOBALKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getGlobalAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalLpp.g:630:3: ( (lv_content_2_0= ruleCodeBlock ) )
            // InternalLpp.g:631:4: (lv_content_2_0= ruleCodeBlock )
            {
            // InternalLpp.g:631:4: (lv_content_2_0= ruleCodeBlock )
            // InternalLpp.g:632:5: lv_content_2_0= ruleCodeBlock
            {

            					newCompositeNode(grammarAccess.getGlobalAccess().getContentCodeBlockParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_7);
            lv_content_2_0=ruleCodeBlock();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGlobalRule());
            					}
            					set(
            						current,
            						"content",
            						lv_content_2_0,
            						"de.roma.cocktail.xtext.Lpp.CodeBlock");
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
    // InternalLpp.g:657:1: entryRuleLocal returns [EObject current=null] : iv_ruleLocal= ruleLocal EOF ;
    public final EObject entryRuleLocal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocal = null;


        try {
            // InternalLpp.g:657:46: (iv_ruleLocal= ruleLocal EOF )
            // InternalLpp.g:658:2: iv_ruleLocal= ruleLocal EOF
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
    // InternalLpp.g:664:1: ruleLocal returns [EObject current=null] : (otherlv_0= 'LOCAL' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' ) ;
    public final EObject ruleLocal() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_content_2_0 = null;



        	enterRule();

        try {
            // InternalLpp.g:670:2: ( (otherlv_0= 'LOCAL' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' ) )
            // InternalLpp.g:671:2: (otherlv_0= 'LOCAL' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' )
            {
            // InternalLpp.g:671:2: (otherlv_0= 'LOCAL' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' )
            // InternalLpp.g:672:3: otherlv_0= 'LOCAL' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getLocalAccess().getLOCALKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getLocalAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalLpp.g:680:3: ( (lv_content_2_0= ruleCodeBlock ) )
            // InternalLpp.g:681:4: (lv_content_2_0= ruleCodeBlock )
            {
            // InternalLpp.g:681:4: (lv_content_2_0= ruleCodeBlock )
            // InternalLpp.g:682:5: lv_content_2_0= ruleCodeBlock
            {

            					newCompositeNode(grammarAccess.getLocalAccess().getContentCodeBlockParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_7);
            lv_content_2_0=ruleCodeBlock();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLocalRule());
            					}
            					set(
            						current,
            						"content",
            						lv_content_2_0,
            						"de.roma.cocktail.xtext.Lpp.CodeBlock");
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
    // InternalLpp.g:707:1: entryRuleBegin returns [EObject current=null] : iv_ruleBegin= ruleBegin EOF ;
    public final EObject entryRuleBegin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBegin = null;


        try {
            // InternalLpp.g:707:46: (iv_ruleBegin= ruleBegin EOF )
            // InternalLpp.g:708:2: iv_ruleBegin= ruleBegin EOF
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
    // InternalLpp.g:714:1: ruleBegin returns [EObject current=null] : (otherlv_0= 'BEGIN' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' ) ;
    public final EObject ruleBegin() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_content_2_0 = null;



        	enterRule();

        try {
            // InternalLpp.g:720:2: ( (otherlv_0= 'BEGIN' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' ) )
            // InternalLpp.g:721:2: (otherlv_0= 'BEGIN' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' )
            {
            // InternalLpp.g:721:2: (otherlv_0= 'BEGIN' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' )
            // InternalLpp.g:722:3: otherlv_0= 'BEGIN' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getBeginAccess().getBEGINKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getBeginAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalLpp.g:730:3: ( (lv_content_2_0= ruleCodeBlock ) )
            // InternalLpp.g:731:4: (lv_content_2_0= ruleCodeBlock )
            {
            // InternalLpp.g:731:4: (lv_content_2_0= ruleCodeBlock )
            // InternalLpp.g:732:5: lv_content_2_0= ruleCodeBlock
            {

            					newCompositeNode(grammarAccess.getBeginAccess().getContentCodeBlockParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_7);
            lv_content_2_0=ruleCodeBlock();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBeginRule());
            					}
            					set(
            						current,
            						"content",
            						lv_content_2_0,
            						"de.roma.cocktail.xtext.Lpp.CodeBlock");
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
    // InternalLpp.g:757:1: entryRuleClose returns [EObject current=null] : iv_ruleClose= ruleClose EOF ;
    public final EObject entryRuleClose() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClose = null;


        try {
            // InternalLpp.g:757:46: (iv_ruleClose= ruleClose EOF )
            // InternalLpp.g:758:2: iv_ruleClose= ruleClose EOF
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
    // InternalLpp.g:764:1: ruleClose returns [EObject current=null] : (otherlv_0= 'CLOSE' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' ) ;
    public final EObject ruleClose() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_content_2_0 = null;



        	enterRule();

        try {
            // InternalLpp.g:770:2: ( (otherlv_0= 'CLOSE' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' ) )
            // InternalLpp.g:771:2: (otherlv_0= 'CLOSE' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' )
            {
            // InternalLpp.g:771:2: (otherlv_0= 'CLOSE' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' )
            // InternalLpp.g:772:3: otherlv_0= 'CLOSE' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getCloseAccess().getCLOSEKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getCloseAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalLpp.g:780:3: ( (lv_content_2_0= ruleCodeBlock ) )
            // InternalLpp.g:781:4: (lv_content_2_0= ruleCodeBlock )
            {
            // InternalLpp.g:781:4: (lv_content_2_0= ruleCodeBlock )
            // InternalLpp.g:782:5: lv_content_2_0= ruleCodeBlock
            {

            					newCompositeNode(grammarAccess.getCloseAccess().getContentCodeBlockParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_7);
            lv_content_2_0=ruleCodeBlock();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCloseRule());
            					}
            					set(
            						current,
            						"content",
            						lv_content_2_0,
            						"de.roma.cocktail.xtext.Lpp.CodeBlock");
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
    // InternalLpp.g:807:1: entryRuleTokens returns [EObject current=null] : iv_ruleTokens= ruleTokens EOF ;
    public final EObject entryRuleTokens() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTokens = null;


        try {
            // InternalLpp.g:807:47: (iv_ruleTokens= ruleTokens EOF )
            // InternalLpp.g:808:2: iv_ruleTokens= ruleTokens EOF
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
    // InternalLpp.g:814:1: ruleTokens returns [EObject current=null] : (otherlv_0= 'TOKEN' ( (lv_tokens_1_0= ruleDefinedToken ) )* ) ;
    public final EObject ruleTokens() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_tokens_1_0 = null;



        	enterRule();

        try {
            // InternalLpp.g:820:2: ( (otherlv_0= 'TOKEN' ( (lv_tokens_1_0= ruleDefinedToken ) )* ) )
            // InternalLpp.g:821:2: (otherlv_0= 'TOKEN' ( (lv_tokens_1_0= ruleDefinedToken ) )* )
            {
            // InternalLpp.g:821:2: (otherlv_0= 'TOKEN' ( (lv_tokens_1_0= ruleDefinedToken ) )* )
            // InternalLpp.g:822:3: otherlv_0= 'TOKEN' ( (lv_tokens_1_0= ruleDefinedToken ) )*
            {
            otherlv_0=(Token)match(input,21,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getTokensAccess().getTOKENKeyword_0());
            		
            // InternalLpp.g:826:3: ( (lv_tokens_1_0= ruleDefinedToken ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=RULE_ID && LA4_0<=RULE_WS)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalLpp.g:827:4: (lv_tokens_1_0= ruleDefinedToken )
            	    {
            	    // InternalLpp.g:827:4: (lv_tokens_1_0= ruleDefinedToken )
            	    // InternalLpp.g:828:5: lv_tokens_1_0= ruleDefinedToken
            	    {

            	    					newCompositeNode(grammarAccess.getTokensAccess().getTokensDefinedTokenParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_tokens_1_0=ruleDefinedToken();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTokensRule());
            	    					}
            	    					add(
            	    						current,
            	    						"tokens",
            	    						lv_tokens_1_0,
            	    						"de.roma.cocktail.xtext.Lpp.DefinedToken");
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
    // InternalLpp.g:849:1: entryRuleDefinedToken returns [EObject current=null] : iv_ruleDefinedToken= ruleDefinedToken EOF ;
    public final EObject entryRuleDefinedToken() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefinedToken = null;


        try {
            // InternalLpp.g:849:53: (iv_ruleDefinedToken= ruleDefinedToken EOF )
            // InternalLpp.g:850:2: iv_ruleDefinedToken= ruleDefinedToken EOF
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
    // InternalLpp.g:856:1: ruleDefinedToken returns [EObject current=null] : ( ( ( ( (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING ) ) ) (otherlv_1= '=' ( (lv_number_2_0= RULE_INT ) ) (otherlv_3= ',' ( (lv_extra_4_0= ruleTokenExtra ) ) )? ) ) | ( (lv_extra_5_0= ruleTokenExtra ) ) | this_WS_6= RULE_WS ) ;
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
            // InternalLpp.g:862:2: ( ( ( ( ( (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING ) ) ) (otherlv_1= '=' ( (lv_number_2_0= RULE_INT ) ) (otherlv_3= ',' ( (lv_extra_4_0= ruleTokenExtra ) ) )? ) ) | ( (lv_extra_5_0= ruleTokenExtra ) ) | this_WS_6= RULE_WS ) )
            // InternalLpp.g:863:2: ( ( ( ( (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING ) ) ) (otherlv_1= '=' ( (lv_number_2_0= RULE_INT ) ) (otherlv_3= ',' ( (lv_extra_4_0= ruleTokenExtra ) ) )? ) ) | ( (lv_extra_5_0= ruleTokenExtra ) ) | this_WS_6= RULE_WS )
            {
            // InternalLpp.g:863:2: ( ( ( ( (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING ) ) ) (otherlv_1= '=' ( (lv_number_2_0= RULE_INT ) ) (otherlv_3= ',' ( (lv_extra_4_0= ruleTokenExtra ) ) )? ) ) | ( (lv_extra_5_0= ruleTokenExtra ) ) | this_WS_6= RULE_WS )
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
                    // InternalLpp.g:864:3: ( ( ( (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING ) ) ) (otherlv_1= '=' ( (lv_number_2_0= RULE_INT ) ) (otherlv_3= ',' ( (lv_extra_4_0= ruleTokenExtra ) ) )? ) )
                    {
                    // InternalLpp.g:864:3: ( ( ( (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING ) ) ) (otherlv_1= '=' ( (lv_number_2_0= RULE_INT ) ) (otherlv_3= ',' ( (lv_extra_4_0= ruleTokenExtra ) ) )? ) )
                    // InternalLpp.g:865:4: ( ( (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING ) ) ) (otherlv_1= '=' ( (lv_number_2_0= RULE_INT ) ) (otherlv_3= ',' ( (lv_extra_4_0= ruleTokenExtra ) ) )? )
                    {
                    // InternalLpp.g:865:4: ( ( (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING ) ) )
                    // InternalLpp.g:866:5: ( (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING ) )
                    {
                    // InternalLpp.g:866:5: ( (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING ) )
                    // InternalLpp.g:867:6: (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING )
                    {
                    // InternalLpp.g:867:6: (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING )
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
                            // InternalLpp.g:868:7: lv_name_0_1= RULE_ID
                            {
                            lv_name_0_1=(Token)match(input,RULE_ID,FOLLOW_9); 

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
                            // InternalLpp.g:883:7: lv_name_0_2= RULE_STRING
                            {
                            lv_name_0_2=(Token)match(input,RULE_STRING,FOLLOW_9); 

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

                    // InternalLpp.g:900:4: (otherlv_1= '=' ( (lv_number_2_0= RULE_INT ) ) (otherlv_3= ',' ( (lv_extra_4_0= ruleTokenExtra ) ) )? )
                    // InternalLpp.g:901:5: otherlv_1= '=' ( (lv_number_2_0= RULE_INT ) ) (otherlv_3= ',' ( (lv_extra_4_0= ruleTokenExtra ) ) )?
                    {
                    otherlv_1=(Token)match(input,22,FOLLOW_10); 

                    					newLeafNode(otherlv_1, grammarAccess.getDefinedTokenAccess().getEqualsSignKeyword_0_1_0());
                    				
                    // InternalLpp.g:905:5: ( (lv_number_2_0= RULE_INT ) )
                    // InternalLpp.g:906:6: (lv_number_2_0= RULE_INT )
                    {
                    // InternalLpp.g:906:6: (lv_number_2_0= RULE_INT )
                    // InternalLpp.g:907:7: lv_number_2_0= RULE_INT
                    {
                    lv_number_2_0=(Token)match(input,RULE_INT,FOLLOW_11); 

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

                    // InternalLpp.g:923:5: (otherlv_3= ',' ( (lv_extra_4_0= ruleTokenExtra ) ) )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==23) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // InternalLpp.g:924:6: otherlv_3= ',' ( (lv_extra_4_0= ruleTokenExtra ) )
                            {
                            otherlv_3=(Token)match(input,23,FOLLOW_10); 

                            						newLeafNode(otherlv_3, grammarAccess.getDefinedTokenAccess().getCommaKeyword_0_1_2_0());
                            					
                            // InternalLpp.g:928:6: ( (lv_extra_4_0= ruleTokenExtra ) )
                            // InternalLpp.g:929:7: (lv_extra_4_0= ruleTokenExtra )
                            {
                            // InternalLpp.g:929:7: (lv_extra_4_0= ruleTokenExtra )
                            // InternalLpp.g:930:8: lv_extra_4_0= ruleTokenExtra
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
                            									"de.roma.cocktail.xtext.Lpp.TokenExtra");
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
                    // InternalLpp.g:951:3: ( (lv_extra_5_0= ruleTokenExtra ) )
                    {
                    // InternalLpp.g:951:3: ( (lv_extra_5_0= ruleTokenExtra ) )
                    // InternalLpp.g:952:4: (lv_extra_5_0= ruleTokenExtra )
                    {
                    // InternalLpp.g:952:4: (lv_extra_5_0= ruleTokenExtra )
                    // InternalLpp.g:953:5: lv_extra_5_0= ruleTokenExtra
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
                    						"de.roma.cocktail.xtext.Lpp.TokenExtra");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalLpp.g:971:3: this_WS_6= RULE_WS
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
    // InternalLpp.g:979:1: entryRuleTokenExtra returns [EObject current=null] : iv_ruleTokenExtra= ruleTokenExtra EOF ;
    public final EObject entryRuleTokenExtra() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTokenExtra = null;


        try {
            // InternalLpp.g:979:51: (iv_ruleTokenExtra= ruleTokenExtra EOF )
            // InternalLpp.g:980:2: iv_ruleTokenExtra= ruleTokenExtra EOF
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
    // InternalLpp.g:986:1: ruleTokenExtra returns [EObject current=null] : ( ( (lv_cost_0_0= RULE_INT ) ) otherlv_1= ',' ( (lv_presentation_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleTokenExtra() throws RecognitionException {
        EObject current = null;

        Token lv_cost_0_0=null;
        Token otherlv_1=null;
        Token lv_presentation_2_0=null;


        	enterRule();

        try {
            // InternalLpp.g:992:2: ( ( ( (lv_cost_0_0= RULE_INT ) ) otherlv_1= ',' ( (lv_presentation_2_0= RULE_STRING ) ) ) )
            // InternalLpp.g:993:2: ( ( (lv_cost_0_0= RULE_INT ) ) otherlv_1= ',' ( (lv_presentation_2_0= RULE_STRING ) ) )
            {
            // InternalLpp.g:993:2: ( ( (lv_cost_0_0= RULE_INT ) ) otherlv_1= ',' ( (lv_presentation_2_0= RULE_STRING ) ) )
            // InternalLpp.g:994:3: ( (lv_cost_0_0= RULE_INT ) ) otherlv_1= ',' ( (lv_presentation_2_0= RULE_STRING ) )
            {
            // InternalLpp.g:994:3: ( (lv_cost_0_0= RULE_INT ) )
            // InternalLpp.g:995:4: (lv_cost_0_0= RULE_INT )
            {
            // InternalLpp.g:995:4: (lv_cost_0_0= RULE_INT )
            // InternalLpp.g:996:5: lv_cost_0_0= RULE_INT
            {
            lv_cost_0_0=(Token)match(input,RULE_INT,FOLLOW_12); 

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

            otherlv_1=(Token)match(input,23,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getTokenExtraAccess().getCommaKeyword_1());
            		
            // InternalLpp.g:1016:3: ( (lv_presentation_2_0= RULE_STRING ) )
            // InternalLpp.g:1017:4: (lv_presentation_2_0= RULE_STRING )
            {
            // InternalLpp.g:1017:4: (lv_presentation_2_0= RULE_STRING )
            // InternalLpp.g:1018:5: lv_presentation_2_0= RULE_STRING
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
    // InternalLpp.g:1038:1: entryRuleCodeBlock returns [String current=null] : iv_ruleCodeBlock= ruleCodeBlock EOF ;
    public final String entryRuleCodeBlock() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCodeBlock = null;


        try {
            // InternalLpp.g:1038:49: (iv_ruleCodeBlock= ruleCodeBlock EOF )
            // InternalLpp.g:1039:2: iv_ruleCodeBlock= ruleCodeBlock EOF
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
    // InternalLpp.g:1045:1: ruleCodeBlock returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_CodeWall_0= ruleCodeWall | (kw= '{' this_CodeBlock_2= ruleCodeBlock kw= '}' ) )* ;
    public final AntlrDatatypeRuleToken ruleCodeBlock() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_CodeWall_0 = null;

        AntlrDatatypeRuleToken this_CodeBlock_2 = null;



        	enterRule();

        try {
            // InternalLpp.g:1051:2: ( (this_CodeWall_0= ruleCodeWall | (kw= '{' this_CodeBlock_2= ruleCodeBlock kw= '}' ) )* )
            // InternalLpp.g:1052:2: (this_CodeWall_0= ruleCodeWall | (kw= '{' this_CodeBlock_2= ruleCodeBlock kw= '}' ) )*
            {
            // InternalLpp.g:1052:2: (this_CodeWall_0= ruleCodeWall | (kw= '{' this_CodeBlock_2= ruleCodeBlock kw= '}' ) )*
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
            	    // InternalLpp.g:1053:3: this_CodeWall_0= ruleCodeWall
            	    {

            	    			newCompositeNode(grammarAccess.getCodeBlockAccess().getCodeWallParserRuleCall_0());
            	    		
            	    pushFollow(FOLLOW_14);
            	    this_CodeWall_0=ruleCodeWall();

            	    state._fsp--;


            	    			current.merge(this_CodeWall_0);
            	    		

            	    			afterParserOrEnumRuleCall();
            	    		

            	    }
            	    break;
            	case 2 :
            	    // InternalLpp.g:1064:3: (kw= '{' this_CodeBlock_2= ruleCodeBlock kw= '}' )
            	    {
            	    // InternalLpp.g:1064:3: (kw= '{' this_CodeBlock_2= ruleCodeBlock kw= '}' )
            	    // InternalLpp.g:1065:4: kw= '{' this_CodeBlock_2= ruleCodeBlock kw= '}'
            	    {
            	    kw=(Token)match(input,14,FOLLOW_6); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getCodeBlockAccess().getLeftCurlyBracketKeyword_1_0());
            	    			

            	    				newCompositeNode(grammarAccess.getCodeBlockAccess().getCodeBlockParserRuleCall_1_1());
            	    			
            	    pushFollow(FOLLOW_7);
            	    this_CodeBlock_2=ruleCodeBlock();

            	    state._fsp--;


            	    				current.merge(this_CodeBlock_2);
            	    			

            	    				afterParserOrEnumRuleCall();
            	    			
            	    kw=(Token)match(input,15,FOLLOW_14); 

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
    // InternalLpp.g:1090:1: entryRuleCodeWall returns [String current=null] : iv_ruleCodeWall= ruleCodeWall EOF ;
    public final String entryRuleCodeWall() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCodeWall = null;


        try {
            // InternalLpp.g:1090:48: (iv_ruleCodeWall= ruleCodeWall EOF )
            // InternalLpp.g:1091:2: iv_ruleCodeWall= ruleCodeWall EOF
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
    // InternalLpp.g:1097:1: ruleCodeWall returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_INT_1= RULE_INT | this_STRING_2= RULE_STRING | this_WS_3= RULE_WS | kw= '+' | kw= '-' | kw= '(' | kw= ')' | kw= '*' | kw= '.' | kw= '/' | kw= '\\\\' | kw= '|' | kw= '?' | kw= '>' | kw= '<' | kw= '#' | kw= '$' | kw= '%' | kw= ';' | kw= ':' | kw= '!' | kw= '=' | kw= ',' ) ;
    public final AntlrDatatypeRuleToken ruleCodeWall() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_INT_1=null;
        Token this_STRING_2=null;
        Token this_WS_3=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalLpp.g:1103:2: ( (this_ID_0= RULE_ID | this_INT_1= RULE_INT | this_STRING_2= RULE_STRING | this_WS_3= RULE_WS | kw= '+' | kw= '-' | kw= '(' | kw= ')' | kw= '*' | kw= '.' | kw= '/' | kw= '\\\\' | kw= '|' | kw= '?' | kw= '>' | kw= '<' | kw= '#' | kw= '$' | kw= '%' | kw= ';' | kw= ':' | kw= '!' | kw= '=' | kw= ',' ) )
            // InternalLpp.g:1104:2: (this_ID_0= RULE_ID | this_INT_1= RULE_INT | this_STRING_2= RULE_STRING | this_WS_3= RULE_WS | kw= '+' | kw= '-' | kw= '(' | kw= ')' | kw= '*' | kw= '.' | kw= '/' | kw= '\\\\' | kw= '|' | kw= '?' | kw= '>' | kw= '<' | kw= '#' | kw= '$' | kw= '%' | kw= ';' | kw= ':' | kw= '!' | kw= '=' | kw= ',' )
            {
            // InternalLpp.g:1104:2: (this_ID_0= RULE_ID | this_INT_1= RULE_INT | this_STRING_2= RULE_STRING | this_WS_3= RULE_WS | kw= '+' | kw= '-' | kw= '(' | kw= ')' | kw= '*' | kw= '.' | kw= '/' | kw= '\\\\' | kw= '|' | kw= '?' | kw= '>' | kw= '<' | kw= '#' | kw= '$' | kw= '%' | kw= ';' | kw= ':' | kw= '!' | kw= '=' | kw= ',' )
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
                    // InternalLpp.g:1105:3: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_0);
                    		

                    			newLeafNode(this_ID_0, grammarAccess.getCodeWallAccess().getIDTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalLpp.g:1113:3: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			current.merge(this_INT_1);
                    		

                    			newLeafNode(this_INT_1, grammarAccess.getCodeWallAccess().getINTTerminalRuleCall_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalLpp.g:1121:3: this_STRING_2= RULE_STRING
                    {
                    this_STRING_2=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_2);
                    		

                    			newLeafNode(this_STRING_2, grammarAccess.getCodeWallAccess().getSTRINGTerminalRuleCall_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalLpp.g:1129:3: this_WS_3= RULE_WS
                    {
                    this_WS_3=(Token)match(input,RULE_WS,FOLLOW_2); 

                    			current.merge(this_WS_3);
                    		

                    			newLeafNode(this_WS_3, grammarAccess.getCodeWallAccess().getWSTerminalRuleCall_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalLpp.g:1137:3: kw= '+'
                    {
                    kw=(Token)match(input,24,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCodeWallAccess().getPlusSignKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalLpp.g:1143:3: kw= '-'
                    {
                    kw=(Token)match(input,25,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCodeWallAccess().getHyphenMinusKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalLpp.g:1149:3: kw= '('
                    {
                    kw=(Token)match(input,26,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCodeWallAccess().getLeftParenthesisKeyword_6());
                    		

                    }
                    break;
                case 8 :
                    // InternalLpp.g:1155:3: kw= ')'
                    {
                    kw=(Token)match(input,27,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCodeWallAccess().getRightParenthesisKeyword_7());
                    		

                    }
                    break;
                case 9 :
                    // InternalLpp.g:1161:3: kw= '*'
                    {
                    kw=(Token)match(input,28,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCodeWallAccess().getAsteriskKeyword_8());
                    		

                    }
                    break;
                case 10 :
                    // InternalLpp.g:1167:3: kw= '.'
                    {
                    kw=(Token)match(input,29,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCodeWallAccess().getFullStopKeyword_9());
                    		

                    }
                    break;
                case 11 :
                    // InternalLpp.g:1173:3: kw= '/'
                    {
                    kw=(Token)match(input,30,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCodeWallAccess().getSolidusKeyword_10());
                    		

                    }
                    break;
                case 12 :
                    // InternalLpp.g:1179:3: kw= '\\\\'
                    {
                    kw=(Token)match(input,31,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCodeWallAccess().getReverseSolidusKeyword_11());
                    		

                    }
                    break;
                case 13 :
                    // InternalLpp.g:1185:3: kw= '|'
                    {
                    kw=(Token)match(input,32,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCodeWallAccess().getVerticalLineKeyword_12());
                    		

                    }
                    break;
                case 14 :
                    // InternalLpp.g:1191:3: kw= '?'
                    {
                    kw=(Token)match(input,33,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCodeWallAccess().getQuestionMarkKeyword_13());
                    		

                    }
                    break;
                case 15 :
                    // InternalLpp.g:1197:3: kw= '>'
                    {
                    kw=(Token)match(input,34,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCodeWallAccess().getGreaterThanSignKeyword_14());
                    		

                    }
                    break;
                case 16 :
                    // InternalLpp.g:1203:3: kw= '<'
                    {
                    kw=(Token)match(input,35,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCodeWallAccess().getLessThanSignKeyword_15());
                    		

                    }
                    break;
                case 17 :
                    // InternalLpp.g:1209:3: kw= '#'
                    {
                    kw=(Token)match(input,36,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCodeWallAccess().getNumberSignKeyword_16());
                    		

                    }
                    break;
                case 18 :
                    // InternalLpp.g:1215:3: kw= '$'
                    {
                    kw=(Token)match(input,37,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCodeWallAccess().getDollarSignKeyword_17());
                    		

                    }
                    break;
                case 19 :
                    // InternalLpp.g:1221:3: kw= '%'
                    {
                    kw=(Token)match(input,38,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCodeWallAccess().getPercentSignKeyword_18());
                    		

                    }
                    break;
                case 20 :
                    // InternalLpp.g:1227:3: kw= ';'
                    {
                    kw=(Token)match(input,39,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCodeWallAccess().getSemicolonKeyword_19());
                    		

                    }
                    break;
                case 21 :
                    // InternalLpp.g:1233:3: kw= ':'
                    {
                    kw=(Token)match(input,40,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCodeWallAccess().getColonKeyword_20());
                    		

                    }
                    break;
                case 22 :
                    // InternalLpp.g:1239:3: kw= '!'
                    {
                    kw=(Token)match(input,41,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCodeWallAccess().getExclamationMarkKeyword_21());
                    		

                    }
                    break;
                case 23 :
                    // InternalLpp.g:1245:3: kw= '='
                    {
                    kw=(Token)match(input,22,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCodeWallAccess().getEqualsSignKeyword_22());
                    		

                    }
                    break;
                case 24 :
                    // InternalLpp.g:1251:3: kw= ','
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
    // InternalLpp.g:1260:1: entryRulePrecedence returns [EObject current=null] : iv_rulePrecedence= rulePrecedence EOF ;
    public final EObject entryRulePrecedence() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrecedence = null;


        try {
            // InternalLpp.g:1260:51: (iv_rulePrecedence= rulePrecedence EOF )
            // InternalLpp.g:1261:2: iv_rulePrecedence= rulePrecedence EOF
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
    // InternalLpp.g:1267:1: rulePrecedence returns [EObject current=null] : (otherlv_0= 'PREC' ( (lv_rows_1_0= rulePrecedenceRow ) )* ) ;
    public final EObject rulePrecedence() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_rows_1_0 = null;



        	enterRule();

        try {
            // InternalLpp.g:1273:2: ( (otherlv_0= 'PREC' ( (lv_rows_1_0= rulePrecedenceRow ) )* ) )
            // InternalLpp.g:1274:2: (otherlv_0= 'PREC' ( (lv_rows_1_0= rulePrecedenceRow ) )* )
            {
            // InternalLpp.g:1274:2: (otherlv_0= 'PREC' ( (lv_rows_1_0= rulePrecedenceRow ) )* )
            // InternalLpp.g:1275:3: otherlv_0= 'PREC' ( (lv_rows_1_0= rulePrecedenceRow ) )*
            {
            otherlv_0=(Token)match(input,42,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getPrecedenceAccess().getPRECKeyword_0());
            		
            // InternalLpp.g:1279:3: ( (lv_rows_1_0= rulePrecedenceRow ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=50 && LA10_0<=52)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalLpp.g:1280:4: (lv_rows_1_0= rulePrecedenceRow )
            	    {
            	    // InternalLpp.g:1280:4: (lv_rows_1_0= rulePrecedenceRow )
            	    // InternalLpp.g:1281:5: lv_rows_1_0= rulePrecedenceRow
            	    {

            	    					newCompositeNode(grammarAccess.getPrecedenceAccess().getRowsPrecedenceRowParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_15);
            	    lv_rows_1_0=rulePrecedenceRow();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPrecedenceRule());
            	    					}
            	    					add(
            	    						current,
            	    						"rows",
            	    						lv_rows_1_0,
            	    						"de.roma.cocktail.xtext.Lpp.PrecedenceRow");
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
    // InternalLpp.g:1302:1: entryRulePrecedenceRow returns [EObject current=null] : iv_rulePrecedenceRow= rulePrecedenceRow EOF ;
    public final EObject entryRulePrecedenceRow() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrecedenceRow = null;


        try {
            // InternalLpp.g:1302:54: (iv_rulePrecedenceRow= rulePrecedenceRow EOF )
            // InternalLpp.g:1303:2: iv_rulePrecedenceRow= rulePrecedenceRow EOF
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
    // InternalLpp.g:1309:1: rulePrecedenceRow returns [EObject current=null] : ( ( (lv_type_0_0= rulePrecedenceType ) ) ( (otherlv_1= RULE_ID ) )* ) ;
    public final EObject rulePrecedenceRow() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Enumerator lv_type_0_0 = null;



        	enterRule();

        try {
            // InternalLpp.g:1315:2: ( ( ( (lv_type_0_0= rulePrecedenceType ) ) ( (otherlv_1= RULE_ID ) )* ) )
            // InternalLpp.g:1316:2: ( ( (lv_type_0_0= rulePrecedenceType ) ) ( (otherlv_1= RULE_ID ) )* )
            {
            // InternalLpp.g:1316:2: ( ( (lv_type_0_0= rulePrecedenceType ) ) ( (otherlv_1= RULE_ID ) )* )
            // InternalLpp.g:1317:3: ( (lv_type_0_0= rulePrecedenceType ) ) ( (otherlv_1= RULE_ID ) )*
            {
            // InternalLpp.g:1317:3: ( (lv_type_0_0= rulePrecedenceType ) )
            // InternalLpp.g:1318:4: (lv_type_0_0= rulePrecedenceType )
            {
            // InternalLpp.g:1318:4: (lv_type_0_0= rulePrecedenceType )
            // InternalLpp.g:1319:5: lv_type_0_0= rulePrecedenceType
            {

            					newCompositeNode(grammarAccess.getPrecedenceRowAccess().getTypePrecedenceTypeEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_4);
            lv_type_0_0=rulePrecedenceType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPrecedenceRowRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_0_0,
            						"de.roma.cocktail.xtext.Lpp.PrecedenceType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalLpp.g:1336:3: ( (otherlv_1= RULE_ID ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalLpp.g:1337:4: (otherlv_1= RULE_ID )
            	    {
            	    // InternalLpp.g:1337:4: (otherlv_1= RULE_ID )
            	    // InternalLpp.g:1338:5: otherlv_1= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getPrecedenceRowRule());
            	    					}
            	    				
            	    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_4); 

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
    // InternalLpp.g:1353:1: entryRuleStartSymbols returns [EObject current=null] : iv_ruleStartSymbols= ruleStartSymbols EOF ;
    public final EObject entryRuleStartSymbols() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStartSymbols = null;


        try {
            // InternalLpp.g:1353:53: (iv_ruleStartSymbols= ruleStartSymbols EOF )
            // InternalLpp.g:1354:2: iv_ruleStartSymbols= ruleStartSymbols EOF
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
    // InternalLpp.g:1360:1: ruleStartSymbols returns [EObject current=null] : (otherlv_0= 'START' ( (lv_states_1_0= ruleStartState ) )* ) ;
    public final EObject ruleStartSymbols() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_states_1_0 = null;



        	enterRule();

        try {
            // InternalLpp.g:1366:2: ( (otherlv_0= 'START' ( (lv_states_1_0= ruleStartState ) )* ) )
            // InternalLpp.g:1367:2: (otherlv_0= 'START' ( (lv_states_1_0= ruleStartState ) )* )
            {
            // InternalLpp.g:1367:2: (otherlv_0= 'START' ( (lv_states_1_0= ruleStartState ) )* )
            // InternalLpp.g:1368:3: otherlv_0= 'START' ( (lv_states_1_0= ruleStartState ) )*
            {
            otherlv_0=(Token)match(input,43,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getStartSymbolsAccess().getSTARTKeyword_0());
            		
            // InternalLpp.g:1372:3: ( (lv_states_1_0= ruleStartState ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalLpp.g:1373:4: (lv_states_1_0= ruleStartState )
            	    {
            	    // InternalLpp.g:1373:4: (lv_states_1_0= ruleStartState )
            	    // InternalLpp.g:1374:5: lv_states_1_0= ruleStartState
            	    {

            	    					newCompositeNode(grammarAccess.getStartSymbolsAccess().getStatesStartStateParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_states_1_0=ruleStartState();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getStartSymbolsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"states",
            	    						lv_states_1_0,
            	    						"de.roma.cocktail.xtext.Lpp.StartState");
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
    // InternalLpp.g:1395:1: entryRuleStartState returns [EObject current=null] : iv_ruleStartState= ruleStartState EOF ;
    public final EObject entryRuleStartState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStartState = null;


        try {
            // InternalLpp.g:1395:51: (iv_ruleStartState= ruleStartState EOF )
            // InternalLpp.g:1396:2: iv_ruleStartState= ruleStartState EOF
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
    // InternalLpp.g:1402:1: ruleStartState returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleStartState() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalLpp.g:1408:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalLpp.g:1409:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalLpp.g:1409:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalLpp.g:1410:3: (lv_name_0_0= RULE_ID )
            {
            // InternalLpp.g:1410:3: (lv_name_0_0= RULE_ID )
            // InternalLpp.g:1411:4: lv_name_0_0= RULE_ID
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


    // $ANTLR start "entryRuleGrammarRules"
    // InternalLpp.g:1430:1: entryRuleGrammarRules returns [EObject current=null] : iv_ruleGrammarRules= ruleGrammarRules EOF ;
    public final EObject entryRuleGrammarRules() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGrammarRules = null;


        try {
            // InternalLpp.g:1430:53: (iv_ruleGrammarRules= ruleGrammarRules EOF )
            // InternalLpp.g:1431:2: iv_ruleGrammarRules= ruleGrammarRules EOF
            {
             newCompositeNode(grammarAccess.getGrammarRulesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGrammarRules=ruleGrammarRules();

            state._fsp--;

             current =iv_ruleGrammarRules; 
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
    // $ANTLR end "entryRuleGrammarRules"


    // $ANTLR start "ruleGrammarRules"
    // InternalLpp.g:1437:1: ruleGrammarRules returns [EObject current=null] : ( (otherlv_0= 'RULE' | otherlv_1= 'RULES' ) ( (lv_rules_2_0= ruleGrammarRule ) )* ) ;
    public final EObject ruleGrammarRules() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_rules_2_0 = null;



        	enterRule();

        try {
            // InternalLpp.g:1443:2: ( ( (otherlv_0= 'RULE' | otherlv_1= 'RULES' ) ( (lv_rules_2_0= ruleGrammarRule ) )* ) )
            // InternalLpp.g:1444:2: ( (otherlv_0= 'RULE' | otherlv_1= 'RULES' ) ( (lv_rules_2_0= ruleGrammarRule ) )* )
            {
            // InternalLpp.g:1444:2: ( (otherlv_0= 'RULE' | otherlv_1= 'RULES' ) ( (lv_rules_2_0= ruleGrammarRule ) )* )
            // InternalLpp.g:1445:3: (otherlv_0= 'RULE' | otherlv_1= 'RULES' ) ( (lv_rules_2_0= ruleGrammarRule ) )*
            {
            // InternalLpp.g:1445:3: (otherlv_0= 'RULE' | otherlv_1= 'RULES' )
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
                    // InternalLpp.g:1446:4: otherlv_0= 'RULE'
                    {
                    otherlv_0=(Token)match(input,44,FOLLOW_4); 

                    				newLeafNode(otherlv_0, grammarAccess.getGrammarRulesAccess().getRULEKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalLpp.g:1451:4: otherlv_1= 'RULES'
                    {
                    otherlv_1=(Token)match(input,45,FOLLOW_4); 

                    				newLeafNode(otherlv_1, grammarAccess.getGrammarRulesAccess().getRULESKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalLpp.g:1456:3: ( (lv_rules_2_0= ruleGrammarRule ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalLpp.g:1457:4: (lv_rules_2_0= ruleGrammarRule )
            	    {
            	    // InternalLpp.g:1457:4: (lv_rules_2_0= ruleGrammarRule )
            	    // InternalLpp.g:1458:5: lv_rules_2_0= ruleGrammarRule
            	    {

            	    					newCompositeNode(grammarAccess.getGrammarRulesAccess().getRulesGrammarRuleParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_rules_2_0=ruleGrammarRule();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getGrammarRulesRule());
            	    					}
            	    					add(
            	    						current,
            	    						"rules",
            	    						lv_rules_2_0,
            	    						"de.roma.cocktail.xtext.Lpp.GrammarRule");
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
    // $ANTLR end "ruleGrammarRules"


    // $ANTLR start "entryRuleGrammarRule"
    // InternalLpp.g:1479:1: entryRuleGrammarRule returns [EObject current=null] : iv_ruleGrammarRule= ruleGrammarRule EOF ;
    public final EObject entryRuleGrammarRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGrammarRule = null;


        try {
            // InternalLpp.g:1479:52: (iv_ruleGrammarRule= ruleGrammarRule EOF )
            // InternalLpp.g:1480:2: iv_ruleGrammarRule= ruleGrammarRule EOF
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
    // InternalLpp.g:1486:1: ruleGrammarRule returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '= <' ( (lv_rules_2_0= ruleSimpleRule ) )* otherlv_3= '>.' ) ;
    public final EObject ruleGrammarRule() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_rules_2_0 = null;



        	enterRule();

        try {
            // InternalLpp.g:1492:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '= <' ( (lv_rules_2_0= ruleSimpleRule ) )* otherlv_3= '>.' ) )
            // InternalLpp.g:1493:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '= <' ( (lv_rules_2_0= ruleSimpleRule ) )* otherlv_3= '>.' )
            {
            // InternalLpp.g:1493:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '= <' ( (lv_rules_2_0= ruleSimpleRule ) )* otherlv_3= '>.' )
            // InternalLpp.g:1494:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '= <' ( (lv_rules_2_0= ruleSimpleRule ) )* otherlv_3= '>.'
            {
            // InternalLpp.g:1494:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalLpp.g:1495:4: (lv_name_0_0= RULE_ID )
            {
            // InternalLpp.g:1495:4: (lv_name_0_0= RULE_ID )
            // InternalLpp.g:1496:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_16); 

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

            otherlv_1=(Token)match(input,46,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getGrammarRuleAccess().getEqualsSignSpaceLessThanSignKeyword_1());
            		
            // InternalLpp.g:1516:3: ( (lv_rules_2_0= ruleSimpleRule ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID||LA15_0==22) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalLpp.g:1517:4: (lv_rules_2_0= ruleSimpleRule )
            	    {
            	    // InternalLpp.g:1517:4: (lv_rules_2_0= ruleSimpleRule )
            	    // InternalLpp.g:1518:5: lv_rules_2_0= ruleSimpleRule
            	    {

            	    					newCompositeNode(grammarAccess.getGrammarRuleAccess().getRulesSimpleRuleParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_17);
            	    lv_rules_2_0=ruleSimpleRule();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getGrammarRuleRule());
            	    					}
            	    					add(
            	    						current,
            	    						"rules",
            	    						lv_rules_2_0,
            	    						"de.roma.cocktail.xtext.Lpp.SimpleRule");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            otherlv_3=(Token)match(input,47,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getGrammarRuleAccess().getGreaterThanSignFullStopKeyword_3());
            		

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


    // $ANTLR start "entryRuleSimpleRule"
    // InternalLpp.g:1543:1: entryRuleSimpleRule returns [EObject current=null] : iv_ruleSimpleRule= ruleSimpleRule EOF ;
    public final EObject entryRuleSimpleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleRule = null;


        try {
            // InternalLpp.g:1543:51: (iv_ruleSimpleRule= ruleSimpleRule EOF )
            // InternalLpp.g:1544:2: iv_ruleSimpleRule= ruleSimpleRule EOF
            {
             newCompositeNode(grammarAccess.getSimpleRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSimpleRule=ruleSimpleRule();

            state._fsp--;

             current =iv_ruleSimpleRule; 
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
    // $ANTLR end "entryRuleSimpleRule"


    // $ANTLR start "ruleSimpleRule"
    // InternalLpp.g:1550:1: ruleSimpleRule returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) )? otherlv_1= '=' ( (lv_body_2_0= ruleRuleBody ) ) (otherlv_3= '<' ( (lv_rules_4_0= ruleSimpleRule ) )* otherlv_5= '>.' )? ) ;
    public final EObject ruleSimpleRule() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_body_2_0 = null;

        EObject lv_rules_4_0 = null;



        	enterRule();

        try {
            // InternalLpp.g:1556:2: ( ( ( (lv_name_0_0= RULE_ID ) )? otherlv_1= '=' ( (lv_body_2_0= ruleRuleBody ) ) (otherlv_3= '<' ( (lv_rules_4_0= ruleSimpleRule ) )* otherlv_5= '>.' )? ) )
            // InternalLpp.g:1557:2: ( ( (lv_name_0_0= RULE_ID ) )? otherlv_1= '=' ( (lv_body_2_0= ruleRuleBody ) ) (otherlv_3= '<' ( (lv_rules_4_0= ruleSimpleRule ) )* otherlv_5= '>.' )? )
            {
            // InternalLpp.g:1557:2: ( ( (lv_name_0_0= RULE_ID ) )? otherlv_1= '=' ( (lv_body_2_0= ruleRuleBody ) ) (otherlv_3= '<' ( (lv_rules_4_0= ruleSimpleRule ) )* otherlv_5= '>.' )? )
            // InternalLpp.g:1558:3: ( (lv_name_0_0= RULE_ID ) )? otherlv_1= '=' ( (lv_body_2_0= ruleRuleBody ) ) (otherlv_3= '<' ( (lv_rules_4_0= ruleSimpleRule ) )* otherlv_5= '>.' )?
            {
            // InternalLpp.g:1558:3: ( (lv_name_0_0= RULE_ID ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_ID) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalLpp.g:1559:4: (lv_name_0_0= RULE_ID )
                    {
                    // InternalLpp.g:1559:4: (lv_name_0_0= RULE_ID )
                    // InternalLpp.g:1560:5: lv_name_0_0= RULE_ID
                    {
                    lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_9); 

                    					newLeafNode(lv_name_0_0, grammarAccess.getSimpleRuleAccess().getNameIDTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSimpleRuleRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_0_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,22,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getSimpleRuleAccess().getEqualsSignKeyword_1());
            		
            // InternalLpp.g:1580:3: ( (lv_body_2_0= ruleRuleBody ) )
            // InternalLpp.g:1581:4: (lv_body_2_0= ruleRuleBody )
            {
            // InternalLpp.g:1581:4: (lv_body_2_0= ruleRuleBody )
            // InternalLpp.g:1582:5: lv_body_2_0= ruleRuleBody
            {

            					newCompositeNode(grammarAccess.getSimpleRuleAccess().getBodyRuleBodyParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_19);
            lv_body_2_0=ruleRuleBody();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSimpleRuleRule());
            					}
            					set(
            						current,
            						"body",
            						lv_body_2_0,
            						"de.roma.cocktail.xtext.Lpp.RuleBody");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalLpp.g:1599:3: (otherlv_3= '<' ( (lv_rules_4_0= ruleSimpleRule ) )* otherlv_5= '>.' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==35) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalLpp.g:1600:4: otherlv_3= '<' ( (lv_rules_4_0= ruleSimpleRule ) )* otherlv_5= '>.'
                    {
                    otherlv_3=(Token)match(input,35,FOLLOW_17); 

                    				newLeafNode(otherlv_3, grammarAccess.getSimpleRuleAccess().getLessThanSignKeyword_3_0());
                    			
                    // InternalLpp.g:1604:4: ( (lv_rules_4_0= ruleSimpleRule ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==RULE_ID||LA17_0==22) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // InternalLpp.g:1605:5: (lv_rules_4_0= ruleSimpleRule )
                    	    {
                    	    // InternalLpp.g:1605:5: (lv_rules_4_0= ruleSimpleRule )
                    	    // InternalLpp.g:1606:6: lv_rules_4_0= ruleSimpleRule
                    	    {

                    	    						newCompositeNode(grammarAccess.getSimpleRuleAccess().getRulesSimpleRuleParserRuleCall_3_1_0());
                    	    					
                    	    pushFollow(FOLLOW_17);
                    	    lv_rules_4_0=ruleSimpleRule();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getSimpleRuleRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"rules",
                    	    							lv_rules_4_0,
                    	    							"de.roma.cocktail.xtext.Lpp.SimpleRule");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,47,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getSimpleRuleAccess().getGreaterThanSignFullStopKeyword_3_2());
                    			

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
    // $ANTLR end "ruleSimpleRule"


    // $ANTLR start "entryRuleRuleBody"
    // InternalLpp.g:1632:1: entryRuleRuleBody returns [EObject current=null] : iv_ruleRuleBody= ruleRuleBody EOF ;
    public final EObject entryRuleRuleBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRuleBody = null;


        try {
            // InternalLpp.g:1632:49: (iv_ruleRuleBody= ruleRuleBody EOF )
            // InternalLpp.g:1633:2: iv_ruleRuleBody= ruleRuleBody EOF
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
    // InternalLpp.g:1639:1: ruleRuleBody returns [EObject current=null] : ( ( (lv_part_0_0= ruleRulePart ) ) ( (lv_code_1_0= ruleRuleCode ) ) ) ;
    public final EObject ruleRuleBody() throws RecognitionException {
        EObject current = null;

        EObject lv_part_0_0 = null;

        AntlrDatatypeRuleToken lv_code_1_0 = null;



        	enterRule();

        try {
            // InternalLpp.g:1645:2: ( ( ( (lv_part_0_0= ruleRulePart ) ) ( (lv_code_1_0= ruleRuleCode ) ) ) )
            // InternalLpp.g:1646:2: ( ( (lv_part_0_0= ruleRulePart ) ) ( (lv_code_1_0= ruleRuleCode ) ) )
            {
            // InternalLpp.g:1646:2: ( ( (lv_part_0_0= ruleRulePart ) ) ( (lv_code_1_0= ruleRuleCode ) ) )
            // InternalLpp.g:1647:3: ( (lv_part_0_0= ruleRulePart ) ) ( (lv_code_1_0= ruleRuleCode ) )
            {
            // InternalLpp.g:1647:3: ( (lv_part_0_0= ruleRulePart ) )
            // InternalLpp.g:1648:4: (lv_part_0_0= ruleRulePart )
            {
            // InternalLpp.g:1648:4: (lv_part_0_0= ruleRulePart )
            // InternalLpp.g:1649:5: lv_part_0_0= ruleRulePart
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
            						"de.roma.cocktail.xtext.Lpp.RulePart");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalLpp.g:1666:3: ( (lv_code_1_0= ruleRuleCode ) )
            // InternalLpp.g:1667:4: (lv_code_1_0= ruleRuleCode )
            {
            // InternalLpp.g:1667:4: (lv_code_1_0= ruleRuleCode )
            // InternalLpp.g:1668:5: lv_code_1_0= ruleRuleCode
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
            						"de.roma.cocktail.xtext.Lpp.RuleCode");
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
    // InternalLpp.g:1689:1: entryRuleRuleCode returns [String current=null] : iv_ruleRuleCode= ruleRuleCode EOF ;
    public final String entryRuleRuleCode() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRuleCode = null;


        try {
            // InternalLpp.g:1689:48: (iv_ruleRuleCode= ruleRuleCode EOF )
            // InternalLpp.g:1690:2: iv_ruleRuleCode= ruleRuleCode EOF
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
    // InternalLpp.g:1696:1: ruleRuleCode returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( ( ( ({...}? => ( ({...}? => (kw= '{' this_CodeBlock_2= ruleCodeBlock kw= '}' ) ) ) ) | ({...}? => ( ({...}? => (kw= '[' this_CodeBlock_5= ruleCodeBlock kw= ']' ) ) ) ) )* ) ) ) ;
    public final AntlrDatatypeRuleToken ruleRuleCode() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_CodeBlock_2 = null;

        AntlrDatatypeRuleToken this_CodeBlock_5 = null;



        	enterRule();

        try {
            // InternalLpp.g:1702:2: ( ( ( ( ( ({...}? => ( ({...}? => (kw= '{' this_CodeBlock_2= ruleCodeBlock kw= '}' ) ) ) ) | ({...}? => ( ({...}? => (kw= '[' this_CodeBlock_5= ruleCodeBlock kw= ']' ) ) ) ) )* ) ) ) )
            // InternalLpp.g:1703:2: ( ( ( ( ({...}? => ( ({...}? => (kw= '{' this_CodeBlock_2= ruleCodeBlock kw= '}' ) ) ) ) | ({...}? => ( ({...}? => (kw= '[' this_CodeBlock_5= ruleCodeBlock kw= ']' ) ) ) ) )* ) ) )
            {
            // InternalLpp.g:1703:2: ( ( ( ( ({...}? => ( ({...}? => (kw= '{' this_CodeBlock_2= ruleCodeBlock kw= '}' ) ) ) ) | ({...}? => ( ({...}? => (kw= '[' this_CodeBlock_5= ruleCodeBlock kw= ']' ) ) ) ) )* ) ) )
            // InternalLpp.g:1704:3: ( ( ( ({...}? => ( ({...}? => (kw= '{' this_CodeBlock_2= ruleCodeBlock kw= '}' ) ) ) ) | ({...}? => ( ({...}? => (kw= '[' this_CodeBlock_5= ruleCodeBlock kw= ']' ) ) ) ) )* ) )
            {
            // InternalLpp.g:1704:3: ( ( ( ({...}? => ( ({...}? => (kw= '{' this_CodeBlock_2= ruleCodeBlock kw= '}' ) ) ) ) | ({...}? => ( ({...}? => (kw= '[' this_CodeBlock_5= ruleCodeBlock kw= ']' ) ) ) ) )* ) )
            // InternalLpp.g:1705:4: ( ( ({...}? => ( ({...}? => (kw= '{' this_CodeBlock_2= ruleCodeBlock kw= '}' ) ) ) ) | ({...}? => ( ({...}? => (kw= '[' this_CodeBlock_5= ruleCodeBlock kw= ']' ) ) ) ) )* )
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getRuleCodeAccess().getUnorderedGroup());
            			
            // InternalLpp.g:1708:4: ( ( ({...}? => ( ({...}? => (kw= '{' this_CodeBlock_2= ruleCodeBlock kw= '}' ) ) ) ) | ({...}? => ( ({...}? => (kw= '[' this_CodeBlock_5= ruleCodeBlock kw= ']' ) ) ) ) )* )
            // InternalLpp.g:1709:5: ( ({...}? => ( ({...}? => (kw= '{' this_CodeBlock_2= ruleCodeBlock kw= '}' ) ) ) ) | ({...}? => ( ({...}? => (kw= '[' this_CodeBlock_5= ruleCodeBlock kw= ']' ) ) ) ) )*
            {
            // InternalLpp.g:1709:5: ( ({...}? => ( ({...}? => (kw= '{' this_CodeBlock_2= ruleCodeBlock kw= '}' ) ) ) ) | ({...}? => ( ({...}? => (kw= '[' this_CodeBlock_5= ruleCodeBlock kw= ']' ) ) ) ) )*
            loop19:
            do {
                int alt19=3;
                int LA19_0 = input.LA(1);

                if ( LA19_0 == 14 && getUnorderedGroupHelper().canSelect(grammarAccess.getRuleCodeAccess().getUnorderedGroup(), 0) ) {
                    alt19=1;
                }
                else if ( LA19_0 == 48 && getUnorderedGroupHelper().canSelect(grammarAccess.getRuleCodeAccess().getUnorderedGroup(), 1) ) {
                    alt19=2;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalLpp.g:1710:3: ({...}? => ( ({...}? => (kw= '{' this_CodeBlock_2= ruleCodeBlock kw= '}' ) ) ) )
            	    {
            	    // InternalLpp.g:1710:3: ({...}? => ( ({...}? => (kw= '{' this_CodeBlock_2= ruleCodeBlock kw= '}' ) ) ) )
            	    // InternalLpp.g:1711:4: {...}? => ( ({...}? => (kw= '{' this_CodeBlock_2= ruleCodeBlock kw= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRuleCodeAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleRuleCode", "getUnorderedGroupHelper().canSelect(grammarAccess.getRuleCodeAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalLpp.g:1711:102: ( ({...}? => (kw= '{' this_CodeBlock_2= ruleCodeBlock kw= '}' ) ) )
            	    // InternalLpp.g:1712:5: ({...}? => (kw= '{' this_CodeBlock_2= ruleCodeBlock kw= '}' ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getRuleCodeAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalLpp.g:1715:8: ({...}? => (kw= '{' this_CodeBlock_2= ruleCodeBlock kw= '}' ) )
            	    // InternalLpp.g:1715:9: {...}? => (kw= '{' this_CodeBlock_2= ruleCodeBlock kw= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleRuleCode", "true");
            	    }
            	    // InternalLpp.g:1715:18: (kw= '{' this_CodeBlock_2= ruleCodeBlock kw= '}' )
            	    // InternalLpp.g:1715:19: kw= '{' this_CodeBlock_2= ruleCodeBlock kw= '}'
            	    {
            	    kw=(Token)match(input,14,FOLLOW_6); 

            	    								current.merge(kw);
            	    								newLeafNode(kw, grammarAccess.getRuleCodeAccess().getLeftCurlyBracketKeyword_0_0());
            	    							

            	    								newCompositeNode(grammarAccess.getRuleCodeAccess().getCodeBlockParserRuleCall_0_1());
            	    							
            	    pushFollow(FOLLOW_7);
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
            	    // InternalLpp.g:1741:3: ({...}? => ( ({...}? => (kw= '[' this_CodeBlock_5= ruleCodeBlock kw= ']' ) ) ) )
            	    {
            	    // InternalLpp.g:1741:3: ({...}? => ( ({...}? => (kw= '[' this_CodeBlock_5= ruleCodeBlock kw= ']' ) ) ) )
            	    // InternalLpp.g:1742:4: {...}? => ( ({...}? => (kw= '[' this_CodeBlock_5= ruleCodeBlock kw= ']' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRuleCodeAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleRuleCode", "getUnorderedGroupHelper().canSelect(grammarAccess.getRuleCodeAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalLpp.g:1742:102: ( ({...}? => (kw= '[' this_CodeBlock_5= ruleCodeBlock kw= ']' ) ) )
            	    // InternalLpp.g:1743:5: ({...}? => (kw= '[' this_CodeBlock_5= ruleCodeBlock kw= ']' ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getRuleCodeAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalLpp.g:1746:8: ({...}? => (kw= '[' this_CodeBlock_5= ruleCodeBlock kw= ']' ) )
            	    // InternalLpp.g:1746:9: {...}? => (kw= '[' this_CodeBlock_5= ruleCodeBlock kw= ']' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleRuleCode", "true");
            	    }
            	    // InternalLpp.g:1746:18: (kw= '[' this_CodeBlock_5= ruleCodeBlock kw= ']' )
            	    // InternalLpp.g:1746:19: kw= '[' this_CodeBlock_5= ruleCodeBlock kw= ']'
            	    {
            	    kw=(Token)match(input,48,FOLLOW_22); 

            	    								current.merge(kw);
            	    								newLeafNode(kw, grammarAccess.getRuleCodeAccess().getLeftSquareBracketKeyword_1_0());
            	    							

            	    								newCompositeNode(grammarAccess.getRuleCodeAccess().getCodeBlockParserRuleCall_1_1());
            	    							
            	    pushFollow(FOLLOW_23);
            	    this_CodeBlock_5=ruleCodeBlock();

            	    state._fsp--;


            	    								current.merge(this_CodeBlock_5);
            	    							

            	    								afterParserOrEnumRuleCall();
            	    							
            	    kw=(Token)match(input,49,FOLLOW_21); 

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
            	    break loop19;
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


    // $ANTLR start "entryRuleRuleContent"
    // InternalLpp.g:1782:1: entryRuleRuleContent returns [EObject current=null] : iv_ruleRuleContent= ruleRuleContent EOF ;
    public final EObject entryRuleRuleContent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRuleContent = null;


        try {
            // InternalLpp.g:1782:52: (iv_ruleRuleContent= ruleRuleContent EOF )
            // InternalLpp.g:1783:2: iv_ruleRuleContent= ruleRuleContent EOF
            {
             newCompositeNode(grammarAccess.getRuleContentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRuleContent=ruleRuleContent();

            state._fsp--;

             current =iv_ruleRuleContent; 
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
    // $ANTLR end "entryRuleRuleContent"


    // $ANTLR start "ruleRuleContent"
    // InternalLpp.g:1789:1: ruleRuleContent returns [EObject current=null] : ( ( (lv_regex_0_0= RULE_STRING ) ) | ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleRuleContent() throws RecognitionException {
        EObject current = null;

        Token lv_regex_0_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalLpp.g:1795:2: ( ( ( (lv_regex_0_0= RULE_STRING ) ) | ( (otherlv_1= RULE_ID ) ) ) )
            // InternalLpp.g:1796:2: ( ( (lv_regex_0_0= RULE_STRING ) ) | ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalLpp.g:1796:2: ( ( (lv_regex_0_0= RULE_STRING ) ) | ( (otherlv_1= RULE_ID ) ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_STRING) ) {
                alt20=1;
            }
            else if ( (LA20_0==RULE_ID) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalLpp.g:1797:3: ( (lv_regex_0_0= RULE_STRING ) )
                    {
                    // InternalLpp.g:1797:3: ( (lv_regex_0_0= RULE_STRING ) )
                    // InternalLpp.g:1798:4: (lv_regex_0_0= RULE_STRING )
                    {
                    // InternalLpp.g:1798:4: (lv_regex_0_0= RULE_STRING )
                    // InternalLpp.g:1799:5: lv_regex_0_0= RULE_STRING
                    {
                    lv_regex_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    					newLeafNode(lv_regex_0_0, grammarAccess.getRuleContentAccess().getRegexSTRINGTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getRuleContentRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"regex",
                    						lv_regex_0_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalLpp.g:1816:3: ( (otherlv_1= RULE_ID ) )
                    {
                    // InternalLpp.g:1816:3: ( (otherlv_1= RULE_ID ) )
                    // InternalLpp.g:1817:4: (otherlv_1= RULE_ID )
                    {
                    // InternalLpp.g:1817:4: (otherlv_1= RULE_ID )
                    // InternalLpp.g:1818:5: otherlv_1= RULE_ID
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getRuleContentRule());
                    					}
                    				
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(otherlv_1, grammarAccess.getRuleContentAccess().getRefGrammerReferenceCrossReference_1_0());
                    				

                    }


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
    // $ANTLR end "ruleRuleContent"


    // $ANTLR start "entryRuleRulePart"
    // InternalLpp.g:1833:1: entryRuleRulePart returns [EObject current=null] : iv_ruleRulePart= ruleRulePart EOF ;
    public final EObject entryRuleRulePart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRulePart = null;


        try {
            // InternalLpp.g:1833:49: (iv_ruleRulePart= ruleRulePart EOF )
            // InternalLpp.g:1834:2: iv_ruleRulePart= ruleRulePart EOF
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
    // InternalLpp.g:1840:1: ruleRulePart returns [EObject current=null] : ( (lv_content_0_0= ruleRuleContent ) )* ;
    public final EObject ruleRulePart() throws RecognitionException {
        EObject current = null;

        EObject lv_content_0_0 = null;



        	enterRule();

        try {
            // InternalLpp.g:1846:2: ( ( (lv_content_0_0= ruleRuleContent ) )* )
            // InternalLpp.g:1847:2: ( (lv_content_0_0= ruleRuleContent ) )*
            {
            // InternalLpp.g:1847:2: ( (lv_content_0_0= ruleRuleContent ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=RULE_ID && LA21_0<=RULE_STRING)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalLpp.g:1848:3: (lv_content_0_0= ruleRuleContent )
            	    {
            	    // InternalLpp.g:1848:3: (lv_content_0_0= ruleRuleContent )
            	    // InternalLpp.g:1849:4: lv_content_0_0= ruleRuleContent
            	    {

            	    				newCompositeNode(grammarAccess.getRulePartAccess().getContentRuleContentParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_24);
            	    lv_content_0_0=ruleRuleContent();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getRulePartRule());
            	    				}
            	    				add(
            	    					current,
            	    					"content",
            	    					lv_content_0_0,
            	    					"de.roma.cocktail.xtext.Lpp.RuleContent");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // InternalLpp.g:1869:1: rulePrecedenceType returns [Enumerator current=null] : ( (enumLiteral_0= 'NONE' ) | (enumLiteral_1= 'LEFT' ) | (enumLiteral_2= 'RIGHT' ) ) ;
    public final Enumerator rulePrecedenceType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalLpp.g:1875:2: ( ( (enumLiteral_0= 'NONE' ) | (enumLiteral_1= 'LEFT' ) | (enumLiteral_2= 'RIGHT' ) ) )
            // InternalLpp.g:1876:2: ( (enumLiteral_0= 'NONE' ) | (enumLiteral_1= 'LEFT' ) | (enumLiteral_2= 'RIGHT' ) )
            {
            // InternalLpp.g:1876:2: ( (enumLiteral_0= 'NONE' ) | (enumLiteral_1= 'LEFT' ) | (enumLiteral_2= 'RIGHT' ) )
            int alt22=3;
            switch ( input.LA(1) ) {
            case 50:
                {
                alt22=1;
                }
                break;
            case 51:
                {
                alt22=2;
                }
                break;
            case 52:
                {
                alt22=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // InternalLpp.g:1877:3: (enumLiteral_0= 'NONE' )
                    {
                    // InternalLpp.g:1877:3: (enumLiteral_0= 'NONE' )
                    // InternalLpp.g:1878:4: enumLiteral_0= 'NONE'
                    {
                    enumLiteral_0=(Token)match(input,50,FOLLOW_2); 

                    				current = grammarAccess.getPrecedenceTypeAccess().getNONEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getPrecedenceTypeAccess().getNONEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalLpp.g:1885:3: (enumLiteral_1= 'LEFT' )
                    {
                    // InternalLpp.g:1885:3: (enumLiteral_1= 'LEFT' )
                    // InternalLpp.g:1886:4: enumLiteral_1= 'LEFT'
                    {
                    enumLiteral_1=(Token)match(input,51,FOLLOW_2); 

                    				current = grammarAccess.getPrecedenceTypeAccess().getLEFTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getPrecedenceTypeAccess().getLEFTEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalLpp.g:1893:3: (enumLiteral_2= 'RIGHT' )
                    {
                    // InternalLpp.g:1893:3: (enumLiteral_2= 'RIGHT' )
                    // InternalLpp.g:1894:4: enumLiteral_2= 'RIGHT'
                    {
                    enumLiteral_2=(Token)match(input,52,FOLLOW_2); 

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
    static final String dfa_2s = "\1\13\14\uffff";
    static final String dfa_3s = "\1\55\14\uffff";
    static final String dfa_4s = "\1\uffff\1\14\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13";
    static final String dfa_5s = "\1\0\14\uffff}>";
    static final String[] dfa_6s = {
            "\1\2\1\3\1\4\2\uffff\1\5\1\6\1\7\1\10\1\11\1\12\24\uffff\1\13\1\14\2\1",
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
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "()* loopback of 86:6: ( ({...}? => ( ({...}? => ( (lv_scanner_1_0= ruleScannerName ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_parser_2_0= ruleParserName ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_importBlock_3_0= ruleImport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_exportBlock_4_0= ruleExport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_globalBlock_5_0= ruleGlobal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_localBlock_6_0= ruleLocal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_beginBlock_7_0= ruleBegin ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_closeBlock_8_0= ruleClose ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_tokens_9_0= ruleTokens ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_precedenc_10_0= rulePrecedence ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_start_11_0= ruleStartSymbols ) ) ) ) ) )*";
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
                        if ( ((LA1_0>=44 && LA1_0<=45)) ) {s = 1;}

                        else if ( LA1_0 == 11 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 0) ) {s = 2;}

                        else if ( LA1_0 == 12 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 1) ) {s = 3;}

                        else if ( LA1_0 == 13 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 2) ) {s = 4;}

                        else if ( LA1_0 == 16 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 3) ) {s = 5;}

                        else if ( LA1_0 == 17 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 4) ) {s = 6;}

                        else if ( LA1_0 == 18 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 5) ) {s = 7;}

                        else if ( LA1_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 6) ) {s = 8;}

                        else if ( LA1_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 7) ) {s = 9;}

                        else if ( LA1_0 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 8) ) {s = 10;}

                        else if ( LA1_0 == 42 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 9) ) {s = 11;}

                        else if ( LA1_0 == 43 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 10) ) {s = 12;}

                         
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00003C00003F3800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000003FFFFC0C0F0L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000000000F2L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x000003FFFFC040F2L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x001C000000000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000800000400010L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0001000000004030L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0001000000004000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0001000000004002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x000203FFFFC040F0L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000032L});

}
