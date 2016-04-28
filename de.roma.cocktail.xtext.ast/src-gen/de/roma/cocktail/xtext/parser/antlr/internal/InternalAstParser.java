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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_ANY_OTHER", "'MODULE'", "'TREE'", "'IMPORT'", "'{'", "'}'", "'EXPORT'", "'GLOBAL'", "'LOCAL'", "'BEGIN'", "'CLOSE'", "'PROPERTY'", "'INPUT'", "'OUTPUT'", "'SYNTHESIZED'", "'INHERITED'", "'THREAD'", "'REVERSE'", "'IGNORE'", "'VIRTUAL'", "'DECLARE'", "'='", "':'", "'.'", "'RULE'", "'<-'", "'<'", "'>'", "'['", "']'", "':='", "'+'", "'-'", "'('", "')'", "'*'", "'/'", "'\\\\'", "'|'", "'?'", "'#'", "'$'", "'%'", "';'", "'!'", "','"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
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
    public static final int T__20=20;
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
    // InternalAst.g:71:1: ruleModel returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => ( (lv_module_1_0= ruleModule ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_tree_2_0= ruleTree ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_imp_3_0= ruleImport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_exp_4_0= ruleExport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_glo_5_0= ruleGlobal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_loc_6_0= ruleLocal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_beg_7_0= ruleBegin ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_clo_8_0= ruleClose ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_pro_9_0= ruleProperties ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_rul_10_0= ruleRule ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dec_11_0= ruleDeclare ) ) ) ) ) )+ {...}?) ) ) ;
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

        EObject lv_rul_10_0 = null;

        EObject lv_dec_11_0 = null;



        	enterRule();

        try {
            // InternalAst.g:77:2: ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_module_1_0= ruleModule ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_tree_2_0= ruleTree ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_imp_3_0= ruleImport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_exp_4_0= ruleExport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_glo_5_0= ruleGlobal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_loc_6_0= ruleLocal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_beg_7_0= ruleBegin ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_clo_8_0= ruleClose ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_pro_9_0= ruleProperties ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_rul_10_0= ruleRule ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dec_11_0= ruleDeclare ) ) ) ) ) )+ {...}?) ) ) )
            // InternalAst.g:78:2: ( ( ( ( ({...}? => ( ({...}? => ( (lv_module_1_0= ruleModule ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_tree_2_0= ruleTree ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_imp_3_0= ruleImport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_exp_4_0= ruleExport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_glo_5_0= ruleGlobal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_loc_6_0= ruleLocal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_beg_7_0= ruleBegin ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_clo_8_0= ruleClose ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_pro_9_0= ruleProperties ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_rul_10_0= ruleRule ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dec_11_0= ruleDeclare ) ) ) ) ) )+ {...}?) ) )
            {
            // InternalAst.g:78:2: ( ( ( ( ({...}? => ( ({...}? => ( (lv_module_1_0= ruleModule ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_tree_2_0= ruleTree ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_imp_3_0= ruleImport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_exp_4_0= ruleExport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_glo_5_0= ruleGlobal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_loc_6_0= ruleLocal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_beg_7_0= ruleBegin ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_clo_8_0= ruleClose ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_pro_9_0= ruleProperties ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_rul_10_0= ruleRule ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dec_11_0= ruleDeclare ) ) ) ) ) )+ {...}?) ) )
            // InternalAst.g:79:3: ( ( ( ({...}? => ( ({...}? => ( (lv_module_1_0= ruleModule ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_tree_2_0= ruleTree ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_imp_3_0= ruleImport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_exp_4_0= ruleExport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_glo_5_0= ruleGlobal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_loc_6_0= ruleLocal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_beg_7_0= ruleBegin ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_clo_8_0= ruleClose ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_pro_9_0= ruleProperties ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_rul_10_0= ruleRule ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dec_11_0= ruleDeclare ) ) ) ) ) )+ {...}?) )
            {
            // InternalAst.g:79:3: ( ( ( ({...}? => ( ({...}? => ( (lv_module_1_0= ruleModule ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_tree_2_0= ruleTree ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_imp_3_0= ruleImport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_exp_4_0= ruleExport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_glo_5_0= ruleGlobal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_loc_6_0= ruleLocal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_beg_7_0= ruleBegin ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_clo_8_0= ruleClose ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_pro_9_0= ruleProperties ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_rul_10_0= ruleRule ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dec_11_0= ruleDeclare ) ) ) ) ) )+ {...}?) )
            // InternalAst.g:80:4: ( ( ({...}? => ( ({...}? => ( (lv_module_1_0= ruleModule ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_tree_2_0= ruleTree ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_imp_3_0= ruleImport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_exp_4_0= ruleExport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_glo_5_0= ruleGlobal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_loc_6_0= ruleLocal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_beg_7_0= ruleBegin ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_clo_8_0= ruleClose ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_pro_9_0= ruleProperties ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_rul_10_0= ruleRule ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dec_11_0= ruleDeclare ) ) ) ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getModelAccess().getUnorderedGroup());
            			
            // InternalAst.g:83:4: ( ( ({...}? => ( ({...}? => ( (lv_module_1_0= ruleModule ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_tree_2_0= ruleTree ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_imp_3_0= ruleImport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_exp_4_0= ruleExport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_glo_5_0= ruleGlobal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_loc_6_0= ruleLocal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_beg_7_0= ruleBegin ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_clo_8_0= ruleClose ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_pro_9_0= ruleProperties ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_rul_10_0= ruleRule ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dec_11_0= ruleDeclare ) ) ) ) ) )+ {...}?)
            // InternalAst.g:84:5: ( ({...}? => ( ({...}? => ( (lv_module_1_0= ruleModule ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_tree_2_0= ruleTree ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_imp_3_0= ruleImport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_exp_4_0= ruleExport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_glo_5_0= ruleGlobal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_loc_6_0= ruleLocal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_beg_7_0= ruleBegin ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_clo_8_0= ruleClose ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_pro_9_0= ruleProperties ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_rul_10_0= ruleRule ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dec_11_0= ruleDeclare ) ) ) ) ) )+ {...}?
            {
            // InternalAst.g:84:5: ( ({...}? => ( ({...}? => ( (lv_module_1_0= ruleModule ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_tree_2_0= ruleTree ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_imp_3_0= ruleImport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_exp_4_0= ruleExport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_glo_5_0= ruleGlobal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_loc_6_0= ruleLocal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_beg_7_0= ruleBegin ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_clo_8_0= ruleClose ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_pro_9_0= ruleProperties ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_rul_10_0= ruleRule ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dec_11_0= ruleDeclare ) ) ) ) ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=12;
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
            	case 10 :
            	    // InternalAst.g:337:3: ({...}? => ( ({...}? => ( (lv_rul_10_0= ruleRule ) ) ) ) )
            	    {
            	    // InternalAst.g:337:3: ({...}? => ( ({...}? => ( (lv_rul_10_0= ruleRule ) ) ) ) )
            	    // InternalAst.g:338:4: {...}? => ( ({...}? => ( (lv_rul_10_0= ruleRule ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 9) ) {
            	        throw new FailedPredicateException(input, "ruleModel", "getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 9)");
            	    }
            	    // InternalAst.g:338:99: ( ({...}? => ( (lv_rul_10_0= ruleRule ) ) ) )
            	    // InternalAst.g:339:5: ({...}? => ( (lv_rul_10_0= ruleRule ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getModelAccess().getUnorderedGroup(), 9);
            	    				
            	    // InternalAst.g:342:8: ({...}? => ( (lv_rul_10_0= ruleRule ) ) )
            	    // InternalAst.g:342:9: {...}? => ( (lv_rul_10_0= ruleRule ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleModel", "true");
            	    }
            	    // InternalAst.g:342:18: ( (lv_rul_10_0= ruleRule ) )
            	    // InternalAst.g:342:19: (lv_rul_10_0= ruleRule )
            	    {
            	    // InternalAst.g:342:19: (lv_rul_10_0= ruleRule )
            	    // InternalAst.g:343:9: lv_rul_10_0= ruleRule
            	    {

            	    									newCompositeNode(grammarAccess.getModelAccess().getRulRuleParserRuleCall_9_0());
            	    								
            	    pushFollow(FOLLOW_3);
            	    lv_rul_10_0=ruleRule();

            	    state._fsp--;


            	    									if (current==null) {
            	    										current = createModelElementForParent(grammarAccess.getModelRule());
            	    									}
            	    									set(
            	    										current,
            	    										"rul",
            	    										lv_rul_10_0,
            	    										"de.roma.cocktail.xtext.Ast.Rule");
            	    									afterParserOrEnumRuleCall();
            	    								

            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getModelAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 11 :
            	    // InternalAst.g:365:3: ({...}? => ( ({...}? => ( (lv_dec_11_0= ruleDeclare ) ) ) ) )
            	    {
            	    // InternalAst.g:365:3: ({...}? => ( ({...}? => ( (lv_dec_11_0= ruleDeclare ) ) ) ) )
            	    // InternalAst.g:366:4: {...}? => ( ({...}? => ( (lv_dec_11_0= ruleDeclare ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 10) ) {
            	        throw new FailedPredicateException(input, "ruleModel", "getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 10)");
            	    }
            	    // InternalAst.g:366:100: ( ({...}? => ( (lv_dec_11_0= ruleDeclare ) ) ) )
            	    // InternalAst.g:367:5: ({...}? => ( (lv_dec_11_0= ruleDeclare ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getModelAccess().getUnorderedGroup(), 10);
            	    				
            	    // InternalAst.g:370:8: ({...}? => ( (lv_dec_11_0= ruleDeclare ) ) )
            	    // InternalAst.g:370:9: {...}? => ( (lv_dec_11_0= ruleDeclare ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleModel", "true");
            	    }
            	    // InternalAst.g:370:18: ( (lv_dec_11_0= ruleDeclare ) )
            	    // InternalAst.g:370:19: (lv_dec_11_0= ruleDeclare )
            	    {
            	    // InternalAst.g:370:19: (lv_dec_11_0= ruleDeclare )
            	    // InternalAst.g:371:9: lv_dec_11_0= ruleDeclare
            	    {

            	    									newCompositeNode(grammarAccess.getModelAccess().getDecDeclareParserRuleCall_10_0());
            	    								
            	    pushFollow(FOLLOW_3);
            	    lv_dec_11_0=ruleDeclare();

            	    state._fsp--;


            	    									if (current==null) {
            	    										current = createModelElementForParent(grammarAccess.getModelRule());
            	    									}
            	    									set(
            	    										current,
            	    										"dec",
            	    										lv_dec_11_0,
            	    										"de.roma.cocktail.xtext.Ast.Declare");
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
    // InternalAst.g:404:1: entryRuleModule returns [EObject current=null] : iv_ruleModule= ruleModule EOF ;
    public final EObject entryRuleModule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModule = null;


        try {
            // InternalAst.g:404:47: (iv_ruleModule= ruleModule EOF )
            // InternalAst.g:405:2: iv_ruleModule= ruleModule EOF
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
    // InternalAst.g:411:1: ruleModule returns [EObject current=null] : (otherlv_0= 'MODULE' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleModule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalAst.g:417:2: ( (otherlv_0= 'MODULE' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalAst.g:418:2: (otherlv_0= 'MODULE' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalAst.g:418:2: (otherlv_0= 'MODULE' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalAst.g:419:3: otherlv_0= 'MODULE' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getModuleAccess().getMODULEKeyword_0());
            		
            // InternalAst.g:423:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAst.g:424:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAst.g:424:4: (lv_name_1_0= RULE_ID )
            // InternalAst.g:425:5: lv_name_1_0= RULE_ID
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
    // InternalAst.g:445:1: entryRuleTree returns [EObject current=null] : iv_ruleTree= ruleTree EOF ;
    public final EObject entryRuleTree() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTree = null;


        try {
            // InternalAst.g:445:45: (iv_ruleTree= ruleTree EOF )
            // InternalAst.g:446:2: iv_ruleTree= ruleTree EOF
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
    // InternalAst.g:452:1: ruleTree returns [EObject current=null] : (otherlv_0= 'TREE' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleTree() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalAst.g:458:2: ( (otherlv_0= 'TREE' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalAst.g:459:2: (otherlv_0= 'TREE' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalAst.g:459:2: (otherlv_0= 'TREE' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalAst.g:460:3: otherlv_0= 'TREE' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getTreeAccess().getTREEKeyword_0());
            		
            // InternalAst.g:464:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAst.g:465:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAst.g:465:4: (lv_name_1_0= RULE_ID )
            // InternalAst.g:466:5: lv_name_1_0= RULE_ID
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
    // InternalAst.g:486:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalAst.g:486:47: (iv_ruleImport= ruleImport EOF )
            // InternalAst.g:487:2: iv_ruleImport= ruleImport EOF
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
    // InternalAst.g:493:1: ruleImport returns [EObject current=null] : (otherlv_0= 'IMPORT' otherlv_1= '{' ( (lv_code_2_0= ruleCodeBlock ) ) otherlv_3= '}' ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_code_2_0 = null;



        	enterRule();

        try {
            // InternalAst.g:499:2: ( (otherlv_0= 'IMPORT' otherlv_1= '{' ( (lv_code_2_0= ruleCodeBlock ) ) otherlv_3= '}' ) )
            // InternalAst.g:500:2: (otherlv_0= 'IMPORT' otherlv_1= '{' ( (lv_code_2_0= ruleCodeBlock ) ) otherlv_3= '}' )
            {
            // InternalAst.g:500:2: (otherlv_0= 'IMPORT' otherlv_1= '{' ( (lv_code_2_0= ruleCodeBlock ) ) otherlv_3= '}' )
            // InternalAst.g:501:3: otherlv_0= 'IMPORT' otherlv_1= '{' ( (lv_code_2_0= ruleCodeBlock ) ) otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getImportAccess().getIMPORTKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getImportAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalAst.g:509:3: ( (lv_code_2_0= ruleCodeBlock ) )
            // InternalAst.g:510:4: (lv_code_2_0= ruleCodeBlock )
            {
            // InternalAst.g:510:4: (lv_code_2_0= ruleCodeBlock )
            // InternalAst.g:511:5: lv_code_2_0= ruleCodeBlock
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
    // InternalAst.g:536:1: entryRuleExport returns [EObject current=null] : iv_ruleExport= ruleExport EOF ;
    public final EObject entryRuleExport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExport = null;


        try {
            // InternalAst.g:536:47: (iv_ruleExport= ruleExport EOF )
            // InternalAst.g:537:2: iv_ruleExport= ruleExport EOF
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
    // InternalAst.g:543:1: ruleExport returns [EObject current=null] : (otherlv_0= 'EXPORT' otherlv_1= '{' ( (lv_code_2_0= ruleCodeBlock ) ) otherlv_3= '}' ) ;
    public final EObject ruleExport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_code_2_0 = null;



        	enterRule();

        try {
            // InternalAst.g:549:2: ( (otherlv_0= 'EXPORT' otherlv_1= '{' ( (lv_code_2_0= ruleCodeBlock ) ) otherlv_3= '}' ) )
            // InternalAst.g:550:2: (otherlv_0= 'EXPORT' otherlv_1= '{' ( (lv_code_2_0= ruleCodeBlock ) ) otherlv_3= '}' )
            {
            // InternalAst.g:550:2: (otherlv_0= 'EXPORT' otherlv_1= '{' ( (lv_code_2_0= ruleCodeBlock ) ) otherlv_3= '}' )
            // InternalAst.g:551:3: otherlv_0= 'EXPORT' otherlv_1= '{' ( (lv_code_2_0= ruleCodeBlock ) ) otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getExportAccess().getEXPORTKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getExportAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalAst.g:559:3: ( (lv_code_2_0= ruleCodeBlock ) )
            // InternalAst.g:560:4: (lv_code_2_0= ruleCodeBlock )
            {
            // InternalAst.g:560:4: (lv_code_2_0= ruleCodeBlock )
            // InternalAst.g:561:5: lv_code_2_0= ruleCodeBlock
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
    // InternalAst.g:586:1: entryRuleGlobal returns [EObject current=null] : iv_ruleGlobal= ruleGlobal EOF ;
    public final EObject entryRuleGlobal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGlobal = null;


        try {
            // InternalAst.g:586:47: (iv_ruleGlobal= ruleGlobal EOF )
            // InternalAst.g:587:2: iv_ruleGlobal= ruleGlobal EOF
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
    // InternalAst.g:593:1: ruleGlobal returns [EObject current=null] : (otherlv_0= 'GLOBAL' otherlv_1= '{' ( (lv_code_2_0= ruleCodeBlock ) ) otherlv_3= '}' ) ;
    public final EObject ruleGlobal() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_code_2_0 = null;



        	enterRule();

        try {
            // InternalAst.g:599:2: ( (otherlv_0= 'GLOBAL' otherlv_1= '{' ( (lv_code_2_0= ruleCodeBlock ) ) otherlv_3= '}' ) )
            // InternalAst.g:600:2: (otherlv_0= 'GLOBAL' otherlv_1= '{' ( (lv_code_2_0= ruleCodeBlock ) ) otherlv_3= '}' )
            {
            // InternalAst.g:600:2: (otherlv_0= 'GLOBAL' otherlv_1= '{' ( (lv_code_2_0= ruleCodeBlock ) ) otherlv_3= '}' )
            // InternalAst.g:601:3: otherlv_0= 'GLOBAL' otherlv_1= '{' ( (lv_code_2_0= ruleCodeBlock ) ) otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getGlobalAccess().getGLOBALKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getGlobalAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalAst.g:609:3: ( (lv_code_2_0= ruleCodeBlock ) )
            // InternalAst.g:610:4: (lv_code_2_0= ruleCodeBlock )
            {
            // InternalAst.g:610:4: (lv_code_2_0= ruleCodeBlock )
            // InternalAst.g:611:5: lv_code_2_0= ruleCodeBlock
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
    // InternalAst.g:636:1: entryRuleLocal returns [EObject current=null] : iv_ruleLocal= ruleLocal EOF ;
    public final EObject entryRuleLocal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocal = null;


        try {
            // InternalAst.g:636:46: (iv_ruleLocal= ruleLocal EOF )
            // InternalAst.g:637:2: iv_ruleLocal= ruleLocal EOF
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
    // InternalAst.g:643:1: ruleLocal returns [EObject current=null] : (otherlv_0= 'LOCAL' otherlv_1= '{' ( (lv_code_2_0= ruleCodeBlock ) ) otherlv_3= '}' ) ;
    public final EObject ruleLocal() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_code_2_0 = null;



        	enterRule();

        try {
            // InternalAst.g:649:2: ( (otherlv_0= 'LOCAL' otherlv_1= '{' ( (lv_code_2_0= ruleCodeBlock ) ) otherlv_3= '}' ) )
            // InternalAst.g:650:2: (otherlv_0= 'LOCAL' otherlv_1= '{' ( (lv_code_2_0= ruleCodeBlock ) ) otherlv_3= '}' )
            {
            // InternalAst.g:650:2: (otherlv_0= 'LOCAL' otherlv_1= '{' ( (lv_code_2_0= ruleCodeBlock ) ) otherlv_3= '}' )
            // InternalAst.g:651:3: otherlv_0= 'LOCAL' otherlv_1= '{' ( (lv_code_2_0= ruleCodeBlock ) ) otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getLocalAccess().getLOCALKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getLocalAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalAst.g:659:3: ( (lv_code_2_0= ruleCodeBlock ) )
            // InternalAst.g:660:4: (lv_code_2_0= ruleCodeBlock )
            {
            // InternalAst.g:660:4: (lv_code_2_0= ruleCodeBlock )
            // InternalAst.g:661:5: lv_code_2_0= ruleCodeBlock
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
    // InternalAst.g:686:1: entryRuleBegin returns [EObject current=null] : iv_ruleBegin= ruleBegin EOF ;
    public final EObject entryRuleBegin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBegin = null;


        try {
            // InternalAst.g:686:46: (iv_ruleBegin= ruleBegin EOF )
            // InternalAst.g:687:2: iv_ruleBegin= ruleBegin EOF
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
    // InternalAst.g:693:1: ruleBegin returns [EObject current=null] : (otherlv_0= 'BEGIN' otherlv_1= '{' ( (lv_code_2_0= ruleCodeBlock ) ) otherlv_3= '}' ) ;
    public final EObject ruleBegin() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_code_2_0 = null;



        	enterRule();

        try {
            // InternalAst.g:699:2: ( (otherlv_0= 'BEGIN' otherlv_1= '{' ( (lv_code_2_0= ruleCodeBlock ) ) otherlv_3= '}' ) )
            // InternalAst.g:700:2: (otherlv_0= 'BEGIN' otherlv_1= '{' ( (lv_code_2_0= ruleCodeBlock ) ) otherlv_3= '}' )
            {
            // InternalAst.g:700:2: (otherlv_0= 'BEGIN' otherlv_1= '{' ( (lv_code_2_0= ruleCodeBlock ) ) otherlv_3= '}' )
            // InternalAst.g:701:3: otherlv_0= 'BEGIN' otherlv_1= '{' ( (lv_code_2_0= ruleCodeBlock ) ) otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getBeginAccess().getBEGINKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getBeginAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalAst.g:709:3: ( (lv_code_2_0= ruleCodeBlock ) )
            // InternalAst.g:710:4: (lv_code_2_0= ruleCodeBlock )
            {
            // InternalAst.g:710:4: (lv_code_2_0= ruleCodeBlock )
            // InternalAst.g:711:5: lv_code_2_0= ruleCodeBlock
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
    // InternalAst.g:736:1: entryRuleClose returns [EObject current=null] : iv_ruleClose= ruleClose EOF ;
    public final EObject entryRuleClose() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClose = null;


        try {
            // InternalAst.g:736:46: (iv_ruleClose= ruleClose EOF )
            // InternalAst.g:737:2: iv_ruleClose= ruleClose EOF
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
    // InternalAst.g:743:1: ruleClose returns [EObject current=null] : (otherlv_0= 'CLOSE' otherlv_1= '{' ( (lv_code_2_0= ruleCodeBlock ) ) otherlv_3= '}' ) ;
    public final EObject ruleClose() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_code_2_0 = null;



        	enterRule();

        try {
            // InternalAst.g:749:2: ( (otherlv_0= 'CLOSE' otherlv_1= '{' ( (lv_code_2_0= ruleCodeBlock ) ) otherlv_3= '}' ) )
            // InternalAst.g:750:2: (otherlv_0= 'CLOSE' otherlv_1= '{' ( (lv_code_2_0= ruleCodeBlock ) ) otherlv_3= '}' )
            {
            // InternalAst.g:750:2: (otherlv_0= 'CLOSE' otherlv_1= '{' ( (lv_code_2_0= ruleCodeBlock ) ) otherlv_3= '}' )
            // InternalAst.g:751:3: otherlv_0= 'CLOSE' otherlv_1= '{' ( (lv_code_2_0= ruleCodeBlock ) ) otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getCloseAccess().getCLOSEKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getCloseAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalAst.g:759:3: ( (lv_code_2_0= ruleCodeBlock ) )
            // InternalAst.g:760:4: (lv_code_2_0= ruleCodeBlock )
            {
            // InternalAst.g:760:4: (lv_code_2_0= ruleCodeBlock )
            // InternalAst.g:761:5: lv_code_2_0= ruleCodeBlock
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
    // InternalAst.g:786:1: entryRuleProperties returns [EObject current=null] : iv_ruleProperties= ruleProperties EOF ;
    public final EObject entryRuleProperties() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperties = null;


        try {
            // InternalAst.g:786:51: (iv_ruleProperties= ruleProperties EOF )
            // InternalAst.g:787:2: iv_ruleProperties= ruleProperties EOF
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
    // InternalAst.g:793:1: ruleProperties returns [EObject current=null] : (otherlv_0= 'PROPERTY' ( (lv_property_1_0= rulePropertyList ) ) ) ;
    public final EObject ruleProperties() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_property_1_0 = null;



        	enterRule();

        try {
            // InternalAst.g:799:2: ( (otherlv_0= 'PROPERTY' ( (lv_property_1_0= rulePropertyList ) ) ) )
            // InternalAst.g:800:2: (otherlv_0= 'PROPERTY' ( (lv_property_1_0= rulePropertyList ) ) )
            {
            // InternalAst.g:800:2: (otherlv_0= 'PROPERTY' ( (lv_property_1_0= rulePropertyList ) ) )
            // InternalAst.g:801:3: otherlv_0= 'PROPERTY' ( (lv_property_1_0= rulePropertyList ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getPropertiesAccess().getPROPERTYKeyword_0());
            		
            // InternalAst.g:805:3: ( (lv_property_1_0= rulePropertyList ) )
            // InternalAst.g:806:4: (lv_property_1_0= rulePropertyList )
            {
            // InternalAst.g:806:4: (lv_property_1_0= rulePropertyList )
            // InternalAst.g:807:5: lv_property_1_0= rulePropertyList
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
    // InternalAst.g:828:1: entryRulePropertyList returns [EObject current=null] : iv_rulePropertyList= rulePropertyList EOF ;
    public final EObject entryRulePropertyList() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyList = null;


        try {
            // InternalAst.g:828:53: (iv_rulePropertyList= rulePropertyList EOF )
            // InternalAst.g:829:2: iv_rulePropertyList= rulePropertyList EOF
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
    // InternalAst.g:835:1: rulePropertyList returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => ( (lv_props_1_0= 'INPUT' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_2_0= 'OUTPUT' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_3_0= 'SYNTHESIZED' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_4_0= 'INHERITED' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_5_0= 'THREAD' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_6_0= 'REVERSE' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_7_0= 'IGNORE' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_8_0= 'VIRTUAL' ) ) ) ) ) )* ) ) ) ;
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
            // InternalAst.g:841:2: ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_props_1_0= 'INPUT' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_2_0= 'OUTPUT' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_3_0= 'SYNTHESIZED' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_4_0= 'INHERITED' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_5_0= 'THREAD' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_6_0= 'REVERSE' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_7_0= 'IGNORE' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_8_0= 'VIRTUAL' ) ) ) ) ) )* ) ) ) )
            // InternalAst.g:842:2: ( ( ( ( ({...}? => ( ({...}? => ( (lv_props_1_0= 'INPUT' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_2_0= 'OUTPUT' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_3_0= 'SYNTHESIZED' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_4_0= 'INHERITED' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_5_0= 'THREAD' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_6_0= 'REVERSE' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_7_0= 'IGNORE' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_8_0= 'VIRTUAL' ) ) ) ) ) )* ) ) )
            {
            // InternalAst.g:842:2: ( ( ( ( ({...}? => ( ({...}? => ( (lv_props_1_0= 'INPUT' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_2_0= 'OUTPUT' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_3_0= 'SYNTHESIZED' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_4_0= 'INHERITED' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_5_0= 'THREAD' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_6_0= 'REVERSE' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_7_0= 'IGNORE' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_8_0= 'VIRTUAL' ) ) ) ) ) )* ) ) )
            // InternalAst.g:843:3: ( ( ( ({...}? => ( ({...}? => ( (lv_props_1_0= 'INPUT' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_2_0= 'OUTPUT' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_3_0= 'SYNTHESIZED' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_4_0= 'INHERITED' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_5_0= 'THREAD' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_6_0= 'REVERSE' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_7_0= 'IGNORE' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_8_0= 'VIRTUAL' ) ) ) ) ) )* ) )
            {
            // InternalAst.g:843:3: ( ( ( ({...}? => ( ({...}? => ( (lv_props_1_0= 'INPUT' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_2_0= 'OUTPUT' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_3_0= 'SYNTHESIZED' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_4_0= 'INHERITED' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_5_0= 'THREAD' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_6_0= 'REVERSE' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_7_0= 'IGNORE' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_8_0= 'VIRTUAL' ) ) ) ) ) )* ) )
            // InternalAst.g:844:4: ( ( ({...}? => ( ({...}? => ( (lv_props_1_0= 'INPUT' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_2_0= 'OUTPUT' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_3_0= 'SYNTHESIZED' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_4_0= 'INHERITED' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_5_0= 'THREAD' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_6_0= 'REVERSE' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_7_0= 'IGNORE' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_8_0= 'VIRTUAL' ) ) ) ) ) )* )
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getPropertyListAccess().getUnorderedGroup());
            			
            // InternalAst.g:847:4: ( ( ({...}? => ( ({...}? => ( (lv_props_1_0= 'INPUT' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_2_0= 'OUTPUT' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_3_0= 'SYNTHESIZED' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_4_0= 'INHERITED' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_5_0= 'THREAD' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_6_0= 'REVERSE' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_7_0= 'IGNORE' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_8_0= 'VIRTUAL' ) ) ) ) ) )* )
            // InternalAst.g:848:5: ( ({...}? => ( ({...}? => ( (lv_props_1_0= 'INPUT' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_2_0= 'OUTPUT' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_3_0= 'SYNTHESIZED' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_4_0= 'INHERITED' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_5_0= 'THREAD' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_6_0= 'REVERSE' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_7_0= 'IGNORE' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_8_0= 'VIRTUAL' ) ) ) ) ) )*
            {
            // InternalAst.g:848:5: ( ({...}? => ( ({...}? => ( (lv_props_1_0= 'INPUT' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_2_0= 'OUTPUT' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_3_0= 'SYNTHESIZED' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_4_0= 'INHERITED' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_5_0= 'THREAD' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_6_0= 'REVERSE' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_7_0= 'IGNORE' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_8_0= 'VIRTUAL' ) ) ) ) ) )*
            loop2:
            do {
                int alt2=9;
                alt2 = dfa2.predict(input);
                switch (alt2) {
            	case 1 :
            	    // InternalAst.g:849:3: ({...}? => ( ({...}? => ( (lv_props_1_0= 'INPUT' ) ) ) ) )
            	    {
            	    // InternalAst.g:849:3: ({...}? => ( ({...}? => ( (lv_props_1_0= 'INPUT' ) ) ) ) )
            	    // InternalAst.g:850:4: {...}? => ( ({...}? => ( (lv_props_1_0= 'INPUT' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyListAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "rulePropertyList", "getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyListAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalAst.g:850:106: ( ({...}? => ( (lv_props_1_0= 'INPUT' ) ) ) )
            	    // InternalAst.g:851:5: ({...}? => ( (lv_props_1_0= 'INPUT' ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getPropertyListAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalAst.g:854:8: ({...}? => ( (lv_props_1_0= 'INPUT' ) ) )
            	    // InternalAst.g:854:9: {...}? => ( (lv_props_1_0= 'INPUT' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePropertyList", "true");
            	    }
            	    // InternalAst.g:854:18: ( (lv_props_1_0= 'INPUT' ) )
            	    // InternalAst.g:854:19: (lv_props_1_0= 'INPUT' )
            	    {
            	    // InternalAst.g:854:19: (lv_props_1_0= 'INPUT' )
            	    // InternalAst.g:855:9: lv_props_1_0= 'INPUT'
            	    {
            	    lv_props_1_0=(Token)match(input,22,FOLLOW_9); 

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
            	    // InternalAst.g:872:3: ({...}? => ( ({...}? => ( (lv_props_2_0= 'OUTPUT' ) ) ) ) )
            	    {
            	    // InternalAst.g:872:3: ({...}? => ( ({...}? => ( (lv_props_2_0= 'OUTPUT' ) ) ) ) )
            	    // InternalAst.g:873:4: {...}? => ( ({...}? => ( (lv_props_2_0= 'OUTPUT' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyListAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "rulePropertyList", "getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyListAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalAst.g:873:106: ( ({...}? => ( (lv_props_2_0= 'OUTPUT' ) ) ) )
            	    // InternalAst.g:874:5: ({...}? => ( (lv_props_2_0= 'OUTPUT' ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getPropertyListAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalAst.g:877:8: ({...}? => ( (lv_props_2_0= 'OUTPUT' ) ) )
            	    // InternalAst.g:877:9: {...}? => ( (lv_props_2_0= 'OUTPUT' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePropertyList", "true");
            	    }
            	    // InternalAst.g:877:18: ( (lv_props_2_0= 'OUTPUT' ) )
            	    // InternalAst.g:877:19: (lv_props_2_0= 'OUTPUT' )
            	    {
            	    // InternalAst.g:877:19: (lv_props_2_0= 'OUTPUT' )
            	    // InternalAst.g:878:9: lv_props_2_0= 'OUTPUT'
            	    {
            	    lv_props_2_0=(Token)match(input,23,FOLLOW_9); 

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
            	    // InternalAst.g:895:3: ({...}? => ( ({...}? => ( (lv_props_3_0= 'SYNTHESIZED' ) ) ) ) )
            	    {
            	    // InternalAst.g:895:3: ({...}? => ( ({...}? => ( (lv_props_3_0= 'SYNTHESIZED' ) ) ) ) )
            	    // InternalAst.g:896:4: {...}? => ( ({...}? => ( (lv_props_3_0= 'SYNTHESIZED' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyListAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "rulePropertyList", "getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyListAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalAst.g:896:106: ( ({...}? => ( (lv_props_3_0= 'SYNTHESIZED' ) ) ) )
            	    // InternalAst.g:897:5: ({...}? => ( (lv_props_3_0= 'SYNTHESIZED' ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getPropertyListAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalAst.g:900:8: ({...}? => ( (lv_props_3_0= 'SYNTHESIZED' ) ) )
            	    // InternalAst.g:900:9: {...}? => ( (lv_props_3_0= 'SYNTHESIZED' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePropertyList", "true");
            	    }
            	    // InternalAst.g:900:18: ( (lv_props_3_0= 'SYNTHESIZED' ) )
            	    // InternalAst.g:900:19: (lv_props_3_0= 'SYNTHESIZED' )
            	    {
            	    // InternalAst.g:900:19: (lv_props_3_0= 'SYNTHESIZED' )
            	    // InternalAst.g:901:9: lv_props_3_0= 'SYNTHESIZED'
            	    {
            	    lv_props_3_0=(Token)match(input,24,FOLLOW_9); 

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
            	    // InternalAst.g:918:3: ({...}? => ( ({...}? => ( (lv_props_4_0= 'INHERITED' ) ) ) ) )
            	    {
            	    // InternalAst.g:918:3: ({...}? => ( ({...}? => ( (lv_props_4_0= 'INHERITED' ) ) ) ) )
            	    // InternalAst.g:919:4: {...}? => ( ({...}? => ( (lv_props_4_0= 'INHERITED' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyListAccess().getUnorderedGroup(), 3) ) {
            	        throw new FailedPredicateException(input, "rulePropertyList", "getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyListAccess().getUnorderedGroup(), 3)");
            	    }
            	    // InternalAst.g:919:106: ( ({...}? => ( (lv_props_4_0= 'INHERITED' ) ) ) )
            	    // InternalAst.g:920:5: ({...}? => ( (lv_props_4_0= 'INHERITED' ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getPropertyListAccess().getUnorderedGroup(), 3);
            	    				
            	    // InternalAst.g:923:8: ({...}? => ( (lv_props_4_0= 'INHERITED' ) ) )
            	    // InternalAst.g:923:9: {...}? => ( (lv_props_4_0= 'INHERITED' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePropertyList", "true");
            	    }
            	    // InternalAst.g:923:18: ( (lv_props_4_0= 'INHERITED' ) )
            	    // InternalAst.g:923:19: (lv_props_4_0= 'INHERITED' )
            	    {
            	    // InternalAst.g:923:19: (lv_props_4_0= 'INHERITED' )
            	    // InternalAst.g:924:9: lv_props_4_0= 'INHERITED'
            	    {
            	    lv_props_4_0=(Token)match(input,25,FOLLOW_9); 

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
            	    // InternalAst.g:941:3: ({...}? => ( ({...}? => ( (lv_props_5_0= 'THREAD' ) ) ) ) )
            	    {
            	    // InternalAst.g:941:3: ({...}? => ( ({...}? => ( (lv_props_5_0= 'THREAD' ) ) ) ) )
            	    // InternalAst.g:942:4: {...}? => ( ({...}? => ( (lv_props_5_0= 'THREAD' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyListAccess().getUnorderedGroup(), 4) ) {
            	        throw new FailedPredicateException(input, "rulePropertyList", "getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyListAccess().getUnorderedGroup(), 4)");
            	    }
            	    // InternalAst.g:942:106: ( ({...}? => ( (lv_props_5_0= 'THREAD' ) ) ) )
            	    // InternalAst.g:943:5: ({...}? => ( (lv_props_5_0= 'THREAD' ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getPropertyListAccess().getUnorderedGroup(), 4);
            	    				
            	    // InternalAst.g:946:8: ({...}? => ( (lv_props_5_0= 'THREAD' ) ) )
            	    // InternalAst.g:946:9: {...}? => ( (lv_props_5_0= 'THREAD' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePropertyList", "true");
            	    }
            	    // InternalAst.g:946:18: ( (lv_props_5_0= 'THREAD' ) )
            	    // InternalAst.g:946:19: (lv_props_5_0= 'THREAD' )
            	    {
            	    // InternalAst.g:946:19: (lv_props_5_0= 'THREAD' )
            	    // InternalAst.g:947:9: lv_props_5_0= 'THREAD'
            	    {
            	    lv_props_5_0=(Token)match(input,26,FOLLOW_9); 

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
            	    // InternalAst.g:964:3: ({...}? => ( ({...}? => ( (lv_props_6_0= 'REVERSE' ) ) ) ) )
            	    {
            	    // InternalAst.g:964:3: ({...}? => ( ({...}? => ( (lv_props_6_0= 'REVERSE' ) ) ) ) )
            	    // InternalAst.g:965:4: {...}? => ( ({...}? => ( (lv_props_6_0= 'REVERSE' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyListAccess().getUnorderedGroup(), 5) ) {
            	        throw new FailedPredicateException(input, "rulePropertyList", "getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyListAccess().getUnorderedGroup(), 5)");
            	    }
            	    // InternalAst.g:965:106: ( ({...}? => ( (lv_props_6_0= 'REVERSE' ) ) ) )
            	    // InternalAst.g:966:5: ({...}? => ( (lv_props_6_0= 'REVERSE' ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getPropertyListAccess().getUnorderedGroup(), 5);
            	    				
            	    // InternalAst.g:969:8: ({...}? => ( (lv_props_6_0= 'REVERSE' ) ) )
            	    // InternalAst.g:969:9: {...}? => ( (lv_props_6_0= 'REVERSE' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePropertyList", "true");
            	    }
            	    // InternalAst.g:969:18: ( (lv_props_6_0= 'REVERSE' ) )
            	    // InternalAst.g:969:19: (lv_props_6_0= 'REVERSE' )
            	    {
            	    // InternalAst.g:969:19: (lv_props_6_0= 'REVERSE' )
            	    // InternalAst.g:970:9: lv_props_6_0= 'REVERSE'
            	    {
            	    lv_props_6_0=(Token)match(input,27,FOLLOW_9); 

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
            	    // InternalAst.g:987:3: ({...}? => ( ({...}? => ( (lv_props_7_0= 'IGNORE' ) ) ) ) )
            	    {
            	    // InternalAst.g:987:3: ({...}? => ( ({...}? => ( (lv_props_7_0= 'IGNORE' ) ) ) ) )
            	    // InternalAst.g:988:4: {...}? => ( ({...}? => ( (lv_props_7_0= 'IGNORE' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyListAccess().getUnorderedGroup(), 6) ) {
            	        throw new FailedPredicateException(input, "rulePropertyList", "getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyListAccess().getUnorderedGroup(), 6)");
            	    }
            	    // InternalAst.g:988:106: ( ({...}? => ( (lv_props_7_0= 'IGNORE' ) ) ) )
            	    // InternalAst.g:989:5: ({...}? => ( (lv_props_7_0= 'IGNORE' ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getPropertyListAccess().getUnorderedGroup(), 6);
            	    				
            	    // InternalAst.g:992:8: ({...}? => ( (lv_props_7_0= 'IGNORE' ) ) )
            	    // InternalAst.g:992:9: {...}? => ( (lv_props_7_0= 'IGNORE' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePropertyList", "true");
            	    }
            	    // InternalAst.g:992:18: ( (lv_props_7_0= 'IGNORE' ) )
            	    // InternalAst.g:992:19: (lv_props_7_0= 'IGNORE' )
            	    {
            	    // InternalAst.g:992:19: (lv_props_7_0= 'IGNORE' )
            	    // InternalAst.g:993:9: lv_props_7_0= 'IGNORE'
            	    {
            	    lv_props_7_0=(Token)match(input,28,FOLLOW_9); 

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
            	    // InternalAst.g:1010:3: ({...}? => ( ({...}? => ( (lv_props_8_0= 'VIRTUAL' ) ) ) ) )
            	    {
            	    // InternalAst.g:1010:3: ({...}? => ( ({...}? => ( (lv_props_8_0= 'VIRTUAL' ) ) ) ) )
            	    // InternalAst.g:1011:4: {...}? => ( ({...}? => ( (lv_props_8_0= 'VIRTUAL' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyListAccess().getUnorderedGroup(), 7) ) {
            	        throw new FailedPredicateException(input, "rulePropertyList", "getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyListAccess().getUnorderedGroup(), 7)");
            	    }
            	    // InternalAst.g:1011:106: ( ({...}? => ( (lv_props_8_0= 'VIRTUAL' ) ) ) )
            	    // InternalAst.g:1012:5: ({...}? => ( (lv_props_8_0= 'VIRTUAL' ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getPropertyListAccess().getUnorderedGroup(), 7);
            	    				
            	    // InternalAst.g:1015:8: ({...}? => ( (lv_props_8_0= 'VIRTUAL' ) ) )
            	    // InternalAst.g:1015:9: {...}? => ( (lv_props_8_0= 'VIRTUAL' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePropertyList", "true");
            	    }
            	    // InternalAst.g:1015:18: ( (lv_props_8_0= 'VIRTUAL' ) )
            	    // InternalAst.g:1015:19: (lv_props_8_0= 'VIRTUAL' )
            	    {
            	    // InternalAst.g:1015:19: (lv_props_8_0= 'VIRTUAL' )
            	    // InternalAst.g:1016:9: lv_props_8_0= 'VIRTUAL'
            	    {
            	    lv_props_8_0=(Token)match(input,29,FOLLOW_9); 

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
            	    break loop2;
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


    // $ANTLR start "entryRuleDeclare"
    // InternalAst.g:1043:1: entryRuleDeclare returns [EObject current=null] : iv_ruleDeclare= ruleDeclare EOF ;
    public final EObject entryRuleDeclare() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclare = null;


        try {
            // InternalAst.g:1043:48: (iv_ruleDeclare= ruleDeclare EOF )
            // InternalAst.g:1044:2: iv_ruleDeclare= ruleDeclare EOF
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
    // InternalAst.g:1050:1: ruleDeclare returns [EObject current=null] : (otherlv_0= 'DECLARE' ( (lv_nodes_1_0= ruleDeclareNode ) )* ) ;
    public final EObject ruleDeclare() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_nodes_1_0 = null;



        	enterRule();

        try {
            // InternalAst.g:1056:2: ( (otherlv_0= 'DECLARE' ( (lv_nodes_1_0= ruleDeclareNode ) )* ) )
            // InternalAst.g:1057:2: (otherlv_0= 'DECLARE' ( (lv_nodes_1_0= ruleDeclareNode ) )* )
            {
            // InternalAst.g:1057:2: (otherlv_0= 'DECLARE' ( (lv_nodes_1_0= ruleDeclareNode ) )* )
            // InternalAst.g:1058:3: otherlv_0= 'DECLARE' ( (lv_nodes_1_0= ruleDeclareNode ) )*
            {
            otherlv_0=(Token)match(input,30,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getDeclareAccess().getDECLAREKeyword_0());
            		
            // InternalAst.g:1062:3: ( (lv_nodes_1_0= ruleDeclareNode ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=RULE_ID && LA3_0<=RULE_STRING)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalAst.g:1063:4: (lv_nodes_1_0= ruleDeclareNode )
            	    {
            	    // InternalAst.g:1063:4: (lv_nodes_1_0= ruleDeclareNode )
            	    // InternalAst.g:1064:5: lv_nodes_1_0= ruleDeclareNode
            	    {

            	    					newCompositeNode(grammarAccess.getDeclareAccess().getNodesDeclareNodeParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_10);
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
    // $ANTLR end "ruleDeclare"


    // $ANTLR start "entryRuleDeclareNode"
    // InternalAst.g:1085:1: entryRuleDeclareNode returns [EObject current=null] : iv_ruleDeclareNode= ruleDeclareNode EOF ;
    public final EObject entryRuleDeclareNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclareNode = null;


        try {
            // InternalAst.g:1085:52: (iv_ruleDeclareNode= ruleDeclareNode EOF )
            // InternalAst.g:1086:2: iv_ruleDeclareNode= ruleDeclareNode EOF
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
    // InternalAst.g:1092:1: ruleDeclareNode returns [EObject current=null] : ( ( (lv_names_0_0= ruleNodeName ) )+ ( ( (lv_type_1_1= '=' | lv_type_1_2= ':' ) ) ) ( (lv_part_2_0= ruleNodePart ) )* otherlv_3= '.' ) ;
    public final EObject ruleDeclareNode() throws RecognitionException {
        EObject current = null;

        Token lv_type_1_1=null;
        Token lv_type_1_2=null;
        Token otherlv_3=null;
        EObject lv_names_0_0 = null;

        EObject lv_part_2_0 = null;



        	enterRule();

        try {
            // InternalAst.g:1098:2: ( ( ( (lv_names_0_0= ruleNodeName ) )+ ( ( (lv_type_1_1= '=' | lv_type_1_2= ':' ) ) ) ( (lv_part_2_0= ruleNodePart ) )* otherlv_3= '.' ) )
            // InternalAst.g:1099:2: ( ( (lv_names_0_0= ruleNodeName ) )+ ( ( (lv_type_1_1= '=' | lv_type_1_2= ':' ) ) ) ( (lv_part_2_0= ruleNodePart ) )* otherlv_3= '.' )
            {
            // InternalAst.g:1099:2: ( ( (lv_names_0_0= ruleNodeName ) )+ ( ( (lv_type_1_1= '=' | lv_type_1_2= ':' ) ) ) ( (lv_part_2_0= ruleNodePart ) )* otherlv_3= '.' )
            // InternalAst.g:1100:3: ( (lv_names_0_0= ruleNodeName ) )+ ( ( (lv_type_1_1= '=' | lv_type_1_2= ':' ) ) ) ( (lv_part_2_0= ruleNodePart ) )* otherlv_3= '.'
            {
            // InternalAst.g:1100:3: ( (lv_names_0_0= ruleNodeName ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=RULE_ID && LA4_0<=RULE_STRING)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalAst.g:1101:4: (lv_names_0_0= ruleNodeName )
            	    {
            	    // InternalAst.g:1101:4: (lv_names_0_0= ruleNodeName )
            	    // InternalAst.g:1102:5: lv_names_0_0= ruleNodeName
            	    {

            	    					newCompositeNode(grammarAccess.getDeclareNodeAccess().getNamesNodeNameParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_11);
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
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);

            // InternalAst.g:1119:3: ( ( (lv_type_1_1= '=' | lv_type_1_2= ':' ) ) )
            // InternalAst.g:1120:4: ( (lv_type_1_1= '=' | lv_type_1_2= ':' ) )
            {
            // InternalAst.g:1120:4: ( (lv_type_1_1= '=' | lv_type_1_2= ':' ) )
            // InternalAst.g:1121:5: (lv_type_1_1= '=' | lv_type_1_2= ':' )
            {
            // InternalAst.g:1121:5: (lv_type_1_1= '=' | lv_type_1_2= ':' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==31) ) {
                alt5=1;
            }
            else if ( (LA5_0==32) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalAst.g:1122:6: lv_type_1_1= '='
                    {
                    lv_type_1_1=(Token)match(input,31,FOLLOW_12); 

                    						newLeafNode(lv_type_1_1, grammarAccess.getDeclareNodeAccess().getTypeEqualsSignKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDeclareNodeRule());
                    						}
                    						setWithLastConsumed(current, "type", lv_type_1_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalAst.g:1133:6: lv_type_1_2= ':'
                    {
                    lv_type_1_2=(Token)match(input,32,FOLLOW_12); 

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

            // InternalAst.g:1146:3: ( (lv_part_2_0= ruleNodePart ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID||LA6_0==38) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalAst.g:1147:4: (lv_part_2_0= ruleNodePart )
            	    {
            	    // InternalAst.g:1147:4: (lv_part_2_0= ruleNodePart )
            	    // InternalAst.g:1148:5: lv_part_2_0= ruleNodePart
            	    {

            	    					newCompositeNode(grammarAccess.getDeclareNodeAccess().getPartNodePartParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_12);
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
            	    break loop6;
                }
            } while (true);

            otherlv_3=(Token)match(input,33,FOLLOW_2); 

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
    // InternalAst.g:1173:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // InternalAst.g:1173:45: (iv_ruleRule= ruleRule EOF )
            // InternalAst.g:1174:2: iv_ruleRule= ruleRule EOF
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
    // InternalAst.g:1180:1: ruleRule returns [EObject current=null] : (otherlv_0= 'RULE' ( (lv_nodes_1_0= ruleRootNode ) )* ) ;
    public final EObject ruleRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_nodes_1_0 = null;



        	enterRule();

        try {
            // InternalAst.g:1186:2: ( (otherlv_0= 'RULE' ( (lv_nodes_1_0= ruleRootNode ) )* ) )
            // InternalAst.g:1187:2: (otherlv_0= 'RULE' ( (lv_nodes_1_0= ruleRootNode ) )* )
            {
            // InternalAst.g:1187:2: (otherlv_0= 'RULE' ( (lv_nodes_1_0= ruleRootNode ) )* )
            // InternalAst.g:1188:3: otherlv_0= 'RULE' ( (lv_nodes_1_0= ruleRootNode ) )*
            {
            otherlv_0=(Token)match(input,34,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getRuleAccess().getRULEKeyword_0());
            		
            // InternalAst.g:1192:3: ( (lv_nodes_1_0= ruleRootNode ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=RULE_ID && LA7_0<=RULE_STRING)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalAst.g:1193:4: (lv_nodes_1_0= ruleRootNode )
            	    {
            	    // InternalAst.g:1193:4: (lv_nodes_1_0= ruleRootNode )
            	    // InternalAst.g:1194:5: lv_nodes_1_0= ruleRootNode
            	    {

            	    					newCompositeNode(grammarAccess.getRuleAccess().getNodesRootNodeParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_10);
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


    // $ANTLR start "entryRuleRootNode"
    // InternalAst.g:1215:1: entryRuleRootNode returns [EObject current=null] : iv_ruleRootNode= ruleRootNode EOF ;
    public final EObject entryRuleRootNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRootNode = null;


        try {
            // InternalAst.g:1215:49: (iv_ruleRootNode= ruleRootNode EOF )
            // InternalAst.g:1216:2: iv_ruleRootNode= ruleRootNode EOF
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
    // InternalAst.g:1222:1: ruleRootNode returns [EObject current=null] : ( ( (lv_name_0_0= ruleNodeName ) ) ( (lv_baseTypes_1_0= ruleBaseTypes ) )? ( (lv_type_2_0= ruleNodeType ) )? ( (lv_part_3_0= ruleNodePart ) )* ( (lv_extension_4_0= ruleExtensions ) )? otherlv_5= '.' ) ;
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
            // InternalAst.g:1228:2: ( ( ( (lv_name_0_0= ruleNodeName ) ) ( (lv_baseTypes_1_0= ruleBaseTypes ) )? ( (lv_type_2_0= ruleNodeType ) )? ( (lv_part_3_0= ruleNodePart ) )* ( (lv_extension_4_0= ruleExtensions ) )? otherlv_5= '.' ) )
            // InternalAst.g:1229:2: ( ( (lv_name_0_0= ruleNodeName ) ) ( (lv_baseTypes_1_0= ruleBaseTypes ) )? ( (lv_type_2_0= ruleNodeType ) )? ( (lv_part_3_0= ruleNodePart ) )* ( (lv_extension_4_0= ruleExtensions ) )? otherlv_5= '.' )
            {
            // InternalAst.g:1229:2: ( ( (lv_name_0_0= ruleNodeName ) ) ( (lv_baseTypes_1_0= ruleBaseTypes ) )? ( (lv_type_2_0= ruleNodeType ) )? ( (lv_part_3_0= ruleNodePart ) )* ( (lv_extension_4_0= ruleExtensions ) )? otherlv_5= '.' )
            // InternalAst.g:1230:3: ( (lv_name_0_0= ruleNodeName ) ) ( (lv_baseTypes_1_0= ruleBaseTypes ) )? ( (lv_type_2_0= ruleNodeType ) )? ( (lv_part_3_0= ruleNodePart ) )* ( (lv_extension_4_0= ruleExtensions ) )? otherlv_5= '.'
            {
            // InternalAst.g:1230:3: ( (lv_name_0_0= ruleNodeName ) )
            // InternalAst.g:1231:4: (lv_name_0_0= ruleNodeName )
            {
            // InternalAst.g:1231:4: (lv_name_0_0= ruleNodeName )
            // InternalAst.g:1232:5: lv_name_0_0= ruleNodeName
            {

            					newCompositeNode(grammarAccess.getRootNodeAccess().getNameNodeNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_13);
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

            // InternalAst.g:1249:3: ( (lv_baseTypes_1_0= ruleBaseTypes ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==35) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalAst.g:1250:4: (lv_baseTypes_1_0= ruleBaseTypes )
                    {
                    // InternalAst.g:1250:4: (lv_baseTypes_1_0= ruleBaseTypes )
                    // InternalAst.g:1251:5: lv_baseTypes_1_0= ruleBaseTypes
                    {

                    					newCompositeNode(grammarAccess.getRootNodeAccess().getBaseTypesBaseTypesParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_14);
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

            // InternalAst.g:1268:3: ( (lv_type_2_0= ruleNodeType ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=31 && LA9_0<=32)||LA9_0==40) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalAst.g:1269:4: (lv_type_2_0= ruleNodeType )
                    {
                    // InternalAst.g:1269:4: (lv_type_2_0= ruleNodeType )
                    // InternalAst.g:1270:5: lv_type_2_0= ruleNodeType
                    {

                    					newCompositeNode(grammarAccess.getRootNodeAccess().getTypeNodeTypeParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_15);
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

            // InternalAst.g:1287:3: ( (lv_part_3_0= ruleNodePart ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID||LA10_0==38) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalAst.g:1288:4: (lv_part_3_0= ruleNodePart )
            	    {
            	    // InternalAst.g:1288:4: (lv_part_3_0= ruleNodePart )
            	    // InternalAst.g:1289:5: lv_part_3_0= ruleNodePart
            	    {

            	    					newCompositeNode(grammarAccess.getRootNodeAccess().getPartNodePartParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_15);
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
            	    break loop10;
                }
            } while (true);

            // InternalAst.g:1306:3: ( (lv_extension_4_0= ruleExtensions ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==36) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalAst.g:1307:4: (lv_extension_4_0= ruleExtensions )
                    {
                    // InternalAst.g:1307:4: (lv_extension_4_0= ruleExtensions )
                    // InternalAst.g:1308:5: lv_extension_4_0= ruleExtensions
                    {

                    					newCompositeNode(grammarAccess.getRootNodeAccess().getExtensionExtensionsParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_16);
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

            otherlv_5=(Token)match(input,33,FOLLOW_2); 

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
    // InternalAst.g:1333:1: entryRuleBaseTypes returns [EObject current=null] : iv_ruleBaseTypes= ruleBaseTypes EOF ;
    public final EObject entryRuleBaseTypes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBaseTypes = null;


        try {
            // InternalAst.g:1333:50: (iv_ruleBaseTypes= ruleBaseTypes EOF )
            // InternalAst.g:1334:2: iv_ruleBaseTypes= ruleBaseTypes EOF
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
    // InternalAst.g:1340:1: ruleBaseTypes returns [EObject current=null] : (otherlv_0= '<-' ( (otherlv_1= RULE_ID ) )* ) ;
    public final EObject ruleBaseTypes() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalAst.g:1346:2: ( (otherlv_0= '<-' ( (otherlv_1= RULE_ID ) )* ) )
            // InternalAst.g:1347:2: (otherlv_0= '<-' ( (otherlv_1= RULE_ID ) )* )
            {
            // InternalAst.g:1347:2: (otherlv_0= '<-' ( (otherlv_1= RULE_ID ) )* )
            // InternalAst.g:1348:3: otherlv_0= '<-' ( (otherlv_1= RULE_ID ) )*
            {
            otherlv_0=(Token)match(input,35,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getBaseTypesAccess().getLessThanSignHyphenMinusKeyword_0());
            		
            // InternalAst.g:1352:3: ( (otherlv_1= RULE_ID ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalAst.g:1353:4: (otherlv_1= RULE_ID )
            	    {
            	    // InternalAst.g:1353:4: (otherlv_1= RULE_ID )
            	    // InternalAst.g:1354:5: otherlv_1= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getBaseTypesRule());
            	    					}
            	    				
            	    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_17); 

            	    					newLeafNode(otherlv_1, grammarAccess.getBaseTypesAccess().getNamesNodeNameCrossReference_1_0());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // InternalAst.g:1369:1: entryRuleExtensions returns [EObject current=null] : iv_ruleExtensions= ruleExtensions EOF ;
    public final EObject entryRuleExtensions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtensions = null;


        try {
            // InternalAst.g:1369:51: (iv_ruleExtensions= ruleExtensions EOF )
            // InternalAst.g:1370:2: iv_ruleExtensions= ruleExtensions EOF
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
    // InternalAst.g:1376:1: ruleExtensions returns [EObject current=null] : (otherlv_0= '<' ( (lv_nodes_1_0= ruleRootNode ) )* otherlv_2= '>' ) ;
    public final EObject ruleExtensions() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_nodes_1_0 = null;



        	enterRule();

        try {
            // InternalAst.g:1382:2: ( (otherlv_0= '<' ( (lv_nodes_1_0= ruleRootNode ) )* otherlv_2= '>' ) )
            // InternalAst.g:1383:2: (otherlv_0= '<' ( (lv_nodes_1_0= ruleRootNode ) )* otherlv_2= '>' )
            {
            // InternalAst.g:1383:2: (otherlv_0= '<' ( (lv_nodes_1_0= ruleRootNode ) )* otherlv_2= '>' )
            // InternalAst.g:1384:3: otherlv_0= '<' ( (lv_nodes_1_0= ruleRootNode ) )* otherlv_2= '>'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getExtensionsAccess().getLessThanSignKeyword_0());
            		
            // InternalAst.g:1388:3: ( (lv_nodes_1_0= ruleRootNode ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=RULE_ID && LA13_0<=RULE_STRING)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalAst.g:1389:4: (lv_nodes_1_0= ruleRootNode )
            	    {
            	    // InternalAst.g:1389:4: (lv_nodes_1_0= ruleRootNode )
            	    // InternalAst.g:1390:5: lv_nodes_1_0= ruleRootNode
            	    {

            	    					newCompositeNode(grammarAccess.getExtensionsAccess().getNodesRootNodeParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_18);
            	    lv_nodes_1_0=ruleRootNode();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getExtensionsRule());
            	    					}
            	    					set(
            	    						current,
            	    						"nodes",
            	    						lv_nodes_1_0,
            	    						"de.roma.cocktail.xtext.Ast.RootNode");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            otherlv_2=(Token)match(input,37,FOLLOW_2); 

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
    // InternalAst.g:1415:1: entryRuleNodePart returns [EObject current=null] : iv_ruleNodePart= ruleNodePart EOF ;
    public final EObject entryRuleNodePart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNodePart = null;


        try {
            // InternalAst.g:1415:49: (iv_ruleNodePart= ruleNodePart EOF )
            // InternalAst.g:1416:2: iv_ruleNodePart= ruleNodePart EOF
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
    // InternalAst.g:1422:1: ruleNodePart returns [EObject current=null] : ( ( (lv_child_0_0= ruleChildNode ) ) | ( (lv_attribute_1_0= ruleNodeAttribute ) ) ) ;
    public final EObject ruleNodePart() throws RecognitionException {
        EObject current = null;

        EObject lv_child_0_0 = null;

        EObject lv_attribute_1_0 = null;



        	enterRule();

        try {
            // InternalAst.g:1428:2: ( ( ( (lv_child_0_0= ruleChildNode ) ) | ( (lv_attribute_1_0= ruleNodeAttribute ) ) ) )
            // InternalAst.g:1429:2: ( ( (lv_child_0_0= ruleChildNode ) ) | ( (lv_attribute_1_0= ruleNodeAttribute ) ) )
            {
            // InternalAst.g:1429:2: ( ( (lv_child_0_0= ruleChildNode ) ) | ( (lv_attribute_1_0= ruleNodeAttribute ) ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID) ) {
                alt14=1;
            }
            else if ( (LA14_0==38) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalAst.g:1430:3: ( (lv_child_0_0= ruleChildNode ) )
                    {
                    // InternalAst.g:1430:3: ( (lv_child_0_0= ruleChildNode ) )
                    // InternalAst.g:1431:4: (lv_child_0_0= ruleChildNode )
                    {
                    // InternalAst.g:1431:4: (lv_child_0_0= ruleChildNode )
                    // InternalAst.g:1432:5: lv_child_0_0= ruleChildNode
                    {

                    					newCompositeNode(grammarAccess.getNodePartAccess().getChildChildNodeParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
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


                    }
                    break;
                case 2 :
                    // InternalAst.g:1450:3: ( (lv_attribute_1_0= ruleNodeAttribute ) )
                    {
                    // InternalAst.g:1450:3: ( (lv_attribute_1_0= ruleNodeAttribute ) )
                    // InternalAst.g:1451:4: (lv_attribute_1_0= ruleNodeAttribute )
                    {
                    // InternalAst.g:1451:4: (lv_attribute_1_0= ruleNodeAttribute )
                    // InternalAst.g:1452:5: lv_attribute_1_0= ruleNodeAttribute
                    {

                    					newCompositeNode(grammarAccess.getNodePartAccess().getAttributeNodeAttributeParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_attribute_1_0=ruleNodeAttribute();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getNodePartRule());
                    					}
                    					set(
                    						current,
                    						"attribute",
                    						lv_attribute_1_0,
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
    // InternalAst.g:1473:1: entryRuleChildNode returns [EObject current=null] : iv_ruleChildNode= ruleChildNode EOF ;
    public final EObject entryRuleChildNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChildNode = null;


        try {
            // InternalAst.g:1473:50: (iv_ruleChildNode= ruleChildNode EOF )
            // InternalAst.g:1474:2: iv_ruleChildNode= ruleChildNode EOF
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
    // InternalAst.g:1480:1: ruleChildNode returns [EObject current=null] : ( ( ( (lv_selector_0_0= RULE_ID ) ) otherlv_1= ':' )? ( (lv_type_2_0= RULE_ID ) ) ) ;
    public final EObject ruleChildNode() throws RecognitionException {
        EObject current = null;

        Token lv_selector_0_0=null;
        Token otherlv_1=null;
        Token lv_type_2_0=null;


        	enterRule();

        try {
            // InternalAst.g:1486:2: ( ( ( ( (lv_selector_0_0= RULE_ID ) ) otherlv_1= ':' )? ( (lv_type_2_0= RULE_ID ) ) ) )
            // InternalAst.g:1487:2: ( ( ( (lv_selector_0_0= RULE_ID ) ) otherlv_1= ':' )? ( (lv_type_2_0= RULE_ID ) ) )
            {
            // InternalAst.g:1487:2: ( ( ( (lv_selector_0_0= RULE_ID ) ) otherlv_1= ':' )? ( (lv_type_2_0= RULE_ID ) ) )
            // InternalAst.g:1488:3: ( ( (lv_selector_0_0= RULE_ID ) ) otherlv_1= ':' )? ( (lv_type_2_0= RULE_ID ) )
            {
            // InternalAst.g:1488:3: ( ( (lv_selector_0_0= RULE_ID ) ) otherlv_1= ':' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_ID) ) {
                int LA15_1 = input.LA(2);

                if ( (LA15_1==32) ) {
                    alt15=1;
                }
            }
            switch (alt15) {
                case 1 :
                    // InternalAst.g:1489:4: ( (lv_selector_0_0= RULE_ID ) ) otherlv_1= ':'
                    {
                    // InternalAst.g:1489:4: ( (lv_selector_0_0= RULE_ID ) )
                    // InternalAst.g:1490:5: (lv_selector_0_0= RULE_ID )
                    {
                    // InternalAst.g:1490:5: (lv_selector_0_0= RULE_ID )
                    // InternalAst.g:1491:6: lv_selector_0_0= RULE_ID
                    {
                    lv_selector_0_0=(Token)match(input,RULE_ID,FOLLOW_19); 

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

                    otherlv_1=(Token)match(input,32,FOLLOW_4); 

                    				newLeafNode(otherlv_1, grammarAccess.getChildNodeAccess().getColonKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalAst.g:1512:3: ( (lv_type_2_0= RULE_ID ) )
            // InternalAst.g:1513:4: (lv_type_2_0= RULE_ID )
            {
            // InternalAst.g:1513:4: (lv_type_2_0= RULE_ID )
            // InternalAst.g:1514:5: lv_type_2_0= RULE_ID
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
    // InternalAst.g:1534:1: entryRuleNodeAttribute returns [EObject current=null] : iv_ruleNodeAttribute= ruleNodeAttribute EOF ;
    public final EObject entryRuleNodeAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNodeAttribute = null;


        try {
            // InternalAst.g:1534:54: (iv_ruleNodeAttribute= ruleNodeAttribute EOF )
            // InternalAst.g:1535:2: iv_ruleNodeAttribute= ruleNodeAttribute EOF
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
    // InternalAst.g:1541:1: ruleNodeAttribute returns [EObject current=null] : (otherlv_0= '[' ( (lv_attribute_1_0= RULE_ID ) ) (otherlv_2= ':' ( (lv_type_3_0= RULE_ID ) ) )? ( (lv_property_4_0= rulePropertyList ) ) otherlv_5= ']' ) ;
    public final EObject ruleNodeAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_attribute_1_0=null;
        Token otherlv_2=null;
        Token lv_type_3_0=null;
        Token otherlv_5=null;
        EObject lv_property_4_0 = null;



        	enterRule();

        try {
            // InternalAst.g:1547:2: ( (otherlv_0= '[' ( (lv_attribute_1_0= RULE_ID ) ) (otherlv_2= ':' ( (lv_type_3_0= RULE_ID ) ) )? ( (lv_property_4_0= rulePropertyList ) ) otherlv_5= ']' ) )
            // InternalAst.g:1548:2: (otherlv_0= '[' ( (lv_attribute_1_0= RULE_ID ) ) (otherlv_2= ':' ( (lv_type_3_0= RULE_ID ) ) )? ( (lv_property_4_0= rulePropertyList ) ) otherlv_5= ']' )
            {
            // InternalAst.g:1548:2: (otherlv_0= '[' ( (lv_attribute_1_0= RULE_ID ) ) (otherlv_2= ':' ( (lv_type_3_0= RULE_ID ) ) )? ( (lv_property_4_0= rulePropertyList ) ) otherlv_5= ']' )
            // InternalAst.g:1549:3: otherlv_0= '[' ( (lv_attribute_1_0= RULE_ID ) ) (otherlv_2= ':' ( (lv_type_3_0= RULE_ID ) ) )? ( (lv_property_4_0= rulePropertyList ) ) otherlv_5= ']'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getNodeAttributeAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalAst.g:1553:3: ( (lv_attribute_1_0= RULE_ID ) )
            // InternalAst.g:1554:4: (lv_attribute_1_0= RULE_ID )
            {
            // InternalAst.g:1554:4: (lv_attribute_1_0= RULE_ID )
            // InternalAst.g:1555:5: lv_attribute_1_0= RULE_ID
            {
            lv_attribute_1_0=(Token)match(input,RULE_ID,FOLLOW_20); 

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

            // InternalAst.g:1571:3: (otherlv_2= ':' ( (lv_type_3_0= RULE_ID ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==32) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalAst.g:1572:4: otherlv_2= ':' ( (lv_type_3_0= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,32,FOLLOW_4); 

                    				newLeafNode(otherlv_2, grammarAccess.getNodeAttributeAccess().getColonKeyword_2_0());
                    			
                    // InternalAst.g:1576:4: ( (lv_type_3_0= RULE_ID ) )
                    // InternalAst.g:1577:5: (lv_type_3_0= RULE_ID )
                    {
                    // InternalAst.g:1577:5: (lv_type_3_0= RULE_ID )
                    // InternalAst.g:1578:6: lv_type_3_0= RULE_ID
                    {
                    lv_type_3_0=(Token)match(input,RULE_ID,FOLLOW_21); 

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

            // InternalAst.g:1595:3: ( (lv_property_4_0= rulePropertyList ) )
            // InternalAst.g:1596:4: (lv_property_4_0= rulePropertyList )
            {
            // InternalAst.g:1596:4: (lv_property_4_0= rulePropertyList )
            // InternalAst.g:1597:5: lv_property_4_0= rulePropertyList
            {

            					newCompositeNode(grammarAccess.getNodeAttributeAccess().getPropertyPropertyListParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_22);
            lv_property_4_0=rulePropertyList();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNodeAttributeRule());
            					}
            					set(
            						current,
            						"property",
            						lv_property_4_0,
            						"de.roma.cocktail.xtext.Ast.PropertyList");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,39,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getNodeAttributeAccess().getRightSquareBracketKeyword_4());
            		

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
    // InternalAst.g:1622:1: entryRuleNodeName returns [EObject current=null] : iv_ruleNodeName= ruleNodeName EOF ;
    public final EObject entryRuleNodeName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNodeName = null;


        try {
            // InternalAst.g:1622:49: (iv_ruleNodeName= ruleNodeName EOF )
            // InternalAst.g:1623:2: iv_ruleNodeName= ruleNodeName EOF
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
    // InternalAst.g:1629:1: ruleNodeName returns [EObject current=null] : ( ( (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING ) ) ) ;
    public final EObject ruleNodeName() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_1=null;
        Token lv_name_0_2=null;


        	enterRule();

        try {
            // InternalAst.g:1635:2: ( ( ( (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING ) ) ) )
            // InternalAst.g:1636:2: ( ( (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING ) ) )
            {
            // InternalAst.g:1636:2: ( ( (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING ) ) )
            // InternalAst.g:1637:3: ( (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING ) )
            {
            // InternalAst.g:1637:3: ( (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING ) )
            // InternalAst.g:1638:4: (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING )
            {
            // InternalAst.g:1638:4: (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_ID) ) {
                alt17=1;
            }
            else if ( (LA17_0==RULE_STRING) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalAst.g:1639:5: lv_name_0_1= RULE_ID
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
                    // InternalAst.g:1654:5: lv_name_0_2= RULE_STRING
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
    // InternalAst.g:1674:1: entryRuleNodeType returns [String current=null] : iv_ruleNodeType= ruleNodeType EOF ;
    public final String entryRuleNodeType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNodeType = null;


        try {
            // InternalAst.g:1674:48: (iv_ruleNodeType= ruleNodeType EOF )
            // InternalAst.g:1675:2: iv_ruleNodeType= ruleNodeType EOF
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
    // InternalAst.g:1681:1: ruleNodeType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '=' | kw= ':' | kw= ':=' ) ;
    public final AntlrDatatypeRuleToken ruleNodeType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAst.g:1687:2: ( (kw= '=' | kw= ':' | kw= ':=' ) )
            // InternalAst.g:1688:2: (kw= '=' | kw= ':' | kw= ':=' )
            {
            // InternalAst.g:1688:2: (kw= '=' | kw= ':' | kw= ':=' )
            int alt18=3;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt18=1;
                }
                break;
            case 32:
                {
                alt18=2;
                }
                break;
            case 40:
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
                    // InternalAst.g:1689:3: kw= '='
                    {
                    kw=(Token)match(input,31,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getNodeTypeAccess().getEqualsSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAst.g:1695:3: kw= ':'
                    {
                    kw=(Token)match(input,32,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getNodeTypeAccess().getColonKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalAst.g:1701:3: kw= ':='
                    {
                    kw=(Token)match(input,40,FOLLOW_2); 

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
    // InternalAst.g:1710:1: entryRuleCodeBlock returns [String current=null] : iv_ruleCodeBlock= ruleCodeBlock EOF ;
    public final String entryRuleCodeBlock() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCodeBlock = null;


        try {
            // InternalAst.g:1710:49: (iv_ruleCodeBlock= ruleCodeBlock EOF )
            // InternalAst.g:1711:2: iv_ruleCodeBlock= ruleCodeBlock EOF
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
    // InternalAst.g:1717:1: ruleCodeBlock returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_CodeWall_0= ruleCodeWall | (kw= '{' this_CodeBlock_2= ruleCodeBlock kw= '}' ) )* ;
    public final AntlrDatatypeRuleToken ruleCodeBlock() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_CodeWall_0 = null;

        AntlrDatatypeRuleToken this_CodeBlock_2 = null;



        	enterRule();

        try {
            // InternalAst.g:1723:2: ( (this_CodeWall_0= ruleCodeWall | (kw= '{' this_CodeBlock_2= ruleCodeBlock kw= '}' ) )* )
            // InternalAst.g:1724:2: (this_CodeWall_0= ruleCodeWall | (kw= '{' this_CodeBlock_2= ruleCodeBlock kw= '}' ) )*
            {
            // InternalAst.g:1724:2: (this_CodeWall_0= ruleCodeWall | (kw= '{' this_CodeBlock_2= ruleCodeBlock kw= '}' ) )*
            loop19:
            do {
                int alt19=3;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=RULE_ID && LA19_0<=RULE_WS)||(LA19_0>=31 && LA19_0<=33)||(LA19_0>=36 && LA19_0<=37)||(LA19_0>=41 && LA19_0<=55)) ) {
                    alt19=1;
                }
                else if ( (LA19_0==14) ) {
                    alt19=2;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalAst.g:1725:3: this_CodeWall_0= ruleCodeWall
            	    {

            	    			newCompositeNode(grammarAccess.getCodeBlockAccess().getCodeWallParserRuleCall_0());
            	    		
            	    pushFollow(FOLLOW_23);
            	    this_CodeWall_0=ruleCodeWall();

            	    state._fsp--;


            	    			current.merge(this_CodeWall_0);
            	    		

            	    			afterParserOrEnumRuleCall();
            	    		

            	    }
            	    break;
            	case 2 :
            	    // InternalAst.g:1736:3: (kw= '{' this_CodeBlock_2= ruleCodeBlock kw= '}' )
            	    {
            	    // InternalAst.g:1736:3: (kw= '{' this_CodeBlock_2= ruleCodeBlock kw= '}' )
            	    // InternalAst.g:1737:4: kw= '{' this_CodeBlock_2= ruleCodeBlock kw= '}'
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
            	    			
            	    kw=(Token)match(input,15,FOLLOW_23); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getCodeBlockAccess().getRightCurlyBracketKeyword_1_2());
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // InternalAst.g:1762:1: entryRuleCodeWall returns [String current=null] : iv_ruleCodeWall= ruleCodeWall EOF ;
    public final String entryRuleCodeWall() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCodeWall = null;


        try {
            // InternalAst.g:1762:48: (iv_ruleCodeWall= ruleCodeWall EOF )
            // InternalAst.g:1763:2: iv_ruleCodeWall= ruleCodeWall EOF
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
    // InternalAst.g:1769:1: ruleCodeWall returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_INT_1= RULE_INT | this_STRING_2= RULE_STRING | this_WS_3= RULE_WS | kw= '+' | kw= '-' | kw= '(' | kw= ')' | kw= '*' | kw= '.' | kw= '/' | kw= '\\\\' | kw= '|' | kw= '?' | kw= '>' | kw= '<' | kw= '#' | kw= '$' | kw= '%' | kw= ';' | kw= ':' | kw= '!' | kw= '=' | kw= ',' ) ;
    public final AntlrDatatypeRuleToken ruleCodeWall() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_INT_1=null;
        Token this_STRING_2=null;
        Token this_WS_3=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalAst.g:1775:2: ( (this_ID_0= RULE_ID | this_INT_1= RULE_INT | this_STRING_2= RULE_STRING | this_WS_3= RULE_WS | kw= '+' | kw= '-' | kw= '(' | kw= ')' | kw= '*' | kw= '.' | kw= '/' | kw= '\\\\' | kw= '|' | kw= '?' | kw= '>' | kw= '<' | kw= '#' | kw= '$' | kw= '%' | kw= ';' | kw= ':' | kw= '!' | kw= '=' | kw= ',' ) )
            // InternalAst.g:1776:2: (this_ID_0= RULE_ID | this_INT_1= RULE_INT | this_STRING_2= RULE_STRING | this_WS_3= RULE_WS | kw= '+' | kw= '-' | kw= '(' | kw= ')' | kw= '*' | kw= '.' | kw= '/' | kw= '\\\\' | kw= '|' | kw= '?' | kw= '>' | kw= '<' | kw= '#' | kw= '$' | kw= '%' | kw= ';' | kw= ':' | kw= '!' | kw= '=' | kw= ',' )
            {
            // InternalAst.g:1776:2: (this_ID_0= RULE_ID | this_INT_1= RULE_INT | this_STRING_2= RULE_STRING | this_WS_3= RULE_WS | kw= '+' | kw= '-' | kw= '(' | kw= ')' | kw= '*' | kw= '.' | kw= '/' | kw= '\\\\' | kw= '|' | kw= '?' | kw= '>' | kw= '<' | kw= '#' | kw= '$' | kw= '%' | kw= ';' | kw= ':' | kw= '!' | kw= '=' | kw= ',' )
            int alt20=24;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt20=1;
                }
                break;
            case RULE_INT:
                {
                alt20=2;
                }
                break;
            case RULE_STRING:
                {
                alt20=3;
                }
                break;
            case RULE_WS:
                {
                alt20=4;
                }
                break;
            case 41:
                {
                alt20=5;
                }
                break;
            case 42:
                {
                alt20=6;
                }
                break;
            case 43:
                {
                alt20=7;
                }
                break;
            case 44:
                {
                alt20=8;
                }
                break;
            case 45:
                {
                alt20=9;
                }
                break;
            case 33:
                {
                alt20=10;
                }
                break;
            case 46:
                {
                alt20=11;
                }
                break;
            case 47:
                {
                alt20=12;
                }
                break;
            case 48:
                {
                alt20=13;
                }
                break;
            case 49:
                {
                alt20=14;
                }
                break;
            case 37:
                {
                alt20=15;
                }
                break;
            case 36:
                {
                alt20=16;
                }
                break;
            case 50:
                {
                alt20=17;
                }
                break;
            case 51:
                {
                alt20=18;
                }
                break;
            case 52:
                {
                alt20=19;
                }
                break;
            case 53:
                {
                alt20=20;
                }
                break;
            case 32:
                {
                alt20=21;
                }
                break;
            case 54:
                {
                alt20=22;
                }
                break;
            case 31:
                {
                alt20=23;
                }
                break;
            case 55:
                {
                alt20=24;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // InternalAst.g:1777:3: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_0);
                    		

                    			newLeafNode(this_ID_0, grammarAccess.getCodeWallAccess().getIDTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAst.g:1785:3: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			current.merge(this_INT_1);
                    		

                    			newLeafNode(this_INT_1, grammarAccess.getCodeWallAccess().getINTTerminalRuleCall_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalAst.g:1793:3: this_STRING_2= RULE_STRING
                    {
                    this_STRING_2=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_2);
                    		

                    			newLeafNode(this_STRING_2, grammarAccess.getCodeWallAccess().getSTRINGTerminalRuleCall_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalAst.g:1801:3: this_WS_3= RULE_WS
                    {
                    this_WS_3=(Token)match(input,RULE_WS,FOLLOW_2); 

                    			current.merge(this_WS_3);
                    		

                    			newLeafNode(this_WS_3, grammarAccess.getCodeWallAccess().getWSTerminalRuleCall_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalAst.g:1809:3: kw= '+'
                    {
                    kw=(Token)match(input,41,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCodeWallAccess().getPlusSignKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalAst.g:1815:3: kw= '-'
                    {
                    kw=(Token)match(input,42,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCodeWallAccess().getHyphenMinusKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalAst.g:1821:3: kw= '('
                    {
                    kw=(Token)match(input,43,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCodeWallAccess().getLeftParenthesisKeyword_6());
                    		

                    }
                    break;
                case 8 :
                    // InternalAst.g:1827:3: kw= ')'
                    {
                    kw=(Token)match(input,44,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCodeWallAccess().getRightParenthesisKeyword_7());
                    		

                    }
                    break;
                case 9 :
                    // InternalAst.g:1833:3: kw= '*'
                    {
                    kw=(Token)match(input,45,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCodeWallAccess().getAsteriskKeyword_8());
                    		

                    }
                    break;
                case 10 :
                    // InternalAst.g:1839:3: kw= '.'
                    {
                    kw=(Token)match(input,33,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCodeWallAccess().getFullStopKeyword_9());
                    		

                    }
                    break;
                case 11 :
                    // InternalAst.g:1845:3: kw= '/'
                    {
                    kw=(Token)match(input,46,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCodeWallAccess().getSolidusKeyword_10());
                    		

                    }
                    break;
                case 12 :
                    // InternalAst.g:1851:3: kw= '\\\\'
                    {
                    kw=(Token)match(input,47,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCodeWallAccess().getReverseSolidusKeyword_11());
                    		

                    }
                    break;
                case 13 :
                    // InternalAst.g:1857:3: kw= '|'
                    {
                    kw=(Token)match(input,48,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCodeWallAccess().getVerticalLineKeyword_12());
                    		

                    }
                    break;
                case 14 :
                    // InternalAst.g:1863:3: kw= '?'
                    {
                    kw=(Token)match(input,49,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCodeWallAccess().getQuestionMarkKeyword_13());
                    		

                    }
                    break;
                case 15 :
                    // InternalAst.g:1869:3: kw= '>'
                    {
                    kw=(Token)match(input,37,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCodeWallAccess().getGreaterThanSignKeyword_14());
                    		

                    }
                    break;
                case 16 :
                    // InternalAst.g:1875:3: kw= '<'
                    {
                    kw=(Token)match(input,36,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCodeWallAccess().getLessThanSignKeyword_15());
                    		

                    }
                    break;
                case 17 :
                    // InternalAst.g:1881:3: kw= '#'
                    {
                    kw=(Token)match(input,50,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCodeWallAccess().getNumberSignKeyword_16());
                    		

                    }
                    break;
                case 18 :
                    // InternalAst.g:1887:3: kw= '$'
                    {
                    kw=(Token)match(input,51,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCodeWallAccess().getDollarSignKeyword_17());
                    		

                    }
                    break;
                case 19 :
                    // InternalAst.g:1893:3: kw= '%'
                    {
                    kw=(Token)match(input,52,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCodeWallAccess().getPercentSignKeyword_18());
                    		

                    }
                    break;
                case 20 :
                    // InternalAst.g:1899:3: kw= ';'
                    {
                    kw=(Token)match(input,53,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCodeWallAccess().getSemicolonKeyword_19());
                    		

                    }
                    break;
                case 21 :
                    // InternalAst.g:1905:3: kw= ':'
                    {
                    kw=(Token)match(input,32,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCodeWallAccess().getColonKeyword_20());
                    		

                    }
                    break;
                case 22 :
                    // InternalAst.g:1911:3: kw= '!'
                    {
                    kw=(Token)match(input,54,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCodeWallAccess().getExclamationMarkKeyword_21());
                    		

                    }
                    break;
                case 23 :
                    // InternalAst.g:1917:3: kw= '='
                    {
                    kw=(Token)match(input,31,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCodeWallAccess().getEqualsSignKeyword_22());
                    		

                    }
                    break;
                case 24 :
                    // InternalAst.g:1923:3: kw= ','
                    {
                    kw=(Token)match(input,55,FOLLOW_2); 

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
    protected DFA2 dfa2 = new DFA2(this);
    static final String dfa_1s = "\15\uffff";
    static final String dfa_2s = "\1\1\14\uffff";
    static final String dfa_3s = "\1\13\14\uffff";
    static final String dfa_4s = "\1\42\14\uffff";
    static final String dfa_5s = "\1\uffff\1\14\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13";
    static final String dfa_6s = "\1\0\14\uffff}>";
    static final String[] dfa_7s = {
            "\1\2\1\3\1\4\2\uffff\1\5\1\6\1\7\1\10\1\11\1\12\10\uffff\1\14\3\uffff\1\13",
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
            return "()+ loopback of 84:5: ( ({...}? => ( ({...}? => ( (lv_module_1_0= ruleModule ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_tree_2_0= ruleTree ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_imp_3_0= ruleImport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_exp_4_0= ruleExport ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_glo_5_0= ruleGlobal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_loc_6_0= ruleLocal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_beg_7_0= ruleBegin ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_clo_8_0= ruleClose ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_pro_9_0= ruleProperties ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_rul_10_0= ruleRule ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dec_11_0= ruleDeclare ) ) ) ) ) )+";
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

                        else if ( LA1_0 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 8) ) {s = 10;}

                        else if ( LA1_0 == 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 9) ) {s = 11;}

                        else if ( LA1_0 == 30 && getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 10) ) {s = 12;}

                         
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
    static final String dfa_8s = "\12\uffff";
    static final String dfa_9s = "\1\1\11\uffff";
    static final String dfa_10s = "\1\13\11\uffff";
    static final String dfa_11s = "\1\47\11\uffff";
    static final String dfa_12s = "\1\uffff\1\11\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10";
    static final String dfa_13s = "\1\0\11\uffff}>";
    static final String[] dfa_14s = {
            "\3\1\2\uffff\6\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\1\3\uffff\1\1\4\uffff\1\1",
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

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = dfa_8;
            this.eof = dfa_9;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "()* loopback of 848:5: ( ({...}? => ( ({...}? => ( (lv_props_1_0= 'INPUT' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_2_0= 'OUTPUT' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_3_0= 'SYNTHESIZED' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_4_0= 'INHERITED' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_5_0= 'THREAD' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_6_0= 'REVERSE' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_7_0= 'IGNORE' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_props_8_0= 'VIRTUAL' ) ) ) ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA2_0 = input.LA(1);

                         
                        int index2_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA2_0==EOF||(LA2_0>=11 && LA2_0<=13)||(LA2_0>=16 && LA2_0<=21)||LA2_0==30||LA2_0==34||LA2_0==39) ) {s = 1;}

                        else if ( LA2_0 == 22 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyListAccess().getUnorderedGroup(), 0) ) {s = 2;}

                        else if ( LA2_0 == 23 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyListAccess().getUnorderedGroup(), 1) ) {s = 3;}

                        else if ( LA2_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyListAccess().getUnorderedGroup(), 2) ) {s = 4;}

                        else if ( LA2_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyListAccess().getUnorderedGroup(), 3) ) {s = 5;}

                        else if ( LA2_0 == 26 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyListAccess().getUnorderedGroup(), 4) ) {s = 6;}

                        else if ( LA2_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyListAccess().getUnorderedGroup(), 5) ) {s = 7;}

                        else if ( LA2_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyListAccess().getUnorderedGroup(), 6) ) {s = 8;}

                        else if ( LA2_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyListAccess().getUnorderedGroup(), 7) ) {s = 9;}

                         
                        input.seek(index2_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 2, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000004403F3802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00FFFE338000C0F0L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000003FC00000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000000003FC00002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000180000030L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000004200000010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000015B80000010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000015380000010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000005200000010L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000002000000030L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000000813FC00000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x000000803FC00000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00FFFE33800040F2L});

}
