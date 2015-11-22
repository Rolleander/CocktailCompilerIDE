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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_TEXT", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'SCANNER'", "'EXPORT {'", "'}'", "'GLOBAL {'", "'LOCAL {'", "'DEFAULT {'", "'EOF {'", "'DEFINE'", "'='", "'.'", "'START'", "','", "'RULE'", "':-'", "':'", "'{'", "'#'", "'STD'"
    };
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int RULE_TEXT=5;
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
    // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:76:1: ruleModel returns [EObject current=null] : ( ( (lv_scanner_0_0= ruleTitle ) ) ( (lv_scanner_1_0= ruleExport ) ) ( (lv_scanner_2_0= ruleGlobal ) ) ( (lv_scanner_3_0= ruleLocal ) )? ( (lv_scanner_4_0= ruleDefault ) ) ( (lv_scanner_5_0= ruleEof ) )? ( (lv_scanner_6_0= ruleDefine ) ) ( (lv_scanner_7_0= ruleStartStates ) )? ( (lv_scanner_8_0= ruleRule ) ) ) ;
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
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:79:28: ( ( ( (lv_scanner_0_0= ruleTitle ) ) ( (lv_scanner_1_0= ruleExport ) ) ( (lv_scanner_2_0= ruleGlobal ) ) ( (lv_scanner_3_0= ruleLocal ) )? ( (lv_scanner_4_0= ruleDefault ) ) ( (lv_scanner_5_0= ruleEof ) )? ( (lv_scanner_6_0= ruleDefine ) ) ( (lv_scanner_7_0= ruleStartStates ) )? ( (lv_scanner_8_0= ruleRule ) ) ) )
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:80:1: ( ( (lv_scanner_0_0= ruleTitle ) ) ( (lv_scanner_1_0= ruleExport ) ) ( (lv_scanner_2_0= ruleGlobal ) ) ( (lv_scanner_3_0= ruleLocal ) )? ( (lv_scanner_4_0= ruleDefault ) ) ( (lv_scanner_5_0= ruleEof ) )? ( (lv_scanner_6_0= ruleDefine ) ) ( (lv_scanner_7_0= ruleStartStates ) )? ( (lv_scanner_8_0= ruleRule ) ) )
            {
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:80:1: ( ( (lv_scanner_0_0= ruleTitle ) ) ( (lv_scanner_1_0= ruleExport ) ) ( (lv_scanner_2_0= ruleGlobal ) ) ( (lv_scanner_3_0= ruleLocal ) )? ( (lv_scanner_4_0= ruleDefault ) ) ( (lv_scanner_5_0= ruleEof ) )? ( (lv_scanner_6_0= ruleDefine ) ) ( (lv_scanner_7_0= ruleStartStates ) )? ( (lv_scanner_8_0= ruleRule ) ) )
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:80:2: ( (lv_scanner_0_0= ruleTitle ) ) ( (lv_scanner_1_0= ruleExport ) ) ( (lv_scanner_2_0= ruleGlobal ) ) ( (lv_scanner_3_0= ruleLocal ) )? ( (lv_scanner_4_0= ruleDefault ) ) ( (lv_scanner_5_0= ruleEof ) )? ( (lv_scanner_6_0= ruleDefine ) ) ( (lv_scanner_7_0= ruleStartStates ) )? ( (lv_scanner_8_0= ruleRule ) )
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

            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:134:2: ( (lv_scanner_3_0= ruleLocal ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==16) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
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
                    break;

            }

            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:152:3: ( (lv_scanner_4_0= ruleDefault ) )
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:153:1: (lv_scanner_4_0= ruleDefault )
            {
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:153:1: (lv_scanner_4_0= ruleDefault )
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:154:3: lv_scanner_4_0= ruleDefault
            {
             
            	        newCompositeNode(grammarAccess.getModelAccess().getScannerDefaultParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleDefault_in_ruleModel216);
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

            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:170:2: ( (lv_scanner_5_0= ruleEof ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==18) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:171:1: (lv_scanner_5_0= ruleEof )
                    {
                    // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:171:1: (lv_scanner_5_0= ruleEof )
                    // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:172:3: lv_scanner_5_0= ruleEof
                    {
                     
                    	        newCompositeNode(grammarAccess.getModelAccess().getScannerEofParserRuleCall_5_0()); 
                    	    
                    pushFollow(FOLLOW_ruleEof_in_ruleModel237);
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
                    break;

            }

            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:188:3: ( (lv_scanner_6_0= ruleDefine ) )
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:189:1: (lv_scanner_6_0= ruleDefine )
            {
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:189:1: (lv_scanner_6_0= ruleDefine )
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:190:3: lv_scanner_6_0= ruleDefine
            {
             
            	        newCompositeNode(grammarAccess.getModelAccess().getScannerDefineParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleDefine_in_ruleModel259);
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

            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:206:2: ( (lv_scanner_7_0= ruleStartStates ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==22) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:207:1: (lv_scanner_7_0= ruleStartStates )
                    {
                    // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:207:1: (lv_scanner_7_0= ruleStartStates )
                    // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:208:3: lv_scanner_7_0= ruleStartStates
                    {
                     
                    	        newCompositeNode(grammarAccess.getModelAccess().getScannerStartStatesParserRuleCall_7_0()); 
                    	    
                    pushFollow(FOLLOW_ruleStartStates_in_ruleModel280);
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
                    break;

            }

            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:224:3: ( (lv_scanner_8_0= ruleRule ) )
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:225:1: (lv_scanner_8_0= ruleRule )
            {
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:225:1: (lv_scanner_8_0= ruleRule )
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:226:3: lv_scanner_8_0= ruleRule
            {
             
            	        newCompositeNode(grammarAccess.getModelAccess().getScannerRuleParserRuleCall_8_0()); 
            	    
            pushFollow(FOLLOW_ruleRule_in_ruleModel302);
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
            pushFollow(FOLLOW_ruleTitle_in_entryRuleTitle338);
            iv_ruleTitle=ruleTitle();

            state._fsp--;

             current =iv_ruleTitle; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTitle348); 

            }

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
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleTitle385); 

                	newLeafNode(otherlv_0, grammarAccess.getTitleAccess().getSCANNERKeyword_0());
                
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:267:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:268:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:268:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:269:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTitle402); 

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
            pushFollow(FOLLOW_ruleExport_in_entryRuleExport443);
            iv_ruleExport=ruleExport();

            state._fsp--;

             current =iv_ruleExport; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExport453); 

            }

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
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleExport490); 

                	newLeafNode(otherlv_0, grammarAccess.getExportAccess().getEXPORTKeyword_0());
                
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:310:1: ( (lv_content_1_0= RULE_ID ) )
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:311:1: (lv_content_1_0= RULE_ID )
            {
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:311:1: (lv_content_1_0= RULE_ID )
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:312:3: lv_content_1_0= RULE_ID
            {
            lv_content_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExport507); 

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

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleExport524); 

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
            pushFollow(FOLLOW_ruleGlobal_in_entryRuleGlobal560);
            iv_ruleGlobal=ruleGlobal();

            state._fsp--;

             current =iv_ruleGlobal; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGlobal570); 

            }

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
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleGlobal607); 

                	newLeafNode(otherlv_0, grammarAccess.getGlobalAccess().getGLOBALKeyword_0());
                
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:357:1: ( (lv_content_1_0= RULE_ID ) )
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:358:1: (lv_content_1_0= RULE_ID )
            {
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:358:1: (lv_content_1_0= RULE_ID )
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:359:3: lv_content_1_0= RULE_ID
            {
            lv_content_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGlobal624); 

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

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleGlobal641); 

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
            pushFollow(FOLLOW_ruleLocal_in_entryRuleLocal677);
            iv_ruleLocal=ruleLocal();

            state._fsp--;

             current =iv_ruleLocal; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLocal687); 

            }

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
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleLocal724); 

                	newLeafNode(otherlv_0, grammarAccess.getLocalAccess().getLOCALKeyword_0());
                
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:404:1: ( (lv_content_1_0= RULE_ID ) )
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:405:1: (lv_content_1_0= RULE_ID )
            {
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:405:1: (lv_content_1_0= RULE_ID )
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:406:3: lv_content_1_0= RULE_ID
            {
            lv_content_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLocal741); 

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

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleLocal758); 

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
            pushFollow(FOLLOW_ruleDefault_in_entryRuleDefault794);
            iv_ruleDefault=ruleDefault();

            state._fsp--;

             current =iv_ruleDefault; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefault804); 

            }

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
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleDefault841); 

                	newLeafNode(otherlv_0, grammarAccess.getDefaultAccess().getDEFAULTKeyword_0());
                
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:451:1: ( (lv_content_1_0= RULE_ID ) )
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:452:1: (lv_content_1_0= RULE_ID )
            {
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:452:1: (lv_content_1_0= RULE_ID )
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:453:3: lv_content_1_0= RULE_ID
            {
            lv_content_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDefault858); 

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

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleDefault875); 

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
            pushFollow(FOLLOW_ruleEof_in_entryRuleEof911);
            iv_ruleEof=ruleEof();

            state._fsp--;

             current =iv_ruleEof; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEof921); 

            }

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
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleEof958); 

                	newLeafNode(otherlv_0, grammarAccess.getEofAccess().getEOFKeyword_0());
                
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:498:1: ( (lv_content_1_0= RULE_ID ) )
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:499:1: (lv_content_1_0= RULE_ID )
            {
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:499:1: (lv_content_1_0= RULE_ID )
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:500:3: lv_content_1_0= RULE_ID
            {
            lv_content_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEof975); 

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

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleEof992); 

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
            pushFollow(FOLLOW_ruleDefine_in_entryRuleDefine1028);
            iv_ruleDefine=ruleDefine();

            state._fsp--;

             current =iv_ruleDefine; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefine1038); 

            }

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
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleDefine1075); 

                	newLeafNode(otherlv_0, grammarAccess.getDefineAccess().getDEFINEKeyword_0());
                
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:545:1: ( (lv_defines_1_0= ruleDefineRule ) )+
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
            	    // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:546:1: (lv_defines_1_0= ruleDefineRule )
            	    {
            	    // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:546:1: (lv_defines_1_0= ruleDefineRule )
            	    // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:547:3: lv_defines_1_0= ruleDefineRule
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDefineAccess().getDefinesDefineRuleParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDefineRule_in_ruleDefine1096);
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
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
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
            pushFollow(FOLLOW_ruleDefineRule_in_entryRuleDefineRule1133);
            iv_ruleDefineRule=ruleDefineRule();

            state._fsp--;

             current =iv_ruleDefineRule; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefineRule1143); 

            }

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
    // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:580:1: ruleDefineRule returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_rule_2_0= RULE_ID ) ) otherlv_3= '.' ) ;
    public final EObject ruleDefineRule() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_rule_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:583:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_rule_2_0= RULE_ID ) ) otherlv_3= '.' ) )
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:584:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_rule_2_0= RULE_ID ) ) otherlv_3= '.' )
            {
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:584:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_rule_2_0= RULE_ID ) ) otherlv_3= '.' )
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:584:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_rule_2_0= RULE_ID ) ) otherlv_3= '.'
            {
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:584:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:585:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:585:1: (lv_name_0_0= RULE_ID )
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:586:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDefineRule1185); 

            			newLeafNode(lv_name_0_0, grammarAccess.getDefineRuleAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDefineRuleRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleDefineRule1202); 

                	newLeafNode(otherlv_1, grammarAccess.getDefineRuleAccess().getEqualsSignKeyword_1());
                
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:606:1: ( (lv_rule_2_0= RULE_ID ) )
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:607:1: (lv_rule_2_0= RULE_ID )
            {
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:607:1: (lv_rule_2_0= RULE_ID )
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:608:3: lv_rule_2_0= RULE_ID
            {
            lv_rule_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDefineRule1219); 

            			newLeafNode(lv_rule_2_0, grammarAccess.getDefineRuleAccess().getRuleIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDefineRuleRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"rule",
                    		lv_rule_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleDefineRule1236); 

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
    // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:636:1: entryRuleStartStates returns [EObject current=null] : iv_ruleStartStates= ruleStartStates EOF ;
    public final EObject entryRuleStartStates() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStartStates = null;


        try {
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:637:2: (iv_ruleStartStates= ruleStartStates EOF )
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:638:2: iv_ruleStartStates= ruleStartStates EOF
            {
             newCompositeNode(grammarAccess.getStartStatesRule()); 
            pushFollow(FOLLOW_ruleStartStates_in_entryRuleStartStates1272);
            iv_ruleStartStates=ruleStartStates();

            state._fsp--;

             current =iv_ruleStartStates; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStartStates1282); 

            }

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
    // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:645:1: ruleStartStates returns [EObject current=null] : (otherlv_0= 'START' ( (lv_states_1_0= ruleStartState ) ) (otherlv_2= ',' ( (lv_states_3_0= ruleStartState ) ) )* ) ;
    public final EObject ruleStartStates() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_states_1_0 = null;

        EObject lv_states_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:648:28: ( (otherlv_0= 'START' ( (lv_states_1_0= ruleStartState ) ) (otherlv_2= ',' ( (lv_states_3_0= ruleStartState ) ) )* ) )
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:649:1: (otherlv_0= 'START' ( (lv_states_1_0= ruleStartState ) ) (otherlv_2= ',' ( (lv_states_3_0= ruleStartState ) ) )* )
            {
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:649:1: (otherlv_0= 'START' ( (lv_states_1_0= ruleStartState ) ) (otherlv_2= ',' ( (lv_states_3_0= ruleStartState ) ) )* )
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:649:3: otherlv_0= 'START' ( (lv_states_1_0= ruleStartState ) ) (otherlv_2= ',' ( (lv_states_3_0= ruleStartState ) ) )*
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleStartStates1319); 

                	newLeafNode(otherlv_0, grammarAccess.getStartStatesAccess().getSTARTKeyword_0());
                
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:653:1: ( (lv_states_1_0= ruleStartState ) )
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:654:1: (lv_states_1_0= ruleStartState )
            {
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:654:1: (lv_states_1_0= ruleStartState )
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:655:3: lv_states_1_0= ruleStartState
            {
             
            	        newCompositeNode(grammarAccess.getStartStatesAccess().getStatesStartStateParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleStartState_in_ruleStartStates1340);
            lv_states_1_0=ruleStartState();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getStartStatesRule());
            	        }
                   		add(
                   			current, 
                   			"states",
                    		lv_states_1_0, 
                    		"StartState");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:671:2: (otherlv_2= ',' ( (lv_states_3_0= ruleStartState ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==23) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:671:4: otherlv_2= ',' ( (lv_states_3_0= ruleStartState ) )
            	    {
            	    otherlv_2=(Token)match(input,23,FOLLOW_23_in_ruleStartStates1353); 

            	        	newLeafNode(otherlv_2, grammarAccess.getStartStatesAccess().getCommaKeyword_2_0());
            	        
            	    // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:675:1: ( (lv_states_3_0= ruleStartState ) )
            	    // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:676:1: (lv_states_3_0= ruleStartState )
            	    {
            	    // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:676:1: (lv_states_3_0= ruleStartState )
            	    // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:677:3: lv_states_3_0= ruleStartState
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStartStatesAccess().getStatesStartStateParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleStartState_in_ruleStartStates1374);
            	    lv_states_3_0=ruleStartState();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getStartStatesRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"states",
            	            		lv_states_3_0, 
            	            		"StartState");
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
    // $ANTLR end "ruleStartStates"


    // $ANTLR start "entryRuleStartState"
    // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:701:1: entryRuleStartState returns [EObject current=null] : iv_ruleStartState= ruleStartState EOF ;
    public final EObject entryRuleStartState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStartState = null;


        try {
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:702:2: (iv_ruleStartState= ruleStartState EOF )
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:703:2: iv_ruleStartState= ruleStartState EOF
            {
             newCompositeNode(grammarAccess.getStartStateRule()); 
            pushFollow(FOLLOW_ruleStartState_in_entryRuleStartState1412);
            iv_ruleStartState=ruleStartState();

            state._fsp--;

             current =iv_ruleStartState; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStartState1422); 

            }

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
    // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:710:1: ruleStartState returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleStartState() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:713:28: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:714:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:714:1: ( (lv_name_0_0= RULE_ID ) )
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:715:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:715:1: (lv_name_0_0= RULE_ID )
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:716:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStartState1463); 

            			newLeafNode(lv_name_0_0, grammarAccess.getStartStateAccess().getNameIDTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStartStateRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

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
    // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:740:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:741:2: (iv_ruleRule= ruleRule EOF )
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:742:2: iv_ruleRule= ruleRule EOF
            {
             newCompositeNode(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_ruleRule_in_entryRuleRule1503);
            iv_ruleRule=ruleRule();

            state._fsp--;

             current =iv_ruleRule; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRule1513); 

            }

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
    // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:749:1: ruleRule returns [EObject current=null] : (otherlv_0= 'RULE' ( (lv_content_1_0= ruleSingleRule ) )* ) ;
    public final EObject ruleRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_content_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:752:28: ( (otherlv_0= 'RULE' ( (lv_content_1_0= ruleSingleRule ) )* ) )
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:753:1: (otherlv_0= 'RULE' ( (lv_content_1_0= ruleSingleRule ) )* )
            {
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:753:1: (otherlv_0= 'RULE' ( (lv_content_1_0= ruleSingleRule ) )* )
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:753:3: otherlv_0= 'RULE' ( (lv_content_1_0= ruleSingleRule ) )*
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleRule1550); 

                	newLeafNode(otherlv_0, grammarAccess.getRuleAccess().getRULEKeyword_0());
                
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:757:1: ( (lv_content_1_0= ruleSingleRule ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_TEXT||LA6_0==28) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:758:1: (lv_content_1_0= ruleSingleRule )
            	    {
            	    // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:758:1: (lv_content_1_0= ruleSingleRule )
            	    // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:759:3: lv_content_1_0= ruleSingleRule
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRuleAccess().getContentSingleRuleParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSingleRule_in_ruleRule1571);
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
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleSingleRule"
    // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:783:1: entryRuleSingleRule returns [EObject current=null] : iv_ruleSingleRule= ruleSingleRule EOF ;
    public final EObject entryRuleSingleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleRule = null;


        try {
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:784:2: (iv_ruleSingleRule= ruleSingleRule EOF )
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:785:2: iv_ruleSingleRule= ruleSingleRule EOF
            {
             newCompositeNode(grammarAccess.getSingleRuleRule()); 
            pushFollow(FOLLOW_ruleSingleRule_in_entryRuleSingleRule1608);
            iv_ruleSingleRule=ruleSingleRule();

            state._fsp--;

             current =iv_ruleSingleRule; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSingleRule1618); 

            }

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
    // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:792:1: ruleSingleRule returns [EObject current=null] : ( (this_RuleStart_0= ruleRuleStart )? ( (lv_rule_1_0= RULE_TEXT ) ) (otherlv_2= ':-' | otherlv_3= ':' ) otherlv_4= '{' ( (lv_content_5_0= RULE_ID ) ) otherlv_6= '}' ) ;
    public final EObject ruleSingleRule() throws RecognitionException {
        EObject current = null;

        Token lv_rule_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_content_5_0=null;
        Token otherlv_6=null;
        EObject this_RuleStart_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:795:28: ( ( (this_RuleStart_0= ruleRuleStart )? ( (lv_rule_1_0= RULE_TEXT ) ) (otherlv_2= ':-' | otherlv_3= ':' ) otherlv_4= '{' ( (lv_content_5_0= RULE_ID ) ) otherlv_6= '}' ) )
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:796:1: ( (this_RuleStart_0= ruleRuleStart )? ( (lv_rule_1_0= RULE_TEXT ) ) (otherlv_2= ':-' | otherlv_3= ':' ) otherlv_4= '{' ( (lv_content_5_0= RULE_ID ) ) otherlv_6= '}' )
            {
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:796:1: ( (this_RuleStart_0= ruleRuleStart )? ( (lv_rule_1_0= RULE_TEXT ) ) (otherlv_2= ':-' | otherlv_3= ':' ) otherlv_4= '{' ( (lv_content_5_0= RULE_ID ) ) otherlv_6= '}' )
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:796:2: (this_RuleStart_0= ruleRuleStart )? ( (lv_rule_1_0= RULE_TEXT ) ) (otherlv_2= ':-' | otherlv_3= ':' ) otherlv_4= '{' ( (lv_content_5_0= RULE_ID ) ) otherlv_6= '}'
            {
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:796:2: (this_RuleStart_0= ruleRuleStart )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==28) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:797:5: this_RuleStart_0= ruleRuleStart
                    {
                     
                            newCompositeNode(grammarAccess.getSingleRuleAccess().getRuleStartParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleRuleStart_in_ruleSingleRule1666);
                    this_RuleStart_0=ruleRuleStart();

                    state._fsp--;

                     
                            current = this_RuleStart_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:805:3: ( (lv_rule_1_0= RULE_TEXT ) )
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:806:1: (lv_rule_1_0= RULE_TEXT )
            {
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:806:1: (lv_rule_1_0= RULE_TEXT )
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:807:3: lv_rule_1_0= RULE_TEXT
            {
            lv_rule_1_0=(Token)match(input,RULE_TEXT,FOLLOW_RULE_TEXT_in_ruleSingleRule1684); 

            			newLeafNode(lv_rule_1_0, grammarAccess.getSingleRuleAccess().getRuleTEXTTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSingleRuleRule());
            	        }
                   		addWithLastConsumed(
                   			current, 
                   			"rule",
                    		lv_rule_1_0, 
                    		"TEXT");
            	    

            }


            }

            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:823:2: (otherlv_2= ':-' | otherlv_3= ':' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==25) ) {
                alt8=1;
            }
            else if ( (LA8_0==26) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:823:4: otherlv_2= ':-'
                    {
                    otherlv_2=(Token)match(input,25,FOLLOW_25_in_ruleSingleRule1702); 

                        	newLeafNode(otherlv_2, grammarAccess.getSingleRuleAccess().getColonHyphenMinusKeyword_2_0());
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:828:7: otherlv_3= ':'
                    {
                    otherlv_3=(Token)match(input,26,FOLLOW_26_in_ruleSingleRule1720); 

                        	newLeafNode(otherlv_3, grammarAccess.getSingleRuleAccess().getColonKeyword_2_1());
                        

                    }
                    break;

            }

            otherlv_4=(Token)match(input,27,FOLLOW_27_in_ruleSingleRule1733); 

                	newLeafNode(otherlv_4, grammarAccess.getSingleRuleAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:836:1: ( (lv_content_5_0= RULE_ID ) )
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:837:1: (lv_content_5_0= RULE_ID )
            {
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:837:1: (lv_content_5_0= RULE_ID )
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:838:3: lv_content_5_0= RULE_ID
            {
            lv_content_5_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSingleRule1750); 

            			newLeafNode(lv_content_5_0, grammarAccess.getSingleRuleAccess().getContentIDTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSingleRuleRule());
            	        }
                   		addWithLastConsumed(
                   			current, 
                   			"content",
                    		lv_content_5_0, 
                    		"ID");
            	    

            }


            }

            otherlv_6=(Token)match(input,14,FOLLOW_14_in_ruleSingleRule1767); 

                	newLeafNode(otherlv_6, grammarAccess.getSingleRuleAccess().getRightCurlyBracketKeyword_5());
                

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


    // $ANTLR start "entryRuleRuleStart"
    // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:866:1: entryRuleRuleStart returns [EObject current=null] : iv_ruleRuleStart= ruleRuleStart EOF ;
    public final EObject entryRuleRuleStart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRuleStart = null;


        try {
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:867:2: (iv_ruleRuleStart= ruleRuleStart EOF )
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:868:2: iv_ruleRuleStart= ruleRuleStart EOF
            {
             newCompositeNode(grammarAccess.getRuleStartRule()); 
            pushFollow(FOLLOW_ruleRuleStart_in_entryRuleRuleStart1803);
            iv_ruleRuleStart=ruleRuleStart();

            state._fsp--;

             current =iv_ruleRuleStart; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRuleStart1813); 

            }

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
    // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:875:1: ruleRuleStart returns [EObject current=null] : (otherlv_0= '#' ( ( (otherlv_1= RULE_ID ) ) | otherlv_2= 'STD' ) otherlv_3= '#' ) ;
    public final EObject ruleRuleStart() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:878:28: ( (otherlv_0= '#' ( ( (otherlv_1= RULE_ID ) ) | otherlv_2= 'STD' ) otherlv_3= '#' ) )
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:879:1: (otherlv_0= '#' ( ( (otherlv_1= RULE_ID ) ) | otherlv_2= 'STD' ) otherlv_3= '#' )
            {
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:879:1: (otherlv_0= '#' ( ( (otherlv_1= RULE_ID ) ) | otherlv_2= 'STD' ) otherlv_3= '#' )
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:879:3: otherlv_0= '#' ( ( (otherlv_1= RULE_ID ) ) | otherlv_2= 'STD' ) otherlv_3= '#'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_28_in_ruleRuleStart1850); 

                	newLeafNode(otherlv_0, grammarAccess.getRuleStartAccess().getNumberSignKeyword_0());
                
            // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:883:1: ( ( (otherlv_1= RULE_ID ) ) | otherlv_2= 'STD' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                alt9=1;
            }
            else if ( (LA9_0==29) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:883:2: ( (otherlv_1= RULE_ID ) )
                    {
                    // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:883:2: ( (otherlv_1= RULE_ID ) )
                    // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:884:1: (otherlv_1= RULE_ID )
                    {
                    // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:884:1: (otherlv_1= RULE_ID )
                    // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:885:3: otherlv_1= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getRuleStartRule());
                    	        }
                            
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRuleStart1871); 

                    		newLeafNode(otherlv_1, grammarAccess.getRuleStartAccess().getStateStartStateCrossReference_1_0_0()); 
                    	

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.cocktail/src-gen/org/xtext/cocktail/parser/antlr/internal/InternalScanner.g:897:7: otherlv_2= 'STD'
                    {
                    otherlv_2=(Token)match(input,29,FOLLOW_29_in_ruleRuleStart1889); 

                        	newLeafNode(otherlv_2, grammarAccess.getRuleStartAccess().getSTDKeyword_1_1());
                        

                    }
                    break;

            }

            otherlv_3=(Token)match(input,28,FOLLOW_28_in_ruleRuleStart1902); 

                	newLeafNode(otherlv_3, grammarAccess.getRuleStartAccess().getNumberSignKeyword_2());
                

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


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTitle_in_ruleModel131 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ruleExport_in_ruleModel152 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ruleGlobal_in_ruleModel173 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_ruleLocal_in_ruleModel194 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_ruleDefault_in_ruleModel216 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_ruleEof_in_ruleModel237 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_ruleDefine_in_ruleModel259 = new BitSet(new long[]{0x0000000001400000L});
    public static final BitSet FOLLOW_ruleStartStates_in_ruleModel280 = new BitSet(new long[]{0x0000000001400000L});
    public static final BitSet FOLLOW_ruleRule_in_ruleModel302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTitle_in_entryRuleTitle338 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTitle348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleTitle385 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTitle402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExport_in_entryRuleExport443 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExport453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleExport490 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExport507 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleExport524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGlobal_in_entryRuleGlobal560 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGlobal570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleGlobal607 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGlobal624 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleGlobal641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocal_in_entryRuleLocal677 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLocal687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleLocal724 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLocal741 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleLocal758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefault_in_entryRuleDefault794 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefault804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleDefault841 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDefault858 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleDefault875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEof_in_entryRuleEof911 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEof921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleEof958 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEof975 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEof992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefine_in_entryRuleDefine1028 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefine1038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleDefine1075 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleDefineRule_in_ruleDefine1096 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleDefineRule_in_entryRuleDefineRule1133 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefineRule1143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDefineRule1185 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleDefineRule1202 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDefineRule1219 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleDefineRule1236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStartStates_in_entryRuleStartStates1272 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStartStates1282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleStartStates1319 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleStartState_in_ruleStartStates1340 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_ruleStartStates1353 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleStartState_in_ruleStartStates1374 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_ruleStartState_in_entryRuleStartState1412 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStartState1422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStartState1463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRule_in_entryRuleRule1503 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRule1513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleRule1550 = new BitSet(new long[]{0x0000000010000022L});
    public static final BitSet FOLLOW_ruleSingleRule_in_ruleRule1571 = new BitSet(new long[]{0x0000000010000022L});
    public static final BitSet FOLLOW_ruleSingleRule_in_entryRuleSingleRule1608 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSingleRule1618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRuleStart_in_ruleSingleRule1666 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_TEXT_in_ruleSingleRule1684 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_25_in_ruleSingleRule1702 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_26_in_ruleSingleRule1720 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleSingleRule1733 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSingleRule1750 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleSingleRule1767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRuleStart_in_entryRuleRuleStart1803 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRuleStart1813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleRuleStart1850 = new BitSet(new long[]{0x0000000020000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRuleStart1871 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_29_in_ruleRuleStart1889 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleRuleStart1902 = new BitSet(new long[]{0x0000000000000002L});

}