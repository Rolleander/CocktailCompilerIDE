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
import de.roma.cocktail.xtext.services.AstGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAstParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_ANY_OTHER", "'MODULE'", "'END'", "'TREE'", "'PREFIX'", "'SUBUNIT'", "'VIEW'", "'IMPORT'", "'{'", "'}'", "'EXPORT'", "'GLOBAL'", "'LOCAL'", "'BEGIN'", "'CLOSE'", "'PROPERTY'", "'INPUT'", "'OUTPUT'", "'SYNTHESIZED'", "'INHERITED'", "'THREAD'", "'REVERSE'", "'IGNORE'", "'VIRTUAL'", "'IN'", "'OUT'", "'SYN'", "'INH'", "'REV'", "'DECLARE'", "'='", "':'", "'.'", "'RULE'", "'<-'", "'<'", "'>'", "'['", "':='", "']'", "'+'", "'-'", "'('", "')'", "'*'", "'/'", "'\\\\'", "'|'", "'?'", "'#'", "'$'", "'%'", "';'", "'!'", "','"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int RULE_STRING=5;
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


        public InternalAstParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalAstParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalAstParser.tokenNames; }
    public String getGrammarFileName() { return "InternalAst.g"; }



     	private AstGrammarAccess grammarAccess;

        public InternalAstParser(TokenStream input, AstGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected AstGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalAst.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalAst.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalAst.g:65:2: iv_ruleModel= ruleModel EOF
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
    // InternalAst.g:71:1: ruleModel returns [EObject current=null] : ( ( (lv_sepcification_0_0= ruleSpecification ) )? ( (lv_modules_1_0= ruleModules ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_sepcification_0_0 = null;

        EObject lv_modules_1_0 = null;



        	enterRule();

        try {
            // InternalAst.g:77:2: ( ( ( (lv_sepcification_0_0= ruleSpecification ) )? ( (lv_modules_1_0= ruleModules ) )* ) )
            // InternalAst.g:78:2: ( ( (lv_sepcification_0_0= ruleSpecification ) )? ( (lv_modules_1_0= ruleModules ) )* )
            {
            // InternalAst.g:78:2: ( ( (lv_sepcification_0_0= ruleSpecification ) )? ( (lv_modules_1_0= ruleModules ) )* )
            // InternalAst.g:79:3: ( (lv_sepcification_0_0= ruleSpecification ) )? ( (lv_modules_1_0= ruleModules ) )*
            {
            // InternalAst.g:79:3: ( (lv_sepcification_0_0= ruleSpecification ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalAst.g:80:4: (lv_sepcification_0_0= ruleSpecification )
                    {
                    // InternalAst.g:80:4: (lv_sepcification_0_0= ruleSpecification )
                    // InternalAst.g:81:5: lv_sepcification_0_0= ruleSpecification
                    {

                    					newCompositeNode(grammarAccess.getModelAccess().getSepcificationSpecificationParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_3);
                    lv_sepcification_0_0=ruleSpecification();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getModelRule());
                    					}
                    					set(
                    						current,
                    						"sepcification",
                    						lv_sepcification_0_0,
                    						"de.roma.cocktail.xtext.Ast.Specification");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalAst.g:98:3: ( (lv_modules_1_0= ruleModules ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==11) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalAst.g:99:4: (lv_modules_1_0= ruleModules )
            	    {
            	    // InternalAst.g:99:4: (lv_modules_1_0= ruleModules )
            	    // InternalAst.g:100:5: lv_modules_1_0= ruleModules
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getModulesModulesParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_modules_1_0=ruleModules();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"modules",
            	    						lv_modules_1_0,
            	    						"de.roma.cocktail.xtext.Ast.Modules");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleModuleName"
    // InternalAst.g:121:1: entryRuleModuleName returns [EObject current=null] : iv_ruleModuleName= ruleModuleName EOF ;
    public final EObject entryRuleModuleName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModuleName = null;


        try {
            // InternalAst.g:121:51: (iv_ruleModuleName= ruleModuleName EOF )
            // InternalAst.g:122:2: iv_ruleModuleName= ruleModuleName EOF
            {
             newCompositeNode(grammarAccess.getModuleNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModuleName=ruleModuleName();

            state._fsp--;

             current =iv_ruleModuleName; 
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
    // $ANTLR end "entryRuleModuleName"


    // $ANTLR start "ruleModuleName"
    // InternalAst.g:128:1: ruleModuleName returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) | this_STRING_1= RULE_STRING ) ;
    public final EObject ruleModuleName() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token this_STRING_1=null;


        	enterRule();

        try {
            // InternalAst.g:134:2: ( ( ( (lv_name_0_0= RULE_ID ) ) | this_STRING_1= RULE_STRING ) )
            // InternalAst.g:135:2: ( ( (lv_name_0_0= RULE_ID ) ) | this_STRING_1= RULE_STRING )
            {
            // InternalAst.g:135:2: ( ( (lv_name_0_0= RULE_ID ) ) | this_STRING_1= RULE_STRING )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_STRING) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalAst.g:136:3: ( (lv_name_0_0= RULE_ID ) )
                    {
                    // InternalAst.g:136:3: ( (lv_name_0_0= RULE_ID ) )
                    // InternalAst.g:137:4: (lv_name_0_0= RULE_ID )
                    {
                    // InternalAst.g:137:4: (lv_name_0_0= RULE_ID )
                    // InternalAst.g:138:5: lv_name_0_0= RULE_ID
                    {
                    lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(lv_name_0_0, grammarAccess.getModuleNameAccess().getNameIDTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getModuleNameRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_0_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAst.g:155:3: this_STRING_1= RULE_STRING
                    {
                    this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			newLeafNode(this_STRING_1, grammarAccess.getModuleNameAccess().getSTRINGTerminalRuleCall_1());
                    		

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
    // $ANTLR end "ruleModuleName"


    // $ANTLR start "entryRuleModules"
    // InternalAst.g:163:1: entryRuleModules returns [EObject current=null] : iv_ruleModules= ruleModules EOF ;
    public final EObject entryRuleModules() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModules = null;


        try {
            // InternalAst.g:163:48: (iv_ruleModules= ruleModules EOF )
            // InternalAst.g:164:2: iv_ruleModules= ruleModules EOF
            {
             newCompositeNode(grammarAccess.getModulesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModules=ruleModules();

            state._fsp--;

             current =iv_ruleModules; 
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
    // $ANTLR end "entryRuleModules"


    // $ANTLR start "ruleModules"
    // InternalAst.g:170:1: ruleModules returns [EObject current=null] : (otherlv_0= 'MODULE' ( (lv_moduleName_1_0= ruleModuleName ) ) ( (lv_specification_2_0= ruleSpecification ) ) otherlv_3= 'END' ( (otherlv_4= RULE_ID ) ) ) ;
    public final EObject ruleModules() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_moduleName_1_0 = null;

        EObject lv_specification_2_0 = null;



        	enterRule();

        try {
            // InternalAst.g:176:2: ( (otherlv_0= 'MODULE' ( (lv_moduleName_1_0= ruleModuleName ) ) ( (lv_specification_2_0= ruleSpecification ) ) otherlv_3= 'END' ( (otherlv_4= RULE_ID ) ) ) )
            // InternalAst.g:177:2: (otherlv_0= 'MODULE' ( (lv_moduleName_1_0= ruleModuleName ) ) ( (lv_specification_2_0= ruleSpecification ) ) otherlv_3= 'END' ( (otherlv_4= RULE_ID ) ) )
            {
            // InternalAst.g:177:2: (otherlv_0= 'MODULE' ( (lv_moduleName_1_0= ruleModuleName ) ) ( (lv_specification_2_0= ruleSpecification ) ) otherlv_3= 'END' ( (otherlv_4= RULE_ID ) ) )
            // InternalAst.g:178:3: otherlv_0= 'MODULE' ( (lv_moduleName_1_0= ruleModuleName ) ) ( (lv_specification_2_0= ruleSpecification ) ) otherlv_3= 'END' ( (otherlv_4= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getModulesAccess().getMODULEKeyword_0());
            		
            // InternalAst.g:182:3: ( (lv_moduleName_1_0= ruleModuleName ) )
            // InternalAst.g:183:4: (lv_moduleName_1_0= ruleModuleName )
            {
            // InternalAst.g:183:4: (lv_moduleName_1_0= ruleModuleName )
            // InternalAst.g:184:5: lv_moduleName_1_0= ruleModuleName
            {

            					newCompositeNode(grammarAccess.getModulesAccess().getModuleNameModuleNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_moduleName_1_0=ruleModuleName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModulesRule());
            					}
            					set(
            						current,
            						"moduleName",
            						lv_moduleName_1_0,
            						"de.roma.cocktail.xtext.Ast.ModuleName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAst.g:201:3: ( (lv_specification_2_0= ruleSpecification ) )
            // InternalAst.g:202:4: (lv_specification_2_0= ruleSpecification )
            {
            // InternalAst.g:202:4: (lv_specification_2_0= ruleSpecification )
            // InternalAst.g:203:5: lv_specification_2_0= ruleSpecification
            {

            					newCompositeNode(grammarAccess.getModulesAccess().getSpecificationSpecificationParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_6);
            lv_specification_2_0=ruleSpecification();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModulesRule());
            					}
            					set(
            						current,
            						"specification",
            						lv_specification_2_0,
            						"de.roma.cocktail.xtext.Ast.Specification");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getModulesAccess().getENDKeyword_3());
            		
            // InternalAst.g:224:3: ( (otherlv_4= RULE_ID ) )
            // InternalAst.g:225:4: (otherlv_4= RULE_ID )
            {
            // InternalAst.g:225:4: (otherlv_4= RULE_ID )
            // InternalAst.g:226:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getModulesRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_4, grammarAccess.getModulesAccess().getModuleNameEndModuleNameCrossReference_4_0());
            				

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
    // $ANTLR end "ruleModules"


    // $ANTLR start "entryRuleSpecification"
    // InternalAst.g:241:1: entryRuleSpecification returns [EObject current=null] : iv_ruleSpecification= ruleSpecification EOF ;
    public final EObject entryRuleSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpecification = null;


        try {
            // InternalAst.g:241:54: (iv_ruleSpecification= ruleSpecification EOF )
            // InternalAst.g:242:2: iv_ruleSpecification= ruleSpecification EOF
            {
             newCompositeNode(grammarAccess.getSpecificationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSpecification=ruleSpecification();

            state._fsp--;

             current =iv_ruleSpecification; 
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
    // $ANTLR end "entryRuleSpecification"


    // $ANTLR start "ruleSpecification"
    // InternalAst.g:248:1: ruleSpecification returns [EObject current=null] : ( ( (lv_tree_0_0= ruleTree ) ) ( (lv_code_1_0= ruleCodes ) ) ( (lv_properties_2_0= ruleProperties ) )? ( (lv_declare_3_0= ruleDeclare ) )? ( (lv_rules_4_0= ruleRule ) )? ) ;
    public final EObject ruleSpecification() throws RecognitionException {
        EObject current = null;

        EObject lv_tree_0_0 = null;

        EObject lv_code_1_0 = null;

        EObject lv_properties_2_0 = null;

        EObject lv_declare_3_0 = null;

        EObject lv_rules_4_0 = null;



        	enterRule();

        try {
            // InternalAst.g:254:2: ( ( ( (lv_tree_0_0= ruleTree ) ) ( (lv_code_1_0= ruleCodes ) ) ( (lv_properties_2_0= ruleProperties ) )? ( (lv_declare_3_0= ruleDeclare ) )? ( (lv_rules_4_0= ruleRule ) )? ) )
            // InternalAst.g:255:2: ( ( (lv_tree_0_0= ruleTree ) ) ( (lv_code_1_0= ruleCodes ) ) ( (lv_properties_2_0= ruleProperties ) )? ( (lv_declare_3_0= ruleDeclare ) )? ( (lv_rules_4_0= ruleRule ) )? )
            {
            // InternalAst.g:255:2: ( ( (lv_tree_0_0= ruleTree ) ) ( (lv_code_1_0= ruleCodes ) ) ( (lv_properties_2_0= ruleProperties ) )? ( (lv_declare_3_0= ruleDeclare ) )? ( (lv_rules_4_0= ruleRule ) )? )
            // InternalAst.g:256:3: ( (lv_tree_0_0= ruleTree ) ) ( (lv_code_1_0= ruleCodes ) ) ( (lv_properties_2_0= ruleProperties ) )? ( (lv_declare_3_0= ruleDeclare ) )? ( (lv_rules_4_0= ruleRule ) )?
            {
            // InternalAst.g:256:3: ( (lv_tree_0_0= ruleTree ) )
            // InternalAst.g:257:4: (lv_tree_0_0= ruleTree )
            {
            // InternalAst.g:257:4: (lv_tree_0_0= ruleTree )
            // InternalAst.g:258:5: lv_tree_0_0= ruleTree
            {

            					newCompositeNode(grammarAccess.getSpecificationAccess().getTreeTreeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_8);
            lv_tree_0_0=ruleTree();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSpecificationRule());
            					}
            					set(
            						current,
            						"tree",
            						lv_tree_0_0,
            						"de.roma.cocktail.xtext.Ast.Tree");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAst.g:275:3: ( (lv_code_1_0= ruleCodes ) )
            // InternalAst.g:276:4: (lv_code_1_0= ruleCodes )
            {
            // InternalAst.g:276:4: (lv_code_1_0= ruleCodes )
            // InternalAst.g:277:5: lv_code_1_0= ruleCodes
            {

            					newCompositeNode(grammarAccess.getSpecificationAccess().getCodeCodesParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_9);
            lv_code_1_0=ruleCodes();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSpecificationRule());
            					}
            					set(
            						current,
            						"code",
            						lv_code_1_0,
            						"de.roma.cocktail.xtext.Ast.Codes");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAst.g:294:3: ( (lv_properties_2_0= ruleProperties ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==25) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalAst.g:295:4: (lv_properties_2_0= ruleProperties )
                    {
                    // InternalAst.g:295:4: (lv_properties_2_0= ruleProperties )
                    // InternalAst.g:296:5: lv_properties_2_0= ruleProperties
                    {

                    					newCompositeNode(grammarAccess.getSpecificationAccess().getPropertiesPropertiesParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_10);
                    lv_properties_2_0=ruleProperties();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSpecificationRule());
                    					}
                    					set(
                    						current,
                    						"properties",
                    						lv_properties_2_0,
                    						"de.roma.cocktail.xtext.Ast.Properties");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalAst.g:313:3: ( (lv_declare_3_0= ruleDeclare ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==39) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalAst.g:314:4: (lv_declare_3_0= ruleDeclare )
                    {
                    // InternalAst.g:314:4: (lv_declare_3_0= ruleDeclare )
                    // InternalAst.g:315:5: lv_declare_3_0= ruleDeclare
                    {

                    					newCompositeNode(grammarAccess.getSpecificationAccess().getDeclareDeclareParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_11);
                    lv_declare_3_0=ruleDeclare();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSpecificationRule());
                    					}
                    					set(
                    						current,
                    						"declare",
                    						lv_declare_3_0,
                    						"de.roma.cocktail.xtext.Ast.Declare");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalAst.g:332:3: ( (lv_rules_4_0= ruleRule ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==43) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalAst.g:333:4: (lv_rules_4_0= ruleRule )
                    {
                    // InternalAst.g:333:4: (lv_rules_4_0= ruleRule )
                    // InternalAst.g:334:5: lv_rules_4_0= ruleRule
                    {

                    					newCompositeNode(grammarAccess.getSpecificationAccess().getRulesRuleParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_rules_4_0=ruleRule();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSpecificationRule());
                    					}
                    					set(
                    						current,
                    						"rules",
                    						lv_rules_4_0,
                    						"de.roma.cocktail.xtext.Ast.Rule");
                    					afterParserOrEnumRuleCall();
                    				

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
    // $ANTLR end "ruleSpecification"


    // $ANTLR start "entryRuleCodes"
    // InternalAst.g:355:1: entryRuleCodes returns [EObject current=null] : iv_ruleCodes= ruleCodes EOF ;
    public final EObject entryRuleCodes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCodes = null;


        try {
            // InternalAst.g:355:46: (iv_ruleCodes= ruleCodes EOF )
            // InternalAst.g:356:2: iv_ruleCodes= ruleCodes EOF
            {
             newCompositeNode(grammarAccess.getCodesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCodes=ruleCodes();

            state._fsp--;

             current =iv_ruleCodes; 
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
    // $ANTLR end "entryRuleCodes"


    // $ANTLR start "ruleCodes"
    // InternalAst.g:362:1: ruleCodes returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => ( (lv_imp_1_0= ruleImport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_exp_2_0= ruleExport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_glo_3_0= ruleGlobal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_loc_4_0= ruleLocal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_beg_5_0= ruleBegin ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_clo_6_0= ruleClose ) ) ) ) ) )* ) ) ) ;
    public final EObject ruleCodes() throws RecognitionException {
        EObject current = null;

        EObject lv_imp_1_0 = null;

        EObject lv_exp_2_0 = null;

        EObject lv_glo_3_0 = null;

        EObject lv_loc_4_0 = null;

        EObject lv_beg_5_0 = null;

        EObject lv_clo_6_0 = null;



        	enterRule();

        try {
            // InternalAst.g:368:2: ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_imp_1_0= ruleImport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_exp_2_0= ruleExport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_glo_3_0= ruleGlobal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_loc_4_0= ruleLocal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_beg_5_0= ruleBegin ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_clo_6_0= ruleClose ) ) ) ) ) )* ) ) ) )
            // InternalAst.g:369:2: ( ( ( ( ({...}? => ( ({...}? => ( (lv_imp_1_0= ruleImport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_exp_2_0= ruleExport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_glo_3_0= ruleGlobal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_loc_4_0= ruleLocal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_beg_5_0= ruleBegin ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_clo_6_0= ruleClose ) ) ) ) ) )* ) ) )
            {
            // InternalAst.g:369:2: ( ( ( ( ({...}? => ( ({...}? => ( (lv_imp_1_0= ruleImport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_exp_2_0= ruleExport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_glo_3_0= ruleGlobal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_loc_4_0= ruleLocal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_beg_5_0= ruleBegin ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_clo_6_0= ruleClose ) ) ) ) ) )* ) ) )
            // InternalAst.g:370:3: ( ( ( ({...}? => ( ({...}? => ( (lv_imp_1_0= ruleImport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_exp_2_0= ruleExport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_glo_3_0= ruleGlobal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_loc_4_0= ruleLocal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_beg_5_0= ruleBegin ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_clo_6_0= ruleClose ) ) ) ) ) )* ) )
            {
            // InternalAst.g:370:3: ( ( ( ({...}? => ( ({...}? => ( (lv_imp_1_0= ruleImport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_exp_2_0= ruleExport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_glo_3_0= ruleGlobal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_loc_4_0= ruleLocal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_beg_5_0= ruleBegin ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_clo_6_0= ruleClose ) ) ) ) ) )* ) )
            // InternalAst.g:371:4: ( ( ({...}? => ( ({...}? => ( (lv_imp_1_0= ruleImport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_exp_2_0= ruleExport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_glo_3_0= ruleGlobal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_loc_4_0= ruleLocal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_beg_5_0= ruleBegin ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_clo_6_0= ruleClose ) ) ) ) ) )* )
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getCodesAccess().getUnorderedGroup());
            			
            // InternalAst.g:374:4: ( ( ({...}? => ( ({...}? => ( (lv_imp_1_0= ruleImport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_exp_2_0= ruleExport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_glo_3_0= ruleGlobal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_loc_4_0= ruleLocal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_beg_5_0= ruleBegin ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_clo_6_0= ruleClose ) ) ) ) ) )* )
            // InternalAst.g:375:5: ( ({...}? => ( ({...}? => ( (lv_imp_1_0= ruleImport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_exp_2_0= ruleExport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_glo_3_0= ruleGlobal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_loc_4_0= ruleLocal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_beg_5_0= ruleBegin ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_clo_6_0= ruleClose ) ) ) ) ) )*
            {
            // InternalAst.g:375:5: ( ({...}? => ( ({...}? => ( (lv_imp_1_0= ruleImport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_exp_2_0= ruleExport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_glo_3_0= ruleGlobal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_loc_4_0= ruleLocal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_beg_5_0= ruleBegin ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_clo_6_0= ruleClose ) ) ) ) ) )*
            loop7:
            do {
                int alt7=7;
                int LA7_0 = input.LA(1);

                if ( LA7_0 == 17 && getUnorderedGroupHelper().canSelect(grammarAccess.getCodesAccess().getUnorderedGroup(), 0) ) {
                    alt7=1;
                }
                else if ( LA7_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getCodesAccess().getUnorderedGroup(), 1) ) {
                    alt7=2;
                }
                else if ( LA7_0 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getCodesAccess().getUnorderedGroup(), 2) ) {
                    alt7=3;
                }
                else if ( LA7_0 == 22 && getUnorderedGroupHelper().canSelect(grammarAccess.getCodesAccess().getUnorderedGroup(), 3) ) {
                    alt7=4;
                }
                else if ( LA7_0 == 23 && getUnorderedGroupHelper().canSelect(grammarAccess.getCodesAccess().getUnorderedGroup(), 4) ) {
                    alt7=5;
                }
                else if ( LA7_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getCodesAccess().getUnorderedGroup(), 5) ) {
                    alt7=6;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalAst.g:376:3: ({...}? => ( ({...}? => ( (lv_imp_1_0= ruleImport ) ) ) ) )
            	    {
            	    // InternalAst.g:376:3: ({...}? => ( ({...}? => ( (lv_imp_1_0= ruleImport ) ) ) ) )
            	    // InternalAst.g:377:4: {...}? => ( ({...}? => ( (lv_imp_1_0= ruleImport ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCodesAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleCodes", "getUnorderedGroupHelper().canSelect(grammarAccess.getCodesAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalAst.g:377:99: ( ({...}? => ( (lv_imp_1_0= ruleImport ) ) ) )
            	    // InternalAst.g:378:5: ({...}? => ( (lv_imp_1_0= ruleImport ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getCodesAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalAst.g:381:8: ({...}? => ( (lv_imp_1_0= ruleImport ) ) )
            	    // InternalAst.g:381:9: {...}? => ( (lv_imp_1_0= ruleImport ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleCodes", "true");
            	    }
            	    // InternalAst.g:381:18: ( (lv_imp_1_0= ruleImport ) )
            	    // InternalAst.g:381:19: (lv_imp_1_0= ruleImport )
            	    {
            	    // InternalAst.g:381:19: (lv_imp_1_0= ruleImport )
            	    // InternalAst.g:382:9: lv_imp_1_0= ruleImport
            	    {

            	    									newCompositeNode(grammarAccess.getCodesAccess().getImpImportParserRuleCall_0_0());
            	    								
            	    pushFollow(FOLLOW_12);
            	    lv_imp_1_0=ruleImport();

            	    state._fsp--;


            	    									if (current==null) {
            	    										current = createModelElementForParent(grammarAccess.getCodesRule());
            	    									}
            	    									set(
            	    										current,
            	    										"imp",
            	    										lv_imp_1_0,
            	    										"de.roma.cocktail.xtext.Ast.Import");
            	    									afterParserOrEnumRuleCall();
            	    								

            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getCodesAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalAst.g:404:3: ({...}? => ( ({...}? => ( (lv_exp_2_0= ruleExport ) ) ) ) )
            	    {
            	    // InternalAst.g:404:3: ({...}? => ( ({...}? => ( (lv_exp_2_0= ruleExport ) ) ) ) )
            	    // InternalAst.g:405:4: {...}? => ( ({...}? => ( (lv_exp_2_0= ruleExport ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCodesAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleCodes", "getUnorderedGroupHelper().canSelect(grammarAccess.getCodesAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalAst.g:405:99: ( ({...}? => ( (lv_exp_2_0= ruleExport ) ) ) )
            	    // InternalAst.g:406:5: ({...}? => ( (lv_exp_2_0= ruleExport ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getCodesAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalAst.g:409:8: ({...}? => ( (lv_exp_2_0= ruleExport ) ) )
            	    // InternalAst.g:409:9: {...}? => ( (lv_exp_2_0= ruleExport ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleCodes", "true");
            	    }
            	    // InternalAst.g:409:18: ( (lv_exp_2_0= ruleExport ) )
            	    // InternalAst.g:409:19: (lv_exp_2_0= ruleExport )
            	    {
            	    // InternalAst.g:409:19: (lv_exp_2_0= ruleExport )
            	    // InternalAst.g:410:9: lv_exp_2_0= ruleExport
            	    {

            	    									newCompositeNode(grammarAccess.getCodesAccess().getExpExportParserRuleCall_1_0());
            	    								
            	    pushFollow(FOLLOW_12);
            	    lv_exp_2_0=ruleExport();

            	    state._fsp--;


            	    									if (current==null) {
            	    										current = createModelElementForParent(grammarAccess.getCodesRule());
            	    									}
            	    									set(
            	    										current,
            	    										"exp",
            	    										lv_exp_2_0,
            	    										"de.roma.cocktail.xtext.Ast.Export");
            	    									afterParserOrEnumRuleCall();
            	    								

            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getCodesAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalAst.g:432:3: ({...}? => ( ({...}? => ( (lv_glo_3_0= ruleGlobal ) ) ) ) )
            	    {
            	    // InternalAst.g:432:3: ({...}? => ( ({...}? => ( (lv_glo_3_0= ruleGlobal ) ) ) ) )
            	    // InternalAst.g:433:4: {...}? => ( ({...}? => ( (lv_glo_3_0= ruleGlobal ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCodesAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleCodes", "getUnorderedGroupHelper().canSelect(grammarAccess.getCodesAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalAst.g:433:99: ( ({...}? => ( (lv_glo_3_0= ruleGlobal ) ) ) )
            	    // InternalAst.g:434:5: ({...}? => ( (lv_glo_3_0= ruleGlobal ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getCodesAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalAst.g:437:8: ({...}? => ( (lv_glo_3_0= ruleGlobal ) ) )
            	    // InternalAst.g:437:9: {...}? => ( (lv_glo_3_0= ruleGlobal ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleCodes", "true");
            	    }
            	    // InternalAst.g:437:18: ( (lv_glo_3_0= ruleGlobal ) )
            	    // InternalAst.g:437:19: (lv_glo_3_0= ruleGlobal )
            	    {
            	    // InternalAst.g:437:19: (lv_glo_3_0= ruleGlobal )
            	    // InternalAst.g:438:9: lv_glo_3_0= ruleGlobal
            	    {

            	    									newCompositeNode(grammarAccess.getCodesAccess().getGloGlobalParserRuleCall_2_0());
            	    								
            	    pushFollow(FOLLOW_12);
            	    lv_glo_3_0=ruleGlobal();

            	    state._fsp--;


            	    									if (current==null) {
            	    										current = createModelElementForParent(grammarAccess.getCodesRule());
            	    									}
            	    									set(
            	    										current,
            	    										"glo",
            	    										lv_glo_3_0,
            	    										"de.roma.cocktail.xtext.Ast.Global");
            	    									afterParserOrEnumRuleCall();
            	    								

            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getCodesAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalAst.g:460:3: ({...}? => ( ({...}? => ( (lv_loc_4_0= ruleLocal ) ) ) ) )
            	    {
            	    // InternalAst.g:460:3: ({...}? => ( ({...}? => ( (lv_loc_4_0= ruleLocal ) ) ) ) )
            	    // InternalAst.g:461:4: {...}? => ( ({...}? => ( (lv_loc_4_0= ruleLocal ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCodesAccess().getUnorderedGroup(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleCodes", "getUnorderedGroupHelper().canSelect(grammarAccess.getCodesAccess().getUnorderedGroup(), 3)");
            	    }
            	    // InternalAst.g:461:99: ( ({...}? => ( (lv_loc_4_0= ruleLocal ) ) ) )
            	    // InternalAst.g:462:5: ({...}? => ( (lv_loc_4_0= ruleLocal ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getCodesAccess().getUnorderedGroup(), 3);
            	    				
            	    // InternalAst.g:465:8: ({...}? => ( (lv_loc_4_0= ruleLocal ) ) )
            	    // InternalAst.g:465:9: {...}? => ( (lv_loc_4_0= ruleLocal ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleCodes", "true");
            	    }
            	    // InternalAst.g:465:18: ( (lv_loc_4_0= ruleLocal ) )
            	    // InternalAst.g:465:19: (lv_loc_4_0= ruleLocal )
            	    {
            	    // InternalAst.g:465:19: (lv_loc_4_0= ruleLocal )
            	    // InternalAst.g:466:9: lv_loc_4_0= ruleLocal
            	    {

            	    									newCompositeNode(grammarAccess.getCodesAccess().getLocLocalParserRuleCall_3_0());
            	    								
            	    pushFollow(FOLLOW_12);
            	    lv_loc_4_0=ruleLocal();

            	    state._fsp--;


            	    									if (current==null) {
            	    										current = createModelElementForParent(grammarAccess.getCodesRule());
            	    									}
            	    									set(
            	    										current,
            	    										"loc",
            	    										lv_loc_4_0,
            	    										"de.roma.cocktail.xtext.Ast.Local");
            	    									afterParserOrEnumRuleCall();
            	    								

            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getCodesAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalAst.g:488:3: ({...}? => ( ({...}? => ( (lv_beg_5_0= ruleBegin ) ) ) ) )
            	    {
            	    // InternalAst.g:488:3: ({...}? => ( ({...}? => ( (lv_beg_5_0= ruleBegin ) ) ) ) )
            	    // InternalAst.g:489:4: {...}? => ( ({...}? => ( (lv_beg_5_0= ruleBegin ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCodesAccess().getUnorderedGroup(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleCodes", "getUnorderedGroupHelper().canSelect(grammarAccess.getCodesAccess().getUnorderedGroup(), 4)");
            	    }
            	    // InternalAst.g:489:99: ( ({...}? => ( (lv_beg_5_0= ruleBegin ) ) ) )
            	    // InternalAst.g:490:5: ({...}? => ( (lv_beg_5_0= ruleBegin ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getCodesAccess().getUnorderedGroup(), 4);
            	    				
            	    // InternalAst.g:493:8: ({...}? => ( (lv_beg_5_0= ruleBegin ) ) )
            	    // InternalAst.g:493:9: {...}? => ( (lv_beg_5_0= ruleBegin ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleCodes", "true");
            	    }
            	    // InternalAst.g:493:18: ( (lv_beg_5_0= ruleBegin ) )
            	    // InternalAst.g:493:19: (lv_beg_5_0= ruleBegin )
            	    {
            	    // InternalAst.g:493:19: (lv_beg_5_0= ruleBegin )
            	    // InternalAst.g:494:9: lv_beg_5_0= ruleBegin
            	    {

            	    									newCompositeNode(grammarAccess.getCodesAccess().getBegBeginParserRuleCall_4_0());
            	    								
            	    pushFollow(FOLLOW_12);
            	    lv_beg_5_0=ruleBegin();

            	    state._fsp--;


            	    									if (current==null) {
            	    										current = createModelElementForParent(grammarAccess.getCodesRule());
            	    									}
            	    									set(
            	    										current,
            	    										"beg",
            	    										lv_beg_5_0,
            	    										"de.roma.cocktail.xtext.Ast.Begin");
            	    									afterParserOrEnumRuleCall();
            	    								

            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getCodesAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalAst.g:516:3: ({...}? => ( ({...}? => ( (lv_clo_6_0= ruleClose ) ) ) ) )
            	    {
            	    // InternalAst.g:516:3: ({...}? => ( ({...}? => ( (lv_clo_6_0= ruleClose ) ) ) ) )
            	    // InternalAst.g:517:4: {...}? => ( ({...}? => ( (lv_clo_6_0= ruleClose ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCodesAccess().getUnorderedGroup(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleCodes", "getUnorderedGroupHelper().canSelect(grammarAccess.getCodesAccess().getUnorderedGroup(), 5)");
            	    }
            	    // InternalAst.g:517:99: ( ({...}? => ( (lv_clo_6_0= ruleClose ) ) ) )
            	    // InternalAst.g:518:5: ({...}? => ( (lv_clo_6_0= ruleClose ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getCodesAccess().getUnorderedGroup(), 5);
            	    				
            	    // InternalAst.g:521:8: ({...}? => ( (lv_clo_6_0= ruleClose ) ) )
            	    // InternalAst.g:521:9: {...}? => ( (lv_clo_6_0= ruleClose ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleCodes", "true");
            	    }
            	    // InternalAst.g:521:18: ( (lv_clo_6_0= ruleClose ) )
            	    // InternalAst.g:521:19: (lv_clo_6_0= ruleClose )
            	    {
            	    // InternalAst.g:521:19: (lv_clo_6_0= ruleClose )
            	    // InternalAst.g:522:9: lv_clo_6_0= ruleClose
            	    {

            	    									newCompositeNode(grammarAccess.getCodesAccess().getCloCloseParserRuleCall_5_0());
            	    								
            	    pushFollow(FOLLOW_12);
            	    lv_clo_6_0=ruleClose();

            	    state._fsp--;


            	    									if (current==null) {
            	    										current = createModelElementForParent(grammarAccess.getCodesRule());
            	    									}
            	    									set(
            	    										current,
            	    										"clo",
            	    										lv_clo_6_0,
            	    										"de.roma.cocktail.xtext.Ast.Close");
            	    									afterParserOrEnumRuleCall();
            	    								

            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getCodesAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }


            }

             
            			  getUnorderedGroupHelper().leave(grammarAccess.getCodesAccess().getUnorderedGroup());
            			

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
    // $ANTLR end "ruleCodes"


    // $ANTLR start "entryRuleTree"
    // InternalAst.g:554:1: entryRuleTree returns [EObject current=null] : iv_ruleTree= ruleTree EOF ;
    public final EObject entryRuleTree() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTree = null;


        try {
            // InternalAst.g:554:45: (iv_ruleTree= ruleTree EOF )
            // InternalAst.g:555:2: iv_ruleTree= ruleTree EOF
            {
             newCompositeNode(grammarAccess.getTreeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTree=ruleTree();

            state._fsp--;

             current =iv_ruleTree; 
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
    // $ANTLR end "entryRuleTree"


    // $ANTLR start "ruleTree"
    // InternalAst.g:561:1: ruleTree returns [EObject current=null] : (otherlv_0= 'TREE' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'PREFIX' ( (lv_prefix_3_0= RULE_ID ) ) )? ( ( ( (lv_subUnitName_4_1= 'SUBUNIT' | lv_subUnitName_4_2= 'VIEW' ) ) ) ( (lv_subUnits_5_0= RULE_ID ) )+ )? ) ;
    public final EObject ruleTree() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_prefix_3_0=null;
        Token lv_subUnitName_4_1=null;
        Token lv_subUnitName_4_2=null;
        Token lv_subUnits_5_0=null;


        	enterRule();

        try {
            // InternalAst.g:567:2: ( (otherlv_0= 'TREE' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'PREFIX' ( (lv_prefix_3_0= RULE_ID ) ) )? ( ( ( (lv_subUnitName_4_1= 'SUBUNIT' | lv_subUnitName_4_2= 'VIEW' ) ) ) ( (lv_subUnits_5_0= RULE_ID ) )+ )? ) )
            // InternalAst.g:568:2: (otherlv_0= 'TREE' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'PREFIX' ( (lv_prefix_3_0= RULE_ID ) ) )? ( ( ( (lv_subUnitName_4_1= 'SUBUNIT' | lv_subUnitName_4_2= 'VIEW' ) ) ) ( (lv_subUnits_5_0= RULE_ID ) )+ )? )
            {
            // InternalAst.g:568:2: (otherlv_0= 'TREE' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'PREFIX' ( (lv_prefix_3_0= RULE_ID ) ) )? ( ( ( (lv_subUnitName_4_1= 'SUBUNIT' | lv_subUnitName_4_2= 'VIEW' ) ) ) ( (lv_subUnits_5_0= RULE_ID ) )+ )? )
            // InternalAst.g:569:3: otherlv_0= 'TREE' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'PREFIX' ( (lv_prefix_3_0= RULE_ID ) ) )? ( ( ( (lv_subUnitName_4_1= 'SUBUNIT' | lv_subUnitName_4_2= 'VIEW' ) ) ) ( (lv_subUnits_5_0= RULE_ID ) )+ )?
            {
            otherlv_0=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getTreeAccess().getTREEKeyword_0());
            		
            // InternalAst.g:573:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAst.g:574:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAst.g:574:4: (lv_name_1_0= RULE_ID )
            // InternalAst.g:575:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(lv_name_1_0, grammarAccess.getTreeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTreeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalAst.g:591:3: (otherlv_2= 'PREFIX' ( (lv_prefix_3_0= RULE_ID ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==14) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalAst.g:592:4: otherlv_2= 'PREFIX' ( (lv_prefix_3_0= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,14,FOLLOW_7); 

                    				newLeafNode(otherlv_2, grammarAccess.getTreeAccess().getPREFIXKeyword_2_0());
                    			
                    // InternalAst.g:596:4: ( (lv_prefix_3_0= RULE_ID ) )
                    // InternalAst.g:597:5: (lv_prefix_3_0= RULE_ID )
                    {
                    // InternalAst.g:597:5: (lv_prefix_3_0= RULE_ID )
                    // InternalAst.g:598:6: lv_prefix_3_0= RULE_ID
                    {
                    lv_prefix_3_0=(Token)match(input,RULE_ID,FOLLOW_14); 

                    						newLeafNode(lv_prefix_3_0, grammarAccess.getTreeAccess().getPrefixIDTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTreeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"prefix",
                    							lv_prefix_3_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAst.g:615:3: ( ( ( (lv_subUnitName_4_1= 'SUBUNIT' | lv_subUnitName_4_2= 'VIEW' ) ) ) ( (lv_subUnits_5_0= RULE_ID ) )+ )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=15 && LA11_0<=16)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalAst.g:616:4: ( ( (lv_subUnitName_4_1= 'SUBUNIT' | lv_subUnitName_4_2= 'VIEW' ) ) ) ( (lv_subUnits_5_0= RULE_ID ) )+
                    {
                    // InternalAst.g:616:4: ( ( (lv_subUnitName_4_1= 'SUBUNIT' | lv_subUnitName_4_2= 'VIEW' ) ) )
                    // InternalAst.g:617:5: ( (lv_subUnitName_4_1= 'SUBUNIT' | lv_subUnitName_4_2= 'VIEW' ) )
                    {
                    // InternalAst.g:617:5: ( (lv_subUnitName_4_1= 'SUBUNIT' | lv_subUnitName_4_2= 'VIEW' ) )
                    // InternalAst.g:618:6: (lv_subUnitName_4_1= 'SUBUNIT' | lv_subUnitName_4_2= 'VIEW' )
                    {
                    // InternalAst.g:618:6: (lv_subUnitName_4_1= 'SUBUNIT' | lv_subUnitName_4_2= 'VIEW' )
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==15) ) {
                        alt9=1;
                    }
                    else if ( (LA9_0==16) ) {
                        alt9=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 9, 0, input);

                        throw nvae;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalAst.g:619:7: lv_subUnitName_4_1= 'SUBUNIT'
                            {
                            lv_subUnitName_4_1=(Token)match(input,15,FOLLOW_7); 

                            							newLeafNode(lv_subUnitName_4_1, grammarAccess.getTreeAccess().getSubUnitNameSUBUNITKeyword_3_0_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getTreeRule());
                            							}
                            							setWithLastConsumed(current, "subUnitName", lv_subUnitName_4_1, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalAst.g:630:7: lv_subUnitName_4_2= 'VIEW'
                            {
                            lv_subUnitName_4_2=(Token)match(input,16,FOLLOW_7); 

                            							newLeafNode(lv_subUnitName_4_2, grammarAccess.getTreeAccess().getSubUnitNameVIEWKeyword_3_0_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getTreeRule());
                            							}
                            							setWithLastConsumed(current, "subUnitName", lv_subUnitName_4_2, null);
                            						

                            }
                            break;

                    }


                    }


                    }

                    // InternalAst.g:643:4: ( (lv_subUnits_5_0= RULE_ID ) )+
                    int cnt10=0;
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==RULE_ID) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalAst.g:644:5: (lv_subUnits_5_0= RULE_ID )
                    	    {
                    	    // InternalAst.g:644:5: (lv_subUnits_5_0= RULE_ID )
                    	    // InternalAst.g:645:6: lv_subUnits_5_0= RULE_ID
                    	    {
                    	    lv_subUnits_5_0=(Token)match(input,RULE_ID,FOLLOW_15); 

                    	    						newLeafNode(lv_subUnits_5_0, grammarAccess.getTreeAccess().getSubUnitsIDTerminalRuleCall_3_1_0());
                    	    					

                    	    						if (current==null) {
                    	    							current = createModelElement(grammarAccess.getTreeRule());
                    	    						}
                    	    						addWithLastConsumed(
                    	    							current,
                    	    							"subUnits",
                    	    							lv_subUnits_5_0,
                    	    							"org.eclipse.xtext.common.Terminals.ID");
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt10 >= 1 ) break loop10;
                                EarlyExitException eee =
                                    new EarlyExitException(10, input);
                                throw eee;
                        }
                        cnt10++;
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
    // $ANTLR end "ruleTree"


    // $ANTLR start "entryRuleImport"
    // InternalAst.g:666:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalAst.g:666:47: (iv_ruleImport= ruleImport EOF )
            // InternalAst.g:667:2: iv_ruleImport= ruleImport EOF
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
    // InternalAst.g:673:1: ruleImport returns [EObject current=null] : (otherlv_0= 'IMPORT' otherlv_1= '{' ( (lv_code_2_0= ruleCodeBlock ) ) otherlv_3= '}' ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_code_2_0 = null;



        	enterRule();

        try {
            // InternalAst.g:679:2: ( (otherlv_0= 'IMPORT' otherlv_1= '{' ( (lv_code_2_0= ruleCodeBlock ) ) otherlv_3= '}' ) )
            // InternalAst.g:680:2: (otherlv_0= 'IMPORT' otherlv_1= '{' ( (lv_code_2_0= ruleCodeBlock ) ) otherlv_3= '}' )
            {
            // InternalAst.g:680:2: (otherlv_0= 'IMPORT' otherlv_1= '{' ( (lv_code_2_0= ruleCodeBlock ) ) otherlv_3= '}' )
            // InternalAst.g:681:3: otherlv_0= 'IMPORT' otherlv_1= '{' ( (lv_code_2_0= ruleCodeBlock ) ) otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getImportAccess().getIMPORTKeyword_0());
            		
            otherlv_1=(Token)match(input,18,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getImportAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalAst.g:689:3: ( (lv_code_2_0= ruleCodeBlock ) )
            // InternalAst.g:690:4: (lv_code_2_0= ruleCodeBlock )
            {
            // InternalAst.g:690:4: (lv_code_2_0= ruleCodeBlock )
            // InternalAst.g:691:5: lv_code_2_0= ruleCodeBlock
            {

            					newCompositeNode(grammarAccess.getImportAccess().getCodeCodeBlockParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_18);
            lv_code_2_0=ruleCodeBlock();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getImportRule());
            					}
            					set(
            						current,
            						"code",
            						lv_code_2_0,
            						"de.roma.cocktail.xtext.Ast.CodeBlock");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,19,FOLLOW_2); 

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
    // InternalAst.g:716:1: entryRuleExport returns [EObject current=null] : iv_ruleExport= ruleExport EOF ;
    public final EObject entryRuleExport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExport = null;


        try {
            // InternalAst.g:716:47: (iv_ruleExport= ruleExport EOF )
            // InternalAst.g:717:2: iv_ruleExport= ruleExport EOF
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
    // InternalAst.g:723:1: ruleExport returns [EObject current=null] : (otherlv_0= 'EXPORT' otherlv_1= '{' ( (lv_code_2_0= ruleCodeBlock ) ) otherlv_3= '}' ) ;
    public final EObject ruleExport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_code_2_0 = null;



        	enterRule();

        try {
            // InternalAst.g:729:2: ( (otherlv_0= 'EXPORT' otherlv_1= '{' ( (lv_code_2_0= ruleCodeBlock ) ) otherlv_3= '}' ) )
            // InternalAst.g:730:2: (otherlv_0= 'EXPORT' otherlv_1= '{' ( (lv_code_2_0= ruleCodeBlock ) ) otherlv_3= '}' )
            {
            // InternalAst.g:730:2: (otherlv_0= 'EXPORT' otherlv_1= '{' ( (lv_code_2_0= ruleCodeBlock ) ) otherlv_3= '}' )
            // InternalAst.g:731:3: otherlv_0= 'EXPORT' otherlv_1= '{' ( (lv_code_2_0= ruleCodeBlock ) ) otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getExportAccess().getEXPORTKeyword_0());
            		
            otherlv_1=(Token)match(input,18,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getExportAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalAst.g:739:3: ( (lv_code_2_0= ruleCodeBlock ) )
            // InternalAst.g:740:4: (lv_code_2_0= ruleCodeBlock )
            {
            // InternalAst.g:740:4: (lv_code_2_0= ruleCodeBlock )
            // InternalAst.g:741:5: lv_code_2_0= ruleCodeBlock
            {

            					newCompositeNode(grammarAccess.getExportAccess().getCodeCodeBlockParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_18);
            lv_code_2_0=ruleCodeBlock();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExportRule());
            					}
            					set(
            						current,
            						"code",
            						lv_code_2_0,
            						"de.roma.cocktail.xtext.Ast.CodeBlock");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,19,FOLLOW_2); 

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
    // InternalAst.g:766:1: entryRuleGlobal returns [EObject current=null] : iv_ruleGlobal= ruleGlobal EOF ;
    public final EObject entryRuleGlobal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGlobal = null;


        try {
            // InternalAst.g:766:47: (iv_ruleGlobal= ruleGlobal EOF )
            // InternalAst.g:767:2: iv_ruleGlobal= ruleGlobal EOF
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
    // InternalAst.g:773:1: ruleGlobal returns [EObject current=null] : (otherlv_0= 'GLOBAL' otherlv_1= '{' ( (lv_code_2_0= ruleCodeBlock ) ) otherlv_3= '}' ) ;
    public final EObject ruleGlobal() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_code_2_0 = null;



        	enterRule();

        try {
            // InternalAst.g:779:2: ( (otherlv_0= 'GLOBAL' otherlv_1= '{' ( (lv_code_2_0= ruleCodeBlock ) ) otherlv_3= '}' ) )
            // InternalAst.g:780:2: (otherlv_0= 'GLOBAL' otherlv_1= '{' ( (lv_code_2_0= ruleCodeBlock ) ) otherlv_3= '}' )
            {
            // InternalAst.g:780:2: (otherlv_0= 'GLOBAL' otherlv_1= '{' ( (lv_code_2_0= ruleCodeBlock ) ) otherlv_3= '}' )
            // InternalAst.g:781:3: otherlv_0= 'GLOBAL' otherlv_1= '{' ( (lv_code_2_0= ruleCodeBlock ) ) otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getGlobalAccess().getGLOBALKeyword_0());
            		
            otherlv_1=(Token)match(input,18,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getGlobalAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalAst.g:789:3: ( (lv_code_2_0= ruleCodeBlock ) )
            // InternalAst.g:790:4: (lv_code_2_0= ruleCodeBlock )
            {
            // InternalAst.g:790:4: (lv_code_2_0= ruleCodeBlock )
            // InternalAst.g:791:5: lv_code_2_0= ruleCodeBlock
            {

            					newCompositeNode(grammarAccess.getGlobalAccess().getCodeCodeBlockParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_18);
            lv_code_2_0=ruleCodeBlock();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGlobalRule());
            					}
            					set(
            						current,
            						"code",
            						lv_code_2_0,
            						"de.roma.cocktail.xtext.Ast.CodeBlock");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,19,FOLLOW_2); 

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
    // InternalAst.g:816:1: entryRuleLocal returns [EObject current=null] : iv_ruleLocal= ruleLocal EOF ;
    public final EObject entryRuleLocal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocal = null;


        try {
            // InternalAst.g:816:46: (iv_ruleLocal= ruleLocal EOF )
            // InternalAst.g:817:2: iv_ruleLocal= ruleLocal EOF
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
    // InternalAst.g:823:1: ruleLocal returns [EObject current=null] : (otherlv_0= 'LOCAL' otherlv_1= '{' ( (lv_code_2_0= ruleCodeBlock ) ) otherlv_3= '}' ) ;
    public final EObject ruleLocal() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_code_2_0 = null;



        	enterRule();

        try {
            // InternalAst.g:829:2: ( (otherlv_0= 'LOCAL' otherlv_1= '{' ( (lv_code_2_0= ruleCodeBlock ) ) otherlv_3= '}' ) )
            // InternalAst.g:830:2: (otherlv_0= 'LOCAL' otherlv_1= '{' ( (lv_code_2_0= ruleCodeBlock ) ) otherlv_3= '}' )
            {
            // InternalAst.g:830:2: (otherlv_0= 'LOCAL' otherlv_1= '{' ( (lv_code_2_0= ruleCodeBlock ) ) otherlv_3= '}' )
            // InternalAst.g:831:3: otherlv_0= 'LOCAL' otherlv_1= '{' ( (lv_code_2_0= ruleCodeBlock ) ) otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getLocalAccess().getLOCALKeyword_0());
            		
            otherlv_1=(Token)match(input,18,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getLocalAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalAst.g:839:3: ( (lv_code_2_0= ruleCodeBlock ) )
            // InternalAst.g:840:4: (lv_code_2_0= ruleCodeBlock )
            {
            // InternalAst.g:840:4: (lv_code_2_0= ruleCodeBlock )
            // InternalAst.g:841:5: lv_code_2_0= ruleCodeBlock
            {

            					newCompositeNode(grammarAccess.getLocalAccess().getCodeCodeBlockParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_18);
            lv_code_2_0=ruleCodeBlock();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLocalRule());
            					}
            					set(
            						current,
            						"code",
            						lv_code_2_0,
            						"de.roma.cocktail.xtext.Ast.CodeBlock");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,19,FOLLOW_2); 

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
    // InternalAst.g:866:1: entryRuleBegin returns [EObject current=null] : iv_ruleBegin= ruleBegin EOF ;
    public final EObject entryRuleBegin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBegin = null;


        try {
            // InternalAst.g:866:46: (iv_ruleBegin= ruleBegin EOF )
            // InternalAst.g:867:2: iv_ruleBegin= ruleBegin EOF
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
    // InternalAst.g:873:1: ruleBegin returns [EObject current=null] : (otherlv_0= 'BEGIN' otherlv_1= '{' ( (lv_code_2_0= ruleCodeBlock ) ) otherlv_3= '}' ) ;
    public final EObject ruleBegin() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_code_2_0 = null;



        	enterRule();

        try {
            // InternalAst.g:879:2: ( (otherlv_0= 'BEGIN' otherlv_1= '{' ( (lv_code_2_0= ruleCodeBlock ) ) otherlv_3= '}' ) )
            // InternalAst.g:880:2: (otherlv_0= 'BEGIN' otherlv_1= '{' ( (lv_code_2_0= ruleCodeBlock ) ) otherlv_3= '}' )
            {
            // InternalAst.g:880:2: (otherlv_0= 'BEGIN' otherlv_1= '{' ( (lv_code_2_0= ruleCodeBlock ) ) otherlv_3= '}' )
            // InternalAst.g:881:3: otherlv_0= 'BEGIN' otherlv_1= '{' ( (lv_code_2_0= ruleCodeBlock ) ) otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getBeginAccess().getBEGINKeyword_0());
            		
            otherlv_1=(Token)match(input,18,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getBeginAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalAst.g:889:3: ( (lv_code_2_0= ruleCodeBlock ) )
            // InternalAst.g:890:4: (lv_code_2_0= ruleCodeBlock )
            {
            // InternalAst.g:890:4: (lv_code_2_0= ruleCodeBlock )
            // InternalAst.g:891:5: lv_code_2_0= ruleCodeBlock
            {

            					newCompositeNode(grammarAccess.getBeginAccess().getCodeCodeBlockParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_18);
            lv_code_2_0=ruleCodeBlock();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBeginRule());
            					}
            					set(
            						current,
            						"code",
            						lv_code_2_0,
            						"de.roma.cocktail.xtext.Ast.CodeBlock");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,19,FOLLOW_2); 

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
    // InternalAst.g:916:1: entryRuleClose returns [EObject current=null] : iv_ruleClose= ruleClose EOF ;
    public final EObject entryRuleClose() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClose = null;


        try {
            // InternalAst.g:916:46: (iv_ruleClose= ruleClose EOF )
            // InternalAst.g:917:2: iv_ruleClose= ruleClose EOF
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
    // InternalAst.g:923:1: ruleClose returns [EObject current=null] : (otherlv_0= 'CLOSE' otherlv_1= '{' ( (lv_code_2_0= ruleCodeBlock ) ) otherlv_3= '}' ) ;
    public final EObject ruleClose() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_code_2_0 = null;



        	enterRule();

        try {
            // InternalAst.g:929:2: ( (otherlv_0= 'CLOSE' otherlv_1= '{' ( (lv_code_2_0= ruleCodeBlock ) ) otherlv_3= '}' ) )
            // InternalAst.g:930:2: (otherlv_0= 'CLOSE' otherlv_1= '{' ( (lv_code_2_0= ruleCodeBlock ) ) otherlv_3= '}' )
            {
            // InternalAst.g:930:2: (otherlv_0= 'CLOSE' otherlv_1= '{' ( (lv_code_2_0= ruleCodeBlock ) ) otherlv_3= '}' )
            // InternalAst.g:931:3: otherlv_0= 'CLOSE' otherlv_1= '{' ( (lv_code_2_0= ruleCodeBlock ) ) otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getCloseAccess().getCLOSEKeyword_0());
            		
            otherlv_1=(Token)match(input,18,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getCloseAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalAst.g:939:3: ( (lv_code_2_0= ruleCodeBlock ) )
            // InternalAst.g:940:4: (lv_code_2_0= ruleCodeBlock )
            {
            // InternalAst.g:940:4: (lv_code_2_0= ruleCodeBlock )
            // InternalAst.g:941:5: lv_code_2_0= ruleCodeBlock
            {

            					newCompositeNode(grammarAccess.getCloseAccess().getCodeCodeBlockParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_18);
            lv_code_2_0=ruleCodeBlock();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCloseRule());
            					}
            					set(
            						current,
            						"code",
            						lv_code_2_0,
            						"de.roma.cocktail.xtext.Ast.CodeBlock");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,19,FOLLOW_2); 

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


    // $ANTLR start "entryRuleProperties"
    // InternalAst.g:966:1: entryRuleProperties returns [EObject current=null] : iv_ruleProperties= ruleProperties EOF ;
    public final EObject entryRuleProperties() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperties = null;


        try {
            // InternalAst.g:966:51: (iv_ruleProperties= ruleProperties EOF )
            // InternalAst.g:967:2: iv_ruleProperties= ruleProperties EOF
            {
             newCompositeNode(grammarAccess.getPropertiesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProperties=ruleProperties();

            state._fsp--;

             current =iv_ruleProperties; 
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
    // $ANTLR end "entryRuleProperties"


    // $ANTLR start "ruleProperties"
    // InternalAst.g:973:1: ruleProperties returns [EObject current=null] : (otherlv_0= 'PROPERTY' ( (lv_property_1_0= rulePropertyList ) ) ) ;
    public final EObject ruleProperties() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_property_1_0 = null;



        	enterRule();

        try {
            // InternalAst.g:979:2: ( (otherlv_0= 'PROPERTY' ( (lv_property_1_0= rulePropertyList ) ) ) )
            // InternalAst.g:980:2: (otherlv_0= 'PROPERTY' ( (lv_property_1_0= rulePropertyList ) ) )
            {
            // InternalAst.g:980:2: (otherlv_0= 'PROPERTY' ( (lv_property_1_0= rulePropertyList ) ) )
            // InternalAst.g:981:3: otherlv_0= 'PROPERTY' ( (lv_property_1_0= rulePropertyList ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getPropertiesAccess().getPROPERTYKeyword_0());
            		
            // InternalAst.g:985:3: ( (lv_property_1_0= rulePropertyList ) )
            // InternalAst.g:986:4: (lv_property_1_0= rulePropertyList )
            {
            // InternalAst.g:986:4: (lv_property_1_0= rulePropertyList )
            // InternalAst.g:987:5: lv_property_1_0= rulePropertyList
            {

            					newCompositeNode(grammarAccess.getPropertiesAccess().getPropertyPropertyListParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_property_1_0=rulePropertyList();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPropertiesRule());
            					}
            					set(
            						current,
            						"property",
            						lv_property_1_0,
            						"de.roma.cocktail.xtext.Ast.PropertyList");
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
    // $ANTLR end "ruleProperties"


    // $ANTLR start "entryRulePropertyList"
    // InternalAst.g:1008:1: entryRulePropertyList returns [EObject current=null] : iv_rulePropertyList= rulePropertyList EOF ;
    public final EObject entryRulePropertyList() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyList = null;


        try {
            // InternalAst.g:1008:53: (iv_rulePropertyList= rulePropertyList EOF )
            // InternalAst.g:1009:2: iv_rulePropertyList= rulePropertyList EOF
            {
             newCompositeNode(grammarAccess.getPropertyListRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePropertyList=rulePropertyList();

            state._fsp--;

             current =iv_rulePropertyList; 
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
    // $ANTLR end "entryRulePropertyList"


    // $ANTLR start "rulePropertyList"
    // InternalAst.g:1015:1: rulePropertyList returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => ( (lv_props_1_0= 'INPUT' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_2_0= 'OUTPUT' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_3_0= 'SYNTHESIZED' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_4_0= 'INHERITED' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_5_0= 'THREAD' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_6_0= 'REVERSE' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_7_0= 'IGNORE' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_8_0= 'VIRTUAL' ) ) ) ) ) )* ) ) ) ;
    public final EObject rulePropertyList() throws RecognitionException {
        EObject current = null;

        Token lv_props_1_0=null;
        Token lv_props_2_0=null;
        Token lv_props_3_0=null;
        Token lv_props_4_0=null;
        Token lv_props_5_0=null;
        Token lv_props_6_0=null;
        Token lv_props_7_0=null;
        Token lv_props_8_0=null;


        	enterRule();

        try {
            // InternalAst.g:1021:2: ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_props_1_0= 'INPUT' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_2_0= 'OUTPUT' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_3_0= 'SYNTHESIZED' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_4_0= 'INHERITED' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_5_0= 'THREAD' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_6_0= 'REVERSE' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_7_0= 'IGNORE' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_8_0= 'VIRTUAL' ) ) ) ) ) )* ) ) ) )
            // InternalAst.g:1022:2: ( ( ( ( ({...}? => ( ({...}? => ( (lv_props_1_0= 'INPUT' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_2_0= 'OUTPUT' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_3_0= 'SYNTHESIZED' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_4_0= 'INHERITED' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_5_0= 'THREAD' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_6_0= 'REVERSE' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_7_0= 'IGNORE' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_8_0= 'VIRTUAL' ) ) ) ) ) )* ) ) )
            {
            // InternalAst.g:1022:2: ( ( ( ( ({...}? => ( ({...}? => ( (lv_props_1_0= 'INPUT' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_2_0= 'OUTPUT' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_3_0= 'SYNTHESIZED' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_4_0= 'INHERITED' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_5_0= 'THREAD' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_6_0= 'REVERSE' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_7_0= 'IGNORE' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_8_0= 'VIRTUAL' ) ) ) ) ) )* ) ) )
            // InternalAst.g:1023:3: ( ( ( ({...}? => ( ({...}? => ( (lv_props_1_0= 'INPUT' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_2_0= 'OUTPUT' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_3_0= 'SYNTHESIZED' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_4_0= 'INHERITED' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_5_0= 'THREAD' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_6_0= 'REVERSE' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_7_0= 'IGNORE' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_8_0= 'VIRTUAL' ) ) ) ) ) )* ) )
            {
            // InternalAst.g:1023:3: ( ( ( ({...}? => ( ({...}? => ( (lv_props_1_0= 'INPUT' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_2_0= 'OUTPUT' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_3_0= 'SYNTHESIZED' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_4_0= 'INHERITED' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_5_0= 'THREAD' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_6_0= 'REVERSE' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_7_0= 'IGNORE' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_8_0= 'VIRTUAL' ) ) ) ) ) )* ) )
            // InternalAst.g:1024:4: ( ( ({...}? => ( ({...}? => ( (lv_props_1_0= 'INPUT' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_2_0= 'OUTPUT' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_3_0= 'SYNTHESIZED' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_4_0= 'INHERITED' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_5_0= 'THREAD' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_6_0= 'REVERSE' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_7_0= 'IGNORE' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_8_0= 'VIRTUAL' ) ) ) ) ) )* )
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getPropertyListAccess().getUnorderedGroup());
            			
            // InternalAst.g:1027:4: ( ( ({...}? => ( ({...}? => ( (lv_props_1_0= 'INPUT' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_2_0= 'OUTPUT' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_3_0= 'SYNTHESIZED' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_4_0= 'INHERITED' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_5_0= 'THREAD' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_6_0= 'REVERSE' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_7_0= 'IGNORE' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_8_0= 'VIRTUAL' ) ) ) ) ) )* )
            // InternalAst.g:1028:5: ( ({...}? => ( ({...}? => ( (lv_props_1_0= 'INPUT' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_2_0= 'OUTPUT' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_3_0= 'SYNTHESIZED' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_4_0= 'INHERITED' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_5_0= 'THREAD' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_6_0= 'REVERSE' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_7_0= 'IGNORE' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_8_0= 'VIRTUAL' ) ) ) ) ) )*
            {
            // InternalAst.g:1028:5: ( ({...}? => ( ({...}? => ( (lv_props_1_0= 'INPUT' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_2_0= 'OUTPUT' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_3_0= 'SYNTHESIZED' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_4_0= 'INHERITED' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_5_0= 'THREAD' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_6_0= 'REVERSE' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_7_0= 'IGNORE' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_8_0= 'VIRTUAL' ) ) ) ) ) )*
            loop12:
            do {
                int alt12=9;
                alt12 = dfa12.predict(input);
                switch (alt12) {
            	case 1 :
            	    // InternalAst.g:1029:3: ({...}? => ( ({...}? => ( (lv_props_1_0= 'INPUT' ) ) ) ) )
            	    {
            	    // InternalAst.g:1029:3: ({...}? => ( ({...}? => ( (lv_props_1_0= 'INPUT' ) ) ) ) )
            	    // InternalAst.g:1030:4: {...}? => ( ({...}? => ( (lv_props_1_0= 'INPUT' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyListAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "rulePropertyList", "getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyListAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalAst.g:1030:106: ( ({...}? => ( (lv_props_1_0= 'INPUT' ) ) ) )
            	    // InternalAst.g:1031:5: ({...}? => ( (lv_props_1_0= 'INPUT' ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getPropertyListAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalAst.g:1034:8: ({...}? => ( (lv_props_1_0= 'INPUT' ) ) )
            	    // InternalAst.g:1034:9: {...}? => ( (lv_props_1_0= 'INPUT' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePropertyList", "true");
            	    }
            	    // InternalAst.g:1034:18: ( (lv_props_1_0= 'INPUT' ) )
            	    // InternalAst.g:1034:19: (lv_props_1_0= 'INPUT' )
            	    {
            	    // InternalAst.g:1034:19: (lv_props_1_0= 'INPUT' )
            	    // InternalAst.g:1035:9: lv_props_1_0= 'INPUT'
            	    {
            	    lv_props_1_0=(Token)match(input,26,FOLLOW_20); 

            	    									newLeafNode(lv_props_1_0, grammarAccess.getPropertyListAccess().getPropsINPUTKeyword_0_0());
            	    								

            	    									if (current==null) {
            	    										current = createModelElement(grammarAccess.getPropertyListRule());
            	    									}
            	    									addWithLastConsumed(current, "props", lv_props_1_0, "INPUT");
            	    								

            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPropertyListAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalAst.g:1052:3: ({...}? => ( ({...}? => ( (lv_props_2_0= 'OUTPUT' ) ) ) ) )
            	    {
            	    // InternalAst.g:1052:3: ({...}? => ( ({...}? => ( (lv_props_2_0= 'OUTPUT' ) ) ) ) )
            	    // InternalAst.g:1053:4: {...}? => ( ({...}? => ( (lv_props_2_0= 'OUTPUT' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyListAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "rulePropertyList", "getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyListAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalAst.g:1053:106: ( ({...}? => ( (lv_props_2_0= 'OUTPUT' ) ) ) )
            	    // InternalAst.g:1054:5: ({...}? => ( (lv_props_2_0= 'OUTPUT' ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getPropertyListAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalAst.g:1057:8: ({...}? => ( (lv_props_2_0= 'OUTPUT' ) ) )
            	    // InternalAst.g:1057:9: {...}? => ( (lv_props_2_0= 'OUTPUT' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePropertyList", "true");
            	    }
            	    // InternalAst.g:1057:18: ( (lv_props_2_0= 'OUTPUT' ) )
            	    // InternalAst.g:1057:19: (lv_props_2_0= 'OUTPUT' )
            	    {
            	    // InternalAst.g:1057:19: (lv_props_2_0= 'OUTPUT' )
            	    // InternalAst.g:1058:9: lv_props_2_0= 'OUTPUT'
            	    {
            	    lv_props_2_0=(Token)match(input,27,FOLLOW_20); 

            	    									newLeafNode(lv_props_2_0, grammarAccess.getPropertyListAccess().getPropsOUTPUTKeyword_1_0());
            	    								

            	    									if (current==null) {
            	    										current = createModelElement(grammarAccess.getPropertyListRule());
            	    									}
            	    									addWithLastConsumed(current, "props", lv_props_2_0, "OUTPUT");
            	    								

            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPropertyListAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalAst.g:1075:3: ({...}? => ( ({...}? => ( (lv_props_3_0= 'SYNTHESIZED' ) ) ) ) )
            	    {
            	    // InternalAst.g:1075:3: ({...}? => ( ({...}? => ( (lv_props_3_0= 'SYNTHESIZED' ) ) ) ) )
            	    // InternalAst.g:1076:4: {...}? => ( ({...}? => ( (lv_props_3_0= 'SYNTHESIZED' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyListAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "rulePropertyList", "getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyListAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalAst.g:1076:106: ( ({...}? => ( (lv_props_3_0= 'SYNTHESIZED' ) ) ) )
            	    // InternalAst.g:1077:5: ({...}? => ( (lv_props_3_0= 'SYNTHESIZED' ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getPropertyListAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalAst.g:1080:8: ({...}? => ( (lv_props_3_0= 'SYNTHESIZED' ) ) )
            	    // InternalAst.g:1080:9: {...}? => ( (lv_props_3_0= 'SYNTHESIZED' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePropertyList", "true");
            	    }
            	    // InternalAst.g:1080:18: ( (lv_props_3_0= 'SYNTHESIZED' ) )
            	    // InternalAst.g:1080:19: (lv_props_3_0= 'SYNTHESIZED' )
            	    {
            	    // InternalAst.g:1080:19: (lv_props_3_0= 'SYNTHESIZED' )
            	    // InternalAst.g:1081:9: lv_props_3_0= 'SYNTHESIZED'
            	    {
            	    lv_props_3_0=(Token)match(input,28,FOLLOW_20); 

            	    									newLeafNode(lv_props_3_0, grammarAccess.getPropertyListAccess().getPropsSYNTHESIZEDKeyword_2_0());
            	    								

            	    									if (current==null) {
            	    										current = createModelElement(grammarAccess.getPropertyListRule());
            	    									}
            	    									addWithLastConsumed(current, "props", lv_props_3_0, "SYNTHESIZED");
            	    								

            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPropertyListAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalAst.g:1098:3: ({...}? => ( ({...}? => ( (lv_props_4_0= 'INHERITED' ) ) ) ) )
            	    {
            	    // InternalAst.g:1098:3: ({...}? => ( ({...}? => ( (lv_props_4_0= 'INHERITED' ) ) ) ) )
            	    // InternalAst.g:1099:4: {...}? => ( ({...}? => ( (lv_props_4_0= 'INHERITED' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyListAccess().getUnorderedGroup(), 3) ) {
            	        throw new FailedPredicateException(input, "rulePropertyList", "getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyListAccess().getUnorderedGroup(), 3)");
            	    }
            	    // InternalAst.g:1099:106: ( ({...}? => ( (lv_props_4_0= 'INHERITED' ) ) ) )
            	    // InternalAst.g:1100:5: ({...}? => ( (lv_props_4_0= 'INHERITED' ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getPropertyListAccess().getUnorderedGroup(), 3);
            	    				
            	    // InternalAst.g:1103:8: ({...}? => ( (lv_props_4_0= 'INHERITED' ) ) )
            	    // InternalAst.g:1103:9: {...}? => ( (lv_props_4_0= 'INHERITED' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePropertyList", "true");
            	    }
            	    // InternalAst.g:1103:18: ( (lv_props_4_0= 'INHERITED' ) )
            	    // InternalAst.g:1103:19: (lv_props_4_0= 'INHERITED' )
            	    {
            	    // InternalAst.g:1103:19: (lv_props_4_0= 'INHERITED' )
            	    // InternalAst.g:1104:9: lv_props_4_0= 'INHERITED'
            	    {
            	    lv_props_4_0=(Token)match(input,29,FOLLOW_20); 

            	    									newLeafNode(lv_props_4_0, grammarAccess.getPropertyListAccess().getPropsINHERITEDKeyword_3_0());
            	    								

            	    									if (current==null) {
            	    										current = createModelElement(grammarAccess.getPropertyListRule());
            	    									}
            	    									addWithLastConsumed(current, "props", lv_props_4_0, "INHERITED");
            	    								

            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPropertyListAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalAst.g:1121:3: ({...}? => ( ({...}? => ( (lv_props_5_0= 'THREAD' ) ) ) ) )
            	    {
            	    // InternalAst.g:1121:3: ({...}? => ( ({...}? => ( (lv_props_5_0= 'THREAD' ) ) ) ) )
            	    // InternalAst.g:1122:4: {...}? => ( ({...}? => ( (lv_props_5_0= 'THREAD' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyListAccess().getUnorderedGroup(), 4) ) {
            	        throw new FailedPredicateException(input, "rulePropertyList", "getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyListAccess().getUnorderedGroup(), 4)");
            	    }
            	    // InternalAst.g:1122:106: ( ({...}? => ( (lv_props_5_0= 'THREAD' ) ) ) )
            	    // InternalAst.g:1123:5: ({...}? => ( (lv_props_5_0= 'THREAD' ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getPropertyListAccess().getUnorderedGroup(), 4);
            	    				
            	    // InternalAst.g:1126:8: ({...}? => ( (lv_props_5_0= 'THREAD' ) ) )
            	    // InternalAst.g:1126:9: {...}? => ( (lv_props_5_0= 'THREAD' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePropertyList", "true");
            	    }
            	    // InternalAst.g:1126:18: ( (lv_props_5_0= 'THREAD' ) )
            	    // InternalAst.g:1126:19: (lv_props_5_0= 'THREAD' )
            	    {
            	    // InternalAst.g:1126:19: (lv_props_5_0= 'THREAD' )
            	    // InternalAst.g:1127:9: lv_props_5_0= 'THREAD'
            	    {
            	    lv_props_5_0=(Token)match(input,30,FOLLOW_20); 

            	    									newLeafNode(lv_props_5_0, grammarAccess.getPropertyListAccess().getPropsTHREADKeyword_4_0());
            	    								

            	    									if (current==null) {
            	    										current = createModelElement(grammarAccess.getPropertyListRule());
            	    									}
            	    									addWithLastConsumed(current, "props", lv_props_5_0, "THREAD");
            	    								

            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPropertyListAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalAst.g:1144:3: ({...}? => ( ({...}? => ( (lv_props_6_0= 'REVERSE' ) ) ) ) )
            	    {
            	    // InternalAst.g:1144:3: ({...}? => ( ({...}? => ( (lv_props_6_0= 'REVERSE' ) ) ) ) )
            	    // InternalAst.g:1145:4: {...}? => ( ({...}? => ( (lv_props_6_0= 'REVERSE' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyListAccess().getUnorderedGroup(), 5) ) {
            	        throw new FailedPredicateException(input, "rulePropertyList", "getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyListAccess().getUnorderedGroup(), 5)");
            	    }
            	    // InternalAst.g:1145:106: ( ({...}? => ( (lv_props_6_0= 'REVERSE' ) ) ) )
            	    // InternalAst.g:1146:5: ({...}? => ( (lv_props_6_0= 'REVERSE' ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getPropertyListAccess().getUnorderedGroup(), 5);
            	    				
            	    // InternalAst.g:1149:8: ({...}? => ( (lv_props_6_0= 'REVERSE' ) ) )
            	    // InternalAst.g:1149:9: {...}? => ( (lv_props_6_0= 'REVERSE' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePropertyList", "true");
            	    }
            	    // InternalAst.g:1149:18: ( (lv_props_6_0= 'REVERSE' ) )
            	    // InternalAst.g:1149:19: (lv_props_6_0= 'REVERSE' )
            	    {
            	    // InternalAst.g:1149:19: (lv_props_6_0= 'REVERSE' )
            	    // InternalAst.g:1150:9: lv_props_6_0= 'REVERSE'
            	    {
            	    lv_props_6_0=(Token)match(input,31,FOLLOW_20); 

            	    									newLeafNode(lv_props_6_0, grammarAccess.getPropertyListAccess().getPropsREVERSEKeyword_5_0());
            	    								

            	    									if (current==null) {
            	    										current = createModelElement(grammarAccess.getPropertyListRule());
            	    									}
            	    									addWithLastConsumed(current, "props", lv_props_6_0, "REVERSE");
            	    								

            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPropertyListAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // InternalAst.g:1167:3: ({...}? => ( ({...}? => ( (lv_props_7_0= 'IGNORE' ) ) ) ) )
            	    {
            	    // InternalAst.g:1167:3: ({...}? => ( ({...}? => ( (lv_props_7_0= 'IGNORE' ) ) ) ) )
            	    // InternalAst.g:1168:4: {...}? => ( ({...}? => ( (lv_props_7_0= 'IGNORE' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyListAccess().getUnorderedGroup(), 6) ) {
            	        throw new FailedPredicateException(input, "rulePropertyList", "getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyListAccess().getUnorderedGroup(), 6)");
            	    }
            	    // InternalAst.g:1168:106: ( ({...}? => ( (lv_props_7_0= 'IGNORE' ) ) ) )
            	    // InternalAst.g:1169:5: ({...}? => ( (lv_props_7_0= 'IGNORE' ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getPropertyListAccess().getUnorderedGroup(), 6);
            	    				
            	    // InternalAst.g:1172:8: ({...}? => ( (lv_props_7_0= 'IGNORE' ) ) )
            	    // InternalAst.g:1172:9: {...}? => ( (lv_props_7_0= 'IGNORE' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePropertyList", "true");
            	    }
            	    // InternalAst.g:1172:18: ( (lv_props_7_0= 'IGNORE' ) )
            	    // InternalAst.g:1172:19: (lv_props_7_0= 'IGNORE' )
            	    {
            	    // InternalAst.g:1172:19: (lv_props_7_0= 'IGNORE' )
            	    // InternalAst.g:1173:9: lv_props_7_0= 'IGNORE'
            	    {
            	    lv_props_7_0=(Token)match(input,32,FOLLOW_20); 

            	    									newLeafNode(lv_props_7_0, grammarAccess.getPropertyListAccess().getPropsIGNOREKeyword_6_0());
            	    								

            	    									if (current==null) {
            	    										current = createModelElement(grammarAccess.getPropertyListRule());
            	    									}
            	    									addWithLastConsumed(current, "props", lv_props_7_0, "IGNORE");
            	    								

            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPropertyListAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 8 :
            	    // InternalAst.g:1190:3: ({...}? => ( ({...}? => ( (lv_props_8_0= 'VIRTUAL' ) ) ) ) )
            	    {
            	    // InternalAst.g:1190:3: ({...}? => ( ({...}? => ( (lv_props_8_0= 'VIRTUAL' ) ) ) ) )
            	    // InternalAst.g:1191:4: {...}? => ( ({...}? => ( (lv_props_8_0= 'VIRTUAL' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyListAccess().getUnorderedGroup(), 7) ) {
            	        throw new FailedPredicateException(input, "rulePropertyList", "getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyListAccess().getUnorderedGroup(), 7)");
            	    }
            	    // InternalAst.g:1191:106: ( ({...}? => ( (lv_props_8_0= 'VIRTUAL' ) ) ) )
            	    // InternalAst.g:1192:5: ({...}? => ( (lv_props_8_0= 'VIRTUAL' ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getPropertyListAccess().getUnorderedGroup(), 7);
            	    				
            	    // InternalAst.g:1195:8: ({...}? => ( (lv_props_8_0= 'VIRTUAL' ) ) )
            	    // InternalAst.g:1195:9: {...}? => ( (lv_props_8_0= 'VIRTUAL' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePropertyList", "true");
            	    }
            	    // InternalAst.g:1195:18: ( (lv_props_8_0= 'VIRTUAL' ) )
            	    // InternalAst.g:1195:19: (lv_props_8_0= 'VIRTUAL' )
            	    {
            	    // InternalAst.g:1195:19: (lv_props_8_0= 'VIRTUAL' )
            	    // InternalAst.g:1196:9: lv_props_8_0= 'VIRTUAL'
            	    {
            	    lv_props_8_0=(Token)match(input,33,FOLLOW_20); 

            	    									newLeafNode(lv_props_8_0, grammarAccess.getPropertyListAccess().getPropsVIRTUALKeyword_7_0());
            	    								

            	    									if (current==null) {
            	    										current = createModelElement(grammarAccess.getPropertyListRule());
            	    									}
            	    									addWithLastConsumed(current, "props", lv_props_8_0, "VIRTUAL");
            	    								

            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPropertyListAccess().getUnorderedGroup());
            	    				

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

             
            			  getUnorderedGroupHelper().leave(grammarAccess.getPropertyListAccess().getUnorderedGroup());
            			

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
    // $ANTLR end "rulePropertyList"


    // $ANTLR start "entryRuleNodePropertyList"
    // InternalAst.g:1223:1: entryRuleNodePropertyList returns [EObject current=null] : iv_ruleNodePropertyList= ruleNodePropertyList EOF ;
    public final EObject entryRuleNodePropertyList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNodePropertyList = null;


        try {
            // InternalAst.g:1223:57: (iv_ruleNodePropertyList= ruleNodePropertyList EOF )
            // InternalAst.g:1224:2: iv_ruleNodePropertyList= ruleNodePropertyList EOF
            {
             newCompositeNode(grammarAccess.getNodePropertyListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNodePropertyList=ruleNodePropertyList();

            state._fsp--;

             current =iv_ruleNodePropertyList; 
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
    // $ANTLR end "entryRuleNodePropertyList"


    // $ANTLR start "ruleNodePropertyList"
    // InternalAst.g:1230:1: ruleNodePropertyList returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => ( (lv_props_1_0= 'INPUT' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_2_0= 'OUTPUT' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_3_0= 'SYNTHESIZED' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_4_0= 'INHERITED' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_5_0= 'THREAD' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_6_0= 'REVERSE' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_7_0= 'IGNORE' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_8_0= 'VIRTUAL' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_9_0= 'IN' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_10_0= 'OUT' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_11_0= 'SYN' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_12_0= 'INH' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_13_0= 'REV' ) ) ) ) ) )* ) ) ) ;
    public final EObject ruleNodePropertyList() throws RecognitionException {
        EObject current = null;

        Token lv_props_1_0=null;
        Token lv_props_2_0=null;
        Token lv_props_3_0=null;
        Token lv_props_4_0=null;
        Token lv_props_5_0=null;
        Token lv_props_6_0=null;
        Token lv_props_7_0=null;
        Token lv_props_8_0=null;
        Token lv_props_9_0=null;
        Token lv_props_10_0=null;
        Token lv_props_11_0=null;
        Token lv_props_12_0=null;
        Token lv_props_13_0=null;


        	enterRule();

        try {
            // InternalAst.g:1236:2: ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_props_1_0= 'INPUT' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_2_0= 'OUTPUT' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_3_0= 'SYNTHESIZED' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_4_0= 'INHERITED' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_5_0= 'THREAD' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_6_0= 'REVERSE' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_7_0= 'IGNORE' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_8_0= 'VIRTUAL' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_9_0= 'IN' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_10_0= 'OUT' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_11_0= 'SYN' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_12_0= 'INH' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_13_0= 'REV' ) ) ) ) ) )* ) ) ) )
            // InternalAst.g:1237:2: ( ( ( ( ({...}? => ( ({...}? => ( (lv_props_1_0= 'INPUT' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_2_0= 'OUTPUT' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_3_0= 'SYNTHESIZED' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_4_0= 'INHERITED' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_5_0= 'THREAD' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_6_0= 'REVERSE' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_7_0= 'IGNORE' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_8_0= 'VIRTUAL' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_9_0= 'IN' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_10_0= 'OUT' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_11_0= 'SYN' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_12_0= 'INH' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_13_0= 'REV' ) ) ) ) ) )* ) ) )
            {
            // InternalAst.g:1237:2: ( ( ( ( ({...}? => ( ({...}? => ( (lv_props_1_0= 'INPUT' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_2_0= 'OUTPUT' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_3_0= 'SYNTHESIZED' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_4_0= 'INHERITED' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_5_0= 'THREAD' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_6_0= 'REVERSE' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_7_0= 'IGNORE' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_8_0= 'VIRTUAL' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_9_0= 'IN' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_10_0= 'OUT' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_11_0= 'SYN' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_12_0= 'INH' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_13_0= 'REV' ) ) ) ) ) )* ) ) )
            // InternalAst.g:1238:3: ( ( ( ({...}? => ( ({...}? => ( (lv_props_1_0= 'INPUT' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_2_0= 'OUTPUT' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_3_0= 'SYNTHESIZED' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_4_0= 'INHERITED' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_5_0= 'THREAD' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_6_0= 'REVERSE' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_7_0= 'IGNORE' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_8_0= 'VIRTUAL' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_9_0= 'IN' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_10_0= 'OUT' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_11_0= 'SYN' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_12_0= 'INH' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_13_0= 'REV' ) ) ) ) ) )* ) )
            {
            // InternalAst.g:1238:3: ( ( ( ({...}? => ( ({...}? => ( (lv_props_1_0= 'INPUT' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_2_0= 'OUTPUT' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_3_0= 'SYNTHESIZED' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_4_0= 'INHERITED' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_5_0= 'THREAD' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_6_0= 'REVERSE' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_7_0= 'IGNORE' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_8_0= 'VIRTUAL' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_9_0= 'IN' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_10_0= 'OUT' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_11_0= 'SYN' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_12_0= 'INH' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_13_0= 'REV' ) ) ) ) ) )* ) )
            // InternalAst.g:1239:4: ( ( ({...}? => ( ({...}? => ( (lv_props_1_0= 'INPUT' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_2_0= 'OUTPUT' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_3_0= 'SYNTHESIZED' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_4_0= 'INHERITED' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_5_0= 'THREAD' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_6_0= 'REVERSE' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_7_0= 'IGNORE' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_8_0= 'VIRTUAL' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_9_0= 'IN' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_10_0= 'OUT' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_11_0= 'SYN' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_12_0= 'INH' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_13_0= 'REV' ) ) ) ) ) )* )
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getNodePropertyListAccess().getUnorderedGroup());
            			
            // InternalAst.g:1242:4: ( ( ({...}? => ( ({...}? => ( (lv_props_1_0= 'INPUT' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_2_0= 'OUTPUT' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_3_0= 'SYNTHESIZED' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_4_0= 'INHERITED' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_5_0= 'THREAD' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_6_0= 'REVERSE' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_7_0= 'IGNORE' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_8_0= 'VIRTUAL' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_9_0= 'IN' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_10_0= 'OUT' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_11_0= 'SYN' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_12_0= 'INH' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_13_0= 'REV' ) ) ) ) ) )* )
            // InternalAst.g:1243:5: ( ({...}? => ( ({...}? => ( (lv_props_1_0= 'INPUT' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_2_0= 'OUTPUT' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_3_0= 'SYNTHESIZED' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_4_0= 'INHERITED' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_5_0= 'THREAD' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_6_0= 'REVERSE' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_7_0= 'IGNORE' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_8_0= 'VIRTUAL' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_9_0= 'IN' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_10_0= 'OUT' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_11_0= 'SYN' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_12_0= 'INH' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_13_0= 'REV' ) ) ) ) ) )*
            {
            // InternalAst.g:1243:5: ( ({...}? => ( ({...}? => ( (lv_props_1_0= 'INPUT' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_2_0= 'OUTPUT' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_3_0= 'SYNTHESIZED' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_4_0= 'INHERITED' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_5_0= 'THREAD' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_6_0= 'REVERSE' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_7_0= 'IGNORE' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_8_0= 'VIRTUAL' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_9_0= 'IN' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_10_0= 'OUT' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_11_0= 'SYN' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_12_0= 'INH' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_13_0= 'REV' ) ) ) ) ) )*
            loop13:
            do {
                int alt13=14;
                alt13 = dfa13.predict(input);
                switch (alt13) {
            	case 1 :
            	    // InternalAst.g:1244:3: ({...}? => ( ({...}? => ( (lv_props_1_0= 'INPUT' ) ) ) ) )
            	    {
            	    // InternalAst.g:1244:3: ({...}? => ( ({...}? => ( (lv_props_1_0= 'INPUT' ) ) ) ) )
            	    // InternalAst.g:1245:4: {...}? => ( ({...}? => ( (lv_props_1_0= 'INPUT' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNodePropertyListAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleNodePropertyList", "getUnorderedGroupHelper().canSelect(grammarAccess.getNodePropertyListAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalAst.g:1245:110: ( ({...}? => ( (lv_props_1_0= 'INPUT' ) ) ) )
            	    // InternalAst.g:1246:5: ({...}? => ( (lv_props_1_0= 'INPUT' ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getNodePropertyListAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalAst.g:1249:8: ({...}? => ( (lv_props_1_0= 'INPUT' ) ) )
            	    // InternalAst.g:1249:9: {...}? => ( (lv_props_1_0= 'INPUT' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleNodePropertyList", "true");
            	    }
            	    // InternalAst.g:1249:18: ( (lv_props_1_0= 'INPUT' ) )
            	    // InternalAst.g:1249:19: (lv_props_1_0= 'INPUT' )
            	    {
            	    // InternalAst.g:1249:19: (lv_props_1_0= 'INPUT' )
            	    // InternalAst.g:1250:9: lv_props_1_0= 'INPUT'
            	    {
            	    lv_props_1_0=(Token)match(input,26,FOLLOW_21); 

            	    									newLeafNode(lv_props_1_0, grammarAccess.getNodePropertyListAccess().getPropsINPUTKeyword_0_0());
            	    								

            	    									if (current==null) {
            	    										current = createModelElement(grammarAccess.getNodePropertyListRule());
            	    									}
            	    									addWithLastConsumed(current, "props", lv_props_1_0, "INPUT");
            	    								

            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getNodePropertyListAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalAst.g:1267:3: ({...}? => ( ({...}? => ( (lv_props_2_0= 'OUTPUT' ) ) ) ) )
            	    {
            	    // InternalAst.g:1267:3: ({...}? => ( ({...}? => ( (lv_props_2_0= 'OUTPUT' ) ) ) ) )
            	    // InternalAst.g:1268:4: {...}? => ( ({...}? => ( (lv_props_2_0= 'OUTPUT' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNodePropertyListAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleNodePropertyList", "getUnorderedGroupHelper().canSelect(grammarAccess.getNodePropertyListAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalAst.g:1268:110: ( ({...}? => ( (lv_props_2_0= 'OUTPUT' ) ) ) )
            	    // InternalAst.g:1269:5: ({...}? => ( (lv_props_2_0= 'OUTPUT' ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getNodePropertyListAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalAst.g:1272:8: ({...}? => ( (lv_props_2_0= 'OUTPUT' ) ) )
            	    // InternalAst.g:1272:9: {...}? => ( (lv_props_2_0= 'OUTPUT' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleNodePropertyList", "true");
            	    }
            	    // InternalAst.g:1272:18: ( (lv_props_2_0= 'OUTPUT' ) )
            	    // InternalAst.g:1272:19: (lv_props_2_0= 'OUTPUT' )
            	    {
            	    // InternalAst.g:1272:19: (lv_props_2_0= 'OUTPUT' )
            	    // InternalAst.g:1273:9: lv_props_2_0= 'OUTPUT'
            	    {
            	    lv_props_2_0=(Token)match(input,27,FOLLOW_21); 

            	    									newLeafNode(lv_props_2_0, grammarAccess.getNodePropertyListAccess().getPropsOUTPUTKeyword_1_0());
            	    								

            	    									if (current==null) {
            	    										current = createModelElement(grammarAccess.getNodePropertyListRule());
            	    									}
            	    									addWithLastConsumed(current, "props", lv_props_2_0, "OUTPUT");
            	    								

            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getNodePropertyListAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalAst.g:1290:3: ({...}? => ( ({...}? => ( (lv_props_3_0= 'SYNTHESIZED' ) ) ) ) )
            	    {
            	    // InternalAst.g:1290:3: ({...}? => ( ({...}? => ( (lv_props_3_0= 'SYNTHESIZED' ) ) ) ) )
            	    // InternalAst.g:1291:4: {...}? => ( ({...}? => ( (lv_props_3_0= 'SYNTHESIZED' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNodePropertyListAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleNodePropertyList", "getUnorderedGroupHelper().canSelect(grammarAccess.getNodePropertyListAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalAst.g:1291:110: ( ({...}? => ( (lv_props_3_0= 'SYNTHESIZED' ) ) ) )
            	    // InternalAst.g:1292:5: ({...}? => ( (lv_props_3_0= 'SYNTHESIZED' ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getNodePropertyListAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalAst.g:1295:8: ({...}? => ( (lv_props_3_0= 'SYNTHESIZED' ) ) )
            	    // InternalAst.g:1295:9: {...}? => ( (lv_props_3_0= 'SYNTHESIZED' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleNodePropertyList", "true");
            	    }
            	    // InternalAst.g:1295:18: ( (lv_props_3_0= 'SYNTHESIZED' ) )
            	    // InternalAst.g:1295:19: (lv_props_3_0= 'SYNTHESIZED' )
            	    {
            	    // InternalAst.g:1295:19: (lv_props_3_0= 'SYNTHESIZED' )
            	    // InternalAst.g:1296:9: lv_props_3_0= 'SYNTHESIZED'
            	    {
            	    lv_props_3_0=(Token)match(input,28,FOLLOW_21); 

            	    									newLeafNode(lv_props_3_0, grammarAccess.getNodePropertyListAccess().getPropsSYNTHESIZEDKeyword_2_0());
            	    								

            	    									if (current==null) {
            	    										current = createModelElement(grammarAccess.getNodePropertyListRule());
            	    									}
            	    									addWithLastConsumed(current, "props", lv_props_3_0, "SYNTHESIZED");
            	    								

            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getNodePropertyListAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalAst.g:1313:3: ({...}? => ( ({...}? => ( (lv_props_4_0= 'INHERITED' ) ) ) ) )
            	    {
            	    // InternalAst.g:1313:3: ({...}? => ( ({...}? => ( (lv_props_4_0= 'INHERITED' ) ) ) ) )
            	    // InternalAst.g:1314:4: {...}? => ( ({...}? => ( (lv_props_4_0= 'INHERITED' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNodePropertyListAccess().getUnorderedGroup(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleNodePropertyList", "getUnorderedGroupHelper().canSelect(grammarAccess.getNodePropertyListAccess().getUnorderedGroup(), 3)");
            	    }
            	    // InternalAst.g:1314:110: ( ({...}? => ( (lv_props_4_0= 'INHERITED' ) ) ) )
            	    // InternalAst.g:1315:5: ({...}? => ( (lv_props_4_0= 'INHERITED' ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getNodePropertyListAccess().getUnorderedGroup(), 3);
            	    				
            	    // InternalAst.g:1318:8: ({...}? => ( (lv_props_4_0= 'INHERITED' ) ) )
            	    // InternalAst.g:1318:9: {...}? => ( (lv_props_4_0= 'INHERITED' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleNodePropertyList", "true");
            	    }
            	    // InternalAst.g:1318:18: ( (lv_props_4_0= 'INHERITED' ) )
            	    // InternalAst.g:1318:19: (lv_props_4_0= 'INHERITED' )
            	    {
            	    // InternalAst.g:1318:19: (lv_props_4_0= 'INHERITED' )
            	    // InternalAst.g:1319:9: lv_props_4_0= 'INHERITED'
            	    {
            	    lv_props_4_0=(Token)match(input,29,FOLLOW_21); 

            	    									newLeafNode(lv_props_4_0, grammarAccess.getNodePropertyListAccess().getPropsINHERITEDKeyword_3_0());
            	    								

            	    									if (current==null) {
            	    										current = createModelElement(grammarAccess.getNodePropertyListRule());
            	    									}
            	    									addWithLastConsumed(current, "props", lv_props_4_0, "INHERITED");
            	    								

            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getNodePropertyListAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalAst.g:1336:3: ({...}? => ( ({...}? => ( (lv_props_5_0= 'THREAD' ) ) ) ) )
            	    {
            	    // InternalAst.g:1336:3: ({...}? => ( ({...}? => ( (lv_props_5_0= 'THREAD' ) ) ) ) )
            	    // InternalAst.g:1337:4: {...}? => ( ({...}? => ( (lv_props_5_0= 'THREAD' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNodePropertyListAccess().getUnorderedGroup(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleNodePropertyList", "getUnorderedGroupHelper().canSelect(grammarAccess.getNodePropertyListAccess().getUnorderedGroup(), 4)");
            	    }
            	    // InternalAst.g:1337:110: ( ({...}? => ( (lv_props_5_0= 'THREAD' ) ) ) )
            	    // InternalAst.g:1338:5: ({...}? => ( (lv_props_5_0= 'THREAD' ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getNodePropertyListAccess().getUnorderedGroup(), 4);
            	    				
            	    // InternalAst.g:1341:8: ({...}? => ( (lv_props_5_0= 'THREAD' ) ) )
            	    // InternalAst.g:1341:9: {...}? => ( (lv_props_5_0= 'THREAD' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleNodePropertyList", "true");
            	    }
            	    // InternalAst.g:1341:18: ( (lv_props_5_0= 'THREAD' ) )
            	    // InternalAst.g:1341:19: (lv_props_5_0= 'THREAD' )
            	    {
            	    // InternalAst.g:1341:19: (lv_props_5_0= 'THREAD' )
            	    // InternalAst.g:1342:9: lv_props_5_0= 'THREAD'
            	    {
            	    lv_props_5_0=(Token)match(input,30,FOLLOW_21); 

            	    									newLeafNode(lv_props_5_0, grammarAccess.getNodePropertyListAccess().getPropsTHREADKeyword_4_0());
            	    								

            	    									if (current==null) {
            	    										current = createModelElement(grammarAccess.getNodePropertyListRule());
            	    									}
            	    									addWithLastConsumed(current, "props", lv_props_5_0, "THREAD");
            	    								

            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getNodePropertyListAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalAst.g:1359:3: ({...}? => ( ({...}? => ( (lv_props_6_0= 'REVERSE' ) ) ) ) )
            	    {
            	    // InternalAst.g:1359:3: ({...}? => ( ({...}? => ( (lv_props_6_0= 'REVERSE' ) ) ) ) )
            	    // InternalAst.g:1360:4: {...}? => ( ({...}? => ( (lv_props_6_0= 'REVERSE' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNodePropertyListAccess().getUnorderedGroup(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleNodePropertyList", "getUnorderedGroupHelper().canSelect(grammarAccess.getNodePropertyListAccess().getUnorderedGroup(), 5)");
            	    }
            	    // InternalAst.g:1360:110: ( ({...}? => ( (lv_props_6_0= 'REVERSE' ) ) ) )
            	    // InternalAst.g:1361:5: ({...}? => ( (lv_props_6_0= 'REVERSE' ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getNodePropertyListAccess().getUnorderedGroup(), 5);
            	    				
            	    // InternalAst.g:1364:8: ({...}? => ( (lv_props_6_0= 'REVERSE' ) ) )
            	    // InternalAst.g:1364:9: {...}? => ( (lv_props_6_0= 'REVERSE' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleNodePropertyList", "true");
            	    }
            	    // InternalAst.g:1364:18: ( (lv_props_6_0= 'REVERSE' ) )
            	    // InternalAst.g:1364:19: (lv_props_6_0= 'REVERSE' )
            	    {
            	    // InternalAst.g:1364:19: (lv_props_6_0= 'REVERSE' )
            	    // InternalAst.g:1365:9: lv_props_6_0= 'REVERSE'
            	    {
            	    lv_props_6_0=(Token)match(input,31,FOLLOW_21); 

            	    									newLeafNode(lv_props_6_0, grammarAccess.getNodePropertyListAccess().getPropsREVERSEKeyword_5_0());
            	    								

            	    									if (current==null) {
            	    										current = createModelElement(grammarAccess.getNodePropertyListRule());
            	    									}
            	    									addWithLastConsumed(current, "props", lv_props_6_0, "REVERSE");
            	    								

            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getNodePropertyListAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // InternalAst.g:1382:3: ({...}? => ( ({...}? => ( (lv_props_7_0= 'IGNORE' ) ) ) ) )
            	    {
            	    // InternalAst.g:1382:3: ({...}? => ( ({...}? => ( (lv_props_7_0= 'IGNORE' ) ) ) ) )
            	    // InternalAst.g:1383:4: {...}? => ( ({...}? => ( (lv_props_7_0= 'IGNORE' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNodePropertyListAccess().getUnorderedGroup(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleNodePropertyList", "getUnorderedGroupHelper().canSelect(grammarAccess.getNodePropertyListAccess().getUnorderedGroup(), 6)");
            	    }
            	    // InternalAst.g:1383:110: ( ({...}? => ( (lv_props_7_0= 'IGNORE' ) ) ) )
            	    // InternalAst.g:1384:5: ({...}? => ( (lv_props_7_0= 'IGNORE' ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getNodePropertyListAccess().getUnorderedGroup(), 6);
            	    				
            	    // InternalAst.g:1387:8: ({...}? => ( (lv_props_7_0= 'IGNORE' ) ) )
            	    // InternalAst.g:1387:9: {...}? => ( (lv_props_7_0= 'IGNORE' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleNodePropertyList", "true");
            	    }
            	    // InternalAst.g:1387:18: ( (lv_props_7_0= 'IGNORE' ) )
            	    // InternalAst.g:1387:19: (lv_props_7_0= 'IGNORE' )
            	    {
            	    // InternalAst.g:1387:19: (lv_props_7_0= 'IGNORE' )
            	    // InternalAst.g:1388:9: lv_props_7_0= 'IGNORE'
            	    {
            	    lv_props_7_0=(Token)match(input,32,FOLLOW_21); 

            	    									newLeafNode(lv_props_7_0, grammarAccess.getNodePropertyListAccess().getPropsIGNOREKeyword_6_0());
            	    								

            	    									if (current==null) {
            	    										current = createModelElement(grammarAccess.getNodePropertyListRule());
            	    									}
            	    									addWithLastConsumed(current, "props", lv_props_7_0, "IGNORE");
            	    								

            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getNodePropertyListAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 8 :
            	    // InternalAst.g:1405:3: ({...}? => ( ({...}? => ( (lv_props_8_0= 'VIRTUAL' ) ) ) ) )
            	    {
            	    // InternalAst.g:1405:3: ({...}? => ( ({...}? => ( (lv_props_8_0= 'VIRTUAL' ) ) ) ) )
            	    // InternalAst.g:1406:4: {...}? => ( ({...}? => ( (lv_props_8_0= 'VIRTUAL' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNodePropertyListAccess().getUnorderedGroup(), 7) ) {
            	        throw new FailedPredicateException(input, "ruleNodePropertyList", "getUnorderedGroupHelper().canSelect(grammarAccess.getNodePropertyListAccess().getUnorderedGroup(), 7)");
            	    }
            	    // InternalAst.g:1406:110: ( ({...}? => ( (lv_props_8_0= 'VIRTUAL' ) ) ) )
            	    // InternalAst.g:1407:5: ({...}? => ( (lv_props_8_0= 'VIRTUAL' ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getNodePropertyListAccess().getUnorderedGroup(), 7);
            	    				
            	    // InternalAst.g:1410:8: ({...}? => ( (lv_props_8_0= 'VIRTUAL' ) ) )
            	    // InternalAst.g:1410:9: {...}? => ( (lv_props_8_0= 'VIRTUAL' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleNodePropertyList", "true");
            	    }
            	    // InternalAst.g:1410:18: ( (lv_props_8_0= 'VIRTUAL' ) )
            	    // InternalAst.g:1410:19: (lv_props_8_0= 'VIRTUAL' )
            	    {
            	    // InternalAst.g:1410:19: (lv_props_8_0= 'VIRTUAL' )
            	    // InternalAst.g:1411:9: lv_props_8_0= 'VIRTUAL'
            	    {
            	    lv_props_8_0=(Token)match(input,33,FOLLOW_21); 

            	    									newLeafNode(lv_props_8_0, grammarAccess.getNodePropertyListAccess().getPropsVIRTUALKeyword_7_0());
            	    								

            	    									if (current==null) {
            	    										current = createModelElement(grammarAccess.getNodePropertyListRule());
            	    									}
            	    									addWithLastConsumed(current, "props", lv_props_8_0, "VIRTUAL");
            	    								

            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getNodePropertyListAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 9 :
            	    // InternalAst.g:1428:3: ({...}? => ( ({...}? => ( (lv_props_9_0= 'IN' ) ) ) ) )
            	    {
            	    // InternalAst.g:1428:3: ({...}? => ( ({...}? => ( (lv_props_9_0= 'IN' ) ) ) ) )
            	    // InternalAst.g:1429:4: {...}? => ( ({...}? => ( (lv_props_9_0= 'IN' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNodePropertyListAccess().getUnorderedGroup(), 8) ) {
            	        throw new FailedPredicateException(input, "ruleNodePropertyList", "getUnorderedGroupHelper().canSelect(grammarAccess.getNodePropertyListAccess().getUnorderedGroup(), 8)");
            	    }
            	    // InternalAst.g:1429:110: ( ({...}? => ( (lv_props_9_0= 'IN' ) ) ) )
            	    // InternalAst.g:1430:5: ({...}? => ( (lv_props_9_0= 'IN' ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getNodePropertyListAccess().getUnorderedGroup(), 8);
            	    				
            	    // InternalAst.g:1433:8: ({...}? => ( (lv_props_9_0= 'IN' ) ) )
            	    // InternalAst.g:1433:9: {...}? => ( (lv_props_9_0= 'IN' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleNodePropertyList", "true");
            	    }
            	    // InternalAst.g:1433:18: ( (lv_props_9_0= 'IN' ) )
            	    // InternalAst.g:1433:19: (lv_props_9_0= 'IN' )
            	    {
            	    // InternalAst.g:1433:19: (lv_props_9_0= 'IN' )
            	    // InternalAst.g:1434:9: lv_props_9_0= 'IN'
            	    {
            	    lv_props_9_0=(Token)match(input,34,FOLLOW_21); 

            	    									newLeafNode(lv_props_9_0, grammarAccess.getNodePropertyListAccess().getPropsINKeyword_8_0());
            	    								

            	    									if (current==null) {
            	    										current = createModelElement(grammarAccess.getNodePropertyListRule());
            	    									}
            	    									addWithLastConsumed(current, "props", lv_props_9_0, "IN");
            	    								

            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getNodePropertyListAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 10 :
            	    // InternalAst.g:1451:3: ({...}? => ( ({...}? => ( (lv_props_10_0= 'OUT' ) ) ) ) )
            	    {
            	    // InternalAst.g:1451:3: ({...}? => ( ({...}? => ( (lv_props_10_0= 'OUT' ) ) ) ) )
            	    // InternalAst.g:1452:4: {...}? => ( ({...}? => ( (lv_props_10_0= 'OUT' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNodePropertyListAccess().getUnorderedGroup(), 9) ) {
            	        throw new FailedPredicateException(input, "ruleNodePropertyList", "getUnorderedGroupHelper().canSelect(grammarAccess.getNodePropertyListAccess().getUnorderedGroup(), 9)");
            	    }
            	    // InternalAst.g:1452:110: ( ({...}? => ( (lv_props_10_0= 'OUT' ) ) ) )
            	    // InternalAst.g:1453:5: ({...}? => ( (lv_props_10_0= 'OUT' ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getNodePropertyListAccess().getUnorderedGroup(), 9);
            	    				
            	    // InternalAst.g:1456:8: ({...}? => ( (lv_props_10_0= 'OUT' ) ) )
            	    // InternalAst.g:1456:9: {...}? => ( (lv_props_10_0= 'OUT' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleNodePropertyList", "true");
            	    }
            	    // InternalAst.g:1456:18: ( (lv_props_10_0= 'OUT' ) )
            	    // InternalAst.g:1456:19: (lv_props_10_0= 'OUT' )
            	    {
            	    // InternalAst.g:1456:19: (lv_props_10_0= 'OUT' )
            	    // InternalAst.g:1457:9: lv_props_10_0= 'OUT'
            	    {
            	    lv_props_10_0=(Token)match(input,35,FOLLOW_21); 

            	    									newLeafNode(lv_props_10_0, grammarAccess.getNodePropertyListAccess().getPropsOUTKeyword_9_0());
            	    								

            	    									if (current==null) {
            	    										current = createModelElement(grammarAccess.getNodePropertyListRule());
            	    									}
            	    									addWithLastConsumed(current, "props", lv_props_10_0, "OUT");
            	    								

            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getNodePropertyListAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 11 :
            	    // InternalAst.g:1474:3: ({...}? => ( ({...}? => ( (lv_props_11_0= 'SYN' ) ) ) ) )
            	    {
            	    // InternalAst.g:1474:3: ({...}? => ( ({...}? => ( (lv_props_11_0= 'SYN' ) ) ) ) )
            	    // InternalAst.g:1475:4: {...}? => ( ({...}? => ( (lv_props_11_0= 'SYN' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNodePropertyListAccess().getUnorderedGroup(), 10) ) {
            	        throw new FailedPredicateException(input, "ruleNodePropertyList", "getUnorderedGroupHelper().canSelect(grammarAccess.getNodePropertyListAccess().getUnorderedGroup(), 10)");
            	    }
            	    // InternalAst.g:1475:111: ( ({...}? => ( (lv_props_11_0= 'SYN' ) ) ) )
            	    // InternalAst.g:1476:5: ({...}? => ( (lv_props_11_0= 'SYN' ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getNodePropertyListAccess().getUnorderedGroup(), 10);
            	    				
            	    // InternalAst.g:1479:8: ({...}? => ( (lv_props_11_0= 'SYN' ) ) )
            	    // InternalAst.g:1479:9: {...}? => ( (lv_props_11_0= 'SYN' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleNodePropertyList", "true");
            	    }
            	    // InternalAst.g:1479:18: ( (lv_props_11_0= 'SYN' ) )
            	    // InternalAst.g:1479:19: (lv_props_11_0= 'SYN' )
            	    {
            	    // InternalAst.g:1479:19: (lv_props_11_0= 'SYN' )
            	    // InternalAst.g:1480:9: lv_props_11_0= 'SYN'
            	    {
            	    lv_props_11_0=(Token)match(input,36,FOLLOW_21); 

            	    									newLeafNode(lv_props_11_0, grammarAccess.getNodePropertyListAccess().getPropsSYNKeyword_10_0());
            	    								

            	    									if (current==null) {
            	    										current = createModelElement(grammarAccess.getNodePropertyListRule());
            	    									}
            	    									addWithLastConsumed(current, "props", lv_props_11_0, "SYN");
            	    								

            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getNodePropertyListAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 12 :
            	    // InternalAst.g:1497:3: ({...}? => ( ({...}? => ( (lv_props_12_0= 'INH' ) ) ) ) )
            	    {
            	    // InternalAst.g:1497:3: ({...}? => ( ({...}? => ( (lv_props_12_0= 'INH' ) ) ) ) )
            	    // InternalAst.g:1498:4: {...}? => ( ({...}? => ( (lv_props_12_0= 'INH' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNodePropertyListAccess().getUnorderedGroup(), 11) ) {
            	        throw new FailedPredicateException(input, "ruleNodePropertyList", "getUnorderedGroupHelper().canSelect(grammarAccess.getNodePropertyListAccess().getUnorderedGroup(), 11)");
            	    }
            	    // InternalAst.g:1498:111: ( ({...}? => ( (lv_props_12_0= 'INH' ) ) ) )
            	    // InternalAst.g:1499:5: ({...}? => ( (lv_props_12_0= 'INH' ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getNodePropertyListAccess().getUnorderedGroup(), 11);
            	    				
            	    // InternalAst.g:1502:8: ({...}? => ( (lv_props_12_0= 'INH' ) ) )
            	    // InternalAst.g:1502:9: {...}? => ( (lv_props_12_0= 'INH' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleNodePropertyList", "true");
            	    }
            	    // InternalAst.g:1502:18: ( (lv_props_12_0= 'INH' ) )
            	    // InternalAst.g:1502:19: (lv_props_12_0= 'INH' )
            	    {
            	    // InternalAst.g:1502:19: (lv_props_12_0= 'INH' )
            	    // InternalAst.g:1503:9: lv_props_12_0= 'INH'
            	    {
            	    lv_props_12_0=(Token)match(input,37,FOLLOW_21); 

            	    									newLeafNode(lv_props_12_0, grammarAccess.getNodePropertyListAccess().getPropsINHKeyword_11_0());
            	    								

            	    									if (current==null) {
            	    										current = createModelElement(grammarAccess.getNodePropertyListRule());
            	    									}
            	    									addWithLastConsumed(current, "props", lv_props_12_0, "INH");
            	    								

            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getNodePropertyListAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 13 :
            	    // InternalAst.g:1520:3: ({...}? => ( ({...}? => ( (lv_props_13_0= 'REV' ) ) ) ) )
            	    {
            	    // InternalAst.g:1520:3: ({...}? => ( ({...}? => ( (lv_props_13_0= 'REV' ) ) ) ) )
            	    // InternalAst.g:1521:4: {...}? => ( ({...}? => ( (lv_props_13_0= 'REV' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNodePropertyListAccess().getUnorderedGroup(), 12) ) {
            	        throw new FailedPredicateException(input, "ruleNodePropertyList", "getUnorderedGroupHelper().canSelect(grammarAccess.getNodePropertyListAccess().getUnorderedGroup(), 12)");
            	    }
            	    // InternalAst.g:1521:111: ( ({...}? => ( (lv_props_13_0= 'REV' ) ) ) )
            	    // InternalAst.g:1522:5: ({...}? => ( (lv_props_13_0= 'REV' ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getNodePropertyListAccess().getUnorderedGroup(), 12);
            	    				
            	    // InternalAst.g:1525:8: ({...}? => ( (lv_props_13_0= 'REV' ) ) )
            	    // InternalAst.g:1525:9: {...}? => ( (lv_props_13_0= 'REV' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleNodePropertyList", "true");
            	    }
            	    // InternalAst.g:1525:18: ( (lv_props_13_0= 'REV' ) )
            	    // InternalAst.g:1525:19: (lv_props_13_0= 'REV' )
            	    {
            	    // InternalAst.g:1525:19: (lv_props_13_0= 'REV' )
            	    // InternalAst.g:1526:9: lv_props_13_0= 'REV'
            	    {
            	    lv_props_13_0=(Token)match(input,38,FOLLOW_21); 

            	    									newLeafNode(lv_props_13_0, grammarAccess.getNodePropertyListAccess().getPropsREVKeyword_12_0());
            	    								

            	    									if (current==null) {
            	    										current = createModelElement(grammarAccess.getNodePropertyListRule());
            	    									}
            	    									addWithLastConsumed(current, "props", lv_props_13_0, "REV");
            	    								

            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getNodePropertyListAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            }


            }

             
            			  getUnorderedGroupHelper().leave(grammarAccess.getNodePropertyListAccess().getUnorderedGroup());
            			

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
    // $ANTLR end "ruleNodePropertyList"


    // $ANTLR start "entryRuleDeclare"
    // InternalAst.g:1553:1: entryRuleDeclare returns [EObject current=null] : iv_ruleDeclare= ruleDeclare EOF ;
    public final EObject entryRuleDeclare() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclare = null;


        try {
            // InternalAst.g:1553:48: (iv_ruleDeclare= ruleDeclare EOF )
            // InternalAst.g:1554:2: iv_ruleDeclare= ruleDeclare EOF
            {
             newCompositeNode(grammarAccess.getDeclareRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeclare=ruleDeclare();

            state._fsp--;

             current =iv_ruleDeclare; 
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
    // $ANTLR end "entryRuleDeclare"


    // $ANTLR start "ruleDeclare"
    // InternalAst.g:1560:1: ruleDeclare returns [EObject current=null] : (otherlv_0= 'DECLARE' ( (lv_nodes_1_0= ruleDeclareNode ) )* ) ;
    public final EObject ruleDeclare() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_nodes_1_0 = null;



        	enterRule();

        try {
            // InternalAst.g:1566:2: ( (otherlv_0= 'DECLARE' ( (lv_nodes_1_0= ruleDeclareNode ) )* ) )
            // InternalAst.g:1567:2: (otherlv_0= 'DECLARE' ( (lv_nodes_1_0= ruleDeclareNode ) )* )
            {
            // InternalAst.g:1567:2: (otherlv_0= 'DECLARE' ( (lv_nodes_1_0= ruleDeclareNode ) )* )
            // InternalAst.g:1568:3: otherlv_0= 'DECLARE' ( (lv_nodes_1_0= ruleDeclareNode ) )*
            {
            otherlv_0=(Token)match(input,39,FOLLOW_22); 

            			newLeafNode(otherlv_0, grammarAccess.getDeclareAccess().getDECLAREKeyword_0());
            		
            // InternalAst.g:1572:3: ( (lv_nodes_1_0= ruleDeclareNode ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=RULE_ID && LA14_0<=RULE_STRING)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalAst.g:1573:4: (lv_nodes_1_0= ruleDeclareNode )
            	    {
            	    // InternalAst.g:1573:4: (lv_nodes_1_0= ruleDeclareNode )
            	    // InternalAst.g:1574:5: lv_nodes_1_0= ruleDeclareNode
            	    {

            	    					newCompositeNode(grammarAccess.getDeclareAccess().getNodesDeclareNodeParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_22);
            	    lv_nodes_1_0=ruleDeclareNode();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDeclareRule());
            	    					}
            	    					add(
            	    						current,
            	    						"nodes",
            	    						lv_nodes_1_0,
            	    						"de.roma.cocktail.xtext.Ast.DeclareNode");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // $ANTLR end "ruleDeclare"


    // $ANTLR start "entryRuleDeclareNode"
    // InternalAst.g:1595:1: entryRuleDeclareNode returns [EObject current=null] : iv_ruleDeclareNode= ruleDeclareNode EOF ;
    public final EObject entryRuleDeclareNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclareNode = null;


        try {
            // InternalAst.g:1595:52: (iv_ruleDeclareNode= ruleDeclareNode EOF )
            // InternalAst.g:1596:2: iv_ruleDeclareNode= ruleDeclareNode EOF
            {
             newCompositeNode(grammarAccess.getDeclareNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeclareNode=ruleDeclareNode();

            state._fsp--;

             current =iv_ruleDeclareNode; 
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
    // $ANTLR end "entryRuleDeclareNode"


    // $ANTLR start "ruleDeclareNode"
    // InternalAst.g:1602:1: ruleDeclareNode returns [EObject current=null] : ( ( (lv_names_0_0= ruleNodeName ) )+ ( ( (lv_type_1_1= '=' | lv_type_1_2= ':' ) ) ) ( (lv_part_2_0= ruleNodePart ) )* otherlv_3= '.' ) ;
    public final EObject ruleDeclareNode() throws RecognitionException {
        EObject current = null;

        Token lv_type_1_1=null;
        Token lv_type_1_2=null;
        Token otherlv_3=null;
        EObject lv_names_0_0 = null;

        EObject lv_part_2_0 = null;



        	enterRule();

        try {
            // InternalAst.g:1608:2: ( ( ( (lv_names_0_0= ruleNodeName ) )+ ( ( (lv_type_1_1= '=' | lv_type_1_2= ':' ) ) ) ( (lv_part_2_0= ruleNodePart ) )* otherlv_3= '.' ) )
            // InternalAst.g:1609:2: ( ( (lv_names_0_0= ruleNodeName ) )+ ( ( (lv_type_1_1= '=' | lv_type_1_2= ':' ) ) ) ( (lv_part_2_0= ruleNodePart ) )* otherlv_3= '.' )
            {
            // InternalAst.g:1609:2: ( ( (lv_names_0_0= ruleNodeName ) )+ ( ( (lv_type_1_1= '=' | lv_type_1_2= ':' ) ) ) ( (lv_part_2_0= ruleNodePart ) )* otherlv_3= '.' )
            // InternalAst.g:1610:3: ( (lv_names_0_0= ruleNodeName ) )+ ( ( (lv_type_1_1= '=' | lv_type_1_2= ':' ) ) ) ( (lv_part_2_0= ruleNodePart ) )* otherlv_3= '.'
            {
            // InternalAst.g:1610:3: ( (lv_names_0_0= ruleNodeName ) )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=RULE_ID && LA15_0<=RULE_STRING)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalAst.g:1611:4: (lv_names_0_0= ruleNodeName )
            	    {
            	    // InternalAst.g:1611:4: (lv_names_0_0= ruleNodeName )
            	    // InternalAst.g:1612:5: lv_names_0_0= ruleNodeName
            	    {

            	    					newCompositeNode(grammarAccess.getDeclareNodeAccess().getNamesNodeNameParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_23);
            	    lv_names_0_0=ruleNodeName();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDeclareNodeRule());
            	    					}
            	    					add(
            	    						current,
            	    						"names",
            	    						lv_names_0_0,
            	    						"de.roma.cocktail.xtext.Ast.NodeName");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
            } while (true);

            // InternalAst.g:1629:3: ( ( (lv_type_1_1= '=' | lv_type_1_2= ':' ) ) )
            // InternalAst.g:1630:4: ( (lv_type_1_1= '=' | lv_type_1_2= ':' ) )
            {
            // InternalAst.g:1630:4: ( (lv_type_1_1= '=' | lv_type_1_2= ':' ) )
            // InternalAst.g:1631:5: (lv_type_1_1= '=' | lv_type_1_2= ':' )
            {
            // InternalAst.g:1631:5: (lv_type_1_1= '=' | lv_type_1_2= ':' )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==40) ) {
                alt16=1;
            }
            else if ( (LA16_0==41) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalAst.g:1632:6: lv_type_1_1= '='
                    {
                    lv_type_1_1=(Token)match(input,40,FOLLOW_24); 

                    						newLeafNode(lv_type_1_1, grammarAccess.getDeclareNodeAccess().getTypeEqualsSignKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDeclareNodeRule());
                    						}
                    						setWithLastConsumed(current, "type", lv_type_1_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalAst.g:1643:6: lv_type_1_2= ':'
                    {
                    lv_type_1_2=(Token)match(input,41,FOLLOW_24); 

                    						newLeafNode(lv_type_1_2, grammarAccess.getDeclareNodeAccess().getTypeColonKeyword_1_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDeclareNodeRule());
                    						}
                    						setWithLastConsumed(current, "type", lv_type_1_2, null);
                    					

                    }
                    break;

            }


            }


            }

            // InternalAst.g:1656:3: ( (lv_part_2_0= ruleNodePart ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_ID||LA17_0==47) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalAst.g:1657:4: (lv_part_2_0= ruleNodePart )
            	    {
            	    // InternalAst.g:1657:4: (lv_part_2_0= ruleNodePart )
            	    // InternalAst.g:1658:5: lv_part_2_0= ruleNodePart
            	    {

            	    					newCompositeNode(grammarAccess.getDeclareNodeAccess().getPartNodePartParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_24);
            	    lv_part_2_0=ruleNodePart();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDeclareNodeRule());
            	    					}
            	    					add(
            	    						current,
            	    						"part",
            	    						lv_part_2_0,
            	    						"de.roma.cocktail.xtext.Ast.NodePart");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            otherlv_3=(Token)match(input,42,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getDeclareNodeAccess().getFullStopKeyword_3());
            		

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
    // $ANTLR end "ruleDeclareNode"


    // $ANTLR start "entryRuleRule"
    // InternalAst.g:1683:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // InternalAst.g:1683:45: (iv_ruleRule= ruleRule EOF )
            // InternalAst.g:1684:2: iv_ruleRule= ruleRule EOF
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
    // InternalAst.g:1690:1: ruleRule returns [EObject current=null] : (otherlv_0= 'RULE' ( (lv_nodes_1_0= ruleRootNode ) )* ) ;
    public final EObject ruleRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_nodes_1_0 = null;



        	enterRule();

        try {
            // InternalAst.g:1696:2: ( (otherlv_0= 'RULE' ( (lv_nodes_1_0= ruleRootNode ) )* ) )
            // InternalAst.g:1697:2: (otherlv_0= 'RULE' ( (lv_nodes_1_0= ruleRootNode ) )* )
            {
            // InternalAst.g:1697:2: (otherlv_0= 'RULE' ( (lv_nodes_1_0= ruleRootNode ) )* )
            // InternalAst.g:1698:3: otherlv_0= 'RULE' ( (lv_nodes_1_0= ruleRootNode ) )*
            {
            otherlv_0=(Token)match(input,43,FOLLOW_22); 

            			newLeafNode(otherlv_0, grammarAccess.getRuleAccess().getRULEKeyword_0());
            		
            // InternalAst.g:1702:3: ( (lv_nodes_1_0= ruleRootNode ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=RULE_ID && LA18_0<=RULE_STRING)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalAst.g:1703:4: (lv_nodes_1_0= ruleRootNode )
            	    {
            	    // InternalAst.g:1703:4: (lv_nodes_1_0= ruleRootNode )
            	    // InternalAst.g:1704:5: lv_nodes_1_0= ruleRootNode
            	    {

            	    					newCompositeNode(grammarAccess.getRuleAccess().getNodesRootNodeParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_22);
            	    lv_nodes_1_0=ruleRootNode();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRuleRule());
            	    					}
            	    					add(
            	    						current,
            	    						"nodes",
            	    						lv_nodes_1_0,
            	    						"de.roma.cocktail.xtext.Ast.RootNode");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
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


    // $ANTLR start "entryRuleRootNode"
    // InternalAst.g:1725:1: entryRuleRootNode returns [EObject current=null] : iv_ruleRootNode= ruleRootNode EOF ;
    public final EObject entryRuleRootNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRootNode = null;


        try {
            // InternalAst.g:1725:49: (iv_ruleRootNode= ruleRootNode EOF )
            // InternalAst.g:1726:2: iv_ruleRootNode= ruleRootNode EOF
            {
             newCompositeNode(grammarAccess.getRootNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRootNode=ruleRootNode();

            state._fsp--;

             current =iv_ruleRootNode; 
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
    // $ANTLR end "entryRuleRootNode"


    // $ANTLR start "ruleRootNode"
    // InternalAst.g:1732:1: ruleRootNode returns [EObject current=null] : ( ( (lv_name_0_0= ruleNodeName ) ) ( (lv_baseTypes_1_0= ruleBaseTypes ) )? ( (lv_type_2_0= ruleNodeType ) )? ( (lv_part_3_0= ruleNodePart ) )* ( (lv_extension_4_0= ruleExtensions ) )? otherlv_5= '.' ) ;
    public final EObject ruleRootNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_5=null;
        EObject lv_name_0_0 = null;

        EObject lv_baseTypes_1_0 = null;

        AntlrDatatypeRuleToken lv_type_2_0 = null;

        EObject lv_part_3_0 = null;

        EObject lv_extension_4_0 = null;



        	enterRule();

        try {
            // InternalAst.g:1738:2: ( ( ( (lv_name_0_0= ruleNodeName ) ) ( (lv_baseTypes_1_0= ruleBaseTypes ) )? ( (lv_type_2_0= ruleNodeType ) )? ( (lv_part_3_0= ruleNodePart ) )* ( (lv_extension_4_0= ruleExtensions ) )? otherlv_5= '.' ) )
            // InternalAst.g:1739:2: ( ( (lv_name_0_0= ruleNodeName ) ) ( (lv_baseTypes_1_0= ruleBaseTypes ) )? ( (lv_type_2_0= ruleNodeType ) )? ( (lv_part_3_0= ruleNodePart ) )* ( (lv_extension_4_0= ruleExtensions ) )? otherlv_5= '.' )
            {
            // InternalAst.g:1739:2: ( ( (lv_name_0_0= ruleNodeName ) ) ( (lv_baseTypes_1_0= ruleBaseTypes ) )? ( (lv_type_2_0= ruleNodeType ) )? ( (lv_part_3_0= ruleNodePart ) )* ( (lv_extension_4_0= ruleExtensions ) )? otherlv_5= '.' )
            // InternalAst.g:1740:3: ( (lv_name_0_0= ruleNodeName ) ) ( (lv_baseTypes_1_0= ruleBaseTypes ) )? ( (lv_type_2_0= ruleNodeType ) )? ( (lv_part_3_0= ruleNodePart ) )* ( (lv_extension_4_0= ruleExtensions ) )? otherlv_5= '.'
            {
            // InternalAst.g:1740:3: ( (lv_name_0_0= ruleNodeName ) )
            // InternalAst.g:1741:4: (lv_name_0_0= ruleNodeName )
            {
            // InternalAst.g:1741:4: (lv_name_0_0= ruleNodeName )
            // InternalAst.g:1742:5: lv_name_0_0= ruleNodeName
            {

            					newCompositeNode(grammarAccess.getRootNodeAccess().getNameNodeNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_25);
            lv_name_0_0=ruleNodeName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRootNodeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"de.roma.cocktail.xtext.Ast.NodeName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAst.g:1759:3: ( (lv_baseTypes_1_0= ruleBaseTypes ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==44) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalAst.g:1760:4: (lv_baseTypes_1_0= ruleBaseTypes )
                    {
                    // InternalAst.g:1760:4: (lv_baseTypes_1_0= ruleBaseTypes )
                    // InternalAst.g:1761:5: lv_baseTypes_1_0= ruleBaseTypes
                    {

                    					newCompositeNode(grammarAccess.getRootNodeAccess().getBaseTypesBaseTypesParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_26);
                    lv_baseTypes_1_0=ruleBaseTypes();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getRootNodeRule());
                    					}
                    					set(
                    						current,
                    						"baseTypes",
                    						lv_baseTypes_1_0,
                    						"de.roma.cocktail.xtext.Ast.BaseTypes");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalAst.g:1778:3: ( (lv_type_2_0= ruleNodeType ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=40 && LA20_0<=41)||LA20_0==48) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalAst.g:1779:4: (lv_type_2_0= ruleNodeType )
                    {
                    // InternalAst.g:1779:4: (lv_type_2_0= ruleNodeType )
                    // InternalAst.g:1780:5: lv_type_2_0= ruleNodeType
                    {

                    					newCompositeNode(grammarAccess.getRootNodeAccess().getTypeNodeTypeParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_27);
                    lv_type_2_0=ruleNodeType();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getRootNodeRule());
                    					}
                    					set(
                    						current,
                    						"type",
                    						lv_type_2_0,
                    						"de.roma.cocktail.xtext.Ast.NodeType");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalAst.g:1797:3: ( (lv_part_3_0= ruleNodePart ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_ID||LA21_0==47) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalAst.g:1798:4: (lv_part_3_0= ruleNodePart )
            	    {
            	    // InternalAst.g:1798:4: (lv_part_3_0= ruleNodePart )
            	    // InternalAst.g:1799:5: lv_part_3_0= ruleNodePart
            	    {

            	    					newCompositeNode(grammarAccess.getRootNodeAccess().getPartNodePartParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_27);
            	    lv_part_3_0=ruleNodePart();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRootNodeRule());
            	    					}
            	    					add(
            	    						current,
            	    						"part",
            	    						lv_part_3_0,
            	    						"de.roma.cocktail.xtext.Ast.NodePart");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            // InternalAst.g:1816:3: ( (lv_extension_4_0= ruleExtensions ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==45) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalAst.g:1817:4: (lv_extension_4_0= ruleExtensions )
                    {
                    // InternalAst.g:1817:4: (lv_extension_4_0= ruleExtensions )
                    // InternalAst.g:1818:5: lv_extension_4_0= ruleExtensions
                    {

                    					newCompositeNode(grammarAccess.getRootNodeAccess().getExtensionExtensionsParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_28);
                    lv_extension_4_0=ruleExtensions();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getRootNodeRule());
                    					}
                    					set(
                    						current,
                    						"extension",
                    						lv_extension_4_0,
                    						"de.roma.cocktail.xtext.Ast.Extensions");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,42,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getRootNodeAccess().getFullStopKeyword_5());
            		

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
    // $ANTLR end "ruleRootNode"


    // $ANTLR start "entryRuleBaseTypes"
    // InternalAst.g:1843:1: entryRuleBaseTypes returns [EObject current=null] : iv_ruleBaseTypes= ruleBaseTypes EOF ;
    public final EObject entryRuleBaseTypes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBaseTypes = null;


        try {
            // InternalAst.g:1843:50: (iv_ruleBaseTypes= ruleBaseTypes EOF )
            // InternalAst.g:1844:2: iv_ruleBaseTypes= ruleBaseTypes EOF
            {
             newCompositeNode(grammarAccess.getBaseTypesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBaseTypes=ruleBaseTypes();

            state._fsp--;

             current =iv_ruleBaseTypes; 
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
    // $ANTLR end "entryRuleBaseTypes"


    // $ANTLR start "ruleBaseTypes"
    // InternalAst.g:1850:1: ruleBaseTypes returns [EObject current=null] : (otherlv_0= '<-' ( (otherlv_1= RULE_ID ) )* ) ;
    public final EObject ruleBaseTypes() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalAst.g:1856:2: ( (otherlv_0= '<-' ( (otherlv_1= RULE_ID ) )* ) )
            // InternalAst.g:1857:2: (otherlv_0= '<-' ( (otherlv_1= RULE_ID ) )* )
            {
            // InternalAst.g:1857:2: (otherlv_0= '<-' ( (otherlv_1= RULE_ID ) )* )
            // InternalAst.g:1858:3: otherlv_0= '<-' ( (otherlv_1= RULE_ID ) )*
            {
            otherlv_0=(Token)match(input,44,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getBaseTypesAccess().getLessThanSignHyphenMinusKeyword_0());
            		
            // InternalAst.g:1862:3: ( (otherlv_1= RULE_ID ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_ID) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalAst.g:1863:4: (otherlv_1= RULE_ID )
            	    {
            	    // InternalAst.g:1863:4: (otherlv_1= RULE_ID )
            	    // InternalAst.g:1864:5: otherlv_1= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getBaseTypesRule());
            	    					}
            	    				
            	    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_15); 

            	    					newLeafNode(otherlv_1, grammarAccess.getBaseTypesAccess().getNamesNodeNameCrossReference_1_0());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
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
    // $ANTLR end "ruleBaseTypes"


    // $ANTLR start "entryRuleExtensions"
    // InternalAst.g:1879:1: entryRuleExtensions returns [EObject current=null] : iv_ruleExtensions= ruleExtensions EOF ;
    public final EObject entryRuleExtensions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtensions = null;


        try {
            // InternalAst.g:1879:51: (iv_ruleExtensions= ruleExtensions EOF )
            // InternalAst.g:1880:2: iv_ruleExtensions= ruleExtensions EOF
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
    // InternalAst.g:1886:1: ruleExtensions returns [EObject current=null] : (otherlv_0= '<' ( (lv_nodes_1_0= ruleRootNode ) )* otherlv_2= '>' ) ;
    public final EObject ruleExtensions() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_nodes_1_0 = null;



        	enterRule();

        try {
            // InternalAst.g:1892:2: ( (otherlv_0= '<' ( (lv_nodes_1_0= ruleRootNode ) )* otherlv_2= '>' ) )
            // InternalAst.g:1893:2: (otherlv_0= '<' ( (lv_nodes_1_0= ruleRootNode ) )* otherlv_2= '>' )
            {
            // InternalAst.g:1893:2: (otherlv_0= '<' ( (lv_nodes_1_0= ruleRootNode ) )* otherlv_2= '>' )
            // InternalAst.g:1894:3: otherlv_0= '<' ( (lv_nodes_1_0= ruleRootNode ) )* otherlv_2= '>'
            {
            otherlv_0=(Token)match(input,45,FOLLOW_29); 

            			newLeafNode(otherlv_0, grammarAccess.getExtensionsAccess().getLessThanSignKeyword_0());
            		
            // InternalAst.g:1898:3: ( (lv_nodes_1_0= ruleRootNode ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=RULE_ID && LA24_0<=RULE_STRING)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalAst.g:1899:4: (lv_nodes_1_0= ruleRootNode )
            	    {
            	    // InternalAst.g:1899:4: (lv_nodes_1_0= ruleRootNode )
            	    // InternalAst.g:1900:5: lv_nodes_1_0= ruleRootNode
            	    {

            	    					newCompositeNode(grammarAccess.getExtensionsAccess().getNodesRootNodeParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_29);
            	    lv_nodes_1_0=ruleRootNode();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getExtensionsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"nodes",
            	    						lv_nodes_1_0,
            	    						"de.roma.cocktail.xtext.Ast.RootNode");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            otherlv_2=(Token)match(input,46,FOLLOW_2); 

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
    // InternalAst.g:1925:1: entryRuleNodePart returns [EObject current=null] : iv_ruleNodePart= ruleNodePart EOF ;
    public final EObject entryRuleNodePart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNodePart = null;


        try {
            // InternalAst.g:1925:49: (iv_ruleNodePart= ruleNodePart EOF )
            // InternalAst.g:1926:2: iv_ruleNodePart= ruleNodePart EOF
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
    // InternalAst.g:1932:1: ruleNodePart returns [EObject current=null] : ( ( ( (lv_child_0_0= ruleChildNode ) ) ( (lv_properties_1_0= ruleNodePropertyList ) ) ) | ( (lv_attribute_2_0= ruleNodeAttribute ) ) ) ;
    public final EObject ruleNodePart() throws RecognitionException {
        EObject current = null;

        EObject lv_child_0_0 = null;

        EObject lv_properties_1_0 = null;

        EObject lv_attribute_2_0 = null;



        	enterRule();

        try {
            // InternalAst.g:1938:2: ( ( ( ( (lv_child_0_0= ruleChildNode ) ) ( (lv_properties_1_0= ruleNodePropertyList ) ) ) | ( (lv_attribute_2_0= ruleNodeAttribute ) ) ) )
            // InternalAst.g:1939:2: ( ( ( (lv_child_0_0= ruleChildNode ) ) ( (lv_properties_1_0= ruleNodePropertyList ) ) ) | ( (lv_attribute_2_0= ruleNodeAttribute ) ) )
            {
            // InternalAst.g:1939:2: ( ( ( (lv_child_0_0= ruleChildNode ) ) ( (lv_properties_1_0= ruleNodePropertyList ) ) ) | ( (lv_attribute_2_0= ruleNodeAttribute ) ) )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_ID) ) {
                alt25=1;
            }
            else if ( (LA25_0==47) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalAst.g:1940:3: ( ( (lv_child_0_0= ruleChildNode ) ) ( (lv_properties_1_0= ruleNodePropertyList ) ) )
                    {
                    // InternalAst.g:1940:3: ( ( (lv_child_0_0= ruleChildNode ) ) ( (lv_properties_1_0= ruleNodePropertyList ) ) )
                    // InternalAst.g:1941:4: ( (lv_child_0_0= ruleChildNode ) ) ( (lv_properties_1_0= ruleNodePropertyList ) )
                    {
                    // InternalAst.g:1941:4: ( (lv_child_0_0= ruleChildNode ) )
                    // InternalAst.g:1942:5: (lv_child_0_0= ruleChildNode )
                    {
                    // InternalAst.g:1942:5: (lv_child_0_0= ruleChildNode )
                    // InternalAst.g:1943:6: lv_child_0_0= ruleChildNode
                    {

                    						newCompositeNode(grammarAccess.getNodePartAccess().getChildChildNodeParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_30);
                    lv_child_0_0=ruleChildNode();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNodePartRule());
                    						}
                    						set(
                    							current,
                    							"child",
                    							lv_child_0_0,
                    							"de.roma.cocktail.xtext.Ast.ChildNode");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAst.g:1960:4: ( (lv_properties_1_0= ruleNodePropertyList ) )
                    // InternalAst.g:1961:5: (lv_properties_1_0= ruleNodePropertyList )
                    {
                    // InternalAst.g:1961:5: (lv_properties_1_0= ruleNodePropertyList )
                    // InternalAst.g:1962:6: lv_properties_1_0= ruleNodePropertyList
                    {

                    						newCompositeNode(grammarAccess.getNodePartAccess().getPropertiesNodePropertyListParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_properties_1_0=ruleNodePropertyList();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNodePartRule());
                    						}
                    						set(
                    							current,
                    							"properties",
                    							lv_properties_1_0,
                    							"de.roma.cocktail.xtext.Ast.NodePropertyList");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAst.g:1981:3: ( (lv_attribute_2_0= ruleNodeAttribute ) )
                    {
                    // InternalAst.g:1981:3: ( (lv_attribute_2_0= ruleNodeAttribute ) )
                    // InternalAst.g:1982:4: (lv_attribute_2_0= ruleNodeAttribute )
                    {
                    // InternalAst.g:1982:4: (lv_attribute_2_0= ruleNodeAttribute )
                    // InternalAst.g:1983:5: lv_attribute_2_0= ruleNodeAttribute
                    {

                    					newCompositeNode(grammarAccess.getNodePartAccess().getAttributeNodeAttributeParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_attribute_2_0=ruleNodeAttribute();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getNodePartRule());
                    					}
                    					set(
                    						current,
                    						"attribute",
                    						lv_attribute_2_0,
                    						"de.roma.cocktail.xtext.Ast.NodeAttribute");
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


    // $ANTLR start "entryRuleChildNode"
    // InternalAst.g:2004:1: entryRuleChildNode returns [EObject current=null] : iv_ruleChildNode= ruleChildNode EOF ;
    public final EObject entryRuleChildNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChildNode = null;


        try {
            // InternalAst.g:2004:50: (iv_ruleChildNode= ruleChildNode EOF )
            // InternalAst.g:2005:2: iv_ruleChildNode= ruleChildNode EOF
            {
             newCompositeNode(grammarAccess.getChildNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleChildNode=ruleChildNode();

            state._fsp--;

             current =iv_ruleChildNode; 
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
    // $ANTLR end "entryRuleChildNode"


    // $ANTLR start "ruleChildNode"
    // InternalAst.g:2011:1: ruleChildNode returns [EObject current=null] : ( ( ( (lv_selector_0_0= RULE_ID ) ) otherlv_1= ':' )? ( (lv_type_2_0= RULE_ID ) ) ) ;
    public final EObject ruleChildNode() throws RecognitionException {
        EObject current = null;

        Token lv_selector_0_0=null;
        Token otherlv_1=null;
        Token lv_type_2_0=null;


        	enterRule();

        try {
            // InternalAst.g:2017:2: ( ( ( ( (lv_selector_0_0= RULE_ID ) ) otherlv_1= ':' )? ( (lv_type_2_0= RULE_ID ) ) ) )
            // InternalAst.g:2018:2: ( ( ( (lv_selector_0_0= RULE_ID ) ) otherlv_1= ':' )? ( (lv_type_2_0= RULE_ID ) ) )
            {
            // InternalAst.g:2018:2: ( ( ( (lv_selector_0_0= RULE_ID ) ) otherlv_1= ':' )? ( (lv_type_2_0= RULE_ID ) ) )
            // InternalAst.g:2019:3: ( ( (lv_selector_0_0= RULE_ID ) ) otherlv_1= ':' )? ( (lv_type_2_0= RULE_ID ) )
            {
            // InternalAst.g:2019:3: ( ( (lv_selector_0_0= RULE_ID ) ) otherlv_1= ':' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_ID) ) {
                int LA26_1 = input.LA(2);

                if ( (LA26_1==41) ) {
                    alt26=1;
                }
            }
            switch (alt26) {
                case 1 :
                    // InternalAst.g:2020:4: ( (lv_selector_0_0= RULE_ID ) ) otherlv_1= ':'
                    {
                    // InternalAst.g:2020:4: ( (lv_selector_0_0= RULE_ID ) )
                    // InternalAst.g:2021:5: (lv_selector_0_0= RULE_ID )
                    {
                    // InternalAst.g:2021:5: (lv_selector_0_0= RULE_ID )
                    // InternalAst.g:2022:6: lv_selector_0_0= RULE_ID
                    {
                    lv_selector_0_0=(Token)match(input,RULE_ID,FOLLOW_31); 

                    						newLeafNode(lv_selector_0_0, grammarAccess.getChildNodeAccess().getSelectorIDTerminalRuleCall_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getChildNodeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"selector",
                    							lv_selector_0_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    otherlv_1=(Token)match(input,41,FOLLOW_7); 

                    				newLeafNode(otherlv_1, grammarAccess.getChildNodeAccess().getColonKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalAst.g:2043:3: ( (lv_type_2_0= RULE_ID ) )
            // InternalAst.g:2044:4: (lv_type_2_0= RULE_ID )
            {
            // InternalAst.g:2044:4: (lv_type_2_0= RULE_ID )
            // InternalAst.g:2045:5: lv_type_2_0= RULE_ID
            {
            lv_type_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_type_2_0, grammarAccess.getChildNodeAccess().getTypeIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getChildNodeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"type",
            						lv_type_2_0,
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
    // $ANTLR end "ruleChildNode"


    // $ANTLR start "entryRuleNodeAttribute"
    // InternalAst.g:2065:1: entryRuleNodeAttribute returns [EObject current=null] : iv_ruleNodeAttribute= ruleNodeAttribute EOF ;
    public final EObject entryRuleNodeAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNodeAttribute = null;


        try {
            // InternalAst.g:2065:54: (iv_ruleNodeAttribute= ruleNodeAttribute EOF )
            // InternalAst.g:2066:2: iv_ruleNodeAttribute= ruleNodeAttribute EOF
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
    // InternalAst.g:2072:1: ruleNodeAttribute returns [EObject current=null] : (otherlv_0= '[' ( (lv_attribute_1_0= RULE_ID ) ) (otherlv_2= ':' ( (lv_type_3_0= RULE_ID ) ) )? ( ( (lv_properties_4_0= ruleNodePropertyList ) ) | (otherlv_5= ':=' ( (lv_expression_6_0= ruleTargetCodeExpression ) ) )? ) otherlv_7= ']' ) ;
    public final EObject ruleNodeAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_attribute_1_0=null;
        Token otherlv_2=null;
        Token lv_type_3_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_properties_4_0 = null;

        EObject lv_expression_6_0 = null;



        	enterRule();

        try {
            // InternalAst.g:2078:2: ( (otherlv_0= '[' ( (lv_attribute_1_0= RULE_ID ) ) (otherlv_2= ':' ( (lv_type_3_0= RULE_ID ) ) )? ( ( (lv_properties_4_0= ruleNodePropertyList ) ) | (otherlv_5= ':=' ( (lv_expression_6_0= ruleTargetCodeExpression ) ) )? ) otherlv_7= ']' ) )
            // InternalAst.g:2079:2: (otherlv_0= '[' ( (lv_attribute_1_0= RULE_ID ) ) (otherlv_2= ':' ( (lv_type_3_0= RULE_ID ) ) )? ( ( (lv_properties_4_0= ruleNodePropertyList ) ) | (otherlv_5= ':=' ( (lv_expression_6_0= ruleTargetCodeExpression ) ) )? ) otherlv_7= ']' )
            {
            // InternalAst.g:2079:2: (otherlv_0= '[' ( (lv_attribute_1_0= RULE_ID ) ) (otherlv_2= ':' ( (lv_type_3_0= RULE_ID ) ) )? ( ( (lv_properties_4_0= ruleNodePropertyList ) ) | (otherlv_5= ':=' ( (lv_expression_6_0= ruleTargetCodeExpression ) ) )? ) otherlv_7= ']' )
            // InternalAst.g:2080:3: otherlv_0= '[' ( (lv_attribute_1_0= RULE_ID ) ) (otherlv_2= ':' ( (lv_type_3_0= RULE_ID ) ) )? ( ( (lv_properties_4_0= ruleNodePropertyList ) ) | (otherlv_5= ':=' ( (lv_expression_6_0= ruleTargetCodeExpression ) ) )? ) otherlv_7= ']'
            {
            otherlv_0=(Token)match(input,47,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getNodeAttributeAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalAst.g:2084:3: ( (lv_attribute_1_0= RULE_ID ) )
            // InternalAst.g:2085:4: (lv_attribute_1_0= RULE_ID )
            {
            // InternalAst.g:2085:4: (lv_attribute_1_0= RULE_ID )
            // InternalAst.g:2086:5: lv_attribute_1_0= RULE_ID
            {
            lv_attribute_1_0=(Token)match(input,RULE_ID,FOLLOW_32); 

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

            // InternalAst.g:2102:3: (otherlv_2= ':' ( (lv_type_3_0= RULE_ID ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==41) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalAst.g:2103:4: otherlv_2= ':' ( (lv_type_3_0= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,41,FOLLOW_7); 

                    				newLeafNode(otherlv_2, grammarAccess.getNodeAttributeAccess().getColonKeyword_2_0());
                    			
                    // InternalAst.g:2107:4: ( (lv_type_3_0= RULE_ID ) )
                    // InternalAst.g:2108:5: (lv_type_3_0= RULE_ID )
                    {
                    // InternalAst.g:2108:5: (lv_type_3_0= RULE_ID )
                    // InternalAst.g:2109:6: lv_type_3_0= RULE_ID
                    {
                    lv_type_3_0=(Token)match(input,RULE_ID,FOLLOW_33); 

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

            // InternalAst.g:2126:3: ( ( (lv_properties_4_0= ruleNodePropertyList ) ) | (otherlv_5= ':=' ( (lv_expression_6_0= ruleTargetCodeExpression ) ) )? )
            int alt29=2;
            switch ( input.LA(1) ) {
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
                {
                alt29=1;
                }
                break;
            case 49:
                {
                alt29=1;
                }
                break;
            case 48:
                {
                alt29=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // InternalAst.g:2127:4: ( (lv_properties_4_0= ruleNodePropertyList ) )
                    {
                    // InternalAst.g:2127:4: ( (lv_properties_4_0= ruleNodePropertyList ) )
                    // InternalAst.g:2128:5: (lv_properties_4_0= ruleNodePropertyList )
                    {
                    // InternalAst.g:2128:5: (lv_properties_4_0= ruleNodePropertyList )
                    // InternalAst.g:2129:6: lv_properties_4_0= ruleNodePropertyList
                    {

                    						newCompositeNode(grammarAccess.getNodeAttributeAccess().getPropertiesNodePropertyListParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_34);
                    lv_properties_4_0=ruleNodePropertyList();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNodeAttributeRule());
                    						}
                    						set(
                    							current,
                    							"properties",
                    							lv_properties_4_0,
                    							"de.roma.cocktail.xtext.Ast.NodePropertyList");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAst.g:2147:4: (otherlv_5= ':=' ( (lv_expression_6_0= ruleTargetCodeExpression ) ) )?
                    {
                    // InternalAst.g:2147:4: (otherlv_5= ':=' ( (lv_expression_6_0= ruleTargetCodeExpression ) ) )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==48) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // InternalAst.g:2148:5: otherlv_5= ':=' ( (lv_expression_6_0= ruleTargetCodeExpression ) )
                            {
                            otherlv_5=(Token)match(input,48,FOLLOW_35); 

                            					newLeafNode(otherlv_5, grammarAccess.getNodeAttributeAccess().getColonEqualsSignKeyword_3_1_0());
                            				
                            // InternalAst.g:2152:5: ( (lv_expression_6_0= ruleTargetCodeExpression ) )
                            // InternalAst.g:2153:6: (lv_expression_6_0= ruleTargetCodeExpression )
                            {
                            // InternalAst.g:2153:6: (lv_expression_6_0= ruleTargetCodeExpression )
                            // InternalAst.g:2154:7: lv_expression_6_0= ruleTargetCodeExpression
                            {

                            							newCompositeNode(grammarAccess.getNodeAttributeAccess().getExpressionTargetCodeExpressionParserRuleCall_3_1_1_0());
                            						
                            pushFollow(FOLLOW_34);
                            lv_expression_6_0=ruleTargetCodeExpression();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getNodeAttributeRule());
                            							}
                            							set(
                            								current,
                            								"expression",
                            								lv_expression_6_0,
                            								"de.roma.cocktail.xtext.Ast.TargetCodeExpression");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,49,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getNodeAttributeAccess().getRightSquareBracketKeyword_4());
            		

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


    // $ANTLR start "entryRuleNodeName"
    // InternalAst.g:2181:1: entryRuleNodeName returns [EObject current=null] : iv_ruleNodeName= ruleNodeName EOF ;
    public final EObject entryRuleNodeName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNodeName = null;


        try {
            // InternalAst.g:2181:49: (iv_ruleNodeName= ruleNodeName EOF )
            // InternalAst.g:2182:2: iv_ruleNodeName= ruleNodeName EOF
            {
             newCompositeNode(grammarAccess.getNodeNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNodeName=ruleNodeName();

            state._fsp--;

             current =iv_ruleNodeName; 
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
    // $ANTLR end "entryRuleNodeName"


    // $ANTLR start "ruleNodeName"
    // InternalAst.g:2188:1: ruleNodeName returns [EObject current=null] : ( ( (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING ) ) ) ;
    public final EObject ruleNodeName() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_1=null;
        Token lv_name_0_2=null;


        	enterRule();

        try {
            // InternalAst.g:2194:2: ( ( ( (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING ) ) ) )
            // InternalAst.g:2195:2: ( ( (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING ) ) )
            {
            // InternalAst.g:2195:2: ( ( (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING ) ) )
            // InternalAst.g:2196:3: ( (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING ) )
            {
            // InternalAst.g:2196:3: ( (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING ) )
            // InternalAst.g:2197:4: (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING )
            {
            // InternalAst.g:2197:4: (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_ID) ) {
                alt30=1;
            }
            else if ( (LA30_0==RULE_STRING) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // InternalAst.g:2198:5: lv_name_0_1= RULE_ID
                    {
                    lv_name_0_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(lv_name_0_1, grammarAccess.getNodeNameAccess().getNameIDTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getNodeNameRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_0_1,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }
                    break;
                case 2 :
                    // InternalAst.g:2213:5: lv_name_0_2= RULE_STRING
                    {
                    lv_name_0_2=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    					newLeafNode(lv_name_0_2, grammarAccess.getNodeNameAccess().getNameSTRINGTerminalRuleCall_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getNodeNameRule());
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
    // $ANTLR end "ruleNodeName"


    // $ANTLR start "entryRuleNodeType"
    // InternalAst.g:2233:1: entryRuleNodeType returns [String current=null] : iv_ruleNodeType= ruleNodeType EOF ;
    public final String entryRuleNodeType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNodeType = null;


        try {
            // InternalAst.g:2233:48: (iv_ruleNodeType= ruleNodeType EOF )
            // InternalAst.g:2234:2: iv_ruleNodeType= ruleNodeType EOF
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
    // InternalAst.g:2240:1: ruleNodeType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '=' | kw= ':' | kw= ':=' ) ;
    public final AntlrDatatypeRuleToken ruleNodeType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAst.g:2246:2: ( (kw= '=' | kw= ':' | kw= ':=' ) )
            // InternalAst.g:2247:2: (kw= '=' | kw= ':' | kw= ':=' )
            {
            // InternalAst.g:2247:2: (kw= '=' | kw= ':' | kw= ':=' )
            int alt31=3;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt31=1;
                }
                break;
            case 41:
                {
                alt31=2;
                }
                break;
            case 48:
                {
                alt31=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // InternalAst.g:2248:3: kw= '='
                    {
                    kw=(Token)match(input,40,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getNodeTypeAccess().getEqualsSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAst.g:2254:3: kw= ':'
                    {
                    kw=(Token)match(input,41,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getNodeTypeAccess().getColonKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalAst.g:2260:3: kw= ':='
                    {
                    kw=(Token)match(input,48,FOLLOW_2); 

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


    // $ANTLR start "entryRuleCodeBlock"
    // InternalAst.g:2269:1: entryRuleCodeBlock returns [EObject current=null] : iv_ruleCodeBlock= ruleCodeBlock EOF ;
    public final EObject entryRuleCodeBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCodeBlock = null;


        try {
            // InternalAst.g:2269:50: (iv_ruleCodeBlock= ruleCodeBlock EOF )
            // InternalAst.g:2270:2: iv_ruleCodeBlock= ruleCodeBlock EOF
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
    // InternalAst.g:2276:1: ruleCodeBlock returns [EObject current=null] : ( ( ( (lv_wall_0_1= ruleCodeWall | lv_wall_0_2= '[' | lv_wall_0_3= ']' ) ) ) | (otherlv_1= '{' ( (lv_block_2_0= ruleCodeBlock ) ) otherlv_3= '}' ) )* ;
    public final EObject ruleCodeBlock() throws RecognitionException {
        EObject current = null;

        Token lv_wall_0_2=null;
        Token lv_wall_0_3=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_wall_0_1 = null;

        EObject lv_block_2_0 = null;



        	enterRule();

        try {
            // InternalAst.g:2282:2: ( ( ( ( (lv_wall_0_1= ruleCodeWall | lv_wall_0_2= '[' | lv_wall_0_3= ']' ) ) ) | (otherlv_1= '{' ( (lv_block_2_0= ruleCodeBlock ) ) otherlv_3= '}' ) )* )
            // InternalAst.g:2283:2: ( ( ( (lv_wall_0_1= ruleCodeWall | lv_wall_0_2= '[' | lv_wall_0_3= ']' ) ) ) | (otherlv_1= '{' ( (lv_block_2_0= ruleCodeBlock ) ) otherlv_3= '}' ) )*
            {
            // InternalAst.g:2283:2: ( ( ( (lv_wall_0_1= ruleCodeWall | lv_wall_0_2= '[' | lv_wall_0_3= ']' ) ) ) | (otherlv_1= '{' ( (lv_block_2_0= ruleCodeBlock ) ) otherlv_3= '}' ) )*
            loop33:
            do {
                int alt33=3;
                int LA33_0 = input.LA(1);

                if ( ((LA33_0>=RULE_ID && LA33_0<=RULE_WS)||(LA33_0>=40 && LA33_0<=42)||(LA33_0>=45 && LA33_0<=47)||(LA33_0>=49 && LA33_0<=64)) ) {
                    alt33=1;
                }
                else if ( (LA33_0==18) ) {
                    alt33=2;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalAst.g:2284:3: ( ( (lv_wall_0_1= ruleCodeWall | lv_wall_0_2= '[' | lv_wall_0_3= ']' ) ) )
            	    {
            	    // InternalAst.g:2284:3: ( ( (lv_wall_0_1= ruleCodeWall | lv_wall_0_2= '[' | lv_wall_0_3= ']' ) ) )
            	    // InternalAst.g:2285:4: ( (lv_wall_0_1= ruleCodeWall | lv_wall_0_2= '[' | lv_wall_0_3= ']' ) )
            	    {
            	    // InternalAst.g:2285:4: ( (lv_wall_0_1= ruleCodeWall | lv_wall_0_2= '[' | lv_wall_0_3= ']' ) )
            	    // InternalAst.g:2286:5: (lv_wall_0_1= ruleCodeWall | lv_wall_0_2= '[' | lv_wall_0_3= ']' )
            	    {
            	    // InternalAst.g:2286:5: (lv_wall_0_1= ruleCodeWall | lv_wall_0_2= '[' | lv_wall_0_3= ']' )
            	    int alt32=3;
            	    switch ( input.LA(1) ) {
            	    case RULE_ID:
            	    case RULE_STRING:
            	    case RULE_INT:
            	    case RULE_WS:
            	    case 40:
            	    case 41:
            	    case 42:
            	    case 45:
            	    case 46:
            	    case 50:
            	    case 51:
            	    case 52:
            	    case 53:
            	    case 54:
            	    case 55:
            	    case 56:
            	    case 57:
            	    case 58:
            	    case 59:
            	    case 60:
            	    case 61:
            	    case 62:
            	    case 63:
            	    case 64:
            	        {
            	        alt32=1;
            	        }
            	        break;
            	    case 47:
            	        {
            	        alt32=2;
            	        }
            	        break;
            	    case 49:
            	        {
            	        alt32=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 32, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt32) {
            	        case 1 :
            	            // InternalAst.g:2287:6: lv_wall_0_1= ruleCodeWall
            	            {

            	            						newCompositeNode(grammarAccess.getCodeBlockAccess().getWallCodeWallParserRuleCall_0_0_0());
            	            					
            	            pushFollow(FOLLOW_36);
            	            lv_wall_0_1=ruleCodeWall();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getCodeBlockRule());
            	            						}
            	            						add(
            	            							current,
            	            							"wall",
            	            							lv_wall_0_1,
            	            							"de.roma.cocktail.xtext.Ast.CodeWall");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;
            	        case 2 :
            	            // InternalAst.g:2303:6: lv_wall_0_2= '['
            	            {
            	            lv_wall_0_2=(Token)match(input,47,FOLLOW_36); 

            	            						newLeafNode(lv_wall_0_2, grammarAccess.getCodeBlockAccess().getWallLeftSquareBracketKeyword_0_0_1());
            	            					

            	            						if (current==null) {
            	            							current = createModelElement(grammarAccess.getCodeBlockRule());
            	            						}
            	            						addWithLastConsumed(current, "wall", lv_wall_0_2, null);
            	            					

            	            }
            	            break;
            	        case 3 :
            	            // InternalAst.g:2314:6: lv_wall_0_3= ']'
            	            {
            	            lv_wall_0_3=(Token)match(input,49,FOLLOW_36); 

            	            						newLeafNode(lv_wall_0_3, grammarAccess.getCodeBlockAccess().getWallRightSquareBracketKeyword_0_0_2());
            	            					

            	            						if (current==null) {
            	            							current = createModelElement(grammarAccess.getCodeBlockRule());
            	            						}
            	            						addWithLastConsumed(current, "wall", lv_wall_0_3, null);
            	            					

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalAst.g:2328:3: (otherlv_1= '{' ( (lv_block_2_0= ruleCodeBlock ) ) otherlv_3= '}' )
            	    {
            	    // InternalAst.g:2328:3: (otherlv_1= '{' ( (lv_block_2_0= ruleCodeBlock ) ) otherlv_3= '}' )
            	    // InternalAst.g:2329:4: otherlv_1= '{' ( (lv_block_2_0= ruleCodeBlock ) ) otherlv_3= '}'
            	    {
            	    otherlv_1=(Token)match(input,18,FOLLOW_17); 

            	    				newLeafNode(otherlv_1, grammarAccess.getCodeBlockAccess().getLeftCurlyBracketKeyword_1_0());
            	    			
            	    // InternalAst.g:2333:4: ( (lv_block_2_0= ruleCodeBlock ) )
            	    // InternalAst.g:2334:5: (lv_block_2_0= ruleCodeBlock )
            	    {
            	    // InternalAst.g:2334:5: (lv_block_2_0= ruleCodeBlock )
            	    // InternalAst.g:2335:6: lv_block_2_0= ruleCodeBlock
            	    {

            	    						newCompositeNode(grammarAccess.getCodeBlockAccess().getBlockCodeBlockParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_18);
            	    lv_block_2_0=ruleCodeBlock();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getCodeBlockRule());
            	    						}
            	    						add(
            	    							current,
            	    							"block",
            	    							lv_block_2_0,
            	    							"de.roma.cocktail.xtext.Ast.CodeBlock");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_3=(Token)match(input,19,FOLLOW_36); 

            	    				newLeafNode(otherlv_3, grammarAccess.getCodeBlockAccess().getRightCurlyBracketKeyword_1_2());
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop33;
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
    // InternalAst.g:2361:1: entryRuleCodeWall returns [String current=null] : iv_ruleCodeWall= ruleCodeWall EOF ;
    public final String entryRuleCodeWall() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCodeWall = null;


        try {
            // InternalAst.g:2361:48: (iv_ruleCodeWall= ruleCodeWall EOF )
            // InternalAst.g:2362:2: iv_ruleCodeWall= ruleCodeWall EOF
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
    // InternalAst.g:2368:1: ruleCodeWall returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_INT_1= RULE_INT | this_STRING_2= RULE_STRING | this_WS_3= RULE_WS | kw= '+' | kw= '-' | kw= '(' | kw= ')' | kw= '*' | kw= '.' | kw= '/' | kw= '\\\\' | kw= '|' | kw= '?' | kw= '>' | kw= '<' | kw= '#' | kw= '$' | kw= '%' | kw= ';' | kw= ':' | kw= '!' | kw= '=' | kw= ',' ) ;
    public final AntlrDatatypeRuleToken ruleCodeWall() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_INT_1=null;
        Token this_STRING_2=null;
        Token this_WS_3=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalAst.g:2374:2: ( (this_ID_0= RULE_ID | this_INT_1= RULE_INT | this_STRING_2= RULE_STRING | this_WS_3= RULE_WS | kw= '+' | kw= '-' | kw= '(' | kw= ')' | kw= '*' | kw= '.' | kw= '/' | kw= '\\\\' | kw= '|' | kw= '?' | kw= '>' | kw= '<' | kw= '#' | kw= '$' | kw= '%' | kw= ';' | kw= ':' | kw= '!' | kw= '=' | kw= ',' ) )
            // InternalAst.g:2375:2: (this_ID_0= RULE_ID | this_INT_1= RULE_INT | this_STRING_2= RULE_STRING | this_WS_3= RULE_WS | kw= '+' | kw= '-' | kw= '(' | kw= ')' | kw= '*' | kw= '.' | kw= '/' | kw= '\\\\' | kw= '|' | kw= '?' | kw= '>' | kw= '<' | kw= '#' | kw= '$' | kw= '%' | kw= ';' | kw= ':' | kw= '!' | kw= '=' | kw= ',' )
            {
            // InternalAst.g:2375:2: (this_ID_0= RULE_ID | this_INT_1= RULE_INT | this_STRING_2= RULE_STRING | this_WS_3= RULE_WS | kw= '+' | kw= '-' | kw= '(' | kw= ')' | kw= '*' | kw= '.' | kw= '/' | kw= '\\\\' | kw= '|' | kw= '?' | kw= '>' | kw= '<' | kw= '#' | kw= '$' | kw= '%' | kw= ';' | kw= ':' | kw= '!' | kw= '=' | kw= ',' )
            int alt34=24;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt34=1;
                }
                break;
            case RULE_INT:
                {
                alt34=2;
                }
                break;
            case RULE_STRING:
                {
                alt34=3;
                }
                break;
            case RULE_WS:
                {
                alt34=4;
                }
                break;
            case 50:
                {
                alt34=5;
                }
                break;
            case 51:
                {
                alt34=6;
                }
                break;
            case 52:
                {
                alt34=7;
                }
                break;
            case 53:
                {
                alt34=8;
                }
                break;
            case 54:
                {
                alt34=9;
                }
                break;
            case 42:
                {
                alt34=10;
                }
                break;
            case 55:
                {
                alt34=11;
                }
                break;
            case 56:
                {
                alt34=12;
                }
                break;
            case 57:
                {
                alt34=13;
                }
                break;
            case 58:
                {
                alt34=14;
                }
                break;
            case 46:
                {
                alt34=15;
                }
                break;
            case 45:
                {
                alt34=16;
                }
                break;
            case 59:
                {
                alt34=17;
                }
                break;
            case 60:
                {
                alt34=18;
                }
                break;
            case 61:
                {
                alt34=19;
                }
                break;
            case 62:
                {
                alt34=20;
                }
                break;
            case 41:
                {
                alt34=21;
                }
                break;
            case 63:
                {
                alt34=22;
                }
                break;
            case 40:
                {
                alt34=23;
                }
                break;
            case 64:
                {
                alt34=24;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }

            switch (alt34) {
                case 1 :
                    // InternalAst.g:2376:3: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_0);
                    		

                    			newLeafNode(this_ID_0, grammarAccess.getCodeWallAccess().getIDTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAst.g:2384:3: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			current.merge(this_INT_1);
                    		

                    			newLeafNode(this_INT_1, grammarAccess.getCodeWallAccess().getINTTerminalRuleCall_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalAst.g:2392:3: this_STRING_2= RULE_STRING
                    {
                    this_STRING_2=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_2);
                    		

                    			newLeafNode(this_STRING_2, grammarAccess.getCodeWallAccess().getSTRINGTerminalRuleCall_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalAst.g:2400:3: this_WS_3= RULE_WS
                    {
                    this_WS_3=(Token)match(input,RULE_WS,FOLLOW_2); 

                    			current.merge(this_WS_3);
                    		

                    			newLeafNode(this_WS_3, grammarAccess.getCodeWallAccess().getWSTerminalRuleCall_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalAst.g:2408:3: kw= '+'
                    {
                    kw=(Token)match(input,50,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCodeWallAccess().getPlusSignKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalAst.g:2414:3: kw= '-'
                    {
                    kw=(Token)match(input,51,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCodeWallAccess().getHyphenMinusKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalAst.g:2420:3: kw= '('
                    {
                    kw=(Token)match(input,52,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCodeWallAccess().getLeftParenthesisKeyword_6());
                    		

                    }
                    break;
                case 8 :
                    // InternalAst.g:2426:3: kw= ')'
                    {
                    kw=(Token)match(input,53,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCodeWallAccess().getRightParenthesisKeyword_7());
                    		

                    }
                    break;
                case 9 :
                    // InternalAst.g:2432:3: kw= '*'
                    {
                    kw=(Token)match(input,54,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCodeWallAccess().getAsteriskKeyword_8());
                    		

                    }
                    break;
                case 10 :
                    // InternalAst.g:2438:3: kw= '.'
                    {
                    kw=(Token)match(input,42,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCodeWallAccess().getFullStopKeyword_9());
                    		

                    }
                    break;
                case 11 :
                    // InternalAst.g:2444:3: kw= '/'
                    {
                    kw=(Token)match(input,55,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCodeWallAccess().getSolidusKeyword_10());
                    		

                    }
                    break;
                case 12 :
                    // InternalAst.g:2450:3: kw= '\\\\'
                    {
                    kw=(Token)match(input,56,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCodeWallAccess().getReverseSolidusKeyword_11());
                    		

                    }
                    break;
                case 13 :
                    // InternalAst.g:2456:3: kw= '|'
                    {
                    kw=(Token)match(input,57,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCodeWallAccess().getVerticalLineKeyword_12());
                    		

                    }
                    break;
                case 14 :
                    // InternalAst.g:2462:3: kw= '?'
                    {
                    kw=(Token)match(input,58,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCodeWallAccess().getQuestionMarkKeyword_13());
                    		

                    }
                    break;
                case 15 :
                    // InternalAst.g:2468:3: kw= '>'
                    {
                    kw=(Token)match(input,46,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCodeWallAccess().getGreaterThanSignKeyword_14());
                    		

                    }
                    break;
                case 16 :
                    // InternalAst.g:2474:3: kw= '<'
                    {
                    kw=(Token)match(input,45,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCodeWallAccess().getLessThanSignKeyword_15());
                    		

                    }
                    break;
                case 17 :
                    // InternalAst.g:2480:3: kw= '#'
                    {
                    kw=(Token)match(input,59,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCodeWallAccess().getNumberSignKeyword_16());
                    		

                    }
                    break;
                case 18 :
                    // InternalAst.g:2486:3: kw= '$'
                    {
                    kw=(Token)match(input,60,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCodeWallAccess().getDollarSignKeyword_17());
                    		

                    }
                    break;
                case 19 :
                    // InternalAst.g:2492:3: kw= '%'
                    {
                    kw=(Token)match(input,61,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCodeWallAccess().getPercentSignKeyword_18());
                    		

                    }
                    break;
                case 20 :
                    // InternalAst.g:2498:3: kw= ';'
                    {
                    kw=(Token)match(input,62,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCodeWallAccess().getSemicolonKeyword_19());
                    		

                    }
                    break;
                case 21 :
                    // InternalAst.g:2504:3: kw= ':'
                    {
                    kw=(Token)match(input,41,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCodeWallAccess().getColonKeyword_20());
                    		

                    }
                    break;
                case 22 :
                    // InternalAst.g:2510:3: kw= '!'
                    {
                    kw=(Token)match(input,63,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCodeWallAccess().getExclamationMarkKeyword_21());
                    		

                    }
                    break;
                case 23 :
                    // InternalAst.g:2516:3: kw= '='
                    {
                    kw=(Token)match(input,40,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCodeWallAccess().getEqualsSignKeyword_22());
                    		

                    }
                    break;
                case 24 :
                    // InternalAst.g:2522:3: kw= ','
                    {
                    kw=(Token)match(input,64,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCodeWallAccess().getCommaKeyword_23());
                    		

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


    // $ANTLR start "entryRuleTargetCodeExpression"
    // InternalAst.g:2531:1: entryRuleTargetCodeExpression returns [EObject current=null] : iv_ruleTargetCodeExpression= ruleTargetCodeExpression EOF ;
    public final EObject entryRuleTargetCodeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTargetCodeExpression = null;


        try {
            // InternalAst.g:2531:61: (iv_ruleTargetCodeExpression= ruleTargetCodeExpression EOF )
            // InternalAst.g:2532:2: iv_ruleTargetCodeExpression= ruleTargetCodeExpression EOF
            {
             newCompositeNode(grammarAccess.getTargetCodeExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTargetCodeExpression=ruleTargetCodeExpression();

            state._fsp--;

             current =iv_ruleTargetCodeExpression; 
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
    // $ANTLR end "entryRuleTargetCodeExpression"


    // $ANTLR start "ruleTargetCodeExpression"
    // InternalAst.g:2538:1: ruleTargetCodeExpression returns [EObject current=null] : ( (lv_code_0_0= ruleCodeWall ) )* ;
    public final EObject ruleTargetCodeExpression() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_code_0_0 = null;



        	enterRule();

        try {
            // InternalAst.g:2544:2: ( ( (lv_code_0_0= ruleCodeWall ) )* )
            // InternalAst.g:2545:2: ( (lv_code_0_0= ruleCodeWall ) )*
            {
            // InternalAst.g:2545:2: ( (lv_code_0_0= ruleCodeWall ) )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( ((LA35_0>=RULE_ID && LA35_0<=RULE_WS)||(LA35_0>=40 && LA35_0<=42)||(LA35_0>=45 && LA35_0<=46)||(LA35_0>=50 && LA35_0<=64)) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalAst.g:2546:3: (lv_code_0_0= ruleCodeWall )
            	    {
            	    // InternalAst.g:2546:3: (lv_code_0_0= ruleCodeWall )
            	    // InternalAst.g:2547:4: lv_code_0_0= ruleCodeWall
            	    {

            	    				newCompositeNode(grammarAccess.getTargetCodeExpressionAccess().getCodeCodeWallParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_37);
            	    lv_code_0_0=ruleCodeWall();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getTargetCodeExpressionRule());
            	    				}
            	    				add(
            	    					current,
            	    					"code",
            	    					lv_code_0_0,
            	    					"de.roma.cocktail.xtext.Ast.CodeWall");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop35;
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
    // $ANTLR end "ruleTargetCodeExpression"

    // Delegated rules


    protected DFA12 dfa12 = new DFA12(this);
    protected DFA13 dfa13 = new DFA13(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\1\1\11\uffff";
    static final String dfa_3s = "\1\13\11\uffff";
    static final String dfa_4s = "\1\53\11\uffff";
    static final String dfa_5s = "\1\uffff\1\11\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10";
    static final String dfa_6s = "\1\0\11\uffff}>";
    static final String[] dfa_7s = {
            "\2\1\15\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\5\uffff\1\1\3\uffff\1\1",
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

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "()* loopback of 1028:5: ( ({...}? => ( ({...}? => ( (lv_props_1_0= 'INPUT' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_2_0= 'OUTPUT' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_3_0= 'SYNTHESIZED' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_4_0= 'INHERITED' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_5_0= 'THREAD' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_6_0= 'REVERSE' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_7_0= 'IGNORE' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_8_0= 'VIRTUAL' ) ) ) ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_0 = input.LA(1);

                         
                        int index12_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA12_0==EOF||(LA12_0>=11 && LA12_0<=12)||LA12_0==39||LA12_0==43) ) {s = 1;}

                        else if ( LA12_0 == 26 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyListAccess().getUnorderedGroup(), 0) ) {s = 2;}

                        else if ( LA12_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyListAccess().getUnorderedGroup(), 1) ) {s = 3;}

                        else if ( LA12_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyListAccess().getUnorderedGroup(), 2) ) {s = 4;}

                        else if ( LA12_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyListAccess().getUnorderedGroup(), 3) ) {s = 5;}

                        else if ( LA12_0 == 30 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyListAccess().getUnorderedGroup(), 4) ) {s = 6;}

                        else if ( LA12_0 == 31 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyListAccess().getUnorderedGroup(), 5) ) {s = 7;}

                        else if ( LA12_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyListAccess().getUnorderedGroup(), 6) ) {s = 8;}

                        else if ( LA12_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyListAccess().getUnorderedGroup(), 7) ) {s = 9;}

                         
                        input.seek(index12_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_8s = "\17\uffff";
    static final String dfa_9s = "\1\1\16\uffff";
    static final String dfa_10s = "\1\4\16\uffff";
    static final String dfa_11s = "\1\61\16\uffff";
    static final String dfa_12s = "\1\uffff\1\16\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15";
    static final String dfa_13s = "\1\0\16\uffff}>";
    static final String[] dfa_14s = {
            "\1\1\25\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\3\uffff\1\1\2\uffff\1\1\1\uffff\1\1\1\uffff\1\1",
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

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = dfa_8;
            this.eof = dfa_9;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "()* loopback of 1243:5: ( ({...}? => ( ({...}? => ( (lv_props_1_0= 'INPUT' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_2_0= 'OUTPUT' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_3_0= 'SYNTHESIZED' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_4_0= 'INHERITED' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_5_0= 'THREAD' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_6_0= 'REVERSE' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_7_0= 'IGNORE' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_8_0= 'VIRTUAL' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_9_0= 'IN' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_10_0= 'OUT' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_11_0= 'SYN' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_12_0= 'INH' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_13_0= 'REV' ) ) ) ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA13_0 = input.LA(1);

                         
                        int index13_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA13_0==EOF||LA13_0==RULE_ID||LA13_0==42||LA13_0==45||LA13_0==47||LA13_0==49) ) {s = 1;}

                        else if ( LA13_0 == 26 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodePropertyListAccess().getUnorderedGroup(), 0) ) {s = 2;}

                        else if ( LA13_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodePropertyListAccess().getUnorderedGroup(), 1) ) {s = 3;}

                        else if ( LA13_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodePropertyListAccess().getUnorderedGroup(), 2) ) {s = 4;}

                        else if ( LA13_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodePropertyListAccess().getUnorderedGroup(), 3) ) {s = 5;}

                        else if ( LA13_0 == 30 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodePropertyListAccess().getUnorderedGroup(), 4) ) {s = 6;}

                        else if ( LA13_0 == 31 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodePropertyListAccess().getUnorderedGroup(), 5) ) {s = 7;}

                        else if ( LA13_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodePropertyListAccess().getUnorderedGroup(), 6) ) {s = 8;}

                        else if ( LA13_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodePropertyListAccess().getUnorderedGroup(), 7) ) {s = 9;}

                        else if ( LA13_0 == 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodePropertyListAccess().getUnorderedGroup(), 8) ) {s = 10;}

                        else if ( LA13_0 == 35 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodePropertyListAccess().getUnorderedGroup(), 9) ) {s = 11;}

                        else if ( LA13_0 == 36 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodePropertyListAccess().getUnorderedGroup(), 10) ) {s = 12;}

                        else if ( LA13_0 == 37 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodePropertyListAccess().getUnorderedGroup(), 11) ) {s = 13;}

                        else if ( LA13_0 == 38 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodePropertyListAccess().getUnorderedGroup(), 12) ) {s = 14;}

                         
                        input.seek(index13_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 13, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000088003F20000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000088002000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000088000000002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001F20002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000000000001C002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000018002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0xFFFEE700000C00F0L,0x0000000000000001L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00000003FC000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x00000003FC000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000007FFC000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000030000000030L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000840000000010L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0001B70000000010L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0001A70000000010L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000A40000000010L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000400000000030L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000007FFC000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0003027FFC000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0003007FFC000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0xFFFE6700000000F0L,0x0000000000000001L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0xFFFEE700000400F2L,0x0000000000000001L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0xFFFC6700000000F2L,0x0000000000000001L});

}
