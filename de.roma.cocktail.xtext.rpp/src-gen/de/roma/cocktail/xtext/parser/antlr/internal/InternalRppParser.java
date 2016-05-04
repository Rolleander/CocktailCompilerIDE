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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_ANY_OTHER", "'{'", "'}'", "'INSERT'", "'STD'", "'+'", "'-'", "'('", "')'", "'*'", "'.'", "'/'", "'\\\\'", "'|'", "'?'", "'>'", "'<'", "'['", "']'", "'#'", "'$'", "'%'", "';'", "':'", "'!'", "'='", "','", "'SCANNER'", "'EXPORT'", "'IMPORT'", "'GLOBAL'", "'LOCAL'", "'DEFAULT'", "'EOF'", "'BEGIN'", "'CLOSE'", "'DEFINE'", "'START'", "'RULE'", "'RULES'", "'CASE-INSENSITIVE'", "'\"'", "'\\''", "'NOT'"
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
    public static final int T__52=52;
    public static final int T__53=53;
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
    // InternalRpp.g:71:1: ruleModel returns [EObject current=null] : ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_scanner_1_0= ruleScanner ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_export_2_0= ruleExport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_imports_3_0= ruleImport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_global_4_0= ruleGlobal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_local_5_0= ruleLocal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_default_6_0= ruleDefault ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_eof_7_0= ruleEof ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_begin_8_0= ruleBegin ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_close_9_0= ruleClose ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_define_10_0= ruleDefine ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_states_11_0= ruleStartStates ) ) ) ) ) )* ) ) ) ( (lv_rules_12_0= ruleRule ) ) ( (lv_insert_13_0= ruleRuleInsert ) )? ) ;
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

        EObject lv_insert_13_0 = null;



        	enterRule();

        try {
            // InternalRpp.g:77:2: ( ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_scanner_1_0= ruleScanner ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_export_2_0= ruleExport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_imports_3_0= ruleImport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_global_4_0= ruleGlobal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_local_5_0= ruleLocal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_default_6_0= ruleDefault ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_eof_7_0= ruleEof ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_begin_8_0= ruleBegin ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_close_9_0= ruleClose ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_define_10_0= ruleDefine ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_states_11_0= ruleStartStates ) ) ) ) ) )* ) ) ) ( (lv_rules_12_0= ruleRule ) ) ( (lv_insert_13_0= ruleRuleInsert ) )? ) )
            // InternalRpp.g:78:2: ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_scanner_1_0= ruleScanner ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_export_2_0= ruleExport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_imports_3_0= ruleImport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_global_4_0= ruleGlobal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_local_5_0= ruleLocal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_default_6_0= ruleDefault ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_eof_7_0= ruleEof ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_begin_8_0= ruleBegin ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_close_9_0= ruleClose ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_define_10_0= ruleDefine ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_states_11_0= ruleStartStates ) ) ) ) ) )* ) ) ) ( (lv_rules_12_0= ruleRule ) ) ( (lv_insert_13_0= ruleRuleInsert ) )? )
            {
            // InternalRpp.g:78:2: ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_scanner_1_0= ruleScanner ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_export_2_0= ruleExport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_imports_3_0= ruleImport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_global_4_0= ruleGlobal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_local_5_0= ruleLocal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_default_6_0= ruleDefault ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_eof_7_0= ruleEof ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_begin_8_0= ruleBegin ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_close_9_0= ruleClose ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_define_10_0= ruleDefine ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_states_11_0= ruleStartStates ) ) ) ) ) )* ) ) ) ( (lv_rules_12_0= ruleRule ) ) ( (lv_insert_13_0= ruleRuleInsert ) )? )
            // InternalRpp.g:79:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_scanner_1_0= ruleScanner ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_export_2_0= ruleExport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_imports_3_0= ruleImport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_global_4_0= ruleGlobal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_local_5_0= ruleLocal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_default_6_0= ruleDefault ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_eof_7_0= ruleEof ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_begin_8_0= ruleBegin ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_close_9_0= ruleClose ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_define_10_0= ruleDefine ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_states_11_0= ruleStartStates ) ) ) ) ) )* ) ) ) ( (lv_rules_12_0= ruleRule ) ) ( (lv_insert_13_0= ruleRuleInsert ) )?
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
            pushFollow(FOLLOW_4);
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

            // InternalRpp.g:420:3: ( (lv_insert_13_0= ruleRuleInsert ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalRpp.g:421:4: (lv_insert_13_0= ruleRuleInsert )
                    {
                    // InternalRpp.g:421:4: (lv_insert_13_0= ruleRuleInsert )
                    // InternalRpp.g:422:5: lv_insert_13_0= ruleRuleInsert
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getModelAccess().getInsertRuleInsertParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_insert_13_0=ruleRuleInsert();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getModelRule());
                      					}
                      					set(
                      						current,
                      						"insert",
                      						lv_insert_13_0,
                      						"de.roma.cocktail.xtext.Rpp.RuleInsert");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleCodeBlock"
    // InternalRpp.g:443:1: entryRuleCodeBlock returns [EObject current=null] : iv_ruleCodeBlock= ruleCodeBlock EOF ;
    public final EObject entryRuleCodeBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCodeBlock = null;


        try {
            // InternalRpp.g:443:50: (iv_ruleCodeBlock= ruleCodeBlock EOF )
            // InternalRpp.g:444:2: iv_ruleCodeBlock= ruleCodeBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCodeBlockRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCodeBlock=ruleCodeBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCodeBlock; 
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
    // InternalRpp.g:450:1: ruleCodeBlock returns [EObject current=null] : ( ( (lv_wall_0_0= ruleCodeWall ) ) | (otherlv_1= '{' ( (lv_block_2_0= ruleCodeBlock ) ) otherlv_3= '}' ) )* ;
    public final EObject ruleCodeBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_wall_0_0 = null;

        EObject lv_block_2_0 = null;



        	enterRule();

        try {
            // InternalRpp.g:456:2: ( ( ( (lv_wall_0_0= ruleCodeWall ) ) | (otherlv_1= '{' ( (lv_block_2_0= ruleCodeBlock ) ) otherlv_3= '}' ) )* )
            // InternalRpp.g:457:2: ( ( (lv_wall_0_0= ruleCodeWall ) ) | (otherlv_1= '{' ( (lv_block_2_0= ruleCodeBlock ) ) otherlv_3= '}' ) )*
            {
            // InternalRpp.g:457:2: ( ( (lv_wall_0_0= ruleCodeWall ) ) | (otherlv_1= '{' ( (lv_block_2_0= ruleCodeBlock ) ) otherlv_3= '}' ) )*
            loop3:
            do {
                int alt3=3;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=RULE_ID && LA3_0<=RULE_WS)||(LA3_0>=13 && LA3_0<=36)) ) {
                    alt3=1;
                }
                else if ( (LA3_0==11) ) {
                    alt3=2;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalRpp.g:458:3: ( (lv_wall_0_0= ruleCodeWall ) )
            	    {
            	    // InternalRpp.g:458:3: ( (lv_wall_0_0= ruleCodeWall ) )
            	    // InternalRpp.g:459:4: (lv_wall_0_0= ruleCodeWall )
            	    {
            	    // InternalRpp.g:459:4: (lv_wall_0_0= ruleCodeWall )
            	    // InternalRpp.g:460:5: lv_wall_0_0= ruleCodeWall
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getCodeBlockAccess().getWallCodeWallParserRuleCall_0_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_5);
            	    lv_wall_0_0=ruleCodeWall();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getCodeBlockRule());
            	      					}
            	      					add(
            	      						current,
            	      						"wall",
            	      						lv_wall_0_0,
            	      						"de.roma.cocktail.xtext.Rpp.CodeWall");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalRpp.g:478:3: (otherlv_1= '{' ( (lv_block_2_0= ruleCodeBlock ) ) otherlv_3= '}' )
            	    {
            	    // InternalRpp.g:478:3: (otherlv_1= '{' ( (lv_block_2_0= ruleCodeBlock ) ) otherlv_3= '}' )
            	    // InternalRpp.g:479:4: otherlv_1= '{' ( (lv_block_2_0= ruleCodeBlock ) ) otherlv_3= '}'
            	    {
            	    otherlv_1=(Token)match(input,11,FOLLOW_6); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getCodeBlockAccess().getLeftCurlyBracketKeyword_1_0());
            	      			
            	    }
            	    // InternalRpp.g:483:4: ( (lv_block_2_0= ruleCodeBlock ) )
            	    // InternalRpp.g:484:5: (lv_block_2_0= ruleCodeBlock )
            	    {
            	    // InternalRpp.g:484:5: (lv_block_2_0= ruleCodeBlock )
            	    // InternalRpp.g:485:6: lv_block_2_0= ruleCodeBlock
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getCodeBlockAccess().getBlockCodeBlockParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_7);
            	    lv_block_2_0=ruleCodeBlock();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getCodeBlockRule());
            	      						}
            	      						add(
            	      							current,
            	      							"block",
            	      							lv_block_2_0,
            	      							"de.roma.cocktail.xtext.Rpp.CodeBlock");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }

            	    otherlv_3=(Token)match(input,12,FOLLOW_5); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_3, grammarAccess.getCodeBlockAccess().getRightCurlyBracketKeyword_1_2());
            	      			
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
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
    // InternalRpp.g:511:1: entryRuleCodeWall returns [String current=null] : iv_ruleCodeWall= ruleCodeWall EOF ;
    public final String entryRuleCodeWall() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCodeWall = null;


        try {
            // InternalRpp.g:511:48: (iv_ruleCodeWall= ruleCodeWall EOF )
            // InternalRpp.g:512:2: iv_ruleCodeWall= ruleCodeWall EOF
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
    // InternalRpp.g:518:1: ruleCodeWall returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( ( 'INSERT' | 'STD' )=> (kw= 'INSERT' | kw= 'STD' ) ) | this_ID_2= RULE_ID | this_INT_3= RULE_INT | this_STRING_4= RULE_STRING | this_WS_5= RULE_WS | kw= '+' | kw= '-' | kw= '(' | kw= ')' | kw= '*' | kw= '.' | kw= '/' | kw= '\\\\' | kw= '|' | kw= '?' | kw= '>' | kw= '<' | kw= '[' | kw= ']' | kw= '#' | kw= '$' | kw= '%' | kw= ';' | kw= ':' | kw= '!' | kw= '=' | kw= ',' ) ;
    public final AntlrDatatypeRuleToken ruleCodeWall() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_2=null;
        Token this_INT_3=null;
        Token this_STRING_4=null;
        Token this_WS_5=null;


        	enterRule();

        try {
            // InternalRpp.g:524:2: ( ( ( ( 'INSERT' | 'STD' )=> (kw= 'INSERT' | kw= 'STD' ) ) | this_ID_2= RULE_ID | this_INT_3= RULE_INT | this_STRING_4= RULE_STRING | this_WS_5= RULE_WS | kw= '+' | kw= '-' | kw= '(' | kw= ')' | kw= '*' | kw= '.' | kw= '/' | kw= '\\\\' | kw= '|' | kw= '?' | kw= '>' | kw= '<' | kw= '[' | kw= ']' | kw= '#' | kw= '$' | kw= '%' | kw= ';' | kw= ':' | kw= '!' | kw= '=' | kw= ',' ) )
            // InternalRpp.g:525:2: ( ( ( 'INSERT' | 'STD' )=> (kw= 'INSERT' | kw= 'STD' ) ) | this_ID_2= RULE_ID | this_INT_3= RULE_INT | this_STRING_4= RULE_STRING | this_WS_5= RULE_WS | kw= '+' | kw= '-' | kw= '(' | kw= ')' | kw= '*' | kw= '.' | kw= '/' | kw= '\\\\' | kw= '|' | kw= '?' | kw= '>' | kw= '<' | kw= '[' | kw= ']' | kw= '#' | kw= '$' | kw= '%' | kw= ';' | kw= ':' | kw= '!' | kw= '=' | kw= ',' )
            {
            // InternalRpp.g:525:2: ( ( ( 'INSERT' | 'STD' )=> (kw= 'INSERT' | kw= 'STD' ) ) | this_ID_2= RULE_ID | this_INT_3= RULE_INT | this_STRING_4= RULE_STRING | this_WS_5= RULE_WS | kw= '+' | kw= '-' | kw= '(' | kw= ')' | kw= '*' | kw= '.' | kw= '/' | kw= '\\\\' | kw= '|' | kw= '?' | kw= '>' | kw= '<' | kw= '[' | kw= ']' | kw= '#' | kw= '$' | kw= '%' | kw= ';' | kw= ':' | kw= '!' | kw= '=' | kw= ',' )
            int alt5=27;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // InternalRpp.g:526:3: ( ( 'INSERT' | 'STD' )=> (kw= 'INSERT' | kw= 'STD' ) )
                    {
                    // InternalRpp.g:526:3: ( ( 'INSERT' | 'STD' )=> (kw= 'INSERT' | kw= 'STD' ) )
                    // InternalRpp.g:527:4: ( 'INSERT' | 'STD' )=> (kw= 'INSERT' | kw= 'STD' )
                    {
                    // InternalRpp.g:528:4: (kw= 'INSERT' | kw= 'STD' )
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==13) ) {
                        alt4=1;
                    }
                    else if ( (LA4_0==14) ) {
                        alt4=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 0, input);

                        throw nvae;
                    }
                    switch (alt4) {
                        case 1 :
                            // InternalRpp.g:529:5: kw= 'INSERT'
                            {
                            kw=(Token)match(input,13,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(kw);
                              					newLeafNode(kw, grammarAccess.getCodeWallAccess().getINSERTKeyword_0_0_0());
                              				
                            }

                            }
                            break;
                        case 2 :
                            // InternalRpp.g:535:5: kw= 'STD'
                            {
                            kw=(Token)match(input,14,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(kw);
                              					newLeafNode(kw, grammarAccess.getCodeWallAccess().getSTDKeyword_0_0_1());
                              				
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalRpp.g:543:3: this_ID_2= RULE_ID
                    {
                    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_ID_2);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_ID_2, grammarAccess.getCodeWallAccess().getIDTerminalRuleCall_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalRpp.g:551:3: this_INT_3= RULE_INT
                    {
                    this_INT_3=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_INT_3);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_INT_3, grammarAccess.getCodeWallAccess().getINTTerminalRuleCall_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalRpp.g:559:3: this_STRING_4= RULE_STRING
                    {
                    this_STRING_4=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_STRING_4);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_STRING_4, grammarAccess.getCodeWallAccess().getSTRINGTerminalRuleCall_3());
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalRpp.g:567:3: this_WS_5= RULE_WS
                    {
                    this_WS_5=(Token)match(input,RULE_WS,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_WS_5);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_WS_5, grammarAccess.getCodeWallAccess().getWSTerminalRuleCall_4());
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalRpp.g:575:3: kw= '+'
                    {
                    kw=(Token)match(input,15,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCodeWallAccess().getPlusSignKeyword_5());
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalRpp.g:581:3: kw= '-'
                    {
                    kw=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCodeWallAccess().getHyphenMinusKeyword_6());
                      		
                    }

                    }
                    break;
                case 8 :
                    // InternalRpp.g:587:3: kw= '('
                    {
                    kw=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCodeWallAccess().getLeftParenthesisKeyword_7());
                      		
                    }

                    }
                    break;
                case 9 :
                    // InternalRpp.g:593:3: kw= ')'
                    {
                    kw=(Token)match(input,18,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCodeWallAccess().getRightParenthesisKeyword_8());
                      		
                    }

                    }
                    break;
                case 10 :
                    // InternalRpp.g:599:3: kw= '*'
                    {
                    kw=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCodeWallAccess().getAsteriskKeyword_9());
                      		
                    }

                    }
                    break;
                case 11 :
                    // InternalRpp.g:605:3: kw= '.'
                    {
                    kw=(Token)match(input,20,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCodeWallAccess().getFullStopKeyword_10());
                      		
                    }

                    }
                    break;
                case 12 :
                    // InternalRpp.g:611:3: kw= '/'
                    {
                    kw=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCodeWallAccess().getSolidusKeyword_11());
                      		
                    }

                    }
                    break;
                case 13 :
                    // InternalRpp.g:617:3: kw= '\\\\'
                    {
                    kw=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCodeWallAccess().getReverseSolidusKeyword_12());
                      		
                    }

                    }
                    break;
                case 14 :
                    // InternalRpp.g:623:3: kw= '|'
                    {
                    kw=(Token)match(input,23,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCodeWallAccess().getVerticalLineKeyword_13());
                      		
                    }

                    }
                    break;
                case 15 :
                    // InternalRpp.g:629:3: kw= '?'
                    {
                    kw=(Token)match(input,24,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCodeWallAccess().getQuestionMarkKeyword_14());
                      		
                    }

                    }
                    break;
                case 16 :
                    // InternalRpp.g:635:3: kw= '>'
                    {
                    kw=(Token)match(input,25,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCodeWallAccess().getGreaterThanSignKeyword_15());
                      		
                    }

                    }
                    break;
                case 17 :
                    // InternalRpp.g:641:3: kw= '<'
                    {
                    kw=(Token)match(input,26,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCodeWallAccess().getLessThanSignKeyword_16());
                      		
                    }

                    }
                    break;
                case 18 :
                    // InternalRpp.g:647:3: kw= '['
                    {
                    kw=(Token)match(input,27,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCodeWallAccess().getLeftSquareBracketKeyword_17());
                      		
                    }

                    }
                    break;
                case 19 :
                    // InternalRpp.g:653:3: kw= ']'
                    {
                    kw=(Token)match(input,28,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCodeWallAccess().getRightSquareBracketKeyword_18());
                      		
                    }

                    }
                    break;
                case 20 :
                    // InternalRpp.g:659:3: kw= '#'
                    {
                    kw=(Token)match(input,29,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCodeWallAccess().getNumberSignKeyword_19());
                      		
                    }

                    }
                    break;
                case 21 :
                    // InternalRpp.g:665:3: kw= '$'
                    {
                    kw=(Token)match(input,30,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCodeWallAccess().getDollarSignKeyword_20());
                      		
                    }

                    }
                    break;
                case 22 :
                    // InternalRpp.g:671:3: kw= '%'
                    {
                    kw=(Token)match(input,31,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCodeWallAccess().getPercentSignKeyword_21());
                      		
                    }

                    }
                    break;
                case 23 :
                    // InternalRpp.g:677:3: kw= ';'
                    {
                    kw=(Token)match(input,32,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCodeWallAccess().getSemicolonKeyword_22());
                      		
                    }

                    }
                    break;
                case 24 :
                    // InternalRpp.g:683:3: kw= ':'
                    {
                    kw=(Token)match(input,33,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCodeWallAccess().getColonKeyword_23());
                      		
                    }

                    }
                    break;
                case 25 :
                    // InternalRpp.g:689:3: kw= '!'
                    {
                    kw=(Token)match(input,34,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCodeWallAccess().getExclamationMarkKeyword_24());
                      		
                    }

                    }
                    break;
                case 26 :
                    // InternalRpp.g:695:3: kw= '='
                    {
                    kw=(Token)match(input,35,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCodeWallAccess().getEqualsSignKeyword_25());
                      		
                    }

                    }
                    break;
                case 27 :
                    // InternalRpp.g:701:3: kw= ','
                    {
                    kw=(Token)match(input,36,FOLLOW_2); if (state.failed) return current;
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
    // InternalRpp.g:710:1: entryRuleScanner returns [EObject current=null] : iv_ruleScanner= ruleScanner EOF ;
    public final EObject entryRuleScanner() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScanner = null;


        try {
            // InternalRpp.g:710:48: (iv_ruleScanner= ruleScanner EOF )
            // InternalRpp.g:711:2: iv_ruleScanner= ruleScanner EOF
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
    // InternalRpp.g:717:1: ruleScanner returns [EObject current=null] : (otherlv_0= 'SCANNER' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleScanner() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalRpp.g:723:2: ( (otherlv_0= 'SCANNER' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalRpp.g:724:2: (otherlv_0= 'SCANNER' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalRpp.g:724:2: (otherlv_0= 'SCANNER' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalRpp.g:725:3: otherlv_0= 'SCANNER' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,37,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getScannerAccess().getSCANNERKeyword_0());
              		
            }
            // InternalRpp.g:729:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRpp.g:730:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRpp.g:730:4: (lv_name_1_0= RULE_ID )
            // InternalRpp.g:731:5: lv_name_1_0= RULE_ID
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
    // InternalRpp.g:751:1: entryRuleExport returns [EObject current=null] : iv_ruleExport= ruleExport EOF ;
    public final EObject entryRuleExport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExport = null;


        try {
            // InternalRpp.g:751:47: (iv_ruleExport= ruleExport EOF )
            // InternalRpp.g:752:2: iv_ruleExport= ruleExport EOF
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
    // InternalRpp.g:758:1: ruleExport returns [EObject current=null] : (otherlv_0= 'EXPORT' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' ) ;
    public final EObject ruleExport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_content_2_0 = null;



        	enterRule();

        try {
            // InternalRpp.g:764:2: ( (otherlv_0= 'EXPORT' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' ) )
            // InternalRpp.g:765:2: (otherlv_0= 'EXPORT' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' )
            {
            // InternalRpp.g:765:2: (otherlv_0= 'EXPORT' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' )
            // InternalRpp.g:766:3: otherlv_0= 'EXPORT' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getExportAccess().getEXPORTKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,11,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getExportAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalRpp.g:774:3: ( (lv_content_2_0= ruleCodeBlock ) )
            // InternalRpp.g:775:4: (lv_content_2_0= ruleCodeBlock )
            {
            // InternalRpp.g:775:4: (lv_content_2_0= ruleCodeBlock )
            // InternalRpp.g:776:5: lv_content_2_0= ruleCodeBlock
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
    // InternalRpp.g:801:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalRpp.g:801:47: (iv_ruleImport= ruleImport EOF )
            // InternalRpp.g:802:2: iv_ruleImport= ruleImport EOF
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
    // InternalRpp.g:808:1: ruleImport returns [EObject current=null] : (otherlv_0= 'IMPORT' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_content_2_0 = null;



        	enterRule();

        try {
            // InternalRpp.g:814:2: ( (otherlv_0= 'IMPORT' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' ) )
            // InternalRpp.g:815:2: (otherlv_0= 'IMPORT' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' )
            {
            // InternalRpp.g:815:2: (otherlv_0= 'IMPORT' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' )
            // InternalRpp.g:816:3: otherlv_0= 'IMPORT' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,39,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getImportAccess().getIMPORTKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,11,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getImportAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalRpp.g:824:3: ( (lv_content_2_0= ruleCodeBlock ) )
            // InternalRpp.g:825:4: (lv_content_2_0= ruleCodeBlock )
            {
            // InternalRpp.g:825:4: (lv_content_2_0= ruleCodeBlock )
            // InternalRpp.g:826:5: lv_content_2_0= ruleCodeBlock
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getImportAccess().getContentCodeBlockParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_7);
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
    // InternalRpp.g:851:1: entryRuleGlobal returns [EObject current=null] : iv_ruleGlobal= ruleGlobal EOF ;
    public final EObject entryRuleGlobal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGlobal = null;


        try {
            // InternalRpp.g:851:47: (iv_ruleGlobal= ruleGlobal EOF )
            // InternalRpp.g:852:2: iv_ruleGlobal= ruleGlobal EOF
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
    // InternalRpp.g:858:1: ruleGlobal returns [EObject current=null] : (otherlv_0= 'GLOBAL' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' ) ;
    public final EObject ruleGlobal() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_content_2_0 = null;



        	enterRule();

        try {
            // InternalRpp.g:864:2: ( (otherlv_0= 'GLOBAL' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' ) )
            // InternalRpp.g:865:2: (otherlv_0= 'GLOBAL' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' )
            {
            // InternalRpp.g:865:2: (otherlv_0= 'GLOBAL' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' )
            // InternalRpp.g:866:3: otherlv_0= 'GLOBAL' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,40,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGlobalAccess().getGLOBALKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,11,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGlobalAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalRpp.g:874:3: ( (lv_content_2_0= ruleCodeBlock ) )
            // InternalRpp.g:875:4: (lv_content_2_0= ruleCodeBlock )
            {
            // InternalRpp.g:875:4: (lv_content_2_0= ruleCodeBlock )
            // InternalRpp.g:876:5: lv_content_2_0= ruleCodeBlock
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
    // InternalRpp.g:901:1: entryRuleLocal returns [EObject current=null] : iv_ruleLocal= ruleLocal EOF ;
    public final EObject entryRuleLocal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocal = null;


        try {
            // InternalRpp.g:901:46: (iv_ruleLocal= ruleLocal EOF )
            // InternalRpp.g:902:2: iv_ruleLocal= ruleLocal EOF
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
    // InternalRpp.g:908:1: ruleLocal returns [EObject current=null] : (otherlv_0= 'LOCAL' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' ) ;
    public final EObject ruleLocal() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_content_2_0 = null;



        	enterRule();

        try {
            // InternalRpp.g:914:2: ( (otherlv_0= 'LOCAL' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' ) )
            // InternalRpp.g:915:2: (otherlv_0= 'LOCAL' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' )
            {
            // InternalRpp.g:915:2: (otherlv_0= 'LOCAL' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' )
            // InternalRpp.g:916:3: otherlv_0= 'LOCAL' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getLocalAccess().getLOCALKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,11,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getLocalAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalRpp.g:924:3: ( (lv_content_2_0= ruleCodeBlock ) )
            // InternalRpp.g:925:4: (lv_content_2_0= ruleCodeBlock )
            {
            // InternalRpp.g:925:4: (lv_content_2_0= ruleCodeBlock )
            // InternalRpp.g:926:5: lv_content_2_0= ruleCodeBlock
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
    // InternalRpp.g:951:1: entryRuleDefault returns [EObject current=null] : iv_ruleDefault= ruleDefault EOF ;
    public final EObject entryRuleDefault() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefault = null;


        try {
            // InternalRpp.g:951:48: (iv_ruleDefault= ruleDefault EOF )
            // InternalRpp.g:952:2: iv_ruleDefault= ruleDefault EOF
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
    // InternalRpp.g:958:1: ruleDefault returns [EObject current=null] : (otherlv_0= 'DEFAULT' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' ) ;
    public final EObject ruleDefault() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_content_2_0 = null;



        	enterRule();

        try {
            // InternalRpp.g:964:2: ( (otherlv_0= 'DEFAULT' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' ) )
            // InternalRpp.g:965:2: (otherlv_0= 'DEFAULT' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' )
            {
            // InternalRpp.g:965:2: (otherlv_0= 'DEFAULT' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' )
            // InternalRpp.g:966:3: otherlv_0= 'DEFAULT' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,42,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDefaultAccess().getDEFAULTKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,11,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDefaultAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalRpp.g:974:3: ( (lv_content_2_0= ruleCodeBlock ) )
            // InternalRpp.g:975:4: (lv_content_2_0= ruleCodeBlock )
            {
            // InternalRpp.g:975:4: (lv_content_2_0= ruleCodeBlock )
            // InternalRpp.g:976:5: lv_content_2_0= ruleCodeBlock
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
    // InternalRpp.g:1001:1: entryRuleEof returns [EObject current=null] : iv_ruleEof= ruleEof EOF ;
    public final EObject entryRuleEof() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEof = null;


        try {
            // InternalRpp.g:1001:44: (iv_ruleEof= ruleEof EOF )
            // InternalRpp.g:1002:2: iv_ruleEof= ruleEof EOF
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
    // InternalRpp.g:1008:1: ruleEof returns [EObject current=null] : (otherlv_0= 'EOF' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' ) ;
    public final EObject ruleEof() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_content_2_0 = null;



        	enterRule();

        try {
            // InternalRpp.g:1014:2: ( (otherlv_0= 'EOF' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' ) )
            // InternalRpp.g:1015:2: (otherlv_0= 'EOF' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' )
            {
            // InternalRpp.g:1015:2: (otherlv_0= 'EOF' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' )
            // InternalRpp.g:1016:3: otherlv_0= 'EOF' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,43,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getEofAccess().getEOFKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,11,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getEofAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalRpp.g:1024:3: ( (lv_content_2_0= ruleCodeBlock ) )
            // InternalRpp.g:1025:4: (lv_content_2_0= ruleCodeBlock )
            {
            // InternalRpp.g:1025:4: (lv_content_2_0= ruleCodeBlock )
            // InternalRpp.g:1026:5: lv_content_2_0= ruleCodeBlock
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
    // InternalRpp.g:1051:1: entryRuleBegin returns [EObject current=null] : iv_ruleBegin= ruleBegin EOF ;
    public final EObject entryRuleBegin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBegin = null;


        try {
            // InternalRpp.g:1051:46: (iv_ruleBegin= ruleBegin EOF )
            // InternalRpp.g:1052:2: iv_ruleBegin= ruleBegin EOF
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
    // InternalRpp.g:1058:1: ruleBegin returns [EObject current=null] : (otherlv_0= 'BEGIN' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' ) ;
    public final EObject ruleBegin() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_content_2_0 = null;



        	enterRule();

        try {
            // InternalRpp.g:1064:2: ( (otherlv_0= 'BEGIN' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' ) )
            // InternalRpp.g:1065:2: (otherlv_0= 'BEGIN' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' )
            {
            // InternalRpp.g:1065:2: (otherlv_0= 'BEGIN' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' )
            // InternalRpp.g:1066:3: otherlv_0= 'BEGIN' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,44,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getBeginAccess().getBEGINKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,11,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getBeginAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalRpp.g:1074:3: ( (lv_content_2_0= ruleCodeBlock ) )
            // InternalRpp.g:1075:4: (lv_content_2_0= ruleCodeBlock )
            {
            // InternalRpp.g:1075:4: (lv_content_2_0= ruleCodeBlock )
            // InternalRpp.g:1076:5: lv_content_2_0= ruleCodeBlock
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
    // InternalRpp.g:1101:1: entryRuleClose returns [EObject current=null] : iv_ruleClose= ruleClose EOF ;
    public final EObject entryRuleClose() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClose = null;


        try {
            // InternalRpp.g:1101:46: (iv_ruleClose= ruleClose EOF )
            // InternalRpp.g:1102:2: iv_ruleClose= ruleClose EOF
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
    // InternalRpp.g:1108:1: ruleClose returns [EObject current=null] : (otherlv_0= 'CLOSE' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' ) ;
    public final EObject ruleClose() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_content_2_0 = null;



        	enterRule();

        try {
            // InternalRpp.g:1114:2: ( (otherlv_0= 'CLOSE' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' ) )
            // InternalRpp.g:1115:2: (otherlv_0= 'CLOSE' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' )
            {
            // InternalRpp.g:1115:2: (otherlv_0= 'CLOSE' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' )
            // InternalRpp.g:1116:3: otherlv_0= 'CLOSE' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,45,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getCloseAccess().getCLOSEKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,11,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getCloseAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalRpp.g:1124:3: ( (lv_content_2_0= ruleCodeBlock ) )
            // InternalRpp.g:1125:4: (lv_content_2_0= ruleCodeBlock )
            {
            // InternalRpp.g:1125:4: (lv_content_2_0= ruleCodeBlock )
            // InternalRpp.g:1126:5: lv_content_2_0= ruleCodeBlock
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
    // InternalRpp.g:1151:1: entryRuleDefine returns [EObject current=null] : iv_ruleDefine= ruleDefine EOF ;
    public final EObject entryRuleDefine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefine = null;


        try {
            // InternalRpp.g:1151:47: (iv_ruleDefine= ruleDefine EOF )
            // InternalRpp.g:1152:2: iv_ruleDefine= ruleDefine EOF
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
    // InternalRpp.g:1158:1: ruleDefine returns [EObject current=null] : (otherlv_0= 'DEFINE' ( (lv_defines_1_0= ruleDefineRule ) )+ ) ;
    public final EObject ruleDefine() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_defines_1_0 = null;



        	enterRule();

        try {
            // InternalRpp.g:1164:2: ( (otherlv_0= 'DEFINE' ( (lv_defines_1_0= ruleDefineRule ) )+ ) )
            // InternalRpp.g:1165:2: (otherlv_0= 'DEFINE' ( (lv_defines_1_0= ruleDefineRule ) )+ )
            {
            // InternalRpp.g:1165:2: (otherlv_0= 'DEFINE' ( (lv_defines_1_0= ruleDefineRule ) )+ )
            // InternalRpp.g:1166:3: otherlv_0= 'DEFINE' ( (lv_defines_1_0= ruleDefineRule ) )+
            {
            otherlv_0=(Token)match(input,46,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDefineAccess().getDEFINEKeyword_0());
              		
            }
            // InternalRpp.g:1170:3: ( (lv_defines_1_0= ruleDefineRule ) )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalRpp.g:1171:4: (lv_defines_1_0= ruleDefineRule )
            	    {
            	    // InternalRpp.g:1171:4: (lv_defines_1_0= ruleDefineRule )
            	    // InternalRpp.g:1172:5: lv_defines_1_0= ruleDefineRule
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
            	      						"de.roma.cocktail.xtext.Rpp.DefineRule");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
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
    // InternalRpp.g:1193:1: entryRuleDefineRule returns [EObject current=null] : iv_ruleDefineRule= ruleDefineRule EOF ;
    public final EObject entryRuleDefineRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefineRule = null;


        try {
            // InternalRpp.g:1193:51: (iv_ruleDefineRule= ruleDefineRule EOF )
            // InternalRpp.g:1194:2: iv_ruleDefineRule= ruleDefineRule EOF
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
    // InternalRpp.g:1200:1: ruleDefineRule returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_rule_2_0= ruleDefineRegex ) ) otherlv_3= '.' ) ;
    public final EObject ruleDefineRule() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_rule_2_0 = null;



        	enterRule();

        try {
            // InternalRpp.g:1206:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_rule_2_0= ruleDefineRegex ) ) otherlv_3= '.' ) )
            // InternalRpp.g:1207:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_rule_2_0= ruleDefineRegex ) ) otherlv_3= '.' )
            {
            // InternalRpp.g:1207:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_rule_2_0= ruleDefineRegex ) ) otherlv_3= '.' )
            // InternalRpp.g:1208:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_rule_2_0= ruleDefineRegex ) ) otherlv_3= '.'
            {
            // InternalRpp.g:1208:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalRpp.g:1209:4: (lv_name_0_0= RULE_ID )
            {
            // InternalRpp.g:1209:4: (lv_name_0_0= RULE_ID )
            // InternalRpp.g:1210:5: lv_name_0_0= RULE_ID
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

            otherlv_1=(Token)match(input,35,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDefineRuleAccess().getEqualsSignKeyword_1());
              		
            }
            // InternalRpp.g:1230:3: ( (lv_rule_2_0= ruleDefineRegex ) )
            // InternalRpp.g:1231:4: (lv_rule_2_0= ruleDefineRegex )
            {
            // InternalRpp.g:1231:4: (lv_rule_2_0= ruleDefineRegex )
            // InternalRpp.g:1232:5: lv_rule_2_0= ruleDefineRegex
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
              						"de.roma.cocktail.xtext.Rpp.DefineRegex");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,20,FOLLOW_2); if (state.failed) return current;
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
    // InternalRpp.g:1257:1: entryRuleDefineRegex returns [String current=null] : iv_ruleDefineRegex= ruleDefineRegex EOF ;
    public final String entryRuleDefineRegex() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDefineRegex = null;


        try {
            // InternalRpp.g:1257:51: (iv_ruleDefineRegex= ruleDefineRegex EOF )
            // InternalRpp.g:1258:2: iv_ruleDefineRegex= ruleDefineRegex EOF
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
    // InternalRpp.g:1264:1: ruleDefineRegex returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Regex_0= ruleRegex )* ;
    public final AntlrDatatypeRuleToken ruleDefineRegex() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Regex_0 = null;



        	enterRule();

        try {
            // InternalRpp.g:1270:2: ( (this_Regex_0= ruleRegex )* )
            // InternalRpp.g:1271:2: (this_Regex_0= ruleRegex )*
            {
            // InternalRpp.g:1271:2: (this_Regex_0= ruleRegex )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==20) ) {
                    switch ( input.LA(2) ) {
                    case EOF:
                        {
                        int LA7_4 = input.LA(3);

                        if ( (LA7_4==EOF) ) {
                            alt7=1;
                        }


                        }
                        break;
                    case RULE_ID:
                        {
                        int LA7_5 = input.LA(3);

                        if ( (LA7_5==EOF||(LA7_5>=RULE_ID && LA7_5<=RULE_WS)||(LA7_5>=11 && LA7_5<=12)||(LA7_5>=15 && LA7_5<=26)||(LA7_5>=51 && LA7_5<=52)) ) {
                            alt7=1;
                        }


                        }
                        break;
                    case RULE_INT:
                    case RULE_STRING:
                    case RULE_WS:
                    case 11:
                    case 12:
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
                    case 26:
                    case 51:
                    case 52:
                        {
                        alt7=1;
                        }
                        break;

                    }

                }
                else if ( ((LA7_0>=RULE_ID && LA7_0<=RULE_WS)||(LA7_0>=11 && LA7_0<=12)||(LA7_0>=15 && LA7_0<=19)||(LA7_0>=21 && LA7_0<=26)||(LA7_0>=51 && LA7_0<=52)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalRpp.g:1272:3: this_Regex_0= ruleRegex
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
            	    break loop7;
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
    // InternalRpp.g:1286:1: entryRuleStartStates returns [EObject current=null] : iv_ruleStartStates= ruleStartStates EOF ;
    public final EObject entryRuleStartStates() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStartStates = null;


        try {
            // InternalRpp.g:1286:52: (iv_ruleStartStates= ruleStartStates EOF )
            // InternalRpp.g:1287:2: iv_ruleStartStates= ruleStartStates EOF
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
    // InternalRpp.g:1293:1: ruleStartStates returns [EObject current=null] : (otherlv_0= 'START' ( (lv_incstates_1_0= ruleStartState ) ) (otherlv_2= ',' ( (lv_incstates_3_0= ruleStartState ) ) )* (otherlv_4= '-' ( (lv_exstates_5_0= ruleStartState ) ) (otherlv_6= ',' ( (lv_exstates_7_0= ruleStartState ) ) )* )? ) ;
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
            // InternalRpp.g:1299:2: ( (otherlv_0= 'START' ( (lv_incstates_1_0= ruleStartState ) ) (otherlv_2= ',' ( (lv_incstates_3_0= ruleStartState ) ) )* (otherlv_4= '-' ( (lv_exstates_5_0= ruleStartState ) ) (otherlv_6= ',' ( (lv_exstates_7_0= ruleStartState ) ) )* )? ) )
            // InternalRpp.g:1300:2: (otherlv_0= 'START' ( (lv_incstates_1_0= ruleStartState ) ) (otherlv_2= ',' ( (lv_incstates_3_0= ruleStartState ) ) )* (otherlv_4= '-' ( (lv_exstates_5_0= ruleStartState ) ) (otherlv_6= ',' ( (lv_exstates_7_0= ruleStartState ) ) )* )? )
            {
            // InternalRpp.g:1300:2: (otherlv_0= 'START' ( (lv_incstates_1_0= ruleStartState ) ) (otherlv_2= ',' ( (lv_incstates_3_0= ruleStartState ) ) )* (otherlv_4= '-' ( (lv_exstates_5_0= ruleStartState ) ) (otherlv_6= ',' ( (lv_exstates_7_0= ruleStartState ) ) )* )? )
            // InternalRpp.g:1301:3: otherlv_0= 'START' ( (lv_incstates_1_0= ruleStartState ) ) (otherlv_2= ',' ( (lv_incstates_3_0= ruleStartState ) ) )* (otherlv_4= '-' ( (lv_exstates_5_0= ruleStartState ) ) (otherlv_6= ',' ( (lv_exstates_7_0= ruleStartState ) ) )* )?
            {
            otherlv_0=(Token)match(input,47,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getStartStatesAccess().getSTARTKeyword_0());
              		
            }
            // InternalRpp.g:1305:3: ( (lv_incstates_1_0= ruleStartState ) )
            // InternalRpp.g:1306:4: (lv_incstates_1_0= ruleStartState )
            {
            // InternalRpp.g:1306:4: (lv_incstates_1_0= ruleStartState )
            // InternalRpp.g:1307:5: lv_incstates_1_0= ruleStartState
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
              						"de.roma.cocktail.xtext.Rpp.StartState");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalRpp.g:1324:3: (otherlv_2= ',' ( (lv_incstates_3_0= ruleStartState ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==36) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalRpp.g:1325:4: otherlv_2= ',' ( (lv_incstates_3_0= ruleStartState ) )
            	    {
            	    otherlv_2=(Token)match(input,36,FOLLOW_8); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getStartStatesAccess().getCommaKeyword_2_0());
            	      			
            	    }
            	    // InternalRpp.g:1329:4: ( (lv_incstates_3_0= ruleStartState ) )
            	    // InternalRpp.g:1330:5: (lv_incstates_3_0= ruleStartState )
            	    {
            	    // InternalRpp.g:1330:5: (lv_incstates_3_0= ruleStartState )
            	    // InternalRpp.g:1331:6: lv_incstates_3_0= ruleStartState
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
            	      							"de.roma.cocktail.xtext.Rpp.StartState");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // InternalRpp.g:1349:3: (otherlv_4= '-' ( (lv_exstates_5_0= ruleStartState ) ) (otherlv_6= ',' ( (lv_exstates_7_0= ruleStartState ) ) )* )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==16) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalRpp.g:1350:4: otherlv_4= '-' ( (lv_exstates_5_0= ruleStartState ) ) (otherlv_6= ',' ( (lv_exstates_7_0= ruleStartState ) ) )*
                    {
                    otherlv_4=(Token)match(input,16,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getStartStatesAccess().getHyphenMinusKeyword_3_0());
                      			
                    }
                    // InternalRpp.g:1354:4: ( (lv_exstates_5_0= ruleStartState ) )
                    // InternalRpp.g:1355:5: (lv_exstates_5_0= ruleStartState )
                    {
                    // InternalRpp.g:1355:5: (lv_exstates_5_0= ruleStartState )
                    // InternalRpp.g:1356:6: lv_exstates_5_0= ruleStartState
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
                      							"de.roma.cocktail.xtext.Rpp.StartState");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalRpp.g:1373:4: (otherlv_6= ',' ( (lv_exstates_7_0= ruleStartState ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==36) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalRpp.g:1374:5: otherlv_6= ',' ( (lv_exstates_7_0= ruleStartState ) )
                    	    {
                    	    otherlv_6=(Token)match(input,36,FOLLOW_8); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_6, grammarAccess.getStartStatesAccess().getCommaKeyword_3_2_0());
                    	      				
                    	    }
                    	    // InternalRpp.g:1378:5: ( (lv_exstates_7_0= ruleStartState ) )
                    	    // InternalRpp.g:1379:6: (lv_exstates_7_0= ruleStartState )
                    	    {
                    	    // InternalRpp.g:1379:6: (lv_exstates_7_0= ruleStartState )
                    	    // InternalRpp.g:1380:7: lv_exstates_7_0= ruleStartState
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
                    	      								"de.roma.cocktail.xtext.Rpp.StartState");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
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
    // InternalRpp.g:1403:1: entryRuleStartState returns [EObject current=null] : iv_ruleStartState= ruleStartState EOF ;
    public final EObject entryRuleStartState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStartState = null;


        try {
            // InternalRpp.g:1403:51: (iv_ruleStartState= ruleStartState EOF )
            // InternalRpp.g:1404:2: iv_ruleStartState= ruleStartState EOF
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
    // InternalRpp.g:1410:1: ruleStartState returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleStartState() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalRpp.g:1416:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalRpp.g:1417:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalRpp.g:1417:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalRpp.g:1418:3: (lv_name_0_0= RULE_ID )
            {
            // InternalRpp.g:1418:3: (lv_name_0_0= RULE_ID )
            // InternalRpp.g:1419:4: lv_name_0_0= RULE_ID
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
    // InternalRpp.g:1438:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // InternalRpp.g:1438:45: (iv_ruleRule= ruleRule EOF )
            // InternalRpp.g:1439:2: iv_ruleRule= ruleRule EOF
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
    // InternalRpp.g:1445:1: ruleRule returns [EObject current=null] : ( ( ( (lv_info_0_1= 'RULE' | lv_info_0_2= 'RULES' ) ) ) ( (lv_rules_1_0= ruleSingleRule ) )* ) ;
    public final EObject ruleRule() throws RecognitionException {
        EObject current = null;

        Token lv_info_0_1=null;
        Token lv_info_0_2=null;
        EObject lv_rules_1_0 = null;



        	enterRule();

        try {
            // InternalRpp.g:1451:2: ( ( ( ( (lv_info_0_1= 'RULE' | lv_info_0_2= 'RULES' ) ) ) ( (lv_rules_1_0= ruleSingleRule ) )* ) )
            // InternalRpp.g:1452:2: ( ( ( (lv_info_0_1= 'RULE' | lv_info_0_2= 'RULES' ) ) ) ( (lv_rules_1_0= ruleSingleRule ) )* )
            {
            // InternalRpp.g:1452:2: ( ( ( (lv_info_0_1= 'RULE' | lv_info_0_2= 'RULES' ) ) ) ( (lv_rules_1_0= ruleSingleRule ) )* )
            // InternalRpp.g:1453:3: ( ( (lv_info_0_1= 'RULE' | lv_info_0_2= 'RULES' ) ) ) ( (lv_rules_1_0= ruleSingleRule ) )*
            {
            // InternalRpp.g:1453:3: ( ( (lv_info_0_1= 'RULE' | lv_info_0_2= 'RULES' ) ) )
            // InternalRpp.g:1454:4: ( (lv_info_0_1= 'RULE' | lv_info_0_2= 'RULES' ) )
            {
            // InternalRpp.g:1454:4: ( (lv_info_0_1= 'RULE' | lv_info_0_2= 'RULES' ) )
            // InternalRpp.g:1455:5: (lv_info_0_1= 'RULE' | lv_info_0_2= 'RULES' )
            {
            // InternalRpp.g:1455:5: (lv_info_0_1= 'RULE' | lv_info_0_2= 'RULES' )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==48) ) {
                alt11=1;
            }
            else if ( (LA11_0==49) ) {
                alt11=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalRpp.g:1456:6: lv_info_0_1= 'RULE'
                    {
                    lv_info_0_1=(Token)match(input,48,FOLLOW_17); if (state.failed) return current;
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
                    // InternalRpp.g:1467:6: lv_info_0_2= 'RULES'
                    {
                    lv_info_0_2=(Token)match(input,49,FOLLOW_17); if (state.failed) return current;
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

            // InternalRpp.g:1480:3: ( (lv_rules_1_0= ruleSingleRule ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=RULE_ID && LA12_0<=RULE_WS)||(LA12_0>=11 && LA12_0<=12)||(LA12_0>=15 && LA12_0<=26)||LA12_0==29||LA12_0==33||(LA12_0>=51 && LA12_0<=53)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalRpp.g:1481:4: (lv_rules_1_0= ruleSingleRule )
            	    {
            	    // InternalRpp.g:1481:4: (lv_rules_1_0= ruleSingleRule )
            	    // InternalRpp.g:1482:5: lv_rules_1_0= ruleSingleRule
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
            	      						"de.roma.cocktail.xtext.Rpp.SingleRule");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
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


    // $ANTLR start "entryRuleRuleInsert"
    // InternalRpp.g:1503:1: entryRuleRuleInsert returns [EObject current=null] : iv_ruleRuleInsert= ruleRuleInsert EOF ;
    public final EObject entryRuleRuleInsert() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRuleInsert = null;


        try {
            // InternalRpp.g:1503:51: (iv_ruleRuleInsert= ruleRuleInsert EOF )
            // InternalRpp.g:1504:2: iv_ruleRuleInsert= ruleRuleInsert EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRuleInsertRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRuleInsert=ruleRuleInsert();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRuleInsert; 
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
    // $ANTLR end "entryRuleRuleInsert"


    // $ANTLR start "ruleRuleInsert"
    // InternalRpp.g:1510:1: ruleRuleInsert returns [EObject current=null] : ( ( (lv_info_0_0= 'INSERT' ) ) otherlv_1= 'RULES' ( (lv_case_2_0= 'CASE-INSENSITIVE' ) )? ( (lv_start_3_0= ruleRuleStart ) )? (otherlv_4= '{' ( (lv_content_5_0= ruleCodeBlock ) ) otherlv_6= '}' ) ( (lv_rules_7_0= ruleSingleRule ) )* ) ;
    public final EObject ruleRuleInsert() throws RecognitionException {
        EObject current = null;

        Token lv_info_0_0=null;
        Token otherlv_1=null;
        Token lv_case_2_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_start_3_0 = null;

        EObject lv_content_5_0 = null;

        EObject lv_rules_7_0 = null;



        	enterRule();

        try {
            // InternalRpp.g:1516:2: ( ( ( (lv_info_0_0= 'INSERT' ) ) otherlv_1= 'RULES' ( (lv_case_2_0= 'CASE-INSENSITIVE' ) )? ( (lv_start_3_0= ruleRuleStart ) )? (otherlv_4= '{' ( (lv_content_5_0= ruleCodeBlock ) ) otherlv_6= '}' ) ( (lv_rules_7_0= ruleSingleRule ) )* ) )
            // InternalRpp.g:1517:2: ( ( (lv_info_0_0= 'INSERT' ) ) otherlv_1= 'RULES' ( (lv_case_2_0= 'CASE-INSENSITIVE' ) )? ( (lv_start_3_0= ruleRuleStart ) )? (otherlv_4= '{' ( (lv_content_5_0= ruleCodeBlock ) ) otherlv_6= '}' ) ( (lv_rules_7_0= ruleSingleRule ) )* )
            {
            // InternalRpp.g:1517:2: ( ( (lv_info_0_0= 'INSERT' ) ) otherlv_1= 'RULES' ( (lv_case_2_0= 'CASE-INSENSITIVE' ) )? ( (lv_start_3_0= ruleRuleStart ) )? (otherlv_4= '{' ( (lv_content_5_0= ruleCodeBlock ) ) otherlv_6= '}' ) ( (lv_rules_7_0= ruleSingleRule ) )* )
            // InternalRpp.g:1518:3: ( (lv_info_0_0= 'INSERT' ) ) otherlv_1= 'RULES' ( (lv_case_2_0= 'CASE-INSENSITIVE' ) )? ( (lv_start_3_0= ruleRuleStart ) )? (otherlv_4= '{' ( (lv_content_5_0= ruleCodeBlock ) ) otherlv_6= '}' ) ( (lv_rules_7_0= ruleSingleRule ) )*
            {
            // InternalRpp.g:1518:3: ( (lv_info_0_0= 'INSERT' ) )
            // InternalRpp.g:1519:4: (lv_info_0_0= 'INSERT' )
            {
            // InternalRpp.g:1519:4: (lv_info_0_0= 'INSERT' )
            // InternalRpp.g:1520:5: lv_info_0_0= 'INSERT'
            {
            lv_info_0_0=(Token)match(input,13,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_info_0_0, grammarAccess.getRuleInsertAccess().getInfoINSERTKeyword_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getRuleInsertRule());
              					}
              					setWithLastConsumed(current, "info", lv_info_0_0, "INSERT");
              				
            }

            }


            }

            otherlv_1=(Token)match(input,49,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getRuleInsertAccess().getRULESKeyword_1());
              		
            }
            // InternalRpp.g:1536:3: ( (lv_case_2_0= 'CASE-INSENSITIVE' ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==50) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalRpp.g:1537:4: (lv_case_2_0= 'CASE-INSENSITIVE' )
                    {
                    // InternalRpp.g:1537:4: (lv_case_2_0= 'CASE-INSENSITIVE' )
                    // InternalRpp.g:1538:5: lv_case_2_0= 'CASE-INSENSITIVE'
                    {
                    lv_case_2_0=(Token)match(input,50,FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_case_2_0, grammarAccess.getRuleInsertAccess().getCaseCASEINSENSITIVEKeyword_2_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getRuleInsertRule());
                      					}
                      					setWithLastConsumed(current, "case", lv_case_2_0, "CASE-INSENSITIVE");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalRpp.g:1550:3: ( (lv_start_3_0= ruleRuleStart ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==16||LA14_0==29||LA14_0==53) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalRpp.g:1551:4: (lv_start_3_0= ruleRuleStart )
                    {
                    // InternalRpp.g:1551:4: (lv_start_3_0= ruleRuleStart )
                    // InternalRpp.g:1552:5: lv_start_3_0= ruleRuleStart
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getRuleInsertAccess().getStartRuleStartParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FOLLOW_9);
                    lv_start_3_0=ruleRuleStart();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getRuleInsertRule());
                      					}
                      					set(
                      						current,
                      						"start",
                      						lv_start_3_0,
                      						"de.roma.cocktail.xtext.Rpp.RuleStart");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalRpp.g:1569:3: (otherlv_4= '{' ( (lv_content_5_0= ruleCodeBlock ) ) otherlv_6= '}' )
            // InternalRpp.g:1570:4: otherlv_4= '{' ( (lv_content_5_0= ruleCodeBlock ) ) otherlv_6= '}'
            {
            otherlv_4=(Token)match(input,11,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_4, grammarAccess.getRuleInsertAccess().getLeftCurlyBracketKeyword_4_0());
              			
            }
            // InternalRpp.g:1574:4: ( (lv_content_5_0= ruleCodeBlock ) )
            // InternalRpp.g:1575:5: (lv_content_5_0= ruleCodeBlock )
            {
            // InternalRpp.g:1575:5: (lv_content_5_0= ruleCodeBlock )
            // InternalRpp.g:1576:6: lv_content_5_0= ruleCodeBlock
            {
            if ( state.backtracking==0 ) {

              						newCompositeNode(grammarAccess.getRuleInsertAccess().getContentCodeBlockParserRuleCall_4_1_0());
              					
            }
            pushFollow(FOLLOW_7);
            lv_content_5_0=ruleCodeBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              						if (current==null) {
              							current = createModelElementForParent(grammarAccess.getRuleInsertRule());
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

            otherlv_6=(Token)match(input,12,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_6, grammarAccess.getRuleInsertAccess().getRightCurlyBracketKeyword_4_2());
              			
            }

            }

            // InternalRpp.g:1598:3: ( (lv_rules_7_0= ruleSingleRule ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=RULE_ID && LA15_0<=RULE_WS)||(LA15_0>=11 && LA15_0<=12)||(LA15_0>=15 && LA15_0<=26)||LA15_0==29||LA15_0==33||(LA15_0>=51 && LA15_0<=53)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalRpp.g:1599:4: (lv_rules_7_0= ruleSingleRule )
            	    {
            	    // InternalRpp.g:1599:4: (lv_rules_7_0= ruleSingleRule )
            	    // InternalRpp.g:1600:5: lv_rules_7_0= ruleSingleRule
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getRuleInsertAccess().getRulesSingleRuleParserRuleCall_5_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_17);
            	    lv_rules_7_0=ruleSingleRule();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getRuleInsertRule());
            	      					}
            	      					add(
            	      						current,
            	      						"rules",
            	      						lv_rules_7_0,
            	      						"de.roma.cocktail.xtext.Rpp.SingleRule");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // $ANTLR end "ruleRuleInsert"


    // $ANTLR start "entryRuleSingleRule"
    // InternalRpp.g:1621:1: entryRuleSingleRule returns [EObject current=null] : iv_ruleSingleRule= ruleSingleRule EOF ;
    public final EObject entryRuleSingleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleRule = null;


        try {
            // InternalRpp.g:1621:51: (iv_ruleSingleRule= ruleSingleRule EOF )
            // InternalRpp.g:1622:2: iv_ruleSingleRule= ruleSingleRule EOF
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
    // InternalRpp.g:1628:1: ruleSingleRule returns [EObject current=null] : ( ( (lv_start_0_0= ruleRuleStart ) )? ( (lv_rule_1_0= ruleRuleDefinition ) ) otherlv_2= ':' (otherlv_3= '-' )? otherlv_4= '{' ( (lv_content_5_0= ruleCodeBlock ) ) otherlv_6= '}' ) ;
    public final EObject ruleSingleRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_start_0_0 = null;

        EObject lv_rule_1_0 = null;

        EObject lv_content_5_0 = null;



        	enterRule();

        try {
            // InternalRpp.g:1634:2: ( ( ( (lv_start_0_0= ruleRuleStart ) )? ( (lv_rule_1_0= ruleRuleDefinition ) ) otherlv_2= ':' (otherlv_3= '-' )? otherlv_4= '{' ( (lv_content_5_0= ruleCodeBlock ) ) otherlv_6= '}' ) )
            // InternalRpp.g:1635:2: ( ( (lv_start_0_0= ruleRuleStart ) )? ( (lv_rule_1_0= ruleRuleDefinition ) ) otherlv_2= ':' (otherlv_3= '-' )? otherlv_4= '{' ( (lv_content_5_0= ruleCodeBlock ) ) otherlv_6= '}' )
            {
            // InternalRpp.g:1635:2: ( ( (lv_start_0_0= ruleRuleStart ) )? ( (lv_rule_1_0= ruleRuleDefinition ) ) otherlv_2= ':' (otherlv_3= '-' )? otherlv_4= '{' ( (lv_content_5_0= ruleCodeBlock ) ) otherlv_6= '}' )
            // InternalRpp.g:1636:3: ( (lv_start_0_0= ruleRuleStart ) )? ( (lv_rule_1_0= ruleRuleDefinition ) ) otherlv_2= ':' (otherlv_3= '-' )? otherlv_4= '{' ( (lv_content_5_0= ruleCodeBlock ) ) otherlv_6= '}'
            {
            // InternalRpp.g:1636:3: ( (lv_start_0_0= ruleRuleStart ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==29||LA16_0==53) ) {
                alt16=1;
            }
            else if ( (LA16_0==16) ) {
                int LA16_2 = input.LA(2);

                if ( (LA16_2==29) ) {
                    alt16=1;
                }
            }
            switch (alt16) {
                case 1 :
                    // InternalRpp.g:1637:4: (lv_start_0_0= ruleRuleStart )
                    {
                    // InternalRpp.g:1637:4: (lv_start_0_0= ruleRuleStart )
                    // InternalRpp.g:1638:5: lv_start_0_0= ruleRuleStart
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getSingleRuleAccess().getStartRuleStartParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_21);
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

            // InternalRpp.g:1655:3: ( (lv_rule_1_0= ruleRuleDefinition ) )
            // InternalRpp.g:1656:4: (lv_rule_1_0= ruleRuleDefinition )
            {
            // InternalRpp.g:1656:4: (lv_rule_1_0= ruleRuleDefinition )
            // InternalRpp.g:1657:5: lv_rule_1_0= ruleRuleDefinition
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSingleRuleAccess().getRuleRuleDefinitionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_22);
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

            otherlv_2=(Token)match(input,33,FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getSingleRuleAccess().getColonKeyword_2());
              		
            }
            // InternalRpp.g:1678:3: (otherlv_3= '-' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==16) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalRpp.g:1679:4: otherlv_3= '-'
                    {
                    otherlv_3=(Token)match(input,16,FOLLOW_9); if (state.failed) return current;
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
            // InternalRpp.g:1688:3: ( (lv_content_5_0= ruleCodeBlock ) )
            // InternalRpp.g:1689:4: (lv_content_5_0= ruleCodeBlock )
            {
            // InternalRpp.g:1689:4: (lv_content_5_0= ruleCodeBlock )
            // InternalRpp.g:1690:5: lv_content_5_0= ruleCodeBlock
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
    // InternalRpp.g:1715:1: entryRuleRegex returns [String current=null] : iv_ruleRegex= ruleRegex EOF ;
    public final String entryRuleRegex() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRegex = null;


        try {
            // InternalRpp.g:1715:45: (iv_ruleRegex= ruleRegex EOF )
            // InternalRpp.g:1716:2: iv_ruleRegex= ruleRegex EOF
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
    // InternalRpp.g:1722:1: ruleRegex returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_INT_1= RULE_INT | this_STRING_2= RULE_STRING | this_WS_3= RULE_WS | kw= '+' | kw= '-' | kw= '(' | kw= ')' | kw= '*' | kw= '.' | kw= '/' | kw= '\\\\' | kw= '|' | kw= '?' | kw= '>' | kw= '<' | kw= '{' | kw= '}' | kw= '\"' | kw= '\\'' ) ;
    public final AntlrDatatypeRuleToken ruleRegex() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_INT_1=null;
        Token this_STRING_2=null;
        Token this_WS_3=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalRpp.g:1728:2: ( (this_ID_0= RULE_ID | this_INT_1= RULE_INT | this_STRING_2= RULE_STRING | this_WS_3= RULE_WS | kw= '+' | kw= '-' | kw= '(' | kw= ')' | kw= '*' | kw= '.' | kw= '/' | kw= '\\\\' | kw= '|' | kw= '?' | kw= '>' | kw= '<' | kw= '{' | kw= '}' | kw= '\"' | kw= '\\'' ) )
            // InternalRpp.g:1729:2: (this_ID_0= RULE_ID | this_INT_1= RULE_INT | this_STRING_2= RULE_STRING | this_WS_3= RULE_WS | kw= '+' | kw= '-' | kw= '(' | kw= ')' | kw= '*' | kw= '.' | kw= '/' | kw= '\\\\' | kw= '|' | kw= '?' | kw= '>' | kw= '<' | kw= '{' | kw= '}' | kw= '\"' | kw= '\\'' )
            {
            // InternalRpp.g:1729:2: (this_ID_0= RULE_ID | this_INT_1= RULE_INT | this_STRING_2= RULE_STRING | this_WS_3= RULE_WS | kw= '+' | kw= '-' | kw= '(' | kw= ')' | kw= '*' | kw= '.' | kw= '/' | kw= '\\\\' | kw= '|' | kw= '?' | kw= '>' | kw= '<' | kw= '{' | kw= '}' | kw= '\"' | kw= '\\'' )
            int alt18=20;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt18=1;
                }
                break;
            case RULE_INT:
                {
                alt18=2;
                }
                break;
            case RULE_STRING:
                {
                alt18=3;
                }
                break;
            case RULE_WS:
                {
                alt18=4;
                }
                break;
            case 15:
                {
                alt18=5;
                }
                break;
            case 16:
                {
                alt18=6;
                }
                break;
            case 17:
                {
                alt18=7;
                }
                break;
            case 18:
                {
                alt18=8;
                }
                break;
            case 19:
                {
                alt18=9;
                }
                break;
            case 20:
                {
                alt18=10;
                }
                break;
            case 21:
                {
                alt18=11;
                }
                break;
            case 22:
                {
                alt18=12;
                }
                break;
            case 23:
                {
                alt18=13;
                }
                break;
            case 24:
                {
                alt18=14;
                }
                break;
            case 25:
                {
                alt18=15;
                }
                break;
            case 26:
                {
                alt18=16;
                }
                break;
            case 11:
                {
                alt18=17;
                }
                break;
            case 12:
                {
                alt18=18;
                }
                break;
            case 51:
                {
                alt18=19;
                }
                break;
            case 52:
                {
                alt18=20;
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
                    // InternalRpp.g:1730:3: this_ID_0= RULE_ID
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
                    // InternalRpp.g:1738:3: this_INT_1= RULE_INT
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
                    // InternalRpp.g:1746:3: this_STRING_2= RULE_STRING
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
                    // InternalRpp.g:1754:3: this_WS_3= RULE_WS
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
                    // InternalRpp.g:1762:3: kw= '+'
                    {
                    kw=(Token)match(input,15,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getRegexAccess().getPlusSignKeyword_4());
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalRpp.g:1768:3: kw= '-'
                    {
                    kw=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getRegexAccess().getHyphenMinusKeyword_5());
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalRpp.g:1774:3: kw= '('
                    {
                    kw=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getRegexAccess().getLeftParenthesisKeyword_6());
                      		
                    }

                    }
                    break;
                case 8 :
                    // InternalRpp.g:1780:3: kw= ')'
                    {
                    kw=(Token)match(input,18,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getRegexAccess().getRightParenthesisKeyword_7());
                      		
                    }

                    }
                    break;
                case 9 :
                    // InternalRpp.g:1786:3: kw= '*'
                    {
                    kw=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getRegexAccess().getAsteriskKeyword_8());
                      		
                    }

                    }
                    break;
                case 10 :
                    // InternalRpp.g:1792:3: kw= '.'
                    {
                    kw=(Token)match(input,20,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getRegexAccess().getFullStopKeyword_9());
                      		
                    }

                    }
                    break;
                case 11 :
                    // InternalRpp.g:1798:3: kw= '/'
                    {
                    kw=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getRegexAccess().getSolidusKeyword_10());
                      		
                    }

                    }
                    break;
                case 12 :
                    // InternalRpp.g:1804:3: kw= '\\\\'
                    {
                    kw=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getRegexAccess().getReverseSolidusKeyword_11());
                      		
                    }

                    }
                    break;
                case 13 :
                    // InternalRpp.g:1810:3: kw= '|'
                    {
                    kw=(Token)match(input,23,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getRegexAccess().getVerticalLineKeyword_12());
                      		
                    }

                    }
                    break;
                case 14 :
                    // InternalRpp.g:1816:3: kw= '?'
                    {
                    kw=(Token)match(input,24,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getRegexAccess().getQuestionMarkKeyword_13());
                      		
                    }

                    }
                    break;
                case 15 :
                    // InternalRpp.g:1822:3: kw= '>'
                    {
                    kw=(Token)match(input,25,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getRegexAccess().getGreaterThanSignKeyword_14());
                      		
                    }

                    }
                    break;
                case 16 :
                    // InternalRpp.g:1828:3: kw= '<'
                    {
                    kw=(Token)match(input,26,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getRegexAccess().getLessThanSignKeyword_15());
                      		
                    }

                    }
                    break;
                case 17 :
                    // InternalRpp.g:1834:3: kw= '{'
                    {
                    kw=(Token)match(input,11,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getRegexAccess().getLeftCurlyBracketKeyword_16());
                      		
                    }

                    }
                    break;
                case 18 :
                    // InternalRpp.g:1840:3: kw= '}'
                    {
                    kw=(Token)match(input,12,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getRegexAccess().getRightCurlyBracketKeyword_17());
                      		
                    }

                    }
                    break;
                case 19 :
                    // InternalRpp.g:1846:3: kw= '\"'
                    {
                    kw=(Token)match(input,51,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getRegexAccess().getQuotationMarkKeyword_18());
                      		
                    }

                    }
                    break;
                case 20 :
                    // InternalRpp.g:1852:3: kw= '\\''
                    {
                    kw=(Token)match(input,52,FOLLOW_2); if (state.failed) return current;
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
    // InternalRpp.g:1861:1: entryRuleRuleDefinition returns [EObject current=null] : iv_ruleRuleDefinition= ruleRuleDefinition EOF ;
    public final EObject entryRuleRuleDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRuleDefinition = null;


        try {
            // InternalRpp.g:1861:55: (iv_ruleRuleDefinition= ruleRuleDefinition EOF )
            // InternalRpp.g:1862:2: iv_ruleRuleDefinition= ruleRuleDefinition EOF
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
    // InternalRpp.g:1868:1: ruleRuleDefinition returns [EObject current=null] : ( (lv_parts_0_0= ruleRulePart ) )* ;
    public final EObject ruleRuleDefinition() throws RecognitionException {
        EObject current = null;

        EObject lv_parts_0_0 = null;



        	enterRule();

        try {
            // InternalRpp.g:1874:2: ( ( (lv_parts_0_0= ruleRulePart ) )* )
            // InternalRpp.g:1875:2: ( (lv_parts_0_0= ruleRulePart ) )*
            {
            // InternalRpp.g:1875:2: ( (lv_parts_0_0= ruleRulePart ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=RULE_ID && LA19_0<=RULE_WS)||(LA19_0>=11 && LA19_0<=12)||(LA19_0>=15 && LA19_0<=26)||(LA19_0>=51 && LA19_0<=52)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalRpp.g:1876:3: (lv_parts_0_0= ruleRulePart )
            	    {
            	    // InternalRpp.g:1876:3: (lv_parts_0_0= ruleRulePart )
            	    // InternalRpp.g:1877:4: lv_parts_0_0= ruleRulePart
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
            	      					"de.roma.cocktail.xtext.Rpp.RulePart");
            	      				afterParserOrEnumRuleCall();
            	      			
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // InternalRpp.g:1897:1: entryRuleRulePart returns [EObject current=null] : iv_ruleRulePart= ruleRulePart EOF ;
    public final EObject entryRuleRulePart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRulePart = null;


        try {
            // InternalRpp.g:1897:49: (iv_ruleRulePart= ruleRulePart EOF )
            // InternalRpp.g:1898:2: iv_ruleRulePart= ruleRulePart EOF
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
    // InternalRpp.g:1904:1: ruleRulePart returns [EObject current=null] : ( ( (lv_reg_0_0= ruleRegex ) ) | ( ( RULE_ID )=> (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleRulePart() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_reg_0_0 = null;



        	enterRule();

        try {
            // InternalRpp.g:1910:2: ( ( ( (lv_reg_0_0= ruleRegex ) ) | ( ( RULE_ID )=> (otherlv_1= RULE_ID ) ) ) )
            // InternalRpp.g:1911:2: ( ( (lv_reg_0_0= ruleRegex ) ) | ( ( RULE_ID )=> (otherlv_1= RULE_ID ) ) )
            {
            // InternalRpp.g:1911:2: ( ( (lv_reg_0_0= ruleRegex ) ) | ( ( RULE_ID )=> (otherlv_1= RULE_ID ) ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_ID) ) {
                int LA20_1 = input.LA(2);

                if ( (true) ) {
                    alt20=1;
                }
                else if ( (synpred2_InternalRpp()) ) {
                    alt20=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA20_0>=RULE_INT && LA20_0<=RULE_WS)||(LA20_0>=11 && LA20_0<=12)||(LA20_0>=15 && LA20_0<=26)||(LA20_0>=51 && LA20_0<=52)) ) {
                alt20=1;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalRpp.g:1912:3: ( (lv_reg_0_0= ruleRegex ) )
                    {
                    // InternalRpp.g:1912:3: ( (lv_reg_0_0= ruleRegex ) )
                    // InternalRpp.g:1913:4: (lv_reg_0_0= ruleRegex )
                    {
                    // InternalRpp.g:1913:4: (lv_reg_0_0= ruleRegex )
                    // InternalRpp.g:1914:5: lv_reg_0_0= ruleRegex
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
                    // InternalRpp.g:1932:3: ( ( RULE_ID )=> (otherlv_1= RULE_ID ) )
                    {
                    // InternalRpp.g:1932:3: ( ( RULE_ID )=> (otherlv_1= RULE_ID ) )
                    // InternalRpp.g:1933:4: ( RULE_ID )=> (otherlv_1= RULE_ID )
                    {
                    // InternalRpp.g:1934:4: (otherlv_1= RULE_ID )
                    // InternalRpp.g:1935:5: otherlv_1= RULE_ID
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
    // InternalRpp.g:1950:1: entryRuleRuleStart returns [EObject current=null] : iv_ruleRuleStart= ruleRuleStart EOF ;
    public final EObject entryRuleRuleStart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRuleStart = null;


        try {
            // InternalRpp.g:1950:50: (iv_ruleRuleStart= ruleRuleStart EOF )
            // InternalRpp.g:1951:2: iv_ruleRuleStart= ruleRuleStart EOF
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
    // InternalRpp.g:1957:1: ruleRuleStart returns [EObject current=null] : ( ( ( (lv_rulePrec_0_0= 'NOT' ) ) | ( (lv_rulePrec_1_0= '-' ) ) )? otherlv_2= '#' ( ( (otherlv_3= RULE_ID ) ) | ( (lv_ruleDefault_4_0= 'STD' ) ) | ( (lv_ruleDefault_5_0= '*' ) ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= '#' ) ;
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
            // InternalRpp.g:1963:2: ( ( ( ( (lv_rulePrec_0_0= 'NOT' ) ) | ( (lv_rulePrec_1_0= '-' ) ) )? otherlv_2= '#' ( ( (otherlv_3= RULE_ID ) ) | ( (lv_ruleDefault_4_0= 'STD' ) ) | ( (lv_ruleDefault_5_0= '*' ) ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= '#' ) )
            // InternalRpp.g:1964:2: ( ( ( (lv_rulePrec_0_0= 'NOT' ) ) | ( (lv_rulePrec_1_0= '-' ) ) )? otherlv_2= '#' ( ( (otherlv_3= RULE_ID ) ) | ( (lv_ruleDefault_4_0= 'STD' ) ) | ( (lv_ruleDefault_5_0= '*' ) ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= '#' )
            {
            // InternalRpp.g:1964:2: ( ( ( (lv_rulePrec_0_0= 'NOT' ) ) | ( (lv_rulePrec_1_0= '-' ) ) )? otherlv_2= '#' ( ( (otherlv_3= RULE_ID ) ) | ( (lv_ruleDefault_4_0= 'STD' ) ) | ( (lv_ruleDefault_5_0= '*' ) ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= '#' )
            // InternalRpp.g:1965:3: ( ( (lv_rulePrec_0_0= 'NOT' ) ) | ( (lv_rulePrec_1_0= '-' ) ) )? otherlv_2= '#' ( ( (otherlv_3= RULE_ID ) ) | ( (lv_ruleDefault_4_0= 'STD' ) ) | ( (lv_ruleDefault_5_0= '*' ) ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= '#'
            {
            // InternalRpp.g:1965:3: ( ( (lv_rulePrec_0_0= 'NOT' ) ) | ( (lv_rulePrec_1_0= '-' ) ) )?
            int alt21=3;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==53) ) {
                alt21=1;
            }
            else if ( (LA21_0==16) ) {
                alt21=2;
            }
            switch (alt21) {
                case 1 :
                    // InternalRpp.g:1966:4: ( (lv_rulePrec_0_0= 'NOT' ) )
                    {
                    // InternalRpp.g:1966:4: ( (lv_rulePrec_0_0= 'NOT' ) )
                    // InternalRpp.g:1967:5: (lv_rulePrec_0_0= 'NOT' )
                    {
                    // InternalRpp.g:1967:5: (lv_rulePrec_0_0= 'NOT' )
                    // InternalRpp.g:1968:6: lv_rulePrec_0_0= 'NOT'
                    {
                    lv_rulePrec_0_0=(Token)match(input,53,FOLLOW_24); if (state.failed) return current;
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
                    // InternalRpp.g:1981:4: ( (lv_rulePrec_1_0= '-' ) )
                    {
                    // InternalRpp.g:1981:4: ( (lv_rulePrec_1_0= '-' ) )
                    // InternalRpp.g:1982:5: (lv_rulePrec_1_0= '-' )
                    {
                    // InternalRpp.g:1982:5: (lv_rulePrec_1_0= '-' )
                    // InternalRpp.g:1983:6: lv_rulePrec_1_0= '-'
                    {
                    lv_rulePrec_1_0=(Token)match(input,16,FOLLOW_24); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,29,FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getRuleStartAccess().getNumberSignKeyword_1());
              		
            }
            // InternalRpp.g:2000:3: ( ( (otherlv_3= RULE_ID ) ) | ( (lv_ruleDefault_4_0= 'STD' ) ) | ( (lv_ruleDefault_5_0= '*' ) ) )
            int alt22=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt22=1;
                }
                break;
            case 14:
                {
                alt22=2;
                }
                break;
            case 19:
                {
                alt22=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // InternalRpp.g:2001:4: ( (otherlv_3= RULE_ID ) )
                    {
                    // InternalRpp.g:2001:4: ( (otherlv_3= RULE_ID ) )
                    // InternalRpp.g:2002:5: (otherlv_3= RULE_ID )
                    {
                    // InternalRpp.g:2002:5: (otherlv_3= RULE_ID )
                    // InternalRpp.g:2003:6: otherlv_3= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getRuleStartRule());
                      						}
                      					
                    }
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_26); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_3, grammarAccess.getRuleStartAccess().getRuleStatesStartStateCrossReference_2_0_0());
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalRpp.g:2015:4: ( (lv_ruleDefault_4_0= 'STD' ) )
                    {
                    // InternalRpp.g:2015:4: ( (lv_ruleDefault_4_0= 'STD' ) )
                    // InternalRpp.g:2016:5: (lv_ruleDefault_4_0= 'STD' )
                    {
                    // InternalRpp.g:2016:5: (lv_ruleDefault_4_0= 'STD' )
                    // InternalRpp.g:2017:6: lv_ruleDefault_4_0= 'STD'
                    {
                    lv_ruleDefault_4_0=(Token)match(input,14,FOLLOW_26); if (state.failed) return current;
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
                    // InternalRpp.g:2030:4: ( (lv_ruleDefault_5_0= '*' ) )
                    {
                    // InternalRpp.g:2030:4: ( (lv_ruleDefault_5_0= '*' ) )
                    // InternalRpp.g:2031:5: (lv_ruleDefault_5_0= '*' )
                    {
                    // InternalRpp.g:2031:5: (lv_ruleDefault_5_0= '*' )
                    // InternalRpp.g:2032:6: lv_ruleDefault_5_0= '*'
                    {
                    lv_ruleDefault_5_0=(Token)match(input,19,FOLLOW_26); if (state.failed) return current;
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

            // InternalRpp.g:2045:3: (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==36) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalRpp.g:2046:4: otherlv_6= ',' ( (otherlv_7= RULE_ID ) )
            	    {
            	    otherlv_6=(Token)match(input,36,FOLLOW_8); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_6, grammarAccess.getRuleStartAccess().getCommaKeyword_3_0());
            	      			
            	    }
            	    // InternalRpp.g:2050:4: ( (otherlv_7= RULE_ID ) )
            	    // InternalRpp.g:2051:5: (otherlv_7= RULE_ID )
            	    {
            	    // InternalRpp.g:2051:5: (otherlv_7= RULE_ID )
            	    // InternalRpp.g:2052:6: otherlv_7= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getRuleStartRule());
            	      						}
            	      					
            	    }
            	    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_26); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(otherlv_7, grammarAccess.getRuleStartAccess().getRuleStatesStartStateCrossReference_3_1_0());
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            otherlv_8=(Token)match(input,29,FOLLOW_2); if (state.failed) return current;
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
        // InternalRpp.g:527:4: ( 'INSERT' | 'STD' )
        // InternalRpp.g:
        {
        if ( (input.LA(1)>=13 && input.LA(1)<=14) ) {
            input.consume();
            state.errorRecovery=false;state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }


        }
    }
    // $ANTLR end synpred1_InternalRpp

    // $ANTLR start synpred2_InternalRpp
    public final void synpred2_InternalRpp_fragment() throws RecognitionException {   
        // InternalRpp.g:1933:4: ( RULE_ID )
        // InternalRpp.g:1933:5: RULE_ID
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
    protected DFA5 dfa5 = new DFA5(this);
    static final String dfa_1s = "\15\uffff";
    static final String dfa_2s = "\1\45\14\uffff";
    static final String dfa_3s = "\1\61\14\uffff";
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
                        if ( ((LA1_0>=48 && LA1_0<=49)) ) {s = 1;}

                        else if ( LA1_0 == 37 && getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_0(), 0) ) {s = 2;}

                        else if ( LA1_0 == 38 && getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_0(), 1) ) {s = 3;}

                        else if ( LA1_0 == 39 && getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_0(), 2) ) {s = 4;}

                        else if ( LA1_0 == 40 && getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_0(), 3) ) {s = 5;}

                        else if ( LA1_0 == 41 && getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_0(), 4) ) {s = 6;}

                        else if ( LA1_0 == 42 && getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_0(), 5) ) {s = 7;}

                        else if ( LA1_0 == 43 && getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_0(), 6) ) {s = 8;}

                        else if ( LA1_0 == 44 && getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_0(), 7) ) {s = 9;}

                        else if ( LA1_0 == 45 && getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_0(), 8) ) {s = 10;}

                        else if ( LA1_0 == 46 && getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_0(), 9) ) {s = 11;}

                        else if ( LA1_0 == 47 && getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_0(), 10) ) {s = 12;}

                         
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
    static final String dfa_7s = "\35\uffff";
    static final String dfa_8s = "\1\4\34\uffff";
    static final String dfa_9s = "\1\44\34\uffff";
    static final String dfa_10s = "\1\uffff\2\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33";
    static final String dfa_11s = "\1\0\34\uffff}>";
    static final String[] dfa_12s = {
            "\1\3\1\4\1\5\1\6\5\uffff\1\1\1\2\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34",
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
            "",
            ""
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[][] dfa_12 = unpackEncodedStringArray(dfa_12s);

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "525:2: ( ( ( 'INSERT' | 'STD' )=> (kw= 'INSERT' | kw= 'STD' ) ) | this_ID_2= RULE_ID | this_INT_3= RULE_INT | this_STRING_4= RULE_STRING | this_WS_5= RULE_WS | kw= '+' | kw= '-' | kw= '(' | kw= ')' | kw= '*' | kw= '.' | kw= '/' | kw= '\\\\' | kw= '|' | kw= '?' | kw= '>' | kw= '<' | kw= '[' | kw= ']' | kw= '#' | kw= '$' | kw= '%' | kw= ';' | kw= ':' | kw= '!' | kw= '=' | kw= ',' )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA5_0 = input.LA(1);

                         
                        int index5_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA5_0==13) && (synpred1_InternalRpp())) {s = 1;}

                        else if ( (LA5_0==14) && (synpred1_InternalRpp())) {s = 2;}

                        else if ( (LA5_0==RULE_ID) ) {s = 3;}

                        else if ( (LA5_0==RULE_INT) ) {s = 4;}

                        else if ( (LA5_0==RULE_STRING) ) {s = 5;}

                        else if ( (LA5_0==RULE_WS) ) {s = 6;}

                        else if ( (LA5_0==15) ) {s = 7;}

                        else if ( (LA5_0==16) ) {s = 8;}

                        else if ( (LA5_0==17) ) {s = 9;}

                        else if ( (LA5_0==18) ) {s = 10;}

                        else if ( (LA5_0==19) ) {s = 11;}

                        else if ( (LA5_0==20) ) {s = 12;}

                        else if ( (LA5_0==21) ) {s = 13;}

                        else if ( (LA5_0==22) ) {s = 14;}

                        else if ( (LA5_0==23) ) {s = 15;}

                        else if ( (LA5_0==24) ) {s = 16;}

                        else if ( (LA5_0==25) ) {s = 17;}

                        else if ( (LA5_0==26) ) {s = 18;}

                        else if ( (LA5_0==27) ) {s = 19;}

                        else if ( (LA5_0==28) ) {s = 20;}

                        else if ( (LA5_0==29) ) {s = 21;}

                        else if ( (LA5_0==30) ) {s = 22;}

                        else if ( (LA5_0==31) ) {s = 23;}

                        else if ( (LA5_0==32) ) {s = 24;}

                        else if ( (LA5_0==33) ) {s = 25;}

                        else if ( (LA5_0==34) ) {s = 26;}

                        else if ( (LA5_0==35) ) {s = 27;}

                        else if ( (LA5_0==36) ) {s = 28;}

                         
                        input.seek(index5_0);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 5, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0003FFE000000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000001FFFFFE8F2L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000001FFFFFF8F0L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0018000007FF98F0L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0018000007FF98F2L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000001000010002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0038000227FF98F2L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0024000020010800L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0020000020010800L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0018000207FF98F0L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000010800L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000084010L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000001020000000L});

}
