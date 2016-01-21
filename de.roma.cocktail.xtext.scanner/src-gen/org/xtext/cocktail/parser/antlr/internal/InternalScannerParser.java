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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_ANY_OTHER", "'{'", "'}'", "'+'", "'-'", "'('", "')'", "'*'", "'.'", "'/'", "'\\\\'", "'|'", "'?'", "'>'", "'<'", "'#'", "'$'", "'%'", "';'", "':'", "'!'", "'='", "','", "'SCANNER'", "'EXPORT'", "'GLOBAL'", "'LOCAL'", "'DEFAULT'", "'EOF'", "'DEFINE'", "'START'", "'RULE'", "'RULES'", "'\"'", "'\\''", "'NOT'", "'STD'"
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
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
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
    // InternalScanner.g:71:1: ruleModel returns [EObject current=null] : ( ( (lv_scanner_0_0= ruleScanner ) ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_scanner_2_0= ruleExport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_scanner_3_0= ruleGlobal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_scanner_4_0= ruleLocal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_scanner_5_0= ruleDefault ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_scanner_6_0= ruleEof ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_scanner_7_0= ruleDefine ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_scanner_8_0= ruleStartStates ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_scanner_9_0= ruleRule ) ) ) ) ) )+ {...}?) ) ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_scanner_0_0 = null;

        EObject lv_scanner_2_0 = null;

        EObject lv_scanner_3_0 = null;

        EObject lv_scanner_4_0 = null;

        EObject lv_scanner_5_0 = null;

        EObject lv_scanner_6_0 = null;

        EObject lv_scanner_7_0 = null;

        EObject lv_scanner_8_0 = null;

        EObject lv_scanner_9_0 = null;



        	enterRule();

        try {
            // InternalScanner.g:77:2: ( ( ( (lv_scanner_0_0= ruleScanner ) ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_scanner_2_0= ruleExport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_scanner_3_0= ruleGlobal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_scanner_4_0= ruleLocal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_scanner_5_0= ruleDefault ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_scanner_6_0= ruleEof ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_scanner_7_0= ruleDefine ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_scanner_8_0= ruleStartStates ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_scanner_9_0= ruleRule ) ) ) ) ) )+ {...}?) ) ) ) )
            // InternalScanner.g:78:2: ( ( (lv_scanner_0_0= ruleScanner ) ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_scanner_2_0= ruleExport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_scanner_3_0= ruleGlobal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_scanner_4_0= ruleLocal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_scanner_5_0= ruleDefault ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_scanner_6_0= ruleEof ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_scanner_7_0= ruleDefine ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_scanner_8_0= ruleStartStates ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_scanner_9_0= ruleRule ) ) ) ) ) )+ {...}?) ) ) )
            {
            // InternalScanner.g:78:2: ( ( (lv_scanner_0_0= ruleScanner ) ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_scanner_2_0= ruleExport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_scanner_3_0= ruleGlobal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_scanner_4_0= ruleLocal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_scanner_5_0= ruleDefault ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_scanner_6_0= ruleEof ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_scanner_7_0= ruleDefine ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_scanner_8_0= ruleStartStates ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_scanner_9_0= ruleRule ) ) ) ) ) )+ {...}?) ) ) )
            // InternalScanner.g:79:3: ( (lv_scanner_0_0= ruleScanner ) ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_scanner_2_0= ruleExport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_scanner_3_0= ruleGlobal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_scanner_4_0= ruleLocal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_scanner_5_0= ruleDefault ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_scanner_6_0= ruleEof ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_scanner_7_0= ruleDefine ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_scanner_8_0= ruleStartStates ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_scanner_9_0= ruleRule ) ) ) ) ) )+ {...}?) ) )
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
              					add(
              						current,
              						"scanner",
              						lv_scanner_0_0,
              						"org.xtext.cocktail.Scanner.Scanner");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalScanner.g:98:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_scanner_2_0= ruleExport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_scanner_3_0= ruleGlobal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_scanner_4_0= ruleLocal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_scanner_5_0= ruleDefault ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_scanner_6_0= ruleEof ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_scanner_7_0= ruleDefine ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_scanner_8_0= ruleStartStates ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_scanner_9_0= ruleRule ) ) ) ) ) )+ {...}?) ) )
            // InternalScanner.g:99:4: ( ( ( ({...}? => ( ({...}? => ( (lv_scanner_2_0= ruleExport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_scanner_3_0= ruleGlobal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_scanner_4_0= ruleLocal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_scanner_5_0= ruleDefault ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_scanner_6_0= ruleEof ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_scanner_7_0= ruleDefine ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_scanner_8_0= ruleStartStates ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_scanner_9_0= ruleRule ) ) ) ) ) )+ {...}?) )
            {
            // InternalScanner.g:99:4: ( ( ( ({...}? => ( ({...}? => ( (lv_scanner_2_0= ruleExport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_scanner_3_0= ruleGlobal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_scanner_4_0= ruleLocal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_scanner_5_0= ruleDefault ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_scanner_6_0= ruleEof ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_scanner_7_0= ruleDefine ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_scanner_8_0= ruleStartStates ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_scanner_9_0= ruleRule ) ) ) ) ) )+ {...}?) )
            // InternalScanner.g:100:5: ( ( ({...}? => ( ({...}? => ( (lv_scanner_2_0= ruleExport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_scanner_3_0= ruleGlobal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_scanner_4_0= ruleLocal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_scanner_5_0= ruleDefault ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_scanner_6_0= ruleEof ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_scanner_7_0= ruleDefine ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_scanner_8_0= ruleStartStates ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_scanner_9_0= ruleRule ) ) ) ) ) )+ {...}?)
            {
            getUnorderedGroupHelper().enter(grammarAccess.getModelAccess().getUnorderedGroup_1());
            // InternalScanner.g:103:5: ( ( ({...}? => ( ({...}? => ( (lv_scanner_2_0= ruleExport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_scanner_3_0= ruleGlobal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_scanner_4_0= ruleLocal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_scanner_5_0= ruleDefault ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_scanner_6_0= ruleEof ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_scanner_7_0= ruleDefine ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_scanner_8_0= ruleStartStates ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_scanner_9_0= ruleRule ) ) ) ) ) )+ {...}?)
            // InternalScanner.g:104:6: ( ({...}? => ( ({...}? => ( (lv_scanner_2_0= ruleExport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_scanner_3_0= ruleGlobal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_scanner_4_0= ruleLocal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_scanner_5_0= ruleDefault ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_scanner_6_0= ruleEof ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_scanner_7_0= ruleDefine ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_scanner_8_0= ruleStartStates ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_scanner_9_0= ruleRule ) ) ) ) ) )+ {...}?
            {
            // InternalScanner.g:104:6: ( ({...}? => ( ({...}? => ( (lv_scanner_2_0= ruleExport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_scanner_3_0= ruleGlobal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_scanner_4_0= ruleLocal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_scanner_5_0= ruleDefault ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_scanner_6_0= ruleEof ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_scanner_7_0= ruleDefine ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_scanner_8_0= ruleStartStates ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_scanner_9_0= ruleRule ) ) ) ) ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=9;
                alt1 = dfa1.predict(input);
                switch (alt1) {
            	case 1 :
            	    // InternalScanner.g:105:4: ({...}? => ( ({...}? => ( (lv_scanner_2_0= ruleExport ) ) ) ) )
            	    {
            	    // InternalScanner.g:105:4: ({...}? => ( ({...}? => ( (lv_scanner_2_0= ruleExport ) ) ) ) )
            	    // InternalScanner.g:106:5: {...}? => ( ({...}? => ( (lv_scanner_2_0= ruleExport ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_1(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleModel", "getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalScanner.g:106:102: ( ({...}? => ( (lv_scanner_2_0= ruleExport ) ) ) )
            	    // InternalScanner.g:107:6: ({...}? => ( (lv_scanner_2_0= ruleExport ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getModelAccess().getUnorderedGroup_1(), 0);
            	    // InternalScanner.g:110:9: ({...}? => ( (lv_scanner_2_0= ruleExport ) ) )
            	    // InternalScanner.g:110:10: {...}? => ( (lv_scanner_2_0= ruleExport ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleModel", "true");
            	    }
            	    // InternalScanner.g:110:19: ( (lv_scanner_2_0= ruleExport ) )
            	    // InternalScanner.g:110:20: (lv_scanner_2_0= ruleExport )
            	    {
            	    // InternalScanner.g:110:20: (lv_scanner_2_0= ruleExport )
            	    // InternalScanner.g:111:10: lv_scanner_2_0= ruleExport
            	    {
            	    if ( state.backtracking==0 ) {

            	      										newCompositeNode(grammarAccess.getModelAccess().getScannerExportParserRuleCall_1_0_0());
            	      									
            	    }
            	    pushFollow(FOLLOW_4);
            	    lv_scanner_2_0=ruleExport();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      										if (current==null) {
            	      											current = createModelElementForParent(grammarAccess.getModelRule());
            	      										}
            	      										add(
            	      											current,
            	      											"scanner",
            	      											lv_scanner_2_0,
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
            	    // InternalScanner.g:133:4: ({...}? => ( ({...}? => ( (lv_scanner_3_0= ruleGlobal ) ) ) ) )
            	    {
            	    // InternalScanner.g:133:4: ({...}? => ( ({...}? => ( (lv_scanner_3_0= ruleGlobal ) ) ) ) )
            	    // InternalScanner.g:134:5: {...}? => ( ({...}? => ( (lv_scanner_3_0= ruleGlobal ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_1(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleModel", "getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalScanner.g:134:102: ( ({...}? => ( (lv_scanner_3_0= ruleGlobal ) ) ) )
            	    // InternalScanner.g:135:6: ({...}? => ( (lv_scanner_3_0= ruleGlobal ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getModelAccess().getUnorderedGroup_1(), 1);
            	    // InternalScanner.g:138:9: ({...}? => ( (lv_scanner_3_0= ruleGlobal ) ) )
            	    // InternalScanner.g:138:10: {...}? => ( (lv_scanner_3_0= ruleGlobal ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleModel", "true");
            	    }
            	    // InternalScanner.g:138:19: ( (lv_scanner_3_0= ruleGlobal ) )
            	    // InternalScanner.g:138:20: (lv_scanner_3_0= ruleGlobal )
            	    {
            	    // InternalScanner.g:138:20: (lv_scanner_3_0= ruleGlobal )
            	    // InternalScanner.g:139:10: lv_scanner_3_0= ruleGlobal
            	    {
            	    if ( state.backtracking==0 ) {

            	      										newCompositeNode(grammarAccess.getModelAccess().getScannerGlobalParserRuleCall_1_1_0());
            	      									
            	    }
            	    pushFollow(FOLLOW_4);
            	    lv_scanner_3_0=ruleGlobal();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      										if (current==null) {
            	      											current = createModelElementForParent(grammarAccess.getModelRule());
            	      										}
            	      										add(
            	      											current,
            	      											"scanner",
            	      											lv_scanner_3_0,
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
            	    // InternalScanner.g:161:4: ({...}? => ( ({...}? => ( (lv_scanner_4_0= ruleLocal ) ) ) ) )
            	    {
            	    // InternalScanner.g:161:4: ({...}? => ( ({...}? => ( (lv_scanner_4_0= ruleLocal ) ) ) ) )
            	    // InternalScanner.g:162:5: {...}? => ( ({...}? => ( (lv_scanner_4_0= ruleLocal ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_1(), 2) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleModel", "getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // InternalScanner.g:162:102: ( ({...}? => ( (lv_scanner_4_0= ruleLocal ) ) ) )
            	    // InternalScanner.g:163:6: ({...}? => ( (lv_scanner_4_0= ruleLocal ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getModelAccess().getUnorderedGroup_1(), 2);
            	    // InternalScanner.g:166:9: ({...}? => ( (lv_scanner_4_0= ruleLocal ) ) )
            	    // InternalScanner.g:166:10: {...}? => ( (lv_scanner_4_0= ruleLocal ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleModel", "true");
            	    }
            	    // InternalScanner.g:166:19: ( (lv_scanner_4_0= ruleLocal ) )
            	    // InternalScanner.g:166:20: (lv_scanner_4_0= ruleLocal )
            	    {
            	    // InternalScanner.g:166:20: (lv_scanner_4_0= ruleLocal )
            	    // InternalScanner.g:167:10: lv_scanner_4_0= ruleLocal
            	    {
            	    if ( state.backtracking==0 ) {

            	      										newCompositeNode(grammarAccess.getModelAccess().getScannerLocalParserRuleCall_1_2_0());
            	      									
            	    }
            	    pushFollow(FOLLOW_4);
            	    lv_scanner_4_0=ruleLocal();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      										if (current==null) {
            	      											current = createModelElementForParent(grammarAccess.getModelRule());
            	      										}
            	      										add(
            	      											current,
            	      											"scanner",
            	      											lv_scanner_4_0,
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
            	    // InternalScanner.g:189:4: ({...}? => ( ({...}? => ( (lv_scanner_5_0= ruleDefault ) ) ) ) )
            	    {
            	    // InternalScanner.g:189:4: ({...}? => ( ({...}? => ( (lv_scanner_5_0= ruleDefault ) ) ) ) )
            	    // InternalScanner.g:190:5: {...}? => ( ({...}? => ( (lv_scanner_5_0= ruleDefault ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_1(), 3) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleModel", "getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_1(), 3)");
            	    }
            	    // InternalScanner.g:190:102: ( ({...}? => ( (lv_scanner_5_0= ruleDefault ) ) ) )
            	    // InternalScanner.g:191:6: ({...}? => ( (lv_scanner_5_0= ruleDefault ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getModelAccess().getUnorderedGroup_1(), 3);
            	    // InternalScanner.g:194:9: ({...}? => ( (lv_scanner_5_0= ruleDefault ) ) )
            	    // InternalScanner.g:194:10: {...}? => ( (lv_scanner_5_0= ruleDefault ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleModel", "true");
            	    }
            	    // InternalScanner.g:194:19: ( (lv_scanner_5_0= ruleDefault ) )
            	    // InternalScanner.g:194:20: (lv_scanner_5_0= ruleDefault )
            	    {
            	    // InternalScanner.g:194:20: (lv_scanner_5_0= ruleDefault )
            	    // InternalScanner.g:195:10: lv_scanner_5_0= ruleDefault
            	    {
            	    if ( state.backtracking==0 ) {

            	      										newCompositeNode(grammarAccess.getModelAccess().getScannerDefaultParserRuleCall_1_3_0());
            	      									
            	    }
            	    pushFollow(FOLLOW_4);
            	    lv_scanner_5_0=ruleDefault();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      										if (current==null) {
            	      											current = createModelElementForParent(grammarAccess.getModelRule());
            	      										}
            	      										add(
            	      											current,
            	      											"scanner",
            	      											lv_scanner_5_0,
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
            	    // InternalScanner.g:217:4: ({...}? => ( ({...}? => ( (lv_scanner_6_0= ruleEof ) ) ) ) )
            	    {
            	    // InternalScanner.g:217:4: ({...}? => ( ({...}? => ( (lv_scanner_6_0= ruleEof ) ) ) ) )
            	    // InternalScanner.g:218:5: {...}? => ( ({...}? => ( (lv_scanner_6_0= ruleEof ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_1(), 4) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleModel", "getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_1(), 4)");
            	    }
            	    // InternalScanner.g:218:102: ( ({...}? => ( (lv_scanner_6_0= ruleEof ) ) ) )
            	    // InternalScanner.g:219:6: ({...}? => ( (lv_scanner_6_0= ruleEof ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getModelAccess().getUnorderedGroup_1(), 4);
            	    // InternalScanner.g:222:9: ({...}? => ( (lv_scanner_6_0= ruleEof ) ) )
            	    // InternalScanner.g:222:10: {...}? => ( (lv_scanner_6_0= ruleEof ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleModel", "true");
            	    }
            	    // InternalScanner.g:222:19: ( (lv_scanner_6_0= ruleEof ) )
            	    // InternalScanner.g:222:20: (lv_scanner_6_0= ruleEof )
            	    {
            	    // InternalScanner.g:222:20: (lv_scanner_6_0= ruleEof )
            	    // InternalScanner.g:223:10: lv_scanner_6_0= ruleEof
            	    {
            	    if ( state.backtracking==0 ) {

            	      										newCompositeNode(grammarAccess.getModelAccess().getScannerEofParserRuleCall_1_4_0());
            	      									
            	    }
            	    pushFollow(FOLLOW_4);
            	    lv_scanner_6_0=ruleEof();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      										if (current==null) {
            	      											current = createModelElementForParent(grammarAccess.getModelRule());
            	      										}
            	      										add(
            	      											current,
            	      											"scanner",
            	      											lv_scanner_6_0,
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
            	    // InternalScanner.g:245:4: ({...}? => ( ({...}? => ( (lv_scanner_7_0= ruleDefine ) ) ) ) )
            	    {
            	    // InternalScanner.g:245:4: ({...}? => ( ({...}? => ( (lv_scanner_7_0= ruleDefine ) ) ) ) )
            	    // InternalScanner.g:246:5: {...}? => ( ({...}? => ( (lv_scanner_7_0= ruleDefine ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_1(), 5) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleModel", "getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_1(), 5)");
            	    }
            	    // InternalScanner.g:246:102: ( ({...}? => ( (lv_scanner_7_0= ruleDefine ) ) ) )
            	    // InternalScanner.g:247:6: ({...}? => ( (lv_scanner_7_0= ruleDefine ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getModelAccess().getUnorderedGroup_1(), 5);
            	    // InternalScanner.g:250:9: ({...}? => ( (lv_scanner_7_0= ruleDefine ) ) )
            	    // InternalScanner.g:250:10: {...}? => ( (lv_scanner_7_0= ruleDefine ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleModel", "true");
            	    }
            	    // InternalScanner.g:250:19: ( (lv_scanner_7_0= ruleDefine ) )
            	    // InternalScanner.g:250:20: (lv_scanner_7_0= ruleDefine )
            	    {
            	    // InternalScanner.g:250:20: (lv_scanner_7_0= ruleDefine )
            	    // InternalScanner.g:251:10: lv_scanner_7_0= ruleDefine
            	    {
            	    if ( state.backtracking==0 ) {

            	      										newCompositeNode(grammarAccess.getModelAccess().getScannerDefineParserRuleCall_1_5_0());
            	      									
            	    }
            	    pushFollow(FOLLOW_4);
            	    lv_scanner_7_0=ruleDefine();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      										if (current==null) {
            	      											current = createModelElementForParent(grammarAccess.getModelRule());
            	      										}
            	      										add(
            	      											current,
            	      											"scanner",
            	      											lv_scanner_7_0,
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
            	case 7 :
            	    // InternalScanner.g:273:4: ({...}? => ( ({...}? => ( (lv_scanner_8_0= ruleStartStates ) ) ) ) )
            	    {
            	    // InternalScanner.g:273:4: ({...}? => ( ({...}? => ( (lv_scanner_8_0= ruleStartStates ) ) ) ) )
            	    // InternalScanner.g:274:5: {...}? => ( ({...}? => ( (lv_scanner_8_0= ruleStartStates ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_1(), 6) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleModel", "getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_1(), 6)");
            	    }
            	    // InternalScanner.g:274:102: ( ({...}? => ( (lv_scanner_8_0= ruleStartStates ) ) ) )
            	    // InternalScanner.g:275:6: ({...}? => ( (lv_scanner_8_0= ruleStartStates ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getModelAccess().getUnorderedGroup_1(), 6);
            	    // InternalScanner.g:278:9: ({...}? => ( (lv_scanner_8_0= ruleStartStates ) ) )
            	    // InternalScanner.g:278:10: {...}? => ( (lv_scanner_8_0= ruleStartStates ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleModel", "true");
            	    }
            	    // InternalScanner.g:278:19: ( (lv_scanner_8_0= ruleStartStates ) )
            	    // InternalScanner.g:278:20: (lv_scanner_8_0= ruleStartStates )
            	    {
            	    // InternalScanner.g:278:20: (lv_scanner_8_0= ruleStartStates )
            	    // InternalScanner.g:279:10: lv_scanner_8_0= ruleStartStates
            	    {
            	    if ( state.backtracking==0 ) {

            	      										newCompositeNode(grammarAccess.getModelAccess().getScannerStartStatesParserRuleCall_1_6_0());
            	      									
            	    }
            	    pushFollow(FOLLOW_4);
            	    lv_scanner_8_0=ruleStartStates();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      										if (current==null) {
            	      											current = createModelElementForParent(grammarAccess.getModelRule());
            	      										}
            	      										add(
            	      											current,
            	      											"scanner",
            	      											lv_scanner_8_0,
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
            	case 8 :
            	    // InternalScanner.g:301:4: ({...}? => ( ({...}? => ( (lv_scanner_9_0= ruleRule ) ) ) ) )
            	    {
            	    // InternalScanner.g:301:4: ({...}? => ( ({...}? => ( (lv_scanner_9_0= ruleRule ) ) ) ) )
            	    // InternalScanner.g:302:5: {...}? => ( ({...}? => ( (lv_scanner_9_0= ruleRule ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_1(), 7) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleModel", "getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_1(), 7)");
            	    }
            	    // InternalScanner.g:302:102: ( ({...}? => ( (lv_scanner_9_0= ruleRule ) ) ) )
            	    // InternalScanner.g:303:6: ({...}? => ( (lv_scanner_9_0= ruleRule ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getModelAccess().getUnorderedGroup_1(), 7);
            	    // InternalScanner.g:306:9: ({...}? => ( (lv_scanner_9_0= ruleRule ) ) )
            	    // InternalScanner.g:306:10: {...}? => ( (lv_scanner_9_0= ruleRule ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleModel", "true");
            	    }
            	    // InternalScanner.g:306:19: ( (lv_scanner_9_0= ruleRule ) )
            	    // InternalScanner.g:306:20: (lv_scanner_9_0= ruleRule )
            	    {
            	    // InternalScanner.g:306:20: (lv_scanner_9_0= ruleRule )
            	    // InternalScanner.g:307:10: lv_scanner_9_0= ruleRule
            	    {
            	    if ( state.backtracking==0 ) {

            	      										newCompositeNode(grammarAccess.getModelAccess().getScannerRuleParserRuleCall_1_7_0());
            	      									
            	    }
            	    pushFollow(FOLLOW_4);
            	    lv_scanner_9_0=ruleRule();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      										if (current==null) {
            	      											current = createModelElementForParent(grammarAccess.getModelRule());
            	      										}
            	      										add(
            	      											current,
            	      											"scanner",
            	      											lv_scanner_9_0,
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
    // InternalScanner.g:341:1: entryRuleCodeBlock returns [String current=null] : iv_ruleCodeBlock= ruleCodeBlock EOF ;
    public final String entryRuleCodeBlock() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCodeBlock = null;


        try {
            // InternalScanner.g:341:49: (iv_ruleCodeBlock= ruleCodeBlock EOF )
            // InternalScanner.g:342:2: iv_ruleCodeBlock= ruleCodeBlock EOF
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
    // InternalScanner.g:348:1: ruleCodeBlock returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_CodeWall_0= ruleCodeWall | (kw= '{' this_CodeBlock_2= ruleCodeBlock kw= '}' ) )* ;
    public final AntlrDatatypeRuleToken ruleCodeBlock() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_CodeWall_0 = null;

        AntlrDatatypeRuleToken this_CodeBlock_2 = null;



        	enterRule();

        try {
            // InternalScanner.g:354:2: ( (this_CodeWall_0= ruleCodeWall | (kw= '{' this_CodeBlock_2= ruleCodeBlock kw= '}' ) )* )
            // InternalScanner.g:355:2: (this_CodeWall_0= ruleCodeWall | (kw= '{' this_CodeBlock_2= ruleCodeBlock kw= '}' ) )*
            {
            // InternalScanner.g:355:2: (this_CodeWall_0= ruleCodeWall | (kw= '{' this_CodeBlock_2= ruleCodeBlock kw= '}' ) )*
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
            	    // InternalScanner.g:356:3: this_CodeWall_0= ruleCodeWall
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
            	    // InternalScanner.g:367:3: (kw= '{' this_CodeBlock_2= ruleCodeBlock kw= '}' )
            	    {
            	    // InternalScanner.g:367:3: (kw= '{' this_CodeBlock_2= ruleCodeBlock kw= '}' )
            	    // InternalScanner.g:368:4: kw= '{' this_CodeBlock_2= ruleCodeBlock kw= '}'
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
    // InternalScanner.g:393:1: entryRuleCodeWall returns [String current=null] : iv_ruleCodeWall= ruleCodeWall EOF ;
    public final String entryRuleCodeWall() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCodeWall = null;


        try {
            // InternalScanner.g:393:48: (iv_ruleCodeWall= ruleCodeWall EOF )
            // InternalScanner.g:394:2: iv_ruleCodeWall= ruleCodeWall EOF
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
    // InternalScanner.g:400:1: ruleCodeWall returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_INT_1= RULE_INT | this_STRING_2= RULE_STRING | this_WS_3= RULE_WS | kw= '+' | kw= '-' | kw= '(' | kw= ')' | kw= '*' | kw= '.' | kw= '/' | kw= '\\\\' | kw= '|' | kw= '?' | kw= '>' | kw= '<' | kw= '#' | kw= '$' | kw= '%' | kw= ';' | kw= ':' | kw= '!' | kw= '=' | kw= ',' ) ;
    public final AntlrDatatypeRuleToken ruleCodeWall() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_INT_1=null;
        Token this_STRING_2=null;
        Token this_WS_3=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalScanner.g:406:2: ( (this_ID_0= RULE_ID | this_INT_1= RULE_INT | this_STRING_2= RULE_STRING | this_WS_3= RULE_WS | kw= '+' | kw= '-' | kw= '(' | kw= ')' | kw= '*' | kw= '.' | kw= '/' | kw= '\\\\' | kw= '|' | kw= '?' | kw= '>' | kw= '<' | kw= '#' | kw= '$' | kw= '%' | kw= ';' | kw= ':' | kw= '!' | kw= '=' | kw= ',' ) )
            // InternalScanner.g:407:2: (this_ID_0= RULE_ID | this_INT_1= RULE_INT | this_STRING_2= RULE_STRING | this_WS_3= RULE_WS | kw= '+' | kw= '-' | kw= '(' | kw= ')' | kw= '*' | kw= '.' | kw= '/' | kw= '\\\\' | kw= '|' | kw= '?' | kw= '>' | kw= '<' | kw= '#' | kw= '$' | kw= '%' | kw= ';' | kw= ':' | kw= '!' | kw= '=' | kw= ',' )
            {
            // InternalScanner.g:407:2: (this_ID_0= RULE_ID | this_INT_1= RULE_INT | this_STRING_2= RULE_STRING | this_WS_3= RULE_WS | kw= '+' | kw= '-' | kw= '(' | kw= ')' | kw= '*' | kw= '.' | kw= '/' | kw= '\\\\' | kw= '|' | kw= '?' | kw= '>' | kw= '<' | kw= '#' | kw= '$' | kw= '%' | kw= ';' | kw= ':' | kw= '!' | kw= '=' | kw= ',' )
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
                    // InternalScanner.g:408:3: this_ID_0= RULE_ID
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
                    // InternalScanner.g:416:3: this_INT_1= RULE_INT
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
                    // InternalScanner.g:424:3: this_STRING_2= RULE_STRING
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
                    // InternalScanner.g:432:3: this_WS_3= RULE_WS
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
                    // InternalScanner.g:440:3: kw= '+'
                    {
                    kw=(Token)match(input,13,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCodeWallAccess().getPlusSignKeyword_4());
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalScanner.g:446:3: kw= '-'
                    {
                    kw=(Token)match(input,14,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCodeWallAccess().getHyphenMinusKeyword_5());
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalScanner.g:452:3: kw= '('
                    {
                    kw=(Token)match(input,15,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCodeWallAccess().getLeftParenthesisKeyword_6());
                      		
                    }

                    }
                    break;
                case 8 :
                    // InternalScanner.g:458:3: kw= ')'
                    {
                    kw=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCodeWallAccess().getRightParenthesisKeyword_7());
                      		
                    }

                    }
                    break;
                case 9 :
                    // InternalScanner.g:464:3: kw= '*'
                    {
                    kw=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCodeWallAccess().getAsteriskKeyword_8());
                      		
                    }

                    }
                    break;
                case 10 :
                    // InternalScanner.g:470:3: kw= '.'
                    {
                    kw=(Token)match(input,18,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCodeWallAccess().getFullStopKeyword_9());
                      		
                    }

                    }
                    break;
                case 11 :
                    // InternalScanner.g:476:3: kw= '/'
                    {
                    kw=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCodeWallAccess().getSolidusKeyword_10());
                      		
                    }

                    }
                    break;
                case 12 :
                    // InternalScanner.g:482:3: kw= '\\\\'
                    {
                    kw=(Token)match(input,20,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCodeWallAccess().getReverseSolidusKeyword_11());
                      		
                    }

                    }
                    break;
                case 13 :
                    // InternalScanner.g:488:3: kw= '|'
                    {
                    kw=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCodeWallAccess().getVerticalLineKeyword_12());
                      		
                    }

                    }
                    break;
                case 14 :
                    // InternalScanner.g:494:3: kw= '?'
                    {
                    kw=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCodeWallAccess().getQuestionMarkKeyword_13());
                      		
                    }

                    }
                    break;
                case 15 :
                    // InternalScanner.g:500:3: kw= '>'
                    {
                    kw=(Token)match(input,23,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCodeWallAccess().getGreaterThanSignKeyword_14());
                      		
                    }

                    }
                    break;
                case 16 :
                    // InternalScanner.g:506:3: kw= '<'
                    {
                    kw=(Token)match(input,24,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCodeWallAccess().getLessThanSignKeyword_15());
                      		
                    }

                    }
                    break;
                case 17 :
                    // InternalScanner.g:512:3: kw= '#'
                    {
                    kw=(Token)match(input,25,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCodeWallAccess().getNumberSignKeyword_16());
                      		
                    }

                    }
                    break;
                case 18 :
                    // InternalScanner.g:518:3: kw= '$'
                    {
                    kw=(Token)match(input,26,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCodeWallAccess().getDollarSignKeyword_17());
                      		
                    }

                    }
                    break;
                case 19 :
                    // InternalScanner.g:524:3: kw= '%'
                    {
                    kw=(Token)match(input,27,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCodeWallAccess().getPercentSignKeyword_18());
                      		
                    }

                    }
                    break;
                case 20 :
                    // InternalScanner.g:530:3: kw= ';'
                    {
                    kw=(Token)match(input,28,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCodeWallAccess().getSemicolonKeyword_19());
                      		
                    }

                    }
                    break;
                case 21 :
                    // InternalScanner.g:536:3: kw= ':'
                    {
                    kw=(Token)match(input,29,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCodeWallAccess().getColonKeyword_20());
                      		
                    }

                    }
                    break;
                case 22 :
                    // InternalScanner.g:542:3: kw= '!'
                    {
                    kw=(Token)match(input,30,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCodeWallAccess().getExclamationMarkKeyword_21());
                      		
                    }

                    }
                    break;
                case 23 :
                    // InternalScanner.g:548:3: kw= '='
                    {
                    kw=(Token)match(input,31,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCodeWallAccess().getEqualsSignKeyword_22());
                      		
                    }

                    }
                    break;
                case 24 :
                    // InternalScanner.g:554:3: kw= ','
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
    // InternalScanner.g:563:1: entryRuleScanner returns [EObject current=null] : iv_ruleScanner= ruleScanner EOF ;
    public final EObject entryRuleScanner() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScanner = null;


        try {
            // InternalScanner.g:563:48: (iv_ruleScanner= ruleScanner EOF )
            // InternalScanner.g:564:2: iv_ruleScanner= ruleScanner EOF
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
    // InternalScanner.g:570:1: ruleScanner returns [EObject current=null] : (otherlv_0= 'SCANNER' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleScanner() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalScanner.g:576:2: ( (otherlv_0= 'SCANNER' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalScanner.g:577:2: (otherlv_0= 'SCANNER' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalScanner.g:577:2: (otherlv_0= 'SCANNER' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalScanner.g:578:3: otherlv_0= 'SCANNER' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,33,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getScannerAccess().getSCANNERKeyword_0());
              		
            }
            // InternalScanner.g:582:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalScanner.g:583:4: (lv_name_1_0= RULE_ID )
            {
            // InternalScanner.g:583:4: (lv_name_1_0= RULE_ID )
            // InternalScanner.g:584:5: lv_name_1_0= RULE_ID
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
    // InternalScanner.g:604:1: entryRuleExport returns [EObject current=null] : iv_ruleExport= ruleExport EOF ;
    public final EObject entryRuleExport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExport = null;


        try {
            // InternalScanner.g:604:47: (iv_ruleExport= ruleExport EOF )
            // InternalScanner.g:605:2: iv_ruleExport= ruleExport EOF
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
    // InternalScanner.g:611:1: ruleExport returns [EObject current=null] : (otherlv_0= 'EXPORT' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' ) ;
    public final EObject ruleExport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_content_2_0 = null;



        	enterRule();

        try {
            // InternalScanner.g:617:2: ( (otherlv_0= 'EXPORT' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' ) )
            // InternalScanner.g:618:2: (otherlv_0= 'EXPORT' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' )
            {
            // InternalScanner.g:618:2: (otherlv_0= 'EXPORT' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' )
            // InternalScanner.g:619:3: otherlv_0= 'EXPORT' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getExportAccess().getEXPORTKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,11,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getExportAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalScanner.g:627:3: ( (lv_content_2_0= ruleCodeBlock ) )
            // InternalScanner.g:628:4: (lv_content_2_0= ruleCodeBlock )
            {
            // InternalScanner.g:628:4: (lv_content_2_0= ruleCodeBlock )
            // InternalScanner.g:629:5: lv_content_2_0= ruleCodeBlock
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
    // InternalScanner.g:654:1: entryRuleGlobal returns [EObject current=null] : iv_ruleGlobal= ruleGlobal EOF ;
    public final EObject entryRuleGlobal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGlobal = null;


        try {
            // InternalScanner.g:654:47: (iv_ruleGlobal= ruleGlobal EOF )
            // InternalScanner.g:655:2: iv_ruleGlobal= ruleGlobal EOF
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
    // InternalScanner.g:661:1: ruleGlobal returns [EObject current=null] : (otherlv_0= 'GLOBAL' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' ) ;
    public final EObject ruleGlobal() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_content_2_0 = null;



        	enterRule();

        try {
            // InternalScanner.g:667:2: ( (otherlv_0= 'GLOBAL' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' ) )
            // InternalScanner.g:668:2: (otherlv_0= 'GLOBAL' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' )
            {
            // InternalScanner.g:668:2: (otherlv_0= 'GLOBAL' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' )
            // InternalScanner.g:669:3: otherlv_0= 'GLOBAL' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGlobalAccess().getGLOBALKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,11,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGlobalAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalScanner.g:677:3: ( (lv_content_2_0= ruleCodeBlock ) )
            // InternalScanner.g:678:4: (lv_content_2_0= ruleCodeBlock )
            {
            // InternalScanner.g:678:4: (lv_content_2_0= ruleCodeBlock )
            // InternalScanner.g:679:5: lv_content_2_0= ruleCodeBlock
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
    // InternalScanner.g:704:1: entryRuleLocal returns [EObject current=null] : iv_ruleLocal= ruleLocal EOF ;
    public final EObject entryRuleLocal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocal = null;


        try {
            // InternalScanner.g:704:46: (iv_ruleLocal= ruleLocal EOF )
            // InternalScanner.g:705:2: iv_ruleLocal= ruleLocal EOF
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
    // InternalScanner.g:711:1: ruleLocal returns [EObject current=null] : (otherlv_0= 'LOCAL' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' ) ;
    public final EObject ruleLocal() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_content_2_0 = null;



        	enterRule();

        try {
            // InternalScanner.g:717:2: ( (otherlv_0= 'LOCAL' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' ) )
            // InternalScanner.g:718:2: (otherlv_0= 'LOCAL' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' )
            {
            // InternalScanner.g:718:2: (otherlv_0= 'LOCAL' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' )
            // InternalScanner.g:719:3: otherlv_0= 'LOCAL' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getLocalAccess().getLOCALKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,11,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getLocalAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalScanner.g:727:3: ( (lv_content_2_0= ruleCodeBlock ) )
            // InternalScanner.g:728:4: (lv_content_2_0= ruleCodeBlock )
            {
            // InternalScanner.g:728:4: (lv_content_2_0= ruleCodeBlock )
            // InternalScanner.g:729:5: lv_content_2_0= ruleCodeBlock
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
    // InternalScanner.g:754:1: entryRuleDefault returns [EObject current=null] : iv_ruleDefault= ruleDefault EOF ;
    public final EObject entryRuleDefault() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefault = null;


        try {
            // InternalScanner.g:754:48: (iv_ruleDefault= ruleDefault EOF )
            // InternalScanner.g:755:2: iv_ruleDefault= ruleDefault EOF
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
    // InternalScanner.g:761:1: ruleDefault returns [EObject current=null] : (otherlv_0= 'DEFAULT' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' ) ;
    public final EObject ruleDefault() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_content_2_0 = null;



        	enterRule();

        try {
            // InternalScanner.g:767:2: ( (otherlv_0= 'DEFAULT' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' ) )
            // InternalScanner.g:768:2: (otherlv_0= 'DEFAULT' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' )
            {
            // InternalScanner.g:768:2: (otherlv_0= 'DEFAULT' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' )
            // InternalScanner.g:769:3: otherlv_0= 'DEFAULT' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDefaultAccess().getDEFAULTKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,11,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDefaultAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalScanner.g:777:3: ( (lv_content_2_0= ruleCodeBlock ) )
            // InternalScanner.g:778:4: (lv_content_2_0= ruleCodeBlock )
            {
            // InternalScanner.g:778:4: (lv_content_2_0= ruleCodeBlock )
            // InternalScanner.g:779:5: lv_content_2_0= ruleCodeBlock
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
    // InternalScanner.g:804:1: entryRuleEof returns [EObject current=null] : iv_ruleEof= ruleEof EOF ;
    public final EObject entryRuleEof() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEof = null;


        try {
            // InternalScanner.g:804:44: (iv_ruleEof= ruleEof EOF )
            // InternalScanner.g:805:2: iv_ruleEof= ruleEof EOF
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
    // InternalScanner.g:811:1: ruleEof returns [EObject current=null] : (otherlv_0= 'EOF' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' ) ;
    public final EObject ruleEof() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_content_2_0 = null;



        	enterRule();

        try {
            // InternalScanner.g:817:2: ( (otherlv_0= 'EOF' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' ) )
            // InternalScanner.g:818:2: (otherlv_0= 'EOF' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' )
            {
            // InternalScanner.g:818:2: (otherlv_0= 'EOF' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}' )
            // InternalScanner.g:819:3: otherlv_0= 'EOF' otherlv_1= '{' ( (lv_content_2_0= ruleCodeBlock ) ) otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getEofAccess().getEOFKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,11,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getEofAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalScanner.g:827:3: ( (lv_content_2_0= ruleCodeBlock ) )
            // InternalScanner.g:828:4: (lv_content_2_0= ruleCodeBlock )
            {
            // InternalScanner.g:828:4: (lv_content_2_0= ruleCodeBlock )
            // InternalScanner.g:829:5: lv_content_2_0= ruleCodeBlock
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


    // $ANTLR start "entryRuleDefine"
    // InternalScanner.g:854:1: entryRuleDefine returns [EObject current=null] : iv_ruleDefine= ruleDefine EOF ;
    public final EObject entryRuleDefine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefine = null;


        try {
            // InternalScanner.g:854:47: (iv_ruleDefine= ruleDefine EOF )
            // InternalScanner.g:855:2: iv_ruleDefine= ruleDefine EOF
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
    // InternalScanner.g:861:1: ruleDefine returns [EObject current=null] : (otherlv_0= 'DEFINE' ( (lv_defines_1_0= ruleDefineRule ) )+ ) ;
    public final EObject ruleDefine() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_defines_1_0 = null;



        	enterRule();

        try {
            // InternalScanner.g:867:2: ( (otherlv_0= 'DEFINE' ( (lv_defines_1_0= ruleDefineRule ) )+ ) )
            // InternalScanner.g:868:2: (otherlv_0= 'DEFINE' ( (lv_defines_1_0= ruleDefineRule ) )+ )
            {
            // InternalScanner.g:868:2: (otherlv_0= 'DEFINE' ( (lv_defines_1_0= ruleDefineRule ) )+ )
            // InternalScanner.g:869:3: otherlv_0= 'DEFINE' ( (lv_defines_1_0= ruleDefineRule ) )+
            {
            otherlv_0=(Token)match(input,39,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDefineAccess().getDEFINEKeyword_0());
              		
            }
            // InternalScanner.g:873:3: ( (lv_defines_1_0= ruleDefineRule ) )+
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
            	    // InternalScanner.g:874:4: (lv_defines_1_0= ruleDefineRule )
            	    {
            	    // InternalScanner.g:874:4: (lv_defines_1_0= ruleDefineRule )
            	    // InternalScanner.g:875:5: lv_defines_1_0= ruleDefineRule
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
    // InternalScanner.g:896:1: entryRuleDefineRule returns [EObject current=null] : iv_ruleDefineRule= ruleDefineRule EOF ;
    public final EObject entryRuleDefineRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefineRule = null;


        try {
            // InternalScanner.g:896:51: (iv_ruleDefineRule= ruleDefineRule EOF )
            // InternalScanner.g:897:2: iv_ruleDefineRule= ruleDefineRule EOF
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
    // InternalScanner.g:903:1: ruleDefineRule returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_rule_2_0= ruleDefineRegex ) ) otherlv_3= '.' ) ;
    public final EObject ruleDefineRule() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_rule_2_0 = null;



        	enterRule();

        try {
            // InternalScanner.g:909:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_rule_2_0= ruleDefineRegex ) ) otherlv_3= '.' ) )
            // InternalScanner.g:910:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_rule_2_0= ruleDefineRegex ) ) otherlv_3= '.' )
            {
            // InternalScanner.g:910:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_rule_2_0= ruleDefineRegex ) ) otherlv_3= '.' )
            // InternalScanner.g:911:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_rule_2_0= ruleDefineRegex ) ) otherlv_3= '.'
            {
            // InternalScanner.g:911:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalScanner.g:912:4: (lv_name_0_0= RULE_ID )
            {
            // InternalScanner.g:912:4: (lv_name_0_0= RULE_ID )
            // InternalScanner.g:913:5: lv_name_0_0= RULE_ID
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
            // InternalScanner.g:933:3: ( (lv_rule_2_0= ruleDefineRegex ) )
            // InternalScanner.g:934:4: (lv_rule_2_0= ruleDefineRegex )
            {
            // InternalScanner.g:934:4: (lv_rule_2_0= ruleDefineRegex )
            // InternalScanner.g:935:5: lv_rule_2_0= ruleDefineRegex
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
    // InternalScanner.g:960:1: entryRuleDefineRegex returns [String current=null] : iv_ruleDefineRegex= ruleDefineRegex EOF ;
    public final String entryRuleDefineRegex() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDefineRegex = null;


        try {
            // InternalScanner.g:960:51: (iv_ruleDefineRegex= ruleDefineRegex EOF )
            // InternalScanner.g:961:2: iv_ruleDefineRegex= ruleDefineRegex EOF
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
    // InternalScanner.g:967:1: ruleDefineRegex returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Regex_0= ruleRegex )* ;
    public final AntlrDatatypeRuleToken ruleDefineRegex() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Regex_0 = null;



        	enterRule();

        try {
            // InternalScanner.g:973:2: ( (this_Regex_0= ruleRegex )* )
            // InternalScanner.g:974:2: (this_Regex_0= ruleRegex )*
            {
            // InternalScanner.g:974:2: (this_Regex_0= ruleRegex )*
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

                        if ( (LA5_5==EOF||(LA5_5>=RULE_ID && LA5_5<=RULE_INT)||LA5_5==RULE_WS||(LA5_5>=11 && LA5_5<=25)||(LA5_5>=43 && LA5_5<=44)) ) {
                            alt5=1;
                        }


                        }
                        break;
                    case RULE_INT:
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
                    case 25:
                    case 43:
                    case 44:
                        {
                        alt5=1;
                        }
                        break;

                    }

                }
                else if ( ((LA5_0>=RULE_ID && LA5_0<=RULE_INT)||LA5_0==RULE_WS||(LA5_0>=11 && LA5_0<=17)||(LA5_0>=19 && LA5_0<=25)||(LA5_0>=43 && LA5_0<=44)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalScanner.g:975:3: this_Regex_0= ruleRegex
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
    // InternalScanner.g:989:1: entryRuleStartStates returns [EObject current=null] : iv_ruleStartStates= ruleStartStates EOF ;
    public final EObject entryRuleStartStates() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStartStates = null;


        try {
            // InternalScanner.g:989:52: (iv_ruleStartStates= ruleStartStates EOF )
            // InternalScanner.g:990:2: iv_ruleStartStates= ruleStartStates EOF
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
    // InternalScanner.g:996:1: ruleStartStates returns [EObject current=null] : (otherlv_0= 'START' ( (lv_incstates_1_0= ruleStartState ) ) (otherlv_2= ',' ( (lv_incstates_3_0= ruleStartState ) ) )* (otherlv_4= '-' ( (lv_exstates_5_0= ruleStartState ) ) (otherlv_6= ',' ( (lv_exstates_7_0= ruleStartState ) ) )* )? ) ;
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
            // InternalScanner.g:1002:2: ( (otherlv_0= 'START' ( (lv_incstates_1_0= ruleStartState ) ) (otherlv_2= ',' ( (lv_incstates_3_0= ruleStartState ) ) )* (otherlv_4= '-' ( (lv_exstates_5_0= ruleStartState ) ) (otherlv_6= ',' ( (lv_exstates_7_0= ruleStartState ) ) )* )? ) )
            // InternalScanner.g:1003:2: (otherlv_0= 'START' ( (lv_incstates_1_0= ruleStartState ) ) (otherlv_2= ',' ( (lv_incstates_3_0= ruleStartState ) ) )* (otherlv_4= '-' ( (lv_exstates_5_0= ruleStartState ) ) (otherlv_6= ',' ( (lv_exstates_7_0= ruleStartState ) ) )* )? )
            {
            // InternalScanner.g:1003:2: (otherlv_0= 'START' ( (lv_incstates_1_0= ruleStartState ) ) (otherlv_2= ',' ( (lv_incstates_3_0= ruleStartState ) ) )* (otherlv_4= '-' ( (lv_exstates_5_0= ruleStartState ) ) (otherlv_6= ',' ( (lv_exstates_7_0= ruleStartState ) ) )* )? )
            // InternalScanner.g:1004:3: otherlv_0= 'START' ( (lv_incstates_1_0= ruleStartState ) ) (otherlv_2= ',' ( (lv_incstates_3_0= ruleStartState ) ) )* (otherlv_4= '-' ( (lv_exstates_5_0= ruleStartState ) ) (otherlv_6= ',' ( (lv_exstates_7_0= ruleStartState ) ) )* )?
            {
            otherlv_0=(Token)match(input,40,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getStartStatesAccess().getSTARTKeyword_0());
              		
            }
            // InternalScanner.g:1008:3: ( (lv_incstates_1_0= ruleStartState ) )
            // InternalScanner.g:1009:4: (lv_incstates_1_0= ruleStartState )
            {
            // InternalScanner.g:1009:4: (lv_incstates_1_0= ruleStartState )
            // InternalScanner.g:1010:5: lv_incstates_1_0= ruleStartState
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

            // InternalScanner.g:1027:3: (otherlv_2= ',' ( (lv_incstates_3_0= ruleStartState ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==32) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalScanner.g:1028:4: otherlv_2= ',' ( (lv_incstates_3_0= ruleStartState ) )
            	    {
            	    otherlv_2=(Token)match(input,32,FOLLOW_8); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getStartStatesAccess().getCommaKeyword_2_0());
            	      			
            	    }
            	    // InternalScanner.g:1032:4: ( (lv_incstates_3_0= ruleStartState ) )
            	    // InternalScanner.g:1033:5: (lv_incstates_3_0= ruleStartState )
            	    {
            	    // InternalScanner.g:1033:5: (lv_incstates_3_0= ruleStartState )
            	    // InternalScanner.g:1034:6: lv_incstates_3_0= ruleStartState
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

            // InternalScanner.g:1052:3: (otherlv_4= '-' ( (lv_exstates_5_0= ruleStartState ) ) (otherlv_6= ',' ( (lv_exstates_7_0= ruleStartState ) ) )* )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==14) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalScanner.g:1053:4: otherlv_4= '-' ( (lv_exstates_5_0= ruleStartState ) ) (otherlv_6= ',' ( (lv_exstates_7_0= ruleStartState ) ) )*
                    {
                    otherlv_4=(Token)match(input,14,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getStartStatesAccess().getHyphenMinusKeyword_3_0());
                      			
                    }
                    // InternalScanner.g:1057:4: ( (lv_exstates_5_0= ruleStartState ) )
                    // InternalScanner.g:1058:5: (lv_exstates_5_0= ruleStartState )
                    {
                    // InternalScanner.g:1058:5: (lv_exstates_5_0= ruleStartState )
                    // InternalScanner.g:1059:6: lv_exstates_5_0= ruleStartState
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

                    // InternalScanner.g:1076:4: (otherlv_6= ',' ( (lv_exstates_7_0= ruleStartState ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==32) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalScanner.g:1077:5: otherlv_6= ',' ( (lv_exstates_7_0= ruleStartState ) )
                    	    {
                    	    otherlv_6=(Token)match(input,32,FOLLOW_8); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_6, grammarAccess.getStartStatesAccess().getCommaKeyword_3_2_0());
                    	      				
                    	    }
                    	    // InternalScanner.g:1081:5: ( (lv_exstates_7_0= ruleStartState ) )
                    	    // InternalScanner.g:1082:6: (lv_exstates_7_0= ruleStartState )
                    	    {
                    	    // InternalScanner.g:1082:6: (lv_exstates_7_0= ruleStartState )
                    	    // InternalScanner.g:1083:7: lv_exstates_7_0= ruleStartState
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
    // InternalScanner.g:1106:1: entryRuleStartState returns [EObject current=null] : iv_ruleStartState= ruleStartState EOF ;
    public final EObject entryRuleStartState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStartState = null;


        try {
            // InternalScanner.g:1106:51: (iv_ruleStartState= ruleStartState EOF )
            // InternalScanner.g:1107:2: iv_ruleStartState= ruleStartState EOF
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
    // InternalScanner.g:1113:1: ruleStartState returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleStartState() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalScanner.g:1119:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalScanner.g:1120:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalScanner.g:1120:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalScanner.g:1121:3: (lv_name_0_0= RULE_ID )
            {
            // InternalScanner.g:1121:3: (lv_name_0_0= RULE_ID )
            // InternalScanner.g:1122:4: lv_name_0_0= RULE_ID
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
    // InternalScanner.g:1141:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // InternalScanner.g:1141:45: (iv_ruleRule= ruleRule EOF )
            // InternalScanner.g:1142:2: iv_ruleRule= ruleRule EOF
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
    // InternalScanner.g:1148:1: ruleRule returns [EObject current=null] : ( ( ( (lv_info_0_1= 'RULE' | lv_info_0_2= 'RULES' ) ) ) ( (lv_rules_1_0= ruleSingleRule ) )* ) ;
    public final EObject ruleRule() throws RecognitionException {
        EObject current = null;

        Token lv_info_0_1=null;
        Token lv_info_0_2=null;
        EObject lv_rules_1_0 = null;



        	enterRule();

        try {
            // InternalScanner.g:1154:2: ( ( ( ( (lv_info_0_1= 'RULE' | lv_info_0_2= 'RULES' ) ) ) ( (lv_rules_1_0= ruleSingleRule ) )* ) )
            // InternalScanner.g:1155:2: ( ( ( (lv_info_0_1= 'RULE' | lv_info_0_2= 'RULES' ) ) ) ( (lv_rules_1_0= ruleSingleRule ) )* )
            {
            // InternalScanner.g:1155:2: ( ( ( (lv_info_0_1= 'RULE' | lv_info_0_2= 'RULES' ) ) ) ( (lv_rules_1_0= ruleSingleRule ) )* )
            // InternalScanner.g:1156:3: ( ( (lv_info_0_1= 'RULE' | lv_info_0_2= 'RULES' ) ) ) ( (lv_rules_1_0= ruleSingleRule ) )*
            {
            // InternalScanner.g:1156:3: ( ( (lv_info_0_1= 'RULE' | lv_info_0_2= 'RULES' ) ) )
            // InternalScanner.g:1157:4: ( (lv_info_0_1= 'RULE' | lv_info_0_2= 'RULES' ) )
            {
            // InternalScanner.g:1157:4: ( (lv_info_0_1= 'RULE' | lv_info_0_2= 'RULES' ) )
            // InternalScanner.g:1158:5: (lv_info_0_1= 'RULE' | lv_info_0_2= 'RULES' )
            {
            // InternalScanner.g:1158:5: (lv_info_0_1= 'RULE' | lv_info_0_2= 'RULES' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==41) ) {
                alt9=1;
            }
            else if ( (LA9_0==42) ) {
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
                    // InternalScanner.g:1159:6: lv_info_0_1= 'RULE'
                    {
                    lv_info_0_1=(Token)match(input,41,FOLLOW_17); if (state.failed) return current;
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
                    // InternalScanner.g:1170:6: lv_info_0_2= 'RULES'
                    {
                    lv_info_0_2=(Token)match(input,42,FOLLOW_17); if (state.failed) return current;
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

            // InternalScanner.g:1183:3: ( (lv_rules_1_0= ruleSingleRule ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=RULE_ID && LA10_0<=RULE_INT)||LA10_0==RULE_WS||(LA10_0>=11 && LA10_0<=25)||LA10_0==29||(LA10_0>=43 && LA10_0<=45)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalScanner.g:1184:4: (lv_rules_1_0= ruleSingleRule )
            	    {
            	    // InternalScanner.g:1184:4: (lv_rules_1_0= ruleSingleRule )
            	    // InternalScanner.g:1185:5: lv_rules_1_0= ruleSingleRule
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
    // InternalScanner.g:1206:1: entryRuleSingleRule returns [EObject current=null] : iv_ruleSingleRule= ruleSingleRule EOF ;
    public final EObject entryRuleSingleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleRule = null;


        try {
            // InternalScanner.g:1206:51: (iv_ruleSingleRule= ruleSingleRule EOF )
            // InternalScanner.g:1207:2: iv_ruleSingleRule= ruleSingleRule EOF
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
    // InternalScanner.g:1213:1: ruleSingleRule returns [EObject current=null] : ( (this_RuleStart_0= ruleRuleStart )? ( (lv_rule_1_0= ruleRuleDefinition ) ) otherlv_2= ':' (otherlv_3= '-' )? otherlv_4= '{' ( (lv_content_5_0= ruleCodeBlock ) ) otherlv_6= '}' ) ;
    public final EObject ruleSingleRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject this_RuleStart_0 = null;

        EObject lv_rule_1_0 = null;

        AntlrDatatypeRuleToken lv_content_5_0 = null;



        	enterRule();

        try {
            // InternalScanner.g:1219:2: ( ( (this_RuleStart_0= ruleRuleStart )? ( (lv_rule_1_0= ruleRuleDefinition ) ) otherlv_2= ':' (otherlv_3= '-' )? otherlv_4= '{' ( (lv_content_5_0= ruleCodeBlock ) ) otherlv_6= '}' ) )
            // InternalScanner.g:1220:2: ( (this_RuleStart_0= ruleRuleStart )? ( (lv_rule_1_0= ruleRuleDefinition ) ) otherlv_2= ':' (otherlv_3= '-' )? otherlv_4= '{' ( (lv_content_5_0= ruleCodeBlock ) ) otherlv_6= '}' )
            {
            // InternalScanner.g:1220:2: ( (this_RuleStart_0= ruleRuleStart )? ( (lv_rule_1_0= ruleRuleDefinition ) ) otherlv_2= ':' (otherlv_3= '-' )? otherlv_4= '{' ( (lv_content_5_0= ruleCodeBlock ) ) otherlv_6= '}' )
            // InternalScanner.g:1221:3: (this_RuleStart_0= ruleRuleStart )? ( (lv_rule_1_0= ruleRuleDefinition ) ) otherlv_2= ':' (otherlv_3= '-' )? otherlv_4= '{' ( (lv_content_5_0= ruleCodeBlock ) ) otherlv_6= '}'
            {
            // InternalScanner.g:1221:3: (this_RuleStart_0= ruleRuleStart )?
            int alt11=2;
            switch ( input.LA(1) ) {
                case 45:
                    {
                    alt11=1;
                    }
                    break;
                case 14:
                    {
                    int LA11_2 = input.LA(2);

                    if ( (LA11_2==25) ) {
                        switch ( input.LA(3) ) {
                            case RULE_ID:
                                {
                                int LA11_5 = input.LA(4);

                                if ( (LA11_5==32) ) {
                                    alt11=1;
                                }
                                else if ( (LA11_5==25) ) {
                                    alt11=1;
                                }
                                }
                                break;
                            case 17:
                                {
                                int LA11_6 = input.LA(4);

                                if ( (LA11_6==25) ) {
                                    alt11=1;
                                }
                                }
                                break;
                            case 46:
                                {
                                alt11=1;
                                }
                                break;
                        }

                    }
                    }
                    break;
                case 25:
                    {
                    switch ( input.LA(2) ) {
                        case RULE_ID:
                            {
                            int LA11_5 = input.LA(3);

                            if ( (LA11_5==32) ) {
                                alt11=1;
                            }
                            else if ( (LA11_5==25) ) {
                                alt11=1;
                            }
                            }
                            break;
                        case 17:
                            {
                            int LA11_6 = input.LA(3);

                            if ( (LA11_6==25) ) {
                                alt11=1;
                            }
                            }
                            break;
                        case 46:
                            {
                            alt11=1;
                            }
                            break;
                    }

                    }
                    break;
            }

            switch (alt11) {
                case 1 :
                    // InternalScanner.g:1222:4: this_RuleStart_0= ruleRuleStart
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getSingleRuleAccess().getRuleStartParserRuleCall_0());
                      			
                    }
                    pushFollow(FOLLOW_18);
                    this_RuleStart_0=ruleRuleStart();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_RuleStart_0;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }

            // InternalScanner.g:1231:3: ( (lv_rule_1_0= ruleRuleDefinition ) )
            // InternalScanner.g:1232:4: (lv_rule_1_0= ruleRuleDefinition )
            {
            // InternalScanner.g:1232:4: (lv_rule_1_0= ruleRuleDefinition )
            // InternalScanner.g:1233:5: lv_rule_1_0= ruleRuleDefinition
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
            // InternalScanner.g:1254:3: (otherlv_3= '-' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==14) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalScanner.g:1255:4: otherlv_3= '-'
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
            // InternalScanner.g:1264:3: ( (lv_content_5_0= ruleCodeBlock ) )
            // InternalScanner.g:1265:4: (lv_content_5_0= ruleCodeBlock )
            {
            // InternalScanner.g:1265:4: (lv_content_5_0= ruleCodeBlock )
            // InternalScanner.g:1266:5: lv_content_5_0= ruleCodeBlock
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
    // InternalScanner.g:1291:1: entryRuleRegex returns [String current=null] : iv_ruleRegex= ruleRegex EOF ;
    public final String entryRuleRegex() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRegex = null;


        try {
            // InternalScanner.g:1291:45: (iv_ruleRegex= ruleRegex EOF )
            // InternalScanner.g:1292:2: iv_ruleRegex= ruleRegex EOF
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
    // InternalScanner.g:1298:1: ruleRegex returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_INT_1= RULE_INT | this_WS_2= RULE_WS | kw= '+' | kw= '-' | kw= '(' | kw= ')' | kw= '*' | kw= '.' | kw= '/' | kw= '\\\\' | kw= '|' | kw= '?' | kw= '>' | kw= '<' | kw= '{' | kw= '}' | kw= '\"' | kw= '\\'' | kw= '#' ) ;
    public final AntlrDatatypeRuleToken ruleRegex() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_INT_1=null;
        Token this_WS_2=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalScanner.g:1304:2: ( (this_ID_0= RULE_ID | this_INT_1= RULE_INT | this_WS_2= RULE_WS | kw= '+' | kw= '-' | kw= '(' | kw= ')' | kw= '*' | kw= '.' | kw= '/' | kw= '\\\\' | kw= '|' | kw= '?' | kw= '>' | kw= '<' | kw= '{' | kw= '}' | kw= '\"' | kw= '\\'' | kw= '#' ) )
            // InternalScanner.g:1305:2: (this_ID_0= RULE_ID | this_INT_1= RULE_INT | this_WS_2= RULE_WS | kw= '+' | kw= '-' | kw= '(' | kw= ')' | kw= '*' | kw= '.' | kw= '/' | kw= '\\\\' | kw= '|' | kw= '?' | kw= '>' | kw= '<' | kw= '{' | kw= '}' | kw= '\"' | kw= '\\'' | kw= '#' )
            {
            // InternalScanner.g:1305:2: (this_ID_0= RULE_ID | this_INT_1= RULE_INT | this_WS_2= RULE_WS | kw= '+' | kw= '-' | kw= '(' | kw= ')' | kw= '*' | kw= '.' | kw= '/' | kw= '\\\\' | kw= '|' | kw= '?' | kw= '>' | kw= '<' | kw= '{' | kw= '}' | kw= '\"' | kw= '\\'' | kw= '#' )
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
            case RULE_WS:
                {
                alt13=3;
                }
                break;
            case 13:
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
            case 11:
                {
                alt13=16;
                }
                break;
            case 12:
                {
                alt13=17;
                }
                break;
            case 43:
                {
                alt13=18;
                }
                break;
            case 44:
                {
                alt13=19;
                }
                break;
            case 25:
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
                    // InternalScanner.g:1306:3: this_ID_0= RULE_ID
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
                    // InternalScanner.g:1314:3: this_INT_1= RULE_INT
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
                    // InternalScanner.g:1322:3: this_WS_2= RULE_WS
                    {
                    this_WS_2=(Token)match(input,RULE_WS,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_WS_2);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_WS_2, grammarAccess.getRegexAccess().getWSTerminalRuleCall_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalScanner.g:1330:3: kw= '+'
                    {
                    kw=(Token)match(input,13,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getRegexAccess().getPlusSignKeyword_3());
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalScanner.g:1336:3: kw= '-'
                    {
                    kw=(Token)match(input,14,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getRegexAccess().getHyphenMinusKeyword_4());
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalScanner.g:1342:3: kw= '('
                    {
                    kw=(Token)match(input,15,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getRegexAccess().getLeftParenthesisKeyword_5());
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalScanner.g:1348:3: kw= ')'
                    {
                    kw=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getRegexAccess().getRightParenthesisKeyword_6());
                      		
                    }

                    }
                    break;
                case 8 :
                    // InternalScanner.g:1354:3: kw= '*'
                    {
                    kw=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getRegexAccess().getAsteriskKeyword_7());
                      		
                    }

                    }
                    break;
                case 9 :
                    // InternalScanner.g:1360:3: kw= '.'
                    {
                    kw=(Token)match(input,18,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getRegexAccess().getFullStopKeyword_8());
                      		
                    }

                    }
                    break;
                case 10 :
                    // InternalScanner.g:1366:3: kw= '/'
                    {
                    kw=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getRegexAccess().getSolidusKeyword_9());
                      		
                    }

                    }
                    break;
                case 11 :
                    // InternalScanner.g:1372:3: kw= '\\\\'
                    {
                    kw=(Token)match(input,20,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getRegexAccess().getReverseSolidusKeyword_10());
                      		
                    }

                    }
                    break;
                case 12 :
                    // InternalScanner.g:1378:3: kw= '|'
                    {
                    kw=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getRegexAccess().getVerticalLineKeyword_11());
                      		
                    }

                    }
                    break;
                case 13 :
                    // InternalScanner.g:1384:3: kw= '?'
                    {
                    kw=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getRegexAccess().getQuestionMarkKeyword_12());
                      		
                    }

                    }
                    break;
                case 14 :
                    // InternalScanner.g:1390:3: kw= '>'
                    {
                    kw=(Token)match(input,23,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getRegexAccess().getGreaterThanSignKeyword_13());
                      		
                    }

                    }
                    break;
                case 15 :
                    // InternalScanner.g:1396:3: kw= '<'
                    {
                    kw=(Token)match(input,24,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getRegexAccess().getLessThanSignKeyword_14());
                      		
                    }

                    }
                    break;
                case 16 :
                    // InternalScanner.g:1402:3: kw= '{'
                    {
                    kw=(Token)match(input,11,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getRegexAccess().getLeftCurlyBracketKeyword_15());
                      		
                    }

                    }
                    break;
                case 17 :
                    // InternalScanner.g:1408:3: kw= '}'
                    {
                    kw=(Token)match(input,12,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getRegexAccess().getRightCurlyBracketKeyword_16());
                      		
                    }

                    }
                    break;
                case 18 :
                    // InternalScanner.g:1414:3: kw= '\"'
                    {
                    kw=(Token)match(input,43,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getRegexAccess().getQuotationMarkKeyword_17());
                      		
                    }

                    }
                    break;
                case 19 :
                    // InternalScanner.g:1420:3: kw= '\\''
                    {
                    kw=(Token)match(input,44,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getRegexAccess().getApostropheKeyword_18());
                      		
                    }

                    }
                    break;
                case 20 :
                    // InternalScanner.g:1426:3: kw= '#'
                    {
                    kw=(Token)match(input,25,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getRegexAccess().getNumberSignKeyword_19());
                      		
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
    // InternalScanner.g:1435:1: entryRuleRuleDefinition returns [EObject current=null] : iv_ruleRuleDefinition= ruleRuleDefinition EOF ;
    public final EObject entryRuleRuleDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRuleDefinition = null;


        try {
            // InternalScanner.g:1435:55: (iv_ruleRuleDefinition= ruleRuleDefinition EOF )
            // InternalScanner.g:1436:2: iv_ruleRuleDefinition= ruleRuleDefinition EOF
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
    // InternalScanner.g:1442:1: ruleRuleDefinition returns [EObject current=null] : ( ( ( ( ruleRegex ) )=> (lv_reg_0_0= ruleRegex ) ) | ( (otherlv_1= RULE_ID ) ) )* ;
    public final EObject ruleRuleDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_reg_0_0 = null;



        	enterRule();

        try {
            // InternalScanner.g:1448:2: ( ( ( ( ( ruleRegex ) )=> (lv_reg_0_0= ruleRegex ) ) | ( (otherlv_1= RULE_ID ) ) )* )
            // InternalScanner.g:1449:2: ( ( ( ( ruleRegex ) )=> (lv_reg_0_0= ruleRegex ) ) | ( (otherlv_1= RULE_ID ) ) )*
            {
            // InternalScanner.g:1449:2: ( ( ( ( ruleRegex ) )=> (lv_reg_0_0= ruleRegex ) ) | ( (otherlv_1= RULE_ID ) ) )*
            loop14:
            do {
                int alt14=3;
                alt14 = dfa14.predict(input);
                switch (alt14) {
            	case 1 :
            	    // InternalScanner.g:1450:3: ( ( ( ruleRegex ) )=> (lv_reg_0_0= ruleRegex ) )
            	    {
            	    // InternalScanner.g:1450:3: ( ( ( ruleRegex ) )=> (lv_reg_0_0= ruleRegex ) )
            	    // InternalScanner.g:1451:4: ( ( ruleRegex ) )=> (lv_reg_0_0= ruleRegex )
            	    {
            	    // InternalScanner.g:1455:4: (lv_reg_0_0= ruleRegex )
            	    // InternalScanner.g:1456:5: lv_reg_0_0= ruleRegex
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getRuleDefinitionAccess().getRegRegexParserRuleCall_0_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_14);
            	    lv_reg_0_0=ruleRegex();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getRuleDefinitionRule());
            	      					}
            	      					add(
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
            	    // InternalScanner.g:1474:3: ( (otherlv_1= RULE_ID ) )
            	    {
            	    // InternalScanner.g:1474:3: ( (otherlv_1= RULE_ID ) )
            	    // InternalScanner.g:1475:4: (otherlv_1= RULE_ID )
            	    {
            	    // InternalScanner.g:1475:4: (otherlv_1= RULE_ID )
            	    // InternalScanner.g:1476:5: otherlv_1= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElement(grammarAccess.getRuleDefinitionRule());
            	      					}
            	      				
            	    }
            	    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_14); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_1, grammarAccess.getRuleDefinitionAccess().getDefDefineRuleCrossReference_1_0());
            	      				
            	    }

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


    // $ANTLR start "entryRuleRuleStart"
    // InternalScanner.g:1491:1: entryRuleRuleStart returns [EObject current=null] : iv_ruleRuleStart= ruleRuleStart EOF ;
    public final EObject entryRuleRuleStart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRuleStart = null;


        try {
            // InternalScanner.g:1491:50: (iv_ruleRuleStart= ruleRuleStart EOF )
            // InternalScanner.g:1492:2: iv_ruleRuleStart= ruleRuleStart EOF
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
    // InternalScanner.g:1498:1: ruleRuleStart returns [EObject current=null] : ( (otherlv_0= 'NOT' | otherlv_1= '-' )? otherlv_2= '#' ( ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* ) | otherlv_6= 'STD' | otherlv_7= '*' ) otherlv_8= '#' ) ;
    public final EObject ruleRuleStart() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;


        	enterRule();

        try {
            // InternalScanner.g:1504:2: ( ( (otherlv_0= 'NOT' | otherlv_1= '-' )? otherlv_2= '#' ( ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* ) | otherlv_6= 'STD' | otherlv_7= '*' ) otherlv_8= '#' ) )
            // InternalScanner.g:1505:2: ( (otherlv_0= 'NOT' | otherlv_1= '-' )? otherlv_2= '#' ( ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* ) | otherlv_6= 'STD' | otherlv_7= '*' ) otherlv_8= '#' )
            {
            // InternalScanner.g:1505:2: ( (otherlv_0= 'NOT' | otherlv_1= '-' )? otherlv_2= '#' ( ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* ) | otherlv_6= 'STD' | otherlv_7= '*' ) otherlv_8= '#' )
            // InternalScanner.g:1506:3: (otherlv_0= 'NOT' | otherlv_1= '-' )? otherlv_2= '#' ( ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* ) | otherlv_6= 'STD' | otherlv_7= '*' ) otherlv_8= '#'
            {
            // InternalScanner.g:1506:3: (otherlv_0= 'NOT' | otherlv_1= '-' )?
            int alt15=3;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==45) ) {
                alt15=1;
            }
            else if ( (LA15_0==14) ) {
                alt15=2;
            }
            switch (alt15) {
                case 1 :
                    // InternalScanner.g:1507:4: otherlv_0= 'NOT'
                    {
                    otherlv_0=(Token)match(input,45,FOLLOW_21); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getRuleStartAccess().getNOTKeyword_0_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalScanner.g:1512:4: otherlv_1= '-'
                    {
                    otherlv_1=(Token)match(input,14,FOLLOW_21); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getRuleStartAccess().getHyphenMinusKeyword_0_1());
                      			
                    }

                    }
                    break;

            }

            otherlv_2=(Token)match(input,25,FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getRuleStartAccess().getNumberSignKeyword_1());
              		
            }
            // InternalScanner.g:1521:3: ( ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* ) | otherlv_6= 'STD' | otherlv_7= '*' )
            int alt17=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt17=1;
                }
                break;
            case 46:
                {
                alt17=2;
                }
                break;
            case 17:
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
                    // InternalScanner.g:1522:4: ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )
                    {
                    // InternalScanner.g:1522:4: ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )
                    // InternalScanner.g:1523:5: ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )*
                    {
                    // InternalScanner.g:1523:5: ( (otherlv_3= RULE_ID ) )
                    // InternalScanner.g:1524:6: (otherlv_3= RULE_ID )
                    {
                    // InternalScanner.g:1524:6: (otherlv_3= RULE_ID )
                    // InternalScanner.g:1525:7: otherlv_3= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElement(grammarAccess.getRuleStartRule());
                      							}
                      						
                    }
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_23); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							newLeafNode(otherlv_3, grammarAccess.getRuleStartAccess().getStateStartStateCrossReference_2_0_0_0());
                      						
                    }

                    }


                    }

                    // InternalScanner.g:1536:5: (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==32) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalScanner.g:1537:6: otherlv_4= ',' ( (otherlv_5= RULE_ID ) )
                    	    {
                    	    otherlv_4=(Token)match(input,32,FOLLOW_8); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						newLeafNode(otherlv_4, grammarAccess.getRuleStartAccess().getCommaKeyword_2_0_1_0());
                    	      					
                    	    }
                    	    // InternalScanner.g:1541:6: ( (otherlv_5= RULE_ID ) )
                    	    // InternalScanner.g:1542:7: (otherlv_5= RULE_ID )
                    	    {
                    	    // InternalScanner.g:1542:7: (otherlv_5= RULE_ID )
                    	    // InternalScanner.g:1543:8: otherlv_5= RULE_ID
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      								if (current==null) {
                    	      									current = createModelElement(grammarAccess.getRuleStartRule());
                    	      								}
                    	      							
                    	    }
                    	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_23); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      								newLeafNode(otherlv_5, grammarAccess.getRuleStartAccess().getStateStartStateCrossReference_2_0_1_1_0());
                    	      							
                    	    }

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
                    break;
                case 2 :
                    // InternalScanner.g:1557:4: otherlv_6= 'STD'
                    {
                    otherlv_6=(Token)match(input,46,FOLLOW_21); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getRuleStartAccess().getSTDKeyword_2_1());
                      			
                    }

                    }
                    break;
                case 3 :
                    // InternalScanner.g:1562:4: otherlv_7= '*'
                    {
                    otherlv_7=(Token)match(input,17,FOLLOW_21); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getRuleStartAccess().getAsteriskKeyword_2_2());
                      			
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
        // InternalScanner.g:1451:4: ( ( ruleRegex ) )
        // InternalScanner.g:1451:5: ( ruleRegex )
        {
        // InternalScanner.g:1451:5: ( ruleRegex )
        // InternalScanner.g:1452:5: ruleRegex
        {
        pushFollow(FOLLOW_2);
        ruleRegex();

        state._fsp--;
        if (state.failed) return ;

        }


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
    protected DFA14 dfa14 = new DFA14(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\1\1\11\uffff";
    static final String dfa_3s = "\1\42\11\uffff";
    static final String dfa_4s = "\1\52\11\uffff";
    static final String dfa_5s = "\1\uffff\1\11\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10";
    static final String dfa_6s = "\1\0\11\uffff}>";
    static final String[] dfa_7s = {
            "\1\2\1\3\1\4\1\5\1\6\1\7\1\10\2\11",
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
            return "()+ loopback of 104:6: ( ({...}? => ( ({...}? => ( (lv_scanner_2_0= ruleExport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_scanner_3_0= ruleGlobal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_scanner_4_0= ruleLocal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_scanner_5_0= ruleDefault ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_scanner_6_0= ruleEof ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_scanner_7_0= ruleDefine ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_scanner_8_0= ruleStartStates ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_scanner_9_0= ruleRule ) ) ) ) ) )+";
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

                        else if ( LA1_0 >= 41 && LA1_0 <= 42 && getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_1(), 7) ) {s = 9;}

                         
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
    static final String dfa_8s = "\27\uffff";
    static final String dfa_9s = "\1\1\26\uffff";
    static final String dfa_10s = "\1\4\1\uffff\1\0\24\uffff";
    static final String dfa_11s = "\1\54\1\uffff\1\0\24\uffff";
    static final String dfa_12s = "\1\uffff\1\3\1\uffff\23\1\1\2";
    static final String dfa_13s = "\1\0\1\uffff\1\1\24\uffff}>";
    static final String[] dfa_14s = {
            "\1\2\1\3\1\uffff\1\4\3\uffff\1\21\1\22\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\25\3\uffff\1\1\15\uffff\1\23\1\24",
            "",
            "\1\uffff",
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

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final short[] dfa_9 = DFA.unpackEncodedString(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final char[] dfa_11 = DFA.unpackEncodedStringToUnsignedChars(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final short[][] dfa_14 = unpackEncodedStringArray(dfa_14s);

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = dfa_8;
            this.eof = dfa_9;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "()* loopback of 1449:2: ( ( ( ( ruleRegex ) )=> (lv_reg_0_0= ruleRegex ) ) | ( (otherlv_1= RULE_ID ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_0 = input.LA(1);

                         
                        int index14_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA14_0==EOF||LA14_0==29) ) {s = 1;}

                        else if ( (LA14_0==RULE_ID) ) {s = 2;}

                        else if ( (LA14_0==RULE_INT) && (synpred1_InternalScanner())) {s = 3;}

                        else if ( (LA14_0==RULE_WS) && (synpred1_InternalScanner())) {s = 4;}

                        else if ( (LA14_0==13) && (synpred1_InternalScanner())) {s = 5;}

                        else if ( (LA14_0==14) && (synpred1_InternalScanner())) {s = 6;}

                        else if ( (LA14_0==15) && (synpred1_InternalScanner())) {s = 7;}

                        else if ( (LA14_0==16) && (synpred1_InternalScanner())) {s = 8;}

                        else if ( (LA14_0==17) && (synpred1_InternalScanner())) {s = 9;}

                        else if ( (LA14_0==18) && (synpred1_InternalScanner())) {s = 10;}

                        else if ( (LA14_0==19) && (synpred1_InternalScanner())) {s = 11;}

                        else if ( (LA14_0==20) && (synpred1_InternalScanner())) {s = 12;}

                        else if ( (LA14_0==21) && (synpred1_InternalScanner())) {s = 13;}

                        else if ( (LA14_0==22) && (synpred1_InternalScanner())) {s = 14;}

                        else if ( (LA14_0==23) && (synpred1_InternalScanner())) {s = 15;}

                        else if ( (LA14_0==24) && (synpred1_InternalScanner())) {s = 16;}

                        else if ( (LA14_0==11) && (synpred1_InternalScanner())) {s = 17;}

                        else if ( (LA14_0==12) && (synpred1_InternalScanner())) {s = 18;}

                        else if ( (LA14_0==43) && (synpred1_InternalScanner())) {s = 19;}

                        else if ( (LA14_0==44) && (synpred1_InternalScanner())) {s = 20;}

                        else if ( (LA14_0==25) && (synpred1_InternalScanner())) {s = 21;}

                         
                        input.seek(index14_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA14_2 = input.LA(1);

                         
                        int index14_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalScanner()) ) {s = 21;}

                        else if ( (true) ) {s = 22;}

                         
                        input.seek(index14_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 14, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000007FC00000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000007FC00000002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000001FFFFE8F2L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000001FFFFF8F0L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000180003FFF8B0L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000180003FFF8B2L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000100004002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000380023FFF8B2L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000180023FFF8B0L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000004800L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000400000020010L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000102000000L});

}
