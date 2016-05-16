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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_ANY_OTHER", "'SCANNER'", "'PARSER'", "'IMPORT'", "'{'", "'}'", "'EXPORT'", "'GLOBAL'", "'LOCAL'", "'BEGIN'", "'CLOSE'", "'+'", "'-'", "'('", "')'", "'*'", "'.'", "'/'", "'\\\\'", "'|'", "'?'", "'>'", "'<'", "'#'", "'$'", "'%'", "';'", "':'", "'!'", "'='", "','", "':='", "'PREC'", "'START'", "'RULE'", "'RULES'", "'['", "']'", "'NONE'", "'LEFT'", "'RIGHT'"
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
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=6;
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
        	return "Parser";
       	}

       	@Override
       	protected LppGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleParser"
    // InternalLpp.g:65:1: entryRuleParser returns [EObject current=null] : iv_ruleParser= ruleParser EOF ;
    public final EObject entryRuleParser() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParser = null;


        try {
            // InternalLpp.g:65:47: (iv_ruleParser= ruleParser EOF )
            // InternalLpp.g:66:2: iv_ruleParser= ruleParser EOF
            {
             newCompositeNode(grammarAccess.getParserRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParser=ruleParser();

            state._fsp--;

             current =iv_ruleParser; 
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
    // $ANTLR end "entryRuleParser"


    // $ANTLR start "ruleParser"
    // InternalLpp.g:72:1: ruleParser returns [EObject current=null] : ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_scanner_1_0= ruleScannerName ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_parser_2_0= ruleParserName ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_importBlock_3_0= ruleImport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_exportBlock_4_0= ruleExport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_globalBlock_5_0= ruleGlobal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_localBlock_6_0= ruleLocal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_beginBlock_7_0= ruleBegin ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_closeBlock_8_0= ruleClose ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_precedence_9_0= rulePrecedence ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_start_10_0= ruleStartSymbols ) ) ) ) ) )* ) ) ) ( (lv_rules_11_0= ruleGrammarRules ) ) ) ;
    public final EObject ruleParser() throws RecognitionException {
        EObject current = null;

        EObject lv_scanner_1_0 = null;

        EObject lv_parser_2_0 = null;

        EObject lv_importBlock_3_0 = null;

        EObject lv_exportBlock_4_0 = null;

        EObject lv_globalBlock_5_0 = null;

        EObject lv_localBlock_6_0 = null;

        EObject lv_beginBlock_7_0 = null;

        EObject lv_closeBlock_8_0 = null;

        EObject lv_precedence_9_0 = null;

        EObject lv_start_10_0 = null;

        EObject lv_rules_11_0 = null;



        	enterRule();

        try {
            // InternalLpp.g:78:2: ( ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_scanner_1_0= ruleScannerName ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_parser_2_0= ruleParserName ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_importBlock_3_0= ruleImport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_exportBlock_4_0= ruleExport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_globalBlock_5_0= ruleGlobal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_localBlock_6_0= ruleLocal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_beginBlock_7_0= ruleBegin ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_closeBlock_8_0= ruleClose ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_precedence_9_0= rulePrecedence ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_start_10_0= ruleStartSymbols ) ) ) ) ) )* ) ) ) ( (lv_rules_11_0= ruleGrammarRules ) ) ) )
            // InternalLpp.g:79:2: ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_scanner_1_0= ruleScannerName ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_parser_2_0= ruleParserName ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_importBlock_3_0= ruleImport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_exportBlock_4_0= ruleExport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_globalBlock_5_0= ruleGlobal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_localBlock_6_0= ruleLocal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_beginBlock_7_0= ruleBegin ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_closeBlock_8_0= ruleClose ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_precedence_9_0= rulePrecedence ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_start_10_0= ruleStartSymbols ) ) ) ) ) )* ) ) ) ( (lv_rules_11_0= ruleGrammarRules ) ) )
            {
            // InternalLpp.g:79:2: ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_scanner_1_0= ruleScannerName ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_parser_2_0= ruleParserName ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_importBlock_3_0= ruleImport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_exportBlock_4_0= ruleExport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_globalBlock_5_0= ruleGlobal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_localBlock_6_0= ruleLocal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_beginBlock_7_0= ruleBegin ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_closeBlock_8_0= ruleClose ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_precedence_9_0= rulePrecedence ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_start_10_0= ruleStartSymbols ) ) ) ) ) )* ) ) ) ( (lv_rules_11_0= ruleGrammarRules ) ) )
            // InternalLpp.g:80:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_scanner_1_0= ruleScannerName ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_parser_2_0= ruleParserName ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_importBlock_3_0= ruleImport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_exportBlock_4_0= ruleExport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_globalBlock_5_0= ruleGlobal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_localBlock_6_0= ruleLocal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_beginBlock_7_0= ruleBegin ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_closeBlock_8_0= ruleClose ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_precedence_9_0= rulePrecedence ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_start_10_0= ruleStartSymbols ) ) ) ) ) )* ) ) ) ( (lv_rules_11_0= ruleGrammarRules ) )
            {
            // InternalLpp.g:80:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_scanner_1_0= ruleScannerName ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_parser_2_0= ruleParserName ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_importBlock_3_0= ruleImport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_exportBlock_4_0= ruleExport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_globalBlock_5_0= ruleGlobal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_localBlock_6_0= ruleLocal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_beginBlock_7_0= ruleBegin ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_closeBlock_8_0= ruleClose ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_precedence_9_0= rulePrecedence ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_start_10_0= ruleStartSymbols ) ) ) ) ) )* ) ) )
            // InternalLpp.g:81:4: ( ( ( ({...}? => ( ({...}? => ( (lv_scanner_1_0= ruleScannerName ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_parser_2_0= ruleParserName ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_importBlock_3_0= ruleImport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_exportBlock_4_0= ruleExport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_globalBlock_5_0= ruleGlobal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_localBlock_6_0= ruleLocal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_beginBlock_7_0= ruleBegin ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_closeBlock_8_0= ruleClose ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_precedence_9_0= rulePrecedence ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_start_10_0= ruleStartSymbols ) ) ) ) ) )* ) )
            {
            // InternalLpp.g:81:4: ( ( ( ({...}? => ( ({...}? => ( (lv_scanner_1_0= ruleScannerName ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_parser_2_0= ruleParserName ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_importBlock_3_0= ruleImport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_exportBlock_4_0= ruleExport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_globalBlock_5_0= ruleGlobal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_localBlock_6_0= ruleLocal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_beginBlock_7_0= ruleBegin ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_closeBlock_8_0= ruleClose ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_precedence_9_0= rulePrecedence ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_start_10_0= ruleStartSymbols ) ) ) ) ) )* ) )
            // InternalLpp.g:82:5: ( ( ({...}? => ( ({...}? => ( (lv_scanner_1_0= ruleScannerName ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_parser_2_0= ruleParserName ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_importBlock_3_0= ruleImport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_exportBlock_4_0= ruleExport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_globalBlock_5_0= ruleGlobal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_localBlock_6_0= ruleLocal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_beginBlock_7_0= ruleBegin ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_closeBlock_8_0= ruleClose ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_precedence_9_0= rulePrecedence ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_start_10_0= ruleStartSymbols ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getParserAccess().getUnorderedGroup_0());
            				
            // InternalLpp.g:85:5: ( ( ({...}? => ( ({...}? => ( (lv_scanner_1_0= ruleScannerName ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_parser_2_0= ruleParserName ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_importBlock_3_0= ruleImport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_exportBlock_4_0= ruleExport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_globalBlock_5_0= ruleGlobal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_localBlock_6_0= ruleLocal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_beginBlock_7_0= ruleBegin ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_closeBlock_8_0= ruleClose ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_precedence_9_0= rulePrecedence ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_start_10_0= ruleStartSymbols ) ) ) ) ) )* )
            // InternalLpp.g:86:6: ( ({...}? => ( ({...}? => ( (lv_scanner_1_0= ruleScannerName ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_parser_2_0= ruleParserName ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_importBlock_3_0= ruleImport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_exportBlock_4_0= ruleExport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_globalBlock_5_0= ruleGlobal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_localBlock_6_0= ruleLocal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_beginBlock_7_0= ruleBegin ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_closeBlock_8_0= ruleClose ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_precedence_9_0= rulePrecedence ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_start_10_0= ruleStartSymbols ) ) ) ) ) )*
            {
            // InternalLpp.g:86:6: ( ({...}? => ( ({...}? => ( (lv_scanner_1_0= ruleScannerName ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_parser_2_0= ruleParserName ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_importBlock_3_0= ruleImport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_exportBlock_4_0= ruleExport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_globalBlock_5_0= ruleGlobal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_localBlock_6_0= ruleLocal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_beginBlock_7_0= ruleBegin ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_closeBlock_8_0= ruleClose ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_precedence_9_0= rulePrecedence ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_start_10_0= ruleStartSymbols ) ) ) ) ) )*
            loop1:
            do {
                int alt1=11;
                alt1 = dfa1.predict(input);
                switch (alt1) {
            	case 1 :
            	    // InternalLpp.g:87:4: ({...}? => ( ({...}? => ( (lv_scanner_1_0= ruleScannerName ) ) ) ) )
            	    {
            	    // InternalLpp.g:87:4: ({...}? => ( ({...}? => ( (lv_scanner_1_0= ruleScannerName ) ) ) ) )
            	    // InternalLpp.g:88:5: {...}? => ( ({...}? => ( (lv_scanner_1_0= ruleScannerName ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getParserAccess().getUnorderedGroup_0(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleParser", "getUnorderedGroupHelper().canSelect(grammarAccess.getParserAccess().getUnorderedGroup_0(), 0)");
            	    }
            	    // InternalLpp.g:88:103: ( ({...}? => ( (lv_scanner_1_0= ruleScannerName ) ) ) )
            	    // InternalLpp.g:89:6: ({...}? => ( (lv_scanner_1_0= ruleScannerName ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getParserAccess().getUnorderedGroup_0(), 0);
            	    					
            	    // InternalLpp.g:92:9: ({...}? => ( (lv_scanner_1_0= ruleScannerName ) ) )
            	    // InternalLpp.g:92:10: {...}? => ( (lv_scanner_1_0= ruleScannerName ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleParser", "true");
            	    }
            	    // InternalLpp.g:92:19: ( (lv_scanner_1_0= ruleScannerName ) )
            	    // InternalLpp.g:92:20: (lv_scanner_1_0= ruleScannerName )
            	    {
            	    // InternalLpp.g:92:20: (lv_scanner_1_0= ruleScannerName )
            	    // InternalLpp.g:93:10: lv_scanner_1_0= ruleScannerName
            	    {

            	    										newCompositeNode(grammarAccess.getParserAccess().getScannerScannerNameParserRuleCall_0_0_0());
            	    									
            	    pushFollow(FOLLOW_3);
            	    lv_scanner_1_0=ruleScannerName();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getParserRule());
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

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getParserAccess().getUnorderedGroup_0());
            	    					

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
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getParserAccess().getUnorderedGroup_0(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleParser", "getUnorderedGroupHelper().canSelect(grammarAccess.getParserAccess().getUnorderedGroup_0(), 1)");
            	    }
            	    // InternalLpp.g:116:103: ( ({...}? => ( (lv_parser_2_0= ruleParserName ) ) ) )
            	    // InternalLpp.g:117:6: ({...}? => ( (lv_parser_2_0= ruleParserName ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getParserAccess().getUnorderedGroup_0(), 1);
            	    					
            	    // InternalLpp.g:120:9: ({...}? => ( (lv_parser_2_0= ruleParserName ) ) )
            	    // InternalLpp.g:120:10: {...}? => ( (lv_parser_2_0= ruleParserName ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleParser", "true");
            	    }
            	    // InternalLpp.g:120:19: ( (lv_parser_2_0= ruleParserName ) )
            	    // InternalLpp.g:120:20: (lv_parser_2_0= ruleParserName )
            	    {
            	    // InternalLpp.g:120:20: (lv_parser_2_0= ruleParserName )
            	    // InternalLpp.g:121:10: lv_parser_2_0= ruleParserName
            	    {

            	    										newCompositeNode(grammarAccess.getParserAccess().getParserParserNameParserRuleCall_0_1_0());
            	    									
            	    pushFollow(FOLLOW_3);
            	    lv_parser_2_0=ruleParserName();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getParserRule());
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

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getParserAccess().getUnorderedGroup_0());
            	    					

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
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getParserAccess().getUnorderedGroup_0(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleParser", "getUnorderedGroupHelper().canSelect(grammarAccess.getParserAccess().getUnorderedGroup_0(), 2)");
            	    }
            	    // InternalLpp.g:144:103: ( ({...}? => ( (lv_importBlock_3_0= ruleImport ) ) ) )
            	    // InternalLpp.g:145:6: ({...}? => ( (lv_importBlock_3_0= ruleImport ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getParserAccess().getUnorderedGroup_0(), 2);
            	    					
            	    // InternalLpp.g:148:9: ({...}? => ( (lv_importBlock_3_0= ruleImport ) ) )
            	    // InternalLpp.g:148:10: {...}? => ( (lv_importBlock_3_0= ruleImport ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleParser", "true");
            	    }
            	    // InternalLpp.g:148:19: ( (lv_importBlock_3_0= ruleImport ) )
            	    // InternalLpp.g:148:20: (lv_importBlock_3_0= ruleImport )
            	    {
            	    // InternalLpp.g:148:20: (lv_importBlock_3_0= ruleImport )
            	    // InternalLpp.g:149:10: lv_importBlock_3_0= ruleImport
            	    {

            	    										newCompositeNode(grammarAccess.getParserAccess().getImportBlockImportParserRuleCall_0_2_0());
            	    									
            	    pushFollow(FOLLOW_3);
            	    lv_importBlock_3_0=ruleImport();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getParserRule());
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

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getParserAccess().getUnorderedGroup_0());
            	    					

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
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getParserAccess().getUnorderedGroup_0(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleParser", "getUnorderedGroupHelper().canSelect(grammarAccess.getParserAccess().getUnorderedGroup_0(), 3)");
            	    }
            	    // InternalLpp.g:172:103: ( ({...}? => ( (lv_exportBlock_4_0= ruleExport ) ) ) )
            	    // InternalLpp.g:173:6: ({...}? => ( (lv_exportBlock_4_0= ruleExport ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getParserAccess().getUnorderedGroup_0(), 3);
            	    					
            	    // InternalLpp.g:176:9: ({...}? => ( (lv_exportBlock_4_0= ruleExport ) ) )
            	    // InternalLpp.g:176:10: {...}? => ( (lv_exportBlock_4_0= ruleExport ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleParser", "true");
            	    }
            	    // InternalLpp.g:176:19: ( (lv_exportBlock_4_0= ruleExport ) )
            	    // InternalLpp.g:176:20: (lv_exportBlock_4_0= ruleExport )
            	    {
            	    // InternalLpp.g:176:20: (lv_exportBlock_4_0= ruleExport )
            	    // InternalLpp.g:177:10: lv_exportBlock_4_0= ruleExport
            	    {

            	    										newCompositeNode(grammarAccess.getParserAccess().getExportBlockExportParserRuleCall_0_3_0());
            	    									
            	    pushFollow(FOLLOW_3);
            	    lv_exportBlock_4_0=ruleExport();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getParserRule());
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

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getParserAccess().getUnorderedGroup_0());
            	    					

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
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getParserAccess().getUnorderedGroup_0(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleParser", "getUnorderedGroupHelper().canSelect(grammarAccess.getParserAccess().getUnorderedGroup_0(), 4)");
            	    }
            	    // InternalLpp.g:200:103: ( ({...}? => ( (lv_globalBlock_5_0= ruleGlobal ) ) ) )
            	    // InternalLpp.g:201:6: ({...}? => ( (lv_globalBlock_5_0= ruleGlobal ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getParserAccess().getUnorderedGroup_0(), 4);
            	    					
            	    // InternalLpp.g:204:9: ({...}? => ( (lv_globalBlock_5_0= ruleGlobal ) ) )
            	    // InternalLpp.g:204:10: {...}? => ( (lv_globalBlock_5_0= ruleGlobal ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleParser", "true");
            	    }
            	    // InternalLpp.g:204:19: ( (lv_globalBlock_5_0= ruleGlobal ) )
            	    // InternalLpp.g:204:20: (lv_globalBlock_5_0= ruleGlobal )
            	    {
            	    // InternalLpp.g:204:20: (lv_globalBlock_5_0= ruleGlobal )
            	    // InternalLpp.g:205:10: lv_globalBlock_5_0= ruleGlobal
            	    {

            	    										newCompositeNode(grammarAccess.getParserAccess().getGlobalBlockGlobalParserRuleCall_0_4_0());
            	    									
            	    pushFollow(FOLLOW_3);
            	    lv_globalBlock_5_0=ruleGlobal();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getParserRule());
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

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getParserAccess().getUnorderedGroup_0());
            	    					

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
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getParserAccess().getUnorderedGroup_0(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleParser", "getUnorderedGroupHelper().canSelect(grammarAccess.getParserAccess().getUnorderedGroup_0(), 5)");
            	    }
            	    // InternalLpp.g:228:103: ( ({...}? => ( (lv_localBlock_6_0= ruleLocal ) ) ) )
            	    // InternalLpp.g:229:6: ({...}? => ( (lv_localBlock_6_0= ruleLocal ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getParserAccess().getUnorderedGroup_0(), 5);
            	    					
            	    // InternalLpp.g:232:9: ({...}? => ( (lv_localBlock_6_0= ruleLocal ) ) )
            	    // InternalLpp.g:232:10: {...}? => ( (lv_localBlock_6_0= ruleLocal ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleParser", "true");
            	    }
            	    // InternalLpp.g:232:19: ( (lv_localBlock_6_0= ruleLocal ) )
            	    // InternalLpp.g:232:20: (lv_localBlock_6_0= ruleLocal )
            	    {
            	    // InternalLpp.g:232:20: (lv_localBlock_6_0= ruleLocal )
            	    // InternalLpp.g:233:10: lv_localBlock_6_0= ruleLocal
            	    {

            	    										newCompositeNode(grammarAccess.getParserAccess().getLocalBlockLocalParserRuleCall_0_5_0());
            	    									
            	    pushFollow(FOLLOW_3);
            	    lv_localBlock_6_0=ruleLocal();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getParserRule());
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

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getParserAccess().getUnorderedGroup_0());
            	    					

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
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getParserAccess().getUnorderedGroup_0(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleParser", "getUnorderedGroupHelper().canSelect(grammarAccess.getParserAccess().getUnorderedGroup_0(), 6)");
            	    }
            	    // InternalLpp.g:256:103: ( ({...}? => ( (lv_beginBlock_7_0= ruleBegin ) ) ) )
            	    // InternalLpp.g:257:6: ({...}? => ( (lv_beginBlock_7_0= ruleBegin ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getParserAccess().getUnorderedGroup_0(), 6);
            	    					
            	    // InternalLpp.g:260:9: ({...}? => ( (lv_beginBlock_7_0= ruleBegin ) ) )
            	    // InternalLpp.g:260:10: {...}? => ( (lv_beginBlock_7_0= ruleBegin ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleParser", "true");
            	    }
            	    // InternalLpp.g:260:19: ( (lv_beginBlock_7_0= ruleBegin ) )
            	    // InternalLpp.g:260:20: (lv_beginBlock_7_0= ruleBegin )
            	    {
            	    // InternalLpp.g:260:20: (lv_beginBlock_7_0= ruleBegin )
            	    // InternalLpp.g:261:10: lv_beginBlock_7_0= ruleBegin
            	    {

            	    										newCompositeNode(grammarAccess.getParserAccess().getBeginBlockBeginParserRuleCall_0_6_0());
            	    									
            	    pushFollow(FOLLOW_3);
            	    lv_beginBlock_7_0=ruleBegin();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getParserRule());
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

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getParserAccess().getUnorderedGroup_0());
            	    					

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
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getParserAccess().getUnorderedGroup_0(), 7) ) {
            	        throw new FailedPredicateException(input, "ruleParser", "getUnorderedGroupHelper().canSelect(grammarAccess.getParserAccess().getUnorderedGroup_0(), 7)");
            	    }
            	    // InternalLpp.g:284:103: ( ({...}? => ( (lv_closeBlock_8_0= ruleClose ) ) ) )
            	    // InternalLpp.g:285:6: ({...}? => ( (lv_closeBlock_8_0= ruleClose ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getParserAccess().getUnorderedGroup_0(), 7);
            	    					
            	    // InternalLpp.g:288:9: ({...}? => ( (lv_closeBlock_8_0= ruleClose ) ) )
            	    // InternalLpp.g:288:10: {...}? => ( (lv_closeBlock_8_0= ruleClose ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleParser", "true");
            	    }
            	    // InternalLpp.g:288:19: ( (lv_closeBlock_8_0= ruleClose ) )
            	    // InternalLpp.g:288:20: (lv_closeBlock_8_0= ruleClose )
            	    {
            	    // InternalLpp.g:288:20: (lv_closeBlock_8_0= ruleClose )
            	    // InternalLpp.g:289:10: lv_closeBlock_8_0= ruleClose
            	    {

            	    										newCompositeNode(grammarAccess.getParserAccess().getCloseBlockCloseParserRuleCall_0_7_0());
            	    									
            	    pushFollow(FOLLOW_3);
            	    lv_closeBlock_8_0=ruleClose();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getParserRule());
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

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getParserAccess().getUnorderedGroup_0());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 9 :
            	    // InternalLpp.g:311:4: ({...}? => ( ({...}? => ( (lv_precedence_9_0= rulePrecedence ) ) ) ) )
            	    {
            	    // InternalLpp.g:311:4: ({...}? => ( ({...}? => ( (lv_precedence_9_0= rulePrecedence ) ) ) ) )
            	    // InternalLpp.g:312:5: {...}? => ( ({...}? => ( (lv_precedence_9_0= rulePrecedence ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getParserAccess().getUnorderedGroup_0(), 8) ) {
            	        throw new FailedPredicateException(input, "ruleParser", "getUnorderedGroupHelper().canSelect(grammarAccess.getParserAccess().getUnorderedGroup_0(), 8)");
            	    }
            	    // InternalLpp.g:312:103: ( ({...}? => ( (lv_precedence_9_0= rulePrecedence ) ) ) )
            	    // InternalLpp.g:313:6: ({...}? => ( (lv_precedence_9_0= rulePrecedence ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getParserAccess().getUnorderedGroup_0(), 8);
            	    					
            	    // InternalLpp.g:316:9: ({...}? => ( (lv_precedence_9_0= rulePrecedence ) ) )
            	    // InternalLpp.g:316:10: {...}? => ( (lv_precedence_9_0= rulePrecedence ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleParser", "true");
            	    }
            	    // InternalLpp.g:316:19: ( (lv_precedence_9_0= rulePrecedence ) )
            	    // InternalLpp.g:316:20: (lv_precedence_9_0= rulePrecedence )
            	    {
            	    // InternalLpp.g:316:20: (lv_precedence_9_0= rulePrecedence )
            	    // InternalLpp.g:317:10: lv_precedence_9_0= rulePrecedence
            	    {

            	    										newCompositeNode(grammarAccess.getParserAccess().getPrecedencePrecedenceParserRuleCall_0_8_0());
            	    									
            	    pushFollow(FOLLOW_3);
            	    lv_precedence_9_0=rulePrecedence();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getParserRule());
            	    										}
            	    										set(
            	    											current,
            	    											"precedence",
            	    											lv_precedence_9_0,
            	    											"de.roma.cocktail.xtext.Lpp.Precedence");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getParserAccess().getUnorderedGroup_0());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 10 :
            	    // InternalLpp.g:339:4: ({...}? => ( ({...}? => ( (lv_start_10_0= ruleStartSymbols ) ) ) ) )
            	    {
            	    // InternalLpp.g:339:4: ({...}? => ( ({...}? => ( (lv_start_10_0= ruleStartSymbols ) ) ) ) )
            	    // InternalLpp.g:340:5: {...}? => ( ({...}? => ( (lv_start_10_0= ruleStartSymbols ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getParserAccess().getUnorderedGroup_0(), 9) ) {
            	        throw new FailedPredicateException(input, "ruleParser", "getUnorderedGroupHelper().canSelect(grammarAccess.getParserAccess().getUnorderedGroup_0(), 9)");
            	    }
            	    // InternalLpp.g:340:103: ( ({...}? => ( (lv_start_10_0= ruleStartSymbols ) ) ) )
            	    // InternalLpp.g:341:6: ({...}? => ( (lv_start_10_0= ruleStartSymbols ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getParserAccess().getUnorderedGroup_0(), 9);
            	    					
            	    // InternalLpp.g:344:9: ({...}? => ( (lv_start_10_0= ruleStartSymbols ) ) )
            	    // InternalLpp.g:344:10: {...}? => ( (lv_start_10_0= ruleStartSymbols ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleParser", "true");
            	    }
            	    // InternalLpp.g:344:19: ( (lv_start_10_0= ruleStartSymbols ) )
            	    // InternalLpp.g:344:20: (lv_start_10_0= ruleStartSymbols )
            	    {
            	    // InternalLpp.g:344:20: (lv_start_10_0= ruleStartSymbols )
            	    // InternalLpp.g:345:10: lv_start_10_0= ruleStartSymbols
            	    {

            	    										newCompositeNode(grammarAccess.getParserAccess().getStartStartSymbolsParserRuleCall_0_9_0());
            	    									
            	    pushFollow(FOLLOW_3);
            	    lv_start_10_0=ruleStartSymbols();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getParserRule());
            	    										}
            	    										set(
            	    											current,
            	    											"start",
            	    											lv_start_10_0,
            	    											"de.roma.cocktail.xtext.Lpp.StartSymbols");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getParserAccess().getUnorderedGroup_0());
            	    					

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

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getParserAccess().getUnorderedGroup_0());
            				

            }

            // InternalLpp.g:374:3: ( (lv_rules_11_0= ruleGrammarRules ) )
            // InternalLpp.g:375:4: (lv_rules_11_0= ruleGrammarRules )
            {
            // InternalLpp.g:375:4: (lv_rules_11_0= ruleGrammarRules )
            // InternalLpp.g:376:5: lv_rules_11_0= ruleGrammarRules
            {

            					newCompositeNode(grammarAccess.getParserAccess().getRulesGrammarRulesParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_rules_11_0=ruleGrammarRules();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParserRule());
            					}
            					set(
            						current,
            						"rules",
            						lv_rules_11_0,
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
    // $ANTLR end "ruleParser"


    // $ANTLR start "entryRuleScannerName"
    // InternalLpp.g:397:1: entryRuleScannerName returns [EObject current=null] : iv_ruleScannerName= ruleScannerName EOF ;
    public final EObject entryRuleScannerName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScannerName = null;


        try {
            // InternalLpp.g:397:52: (iv_ruleScannerName= ruleScannerName EOF )
            // InternalLpp.g:398:2: iv_ruleScannerName= ruleScannerName EOF
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
    // InternalLpp.g:404:1: ruleScannerName returns [EObject current=null] : (otherlv_0= 'SCANNER' ( (lv_name_1_0= RULE_ID ) )? ) ;
    public final EObject ruleScannerName() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalLpp.g:410:2: ( (otherlv_0= 'SCANNER' ( (lv_name_1_0= RULE_ID ) )? ) )
            // InternalLpp.g:411:2: (otherlv_0= 'SCANNER' ( (lv_name_1_0= RULE_ID ) )? )
            {
            // InternalLpp.g:411:2: (otherlv_0= 'SCANNER' ( (lv_name_1_0= RULE_ID ) )? )
            // InternalLpp.g:412:3: otherlv_0= 'SCANNER' ( (lv_name_1_0= RULE_ID ) )?
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getScannerNameAccess().getSCANNERKeyword_0());
            		
            // InternalLpp.g:416:3: ( (lv_name_1_0= RULE_ID ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalLpp.g:417:4: (lv_name_1_0= RULE_ID )
                    {
                    // InternalLpp.g:417:4: (lv_name_1_0= RULE_ID )
                    // InternalLpp.g:418:5: lv_name_1_0= RULE_ID
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
    // InternalLpp.g:438:1: entryRuleParserName returns [EObject current=null] : iv_ruleParserName= ruleParserName EOF ;
    public final EObject entryRuleParserName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParserName = null;


        try {
            // InternalLpp.g:438:51: (iv_ruleParserName= ruleParserName EOF )
            // InternalLpp.g:439:2: iv_ruleParserName= ruleParserName EOF
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
    // InternalLpp.g:445:1: ruleParserName returns [EObject current=null] : (otherlv_0= 'PARSER' ( (lv_name_1_0= RULE_ID ) )? ) ;
    public final EObject ruleParserName() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalLpp.g:451:2: ( (otherlv_0= 'PARSER' ( (lv_name_1_0= RULE_ID ) )? ) )
            // InternalLpp.g:452:2: (otherlv_0= 'PARSER' ( (lv_name_1_0= RULE_ID ) )? )
            {
            // InternalLpp.g:452:2: (otherlv_0= 'PARSER' ( (lv_name_1_0= RULE_ID ) )? )
            // InternalLpp.g:453:3: otherlv_0= 'PARSER' ( (lv_name_1_0= RULE_ID ) )?
            {
            otherlv_0=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getParserNameAccess().getPARSERKeyword_0());
            		
            // InternalLpp.g:457:3: ( (lv_name_1_0= RULE_ID ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalLpp.g:458:4: (lv_name_1_0= RULE_ID )
                    {
                    // InternalLpp.g:458:4: (lv_name_1_0= RULE_ID )
                    // InternalLpp.g:459:5: lv_name_1_0= RULE_ID
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
    // InternalLpp.g:479:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalLpp.g:479:47: (iv_ruleImport= ruleImport EOF )
            // InternalLpp.g:480:2: iv_ruleImport= ruleImport EOF
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
    // InternalLpp.g:486:1: ruleImport returns [EObject current=null] : (otherlv_0= 'IMPORT' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_content_2_0 = null;



        	enterRule();

        try {
            // InternalLpp.g:492:2: ( (otherlv_0= 'IMPORT' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' ) )
            // InternalLpp.g:493:2: (otherlv_0= 'IMPORT' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' )
            {
            // InternalLpp.g:493:2: (otherlv_0= 'IMPORT' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' )
            // InternalLpp.g:494:3: otherlv_0= 'IMPORT' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getImportAccess().getIMPORTKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getImportAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalLpp.g:502:3: ( (lv_content_2_0= ruleCodeBlock ) )
            // InternalLpp.g:503:4: (lv_content_2_0= ruleCodeBlock )
            {
            // InternalLpp.g:503:4: (lv_content_2_0= ruleCodeBlock )
            // InternalLpp.g:504:5: lv_content_2_0= ruleCodeBlock
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
    // InternalLpp.g:529:1: entryRuleExport returns [EObject current=null] : iv_ruleExport= ruleExport EOF ;
    public final EObject entryRuleExport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExport = null;


        try {
            // InternalLpp.g:529:47: (iv_ruleExport= ruleExport EOF )
            // InternalLpp.g:530:2: iv_ruleExport= ruleExport EOF
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
    // InternalLpp.g:536:1: ruleExport returns [EObject current=null] : (otherlv_0= 'EXPORT' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' ) ;
    public final EObject ruleExport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_content_2_0 = null;



        	enterRule();

        try {
            // InternalLpp.g:542:2: ( (otherlv_0= 'EXPORT' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' ) )
            // InternalLpp.g:543:2: (otherlv_0= 'EXPORT' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' )
            {
            // InternalLpp.g:543:2: (otherlv_0= 'EXPORT' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' )
            // InternalLpp.g:544:3: otherlv_0= 'EXPORT' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getExportAccess().getEXPORTKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getExportAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalLpp.g:552:3: ( (lv_content_2_0= ruleCodeBlock ) )
            // InternalLpp.g:553:4: (lv_content_2_0= ruleCodeBlock )
            {
            // InternalLpp.g:553:4: (lv_content_2_0= ruleCodeBlock )
            // InternalLpp.g:554:5: lv_content_2_0= ruleCodeBlock
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
    // InternalLpp.g:579:1: entryRuleGlobal returns [EObject current=null] : iv_ruleGlobal= ruleGlobal EOF ;
    public final EObject entryRuleGlobal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGlobal = null;


        try {
            // InternalLpp.g:579:47: (iv_ruleGlobal= ruleGlobal EOF )
            // InternalLpp.g:580:2: iv_ruleGlobal= ruleGlobal EOF
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
    // InternalLpp.g:586:1: ruleGlobal returns [EObject current=null] : (otherlv_0= 'GLOBAL' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' ) ;
    public final EObject ruleGlobal() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_content_2_0 = null;



        	enterRule();

        try {
            // InternalLpp.g:592:2: ( (otherlv_0= 'GLOBAL' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' ) )
            // InternalLpp.g:593:2: (otherlv_0= 'GLOBAL' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' )
            {
            // InternalLpp.g:593:2: (otherlv_0= 'GLOBAL' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' )
            // InternalLpp.g:594:3: otherlv_0= 'GLOBAL' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getGlobalAccess().getGLOBALKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getGlobalAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalLpp.g:602:3: ( (lv_content_2_0= ruleCodeBlock ) )
            // InternalLpp.g:603:4: (lv_content_2_0= ruleCodeBlock )
            {
            // InternalLpp.g:603:4: (lv_content_2_0= ruleCodeBlock )
            // InternalLpp.g:604:5: lv_content_2_0= ruleCodeBlock
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
    // InternalLpp.g:629:1: entryRuleLocal returns [EObject current=null] : iv_ruleLocal= ruleLocal EOF ;
    public final EObject entryRuleLocal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocal = null;


        try {
            // InternalLpp.g:629:46: (iv_ruleLocal= ruleLocal EOF )
            // InternalLpp.g:630:2: iv_ruleLocal= ruleLocal EOF
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
    // InternalLpp.g:636:1: ruleLocal returns [EObject current=null] : (otherlv_0= 'LOCAL' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' ) ;
    public final EObject ruleLocal() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_content_2_0 = null;



        	enterRule();

        try {
            // InternalLpp.g:642:2: ( (otherlv_0= 'LOCAL' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' ) )
            // InternalLpp.g:643:2: (otherlv_0= 'LOCAL' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' )
            {
            // InternalLpp.g:643:2: (otherlv_0= 'LOCAL' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' )
            // InternalLpp.g:644:3: otherlv_0= 'LOCAL' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getLocalAccess().getLOCALKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getLocalAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalLpp.g:652:3: ( (lv_content_2_0= ruleCodeBlock ) )
            // InternalLpp.g:653:4: (lv_content_2_0= ruleCodeBlock )
            {
            // InternalLpp.g:653:4: (lv_content_2_0= ruleCodeBlock )
            // InternalLpp.g:654:5: lv_content_2_0= ruleCodeBlock
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
    // InternalLpp.g:679:1: entryRuleBegin returns [EObject current=null] : iv_ruleBegin= ruleBegin EOF ;
    public final EObject entryRuleBegin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBegin = null;


        try {
            // InternalLpp.g:679:46: (iv_ruleBegin= ruleBegin EOF )
            // InternalLpp.g:680:2: iv_ruleBegin= ruleBegin EOF
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
    // InternalLpp.g:686:1: ruleBegin returns [EObject current=null] : (otherlv_0= 'BEGIN' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' ) ;
    public final EObject ruleBegin() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_content_2_0 = null;



        	enterRule();

        try {
            // InternalLpp.g:692:2: ( (otherlv_0= 'BEGIN' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' ) )
            // InternalLpp.g:693:2: (otherlv_0= 'BEGIN' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' )
            {
            // InternalLpp.g:693:2: (otherlv_0= 'BEGIN' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' )
            // InternalLpp.g:694:3: otherlv_0= 'BEGIN' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getBeginAccess().getBEGINKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getBeginAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalLpp.g:702:3: ( (lv_content_2_0= ruleCodeBlock ) )
            // InternalLpp.g:703:4: (lv_content_2_0= ruleCodeBlock )
            {
            // InternalLpp.g:703:4: (lv_content_2_0= ruleCodeBlock )
            // InternalLpp.g:704:5: lv_content_2_0= ruleCodeBlock
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
    // InternalLpp.g:729:1: entryRuleClose returns [EObject current=null] : iv_ruleClose= ruleClose EOF ;
    public final EObject entryRuleClose() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClose = null;


        try {
            // InternalLpp.g:729:46: (iv_ruleClose= ruleClose EOF )
            // InternalLpp.g:730:2: iv_ruleClose= ruleClose EOF
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
    // InternalLpp.g:736:1: ruleClose returns [EObject current=null] : (otherlv_0= 'CLOSE' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' ) ;
    public final EObject ruleClose() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_content_2_0 = null;



        	enterRule();

        try {
            // InternalLpp.g:742:2: ( (otherlv_0= 'CLOSE' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' ) )
            // InternalLpp.g:743:2: (otherlv_0= 'CLOSE' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' )
            {
            // InternalLpp.g:743:2: (otherlv_0= 'CLOSE' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' )
            // InternalLpp.g:744:3: otherlv_0= 'CLOSE' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getCloseAccess().getCLOSEKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getCloseAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalLpp.g:752:3: ( (lv_content_2_0= ruleCodeBlock ) )
            // InternalLpp.g:753:4: (lv_content_2_0= ruleCodeBlock )
            {
            // InternalLpp.g:753:4: (lv_content_2_0= ruleCodeBlock )
            // InternalLpp.g:754:5: lv_content_2_0= ruleCodeBlock
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


    // $ANTLR start "entryRuleCodeBlock"
    // InternalLpp.g:779:1: entryRuleCodeBlock returns [EObject current=null] : iv_ruleCodeBlock= ruleCodeBlock EOF ;
    public final EObject entryRuleCodeBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCodeBlock = null;


        try {
            // InternalLpp.g:779:50: (iv_ruleCodeBlock= ruleCodeBlock EOF )
            // InternalLpp.g:780:2: iv_ruleCodeBlock= ruleCodeBlock EOF
            {
             newCompositeNode(grammarAccess.getCodeBlockRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCodeBlock=ruleCodeBlock();

            state._fsp--;

             current =iv_ruleCodeBlock; 
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
    // InternalLpp.g:786:1: ruleCodeBlock returns [EObject current=null] : ( ( (lv_wall_0_0= ruleCodeWall ) ) | (otherlv_1= '{' ( (lv_block_2_0= ruleCodeBlock ) ) otherlv_3= '}' ) )* ;
    public final EObject ruleCodeBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_wall_0_0 = null;

        EObject lv_block_2_0 = null;



        	enterRule();

        try {
            // InternalLpp.g:792:2: ( ( ( (lv_wall_0_0= ruleCodeWall ) ) | (otherlv_1= '{' ( (lv_block_2_0= ruleCodeBlock ) ) otherlv_3= '}' ) )* )
            // InternalLpp.g:793:2: ( ( (lv_wall_0_0= ruleCodeWall ) ) | (otherlv_1= '{' ( (lv_block_2_0= ruleCodeBlock ) ) otherlv_3= '}' ) )*
            {
            // InternalLpp.g:793:2: ( ( (lv_wall_0_0= ruleCodeWall ) ) | (otherlv_1= '{' ( (lv_block_2_0= ruleCodeBlock ) ) otherlv_3= '}' ) )*
            loop4:
            do {
                int alt4=3;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=RULE_ID && LA4_0<=RULE_WS)||(LA4_0>=21 && LA4_0<=41)) ) {
                    alt4=1;
                }
                else if ( (LA4_0==14) ) {
                    alt4=2;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalLpp.g:794:3: ( (lv_wall_0_0= ruleCodeWall ) )
            	    {
            	    // InternalLpp.g:794:3: ( (lv_wall_0_0= ruleCodeWall ) )
            	    // InternalLpp.g:795:4: (lv_wall_0_0= ruleCodeWall )
            	    {
            	    // InternalLpp.g:795:4: (lv_wall_0_0= ruleCodeWall )
            	    // InternalLpp.g:796:5: lv_wall_0_0= ruleCodeWall
            	    {

            	    					newCompositeNode(grammarAccess.getCodeBlockAccess().getWallCodeWallParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_wall_0_0=ruleCodeWall();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCodeBlockRule());
            	    					}
            	    					set(
            	    						current,
            	    						"wall",
            	    						lv_wall_0_0,
            	    						"de.roma.cocktail.xtext.Lpp.CodeWall");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalLpp.g:814:3: (otherlv_1= '{' ( (lv_block_2_0= ruleCodeBlock ) ) otherlv_3= '}' )
            	    {
            	    // InternalLpp.g:814:3: (otherlv_1= '{' ( (lv_block_2_0= ruleCodeBlock ) ) otherlv_3= '}' )
            	    // InternalLpp.g:815:4: otherlv_1= '{' ( (lv_block_2_0= ruleCodeBlock ) ) otherlv_3= '}'
            	    {
            	    otherlv_1=(Token)match(input,14,FOLLOW_6); 

            	    				newLeafNode(otherlv_1, grammarAccess.getCodeBlockAccess().getLeftCurlyBracketKeyword_1_0());
            	    			
            	    // InternalLpp.g:819:4: ( (lv_block_2_0= ruleCodeBlock ) )
            	    // InternalLpp.g:820:5: (lv_block_2_0= ruleCodeBlock )
            	    {
            	    // InternalLpp.g:820:5: (lv_block_2_0= ruleCodeBlock )
            	    // InternalLpp.g:821:6: lv_block_2_0= ruleCodeBlock
            	    {

            	    						newCompositeNode(grammarAccess.getCodeBlockAccess().getBlockCodeBlockParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_block_2_0=ruleCodeBlock();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getCodeBlockRule());
            	    						}
            	    						set(
            	    							current,
            	    							"block",
            	    							lv_block_2_0,
            	    							"de.roma.cocktail.xtext.Lpp.CodeBlock");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_3=(Token)match(input,15,FOLLOW_8); 

            	    				newLeafNode(otherlv_3, grammarAccess.getCodeBlockAccess().getRightCurlyBracketKeyword_1_2());
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
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
    // InternalLpp.g:847:1: entryRuleCodeWall returns [String current=null] : iv_ruleCodeWall= ruleCodeWall EOF ;
    public final String entryRuleCodeWall() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCodeWall = null;


        try {
            // InternalLpp.g:847:48: (iv_ruleCodeWall= ruleCodeWall EOF )
            // InternalLpp.g:848:2: iv_ruleCodeWall= ruleCodeWall EOF
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
    // InternalLpp.g:854:1: ruleCodeWall returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_INT_1= RULE_INT | this_STRING_2= RULE_STRING | this_WS_3= RULE_WS | kw= '+' | kw= '-' | kw= '(' | kw= ')' | kw= '*' | kw= '.' | kw= '/' | kw= '\\\\' | kw= '|' | kw= '?' | kw= '>' | kw= '<' | kw= '#' | kw= '$' | kw= '%' | kw= ';' | kw= ':' | kw= '!' | kw= '=' | kw= ',' | kw= ':=' ) ;
    public final AntlrDatatypeRuleToken ruleCodeWall() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_INT_1=null;
        Token this_STRING_2=null;
        Token this_WS_3=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalLpp.g:860:2: ( (this_ID_0= RULE_ID | this_INT_1= RULE_INT | this_STRING_2= RULE_STRING | this_WS_3= RULE_WS | kw= '+' | kw= '-' | kw= '(' | kw= ')' | kw= '*' | kw= '.' | kw= '/' | kw= '\\\\' | kw= '|' | kw= '?' | kw= '>' | kw= '<' | kw= '#' | kw= '$' | kw= '%' | kw= ';' | kw= ':' | kw= '!' | kw= '=' | kw= ',' | kw= ':=' ) )
            // InternalLpp.g:861:2: (this_ID_0= RULE_ID | this_INT_1= RULE_INT | this_STRING_2= RULE_STRING | this_WS_3= RULE_WS | kw= '+' | kw= '-' | kw= '(' | kw= ')' | kw= '*' | kw= '.' | kw= '/' | kw= '\\\\' | kw= '|' | kw= '?' | kw= '>' | kw= '<' | kw= '#' | kw= '$' | kw= '%' | kw= ';' | kw= ':' | kw= '!' | kw= '=' | kw= ',' | kw= ':=' )
            {
            // InternalLpp.g:861:2: (this_ID_0= RULE_ID | this_INT_1= RULE_INT | this_STRING_2= RULE_STRING | this_WS_3= RULE_WS | kw= '+' | kw= '-' | kw= '(' | kw= ')' | kw= '*' | kw= '.' | kw= '/' | kw= '\\\\' | kw= '|' | kw= '?' | kw= '>' | kw= '<' | kw= '#' | kw= '$' | kw= '%' | kw= ';' | kw= ':' | kw= '!' | kw= '=' | kw= ',' | kw= ':=' )
            int alt5=25;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt5=1;
                }
                break;
            case RULE_INT:
                {
                alt5=2;
                }
                break;
            case RULE_STRING:
                {
                alt5=3;
                }
                break;
            case RULE_WS:
                {
                alt5=4;
                }
                break;
            case 21:
                {
                alt5=5;
                }
                break;
            case 22:
                {
                alt5=6;
                }
                break;
            case 23:
                {
                alt5=7;
                }
                break;
            case 24:
                {
                alt5=8;
                }
                break;
            case 25:
                {
                alt5=9;
                }
                break;
            case 26:
                {
                alt5=10;
                }
                break;
            case 27:
                {
                alt5=11;
                }
                break;
            case 28:
                {
                alt5=12;
                }
                break;
            case 29:
                {
                alt5=13;
                }
                break;
            case 30:
                {
                alt5=14;
                }
                break;
            case 31:
                {
                alt5=15;
                }
                break;
            case 32:
                {
                alt5=16;
                }
                break;
            case 33:
                {
                alt5=17;
                }
                break;
            case 34:
                {
                alt5=18;
                }
                break;
            case 35:
                {
                alt5=19;
                }
                break;
            case 36:
                {
                alt5=20;
                }
                break;
            case 37:
                {
                alt5=21;
                }
                break;
            case 38:
                {
                alt5=22;
                }
                break;
            case 39:
                {
                alt5=23;
                }
                break;
            case 40:
                {
                alt5=24;
                }
                break;
            case 41:
                {
                alt5=25;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalLpp.g:862:3: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_0);
                    		

                    			newLeafNode(this_ID_0, grammarAccess.getCodeWallAccess().getIDTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalLpp.g:870:3: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			current.merge(this_INT_1);
                    		

                    			newLeafNode(this_INT_1, grammarAccess.getCodeWallAccess().getINTTerminalRuleCall_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalLpp.g:878:3: this_STRING_2= RULE_STRING
                    {
                    this_STRING_2=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_2);
                    		

                    			newLeafNode(this_STRING_2, grammarAccess.getCodeWallAccess().getSTRINGTerminalRuleCall_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalLpp.g:886:3: this_WS_3= RULE_WS
                    {
                    this_WS_3=(Token)match(input,RULE_WS,FOLLOW_2); 

                    			current.merge(this_WS_3);
                    		

                    			newLeafNode(this_WS_3, grammarAccess.getCodeWallAccess().getWSTerminalRuleCall_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalLpp.g:894:3: kw= '+'
                    {
                    kw=(Token)match(input,21,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCodeWallAccess().getPlusSignKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalLpp.g:900:3: kw= '-'
                    {
                    kw=(Token)match(input,22,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCodeWallAccess().getHyphenMinusKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalLpp.g:906:3: kw= '('
                    {
                    kw=(Token)match(input,23,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCodeWallAccess().getLeftParenthesisKeyword_6());
                    		

                    }
                    break;
                case 8 :
                    // InternalLpp.g:912:3: kw= ')'
                    {
                    kw=(Token)match(input,24,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCodeWallAccess().getRightParenthesisKeyword_7());
                    		

                    }
                    break;
                case 9 :
                    // InternalLpp.g:918:3: kw= '*'
                    {
                    kw=(Token)match(input,25,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCodeWallAccess().getAsteriskKeyword_8());
                    		

                    }
                    break;
                case 10 :
                    // InternalLpp.g:924:3: kw= '.'
                    {
                    kw=(Token)match(input,26,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCodeWallAccess().getFullStopKeyword_9());
                    		

                    }
                    break;
                case 11 :
                    // InternalLpp.g:930:3: kw= '/'
                    {
                    kw=(Token)match(input,27,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCodeWallAccess().getSolidusKeyword_10());
                    		

                    }
                    break;
                case 12 :
                    // InternalLpp.g:936:3: kw= '\\\\'
                    {
                    kw=(Token)match(input,28,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCodeWallAccess().getReverseSolidusKeyword_11());
                    		

                    }
                    break;
                case 13 :
                    // InternalLpp.g:942:3: kw= '|'
                    {
                    kw=(Token)match(input,29,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCodeWallAccess().getVerticalLineKeyword_12());
                    		

                    }
                    break;
                case 14 :
                    // InternalLpp.g:948:3: kw= '?'
                    {
                    kw=(Token)match(input,30,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCodeWallAccess().getQuestionMarkKeyword_13());
                    		

                    }
                    break;
                case 15 :
                    // InternalLpp.g:954:3: kw= '>'
                    {
                    kw=(Token)match(input,31,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCodeWallAccess().getGreaterThanSignKeyword_14());
                    		

                    }
                    break;
                case 16 :
                    // InternalLpp.g:960:3: kw= '<'
                    {
                    kw=(Token)match(input,32,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCodeWallAccess().getLessThanSignKeyword_15());
                    		

                    }
                    break;
                case 17 :
                    // InternalLpp.g:966:3: kw= '#'
                    {
                    kw=(Token)match(input,33,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCodeWallAccess().getNumberSignKeyword_16());
                    		

                    }
                    break;
                case 18 :
                    // InternalLpp.g:972:3: kw= '$'
                    {
                    kw=(Token)match(input,34,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCodeWallAccess().getDollarSignKeyword_17());
                    		

                    }
                    break;
                case 19 :
                    // InternalLpp.g:978:3: kw= '%'
                    {
                    kw=(Token)match(input,35,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCodeWallAccess().getPercentSignKeyword_18());
                    		

                    }
                    break;
                case 20 :
                    // InternalLpp.g:984:3: kw= ';'
                    {
                    kw=(Token)match(input,36,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCodeWallAccess().getSemicolonKeyword_19());
                    		

                    }
                    break;
                case 21 :
                    // InternalLpp.g:990:3: kw= ':'
                    {
                    kw=(Token)match(input,37,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCodeWallAccess().getColonKeyword_20());
                    		

                    }
                    break;
                case 22 :
                    // InternalLpp.g:996:3: kw= '!'
                    {
                    kw=(Token)match(input,38,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCodeWallAccess().getExclamationMarkKeyword_21());
                    		

                    }
                    break;
                case 23 :
                    // InternalLpp.g:1002:3: kw= '='
                    {
                    kw=(Token)match(input,39,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCodeWallAccess().getEqualsSignKeyword_22());
                    		

                    }
                    break;
                case 24 :
                    // InternalLpp.g:1008:3: kw= ','
                    {
                    kw=(Token)match(input,40,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCodeWallAccess().getCommaKeyword_23());
                    		

                    }
                    break;
                case 25 :
                    // InternalLpp.g:1014:3: kw= ':='
                    {
                    kw=(Token)match(input,41,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCodeWallAccess().getColonEqualsSignKeyword_24());
                    		

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
    // InternalLpp.g:1023:1: entryRulePrecedence returns [EObject current=null] : iv_rulePrecedence= rulePrecedence EOF ;
    public final EObject entryRulePrecedence() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrecedence = null;


        try {
            // InternalLpp.g:1023:51: (iv_rulePrecedence= rulePrecedence EOF )
            // InternalLpp.g:1024:2: iv_rulePrecedence= rulePrecedence EOF
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
    // InternalLpp.g:1030:1: rulePrecedence returns [EObject current=null] : (otherlv_0= 'PREC' ( (lv_rows_1_0= rulePrecedenceRow ) )* ) ;
    public final EObject rulePrecedence() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_rows_1_0 = null;



        	enterRule();

        try {
            // InternalLpp.g:1036:2: ( (otherlv_0= 'PREC' ( (lv_rows_1_0= rulePrecedenceRow ) )* ) )
            // InternalLpp.g:1037:2: (otherlv_0= 'PREC' ( (lv_rows_1_0= rulePrecedenceRow ) )* )
            {
            // InternalLpp.g:1037:2: (otherlv_0= 'PREC' ( (lv_rows_1_0= rulePrecedenceRow ) )* )
            // InternalLpp.g:1038:3: otherlv_0= 'PREC' ( (lv_rows_1_0= rulePrecedenceRow ) )*
            {
            otherlv_0=(Token)match(input,42,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getPrecedenceAccess().getPRECKeyword_0());
            		
            // InternalLpp.g:1042:3: ( (lv_rows_1_0= rulePrecedenceRow ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=48 && LA6_0<=50)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalLpp.g:1043:4: (lv_rows_1_0= rulePrecedenceRow )
            	    {
            	    // InternalLpp.g:1043:4: (lv_rows_1_0= rulePrecedenceRow )
            	    // InternalLpp.g:1044:5: lv_rows_1_0= rulePrecedenceRow
            	    {

            	    					newCompositeNode(grammarAccess.getPrecedenceAccess().getRowsPrecedenceRowParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_9);
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
            	    break loop6;
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
    // InternalLpp.g:1065:1: entryRulePrecedenceRow returns [EObject current=null] : iv_rulePrecedenceRow= rulePrecedenceRow EOF ;
    public final EObject entryRulePrecedenceRow() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrecedenceRow = null;


        try {
            // InternalLpp.g:1065:54: (iv_rulePrecedenceRow= rulePrecedenceRow EOF )
            // InternalLpp.g:1066:2: iv_rulePrecedenceRow= rulePrecedenceRow EOF
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
    // InternalLpp.g:1072:1: rulePrecedenceRow returns [EObject current=null] : ( ( (lv_type_0_0= rulePrecedenceType ) ) ( (lv_strings_1_0= RULE_STRING ) )* ( (lv_name_2_0= RULE_ID ) )? ) ;
    public final EObject rulePrecedenceRow() throws RecognitionException {
        EObject current = null;

        Token lv_strings_1_0=null;
        Token lv_name_2_0=null;
        Enumerator lv_type_0_0 = null;



        	enterRule();

        try {
            // InternalLpp.g:1078:2: ( ( ( (lv_type_0_0= rulePrecedenceType ) ) ( (lv_strings_1_0= RULE_STRING ) )* ( (lv_name_2_0= RULE_ID ) )? ) )
            // InternalLpp.g:1079:2: ( ( (lv_type_0_0= rulePrecedenceType ) ) ( (lv_strings_1_0= RULE_STRING ) )* ( (lv_name_2_0= RULE_ID ) )? )
            {
            // InternalLpp.g:1079:2: ( ( (lv_type_0_0= rulePrecedenceType ) ) ( (lv_strings_1_0= RULE_STRING ) )* ( (lv_name_2_0= RULE_ID ) )? )
            // InternalLpp.g:1080:3: ( (lv_type_0_0= rulePrecedenceType ) ) ( (lv_strings_1_0= RULE_STRING ) )* ( (lv_name_2_0= RULE_ID ) )?
            {
            // InternalLpp.g:1080:3: ( (lv_type_0_0= rulePrecedenceType ) )
            // InternalLpp.g:1081:4: (lv_type_0_0= rulePrecedenceType )
            {
            // InternalLpp.g:1081:4: (lv_type_0_0= rulePrecedenceType )
            // InternalLpp.g:1082:5: lv_type_0_0= rulePrecedenceType
            {

            					newCompositeNode(grammarAccess.getPrecedenceRowAccess().getTypePrecedenceTypeEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_10);
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

            // InternalLpp.g:1099:3: ( (lv_strings_1_0= RULE_STRING ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_STRING) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalLpp.g:1100:4: (lv_strings_1_0= RULE_STRING )
            	    {
            	    // InternalLpp.g:1100:4: (lv_strings_1_0= RULE_STRING )
            	    // InternalLpp.g:1101:5: lv_strings_1_0= RULE_STRING
            	    {
            	    lv_strings_1_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

            	    					newLeafNode(lv_strings_1_0, grammarAccess.getPrecedenceRowAccess().getStringsSTRINGTerminalRuleCall_1_0());
            	    				

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getPrecedenceRowRule());
            	    					}
            	    					addWithLastConsumed(
            	    						current,
            	    						"strings",
            	    						lv_strings_1_0,
            	    						"org.eclipse.xtext.common.Terminals.STRING");
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            // InternalLpp.g:1117:3: ( (lv_name_2_0= RULE_ID ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalLpp.g:1118:4: (lv_name_2_0= RULE_ID )
                    {
                    // InternalLpp.g:1118:4: (lv_name_2_0= RULE_ID )
                    // InternalLpp.g:1119:5: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(lv_name_2_0, grammarAccess.getPrecedenceRowAccess().getNameIDTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPrecedenceRowRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_2_0,
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
    // $ANTLR end "rulePrecedenceRow"


    // $ANTLR start "entryRuleStartSymbols"
    // InternalLpp.g:1139:1: entryRuleStartSymbols returns [EObject current=null] : iv_ruleStartSymbols= ruleStartSymbols EOF ;
    public final EObject entryRuleStartSymbols() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStartSymbols = null;


        try {
            // InternalLpp.g:1139:53: (iv_ruleStartSymbols= ruleStartSymbols EOF )
            // InternalLpp.g:1140:2: iv_ruleStartSymbols= ruleStartSymbols EOF
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
    // InternalLpp.g:1146:1: ruleStartSymbols returns [EObject current=null] : (otherlv_0= 'START' ( (lv_states_1_0= ruleStartState ) )* ) ;
    public final EObject ruleStartSymbols() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_states_1_0 = null;



        	enterRule();

        try {
            // InternalLpp.g:1152:2: ( (otherlv_0= 'START' ( (lv_states_1_0= ruleStartState ) )* ) )
            // InternalLpp.g:1153:2: (otherlv_0= 'START' ( (lv_states_1_0= ruleStartState ) )* )
            {
            // InternalLpp.g:1153:2: (otherlv_0= 'START' ( (lv_states_1_0= ruleStartState ) )* )
            // InternalLpp.g:1154:3: otherlv_0= 'START' ( (lv_states_1_0= ruleStartState ) )*
            {
            otherlv_0=(Token)match(input,43,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getStartSymbolsAccess().getSTARTKeyword_0());
            		
            // InternalLpp.g:1158:3: ( (lv_states_1_0= ruleStartState ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalLpp.g:1159:4: (lv_states_1_0= ruleStartState )
            	    {
            	    // InternalLpp.g:1159:4: (lv_states_1_0= ruleStartState )
            	    // InternalLpp.g:1160:5: lv_states_1_0= ruleStartState
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
            	    break loop9;
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
    // InternalLpp.g:1181:1: entryRuleStartState returns [EObject current=null] : iv_ruleStartState= ruleStartState EOF ;
    public final EObject entryRuleStartState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStartState = null;


        try {
            // InternalLpp.g:1181:51: (iv_ruleStartState= ruleStartState EOF )
            // InternalLpp.g:1182:2: iv_ruleStartState= ruleStartState EOF
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
    // InternalLpp.g:1188:1: ruleStartState returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleStartState() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalLpp.g:1194:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalLpp.g:1195:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalLpp.g:1195:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalLpp.g:1196:3: (lv_name_0_0= RULE_ID )
            {
            // InternalLpp.g:1196:3: (lv_name_0_0= RULE_ID )
            // InternalLpp.g:1197:4: lv_name_0_0= RULE_ID
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
    // InternalLpp.g:1216:1: entryRuleGrammarRules returns [EObject current=null] : iv_ruleGrammarRules= ruleGrammarRules EOF ;
    public final EObject entryRuleGrammarRules() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGrammarRules = null;


        try {
            // InternalLpp.g:1216:53: (iv_ruleGrammarRules= ruleGrammarRules EOF )
            // InternalLpp.g:1217:2: iv_ruleGrammarRules= ruleGrammarRules EOF
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
    // InternalLpp.g:1223:1: ruleGrammarRules returns [EObject current=null] : ( (otherlv_0= 'RULE' | otherlv_1= 'RULES' ) ( (lv_nodes_2_0= ruleGrammarRule ) )* ) ;
    public final EObject ruleGrammarRules() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_nodes_2_0 = null;



        	enterRule();

        try {
            // InternalLpp.g:1229:2: ( ( (otherlv_0= 'RULE' | otherlv_1= 'RULES' ) ( (lv_nodes_2_0= ruleGrammarRule ) )* ) )
            // InternalLpp.g:1230:2: ( (otherlv_0= 'RULE' | otherlv_1= 'RULES' ) ( (lv_nodes_2_0= ruleGrammarRule ) )* )
            {
            // InternalLpp.g:1230:2: ( (otherlv_0= 'RULE' | otherlv_1= 'RULES' ) ( (lv_nodes_2_0= ruleGrammarRule ) )* )
            // InternalLpp.g:1231:3: (otherlv_0= 'RULE' | otherlv_1= 'RULES' ) ( (lv_nodes_2_0= ruleGrammarRule ) )*
            {
            // InternalLpp.g:1231:3: (otherlv_0= 'RULE' | otherlv_1= 'RULES' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==44) ) {
                alt10=1;
            }
            else if ( (LA10_0==45) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalLpp.g:1232:4: otherlv_0= 'RULE'
                    {
                    otherlv_0=(Token)match(input,44,FOLLOW_10); 

                    				newLeafNode(otherlv_0, grammarAccess.getGrammarRulesAccess().getRULEKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalLpp.g:1237:4: otherlv_1= 'RULES'
                    {
                    otherlv_1=(Token)match(input,45,FOLLOW_10); 

                    				newLeafNode(otherlv_1, grammarAccess.getGrammarRulesAccess().getRULESKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalLpp.g:1242:3: ( (lv_nodes_2_0= ruleGrammarRule ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID||LA11_0==RULE_STRING) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalLpp.g:1243:4: (lv_nodes_2_0= ruleGrammarRule )
            	    {
            	    // InternalLpp.g:1243:4: (lv_nodes_2_0= ruleGrammarRule )
            	    // InternalLpp.g:1244:5: lv_nodes_2_0= ruleGrammarRule
            	    {

            	    					newCompositeNode(grammarAccess.getGrammarRulesAccess().getNodesGrammarRuleParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_nodes_2_0=ruleGrammarRule();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getGrammarRulesRule());
            	    					}
            	    					add(
            	    						current,
            	    						"nodes",
            	    						lv_nodes_2_0,
            	    						"de.roma.cocktail.xtext.Lpp.GrammarRule");
            	    					afterParserOrEnumRuleCall();
            	    				

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
    // $ANTLR end "ruleGrammarRules"


    // $ANTLR start "entryRuleGrammarRule"
    // InternalLpp.g:1265:1: entryRuleGrammarRule returns [EObject current=null] : iv_ruleGrammarRule= ruleGrammarRule EOF ;
    public final EObject entryRuleGrammarRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGrammarRule = null;


        try {
            // InternalLpp.g:1265:52: (iv_ruleGrammarRule= ruleGrammarRule EOF )
            // InternalLpp.g:1266:2: iv_ruleGrammarRule= ruleGrammarRule EOF
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
    // InternalLpp.g:1272:1: ruleGrammarRule returns [EObject current=null] : ( ( (lv_name_0_0= ruleRuleName ) ) ( (lv_body_1_0= ruleRuleBody ) ) ) ;
    public final EObject ruleGrammarRule() throws RecognitionException {
        EObject current = null;

        EObject lv_name_0_0 = null;

        EObject lv_body_1_0 = null;



        	enterRule();

        try {
            // InternalLpp.g:1278:2: ( ( ( (lv_name_0_0= ruleRuleName ) ) ( (lv_body_1_0= ruleRuleBody ) ) ) )
            // InternalLpp.g:1279:2: ( ( (lv_name_0_0= ruleRuleName ) ) ( (lv_body_1_0= ruleRuleBody ) ) )
            {
            // InternalLpp.g:1279:2: ( ( (lv_name_0_0= ruleRuleName ) ) ( (lv_body_1_0= ruleRuleBody ) ) )
            // InternalLpp.g:1280:3: ( (lv_name_0_0= ruleRuleName ) ) ( (lv_body_1_0= ruleRuleBody ) )
            {
            // InternalLpp.g:1280:3: ( (lv_name_0_0= ruleRuleName ) )
            // InternalLpp.g:1281:4: (lv_name_0_0= ruleRuleName )
            {
            // InternalLpp.g:1281:4: (lv_name_0_0= ruleRuleName )
            // InternalLpp.g:1282:5: lv_name_0_0= ruleRuleName
            {

            					newCompositeNode(grammarAccess.getGrammarRuleAccess().getNameRuleNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_11);
            lv_name_0_0=ruleRuleName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGrammarRuleRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"de.roma.cocktail.xtext.Lpp.RuleName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalLpp.g:1299:3: ( (lv_body_1_0= ruleRuleBody ) )
            // InternalLpp.g:1300:4: (lv_body_1_0= ruleRuleBody )
            {
            // InternalLpp.g:1300:4: (lv_body_1_0= ruleRuleBody )
            // InternalLpp.g:1301:5: lv_body_1_0= ruleRuleBody
            {

            					newCompositeNode(grammarAccess.getGrammarRuleAccess().getBodyRuleBodyParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_body_1_0=ruleRuleBody();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGrammarRuleRule());
            					}
            					set(
            						current,
            						"body",
            						lv_body_1_0,
            						"de.roma.cocktail.xtext.Lpp.RuleBody");
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
    // $ANTLR end "ruleGrammarRule"


    // $ANTLR start "entryRuleExtensionRule"
    // InternalLpp.g:1322:1: entryRuleExtensionRule returns [EObject current=null] : iv_ruleExtensionRule= ruleExtensionRule EOF ;
    public final EObject entryRuleExtensionRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtensionRule = null;


        try {
            // InternalLpp.g:1322:54: (iv_ruleExtensionRule= ruleExtensionRule EOF )
            // InternalLpp.g:1323:2: iv_ruleExtensionRule= ruleExtensionRule EOF
            {
             newCompositeNode(grammarAccess.getExtensionRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExtensionRule=ruleExtensionRule();

            state._fsp--;

             current =iv_ruleExtensionRule; 
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
    // $ANTLR end "entryRuleExtensionRule"


    // $ANTLR start "ruleExtensionRule"
    // InternalLpp.g:1329:1: ruleExtensionRule returns [EObject current=null] : ( ( (lv_name_0_0= ruleRuleName ) )? ( (lv_body_1_0= ruleRuleBody ) ) ) ;
    public final EObject ruleExtensionRule() throws RecognitionException {
        EObject current = null;

        EObject lv_name_0_0 = null;

        EObject lv_body_1_0 = null;



        	enterRule();

        try {
            // InternalLpp.g:1335:2: ( ( ( (lv_name_0_0= ruleRuleName ) )? ( (lv_body_1_0= ruleRuleBody ) ) ) )
            // InternalLpp.g:1336:2: ( ( (lv_name_0_0= ruleRuleName ) )? ( (lv_body_1_0= ruleRuleBody ) ) )
            {
            // InternalLpp.g:1336:2: ( ( (lv_name_0_0= ruleRuleName ) )? ( (lv_body_1_0= ruleRuleBody ) ) )
            // InternalLpp.g:1337:3: ( (lv_name_0_0= ruleRuleName ) )? ( (lv_body_1_0= ruleRuleBody ) )
            {
            // InternalLpp.g:1337:3: ( (lv_name_0_0= ruleRuleName ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID) ) {
                alt12=1;
            }
            else if ( (LA12_0==RULE_STRING) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalLpp.g:1338:4: (lv_name_0_0= ruleRuleName )
                    {
                    // InternalLpp.g:1338:4: (lv_name_0_0= ruleRuleName )
                    // InternalLpp.g:1339:5: lv_name_0_0= ruleRuleName
                    {

                    					newCompositeNode(grammarAccess.getExtensionRuleAccess().getNameRuleNameParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_11);
                    lv_name_0_0=ruleRuleName();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getExtensionRuleRule());
                    					}
                    					set(
                    						current,
                    						"name",
                    						lv_name_0_0,
                    						"de.roma.cocktail.xtext.Lpp.RuleName");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalLpp.g:1356:3: ( (lv_body_1_0= ruleRuleBody ) )
            // InternalLpp.g:1357:4: (lv_body_1_0= ruleRuleBody )
            {
            // InternalLpp.g:1357:4: (lv_body_1_0= ruleRuleBody )
            // InternalLpp.g:1358:5: lv_body_1_0= ruleRuleBody
            {

            					newCompositeNode(grammarAccess.getExtensionRuleAccess().getBodyRuleBodyParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_body_1_0=ruleRuleBody();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExtensionRuleRule());
            					}
            					set(
            						current,
            						"body",
            						lv_body_1_0,
            						"de.roma.cocktail.xtext.Lpp.RuleBody");
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
    // $ANTLR end "ruleExtensionRule"


    // $ANTLR start "entryRuleRuleBody"
    // InternalLpp.g:1379:1: entryRuleRuleBody returns [EObject current=null] : iv_ruleRuleBody= ruleRuleBody EOF ;
    public final EObject entryRuleRuleBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRuleBody = null;


        try {
            // InternalLpp.g:1379:49: (iv_ruleRuleBody= ruleRuleBody EOF )
            // InternalLpp.g:1380:2: iv_ruleRuleBody= ruleRuleBody EOF
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
    // InternalLpp.g:1386:1: ruleRuleBody returns [EObject current=null] : ( ( (lv_nodetype_0_0= ruleNodeType ) )? ( (lv_part_1_0= ruleNodePart ) )* (otherlv_2= 'PREC' ( (otherlv_3= RULE_ID ) ) )? (otherlv_4= '{' ( (lv_block_5_0= ruleCodeBlock ) ) otherlv_6= '}' )? ( (lv_extension_7_0= ruleExtensions ) )? otherlv_8= '.' ) ;
    public final EObject ruleRuleBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_nodetype_0_0 = null;

        EObject lv_part_1_0 = null;

        EObject lv_block_5_0 = null;

        EObject lv_extension_7_0 = null;



        	enterRule();

        try {
            // InternalLpp.g:1392:2: ( ( ( (lv_nodetype_0_0= ruleNodeType ) )? ( (lv_part_1_0= ruleNodePart ) )* (otherlv_2= 'PREC' ( (otherlv_3= RULE_ID ) ) )? (otherlv_4= '{' ( (lv_block_5_0= ruleCodeBlock ) ) otherlv_6= '}' )? ( (lv_extension_7_0= ruleExtensions ) )? otherlv_8= '.' ) )
            // InternalLpp.g:1393:2: ( ( (lv_nodetype_0_0= ruleNodeType ) )? ( (lv_part_1_0= ruleNodePart ) )* (otherlv_2= 'PREC' ( (otherlv_3= RULE_ID ) ) )? (otherlv_4= '{' ( (lv_block_5_0= ruleCodeBlock ) ) otherlv_6= '}' )? ( (lv_extension_7_0= ruleExtensions ) )? otherlv_8= '.' )
            {
            // InternalLpp.g:1393:2: ( ( (lv_nodetype_0_0= ruleNodeType ) )? ( (lv_part_1_0= ruleNodePart ) )* (otherlv_2= 'PREC' ( (otherlv_3= RULE_ID ) ) )? (otherlv_4= '{' ( (lv_block_5_0= ruleCodeBlock ) ) otherlv_6= '}' )? ( (lv_extension_7_0= ruleExtensions ) )? otherlv_8= '.' )
            // InternalLpp.g:1394:3: ( (lv_nodetype_0_0= ruleNodeType ) )? ( (lv_part_1_0= ruleNodePart ) )* (otherlv_2= 'PREC' ( (otherlv_3= RULE_ID ) ) )? (otherlv_4= '{' ( (lv_block_5_0= ruleCodeBlock ) ) otherlv_6= '}' )? ( (lv_extension_7_0= ruleExtensions ) )? otherlv_8= '.'
            {
            // InternalLpp.g:1394:3: ( (lv_nodetype_0_0= ruleNodeType ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==37||LA13_0==39||LA13_0==41) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalLpp.g:1395:4: (lv_nodetype_0_0= ruleNodeType )
                    {
                    // InternalLpp.g:1395:4: (lv_nodetype_0_0= ruleNodeType )
                    // InternalLpp.g:1396:5: lv_nodetype_0_0= ruleNodeType
                    {

                    					newCompositeNode(grammarAccess.getRuleBodyAccess().getNodetypeNodeTypeParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_12);
                    lv_nodetype_0_0=ruleNodeType();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getRuleBodyRule());
                    					}
                    					set(
                    						current,
                    						"nodetype",
                    						lv_nodetype_0_0,
                    						"de.roma.cocktail.xtext.Lpp.NodeType");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalLpp.g:1413:3: ( (lv_part_1_0= ruleNodePart ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID||LA14_0==RULE_STRING||LA14_0==46) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalLpp.g:1414:4: (lv_part_1_0= ruleNodePart )
            	    {
            	    // InternalLpp.g:1414:4: (lv_part_1_0= ruleNodePart )
            	    // InternalLpp.g:1415:5: lv_part_1_0= ruleNodePart
            	    {

            	    					newCompositeNode(grammarAccess.getRuleBodyAccess().getPartNodePartParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_12);
            	    lv_part_1_0=ruleNodePart();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRuleBodyRule());
            	    					}
            	    					add(
            	    						current,
            	    						"part",
            	    						lv_part_1_0,
            	    						"de.roma.cocktail.xtext.Lpp.NodePart");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            // InternalLpp.g:1432:3: (otherlv_2= 'PREC' ( (otherlv_3= RULE_ID ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==42) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalLpp.g:1433:4: otherlv_2= 'PREC' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,42,FOLLOW_13); 

                    				newLeafNode(otherlv_2, grammarAccess.getRuleBodyAccess().getPRECKeyword_2_0());
                    			
                    // InternalLpp.g:1437:4: ( (otherlv_3= RULE_ID ) )
                    // InternalLpp.g:1438:5: (otherlv_3= RULE_ID )
                    {
                    // InternalLpp.g:1438:5: (otherlv_3= RULE_ID )
                    // InternalLpp.g:1439:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRuleBodyRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_14); 

                    						newLeafNode(otherlv_3, grammarAccess.getRuleBodyAccess().getTokenPrecedenceRowCrossReference_2_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalLpp.g:1451:3: (otherlv_4= '{' ( (lv_block_5_0= ruleCodeBlock ) ) otherlv_6= '}' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==14) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalLpp.g:1452:4: otherlv_4= '{' ( (lv_block_5_0= ruleCodeBlock ) ) otherlv_6= '}'
                    {
                    otherlv_4=(Token)match(input,14,FOLLOW_6); 

                    				newLeafNode(otherlv_4, grammarAccess.getRuleBodyAccess().getLeftCurlyBracketKeyword_3_0());
                    			
                    // InternalLpp.g:1456:4: ( (lv_block_5_0= ruleCodeBlock ) )
                    // InternalLpp.g:1457:5: (lv_block_5_0= ruleCodeBlock )
                    {
                    // InternalLpp.g:1457:5: (lv_block_5_0= ruleCodeBlock )
                    // InternalLpp.g:1458:6: lv_block_5_0= ruleCodeBlock
                    {

                    						newCompositeNode(grammarAccess.getRuleBodyAccess().getBlockCodeBlockParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_block_5_0=ruleCodeBlock();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRuleBodyRule());
                    						}
                    						set(
                    							current,
                    							"block",
                    							lv_block_5_0,
                    							"de.roma.cocktail.xtext.Lpp.CodeBlock");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_6=(Token)match(input,15,FOLLOW_15); 

                    				newLeafNode(otherlv_6, grammarAccess.getRuleBodyAccess().getRightCurlyBracketKeyword_3_2());
                    			

                    }
                    break;

            }

            // InternalLpp.g:1480:3: ( (lv_extension_7_0= ruleExtensions ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==32) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalLpp.g:1481:4: (lv_extension_7_0= ruleExtensions )
                    {
                    // InternalLpp.g:1481:4: (lv_extension_7_0= ruleExtensions )
                    // InternalLpp.g:1482:5: lv_extension_7_0= ruleExtensions
                    {

                    					newCompositeNode(grammarAccess.getRuleBodyAccess().getExtensionExtensionsParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_16);
                    lv_extension_7_0=ruleExtensions();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getRuleBodyRule());
                    					}
                    					set(
                    						current,
                    						"extension",
                    						lv_extension_7_0,
                    						"de.roma.cocktail.xtext.Lpp.Extensions");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,26,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getRuleBodyAccess().getFullStopKeyword_5());
            		

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


    // $ANTLR start "entryRuleExtensions"
    // InternalLpp.g:1507:1: entryRuleExtensions returns [EObject current=null] : iv_ruleExtensions= ruleExtensions EOF ;
    public final EObject entryRuleExtensions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtensions = null;


        try {
            // InternalLpp.g:1507:51: (iv_ruleExtensions= ruleExtensions EOF )
            // InternalLpp.g:1508:2: iv_ruleExtensions= ruleExtensions EOF
            {
             newCompositeNode(grammarAccess.getExtensionsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExtensions=ruleExtensions();

            state._fsp--;

             current =iv_ruleExtensions; 
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
    // $ANTLR end "entryRuleExtensions"


    // $ANTLR start "ruleExtensions"
    // InternalLpp.g:1514:1: ruleExtensions returns [EObject current=null] : (otherlv_0= '<' ( (lv_nodes_1_0= ruleExtensionRule ) )* otherlv_2= '>' ) ;
    public final EObject ruleExtensions() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_nodes_1_0 = null;



        	enterRule();

        try {
            // InternalLpp.g:1520:2: ( (otherlv_0= '<' ( (lv_nodes_1_0= ruleExtensionRule ) )* otherlv_2= '>' ) )
            // InternalLpp.g:1521:2: (otherlv_0= '<' ( (lv_nodes_1_0= ruleExtensionRule ) )* otherlv_2= '>' )
            {
            // InternalLpp.g:1521:2: (otherlv_0= '<' ( (lv_nodes_1_0= ruleExtensionRule ) )* otherlv_2= '>' )
            // InternalLpp.g:1522:3: otherlv_0= '<' ( (lv_nodes_1_0= ruleExtensionRule ) )* otherlv_2= '>'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getExtensionsAccess().getLessThanSignKeyword_0());
            		
            // InternalLpp.g:1526:3: ( (lv_nodes_1_0= ruleExtensionRule ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_ID||LA18_0==RULE_STRING||LA18_0==14||LA18_0==26||LA18_0==32||LA18_0==37||LA18_0==39||(LA18_0>=41 && LA18_0<=42)||LA18_0==46) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalLpp.g:1527:4: (lv_nodes_1_0= ruleExtensionRule )
            	    {
            	    // InternalLpp.g:1527:4: (lv_nodes_1_0= ruleExtensionRule )
            	    // InternalLpp.g:1528:5: lv_nodes_1_0= ruleExtensionRule
            	    {

            	    					newCompositeNode(grammarAccess.getExtensionsAccess().getNodesExtensionRuleParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_17);
            	    lv_nodes_1_0=ruleExtensionRule();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getExtensionsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"nodes",
            	    						lv_nodes_1_0,
            	    						"de.roma.cocktail.xtext.Lpp.ExtensionRule");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            otherlv_2=(Token)match(input,31,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getExtensionsAccess().getGreaterThanSignKeyword_2());
            		

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
    // $ANTLR end "ruleExtensions"


    // $ANTLR start "entryRuleNodePart"
    // InternalLpp.g:1553:1: entryRuleNodePart returns [EObject current=null] : iv_ruleNodePart= ruleNodePart EOF ;
    public final EObject entryRuleNodePart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNodePart = null;


        try {
            // InternalLpp.g:1553:49: (iv_ruleNodePart= ruleNodePart EOF )
            // InternalLpp.g:1554:2: iv_ruleNodePart= ruleNodePart EOF
            {
             newCompositeNode(grammarAccess.getNodePartRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNodePart=ruleNodePart();

            state._fsp--;

             current =iv_ruleNodePart; 
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
    // $ANTLR end "entryRuleNodePart"


    // $ANTLR start "ruleNodePart"
    // InternalLpp.g:1560:1: ruleNodePart returns [EObject current=null] : ( ( (lv_child_0_0= ruleNode ) ) | ( (lv_attribute_1_0= ruleNodeAttribute ) ) ) ;
    public final EObject ruleNodePart() throws RecognitionException {
        EObject current = null;

        EObject lv_child_0_0 = null;

        EObject lv_attribute_1_0 = null;



        	enterRule();

        try {
            // InternalLpp.g:1566:2: ( ( ( (lv_child_0_0= ruleNode ) ) | ( (lv_attribute_1_0= ruleNodeAttribute ) ) ) )
            // InternalLpp.g:1567:2: ( ( (lv_child_0_0= ruleNode ) ) | ( (lv_attribute_1_0= ruleNodeAttribute ) ) )
            {
            // InternalLpp.g:1567:2: ( ( (lv_child_0_0= ruleNode ) ) | ( (lv_attribute_1_0= ruleNodeAttribute ) ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_ID||LA19_0==RULE_STRING) ) {
                alt19=1;
            }
            else if ( (LA19_0==46) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalLpp.g:1568:3: ( (lv_child_0_0= ruleNode ) )
                    {
                    // InternalLpp.g:1568:3: ( (lv_child_0_0= ruleNode ) )
                    // InternalLpp.g:1569:4: (lv_child_0_0= ruleNode )
                    {
                    // InternalLpp.g:1569:4: (lv_child_0_0= ruleNode )
                    // InternalLpp.g:1570:5: lv_child_0_0= ruleNode
                    {

                    					newCompositeNode(grammarAccess.getNodePartAccess().getChildNodeParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_child_0_0=ruleNode();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getNodePartRule());
                    					}
                    					set(
                    						current,
                    						"child",
                    						lv_child_0_0,
                    						"de.roma.cocktail.xtext.Lpp.Node");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalLpp.g:1588:3: ( (lv_attribute_1_0= ruleNodeAttribute ) )
                    {
                    // InternalLpp.g:1588:3: ( (lv_attribute_1_0= ruleNodeAttribute ) )
                    // InternalLpp.g:1589:4: (lv_attribute_1_0= ruleNodeAttribute )
                    {
                    // InternalLpp.g:1589:4: (lv_attribute_1_0= ruleNodeAttribute )
                    // InternalLpp.g:1590:5: lv_attribute_1_0= ruleNodeAttribute
                    {

                    					newCompositeNode(grammarAccess.getNodePartAccess().getAttributeNodeAttributeParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_attribute_1_0=ruleNodeAttribute();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getNodePartRule());
                    					}
                    					set(
                    						current,
                    						"attribute",
                    						lv_attribute_1_0,
                    						"de.roma.cocktail.xtext.Lpp.NodeAttribute");
                    					afterParserOrEnumRuleCall();
                    				

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
    // $ANTLR end "ruleNodePart"


    // $ANTLR start "entryRuleNode"
    // InternalLpp.g:1611:1: entryRuleNode returns [EObject current=null] : iv_ruleNode= ruleNode EOF ;
    public final EObject entryRuleNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNode = null;


        try {
            // InternalLpp.g:1611:45: (iv_ruleNode= ruleNode EOF )
            // InternalLpp.g:1612:2: iv_ruleNode= ruleNode EOF
            {
             newCompositeNode(grammarAccess.getNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNode=ruleNode();

            state._fsp--;

             current =iv_ruleNode; 
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
    // $ANTLR end "entryRuleNode"


    // $ANTLR start "ruleNode"
    // InternalLpp.g:1618:1: ruleNode returns [EObject current=null] : ( ( ( (lv_selector_0_0= RULE_ID ) ) otherlv_1= ':' )? ( ( (lv_name_2_1= RULE_ID | lv_name_2_2= RULE_STRING ) ) ) ) ;
    public final EObject ruleNode() throws RecognitionException {
        EObject current = null;

        Token lv_selector_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_1=null;
        Token lv_name_2_2=null;


        	enterRule();

        try {
            // InternalLpp.g:1624:2: ( ( ( ( (lv_selector_0_0= RULE_ID ) ) otherlv_1= ':' )? ( ( (lv_name_2_1= RULE_ID | lv_name_2_2= RULE_STRING ) ) ) ) )
            // InternalLpp.g:1625:2: ( ( ( (lv_selector_0_0= RULE_ID ) ) otherlv_1= ':' )? ( ( (lv_name_2_1= RULE_ID | lv_name_2_2= RULE_STRING ) ) ) )
            {
            // InternalLpp.g:1625:2: ( ( ( (lv_selector_0_0= RULE_ID ) ) otherlv_1= ':' )? ( ( (lv_name_2_1= RULE_ID | lv_name_2_2= RULE_STRING ) ) ) )
            // InternalLpp.g:1626:3: ( ( (lv_selector_0_0= RULE_ID ) ) otherlv_1= ':' )? ( ( (lv_name_2_1= RULE_ID | lv_name_2_2= RULE_STRING ) ) )
            {
            // InternalLpp.g:1626:3: ( ( (lv_selector_0_0= RULE_ID ) ) otherlv_1= ':' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_ID) ) {
                int LA20_1 = input.LA(2);

                if ( (LA20_1==37) ) {
                    alt20=1;
                }
            }
            switch (alt20) {
                case 1 :
                    // InternalLpp.g:1627:4: ( (lv_selector_0_0= RULE_ID ) ) otherlv_1= ':'
                    {
                    // InternalLpp.g:1627:4: ( (lv_selector_0_0= RULE_ID ) )
                    // InternalLpp.g:1628:5: (lv_selector_0_0= RULE_ID )
                    {
                    // InternalLpp.g:1628:5: (lv_selector_0_0= RULE_ID )
                    // InternalLpp.g:1629:6: lv_selector_0_0= RULE_ID
                    {
                    lv_selector_0_0=(Token)match(input,RULE_ID,FOLLOW_18); 

                    						newLeafNode(lv_selector_0_0, grammarAccess.getNodeAccess().getSelectorIDTerminalRuleCall_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNodeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"selector",
                    							lv_selector_0_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    otherlv_1=(Token)match(input,37,FOLLOW_19); 

                    				newLeafNode(otherlv_1, grammarAccess.getNodeAccess().getColonKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalLpp.g:1650:3: ( ( (lv_name_2_1= RULE_ID | lv_name_2_2= RULE_STRING ) ) )
            // InternalLpp.g:1651:4: ( (lv_name_2_1= RULE_ID | lv_name_2_2= RULE_STRING ) )
            {
            // InternalLpp.g:1651:4: ( (lv_name_2_1= RULE_ID | lv_name_2_2= RULE_STRING ) )
            // InternalLpp.g:1652:5: (lv_name_2_1= RULE_ID | lv_name_2_2= RULE_STRING )
            {
            // InternalLpp.g:1652:5: (lv_name_2_1= RULE_ID | lv_name_2_2= RULE_STRING )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_ID) ) {
                alt21=1;
            }
            else if ( (LA21_0==RULE_STRING) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalLpp.g:1653:6: lv_name_2_1= RULE_ID
                    {
                    lv_name_2_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(lv_name_2_1, grammarAccess.getNodeAccess().getNameIDTerminalRuleCall_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNodeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_2_1,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }
                    break;
                case 2 :
                    // InternalLpp.g:1668:6: lv_name_2_2= RULE_STRING
                    {
                    lv_name_2_2=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_name_2_2, grammarAccess.getNodeAccess().getNameSTRINGTerminalRuleCall_1_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNodeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_2_2,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }
                    break;

            }


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
    // $ANTLR end "ruleNode"


    // $ANTLR start "entryRuleNodeAttribute"
    // InternalLpp.g:1689:1: entryRuleNodeAttribute returns [EObject current=null] : iv_ruleNodeAttribute= ruleNodeAttribute EOF ;
    public final EObject entryRuleNodeAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNodeAttribute = null;


        try {
            // InternalLpp.g:1689:54: (iv_ruleNodeAttribute= ruleNodeAttribute EOF )
            // InternalLpp.g:1690:2: iv_ruleNodeAttribute= ruleNodeAttribute EOF
            {
             newCompositeNode(grammarAccess.getNodeAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNodeAttribute=ruleNodeAttribute();

            state._fsp--;

             current =iv_ruleNodeAttribute; 
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
    // $ANTLR end "entryRuleNodeAttribute"


    // $ANTLR start "ruleNodeAttribute"
    // InternalLpp.g:1696:1: ruleNodeAttribute returns [EObject current=null] : (otherlv_0= '[' ( (lv_attribute_1_0= RULE_ID ) ) (otherlv_2= ':' ( (lv_type_3_0= RULE_ID ) ) )? otherlv_4= ']' ) ;
    public final EObject ruleNodeAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_attribute_1_0=null;
        Token otherlv_2=null;
        Token lv_type_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalLpp.g:1702:2: ( (otherlv_0= '[' ( (lv_attribute_1_0= RULE_ID ) ) (otherlv_2= ':' ( (lv_type_3_0= RULE_ID ) ) )? otherlv_4= ']' ) )
            // InternalLpp.g:1703:2: (otherlv_0= '[' ( (lv_attribute_1_0= RULE_ID ) ) (otherlv_2= ':' ( (lv_type_3_0= RULE_ID ) ) )? otherlv_4= ']' )
            {
            // InternalLpp.g:1703:2: (otherlv_0= '[' ( (lv_attribute_1_0= RULE_ID ) ) (otherlv_2= ':' ( (lv_type_3_0= RULE_ID ) ) )? otherlv_4= ']' )
            // InternalLpp.g:1704:3: otherlv_0= '[' ( (lv_attribute_1_0= RULE_ID ) ) (otherlv_2= ':' ( (lv_type_3_0= RULE_ID ) ) )? otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,46,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getNodeAttributeAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalLpp.g:1708:3: ( (lv_attribute_1_0= RULE_ID ) )
            // InternalLpp.g:1709:4: (lv_attribute_1_0= RULE_ID )
            {
            // InternalLpp.g:1709:4: (lv_attribute_1_0= RULE_ID )
            // InternalLpp.g:1710:5: lv_attribute_1_0= RULE_ID
            {
            lv_attribute_1_0=(Token)match(input,RULE_ID,FOLLOW_20); 

            					newLeafNode(lv_attribute_1_0, grammarAccess.getNodeAttributeAccess().getAttributeIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNodeAttributeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"attribute",
            						lv_attribute_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalLpp.g:1726:3: (otherlv_2= ':' ( (lv_type_3_0= RULE_ID ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==37) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalLpp.g:1727:4: otherlv_2= ':' ( (lv_type_3_0= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,37,FOLLOW_13); 

                    				newLeafNode(otherlv_2, grammarAccess.getNodeAttributeAccess().getColonKeyword_2_0());
                    			
                    // InternalLpp.g:1731:4: ( (lv_type_3_0= RULE_ID ) )
                    // InternalLpp.g:1732:5: (lv_type_3_0= RULE_ID )
                    {
                    // InternalLpp.g:1732:5: (lv_type_3_0= RULE_ID )
                    // InternalLpp.g:1733:6: lv_type_3_0= RULE_ID
                    {
                    lv_type_3_0=(Token)match(input,RULE_ID,FOLLOW_21); 

                    						newLeafNode(lv_type_3_0, grammarAccess.getNodeAttributeAccess().getTypeIDTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNodeAttributeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"type",
                    							lv_type_3_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,47,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getNodeAttributeAccess().getRightSquareBracketKeyword_3());
            		

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
    // $ANTLR end "ruleNodeAttribute"


    // $ANTLR start "entryRuleRuleName"
    // InternalLpp.g:1758:1: entryRuleRuleName returns [EObject current=null] : iv_ruleRuleName= ruleRuleName EOF ;
    public final EObject entryRuleRuleName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRuleName = null;


        try {
            // InternalLpp.g:1758:49: (iv_ruleRuleName= ruleRuleName EOF )
            // InternalLpp.g:1759:2: iv_ruleRuleName= ruleRuleName EOF
            {
             newCompositeNode(grammarAccess.getRuleNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRuleName=ruleRuleName();

            state._fsp--;

             current =iv_ruleRuleName; 
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
    // $ANTLR end "entryRuleRuleName"


    // $ANTLR start "ruleRuleName"
    // InternalLpp.g:1765:1: ruleRuleName returns [EObject current=null] : ( ( (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING ) ) ) ;
    public final EObject ruleRuleName() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_1=null;
        Token lv_name_0_2=null;


        	enterRule();

        try {
            // InternalLpp.g:1771:2: ( ( ( (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING ) ) ) )
            // InternalLpp.g:1772:2: ( ( (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING ) ) )
            {
            // InternalLpp.g:1772:2: ( ( (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING ) ) )
            // InternalLpp.g:1773:3: ( (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING ) )
            {
            // InternalLpp.g:1773:3: ( (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING ) )
            // InternalLpp.g:1774:4: (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING )
            {
            // InternalLpp.g:1774:4: (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_ID) ) {
                alt23=1;
            }
            else if ( (LA23_0==RULE_STRING) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalLpp.g:1775:5: lv_name_0_1= RULE_ID
                    {
                    lv_name_0_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(lv_name_0_1, grammarAccess.getRuleNameAccess().getNameIDTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getRuleNameRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_0_1,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }
                    break;
                case 2 :
                    // InternalLpp.g:1790:5: lv_name_0_2= RULE_STRING
                    {
                    lv_name_0_2=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    					newLeafNode(lv_name_0_2, grammarAccess.getRuleNameAccess().getNameSTRINGTerminalRuleCall_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getRuleNameRule());
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
    // $ANTLR end "ruleRuleName"


    // $ANTLR start "entryRuleNodeType"
    // InternalLpp.g:1810:1: entryRuleNodeType returns [String current=null] : iv_ruleNodeType= ruleNodeType EOF ;
    public final String entryRuleNodeType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNodeType = null;


        try {
            // InternalLpp.g:1810:48: (iv_ruleNodeType= ruleNodeType EOF )
            // InternalLpp.g:1811:2: iv_ruleNodeType= ruleNodeType EOF
            {
             newCompositeNode(grammarAccess.getNodeTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNodeType=ruleNodeType();

            state._fsp--;

             current =iv_ruleNodeType.getText(); 
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
    // $ANTLR end "entryRuleNodeType"


    // $ANTLR start "ruleNodeType"
    // InternalLpp.g:1817:1: ruleNodeType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '=' | kw= ':' | kw= ':=' ) ;
    public final AntlrDatatypeRuleToken ruleNodeType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalLpp.g:1823:2: ( (kw= '=' | kw= ':' | kw= ':=' ) )
            // InternalLpp.g:1824:2: (kw= '=' | kw= ':' | kw= ':=' )
            {
            // InternalLpp.g:1824:2: (kw= '=' | kw= ':' | kw= ':=' )
            int alt24=3;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt24=1;
                }
                break;
            case 37:
                {
                alt24=2;
                }
                break;
            case 41:
                {
                alt24=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // InternalLpp.g:1825:3: kw= '='
                    {
                    kw=(Token)match(input,39,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getNodeTypeAccess().getEqualsSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalLpp.g:1831:3: kw= ':'
                    {
                    kw=(Token)match(input,37,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getNodeTypeAccess().getColonKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalLpp.g:1837:3: kw= ':='
                    {
                    kw=(Token)match(input,41,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getNodeTypeAccess().getColonEqualsSignKeyword_2());
                    		

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
    // $ANTLR end "ruleNodeType"


    // $ANTLR start "rulePrecedenceType"
    // InternalLpp.g:1846:1: rulePrecedenceType returns [Enumerator current=null] : ( (enumLiteral_0= 'NONE' ) | (enumLiteral_1= 'LEFT' ) | (enumLiteral_2= 'RIGHT' ) ) ;
    public final Enumerator rulePrecedenceType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalLpp.g:1852:2: ( ( (enumLiteral_0= 'NONE' ) | (enumLiteral_1= 'LEFT' ) | (enumLiteral_2= 'RIGHT' ) ) )
            // InternalLpp.g:1853:2: ( (enumLiteral_0= 'NONE' ) | (enumLiteral_1= 'LEFT' ) | (enumLiteral_2= 'RIGHT' ) )
            {
            // InternalLpp.g:1853:2: ( (enumLiteral_0= 'NONE' ) | (enumLiteral_1= 'LEFT' ) | (enumLiteral_2= 'RIGHT' ) )
            int alt25=3;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt25=1;
                }
                break;
            case 49:
                {
                alt25=2;
                }
                break;
            case 50:
                {
                alt25=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // InternalLpp.g:1854:3: (enumLiteral_0= 'NONE' )
                    {
                    // InternalLpp.g:1854:3: (enumLiteral_0= 'NONE' )
                    // InternalLpp.g:1855:4: enumLiteral_0= 'NONE'
                    {
                    enumLiteral_0=(Token)match(input,48,FOLLOW_2); 

                    				current = grammarAccess.getPrecedenceTypeAccess().getNONEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getPrecedenceTypeAccess().getNONEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalLpp.g:1862:3: (enumLiteral_1= 'LEFT' )
                    {
                    // InternalLpp.g:1862:3: (enumLiteral_1= 'LEFT' )
                    // InternalLpp.g:1863:4: enumLiteral_1= 'LEFT'
                    {
                    enumLiteral_1=(Token)match(input,49,FOLLOW_2); 

                    				current = grammarAccess.getPrecedenceTypeAccess().getLEFTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getPrecedenceTypeAccess().getLEFTEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalLpp.g:1870:3: (enumLiteral_2= 'RIGHT' )
                    {
                    // InternalLpp.g:1870:3: (enumLiteral_2= 'RIGHT' )
                    // InternalLpp.g:1871:4: enumLiteral_2= 'RIGHT'
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
    static final String dfa_1s = "\14\uffff";
    static final String dfa_2s = "\1\13\13\uffff";
    static final String dfa_3s = "\1\55\13\uffff";
    static final String dfa_4s = "\1\uffff\1\13\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12";
    static final String dfa_5s = "\1\0\13\uffff}>";
    static final String[] dfa_6s = {
            "\1\2\1\3\1\4\2\uffff\1\5\1\6\1\7\1\10\1\11\25\uffff\1\12\1\13\2\1",
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
            return "()* loopback of 86:6: ( ({...}? => ( ({...}? => ( (lv_scanner_1_0= ruleScannerName ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_parser_2_0= ruleParserName ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_importBlock_3_0= ruleImport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_exportBlock_4_0= ruleExport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_globalBlock_5_0= ruleGlobal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_localBlock_6_0= ruleLocal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_beginBlock_7_0= ruleBegin ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_closeBlock_8_0= ruleClose ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_precedence_9_0= rulePrecedence ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_start_10_0= ruleStartSymbols ) ) ) ) ) )*";
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

                        else if ( LA1_0 == 11 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserAccess().getUnorderedGroup_0(), 0) ) {s = 2;}

                        else if ( LA1_0 == 12 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserAccess().getUnorderedGroup_0(), 1) ) {s = 3;}

                        else if ( LA1_0 == 13 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserAccess().getUnorderedGroup_0(), 2) ) {s = 4;}

                        else if ( LA1_0 == 16 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserAccess().getUnorderedGroup_0(), 3) ) {s = 5;}

                        else if ( LA1_0 == 17 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserAccess().getUnorderedGroup_0(), 4) ) {s = 6;}

                        else if ( LA1_0 == 18 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserAccess().getUnorderedGroup_0(), 5) ) {s = 7;}

                        else if ( LA1_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserAccess().getUnorderedGroup_0(), 6) ) {s = 8;}

                        else if ( LA1_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserAccess().getUnorderedGroup_0(), 7) ) {s = 9;}

                        else if ( LA1_0 == 42 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserAccess().getUnorderedGroup_0(), 8) ) {s = 10;}

                        else if ( LA1_0 == 43 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserAccess().getUnorderedGroup_0(), 9) ) {s = 11;}

                         
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00003C00001F3800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000003FFFFE0C0F0L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000003FFFFE040F2L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0007000000000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000052L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x000046A104004050L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000440104004050L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000104004000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000104000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000046A184004050L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000802000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000800000000000L});

}
