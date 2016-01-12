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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'RULE'", "'RULES'", "':-'", "':'", "'NOT'", "'-'", "'STD'", "'*'", "'SCANNER'", "'EXPORT {'", "'}'", "'GLOBAL {'", "'LOCAL {'", "'DEFAULT {'", "'EOF {'", "'DEFINE'", "'='", "'.'", "'START'", "','", "'{'", "'#'"
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


    // $ANTLR start "entryRuleScanner"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:88:1: entryRuleScanner : ruleScanner EOF ;
    public final void entryRuleScanner() throws RecognitionException {
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:89:1: ( ruleScanner EOF )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:90:1: ruleScanner EOF
            {
             before(grammarAccess.getScannerRule()); 
            pushFollow(FOLLOW_ruleScanner_in_entryRuleScanner121);
            ruleScanner();

            state._fsp--;

             after(grammarAccess.getScannerRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleScanner128); 

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
    // $ANTLR end "entryRuleScanner"


    // $ANTLR start "ruleScanner"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:97:1: ruleScanner : ( ( rule__Scanner__Group__0 ) ) ;
    public final void ruleScanner() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:101:2: ( ( ( rule__Scanner__Group__0 ) ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:102:1: ( ( rule__Scanner__Group__0 ) )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:102:1: ( ( rule__Scanner__Group__0 ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:103:1: ( rule__Scanner__Group__0 )
            {
             before(grammarAccess.getScannerAccess().getGroup()); 
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:104:1: ( rule__Scanner__Group__0 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:104:2: rule__Scanner__Group__0
            {
            pushFollow(FOLLOW_rule__Scanner__Group__0_in_ruleScanner154);
            rule__Scanner__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getScannerAccess().getGroup()); 

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
    // $ANTLR end "ruleScanner"


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


    // $ANTLR start "entryRuleStartState"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:340:1: entryRuleStartState : ruleStartState EOF ;
    public final void entryRuleStartState() throws RecognitionException {
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:341:1: ( ruleStartState EOF )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:342:1: ruleStartState EOF
            {
             before(grammarAccess.getStartStateRule()); 
            pushFollow(FOLLOW_ruleStartState_in_entryRuleStartState661);
            ruleStartState();

            state._fsp--;

             after(grammarAccess.getStartStateRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStartState668); 

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
    // $ANTLR end "entryRuleStartState"


    // $ANTLR start "ruleStartState"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:349:1: ruleStartState : ( ( rule__StartState__NameAssignment ) ) ;
    public final void ruleStartState() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:353:2: ( ( ( rule__StartState__NameAssignment ) ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:354:1: ( ( rule__StartState__NameAssignment ) )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:354:1: ( ( rule__StartState__NameAssignment ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:355:1: ( rule__StartState__NameAssignment )
            {
             before(grammarAccess.getStartStateAccess().getNameAssignment()); 
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:356:1: ( rule__StartState__NameAssignment )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:356:2: rule__StartState__NameAssignment
            {
            pushFollow(FOLLOW_rule__StartState__NameAssignment_in_ruleStartState694);
            rule__StartState__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getStartStateAccess().getNameAssignment()); 

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
    // $ANTLR end "ruleStartState"


    // $ANTLR start "entryRuleRule"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:368:1: entryRuleRule : ruleRule EOF ;
    public final void entryRuleRule() throws RecognitionException {
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:369:1: ( ruleRule EOF )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:370:1: ruleRule EOF
            {
             before(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_ruleRule_in_entryRuleRule721);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getRuleRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRule728); 

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
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:377:1: ruleRule : ( ( rule__Rule__Group__0 ) ) ;
    public final void ruleRule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:381:2: ( ( ( rule__Rule__Group__0 ) ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:382:1: ( ( rule__Rule__Group__0 ) )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:382:1: ( ( rule__Rule__Group__0 ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:383:1: ( rule__Rule__Group__0 )
            {
             before(grammarAccess.getRuleAccess().getGroup()); 
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:384:1: ( rule__Rule__Group__0 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:384:2: rule__Rule__Group__0
            {
            pushFollow(FOLLOW_rule__Rule__Group__0_in_ruleRule754);
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
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:396:1: entryRuleSingleRule : ruleSingleRule EOF ;
    public final void entryRuleSingleRule() throws RecognitionException {
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:397:1: ( ruleSingleRule EOF )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:398:1: ruleSingleRule EOF
            {
             before(grammarAccess.getSingleRuleRule()); 
            pushFollow(FOLLOW_ruleSingleRule_in_entryRuleSingleRule781);
            ruleSingleRule();

            state._fsp--;

             after(grammarAccess.getSingleRuleRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSingleRule788); 

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
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:405:1: ruleSingleRule : ( ( rule__SingleRule__Group__0 ) ) ;
    public final void ruleSingleRule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:409:2: ( ( ( rule__SingleRule__Group__0 ) ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:410:1: ( ( rule__SingleRule__Group__0 ) )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:410:1: ( ( rule__SingleRule__Group__0 ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:411:1: ( rule__SingleRule__Group__0 )
            {
             before(grammarAccess.getSingleRuleAccess().getGroup()); 
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:412:1: ( rule__SingleRule__Group__0 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:412:2: rule__SingleRule__Group__0
            {
            pushFollow(FOLLOW_rule__SingleRule__Group__0_in_ruleSingleRule814);
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


    // $ANTLR start "entryRuleRuleStart"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:424:1: entryRuleRuleStart : ruleRuleStart EOF ;
    public final void entryRuleRuleStart() throws RecognitionException {
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:425:1: ( ruleRuleStart EOF )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:426:1: ruleRuleStart EOF
            {
             before(grammarAccess.getRuleStartRule()); 
            pushFollow(FOLLOW_ruleRuleStart_in_entryRuleRuleStart841);
            ruleRuleStart();

            state._fsp--;

             after(grammarAccess.getRuleStartRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRuleStart848); 

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
    // $ANTLR end "entryRuleRuleStart"


    // $ANTLR start "ruleRuleStart"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:433:1: ruleRuleStart : ( ( rule__RuleStart__Group__0 ) ) ;
    public final void ruleRuleStart() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:437:2: ( ( ( rule__RuleStart__Group__0 ) ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:438:1: ( ( rule__RuleStart__Group__0 ) )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:438:1: ( ( rule__RuleStart__Group__0 ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:439:1: ( rule__RuleStart__Group__0 )
            {
             before(grammarAccess.getRuleStartAccess().getGroup()); 
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:440:1: ( rule__RuleStart__Group__0 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:440:2: rule__RuleStart__Group__0
            {
            pushFollow(FOLLOW_rule__RuleStart__Group__0_in_ruleRuleStart874);
            rule__RuleStart__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRuleStartAccess().getGroup()); 

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
    // $ANTLR end "ruleRuleStart"


    // $ANTLR start "rule__Rule__Alternatives_0"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:454:1: rule__Rule__Alternatives_0 : ( ( 'RULE' ) | ( 'RULES' ) );
    public final void rule__Rule__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:458:1: ( ( 'RULE' ) | ( 'RULES' ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            else if ( (LA1_0==12) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:459:1: ( 'RULE' )
                    {
                    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:459:1: ( 'RULE' )
                    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:460:1: 'RULE'
                    {
                     before(grammarAccess.getRuleAccess().getRULEKeyword_0_0()); 
                    match(input,11,FOLLOW_11_in_rule__Rule__Alternatives_0913); 
                     after(grammarAccess.getRuleAccess().getRULEKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:467:6: ( 'RULES' )
                    {
                    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:467:6: ( 'RULES' )
                    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:468:1: 'RULES'
                    {
                     before(grammarAccess.getRuleAccess().getRULESKeyword_0_1()); 
                    match(input,12,FOLLOW_12_in_rule__Rule__Alternatives_0933); 
                     after(grammarAccess.getRuleAccess().getRULESKeyword_0_1()); 

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
    // $ANTLR end "rule__Rule__Alternatives_0"


    // $ANTLR start "rule__SingleRule__Alternatives_2"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:480:1: rule__SingleRule__Alternatives_2 : ( ( ':-' ) | ( ':' ) );
    public final void rule__SingleRule__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:484:1: ( ( ':-' ) | ( ':' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            else if ( (LA2_0==14) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:485:1: ( ':-' )
                    {
                    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:485:1: ( ':-' )
                    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:486:1: ':-'
                    {
                     before(grammarAccess.getSingleRuleAccess().getColonHyphenMinusKeyword_2_0()); 
                    match(input,13,FOLLOW_13_in_rule__SingleRule__Alternatives_2968); 
                     after(grammarAccess.getSingleRuleAccess().getColonHyphenMinusKeyword_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:493:6: ( ':' )
                    {
                    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:493:6: ( ':' )
                    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:494:1: ':'
                    {
                     before(grammarAccess.getSingleRuleAccess().getColonKeyword_2_1()); 
                    match(input,14,FOLLOW_14_in_rule__SingleRule__Alternatives_2988); 
                     after(grammarAccess.getSingleRuleAccess().getColonKeyword_2_1()); 

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
    // $ANTLR end "rule__SingleRule__Alternatives_2"


    // $ANTLR start "rule__RuleStart__Alternatives_0"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:506:1: rule__RuleStart__Alternatives_0 : ( ( 'NOT' ) | ( '-' ) );
    public final void rule__RuleStart__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:510:1: ( ( 'NOT' ) | ( '-' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            else if ( (LA3_0==16) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:511:1: ( 'NOT' )
                    {
                    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:511:1: ( 'NOT' )
                    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:512:1: 'NOT'
                    {
                     before(grammarAccess.getRuleStartAccess().getNOTKeyword_0_0()); 
                    match(input,15,FOLLOW_15_in_rule__RuleStart__Alternatives_01023); 
                     after(grammarAccess.getRuleStartAccess().getNOTKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:519:6: ( '-' )
                    {
                    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:519:6: ( '-' )
                    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:520:1: '-'
                    {
                     before(grammarAccess.getRuleStartAccess().getHyphenMinusKeyword_0_1()); 
                    match(input,16,FOLLOW_16_in_rule__RuleStart__Alternatives_01043); 
                     after(grammarAccess.getRuleStartAccess().getHyphenMinusKeyword_0_1()); 

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
    // $ANTLR end "rule__RuleStart__Alternatives_0"


    // $ANTLR start "rule__RuleStart__Alternatives_2"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:532:1: rule__RuleStart__Alternatives_2 : ( ( ( rule__RuleStart__Group_2_0__0 ) ) | ( 'STD' ) | ( '*' ) );
    public final void rule__RuleStart__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:536:1: ( ( ( rule__RuleStart__Group_2_0__0 ) ) | ( 'STD' ) | ( '*' ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt4=1;
                }
                break;
            case 17:
                {
                alt4=2;
                }
                break;
            case 18:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:537:1: ( ( rule__RuleStart__Group_2_0__0 ) )
                    {
                    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:537:1: ( ( rule__RuleStart__Group_2_0__0 ) )
                    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:538:1: ( rule__RuleStart__Group_2_0__0 )
                    {
                     before(grammarAccess.getRuleStartAccess().getGroup_2_0()); 
                    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:539:1: ( rule__RuleStart__Group_2_0__0 )
                    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:539:2: rule__RuleStart__Group_2_0__0
                    {
                    pushFollow(FOLLOW_rule__RuleStart__Group_2_0__0_in_rule__RuleStart__Alternatives_21077);
                    rule__RuleStart__Group_2_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRuleStartAccess().getGroup_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:543:6: ( 'STD' )
                    {
                    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:543:6: ( 'STD' )
                    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:544:1: 'STD'
                    {
                     before(grammarAccess.getRuleStartAccess().getSTDKeyword_2_1()); 
                    match(input,17,FOLLOW_17_in_rule__RuleStart__Alternatives_21096); 
                     after(grammarAccess.getRuleStartAccess().getSTDKeyword_2_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:551:6: ( '*' )
                    {
                    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:551:6: ( '*' )
                    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:552:1: '*'
                    {
                     before(grammarAccess.getRuleStartAccess().getAsteriskKeyword_2_2()); 
                    match(input,18,FOLLOW_18_in_rule__RuleStart__Alternatives_21116); 
                     after(grammarAccess.getRuleStartAccess().getAsteriskKeyword_2_2()); 

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
    // $ANTLR end "rule__RuleStart__Alternatives_2"


    // $ANTLR start "rule__Model__Group__0"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:567:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:571:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:572:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__01149);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__1_in_rule__Model__Group__01152);
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
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:579:1: rule__Model__Group__0__Impl : ( ( rule__Model__ScannerAssignment_0 )? ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:583:1: ( ( ( rule__Model__ScannerAssignment_0 )? ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:584:1: ( ( rule__Model__ScannerAssignment_0 )? )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:584:1: ( ( rule__Model__ScannerAssignment_0 )? )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:585:1: ( rule__Model__ScannerAssignment_0 )?
            {
             before(grammarAccess.getModelAccess().getScannerAssignment_0()); 
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:586:1: ( rule__Model__ScannerAssignment_0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:586:2: rule__Model__ScannerAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Model__ScannerAssignment_0_in_rule__Model__Group__0__Impl1179);
                    rule__Model__ScannerAssignment_0();

                    state._fsp--;


                    }
                    break;

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
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:596:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:600:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:601:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__11210);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__2_in_rule__Model__Group__11213);
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
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:608:1: rule__Model__Group__1__Impl : ( ( rule__Model__ScannerAssignment_1 )? ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:612:1: ( ( ( rule__Model__ScannerAssignment_1 )? ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:613:1: ( ( rule__Model__ScannerAssignment_1 )? )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:613:1: ( ( rule__Model__ScannerAssignment_1 )? )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:614:1: ( rule__Model__ScannerAssignment_1 )?
            {
             before(grammarAccess.getModelAccess().getScannerAssignment_1()); 
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:615:1: ( rule__Model__ScannerAssignment_1 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:615:2: rule__Model__ScannerAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Model__ScannerAssignment_1_in_rule__Model__Group__1__Impl1240);
                    rule__Model__ScannerAssignment_1();

                    state._fsp--;


                    }
                    break;

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
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:625:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:629:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:630:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__21271);
            rule__Model__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__3_in_rule__Model__Group__21274);
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
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:637:1: rule__Model__Group__2__Impl : ( ( rule__Model__ScannerAssignment_2 )? ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:641:1: ( ( ( rule__Model__ScannerAssignment_2 )? ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:642:1: ( ( rule__Model__ScannerAssignment_2 )? )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:642:1: ( ( rule__Model__ScannerAssignment_2 )? )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:643:1: ( rule__Model__ScannerAssignment_2 )?
            {
             before(grammarAccess.getModelAccess().getScannerAssignment_2()); 
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:644:1: ( rule__Model__ScannerAssignment_2 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==22) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:644:2: rule__Model__ScannerAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Model__ScannerAssignment_2_in_rule__Model__Group__2__Impl1301);
                    rule__Model__ScannerAssignment_2();

                    state._fsp--;


                    }
                    break;

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
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:654:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:658:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:659:2: rule__Model__Group__3__Impl rule__Model__Group__4
            {
            pushFollow(FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__31332);
            rule__Model__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__4_in_rule__Model__Group__31335);
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
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:666:1: rule__Model__Group__3__Impl : ( ( rule__Model__ScannerAssignment_3 )? ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:670:1: ( ( ( rule__Model__ScannerAssignment_3 )? ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:671:1: ( ( rule__Model__ScannerAssignment_3 )? )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:671:1: ( ( rule__Model__ScannerAssignment_3 )? )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:672:1: ( rule__Model__ScannerAssignment_3 )?
            {
             before(grammarAccess.getModelAccess().getScannerAssignment_3()); 
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:673:1: ( rule__Model__ScannerAssignment_3 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==23) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:673:2: rule__Model__ScannerAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Model__ScannerAssignment_3_in_rule__Model__Group__3__Impl1362);
                    rule__Model__ScannerAssignment_3();

                    state._fsp--;


                    }
                    break;

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
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:683:1: rule__Model__Group__4 : rule__Model__Group__4__Impl rule__Model__Group__5 ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:687:1: ( rule__Model__Group__4__Impl rule__Model__Group__5 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:688:2: rule__Model__Group__4__Impl rule__Model__Group__5
            {
            pushFollow(FOLLOW_rule__Model__Group__4__Impl_in_rule__Model__Group__41393);
            rule__Model__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__5_in_rule__Model__Group__41396);
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
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:695:1: rule__Model__Group__4__Impl : ( ( rule__Model__ScannerAssignment_4 )? ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:699:1: ( ( ( rule__Model__ScannerAssignment_4 )? ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:700:1: ( ( rule__Model__ScannerAssignment_4 )? )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:700:1: ( ( rule__Model__ScannerAssignment_4 )? )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:701:1: ( rule__Model__ScannerAssignment_4 )?
            {
             before(grammarAccess.getModelAccess().getScannerAssignment_4()); 
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:702:1: ( rule__Model__ScannerAssignment_4 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==24) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:702:2: rule__Model__ScannerAssignment_4
                    {
                    pushFollow(FOLLOW_rule__Model__ScannerAssignment_4_in_rule__Model__Group__4__Impl1423);
                    rule__Model__ScannerAssignment_4();

                    state._fsp--;


                    }
                    break;

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
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:712:1: rule__Model__Group__5 : rule__Model__Group__5__Impl rule__Model__Group__6 ;
    public final void rule__Model__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:716:1: ( rule__Model__Group__5__Impl rule__Model__Group__6 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:717:2: rule__Model__Group__5__Impl rule__Model__Group__6
            {
            pushFollow(FOLLOW_rule__Model__Group__5__Impl_in_rule__Model__Group__51454);
            rule__Model__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__6_in_rule__Model__Group__51457);
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
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:724:1: rule__Model__Group__5__Impl : ( ( rule__Model__ScannerAssignment_5 )? ) ;
    public final void rule__Model__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:728:1: ( ( ( rule__Model__ScannerAssignment_5 )? ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:729:1: ( ( rule__Model__ScannerAssignment_5 )? )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:729:1: ( ( rule__Model__ScannerAssignment_5 )? )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:730:1: ( rule__Model__ScannerAssignment_5 )?
            {
             before(grammarAccess.getModelAccess().getScannerAssignment_5()); 
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:731:1: ( rule__Model__ScannerAssignment_5 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==25) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:731:2: rule__Model__ScannerAssignment_5
                    {
                    pushFollow(FOLLOW_rule__Model__ScannerAssignment_5_in_rule__Model__Group__5__Impl1484);
                    rule__Model__ScannerAssignment_5();

                    state._fsp--;


                    }
                    break;

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
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:741:1: rule__Model__Group__6 : rule__Model__Group__6__Impl rule__Model__Group__7 ;
    public final void rule__Model__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:745:1: ( rule__Model__Group__6__Impl rule__Model__Group__7 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:746:2: rule__Model__Group__6__Impl rule__Model__Group__7
            {
            pushFollow(FOLLOW_rule__Model__Group__6__Impl_in_rule__Model__Group__61515);
            rule__Model__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__7_in_rule__Model__Group__61518);
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
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:753:1: rule__Model__Group__6__Impl : ( ( rule__Model__ScannerAssignment_6 ) ) ;
    public final void rule__Model__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:757:1: ( ( ( rule__Model__ScannerAssignment_6 ) ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:758:1: ( ( rule__Model__ScannerAssignment_6 ) )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:758:1: ( ( rule__Model__ScannerAssignment_6 ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:759:1: ( rule__Model__ScannerAssignment_6 )
            {
             before(grammarAccess.getModelAccess().getScannerAssignment_6()); 
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:760:1: ( rule__Model__ScannerAssignment_6 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:760:2: rule__Model__ScannerAssignment_6
            {
            pushFollow(FOLLOW_rule__Model__ScannerAssignment_6_in_rule__Model__Group__6__Impl1545);
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
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:770:1: rule__Model__Group__7 : rule__Model__Group__7__Impl rule__Model__Group__8 ;
    public final void rule__Model__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:774:1: ( rule__Model__Group__7__Impl rule__Model__Group__8 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:775:2: rule__Model__Group__7__Impl rule__Model__Group__8
            {
            pushFollow(FOLLOW_rule__Model__Group__7__Impl_in_rule__Model__Group__71575);
            rule__Model__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__8_in_rule__Model__Group__71578);
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
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:782:1: rule__Model__Group__7__Impl : ( ( rule__Model__ScannerAssignment_7 )? ) ;
    public final void rule__Model__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:786:1: ( ( ( rule__Model__ScannerAssignment_7 )? ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:787:1: ( ( rule__Model__ScannerAssignment_7 )? )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:787:1: ( ( rule__Model__ScannerAssignment_7 )? )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:788:1: ( rule__Model__ScannerAssignment_7 )?
            {
             before(grammarAccess.getModelAccess().getScannerAssignment_7()); 
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:789:1: ( rule__Model__ScannerAssignment_7 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==29) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:789:2: rule__Model__ScannerAssignment_7
                    {
                    pushFollow(FOLLOW_rule__Model__ScannerAssignment_7_in_rule__Model__Group__7__Impl1605);
                    rule__Model__ScannerAssignment_7();

                    state._fsp--;


                    }
                    break;

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
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:799:1: rule__Model__Group__8 : rule__Model__Group__8__Impl ;
    public final void rule__Model__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:803:1: ( rule__Model__Group__8__Impl )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:804:2: rule__Model__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group__8__Impl_in_rule__Model__Group__81636);
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
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:810:1: rule__Model__Group__8__Impl : ( ( rule__Model__ScannerAssignment_8 ) ) ;
    public final void rule__Model__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:814:1: ( ( ( rule__Model__ScannerAssignment_8 ) ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:815:1: ( ( rule__Model__ScannerAssignment_8 ) )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:815:1: ( ( rule__Model__ScannerAssignment_8 ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:816:1: ( rule__Model__ScannerAssignment_8 )
            {
             before(grammarAccess.getModelAccess().getScannerAssignment_8()); 
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:817:1: ( rule__Model__ScannerAssignment_8 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:817:2: rule__Model__ScannerAssignment_8
            {
            pushFollow(FOLLOW_rule__Model__ScannerAssignment_8_in_rule__Model__Group__8__Impl1663);
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


    // $ANTLR start "rule__Scanner__Group__0"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:845:1: rule__Scanner__Group__0 : rule__Scanner__Group__0__Impl rule__Scanner__Group__1 ;
    public final void rule__Scanner__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:849:1: ( rule__Scanner__Group__0__Impl rule__Scanner__Group__1 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:850:2: rule__Scanner__Group__0__Impl rule__Scanner__Group__1
            {
            pushFollow(FOLLOW_rule__Scanner__Group__0__Impl_in_rule__Scanner__Group__01711);
            rule__Scanner__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Scanner__Group__1_in_rule__Scanner__Group__01714);
            rule__Scanner__Group__1();

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
    // $ANTLR end "rule__Scanner__Group__0"


    // $ANTLR start "rule__Scanner__Group__0__Impl"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:857:1: rule__Scanner__Group__0__Impl : ( 'SCANNER' ) ;
    public final void rule__Scanner__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:861:1: ( ( 'SCANNER' ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:862:1: ( 'SCANNER' )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:862:1: ( 'SCANNER' )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:863:1: 'SCANNER'
            {
             before(grammarAccess.getScannerAccess().getSCANNERKeyword_0()); 
            match(input,19,FOLLOW_19_in_rule__Scanner__Group__0__Impl1742); 
             after(grammarAccess.getScannerAccess().getSCANNERKeyword_0()); 

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
    // $ANTLR end "rule__Scanner__Group__0__Impl"


    // $ANTLR start "rule__Scanner__Group__1"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:876:1: rule__Scanner__Group__1 : rule__Scanner__Group__1__Impl ;
    public final void rule__Scanner__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:880:1: ( rule__Scanner__Group__1__Impl )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:881:2: rule__Scanner__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Scanner__Group__1__Impl_in_rule__Scanner__Group__11773);
            rule__Scanner__Group__1__Impl();

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
    // $ANTLR end "rule__Scanner__Group__1"


    // $ANTLR start "rule__Scanner__Group__1__Impl"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:887:1: rule__Scanner__Group__1__Impl : ( ( rule__Scanner__NameAssignment_1 ) ) ;
    public final void rule__Scanner__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:891:1: ( ( ( rule__Scanner__NameAssignment_1 ) ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:892:1: ( ( rule__Scanner__NameAssignment_1 ) )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:892:1: ( ( rule__Scanner__NameAssignment_1 ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:893:1: ( rule__Scanner__NameAssignment_1 )
            {
             before(grammarAccess.getScannerAccess().getNameAssignment_1()); 
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:894:1: ( rule__Scanner__NameAssignment_1 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:894:2: rule__Scanner__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Scanner__NameAssignment_1_in_rule__Scanner__Group__1__Impl1800);
            rule__Scanner__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getScannerAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Scanner__Group__1__Impl"


    // $ANTLR start "rule__Export__Group__0"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:908:1: rule__Export__Group__0 : rule__Export__Group__0__Impl rule__Export__Group__1 ;
    public final void rule__Export__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:912:1: ( rule__Export__Group__0__Impl rule__Export__Group__1 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:913:2: rule__Export__Group__0__Impl rule__Export__Group__1
            {
            pushFollow(FOLLOW_rule__Export__Group__0__Impl_in_rule__Export__Group__01834);
            rule__Export__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Export__Group__1_in_rule__Export__Group__01837);
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
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:920:1: rule__Export__Group__0__Impl : ( 'EXPORT {' ) ;
    public final void rule__Export__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:924:1: ( ( 'EXPORT {' ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:925:1: ( 'EXPORT {' )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:925:1: ( 'EXPORT {' )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:926:1: 'EXPORT {'
            {
             before(grammarAccess.getExportAccess().getEXPORTKeyword_0()); 
            match(input,20,FOLLOW_20_in_rule__Export__Group__0__Impl1865); 
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
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:939:1: rule__Export__Group__1 : rule__Export__Group__1__Impl rule__Export__Group__2 ;
    public final void rule__Export__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:943:1: ( rule__Export__Group__1__Impl rule__Export__Group__2 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:944:2: rule__Export__Group__1__Impl rule__Export__Group__2
            {
            pushFollow(FOLLOW_rule__Export__Group__1__Impl_in_rule__Export__Group__11896);
            rule__Export__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Export__Group__2_in_rule__Export__Group__11899);
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
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:951:1: rule__Export__Group__1__Impl : ( ( rule__Export__ContentAssignment_1 ) ) ;
    public final void rule__Export__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:955:1: ( ( ( rule__Export__ContentAssignment_1 ) ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:956:1: ( ( rule__Export__ContentAssignment_1 ) )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:956:1: ( ( rule__Export__ContentAssignment_1 ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:957:1: ( rule__Export__ContentAssignment_1 )
            {
             before(grammarAccess.getExportAccess().getContentAssignment_1()); 
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:958:1: ( rule__Export__ContentAssignment_1 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:958:2: rule__Export__ContentAssignment_1
            {
            pushFollow(FOLLOW_rule__Export__ContentAssignment_1_in_rule__Export__Group__1__Impl1926);
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
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:968:1: rule__Export__Group__2 : rule__Export__Group__2__Impl ;
    public final void rule__Export__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:972:1: ( rule__Export__Group__2__Impl )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:973:2: rule__Export__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Export__Group__2__Impl_in_rule__Export__Group__21956);
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
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:979:1: rule__Export__Group__2__Impl : ( '}' ) ;
    public final void rule__Export__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:983:1: ( ( '}' ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:984:1: ( '}' )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:984:1: ( '}' )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:985:1: '}'
            {
             before(grammarAccess.getExportAccess().getRightCurlyBracketKeyword_2()); 
            match(input,21,FOLLOW_21_in_rule__Export__Group__2__Impl1984); 
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
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1004:1: rule__Global__Group__0 : rule__Global__Group__0__Impl rule__Global__Group__1 ;
    public final void rule__Global__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1008:1: ( rule__Global__Group__0__Impl rule__Global__Group__1 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1009:2: rule__Global__Group__0__Impl rule__Global__Group__1
            {
            pushFollow(FOLLOW_rule__Global__Group__0__Impl_in_rule__Global__Group__02021);
            rule__Global__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Global__Group__1_in_rule__Global__Group__02024);
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
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1016:1: rule__Global__Group__0__Impl : ( 'GLOBAL {' ) ;
    public final void rule__Global__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1020:1: ( ( 'GLOBAL {' ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1021:1: ( 'GLOBAL {' )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1021:1: ( 'GLOBAL {' )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1022:1: 'GLOBAL {'
            {
             before(grammarAccess.getGlobalAccess().getGLOBALKeyword_0()); 
            match(input,22,FOLLOW_22_in_rule__Global__Group__0__Impl2052); 
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
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1035:1: rule__Global__Group__1 : rule__Global__Group__1__Impl rule__Global__Group__2 ;
    public final void rule__Global__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1039:1: ( rule__Global__Group__1__Impl rule__Global__Group__2 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1040:2: rule__Global__Group__1__Impl rule__Global__Group__2
            {
            pushFollow(FOLLOW_rule__Global__Group__1__Impl_in_rule__Global__Group__12083);
            rule__Global__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Global__Group__2_in_rule__Global__Group__12086);
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
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1047:1: rule__Global__Group__1__Impl : ( ( rule__Global__ContentAssignment_1 ) ) ;
    public final void rule__Global__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1051:1: ( ( ( rule__Global__ContentAssignment_1 ) ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1052:1: ( ( rule__Global__ContentAssignment_1 ) )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1052:1: ( ( rule__Global__ContentAssignment_1 ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1053:1: ( rule__Global__ContentAssignment_1 )
            {
             before(grammarAccess.getGlobalAccess().getContentAssignment_1()); 
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1054:1: ( rule__Global__ContentAssignment_1 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1054:2: rule__Global__ContentAssignment_1
            {
            pushFollow(FOLLOW_rule__Global__ContentAssignment_1_in_rule__Global__Group__1__Impl2113);
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
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1064:1: rule__Global__Group__2 : rule__Global__Group__2__Impl ;
    public final void rule__Global__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1068:1: ( rule__Global__Group__2__Impl )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1069:2: rule__Global__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Global__Group__2__Impl_in_rule__Global__Group__22143);
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
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1075:1: rule__Global__Group__2__Impl : ( '}' ) ;
    public final void rule__Global__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1079:1: ( ( '}' ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1080:1: ( '}' )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1080:1: ( '}' )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1081:1: '}'
            {
             before(grammarAccess.getGlobalAccess().getRightCurlyBracketKeyword_2()); 
            match(input,21,FOLLOW_21_in_rule__Global__Group__2__Impl2171); 
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
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1100:1: rule__Local__Group__0 : rule__Local__Group__0__Impl rule__Local__Group__1 ;
    public final void rule__Local__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1104:1: ( rule__Local__Group__0__Impl rule__Local__Group__1 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1105:2: rule__Local__Group__0__Impl rule__Local__Group__1
            {
            pushFollow(FOLLOW_rule__Local__Group__0__Impl_in_rule__Local__Group__02208);
            rule__Local__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Local__Group__1_in_rule__Local__Group__02211);
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
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1112:1: rule__Local__Group__0__Impl : ( 'LOCAL {' ) ;
    public final void rule__Local__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1116:1: ( ( 'LOCAL {' ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1117:1: ( 'LOCAL {' )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1117:1: ( 'LOCAL {' )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1118:1: 'LOCAL {'
            {
             before(grammarAccess.getLocalAccess().getLOCALKeyword_0()); 
            match(input,23,FOLLOW_23_in_rule__Local__Group__0__Impl2239); 
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
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1131:1: rule__Local__Group__1 : rule__Local__Group__1__Impl rule__Local__Group__2 ;
    public final void rule__Local__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1135:1: ( rule__Local__Group__1__Impl rule__Local__Group__2 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1136:2: rule__Local__Group__1__Impl rule__Local__Group__2
            {
            pushFollow(FOLLOW_rule__Local__Group__1__Impl_in_rule__Local__Group__12270);
            rule__Local__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Local__Group__2_in_rule__Local__Group__12273);
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
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1143:1: rule__Local__Group__1__Impl : ( ( rule__Local__ContentAssignment_1 ) ) ;
    public final void rule__Local__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1147:1: ( ( ( rule__Local__ContentAssignment_1 ) ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1148:1: ( ( rule__Local__ContentAssignment_1 ) )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1148:1: ( ( rule__Local__ContentAssignment_1 ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1149:1: ( rule__Local__ContentAssignment_1 )
            {
             before(grammarAccess.getLocalAccess().getContentAssignment_1()); 
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1150:1: ( rule__Local__ContentAssignment_1 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1150:2: rule__Local__ContentAssignment_1
            {
            pushFollow(FOLLOW_rule__Local__ContentAssignment_1_in_rule__Local__Group__1__Impl2300);
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
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1160:1: rule__Local__Group__2 : rule__Local__Group__2__Impl ;
    public final void rule__Local__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1164:1: ( rule__Local__Group__2__Impl )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1165:2: rule__Local__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Local__Group__2__Impl_in_rule__Local__Group__22330);
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
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1171:1: rule__Local__Group__2__Impl : ( '}' ) ;
    public final void rule__Local__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1175:1: ( ( '}' ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1176:1: ( '}' )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1176:1: ( '}' )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1177:1: '}'
            {
             before(grammarAccess.getLocalAccess().getRightCurlyBracketKeyword_2()); 
            match(input,21,FOLLOW_21_in_rule__Local__Group__2__Impl2358); 
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
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1196:1: rule__Default__Group__0 : rule__Default__Group__0__Impl rule__Default__Group__1 ;
    public final void rule__Default__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1200:1: ( rule__Default__Group__0__Impl rule__Default__Group__1 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1201:2: rule__Default__Group__0__Impl rule__Default__Group__1
            {
            pushFollow(FOLLOW_rule__Default__Group__0__Impl_in_rule__Default__Group__02395);
            rule__Default__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Default__Group__1_in_rule__Default__Group__02398);
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
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1208:1: rule__Default__Group__0__Impl : ( 'DEFAULT {' ) ;
    public final void rule__Default__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1212:1: ( ( 'DEFAULT {' ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1213:1: ( 'DEFAULT {' )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1213:1: ( 'DEFAULT {' )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1214:1: 'DEFAULT {'
            {
             before(grammarAccess.getDefaultAccess().getDEFAULTKeyword_0()); 
            match(input,24,FOLLOW_24_in_rule__Default__Group__0__Impl2426); 
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
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1227:1: rule__Default__Group__1 : rule__Default__Group__1__Impl rule__Default__Group__2 ;
    public final void rule__Default__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1231:1: ( rule__Default__Group__1__Impl rule__Default__Group__2 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1232:2: rule__Default__Group__1__Impl rule__Default__Group__2
            {
            pushFollow(FOLLOW_rule__Default__Group__1__Impl_in_rule__Default__Group__12457);
            rule__Default__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Default__Group__2_in_rule__Default__Group__12460);
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
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1239:1: rule__Default__Group__1__Impl : ( ( rule__Default__ContentAssignment_1 ) ) ;
    public final void rule__Default__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1243:1: ( ( ( rule__Default__ContentAssignment_1 ) ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1244:1: ( ( rule__Default__ContentAssignment_1 ) )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1244:1: ( ( rule__Default__ContentAssignment_1 ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1245:1: ( rule__Default__ContentAssignment_1 )
            {
             before(grammarAccess.getDefaultAccess().getContentAssignment_1()); 
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1246:1: ( rule__Default__ContentAssignment_1 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1246:2: rule__Default__ContentAssignment_1
            {
            pushFollow(FOLLOW_rule__Default__ContentAssignment_1_in_rule__Default__Group__1__Impl2487);
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
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1256:1: rule__Default__Group__2 : rule__Default__Group__2__Impl ;
    public final void rule__Default__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1260:1: ( rule__Default__Group__2__Impl )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1261:2: rule__Default__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Default__Group__2__Impl_in_rule__Default__Group__22517);
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
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1267:1: rule__Default__Group__2__Impl : ( '}' ) ;
    public final void rule__Default__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1271:1: ( ( '}' ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1272:1: ( '}' )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1272:1: ( '}' )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1273:1: '}'
            {
             before(grammarAccess.getDefaultAccess().getRightCurlyBracketKeyword_2()); 
            match(input,21,FOLLOW_21_in_rule__Default__Group__2__Impl2545); 
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
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1292:1: rule__Eof__Group__0 : rule__Eof__Group__0__Impl rule__Eof__Group__1 ;
    public final void rule__Eof__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1296:1: ( rule__Eof__Group__0__Impl rule__Eof__Group__1 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1297:2: rule__Eof__Group__0__Impl rule__Eof__Group__1
            {
            pushFollow(FOLLOW_rule__Eof__Group__0__Impl_in_rule__Eof__Group__02582);
            rule__Eof__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Eof__Group__1_in_rule__Eof__Group__02585);
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
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1304:1: rule__Eof__Group__0__Impl : ( 'EOF {' ) ;
    public final void rule__Eof__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1308:1: ( ( 'EOF {' ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1309:1: ( 'EOF {' )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1309:1: ( 'EOF {' )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1310:1: 'EOF {'
            {
             before(grammarAccess.getEofAccess().getEOFKeyword_0()); 
            match(input,25,FOLLOW_25_in_rule__Eof__Group__0__Impl2613); 
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
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1323:1: rule__Eof__Group__1 : rule__Eof__Group__1__Impl rule__Eof__Group__2 ;
    public final void rule__Eof__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1327:1: ( rule__Eof__Group__1__Impl rule__Eof__Group__2 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1328:2: rule__Eof__Group__1__Impl rule__Eof__Group__2
            {
            pushFollow(FOLLOW_rule__Eof__Group__1__Impl_in_rule__Eof__Group__12644);
            rule__Eof__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Eof__Group__2_in_rule__Eof__Group__12647);
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
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1335:1: rule__Eof__Group__1__Impl : ( ( rule__Eof__ContentAssignment_1 ) ) ;
    public final void rule__Eof__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1339:1: ( ( ( rule__Eof__ContentAssignment_1 ) ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1340:1: ( ( rule__Eof__ContentAssignment_1 ) )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1340:1: ( ( rule__Eof__ContentAssignment_1 ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1341:1: ( rule__Eof__ContentAssignment_1 )
            {
             before(grammarAccess.getEofAccess().getContentAssignment_1()); 
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1342:1: ( rule__Eof__ContentAssignment_1 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1342:2: rule__Eof__ContentAssignment_1
            {
            pushFollow(FOLLOW_rule__Eof__ContentAssignment_1_in_rule__Eof__Group__1__Impl2674);
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
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1352:1: rule__Eof__Group__2 : rule__Eof__Group__2__Impl ;
    public final void rule__Eof__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1356:1: ( rule__Eof__Group__2__Impl )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1357:2: rule__Eof__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Eof__Group__2__Impl_in_rule__Eof__Group__22704);
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
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1363:1: rule__Eof__Group__2__Impl : ( '}' ) ;
    public final void rule__Eof__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1367:1: ( ( '}' ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1368:1: ( '}' )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1368:1: ( '}' )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1369:1: '}'
            {
             before(grammarAccess.getEofAccess().getRightCurlyBracketKeyword_2()); 
            match(input,21,FOLLOW_21_in_rule__Eof__Group__2__Impl2732); 
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
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1388:1: rule__Define__Group__0 : rule__Define__Group__0__Impl rule__Define__Group__1 ;
    public final void rule__Define__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1392:1: ( rule__Define__Group__0__Impl rule__Define__Group__1 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1393:2: rule__Define__Group__0__Impl rule__Define__Group__1
            {
            pushFollow(FOLLOW_rule__Define__Group__0__Impl_in_rule__Define__Group__02769);
            rule__Define__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Define__Group__1_in_rule__Define__Group__02772);
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
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1400:1: rule__Define__Group__0__Impl : ( 'DEFINE' ) ;
    public final void rule__Define__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1404:1: ( ( 'DEFINE' ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1405:1: ( 'DEFINE' )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1405:1: ( 'DEFINE' )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1406:1: 'DEFINE'
            {
             before(grammarAccess.getDefineAccess().getDEFINEKeyword_0()); 
            match(input,26,FOLLOW_26_in_rule__Define__Group__0__Impl2800); 
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
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1419:1: rule__Define__Group__1 : rule__Define__Group__1__Impl ;
    public final void rule__Define__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1423:1: ( rule__Define__Group__1__Impl )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1424:2: rule__Define__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Define__Group__1__Impl_in_rule__Define__Group__12831);
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
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1430:1: rule__Define__Group__1__Impl : ( ( ( rule__Define__DefinesAssignment_1 ) ) ( ( rule__Define__DefinesAssignment_1 )* ) ) ;
    public final void rule__Define__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1434:1: ( ( ( ( rule__Define__DefinesAssignment_1 ) ) ( ( rule__Define__DefinesAssignment_1 )* ) ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1435:1: ( ( ( rule__Define__DefinesAssignment_1 ) ) ( ( rule__Define__DefinesAssignment_1 )* ) )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1435:1: ( ( ( rule__Define__DefinesAssignment_1 ) ) ( ( rule__Define__DefinesAssignment_1 )* ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1436:1: ( ( rule__Define__DefinesAssignment_1 ) ) ( ( rule__Define__DefinesAssignment_1 )* )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1436:1: ( ( rule__Define__DefinesAssignment_1 ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1437:1: ( rule__Define__DefinesAssignment_1 )
            {
             before(grammarAccess.getDefineAccess().getDefinesAssignment_1()); 
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1438:1: ( rule__Define__DefinesAssignment_1 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1438:2: rule__Define__DefinesAssignment_1
            {
            pushFollow(FOLLOW_rule__Define__DefinesAssignment_1_in_rule__Define__Group__1__Impl2860);
            rule__Define__DefinesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDefineAccess().getDefinesAssignment_1()); 

            }

            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1441:1: ( ( rule__Define__DefinesAssignment_1 )* )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1442:1: ( rule__Define__DefinesAssignment_1 )*
            {
             before(grammarAccess.getDefineAccess().getDefinesAssignment_1()); 
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1443:1: ( rule__Define__DefinesAssignment_1 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1443:2: rule__Define__DefinesAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Define__DefinesAssignment_1_in_rule__Define__Group__1__Impl2872);
            	    rule__Define__DefinesAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1458:1: rule__DefineRule__Group__0 : rule__DefineRule__Group__0__Impl rule__DefineRule__Group__1 ;
    public final void rule__DefineRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1462:1: ( rule__DefineRule__Group__0__Impl rule__DefineRule__Group__1 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1463:2: rule__DefineRule__Group__0__Impl rule__DefineRule__Group__1
            {
            pushFollow(FOLLOW_rule__DefineRule__Group__0__Impl_in_rule__DefineRule__Group__02909);
            rule__DefineRule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DefineRule__Group__1_in_rule__DefineRule__Group__02912);
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
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1470:1: rule__DefineRule__Group__0__Impl : ( ( rule__DefineRule__NameAssignment_0 ) ) ;
    public final void rule__DefineRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1474:1: ( ( ( rule__DefineRule__NameAssignment_0 ) ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1475:1: ( ( rule__DefineRule__NameAssignment_0 ) )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1475:1: ( ( rule__DefineRule__NameAssignment_0 ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1476:1: ( rule__DefineRule__NameAssignment_0 )
            {
             before(grammarAccess.getDefineRuleAccess().getNameAssignment_0()); 
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1477:1: ( rule__DefineRule__NameAssignment_0 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1477:2: rule__DefineRule__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__DefineRule__NameAssignment_0_in_rule__DefineRule__Group__0__Impl2939);
            rule__DefineRule__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getDefineRuleAccess().getNameAssignment_0()); 

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
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1487:1: rule__DefineRule__Group__1 : rule__DefineRule__Group__1__Impl rule__DefineRule__Group__2 ;
    public final void rule__DefineRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1491:1: ( rule__DefineRule__Group__1__Impl rule__DefineRule__Group__2 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1492:2: rule__DefineRule__Group__1__Impl rule__DefineRule__Group__2
            {
            pushFollow(FOLLOW_rule__DefineRule__Group__1__Impl_in_rule__DefineRule__Group__12969);
            rule__DefineRule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DefineRule__Group__2_in_rule__DefineRule__Group__12972);
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
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1499:1: rule__DefineRule__Group__1__Impl : ( '=' ) ;
    public final void rule__DefineRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1503:1: ( ( '=' ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1504:1: ( '=' )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1504:1: ( '=' )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1505:1: '='
            {
             before(grammarAccess.getDefineRuleAccess().getEqualsSignKeyword_1()); 
            match(input,27,FOLLOW_27_in_rule__DefineRule__Group__1__Impl3000); 
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
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1518:1: rule__DefineRule__Group__2 : rule__DefineRule__Group__2__Impl rule__DefineRule__Group__3 ;
    public final void rule__DefineRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1522:1: ( rule__DefineRule__Group__2__Impl rule__DefineRule__Group__3 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1523:2: rule__DefineRule__Group__2__Impl rule__DefineRule__Group__3
            {
            pushFollow(FOLLOW_rule__DefineRule__Group__2__Impl_in_rule__DefineRule__Group__23031);
            rule__DefineRule__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DefineRule__Group__3_in_rule__DefineRule__Group__23034);
            rule__DefineRule__Group__3();

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
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1530:1: rule__DefineRule__Group__2__Impl : ( ( rule__DefineRule__RuleAssignment_2 ) ) ;
    public final void rule__DefineRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1534:1: ( ( ( rule__DefineRule__RuleAssignment_2 ) ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1535:1: ( ( rule__DefineRule__RuleAssignment_2 ) )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1535:1: ( ( rule__DefineRule__RuleAssignment_2 ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1536:1: ( rule__DefineRule__RuleAssignment_2 )
            {
             before(grammarAccess.getDefineRuleAccess().getRuleAssignment_2()); 
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1537:1: ( rule__DefineRule__RuleAssignment_2 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1537:2: rule__DefineRule__RuleAssignment_2
            {
            pushFollow(FOLLOW_rule__DefineRule__RuleAssignment_2_in_rule__DefineRule__Group__2__Impl3061);
            rule__DefineRule__RuleAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDefineRuleAccess().getRuleAssignment_2()); 

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


    // $ANTLR start "rule__DefineRule__Group__3"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1547:1: rule__DefineRule__Group__3 : rule__DefineRule__Group__3__Impl ;
    public final void rule__DefineRule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1551:1: ( rule__DefineRule__Group__3__Impl )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1552:2: rule__DefineRule__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__DefineRule__Group__3__Impl_in_rule__DefineRule__Group__33091);
            rule__DefineRule__Group__3__Impl();

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
    // $ANTLR end "rule__DefineRule__Group__3"


    // $ANTLR start "rule__DefineRule__Group__3__Impl"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1558:1: rule__DefineRule__Group__3__Impl : ( '.' ) ;
    public final void rule__DefineRule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1562:1: ( ( '.' ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1563:1: ( '.' )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1563:1: ( '.' )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1564:1: '.'
            {
             before(grammarAccess.getDefineRuleAccess().getFullStopKeyword_3()); 
            match(input,28,FOLLOW_28_in_rule__DefineRule__Group__3__Impl3119); 
             after(grammarAccess.getDefineRuleAccess().getFullStopKeyword_3()); 

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
    // $ANTLR end "rule__DefineRule__Group__3__Impl"


    // $ANTLR start "rule__StartStates__Group__0"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1585:1: rule__StartStates__Group__0 : rule__StartStates__Group__0__Impl rule__StartStates__Group__1 ;
    public final void rule__StartStates__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1589:1: ( rule__StartStates__Group__0__Impl rule__StartStates__Group__1 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1590:2: rule__StartStates__Group__0__Impl rule__StartStates__Group__1
            {
            pushFollow(FOLLOW_rule__StartStates__Group__0__Impl_in_rule__StartStates__Group__03158);
            rule__StartStates__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StartStates__Group__1_in_rule__StartStates__Group__03161);
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
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1597:1: rule__StartStates__Group__0__Impl : ( 'START' ) ;
    public final void rule__StartStates__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1601:1: ( ( 'START' ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1602:1: ( 'START' )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1602:1: ( 'START' )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1603:1: 'START'
            {
             before(grammarAccess.getStartStatesAccess().getSTARTKeyword_0()); 
            match(input,29,FOLLOW_29_in_rule__StartStates__Group__0__Impl3189); 
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
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1616:1: rule__StartStates__Group__1 : rule__StartStates__Group__1__Impl rule__StartStates__Group__2 ;
    public final void rule__StartStates__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1620:1: ( rule__StartStates__Group__1__Impl rule__StartStates__Group__2 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1621:2: rule__StartStates__Group__1__Impl rule__StartStates__Group__2
            {
            pushFollow(FOLLOW_rule__StartStates__Group__1__Impl_in_rule__StartStates__Group__13220);
            rule__StartStates__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StartStates__Group__2_in_rule__StartStates__Group__13223);
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
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1628:1: rule__StartStates__Group__1__Impl : ( ( rule__StartStates__IncstatesAssignment_1 ) ) ;
    public final void rule__StartStates__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1632:1: ( ( ( rule__StartStates__IncstatesAssignment_1 ) ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1633:1: ( ( rule__StartStates__IncstatesAssignment_1 ) )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1633:1: ( ( rule__StartStates__IncstatesAssignment_1 ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1634:1: ( rule__StartStates__IncstatesAssignment_1 )
            {
             before(grammarAccess.getStartStatesAccess().getIncstatesAssignment_1()); 
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1635:1: ( rule__StartStates__IncstatesAssignment_1 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1635:2: rule__StartStates__IncstatesAssignment_1
            {
            pushFollow(FOLLOW_rule__StartStates__IncstatesAssignment_1_in_rule__StartStates__Group__1__Impl3250);
            rule__StartStates__IncstatesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStartStatesAccess().getIncstatesAssignment_1()); 

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
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1645:1: rule__StartStates__Group__2 : rule__StartStates__Group__2__Impl rule__StartStates__Group__3 ;
    public final void rule__StartStates__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1649:1: ( rule__StartStates__Group__2__Impl rule__StartStates__Group__3 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1650:2: rule__StartStates__Group__2__Impl rule__StartStates__Group__3
            {
            pushFollow(FOLLOW_rule__StartStates__Group__2__Impl_in_rule__StartStates__Group__23280);
            rule__StartStates__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StartStates__Group__3_in_rule__StartStates__Group__23283);
            rule__StartStates__Group__3();

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
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1657:1: rule__StartStates__Group__2__Impl : ( ( rule__StartStates__Group_2__0 )* ) ;
    public final void rule__StartStates__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1661:1: ( ( ( rule__StartStates__Group_2__0 )* ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1662:1: ( ( rule__StartStates__Group_2__0 )* )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1662:1: ( ( rule__StartStates__Group_2__0 )* )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1663:1: ( rule__StartStates__Group_2__0 )*
            {
             before(grammarAccess.getStartStatesAccess().getGroup_2()); 
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1664:1: ( rule__StartStates__Group_2__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==30) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1664:2: rule__StartStates__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__StartStates__Group_2__0_in_rule__StartStates__Group__2__Impl3310);
            	    rule__StartStates__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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


    // $ANTLR start "rule__StartStates__Group__3"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1674:1: rule__StartStates__Group__3 : rule__StartStates__Group__3__Impl ;
    public final void rule__StartStates__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1678:1: ( rule__StartStates__Group__3__Impl )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1679:2: rule__StartStates__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__StartStates__Group__3__Impl_in_rule__StartStates__Group__33341);
            rule__StartStates__Group__3__Impl();

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
    // $ANTLR end "rule__StartStates__Group__3"


    // $ANTLR start "rule__StartStates__Group__3__Impl"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1685:1: rule__StartStates__Group__3__Impl : ( ( rule__StartStates__Group_3__0 )? ) ;
    public final void rule__StartStates__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1689:1: ( ( ( rule__StartStates__Group_3__0 )? ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1690:1: ( ( rule__StartStates__Group_3__0 )? )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1690:1: ( ( rule__StartStates__Group_3__0 )? )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1691:1: ( rule__StartStates__Group_3__0 )?
            {
             before(grammarAccess.getStartStatesAccess().getGroup_3()); 
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1692:1: ( rule__StartStates__Group_3__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==16) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1692:2: rule__StartStates__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__StartStates__Group_3__0_in_rule__StartStates__Group__3__Impl3368);
                    rule__StartStates__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStartStatesAccess().getGroup_3()); 

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
    // $ANTLR end "rule__StartStates__Group__3__Impl"


    // $ANTLR start "rule__StartStates__Group_2__0"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1710:1: rule__StartStates__Group_2__0 : rule__StartStates__Group_2__0__Impl rule__StartStates__Group_2__1 ;
    public final void rule__StartStates__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1714:1: ( rule__StartStates__Group_2__0__Impl rule__StartStates__Group_2__1 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1715:2: rule__StartStates__Group_2__0__Impl rule__StartStates__Group_2__1
            {
            pushFollow(FOLLOW_rule__StartStates__Group_2__0__Impl_in_rule__StartStates__Group_2__03407);
            rule__StartStates__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StartStates__Group_2__1_in_rule__StartStates__Group_2__03410);
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
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1722:1: rule__StartStates__Group_2__0__Impl : ( ',' ) ;
    public final void rule__StartStates__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1726:1: ( ( ',' ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1727:1: ( ',' )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1727:1: ( ',' )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1728:1: ','
            {
             before(grammarAccess.getStartStatesAccess().getCommaKeyword_2_0()); 
            match(input,30,FOLLOW_30_in_rule__StartStates__Group_2__0__Impl3438); 
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
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1741:1: rule__StartStates__Group_2__1 : rule__StartStates__Group_2__1__Impl ;
    public final void rule__StartStates__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1745:1: ( rule__StartStates__Group_2__1__Impl )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1746:2: rule__StartStates__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__StartStates__Group_2__1__Impl_in_rule__StartStates__Group_2__13469);
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
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1752:1: rule__StartStates__Group_2__1__Impl : ( ( rule__StartStates__IncstatesAssignment_2_1 ) ) ;
    public final void rule__StartStates__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1756:1: ( ( ( rule__StartStates__IncstatesAssignment_2_1 ) ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1757:1: ( ( rule__StartStates__IncstatesAssignment_2_1 ) )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1757:1: ( ( rule__StartStates__IncstatesAssignment_2_1 ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1758:1: ( rule__StartStates__IncstatesAssignment_2_1 )
            {
             before(grammarAccess.getStartStatesAccess().getIncstatesAssignment_2_1()); 
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1759:1: ( rule__StartStates__IncstatesAssignment_2_1 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1759:2: rule__StartStates__IncstatesAssignment_2_1
            {
            pushFollow(FOLLOW_rule__StartStates__IncstatesAssignment_2_1_in_rule__StartStates__Group_2__1__Impl3496);
            rule__StartStates__IncstatesAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getStartStatesAccess().getIncstatesAssignment_2_1()); 

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


    // $ANTLR start "rule__StartStates__Group_3__0"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1773:1: rule__StartStates__Group_3__0 : rule__StartStates__Group_3__0__Impl rule__StartStates__Group_3__1 ;
    public final void rule__StartStates__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1777:1: ( rule__StartStates__Group_3__0__Impl rule__StartStates__Group_3__1 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1778:2: rule__StartStates__Group_3__0__Impl rule__StartStates__Group_3__1
            {
            pushFollow(FOLLOW_rule__StartStates__Group_3__0__Impl_in_rule__StartStates__Group_3__03530);
            rule__StartStates__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StartStates__Group_3__1_in_rule__StartStates__Group_3__03533);
            rule__StartStates__Group_3__1();

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
    // $ANTLR end "rule__StartStates__Group_3__0"


    // $ANTLR start "rule__StartStates__Group_3__0__Impl"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1785:1: rule__StartStates__Group_3__0__Impl : ( '-' ) ;
    public final void rule__StartStates__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1789:1: ( ( '-' ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1790:1: ( '-' )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1790:1: ( '-' )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1791:1: '-'
            {
             before(grammarAccess.getStartStatesAccess().getHyphenMinusKeyword_3_0()); 
            match(input,16,FOLLOW_16_in_rule__StartStates__Group_3__0__Impl3561); 
             after(grammarAccess.getStartStatesAccess().getHyphenMinusKeyword_3_0()); 

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
    // $ANTLR end "rule__StartStates__Group_3__0__Impl"


    // $ANTLR start "rule__StartStates__Group_3__1"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1804:1: rule__StartStates__Group_3__1 : rule__StartStates__Group_3__1__Impl rule__StartStates__Group_3__2 ;
    public final void rule__StartStates__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1808:1: ( rule__StartStates__Group_3__1__Impl rule__StartStates__Group_3__2 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1809:2: rule__StartStates__Group_3__1__Impl rule__StartStates__Group_3__2
            {
            pushFollow(FOLLOW_rule__StartStates__Group_3__1__Impl_in_rule__StartStates__Group_3__13592);
            rule__StartStates__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StartStates__Group_3__2_in_rule__StartStates__Group_3__13595);
            rule__StartStates__Group_3__2();

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
    // $ANTLR end "rule__StartStates__Group_3__1"


    // $ANTLR start "rule__StartStates__Group_3__1__Impl"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1816:1: rule__StartStates__Group_3__1__Impl : ( ( rule__StartStates__ExstatesAssignment_3_1 ) ) ;
    public final void rule__StartStates__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1820:1: ( ( ( rule__StartStates__ExstatesAssignment_3_1 ) ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1821:1: ( ( rule__StartStates__ExstatesAssignment_3_1 ) )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1821:1: ( ( rule__StartStates__ExstatesAssignment_3_1 ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1822:1: ( rule__StartStates__ExstatesAssignment_3_1 )
            {
             before(grammarAccess.getStartStatesAccess().getExstatesAssignment_3_1()); 
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1823:1: ( rule__StartStates__ExstatesAssignment_3_1 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1823:2: rule__StartStates__ExstatesAssignment_3_1
            {
            pushFollow(FOLLOW_rule__StartStates__ExstatesAssignment_3_1_in_rule__StartStates__Group_3__1__Impl3622);
            rule__StartStates__ExstatesAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getStartStatesAccess().getExstatesAssignment_3_1()); 

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
    // $ANTLR end "rule__StartStates__Group_3__1__Impl"


    // $ANTLR start "rule__StartStates__Group_3__2"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1833:1: rule__StartStates__Group_3__2 : rule__StartStates__Group_3__2__Impl ;
    public final void rule__StartStates__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1837:1: ( rule__StartStates__Group_3__2__Impl )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1838:2: rule__StartStates__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__StartStates__Group_3__2__Impl_in_rule__StartStates__Group_3__23652);
            rule__StartStates__Group_3__2__Impl();

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
    // $ANTLR end "rule__StartStates__Group_3__2"


    // $ANTLR start "rule__StartStates__Group_3__2__Impl"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1844:1: rule__StartStates__Group_3__2__Impl : ( ( rule__StartStates__Group_3_2__0 )* ) ;
    public final void rule__StartStates__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1848:1: ( ( ( rule__StartStates__Group_3_2__0 )* ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1849:1: ( ( rule__StartStates__Group_3_2__0 )* )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1849:1: ( ( rule__StartStates__Group_3_2__0 )* )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1850:1: ( rule__StartStates__Group_3_2__0 )*
            {
             before(grammarAccess.getStartStatesAccess().getGroup_3_2()); 
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1851:1: ( rule__StartStates__Group_3_2__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==30) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1851:2: rule__StartStates__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_rule__StartStates__Group_3_2__0_in_rule__StartStates__Group_3__2__Impl3679);
            	    rule__StartStates__Group_3_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getStartStatesAccess().getGroup_3_2()); 

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
    // $ANTLR end "rule__StartStates__Group_3__2__Impl"


    // $ANTLR start "rule__StartStates__Group_3_2__0"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1867:1: rule__StartStates__Group_3_2__0 : rule__StartStates__Group_3_2__0__Impl rule__StartStates__Group_3_2__1 ;
    public final void rule__StartStates__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1871:1: ( rule__StartStates__Group_3_2__0__Impl rule__StartStates__Group_3_2__1 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1872:2: rule__StartStates__Group_3_2__0__Impl rule__StartStates__Group_3_2__1
            {
            pushFollow(FOLLOW_rule__StartStates__Group_3_2__0__Impl_in_rule__StartStates__Group_3_2__03716);
            rule__StartStates__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StartStates__Group_3_2__1_in_rule__StartStates__Group_3_2__03719);
            rule__StartStates__Group_3_2__1();

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
    // $ANTLR end "rule__StartStates__Group_3_2__0"


    // $ANTLR start "rule__StartStates__Group_3_2__0__Impl"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1879:1: rule__StartStates__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__StartStates__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1883:1: ( ( ',' ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1884:1: ( ',' )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1884:1: ( ',' )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1885:1: ','
            {
             before(grammarAccess.getStartStatesAccess().getCommaKeyword_3_2_0()); 
            match(input,30,FOLLOW_30_in_rule__StartStates__Group_3_2__0__Impl3747); 
             after(grammarAccess.getStartStatesAccess().getCommaKeyword_3_2_0()); 

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
    // $ANTLR end "rule__StartStates__Group_3_2__0__Impl"


    // $ANTLR start "rule__StartStates__Group_3_2__1"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1898:1: rule__StartStates__Group_3_2__1 : rule__StartStates__Group_3_2__1__Impl ;
    public final void rule__StartStates__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1902:1: ( rule__StartStates__Group_3_2__1__Impl )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1903:2: rule__StartStates__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_rule__StartStates__Group_3_2__1__Impl_in_rule__StartStates__Group_3_2__13778);
            rule__StartStates__Group_3_2__1__Impl();

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
    // $ANTLR end "rule__StartStates__Group_3_2__1"


    // $ANTLR start "rule__StartStates__Group_3_2__1__Impl"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1909:1: rule__StartStates__Group_3_2__1__Impl : ( ( rule__StartStates__ExstatesAssignment_3_2_1 ) ) ;
    public final void rule__StartStates__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1913:1: ( ( ( rule__StartStates__ExstatesAssignment_3_2_1 ) ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1914:1: ( ( rule__StartStates__ExstatesAssignment_3_2_1 ) )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1914:1: ( ( rule__StartStates__ExstatesAssignment_3_2_1 ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1915:1: ( rule__StartStates__ExstatesAssignment_3_2_1 )
            {
             before(grammarAccess.getStartStatesAccess().getExstatesAssignment_3_2_1()); 
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1916:1: ( rule__StartStates__ExstatesAssignment_3_2_1 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1916:2: rule__StartStates__ExstatesAssignment_3_2_1
            {
            pushFollow(FOLLOW_rule__StartStates__ExstatesAssignment_3_2_1_in_rule__StartStates__Group_3_2__1__Impl3805);
            rule__StartStates__ExstatesAssignment_3_2_1();

            state._fsp--;


            }

             after(grammarAccess.getStartStatesAccess().getExstatesAssignment_3_2_1()); 

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
    // $ANTLR end "rule__StartStates__Group_3_2__1__Impl"


    // $ANTLR start "rule__Rule__Group__0"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1930:1: rule__Rule__Group__0 : rule__Rule__Group__0__Impl rule__Rule__Group__1 ;
    public final void rule__Rule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1934:1: ( rule__Rule__Group__0__Impl rule__Rule__Group__1 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1935:2: rule__Rule__Group__0__Impl rule__Rule__Group__1
            {
            pushFollow(FOLLOW_rule__Rule__Group__0__Impl_in_rule__Rule__Group__03839);
            rule__Rule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rule__Group__1_in_rule__Rule__Group__03842);
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
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1942:1: rule__Rule__Group__0__Impl : ( ( rule__Rule__Alternatives_0 ) ) ;
    public final void rule__Rule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1946:1: ( ( ( rule__Rule__Alternatives_0 ) ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1947:1: ( ( rule__Rule__Alternatives_0 ) )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1947:1: ( ( rule__Rule__Alternatives_0 ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1948:1: ( rule__Rule__Alternatives_0 )
            {
             before(grammarAccess.getRuleAccess().getAlternatives_0()); 
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1949:1: ( rule__Rule__Alternatives_0 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1949:2: rule__Rule__Alternatives_0
            {
            pushFollow(FOLLOW_rule__Rule__Alternatives_0_in_rule__Rule__Group__0__Impl3869);
            rule__Rule__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getAlternatives_0()); 

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
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1959:1: rule__Rule__Group__1 : rule__Rule__Group__1__Impl ;
    public final void rule__Rule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1963:1: ( rule__Rule__Group__1__Impl )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1964:2: rule__Rule__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Rule__Group__1__Impl_in_rule__Rule__Group__13899);
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
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1970:1: rule__Rule__Group__1__Impl : ( ( rule__Rule__ContentAssignment_1 )* ) ;
    public final void rule__Rule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1974:1: ( ( ( rule__Rule__ContentAssignment_1 )* ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1975:1: ( ( rule__Rule__ContentAssignment_1 )* )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1975:1: ( ( rule__Rule__ContentAssignment_1 )* )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1976:1: ( rule__Rule__ContentAssignment_1 )*
            {
             before(grammarAccess.getRuleAccess().getContentAssignment_1()); 
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1977:1: ( rule__Rule__ContentAssignment_1 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_STRING||(LA16_0>=15 && LA16_0<=16)||LA16_0==32) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1977:2: rule__Rule__ContentAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Rule__ContentAssignment_1_in_rule__Rule__Group__1__Impl3926);
            	    rule__Rule__ContentAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1991:1: rule__SingleRule__Group__0 : rule__SingleRule__Group__0__Impl rule__SingleRule__Group__1 ;
    public final void rule__SingleRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1995:1: ( rule__SingleRule__Group__0__Impl rule__SingleRule__Group__1 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1996:2: rule__SingleRule__Group__0__Impl rule__SingleRule__Group__1
            {
            pushFollow(FOLLOW_rule__SingleRule__Group__0__Impl_in_rule__SingleRule__Group__03961);
            rule__SingleRule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SingleRule__Group__1_in_rule__SingleRule__Group__03964);
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
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2003:1: rule__SingleRule__Group__0__Impl : ( ( ruleRuleStart )? ) ;
    public final void rule__SingleRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2007:1: ( ( ( ruleRuleStart )? ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2008:1: ( ( ruleRuleStart )? )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2008:1: ( ( ruleRuleStart )? )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2009:1: ( ruleRuleStart )?
            {
             before(grammarAccess.getSingleRuleAccess().getRuleStartParserRuleCall_0()); 
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2010:1: ( ruleRuleStart )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=15 && LA17_0<=16)||LA17_0==32) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2010:3: ruleRuleStart
                    {
                    pushFollow(FOLLOW_ruleRuleStart_in_rule__SingleRule__Group__0__Impl3992);
                    ruleRuleStart();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSingleRuleAccess().getRuleStartParserRuleCall_0()); 

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
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2020:1: rule__SingleRule__Group__1 : rule__SingleRule__Group__1__Impl rule__SingleRule__Group__2 ;
    public final void rule__SingleRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2024:1: ( rule__SingleRule__Group__1__Impl rule__SingleRule__Group__2 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2025:2: rule__SingleRule__Group__1__Impl rule__SingleRule__Group__2
            {
            pushFollow(FOLLOW_rule__SingleRule__Group__1__Impl_in_rule__SingleRule__Group__14023);
            rule__SingleRule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SingleRule__Group__2_in_rule__SingleRule__Group__14026);
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
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2032:1: rule__SingleRule__Group__1__Impl : ( ( rule__SingleRule__RuleAssignment_1 ) ) ;
    public final void rule__SingleRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2036:1: ( ( ( rule__SingleRule__RuleAssignment_1 ) ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2037:1: ( ( rule__SingleRule__RuleAssignment_1 ) )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2037:1: ( ( rule__SingleRule__RuleAssignment_1 ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2038:1: ( rule__SingleRule__RuleAssignment_1 )
            {
             before(grammarAccess.getSingleRuleAccess().getRuleAssignment_1()); 
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2039:1: ( rule__SingleRule__RuleAssignment_1 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2039:2: rule__SingleRule__RuleAssignment_1
            {
            pushFollow(FOLLOW_rule__SingleRule__RuleAssignment_1_in_rule__SingleRule__Group__1__Impl4053);
            rule__SingleRule__RuleAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSingleRuleAccess().getRuleAssignment_1()); 

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
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2049:1: rule__SingleRule__Group__2 : rule__SingleRule__Group__2__Impl rule__SingleRule__Group__3 ;
    public final void rule__SingleRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2053:1: ( rule__SingleRule__Group__2__Impl rule__SingleRule__Group__3 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2054:2: rule__SingleRule__Group__2__Impl rule__SingleRule__Group__3
            {
            pushFollow(FOLLOW_rule__SingleRule__Group__2__Impl_in_rule__SingleRule__Group__24083);
            rule__SingleRule__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SingleRule__Group__3_in_rule__SingleRule__Group__24086);
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
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2061:1: rule__SingleRule__Group__2__Impl : ( ( rule__SingleRule__Alternatives_2 ) ) ;
    public final void rule__SingleRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2065:1: ( ( ( rule__SingleRule__Alternatives_2 ) ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2066:1: ( ( rule__SingleRule__Alternatives_2 ) )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2066:1: ( ( rule__SingleRule__Alternatives_2 ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2067:1: ( rule__SingleRule__Alternatives_2 )
            {
             before(grammarAccess.getSingleRuleAccess().getAlternatives_2()); 
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2068:1: ( rule__SingleRule__Alternatives_2 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2068:2: rule__SingleRule__Alternatives_2
            {
            pushFollow(FOLLOW_rule__SingleRule__Alternatives_2_in_rule__SingleRule__Group__2__Impl4113);
            rule__SingleRule__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getSingleRuleAccess().getAlternatives_2()); 

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
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2078:1: rule__SingleRule__Group__3 : rule__SingleRule__Group__3__Impl rule__SingleRule__Group__4 ;
    public final void rule__SingleRule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2082:1: ( rule__SingleRule__Group__3__Impl rule__SingleRule__Group__4 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2083:2: rule__SingleRule__Group__3__Impl rule__SingleRule__Group__4
            {
            pushFollow(FOLLOW_rule__SingleRule__Group__3__Impl_in_rule__SingleRule__Group__34143);
            rule__SingleRule__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SingleRule__Group__4_in_rule__SingleRule__Group__34146);
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
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2090:1: rule__SingleRule__Group__3__Impl : ( '{' ) ;
    public final void rule__SingleRule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2094:1: ( ( '{' ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2095:1: ( '{' )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2095:1: ( '{' )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2096:1: '{'
            {
             before(grammarAccess.getSingleRuleAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,31,FOLLOW_31_in_rule__SingleRule__Group__3__Impl4174); 
             after(grammarAccess.getSingleRuleAccess().getLeftCurlyBracketKeyword_3()); 

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
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2109:1: rule__SingleRule__Group__4 : rule__SingleRule__Group__4__Impl rule__SingleRule__Group__5 ;
    public final void rule__SingleRule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2113:1: ( rule__SingleRule__Group__4__Impl rule__SingleRule__Group__5 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2114:2: rule__SingleRule__Group__4__Impl rule__SingleRule__Group__5
            {
            pushFollow(FOLLOW_rule__SingleRule__Group__4__Impl_in_rule__SingleRule__Group__44205);
            rule__SingleRule__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SingleRule__Group__5_in_rule__SingleRule__Group__44208);
            rule__SingleRule__Group__5();

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
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2121:1: rule__SingleRule__Group__4__Impl : ( ( rule__SingleRule__ContentAssignment_4 ) ) ;
    public final void rule__SingleRule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2125:1: ( ( ( rule__SingleRule__ContentAssignment_4 ) ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2126:1: ( ( rule__SingleRule__ContentAssignment_4 ) )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2126:1: ( ( rule__SingleRule__ContentAssignment_4 ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2127:1: ( rule__SingleRule__ContentAssignment_4 )
            {
             before(grammarAccess.getSingleRuleAccess().getContentAssignment_4()); 
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2128:1: ( rule__SingleRule__ContentAssignment_4 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2128:2: rule__SingleRule__ContentAssignment_4
            {
            pushFollow(FOLLOW_rule__SingleRule__ContentAssignment_4_in_rule__SingleRule__Group__4__Impl4235);
            rule__SingleRule__ContentAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getSingleRuleAccess().getContentAssignment_4()); 

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


    // $ANTLR start "rule__SingleRule__Group__5"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2138:1: rule__SingleRule__Group__5 : rule__SingleRule__Group__5__Impl ;
    public final void rule__SingleRule__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2142:1: ( rule__SingleRule__Group__5__Impl )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2143:2: rule__SingleRule__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__SingleRule__Group__5__Impl_in_rule__SingleRule__Group__54265);
            rule__SingleRule__Group__5__Impl();

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
    // $ANTLR end "rule__SingleRule__Group__5"


    // $ANTLR start "rule__SingleRule__Group__5__Impl"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2149:1: rule__SingleRule__Group__5__Impl : ( '}' ) ;
    public final void rule__SingleRule__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2153:1: ( ( '}' ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2154:1: ( '}' )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2154:1: ( '}' )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2155:1: '}'
            {
             before(grammarAccess.getSingleRuleAccess().getRightCurlyBracketKeyword_5()); 
            match(input,21,FOLLOW_21_in_rule__SingleRule__Group__5__Impl4293); 
             after(grammarAccess.getSingleRuleAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__SingleRule__Group__5__Impl"


    // $ANTLR start "rule__RuleStart__Group__0"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2180:1: rule__RuleStart__Group__0 : rule__RuleStart__Group__0__Impl rule__RuleStart__Group__1 ;
    public final void rule__RuleStart__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2184:1: ( rule__RuleStart__Group__0__Impl rule__RuleStart__Group__1 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2185:2: rule__RuleStart__Group__0__Impl rule__RuleStart__Group__1
            {
            pushFollow(FOLLOW_rule__RuleStart__Group__0__Impl_in_rule__RuleStart__Group__04336);
            rule__RuleStart__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RuleStart__Group__1_in_rule__RuleStart__Group__04339);
            rule__RuleStart__Group__1();

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
    // $ANTLR end "rule__RuleStart__Group__0"


    // $ANTLR start "rule__RuleStart__Group__0__Impl"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2192:1: rule__RuleStart__Group__0__Impl : ( ( rule__RuleStart__Alternatives_0 )? ) ;
    public final void rule__RuleStart__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2196:1: ( ( ( rule__RuleStart__Alternatives_0 )? ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2197:1: ( ( rule__RuleStart__Alternatives_0 )? )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2197:1: ( ( rule__RuleStart__Alternatives_0 )? )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2198:1: ( rule__RuleStart__Alternatives_0 )?
            {
             before(grammarAccess.getRuleStartAccess().getAlternatives_0()); 
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2199:1: ( rule__RuleStart__Alternatives_0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=15 && LA18_0<=16)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2199:2: rule__RuleStart__Alternatives_0
                    {
                    pushFollow(FOLLOW_rule__RuleStart__Alternatives_0_in_rule__RuleStart__Group__0__Impl4366);
                    rule__RuleStart__Alternatives_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRuleStartAccess().getAlternatives_0()); 

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
    // $ANTLR end "rule__RuleStart__Group__0__Impl"


    // $ANTLR start "rule__RuleStart__Group__1"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2209:1: rule__RuleStart__Group__1 : rule__RuleStart__Group__1__Impl rule__RuleStart__Group__2 ;
    public final void rule__RuleStart__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2213:1: ( rule__RuleStart__Group__1__Impl rule__RuleStart__Group__2 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2214:2: rule__RuleStart__Group__1__Impl rule__RuleStart__Group__2
            {
            pushFollow(FOLLOW_rule__RuleStart__Group__1__Impl_in_rule__RuleStart__Group__14397);
            rule__RuleStart__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RuleStart__Group__2_in_rule__RuleStart__Group__14400);
            rule__RuleStart__Group__2();

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
    // $ANTLR end "rule__RuleStart__Group__1"


    // $ANTLR start "rule__RuleStart__Group__1__Impl"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2221:1: rule__RuleStart__Group__1__Impl : ( '#' ) ;
    public final void rule__RuleStart__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2225:1: ( ( '#' ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2226:1: ( '#' )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2226:1: ( '#' )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2227:1: '#'
            {
             before(grammarAccess.getRuleStartAccess().getNumberSignKeyword_1()); 
            match(input,32,FOLLOW_32_in_rule__RuleStart__Group__1__Impl4428); 
             after(grammarAccess.getRuleStartAccess().getNumberSignKeyword_1()); 

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
    // $ANTLR end "rule__RuleStart__Group__1__Impl"


    // $ANTLR start "rule__RuleStart__Group__2"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2240:1: rule__RuleStart__Group__2 : rule__RuleStart__Group__2__Impl rule__RuleStart__Group__3 ;
    public final void rule__RuleStart__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2244:1: ( rule__RuleStart__Group__2__Impl rule__RuleStart__Group__3 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2245:2: rule__RuleStart__Group__2__Impl rule__RuleStart__Group__3
            {
            pushFollow(FOLLOW_rule__RuleStart__Group__2__Impl_in_rule__RuleStart__Group__24459);
            rule__RuleStart__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RuleStart__Group__3_in_rule__RuleStart__Group__24462);
            rule__RuleStart__Group__3();

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
    // $ANTLR end "rule__RuleStart__Group__2"


    // $ANTLR start "rule__RuleStart__Group__2__Impl"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2252:1: rule__RuleStart__Group__2__Impl : ( ( rule__RuleStart__Alternatives_2 ) ) ;
    public final void rule__RuleStart__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2256:1: ( ( ( rule__RuleStart__Alternatives_2 ) ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2257:1: ( ( rule__RuleStart__Alternatives_2 ) )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2257:1: ( ( rule__RuleStart__Alternatives_2 ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2258:1: ( rule__RuleStart__Alternatives_2 )
            {
             before(grammarAccess.getRuleStartAccess().getAlternatives_2()); 
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2259:1: ( rule__RuleStart__Alternatives_2 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2259:2: rule__RuleStart__Alternatives_2
            {
            pushFollow(FOLLOW_rule__RuleStart__Alternatives_2_in_rule__RuleStart__Group__2__Impl4489);
            rule__RuleStart__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getRuleStartAccess().getAlternatives_2()); 

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
    // $ANTLR end "rule__RuleStart__Group__2__Impl"


    // $ANTLR start "rule__RuleStart__Group__3"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2269:1: rule__RuleStart__Group__3 : rule__RuleStart__Group__3__Impl ;
    public final void rule__RuleStart__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2273:1: ( rule__RuleStart__Group__3__Impl )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2274:2: rule__RuleStart__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__RuleStart__Group__3__Impl_in_rule__RuleStart__Group__34519);
            rule__RuleStart__Group__3__Impl();

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
    // $ANTLR end "rule__RuleStart__Group__3"


    // $ANTLR start "rule__RuleStart__Group__3__Impl"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2280:1: rule__RuleStart__Group__3__Impl : ( '#' ) ;
    public final void rule__RuleStart__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2284:1: ( ( '#' ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2285:1: ( '#' )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2285:1: ( '#' )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2286:1: '#'
            {
             before(grammarAccess.getRuleStartAccess().getNumberSignKeyword_3()); 
            match(input,32,FOLLOW_32_in_rule__RuleStart__Group__3__Impl4547); 
             after(grammarAccess.getRuleStartAccess().getNumberSignKeyword_3()); 

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
    // $ANTLR end "rule__RuleStart__Group__3__Impl"


    // $ANTLR start "rule__RuleStart__Group_2_0__0"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2307:1: rule__RuleStart__Group_2_0__0 : rule__RuleStart__Group_2_0__0__Impl rule__RuleStart__Group_2_0__1 ;
    public final void rule__RuleStart__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2311:1: ( rule__RuleStart__Group_2_0__0__Impl rule__RuleStart__Group_2_0__1 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2312:2: rule__RuleStart__Group_2_0__0__Impl rule__RuleStart__Group_2_0__1
            {
            pushFollow(FOLLOW_rule__RuleStart__Group_2_0__0__Impl_in_rule__RuleStart__Group_2_0__04586);
            rule__RuleStart__Group_2_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RuleStart__Group_2_0__1_in_rule__RuleStart__Group_2_0__04589);
            rule__RuleStart__Group_2_0__1();

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
    // $ANTLR end "rule__RuleStart__Group_2_0__0"


    // $ANTLR start "rule__RuleStart__Group_2_0__0__Impl"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2319:1: rule__RuleStart__Group_2_0__0__Impl : ( ( rule__RuleStart__StateAssignment_2_0_0 ) ) ;
    public final void rule__RuleStart__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2323:1: ( ( ( rule__RuleStart__StateAssignment_2_0_0 ) ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2324:1: ( ( rule__RuleStart__StateAssignment_2_0_0 ) )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2324:1: ( ( rule__RuleStart__StateAssignment_2_0_0 ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2325:1: ( rule__RuleStart__StateAssignment_2_0_0 )
            {
             before(grammarAccess.getRuleStartAccess().getStateAssignment_2_0_0()); 
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2326:1: ( rule__RuleStart__StateAssignment_2_0_0 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2326:2: rule__RuleStart__StateAssignment_2_0_0
            {
            pushFollow(FOLLOW_rule__RuleStart__StateAssignment_2_0_0_in_rule__RuleStart__Group_2_0__0__Impl4616);
            rule__RuleStart__StateAssignment_2_0_0();

            state._fsp--;


            }

             after(grammarAccess.getRuleStartAccess().getStateAssignment_2_0_0()); 

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
    // $ANTLR end "rule__RuleStart__Group_2_0__0__Impl"


    // $ANTLR start "rule__RuleStart__Group_2_0__1"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2336:1: rule__RuleStart__Group_2_0__1 : rule__RuleStart__Group_2_0__1__Impl ;
    public final void rule__RuleStart__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2340:1: ( rule__RuleStart__Group_2_0__1__Impl )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2341:2: rule__RuleStart__Group_2_0__1__Impl
            {
            pushFollow(FOLLOW_rule__RuleStart__Group_2_0__1__Impl_in_rule__RuleStart__Group_2_0__14646);
            rule__RuleStart__Group_2_0__1__Impl();

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
    // $ANTLR end "rule__RuleStart__Group_2_0__1"


    // $ANTLR start "rule__RuleStart__Group_2_0__1__Impl"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2347:1: rule__RuleStart__Group_2_0__1__Impl : ( ( rule__RuleStart__Group_2_0_1__0 )* ) ;
    public final void rule__RuleStart__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2351:1: ( ( ( rule__RuleStart__Group_2_0_1__0 )* ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2352:1: ( ( rule__RuleStart__Group_2_0_1__0 )* )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2352:1: ( ( rule__RuleStart__Group_2_0_1__0 )* )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2353:1: ( rule__RuleStart__Group_2_0_1__0 )*
            {
             before(grammarAccess.getRuleStartAccess().getGroup_2_0_1()); 
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2354:1: ( rule__RuleStart__Group_2_0_1__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==30) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2354:2: rule__RuleStart__Group_2_0_1__0
            	    {
            	    pushFollow(FOLLOW_rule__RuleStart__Group_2_0_1__0_in_rule__RuleStart__Group_2_0__1__Impl4673);
            	    rule__RuleStart__Group_2_0_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getRuleStartAccess().getGroup_2_0_1()); 

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
    // $ANTLR end "rule__RuleStart__Group_2_0__1__Impl"


    // $ANTLR start "rule__RuleStart__Group_2_0_1__0"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2368:1: rule__RuleStart__Group_2_0_1__0 : rule__RuleStart__Group_2_0_1__0__Impl rule__RuleStart__Group_2_0_1__1 ;
    public final void rule__RuleStart__Group_2_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2372:1: ( rule__RuleStart__Group_2_0_1__0__Impl rule__RuleStart__Group_2_0_1__1 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2373:2: rule__RuleStart__Group_2_0_1__0__Impl rule__RuleStart__Group_2_0_1__1
            {
            pushFollow(FOLLOW_rule__RuleStart__Group_2_0_1__0__Impl_in_rule__RuleStart__Group_2_0_1__04708);
            rule__RuleStart__Group_2_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RuleStart__Group_2_0_1__1_in_rule__RuleStart__Group_2_0_1__04711);
            rule__RuleStart__Group_2_0_1__1();

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
    // $ANTLR end "rule__RuleStart__Group_2_0_1__0"


    // $ANTLR start "rule__RuleStart__Group_2_0_1__0__Impl"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2380:1: rule__RuleStart__Group_2_0_1__0__Impl : ( ',' ) ;
    public final void rule__RuleStart__Group_2_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2384:1: ( ( ',' ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2385:1: ( ',' )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2385:1: ( ',' )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2386:1: ','
            {
             before(grammarAccess.getRuleStartAccess().getCommaKeyword_2_0_1_0()); 
            match(input,30,FOLLOW_30_in_rule__RuleStart__Group_2_0_1__0__Impl4739); 
             after(grammarAccess.getRuleStartAccess().getCommaKeyword_2_0_1_0()); 

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
    // $ANTLR end "rule__RuleStart__Group_2_0_1__0__Impl"


    // $ANTLR start "rule__RuleStart__Group_2_0_1__1"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2399:1: rule__RuleStart__Group_2_0_1__1 : rule__RuleStart__Group_2_0_1__1__Impl ;
    public final void rule__RuleStart__Group_2_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2403:1: ( rule__RuleStart__Group_2_0_1__1__Impl )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2404:2: rule__RuleStart__Group_2_0_1__1__Impl
            {
            pushFollow(FOLLOW_rule__RuleStart__Group_2_0_1__1__Impl_in_rule__RuleStart__Group_2_0_1__14770);
            rule__RuleStart__Group_2_0_1__1__Impl();

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
    // $ANTLR end "rule__RuleStart__Group_2_0_1__1"


    // $ANTLR start "rule__RuleStart__Group_2_0_1__1__Impl"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2410:1: rule__RuleStart__Group_2_0_1__1__Impl : ( ( rule__RuleStart__StateAssignment_2_0_1_1 ) ) ;
    public final void rule__RuleStart__Group_2_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2414:1: ( ( ( rule__RuleStart__StateAssignment_2_0_1_1 ) ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2415:1: ( ( rule__RuleStart__StateAssignment_2_0_1_1 ) )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2415:1: ( ( rule__RuleStart__StateAssignment_2_0_1_1 ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2416:1: ( rule__RuleStart__StateAssignment_2_0_1_1 )
            {
             before(grammarAccess.getRuleStartAccess().getStateAssignment_2_0_1_1()); 
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2417:1: ( rule__RuleStart__StateAssignment_2_0_1_1 )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2417:2: rule__RuleStart__StateAssignment_2_0_1_1
            {
            pushFollow(FOLLOW_rule__RuleStart__StateAssignment_2_0_1_1_in_rule__RuleStart__Group_2_0_1__1__Impl4797);
            rule__RuleStart__StateAssignment_2_0_1_1();

            state._fsp--;


            }

             after(grammarAccess.getRuleStartAccess().getStateAssignment_2_0_1_1()); 

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
    // $ANTLR end "rule__RuleStart__Group_2_0_1__1__Impl"


    // $ANTLR start "rule__Model__ScannerAssignment_0"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2436:1: rule__Model__ScannerAssignment_0 : ( ruleScanner ) ;
    public final void rule__Model__ScannerAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2440:1: ( ( ruleScanner ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2441:1: ( ruleScanner )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2441:1: ( ruleScanner )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2442:1: ruleScanner
            {
             before(grammarAccess.getModelAccess().getScannerScannerParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleScanner_in_rule__Model__ScannerAssignment_04840);
            ruleScanner();

            state._fsp--;

             after(grammarAccess.getModelAccess().getScannerScannerParserRuleCall_0_0()); 

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
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2451:1: rule__Model__ScannerAssignment_1 : ( ruleExport ) ;
    public final void rule__Model__ScannerAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2455:1: ( ( ruleExport ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2456:1: ( ruleExport )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2456:1: ( ruleExport )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2457:1: ruleExport
            {
             before(grammarAccess.getModelAccess().getScannerExportParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleExport_in_rule__Model__ScannerAssignment_14871);
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
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2466:1: rule__Model__ScannerAssignment_2 : ( ruleGlobal ) ;
    public final void rule__Model__ScannerAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2470:1: ( ( ruleGlobal ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2471:1: ( ruleGlobal )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2471:1: ( ruleGlobal )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2472:1: ruleGlobal
            {
             before(grammarAccess.getModelAccess().getScannerGlobalParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleGlobal_in_rule__Model__ScannerAssignment_24902);
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
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2481:1: rule__Model__ScannerAssignment_3 : ( ruleLocal ) ;
    public final void rule__Model__ScannerAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2485:1: ( ( ruleLocal ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2486:1: ( ruleLocal )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2486:1: ( ruleLocal )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2487:1: ruleLocal
            {
             before(grammarAccess.getModelAccess().getScannerLocalParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleLocal_in_rule__Model__ScannerAssignment_34933);
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
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2496:1: rule__Model__ScannerAssignment_4 : ( ruleDefault ) ;
    public final void rule__Model__ScannerAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2500:1: ( ( ruleDefault ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2501:1: ( ruleDefault )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2501:1: ( ruleDefault )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2502:1: ruleDefault
            {
             before(grammarAccess.getModelAccess().getScannerDefaultParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleDefault_in_rule__Model__ScannerAssignment_44964);
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
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2511:1: rule__Model__ScannerAssignment_5 : ( ruleEof ) ;
    public final void rule__Model__ScannerAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2515:1: ( ( ruleEof ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2516:1: ( ruleEof )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2516:1: ( ruleEof )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2517:1: ruleEof
            {
             before(grammarAccess.getModelAccess().getScannerEofParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleEof_in_rule__Model__ScannerAssignment_54995);
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
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2526:1: rule__Model__ScannerAssignment_6 : ( ruleDefine ) ;
    public final void rule__Model__ScannerAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2530:1: ( ( ruleDefine ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2531:1: ( ruleDefine )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2531:1: ( ruleDefine )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2532:1: ruleDefine
            {
             before(grammarAccess.getModelAccess().getScannerDefineParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleDefine_in_rule__Model__ScannerAssignment_65026);
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
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2541:1: rule__Model__ScannerAssignment_7 : ( ruleStartStates ) ;
    public final void rule__Model__ScannerAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2545:1: ( ( ruleStartStates ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2546:1: ( ruleStartStates )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2546:1: ( ruleStartStates )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2547:1: ruleStartStates
            {
             before(grammarAccess.getModelAccess().getScannerStartStatesParserRuleCall_7_0()); 
            pushFollow(FOLLOW_ruleStartStates_in_rule__Model__ScannerAssignment_75057);
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
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2556:1: rule__Model__ScannerAssignment_8 : ( ruleRule ) ;
    public final void rule__Model__ScannerAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2560:1: ( ( ruleRule ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2561:1: ( ruleRule )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2561:1: ( ruleRule )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2562:1: ruleRule
            {
             before(grammarAccess.getModelAccess().getScannerRuleParserRuleCall_8_0()); 
            pushFollow(FOLLOW_ruleRule_in_rule__Model__ScannerAssignment_85088);
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


    // $ANTLR start "rule__Scanner__NameAssignment_1"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2571:1: rule__Scanner__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Scanner__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2575:1: ( ( RULE_ID ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2576:1: ( RULE_ID )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2576:1: ( RULE_ID )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2577:1: RULE_ID
            {
             before(grammarAccess.getScannerAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Scanner__NameAssignment_15119); 
             after(grammarAccess.getScannerAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Scanner__NameAssignment_1"


    // $ANTLR start "rule__Export__ContentAssignment_1"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2586:1: rule__Export__ContentAssignment_1 : ( RULE_ID ) ;
    public final void rule__Export__ContentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2590:1: ( ( RULE_ID ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2591:1: ( RULE_ID )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2591:1: ( RULE_ID )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2592:1: RULE_ID
            {
             before(grammarAccess.getExportAccess().getContentIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Export__ContentAssignment_15150); 
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
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2601:1: rule__Global__ContentAssignment_1 : ( RULE_ID ) ;
    public final void rule__Global__ContentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2605:1: ( ( RULE_ID ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2606:1: ( RULE_ID )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2606:1: ( RULE_ID )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2607:1: RULE_ID
            {
             before(grammarAccess.getGlobalAccess().getContentIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Global__ContentAssignment_15181); 
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
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2616:1: rule__Local__ContentAssignment_1 : ( RULE_ID ) ;
    public final void rule__Local__ContentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2620:1: ( ( RULE_ID ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2621:1: ( RULE_ID )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2621:1: ( RULE_ID )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2622:1: RULE_ID
            {
             before(grammarAccess.getLocalAccess().getContentIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Local__ContentAssignment_15212); 
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
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2631:1: rule__Default__ContentAssignment_1 : ( RULE_ID ) ;
    public final void rule__Default__ContentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2635:1: ( ( RULE_ID ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2636:1: ( RULE_ID )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2636:1: ( RULE_ID )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2637:1: RULE_ID
            {
             before(grammarAccess.getDefaultAccess().getContentIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Default__ContentAssignment_15243); 
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
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2646:1: rule__Eof__ContentAssignment_1 : ( RULE_ID ) ;
    public final void rule__Eof__ContentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2650:1: ( ( RULE_ID ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2651:1: ( RULE_ID )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2651:1: ( RULE_ID )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2652:1: RULE_ID
            {
             before(grammarAccess.getEofAccess().getContentIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Eof__ContentAssignment_15274); 
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
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2661:1: rule__Define__DefinesAssignment_1 : ( ruleDefineRule ) ;
    public final void rule__Define__DefinesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2665:1: ( ( ruleDefineRule ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2666:1: ( ruleDefineRule )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2666:1: ( ruleDefineRule )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2667:1: ruleDefineRule
            {
             before(grammarAccess.getDefineAccess().getDefinesDefineRuleParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleDefineRule_in_rule__Define__DefinesAssignment_15305);
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


    // $ANTLR start "rule__DefineRule__NameAssignment_0"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2676:1: rule__DefineRule__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__DefineRule__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2680:1: ( ( RULE_ID ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2681:1: ( RULE_ID )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2681:1: ( RULE_ID )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2682:1: RULE_ID
            {
             before(grammarAccess.getDefineRuleAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DefineRule__NameAssignment_05336); 
             after(grammarAccess.getDefineRuleAccess().getNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__DefineRule__NameAssignment_0"


    // $ANTLR start "rule__DefineRule__RuleAssignment_2"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2691:1: rule__DefineRule__RuleAssignment_2 : ( RULE_ID ) ;
    public final void rule__DefineRule__RuleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2695:1: ( ( RULE_ID ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2696:1: ( RULE_ID )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2696:1: ( RULE_ID )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2697:1: RULE_ID
            {
             before(grammarAccess.getDefineRuleAccess().getRuleIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DefineRule__RuleAssignment_25367); 
             after(grammarAccess.getDefineRuleAccess().getRuleIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__DefineRule__RuleAssignment_2"


    // $ANTLR start "rule__StartStates__IncstatesAssignment_1"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2706:1: rule__StartStates__IncstatesAssignment_1 : ( ruleStartState ) ;
    public final void rule__StartStates__IncstatesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2710:1: ( ( ruleStartState ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2711:1: ( ruleStartState )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2711:1: ( ruleStartState )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2712:1: ruleStartState
            {
             before(grammarAccess.getStartStatesAccess().getIncstatesStartStateParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleStartState_in_rule__StartStates__IncstatesAssignment_15398);
            ruleStartState();

            state._fsp--;

             after(grammarAccess.getStartStatesAccess().getIncstatesStartStateParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__StartStates__IncstatesAssignment_1"


    // $ANTLR start "rule__StartStates__IncstatesAssignment_2_1"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2721:1: rule__StartStates__IncstatesAssignment_2_1 : ( ruleStartState ) ;
    public final void rule__StartStates__IncstatesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2725:1: ( ( ruleStartState ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2726:1: ( ruleStartState )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2726:1: ( ruleStartState )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2727:1: ruleStartState
            {
             before(grammarAccess.getStartStatesAccess().getIncstatesStartStateParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleStartState_in_rule__StartStates__IncstatesAssignment_2_15429);
            ruleStartState();

            state._fsp--;

             after(grammarAccess.getStartStatesAccess().getIncstatesStartStateParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__StartStates__IncstatesAssignment_2_1"


    // $ANTLR start "rule__StartStates__ExstatesAssignment_3_1"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2736:1: rule__StartStates__ExstatesAssignment_3_1 : ( ruleStartState ) ;
    public final void rule__StartStates__ExstatesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2740:1: ( ( ruleStartState ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2741:1: ( ruleStartState )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2741:1: ( ruleStartState )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2742:1: ruleStartState
            {
             before(grammarAccess.getStartStatesAccess().getExstatesStartStateParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleStartState_in_rule__StartStates__ExstatesAssignment_3_15460);
            ruleStartState();

            state._fsp--;

             after(grammarAccess.getStartStatesAccess().getExstatesStartStateParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__StartStates__ExstatesAssignment_3_1"


    // $ANTLR start "rule__StartStates__ExstatesAssignment_3_2_1"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2751:1: rule__StartStates__ExstatesAssignment_3_2_1 : ( ruleStartState ) ;
    public final void rule__StartStates__ExstatesAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2755:1: ( ( ruleStartState ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2756:1: ( ruleStartState )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2756:1: ( ruleStartState )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2757:1: ruleStartState
            {
             before(grammarAccess.getStartStatesAccess().getExstatesStartStateParserRuleCall_3_2_1_0()); 
            pushFollow(FOLLOW_ruleStartState_in_rule__StartStates__ExstatesAssignment_3_2_15491);
            ruleStartState();

            state._fsp--;

             after(grammarAccess.getStartStatesAccess().getExstatesStartStateParserRuleCall_3_2_1_0()); 

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
    // $ANTLR end "rule__StartStates__ExstatesAssignment_3_2_1"


    // $ANTLR start "rule__StartState__NameAssignment"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2766:1: rule__StartState__NameAssignment : ( RULE_ID ) ;
    public final void rule__StartState__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2770:1: ( ( RULE_ID ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2771:1: ( RULE_ID )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2771:1: ( RULE_ID )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2772:1: RULE_ID
            {
             before(grammarAccess.getStartStateAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__StartState__NameAssignment5522); 
             after(grammarAccess.getStartStateAccess().getNameIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__StartState__NameAssignment"


    // $ANTLR start "rule__Rule__ContentAssignment_1"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2781:1: rule__Rule__ContentAssignment_1 : ( ruleSingleRule ) ;
    public final void rule__Rule__ContentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2785:1: ( ( ruleSingleRule ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2786:1: ( ruleSingleRule )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2786:1: ( ruleSingleRule )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2787:1: ruleSingleRule
            {
             before(grammarAccess.getRuleAccess().getContentSingleRuleParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleSingleRule_in_rule__Rule__ContentAssignment_15553);
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


    // $ANTLR start "rule__SingleRule__RuleAssignment_1"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2796:1: rule__SingleRule__RuleAssignment_1 : ( RULE_STRING ) ;
    public final void rule__SingleRule__RuleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2800:1: ( ( RULE_STRING ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2801:1: ( RULE_STRING )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2801:1: ( RULE_STRING )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2802:1: RULE_STRING
            {
             before(grammarAccess.getSingleRuleAccess().getRuleSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__SingleRule__RuleAssignment_15584); 
             after(grammarAccess.getSingleRuleAccess().getRuleSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__SingleRule__RuleAssignment_1"


    // $ANTLR start "rule__SingleRule__ContentAssignment_4"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2811:1: rule__SingleRule__ContentAssignment_4 : ( RULE_ID ) ;
    public final void rule__SingleRule__ContentAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2815:1: ( ( RULE_ID ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2816:1: ( RULE_ID )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2816:1: ( RULE_ID )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2817:1: RULE_ID
            {
             before(grammarAccess.getSingleRuleAccess().getContentIDTerminalRuleCall_4_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SingleRule__ContentAssignment_45615); 
             after(grammarAccess.getSingleRuleAccess().getContentIDTerminalRuleCall_4_0()); 

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
    // $ANTLR end "rule__SingleRule__ContentAssignment_4"


    // $ANTLR start "rule__RuleStart__StateAssignment_2_0_0"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2826:1: rule__RuleStart__StateAssignment_2_0_0 : ( ( RULE_ID ) ) ;
    public final void rule__RuleStart__StateAssignment_2_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2830:1: ( ( ( RULE_ID ) ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2831:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2831:1: ( ( RULE_ID ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2832:1: ( RULE_ID )
            {
             before(grammarAccess.getRuleStartAccess().getStateStartStateCrossReference_2_0_0_0()); 
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2833:1: ( RULE_ID )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2834:1: RULE_ID
            {
             before(grammarAccess.getRuleStartAccess().getStateStartStateIDTerminalRuleCall_2_0_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__RuleStart__StateAssignment_2_0_05650); 
             after(grammarAccess.getRuleStartAccess().getStateStartStateIDTerminalRuleCall_2_0_0_0_1()); 

            }

             after(grammarAccess.getRuleStartAccess().getStateStartStateCrossReference_2_0_0_0()); 

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
    // $ANTLR end "rule__RuleStart__StateAssignment_2_0_0"


    // $ANTLR start "rule__RuleStart__StateAssignment_2_0_1_1"
    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2845:1: rule__RuleStart__StateAssignment_2_0_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__RuleStart__StateAssignment_2_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2849:1: ( ( ( RULE_ID ) ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2850:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2850:1: ( ( RULE_ID ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2851:1: ( RULE_ID )
            {
             before(grammarAccess.getRuleStartAccess().getStateStartStateCrossReference_2_0_1_1_0()); 
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2852:1: ( RULE_ID )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2853:1: RULE_ID
            {
             before(grammarAccess.getRuleStartAccess().getStateStartStateIDTerminalRuleCall_2_0_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__RuleStart__StateAssignment_2_0_1_15689); 
             after(grammarAccess.getRuleStartAccess().getStateStartStateIDTerminalRuleCall_2_0_1_1_0_1()); 

            }

             after(grammarAccess.getRuleStartAccess().getStateStartStateCrossReference_2_0_1_1_0()); 

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
    // $ANTLR end "rule__RuleStart__StateAssignment_2_0_1_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0_in_ruleModel94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScanner_in_entryRuleScanner121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScanner128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Scanner__Group__0_in_ruleScanner154 = new BitSet(new long[]{0x0000000000000002L});
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
    public static final BitSet FOLLOW_ruleStartState_in_entryRuleStartState661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStartState668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StartState__NameAssignment_in_ruleStartState694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRule_in_entryRuleRule721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRule728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__0_in_ruleRule754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleRule_in_entryRuleSingleRule781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSingleRule788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SingleRule__Group__0_in_ruleSingleRule814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRuleStart_in_entryRuleRuleStart841 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRuleStart848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleStart__Group__0_in_ruleRuleStart874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Rule__Alternatives_0913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Rule__Alternatives_0933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__SingleRule__Alternatives_2968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__SingleRule__Alternatives_2988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__RuleStart__Alternatives_01023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__RuleStart__Alternatives_01043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleStart__Group_2_0__0_in_rule__RuleStart__Alternatives_21077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__RuleStart__Alternatives_21096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__RuleStart__Alternatives_21116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__01149 = new BitSet(new long[]{0x0000000007D00000L});
    public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__01152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ScannerAssignment_0_in_rule__Model__Group__0__Impl1179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__11210 = new BitSet(new long[]{0x0000000007D00000L});
    public static final BitSet FOLLOW_rule__Model__Group__2_in_rule__Model__Group__11213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ScannerAssignment_1_in_rule__Model__Group__1__Impl1240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__21271 = new BitSet(new long[]{0x0000000007D00000L});
    public static final BitSet FOLLOW_rule__Model__Group__3_in_rule__Model__Group__21274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ScannerAssignment_2_in_rule__Model__Group__2__Impl1301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__31332 = new BitSet(new long[]{0x0000000007D00000L});
    public static final BitSet FOLLOW_rule__Model__Group__4_in_rule__Model__Group__31335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ScannerAssignment_3_in_rule__Model__Group__3__Impl1362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__4__Impl_in_rule__Model__Group__41393 = new BitSet(new long[]{0x0000000007D00000L});
    public static final BitSet FOLLOW_rule__Model__Group__5_in_rule__Model__Group__41396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ScannerAssignment_4_in_rule__Model__Group__4__Impl1423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__5__Impl_in_rule__Model__Group__51454 = new BitSet(new long[]{0x0000000007D00000L});
    public static final BitSet FOLLOW_rule__Model__Group__6_in_rule__Model__Group__51457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ScannerAssignment_5_in_rule__Model__Group__5__Impl1484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__6__Impl_in_rule__Model__Group__61515 = new BitSet(new long[]{0x0000000020001800L});
    public static final BitSet FOLLOW_rule__Model__Group__7_in_rule__Model__Group__61518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ScannerAssignment_6_in_rule__Model__Group__6__Impl1545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__7__Impl_in_rule__Model__Group__71575 = new BitSet(new long[]{0x0000000020001800L});
    public static final BitSet FOLLOW_rule__Model__Group__8_in_rule__Model__Group__71578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ScannerAssignment_7_in_rule__Model__Group__7__Impl1605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__8__Impl_in_rule__Model__Group__81636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ScannerAssignment_8_in_rule__Model__Group__8__Impl1663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Scanner__Group__0__Impl_in_rule__Scanner__Group__01711 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Scanner__Group__1_in_rule__Scanner__Group__01714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Scanner__Group__0__Impl1742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Scanner__Group__1__Impl_in_rule__Scanner__Group__11773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Scanner__NameAssignment_1_in_rule__Scanner__Group__1__Impl1800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Export__Group__0__Impl_in_rule__Export__Group__01834 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Export__Group__1_in_rule__Export__Group__01837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Export__Group__0__Impl1865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Export__Group__1__Impl_in_rule__Export__Group__11896 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Export__Group__2_in_rule__Export__Group__11899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Export__ContentAssignment_1_in_rule__Export__Group__1__Impl1926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Export__Group__2__Impl_in_rule__Export__Group__21956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Export__Group__2__Impl1984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Global__Group__0__Impl_in_rule__Global__Group__02021 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Global__Group__1_in_rule__Global__Group__02024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Global__Group__0__Impl2052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Global__Group__1__Impl_in_rule__Global__Group__12083 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Global__Group__2_in_rule__Global__Group__12086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Global__ContentAssignment_1_in_rule__Global__Group__1__Impl2113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Global__Group__2__Impl_in_rule__Global__Group__22143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Global__Group__2__Impl2171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Local__Group__0__Impl_in_rule__Local__Group__02208 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Local__Group__1_in_rule__Local__Group__02211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Local__Group__0__Impl2239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Local__Group__1__Impl_in_rule__Local__Group__12270 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Local__Group__2_in_rule__Local__Group__12273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Local__ContentAssignment_1_in_rule__Local__Group__1__Impl2300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Local__Group__2__Impl_in_rule__Local__Group__22330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Local__Group__2__Impl2358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Default__Group__0__Impl_in_rule__Default__Group__02395 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Default__Group__1_in_rule__Default__Group__02398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Default__Group__0__Impl2426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Default__Group__1__Impl_in_rule__Default__Group__12457 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Default__Group__2_in_rule__Default__Group__12460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Default__ContentAssignment_1_in_rule__Default__Group__1__Impl2487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Default__Group__2__Impl_in_rule__Default__Group__22517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Default__Group__2__Impl2545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Eof__Group__0__Impl_in_rule__Eof__Group__02582 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Eof__Group__1_in_rule__Eof__Group__02585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Eof__Group__0__Impl2613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Eof__Group__1__Impl_in_rule__Eof__Group__12644 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Eof__Group__2_in_rule__Eof__Group__12647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Eof__ContentAssignment_1_in_rule__Eof__Group__1__Impl2674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Eof__Group__2__Impl_in_rule__Eof__Group__22704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Eof__Group__2__Impl2732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Define__Group__0__Impl_in_rule__Define__Group__02769 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Define__Group__1_in_rule__Define__Group__02772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Define__Group__0__Impl2800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Define__Group__1__Impl_in_rule__Define__Group__12831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Define__DefinesAssignment_1_in_rule__Define__Group__1__Impl2860 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Define__DefinesAssignment_1_in_rule__Define__Group__1__Impl2872 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__DefineRule__Group__0__Impl_in_rule__DefineRule__Group__02909 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__DefineRule__Group__1_in_rule__DefineRule__Group__02912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefineRule__NameAssignment_0_in_rule__DefineRule__Group__0__Impl2939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefineRule__Group__1__Impl_in_rule__DefineRule__Group__12969 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DefineRule__Group__2_in_rule__DefineRule__Group__12972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__DefineRule__Group__1__Impl3000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefineRule__Group__2__Impl_in_rule__DefineRule__Group__23031 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__DefineRule__Group__3_in_rule__DefineRule__Group__23034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefineRule__RuleAssignment_2_in_rule__DefineRule__Group__2__Impl3061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefineRule__Group__3__Impl_in_rule__DefineRule__Group__33091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__DefineRule__Group__3__Impl3119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StartStates__Group__0__Impl_in_rule__StartStates__Group__03158 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__StartStates__Group__1_in_rule__StartStates__Group__03161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__StartStates__Group__0__Impl3189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StartStates__Group__1__Impl_in_rule__StartStates__Group__13220 = new BitSet(new long[]{0x0000000040010000L});
    public static final BitSet FOLLOW_rule__StartStates__Group__2_in_rule__StartStates__Group__13223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StartStates__IncstatesAssignment_1_in_rule__StartStates__Group__1__Impl3250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StartStates__Group__2__Impl_in_rule__StartStates__Group__23280 = new BitSet(new long[]{0x0000000040010000L});
    public static final BitSet FOLLOW_rule__StartStates__Group__3_in_rule__StartStates__Group__23283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StartStates__Group_2__0_in_rule__StartStates__Group__2__Impl3310 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_rule__StartStates__Group__3__Impl_in_rule__StartStates__Group__33341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StartStates__Group_3__0_in_rule__StartStates__Group__3__Impl3368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StartStates__Group_2__0__Impl_in_rule__StartStates__Group_2__03407 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__StartStates__Group_2__1_in_rule__StartStates__Group_2__03410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__StartStates__Group_2__0__Impl3438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StartStates__Group_2__1__Impl_in_rule__StartStates__Group_2__13469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StartStates__IncstatesAssignment_2_1_in_rule__StartStates__Group_2__1__Impl3496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StartStates__Group_3__0__Impl_in_rule__StartStates__Group_3__03530 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__StartStates__Group_3__1_in_rule__StartStates__Group_3__03533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__StartStates__Group_3__0__Impl3561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StartStates__Group_3__1__Impl_in_rule__StartStates__Group_3__13592 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__StartStates__Group_3__2_in_rule__StartStates__Group_3__13595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StartStates__ExstatesAssignment_3_1_in_rule__StartStates__Group_3__1__Impl3622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StartStates__Group_3__2__Impl_in_rule__StartStates__Group_3__23652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StartStates__Group_3_2__0_in_rule__StartStates__Group_3__2__Impl3679 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_rule__StartStates__Group_3_2__0__Impl_in_rule__StartStates__Group_3_2__03716 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__StartStates__Group_3_2__1_in_rule__StartStates__Group_3_2__03719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__StartStates__Group_3_2__0__Impl3747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StartStates__Group_3_2__1__Impl_in_rule__StartStates__Group_3_2__13778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StartStates__ExstatesAssignment_3_2_1_in_rule__StartStates__Group_3_2__1__Impl3805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__0__Impl_in_rule__Rule__Group__03839 = new BitSet(new long[]{0x0000000100018020L});
    public static final BitSet FOLLOW_rule__Rule__Group__1_in_rule__Rule__Group__03842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Alternatives_0_in_rule__Rule__Group__0__Impl3869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__1__Impl_in_rule__Rule__Group__13899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__ContentAssignment_1_in_rule__Rule__Group__1__Impl3926 = new BitSet(new long[]{0x0000000100018022L});
    public static final BitSet FOLLOW_rule__SingleRule__Group__0__Impl_in_rule__SingleRule__Group__03961 = new BitSet(new long[]{0x0000000100018020L});
    public static final BitSet FOLLOW_rule__SingleRule__Group__1_in_rule__SingleRule__Group__03964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRuleStart_in_rule__SingleRule__Group__0__Impl3992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SingleRule__Group__1__Impl_in_rule__SingleRule__Group__14023 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_rule__SingleRule__Group__2_in_rule__SingleRule__Group__14026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SingleRule__RuleAssignment_1_in_rule__SingleRule__Group__1__Impl4053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SingleRule__Group__2__Impl_in_rule__SingleRule__Group__24083 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__SingleRule__Group__3_in_rule__SingleRule__Group__24086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SingleRule__Alternatives_2_in_rule__SingleRule__Group__2__Impl4113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SingleRule__Group__3__Impl_in_rule__SingleRule__Group__34143 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SingleRule__Group__4_in_rule__SingleRule__Group__34146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__SingleRule__Group__3__Impl4174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SingleRule__Group__4__Impl_in_rule__SingleRule__Group__44205 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__SingleRule__Group__5_in_rule__SingleRule__Group__44208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SingleRule__ContentAssignment_4_in_rule__SingleRule__Group__4__Impl4235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SingleRule__Group__5__Impl_in_rule__SingleRule__Group__54265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__SingleRule__Group__5__Impl4293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleStart__Group__0__Impl_in_rule__RuleStart__Group__04336 = new BitSet(new long[]{0x0000000100018000L});
    public static final BitSet FOLLOW_rule__RuleStart__Group__1_in_rule__RuleStart__Group__04339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleStart__Alternatives_0_in_rule__RuleStart__Group__0__Impl4366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleStart__Group__1__Impl_in_rule__RuleStart__Group__14397 = new BitSet(new long[]{0x0000000000060010L});
    public static final BitSet FOLLOW_rule__RuleStart__Group__2_in_rule__RuleStart__Group__14400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__RuleStart__Group__1__Impl4428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleStart__Group__2__Impl_in_rule__RuleStart__Group__24459 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__RuleStart__Group__3_in_rule__RuleStart__Group__24462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleStart__Alternatives_2_in_rule__RuleStart__Group__2__Impl4489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleStart__Group__3__Impl_in_rule__RuleStart__Group__34519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__RuleStart__Group__3__Impl4547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleStart__Group_2_0__0__Impl_in_rule__RuleStart__Group_2_0__04586 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__RuleStart__Group_2_0__1_in_rule__RuleStart__Group_2_0__04589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleStart__StateAssignment_2_0_0_in_rule__RuleStart__Group_2_0__0__Impl4616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleStart__Group_2_0__1__Impl_in_rule__RuleStart__Group_2_0__14646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleStart__Group_2_0_1__0_in_rule__RuleStart__Group_2_0__1__Impl4673 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_rule__RuleStart__Group_2_0_1__0__Impl_in_rule__RuleStart__Group_2_0_1__04708 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RuleStart__Group_2_0_1__1_in_rule__RuleStart__Group_2_0_1__04711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__RuleStart__Group_2_0_1__0__Impl4739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleStart__Group_2_0_1__1__Impl_in_rule__RuleStart__Group_2_0_1__14770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleStart__StateAssignment_2_0_1_1_in_rule__RuleStart__Group_2_0_1__1__Impl4797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScanner_in_rule__Model__ScannerAssignment_04840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExport_in_rule__Model__ScannerAssignment_14871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGlobal_in_rule__Model__ScannerAssignment_24902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocal_in_rule__Model__ScannerAssignment_34933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefault_in_rule__Model__ScannerAssignment_44964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEof_in_rule__Model__ScannerAssignment_54995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefine_in_rule__Model__ScannerAssignment_65026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStartStates_in_rule__Model__ScannerAssignment_75057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRule_in_rule__Model__ScannerAssignment_85088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Scanner__NameAssignment_15119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Export__ContentAssignment_15150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Global__ContentAssignment_15181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Local__ContentAssignment_15212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Default__ContentAssignment_15243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Eof__ContentAssignment_15274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefineRule_in_rule__Define__DefinesAssignment_15305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DefineRule__NameAssignment_05336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DefineRule__RuleAssignment_25367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStartState_in_rule__StartStates__IncstatesAssignment_15398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStartState_in_rule__StartStates__IncstatesAssignment_2_15429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStartState_in_rule__StartStates__ExstatesAssignment_3_15460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStartState_in_rule__StartStates__ExstatesAssignment_3_2_15491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__StartState__NameAssignment5522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleRule_in_rule__Rule__ContentAssignment_15553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__SingleRule__RuleAssignment_15584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SingleRule__ContentAssignment_45615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__RuleStart__StateAssignment_2_0_05650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__RuleStart__StateAssignment_2_0_1_15689 = new BitSet(new long[]{0x0000000000000002L});

}