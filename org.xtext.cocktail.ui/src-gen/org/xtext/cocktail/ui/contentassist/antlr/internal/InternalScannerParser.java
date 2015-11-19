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
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:321:1: ruleStartStates : ( ( rule__StartStates__Group__0 ) ) ;
    public final void ruleStartStates() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:325:2: ( ( ( rule__StartStates__Group__0 ) ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:326:1: ( ( rule__StartStates__Group__0 ) )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:326:1: ( ( rule__StartStates__Group__0 ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:327:1: ( rule__StartStates__Group__0 )
            {
             before(grammarAccess.getStartStatesAccess().getGroup()); 
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:328:1: ( rule__StartStates__Group__0 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:328:2: rule__StartStates__Group__0
            {
            pushFollow(FOLLOW_rule__StartStates__Group__0_in_ruleStartStates634);
            rule__StartStates__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStartStatesAccess().getGroup()); 

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
            pushFollow(FOLLOW_ruleRule_in_entryRuleRule661);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getRuleRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRule668); 

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
            pushFollow(FOLLOW_rule__Rule__Group__0_in_ruleRule694);
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


    // $ANTLR start "entryRuleSingleRule"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:368:1: entryRuleSingleRule : ruleSingleRule EOF ;
    public final void entryRuleSingleRule() throws RecognitionException {
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:369:1: ( ruleSingleRule EOF )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:370:1: ruleSingleRule EOF
            {
             before(grammarAccess.getSingleRuleRule()); 
            pushFollow(FOLLOW_ruleSingleRule_in_entryRuleSingleRule721);
            ruleSingleRule();

            state._fsp--;

             after(grammarAccess.getSingleRuleRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSingleRule728); 

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
    // $ANTLR end "entryRuleSingleRule"


    // $ANTLR start "ruleSingleRule"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:377:1: ruleSingleRule : ( ( rule__SingleRule__Group__0 ) ) ;
    public final void ruleSingleRule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:381:2: ( ( ( rule__SingleRule__Group__0 ) ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:382:1: ( ( rule__SingleRule__Group__0 ) )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:382:1: ( ( rule__SingleRule__Group__0 ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:383:1: ( rule__SingleRule__Group__0 )
            {
             before(grammarAccess.getSingleRuleAccess().getGroup()); 
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:384:1: ( rule__SingleRule__Group__0 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:384:2: rule__SingleRule__Group__0
            {
            pushFollow(FOLLOW_rule__SingleRule__Group__0_in_ruleSingleRule754);
            rule__SingleRule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSingleRuleAccess().getGroup()); 

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
    // $ANTLR end "ruleSingleRule"


    // $ANTLR start "entryRuleRegularExpression"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:396:1: entryRuleRegularExpression : ruleRegularExpression EOF ;
    public final void entryRuleRegularExpression() throws RecognitionException {
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:397:1: ( ruleRegularExpression EOF )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:398:1: ruleRegularExpression EOF
            {
             before(grammarAccess.getRegularExpressionRule()); 
            pushFollow(FOLLOW_ruleRegularExpression_in_entryRuleRegularExpression781);
            ruleRegularExpression();

            state._fsp--;

             after(grammarAccess.getRegularExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRegularExpression788); 

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
    // $ANTLR end "entryRuleRegularExpression"


    // $ANTLR start "ruleRegularExpression"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:405:1: ruleRegularExpression : ( ruleOrExpression ) ;
    public final void ruleRegularExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:409:2: ( ( ruleOrExpression ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:410:1: ( ruleOrExpression )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:410:1: ( ruleOrExpression )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:411:1: ruleOrExpression
            {
             before(grammarAccess.getRegularExpressionAccess().getOrExpressionParserRuleCall()); 
            pushFollow(FOLLOW_ruleOrExpression_in_ruleRegularExpression814);
            ruleOrExpression();

            state._fsp--;

             after(grammarAccess.getRegularExpressionAccess().getOrExpressionParserRuleCall()); 

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
    // $ANTLR end "ruleRegularExpression"


    // $ANTLR start "entryRuleOrExpression"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:424:1: entryRuleOrExpression : ruleOrExpression EOF ;
    public final void entryRuleOrExpression() throws RecognitionException {
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:425:1: ( ruleOrExpression EOF )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:426:1: ruleOrExpression EOF
            {
             before(grammarAccess.getOrExpressionRule()); 
            pushFollow(FOLLOW_ruleOrExpression_in_entryRuleOrExpression840);
            ruleOrExpression();

            state._fsp--;

             after(grammarAccess.getOrExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrExpression847); 

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
    // $ANTLR end "entryRuleOrExpression"


    // $ANTLR start "ruleOrExpression"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:433:1: ruleOrExpression : ( ( rule__OrExpression__Group__0 ) ) ;
    public final void ruleOrExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:437:2: ( ( ( rule__OrExpression__Group__0 ) ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:438:1: ( ( rule__OrExpression__Group__0 ) )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:438:1: ( ( rule__OrExpression__Group__0 ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:439:1: ( rule__OrExpression__Group__0 )
            {
             before(grammarAccess.getOrExpressionAccess().getGroup()); 
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:440:1: ( rule__OrExpression__Group__0 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:440:2: rule__OrExpression__Group__0
            {
            pushFollow(FOLLOW_rule__OrExpression__Group__0_in_ruleOrExpression873);
            rule__OrExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOrExpressionAccess().getGroup()); 

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
    // $ANTLR end "ruleOrExpression"


    // $ANTLR start "entryRuleSequenceExpression"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:452:1: entryRuleSequenceExpression : ruleSequenceExpression EOF ;
    public final void entryRuleSequenceExpression() throws RecognitionException {
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:453:1: ( ruleSequenceExpression EOF )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:454:1: ruleSequenceExpression EOF
            {
             before(grammarAccess.getSequenceExpressionRule()); 
            pushFollow(FOLLOW_ruleSequenceExpression_in_entryRuleSequenceExpression900);
            ruleSequenceExpression();

            state._fsp--;

             after(grammarAccess.getSequenceExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSequenceExpression907); 

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
    // $ANTLR end "entryRuleSequenceExpression"


    // $ANTLR start "ruleSequenceExpression"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:461:1: ruleSequenceExpression : ( ( rule__SequenceExpression__Group__0 ) ) ;
    public final void ruleSequenceExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:465:2: ( ( ( rule__SequenceExpression__Group__0 ) ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:466:1: ( ( rule__SequenceExpression__Group__0 ) )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:466:1: ( ( rule__SequenceExpression__Group__0 ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:467:1: ( rule__SequenceExpression__Group__0 )
            {
             before(grammarAccess.getSequenceExpressionAccess().getGroup()); 
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:468:1: ( rule__SequenceExpression__Group__0 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:468:2: rule__SequenceExpression__Group__0
            {
            pushFollow(FOLLOW_rule__SequenceExpression__Group__0_in_ruleSequenceExpression933);
            rule__SequenceExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSequenceExpressionAccess().getGroup()); 

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
    // $ANTLR end "ruleSequenceExpression"


    // $ANTLR start "entryRuleHighBindExpression"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:480:1: entryRuleHighBindExpression : ruleHighBindExpression EOF ;
    public final void entryRuleHighBindExpression() throws RecognitionException {
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:481:1: ( ruleHighBindExpression EOF )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:482:1: ruleHighBindExpression EOF
            {
             before(grammarAccess.getHighBindExpressionRule()); 
            pushFollow(FOLLOW_ruleHighBindExpression_in_entryRuleHighBindExpression960);
            ruleHighBindExpression();

            state._fsp--;

             after(grammarAccess.getHighBindExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHighBindExpression967); 

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
    // $ANTLR end "entryRuleHighBindExpression"


    // $ANTLR start "ruleHighBindExpression"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:489:1: ruleHighBindExpression : ( ( rule__HighBindExpression__Group__0 ) ) ;
    public final void ruleHighBindExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:493:2: ( ( ( rule__HighBindExpression__Group__0 ) ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:494:1: ( ( rule__HighBindExpression__Group__0 ) )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:494:1: ( ( rule__HighBindExpression__Group__0 ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:495:1: ( rule__HighBindExpression__Group__0 )
            {
             before(grammarAccess.getHighBindExpressionAccess().getGroup()); 
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:496:1: ( rule__HighBindExpression__Group__0 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:496:2: rule__HighBindExpression__Group__0
            {
            pushFollow(FOLLOW_rule__HighBindExpression__Group__0_in_ruleHighBindExpression993);
            rule__HighBindExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHighBindExpressionAccess().getGroup()); 

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
    // $ANTLR end "ruleHighBindExpression"


    // $ANTLR start "entryRuleAtomicExpression"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:508:1: entryRuleAtomicExpression : ruleAtomicExpression EOF ;
    public final void entryRuleAtomicExpression() throws RecognitionException {
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:509:1: ( ruleAtomicExpression EOF )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:510:1: ruleAtomicExpression EOF
            {
             before(grammarAccess.getAtomicExpressionRule()); 
            pushFollow(FOLLOW_ruleAtomicExpression_in_entryRuleAtomicExpression1020);
            ruleAtomicExpression();

            state._fsp--;

             after(grammarAccess.getAtomicExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtomicExpression1027); 

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
    // $ANTLR end "entryRuleAtomicExpression"


    // $ANTLR start "ruleAtomicExpression"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:517:1: ruleAtomicExpression : ( ( rule__AtomicExpression__Alternatives ) ) ;
    public final void ruleAtomicExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:521:2: ( ( ( rule__AtomicExpression__Alternatives ) ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:522:1: ( ( rule__AtomicExpression__Alternatives ) )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:522:1: ( ( rule__AtomicExpression__Alternatives ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:523:1: ( rule__AtomicExpression__Alternatives )
            {
             before(grammarAccess.getAtomicExpressionAccess().getAlternatives()); 
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:524:1: ( rule__AtomicExpression__Alternatives )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:524:2: rule__AtomicExpression__Alternatives
            {
            pushFollow(FOLLOW_rule__AtomicExpression__Alternatives_in_ruleAtomicExpression1053);
            rule__AtomicExpression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAtomicExpressionAccess().getAlternatives()); 

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
    // $ANTLR end "ruleAtomicExpression"


    // $ANTLR start "entryRuleBracedExpression"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:536:1: entryRuleBracedExpression : ruleBracedExpression EOF ;
    public final void entryRuleBracedExpression() throws RecognitionException {
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:537:1: ( ruleBracedExpression EOF )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:538:1: ruleBracedExpression EOF
            {
             before(grammarAccess.getBracedExpressionRule()); 
            pushFollow(FOLLOW_ruleBracedExpression_in_entryRuleBracedExpression1080);
            ruleBracedExpression();

            state._fsp--;

             after(grammarAccess.getBracedExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBracedExpression1087); 

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
    // $ANTLR end "entryRuleBracedExpression"


    // $ANTLR start "ruleBracedExpression"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:545:1: ruleBracedExpression : ( ( rule__BracedExpression__Group__0 ) ) ;
    public final void ruleBracedExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:549:2: ( ( ( rule__BracedExpression__Group__0 ) ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:550:1: ( ( rule__BracedExpression__Group__0 ) )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:550:1: ( ( rule__BracedExpression__Group__0 ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:551:1: ( rule__BracedExpression__Group__0 )
            {
             before(grammarAccess.getBracedExpressionAccess().getGroup()); 
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:552:1: ( rule__BracedExpression__Group__0 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:552:2: rule__BracedExpression__Group__0
            {
            pushFollow(FOLLOW_rule__BracedExpression__Group__0_in_ruleBracedExpression1113);
            rule__BracedExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBracedExpressionAccess().getGroup()); 

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
    // $ANTLR end "ruleBracedExpression"


    // $ANTLR start "entryRuleAtom"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:564:1: entryRuleAtom : ruleAtom EOF ;
    public final void entryRuleAtom() throws RecognitionException {
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:565:1: ( ruleAtom EOF )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:566:1: ruleAtom EOF
            {
             before(grammarAccess.getAtomRule()); 
            pushFollow(FOLLOW_ruleAtom_in_entryRuleAtom1140);
            ruleAtom();

            state._fsp--;

             after(grammarAccess.getAtomRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtom1147); 

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
    // $ANTLR end "entryRuleAtom"


    // $ANTLR start "ruleAtom"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:573:1: ruleAtom : ( ( rule__Atom__ValueAssignment ) ) ;
    public final void ruleAtom() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:577:2: ( ( ( rule__Atom__ValueAssignment ) ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:578:1: ( ( rule__Atom__ValueAssignment ) )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:578:1: ( ( rule__Atom__ValueAssignment ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:579:1: ( rule__Atom__ValueAssignment )
            {
             before(grammarAccess.getAtomAccess().getValueAssignment()); 
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:580:1: ( rule__Atom__ValueAssignment )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:580:2: rule__Atom__ValueAssignment
            {
            pushFollow(FOLLOW_rule__Atom__ValueAssignment_in_ruleAtom1173);
            rule__Atom__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getAtomAccess().getValueAssignment()); 

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
    // $ANTLR end "ruleAtom"


    // $ANTLR start "rule__AtomicExpression__Alternatives"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:592:1: rule__AtomicExpression__Alternatives : ( ( ruleBracedExpression ) | ( ruleAtom ) );
    public final void rule__AtomicExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:596:1: ( ( ruleBracedExpression ) | ( ruleAtom ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==28) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_CHAR) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:597:1: ( ruleBracedExpression )
                    {
                    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:597:1: ( ruleBracedExpression )
                    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:598:1: ruleBracedExpression
                    {
                     before(grammarAccess.getAtomicExpressionAccess().getBracedExpressionParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleBracedExpression_in_rule__AtomicExpression__Alternatives1209);
                    ruleBracedExpression();

                    state._fsp--;

                     after(grammarAccess.getAtomicExpressionAccess().getBracedExpressionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:603:6: ( ruleAtom )
                    {
                    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:603:6: ( ruleAtom )
                    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:604:1: ruleAtom
                    {
                     before(grammarAccess.getAtomicExpressionAccess().getAtomParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleAtom_in_rule__AtomicExpression__Alternatives1226);
                    ruleAtom();

                    state._fsp--;

                     after(grammarAccess.getAtomicExpressionAccess().getAtomParserRuleCall_1()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__AtomicExpression__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:616:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:620:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:621:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__01256);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__1_in_rule__Model__Group__01259);
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
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:628:1: rule__Model__Group__0__Impl : ( ( rule__Model__ScannerAssignment_0 ) ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:632:1: ( ( ( rule__Model__ScannerAssignment_0 ) ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:633:1: ( ( rule__Model__ScannerAssignment_0 ) )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:633:1: ( ( rule__Model__ScannerAssignment_0 ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:634:1: ( rule__Model__ScannerAssignment_0 )
            {
             before(grammarAccess.getModelAccess().getScannerAssignment_0()); 
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:635:1: ( rule__Model__ScannerAssignment_0 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:635:2: rule__Model__ScannerAssignment_0
            {
            pushFollow(FOLLOW_rule__Model__ScannerAssignment_0_in_rule__Model__Group__0__Impl1286);
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
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:645:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:649:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:650:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__11316);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__2_in_rule__Model__Group__11319);
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
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:657:1: rule__Model__Group__1__Impl : ( ( rule__Model__ScannerAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:661:1: ( ( ( rule__Model__ScannerAssignment_1 ) ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:662:1: ( ( rule__Model__ScannerAssignment_1 ) )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:662:1: ( ( rule__Model__ScannerAssignment_1 ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:663:1: ( rule__Model__ScannerAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getScannerAssignment_1()); 
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:664:1: ( rule__Model__ScannerAssignment_1 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:664:2: rule__Model__ScannerAssignment_1
            {
            pushFollow(FOLLOW_rule__Model__ScannerAssignment_1_in_rule__Model__Group__1__Impl1346);
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
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:674:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:678:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:679:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__21376);
            rule__Model__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__3_in_rule__Model__Group__21379);
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
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:686:1: rule__Model__Group__2__Impl : ( ( rule__Model__ScannerAssignment_2 ) ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:690:1: ( ( ( rule__Model__ScannerAssignment_2 ) ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:691:1: ( ( rule__Model__ScannerAssignment_2 ) )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:691:1: ( ( rule__Model__ScannerAssignment_2 ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:692:1: ( rule__Model__ScannerAssignment_2 )
            {
             before(grammarAccess.getModelAccess().getScannerAssignment_2()); 
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:693:1: ( rule__Model__ScannerAssignment_2 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:693:2: rule__Model__ScannerAssignment_2
            {
            pushFollow(FOLLOW_rule__Model__ScannerAssignment_2_in_rule__Model__Group__2__Impl1406);
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
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:703:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:707:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:708:2: rule__Model__Group__3__Impl rule__Model__Group__4
            {
            pushFollow(FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__31436);
            rule__Model__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__4_in_rule__Model__Group__31439);
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
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:715:1: rule__Model__Group__3__Impl : ( ( rule__Model__ScannerAssignment_3 ) ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:719:1: ( ( ( rule__Model__ScannerAssignment_3 ) ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:720:1: ( ( rule__Model__ScannerAssignment_3 ) )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:720:1: ( ( rule__Model__ScannerAssignment_3 ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:721:1: ( rule__Model__ScannerAssignment_3 )
            {
             before(grammarAccess.getModelAccess().getScannerAssignment_3()); 
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:722:1: ( rule__Model__ScannerAssignment_3 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:722:2: rule__Model__ScannerAssignment_3
            {
            pushFollow(FOLLOW_rule__Model__ScannerAssignment_3_in_rule__Model__Group__3__Impl1466);
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
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:732:1: rule__Model__Group__4 : rule__Model__Group__4__Impl rule__Model__Group__5 ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:736:1: ( rule__Model__Group__4__Impl rule__Model__Group__5 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:737:2: rule__Model__Group__4__Impl rule__Model__Group__5
            {
            pushFollow(FOLLOW_rule__Model__Group__4__Impl_in_rule__Model__Group__41496);
            rule__Model__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__5_in_rule__Model__Group__41499);
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
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:744:1: rule__Model__Group__4__Impl : ( ( rule__Model__ScannerAssignment_4 ) ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:748:1: ( ( ( rule__Model__ScannerAssignment_4 ) ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:749:1: ( ( rule__Model__ScannerAssignment_4 ) )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:749:1: ( ( rule__Model__ScannerAssignment_4 ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:750:1: ( rule__Model__ScannerAssignment_4 )
            {
             before(grammarAccess.getModelAccess().getScannerAssignment_4()); 
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:751:1: ( rule__Model__ScannerAssignment_4 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:751:2: rule__Model__ScannerAssignment_4
            {
            pushFollow(FOLLOW_rule__Model__ScannerAssignment_4_in_rule__Model__Group__4__Impl1526);
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
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:761:1: rule__Model__Group__5 : rule__Model__Group__5__Impl rule__Model__Group__6 ;
    public final void rule__Model__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:765:1: ( rule__Model__Group__5__Impl rule__Model__Group__6 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:766:2: rule__Model__Group__5__Impl rule__Model__Group__6
            {
            pushFollow(FOLLOW_rule__Model__Group__5__Impl_in_rule__Model__Group__51556);
            rule__Model__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__6_in_rule__Model__Group__51559);
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
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:773:1: rule__Model__Group__5__Impl : ( ( rule__Model__ScannerAssignment_5 ) ) ;
    public final void rule__Model__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:777:1: ( ( ( rule__Model__ScannerAssignment_5 ) ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:778:1: ( ( rule__Model__ScannerAssignment_5 ) )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:778:1: ( ( rule__Model__ScannerAssignment_5 ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:779:1: ( rule__Model__ScannerAssignment_5 )
            {
             before(grammarAccess.getModelAccess().getScannerAssignment_5()); 
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:780:1: ( rule__Model__ScannerAssignment_5 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:780:2: rule__Model__ScannerAssignment_5
            {
            pushFollow(FOLLOW_rule__Model__ScannerAssignment_5_in_rule__Model__Group__5__Impl1586);
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
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:790:1: rule__Model__Group__6 : rule__Model__Group__6__Impl rule__Model__Group__7 ;
    public final void rule__Model__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:794:1: ( rule__Model__Group__6__Impl rule__Model__Group__7 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:795:2: rule__Model__Group__6__Impl rule__Model__Group__7
            {
            pushFollow(FOLLOW_rule__Model__Group__6__Impl_in_rule__Model__Group__61616);
            rule__Model__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__7_in_rule__Model__Group__61619);
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
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:802:1: rule__Model__Group__6__Impl : ( ( rule__Model__ScannerAssignment_6 ) ) ;
    public final void rule__Model__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:806:1: ( ( ( rule__Model__ScannerAssignment_6 ) ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:807:1: ( ( rule__Model__ScannerAssignment_6 ) )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:807:1: ( ( rule__Model__ScannerAssignment_6 ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:808:1: ( rule__Model__ScannerAssignment_6 )
            {
             before(grammarAccess.getModelAccess().getScannerAssignment_6()); 
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:809:1: ( rule__Model__ScannerAssignment_6 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:809:2: rule__Model__ScannerAssignment_6
            {
            pushFollow(FOLLOW_rule__Model__ScannerAssignment_6_in_rule__Model__Group__6__Impl1646);
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
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:819:1: rule__Model__Group__7 : rule__Model__Group__7__Impl rule__Model__Group__8 ;
    public final void rule__Model__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:823:1: ( rule__Model__Group__7__Impl rule__Model__Group__8 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:824:2: rule__Model__Group__7__Impl rule__Model__Group__8
            {
            pushFollow(FOLLOW_rule__Model__Group__7__Impl_in_rule__Model__Group__71676);
            rule__Model__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__8_in_rule__Model__Group__71679);
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
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:831:1: rule__Model__Group__7__Impl : ( ( rule__Model__ScannerAssignment_7 ) ) ;
    public final void rule__Model__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:835:1: ( ( ( rule__Model__ScannerAssignment_7 ) ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:836:1: ( ( rule__Model__ScannerAssignment_7 ) )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:836:1: ( ( rule__Model__ScannerAssignment_7 ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:837:1: ( rule__Model__ScannerAssignment_7 )
            {
             before(grammarAccess.getModelAccess().getScannerAssignment_7()); 
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:838:1: ( rule__Model__ScannerAssignment_7 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:838:2: rule__Model__ScannerAssignment_7
            {
            pushFollow(FOLLOW_rule__Model__ScannerAssignment_7_in_rule__Model__Group__7__Impl1706);
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
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:848:1: rule__Model__Group__8 : rule__Model__Group__8__Impl ;
    public final void rule__Model__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:852:1: ( rule__Model__Group__8__Impl )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:853:2: rule__Model__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group__8__Impl_in_rule__Model__Group__81736);
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
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:859:1: rule__Model__Group__8__Impl : ( ( rule__Model__ScannerAssignment_8 ) ) ;
    public final void rule__Model__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:863:1: ( ( ( rule__Model__ScannerAssignment_8 ) ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:864:1: ( ( rule__Model__ScannerAssignment_8 ) )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:864:1: ( ( rule__Model__ScannerAssignment_8 ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:865:1: ( rule__Model__ScannerAssignment_8 )
            {
             before(grammarAccess.getModelAccess().getScannerAssignment_8()); 
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:866:1: ( rule__Model__ScannerAssignment_8 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:866:2: rule__Model__ScannerAssignment_8
            {
            pushFollow(FOLLOW_rule__Model__ScannerAssignment_8_in_rule__Model__Group__8__Impl1763);
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
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:894:1: rule__Title__Group__0 : rule__Title__Group__0__Impl rule__Title__Group__1 ;
    public final void rule__Title__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:898:1: ( rule__Title__Group__0__Impl rule__Title__Group__1 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:899:2: rule__Title__Group__0__Impl rule__Title__Group__1
            {
            pushFollow(FOLLOW_rule__Title__Group__0__Impl_in_rule__Title__Group__01811);
            rule__Title__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Title__Group__1_in_rule__Title__Group__01814);
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
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:906:1: rule__Title__Group__0__Impl : ( 'SCANNER' ) ;
    public final void rule__Title__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:910:1: ( ( 'SCANNER' ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:911:1: ( 'SCANNER' )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:911:1: ( 'SCANNER' )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:912:1: 'SCANNER'
            {
             before(grammarAccess.getTitleAccess().getSCANNERKeyword_0()); 
            match(input,12,FOLLOW_12_in_rule__Title__Group__0__Impl1842); 
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
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:925:1: rule__Title__Group__1 : rule__Title__Group__1__Impl ;
    public final void rule__Title__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:929:1: ( rule__Title__Group__1__Impl )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:930:2: rule__Title__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Title__Group__1__Impl_in_rule__Title__Group__11873);
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
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:936:1: rule__Title__Group__1__Impl : ( ( rule__Title__NameAssignment_1 ) ) ;
    public final void rule__Title__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:940:1: ( ( ( rule__Title__NameAssignment_1 ) ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:941:1: ( ( rule__Title__NameAssignment_1 ) )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:941:1: ( ( rule__Title__NameAssignment_1 ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:942:1: ( rule__Title__NameAssignment_1 )
            {
             before(grammarAccess.getTitleAccess().getNameAssignment_1()); 
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:943:1: ( rule__Title__NameAssignment_1 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:943:2: rule__Title__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Title__NameAssignment_1_in_rule__Title__Group__1__Impl1900);
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
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:957:1: rule__Export__Group__0 : rule__Export__Group__0__Impl rule__Export__Group__1 ;
    public final void rule__Export__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:961:1: ( rule__Export__Group__0__Impl rule__Export__Group__1 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:962:2: rule__Export__Group__0__Impl rule__Export__Group__1
            {
            pushFollow(FOLLOW_rule__Export__Group__0__Impl_in_rule__Export__Group__01934);
            rule__Export__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Export__Group__1_in_rule__Export__Group__01937);
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
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:969:1: rule__Export__Group__0__Impl : ( 'EXPORT {' ) ;
    public final void rule__Export__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:973:1: ( ( 'EXPORT {' ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:974:1: ( 'EXPORT {' )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:974:1: ( 'EXPORT {' )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:975:1: 'EXPORT {'
            {
             before(grammarAccess.getExportAccess().getEXPORTKeyword_0()); 
            match(input,13,FOLLOW_13_in_rule__Export__Group__0__Impl1965); 
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
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:988:1: rule__Export__Group__1 : rule__Export__Group__1__Impl rule__Export__Group__2 ;
    public final void rule__Export__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:992:1: ( rule__Export__Group__1__Impl rule__Export__Group__2 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:993:2: rule__Export__Group__1__Impl rule__Export__Group__2
            {
            pushFollow(FOLLOW_rule__Export__Group__1__Impl_in_rule__Export__Group__11996);
            rule__Export__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Export__Group__2_in_rule__Export__Group__11999);
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
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1000:1: rule__Export__Group__1__Impl : ( ( rule__Export__ContentAssignment_1 ) ) ;
    public final void rule__Export__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1004:1: ( ( ( rule__Export__ContentAssignment_1 ) ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1005:1: ( ( rule__Export__ContentAssignment_1 ) )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1005:1: ( ( rule__Export__ContentAssignment_1 ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1006:1: ( rule__Export__ContentAssignment_1 )
            {
             before(grammarAccess.getExportAccess().getContentAssignment_1()); 
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1007:1: ( rule__Export__ContentAssignment_1 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1007:2: rule__Export__ContentAssignment_1
            {
            pushFollow(FOLLOW_rule__Export__ContentAssignment_1_in_rule__Export__Group__1__Impl2026);
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
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1017:1: rule__Export__Group__2 : rule__Export__Group__2__Impl ;
    public final void rule__Export__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1021:1: ( rule__Export__Group__2__Impl )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1022:2: rule__Export__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Export__Group__2__Impl_in_rule__Export__Group__22056);
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
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1028:1: rule__Export__Group__2__Impl : ( '}' ) ;
    public final void rule__Export__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1032:1: ( ( '}' ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1033:1: ( '}' )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1033:1: ( '}' )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1034:1: '}'
            {
             before(grammarAccess.getExportAccess().getRightCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_14_in_rule__Export__Group__2__Impl2084); 
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
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1053:1: rule__Global__Group__0 : rule__Global__Group__0__Impl rule__Global__Group__1 ;
    public final void rule__Global__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1057:1: ( rule__Global__Group__0__Impl rule__Global__Group__1 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1058:2: rule__Global__Group__0__Impl rule__Global__Group__1
            {
            pushFollow(FOLLOW_rule__Global__Group__0__Impl_in_rule__Global__Group__02121);
            rule__Global__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Global__Group__1_in_rule__Global__Group__02124);
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
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1065:1: rule__Global__Group__0__Impl : ( 'GLOBAL {' ) ;
    public final void rule__Global__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1069:1: ( ( 'GLOBAL {' ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1070:1: ( 'GLOBAL {' )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1070:1: ( 'GLOBAL {' )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1071:1: 'GLOBAL {'
            {
             before(grammarAccess.getGlobalAccess().getGLOBALKeyword_0()); 
            match(input,15,FOLLOW_15_in_rule__Global__Group__0__Impl2152); 
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
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1084:1: rule__Global__Group__1 : rule__Global__Group__1__Impl rule__Global__Group__2 ;
    public final void rule__Global__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1088:1: ( rule__Global__Group__1__Impl rule__Global__Group__2 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1089:2: rule__Global__Group__1__Impl rule__Global__Group__2
            {
            pushFollow(FOLLOW_rule__Global__Group__1__Impl_in_rule__Global__Group__12183);
            rule__Global__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Global__Group__2_in_rule__Global__Group__12186);
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
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1096:1: rule__Global__Group__1__Impl : ( ( rule__Global__ContentAssignment_1 ) ) ;
    public final void rule__Global__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1100:1: ( ( ( rule__Global__ContentAssignment_1 ) ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1101:1: ( ( rule__Global__ContentAssignment_1 ) )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1101:1: ( ( rule__Global__ContentAssignment_1 ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1102:1: ( rule__Global__ContentAssignment_1 )
            {
             before(grammarAccess.getGlobalAccess().getContentAssignment_1()); 
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1103:1: ( rule__Global__ContentAssignment_1 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1103:2: rule__Global__ContentAssignment_1
            {
            pushFollow(FOLLOW_rule__Global__ContentAssignment_1_in_rule__Global__Group__1__Impl2213);
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
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1113:1: rule__Global__Group__2 : rule__Global__Group__2__Impl ;
    public final void rule__Global__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1117:1: ( rule__Global__Group__2__Impl )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1118:2: rule__Global__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Global__Group__2__Impl_in_rule__Global__Group__22243);
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
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1124:1: rule__Global__Group__2__Impl : ( '}' ) ;
    public final void rule__Global__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1128:1: ( ( '}' ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1129:1: ( '}' )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1129:1: ( '}' )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1130:1: '}'
            {
             before(grammarAccess.getGlobalAccess().getRightCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_14_in_rule__Global__Group__2__Impl2271); 
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
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1149:1: rule__Local__Group__0 : rule__Local__Group__0__Impl rule__Local__Group__1 ;
    public final void rule__Local__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1153:1: ( rule__Local__Group__0__Impl rule__Local__Group__1 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1154:2: rule__Local__Group__0__Impl rule__Local__Group__1
            {
            pushFollow(FOLLOW_rule__Local__Group__0__Impl_in_rule__Local__Group__02308);
            rule__Local__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Local__Group__1_in_rule__Local__Group__02311);
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
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1161:1: rule__Local__Group__0__Impl : ( 'LOCAL {' ) ;
    public final void rule__Local__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1165:1: ( ( 'LOCAL {' ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1166:1: ( 'LOCAL {' )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1166:1: ( 'LOCAL {' )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1167:1: 'LOCAL {'
            {
             before(grammarAccess.getLocalAccess().getLOCALKeyword_0()); 
            match(input,16,FOLLOW_16_in_rule__Local__Group__0__Impl2339); 
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
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1180:1: rule__Local__Group__1 : rule__Local__Group__1__Impl rule__Local__Group__2 ;
    public final void rule__Local__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1184:1: ( rule__Local__Group__1__Impl rule__Local__Group__2 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1185:2: rule__Local__Group__1__Impl rule__Local__Group__2
            {
            pushFollow(FOLLOW_rule__Local__Group__1__Impl_in_rule__Local__Group__12370);
            rule__Local__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Local__Group__2_in_rule__Local__Group__12373);
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
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1192:1: rule__Local__Group__1__Impl : ( ( rule__Local__ContentAssignment_1 ) ) ;
    public final void rule__Local__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1196:1: ( ( ( rule__Local__ContentAssignment_1 ) ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1197:1: ( ( rule__Local__ContentAssignment_1 ) )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1197:1: ( ( rule__Local__ContentAssignment_1 ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1198:1: ( rule__Local__ContentAssignment_1 )
            {
             before(grammarAccess.getLocalAccess().getContentAssignment_1()); 
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1199:1: ( rule__Local__ContentAssignment_1 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1199:2: rule__Local__ContentAssignment_1
            {
            pushFollow(FOLLOW_rule__Local__ContentAssignment_1_in_rule__Local__Group__1__Impl2400);
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
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1209:1: rule__Local__Group__2 : rule__Local__Group__2__Impl ;
    public final void rule__Local__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1213:1: ( rule__Local__Group__2__Impl )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1214:2: rule__Local__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Local__Group__2__Impl_in_rule__Local__Group__22430);
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
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1220:1: rule__Local__Group__2__Impl : ( '}' ) ;
    public final void rule__Local__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1224:1: ( ( '}' ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1225:1: ( '}' )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1225:1: ( '}' )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1226:1: '}'
            {
             before(grammarAccess.getLocalAccess().getRightCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_14_in_rule__Local__Group__2__Impl2458); 
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
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1245:1: rule__Default__Group__0 : rule__Default__Group__0__Impl rule__Default__Group__1 ;
    public final void rule__Default__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1249:1: ( rule__Default__Group__0__Impl rule__Default__Group__1 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1250:2: rule__Default__Group__0__Impl rule__Default__Group__1
            {
            pushFollow(FOLLOW_rule__Default__Group__0__Impl_in_rule__Default__Group__02495);
            rule__Default__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Default__Group__1_in_rule__Default__Group__02498);
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
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1257:1: rule__Default__Group__0__Impl : ( 'DEFAULT {' ) ;
    public final void rule__Default__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1261:1: ( ( 'DEFAULT {' ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1262:1: ( 'DEFAULT {' )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1262:1: ( 'DEFAULT {' )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1263:1: 'DEFAULT {'
            {
             before(grammarAccess.getDefaultAccess().getDEFAULTKeyword_0()); 
            match(input,17,FOLLOW_17_in_rule__Default__Group__0__Impl2526); 
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
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1276:1: rule__Default__Group__1 : rule__Default__Group__1__Impl rule__Default__Group__2 ;
    public final void rule__Default__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1280:1: ( rule__Default__Group__1__Impl rule__Default__Group__2 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1281:2: rule__Default__Group__1__Impl rule__Default__Group__2
            {
            pushFollow(FOLLOW_rule__Default__Group__1__Impl_in_rule__Default__Group__12557);
            rule__Default__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Default__Group__2_in_rule__Default__Group__12560);
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
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1288:1: rule__Default__Group__1__Impl : ( ( rule__Default__ContentAssignment_1 ) ) ;
    public final void rule__Default__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1292:1: ( ( ( rule__Default__ContentAssignment_1 ) ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1293:1: ( ( rule__Default__ContentAssignment_1 ) )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1293:1: ( ( rule__Default__ContentAssignment_1 ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1294:1: ( rule__Default__ContentAssignment_1 )
            {
             before(grammarAccess.getDefaultAccess().getContentAssignment_1()); 
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1295:1: ( rule__Default__ContentAssignment_1 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1295:2: rule__Default__ContentAssignment_1
            {
            pushFollow(FOLLOW_rule__Default__ContentAssignment_1_in_rule__Default__Group__1__Impl2587);
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
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1305:1: rule__Default__Group__2 : rule__Default__Group__2__Impl ;
    public final void rule__Default__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1309:1: ( rule__Default__Group__2__Impl )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1310:2: rule__Default__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Default__Group__2__Impl_in_rule__Default__Group__22617);
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
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1316:1: rule__Default__Group__2__Impl : ( '}' ) ;
    public final void rule__Default__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1320:1: ( ( '}' ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1321:1: ( '}' )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1321:1: ( '}' )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1322:1: '}'
            {
             before(grammarAccess.getDefaultAccess().getRightCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_14_in_rule__Default__Group__2__Impl2645); 
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
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1341:1: rule__Eof__Group__0 : rule__Eof__Group__0__Impl rule__Eof__Group__1 ;
    public final void rule__Eof__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1345:1: ( rule__Eof__Group__0__Impl rule__Eof__Group__1 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1346:2: rule__Eof__Group__0__Impl rule__Eof__Group__1
            {
            pushFollow(FOLLOW_rule__Eof__Group__0__Impl_in_rule__Eof__Group__02682);
            rule__Eof__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Eof__Group__1_in_rule__Eof__Group__02685);
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
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1353:1: rule__Eof__Group__0__Impl : ( 'EOF {' ) ;
    public final void rule__Eof__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1357:1: ( ( 'EOF {' ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1358:1: ( 'EOF {' )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1358:1: ( 'EOF {' )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1359:1: 'EOF {'
            {
             before(grammarAccess.getEofAccess().getEOFKeyword_0()); 
            match(input,18,FOLLOW_18_in_rule__Eof__Group__0__Impl2713); 
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
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1372:1: rule__Eof__Group__1 : rule__Eof__Group__1__Impl rule__Eof__Group__2 ;
    public final void rule__Eof__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1376:1: ( rule__Eof__Group__1__Impl rule__Eof__Group__2 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1377:2: rule__Eof__Group__1__Impl rule__Eof__Group__2
            {
            pushFollow(FOLLOW_rule__Eof__Group__1__Impl_in_rule__Eof__Group__12744);
            rule__Eof__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Eof__Group__2_in_rule__Eof__Group__12747);
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
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1384:1: rule__Eof__Group__1__Impl : ( ( rule__Eof__ContentAssignment_1 ) ) ;
    public final void rule__Eof__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1388:1: ( ( ( rule__Eof__ContentAssignment_1 ) ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1389:1: ( ( rule__Eof__ContentAssignment_1 ) )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1389:1: ( ( rule__Eof__ContentAssignment_1 ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1390:1: ( rule__Eof__ContentAssignment_1 )
            {
             before(grammarAccess.getEofAccess().getContentAssignment_1()); 
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1391:1: ( rule__Eof__ContentAssignment_1 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1391:2: rule__Eof__ContentAssignment_1
            {
            pushFollow(FOLLOW_rule__Eof__ContentAssignment_1_in_rule__Eof__Group__1__Impl2774);
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
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1401:1: rule__Eof__Group__2 : rule__Eof__Group__2__Impl ;
    public final void rule__Eof__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1405:1: ( rule__Eof__Group__2__Impl )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1406:2: rule__Eof__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Eof__Group__2__Impl_in_rule__Eof__Group__22804);
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
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1412:1: rule__Eof__Group__2__Impl : ( '}' ) ;
    public final void rule__Eof__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1416:1: ( ( '}' ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1417:1: ( '}' )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1417:1: ( '}' )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1418:1: '}'
            {
             before(grammarAccess.getEofAccess().getRightCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_14_in_rule__Eof__Group__2__Impl2832); 
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
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1437:1: rule__Define__Group__0 : rule__Define__Group__0__Impl rule__Define__Group__1 ;
    public final void rule__Define__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1441:1: ( rule__Define__Group__0__Impl rule__Define__Group__1 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1442:2: rule__Define__Group__0__Impl rule__Define__Group__1
            {
            pushFollow(FOLLOW_rule__Define__Group__0__Impl_in_rule__Define__Group__02869);
            rule__Define__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Define__Group__1_in_rule__Define__Group__02872);
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
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1449:1: rule__Define__Group__0__Impl : ( 'DEFINE' ) ;
    public final void rule__Define__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1453:1: ( ( 'DEFINE' ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1454:1: ( 'DEFINE' )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1454:1: ( 'DEFINE' )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1455:1: 'DEFINE'
            {
             before(grammarAccess.getDefineAccess().getDEFINEKeyword_0()); 
            match(input,19,FOLLOW_19_in_rule__Define__Group__0__Impl2900); 
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
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1468:1: rule__Define__Group__1 : rule__Define__Group__1__Impl ;
    public final void rule__Define__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1472:1: ( rule__Define__Group__1__Impl )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1473:2: rule__Define__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Define__Group__1__Impl_in_rule__Define__Group__12931);
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
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1479:1: rule__Define__Group__1__Impl : ( ( ( rule__Define__DefinesAssignment_1 ) ) ( ( rule__Define__DefinesAssignment_1 )* ) ) ;
    public final void rule__Define__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1483:1: ( ( ( ( rule__Define__DefinesAssignment_1 ) ) ( ( rule__Define__DefinesAssignment_1 )* ) ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1484:1: ( ( ( rule__Define__DefinesAssignment_1 ) ) ( ( rule__Define__DefinesAssignment_1 )* ) )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1484:1: ( ( ( rule__Define__DefinesAssignment_1 ) ) ( ( rule__Define__DefinesAssignment_1 )* ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1485:1: ( ( rule__Define__DefinesAssignment_1 ) ) ( ( rule__Define__DefinesAssignment_1 )* )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1485:1: ( ( rule__Define__DefinesAssignment_1 ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1486:1: ( rule__Define__DefinesAssignment_1 )
            {
             before(grammarAccess.getDefineAccess().getDefinesAssignment_1()); 
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1487:1: ( rule__Define__DefinesAssignment_1 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1487:2: rule__Define__DefinesAssignment_1
            {
            pushFollow(FOLLOW_rule__Define__DefinesAssignment_1_in_rule__Define__Group__1__Impl2960);
            rule__Define__DefinesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDefineAccess().getDefinesAssignment_1()); 

            }

            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1490:1: ( ( rule__Define__DefinesAssignment_1 )* )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1491:1: ( rule__Define__DefinesAssignment_1 )*
            {
             before(grammarAccess.getDefineAccess().getDefinesAssignment_1()); 
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1492:1: ( rule__Define__DefinesAssignment_1 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1492:2: rule__Define__DefinesAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Define__DefinesAssignment_1_in_rule__Define__Group__1__Impl2972);
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
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1507:1: rule__DefineRule__Group__0 : rule__DefineRule__Group__0__Impl rule__DefineRule__Group__1 ;
    public final void rule__DefineRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1511:1: ( rule__DefineRule__Group__0__Impl rule__DefineRule__Group__1 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1512:2: rule__DefineRule__Group__0__Impl rule__DefineRule__Group__1
            {
            pushFollow(FOLLOW_rule__DefineRule__Group__0__Impl_in_rule__DefineRule__Group__03009);
            rule__DefineRule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DefineRule__Group__1_in_rule__DefineRule__Group__03012);
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
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1519:1: rule__DefineRule__Group__0__Impl : ( ( rule__DefineRule__DefineNameAssignment_0 ) ) ;
    public final void rule__DefineRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1523:1: ( ( ( rule__DefineRule__DefineNameAssignment_0 ) ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1524:1: ( ( rule__DefineRule__DefineNameAssignment_0 ) )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1524:1: ( ( rule__DefineRule__DefineNameAssignment_0 ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1525:1: ( rule__DefineRule__DefineNameAssignment_0 )
            {
             before(grammarAccess.getDefineRuleAccess().getDefineNameAssignment_0()); 
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1526:1: ( rule__DefineRule__DefineNameAssignment_0 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1526:2: rule__DefineRule__DefineNameAssignment_0
            {
            pushFollow(FOLLOW_rule__DefineRule__DefineNameAssignment_0_in_rule__DefineRule__Group__0__Impl3039);
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
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1536:1: rule__DefineRule__Group__1 : rule__DefineRule__Group__1__Impl rule__DefineRule__Group__2 ;
    public final void rule__DefineRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1540:1: ( rule__DefineRule__Group__1__Impl rule__DefineRule__Group__2 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1541:2: rule__DefineRule__Group__1__Impl rule__DefineRule__Group__2
            {
            pushFollow(FOLLOW_rule__DefineRule__Group__1__Impl_in_rule__DefineRule__Group__13069);
            rule__DefineRule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DefineRule__Group__2_in_rule__DefineRule__Group__13072);
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
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1548:1: rule__DefineRule__Group__1__Impl : ( '=' ) ;
    public final void rule__DefineRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1552:1: ( ( '=' ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1553:1: ( '=' )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1553:1: ( '=' )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1554:1: '='
            {
             before(grammarAccess.getDefineRuleAccess().getEqualsSignKeyword_1()); 
            match(input,20,FOLLOW_20_in_rule__DefineRule__Group__1__Impl3100); 
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
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1567:1: rule__DefineRule__Group__2 : rule__DefineRule__Group__2__Impl ;
    public final void rule__DefineRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1571:1: ( rule__DefineRule__Group__2__Impl )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1572:2: rule__DefineRule__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__DefineRule__Group__2__Impl_in_rule__DefineRule__Group__23131);
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
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1578:1: rule__DefineRule__Group__2__Impl : ( ( rule__DefineRule__DefineRuleAssignment_2 ) ) ;
    public final void rule__DefineRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1582:1: ( ( ( rule__DefineRule__DefineRuleAssignment_2 ) ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1583:1: ( ( rule__DefineRule__DefineRuleAssignment_2 ) )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1583:1: ( ( rule__DefineRule__DefineRuleAssignment_2 ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1584:1: ( rule__DefineRule__DefineRuleAssignment_2 )
            {
             before(grammarAccess.getDefineRuleAccess().getDefineRuleAssignment_2()); 
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1585:1: ( rule__DefineRule__DefineRuleAssignment_2 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1585:2: rule__DefineRule__DefineRuleAssignment_2
            {
            pushFollow(FOLLOW_rule__DefineRule__DefineRuleAssignment_2_in_rule__DefineRule__Group__2__Impl3158);
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


    // $ANTLR start "rule__StartStates__Group__0"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1601:1: rule__StartStates__Group__0 : rule__StartStates__Group__0__Impl rule__StartStates__Group__1 ;
    public final void rule__StartStates__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1605:1: ( rule__StartStates__Group__0__Impl rule__StartStates__Group__1 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1606:2: rule__StartStates__Group__0__Impl rule__StartStates__Group__1
            {
            pushFollow(FOLLOW_rule__StartStates__Group__0__Impl_in_rule__StartStates__Group__03194);
            rule__StartStates__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StartStates__Group__1_in_rule__StartStates__Group__03197);
            rule__StartStates__Group__1();

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
    // $ANTLR end "rule__StartStates__Group__0"


    // $ANTLR start "rule__StartStates__Group__0__Impl"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1613:1: rule__StartStates__Group__0__Impl : ( 'START' ) ;
    public final void rule__StartStates__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1617:1: ( ( 'START' ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1618:1: ( 'START' )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1618:1: ( 'START' )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1619:1: 'START'
            {
             before(grammarAccess.getStartStatesAccess().getSTARTKeyword_0()); 
            match(input,21,FOLLOW_21_in_rule__StartStates__Group__0__Impl3225); 
             after(grammarAccess.getStartStatesAccess().getSTARTKeyword_0()); 

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
    // $ANTLR end "rule__StartStates__Group__0__Impl"


    // $ANTLR start "rule__StartStates__Group__1"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1632:1: rule__StartStates__Group__1 : rule__StartStates__Group__1__Impl rule__StartStates__Group__2 ;
    public final void rule__StartStates__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1636:1: ( rule__StartStates__Group__1__Impl rule__StartStates__Group__2 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1637:2: rule__StartStates__Group__1__Impl rule__StartStates__Group__2
            {
            pushFollow(FOLLOW_rule__StartStates__Group__1__Impl_in_rule__StartStates__Group__13256);
            rule__StartStates__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StartStates__Group__2_in_rule__StartStates__Group__13259);
            rule__StartStates__Group__2();

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
    // $ANTLR end "rule__StartStates__Group__1"


    // $ANTLR start "rule__StartStates__Group__1__Impl"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1644:1: rule__StartStates__Group__1__Impl : ( ( rule__StartStates__StatesAssignment_1 ) ) ;
    public final void rule__StartStates__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1648:1: ( ( ( rule__StartStates__StatesAssignment_1 ) ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1649:1: ( ( rule__StartStates__StatesAssignment_1 ) )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1649:1: ( ( rule__StartStates__StatesAssignment_1 ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1650:1: ( rule__StartStates__StatesAssignment_1 )
            {
             before(grammarAccess.getStartStatesAccess().getStatesAssignment_1()); 
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1651:1: ( rule__StartStates__StatesAssignment_1 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1651:2: rule__StartStates__StatesAssignment_1
            {
            pushFollow(FOLLOW_rule__StartStates__StatesAssignment_1_in_rule__StartStates__Group__1__Impl3286);
            rule__StartStates__StatesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStartStatesAccess().getStatesAssignment_1()); 

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
    // $ANTLR end "rule__StartStates__Group__1__Impl"


    // $ANTLR start "rule__StartStates__Group__2"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1661:1: rule__StartStates__Group__2 : rule__StartStates__Group__2__Impl ;
    public final void rule__StartStates__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1665:1: ( rule__StartStates__Group__2__Impl )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1666:2: rule__StartStates__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__StartStates__Group__2__Impl_in_rule__StartStates__Group__23316);
            rule__StartStates__Group__2__Impl();

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
    // $ANTLR end "rule__StartStates__Group__2"


    // $ANTLR start "rule__StartStates__Group__2__Impl"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1672:1: rule__StartStates__Group__2__Impl : ( ( rule__StartStates__Group_2__0 )* ) ;
    public final void rule__StartStates__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1676:1: ( ( ( rule__StartStates__Group_2__0 )* ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1677:1: ( ( rule__StartStates__Group_2__0 )* )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1677:1: ( ( rule__StartStates__Group_2__0 )* )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1678:1: ( rule__StartStates__Group_2__0 )*
            {
             before(grammarAccess.getStartStatesAccess().getGroup_2()); 
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1679:1: ( rule__StartStates__Group_2__0 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==22) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1679:2: rule__StartStates__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__StartStates__Group_2__0_in_rule__StartStates__Group__2__Impl3343);
            	    rule__StartStates__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getStartStatesAccess().getGroup_2()); 

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
    // $ANTLR end "rule__StartStates__Group__2__Impl"


    // $ANTLR start "rule__StartStates__Group_2__0"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1695:1: rule__StartStates__Group_2__0 : rule__StartStates__Group_2__0__Impl rule__StartStates__Group_2__1 ;
    public final void rule__StartStates__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1699:1: ( rule__StartStates__Group_2__0__Impl rule__StartStates__Group_2__1 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1700:2: rule__StartStates__Group_2__0__Impl rule__StartStates__Group_2__1
            {
            pushFollow(FOLLOW_rule__StartStates__Group_2__0__Impl_in_rule__StartStates__Group_2__03380);
            rule__StartStates__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StartStates__Group_2__1_in_rule__StartStates__Group_2__03383);
            rule__StartStates__Group_2__1();

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
    // $ANTLR end "rule__StartStates__Group_2__0"


    // $ANTLR start "rule__StartStates__Group_2__0__Impl"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1707:1: rule__StartStates__Group_2__0__Impl : ( ',' ) ;
    public final void rule__StartStates__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1711:1: ( ( ',' ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1712:1: ( ',' )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1712:1: ( ',' )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1713:1: ','
            {
             before(grammarAccess.getStartStatesAccess().getCommaKeyword_2_0()); 
            match(input,22,FOLLOW_22_in_rule__StartStates__Group_2__0__Impl3411); 
             after(grammarAccess.getStartStatesAccess().getCommaKeyword_2_0()); 

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
    // $ANTLR end "rule__StartStates__Group_2__0__Impl"


    // $ANTLR start "rule__StartStates__Group_2__1"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1726:1: rule__StartStates__Group_2__1 : rule__StartStates__Group_2__1__Impl ;
    public final void rule__StartStates__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1730:1: ( rule__StartStates__Group_2__1__Impl )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1731:2: rule__StartStates__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__StartStates__Group_2__1__Impl_in_rule__StartStates__Group_2__13442);
            rule__StartStates__Group_2__1__Impl();

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
    // $ANTLR end "rule__StartStates__Group_2__1"


    // $ANTLR start "rule__StartStates__Group_2__1__Impl"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1737:1: rule__StartStates__Group_2__1__Impl : ( RULE_ID ) ;
    public final void rule__StartStates__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1741:1: ( ( RULE_ID ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1742:1: ( RULE_ID )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1742:1: ( RULE_ID )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1743:1: RULE_ID
            {
             before(grammarAccess.getStartStatesAccess().getIDTerminalRuleCall_2_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__StartStates__Group_2__1__Impl3469); 
             after(grammarAccess.getStartStatesAccess().getIDTerminalRuleCall_2_1()); 

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
    // $ANTLR end "rule__StartStates__Group_2__1__Impl"


    // $ANTLR start "rule__Rule__Group__0"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1758:1: rule__Rule__Group__0 : rule__Rule__Group__0__Impl rule__Rule__Group__1 ;
    public final void rule__Rule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1762:1: ( rule__Rule__Group__0__Impl rule__Rule__Group__1 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1763:2: rule__Rule__Group__0__Impl rule__Rule__Group__1
            {
            pushFollow(FOLLOW_rule__Rule__Group__0__Impl_in_rule__Rule__Group__03502);
            rule__Rule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rule__Group__1_in_rule__Rule__Group__03505);
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
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1770:1: rule__Rule__Group__0__Impl : ( 'RULE' ) ;
    public final void rule__Rule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1774:1: ( ( 'RULE' ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1775:1: ( 'RULE' )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1775:1: ( 'RULE' )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1776:1: 'RULE'
            {
             before(grammarAccess.getRuleAccess().getRULEKeyword_0()); 
            match(input,23,FOLLOW_23_in_rule__Rule__Group__0__Impl3533); 
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
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1789:1: rule__Rule__Group__1 : rule__Rule__Group__1__Impl ;
    public final void rule__Rule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1793:1: ( rule__Rule__Group__1__Impl )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1794:2: rule__Rule__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Rule__Group__1__Impl_in_rule__Rule__Group__13564);
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
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1800:1: rule__Rule__Group__1__Impl : ( ( rule__Rule__ContentAssignment_1 )* ) ;
    public final void rule__Rule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1804:1: ( ( ( rule__Rule__ContentAssignment_1 )* ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1805:1: ( ( rule__Rule__ContentAssignment_1 )* )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1805:1: ( ( rule__Rule__ContentAssignment_1 )* )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1806:1: ( rule__Rule__ContentAssignment_1 )*
            {
             before(grammarAccess.getRuleAccess().getContentAssignment_1()); 
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1807:1: ( rule__Rule__ContentAssignment_1 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==24) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1807:2: rule__Rule__ContentAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Rule__ContentAssignment_1_in_rule__Rule__Group__1__Impl3591);
            	    rule__Rule__ContentAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

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


    // $ANTLR start "rule__SingleRule__Group__0"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1821:1: rule__SingleRule__Group__0 : rule__SingleRule__Group__0__Impl rule__SingleRule__Group__1 ;
    public final void rule__SingleRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1825:1: ( rule__SingleRule__Group__0__Impl rule__SingleRule__Group__1 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1826:2: rule__SingleRule__Group__0__Impl rule__SingleRule__Group__1
            {
            pushFollow(FOLLOW_rule__SingleRule__Group__0__Impl_in_rule__SingleRule__Group__03626);
            rule__SingleRule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SingleRule__Group__1_in_rule__SingleRule__Group__03629);
            rule__SingleRule__Group__1();

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
    // $ANTLR end "rule__SingleRule__Group__0"


    // $ANTLR start "rule__SingleRule__Group__0__Impl"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1833:1: rule__SingleRule__Group__0__Impl : ( '#STD#' ) ;
    public final void rule__SingleRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1837:1: ( ( '#STD#' ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1838:1: ( '#STD#' )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1838:1: ( '#STD#' )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1839:1: '#STD#'
            {
             before(grammarAccess.getSingleRuleAccess().getSTDKeyword_0()); 
            match(input,24,FOLLOW_24_in_rule__SingleRule__Group__0__Impl3657); 
             after(grammarAccess.getSingleRuleAccess().getSTDKeyword_0()); 

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
    // $ANTLR end "rule__SingleRule__Group__0__Impl"


    // $ANTLR start "rule__SingleRule__Group__1"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1852:1: rule__SingleRule__Group__1 : rule__SingleRule__Group__1__Impl rule__SingleRule__Group__2 ;
    public final void rule__SingleRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1856:1: ( rule__SingleRule__Group__1__Impl rule__SingleRule__Group__2 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1857:2: rule__SingleRule__Group__1__Impl rule__SingleRule__Group__2
            {
            pushFollow(FOLLOW_rule__SingleRule__Group__1__Impl_in_rule__SingleRule__Group__13688);
            rule__SingleRule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SingleRule__Group__2_in_rule__SingleRule__Group__13691);
            rule__SingleRule__Group__2();

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
    // $ANTLR end "rule__SingleRule__Group__1"


    // $ANTLR start "rule__SingleRule__Group__1__Impl"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1864:1: rule__SingleRule__Group__1__Impl : ( RULE_STRING ) ;
    public final void rule__SingleRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1868:1: ( ( RULE_STRING ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1869:1: ( RULE_STRING )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1869:1: ( RULE_STRING )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1870:1: RULE_STRING
            {
             before(grammarAccess.getSingleRuleAccess().getSTRINGTerminalRuleCall_1()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__SingleRule__Group__1__Impl3718); 
             after(grammarAccess.getSingleRuleAccess().getSTRINGTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__SingleRule__Group__1__Impl"


    // $ANTLR start "rule__SingleRule__Group__2"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1881:1: rule__SingleRule__Group__2 : rule__SingleRule__Group__2__Impl rule__SingleRule__Group__3 ;
    public final void rule__SingleRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1885:1: ( rule__SingleRule__Group__2__Impl rule__SingleRule__Group__3 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1886:2: rule__SingleRule__Group__2__Impl rule__SingleRule__Group__3
            {
            pushFollow(FOLLOW_rule__SingleRule__Group__2__Impl_in_rule__SingleRule__Group__23747);
            rule__SingleRule__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SingleRule__Group__3_in_rule__SingleRule__Group__23750);
            rule__SingleRule__Group__3();

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
    // $ANTLR end "rule__SingleRule__Group__2"


    // $ANTLR start "rule__SingleRule__Group__2__Impl"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1893:1: rule__SingleRule__Group__2__Impl : ( ': {' ) ;
    public final void rule__SingleRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1897:1: ( ( ': {' ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1898:1: ( ': {' )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1898:1: ( ': {' )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1899:1: ': {'
            {
             before(grammarAccess.getSingleRuleAccess().getColonSpaceLeftCurlyBracketKeyword_2()); 
            match(input,25,FOLLOW_25_in_rule__SingleRule__Group__2__Impl3778); 
             after(grammarAccess.getSingleRuleAccess().getColonSpaceLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__SingleRule__Group__2__Impl"


    // $ANTLR start "rule__SingleRule__Group__3"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1912:1: rule__SingleRule__Group__3 : rule__SingleRule__Group__3__Impl rule__SingleRule__Group__4 ;
    public final void rule__SingleRule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1916:1: ( rule__SingleRule__Group__3__Impl rule__SingleRule__Group__4 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1917:2: rule__SingleRule__Group__3__Impl rule__SingleRule__Group__4
            {
            pushFollow(FOLLOW_rule__SingleRule__Group__3__Impl_in_rule__SingleRule__Group__33809);
            rule__SingleRule__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SingleRule__Group__4_in_rule__SingleRule__Group__33812);
            rule__SingleRule__Group__4();

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
    // $ANTLR end "rule__SingleRule__Group__3"


    // $ANTLR start "rule__SingleRule__Group__3__Impl"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1924:1: rule__SingleRule__Group__3__Impl : ( RULE_STRING ) ;
    public final void rule__SingleRule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1928:1: ( ( RULE_STRING ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1929:1: ( RULE_STRING )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1929:1: ( RULE_STRING )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1930:1: RULE_STRING
            {
             before(grammarAccess.getSingleRuleAccess().getSTRINGTerminalRuleCall_3()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__SingleRule__Group__3__Impl3839); 
             after(grammarAccess.getSingleRuleAccess().getSTRINGTerminalRuleCall_3()); 

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
    // $ANTLR end "rule__SingleRule__Group__3__Impl"


    // $ANTLR start "rule__SingleRule__Group__4"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1941:1: rule__SingleRule__Group__4 : rule__SingleRule__Group__4__Impl ;
    public final void rule__SingleRule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1945:1: ( rule__SingleRule__Group__4__Impl )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1946:2: rule__SingleRule__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__SingleRule__Group__4__Impl_in_rule__SingleRule__Group__43868);
            rule__SingleRule__Group__4__Impl();

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
    // $ANTLR end "rule__SingleRule__Group__4"


    // $ANTLR start "rule__SingleRule__Group__4__Impl"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1952:1: rule__SingleRule__Group__4__Impl : ( '}' ) ;
    public final void rule__SingleRule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1956:1: ( ( '}' ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1957:1: ( '}' )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1957:1: ( '}' )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1958:1: '}'
            {
             before(grammarAccess.getSingleRuleAccess().getRightCurlyBracketKeyword_4()); 
            match(input,14,FOLLOW_14_in_rule__SingleRule__Group__4__Impl3896); 
             after(grammarAccess.getSingleRuleAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__SingleRule__Group__4__Impl"


    // $ANTLR start "rule__OrExpression__Group__0"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1981:1: rule__OrExpression__Group__0 : rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1 ;
    public final void rule__OrExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1985:1: ( rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1986:2: rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1
            {
            pushFollow(FOLLOW_rule__OrExpression__Group__0__Impl_in_rule__OrExpression__Group__03937);
            rule__OrExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OrExpression__Group__1_in_rule__OrExpression__Group__03940);
            rule__OrExpression__Group__1();

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
    // $ANTLR end "rule__OrExpression__Group__0"


    // $ANTLR start "rule__OrExpression__Group__0__Impl"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1993:1: rule__OrExpression__Group__0__Impl : ( ruleSequenceExpression ) ;
    public final void rule__OrExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1997:1: ( ( ruleSequenceExpression ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1998:1: ( ruleSequenceExpression )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1998:1: ( ruleSequenceExpression )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1999:1: ruleSequenceExpression
            {
             before(grammarAccess.getOrExpressionAccess().getSequenceExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleSequenceExpression_in_rule__OrExpression__Group__0__Impl3967);
            ruleSequenceExpression();

            state._fsp--;

             after(grammarAccess.getOrExpressionAccess().getSequenceExpressionParserRuleCall_0()); 

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
    // $ANTLR end "rule__OrExpression__Group__0__Impl"


    // $ANTLR start "rule__OrExpression__Group__1"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2010:1: rule__OrExpression__Group__1 : rule__OrExpression__Group__1__Impl ;
    public final void rule__OrExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2014:1: ( rule__OrExpression__Group__1__Impl )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2015:2: rule__OrExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__OrExpression__Group__1__Impl_in_rule__OrExpression__Group__13996);
            rule__OrExpression__Group__1__Impl();

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
    // $ANTLR end "rule__OrExpression__Group__1"


    // $ANTLR start "rule__OrExpression__Group__1__Impl"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2021:1: rule__OrExpression__Group__1__Impl : ( ( rule__OrExpression__Group_1__0 )* ) ;
    public final void rule__OrExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2025:1: ( ( ( rule__OrExpression__Group_1__0 )* ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2026:1: ( ( rule__OrExpression__Group_1__0 )* )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2026:1: ( ( rule__OrExpression__Group_1__0 )* )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2027:1: ( rule__OrExpression__Group_1__0 )*
            {
             before(grammarAccess.getOrExpressionAccess().getGroup_1()); 
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2028:1: ( rule__OrExpression__Group_1__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==26) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2028:2: rule__OrExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__OrExpression__Group_1__0_in_rule__OrExpression__Group__1__Impl4023);
            	    rule__OrExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getOrExpressionAccess().getGroup_1()); 

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
    // $ANTLR end "rule__OrExpression__Group__1__Impl"


    // $ANTLR start "rule__OrExpression__Group_1__0"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2042:1: rule__OrExpression__Group_1__0 : rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1 ;
    public final void rule__OrExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2046:1: ( rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2047:2: rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__OrExpression__Group_1__0__Impl_in_rule__OrExpression__Group_1__04058);
            rule__OrExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OrExpression__Group_1__1_in_rule__OrExpression__Group_1__04061);
            rule__OrExpression__Group_1__1();

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
    // $ANTLR end "rule__OrExpression__Group_1__0"


    // $ANTLR start "rule__OrExpression__Group_1__0__Impl"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2054:1: rule__OrExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__OrExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2058:1: ( ( () ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2059:1: ( () )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2059:1: ( () )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2060:1: ()
            {
             before(grammarAccess.getOrExpressionAccess().getOrExpressionLeftAction_1_0()); 
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2061:1: ()
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2063:1: 
            {
            }

             after(grammarAccess.getOrExpressionAccess().getOrExpressionLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group_1__0__Impl"


    // $ANTLR start "rule__OrExpression__Group_1__1"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2073:1: rule__OrExpression__Group_1__1 : rule__OrExpression__Group_1__1__Impl rule__OrExpression__Group_1__2 ;
    public final void rule__OrExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2077:1: ( rule__OrExpression__Group_1__1__Impl rule__OrExpression__Group_1__2 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2078:2: rule__OrExpression__Group_1__1__Impl rule__OrExpression__Group_1__2
            {
            pushFollow(FOLLOW_rule__OrExpression__Group_1__1__Impl_in_rule__OrExpression__Group_1__14119);
            rule__OrExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OrExpression__Group_1__2_in_rule__OrExpression__Group_1__14122);
            rule__OrExpression__Group_1__2();

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
    // $ANTLR end "rule__OrExpression__Group_1__1"


    // $ANTLR start "rule__OrExpression__Group_1__1__Impl"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2085:1: rule__OrExpression__Group_1__1__Impl : ( '+' ) ;
    public final void rule__OrExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2089:1: ( ( '+' ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2090:1: ( '+' )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2090:1: ( '+' )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2091:1: '+'
            {
             before(grammarAccess.getOrExpressionAccess().getPlusSignKeyword_1_1()); 
            match(input,26,FOLLOW_26_in_rule__OrExpression__Group_1__1__Impl4150); 
             after(grammarAccess.getOrExpressionAccess().getPlusSignKeyword_1_1()); 

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
    // $ANTLR end "rule__OrExpression__Group_1__1__Impl"


    // $ANTLR start "rule__OrExpression__Group_1__2"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2104:1: rule__OrExpression__Group_1__2 : rule__OrExpression__Group_1__2__Impl ;
    public final void rule__OrExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2108:1: ( rule__OrExpression__Group_1__2__Impl )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2109:2: rule__OrExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__OrExpression__Group_1__2__Impl_in_rule__OrExpression__Group_1__24181);
            rule__OrExpression__Group_1__2__Impl();

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
    // $ANTLR end "rule__OrExpression__Group_1__2"


    // $ANTLR start "rule__OrExpression__Group_1__2__Impl"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2115:1: rule__OrExpression__Group_1__2__Impl : ( ( rule__OrExpression__RightAssignment_1_2 ) ) ;
    public final void rule__OrExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2119:1: ( ( ( rule__OrExpression__RightAssignment_1_2 ) ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2120:1: ( ( rule__OrExpression__RightAssignment_1_2 ) )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2120:1: ( ( rule__OrExpression__RightAssignment_1_2 ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2121:1: ( rule__OrExpression__RightAssignment_1_2 )
            {
             before(grammarAccess.getOrExpressionAccess().getRightAssignment_1_2()); 
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2122:1: ( rule__OrExpression__RightAssignment_1_2 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2122:2: rule__OrExpression__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__OrExpression__RightAssignment_1_2_in_rule__OrExpression__Group_1__2__Impl4208);
            rule__OrExpression__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getOrExpressionAccess().getRightAssignment_1_2()); 

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
    // $ANTLR end "rule__OrExpression__Group_1__2__Impl"


    // $ANTLR start "rule__SequenceExpression__Group__0"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2138:1: rule__SequenceExpression__Group__0 : rule__SequenceExpression__Group__0__Impl rule__SequenceExpression__Group__1 ;
    public final void rule__SequenceExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2142:1: ( rule__SequenceExpression__Group__0__Impl rule__SequenceExpression__Group__1 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2143:2: rule__SequenceExpression__Group__0__Impl rule__SequenceExpression__Group__1
            {
            pushFollow(FOLLOW_rule__SequenceExpression__Group__0__Impl_in_rule__SequenceExpression__Group__04244);
            rule__SequenceExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SequenceExpression__Group__1_in_rule__SequenceExpression__Group__04247);
            rule__SequenceExpression__Group__1();

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
    // $ANTLR end "rule__SequenceExpression__Group__0"


    // $ANTLR start "rule__SequenceExpression__Group__0__Impl"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2150:1: rule__SequenceExpression__Group__0__Impl : ( ruleHighBindExpression ) ;
    public final void rule__SequenceExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2154:1: ( ( ruleHighBindExpression ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2155:1: ( ruleHighBindExpression )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2155:1: ( ruleHighBindExpression )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2156:1: ruleHighBindExpression
            {
             before(grammarAccess.getSequenceExpressionAccess().getHighBindExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleHighBindExpression_in_rule__SequenceExpression__Group__0__Impl4274);
            ruleHighBindExpression();

            state._fsp--;

             after(grammarAccess.getSequenceExpressionAccess().getHighBindExpressionParserRuleCall_0()); 

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
    // $ANTLR end "rule__SequenceExpression__Group__0__Impl"


    // $ANTLR start "rule__SequenceExpression__Group__1"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2167:1: rule__SequenceExpression__Group__1 : rule__SequenceExpression__Group__1__Impl ;
    public final void rule__SequenceExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2171:1: ( rule__SequenceExpression__Group__1__Impl )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2172:2: rule__SequenceExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__SequenceExpression__Group__1__Impl_in_rule__SequenceExpression__Group__14303);
            rule__SequenceExpression__Group__1__Impl();

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
    // $ANTLR end "rule__SequenceExpression__Group__1"


    // $ANTLR start "rule__SequenceExpression__Group__1__Impl"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2178:1: rule__SequenceExpression__Group__1__Impl : ( ( rule__SequenceExpression__Group_1__0 )* ) ;
    public final void rule__SequenceExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2182:1: ( ( ( rule__SequenceExpression__Group_1__0 )* ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2183:1: ( ( rule__SequenceExpression__Group_1__0 )* )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2183:1: ( ( rule__SequenceExpression__Group_1__0 )* )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2184:1: ( rule__SequenceExpression__Group_1__0 )*
            {
             before(grammarAccess.getSequenceExpressionAccess().getGroup_1()); 
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2185:1: ( rule__SequenceExpression__Group_1__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_CHAR||LA6_0==28) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2185:2: rule__SequenceExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__SequenceExpression__Group_1__0_in_rule__SequenceExpression__Group__1__Impl4330);
            	    rule__SequenceExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getSequenceExpressionAccess().getGroup_1()); 

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
    // $ANTLR end "rule__SequenceExpression__Group__1__Impl"


    // $ANTLR start "rule__SequenceExpression__Group_1__0"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2199:1: rule__SequenceExpression__Group_1__0 : rule__SequenceExpression__Group_1__0__Impl rule__SequenceExpression__Group_1__1 ;
    public final void rule__SequenceExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2203:1: ( rule__SequenceExpression__Group_1__0__Impl rule__SequenceExpression__Group_1__1 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2204:2: rule__SequenceExpression__Group_1__0__Impl rule__SequenceExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__SequenceExpression__Group_1__0__Impl_in_rule__SequenceExpression__Group_1__04365);
            rule__SequenceExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SequenceExpression__Group_1__1_in_rule__SequenceExpression__Group_1__04368);
            rule__SequenceExpression__Group_1__1();

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
    // $ANTLR end "rule__SequenceExpression__Group_1__0"


    // $ANTLR start "rule__SequenceExpression__Group_1__0__Impl"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2211:1: rule__SequenceExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__SequenceExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2215:1: ( ( () ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2216:1: ( () )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2216:1: ( () )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2217:1: ()
            {
             before(grammarAccess.getSequenceExpressionAccess().getSequenceExpressionLeftAction_1_0()); 
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2218:1: ()
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2220:1: 
            {
            }

             after(grammarAccess.getSequenceExpressionAccess().getSequenceExpressionLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceExpression__Group_1__0__Impl"


    // $ANTLR start "rule__SequenceExpression__Group_1__1"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2230:1: rule__SequenceExpression__Group_1__1 : rule__SequenceExpression__Group_1__1__Impl ;
    public final void rule__SequenceExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2234:1: ( rule__SequenceExpression__Group_1__1__Impl )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2235:2: rule__SequenceExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__SequenceExpression__Group_1__1__Impl_in_rule__SequenceExpression__Group_1__14426);
            rule__SequenceExpression__Group_1__1__Impl();

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
    // $ANTLR end "rule__SequenceExpression__Group_1__1"


    // $ANTLR start "rule__SequenceExpression__Group_1__1__Impl"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2241:1: rule__SequenceExpression__Group_1__1__Impl : ( ( rule__SequenceExpression__RightAssignment_1_1 ) ) ;
    public final void rule__SequenceExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2245:1: ( ( ( rule__SequenceExpression__RightAssignment_1_1 ) ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2246:1: ( ( rule__SequenceExpression__RightAssignment_1_1 ) )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2246:1: ( ( rule__SequenceExpression__RightAssignment_1_1 ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2247:1: ( rule__SequenceExpression__RightAssignment_1_1 )
            {
             before(grammarAccess.getSequenceExpressionAccess().getRightAssignment_1_1()); 
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2248:1: ( rule__SequenceExpression__RightAssignment_1_1 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2248:2: rule__SequenceExpression__RightAssignment_1_1
            {
            pushFollow(FOLLOW_rule__SequenceExpression__RightAssignment_1_1_in_rule__SequenceExpression__Group_1__1__Impl4453);
            rule__SequenceExpression__RightAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSequenceExpressionAccess().getRightAssignment_1_1()); 

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
    // $ANTLR end "rule__SequenceExpression__Group_1__1__Impl"


    // $ANTLR start "rule__HighBindExpression__Group__0"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2262:1: rule__HighBindExpression__Group__0 : rule__HighBindExpression__Group__0__Impl rule__HighBindExpression__Group__1 ;
    public final void rule__HighBindExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2266:1: ( rule__HighBindExpression__Group__0__Impl rule__HighBindExpression__Group__1 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2267:2: rule__HighBindExpression__Group__0__Impl rule__HighBindExpression__Group__1
            {
            pushFollow(FOLLOW_rule__HighBindExpression__Group__0__Impl_in_rule__HighBindExpression__Group__04487);
            rule__HighBindExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HighBindExpression__Group__1_in_rule__HighBindExpression__Group__04490);
            rule__HighBindExpression__Group__1();

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
    // $ANTLR end "rule__HighBindExpression__Group__0"


    // $ANTLR start "rule__HighBindExpression__Group__0__Impl"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2274:1: rule__HighBindExpression__Group__0__Impl : ( ruleAtomicExpression ) ;
    public final void rule__HighBindExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2278:1: ( ( ruleAtomicExpression ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2279:1: ( ruleAtomicExpression )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2279:1: ( ruleAtomicExpression )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2280:1: ruleAtomicExpression
            {
             before(grammarAccess.getHighBindExpressionAccess().getAtomicExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleAtomicExpression_in_rule__HighBindExpression__Group__0__Impl4517);
            ruleAtomicExpression();

            state._fsp--;

             after(grammarAccess.getHighBindExpressionAccess().getAtomicExpressionParserRuleCall_0()); 

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
    // $ANTLR end "rule__HighBindExpression__Group__0__Impl"


    // $ANTLR start "rule__HighBindExpression__Group__1"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2291:1: rule__HighBindExpression__Group__1 : rule__HighBindExpression__Group__1__Impl ;
    public final void rule__HighBindExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2295:1: ( rule__HighBindExpression__Group__1__Impl )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2296:2: rule__HighBindExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__HighBindExpression__Group__1__Impl_in_rule__HighBindExpression__Group__14546);
            rule__HighBindExpression__Group__1__Impl();

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
    // $ANTLR end "rule__HighBindExpression__Group__1"


    // $ANTLR start "rule__HighBindExpression__Group__1__Impl"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2302:1: rule__HighBindExpression__Group__1__Impl : ( ( rule__HighBindExpression__Group_1__0 )? ) ;
    public final void rule__HighBindExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2306:1: ( ( ( rule__HighBindExpression__Group_1__0 )? ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2307:1: ( ( rule__HighBindExpression__Group_1__0 )? )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2307:1: ( ( rule__HighBindExpression__Group_1__0 )? )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2308:1: ( rule__HighBindExpression__Group_1__0 )?
            {
             before(grammarAccess.getHighBindExpressionAccess().getGroup_1()); 
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2309:1: ( rule__HighBindExpression__Group_1__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==27) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2309:2: rule__HighBindExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__HighBindExpression__Group_1__0_in_rule__HighBindExpression__Group__1__Impl4573);
                    rule__HighBindExpression__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getHighBindExpressionAccess().getGroup_1()); 

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
    // $ANTLR end "rule__HighBindExpression__Group__1__Impl"


    // $ANTLR start "rule__HighBindExpression__Group_1__0"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2323:1: rule__HighBindExpression__Group_1__0 : rule__HighBindExpression__Group_1__0__Impl rule__HighBindExpression__Group_1__1 ;
    public final void rule__HighBindExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2327:1: ( rule__HighBindExpression__Group_1__0__Impl rule__HighBindExpression__Group_1__1 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2328:2: rule__HighBindExpression__Group_1__0__Impl rule__HighBindExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__HighBindExpression__Group_1__0__Impl_in_rule__HighBindExpression__Group_1__04608);
            rule__HighBindExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HighBindExpression__Group_1__1_in_rule__HighBindExpression__Group_1__04611);
            rule__HighBindExpression__Group_1__1();

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
    // $ANTLR end "rule__HighBindExpression__Group_1__0"


    // $ANTLR start "rule__HighBindExpression__Group_1__0__Impl"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2335:1: rule__HighBindExpression__Group_1__0__Impl : ( '*' ) ;
    public final void rule__HighBindExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2339:1: ( ( '*' ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2340:1: ( '*' )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2340:1: ( '*' )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2341:1: '*'
            {
             before(grammarAccess.getHighBindExpressionAccess().getAsteriskKeyword_1_0()); 
            match(input,27,FOLLOW_27_in_rule__HighBindExpression__Group_1__0__Impl4639); 
             after(grammarAccess.getHighBindExpressionAccess().getAsteriskKeyword_1_0()); 

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
    // $ANTLR end "rule__HighBindExpression__Group_1__0__Impl"


    // $ANTLR start "rule__HighBindExpression__Group_1__1"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2354:1: rule__HighBindExpression__Group_1__1 : rule__HighBindExpression__Group_1__1__Impl rule__HighBindExpression__Group_1__2 ;
    public final void rule__HighBindExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2358:1: ( rule__HighBindExpression__Group_1__1__Impl rule__HighBindExpression__Group_1__2 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2359:2: rule__HighBindExpression__Group_1__1__Impl rule__HighBindExpression__Group_1__2
            {
            pushFollow(FOLLOW_rule__HighBindExpression__Group_1__1__Impl_in_rule__HighBindExpression__Group_1__14670);
            rule__HighBindExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HighBindExpression__Group_1__2_in_rule__HighBindExpression__Group_1__14673);
            rule__HighBindExpression__Group_1__2();

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
    // $ANTLR end "rule__HighBindExpression__Group_1__1"


    // $ANTLR start "rule__HighBindExpression__Group_1__1__Impl"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2366:1: rule__HighBindExpression__Group_1__1__Impl : ( () ) ;
    public final void rule__HighBindExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2370:1: ( ( () ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2371:1: ( () )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2371:1: ( () )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2372:1: ()
            {
             before(grammarAccess.getHighBindExpressionAccess().getStarExpressionInnerExpressionAction_1_1()); 
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2373:1: ()
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2375:1: 
            {
            }

             after(grammarAccess.getHighBindExpressionAccess().getStarExpressionInnerExpressionAction_1_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HighBindExpression__Group_1__1__Impl"


    // $ANTLR start "rule__HighBindExpression__Group_1__2"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2385:1: rule__HighBindExpression__Group_1__2 : rule__HighBindExpression__Group_1__2__Impl ;
    public final void rule__HighBindExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2389:1: ( rule__HighBindExpression__Group_1__2__Impl )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2390:2: rule__HighBindExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__HighBindExpression__Group_1__2__Impl_in_rule__HighBindExpression__Group_1__24731);
            rule__HighBindExpression__Group_1__2__Impl();

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
    // $ANTLR end "rule__HighBindExpression__Group_1__2"


    // $ANTLR start "rule__HighBindExpression__Group_1__2__Impl"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2396:1: rule__HighBindExpression__Group_1__2__Impl : ( ( '*' )* ) ;
    public final void rule__HighBindExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2400:1: ( ( ( '*' )* ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2401:1: ( ( '*' )* )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2401:1: ( ( '*' )* )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2402:1: ( '*' )*
            {
             before(grammarAccess.getHighBindExpressionAccess().getAsteriskKeyword_1_2()); 
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2403:1: ( '*' )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==27) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2404:2: '*'
            	    {
            	    match(input,27,FOLLOW_27_in_rule__HighBindExpression__Group_1__2__Impl4760); 

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getHighBindExpressionAccess().getAsteriskKeyword_1_2()); 

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
    // $ANTLR end "rule__HighBindExpression__Group_1__2__Impl"


    // $ANTLR start "rule__BracedExpression__Group__0"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2421:1: rule__BracedExpression__Group__0 : rule__BracedExpression__Group__0__Impl rule__BracedExpression__Group__1 ;
    public final void rule__BracedExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2425:1: ( rule__BracedExpression__Group__0__Impl rule__BracedExpression__Group__1 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2426:2: rule__BracedExpression__Group__0__Impl rule__BracedExpression__Group__1
            {
            pushFollow(FOLLOW_rule__BracedExpression__Group__0__Impl_in_rule__BracedExpression__Group__04799);
            rule__BracedExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BracedExpression__Group__1_in_rule__BracedExpression__Group__04802);
            rule__BracedExpression__Group__1();

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
    // $ANTLR end "rule__BracedExpression__Group__0"


    // $ANTLR start "rule__BracedExpression__Group__0__Impl"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2433:1: rule__BracedExpression__Group__0__Impl : ( '(' ) ;
    public final void rule__BracedExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2437:1: ( ( '(' ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2438:1: ( '(' )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2438:1: ( '(' )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2439:1: '('
            {
             before(grammarAccess.getBracedExpressionAccess().getLeftParenthesisKeyword_0()); 
            match(input,28,FOLLOW_28_in_rule__BracedExpression__Group__0__Impl4830); 
             after(grammarAccess.getBracedExpressionAccess().getLeftParenthesisKeyword_0()); 

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
    // $ANTLR end "rule__BracedExpression__Group__0__Impl"


    // $ANTLR start "rule__BracedExpression__Group__1"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2452:1: rule__BracedExpression__Group__1 : rule__BracedExpression__Group__1__Impl rule__BracedExpression__Group__2 ;
    public final void rule__BracedExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2456:1: ( rule__BracedExpression__Group__1__Impl rule__BracedExpression__Group__2 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2457:2: rule__BracedExpression__Group__1__Impl rule__BracedExpression__Group__2
            {
            pushFollow(FOLLOW_rule__BracedExpression__Group__1__Impl_in_rule__BracedExpression__Group__14861);
            rule__BracedExpression__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BracedExpression__Group__2_in_rule__BracedExpression__Group__14864);
            rule__BracedExpression__Group__2();

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
    // $ANTLR end "rule__BracedExpression__Group__1"


    // $ANTLR start "rule__BracedExpression__Group__1__Impl"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2464:1: rule__BracedExpression__Group__1__Impl : ( ( rule__BracedExpression__InnerExpressionAssignment_1 ) ) ;
    public final void rule__BracedExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2468:1: ( ( ( rule__BracedExpression__InnerExpressionAssignment_1 ) ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2469:1: ( ( rule__BracedExpression__InnerExpressionAssignment_1 ) )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2469:1: ( ( rule__BracedExpression__InnerExpressionAssignment_1 ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2470:1: ( rule__BracedExpression__InnerExpressionAssignment_1 )
            {
             before(grammarAccess.getBracedExpressionAccess().getInnerExpressionAssignment_1()); 
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2471:1: ( rule__BracedExpression__InnerExpressionAssignment_1 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2471:2: rule__BracedExpression__InnerExpressionAssignment_1
            {
            pushFollow(FOLLOW_rule__BracedExpression__InnerExpressionAssignment_1_in_rule__BracedExpression__Group__1__Impl4891);
            rule__BracedExpression__InnerExpressionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBracedExpressionAccess().getInnerExpressionAssignment_1()); 

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
    // $ANTLR end "rule__BracedExpression__Group__1__Impl"


    // $ANTLR start "rule__BracedExpression__Group__2"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2481:1: rule__BracedExpression__Group__2 : rule__BracedExpression__Group__2__Impl ;
    public final void rule__BracedExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2485:1: ( rule__BracedExpression__Group__2__Impl )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2486:2: rule__BracedExpression__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__BracedExpression__Group__2__Impl_in_rule__BracedExpression__Group__24921);
            rule__BracedExpression__Group__2__Impl();

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
    // $ANTLR end "rule__BracedExpression__Group__2"


    // $ANTLR start "rule__BracedExpression__Group__2__Impl"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2492:1: rule__BracedExpression__Group__2__Impl : ( ')' ) ;
    public final void rule__BracedExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2496:1: ( ( ')' ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2497:1: ( ')' )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2497:1: ( ')' )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2498:1: ')'
            {
             before(grammarAccess.getBracedExpressionAccess().getRightParenthesisKeyword_2()); 
            match(input,29,FOLLOW_29_in_rule__BracedExpression__Group__2__Impl4949); 
             after(grammarAccess.getBracedExpressionAccess().getRightParenthesisKeyword_2()); 

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
    // $ANTLR end "rule__BracedExpression__Group__2__Impl"


    // $ANTLR start "rule__Model__ScannerAssignment_0"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2518:1: rule__Model__ScannerAssignment_0 : ( ruleTitle ) ;
    public final void rule__Model__ScannerAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2522:1: ( ( ruleTitle ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2523:1: ( ruleTitle )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2523:1: ( ruleTitle )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2524:1: ruleTitle
            {
             before(grammarAccess.getModelAccess().getScannerTitleParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleTitle_in_rule__Model__ScannerAssignment_04991);
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
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2533:1: rule__Model__ScannerAssignment_1 : ( ruleExport ) ;
    public final void rule__Model__ScannerAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2537:1: ( ( ruleExport ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2538:1: ( ruleExport )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2538:1: ( ruleExport )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2539:1: ruleExport
            {
             before(grammarAccess.getModelAccess().getScannerExportParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleExport_in_rule__Model__ScannerAssignment_15022);
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
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2548:1: rule__Model__ScannerAssignment_2 : ( ruleGlobal ) ;
    public final void rule__Model__ScannerAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2552:1: ( ( ruleGlobal ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2553:1: ( ruleGlobal )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2553:1: ( ruleGlobal )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2554:1: ruleGlobal
            {
             before(grammarAccess.getModelAccess().getScannerGlobalParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleGlobal_in_rule__Model__ScannerAssignment_25053);
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
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2563:1: rule__Model__ScannerAssignment_3 : ( ruleLocal ) ;
    public final void rule__Model__ScannerAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2567:1: ( ( ruleLocal ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2568:1: ( ruleLocal )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2568:1: ( ruleLocal )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2569:1: ruleLocal
            {
             before(grammarAccess.getModelAccess().getScannerLocalParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleLocal_in_rule__Model__ScannerAssignment_35084);
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
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2578:1: rule__Model__ScannerAssignment_4 : ( ruleDefault ) ;
    public final void rule__Model__ScannerAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2582:1: ( ( ruleDefault ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2583:1: ( ruleDefault )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2583:1: ( ruleDefault )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2584:1: ruleDefault
            {
             before(grammarAccess.getModelAccess().getScannerDefaultParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleDefault_in_rule__Model__ScannerAssignment_45115);
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
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2593:1: rule__Model__ScannerAssignment_5 : ( ruleEof ) ;
    public final void rule__Model__ScannerAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2597:1: ( ( ruleEof ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2598:1: ( ruleEof )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2598:1: ( ruleEof )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2599:1: ruleEof
            {
             before(grammarAccess.getModelAccess().getScannerEofParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleEof_in_rule__Model__ScannerAssignment_55146);
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
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2608:1: rule__Model__ScannerAssignment_6 : ( ruleDefine ) ;
    public final void rule__Model__ScannerAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2612:1: ( ( ruleDefine ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2613:1: ( ruleDefine )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2613:1: ( ruleDefine )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2614:1: ruleDefine
            {
             before(grammarAccess.getModelAccess().getScannerDefineParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleDefine_in_rule__Model__ScannerAssignment_65177);
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
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2623:1: rule__Model__ScannerAssignment_7 : ( ruleStartStates ) ;
    public final void rule__Model__ScannerAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2627:1: ( ( ruleStartStates ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2628:1: ( ruleStartStates )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2628:1: ( ruleStartStates )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2629:1: ruleStartStates
            {
             before(grammarAccess.getModelAccess().getScannerStartStatesParserRuleCall_7_0()); 
            pushFollow(FOLLOW_ruleStartStates_in_rule__Model__ScannerAssignment_75208);
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
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2638:1: rule__Model__ScannerAssignment_8 : ( ruleRule ) ;
    public final void rule__Model__ScannerAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2642:1: ( ( ruleRule ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2643:1: ( ruleRule )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2643:1: ( ruleRule )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2644:1: ruleRule
            {
             before(grammarAccess.getModelAccess().getScannerRuleParserRuleCall_8_0()); 
            pushFollow(FOLLOW_ruleRule_in_rule__Model__ScannerAssignment_85239);
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
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2653:1: rule__Title__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Title__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2657:1: ( ( RULE_ID ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2658:1: ( RULE_ID )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2658:1: ( RULE_ID )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2659:1: RULE_ID
            {
             before(grammarAccess.getTitleAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Title__NameAssignment_15270); 
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
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2668:1: rule__Export__ContentAssignment_1 : ( RULE_ID ) ;
    public final void rule__Export__ContentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2672:1: ( ( RULE_ID ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2673:1: ( RULE_ID )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2673:1: ( RULE_ID )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2674:1: RULE_ID
            {
             before(grammarAccess.getExportAccess().getContentIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Export__ContentAssignment_15301); 
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
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2683:1: rule__Global__ContentAssignment_1 : ( RULE_ID ) ;
    public final void rule__Global__ContentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2687:1: ( ( RULE_ID ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2688:1: ( RULE_ID )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2688:1: ( RULE_ID )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2689:1: RULE_ID
            {
             before(grammarAccess.getGlobalAccess().getContentIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Global__ContentAssignment_15332); 
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
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2698:1: rule__Local__ContentAssignment_1 : ( RULE_ID ) ;
    public final void rule__Local__ContentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2702:1: ( ( RULE_ID ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2703:1: ( RULE_ID )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2703:1: ( RULE_ID )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2704:1: RULE_ID
            {
             before(grammarAccess.getLocalAccess().getContentIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Local__ContentAssignment_15363); 
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
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2713:1: rule__Default__ContentAssignment_1 : ( RULE_ID ) ;
    public final void rule__Default__ContentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2717:1: ( ( RULE_ID ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2718:1: ( RULE_ID )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2718:1: ( RULE_ID )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2719:1: RULE_ID
            {
             before(grammarAccess.getDefaultAccess().getContentIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Default__ContentAssignment_15394); 
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
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2728:1: rule__Eof__ContentAssignment_1 : ( RULE_ID ) ;
    public final void rule__Eof__ContentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2732:1: ( ( RULE_ID ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2733:1: ( RULE_ID )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2733:1: ( RULE_ID )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2734:1: RULE_ID
            {
             before(grammarAccess.getEofAccess().getContentIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Eof__ContentAssignment_15425); 
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
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2743:1: rule__Define__DefinesAssignment_1 : ( ruleDefineRule ) ;
    public final void rule__Define__DefinesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2747:1: ( ( ruleDefineRule ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2748:1: ( ruleDefineRule )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2748:1: ( ruleDefineRule )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2749:1: ruleDefineRule
            {
             before(grammarAccess.getDefineAccess().getDefinesDefineRuleParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleDefineRule_in_rule__Define__DefinesAssignment_15456);
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
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2758:1: rule__DefineRule__DefineNameAssignment_0 : ( RULE_ID ) ;
    public final void rule__DefineRule__DefineNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2762:1: ( ( RULE_ID ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2763:1: ( RULE_ID )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2763:1: ( RULE_ID )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2764:1: RULE_ID
            {
             before(grammarAccess.getDefineRuleAccess().getDefineNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DefineRule__DefineNameAssignment_05487); 
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
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2773:1: rule__DefineRule__DefineRuleAssignment_2 : ( RULE_ID ) ;
    public final void rule__DefineRule__DefineRuleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2777:1: ( ( RULE_ID ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2778:1: ( RULE_ID )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2778:1: ( RULE_ID )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2779:1: RULE_ID
            {
             before(grammarAccess.getDefineRuleAccess().getDefineRuleIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DefineRule__DefineRuleAssignment_25518); 
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


    // $ANTLR start "rule__StartStates__StatesAssignment_1"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2788:1: rule__StartStates__StatesAssignment_1 : ( RULE_ID ) ;
    public final void rule__StartStates__StatesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2792:1: ( ( RULE_ID ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2793:1: ( RULE_ID )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2793:1: ( RULE_ID )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2794:1: RULE_ID
            {
             before(grammarAccess.getStartStatesAccess().getStatesIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__StartStates__StatesAssignment_15549); 
             after(grammarAccess.getStartStatesAccess().getStatesIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__StartStates__StatesAssignment_1"


    // $ANTLR start "rule__Rule__ContentAssignment_1"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2803:1: rule__Rule__ContentAssignment_1 : ( ruleSingleRule ) ;
    public final void rule__Rule__ContentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2807:1: ( ( ruleSingleRule ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2808:1: ( ruleSingleRule )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2808:1: ( ruleSingleRule )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2809:1: ruleSingleRule
            {
             before(grammarAccess.getRuleAccess().getContentSingleRuleParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleSingleRule_in_rule__Rule__ContentAssignment_15580);
            ruleSingleRule();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getContentSingleRuleParserRuleCall_1_0()); 

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


    // $ANTLR start "rule__OrExpression__RightAssignment_1_2"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2818:1: rule__OrExpression__RightAssignment_1_2 : ( ruleSequenceExpression ) ;
    public final void rule__OrExpression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2822:1: ( ( ruleSequenceExpression ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2823:1: ( ruleSequenceExpression )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2823:1: ( ruleSequenceExpression )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2824:1: ruleSequenceExpression
            {
             before(grammarAccess.getOrExpressionAccess().getRightSequenceExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleSequenceExpression_in_rule__OrExpression__RightAssignment_1_25611);
            ruleSequenceExpression();

            state._fsp--;

             after(grammarAccess.getOrExpressionAccess().getRightSequenceExpressionParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__OrExpression__RightAssignment_1_2"


    // $ANTLR start "rule__SequenceExpression__RightAssignment_1_1"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2833:1: rule__SequenceExpression__RightAssignment_1_1 : ( ruleHighBindExpression ) ;
    public final void rule__SequenceExpression__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2837:1: ( ( ruleHighBindExpression ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2838:1: ( ruleHighBindExpression )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2838:1: ( ruleHighBindExpression )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2839:1: ruleHighBindExpression
            {
             before(grammarAccess.getSequenceExpressionAccess().getRightHighBindExpressionParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleHighBindExpression_in_rule__SequenceExpression__RightAssignment_1_15642);
            ruleHighBindExpression();

            state._fsp--;

             after(grammarAccess.getSequenceExpressionAccess().getRightHighBindExpressionParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__SequenceExpression__RightAssignment_1_1"


    // $ANTLR start "rule__BracedExpression__InnerExpressionAssignment_1"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2848:1: rule__BracedExpression__InnerExpressionAssignment_1 : ( ruleRegularExpression ) ;
    public final void rule__BracedExpression__InnerExpressionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2852:1: ( ( ruleRegularExpression ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2853:1: ( ruleRegularExpression )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2853:1: ( ruleRegularExpression )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2854:1: ruleRegularExpression
            {
             before(grammarAccess.getBracedExpressionAccess().getInnerExpressionRegularExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleRegularExpression_in_rule__BracedExpression__InnerExpressionAssignment_15673);
            ruleRegularExpression();

            state._fsp--;

             after(grammarAccess.getBracedExpressionAccess().getInnerExpressionRegularExpressionParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__BracedExpression__InnerExpressionAssignment_1"


    // $ANTLR start "rule__Atom__ValueAssignment"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2863:1: rule__Atom__ValueAssignment : ( RULE_CHAR ) ;
    public final void rule__Atom__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2867:1: ( ( RULE_CHAR ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2868:1: ( RULE_CHAR )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2868:1: ( RULE_CHAR )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2869:1: RULE_CHAR
            {
             before(grammarAccess.getAtomAccess().getValueCHARTerminalRuleCall_0()); 
            match(input,RULE_CHAR,FOLLOW_RULE_CHAR_in_rule__Atom__ValueAssignment5704); 
             after(grammarAccess.getAtomAccess().getValueCHARTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__Atom__ValueAssignment"

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
    public static final BitSet FOLLOW_rule__StartStates__Group__0_in_ruleStartStates634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRule_in_entryRuleRule661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRule668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__0_in_ruleRule694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleRule_in_entryRuleSingleRule721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSingleRule728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SingleRule__Group__0_in_ruleSingleRule754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRegularExpression_in_entryRuleRegularExpression781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRegularExpression788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrExpression_in_ruleRegularExpression814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrExpression_in_entryRuleOrExpression840 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrExpression847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpression__Group__0_in_ruleOrExpression873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSequenceExpression_in_entryRuleSequenceExpression900 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSequenceExpression907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SequenceExpression__Group__0_in_ruleSequenceExpression933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHighBindExpression_in_entryRuleHighBindExpression960 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHighBindExpression967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HighBindExpression__Group__0_in_ruleHighBindExpression993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicExpression_in_entryRuleAtomicExpression1020 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtomicExpression1027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpression__Alternatives_in_ruleAtomicExpression1053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBracedExpression_in_entryRuleBracedExpression1080 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBracedExpression1087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BracedExpression__Group__0_in_ruleBracedExpression1113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtom_in_entryRuleAtom1140 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtom1147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atom__ValueAssignment_in_ruleAtom1173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBracedExpression_in_rule__AtomicExpression__Alternatives1209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtom_in_rule__AtomicExpression__Alternatives1226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__01256 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__01259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ScannerAssignment_0_in_rule__Model__Group__0__Impl1286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__11316 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Model__Group__2_in_rule__Model__Group__11319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ScannerAssignment_1_in_rule__Model__Group__1__Impl1346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__21376 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Model__Group__3_in_rule__Model__Group__21379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ScannerAssignment_2_in_rule__Model__Group__2__Impl1406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__31436 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Model__Group__4_in_rule__Model__Group__31439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ScannerAssignment_3_in_rule__Model__Group__3__Impl1466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__4__Impl_in_rule__Model__Group__41496 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Model__Group__5_in_rule__Model__Group__41499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ScannerAssignment_4_in_rule__Model__Group__4__Impl1526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__5__Impl_in_rule__Model__Group__51556 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Model__Group__6_in_rule__Model__Group__51559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ScannerAssignment_5_in_rule__Model__Group__5__Impl1586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__6__Impl_in_rule__Model__Group__61616 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Model__Group__7_in_rule__Model__Group__61619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ScannerAssignment_6_in_rule__Model__Group__6__Impl1646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__7__Impl_in_rule__Model__Group__71676 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Model__Group__8_in_rule__Model__Group__71679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ScannerAssignment_7_in_rule__Model__Group__7__Impl1706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__8__Impl_in_rule__Model__Group__81736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ScannerAssignment_8_in_rule__Model__Group__8__Impl1763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Title__Group__0__Impl_in_rule__Title__Group__01811 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Title__Group__1_in_rule__Title__Group__01814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Title__Group__0__Impl1842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Title__Group__1__Impl_in_rule__Title__Group__11873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Title__NameAssignment_1_in_rule__Title__Group__1__Impl1900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Export__Group__0__Impl_in_rule__Export__Group__01934 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Export__Group__1_in_rule__Export__Group__01937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Export__Group__0__Impl1965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Export__Group__1__Impl_in_rule__Export__Group__11996 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Export__Group__2_in_rule__Export__Group__11999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Export__ContentAssignment_1_in_rule__Export__Group__1__Impl2026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Export__Group__2__Impl_in_rule__Export__Group__22056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Export__Group__2__Impl2084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Global__Group__0__Impl_in_rule__Global__Group__02121 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Global__Group__1_in_rule__Global__Group__02124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Global__Group__0__Impl2152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Global__Group__1__Impl_in_rule__Global__Group__12183 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Global__Group__2_in_rule__Global__Group__12186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Global__ContentAssignment_1_in_rule__Global__Group__1__Impl2213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Global__Group__2__Impl_in_rule__Global__Group__22243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Global__Group__2__Impl2271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Local__Group__0__Impl_in_rule__Local__Group__02308 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Local__Group__1_in_rule__Local__Group__02311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Local__Group__0__Impl2339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Local__Group__1__Impl_in_rule__Local__Group__12370 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Local__Group__2_in_rule__Local__Group__12373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Local__ContentAssignment_1_in_rule__Local__Group__1__Impl2400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Local__Group__2__Impl_in_rule__Local__Group__22430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Local__Group__2__Impl2458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Default__Group__0__Impl_in_rule__Default__Group__02495 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Default__Group__1_in_rule__Default__Group__02498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Default__Group__0__Impl2526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Default__Group__1__Impl_in_rule__Default__Group__12557 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Default__Group__2_in_rule__Default__Group__12560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Default__ContentAssignment_1_in_rule__Default__Group__1__Impl2587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Default__Group__2__Impl_in_rule__Default__Group__22617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Default__Group__2__Impl2645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Eof__Group__0__Impl_in_rule__Eof__Group__02682 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Eof__Group__1_in_rule__Eof__Group__02685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Eof__Group__0__Impl2713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Eof__Group__1__Impl_in_rule__Eof__Group__12744 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Eof__Group__2_in_rule__Eof__Group__12747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Eof__ContentAssignment_1_in_rule__Eof__Group__1__Impl2774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Eof__Group__2__Impl_in_rule__Eof__Group__22804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Eof__Group__2__Impl2832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Define__Group__0__Impl_in_rule__Define__Group__02869 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Define__Group__1_in_rule__Define__Group__02872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Define__Group__0__Impl2900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Define__Group__1__Impl_in_rule__Define__Group__12931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Define__DefinesAssignment_1_in_rule__Define__Group__1__Impl2960 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Define__DefinesAssignment_1_in_rule__Define__Group__1__Impl2972 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__DefineRule__Group__0__Impl_in_rule__DefineRule__Group__03009 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__DefineRule__Group__1_in_rule__DefineRule__Group__03012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefineRule__DefineNameAssignment_0_in_rule__DefineRule__Group__0__Impl3039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefineRule__Group__1__Impl_in_rule__DefineRule__Group__13069 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DefineRule__Group__2_in_rule__DefineRule__Group__13072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__DefineRule__Group__1__Impl3100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefineRule__Group__2__Impl_in_rule__DefineRule__Group__23131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefineRule__DefineRuleAssignment_2_in_rule__DefineRule__Group__2__Impl3158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StartStates__Group__0__Impl_in_rule__StartStates__Group__03194 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__StartStates__Group__1_in_rule__StartStates__Group__03197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__StartStates__Group__0__Impl3225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StartStates__Group__1__Impl_in_rule__StartStates__Group__13256 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__StartStates__Group__2_in_rule__StartStates__Group__13259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StartStates__StatesAssignment_1_in_rule__StartStates__Group__1__Impl3286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StartStates__Group__2__Impl_in_rule__StartStates__Group__23316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StartStates__Group_2__0_in_rule__StartStates__Group__2__Impl3343 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_rule__StartStates__Group_2__0__Impl_in_rule__StartStates__Group_2__03380 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__StartStates__Group_2__1_in_rule__StartStates__Group_2__03383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__StartStates__Group_2__0__Impl3411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StartStates__Group_2__1__Impl_in_rule__StartStates__Group_2__13442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__StartStates__Group_2__1__Impl3469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__0__Impl_in_rule__Rule__Group__03502 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Rule__Group__1_in_rule__Rule__Group__03505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Rule__Group__0__Impl3533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__1__Impl_in_rule__Rule__Group__13564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__ContentAssignment_1_in_rule__Rule__Group__1__Impl3591 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_rule__SingleRule__Group__0__Impl_in_rule__SingleRule__Group__03626 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__SingleRule__Group__1_in_rule__SingleRule__Group__03629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__SingleRule__Group__0__Impl3657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SingleRule__Group__1__Impl_in_rule__SingleRule__Group__13688 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__SingleRule__Group__2_in_rule__SingleRule__Group__13691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__SingleRule__Group__1__Impl3718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SingleRule__Group__2__Impl_in_rule__SingleRule__Group__23747 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__SingleRule__Group__3_in_rule__SingleRule__Group__23750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__SingleRule__Group__2__Impl3778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SingleRule__Group__3__Impl_in_rule__SingleRule__Group__33809 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__SingleRule__Group__4_in_rule__SingleRule__Group__33812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__SingleRule__Group__3__Impl3839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SingleRule__Group__4__Impl_in_rule__SingleRule__Group__43868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__SingleRule__Group__4__Impl3896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpression__Group__0__Impl_in_rule__OrExpression__Group__03937 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__OrExpression__Group__1_in_rule__OrExpression__Group__03940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSequenceExpression_in_rule__OrExpression__Group__0__Impl3967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpression__Group__1__Impl_in_rule__OrExpression__Group__13996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpression__Group_1__0_in_rule__OrExpression__Group__1__Impl4023 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__OrExpression__Group_1__0__Impl_in_rule__OrExpression__Group_1__04058 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__OrExpression__Group_1__1_in_rule__OrExpression__Group_1__04061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpression__Group_1__1__Impl_in_rule__OrExpression__Group_1__14119 = new BitSet(new long[]{0x0000000010000040L});
    public static final BitSet FOLLOW_rule__OrExpression__Group_1__2_in_rule__OrExpression__Group_1__14122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__OrExpression__Group_1__1__Impl4150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpression__Group_1__2__Impl_in_rule__OrExpression__Group_1__24181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpression__RightAssignment_1_2_in_rule__OrExpression__Group_1__2__Impl4208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SequenceExpression__Group__0__Impl_in_rule__SequenceExpression__Group__04244 = new BitSet(new long[]{0x0000000010000040L});
    public static final BitSet FOLLOW_rule__SequenceExpression__Group__1_in_rule__SequenceExpression__Group__04247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHighBindExpression_in_rule__SequenceExpression__Group__0__Impl4274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SequenceExpression__Group__1__Impl_in_rule__SequenceExpression__Group__14303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SequenceExpression__Group_1__0_in_rule__SequenceExpression__Group__1__Impl4330 = new BitSet(new long[]{0x0000000010000042L});
    public static final BitSet FOLLOW_rule__SequenceExpression__Group_1__0__Impl_in_rule__SequenceExpression__Group_1__04365 = new BitSet(new long[]{0x0000000010000040L});
    public static final BitSet FOLLOW_rule__SequenceExpression__Group_1__1_in_rule__SequenceExpression__Group_1__04368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SequenceExpression__Group_1__1__Impl_in_rule__SequenceExpression__Group_1__14426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SequenceExpression__RightAssignment_1_1_in_rule__SequenceExpression__Group_1__1__Impl4453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HighBindExpression__Group__0__Impl_in_rule__HighBindExpression__Group__04487 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__HighBindExpression__Group__1_in_rule__HighBindExpression__Group__04490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicExpression_in_rule__HighBindExpression__Group__0__Impl4517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HighBindExpression__Group__1__Impl_in_rule__HighBindExpression__Group__14546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HighBindExpression__Group_1__0_in_rule__HighBindExpression__Group__1__Impl4573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HighBindExpression__Group_1__0__Impl_in_rule__HighBindExpression__Group_1__04608 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__HighBindExpression__Group_1__1_in_rule__HighBindExpression__Group_1__04611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__HighBindExpression__Group_1__0__Impl4639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HighBindExpression__Group_1__1__Impl_in_rule__HighBindExpression__Group_1__14670 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__HighBindExpression__Group_1__2_in_rule__HighBindExpression__Group_1__14673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HighBindExpression__Group_1__2__Impl_in_rule__HighBindExpression__Group_1__24731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__HighBindExpression__Group_1__2__Impl4760 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_rule__BracedExpression__Group__0__Impl_in_rule__BracedExpression__Group__04799 = new BitSet(new long[]{0x0000000010000040L});
    public static final BitSet FOLLOW_rule__BracedExpression__Group__1_in_rule__BracedExpression__Group__04802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__BracedExpression__Group__0__Impl4830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BracedExpression__Group__1__Impl_in_rule__BracedExpression__Group__14861 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__BracedExpression__Group__2_in_rule__BracedExpression__Group__14864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BracedExpression__InnerExpressionAssignment_1_in_rule__BracedExpression__Group__1__Impl4891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BracedExpression__Group__2__Impl_in_rule__BracedExpression__Group__24921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__BracedExpression__Group__2__Impl4949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTitle_in_rule__Model__ScannerAssignment_04991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExport_in_rule__Model__ScannerAssignment_15022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGlobal_in_rule__Model__ScannerAssignment_25053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocal_in_rule__Model__ScannerAssignment_35084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefault_in_rule__Model__ScannerAssignment_45115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEof_in_rule__Model__ScannerAssignment_55146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefine_in_rule__Model__ScannerAssignment_65177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStartStates_in_rule__Model__ScannerAssignment_75208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRule_in_rule__Model__ScannerAssignment_85239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Title__NameAssignment_15270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Export__ContentAssignment_15301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Global__ContentAssignment_15332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Local__ContentAssignment_15363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Default__ContentAssignment_15394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Eof__ContentAssignment_15425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefineRule_in_rule__Define__DefinesAssignment_15456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DefineRule__DefineNameAssignment_05487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DefineRule__DefineRuleAssignment_25518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__StartStates__StatesAssignment_15549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleRule_in_rule__Rule__ContentAssignment_15580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSequenceExpression_in_rule__OrExpression__RightAssignment_1_25611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHighBindExpression_in_rule__SequenceExpression__RightAssignment_1_15642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRegularExpression_in_rule__BracedExpression__InnerExpressionAssignment_15673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CHAR_in_rule__Atom__ValueAssignment5704 = new BitSet(new long[]{0x0000000000000002L});

}