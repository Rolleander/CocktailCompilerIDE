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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_ANY_OTHER", "'MODULE'", "'TREE'", "'IMPORT'", "'{'", "'}'", "'EXPORT'", "'GLOBAL'", "'LOCAL'", "'BEGIN'", "'CLOSE'", "'PROPERTY'", "'INPUT'", "'OUTPUT'", "'SYNTHESIZED'", "'INHERITED'", "'THREAD'", "'REVERSE'", "'IGNORE'", "'VIRTUAL'", "'+'", "'-'", "'('", "')'", "'*'", "'.'", "'/'", "'\\\\'", "'|'", "'?'", "'>'", "'<'", "'#'", "'$'", "'%'", "';'", "':'", "'!'", "'='", "','"
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
    // InternalAst.g:71:1: ruleModel returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => ( (lv_module_1_0= ruleModule ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_tree_2_0= ruleTree ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_imp_3_0= ruleImport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_exp_4_0= ruleExport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_glo_5_0= ruleGlobal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_loc_6_0= ruleLocal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_beg_7_0= ruleBegin ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_clo_8_0= ruleClose ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_pro_9_0= ruleProperties ) ) ) ) ) )+ {...}?) ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_module_1_0 = null;

        EObject lv_tree_2_0 = null;

        EObject lv_imp_3_0 = null;

        EObject lv_exp_4_0 = null;

        EObject lv_glo_5_0 = null;

        EObject lv_loc_6_0 = null;

        EObject lv_beg_7_0 = null;

        EObject lv_clo_8_0 = null;

        EObject lv_pro_9_0 = null;



        	enterRule();

        try {
            // InternalAst.g:77:2: ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_module_1_0= ruleModule ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_tree_2_0= ruleTree ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_imp_3_0= ruleImport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_exp_4_0= ruleExport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_glo_5_0= ruleGlobal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_loc_6_0= ruleLocal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_beg_7_0= ruleBegin ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_clo_8_0= ruleClose ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_pro_9_0= ruleProperties ) ) ) ) ) )+ {...}?) ) ) )
            // InternalAst.g:78:2: ( ( ( ( ({...}? => ( ({...}? => ( (lv_module_1_0= ruleModule ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_tree_2_0= ruleTree ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_imp_3_0= ruleImport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_exp_4_0= ruleExport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_glo_5_0= ruleGlobal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_loc_6_0= ruleLocal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_beg_7_0= ruleBegin ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_clo_8_0= ruleClose ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_pro_9_0= ruleProperties ) ) ) ) ) )+ {...}?) ) )
            {
            // InternalAst.g:78:2: ( ( ( ( ({...}? => ( ({...}? => ( (lv_module_1_0= ruleModule ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_tree_2_0= ruleTree ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_imp_3_0= ruleImport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_exp_4_0= ruleExport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_glo_5_0= ruleGlobal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_loc_6_0= ruleLocal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_beg_7_0= ruleBegin ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_clo_8_0= ruleClose ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_pro_9_0= ruleProperties ) ) ) ) ) )+ {...}?) ) )
            // InternalAst.g:79:3: ( ( ( ({...}? => ( ({...}? => ( (lv_module_1_0= ruleModule ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_tree_2_0= ruleTree ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_imp_3_0= ruleImport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_exp_4_0= ruleExport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_glo_5_0= ruleGlobal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_loc_6_0= ruleLocal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_beg_7_0= ruleBegin ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_clo_8_0= ruleClose ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_pro_9_0= ruleProperties ) ) ) ) ) )+ {...}?) )
            {
            // InternalAst.g:79:3: ( ( ( ({...}? => ( ({...}? => ( (lv_module_1_0= ruleModule ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_tree_2_0= ruleTree ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_imp_3_0= ruleImport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_exp_4_0= ruleExport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_glo_5_0= ruleGlobal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_loc_6_0= ruleLocal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_beg_7_0= ruleBegin ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_clo_8_0= ruleClose ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_pro_9_0= ruleProperties ) ) ) ) ) )+ {...}?) )
            // InternalAst.g:80:4: ( ( ({...}? => ( ({...}? => ( (lv_module_1_0= ruleModule ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_tree_2_0= ruleTree ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_imp_3_0= ruleImport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_exp_4_0= ruleExport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_glo_5_0= ruleGlobal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_loc_6_0= ruleLocal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_beg_7_0= ruleBegin ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_clo_8_0= ruleClose ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_pro_9_0= ruleProperties ) ) ) ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getModelAccess().getUnorderedGroup());
            			
            // InternalAst.g:83:4: ( ( ({...}? => ( ({...}? => ( (lv_module_1_0= ruleModule ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_tree_2_0= ruleTree ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_imp_3_0= ruleImport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_exp_4_0= ruleExport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_glo_5_0= ruleGlobal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_loc_6_0= ruleLocal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_beg_7_0= ruleBegin ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_clo_8_0= ruleClose ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_pro_9_0= ruleProperties ) ) ) ) ) )+ {...}?)
            // InternalAst.g:84:5: ( ({...}? => ( ({...}? => ( (lv_module_1_0= ruleModule ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_tree_2_0= ruleTree ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_imp_3_0= ruleImport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_exp_4_0= ruleExport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_glo_5_0= ruleGlobal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_loc_6_0= ruleLocal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_beg_7_0= ruleBegin ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_clo_8_0= ruleClose ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_pro_9_0= ruleProperties ) ) ) ) ) )+ {...}?
            {
            // InternalAst.g:84:5: ( ({...}? => ( ({...}? => ( (lv_module_1_0= ruleModule ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_tree_2_0= ruleTree ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_imp_3_0= ruleImport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_exp_4_0= ruleExport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_glo_5_0= ruleGlobal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_loc_6_0= ruleLocal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_beg_7_0= ruleBegin ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_clo_8_0= ruleClose ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_pro_9_0= ruleProperties ) ) ) ) ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=10;
                alt1 = dfa1.predict(input);
                switch (alt1) {
            	case 1 :
            	    // InternalAst.g:85:3: ({...}? => ( ({...}? => ( (lv_module_1_0= ruleModule ) ) ) ) )
            	    {
            	    // InternalAst.g:85:3: ({...}? => ( ({...}? => ( (lv_module_1_0= ruleModule ) ) ) ) )
            	    // InternalAst.g:86:4: {...}? => ( ({...}? => ( (lv_module_1_0= ruleModule ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleModel", "getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalAst.g:86:99: ( ({...}? => ( (lv_module_1_0= ruleModule ) ) ) )
            	    // InternalAst.g:87:5: ({...}? => ( (lv_module_1_0= ruleModule ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getModelAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalAst.g:90:8: ({...}? => ( (lv_module_1_0= ruleModule ) ) )
            	    // InternalAst.g:90:9: {...}? => ( (lv_module_1_0= ruleModule ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleModel", "true");
            	    }
            	    // InternalAst.g:90:18: ( (lv_module_1_0= ruleModule ) )
            	    // InternalAst.g:90:19: (lv_module_1_0= ruleModule )
            	    {
            	    // InternalAst.g:90:19: (lv_module_1_0= ruleModule )
            	    // InternalAst.g:91:9: lv_module_1_0= ruleModule
            	    {

            	    									newCompositeNode(grammarAccess.getModelAccess().getModuleModuleParserRuleCall_0_0());
            	    								
            	    pushFollow(FOLLOW_3);
            	    lv_module_1_0=ruleModule();

            	    state._fsp--;


            	    									if (current==null) {
            	    										current = createModelElementForParent(grammarAccess.getModelRule());
            	    									}
            	    									set(
            	    										current,
            	    										"module",
            	    										lv_module_1_0,
            	    										"de.roma.cocktail.xtext.Ast.Module");
            	    									afterParserOrEnumRuleCall();
            	    								

            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getModelAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalAst.g:113:3: ({...}? => ( ({...}? => ( (lv_tree_2_0= ruleTree ) ) ) ) )
            	    {
            	    // InternalAst.g:113:3: ({...}? => ( ({...}? => ( (lv_tree_2_0= ruleTree ) ) ) ) )
            	    // InternalAst.g:114:4: {...}? => ( ({...}? => ( (lv_tree_2_0= ruleTree ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleModel", "getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalAst.g:114:99: ( ({...}? => ( (lv_tree_2_0= ruleTree ) ) ) )
            	    // InternalAst.g:115:5: ({...}? => ( (lv_tree_2_0= ruleTree ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getModelAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalAst.g:118:8: ({...}? => ( (lv_tree_2_0= ruleTree ) ) )
            	    // InternalAst.g:118:9: {...}? => ( (lv_tree_2_0= ruleTree ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleModel", "true");
            	    }
            	    // InternalAst.g:118:18: ( (lv_tree_2_0= ruleTree ) )
            	    // InternalAst.g:118:19: (lv_tree_2_0= ruleTree )
            	    {
            	    // InternalAst.g:118:19: (lv_tree_2_0= ruleTree )
            	    // InternalAst.g:119:9: lv_tree_2_0= ruleTree
            	    {

            	    									newCompositeNode(grammarAccess.getModelAccess().getTreeTreeParserRuleCall_1_0());
            	    								
            	    pushFollow(FOLLOW_3);
            	    lv_tree_2_0=ruleTree();

            	    state._fsp--;


            	    									if (current==null) {
            	    										current = createModelElementForParent(grammarAccess.getModelRule());
            	    									}
            	    									set(
            	    										current,
            	    										"tree",
            	    										lv_tree_2_0,
            	    										"de.roma.cocktail.xtext.Ast.Tree");
            	    									afterParserOrEnumRuleCall();
            	    								

            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getModelAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalAst.g:141:3: ({...}? => ( ({...}? => ( (lv_imp_3_0= ruleImport ) ) ) ) )
            	    {
            	    // InternalAst.g:141:3: ({...}? => ( ({...}? => ( (lv_imp_3_0= ruleImport ) ) ) ) )
            	    // InternalAst.g:142:4: {...}? => ( ({...}? => ( (lv_imp_3_0= ruleImport ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleModel", "getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalAst.g:142:99: ( ({...}? => ( (lv_imp_3_0= ruleImport ) ) ) )
            	    // InternalAst.g:143:5: ({...}? => ( (lv_imp_3_0= ruleImport ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getModelAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalAst.g:146:8: ({...}? => ( (lv_imp_3_0= ruleImport ) ) )
            	    // InternalAst.g:146:9: {...}? => ( (lv_imp_3_0= ruleImport ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleModel", "true");
            	    }
            	    // InternalAst.g:146:18: ( (lv_imp_3_0= ruleImport ) )
            	    // InternalAst.g:146:19: (lv_imp_3_0= ruleImport )
            	    {
            	    // InternalAst.g:146:19: (lv_imp_3_0= ruleImport )
            	    // InternalAst.g:147:9: lv_imp_3_0= ruleImport
            	    {

            	    									newCompositeNode(grammarAccess.getModelAccess().getImpImportParserRuleCall_2_0());
            	    								
            	    pushFollow(FOLLOW_3);
            	    lv_imp_3_0=ruleImport();

            	    state._fsp--;


            	    									if (current==null) {
            	    										current = createModelElementForParent(grammarAccess.getModelRule());
            	    									}
            	    									set(
            	    										current,
            	    										"imp",
            	    										lv_imp_3_0,
            	    										"de.roma.cocktail.xtext.Ast.Import");
            	    									afterParserOrEnumRuleCall();
            	    								

            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getModelAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalAst.g:169:3: ({...}? => ( ({...}? => ( (lv_exp_4_0= ruleExport ) ) ) ) )
            	    {
            	    // InternalAst.g:169:3: ({...}? => ( ({...}? => ( (lv_exp_4_0= ruleExport ) ) ) ) )
            	    // InternalAst.g:170:4: {...}? => ( ({...}? => ( (lv_exp_4_0= ruleExport ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleModel", "getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 3)");
            	    }
            	    // InternalAst.g:170:99: ( ({...}? => ( (lv_exp_4_0= ruleExport ) ) ) )
            	    // InternalAst.g:171:5: ({...}? => ( (lv_exp_4_0= ruleExport ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getModelAccess().getUnorderedGroup(), 3);
            	    				
            	    // InternalAst.g:174:8: ({...}? => ( (lv_exp_4_0= ruleExport ) ) )
            	    // InternalAst.g:174:9: {...}? => ( (lv_exp_4_0= ruleExport ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleModel", "true");
            	    }
            	    // InternalAst.g:174:18: ( (lv_exp_4_0= ruleExport ) )
            	    // InternalAst.g:174:19: (lv_exp_4_0= ruleExport )
            	    {
            	    // InternalAst.g:174:19: (lv_exp_4_0= ruleExport )
            	    // InternalAst.g:175:9: lv_exp_4_0= ruleExport
            	    {

            	    									newCompositeNode(grammarAccess.getModelAccess().getExpExportParserRuleCall_3_0());
            	    								
            	    pushFollow(FOLLOW_3);
            	    lv_exp_4_0=ruleExport();

            	    state._fsp--;


            	    									if (current==null) {
            	    										current = createModelElementForParent(grammarAccess.getModelRule());
            	    									}
            	    									set(
            	    										current,
            	    										"exp",
            	    										lv_exp_4_0,
            	    										"de.roma.cocktail.xtext.Ast.Export");
            	    									afterParserOrEnumRuleCall();
            	    								

            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getModelAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalAst.g:197:3: ({...}? => ( ({...}? => ( (lv_glo_5_0= ruleGlobal ) ) ) ) )
            	    {
            	    // InternalAst.g:197:3: ({...}? => ( ({...}? => ( (lv_glo_5_0= ruleGlobal ) ) ) ) )
            	    // InternalAst.g:198:4: {...}? => ( ({...}? => ( (lv_glo_5_0= ruleGlobal ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleModel", "getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 4)");
            	    }
            	    // InternalAst.g:198:99: ( ({...}? => ( (lv_glo_5_0= ruleGlobal ) ) ) )
            	    // InternalAst.g:199:5: ({...}? => ( (lv_glo_5_0= ruleGlobal ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getModelAccess().getUnorderedGroup(), 4);
            	    				
            	    // InternalAst.g:202:8: ({...}? => ( (lv_glo_5_0= ruleGlobal ) ) )
            	    // InternalAst.g:202:9: {...}? => ( (lv_glo_5_0= ruleGlobal ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleModel", "true");
            	    }
            	    // InternalAst.g:202:18: ( (lv_glo_5_0= ruleGlobal ) )
            	    // InternalAst.g:202:19: (lv_glo_5_0= ruleGlobal )
            	    {
            	    // InternalAst.g:202:19: (lv_glo_5_0= ruleGlobal )
            	    // InternalAst.g:203:9: lv_glo_5_0= ruleGlobal
            	    {

            	    									newCompositeNode(grammarAccess.getModelAccess().getGloGlobalParserRuleCall_4_0());
            	    								
            	    pushFollow(FOLLOW_3);
            	    lv_glo_5_0=ruleGlobal();

            	    state._fsp--;


            	    									if (current==null) {
            	    										current = createModelElementForParent(grammarAccess.getModelRule());
            	    									}
            	    									set(
            	    										current,
            	    										"glo",
            	    										lv_glo_5_0,
            	    										"de.roma.cocktail.xtext.Ast.Global");
            	    									afterParserOrEnumRuleCall();
            	    								

            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getModelAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalAst.g:225:3: ({...}? => ( ({...}? => ( (lv_loc_6_0= ruleLocal ) ) ) ) )
            	    {
            	    // InternalAst.g:225:3: ({...}? => ( ({...}? => ( (lv_loc_6_0= ruleLocal ) ) ) ) )
            	    // InternalAst.g:226:4: {...}? => ( ({...}? => ( (lv_loc_6_0= ruleLocal ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleModel", "getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 5)");
            	    }
            	    // InternalAst.g:226:99: ( ({...}? => ( (lv_loc_6_0= ruleLocal ) ) ) )
            	    // InternalAst.g:227:5: ({...}? => ( (lv_loc_6_0= ruleLocal ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getModelAccess().getUnorderedGroup(), 5);
            	    				
            	    // InternalAst.g:230:8: ({...}? => ( (lv_loc_6_0= ruleLocal ) ) )
            	    // InternalAst.g:230:9: {...}? => ( (lv_loc_6_0= ruleLocal ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleModel", "true");
            	    }
            	    // InternalAst.g:230:18: ( (lv_loc_6_0= ruleLocal ) )
            	    // InternalAst.g:230:19: (lv_loc_6_0= ruleLocal )
            	    {
            	    // InternalAst.g:230:19: (lv_loc_6_0= ruleLocal )
            	    // InternalAst.g:231:9: lv_loc_6_0= ruleLocal
            	    {

            	    									newCompositeNode(grammarAccess.getModelAccess().getLocLocalParserRuleCall_5_0());
            	    								
            	    pushFollow(FOLLOW_3);
            	    lv_loc_6_0=ruleLocal();

            	    state._fsp--;


            	    									if (current==null) {
            	    										current = createModelElementForParent(grammarAccess.getModelRule());
            	    									}
            	    									set(
            	    										current,
            	    										"loc",
            	    										lv_loc_6_0,
            	    										"de.roma.cocktail.xtext.Ast.Local");
            	    									afterParserOrEnumRuleCall();
            	    								

            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getModelAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // InternalAst.g:253:3: ({...}? => ( ({...}? => ( (lv_beg_7_0= ruleBegin ) ) ) ) )
            	    {
            	    // InternalAst.g:253:3: ({...}? => ( ({...}? => ( (lv_beg_7_0= ruleBegin ) ) ) ) )
            	    // InternalAst.g:254:4: {...}? => ( ({...}? => ( (lv_beg_7_0= ruleBegin ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleModel", "getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 6)");
            	    }
            	    // InternalAst.g:254:99: ( ({...}? => ( (lv_beg_7_0= ruleBegin ) ) ) )
            	    // InternalAst.g:255:5: ({...}? => ( (lv_beg_7_0= ruleBegin ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getModelAccess().getUnorderedGroup(), 6);
            	    				
            	    // InternalAst.g:258:8: ({...}? => ( (lv_beg_7_0= ruleBegin ) ) )
            	    // InternalAst.g:258:9: {...}? => ( (lv_beg_7_0= ruleBegin ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleModel", "true");
            	    }
            	    // InternalAst.g:258:18: ( (lv_beg_7_0= ruleBegin ) )
            	    // InternalAst.g:258:19: (lv_beg_7_0= ruleBegin )
            	    {
            	    // InternalAst.g:258:19: (lv_beg_7_0= ruleBegin )
            	    // InternalAst.g:259:9: lv_beg_7_0= ruleBegin
            	    {

            	    									newCompositeNode(grammarAccess.getModelAccess().getBegBeginParserRuleCall_6_0());
            	    								
            	    pushFollow(FOLLOW_3);
            	    lv_beg_7_0=ruleBegin();

            	    state._fsp--;


            	    									if (current==null) {
            	    										current = createModelElementForParent(grammarAccess.getModelRule());
            	    									}
            	    									set(
            	    										current,
            	    										"beg",
            	    										lv_beg_7_0,
            	    										"de.roma.cocktail.xtext.Ast.Begin");
            	    									afterParserOrEnumRuleCall();
            	    								

            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getModelAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 8 :
            	    // InternalAst.g:281:3: ({...}? => ( ({...}? => ( (lv_clo_8_0= ruleClose ) ) ) ) )
            	    {
            	    // InternalAst.g:281:3: ({...}? => ( ({...}? => ( (lv_clo_8_0= ruleClose ) ) ) ) )
            	    // InternalAst.g:282:4: {...}? => ( ({...}? => ( (lv_clo_8_0= ruleClose ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 7) ) {
            	        throw new FailedPredicateException(input, "ruleModel", "getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 7)");
            	    }
            	    // InternalAst.g:282:99: ( ({...}? => ( (lv_clo_8_0= ruleClose ) ) ) )
            	    // InternalAst.g:283:5: ({...}? => ( (lv_clo_8_0= ruleClose ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getModelAccess().getUnorderedGroup(), 7);
            	    				
            	    // InternalAst.g:286:8: ({...}? => ( (lv_clo_8_0= ruleClose ) ) )
            	    // InternalAst.g:286:9: {...}? => ( (lv_clo_8_0= ruleClose ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleModel", "true");
            	    }
            	    // InternalAst.g:286:18: ( (lv_clo_8_0= ruleClose ) )
            	    // InternalAst.g:286:19: (lv_clo_8_0= ruleClose )
            	    {
            	    // InternalAst.g:286:19: (lv_clo_8_0= ruleClose )
            	    // InternalAst.g:287:9: lv_clo_8_0= ruleClose
            	    {

            	    									newCompositeNode(grammarAccess.getModelAccess().getCloCloseParserRuleCall_7_0());
            	    								
            	    pushFollow(FOLLOW_3);
            	    lv_clo_8_0=ruleClose();

            	    state._fsp--;


            	    									if (current==null) {
            	    										current = createModelElementForParent(grammarAccess.getModelRule());
            	    									}
            	    									set(
            	    										current,
            	    										"clo",
            	    										lv_clo_8_0,
            	    										"de.roma.cocktail.xtext.Ast.Close");
            	    									afterParserOrEnumRuleCall();
            	    								

            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getModelAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 9 :
            	    // InternalAst.g:309:3: ({...}? => ( ({...}? => ( (lv_pro_9_0= ruleProperties ) ) ) ) )
            	    {
            	    // InternalAst.g:309:3: ({...}? => ( ({...}? => ( (lv_pro_9_0= ruleProperties ) ) ) ) )
            	    // InternalAst.g:310:4: {...}? => ( ({...}? => ( (lv_pro_9_0= ruleProperties ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 8) ) {
            	        throw new FailedPredicateException(input, "ruleModel", "getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 8)");
            	    }
            	    // InternalAst.g:310:99: ( ({...}? => ( (lv_pro_9_0= ruleProperties ) ) ) )
            	    // InternalAst.g:311:5: ({...}? => ( (lv_pro_9_0= ruleProperties ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getModelAccess().getUnorderedGroup(), 8);
            	    				
            	    // InternalAst.g:314:8: ({...}? => ( (lv_pro_9_0= ruleProperties ) ) )
            	    // InternalAst.g:314:9: {...}? => ( (lv_pro_9_0= ruleProperties ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleModel", "true");
            	    }
            	    // InternalAst.g:314:18: ( (lv_pro_9_0= ruleProperties ) )
            	    // InternalAst.g:314:19: (lv_pro_9_0= ruleProperties )
            	    {
            	    // InternalAst.g:314:19: (lv_pro_9_0= ruleProperties )
            	    // InternalAst.g:315:9: lv_pro_9_0= ruleProperties
            	    {

            	    									newCompositeNode(grammarAccess.getModelAccess().getProPropertiesParserRuleCall_8_0());
            	    								
            	    pushFollow(FOLLOW_3);
            	    lv_pro_9_0=ruleProperties();

            	    state._fsp--;


            	    									if (current==null) {
            	    										current = createModelElementForParent(grammarAccess.getModelRule());
            	    									}
            	    									set(
            	    										current,
            	    										"pro",
            	    										lv_pro_9_0,
            	    										"de.roma.cocktail.xtext.Ast.Properties");
            	    									afterParserOrEnumRuleCall();
            	    								

            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getModelAccess().getUnorderedGroup());
            	    				

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

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getModelAccess().getUnorderedGroup()) ) {
                throw new FailedPredicateException(input, "ruleModel", "getUnorderedGroupHelper().canLeave(grammarAccess.getModelAccess().getUnorderedGroup())");
            }

            }


            }

             
            			  getUnorderedGroupHelper().leave(grammarAccess.getModelAccess().getUnorderedGroup());
            			

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


    // $ANTLR start "entryRuleModule"
    // InternalAst.g:348:1: entryRuleModule returns [EObject current=null] : iv_ruleModule= ruleModule EOF ;
    public final EObject entryRuleModule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModule = null;


        try {
            // InternalAst.g:348:47: (iv_ruleModule= ruleModule EOF )
            // InternalAst.g:349:2: iv_ruleModule= ruleModule EOF
            {
             newCompositeNode(grammarAccess.getModuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModule=ruleModule();

            state._fsp--;

             current =iv_ruleModule; 
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
    // $ANTLR end "entryRuleModule"


    // $ANTLR start "ruleModule"
    // InternalAst.g:355:1: ruleModule returns [EObject current=null] : (otherlv_0= 'MODULE' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleModule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalAst.g:361:2: ( (otherlv_0= 'MODULE' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalAst.g:362:2: (otherlv_0= 'MODULE' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalAst.g:362:2: (otherlv_0= 'MODULE' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalAst.g:363:3: otherlv_0= 'MODULE' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getModuleAccess().getMODULEKeyword_0());
            		
            // InternalAst.g:367:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAst.g:368:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAst.g:368:4: (lv_name_1_0= RULE_ID )
            // InternalAst.g:369:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getModuleAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getModuleRule());
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
    // $ANTLR end "ruleModule"


    // $ANTLR start "entryRuleTree"
    // InternalAst.g:389:1: entryRuleTree returns [EObject current=null] : iv_ruleTree= ruleTree EOF ;
    public final EObject entryRuleTree() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTree = null;


        try {
            // InternalAst.g:389:45: (iv_ruleTree= ruleTree EOF )
            // InternalAst.g:390:2: iv_ruleTree= ruleTree EOF
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
    // InternalAst.g:396:1: ruleTree returns [EObject current=null] : (otherlv_0= 'TREE' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleTree() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalAst.g:402:2: ( (otherlv_0= 'TREE' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalAst.g:403:2: (otherlv_0= 'TREE' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalAst.g:403:2: (otherlv_0= 'TREE' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalAst.g:404:3: otherlv_0= 'TREE' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getTreeAccess().getTREEKeyword_0());
            		
            // InternalAst.g:408:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAst.g:409:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAst.g:409:4: (lv_name_1_0= RULE_ID )
            // InternalAst.g:410:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

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
    // InternalAst.g:430:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalAst.g:430:47: (iv_ruleImport= ruleImport EOF )
            // InternalAst.g:431:2: iv_ruleImport= ruleImport EOF
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
    // InternalAst.g:437:1: ruleImport returns [EObject current=null] : (otherlv_0= 'IMPORT' otherlv_1= '{' ( (lv_code_2_0= ruleCodeBlock ) ) otherlv_3= '}' ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_code_2_0 = null;



        	enterRule();

        try {
            // InternalAst.g:443:2: ( (otherlv_0= 'IMPORT' otherlv_1= '{' ( (lv_code_2_0= ruleCodeBlock ) ) otherlv_3= '}' ) )
            // InternalAst.g:444:2: (otherlv_0= 'IMPORT' otherlv_1= '{' ( (lv_code_2_0= ruleCodeBlock ) ) otherlv_3= '}' )
            {
            // InternalAst.g:444:2: (otherlv_0= 'IMPORT' otherlv_1= '{' ( (lv_code_2_0= ruleCodeBlock ) ) otherlv_3= '}' )
            // InternalAst.g:445:3: otherlv_0= 'IMPORT' otherlv_1= '{' ( (lv_code_2_0= ruleCodeBlock ) ) otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getImportAccess().getIMPORTKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getImportAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalAst.g:453:3: ( (lv_code_2_0= ruleCodeBlock ) )
            // InternalAst.g:454:4: (lv_code_2_0= ruleCodeBlock )
            {
            // InternalAst.g:454:4: (lv_code_2_0= ruleCodeBlock )
            // InternalAst.g:455:5: lv_code_2_0= ruleCodeBlock
            {

            					newCompositeNode(grammarAccess.getImportAccess().getCodeCodeBlockParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_7);
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

            otherlv_3=(Token)match(input,15,FOLLOW_2); 

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
    // InternalAst.g:480:1: entryRuleExport returns [EObject current=null] : iv_ruleExport= ruleExport EOF ;
    public final EObject entryRuleExport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExport = null;


        try {
            // InternalAst.g:480:47: (iv_ruleExport= ruleExport EOF )
            // InternalAst.g:481:2: iv_ruleExport= ruleExport EOF
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
    // InternalAst.g:487:1: ruleExport returns [EObject current=null] : (otherlv_0= 'EXPORT' otherlv_1= '{' ( (lv_code_2_0= ruleCodeBlock ) ) otherlv_3= '}' ) ;
    public final EObject ruleExport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_code_2_0 = null;



        	enterRule();

        try {
            // InternalAst.g:493:2: ( (otherlv_0= 'EXPORT' otherlv_1= '{' ( (lv_code_2_0= ruleCodeBlock ) ) otherlv_3= '}' ) )
            // InternalAst.g:494:2: (otherlv_0= 'EXPORT' otherlv_1= '{' ( (lv_code_2_0= ruleCodeBlock ) ) otherlv_3= '}' )
            {
            // InternalAst.g:494:2: (otherlv_0= 'EXPORT' otherlv_1= '{' ( (lv_code_2_0= ruleCodeBlock ) ) otherlv_3= '}' )
            // InternalAst.g:495:3: otherlv_0= 'EXPORT' otherlv_1= '{' ( (lv_code_2_0= ruleCodeBlock ) ) otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getExportAccess().getEXPORTKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getExportAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalAst.g:503:3: ( (lv_code_2_0= ruleCodeBlock ) )
            // InternalAst.g:504:4: (lv_code_2_0= ruleCodeBlock )
            {
            // InternalAst.g:504:4: (lv_code_2_0= ruleCodeBlock )
            // InternalAst.g:505:5: lv_code_2_0= ruleCodeBlock
            {

            					newCompositeNode(grammarAccess.getExportAccess().getCodeCodeBlockParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_7);
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

            otherlv_3=(Token)match(input,15,FOLLOW_2); 

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
    // InternalAst.g:530:1: entryRuleGlobal returns [EObject current=null] : iv_ruleGlobal= ruleGlobal EOF ;
    public final EObject entryRuleGlobal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGlobal = null;


        try {
            // InternalAst.g:530:47: (iv_ruleGlobal= ruleGlobal EOF )
            // InternalAst.g:531:2: iv_ruleGlobal= ruleGlobal EOF
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
    // InternalAst.g:537:1: ruleGlobal returns [EObject current=null] : (otherlv_0= 'GLOBAL' otherlv_1= '{' ( (lv_code_2_0= ruleCodeBlock ) ) otherlv_3= '}' ) ;
    public final EObject ruleGlobal() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_code_2_0 = null;



        	enterRule();

        try {
            // InternalAst.g:543:2: ( (otherlv_0= 'GLOBAL' otherlv_1= '{' ( (lv_code_2_0= ruleCodeBlock ) ) otherlv_3= '}' ) )
            // InternalAst.g:544:2: (otherlv_0= 'GLOBAL' otherlv_1= '{' ( (lv_code_2_0= ruleCodeBlock ) ) otherlv_3= '}' )
            {
            // InternalAst.g:544:2: (otherlv_0= 'GLOBAL' otherlv_1= '{' ( (lv_code_2_0= ruleCodeBlock ) ) otherlv_3= '}' )
            // InternalAst.g:545:3: otherlv_0= 'GLOBAL' otherlv_1= '{' ( (lv_code_2_0= ruleCodeBlock ) ) otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getGlobalAccess().getGLOBALKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getGlobalAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalAst.g:553:3: ( (lv_code_2_0= ruleCodeBlock ) )
            // InternalAst.g:554:4: (lv_code_2_0= ruleCodeBlock )
            {
            // InternalAst.g:554:4: (lv_code_2_0= ruleCodeBlock )
            // InternalAst.g:555:5: lv_code_2_0= ruleCodeBlock
            {

            					newCompositeNode(grammarAccess.getGlobalAccess().getCodeCodeBlockParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_7);
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

            otherlv_3=(Token)match(input,15,FOLLOW_2); 

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
    // InternalAst.g:580:1: entryRuleLocal returns [EObject current=null] : iv_ruleLocal= ruleLocal EOF ;
    public final EObject entryRuleLocal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocal = null;


        try {
            // InternalAst.g:580:46: (iv_ruleLocal= ruleLocal EOF )
            // InternalAst.g:581:2: iv_ruleLocal= ruleLocal EOF
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
    // InternalAst.g:587:1: ruleLocal returns [EObject current=null] : (otherlv_0= 'LOCAL' otherlv_1= '{' ( (lv_code_2_0= ruleCodeBlock ) ) otherlv_3= '}' ) ;
    public final EObject ruleLocal() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_code_2_0 = null;



        	enterRule();

        try {
            // InternalAst.g:593:2: ( (otherlv_0= 'LOCAL' otherlv_1= '{' ( (lv_code_2_0= ruleCodeBlock ) ) otherlv_3= '}' ) )
            // InternalAst.g:594:2: (otherlv_0= 'LOCAL' otherlv_1= '{' ( (lv_code_2_0= ruleCodeBlock ) ) otherlv_3= '}' )
            {
            // InternalAst.g:594:2: (otherlv_0= 'LOCAL' otherlv_1= '{' ( (lv_code_2_0= ruleCodeBlock ) ) otherlv_3= '}' )
            // InternalAst.g:595:3: otherlv_0= 'LOCAL' otherlv_1= '{' ( (lv_code_2_0= ruleCodeBlock ) ) otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getLocalAccess().getLOCALKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getLocalAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalAst.g:603:3: ( (lv_code_2_0= ruleCodeBlock ) )
            // InternalAst.g:604:4: (lv_code_2_0= ruleCodeBlock )
            {
            // InternalAst.g:604:4: (lv_code_2_0= ruleCodeBlock )
            // InternalAst.g:605:5: lv_code_2_0= ruleCodeBlock
            {

            					newCompositeNode(grammarAccess.getLocalAccess().getCodeCodeBlockParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_7);
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

            otherlv_3=(Token)match(input,15,FOLLOW_2); 

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
    // InternalAst.g:630:1: entryRuleBegin returns [EObject current=null] : iv_ruleBegin= ruleBegin EOF ;
    public final EObject entryRuleBegin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBegin = null;


        try {
            // InternalAst.g:630:46: (iv_ruleBegin= ruleBegin EOF )
            // InternalAst.g:631:2: iv_ruleBegin= ruleBegin EOF
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
    // InternalAst.g:637:1: ruleBegin returns [EObject current=null] : (otherlv_0= 'BEGIN' otherlv_1= '{' ( (lv_code_2_0= ruleCodeBlock ) ) otherlv_3= '}' ) ;
    public final EObject ruleBegin() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_code_2_0 = null;



        	enterRule();

        try {
            // InternalAst.g:643:2: ( (otherlv_0= 'BEGIN' otherlv_1= '{' ( (lv_code_2_0= ruleCodeBlock ) ) otherlv_3= '}' ) )
            // InternalAst.g:644:2: (otherlv_0= 'BEGIN' otherlv_1= '{' ( (lv_code_2_0= ruleCodeBlock ) ) otherlv_3= '}' )
            {
            // InternalAst.g:644:2: (otherlv_0= 'BEGIN' otherlv_1= '{' ( (lv_code_2_0= ruleCodeBlock ) ) otherlv_3= '}' )
            // InternalAst.g:645:3: otherlv_0= 'BEGIN' otherlv_1= '{' ( (lv_code_2_0= ruleCodeBlock ) ) otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getBeginAccess().getBEGINKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getBeginAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalAst.g:653:3: ( (lv_code_2_0= ruleCodeBlock ) )
            // InternalAst.g:654:4: (lv_code_2_0= ruleCodeBlock )
            {
            // InternalAst.g:654:4: (lv_code_2_0= ruleCodeBlock )
            // InternalAst.g:655:5: lv_code_2_0= ruleCodeBlock
            {

            					newCompositeNode(grammarAccess.getBeginAccess().getCodeCodeBlockParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_7);
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

            otherlv_3=(Token)match(input,15,FOLLOW_2); 

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
    // InternalAst.g:680:1: entryRuleClose returns [EObject current=null] : iv_ruleClose= ruleClose EOF ;
    public final EObject entryRuleClose() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClose = null;


        try {
            // InternalAst.g:680:46: (iv_ruleClose= ruleClose EOF )
            // InternalAst.g:681:2: iv_ruleClose= ruleClose EOF
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
    // InternalAst.g:687:1: ruleClose returns [EObject current=null] : (otherlv_0= 'CLOSE' otherlv_1= '{' ( (lv_code_2_0= ruleCodeBlock ) ) otherlv_3= '}' ) ;
    public final EObject ruleClose() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_code_2_0 = null;



        	enterRule();

        try {
            // InternalAst.g:693:2: ( (otherlv_0= 'CLOSE' otherlv_1= '{' ( (lv_code_2_0= ruleCodeBlock ) ) otherlv_3= '}' ) )
            // InternalAst.g:694:2: (otherlv_0= 'CLOSE' otherlv_1= '{' ( (lv_code_2_0= ruleCodeBlock ) ) otherlv_3= '}' )
            {
            // InternalAst.g:694:2: (otherlv_0= 'CLOSE' otherlv_1= '{' ( (lv_code_2_0= ruleCodeBlock ) ) otherlv_3= '}' )
            // InternalAst.g:695:3: otherlv_0= 'CLOSE' otherlv_1= '{' ( (lv_code_2_0= ruleCodeBlock ) ) otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getCloseAccess().getCLOSEKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getCloseAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalAst.g:703:3: ( (lv_code_2_0= ruleCodeBlock ) )
            // InternalAst.g:704:4: (lv_code_2_0= ruleCodeBlock )
            {
            // InternalAst.g:704:4: (lv_code_2_0= ruleCodeBlock )
            // InternalAst.g:705:5: lv_code_2_0= ruleCodeBlock
            {

            					newCompositeNode(grammarAccess.getCloseAccess().getCodeCodeBlockParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_7);
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

            otherlv_3=(Token)match(input,15,FOLLOW_2); 

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
    // InternalAst.g:730:1: entryRuleProperties returns [EObject current=null] : iv_ruleProperties= ruleProperties EOF ;
    public final EObject entryRuleProperties() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperties = null;


        try {
            // InternalAst.g:730:51: (iv_ruleProperties= ruleProperties EOF )
            // InternalAst.g:731:2: iv_ruleProperties= ruleProperties EOF
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
    // InternalAst.g:737:1: ruleProperties returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'PROPERTY' ( (lv_props_2_0= 'INPUT' ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_3_0= 'OUTPUT' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_4_0= 'SYNTHESIZED' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_5_0= 'INHERITED' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_6_0= 'THREAD' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_7_0= 'REVERSE' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_8_0= 'IGNORE' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_9_0= 'VIRTUAL' ) ) ) ) ) )+ {...}?) ) ) ;
    public final EObject ruleProperties() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_props_2_0=null;
        Token lv_props_3_0=null;
        Token lv_props_4_0=null;
        Token lv_props_5_0=null;
        Token lv_props_6_0=null;
        Token lv_props_7_0=null;
        Token lv_props_8_0=null;
        Token lv_props_9_0=null;


        	enterRule();

        try {
            // InternalAst.g:743:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'PROPERTY' ( (lv_props_2_0= 'INPUT' ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_3_0= 'OUTPUT' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_4_0= 'SYNTHESIZED' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_5_0= 'INHERITED' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_6_0= 'THREAD' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_7_0= 'REVERSE' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_8_0= 'IGNORE' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_9_0= 'VIRTUAL' ) ) ) ) ) )+ {...}?) ) ) )
            // InternalAst.g:744:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'PROPERTY' ( (lv_props_2_0= 'INPUT' ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_3_0= 'OUTPUT' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_4_0= 'SYNTHESIZED' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_5_0= 'INHERITED' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_6_0= 'THREAD' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_7_0= 'REVERSE' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_8_0= 'IGNORE' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_9_0= 'VIRTUAL' ) ) ) ) ) )+ {...}?) ) )
            {
            // InternalAst.g:744:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'PROPERTY' ( (lv_props_2_0= 'INPUT' ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_3_0= 'OUTPUT' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_4_0= 'SYNTHESIZED' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_5_0= 'INHERITED' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_6_0= 'THREAD' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_7_0= 'REVERSE' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_8_0= 'IGNORE' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_9_0= 'VIRTUAL' ) ) ) ) ) )+ {...}?) ) )
            // InternalAst.g:745:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'PROPERTY' ( (lv_props_2_0= 'INPUT' ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_3_0= 'OUTPUT' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_4_0= 'SYNTHESIZED' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_5_0= 'INHERITED' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_6_0= 'THREAD' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_7_0= 'REVERSE' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_8_0= 'IGNORE' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_9_0= 'VIRTUAL' ) ) ) ) ) )+ {...}?) )
            {
            // InternalAst.g:745:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'PROPERTY' ( (lv_props_2_0= 'INPUT' ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_3_0= 'OUTPUT' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_4_0= 'SYNTHESIZED' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_5_0= 'INHERITED' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_6_0= 'THREAD' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_7_0= 'REVERSE' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_8_0= 'IGNORE' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_9_0= 'VIRTUAL' ) ) ) ) ) )+ {...}?) )
            // InternalAst.g:746:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'PROPERTY' ( (lv_props_2_0= 'INPUT' ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_3_0= 'OUTPUT' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_4_0= 'SYNTHESIZED' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_5_0= 'INHERITED' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_6_0= 'THREAD' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_7_0= 'REVERSE' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_8_0= 'IGNORE' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_9_0= 'VIRTUAL' ) ) ) ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getPropertiesAccess().getUnorderedGroup());
            			
            // InternalAst.g:749:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'PROPERTY' ( (lv_props_2_0= 'INPUT' ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_3_0= 'OUTPUT' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_4_0= 'SYNTHESIZED' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_5_0= 'INHERITED' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_6_0= 'THREAD' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_7_0= 'REVERSE' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_8_0= 'IGNORE' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_9_0= 'VIRTUAL' ) ) ) ) ) )+ {...}?)
            // InternalAst.g:750:5: ( ({...}? => ( ({...}? => (otherlv_1= 'PROPERTY' ( (lv_props_2_0= 'INPUT' ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_3_0= 'OUTPUT' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_4_0= 'SYNTHESIZED' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_5_0= 'INHERITED' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_6_0= 'THREAD' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_7_0= 'REVERSE' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_8_0= 'IGNORE' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_9_0= 'VIRTUAL' ) ) ) ) ) )+ {...}?
            {
            // InternalAst.g:750:5: ( ({...}? => ( ({...}? => (otherlv_1= 'PROPERTY' ( (lv_props_2_0= 'INPUT' ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_3_0= 'OUTPUT' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_4_0= 'SYNTHESIZED' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_5_0= 'INHERITED' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_6_0= 'THREAD' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_7_0= 'REVERSE' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_8_0= 'IGNORE' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_9_0= 'VIRTUAL' ) ) ) ) ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=9;
                alt3 = dfa3.predict(input);
                switch (alt3) {
            	case 1 :
            	    // InternalAst.g:751:3: ({...}? => ( ({...}? => (otherlv_1= 'PROPERTY' ( (lv_props_2_0= 'INPUT' ) )? ) ) ) )
            	    {
            	    // InternalAst.g:751:3: ({...}? => ( ({...}? => (otherlv_1= 'PROPERTY' ( (lv_props_2_0= 'INPUT' ) )? ) ) ) )
            	    // InternalAst.g:752:4: {...}? => ( ({...}? => (otherlv_1= 'PROPERTY' ( (lv_props_2_0= 'INPUT' ) )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPropertiesAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleProperties", "getUnorderedGroupHelper().canSelect(grammarAccess.getPropertiesAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalAst.g:752:104: ( ({...}? => (otherlv_1= 'PROPERTY' ( (lv_props_2_0= 'INPUT' ) )? ) ) )
            	    // InternalAst.g:753:5: ({...}? => (otherlv_1= 'PROPERTY' ( (lv_props_2_0= 'INPUT' ) )? ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getPropertiesAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalAst.g:756:8: ({...}? => (otherlv_1= 'PROPERTY' ( (lv_props_2_0= 'INPUT' ) )? ) )
            	    // InternalAst.g:756:9: {...}? => (otherlv_1= 'PROPERTY' ( (lv_props_2_0= 'INPUT' ) )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleProperties", "true");
            	    }
            	    // InternalAst.g:756:18: (otherlv_1= 'PROPERTY' ( (lv_props_2_0= 'INPUT' ) )? )
            	    // InternalAst.g:756:19: otherlv_1= 'PROPERTY' ( (lv_props_2_0= 'INPUT' ) )?
            	    {
            	    otherlv_1=(Token)match(input,21,FOLLOW_8); 

            	    								newLeafNode(otherlv_1, grammarAccess.getPropertiesAccess().getPROPERTYKeyword_0_0());
            	    							
            	    // InternalAst.g:760:8: ( (lv_props_2_0= 'INPUT' ) )?
            	    int alt2=2;
            	    int LA2_0 = input.LA(1);

            	    if ( (LA2_0==22) ) {
            	        alt2=1;
            	    }
            	    switch (alt2) {
            	        case 1 :
            	            // InternalAst.g:761:9: (lv_props_2_0= 'INPUT' )
            	            {
            	            // InternalAst.g:761:9: (lv_props_2_0= 'INPUT' )
            	            // InternalAst.g:762:10: lv_props_2_0= 'INPUT'
            	            {
            	            lv_props_2_0=(Token)match(input,22,FOLLOW_9); 

            	            										newLeafNode(lv_props_2_0, grammarAccess.getPropertiesAccess().getPropsINPUTKeyword_0_1_0());
            	            									

            	            										if (current==null) {
            	            											current = createModelElement(grammarAccess.getPropertiesRule());
            	            										}
            	            										addWithLastConsumed(current, "props", lv_props_2_0, "INPUT");
            	            									

            	            }


            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPropertiesAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalAst.g:780:3: ({...}? => ( ({...}? => ( (lv_props_3_0= 'OUTPUT' ) ) ) ) )
            	    {
            	    // InternalAst.g:780:3: ({...}? => ( ({...}? => ( (lv_props_3_0= 'OUTPUT' ) ) ) ) )
            	    // InternalAst.g:781:4: {...}? => ( ({...}? => ( (lv_props_3_0= 'OUTPUT' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPropertiesAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleProperties", "getUnorderedGroupHelper().canSelect(grammarAccess.getPropertiesAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalAst.g:781:104: ( ({...}? => ( (lv_props_3_0= 'OUTPUT' ) ) ) )
            	    // InternalAst.g:782:5: ({...}? => ( (lv_props_3_0= 'OUTPUT' ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getPropertiesAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalAst.g:785:8: ({...}? => ( (lv_props_3_0= 'OUTPUT' ) ) )
            	    // InternalAst.g:785:9: {...}? => ( (lv_props_3_0= 'OUTPUT' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleProperties", "true");
            	    }
            	    // InternalAst.g:785:18: ( (lv_props_3_0= 'OUTPUT' ) )
            	    // InternalAst.g:785:19: (lv_props_3_0= 'OUTPUT' )
            	    {
            	    // InternalAst.g:785:19: (lv_props_3_0= 'OUTPUT' )
            	    // InternalAst.g:786:9: lv_props_3_0= 'OUTPUT'
            	    {
            	    lv_props_3_0=(Token)match(input,23,FOLLOW_9); 

            	    									newLeafNode(lv_props_3_0, grammarAccess.getPropertiesAccess().getPropsOUTPUTKeyword_1_0());
            	    								

            	    									if (current==null) {
            	    										current = createModelElement(grammarAccess.getPropertiesRule());
            	    									}
            	    									addWithLastConsumed(current, "props", lv_props_3_0, "OUTPUT");
            	    								

            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPropertiesAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalAst.g:803:3: ({...}? => ( ({...}? => ( (lv_props_4_0= 'SYNTHESIZED' ) ) ) ) )
            	    {
            	    // InternalAst.g:803:3: ({...}? => ( ({...}? => ( (lv_props_4_0= 'SYNTHESIZED' ) ) ) ) )
            	    // InternalAst.g:804:4: {...}? => ( ({...}? => ( (lv_props_4_0= 'SYNTHESIZED' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPropertiesAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleProperties", "getUnorderedGroupHelper().canSelect(grammarAccess.getPropertiesAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalAst.g:804:104: ( ({...}? => ( (lv_props_4_0= 'SYNTHESIZED' ) ) ) )
            	    // InternalAst.g:805:5: ({...}? => ( (lv_props_4_0= 'SYNTHESIZED' ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getPropertiesAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalAst.g:808:8: ({...}? => ( (lv_props_4_0= 'SYNTHESIZED' ) ) )
            	    // InternalAst.g:808:9: {...}? => ( (lv_props_4_0= 'SYNTHESIZED' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleProperties", "true");
            	    }
            	    // InternalAst.g:808:18: ( (lv_props_4_0= 'SYNTHESIZED' ) )
            	    // InternalAst.g:808:19: (lv_props_4_0= 'SYNTHESIZED' )
            	    {
            	    // InternalAst.g:808:19: (lv_props_4_0= 'SYNTHESIZED' )
            	    // InternalAst.g:809:9: lv_props_4_0= 'SYNTHESIZED'
            	    {
            	    lv_props_4_0=(Token)match(input,24,FOLLOW_9); 

            	    									newLeafNode(lv_props_4_0, grammarAccess.getPropertiesAccess().getPropsSYNTHESIZEDKeyword_2_0());
            	    								

            	    									if (current==null) {
            	    										current = createModelElement(grammarAccess.getPropertiesRule());
            	    									}
            	    									addWithLastConsumed(current, "props", lv_props_4_0, "SYNTHESIZED");
            	    								

            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPropertiesAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalAst.g:826:3: ({...}? => ( ({...}? => ( (lv_props_5_0= 'INHERITED' ) ) ) ) )
            	    {
            	    // InternalAst.g:826:3: ({...}? => ( ({...}? => ( (lv_props_5_0= 'INHERITED' ) ) ) ) )
            	    // InternalAst.g:827:4: {...}? => ( ({...}? => ( (lv_props_5_0= 'INHERITED' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPropertiesAccess().getUnorderedGroup(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleProperties", "getUnorderedGroupHelper().canSelect(grammarAccess.getPropertiesAccess().getUnorderedGroup(), 3)");
            	    }
            	    // InternalAst.g:827:104: ( ({...}? => ( (lv_props_5_0= 'INHERITED' ) ) ) )
            	    // InternalAst.g:828:5: ({...}? => ( (lv_props_5_0= 'INHERITED' ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getPropertiesAccess().getUnorderedGroup(), 3);
            	    				
            	    // InternalAst.g:831:8: ({...}? => ( (lv_props_5_0= 'INHERITED' ) ) )
            	    // InternalAst.g:831:9: {...}? => ( (lv_props_5_0= 'INHERITED' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleProperties", "true");
            	    }
            	    // InternalAst.g:831:18: ( (lv_props_5_0= 'INHERITED' ) )
            	    // InternalAst.g:831:19: (lv_props_5_0= 'INHERITED' )
            	    {
            	    // InternalAst.g:831:19: (lv_props_5_0= 'INHERITED' )
            	    // InternalAst.g:832:9: lv_props_5_0= 'INHERITED'
            	    {
            	    lv_props_5_0=(Token)match(input,25,FOLLOW_9); 

            	    									newLeafNode(lv_props_5_0, grammarAccess.getPropertiesAccess().getPropsINHERITEDKeyword_3_0());
            	    								

            	    									if (current==null) {
            	    										current = createModelElement(grammarAccess.getPropertiesRule());
            	    									}
            	    									addWithLastConsumed(current, "props", lv_props_5_0, "INHERITED");
            	    								

            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPropertiesAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalAst.g:849:3: ({...}? => ( ({...}? => ( (lv_props_6_0= 'THREAD' ) ) ) ) )
            	    {
            	    // InternalAst.g:849:3: ({...}? => ( ({...}? => ( (lv_props_6_0= 'THREAD' ) ) ) ) )
            	    // InternalAst.g:850:4: {...}? => ( ({...}? => ( (lv_props_6_0= 'THREAD' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPropertiesAccess().getUnorderedGroup(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleProperties", "getUnorderedGroupHelper().canSelect(grammarAccess.getPropertiesAccess().getUnorderedGroup(), 4)");
            	    }
            	    // InternalAst.g:850:104: ( ({...}? => ( (lv_props_6_0= 'THREAD' ) ) ) )
            	    // InternalAst.g:851:5: ({...}? => ( (lv_props_6_0= 'THREAD' ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getPropertiesAccess().getUnorderedGroup(), 4);
            	    				
            	    // InternalAst.g:854:8: ({...}? => ( (lv_props_6_0= 'THREAD' ) ) )
            	    // InternalAst.g:854:9: {...}? => ( (lv_props_6_0= 'THREAD' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleProperties", "true");
            	    }
            	    // InternalAst.g:854:18: ( (lv_props_6_0= 'THREAD' ) )
            	    // InternalAst.g:854:19: (lv_props_6_0= 'THREAD' )
            	    {
            	    // InternalAst.g:854:19: (lv_props_6_0= 'THREAD' )
            	    // InternalAst.g:855:9: lv_props_6_0= 'THREAD'
            	    {
            	    lv_props_6_0=(Token)match(input,26,FOLLOW_9); 

            	    									newLeafNode(lv_props_6_0, grammarAccess.getPropertiesAccess().getPropsTHREADKeyword_4_0());
            	    								

            	    									if (current==null) {
            	    										current = createModelElement(grammarAccess.getPropertiesRule());
            	    									}
            	    									addWithLastConsumed(current, "props", lv_props_6_0, "THREAD");
            	    								

            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPropertiesAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalAst.g:872:3: ({...}? => ( ({...}? => ( (lv_props_7_0= 'REVERSE' ) ) ) ) )
            	    {
            	    // InternalAst.g:872:3: ({...}? => ( ({...}? => ( (lv_props_7_0= 'REVERSE' ) ) ) ) )
            	    // InternalAst.g:873:4: {...}? => ( ({...}? => ( (lv_props_7_0= 'REVERSE' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPropertiesAccess().getUnorderedGroup(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleProperties", "getUnorderedGroupHelper().canSelect(grammarAccess.getPropertiesAccess().getUnorderedGroup(), 5)");
            	    }
            	    // InternalAst.g:873:104: ( ({...}? => ( (lv_props_7_0= 'REVERSE' ) ) ) )
            	    // InternalAst.g:874:5: ({...}? => ( (lv_props_7_0= 'REVERSE' ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getPropertiesAccess().getUnorderedGroup(), 5);
            	    				
            	    // InternalAst.g:877:8: ({...}? => ( (lv_props_7_0= 'REVERSE' ) ) )
            	    // InternalAst.g:877:9: {...}? => ( (lv_props_7_0= 'REVERSE' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleProperties", "true");
            	    }
            	    // InternalAst.g:877:18: ( (lv_props_7_0= 'REVERSE' ) )
            	    // InternalAst.g:877:19: (lv_props_7_0= 'REVERSE' )
            	    {
            	    // InternalAst.g:877:19: (lv_props_7_0= 'REVERSE' )
            	    // InternalAst.g:878:9: lv_props_7_0= 'REVERSE'
            	    {
            	    lv_props_7_0=(Token)match(input,27,FOLLOW_9); 

            	    									newLeafNode(lv_props_7_0, grammarAccess.getPropertiesAccess().getPropsREVERSEKeyword_5_0());
            	    								

            	    									if (current==null) {
            	    										current = createModelElement(grammarAccess.getPropertiesRule());
            	    									}
            	    									addWithLastConsumed(current, "props", lv_props_7_0, "REVERSE");
            	    								

            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPropertiesAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // InternalAst.g:895:3: ({...}? => ( ({...}? => ( (lv_props_8_0= 'IGNORE' ) ) ) ) )
            	    {
            	    // InternalAst.g:895:3: ({...}? => ( ({...}? => ( (lv_props_8_0= 'IGNORE' ) ) ) ) )
            	    // InternalAst.g:896:4: {...}? => ( ({...}? => ( (lv_props_8_0= 'IGNORE' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPropertiesAccess().getUnorderedGroup(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleProperties", "getUnorderedGroupHelper().canSelect(grammarAccess.getPropertiesAccess().getUnorderedGroup(), 6)");
            	    }
            	    // InternalAst.g:896:104: ( ({...}? => ( (lv_props_8_0= 'IGNORE' ) ) ) )
            	    // InternalAst.g:897:5: ({...}? => ( (lv_props_8_0= 'IGNORE' ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getPropertiesAccess().getUnorderedGroup(), 6);
            	    				
            	    // InternalAst.g:900:8: ({...}? => ( (lv_props_8_0= 'IGNORE' ) ) )
            	    // InternalAst.g:900:9: {...}? => ( (lv_props_8_0= 'IGNORE' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleProperties", "true");
            	    }
            	    // InternalAst.g:900:18: ( (lv_props_8_0= 'IGNORE' ) )
            	    // InternalAst.g:900:19: (lv_props_8_0= 'IGNORE' )
            	    {
            	    // InternalAst.g:900:19: (lv_props_8_0= 'IGNORE' )
            	    // InternalAst.g:901:9: lv_props_8_0= 'IGNORE'
            	    {
            	    lv_props_8_0=(Token)match(input,28,FOLLOW_9); 

            	    									newLeafNode(lv_props_8_0, grammarAccess.getPropertiesAccess().getPropsIGNOREKeyword_6_0());
            	    								

            	    									if (current==null) {
            	    										current = createModelElement(grammarAccess.getPropertiesRule());
            	    									}
            	    									addWithLastConsumed(current, "props", lv_props_8_0, "IGNORE");
            	    								

            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPropertiesAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 8 :
            	    // InternalAst.g:918:3: ({...}? => ( ({...}? => ( (lv_props_9_0= 'VIRTUAL' ) ) ) ) )
            	    {
            	    // InternalAst.g:918:3: ({...}? => ( ({...}? => ( (lv_props_9_0= 'VIRTUAL' ) ) ) ) )
            	    // InternalAst.g:919:4: {...}? => ( ({...}? => ( (lv_props_9_0= 'VIRTUAL' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPropertiesAccess().getUnorderedGroup(), 7) ) {
            	        throw new FailedPredicateException(input, "ruleProperties", "getUnorderedGroupHelper().canSelect(grammarAccess.getPropertiesAccess().getUnorderedGroup(), 7)");
            	    }
            	    // InternalAst.g:919:104: ( ({...}? => ( (lv_props_9_0= 'VIRTUAL' ) ) ) )
            	    // InternalAst.g:920:5: ({...}? => ( (lv_props_9_0= 'VIRTUAL' ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getPropertiesAccess().getUnorderedGroup(), 7);
            	    				
            	    // InternalAst.g:923:8: ({...}? => ( (lv_props_9_0= 'VIRTUAL' ) ) )
            	    // InternalAst.g:923:9: {...}? => ( (lv_props_9_0= 'VIRTUAL' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleProperties", "true");
            	    }
            	    // InternalAst.g:923:18: ( (lv_props_9_0= 'VIRTUAL' ) )
            	    // InternalAst.g:923:19: (lv_props_9_0= 'VIRTUAL' )
            	    {
            	    // InternalAst.g:923:19: (lv_props_9_0= 'VIRTUAL' )
            	    // InternalAst.g:924:9: lv_props_9_0= 'VIRTUAL'
            	    {
            	    lv_props_9_0=(Token)match(input,29,FOLLOW_9); 

            	    									newLeafNode(lv_props_9_0, grammarAccess.getPropertiesAccess().getPropsVIRTUALKeyword_7_0());
            	    								

            	    									if (current==null) {
            	    										current = createModelElement(grammarAccess.getPropertiesRule());
            	    									}
            	    									addWithLastConsumed(current, "props", lv_props_9_0, "VIRTUAL");
            	    								

            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPropertiesAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getPropertiesAccess().getUnorderedGroup()) ) {
                throw new FailedPredicateException(input, "ruleProperties", "getUnorderedGroupHelper().canLeave(grammarAccess.getPropertiesAccess().getUnorderedGroup())");
            }

            }


            }

             
            			  getUnorderedGroupHelper().leave(grammarAccess.getPropertiesAccess().getUnorderedGroup());
            			

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


    // $ANTLR start "entryRuleCodeBlock"
    // InternalAst.g:952:1: entryRuleCodeBlock returns [String current=null] : iv_ruleCodeBlock= ruleCodeBlock EOF ;
    public final String entryRuleCodeBlock() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCodeBlock = null;


        try {
            // InternalAst.g:952:49: (iv_ruleCodeBlock= ruleCodeBlock EOF )
            // InternalAst.g:953:2: iv_ruleCodeBlock= ruleCodeBlock EOF
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
    // InternalAst.g:959:1: ruleCodeBlock returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_CodeWall_0= ruleCodeWall | (kw= '{' this_CodeBlock_2= ruleCodeBlock kw= '}' ) )* ;
    public final AntlrDatatypeRuleToken ruleCodeBlock() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_CodeWall_0 = null;

        AntlrDatatypeRuleToken this_CodeBlock_2 = null;



        	enterRule();

        try {
            // InternalAst.g:965:2: ( (this_CodeWall_0= ruleCodeWall | (kw= '{' this_CodeBlock_2= ruleCodeBlock kw= '}' ) )* )
            // InternalAst.g:966:2: (this_CodeWall_0= ruleCodeWall | (kw= '{' this_CodeBlock_2= ruleCodeBlock kw= '}' ) )*
            {
            // InternalAst.g:966:2: (this_CodeWall_0= ruleCodeWall | (kw= '{' this_CodeBlock_2= ruleCodeBlock kw= '}' ) )*
            loop4:
            do {
                int alt4=3;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=RULE_ID && LA4_0<=RULE_WS)||(LA4_0>=30 && LA4_0<=49)) ) {
                    alt4=1;
                }
                else if ( (LA4_0==14) ) {
                    alt4=2;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalAst.g:967:3: this_CodeWall_0= ruleCodeWall
            	    {

            	    			newCompositeNode(grammarAccess.getCodeBlockAccess().getCodeWallParserRuleCall_0());
            	    		
            	    pushFollow(FOLLOW_10);
            	    this_CodeWall_0=ruleCodeWall();

            	    state._fsp--;


            	    			current.merge(this_CodeWall_0);
            	    		

            	    			afterParserOrEnumRuleCall();
            	    		

            	    }
            	    break;
            	case 2 :
            	    // InternalAst.g:978:3: (kw= '{' this_CodeBlock_2= ruleCodeBlock kw= '}' )
            	    {
            	    // InternalAst.g:978:3: (kw= '{' this_CodeBlock_2= ruleCodeBlock kw= '}' )
            	    // InternalAst.g:979:4: kw= '{' this_CodeBlock_2= ruleCodeBlock kw= '}'
            	    {
            	    kw=(Token)match(input,14,FOLLOW_6); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getCodeBlockAccess().getLeftCurlyBracketKeyword_1_0());
            	    			

            	    				newCompositeNode(grammarAccess.getCodeBlockAccess().getCodeBlockParserRuleCall_1_1());
            	    			
            	    pushFollow(FOLLOW_7);
            	    this_CodeBlock_2=ruleCodeBlock();

            	    state._fsp--;


            	    				current.merge(this_CodeBlock_2);
            	    			

            	    				afterParserOrEnumRuleCall();
            	    			
            	    kw=(Token)match(input,15,FOLLOW_10); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getCodeBlockAccess().getRightCurlyBracketKeyword_1_2());
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
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
    // InternalAst.g:1004:1: entryRuleCodeWall returns [String current=null] : iv_ruleCodeWall= ruleCodeWall EOF ;
    public final String entryRuleCodeWall() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCodeWall = null;


        try {
            // InternalAst.g:1004:48: (iv_ruleCodeWall= ruleCodeWall EOF )
            // InternalAst.g:1005:2: iv_ruleCodeWall= ruleCodeWall EOF
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
    // InternalAst.g:1011:1: ruleCodeWall returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_INT_1= RULE_INT | this_STRING_2= RULE_STRING | this_WS_3= RULE_WS | kw= '+' | kw= '-' | kw= '(' | kw= ')' | kw= '*' | kw= '.' | kw= '/' | kw= '\\\\' | kw= '|' | kw= '?' | kw= '>' | kw= '<' | kw= '#' | kw= '$' | kw= '%' | kw= ';' | kw= ':' | kw= '!' | kw= '=' | kw= ',' ) ;
    public final AntlrDatatypeRuleToken ruleCodeWall() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_INT_1=null;
        Token this_STRING_2=null;
        Token this_WS_3=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalAst.g:1017:2: ( (this_ID_0= RULE_ID | this_INT_1= RULE_INT | this_STRING_2= RULE_STRING | this_WS_3= RULE_WS | kw= '+' | kw= '-' | kw= '(' | kw= ')' | kw= '*' | kw= '.' | kw= '/' | kw= '\\\\' | kw= '|' | kw= '?' | kw= '>' | kw= '<' | kw= '#' | kw= '$' | kw= '%' | kw= ';' | kw= ':' | kw= '!' | kw= '=' | kw= ',' ) )
            // InternalAst.g:1018:2: (this_ID_0= RULE_ID | this_INT_1= RULE_INT | this_STRING_2= RULE_STRING | this_WS_3= RULE_WS | kw= '+' | kw= '-' | kw= '(' | kw= ')' | kw= '*' | kw= '.' | kw= '/' | kw= '\\\\' | kw= '|' | kw= '?' | kw= '>' | kw= '<' | kw= '#' | kw= '$' | kw= '%' | kw= ';' | kw= ':' | kw= '!' | kw= '=' | kw= ',' )
            {
            // InternalAst.g:1018:2: (this_ID_0= RULE_ID | this_INT_1= RULE_INT | this_STRING_2= RULE_STRING | this_WS_3= RULE_WS | kw= '+' | kw= '-' | kw= '(' | kw= ')' | kw= '*' | kw= '.' | kw= '/' | kw= '\\\\' | kw= '|' | kw= '?' | kw= '>' | kw= '<' | kw= '#' | kw= '$' | kw= '%' | kw= ';' | kw= ':' | kw= '!' | kw= '=' | kw= ',' )
            int alt5=24;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt5=1;
                }
                break;
            case RULE_INT:
                {
                alt5=2;
                }
                break;
            case RULE_STRING:
                {
                alt5=3;
                }
                break;
            case RULE_WS:
                {
                alt5=4;
                }
                break;
            case 30:
                {
                alt5=5;
                }
                break;
            case 31:
                {
                alt5=6;
                }
                break;
            case 32:
                {
                alt5=7;
                }
                break;
            case 33:
                {
                alt5=8;
                }
                break;
            case 34:
                {
                alt5=9;
                }
                break;
            case 35:
                {
                alt5=10;
                }
                break;
            case 36:
                {
                alt5=11;
                }
                break;
            case 37:
                {
                alt5=12;
                }
                break;
            case 38:
                {
                alt5=13;
                }
                break;
            case 39:
                {
                alt5=14;
                }
                break;
            case 40:
                {
                alt5=15;
                }
                break;
            case 41:
                {
                alt5=16;
                }
                break;
            case 42:
                {
                alt5=17;
                }
                break;
            case 43:
                {
                alt5=18;
                }
                break;
            case 44:
                {
                alt5=19;
                }
                break;
            case 45:
                {
                alt5=20;
                }
                break;
            case 46:
                {
                alt5=21;
                }
                break;
            case 47:
                {
                alt5=22;
                }
                break;
            case 48:
                {
                alt5=23;
                }
                break;
            case 49:
                {
                alt5=24;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalAst.g:1019:3: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_0);
                    		

                    			newLeafNode(this_ID_0, grammarAccess.getCodeWallAccess().getIDTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAst.g:1027:3: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			current.merge(this_INT_1);
                    		

                    			newLeafNode(this_INT_1, grammarAccess.getCodeWallAccess().getINTTerminalRuleCall_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalAst.g:1035:3: this_STRING_2= RULE_STRING
                    {
                    this_STRING_2=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_2);
                    		

                    			newLeafNode(this_STRING_2, grammarAccess.getCodeWallAccess().getSTRINGTerminalRuleCall_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalAst.g:1043:3: this_WS_3= RULE_WS
                    {
                    this_WS_3=(Token)match(input,RULE_WS,FOLLOW_2); 

                    			current.merge(this_WS_3);
                    		

                    			newLeafNode(this_WS_3, grammarAccess.getCodeWallAccess().getWSTerminalRuleCall_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalAst.g:1051:3: kw= '+'
                    {
                    kw=(Token)match(input,30,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCodeWallAccess().getPlusSignKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalAst.g:1057:3: kw= '-'
                    {
                    kw=(Token)match(input,31,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCodeWallAccess().getHyphenMinusKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalAst.g:1063:3: kw= '('
                    {
                    kw=(Token)match(input,32,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCodeWallAccess().getLeftParenthesisKeyword_6());
                    		

                    }
                    break;
                case 8 :
                    // InternalAst.g:1069:3: kw= ')'
                    {
                    kw=(Token)match(input,33,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCodeWallAccess().getRightParenthesisKeyword_7());
                    		

                    }
                    break;
                case 9 :
                    // InternalAst.g:1075:3: kw= '*'
                    {
                    kw=(Token)match(input,34,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCodeWallAccess().getAsteriskKeyword_8());
                    		

                    }
                    break;
                case 10 :
                    // InternalAst.g:1081:3: kw= '.'
                    {
                    kw=(Token)match(input,35,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCodeWallAccess().getFullStopKeyword_9());
                    		

                    }
                    break;
                case 11 :
                    // InternalAst.g:1087:3: kw= '/'
                    {
                    kw=(Token)match(input,36,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCodeWallAccess().getSolidusKeyword_10());
                    		

                    }
                    break;
                case 12 :
                    // InternalAst.g:1093:3: kw= '\\\\'
                    {
                    kw=(Token)match(input,37,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCodeWallAccess().getReverseSolidusKeyword_11());
                    		

                    }
                    break;
                case 13 :
                    // InternalAst.g:1099:3: kw= '|'
                    {
                    kw=(Token)match(input,38,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCodeWallAccess().getVerticalLineKeyword_12());
                    		

                    }
                    break;
                case 14 :
                    // InternalAst.g:1105:3: kw= '?'
                    {
                    kw=(Token)match(input,39,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCodeWallAccess().getQuestionMarkKeyword_13());
                    		

                    }
                    break;
                case 15 :
                    // InternalAst.g:1111:3: kw= '>'
                    {
                    kw=(Token)match(input,40,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCodeWallAccess().getGreaterThanSignKeyword_14());
                    		

                    }
                    break;
                case 16 :
                    // InternalAst.g:1117:3: kw= '<'
                    {
                    kw=(Token)match(input,41,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCodeWallAccess().getLessThanSignKeyword_15());
                    		

                    }
                    break;
                case 17 :
                    // InternalAst.g:1123:3: kw= '#'
                    {
                    kw=(Token)match(input,42,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCodeWallAccess().getNumberSignKeyword_16());
                    		

                    }
                    break;
                case 18 :
                    // InternalAst.g:1129:3: kw= '$'
                    {
                    kw=(Token)match(input,43,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCodeWallAccess().getDollarSignKeyword_17());
                    		

                    }
                    break;
                case 19 :
                    // InternalAst.g:1135:3: kw= '%'
                    {
                    kw=(Token)match(input,44,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCodeWallAccess().getPercentSignKeyword_18());
                    		

                    }
                    break;
                case 20 :
                    // InternalAst.g:1141:3: kw= ';'
                    {
                    kw=(Token)match(input,45,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCodeWallAccess().getSemicolonKeyword_19());
                    		

                    }
                    break;
                case 21 :
                    // InternalAst.g:1147:3: kw= ':'
                    {
                    kw=(Token)match(input,46,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCodeWallAccess().getColonKeyword_20());
                    		

                    }
                    break;
                case 22 :
                    // InternalAst.g:1153:3: kw= '!'
                    {
                    kw=(Token)match(input,47,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCodeWallAccess().getExclamationMarkKeyword_21());
                    		

                    }
                    break;
                case 23 :
                    // InternalAst.g:1159:3: kw= '='
                    {
                    kw=(Token)match(input,48,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCodeWallAccess().getEqualsSignKeyword_22());
                    		

                    }
                    break;
                case 24 :
                    // InternalAst.g:1165:3: kw= ','
                    {
                    kw=(Token)match(input,49,FOLLOW_2); 

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

    // Delegated rules


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA3 dfa3 = new DFA3(this);
    static final String dfa_1s = "\13\uffff";
    static final String dfa_2s = "\1\1\12\uffff";
    static final String dfa_3s = "\1\13\12\uffff";
    static final String dfa_4s = "\1\35\12\uffff";
    static final String dfa_5s = "\1\uffff\1\12\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11";
    static final String dfa_6s = "\1\0\12\uffff}>";
    static final String[] dfa_7s = {
            "\1\2\1\3\1\4\2\uffff\1\5\1\6\1\7\1\10\1\11\1\12\1\uffff\7\12",
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
            return "()+ loopback of 84:5: ( ({...}? => ( ({...}? => ( (lv_module_1_0= ruleModule ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_tree_2_0= ruleTree ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_imp_3_0= ruleImport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_exp_4_0= ruleExport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_glo_5_0= ruleGlobal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_loc_6_0= ruleLocal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_beg_7_0= ruleBegin ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_clo_8_0= ruleClose ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_pro_9_0= ruleProperties ) ) ) ) ) )+";
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

                        else if ( LA1_0 == 11 && getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 0) ) {s = 2;}

                        else if ( LA1_0 == 12 && getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 1) ) {s = 3;}

                        else if ( LA1_0 == 13 && getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 2) ) {s = 4;}

                        else if ( LA1_0 == 16 && getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 3) ) {s = 5;}

                        else if ( LA1_0 == 17 && getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 4) ) {s = 6;}

                        else if ( LA1_0 == 18 && getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 5) ) {s = 7;}

                        else if ( LA1_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 6) ) {s = 8;}

                        else if ( LA1_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 7) ) {s = 9;}

                        else if ( ( LA1_0 == 21 || LA1_0 >= 23 && LA1_0 <= 29 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 8) ) {s = 10;}

                         
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
    static final String dfa_8s = "\22\uffff";
    static final String dfa_9s = "\1\1\21\uffff";
    static final String dfa_10s = "\1\13\1\uffff\10\0\10\uffff";
    static final String dfa_11s = "\1\35\1\uffff\10\0\10\uffff";
    static final String dfa_12s = "\1\uffff\1\11\10\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10";
    static final String dfa_13s = "\2\uffff\1\0\1\1\1\5\1\2\1\6\1\3\1\7\1\4\10\uffff}>";
    static final String[] dfa_14s = {
            "\3\1\2\uffff\5\1\1\2\1\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\11",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
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

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = dfa_8;
            this.eof = dfa_9;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "()+ loopback of 750:5: ( ({...}? => ( ({...}? => (otherlv_1= 'PROPERTY' ( (lv_props_2_0= 'INPUT' ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_3_0= 'OUTPUT' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_4_0= 'SYNTHESIZED' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_5_0= 'INHERITED' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_6_0= 'THREAD' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_7_0= 'REVERSE' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_8_0= 'IGNORE' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_9_0= 'VIRTUAL' ) ) ) ) ) )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA3_2 = input.LA(1);

                         
                        int index3_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getPropertiesAccess().getUnorderedGroup(), 0) ) {s = 10;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getPropertiesAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index3_2);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA3_3 = input.LA(1);

                         
                        int index3_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getPropertiesAccess().getUnorderedGroup(), 1) ) {s = 11;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getPropertiesAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index3_3);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA3_5 = input.LA(1);

                         
                        int index3_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getPropertiesAccess().getUnorderedGroup(), 3) ) {s = 13;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getPropertiesAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index3_5);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA3_7 = input.LA(1);

                         
                        int index3_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getPropertiesAccess().getUnorderedGroup(), 5) ) {s = 15;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getPropertiesAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index3_7);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA3_9 = input.LA(1);

                         
                        int index3_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getPropertiesAccess().getUnorderedGroup(), 7) ) {s = 17;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getPropertiesAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index3_9);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA3_4 = input.LA(1);

                         
                        int index3_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getPropertiesAccess().getUnorderedGroup(), 2) ) {s = 12;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getPropertiesAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index3_4);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA3_6 = input.LA(1);

                         
                        int index3_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getPropertiesAccess().getUnorderedGroup(), 4) ) {s = 14;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getPropertiesAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index3_6);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA3_8 = input.LA(1);

                         
                        int index3_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getPropertiesAccess().getUnorderedGroup(), 6) ) {s = 16;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getPropertiesAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index3_8);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 3, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000003FBF3802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0003FFFFC000C0F0L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000003FE00002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000000003FA00002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0003FFFFC00040F2L});

}
