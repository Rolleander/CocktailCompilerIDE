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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalScannerParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_ANY_OTHER", "'{'", "'}'", "'+'", "'-'", "'('", "')'", "'*'", "'.'", "'/'", "'\\\\'", "'|'", "'?'", "'>'", "'<'", "'#'", "'$'", "'%'", "';'", "':'", "'!'", "'='", "','", "'SCANNER'", "'EXPORT'", "'GLOBAL'", "'LOCAL'", "'DEFAULT'", "'EOF'", "'BEGIN'", "'CLOSE'", "'DEFINE'", "'START'", "'RULE'", "'RULES'", "'\"'", "'\\''", "'NOT'", "'STD'"
    };
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


        public InternalScannerParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalScannerParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalScannerParser.tokenNames; }
    public String getGrammarFileName() { return "InternalScanner.g"; }



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




    // $ANTLR start "entryRuleModel"
    // InternalScanner.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalScanner.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalScanner.g:65:2: iv_ruleModel= ruleModel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModelRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModel; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalScanner.g:71:1: ruleModel returns [EObject current=null] : ( ( (lv_scanner_0_0= ruleScanner ) ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_export_2_0= ruleExport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_global_3_0= ruleGlobal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_local_4_0= ruleLocal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_default_5_0= ruleDefault ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_eof_6_0= ruleEof ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_begin_7_0= ruleBegin ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_close_8_0= ruleClose ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_define_9_0= ruleDefine ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_states_10_0= ruleStartStates ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_rules_11_0= ruleRule ) ) ) ) ) )+ {...}?) ) ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_scanner_0_0 = null;

        EObject lv_export_2_0 = null;

        EObject lv_global_3_0 = null;

        EObject lv_local_4_0 = null;

        EObject lv_default_5_0 = null;

        EObject lv_eof_6_0 = null;

        EObject lv_begin_7_0 = null;

        EObject lv_close_8_0 = null;

        EObject lv_define_9_0 = null;

        EObject lv_states_10_0 = null;

        EObject lv_rules_11_0 = null;



        	enterRule();

        try {
            // InternalScanner.g:77:2: ( ( ( (lv_scanner_0_0= ruleScanner ) ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_export_2_0= ruleExport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_global_3_0= ruleGlobal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_local_4_0= ruleLocal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_default_5_0= ruleDefault ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_eof_6_0= ruleEof ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_begin_7_0= ruleBegin ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_close_8_0= ruleClose ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_define_9_0= ruleDefine ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_states_10_0= ruleStartStates ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_rules_11_0= ruleRule ) ) ) ) ) )+ {...}?) ) ) ) )
            // InternalScanner.g:78:2: ( ( (lv_scanner_0_0= ruleScanner ) ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_export_2_0= ruleExport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_global_3_0= ruleGlobal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_local_4_0= ruleLocal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_default_5_0= ruleDefault ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_eof_6_0= ruleEof ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_begin_7_0= ruleBegin ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_close_8_0= ruleClose ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_define_9_0= ruleDefine ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_states_10_0= ruleStartStates ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_rules_11_0= ruleRule ) ) ) ) ) )+ {...}?) ) ) )
            {
            // InternalScanner.g:78:2: ( ( (lv_scanner_0_0= ruleScanner ) ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_export_2_0= ruleExport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_global_3_0= ruleGlobal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_local_4_0= ruleLocal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_default_5_0= ruleDefault ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_eof_6_0= ruleEof ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_begin_7_0= ruleBegin ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_close_8_0= ruleClose ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_define_9_0= ruleDefine ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_states_10_0= ruleStartStates ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_rules_11_0= ruleRule ) ) ) ) ) )+ {...}?) ) ) )
            // InternalScanner.g:79:3: ( (lv_scanner_0_0= ruleScanner ) ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_export_2_0= ruleExport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_global_3_0= ruleGlobal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_local_4_0= ruleLocal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_default_5_0= ruleDefault ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_eof_6_0= ruleEof ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_begin_7_0= ruleBegin ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_close_8_0= ruleClose ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_define_9_0= ruleDefine ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_states_10_0= ruleStartStates ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_rules_11_0= ruleRule ) ) ) ) ) )+ {...}?) ) )
            {
            // InternalScanner.g:79:3: ( (lv_scanner_0_0= ruleScanner ) )
            // InternalScanner.g:80:4: (lv_scanner_0_0= ruleScanner )
            {
            // InternalScanner.g:80:4: (lv_scanner_0_0= ruleScanner )
            // InternalScanner.g:81:5: lv_scanner_0_0= ruleScanner
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getModelAccess().getScannerScannerParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_3);
            lv_scanner_0_0=ruleScanner();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getModelRule());
              					}
              					set(
              						current,
              						"scanner",
              						lv_scanner_0_0,
              						"org.xtext.cocktail.Scanner.Scanner");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalScanner.g:98:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_export_2_0= ruleExport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_global_3_0= ruleGlobal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_local_4_0= ruleLocal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_default_5_0= ruleDefault ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_eof_6_0= ruleEof ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_begin_7_0= ruleBegin ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_close_8_0= ruleClose ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_define_9_0= ruleDefine ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_states_10_0= ruleStartStates ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_rules_11_0= ruleRule ) ) ) ) ) )+ {...}?) ) )
            // InternalScanner.g:99:4: ( ( ( ({...}? => ( ({...}? => ( (lv_export_2_0= ruleExport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_global_3_0= ruleGlobal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_local_4_0= ruleLocal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_default_5_0= ruleDefault ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_eof_6_0= ruleEof ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_begin_7_0= ruleBegin ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_close_8_0= ruleClose ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_define_9_0= ruleDefine ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_states_10_0= ruleStartStates ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_rules_11_0= ruleRule ) ) ) ) ) )+ {...}?) )
            {
            // InternalScanner.g:99:4: ( ( ( ({...}? => ( ({...}? => ( (lv_export_2_0= ruleExport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_global_3_0= ruleGlobal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_local_4_0= ruleLocal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_default_5_0= ruleDefault ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_eof_6_0= ruleEof ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_begin_7_0= ruleBegin ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_close_8_0= ruleClose ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_define_9_0= ruleDefine ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_states_10_0= ruleStartStates ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_rules_11_0= ruleRule ) ) ) ) ) )+ {...}?) )
            // InternalScanner.g:100:5: ( ( ({...}? => ( ({...}? => ( (lv_export_2_0= ruleExport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_global_3_0= ruleGlobal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_local_4_0= ruleLocal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_default_5_0= ruleDefault ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_eof_6_0= ruleEof ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_begin_7_0= ruleBegin ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_close_8_0= ruleClose ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_define_9_0= ruleDefine ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_states_10_0= ruleStartStates ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_rules_11_0= ruleRule ) ) ) ) ) )+ {...}?)
            {
            getUnorderedGroupHelper().enter(grammarAccess.getModelAccess().getUnorderedGroup_1());
            // InternalScanner.g:103:5: ( ( ({...}? => ( ({...}? => ( (lv_export_2_0= ruleExport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_global_3_0= ruleGlobal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_local_4_0= ruleLocal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_default_5_0= ruleDefault ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_eof_6_0= ruleEof ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_begin_7_0= ruleBegin ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_close_8_0= ruleClose ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_define_9_0= ruleDefine ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_states_10_0= ruleStartStates ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_rules_11_0= ruleRule ) ) ) ) ) )+ {...}?)
            // InternalScanner.g:104:6: ( ({...}? => ( ({...}? => ( (lv_export_2_0= ruleExport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_global_3_0= ruleGlobal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_local_4_0= ruleLocal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_default_5_0= ruleDefault ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_eof_6_0= ruleEof ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_begin_7_0= ruleBegin ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_close_8_0= ruleClose ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_define_9_0= ruleDefine ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_states_10_0= ruleStartStates ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_rules_11_0= ruleRule ) ) ) ) ) )+ {...}?
            {
            // InternalScanner.g:104:6: ( ({...}? => ( ({...}? => ( (lv_export_2_0= ruleExport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_global_3_0= ruleGlobal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_local_4_0= ruleLocal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_default_5_0= ruleDefault ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_eof_6_0= ruleEof ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_begin_7_0= ruleBegin ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_close_8_0= ruleClose ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_define_9_0= ruleDefine ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_states_10_0= ruleStartStates ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_rules_11_0= ruleRule ) ) ) ) ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=11;
                alt1 = dfa1.predict(input);
                switch (alt1) {
            	case 1 :
            	    // InternalScanner.g:105:4: ({...}? => ( ({...}? => ( (lv_export_2_0= ruleExport ) ) ) ) )
            	    {
            	    // InternalScanner.g:105:4: ({...}? => ( ({...}? => ( (lv_export_2_0= ruleExport ) ) ) ) )
            	    // InternalScanner.g:106:5: {...}? => ( ({...}? => ( (lv_export_2_0= ruleExport ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_1(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleModel", "getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalScanner.g:106:102: ( ({...}? => ( (lv_export_2_0= ruleExport ) ) ) )
            	    // InternalScanner.g:107:6: ({...}? => ( (lv_export_2_0= ruleExport ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getModelAccess().getUnorderedGroup_1(), 0);
            	    // InternalScanner.g:110:9: ({...}? => ( (lv_export_2_0= ruleExport ) ) )
            	    // InternalScanner.g:110:10: {...}? => ( (lv_export_2_0= ruleExport ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleModel", "true");
            	    }
            	    // InternalScanner.g:110:19: ( (lv_export_2_0= ruleExport ) )
            	    // InternalScanner.g:110:20: (lv_export_2_0= ruleExport )
            	    {
            	    // InternalScanner.g:110:20: (lv_export_2_0= ruleExport )
            	    // InternalScanner.g:111:10: lv_export_2_0= ruleExport
            	    {
            	    if ( state.backtracking==0 ) {

            	      										newCompositeNode(grammarAccess.getModelAccess().getExportExportParserRuleCall_1_0_0());
            	      									
            	    }
            	    pushFollow(FOLLOW_4);
            	    lv_export_2_0=ruleExport();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      										if (current==null) {
            	      											current = createModelElementForParent(grammarAccess.getModelRule());
            	      										}
            	      										set(
            	      											current,
            	      											"export",
            	      											lv_export_2_0,
            	      											"org.xtext.cocktail.Scanner.Export");
            	      										afterParserOrEnumRuleCall();
            	      									
            	    }

            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getModelAccess().getUnorderedGroup_1());

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalScanner.g:133:4: ({...}? => ( ({...}? => ( (lv_global_3_0= ruleGlobal ) ) ) ) )
            	    {
            	    // InternalScanner.g:133:4: ({...}? => ( ({...}? => ( (lv_global_3_0= ruleGlobal ) ) ) ) )
            	    // InternalScanner.g:134:5: {...}? => ( ({...}? => ( (lv_global_3_0= ruleGlobal ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_1(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleModel", "getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalScanner.g:134:102: ( ({...}? => ( (lv_global_3_0= ruleGlobal ) ) ) )
            	    // InternalScanner.g:135:6: ({...}? => ( (lv_global_3_0= ruleGlobal ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getModelAccess().getUnorderedGroup_1(), 1);
            	    // InternalScanner.g:138:9: ({...}? => ( (lv_global_3_0= ruleGlobal ) ) )
            	    // InternalScanner.g:138:10: {...}? => ( (lv_global_3_0= ruleGlobal ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleModel", "true");
            	    }
            	    // InternalScanner.g:138:19: ( (lv_global_3_0= ruleGlobal ) )
            	    // InternalScanner.g:138:20: (lv_global_3_0= ruleGlobal )
            	    {
            	    // InternalScanner.g:138:20: (lv_global_3_0= ruleGlobal )
            	    // InternalScanner.g:139:10: lv_global_3_0= ruleGlobal
            	    {
            	    if ( state.backtracking==0 ) {

            	      										newCompositeNode(grammarAccess.getModelAccess().getGlobalGlobalParserRuleCall_1_1_0());
            	      									
            	    }
            	    pushFollow(FOLLOW_4);
            	    lv_global_3_0=ruleGlobal();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      										if (current==null) {
            	      											current = createModelElementForParent(grammarAccess.getModelRule());
            	      										}
            	      										set(
            	      											current,
            	      											"global",
            	      											lv_global_3_0,
            	      											"org.xtext.cocktail.Scanner.Global");
            	      										afterParserOrEnumRuleCall();
            	      									
            	    }

            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getModelAccess().getUnorderedGroup_1());

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalScanner.g:161:4: ({...}? => ( ({...}? => ( (lv_local_4_0= ruleLocal ) ) ) ) )
            	    {
            	    // InternalScanner.g:161:4: ({...}? => ( ({...}? => ( (lv_local_4_0= ruleLocal ) ) ) ) )
            	    // InternalScanner.g:162:5: {...}? => ( ({...}? => ( (lv_local_4_0= ruleLocal ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_1(), 2) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleModel", "getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // InternalScanner.g:162:102: ( ({...}? => ( (lv_local_4_0= ruleLocal ) ) ) )
            	    // InternalScanner.g:163:6: ({...}? => ( (lv_local_4_0= ruleLocal ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getModelAccess().getUnorderedGroup_1(), 2);
            	    // InternalScanner.g:166:9: ({...}? => ( (lv_local_4_0= ruleLocal ) ) )
            	    // InternalScanner.g:166:10: {...}? => ( (lv_local_4_0= ruleLocal ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleModel", "true");
            	    }
            	    // InternalScanner.g:166:19: ( (lv_local_4_0= ruleLocal ) )
            	    // InternalScanner.g:166:20: (lv_local_4_0= ruleLocal )
            	    {
            	    // InternalScanner.g:166:20: (lv_local_4_0= ruleLocal )
            	    // InternalScanner.g:167:10: lv_local_4_0= ruleLocal
            	    {
            	    if ( state.backtracking==0 ) {

            	      										newCompositeNode(grammarAccess.getModelAccess().getLocalLocalParserRuleCall_1_2_0());
            	      									
            	    }
            	    pushFollow(FOLLOW_4);
            	    lv_local_4_0=ruleLocal();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      										if (current==null) {
            	      											current = createModelElementForParent(grammarAccess.getModelRule());
            	      										}
            	      										set(
            	      											current,
            	      											"local",
            	      											lv_local_4_0,
            	      											"org.xtext.cocktail.Scanner.Local");
            	      										afterParserOrEnumRuleCall();
            	      									
            	    }

            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getModelAccess().getUnorderedGroup_1());

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalScanner.g:189:4: ({...}? => ( ({...}? => ( (lv_default_5_0= ruleDefault ) ) ) ) )
            	    {
            	    // InternalScanner.g:189:4: ({...}? => ( ({...}? => ( (lv_default_5_0= ruleDefault ) ) ) ) )
            	    // InternalScanner.g:190:5: {...}? => ( ({...}? => ( (lv_default_5_0= ruleDefault ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_1(), 3) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleModel", "getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_1(), 3)");
            	    }
            	    // InternalScanner.g:190:102: ( ({...}? => ( (lv_default_5_0= ruleDefault ) ) ) )
            	    // InternalScanner.g:191:6: ({...}? => ( (lv_default_5_0= ruleDefault ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getModelAccess().getUnorderedGroup_1(), 3);
            	    // InternalScanner.g:194:9: ({...}? => ( (lv_default_5_0= ruleDefault ) ) )
            	    // InternalScanner.g:194:10: {...}? => ( (lv_default_5_0= ruleDefault ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleModel", "true");
            	    }
            	    // InternalScanner.g:194:19: ( (lv_default_5_0= ruleDefault ) )
            	    // InternalScanner.g:194:20: (lv_default_5_0= ruleDefault )
            	    {
            	    // InternalScanner.g:194:20: (lv_default_5_0= ruleDefault )
            	    // InternalScanner.g:195:10: lv_default_5_0= ruleDefault
            	    {
            	    if ( state.backtracking==0 ) {

            	      										newCompositeNode(grammarAccess.getModelAccess().getDefaultDefaultParserRuleCall_1_3_0());
            	      									
            	    }
            	    pushFollow(FOLLOW_4);
            	    lv_default_5_0=ruleDefault();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      										if (current==null) {
            	      											current = createModelElementForParent(grammarAccess.getModelRule());
            	      										}
            	      										set(
            	      											current,
            	      											"default",
            	      											lv_default_5_0,
            	      											"org.xtext.cocktail.Scanner.Default");
            	      										afterParserOrEnumRuleCall();
            	      									
            	    }

            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getModelAccess().getUnorderedGroup_1());

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalScanner.g:217:4: ({...}? => ( ({...}? => ( (lv_eof_6_0= ruleEof ) ) ) ) )
            	    {
            	    // InternalScanner.g:217:4: ({...}? => ( ({...}? => ( (lv_eof_6_0= ruleEof ) ) ) ) )
            	    // InternalScanner.g:218:5: {...}? => ( ({...}? => ( (lv_eof_6_0= ruleEof ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_1(), 4) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleModel", "getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_1(), 4)");
            	    }
            	    // InternalScanner.g:218:102: ( ({...}? => ( (lv_eof_6_0= ruleEof ) ) ) )
            	    // InternalScanner.g:219:6: ({...}? => ( (lv_eof_6_0= ruleEof ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getModelAccess().getUnorderedGroup_1(), 4);
            	    // InternalScanner.g:222:9: ({...}? => ( (lv_eof_6_0= ruleEof ) ) )
            	    // InternalScanner.g:222:10: {...}? => ( (lv_eof_6_0= ruleEof ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleModel", "true");
            	    }
            	    // InternalScanner.g:222:19: ( (lv_eof_6_0= ruleEof ) )
            	    // InternalScanner.g:222:20: (lv_eof_6_0= ruleEof )
            	    {
            	    // InternalScanner.g:222:20: (lv_eof_6_0= ruleEof )
            	    // InternalScanner.g:223:10: lv_eof_6_0= ruleEof
            	    {
            	    if ( state.backtracking==0 ) {

            	      										newCompositeNode(grammarAccess.getModelAccess().getEofEofParserRuleCall_1_4_0());
            	      									
            	    }
            	    pushFollow(FOLLOW_4);
            	    lv_eof_6_0=ruleEof();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      										if (current==null) {
            	      											current = createModelElementForParent(grammarAccess.getModelRule());
            	      										}
            	      										set(
            	      											current,
            	      											"eof",
            	      											lv_eof_6_0,
            	      											"org.xtext.cocktail.Scanner.Eof");
            	      										afterParserOrEnumRuleCall();
            	      									
            	    }

            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getModelAccess().getUnorderedGroup_1());

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalScanner.g:245:4: ({...}? => ( ({...}? => ( (lv_begin_7_0= ruleBegin ) ) ) ) )
            	    {
            	    // InternalScanner.g:245:4: ({...}? => ( ({...}? => ( (lv_begin_7_0= ruleBegin ) ) ) ) )
            	    // InternalScanner.g:246:5: {...}? => ( ({...}? => ( (lv_begin_7_0= ruleBegin ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_1(), 5) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleModel", "getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_1(), 5)");
            	    }
            	    // InternalScanner.g:246:102: ( ({...}? => ( (lv_begin_7_0= ruleBegin ) ) ) )
            	    // InternalScanner.g:247:6: ({...}? => ( (lv_begin_7_0= ruleBegin ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getModelAccess().getUnorderedGroup_1(), 5);
            	    // InternalScanner.g:250:9: ({...}? => ( (lv_begin_7_0= ruleBegin ) ) )
            	    // InternalScanner.g:250:10: {...}? => ( (lv_begin_7_0= ruleBegin ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleModel", "true");
            	    }
            	    // InternalScanner.g:250:19: ( (lv_begin_7_0= ruleBegin ) )
            	    // InternalScanner.g:250:20: (lv_begin_7_0= ruleBegin )
            	    {
            	    // InternalScanner.g:250:20: (lv_begin_7_0= ruleBegin )
            	    // InternalScanner.g:251:10: lv_begin_7_0= ruleBegin
            	    {
            	    if ( state.backtracking==0 ) {

            	      										newCompositeNode(grammarAccess.getModelAccess().getBeginBeginParserRuleCall_1_5_0());
            	      									
            	    }
            	    pushFollow(FOLLOW_4);
            	    lv_begin_7_0=ruleBegin();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      										if (current==null) {
            	      											current = createModelElementForParent(grammarAccess.getModelRule());
            	      										}
            	      										set(
            	      											current,
            	      											"begin",
            	      											lv_begin_7_0,
            	      											"org.xtext.cocktail.Scanner.Begin");
            	      										afterParserOrEnumRuleCall();
            	      									
            	    }

            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getModelAccess().getUnorderedGroup_1());

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // InternalScanner.g:273:4: ({...}? => ( ({...}? => ( (lv_close_8_0= ruleClose ) ) ) ) )
            	    {
            	    // InternalScanner.g:273:4: ({...}? => ( ({...}? => ( (lv_close_8_0= ruleClose ) ) ) ) )
            	    // InternalScanner.g:274:5: {...}? => ( ({...}? => ( (lv_close_8_0= ruleClose ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_1(), 6) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleModel", "getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_1(), 6)");
            	    }
            	    // InternalScanner.g:274:102: ( ({...}? => ( (lv_close_8_0= ruleClose ) ) ) )
            	    // InternalScanner.g:275:6: ({...}? => ( (lv_close_8_0= ruleClose ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getModelAccess().getUnorderedGroup_1(), 6);
            	    // InternalScanner.g:278:9: ({...}? => ( (lv_close_8_0= ruleClose ) ) )
            	    // InternalScanner.g:278:10: {...}? => ( (lv_close_8_0= ruleClose ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleModel", "true");
            	    }
            	    // InternalScanner.g:278:19: ( (lv_close_8_0= ruleClose ) )
            	    // InternalScanner.g:278:20: (lv_close_8_0= ruleClose )
            	    {
            	    // InternalScanner.g:278:20: (lv_close_8_0= ruleClose )
            	    // InternalScanner.g:279:10: lv_close_8_0= ruleClose
            	    {
            	    if ( state.backtracking==0 ) {

            	      										newCompositeNode(grammarAccess.getModelAccess().getCloseCloseParserRuleCall_1_6_0());
            	      									
            	    }
            	    pushFollow(FOLLOW_4);
            	    lv_close_8_0=ruleClose();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      										if (current==null) {
            	      											current = createModelElementForParent(grammarAccess.getModelRule());
            	      										}
            	      										set(
            	      											current,
            	      											"close",
            	      											lv_close_8_0,
            	      											"org.xtext.cocktail.Scanner.Close");
            	      										afterParserOrEnumRuleCall();
            	      									
            	    }

            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getModelAccess().getUnorderedGroup_1());

            	    }


            	    }


            	    }
            	    break;
            	case 8 :
            	    // InternalScanner.g:301:4: ({...}? => ( ({...}? => ( (lv_define_9_0= ruleDefine ) ) ) ) )
            	    {
            	    // InternalScanner.g:301:4: ({...}? => ( ({...}? => ( (lv_define_9_0= ruleDefine ) ) ) ) )
            	    // InternalScanner.g:302:5: {...}? => ( ({...}? => ( (lv_define_9_0= ruleDefine ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_1(), 7) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleModel", "getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_1(), 7)");
            	    }
            	    // InternalScanner.g:302:102: ( ({...}? => ( (lv_define_9_0= ruleDefine ) ) ) )
            	    // InternalScanner.g:303:6: ({...}? => ( (lv_define_9_0= ruleDefine ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getModelAccess().getUnorderedGroup_1(), 7);
            	    // InternalScanner.g:306:9: ({...}? => ( (lv_define_9_0= ruleDefine ) ) )
            	    // InternalScanner.g:306:10: {...}? => ( (lv_define_9_0= ruleDefine ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleModel", "true");
            	    }
            	    // InternalScanner.g:306:19: ( (lv_define_9_0= ruleDefine ) )
            	    // InternalScanner.g:306:20: (lv_define_9_0= ruleDefine )
            	    {
            	    // InternalScanner.g:306:20: (lv_define_9_0= ruleDefine )
            	    // InternalScanner.g:307:10: lv_define_9_0= ruleDefine
            	    {
            	    if ( state.backtracking==0 ) {

            	      										newCompositeNode(grammarAccess.getModelAccess().getDefineDefineParserRuleCall_1_7_0());
            	      									
            	    }
            	    pushFollow(FOLLOW_4);
            	    lv_define_9_0=ruleDefine();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      										if (current==null) {
            	      											current = createModelElementForParent(grammarAccess.getModelRule());
            	      										}
            	      										set(
            	      											current,
            	      											"define",
            	      											lv_define_9_0,
            	      											"org.xtext.cocktail.Scanner.Define");
            	      										afterParserOrEnumRuleCall();
            	      									
            	    }

            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getModelAccess().getUnorderedGroup_1());

            	    }


            	    }


            	    }
            	    break;
            	case 9 :
            	    // InternalScanner.g:329:4: ({...}? => ( ({...}? => ( (lv_states_10_0= ruleStartStates ) ) ) ) )
            	    {
            	    // InternalScanner.g:329:4: ({...}? => ( ({...}? => ( (lv_states_10_0= ruleStartStates ) ) ) ) )
            	    // InternalScanner.g:330:5: {...}? => ( ({...}? => ( (lv_states_10_0= ruleStartStates ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_1(), 8) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleModel", "getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_1(), 8)");
            	    }
            	    // InternalScanner.g:330:102: ( ({...}? => ( (lv_states_10_0= ruleStartStates ) ) ) )
            	    // InternalScanner.g:331:6: ({...}? => ( (lv_states_10_0= ruleStartStates ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getModelAccess().getUnorderedGroup_1(), 8);
            	    // InternalScanner.g:334:9: ({...}? => ( (lv_states_10_0= ruleStartStates ) ) )
            	    // InternalScanner.g:334:10: {...}? => ( (lv_states_10_0= ruleStartStates ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleModel", "true");
            	    }
            	    // InternalScanner.g:334:19: ( (lv_states_10_0= ruleStartStates ) )
            	    // InternalScanner.g:334:20: (lv_states_10_0= ruleStartStates )
            	    {
            	    // InternalScanner.g:334:20: (lv_states_10_0= ruleStartStates )
            	    // InternalScanner.g:335:10: lv_states_10_0= ruleStartStates
            	    {
            	    if ( state.backtracking==0 ) {

            	      										newCompositeNode(grammarAccess.getModelAccess().getStatesStartStatesParserRuleCall_1_8_0());
            	      									
            	    }
            	    pushFollow(FOLLOW_4);
            	    lv_states_10_0=ruleStartStates();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      										if (current==null) {
            	      											current = createModelElementForParent(grammarAccess.getModelRule());
            	      										}
            	      										set(
            	      											current,
            	      											"states",
            	      											lv_states_10_0,
            	      											"org.xtext.cocktail.Scanner.StartStates");
            	      										afterParserOrEnumRuleCall();
            	      									
            	    }

            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getModelAccess().getUnorderedGroup_1());

            	    }


            	    }


            	    }
            	    break;
            	case 10 :
            	    // InternalScanner.g:357:4: ({...}? => ( ({...}? => ( (lv_rules_11_0= ruleRule ) ) ) ) )
            	    {
            	    // InternalScanner.g:357:4: ({...}? => ( ({...}? => ( (lv_rules_11_0= ruleRule ) ) ) ) )
            	    // InternalScanner.g:358:5: {...}? => ( ({...}? => ( (lv_rules_11_0= ruleRule ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_1(), 9) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleModel", "getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_1(), 9)");
            	    }
            	    // InternalScanner.g:358:102: ( ({...}? => ( (lv_rules_11_0= ruleRule ) ) ) )
            	    // InternalScanner.g:359:6: ({...}? => ( (lv_rules_11_0= ruleRule ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getModelAccess().getUnorderedGroup_1(), 9);
            	    // InternalScanner.g:362:9: ({...}? => ( (lv_rules_11_0= ruleRule ) ) )
            	    // InternalScanner.g:362:10: {...}? => ( (lv_rules_11_0= ruleRule ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleModel", "true");
            	    }
            	    // InternalScanner.g:362:19: ( (lv_rules_11_0= ruleRule ) )
            	    // InternalScanner.g:362:20: (lv_rules_11_0= ruleRule )
            	    {
            	    // InternalScanner.g:362:20: (lv_rules_11_0= ruleRule )
            	    // InternalScanner.g:363:10: lv_rules_11_0= ruleRule
            	    {
            	    if ( state.backtracking==0 ) {

            	      										newCompositeNode(grammarAccess.getModelAccess().getRulesRuleParserRuleCall_1_9_0());
            	      									
            	    }
            	    pushFollow(FOLLOW_4);
            	    lv_rules_11_0=ruleRule();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      										if (current==null) {
            	      											current = createModelElementForParent(grammarAccess.getModelRule());
            	      										}
            	      										set(
            	      											current,
            	      											"rules",
            	      											lv_rules_11_0,
            	      											"org.xtext.cocktail.Scanner.Rule");
            	      										afterParserOrEnumRuleCall();
            	      									
            	    }

            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getModelAccess().getUnorderedGroup_1());

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getModelAccess().getUnorderedGroup_1()) ) {
                if (state.backtracking>0) {state.failed=true; return current;}
                throw new FailedPredicateException(input, "ruleModel", "getUnorderedGroupHelper().canLeave(grammarAccess.getModelAccess().getUnorderedGroup_1())");
            }

            }


            }

            getUnorderedGroupHelper().leave(grammarAccess.getModelAccess().getUnorderedGroup_1());

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleCodeBlock"
    // InternalScanner.g:397:1: entryRuleCodeBlock returns [String current=null] : iv_ruleCodeBlock= ruleCodeBlock EOF ;
    public final String entryRuleCodeBlock() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCodeBlock = null;


        try {
            // InternalScanner.g:397:49: (iv_ruleCodeBlock= ruleCodeBlock EOF )
            // InternalScanner.g:398:2: iv_ruleCodeBlock= ruleCodeBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCodeBlockRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCodeBlock=ruleCodeBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCodeBlock.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalScanner.g:404:1: ruleCodeBlock returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_CodeWall_0= ruleCodeWall | (kw= '{' this_CodeBlock_2= ruleCodeBlock kw= '}' ) )* ;
    public final AntlrDatatypeRuleToken ruleCodeBlock() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_CodeWall_0 = null;

        AntlrDatatypeRuleToken this_CodeBlock_2 = null;



        	enterRule();

        try {
            // InternalScanner.g:410:2: ( (this_CodeWall_0= ruleCodeWall | (kw= '{' this_CodeBlock_2= ruleCodeBlock kw= '}' ) )* )
            // InternalScanner.g:411:2: (this_CodeWall_0= ruleCodeWall | (kw= '{' this_CodeBlock_2= ruleCodeBlock kw= '}' ) )*
            {
            // InternalScanner.g:411:2: (this_CodeWall_0= ruleCodeWall | (kw= '{' this_CodeBlock_2= ruleCodeBlock kw= '}' ) )*
            loop2:
            do {
                int alt2=3;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=RULE_ID && LA2_0<=RULE_WS)||(LA2_0>=13 && LA2_0<=32)) ) {
                    alt2=1;
                }
                else if ( (LA2_0==11) ) {
                    alt2=2;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalScanner.g:412:3: this_CodeWall_0= ruleCodeWall
            	    {
            	    if ( state.backtracking==0 ) {

            	      			newCompositeNode(grammarAccess.getCodeBlockAccess().getCodeWallParserRuleCall_0());
            	      		
            	    }
            	    pushFollow(FOLLOW_5);
            	    this_CodeWall_0=ruleCodeWall();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			current.merge(this_CodeWall_0);
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      			afterParserOrEnumRuleCall();
            	      		
            	    }

            	    }
            	    break;
            	case 2 :
            	    // InternalScanner.g:423:3: (kw= '{' this_CodeBlock_2= ruleCodeBlock kw= '}' )
            	    {
            	    // InternalScanner.g:423:3: (kw= '{' this_CodeBlock_2= ruleCodeBlock kw= '}' )
            	    // InternalScanner.g:424:4: kw= '{' this_CodeBlock_2= ruleCodeBlock kw= '}'
            	    {
            	    kw=(Token)match(input,11,FOLLOW_6); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getCodeBlockAccess().getLeftCurlyBracketKeyword_1_0());
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getCodeBlockAccess().getCodeBlockParserRuleCall_1_1());
            	      			
            	    }
            	    pushFollow(FOLLOW_7);
            	    this_CodeBlock_2=ruleCodeBlock();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_CodeBlock_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				afterParserOrEnumRuleCall();
            	      			
            	    }
            	    kw=(Token)match(input,12,FOLLOW_5); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getCodeBlockAccess().getRightCurlyBracketKeyword_1_2());
            	      			
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleCodeBlock"


    // $ANTLR start "entryRuleCodeWall"
    // InternalScanner.g:449:1: entryRuleCodeWall returns [String current=null] : iv_ruleCodeWall= ruleCodeWall EOF ;
    public final String entryRuleCodeWall() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCodeWall = null;


        try {
            // InternalScanner.g:449:48: (iv_ruleCodeWall= ruleCodeWall EOF )
            // InternalScanner.g:450:2: iv_ruleCodeWall= ruleCodeWall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCodeWallRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCodeWall=ruleCodeWall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCodeWall.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalScanner.g:456:1: ruleCodeWall returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_INT_1= RULE_INT | this_STRING_2= RULE_STRING | this_WS_3= RULE_WS | kw= '+' | kw= '-' | kw= '(' | kw= ')' | kw= '*' | kw= '.' | kw= '/' | kw= '\\\\' | kw= '|' | kw= '?' | kw= '>' | kw= '<' | kw= '#' | kw= '$' | kw= '%' | kw= ';' | kw= ':' | kw= '!' | kw= '=' | kw= ',' ) ;
    public final AntlrDatatypeRuleToken ruleCodeWall() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_INT_1=null;
        Token this_STRING_2=null;
        Token this_WS_3=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalScanner.g:462:2: ( (this_ID_0= RULE_ID | this_INT_1= RULE_INT | this_STRING_2= RULE_STRING | this_WS_3= RULE_WS | kw= '+' | kw= '-' | kw= '(' | kw= ')' | kw= '*' | kw= '.' | kw= '/' | kw= '\\\\' | kw= '|' | kw= '?' | kw= '>' | kw= '<' | kw= '#' | kw= '$' | kw= '%' | kw= ';' | kw= ':' | kw= '!' | kw= '=' | kw= ',' ) )
            // InternalScanner.g:463:2: (this_ID_0= RULE_ID | this_INT_1= RULE_INT | this_STRING_2= RULE_STRING | this_WS_3= RULE_WS | kw= '+' | kw= '-' | kw= '(' | kw= ')' | kw= '*' | kw= '.' | kw= '/' | kw= '\\\\' | kw= '|' | kw= '?' | kw= '>' | kw= '<' | kw= '#' | kw= '$' | kw= '%' | kw= ';' | kw= ':' | kw= '!' | kw= '=' | kw= ',' )
            {
            // InternalScanner.g:463:2: (this_ID_0= RULE_ID | this_INT_1= RULE_INT | this_STRING_2= RULE_STRING | this_WS_3= RULE_WS | kw= '+' | kw= '-' | kw= '(' | kw= ')' | kw= '*' | kw= '.' | kw= '/' | kw= '\\\\' | kw= '|' | kw= '?' | kw= '>' | kw= '<' | kw= '#' | kw= '$' | kw= '%' | kw= ';' | kw= ':' | kw= '!' | kw= '=' | kw= ',' )
            int alt3=24;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt3=1;
                }
                break;
            case RULE_INT:
                {
                alt3=2;
                }
                break;
            case RULE_STRING:
                {
                alt3=3;
                }
                break;
            case RULE_WS:
                {
                alt3=4;
                }
                break;
            case 13:
                {
                alt3=5;
                }
                break;
            case 14:
                {
                alt3=6;
                }
                break;
            case 15:
                {
                alt3=7;
                }
                break;
            case 16:
                {
                alt3=8;
                }
                break;
            case 17:
                {
                alt3=9;
                }
                break;
            case 18:
                {
                alt3=10;
                }
                break;
            case 19:
                {
                alt3=11;
                }
                break;
            case 20:
                {
                alt3=12;
                }
                break;
            case 21:
                {
                alt3=13;
                }
                break;
            case 22:
                {
                alt3=14;
                }
                break;
            case 23:
                {
                alt3=15;
                }
                break;
            case 24:
                {
                alt3=16;
                }
                break;
            case 25:
                {
                alt3=17;
                }
                break;
            case 26:
                {
                alt3=18;
                }
                break;
            case 27:
                {
                alt3=19;
                }
                break;
            case 28:
                {
                alt3=20;
                }
                break;
            case 29:
                {
                alt3=21;
                }
                break;
            case 30:
                {
                alt3=22;
                }
                break;
            case 31:
                {
                alt3=23;
                }
                break;
            case 32:
                {
                alt3=24;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalScanner.g:464:3: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_ID_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_ID_0, grammarAccess.getCodeWallAccess().getIDTerminalRuleCall_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalScanner.g:472:3: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_INT_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_INT_1, grammarAccess.getCodeWallAccess().getINTTerminalRuleCall_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalScanner.g:480:3: this_STRING_2= RULE_STRING
                    {
                    this_STRING_2=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_STRING_2);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_STRING_2, grammarAccess.getCodeWallAccess().getSTRINGTerminalRuleCall_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalScanner.g:488:3: this_WS_3= RULE_WS
                    {
                    this_WS_3=(Token)match(input,RULE_WS,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_WS_3);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_WS_3, grammarAccess.getCodeWallAccess().getWSTerminalRuleCall_3());
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalScanner.g:496:3: kw= '+'
                    {
                    kw=(Token)match(input,13,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCodeWallAccess().getPlusSignKeyword_4());
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalScanner.g:502:3: kw= '-'
                    {
                    kw=(Token)match(input,14,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCodeWallAccess().getHyphenMinusKeyword_5());
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalScanner.g:508:3: kw= '('
                    {
                    kw=(Token)match(input,15,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCodeWallAccess().getLeftParenthesisKeyword_6());
                      		
                    }

                    }
                    break;
                case 8 :
                    // InternalScanner.g:514:3: kw= ')'
                    {
                    kw=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCodeWallAccess().getRightParenthesisKeyword_7());
                      		
                    }

                    }
                    break;
                case 9 :
                    // InternalScanner.g:520:3: kw= '*'
                    {
                    kw=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCodeWallAccess().getAsteriskKeyword_8());
                      		
                    }

                    }
                    break;
                case 10 :
                    // InternalScanner.g:526:3: kw= '.'
                    {
                    kw=(Token)match(input,18,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCodeWallAccess().getFullStopKeyword_9());
                      		
                    }

                    }
                    break;
                case 11 :
                    // InternalScanner.g:532:3: kw= '/'
                    {
                    kw=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCodeWallAccess().getSolidusKeyword_10());
                      		
                    }

                    }
                    break;
                case 12 :
                    // InternalScanner.g:538:3: kw= '\\\\'
                    {
                    kw=(Token)match(input,20,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCodeWallAccess().getReverseSolidusKeyword_11());
                      		
                    }

                    }
                    break;
                case 13 :
                    // InternalScanner.g:544:3: kw= '|'
                    {
                    kw=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCodeWallAccess().getVerticalLineKeyword_12());
                      		
                    }

                    }
                    break;
                case 14 :
                    // InternalScanner.g:550:3: kw= '?'
                    {
                    kw=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCodeWallAccess().getQuestionMarkKeyword_13());
                      		
                    }

                    }
                    break;
                case 15 :
                    // InternalScanner.g:556:3: kw= '>'
                    {
                    kw=(Token)match(input,23,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCodeWallAccess().getGreaterThanSignKeyword_14());
                      		
                    }

                    }
                    break;
                case 16 :
                    // InternalScanner.g:562:3: kw= '<'
                    {
                    kw=(Token)match(input,24,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCodeWallAccess().getLessThanSignKeyword_15());
                      		
                    }

                    }
                    break;
                case 17 :
                    // InternalScanner.g:568:3: kw= '#'
                    {
                    kw=(Token)match(input,25,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCodeWallAccess().getNumberSignKeyword_16());
                      		
                    }

                    }
                    break;
                case 18 :
                    // InternalScanner.g:574:3: kw= '$'
                    {
                    kw=(Token)match(input,26,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCodeWallAccess().getDollarSignKeyword_17());
                      		
                    }

                    }
                    break;
                case 19 :
                    // InternalScanner.g:580:3: kw= '%'
                    {
                    kw=(Token)match(input,27,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCodeWallAccess().getPercentSignKeyword_18());
                      		
                    }

                    }
                    break;
                case 20 :
                    // InternalScanner.g:586:3: kw= ';'
                    {
                    kw=(Token)match(input,28,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCodeWallAccess().getSemicolonKeyword_19());
                      		
                    }

                    }
                    break;
                case 21 :
                    // InternalScanner.g:592:3: kw= ':'
                    {
                    kw=(Token)match(input,29,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCodeWallAccess().getColonKeyword_20());
                      		
                    }

                    }
                    break;
                case 22 :
                    // InternalScanner.g:598:3: kw= '!'
                    {
                    kw=(Token)match(input,30,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCodeWallAccess().getExclamationMarkKeyword_21());
                      		
                    }

                    }
                    break;
                case 23 :
                    // InternalScanner.g:604:3: kw= '='
                    {
                    kw=(Token)match(input,31,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCodeWallAccess().getEqualsSignKeyword_22());
                      		
                    }

                    }
                    break;
                case 24 :
                    // InternalScanner.g:610:3: kw= ','
                    {
                    kw=(Token)match(input,32,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCodeWallAccess().getCommaKeyword_23());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleCodeWall"


    // $ANTLR start "entryRuleScanner"
    // InternalScanner.g:619:1: entryRuleScanner returns [EObject current=null] : iv_ruleScanner= ruleScanner EOF ;
    public final EObject entryRuleScanner() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScanner = null;


        try {
            // InternalScanner.g:619:48: (iv_ruleScanner= ruleScanner EOF )
            // InternalScanner.g:620:2: iv_ruleScanner= ruleScanner EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getScannerRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleScanner=ruleScanner();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleScanner; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleScanner"


    // $ANTLR start "ruleScanner"
    // InternalScanner.g:626:1: ruleScanner returns [EObject current=null] : (otherlv_0= 'SCANNER' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleScanner() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalScanner.g:632:2: ( (otherlv_0= 'SCANNER' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalScanner.g:633:2: (otherlv_0= 'SCANNER' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalScanner.g:633:2: (otherlv_0= 'SCANNER' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalScanner.g:634:3: otherlv_0= 'SCANNER' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,33,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getScannerAccess().getSCANNERKeyword_0());
              		
            }
            // InternalScanner.g:638:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalScanner.g:639:4: (lv_name_1_0= RULE_ID )
            {
            // InternalScanner.g:639:4: (lv_name_1_0= RULE_ID )
            // InternalScanner.g:640:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getScannerAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getScannerRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleScanner"


    // $ANTLR start "entryRuleExport"
    // InternalScanner.g:660:1: entryRuleExport returns [EObject current=null] : iv_ruleExport= ruleExport EOF ;
    public final EObject entryRuleExport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExport = null;


        try {
            // InternalScanner.g:660:47: (iv_ruleExport= ruleExport EOF )
            // InternalScanner.g:661:2: iv_ruleExport= ruleExport EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExportRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExport=ruleExport();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExport; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalScanner.g:667:1: ruleExport returns [EObject current=null] : (otherlv_0= 'EXPORT' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' ) ;
    public final EObject ruleExport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_content_2_0 = null;



        	enterRule();

        try {
            // InternalScanner.g:673:2: ( (otherlv_0= 'EXPORT' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' ) )
            // InternalScanner.g:674:2: (otherlv_0= 'EXPORT' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' )
            {
            // InternalScanner.g:674:2: (otherlv_0= 'EXPORT' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' )
            // InternalScanner.g:675:3: otherlv_0= 'EXPORT' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getExportAccess().getEXPORTKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,11,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getExportAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalScanner.g:683:3: ( (lv_content_2_0= ruleCodeBlock ) )
            // InternalScanner.g:684:4: (lv_content_2_0= ruleCodeBlock )
            {
            // InternalScanner.g:684:4: (lv_content_2_0= ruleCodeBlock )
            // InternalScanner.g:685:5: lv_content_2_0= ruleCodeBlock
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getExportAccess().getContentCodeBlockParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_7);
            lv_content_2_0=ruleCodeBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getExportRule());
              					}
              					set(
              						current,
              						"content",
              						lv_content_2_0,
              						"org.xtext.cocktail.Scanner.CodeBlock");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getExportAccess().getRightCurlyBracketKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleExport"


    // $ANTLR start "entryRuleGlobal"
    // InternalScanner.g:710:1: entryRuleGlobal returns [EObject current=null] : iv_ruleGlobal= ruleGlobal EOF ;
    public final EObject entryRuleGlobal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGlobal = null;


        try {
            // InternalScanner.g:710:47: (iv_ruleGlobal= ruleGlobal EOF )
            // InternalScanner.g:711:2: iv_ruleGlobal= ruleGlobal EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGlobalRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGlobal=ruleGlobal();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGlobal; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalScanner.g:717:1: ruleGlobal returns [EObject current=null] : (otherlv_0= 'GLOBAL' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' ) ;
    public final EObject ruleGlobal() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_content_2_0 = null;



        	enterRule();

        try {
            // InternalScanner.g:723:2: ( (otherlv_0= 'GLOBAL' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' ) )
            // InternalScanner.g:724:2: (otherlv_0= 'GLOBAL' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' )
            {
            // InternalScanner.g:724:2: (otherlv_0= 'GLOBAL' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' )
            // InternalScanner.g:725:3: otherlv_0= 'GLOBAL' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGlobalAccess().getGLOBALKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,11,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGlobalAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalScanner.g:733:3: ( (lv_content_2_0= ruleCodeBlock ) )
            // InternalScanner.g:734:4: (lv_content_2_0= ruleCodeBlock )
            {
            // InternalScanner.g:734:4: (lv_content_2_0= ruleCodeBlock )
            // InternalScanner.g:735:5: lv_content_2_0= ruleCodeBlock
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGlobalAccess().getContentCodeBlockParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_7);
            lv_content_2_0=ruleCodeBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGlobalRule());
              					}
              					set(
              						current,
              						"content",
              						lv_content_2_0,
              						"org.xtext.cocktail.Scanner.CodeBlock");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGlobalAccess().getRightCurlyBracketKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleGlobal"


    // $ANTLR start "entryRuleLocal"
    // InternalScanner.g:760:1: entryRuleLocal returns [EObject current=null] : iv_ruleLocal= ruleLocal EOF ;
    public final EObject entryRuleLocal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocal = null;


        try {
            // InternalScanner.g:760:46: (iv_ruleLocal= ruleLocal EOF )
            // InternalScanner.g:761:2: iv_ruleLocal= ruleLocal EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLocalRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLocal=ruleLocal();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLocal; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalScanner.g:767:1: ruleLocal returns [EObject current=null] : (otherlv_0= 'LOCAL' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' ) ;
    public final EObject ruleLocal() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_content_2_0 = null;



        	enterRule();

        try {
            // InternalScanner.g:773:2: ( (otherlv_0= 'LOCAL' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' ) )
            // InternalScanner.g:774:2: (otherlv_0= 'LOCAL' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' )
            {
            // InternalScanner.g:774:2: (otherlv_0= 'LOCAL' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' )
            // InternalScanner.g:775:3: otherlv_0= 'LOCAL' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getLocalAccess().getLOCALKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,11,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getLocalAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalScanner.g:783:3: ( (lv_content_2_0= ruleCodeBlock ) )
            // InternalScanner.g:784:4: (lv_content_2_0= ruleCodeBlock )
            {
            // InternalScanner.g:784:4: (lv_content_2_0= ruleCodeBlock )
            // InternalScanner.g:785:5: lv_content_2_0= ruleCodeBlock
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getLocalAccess().getContentCodeBlockParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_7);
            lv_content_2_0=ruleCodeBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getLocalRule());
              					}
              					set(
              						current,
              						"content",
              						lv_content_2_0,
              						"org.xtext.cocktail.Scanner.CodeBlock");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getLocalAccess().getRightCurlyBracketKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleLocal"


    // $ANTLR start "entryRuleDefault"
    // InternalScanner.g:810:1: entryRuleDefault returns [EObject current=null] : iv_ruleDefault= ruleDefault EOF ;
    public final EObject entryRuleDefault() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefault = null;


        try {
            // InternalScanner.g:810:48: (iv_ruleDefault= ruleDefault EOF )
            // InternalScanner.g:811:2: iv_ruleDefault= ruleDefault EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDefaultRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDefault=ruleDefault();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDefault; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDefault"


    // $ANTLR start "ruleDefault"
    // InternalScanner.g:817:1: ruleDefault returns [EObject current=null] : (otherlv_0= 'DEFAULT' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' ) ;
    public final EObject ruleDefault() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_content_2_0 = null;



        	enterRule();

        try {
            // InternalScanner.g:823:2: ( (otherlv_0= 'DEFAULT' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' ) )
            // InternalScanner.g:824:2: (otherlv_0= 'DEFAULT' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' )
            {
            // InternalScanner.g:824:2: (otherlv_0= 'DEFAULT' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' )
            // InternalScanner.g:825:3: otherlv_0= 'DEFAULT' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDefaultAccess().getDEFAULTKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,11,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDefaultAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalScanner.g:833:3: ( (lv_content_2_0= ruleCodeBlock ) )
            // InternalScanner.g:834:4: (lv_content_2_0= ruleCodeBlock )
            {
            // InternalScanner.g:834:4: (lv_content_2_0= ruleCodeBlock )
            // InternalScanner.g:835:5: lv_content_2_0= ruleCodeBlock
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDefaultAccess().getContentCodeBlockParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_7);
            lv_content_2_0=ruleCodeBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDefaultRule());
              					}
              					set(
              						current,
              						"content",
              						lv_content_2_0,
              						"org.xtext.cocktail.Scanner.CodeBlock");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getDefaultAccess().getRightCurlyBracketKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleDefault"


    // $ANTLR start "entryRuleEof"
    // InternalScanner.g:860:1: entryRuleEof returns [EObject current=null] : iv_ruleEof= ruleEof EOF ;
    public final EObject entryRuleEof() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEof = null;


        try {
            // InternalScanner.g:860:44: (iv_ruleEof= ruleEof EOF )
            // InternalScanner.g:861:2: iv_ruleEof= ruleEof EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEofRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEof=ruleEof();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEof; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEof"


    // $ANTLR start "ruleEof"
    // InternalScanner.g:867:1: ruleEof returns [EObject current=null] : (otherlv_0= 'EOF' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' ) ;
    public final EObject ruleEof() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_content_2_0 = null;



        	enterRule();

        try {
            // InternalScanner.g:873:2: ( (otherlv_0= 'EOF' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' ) )
            // InternalScanner.g:874:2: (otherlv_0= 'EOF' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' )
            {
            // InternalScanner.g:874:2: (otherlv_0= 'EOF' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' )
            // InternalScanner.g:875:3: otherlv_0= 'EOF' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getEofAccess().getEOFKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,11,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getEofAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalScanner.g:883:3: ( (lv_content_2_0= ruleCodeBlock ) )
            // InternalScanner.g:884:4: (lv_content_2_0= ruleCodeBlock )
            {
            // InternalScanner.g:884:4: (lv_content_2_0= ruleCodeBlock )
            // InternalScanner.g:885:5: lv_content_2_0= ruleCodeBlock
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getEofAccess().getContentCodeBlockParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_7);
            lv_content_2_0=ruleCodeBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getEofRule());
              					}
              					set(
              						current,
              						"content",
              						lv_content_2_0,
              						"org.xtext.cocktail.Scanner.CodeBlock");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getEofAccess().getRightCurlyBracketKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEof"


    // $ANTLR start "entryRuleBegin"
    // InternalScanner.g:910:1: entryRuleBegin returns [EObject current=null] : iv_ruleBegin= ruleBegin EOF ;
    public final EObject entryRuleBegin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBegin = null;


        try {
            // InternalScanner.g:910:46: (iv_ruleBegin= ruleBegin EOF )
            // InternalScanner.g:911:2: iv_ruleBegin= ruleBegin EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBeginRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBegin=ruleBegin();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBegin; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalScanner.g:917:1: ruleBegin returns [EObject current=null] : (otherlv_0= 'BEGIN' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' ) ;
    public final EObject ruleBegin() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_content_2_0 = null;



        	enterRule();

        try {
            // InternalScanner.g:923:2: ( (otherlv_0= 'BEGIN' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' ) )
            // InternalScanner.g:924:2: (otherlv_0= 'BEGIN' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' )
            {
            // InternalScanner.g:924:2: (otherlv_0= 'BEGIN' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' )
            // InternalScanner.g:925:3: otherlv_0= 'BEGIN' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,39,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getBeginAccess().getBEGINKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,11,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getBeginAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalScanner.g:933:3: ( (lv_content_2_0= ruleCodeBlock ) )
            // InternalScanner.g:934:4: (lv_content_2_0= ruleCodeBlock )
            {
            // InternalScanner.g:934:4: (lv_content_2_0= ruleCodeBlock )
            // InternalScanner.g:935:5: lv_content_2_0= ruleCodeBlock
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getBeginAccess().getContentCodeBlockParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_7);
            lv_content_2_0=ruleCodeBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getBeginRule());
              					}
              					set(
              						current,
              						"content",
              						lv_content_2_0,
              						"org.xtext.cocktail.Scanner.CodeBlock");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getBeginAccess().getRightCurlyBracketKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleBegin"


    // $ANTLR start "entryRuleClose"
    // InternalScanner.g:960:1: entryRuleClose returns [EObject current=null] : iv_ruleClose= ruleClose EOF ;
    public final EObject entryRuleClose() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClose = null;


        try {
            // InternalScanner.g:960:46: (iv_ruleClose= ruleClose EOF )
            // InternalScanner.g:961:2: iv_ruleClose= ruleClose EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCloseRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleClose=ruleClose();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleClose; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalScanner.g:967:1: ruleClose returns [EObject current=null] : (otherlv_0= 'CLOSE' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' ) ;
    public final EObject ruleClose() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_content_2_0 = null;



        	enterRule();

        try {
            // InternalScanner.g:973:2: ( (otherlv_0= 'CLOSE' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' ) )
            // InternalScanner.g:974:2: (otherlv_0= 'CLOSE' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' )
            {
            // InternalScanner.g:974:2: (otherlv_0= 'CLOSE' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' )
            // InternalScanner.g:975:3: otherlv_0= 'CLOSE' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,40,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getCloseAccess().getCLOSEKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,11,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getCloseAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalScanner.g:983:3: ( (lv_content_2_0= ruleCodeBlock ) )
            // InternalScanner.g:984:4: (lv_content_2_0= ruleCodeBlock )
            {
            // InternalScanner.g:984:4: (lv_content_2_0= ruleCodeBlock )
            // InternalScanner.g:985:5: lv_content_2_0= ruleCodeBlock
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCloseAccess().getContentCodeBlockParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_7);
            lv_content_2_0=ruleCodeBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getCloseRule());
              					}
              					set(
              						current,
              						"content",
              						lv_content_2_0,
              						"org.xtext.cocktail.Scanner.CodeBlock");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getCloseAccess().getRightCurlyBracketKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleClose"


    // $ANTLR start "entryRuleDefine"
    // InternalScanner.g:1010:1: entryRuleDefine returns [EObject current=null] : iv_ruleDefine= ruleDefine EOF ;
    public final EObject entryRuleDefine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefine = null;


        try {
            // InternalScanner.g:1010:47: (iv_ruleDefine= ruleDefine EOF )
            // InternalScanner.g:1011:2: iv_ruleDefine= ruleDefine EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDefineRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDefine=ruleDefine();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDefine; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDefine"


    // $ANTLR start "ruleDefine"
    // InternalScanner.g:1017:1: ruleDefine returns [EObject current=null] : (otherlv_0= 'DEFINE' ( (lv_defines_1_0= ruleDefineRule ) )+ ) ;
    public final EObject ruleDefine() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_defines_1_0 = null;



        	enterRule();

        try {
            // InternalScanner.g:1023:2: ( (otherlv_0= 'DEFINE' ( (lv_defines_1_0= ruleDefineRule ) )+ ) )
            // InternalScanner.g:1024:2: (otherlv_0= 'DEFINE' ( (lv_defines_1_0= ruleDefineRule ) )+ )
            {
            // InternalScanner.g:1024:2: (otherlv_0= 'DEFINE' ( (lv_defines_1_0= ruleDefineRule ) )+ )
            // InternalScanner.g:1025:3: otherlv_0= 'DEFINE' ( (lv_defines_1_0= ruleDefineRule ) )+
            {
            otherlv_0=(Token)match(input,41,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDefineAccess().getDEFINEKeyword_0());
              		
            }
            // InternalScanner.g:1029:3: ( (lv_defines_1_0= ruleDefineRule ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalScanner.g:1030:4: (lv_defines_1_0= ruleDefineRule )
            	    {
            	    // InternalScanner.g:1030:4: (lv_defines_1_0= ruleDefineRule )
            	    // InternalScanner.g:1031:5: lv_defines_1_0= ruleDefineRule
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getDefineAccess().getDefinesDefineRuleParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_10);
            	    lv_defines_1_0=ruleDefineRule();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getDefineRule());
            	      					}
            	      					add(
            	      						current,
            	      						"defines",
            	      						lv_defines_1_0,
            	      						"org.xtext.cocktail.Scanner.DefineRule");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleDefine"


    // $ANTLR start "entryRuleDefineRule"
    // InternalScanner.g:1052:1: entryRuleDefineRule returns [EObject current=null] : iv_ruleDefineRule= ruleDefineRule EOF ;
    public final EObject entryRuleDefineRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefineRule = null;


        try {
            // InternalScanner.g:1052:51: (iv_ruleDefineRule= ruleDefineRule EOF )
            // InternalScanner.g:1053:2: iv_ruleDefineRule= ruleDefineRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDefineRuleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDefineRule=ruleDefineRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDefineRule; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDefineRule"


    // $ANTLR start "ruleDefineRule"
    // InternalScanner.g:1059:1: ruleDefineRule returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_rule_2_0= ruleDefineRegex ) ) otherlv_3= '.' ) ;
    public final EObject ruleDefineRule() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_rule_2_0 = null;



        	enterRule();

        try {
            // InternalScanner.g:1065:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_rule_2_0= ruleDefineRegex ) ) otherlv_3= '.' ) )
            // InternalScanner.g:1066:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_rule_2_0= ruleDefineRegex ) ) otherlv_3= '.' )
            {
            // InternalScanner.g:1066:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_rule_2_0= ruleDefineRegex ) ) otherlv_3= '.' )
            // InternalScanner.g:1067:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_rule_2_0= ruleDefineRegex ) ) otherlv_3= '.'
            {
            // InternalScanner.g:1067:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalScanner.g:1068:4: (lv_name_0_0= RULE_ID )
            {
            // InternalScanner.g:1068:4: (lv_name_0_0= RULE_ID )
            // InternalScanner.g:1069:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_0_0, grammarAccess.getDefineRuleAccess().getNameIDTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDefineRuleRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_0_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_1=(Token)match(input,31,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDefineRuleAccess().getEqualsSignKeyword_1());
              		
            }
            // InternalScanner.g:1089:3: ( (lv_rule_2_0= ruleDefineRegex ) )
            // InternalScanner.g:1090:4: (lv_rule_2_0= ruleDefineRegex )
            {
            // InternalScanner.g:1090:4: (lv_rule_2_0= ruleDefineRegex )
            // InternalScanner.g:1091:5: lv_rule_2_0= ruleDefineRegex
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDefineRuleAccess().getRuleDefineRegexParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_13);
            lv_rule_2_0=ruleDefineRegex();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDefineRuleRule());
              					}
              					set(
              						current,
              						"rule",
              						lv_rule_2_0,
              						"org.xtext.cocktail.Scanner.DefineRegex");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,18,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getDefineRuleAccess().getFullStopKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleDefineRule"


    // $ANTLR start "entryRuleDefineRegex"
    // InternalScanner.g:1116:1: entryRuleDefineRegex returns [String current=null] : iv_ruleDefineRegex= ruleDefineRegex EOF ;
    public final String entryRuleDefineRegex() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDefineRegex = null;


        try {
            // InternalScanner.g:1116:51: (iv_ruleDefineRegex= ruleDefineRegex EOF )
            // InternalScanner.g:1117:2: iv_ruleDefineRegex= ruleDefineRegex EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDefineRegexRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDefineRegex=ruleDefineRegex();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDefineRegex.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDefineRegex"


    // $ANTLR start "ruleDefineRegex"
    // InternalScanner.g:1123:1: ruleDefineRegex returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Regex_0= ruleRegex )* ;
    public final AntlrDatatypeRuleToken ruleDefineRegex() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Regex_0 = null;



        	enterRule();

        try {
            // InternalScanner.g:1129:2: ( (this_Regex_0= ruleRegex )* )
            // InternalScanner.g:1130:2: (this_Regex_0= ruleRegex )*
            {
            // InternalScanner.g:1130:2: (this_Regex_0= ruleRegex )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==18) ) {
                    switch ( input.LA(2) ) {
                    case EOF:
                        {
                        int LA5_4 = input.LA(3);

                        if ( (LA5_4==EOF) ) {
                            alt5=1;
                        }


                        }
                        break;
                    case RULE_ID:
                        {
                        int LA5_5 = input.LA(3);

                        if ( (LA5_5==EOF||(LA5_5>=RULE_ID && LA5_5<=RULE_WS)||(LA5_5>=11 && LA5_5<=24)||(LA5_5>=45 && LA5_5<=46)) ) {
                            alt5=1;
                        }


                        }
                        break;
                    case RULE_INT:
                    case RULE_STRING:
                    case RULE_WS:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 45:
                    case 46:
                        {
                        alt5=1;
                        }
                        break;

                    }

                }
                else if ( ((LA5_0>=RULE_ID && LA5_0<=RULE_WS)||(LA5_0>=11 && LA5_0<=17)||(LA5_0>=19 && LA5_0<=24)||(LA5_0>=45 && LA5_0<=46)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalScanner.g:1131:3: this_Regex_0= ruleRegex
            	    {
            	    if ( state.backtracking==0 ) {

            	      			newCompositeNode(grammarAccess.getDefineRegexAccess().getRegexParserRuleCall());
            	      		
            	    }
            	    pushFollow(FOLLOW_14);
            	    this_Regex_0=ruleRegex();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			current.merge(this_Regex_0);
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      			afterParserOrEnumRuleCall();
            	      		
            	    }

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleDefineRegex"


    // $ANTLR start "entryRuleStartStates"
    // InternalScanner.g:1145:1: entryRuleStartStates returns [EObject current=null] : iv_ruleStartStates= ruleStartStates EOF ;
    public final EObject entryRuleStartStates() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStartStates = null;


        try {
            // InternalScanner.g:1145:52: (iv_ruleStartStates= ruleStartStates EOF )
            // InternalScanner.g:1146:2: iv_ruleStartStates= ruleStartStates EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStartStatesRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleStartStates=ruleStartStates();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStartStates; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleStartStates"


    // $ANTLR start "ruleStartStates"
    // InternalScanner.g:1152:1: ruleStartStates returns [EObject current=null] : (otherlv_0= 'START' ( (lv_incstates_1_0= ruleStartState ) ) (otherlv_2= ',' ( (lv_incstates_3_0= ruleStartState ) ) )* (otherlv_4= '-' ( (lv_exstates_5_0= ruleStartState ) ) (otherlv_6= ',' ( (lv_exstates_7_0= ruleStartState ) ) )* )? ) ;
    public final EObject ruleStartStates() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_incstates_1_0 = null;

        EObject lv_incstates_3_0 = null;

        EObject lv_exstates_5_0 = null;

        EObject lv_exstates_7_0 = null;



        	enterRule();

        try {
            // InternalScanner.g:1158:2: ( (otherlv_0= 'START' ( (lv_incstates_1_0= ruleStartState ) ) (otherlv_2= ',' ( (lv_incstates_3_0= ruleStartState ) ) )* (otherlv_4= '-' ( (lv_exstates_5_0= ruleStartState ) ) (otherlv_6= ',' ( (lv_exstates_7_0= ruleStartState ) ) )* )? ) )
            // InternalScanner.g:1159:2: (otherlv_0= 'START' ( (lv_incstates_1_0= ruleStartState ) ) (otherlv_2= ',' ( (lv_incstates_3_0= ruleStartState ) ) )* (otherlv_4= '-' ( (lv_exstates_5_0= ruleStartState ) ) (otherlv_6= ',' ( (lv_exstates_7_0= ruleStartState ) ) )* )? )
            {
            // InternalScanner.g:1159:2: (otherlv_0= 'START' ( (lv_incstates_1_0= ruleStartState ) ) (otherlv_2= ',' ( (lv_incstates_3_0= ruleStartState ) ) )* (otherlv_4= '-' ( (lv_exstates_5_0= ruleStartState ) ) (otherlv_6= ',' ( (lv_exstates_7_0= ruleStartState ) ) )* )? )
            // InternalScanner.g:1160:3: otherlv_0= 'START' ( (lv_incstates_1_0= ruleStartState ) ) (otherlv_2= ',' ( (lv_incstates_3_0= ruleStartState ) ) )* (otherlv_4= '-' ( (lv_exstates_5_0= ruleStartState ) ) (otherlv_6= ',' ( (lv_exstates_7_0= ruleStartState ) ) )* )?
            {
            otherlv_0=(Token)match(input,42,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getStartStatesAccess().getSTARTKeyword_0());
              		
            }
            // InternalScanner.g:1164:3: ( (lv_incstates_1_0= ruleStartState ) )
            // InternalScanner.g:1165:4: (lv_incstates_1_0= ruleStartState )
            {
            // InternalScanner.g:1165:4: (lv_incstates_1_0= ruleStartState )
            // InternalScanner.g:1166:5: lv_incstates_1_0= ruleStartState
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getStartStatesAccess().getIncstatesStartStateParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_15);
            lv_incstates_1_0=ruleStartState();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getStartStatesRule());
              					}
              					add(
              						current,
              						"incstates",
              						lv_incstates_1_0,
              						"org.xtext.cocktail.Scanner.StartState");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalScanner.g:1183:3: (otherlv_2= ',' ( (lv_incstates_3_0= ruleStartState ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==32) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalScanner.g:1184:4: otherlv_2= ',' ( (lv_incstates_3_0= ruleStartState ) )
            	    {
            	    otherlv_2=(Token)match(input,32,FOLLOW_8); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getStartStatesAccess().getCommaKeyword_2_0());
            	      			
            	    }
            	    // InternalScanner.g:1188:4: ( (lv_incstates_3_0= ruleStartState ) )
            	    // InternalScanner.g:1189:5: (lv_incstates_3_0= ruleStartState )
            	    {
            	    // InternalScanner.g:1189:5: (lv_incstates_3_0= ruleStartState )
            	    // InternalScanner.g:1190:6: lv_incstates_3_0= ruleStartState
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getStartStatesAccess().getIncstatesStartStateParserRuleCall_2_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_15);
            	    lv_incstates_3_0=ruleStartState();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getStartStatesRule());
            	      						}
            	      						add(
            	      							current,
            	      							"incstates",
            	      							lv_incstates_3_0,
            	      							"org.xtext.cocktail.Scanner.StartState");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // InternalScanner.g:1208:3: (otherlv_4= '-' ( (lv_exstates_5_0= ruleStartState ) ) (otherlv_6= ',' ( (lv_exstates_7_0= ruleStartState ) ) )* )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==14) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalScanner.g:1209:4: otherlv_4= '-' ( (lv_exstates_5_0= ruleStartState ) ) (otherlv_6= ',' ( (lv_exstates_7_0= ruleStartState ) ) )*
                    {
                    otherlv_4=(Token)match(input,14,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getStartStatesAccess().getHyphenMinusKeyword_3_0());
                      			
                    }
                    // InternalScanner.g:1213:4: ( (lv_exstates_5_0= ruleStartState ) )
                    // InternalScanner.g:1214:5: (lv_exstates_5_0= ruleStartState )
                    {
                    // InternalScanner.g:1214:5: (lv_exstates_5_0= ruleStartState )
                    // InternalScanner.g:1215:6: lv_exstates_5_0= ruleStartState
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getStartStatesAccess().getExstatesStartStateParserRuleCall_3_1_0());
                      					
                    }
                    pushFollow(FOLLOW_16);
                    lv_exstates_5_0=ruleStartState();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getStartStatesRule());
                      						}
                      						add(
                      							current,
                      							"exstates",
                      							lv_exstates_5_0,
                      							"org.xtext.cocktail.Scanner.StartState");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalScanner.g:1232:4: (otherlv_6= ',' ( (lv_exstates_7_0= ruleStartState ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==32) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalScanner.g:1233:5: otherlv_6= ',' ( (lv_exstates_7_0= ruleStartState ) )
                    	    {
                    	    otherlv_6=(Token)match(input,32,FOLLOW_8); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_6, grammarAccess.getStartStatesAccess().getCommaKeyword_3_2_0());
                    	      				
                    	    }
                    	    // InternalScanner.g:1237:5: ( (lv_exstates_7_0= ruleStartState ) )
                    	    // InternalScanner.g:1238:6: (lv_exstates_7_0= ruleStartState )
                    	    {
                    	    // InternalScanner.g:1238:6: (lv_exstates_7_0= ruleStartState )
                    	    // InternalScanner.g:1239:7: lv_exstates_7_0= ruleStartState
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getStartStatesAccess().getExstatesStartStateParserRuleCall_3_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_16);
                    	    lv_exstates_7_0=ruleStartState();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getStartStatesRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"exstates",
                    	      								lv_exstates_7_0,
                    	      								"org.xtext.cocktail.Scanner.StartState");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleStartStates"


    // $ANTLR start "entryRuleStartState"
    // InternalScanner.g:1262:1: entryRuleStartState returns [EObject current=null] : iv_ruleStartState= ruleStartState EOF ;
    public final EObject entryRuleStartState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStartState = null;


        try {
            // InternalScanner.g:1262:51: (iv_ruleStartState= ruleStartState EOF )
            // InternalScanner.g:1263:2: iv_ruleStartState= ruleStartState EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStartStateRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleStartState=ruleStartState();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStartState; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalScanner.g:1269:1: ruleStartState returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleStartState() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalScanner.g:1275:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalScanner.g:1276:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalScanner.g:1276:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalScanner.g:1277:3: (lv_name_0_0= RULE_ID )
            {
            // InternalScanner.g:1277:3: (lv_name_0_0= RULE_ID )
            // InternalScanner.g:1278:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_name_0_0, grammarAccess.getStartStateAccess().getNameIDTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

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


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleStartState"


    // $ANTLR start "entryRuleRule"
    // InternalScanner.g:1297:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // InternalScanner.g:1297:45: (iv_ruleRule= ruleRule EOF )
            // InternalScanner.g:1298:2: iv_ruleRule= ruleRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRuleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRule=ruleRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRule; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // InternalScanner.g:1304:1: ruleRule returns [EObject current=null] : ( ( ( (lv_info_0_1= 'RULE' | lv_info_0_2= 'RULES' ) ) ) ( (lv_rules_1_0= ruleSingleRule ) )* ) ;
    public final EObject ruleRule() throws RecognitionException {
        EObject current = null;

        Token lv_info_0_1=null;
        Token lv_info_0_2=null;
        EObject lv_rules_1_0 = null;



        	enterRule();

        try {
            // InternalScanner.g:1310:2: ( ( ( ( (lv_info_0_1= 'RULE' | lv_info_0_2= 'RULES' ) ) ) ( (lv_rules_1_0= ruleSingleRule ) )* ) )
            // InternalScanner.g:1311:2: ( ( ( (lv_info_0_1= 'RULE' | lv_info_0_2= 'RULES' ) ) ) ( (lv_rules_1_0= ruleSingleRule ) )* )
            {
            // InternalScanner.g:1311:2: ( ( ( (lv_info_0_1= 'RULE' | lv_info_0_2= 'RULES' ) ) ) ( (lv_rules_1_0= ruleSingleRule ) )* )
            // InternalScanner.g:1312:3: ( ( (lv_info_0_1= 'RULE' | lv_info_0_2= 'RULES' ) ) ) ( (lv_rules_1_0= ruleSingleRule ) )*
            {
            // InternalScanner.g:1312:3: ( ( (lv_info_0_1= 'RULE' | lv_info_0_2= 'RULES' ) ) )
            // InternalScanner.g:1313:4: ( (lv_info_0_1= 'RULE' | lv_info_0_2= 'RULES' ) )
            {
            // InternalScanner.g:1313:4: ( (lv_info_0_1= 'RULE' | lv_info_0_2= 'RULES' ) )
            // InternalScanner.g:1314:5: (lv_info_0_1= 'RULE' | lv_info_0_2= 'RULES' )
            {
            // InternalScanner.g:1314:5: (lv_info_0_1= 'RULE' | lv_info_0_2= 'RULES' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==43) ) {
                alt9=1;
            }
            else if ( (LA9_0==44) ) {
                alt9=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalScanner.g:1315:6: lv_info_0_1= 'RULE'
                    {
                    lv_info_0_1=(Token)match(input,43,FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_info_0_1, grammarAccess.getRuleAccess().getInfoRULEKeyword_0_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getRuleRule());
                      						}
                      						setWithLastConsumed(current, "info", lv_info_0_1, null);
                      					
                    }

                    }
                    break;
                case 2 :
                    // InternalScanner.g:1326:6: lv_info_0_2= 'RULES'
                    {
                    lv_info_0_2=(Token)match(input,44,FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_info_0_2, grammarAccess.getRuleAccess().getInfoRULESKeyword_0_0_1());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getRuleRule());
                      						}
                      						setWithLastConsumed(current, "info", lv_info_0_2, null);
                      					
                    }

                    }
                    break;

            }


            }


            }

            // InternalScanner.g:1339:3: ( (lv_rules_1_0= ruleSingleRule ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=RULE_ID && LA10_0<=RULE_WS)||(LA10_0>=11 && LA10_0<=25)||LA10_0==29||(LA10_0>=45 && LA10_0<=47)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalScanner.g:1340:4: (lv_rules_1_0= ruleSingleRule )
            	    {
            	    // InternalScanner.g:1340:4: (lv_rules_1_0= ruleSingleRule )
            	    // InternalScanner.g:1341:5: lv_rules_1_0= ruleSingleRule
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getRuleAccess().getRulesSingleRuleParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_17);
            	    lv_rules_1_0=ruleSingleRule();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getRuleRule());
            	      					}
            	      					add(
            	      						current,
            	      						"rules",
            	      						lv_rules_1_0,
            	      						"org.xtext.cocktail.Scanner.SingleRule");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleSingleRule"
    // InternalScanner.g:1362:1: entryRuleSingleRule returns [EObject current=null] : iv_ruleSingleRule= ruleSingleRule EOF ;
    public final EObject entryRuleSingleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleRule = null;


        try {
            // InternalScanner.g:1362:51: (iv_ruleSingleRule= ruleSingleRule EOF )
            // InternalScanner.g:1363:2: iv_ruleSingleRule= ruleSingleRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSingleRuleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSingleRule=ruleSingleRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSingleRule; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSingleRule"


    // $ANTLR start "ruleSingleRule"
    // InternalScanner.g:1369:1: ruleSingleRule returns [EObject current=null] : ( ( (lv_start_0_0= ruleRuleStart ) )? ( (lv_rule_1_0= ruleRuleDefinition ) ) otherlv_2= ':' (otherlv_3= '-' )? otherlv_4= '{' ( (lv_content_5_0= ruleCodeBlock ) ) otherlv_6= '}' ) ;
    public final EObject ruleSingleRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_start_0_0 = null;

        EObject lv_rule_1_0 = null;

        AntlrDatatypeRuleToken lv_content_5_0 = null;



        	enterRule();

        try {
            // InternalScanner.g:1375:2: ( ( ( (lv_start_0_0= ruleRuleStart ) )? ( (lv_rule_1_0= ruleRuleDefinition ) ) otherlv_2= ':' (otherlv_3= '-' )? otherlv_4= '{' ( (lv_content_5_0= ruleCodeBlock ) ) otherlv_6= '}' ) )
            // InternalScanner.g:1376:2: ( ( (lv_start_0_0= ruleRuleStart ) )? ( (lv_rule_1_0= ruleRuleDefinition ) ) otherlv_2= ':' (otherlv_3= '-' )? otherlv_4= '{' ( (lv_content_5_0= ruleCodeBlock ) ) otherlv_6= '}' )
            {
            // InternalScanner.g:1376:2: ( ( (lv_start_0_0= ruleRuleStart ) )? ( (lv_rule_1_0= ruleRuleDefinition ) ) otherlv_2= ':' (otherlv_3= '-' )? otherlv_4= '{' ( (lv_content_5_0= ruleCodeBlock ) ) otherlv_6= '}' )
            // InternalScanner.g:1377:3: ( (lv_start_0_0= ruleRuleStart ) )? ( (lv_rule_1_0= ruleRuleDefinition ) ) otherlv_2= ':' (otherlv_3= '-' )? otherlv_4= '{' ( (lv_content_5_0= ruleCodeBlock ) ) otherlv_6= '}'
            {
            // InternalScanner.g:1377:3: ( (lv_start_0_0= ruleRuleStart ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==25||LA11_0==47) ) {
                alt11=1;
            }
            else if ( (LA11_0==14) ) {
                int LA11_2 = input.LA(2);

                if ( (LA11_2==25) ) {
                    alt11=1;
                }
            }
            switch (alt11) {
                case 1 :
                    // InternalScanner.g:1378:4: (lv_start_0_0= ruleRuleStart )
                    {
                    // InternalScanner.g:1378:4: (lv_start_0_0= ruleRuleStart )
                    // InternalScanner.g:1379:5: lv_start_0_0= ruleRuleStart
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getSingleRuleAccess().getStartRuleStartParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_18);
                    lv_start_0_0=ruleRuleStart();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getSingleRuleRule());
                      					}
                      					set(
                      						current,
                      						"start",
                      						lv_start_0_0,
                      						"org.xtext.cocktail.Scanner.RuleStart");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalScanner.g:1396:3: ( (lv_rule_1_0= ruleRuleDefinition ) )
            // InternalScanner.g:1397:4: (lv_rule_1_0= ruleRuleDefinition )
            {
            // InternalScanner.g:1397:4: (lv_rule_1_0= ruleRuleDefinition )
            // InternalScanner.g:1398:5: lv_rule_1_0= ruleRuleDefinition
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSingleRuleAccess().getRuleRuleDefinitionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_19);
            lv_rule_1_0=ruleRuleDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSingleRuleRule());
              					}
              					set(
              						current,
              						"rule",
              						lv_rule_1_0,
              						"org.xtext.cocktail.Scanner.RuleDefinition");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,29,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getSingleRuleAccess().getColonKeyword_2());
              		
            }
            // InternalScanner.g:1419:3: (otherlv_3= '-' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==14) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalScanner.g:1420:4: otherlv_3= '-'
                    {
                    otherlv_3=(Token)match(input,14,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getSingleRuleAccess().getHyphenMinusKeyword_3());
                      			
                    }

                    }
                    break;

            }

            otherlv_4=(Token)match(input,11,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getSingleRuleAccess().getLeftCurlyBracketKeyword_4());
              		
            }
            // InternalScanner.g:1429:3: ( (lv_content_5_0= ruleCodeBlock ) )
            // InternalScanner.g:1430:4: (lv_content_5_0= ruleCodeBlock )
            {
            // InternalScanner.g:1430:4: (lv_content_5_0= ruleCodeBlock )
            // InternalScanner.g:1431:5: lv_content_5_0= ruleCodeBlock
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSingleRuleAccess().getContentCodeBlockParserRuleCall_5_0());
              				
            }
            pushFollow(FOLLOW_7);
            lv_content_5_0=ruleCodeBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSingleRuleRule());
              					}
              					set(
              						current,
              						"content",
              						lv_content_5_0,
              						"org.xtext.cocktail.Scanner.CodeBlock");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_6=(Token)match(input,12,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getSingleRuleAccess().getRightCurlyBracketKeyword_6());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSingleRule"


    // $ANTLR start "entryRuleRegex"
    // InternalScanner.g:1456:1: entryRuleRegex returns [String current=null] : iv_ruleRegex= ruleRegex EOF ;
    public final String entryRuleRegex() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRegex = null;


        try {
            // InternalScanner.g:1456:45: (iv_ruleRegex= ruleRegex EOF )
            // InternalScanner.g:1457:2: iv_ruleRegex= ruleRegex EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRegexRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRegex=ruleRegex();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRegex.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleRegex"


    // $ANTLR start "ruleRegex"
    // InternalScanner.g:1463:1: ruleRegex returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_INT_1= RULE_INT | this_STRING_2= RULE_STRING | this_WS_3= RULE_WS | kw= '+' | kw= '-' | kw= '(' | kw= ')' | kw= '*' | kw= '.' | kw= '/' | kw= '\\\\' | kw= '|' | kw= '?' | kw= '>' | kw= '<' | kw= '{' | kw= '}' | kw= '\"' | kw= '\\'' ) ;
    public final AntlrDatatypeRuleToken ruleRegex() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_INT_1=null;
        Token this_STRING_2=null;
        Token this_WS_3=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalScanner.g:1469:2: ( (this_ID_0= RULE_ID | this_INT_1= RULE_INT | this_STRING_2= RULE_STRING | this_WS_3= RULE_WS | kw= '+' | kw= '-' | kw= '(' | kw= ')' | kw= '*' | kw= '.' | kw= '/' | kw= '\\\\' | kw= '|' | kw= '?' | kw= '>' | kw= '<' | kw= '{' | kw= '}' | kw= '\"' | kw= '\\'' ) )
            // InternalScanner.g:1470:2: (this_ID_0= RULE_ID | this_INT_1= RULE_INT | this_STRING_2= RULE_STRING | this_WS_3= RULE_WS | kw= '+' | kw= '-' | kw= '(' | kw= ')' | kw= '*' | kw= '.' | kw= '/' | kw= '\\\\' | kw= '|' | kw= '?' | kw= '>' | kw= '<' | kw= '{' | kw= '}' | kw= '\"' | kw= '\\'' )
            {
            // InternalScanner.g:1470:2: (this_ID_0= RULE_ID | this_INT_1= RULE_INT | this_STRING_2= RULE_STRING | this_WS_3= RULE_WS | kw= '+' | kw= '-' | kw= '(' | kw= ')' | kw= '*' | kw= '.' | kw= '/' | kw= '\\\\' | kw= '|' | kw= '?' | kw= '>' | kw= '<' | kw= '{' | kw= '}' | kw= '\"' | kw= '\\'' )
            int alt13=20;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt13=1;
                }
                break;
            case RULE_INT:
                {
                alt13=2;
                }
                break;
            case RULE_STRING:
                {
                alt13=3;
                }
                break;
            case RULE_WS:
                {
                alt13=4;
                }
                break;
            case 13:
                {
                alt13=5;
                }
                break;
            case 14:
                {
                alt13=6;
                }
                break;
            case 15:
                {
                alt13=7;
                }
                break;
            case 16:
                {
                alt13=8;
                }
                break;
            case 17:
                {
                alt13=9;
                }
                break;
            case 18:
                {
                alt13=10;
                }
                break;
            case 19:
                {
                alt13=11;
                }
                break;
            case 20:
                {
                alt13=12;
                }
                break;
            case 21:
                {
                alt13=13;
                }
                break;
            case 22:
                {
                alt13=14;
                }
                break;
            case 23:
                {
                alt13=15;
                }
                break;
            case 24:
                {
                alt13=16;
                }
                break;
            case 11:
                {
                alt13=17;
                }
                break;
            case 12:
                {
                alt13=18;
                }
                break;
            case 45:
                {
                alt13=19;
                }
                break;
            case 46:
                {
                alt13=20;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalScanner.g:1471:3: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_ID_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_ID_0, grammarAccess.getRegexAccess().getIDTerminalRuleCall_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalScanner.g:1479:3: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_INT_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_INT_1, grammarAccess.getRegexAccess().getINTTerminalRuleCall_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalScanner.g:1487:3: this_STRING_2= RULE_STRING
                    {
                    this_STRING_2=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_STRING_2);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_STRING_2, grammarAccess.getRegexAccess().getSTRINGTerminalRuleCall_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalScanner.g:1495:3: this_WS_3= RULE_WS
                    {
                    this_WS_3=(Token)match(input,RULE_WS,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_WS_3);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_WS_3, grammarAccess.getRegexAccess().getWSTerminalRuleCall_3());
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalScanner.g:1503:3: kw= '+'
                    {
                    kw=(Token)match(input,13,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getRegexAccess().getPlusSignKeyword_4());
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalScanner.g:1509:3: kw= '-'
                    {
                    kw=(Token)match(input,14,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getRegexAccess().getHyphenMinusKeyword_5());
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalScanner.g:1515:3: kw= '('
                    {
                    kw=(Token)match(input,15,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getRegexAccess().getLeftParenthesisKeyword_6());
                      		
                    }

                    }
                    break;
                case 8 :
                    // InternalScanner.g:1521:3: kw= ')'
                    {
                    kw=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getRegexAccess().getRightParenthesisKeyword_7());
                      		
                    }

                    }
                    break;
                case 9 :
                    // InternalScanner.g:1527:3: kw= '*'
                    {
                    kw=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getRegexAccess().getAsteriskKeyword_8());
                      		
                    }

                    }
                    break;
                case 10 :
                    // InternalScanner.g:1533:3: kw= '.'
                    {
                    kw=(Token)match(input,18,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getRegexAccess().getFullStopKeyword_9());
                      		
                    }

                    }
                    break;
                case 11 :
                    // InternalScanner.g:1539:3: kw= '/'
                    {
                    kw=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getRegexAccess().getSolidusKeyword_10());
                      		
                    }

                    }
                    break;
                case 12 :
                    // InternalScanner.g:1545:3: kw= '\\\\'
                    {
                    kw=(Token)match(input,20,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getRegexAccess().getReverseSolidusKeyword_11());
                      		
                    }

                    }
                    break;
                case 13 :
                    // InternalScanner.g:1551:3: kw= '|'
                    {
                    kw=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getRegexAccess().getVerticalLineKeyword_12());
                      		
                    }

                    }
                    break;
                case 14 :
                    // InternalScanner.g:1557:3: kw= '?'
                    {
                    kw=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getRegexAccess().getQuestionMarkKeyword_13());
                      		
                    }

                    }
                    break;
                case 15 :
                    // InternalScanner.g:1563:3: kw= '>'
                    {
                    kw=(Token)match(input,23,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getRegexAccess().getGreaterThanSignKeyword_14());
                      		
                    }

                    }
                    break;
                case 16 :
                    // InternalScanner.g:1569:3: kw= '<'
                    {
                    kw=(Token)match(input,24,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getRegexAccess().getLessThanSignKeyword_15());
                      		
                    }

                    }
                    break;
                case 17 :
                    // InternalScanner.g:1575:3: kw= '{'
                    {
                    kw=(Token)match(input,11,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getRegexAccess().getLeftCurlyBracketKeyword_16());
                      		
                    }

                    }
                    break;
                case 18 :
                    // InternalScanner.g:1581:3: kw= '}'
                    {
                    kw=(Token)match(input,12,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getRegexAccess().getRightCurlyBracketKeyword_17());
                      		
                    }

                    }
                    break;
                case 19 :
                    // InternalScanner.g:1587:3: kw= '\"'
                    {
                    kw=(Token)match(input,45,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getRegexAccess().getQuotationMarkKeyword_18());
                      		
                    }

                    }
                    break;
                case 20 :
                    // InternalScanner.g:1593:3: kw= '\\''
                    {
                    kw=(Token)match(input,46,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getRegexAccess().getApostropheKeyword_19());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleRegex"


    // $ANTLR start "entryRuleRuleDefinition"
    // InternalScanner.g:1602:1: entryRuleRuleDefinition returns [EObject current=null] : iv_ruleRuleDefinition= ruleRuleDefinition EOF ;
    public final EObject entryRuleRuleDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRuleDefinition = null;


        try {
            // InternalScanner.g:1602:55: (iv_ruleRuleDefinition= ruleRuleDefinition EOF )
            // InternalScanner.g:1603:2: iv_ruleRuleDefinition= ruleRuleDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRuleDefinitionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRuleDefinition=ruleRuleDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRuleDefinition; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleRuleDefinition"


    // $ANTLR start "ruleRuleDefinition"
    // InternalScanner.g:1609:1: ruleRuleDefinition returns [EObject current=null] : ( (lv_parts_0_0= ruleRulePart ) )* ;
    public final EObject ruleRuleDefinition() throws RecognitionException {
        EObject current = null;

        EObject lv_parts_0_0 = null;



        	enterRule();

        try {
            // InternalScanner.g:1615:2: ( ( (lv_parts_0_0= ruleRulePart ) )* )
            // InternalScanner.g:1616:2: ( (lv_parts_0_0= ruleRulePart ) )*
            {
            // InternalScanner.g:1616:2: ( (lv_parts_0_0= ruleRulePart ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=RULE_ID && LA14_0<=RULE_WS)||(LA14_0>=11 && LA14_0<=24)||(LA14_0>=45 && LA14_0<=46)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalScanner.g:1617:3: (lv_parts_0_0= ruleRulePart )
            	    {
            	    // InternalScanner.g:1617:3: (lv_parts_0_0= ruleRulePart )
            	    // InternalScanner.g:1618:4: lv_parts_0_0= ruleRulePart
            	    {
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getRuleDefinitionAccess().getPartsRulePartParserRuleCall_0());
            	      			
            	    }
            	    pushFollow(FOLLOW_14);
            	    lv_parts_0_0=ruleRulePart();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				if (current==null) {
            	      					current = createModelElementForParent(grammarAccess.getRuleDefinitionRule());
            	      				}
            	      				add(
            	      					current,
            	      					"parts",
            	      					lv_parts_0_0,
            	      					"org.xtext.cocktail.Scanner.RulePart");
            	      				afterParserOrEnumRuleCall();
            	      			
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleRuleDefinition"


    // $ANTLR start "entryRuleRulePart"
    // InternalScanner.g:1638:1: entryRuleRulePart returns [EObject current=null] : iv_ruleRulePart= ruleRulePart EOF ;
    public final EObject entryRuleRulePart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRulePart = null;


        try {
            // InternalScanner.g:1638:49: (iv_ruleRulePart= ruleRulePart EOF )
            // InternalScanner.g:1639:2: iv_ruleRulePart= ruleRulePart EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRulePartRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRulePart=ruleRulePart();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRulePart; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalScanner.g:1645:1: ruleRulePart returns [EObject current=null] : ( ( (lv_reg_0_0= ruleRegex ) ) | ( ( RULE_ID )=> (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleRulePart() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_reg_0_0 = null;



        	enterRule();

        try {
            // InternalScanner.g:1651:2: ( ( ( (lv_reg_0_0= ruleRegex ) ) | ( ( RULE_ID )=> (otherlv_1= RULE_ID ) ) ) )
            // InternalScanner.g:1652:2: ( ( (lv_reg_0_0= ruleRegex ) ) | ( ( RULE_ID )=> (otherlv_1= RULE_ID ) ) )
            {
            // InternalScanner.g:1652:2: ( ( (lv_reg_0_0= ruleRegex ) ) | ( ( RULE_ID )=> (otherlv_1= RULE_ID ) ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_ID) ) {
                int LA15_1 = input.LA(2);

                if ( (true) ) {
                    alt15=1;
                }
                else if ( (synpred1_InternalScanner()) ) {
                    alt15=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA15_0>=RULE_INT && LA15_0<=RULE_WS)||(LA15_0>=11 && LA15_0<=24)||(LA15_0>=45 && LA15_0<=46)) ) {
                alt15=1;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalScanner.g:1653:3: ( (lv_reg_0_0= ruleRegex ) )
                    {
                    // InternalScanner.g:1653:3: ( (lv_reg_0_0= ruleRegex ) )
                    // InternalScanner.g:1654:4: (lv_reg_0_0= ruleRegex )
                    {
                    // InternalScanner.g:1654:4: (lv_reg_0_0= ruleRegex )
                    // InternalScanner.g:1655:5: lv_reg_0_0= ruleRegex
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getRulePartAccess().getRegRegexParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_reg_0_0=ruleRegex();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getRulePartRule());
                      					}
                      					set(
                      						current,
                      						"reg",
                      						lv_reg_0_0,
                      						"org.xtext.cocktail.Scanner.Regex");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalScanner.g:1673:3: ( ( RULE_ID )=> (otherlv_1= RULE_ID ) )
                    {
                    // InternalScanner.g:1673:3: ( ( RULE_ID )=> (otherlv_1= RULE_ID ) )
                    // InternalScanner.g:1674:4: ( RULE_ID )=> (otherlv_1= RULE_ID )
                    {
                    // InternalScanner.g:1675:4: (otherlv_1= RULE_ID )
                    // InternalScanner.g:1676:5: otherlv_1= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getRulePartRule());
                      					}
                      				
                    }
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_1, grammarAccess.getRulePartAccess().getRefDefineRuleCrossReference_1_0());
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleRulePart"


    // $ANTLR start "entryRuleRuleStart"
    // InternalScanner.g:1691:1: entryRuleRuleStart returns [EObject current=null] : iv_ruleRuleStart= ruleRuleStart EOF ;
    public final EObject entryRuleRuleStart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRuleStart = null;


        try {
            // InternalScanner.g:1691:50: (iv_ruleRuleStart= ruleRuleStart EOF )
            // InternalScanner.g:1692:2: iv_ruleRuleStart= ruleRuleStart EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRuleStartRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRuleStart=ruleRuleStart();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRuleStart; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleRuleStart"


    // $ANTLR start "ruleRuleStart"
    // InternalScanner.g:1698:1: ruleRuleStart returns [EObject current=null] : ( ( ( (lv_rulePrec_0_0= 'NOT' ) ) | ( (lv_rulePrec_1_0= '-' ) ) )? otherlv_2= '#' ( ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* ) | ( (lv_ruleDefault_6_0= 'STD' ) ) | ( (lv_ruleDefault_7_0= '*' ) ) ) otherlv_8= '#' ) ;
    public final EObject ruleRuleStart() throws RecognitionException {
        EObject current = null;

        Token lv_rulePrec_0_0=null;
        Token lv_rulePrec_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_ruleDefault_6_0=null;
        Token lv_ruleDefault_7_0=null;
        Token otherlv_8=null;


        	enterRule();

        try {
            // InternalScanner.g:1704:2: ( ( ( ( (lv_rulePrec_0_0= 'NOT' ) ) | ( (lv_rulePrec_1_0= '-' ) ) )? otherlv_2= '#' ( ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* ) | ( (lv_ruleDefault_6_0= 'STD' ) ) | ( (lv_ruleDefault_7_0= '*' ) ) ) otherlv_8= '#' ) )
            // InternalScanner.g:1705:2: ( ( ( (lv_rulePrec_0_0= 'NOT' ) ) | ( (lv_rulePrec_1_0= '-' ) ) )? otherlv_2= '#' ( ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* ) | ( (lv_ruleDefault_6_0= 'STD' ) ) | ( (lv_ruleDefault_7_0= '*' ) ) ) otherlv_8= '#' )
            {
            // InternalScanner.g:1705:2: ( ( ( (lv_rulePrec_0_0= 'NOT' ) ) | ( (lv_rulePrec_1_0= '-' ) ) )? otherlv_2= '#' ( ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* ) | ( (lv_ruleDefault_6_0= 'STD' ) ) | ( (lv_ruleDefault_7_0= '*' ) ) ) otherlv_8= '#' )
            // InternalScanner.g:1706:3: ( ( (lv_rulePrec_0_0= 'NOT' ) ) | ( (lv_rulePrec_1_0= '-' ) ) )? otherlv_2= '#' ( ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* ) | ( (lv_ruleDefault_6_0= 'STD' ) ) | ( (lv_ruleDefault_7_0= '*' ) ) ) otherlv_8= '#'
            {
            // InternalScanner.g:1706:3: ( ( (lv_rulePrec_0_0= 'NOT' ) ) | ( (lv_rulePrec_1_0= '-' ) ) )?
            int alt16=3;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==47) ) {
                alt16=1;
            }
            else if ( (LA16_0==14) ) {
                alt16=2;
            }
            switch (alt16) {
                case 1 :
                    // InternalScanner.g:1707:4: ( (lv_rulePrec_0_0= 'NOT' ) )
                    {
                    // InternalScanner.g:1707:4: ( (lv_rulePrec_0_0= 'NOT' ) )
                    // InternalScanner.g:1708:5: (lv_rulePrec_0_0= 'NOT' )
                    {
                    // InternalScanner.g:1708:5: (lv_rulePrec_0_0= 'NOT' )
                    // InternalScanner.g:1709:6: lv_rulePrec_0_0= 'NOT'
                    {
                    lv_rulePrec_0_0=(Token)match(input,47,FOLLOW_21); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_rulePrec_0_0, grammarAccess.getRuleStartAccess().getRulePrecNOTKeyword_0_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getRuleStartRule());
                      						}
                      						setWithLastConsumed(current, "rulePrec", lv_rulePrec_0_0, "NOT");
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalScanner.g:1722:4: ( (lv_rulePrec_1_0= '-' ) )
                    {
                    // InternalScanner.g:1722:4: ( (lv_rulePrec_1_0= '-' ) )
                    // InternalScanner.g:1723:5: (lv_rulePrec_1_0= '-' )
                    {
                    // InternalScanner.g:1723:5: (lv_rulePrec_1_0= '-' )
                    // InternalScanner.g:1724:6: lv_rulePrec_1_0= '-'
                    {
                    lv_rulePrec_1_0=(Token)match(input,14,FOLLOW_21); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_rulePrec_1_0, grammarAccess.getRuleStartAccess().getRulePrecHyphenMinusKeyword_0_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getRuleStartRule());
                      						}
                      						setWithLastConsumed(current, "rulePrec", lv_rulePrec_1_0, "-");
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,25,FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getRuleStartAccess().getNumberSignKeyword_1());
              		
            }
            // InternalScanner.g:1741:3: ( ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* ) | ( (lv_ruleDefault_6_0= 'STD' ) ) | ( (lv_ruleDefault_7_0= '*' ) ) )
            int alt18=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt18=1;
                }
                break;
            case 48:
                {
                alt18=2;
                }
                break;
            case 17:
                {
                alt18=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalScanner.g:1742:4: ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )
                    {
                    // InternalScanner.g:1742:4: ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )
                    // InternalScanner.g:1743:5: ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )*
                    {
                    // InternalScanner.g:1743:5: ( (otherlv_3= RULE_ID ) )
                    // InternalScanner.g:1744:6: (otherlv_3= RULE_ID )
                    {
                    // InternalScanner.g:1744:6: (otherlv_3= RULE_ID )
                    // InternalScanner.g:1745:7: otherlv_3= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElement(grammarAccess.getRuleStartRule());
                      							}
                      						
                    }
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_23); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							newLeafNode(otherlv_3, grammarAccess.getRuleStartAccess().getRuleStatesStartStateCrossReference_2_0_0_0());
                      						
                    }

                    }


                    }

                    // InternalScanner.g:1756:5: (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==32) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // InternalScanner.g:1757:6: otherlv_4= ',' ( (otherlv_5= RULE_ID ) )
                    	    {
                    	    otherlv_4=(Token)match(input,32,FOLLOW_8); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						newLeafNode(otherlv_4, grammarAccess.getRuleStartAccess().getCommaKeyword_2_0_1_0());
                    	      					
                    	    }
                    	    // InternalScanner.g:1761:6: ( (otherlv_5= RULE_ID ) )
                    	    // InternalScanner.g:1762:7: (otherlv_5= RULE_ID )
                    	    {
                    	    // InternalScanner.g:1762:7: (otherlv_5= RULE_ID )
                    	    // InternalScanner.g:1763:8: otherlv_5= RULE_ID
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      								if (current==null) {
                    	      									current = createModelElement(grammarAccess.getRuleStartRule());
                    	      								}
                    	      							
                    	    }
                    	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_23); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      								newLeafNode(otherlv_5, grammarAccess.getRuleStartAccess().getRuleStatesStartStateCrossReference_2_0_1_1_0());
                    	      							
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // InternalScanner.g:1777:4: ( (lv_ruleDefault_6_0= 'STD' ) )
                    {
                    // InternalScanner.g:1777:4: ( (lv_ruleDefault_6_0= 'STD' ) )
                    // InternalScanner.g:1778:5: (lv_ruleDefault_6_0= 'STD' )
                    {
                    // InternalScanner.g:1778:5: (lv_ruleDefault_6_0= 'STD' )
                    // InternalScanner.g:1779:6: lv_ruleDefault_6_0= 'STD'
                    {
                    lv_ruleDefault_6_0=(Token)match(input,48,FOLLOW_21); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_ruleDefault_6_0, grammarAccess.getRuleStartAccess().getRuleDefaultSTDKeyword_2_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getRuleStartRule());
                      						}
                      						setWithLastConsumed(current, "ruleDefault", lv_ruleDefault_6_0, "STD");
                      					
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalScanner.g:1792:4: ( (lv_ruleDefault_7_0= '*' ) )
                    {
                    // InternalScanner.g:1792:4: ( (lv_ruleDefault_7_0= '*' ) )
                    // InternalScanner.g:1793:5: (lv_ruleDefault_7_0= '*' )
                    {
                    // InternalScanner.g:1793:5: (lv_ruleDefault_7_0= '*' )
                    // InternalScanner.g:1794:6: lv_ruleDefault_7_0= '*'
                    {
                    lv_ruleDefault_7_0=(Token)match(input,17,FOLLOW_21); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_ruleDefault_7_0, grammarAccess.getRuleStartAccess().getRuleDefaultAsteriskKeyword_2_2_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getRuleStartRule());
                      						}
                      						setWithLastConsumed(current, "ruleDefault", lv_ruleDefault_7_0, "*");
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,25,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_8, grammarAccess.getRuleStartAccess().getNumberSignKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleRuleStart"

    // $ANTLR start synpred1_InternalScanner
    public final void synpred1_InternalScanner_fragment() throws RecognitionException {   
        // InternalScanner.g:1674:4: ( RULE_ID )
        // InternalScanner.g:1674:5: RULE_ID
        {
        match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalScanner

    // Delegated rules

    public final boolean synpred1_InternalScanner() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalScanner_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA1 dfa1 = new DFA1(this);
    static final String dfa_1s = "\14\uffff";
    static final String dfa_2s = "\1\1\13\uffff";
    static final String dfa_3s = "\1\42\13\uffff";
    static final String dfa_4s = "\1\54\13\uffff";
    static final String dfa_5s = "\1\uffff\1\13\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12";
    static final String dfa_6s = "\1\0\13\uffff}>";
    static final String[] dfa_7s = {
            "\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\2\13",
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
            return "()+ loopback of 104:6: ( ({...}? => ( ({...}? => ( (lv_export_2_0= ruleExport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_global_3_0= ruleGlobal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_local_4_0= ruleLocal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_default_5_0= ruleDefault ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_eof_6_0= ruleEof ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_begin_7_0= ruleBegin ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_close_8_0= ruleClose ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_define_9_0= ruleDefine ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_states_10_0= ruleStartStates ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_rules_11_0= ruleRule ) ) ) ) ) )+";
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

                        else if ( LA1_0 == 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_1(), 0) ) {s = 2;}

                        else if ( LA1_0 == 35 && getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_1(), 1) ) {s = 3;}

                        else if ( LA1_0 == 36 && getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_1(), 2) ) {s = 4;}

                        else if ( LA1_0 == 37 && getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_1(), 3) ) {s = 5;}

                        else if ( LA1_0 == 38 && getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_1(), 4) ) {s = 6;}

                        else if ( LA1_0 == 39 && getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_1(), 5) ) {s = 7;}

                        else if ( LA1_0 == 40 && getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_1(), 6) ) {s = 8;}

                        else if ( LA1_0 == 41 && getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_1(), 7) ) {s = 9;}

                        else if ( LA1_0 == 42 && getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_1(), 8) ) {s = 10;}

                        else if ( LA1_0 >= 43 && LA1_0 <= 44 && getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_1(), 9) ) {s = 11;}

                         
                        input.seek(index1_0);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 1, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00001FFC00000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00001FFC00000002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000001FFFFE8F2L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000001FFFFF8F0L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000600001FFF8F0L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000600001FFF8F2L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000100004002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000E00023FFF8F2L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000600021FFF8F0L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000004800L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0001000000020010L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000102000000L});

}
