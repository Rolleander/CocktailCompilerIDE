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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'SCANNER'", "'EXPORT {'", "'}'", "'GLOBAL {'", "'LOCAL {'", "'DEFAULT {'", "'EOF {'", "'DEFINE'", "'='", "'START'", "','", "'RULE'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
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
    public String getGrammarFileName() { return "../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g"; }



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
    // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:68:2: (iv_ruleModel= ruleModel EOF )
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:69:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); 

            }

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
    // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:76:1: ruleModel returns [EObject current=null] : ( ( (lv_scanner_0_0= ruleTitle ) ) ( (lv_scanner_1_0= ruleExport ) ) ( (lv_scanner_2_0= ruleGlobal ) ) ( (lv_scanner_3_0= ruleLocal ) ) ( (lv_scanner_4_0= ruleDefault ) ) ( (lv_scanner_5_0= ruleEof ) ) ( (lv_scanner_6_0= ruleDefine ) ) ( (lv_scanner_7_0= ruleStartStates ) ) ( (lv_scanner_8_0= ruleRule ) ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_scanner_0_0 = null;

        EObject lv_scanner_1_0 = null;

        EObject lv_scanner_2_0 = null;

        EObject lv_scanner_3_0 = null;

        EObject lv_scanner_4_0 = null;

        EObject lv_scanner_5_0 = null;

        EObject lv_scanner_6_0 = null;

        EObject lv_scanner_7_0 = null;

        EObject lv_scanner_8_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:79:28: ( ( ( (lv_scanner_0_0= ruleTitle ) ) ( (lv_scanner_1_0= ruleExport ) ) ( (lv_scanner_2_0= ruleGlobal ) ) ( (lv_scanner_3_0= ruleLocal ) ) ( (lv_scanner_4_0= ruleDefault ) ) ( (lv_scanner_5_0= ruleEof ) ) ( (lv_scanner_6_0= ruleDefine ) ) ( (lv_scanner_7_0= ruleStartStates ) ) ( (lv_scanner_8_0= ruleRule ) ) ) )
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:80:1: ( ( (lv_scanner_0_0= ruleTitle ) ) ( (lv_scanner_1_0= ruleExport ) ) ( (lv_scanner_2_0= ruleGlobal ) ) ( (lv_scanner_3_0= ruleLocal ) ) ( (lv_scanner_4_0= ruleDefault ) ) ( (lv_scanner_5_0= ruleEof ) ) ( (lv_scanner_6_0= ruleDefine ) ) ( (lv_scanner_7_0= ruleStartStates ) ) ( (lv_scanner_8_0= ruleRule ) ) )
            {
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:80:1: ( ( (lv_scanner_0_0= ruleTitle ) ) ( (lv_scanner_1_0= ruleExport ) ) ( (lv_scanner_2_0= ruleGlobal ) ) ( (lv_scanner_3_0= ruleLocal ) ) ( (lv_scanner_4_0= ruleDefault ) ) ( (lv_scanner_5_0= ruleEof ) ) ( (lv_scanner_6_0= ruleDefine ) ) ( (lv_scanner_7_0= ruleStartStates ) ) ( (lv_scanner_8_0= ruleRule ) ) )
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:80:2: ( (lv_scanner_0_0= ruleTitle ) ) ( (lv_scanner_1_0= ruleExport ) ) ( (lv_scanner_2_0= ruleGlobal ) ) ( (lv_scanner_3_0= ruleLocal ) ) ( (lv_scanner_4_0= ruleDefault ) ) ( (lv_scanner_5_0= ruleEof ) ) ( (lv_scanner_6_0= ruleDefine ) ) ( (lv_scanner_7_0= ruleStartStates ) ) ( (lv_scanner_8_0= ruleRule ) )
            {
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:80:2: ( (lv_scanner_0_0= ruleTitle ) )
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:81:1: (lv_scanner_0_0= ruleTitle )
            {
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:81:1: (lv_scanner_0_0= ruleTitle )
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:82:3: lv_scanner_0_0= ruleTitle
            {
             
            	        newCompositeNode(grammarAccess.getModelAccess().getScannerTitleParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleTitle_in_ruleModel131);
            lv_scanner_0_0=ruleTitle();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getModelRule());
            	        }
                   		add(
                   			current, 
                   			"scanner",
                    		lv_scanner_0_0, 
                    		"Title");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:98:2: ( (lv_scanner_1_0= ruleExport ) )
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:99:1: (lv_scanner_1_0= ruleExport )
            {
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:99:1: (lv_scanner_1_0= ruleExport )
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:100:3: lv_scanner_1_0= ruleExport
            {
             
            	        newCompositeNode(grammarAccess.getModelAccess().getScannerExportParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleExport_in_ruleModel152);
            lv_scanner_1_0=ruleExport();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getModelRule());
            	        }
                   		add(
                   			current, 
                   			"scanner",
                    		lv_scanner_1_0, 
                    		"Export");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:116:2: ( (lv_scanner_2_0= ruleGlobal ) )
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:117:1: (lv_scanner_2_0= ruleGlobal )
            {
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:117:1: (lv_scanner_2_0= ruleGlobal )
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:118:3: lv_scanner_2_0= ruleGlobal
            {
             
            	        newCompositeNode(grammarAccess.getModelAccess().getScannerGlobalParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleGlobal_in_ruleModel173);
            lv_scanner_2_0=ruleGlobal();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getModelRule());
            	        }
                   		add(
                   			current, 
                   			"scanner",
                    		lv_scanner_2_0, 
                    		"Global");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:134:2: ( (lv_scanner_3_0= ruleLocal ) )
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:135:1: (lv_scanner_3_0= ruleLocal )
            {
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:135:1: (lv_scanner_3_0= ruleLocal )
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:136:3: lv_scanner_3_0= ruleLocal
            {
             
            	        newCompositeNode(grammarAccess.getModelAccess().getScannerLocalParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleLocal_in_ruleModel194);
            lv_scanner_3_0=ruleLocal();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getModelRule());
            	        }
                   		add(
                   			current, 
                   			"scanner",
                    		lv_scanner_3_0, 
                    		"Local");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:152:2: ( (lv_scanner_4_0= ruleDefault ) )
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:153:1: (lv_scanner_4_0= ruleDefault )
            {
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:153:1: (lv_scanner_4_0= ruleDefault )
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:154:3: lv_scanner_4_0= ruleDefault
            {
             
            	        newCompositeNode(grammarAccess.getModelAccess().getScannerDefaultParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleDefault_in_ruleModel215);
            lv_scanner_4_0=ruleDefault();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getModelRule());
            	        }
                   		add(
                   			current, 
                   			"scanner",
                    		lv_scanner_4_0, 
                    		"Default");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:170:2: ( (lv_scanner_5_0= ruleEof ) )
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:171:1: (lv_scanner_5_0= ruleEof )
            {
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:171:1: (lv_scanner_5_0= ruleEof )
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:172:3: lv_scanner_5_0= ruleEof
            {
             
            	        newCompositeNode(grammarAccess.getModelAccess().getScannerEofParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleEof_in_ruleModel236);
            lv_scanner_5_0=ruleEof();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getModelRule());
            	        }
                   		add(
                   			current, 
                   			"scanner",
                    		lv_scanner_5_0, 
                    		"Eof");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:188:2: ( (lv_scanner_6_0= ruleDefine ) )
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:189:1: (lv_scanner_6_0= ruleDefine )
            {
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:189:1: (lv_scanner_6_0= ruleDefine )
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:190:3: lv_scanner_6_0= ruleDefine
            {
             
            	        newCompositeNode(grammarAccess.getModelAccess().getScannerDefineParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleDefine_in_ruleModel257);
            lv_scanner_6_0=ruleDefine();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getModelRule());
            	        }
                   		add(
                   			current, 
                   			"scanner",
                    		lv_scanner_6_0, 
                    		"Define");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:206:2: ( (lv_scanner_7_0= ruleStartStates ) )
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:207:1: (lv_scanner_7_0= ruleStartStates )
            {
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:207:1: (lv_scanner_7_0= ruleStartStates )
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:208:3: lv_scanner_7_0= ruleStartStates
            {
             
            	        newCompositeNode(grammarAccess.getModelAccess().getScannerStartStatesParserRuleCall_7_0()); 
            	    
            pushFollow(FOLLOW_ruleStartStates_in_ruleModel278);
            lv_scanner_7_0=ruleStartStates();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getModelRule());
            	        }
                   		add(
                   			current, 
                   			"scanner",
                    		lv_scanner_7_0, 
                    		"StartStates");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:224:2: ( (lv_scanner_8_0= ruleRule ) )
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:225:1: (lv_scanner_8_0= ruleRule )
            {
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:225:1: (lv_scanner_8_0= ruleRule )
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:226:3: lv_scanner_8_0= ruleRule
            {
             
            	        newCompositeNode(grammarAccess.getModelAccess().getScannerRuleParserRuleCall_8_0()); 
            	    
            pushFollow(FOLLOW_ruleRule_in_ruleModel299);
            lv_scanner_8_0=ruleRule();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getModelRule());
            	        }
                   		add(
                   			current, 
                   			"scanner",
                    		lv_scanner_8_0, 
                    		"Rule");
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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleTitle"
    // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:250:1: entryRuleTitle returns [EObject current=null] : iv_ruleTitle= ruleTitle EOF ;
    public final EObject entryRuleTitle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTitle = null;


        try {
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:251:2: (iv_ruleTitle= ruleTitle EOF )
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:252:2: iv_ruleTitle= ruleTitle EOF
            {
             newCompositeNode(grammarAccess.getTitleRule()); 
            pushFollow(FOLLOW_ruleTitle_in_entryRuleTitle335);
            iv_ruleTitle=ruleTitle();

            state._fsp--;

             current =iv_ruleTitle; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTitle345); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTitle"


    // $ANTLR start "ruleTitle"
    // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:259:1: ruleTitle returns [EObject current=null] : (otherlv_0= 'SCANNER' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleTitle() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:262:28: ( (otherlv_0= 'SCANNER' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:263:1: (otherlv_0= 'SCANNER' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:263:1: (otherlv_0= 'SCANNER' ( (lv_name_1_0= RULE_ID ) ) )
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:263:3: otherlv_0= 'SCANNER' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleTitle382); 

                	newLeafNode(otherlv_0, grammarAccess.getTitleAccess().getSCANNERKeyword_0());
                
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:267:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:268:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:268:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:269:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTitle399); 

            			newLeafNode(lv_name_1_0, grammarAccess.getTitleAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTitleRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

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
    // $ANTLR end "ruleTitle"


    // $ANTLR start "entryRuleExport"
    // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:293:1: entryRuleExport returns [EObject current=null] : iv_ruleExport= ruleExport EOF ;
    public final EObject entryRuleExport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExport = null;


        try {
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:294:2: (iv_ruleExport= ruleExport EOF )
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:295:2: iv_ruleExport= ruleExport EOF
            {
             newCompositeNode(grammarAccess.getExportRule()); 
            pushFollow(FOLLOW_ruleExport_in_entryRuleExport440);
            iv_ruleExport=ruleExport();

            state._fsp--;

             current =iv_ruleExport; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExport450); 

            }

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
    // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:302:1: ruleExport returns [EObject current=null] : (otherlv_0= 'EXPORT {' ( (lv_content_1_0= RULE_ID ) ) otherlv_2= '}' ) ;
    public final EObject ruleExport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_content_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:305:28: ( (otherlv_0= 'EXPORT {' ( (lv_content_1_0= RULE_ID ) ) otherlv_2= '}' ) )
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:306:1: (otherlv_0= 'EXPORT {' ( (lv_content_1_0= RULE_ID ) ) otherlv_2= '}' )
            {
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:306:1: (otherlv_0= 'EXPORT {' ( (lv_content_1_0= RULE_ID ) ) otherlv_2= '}' )
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:306:3: otherlv_0= 'EXPORT {' ( (lv_content_1_0= RULE_ID ) ) otherlv_2= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleExport487); 

                	newLeafNode(otherlv_0, grammarAccess.getExportAccess().getEXPORTKeyword_0());
                
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:310:1: ( (lv_content_1_0= RULE_ID ) )
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:311:1: (lv_content_1_0= RULE_ID )
            {
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:311:1: (lv_content_1_0= RULE_ID )
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:312:3: lv_content_1_0= RULE_ID
            {
            lv_content_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExport504); 

            			newLeafNode(lv_content_1_0, grammarAccess.getExportAccess().getContentIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getExportRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"content",
                    		lv_content_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleExport521); 

                	newLeafNode(otherlv_2, grammarAccess.getExportAccess().getRightCurlyBracketKeyword_2());
                

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
    // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:340:1: entryRuleGlobal returns [EObject current=null] : iv_ruleGlobal= ruleGlobal EOF ;
    public final EObject entryRuleGlobal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGlobal = null;


        try {
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:341:2: (iv_ruleGlobal= ruleGlobal EOF )
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:342:2: iv_ruleGlobal= ruleGlobal EOF
            {
             newCompositeNode(grammarAccess.getGlobalRule()); 
            pushFollow(FOLLOW_ruleGlobal_in_entryRuleGlobal557);
            iv_ruleGlobal=ruleGlobal();

            state._fsp--;

             current =iv_ruleGlobal; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGlobal567); 

            }

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
    // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:349:1: ruleGlobal returns [EObject current=null] : (otherlv_0= 'GLOBAL {' ( (lv_content_1_0= RULE_ID ) ) otherlv_2= '}' ) ;
    public final EObject ruleGlobal() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_content_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:352:28: ( (otherlv_0= 'GLOBAL {' ( (lv_content_1_0= RULE_ID ) ) otherlv_2= '}' ) )
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:353:1: (otherlv_0= 'GLOBAL {' ( (lv_content_1_0= RULE_ID ) ) otherlv_2= '}' )
            {
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:353:1: (otherlv_0= 'GLOBAL {' ( (lv_content_1_0= RULE_ID ) ) otherlv_2= '}' )
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:353:3: otherlv_0= 'GLOBAL {' ( (lv_content_1_0= RULE_ID ) ) otherlv_2= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleGlobal604); 

                	newLeafNode(otherlv_0, grammarAccess.getGlobalAccess().getGLOBALKeyword_0());
                
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:357:1: ( (lv_content_1_0= RULE_ID ) )
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:358:1: (lv_content_1_0= RULE_ID )
            {
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:358:1: (lv_content_1_0= RULE_ID )
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:359:3: lv_content_1_0= RULE_ID
            {
            lv_content_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGlobal621); 

            			newLeafNode(lv_content_1_0, grammarAccess.getGlobalAccess().getContentIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getGlobalRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"content",
                    		lv_content_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleGlobal638); 

                	newLeafNode(otherlv_2, grammarAccess.getGlobalAccess().getRightCurlyBracketKeyword_2());
                

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
    // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:387:1: entryRuleLocal returns [EObject current=null] : iv_ruleLocal= ruleLocal EOF ;
    public final EObject entryRuleLocal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocal = null;


        try {
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:388:2: (iv_ruleLocal= ruleLocal EOF )
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:389:2: iv_ruleLocal= ruleLocal EOF
            {
             newCompositeNode(grammarAccess.getLocalRule()); 
            pushFollow(FOLLOW_ruleLocal_in_entryRuleLocal674);
            iv_ruleLocal=ruleLocal();

            state._fsp--;

             current =iv_ruleLocal; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLocal684); 

            }

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
    // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:396:1: ruleLocal returns [EObject current=null] : (otherlv_0= 'LOCAL {' ( (lv_content_1_0= RULE_ID ) ) otherlv_2= '}' ) ;
    public final EObject ruleLocal() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_content_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:399:28: ( (otherlv_0= 'LOCAL {' ( (lv_content_1_0= RULE_ID ) ) otherlv_2= '}' ) )
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:400:1: (otherlv_0= 'LOCAL {' ( (lv_content_1_0= RULE_ID ) ) otherlv_2= '}' )
            {
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:400:1: (otherlv_0= 'LOCAL {' ( (lv_content_1_0= RULE_ID ) ) otherlv_2= '}' )
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:400:3: otherlv_0= 'LOCAL {' ( (lv_content_1_0= RULE_ID ) ) otherlv_2= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleLocal721); 

                	newLeafNode(otherlv_0, grammarAccess.getLocalAccess().getLOCALKeyword_0());
                
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:404:1: ( (lv_content_1_0= RULE_ID ) )
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:405:1: (lv_content_1_0= RULE_ID )
            {
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:405:1: (lv_content_1_0= RULE_ID )
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:406:3: lv_content_1_0= RULE_ID
            {
            lv_content_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLocal738); 

            			newLeafNode(lv_content_1_0, grammarAccess.getLocalAccess().getContentIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLocalRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"content",
                    		lv_content_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleLocal755); 

                	newLeafNode(otherlv_2, grammarAccess.getLocalAccess().getRightCurlyBracketKeyword_2());
                

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
    // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:434:1: entryRuleDefault returns [EObject current=null] : iv_ruleDefault= ruleDefault EOF ;
    public final EObject entryRuleDefault() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefault = null;


        try {
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:435:2: (iv_ruleDefault= ruleDefault EOF )
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:436:2: iv_ruleDefault= ruleDefault EOF
            {
             newCompositeNode(grammarAccess.getDefaultRule()); 
            pushFollow(FOLLOW_ruleDefault_in_entryRuleDefault791);
            iv_ruleDefault=ruleDefault();

            state._fsp--;

             current =iv_ruleDefault; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefault801); 

            }

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
    // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:443:1: ruleDefault returns [EObject current=null] : (otherlv_0= 'DEFAULT {' ( (lv_content_1_0= RULE_ID ) ) otherlv_2= '}' ) ;
    public final EObject ruleDefault() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_content_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:446:28: ( (otherlv_0= 'DEFAULT {' ( (lv_content_1_0= RULE_ID ) ) otherlv_2= '}' ) )
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:447:1: (otherlv_0= 'DEFAULT {' ( (lv_content_1_0= RULE_ID ) ) otherlv_2= '}' )
            {
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:447:1: (otherlv_0= 'DEFAULT {' ( (lv_content_1_0= RULE_ID ) ) otherlv_2= '}' )
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:447:3: otherlv_0= 'DEFAULT {' ( (lv_content_1_0= RULE_ID ) ) otherlv_2= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleDefault838); 

                	newLeafNode(otherlv_0, grammarAccess.getDefaultAccess().getDEFAULTKeyword_0());
                
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:451:1: ( (lv_content_1_0= RULE_ID ) )
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:452:1: (lv_content_1_0= RULE_ID )
            {
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:452:1: (lv_content_1_0= RULE_ID )
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:453:3: lv_content_1_0= RULE_ID
            {
            lv_content_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDefault855); 

            			newLeafNode(lv_content_1_0, grammarAccess.getDefaultAccess().getContentIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDefaultRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"content",
                    		lv_content_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleDefault872); 

                	newLeafNode(otherlv_2, grammarAccess.getDefaultAccess().getRightCurlyBracketKeyword_2());
                

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
    // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:481:1: entryRuleEof returns [EObject current=null] : iv_ruleEof= ruleEof EOF ;
    public final EObject entryRuleEof() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEof = null;


        try {
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:482:2: (iv_ruleEof= ruleEof EOF )
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:483:2: iv_ruleEof= ruleEof EOF
            {
             newCompositeNode(grammarAccess.getEofRule()); 
            pushFollow(FOLLOW_ruleEof_in_entryRuleEof908);
            iv_ruleEof=ruleEof();

            state._fsp--;

             current =iv_ruleEof; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEof918); 

            }

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
    // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:490:1: ruleEof returns [EObject current=null] : (otherlv_0= 'EOF {' ( (lv_content_1_0= RULE_ID ) ) otherlv_2= '}' ) ;
    public final EObject ruleEof() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_content_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:493:28: ( (otherlv_0= 'EOF {' ( (lv_content_1_0= RULE_ID ) ) otherlv_2= '}' ) )
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:494:1: (otherlv_0= 'EOF {' ( (lv_content_1_0= RULE_ID ) ) otherlv_2= '}' )
            {
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:494:1: (otherlv_0= 'EOF {' ( (lv_content_1_0= RULE_ID ) ) otherlv_2= '}' )
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:494:3: otherlv_0= 'EOF {' ( (lv_content_1_0= RULE_ID ) ) otherlv_2= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleEof955); 

                	newLeafNode(otherlv_0, grammarAccess.getEofAccess().getEOFKeyword_0());
                
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:498:1: ( (lv_content_1_0= RULE_ID ) )
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:499:1: (lv_content_1_0= RULE_ID )
            {
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:499:1: (lv_content_1_0= RULE_ID )
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:500:3: lv_content_1_0= RULE_ID
            {
            lv_content_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEof972); 

            			newLeafNode(lv_content_1_0, grammarAccess.getEofAccess().getContentIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEofRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"content",
                    		lv_content_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleEof989); 

                	newLeafNode(otherlv_2, grammarAccess.getEofAccess().getRightCurlyBracketKeyword_2());
                

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
    // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:528:1: entryRuleDefine returns [EObject current=null] : iv_ruleDefine= ruleDefine EOF ;
    public final EObject entryRuleDefine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefine = null;


        try {
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:529:2: (iv_ruleDefine= ruleDefine EOF )
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:530:2: iv_ruleDefine= ruleDefine EOF
            {
             newCompositeNode(grammarAccess.getDefineRule()); 
            pushFollow(FOLLOW_ruleDefine_in_entryRuleDefine1025);
            iv_ruleDefine=ruleDefine();

            state._fsp--;

             current =iv_ruleDefine; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefine1035); 

            }

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
    // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:537:1: ruleDefine returns [EObject current=null] : (otherlv_0= 'DEFINE' ( (lv_defines_1_0= ruleDefineRule ) )+ ) ;
    public final EObject ruleDefine() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_defines_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:540:28: ( (otherlv_0= 'DEFINE' ( (lv_defines_1_0= ruleDefineRule ) )+ ) )
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:541:1: (otherlv_0= 'DEFINE' ( (lv_defines_1_0= ruleDefineRule ) )+ )
            {
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:541:1: (otherlv_0= 'DEFINE' ( (lv_defines_1_0= ruleDefineRule ) )+ )
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:541:3: otherlv_0= 'DEFINE' ( (lv_defines_1_0= ruleDefineRule ) )+
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleDefine1072); 

                	newLeafNode(otherlv_0, grammarAccess.getDefineAccess().getDEFINEKeyword_0());
                
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:545:1: ( (lv_defines_1_0= ruleDefineRule ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:546:1: (lv_defines_1_0= ruleDefineRule )
            	    {
            	    // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:546:1: (lv_defines_1_0= ruleDefineRule )
            	    // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:547:3: lv_defines_1_0= ruleDefineRule
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDefineAccess().getDefinesDefineRuleParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDefineRule_in_ruleDefine1093);
            	    lv_defines_1_0=ruleDefineRule();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDefineRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"defines",
            	            		lv_defines_1_0, 
            	            		"DefineRule");
            	    	        afterParserOrEnumRuleCall();
            	    	    

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
    // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:571:1: entryRuleDefineRule returns [EObject current=null] : iv_ruleDefineRule= ruleDefineRule EOF ;
    public final EObject entryRuleDefineRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefineRule = null;


        try {
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:572:2: (iv_ruleDefineRule= ruleDefineRule EOF )
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:573:2: iv_ruleDefineRule= ruleDefineRule EOF
            {
             newCompositeNode(grammarAccess.getDefineRuleRule()); 
            pushFollow(FOLLOW_ruleDefineRule_in_entryRuleDefineRule1130);
            iv_ruleDefineRule=ruleDefineRule();

            state._fsp--;

             current =iv_ruleDefineRule; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefineRule1140); 

            }

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
    // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:580:1: ruleDefineRule returns [EObject current=null] : ( ( (lv_defineName_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_defineRule_2_0= RULE_ID ) ) ) ;
    public final EObject ruleDefineRule() throws RecognitionException {
        EObject current = null;

        Token lv_defineName_0_0=null;
        Token otherlv_1=null;
        Token lv_defineRule_2_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:583:28: ( ( ( (lv_defineName_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_defineRule_2_0= RULE_ID ) ) ) )
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:584:1: ( ( (lv_defineName_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_defineRule_2_0= RULE_ID ) ) )
            {
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:584:1: ( ( (lv_defineName_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_defineRule_2_0= RULE_ID ) ) )
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:584:2: ( (lv_defineName_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_defineRule_2_0= RULE_ID ) )
            {
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:584:2: ( (lv_defineName_0_0= RULE_ID ) )
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:585:1: (lv_defineName_0_0= RULE_ID )
            {
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:585:1: (lv_defineName_0_0= RULE_ID )
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:586:3: lv_defineName_0_0= RULE_ID
            {
            lv_defineName_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDefineRule1182); 

            			newLeafNode(lv_defineName_0_0, grammarAccess.getDefineRuleAccess().getDefineNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDefineRuleRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"defineName",
                    		lv_defineName_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleDefineRule1199); 

                	newLeafNode(otherlv_1, grammarAccess.getDefineRuleAccess().getEqualsSignKeyword_1());
                
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:606:1: ( (lv_defineRule_2_0= RULE_ID ) )
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:607:1: (lv_defineRule_2_0= RULE_ID )
            {
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:607:1: (lv_defineRule_2_0= RULE_ID )
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:608:3: lv_defineRule_2_0= RULE_ID
            {
            lv_defineRule_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDefineRule1216); 

            			newLeafNode(lv_defineRule_2_0, grammarAccess.getDefineRuleAccess().getDefineRuleIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDefineRuleRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"defineRule",
                    		lv_defineRule_2_0, 
                    		"ID");
            	    

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
    // $ANTLR end "ruleDefineRule"


    // $ANTLR start "entryRuleStartStates"
    // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:632:1: entryRuleStartStates returns [EObject current=null] : iv_ruleStartStates= ruleStartStates EOF ;
    public final EObject entryRuleStartStates() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStartStates = null;


        try {
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:633:2: (iv_ruleStartStates= ruleStartStates EOF )
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:634:2: iv_ruleStartStates= ruleStartStates EOF
            {
             newCompositeNode(grammarAccess.getStartStatesRule()); 
            pushFollow(FOLLOW_ruleStartStates_in_entryRuleStartStates1257);
            iv_ruleStartStates=ruleStartStates();

            state._fsp--;

             current =iv_ruleStartStates; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStartStates1267); 

            }

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
    // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:641:1: ruleStartStates returns [EObject current=null] : (otherlv_0= 'START' ( (lv_states_1_0= RULE_ID ) ) (otherlv_2= ',' this_ID_3= RULE_ID )* ) ;
    public final EObject ruleStartStates() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_states_1_0=null;
        Token otherlv_2=null;
        Token this_ID_3=null;

         enterRule(); 
            
        try {
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:644:28: ( (otherlv_0= 'START' ( (lv_states_1_0= RULE_ID ) ) (otherlv_2= ',' this_ID_3= RULE_ID )* ) )
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:645:1: (otherlv_0= 'START' ( (lv_states_1_0= RULE_ID ) ) (otherlv_2= ',' this_ID_3= RULE_ID )* )
            {
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:645:1: (otherlv_0= 'START' ( (lv_states_1_0= RULE_ID ) ) (otherlv_2= ',' this_ID_3= RULE_ID )* )
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:645:3: otherlv_0= 'START' ( (lv_states_1_0= RULE_ID ) ) (otherlv_2= ',' this_ID_3= RULE_ID )*
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleStartStates1304); 

                	newLeafNode(otherlv_0, grammarAccess.getStartStatesAccess().getSTARTKeyword_0());
                
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:649:1: ( (lv_states_1_0= RULE_ID ) )
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:650:1: (lv_states_1_0= RULE_ID )
            {
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:650:1: (lv_states_1_0= RULE_ID )
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:651:3: lv_states_1_0= RULE_ID
            {
            lv_states_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStartStates1321); 

            			newLeafNode(lv_states_1_0, grammarAccess.getStartStatesAccess().getStatesIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStartStatesRule());
            	        }
                   		addWithLastConsumed(
                   			current, 
                   			"states",
                    		lv_states_1_0, 
                    		"ID");
            	    

            }


            }

            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:667:2: (otherlv_2= ',' this_ID_3= RULE_ID )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==21) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:667:4: otherlv_2= ',' this_ID_3= RULE_ID
            	    {
            	    otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleStartStates1339); 

            	        	newLeafNode(otherlv_2, grammarAccess.getStartStatesAccess().getCommaKeyword_2_0());
            	        
            	    this_ID_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStartStates1350); 
            	     
            	        newLeafNode(this_ID_3, grammarAccess.getStartStatesAccess().getIDTerminalRuleCall_2_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop2;
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
    // $ANTLR end "ruleStartStates"


    // $ANTLR start "entryRuleRule"
    // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:683:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:684:2: (iv_ruleRule= ruleRule EOF )
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:685:2: iv_ruleRule= ruleRule EOF
            {
             newCompositeNode(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_ruleRule_in_entryRuleRule1387);
            iv_ruleRule=ruleRule();

            state._fsp--;

             current =iv_ruleRule; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRule1397); 

            }

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
    // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:692:1: ruleRule returns [EObject current=null] : (otherlv_0= 'RULE' ( (lv_content_1_0= RULE_ID ) ) ) ;
    public final EObject ruleRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_content_1_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:695:28: ( (otherlv_0= 'RULE' ( (lv_content_1_0= RULE_ID ) ) ) )
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:696:1: (otherlv_0= 'RULE' ( (lv_content_1_0= RULE_ID ) ) )
            {
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:696:1: (otherlv_0= 'RULE' ( (lv_content_1_0= RULE_ID ) ) )
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:696:3: otherlv_0= 'RULE' ( (lv_content_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleRule1434); 

                	newLeafNode(otherlv_0, grammarAccess.getRuleAccess().getRULEKeyword_0());
                
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:700:1: ( (lv_content_1_0= RULE_ID ) )
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:701:1: (lv_content_1_0= RULE_ID )
            {
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:701:1: (lv_content_1_0= RULE_ID )
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:702:3: lv_content_1_0= RULE_ID
            {
            lv_content_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRule1451); 

            			newLeafNode(lv_content_1_0, grammarAccess.getRuleAccess().getContentIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRuleRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"content",
                    		lv_content_1_0, 
                    		"ID");
            	    

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
    // $ANTLR end "ruleRule"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTitle_in_ruleModel131 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ruleExport_in_ruleModel152 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ruleGlobal_in_ruleModel173 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ruleLocal_in_ruleModel194 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ruleDefault_in_ruleModel215 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ruleEof_in_ruleModel236 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ruleDefine_in_ruleModel257 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ruleStartStates_in_ruleModel278 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_ruleRule_in_ruleModel299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTitle_in_entryRuleTitle335 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTitle345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleTitle382 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTitle399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExport_in_entryRuleExport440 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExport450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleExport487 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExport504 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleExport521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGlobal_in_entryRuleGlobal557 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGlobal567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleGlobal604 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGlobal621 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleGlobal638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocal_in_entryRuleLocal674 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLocal684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleLocal721 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLocal738 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleLocal755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefault_in_entryRuleDefault791 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefault801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleDefault838 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDefault855 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleDefault872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEof_in_entryRuleEof908 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEof918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleEof955 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEof972 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleEof989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefine_in_entryRuleDefine1025 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefine1035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleDefine1072 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleDefineRule_in_ruleDefine1093 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleDefineRule_in_entryRuleDefineRule1130 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefineRule1140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDefineRule1182 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleDefineRule1199 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDefineRule1216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStartStates_in_entryRuleStartStates1257 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStartStates1267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleStartStates1304 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStartStates1321 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_ruleStartStates1339 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStartStates1350 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_ruleRule_in_entryRuleRule1387 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRule1397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleRule1434 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRule1451 = new BitSet(new long[]{0x0000000000000002L});

}