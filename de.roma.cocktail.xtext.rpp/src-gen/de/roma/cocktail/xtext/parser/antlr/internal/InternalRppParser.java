package de.roma.cocktail.xtext.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.roma.cocktail.xtext.services.RppGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalRppParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_ANY_OTHER", "'{'", "'}'", "'STD'", "'+'", "'-'", "'('", "')'", "'*'", "'.'", "'/'", "'\\\\'", "'|'", "'?'", "'>'", "'<'", "'['", "']'", "'#'", "'$'", "'%'", "';'", "':'", "'!'", "'='", "','", "'SCANNER'", "'EXPORT'", "'IMPORT'", "'GLOBAL'", "'LOCAL'", "'DEFAULT'", "'EOF'", "'BEGIN'", "'CLOSE'", "'DEFINE'", "'START'", "'RULE'", "'RULES'", "'\"'", "'\\''", "'NOT'"
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
    public static final int T__51=51;
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


        public InternalRppParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalRppParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalRppParser.tokenNames; }
    public String getGrammarFileName() { return "InternalRpp.g"; }



     	private RppGrammarAccess grammarAccess;

        public InternalRppParser(TokenStream input, RppGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected RppGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalRpp.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalRpp.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalRpp.g:65:2: iv_ruleModel= ruleModel EOF
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
    // InternalRpp.g:71:1: ruleModel returns [EObject current=null] : ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_scanner_1_0= ruleScanner ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_export_2_0= ruleExport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_imports_3_0= ruleImport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_global_4_0= ruleGlobal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_local_5_0= ruleLocal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_default_6_0= ruleDefault ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_eof_7_0= ruleEof ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_begin_8_0= ruleBegin ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_close_9_0= ruleClose ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_define_10_0= ruleDefine ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_states_11_0= ruleStartStates ) ) ) ) ) )* ) ) ) ( (lv_rules_12_0= ruleRule ) ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_scanner_1_0 = null;

        EObject lv_export_2_0 = null;

        EObject lv_imports_3_0 = null;

        EObject lv_global_4_0 = null;

        EObject lv_local_5_0 = null;

        EObject lv_default_6_0 = null;

        EObject lv_eof_7_0 = null;

        EObject lv_begin_8_0 = null;

        EObject lv_close_9_0 = null;

        EObject lv_define_10_0 = null;

        EObject lv_states_11_0 = null;

        EObject lv_rules_12_0 = null;



        	enterRule();

        try {
            // InternalRpp.g:77:2: ( ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_scanner_1_0= ruleScanner ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_export_2_0= ruleExport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_imports_3_0= ruleImport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_global_4_0= ruleGlobal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_local_5_0= ruleLocal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_default_6_0= ruleDefault ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_eof_7_0= ruleEof ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_begin_8_0= ruleBegin ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_close_9_0= ruleClose ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_define_10_0= ruleDefine ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_states_11_0= ruleStartStates ) ) ) ) ) )* ) ) ) ( (lv_rules_12_0= ruleRule ) ) ) )
            // InternalRpp.g:78:2: ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_scanner_1_0= ruleScanner ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_export_2_0= ruleExport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_imports_3_0= ruleImport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_global_4_0= ruleGlobal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_local_5_0= ruleLocal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_default_6_0= ruleDefault ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_eof_7_0= ruleEof ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_begin_8_0= ruleBegin ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_close_9_0= ruleClose ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_define_10_0= ruleDefine ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_states_11_0= ruleStartStates ) ) ) ) ) )* ) ) ) ( (lv_rules_12_0= ruleRule ) ) )
            {
            // InternalRpp.g:78:2: ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_scanner_1_0= ruleScanner ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_export_2_0= ruleExport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_imports_3_0= ruleImport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_global_4_0= ruleGlobal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_local_5_0= ruleLocal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_default_6_0= ruleDefault ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_eof_7_0= ruleEof ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_begin_8_0= ruleBegin ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_close_9_0= ruleClose ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_define_10_0= ruleDefine ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_states_11_0= ruleStartStates ) ) ) ) ) )* ) ) ) ( (lv_rules_12_0= ruleRule ) ) )
            // InternalRpp.g:79:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_scanner_1_0= ruleScanner ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_export_2_0= ruleExport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_imports_3_0= ruleImport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_global_4_0= ruleGlobal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_local_5_0= ruleLocal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_default_6_0= ruleDefault ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_eof_7_0= ruleEof ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_begin_8_0= ruleBegin ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_close_9_0= ruleClose ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_define_10_0= ruleDefine ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_states_11_0= ruleStartStates ) ) ) ) ) )* ) ) ) ( (lv_rules_12_0= ruleRule ) )
            {
            // InternalRpp.g:79:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_scanner_1_0= ruleScanner ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_export_2_0= ruleExport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_imports_3_0= ruleImport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_global_4_0= ruleGlobal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_local_5_0= ruleLocal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_default_6_0= ruleDefault ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_eof_7_0= ruleEof ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_begin_8_0= ruleBegin ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_close_9_0= ruleClose ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_define_10_0= ruleDefine ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_states_11_0= ruleStartStates ) ) ) ) ) )* ) ) )
            // InternalRpp.g:80:4: ( ( ( ({...}? => ( ({...}? => ( (lv_scanner_1_0= ruleScanner ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_export_2_0= ruleExport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_imports_3_0= ruleImport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_global_4_0= ruleGlobal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_local_5_0= ruleLocal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_default_6_0= ruleDefault ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_eof_7_0= ruleEof ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_begin_8_0= ruleBegin ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_close_9_0= ruleClose ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_define_10_0= ruleDefine ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_states_11_0= ruleStartStates ) ) ) ) ) )* ) )
            {
            // InternalRpp.g:80:4: ( ( ( ({...}? => ( ({...}? => ( (lv_scanner_1_0= ruleScanner ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_export_2_0= ruleExport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_imports_3_0= ruleImport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_global_4_0= ruleGlobal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_local_5_0= ruleLocal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_default_6_0= ruleDefault ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_eof_7_0= ruleEof ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_begin_8_0= ruleBegin ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_close_9_0= ruleClose ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_define_10_0= ruleDefine ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_states_11_0= ruleStartStates ) ) ) ) ) )* ) )
            // InternalRpp.g:81:5: ( ( ({...}? => ( ({...}? => ( (lv_scanner_1_0= ruleScanner ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_export_2_0= ruleExport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_imports_3_0= ruleImport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_global_4_0= ruleGlobal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_local_5_0= ruleLocal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_default_6_0= ruleDefault ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_eof_7_0= ruleEof ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_begin_8_0= ruleBegin ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_close_9_0= ruleClose ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_define_10_0= ruleDefine ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_states_11_0= ruleStartStates ) ) ) ) ) )* )
            {
            getUnorderedGroupHelper().enter(grammarAccess.getModelAccess().getUnorderedGroup_0());
            // InternalRpp.g:84:5: ( ( ({...}? => ( ({...}? => ( (lv_scanner_1_0= ruleScanner ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_export_2_0= ruleExport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_imports_3_0= ruleImport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_global_4_0= ruleGlobal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_local_5_0= ruleLocal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_default_6_0= ruleDefault ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_eof_7_0= ruleEof ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_begin_8_0= ruleBegin ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_close_9_0= ruleClose ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_define_10_0= ruleDefine ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_states_11_0= ruleStartStates ) ) ) ) ) )* )
            // InternalRpp.g:85:6: ( ({...}? => ( ({...}? => ( (lv_scanner_1_0= ruleScanner ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_export_2_0= ruleExport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_imports_3_0= ruleImport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_global_4_0= ruleGlobal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_local_5_0= ruleLocal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_default_6_0= ruleDefault ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_eof_7_0= ruleEof ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_begin_8_0= ruleBegin ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_close_9_0= ruleClose ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_define_10_0= ruleDefine ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_states_11_0= ruleStartStates ) ) ) ) ) )*
            {
            // InternalRpp.g:85:6: ( ({...}? => ( ({...}? => ( (lv_scanner_1_0= ruleScanner ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_export_2_0= ruleExport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_imports_3_0= ruleImport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_global_4_0= ruleGlobal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_local_5_0= ruleLocal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_default_6_0= ruleDefault ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_eof_7_0= ruleEof ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_begin_8_0= ruleBegin ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_close_9_0= ruleClose ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_define_10_0= ruleDefine ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_states_11_0= ruleStartStates ) ) ) ) ) )*
            loop1:
            do {
                int alt1=12;
                alt1 = dfa1.predict(input);
                switch (alt1) {
            	case 1 :
            	    // InternalRpp.g:86:4: ({...}? => ( ({...}? => ( (lv_scanner_1_0= ruleScanner ) ) ) ) )
            	    {
            	    // InternalRpp.g:86:4: ({...}? => ( ({...}? => ( (lv_scanner_1_0= ruleScanner ) ) ) ) )
            	    // InternalRpp.g:87:5: {...}? => ( ({...}? => ( (lv_scanner_1_0= ruleScanner ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_0(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleModel", "getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_0(), 0)");
            	    }
            	    // InternalRpp.g:87:102: ( ({...}? => ( (lv_scanner_1_0= ruleScanner ) ) ) )
            	    // InternalRpp.g:88:6: ({...}? => ( (lv_scanner_1_0= ruleScanner ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getModelAccess().getUnorderedGroup_0(), 0);
            	    // InternalRpp.g:91:9: ({...}? => ( (lv_scanner_1_0= ruleScanner ) ) )
            	    // InternalRpp.g:91:10: {...}? => ( (lv_scanner_1_0= ruleScanner ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleModel", "true");
            	    }
            	    // InternalRpp.g:91:19: ( (lv_scanner_1_0= ruleScanner ) )
            	    // InternalRpp.g:91:20: (lv_scanner_1_0= ruleScanner )
            	    {
            	    // InternalRpp.g:91:20: (lv_scanner_1_0= ruleScanner )
            	    // InternalRpp.g:92:10: lv_scanner_1_0= ruleScanner
            	    {
            	    if ( state.backtracking==0 ) {

            	      										newCompositeNode(grammarAccess.getModelAccess().getScannerScannerParserRuleCall_0_0_0());
            	      									
            	    }
            	    pushFollow(FOLLOW_3);
            	    lv_scanner_1_0=ruleScanner();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      										if (current==null) {
            	      											current = createModelElementForParent(grammarAccess.getModelRule());
            	      										}
            	      										set(
            	      											current,
            	      											"scanner",
            	      											lv_scanner_1_0,
            	      											"de.roma.cocktail.xtext.Rpp.Scanner");
            	      										afterParserOrEnumRuleCall();
            	      									
            	    }

            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getModelAccess().getUnorderedGroup_0());

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalRpp.g:114:4: ({...}? => ( ({...}? => ( (lv_export_2_0= ruleExport ) ) ) ) )
            	    {
            	    // InternalRpp.g:114:4: ({...}? => ( ({...}? => ( (lv_export_2_0= ruleExport ) ) ) ) )
            	    // InternalRpp.g:115:5: {...}? => ( ({...}? => ( (lv_export_2_0= ruleExport ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_0(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleModel", "getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_0(), 1)");
            	    }
            	    // InternalRpp.g:115:102: ( ({...}? => ( (lv_export_2_0= ruleExport ) ) ) )
            	    // InternalRpp.g:116:6: ({...}? => ( (lv_export_2_0= ruleExport ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getModelAccess().getUnorderedGroup_0(), 1);
            	    // InternalRpp.g:119:9: ({...}? => ( (lv_export_2_0= ruleExport ) ) )
            	    // InternalRpp.g:119:10: {...}? => ( (lv_export_2_0= ruleExport ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleModel", "true");
            	    }
            	    // InternalRpp.g:119:19: ( (lv_export_2_0= ruleExport ) )
            	    // InternalRpp.g:119:20: (lv_export_2_0= ruleExport )
            	    {
            	    // InternalRpp.g:119:20: (lv_export_2_0= ruleExport )
            	    // InternalRpp.g:120:10: lv_export_2_0= ruleExport
            	    {
            	    if ( state.backtracking==0 ) {

            	      										newCompositeNode(grammarAccess.getModelAccess().getExportExportParserRuleCall_0_1_0());
            	      									
            	    }
            	    pushFollow(FOLLOW_3);
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
            	      											"de.roma.cocktail.xtext.Rpp.Export");
            	      										afterParserOrEnumRuleCall();
            	      									
            	    }

            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getModelAccess().getUnorderedGroup_0());

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalRpp.g:142:4: ({...}? => ( ({...}? => ( (lv_imports_3_0= ruleImport ) ) ) ) )
            	    {
            	    // InternalRpp.g:142:4: ({...}? => ( ({...}? => ( (lv_imports_3_0= ruleImport ) ) ) ) )
            	    // InternalRpp.g:143:5: {...}? => ( ({...}? => ( (lv_imports_3_0= ruleImport ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_0(), 2) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleModel", "getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_0(), 2)");
            	    }
            	    // InternalRpp.g:143:102: ( ({...}? => ( (lv_imports_3_0= ruleImport ) ) ) )
            	    // InternalRpp.g:144:6: ({...}? => ( (lv_imports_3_0= ruleImport ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getModelAccess().getUnorderedGroup_0(), 2);
            	    // InternalRpp.g:147:9: ({...}? => ( (lv_imports_3_0= ruleImport ) ) )
            	    // InternalRpp.g:147:10: {...}? => ( (lv_imports_3_0= ruleImport ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleModel", "true");
            	    }
            	    // InternalRpp.g:147:19: ( (lv_imports_3_0= ruleImport ) )
            	    // InternalRpp.g:147:20: (lv_imports_3_0= ruleImport )
            	    {
            	    // InternalRpp.g:147:20: (lv_imports_3_0= ruleImport )
            	    // InternalRpp.g:148:10: lv_imports_3_0= ruleImport
            	    {
            	    if ( state.backtracking==0 ) {

            	      										newCompositeNode(grammarAccess.getModelAccess().getImportsImportParserRuleCall_0_2_0());
            	      									
            	    }
            	    pushFollow(FOLLOW_3);
            	    lv_imports_3_0=ruleImport();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      										if (current==null) {
            	      											current = createModelElementForParent(grammarAccess.getModelRule());
            	      										}
            	      										set(
            	      											current,
            	      											"imports",
            	      											lv_imports_3_0,
            	      											"de.roma.cocktail.xtext.Rpp.Import");
            	      										afterParserOrEnumRuleCall();
            	      									
            	    }

            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getModelAccess().getUnorderedGroup_0());

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalRpp.g:170:4: ({...}? => ( ({...}? => ( (lv_global_4_0= ruleGlobal ) ) ) ) )
            	    {
            	    // InternalRpp.g:170:4: ({...}? => ( ({...}? => ( (lv_global_4_0= ruleGlobal ) ) ) ) )
            	    // InternalRpp.g:171:5: {...}? => ( ({...}? => ( (lv_global_4_0= ruleGlobal ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_0(), 3) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleModel", "getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_0(), 3)");
            	    }
            	    // InternalRpp.g:171:102: ( ({...}? => ( (lv_global_4_0= ruleGlobal ) ) ) )
            	    // InternalRpp.g:172:6: ({...}? => ( (lv_global_4_0= ruleGlobal ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getModelAccess().getUnorderedGroup_0(), 3);
            	    // InternalRpp.g:175:9: ({...}? => ( (lv_global_4_0= ruleGlobal ) ) )
            	    // InternalRpp.g:175:10: {...}? => ( (lv_global_4_0= ruleGlobal ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleModel", "true");
            	    }
            	    // InternalRpp.g:175:19: ( (lv_global_4_0= ruleGlobal ) )
            	    // InternalRpp.g:175:20: (lv_global_4_0= ruleGlobal )
            	    {
            	    // InternalRpp.g:175:20: (lv_global_4_0= ruleGlobal )
            	    // InternalRpp.g:176:10: lv_global_4_0= ruleGlobal
            	    {
            	    if ( state.backtracking==0 ) {

            	      										newCompositeNode(grammarAccess.getModelAccess().getGlobalGlobalParserRuleCall_0_3_0());
            	      									
            	    }
            	    pushFollow(FOLLOW_3);
            	    lv_global_4_0=ruleGlobal();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      										if (current==null) {
            	      											current = createModelElementForParent(grammarAccess.getModelRule());
            	      										}
            	      										set(
            	      											current,
            	      											"global",
            	      											lv_global_4_0,
            	      											"de.roma.cocktail.xtext.Rpp.Global");
            	      										afterParserOrEnumRuleCall();
            	      									
            	    }

            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getModelAccess().getUnorderedGroup_0());

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalRpp.g:198:4: ({...}? => ( ({...}? => ( (lv_local_5_0= ruleLocal ) ) ) ) )
            	    {
            	    // InternalRpp.g:198:4: ({...}? => ( ({...}? => ( (lv_local_5_0= ruleLocal ) ) ) ) )
            	    // InternalRpp.g:199:5: {...}? => ( ({...}? => ( (lv_local_5_0= ruleLocal ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_0(), 4) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleModel", "getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_0(), 4)");
            	    }
            	    // InternalRpp.g:199:102: ( ({...}? => ( (lv_local_5_0= ruleLocal ) ) ) )
            	    // InternalRpp.g:200:6: ({...}? => ( (lv_local_5_0= ruleLocal ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getModelAccess().getUnorderedGroup_0(), 4);
            	    // InternalRpp.g:203:9: ({...}? => ( (lv_local_5_0= ruleLocal ) ) )
            	    // InternalRpp.g:203:10: {...}? => ( (lv_local_5_0= ruleLocal ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleModel", "true");
            	    }
            	    // InternalRpp.g:203:19: ( (lv_local_5_0= ruleLocal ) )
            	    // InternalRpp.g:203:20: (lv_local_5_0= ruleLocal )
            	    {
            	    // InternalRpp.g:203:20: (lv_local_5_0= ruleLocal )
            	    // InternalRpp.g:204:10: lv_local_5_0= ruleLocal
            	    {
            	    if ( state.backtracking==0 ) {

            	      										newCompositeNode(grammarAccess.getModelAccess().getLocalLocalParserRuleCall_0_4_0());
            	      									
            	    }
            	    pushFollow(FOLLOW_3);
            	    lv_local_5_0=ruleLocal();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      										if (current==null) {
            	      											current = createModelElementForParent(grammarAccess.getModelRule());
            	      										}
            	      										set(
            	      											current,
            	      											"local",
            	      											lv_local_5_0,
            	      											"de.roma.cocktail.xtext.Rpp.Local");
            	      										afterParserOrEnumRuleCall();
            	      									
            	    }

            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getModelAccess().getUnorderedGroup_0());

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalRpp.g:226:4: ({...}? => ( ({...}? => ( (lv_default_6_0= ruleDefault ) ) ) ) )
            	    {
            	    // InternalRpp.g:226:4: ({...}? => ( ({...}? => ( (lv_default_6_0= ruleDefault ) ) ) ) )
            	    // InternalRpp.g:227:5: {...}? => ( ({...}? => ( (lv_default_6_0= ruleDefault ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_0(), 5) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleModel", "getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_0(), 5)");
            	    }
            	    // InternalRpp.g:227:102: ( ({...}? => ( (lv_default_6_0= ruleDefault ) ) ) )
            	    // InternalRpp.g:228:6: ({...}? => ( (lv_default_6_0= ruleDefault ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getModelAccess().getUnorderedGroup_0(), 5);
            	    // InternalRpp.g:231:9: ({...}? => ( (lv_default_6_0= ruleDefault ) ) )
            	    // InternalRpp.g:231:10: {...}? => ( (lv_default_6_0= ruleDefault ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleModel", "true");
            	    }
            	    // InternalRpp.g:231:19: ( (lv_default_6_0= ruleDefault ) )
            	    // InternalRpp.g:231:20: (lv_default_6_0= ruleDefault )
            	    {
            	    // InternalRpp.g:231:20: (lv_default_6_0= ruleDefault )
            	    // InternalRpp.g:232:10: lv_default_6_0= ruleDefault
            	    {
            	    if ( state.backtracking==0 ) {

            	      										newCompositeNode(grammarAccess.getModelAccess().getDefaultDefaultParserRuleCall_0_5_0());
            	      									
            	    }
            	    pushFollow(FOLLOW_3);
            	    lv_default_6_0=ruleDefault();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      										if (current==null) {
            	      											current = createModelElementForParent(grammarAccess.getModelRule());
            	      										}
            	      										set(
            	      											current,
            	      											"default",
            	      											lv_default_6_0,
            	      											"de.roma.cocktail.xtext.Rpp.Default");
            	      										afterParserOrEnumRuleCall();
            	      									
            	    }

            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getModelAccess().getUnorderedGroup_0());

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // InternalRpp.g:254:4: ({...}? => ( ({...}? => ( (lv_eof_7_0= ruleEof ) ) ) ) )
            	    {
            	    // InternalRpp.g:254:4: ({...}? => ( ({...}? => ( (lv_eof_7_0= ruleEof ) ) ) ) )
            	    // InternalRpp.g:255:5: {...}? => ( ({...}? => ( (lv_eof_7_0= ruleEof ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_0(), 6) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleModel", "getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_0(), 6)");
            	    }
            	    // InternalRpp.g:255:102: ( ({...}? => ( (lv_eof_7_0= ruleEof ) ) ) )
            	    // InternalRpp.g:256:6: ({...}? => ( (lv_eof_7_0= ruleEof ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getModelAccess().getUnorderedGroup_0(), 6);
            	    // InternalRpp.g:259:9: ({...}? => ( (lv_eof_7_0= ruleEof ) ) )
            	    // InternalRpp.g:259:10: {...}? => ( (lv_eof_7_0= ruleEof ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleModel", "true");
            	    }
            	    // InternalRpp.g:259:19: ( (lv_eof_7_0= ruleEof ) )
            	    // InternalRpp.g:259:20: (lv_eof_7_0= ruleEof )
            	    {
            	    // InternalRpp.g:259:20: (lv_eof_7_0= ruleEof )
            	    // InternalRpp.g:260:10: lv_eof_7_0= ruleEof
            	    {
            	    if ( state.backtracking==0 ) {

            	      										newCompositeNode(grammarAccess.getModelAccess().getEofEofParserRuleCall_0_6_0());
            	      									
            	    }
            	    pushFollow(FOLLOW_3);
            	    lv_eof_7_0=ruleEof();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      										if (current==null) {
            	      											current = createModelElementForParent(grammarAccess.getModelRule());
            	      										}
            	      										set(
            	      											current,
            	      											"eof",
            	      											lv_eof_7_0,
            	      											"de.roma.cocktail.xtext.Rpp.Eof");
            	      										afterParserOrEnumRuleCall();
            	      									
            	    }

            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getModelAccess().getUnorderedGroup_0());

            	    }


            	    }


            	    }
            	    break;
            	case 8 :
            	    // InternalRpp.g:282:4: ({...}? => ( ({...}? => ( (lv_begin_8_0= ruleBegin ) ) ) ) )
            	    {
            	    // InternalRpp.g:282:4: ({...}? => ( ({...}? => ( (lv_begin_8_0= ruleBegin ) ) ) ) )
            	    // InternalRpp.g:283:5: {...}? => ( ({...}? => ( (lv_begin_8_0= ruleBegin ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_0(), 7) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleModel", "getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_0(), 7)");
            	    }
            	    // InternalRpp.g:283:102: ( ({...}? => ( (lv_begin_8_0= ruleBegin ) ) ) )
            	    // InternalRpp.g:284:6: ({...}? => ( (lv_begin_8_0= ruleBegin ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getModelAccess().getUnorderedGroup_0(), 7);
            	    // InternalRpp.g:287:9: ({...}? => ( (lv_begin_8_0= ruleBegin ) ) )
            	    // InternalRpp.g:287:10: {...}? => ( (lv_begin_8_0= ruleBegin ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleModel", "true");
            	    }
            	    // InternalRpp.g:287:19: ( (lv_begin_8_0= ruleBegin ) )
            	    // InternalRpp.g:287:20: (lv_begin_8_0= ruleBegin )
            	    {
            	    // InternalRpp.g:287:20: (lv_begin_8_0= ruleBegin )
            	    // InternalRpp.g:288:10: lv_begin_8_0= ruleBegin
            	    {
            	    if ( state.backtracking==0 ) {

            	      										newCompositeNode(grammarAccess.getModelAccess().getBeginBeginParserRuleCall_0_7_0());
            	      									
            	    }
            	    pushFollow(FOLLOW_3);
            	    lv_begin_8_0=ruleBegin();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      										if (current==null) {
            	      											current = createModelElementForParent(grammarAccess.getModelRule());
            	      										}
            	      										set(
            	      											current,
            	      											"begin",
            	      											lv_begin_8_0,
            	      											"de.roma.cocktail.xtext.Rpp.Begin");
            	      										afterParserOrEnumRuleCall();
            	      									
            	    }

            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getModelAccess().getUnorderedGroup_0());

            	    }


            	    }


            	    }
            	    break;
            	case 9 :
            	    // InternalRpp.g:310:4: ({...}? => ( ({...}? => ( (lv_close_9_0= ruleClose ) ) ) ) )
            	    {
            	    // InternalRpp.g:310:4: ({...}? => ( ({...}? => ( (lv_close_9_0= ruleClose ) ) ) ) )
            	    // InternalRpp.g:311:5: {...}? => ( ({...}? => ( (lv_close_9_0= ruleClose ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_0(), 8) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleModel", "getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_0(), 8)");
            	    }
            	    // InternalRpp.g:311:102: ( ({...}? => ( (lv_close_9_0= ruleClose ) ) ) )
            	    // InternalRpp.g:312:6: ({...}? => ( (lv_close_9_0= ruleClose ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getModelAccess().getUnorderedGroup_0(), 8);
            	    // InternalRpp.g:315:9: ({...}? => ( (lv_close_9_0= ruleClose ) ) )
            	    // InternalRpp.g:315:10: {...}? => ( (lv_close_9_0= ruleClose ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleModel", "true");
            	    }
            	    // InternalRpp.g:315:19: ( (lv_close_9_0= ruleClose ) )
            	    // InternalRpp.g:315:20: (lv_close_9_0= ruleClose )
            	    {
            	    // InternalRpp.g:315:20: (lv_close_9_0= ruleClose )
            	    // InternalRpp.g:316:10: lv_close_9_0= ruleClose
            	    {
            	    if ( state.backtracking==0 ) {

            	      										newCompositeNode(grammarAccess.getModelAccess().getCloseCloseParserRuleCall_0_8_0());
            	      									
            	    }
            	    pushFollow(FOLLOW_3);
            	    lv_close_9_0=ruleClose();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      										if (current==null) {
            	      											current = createModelElementForParent(grammarAccess.getModelRule());
            	      										}
            	      										set(
            	      											current,
            	      											"close",
            	      											lv_close_9_0,
            	      											"de.roma.cocktail.xtext.Rpp.Close");
            	      										afterParserOrEnumRuleCall();
            	      									
            	    }

            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getModelAccess().getUnorderedGroup_0());

            	    }


            	    }


            	    }
            	    break;
            	case 10 :
            	    // InternalRpp.g:338:4: ({...}? => ( ({...}? => ( (lv_define_10_0= ruleDefine ) ) ) ) )
            	    {
            	    // InternalRpp.g:338:4: ({...}? => ( ({...}? => ( (lv_define_10_0= ruleDefine ) ) ) ) )
            	    // InternalRpp.g:339:5: {...}? => ( ({...}? => ( (lv_define_10_0= ruleDefine ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_0(), 9) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleModel", "getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_0(), 9)");
            	    }
            	    // InternalRpp.g:339:102: ( ({...}? => ( (lv_define_10_0= ruleDefine ) ) ) )
            	    // InternalRpp.g:340:6: ({...}? => ( (lv_define_10_0= ruleDefine ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getModelAccess().getUnorderedGroup_0(), 9);
            	    // InternalRpp.g:343:9: ({...}? => ( (lv_define_10_0= ruleDefine ) ) )
            	    // InternalRpp.g:343:10: {...}? => ( (lv_define_10_0= ruleDefine ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleModel", "true");
            	    }
            	    // InternalRpp.g:343:19: ( (lv_define_10_0= ruleDefine ) )
            	    // InternalRpp.g:343:20: (lv_define_10_0= ruleDefine )
            	    {
            	    // InternalRpp.g:343:20: (lv_define_10_0= ruleDefine )
            	    // InternalRpp.g:344:10: lv_define_10_0= ruleDefine
            	    {
            	    if ( state.backtracking==0 ) {

            	      										newCompositeNode(grammarAccess.getModelAccess().getDefineDefineParserRuleCall_0_9_0());
            	      									
            	    }
            	    pushFollow(FOLLOW_3);
            	    lv_define_10_0=ruleDefine();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      										if (current==null) {
            	      											current = createModelElementForParent(grammarAccess.getModelRule());
            	      										}
            	      										set(
            	      											current,
            	      											"define",
            	      											lv_define_10_0,
            	      											"de.roma.cocktail.xtext.Rpp.Define");
            	      										afterParserOrEnumRuleCall();
            	      									
            	    }

            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getModelAccess().getUnorderedGroup_0());

            	    }


            	    }


            	    }
            	    break;
            	case 11 :
            	    // InternalRpp.g:366:4: ({...}? => ( ({...}? => ( (lv_states_11_0= ruleStartStates ) ) ) ) )
            	    {
            	    // InternalRpp.g:366:4: ({...}? => ( ({...}? => ( (lv_states_11_0= ruleStartStates ) ) ) ) )
            	    // InternalRpp.g:367:5: {...}? => ( ({...}? => ( (lv_states_11_0= ruleStartStates ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_0(), 10) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleModel", "getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_0(), 10)");
            	    }
            	    // InternalRpp.g:367:103: ( ({...}? => ( (lv_states_11_0= ruleStartStates ) ) ) )
            	    // InternalRpp.g:368:6: ({...}? => ( (lv_states_11_0= ruleStartStates ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getModelAccess().getUnorderedGroup_0(), 10);
            	    // InternalRpp.g:371:9: ({...}? => ( (lv_states_11_0= ruleStartStates ) ) )
            	    // InternalRpp.g:371:10: {...}? => ( (lv_states_11_0= ruleStartStates ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleModel", "true");
            	    }
            	    // InternalRpp.g:371:19: ( (lv_states_11_0= ruleStartStates ) )
            	    // InternalRpp.g:371:20: (lv_states_11_0= ruleStartStates )
            	    {
            	    // InternalRpp.g:371:20: (lv_states_11_0= ruleStartStates )
            	    // InternalRpp.g:372:10: lv_states_11_0= ruleStartStates
            	    {
            	    if ( state.backtracking==0 ) {

            	      										newCompositeNode(grammarAccess.getModelAccess().getStatesStartStatesParserRuleCall_0_10_0());
            	      									
            	    }
            	    pushFollow(FOLLOW_3);
            	    lv_states_11_0=ruleStartStates();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      										if (current==null) {
            	      											current = createModelElementForParent(grammarAccess.getModelRule());
            	      										}
            	      										set(
            	      											current,
            	      											"states",
            	      											lv_states_11_0,
            	      											"de.roma.cocktail.xtext.Rpp.StartStates");
            	      										afterParserOrEnumRuleCall();
            	      									
            	    }

            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getModelAccess().getUnorderedGroup_0());

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

            getUnorderedGroupHelper().leave(grammarAccess.getModelAccess().getUnorderedGroup_0());

            }

            // InternalRpp.g:401:3: ( (lv_rules_12_0= ruleRule ) )
            // InternalRpp.g:402:4: (lv_rules_12_0= ruleRule )
            {
            // InternalRpp.g:402:4: (lv_rules_12_0= ruleRule )
            // InternalRpp.g:403:5: lv_rules_12_0= ruleRule
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getModelAccess().getRulesRuleParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_rules_12_0=ruleRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getModelRule());
              					}
              					set(
              						current,
              						"rules",
              						lv_rules_12_0,
              						"de.roma.cocktail.xtext.Rpp.Rule");
              					afterParserOrEnumRuleCall();
              				
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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleCodeBlock"
    // InternalRpp.g:424:1: entryRuleCodeBlock returns [String current=null] : iv_ruleCodeBlock= ruleCodeBlock EOF ;
    public final String entryRuleCodeBlock() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCodeBlock = null;


        try {
            // InternalRpp.g:424:49: (iv_ruleCodeBlock= ruleCodeBlock EOF )
            // InternalRpp.g:425:2: iv_ruleCodeBlock= ruleCodeBlock EOF
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
    // InternalRpp.g:431:1: ruleCodeBlock returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_CodeWall_0= ruleCodeWall | (kw= '{' this_CodeBlock_2= ruleCodeBlock kw= '}' ) )* ;
    public final AntlrDatatypeRuleToken ruleCodeBlock() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_CodeWall_0 = null;

        AntlrDatatypeRuleToken this_CodeBlock_2 = null;



        	enterRule();

        try {
            // InternalRpp.g:437:2: ( (this_CodeWall_0= ruleCodeWall | (kw= '{' this_CodeBlock_2= ruleCodeBlock kw= '}' ) )* )
            // InternalRpp.g:438:2: (this_CodeWall_0= ruleCodeWall | (kw= '{' this_CodeBlock_2= ruleCodeBlock kw= '}' ) )*
            {
            // InternalRpp.g:438:2: (this_CodeWall_0= ruleCodeWall | (kw= '{' this_CodeBlock_2= ruleCodeBlock kw= '}' ) )*
            loop2:
            do {
                int alt2=3;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=RULE_ID && LA2_0<=RULE_WS)||(LA2_0>=13 && LA2_0<=35)) ) {
                    alt2=1;
                }
                else if ( (LA2_0==11) ) {
                    alt2=2;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalRpp.g:439:3: this_CodeWall_0= ruleCodeWall
            	    {
            	    if ( state.backtracking==0 ) {

            	      			newCompositeNode(grammarAccess.getCodeBlockAccess().getCodeWallParserRuleCall_0());
            	      		
            	    }
            	    pushFollow(FOLLOW_4);
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
            	    // InternalRpp.g:450:3: (kw= '{' this_CodeBlock_2= ruleCodeBlock kw= '}' )
            	    {
            	    // InternalRpp.g:450:3: (kw= '{' this_CodeBlock_2= ruleCodeBlock kw= '}' )
            	    // InternalRpp.g:451:4: kw= '{' this_CodeBlock_2= ruleCodeBlock kw= '}'
            	    {
            	    kw=(Token)match(input,11,FOLLOW_5); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getCodeBlockAccess().getLeftCurlyBracketKeyword_1_0());
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getCodeBlockAccess().getCodeBlockParserRuleCall_1_1());
            	      			
            	    }
            	    pushFollow(FOLLOW_6);
            	    this_CodeBlock_2=ruleCodeBlock();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_CodeBlock_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				afterParserOrEnumRuleCall();
            	      			
            	    }
            	    kw=(Token)match(input,12,FOLLOW_4); if (state.failed) return current;
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
    // InternalRpp.g:476:1: entryRuleCodeWall returns [String current=null] : iv_ruleCodeWall= ruleCodeWall EOF ;
    public final String entryRuleCodeWall() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCodeWall = null;


        try {
            // InternalRpp.g:476:48: (iv_ruleCodeWall= ruleCodeWall EOF )
            // InternalRpp.g:477:2: iv_ruleCodeWall= ruleCodeWall EOF
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
    // InternalRpp.g:483:1: ruleCodeWall returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( ( 'STD' )=>kw= 'STD' ) | this_ID_1= RULE_ID | this_INT_2= RULE_INT | this_STRING_3= RULE_STRING | this_WS_4= RULE_WS | kw= '+' | kw= '-' | kw= '(' | kw= ')' | kw= '*' | kw= '.' | kw= '/' | kw= '\\\\' | kw= '|' | kw= '?' | kw= '>' | kw= '<' | kw= '[' | kw= ']' | kw= '#' | kw= '$' | kw= '%' | kw= ';' | kw= ':' | kw= '!' | kw= '=' | kw= ',' ) ;
    public final AntlrDatatypeRuleToken ruleCodeWall() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_1=null;
        Token this_INT_2=null;
        Token this_STRING_3=null;
        Token this_WS_4=null;


        	enterRule();

        try {
            // InternalRpp.g:489:2: ( ( ( ( 'STD' )=>kw= 'STD' ) | this_ID_1= RULE_ID | this_INT_2= RULE_INT | this_STRING_3= RULE_STRING | this_WS_4= RULE_WS | kw= '+' | kw= '-' | kw= '(' | kw= ')' | kw= '*' | kw= '.' | kw= '/' | kw= '\\\\' | kw= '|' | kw= '?' | kw= '>' | kw= '<' | kw= '[' | kw= ']' | kw= '#' | kw= '$' | kw= '%' | kw= ';' | kw= ':' | kw= '!' | kw= '=' | kw= ',' ) )
            // InternalRpp.g:490:2: ( ( ( 'STD' )=>kw= 'STD' ) | this_ID_1= RULE_ID | this_INT_2= RULE_INT | this_STRING_3= RULE_STRING | this_WS_4= RULE_WS | kw= '+' | kw= '-' | kw= '(' | kw= ')' | kw= '*' | kw= '.' | kw= '/' | kw= '\\\\' | kw= '|' | kw= '?' | kw= '>' | kw= '<' | kw= '[' | kw= ']' | kw= '#' | kw= '$' | kw= '%' | kw= ';' | kw= ':' | kw= '!' | kw= '=' | kw= ',' )
            {
            // InternalRpp.g:490:2: ( ( ( 'STD' )=>kw= 'STD' ) | this_ID_1= RULE_ID | this_INT_2= RULE_INT | this_STRING_3= RULE_STRING | this_WS_4= RULE_WS | kw= '+' | kw= '-' | kw= '(' | kw= ')' | kw= '*' | kw= '.' | kw= '/' | kw= '\\\\' | kw= '|' | kw= '?' | kw= '>' | kw= '<' | kw= '[' | kw= ']' | kw= '#' | kw= '$' | kw= '%' | kw= ';' | kw= ':' | kw= '!' | kw= '=' | kw= ',' )
            int alt3=27;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // InternalRpp.g:491:3: ( ( 'STD' )=>kw= 'STD' )
                    {
                    // InternalRpp.g:491:3: ( ( 'STD' )=>kw= 'STD' )
                    // InternalRpp.g:492:4: ( 'STD' )=>kw= 'STD'
                    {
                    kw=(Token)match(input,13,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getCodeWallAccess().getSTDKeyword_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalRpp.g:500:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_ID_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_ID_1, grammarAccess.getCodeWallAccess().getIDTerminalRuleCall_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalRpp.g:508:3: this_INT_2= RULE_INT
                    {
                    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_INT_2);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_INT_2, grammarAccess.getCodeWallAccess().getINTTerminalRuleCall_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalRpp.g:516:3: this_STRING_3= RULE_STRING
                    {
                    this_STRING_3=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_STRING_3);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_STRING_3, grammarAccess.getCodeWallAccess().getSTRINGTerminalRuleCall_3());
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalRpp.g:524:3: this_WS_4= RULE_WS
                    {
                    this_WS_4=(Token)match(input,RULE_WS,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_WS_4);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_WS_4, grammarAccess.getCodeWallAccess().getWSTerminalRuleCall_4());
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalRpp.g:532:3: kw= '+'
                    {
                    kw=(Token)match(input,14,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCodeWallAccess().getPlusSignKeyword_5());
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalRpp.g:538:3: kw= '-'
                    {
                    kw=(Token)match(input,15,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCodeWallAccess().getHyphenMinusKeyword_6());
                      		
                    }

                    }
                    break;
                case 8 :
                    // InternalRpp.g:544:3: kw= '('
                    {
                    kw=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCodeWallAccess().getLeftParenthesisKeyword_7());
                      		
                    }

                    }
                    break;
                case 9 :
                    // InternalRpp.g:550:3: kw= ')'
                    {
                    kw=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCodeWallAccess().getRightParenthesisKeyword_8());
                      		
                    }

                    }
                    break;
                case 10 :
                    // InternalRpp.g:556:3: kw= '*'
                    {
                    kw=(Token)match(input,18,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCodeWallAccess().getAsteriskKeyword_9());
                      		
                    }

                    }
                    break;
                case 11 :
                    // InternalRpp.g:562:3: kw= '.'
                    {
                    kw=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCodeWallAccess().getFullStopKeyword_10());
                      		
                    }

                    }
                    break;
                case 12 :
                    // InternalRpp.g:568:3: kw= '/'
                    {
                    kw=(Token)match(input,20,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCodeWallAccess().getSolidusKeyword_11());
                      		
                    }

                    }
                    break;
                case 13 :
                    // InternalRpp.g:574:3: kw= '\\\\'
                    {
                    kw=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCodeWallAccess().getReverseSolidusKeyword_12());
                      		
                    }

                    }
                    break;
                case 14 :
                    // InternalRpp.g:580:3: kw= '|'
                    {
                    kw=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCodeWallAccess().getVerticalLineKeyword_13());
                      		
                    }

                    }
                    break;
                case 15 :
                    // InternalRpp.g:586:3: kw= '?'
                    {
                    kw=(Token)match(input,23,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCodeWallAccess().getQuestionMarkKeyword_14());
                      		
                    }

                    }
                    break;
                case 16 :
                    // InternalRpp.g:592:3: kw= '>'
                    {
                    kw=(Token)match(input,24,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCodeWallAccess().getGreaterThanSignKeyword_15());
                      		
                    }

                    }
                    break;
                case 17 :
                    // InternalRpp.g:598:3: kw= '<'
                    {
                    kw=(Token)match(input,25,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCodeWallAccess().getLessThanSignKeyword_16());
                      		
                    }

                    }
                    break;
                case 18 :
                    // InternalRpp.g:604:3: kw= '['
                    {
                    kw=(Token)match(input,26,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCodeWallAccess().getLeftSquareBracketKeyword_17());
                      		
                    }

                    }
                    break;
                case 19 :
                    // InternalRpp.g:610:3: kw= ']'
                    {
                    kw=(Token)match(input,27,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCodeWallAccess().getRightSquareBracketKeyword_18());
                      		
                    }

                    }
                    break;
                case 20 :
                    // InternalRpp.g:616:3: kw= '#'
                    {
                    kw=(Token)match(input,28,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCodeWallAccess().getNumberSignKeyword_19());
                      		
                    }

                    }
                    break;
                case 21 :
                    // InternalRpp.g:622:3: kw= '$'
                    {
                    kw=(Token)match(input,29,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCodeWallAccess().getDollarSignKeyword_20());
                      		
                    }

                    }
                    break;
                case 22 :
                    // InternalRpp.g:628:3: kw= '%'
                    {
                    kw=(Token)match(input,30,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCodeWallAccess().getPercentSignKeyword_21());
                      		
                    }

                    }
                    break;
                case 23 :
                    // InternalRpp.g:634:3: kw= ';'
                    {
                    kw=(Token)match(input,31,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCodeWallAccess().getSemicolonKeyword_22());
                      		
                    }

                    }
                    break;
                case 24 :
                    // InternalRpp.g:640:3: kw= ':'
                    {
                    kw=(Token)match(input,32,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCodeWallAccess().getColonKeyword_23());
                      		
                    }

                    }
                    break;
                case 25 :
                    // InternalRpp.g:646:3: kw= '!'
                    {
                    kw=(Token)match(input,33,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCodeWallAccess().getExclamationMarkKeyword_24());
                      		
                    }

                    }
                    break;
                case 26 :
                    // InternalRpp.g:652:3: kw= '='
                    {
                    kw=(Token)match(input,34,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCodeWallAccess().getEqualsSignKeyword_25());
                      		
                    }

                    }
                    break;
                case 27 :
                    // InternalRpp.g:658:3: kw= ','
                    {
                    kw=(Token)match(input,35,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCodeWallAccess().getCommaKeyword_26());
                      		
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
    // InternalRpp.g:667:1: entryRuleScanner returns [EObject current=null] : iv_ruleScanner= ruleScanner EOF ;
    public final EObject entryRuleScanner() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScanner = null;


        try {
            // InternalRpp.g:667:48: (iv_ruleScanner= ruleScanner EOF )
            // InternalRpp.g:668:2: iv_ruleScanner= ruleScanner EOF
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
    // InternalRpp.g:674:1: ruleScanner returns [EObject current=null] : (otherlv_0= 'SCANNER' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleScanner() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalRpp.g:680:2: ( (otherlv_0= 'SCANNER' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalRpp.g:681:2: (otherlv_0= 'SCANNER' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalRpp.g:681:2: (otherlv_0= 'SCANNER' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalRpp.g:682:3: otherlv_0= 'SCANNER' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,36,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getScannerAccess().getSCANNERKeyword_0());
              		
            }
            // InternalRpp.g:686:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRpp.g:687:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRpp.g:687:4: (lv_name_1_0= RULE_ID )
            // InternalRpp.g:688:5: lv_name_1_0= RULE_ID
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
    // InternalRpp.g:708:1: entryRuleExport returns [EObject current=null] : iv_ruleExport= ruleExport EOF ;
    public final EObject entryRuleExport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExport = null;


        try {
            // InternalRpp.g:708:47: (iv_ruleExport= ruleExport EOF )
            // InternalRpp.g:709:2: iv_ruleExport= ruleExport EOF
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
    // InternalRpp.g:715:1: ruleExport returns [EObject current=null] : (otherlv_0= 'EXPORT' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' ) ;
    public final EObject ruleExport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_content_2_0 = null;



        	enterRule();

        try {
            // InternalRpp.g:721:2: ( (otherlv_0= 'EXPORT' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' ) )
            // InternalRpp.g:722:2: (otherlv_0= 'EXPORT' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' )
            {
            // InternalRpp.g:722:2: (otherlv_0= 'EXPORT' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' )
            // InternalRpp.g:723:3: otherlv_0= 'EXPORT' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getExportAccess().getEXPORTKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,11,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getExportAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalRpp.g:731:3: ( (lv_content_2_0= ruleCodeBlock ) )
            // InternalRpp.g:732:4: (lv_content_2_0= ruleCodeBlock )
            {
            // InternalRpp.g:732:4: (lv_content_2_0= ruleCodeBlock )
            // InternalRpp.g:733:5: lv_content_2_0= ruleCodeBlock
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getExportAccess().getContentCodeBlockParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_6);
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
              						"de.roma.cocktail.xtext.Rpp.CodeBlock");
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


    // $ANTLR start "entryRuleImport"
    // InternalRpp.g:758:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalRpp.g:758:47: (iv_ruleImport= ruleImport EOF )
            // InternalRpp.g:759:2: iv_ruleImport= ruleImport EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImportRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleImport=ruleImport();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImport; 
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
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalRpp.g:765:1: ruleImport returns [EObject current=null] : (otherlv_0= 'IMPORT' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_content_2_0 = null;



        	enterRule();

        try {
            // InternalRpp.g:771:2: ( (otherlv_0= 'IMPORT' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' ) )
            // InternalRpp.g:772:2: (otherlv_0= 'IMPORT' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' )
            {
            // InternalRpp.g:772:2: (otherlv_0= 'IMPORT' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' )
            // InternalRpp.g:773:3: otherlv_0= 'IMPORT' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getImportAccess().getIMPORTKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,11,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getImportAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalRpp.g:781:3: ( (lv_content_2_0= ruleCodeBlock ) )
            // InternalRpp.g:782:4: (lv_content_2_0= ruleCodeBlock )
            {
            // InternalRpp.g:782:4: (lv_content_2_0= ruleCodeBlock )
            // InternalRpp.g:783:5: lv_content_2_0= ruleCodeBlock
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getImportAccess().getContentCodeBlockParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_6);
            lv_content_2_0=ruleCodeBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getImportRule());
              					}
              					set(
              						current,
              						"content",
              						lv_content_2_0,
              						"de.roma.cocktail.xtext.Rpp.CodeBlock");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getImportAccess().getRightCurlyBracketKeyword_3());
              		
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
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleGlobal"
    // InternalRpp.g:808:1: entryRuleGlobal returns [EObject current=null] : iv_ruleGlobal= ruleGlobal EOF ;
    public final EObject entryRuleGlobal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGlobal = null;


        try {
            // InternalRpp.g:808:47: (iv_ruleGlobal= ruleGlobal EOF )
            // InternalRpp.g:809:2: iv_ruleGlobal= ruleGlobal EOF
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
    // InternalRpp.g:815:1: ruleGlobal returns [EObject current=null] : (otherlv_0= 'GLOBAL' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' ) ;
    public final EObject ruleGlobal() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_content_2_0 = null;



        	enterRule();

        try {
            // InternalRpp.g:821:2: ( (otherlv_0= 'GLOBAL' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' ) )
            // InternalRpp.g:822:2: (otherlv_0= 'GLOBAL' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' )
            {
            // InternalRpp.g:822:2: (otherlv_0= 'GLOBAL' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' )
            // InternalRpp.g:823:3: otherlv_0= 'GLOBAL' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,39,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGlobalAccess().getGLOBALKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,11,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGlobalAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalRpp.g:831:3: ( (lv_content_2_0= ruleCodeBlock ) )
            // InternalRpp.g:832:4: (lv_content_2_0= ruleCodeBlock )
            {
            // InternalRpp.g:832:4: (lv_content_2_0= ruleCodeBlock )
            // InternalRpp.g:833:5: lv_content_2_0= ruleCodeBlock
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGlobalAccess().getContentCodeBlockParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_6);
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
              						"de.roma.cocktail.xtext.Rpp.CodeBlock");
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
    // InternalRpp.g:858:1: entryRuleLocal returns [EObject current=null] : iv_ruleLocal= ruleLocal EOF ;
    public final EObject entryRuleLocal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocal = null;


        try {
            // InternalRpp.g:858:46: (iv_ruleLocal= ruleLocal EOF )
            // InternalRpp.g:859:2: iv_ruleLocal= ruleLocal EOF
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
    // InternalRpp.g:865:1: ruleLocal returns [EObject current=null] : (otherlv_0= 'LOCAL' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' ) ;
    public final EObject ruleLocal() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_content_2_0 = null;



        	enterRule();

        try {
            // InternalRpp.g:871:2: ( (otherlv_0= 'LOCAL' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' ) )
            // InternalRpp.g:872:2: (otherlv_0= 'LOCAL' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' )
            {
            // InternalRpp.g:872:2: (otherlv_0= 'LOCAL' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' )
            // InternalRpp.g:873:3: otherlv_0= 'LOCAL' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,40,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getLocalAccess().getLOCALKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,11,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getLocalAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalRpp.g:881:3: ( (lv_content_2_0= ruleCodeBlock ) )
            // InternalRpp.g:882:4: (lv_content_2_0= ruleCodeBlock )
            {
            // InternalRpp.g:882:4: (lv_content_2_0= ruleCodeBlock )
            // InternalRpp.g:883:5: lv_content_2_0= ruleCodeBlock
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getLocalAccess().getContentCodeBlockParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_6);
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
              						"de.roma.cocktail.xtext.Rpp.CodeBlock");
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
    // InternalRpp.g:908:1: entryRuleDefault returns [EObject current=null] : iv_ruleDefault= ruleDefault EOF ;
    public final EObject entryRuleDefault() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefault = null;


        try {
            // InternalRpp.g:908:48: (iv_ruleDefault= ruleDefault EOF )
            // InternalRpp.g:909:2: iv_ruleDefault= ruleDefault EOF
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
    // InternalRpp.g:915:1: ruleDefault returns [EObject current=null] : (otherlv_0= 'DEFAULT' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' ) ;
    public final EObject ruleDefault() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_content_2_0 = null;



        	enterRule();

        try {
            // InternalRpp.g:921:2: ( (otherlv_0= 'DEFAULT' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' ) )
            // InternalRpp.g:922:2: (otherlv_0= 'DEFAULT' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' )
            {
            // InternalRpp.g:922:2: (otherlv_0= 'DEFAULT' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' )
            // InternalRpp.g:923:3: otherlv_0= 'DEFAULT' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDefaultAccess().getDEFAULTKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,11,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDefaultAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalRpp.g:931:3: ( (lv_content_2_0= ruleCodeBlock ) )
            // InternalRpp.g:932:4: (lv_content_2_0= ruleCodeBlock )
            {
            // InternalRpp.g:932:4: (lv_content_2_0= ruleCodeBlock )
            // InternalRpp.g:933:5: lv_content_2_0= ruleCodeBlock
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDefaultAccess().getContentCodeBlockParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_6);
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
              						"de.roma.cocktail.xtext.Rpp.CodeBlock");
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
    // InternalRpp.g:958:1: entryRuleEof returns [EObject current=null] : iv_ruleEof= ruleEof EOF ;
    public final EObject entryRuleEof() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEof = null;


        try {
            // InternalRpp.g:958:44: (iv_ruleEof= ruleEof EOF )
            // InternalRpp.g:959:2: iv_ruleEof= ruleEof EOF
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
    // InternalRpp.g:965:1: ruleEof returns [EObject current=null] : (otherlv_0= 'EOF' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' ) ;
    public final EObject ruleEof() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_content_2_0 = null;



        	enterRule();

        try {
            // InternalRpp.g:971:2: ( (otherlv_0= 'EOF' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' ) )
            // InternalRpp.g:972:2: (otherlv_0= 'EOF' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' )
            {
            // InternalRpp.g:972:2: (otherlv_0= 'EOF' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' )
            // InternalRpp.g:973:3: otherlv_0= 'EOF' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,42,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getEofAccess().getEOFKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,11,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getEofAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalRpp.g:981:3: ( (lv_content_2_0= ruleCodeBlock ) )
            // InternalRpp.g:982:4: (lv_content_2_0= ruleCodeBlock )
            {
            // InternalRpp.g:982:4: (lv_content_2_0= ruleCodeBlock )
            // InternalRpp.g:983:5: lv_content_2_0= ruleCodeBlock
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getEofAccess().getContentCodeBlockParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_6);
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
              						"de.roma.cocktail.xtext.Rpp.CodeBlock");
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
    // InternalRpp.g:1008:1: entryRuleBegin returns [EObject current=null] : iv_ruleBegin= ruleBegin EOF ;
    public final EObject entryRuleBegin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBegin = null;


        try {
            // InternalRpp.g:1008:46: (iv_ruleBegin= ruleBegin EOF )
            // InternalRpp.g:1009:2: iv_ruleBegin= ruleBegin EOF
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
    // InternalRpp.g:1015:1: ruleBegin returns [EObject current=null] : (otherlv_0= 'BEGIN' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' ) ;
    public final EObject ruleBegin() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_content_2_0 = null;



        	enterRule();

        try {
            // InternalRpp.g:1021:2: ( (otherlv_0= 'BEGIN' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' ) )
            // InternalRpp.g:1022:2: (otherlv_0= 'BEGIN' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' )
            {
            // InternalRpp.g:1022:2: (otherlv_0= 'BEGIN' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' )
            // InternalRpp.g:1023:3: otherlv_0= 'BEGIN' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,43,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getBeginAccess().getBEGINKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,11,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getBeginAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalRpp.g:1031:3: ( (lv_content_2_0= ruleCodeBlock ) )
            // InternalRpp.g:1032:4: (lv_content_2_0= ruleCodeBlock )
            {
            // InternalRpp.g:1032:4: (lv_content_2_0= ruleCodeBlock )
            // InternalRpp.g:1033:5: lv_content_2_0= ruleCodeBlock
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getBeginAccess().getContentCodeBlockParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_6);
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
              						"de.roma.cocktail.xtext.Rpp.CodeBlock");
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
    // InternalRpp.g:1058:1: entryRuleClose returns [EObject current=null] : iv_ruleClose= ruleClose EOF ;
    public final EObject entryRuleClose() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClose = null;


        try {
            // InternalRpp.g:1058:46: (iv_ruleClose= ruleClose EOF )
            // InternalRpp.g:1059:2: iv_ruleClose= ruleClose EOF
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
    // InternalRpp.g:1065:1: ruleClose returns [EObject current=null] : (otherlv_0= 'CLOSE' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' ) ;
    public final EObject ruleClose() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_content_2_0 = null;



        	enterRule();

        try {
            // InternalRpp.g:1071:2: ( (otherlv_0= 'CLOSE' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' ) )
            // InternalRpp.g:1072:2: (otherlv_0= 'CLOSE' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' )
            {
            // InternalRpp.g:1072:2: (otherlv_0= 'CLOSE' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' )
            // InternalRpp.g:1073:3: otherlv_0= 'CLOSE' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,44,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getCloseAccess().getCLOSEKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,11,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getCloseAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalRpp.g:1081:3: ( (lv_content_2_0= ruleCodeBlock ) )
            // InternalRpp.g:1082:4: (lv_content_2_0= ruleCodeBlock )
            {
            // InternalRpp.g:1082:4: (lv_content_2_0= ruleCodeBlock )
            // InternalRpp.g:1083:5: lv_content_2_0= ruleCodeBlock
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCloseAccess().getContentCodeBlockParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_6);
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
              						"de.roma.cocktail.xtext.Rpp.CodeBlock");
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
    // InternalRpp.g:1108:1: entryRuleDefine returns [EObject current=null] : iv_ruleDefine= ruleDefine EOF ;
    public final EObject entryRuleDefine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefine = null;


        try {
            // InternalRpp.g:1108:47: (iv_ruleDefine= ruleDefine EOF )
            // InternalRpp.g:1109:2: iv_ruleDefine= ruleDefine EOF
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
    // InternalRpp.g:1115:1: ruleDefine returns [EObject current=null] : (otherlv_0= 'DEFINE' ( (lv_defines_1_0= ruleDefineRule ) )+ ) ;
    public final EObject ruleDefine() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_defines_1_0 = null;



        	enterRule();

        try {
            // InternalRpp.g:1121:2: ( (otherlv_0= 'DEFINE' ( (lv_defines_1_0= ruleDefineRule ) )+ ) )
            // InternalRpp.g:1122:2: (otherlv_0= 'DEFINE' ( (lv_defines_1_0= ruleDefineRule ) )+ )
            {
            // InternalRpp.g:1122:2: (otherlv_0= 'DEFINE' ( (lv_defines_1_0= ruleDefineRule ) )+ )
            // InternalRpp.g:1123:3: otherlv_0= 'DEFINE' ( (lv_defines_1_0= ruleDefineRule ) )+
            {
            otherlv_0=(Token)match(input,45,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDefineAccess().getDEFINEKeyword_0());
              		
            }
            // InternalRpp.g:1127:3: ( (lv_defines_1_0= ruleDefineRule ) )+
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
            	    // InternalRpp.g:1128:4: (lv_defines_1_0= ruleDefineRule )
            	    {
            	    // InternalRpp.g:1128:4: (lv_defines_1_0= ruleDefineRule )
            	    // InternalRpp.g:1129:5: lv_defines_1_0= ruleDefineRule
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getDefineAccess().getDefinesDefineRuleParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_9);
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
            	      						"de.roma.cocktail.xtext.Rpp.DefineRule");
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
    // InternalRpp.g:1150:1: entryRuleDefineRule returns [EObject current=null] : iv_ruleDefineRule= ruleDefineRule EOF ;
    public final EObject entryRuleDefineRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefineRule = null;


        try {
            // InternalRpp.g:1150:51: (iv_ruleDefineRule= ruleDefineRule EOF )
            // InternalRpp.g:1151:2: iv_ruleDefineRule= ruleDefineRule EOF
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
    // InternalRpp.g:1157:1: ruleDefineRule returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_rule_2_0= ruleDefineRegex ) ) otherlv_3= '.' ) ;
    public final EObject ruleDefineRule() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_rule_2_0 = null;



        	enterRule();

        try {
            // InternalRpp.g:1163:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_rule_2_0= ruleDefineRegex ) ) otherlv_3= '.' ) )
            // InternalRpp.g:1164:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_rule_2_0= ruleDefineRegex ) ) otherlv_3= '.' )
            {
            // InternalRpp.g:1164:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_rule_2_0= ruleDefineRegex ) ) otherlv_3= '.' )
            // InternalRpp.g:1165:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_rule_2_0= ruleDefineRegex ) ) otherlv_3= '.'
            {
            // InternalRpp.g:1165:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalRpp.g:1166:4: (lv_name_0_0= RULE_ID )
            {
            // InternalRpp.g:1166:4: (lv_name_0_0= RULE_ID )
            // InternalRpp.g:1167:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_10); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,34,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDefineRuleAccess().getEqualsSignKeyword_1());
              		
            }
            // InternalRpp.g:1187:3: ( (lv_rule_2_0= ruleDefineRegex ) )
            // InternalRpp.g:1188:4: (lv_rule_2_0= ruleDefineRegex )
            {
            // InternalRpp.g:1188:4: (lv_rule_2_0= ruleDefineRegex )
            // InternalRpp.g:1189:5: lv_rule_2_0= ruleDefineRegex
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDefineRuleAccess().getRuleDefineRegexParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_12);
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
              						"de.roma.cocktail.xtext.Rpp.DefineRegex");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
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
    // InternalRpp.g:1214:1: entryRuleDefineRegex returns [String current=null] : iv_ruleDefineRegex= ruleDefineRegex EOF ;
    public final String entryRuleDefineRegex() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDefineRegex = null;


        try {
            // InternalRpp.g:1214:51: (iv_ruleDefineRegex= ruleDefineRegex EOF )
            // InternalRpp.g:1215:2: iv_ruleDefineRegex= ruleDefineRegex EOF
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
    // InternalRpp.g:1221:1: ruleDefineRegex returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Regex_0= ruleRegex )* ;
    public final AntlrDatatypeRuleToken ruleDefineRegex() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Regex_0 = null;



        	enterRule();

        try {
            // InternalRpp.g:1227:2: ( (this_Regex_0= ruleRegex )* )
            // InternalRpp.g:1228:2: (this_Regex_0= ruleRegex )*
            {
            // InternalRpp.g:1228:2: (this_Regex_0= ruleRegex )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==19) ) {
                    switch ( input.LA(2) ) {
                    case RULE_INT:
                    case RULE_STRING:
                    case RULE_WS:
                    case 11:
                    case 12:
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
                    case 25:
                    case 49:
                    case 50:
                        {
                        alt5=1;
                        }
                        break;
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

                        if ( (LA5_5==EOF||(LA5_5>=RULE_ID && LA5_5<=RULE_WS)||(LA5_5>=11 && LA5_5<=12)||(LA5_5>=14 && LA5_5<=25)||(LA5_5>=49 && LA5_5<=50)) ) {
                            alt5=1;
                        }


                        }
                        break;

                    }

                }
                else if ( ((LA5_0>=RULE_ID && LA5_0<=RULE_WS)||(LA5_0>=11 && LA5_0<=12)||(LA5_0>=14 && LA5_0<=18)||(LA5_0>=20 && LA5_0<=25)||(LA5_0>=49 && LA5_0<=50)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalRpp.g:1229:3: this_Regex_0= ruleRegex
            	    {
            	    if ( state.backtracking==0 ) {

            	      			newCompositeNode(grammarAccess.getDefineRegexAccess().getRegexParserRuleCall());
            	      		
            	    }
            	    pushFollow(FOLLOW_13);
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
    // InternalRpp.g:1243:1: entryRuleStartStates returns [EObject current=null] : iv_ruleStartStates= ruleStartStates EOF ;
    public final EObject entryRuleStartStates() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStartStates = null;


        try {
            // InternalRpp.g:1243:52: (iv_ruleStartStates= ruleStartStates EOF )
            // InternalRpp.g:1244:2: iv_ruleStartStates= ruleStartStates EOF
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
    // InternalRpp.g:1250:1: ruleStartStates returns [EObject current=null] : (otherlv_0= 'START' ( (lv_incstates_1_0= ruleStartState ) ) (otherlv_2= ',' ( (lv_incstates_3_0= ruleStartState ) ) )* (otherlv_4= '-' ( (lv_exstates_5_0= ruleStartState ) ) (otherlv_6= ',' ( (lv_exstates_7_0= ruleStartState ) ) )* )? ) ;
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
            // InternalRpp.g:1256:2: ( (otherlv_0= 'START' ( (lv_incstates_1_0= ruleStartState ) ) (otherlv_2= ',' ( (lv_incstates_3_0= ruleStartState ) ) )* (otherlv_4= '-' ( (lv_exstates_5_0= ruleStartState ) ) (otherlv_6= ',' ( (lv_exstates_7_0= ruleStartState ) ) )* )? ) )
            // InternalRpp.g:1257:2: (otherlv_0= 'START' ( (lv_incstates_1_0= ruleStartState ) ) (otherlv_2= ',' ( (lv_incstates_3_0= ruleStartState ) ) )* (otherlv_4= '-' ( (lv_exstates_5_0= ruleStartState ) ) (otherlv_6= ',' ( (lv_exstates_7_0= ruleStartState ) ) )* )? )
            {
            // InternalRpp.g:1257:2: (otherlv_0= 'START' ( (lv_incstates_1_0= ruleStartState ) ) (otherlv_2= ',' ( (lv_incstates_3_0= ruleStartState ) ) )* (otherlv_4= '-' ( (lv_exstates_5_0= ruleStartState ) ) (otherlv_6= ',' ( (lv_exstates_7_0= ruleStartState ) ) )* )? )
            // InternalRpp.g:1258:3: otherlv_0= 'START' ( (lv_incstates_1_0= ruleStartState ) ) (otherlv_2= ',' ( (lv_incstates_3_0= ruleStartState ) ) )* (otherlv_4= '-' ( (lv_exstates_5_0= ruleStartState ) ) (otherlv_6= ',' ( (lv_exstates_7_0= ruleStartState ) ) )* )?
            {
            otherlv_0=(Token)match(input,46,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getStartStatesAccess().getSTARTKeyword_0());
              		
            }
            // InternalRpp.g:1262:3: ( (lv_incstates_1_0= ruleStartState ) )
            // InternalRpp.g:1263:4: (lv_incstates_1_0= ruleStartState )
            {
            // InternalRpp.g:1263:4: (lv_incstates_1_0= ruleStartState )
            // InternalRpp.g:1264:5: lv_incstates_1_0= ruleStartState
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getStartStatesAccess().getIncstatesStartStateParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_14);
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
              						"de.roma.cocktail.xtext.Rpp.StartState");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalRpp.g:1281:3: (otherlv_2= ',' ( (lv_incstates_3_0= ruleStartState ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==35) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalRpp.g:1282:4: otherlv_2= ',' ( (lv_incstates_3_0= ruleStartState ) )
            	    {
            	    otherlv_2=(Token)match(input,35,FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getStartStatesAccess().getCommaKeyword_2_0());
            	      			
            	    }
            	    // InternalRpp.g:1286:4: ( (lv_incstates_3_0= ruleStartState ) )
            	    // InternalRpp.g:1287:5: (lv_incstates_3_0= ruleStartState )
            	    {
            	    // InternalRpp.g:1287:5: (lv_incstates_3_0= ruleStartState )
            	    // InternalRpp.g:1288:6: lv_incstates_3_0= ruleStartState
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getStartStatesAccess().getIncstatesStartStateParserRuleCall_2_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_14);
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
            	      							"de.roma.cocktail.xtext.Rpp.StartState");
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

            // InternalRpp.g:1306:3: (otherlv_4= '-' ( (lv_exstates_5_0= ruleStartState ) ) (otherlv_6= ',' ( (lv_exstates_7_0= ruleStartState ) ) )* )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==15) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalRpp.g:1307:4: otherlv_4= '-' ( (lv_exstates_5_0= ruleStartState ) ) (otherlv_6= ',' ( (lv_exstates_7_0= ruleStartState ) ) )*
                    {
                    otherlv_4=(Token)match(input,15,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getStartStatesAccess().getHyphenMinusKeyword_3_0());
                      			
                    }
                    // InternalRpp.g:1311:4: ( (lv_exstates_5_0= ruleStartState ) )
                    // InternalRpp.g:1312:5: (lv_exstates_5_0= ruleStartState )
                    {
                    // InternalRpp.g:1312:5: (lv_exstates_5_0= ruleStartState )
                    // InternalRpp.g:1313:6: lv_exstates_5_0= ruleStartState
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getStartStatesAccess().getExstatesStartStateParserRuleCall_3_1_0());
                      					
                    }
                    pushFollow(FOLLOW_15);
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
                      							"de.roma.cocktail.xtext.Rpp.StartState");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalRpp.g:1330:4: (otherlv_6= ',' ( (lv_exstates_7_0= ruleStartState ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==35) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalRpp.g:1331:5: otherlv_6= ',' ( (lv_exstates_7_0= ruleStartState ) )
                    	    {
                    	    otherlv_6=(Token)match(input,35,FOLLOW_7); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_6, grammarAccess.getStartStatesAccess().getCommaKeyword_3_2_0());
                    	      				
                    	    }
                    	    // InternalRpp.g:1335:5: ( (lv_exstates_7_0= ruleStartState ) )
                    	    // InternalRpp.g:1336:6: (lv_exstates_7_0= ruleStartState )
                    	    {
                    	    // InternalRpp.g:1336:6: (lv_exstates_7_0= ruleStartState )
                    	    // InternalRpp.g:1337:7: lv_exstates_7_0= ruleStartState
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getStartStatesAccess().getExstatesStartStateParserRuleCall_3_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_15);
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
                    	      								"de.roma.cocktail.xtext.Rpp.StartState");
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
    // InternalRpp.g:1360:1: entryRuleStartState returns [EObject current=null] : iv_ruleStartState= ruleStartState EOF ;
    public final EObject entryRuleStartState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStartState = null;


        try {
            // InternalRpp.g:1360:51: (iv_ruleStartState= ruleStartState EOF )
            // InternalRpp.g:1361:2: iv_ruleStartState= ruleStartState EOF
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
    // InternalRpp.g:1367:1: ruleStartState returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleStartState() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalRpp.g:1373:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalRpp.g:1374:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalRpp.g:1374:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalRpp.g:1375:3: (lv_name_0_0= RULE_ID )
            {
            // InternalRpp.g:1375:3: (lv_name_0_0= RULE_ID )
            // InternalRpp.g:1376:4: lv_name_0_0= RULE_ID
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
    // InternalRpp.g:1395:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // InternalRpp.g:1395:45: (iv_ruleRule= ruleRule EOF )
            // InternalRpp.g:1396:2: iv_ruleRule= ruleRule EOF
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
    // InternalRpp.g:1402:1: ruleRule returns [EObject current=null] : ( ( ( (lv_info_0_1= 'RULE' | lv_info_0_2= 'RULES' ) ) ) ( (lv_rules_1_0= ruleSingleRule ) )* ) ;
    public final EObject ruleRule() throws RecognitionException {
        EObject current = null;

        Token lv_info_0_1=null;
        Token lv_info_0_2=null;
        EObject lv_rules_1_0 = null;



        	enterRule();

        try {
            // InternalRpp.g:1408:2: ( ( ( ( (lv_info_0_1= 'RULE' | lv_info_0_2= 'RULES' ) ) ) ( (lv_rules_1_0= ruleSingleRule ) )* ) )
            // InternalRpp.g:1409:2: ( ( ( (lv_info_0_1= 'RULE' | lv_info_0_2= 'RULES' ) ) ) ( (lv_rules_1_0= ruleSingleRule ) )* )
            {
            // InternalRpp.g:1409:2: ( ( ( (lv_info_0_1= 'RULE' | lv_info_0_2= 'RULES' ) ) ) ( (lv_rules_1_0= ruleSingleRule ) )* )
            // InternalRpp.g:1410:3: ( ( (lv_info_0_1= 'RULE' | lv_info_0_2= 'RULES' ) ) ) ( (lv_rules_1_0= ruleSingleRule ) )*
            {
            // InternalRpp.g:1410:3: ( ( (lv_info_0_1= 'RULE' | lv_info_0_2= 'RULES' ) ) )
            // InternalRpp.g:1411:4: ( (lv_info_0_1= 'RULE' | lv_info_0_2= 'RULES' ) )
            {
            // InternalRpp.g:1411:4: ( (lv_info_0_1= 'RULE' | lv_info_0_2= 'RULES' ) )
            // InternalRpp.g:1412:5: (lv_info_0_1= 'RULE' | lv_info_0_2= 'RULES' )
            {
            // InternalRpp.g:1412:5: (lv_info_0_1= 'RULE' | lv_info_0_2= 'RULES' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==47) ) {
                alt9=1;
            }
            else if ( (LA9_0==48) ) {
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
                    // InternalRpp.g:1413:6: lv_info_0_1= 'RULE'
                    {
                    lv_info_0_1=(Token)match(input,47,FOLLOW_16); if (state.failed) return current;
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
                    // InternalRpp.g:1424:6: lv_info_0_2= 'RULES'
                    {
                    lv_info_0_2=(Token)match(input,48,FOLLOW_16); if (state.failed) return current;
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

            // InternalRpp.g:1437:3: ( (lv_rules_1_0= ruleSingleRule ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=RULE_ID && LA10_0<=RULE_WS)||(LA10_0>=11 && LA10_0<=12)||(LA10_0>=14 && LA10_0<=25)||LA10_0==28||LA10_0==32||(LA10_0>=49 && LA10_0<=51)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalRpp.g:1438:4: (lv_rules_1_0= ruleSingleRule )
            	    {
            	    // InternalRpp.g:1438:4: (lv_rules_1_0= ruleSingleRule )
            	    // InternalRpp.g:1439:5: lv_rules_1_0= ruleSingleRule
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getRuleAccess().getRulesSingleRuleParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_16);
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
            	      						"de.roma.cocktail.xtext.Rpp.SingleRule");
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
    // InternalRpp.g:1460:1: entryRuleSingleRule returns [EObject current=null] : iv_ruleSingleRule= ruleSingleRule EOF ;
    public final EObject entryRuleSingleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleRule = null;


        try {
            // InternalRpp.g:1460:51: (iv_ruleSingleRule= ruleSingleRule EOF )
            // InternalRpp.g:1461:2: iv_ruleSingleRule= ruleSingleRule EOF
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
    // InternalRpp.g:1467:1: ruleSingleRule returns [EObject current=null] : ( ( (lv_start_0_0= ruleRuleStart ) )? ( (lv_rule_1_0= ruleRuleDefinition ) ) otherlv_2= ':' (otherlv_3= '-' )? otherlv_4= '{' ( (lv_content_5_0= ruleCodeBlock ) ) otherlv_6= '}' ) ;
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
            // InternalRpp.g:1473:2: ( ( ( (lv_start_0_0= ruleRuleStart ) )? ( (lv_rule_1_0= ruleRuleDefinition ) ) otherlv_2= ':' (otherlv_3= '-' )? otherlv_4= '{' ( (lv_content_5_0= ruleCodeBlock ) ) otherlv_6= '}' ) )
            // InternalRpp.g:1474:2: ( ( (lv_start_0_0= ruleRuleStart ) )? ( (lv_rule_1_0= ruleRuleDefinition ) ) otherlv_2= ':' (otherlv_3= '-' )? otherlv_4= '{' ( (lv_content_5_0= ruleCodeBlock ) ) otherlv_6= '}' )
            {
            // InternalRpp.g:1474:2: ( ( (lv_start_0_0= ruleRuleStart ) )? ( (lv_rule_1_0= ruleRuleDefinition ) ) otherlv_2= ':' (otherlv_3= '-' )? otherlv_4= '{' ( (lv_content_5_0= ruleCodeBlock ) ) otherlv_6= '}' )
            // InternalRpp.g:1475:3: ( (lv_start_0_0= ruleRuleStart ) )? ( (lv_rule_1_0= ruleRuleDefinition ) ) otherlv_2= ':' (otherlv_3= '-' )? otherlv_4= '{' ( (lv_content_5_0= ruleCodeBlock ) ) otherlv_6= '}'
            {
            // InternalRpp.g:1475:3: ( (lv_start_0_0= ruleRuleStart ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==28||LA11_0==51) ) {
                alt11=1;
            }
            else if ( (LA11_0==15) ) {
                int LA11_2 = input.LA(2);

                if ( (LA11_2==28) ) {
                    alt11=1;
                }
            }
            switch (alt11) {
                case 1 :
                    // InternalRpp.g:1476:4: (lv_start_0_0= ruleRuleStart )
                    {
                    // InternalRpp.g:1476:4: (lv_start_0_0= ruleRuleStart )
                    // InternalRpp.g:1477:5: lv_start_0_0= ruleRuleStart
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getSingleRuleAccess().getStartRuleStartParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_17);
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
                      						"de.roma.cocktail.xtext.Rpp.RuleStart");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalRpp.g:1494:3: ( (lv_rule_1_0= ruleRuleDefinition ) )
            // InternalRpp.g:1495:4: (lv_rule_1_0= ruleRuleDefinition )
            {
            // InternalRpp.g:1495:4: (lv_rule_1_0= ruleRuleDefinition )
            // InternalRpp.g:1496:5: lv_rule_1_0= ruleRuleDefinition
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSingleRuleAccess().getRuleRuleDefinitionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_18);
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
              						"de.roma.cocktail.xtext.Rpp.RuleDefinition");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,32,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getSingleRuleAccess().getColonKeyword_2());
              		
            }
            // InternalRpp.g:1517:3: (otherlv_3= '-' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==15) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalRpp.g:1518:4: otherlv_3= '-'
                    {
                    otherlv_3=(Token)match(input,15,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getSingleRuleAccess().getHyphenMinusKeyword_3());
                      			
                    }

                    }
                    break;

            }

            otherlv_4=(Token)match(input,11,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getSingleRuleAccess().getLeftCurlyBracketKeyword_4());
              		
            }
            // InternalRpp.g:1527:3: ( (lv_content_5_0= ruleCodeBlock ) )
            // InternalRpp.g:1528:4: (lv_content_5_0= ruleCodeBlock )
            {
            // InternalRpp.g:1528:4: (lv_content_5_0= ruleCodeBlock )
            // InternalRpp.g:1529:5: lv_content_5_0= ruleCodeBlock
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSingleRuleAccess().getContentCodeBlockParserRuleCall_5_0());
              				
            }
            pushFollow(FOLLOW_6);
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
              						"de.roma.cocktail.xtext.Rpp.CodeBlock");
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
    // InternalRpp.g:1554:1: entryRuleRegex returns [String current=null] : iv_ruleRegex= ruleRegex EOF ;
    public final String entryRuleRegex() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRegex = null;


        try {
            // InternalRpp.g:1554:45: (iv_ruleRegex= ruleRegex EOF )
            // InternalRpp.g:1555:2: iv_ruleRegex= ruleRegex EOF
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
    // InternalRpp.g:1561:1: ruleRegex returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_INT_1= RULE_INT | this_STRING_2= RULE_STRING | this_WS_3= RULE_WS | kw= '+' | kw= '-' | kw= '(' | kw= ')' | kw= '*' | kw= '.' | kw= '/' | kw= '\\\\' | kw= '|' | kw= '?' | kw= '>' | kw= '<' | kw= '{' | kw= '}' | kw= '\"' | kw= '\\'' ) ;
    public final AntlrDatatypeRuleToken ruleRegex() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_INT_1=null;
        Token this_STRING_2=null;
        Token this_WS_3=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalRpp.g:1567:2: ( (this_ID_0= RULE_ID | this_INT_1= RULE_INT | this_STRING_2= RULE_STRING | this_WS_3= RULE_WS | kw= '+' | kw= '-' | kw= '(' | kw= ')' | kw= '*' | kw= '.' | kw= '/' | kw= '\\\\' | kw= '|' | kw= '?' | kw= '>' | kw= '<' | kw= '{' | kw= '}' | kw= '\"' | kw= '\\'' ) )
            // InternalRpp.g:1568:2: (this_ID_0= RULE_ID | this_INT_1= RULE_INT | this_STRING_2= RULE_STRING | this_WS_3= RULE_WS | kw= '+' | kw= '-' | kw= '(' | kw= ')' | kw= '*' | kw= '.' | kw= '/' | kw= '\\\\' | kw= '|' | kw= '?' | kw= '>' | kw= '<' | kw= '{' | kw= '}' | kw= '\"' | kw= '\\'' )
            {
            // InternalRpp.g:1568:2: (this_ID_0= RULE_ID | this_INT_1= RULE_INT | this_STRING_2= RULE_STRING | this_WS_3= RULE_WS | kw= '+' | kw= '-' | kw= '(' | kw= ')' | kw= '*' | kw= '.' | kw= '/' | kw= '\\\\' | kw= '|' | kw= '?' | kw= '>' | kw= '<' | kw= '{' | kw= '}' | kw= '\"' | kw= '\\'' )
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
            case 14:
                {
                alt13=5;
                }
                break;
            case 15:
                {
                alt13=6;
                }
                break;
            case 16:
                {
                alt13=7;
                }
                break;
            case 17:
                {
                alt13=8;
                }
                break;
            case 18:
                {
                alt13=9;
                }
                break;
            case 19:
                {
                alt13=10;
                }
                break;
            case 20:
                {
                alt13=11;
                }
                break;
            case 21:
                {
                alt13=12;
                }
                break;
            case 22:
                {
                alt13=13;
                }
                break;
            case 23:
                {
                alt13=14;
                }
                break;
            case 24:
                {
                alt13=15;
                }
                break;
            case 25:
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
            case 49:
                {
                alt13=19;
                }
                break;
            case 50:
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
                    // InternalRpp.g:1569:3: this_ID_0= RULE_ID
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
                    // InternalRpp.g:1577:3: this_INT_1= RULE_INT
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
                    // InternalRpp.g:1585:3: this_STRING_2= RULE_STRING
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
                    // InternalRpp.g:1593:3: this_WS_3= RULE_WS
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
                    // InternalRpp.g:1601:3: kw= '+'
                    {
                    kw=(Token)match(input,14,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getRegexAccess().getPlusSignKeyword_4());
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalRpp.g:1607:3: kw= '-'
                    {
                    kw=(Token)match(input,15,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getRegexAccess().getHyphenMinusKeyword_5());
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalRpp.g:1613:3: kw= '('
                    {
                    kw=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getRegexAccess().getLeftParenthesisKeyword_6());
                      		
                    }

                    }
                    break;
                case 8 :
                    // InternalRpp.g:1619:3: kw= ')'
                    {
                    kw=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getRegexAccess().getRightParenthesisKeyword_7());
                      		
                    }

                    }
                    break;
                case 9 :
                    // InternalRpp.g:1625:3: kw= '*'
                    {
                    kw=(Token)match(input,18,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getRegexAccess().getAsteriskKeyword_8());
                      		
                    }

                    }
                    break;
                case 10 :
                    // InternalRpp.g:1631:3: kw= '.'
                    {
                    kw=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getRegexAccess().getFullStopKeyword_9());
                      		
                    }

                    }
                    break;
                case 11 :
                    // InternalRpp.g:1637:3: kw= '/'
                    {
                    kw=(Token)match(input,20,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getRegexAccess().getSolidusKeyword_10());
                      		
                    }

                    }
                    break;
                case 12 :
                    // InternalRpp.g:1643:3: kw= '\\\\'
                    {
                    kw=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getRegexAccess().getReverseSolidusKeyword_11());
                      		
                    }

                    }
                    break;
                case 13 :
                    // InternalRpp.g:1649:3: kw= '|'
                    {
                    kw=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getRegexAccess().getVerticalLineKeyword_12());
                      		
                    }

                    }
                    break;
                case 14 :
                    // InternalRpp.g:1655:3: kw= '?'
                    {
                    kw=(Token)match(input,23,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getRegexAccess().getQuestionMarkKeyword_13());
                      		
                    }

                    }
                    break;
                case 15 :
                    // InternalRpp.g:1661:3: kw= '>'
                    {
                    kw=(Token)match(input,24,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getRegexAccess().getGreaterThanSignKeyword_14());
                      		
                    }

                    }
                    break;
                case 16 :
                    // InternalRpp.g:1667:3: kw= '<'
                    {
                    kw=(Token)match(input,25,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getRegexAccess().getLessThanSignKeyword_15());
                      		
                    }

                    }
                    break;
                case 17 :
                    // InternalRpp.g:1673:3: kw= '{'
                    {
                    kw=(Token)match(input,11,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getRegexAccess().getLeftCurlyBracketKeyword_16());
                      		
                    }

                    }
                    break;
                case 18 :
                    // InternalRpp.g:1679:3: kw= '}'
                    {
                    kw=(Token)match(input,12,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getRegexAccess().getRightCurlyBracketKeyword_17());
                      		
                    }

                    }
                    break;
                case 19 :
                    // InternalRpp.g:1685:3: kw= '\"'
                    {
                    kw=(Token)match(input,49,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getRegexAccess().getQuotationMarkKeyword_18());
                      		
                    }

                    }
                    break;
                case 20 :
                    // InternalRpp.g:1691:3: kw= '\\''
                    {
                    kw=(Token)match(input,50,FOLLOW_2); if (state.failed) return current;
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
    // InternalRpp.g:1700:1: entryRuleRuleDefinition returns [EObject current=null] : iv_ruleRuleDefinition= ruleRuleDefinition EOF ;
    public final EObject entryRuleRuleDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRuleDefinition = null;


        try {
            // InternalRpp.g:1700:55: (iv_ruleRuleDefinition= ruleRuleDefinition EOF )
            // InternalRpp.g:1701:2: iv_ruleRuleDefinition= ruleRuleDefinition EOF
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
    // InternalRpp.g:1707:1: ruleRuleDefinition returns [EObject current=null] : ( (lv_parts_0_0= ruleRulePart ) )* ;
    public final EObject ruleRuleDefinition() throws RecognitionException {
        EObject current = null;

        EObject lv_parts_0_0 = null;



        	enterRule();

        try {
            // InternalRpp.g:1713:2: ( ( (lv_parts_0_0= ruleRulePart ) )* )
            // InternalRpp.g:1714:2: ( (lv_parts_0_0= ruleRulePart ) )*
            {
            // InternalRpp.g:1714:2: ( (lv_parts_0_0= ruleRulePart ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=RULE_ID && LA14_0<=RULE_WS)||(LA14_0>=11 && LA14_0<=12)||(LA14_0>=14 && LA14_0<=25)||(LA14_0>=49 && LA14_0<=50)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalRpp.g:1715:3: (lv_parts_0_0= ruleRulePart )
            	    {
            	    // InternalRpp.g:1715:3: (lv_parts_0_0= ruleRulePart )
            	    // InternalRpp.g:1716:4: lv_parts_0_0= ruleRulePart
            	    {
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getRuleDefinitionAccess().getPartsRulePartParserRuleCall_0());
            	      			
            	    }
            	    pushFollow(FOLLOW_13);
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
            	      					"de.roma.cocktail.xtext.Rpp.RulePart");
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
    // InternalRpp.g:1736:1: entryRuleRulePart returns [EObject current=null] : iv_ruleRulePart= ruleRulePart EOF ;
    public final EObject entryRuleRulePart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRulePart = null;


        try {
            // InternalRpp.g:1736:49: (iv_ruleRulePart= ruleRulePart EOF )
            // InternalRpp.g:1737:2: iv_ruleRulePart= ruleRulePart EOF
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
    // InternalRpp.g:1743:1: ruleRulePart returns [EObject current=null] : ( ( (lv_reg_0_0= ruleRegex ) ) | ( ( RULE_ID )=> (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleRulePart() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_reg_0_0 = null;



        	enterRule();

        try {
            // InternalRpp.g:1749:2: ( ( ( (lv_reg_0_0= ruleRegex ) ) | ( ( RULE_ID )=> (otherlv_1= RULE_ID ) ) ) )
            // InternalRpp.g:1750:2: ( ( (lv_reg_0_0= ruleRegex ) ) | ( ( RULE_ID )=> (otherlv_1= RULE_ID ) ) )
            {
            // InternalRpp.g:1750:2: ( ( (lv_reg_0_0= ruleRegex ) ) | ( ( RULE_ID )=> (otherlv_1= RULE_ID ) ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_ID) ) {
                int LA15_1 = input.LA(2);

                if ( (true) ) {
                    alt15=1;
                }
                else if ( (synpred2_InternalRpp()) ) {
                    alt15=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA15_0>=RULE_INT && LA15_0<=RULE_WS)||(LA15_0>=11 && LA15_0<=12)||(LA15_0>=14 && LA15_0<=25)||(LA15_0>=49 && LA15_0<=50)) ) {
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
                    // InternalRpp.g:1751:3: ( (lv_reg_0_0= ruleRegex ) )
                    {
                    // InternalRpp.g:1751:3: ( (lv_reg_0_0= ruleRegex ) )
                    // InternalRpp.g:1752:4: (lv_reg_0_0= ruleRegex )
                    {
                    // InternalRpp.g:1752:4: (lv_reg_0_0= ruleRegex )
                    // InternalRpp.g:1753:5: lv_reg_0_0= ruleRegex
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
                      						"de.roma.cocktail.xtext.Rpp.Regex");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalRpp.g:1771:3: ( ( RULE_ID )=> (otherlv_1= RULE_ID ) )
                    {
                    // InternalRpp.g:1771:3: ( ( RULE_ID )=> (otherlv_1= RULE_ID ) )
                    // InternalRpp.g:1772:4: ( RULE_ID )=> (otherlv_1= RULE_ID )
                    {
                    // InternalRpp.g:1773:4: (otherlv_1= RULE_ID )
                    // InternalRpp.g:1774:5: otherlv_1= RULE_ID
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
    // InternalRpp.g:1789:1: entryRuleRuleStart returns [EObject current=null] : iv_ruleRuleStart= ruleRuleStart EOF ;
    public final EObject entryRuleRuleStart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRuleStart = null;


        try {
            // InternalRpp.g:1789:50: (iv_ruleRuleStart= ruleRuleStart EOF )
            // InternalRpp.g:1790:2: iv_ruleRuleStart= ruleRuleStart EOF
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
    // InternalRpp.g:1796:1: ruleRuleStart returns [EObject current=null] : ( ( ( (lv_rulePrec_0_0= 'NOT' ) ) | ( (lv_rulePrec_1_0= '-' ) ) )? otherlv_2= '#' ( ( (otherlv_3= RULE_ID ) ) | ( (lv_ruleDefault_4_0= 'STD' ) ) | ( (lv_ruleDefault_5_0= '*' ) ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= '#' ) ;
    public final EObject ruleRuleStart() throws RecognitionException {
        EObject current = null;

        Token lv_rulePrec_0_0=null;
        Token lv_rulePrec_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_ruleDefault_4_0=null;
        Token lv_ruleDefault_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;


        	enterRule();

        try {
            // InternalRpp.g:1802:2: ( ( ( ( (lv_rulePrec_0_0= 'NOT' ) ) | ( (lv_rulePrec_1_0= '-' ) ) )? otherlv_2= '#' ( ( (otherlv_3= RULE_ID ) ) | ( (lv_ruleDefault_4_0= 'STD' ) ) | ( (lv_ruleDefault_5_0= '*' ) ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= '#' ) )
            // InternalRpp.g:1803:2: ( ( ( (lv_rulePrec_0_0= 'NOT' ) ) | ( (lv_rulePrec_1_0= '-' ) ) )? otherlv_2= '#' ( ( (otherlv_3= RULE_ID ) ) | ( (lv_ruleDefault_4_0= 'STD' ) ) | ( (lv_ruleDefault_5_0= '*' ) ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= '#' )
            {
            // InternalRpp.g:1803:2: ( ( ( (lv_rulePrec_0_0= 'NOT' ) ) | ( (lv_rulePrec_1_0= '-' ) ) )? otherlv_2= '#' ( ( (otherlv_3= RULE_ID ) ) | ( (lv_ruleDefault_4_0= 'STD' ) ) | ( (lv_ruleDefault_5_0= '*' ) ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= '#' )
            // InternalRpp.g:1804:3: ( ( (lv_rulePrec_0_0= 'NOT' ) ) | ( (lv_rulePrec_1_0= '-' ) ) )? otherlv_2= '#' ( ( (otherlv_3= RULE_ID ) ) | ( (lv_ruleDefault_4_0= 'STD' ) ) | ( (lv_ruleDefault_5_0= '*' ) ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= '#'
            {
            // InternalRpp.g:1804:3: ( ( (lv_rulePrec_0_0= 'NOT' ) ) | ( (lv_rulePrec_1_0= '-' ) ) )?
            int alt16=3;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==51) ) {
                alt16=1;
            }
            else if ( (LA16_0==15) ) {
                alt16=2;
            }
            switch (alt16) {
                case 1 :
                    // InternalRpp.g:1805:4: ( (lv_rulePrec_0_0= 'NOT' ) )
                    {
                    // InternalRpp.g:1805:4: ( (lv_rulePrec_0_0= 'NOT' ) )
                    // InternalRpp.g:1806:5: (lv_rulePrec_0_0= 'NOT' )
                    {
                    // InternalRpp.g:1806:5: (lv_rulePrec_0_0= 'NOT' )
                    // InternalRpp.g:1807:6: lv_rulePrec_0_0= 'NOT'
                    {
                    lv_rulePrec_0_0=(Token)match(input,51,FOLLOW_20); if (state.failed) return current;
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
                    // InternalRpp.g:1820:4: ( (lv_rulePrec_1_0= '-' ) )
                    {
                    // InternalRpp.g:1820:4: ( (lv_rulePrec_1_0= '-' ) )
                    // InternalRpp.g:1821:5: (lv_rulePrec_1_0= '-' )
                    {
                    // InternalRpp.g:1821:5: (lv_rulePrec_1_0= '-' )
                    // InternalRpp.g:1822:6: lv_rulePrec_1_0= '-'
                    {
                    lv_rulePrec_1_0=(Token)match(input,15,FOLLOW_20); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,28,FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getRuleStartAccess().getNumberSignKeyword_1());
              		
            }
            // InternalRpp.g:1839:3: ( ( (otherlv_3= RULE_ID ) ) | ( (lv_ruleDefault_4_0= 'STD' ) ) | ( (lv_ruleDefault_5_0= '*' ) ) )
            int alt17=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt17=1;
                }
                break;
            case 13:
                {
                alt17=2;
                }
                break;
            case 18:
                {
                alt17=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalRpp.g:1840:4: ( (otherlv_3= RULE_ID ) )
                    {
                    // InternalRpp.g:1840:4: ( (otherlv_3= RULE_ID ) )
                    // InternalRpp.g:1841:5: (otherlv_3= RULE_ID )
                    {
                    // InternalRpp.g:1841:5: (otherlv_3= RULE_ID )
                    // InternalRpp.g:1842:6: otherlv_3= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getRuleStartRule());
                      						}
                      					
                    }
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_22); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_3, grammarAccess.getRuleStartAccess().getRuleStatesStartStateCrossReference_2_0_0());
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalRpp.g:1854:4: ( (lv_ruleDefault_4_0= 'STD' ) )
                    {
                    // InternalRpp.g:1854:4: ( (lv_ruleDefault_4_0= 'STD' ) )
                    // InternalRpp.g:1855:5: (lv_ruleDefault_4_0= 'STD' )
                    {
                    // InternalRpp.g:1855:5: (lv_ruleDefault_4_0= 'STD' )
                    // InternalRpp.g:1856:6: lv_ruleDefault_4_0= 'STD'
                    {
                    lv_ruleDefault_4_0=(Token)match(input,13,FOLLOW_22); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_ruleDefault_4_0, grammarAccess.getRuleStartAccess().getRuleDefaultSTDKeyword_2_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getRuleStartRule());
                      						}
                      						setWithLastConsumed(current, "ruleDefault", lv_ruleDefault_4_0, "STD");
                      					
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalRpp.g:1869:4: ( (lv_ruleDefault_5_0= '*' ) )
                    {
                    // InternalRpp.g:1869:4: ( (lv_ruleDefault_5_0= '*' ) )
                    // InternalRpp.g:1870:5: (lv_ruleDefault_5_0= '*' )
                    {
                    // InternalRpp.g:1870:5: (lv_ruleDefault_5_0= '*' )
                    // InternalRpp.g:1871:6: lv_ruleDefault_5_0= '*'
                    {
                    lv_ruleDefault_5_0=(Token)match(input,18,FOLLOW_22); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_ruleDefault_5_0, grammarAccess.getRuleStartAccess().getRuleDefaultAsteriskKeyword_2_2_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getRuleStartRule());
                      						}
                      						setWithLastConsumed(current, "ruleDefault", lv_ruleDefault_5_0, "*");
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalRpp.g:1884:3: (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==35) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalRpp.g:1885:4: otherlv_6= ',' ( (otherlv_7= RULE_ID ) )
            	    {
            	    otherlv_6=(Token)match(input,35,FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_6, grammarAccess.getRuleStartAccess().getCommaKeyword_3_0());
            	      			
            	    }
            	    // InternalRpp.g:1889:4: ( (otherlv_7= RULE_ID ) )
            	    // InternalRpp.g:1890:5: (otherlv_7= RULE_ID )
            	    {
            	    // InternalRpp.g:1890:5: (otherlv_7= RULE_ID )
            	    // InternalRpp.g:1891:6: otherlv_7= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getRuleStartRule());
            	      						}
            	      					
            	    }
            	    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_22); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(otherlv_7, grammarAccess.getRuleStartAccess().getRuleStatesStartStateCrossReference_3_1_0());
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            otherlv_8=(Token)match(input,28,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_8, grammarAccess.getRuleStartAccess().getNumberSignKeyword_4());
              		
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

    // $ANTLR start synpred1_InternalRpp
    public final void synpred1_InternalRpp_fragment() throws RecognitionException {   
        // InternalRpp.g:492:4: ( 'STD' )
        // InternalRpp.g:492:5: 'STD'
        {
        match(input,13,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalRpp

    // $ANTLR start synpred2_InternalRpp
    public final void synpred2_InternalRpp_fragment() throws RecognitionException {   
        // InternalRpp.g:1772:4: ( RULE_ID )
        // InternalRpp.g:1772:5: RULE_ID
        {
        match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_InternalRpp

    // Delegated rules

    public final boolean synpred2_InternalRpp() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalRpp_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_InternalRpp() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalRpp_fragment(); // can never throw exception
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
    protected DFA3 dfa3 = new DFA3(this);
    static final String dfa_1s = "\15\uffff";
    static final String dfa_2s = "\1\44\14\uffff";
    static final String dfa_3s = "\1\60\14\uffff";
    static final String dfa_4s = "\1\uffff\1\14\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13";
    static final String dfa_5s = "\1\0\14\uffff}>";
    static final String[] dfa_6s = {
            "\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\2\1",
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
            return "()* loopback of 85:6: ( ({...}? => ( ({...}? => ( (lv_scanner_1_0= ruleScanner ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_export_2_0= ruleExport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_imports_3_0= ruleImport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_global_4_0= ruleGlobal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_local_5_0= ruleLocal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_default_6_0= ruleDefault ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_eof_7_0= ruleEof ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_begin_8_0= ruleBegin ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_close_9_0= ruleClose ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_define_10_0= ruleDefine ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_states_11_0= ruleStartStates ) ) ) ) ) )*";
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
                        if ( ((LA1_0>=47 && LA1_0<=48)) ) {s = 1;}

                        else if ( LA1_0 == 36 && getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_0(), 0) ) {s = 2;}

                        else if ( LA1_0 == 37 && getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_0(), 1) ) {s = 3;}

                        else if ( LA1_0 == 38 && getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_0(), 2) ) {s = 4;}

                        else if ( LA1_0 == 39 && getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_0(), 3) ) {s = 5;}

                        else if ( LA1_0 == 40 && getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_0(), 4) ) {s = 6;}

                        else if ( LA1_0 == 41 && getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_0(), 5) ) {s = 7;}

                        else if ( LA1_0 == 42 && getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_0(), 6) ) {s = 8;}

                        else if ( LA1_0 == 43 && getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_0(), 7) ) {s = 9;}

                        else if ( LA1_0 == 44 && getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_0(), 8) ) {s = 10;}

                        else if ( LA1_0 == 45 && getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_0(), 9) ) {s = 11;}

                        else if ( LA1_0 == 46 && getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_0(), 10) ) {s = 12;}

                         
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
    static final String dfa_7s = "\34\uffff";
    static final String dfa_8s = "\1\4\33\uffff";
    static final String dfa_9s = "\1\43\33\uffff";
    static final String dfa_10s = "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33";
    static final String dfa_11s = "\1\0\33\uffff}>";
    static final String[] dfa_12s = {
            "\1\2\1\3\1\4\1\5\5\uffff\1\1\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33",
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
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[][] dfa_12 = unpackEncodedStringArray(dfa_12s);

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "490:2: ( ( ( 'STD' )=>kw= 'STD' ) | this_ID_1= RULE_ID | this_INT_2= RULE_INT | this_STRING_3= RULE_STRING | this_WS_4= RULE_WS | kw= '+' | kw= '-' | kw= '(' | kw= ')' | kw= '*' | kw= '.' | kw= '/' | kw= '\\\\' | kw= '|' | kw= '?' | kw= '>' | kw= '<' | kw= '[' | kw= ']' | kw= '#' | kw= '$' | kw= '%' | kw= ';' | kw= ':' | kw= '!' | kw= '=' | kw= ',' )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA3_0 = input.LA(1);

                         
                        int index3_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA3_0==13) && (synpred1_InternalRpp())) {s = 1;}

                        else if ( (LA3_0==RULE_ID) ) {s = 2;}

                        else if ( (LA3_0==RULE_INT) ) {s = 3;}

                        else if ( (LA3_0==RULE_STRING) ) {s = 4;}

                        else if ( (LA3_0==RULE_WS) ) {s = 5;}

                        else if ( (LA3_0==14) ) {s = 6;}

                        else if ( (LA3_0==15) ) {s = 7;}

                        else if ( (LA3_0==16) ) {s = 8;}

                        else if ( (LA3_0==17) ) {s = 9;}

                        else if ( (LA3_0==18) ) {s = 10;}

                        else if ( (LA3_0==19) ) {s = 11;}

                        else if ( (LA3_0==20) ) {s = 12;}

                        else if ( (LA3_0==21) ) {s = 13;}

                        else if ( (LA3_0==22) ) {s = 14;}

                        else if ( (LA3_0==23) ) {s = 15;}

                        else if ( (LA3_0==24) ) {s = 16;}

                        else if ( (LA3_0==25) ) {s = 17;}

                        else if ( (LA3_0==26) ) {s = 18;}

                        else if ( (LA3_0==27) ) {s = 19;}

                        else if ( (LA3_0==28) ) {s = 20;}

                        else if ( (LA3_0==29) ) {s = 21;}

                        else if ( (LA3_0==30) ) {s = 22;}

                        else if ( (LA3_0==31) ) {s = 23;}

                        else if ( (LA3_0==32) ) {s = 24;}

                        else if ( (LA3_0==33) ) {s = 25;}

                        else if ( (LA3_0==34) ) {s = 26;}

                        else if ( (LA3_0==35) ) {s = 27;}

                         
                        input.seek(index3_0);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 3, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0001FFF000000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000FFFFFE8F2L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000FFFFFF8F0L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0006000003FFD8F0L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0006000003FFD8F2L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000800008002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000E000113FFD8F2L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0006000103FFD8F0L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000008800L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000042010L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000810000000L});

}
