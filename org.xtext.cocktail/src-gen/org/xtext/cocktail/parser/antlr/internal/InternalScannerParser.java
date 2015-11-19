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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_CHAR", "RULE_WS", "RULE_ANY_OTHER", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "'SCANNER'", "'EXPORT {'", "'}'", "'GLOBAL {'", "'LOCAL {'", "'DEFAULT {'", "'EOF {'", "'DEFINE'", "'='", "'START'", "','", "'RULE'", "'#STD#'", "': {'", "'+'", "'*'", "'('", "')'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=11;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int RULE_CHAR=6;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=7;
    public static final int RULE_ANY_OTHER=8;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=9;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=10;
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
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleTitle382); 

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
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleExport487); 

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

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleExport521); 

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
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleGlobal604); 

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

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleGlobal638); 

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
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleLocal721); 

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

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleLocal755); 

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
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleDefault838); 

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

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleDefault872); 

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
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleEof955); 

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

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleEof989); 

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
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleDefine1072); 

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

            otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleDefineRule1199); 

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
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleStartStates1304); 

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

                if ( (LA2_0==22) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:667:4: otherlv_2= ',' this_ID_3= RULE_ID
            	    {
            	    otherlv_2=(Token)match(input,22,FOLLOW_22_in_ruleStartStates1339); 

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
    // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:692:1: ruleRule returns [EObject current=null] : (otherlv_0= 'RULE' ( (lv_content_1_0= ruleSingleRule ) )* ) ;
    public final EObject ruleRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_content_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:695:28: ( (otherlv_0= 'RULE' ( (lv_content_1_0= ruleSingleRule ) )* ) )
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:696:1: (otherlv_0= 'RULE' ( (lv_content_1_0= ruleSingleRule ) )* )
            {
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:696:1: (otherlv_0= 'RULE' ( (lv_content_1_0= ruleSingleRule ) )* )
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:696:3: otherlv_0= 'RULE' ( (lv_content_1_0= ruleSingleRule ) )*
            {
            otherlv_0=(Token)match(input,23,FOLLOW_23_in_ruleRule1434); 

                	newLeafNode(otherlv_0, grammarAccess.getRuleAccess().getRULEKeyword_0());
                
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:700:1: ( (lv_content_1_0= ruleSingleRule ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==24) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:701:1: (lv_content_1_0= ruleSingleRule )
            	    {
            	    // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:701:1: (lv_content_1_0= ruleSingleRule )
            	    // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:702:3: lv_content_1_0= ruleSingleRule
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRuleAccess().getContentSingleRuleParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSingleRule_in_ruleRule1455);
            	    lv_content_1_0=ruleSingleRule();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRuleRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"content",
            	            		lv_content_1_0, 
            	            		"SingleRule");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
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
    // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:726:1: entryRuleSingleRule returns [String current=null] : iv_ruleSingleRule= ruleSingleRule EOF ;
    public final String entryRuleSingleRule() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSingleRule = null;


        try {
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:727:2: (iv_ruleSingleRule= ruleSingleRule EOF )
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:728:2: iv_ruleSingleRule= ruleSingleRule EOF
            {
             newCompositeNode(grammarAccess.getSingleRuleRule()); 
            pushFollow(FOLLOW_ruleSingleRule_in_entryRuleSingleRule1493);
            iv_ruleSingleRule=ruleSingleRule();

            state._fsp--;

             current =iv_ruleSingleRule.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSingleRule1504); 

            }

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
    // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:735:1: ruleSingleRule returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '#STD#' this_STRING_1= RULE_STRING kw= ': {' this_STRING_3= RULE_STRING kw= '}' ) ;
    public final AntlrDatatypeRuleToken ruleSingleRule() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_STRING_1=null;
        Token this_STRING_3=null;

         enterRule(); 
            
        try {
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:738:28: ( (kw= '#STD#' this_STRING_1= RULE_STRING kw= ': {' this_STRING_3= RULE_STRING kw= '}' ) )
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:739:1: (kw= '#STD#' this_STRING_1= RULE_STRING kw= ': {' this_STRING_3= RULE_STRING kw= '}' )
            {
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:739:1: (kw= '#STD#' this_STRING_1= RULE_STRING kw= ': {' this_STRING_3= RULE_STRING kw= '}' )
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:740:2: kw= '#STD#' this_STRING_1= RULE_STRING kw= ': {' this_STRING_3= RULE_STRING kw= '}'
            {
            kw=(Token)match(input,24,FOLLOW_24_in_ruleSingleRule1542); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getSingleRuleAccess().getSTDKeyword_0()); 
                
            this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSingleRule1557); 

            		current.merge(this_STRING_1);
                
             
                newLeafNode(this_STRING_1, grammarAccess.getSingleRuleAccess().getSTRINGTerminalRuleCall_1()); 
                
            kw=(Token)match(input,25,FOLLOW_25_in_ruleSingleRule1575); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getSingleRuleAccess().getColonSpaceLeftCurlyBracketKeyword_2()); 
                
            this_STRING_3=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSingleRule1590); 

            		current.merge(this_STRING_3);
                
             
                newLeafNode(this_STRING_3, grammarAccess.getSingleRuleAccess().getSTRINGTerminalRuleCall_3()); 
                
            kw=(Token)match(input,14,FOLLOW_14_in_ruleSingleRule1608); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getSingleRuleAccess().getRightCurlyBracketKeyword_4()); 
                

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


    // $ANTLR start "entryRuleRegularExpression"
    // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:779:1: entryRuleRegularExpression returns [EObject current=null] : iv_ruleRegularExpression= ruleRegularExpression EOF ;
    public final EObject entryRuleRegularExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegularExpression = null;


        try {
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:780:2: (iv_ruleRegularExpression= ruleRegularExpression EOF )
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:781:2: iv_ruleRegularExpression= ruleRegularExpression EOF
            {
             newCompositeNode(grammarAccess.getRegularExpressionRule()); 
            pushFollow(FOLLOW_ruleRegularExpression_in_entryRuleRegularExpression1648);
            iv_ruleRegularExpression=ruleRegularExpression();

            state._fsp--;

             current =iv_ruleRegularExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRegularExpression1658); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRegularExpression"


    // $ANTLR start "ruleRegularExpression"
    // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:788:1: ruleRegularExpression returns [EObject current=null] : this_OrExpression_0= ruleOrExpression ;
    public final EObject ruleRegularExpression() throws RecognitionException {
        EObject current = null;

        EObject this_OrExpression_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:791:28: (this_OrExpression_0= ruleOrExpression )
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:793:5: this_OrExpression_0= ruleOrExpression
            {
             
                    newCompositeNode(grammarAccess.getRegularExpressionAccess().getOrExpressionParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleOrExpression_in_ruleRegularExpression1704);
            this_OrExpression_0=ruleOrExpression();

            state._fsp--;

             
                    current = this_OrExpression_0; 
                    afterParserOrEnumRuleCall();
                

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
    // $ANTLR end "ruleRegularExpression"


    // $ANTLR start "entryRuleOrExpression"
    // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:809:1: entryRuleOrExpression returns [EObject current=null] : iv_ruleOrExpression= ruleOrExpression EOF ;
    public final EObject entryRuleOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrExpression = null;


        try {
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:810:2: (iv_ruleOrExpression= ruleOrExpression EOF )
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:811:2: iv_ruleOrExpression= ruleOrExpression EOF
            {
             newCompositeNode(grammarAccess.getOrExpressionRule()); 
            pushFollow(FOLLOW_ruleOrExpression_in_entryRuleOrExpression1738);
            iv_ruleOrExpression=ruleOrExpression();

            state._fsp--;

             current =iv_ruleOrExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrExpression1748); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOrExpression"


    // $ANTLR start "ruleOrExpression"
    // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:818:1: ruleOrExpression returns [EObject current=null] : (this_SequenceExpression_0= ruleSequenceExpression ( () otherlv_2= '+' ( (lv_right_3_0= ruleSequenceExpression ) ) )* ) ;
    public final EObject ruleOrExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_SequenceExpression_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:821:28: ( (this_SequenceExpression_0= ruleSequenceExpression ( () otherlv_2= '+' ( (lv_right_3_0= ruleSequenceExpression ) ) )* ) )
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:822:1: (this_SequenceExpression_0= ruleSequenceExpression ( () otherlv_2= '+' ( (lv_right_3_0= ruleSequenceExpression ) ) )* )
            {
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:822:1: (this_SequenceExpression_0= ruleSequenceExpression ( () otherlv_2= '+' ( (lv_right_3_0= ruleSequenceExpression ) ) )* )
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:823:5: this_SequenceExpression_0= ruleSequenceExpression ( () otherlv_2= '+' ( (lv_right_3_0= ruleSequenceExpression ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getOrExpressionAccess().getSequenceExpressionParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleSequenceExpression_in_ruleOrExpression1795);
            this_SequenceExpression_0=ruleSequenceExpression();

            state._fsp--;

             
                    current = this_SequenceExpression_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:831:1: ( () otherlv_2= '+' ( (lv_right_3_0= ruleSequenceExpression ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==26) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:831:2: () otherlv_2= '+' ( (lv_right_3_0= ruleSequenceExpression ) )
            	    {
            	    // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:831:2: ()
            	    // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:832:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getOrExpressionAccess().getOrExpressionLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,26,FOLLOW_26_in_ruleOrExpression1816); 

            	        	newLeafNode(otherlv_2, grammarAccess.getOrExpressionAccess().getPlusSignKeyword_1_1());
            	        
            	    // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:841:1: ( (lv_right_3_0= ruleSequenceExpression ) )
            	    // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:842:1: (lv_right_3_0= ruleSequenceExpression )
            	    {
            	    // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:842:1: (lv_right_3_0= ruleSequenceExpression )
            	    // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:843:3: lv_right_3_0= ruleSequenceExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getOrExpressionAccess().getRightSequenceExpressionParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSequenceExpression_in_ruleOrExpression1837);
            	    lv_right_3_0=ruleSequenceExpression();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getOrExpressionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"SequenceExpression");
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
    // $ANTLR end "ruleOrExpression"


    // $ANTLR start "entryRuleSequenceExpression"
    // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:867:1: entryRuleSequenceExpression returns [EObject current=null] : iv_ruleSequenceExpression= ruleSequenceExpression EOF ;
    public final EObject entryRuleSequenceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSequenceExpression = null;


        try {
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:868:2: (iv_ruleSequenceExpression= ruleSequenceExpression EOF )
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:869:2: iv_ruleSequenceExpression= ruleSequenceExpression EOF
            {
             newCompositeNode(grammarAccess.getSequenceExpressionRule()); 
            pushFollow(FOLLOW_ruleSequenceExpression_in_entryRuleSequenceExpression1875);
            iv_ruleSequenceExpression=ruleSequenceExpression();

            state._fsp--;

             current =iv_ruleSequenceExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSequenceExpression1885); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSequenceExpression"


    // $ANTLR start "ruleSequenceExpression"
    // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:876:1: ruleSequenceExpression returns [EObject current=null] : (this_HighBindExpression_0= ruleHighBindExpression ( () ( (lv_right_2_0= ruleHighBindExpression ) ) )* ) ;
    public final EObject ruleSequenceExpression() throws RecognitionException {
        EObject current = null;

        EObject this_HighBindExpression_0 = null;

        EObject lv_right_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:879:28: ( (this_HighBindExpression_0= ruleHighBindExpression ( () ( (lv_right_2_0= ruleHighBindExpression ) ) )* ) )
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:880:1: (this_HighBindExpression_0= ruleHighBindExpression ( () ( (lv_right_2_0= ruleHighBindExpression ) ) )* )
            {
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:880:1: (this_HighBindExpression_0= ruleHighBindExpression ( () ( (lv_right_2_0= ruleHighBindExpression ) ) )* )
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:881:5: this_HighBindExpression_0= ruleHighBindExpression ( () ( (lv_right_2_0= ruleHighBindExpression ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getSequenceExpressionAccess().getHighBindExpressionParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleHighBindExpression_in_ruleSequenceExpression1932);
            this_HighBindExpression_0=ruleHighBindExpression();

            state._fsp--;

             
                    current = this_HighBindExpression_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:889:1: ( () ( (lv_right_2_0= ruleHighBindExpression ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_CHAR||LA5_0==28) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:889:2: () ( (lv_right_2_0= ruleHighBindExpression ) )
            	    {
            	    // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:889:2: ()
            	    // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:890:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getSequenceExpressionAccess().getSequenceExpressionLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:895:2: ( (lv_right_2_0= ruleHighBindExpression ) )
            	    // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:896:1: (lv_right_2_0= ruleHighBindExpression )
            	    {
            	    // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:896:1: (lv_right_2_0= ruleHighBindExpression )
            	    // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:897:3: lv_right_2_0= ruleHighBindExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSequenceExpressionAccess().getRightHighBindExpressionParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleHighBindExpression_in_ruleSequenceExpression1962);
            	    lv_right_2_0=ruleHighBindExpression();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSequenceExpressionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_2_0, 
            	            		"HighBindExpression");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
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
    // $ANTLR end "ruleSequenceExpression"


    // $ANTLR start "entryRuleHighBindExpression"
    // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:921:1: entryRuleHighBindExpression returns [EObject current=null] : iv_ruleHighBindExpression= ruleHighBindExpression EOF ;
    public final EObject entryRuleHighBindExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHighBindExpression = null;


        try {
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:922:2: (iv_ruleHighBindExpression= ruleHighBindExpression EOF )
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:923:2: iv_ruleHighBindExpression= ruleHighBindExpression EOF
            {
             newCompositeNode(grammarAccess.getHighBindExpressionRule()); 
            pushFollow(FOLLOW_ruleHighBindExpression_in_entryRuleHighBindExpression2000);
            iv_ruleHighBindExpression=ruleHighBindExpression();

            state._fsp--;

             current =iv_ruleHighBindExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHighBindExpression2010); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHighBindExpression"


    // $ANTLR start "ruleHighBindExpression"
    // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:930:1: ruleHighBindExpression returns [EObject current=null] : (this_AtomicExpression_0= ruleAtomicExpression (otherlv_1= '*' () (otherlv_3= '*' )* )? ) ;
    public final EObject ruleHighBindExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_AtomicExpression_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:933:28: ( (this_AtomicExpression_0= ruleAtomicExpression (otherlv_1= '*' () (otherlv_3= '*' )* )? ) )
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:934:1: (this_AtomicExpression_0= ruleAtomicExpression (otherlv_1= '*' () (otherlv_3= '*' )* )? )
            {
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:934:1: (this_AtomicExpression_0= ruleAtomicExpression (otherlv_1= '*' () (otherlv_3= '*' )* )? )
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:935:5: this_AtomicExpression_0= ruleAtomicExpression (otherlv_1= '*' () (otherlv_3= '*' )* )?
            {
             
                    newCompositeNode(grammarAccess.getHighBindExpressionAccess().getAtomicExpressionParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleAtomicExpression_in_ruleHighBindExpression2057);
            this_AtomicExpression_0=ruleAtomicExpression();

            state._fsp--;

             
                    current = this_AtomicExpression_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:943:1: (otherlv_1= '*' () (otherlv_3= '*' )* )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==27) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:943:3: otherlv_1= '*' () (otherlv_3= '*' )*
                    {
                    otherlv_1=(Token)match(input,27,FOLLOW_27_in_ruleHighBindExpression2069); 

                        	newLeafNode(otherlv_1, grammarAccess.getHighBindExpressionAccess().getAsteriskKeyword_1_0());
                        
                    // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:947:1: ()
                    // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:948:5: 
                    {

                            current = forceCreateModelElementAndSet(
                                grammarAccess.getHighBindExpressionAccess().getStarExpressionInnerExpressionAction_1_1(),
                                current);
                        

                    }

                    // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:953:2: (otherlv_3= '*' )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==27) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:953:4: otherlv_3= '*'
                    	    {
                    	    otherlv_3=(Token)match(input,27,FOLLOW_27_in_ruleHighBindExpression2091); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getHighBindExpressionAccess().getAsteriskKeyword_1_2());
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop6;
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
    // $ANTLR end "ruleHighBindExpression"


    // $ANTLR start "entryRuleAtomicExpression"
    // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:965:1: entryRuleAtomicExpression returns [EObject current=null] : iv_ruleAtomicExpression= ruleAtomicExpression EOF ;
    public final EObject entryRuleAtomicExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicExpression = null;


        try {
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:966:2: (iv_ruleAtomicExpression= ruleAtomicExpression EOF )
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:967:2: iv_ruleAtomicExpression= ruleAtomicExpression EOF
            {
             newCompositeNode(grammarAccess.getAtomicExpressionRule()); 
            pushFollow(FOLLOW_ruleAtomicExpression_in_entryRuleAtomicExpression2131);
            iv_ruleAtomicExpression=ruleAtomicExpression();

            state._fsp--;

             current =iv_ruleAtomicExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtomicExpression2141); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAtomicExpression"


    // $ANTLR start "ruleAtomicExpression"
    // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:974:1: ruleAtomicExpression returns [EObject current=null] : (this_BracedExpression_0= ruleBracedExpression | this_Atom_1= ruleAtom ) ;
    public final EObject ruleAtomicExpression() throws RecognitionException {
        EObject current = null;

        EObject this_BracedExpression_0 = null;

        EObject this_Atom_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:977:28: ( (this_BracedExpression_0= ruleBracedExpression | this_Atom_1= ruleAtom ) )
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:978:1: (this_BracedExpression_0= ruleBracedExpression | this_Atom_1= ruleAtom )
            {
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:978:1: (this_BracedExpression_0= ruleBracedExpression | this_Atom_1= ruleAtom )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==28) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_CHAR) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:979:5: this_BracedExpression_0= ruleBracedExpression
                    {
                     
                            newCompositeNode(grammarAccess.getAtomicExpressionAccess().getBracedExpressionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleBracedExpression_in_ruleAtomicExpression2188);
                    this_BracedExpression_0=ruleBracedExpression();

                    state._fsp--;

                     
                            current = this_BracedExpression_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:989:5: this_Atom_1= ruleAtom
                    {
                     
                            newCompositeNode(grammarAccess.getAtomicExpressionAccess().getAtomParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleAtom_in_ruleAtomicExpression2215);
                    this_Atom_1=ruleAtom();

                    state._fsp--;

                     
                            current = this_Atom_1; 
                            afterParserOrEnumRuleCall();
                        

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
    // $ANTLR end "ruleAtomicExpression"


    // $ANTLR start "entryRuleBracedExpression"
    // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:1005:1: entryRuleBracedExpression returns [EObject current=null] : iv_ruleBracedExpression= ruleBracedExpression EOF ;
    public final EObject entryRuleBracedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBracedExpression = null;


        try {
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:1006:2: (iv_ruleBracedExpression= ruleBracedExpression EOF )
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:1007:2: iv_ruleBracedExpression= ruleBracedExpression EOF
            {
             newCompositeNode(grammarAccess.getBracedExpressionRule()); 
            pushFollow(FOLLOW_ruleBracedExpression_in_entryRuleBracedExpression2250);
            iv_ruleBracedExpression=ruleBracedExpression();

            state._fsp--;

             current =iv_ruleBracedExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBracedExpression2260); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBracedExpression"


    // $ANTLR start "ruleBracedExpression"
    // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:1014:1: ruleBracedExpression returns [EObject current=null] : (otherlv_0= '(' ( (lv_innerExpression_1_0= ruleRegularExpression ) ) otherlv_2= ')' ) ;
    public final EObject ruleBracedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_innerExpression_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:1017:28: ( (otherlv_0= '(' ( (lv_innerExpression_1_0= ruleRegularExpression ) ) otherlv_2= ')' ) )
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:1018:1: (otherlv_0= '(' ( (lv_innerExpression_1_0= ruleRegularExpression ) ) otherlv_2= ')' )
            {
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:1018:1: (otherlv_0= '(' ( (lv_innerExpression_1_0= ruleRegularExpression ) ) otherlv_2= ')' )
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:1018:3: otherlv_0= '(' ( (lv_innerExpression_1_0= ruleRegularExpression ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_28_in_ruleBracedExpression2297); 

                	newLeafNode(otherlv_0, grammarAccess.getBracedExpressionAccess().getLeftParenthesisKeyword_0());
                
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:1022:1: ( (lv_innerExpression_1_0= ruleRegularExpression ) )
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:1023:1: (lv_innerExpression_1_0= ruleRegularExpression )
            {
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:1023:1: (lv_innerExpression_1_0= ruleRegularExpression )
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:1024:3: lv_innerExpression_1_0= ruleRegularExpression
            {
             
            	        newCompositeNode(grammarAccess.getBracedExpressionAccess().getInnerExpressionRegularExpressionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleRegularExpression_in_ruleBracedExpression2318);
            lv_innerExpression_1_0=ruleRegularExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBracedExpressionRule());
            	        }
                   		set(
                   			current, 
                   			"innerExpression",
                    		lv_innerExpression_1_0, 
                    		"RegularExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,29,FOLLOW_29_in_ruleBracedExpression2330); 

                	newLeafNode(otherlv_2, grammarAccess.getBracedExpressionAccess().getRightParenthesisKeyword_2());
                

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
    // $ANTLR end "ruleBracedExpression"


    // $ANTLR start "entryRuleAtom"
    // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:1052:1: entryRuleAtom returns [EObject current=null] : iv_ruleAtom= ruleAtom EOF ;
    public final EObject entryRuleAtom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtom = null;


        try {
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:1053:2: (iv_ruleAtom= ruleAtom EOF )
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:1054:2: iv_ruleAtom= ruleAtom EOF
            {
             newCompositeNode(grammarAccess.getAtomRule()); 
            pushFollow(FOLLOW_ruleAtom_in_entryRuleAtom2366);
            iv_ruleAtom=ruleAtom();

            state._fsp--;

             current =iv_ruleAtom; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtom2376); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAtom"


    // $ANTLR start "ruleAtom"
    // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:1061:1: ruleAtom returns [EObject current=null] : ( (lv_value_0_0= RULE_CHAR ) ) ;
    public final EObject ruleAtom() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:1064:28: ( ( (lv_value_0_0= RULE_CHAR ) ) )
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:1065:1: ( (lv_value_0_0= RULE_CHAR ) )
            {
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:1065:1: ( (lv_value_0_0= RULE_CHAR ) )
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:1066:1: (lv_value_0_0= RULE_CHAR )
            {
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:1066:1: (lv_value_0_0= RULE_CHAR )
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:1067:3: lv_value_0_0= RULE_CHAR
            {
            lv_value_0_0=(Token)match(input,RULE_CHAR,FOLLOW_RULE_CHAR_in_ruleAtom2417); 

            			newLeafNode(lv_value_0_0, grammarAccess.getAtomAccess().getValueCHARTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAtomRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_0_0, 
                    		"CHAR");
            	    

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
    // $ANTLR end "ruleAtom"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTitle_in_ruleModel131 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ruleExport_in_ruleModel152 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ruleGlobal_in_ruleModel173 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ruleLocal_in_ruleModel194 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ruleDefault_in_ruleModel215 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ruleEof_in_ruleModel236 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ruleDefine_in_ruleModel257 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_ruleStartStates_in_ruleModel278 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_ruleRule_in_ruleModel299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTitle_in_entryRuleTitle335 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTitle345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleTitle382 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTitle399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExport_in_entryRuleExport440 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExport450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleExport487 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExport504 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleExport521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGlobal_in_entryRuleGlobal557 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGlobal567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleGlobal604 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGlobal621 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleGlobal638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocal_in_entryRuleLocal674 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLocal684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleLocal721 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLocal738 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleLocal755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefault_in_entryRuleDefault791 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefault801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleDefault838 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDefault855 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleDefault872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEof_in_entryRuleEof908 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEof918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleEof955 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEof972 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEof989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefine_in_entryRuleDefine1025 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefine1035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleDefine1072 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleDefineRule_in_ruleDefine1093 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleDefineRule_in_entryRuleDefineRule1130 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefineRule1140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDefineRule1182 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleDefineRule1199 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDefineRule1216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStartStates_in_entryRuleStartStates1257 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStartStates1267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleStartStates1304 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStartStates1321 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_ruleStartStates1339 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStartStates1350 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_ruleRule_in_entryRuleRule1387 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRule1397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleRule1434 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_ruleSingleRule_in_ruleRule1455 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_ruleSingleRule_in_entryRuleSingleRule1493 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSingleRule1504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleSingleRule1542 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSingleRule1557 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleSingleRule1575 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSingleRule1590 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleSingleRule1608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRegularExpression_in_entryRuleRegularExpression1648 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRegularExpression1658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrExpression_in_ruleRegularExpression1704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrExpression_in_entryRuleOrExpression1738 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrExpression1748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSequenceExpression_in_ruleOrExpression1795 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_ruleOrExpression1816 = new BitSet(new long[]{0x0000000010000040L});
    public static final BitSet FOLLOW_ruleSequenceExpression_in_ruleOrExpression1837 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_ruleSequenceExpression_in_entryRuleSequenceExpression1875 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSequenceExpression1885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHighBindExpression_in_ruleSequenceExpression1932 = new BitSet(new long[]{0x0000000010000042L});
    public static final BitSet FOLLOW_ruleHighBindExpression_in_ruleSequenceExpression1962 = new BitSet(new long[]{0x0000000010000042L});
    public static final BitSet FOLLOW_ruleHighBindExpression_in_entryRuleHighBindExpression2000 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHighBindExpression2010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicExpression_in_ruleHighBindExpression2057 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27_in_ruleHighBindExpression2069 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27_in_ruleHighBindExpression2091 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_ruleAtomicExpression_in_entryRuleAtomicExpression2131 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtomicExpression2141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBracedExpression_in_ruleAtomicExpression2188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtom_in_ruleAtomicExpression2215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBracedExpression_in_entryRuleBracedExpression2250 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBracedExpression2260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleBracedExpression2297 = new BitSet(new long[]{0x0000000010000040L});
    public static final BitSet FOLLOW_ruleRegularExpression_in_ruleBracedExpression2318 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleBracedExpression2330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtom_in_entryRuleAtom2366 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtom2376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CHAR_in_ruleAtom2417 = new BitSet(new long[]{0x0000000000000002L});

}