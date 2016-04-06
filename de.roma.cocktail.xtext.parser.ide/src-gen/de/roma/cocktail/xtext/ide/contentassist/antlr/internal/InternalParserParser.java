package de.roma.cocktail.xtext.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import de.roma.cocktail.xtext.services.ParserGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalParserParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_WS", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_ANY_OTHER", "'+'", "'-'", "'('", "')'", "'*'", "'.'", "'/'", "'\\\\'", "'|'", "'?'", "'>'", "'<'", "'#'", "'$'", "'%'", "';'", "':'", "'!'", "'='", "','", "'RULE'", "'RULES'", "'NONE'", "'LEFT'", "'RIGHT'", "'SCANNER'", "'PARSER'", "'IMPORT'", "'{'", "'}'", "'EXPORT'", "'GLOBAL'", "'LOCAL'", "'BEGIN'", "'CLOSE'", "'TOKEN'", "'PREC'", "'START'", "'['", "']'"
    };
    public static final int RULE_ID=5;
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
    public static final int EOF=-1;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=7;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_SL_COMMENT=9;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=6;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=4;

    // delegates
    // delegators


        public InternalParserParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalParserParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalParserParser.tokenNames; }
    public String getGrammarFileName() { return "InternalParser.g"; }


    	private ParserGrammarAccess grammarAccess;

    	public void setGrammarAccess(ParserGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleParserModel"
    // InternalParser.g:53:1: entryRuleParserModel : ruleParserModel EOF ;
    public final void entryRuleParserModel() throws RecognitionException {
        try {
            // InternalParser.g:54:1: ( ruleParserModel EOF )
            // InternalParser.g:55:1: ruleParserModel EOF
            {
             before(grammarAccess.getParserModelRule()); 
            pushFollow(FOLLOW_1);
            ruleParserModel();

            state._fsp--;

             after(grammarAccess.getParserModelRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleParserModel"


    // $ANTLR start "ruleParserModel"
    // InternalParser.g:62:1: ruleParserModel : ( ( rule__ParserModel__Group__0 ) ) ;
    public final void ruleParserModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:66:2: ( ( ( rule__ParserModel__Group__0 ) ) )
            // InternalParser.g:67:2: ( ( rule__ParserModel__Group__0 ) )
            {
            // InternalParser.g:67:2: ( ( rule__ParserModel__Group__0 ) )
            // InternalParser.g:68:3: ( rule__ParserModel__Group__0 )
            {
             before(grammarAccess.getParserModelAccess().getGroup()); 
            // InternalParser.g:69:3: ( rule__ParserModel__Group__0 )
            // InternalParser.g:69:4: rule__ParserModel__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ParserModel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParserModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParserModel"


    // $ANTLR start "entryRuleScannerName"
    // InternalParser.g:78:1: entryRuleScannerName : ruleScannerName EOF ;
    public final void entryRuleScannerName() throws RecognitionException {
        try {
            // InternalParser.g:79:1: ( ruleScannerName EOF )
            // InternalParser.g:80:1: ruleScannerName EOF
            {
             before(grammarAccess.getScannerNameRule()); 
            pushFollow(FOLLOW_1);
            ruleScannerName();

            state._fsp--;

             after(grammarAccess.getScannerNameRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleScannerName"


    // $ANTLR start "ruleScannerName"
    // InternalParser.g:87:1: ruleScannerName : ( ( rule__ScannerName__Group__0 ) ) ;
    public final void ruleScannerName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:91:2: ( ( ( rule__ScannerName__Group__0 ) ) )
            // InternalParser.g:92:2: ( ( rule__ScannerName__Group__0 ) )
            {
            // InternalParser.g:92:2: ( ( rule__ScannerName__Group__0 ) )
            // InternalParser.g:93:3: ( rule__ScannerName__Group__0 )
            {
             before(grammarAccess.getScannerNameAccess().getGroup()); 
            // InternalParser.g:94:3: ( rule__ScannerName__Group__0 )
            // InternalParser.g:94:4: rule__ScannerName__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ScannerName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getScannerNameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleScannerName"


    // $ANTLR start "entryRuleParserName"
    // InternalParser.g:103:1: entryRuleParserName : ruleParserName EOF ;
    public final void entryRuleParserName() throws RecognitionException {
        try {
            // InternalParser.g:104:1: ( ruleParserName EOF )
            // InternalParser.g:105:1: ruleParserName EOF
            {
             before(grammarAccess.getParserNameRule()); 
            pushFollow(FOLLOW_1);
            ruleParserName();

            state._fsp--;

             after(grammarAccess.getParserNameRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleParserName"


    // $ANTLR start "ruleParserName"
    // InternalParser.g:112:1: ruleParserName : ( ( rule__ParserName__Group__0 ) ) ;
    public final void ruleParserName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:116:2: ( ( ( rule__ParserName__Group__0 ) ) )
            // InternalParser.g:117:2: ( ( rule__ParserName__Group__0 ) )
            {
            // InternalParser.g:117:2: ( ( rule__ParserName__Group__0 ) )
            // InternalParser.g:118:3: ( rule__ParserName__Group__0 )
            {
             before(grammarAccess.getParserNameAccess().getGroup()); 
            // InternalParser.g:119:3: ( rule__ParserName__Group__0 )
            // InternalParser.g:119:4: rule__ParserName__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ParserName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParserNameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParserName"


    // $ANTLR start "entryRuleImport"
    // InternalParser.g:128:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // InternalParser.g:129:1: ( ruleImport EOF )
            // InternalParser.g:130:1: ruleImport EOF
            {
             before(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_1);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getImportRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalParser.g:137:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:141:2: ( ( ( rule__Import__Group__0 ) ) )
            // InternalParser.g:142:2: ( ( rule__Import__Group__0 ) )
            {
            // InternalParser.g:142:2: ( ( rule__Import__Group__0 ) )
            // InternalParser.g:143:3: ( rule__Import__Group__0 )
            {
             before(grammarAccess.getImportAccess().getGroup()); 
            // InternalParser.g:144:3: ( rule__Import__Group__0 )
            // InternalParser.g:144:4: rule__Import__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Import__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleExport"
    // InternalParser.g:153:1: entryRuleExport : ruleExport EOF ;
    public final void entryRuleExport() throws RecognitionException {
        try {
            // InternalParser.g:154:1: ( ruleExport EOF )
            // InternalParser.g:155:1: ruleExport EOF
            {
             before(grammarAccess.getExportRule()); 
            pushFollow(FOLLOW_1);
            ruleExport();

            state._fsp--;

             after(grammarAccess.getExportRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalParser.g:162:1: ruleExport : ( ( rule__Export__Group__0 ) ) ;
    public final void ruleExport() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:166:2: ( ( ( rule__Export__Group__0 ) ) )
            // InternalParser.g:167:2: ( ( rule__Export__Group__0 ) )
            {
            // InternalParser.g:167:2: ( ( rule__Export__Group__0 ) )
            // InternalParser.g:168:3: ( rule__Export__Group__0 )
            {
             before(grammarAccess.getExportAccess().getGroup()); 
            // InternalParser.g:169:3: ( rule__Export__Group__0 )
            // InternalParser.g:169:4: rule__Export__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalParser.g:178:1: entryRuleGlobal : ruleGlobal EOF ;
    public final void entryRuleGlobal() throws RecognitionException {
        try {
            // InternalParser.g:179:1: ( ruleGlobal EOF )
            // InternalParser.g:180:1: ruleGlobal EOF
            {
             before(grammarAccess.getGlobalRule()); 
            pushFollow(FOLLOW_1);
            ruleGlobal();

            state._fsp--;

             after(grammarAccess.getGlobalRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalParser.g:187:1: ruleGlobal : ( ( rule__Global__Group__0 ) ) ;
    public final void ruleGlobal() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:191:2: ( ( ( rule__Global__Group__0 ) ) )
            // InternalParser.g:192:2: ( ( rule__Global__Group__0 ) )
            {
            // InternalParser.g:192:2: ( ( rule__Global__Group__0 ) )
            // InternalParser.g:193:3: ( rule__Global__Group__0 )
            {
             before(grammarAccess.getGlobalAccess().getGroup()); 
            // InternalParser.g:194:3: ( rule__Global__Group__0 )
            // InternalParser.g:194:4: rule__Global__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalParser.g:203:1: entryRuleLocal : ruleLocal EOF ;
    public final void entryRuleLocal() throws RecognitionException {
        try {
            // InternalParser.g:204:1: ( ruleLocal EOF )
            // InternalParser.g:205:1: ruleLocal EOF
            {
             before(grammarAccess.getLocalRule()); 
            pushFollow(FOLLOW_1);
            ruleLocal();

            state._fsp--;

             after(grammarAccess.getLocalRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalParser.g:212:1: ruleLocal : ( ( rule__Local__Group__0 ) ) ;
    public final void ruleLocal() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:216:2: ( ( ( rule__Local__Group__0 ) ) )
            // InternalParser.g:217:2: ( ( rule__Local__Group__0 ) )
            {
            // InternalParser.g:217:2: ( ( rule__Local__Group__0 ) )
            // InternalParser.g:218:3: ( rule__Local__Group__0 )
            {
             before(grammarAccess.getLocalAccess().getGroup()); 
            // InternalParser.g:219:3: ( rule__Local__Group__0 )
            // InternalParser.g:219:4: rule__Local__Group__0
            {
            pushFollow(FOLLOW_2);
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


    // $ANTLR start "entryRuleBegin"
    // InternalParser.g:228:1: entryRuleBegin : ruleBegin EOF ;
    public final void entryRuleBegin() throws RecognitionException {
        try {
            // InternalParser.g:229:1: ( ruleBegin EOF )
            // InternalParser.g:230:1: ruleBegin EOF
            {
             before(grammarAccess.getBeginRule()); 
            pushFollow(FOLLOW_1);
            ruleBegin();

            state._fsp--;

             after(grammarAccess.getBeginRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleBegin"


    // $ANTLR start "ruleBegin"
    // InternalParser.g:237:1: ruleBegin : ( ( rule__Begin__Group__0 ) ) ;
    public final void ruleBegin() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:241:2: ( ( ( rule__Begin__Group__0 ) ) )
            // InternalParser.g:242:2: ( ( rule__Begin__Group__0 ) )
            {
            // InternalParser.g:242:2: ( ( rule__Begin__Group__0 ) )
            // InternalParser.g:243:3: ( rule__Begin__Group__0 )
            {
             before(grammarAccess.getBeginAccess().getGroup()); 
            // InternalParser.g:244:3: ( rule__Begin__Group__0 )
            // InternalParser.g:244:4: rule__Begin__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Begin__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBeginAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBegin"


    // $ANTLR start "entryRuleClose"
    // InternalParser.g:253:1: entryRuleClose : ruleClose EOF ;
    public final void entryRuleClose() throws RecognitionException {
        try {
            // InternalParser.g:254:1: ( ruleClose EOF )
            // InternalParser.g:255:1: ruleClose EOF
            {
             before(grammarAccess.getCloseRule()); 
            pushFollow(FOLLOW_1);
            ruleClose();

            state._fsp--;

             after(grammarAccess.getCloseRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleClose"


    // $ANTLR start "ruleClose"
    // InternalParser.g:262:1: ruleClose : ( ( rule__Close__Group__0 ) ) ;
    public final void ruleClose() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:266:2: ( ( ( rule__Close__Group__0 ) ) )
            // InternalParser.g:267:2: ( ( rule__Close__Group__0 ) )
            {
            // InternalParser.g:267:2: ( ( rule__Close__Group__0 ) )
            // InternalParser.g:268:3: ( rule__Close__Group__0 )
            {
             before(grammarAccess.getCloseAccess().getGroup()); 
            // InternalParser.g:269:3: ( rule__Close__Group__0 )
            // InternalParser.g:269:4: rule__Close__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Close__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCloseAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleClose"


    // $ANTLR start "entryRuleTokens"
    // InternalParser.g:278:1: entryRuleTokens : ruleTokens EOF ;
    public final void entryRuleTokens() throws RecognitionException {
        try {
            // InternalParser.g:279:1: ( ruleTokens EOF )
            // InternalParser.g:280:1: ruleTokens EOF
            {
             before(grammarAccess.getTokensRule()); 
            pushFollow(FOLLOW_1);
            ruleTokens();

            state._fsp--;

             after(grammarAccess.getTokensRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTokens"


    // $ANTLR start "ruleTokens"
    // InternalParser.g:287:1: ruleTokens : ( ( rule__Tokens__Group__0 ) ) ;
    public final void ruleTokens() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:291:2: ( ( ( rule__Tokens__Group__0 ) ) )
            // InternalParser.g:292:2: ( ( rule__Tokens__Group__0 ) )
            {
            // InternalParser.g:292:2: ( ( rule__Tokens__Group__0 ) )
            // InternalParser.g:293:3: ( rule__Tokens__Group__0 )
            {
             before(grammarAccess.getTokensAccess().getGroup()); 
            // InternalParser.g:294:3: ( rule__Tokens__Group__0 )
            // InternalParser.g:294:4: rule__Tokens__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Tokens__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTokensAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTokens"


    // $ANTLR start "entryRuleDefinedToken"
    // InternalParser.g:303:1: entryRuleDefinedToken : ruleDefinedToken EOF ;
    public final void entryRuleDefinedToken() throws RecognitionException {
        try {
            // InternalParser.g:304:1: ( ruleDefinedToken EOF )
            // InternalParser.g:305:1: ruleDefinedToken EOF
            {
             before(grammarAccess.getDefinedTokenRule()); 
            pushFollow(FOLLOW_1);
            ruleDefinedToken();

            state._fsp--;

             after(grammarAccess.getDefinedTokenRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDefinedToken"


    // $ANTLR start "ruleDefinedToken"
    // InternalParser.g:312:1: ruleDefinedToken : ( ( rule__DefinedToken__Alternatives ) ) ;
    public final void ruleDefinedToken() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:316:2: ( ( ( rule__DefinedToken__Alternatives ) ) )
            // InternalParser.g:317:2: ( ( rule__DefinedToken__Alternatives ) )
            {
            // InternalParser.g:317:2: ( ( rule__DefinedToken__Alternatives ) )
            // InternalParser.g:318:3: ( rule__DefinedToken__Alternatives )
            {
             before(grammarAccess.getDefinedTokenAccess().getAlternatives()); 
            // InternalParser.g:319:3: ( rule__DefinedToken__Alternatives )
            // InternalParser.g:319:4: rule__DefinedToken__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__DefinedToken__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDefinedTokenAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDefinedToken"


    // $ANTLR start "entryRuleTokenExtra"
    // InternalParser.g:328:1: entryRuleTokenExtra : ruleTokenExtra EOF ;
    public final void entryRuleTokenExtra() throws RecognitionException {
        try {
            // InternalParser.g:329:1: ( ruleTokenExtra EOF )
            // InternalParser.g:330:1: ruleTokenExtra EOF
            {
             before(grammarAccess.getTokenExtraRule()); 
            pushFollow(FOLLOW_1);
            ruleTokenExtra();

            state._fsp--;

             after(grammarAccess.getTokenExtraRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTokenExtra"


    // $ANTLR start "ruleTokenExtra"
    // InternalParser.g:337:1: ruleTokenExtra : ( ( rule__TokenExtra__Group__0 ) ) ;
    public final void ruleTokenExtra() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:341:2: ( ( ( rule__TokenExtra__Group__0 ) ) )
            // InternalParser.g:342:2: ( ( rule__TokenExtra__Group__0 ) )
            {
            // InternalParser.g:342:2: ( ( rule__TokenExtra__Group__0 ) )
            // InternalParser.g:343:3: ( rule__TokenExtra__Group__0 )
            {
             before(grammarAccess.getTokenExtraAccess().getGroup()); 
            // InternalParser.g:344:3: ( rule__TokenExtra__Group__0 )
            // InternalParser.g:344:4: rule__TokenExtra__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TokenExtra__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTokenExtraAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTokenExtra"


    // $ANTLR start "entryRuleCodeBlock"
    // InternalParser.g:353:1: entryRuleCodeBlock : ruleCodeBlock EOF ;
    public final void entryRuleCodeBlock() throws RecognitionException {
        try {
            // InternalParser.g:354:1: ( ruleCodeBlock EOF )
            // InternalParser.g:355:1: ruleCodeBlock EOF
            {
             before(grammarAccess.getCodeBlockRule()); 
            pushFollow(FOLLOW_1);
            ruleCodeBlock();

            state._fsp--;

             after(grammarAccess.getCodeBlockRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCodeBlock"


    // $ANTLR start "ruleCodeBlock"
    // InternalParser.g:362:1: ruleCodeBlock : ( ( rule__CodeBlock__Alternatives )* ) ;
    public final void ruleCodeBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:366:2: ( ( ( rule__CodeBlock__Alternatives )* ) )
            // InternalParser.g:367:2: ( ( rule__CodeBlock__Alternatives )* )
            {
            // InternalParser.g:367:2: ( ( rule__CodeBlock__Alternatives )* )
            // InternalParser.g:368:3: ( rule__CodeBlock__Alternatives )*
            {
             before(grammarAccess.getCodeBlockAccess().getAlternatives()); 
            // InternalParser.g:369:3: ( rule__CodeBlock__Alternatives )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_WS && LA1_0<=RULE_INT)||(LA1_0>=11 && LA1_0<=30)||LA1_0==39) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalParser.g:369:4: rule__CodeBlock__Alternatives
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__CodeBlock__Alternatives();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getCodeBlockAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCodeBlock"


    // $ANTLR start "entryRuleCodeWall"
    // InternalParser.g:378:1: entryRuleCodeWall : ruleCodeWall EOF ;
    public final void entryRuleCodeWall() throws RecognitionException {
        try {
            // InternalParser.g:379:1: ( ruleCodeWall EOF )
            // InternalParser.g:380:1: ruleCodeWall EOF
            {
             before(grammarAccess.getCodeWallRule()); 
            pushFollow(FOLLOW_1);
            ruleCodeWall();

            state._fsp--;

             after(grammarAccess.getCodeWallRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCodeWall"


    // $ANTLR start "ruleCodeWall"
    // InternalParser.g:387:1: ruleCodeWall : ( ( rule__CodeWall__Alternatives ) ) ;
    public final void ruleCodeWall() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:391:2: ( ( ( rule__CodeWall__Alternatives ) ) )
            // InternalParser.g:392:2: ( ( rule__CodeWall__Alternatives ) )
            {
            // InternalParser.g:392:2: ( ( rule__CodeWall__Alternatives ) )
            // InternalParser.g:393:3: ( rule__CodeWall__Alternatives )
            {
             before(grammarAccess.getCodeWallAccess().getAlternatives()); 
            // InternalParser.g:394:3: ( rule__CodeWall__Alternatives )
            // InternalParser.g:394:4: rule__CodeWall__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__CodeWall__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCodeWallAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCodeWall"


    // $ANTLR start "entryRulePrecedence"
    // InternalParser.g:403:1: entryRulePrecedence : rulePrecedence EOF ;
    public final void entryRulePrecedence() throws RecognitionException {
        try {
            // InternalParser.g:404:1: ( rulePrecedence EOF )
            // InternalParser.g:405:1: rulePrecedence EOF
            {
             before(grammarAccess.getPrecedenceRule()); 
            pushFollow(FOLLOW_1);
            rulePrecedence();

            state._fsp--;

             after(grammarAccess.getPrecedenceRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePrecedence"


    // $ANTLR start "rulePrecedence"
    // InternalParser.g:412:1: rulePrecedence : ( ( rule__Precedence__Group__0 ) ) ;
    public final void rulePrecedence() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:416:2: ( ( ( rule__Precedence__Group__0 ) ) )
            // InternalParser.g:417:2: ( ( rule__Precedence__Group__0 ) )
            {
            // InternalParser.g:417:2: ( ( rule__Precedence__Group__0 ) )
            // InternalParser.g:418:3: ( rule__Precedence__Group__0 )
            {
             before(grammarAccess.getPrecedenceAccess().getGroup()); 
            // InternalParser.g:419:3: ( rule__Precedence__Group__0 )
            // InternalParser.g:419:4: rule__Precedence__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Precedence__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPrecedenceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrecedence"


    // $ANTLR start "entryRulePrecedenceRow"
    // InternalParser.g:428:1: entryRulePrecedenceRow : rulePrecedenceRow EOF ;
    public final void entryRulePrecedenceRow() throws RecognitionException {
        try {
            // InternalParser.g:429:1: ( rulePrecedenceRow EOF )
            // InternalParser.g:430:1: rulePrecedenceRow EOF
            {
             before(grammarAccess.getPrecedenceRowRule()); 
            pushFollow(FOLLOW_1);
            rulePrecedenceRow();

            state._fsp--;

             after(grammarAccess.getPrecedenceRowRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePrecedenceRow"


    // $ANTLR start "rulePrecedenceRow"
    // InternalParser.g:437:1: rulePrecedenceRow : ( ( rule__PrecedenceRow__Group__0 ) ) ;
    public final void rulePrecedenceRow() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:441:2: ( ( ( rule__PrecedenceRow__Group__0 ) ) )
            // InternalParser.g:442:2: ( ( rule__PrecedenceRow__Group__0 ) )
            {
            // InternalParser.g:442:2: ( ( rule__PrecedenceRow__Group__0 ) )
            // InternalParser.g:443:3: ( rule__PrecedenceRow__Group__0 )
            {
             before(grammarAccess.getPrecedenceRowAccess().getGroup()); 
            // InternalParser.g:444:3: ( rule__PrecedenceRow__Group__0 )
            // InternalParser.g:444:4: rule__PrecedenceRow__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PrecedenceRow__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPrecedenceRowAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrecedenceRow"


    // $ANTLR start "entryRuleStartSymbols"
    // InternalParser.g:453:1: entryRuleStartSymbols : ruleStartSymbols EOF ;
    public final void entryRuleStartSymbols() throws RecognitionException {
        try {
            // InternalParser.g:454:1: ( ruleStartSymbols EOF )
            // InternalParser.g:455:1: ruleStartSymbols EOF
            {
             before(grammarAccess.getStartSymbolsRule()); 
            pushFollow(FOLLOW_1);
            ruleStartSymbols();

            state._fsp--;

             after(grammarAccess.getStartSymbolsRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleStartSymbols"


    // $ANTLR start "ruleStartSymbols"
    // InternalParser.g:462:1: ruleStartSymbols : ( ( rule__StartSymbols__Group__0 ) ) ;
    public final void ruleStartSymbols() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:466:2: ( ( ( rule__StartSymbols__Group__0 ) ) )
            // InternalParser.g:467:2: ( ( rule__StartSymbols__Group__0 ) )
            {
            // InternalParser.g:467:2: ( ( rule__StartSymbols__Group__0 ) )
            // InternalParser.g:468:3: ( rule__StartSymbols__Group__0 )
            {
             before(grammarAccess.getStartSymbolsAccess().getGroup()); 
            // InternalParser.g:469:3: ( rule__StartSymbols__Group__0 )
            // InternalParser.g:469:4: rule__StartSymbols__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__StartSymbols__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStartSymbolsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStartSymbols"


    // $ANTLR start "entryRuleStartState"
    // InternalParser.g:478:1: entryRuleStartState : ruleStartState EOF ;
    public final void entryRuleStartState() throws RecognitionException {
        try {
            // InternalParser.g:479:1: ( ruleStartState EOF )
            // InternalParser.g:480:1: ruleStartState EOF
            {
             before(grammarAccess.getStartStateRule()); 
            pushFollow(FOLLOW_1);
            ruleStartState();

            state._fsp--;

             after(grammarAccess.getStartStateRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalParser.g:487:1: ruleStartState : ( ( rule__StartState__NameAssignment ) ) ;
    public final void ruleStartState() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:491:2: ( ( ( rule__StartState__NameAssignment ) ) )
            // InternalParser.g:492:2: ( ( rule__StartState__NameAssignment ) )
            {
            // InternalParser.g:492:2: ( ( rule__StartState__NameAssignment ) )
            // InternalParser.g:493:3: ( rule__StartState__NameAssignment )
            {
             before(grammarAccess.getStartStateAccess().getNameAssignment()); 
            // InternalParser.g:494:3: ( rule__StartState__NameAssignment )
            // InternalParser.g:494:4: rule__StartState__NameAssignment
            {
            pushFollow(FOLLOW_2);
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


    // $ANTLR start "entryRuleGrammarRules"
    // InternalParser.g:503:1: entryRuleGrammarRules : ruleGrammarRules EOF ;
    public final void entryRuleGrammarRules() throws RecognitionException {
        try {
            // InternalParser.g:504:1: ( ruleGrammarRules EOF )
            // InternalParser.g:505:1: ruleGrammarRules EOF
            {
             before(grammarAccess.getGrammarRulesRule()); 
            pushFollow(FOLLOW_1);
            ruleGrammarRules();

            state._fsp--;

             after(grammarAccess.getGrammarRulesRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleGrammarRules"


    // $ANTLR start "ruleGrammarRules"
    // InternalParser.g:512:1: ruleGrammarRules : ( ( rule__GrammarRules__Group__0 ) ) ;
    public final void ruleGrammarRules() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:516:2: ( ( ( rule__GrammarRules__Group__0 ) ) )
            // InternalParser.g:517:2: ( ( rule__GrammarRules__Group__0 ) )
            {
            // InternalParser.g:517:2: ( ( rule__GrammarRules__Group__0 ) )
            // InternalParser.g:518:3: ( rule__GrammarRules__Group__0 )
            {
             before(grammarAccess.getGrammarRulesAccess().getGroup()); 
            // InternalParser.g:519:3: ( rule__GrammarRules__Group__0 )
            // InternalParser.g:519:4: rule__GrammarRules__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GrammarRules__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGrammarRulesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGrammarRules"


    // $ANTLR start "entryRuleGrammarRule"
    // InternalParser.g:528:1: entryRuleGrammarRule : ruleGrammarRule EOF ;
    public final void entryRuleGrammarRule() throws RecognitionException {
        try {
            // InternalParser.g:529:1: ( ruleGrammarRule EOF )
            // InternalParser.g:530:1: ruleGrammarRule EOF
            {
             before(grammarAccess.getGrammarRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleGrammarRule();

            state._fsp--;

             after(grammarAccess.getGrammarRuleRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleGrammarRule"


    // $ANTLR start "ruleGrammarRule"
    // InternalParser.g:537:1: ruleGrammarRule : ( ( rule__GrammarRule__Group__0 ) ) ;
    public final void ruleGrammarRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:541:2: ( ( ( rule__GrammarRule__Group__0 ) ) )
            // InternalParser.g:542:2: ( ( rule__GrammarRule__Group__0 ) )
            {
            // InternalParser.g:542:2: ( ( rule__GrammarRule__Group__0 ) )
            // InternalParser.g:543:3: ( rule__GrammarRule__Group__0 )
            {
             before(grammarAccess.getGrammarRuleAccess().getGroup()); 
            // InternalParser.g:544:3: ( rule__GrammarRule__Group__0 )
            // InternalParser.g:544:4: rule__GrammarRule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GrammarRule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGrammarRuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGrammarRule"


    // $ANTLR start "entryRuleRuleBody"
    // InternalParser.g:553:1: entryRuleRuleBody : ruleRuleBody EOF ;
    public final void entryRuleRuleBody() throws RecognitionException {
        try {
            // InternalParser.g:554:1: ( ruleRuleBody EOF )
            // InternalParser.g:555:1: ruleRuleBody EOF
            {
             before(grammarAccess.getRuleBodyRule()); 
            pushFollow(FOLLOW_1);
            ruleRuleBody();

            state._fsp--;

             after(grammarAccess.getRuleBodyRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRuleBody"


    // $ANTLR start "ruleRuleBody"
    // InternalParser.g:562:1: ruleRuleBody : ( ( rule__RuleBody__Group__0 ) ) ;
    public final void ruleRuleBody() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:566:2: ( ( ( rule__RuleBody__Group__0 ) ) )
            // InternalParser.g:567:2: ( ( rule__RuleBody__Group__0 ) )
            {
            // InternalParser.g:567:2: ( ( rule__RuleBody__Group__0 ) )
            // InternalParser.g:568:3: ( rule__RuleBody__Group__0 )
            {
             before(grammarAccess.getRuleBodyAccess().getGroup()); 
            // InternalParser.g:569:3: ( rule__RuleBody__Group__0 )
            // InternalParser.g:569:4: rule__RuleBody__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RuleBody__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRuleBodyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRuleBody"


    // $ANTLR start "entryRuleRuleCode"
    // InternalParser.g:578:1: entryRuleRuleCode : ruleRuleCode EOF ;
    public final void entryRuleRuleCode() throws RecognitionException {
        try {
            // InternalParser.g:579:1: ( ruleRuleCode EOF )
            // InternalParser.g:580:1: ruleRuleCode EOF
            {
             before(grammarAccess.getRuleCodeRule()); 
            pushFollow(FOLLOW_1);
            ruleRuleCode();

            state._fsp--;

             after(grammarAccess.getRuleCodeRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRuleCode"


    // $ANTLR start "ruleRuleCode"
    // InternalParser.g:587:1: ruleRuleCode : ( ( rule__RuleCode__UnorderedGroup ) ) ;
    public final void ruleRuleCode() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:591:2: ( ( ( rule__RuleCode__UnorderedGroup ) ) )
            // InternalParser.g:592:2: ( ( rule__RuleCode__UnorderedGroup ) )
            {
            // InternalParser.g:592:2: ( ( rule__RuleCode__UnorderedGroup ) )
            // InternalParser.g:593:3: ( rule__RuleCode__UnorderedGroup )
            {
             before(grammarAccess.getRuleCodeAccess().getUnorderedGroup()); 
            // InternalParser.g:594:3: ( rule__RuleCode__UnorderedGroup )
            // InternalParser.g:594:4: rule__RuleCode__UnorderedGroup
            {
            pushFollow(FOLLOW_2);
            rule__RuleCode__UnorderedGroup();

            state._fsp--;


            }

             after(grammarAccess.getRuleCodeAccess().getUnorderedGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRuleCode"


    // $ANTLR start "entryRuleRuleContent"
    // InternalParser.g:603:1: entryRuleRuleContent : ruleRuleContent EOF ;
    public final void entryRuleRuleContent() throws RecognitionException {
        try {
            // InternalParser.g:604:1: ( ruleRuleContent EOF )
            // InternalParser.g:605:1: ruleRuleContent EOF
            {
             before(grammarAccess.getRuleContentRule()); 
            pushFollow(FOLLOW_1);
            ruleRuleContent();

            state._fsp--;

             after(grammarAccess.getRuleContentRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRuleContent"


    // $ANTLR start "ruleRuleContent"
    // InternalParser.g:612:1: ruleRuleContent : ( ( rule__RuleContent__Alternatives ) ) ;
    public final void ruleRuleContent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:616:2: ( ( ( rule__RuleContent__Alternatives ) ) )
            // InternalParser.g:617:2: ( ( rule__RuleContent__Alternatives ) )
            {
            // InternalParser.g:617:2: ( ( rule__RuleContent__Alternatives ) )
            // InternalParser.g:618:3: ( rule__RuleContent__Alternatives )
            {
             before(grammarAccess.getRuleContentAccess().getAlternatives()); 
            // InternalParser.g:619:3: ( rule__RuleContent__Alternatives )
            // InternalParser.g:619:4: rule__RuleContent__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__RuleContent__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRuleContentAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRuleContent"


    // $ANTLR start "entryRuleRulePart"
    // InternalParser.g:628:1: entryRuleRulePart : ruleRulePart EOF ;
    public final void entryRuleRulePart() throws RecognitionException {
        try {
            // InternalParser.g:629:1: ( ruleRulePart EOF )
            // InternalParser.g:630:1: ruleRulePart EOF
            {
             before(grammarAccess.getRulePartRule()); 
            pushFollow(FOLLOW_1);
            ruleRulePart();

            state._fsp--;

             after(grammarAccess.getRulePartRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRulePart"


    // $ANTLR start "ruleRulePart"
    // InternalParser.g:637:1: ruleRulePart : ( ( rule__RulePart__ContentAssignment )* ) ;
    public final void ruleRulePart() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:641:2: ( ( ( rule__RulePart__ContentAssignment )* ) )
            // InternalParser.g:642:2: ( ( rule__RulePart__ContentAssignment )* )
            {
            // InternalParser.g:642:2: ( ( rule__RulePart__ContentAssignment )* )
            // InternalParser.g:643:3: ( rule__RulePart__ContentAssignment )*
            {
             before(grammarAccess.getRulePartAccess().getContentAssignment()); 
            // InternalParser.g:644:3: ( rule__RulePart__ContentAssignment )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=RULE_ID && LA2_0<=RULE_STRING)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalParser.g:644:4: rule__RulePart__ContentAssignment
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__RulePart__ContentAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getRulePartAccess().getContentAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRulePart"


    // $ANTLR start "rulePrecedenceType"
    // InternalParser.g:653:1: rulePrecedenceType : ( ( rule__PrecedenceType__Alternatives ) ) ;
    public final void rulePrecedenceType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:657:1: ( ( ( rule__PrecedenceType__Alternatives ) ) )
            // InternalParser.g:658:2: ( ( rule__PrecedenceType__Alternatives ) )
            {
            // InternalParser.g:658:2: ( ( rule__PrecedenceType__Alternatives ) )
            // InternalParser.g:659:3: ( rule__PrecedenceType__Alternatives )
            {
             before(grammarAccess.getPrecedenceTypeAccess().getAlternatives()); 
            // InternalParser.g:660:3: ( rule__PrecedenceType__Alternatives )
            // InternalParser.g:660:4: rule__PrecedenceType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__PrecedenceType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPrecedenceTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrecedenceType"


    // $ANTLR start "rule__DefinedToken__Alternatives"
    // InternalParser.g:668:1: rule__DefinedToken__Alternatives : ( ( ( rule__DefinedToken__Group_0__0 ) ) | ( ( rule__DefinedToken__ExtraAssignment_1 ) ) | ( RULE_WS ) );
    public final void rule__DefinedToken__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:672:1: ( ( ( rule__DefinedToken__Group_0__0 ) ) | ( ( rule__DefinedToken__ExtraAssignment_1 ) ) | ( RULE_WS ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case RULE_STRING:
                {
                alt3=1;
                }
                break;
            case RULE_INT:
                {
                alt3=2;
                }
                break;
            case RULE_WS:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalParser.g:673:2: ( ( rule__DefinedToken__Group_0__0 ) )
                    {
                    // InternalParser.g:673:2: ( ( rule__DefinedToken__Group_0__0 ) )
                    // InternalParser.g:674:3: ( rule__DefinedToken__Group_0__0 )
                    {
                     before(grammarAccess.getDefinedTokenAccess().getGroup_0()); 
                    // InternalParser.g:675:3: ( rule__DefinedToken__Group_0__0 )
                    // InternalParser.g:675:4: rule__DefinedToken__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DefinedToken__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDefinedTokenAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalParser.g:679:2: ( ( rule__DefinedToken__ExtraAssignment_1 ) )
                    {
                    // InternalParser.g:679:2: ( ( rule__DefinedToken__ExtraAssignment_1 ) )
                    // InternalParser.g:680:3: ( rule__DefinedToken__ExtraAssignment_1 )
                    {
                     before(grammarAccess.getDefinedTokenAccess().getExtraAssignment_1()); 
                    // InternalParser.g:681:3: ( rule__DefinedToken__ExtraAssignment_1 )
                    // InternalParser.g:681:4: rule__DefinedToken__ExtraAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__DefinedToken__ExtraAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getDefinedTokenAccess().getExtraAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalParser.g:685:2: ( RULE_WS )
                    {
                    // InternalParser.g:685:2: ( RULE_WS )
                    // InternalParser.g:686:3: RULE_WS
                    {
                     before(grammarAccess.getDefinedTokenAccess().getWSTerminalRuleCall_2()); 
                    match(input,RULE_WS,FOLLOW_2); 
                     after(grammarAccess.getDefinedTokenAccess().getWSTerminalRuleCall_2()); 

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
    // $ANTLR end "rule__DefinedToken__Alternatives"


    // $ANTLR start "rule__DefinedToken__NameAlternatives_0_0_0"
    // InternalParser.g:695:1: rule__DefinedToken__NameAlternatives_0_0_0 : ( ( RULE_ID ) | ( RULE_STRING ) );
    public final void rule__DefinedToken__NameAlternatives_0_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:699:1: ( ( RULE_ID ) | ( RULE_STRING ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_STRING) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalParser.g:700:2: ( RULE_ID )
                    {
                    // InternalParser.g:700:2: ( RULE_ID )
                    // InternalParser.g:701:3: RULE_ID
                    {
                     before(grammarAccess.getDefinedTokenAccess().getNameIDTerminalRuleCall_0_0_0_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getDefinedTokenAccess().getNameIDTerminalRuleCall_0_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalParser.g:706:2: ( RULE_STRING )
                    {
                    // InternalParser.g:706:2: ( RULE_STRING )
                    // InternalParser.g:707:3: RULE_STRING
                    {
                     before(grammarAccess.getDefinedTokenAccess().getNameSTRINGTerminalRuleCall_0_0_0_1()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getDefinedTokenAccess().getNameSTRINGTerminalRuleCall_0_0_0_1()); 

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
    // $ANTLR end "rule__DefinedToken__NameAlternatives_0_0_0"


    // $ANTLR start "rule__CodeBlock__Alternatives"
    // InternalParser.g:716:1: rule__CodeBlock__Alternatives : ( ( ruleCodeWall ) | ( ( rule__CodeBlock__Group_1__0 ) ) );
    public final void rule__CodeBlock__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:720:1: ( ( ruleCodeWall ) | ( ( rule__CodeBlock__Group_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=RULE_WS && LA5_0<=RULE_INT)||(LA5_0>=11 && LA5_0<=30)) ) {
                alt5=1;
            }
            else if ( (LA5_0==39) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalParser.g:721:2: ( ruleCodeWall )
                    {
                    // InternalParser.g:721:2: ( ruleCodeWall )
                    // InternalParser.g:722:3: ruleCodeWall
                    {
                     before(grammarAccess.getCodeBlockAccess().getCodeWallParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleCodeWall();

                    state._fsp--;

                     after(grammarAccess.getCodeBlockAccess().getCodeWallParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalParser.g:727:2: ( ( rule__CodeBlock__Group_1__0 ) )
                    {
                    // InternalParser.g:727:2: ( ( rule__CodeBlock__Group_1__0 ) )
                    // InternalParser.g:728:3: ( rule__CodeBlock__Group_1__0 )
                    {
                     before(grammarAccess.getCodeBlockAccess().getGroup_1()); 
                    // InternalParser.g:729:3: ( rule__CodeBlock__Group_1__0 )
                    // InternalParser.g:729:4: rule__CodeBlock__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CodeBlock__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCodeBlockAccess().getGroup_1()); 

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
    // $ANTLR end "rule__CodeBlock__Alternatives"


    // $ANTLR start "rule__CodeWall__Alternatives"
    // InternalParser.g:737:1: rule__CodeWall__Alternatives : ( ( RULE_ID ) | ( RULE_INT ) | ( RULE_STRING ) | ( RULE_WS ) | ( '+' ) | ( '-' ) | ( '(' ) | ( ')' ) | ( '*' ) | ( '.' ) | ( '/' ) | ( '\\\\' ) | ( '|' ) | ( '?' ) | ( '>' ) | ( '<' ) | ( '#' ) | ( '$' ) | ( '%' ) | ( ';' ) | ( ':' ) | ( '!' ) | ( '=' ) | ( ',' ) );
    public final void rule__CodeWall__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:741:1: ( ( RULE_ID ) | ( RULE_INT ) | ( RULE_STRING ) | ( RULE_WS ) | ( '+' ) | ( '-' ) | ( '(' ) | ( ')' ) | ( '*' ) | ( '.' ) | ( '/' ) | ( '\\\\' ) | ( '|' ) | ( '?' ) | ( '>' ) | ( '<' ) | ( '#' ) | ( '$' ) | ( '%' ) | ( ';' ) | ( ':' ) | ( '!' ) | ( '=' ) | ( ',' ) )
            int alt6=24;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt6=1;
                }
                break;
            case RULE_INT:
                {
                alt6=2;
                }
                break;
            case RULE_STRING:
                {
                alt6=3;
                }
                break;
            case RULE_WS:
                {
                alt6=4;
                }
                break;
            case 11:
                {
                alt6=5;
                }
                break;
            case 12:
                {
                alt6=6;
                }
                break;
            case 13:
                {
                alt6=7;
                }
                break;
            case 14:
                {
                alt6=8;
                }
                break;
            case 15:
                {
                alt6=9;
                }
                break;
            case 16:
                {
                alt6=10;
                }
                break;
            case 17:
                {
                alt6=11;
                }
                break;
            case 18:
                {
                alt6=12;
                }
                break;
            case 19:
                {
                alt6=13;
                }
                break;
            case 20:
                {
                alt6=14;
                }
                break;
            case 21:
                {
                alt6=15;
                }
                break;
            case 22:
                {
                alt6=16;
                }
                break;
            case 23:
                {
                alt6=17;
                }
                break;
            case 24:
                {
                alt6=18;
                }
                break;
            case 25:
                {
                alt6=19;
                }
                break;
            case 26:
                {
                alt6=20;
                }
                break;
            case 27:
                {
                alt6=21;
                }
                break;
            case 28:
                {
                alt6=22;
                }
                break;
            case 29:
                {
                alt6=23;
                }
                break;
            case 30:
                {
                alt6=24;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalParser.g:742:2: ( RULE_ID )
                    {
                    // InternalParser.g:742:2: ( RULE_ID )
                    // InternalParser.g:743:3: RULE_ID
                    {
                     before(grammarAccess.getCodeWallAccess().getIDTerminalRuleCall_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getCodeWallAccess().getIDTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalParser.g:748:2: ( RULE_INT )
                    {
                    // InternalParser.g:748:2: ( RULE_INT )
                    // InternalParser.g:749:3: RULE_INT
                    {
                     before(grammarAccess.getCodeWallAccess().getINTTerminalRuleCall_1()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getCodeWallAccess().getINTTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalParser.g:754:2: ( RULE_STRING )
                    {
                    // InternalParser.g:754:2: ( RULE_STRING )
                    // InternalParser.g:755:3: RULE_STRING
                    {
                     before(grammarAccess.getCodeWallAccess().getSTRINGTerminalRuleCall_2()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getCodeWallAccess().getSTRINGTerminalRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalParser.g:760:2: ( RULE_WS )
                    {
                    // InternalParser.g:760:2: ( RULE_WS )
                    // InternalParser.g:761:3: RULE_WS
                    {
                     before(grammarAccess.getCodeWallAccess().getWSTerminalRuleCall_3()); 
                    match(input,RULE_WS,FOLLOW_2); 
                     after(grammarAccess.getCodeWallAccess().getWSTerminalRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalParser.g:766:2: ( '+' )
                    {
                    // InternalParser.g:766:2: ( '+' )
                    // InternalParser.g:767:3: '+'
                    {
                     before(grammarAccess.getCodeWallAccess().getPlusSignKeyword_4()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getCodeWallAccess().getPlusSignKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalParser.g:772:2: ( '-' )
                    {
                    // InternalParser.g:772:2: ( '-' )
                    // InternalParser.g:773:3: '-'
                    {
                     before(grammarAccess.getCodeWallAccess().getHyphenMinusKeyword_5()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getCodeWallAccess().getHyphenMinusKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalParser.g:778:2: ( '(' )
                    {
                    // InternalParser.g:778:2: ( '(' )
                    // InternalParser.g:779:3: '('
                    {
                     before(grammarAccess.getCodeWallAccess().getLeftParenthesisKeyword_6()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getCodeWallAccess().getLeftParenthesisKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalParser.g:784:2: ( ')' )
                    {
                    // InternalParser.g:784:2: ( ')' )
                    // InternalParser.g:785:3: ')'
                    {
                     before(grammarAccess.getCodeWallAccess().getRightParenthesisKeyword_7()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getCodeWallAccess().getRightParenthesisKeyword_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalParser.g:790:2: ( '*' )
                    {
                    // InternalParser.g:790:2: ( '*' )
                    // InternalParser.g:791:3: '*'
                    {
                     before(grammarAccess.getCodeWallAccess().getAsteriskKeyword_8()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getCodeWallAccess().getAsteriskKeyword_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalParser.g:796:2: ( '.' )
                    {
                    // InternalParser.g:796:2: ( '.' )
                    // InternalParser.g:797:3: '.'
                    {
                     before(grammarAccess.getCodeWallAccess().getFullStopKeyword_9()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getCodeWallAccess().getFullStopKeyword_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalParser.g:802:2: ( '/' )
                    {
                    // InternalParser.g:802:2: ( '/' )
                    // InternalParser.g:803:3: '/'
                    {
                     before(grammarAccess.getCodeWallAccess().getSolidusKeyword_10()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getCodeWallAccess().getSolidusKeyword_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalParser.g:808:2: ( '\\\\' )
                    {
                    // InternalParser.g:808:2: ( '\\\\' )
                    // InternalParser.g:809:3: '\\\\'
                    {
                     before(grammarAccess.getCodeWallAccess().getReverseSolidusKeyword_11()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getCodeWallAccess().getReverseSolidusKeyword_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalParser.g:814:2: ( '|' )
                    {
                    // InternalParser.g:814:2: ( '|' )
                    // InternalParser.g:815:3: '|'
                    {
                     before(grammarAccess.getCodeWallAccess().getVerticalLineKeyword_12()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getCodeWallAccess().getVerticalLineKeyword_12()); 

                    }


                    }
                    break;
                case 14 :
                    // InternalParser.g:820:2: ( '?' )
                    {
                    // InternalParser.g:820:2: ( '?' )
                    // InternalParser.g:821:3: '?'
                    {
                     before(grammarAccess.getCodeWallAccess().getQuestionMarkKeyword_13()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getCodeWallAccess().getQuestionMarkKeyword_13()); 

                    }


                    }
                    break;
                case 15 :
                    // InternalParser.g:826:2: ( '>' )
                    {
                    // InternalParser.g:826:2: ( '>' )
                    // InternalParser.g:827:3: '>'
                    {
                     before(grammarAccess.getCodeWallAccess().getGreaterThanSignKeyword_14()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getCodeWallAccess().getGreaterThanSignKeyword_14()); 

                    }


                    }
                    break;
                case 16 :
                    // InternalParser.g:832:2: ( '<' )
                    {
                    // InternalParser.g:832:2: ( '<' )
                    // InternalParser.g:833:3: '<'
                    {
                     before(grammarAccess.getCodeWallAccess().getLessThanSignKeyword_15()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getCodeWallAccess().getLessThanSignKeyword_15()); 

                    }


                    }
                    break;
                case 17 :
                    // InternalParser.g:838:2: ( '#' )
                    {
                    // InternalParser.g:838:2: ( '#' )
                    // InternalParser.g:839:3: '#'
                    {
                     before(grammarAccess.getCodeWallAccess().getNumberSignKeyword_16()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getCodeWallAccess().getNumberSignKeyword_16()); 

                    }


                    }
                    break;
                case 18 :
                    // InternalParser.g:844:2: ( '$' )
                    {
                    // InternalParser.g:844:2: ( '$' )
                    // InternalParser.g:845:3: '$'
                    {
                     before(grammarAccess.getCodeWallAccess().getDollarSignKeyword_17()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getCodeWallAccess().getDollarSignKeyword_17()); 

                    }


                    }
                    break;
                case 19 :
                    // InternalParser.g:850:2: ( '%' )
                    {
                    // InternalParser.g:850:2: ( '%' )
                    // InternalParser.g:851:3: '%'
                    {
                     before(grammarAccess.getCodeWallAccess().getPercentSignKeyword_18()); 
                    match(input,25,FOLLOW_2); 
                     after(grammarAccess.getCodeWallAccess().getPercentSignKeyword_18()); 

                    }


                    }
                    break;
                case 20 :
                    // InternalParser.g:856:2: ( ';' )
                    {
                    // InternalParser.g:856:2: ( ';' )
                    // InternalParser.g:857:3: ';'
                    {
                     before(grammarAccess.getCodeWallAccess().getSemicolonKeyword_19()); 
                    match(input,26,FOLLOW_2); 
                     after(grammarAccess.getCodeWallAccess().getSemicolonKeyword_19()); 

                    }


                    }
                    break;
                case 21 :
                    // InternalParser.g:862:2: ( ':' )
                    {
                    // InternalParser.g:862:2: ( ':' )
                    // InternalParser.g:863:3: ':'
                    {
                     before(grammarAccess.getCodeWallAccess().getColonKeyword_20()); 
                    match(input,27,FOLLOW_2); 
                     after(grammarAccess.getCodeWallAccess().getColonKeyword_20()); 

                    }


                    }
                    break;
                case 22 :
                    // InternalParser.g:868:2: ( '!' )
                    {
                    // InternalParser.g:868:2: ( '!' )
                    // InternalParser.g:869:3: '!'
                    {
                     before(grammarAccess.getCodeWallAccess().getExclamationMarkKeyword_21()); 
                    match(input,28,FOLLOW_2); 
                     after(grammarAccess.getCodeWallAccess().getExclamationMarkKeyword_21()); 

                    }


                    }
                    break;
                case 23 :
                    // InternalParser.g:874:2: ( '=' )
                    {
                    // InternalParser.g:874:2: ( '=' )
                    // InternalParser.g:875:3: '='
                    {
                     before(grammarAccess.getCodeWallAccess().getEqualsSignKeyword_22()); 
                    match(input,29,FOLLOW_2); 
                     after(grammarAccess.getCodeWallAccess().getEqualsSignKeyword_22()); 

                    }


                    }
                    break;
                case 24 :
                    // InternalParser.g:880:2: ( ',' )
                    {
                    // InternalParser.g:880:2: ( ',' )
                    // InternalParser.g:881:3: ','
                    {
                     before(grammarAccess.getCodeWallAccess().getCommaKeyword_23()); 
                    match(input,30,FOLLOW_2); 
                     after(grammarAccess.getCodeWallAccess().getCommaKeyword_23()); 

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
    // $ANTLR end "rule__CodeWall__Alternatives"


    // $ANTLR start "rule__GrammarRules__Alternatives_0"
    // InternalParser.g:890:1: rule__GrammarRules__Alternatives_0 : ( ( 'RULE' ) | ( 'RULES' ) );
    public final void rule__GrammarRules__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:894:1: ( ( 'RULE' ) | ( 'RULES' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==31) ) {
                alt7=1;
            }
            else if ( (LA7_0==32) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalParser.g:895:2: ( 'RULE' )
                    {
                    // InternalParser.g:895:2: ( 'RULE' )
                    // InternalParser.g:896:3: 'RULE'
                    {
                     before(grammarAccess.getGrammarRulesAccess().getRULEKeyword_0_0()); 
                    match(input,31,FOLLOW_2); 
                     after(grammarAccess.getGrammarRulesAccess().getRULEKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalParser.g:901:2: ( 'RULES' )
                    {
                    // InternalParser.g:901:2: ( 'RULES' )
                    // InternalParser.g:902:3: 'RULES'
                    {
                     before(grammarAccess.getGrammarRulesAccess().getRULESKeyword_0_1()); 
                    match(input,32,FOLLOW_2); 
                     after(grammarAccess.getGrammarRulesAccess().getRULESKeyword_0_1()); 

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
    // $ANTLR end "rule__GrammarRules__Alternatives_0"


    // $ANTLR start "rule__RuleContent__Alternatives"
    // InternalParser.g:911:1: rule__RuleContent__Alternatives : ( ( ( rule__RuleContent__RegexAssignment_0 ) ) | ( ( rule__RuleContent__RefAssignment_1 ) ) );
    public final void rule__RuleContent__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:915:1: ( ( ( rule__RuleContent__RegexAssignment_0 ) ) | ( ( rule__RuleContent__RefAssignment_1 ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_STRING) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_ID) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalParser.g:916:2: ( ( rule__RuleContent__RegexAssignment_0 ) )
                    {
                    // InternalParser.g:916:2: ( ( rule__RuleContent__RegexAssignment_0 ) )
                    // InternalParser.g:917:3: ( rule__RuleContent__RegexAssignment_0 )
                    {
                     before(grammarAccess.getRuleContentAccess().getRegexAssignment_0()); 
                    // InternalParser.g:918:3: ( rule__RuleContent__RegexAssignment_0 )
                    // InternalParser.g:918:4: rule__RuleContent__RegexAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RuleContent__RegexAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRuleContentAccess().getRegexAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalParser.g:922:2: ( ( rule__RuleContent__RefAssignment_1 ) )
                    {
                    // InternalParser.g:922:2: ( ( rule__RuleContent__RefAssignment_1 ) )
                    // InternalParser.g:923:3: ( rule__RuleContent__RefAssignment_1 )
                    {
                     before(grammarAccess.getRuleContentAccess().getRefAssignment_1()); 
                    // InternalParser.g:924:3: ( rule__RuleContent__RefAssignment_1 )
                    // InternalParser.g:924:4: rule__RuleContent__RefAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__RuleContent__RefAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getRuleContentAccess().getRefAssignment_1()); 

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
    // $ANTLR end "rule__RuleContent__Alternatives"


    // $ANTLR start "rule__PrecedenceType__Alternatives"
    // InternalParser.g:932:1: rule__PrecedenceType__Alternatives : ( ( ( 'NONE' ) ) | ( ( 'LEFT' ) ) | ( ( 'RIGHT' ) ) );
    public final void rule__PrecedenceType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:936:1: ( ( ( 'NONE' ) ) | ( ( 'LEFT' ) ) | ( ( 'RIGHT' ) ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt9=1;
                }
                break;
            case 34:
                {
                alt9=2;
                }
                break;
            case 35:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalParser.g:937:2: ( ( 'NONE' ) )
                    {
                    // InternalParser.g:937:2: ( ( 'NONE' ) )
                    // InternalParser.g:938:3: ( 'NONE' )
                    {
                     before(grammarAccess.getPrecedenceTypeAccess().getNONEEnumLiteralDeclaration_0()); 
                    // InternalParser.g:939:3: ( 'NONE' )
                    // InternalParser.g:939:4: 'NONE'
                    {
                    match(input,33,FOLLOW_2); 

                    }

                     after(grammarAccess.getPrecedenceTypeAccess().getNONEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalParser.g:943:2: ( ( 'LEFT' ) )
                    {
                    // InternalParser.g:943:2: ( ( 'LEFT' ) )
                    // InternalParser.g:944:3: ( 'LEFT' )
                    {
                     before(grammarAccess.getPrecedenceTypeAccess().getLEFTEnumLiteralDeclaration_1()); 
                    // InternalParser.g:945:3: ( 'LEFT' )
                    // InternalParser.g:945:4: 'LEFT'
                    {
                    match(input,34,FOLLOW_2); 

                    }

                     after(grammarAccess.getPrecedenceTypeAccess().getLEFTEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalParser.g:949:2: ( ( 'RIGHT' ) )
                    {
                    // InternalParser.g:949:2: ( ( 'RIGHT' ) )
                    // InternalParser.g:950:3: ( 'RIGHT' )
                    {
                     before(grammarAccess.getPrecedenceTypeAccess().getRIGHTEnumLiteralDeclaration_2()); 
                    // InternalParser.g:951:3: ( 'RIGHT' )
                    // InternalParser.g:951:4: 'RIGHT'
                    {
                    match(input,35,FOLLOW_2); 

                    }

                     after(grammarAccess.getPrecedenceTypeAccess().getRIGHTEnumLiteralDeclaration_2()); 

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
    // $ANTLR end "rule__PrecedenceType__Alternatives"


    // $ANTLR start "rule__ParserModel__Group__0"
    // InternalParser.g:959:1: rule__ParserModel__Group__0 : rule__ParserModel__Group__0__Impl rule__ParserModel__Group__1 ;
    public final void rule__ParserModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:963:1: ( rule__ParserModel__Group__0__Impl rule__ParserModel__Group__1 )
            // InternalParser.g:964:2: rule__ParserModel__Group__0__Impl rule__ParserModel__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__ParserModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParserModel__Group__1();

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
    // $ANTLR end "rule__ParserModel__Group__0"


    // $ANTLR start "rule__ParserModel__Group__0__Impl"
    // InternalParser.g:971:1: rule__ParserModel__Group__0__Impl : ( ( rule__ParserModel__UnorderedGroup_0 ) ) ;
    public final void rule__ParserModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:975:1: ( ( ( rule__ParserModel__UnorderedGroup_0 ) ) )
            // InternalParser.g:976:1: ( ( rule__ParserModel__UnorderedGroup_0 ) )
            {
            // InternalParser.g:976:1: ( ( rule__ParserModel__UnorderedGroup_0 ) )
            // InternalParser.g:977:2: ( rule__ParserModel__UnorderedGroup_0 )
            {
             before(grammarAccess.getParserModelAccess().getUnorderedGroup_0()); 
            // InternalParser.g:978:2: ( rule__ParserModel__UnorderedGroup_0 )
            // InternalParser.g:978:3: rule__ParserModel__UnorderedGroup_0
            {
            pushFollow(FOLLOW_2);
            rule__ParserModel__UnorderedGroup_0();

            state._fsp--;


            }

             after(grammarAccess.getParserModelAccess().getUnorderedGroup_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParserModel__Group__0__Impl"


    // $ANTLR start "rule__ParserModel__Group__1"
    // InternalParser.g:986:1: rule__ParserModel__Group__1 : rule__ParserModel__Group__1__Impl ;
    public final void rule__ParserModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:990:1: ( rule__ParserModel__Group__1__Impl )
            // InternalParser.g:991:2: rule__ParserModel__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParserModel__Group__1__Impl();

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
    // $ANTLR end "rule__ParserModel__Group__1"


    // $ANTLR start "rule__ParserModel__Group__1__Impl"
    // InternalParser.g:997:1: rule__ParserModel__Group__1__Impl : ( ( rule__ParserModel__RulesAssignment_1 ) ) ;
    public final void rule__ParserModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:1001:1: ( ( ( rule__ParserModel__RulesAssignment_1 ) ) )
            // InternalParser.g:1002:1: ( ( rule__ParserModel__RulesAssignment_1 ) )
            {
            // InternalParser.g:1002:1: ( ( rule__ParserModel__RulesAssignment_1 ) )
            // InternalParser.g:1003:2: ( rule__ParserModel__RulesAssignment_1 )
            {
             before(grammarAccess.getParserModelAccess().getRulesAssignment_1()); 
            // InternalParser.g:1004:2: ( rule__ParserModel__RulesAssignment_1 )
            // InternalParser.g:1004:3: rule__ParserModel__RulesAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ParserModel__RulesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getParserModelAccess().getRulesAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParserModel__Group__1__Impl"


    // $ANTLR start "rule__ScannerName__Group__0"
    // InternalParser.g:1013:1: rule__ScannerName__Group__0 : rule__ScannerName__Group__0__Impl rule__ScannerName__Group__1 ;
    public final void rule__ScannerName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:1017:1: ( rule__ScannerName__Group__0__Impl rule__ScannerName__Group__1 )
            // InternalParser.g:1018:2: rule__ScannerName__Group__0__Impl rule__ScannerName__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__ScannerName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ScannerName__Group__1();

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
    // $ANTLR end "rule__ScannerName__Group__0"


    // $ANTLR start "rule__ScannerName__Group__0__Impl"
    // InternalParser.g:1025:1: rule__ScannerName__Group__0__Impl : ( 'SCANNER' ) ;
    public final void rule__ScannerName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:1029:1: ( ( 'SCANNER' ) )
            // InternalParser.g:1030:1: ( 'SCANNER' )
            {
            // InternalParser.g:1030:1: ( 'SCANNER' )
            // InternalParser.g:1031:2: 'SCANNER'
            {
             before(grammarAccess.getScannerNameAccess().getSCANNERKeyword_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getScannerNameAccess().getSCANNERKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScannerName__Group__0__Impl"


    // $ANTLR start "rule__ScannerName__Group__1"
    // InternalParser.g:1040:1: rule__ScannerName__Group__1 : rule__ScannerName__Group__1__Impl ;
    public final void rule__ScannerName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:1044:1: ( rule__ScannerName__Group__1__Impl )
            // InternalParser.g:1045:2: rule__ScannerName__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ScannerName__Group__1__Impl();

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
    // $ANTLR end "rule__ScannerName__Group__1"


    // $ANTLR start "rule__ScannerName__Group__1__Impl"
    // InternalParser.g:1051:1: rule__ScannerName__Group__1__Impl : ( ( rule__ScannerName__NameAssignment_1 )? ) ;
    public final void rule__ScannerName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:1055:1: ( ( ( rule__ScannerName__NameAssignment_1 )? ) )
            // InternalParser.g:1056:1: ( ( rule__ScannerName__NameAssignment_1 )? )
            {
            // InternalParser.g:1056:1: ( ( rule__ScannerName__NameAssignment_1 )? )
            // InternalParser.g:1057:2: ( rule__ScannerName__NameAssignment_1 )?
            {
             before(grammarAccess.getScannerNameAccess().getNameAssignment_1()); 
            // InternalParser.g:1058:2: ( rule__ScannerName__NameAssignment_1 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalParser.g:1058:3: rule__ScannerName__NameAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__ScannerName__NameAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getScannerNameAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScannerName__Group__1__Impl"


    // $ANTLR start "rule__ParserName__Group__0"
    // InternalParser.g:1067:1: rule__ParserName__Group__0 : rule__ParserName__Group__0__Impl rule__ParserName__Group__1 ;
    public final void rule__ParserName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:1071:1: ( rule__ParserName__Group__0__Impl rule__ParserName__Group__1 )
            // InternalParser.g:1072:2: rule__ParserName__Group__0__Impl rule__ParserName__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__ParserName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParserName__Group__1();

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
    // $ANTLR end "rule__ParserName__Group__0"


    // $ANTLR start "rule__ParserName__Group__0__Impl"
    // InternalParser.g:1079:1: rule__ParserName__Group__0__Impl : ( 'PARSER' ) ;
    public final void rule__ParserName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:1083:1: ( ( 'PARSER' ) )
            // InternalParser.g:1084:1: ( 'PARSER' )
            {
            // InternalParser.g:1084:1: ( 'PARSER' )
            // InternalParser.g:1085:2: 'PARSER'
            {
             before(grammarAccess.getParserNameAccess().getPARSERKeyword_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getParserNameAccess().getPARSERKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParserName__Group__0__Impl"


    // $ANTLR start "rule__ParserName__Group__1"
    // InternalParser.g:1094:1: rule__ParserName__Group__1 : rule__ParserName__Group__1__Impl ;
    public final void rule__ParserName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:1098:1: ( rule__ParserName__Group__1__Impl )
            // InternalParser.g:1099:2: rule__ParserName__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParserName__Group__1__Impl();

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
    // $ANTLR end "rule__ParserName__Group__1"


    // $ANTLR start "rule__ParserName__Group__1__Impl"
    // InternalParser.g:1105:1: rule__ParserName__Group__1__Impl : ( ( rule__ParserName__NameAssignment_1 )? ) ;
    public final void rule__ParserName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:1109:1: ( ( ( rule__ParserName__NameAssignment_1 )? ) )
            // InternalParser.g:1110:1: ( ( rule__ParserName__NameAssignment_1 )? )
            {
            // InternalParser.g:1110:1: ( ( rule__ParserName__NameAssignment_1 )? )
            // InternalParser.g:1111:2: ( rule__ParserName__NameAssignment_1 )?
            {
             before(grammarAccess.getParserNameAccess().getNameAssignment_1()); 
            // InternalParser.g:1112:2: ( rule__ParserName__NameAssignment_1 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalParser.g:1112:3: rule__ParserName__NameAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__ParserName__NameAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getParserNameAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParserName__Group__1__Impl"


    // $ANTLR start "rule__Import__Group__0"
    // InternalParser.g:1121:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:1125:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // InternalParser.g:1126:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Import__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Import__Group__1();

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
    // $ANTLR end "rule__Import__Group__0"


    // $ANTLR start "rule__Import__Group__0__Impl"
    // InternalParser.g:1133:1: rule__Import__Group__0__Impl : ( 'IMPORT' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:1137:1: ( ( 'IMPORT' ) )
            // InternalParser.g:1138:1: ( 'IMPORT' )
            {
            // InternalParser.g:1138:1: ( 'IMPORT' )
            // InternalParser.g:1139:2: 'IMPORT'
            {
             before(grammarAccess.getImportAccess().getIMPORTKeyword_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getImportAccess().getIMPORTKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__0__Impl"


    // $ANTLR start "rule__Import__Group__1"
    // InternalParser.g:1148:1: rule__Import__Group__1 : rule__Import__Group__1__Impl rule__Import__Group__2 ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:1152:1: ( rule__Import__Group__1__Impl rule__Import__Group__2 )
            // InternalParser.g:1153:2: rule__Import__Group__1__Impl rule__Import__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Import__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Import__Group__2();

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
    // $ANTLR end "rule__Import__Group__1"


    // $ANTLR start "rule__Import__Group__1__Impl"
    // InternalParser.g:1160:1: rule__Import__Group__1__Impl : ( '{' ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:1164:1: ( ( '{' ) )
            // InternalParser.g:1165:1: ( '{' )
            {
            // InternalParser.g:1165:1: ( '{' )
            // InternalParser.g:1166:2: '{'
            {
             before(grammarAccess.getImportAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getImportAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__1__Impl"


    // $ANTLR start "rule__Import__Group__2"
    // InternalParser.g:1175:1: rule__Import__Group__2 : rule__Import__Group__2__Impl rule__Import__Group__3 ;
    public final void rule__Import__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:1179:1: ( rule__Import__Group__2__Impl rule__Import__Group__3 )
            // InternalParser.g:1180:2: rule__Import__Group__2__Impl rule__Import__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__Import__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Import__Group__3();

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
    // $ANTLR end "rule__Import__Group__2"


    // $ANTLR start "rule__Import__Group__2__Impl"
    // InternalParser.g:1187:1: rule__Import__Group__2__Impl : ( ( rule__Import__ContentAssignment_2 ) ) ;
    public final void rule__Import__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:1191:1: ( ( ( rule__Import__ContentAssignment_2 ) ) )
            // InternalParser.g:1192:1: ( ( rule__Import__ContentAssignment_2 ) )
            {
            // InternalParser.g:1192:1: ( ( rule__Import__ContentAssignment_2 ) )
            // InternalParser.g:1193:2: ( rule__Import__ContentAssignment_2 )
            {
             before(grammarAccess.getImportAccess().getContentAssignment_2()); 
            // InternalParser.g:1194:2: ( rule__Import__ContentAssignment_2 )
            // InternalParser.g:1194:3: rule__Import__ContentAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Import__ContentAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getContentAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__2__Impl"


    // $ANTLR start "rule__Import__Group__3"
    // InternalParser.g:1202:1: rule__Import__Group__3 : rule__Import__Group__3__Impl ;
    public final void rule__Import__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:1206:1: ( rule__Import__Group__3__Impl )
            // InternalParser.g:1207:2: rule__Import__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Import__Group__3__Impl();

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
    // $ANTLR end "rule__Import__Group__3"


    // $ANTLR start "rule__Import__Group__3__Impl"
    // InternalParser.g:1213:1: rule__Import__Group__3__Impl : ( '}' ) ;
    public final void rule__Import__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:1217:1: ( ( '}' ) )
            // InternalParser.g:1218:1: ( '}' )
            {
            // InternalParser.g:1218:1: ( '}' )
            // InternalParser.g:1219:2: '}'
            {
             before(grammarAccess.getImportAccess().getRightCurlyBracketKeyword_3()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getImportAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__3__Impl"


    // $ANTLR start "rule__Export__Group__0"
    // InternalParser.g:1229:1: rule__Export__Group__0 : rule__Export__Group__0__Impl rule__Export__Group__1 ;
    public final void rule__Export__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:1233:1: ( rule__Export__Group__0__Impl rule__Export__Group__1 )
            // InternalParser.g:1234:2: rule__Export__Group__0__Impl rule__Export__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Export__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalParser.g:1241:1: rule__Export__Group__0__Impl : ( 'EXPORT' ) ;
    public final void rule__Export__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:1245:1: ( ( 'EXPORT' ) )
            // InternalParser.g:1246:1: ( 'EXPORT' )
            {
            // InternalParser.g:1246:1: ( 'EXPORT' )
            // InternalParser.g:1247:2: 'EXPORT'
            {
             before(grammarAccess.getExportAccess().getEXPORTKeyword_0()); 
            match(input,41,FOLLOW_2); 
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
    // InternalParser.g:1256:1: rule__Export__Group__1 : rule__Export__Group__1__Impl rule__Export__Group__2 ;
    public final void rule__Export__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:1260:1: ( rule__Export__Group__1__Impl rule__Export__Group__2 )
            // InternalParser.g:1261:2: rule__Export__Group__1__Impl rule__Export__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Export__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalParser.g:1268:1: rule__Export__Group__1__Impl : ( '{' ) ;
    public final void rule__Export__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:1272:1: ( ( '{' ) )
            // InternalParser.g:1273:1: ( '{' )
            {
            // InternalParser.g:1273:1: ( '{' )
            // InternalParser.g:1274:2: '{'
            {
             before(grammarAccess.getExportAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getExportAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
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
    // InternalParser.g:1283:1: rule__Export__Group__2 : rule__Export__Group__2__Impl rule__Export__Group__3 ;
    public final void rule__Export__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:1287:1: ( rule__Export__Group__2__Impl rule__Export__Group__3 )
            // InternalParser.g:1288:2: rule__Export__Group__2__Impl rule__Export__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__Export__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Export__Group__3();

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
    // InternalParser.g:1295:1: rule__Export__Group__2__Impl : ( ( rule__Export__ContentAssignment_2 ) ) ;
    public final void rule__Export__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:1299:1: ( ( ( rule__Export__ContentAssignment_2 ) ) )
            // InternalParser.g:1300:1: ( ( rule__Export__ContentAssignment_2 ) )
            {
            // InternalParser.g:1300:1: ( ( rule__Export__ContentAssignment_2 ) )
            // InternalParser.g:1301:2: ( rule__Export__ContentAssignment_2 )
            {
             before(grammarAccess.getExportAccess().getContentAssignment_2()); 
            // InternalParser.g:1302:2: ( rule__Export__ContentAssignment_2 )
            // InternalParser.g:1302:3: rule__Export__ContentAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Export__ContentAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getExportAccess().getContentAssignment_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__Export__Group__3"
    // InternalParser.g:1310:1: rule__Export__Group__3 : rule__Export__Group__3__Impl ;
    public final void rule__Export__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:1314:1: ( rule__Export__Group__3__Impl )
            // InternalParser.g:1315:2: rule__Export__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Export__Group__3__Impl();

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
    // $ANTLR end "rule__Export__Group__3"


    // $ANTLR start "rule__Export__Group__3__Impl"
    // InternalParser.g:1321:1: rule__Export__Group__3__Impl : ( '}' ) ;
    public final void rule__Export__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:1325:1: ( ( '}' ) )
            // InternalParser.g:1326:1: ( '}' )
            {
            // InternalParser.g:1326:1: ( '}' )
            // InternalParser.g:1327:2: '}'
            {
             before(grammarAccess.getExportAccess().getRightCurlyBracketKeyword_3()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getExportAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Export__Group__3__Impl"


    // $ANTLR start "rule__Global__Group__0"
    // InternalParser.g:1337:1: rule__Global__Group__0 : rule__Global__Group__0__Impl rule__Global__Group__1 ;
    public final void rule__Global__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:1341:1: ( rule__Global__Group__0__Impl rule__Global__Group__1 )
            // InternalParser.g:1342:2: rule__Global__Group__0__Impl rule__Global__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Global__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalParser.g:1349:1: rule__Global__Group__0__Impl : ( 'GLOBAL' ) ;
    public final void rule__Global__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:1353:1: ( ( 'GLOBAL' ) )
            // InternalParser.g:1354:1: ( 'GLOBAL' )
            {
            // InternalParser.g:1354:1: ( 'GLOBAL' )
            // InternalParser.g:1355:2: 'GLOBAL'
            {
             before(grammarAccess.getGlobalAccess().getGLOBALKeyword_0()); 
            match(input,42,FOLLOW_2); 
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
    // InternalParser.g:1364:1: rule__Global__Group__1 : rule__Global__Group__1__Impl rule__Global__Group__2 ;
    public final void rule__Global__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:1368:1: ( rule__Global__Group__1__Impl rule__Global__Group__2 )
            // InternalParser.g:1369:2: rule__Global__Group__1__Impl rule__Global__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Global__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalParser.g:1376:1: rule__Global__Group__1__Impl : ( '{' ) ;
    public final void rule__Global__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:1380:1: ( ( '{' ) )
            // InternalParser.g:1381:1: ( '{' )
            {
            // InternalParser.g:1381:1: ( '{' )
            // InternalParser.g:1382:2: '{'
            {
             before(grammarAccess.getGlobalAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getGlobalAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
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
    // InternalParser.g:1391:1: rule__Global__Group__2 : rule__Global__Group__2__Impl rule__Global__Group__3 ;
    public final void rule__Global__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:1395:1: ( rule__Global__Group__2__Impl rule__Global__Group__3 )
            // InternalParser.g:1396:2: rule__Global__Group__2__Impl rule__Global__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__Global__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Global__Group__3();

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
    // InternalParser.g:1403:1: rule__Global__Group__2__Impl : ( ( rule__Global__ContentAssignment_2 ) ) ;
    public final void rule__Global__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:1407:1: ( ( ( rule__Global__ContentAssignment_2 ) ) )
            // InternalParser.g:1408:1: ( ( rule__Global__ContentAssignment_2 ) )
            {
            // InternalParser.g:1408:1: ( ( rule__Global__ContentAssignment_2 ) )
            // InternalParser.g:1409:2: ( rule__Global__ContentAssignment_2 )
            {
             before(grammarAccess.getGlobalAccess().getContentAssignment_2()); 
            // InternalParser.g:1410:2: ( rule__Global__ContentAssignment_2 )
            // InternalParser.g:1410:3: rule__Global__ContentAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Global__ContentAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getGlobalAccess().getContentAssignment_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__Global__Group__3"
    // InternalParser.g:1418:1: rule__Global__Group__3 : rule__Global__Group__3__Impl ;
    public final void rule__Global__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:1422:1: ( rule__Global__Group__3__Impl )
            // InternalParser.g:1423:2: rule__Global__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Global__Group__3__Impl();

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
    // $ANTLR end "rule__Global__Group__3"


    // $ANTLR start "rule__Global__Group__3__Impl"
    // InternalParser.g:1429:1: rule__Global__Group__3__Impl : ( '}' ) ;
    public final void rule__Global__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:1433:1: ( ( '}' ) )
            // InternalParser.g:1434:1: ( '}' )
            {
            // InternalParser.g:1434:1: ( '}' )
            // InternalParser.g:1435:2: '}'
            {
             before(grammarAccess.getGlobalAccess().getRightCurlyBracketKeyword_3()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getGlobalAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Global__Group__3__Impl"


    // $ANTLR start "rule__Local__Group__0"
    // InternalParser.g:1445:1: rule__Local__Group__0 : rule__Local__Group__0__Impl rule__Local__Group__1 ;
    public final void rule__Local__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:1449:1: ( rule__Local__Group__0__Impl rule__Local__Group__1 )
            // InternalParser.g:1450:2: rule__Local__Group__0__Impl rule__Local__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Local__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalParser.g:1457:1: rule__Local__Group__0__Impl : ( 'LOCAL' ) ;
    public final void rule__Local__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:1461:1: ( ( 'LOCAL' ) )
            // InternalParser.g:1462:1: ( 'LOCAL' )
            {
            // InternalParser.g:1462:1: ( 'LOCAL' )
            // InternalParser.g:1463:2: 'LOCAL'
            {
             before(grammarAccess.getLocalAccess().getLOCALKeyword_0()); 
            match(input,43,FOLLOW_2); 
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
    // InternalParser.g:1472:1: rule__Local__Group__1 : rule__Local__Group__1__Impl rule__Local__Group__2 ;
    public final void rule__Local__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:1476:1: ( rule__Local__Group__1__Impl rule__Local__Group__2 )
            // InternalParser.g:1477:2: rule__Local__Group__1__Impl rule__Local__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Local__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalParser.g:1484:1: rule__Local__Group__1__Impl : ( '{' ) ;
    public final void rule__Local__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:1488:1: ( ( '{' ) )
            // InternalParser.g:1489:1: ( '{' )
            {
            // InternalParser.g:1489:1: ( '{' )
            // InternalParser.g:1490:2: '{'
            {
             before(grammarAccess.getLocalAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getLocalAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
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
    // InternalParser.g:1499:1: rule__Local__Group__2 : rule__Local__Group__2__Impl rule__Local__Group__3 ;
    public final void rule__Local__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:1503:1: ( rule__Local__Group__2__Impl rule__Local__Group__3 )
            // InternalParser.g:1504:2: rule__Local__Group__2__Impl rule__Local__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__Local__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Local__Group__3();

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
    // InternalParser.g:1511:1: rule__Local__Group__2__Impl : ( ( rule__Local__ContentAssignment_2 ) ) ;
    public final void rule__Local__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:1515:1: ( ( ( rule__Local__ContentAssignment_2 ) ) )
            // InternalParser.g:1516:1: ( ( rule__Local__ContentAssignment_2 ) )
            {
            // InternalParser.g:1516:1: ( ( rule__Local__ContentAssignment_2 ) )
            // InternalParser.g:1517:2: ( rule__Local__ContentAssignment_2 )
            {
             before(grammarAccess.getLocalAccess().getContentAssignment_2()); 
            // InternalParser.g:1518:2: ( rule__Local__ContentAssignment_2 )
            // InternalParser.g:1518:3: rule__Local__ContentAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Local__ContentAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLocalAccess().getContentAssignment_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__Local__Group__3"
    // InternalParser.g:1526:1: rule__Local__Group__3 : rule__Local__Group__3__Impl ;
    public final void rule__Local__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:1530:1: ( rule__Local__Group__3__Impl )
            // InternalParser.g:1531:2: rule__Local__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Local__Group__3__Impl();

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
    // $ANTLR end "rule__Local__Group__3"


    // $ANTLR start "rule__Local__Group__3__Impl"
    // InternalParser.g:1537:1: rule__Local__Group__3__Impl : ( '}' ) ;
    public final void rule__Local__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:1541:1: ( ( '}' ) )
            // InternalParser.g:1542:1: ( '}' )
            {
            // InternalParser.g:1542:1: ( '}' )
            // InternalParser.g:1543:2: '}'
            {
             before(grammarAccess.getLocalAccess().getRightCurlyBracketKeyword_3()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getLocalAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Local__Group__3__Impl"


    // $ANTLR start "rule__Begin__Group__0"
    // InternalParser.g:1553:1: rule__Begin__Group__0 : rule__Begin__Group__0__Impl rule__Begin__Group__1 ;
    public final void rule__Begin__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:1557:1: ( rule__Begin__Group__0__Impl rule__Begin__Group__1 )
            // InternalParser.g:1558:2: rule__Begin__Group__0__Impl rule__Begin__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Begin__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Begin__Group__1();

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
    // $ANTLR end "rule__Begin__Group__0"


    // $ANTLR start "rule__Begin__Group__0__Impl"
    // InternalParser.g:1565:1: rule__Begin__Group__0__Impl : ( 'BEGIN' ) ;
    public final void rule__Begin__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:1569:1: ( ( 'BEGIN' ) )
            // InternalParser.g:1570:1: ( 'BEGIN' )
            {
            // InternalParser.g:1570:1: ( 'BEGIN' )
            // InternalParser.g:1571:2: 'BEGIN'
            {
             before(grammarAccess.getBeginAccess().getBEGINKeyword_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getBeginAccess().getBEGINKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Begin__Group__0__Impl"


    // $ANTLR start "rule__Begin__Group__1"
    // InternalParser.g:1580:1: rule__Begin__Group__1 : rule__Begin__Group__1__Impl rule__Begin__Group__2 ;
    public final void rule__Begin__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:1584:1: ( rule__Begin__Group__1__Impl rule__Begin__Group__2 )
            // InternalParser.g:1585:2: rule__Begin__Group__1__Impl rule__Begin__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Begin__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Begin__Group__2();

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
    // $ANTLR end "rule__Begin__Group__1"


    // $ANTLR start "rule__Begin__Group__1__Impl"
    // InternalParser.g:1592:1: rule__Begin__Group__1__Impl : ( '{' ) ;
    public final void rule__Begin__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:1596:1: ( ( '{' ) )
            // InternalParser.g:1597:1: ( '{' )
            {
            // InternalParser.g:1597:1: ( '{' )
            // InternalParser.g:1598:2: '{'
            {
             before(grammarAccess.getBeginAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getBeginAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Begin__Group__1__Impl"


    // $ANTLR start "rule__Begin__Group__2"
    // InternalParser.g:1607:1: rule__Begin__Group__2 : rule__Begin__Group__2__Impl rule__Begin__Group__3 ;
    public final void rule__Begin__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:1611:1: ( rule__Begin__Group__2__Impl rule__Begin__Group__3 )
            // InternalParser.g:1612:2: rule__Begin__Group__2__Impl rule__Begin__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__Begin__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Begin__Group__3();

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
    // $ANTLR end "rule__Begin__Group__2"


    // $ANTLR start "rule__Begin__Group__2__Impl"
    // InternalParser.g:1619:1: rule__Begin__Group__2__Impl : ( ( rule__Begin__ContentAssignment_2 ) ) ;
    public final void rule__Begin__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:1623:1: ( ( ( rule__Begin__ContentAssignment_2 ) ) )
            // InternalParser.g:1624:1: ( ( rule__Begin__ContentAssignment_2 ) )
            {
            // InternalParser.g:1624:1: ( ( rule__Begin__ContentAssignment_2 ) )
            // InternalParser.g:1625:2: ( rule__Begin__ContentAssignment_2 )
            {
             before(grammarAccess.getBeginAccess().getContentAssignment_2()); 
            // InternalParser.g:1626:2: ( rule__Begin__ContentAssignment_2 )
            // InternalParser.g:1626:3: rule__Begin__ContentAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Begin__ContentAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getBeginAccess().getContentAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Begin__Group__2__Impl"


    // $ANTLR start "rule__Begin__Group__3"
    // InternalParser.g:1634:1: rule__Begin__Group__3 : rule__Begin__Group__3__Impl ;
    public final void rule__Begin__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:1638:1: ( rule__Begin__Group__3__Impl )
            // InternalParser.g:1639:2: rule__Begin__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Begin__Group__3__Impl();

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
    // $ANTLR end "rule__Begin__Group__3"


    // $ANTLR start "rule__Begin__Group__3__Impl"
    // InternalParser.g:1645:1: rule__Begin__Group__3__Impl : ( '}' ) ;
    public final void rule__Begin__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:1649:1: ( ( '}' ) )
            // InternalParser.g:1650:1: ( '}' )
            {
            // InternalParser.g:1650:1: ( '}' )
            // InternalParser.g:1651:2: '}'
            {
             before(grammarAccess.getBeginAccess().getRightCurlyBracketKeyword_3()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getBeginAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Begin__Group__3__Impl"


    // $ANTLR start "rule__Close__Group__0"
    // InternalParser.g:1661:1: rule__Close__Group__0 : rule__Close__Group__0__Impl rule__Close__Group__1 ;
    public final void rule__Close__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:1665:1: ( rule__Close__Group__0__Impl rule__Close__Group__1 )
            // InternalParser.g:1666:2: rule__Close__Group__0__Impl rule__Close__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Close__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Close__Group__1();

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
    // $ANTLR end "rule__Close__Group__0"


    // $ANTLR start "rule__Close__Group__0__Impl"
    // InternalParser.g:1673:1: rule__Close__Group__0__Impl : ( 'CLOSE' ) ;
    public final void rule__Close__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:1677:1: ( ( 'CLOSE' ) )
            // InternalParser.g:1678:1: ( 'CLOSE' )
            {
            // InternalParser.g:1678:1: ( 'CLOSE' )
            // InternalParser.g:1679:2: 'CLOSE'
            {
             before(grammarAccess.getCloseAccess().getCLOSEKeyword_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getCloseAccess().getCLOSEKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Close__Group__0__Impl"


    // $ANTLR start "rule__Close__Group__1"
    // InternalParser.g:1688:1: rule__Close__Group__1 : rule__Close__Group__1__Impl rule__Close__Group__2 ;
    public final void rule__Close__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:1692:1: ( rule__Close__Group__1__Impl rule__Close__Group__2 )
            // InternalParser.g:1693:2: rule__Close__Group__1__Impl rule__Close__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Close__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Close__Group__2();

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
    // $ANTLR end "rule__Close__Group__1"


    // $ANTLR start "rule__Close__Group__1__Impl"
    // InternalParser.g:1700:1: rule__Close__Group__1__Impl : ( '{' ) ;
    public final void rule__Close__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:1704:1: ( ( '{' ) )
            // InternalParser.g:1705:1: ( '{' )
            {
            // InternalParser.g:1705:1: ( '{' )
            // InternalParser.g:1706:2: '{'
            {
             before(grammarAccess.getCloseAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getCloseAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Close__Group__1__Impl"


    // $ANTLR start "rule__Close__Group__2"
    // InternalParser.g:1715:1: rule__Close__Group__2 : rule__Close__Group__2__Impl rule__Close__Group__3 ;
    public final void rule__Close__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:1719:1: ( rule__Close__Group__2__Impl rule__Close__Group__3 )
            // InternalParser.g:1720:2: rule__Close__Group__2__Impl rule__Close__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__Close__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Close__Group__3();

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
    // $ANTLR end "rule__Close__Group__2"


    // $ANTLR start "rule__Close__Group__2__Impl"
    // InternalParser.g:1727:1: rule__Close__Group__2__Impl : ( ( rule__Close__ContentAssignment_2 ) ) ;
    public final void rule__Close__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:1731:1: ( ( ( rule__Close__ContentAssignment_2 ) ) )
            // InternalParser.g:1732:1: ( ( rule__Close__ContentAssignment_2 ) )
            {
            // InternalParser.g:1732:1: ( ( rule__Close__ContentAssignment_2 ) )
            // InternalParser.g:1733:2: ( rule__Close__ContentAssignment_2 )
            {
             before(grammarAccess.getCloseAccess().getContentAssignment_2()); 
            // InternalParser.g:1734:2: ( rule__Close__ContentAssignment_2 )
            // InternalParser.g:1734:3: rule__Close__ContentAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Close__ContentAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCloseAccess().getContentAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Close__Group__2__Impl"


    // $ANTLR start "rule__Close__Group__3"
    // InternalParser.g:1742:1: rule__Close__Group__3 : rule__Close__Group__3__Impl ;
    public final void rule__Close__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:1746:1: ( rule__Close__Group__3__Impl )
            // InternalParser.g:1747:2: rule__Close__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Close__Group__3__Impl();

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
    // $ANTLR end "rule__Close__Group__3"


    // $ANTLR start "rule__Close__Group__3__Impl"
    // InternalParser.g:1753:1: rule__Close__Group__3__Impl : ( '}' ) ;
    public final void rule__Close__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:1757:1: ( ( '}' ) )
            // InternalParser.g:1758:1: ( '}' )
            {
            // InternalParser.g:1758:1: ( '}' )
            // InternalParser.g:1759:2: '}'
            {
             before(grammarAccess.getCloseAccess().getRightCurlyBracketKeyword_3()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getCloseAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Close__Group__3__Impl"


    // $ANTLR start "rule__Tokens__Group__0"
    // InternalParser.g:1769:1: rule__Tokens__Group__0 : rule__Tokens__Group__0__Impl rule__Tokens__Group__1 ;
    public final void rule__Tokens__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:1773:1: ( rule__Tokens__Group__0__Impl rule__Tokens__Group__1 )
            // InternalParser.g:1774:2: rule__Tokens__Group__0__Impl rule__Tokens__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Tokens__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tokens__Group__1();

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
    // $ANTLR end "rule__Tokens__Group__0"


    // $ANTLR start "rule__Tokens__Group__0__Impl"
    // InternalParser.g:1781:1: rule__Tokens__Group__0__Impl : ( 'TOKEN' ) ;
    public final void rule__Tokens__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:1785:1: ( ( 'TOKEN' ) )
            // InternalParser.g:1786:1: ( 'TOKEN' )
            {
            // InternalParser.g:1786:1: ( 'TOKEN' )
            // InternalParser.g:1787:2: 'TOKEN'
            {
             before(grammarAccess.getTokensAccess().getTOKENKeyword_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getTokensAccess().getTOKENKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tokens__Group__0__Impl"


    // $ANTLR start "rule__Tokens__Group__1"
    // InternalParser.g:1796:1: rule__Tokens__Group__1 : rule__Tokens__Group__1__Impl ;
    public final void rule__Tokens__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:1800:1: ( rule__Tokens__Group__1__Impl )
            // InternalParser.g:1801:2: rule__Tokens__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Tokens__Group__1__Impl();

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
    // $ANTLR end "rule__Tokens__Group__1"


    // $ANTLR start "rule__Tokens__Group__1__Impl"
    // InternalParser.g:1807:1: rule__Tokens__Group__1__Impl : ( ( rule__Tokens__TokensAssignment_1 )* ) ;
    public final void rule__Tokens__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:1811:1: ( ( ( rule__Tokens__TokensAssignment_1 )* ) )
            // InternalParser.g:1812:1: ( ( rule__Tokens__TokensAssignment_1 )* )
            {
            // InternalParser.g:1812:1: ( ( rule__Tokens__TokensAssignment_1 )* )
            // InternalParser.g:1813:2: ( rule__Tokens__TokensAssignment_1 )*
            {
             before(grammarAccess.getTokensAccess().getTokensAssignment_1()); 
            // InternalParser.g:1814:2: ( rule__Tokens__TokensAssignment_1 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=RULE_WS && LA12_0<=RULE_INT)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalParser.g:1814:3: rule__Tokens__TokensAssignment_1
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Tokens__TokensAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getTokensAccess().getTokensAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tokens__Group__1__Impl"


    // $ANTLR start "rule__DefinedToken__Group_0__0"
    // InternalParser.g:1823:1: rule__DefinedToken__Group_0__0 : rule__DefinedToken__Group_0__0__Impl rule__DefinedToken__Group_0__1 ;
    public final void rule__DefinedToken__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:1827:1: ( rule__DefinedToken__Group_0__0__Impl rule__DefinedToken__Group_0__1 )
            // InternalParser.g:1828:2: rule__DefinedToken__Group_0__0__Impl rule__DefinedToken__Group_0__1
            {
            pushFollow(FOLLOW_12);
            rule__DefinedToken__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DefinedToken__Group_0__1();

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
    // $ANTLR end "rule__DefinedToken__Group_0__0"


    // $ANTLR start "rule__DefinedToken__Group_0__0__Impl"
    // InternalParser.g:1835:1: rule__DefinedToken__Group_0__0__Impl : ( ( rule__DefinedToken__NameAssignment_0_0 ) ) ;
    public final void rule__DefinedToken__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:1839:1: ( ( ( rule__DefinedToken__NameAssignment_0_0 ) ) )
            // InternalParser.g:1840:1: ( ( rule__DefinedToken__NameAssignment_0_0 ) )
            {
            // InternalParser.g:1840:1: ( ( rule__DefinedToken__NameAssignment_0_0 ) )
            // InternalParser.g:1841:2: ( rule__DefinedToken__NameAssignment_0_0 )
            {
             before(grammarAccess.getDefinedTokenAccess().getNameAssignment_0_0()); 
            // InternalParser.g:1842:2: ( rule__DefinedToken__NameAssignment_0_0 )
            // InternalParser.g:1842:3: rule__DefinedToken__NameAssignment_0_0
            {
            pushFollow(FOLLOW_2);
            rule__DefinedToken__NameAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getDefinedTokenAccess().getNameAssignment_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefinedToken__Group_0__0__Impl"


    // $ANTLR start "rule__DefinedToken__Group_0__1"
    // InternalParser.g:1850:1: rule__DefinedToken__Group_0__1 : rule__DefinedToken__Group_0__1__Impl ;
    public final void rule__DefinedToken__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:1854:1: ( rule__DefinedToken__Group_0__1__Impl )
            // InternalParser.g:1855:2: rule__DefinedToken__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DefinedToken__Group_0__1__Impl();

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
    // $ANTLR end "rule__DefinedToken__Group_0__1"


    // $ANTLR start "rule__DefinedToken__Group_0__1__Impl"
    // InternalParser.g:1861:1: rule__DefinedToken__Group_0__1__Impl : ( ( rule__DefinedToken__Group_0_1__0 ) ) ;
    public final void rule__DefinedToken__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:1865:1: ( ( ( rule__DefinedToken__Group_0_1__0 ) ) )
            // InternalParser.g:1866:1: ( ( rule__DefinedToken__Group_0_1__0 ) )
            {
            // InternalParser.g:1866:1: ( ( rule__DefinedToken__Group_0_1__0 ) )
            // InternalParser.g:1867:2: ( rule__DefinedToken__Group_0_1__0 )
            {
             before(grammarAccess.getDefinedTokenAccess().getGroup_0_1()); 
            // InternalParser.g:1868:2: ( rule__DefinedToken__Group_0_1__0 )
            // InternalParser.g:1868:3: rule__DefinedToken__Group_0_1__0
            {
            pushFollow(FOLLOW_2);
            rule__DefinedToken__Group_0_1__0();

            state._fsp--;


            }

             after(grammarAccess.getDefinedTokenAccess().getGroup_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefinedToken__Group_0__1__Impl"


    // $ANTLR start "rule__DefinedToken__Group_0_1__0"
    // InternalParser.g:1877:1: rule__DefinedToken__Group_0_1__0 : rule__DefinedToken__Group_0_1__0__Impl rule__DefinedToken__Group_0_1__1 ;
    public final void rule__DefinedToken__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:1881:1: ( rule__DefinedToken__Group_0_1__0__Impl rule__DefinedToken__Group_0_1__1 )
            // InternalParser.g:1882:2: rule__DefinedToken__Group_0_1__0__Impl rule__DefinedToken__Group_0_1__1
            {
            pushFollow(FOLLOW_13);
            rule__DefinedToken__Group_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DefinedToken__Group_0_1__1();

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
    // $ANTLR end "rule__DefinedToken__Group_0_1__0"


    // $ANTLR start "rule__DefinedToken__Group_0_1__0__Impl"
    // InternalParser.g:1889:1: rule__DefinedToken__Group_0_1__0__Impl : ( '=' ) ;
    public final void rule__DefinedToken__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:1893:1: ( ( '=' ) )
            // InternalParser.g:1894:1: ( '=' )
            {
            // InternalParser.g:1894:1: ( '=' )
            // InternalParser.g:1895:2: '='
            {
             before(grammarAccess.getDefinedTokenAccess().getEqualsSignKeyword_0_1_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getDefinedTokenAccess().getEqualsSignKeyword_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefinedToken__Group_0_1__0__Impl"


    // $ANTLR start "rule__DefinedToken__Group_0_1__1"
    // InternalParser.g:1904:1: rule__DefinedToken__Group_0_1__1 : rule__DefinedToken__Group_0_1__1__Impl rule__DefinedToken__Group_0_1__2 ;
    public final void rule__DefinedToken__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:1908:1: ( rule__DefinedToken__Group_0_1__1__Impl rule__DefinedToken__Group_0_1__2 )
            // InternalParser.g:1909:2: rule__DefinedToken__Group_0_1__1__Impl rule__DefinedToken__Group_0_1__2
            {
            pushFollow(FOLLOW_14);
            rule__DefinedToken__Group_0_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DefinedToken__Group_0_1__2();

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
    // $ANTLR end "rule__DefinedToken__Group_0_1__1"


    // $ANTLR start "rule__DefinedToken__Group_0_1__1__Impl"
    // InternalParser.g:1916:1: rule__DefinedToken__Group_0_1__1__Impl : ( ( rule__DefinedToken__NumberAssignment_0_1_1 ) ) ;
    public final void rule__DefinedToken__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:1920:1: ( ( ( rule__DefinedToken__NumberAssignment_0_1_1 ) ) )
            // InternalParser.g:1921:1: ( ( rule__DefinedToken__NumberAssignment_0_1_1 ) )
            {
            // InternalParser.g:1921:1: ( ( rule__DefinedToken__NumberAssignment_0_1_1 ) )
            // InternalParser.g:1922:2: ( rule__DefinedToken__NumberAssignment_0_1_1 )
            {
             before(grammarAccess.getDefinedTokenAccess().getNumberAssignment_0_1_1()); 
            // InternalParser.g:1923:2: ( rule__DefinedToken__NumberAssignment_0_1_1 )
            // InternalParser.g:1923:3: rule__DefinedToken__NumberAssignment_0_1_1
            {
            pushFollow(FOLLOW_2);
            rule__DefinedToken__NumberAssignment_0_1_1();

            state._fsp--;


            }

             after(grammarAccess.getDefinedTokenAccess().getNumberAssignment_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefinedToken__Group_0_1__1__Impl"


    // $ANTLR start "rule__DefinedToken__Group_0_1__2"
    // InternalParser.g:1931:1: rule__DefinedToken__Group_0_1__2 : rule__DefinedToken__Group_0_1__2__Impl ;
    public final void rule__DefinedToken__Group_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:1935:1: ( rule__DefinedToken__Group_0_1__2__Impl )
            // InternalParser.g:1936:2: rule__DefinedToken__Group_0_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DefinedToken__Group_0_1__2__Impl();

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
    // $ANTLR end "rule__DefinedToken__Group_0_1__2"


    // $ANTLR start "rule__DefinedToken__Group_0_1__2__Impl"
    // InternalParser.g:1942:1: rule__DefinedToken__Group_0_1__2__Impl : ( ( rule__DefinedToken__Group_0_1_2__0 )? ) ;
    public final void rule__DefinedToken__Group_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:1946:1: ( ( ( rule__DefinedToken__Group_0_1_2__0 )? ) )
            // InternalParser.g:1947:1: ( ( rule__DefinedToken__Group_0_1_2__0 )? )
            {
            // InternalParser.g:1947:1: ( ( rule__DefinedToken__Group_0_1_2__0 )? )
            // InternalParser.g:1948:2: ( rule__DefinedToken__Group_0_1_2__0 )?
            {
             before(grammarAccess.getDefinedTokenAccess().getGroup_0_1_2()); 
            // InternalParser.g:1949:2: ( rule__DefinedToken__Group_0_1_2__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==30) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalParser.g:1949:3: rule__DefinedToken__Group_0_1_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DefinedToken__Group_0_1_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDefinedTokenAccess().getGroup_0_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefinedToken__Group_0_1__2__Impl"


    // $ANTLR start "rule__DefinedToken__Group_0_1_2__0"
    // InternalParser.g:1958:1: rule__DefinedToken__Group_0_1_2__0 : rule__DefinedToken__Group_0_1_2__0__Impl rule__DefinedToken__Group_0_1_2__1 ;
    public final void rule__DefinedToken__Group_0_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:1962:1: ( rule__DefinedToken__Group_0_1_2__0__Impl rule__DefinedToken__Group_0_1_2__1 )
            // InternalParser.g:1963:2: rule__DefinedToken__Group_0_1_2__0__Impl rule__DefinedToken__Group_0_1_2__1
            {
            pushFollow(FOLLOW_13);
            rule__DefinedToken__Group_0_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DefinedToken__Group_0_1_2__1();

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
    // $ANTLR end "rule__DefinedToken__Group_0_1_2__0"


    // $ANTLR start "rule__DefinedToken__Group_0_1_2__0__Impl"
    // InternalParser.g:1970:1: rule__DefinedToken__Group_0_1_2__0__Impl : ( ',' ) ;
    public final void rule__DefinedToken__Group_0_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:1974:1: ( ( ',' ) )
            // InternalParser.g:1975:1: ( ',' )
            {
            // InternalParser.g:1975:1: ( ',' )
            // InternalParser.g:1976:2: ','
            {
             before(grammarAccess.getDefinedTokenAccess().getCommaKeyword_0_1_2_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getDefinedTokenAccess().getCommaKeyword_0_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefinedToken__Group_0_1_2__0__Impl"


    // $ANTLR start "rule__DefinedToken__Group_0_1_2__1"
    // InternalParser.g:1985:1: rule__DefinedToken__Group_0_1_2__1 : rule__DefinedToken__Group_0_1_2__1__Impl ;
    public final void rule__DefinedToken__Group_0_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:1989:1: ( rule__DefinedToken__Group_0_1_2__1__Impl )
            // InternalParser.g:1990:2: rule__DefinedToken__Group_0_1_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DefinedToken__Group_0_1_2__1__Impl();

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
    // $ANTLR end "rule__DefinedToken__Group_0_1_2__1"


    // $ANTLR start "rule__DefinedToken__Group_0_1_2__1__Impl"
    // InternalParser.g:1996:1: rule__DefinedToken__Group_0_1_2__1__Impl : ( ( rule__DefinedToken__ExtraAssignment_0_1_2_1 ) ) ;
    public final void rule__DefinedToken__Group_0_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:2000:1: ( ( ( rule__DefinedToken__ExtraAssignment_0_1_2_1 ) ) )
            // InternalParser.g:2001:1: ( ( rule__DefinedToken__ExtraAssignment_0_1_2_1 ) )
            {
            // InternalParser.g:2001:1: ( ( rule__DefinedToken__ExtraAssignment_0_1_2_1 ) )
            // InternalParser.g:2002:2: ( rule__DefinedToken__ExtraAssignment_0_1_2_1 )
            {
             before(grammarAccess.getDefinedTokenAccess().getExtraAssignment_0_1_2_1()); 
            // InternalParser.g:2003:2: ( rule__DefinedToken__ExtraAssignment_0_1_2_1 )
            // InternalParser.g:2003:3: rule__DefinedToken__ExtraAssignment_0_1_2_1
            {
            pushFollow(FOLLOW_2);
            rule__DefinedToken__ExtraAssignment_0_1_2_1();

            state._fsp--;


            }

             after(grammarAccess.getDefinedTokenAccess().getExtraAssignment_0_1_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefinedToken__Group_0_1_2__1__Impl"


    // $ANTLR start "rule__TokenExtra__Group__0"
    // InternalParser.g:2012:1: rule__TokenExtra__Group__0 : rule__TokenExtra__Group__0__Impl rule__TokenExtra__Group__1 ;
    public final void rule__TokenExtra__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:2016:1: ( rule__TokenExtra__Group__0__Impl rule__TokenExtra__Group__1 )
            // InternalParser.g:2017:2: rule__TokenExtra__Group__0__Impl rule__TokenExtra__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__TokenExtra__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TokenExtra__Group__1();

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
    // $ANTLR end "rule__TokenExtra__Group__0"


    // $ANTLR start "rule__TokenExtra__Group__0__Impl"
    // InternalParser.g:2024:1: rule__TokenExtra__Group__0__Impl : ( ( rule__TokenExtra__CostAssignment_0 ) ) ;
    public final void rule__TokenExtra__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:2028:1: ( ( ( rule__TokenExtra__CostAssignment_0 ) ) )
            // InternalParser.g:2029:1: ( ( rule__TokenExtra__CostAssignment_0 ) )
            {
            // InternalParser.g:2029:1: ( ( rule__TokenExtra__CostAssignment_0 ) )
            // InternalParser.g:2030:2: ( rule__TokenExtra__CostAssignment_0 )
            {
             before(grammarAccess.getTokenExtraAccess().getCostAssignment_0()); 
            // InternalParser.g:2031:2: ( rule__TokenExtra__CostAssignment_0 )
            // InternalParser.g:2031:3: rule__TokenExtra__CostAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__TokenExtra__CostAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTokenExtraAccess().getCostAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TokenExtra__Group__0__Impl"


    // $ANTLR start "rule__TokenExtra__Group__1"
    // InternalParser.g:2039:1: rule__TokenExtra__Group__1 : rule__TokenExtra__Group__1__Impl rule__TokenExtra__Group__2 ;
    public final void rule__TokenExtra__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:2043:1: ( rule__TokenExtra__Group__1__Impl rule__TokenExtra__Group__2 )
            // InternalParser.g:2044:2: rule__TokenExtra__Group__1__Impl rule__TokenExtra__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__TokenExtra__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TokenExtra__Group__2();

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
    // $ANTLR end "rule__TokenExtra__Group__1"


    // $ANTLR start "rule__TokenExtra__Group__1__Impl"
    // InternalParser.g:2051:1: rule__TokenExtra__Group__1__Impl : ( ',' ) ;
    public final void rule__TokenExtra__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:2055:1: ( ( ',' ) )
            // InternalParser.g:2056:1: ( ',' )
            {
            // InternalParser.g:2056:1: ( ',' )
            // InternalParser.g:2057:2: ','
            {
             before(grammarAccess.getTokenExtraAccess().getCommaKeyword_1()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getTokenExtraAccess().getCommaKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TokenExtra__Group__1__Impl"


    // $ANTLR start "rule__TokenExtra__Group__2"
    // InternalParser.g:2066:1: rule__TokenExtra__Group__2 : rule__TokenExtra__Group__2__Impl ;
    public final void rule__TokenExtra__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:2070:1: ( rule__TokenExtra__Group__2__Impl )
            // InternalParser.g:2071:2: rule__TokenExtra__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TokenExtra__Group__2__Impl();

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
    // $ANTLR end "rule__TokenExtra__Group__2"


    // $ANTLR start "rule__TokenExtra__Group__2__Impl"
    // InternalParser.g:2077:1: rule__TokenExtra__Group__2__Impl : ( ( rule__TokenExtra__PresentationAssignment_2 ) ) ;
    public final void rule__TokenExtra__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:2081:1: ( ( ( rule__TokenExtra__PresentationAssignment_2 ) ) )
            // InternalParser.g:2082:1: ( ( rule__TokenExtra__PresentationAssignment_2 ) )
            {
            // InternalParser.g:2082:1: ( ( rule__TokenExtra__PresentationAssignment_2 ) )
            // InternalParser.g:2083:2: ( rule__TokenExtra__PresentationAssignment_2 )
            {
             before(grammarAccess.getTokenExtraAccess().getPresentationAssignment_2()); 
            // InternalParser.g:2084:2: ( rule__TokenExtra__PresentationAssignment_2 )
            // InternalParser.g:2084:3: rule__TokenExtra__PresentationAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__TokenExtra__PresentationAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTokenExtraAccess().getPresentationAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TokenExtra__Group__2__Impl"


    // $ANTLR start "rule__CodeBlock__Group_1__0"
    // InternalParser.g:2093:1: rule__CodeBlock__Group_1__0 : rule__CodeBlock__Group_1__0__Impl rule__CodeBlock__Group_1__1 ;
    public final void rule__CodeBlock__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:2097:1: ( rule__CodeBlock__Group_1__0__Impl rule__CodeBlock__Group_1__1 )
            // InternalParser.g:2098:2: rule__CodeBlock__Group_1__0__Impl rule__CodeBlock__Group_1__1
            {
            pushFollow(FOLLOW_8);
            rule__CodeBlock__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CodeBlock__Group_1__1();

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
    // $ANTLR end "rule__CodeBlock__Group_1__0"


    // $ANTLR start "rule__CodeBlock__Group_1__0__Impl"
    // InternalParser.g:2105:1: rule__CodeBlock__Group_1__0__Impl : ( '{' ) ;
    public final void rule__CodeBlock__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:2109:1: ( ( '{' ) )
            // InternalParser.g:2110:1: ( '{' )
            {
            // InternalParser.g:2110:1: ( '{' )
            // InternalParser.g:2111:2: '{'
            {
             before(grammarAccess.getCodeBlockAccess().getLeftCurlyBracketKeyword_1_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getCodeBlockAccess().getLeftCurlyBracketKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CodeBlock__Group_1__0__Impl"


    // $ANTLR start "rule__CodeBlock__Group_1__1"
    // InternalParser.g:2120:1: rule__CodeBlock__Group_1__1 : rule__CodeBlock__Group_1__1__Impl rule__CodeBlock__Group_1__2 ;
    public final void rule__CodeBlock__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:2124:1: ( rule__CodeBlock__Group_1__1__Impl rule__CodeBlock__Group_1__2 )
            // InternalParser.g:2125:2: rule__CodeBlock__Group_1__1__Impl rule__CodeBlock__Group_1__2
            {
            pushFollow(FOLLOW_9);
            rule__CodeBlock__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CodeBlock__Group_1__2();

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
    // $ANTLR end "rule__CodeBlock__Group_1__1"


    // $ANTLR start "rule__CodeBlock__Group_1__1__Impl"
    // InternalParser.g:2132:1: rule__CodeBlock__Group_1__1__Impl : ( ruleCodeBlock ) ;
    public final void rule__CodeBlock__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:2136:1: ( ( ruleCodeBlock ) )
            // InternalParser.g:2137:1: ( ruleCodeBlock )
            {
            // InternalParser.g:2137:1: ( ruleCodeBlock )
            // InternalParser.g:2138:2: ruleCodeBlock
            {
             before(grammarAccess.getCodeBlockAccess().getCodeBlockParserRuleCall_1_1()); 
            pushFollow(FOLLOW_2);
            ruleCodeBlock();

            state._fsp--;

             after(grammarAccess.getCodeBlockAccess().getCodeBlockParserRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CodeBlock__Group_1__1__Impl"


    // $ANTLR start "rule__CodeBlock__Group_1__2"
    // InternalParser.g:2147:1: rule__CodeBlock__Group_1__2 : rule__CodeBlock__Group_1__2__Impl ;
    public final void rule__CodeBlock__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:2151:1: ( rule__CodeBlock__Group_1__2__Impl )
            // InternalParser.g:2152:2: rule__CodeBlock__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CodeBlock__Group_1__2__Impl();

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
    // $ANTLR end "rule__CodeBlock__Group_1__2"


    // $ANTLR start "rule__CodeBlock__Group_1__2__Impl"
    // InternalParser.g:2158:1: rule__CodeBlock__Group_1__2__Impl : ( '}' ) ;
    public final void rule__CodeBlock__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:2162:1: ( ( '}' ) )
            // InternalParser.g:2163:1: ( '}' )
            {
            // InternalParser.g:2163:1: ( '}' )
            // InternalParser.g:2164:2: '}'
            {
             before(grammarAccess.getCodeBlockAccess().getRightCurlyBracketKeyword_1_2()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getCodeBlockAccess().getRightCurlyBracketKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CodeBlock__Group_1__2__Impl"


    // $ANTLR start "rule__Precedence__Group__0"
    // InternalParser.g:2174:1: rule__Precedence__Group__0 : rule__Precedence__Group__0__Impl rule__Precedence__Group__1 ;
    public final void rule__Precedence__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:2178:1: ( rule__Precedence__Group__0__Impl rule__Precedence__Group__1 )
            // InternalParser.g:2179:2: rule__Precedence__Group__0__Impl rule__Precedence__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__Precedence__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Precedence__Group__1();

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
    // $ANTLR end "rule__Precedence__Group__0"


    // $ANTLR start "rule__Precedence__Group__0__Impl"
    // InternalParser.g:2186:1: rule__Precedence__Group__0__Impl : ( 'PREC' ) ;
    public final void rule__Precedence__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:2190:1: ( ( 'PREC' ) )
            // InternalParser.g:2191:1: ( 'PREC' )
            {
            // InternalParser.g:2191:1: ( 'PREC' )
            // InternalParser.g:2192:2: 'PREC'
            {
             before(grammarAccess.getPrecedenceAccess().getPRECKeyword_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getPrecedenceAccess().getPRECKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precedence__Group__0__Impl"


    // $ANTLR start "rule__Precedence__Group__1"
    // InternalParser.g:2201:1: rule__Precedence__Group__1 : rule__Precedence__Group__1__Impl ;
    public final void rule__Precedence__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:2205:1: ( rule__Precedence__Group__1__Impl )
            // InternalParser.g:2206:2: rule__Precedence__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Precedence__Group__1__Impl();

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
    // $ANTLR end "rule__Precedence__Group__1"


    // $ANTLR start "rule__Precedence__Group__1__Impl"
    // InternalParser.g:2212:1: rule__Precedence__Group__1__Impl : ( ( rule__Precedence__RowsAssignment_1 )* ) ;
    public final void rule__Precedence__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:2216:1: ( ( ( rule__Precedence__RowsAssignment_1 )* ) )
            // InternalParser.g:2217:1: ( ( rule__Precedence__RowsAssignment_1 )* )
            {
            // InternalParser.g:2217:1: ( ( rule__Precedence__RowsAssignment_1 )* )
            // InternalParser.g:2218:2: ( rule__Precedence__RowsAssignment_1 )*
            {
             before(grammarAccess.getPrecedenceAccess().getRowsAssignment_1()); 
            // InternalParser.g:2219:2: ( rule__Precedence__RowsAssignment_1 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=33 && LA14_0<=35)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalParser.g:2219:3: rule__Precedence__RowsAssignment_1
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Precedence__RowsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getPrecedenceAccess().getRowsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precedence__Group__1__Impl"


    // $ANTLR start "rule__PrecedenceRow__Group__0"
    // InternalParser.g:2228:1: rule__PrecedenceRow__Group__0 : rule__PrecedenceRow__Group__0__Impl rule__PrecedenceRow__Group__1 ;
    public final void rule__PrecedenceRow__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:2232:1: ( rule__PrecedenceRow__Group__0__Impl rule__PrecedenceRow__Group__1 )
            // InternalParser.g:2233:2: rule__PrecedenceRow__Group__0__Impl rule__PrecedenceRow__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__PrecedenceRow__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrecedenceRow__Group__1();

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
    // $ANTLR end "rule__PrecedenceRow__Group__0"


    // $ANTLR start "rule__PrecedenceRow__Group__0__Impl"
    // InternalParser.g:2240:1: rule__PrecedenceRow__Group__0__Impl : ( ( rule__PrecedenceRow__TypeAssignment_0 ) ) ;
    public final void rule__PrecedenceRow__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:2244:1: ( ( ( rule__PrecedenceRow__TypeAssignment_0 ) ) )
            // InternalParser.g:2245:1: ( ( rule__PrecedenceRow__TypeAssignment_0 ) )
            {
            // InternalParser.g:2245:1: ( ( rule__PrecedenceRow__TypeAssignment_0 ) )
            // InternalParser.g:2246:2: ( rule__PrecedenceRow__TypeAssignment_0 )
            {
             before(grammarAccess.getPrecedenceRowAccess().getTypeAssignment_0()); 
            // InternalParser.g:2247:2: ( rule__PrecedenceRow__TypeAssignment_0 )
            // InternalParser.g:2247:3: rule__PrecedenceRow__TypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__PrecedenceRow__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPrecedenceRowAccess().getTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrecedenceRow__Group__0__Impl"


    // $ANTLR start "rule__PrecedenceRow__Group__1"
    // InternalParser.g:2255:1: rule__PrecedenceRow__Group__1 : rule__PrecedenceRow__Group__1__Impl ;
    public final void rule__PrecedenceRow__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:2259:1: ( rule__PrecedenceRow__Group__1__Impl )
            // InternalParser.g:2260:2: rule__PrecedenceRow__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrecedenceRow__Group__1__Impl();

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
    // $ANTLR end "rule__PrecedenceRow__Group__1"


    // $ANTLR start "rule__PrecedenceRow__Group__1__Impl"
    // InternalParser.g:2266:1: rule__PrecedenceRow__Group__1__Impl : ( ( rule__PrecedenceRow__TokensAssignment_1 )* ) ;
    public final void rule__PrecedenceRow__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:2270:1: ( ( ( rule__PrecedenceRow__TokensAssignment_1 )* ) )
            // InternalParser.g:2271:1: ( ( rule__PrecedenceRow__TokensAssignment_1 )* )
            {
            // InternalParser.g:2271:1: ( ( rule__PrecedenceRow__TokensAssignment_1 )* )
            // InternalParser.g:2272:2: ( rule__PrecedenceRow__TokensAssignment_1 )*
            {
             before(grammarAccess.getPrecedenceRowAccess().getTokensAssignment_1()); 
            // InternalParser.g:2273:2: ( rule__PrecedenceRow__TokensAssignment_1 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalParser.g:2273:3: rule__PrecedenceRow__TokensAssignment_1
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__PrecedenceRow__TokensAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getPrecedenceRowAccess().getTokensAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrecedenceRow__Group__1__Impl"


    // $ANTLR start "rule__StartSymbols__Group__0"
    // InternalParser.g:2282:1: rule__StartSymbols__Group__0 : rule__StartSymbols__Group__0__Impl rule__StartSymbols__Group__1 ;
    public final void rule__StartSymbols__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:2286:1: ( rule__StartSymbols__Group__0__Impl rule__StartSymbols__Group__1 )
            // InternalParser.g:2287:2: rule__StartSymbols__Group__0__Impl rule__StartSymbols__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__StartSymbols__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StartSymbols__Group__1();

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
    // $ANTLR end "rule__StartSymbols__Group__0"


    // $ANTLR start "rule__StartSymbols__Group__0__Impl"
    // InternalParser.g:2294:1: rule__StartSymbols__Group__0__Impl : ( 'START' ) ;
    public final void rule__StartSymbols__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:2298:1: ( ( 'START' ) )
            // InternalParser.g:2299:1: ( 'START' )
            {
            // InternalParser.g:2299:1: ( 'START' )
            // InternalParser.g:2300:2: 'START'
            {
             before(grammarAccess.getStartSymbolsAccess().getSTARTKeyword_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getStartSymbolsAccess().getSTARTKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartSymbols__Group__0__Impl"


    // $ANTLR start "rule__StartSymbols__Group__1"
    // InternalParser.g:2309:1: rule__StartSymbols__Group__1 : rule__StartSymbols__Group__1__Impl ;
    public final void rule__StartSymbols__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:2313:1: ( rule__StartSymbols__Group__1__Impl )
            // InternalParser.g:2314:2: rule__StartSymbols__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StartSymbols__Group__1__Impl();

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
    // $ANTLR end "rule__StartSymbols__Group__1"


    // $ANTLR start "rule__StartSymbols__Group__1__Impl"
    // InternalParser.g:2320:1: rule__StartSymbols__Group__1__Impl : ( ( rule__StartSymbols__StatesAssignment_1 )* ) ;
    public final void rule__StartSymbols__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:2324:1: ( ( ( rule__StartSymbols__StatesAssignment_1 )* ) )
            // InternalParser.g:2325:1: ( ( rule__StartSymbols__StatesAssignment_1 )* )
            {
            // InternalParser.g:2325:1: ( ( rule__StartSymbols__StatesAssignment_1 )* )
            // InternalParser.g:2326:2: ( rule__StartSymbols__StatesAssignment_1 )*
            {
             before(grammarAccess.getStartSymbolsAccess().getStatesAssignment_1()); 
            // InternalParser.g:2327:2: ( rule__StartSymbols__StatesAssignment_1 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ID) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalParser.g:2327:3: rule__StartSymbols__StatesAssignment_1
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__StartSymbols__StatesAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getStartSymbolsAccess().getStatesAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartSymbols__Group__1__Impl"


    // $ANTLR start "rule__GrammarRules__Group__0"
    // InternalParser.g:2336:1: rule__GrammarRules__Group__0 : rule__GrammarRules__Group__0__Impl rule__GrammarRules__Group__1 ;
    public final void rule__GrammarRules__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:2340:1: ( rule__GrammarRules__Group__0__Impl rule__GrammarRules__Group__1 )
            // InternalParser.g:2341:2: rule__GrammarRules__Group__0__Impl rule__GrammarRules__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__GrammarRules__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GrammarRules__Group__1();

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
    // $ANTLR end "rule__GrammarRules__Group__0"


    // $ANTLR start "rule__GrammarRules__Group__0__Impl"
    // InternalParser.g:2348:1: rule__GrammarRules__Group__0__Impl : ( ( rule__GrammarRules__Alternatives_0 ) ) ;
    public final void rule__GrammarRules__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:2352:1: ( ( ( rule__GrammarRules__Alternatives_0 ) ) )
            // InternalParser.g:2353:1: ( ( rule__GrammarRules__Alternatives_0 ) )
            {
            // InternalParser.g:2353:1: ( ( rule__GrammarRules__Alternatives_0 ) )
            // InternalParser.g:2354:2: ( rule__GrammarRules__Alternatives_0 )
            {
             before(grammarAccess.getGrammarRulesAccess().getAlternatives_0()); 
            // InternalParser.g:2355:2: ( rule__GrammarRules__Alternatives_0 )
            // InternalParser.g:2355:3: rule__GrammarRules__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__GrammarRules__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getGrammarRulesAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrammarRules__Group__0__Impl"


    // $ANTLR start "rule__GrammarRules__Group__1"
    // InternalParser.g:2363:1: rule__GrammarRules__Group__1 : rule__GrammarRules__Group__1__Impl ;
    public final void rule__GrammarRules__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:2367:1: ( rule__GrammarRules__Group__1__Impl )
            // InternalParser.g:2368:2: rule__GrammarRules__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GrammarRules__Group__1__Impl();

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
    // $ANTLR end "rule__GrammarRules__Group__1"


    // $ANTLR start "rule__GrammarRules__Group__1__Impl"
    // InternalParser.g:2374:1: rule__GrammarRules__Group__1__Impl : ( ( rule__GrammarRules__RulesAssignment_1 )* ) ;
    public final void rule__GrammarRules__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:2378:1: ( ( ( rule__GrammarRules__RulesAssignment_1 )* ) )
            // InternalParser.g:2379:1: ( ( rule__GrammarRules__RulesAssignment_1 )* )
            {
            // InternalParser.g:2379:1: ( ( rule__GrammarRules__RulesAssignment_1 )* )
            // InternalParser.g:2380:2: ( rule__GrammarRules__RulesAssignment_1 )*
            {
             before(grammarAccess.getGrammarRulesAccess().getRulesAssignment_1()); 
            // InternalParser.g:2381:2: ( rule__GrammarRules__RulesAssignment_1 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_ID) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalParser.g:2381:3: rule__GrammarRules__RulesAssignment_1
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__GrammarRules__RulesAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getGrammarRulesAccess().getRulesAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrammarRules__Group__1__Impl"


    // $ANTLR start "rule__GrammarRule__Group__0"
    // InternalParser.g:2390:1: rule__GrammarRule__Group__0 : rule__GrammarRule__Group__0__Impl rule__GrammarRule__Group__1 ;
    public final void rule__GrammarRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:2394:1: ( rule__GrammarRule__Group__0__Impl rule__GrammarRule__Group__1 )
            // InternalParser.g:2395:2: rule__GrammarRule__Group__0__Impl rule__GrammarRule__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__GrammarRule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GrammarRule__Group__1();

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
    // $ANTLR end "rule__GrammarRule__Group__0"


    // $ANTLR start "rule__GrammarRule__Group__0__Impl"
    // InternalParser.g:2402:1: rule__GrammarRule__Group__0__Impl : ( ( rule__GrammarRule__NameAssignment_0 ) ) ;
    public final void rule__GrammarRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:2406:1: ( ( ( rule__GrammarRule__NameAssignment_0 ) ) )
            // InternalParser.g:2407:1: ( ( rule__GrammarRule__NameAssignment_0 ) )
            {
            // InternalParser.g:2407:1: ( ( rule__GrammarRule__NameAssignment_0 ) )
            // InternalParser.g:2408:2: ( rule__GrammarRule__NameAssignment_0 )
            {
             before(grammarAccess.getGrammarRuleAccess().getNameAssignment_0()); 
            // InternalParser.g:2409:2: ( rule__GrammarRule__NameAssignment_0 )
            // InternalParser.g:2409:3: rule__GrammarRule__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__GrammarRule__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getGrammarRuleAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrammarRule__Group__0__Impl"


    // $ANTLR start "rule__GrammarRule__Group__1"
    // InternalParser.g:2417:1: rule__GrammarRule__Group__1 : rule__GrammarRule__Group__1__Impl rule__GrammarRule__Group__2 ;
    public final void rule__GrammarRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:2421:1: ( rule__GrammarRule__Group__1__Impl rule__GrammarRule__Group__2 )
            // InternalParser.g:2422:2: rule__GrammarRule__Group__1__Impl rule__GrammarRule__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__GrammarRule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GrammarRule__Group__2();

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
    // $ANTLR end "rule__GrammarRule__Group__1"


    // $ANTLR start "rule__GrammarRule__Group__1__Impl"
    // InternalParser.g:2429:1: rule__GrammarRule__Group__1__Impl : ( ':' ) ;
    public final void rule__GrammarRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:2433:1: ( ( ':' ) )
            // InternalParser.g:2434:1: ( ':' )
            {
            // InternalParser.g:2434:1: ( ':' )
            // InternalParser.g:2435:2: ':'
            {
             before(grammarAccess.getGrammarRuleAccess().getColonKeyword_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getGrammarRuleAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrammarRule__Group__1__Impl"


    // $ANTLR start "rule__GrammarRule__Group__2"
    // InternalParser.g:2444:1: rule__GrammarRule__Group__2 : rule__GrammarRule__Group__2__Impl rule__GrammarRule__Group__3 ;
    public final void rule__GrammarRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:2448:1: ( rule__GrammarRule__Group__2__Impl rule__GrammarRule__Group__3 )
            // InternalParser.g:2449:2: rule__GrammarRule__Group__2__Impl rule__GrammarRule__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__GrammarRule__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GrammarRule__Group__3();

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
    // $ANTLR end "rule__GrammarRule__Group__2"


    // $ANTLR start "rule__GrammarRule__Group__2__Impl"
    // InternalParser.g:2456:1: rule__GrammarRule__Group__2__Impl : ( ( rule__GrammarRule__BodyAssignment_2 ) ) ;
    public final void rule__GrammarRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:2460:1: ( ( ( rule__GrammarRule__BodyAssignment_2 ) ) )
            // InternalParser.g:2461:1: ( ( rule__GrammarRule__BodyAssignment_2 ) )
            {
            // InternalParser.g:2461:1: ( ( rule__GrammarRule__BodyAssignment_2 ) )
            // InternalParser.g:2462:2: ( rule__GrammarRule__BodyAssignment_2 )
            {
             before(grammarAccess.getGrammarRuleAccess().getBodyAssignment_2()); 
            // InternalParser.g:2463:2: ( rule__GrammarRule__BodyAssignment_2 )
            // InternalParser.g:2463:3: rule__GrammarRule__BodyAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__GrammarRule__BodyAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getGrammarRuleAccess().getBodyAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrammarRule__Group__2__Impl"


    // $ANTLR start "rule__GrammarRule__Group__3"
    // InternalParser.g:2471:1: rule__GrammarRule__Group__3 : rule__GrammarRule__Group__3__Impl rule__GrammarRule__Group__4 ;
    public final void rule__GrammarRule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:2475:1: ( rule__GrammarRule__Group__3__Impl rule__GrammarRule__Group__4 )
            // InternalParser.g:2476:2: rule__GrammarRule__Group__3__Impl rule__GrammarRule__Group__4
            {
            pushFollow(FOLLOW_21);
            rule__GrammarRule__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GrammarRule__Group__4();

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
    // $ANTLR end "rule__GrammarRule__Group__3"


    // $ANTLR start "rule__GrammarRule__Group__3__Impl"
    // InternalParser.g:2483:1: rule__GrammarRule__Group__3__Impl : ( ( rule__GrammarRule__Group_3__0 )* ) ;
    public final void rule__GrammarRule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:2487:1: ( ( ( rule__GrammarRule__Group_3__0 )* ) )
            // InternalParser.g:2488:1: ( ( rule__GrammarRule__Group_3__0 )* )
            {
            // InternalParser.g:2488:1: ( ( rule__GrammarRule__Group_3__0 )* )
            // InternalParser.g:2489:2: ( rule__GrammarRule__Group_3__0 )*
            {
             before(grammarAccess.getGrammarRuleAccess().getGroup_3()); 
            // InternalParser.g:2490:2: ( rule__GrammarRule__Group_3__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==19) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalParser.g:2490:3: rule__GrammarRule__Group_3__0
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__GrammarRule__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getGrammarRuleAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrammarRule__Group__3__Impl"


    // $ANTLR start "rule__GrammarRule__Group__4"
    // InternalParser.g:2498:1: rule__GrammarRule__Group__4 : rule__GrammarRule__Group__4__Impl ;
    public final void rule__GrammarRule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:2502:1: ( rule__GrammarRule__Group__4__Impl )
            // InternalParser.g:2503:2: rule__GrammarRule__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GrammarRule__Group__4__Impl();

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
    // $ANTLR end "rule__GrammarRule__Group__4"


    // $ANTLR start "rule__GrammarRule__Group__4__Impl"
    // InternalParser.g:2509:1: rule__GrammarRule__Group__4__Impl : ( '.' ) ;
    public final void rule__GrammarRule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:2513:1: ( ( '.' ) )
            // InternalParser.g:2514:1: ( '.' )
            {
            // InternalParser.g:2514:1: ( '.' )
            // InternalParser.g:2515:2: '.'
            {
             before(grammarAccess.getGrammarRuleAccess().getFullStopKeyword_4()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getGrammarRuleAccess().getFullStopKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrammarRule__Group__4__Impl"


    // $ANTLR start "rule__GrammarRule__Group_3__0"
    // InternalParser.g:2525:1: rule__GrammarRule__Group_3__0 : rule__GrammarRule__Group_3__0__Impl rule__GrammarRule__Group_3__1 ;
    public final void rule__GrammarRule__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:2529:1: ( rule__GrammarRule__Group_3__0__Impl rule__GrammarRule__Group_3__1 )
            // InternalParser.g:2530:2: rule__GrammarRule__Group_3__0__Impl rule__GrammarRule__Group_3__1
            {
            pushFollow(FOLLOW_20);
            rule__GrammarRule__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GrammarRule__Group_3__1();

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
    // $ANTLR end "rule__GrammarRule__Group_3__0"


    // $ANTLR start "rule__GrammarRule__Group_3__0__Impl"
    // InternalParser.g:2537:1: rule__GrammarRule__Group_3__0__Impl : ( '|' ) ;
    public final void rule__GrammarRule__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:2541:1: ( ( '|' ) )
            // InternalParser.g:2542:1: ( '|' )
            {
            // InternalParser.g:2542:1: ( '|' )
            // InternalParser.g:2543:2: '|'
            {
             before(grammarAccess.getGrammarRuleAccess().getVerticalLineKeyword_3_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getGrammarRuleAccess().getVerticalLineKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrammarRule__Group_3__0__Impl"


    // $ANTLR start "rule__GrammarRule__Group_3__1"
    // InternalParser.g:2552:1: rule__GrammarRule__Group_3__1 : rule__GrammarRule__Group_3__1__Impl ;
    public final void rule__GrammarRule__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:2556:1: ( rule__GrammarRule__Group_3__1__Impl )
            // InternalParser.g:2557:2: rule__GrammarRule__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GrammarRule__Group_3__1__Impl();

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
    // $ANTLR end "rule__GrammarRule__Group_3__1"


    // $ANTLR start "rule__GrammarRule__Group_3__1__Impl"
    // InternalParser.g:2563:1: rule__GrammarRule__Group_3__1__Impl : ( ( rule__GrammarRule__BodyAssignment_3_1 ) ) ;
    public final void rule__GrammarRule__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:2567:1: ( ( ( rule__GrammarRule__BodyAssignment_3_1 ) ) )
            // InternalParser.g:2568:1: ( ( rule__GrammarRule__BodyAssignment_3_1 ) )
            {
            // InternalParser.g:2568:1: ( ( rule__GrammarRule__BodyAssignment_3_1 ) )
            // InternalParser.g:2569:2: ( rule__GrammarRule__BodyAssignment_3_1 )
            {
             before(grammarAccess.getGrammarRuleAccess().getBodyAssignment_3_1()); 
            // InternalParser.g:2570:2: ( rule__GrammarRule__BodyAssignment_3_1 )
            // InternalParser.g:2570:3: rule__GrammarRule__BodyAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__GrammarRule__BodyAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getGrammarRuleAccess().getBodyAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrammarRule__Group_3__1__Impl"


    // $ANTLR start "rule__RuleBody__Group__0"
    // InternalParser.g:2579:1: rule__RuleBody__Group__0 : rule__RuleBody__Group__0__Impl rule__RuleBody__Group__1 ;
    public final void rule__RuleBody__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:2583:1: ( rule__RuleBody__Group__0__Impl rule__RuleBody__Group__1 )
            // InternalParser.g:2584:2: rule__RuleBody__Group__0__Impl rule__RuleBody__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__RuleBody__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RuleBody__Group__1();

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
    // $ANTLR end "rule__RuleBody__Group__0"


    // $ANTLR start "rule__RuleBody__Group__0__Impl"
    // InternalParser.g:2591:1: rule__RuleBody__Group__0__Impl : ( ( rule__RuleBody__PartAssignment_0 ) ) ;
    public final void rule__RuleBody__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:2595:1: ( ( ( rule__RuleBody__PartAssignment_0 ) ) )
            // InternalParser.g:2596:1: ( ( rule__RuleBody__PartAssignment_0 ) )
            {
            // InternalParser.g:2596:1: ( ( rule__RuleBody__PartAssignment_0 ) )
            // InternalParser.g:2597:2: ( rule__RuleBody__PartAssignment_0 )
            {
             before(grammarAccess.getRuleBodyAccess().getPartAssignment_0()); 
            // InternalParser.g:2598:2: ( rule__RuleBody__PartAssignment_0 )
            // InternalParser.g:2598:3: rule__RuleBody__PartAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__RuleBody__PartAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRuleBodyAccess().getPartAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleBody__Group__0__Impl"


    // $ANTLR start "rule__RuleBody__Group__1"
    // InternalParser.g:2606:1: rule__RuleBody__Group__1 : rule__RuleBody__Group__1__Impl ;
    public final void rule__RuleBody__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:2610:1: ( rule__RuleBody__Group__1__Impl )
            // InternalParser.g:2611:2: rule__RuleBody__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RuleBody__Group__1__Impl();

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
    // $ANTLR end "rule__RuleBody__Group__1"


    // $ANTLR start "rule__RuleBody__Group__1__Impl"
    // InternalParser.g:2617:1: rule__RuleBody__Group__1__Impl : ( ( rule__RuleBody__CodeAssignment_1 ) ) ;
    public final void rule__RuleBody__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:2621:1: ( ( ( rule__RuleBody__CodeAssignment_1 ) ) )
            // InternalParser.g:2622:1: ( ( rule__RuleBody__CodeAssignment_1 ) )
            {
            // InternalParser.g:2622:1: ( ( rule__RuleBody__CodeAssignment_1 ) )
            // InternalParser.g:2623:2: ( rule__RuleBody__CodeAssignment_1 )
            {
             before(grammarAccess.getRuleBodyAccess().getCodeAssignment_1()); 
            // InternalParser.g:2624:2: ( rule__RuleBody__CodeAssignment_1 )
            // InternalParser.g:2624:3: rule__RuleBody__CodeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RuleBody__CodeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRuleBodyAccess().getCodeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleBody__Group__1__Impl"


    // $ANTLR start "rule__RuleCode__Group_0__0"
    // InternalParser.g:2633:1: rule__RuleCode__Group_0__0 : rule__RuleCode__Group_0__0__Impl rule__RuleCode__Group_0__1 ;
    public final void rule__RuleCode__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:2637:1: ( rule__RuleCode__Group_0__0__Impl rule__RuleCode__Group_0__1 )
            // InternalParser.g:2638:2: rule__RuleCode__Group_0__0__Impl rule__RuleCode__Group_0__1
            {
            pushFollow(FOLLOW_8);
            rule__RuleCode__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RuleCode__Group_0__1();

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
    // $ANTLR end "rule__RuleCode__Group_0__0"


    // $ANTLR start "rule__RuleCode__Group_0__0__Impl"
    // InternalParser.g:2645:1: rule__RuleCode__Group_0__0__Impl : ( '{' ) ;
    public final void rule__RuleCode__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:2649:1: ( ( '{' ) )
            // InternalParser.g:2650:1: ( '{' )
            {
            // InternalParser.g:2650:1: ( '{' )
            // InternalParser.g:2651:2: '{'
            {
             before(grammarAccess.getRuleCodeAccess().getLeftCurlyBracketKeyword_0_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getRuleCodeAccess().getLeftCurlyBracketKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleCode__Group_0__0__Impl"


    // $ANTLR start "rule__RuleCode__Group_0__1"
    // InternalParser.g:2660:1: rule__RuleCode__Group_0__1 : rule__RuleCode__Group_0__1__Impl rule__RuleCode__Group_0__2 ;
    public final void rule__RuleCode__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:2664:1: ( rule__RuleCode__Group_0__1__Impl rule__RuleCode__Group_0__2 )
            // InternalParser.g:2665:2: rule__RuleCode__Group_0__1__Impl rule__RuleCode__Group_0__2
            {
            pushFollow(FOLLOW_9);
            rule__RuleCode__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RuleCode__Group_0__2();

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
    // $ANTLR end "rule__RuleCode__Group_0__1"


    // $ANTLR start "rule__RuleCode__Group_0__1__Impl"
    // InternalParser.g:2672:1: rule__RuleCode__Group_0__1__Impl : ( ruleCodeBlock ) ;
    public final void rule__RuleCode__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:2676:1: ( ( ruleCodeBlock ) )
            // InternalParser.g:2677:1: ( ruleCodeBlock )
            {
            // InternalParser.g:2677:1: ( ruleCodeBlock )
            // InternalParser.g:2678:2: ruleCodeBlock
            {
             before(grammarAccess.getRuleCodeAccess().getCodeBlockParserRuleCall_0_1()); 
            pushFollow(FOLLOW_2);
            ruleCodeBlock();

            state._fsp--;

             after(grammarAccess.getRuleCodeAccess().getCodeBlockParserRuleCall_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleCode__Group_0__1__Impl"


    // $ANTLR start "rule__RuleCode__Group_0__2"
    // InternalParser.g:2687:1: rule__RuleCode__Group_0__2 : rule__RuleCode__Group_0__2__Impl ;
    public final void rule__RuleCode__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:2691:1: ( rule__RuleCode__Group_0__2__Impl )
            // InternalParser.g:2692:2: rule__RuleCode__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RuleCode__Group_0__2__Impl();

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
    // $ANTLR end "rule__RuleCode__Group_0__2"


    // $ANTLR start "rule__RuleCode__Group_0__2__Impl"
    // InternalParser.g:2698:1: rule__RuleCode__Group_0__2__Impl : ( '}' ) ;
    public final void rule__RuleCode__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:2702:1: ( ( '}' ) )
            // InternalParser.g:2703:1: ( '}' )
            {
            // InternalParser.g:2703:1: ( '}' )
            // InternalParser.g:2704:2: '}'
            {
             before(grammarAccess.getRuleCodeAccess().getRightCurlyBracketKeyword_0_2()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getRuleCodeAccess().getRightCurlyBracketKeyword_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleCode__Group_0__2__Impl"


    // $ANTLR start "rule__RuleCode__Group_1__0"
    // InternalParser.g:2714:1: rule__RuleCode__Group_1__0 : rule__RuleCode__Group_1__0__Impl rule__RuleCode__Group_1__1 ;
    public final void rule__RuleCode__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:2718:1: ( rule__RuleCode__Group_1__0__Impl rule__RuleCode__Group_1__1 )
            // InternalParser.g:2719:2: rule__RuleCode__Group_1__0__Impl rule__RuleCode__Group_1__1
            {
            pushFollow(FOLLOW_8);
            rule__RuleCode__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RuleCode__Group_1__1();

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
    // $ANTLR end "rule__RuleCode__Group_1__0"


    // $ANTLR start "rule__RuleCode__Group_1__0__Impl"
    // InternalParser.g:2726:1: rule__RuleCode__Group_1__0__Impl : ( '[' ) ;
    public final void rule__RuleCode__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:2730:1: ( ( '[' ) )
            // InternalParser.g:2731:1: ( '[' )
            {
            // InternalParser.g:2731:1: ( '[' )
            // InternalParser.g:2732:2: '['
            {
             before(grammarAccess.getRuleCodeAccess().getLeftSquareBracketKeyword_1_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getRuleCodeAccess().getLeftSquareBracketKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleCode__Group_1__0__Impl"


    // $ANTLR start "rule__RuleCode__Group_1__1"
    // InternalParser.g:2741:1: rule__RuleCode__Group_1__1 : rule__RuleCode__Group_1__1__Impl rule__RuleCode__Group_1__2 ;
    public final void rule__RuleCode__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:2745:1: ( rule__RuleCode__Group_1__1__Impl rule__RuleCode__Group_1__2 )
            // InternalParser.g:2746:2: rule__RuleCode__Group_1__1__Impl rule__RuleCode__Group_1__2
            {
            pushFollow(FOLLOW_24);
            rule__RuleCode__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RuleCode__Group_1__2();

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
    // $ANTLR end "rule__RuleCode__Group_1__1"


    // $ANTLR start "rule__RuleCode__Group_1__1__Impl"
    // InternalParser.g:2753:1: rule__RuleCode__Group_1__1__Impl : ( ruleCodeBlock ) ;
    public final void rule__RuleCode__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:2757:1: ( ( ruleCodeBlock ) )
            // InternalParser.g:2758:1: ( ruleCodeBlock )
            {
            // InternalParser.g:2758:1: ( ruleCodeBlock )
            // InternalParser.g:2759:2: ruleCodeBlock
            {
             before(grammarAccess.getRuleCodeAccess().getCodeBlockParserRuleCall_1_1()); 
            pushFollow(FOLLOW_2);
            ruleCodeBlock();

            state._fsp--;

             after(grammarAccess.getRuleCodeAccess().getCodeBlockParserRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleCode__Group_1__1__Impl"


    // $ANTLR start "rule__RuleCode__Group_1__2"
    // InternalParser.g:2768:1: rule__RuleCode__Group_1__2 : rule__RuleCode__Group_1__2__Impl ;
    public final void rule__RuleCode__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:2772:1: ( rule__RuleCode__Group_1__2__Impl )
            // InternalParser.g:2773:2: rule__RuleCode__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RuleCode__Group_1__2__Impl();

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
    // $ANTLR end "rule__RuleCode__Group_1__2"


    // $ANTLR start "rule__RuleCode__Group_1__2__Impl"
    // InternalParser.g:2779:1: rule__RuleCode__Group_1__2__Impl : ( ']' ) ;
    public final void rule__RuleCode__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:2783:1: ( ( ']' ) )
            // InternalParser.g:2784:1: ( ']' )
            {
            // InternalParser.g:2784:1: ( ']' )
            // InternalParser.g:2785:2: ']'
            {
             before(grammarAccess.getRuleCodeAccess().getRightSquareBracketKeyword_1_2()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getRuleCodeAccess().getRightSquareBracketKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleCode__Group_1__2__Impl"


    // $ANTLR start "rule__ParserModel__UnorderedGroup_0"
    // InternalParser.g:2795:1: rule__ParserModel__UnorderedGroup_0 : ( rule__ParserModel__UnorderedGroup_0__0 )? ;
    public final void rule__ParserModel__UnorderedGroup_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getParserModelAccess().getUnorderedGroup_0());
        	
        try {
            // InternalParser.g:2800:1: ( ( rule__ParserModel__UnorderedGroup_0__0 )? )
            // InternalParser.g:2801:2: ( rule__ParserModel__UnorderedGroup_0__0 )?
            {
            // InternalParser.g:2801:2: ( rule__ParserModel__UnorderedGroup_0__0 )?
            int alt19=2;
            alt19 = dfa19.predict(input);
            switch (alt19) {
                case 1 :
                    // InternalParser.g:2801:2: rule__ParserModel__UnorderedGroup_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ParserModel__UnorderedGroup_0__0();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getParserModelAccess().getUnorderedGroup_0());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParserModel__UnorderedGroup_0"


    // $ANTLR start "rule__ParserModel__UnorderedGroup_0__Impl"
    // InternalParser.g:2809:1: rule__ParserModel__UnorderedGroup_0__Impl : ( ({...}? => ( ( ( rule__ParserModel__ScannerAssignment_0_0 ) ) ) ) | ({...}? => ( ( ( rule__ParserModel__ParserAssignment_0_1 ) ) ) ) | ({...}? => ( ( ( rule__ParserModel__ImportBlockAssignment_0_2 ) ) ) ) | ({...}? => ( ( ( rule__ParserModel__ExportBlockAssignment_0_3 ) ) ) ) | ({...}? => ( ( ( rule__ParserModel__GlobalBlockAssignment_0_4 ) ) ) ) | ({...}? => ( ( ( rule__ParserModel__LocalBlockAssignment_0_5 ) ) ) ) | ({...}? => ( ( ( rule__ParserModel__BeginBlockAssignment_0_6 ) ) ) ) | ({...}? => ( ( ( rule__ParserModel__CloseBlockAssignment_0_7 ) ) ) ) | ({...}? => ( ( ( rule__ParserModel__TokensAssignment_0_8 ) ) ) ) | ({...}? => ( ( ( rule__ParserModel__PrecedencAssignment_0_9 ) ) ) ) | ({...}? => ( ( ( rule__ParserModel__StartAssignment_0_10 ) ) ) ) ) ;
    public final void rule__ParserModel__UnorderedGroup_0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalParser.g:2814:1: ( ( ({...}? => ( ( ( rule__ParserModel__ScannerAssignment_0_0 ) ) ) ) | ({...}? => ( ( ( rule__ParserModel__ParserAssignment_0_1 ) ) ) ) | ({...}? => ( ( ( rule__ParserModel__ImportBlockAssignment_0_2 ) ) ) ) | ({...}? => ( ( ( rule__ParserModel__ExportBlockAssignment_0_3 ) ) ) ) | ({...}? => ( ( ( rule__ParserModel__GlobalBlockAssignment_0_4 ) ) ) ) | ({...}? => ( ( ( rule__ParserModel__LocalBlockAssignment_0_5 ) ) ) ) | ({...}? => ( ( ( rule__ParserModel__BeginBlockAssignment_0_6 ) ) ) ) | ({...}? => ( ( ( rule__ParserModel__CloseBlockAssignment_0_7 ) ) ) ) | ({...}? => ( ( ( rule__ParserModel__TokensAssignment_0_8 ) ) ) ) | ({...}? => ( ( ( rule__ParserModel__PrecedencAssignment_0_9 ) ) ) ) | ({...}? => ( ( ( rule__ParserModel__StartAssignment_0_10 ) ) ) ) ) )
            // InternalParser.g:2815:3: ( ({...}? => ( ( ( rule__ParserModel__ScannerAssignment_0_0 ) ) ) ) | ({...}? => ( ( ( rule__ParserModel__ParserAssignment_0_1 ) ) ) ) | ({...}? => ( ( ( rule__ParserModel__ImportBlockAssignment_0_2 ) ) ) ) | ({...}? => ( ( ( rule__ParserModel__ExportBlockAssignment_0_3 ) ) ) ) | ({...}? => ( ( ( rule__ParserModel__GlobalBlockAssignment_0_4 ) ) ) ) | ({...}? => ( ( ( rule__ParserModel__LocalBlockAssignment_0_5 ) ) ) ) | ({...}? => ( ( ( rule__ParserModel__BeginBlockAssignment_0_6 ) ) ) ) | ({...}? => ( ( ( rule__ParserModel__CloseBlockAssignment_0_7 ) ) ) ) | ({...}? => ( ( ( rule__ParserModel__TokensAssignment_0_8 ) ) ) ) | ({...}? => ( ( ( rule__ParserModel__PrecedencAssignment_0_9 ) ) ) ) | ({...}? => ( ( ( rule__ParserModel__StartAssignment_0_10 ) ) ) ) )
            {
            // InternalParser.g:2815:3: ( ({...}? => ( ( ( rule__ParserModel__ScannerAssignment_0_0 ) ) ) ) | ({...}? => ( ( ( rule__ParserModel__ParserAssignment_0_1 ) ) ) ) | ({...}? => ( ( ( rule__ParserModel__ImportBlockAssignment_0_2 ) ) ) ) | ({...}? => ( ( ( rule__ParserModel__ExportBlockAssignment_0_3 ) ) ) ) | ({...}? => ( ( ( rule__ParserModel__GlobalBlockAssignment_0_4 ) ) ) ) | ({...}? => ( ( ( rule__ParserModel__LocalBlockAssignment_0_5 ) ) ) ) | ({...}? => ( ( ( rule__ParserModel__BeginBlockAssignment_0_6 ) ) ) ) | ({...}? => ( ( ( rule__ParserModel__CloseBlockAssignment_0_7 ) ) ) ) | ({...}? => ( ( ( rule__ParserModel__TokensAssignment_0_8 ) ) ) ) | ({...}? => ( ( ( rule__ParserModel__PrecedencAssignment_0_9 ) ) ) ) | ({...}? => ( ( ( rule__ParserModel__StartAssignment_0_10 ) ) ) ) )
            int alt20=11;
            alt20 = dfa20.predict(input);
            switch (alt20) {
                case 1 :
                    // InternalParser.g:2816:3: ({...}? => ( ( ( rule__ParserModel__ScannerAssignment_0_0 ) ) ) )
                    {
                    // InternalParser.g:2816:3: ({...}? => ( ( ( rule__ParserModel__ScannerAssignment_0_0 ) ) ) )
                    // InternalParser.g:2817:4: {...}? => ( ( ( rule__ParserModel__ScannerAssignment_0_0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 0) ) {
                        throw new FailedPredicateException(input, "rule__ParserModel__UnorderedGroup_0__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 0)");
                    }
                    // InternalParser.g:2817:107: ( ( ( rule__ParserModel__ScannerAssignment_0_0 ) ) )
                    // InternalParser.g:2818:5: ( ( rule__ParserModel__ScannerAssignment_0_0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 0);
                    				

                    					selected = true;
                    				
                    // InternalParser.g:2824:5: ( ( rule__ParserModel__ScannerAssignment_0_0 ) )
                    // InternalParser.g:2825:6: ( rule__ParserModel__ScannerAssignment_0_0 )
                    {
                     before(grammarAccess.getParserModelAccess().getScannerAssignment_0_0()); 
                    // InternalParser.g:2826:6: ( rule__ParserModel__ScannerAssignment_0_0 )
                    // InternalParser.g:2826:7: rule__ParserModel__ScannerAssignment_0_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ParserModel__ScannerAssignment_0_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getParserModelAccess().getScannerAssignment_0_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalParser.g:2831:3: ({...}? => ( ( ( rule__ParserModel__ParserAssignment_0_1 ) ) ) )
                    {
                    // InternalParser.g:2831:3: ({...}? => ( ( ( rule__ParserModel__ParserAssignment_0_1 ) ) ) )
                    // InternalParser.g:2832:4: {...}? => ( ( ( rule__ParserModel__ParserAssignment_0_1 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 1) ) {
                        throw new FailedPredicateException(input, "rule__ParserModel__UnorderedGroup_0__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 1)");
                    }
                    // InternalParser.g:2832:107: ( ( ( rule__ParserModel__ParserAssignment_0_1 ) ) )
                    // InternalParser.g:2833:5: ( ( rule__ParserModel__ParserAssignment_0_1 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 1);
                    				

                    					selected = true;
                    				
                    // InternalParser.g:2839:5: ( ( rule__ParserModel__ParserAssignment_0_1 ) )
                    // InternalParser.g:2840:6: ( rule__ParserModel__ParserAssignment_0_1 )
                    {
                     before(grammarAccess.getParserModelAccess().getParserAssignment_0_1()); 
                    // InternalParser.g:2841:6: ( rule__ParserModel__ParserAssignment_0_1 )
                    // InternalParser.g:2841:7: rule__ParserModel__ParserAssignment_0_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__ParserModel__ParserAssignment_0_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getParserModelAccess().getParserAssignment_0_1()); 

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalParser.g:2846:3: ({...}? => ( ( ( rule__ParserModel__ImportBlockAssignment_0_2 ) ) ) )
                    {
                    // InternalParser.g:2846:3: ({...}? => ( ( ( rule__ParserModel__ImportBlockAssignment_0_2 ) ) ) )
                    // InternalParser.g:2847:4: {...}? => ( ( ( rule__ParserModel__ImportBlockAssignment_0_2 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 2) ) {
                        throw new FailedPredicateException(input, "rule__ParserModel__UnorderedGroup_0__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 2)");
                    }
                    // InternalParser.g:2847:107: ( ( ( rule__ParserModel__ImportBlockAssignment_0_2 ) ) )
                    // InternalParser.g:2848:5: ( ( rule__ParserModel__ImportBlockAssignment_0_2 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 2);
                    				

                    					selected = true;
                    				
                    // InternalParser.g:2854:5: ( ( rule__ParserModel__ImportBlockAssignment_0_2 ) )
                    // InternalParser.g:2855:6: ( rule__ParserModel__ImportBlockAssignment_0_2 )
                    {
                     before(grammarAccess.getParserModelAccess().getImportBlockAssignment_0_2()); 
                    // InternalParser.g:2856:6: ( rule__ParserModel__ImportBlockAssignment_0_2 )
                    // InternalParser.g:2856:7: rule__ParserModel__ImportBlockAssignment_0_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__ParserModel__ImportBlockAssignment_0_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getParserModelAccess().getImportBlockAssignment_0_2()); 

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalParser.g:2861:3: ({...}? => ( ( ( rule__ParserModel__ExportBlockAssignment_0_3 ) ) ) )
                    {
                    // InternalParser.g:2861:3: ({...}? => ( ( ( rule__ParserModel__ExportBlockAssignment_0_3 ) ) ) )
                    // InternalParser.g:2862:4: {...}? => ( ( ( rule__ParserModel__ExportBlockAssignment_0_3 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 3) ) {
                        throw new FailedPredicateException(input, "rule__ParserModel__UnorderedGroup_0__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 3)");
                    }
                    // InternalParser.g:2862:107: ( ( ( rule__ParserModel__ExportBlockAssignment_0_3 ) ) )
                    // InternalParser.g:2863:5: ( ( rule__ParserModel__ExportBlockAssignment_0_3 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 3);
                    				

                    					selected = true;
                    				
                    // InternalParser.g:2869:5: ( ( rule__ParserModel__ExportBlockAssignment_0_3 ) )
                    // InternalParser.g:2870:6: ( rule__ParserModel__ExportBlockAssignment_0_3 )
                    {
                     before(grammarAccess.getParserModelAccess().getExportBlockAssignment_0_3()); 
                    // InternalParser.g:2871:6: ( rule__ParserModel__ExportBlockAssignment_0_3 )
                    // InternalParser.g:2871:7: rule__ParserModel__ExportBlockAssignment_0_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__ParserModel__ExportBlockAssignment_0_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getParserModelAccess().getExportBlockAssignment_0_3()); 

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalParser.g:2876:3: ({...}? => ( ( ( rule__ParserModel__GlobalBlockAssignment_0_4 ) ) ) )
                    {
                    // InternalParser.g:2876:3: ({...}? => ( ( ( rule__ParserModel__GlobalBlockAssignment_0_4 ) ) ) )
                    // InternalParser.g:2877:4: {...}? => ( ( ( rule__ParserModel__GlobalBlockAssignment_0_4 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 4) ) {
                        throw new FailedPredicateException(input, "rule__ParserModel__UnorderedGroup_0__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 4)");
                    }
                    // InternalParser.g:2877:107: ( ( ( rule__ParserModel__GlobalBlockAssignment_0_4 ) ) )
                    // InternalParser.g:2878:5: ( ( rule__ParserModel__GlobalBlockAssignment_0_4 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 4);
                    				

                    					selected = true;
                    				
                    // InternalParser.g:2884:5: ( ( rule__ParserModel__GlobalBlockAssignment_0_4 ) )
                    // InternalParser.g:2885:6: ( rule__ParserModel__GlobalBlockAssignment_0_4 )
                    {
                     before(grammarAccess.getParserModelAccess().getGlobalBlockAssignment_0_4()); 
                    // InternalParser.g:2886:6: ( rule__ParserModel__GlobalBlockAssignment_0_4 )
                    // InternalParser.g:2886:7: rule__ParserModel__GlobalBlockAssignment_0_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__ParserModel__GlobalBlockAssignment_0_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getParserModelAccess().getGlobalBlockAssignment_0_4()); 

                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalParser.g:2891:3: ({...}? => ( ( ( rule__ParserModel__LocalBlockAssignment_0_5 ) ) ) )
                    {
                    // InternalParser.g:2891:3: ({...}? => ( ( ( rule__ParserModel__LocalBlockAssignment_0_5 ) ) ) )
                    // InternalParser.g:2892:4: {...}? => ( ( ( rule__ParserModel__LocalBlockAssignment_0_5 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 5) ) {
                        throw new FailedPredicateException(input, "rule__ParserModel__UnorderedGroup_0__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 5)");
                    }
                    // InternalParser.g:2892:107: ( ( ( rule__ParserModel__LocalBlockAssignment_0_5 ) ) )
                    // InternalParser.g:2893:5: ( ( rule__ParserModel__LocalBlockAssignment_0_5 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 5);
                    				

                    					selected = true;
                    				
                    // InternalParser.g:2899:5: ( ( rule__ParserModel__LocalBlockAssignment_0_5 ) )
                    // InternalParser.g:2900:6: ( rule__ParserModel__LocalBlockAssignment_0_5 )
                    {
                     before(grammarAccess.getParserModelAccess().getLocalBlockAssignment_0_5()); 
                    // InternalParser.g:2901:6: ( rule__ParserModel__LocalBlockAssignment_0_5 )
                    // InternalParser.g:2901:7: rule__ParserModel__LocalBlockAssignment_0_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__ParserModel__LocalBlockAssignment_0_5();

                    state._fsp--;


                    }

                     after(grammarAccess.getParserModelAccess().getLocalBlockAssignment_0_5()); 

                    }


                    }


                    }


                    }
                    break;
                case 7 :
                    // InternalParser.g:2906:3: ({...}? => ( ( ( rule__ParserModel__BeginBlockAssignment_0_6 ) ) ) )
                    {
                    // InternalParser.g:2906:3: ({...}? => ( ( ( rule__ParserModel__BeginBlockAssignment_0_6 ) ) ) )
                    // InternalParser.g:2907:4: {...}? => ( ( ( rule__ParserModel__BeginBlockAssignment_0_6 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 6) ) {
                        throw new FailedPredicateException(input, "rule__ParserModel__UnorderedGroup_0__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 6)");
                    }
                    // InternalParser.g:2907:107: ( ( ( rule__ParserModel__BeginBlockAssignment_0_6 ) ) )
                    // InternalParser.g:2908:5: ( ( rule__ParserModel__BeginBlockAssignment_0_6 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 6);
                    				

                    					selected = true;
                    				
                    // InternalParser.g:2914:5: ( ( rule__ParserModel__BeginBlockAssignment_0_6 ) )
                    // InternalParser.g:2915:6: ( rule__ParserModel__BeginBlockAssignment_0_6 )
                    {
                     before(grammarAccess.getParserModelAccess().getBeginBlockAssignment_0_6()); 
                    // InternalParser.g:2916:6: ( rule__ParserModel__BeginBlockAssignment_0_6 )
                    // InternalParser.g:2916:7: rule__ParserModel__BeginBlockAssignment_0_6
                    {
                    pushFollow(FOLLOW_2);
                    rule__ParserModel__BeginBlockAssignment_0_6();

                    state._fsp--;


                    }

                     after(grammarAccess.getParserModelAccess().getBeginBlockAssignment_0_6()); 

                    }


                    }


                    }


                    }
                    break;
                case 8 :
                    // InternalParser.g:2921:3: ({...}? => ( ( ( rule__ParserModel__CloseBlockAssignment_0_7 ) ) ) )
                    {
                    // InternalParser.g:2921:3: ({...}? => ( ( ( rule__ParserModel__CloseBlockAssignment_0_7 ) ) ) )
                    // InternalParser.g:2922:4: {...}? => ( ( ( rule__ParserModel__CloseBlockAssignment_0_7 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 7) ) {
                        throw new FailedPredicateException(input, "rule__ParserModel__UnorderedGroup_0__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 7)");
                    }
                    // InternalParser.g:2922:107: ( ( ( rule__ParserModel__CloseBlockAssignment_0_7 ) ) )
                    // InternalParser.g:2923:5: ( ( rule__ParserModel__CloseBlockAssignment_0_7 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 7);
                    				

                    					selected = true;
                    				
                    // InternalParser.g:2929:5: ( ( rule__ParserModel__CloseBlockAssignment_0_7 ) )
                    // InternalParser.g:2930:6: ( rule__ParserModel__CloseBlockAssignment_0_7 )
                    {
                     before(grammarAccess.getParserModelAccess().getCloseBlockAssignment_0_7()); 
                    // InternalParser.g:2931:6: ( rule__ParserModel__CloseBlockAssignment_0_7 )
                    // InternalParser.g:2931:7: rule__ParserModel__CloseBlockAssignment_0_7
                    {
                    pushFollow(FOLLOW_2);
                    rule__ParserModel__CloseBlockAssignment_0_7();

                    state._fsp--;


                    }

                     after(grammarAccess.getParserModelAccess().getCloseBlockAssignment_0_7()); 

                    }


                    }


                    }


                    }
                    break;
                case 9 :
                    // InternalParser.g:2936:3: ({...}? => ( ( ( rule__ParserModel__TokensAssignment_0_8 ) ) ) )
                    {
                    // InternalParser.g:2936:3: ({...}? => ( ( ( rule__ParserModel__TokensAssignment_0_8 ) ) ) )
                    // InternalParser.g:2937:4: {...}? => ( ( ( rule__ParserModel__TokensAssignment_0_8 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 8) ) {
                        throw new FailedPredicateException(input, "rule__ParserModel__UnorderedGroup_0__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 8)");
                    }
                    // InternalParser.g:2937:107: ( ( ( rule__ParserModel__TokensAssignment_0_8 ) ) )
                    // InternalParser.g:2938:5: ( ( rule__ParserModel__TokensAssignment_0_8 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 8);
                    				

                    					selected = true;
                    				
                    // InternalParser.g:2944:5: ( ( rule__ParserModel__TokensAssignment_0_8 ) )
                    // InternalParser.g:2945:6: ( rule__ParserModel__TokensAssignment_0_8 )
                    {
                     before(grammarAccess.getParserModelAccess().getTokensAssignment_0_8()); 
                    // InternalParser.g:2946:6: ( rule__ParserModel__TokensAssignment_0_8 )
                    // InternalParser.g:2946:7: rule__ParserModel__TokensAssignment_0_8
                    {
                    pushFollow(FOLLOW_2);
                    rule__ParserModel__TokensAssignment_0_8();

                    state._fsp--;


                    }

                     after(grammarAccess.getParserModelAccess().getTokensAssignment_0_8()); 

                    }


                    }


                    }


                    }
                    break;
                case 10 :
                    // InternalParser.g:2951:3: ({...}? => ( ( ( rule__ParserModel__PrecedencAssignment_0_9 ) ) ) )
                    {
                    // InternalParser.g:2951:3: ({...}? => ( ( ( rule__ParserModel__PrecedencAssignment_0_9 ) ) ) )
                    // InternalParser.g:2952:4: {...}? => ( ( ( rule__ParserModel__PrecedencAssignment_0_9 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 9) ) {
                        throw new FailedPredicateException(input, "rule__ParserModel__UnorderedGroup_0__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 9)");
                    }
                    // InternalParser.g:2952:107: ( ( ( rule__ParserModel__PrecedencAssignment_0_9 ) ) )
                    // InternalParser.g:2953:5: ( ( rule__ParserModel__PrecedencAssignment_0_9 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 9);
                    				

                    					selected = true;
                    				
                    // InternalParser.g:2959:5: ( ( rule__ParserModel__PrecedencAssignment_0_9 ) )
                    // InternalParser.g:2960:6: ( rule__ParserModel__PrecedencAssignment_0_9 )
                    {
                     before(grammarAccess.getParserModelAccess().getPrecedencAssignment_0_9()); 
                    // InternalParser.g:2961:6: ( rule__ParserModel__PrecedencAssignment_0_9 )
                    // InternalParser.g:2961:7: rule__ParserModel__PrecedencAssignment_0_9
                    {
                    pushFollow(FOLLOW_2);
                    rule__ParserModel__PrecedencAssignment_0_9();

                    state._fsp--;


                    }

                     after(grammarAccess.getParserModelAccess().getPrecedencAssignment_0_9()); 

                    }


                    }


                    }


                    }
                    break;
                case 11 :
                    // InternalParser.g:2966:3: ({...}? => ( ( ( rule__ParserModel__StartAssignment_0_10 ) ) ) )
                    {
                    // InternalParser.g:2966:3: ({...}? => ( ( ( rule__ParserModel__StartAssignment_0_10 ) ) ) )
                    // InternalParser.g:2967:4: {...}? => ( ( ( rule__ParserModel__StartAssignment_0_10 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 10) ) {
                        throw new FailedPredicateException(input, "rule__ParserModel__UnorderedGroup_0__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 10)");
                    }
                    // InternalParser.g:2967:108: ( ( ( rule__ParserModel__StartAssignment_0_10 ) ) )
                    // InternalParser.g:2968:5: ( ( rule__ParserModel__StartAssignment_0_10 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 10);
                    				

                    					selected = true;
                    				
                    // InternalParser.g:2974:5: ( ( rule__ParserModel__StartAssignment_0_10 ) )
                    // InternalParser.g:2975:6: ( rule__ParserModel__StartAssignment_0_10 )
                    {
                     before(grammarAccess.getParserModelAccess().getStartAssignment_0_10()); 
                    // InternalParser.g:2976:6: ( rule__ParserModel__StartAssignment_0_10 )
                    // InternalParser.g:2976:7: rule__ParserModel__StartAssignment_0_10
                    {
                    pushFollow(FOLLOW_2);
                    rule__ParserModel__StartAssignment_0_10();

                    state._fsp--;


                    }

                     after(grammarAccess.getParserModelAccess().getStartAssignment_0_10()); 

                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getParserModelAccess().getUnorderedGroup_0());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParserModel__UnorderedGroup_0__Impl"


    // $ANTLR start "rule__ParserModel__UnorderedGroup_0__0"
    // InternalParser.g:2989:1: rule__ParserModel__UnorderedGroup_0__0 : rule__ParserModel__UnorderedGroup_0__Impl ( rule__ParserModel__UnorderedGroup_0__1 )? ;
    public final void rule__ParserModel__UnorderedGroup_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:2993:1: ( rule__ParserModel__UnorderedGroup_0__Impl ( rule__ParserModel__UnorderedGroup_0__1 )? )
            // InternalParser.g:2994:2: rule__ParserModel__UnorderedGroup_0__Impl ( rule__ParserModel__UnorderedGroup_0__1 )?
            {
            pushFollow(FOLLOW_25);
            rule__ParserModel__UnorderedGroup_0__Impl();

            state._fsp--;

            // InternalParser.g:2995:2: ( rule__ParserModel__UnorderedGroup_0__1 )?
            int alt21=2;
            alt21 = dfa21.predict(input);
            switch (alt21) {
                case 1 :
                    // InternalParser.g:2995:2: rule__ParserModel__UnorderedGroup_0__1
                    {
                    pushFollow(FOLLOW_2);
                    rule__ParserModel__UnorderedGroup_0__1();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParserModel__UnorderedGroup_0__0"


    // $ANTLR start "rule__ParserModel__UnorderedGroup_0__1"
    // InternalParser.g:3001:1: rule__ParserModel__UnorderedGroup_0__1 : rule__ParserModel__UnorderedGroup_0__Impl ( rule__ParserModel__UnorderedGroup_0__2 )? ;
    public final void rule__ParserModel__UnorderedGroup_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:3005:1: ( rule__ParserModel__UnorderedGroup_0__Impl ( rule__ParserModel__UnorderedGroup_0__2 )? )
            // InternalParser.g:3006:2: rule__ParserModel__UnorderedGroup_0__Impl ( rule__ParserModel__UnorderedGroup_0__2 )?
            {
            pushFollow(FOLLOW_25);
            rule__ParserModel__UnorderedGroup_0__Impl();

            state._fsp--;

            // InternalParser.g:3007:2: ( rule__ParserModel__UnorderedGroup_0__2 )?
            int alt22=2;
            alt22 = dfa22.predict(input);
            switch (alt22) {
                case 1 :
                    // InternalParser.g:3007:2: rule__ParserModel__UnorderedGroup_0__2
                    {
                    pushFollow(FOLLOW_2);
                    rule__ParserModel__UnorderedGroup_0__2();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParserModel__UnorderedGroup_0__1"


    // $ANTLR start "rule__ParserModel__UnorderedGroup_0__2"
    // InternalParser.g:3013:1: rule__ParserModel__UnorderedGroup_0__2 : rule__ParserModel__UnorderedGroup_0__Impl ( rule__ParserModel__UnorderedGroup_0__3 )? ;
    public final void rule__ParserModel__UnorderedGroup_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:3017:1: ( rule__ParserModel__UnorderedGroup_0__Impl ( rule__ParserModel__UnorderedGroup_0__3 )? )
            // InternalParser.g:3018:2: rule__ParserModel__UnorderedGroup_0__Impl ( rule__ParserModel__UnorderedGroup_0__3 )?
            {
            pushFollow(FOLLOW_25);
            rule__ParserModel__UnorderedGroup_0__Impl();

            state._fsp--;

            // InternalParser.g:3019:2: ( rule__ParserModel__UnorderedGroup_0__3 )?
            int alt23=2;
            alt23 = dfa23.predict(input);
            switch (alt23) {
                case 1 :
                    // InternalParser.g:3019:2: rule__ParserModel__UnorderedGroup_0__3
                    {
                    pushFollow(FOLLOW_2);
                    rule__ParserModel__UnorderedGroup_0__3();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParserModel__UnorderedGroup_0__2"


    // $ANTLR start "rule__ParserModel__UnorderedGroup_0__3"
    // InternalParser.g:3025:1: rule__ParserModel__UnorderedGroup_0__3 : rule__ParserModel__UnorderedGroup_0__Impl ( rule__ParserModel__UnorderedGroup_0__4 )? ;
    public final void rule__ParserModel__UnorderedGroup_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:3029:1: ( rule__ParserModel__UnorderedGroup_0__Impl ( rule__ParserModel__UnorderedGroup_0__4 )? )
            // InternalParser.g:3030:2: rule__ParserModel__UnorderedGroup_0__Impl ( rule__ParserModel__UnorderedGroup_0__4 )?
            {
            pushFollow(FOLLOW_25);
            rule__ParserModel__UnorderedGroup_0__Impl();

            state._fsp--;

            // InternalParser.g:3031:2: ( rule__ParserModel__UnorderedGroup_0__4 )?
            int alt24=2;
            alt24 = dfa24.predict(input);
            switch (alt24) {
                case 1 :
                    // InternalParser.g:3031:2: rule__ParserModel__UnorderedGroup_0__4
                    {
                    pushFollow(FOLLOW_2);
                    rule__ParserModel__UnorderedGroup_0__4();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParserModel__UnorderedGroup_0__3"


    // $ANTLR start "rule__ParserModel__UnorderedGroup_0__4"
    // InternalParser.g:3037:1: rule__ParserModel__UnorderedGroup_0__4 : rule__ParserModel__UnorderedGroup_0__Impl ( rule__ParserModel__UnorderedGroup_0__5 )? ;
    public final void rule__ParserModel__UnorderedGroup_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:3041:1: ( rule__ParserModel__UnorderedGroup_0__Impl ( rule__ParserModel__UnorderedGroup_0__5 )? )
            // InternalParser.g:3042:2: rule__ParserModel__UnorderedGroup_0__Impl ( rule__ParserModel__UnorderedGroup_0__5 )?
            {
            pushFollow(FOLLOW_25);
            rule__ParserModel__UnorderedGroup_0__Impl();

            state._fsp--;

            // InternalParser.g:3043:2: ( rule__ParserModel__UnorderedGroup_0__5 )?
            int alt25=2;
            alt25 = dfa25.predict(input);
            switch (alt25) {
                case 1 :
                    // InternalParser.g:3043:2: rule__ParserModel__UnorderedGroup_0__5
                    {
                    pushFollow(FOLLOW_2);
                    rule__ParserModel__UnorderedGroup_0__5();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParserModel__UnorderedGroup_0__4"


    // $ANTLR start "rule__ParserModel__UnorderedGroup_0__5"
    // InternalParser.g:3049:1: rule__ParserModel__UnorderedGroup_0__5 : rule__ParserModel__UnorderedGroup_0__Impl ( rule__ParserModel__UnorderedGroup_0__6 )? ;
    public final void rule__ParserModel__UnorderedGroup_0__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:3053:1: ( rule__ParserModel__UnorderedGroup_0__Impl ( rule__ParserModel__UnorderedGroup_0__6 )? )
            // InternalParser.g:3054:2: rule__ParserModel__UnorderedGroup_0__Impl ( rule__ParserModel__UnorderedGroup_0__6 )?
            {
            pushFollow(FOLLOW_25);
            rule__ParserModel__UnorderedGroup_0__Impl();

            state._fsp--;

            // InternalParser.g:3055:2: ( rule__ParserModel__UnorderedGroup_0__6 )?
            int alt26=2;
            alt26 = dfa26.predict(input);
            switch (alt26) {
                case 1 :
                    // InternalParser.g:3055:2: rule__ParserModel__UnorderedGroup_0__6
                    {
                    pushFollow(FOLLOW_2);
                    rule__ParserModel__UnorderedGroup_0__6();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParserModel__UnorderedGroup_0__5"


    // $ANTLR start "rule__ParserModel__UnorderedGroup_0__6"
    // InternalParser.g:3061:1: rule__ParserModel__UnorderedGroup_0__6 : rule__ParserModel__UnorderedGroup_0__Impl ( rule__ParserModel__UnorderedGroup_0__7 )? ;
    public final void rule__ParserModel__UnorderedGroup_0__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:3065:1: ( rule__ParserModel__UnorderedGroup_0__Impl ( rule__ParserModel__UnorderedGroup_0__7 )? )
            // InternalParser.g:3066:2: rule__ParserModel__UnorderedGroup_0__Impl ( rule__ParserModel__UnorderedGroup_0__7 )?
            {
            pushFollow(FOLLOW_25);
            rule__ParserModel__UnorderedGroup_0__Impl();

            state._fsp--;

            // InternalParser.g:3067:2: ( rule__ParserModel__UnorderedGroup_0__7 )?
            int alt27=2;
            alt27 = dfa27.predict(input);
            switch (alt27) {
                case 1 :
                    // InternalParser.g:3067:2: rule__ParserModel__UnorderedGroup_0__7
                    {
                    pushFollow(FOLLOW_2);
                    rule__ParserModel__UnorderedGroup_0__7();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParserModel__UnorderedGroup_0__6"


    // $ANTLR start "rule__ParserModel__UnorderedGroup_0__7"
    // InternalParser.g:3073:1: rule__ParserModel__UnorderedGroup_0__7 : rule__ParserModel__UnorderedGroup_0__Impl ( rule__ParserModel__UnorderedGroup_0__8 )? ;
    public final void rule__ParserModel__UnorderedGroup_0__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:3077:1: ( rule__ParserModel__UnorderedGroup_0__Impl ( rule__ParserModel__UnorderedGroup_0__8 )? )
            // InternalParser.g:3078:2: rule__ParserModel__UnorderedGroup_0__Impl ( rule__ParserModel__UnorderedGroup_0__8 )?
            {
            pushFollow(FOLLOW_25);
            rule__ParserModel__UnorderedGroup_0__Impl();

            state._fsp--;

            // InternalParser.g:3079:2: ( rule__ParserModel__UnorderedGroup_0__8 )?
            int alt28=2;
            alt28 = dfa28.predict(input);
            switch (alt28) {
                case 1 :
                    // InternalParser.g:3079:2: rule__ParserModel__UnorderedGroup_0__8
                    {
                    pushFollow(FOLLOW_2);
                    rule__ParserModel__UnorderedGroup_0__8();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParserModel__UnorderedGroup_0__7"


    // $ANTLR start "rule__ParserModel__UnorderedGroup_0__8"
    // InternalParser.g:3085:1: rule__ParserModel__UnorderedGroup_0__8 : rule__ParserModel__UnorderedGroup_0__Impl ( rule__ParserModel__UnorderedGroup_0__9 )? ;
    public final void rule__ParserModel__UnorderedGroup_0__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:3089:1: ( rule__ParserModel__UnorderedGroup_0__Impl ( rule__ParserModel__UnorderedGroup_0__9 )? )
            // InternalParser.g:3090:2: rule__ParserModel__UnorderedGroup_0__Impl ( rule__ParserModel__UnorderedGroup_0__9 )?
            {
            pushFollow(FOLLOW_25);
            rule__ParserModel__UnorderedGroup_0__Impl();

            state._fsp--;

            // InternalParser.g:3091:2: ( rule__ParserModel__UnorderedGroup_0__9 )?
            int alt29=2;
            alt29 = dfa29.predict(input);
            switch (alt29) {
                case 1 :
                    // InternalParser.g:3091:2: rule__ParserModel__UnorderedGroup_0__9
                    {
                    pushFollow(FOLLOW_2);
                    rule__ParserModel__UnorderedGroup_0__9();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParserModel__UnorderedGroup_0__8"


    // $ANTLR start "rule__ParserModel__UnorderedGroup_0__9"
    // InternalParser.g:3097:1: rule__ParserModel__UnorderedGroup_0__9 : rule__ParserModel__UnorderedGroup_0__Impl ( rule__ParserModel__UnorderedGroup_0__10 )? ;
    public final void rule__ParserModel__UnorderedGroup_0__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:3101:1: ( rule__ParserModel__UnorderedGroup_0__Impl ( rule__ParserModel__UnorderedGroup_0__10 )? )
            // InternalParser.g:3102:2: rule__ParserModel__UnorderedGroup_0__Impl ( rule__ParserModel__UnorderedGroup_0__10 )?
            {
            pushFollow(FOLLOW_25);
            rule__ParserModel__UnorderedGroup_0__Impl();

            state._fsp--;

            // InternalParser.g:3103:2: ( rule__ParserModel__UnorderedGroup_0__10 )?
            int alt30=2;
            alt30 = dfa30.predict(input);
            switch (alt30) {
                case 1 :
                    // InternalParser.g:3103:2: rule__ParserModel__UnorderedGroup_0__10
                    {
                    pushFollow(FOLLOW_2);
                    rule__ParserModel__UnorderedGroup_0__10();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParserModel__UnorderedGroup_0__9"


    // $ANTLR start "rule__ParserModel__UnorderedGroup_0__10"
    // InternalParser.g:3109:1: rule__ParserModel__UnorderedGroup_0__10 : rule__ParserModel__UnorderedGroup_0__Impl ;
    public final void rule__ParserModel__UnorderedGroup_0__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:3113:1: ( rule__ParserModel__UnorderedGroup_0__Impl )
            // InternalParser.g:3114:2: rule__ParserModel__UnorderedGroup_0__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParserModel__UnorderedGroup_0__Impl();

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
    // $ANTLR end "rule__ParserModel__UnorderedGroup_0__10"


    // $ANTLR start "rule__RuleCode__UnorderedGroup"
    // InternalParser.g:3121:1: rule__RuleCode__UnorderedGroup : ( rule__RuleCode__UnorderedGroup__0 )? ;
    public final void rule__RuleCode__UnorderedGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getRuleCodeAccess().getUnorderedGroup());
        	
        try {
            // InternalParser.g:3126:1: ( ( rule__RuleCode__UnorderedGroup__0 )? )
            // InternalParser.g:3127:2: ( rule__RuleCode__UnorderedGroup__0 )?
            {
            // InternalParser.g:3127:2: ( rule__RuleCode__UnorderedGroup__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( LA31_0 == 39 && getUnorderedGroupHelper().canSelect(grammarAccess.getRuleCodeAccess().getUnorderedGroup(), 0) ) {
                alt31=1;
            }
            else if ( LA31_0 == 49 && getUnorderedGroupHelper().canSelect(grammarAccess.getRuleCodeAccess().getUnorderedGroup(), 1) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalParser.g:3127:2: rule__RuleCode__UnorderedGroup__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RuleCode__UnorderedGroup__0();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getRuleCodeAccess().getUnorderedGroup());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleCode__UnorderedGroup"


    // $ANTLR start "rule__RuleCode__UnorderedGroup__Impl"
    // InternalParser.g:3135:1: rule__RuleCode__UnorderedGroup__Impl : ( ({...}? => ( ( ( rule__RuleCode__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__RuleCode__Group_1__0 ) ) ) ) ) ;
    public final void rule__RuleCode__UnorderedGroup__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalParser.g:3140:1: ( ( ({...}? => ( ( ( rule__RuleCode__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__RuleCode__Group_1__0 ) ) ) ) ) )
            // InternalParser.g:3141:3: ( ({...}? => ( ( ( rule__RuleCode__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__RuleCode__Group_1__0 ) ) ) ) )
            {
            // InternalParser.g:3141:3: ( ({...}? => ( ( ( rule__RuleCode__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__RuleCode__Group_1__0 ) ) ) ) )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( LA32_0 == 39 && getUnorderedGroupHelper().canSelect(grammarAccess.getRuleCodeAccess().getUnorderedGroup(), 0) ) {
                alt32=1;
            }
            else if ( LA32_0 == 49 && getUnorderedGroupHelper().canSelect(grammarAccess.getRuleCodeAccess().getUnorderedGroup(), 1) ) {
                alt32=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // InternalParser.g:3142:3: ({...}? => ( ( ( rule__RuleCode__Group_0__0 ) ) ) )
                    {
                    // InternalParser.g:3142:3: ({...}? => ( ( ( rule__RuleCode__Group_0__0 ) ) ) )
                    // InternalParser.g:3143:4: {...}? => ( ( ( rule__RuleCode__Group_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRuleCodeAccess().getUnorderedGroup(), 0) ) {
                        throw new FailedPredicateException(input, "rule__RuleCode__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getRuleCodeAccess().getUnorderedGroup(), 0)");
                    }
                    // InternalParser.g:3143:102: ( ( ( rule__RuleCode__Group_0__0 ) ) )
                    // InternalParser.g:3144:5: ( ( rule__RuleCode__Group_0__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getRuleCodeAccess().getUnorderedGroup(), 0);
                    				

                    					selected = true;
                    				
                    // InternalParser.g:3150:5: ( ( rule__RuleCode__Group_0__0 ) )
                    // InternalParser.g:3151:6: ( rule__RuleCode__Group_0__0 )
                    {
                     before(grammarAccess.getRuleCodeAccess().getGroup_0()); 
                    // InternalParser.g:3152:6: ( rule__RuleCode__Group_0__0 )
                    // InternalParser.g:3152:7: rule__RuleCode__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RuleCode__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRuleCodeAccess().getGroup_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalParser.g:3157:3: ({...}? => ( ( ( rule__RuleCode__Group_1__0 ) ) ) )
                    {
                    // InternalParser.g:3157:3: ({...}? => ( ( ( rule__RuleCode__Group_1__0 ) ) ) )
                    // InternalParser.g:3158:4: {...}? => ( ( ( rule__RuleCode__Group_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRuleCodeAccess().getUnorderedGroup(), 1) ) {
                        throw new FailedPredicateException(input, "rule__RuleCode__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getRuleCodeAccess().getUnorderedGroup(), 1)");
                    }
                    // InternalParser.g:3158:102: ( ( ( rule__RuleCode__Group_1__0 ) ) )
                    // InternalParser.g:3159:5: ( ( rule__RuleCode__Group_1__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getRuleCodeAccess().getUnorderedGroup(), 1);
                    				

                    					selected = true;
                    				
                    // InternalParser.g:3165:5: ( ( rule__RuleCode__Group_1__0 ) )
                    // InternalParser.g:3166:6: ( rule__RuleCode__Group_1__0 )
                    {
                     before(grammarAccess.getRuleCodeAccess().getGroup_1()); 
                    // InternalParser.g:3167:6: ( rule__RuleCode__Group_1__0 )
                    // InternalParser.g:3167:7: rule__RuleCode__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RuleCode__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRuleCodeAccess().getGroup_1()); 

                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRuleCodeAccess().getUnorderedGroup());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleCode__UnorderedGroup__Impl"


    // $ANTLR start "rule__RuleCode__UnorderedGroup__0"
    // InternalParser.g:3180:1: rule__RuleCode__UnorderedGroup__0 : rule__RuleCode__UnorderedGroup__Impl ( rule__RuleCode__UnorderedGroup__1 )? ;
    public final void rule__RuleCode__UnorderedGroup__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:3184:1: ( rule__RuleCode__UnorderedGroup__Impl ( rule__RuleCode__UnorderedGroup__1 )? )
            // InternalParser.g:3185:2: rule__RuleCode__UnorderedGroup__Impl ( rule__RuleCode__UnorderedGroup__1 )?
            {
            pushFollow(FOLLOW_26);
            rule__RuleCode__UnorderedGroup__Impl();

            state._fsp--;

            // InternalParser.g:3186:2: ( rule__RuleCode__UnorderedGroup__1 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( LA33_0 == 39 && getUnorderedGroupHelper().canSelect(grammarAccess.getRuleCodeAccess().getUnorderedGroup(), 0) ) {
                alt33=1;
            }
            else if ( LA33_0 == 49 && getUnorderedGroupHelper().canSelect(grammarAccess.getRuleCodeAccess().getUnorderedGroup(), 1) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalParser.g:3186:2: rule__RuleCode__UnorderedGroup__1
                    {
                    pushFollow(FOLLOW_2);
                    rule__RuleCode__UnorderedGroup__1();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleCode__UnorderedGroup__0"


    // $ANTLR start "rule__RuleCode__UnorderedGroup__1"
    // InternalParser.g:3192:1: rule__RuleCode__UnorderedGroup__1 : rule__RuleCode__UnorderedGroup__Impl ;
    public final void rule__RuleCode__UnorderedGroup__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:3196:1: ( rule__RuleCode__UnorderedGroup__Impl )
            // InternalParser.g:3197:2: rule__RuleCode__UnorderedGroup__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RuleCode__UnorderedGroup__Impl();

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
    // $ANTLR end "rule__RuleCode__UnorderedGroup__1"


    // $ANTLR start "rule__ParserModel__ScannerAssignment_0_0"
    // InternalParser.g:3204:1: rule__ParserModel__ScannerAssignment_0_0 : ( ruleScannerName ) ;
    public final void rule__ParserModel__ScannerAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:3208:1: ( ( ruleScannerName ) )
            // InternalParser.g:3209:2: ( ruleScannerName )
            {
            // InternalParser.g:3209:2: ( ruleScannerName )
            // InternalParser.g:3210:3: ruleScannerName
            {
             before(grammarAccess.getParserModelAccess().getScannerScannerNameParserRuleCall_0_0_0()); 
            pushFollow(FOLLOW_2);
            ruleScannerName();

            state._fsp--;

             after(grammarAccess.getParserModelAccess().getScannerScannerNameParserRuleCall_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParserModel__ScannerAssignment_0_0"


    // $ANTLR start "rule__ParserModel__ParserAssignment_0_1"
    // InternalParser.g:3219:1: rule__ParserModel__ParserAssignment_0_1 : ( ruleParserName ) ;
    public final void rule__ParserModel__ParserAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:3223:1: ( ( ruleParserName ) )
            // InternalParser.g:3224:2: ( ruleParserName )
            {
            // InternalParser.g:3224:2: ( ruleParserName )
            // InternalParser.g:3225:3: ruleParserName
            {
             before(grammarAccess.getParserModelAccess().getParserParserNameParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleParserName();

            state._fsp--;

             after(grammarAccess.getParserModelAccess().getParserParserNameParserRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParserModel__ParserAssignment_0_1"


    // $ANTLR start "rule__ParserModel__ImportBlockAssignment_0_2"
    // InternalParser.g:3234:1: rule__ParserModel__ImportBlockAssignment_0_2 : ( ruleImport ) ;
    public final void rule__ParserModel__ImportBlockAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:3238:1: ( ( ruleImport ) )
            // InternalParser.g:3239:2: ( ruleImport )
            {
            // InternalParser.g:3239:2: ( ruleImport )
            // InternalParser.g:3240:3: ruleImport
            {
             before(grammarAccess.getParserModelAccess().getImportBlockImportParserRuleCall_0_2_0()); 
            pushFollow(FOLLOW_2);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getParserModelAccess().getImportBlockImportParserRuleCall_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParserModel__ImportBlockAssignment_0_2"


    // $ANTLR start "rule__ParserModel__ExportBlockAssignment_0_3"
    // InternalParser.g:3249:1: rule__ParserModel__ExportBlockAssignment_0_3 : ( ruleExport ) ;
    public final void rule__ParserModel__ExportBlockAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:3253:1: ( ( ruleExport ) )
            // InternalParser.g:3254:2: ( ruleExport )
            {
            // InternalParser.g:3254:2: ( ruleExport )
            // InternalParser.g:3255:3: ruleExport
            {
             before(grammarAccess.getParserModelAccess().getExportBlockExportParserRuleCall_0_3_0()); 
            pushFollow(FOLLOW_2);
            ruleExport();

            state._fsp--;

             after(grammarAccess.getParserModelAccess().getExportBlockExportParserRuleCall_0_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParserModel__ExportBlockAssignment_0_3"


    // $ANTLR start "rule__ParserModel__GlobalBlockAssignment_0_4"
    // InternalParser.g:3264:1: rule__ParserModel__GlobalBlockAssignment_0_4 : ( ruleGlobal ) ;
    public final void rule__ParserModel__GlobalBlockAssignment_0_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:3268:1: ( ( ruleGlobal ) )
            // InternalParser.g:3269:2: ( ruleGlobal )
            {
            // InternalParser.g:3269:2: ( ruleGlobal )
            // InternalParser.g:3270:3: ruleGlobal
            {
             before(grammarAccess.getParserModelAccess().getGlobalBlockGlobalParserRuleCall_0_4_0()); 
            pushFollow(FOLLOW_2);
            ruleGlobal();

            state._fsp--;

             after(grammarAccess.getParserModelAccess().getGlobalBlockGlobalParserRuleCall_0_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParserModel__GlobalBlockAssignment_0_4"


    // $ANTLR start "rule__ParserModel__LocalBlockAssignment_0_5"
    // InternalParser.g:3279:1: rule__ParserModel__LocalBlockAssignment_0_5 : ( ruleLocal ) ;
    public final void rule__ParserModel__LocalBlockAssignment_0_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:3283:1: ( ( ruleLocal ) )
            // InternalParser.g:3284:2: ( ruleLocal )
            {
            // InternalParser.g:3284:2: ( ruleLocal )
            // InternalParser.g:3285:3: ruleLocal
            {
             before(grammarAccess.getParserModelAccess().getLocalBlockLocalParserRuleCall_0_5_0()); 
            pushFollow(FOLLOW_2);
            ruleLocal();

            state._fsp--;

             after(grammarAccess.getParserModelAccess().getLocalBlockLocalParserRuleCall_0_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParserModel__LocalBlockAssignment_0_5"


    // $ANTLR start "rule__ParserModel__BeginBlockAssignment_0_6"
    // InternalParser.g:3294:1: rule__ParserModel__BeginBlockAssignment_0_6 : ( ruleBegin ) ;
    public final void rule__ParserModel__BeginBlockAssignment_0_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:3298:1: ( ( ruleBegin ) )
            // InternalParser.g:3299:2: ( ruleBegin )
            {
            // InternalParser.g:3299:2: ( ruleBegin )
            // InternalParser.g:3300:3: ruleBegin
            {
             before(grammarAccess.getParserModelAccess().getBeginBlockBeginParserRuleCall_0_6_0()); 
            pushFollow(FOLLOW_2);
            ruleBegin();

            state._fsp--;

             after(grammarAccess.getParserModelAccess().getBeginBlockBeginParserRuleCall_0_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParserModel__BeginBlockAssignment_0_6"


    // $ANTLR start "rule__ParserModel__CloseBlockAssignment_0_7"
    // InternalParser.g:3309:1: rule__ParserModel__CloseBlockAssignment_0_7 : ( ruleClose ) ;
    public final void rule__ParserModel__CloseBlockAssignment_0_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:3313:1: ( ( ruleClose ) )
            // InternalParser.g:3314:2: ( ruleClose )
            {
            // InternalParser.g:3314:2: ( ruleClose )
            // InternalParser.g:3315:3: ruleClose
            {
             before(grammarAccess.getParserModelAccess().getCloseBlockCloseParserRuleCall_0_7_0()); 
            pushFollow(FOLLOW_2);
            ruleClose();

            state._fsp--;

             after(grammarAccess.getParserModelAccess().getCloseBlockCloseParserRuleCall_0_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParserModel__CloseBlockAssignment_0_7"


    // $ANTLR start "rule__ParserModel__TokensAssignment_0_8"
    // InternalParser.g:3324:1: rule__ParserModel__TokensAssignment_0_8 : ( ruleTokens ) ;
    public final void rule__ParserModel__TokensAssignment_0_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:3328:1: ( ( ruleTokens ) )
            // InternalParser.g:3329:2: ( ruleTokens )
            {
            // InternalParser.g:3329:2: ( ruleTokens )
            // InternalParser.g:3330:3: ruleTokens
            {
             before(grammarAccess.getParserModelAccess().getTokensTokensParserRuleCall_0_8_0()); 
            pushFollow(FOLLOW_2);
            ruleTokens();

            state._fsp--;

             after(grammarAccess.getParserModelAccess().getTokensTokensParserRuleCall_0_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParserModel__TokensAssignment_0_8"


    // $ANTLR start "rule__ParserModel__PrecedencAssignment_0_9"
    // InternalParser.g:3339:1: rule__ParserModel__PrecedencAssignment_0_9 : ( rulePrecedence ) ;
    public final void rule__ParserModel__PrecedencAssignment_0_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:3343:1: ( ( rulePrecedence ) )
            // InternalParser.g:3344:2: ( rulePrecedence )
            {
            // InternalParser.g:3344:2: ( rulePrecedence )
            // InternalParser.g:3345:3: rulePrecedence
            {
             before(grammarAccess.getParserModelAccess().getPrecedencPrecedenceParserRuleCall_0_9_0()); 
            pushFollow(FOLLOW_2);
            rulePrecedence();

            state._fsp--;

             after(grammarAccess.getParserModelAccess().getPrecedencPrecedenceParserRuleCall_0_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParserModel__PrecedencAssignment_0_9"


    // $ANTLR start "rule__ParserModel__StartAssignment_0_10"
    // InternalParser.g:3354:1: rule__ParserModel__StartAssignment_0_10 : ( ruleStartSymbols ) ;
    public final void rule__ParserModel__StartAssignment_0_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:3358:1: ( ( ruleStartSymbols ) )
            // InternalParser.g:3359:2: ( ruleStartSymbols )
            {
            // InternalParser.g:3359:2: ( ruleStartSymbols )
            // InternalParser.g:3360:3: ruleStartSymbols
            {
             before(grammarAccess.getParserModelAccess().getStartStartSymbolsParserRuleCall_0_10_0()); 
            pushFollow(FOLLOW_2);
            ruleStartSymbols();

            state._fsp--;

             after(grammarAccess.getParserModelAccess().getStartStartSymbolsParserRuleCall_0_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParserModel__StartAssignment_0_10"


    // $ANTLR start "rule__ParserModel__RulesAssignment_1"
    // InternalParser.g:3369:1: rule__ParserModel__RulesAssignment_1 : ( ruleGrammarRules ) ;
    public final void rule__ParserModel__RulesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:3373:1: ( ( ruleGrammarRules ) )
            // InternalParser.g:3374:2: ( ruleGrammarRules )
            {
            // InternalParser.g:3374:2: ( ruleGrammarRules )
            // InternalParser.g:3375:3: ruleGrammarRules
            {
             before(grammarAccess.getParserModelAccess().getRulesGrammarRulesParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleGrammarRules();

            state._fsp--;

             after(grammarAccess.getParserModelAccess().getRulesGrammarRulesParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParserModel__RulesAssignment_1"


    // $ANTLR start "rule__ScannerName__NameAssignment_1"
    // InternalParser.g:3384:1: rule__ScannerName__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ScannerName__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:3388:1: ( ( RULE_ID ) )
            // InternalParser.g:3389:2: ( RULE_ID )
            {
            // InternalParser.g:3389:2: ( RULE_ID )
            // InternalParser.g:3390:3: RULE_ID
            {
             before(grammarAccess.getScannerNameAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getScannerNameAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScannerName__NameAssignment_1"


    // $ANTLR start "rule__ParserName__NameAssignment_1"
    // InternalParser.g:3399:1: rule__ParserName__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ParserName__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:3403:1: ( ( RULE_ID ) )
            // InternalParser.g:3404:2: ( RULE_ID )
            {
            // InternalParser.g:3404:2: ( RULE_ID )
            // InternalParser.g:3405:3: RULE_ID
            {
             before(grammarAccess.getParserNameAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getParserNameAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParserName__NameAssignment_1"


    // $ANTLR start "rule__Import__ContentAssignment_2"
    // InternalParser.g:3414:1: rule__Import__ContentAssignment_2 : ( ruleCodeBlock ) ;
    public final void rule__Import__ContentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:3418:1: ( ( ruleCodeBlock ) )
            // InternalParser.g:3419:2: ( ruleCodeBlock )
            {
            // InternalParser.g:3419:2: ( ruleCodeBlock )
            // InternalParser.g:3420:3: ruleCodeBlock
            {
             before(grammarAccess.getImportAccess().getContentCodeBlockParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleCodeBlock();

            state._fsp--;

             after(grammarAccess.getImportAccess().getContentCodeBlockParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__ContentAssignment_2"


    // $ANTLR start "rule__Export__ContentAssignment_2"
    // InternalParser.g:3429:1: rule__Export__ContentAssignment_2 : ( ruleCodeBlock ) ;
    public final void rule__Export__ContentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:3433:1: ( ( ruleCodeBlock ) )
            // InternalParser.g:3434:2: ( ruleCodeBlock )
            {
            // InternalParser.g:3434:2: ( ruleCodeBlock )
            // InternalParser.g:3435:3: ruleCodeBlock
            {
             before(grammarAccess.getExportAccess().getContentCodeBlockParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleCodeBlock();

            state._fsp--;

             after(grammarAccess.getExportAccess().getContentCodeBlockParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Export__ContentAssignment_2"


    // $ANTLR start "rule__Global__ContentAssignment_2"
    // InternalParser.g:3444:1: rule__Global__ContentAssignment_2 : ( ruleCodeBlock ) ;
    public final void rule__Global__ContentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:3448:1: ( ( ruleCodeBlock ) )
            // InternalParser.g:3449:2: ( ruleCodeBlock )
            {
            // InternalParser.g:3449:2: ( ruleCodeBlock )
            // InternalParser.g:3450:3: ruleCodeBlock
            {
             before(grammarAccess.getGlobalAccess().getContentCodeBlockParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleCodeBlock();

            state._fsp--;

             after(grammarAccess.getGlobalAccess().getContentCodeBlockParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Global__ContentAssignment_2"


    // $ANTLR start "rule__Local__ContentAssignment_2"
    // InternalParser.g:3459:1: rule__Local__ContentAssignment_2 : ( ruleCodeBlock ) ;
    public final void rule__Local__ContentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:3463:1: ( ( ruleCodeBlock ) )
            // InternalParser.g:3464:2: ( ruleCodeBlock )
            {
            // InternalParser.g:3464:2: ( ruleCodeBlock )
            // InternalParser.g:3465:3: ruleCodeBlock
            {
             before(grammarAccess.getLocalAccess().getContentCodeBlockParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleCodeBlock();

            state._fsp--;

             after(grammarAccess.getLocalAccess().getContentCodeBlockParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Local__ContentAssignment_2"


    // $ANTLR start "rule__Begin__ContentAssignment_2"
    // InternalParser.g:3474:1: rule__Begin__ContentAssignment_2 : ( ruleCodeBlock ) ;
    public final void rule__Begin__ContentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:3478:1: ( ( ruleCodeBlock ) )
            // InternalParser.g:3479:2: ( ruleCodeBlock )
            {
            // InternalParser.g:3479:2: ( ruleCodeBlock )
            // InternalParser.g:3480:3: ruleCodeBlock
            {
             before(grammarAccess.getBeginAccess().getContentCodeBlockParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleCodeBlock();

            state._fsp--;

             after(grammarAccess.getBeginAccess().getContentCodeBlockParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Begin__ContentAssignment_2"


    // $ANTLR start "rule__Close__ContentAssignment_2"
    // InternalParser.g:3489:1: rule__Close__ContentAssignment_2 : ( ruleCodeBlock ) ;
    public final void rule__Close__ContentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:3493:1: ( ( ruleCodeBlock ) )
            // InternalParser.g:3494:2: ( ruleCodeBlock )
            {
            // InternalParser.g:3494:2: ( ruleCodeBlock )
            // InternalParser.g:3495:3: ruleCodeBlock
            {
             before(grammarAccess.getCloseAccess().getContentCodeBlockParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleCodeBlock();

            state._fsp--;

             after(grammarAccess.getCloseAccess().getContentCodeBlockParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Close__ContentAssignment_2"


    // $ANTLR start "rule__Tokens__TokensAssignment_1"
    // InternalParser.g:3504:1: rule__Tokens__TokensAssignment_1 : ( ruleDefinedToken ) ;
    public final void rule__Tokens__TokensAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:3508:1: ( ( ruleDefinedToken ) )
            // InternalParser.g:3509:2: ( ruleDefinedToken )
            {
            // InternalParser.g:3509:2: ( ruleDefinedToken )
            // InternalParser.g:3510:3: ruleDefinedToken
            {
             before(grammarAccess.getTokensAccess().getTokensDefinedTokenParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDefinedToken();

            state._fsp--;

             after(grammarAccess.getTokensAccess().getTokensDefinedTokenParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tokens__TokensAssignment_1"


    // $ANTLR start "rule__DefinedToken__NameAssignment_0_0"
    // InternalParser.g:3519:1: rule__DefinedToken__NameAssignment_0_0 : ( ( rule__DefinedToken__NameAlternatives_0_0_0 ) ) ;
    public final void rule__DefinedToken__NameAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:3523:1: ( ( ( rule__DefinedToken__NameAlternatives_0_0_0 ) ) )
            // InternalParser.g:3524:2: ( ( rule__DefinedToken__NameAlternatives_0_0_0 ) )
            {
            // InternalParser.g:3524:2: ( ( rule__DefinedToken__NameAlternatives_0_0_0 ) )
            // InternalParser.g:3525:3: ( rule__DefinedToken__NameAlternatives_0_0_0 )
            {
             before(grammarAccess.getDefinedTokenAccess().getNameAlternatives_0_0_0()); 
            // InternalParser.g:3526:3: ( rule__DefinedToken__NameAlternatives_0_0_0 )
            // InternalParser.g:3526:4: rule__DefinedToken__NameAlternatives_0_0_0
            {
            pushFollow(FOLLOW_2);
            rule__DefinedToken__NameAlternatives_0_0_0();

            state._fsp--;


            }

             after(grammarAccess.getDefinedTokenAccess().getNameAlternatives_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefinedToken__NameAssignment_0_0"


    // $ANTLR start "rule__DefinedToken__NumberAssignment_0_1_1"
    // InternalParser.g:3534:1: rule__DefinedToken__NumberAssignment_0_1_1 : ( RULE_INT ) ;
    public final void rule__DefinedToken__NumberAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:3538:1: ( ( RULE_INT ) )
            // InternalParser.g:3539:2: ( RULE_INT )
            {
            // InternalParser.g:3539:2: ( RULE_INT )
            // InternalParser.g:3540:3: RULE_INT
            {
             before(grammarAccess.getDefinedTokenAccess().getNumberINTTerminalRuleCall_0_1_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getDefinedTokenAccess().getNumberINTTerminalRuleCall_0_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefinedToken__NumberAssignment_0_1_1"


    // $ANTLR start "rule__DefinedToken__ExtraAssignment_0_1_2_1"
    // InternalParser.g:3549:1: rule__DefinedToken__ExtraAssignment_0_1_2_1 : ( ruleTokenExtra ) ;
    public final void rule__DefinedToken__ExtraAssignment_0_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:3553:1: ( ( ruleTokenExtra ) )
            // InternalParser.g:3554:2: ( ruleTokenExtra )
            {
            // InternalParser.g:3554:2: ( ruleTokenExtra )
            // InternalParser.g:3555:3: ruleTokenExtra
            {
             before(grammarAccess.getDefinedTokenAccess().getExtraTokenExtraParserRuleCall_0_1_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTokenExtra();

            state._fsp--;

             after(grammarAccess.getDefinedTokenAccess().getExtraTokenExtraParserRuleCall_0_1_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefinedToken__ExtraAssignment_0_1_2_1"


    // $ANTLR start "rule__DefinedToken__ExtraAssignment_1"
    // InternalParser.g:3564:1: rule__DefinedToken__ExtraAssignment_1 : ( ruleTokenExtra ) ;
    public final void rule__DefinedToken__ExtraAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:3568:1: ( ( ruleTokenExtra ) )
            // InternalParser.g:3569:2: ( ruleTokenExtra )
            {
            // InternalParser.g:3569:2: ( ruleTokenExtra )
            // InternalParser.g:3570:3: ruleTokenExtra
            {
             before(grammarAccess.getDefinedTokenAccess().getExtraTokenExtraParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTokenExtra();

            state._fsp--;

             after(grammarAccess.getDefinedTokenAccess().getExtraTokenExtraParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefinedToken__ExtraAssignment_1"


    // $ANTLR start "rule__TokenExtra__CostAssignment_0"
    // InternalParser.g:3579:1: rule__TokenExtra__CostAssignment_0 : ( RULE_INT ) ;
    public final void rule__TokenExtra__CostAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:3583:1: ( ( RULE_INT ) )
            // InternalParser.g:3584:2: ( RULE_INT )
            {
            // InternalParser.g:3584:2: ( RULE_INT )
            // InternalParser.g:3585:3: RULE_INT
            {
             before(grammarAccess.getTokenExtraAccess().getCostINTTerminalRuleCall_0_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getTokenExtraAccess().getCostINTTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TokenExtra__CostAssignment_0"


    // $ANTLR start "rule__TokenExtra__PresentationAssignment_2"
    // InternalParser.g:3594:1: rule__TokenExtra__PresentationAssignment_2 : ( RULE_STRING ) ;
    public final void rule__TokenExtra__PresentationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:3598:1: ( ( RULE_STRING ) )
            // InternalParser.g:3599:2: ( RULE_STRING )
            {
            // InternalParser.g:3599:2: ( RULE_STRING )
            // InternalParser.g:3600:3: RULE_STRING
            {
             before(grammarAccess.getTokenExtraAccess().getPresentationSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTokenExtraAccess().getPresentationSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TokenExtra__PresentationAssignment_2"


    // $ANTLR start "rule__Precedence__RowsAssignment_1"
    // InternalParser.g:3609:1: rule__Precedence__RowsAssignment_1 : ( rulePrecedenceRow ) ;
    public final void rule__Precedence__RowsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:3613:1: ( ( rulePrecedenceRow ) )
            // InternalParser.g:3614:2: ( rulePrecedenceRow )
            {
            // InternalParser.g:3614:2: ( rulePrecedenceRow )
            // InternalParser.g:3615:3: rulePrecedenceRow
            {
             before(grammarAccess.getPrecedenceAccess().getRowsPrecedenceRowParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulePrecedenceRow();

            state._fsp--;

             after(grammarAccess.getPrecedenceAccess().getRowsPrecedenceRowParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precedence__RowsAssignment_1"


    // $ANTLR start "rule__PrecedenceRow__TypeAssignment_0"
    // InternalParser.g:3624:1: rule__PrecedenceRow__TypeAssignment_0 : ( rulePrecedenceType ) ;
    public final void rule__PrecedenceRow__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:3628:1: ( ( rulePrecedenceType ) )
            // InternalParser.g:3629:2: ( rulePrecedenceType )
            {
            // InternalParser.g:3629:2: ( rulePrecedenceType )
            // InternalParser.g:3630:3: rulePrecedenceType
            {
             before(grammarAccess.getPrecedenceRowAccess().getTypePrecedenceTypeEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            rulePrecedenceType();

            state._fsp--;

             after(grammarAccess.getPrecedenceRowAccess().getTypePrecedenceTypeEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrecedenceRow__TypeAssignment_0"


    // $ANTLR start "rule__PrecedenceRow__TokensAssignment_1"
    // InternalParser.g:3639:1: rule__PrecedenceRow__TokensAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__PrecedenceRow__TokensAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:3643:1: ( ( ( RULE_ID ) ) )
            // InternalParser.g:3644:2: ( ( RULE_ID ) )
            {
            // InternalParser.g:3644:2: ( ( RULE_ID ) )
            // InternalParser.g:3645:3: ( RULE_ID )
            {
             before(grammarAccess.getPrecedenceRowAccess().getTokensDefinedTokenCrossReference_1_0()); 
            // InternalParser.g:3646:3: ( RULE_ID )
            // InternalParser.g:3647:4: RULE_ID
            {
             before(grammarAccess.getPrecedenceRowAccess().getTokensDefinedTokenIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPrecedenceRowAccess().getTokensDefinedTokenIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getPrecedenceRowAccess().getTokensDefinedTokenCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrecedenceRow__TokensAssignment_1"


    // $ANTLR start "rule__StartSymbols__StatesAssignment_1"
    // InternalParser.g:3658:1: rule__StartSymbols__StatesAssignment_1 : ( ruleStartState ) ;
    public final void rule__StartSymbols__StatesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:3662:1: ( ( ruleStartState ) )
            // InternalParser.g:3663:2: ( ruleStartState )
            {
            // InternalParser.g:3663:2: ( ruleStartState )
            // InternalParser.g:3664:3: ruleStartState
            {
             before(grammarAccess.getStartSymbolsAccess().getStatesStartStateParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleStartState();

            state._fsp--;

             after(grammarAccess.getStartSymbolsAccess().getStatesStartStateParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartSymbols__StatesAssignment_1"


    // $ANTLR start "rule__StartState__NameAssignment"
    // InternalParser.g:3673:1: rule__StartState__NameAssignment : ( RULE_ID ) ;
    public final void rule__StartState__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:3677:1: ( ( RULE_ID ) )
            // InternalParser.g:3678:2: ( RULE_ID )
            {
            // InternalParser.g:3678:2: ( RULE_ID )
            // InternalParser.g:3679:3: RULE_ID
            {
             before(grammarAccess.getStartStateAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
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


    // $ANTLR start "rule__GrammarRules__RulesAssignment_1"
    // InternalParser.g:3688:1: rule__GrammarRules__RulesAssignment_1 : ( ruleGrammarRule ) ;
    public final void rule__GrammarRules__RulesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:3692:1: ( ( ruleGrammarRule ) )
            // InternalParser.g:3693:2: ( ruleGrammarRule )
            {
            // InternalParser.g:3693:2: ( ruleGrammarRule )
            // InternalParser.g:3694:3: ruleGrammarRule
            {
             before(grammarAccess.getGrammarRulesAccess().getRulesGrammarRuleParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleGrammarRule();

            state._fsp--;

             after(grammarAccess.getGrammarRulesAccess().getRulesGrammarRuleParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrammarRules__RulesAssignment_1"


    // $ANTLR start "rule__GrammarRule__NameAssignment_0"
    // InternalParser.g:3703:1: rule__GrammarRule__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__GrammarRule__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:3707:1: ( ( RULE_ID ) )
            // InternalParser.g:3708:2: ( RULE_ID )
            {
            // InternalParser.g:3708:2: ( RULE_ID )
            // InternalParser.g:3709:3: RULE_ID
            {
             before(grammarAccess.getGrammarRuleAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getGrammarRuleAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrammarRule__NameAssignment_0"


    // $ANTLR start "rule__GrammarRule__BodyAssignment_2"
    // InternalParser.g:3718:1: rule__GrammarRule__BodyAssignment_2 : ( ruleRuleBody ) ;
    public final void rule__GrammarRule__BodyAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:3722:1: ( ( ruleRuleBody ) )
            // InternalParser.g:3723:2: ( ruleRuleBody )
            {
            // InternalParser.g:3723:2: ( ruleRuleBody )
            // InternalParser.g:3724:3: ruleRuleBody
            {
             before(grammarAccess.getGrammarRuleAccess().getBodyRuleBodyParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRuleBody();

            state._fsp--;

             after(grammarAccess.getGrammarRuleAccess().getBodyRuleBodyParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrammarRule__BodyAssignment_2"


    // $ANTLR start "rule__GrammarRule__BodyAssignment_3_1"
    // InternalParser.g:3733:1: rule__GrammarRule__BodyAssignment_3_1 : ( ruleRuleBody ) ;
    public final void rule__GrammarRule__BodyAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:3737:1: ( ( ruleRuleBody ) )
            // InternalParser.g:3738:2: ( ruleRuleBody )
            {
            // InternalParser.g:3738:2: ( ruleRuleBody )
            // InternalParser.g:3739:3: ruleRuleBody
            {
             before(grammarAccess.getGrammarRuleAccess().getBodyRuleBodyParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRuleBody();

            state._fsp--;

             after(grammarAccess.getGrammarRuleAccess().getBodyRuleBodyParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrammarRule__BodyAssignment_3_1"


    // $ANTLR start "rule__RuleBody__PartAssignment_0"
    // InternalParser.g:3748:1: rule__RuleBody__PartAssignment_0 : ( ruleRulePart ) ;
    public final void rule__RuleBody__PartAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:3752:1: ( ( ruleRulePart ) )
            // InternalParser.g:3753:2: ( ruleRulePart )
            {
            // InternalParser.g:3753:2: ( ruleRulePart )
            // InternalParser.g:3754:3: ruleRulePart
            {
             before(grammarAccess.getRuleBodyAccess().getPartRulePartParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleRulePart();

            state._fsp--;

             after(grammarAccess.getRuleBodyAccess().getPartRulePartParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleBody__PartAssignment_0"


    // $ANTLR start "rule__RuleBody__CodeAssignment_1"
    // InternalParser.g:3763:1: rule__RuleBody__CodeAssignment_1 : ( ruleRuleCode ) ;
    public final void rule__RuleBody__CodeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:3767:1: ( ( ruleRuleCode ) )
            // InternalParser.g:3768:2: ( ruleRuleCode )
            {
            // InternalParser.g:3768:2: ( ruleRuleCode )
            // InternalParser.g:3769:3: ruleRuleCode
            {
             before(grammarAccess.getRuleBodyAccess().getCodeRuleCodeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRuleCode();

            state._fsp--;

             after(grammarAccess.getRuleBodyAccess().getCodeRuleCodeParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleBody__CodeAssignment_1"


    // $ANTLR start "rule__RuleContent__RegexAssignment_0"
    // InternalParser.g:3778:1: rule__RuleContent__RegexAssignment_0 : ( RULE_STRING ) ;
    public final void rule__RuleContent__RegexAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:3782:1: ( ( RULE_STRING ) )
            // InternalParser.g:3783:2: ( RULE_STRING )
            {
            // InternalParser.g:3783:2: ( RULE_STRING )
            // InternalParser.g:3784:3: RULE_STRING
            {
             before(grammarAccess.getRuleContentAccess().getRegexSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getRuleContentAccess().getRegexSTRINGTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleContent__RegexAssignment_0"


    // $ANTLR start "rule__RuleContent__RefAssignment_1"
    // InternalParser.g:3793:1: rule__RuleContent__RefAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__RuleContent__RefAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:3797:1: ( ( ( RULE_ID ) ) )
            // InternalParser.g:3798:2: ( ( RULE_ID ) )
            {
            // InternalParser.g:3798:2: ( ( RULE_ID ) )
            // InternalParser.g:3799:3: ( RULE_ID )
            {
             before(grammarAccess.getRuleContentAccess().getRefGrammerReferenceCrossReference_1_0()); 
            // InternalParser.g:3800:3: ( RULE_ID )
            // InternalParser.g:3801:4: RULE_ID
            {
             before(grammarAccess.getRuleContentAccess().getRefGrammerReferenceIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRuleContentAccess().getRefGrammerReferenceIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getRuleContentAccess().getRefGrammerReferenceCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleContent__RefAssignment_1"


    // $ANTLR start "rule__RulePart__ContentAssignment"
    // InternalParser.g:3812:1: rule__RulePart__ContentAssignment : ( ruleRuleContent ) ;
    public final void rule__RulePart__ContentAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:3816:1: ( ( ruleRuleContent ) )
            // InternalParser.g:3817:2: ( ruleRuleContent )
            {
            // InternalParser.g:3817:2: ( ruleRuleContent )
            // InternalParser.g:3818:3: ruleRuleContent
            {
             before(grammarAccess.getRulePartAccess().getContentRuleContentParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleRuleContent();

            state._fsp--;

             after(grammarAccess.getRulePartAccess().getContentRuleContentParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RulePart__ContentAssignment"

    // Delegated rules


    protected DFA19 dfa19 = new DFA19(this);
    protected DFA20 dfa20 = new DFA20(this);
    protected DFA21 dfa21 = new DFA21(this);
    protected DFA22 dfa22 = new DFA22(this);
    protected DFA23 dfa23 = new DFA23(this);
    protected DFA24 dfa24 = new DFA24(this);
    protected DFA25 dfa25 = new DFA25(this);
    protected DFA26 dfa26 = new DFA26(this);
    protected DFA27 dfa27 = new DFA27(this);
    protected DFA28 dfa28 = new DFA28(this);
    protected DFA29 dfa29 = new DFA29(this);
    protected DFA30 dfa30 = new DFA30(this);
    static final String dfa_1s = "\15\uffff";
    static final String dfa_2s = "\1\37\14\uffff";
    static final String dfa_3s = "\1\60\14\uffff";
    static final String dfa_4s = "\1\uffff\13\1\1\2";
    static final String dfa_5s = "\1\0\14\uffff}>";
    static final String[] dfa_6s = {
            "\2\14\3\uffff\1\1\1\2\1\3\2\uffff\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13",
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
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA19 extends DFA {

        public DFA19(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 19;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "2801:2: ( rule__ParserModel__UnorderedGroup_0__0 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA19_0 = input.LA(1);

                         
                        int index19_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA19_0 == 36 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 0) ) {s = 1;}

                        else if ( LA19_0 == 37 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 1) ) {s = 2;}

                        else if ( LA19_0 == 38 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 2) ) {s = 3;}

                        else if ( LA19_0 == 41 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 3) ) {s = 4;}

                        else if ( LA19_0 == 42 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 4) ) {s = 5;}

                        else if ( LA19_0 == 43 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 5) ) {s = 6;}

                        else if ( LA19_0 == 44 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 6) ) {s = 7;}

                        else if ( LA19_0 == 45 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 7) ) {s = 8;}

                        else if ( LA19_0 == 46 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 8) ) {s = 9;}

                        else if ( LA19_0 == 47 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 9) ) {s = 10;}

                        else if ( LA19_0 == 48 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 10) ) {s = 11;}

                        else if ( ((LA19_0>=31 && LA19_0<=32)) ) {s = 12;}

                         
                        input.seek(index19_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 19, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_7s = "\14\uffff";
    static final String dfa_8s = "\1\44\13\uffff";
    static final String dfa_9s = "\1\60\13\uffff";
    static final String dfa_10s = "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13";
    static final String dfa_11s = "\1\0\13\uffff}>";
    static final String[] dfa_12s = {
            "\1\1\1\2\1\3\2\uffff\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13",
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

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[][] dfa_12 = unpackEncodedStringArray(dfa_12s);

    class DFA20 extends DFA {

        public DFA20(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 20;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "2815:3: ( ({...}? => ( ( ( rule__ParserModel__ScannerAssignment_0_0 ) ) ) ) | ({...}? => ( ( ( rule__ParserModel__ParserAssignment_0_1 ) ) ) ) | ({...}? => ( ( ( rule__ParserModel__ImportBlockAssignment_0_2 ) ) ) ) | ({...}? => ( ( ( rule__ParserModel__ExportBlockAssignment_0_3 ) ) ) ) | ({...}? => ( ( ( rule__ParserModel__GlobalBlockAssignment_0_4 ) ) ) ) | ({...}? => ( ( ( rule__ParserModel__LocalBlockAssignment_0_5 ) ) ) ) | ({...}? => ( ( ( rule__ParserModel__BeginBlockAssignment_0_6 ) ) ) ) | ({...}? => ( ( ( rule__ParserModel__CloseBlockAssignment_0_7 ) ) ) ) | ({...}? => ( ( ( rule__ParserModel__TokensAssignment_0_8 ) ) ) ) | ({...}? => ( ( ( rule__ParserModel__PrecedencAssignment_0_9 ) ) ) ) | ({...}? => ( ( ( rule__ParserModel__StartAssignment_0_10 ) ) ) ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA20_0 = input.LA(1);

                         
                        int index20_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA20_0 == 36 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 0) ) {s = 1;}

                        else if ( LA20_0 == 37 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 1) ) {s = 2;}

                        else if ( LA20_0 == 38 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 2) ) {s = 3;}

                        else if ( LA20_0 == 41 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 3) ) {s = 4;}

                        else if ( LA20_0 == 42 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 4) ) {s = 5;}

                        else if ( LA20_0 == 43 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 5) ) {s = 6;}

                        else if ( LA20_0 == 44 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 6) ) {s = 7;}

                        else if ( LA20_0 == 45 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 7) ) {s = 8;}

                        else if ( LA20_0 == 46 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 8) ) {s = 9;}

                        else if ( LA20_0 == 47 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 9) ) {s = 10;}

                        else if ( LA20_0 == 48 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 10) ) {s = 11;}

                         
                        input.seek(index20_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 20, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA21 extends DFA {

        public DFA21(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 21;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "2995:2: ( rule__ParserModel__UnorderedGroup_0__1 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA21_0 = input.LA(1);

                         
                        int index21_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA21_0 == 36 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 0) ) {s = 1;}

                        else if ( LA21_0 == 37 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 1) ) {s = 2;}

                        else if ( LA21_0 == 38 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 2) ) {s = 3;}

                        else if ( LA21_0 == 41 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 3) ) {s = 4;}

                        else if ( LA21_0 == 42 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 4) ) {s = 5;}

                        else if ( LA21_0 == 43 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 5) ) {s = 6;}

                        else if ( LA21_0 == 44 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 6) ) {s = 7;}

                        else if ( LA21_0 == 45 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 7) ) {s = 8;}

                        else if ( LA21_0 == 46 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 8) ) {s = 9;}

                        else if ( LA21_0 == 47 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 9) ) {s = 10;}

                        else if ( LA21_0 == 48 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 10) ) {s = 11;}

                        else if ( ((LA21_0>=31 && LA21_0<=32)) ) {s = 12;}

                         
                        input.seek(index21_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 21, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA22 extends DFA {

        public DFA22(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 22;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "3007:2: ( rule__ParserModel__UnorderedGroup_0__2 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA22_0 = input.LA(1);

                         
                        int index22_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA22_0 == 36 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 0) ) {s = 1;}

                        else if ( LA22_0 == 37 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 1) ) {s = 2;}

                        else if ( LA22_0 == 38 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 2) ) {s = 3;}

                        else if ( LA22_0 == 41 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 3) ) {s = 4;}

                        else if ( LA22_0 == 42 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 4) ) {s = 5;}

                        else if ( LA22_0 == 43 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 5) ) {s = 6;}

                        else if ( LA22_0 == 44 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 6) ) {s = 7;}

                        else if ( LA22_0 == 45 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 7) ) {s = 8;}

                        else if ( LA22_0 == 46 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 8) ) {s = 9;}

                        else if ( LA22_0 == 47 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 9) ) {s = 10;}

                        else if ( LA22_0 == 48 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 10) ) {s = 11;}

                        else if ( ((LA22_0>=31 && LA22_0<=32)) ) {s = 12;}

                         
                        input.seek(index22_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 22, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA23 extends DFA {

        public DFA23(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 23;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "3019:2: ( rule__ParserModel__UnorderedGroup_0__3 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA23_0 = input.LA(1);

                         
                        int index23_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA23_0 == 36 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 0) ) {s = 1;}

                        else if ( LA23_0 == 37 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 1) ) {s = 2;}

                        else if ( LA23_0 == 38 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 2) ) {s = 3;}

                        else if ( LA23_0 == 41 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 3) ) {s = 4;}

                        else if ( LA23_0 == 42 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 4) ) {s = 5;}

                        else if ( LA23_0 == 43 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 5) ) {s = 6;}

                        else if ( LA23_0 == 44 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 6) ) {s = 7;}

                        else if ( LA23_0 == 45 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 7) ) {s = 8;}

                        else if ( LA23_0 == 46 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 8) ) {s = 9;}

                        else if ( LA23_0 == 47 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 9) ) {s = 10;}

                        else if ( LA23_0 == 48 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 10) ) {s = 11;}

                        else if ( ((LA23_0>=31 && LA23_0<=32)) ) {s = 12;}

                         
                        input.seek(index23_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 23, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA24 extends DFA {

        public DFA24(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 24;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "3031:2: ( rule__ParserModel__UnorderedGroup_0__4 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA24_0 = input.LA(1);

                         
                        int index24_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA24_0 == 36 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 0) ) {s = 1;}

                        else if ( LA24_0 == 37 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 1) ) {s = 2;}

                        else if ( LA24_0 == 38 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 2) ) {s = 3;}

                        else if ( LA24_0 == 41 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 3) ) {s = 4;}

                        else if ( LA24_0 == 42 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 4) ) {s = 5;}

                        else if ( LA24_0 == 43 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 5) ) {s = 6;}

                        else if ( LA24_0 == 44 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 6) ) {s = 7;}

                        else if ( LA24_0 == 45 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 7) ) {s = 8;}

                        else if ( LA24_0 == 46 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 8) ) {s = 9;}

                        else if ( LA24_0 == 47 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 9) ) {s = 10;}

                        else if ( LA24_0 == 48 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 10) ) {s = 11;}

                        else if ( ((LA24_0>=31 && LA24_0<=32)) ) {s = 12;}

                         
                        input.seek(index24_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 24, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA25 extends DFA {

        public DFA25(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 25;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "3043:2: ( rule__ParserModel__UnorderedGroup_0__5 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA25_0 = input.LA(1);

                         
                        int index25_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA25_0 == 36 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 0) ) {s = 1;}

                        else if ( LA25_0 == 37 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 1) ) {s = 2;}

                        else if ( LA25_0 == 38 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 2) ) {s = 3;}

                        else if ( LA25_0 == 41 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 3) ) {s = 4;}

                        else if ( LA25_0 == 42 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 4) ) {s = 5;}

                        else if ( LA25_0 == 43 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 5) ) {s = 6;}

                        else if ( LA25_0 == 44 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 6) ) {s = 7;}

                        else if ( LA25_0 == 45 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 7) ) {s = 8;}

                        else if ( LA25_0 == 46 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 8) ) {s = 9;}

                        else if ( LA25_0 == 47 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 9) ) {s = 10;}

                        else if ( LA25_0 == 48 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 10) ) {s = 11;}

                        else if ( ((LA25_0>=31 && LA25_0<=32)) ) {s = 12;}

                         
                        input.seek(index25_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 25, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA26 extends DFA {

        public DFA26(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 26;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "3055:2: ( rule__ParserModel__UnorderedGroup_0__6 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA26_0 = input.LA(1);

                         
                        int index26_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA26_0 == 36 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 0) ) {s = 1;}

                        else if ( LA26_0 == 37 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 1) ) {s = 2;}

                        else if ( LA26_0 == 38 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 2) ) {s = 3;}

                        else if ( LA26_0 == 41 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 3) ) {s = 4;}

                        else if ( LA26_0 == 42 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 4) ) {s = 5;}

                        else if ( LA26_0 == 43 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 5) ) {s = 6;}

                        else if ( LA26_0 == 44 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 6) ) {s = 7;}

                        else if ( LA26_0 == 45 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 7) ) {s = 8;}

                        else if ( LA26_0 == 46 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 8) ) {s = 9;}

                        else if ( LA26_0 == 47 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 9) ) {s = 10;}

                        else if ( LA26_0 == 48 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 10) ) {s = 11;}

                        else if ( ((LA26_0>=31 && LA26_0<=32)) ) {s = 12;}

                         
                        input.seek(index26_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 26, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA27 extends DFA {

        public DFA27(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 27;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "3067:2: ( rule__ParserModel__UnorderedGroup_0__7 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA27_0 = input.LA(1);

                         
                        int index27_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA27_0 == 36 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 0) ) {s = 1;}

                        else if ( LA27_0 == 37 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 1) ) {s = 2;}

                        else if ( LA27_0 == 38 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 2) ) {s = 3;}

                        else if ( LA27_0 == 41 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 3) ) {s = 4;}

                        else if ( LA27_0 == 42 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 4) ) {s = 5;}

                        else if ( LA27_0 == 43 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 5) ) {s = 6;}

                        else if ( LA27_0 == 44 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 6) ) {s = 7;}

                        else if ( LA27_0 == 45 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 7) ) {s = 8;}

                        else if ( LA27_0 == 46 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 8) ) {s = 9;}

                        else if ( LA27_0 == 47 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 9) ) {s = 10;}

                        else if ( LA27_0 == 48 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 10) ) {s = 11;}

                        else if ( ((LA27_0>=31 && LA27_0<=32)) ) {s = 12;}

                         
                        input.seek(index27_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 27, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA28 extends DFA {

        public DFA28(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 28;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "3079:2: ( rule__ParserModel__UnorderedGroup_0__8 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA28_0 = input.LA(1);

                         
                        int index28_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA28_0 == 36 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 0) ) {s = 1;}

                        else if ( LA28_0 == 37 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 1) ) {s = 2;}

                        else if ( LA28_0 == 38 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 2) ) {s = 3;}

                        else if ( LA28_0 == 41 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 3) ) {s = 4;}

                        else if ( LA28_0 == 42 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 4) ) {s = 5;}

                        else if ( LA28_0 == 43 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 5) ) {s = 6;}

                        else if ( LA28_0 == 44 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 6) ) {s = 7;}

                        else if ( LA28_0 == 45 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 7) ) {s = 8;}

                        else if ( LA28_0 == 46 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 8) ) {s = 9;}

                        else if ( LA28_0 == 47 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 9) ) {s = 10;}

                        else if ( LA28_0 == 48 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 10) ) {s = 11;}

                        else if ( ((LA28_0>=31 && LA28_0<=32)) ) {s = 12;}

                         
                        input.seek(index28_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 28, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA29 extends DFA {

        public DFA29(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 29;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "3091:2: ( rule__ParserModel__UnorderedGroup_0__9 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA29_0 = input.LA(1);

                         
                        int index29_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA29_0 == 36 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 0) ) {s = 1;}

                        else if ( LA29_0 == 37 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 1) ) {s = 2;}

                        else if ( LA29_0 == 38 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 2) ) {s = 3;}

                        else if ( LA29_0 == 41 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 3) ) {s = 4;}

                        else if ( LA29_0 == 42 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 4) ) {s = 5;}

                        else if ( LA29_0 == 43 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 5) ) {s = 6;}

                        else if ( LA29_0 == 44 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 6) ) {s = 7;}

                        else if ( LA29_0 == 45 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 7) ) {s = 8;}

                        else if ( LA29_0 == 46 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 8) ) {s = 9;}

                        else if ( LA29_0 == 47 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 9) ) {s = 10;}

                        else if ( LA29_0 == 48 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 10) ) {s = 11;}

                        else if ( ((LA29_0>=31 && LA29_0<=32)) ) {s = 12;}

                         
                        input.seek(index29_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 29, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA30 extends DFA {

        public DFA30(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 30;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "3103:2: ( rule__ParserModel__UnorderedGroup_0__10 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA30_0 = input.LA(1);

                         
                        int index30_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA30_0 == 36 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 0) ) {s = 1;}

                        else if ( LA30_0 == 37 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 1) ) {s = 2;}

                        else if ( LA30_0 == 38 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 2) ) {s = 3;}

                        else if ( LA30_0 == 41 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 3) ) {s = 4;}

                        else if ( LA30_0 == 42 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 4) ) {s = 5;}

                        else if ( LA30_0 == 43 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 5) ) {s = 6;}

                        else if ( LA30_0 == 44 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 6) ) {s = 7;}

                        else if ( LA30_0 == 45 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 7) ) {s = 8;}

                        else if ( LA30_0 == 46 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 8) ) {s = 9;}

                        else if ( LA30_0 == 47 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 9) ) {s = 10;}

                        else if ( LA30_0 == 48 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup_0(), 10) ) {s = 11;}

                        else if ( ((LA30_0>=31 && LA30_0<=32)) ) {s = 12;}

                         
                        input.seek(index30_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 30, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000807FFFF8F2L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000062L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000807FFFF8F0L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000000000F2L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000E00000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000E00000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0002008000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0001FE7000000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0002008000000002L});

}
