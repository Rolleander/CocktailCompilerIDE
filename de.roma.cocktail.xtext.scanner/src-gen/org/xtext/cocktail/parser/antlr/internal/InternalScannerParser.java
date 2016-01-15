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

@SuppressWarnings("all")
public class InternalScannerParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INLINE_CODE", "RULE_ID", "RULE_STRING", "RULE_WS", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_ANY_OTHER", "'SCANNER'", "'EXPORT'", "'GLOBAL'", "'LOCAL'", "'DEFAULT'", "'EOF'", "'DEFINE'", "'='", "'.'", "'START'", "','", "'-'", "'RULE'", "'RULES'", "'+'", "'('", "')'", "'*'", "'/'", "'\\\\'", "'|'", "'?'", "':'", "'NOT'", "'#'", "'STD'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int RULE_INLINE_CODE=4;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=7;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=8;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

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
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
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

            					newCompositeNode(grammarAccess.getModelAccess().getScannerScannerParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_scanner_0_0=ruleScanner();

            state._fsp--;


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
            	        throw new FailedPredicateException(input, "ruleModel", "true");
            	    }
            	    // InternalScanner.g:110:19: ( (lv_scanner_2_0= ruleExport ) )
            	    // InternalScanner.g:110:20: (lv_scanner_2_0= ruleExport )
            	    {
            	    // InternalScanner.g:110:20: (lv_scanner_2_0= ruleExport )
            	    // InternalScanner.g:111:10: lv_scanner_2_0= ruleExport
            	    {

            	    										newCompositeNode(grammarAccess.getModelAccess().getScannerExportParserRuleCall_1_0_0());
            	    									
            	    pushFollow(FOLLOW_4);
            	    lv_scanner_2_0=ruleExport();

            	    state._fsp--;


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
            	        throw new FailedPredicateException(input, "ruleModel", "true");
            	    }
            	    // InternalScanner.g:138:19: ( (lv_scanner_3_0= ruleGlobal ) )
            	    // InternalScanner.g:138:20: (lv_scanner_3_0= ruleGlobal )
            	    {
            	    // InternalScanner.g:138:20: (lv_scanner_3_0= ruleGlobal )
            	    // InternalScanner.g:139:10: lv_scanner_3_0= ruleGlobal
            	    {

            	    										newCompositeNode(grammarAccess.getModelAccess().getScannerGlobalParserRuleCall_1_1_0());
            	    									
            	    pushFollow(FOLLOW_4);
            	    lv_scanner_3_0=ruleGlobal();

            	    state._fsp--;


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
            	        throw new FailedPredicateException(input, "ruleModel", "true");
            	    }
            	    // InternalScanner.g:166:19: ( (lv_scanner_4_0= ruleLocal ) )
            	    // InternalScanner.g:166:20: (lv_scanner_4_0= ruleLocal )
            	    {
            	    // InternalScanner.g:166:20: (lv_scanner_4_0= ruleLocal )
            	    // InternalScanner.g:167:10: lv_scanner_4_0= ruleLocal
            	    {

            	    										newCompositeNode(grammarAccess.getModelAccess().getScannerLocalParserRuleCall_1_2_0());
            	    									
            	    pushFollow(FOLLOW_4);
            	    lv_scanner_4_0=ruleLocal();

            	    state._fsp--;


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
            	        throw new FailedPredicateException(input, "ruleModel", "true");
            	    }
            	    // InternalScanner.g:194:19: ( (lv_scanner_5_0= ruleDefault ) )
            	    // InternalScanner.g:194:20: (lv_scanner_5_0= ruleDefault )
            	    {
            	    // InternalScanner.g:194:20: (lv_scanner_5_0= ruleDefault )
            	    // InternalScanner.g:195:10: lv_scanner_5_0= ruleDefault
            	    {

            	    										newCompositeNode(grammarAccess.getModelAccess().getScannerDefaultParserRuleCall_1_3_0());
            	    									
            	    pushFollow(FOLLOW_4);
            	    lv_scanner_5_0=ruleDefault();

            	    state._fsp--;


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
            	        throw new FailedPredicateException(input, "ruleModel", "true");
            	    }
            	    // InternalScanner.g:222:19: ( (lv_scanner_6_0= ruleEof ) )
            	    // InternalScanner.g:222:20: (lv_scanner_6_0= ruleEof )
            	    {
            	    // InternalScanner.g:222:20: (lv_scanner_6_0= ruleEof )
            	    // InternalScanner.g:223:10: lv_scanner_6_0= ruleEof
            	    {

            	    										newCompositeNode(grammarAccess.getModelAccess().getScannerEofParserRuleCall_1_4_0());
            	    									
            	    pushFollow(FOLLOW_4);
            	    lv_scanner_6_0=ruleEof();

            	    state._fsp--;


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
            	        throw new FailedPredicateException(input, "ruleModel", "true");
            	    }
            	    // InternalScanner.g:250:19: ( (lv_scanner_7_0= ruleDefine ) )
            	    // InternalScanner.g:250:20: (lv_scanner_7_0= ruleDefine )
            	    {
            	    // InternalScanner.g:250:20: (lv_scanner_7_0= ruleDefine )
            	    // InternalScanner.g:251:10: lv_scanner_7_0= ruleDefine
            	    {

            	    										newCompositeNode(grammarAccess.getModelAccess().getScannerDefineParserRuleCall_1_5_0());
            	    									
            	    pushFollow(FOLLOW_4);
            	    lv_scanner_7_0=ruleDefine();

            	    state._fsp--;


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
            	        throw new FailedPredicateException(input, "ruleModel", "true");
            	    }
            	    // InternalScanner.g:278:19: ( (lv_scanner_8_0= ruleStartStates ) )
            	    // InternalScanner.g:278:20: (lv_scanner_8_0= ruleStartStates )
            	    {
            	    // InternalScanner.g:278:20: (lv_scanner_8_0= ruleStartStates )
            	    // InternalScanner.g:279:10: lv_scanner_8_0= ruleStartStates
            	    {

            	    										newCompositeNode(grammarAccess.getModelAccess().getScannerStartStatesParserRuleCall_1_6_0());
            	    									
            	    pushFollow(FOLLOW_4);
            	    lv_scanner_8_0=ruleStartStates();

            	    state._fsp--;


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
            	        throw new FailedPredicateException(input, "ruleModel", "true");
            	    }
            	    // InternalScanner.g:306:19: ( (lv_scanner_9_0= ruleRule ) )
            	    // InternalScanner.g:306:20: (lv_scanner_9_0= ruleRule )
            	    {
            	    // InternalScanner.g:306:20: (lv_scanner_9_0= ruleRule )
            	    // InternalScanner.g:307:10: lv_scanner_9_0= ruleRule
            	    {

            	    										newCompositeNode(grammarAccess.getModelAccess().getScannerRuleParserRuleCall_1_7_0());
            	    									
            	    pushFollow(FOLLOW_4);
            	    lv_scanner_9_0=ruleRule();

            	    state._fsp--;


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

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getModelAccess().getUnorderedGroup_1());
            	    					

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

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getModelAccess().getUnorderedGroup_1()) ) {
                throw new FailedPredicateException(input, "ruleModel", "getUnorderedGroupHelper().canLeave(grammarAccess.getModelAccess().getUnorderedGroup_1())");
            }

            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getModelAccess().getUnorderedGroup_1());
            				

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
    // InternalScanner.g:348:1: ruleCodeBlock returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INLINE_CODE_0= RULE_INLINE_CODE ;
    public final AntlrDatatypeRuleToken ruleCodeBlock() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INLINE_CODE_0=null;


        	enterRule();

        try {
            // InternalScanner.g:354:2: (this_INLINE_CODE_0= RULE_INLINE_CODE )
            // InternalScanner.g:355:2: this_INLINE_CODE_0= RULE_INLINE_CODE
            {
            this_INLINE_CODE_0=(Token)match(input,RULE_INLINE_CODE,FOLLOW_2); 

            		current.merge(this_INLINE_CODE_0);
            	

            		newLeafNode(this_INLINE_CODE_0, grammarAccess.getCodeBlockAccess().getINLINE_CODETerminalRuleCall());
            	

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


    // $ANTLR start "entryRuleScanner"
    // InternalScanner.g:365:1: entryRuleScanner returns [EObject current=null] : iv_ruleScanner= ruleScanner EOF ;
    public final EObject entryRuleScanner() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScanner = null;


        try {
            // InternalScanner.g:365:48: (iv_ruleScanner= ruleScanner EOF )
            // InternalScanner.g:366:2: iv_ruleScanner= ruleScanner EOF
            {
             newCompositeNode(grammarAccess.getScannerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleScanner=ruleScanner();

            state._fsp--;

             current =iv_ruleScanner; 
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
    // $ANTLR end "entryRuleScanner"


    // $ANTLR start "ruleScanner"
    // InternalScanner.g:372:1: ruleScanner returns [EObject current=null] : (otherlv_0= 'SCANNER' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleScanner() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalScanner.g:378:2: ( (otherlv_0= 'SCANNER' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalScanner.g:379:2: (otherlv_0= 'SCANNER' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalScanner.g:379:2: (otherlv_0= 'SCANNER' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalScanner.g:380:3: otherlv_0= 'SCANNER' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getScannerAccess().getSCANNERKeyword_0());
            		
            // InternalScanner.g:384:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalScanner.g:385:4: (lv_name_1_0= RULE_ID )
            {
            // InternalScanner.g:385:4: (lv_name_1_0= RULE_ID )
            // InternalScanner.g:386:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getScannerAccess().getNameIDTerminalRuleCall_1_0());
            				

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
    // $ANTLR end "ruleScanner"


    // $ANTLR start "entryRuleExport"
    // InternalScanner.g:406:1: entryRuleExport returns [EObject current=null] : iv_ruleExport= ruleExport EOF ;
    public final EObject entryRuleExport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExport = null;


        try {
            // InternalScanner.g:406:47: (iv_ruleExport= ruleExport EOF )
            // InternalScanner.g:407:2: iv_ruleExport= ruleExport EOF
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
    // InternalScanner.g:413:1: ruleExport returns [EObject current=null] : (otherlv_0= 'EXPORT' ( (lv_content_1_0= ruleCodeBlock ) ) ) ;
    public final EObject ruleExport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_content_1_0 = null;



        	enterRule();

        try {
            // InternalScanner.g:419:2: ( (otherlv_0= 'EXPORT' ( (lv_content_1_0= ruleCodeBlock ) ) ) )
            // InternalScanner.g:420:2: (otherlv_0= 'EXPORT' ( (lv_content_1_0= ruleCodeBlock ) ) )
            {
            // InternalScanner.g:420:2: (otherlv_0= 'EXPORT' ( (lv_content_1_0= ruleCodeBlock ) ) )
            // InternalScanner.g:421:3: otherlv_0= 'EXPORT' ( (lv_content_1_0= ruleCodeBlock ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getExportAccess().getEXPORTKeyword_0());
            		
            // InternalScanner.g:425:3: ( (lv_content_1_0= ruleCodeBlock ) )
            // InternalScanner.g:426:4: (lv_content_1_0= ruleCodeBlock )
            {
            // InternalScanner.g:426:4: (lv_content_1_0= ruleCodeBlock )
            // InternalScanner.g:427:5: lv_content_1_0= ruleCodeBlock
            {

            					newCompositeNode(grammarAccess.getExportAccess().getContentCodeBlockParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_content_1_0=ruleCodeBlock();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExportRule());
            					}
            					set(
            						current,
            						"content",
            						lv_content_1_0,
            						"org.xtext.cocktail.Scanner.CodeBlock");
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
    // $ANTLR end "ruleExport"


    // $ANTLR start "entryRuleGlobal"
    // InternalScanner.g:448:1: entryRuleGlobal returns [EObject current=null] : iv_ruleGlobal= ruleGlobal EOF ;
    public final EObject entryRuleGlobal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGlobal = null;


        try {
            // InternalScanner.g:448:47: (iv_ruleGlobal= ruleGlobal EOF )
            // InternalScanner.g:449:2: iv_ruleGlobal= ruleGlobal EOF
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
    // InternalScanner.g:455:1: ruleGlobal returns [EObject current=null] : (otherlv_0= 'GLOBAL' ( (lv_content_1_0= ruleCodeBlock ) ) ) ;
    public final EObject ruleGlobal() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_content_1_0 = null;



        	enterRule();

        try {
            // InternalScanner.g:461:2: ( (otherlv_0= 'GLOBAL' ( (lv_content_1_0= ruleCodeBlock ) ) ) )
            // InternalScanner.g:462:2: (otherlv_0= 'GLOBAL' ( (lv_content_1_0= ruleCodeBlock ) ) )
            {
            // InternalScanner.g:462:2: (otherlv_0= 'GLOBAL' ( (lv_content_1_0= ruleCodeBlock ) ) )
            // InternalScanner.g:463:3: otherlv_0= 'GLOBAL' ( (lv_content_1_0= ruleCodeBlock ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getGlobalAccess().getGLOBALKeyword_0());
            		
            // InternalScanner.g:467:3: ( (lv_content_1_0= ruleCodeBlock ) )
            // InternalScanner.g:468:4: (lv_content_1_0= ruleCodeBlock )
            {
            // InternalScanner.g:468:4: (lv_content_1_0= ruleCodeBlock )
            // InternalScanner.g:469:5: lv_content_1_0= ruleCodeBlock
            {

            					newCompositeNode(grammarAccess.getGlobalAccess().getContentCodeBlockParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_content_1_0=ruleCodeBlock();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGlobalRule());
            					}
            					set(
            						current,
            						"content",
            						lv_content_1_0,
            						"org.xtext.cocktail.Scanner.CodeBlock");
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
    // $ANTLR end "ruleGlobal"


    // $ANTLR start "entryRuleLocal"
    // InternalScanner.g:490:1: entryRuleLocal returns [EObject current=null] : iv_ruleLocal= ruleLocal EOF ;
    public final EObject entryRuleLocal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocal = null;


        try {
            // InternalScanner.g:490:46: (iv_ruleLocal= ruleLocal EOF )
            // InternalScanner.g:491:2: iv_ruleLocal= ruleLocal EOF
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
    // InternalScanner.g:497:1: ruleLocal returns [EObject current=null] : (otherlv_0= 'LOCAL' ( (lv_content_1_0= ruleCodeBlock ) ) ) ;
    public final EObject ruleLocal() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_content_1_0 = null;



        	enterRule();

        try {
            // InternalScanner.g:503:2: ( (otherlv_0= 'LOCAL' ( (lv_content_1_0= ruleCodeBlock ) ) ) )
            // InternalScanner.g:504:2: (otherlv_0= 'LOCAL' ( (lv_content_1_0= ruleCodeBlock ) ) )
            {
            // InternalScanner.g:504:2: (otherlv_0= 'LOCAL' ( (lv_content_1_0= ruleCodeBlock ) ) )
            // InternalScanner.g:505:3: otherlv_0= 'LOCAL' ( (lv_content_1_0= ruleCodeBlock ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getLocalAccess().getLOCALKeyword_0());
            		
            // InternalScanner.g:509:3: ( (lv_content_1_0= ruleCodeBlock ) )
            // InternalScanner.g:510:4: (lv_content_1_0= ruleCodeBlock )
            {
            // InternalScanner.g:510:4: (lv_content_1_0= ruleCodeBlock )
            // InternalScanner.g:511:5: lv_content_1_0= ruleCodeBlock
            {

            					newCompositeNode(grammarAccess.getLocalAccess().getContentCodeBlockParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_content_1_0=ruleCodeBlock();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLocalRule());
            					}
            					set(
            						current,
            						"content",
            						lv_content_1_0,
            						"org.xtext.cocktail.Scanner.CodeBlock");
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
    // $ANTLR end "ruleLocal"


    // $ANTLR start "entryRuleDefault"
    // InternalScanner.g:532:1: entryRuleDefault returns [EObject current=null] : iv_ruleDefault= ruleDefault EOF ;
    public final EObject entryRuleDefault() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefault = null;


        try {
            // InternalScanner.g:532:48: (iv_ruleDefault= ruleDefault EOF )
            // InternalScanner.g:533:2: iv_ruleDefault= ruleDefault EOF
            {
             newCompositeNode(grammarAccess.getDefaultRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDefault=ruleDefault();

            state._fsp--;

             current =iv_ruleDefault; 
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
    // $ANTLR end "entryRuleDefault"


    // $ANTLR start "ruleDefault"
    // InternalScanner.g:539:1: ruleDefault returns [EObject current=null] : (otherlv_0= 'DEFAULT' ( (lv_content_1_0= ruleCodeBlock ) ) ) ;
    public final EObject ruleDefault() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_content_1_0 = null;



        	enterRule();

        try {
            // InternalScanner.g:545:2: ( (otherlv_0= 'DEFAULT' ( (lv_content_1_0= ruleCodeBlock ) ) ) )
            // InternalScanner.g:546:2: (otherlv_0= 'DEFAULT' ( (lv_content_1_0= ruleCodeBlock ) ) )
            {
            // InternalScanner.g:546:2: (otherlv_0= 'DEFAULT' ( (lv_content_1_0= ruleCodeBlock ) ) )
            // InternalScanner.g:547:3: otherlv_0= 'DEFAULT' ( (lv_content_1_0= ruleCodeBlock ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getDefaultAccess().getDEFAULTKeyword_0());
            		
            // InternalScanner.g:551:3: ( (lv_content_1_0= ruleCodeBlock ) )
            // InternalScanner.g:552:4: (lv_content_1_0= ruleCodeBlock )
            {
            // InternalScanner.g:552:4: (lv_content_1_0= ruleCodeBlock )
            // InternalScanner.g:553:5: lv_content_1_0= ruleCodeBlock
            {

            					newCompositeNode(grammarAccess.getDefaultAccess().getContentCodeBlockParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_content_1_0=ruleCodeBlock();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDefaultRule());
            					}
            					set(
            						current,
            						"content",
            						lv_content_1_0,
            						"org.xtext.cocktail.Scanner.CodeBlock");
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
    // $ANTLR end "ruleDefault"


    // $ANTLR start "entryRuleEof"
    // InternalScanner.g:574:1: entryRuleEof returns [EObject current=null] : iv_ruleEof= ruleEof EOF ;
    public final EObject entryRuleEof() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEof = null;


        try {
            // InternalScanner.g:574:44: (iv_ruleEof= ruleEof EOF )
            // InternalScanner.g:575:2: iv_ruleEof= ruleEof EOF
            {
             newCompositeNode(grammarAccess.getEofRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEof=ruleEof();

            state._fsp--;

             current =iv_ruleEof; 
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
    // $ANTLR end "entryRuleEof"


    // $ANTLR start "ruleEof"
    // InternalScanner.g:581:1: ruleEof returns [EObject current=null] : (otherlv_0= 'EOF' ( (lv_content_1_0= ruleCodeBlock ) ) ) ;
    public final EObject ruleEof() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_content_1_0 = null;



        	enterRule();

        try {
            // InternalScanner.g:587:2: ( (otherlv_0= 'EOF' ( (lv_content_1_0= ruleCodeBlock ) ) ) )
            // InternalScanner.g:588:2: (otherlv_0= 'EOF' ( (lv_content_1_0= ruleCodeBlock ) ) )
            {
            // InternalScanner.g:588:2: (otherlv_0= 'EOF' ( (lv_content_1_0= ruleCodeBlock ) ) )
            // InternalScanner.g:589:3: otherlv_0= 'EOF' ( (lv_content_1_0= ruleCodeBlock ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getEofAccess().getEOFKeyword_0());
            		
            // InternalScanner.g:593:3: ( (lv_content_1_0= ruleCodeBlock ) )
            // InternalScanner.g:594:4: (lv_content_1_0= ruleCodeBlock )
            {
            // InternalScanner.g:594:4: (lv_content_1_0= ruleCodeBlock )
            // InternalScanner.g:595:5: lv_content_1_0= ruleCodeBlock
            {

            					newCompositeNode(grammarAccess.getEofAccess().getContentCodeBlockParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_content_1_0=ruleCodeBlock();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEofRule());
            					}
            					set(
            						current,
            						"content",
            						lv_content_1_0,
            						"org.xtext.cocktail.Scanner.CodeBlock");
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
    // $ANTLR end "ruleEof"


    // $ANTLR start "entryRuleDefine"
    // InternalScanner.g:616:1: entryRuleDefine returns [EObject current=null] : iv_ruleDefine= ruleDefine EOF ;
    public final EObject entryRuleDefine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefine = null;


        try {
            // InternalScanner.g:616:47: (iv_ruleDefine= ruleDefine EOF )
            // InternalScanner.g:617:2: iv_ruleDefine= ruleDefine EOF
            {
             newCompositeNode(grammarAccess.getDefineRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDefine=ruleDefine();

            state._fsp--;

             current =iv_ruleDefine; 
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
    // $ANTLR end "entryRuleDefine"


    // $ANTLR start "ruleDefine"
    // InternalScanner.g:623:1: ruleDefine returns [EObject current=null] : (otherlv_0= 'DEFINE' ( (lv_defines_1_0= ruleDefineRule ) )+ ) ;
    public final EObject ruleDefine() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_defines_1_0 = null;



        	enterRule();

        try {
            // InternalScanner.g:629:2: ( (otherlv_0= 'DEFINE' ( (lv_defines_1_0= ruleDefineRule ) )+ ) )
            // InternalScanner.g:630:2: (otherlv_0= 'DEFINE' ( (lv_defines_1_0= ruleDefineRule ) )+ )
            {
            // InternalScanner.g:630:2: (otherlv_0= 'DEFINE' ( (lv_defines_1_0= ruleDefineRule ) )+ )
            // InternalScanner.g:631:3: otherlv_0= 'DEFINE' ( (lv_defines_1_0= ruleDefineRule ) )+
            {
            otherlv_0=(Token)match(input,18,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getDefineAccess().getDEFINEKeyword_0());
            		
            // InternalScanner.g:635:3: ( (lv_defines_1_0= ruleDefineRule ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalScanner.g:636:4: (lv_defines_1_0= ruleDefineRule )
            	    {
            	    // InternalScanner.g:636:4: (lv_defines_1_0= ruleDefineRule )
            	    // InternalScanner.g:637:5: lv_defines_1_0= ruleDefineRule
            	    {

            	    					newCompositeNode(grammarAccess.getDefineAccess().getDefinesDefineRuleParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_defines_1_0=ruleDefineRule();

            	    state._fsp--;


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
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
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
    // $ANTLR end "ruleDefine"


    // $ANTLR start "entryRuleDefineRule"
    // InternalScanner.g:658:1: entryRuleDefineRule returns [EObject current=null] : iv_ruleDefineRule= ruleDefineRule EOF ;
    public final EObject entryRuleDefineRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefineRule = null;


        try {
            // InternalScanner.g:658:51: (iv_ruleDefineRule= ruleDefineRule EOF )
            // InternalScanner.g:659:2: iv_ruleDefineRule= ruleDefineRule EOF
            {
             newCompositeNode(grammarAccess.getDefineRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDefineRule=ruleDefineRule();

            state._fsp--;

             current =iv_ruleDefineRule; 
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
    // $ANTLR end "entryRuleDefineRule"


    // $ANTLR start "ruleDefineRule"
    // InternalScanner.g:665:1: ruleDefineRule returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_rule_2_0= RULE_ID ) ) otherlv_3= '.' ) ;
    public final EObject ruleDefineRule() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_rule_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalScanner.g:671:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_rule_2_0= RULE_ID ) ) otherlv_3= '.' ) )
            // InternalScanner.g:672:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_rule_2_0= RULE_ID ) ) otherlv_3= '.' )
            {
            // InternalScanner.g:672:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_rule_2_0= RULE_ID ) ) otherlv_3= '.' )
            // InternalScanner.g:673:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_rule_2_0= RULE_ID ) ) otherlv_3= '.'
            {
            // InternalScanner.g:673:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalScanner.g:674:4: (lv_name_0_0= RULE_ID )
            {
            // InternalScanner.g:674:4: (lv_name_0_0= RULE_ID )
            // InternalScanner.g:675:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_0_0, grammarAccess.getDefineRuleAccess().getNameIDTerminalRuleCall_0_0());
            				

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

            otherlv_1=(Token)match(input,19,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getDefineRuleAccess().getEqualsSignKeyword_1());
            		
            // InternalScanner.g:695:3: ( (lv_rule_2_0= RULE_ID ) )
            // InternalScanner.g:696:4: (lv_rule_2_0= RULE_ID )
            {
            // InternalScanner.g:696:4: (lv_rule_2_0= RULE_ID )
            // InternalScanner.g:697:5: lv_rule_2_0= RULE_ID
            {
            lv_rule_2_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_rule_2_0, grammarAccess.getDefineRuleAccess().getRuleIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDefineRuleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"rule",
            						lv_rule_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getDefineRuleAccess().getFullStopKeyword_3());
            		

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
    // $ANTLR end "ruleDefineRule"


    // $ANTLR start "entryRuleStartStates"
    // InternalScanner.g:721:1: entryRuleStartStates returns [EObject current=null] : iv_ruleStartStates= ruleStartStates EOF ;
    public final EObject entryRuleStartStates() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStartStates = null;


        try {
            // InternalScanner.g:721:52: (iv_ruleStartStates= ruleStartStates EOF )
            // InternalScanner.g:722:2: iv_ruleStartStates= ruleStartStates EOF
            {
             newCompositeNode(grammarAccess.getStartStatesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStartStates=ruleStartStates();

            state._fsp--;

             current =iv_ruleStartStates; 
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
    // $ANTLR end "entryRuleStartStates"


    // $ANTLR start "ruleStartStates"
    // InternalScanner.g:728:1: ruleStartStates returns [EObject current=null] : (otherlv_0= 'START' ( (lv_incstates_1_0= ruleStartState ) ) (otherlv_2= ',' ( (lv_incstates_3_0= ruleStartState ) ) )* (otherlv_4= '-' ( (lv_exstates_5_0= ruleStartState ) ) (otherlv_6= ',' ( (lv_exstates_7_0= ruleStartState ) ) )* )? ) ;
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
            // InternalScanner.g:734:2: ( (otherlv_0= 'START' ( (lv_incstates_1_0= ruleStartState ) ) (otherlv_2= ',' ( (lv_incstates_3_0= ruleStartState ) ) )* (otherlv_4= '-' ( (lv_exstates_5_0= ruleStartState ) ) (otherlv_6= ',' ( (lv_exstates_7_0= ruleStartState ) ) )* )? ) )
            // InternalScanner.g:735:2: (otherlv_0= 'START' ( (lv_incstates_1_0= ruleStartState ) ) (otherlv_2= ',' ( (lv_incstates_3_0= ruleStartState ) ) )* (otherlv_4= '-' ( (lv_exstates_5_0= ruleStartState ) ) (otherlv_6= ',' ( (lv_exstates_7_0= ruleStartState ) ) )* )? )
            {
            // InternalScanner.g:735:2: (otherlv_0= 'START' ( (lv_incstates_1_0= ruleStartState ) ) (otherlv_2= ',' ( (lv_incstates_3_0= ruleStartState ) ) )* (otherlv_4= '-' ( (lv_exstates_5_0= ruleStartState ) ) (otherlv_6= ',' ( (lv_exstates_7_0= ruleStartState ) ) )* )? )
            // InternalScanner.g:736:3: otherlv_0= 'START' ( (lv_incstates_1_0= ruleStartState ) ) (otherlv_2= ',' ( (lv_incstates_3_0= ruleStartState ) ) )* (otherlv_4= '-' ( (lv_exstates_5_0= ruleStartState ) ) (otherlv_6= ',' ( (lv_exstates_7_0= ruleStartState ) ) )* )?
            {
            otherlv_0=(Token)match(input,21,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getStartStatesAccess().getSTARTKeyword_0());
            		
            // InternalScanner.g:740:3: ( (lv_incstates_1_0= ruleStartState ) )
            // InternalScanner.g:741:4: (lv_incstates_1_0= ruleStartState )
            {
            // InternalScanner.g:741:4: (lv_incstates_1_0= ruleStartState )
            // InternalScanner.g:742:5: lv_incstates_1_0= ruleStartState
            {

            					newCompositeNode(grammarAccess.getStartStatesAccess().getIncstatesStartStateParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_10);
            lv_incstates_1_0=ruleStartState();

            state._fsp--;


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

            // InternalScanner.g:759:3: (otherlv_2= ',' ( (lv_incstates_3_0= ruleStartState ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==22) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalScanner.g:760:4: otherlv_2= ',' ( (lv_incstates_3_0= ruleStartState ) )
            	    {
            	    otherlv_2=(Token)match(input,22,FOLLOW_5); 

            	    				newLeafNode(otherlv_2, grammarAccess.getStartStatesAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalScanner.g:764:4: ( (lv_incstates_3_0= ruleStartState ) )
            	    // InternalScanner.g:765:5: (lv_incstates_3_0= ruleStartState )
            	    {
            	    // InternalScanner.g:765:5: (lv_incstates_3_0= ruleStartState )
            	    // InternalScanner.g:766:6: lv_incstates_3_0= ruleStartState
            	    {

            	    						newCompositeNode(grammarAccess.getStartStatesAccess().getIncstatesStartStateParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_incstates_3_0=ruleStartState();

            	    state._fsp--;


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
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // InternalScanner.g:784:3: (otherlv_4= '-' ( (lv_exstates_5_0= ruleStartState ) ) (otherlv_6= ',' ( (lv_exstates_7_0= ruleStartState ) ) )* )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==23) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalScanner.g:785:4: otherlv_4= '-' ( (lv_exstates_5_0= ruleStartState ) ) (otherlv_6= ',' ( (lv_exstates_7_0= ruleStartState ) ) )*
                    {
                    otherlv_4=(Token)match(input,23,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getStartStatesAccess().getHyphenMinusKeyword_3_0());
                    			
                    // InternalScanner.g:789:4: ( (lv_exstates_5_0= ruleStartState ) )
                    // InternalScanner.g:790:5: (lv_exstates_5_0= ruleStartState )
                    {
                    // InternalScanner.g:790:5: (lv_exstates_5_0= ruleStartState )
                    // InternalScanner.g:791:6: lv_exstates_5_0= ruleStartState
                    {

                    						newCompositeNode(grammarAccess.getStartStatesAccess().getExstatesStartStateParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_exstates_5_0=ruleStartState();

                    state._fsp--;


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

                    // InternalScanner.g:808:4: (otherlv_6= ',' ( (lv_exstates_7_0= ruleStartState ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==22) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalScanner.g:809:5: otherlv_6= ',' ( (lv_exstates_7_0= ruleStartState ) )
                    	    {
                    	    otherlv_6=(Token)match(input,22,FOLLOW_5); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getStartStatesAccess().getCommaKeyword_3_2_0());
                    	    				
                    	    // InternalScanner.g:813:5: ( (lv_exstates_7_0= ruleStartState ) )
                    	    // InternalScanner.g:814:6: (lv_exstates_7_0= ruleStartState )
                    	    {
                    	    // InternalScanner.g:814:6: (lv_exstates_7_0= ruleStartState )
                    	    // InternalScanner.g:815:7: lv_exstates_7_0= ruleStartState
                    	    {

                    	    							newCompositeNode(grammarAccess.getStartStatesAccess().getExstatesStartStateParserRuleCall_3_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_exstates_7_0=ruleStartState();

                    	    state._fsp--;


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
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);


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
    // $ANTLR end "ruleStartStates"


    // $ANTLR start "entryRuleStartState"
    // InternalScanner.g:838:1: entryRuleStartState returns [EObject current=null] : iv_ruleStartState= ruleStartState EOF ;
    public final EObject entryRuleStartState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStartState = null;


        try {
            // InternalScanner.g:838:51: (iv_ruleStartState= ruleStartState EOF )
            // InternalScanner.g:839:2: iv_ruleStartState= ruleStartState EOF
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
    // InternalScanner.g:845:1: ruleStartState returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleStartState() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalScanner.g:851:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalScanner.g:852:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalScanner.g:852:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalScanner.g:853:3: (lv_name_0_0= RULE_ID )
            {
            // InternalScanner.g:853:3: (lv_name_0_0= RULE_ID )
            // InternalScanner.g:854:4: lv_name_0_0= RULE_ID
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


    // $ANTLR start "entryRuleRule"
    // InternalScanner.g:873:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // InternalScanner.g:873:45: (iv_ruleRule= ruleRule EOF )
            // InternalScanner.g:874:2: iv_ruleRule= ruleRule EOF
            {
             newCompositeNode(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRule=ruleRule();

            state._fsp--;

             current =iv_ruleRule; 
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
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // InternalScanner.g:880:1: ruleRule returns [EObject current=null] : ( ( ( (lv_info_0_1= 'RULE' | lv_info_0_2= 'RULES' ) ) ) ( (lv_rules_1_0= ruleSingleRule ) )* ) ;
    public final EObject ruleRule() throws RecognitionException {
        EObject current = null;

        Token lv_info_0_1=null;
        Token lv_info_0_2=null;
        EObject lv_rules_1_0 = null;



        	enterRule();

        try {
            // InternalScanner.g:886:2: ( ( ( ( (lv_info_0_1= 'RULE' | lv_info_0_2= 'RULES' ) ) ) ( (lv_rules_1_0= ruleSingleRule ) )* ) )
            // InternalScanner.g:887:2: ( ( ( (lv_info_0_1= 'RULE' | lv_info_0_2= 'RULES' ) ) ) ( (lv_rules_1_0= ruleSingleRule ) )* )
            {
            // InternalScanner.g:887:2: ( ( ( (lv_info_0_1= 'RULE' | lv_info_0_2= 'RULES' ) ) ) ( (lv_rules_1_0= ruleSingleRule ) )* )
            // InternalScanner.g:888:3: ( ( (lv_info_0_1= 'RULE' | lv_info_0_2= 'RULES' ) ) ) ( (lv_rules_1_0= ruleSingleRule ) )*
            {
            // InternalScanner.g:888:3: ( ( (lv_info_0_1= 'RULE' | lv_info_0_2= 'RULES' ) ) )
            // InternalScanner.g:889:4: ( (lv_info_0_1= 'RULE' | lv_info_0_2= 'RULES' ) )
            {
            // InternalScanner.g:889:4: ( (lv_info_0_1= 'RULE' | lv_info_0_2= 'RULES' ) )
            // InternalScanner.g:890:5: (lv_info_0_1= 'RULE' | lv_info_0_2= 'RULES' )
            {
            // InternalScanner.g:890:5: (lv_info_0_1= 'RULE' | lv_info_0_2= 'RULES' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==24) ) {
                alt6=1;
            }
            else if ( (LA6_0==25) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalScanner.g:891:6: lv_info_0_1= 'RULE'
                    {
                    lv_info_0_1=(Token)match(input,24,FOLLOW_12); 

                    						newLeafNode(lv_info_0_1, grammarAccess.getRuleAccess().getInfoRULEKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRuleRule());
                    						}
                    						setWithLastConsumed(current, "info", lv_info_0_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalScanner.g:902:6: lv_info_0_2= 'RULES'
                    {
                    lv_info_0_2=(Token)match(input,25,FOLLOW_12); 

                    						newLeafNode(lv_info_0_2, grammarAccess.getRuleAccess().getInfoRULESKeyword_0_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRuleRule());
                    						}
                    						setWithLastConsumed(current, "info", lv_info_0_2, null);
                    					

                    }
                    break;

            }


            }


            }

            // InternalScanner.g:915:3: ( (lv_rules_1_0= ruleSingleRule ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=RULE_ID && LA7_0<=RULE_WS)||LA7_0==20||LA7_0==23||(LA7_0>=26 && LA7_0<=36)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalScanner.g:916:4: (lv_rules_1_0= ruleSingleRule )
            	    {
            	    // InternalScanner.g:916:4: (lv_rules_1_0= ruleSingleRule )
            	    // InternalScanner.g:917:5: lv_rules_1_0= ruleSingleRule
            	    {

            	    					newCompositeNode(grammarAccess.getRuleAccess().getRulesSingleRuleParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_12);
            	    lv_rules_1_0=ruleSingleRule();

            	    state._fsp--;


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
            	    break;

            	default :
            	    break loop7;
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
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleSingleRule"
    // InternalScanner.g:938:1: entryRuleSingleRule returns [EObject current=null] : iv_ruleSingleRule= ruleSingleRule EOF ;
    public final EObject entryRuleSingleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleRule = null;


        try {
            // InternalScanner.g:938:51: (iv_ruleSingleRule= ruleSingleRule EOF )
            // InternalScanner.g:939:2: iv_ruleSingleRule= ruleSingleRule EOF
            {
             newCompositeNode(grammarAccess.getSingleRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSingleRule=ruleSingleRule();

            state._fsp--;

             current =iv_ruleSingleRule; 
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
    // $ANTLR end "entryRuleSingleRule"


    // $ANTLR start "ruleSingleRule"
    // InternalScanner.g:945:1: ruleSingleRule returns [EObject current=null] : ( (this_RuleStart_0= ruleRuleStart )? ( (lv_rule_1_0= ruleRuleDefinition ) ) (otherlv_2= '-' )? ( (lv_content_3_0= ruleCodeBlock ) ) ) ;
    public final EObject ruleSingleRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_RuleStart_0 = null;

        AntlrDatatypeRuleToken lv_rule_1_0 = null;

        AntlrDatatypeRuleToken lv_content_3_0 = null;



        	enterRule();

        try {
            // InternalScanner.g:951:2: ( ( (this_RuleStart_0= ruleRuleStart )? ( (lv_rule_1_0= ruleRuleDefinition ) ) (otherlv_2= '-' )? ( (lv_content_3_0= ruleCodeBlock ) ) ) )
            // InternalScanner.g:952:2: ( (this_RuleStart_0= ruleRuleStart )? ( (lv_rule_1_0= ruleRuleDefinition ) ) (otherlv_2= '-' )? ( (lv_content_3_0= ruleCodeBlock ) ) )
            {
            // InternalScanner.g:952:2: ( (this_RuleStart_0= ruleRuleStart )? ( (lv_rule_1_0= ruleRuleDefinition ) ) (otherlv_2= '-' )? ( (lv_content_3_0= ruleCodeBlock ) ) )
            // InternalScanner.g:953:3: (this_RuleStart_0= ruleRuleStart )? ( (lv_rule_1_0= ruleRuleDefinition ) ) (otherlv_2= '-' )? ( (lv_content_3_0= ruleCodeBlock ) )
            {
            // InternalScanner.g:953:3: (this_RuleStart_0= ruleRuleStart )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=35 && LA8_0<=36)) ) {
                alt8=1;
            }
            else if ( (LA8_0==23) ) {
                int LA8_2 = input.LA(2);

                if ( (LA8_2==36) ) {
                    alt8=1;
                }
            }
            switch (alt8) {
                case 1 :
                    // InternalScanner.g:954:4: this_RuleStart_0= ruleRuleStart
                    {

                    				newCompositeNode(grammarAccess.getSingleRuleAccess().getRuleStartParserRuleCall_0());
                    			
                    pushFollow(FOLLOW_13);
                    this_RuleStart_0=ruleRuleStart();

                    state._fsp--;


                    				current = this_RuleStart_0;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            // InternalScanner.g:963:3: ( (lv_rule_1_0= ruleRuleDefinition ) )
            // InternalScanner.g:964:4: (lv_rule_1_0= ruleRuleDefinition )
            {
            // InternalScanner.g:964:4: (lv_rule_1_0= ruleRuleDefinition )
            // InternalScanner.g:965:5: lv_rule_1_0= ruleRuleDefinition
            {

            					newCompositeNode(grammarAccess.getSingleRuleAccess().getRuleRuleDefinitionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_14);
            lv_rule_1_0=ruleRuleDefinition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSingleRuleRule());
            					}
            					add(
            						current,
            						"rule",
            						lv_rule_1_0,
            						"org.xtext.cocktail.Scanner.RuleDefinition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalScanner.g:982:3: (otherlv_2= '-' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==23) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalScanner.g:983:4: otherlv_2= '-'
                    {
                    otherlv_2=(Token)match(input,23,FOLLOW_6); 

                    				newLeafNode(otherlv_2, grammarAccess.getSingleRuleAccess().getHyphenMinusKeyword_2());
                    			

                    }
                    break;

            }

            // InternalScanner.g:988:3: ( (lv_content_3_0= ruleCodeBlock ) )
            // InternalScanner.g:989:4: (lv_content_3_0= ruleCodeBlock )
            {
            // InternalScanner.g:989:4: (lv_content_3_0= ruleCodeBlock )
            // InternalScanner.g:990:5: lv_content_3_0= ruleCodeBlock
            {

            					newCompositeNode(grammarAccess.getSingleRuleAccess().getContentCodeBlockParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_content_3_0=ruleCodeBlock();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSingleRuleRule());
            					}
            					set(
            						current,
            						"content",
            						lv_content_3_0,
            						"org.xtext.cocktail.Scanner.CodeBlock");
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
    // $ANTLR end "ruleSingleRule"


    // $ANTLR start "entryRuleRuleDefinition"
    // InternalScanner.g:1011:1: entryRuleRuleDefinition returns [String current=null] : iv_ruleRuleDefinition= ruleRuleDefinition EOF ;
    public final String entryRuleRuleDefinition() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRuleDefinition = null;


        try {
            // InternalScanner.g:1011:54: (iv_ruleRuleDefinition= ruleRuleDefinition EOF )
            // InternalScanner.g:1012:2: iv_ruleRuleDefinition= ruleRuleDefinition EOF
            {
             newCompositeNode(grammarAccess.getRuleDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRuleDefinition=ruleRuleDefinition();

            state._fsp--;

             current =iv_ruleRuleDefinition.getText(); 
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
    // $ANTLR end "entryRuleRuleDefinition"


    // $ANTLR start "ruleRuleDefinition"
    // InternalScanner.g:1018:1: ruleRuleDefinition returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING | this_WS_2= RULE_WS | kw= '+' | kw= '-' | kw= '(' | kw= ')' | kw= '*' | kw= '.' | kw= '/' | kw= '\\\\' | kw= '|' | kw= '?' )* kw= ':' ) ;
    public final AntlrDatatypeRuleToken ruleRuleDefinition() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_STRING_1=null;
        Token this_WS_2=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalScanner.g:1024:2: ( ( (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING | this_WS_2= RULE_WS | kw= '+' | kw= '-' | kw= '(' | kw= ')' | kw= '*' | kw= '.' | kw= '/' | kw= '\\\\' | kw= '|' | kw= '?' )* kw= ':' ) )
            // InternalScanner.g:1025:2: ( (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING | this_WS_2= RULE_WS | kw= '+' | kw= '-' | kw= '(' | kw= ')' | kw= '*' | kw= '.' | kw= '/' | kw= '\\\\' | kw= '|' | kw= '?' )* kw= ':' )
            {
            // InternalScanner.g:1025:2: ( (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING | this_WS_2= RULE_WS | kw= '+' | kw= '-' | kw= '(' | kw= ')' | kw= '*' | kw= '.' | kw= '/' | kw= '\\\\' | kw= '|' | kw= '?' )* kw= ':' )
            // InternalScanner.g:1026:3: (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING | this_WS_2= RULE_WS | kw= '+' | kw= '-' | kw= '(' | kw= ')' | kw= '*' | kw= '.' | kw= '/' | kw= '\\\\' | kw= '|' | kw= '?' )* kw= ':'
            {
            // InternalScanner.g:1026:3: (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING | this_WS_2= RULE_WS | kw= '+' | kw= '-' | kw= '(' | kw= ')' | kw= '*' | kw= '.' | kw= '/' | kw= '\\\\' | kw= '|' | kw= '?' )*
            loop10:
            do {
                int alt10=14;
                switch ( input.LA(1) ) {
                case RULE_ID:
                    {
                    alt10=1;
                    }
                    break;
                case RULE_STRING:
                    {
                    alt10=2;
                    }
                    break;
                case RULE_WS:
                    {
                    alt10=3;
                    }
                    break;
                case 26:
                    {
                    alt10=4;
                    }
                    break;
                case 23:
                    {
                    alt10=5;
                    }
                    break;
                case 27:
                    {
                    alt10=6;
                    }
                    break;
                case 28:
                    {
                    alt10=7;
                    }
                    break;
                case 29:
                    {
                    alt10=8;
                    }
                    break;
                case 20:
                    {
                    alt10=9;
                    }
                    break;
                case 30:
                    {
                    alt10=10;
                    }
                    break;
                case 31:
                    {
                    alt10=11;
                    }
                    break;
                case 32:
                    {
                    alt10=12;
                    }
                    break;
                case 33:
                    {
                    alt10=13;
                    }
                    break;

                }

                switch (alt10) {
            	case 1 :
            	    // InternalScanner.g:1027:4: this_ID_0= RULE_ID
            	    {
            	    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            	    				current.merge(this_ID_0);
            	    			

            	    				newLeafNode(this_ID_0, grammarAccess.getRuleDefinitionAccess().getIDTerminalRuleCall_0_0());
            	    			

            	    }
            	    break;
            	case 2 :
            	    // InternalScanner.g:1035:4: this_STRING_1= RULE_STRING
            	    {
            	    this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_15); 

            	    				current.merge(this_STRING_1);
            	    			

            	    				newLeafNode(this_STRING_1, grammarAccess.getRuleDefinitionAccess().getSTRINGTerminalRuleCall_0_1());
            	    			

            	    }
            	    break;
            	case 3 :
            	    // InternalScanner.g:1043:4: this_WS_2= RULE_WS
            	    {
            	    this_WS_2=(Token)match(input,RULE_WS,FOLLOW_15); 

            	    				current.merge(this_WS_2);
            	    			

            	    				newLeafNode(this_WS_2, grammarAccess.getRuleDefinitionAccess().getWSTerminalRuleCall_0_2());
            	    			

            	    }
            	    break;
            	case 4 :
            	    // InternalScanner.g:1051:4: kw= '+'
            	    {
            	    kw=(Token)match(input,26,FOLLOW_15); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getRuleDefinitionAccess().getPlusSignKeyword_0_3());
            	    			

            	    }
            	    break;
            	case 5 :
            	    // InternalScanner.g:1057:4: kw= '-'
            	    {
            	    kw=(Token)match(input,23,FOLLOW_15); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getRuleDefinitionAccess().getHyphenMinusKeyword_0_4());
            	    			

            	    }
            	    break;
            	case 6 :
            	    // InternalScanner.g:1063:4: kw= '('
            	    {
            	    kw=(Token)match(input,27,FOLLOW_15); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getRuleDefinitionAccess().getLeftParenthesisKeyword_0_5());
            	    			

            	    }
            	    break;
            	case 7 :
            	    // InternalScanner.g:1069:4: kw= ')'
            	    {
            	    kw=(Token)match(input,28,FOLLOW_15); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getRuleDefinitionAccess().getRightParenthesisKeyword_0_6());
            	    			

            	    }
            	    break;
            	case 8 :
            	    // InternalScanner.g:1075:4: kw= '*'
            	    {
            	    kw=(Token)match(input,29,FOLLOW_15); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getRuleDefinitionAccess().getAsteriskKeyword_0_7());
            	    			

            	    }
            	    break;
            	case 9 :
            	    // InternalScanner.g:1081:4: kw= '.'
            	    {
            	    kw=(Token)match(input,20,FOLLOW_15); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getRuleDefinitionAccess().getFullStopKeyword_0_8());
            	    			

            	    }
            	    break;
            	case 10 :
            	    // InternalScanner.g:1087:4: kw= '/'
            	    {
            	    kw=(Token)match(input,30,FOLLOW_15); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getRuleDefinitionAccess().getSolidusKeyword_0_9());
            	    			

            	    }
            	    break;
            	case 11 :
            	    // InternalScanner.g:1093:4: kw= '\\\\'
            	    {
            	    kw=(Token)match(input,31,FOLLOW_15); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getRuleDefinitionAccess().getReverseSolidusKeyword_0_10());
            	    			

            	    }
            	    break;
            	case 12 :
            	    // InternalScanner.g:1099:4: kw= '|'
            	    {
            	    kw=(Token)match(input,32,FOLLOW_15); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getRuleDefinitionAccess().getVerticalLineKeyword_0_11());
            	    			

            	    }
            	    break;
            	case 13 :
            	    // InternalScanner.g:1105:4: kw= '?'
            	    {
            	    kw=(Token)match(input,33,FOLLOW_15); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getRuleDefinitionAccess().getQuestionMarkKeyword_0_12());
            	    			

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            kw=(Token)match(input,34,FOLLOW_2); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getRuleDefinitionAccess().getColonKeyword_1());
            		

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
    // $ANTLR end "ruleRuleDefinition"


    // $ANTLR start "entryRuleRuleStart"
    // InternalScanner.g:1120:1: entryRuleRuleStart returns [EObject current=null] : iv_ruleRuleStart= ruleRuleStart EOF ;
    public final EObject entryRuleRuleStart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRuleStart = null;


        try {
            // InternalScanner.g:1120:50: (iv_ruleRuleStart= ruleRuleStart EOF )
            // InternalScanner.g:1121:2: iv_ruleRuleStart= ruleRuleStart EOF
            {
             newCompositeNode(grammarAccess.getRuleStartRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRuleStart=ruleRuleStart();

            state._fsp--;

             current =iv_ruleRuleStart; 
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
    // $ANTLR end "entryRuleRuleStart"


    // $ANTLR start "ruleRuleStart"
    // InternalScanner.g:1127:1: ruleRuleStart returns [EObject current=null] : ( (otherlv_0= 'NOT' | otherlv_1= '-' )? otherlv_2= '#' ( ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* ) | otherlv_6= 'STD' | otherlv_7= '*' ) otherlv_8= '#' ) ;
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
            // InternalScanner.g:1133:2: ( ( (otherlv_0= 'NOT' | otherlv_1= '-' )? otherlv_2= '#' ( ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* ) | otherlv_6= 'STD' | otherlv_7= '*' ) otherlv_8= '#' ) )
            // InternalScanner.g:1134:2: ( (otherlv_0= 'NOT' | otherlv_1= '-' )? otherlv_2= '#' ( ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* ) | otherlv_6= 'STD' | otherlv_7= '*' ) otherlv_8= '#' )
            {
            // InternalScanner.g:1134:2: ( (otherlv_0= 'NOT' | otherlv_1= '-' )? otherlv_2= '#' ( ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* ) | otherlv_6= 'STD' | otherlv_7= '*' ) otherlv_8= '#' )
            // InternalScanner.g:1135:3: (otherlv_0= 'NOT' | otherlv_1= '-' )? otherlv_2= '#' ( ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* ) | otherlv_6= 'STD' | otherlv_7= '*' ) otherlv_8= '#'
            {
            // InternalScanner.g:1135:3: (otherlv_0= 'NOT' | otherlv_1= '-' )?
            int alt11=3;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==35) ) {
                alt11=1;
            }
            else if ( (LA11_0==23) ) {
                alt11=2;
            }
            switch (alt11) {
                case 1 :
                    // InternalScanner.g:1136:4: otherlv_0= 'NOT'
                    {
                    otherlv_0=(Token)match(input,35,FOLLOW_16); 

                    				newLeafNode(otherlv_0, grammarAccess.getRuleStartAccess().getNOTKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalScanner.g:1141:4: otherlv_1= '-'
                    {
                    otherlv_1=(Token)match(input,23,FOLLOW_16); 

                    				newLeafNode(otherlv_1, grammarAccess.getRuleStartAccess().getHyphenMinusKeyword_0_1());
                    			

                    }
                    break;

            }

            otherlv_2=(Token)match(input,36,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getRuleStartAccess().getNumberSignKeyword_1());
            		
            // InternalScanner.g:1150:3: ( ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* ) | otherlv_6= 'STD' | otherlv_7= '*' )
            int alt13=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt13=1;
                }
                break;
            case 37:
                {
                alt13=2;
                }
                break;
            case 29:
                {
                alt13=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalScanner.g:1151:4: ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )
                    {
                    // InternalScanner.g:1151:4: ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )
                    // InternalScanner.g:1152:5: ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )*
                    {
                    // InternalScanner.g:1152:5: ( (otherlv_3= RULE_ID ) )
                    // InternalScanner.g:1153:6: (otherlv_3= RULE_ID )
                    {
                    // InternalScanner.g:1153:6: (otherlv_3= RULE_ID )
                    // InternalScanner.g:1154:7: otherlv_3= RULE_ID
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getRuleStartRule());
                    							}
                    						
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_18); 

                    							newLeafNode(otherlv_3, grammarAccess.getRuleStartAccess().getStateStartStateCrossReference_2_0_0_0());
                    						

                    }


                    }

                    // InternalScanner.g:1165:5: (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==22) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalScanner.g:1166:6: otherlv_4= ',' ( (otherlv_5= RULE_ID ) )
                    	    {
                    	    otherlv_4=(Token)match(input,22,FOLLOW_5); 

                    	    						newLeafNode(otherlv_4, grammarAccess.getRuleStartAccess().getCommaKeyword_2_0_1_0());
                    	    					
                    	    // InternalScanner.g:1170:6: ( (otherlv_5= RULE_ID ) )
                    	    // InternalScanner.g:1171:7: (otherlv_5= RULE_ID )
                    	    {
                    	    // InternalScanner.g:1171:7: (otherlv_5= RULE_ID )
                    	    // InternalScanner.g:1172:8: otherlv_5= RULE_ID
                    	    {

                    	    								if (current==null) {
                    	    									current = createModelElement(grammarAccess.getRuleStartRule());
                    	    								}
                    	    							
                    	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_18); 

                    	    								newLeafNode(otherlv_5, grammarAccess.getRuleStartAccess().getStateStartStateCrossReference_2_0_1_1_0());
                    	    							

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
                    break;
                case 2 :
                    // InternalScanner.g:1186:4: otherlv_6= 'STD'
                    {
                    otherlv_6=(Token)match(input,37,FOLLOW_16); 

                    				newLeafNode(otherlv_6, grammarAccess.getRuleStartAccess().getSTDKeyword_2_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalScanner.g:1191:4: otherlv_7= '*'
                    {
                    otherlv_7=(Token)match(input,29,FOLLOW_16); 

                    				newLeafNode(otherlv_7, grammarAccess.getRuleStartAccess().getAsteriskKeyword_2_2());
                    			

                    }
                    break;

            }

            otherlv_8=(Token)match(input,36,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getRuleStartAccess().getNumberSignKeyword_3());
            		

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
    // $ANTLR end "ruleRuleStart"

    // Delegated rules


    protected DFA1 dfa1 = new DFA1(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\1\1\11\uffff";
    static final String dfa_3s = "\1\15\11\uffff";
    static final String dfa_4s = "\1\31\11\uffff";
    static final String dfa_5s = "\1\uffff\1\11\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10";
    static final String dfa_6s = "\1\0\11\uffff}>";
    static final String[] dfa_7s = {
            "\1\2\1\3\1\4\1\5\1\6\1\7\2\uffff\1\10\2\uffff\2\11",
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

                        else if ( LA1_0 == 13 && getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_1(), 0) ) {s = 2;}

                        else if ( LA1_0 == 14 && getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_1(), 1) ) {s = 3;}

                        else if ( LA1_0 == 15 && getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_1(), 2) ) {s = 4;}

                        else if ( LA1_0 == 16 && getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_1(), 3) ) {s = 5;}

                        else if ( LA1_0 == 17 && getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_1(), 4) ) {s = 6;}

                        else if ( LA1_0 == 18 && getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_1(), 5) ) {s = 7;}

                        else if ( LA1_0 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_1(), 6) ) {s = 8;}

                        else if ( LA1_0 >= 24 && LA1_0 <= 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_1(), 7) ) {s = 9;}

                         
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000000327E000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000327E002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000C00002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000001FFC9000E2L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000001FFC9000E0L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00000007FC9000E0L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000002020000020L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000001000400000L});

}
