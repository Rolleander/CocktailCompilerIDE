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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'SCANNER'", "'EXPORT {'", "'}'", "'GLOBAL {'", "'LOCAL {'", "'DEFAULT {'", "'EOF {'", "'DEFINE'", "'='", "'.'", "'START'", "','", "'-'", "'RULE'", "'RULES'", "':-'", "':'", "'{'", "'NOT'", "'#'", "'STD'", "'*'"
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
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int RULE_STRING=5;
    public static final int T__32=32;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;

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
    // InternalScanner.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalScanner.g:68:2: (iv_ruleModel= ruleModel EOF )
            // InternalScanner.g:69:2: iv_ruleModel= ruleModel EOF
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
    // InternalScanner.g:76:1: ruleModel returns [EObject current=null] : ( ( (lv_scanner_0_0= ruleScanner ) )? ( (lv_scanner_1_0= ruleExport ) )? ( (lv_scanner_2_0= ruleGlobal ) )? ( (lv_scanner_3_0= ruleLocal ) )? ( (lv_scanner_4_0= ruleDefault ) )? ( (lv_scanner_5_0= ruleEof ) )? ( (lv_scanner_6_0= ruleDefine ) ) ( (lv_scanner_7_0= ruleStartStates ) )? ( (lv_scanner_8_0= ruleRule ) ) ) ;
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
            // InternalScanner.g:79:28: ( ( ( (lv_scanner_0_0= ruleScanner ) )? ( (lv_scanner_1_0= ruleExport ) )? ( (lv_scanner_2_0= ruleGlobal ) )? ( (lv_scanner_3_0= ruleLocal ) )? ( (lv_scanner_4_0= ruleDefault ) )? ( (lv_scanner_5_0= ruleEof ) )? ( (lv_scanner_6_0= ruleDefine ) ) ( (lv_scanner_7_0= ruleStartStates ) )? ( (lv_scanner_8_0= ruleRule ) ) ) )
            // InternalScanner.g:80:1: ( ( (lv_scanner_0_0= ruleScanner ) )? ( (lv_scanner_1_0= ruleExport ) )? ( (lv_scanner_2_0= ruleGlobal ) )? ( (lv_scanner_3_0= ruleLocal ) )? ( (lv_scanner_4_0= ruleDefault ) )? ( (lv_scanner_5_0= ruleEof ) )? ( (lv_scanner_6_0= ruleDefine ) ) ( (lv_scanner_7_0= ruleStartStates ) )? ( (lv_scanner_8_0= ruleRule ) ) )
            {
            // InternalScanner.g:80:1: ( ( (lv_scanner_0_0= ruleScanner ) )? ( (lv_scanner_1_0= ruleExport ) )? ( (lv_scanner_2_0= ruleGlobal ) )? ( (lv_scanner_3_0= ruleLocal ) )? ( (lv_scanner_4_0= ruleDefault ) )? ( (lv_scanner_5_0= ruleEof ) )? ( (lv_scanner_6_0= ruleDefine ) ) ( (lv_scanner_7_0= ruleStartStates ) )? ( (lv_scanner_8_0= ruleRule ) ) )
            // InternalScanner.g:80:2: ( (lv_scanner_0_0= ruleScanner ) )? ( (lv_scanner_1_0= ruleExport ) )? ( (lv_scanner_2_0= ruleGlobal ) )? ( (lv_scanner_3_0= ruleLocal ) )? ( (lv_scanner_4_0= ruleDefault ) )? ( (lv_scanner_5_0= ruleEof ) )? ( (lv_scanner_6_0= ruleDefine ) ) ( (lv_scanner_7_0= ruleStartStates ) )? ( (lv_scanner_8_0= ruleRule ) )
            {
            // InternalScanner.g:80:2: ( (lv_scanner_0_0= ruleScanner ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalScanner.g:81:1: (lv_scanner_0_0= ruleScanner )
                    {
                    // InternalScanner.g:81:1: (lv_scanner_0_0= ruleScanner )
                    // InternalScanner.g:82:3: lv_scanner_0_0= ruleScanner
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
                    break;

            }

            // InternalScanner.g:98:3: ( (lv_scanner_1_0= ruleExport ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalScanner.g:99:1: (lv_scanner_1_0= ruleExport )
                    {
                    // InternalScanner.g:99:1: (lv_scanner_1_0= ruleExport )
                    // InternalScanner.g:100:3: lv_scanner_1_0= ruleExport
                    {
                     
                    	        newCompositeNode(grammarAccess.getModelAccess().getScannerExportParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_3);
                    lv_scanner_1_0=ruleExport();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getModelRule());
                    	        }
                           		add(
                           			current, 
                           			"scanner",
                            		lv_scanner_1_0, 
                            		"org.xtext.cocktail.Scanner.Export");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // InternalScanner.g:116:3: ( (lv_scanner_2_0= ruleGlobal ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalScanner.g:117:1: (lv_scanner_2_0= ruleGlobal )
                    {
                    // InternalScanner.g:117:1: (lv_scanner_2_0= ruleGlobal )
                    // InternalScanner.g:118:3: lv_scanner_2_0= ruleGlobal
                    {
                     
                    	        newCompositeNode(grammarAccess.getModelAccess().getScannerGlobalParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_3);
                    lv_scanner_2_0=ruleGlobal();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getModelRule());
                    	        }
                           		add(
                           			current, 
                           			"scanner",
                            		lv_scanner_2_0, 
                            		"org.xtext.cocktail.Scanner.Global");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // InternalScanner.g:134:3: ( (lv_scanner_3_0= ruleLocal ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalScanner.g:135:1: (lv_scanner_3_0= ruleLocal )
                    {
                    // InternalScanner.g:135:1: (lv_scanner_3_0= ruleLocal )
                    // InternalScanner.g:136:3: lv_scanner_3_0= ruleLocal
                    {
                     
                    	        newCompositeNode(grammarAccess.getModelAccess().getScannerLocalParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_3);
                    lv_scanner_3_0=ruleLocal();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getModelRule());
                    	        }
                           		add(
                           			current, 
                           			"scanner",
                            		lv_scanner_3_0, 
                            		"org.xtext.cocktail.Scanner.Local");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // InternalScanner.g:152:3: ( (lv_scanner_4_0= ruleDefault ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalScanner.g:153:1: (lv_scanner_4_0= ruleDefault )
                    {
                    // InternalScanner.g:153:1: (lv_scanner_4_0= ruleDefault )
                    // InternalScanner.g:154:3: lv_scanner_4_0= ruleDefault
                    {
                     
                    	        newCompositeNode(grammarAccess.getModelAccess().getScannerDefaultParserRuleCall_4_0()); 
                    	    
                    pushFollow(FOLLOW_3);
                    lv_scanner_4_0=ruleDefault();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getModelRule());
                    	        }
                           		add(
                           			current, 
                           			"scanner",
                            		lv_scanner_4_0, 
                            		"org.xtext.cocktail.Scanner.Default");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // InternalScanner.g:170:3: ( (lv_scanner_5_0= ruleEof ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalScanner.g:171:1: (lv_scanner_5_0= ruleEof )
                    {
                    // InternalScanner.g:171:1: (lv_scanner_5_0= ruleEof )
                    // InternalScanner.g:172:3: lv_scanner_5_0= ruleEof
                    {
                     
                    	        newCompositeNode(grammarAccess.getModelAccess().getScannerEofParserRuleCall_5_0()); 
                    	    
                    pushFollow(FOLLOW_3);
                    lv_scanner_5_0=ruleEof();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getModelRule());
                    	        }
                           		add(
                           			current, 
                           			"scanner",
                            		lv_scanner_5_0, 
                            		"org.xtext.cocktail.Scanner.Eof");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // InternalScanner.g:188:3: ( (lv_scanner_6_0= ruleDefine ) )
            // InternalScanner.g:189:1: (lv_scanner_6_0= ruleDefine )
            {
            // InternalScanner.g:189:1: (lv_scanner_6_0= ruleDefine )
            // InternalScanner.g:190:3: lv_scanner_6_0= ruleDefine
            {
             
            	        newCompositeNode(grammarAccess.getModelAccess().getScannerDefineParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_4);
            lv_scanner_6_0=ruleDefine();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getModelRule());
            	        }
                   		add(
                   			current, 
                   			"scanner",
                    		lv_scanner_6_0, 
                    		"org.xtext.cocktail.Scanner.Define");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalScanner.g:206:2: ( (lv_scanner_7_0= ruleStartStates ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==21) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalScanner.g:207:1: (lv_scanner_7_0= ruleStartStates )
                    {
                    // InternalScanner.g:207:1: (lv_scanner_7_0= ruleStartStates )
                    // InternalScanner.g:208:3: lv_scanner_7_0= ruleStartStates
                    {
                     
                    	        newCompositeNode(grammarAccess.getModelAccess().getScannerStartStatesParserRuleCall_7_0()); 
                    	    
                    pushFollow(FOLLOW_4);
                    lv_scanner_7_0=ruleStartStates();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getModelRule());
                    	        }
                           		add(
                           			current, 
                           			"scanner",
                            		lv_scanner_7_0, 
                            		"org.xtext.cocktail.Scanner.StartStates");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // InternalScanner.g:224:3: ( (lv_scanner_8_0= ruleRule ) )
            // InternalScanner.g:225:1: (lv_scanner_8_0= ruleRule )
            {
            // InternalScanner.g:225:1: (lv_scanner_8_0= ruleRule )
            // InternalScanner.g:226:3: lv_scanner_8_0= ruleRule
            {
             
            	        newCompositeNode(grammarAccess.getModelAccess().getScannerRuleParserRuleCall_8_0()); 
            	    
            pushFollow(FOLLOW_2);
            lv_scanner_8_0=ruleRule();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getModelRule());
            	        }
                   		add(
                   			current, 
                   			"scanner",
                    		lv_scanner_8_0, 
                    		"org.xtext.cocktail.Scanner.Rule");
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


    // $ANTLR start "entryRuleScanner"
    // InternalScanner.g:250:1: entryRuleScanner returns [EObject current=null] : iv_ruleScanner= ruleScanner EOF ;
    public final EObject entryRuleScanner() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScanner = null;


        try {
            // InternalScanner.g:251:2: (iv_ruleScanner= ruleScanner EOF )
            // InternalScanner.g:252:2: iv_ruleScanner= ruleScanner EOF
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
    // InternalScanner.g:259:1: ruleScanner returns [EObject current=null] : (otherlv_0= 'SCANNER' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleScanner() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // InternalScanner.g:262:28: ( (otherlv_0= 'SCANNER' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalScanner.g:263:1: (otherlv_0= 'SCANNER' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalScanner.g:263:1: (otherlv_0= 'SCANNER' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalScanner.g:263:3: otherlv_0= 'SCANNER' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_5); 

                	newLeafNode(otherlv_0, grammarAccess.getScannerAccess().getSCANNERKeyword_0());
                
            // InternalScanner.g:267:1: ( (lv_name_1_0= RULE_ID ) )
            // InternalScanner.g:268:1: (lv_name_1_0= RULE_ID )
            {
            // InternalScanner.g:268:1: (lv_name_1_0= RULE_ID )
            // InternalScanner.g:269:3: lv_name_1_0= RULE_ID
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
    // InternalScanner.g:293:1: entryRuleExport returns [EObject current=null] : iv_ruleExport= ruleExport EOF ;
    public final EObject entryRuleExport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExport = null;


        try {
            // InternalScanner.g:294:2: (iv_ruleExport= ruleExport EOF )
            // InternalScanner.g:295:2: iv_ruleExport= ruleExport EOF
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
    // InternalScanner.g:302:1: ruleExport returns [EObject current=null] : (otherlv_0= 'EXPORT {' ( (lv_content_1_0= RULE_ID ) ) otherlv_2= '}' ) ;
    public final EObject ruleExport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_content_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // InternalScanner.g:305:28: ( (otherlv_0= 'EXPORT {' ( (lv_content_1_0= RULE_ID ) ) otherlv_2= '}' ) )
            // InternalScanner.g:306:1: (otherlv_0= 'EXPORT {' ( (lv_content_1_0= RULE_ID ) ) otherlv_2= '}' )
            {
            // InternalScanner.g:306:1: (otherlv_0= 'EXPORT {' ( (lv_content_1_0= RULE_ID ) ) otherlv_2= '}' )
            // InternalScanner.g:306:3: otherlv_0= 'EXPORT {' ( (lv_content_1_0= RULE_ID ) ) otherlv_2= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_5); 

                	newLeafNode(otherlv_0, grammarAccess.getExportAccess().getEXPORTKeyword_0());
                
            // InternalScanner.g:310:1: ( (lv_content_1_0= RULE_ID ) )
            // InternalScanner.g:311:1: (lv_content_1_0= RULE_ID )
            {
            // InternalScanner.g:311:1: (lv_content_1_0= RULE_ID )
            // InternalScanner.g:312:3: lv_content_1_0= RULE_ID
            {
            lv_content_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            			newLeafNode(lv_content_1_0, grammarAccess.getExportAccess().getContentIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getExportRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"content",
                    		lv_content_1_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_2); 

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
    // InternalScanner.g:340:1: entryRuleGlobal returns [EObject current=null] : iv_ruleGlobal= ruleGlobal EOF ;
    public final EObject entryRuleGlobal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGlobal = null;


        try {
            // InternalScanner.g:341:2: (iv_ruleGlobal= ruleGlobal EOF )
            // InternalScanner.g:342:2: iv_ruleGlobal= ruleGlobal EOF
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
    // InternalScanner.g:349:1: ruleGlobal returns [EObject current=null] : (otherlv_0= 'GLOBAL {' ( (lv_content_1_0= RULE_ID ) ) otherlv_2= '}' ) ;
    public final EObject ruleGlobal() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_content_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // InternalScanner.g:352:28: ( (otherlv_0= 'GLOBAL {' ( (lv_content_1_0= RULE_ID ) ) otherlv_2= '}' ) )
            // InternalScanner.g:353:1: (otherlv_0= 'GLOBAL {' ( (lv_content_1_0= RULE_ID ) ) otherlv_2= '}' )
            {
            // InternalScanner.g:353:1: (otherlv_0= 'GLOBAL {' ( (lv_content_1_0= RULE_ID ) ) otherlv_2= '}' )
            // InternalScanner.g:353:3: otherlv_0= 'GLOBAL {' ( (lv_content_1_0= RULE_ID ) ) otherlv_2= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_5); 

                	newLeafNode(otherlv_0, grammarAccess.getGlobalAccess().getGLOBALKeyword_0());
                
            // InternalScanner.g:357:1: ( (lv_content_1_0= RULE_ID ) )
            // InternalScanner.g:358:1: (lv_content_1_0= RULE_ID )
            {
            // InternalScanner.g:358:1: (lv_content_1_0= RULE_ID )
            // InternalScanner.g:359:3: lv_content_1_0= RULE_ID
            {
            lv_content_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            			newLeafNode(lv_content_1_0, grammarAccess.getGlobalAccess().getContentIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getGlobalRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"content",
                    		lv_content_1_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_2); 

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
    // InternalScanner.g:387:1: entryRuleLocal returns [EObject current=null] : iv_ruleLocal= ruleLocal EOF ;
    public final EObject entryRuleLocal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocal = null;


        try {
            // InternalScanner.g:388:2: (iv_ruleLocal= ruleLocal EOF )
            // InternalScanner.g:389:2: iv_ruleLocal= ruleLocal EOF
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
    // InternalScanner.g:396:1: ruleLocal returns [EObject current=null] : (otherlv_0= 'LOCAL {' ( (lv_content_1_0= RULE_ID ) ) otherlv_2= '}' ) ;
    public final EObject ruleLocal() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_content_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // InternalScanner.g:399:28: ( (otherlv_0= 'LOCAL {' ( (lv_content_1_0= RULE_ID ) ) otherlv_2= '}' ) )
            // InternalScanner.g:400:1: (otherlv_0= 'LOCAL {' ( (lv_content_1_0= RULE_ID ) ) otherlv_2= '}' )
            {
            // InternalScanner.g:400:1: (otherlv_0= 'LOCAL {' ( (lv_content_1_0= RULE_ID ) ) otherlv_2= '}' )
            // InternalScanner.g:400:3: otherlv_0= 'LOCAL {' ( (lv_content_1_0= RULE_ID ) ) otherlv_2= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_5); 

                	newLeafNode(otherlv_0, grammarAccess.getLocalAccess().getLOCALKeyword_0());
                
            // InternalScanner.g:404:1: ( (lv_content_1_0= RULE_ID ) )
            // InternalScanner.g:405:1: (lv_content_1_0= RULE_ID )
            {
            // InternalScanner.g:405:1: (lv_content_1_0= RULE_ID )
            // InternalScanner.g:406:3: lv_content_1_0= RULE_ID
            {
            lv_content_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            			newLeafNode(lv_content_1_0, grammarAccess.getLocalAccess().getContentIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLocalRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"content",
                    		lv_content_1_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_2); 

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
    // InternalScanner.g:434:1: entryRuleDefault returns [EObject current=null] : iv_ruleDefault= ruleDefault EOF ;
    public final EObject entryRuleDefault() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefault = null;


        try {
            // InternalScanner.g:435:2: (iv_ruleDefault= ruleDefault EOF )
            // InternalScanner.g:436:2: iv_ruleDefault= ruleDefault EOF
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
    // InternalScanner.g:443:1: ruleDefault returns [EObject current=null] : (otherlv_0= 'DEFAULT {' ( (lv_content_1_0= RULE_ID ) ) otherlv_2= '}' ) ;
    public final EObject ruleDefault() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_content_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // InternalScanner.g:446:28: ( (otherlv_0= 'DEFAULT {' ( (lv_content_1_0= RULE_ID ) ) otherlv_2= '}' ) )
            // InternalScanner.g:447:1: (otherlv_0= 'DEFAULT {' ( (lv_content_1_0= RULE_ID ) ) otherlv_2= '}' )
            {
            // InternalScanner.g:447:1: (otherlv_0= 'DEFAULT {' ( (lv_content_1_0= RULE_ID ) ) otherlv_2= '}' )
            // InternalScanner.g:447:3: otherlv_0= 'DEFAULT {' ( (lv_content_1_0= RULE_ID ) ) otherlv_2= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_5); 

                	newLeafNode(otherlv_0, grammarAccess.getDefaultAccess().getDEFAULTKeyword_0());
                
            // InternalScanner.g:451:1: ( (lv_content_1_0= RULE_ID ) )
            // InternalScanner.g:452:1: (lv_content_1_0= RULE_ID )
            {
            // InternalScanner.g:452:1: (lv_content_1_0= RULE_ID )
            // InternalScanner.g:453:3: lv_content_1_0= RULE_ID
            {
            lv_content_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            			newLeafNode(lv_content_1_0, grammarAccess.getDefaultAccess().getContentIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDefaultRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"content",
                    		lv_content_1_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_2); 

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
    // InternalScanner.g:481:1: entryRuleEof returns [EObject current=null] : iv_ruleEof= ruleEof EOF ;
    public final EObject entryRuleEof() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEof = null;


        try {
            // InternalScanner.g:482:2: (iv_ruleEof= ruleEof EOF )
            // InternalScanner.g:483:2: iv_ruleEof= ruleEof EOF
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
    // InternalScanner.g:490:1: ruleEof returns [EObject current=null] : (otherlv_0= 'EOF {' ( (lv_content_1_0= RULE_ID ) ) otherlv_2= '}' ) ;
    public final EObject ruleEof() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_content_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // InternalScanner.g:493:28: ( (otherlv_0= 'EOF {' ( (lv_content_1_0= RULE_ID ) ) otherlv_2= '}' ) )
            // InternalScanner.g:494:1: (otherlv_0= 'EOF {' ( (lv_content_1_0= RULE_ID ) ) otherlv_2= '}' )
            {
            // InternalScanner.g:494:1: (otherlv_0= 'EOF {' ( (lv_content_1_0= RULE_ID ) ) otherlv_2= '}' )
            // InternalScanner.g:494:3: otherlv_0= 'EOF {' ( (lv_content_1_0= RULE_ID ) ) otherlv_2= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_5); 

                	newLeafNode(otherlv_0, grammarAccess.getEofAccess().getEOFKeyword_0());
                
            // InternalScanner.g:498:1: ( (lv_content_1_0= RULE_ID ) )
            // InternalScanner.g:499:1: (lv_content_1_0= RULE_ID )
            {
            // InternalScanner.g:499:1: (lv_content_1_0= RULE_ID )
            // InternalScanner.g:500:3: lv_content_1_0= RULE_ID
            {
            lv_content_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            			newLeafNode(lv_content_1_0, grammarAccess.getEofAccess().getContentIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEofRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"content",
                    		lv_content_1_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_2); 

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
    // InternalScanner.g:528:1: entryRuleDefine returns [EObject current=null] : iv_ruleDefine= ruleDefine EOF ;
    public final EObject entryRuleDefine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefine = null;


        try {
            // InternalScanner.g:529:2: (iv_ruleDefine= ruleDefine EOF )
            // InternalScanner.g:530:2: iv_ruleDefine= ruleDefine EOF
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
    // InternalScanner.g:537:1: ruleDefine returns [EObject current=null] : (otherlv_0= 'DEFINE' ( (lv_defines_1_0= ruleDefineRule ) )+ ) ;
    public final EObject ruleDefine() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_defines_1_0 = null;


         enterRule(); 
            
        try {
            // InternalScanner.g:540:28: ( (otherlv_0= 'DEFINE' ( (lv_defines_1_0= ruleDefineRule ) )+ ) )
            // InternalScanner.g:541:1: (otherlv_0= 'DEFINE' ( (lv_defines_1_0= ruleDefineRule ) )+ )
            {
            // InternalScanner.g:541:1: (otherlv_0= 'DEFINE' ( (lv_defines_1_0= ruleDefineRule ) )+ )
            // InternalScanner.g:541:3: otherlv_0= 'DEFINE' ( (lv_defines_1_0= ruleDefineRule ) )+
            {
            otherlv_0=(Token)match(input,18,FOLLOW_5); 

                	newLeafNode(otherlv_0, grammarAccess.getDefineAccess().getDEFINEKeyword_0());
                
            // InternalScanner.g:545:1: ( (lv_defines_1_0= ruleDefineRule ) )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalScanner.g:546:1: (lv_defines_1_0= ruleDefineRule )
            	    {
            	    // InternalScanner.g:546:1: (lv_defines_1_0= ruleDefineRule )
            	    // InternalScanner.g:547:3: lv_defines_1_0= ruleDefineRule
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
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
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
    // InternalScanner.g:571:1: entryRuleDefineRule returns [EObject current=null] : iv_ruleDefineRule= ruleDefineRule EOF ;
    public final EObject entryRuleDefineRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefineRule = null;


        try {
            // InternalScanner.g:572:2: (iv_ruleDefineRule= ruleDefineRule EOF )
            // InternalScanner.g:573:2: iv_ruleDefineRule= ruleDefineRule EOF
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
    // InternalScanner.g:580:1: ruleDefineRule returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_rule_2_0= RULE_ID ) ) otherlv_3= '.' ) ;
    public final EObject ruleDefineRule() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_rule_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // InternalScanner.g:583:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_rule_2_0= RULE_ID ) ) otherlv_3= '.' ) )
            // InternalScanner.g:584:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_rule_2_0= RULE_ID ) ) otherlv_3= '.' )
            {
            // InternalScanner.g:584:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_rule_2_0= RULE_ID ) ) otherlv_3= '.' )
            // InternalScanner.g:584:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_rule_2_0= RULE_ID ) ) otherlv_3= '.'
            {
            // InternalScanner.g:584:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalScanner.g:585:1: (lv_name_0_0= RULE_ID )
            {
            // InternalScanner.g:585:1: (lv_name_0_0= RULE_ID )
            // InternalScanner.g:586:3: lv_name_0_0= RULE_ID
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
                
            // InternalScanner.g:606:1: ( (lv_rule_2_0= RULE_ID ) )
            // InternalScanner.g:607:1: (lv_rule_2_0= RULE_ID )
            {
            // InternalScanner.g:607:1: (lv_rule_2_0= RULE_ID )
            // InternalScanner.g:608:3: lv_rule_2_0= RULE_ID
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
    // InternalScanner.g:636:1: entryRuleStartStates returns [EObject current=null] : iv_ruleStartStates= ruleStartStates EOF ;
    public final EObject entryRuleStartStates() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStartStates = null;


        try {
            // InternalScanner.g:637:2: (iv_ruleStartStates= ruleStartStates EOF )
            // InternalScanner.g:638:2: iv_ruleStartStates= ruleStartStates EOF
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
    // InternalScanner.g:645:1: ruleStartStates returns [EObject current=null] : (otherlv_0= 'START' ( (lv_incstates_1_0= ruleStartState ) ) (otherlv_2= ',' ( (lv_incstates_3_0= ruleStartState ) ) )* (otherlv_4= '-' ( (lv_exstates_5_0= ruleStartState ) ) (otherlv_6= ',' ( (lv_exstates_7_0= ruleStartState ) ) )* )? ) ;
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
            // InternalScanner.g:648:28: ( (otherlv_0= 'START' ( (lv_incstates_1_0= ruleStartState ) ) (otherlv_2= ',' ( (lv_incstates_3_0= ruleStartState ) ) )* (otherlv_4= '-' ( (lv_exstates_5_0= ruleStartState ) ) (otherlv_6= ',' ( (lv_exstates_7_0= ruleStartState ) ) )* )? ) )
            // InternalScanner.g:649:1: (otherlv_0= 'START' ( (lv_incstates_1_0= ruleStartState ) ) (otherlv_2= ',' ( (lv_incstates_3_0= ruleStartState ) ) )* (otherlv_4= '-' ( (lv_exstates_5_0= ruleStartState ) ) (otherlv_6= ',' ( (lv_exstates_7_0= ruleStartState ) ) )* )? )
            {
            // InternalScanner.g:649:1: (otherlv_0= 'START' ( (lv_incstates_1_0= ruleStartState ) ) (otherlv_2= ',' ( (lv_incstates_3_0= ruleStartState ) ) )* (otherlv_4= '-' ( (lv_exstates_5_0= ruleStartState ) ) (otherlv_6= ',' ( (lv_exstates_7_0= ruleStartState ) ) )* )? )
            // InternalScanner.g:649:3: otherlv_0= 'START' ( (lv_incstates_1_0= ruleStartState ) ) (otherlv_2= ',' ( (lv_incstates_3_0= ruleStartState ) ) )* (otherlv_4= '-' ( (lv_exstates_5_0= ruleStartState ) ) (otherlv_6= ',' ( (lv_exstates_7_0= ruleStartState ) ) )* )?
            {
            otherlv_0=(Token)match(input,21,FOLLOW_5); 

                	newLeafNode(otherlv_0, grammarAccess.getStartStatesAccess().getSTARTKeyword_0());
                
            // InternalScanner.g:653:1: ( (lv_incstates_1_0= ruleStartState ) )
            // InternalScanner.g:654:1: (lv_incstates_1_0= ruleStartState )
            {
            // InternalScanner.g:654:1: (lv_incstates_1_0= ruleStartState )
            // InternalScanner.g:655:3: lv_incstates_1_0= ruleStartState
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

            // InternalScanner.g:671:2: (otherlv_2= ',' ( (lv_incstates_3_0= ruleStartState ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==22) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalScanner.g:671:4: otherlv_2= ',' ( (lv_incstates_3_0= ruleStartState ) )
            	    {
            	    otherlv_2=(Token)match(input,22,FOLLOW_5); 

            	        	newLeafNode(otherlv_2, grammarAccess.getStartStatesAccess().getCommaKeyword_2_0());
            	        
            	    // InternalScanner.g:675:1: ( (lv_incstates_3_0= ruleStartState ) )
            	    // InternalScanner.g:676:1: (lv_incstates_3_0= ruleStartState )
            	    {
            	    // InternalScanner.g:676:1: (lv_incstates_3_0= ruleStartState )
            	    // InternalScanner.g:677:3: lv_incstates_3_0= ruleStartState
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
            	    break loop9;
                }
            } while (true);

            // InternalScanner.g:693:4: (otherlv_4= '-' ( (lv_exstates_5_0= ruleStartState ) ) (otherlv_6= ',' ( (lv_exstates_7_0= ruleStartState ) ) )* )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==23) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalScanner.g:693:6: otherlv_4= '-' ( (lv_exstates_5_0= ruleStartState ) ) (otherlv_6= ',' ( (lv_exstates_7_0= ruleStartState ) ) )*
                    {
                    otherlv_4=(Token)match(input,23,FOLLOW_5); 

                        	newLeafNode(otherlv_4, grammarAccess.getStartStatesAccess().getHyphenMinusKeyword_3_0());
                        
                    // InternalScanner.g:697:1: ( (lv_exstates_5_0= ruleStartState ) )
                    // InternalScanner.g:698:1: (lv_exstates_5_0= ruleStartState )
                    {
                    // InternalScanner.g:698:1: (lv_exstates_5_0= ruleStartState )
                    // InternalScanner.g:699:3: lv_exstates_5_0= ruleStartState
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

                    // InternalScanner.g:715:2: (otherlv_6= ',' ( (lv_exstates_7_0= ruleStartState ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==22) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalScanner.g:715:4: otherlv_6= ',' ( (lv_exstates_7_0= ruleStartState ) )
                    	    {
                    	    otherlv_6=(Token)match(input,22,FOLLOW_5); 

                    	        	newLeafNode(otherlv_6, grammarAccess.getStartStatesAccess().getCommaKeyword_3_2_0());
                    	        
                    	    // InternalScanner.g:719:1: ( (lv_exstates_7_0= ruleStartState ) )
                    	    // InternalScanner.g:720:1: (lv_exstates_7_0= ruleStartState )
                    	    {
                    	    // InternalScanner.g:720:1: (lv_exstates_7_0= ruleStartState )
                    	    // InternalScanner.g:721:3: lv_exstates_7_0= ruleStartState
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
                    	    break loop10;
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
    // InternalScanner.g:745:1: entryRuleStartState returns [EObject current=null] : iv_ruleStartState= ruleStartState EOF ;
    public final EObject entryRuleStartState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStartState = null;


        try {
            // InternalScanner.g:746:2: (iv_ruleStartState= ruleStartState EOF )
            // InternalScanner.g:747:2: iv_ruleStartState= ruleStartState EOF
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
    // InternalScanner.g:754:1: ruleStartState returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleStartState() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // InternalScanner.g:757:28: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalScanner.g:758:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalScanner.g:758:1: ( (lv_name_0_0= RULE_ID ) )
            // InternalScanner.g:759:1: (lv_name_0_0= RULE_ID )
            {
            // InternalScanner.g:759:1: (lv_name_0_0= RULE_ID )
            // InternalScanner.g:760:3: lv_name_0_0= RULE_ID
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
    // InternalScanner.g:784:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // InternalScanner.g:785:2: (iv_ruleRule= ruleRule EOF )
            // InternalScanner.g:786:2: iv_ruleRule= ruleRule EOF
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
    // InternalScanner.g:793:1: ruleRule returns [EObject current=null] : ( ( ( (lv_info_0_1= 'RULE' | lv_info_0_2= 'RULES' ) ) ) ( (lv_rules_1_0= ruleSingleRule ) )* ) ;
    public final EObject ruleRule() throws RecognitionException {
        EObject current = null;

        Token lv_info_0_1=null;
        Token lv_info_0_2=null;
        EObject lv_rules_1_0 = null;


         enterRule(); 
            
        try {
            // InternalScanner.g:796:28: ( ( ( ( (lv_info_0_1= 'RULE' | lv_info_0_2= 'RULES' ) ) ) ( (lv_rules_1_0= ruleSingleRule ) )* ) )
            // InternalScanner.g:797:1: ( ( ( (lv_info_0_1= 'RULE' | lv_info_0_2= 'RULES' ) ) ) ( (lv_rules_1_0= ruleSingleRule ) )* )
            {
            // InternalScanner.g:797:1: ( ( ( (lv_info_0_1= 'RULE' | lv_info_0_2= 'RULES' ) ) ) ( (lv_rules_1_0= ruleSingleRule ) )* )
            // InternalScanner.g:797:2: ( ( (lv_info_0_1= 'RULE' | lv_info_0_2= 'RULES' ) ) ) ( (lv_rules_1_0= ruleSingleRule ) )*
            {
            // InternalScanner.g:797:2: ( ( (lv_info_0_1= 'RULE' | lv_info_0_2= 'RULES' ) ) )
            // InternalScanner.g:798:1: ( (lv_info_0_1= 'RULE' | lv_info_0_2= 'RULES' ) )
            {
            // InternalScanner.g:798:1: ( (lv_info_0_1= 'RULE' | lv_info_0_2= 'RULES' ) )
            // InternalScanner.g:799:1: (lv_info_0_1= 'RULE' | lv_info_0_2= 'RULES' )
            {
            // InternalScanner.g:799:1: (lv_info_0_1= 'RULE' | lv_info_0_2= 'RULES' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==24) ) {
                alt12=1;
            }
            else if ( (LA12_0==25) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalScanner.g:800:3: lv_info_0_1= 'RULE'
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
                    // InternalScanner.g:812:8: lv_info_0_2= 'RULES'
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

            // InternalScanner.g:827:2: ( (lv_rules_1_0= ruleSingleRule ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_STRING||LA13_0==23||(LA13_0>=29 && LA13_0<=30)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalScanner.g:828:1: (lv_rules_1_0= ruleSingleRule )
            	    {
            	    // InternalScanner.g:828:1: (lv_rules_1_0= ruleSingleRule )
            	    // InternalScanner.g:829:3: lv_rules_1_0= ruleSingleRule
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
            	    break loop13;
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
    // InternalScanner.g:853:1: entryRuleSingleRule returns [EObject current=null] : iv_ruleSingleRule= ruleSingleRule EOF ;
    public final EObject entryRuleSingleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleRule = null;


        try {
            // InternalScanner.g:854:2: (iv_ruleSingleRule= ruleSingleRule EOF )
            // InternalScanner.g:855:2: iv_ruleSingleRule= ruleSingleRule EOF
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
    // InternalScanner.g:862:1: ruleSingleRule returns [EObject current=null] : ( (this_RuleStart_0= ruleRuleStart )? ( (lv_rule_1_0= RULE_STRING ) ) (otherlv_2= ':-' | otherlv_3= ':' ) otherlv_4= '{' ( (lv_content_5_0= RULE_ID ) ) otherlv_6= '}' ) ;
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
            // InternalScanner.g:865:28: ( ( (this_RuleStart_0= ruleRuleStart )? ( (lv_rule_1_0= RULE_STRING ) ) (otherlv_2= ':-' | otherlv_3= ':' ) otherlv_4= '{' ( (lv_content_5_0= RULE_ID ) ) otherlv_6= '}' ) )
            // InternalScanner.g:866:1: ( (this_RuleStart_0= ruleRuleStart )? ( (lv_rule_1_0= RULE_STRING ) ) (otherlv_2= ':-' | otherlv_3= ':' ) otherlv_4= '{' ( (lv_content_5_0= RULE_ID ) ) otherlv_6= '}' )
            {
            // InternalScanner.g:866:1: ( (this_RuleStart_0= ruleRuleStart )? ( (lv_rule_1_0= RULE_STRING ) ) (otherlv_2= ':-' | otherlv_3= ':' ) otherlv_4= '{' ( (lv_content_5_0= RULE_ID ) ) otherlv_6= '}' )
            // InternalScanner.g:866:2: (this_RuleStart_0= ruleRuleStart )? ( (lv_rule_1_0= RULE_STRING ) ) (otherlv_2= ':-' | otherlv_3= ':' ) otherlv_4= '{' ( (lv_content_5_0= RULE_ID ) ) otherlv_6= '}'
            {
            // InternalScanner.g:866:2: (this_RuleStart_0= ruleRuleStart )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==23||(LA14_0>=29 && LA14_0<=30)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalScanner.g:867:5: this_RuleStart_0= ruleRuleStart
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

            // InternalScanner.g:875:3: ( (lv_rule_1_0= RULE_STRING ) )
            // InternalScanner.g:876:1: (lv_rule_1_0= RULE_STRING )
            {
            // InternalScanner.g:876:1: (lv_rule_1_0= RULE_STRING )
            // InternalScanner.g:877:3: lv_rule_1_0= RULE_STRING
            {
            lv_rule_1_0=(Token)match(input,RULE_STRING,FOLLOW_14); 

            			newLeafNode(lv_rule_1_0, grammarAccess.getSingleRuleAccess().getRuleSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSingleRuleRule());
            	        }
                   		addWithLastConsumed(
                   			current, 
                   			"rule",
                    		lv_rule_1_0, 
                    		"org.eclipse.xtext.common.Terminals.STRING");
            	    

            }


            }

            // InternalScanner.g:893:2: (otherlv_2= ':-' | otherlv_3= ':' )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==26) ) {
                alt15=1;
            }
            else if ( (LA15_0==27) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalScanner.g:893:4: otherlv_2= ':-'
                    {
                    otherlv_2=(Token)match(input,26,FOLLOW_15); 

                        	newLeafNode(otherlv_2, grammarAccess.getSingleRuleAccess().getColonHyphenMinusKeyword_2_0());
                        

                    }
                    break;
                case 2 :
                    // InternalScanner.g:898:7: otherlv_3= ':'
                    {
                    otherlv_3=(Token)match(input,27,FOLLOW_15); 

                        	newLeafNode(otherlv_3, grammarAccess.getSingleRuleAccess().getColonKeyword_2_1());
                        

                    }
                    break;

            }

            otherlv_4=(Token)match(input,28,FOLLOW_5); 

                	newLeafNode(otherlv_4, grammarAccess.getSingleRuleAccess().getLeftCurlyBracketKeyword_3());
                
            // InternalScanner.g:906:1: ( (lv_content_5_0= RULE_ID ) )
            // InternalScanner.g:907:1: (lv_content_5_0= RULE_ID )
            {
            // InternalScanner.g:907:1: (lv_content_5_0= RULE_ID )
            // InternalScanner.g:908:3: lv_content_5_0= RULE_ID
            {
            lv_content_5_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            			newLeafNode(lv_content_5_0, grammarAccess.getSingleRuleAccess().getContentIDTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSingleRuleRule());
            	        }
                   		addWithLastConsumed(
                   			current, 
                   			"content",
                    		lv_content_5_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


            }

            otherlv_6=(Token)match(input,13,FOLLOW_2); 

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
    // InternalScanner.g:936:1: entryRuleRuleStart returns [EObject current=null] : iv_ruleRuleStart= ruleRuleStart EOF ;
    public final EObject entryRuleRuleStart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRuleStart = null;


        try {
            // InternalScanner.g:937:2: (iv_ruleRuleStart= ruleRuleStart EOF )
            // InternalScanner.g:938:2: iv_ruleRuleStart= ruleRuleStart EOF
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
    // InternalScanner.g:945:1: ruleRuleStart returns [EObject current=null] : ( (otherlv_0= 'NOT' | otherlv_1= '-' )? otherlv_2= '#' ( ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* ) | otherlv_6= 'STD' | otherlv_7= '*' ) otherlv_8= '#' ) ;
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
            // InternalScanner.g:948:28: ( ( (otherlv_0= 'NOT' | otherlv_1= '-' )? otherlv_2= '#' ( ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* ) | otherlv_6= 'STD' | otherlv_7= '*' ) otherlv_8= '#' ) )
            // InternalScanner.g:949:1: ( (otherlv_0= 'NOT' | otherlv_1= '-' )? otherlv_2= '#' ( ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* ) | otherlv_6= 'STD' | otherlv_7= '*' ) otherlv_8= '#' )
            {
            // InternalScanner.g:949:1: ( (otherlv_0= 'NOT' | otherlv_1= '-' )? otherlv_2= '#' ( ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* ) | otherlv_6= 'STD' | otherlv_7= '*' ) otherlv_8= '#' )
            // InternalScanner.g:949:2: (otherlv_0= 'NOT' | otherlv_1= '-' )? otherlv_2= '#' ( ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* ) | otherlv_6= 'STD' | otherlv_7= '*' ) otherlv_8= '#'
            {
            // InternalScanner.g:949:2: (otherlv_0= 'NOT' | otherlv_1= '-' )?
            int alt16=3;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==29) ) {
                alt16=1;
            }
            else if ( (LA16_0==23) ) {
                alt16=2;
            }
            switch (alt16) {
                case 1 :
                    // InternalScanner.g:949:4: otherlv_0= 'NOT'
                    {
                    otherlv_0=(Token)match(input,29,FOLLOW_16); 

                        	newLeafNode(otherlv_0, grammarAccess.getRuleStartAccess().getNOTKeyword_0_0());
                        

                    }
                    break;
                case 2 :
                    // InternalScanner.g:954:7: otherlv_1= '-'
                    {
                    otherlv_1=(Token)match(input,23,FOLLOW_16); 

                        	newLeafNode(otherlv_1, grammarAccess.getRuleStartAccess().getHyphenMinusKeyword_0_1());
                        

                    }
                    break;

            }

            otherlv_2=(Token)match(input,30,FOLLOW_17); 

                	newLeafNode(otherlv_2, grammarAccess.getRuleStartAccess().getNumberSignKeyword_1());
                
            // InternalScanner.g:962:1: ( ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* ) | otherlv_6= 'STD' | otherlv_7= '*' )
            int alt18=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt18=1;
                }
                break;
            case 31:
                {
                alt18=2;
                }
                break;
            case 32:
                {
                alt18=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalScanner.g:962:2: ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )
                    {
                    // InternalScanner.g:962:2: ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )
                    // InternalScanner.g:962:3: ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )*
                    {
                    // InternalScanner.g:962:3: ( (otherlv_3= RULE_ID ) )
                    // InternalScanner.g:963:1: (otherlv_3= RULE_ID )
                    {
                    // InternalScanner.g:963:1: (otherlv_3= RULE_ID )
                    // InternalScanner.g:964:3: otherlv_3= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getRuleStartRule());
                    	        }
                            
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_18); 

                    		newLeafNode(otherlv_3, grammarAccess.getRuleStartAccess().getStateStartStateCrossReference_2_0_0_0()); 
                    	

                    }


                    }

                    // InternalScanner.g:975:2: (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==22) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // InternalScanner.g:975:4: otherlv_4= ',' ( (otherlv_5= RULE_ID ) )
                    	    {
                    	    otherlv_4=(Token)match(input,22,FOLLOW_5); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getRuleStartAccess().getCommaKeyword_2_0_1_0());
                    	        
                    	    // InternalScanner.g:979:1: ( (otherlv_5= RULE_ID ) )
                    	    // InternalScanner.g:980:1: (otherlv_5= RULE_ID )
                    	    {
                    	    // InternalScanner.g:980:1: (otherlv_5= RULE_ID )
                    	    // InternalScanner.g:981:3: otherlv_5= RULE_ID
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
                    	    break loop17;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // InternalScanner.g:993:7: otherlv_6= 'STD'
                    {
                    otherlv_6=(Token)match(input,31,FOLLOW_16); 

                        	newLeafNode(otherlv_6, grammarAccess.getRuleStartAccess().getSTDKeyword_2_1());
                        

                    }
                    break;
                case 3 :
                    // InternalScanner.g:998:7: otherlv_7= '*'
                    {
                    otherlv_7=(Token)match(input,32,FOLLOW_16); 

                        	newLeafNode(otherlv_7, grammarAccess.getRuleStartAccess().getAsteriskKeyword_2_2());
                        

                    }
                    break;

            }

            otherlv_8=(Token)match(input,30,FOLLOW_2); 

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


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000000007D000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000003200000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000C00002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000060800022L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000180000010L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000040400000L});

}