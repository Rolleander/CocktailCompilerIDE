package org.xtext.cocktail.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.xtext.cocktail.services.ScannerGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalScannerParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'SCANNER'", "'EXPORT {'", "'}'", "'GLOBAL {'", "'LOCAL {'", "'DEFAULT {'", "'EOF {'", "'DEFINE'", "'='", "'RULE'"
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
    public static final int RULE_ML_COMMENT=7;
    public static final int T__20=20;

    // delegates
    // delegators


        public InternalScannerParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalScannerParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalScannerParser.tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g"; }


     
     	private ScannerGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(ScannerGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleModel"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:60:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:61:1: ( ruleModel EOF )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:62:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel61);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:69:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:73:2: ( ( ( rule__Model__Group__0 ) ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:74:1: ( ( rule__Model__Group__0 ) )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:74:1: ( ( rule__Model__Group__0 ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:75:1: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:76:1: ( rule__Model__Group__0 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:76:2: rule__Model__Group__0
            {
            pushFollow(FOLLOW_rule__Model__Group__0_in_ruleModel94);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleTitle"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:88:1: entryRuleTitle : ruleTitle EOF ;
    public final void entryRuleTitle() throws RecognitionException {
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:89:1: ( ruleTitle EOF )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:90:1: ruleTitle EOF
            {
             before(grammarAccess.getTitleRule()); 
            pushFollow(FOLLOW_ruleTitle_in_entryRuleTitle121);
            ruleTitle();

            state._fsp--;

             after(grammarAccess.getTitleRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTitle128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTitle"


    // $ANTLR start "ruleTitle"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:97:1: ruleTitle : ( ( rule__Title__Group__0 ) ) ;
    public final void ruleTitle() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:101:2: ( ( ( rule__Title__Group__0 ) ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:102:1: ( ( rule__Title__Group__0 ) )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:102:1: ( ( rule__Title__Group__0 ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:103:1: ( rule__Title__Group__0 )
            {
             before(grammarAccess.getTitleAccess().getGroup()); 
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:104:1: ( rule__Title__Group__0 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:104:2: rule__Title__Group__0
            {
            pushFollow(FOLLOW_rule__Title__Group__0_in_ruleTitle154);
            rule__Title__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTitleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTitle"


    // $ANTLR start "entryRuleExport"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:116:1: entryRuleExport : ruleExport EOF ;
    public final void entryRuleExport() throws RecognitionException {
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:117:1: ( ruleExport EOF )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:118:1: ruleExport EOF
            {
             before(grammarAccess.getExportRule()); 
            pushFollow(FOLLOW_ruleExport_in_entryRuleExport181);
            ruleExport();

            state._fsp--;

             after(grammarAccess.getExportRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExport188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExport"


    // $ANTLR start "ruleExport"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:125:1: ruleExport : ( ( rule__Export__Group__0 ) ) ;
    public final void ruleExport() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:129:2: ( ( ( rule__Export__Group__0 ) ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:130:1: ( ( rule__Export__Group__0 ) )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:130:1: ( ( rule__Export__Group__0 ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:131:1: ( rule__Export__Group__0 )
            {
             before(grammarAccess.getExportAccess().getGroup()); 
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:132:1: ( rule__Export__Group__0 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:132:2: rule__Export__Group__0
            {
            pushFollow(FOLLOW_rule__Export__Group__0_in_ruleExport214);
            rule__Export__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExportAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExport"


    // $ANTLR start "entryRuleGlobal"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:144:1: entryRuleGlobal : ruleGlobal EOF ;
    public final void entryRuleGlobal() throws RecognitionException {
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:145:1: ( ruleGlobal EOF )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:146:1: ruleGlobal EOF
            {
             before(grammarAccess.getGlobalRule()); 
            pushFollow(FOLLOW_ruleGlobal_in_entryRuleGlobal241);
            ruleGlobal();

            state._fsp--;

             after(grammarAccess.getGlobalRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGlobal248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGlobal"


    // $ANTLR start "ruleGlobal"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:153:1: ruleGlobal : ( ( rule__Global__Group__0 ) ) ;
    public final void ruleGlobal() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:157:2: ( ( ( rule__Global__Group__0 ) ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:158:1: ( ( rule__Global__Group__0 ) )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:158:1: ( ( rule__Global__Group__0 ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:159:1: ( rule__Global__Group__0 )
            {
             before(grammarAccess.getGlobalAccess().getGroup()); 
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:160:1: ( rule__Global__Group__0 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:160:2: rule__Global__Group__0
            {
            pushFollow(FOLLOW_rule__Global__Group__0_in_ruleGlobal274);
            rule__Global__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGlobalAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGlobal"


    // $ANTLR start "entryRuleLocal"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:172:1: entryRuleLocal : ruleLocal EOF ;
    public final void entryRuleLocal() throws RecognitionException {
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:173:1: ( ruleLocal EOF )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:174:1: ruleLocal EOF
            {
             before(grammarAccess.getLocalRule()); 
            pushFollow(FOLLOW_ruleLocal_in_entryRuleLocal301);
            ruleLocal();

            state._fsp--;

             after(grammarAccess.getLocalRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLocal308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLocal"


    // $ANTLR start "ruleLocal"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:181:1: ruleLocal : ( ( rule__Local__Group__0 ) ) ;
    public final void ruleLocal() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:185:2: ( ( ( rule__Local__Group__0 ) ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:186:1: ( ( rule__Local__Group__0 ) )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:186:1: ( ( rule__Local__Group__0 ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:187:1: ( rule__Local__Group__0 )
            {
             before(grammarAccess.getLocalAccess().getGroup()); 
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:188:1: ( rule__Local__Group__0 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:188:2: rule__Local__Group__0
            {
            pushFollow(FOLLOW_rule__Local__Group__0_in_ruleLocal334);
            rule__Local__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLocalAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLocal"


    // $ANTLR start "entryRuleDefault"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:200:1: entryRuleDefault : ruleDefault EOF ;
    public final void entryRuleDefault() throws RecognitionException {
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:201:1: ( ruleDefault EOF )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:202:1: ruleDefault EOF
            {
             before(grammarAccess.getDefaultRule()); 
            pushFollow(FOLLOW_ruleDefault_in_entryRuleDefault361);
            ruleDefault();

            state._fsp--;

             after(grammarAccess.getDefaultRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefault368); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDefault"


    // $ANTLR start "ruleDefault"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:209:1: ruleDefault : ( ( rule__Default__Group__0 ) ) ;
    public final void ruleDefault() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:213:2: ( ( ( rule__Default__Group__0 ) ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:214:1: ( ( rule__Default__Group__0 ) )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:214:1: ( ( rule__Default__Group__0 ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:215:1: ( rule__Default__Group__0 )
            {
             before(grammarAccess.getDefaultAccess().getGroup()); 
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:216:1: ( rule__Default__Group__0 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:216:2: rule__Default__Group__0
            {
            pushFollow(FOLLOW_rule__Default__Group__0_in_ruleDefault394);
            rule__Default__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDefaultAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDefault"


    // $ANTLR start "entryRuleEof"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:228:1: entryRuleEof : ruleEof EOF ;
    public final void entryRuleEof() throws RecognitionException {
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:229:1: ( ruleEof EOF )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:230:1: ruleEof EOF
            {
             before(grammarAccess.getEofRule()); 
            pushFollow(FOLLOW_ruleEof_in_entryRuleEof421);
            ruleEof();

            state._fsp--;

             after(grammarAccess.getEofRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEof428); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEof"


    // $ANTLR start "ruleEof"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:237:1: ruleEof : ( ( rule__Eof__Group__0 ) ) ;
    public final void ruleEof() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:241:2: ( ( ( rule__Eof__Group__0 ) ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:242:1: ( ( rule__Eof__Group__0 ) )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:242:1: ( ( rule__Eof__Group__0 ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:243:1: ( rule__Eof__Group__0 )
            {
             before(grammarAccess.getEofAccess().getGroup()); 
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:244:1: ( rule__Eof__Group__0 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:244:2: rule__Eof__Group__0
            {
            pushFollow(FOLLOW_rule__Eof__Group__0_in_ruleEof454);
            rule__Eof__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEofAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEof"


    // $ANTLR start "entryRuleDefine"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:256:1: entryRuleDefine : ruleDefine EOF ;
    public final void entryRuleDefine() throws RecognitionException {
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:257:1: ( ruleDefine EOF )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:258:1: ruleDefine EOF
            {
             before(grammarAccess.getDefineRule()); 
            pushFollow(FOLLOW_ruleDefine_in_entryRuleDefine481);
            ruleDefine();

            state._fsp--;

             after(grammarAccess.getDefineRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefine488); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDefine"


    // $ANTLR start "ruleDefine"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:265:1: ruleDefine : ( ( rule__Define__Group__0 ) ) ;
    public final void ruleDefine() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:269:2: ( ( ( rule__Define__Group__0 ) ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:270:1: ( ( rule__Define__Group__0 ) )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:270:1: ( ( rule__Define__Group__0 ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:271:1: ( rule__Define__Group__0 )
            {
             before(grammarAccess.getDefineAccess().getGroup()); 
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:272:1: ( rule__Define__Group__0 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:272:2: rule__Define__Group__0
            {
            pushFollow(FOLLOW_rule__Define__Group__0_in_ruleDefine514);
            rule__Define__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDefineAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDefine"


    // $ANTLR start "entryRuleDefineRule"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:284:1: entryRuleDefineRule : ruleDefineRule EOF ;
    public final void entryRuleDefineRule() throws RecognitionException {
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:285:1: ( ruleDefineRule EOF )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:286:1: ruleDefineRule EOF
            {
             before(grammarAccess.getDefineRuleRule()); 
            pushFollow(FOLLOW_ruleDefineRule_in_entryRuleDefineRule541);
            ruleDefineRule();

            state._fsp--;

             after(grammarAccess.getDefineRuleRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefineRule548); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDefineRule"


    // $ANTLR start "ruleDefineRule"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:293:1: ruleDefineRule : ( ( rule__DefineRule__Group__0 ) ) ;
    public final void ruleDefineRule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:297:2: ( ( ( rule__DefineRule__Group__0 ) ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:298:1: ( ( rule__DefineRule__Group__0 ) )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:298:1: ( ( rule__DefineRule__Group__0 ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:299:1: ( rule__DefineRule__Group__0 )
            {
             before(grammarAccess.getDefineRuleAccess().getGroup()); 
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:300:1: ( rule__DefineRule__Group__0 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:300:2: rule__DefineRule__Group__0
            {
            pushFollow(FOLLOW_rule__DefineRule__Group__0_in_ruleDefineRule574);
            rule__DefineRule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDefineRuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDefineRule"


    // $ANTLR start "entryRuleStartStates"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:312:1: entryRuleStartStates : ruleStartStates EOF ;
    public final void entryRuleStartStates() throws RecognitionException {
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:313:1: ( ruleStartStates EOF )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:314:1: ruleStartStates EOF
            {
             before(grammarAccess.getStartStatesRule()); 
            pushFollow(FOLLOW_ruleStartStates_in_entryRuleStartStates601);
            ruleStartStates();

            state._fsp--;

             after(grammarAccess.getStartStatesRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStartStates608); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStartStates"


    // $ANTLR start "ruleStartStates"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:321:1: ruleStartStates : ( ( rule__StartStates__StatesAssignment )* ) ;
    public final void ruleStartStates() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:325:2: ( ( ( rule__StartStates__StatesAssignment )* ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:326:1: ( ( rule__StartStates__StatesAssignment )* )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:326:1: ( ( rule__StartStates__StatesAssignment )* )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:327:1: ( rule__StartStates__StatesAssignment )*
            {
             before(grammarAccess.getStartStatesAccess().getStatesAssignment()); 
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:328:1: ( rule__StartStates__StatesAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:328:2: rule__StartStates__StatesAssignment
            	    {
            	    pushFollow(FOLLOW_rule__StartStates__StatesAssignment_in_ruleStartStates634);
            	    rule__StartStates__StatesAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getStartStatesAccess().getStatesAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStartStates"


    // $ANTLR start "entryRuleRule"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:340:1: entryRuleRule : ruleRule EOF ;
    public final void entryRuleRule() throws RecognitionException {
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:341:1: ( ruleRule EOF )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:342:1: ruleRule EOF
            {
             before(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_ruleRule_in_entryRuleRule662);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getRuleRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRule669); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:349:1: ruleRule : ( ( rule__Rule__Group__0 ) ) ;
    public final void ruleRule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:353:2: ( ( ( rule__Rule__Group__0 ) ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:354:1: ( ( rule__Rule__Group__0 ) )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:354:1: ( ( rule__Rule__Group__0 ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:355:1: ( rule__Rule__Group__0 )
            {
             before(grammarAccess.getRuleAccess().getGroup()); 
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:356:1: ( rule__Rule__Group__0 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:356:2: rule__Rule__Group__0
            {
            pushFollow(FOLLOW_rule__Rule__Group__0_in_ruleRule695);
            rule__Rule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRule"


    // $ANTLR start "rule__Model__Group__0"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:370:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:374:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:375:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__0729);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__1_in_rule__Model__Group__0732);
            rule__Model__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:382:1: rule__Model__Group__0__Impl : ( ( rule__Model__ScannerAssignment_0 ) ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:386:1: ( ( ( rule__Model__ScannerAssignment_0 ) ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:387:1: ( ( rule__Model__ScannerAssignment_0 ) )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:387:1: ( ( rule__Model__ScannerAssignment_0 ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:388:1: ( rule__Model__ScannerAssignment_0 )
            {
             before(grammarAccess.getModelAccess().getScannerAssignment_0()); 
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:389:1: ( rule__Model__ScannerAssignment_0 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:389:2: rule__Model__ScannerAssignment_0
            {
            pushFollow(FOLLOW_rule__Model__ScannerAssignment_0_in_rule__Model__Group__0__Impl759);
            rule__Model__ScannerAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getScannerAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:399:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:403:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:404:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__1789);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__2_in_rule__Model__Group__1792);
            rule__Model__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:411:1: rule__Model__Group__1__Impl : ( ( rule__Model__ScannerAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:415:1: ( ( ( rule__Model__ScannerAssignment_1 ) ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:416:1: ( ( rule__Model__ScannerAssignment_1 ) )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:416:1: ( ( rule__Model__ScannerAssignment_1 ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:417:1: ( rule__Model__ScannerAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getScannerAssignment_1()); 
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:418:1: ( rule__Model__ScannerAssignment_1 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:418:2: rule__Model__ScannerAssignment_1
            {
            pushFollow(FOLLOW_rule__Model__ScannerAssignment_1_in_rule__Model__Group__1__Impl819);
            rule__Model__ScannerAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getScannerAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Model__Group__2"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:428:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:432:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:433:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__2849);
            rule__Model__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__3_in_rule__Model__Group__2852);
            rule__Model__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2"


    // $ANTLR start "rule__Model__Group__2__Impl"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:440:1: rule__Model__Group__2__Impl : ( ( rule__Model__ScannerAssignment_2 ) ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:444:1: ( ( ( rule__Model__ScannerAssignment_2 ) ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:445:1: ( ( rule__Model__ScannerAssignment_2 ) )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:445:1: ( ( rule__Model__ScannerAssignment_2 ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:446:1: ( rule__Model__ScannerAssignment_2 )
            {
             before(grammarAccess.getModelAccess().getScannerAssignment_2()); 
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:447:1: ( rule__Model__ScannerAssignment_2 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:447:2: rule__Model__ScannerAssignment_2
            {
            pushFollow(FOLLOW_rule__Model__ScannerAssignment_2_in_rule__Model__Group__2__Impl879);
            rule__Model__ScannerAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getScannerAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2__Impl"


    // $ANTLR start "rule__Model__Group__3"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:457:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:461:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:462:2: rule__Model__Group__3__Impl rule__Model__Group__4
            {
            pushFollow(FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__3909);
            rule__Model__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__4_in_rule__Model__Group__3912);
            rule__Model__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__3"


    // $ANTLR start "rule__Model__Group__3__Impl"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:469:1: rule__Model__Group__3__Impl : ( ( rule__Model__ScannerAssignment_3 ) ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:473:1: ( ( ( rule__Model__ScannerAssignment_3 ) ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:474:1: ( ( rule__Model__ScannerAssignment_3 ) )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:474:1: ( ( rule__Model__ScannerAssignment_3 ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:475:1: ( rule__Model__ScannerAssignment_3 )
            {
             before(grammarAccess.getModelAccess().getScannerAssignment_3()); 
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:476:1: ( rule__Model__ScannerAssignment_3 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:476:2: rule__Model__ScannerAssignment_3
            {
            pushFollow(FOLLOW_rule__Model__ScannerAssignment_3_in_rule__Model__Group__3__Impl939);
            rule__Model__ScannerAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getScannerAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__3__Impl"


    // $ANTLR start "rule__Model__Group__4"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:486:1: rule__Model__Group__4 : rule__Model__Group__4__Impl rule__Model__Group__5 ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:490:1: ( rule__Model__Group__4__Impl rule__Model__Group__5 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:491:2: rule__Model__Group__4__Impl rule__Model__Group__5
            {
            pushFollow(FOLLOW_rule__Model__Group__4__Impl_in_rule__Model__Group__4969);
            rule__Model__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__5_in_rule__Model__Group__4972);
            rule__Model__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__4"


    // $ANTLR start "rule__Model__Group__4__Impl"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:498:1: rule__Model__Group__4__Impl : ( ( rule__Model__ScannerAssignment_4 ) ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:502:1: ( ( ( rule__Model__ScannerAssignment_4 ) ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:503:1: ( ( rule__Model__ScannerAssignment_4 ) )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:503:1: ( ( rule__Model__ScannerAssignment_4 ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:504:1: ( rule__Model__ScannerAssignment_4 )
            {
             before(grammarAccess.getModelAccess().getScannerAssignment_4()); 
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:505:1: ( rule__Model__ScannerAssignment_4 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:505:2: rule__Model__ScannerAssignment_4
            {
            pushFollow(FOLLOW_rule__Model__ScannerAssignment_4_in_rule__Model__Group__4__Impl999);
            rule__Model__ScannerAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getScannerAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__4__Impl"


    // $ANTLR start "rule__Model__Group__5"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:515:1: rule__Model__Group__5 : rule__Model__Group__5__Impl rule__Model__Group__6 ;
    public final void rule__Model__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:519:1: ( rule__Model__Group__5__Impl rule__Model__Group__6 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:520:2: rule__Model__Group__5__Impl rule__Model__Group__6
            {
            pushFollow(FOLLOW_rule__Model__Group__5__Impl_in_rule__Model__Group__51029);
            rule__Model__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__6_in_rule__Model__Group__51032);
            rule__Model__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__5"


    // $ANTLR start "rule__Model__Group__5__Impl"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:527:1: rule__Model__Group__5__Impl : ( ( rule__Model__ScannerAssignment_5 ) ) ;
    public final void rule__Model__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:531:1: ( ( ( rule__Model__ScannerAssignment_5 ) ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:532:1: ( ( rule__Model__ScannerAssignment_5 ) )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:532:1: ( ( rule__Model__ScannerAssignment_5 ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:533:1: ( rule__Model__ScannerAssignment_5 )
            {
             before(grammarAccess.getModelAccess().getScannerAssignment_5()); 
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:534:1: ( rule__Model__ScannerAssignment_5 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:534:2: rule__Model__ScannerAssignment_5
            {
            pushFollow(FOLLOW_rule__Model__ScannerAssignment_5_in_rule__Model__Group__5__Impl1059);
            rule__Model__ScannerAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getScannerAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__5__Impl"


    // $ANTLR start "rule__Model__Group__6"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:544:1: rule__Model__Group__6 : rule__Model__Group__6__Impl rule__Model__Group__7 ;
    public final void rule__Model__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:548:1: ( rule__Model__Group__6__Impl rule__Model__Group__7 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:549:2: rule__Model__Group__6__Impl rule__Model__Group__7
            {
            pushFollow(FOLLOW_rule__Model__Group__6__Impl_in_rule__Model__Group__61089);
            rule__Model__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__7_in_rule__Model__Group__61092);
            rule__Model__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__6"


    // $ANTLR start "rule__Model__Group__6__Impl"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:556:1: rule__Model__Group__6__Impl : ( ( rule__Model__ScannerAssignment_6 ) ) ;
    public final void rule__Model__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:560:1: ( ( ( rule__Model__ScannerAssignment_6 ) ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:561:1: ( ( rule__Model__ScannerAssignment_6 ) )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:561:1: ( ( rule__Model__ScannerAssignment_6 ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:562:1: ( rule__Model__ScannerAssignment_6 )
            {
             before(grammarAccess.getModelAccess().getScannerAssignment_6()); 
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:563:1: ( rule__Model__ScannerAssignment_6 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:563:2: rule__Model__ScannerAssignment_6
            {
            pushFollow(FOLLOW_rule__Model__ScannerAssignment_6_in_rule__Model__Group__6__Impl1119);
            rule__Model__ScannerAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getScannerAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__6__Impl"


    // $ANTLR start "rule__Model__Group__7"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:573:1: rule__Model__Group__7 : rule__Model__Group__7__Impl rule__Model__Group__8 ;
    public final void rule__Model__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:577:1: ( rule__Model__Group__7__Impl rule__Model__Group__8 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:578:2: rule__Model__Group__7__Impl rule__Model__Group__8
            {
            pushFollow(FOLLOW_rule__Model__Group__7__Impl_in_rule__Model__Group__71149);
            rule__Model__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__8_in_rule__Model__Group__71152);
            rule__Model__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__7"


    // $ANTLR start "rule__Model__Group__7__Impl"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:585:1: rule__Model__Group__7__Impl : ( ( rule__Model__ScannerAssignment_7 ) ) ;
    public final void rule__Model__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:589:1: ( ( ( rule__Model__ScannerAssignment_7 ) ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:590:1: ( ( rule__Model__ScannerAssignment_7 ) )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:590:1: ( ( rule__Model__ScannerAssignment_7 ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:591:1: ( rule__Model__ScannerAssignment_7 )
            {
             before(grammarAccess.getModelAccess().getScannerAssignment_7()); 
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:592:1: ( rule__Model__ScannerAssignment_7 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:592:2: rule__Model__ScannerAssignment_7
            {
            pushFollow(FOLLOW_rule__Model__ScannerAssignment_7_in_rule__Model__Group__7__Impl1179);
            rule__Model__ScannerAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getScannerAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__7__Impl"


    // $ANTLR start "rule__Model__Group__8"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:602:1: rule__Model__Group__8 : rule__Model__Group__8__Impl ;
    public final void rule__Model__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:606:1: ( rule__Model__Group__8__Impl )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:607:2: rule__Model__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group__8__Impl_in_rule__Model__Group__81209);
            rule__Model__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__8"


    // $ANTLR start "rule__Model__Group__8__Impl"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:613:1: rule__Model__Group__8__Impl : ( ( rule__Model__ScannerAssignment_8 ) ) ;
    public final void rule__Model__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:617:1: ( ( ( rule__Model__ScannerAssignment_8 ) ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:618:1: ( ( rule__Model__ScannerAssignment_8 ) )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:618:1: ( ( rule__Model__ScannerAssignment_8 ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:619:1: ( rule__Model__ScannerAssignment_8 )
            {
             before(grammarAccess.getModelAccess().getScannerAssignment_8()); 
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:620:1: ( rule__Model__ScannerAssignment_8 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:620:2: rule__Model__ScannerAssignment_8
            {
            pushFollow(FOLLOW_rule__Model__ScannerAssignment_8_in_rule__Model__Group__8__Impl1236);
            rule__Model__ScannerAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getScannerAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__8__Impl"


    // $ANTLR start "rule__Title__Group__0"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:648:1: rule__Title__Group__0 : rule__Title__Group__0__Impl rule__Title__Group__1 ;
    public final void rule__Title__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:652:1: ( rule__Title__Group__0__Impl rule__Title__Group__1 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:653:2: rule__Title__Group__0__Impl rule__Title__Group__1
            {
            pushFollow(FOLLOW_rule__Title__Group__0__Impl_in_rule__Title__Group__01284);
            rule__Title__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Title__Group__1_in_rule__Title__Group__01287);
            rule__Title__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Title__Group__0"


    // $ANTLR start "rule__Title__Group__0__Impl"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:660:1: rule__Title__Group__0__Impl : ( 'SCANNER' ) ;
    public final void rule__Title__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:664:1: ( ( 'SCANNER' ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:665:1: ( 'SCANNER' )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:665:1: ( 'SCANNER' )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:666:1: 'SCANNER'
            {
             before(grammarAccess.getTitleAccess().getSCANNERKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__Title__Group__0__Impl1315); 
             after(grammarAccess.getTitleAccess().getSCANNERKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Title__Group__0__Impl"


    // $ANTLR start "rule__Title__Group__1"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:679:1: rule__Title__Group__1 : rule__Title__Group__1__Impl ;
    public final void rule__Title__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:683:1: ( rule__Title__Group__1__Impl )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:684:2: rule__Title__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Title__Group__1__Impl_in_rule__Title__Group__11346);
            rule__Title__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Title__Group__1"


    // $ANTLR start "rule__Title__Group__1__Impl"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:690:1: rule__Title__Group__1__Impl : ( ( rule__Title__NameAssignment_1 ) ) ;
    public final void rule__Title__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:694:1: ( ( ( rule__Title__NameAssignment_1 ) ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:695:1: ( ( rule__Title__NameAssignment_1 ) )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:695:1: ( ( rule__Title__NameAssignment_1 ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:696:1: ( rule__Title__NameAssignment_1 )
            {
             before(grammarAccess.getTitleAccess().getNameAssignment_1()); 
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:697:1: ( rule__Title__NameAssignment_1 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:697:2: rule__Title__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Title__NameAssignment_1_in_rule__Title__Group__1__Impl1373);
            rule__Title__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTitleAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Title__Group__1__Impl"


    // $ANTLR start "rule__Export__Group__0"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:711:1: rule__Export__Group__0 : rule__Export__Group__0__Impl rule__Export__Group__1 ;
    public final void rule__Export__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:715:1: ( rule__Export__Group__0__Impl rule__Export__Group__1 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:716:2: rule__Export__Group__0__Impl rule__Export__Group__1
            {
            pushFollow(FOLLOW_rule__Export__Group__0__Impl_in_rule__Export__Group__01407);
            rule__Export__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Export__Group__1_in_rule__Export__Group__01410);
            rule__Export__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Export__Group__0"


    // $ANTLR start "rule__Export__Group__0__Impl"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:723:1: rule__Export__Group__0__Impl : ( 'EXPORT {' ) ;
    public final void rule__Export__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:727:1: ( ( 'EXPORT {' ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:728:1: ( 'EXPORT {' )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:728:1: ( 'EXPORT {' )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:729:1: 'EXPORT {'
            {
             before(grammarAccess.getExportAccess().getEXPORTKeyword_0()); 
            match(input,12,FOLLOW_12_in_rule__Export__Group__0__Impl1438); 
             after(grammarAccess.getExportAccess().getEXPORTKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Export__Group__0__Impl"


    // $ANTLR start "rule__Export__Group__1"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:742:1: rule__Export__Group__1 : rule__Export__Group__1__Impl rule__Export__Group__2 ;
    public final void rule__Export__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:746:1: ( rule__Export__Group__1__Impl rule__Export__Group__2 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:747:2: rule__Export__Group__1__Impl rule__Export__Group__2
            {
            pushFollow(FOLLOW_rule__Export__Group__1__Impl_in_rule__Export__Group__11469);
            rule__Export__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Export__Group__2_in_rule__Export__Group__11472);
            rule__Export__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Export__Group__1"


    // $ANTLR start "rule__Export__Group__1__Impl"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:754:1: rule__Export__Group__1__Impl : ( ( rule__Export__ContentAssignment_1 ) ) ;
    public final void rule__Export__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:758:1: ( ( ( rule__Export__ContentAssignment_1 ) ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:759:1: ( ( rule__Export__ContentAssignment_1 ) )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:759:1: ( ( rule__Export__ContentAssignment_1 ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:760:1: ( rule__Export__ContentAssignment_1 )
            {
             before(grammarAccess.getExportAccess().getContentAssignment_1()); 
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:761:1: ( rule__Export__ContentAssignment_1 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:761:2: rule__Export__ContentAssignment_1
            {
            pushFollow(FOLLOW_rule__Export__ContentAssignment_1_in_rule__Export__Group__1__Impl1499);
            rule__Export__ContentAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getExportAccess().getContentAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Export__Group__1__Impl"


    // $ANTLR start "rule__Export__Group__2"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:771:1: rule__Export__Group__2 : rule__Export__Group__2__Impl ;
    public final void rule__Export__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:775:1: ( rule__Export__Group__2__Impl )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:776:2: rule__Export__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Export__Group__2__Impl_in_rule__Export__Group__21529);
            rule__Export__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Export__Group__2"


    // $ANTLR start "rule__Export__Group__2__Impl"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:782:1: rule__Export__Group__2__Impl : ( '}' ) ;
    public final void rule__Export__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:786:1: ( ( '}' ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:787:1: ( '}' )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:787:1: ( '}' )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:788:1: '}'
            {
             before(grammarAccess.getExportAccess().getRightCurlyBracketKeyword_2()); 
            match(input,13,FOLLOW_13_in_rule__Export__Group__2__Impl1557); 
             after(grammarAccess.getExportAccess().getRightCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Export__Group__2__Impl"


    // $ANTLR start "rule__Global__Group__0"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:807:1: rule__Global__Group__0 : rule__Global__Group__0__Impl rule__Global__Group__1 ;
    public final void rule__Global__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:811:1: ( rule__Global__Group__0__Impl rule__Global__Group__1 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:812:2: rule__Global__Group__0__Impl rule__Global__Group__1
            {
            pushFollow(FOLLOW_rule__Global__Group__0__Impl_in_rule__Global__Group__01594);
            rule__Global__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Global__Group__1_in_rule__Global__Group__01597);
            rule__Global__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Global__Group__0"


    // $ANTLR start "rule__Global__Group__0__Impl"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:819:1: rule__Global__Group__0__Impl : ( 'GLOBAL {' ) ;
    public final void rule__Global__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:823:1: ( ( 'GLOBAL {' ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:824:1: ( 'GLOBAL {' )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:824:1: ( 'GLOBAL {' )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:825:1: 'GLOBAL {'
            {
             before(grammarAccess.getGlobalAccess().getGLOBALKeyword_0()); 
            match(input,14,FOLLOW_14_in_rule__Global__Group__0__Impl1625); 
             after(grammarAccess.getGlobalAccess().getGLOBALKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Global__Group__0__Impl"


    // $ANTLR start "rule__Global__Group__1"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:838:1: rule__Global__Group__1 : rule__Global__Group__1__Impl rule__Global__Group__2 ;
    public final void rule__Global__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:842:1: ( rule__Global__Group__1__Impl rule__Global__Group__2 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:843:2: rule__Global__Group__1__Impl rule__Global__Group__2
            {
            pushFollow(FOLLOW_rule__Global__Group__1__Impl_in_rule__Global__Group__11656);
            rule__Global__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Global__Group__2_in_rule__Global__Group__11659);
            rule__Global__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Global__Group__1"


    // $ANTLR start "rule__Global__Group__1__Impl"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:850:1: rule__Global__Group__1__Impl : ( ( rule__Global__ContentAssignment_1 ) ) ;
    public final void rule__Global__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:854:1: ( ( ( rule__Global__ContentAssignment_1 ) ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:855:1: ( ( rule__Global__ContentAssignment_1 ) )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:855:1: ( ( rule__Global__ContentAssignment_1 ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:856:1: ( rule__Global__ContentAssignment_1 )
            {
             before(grammarAccess.getGlobalAccess().getContentAssignment_1()); 
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:857:1: ( rule__Global__ContentAssignment_1 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:857:2: rule__Global__ContentAssignment_1
            {
            pushFollow(FOLLOW_rule__Global__ContentAssignment_1_in_rule__Global__Group__1__Impl1686);
            rule__Global__ContentAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getGlobalAccess().getContentAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Global__Group__1__Impl"


    // $ANTLR start "rule__Global__Group__2"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:867:1: rule__Global__Group__2 : rule__Global__Group__2__Impl ;
    public final void rule__Global__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:871:1: ( rule__Global__Group__2__Impl )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:872:2: rule__Global__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Global__Group__2__Impl_in_rule__Global__Group__21716);
            rule__Global__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Global__Group__2"


    // $ANTLR start "rule__Global__Group__2__Impl"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:878:1: rule__Global__Group__2__Impl : ( '}' ) ;
    public final void rule__Global__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:882:1: ( ( '}' ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:883:1: ( '}' )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:883:1: ( '}' )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:884:1: '}'
            {
             before(grammarAccess.getGlobalAccess().getRightCurlyBracketKeyword_2()); 
            match(input,13,FOLLOW_13_in_rule__Global__Group__2__Impl1744); 
             after(grammarAccess.getGlobalAccess().getRightCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Global__Group__2__Impl"


    // $ANTLR start "rule__Local__Group__0"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:903:1: rule__Local__Group__0 : rule__Local__Group__0__Impl rule__Local__Group__1 ;
    public final void rule__Local__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:907:1: ( rule__Local__Group__0__Impl rule__Local__Group__1 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:908:2: rule__Local__Group__0__Impl rule__Local__Group__1
            {
            pushFollow(FOLLOW_rule__Local__Group__0__Impl_in_rule__Local__Group__01781);
            rule__Local__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Local__Group__1_in_rule__Local__Group__01784);
            rule__Local__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Local__Group__0"


    // $ANTLR start "rule__Local__Group__0__Impl"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:915:1: rule__Local__Group__0__Impl : ( 'LOCAL {' ) ;
    public final void rule__Local__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:919:1: ( ( 'LOCAL {' ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:920:1: ( 'LOCAL {' )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:920:1: ( 'LOCAL {' )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:921:1: 'LOCAL {'
            {
             before(grammarAccess.getLocalAccess().getLOCALKeyword_0()); 
            match(input,15,FOLLOW_15_in_rule__Local__Group__0__Impl1812); 
             after(grammarAccess.getLocalAccess().getLOCALKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Local__Group__0__Impl"


    // $ANTLR start "rule__Local__Group__1"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:934:1: rule__Local__Group__1 : rule__Local__Group__1__Impl rule__Local__Group__2 ;
    public final void rule__Local__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:938:1: ( rule__Local__Group__1__Impl rule__Local__Group__2 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:939:2: rule__Local__Group__1__Impl rule__Local__Group__2
            {
            pushFollow(FOLLOW_rule__Local__Group__1__Impl_in_rule__Local__Group__11843);
            rule__Local__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Local__Group__2_in_rule__Local__Group__11846);
            rule__Local__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Local__Group__1"


    // $ANTLR start "rule__Local__Group__1__Impl"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:946:1: rule__Local__Group__1__Impl : ( ( rule__Local__ContentAssignment_1 ) ) ;
    public final void rule__Local__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:950:1: ( ( ( rule__Local__ContentAssignment_1 ) ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:951:1: ( ( rule__Local__ContentAssignment_1 ) )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:951:1: ( ( rule__Local__ContentAssignment_1 ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:952:1: ( rule__Local__ContentAssignment_1 )
            {
             before(grammarAccess.getLocalAccess().getContentAssignment_1()); 
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:953:1: ( rule__Local__ContentAssignment_1 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:953:2: rule__Local__ContentAssignment_1
            {
            pushFollow(FOLLOW_rule__Local__ContentAssignment_1_in_rule__Local__Group__1__Impl1873);
            rule__Local__ContentAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLocalAccess().getContentAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Local__Group__1__Impl"


    // $ANTLR start "rule__Local__Group__2"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:963:1: rule__Local__Group__2 : rule__Local__Group__2__Impl ;
    public final void rule__Local__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:967:1: ( rule__Local__Group__2__Impl )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:968:2: rule__Local__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Local__Group__2__Impl_in_rule__Local__Group__21903);
            rule__Local__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Local__Group__2"


    // $ANTLR start "rule__Local__Group__2__Impl"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:974:1: rule__Local__Group__2__Impl : ( '}' ) ;
    public final void rule__Local__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:978:1: ( ( '}' ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:979:1: ( '}' )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:979:1: ( '}' )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:980:1: '}'
            {
             before(grammarAccess.getLocalAccess().getRightCurlyBracketKeyword_2()); 
            match(input,13,FOLLOW_13_in_rule__Local__Group__2__Impl1931); 
             after(grammarAccess.getLocalAccess().getRightCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Local__Group__2__Impl"


    // $ANTLR start "rule__Default__Group__0"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:999:1: rule__Default__Group__0 : rule__Default__Group__0__Impl rule__Default__Group__1 ;
    public final void rule__Default__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1003:1: ( rule__Default__Group__0__Impl rule__Default__Group__1 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1004:2: rule__Default__Group__0__Impl rule__Default__Group__1
            {
            pushFollow(FOLLOW_rule__Default__Group__0__Impl_in_rule__Default__Group__01968);
            rule__Default__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Default__Group__1_in_rule__Default__Group__01971);
            rule__Default__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Default__Group__0"


    // $ANTLR start "rule__Default__Group__0__Impl"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1011:1: rule__Default__Group__0__Impl : ( 'DEFAULT {' ) ;
    public final void rule__Default__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1015:1: ( ( 'DEFAULT {' ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1016:1: ( 'DEFAULT {' )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1016:1: ( 'DEFAULT {' )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1017:1: 'DEFAULT {'
            {
             before(grammarAccess.getDefaultAccess().getDEFAULTKeyword_0()); 
            match(input,16,FOLLOW_16_in_rule__Default__Group__0__Impl1999); 
             after(grammarAccess.getDefaultAccess().getDEFAULTKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Default__Group__0__Impl"


    // $ANTLR start "rule__Default__Group__1"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1030:1: rule__Default__Group__1 : rule__Default__Group__1__Impl rule__Default__Group__2 ;
    public final void rule__Default__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1034:1: ( rule__Default__Group__1__Impl rule__Default__Group__2 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1035:2: rule__Default__Group__1__Impl rule__Default__Group__2
            {
            pushFollow(FOLLOW_rule__Default__Group__1__Impl_in_rule__Default__Group__12030);
            rule__Default__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Default__Group__2_in_rule__Default__Group__12033);
            rule__Default__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Default__Group__1"


    // $ANTLR start "rule__Default__Group__1__Impl"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1042:1: rule__Default__Group__1__Impl : ( ( rule__Default__ContentAssignment_1 ) ) ;
    public final void rule__Default__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1046:1: ( ( ( rule__Default__ContentAssignment_1 ) ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1047:1: ( ( rule__Default__ContentAssignment_1 ) )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1047:1: ( ( rule__Default__ContentAssignment_1 ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1048:1: ( rule__Default__ContentAssignment_1 )
            {
             before(grammarAccess.getDefaultAccess().getContentAssignment_1()); 
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1049:1: ( rule__Default__ContentAssignment_1 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1049:2: rule__Default__ContentAssignment_1
            {
            pushFollow(FOLLOW_rule__Default__ContentAssignment_1_in_rule__Default__Group__1__Impl2060);
            rule__Default__ContentAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDefaultAccess().getContentAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Default__Group__1__Impl"


    // $ANTLR start "rule__Default__Group__2"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1059:1: rule__Default__Group__2 : rule__Default__Group__2__Impl ;
    public final void rule__Default__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1063:1: ( rule__Default__Group__2__Impl )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1064:2: rule__Default__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Default__Group__2__Impl_in_rule__Default__Group__22090);
            rule__Default__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Default__Group__2"


    // $ANTLR start "rule__Default__Group__2__Impl"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1070:1: rule__Default__Group__2__Impl : ( '}' ) ;
    public final void rule__Default__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1074:1: ( ( '}' ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1075:1: ( '}' )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1075:1: ( '}' )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1076:1: '}'
            {
             before(grammarAccess.getDefaultAccess().getRightCurlyBracketKeyword_2()); 
            match(input,13,FOLLOW_13_in_rule__Default__Group__2__Impl2118); 
             after(grammarAccess.getDefaultAccess().getRightCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Default__Group__2__Impl"


    // $ANTLR start "rule__Eof__Group__0"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1095:1: rule__Eof__Group__0 : rule__Eof__Group__0__Impl rule__Eof__Group__1 ;
    public final void rule__Eof__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1099:1: ( rule__Eof__Group__0__Impl rule__Eof__Group__1 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1100:2: rule__Eof__Group__0__Impl rule__Eof__Group__1
            {
            pushFollow(FOLLOW_rule__Eof__Group__0__Impl_in_rule__Eof__Group__02155);
            rule__Eof__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Eof__Group__1_in_rule__Eof__Group__02158);
            rule__Eof__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Eof__Group__0"


    // $ANTLR start "rule__Eof__Group__0__Impl"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1107:1: rule__Eof__Group__0__Impl : ( 'EOF {' ) ;
    public final void rule__Eof__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1111:1: ( ( 'EOF {' ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1112:1: ( 'EOF {' )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1112:1: ( 'EOF {' )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1113:1: 'EOF {'
            {
             before(grammarAccess.getEofAccess().getEOFKeyword_0()); 
            match(input,17,FOLLOW_17_in_rule__Eof__Group__0__Impl2186); 
             after(grammarAccess.getEofAccess().getEOFKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Eof__Group__0__Impl"


    // $ANTLR start "rule__Eof__Group__1"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1126:1: rule__Eof__Group__1 : rule__Eof__Group__1__Impl rule__Eof__Group__2 ;
    public final void rule__Eof__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1130:1: ( rule__Eof__Group__1__Impl rule__Eof__Group__2 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1131:2: rule__Eof__Group__1__Impl rule__Eof__Group__2
            {
            pushFollow(FOLLOW_rule__Eof__Group__1__Impl_in_rule__Eof__Group__12217);
            rule__Eof__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Eof__Group__2_in_rule__Eof__Group__12220);
            rule__Eof__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Eof__Group__1"


    // $ANTLR start "rule__Eof__Group__1__Impl"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1138:1: rule__Eof__Group__1__Impl : ( ( rule__Eof__ContentAssignment_1 ) ) ;
    public final void rule__Eof__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1142:1: ( ( ( rule__Eof__ContentAssignment_1 ) ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1143:1: ( ( rule__Eof__ContentAssignment_1 ) )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1143:1: ( ( rule__Eof__ContentAssignment_1 ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1144:1: ( rule__Eof__ContentAssignment_1 )
            {
             before(grammarAccess.getEofAccess().getContentAssignment_1()); 
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1145:1: ( rule__Eof__ContentAssignment_1 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1145:2: rule__Eof__ContentAssignment_1
            {
            pushFollow(FOLLOW_rule__Eof__ContentAssignment_1_in_rule__Eof__Group__1__Impl2247);
            rule__Eof__ContentAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEofAccess().getContentAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Eof__Group__1__Impl"


    // $ANTLR start "rule__Eof__Group__2"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1155:1: rule__Eof__Group__2 : rule__Eof__Group__2__Impl ;
    public final void rule__Eof__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1159:1: ( rule__Eof__Group__2__Impl )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1160:2: rule__Eof__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Eof__Group__2__Impl_in_rule__Eof__Group__22277);
            rule__Eof__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Eof__Group__2"


    // $ANTLR start "rule__Eof__Group__2__Impl"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1166:1: rule__Eof__Group__2__Impl : ( '}' ) ;
    public final void rule__Eof__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1170:1: ( ( '}' ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1171:1: ( '}' )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1171:1: ( '}' )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1172:1: '}'
            {
             before(grammarAccess.getEofAccess().getRightCurlyBracketKeyword_2()); 
            match(input,13,FOLLOW_13_in_rule__Eof__Group__2__Impl2305); 
             after(grammarAccess.getEofAccess().getRightCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Eof__Group__2__Impl"


    // $ANTLR start "rule__Define__Group__0"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1191:1: rule__Define__Group__0 : rule__Define__Group__0__Impl rule__Define__Group__1 ;
    public final void rule__Define__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1195:1: ( rule__Define__Group__0__Impl rule__Define__Group__1 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1196:2: rule__Define__Group__0__Impl rule__Define__Group__1
            {
            pushFollow(FOLLOW_rule__Define__Group__0__Impl_in_rule__Define__Group__02342);
            rule__Define__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Define__Group__1_in_rule__Define__Group__02345);
            rule__Define__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Define__Group__0"


    // $ANTLR start "rule__Define__Group__0__Impl"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1203:1: rule__Define__Group__0__Impl : ( 'DEFINE' ) ;
    public final void rule__Define__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1207:1: ( ( 'DEFINE' ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1208:1: ( 'DEFINE' )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1208:1: ( 'DEFINE' )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1209:1: 'DEFINE'
            {
             before(grammarAccess.getDefineAccess().getDEFINEKeyword_0()); 
            match(input,18,FOLLOW_18_in_rule__Define__Group__0__Impl2373); 
             after(grammarAccess.getDefineAccess().getDEFINEKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Define__Group__0__Impl"


    // $ANTLR start "rule__Define__Group__1"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1222:1: rule__Define__Group__1 : rule__Define__Group__1__Impl ;
    public final void rule__Define__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1226:1: ( rule__Define__Group__1__Impl )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1227:2: rule__Define__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Define__Group__1__Impl_in_rule__Define__Group__12404);
            rule__Define__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Define__Group__1"


    // $ANTLR start "rule__Define__Group__1__Impl"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1233:1: rule__Define__Group__1__Impl : ( ( rule__Define__DefinesAssignment_1 )* ) ;
    public final void rule__Define__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1237:1: ( ( ( rule__Define__DefinesAssignment_1 )* ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1238:1: ( ( rule__Define__DefinesAssignment_1 )* )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1238:1: ( ( rule__Define__DefinesAssignment_1 )* )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1239:1: ( rule__Define__DefinesAssignment_1 )*
            {
             before(grammarAccess.getDefineAccess().getDefinesAssignment_1()); 
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1240:1: ( rule__Define__DefinesAssignment_1 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    int LA2_2 = input.LA(2);

                    if ( (LA2_2==19) ) {
                        alt2=1;
                    }


                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1240:2: rule__Define__DefinesAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Define__DefinesAssignment_1_in_rule__Define__Group__1__Impl2431);
            	    rule__Define__DefinesAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getDefineAccess().getDefinesAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Define__Group__1__Impl"


    // $ANTLR start "rule__DefineRule__Group__0"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1254:1: rule__DefineRule__Group__0 : rule__DefineRule__Group__0__Impl rule__DefineRule__Group__1 ;
    public final void rule__DefineRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1258:1: ( rule__DefineRule__Group__0__Impl rule__DefineRule__Group__1 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1259:2: rule__DefineRule__Group__0__Impl rule__DefineRule__Group__1
            {
            pushFollow(FOLLOW_rule__DefineRule__Group__0__Impl_in_rule__DefineRule__Group__02466);
            rule__DefineRule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DefineRule__Group__1_in_rule__DefineRule__Group__02469);
            rule__DefineRule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefineRule__Group__0"


    // $ANTLR start "rule__DefineRule__Group__0__Impl"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1266:1: rule__DefineRule__Group__0__Impl : ( ( rule__DefineRule__DefineNameAssignment_0 ) ) ;
    public final void rule__DefineRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1270:1: ( ( ( rule__DefineRule__DefineNameAssignment_0 ) ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1271:1: ( ( rule__DefineRule__DefineNameAssignment_0 ) )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1271:1: ( ( rule__DefineRule__DefineNameAssignment_0 ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1272:1: ( rule__DefineRule__DefineNameAssignment_0 )
            {
             before(grammarAccess.getDefineRuleAccess().getDefineNameAssignment_0()); 
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1273:1: ( rule__DefineRule__DefineNameAssignment_0 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1273:2: rule__DefineRule__DefineNameAssignment_0
            {
            pushFollow(FOLLOW_rule__DefineRule__DefineNameAssignment_0_in_rule__DefineRule__Group__0__Impl2496);
            rule__DefineRule__DefineNameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getDefineRuleAccess().getDefineNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefineRule__Group__0__Impl"


    // $ANTLR start "rule__DefineRule__Group__1"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1283:1: rule__DefineRule__Group__1 : rule__DefineRule__Group__1__Impl rule__DefineRule__Group__2 ;
    public final void rule__DefineRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1287:1: ( rule__DefineRule__Group__1__Impl rule__DefineRule__Group__2 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1288:2: rule__DefineRule__Group__1__Impl rule__DefineRule__Group__2
            {
            pushFollow(FOLLOW_rule__DefineRule__Group__1__Impl_in_rule__DefineRule__Group__12526);
            rule__DefineRule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DefineRule__Group__2_in_rule__DefineRule__Group__12529);
            rule__DefineRule__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefineRule__Group__1"


    // $ANTLR start "rule__DefineRule__Group__1__Impl"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1295:1: rule__DefineRule__Group__1__Impl : ( '=' ) ;
    public final void rule__DefineRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1299:1: ( ( '=' ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1300:1: ( '=' )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1300:1: ( '=' )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1301:1: '='
            {
             before(grammarAccess.getDefineRuleAccess().getEqualsSignKeyword_1()); 
            match(input,19,FOLLOW_19_in_rule__DefineRule__Group__1__Impl2557); 
             after(grammarAccess.getDefineRuleAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefineRule__Group__1__Impl"


    // $ANTLR start "rule__DefineRule__Group__2"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1314:1: rule__DefineRule__Group__2 : rule__DefineRule__Group__2__Impl ;
    public final void rule__DefineRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1318:1: ( rule__DefineRule__Group__2__Impl )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1319:2: rule__DefineRule__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__DefineRule__Group__2__Impl_in_rule__DefineRule__Group__22588);
            rule__DefineRule__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefineRule__Group__2"


    // $ANTLR start "rule__DefineRule__Group__2__Impl"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1325:1: rule__DefineRule__Group__2__Impl : ( ( rule__DefineRule__DefineRuleAssignment_2 ) ) ;
    public final void rule__DefineRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1329:1: ( ( ( rule__DefineRule__DefineRuleAssignment_2 ) ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1330:1: ( ( rule__DefineRule__DefineRuleAssignment_2 ) )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1330:1: ( ( rule__DefineRule__DefineRuleAssignment_2 ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1331:1: ( rule__DefineRule__DefineRuleAssignment_2 )
            {
             before(grammarAccess.getDefineRuleAccess().getDefineRuleAssignment_2()); 
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1332:1: ( rule__DefineRule__DefineRuleAssignment_2 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1332:2: rule__DefineRule__DefineRuleAssignment_2
            {
            pushFollow(FOLLOW_rule__DefineRule__DefineRuleAssignment_2_in_rule__DefineRule__Group__2__Impl2615);
            rule__DefineRule__DefineRuleAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDefineRuleAccess().getDefineRuleAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefineRule__Group__2__Impl"


    // $ANTLR start "rule__Rule__Group__0"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1348:1: rule__Rule__Group__0 : rule__Rule__Group__0__Impl rule__Rule__Group__1 ;
    public final void rule__Rule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1352:1: ( rule__Rule__Group__0__Impl rule__Rule__Group__1 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1353:2: rule__Rule__Group__0__Impl rule__Rule__Group__1
            {
            pushFollow(FOLLOW_rule__Rule__Group__0__Impl_in_rule__Rule__Group__02651);
            rule__Rule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rule__Group__1_in_rule__Rule__Group__02654);
            rule__Rule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__0"


    // $ANTLR start "rule__Rule__Group__0__Impl"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1360:1: rule__Rule__Group__0__Impl : ( 'RULE' ) ;
    public final void rule__Rule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1364:1: ( ( 'RULE' ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1365:1: ( 'RULE' )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1365:1: ( 'RULE' )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1366:1: 'RULE'
            {
             before(grammarAccess.getRuleAccess().getRULEKeyword_0()); 
            match(input,20,FOLLOW_20_in_rule__Rule__Group__0__Impl2682); 
             after(grammarAccess.getRuleAccess().getRULEKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__0__Impl"


    // $ANTLR start "rule__Rule__Group__1"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1379:1: rule__Rule__Group__1 : rule__Rule__Group__1__Impl ;
    public final void rule__Rule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1383:1: ( rule__Rule__Group__1__Impl )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1384:2: rule__Rule__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Rule__Group__1__Impl_in_rule__Rule__Group__12713);
            rule__Rule__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__1"


    // $ANTLR start "rule__Rule__Group__1__Impl"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1390:1: rule__Rule__Group__1__Impl : ( ( rule__Rule__ContentAssignment_1 ) ) ;
    public final void rule__Rule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1394:1: ( ( ( rule__Rule__ContentAssignment_1 ) ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1395:1: ( ( rule__Rule__ContentAssignment_1 ) )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1395:1: ( ( rule__Rule__ContentAssignment_1 ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1396:1: ( rule__Rule__ContentAssignment_1 )
            {
             before(grammarAccess.getRuleAccess().getContentAssignment_1()); 
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1397:1: ( rule__Rule__ContentAssignment_1 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1397:2: rule__Rule__ContentAssignment_1
            {
            pushFollow(FOLLOW_rule__Rule__ContentAssignment_1_in_rule__Rule__Group__1__Impl2740);
            rule__Rule__ContentAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getContentAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__1__Impl"


    // $ANTLR start "rule__Model__ScannerAssignment_0"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1412:1: rule__Model__ScannerAssignment_0 : ( ruleTitle ) ;
    public final void rule__Model__ScannerAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1416:1: ( ( ruleTitle ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1417:1: ( ruleTitle )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1417:1: ( ruleTitle )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1418:1: ruleTitle
            {
             before(grammarAccess.getModelAccess().getScannerTitleParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleTitle_in_rule__Model__ScannerAssignment_02779);
            ruleTitle();

            state._fsp--;

             after(grammarAccess.getModelAccess().getScannerTitleParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ScannerAssignment_0"


    // $ANTLR start "rule__Model__ScannerAssignment_1"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1427:1: rule__Model__ScannerAssignment_1 : ( ruleExport ) ;
    public final void rule__Model__ScannerAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1431:1: ( ( ruleExport ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1432:1: ( ruleExport )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1432:1: ( ruleExport )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1433:1: ruleExport
            {
             before(grammarAccess.getModelAccess().getScannerExportParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleExport_in_rule__Model__ScannerAssignment_12810);
            ruleExport();

            state._fsp--;

             after(grammarAccess.getModelAccess().getScannerExportParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ScannerAssignment_1"


    // $ANTLR start "rule__Model__ScannerAssignment_2"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1442:1: rule__Model__ScannerAssignment_2 : ( ruleGlobal ) ;
    public final void rule__Model__ScannerAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1446:1: ( ( ruleGlobal ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1447:1: ( ruleGlobal )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1447:1: ( ruleGlobal )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1448:1: ruleGlobal
            {
             before(grammarAccess.getModelAccess().getScannerGlobalParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleGlobal_in_rule__Model__ScannerAssignment_22841);
            ruleGlobal();

            state._fsp--;

             after(grammarAccess.getModelAccess().getScannerGlobalParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ScannerAssignment_2"


    // $ANTLR start "rule__Model__ScannerAssignment_3"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1457:1: rule__Model__ScannerAssignment_3 : ( ruleLocal ) ;
    public final void rule__Model__ScannerAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1461:1: ( ( ruleLocal ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1462:1: ( ruleLocal )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1462:1: ( ruleLocal )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1463:1: ruleLocal
            {
             before(grammarAccess.getModelAccess().getScannerLocalParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleLocal_in_rule__Model__ScannerAssignment_32872);
            ruleLocal();

            state._fsp--;

             after(grammarAccess.getModelAccess().getScannerLocalParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ScannerAssignment_3"


    // $ANTLR start "rule__Model__ScannerAssignment_4"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1472:1: rule__Model__ScannerAssignment_4 : ( ruleDefault ) ;
    public final void rule__Model__ScannerAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1476:1: ( ( ruleDefault ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1477:1: ( ruleDefault )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1477:1: ( ruleDefault )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1478:1: ruleDefault
            {
             before(grammarAccess.getModelAccess().getScannerDefaultParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleDefault_in_rule__Model__ScannerAssignment_42903);
            ruleDefault();

            state._fsp--;

             after(grammarAccess.getModelAccess().getScannerDefaultParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ScannerAssignment_4"


    // $ANTLR start "rule__Model__ScannerAssignment_5"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1487:1: rule__Model__ScannerAssignment_5 : ( ruleEof ) ;
    public final void rule__Model__ScannerAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1491:1: ( ( ruleEof ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1492:1: ( ruleEof )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1492:1: ( ruleEof )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1493:1: ruleEof
            {
             before(grammarAccess.getModelAccess().getScannerEofParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleEof_in_rule__Model__ScannerAssignment_52934);
            ruleEof();

            state._fsp--;

             after(grammarAccess.getModelAccess().getScannerEofParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ScannerAssignment_5"


    // $ANTLR start "rule__Model__ScannerAssignment_6"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1502:1: rule__Model__ScannerAssignment_6 : ( ruleDefine ) ;
    public final void rule__Model__ScannerAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1506:1: ( ( ruleDefine ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1507:1: ( ruleDefine )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1507:1: ( ruleDefine )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1508:1: ruleDefine
            {
             before(grammarAccess.getModelAccess().getScannerDefineParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleDefine_in_rule__Model__ScannerAssignment_62965);
            ruleDefine();

            state._fsp--;

             after(grammarAccess.getModelAccess().getScannerDefineParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ScannerAssignment_6"


    // $ANTLR start "rule__Model__ScannerAssignment_7"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1517:1: rule__Model__ScannerAssignment_7 : ( ruleStartStates ) ;
    public final void rule__Model__ScannerAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1521:1: ( ( ruleStartStates ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1522:1: ( ruleStartStates )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1522:1: ( ruleStartStates )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1523:1: ruleStartStates
            {
             before(grammarAccess.getModelAccess().getScannerStartStatesParserRuleCall_7_0()); 
            pushFollow(FOLLOW_ruleStartStates_in_rule__Model__ScannerAssignment_72996);
            ruleStartStates();

            state._fsp--;

             after(grammarAccess.getModelAccess().getScannerStartStatesParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ScannerAssignment_7"


    // $ANTLR start "rule__Model__ScannerAssignment_8"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1532:1: rule__Model__ScannerAssignment_8 : ( ruleRule ) ;
    public final void rule__Model__ScannerAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1536:1: ( ( ruleRule ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1537:1: ( ruleRule )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1537:1: ( ruleRule )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1538:1: ruleRule
            {
             before(grammarAccess.getModelAccess().getScannerRuleParserRuleCall_8_0()); 
            pushFollow(FOLLOW_ruleRule_in_rule__Model__ScannerAssignment_83027);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getModelAccess().getScannerRuleParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ScannerAssignment_8"


    // $ANTLR start "rule__Title__NameAssignment_1"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1547:1: rule__Title__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Title__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1551:1: ( ( RULE_ID ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1552:1: ( RULE_ID )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1552:1: ( RULE_ID )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1553:1: RULE_ID
            {
             before(grammarAccess.getTitleAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Title__NameAssignment_13058); 
             after(grammarAccess.getTitleAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Title__NameAssignment_1"


    // $ANTLR start "rule__Export__ContentAssignment_1"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1562:1: rule__Export__ContentAssignment_1 : ( RULE_ID ) ;
    public final void rule__Export__ContentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1566:1: ( ( RULE_ID ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1567:1: ( RULE_ID )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1567:1: ( RULE_ID )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1568:1: RULE_ID
            {
             before(grammarAccess.getExportAccess().getContentIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Export__ContentAssignment_13089); 
             after(grammarAccess.getExportAccess().getContentIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Export__ContentAssignment_1"


    // $ANTLR start "rule__Global__ContentAssignment_1"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1577:1: rule__Global__ContentAssignment_1 : ( RULE_ID ) ;
    public final void rule__Global__ContentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1581:1: ( ( RULE_ID ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1582:1: ( RULE_ID )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1582:1: ( RULE_ID )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1583:1: RULE_ID
            {
             before(grammarAccess.getGlobalAccess().getContentIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Global__ContentAssignment_13120); 
             after(grammarAccess.getGlobalAccess().getContentIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Global__ContentAssignment_1"


    // $ANTLR start "rule__Local__ContentAssignment_1"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1592:1: rule__Local__ContentAssignment_1 : ( RULE_ID ) ;
    public final void rule__Local__ContentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1596:1: ( ( RULE_ID ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1597:1: ( RULE_ID )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1597:1: ( RULE_ID )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1598:1: RULE_ID
            {
             before(grammarAccess.getLocalAccess().getContentIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Local__ContentAssignment_13151); 
             after(grammarAccess.getLocalAccess().getContentIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Local__ContentAssignment_1"


    // $ANTLR start "rule__Default__ContentAssignment_1"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1607:1: rule__Default__ContentAssignment_1 : ( RULE_ID ) ;
    public final void rule__Default__ContentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1611:1: ( ( RULE_ID ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1612:1: ( RULE_ID )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1612:1: ( RULE_ID )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1613:1: RULE_ID
            {
             before(grammarAccess.getDefaultAccess().getContentIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Default__ContentAssignment_13182); 
             after(grammarAccess.getDefaultAccess().getContentIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Default__ContentAssignment_1"


    // $ANTLR start "rule__Eof__ContentAssignment_1"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1622:1: rule__Eof__ContentAssignment_1 : ( RULE_ID ) ;
    public final void rule__Eof__ContentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1626:1: ( ( RULE_ID ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1627:1: ( RULE_ID )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1627:1: ( RULE_ID )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1628:1: RULE_ID
            {
             before(grammarAccess.getEofAccess().getContentIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Eof__ContentAssignment_13213); 
             after(grammarAccess.getEofAccess().getContentIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Eof__ContentAssignment_1"


    // $ANTLR start "rule__Define__DefinesAssignment_1"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1637:1: rule__Define__DefinesAssignment_1 : ( ruleDefineRule ) ;
    public final void rule__Define__DefinesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1641:1: ( ( ruleDefineRule ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1642:1: ( ruleDefineRule )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1642:1: ( ruleDefineRule )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1643:1: ruleDefineRule
            {
             before(grammarAccess.getDefineAccess().getDefinesDefineRuleParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleDefineRule_in_rule__Define__DefinesAssignment_13244);
            ruleDefineRule();

            state._fsp--;

             after(grammarAccess.getDefineAccess().getDefinesDefineRuleParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Define__DefinesAssignment_1"


    // $ANTLR start "rule__DefineRule__DefineNameAssignment_0"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1652:1: rule__DefineRule__DefineNameAssignment_0 : ( RULE_ID ) ;
    public final void rule__DefineRule__DefineNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1656:1: ( ( RULE_ID ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1657:1: ( RULE_ID )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1657:1: ( RULE_ID )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1658:1: RULE_ID
            {
             before(grammarAccess.getDefineRuleAccess().getDefineNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DefineRule__DefineNameAssignment_03275); 
             after(grammarAccess.getDefineRuleAccess().getDefineNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefineRule__DefineNameAssignment_0"


    // $ANTLR start "rule__DefineRule__DefineRuleAssignment_2"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1667:1: rule__DefineRule__DefineRuleAssignment_2 : ( RULE_ID ) ;
    public final void rule__DefineRule__DefineRuleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1671:1: ( ( RULE_ID ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1672:1: ( RULE_ID )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1672:1: ( RULE_ID )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1673:1: RULE_ID
            {
             before(grammarAccess.getDefineRuleAccess().getDefineRuleIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DefineRule__DefineRuleAssignment_23306); 
             after(grammarAccess.getDefineRuleAccess().getDefineRuleIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefineRule__DefineRuleAssignment_2"


    // $ANTLR start "rule__StartStates__StatesAssignment"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1682:1: rule__StartStates__StatesAssignment : ( RULE_ID ) ;
    public final void rule__StartStates__StatesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1686:1: ( ( RULE_ID ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1687:1: ( RULE_ID )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1687:1: ( RULE_ID )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1688:1: RULE_ID
            {
             before(grammarAccess.getStartStatesAccess().getStatesIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__StartStates__StatesAssignment3337); 
             after(grammarAccess.getStartStatesAccess().getStatesIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartStates__StatesAssignment"


    // $ANTLR start "rule__Rule__ContentAssignment_1"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1697:1: rule__Rule__ContentAssignment_1 : ( RULE_ID ) ;
    public final void rule__Rule__ContentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1701:1: ( ( RULE_ID ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1702:1: ( RULE_ID )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1702:1: ( RULE_ID )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1703:1: RULE_ID
            {
             before(grammarAccess.getRuleAccess().getContentIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Rule__ContentAssignment_13368); 
             after(grammarAccess.getRuleAccess().getContentIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__ContentAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0_in_ruleModel94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTitle_in_entryRuleTitle121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTitle128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Title__Group__0_in_ruleTitle154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExport_in_entryRuleExport181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExport188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Export__Group__0_in_ruleExport214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGlobal_in_entryRuleGlobal241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGlobal248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Global__Group__0_in_ruleGlobal274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocal_in_entryRuleLocal301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLocal308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Local__Group__0_in_ruleLocal334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefault_in_entryRuleDefault361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefault368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Default__Group__0_in_ruleDefault394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEof_in_entryRuleEof421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEof428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Eof__Group__0_in_ruleEof454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefine_in_entryRuleDefine481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefine488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Define__Group__0_in_ruleDefine514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefineRule_in_entryRuleDefineRule541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefineRule548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefineRule__Group__0_in_ruleDefineRule574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStartStates_in_entryRuleStartStates601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStartStates608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StartStates__StatesAssignment_in_ruleStartStates634 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleRule_in_entryRuleRule662 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRule669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__0_in_ruleRule695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__0729 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__0732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ScannerAssignment_0_in_rule__Model__Group__0__Impl759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__1789 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Model__Group__2_in_rule__Model__Group__1792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ScannerAssignment_1_in_rule__Model__Group__1__Impl819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__2849 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Model__Group__3_in_rule__Model__Group__2852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ScannerAssignment_2_in_rule__Model__Group__2__Impl879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__3909 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Model__Group__4_in_rule__Model__Group__3912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ScannerAssignment_3_in_rule__Model__Group__3__Impl939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__4__Impl_in_rule__Model__Group__4969 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Model__Group__5_in_rule__Model__Group__4972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ScannerAssignment_4_in_rule__Model__Group__4__Impl999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__5__Impl_in_rule__Model__Group__51029 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Model__Group__6_in_rule__Model__Group__51032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ScannerAssignment_5_in_rule__Model__Group__5__Impl1059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__6__Impl_in_rule__Model__Group__61089 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Model__Group__7_in_rule__Model__Group__61092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ScannerAssignment_6_in_rule__Model__Group__6__Impl1119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__7__Impl_in_rule__Model__Group__71149 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Model__Group__8_in_rule__Model__Group__71152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ScannerAssignment_7_in_rule__Model__Group__7__Impl1179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__8__Impl_in_rule__Model__Group__81209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ScannerAssignment_8_in_rule__Model__Group__8__Impl1236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Title__Group__0__Impl_in_rule__Title__Group__01284 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Title__Group__1_in_rule__Title__Group__01287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Title__Group__0__Impl1315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Title__Group__1__Impl_in_rule__Title__Group__11346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Title__NameAssignment_1_in_rule__Title__Group__1__Impl1373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Export__Group__0__Impl_in_rule__Export__Group__01407 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Export__Group__1_in_rule__Export__Group__01410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Export__Group__0__Impl1438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Export__Group__1__Impl_in_rule__Export__Group__11469 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Export__Group__2_in_rule__Export__Group__11472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Export__ContentAssignment_1_in_rule__Export__Group__1__Impl1499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Export__Group__2__Impl_in_rule__Export__Group__21529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Export__Group__2__Impl1557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Global__Group__0__Impl_in_rule__Global__Group__01594 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Global__Group__1_in_rule__Global__Group__01597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Global__Group__0__Impl1625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Global__Group__1__Impl_in_rule__Global__Group__11656 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Global__Group__2_in_rule__Global__Group__11659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Global__ContentAssignment_1_in_rule__Global__Group__1__Impl1686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Global__Group__2__Impl_in_rule__Global__Group__21716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Global__Group__2__Impl1744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Local__Group__0__Impl_in_rule__Local__Group__01781 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Local__Group__1_in_rule__Local__Group__01784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Local__Group__0__Impl1812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Local__Group__1__Impl_in_rule__Local__Group__11843 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Local__Group__2_in_rule__Local__Group__11846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Local__ContentAssignment_1_in_rule__Local__Group__1__Impl1873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Local__Group__2__Impl_in_rule__Local__Group__21903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Local__Group__2__Impl1931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Default__Group__0__Impl_in_rule__Default__Group__01968 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Default__Group__1_in_rule__Default__Group__01971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Default__Group__0__Impl1999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Default__Group__1__Impl_in_rule__Default__Group__12030 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Default__Group__2_in_rule__Default__Group__12033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Default__ContentAssignment_1_in_rule__Default__Group__1__Impl2060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Default__Group__2__Impl_in_rule__Default__Group__22090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Default__Group__2__Impl2118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Eof__Group__0__Impl_in_rule__Eof__Group__02155 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Eof__Group__1_in_rule__Eof__Group__02158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Eof__Group__0__Impl2186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Eof__Group__1__Impl_in_rule__Eof__Group__12217 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Eof__Group__2_in_rule__Eof__Group__12220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Eof__ContentAssignment_1_in_rule__Eof__Group__1__Impl2247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Eof__Group__2__Impl_in_rule__Eof__Group__22277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Eof__Group__2__Impl2305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Define__Group__0__Impl_in_rule__Define__Group__02342 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Define__Group__1_in_rule__Define__Group__02345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Define__Group__0__Impl2373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Define__Group__1__Impl_in_rule__Define__Group__12404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Define__DefinesAssignment_1_in_rule__Define__Group__1__Impl2431 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__DefineRule__Group__0__Impl_in_rule__DefineRule__Group__02466 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__DefineRule__Group__1_in_rule__DefineRule__Group__02469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefineRule__DefineNameAssignment_0_in_rule__DefineRule__Group__0__Impl2496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefineRule__Group__1__Impl_in_rule__DefineRule__Group__12526 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DefineRule__Group__2_in_rule__DefineRule__Group__12529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__DefineRule__Group__1__Impl2557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefineRule__Group__2__Impl_in_rule__DefineRule__Group__22588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefineRule__DefineRuleAssignment_2_in_rule__DefineRule__Group__2__Impl2615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__0__Impl_in_rule__Rule__Group__02651 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Rule__Group__1_in_rule__Rule__Group__02654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Rule__Group__0__Impl2682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__1__Impl_in_rule__Rule__Group__12713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__ContentAssignment_1_in_rule__Rule__Group__1__Impl2740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTitle_in_rule__Model__ScannerAssignment_02779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExport_in_rule__Model__ScannerAssignment_12810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGlobal_in_rule__Model__ScannerAssignment_22841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocal_in_rule__Model__ScannerAssignment_32872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefault_in_rule__Model__ScannerAssignment_42903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEof_in_rule__Model__ScannerAssignment_52934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefine_in_rule__Model__ScannerAssignment_62965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStartStates_in_rule__Model__ScannerAssignment_72996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRule_in_rule__Model__ScannerAssignment_83027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Title__NameAssignment_13058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Export__ContentAssignment_13089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Global__ContentAssignment_13120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Local__ContentAssignment_13151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Default__ContentAssignment_13182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Eof__ContentAssignment_13213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefineRule_in_rule__Define__DefinesAssignment_13244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DefineRule__DefineNameAssignment_03275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DefineRule__DefineRuleAssignment_23306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__StartStates__StatesAssignment3337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Rule__ContentAssignment_13368 = new BitSet(new long[]{0x0000000000000002L});

}