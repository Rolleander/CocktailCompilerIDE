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
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=7;
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
    public static final int RULE_WS=4;
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
    // InternalParser.g:62:1: ruleParserModel : ( ( rule__ParserModel__UnorderedGroup ) ) ;
    public final void ruleParserModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:66:2: ( ( ( rule__ParserModel__UnorderedGroup ) ) )
            // InternalParser.g:67:2: ( ( rule__ParserModel__UnorderedGroup ) )
            {
            // InternalParser.g:67:2: ( ( rule__ParserModel__UnorderedGroup ) )
            // InternalParser.g:68:3: ( rule__ParserModel__UnorderedGroup )
            {
             before(grammarAccess.getParserModelAccess().getUnorderedGroup()); 
            // InternalParser.g:69:3: ( rule__ParserModel__UnorderedGroup )
            // InternalParser.g:69:4: rule__ParserModel__UnorderedGroup
            {
            pushFollow(FOLLOW_2);
            rule__ParserModel__UnorderedGroup();

            state._fsp--;


            }

             after(grammarAccess.getParserModelAccess().getUnorderedGroup()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleGrammerRules"
    // InternalParser.g:503:1: entryRuleGrammerRules : ruleGrammerRules EOF ;
    public final void entryRuleGrammerRules() throws RecognitionException {
        try {
            // InternalParser.g:504:1: ( ruleGrammerRules EOF )
            // InternalParser.g:505:1: ruleGrammerRules EOF
            {
             before(grammarAccess.getGrammerRulesRule()); 
            pushFollow(FOLLOW_1);
            ruleGrammerRules();

            state._fsp--;

             after(grammarAccess.getGrammerRulesRule()); 
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
    // $ANTLR end "entryRuleGrammerRules"


    // $ANTLR start "ruleGrammerRules"
    // InternalParser.g:512:1: ruleGrammerRules : ( ( rule__GrammerRules__Group__0 ) ) ;
    public final void ruleGrammerRules() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:516:2: ( ( ( rule__GrammerRules__Group__0 ) ) )
            // InternalParser.g:517:2: ( ( rule__GrammerRules__Group__0 ) )
            {
            // InternalParser.g:517:2: ( ( rule__GrammerRules__Group__0 ) )
            // InternalParser.g:518:3: ( rule__GrammerRules__Group__0 )
            {
             before(grammarAccess.getGrammerRulesAccess().getGroup()); 
            // InternalParser.g:519:3: ( rule__GrammerRules__Group__0 )
            // InternalParser.g:519:4: rule__GrammerRules__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GrammerRules__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGrammerRulesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGrammerRules"


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


    // $ANTLR start "entryRuleRulePart"
    // InternalParser.g:603:1: entryRuleRulePart : ruleRulePart EOF ;
    public final void entryRuleRulePart() throws RecognitionException {
        try {
            // InternalParser.g:604:1: ( ruleRulePart EOF )
            // InternalParser.g:605:1: ruleRulePart EOF
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
    // InternalParser.g:612:1: ruleRulePart : ( ( rule__RulePart__Alternatives )* ) ;
    public final void ruleRulePart() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:616:2: ( ( ( rule__RulePart__Alternatives )* ) )
            // InternalParser.g:617:2: ( ( rule__RulePart__Alternatives )* )
            {
            // InternalParser.g:617:2: ( ( rule__RulePart__Alternatives )* )
            // InternalParser.g:618:3: ( rule__RulePart__Alternatives )*
            {
             before(grammarAccess.getRulePartAccess().getAlternatives()); 
            // InternalParser.g:619:3: ( rule__RulePart__Alternatives )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=RULE_ID && LA2_0<=RULE_STRING)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalParser.g:619:4: rule__RulePart__Alternatives
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__RulePart__Alternatives();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getRulePartAccess().getAlternatives()); 

            }


            }

        }
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
    // InternalParser.g:628:1: rulePrecedenceType : ( ( rule__PrecedenceType__Alternatives ) ) ;
    public final void rulePrecedenceType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:632:1: ( ( ( rule__PrecedenceType__Alternatives ) ) )
            // InternalParser.g:633:2: ( ( rule__PrecedenceType__Alternatives ) )
            {
            // InternalParser.g:633:2: ( ( rule__PrecedenceType__Alternatives ) )
            // InternalParser.g:634:3: ( rule__PrecedenceType__Alternatives )
            {
             before(grammarAccess.getPrecedenceTypeAccess().getAlternatives()); 
            // InternalParser.g:635:3: ( rule__PrecedenceType__Alternatives )
            // InternalParser.g:635:4: rule__PrecedenceType__Alternatives
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
    // InternalParser.g:643:1: rule__DefinedToken__Alternatives : ( ( ( rule__DefinedToken__Group_0__0 ) ) | ( ( rule__DefinedToken__ExtraAssignment_1 ) ) | ( RULE_WS ) );
    public final void rule__DefinedToken__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:647:1: ( ( ( rule__DefinedToken__Group_0__0 ) ) | ( ( rule__DefinedToken__ExtraAssignment_1 ) ) | ( RULE_WS ) )
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
                    // InternalParser.g:648:2: ( ( rule__DefinedToken__Group_0__0 ) )
                    {
                    // InternalParser.g:648:2: ( ( rule__DefinedToken__Group_0__0 ) )
                    // InternalParser.g:649:3: ( rule__DefinedToken__Group_0__0 )
                    {
                     before(grammarAccess.getDefinedTokenAccess().getGroup_0()); 
                    // InternalParser.g:650:3: ( rule__DefinedToken__Group_0__0 )
                    // InternalParser.g:650:4: rule__DefinedToken__Group_0__0
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
                    // InternalParser.g:654:2: ( ( rule__DefinedToken__ExtraAssignment_1 ) )
                    {
                    // InternalParser.g:654:2: ( ( rule__DefinedToken__ExtraAssignment_1 ) )
                    // InternalParser.g:655:3: ( rule__DefinedToken__ExtraAssignment_1 )
                    {
                     before(grammarAccess.getDefinedTokenAccess().getExtraAssignment_1()); 
                    // InternalParser.g:656:3: ( rule__DefinedToken__ExtraAssignment_1 )
                    // InternalParser.g:656:4: rule__DefinedToken__ExtraAssignment_1
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
                    // InternalParser.g:660:2: ( RULE_WS )
                    {
                    // InternalParser.g:660:2: ( RULE_WS )
                    // InternalParser.g:661:3: RULE_WS
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
    // InternalParser.g:670:1: rule__DefinedToken__NameAlternatives_0_0_0 : ( ( RULE_ID ) | ( RULE_STRING ) );
    public final void rule__DefinedToken__NameAlternatives_0_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:674:1: ( ( RULE_ID ) | ( RULE_STRING ) )
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
                    // InternalParser.g:675:2: ( RULE_ID )
                    {
                    // InternalParser.g:675:2: ( RULE_ID )
                    // InternalParser.g:676:3: RULE_ID
                    {
                     before(grammarAccess.getDefinedTokenAccess().getNameIDTerminalRuleCall_0_0_0_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getDefinedTokenAccess().getNameIDTerminalRuleCall_0_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalParser.g:681:2: ( RULE_STRING )
                    {
                    // InternalParser.g:681:2: ( RULE_STRING )
                    // InternalParser.g:682:3: RULE_STRING
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
    // InternalParser.g:691:1: rule__CodeBlock__Alternatives : ( ( ruleCodeWall ) | ( ( rule__CodeBlock__Group_1__0 ) ) );
    public final void rule__CodeBlock__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:695:1: ( ( ruleCodeWall ) | ( ( rule__CodeBlock__Group_1__0 ) ) )
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
                    // InternalParser.g:696:2: ( ruleCodeWall )
                    {
                    // InternalParser.g:696:2: ( ruleCodeWall )
                    // InternalParser.g:697:3: ruleCodeWall
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
                    // InternalParser.g:702:2: ( ( rule__CodeBlock__Group_1__0 ) )
                    {
                    // InternalParser.g:702:2: ( ( rule__CodeBlock__Group_1__0 ) )
                    // InternalParser.g:703:3: ( rule__CodeBlock__Group_1__0 )
                    {
                     before(grammarAccess.getCodeBlockAccess().getGroup_1()); 
                    // InternalParser.g:704:3: ( rule__CodeBlock__Group_1__0 )
                    // InternalParser.g:704:4: rule__CodeBlock__Group_1__0
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
    // InternalParser.g:712:1: rule__CodeWall__Alternatives : ( ( RULE_ID ) | ( RULE_INT ) | ( RULE_STRING ) | ( RULE_WS ) | ( '+' ) | ( '-' ) | ( '(' ) | ( ')' ) | ( '*' ) | ( '.' ) | ( '/' ) | ( '\\\\' ) | ( '|' ) | ( '?' ) | ( '>' ) | ( '<' ) | ( '#' ) | ( '$' ) | ( '%' ) | ( ';' ) | ( ':' ) | ( '!' ) | ( '=' ) | ( ',' ) );
    public final void rule__CodeWall__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:716:1: ( ( RULE_ID ) | ( RULE_INT ) | ( RULE_STRING ) | ( RULE_WS ) | ( '+' ) | ( '-' ) | ( '(' ) | ( ')' ) | ( '*' ) | ( '.' ) | ( '/' ) | ( '\\\\' ) | ( '|' ) | ( '?' ) | ( '>' ) | ( '<' ) | ( '#' ) | ( '$' ) | ( '%' ) | ( ';' ) | ( ':' ) | ( '!' ) | ( '=' ) | ( ',' ) )
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
                    // InternalParser.g:717:2: ( RULE_ID )
                    {
                    // InternalParser.g:717:2: ( RULE_ID )
                    // InternalParser.g:718:3: RULE_ID
                    {
                     before(grammarAccess.getCodeWallAccess().getIDTerminalRuleCall_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getCodeWallAccess().getIDTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalParser.g:723:2: ( RULE_INT )
                    {
                    // InternalParser.g:723:2: ( RULE_INT )
                    // InternalParser.g:724:3: RULE_INT
                    {
                     before(grammarAccess.getCodeWallAccess().getINTTerminalRuleCall_1()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getCodeWallAccess().getINTTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalParser.g:729:2: ( RULE_STRING )
                    {
                    // InternalParser.g:729:2: ( RULE_STRING )
                    // InternalParser.g:730:3: RULE_STRING
                    {
                     before(grammarAccess.getCodeWallAccess().getSTRINGTerminalRuleCall_2()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getCodeWallAccess().getSTRINGTerminalRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalParser.g:735:2: ( RULE_WS )
                    {
                    // InternalParser.g:735:2: ( RULE_WS )
                    // InternalParser.g:736:3: RULE_WS
                    {
                     before(grammarAccess.getCodeWallAccess().getWSTerminalRuleCall_3()); 
                    match(input,RULE_WS,FOLLOW_2); 
                     after(grammarAccess.getCodeWallAccess().getWSTerminalRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalParser.g:741:2: ( '+' )
                    {
                    // InternalParser.g:741:2: ( '+' )
                    // InternalParser.g:742:3: '+'
                    {
                     before(grammarAccess.getCodeWallAccess().getPlusSignKeyword_4()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getCodeWallAccess().getPlusSignKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalParser.g:747:2: ( '-' )
                    {
                    // InternalParser.g:747:2: ( '-' )
                    // InternalParser.g:748:3: '-'
                    {
                     before(grammarAccess.getCodeWallAccess().getHyphenMinusKeyword_5()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getCodeWallAccess().getHyphenMinusKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalParser.g:753:2: ( '(' )
                    {
                    // InternalParser.g:753:2: ( '(' )
                    // InternalParser.g:754:3: '('
                    {
                     before(grammarAccess.getCodeWallAccess().getLeftParenthesisKeyword_6()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getCodeWallAccess().getLeftParenthesisKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalParser.g:759:2: ( ')' )
                    {
                    // InternalParser.g:759:2: ( ')' )
                    // InternalParser.g:760:3: ')'
                    {
                     before(grammarAccess.getCodeWallAccess().getRightParenthesisKeyword_7()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getCodeWallAccess().getRightParenthesisKeyword_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalParser.g:765:2: ( '*' )
                    {
                    // InternalParser.g:765:2: ( '*' )
                    // InternalParser.g:766:3: '*'
                    {
                     before(grammarAccess.getCodeWallAccess().getAsteriskKeyword_8()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getCodeWallAccess().getAsteriskKeyword_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalParser.g:771:2: ( '.' )
                    {
                    // InternalParser.g:771:2: ( '.' )
                    // InternalParser.g:772:3: '.'
                    {
                     before(grammarAccess.getCodeWallAccess().getFullStopKeyword_9()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getCodeWallAccess().getFullStopKeyword_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalParser.g:777:2: ( '/' )
                    {
                    // InternalParser.g:777:2: ( '/' )
                    // InternalParser.g:778:3: '/'
                    {
                     before(grammarAccess.getCodeWallAccess().getSolidusKeyword_10()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getCodeWallAccess().getSolidusKeyword_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalParser.g:783:2: ( '\\\\' )
                    {
                    // InternalParser.g:783:2: ( '\\\\' )
                    // InternalParser.g:784:3: '\\\\'
                    {
                     before(grammarAccess.getCodeWallAccess().getReverseSolidusKeyword_11()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getCodeWallAccess().getReverseSolidusKeyword_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalParser.g:789:2: ( '|' )
                    {
                    // InternalParser.g:789:2: ( '|' )
                    // InternalParser.g:790:3: '|'
                    {
                     before(grammarAccess.getCodeWallAccess().getVerticalLineKeyword_12()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getCodeWallAccess().getVerticalLineKeyword_12()); 

                    }


                    }
                    break;
                case 14 :
                    // InternalParser.g:795:2: ( '?' )
                    {
                    // InternalParser.g:795:2: ( '?' )
                    // InternalParser.g:796:3: '?'
                    {
                     before(grammarAccess.getCodeWallAccess().getQuestionMarkKeyword_13()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getCodeWallAccess().getQuestionMarkKeyword_13()); 

                    }


                    }
                    break;
                case 15 :
                    // InternalParser.g:801:2: ( '>' )
                    {
                    // InternalParser.g:801:2: ( '>' )
                    // InternalParser.g:802:3: '>'
                    {
                     before(grammarAccess.getCodeWallAccess().getGreaterThanSignKeyword_14()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getCodeWallAccess().getGreaterThanSignKeyword_14()); 

                    }


                    }
                    break;
                case 16 :
                    // InternalParser.g:807:2: ( '<' )
                    {
                    // InternalParser.g:807:2: ( '<' )
                    // InternalParser.g:808:3: '<'
                    {
                     before(grammarAccess.getCodeWallAccess().getLessThanSignKeyword_15()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getCodeWallAccess().getLessThanSignKeyword_15()); 

                    }


                    }
                    break;
                case 17 :
                    // InternalParser.g:813:2: ( '#' )
                    {
                    // InternalParser.g:813:2: ( '#' )
                    // InternalParser.g:814:3: '#'
                    {
                     before(grammarAccess.getCodeWallAccess().getNumberSignKeyword_16()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getCodeWallAccess().getNumberSignKeyword_16()); 

                    }


                    }
                    break;
                case 18 :
                    // InternalParser.g:819:2: ( '$' )
                    {
                    // InternalParser.g:819:2: ( '$' )
                    // InternalParser.g:820:3: '$'
                    {
                     before(grammarAccess.getCodeWallAccess().getDollarSignKeyword_17()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getCodeWallAccess().getDollarSignKeyword_17()); 

                    }


                    }
                    break;
                case 19 :
                    // InternalParser.g:825:2: ( '%' )
                    {
                    // InternalParser.g:825:2: ( '%' )
                    // InternalParser.g:826:3: '%'
                    {
                     before(grammarAccess.getCodeWallAccess().getPercentSignKeyword_18()); 
                    match(input,25,FOLLOW_2); 
                     after(grammarAccess.getCodeWallAccess().getPercentSignKeyword_18()); 

                    }


                    }
                    break;
                case 20 :
                    // InternalParser.g:831:2: ( ';' )
                    {
                    // InternalParser.g:831:2: ( ';' )
                    // InternalParser.g:832:3: ';'
                    {
                     before(grammarAccess.getCodeWallAccess().getSemicolonKeyword_19()); 
                    match(input,26,FOLLOW_2); 
                     after(grammarAccess.getCodeWallAccess().getSemicolonKeyword_19()); 

                    }


                    }
                    break;
                case 21 :
                    // InternalParser.g:837:2: ( ':' )
                    {
                    // InternalParser.g:837:2: ( ':' )
                    // InternalParser.g:838:3: ':'
                    {
                     before(grammarAccess.getCodeWallAccess().getColonKeyword_20()); 
                    match(input,27,FOLLOW_2); 
                     after(grammarAccess.getCodeWallAccess().getColonKeyword_20()); 

                    }


                    }
                    break;
                case 22 :
                    // InternalParser.g:843:2: ( '!' )
                    {
                    // InternalParser.g:843:2: ( '!' )
                    // InternalParser.g:844:3: '!'
                    {
                     before(grammarAccess.getCodeWallAccess().getExclamationMarkKeyword_21()); 
                    match(input,28,FOLLOW_2); 
                     after(grammarAccess.getCodeWallAccess().getExclamationMarkKeyword_21()); 

                    }


                    }
                    break;
                case 23 :
                    // InternalParser.g:849:2: ( '=' )
                    {
                    // InternalParser.g:849:2: ( '=' )
                    // InternalParser.g:850:3: '='
                    {
                     before(grammarAccess.getCodeWallAccess().getEqualsSignKeyword_22()); 
                    match(input,29,FOLLOW_2); 
                     after(grammarAccess.getCodeWallAccess().getEqualsSignKeyword_22()); 

                    }


                    }
                    break;
                case 24 :
                    // InternalParser.g:855:2: ( ',' )
                    {
                    // InternalParser.g:855:2: ( ',' )
                    // InternalParser.g:856:3: ','
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


    // $ANTLR start "rule__GrammerRules__Alternatives_0"
    // InternalParser.g:865:1: rule__GrammerRules__Alternatives_0 : ( ( 'RULE' ) | ( 'RULES' ) );
    public final void rule__GrammerRules__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:869:1: ( ( 'RULE' ) | ( 'RULES' ) )
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
                    // InternalParser.g:870:2: ( 'RULE' )
                    {
                    // InternalParser.g:870:2: ( 'RULE' )
                    // InternalParser.g:871:3: 'RULE'
                    {
                     before(grammarAccess.getGrammerRulesAccess().getRULEKeyword_0_0()); 
                    match(input,31,FOLLOW_2); 
                     after(grammarAccess.getGrammerRulesAccess().getRULEKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalParser.g:876:2: ( 'RULES' )
                    {
                    // InternalParser.g:876:2: ( 'RULES' )
                    // InternalParser.g:877:3: 'RULES'
                    {
                     before(grammarAccess.getGrammerRulesAccess().getRULESKeyword_0_1()); 
                    match(input,32,FOLLOW_2); 
                     after(grammarAccess.getGrammerRulesAccess().getRULESKeyword_0_1()); 

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
    // $ANTLR end "rule__GrammerRules__Alternatives_0"


    // $ANTLR start "rule__RulePart__Alternatives"
    // InternalParser.g:886:1: rule__RulePart__Alternatives : ( ( ( rule__RulePart__RegexAssignment_0 ) ) | ( ( rule__RulePart__RulesAssignment_1 ) ) );
    public final void rule__RulePart__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:890:1: ( ( ( rule__RulePart__RegexAssignment_0 ) ) | ( ( rule__RulePart__RulesAssignment_1 ) ) )
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
                    // InternalParser.g:891:2: ( ( rule__RulePart__RegexAssignment_0 ) )
                    {
                    // InternalParser.g:891:2: ( ( rule__RulePart__RegexAssignment_0 ) )
                    // InternalParser.g:892:3: ( rule__RulePart__RegexAssignment_0 )
                    {
                     before(grammarAccess.getRulePartAccess().getRegexAssignment_0()); 
                    // InternalParser.g:893:3: ( rule__RulePart__RegexAssignment_0 )
                    // InternalParser.g:893:4: rule__RulePart__RegexAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RulePart__RegexAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRulePartAccess().getRegexAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalParser.g:897:2: ( ( rule__RulePart__RulesAssignment_1 ) )
                    {
                    // InternalParser.g:897:2: ( ( rule__RulePart__RulesAssignment_1 ) )
                    // InternalParser.g:898:3: ( rule__RulePart__RulesAssignment_1 )
                    {
                     before(grammarAccess.getRulePartAccess().getRulesAssignment_1()); 
                    // InternalParser.g:899:3: ( rule__RulePart__RulesAssignment_1 )
                    // InternalParser.g:899:4: rule__RulePart__RulesAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__RulePart__RulesAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getRulePartAccess().getRulesAssignment_1()); 

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
    // $ANTLR end "rule__RulePart__Alternatives"


    // $ANTLR start "rule__PrecedenceType__Alternatives"
    // InternalParser.g:907:1: rule__PrecedenceType__Alternatives : ( ( ( 'NONE' ) ) | ( ( 'LEFT' ) ) | ( ( 'RIGHT' ) ) );
    public final void rule__PrecedenceType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:911:1: ( ( ( 'NONE' ) ) | ( ( 'LEFT' ) ) | ( ( 'RIGHT' ) ) )
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
                    // InternalParser.g:912:2: ( ( 'NONE' ) )
                    {
                    // InternalParser.g:912:2: ( ( 'NONE' ) )
                    // InternalParser.g:913:3: ( 'NONE' )
                    {
                     before(grammarAccess.getPrecedenceTypeAccess().getNONEEnumLiteralDeclaration_0()); 
                    // InternalParser.g:914:3: ( 'NONE' )
                    // InternalParser.g:914:4: 'NONE'
                    {
                    match(input,33,FOLLOW_2); 

                    }

                     after(grammarAccess.getPrecedenceTypeAccess().getNONEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalParser.g:918:2: ( ( 'LEFT' ) )
                    {
                    // InternalParser.g:918:2: ( ( 'LEFT' ) )
                    // InternalParser.g:919:3: ( 'LEFT' )
                    {
                     before(grammarAccess.getPrecedenceTypeAccess().getLEFTEnumLiteralDeclaration_1()); 
                    // InternalParser.g:920:3: ( 'LEFT' )
                    // InternalParser.g:920:4: 'LEFT'
                    {
                    match(input,34,FOLLOW_2); 

                    }

                     after(grammarAccess.getPrecedenceTypeAccess().getLEFTEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalParser.g:924:2: ( ( 'RIGHT' ) )
                    {
                    // InternalParser.g:924:2: ( ( 'RIGHT' ) )
                    // InternalParser.g:925:3: ( 'RIGHT' )
                    {
                     before(grammarAccess.getPrecedenceTypeAccess().getRIGHTEnumLiteralDeclaration_2()); 
                    // InternalParser.g:926:3: ( 'RIGHT' )
                    // InternalParser.g:926:4: 'RIGHT'
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


    // $ANTLR start "rule__ParserModel__Group_0__0"
    // InternalParser.g:934:1: rule__ParserModel__Group_0__0 : rule__ParserModel__Group_0__0__Impl rule__ParserModel__Group_0__1 ;
    public final void rule__ParserModel__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:938:1: ( rule__ParserModel__Group_0__0__Impl rule__ParserModel__Group_0__1 )
            // InternalParser.g:939:2: rule__ParserModel__Group_0__0__Impl rule__ParserModel__Group_0__1
            {
            pushFollow(FOLLOW_5);
            rule__ParserModel__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParserModel__Group_0__1();

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
    // $ANTLR end "rule__ParserModel__Group_0__0"


    // $ANTLR start "rule__ParserModel__Group_0__0__Impl"
    // InternalParser.g:946:1: rule__ParserModel__Group_0__0__Impl : ( ( rule__ParserModel__ScannerAssignment_0_0 ) ) ;
    public final void rule__ParserModel__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:950:1: ( ( ( rule__ParserModel__ScannerAssignment_0_0 ) ) )
            // InternalParser.g:951:1: ( ( rule__ParserModel__ScannerAssignment_0_0 ) )
            {
            // InternalParser.g:951:1: ( ( rule__ParserModel__ScannerAssignment_0_0 ) )
            // InternalParser.g:952:2: ( rule__ParserModel__ScannerAssignment_0_0 )
            {
             before(grammarAccess.getParserModelAccess().getScannerAssignment_0_0()); 
            // InternalParser.g:953:2: ( rule__ParserModel__ScannerAssignment_0_0 )
            // InternalParser.g:953:3: rule__ParserModel__ScannerAssignment_0_0
            {
            pushFollow(FOLLOW_2);
            rule__ParserModel__ScannerAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getParserModelAccess().getScannerAssignment_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParserModel__Group_0__0__Impl"


    // $ANTLR start "rule__ParserModel__Group_0__1"
    // InternalParser.g:961:1: rule__ParserModel__Group_0__1 : rule__ParserModel__Group_0__1__Impl ;
    public final void rule__ParserModel__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:965:1: ( rule__ParserModel__Group_0__1__Impl )
            // InternalParser.g:966:2: rule__ParserModel__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParserModel__Group_0__1__Impl();

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
    // $ANTLR end "rule__ParserModel__Group_0__1"


    // $ANTLR start "rule__ParserModel__Group_0__1__Impl"
    // InternalParser.g:972:1: rule__ParserModel__Group_0__1__Impl : ( ( rule__ParserModel__ParserAssignment_0_1 ) ) ;
    public final void rule__ParserModel__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:976:1: ( ( ( rule__ParserModel__ParserAssignment_0_1 ) ) )
            // InternalParser.g:977:1: ( ( rule__ParserModel__ParserAssignment_0_1 ) )
            {
            // InternalParser.g:977:1: ( ( rule__ParserModel__ParserAssignment_0_1 ) )
            // InternalParser.g:978:2: ( rule__ParserModel__ParserAssignment_0_1 )
            {
             before(grammarAccess.getParserModelAccess().getParserAssignment_0_1()); 
            // InternalParser.g:979:2: ( rule__ParserModel__ParserAssignment_0_1 )
            // InternalParser.g:979:3: rule__ParserModel__ParserAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__ParserModel__ParserAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getParserModelAccess().getParserAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParserModel__Group_0__1__Impl"


    // $ANTLR start "rule__ScannerName__Group__0"
    // InternalParser.g:988:1: rule__ScannerName__Group__0 : rule__ScannerName__Group__0__Impl rule__ScannerName__Group__1 ;
    public final void rule__ScannerName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:992:1: ( rule__ScannerName__Group__0__Impl rule__ScannerName__Group__1 )
            // InternalParser.g:993:2: rule__ScannerName__Group__0__Impl rule__ScannerName__Group__1
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
    // InternalParser.g:1000:1: rule__ScannerName__Group__0__Impl : ( 'SCANNER' ) ;
    public final void rule__ScannerName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:1004:1: ( ( 'SCANNER' ) )
            // InternalParser.g:1005:1: ( 'SCANNER' )
            {
            // InternalParser.g:1005:1: ( 'SCANNER' )
            // InternalParser.g:1006:2: 'SCANNER'
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
    // InternalParser.g:1015:1: rule__ScannerName__Group__1 : rule__ScannerName__Group__1__Impl ;
    public final void rule__ScannerName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:1019:1: ( rule__ScannerName__Group__1__Impl )
            // InternalParser.g:1020:2: rule__ScannerName__Group__1__Impl
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
    // InternalParser.g:1026:1: rule__ScannerName__Group__1__Impl : ( ( rule__ScannerName__NameAssignment_1 )? ) ;
    public final void rule__ScannerName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:1030:1: ( ( ( rule__ScannerName__NameAssignment_1 )? ) )
            // InternalParser.g:1031:1: ( ( rule__ScannerName__NameAssignment_1 )? )
            {
            // InternalParser.g:1031:1: ( ( rule__ScannerName__NameAssignment_1 )? )
            // InternalParser.g:1032:2: ( rule__ScannerName__NameAssignment_1 )?
            {
             before(grammarAccess.getScannerNameAccess().getNameAssignment_1()); 
            // InternalParser.g:1033:2: ( rule__ScannerName__NameAssignment_1 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalParser.g:1033:3: rule__ScannerName__NameAssignment_1
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
    // InternalParser.g:1042:1: rule__ParserName__Group__0 : rule__ParserName__Group__0__Impl rule__ParserName__Group__1 ;
    public final void rule__ParserName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:1046:1: ( rule__ParserName__Group__0__Impl rule__ParserName__Group__1 )
            // InternalParser.g:1047:2: rule__ParserName__Group__0__Impl rule__ParserName__Group__1
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
    // InternalParser.g:1054:1: rule__ParserName__Group__0__Impl : ( 'PARSER' ) ;
    public final void rule__ParserName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:1058:1: ( ( 'PARSER' ) )
            // InternalParser.g:1059:1: ( 'PARSER' )
            {
            // InternalParser.g:1059:1: ( 'PARSER' )
            // InternalParser.g:1060:2: 'PARSER'
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
    // InternalParser.g:1069:1: rule__ParserName__Group__1 : rule__ParserName__Group__1__Impl ;
    public final void rule__ParserName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:1073:1: ( rule__ParserName__Group__1__Impl )
            // InternalParser.g:1074:2: rule__ParserName__Group__1__Impl
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
    // InternalParser.g:1080:1: rule__ParserName__Group__1__Impl : ( ( rule__ParserName__NameAssignment_1 )? ) ;
    public final void rule__ParserName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:1084:1: ( ( ( rule__ParserName__NameAssignment_1 )? ) )
            // InternalParser.g:1085:1: ( ( rule__ParserName__NameAssignment_1 )? )
            {
            // InternalParser.g:1085:1: ( ( rule__ParserName__NameAssignment_1 )? )
            // InternalParser.g:1086:2: ( rule__ParserName__NameAssignment_1 )?
            {
             before(grammarAccess.getParserNameAccess().getNameAssignment_1()); 
            // InternalParser.g:1087:2: ( rule__ParserName__NameAssignment_1 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalParser.g:1087:3: rule__ParserName__NameAssignment_1
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
    // InternalParser.g:1096:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:1100:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // InternalParser.g:1101:2: rule__Import__Group__0__Impl rule__Import__Group__1
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
    // InternalParser.g:1108:1: rule__Import__Group__0__Impl : ( 'IMPORT' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:1112:1: ( ( 'IMPORT' ) )
            // InternalParser.g:1113:1: ( 'IMPORT' )
            {
            // InternalParser.g:1113:1: ( 'IMPORT' )
            // InternalParser.g:1114:2: 'IMPORT'
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
    // InternalParser.g:1123:1: rule__Import__Group__1 : rule__Import__Group__1__Impl rule__Import__Group__2 ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:1127:1: ( rule__Import__Group__1__Impl rule__Import__Group__2 )
            // InternalParser.g:1128:2: rule__Import__Group__1__Impl rule__Import__Group__2
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
    // InternalParser.g:1135:1: rule__Import__Group__1__Impl : ( '{' ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:1139:1: ( ( '{' ) )
            // InternalParser.g:1140:1: ( '{' )
            {
            // InternalParser.g:1140:1: ( '{' )
            // InternalParser.g:1141:2: '{'
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
    // InternalParser.g:1150:1: rule__Import__Group__2 : rule__Import__Group__2__Impl rule__Import__Group__3 ;
    public final void rule__Import__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:1154:1: ( rule__Import__Group__2__Impl rule__Import__Group__3 )
            // InternalParser.g:1155:2: rule__Import__Group__2__Impl rule__Import__Group__3
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
    // InternalParser.g:1162:1: rule__Import__Group__2__Impl : ( ( rule__Import__ContentAssignment_2 ) ) ;
    public final void rule__Import__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:1166:1: ( ( ( rule__Import__ContentAssignment_2 ) ) )
            // InternalParser.g:1167:1: ( ( rule__Import__ContentAssignment_2 ) )
            {
            // InternalParser.g:1167:1: ( ( rule__Import__ContentAssignment_2 ) )
            // InternalParser.g:1168:2: ( rule__Import__ContentAssignment_2 )
            {
             before(grammarAccess.getImportAccess().getContentAssignment_2()); 
            // InternalParser.g:1169:2: ( rule__Import__ContentAssignment_2 )
            // InternalParser.g:1169:3: rule__Import__ContentAssignment_2
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
    // InternalParser.g:1177:1: rule__Import__Group__3 : rule__Import__Group__3__Impl ;
    public final void rule__Import__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:1181:1: ( rule__Import__Group__3__Impl )
            // InternalParser.g:1182:2: rule__Import__Group__3__Impl
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
    // InternalParser.g:1188:1: rule__Import__Group__3__Impl : ( '}' ) ;
    public final void rule__Import__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:1192:1: ( ( '}' ) )
            // InternalParser.g:1193:1: ( '}' )
            {
            // InternalParser.g:1193:1: ( '}' )
            // InternalParser.g:1194:2: '}'
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
    // InternalParser.g:1204:1: rule__Export__Group__0 : rule__Export__Group__0__Impl rule__Export__Group__1 ;
    public final void rule__Export__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:1208:1: ( rule__Export__Group__0__Impl rule__Export__Group__1 )
            // InternalParser.g:1209:2: rule__Export__Group__0__Impl rule__Export__Group__1
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
    // InternalParser.g:1216:1: rule__Export__Group__0__Impl : ( 'EXPORT' ) ;
    public final void rule__Export__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:1220:1: ( ( 'EXPORT' ) )
            // InternalParser.g:1221:1: ( 'EXPORT' )
            {
            // InternalParser.g:1221:1: ( 'EXPORT' )
            // InternalParser.g:1222:2: 'EXPORT'
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
    // InternalParser.g:1231:1: rule__Export__Group__1 : rule__Export__Group__1__Impl rule__Export__Group__2 ;
    public final void rule__Export__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:1235:1: ( rule__Export__Group__1__Impl rule__Export__Group__2 )
            // InternalParser.g:1236:2: rule__Export__Group__1__Impl rule__Export__Group__2
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
    // InternalParser.g:1243:1: rule__Export__Group__1__Impl : ( '{' ) ;
    public final void rule__Export__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:1247:1: ( ( '{' ) )
            // InternalParser.g:1248:1: ( '{' )
            {
            // InternalParser.g:1248:1: ( '{' )
            // InternalParser.g:1249:2: '{'
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
    // InternalParser.g:1258:1: rule__Export__Group__2 : rule__Export__Group__2__Impl rule__Export__Group__3 ;
    public final void rule__Export__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:1262:1: ( rule__Export__Group__2__Impl rule__Export__Group__3 )
            // InternalParser.g:1263:2: rule__Export__Group__2__Impl rule__Export__Group__3
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
    // InternalParser.g:1270:1: rule__Export__Group__2__Impl : ( ( rule__Export__ContentAssignment_2 ) ) ;
    public final void rule__Export__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:1274:1: ( ( ( rule__Export__ContentAssignment_2 ) ) )
            // InternalParser.g:1275:1: ( ( rule__Export__ContentAssignment_2 ) )
            {
            // InternalParser.g:1275:1: ( ( rule__Export__ContentAssignment_2 ) )
            // InternalParser.g:1276:2: ( rule__Export__ContentAssignment_2 )
            {
             before(grammarAccess.getExportAccess().getContentAssignment_2()); 
            // InternalParser.g:1277:2: ( rule__Export__ContentAssignment_2 )
            // InternalParser.g:1277:3: rule__Export__ContentAssignment_2
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
    // InternalParser.g:1285:1: rule__Export__Group__3 : rule__Export__Group__3__Impl ;
    public final void rule__Export__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:1289:1: ( rule__Export__Group__3__Impl )
            // InternalParser.g:1290:2: rule__Export__Group__3__Impl
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
    // InternalParser.g:1296:1: rule__Export__Group__3__Impl : ( '}' ) ;
    public final void rule__Export__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:1300:1: ( ( '}' ) )
            // InternalParser.g:1301:1: ( '}' )
            {
            // InternalParser.g:1301:1: ( '}' )
            // InternalParser.g:1302:2: '}'
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
    // InternalParser.g:1312:1: rule__Global__Group__0 : rule__Global__Group__0__Impl rule__Global__Group__1 ;
    public final void rule__Global__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:1316:1: ( rule__Global__Group__0__Impl rule__Global__Group__1 )
            // InternalParser.g:1317:2: rule__Global__Group__0__Impl rule__Global__Group__1
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
    // InternalParser.g:1324:1: rule__Global__Group__0__Impl : ( 'GLOBAL' ) ;
    public final void rule__Global__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:1328:1: ( ( 'GLOBAL' ) )
            // InternalParser.g:1329:1: ( 'GLOBAL' )
            {
            // InternalParser.g:1329:1: ( 'GLOBAL' )
            // InternalParser.g:1330:2: 'GLOBAL'
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
    // InternalParser.g:1339:1: rule__Global__Group__1 : rule__Global__Group__1__Impl rule__Global__Group__2 ;
    public final void rule__Global__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:1343:1: ( rule__Global__Group__1__Impl rule__Global__Group__2 )
            // InternalParser.g:1344:2: rule__Global__Group__1__Impl rule__Global__Group__2
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
    // InternalParser.g:1351:1: rule__Global__Group__1__Impl : ( '{' ) ;
    public final void rule__Global__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:1355:1: ( ( '{' ) )
            // InternalParser.g:1356:1: ( '{' )
            {
            // InternalParser.g:1356:1: ( '{' )
            // InternalParser.g:1357:2: '{'
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
    // InternalParser.g:1366:1: rule__Global__Group__2 : rule__Global__Group__2__Impl rule__Global__Group__3 ;
    public final void rule__Global__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:1370:1: ( rule__Global__Group__2__Impl rule__Global__Group__3 )
            // InternalParser.g:1371:2: rule__Global__Group__2__Impl rule__Global__Group__3
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
    // InternalParser.g:1378:1: rule__Global__Group__2__Impl : ( ( rule__Global__ContentAssignment_2 ) ) ;
    public final void rule__Global__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:1382:1: ( ( ( rule__Global__ContentAssignment_2 ) ) )
            // InternalParser.g:1383:1: ( ( rule__Global__ContentAssignment_2 ) )
            {
            // InternalParser.g:1383:1: ( ( rule__Global__ContentAssignment_2 ) )
            // InternalParser.g:1384:2: ( rule__Global__ContentAssignment_2 )
            {
             before(grammarAccess.getGlobalAccess().getContentAssignment_2()); 
            // InternalParser.g:1385:2: ( rule__Global__ContentAssignment_2 )
            // InternalParser.g:1385:3: rule__Global__ContentAssignment_2
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
    // InternalParser.g:1393:1: rule__Global__Group__3 : rule__Global__Group__3__Impl ;
    public final void rule__Global__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:1397:1: ( rule__Global__Group__3__Impl )
            // InternalParser.g:1398:2: rule__Global__Group__3__Impl
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
    // InternalParser.g:1404:1: rule__Global__Group__3__Impl : ( '}' ) ;
    public final void rule__Global__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:1408:1: ( ( '}' ) )
            // InternalParser.g:1409:1: ( '}' )
            {
            // InternalParser.g:1409:1: ( '}' )
            // InternalParser.g:1410:2: '}'
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
    // InternalParser.g:1420:1: rule__Local__Group__0 : rule__Local__Group__0__Impl rule__Local__Group__1 ;
    public final void rule__Local__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:1424:1: ( rule__Local__Group__0__Impl rule__Local__Group__1 )
            // InternalParser.g:1425:2: rule__Local__Group__0__Impl rule__Local__Group__1
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
    // InternalParser.g:1432:1: rule__Local__Group__0__Impl : ( 'LOCAL' ) ;
    public final void rule__Local__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:1436:1: ( ( 'LOCAL' ) )
            // InternalParser.g:1437:1: ( 'LOCAL' )
            {
            // InternalParser.g:1437:1: ( 'LOCAL' )
            // InternalParser.g:1438:2: 'LOCAL'
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
    // InternalParser.g:1447:1: rule__Local__Group__1 : rule__Local__Group__1__Impl rule__Local__Group__2 ;
    public final void rule__Local__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:1451:1: ( rule__Local__Group__1__Impl rule__Local__Group__2 )
            // InternalParser.g:1452:2: rule__Local__Group__1__Impl rule__Local__Group__2
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
    // InternalParser.g:1459:1: rule__Local__Group__1__Impl : ( '{' ) ;
    public final void rule__Local__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:1463:1: ( ( '{' ) )
            // InternalParser.g:1464:1: ( '{' )
            {
            // InternalParser.g:1464:1: ( '{' )
            // InternalParser.g:1465:2: '{'
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
    // InternalParser.g:1474:1: rule__Local__Group__2 : rule__Local__Group__2__Impl rule__Local__Group__3 ;
    public final void rule__Local__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:1478:1: ( rule__Local__Group__2__Impl rule__Local__Group__3 )
            // InternalParser.g:1479:2: rule__Local__Group__2__Impl rule__Local__Group__3
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
    // InternalParser.g:1486:1: rule__Local__Group__2__Impl : ( ( rule__Local__ContentAssignment_2 ) ) ;
    public final void rule__Local__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:1490:1: ( ( ( rule__Local__ContentAssignment_2 ) ) )
            // InternalParser.g:1491:1: ( ( rule__Local__ContentAssignment_2 ) )
            {
            // InternalParser.g:1491:1: ( ( rule__Local__ContentAssignment_2 ) )
            // InternalParser.g:1492:2: ( rule__Local__ContentAssignment_2 )
            {
             before(grammarAccess.getLocalAccess().getContentAssignment_2()); 
            // InternalParser.g:1493:2: ( rule__Local__ContentAssignment_2 )
            // InternalParser.g:1493:3: rule__Local__ContentAssignment_2
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
    // InternalParser.g:1501:1: rule__Local__Group__3 : rule__Local__Group__3__Impl ;
    public final void rule__Local__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:1505:1: ( rule__Local__Group__3__Impl )
            // InternalParser.g:1506:2: rule__Local__Group__3__Impl
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
    // InternalParser.g:1512:1: rule__Local__Group__3__Impl : ( '}' ) ;
    public final void rule__Local__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:1516:1: ( ( '}' ) )
            // InternalParser.g:1517:1: ( '}' )
            {
            // InternalParser.g:1517:1: ( '}' )
            // InternalParser.g:1518:2: '}'
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
    // InternalParser.g:1528:1: rule__Begin__Group__0 : rule__Begin__Group__0__Impl rule__Begin__Group__1 ;
    public final void rule__Begin__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:1532:1: ( rule__Begin__Group__0__Impl rule__Begin__Group__1 )
            // InternalParser.g:1533:2: rule__Begin__Group__0__Impl rule__Begin__Group__1
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
    // InternalParser.g:1540:1: rule__Begin__Group__0__Impl : ( 'BEGIN' ) ;
    public final void rule__Begin__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:1544:1: ( ( 'BEGIN' ) )
            // InternalParser.g:1545:1: ( 'BEGIN' )
            {
            // InternalParser.g:1545:1: ( 'BEGIN' )
            // InternalParser.g:1546:2: 'BEGIN'
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
    // InternalParser.g:1555:1: rule__Begin__Group__1 : rule__Begin__Group__1__Impl rule__Begin__Group__2 ;
    public final void rule__Begin__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:1559:1: ( rule__Begin__Group__1__Impl rule__Begin__Group__2 )
            // InternalParser.g:1560:2: rule__Begin__Group__1__Impl rule__Begin__Group__2
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
    // InternalParser.g:1567:1: rule__Begin__Group__1__Impl : ( '{' ) ;
    public final void rule__Begin__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:1571:1: ( ( '{' ) )
            // InternalParser.g:1572:1: ( '{' )
            {
            // InternalParser.g:1572:1: ( '{' )
            // InternalParser.g:1573:2: '{'
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
    // InternalParser.g:1582:1: rule__Begin__Group__2 : rule__Begin__Group__2__Impl rule__Begin__Group__3 ;
    public final void rule__Begin__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:1586:1: ( rule__Begin__Group__2__Impl rule__Begin__Group__3 )
            // InternalParser.g:1587:2: rule__Begin__Group__2__Impl rule__Begin__Group__3
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
    // InternalParser.g:1594:1: rule__Begin__Group__2__Impl : ( ( rule__Begin__ContentAssignment_2 ) ) ;
    public final void rule__Begin__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:1598:1: ( ( ( rule__Begin__ContentAssignment_2 ) ) )
            // InternalParser.g:1599:1: ( ( rule__Begin__ContentAssignment_2 ) )
            {
            // InternalParser.g:1599:1: ( ( rule__Begin__ContentAssignment_2 ) )
            // InternalParser.g:1600:2: ( rule__Begin__ContentAssignment_2 )
            {
             before(grammarAccess.getBeginAccess().getContentAssignment_2()); 
            // InternalParser.g:1601:2: ( rule__Begin__ContentAssignment_2 )
            // InternalParser.g:1601:3: rule__Begin__ContentAssignment_2
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
    // InternalParser.g:1609:1: rule__Begin__Group__3 : rule__Begin__Group__3__Impl ;
    public final void rule__Begin__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:1613:1: ( rule__Begin__Group__3__Impl )
            // InternalParser.g:1614:2: rule__Begin__Group__3__Impl
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
    // InternalParser.g:1620:1: rule__Begin__Group__3__Impl : ( '}' ) ;
    public final void rule__Begin__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:1624:1: ( ( '}' ) )
            // InternalParser.g:1625:1: ( '}' )
            {
            // InternalParser.g:1625:1: ( '}' )
            // InternalParser.g:1626:2: '}'
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
    // InternalParser.g:1636:1: rule__Close__Group__0 : rule__Close__Group__0__Impl rule__Close__Group__1 ;
    public final void rule__Close__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:1640:1: ( rule__Close__Group__0__Impl rule__Close__Group__1 )
            // InternalParser.g:1641:2: rule__Close__Group__0__Impl rule__Close__Group__1
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
    // InternalParser.g:1648:1: rule__Close__Group__0__Impl : ( 'CLOSE' ) ;
    public final void rule__Close__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:1652:1: ( ( 'CLOSE' ) )
            // InternalParser.g:1653:1: ( 'CLOSE' )
            {
            // InternalParser.g:1653:1: ( 'CLOSE' )
            // InternalParser.g:1654:2: 'CLOSE'
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
    // InternalParser.g:1663:1: rule__Close__Group__1 : rule__Close__Group__1__Impl rule__Close__Group__2 ;
    public final void rule__Close__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:1667:1: ( rule__Close__Group__1__Impl rule__Close__Group__2 )
            // InternalParser.g:1668:2: rule__Close__Group__1__Impl rule__Close__Group__2
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
    // InternalParser.g:1675:1: rule__Close__Group__1__Impl : ( '{' ) ;
    public final void rule__Close__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:1679:1: ( ( '{' ) )
            // InternalParser.g:1680:1: ( '{' )
            {
            // InternalParser.g:1680:1: ( '{' )
            // InternalParser.g:1681:2: '{'
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
    // InternalParser.g:1690:1: rule__Close__Group__2 : rule__Close__Group__2__Impl rule__Close__Group__3 ;
    public final void rule__Close__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:1694:1: ( rule__Close__Group__2__Impl rule__Close__Group__3 )
            // InternalParser.g:1695:2: rule__Close__Group__2__Impl rule__Close__Group__3
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
    // InternalParser.g:1702:1: rule__Close__Group__2__Impl : ( ( rule__Close__ContentAssignment_2 ) ) ;
    public final void rule__Close__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:1706:1: ( ( ( rule__Close__ContentAssignment_2 ) ) )
            // InternalParser.g:1707:1: ( ( rule__Close__ContentAssignment_2 ) )
            {
            // InternalParser.g:1707:1: ( ( rule__Close__ContentAssignment_2 ) )
            // InternalParser.g:1708:2: ( rule__Close__ContentAssignment_2 )
            {
             before(grammarAccess.getCloseAccess().getContentAssignment_2()); 
            // InternalParser.g:1709:2: ( rule__Close__ContentAssignment_2 )
            // InternalParser.g:1709:3: rule__Close__ContentAssignment_2
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
    // InternalParser.g:1717:1: rule__Close__Group__3 : rule__Close__Group__3__Impl ;
    public final void rule__Close__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:1721:1: ( rule__Close__Group__3__Impl )
            // InternalParser.g:1722:2: rule__Close__Group__3__Impl
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
    // InternalParser.g:1728:1: rule__Close__Group__3__Impl : ( '}' ) ;
    public final void rule__Close__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:1732:1: ( ( '}' ) )
            // InternalParser.g:1733:1: ( '}' )
            {
            // InternalParser.g:1733:1: ( '}' )
            // InternalParser.g:1734:2: '}'
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
    // InternalParser.g:1744:1: rule__Tokens__Group__0 : rule__Tokens__Group__0__Impl rule__Tokens__Group__1 ;
    public final void rule__Tokens__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:1748:1: ( rule__Tokens__Group__0__Impl rule__Tokens__Group__1 )
            // InternalParser.g:1749:2: rule__Tokens__Group__0__Impl rule__Tokens__Group__1
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
    // InternalParser.g:1756:1: rule__Tokens__Group__0__Impl : ( 'TOKEN' ) ;
    public final void rule__Tokens__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:1760:1: ( ( 'TOKEN' ) )
            // InternalParser.g:1761:1: ( 'TOKEN' )
            {
            // InternalParser.g:1761:1: ( 'TOKEN' )
            // InternalParser.g:1762:2: 'TOKEN'
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
    // InternalParser.g:1771:1: rule__Tokens__Group__1 : rule__Tokens__Group__1__Impl ;
    public final void rule__Tokens__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:1775:1: ( rule__Tokens__Group__1__Impl )
            // InternalParser.g:1776:2: rule__Tokens__Group__1__Impl
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
    // InternalParser.g:1782:1: rule__Tokens__Group__1__Impl : ( ( rule__Tokens__TokensAssignment_1 )* ) ;
    public final void rule__Tokens__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:1786:1: ( ( ( rule__Tokens__TokensAssignment_1 )* ) )
            // InternalParser.g:1787:1: ( ( rule__Tokens__TokensAssignment_1 )* )
            {
            // InternalParser.g:1787:1: ( ( rule__Tokens__TokensAssignment_1 )* )
            // InternalParser.g:1788:2: ( rule__Tokens__TokensAssignment_1 )*
            {
             before(grammarAccess.getTokensAccess().getTokensAssignment_1()); 
            // InternalParser.g:1789:2: ( rule__Tokens__TokensAssignment_1 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=RULE_WS && LA12_0<=RULE_INT)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalParser.g:1789:3: rule__Tokens__TokensAssignment_1
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
    // InternalParser.g:1798:1: rule__DefinedToken__Group_0__0 : rule__DefinedToken__Group_0__0__Impl rule__DefinedToken__Group_0__1 ;
    public final void rule__DefinedToken__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:1802:1: ( rule__DefinedToken__Group_0__0__Impl rule__DefinedToken__Group_0__1 )
            // InternalParser.g:1803:2: rule__DefinedToken__Group_0__0__Impl rule__DefinedToken__Group_0__1
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
    // InternalParser.g:1810:1: rule__DefinedToken__Group_0__0__Impl : ( ( rule__DefinedToken__NameAssignment_0_0 ) ) ;
    public final void rule__DefinedToken__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:1814:1: ( ( ( rule__DefinedToken__NameAssignment_0_0 ) ) )
            // InternalParser.g:1815:1: ( ( rule__DefinedToken__NameAssignment_0_0 ) )
            {
            // InternalParser.g:1815:1: ( ( rule__DefinedToken__NameAssignment_0_0 ) )
            // InternalParser.g:1816:2: ( rule__DefinedToken__NameAssignment_0_0 )
            {
             before(grammarAccess.getDefinedTokenAccess().getNameAssignment_0_0()); 
            // InternalParser.g:1817:2: ( rule__DefinedToken__NameAssignment_0_0 )
            // InternalParser.g:1817:3: rule__DefinedToken__NameAssignment_0_0
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
    // InternalParser.g:1825:1: rule__DefinedToken__Group_0__1 : rule__DefinedToken__Group_0__1__Impl ;
    public final void rule__DefinedToken__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:1829:1: ( rule__DefinedToken__Group_0__1__Impl )
            // InternalParser.g:1830:2: rule__DefinedToken__Group_0__1__Impl
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
    // InternalParser.g:1836:1: rule__DefinedToken__Group_0__1__Impl : ( ( rule__DefinedToken__Group_0_1__0 ) ) ;
    public final void rule__DefinedToken__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:1840:1: ( ( ( rule__DefinedToken__Group_0_1__0 ) ) )
            // InternalParser.g:1841:1: ( ( rule__DefinedToken__Group_0_1__0 ) )
            {
            // InternalParser.g:1841:1: ( ( rule__DefinedToken__Group_0_1__0 ) )
            // InternalParser.g:1842:2: ( rule__DefinedToken__Group_0_1__0 )
            {
             before(grammarAccess.getDefinedTokenAccess().getGroup_0_1()); 
            // InternalParser.g:1843:2: ( rule__DefinedToken__Group_0_1__0 )
            // InternalParser.g:1843:3: rule__DefinedToken__Group_0_1__0
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
    // InternalParser.g:1852:1: rule__DefinedToken__Group_0_1__0 : rule__DefinedToken__Group_0_1__0__Impl rule__DefinedToken__Group_0_1__1 ;
    public final void rule__DefinedToken__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:1856:1: ( rule__DefinedToken__Group_0_1__0__Impl rule__DefinedToken__Group_0_1__1 )
            // InternalParser.g:1857:2: rule__DefinedToken__Group_0_1__0__Impl rule__DefinedToken__Group_0_1__1
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
    // InternalParser.g:1864:1: rule__DefinedToken__Group_0_1__0__Impl : ( '=' ) ;
    public final void rule__DefinedToken__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:1868:1: ( ( '=' ) )
            // InternalParser.g:1869:1: ( '=' )
            {
            // InternalParser.g:1869:1: ( '=' )
            // InternalParser.g:1870:2: '='
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
    // InternalParser.g:1879:1: rule__DefinedToken__Group_0_1__1 : rule__DefinedToken__Group_0_1__1__Impl rule__DefinedToken__Group_0_1__2 ;
    public final void rule__DefinedToken__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:1883:1: ( rule__DefinedToken__Group_0_1__1__Impl rule__DefinedToken__Group_0_1__2 )
            // InternalParser.g:1884:2: rule__DefinedToken__Group_0_1__1__Impl rule__DefinedToken__Group_0_1__2
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
    // InternalParser.g:1891:1: rule__DefinedToken__Group_0_1__1__Impl : ( ( rule__DefinedToken__NumberAssignment_0_1_1 ) ) ;
    public final void rule__DefinedToken__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:1895:1: ( ( ( rule__DefinedToken__NumberAssignment_0_1_1 ) ) )
            // InternalParser.g:1896:1: ( ( rule__DefinedToken__NumberAssignment_0_1_1 ) )
            {
            // InternalParser.g:1896:1: ( ( rule__DefinedToken__NumberAssignment_0_1_1 ) )
            // InternalParser.g:1897:2: ( rule__DefinedToken__NumberAssignment_0_1_1 )
            {
             before(grammarAccess.getDefinedTokenAccess().getNumberAssignment_0_1_1()); 
            // InternalParser.g:1898:2: ( rule__DefinedToken__NumberAssignment_0_1_1 )
            // InternalParser.g:1898:3: rule__DefinedToken__NumberAssignment_0_1_1
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
    // InternalParser.g:1906:1: rule__DefinedToken__Group_0_1__2 : rule__DefinedToken__Group_0_1__2__Impl ;
    public final void rule__DefinedToken__Group_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:1910:1: ( rule__DefinedToken__Group_0_1__2__Impl )
            // InternalParser.g:1911:2: rule__DefinedToken__Group_0_1__2__Impl
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
    // InternalParser.g:1917:1: rule__DefinedToken__Group_0_1__2__Impl : ( ( rule__DefinedToken__Group_0_1_2__0 )? ) ;
    public final void rule__DefinedToken__Group_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:1921:1: ( ( ( rule__DefinedToken__Group_0_1_2__0 )? ) )
            // InternalParser.g:1922:1: ( ( rule__DefinedToken__Group_0_1_2__0 )? )
            {
            // InternalParser.g:1922:1: ( ( rule__DefinedToken__Group_0_1_2__0 )? )
            // InternalParser.g:1923:2: ( rule__DefinedToken__Group_0_1_2__0 )?
            {
             before(grammarAccess.getDefinedTokenAccess().getGroup_0_1_2()); 
            // InternalParser.g:1924:2: ( rule__DefinedToken__Group_0_1_2__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==30) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalParser.g:1924:3: rule__DefinedToken__Group_0_1_2__0
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
    // InternalParser.g:1933:1: rule__DefinedToken__Group_0_1_2__0 : rule__DefinedToken__Group_0_1_2__0__Impl rule__DefinedToken__Group_0_1_2__1 ;
    public final void rule__DefinedToken__Group_0_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:1937:1: ( rule__DefinedToken__Group_0_1_2__0__Impl rule__DefinedToken__Group_0_1_2__1 )
            // InternalParser.g:1938:2: rule__DefinedToken__Group_0_1_2__0__Impl rule__DefinedToken__Group_0_1_2__1
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
    // InternalParser.g:1945:1: rule__DefinedToken__Group_0_1_2__0__Impl : ( ',' ) ;
    public final void rule__DefinedToken__Group_0_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:1949:1: ( ( ',' ) )
            // InternalParser.g:1950:1: ( ',' )
            {
            // InternalParser.g:1950:1: ( ',' )
            // InternalParser.g:1951:2: ','
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
    // InternalParser.g:1960:1: rule__DefinedToken__Group_0_1_2__1 : rule__DefinedToken__Group_0_1_2__1__Impl ;
    public final void rule__DefinedToken__Group_0_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:1964:1: ( rule__DefinedToken__Group_0_1_2__1__Impl )
            // InternalParser.g:1965:2: rule__DefinedToken__Group_0_1_2__1__Impl
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
    // InternalParser.g:1971:1: rule__DefinedToken__Group_0_1_2__1__Impl : ( ( rule__DefinedToken__ExtraAssignment_0_1_2_1 ) ) ;
    public final void rule__DefinedToken__Group_0_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:1975:1: ( ( ( rule__DefinedToken__ExtraAssignment_0_1_2_1 ) ) )
            // InternalParser.g:1976:1: ( ( rule__DefinedToken__ExtraAssignment_0_1_2_1 ) )
            {
            // InternalParser.g:1976:1: ( ( rule__DefinedToken__ExtraAssignment_0_1_2_1 ) )
            // InternalParser.g:1977:2: ( rule__DefinedToken__ExtraAssignment_0_1_2_1 )
            {
             before(grammarAccess.getDefinedTokenAccess().getExtraAssignment_0_1_2_1()); 
            // InternalParser.g:1978:2: ( rule__DefinedToken__ExtraAssignment_0_1_2_1 )
            // InternalParser.g:1978:3: rule__DefinedToken__ExtraAssignment_0_1_2_1
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
    // InternalParser.g:1987:1: rule__TokenExtra__Group__0 : rule__TokenExtra__Group__0__Impl rule__TokenExtra__Group__1 ;
    public final void rule__TokenExtra__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:1991:1: ( rule__TokenExtra__Group__0__Impl rule__TokenExtra__Group__1 )
            // InternalParser.g:1992:2: rule__TokenExtra__Group__0__Impl rule__TokenExtra__Group__1
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
    // InternalParser.g:1999:1: rule__TokenExtra__Group__0__Impl : ( ( rule__TokenExtra__CostAssignment_0 ) ) ;
    public final void rule__TokenExtra__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:2003:1: ( ( ( rule__TokenExtra__CostAssignment_0 ) ) )
            // InternalParser.g:2004:1: ( ( rule__TokenExtra__CostAssignment_0 ) )
            {
            // InternalParser.g:2004:1: ( ( rule__TokenExtra__CostAssignment_0 ) )
            // InternalParser.g:2005:2: ( rule__TokenExtra__CostAssignment_0 )
            {
             before(grammarAccess.getTokenExtraAccess().getCostAssignment_0()); 
            // InternalParser.g:2006:2: ( rule__TokenExtra__CostAssignment_0 )
            // InternalParser.g:2006:3: rule__TokenExtra__CostAssignment_0
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
    // InternalParser.g:2014:1: rule__TokenExtra__Group__1 : rule__TokenExtra__Group__1__Impl rule__TokenExtra__Group__2 ;
    public final void rule__TokenExtra__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:2018:1: ( rule__TokenExtra__Group__1__Impl rule__TokenExtra__Group__2 )
            // InternalParser.g:2019:2: rule__TokenExtra__Group__1__Impl rule__TokenExtra__Group__2
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
    // InternalParser.g:2026:1: rule__TokenExtra__Group__1__Impl : ( ',' ) ;
    public final void rule__TokenExtra__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:2030:1: ( ( ',' ) )
            // InternalParser.g:2031:1: ( ',' )
            {
            // InternalParser.g:2031:1: ( ',' )
            // InternalParser.g:2032:2: ','
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
    // InternalParser.g:2041:1: rule__TokenExtra__Group__2 : rule__TokenExtra__Group__2__Impl ;
    public final void rule__TokenExtra__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:2045:1: ( rule__TokenExtra__Group__2__Impl )
            // InternalParser.g:2046:2: rule__TokenExtra__Group__2__Impl
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
    // InternalParser.g:2052:1: rule__TokenExtra__Group__2__Impl : ( ( rule__TokenExtra__PresentationAssignment_2 ) ) ;
    public final void rule__TokenExtra__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:2056:1: ( ( ( rule__TokenExtra__PresentationAssignment_2 ) ) )
            // InternalParser.g:2057:1: ( ( rule__TokenExtra__PresentationAssignment_2 ) )
            {
            // InternalParser.g:2057:1: ( ( rule__TokenExtra__PresentationAssignment_2 ) )
            // InternalParser.g:2058:2: ( rule__TokenExtra__PresentationAssignment_2 )
            {
             before(grammarAccess.getTokenExtraAccess().getPresentationAssignment_2()); 
            // InternalParser.g:2059:2: ( rule__TokenExtra__PresentationAssignment_2 )
            // InternalParser.g:2059:3: rule__TokenExtra__PresentationAssignment_2
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
    // InternalParser.g:2068:1: rule__CodeBlock__Group_1__0 : rule__CodeBlock__Group_1__0__Impl rule__CodeBlock__Group_1__1 ;
    public final void rule__CodeBlock__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:2072:1: ( rule__CodeBlock__Group_1__0__Impl rule__CodeBlock__Group_1__1 )
            // InternalParser.g:2073:2: rule__CodeBlock__Group_1__0__Impl rule__CodeBlock__Group_1__1
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
    // InternalParser.g:2080:1: rule__CodeBlock__Group_1__0__Impl : ( '{' ) ;
    public final void rule__CodeBlock__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:2084:1: ( ( '{' ) )
            // InternalParser.g:2085:1: ( '{' )
            {
            // InternalParser.g:2085:1: ( '{' )
            // InternalParser.g:2086:2: '{'
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
    // InternalParser.g:2095:1: rule__CodeBlock__Group_1__1 : rule__CodeBlock__Group_1__1__Impl rule__CodeBlock__Group_1__2 ;
    public final void rule__CodeBlock__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:2099:1: ( rule__CodeBlock__Group_1__1__Impl rule__CodeBlock__Group_1__2 )
            // InternalParser.g:2100:2: rule__CodeBlock__Group_1__1__Impl rule__CodeBlock__Group_1__2
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
    // InternalParser.g:2107:1: rule__CodeBlock__Group_1__1__Impl : ( ruleCodeBlock ) ;
    public final void rule__CodeBlock__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:2111:1: ( ( ruleCodeBlock ) )
            // InternalParser.g:2112:1: ( ruleCodeBlock )
            {
            // InternalParser.g:2112:1: ( ruleCodeBlock )
            // InternalParser.g:2113:2: ruleCodeBlock
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
    // InternalParser.g:2122:1: rule__CodeBlock__Group_1__2 : rule__CodeBlock__Group_1__2__Impl ;
    public final void rule__CodeBlock__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:2126:1: ( rule__CodeBlock__Group_1__2__Impl )
            // InternalParser.g:2127:2: rule__CodeBlock__Group_1__2__Impl
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
    // InternalParser.g:2133:1: rule__CodeBlock__Group_1__2__Impl : ( '}' ) ;
    public final void rule__CodeBlock__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:2137:1: ( ( '}' ) )
            // InternalParser.g:2138:1: ( '}' )
            {
            // InternalParser.g:2138:1: ( '}' )
            // InternalParser.g:2139:2: '}'
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
    // InternalParser.g:2149:1: rule__Precedence__Group__0 : rule__Precedence__Group__0__Impl rule__Precedence__Group__1 ;
    public final void rule__Precedence__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:2153:1: ( rule__Precedence__Group__0__Impl rule__Precedence__Group__1 )
            // InternalParser.g:2154:2: rule__Precedence__Group__0__Impl rule__Precedence__Group__1
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
    // InternalParser.g:2161:1: rule__Precedence__Group__0__Impl : ( 'PREC' ) ;
    public final void rule__Precedence__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:2165:1: ( ( 'PREC' ) )
            // InternalParser.g:2166:1: ( 'PREC' )
            {
            // InternalParser.g:2166:1: ( 'PREC' )
            // InternalParser.g:2167:2: 'PREC'
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
    // InternalParser.g:2176:1: rule__Precedence__Group__1 : rule__Precedence__Group__1__Impl ;
    public final void rule__Precedence__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:2180:1: ( rule__Precedence__Group__1__Impl )
            // InternalParser.g:2181:2: rule__Precedence__Group__1__Impl
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
    // InternalParser.g:2187:1: rule__Precedence__Group__1__Impl : ( ( rule__Precedence__RowsAssignment_1 )* ) ;
    public final void rule__Precedence__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:2191:1: ( ( ( rule__Precedence__RowsAssignment_1 )* ) )
            // InternalParser.g:2192:1: ( ( rule__Precedence__RowsAssignment_1 )* )
            {
            // InternalParser.g:2192:1: ( ( rule__Precedence__RowsAssignment_1 )* )
            // InternalParser.g:2193:2: ( rule__Precedence__RowsAssignment_1 )*
            {
             before(grammarAccess.getPrecedenceAccess().getRowsAssignment_1()); 
            // InternalParser.g:2194:2: ( rule__Precedence__RowsAssignment_1 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=33 && LA14_0<=35)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalParser.g:2194:3: rule__Precedence__RowsAssignment_1
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
    // InternalParser.g:2203:1: rule__PrecedenceRow__Group__0 : rule__PrecedenceRow__Group__0__Impl rule__PrecedenceRow__Group__1 ;
    public final void rule__PrecedenceRow__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:2207:1: ( rule__PrecedenceRow__Group__0__Impl rule__PrecedenceRow__Group__1 )
            // InternalParser.g:2208:2: rule__PrecedenceRow__Group__0__Impl rule__PrecedenceRow__Group__1
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
    // InternalParser.g:2215:1: rule__PrecedenceRow__Group__0__Impl : ( ( rule__PrecedenceRow__TypeAssignment_0 ) ) ;
    public final void rule__PrecedenceRow__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:2219:1: ( ( ( rule__PrecedenceRow__TypeAssignment_0 ) ) )
            // InternalParser.g:2220:1: ( ( rule__PrecedenceRow__TypeAssignment_0 ) )
            {
            // InternalParser.g:2220:1: ( ( rule__PrecedenceRow__TypeAssignment_0 ) )
            // InternalParser.g:2221:2: ( rule__PrecedenceRow__TypeAssignment_0 )
            {
             before(grammarAccess.getPrecedenceRowAccess().getTypeAssignment_0()); 
            // InternalParser.g:2222:2: ( rule__PrecedenceRow__TypeAssignment_0 )
            // InternalParser.g:2222:3: rule__PrecedenceRow__TypeAssignment_0
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
    // InternalParser.g:2230:1: rule__PrecedenceRow__Group__1 : rule__PrecedenceRow__Group__1__Impl ;
    public final void rule__PrecedenceRow__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:2234:1: ( rule__PrecedenceRow__Group__1__Impl )
            // InternalParser.g:2235:2: rule__PrecedenceRow__Group__1__Impl
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
    // InternalParser.g:2241:1: rule__PrecedenceRow__Group__1__Impl : ( ( rule__PrecedenceRow__TokensAssignment_1 )* ) ;
    public final void rule__PrecedenceRow__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:2245:1: ( ( ( rule__PrecedenceRow__TokensAssignment_1 )* ) )
            // InternalParser.g:2246:1: ( ( rule__PrecedenceRow__TokensAssignment_1 )* )
            {
            // InternalParser.g:2246:1: ( ( rule__PrecedenceRow__TokensAssignment_1 )* )
            // InternalParser.g:2247:2: ( rule__PrecedenceRow__TokensAssignment_1 )*
            {
             before(grammarAccess.getPrecedenceRowAccess().getTokensAssignment_1()); 
            // InternalParser.g:2248:2: ( rule__PrecedenceRow__TokensAssignment_1 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalParser.g:2248:3: rule__PrecedenceRow__TokensAssignment_1
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
    // InternalParser.g:2257:1: rule__StartSymbols__Group__0 : rule__StartSymbols__Group__0__Impl rule__StartSymbols__Group__1 ;
    public final void rule__StartSymbols__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:2261:1: ( rule__StartSymbols__Group__0__Impl rule__StartSymbols__Group__1 )
            // InternalParser.g:2262:2: rule__StartSymbols__Group__0__Impl rule__StartSymbols__Group__1
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
    // InternalParser.g:2269:1: rule__StartSymbols__Group__0__Impl : ( 'START' ) ;
    public final void rule__StartSymbols__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:2273:1: ( ( 'START' ) )
            // InternalParser.g:2274:1: ( 'START' )
            {
            // InternalParser.g:2274:1: ( 'START' )
            // InternalParser.g:2275:2: 'START'
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
    // InternalParser.g:2284:1: rule__StartSymbols__Group__1 : rule__StartSymbols__Group__1__Impl ;
    public final void rule__StartSymbols__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:2288:1: ( rule__StartSymbols__Group__1__Impl )
            // InternalParser.g:2289:2: rule__StartSymbols__Group__1__Impl
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
    // InternalParser.g:2295:1: rule__StartSymbols__Group__1__Impl : ( ( rule__StartSymbols__StatesAssignment_1 )* ) ;
    public final void rule__StartSymbols__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:2299:1: ( ( ( rule__StartSymbols__StatesAssignment_1 )* ) )
            // InternalParser.g:2300:1: ( ( rule__StartSymbols__StatesAssignment_1 )* )
            {
            // InternalParser.g:2300:1: ( ( rule__StartSymbols__StatesAssignment_1 )* )
            // InternalParser.g:2301:2: ( rule__StartSymbols__StatesAssignment_1 )*
            {
             before(grammarAccess.getStartSymbolsAccess().getStatesAssignment_1()); 
            // InternalParser.g:2302:2: ( rule__StartSymbols__StatesAssignment_1 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ID) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalParser.g:2302:3: rule__StartSymbols__StatesAssignment_1
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


    // $ANTLR start "rule__GrammerRules__Group__0"
    // InternalParser.g:2311:1: rule__GrammerRules__Group__0 : rule__GrammerRules__Group__0__Impl rule__GrammerRules__Group__1 ;
    public final void rule__GrammerRules__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:2315:1: ( rule__GrammerRules__Group__0__Impl rule__GrammerRules__Group__1 )
            // InternalParser.g:2316:2: rule__GrammerRules__Group__0__Impl rule__GrammerRules__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__GrammerRules__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GrammerRules__Group__1();

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
    // $ANTLR end "rule__GrammerRules__Group__0"


    // $ANTLR start "rule__GrammerRules__Group__0__Impl"
    // InternalParser.g:2323:1: rule__GrammerRules__Group__0__Impl : ( ( rule__GrammerRules__Alternatives_0 ) ) ;
    public final void rule__GrammerRules__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:2327:1: ( ( ( rule__GrammerRules__Alternatives_0 ) ) )
            // InternalParser.g:2328:1: ( ( rule__GrammerRules__Alternatives_0 ) )
            {
            // InternalParser.g:2328:1: ( ( rule__GrammerRules__Alternatives_0 ) )
            // InternalParser.g:2329:2: ( rule__GrammerRules__Alternatives_0 )
            {
             before(grammarAccess.getGrammerRulesAccess().getAlternatives_0()); 
            // InternalParser.g:2330:2: ( rule__GrammerRules__Alternatives_0 )
            // InternalParser.g:2330:3: rule__GrammerRules__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__GrammerRules__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getGrammerRulesAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrammerRules__Group__0__Impl"


    // $ANTLR start "rule__GrammerRules__Group__1"
    // InternalParser.g:2338:1: rule__GrammerRules__Group__1 : rule__GrammerRules__Group__1__Impl ;
    public final void rule__GrammerRules__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:2342:1: ( rule__GrammerRules__Group__1__Impl )
            // InternalParser.g:2343:2: rule__GrammerRules__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GrammerRules__Group__1__Impl();

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
    // $ANTLR end "rule__GrammerRules__Group__1"


    // $ANTLR start "rule__GrammerRules__Group__1__Impl"
    // InternalParser.g:2349:1: rule__GrammerRules__Group__1__Impl : ( ( rule__GrammerRules__RulesAssignment_1 )* ) ;
    public final void rule__GrammerRules__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:2353:1: ( ( ( rule__GrammerRules__RulesAssignment_1 )* ) )
            // InternalParser.g:2354:1: ( ( rule__GrammerRules__RulesAssignment_1 )* )
            {
            // InternalParser.g:2354:1: ( ( rule__GrammerRules__RulesAssignment_1 )* )
            // InternalParser.g:2355:2: ( rule__GrammerRules__RulesAssignment_1 )*
            {
             before(grammarAccess.getGrammerRulesAccess().getRulesAssignment_1()); 
            // InternalParser.g:2356:2: ( rule__GrammerRules__RulesAssignment_1 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_ID) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalParser.g:2356:3: rule__GrammerRules__RulesAssignment_1
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__GrammerRules__RulesAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getGrammerRulesAccess().getRulesAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrammerRules__Group__1__Impl"


    // $ANTLR start "rule__GrammarRule__Group__0"
    // InternalParser.g:2365:1: rule__GrammarRule__Group__0 : rule__GrammarRule__Group__0__Impl rule__GrammarRule__Group__1 ;
    public final void rule__GrammarRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:2369:1: ( rule__GrammarRule__Group__0__Impl rule__GrammarRule__Group__1 )
            // InternalParser.g:2370:2: rule__GrammarRule__Group__0__Impl rule__GrammarRule__Group__1
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
    // InternalParser.g:2377:1: rule__GrammarRule__Group__0__Impl : ( ( rule__GrammarRule__NameAssignment_0 ) ) ;
    public final void rule__GrammarRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:2381:1: ( ( ( rule__GrammarRule__NameAssignment_0 ) ) )
            // InternalParser.g:2382:1: ( ( rule__GrammarRule__NameAssignment_0 ) )
            {
            // InternalParser.g:2382:1: ( ( rule__GrammarRule__NameAssignment_0 ) )
            // InternalParser.g:2383:2: ( rule__GrammarRule__NameAssignment_0 )
            {
             before(grammarAccess.getGrammarRuleAccess().getNameAssignment_0()); 
            // InternalParser.g:2384:2: ( rule__GrammarRule__NameAssignment_0 )
            // InternalParser.g:2384:3: rule__GrammarRule__NameAssignment_0
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
    // InternalParser.g:2392:1: rule__GrammarRule__Group__1 : rule__GrammarRule__Group__1__Impl rule__GrammarRule__Group__2 ;
    public final void rule__GrammarRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:2396:1: ( rule__GrammarRule__Group__1__Impl rule__GrammarRule__Group__2 )
            // InternalParser.g:2397:2: rule__GrammarRule__Group__1__Impl rule__GrammarRule__Group__2
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
    // InternalParser.g:2404:1: rule__GrammarRule__Group__1__Impl : ( ':' ) ;
    public final void rule__GrammarRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:2408:1: ( ( ':' ) )
            // InternalParser.g:2409:1: ( ':' )
            {
            // InternalParser.g:2409:1: ( ':' )
            // InternalParser.g:2410:2: ':'
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
    // InternalParser.g:2419:1: rule__GrammarRule__Group__2 : rule__GrammarRule__Group__2__Impl rule__GrammarRule__Group__3 ;
    public final void rule__GrammarRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:2423:1: ( rule__GrammarRule__Group__2__Impl rule__GrammarRule__Group__3 )
            // InternalParser.g:2424:2: rule__GrammarRule__Group__2__Impl rule__GrammarRule__Group__3
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
    // InternalParser.g:2431:1: rule__GrammarRule__Group__2__Impl : ( ( rule__GrammarRule__BodyAssignment_2 ) ) ;
    public final void rule__GrammarRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:2435:1: ( ( ( rule__GrammarRule__BodyAssignment_2 ) ) )
            // InternalParser.g:2436:1: ( ( rule__GrammarRule__BodyAssignment_2 ) )
            {
            // InternalParser.g:2436:1: ( ( rule__GrammarRule__BodyAssignment_2 ) )
            // InternalParser.g:2437:2: ( rule__GrammarRule__BodyAssignment_2 )
            {
             before(grammarAccess.getGrammarRuleAccess().getBodyAssignment_2()); 
            // InternalParser.g:2438:2: ( rule__GrammarRule__BodyAssignment_2 )
            // InternalParser.g:2438:3: rule__GrammarRule__BodyAssignment_2
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
    // InternalParser.g:2446:1: rule__GrammarRule__Group__3 : rule__GrammarRule__Group__3__Impl rule__GrammarRule__Group__4 ;
    public final void rule__GrammarRule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:2450:1: ( rule__GrammarRule__Group__3__Impl rule__GrammarRule__Group__4 )
            // InternalParser.g:2451:2: rule__GrammarRule__Group__3__Impl rule__GrammarRule__Group__4
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
    // InternalParser.g:2458:1: rule__GrammarRule__Group__3__Impl : ( ( rule__GrammarRule__Group_3__0 )* ) ;
    public final void rule__GrammarRule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:2462:1: ( ( ( rule__GrammarRule__Group_3__0 )* ) )
            // InternalParser.g:2463:1: ( ( rule__GrammarRule__Group_3__0 )* )
            {
            // InternalParser.g:2463:1: ( ( rule__GrammarRule__Group_3__0 )* )
            // InternalParser.g:2464:2: ( rule__GrammarRule__Group_3__0 )*
            {
             before(grammarAccess.getGrammarRuleAccess().getGroup_3()); 
            // InternalParser.g:2465:2: ( rule__GrammarRule__Group_3__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==19) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalParser.g:2465:3: rule__GrammarRule__Group_3__0
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
    // InternalParser.g:2473:1: rule__GrammarRule__Group__4 : rule__GrammarRule__Group__4__Impl ;
    public final void rule__GrammarRule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:2477:1: ( rule__GrammarRule__Group__4__Impl )
            // InternalParser.g:2478:2: rule__GrammarRule__Group__4__Impl
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
    // InternalParser.g:2484:1: rule__GrammarRule__Group__4__Impl : ( '.' ) ;
    public final void rule__GrammarRule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:2488:1: ( ( '.' ) )
            // InternalParser.g:2489:1: ( '.' )
            {
            // InternalParser.g:2489:1: ( '.' )
            // InternalParser.g:2490:2: '.'
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
    // InternalParser.g:2500:1: rule__GrammarRule__Group_3__0 : rule__GrammarRule__Group_3__0__Impl rule__GrammarRule__Group_3__1 ;
    public final void rule__GrammarRule__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:2504:1: ( rule__GrammarRule__Group_3__0__Impl rule__GrammarRule__Group_3__1 )
            // InternalParser.g:2505:2: rule__GrammarRule__Group_3__0__Impl rule__GrammarRule__Group_3__1
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
    // InternalParser.g:2512:1: rule__GrammarRule__Group_3__0__Impl : ( '|' ) ;
    public final void rule__GrammarRule__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:2516:1: ( ( '|' ) )
            // InternalParser.g:2517:1: ( '|' )
            {
            // InternalParser.g:2517:1: ( '|' )
            // InternalParser.g:2518:2: '|'
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
    // InternalParser.g:2527:1: rule__GrammarRule__Group_3__1 : rule__GrammarRule__Group_3__1__Impl ;
    public final void rule__GrammarRule__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:2531:1: ( rule__GrammarRule__Group_3__1__Impl )
            // InternalParser.g:2532:2: rule__GrammarRule__Group_3__1__Impl
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
    // InternalParser.g:2538:1: rule__GrammarRule__Group_3__1__Impl : ( ( rule__GrammarRule__BodyAssignment_3_1 ) ) ;
    public final void rule__GrammarRule__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:2542:1: ( ( ( rule__GrammarRule__BodyAssignment_3_1 ) ) )
            // InternalParser.g:2543:1: ( ( rule__GrammarRule__BodyAssignment_3_1 ) )
            {
            // InternalParser.g:2543:1: ( ( rule__GrammarRule__BodyAssignment_3_1 ) )
            // InternalParser.g:2544:2: ( rule__GrammarRule__BodyAssignment_3_1 )
            {
             before(grammarAccess.getGrammarRuleAccess().getBodyAssignment_3_1()); 
            // InternalParser.g:2545:2: ( rule__GrammarRule__BodyAssignment_3_1 )
            // InternalParser.g:2545:3: rule__GrammarRule__BodyAssignment_3_1
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
    // InternalParser.g:2554:1: rule__RuleBody__Group__0 : rule__RuleBody__Group__0__Impl rule__RuleBody__Group__1 ;
    public final void rule__RuleBody__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:2558:1: ( rule__RuleBody__Group__0__Impl rule__RuleBody__Group__1 )
            // InternalParser.g:2559:2: rule__RuleBody__Group__0__Impl rule__RuleBody__Group__1
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
    // InternalParser.g:2566:1: rule__RuleBody__Group__0__Impl : ( ( rule__RuleBody__PartAssignment_0 ) ) ;
    public final void rule__RuleBody__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:2570:1: ( ( ( rule__RuleBody__PartAssignment_0 ) ) )
            // InternalParser.g:2571:1: ( ( rule__RuleBody__PartAssignment_0 ) )
            {
            // InternalParser.g:2571:1: ( ( rule__RuleBody__PartAssignment_0 ) )
            // InternalParser.g:2572:2: ( rule__RuleBody__PartAssignment_0 )
            {
             before(grammarAccess.getRuleBodyAccess().getPartAssignment_0()); 
            // InternalParser.g:2573:2: ( rule__RuleBody__PartAssignment_0 )
            // InternalParser.g:2573:3: rule__RuleBody__PartAssignment_0
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
    // InternalParser.g:2581:1: rule__RuleBody__Group__1 : rule__RuleBody__Group__1__Impl ;
    public final void rule__RuleBody__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:2585:1: ( rule__RuleBody__Group__1__Impl )
            // InternalParser.g:2586:2: rule__RuleBody__Group__1__Impl
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
    // InternalParser.g:2592:1: rule__RuleBody__Group__1__Impl : ( ( rule__RuleBody__CodeAssignment_1 ) ) ;
    public final void rule__RuleBody__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:2596:1: ( ( ( rule__RuleBody__CodeAssignment_1 ) ) )
            // InternalParser.g:2597:1: ( ( rule__RuleBody__CodeAssignment_1 ) )
            {
            // InternalParser.g:2597:1: ( ( rule__RuleBody__CodeAssignment_1 ) )
            // InternalParser.g:2598:2: ( rule__RuleBody__CodeAssignment_1 )
            {
             before(grammarAccess.getRuleBodyAccess().getCodeAssignment_1()); 
            // InternalParser.g:2599:2: ( rule__RuleBody__CodeAssignment_1 )
            // InternalParser.g:2599:3: rule__RuleBody__CodeAssignment_1
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
    // InternalParser.g:2608:1: rule__RuleCode__Group_0__0 : rule__RuleCode__Group_0__0__Impl rule__RuleCode__Group_0__1 ;
    public final void rule__RuleCode__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:2612:1: ( rule__RuleCode__Group_0__0__Impl rule__RuleCode__Group_0__1 )
            // InternalParser.g:2613:2: rule__RuleCode__Group_0__0__Impl rule__RuleCode__Group_0__1
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
    // InternalParser.g:2620:1: rule__RuleCode__Group_0__0__Impl : ( '{' ) ;
    public final void rule__RuleCode__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:2624:1: ( ( '{' ) )
            // InternalParser.g:2625:1: ( '{' )
            {
            // InternalParser.g:2625:1: ( '{' )
            // InternalParser.g:2626:2: '{'
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
    // InternalParser.g:2635:1: rule__RuleCode__Group_0__1 : rule__RuleCode__Group_0__1__Impl rule__RuleCode__Group_0__2 ;
    public final void rule__RuleCode__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:2639:1: ( rule__RuleCode__Group_0__1__Impl rule__RuleCode__Group_0__2 )
            // InternalParser.g:2640:2: rule__RuleCode__Group_0__1__Impl rule__RuleCode__Group_0__2
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
    // InternalParser.g:2647:1: rule__RuleCode__Group_0__1__Impl : ( ruleCodeBlock ) ;
    public final void rule__RuleCode__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:2651:1: ( ( ruleCodeBlock ) )
            // InternalParser.g:2652:1: ( ruleCodeBlock )
            {
            // InternalParser.g:2652:1: ( ruleCodeBlock )
            // InternalParser.g:2653:2: ruleCodeBlock
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
    // InternalParser.g:2662:1: rule__RuleCode__Group_0__2 : rule__RuleCode__Group_0__2__Impl ;
    public final void rule__RuleCode__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:2666:1: ( rule__RuleCode__Group_0__2__Impl )
            // InternalParser.g:2667:2: rule__RuleCode__Group_0__2__Impl
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
    // InternalParser.g:2673:1: rule__RuleCode__Group_0__2__Impl : ( '}' ) ;
    public final void rule__RuleCode__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:2677:1: ( ( '}' ) )
            // InternalParser.g:2678:1: ( '}' )
            {
            // InternalParser.g:2678:1: ( '}' )
            // InternalParser.g:2679:2: '}'
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
    // InternalParser.g:2689:1: rule__RuleCode__Group_1__0 : rule__RuleCode__Group_1__0__Impl rule__RuleCode__Group_1__1 ;
    public final void rule__RuleCode__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:2693:1: ( rule__RuleCode__Group_1__0__Impl rule__RuleCode__Group_1__1 )
            // InternalParser.g:2694:2: rule__RuleCode__Group_1__0__Impl rule__RuleCode__Group_1__1
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
    // InternalParser.g:2701:1: rule__RuleCode__Group_1__0__Impl : ( '[' ) ;
    public final void rule__RuleCode__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:2705:1: ( ( '[' ) )
            // InternalParser.g:2706:1: ( '[' )
            {
            // InternalParser.g:2706:1: ( '[' )
            // InternalParser.g:2707:2: '['
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
    // InternalParser.g:2716:1: rule__RuleCode__Group_1__1 : rule__RuleCode__Group_1__1__Impl rule__RuleCode__Group_1__2 ;
    public final void rule__RuleCode__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:2720:1: ( rule__RuleCode__Group_1__1__Impl rule__RuleCode__Group_1__2 )
            // InternalParser.g:2721:2: rule__RuleCode__Group_1__1__Impl rule__RuleCode__Group_1__2
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
    // InternalParser.g:2728:1: rule__RuleCode__Group_1__1__Impl : ( ruleCodeBlock ) ;
    public final void rule__RuleCode__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:2732:1: ( ( ruleCodeBlock ) )
            // InternalParser.g:2733:1: ( ruleCodeBlock )
            {
            // InternalParser.g:2733:1: ( ruleCodeBlock )
            // InternalParser.g:2734:2: ruleCodeBlock
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
    // InternalParser.g:2743:1: rule__RuleCode__Group_1__2 : rule__RuleCode__Group_1__2__Impl ;
    public final void rule__RuleCode__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:2747:1: ( rule__RuleCode__Group_1__2__Impl )
            // InternalParser.g:2748:2: rule__RuleCode__Group_1__2__Impl
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
    // InternalParser.g:2754:1: rule__RuleCode__Group_1__2__Impl : ( ']' ) ;
    public final void rule__RuleCode__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:2758:1: ( ( ']' ) )
            // InternalParser.g:2759:1: ( ']' )
            {
            // InternalParser.g:2759:1: ( ']' )
            // InternalParser.g:2760:2: ']'
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


    // $ANTLR start "rule__ParserModel__UnorderedGroup"
    // InternalParser.g:2770:1: rule__ParserModel__UnorderedGroup : rule__ParserModel__UnorderedGroup__0 {...}?;
    public final void rule__ParserModel__UnorderedGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getParserModelAccess().getUnorderedGroup());
        	
        try {
            // InternalParser.g:2775:1: ( rule__ParserModel__UnorderedGroup__0 {...}?)
            // InternalParser.g:2776:2: rule__ParserModel__UnorderedGroup__0 {...}?
            {
            pushFollow(FOLLOW_2);
            rule__ParserModel__UnorderedGroup__0();

            state._fsp--;

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getParserModelAccess().getUnorderedGroup()) ) {
                throw new FailedPredicateException(input, "rule__ParserModel__UnorderedGroup", "getUnorderedGroupHelper().canLeave(grammarAccess.getParserModelAccess().getUnorderedGroup())");
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getParserModelAccess().getUnorderedGroup());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParserModel__UnorderedGroup"


    // $ANTLR start "rule__ParserModel__UnorderedGroup__Impl"
    // InternalParser.g:2784:1: rule__ParserModel__UnorderedGroup__Impl : ( ({...}? => ( ( ( rule__ParserModel__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__ParserModel__ImportBlockAssignment_1 ) ) ) ) | ({...}? => ( ( ( rule__ParserModel__ExportBlockAssignment_2 ) ) ) ) | ({...}? => ( ( ( rule__ParserModel__GlobalBlockAssignment_3 ) ) ) ) | ({...}? => ( ( ( rule__ParserModel__LocalBlockAssignment_4 ) ) ) ) | ({...}? => ( ( ( rule__ParserModel__BeginBlockAssignment_5 ) ) ) ) | ({...}? => ( ( ( rule__ParserModel__CloseBlockAssignment_6 ) ) ) ) | ({...}? => ( ( ( rule__ParserModel__TokensAssignment_7 ) ) ) ) | ({...}? => ( ( ( rule__ParserModel__PrecedencAssignment_8 ) ) ) ) | ({...}? => ( ( ( rule__ParserModel__StartAssignment_9 ) ) ) ) | ({...}? => ( ( ( rule__ParserModel__RulesAssignment_10 ) ) ) ) ) ;
    public final void rule__ParserModel__UnorderedGroup__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalParser.g:2789:1: ( ( ({...}? => ( ( ( rule__ParserModel__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__ParserModel__ImportBlockAssignment_1 ) ) ) ) | ({...}? => ( ( ( rule__ParserModel__ExportBlockAssignment_2 ) ) ) ) | ({...}? => ( ( ( rule__ParserModel__GlobalBlockAssignment_3 ) ) ) ) | ({...}? => ( ( ( rule__ParserModel__LocalBlockAssignment_4 ) ) ) ) | ({...}? => ( ( ( rule__ParserModel__BeginBlockAssignment_5 ) ) ) ) | ({...}? => ( ( ( rule__ParserModel__CloseBlockAssignment_6 ) ) ) ) | ({...}? => ( ( ( rule__ParserModel__TokensAssignment_7 ) ) ) ) | ({...}? => ( ( ( rule__ParserModel__PrecedencAssignment_8 ) ) ) ) | ({...}? => ( ( ( rule__ParserModel__StartAssignment_9 ) ) ) ) | ({...}? => ( ( ( rule__ParserModel__RulesAssignment_10 ) ) ) ) ) )
            // InternalParser.g:2790:3: ( ({...}? => ( ( ( rule__ParserModel__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__ParserModel__ImportBlockAssignment_1 ) ) ) ) | ({...}? => ( ( ( rule__ParserModel__ExportBlockAssignment_2 ) ) ) ) | ({...}? => ( ( ( rule__ParserModel__GlobalBlockAssignment_3 ) ) ) ) | ({...}? => ( ( ( rule__ParserModel__LocalBlockAssignment_4 ) ) ) ) | ({...}? => ( ( ( rule__ParserModel__BeginBlockAssignment_5 ) ) ) ) | ({...}? => ( ( ( rule__ParserModel__CloseBlockAssignment_6 ) ) ) ) | ({...}? => ( ( ( rule__ParserModel__TokensAssignment_7 ) ) ) ) | ({...}? => ( ( ( rule__ParserModel__PrecedencAssignment_8 ) ) ) ) | ({...}? => ( ( ( rule__ParserModel__StartAssignment_9 ) ) ) ) | ({...}? => ( ( ( rule__ParserModel__RulesAssignment_10 ) ) ) ) )
            {
            // InternalParser.g:2790:3: ( ({...}? => ( ( ( rule__ParserModel__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__ParserModel__ImportBlockAssignment_1 ) ) ) ) | ({...}? => ( ( ( rule__ParserModel__ExportBlockAssignment_2 ) ) ) ) | ({...}? => ( ( ( rule__ParserModel__GlobalBlockAssignment_3 ) ) ) ) | ({...}? => ( ( ( rule__ParserModel__LocalBlockAssignment_4 ) ) ) ) | ({...}? => ( ( ( rule__ParserModel__BeginBlockAssignment_5 ) ) ) ) | ({...}? => ( ( ( rule__ParserModel__CloseBlockAssignment_6 ) ) ) ) | ({...}? => ( ( ( rule__ParserModel__TokensAssignment_7 ) ) ) ) | ({...}? => ( ( ( rule__ParserModel__PrecedencAssignment_8 ) ) ) ) | ({...}? => ( ( ( rule__ParserModel__StartAssignment_9 ) ) ) ) | ({...}? => ( ( ( rule__ParserModel__RulesAssignment_10 ) ) ) ) )
            int alt19=11;
            alt19 = dfa19.predict(input);
            switch (alt19) {
                case 1 :
                    // InternalParser.g:2791:3: ({...}? => ( ( ( rule__ParserModel__Group_0__0 ) ) ) )
                    {
                    // InternalParser.g:2791:3: ({...}? => ( ( ( rule__ParserModel__Group_0__0 ) ) ) )
                    // InternalParser.g:2792:4: {...}? => ( ( ( rule__ParserModel__Group_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup(), 0) ) {
                        throw new FailedPredicateException(input, "rule__ParserModel__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup(), 0)");
                    }
                    // InternalParser.g:2792:105: ( ( ( rule__ParserModel__Group_0__0 ) ) )
                    // InternalParser.g:2793:5: ( ( rule__ParserModel__Group_0__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getParserModelAccess().getUnorderedGroup(), 0);
                    				

                    					selected = true;
                    				
                    // InternalParser.g:2799:5: ( ( rule__ParserModel__Group_0__0 ) )
                    // InternalParser.g:2800:6: ( rule__ParserModel__Group_0__0 )
                    {
                     before(grammarAccess.getParserModelAccess().getGroup_0()); 
                    // InternalParser.g:2801:6: ( rule__ParserModel__Group_0__0 )
                    // InternalParser.g:2801:7: rule__ParserModel__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ParserModel__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getParserModelAccess().getGroup_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalParser.g:2806:3: ({...}? => ( ( ( rule__ParserModel__ImportBlockAssignment_1 ) ) ) )
                    {
                    // InternalParser.g:2806:3: ({...}? => ( ( ( rule__ParserModel__ImportBlockAssignment_1 ) ) ) )
                    // InternalParser.g:2807:4: {...}? => ( ( ( rule__ParserModel__ImportBlockAssignment_1 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup(), 1) ) {
                        throw new FailedPredicateException(input, "rule__ParserModel__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup(), 1)");
                    }
                    // InternalParser.g:2807:105: ( ( ( rule__ParserModel__ImportBlockAssignment_1 ) ) )
                    // InternalParser.g:2808:5: ( ( rule__ParserModel__ImportBlockAssignment_1 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getParserModelAccess().getUnorderedGroup(), 1);
                    				

                    					selected = true;
                    				
                    // InternalParser.g:2814:5: ( ( rule__ParserModel__ImportBlockAssignment_1 ) )
                    // InternalParser.g:2815:6: ( rule__ParserModel__ImportBlockAssignment_1 )
                    {
                     before(grammarAccess.getParserModelAccess().getImportBlockAssignment_1()); 
                    // InternalParser.g:2816:6: ( rule__ParserModel__ImportBlockAssignment_1 )
                    // InternalParser.g:2816:7: rule__ParserModel__ImportBlockAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__ParserModel__ImportBlockAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getParserModelAccess().getImportBlockAssignment_1()); 

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalParser.g:2821:3: ({...}? => ( ( ( rule__ParserModel__ExportBlockAssignment_2 ) ) ) )
                    {
                    // InternalParser.g:2821:3: ({...}? => ( ( ( rule__ParserModel__ExportBlockAssignment_2 ) ) ) )
                    // InternalParser.g:2822:4: {...}? => ( ( ( rule__ParserModel__ExportBlockAssignment_2 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup(), 2) ) {
                        throw new FailedPredicateException(input, "rule__ParserModel__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup(), 2)");
                    }
                    // InternalParser.g:2822:105: ( ( ( rule__ParserModel__ExportBlockAssignment_2 ) ) )
                    // InternalParser.g:2823:5: ( ( rule__ParserModel__ExportBlockAssignment_2 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getParserModelAccess().getUnorderedGroup(), 2);
                    				

                    					selected = true;
                    				
                    // InternalParser.g:2829:5: ( ( rule__ParserModel__ExportBlockAssignment_2 ) )
                    // InternalParser.g:2830:6: ( rule__ParserModel__ExportBlockAssignment_2 )
                    {
                     before(grammarAccess.getParserModelAccess().getExportBlockAssignment_2()); 
                    // InternalParser.g:2831:6: ( rule__ParserModel__ExportBlockAssignment_2 )
                    // InternalParser.g:2831:7: rule__ParserModel__ExportBlockAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__ParserModel__ExportBlockAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getParserModelAccess().getExportBlockAssignment_2()); 

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalParser.g:2836:3: ({...}? => ( ( ( rule__ParserModel__GlobalBlockAssignment_3 ) ) ) )
                    {
                    // InternalParser.g:2836:3: ({...}? => ( ( ( rule__ParserModel__GlobalBlockAssignment_3 ) ) ) )
                    // InternalParser.g:2837:4: {...}? => ( ( ( rule__ParserModel__GlobalBlockAssignment_3 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup(), 3) ) {
                        throw new FailedPredicateException(input, "rule__ParserModel__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup(), 3)");
                    }
                    // InternalParser.g:2837:105: ( ( ( rule__ParserModel__GlobalBlockAssignment_3 ) ) )
                    // InternalParser.g:2838:5: ( ( rule__ParserModel__GlobalBlockAssignment_3 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getParserModelAccess().getUnorderedGroup(), 3);
                    				

                    					selected = true;
                    				
                    // InternalParser.g:2844:5: ( ( rule__ParserModel__GlobalBlockAssignment_3 ) )
                    // InternalParser.g:2845:6: ( rule__ParserModel__GlobalBlockAssignment_3 )
                    {
                     before(grammarAccess.getParserModelAccess().getGlobalBlockAssignment_3()); 
                    // InternalParser.g:2846:6: ( rule__ParserModel__GlobalBlockAssignment_3 )
                    // InternalParser.g:2846:7: rule__ParserModel__GlobalBlockAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__ParserModel__GlobalBlockAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getParserModelAccess().getGlobalBlockAssignment_3()); 

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalParser.g:2851:3: ({...}? => ( ( ( rule__ParserModel__LocalBlockAssignment_4 ) ) ) )
                    {
                    // InternalParser.g:2851:3: ({...}? => ( ( ( rule__ParserModel__LocalBlockAssignment_4 ) ) ) )
                    // InternalParser.g:2852:4: {...}? => ( ( ( rule__ParserModel__LocalBlockAssignment_4 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup(), 4) ) {
                        throw new FailedPredicateException(input, "rule__ParserModel__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup(), 4)");
                    }
                    // InternalParser.g:2852:105: ( ( ( rule__ParserModel__LocalBlockAssignment_4 ) ) )
                    // InternalParser.g:2853:5: ( ( rule__ParserModel__LocalBlockAssignment_4 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getParserModelAccess().getUnorderedGroup(), 4);
                    				

                    					selected = true;
                    				
                    // InternalParser.g:2859:5: ( ( rule__ParserModel__LocalBlockAssignment_4 ) )
                    // InternalParser.g:2860:6: ( rule__ParserModel__LocalBlockAssignment_4 )
                    {
                     before(grammarAccess.getParserModelAccess().getLocalBlockAssignment_4()); 
                    // InternalParser.g:2861:6: ( rule__ParserModel__LocalBlockAssignment_4 )
                    // InternalParser.g:2861:7: rule__ParserModel__LocalBlockAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__ParserModel__LocalBlockAssignment_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getParserModelAccess().getLocalBlockAssignment_4()); 

                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalParser.g:2866:3: ({...}? => ( ( ( rule__ParserModel__BeginBlockAssignment_5 ) ) ) )
                    {
                    // InternalParser.g:2866:3: ({...}? => ( ( ( rule__ParserModel__BeginBlockAssignment_5 ) ) ) )
                    // InternalParser.g:2867:4: {...}? => ( ( ( rule__ParserModel__BeginBlockAssignment_5 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup(), 5) ) {
                        throw new FailedPredicateException(input, "rule__ParserModel__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup(), 5)");
                    }
                    // InternalParser.g:2867:105: ( ( ( rule__ParserModel__BeginBlockAssignment_5 ) ) )
                    // InternalParser.g:2868:5: ( ( rule__ParserModel__BeginBlockAssignment_5 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getParserModelAccess().getUnorderedGroup(), 5);
                    				

                    					selected = true;
                    				
                    // InternalParser.g:2874:5: ( ( rule__ParserModel__BeginBlockAssignment_5 ) )
                    // InternalParser.g:2875:6: ( rule__ParserModel__BeginBlockAssignment_5 )
                    {
                     before(grammarAccess.getParserModelAccess().getBeginBlockAssignment_5()); 
                    // InternalParser.g:2876:6: ( rule__ParserModel__BeginBlockAssignment_5 )
                    // InternalParser.g:2876:7: rule__ParserModel__BeginBlockAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__ParserModel__BeginBlockAssignment_5();

                    state._fsp--;


                    }

                     after(grammarAccess.getParserModelAccess().getBeginBlockAssignment_5()); 

                    }


                    }


                    }


                    }
                    break;
                case 7 :
                    // InternalParser.g:2881:3: ({...}? => ( ( ( rule__ParserModel__CloseBlockAssignment_6 ) ) ) )
                    {
                    // InternalParser.g:2881:3: ({...}? => ( ( ( rule__ParserModel__CloseBlockAssignment_6 ) ) ) )
                    // InternalParser.g:2882:4: {...}? => ( ( ( rule__ParserModel__CloseBlockAssignment_6 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup(), 6) ) {
                        throw new FailedPredicateException(input, "rule__ParserModel__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup(), 6)");
                    }
                    // InternalParser.g:2882:105: ( ( ( rule__ParserModel__CloseBlockAssignment_6 ) ) )
                    // InternalParser.g:2883:5: ( ( rule__ParserModel__CloseBlockAssignment_6 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getParserModelAccess().getUnorderedGroup(), 6);
                    				

                    					selected = true;
                    				
                    // InternalParser.g:2889:5: ( ( rule__ParserModel__CloseBlockAssignment_6 ) )
                    // InternalParser.g:2890:6: ( rule__ParserModel__CloseBlockAssignment_6 )
                    {
                     before(grammarAccess.getParserModelAccess().getCloseBlockAssignment_6()); 
                    // InternalParser.g:2891:6: ( rule__ParserModel__CloseBlockAssignment_6 )
                    // InternalParser.g:2891:7: rule__ParserModel__CloseBlockAssignment_6
                    {
                    pushFollow(FOLLOW_2);
                    rule__ParserModel__CloseBlockAssignment_6();

                    state._fsp--;


                    }

                     after(grammarAccess.getParserModelAccess().getCloseBlockAssignment_6()); 

                    }


                    }


                    }


                    }
                    break;
                case 8 :
                    // InternalParser.g:2896:3: ({...}? => ( ( ( rule__ParserModel__TokensAssignment_7 ) ) ) )
                    {
                    // InternalParser.g:2896:3: ({...}? => ( ( ( rule__ParserModel__TokensAssignment_7 ) ) ) )
                    // InternalParser.g:2897:4: {...}? => ( ( ( rule__ParserModel__TokensAssignment_7 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup(), 7) ) {
                        throw new FailedPredicateException(input, "rule__ParserModel__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup(), 7)");
                    }
                    // InternalParser.g:2897:105: ( ( ( rule__ParserModel__TokensAssignment_7 ) ) )
                    // InternalParser.g:2898:5: ( ( rule__ParserModel__TokensAssignment_7 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getParserModelAccess().getUnorderedGroup(), 7);
                    				

                    					selected = true;
                    				
                    // InternalParser.g:2904:5: ( ( rule__ParserModel__TokensAssignment_7 ) )
                    // InternalParser.g:2905:6: ( rule__ParserModel__TokensAssignment_7 )
                    {
                     before(grammarAccess.getParserModelAccess().getTokensAssignment_7()); 
                    // InternalParser.g:2906:6: ( rule__ParserModel__TokensAssignment_7 )
                    // InternalParser.g:2906:7: rule__ParserModel__TokensAssignment_7
                    {
                    pushFollow(FOLLOW_2);
                    rule__ParserModel__TokensAssignment_7();

                    state._fsp--;


                    }

                     after(grammarAccess.getParserModelAccess().getTokensAssignment_7()); 

                    }


                    }


                    }


                    }
                    break;
                case 9 :
                    // InternalParser.g:2911:3: ({...}? => ( ( ( rule__ParserModel__PrecedencAssignment_8 ) ) ) )
                    {
                    // InternalParser.g:2911:3: ({...}? => ( ( ( rule__ParserModel__PrecedencAssignment_8 ) ) ) )
                    // InternalParser.g:2912:4: {...}? => ( ( ( rule__ParserModel__PrecedencAssignment_8 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup(), 8) ) {
                        throw new FailedPredicateException(input, "rule__ParserModel__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup(), 8)");
                    }
                    // InternalParser.g:2912:105: ( ( ( rule__ParserModel__PrecedencAssignment_8 ) ) )
                    // InternalParser.g:2913:5: ( ( rule__ParserModel__PrecedencAssignment_8 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getParserModelAccess().getUnorderedGroup(), 8);
                    				

                    					selected = true;
                    				
                    // InternalParser.g:2919:5: ( ( rule__ParserModel__PrecedencAssignment_8 ) )
                    // InternalParser.g:2920:6: ( rule__ParserModel__PrecedencAssignment_8 )
                    {
                     before(grammarAccess.getParserModelAccess().getPrecedencAssignment_8()); 
                    // InternalParser.g:2921:6: ( rule__ParserModel__PrecedencAssignment_8 )
                    // InternalParser.g:2921:7: rule__ParserModel__PrecedencAssignment_8
                    {
                    pushFollow(FOLLOW_2);
                    rule__ParserModel__PrecedencAssignment_8();

                    state._fsp--;


                    }

                     after(grammarAccess.getParserModelAccess().getPrecedencAssignment_8()); 

                    }


                    }


                    }


                    }
                    break;
                case 10 :
                    // InternalParser.g:2926:3: ({...}? => ( ( ( rule__ParserModel__StartAssignment_9 ) ) ) )
                    {
                    // InternalParser.g:2926:3: ({...}? => ( ( ( rule__ParserModel__StartAssignment_9 ) ) ) )
                    // InternalParser.g:2927:4: {...}? => ( ( ( rule__ParserModel__StartAssignment_9 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup(), 9) ) {
                        throw new FailedPredicateException(input, "rule__ParserModel__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup(), 9)");
                    }
                    // InternalParser.g:2927:105: ( ( ( rule__ParserModel__StartAssignment_9 ) ) )
                    // InternalParser.g:2928:5: ( ( rule__ParserModel__StartAssignment_9 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getParserModelAccess().getUnorderedGroup(), 9);
                    				

                    					selected = true;
                    				
                    // InternalParser.g:2934:5: ( ( rule__ParserModel__StartAssignment_9 ) )
                    // InternalParser.g:2935:6: ( rule__ParserModel__StartAssignment_9 )
                    {
                     before(grammarAccess.getParserModelAccess().getStartAssignment_9()); 
                    // InternalParser.g:2936:6: ( rule__ParserModel__StartAssignment_9 )
                    // InternalParser.g:2936:7: rule__ParserModel__StartAssignment_9
                    {
                    pushFollow(FOLLOW_2);
                    rule__ParserModel__StartAssignment_9();

                    state._fsp--;


                    }

                     after(grammarAccess.getParserModelAccess().getStartAssignment_9()); 

                    }


                    }


                    }


                    }
                    break;
                case 11 :
                    // InternalParser.g:2941:3: ({...}? => ( ( ( rule__ParserModel__RulesAssignment_10 ) ) ) )
                    {
                    // InternalParser.g:2941:3: ({...}? => ( ( ( rule__ParserModel__RulesAssignment_10 ) ) ) )
                    // InternalParser.g:2942:4: {...}? => ( ( ( rule__ParserModel__RulesAssignment_10 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup(), 10) ) {
                        throw new FailedPredicateException(input, "rule__ParserModel__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup(), 10)");
                    }
                    // InternalParser.g:2942:106: ( ( ( rule__ParserModel__RulesAssignment_10 ) ) )
                    // InternalParser.g:2943:5: ( ( rule__ParserModel__RulesAssignment_10 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getParserModelAccess().getUnorderedGroup(), 10);
                    				

                    					selected = true;
                    				
                    // InternalParser.g:2949:5: ( ( rule__ParserModel__RulesAssignment_10 ) )
                    // InternalParser.g:2950:6: ( rule__ParserModel__RulesAssignment_10 )
                    {
                     before(grammarAccess.getParserModelAccess().getRulesAssignment_10()); 
                    // InternalParser.g:2951:6: ( rule__ParserModel__RulesAssignment_10 )
                    // InternalParser.g:2951:7: rule__ParserModel__RulesAssignment_10
                    {
                    pushFollow(FOLLOW_2);
                    rule__ParserModel__RulesAssignment_10();

                    state._fsp--;


                    }

                     after(grammarAccess.getParserModelAccess().getRulesAssignment_10()); 

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
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getParserModelAccess().getUnorderedGroup());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParserModel__UnorderedGroup__Impl"


    // $ANTLR start "rule__ParserModel__UnorderedGroup__0"
    // InternalParser.g:2964:1: rule__ParserModel__UnorderedGroup__0 : rule__ParserModel__UnorderedGroup__Impl ( rule__ParserModel__UnorderedGroup__1 )? ;
    public final void rule__ParserModel__UnorderedGroup__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:2968:1: ( rule__ParserModel__UnorderedGroup__Impl ( rule__ParserModel__UnorderedGroup__1 )? )
            // InternalParser.g:2969:2: rule__ParserModel__UnorderedGroup__Impl ( rule__ParserModel__UnorderedGroup__1 )?
            {
            pushFollow(FOLLOW_25);
            rule__ParserModel__UnorderedGroup__Impl();

            state._fsp--;

            // InternalParser.g:2970:2: ( rule__ParserModel__UnorderedGroup__1 )?
            int alt20=2;
            alt20 = dfa20.predict(input);
            switch (alt20) {
                case 1 :
                    // InternalParser.g:2970:2: rule__ParserModel__UnorderedGroup__1
                    {
                    pushFollow(FOLLOW_2);
                    rule__ParserModel__UnorderedGroup__1();

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
    // $ANTLR end "rule__ParserModel__UnorderedGroup__0"


    // $ANTLR start "rule__ParserModel__UnorderedGroup__1"
    // InternalParser.g:2976:1: rule__ParserModel__UnorderedGroup__1 : rule__ParserModel__UnorderedGroup__Impl ( rule__ParserModel__UnorderedGroup__2 )? ;
    public final void rule__ParserModel__UnorderedGroup__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:2980:1: ( rule__ParserModel__UnorderedGroup__Impl ( rule__ParserModel__UnorderedGroup__2 )? )
            // InternalParser.g:2981:2: rule__ParserModel__UnorderedGroup__Impl ( rule__ParserModel__UnorderedGroup__2 )?
            {
            pushFollow(FOLLOW_25);
            rule__ParserModel__UnorderedGroup__Impl();

            state._fsp--;

            // InternalParser.g:2982:2: ( rule__ParserModel__UnorderedGroup__2 )?
            int alt21=2;
            alt21 = dfa21.predict(input);
            switch (alt21) {
                case 1 :
                    // InternalParser.g:2982:2: rule__ParserModel__UnorderedGroup__2
                    {
                    pushFollow(FOLLOW_2);
                    rule__ParserModel__UnorderedGroup__2();

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
    // $ANTLR end "rule__ParserModel__UnorderedGroup__1"


    // $ANTLR start "rule__ParserModel__UnorderedGroup__2"
    // InternalParser.g:2988:1: rule__ParserModel__UnorderedGroup__2 : rule__ParserModel__UnorderedGroup__Impl ( rule__ParserModel__UnorderedGroup__3 )? ;
    public final void rule__ParserModel__UnorderedGroup__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:2992:1: ( rule__ParserModel__UnorderedGroup__Impl ( rule__ParserModel__UnorderedGroup__3 )? )
            // InternalParser.g:2993:2: rule__ParserModel__UnorderedGroup__Impl ( rule__ParserModel__UnorderedGroup__3 )?
            {
            pushFollow(FOLLOW_25);
            rule__ParserModel__UnorderedGroup__Impl();

            state._fsp--;

            // InternalParser.g:2994:2: ( rule__ParserModel__UnorderedGroup__3 )?
            int alt22=2;
            alt22 = dfa22.predict(input);
            switch (alt22) {
                case 1 :
                    // InternalParser.g:2994:2: rule__ParserModel__UnorderedGroup__3
                    {
                    pushFollow(FOLLOW_2);
                    rule__ParserModel__UnorderedGroup__3();

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
    // $ANTLR end "rule__ParserModel__UnorderedGroup__2"


    // $ANTLR start "rule__ParserModel__UnorderedGroup__3"
    // InternalParser.g:3000:1: rule__ParserModel__UnorderedGroup__3 : rule__ParserModel__UnorderedGroup__Impl ( rule__ParserModel__UnorderedGroup__4 )? ;
    public final void rule__ParserModel__UnorderedGroup__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:3004:1: ( rule__ParserModel__UnorderedGroup__Impl ( rule__ParserModel__UnorderedGroup__4 )? )
            // InternalParser.g:3005:2: rule__ParserModel__UnorderedGroup__Impl ( rule__ParserModel__UnorderedGroup__4 )?
            {
            pushFollow(FOLLOW_25);
            rule__ParserModel__UnorderedGroup__Impl();

            state._fsp--;

            // InternalParser.g:3006:2: ( rule__ParserModel__UnorderedGroup__4 )?
            int alt23=2;
            alt23 = dfa23.predict(input);
            switch (alt23) {
                case 1 :
                    // InternalParser.g:3006:2: rule__ParserModel__UnorderedGroup__4
                    {
                    pushFollow(FOLLOW_2);
                    rule__ParserModel__UnorderedGroup__4();

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
    // $ANTLR end "rule__ParserModel__UnorderedGroup__3"


    // $ANTLR start "rule__ParserModel__UnorderedGroup__4"
    // InternalParser.g:3012:1: rule__ParserModel__UnorderedGroup__4 : rule__ParserModel__UnorderedGroup__Impl ( rule__ParserModel__UnorderedGroup__5 )? ;
    public final void rule__ParserModel__UnorderedGroup__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:3016:1: ( rule__ParserModel__UnorderedGroup__Impl ( rule__ParserModel__UnorderedGroup__5 )? )
            // InternalParser.g:3017:2: rule__ParserModel__UnorderedGroup__Impl ( rule__ParserModel__UnorderedGroup__5 )?
            {
            pushFollow(FOLLOW_25);
            rule__ParserModel__UnorderedGroup__Impl();

            state._fsp--;

            // InternalParser.g:3018:2: ( rule__ParserModel__UnorderedGroup__5 )?
            int alt24=2;
            alt24 = dfa24.predict(input);
            switch (alt24) {
                case 1 :
                    // InternalParser.g:3018:2: rule__ParserModel__UnorderedGroup__5
                    {
                    pushFollow(FOLLOW_2);
                    rule__ParserModel__UnorderedGroup__5();

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
    // $ANTLR end "rule__ParserModel__UnorderedGroup__4"


    // $ANTLR start "rule__ParserModel__UnorderedGroup__5"
    // InternalParser.g:3024:1: rule__ParserModel__UnorderedGroup__5 : rule__ParserModel__UnorderedGroup__Impl ( rule__ParserModel__UnorderedGroup__6 )? ;
    public final void rule__ParserModel__UnorderedGroup__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:3028:1: ( rule__ParserModel__UnorderedGroup__Impl ( rule__ParserModel__UnorderedGroup__6 )? )
            // InternalParser.g:3029:2: rule__ParserModel__UnorderedGroup__Impl ( rule__ParserModel__UnorderedGroup__6 )?
            {
            pushFollow(FOLLOW_25);
            rule__ParserModel__UnorderedGroup__Impl();

            state._fsp--;

            // InternalParser.g:3030:2: ( rule__ParserModel__UnorderedGroup__6 )?
            int alt25=2;
            alt25 = dfa25.predict(input);
            switch (alt25) {
                case 1 :
                    // InternalParser.g:3030:2: rule__ParserModel__UnorderedGroup__6
                    {
                    pushFollow(FOLLOW_2);
                    rule__ParserModel__UnorderedGroup__6();

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
    // $ANTLR end "rule__ParserModel__UnorderedGroup__5"


    // $ANTLR start "rule__ParserModel__UnorderedGroup__6"
    // InternalParser.g:3036:1: rule__ParserModel__UnorderedGroup__6 : rule__ParserModel__UnorderedGroup__Impl ( rule__ParserModel__UnorderedGroup__7 )? ;
    public final void rule__ParserModel__UnorderedGroup__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:3040:1: ( rule__ParserModel__UnorderedGroup__Impl ( rule__ParserModel__UnorderedGroup__7 )? )
            // InternalParser.g:3041:2: rule__ParserModel__UnorderedGroup__Impl ( rule__ParserModel__UnorderedGroup__7 )?
            {
            pushFollow(FOLLOW_25);
            rule__ParserModel__UnorderedGroup__Impl();

            state._fsp--;

            // InternalParser.g:3042:2: ( rule__ParserModel__UnorderedGroup__7 )?
            int alt26=2;
            alt26 = dfa26.predict(input);
            switch (alt26) {
                case 1 :
                    // InternalParser.g:3042:2: rule__ParserModel__UnorderedGroup__7
                    {
                    pushFollow(FOLLOW_2);
                    rule__ParserModel__UnorderedGroup__7();

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
    // $ANTLR end "rule__ParserModel__UnorderedGroup__6"


    // $ANTLR start "rule__ParserModel__UnorderedGroup__7"
    // InternalParser.g:3048:1: rule__ParserModel__UnorderedGroup__7 : rule__ParserModel__UnorderedGroup__Impl ( rule__ParserModel__UnorderedGroup__8 )? ;
    public final void rule__ParserModel__UnorderedGroup__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:3052:1: ( rule__ParserModel__UnorderedGroup__Impl ( rule__ParserModel__UnorderedGroup__8 )? )
            // InternalParser.g:3053:2: rule__ParserModel__UnorderedGroup__Impl ( rule__ParserModel__UnorderedGroup__8 )?
            {
            pushFollow(FOLLOW_25);
            rule__ParserModel__UnorderedGroup__Impl();

            state._fsp--;

            // InternalParser.g:3054:2: ( rule__ParserModel__UnorderedGroup__8 )?
            int alt27=2;
            alt27 = dfa27.predict(input);
            switch (alt27) {
                case 1 :
                    // InternalParser.g:3054:2: rule__ParserModel__UnorderedGroup__8
                    {
                    pushFollow(FOLLOW_2);
                    rule__ParserModel__UnorderedGroup__8();

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
    // $ANTLR end "rule__ParserModel__UnorderedGroup__7"


    // $ANTLR start "rule__ParserModel__UnorderedGroup__8"
    // InternalParser.g:3060:1: rule__ParserModel__UnorderedGroup__8 : rule__ParserModel__UnorderedGroup__Impl ( rule__ParserModel__UnorderedGroup__9 )? ;
    public final void rule__ParserModel__UnorderedGroup__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:3064:1: ( rule__ParserModel__UnorderedGroup__Impl ( rule__ParserModel__UnorderedGroup__9 )? )
            // InternalParser.g:3065:2: rule__ParserModel__UnorderedGroup__Impl ( rule__ParserModel__UnorderedGroup__9 )?
            {
            pushFollow(FOLLOW_25);
            rule__ParserModel__UnorderedGroup__Impl();

            state._fsp--;

            // InternalParser.g:3066:2: ( rule__ParserModel__UnorderedGroup__9 )?
            int alt28=2;
            alt28 = dfa28.predict(input);
            switch (alt28) {
                case 1 :
                    // InternalParser.g:3066:2: rule__ParserModel__UnorderedGroup__9
                    {
                    pushFollow(FOLLOW_2);
                    rule__ParserModel__UnorderedGroup__9();

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
    // $ANTLR end "rule__ParserModel__UnorderedGroup__8"


    // $ANTLR start "rule__ParserModel__UnorderedGroup__9"
    // InternalParser.g:3072:1: rule__ParserModel__UnorderedGroup__9 : rule__ParserModel__UnorderedGroup__Impl ( rule__ParserModel__UnorderedGroup__10 )? ;
    public final void rule__ParserModel__UnorderedGroup__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:3076:1: ( rule__ParserModel__UnorderedGroup__Impl ( rule__ParserModel__UnorderedGroup__10 )? )
            // InternalParser.g:3077:2: rule__ParserModel__UnorderedGroup__Impl ( rule__ParserModel__UnorderedGroup__10 )?
            {
            pushFollow(FOLLOW_25);
            rule__ParserModel__UnorderedGroup__Impl();

            state._fsp--;

            // InternalParser.g:3078:2: ( rule__ParserModel__UnorderedGroup__10 )?
            int alt29=2;
            alt29 = dfa29.predict(input);
            switch (alt29) {
                case 1 :
                    // InternalParser.g:3078:2: rule__ParserModel__UnorderedGroup__10
                    {
                    pushFollow(FOLLOW_2);
                    rule__ParserModel__UnorderedGroup__10();

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
    // $ANTLR end "rule__ParserModel__UnorderedGroup__9"


    // $ANTLR start "rule__ParserModel__UnorderedGroup__10"
    // InternalParser.g:3084:1: rule__ParserModel__UnorderedGroup__10 : rule__ParserModel__UnorderedGroup__Impl ;
    public final void rule__ParserModel__UnorderedGroup__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:3088:1: ( rule__ParserModel__UnorderedGroup__Impl )
            // InternalParser.g:3089:2: rule__ParserModel__UnorderedGroup__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParserModel__UnorderedGroup__Impl();

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
    // $ANTLR end "rule__ParserModel__UnorderedGroup__10"


    // $ANTLR start "rule__RuleCode__UnorderedGroup"
    // InternalParser.g:3096:1: rule__RuleCode__UnorderedGroup : ( rule__RuleCode__UnorderedGroup__0 )? ;
    public final void rule__RuleCode__UnorderedGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getRuleCodeAccess().getUnorderedGroup());
        	
        try {
            // InternalParser.g:3101:1: ( ( rule__RuleCode__UnorderedGroup__0 )? )
            // InternalParser.g:3102:2: ( rule__RuleCode__UnorderedGroup__0 )?
            {
            // InternalParser.g:3102:2: ( rule__RuleCode__UnorderedGroup__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( LA30_0 == 39 && getUnorderedGroupHelper().canSelect(grammarAccess.getRuleCodeAccess().getUnorderedGroup(), 0) ) {
                alt30=1;
            }
            else if ( LA30_0 == 49 && getUnorderedGroupHelper().canSelect(grammarAccess.getRuleCodeAccess().getUnorderedGroup(), 1) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalParser.g:3102:2: rule__RuleCode__UnorderedGroup__0
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
    // InternalParser.g:3110:1: rule__RuleCode__UnorderedGroup__Impl : ( ({...}? => ( ( ( rule__RuleCode__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__RuleCode__Group_1__0 ) ) ) ) ) ;
    public final void rule__RuleCode__UnorderedGroup__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalParser.g:3115:1: ( ( ({...}? => ( ( ( rule__RuleCode__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__RuleCode__Group_1__0 ) ) ) ) ) )
            // InternalParser.g:3116:3: ( ({...}? => ( ( ( rule__RuleCode__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__RuleCode__Group_1__0 ) ) ) ) )
            {
            // InternalParser.g:3116:3: ( ({...}? => ( ( ( rule__RuleCode__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__RuleCode__Group_1__0 ) ) ) ) )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( LA31_0 == 39 && getUnorderedGroupHelper().canSelect(grammarAccess.getRuleCodeAccess().getUnorderedGroup(), 0) ) {
                alt31=1;
            }
            else if ( LA31_0 == 49 && getUnorderedGroupHelper().canSelect(grammarAccess.getRuleCodeAccess().getUnorderedGroup(), 1) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // InternalParser.g:3117:3: ({...}? => ( ( ( rule__RuleCode__Group_0__0 ) ) ) )
                    {
                    // InternalParser.g:3117:3: ({...}? => ( ( ( rule__RuleCode__Group_0__0 ) ) ) )
                    // InternalParser.g:3118:4: {...}? => ( ( ( rule__RuleCode__Group_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRuleCodeAccess().getUnorderedGroup(), 0) ) {
                        throw new FailedPredicateException(input, "rule__RuleCode__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getRuleCodeAccess().getUnorderedGroup(), 0)");
                    }
                    // InternalParser.g:3118:102: ( ( ( rule__RuleCode__Group_0__0 ) ) )
                    // InternalParser.g:3119:5: ( ( rule__RuleCode__Group_0__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getRuleCodeAccess().getUnorderedGroup(), 0);
                    				

                    					selected = true;
                    				
                    // InternalParser.g:3125:5: ( ( rule__RuleCode__Group_0__0 ) )
                    // InternalParser.g:3126:6: ( rule__RuleCode__Group_0__0 )
                    {
                     before(grammarAccess.getRuleCodeAccess().getGroup_0()); 
                    // InternalParser.g:3127:6: ( rule__RuleCode__Group_0__0 )
                    // InternalParser.g:3127:7: rule__RuleCode__Group_0__0
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
                    // InternalParser.g:3132:3: ({...}? => ( ( ( rule__RuleCode__Group_1__0 ) ) ) )
                    {
                    // InternalParser.g:3132:3: ({...}? => ( ( ( rule__RuleCode__Group_1__0 ) ) ) )
                    // InternalParser.g:3133:4: {...}? => ( ( ( rule__RuleCode__Group_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRuleCodeAccess().getUnorderedGroup(), 1) ) {
                        throw new FailedPredicateException(input, "rule__RuleCode__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getRuleCodeAccess().getUnorderedGroup(), 1)");
                    }
                    // InternalParser.g:3133:102: ( ( ( rule__RuleCode__Group_1__0 ) ) )
                    // InternalParser.g:3134:5: ( ( rule__RuleCode__Group_1__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getRuleCodeAccess().getUnorderedGroup(), 1);
                    				

                    					selected = true;
                    				
                    // InternalParser.g:3140:5: ( ( rule__RuleCode__Group_1__0 ) )
                    // InternalParser.g:3141:6: ( rule__RuleCode__Group_1__0 )
                    {
                     before(grammarAccess.getRuleCodeAccess().getGroup_1()); 
                    // InternalParser.g:3142:6: ( rule__RuleCode__Group_1__0 )
                    // InternalParser.g:3142:7: rule__RuleCode__Group_1__0
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
    // InternalParser.g:3155:1: rule__RuleCode__UnorderedGroup__0 : rule__RuleCode__UnorderedGroup__Impl ( rule__RuleCode__UnorderedGroup__1 )? ;
    public final void rule__RuleCode__UnorderedGroup__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:3159:1: ( rule__RuleCode__UnorderedGroup__Impl ( rule__RuleCode__UnorderedGroup__1 )? )
            // InternalParser.g:3160:2: rule__RuleCode__UnorderedGroup__Impl ( rule__RuleCode__UnorderedGroup__1 )?
            {
            pushFollow(FOLLOW_26);
            rule__RuleCode__UnorderedGroup__Impl();

            state._fsp--;

            // InternalParser.g:3161:2: ( rule__RuleCode__UnorderedGroup__1 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( LA32_0 == 39 && getUnorderedGroupHelper().canSelect(grammarAccess.getRuleCodeAccess().getUnorderedGroup(), 0) ) {
                alt32=1;
            }
            else if ( LA32_0 == 49 && getUnorderedGroupHelper().canSelect(grammarAccess.getRuleCodeAccess().getUnorderedGroup(), 1) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalParser.g:3161:2: rule__RuleCode__UnorderedGroup__1
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
    // InternalParser.g:3167:1: rule__RuleCode__UnorderedGroup__1 : rule__RuleCode__UnorderedGroup__Impl ;
    public final void rule__RuleCode__UnorderedGroup__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:3171:1: ( rule__RuleCode__UnorderedGroup__Impl )
            // InternalParser.g:3172:2: rule__RuleCode__UnorderedGroup__Impl
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
    // InternalParser.g:3179:1: rule__ParserModel__ScannerAssignment_0_0 : ( ruleScannerName ) ;
    public final void rule__ParserModel__ScannerAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:3183:1: ( ( ruleScannerName ) )
            // InternalParser.g:3184:2: ( ruleScannerName )
            {
            // InternalParser.g:3184:2: ( ruleScannerName )
            // InternalParser.g:3185:3: ruleScannerName
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
    // InternalParser.g:3194:1: rule__ParserModel__ParserAssignment_0_1 : ( ruleParserName ) ;
    public final void rule__ParserModel__ParserAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:3198:1: ( ( ruleParserName ) )
            // InternalParser.g:3199:2: ( ruleParserName )
            {
            // InternalParser.g:3199:2: ( ruleParserName )
            // InternalParser.g:3200:3: ruleParserName
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


    // $ANTLR start "rule__ParserModel__ImportBlockAssignment_1"
    // InternalParser.g:3209:1: rule__ParserModel__ImportBlockAssignment_1 : ( ruleImport ) ;
    public final void rule__ParserModel__ImportBlockAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:3213:1: ( ( ruleImport ) )
            // InternalParser.g:3214:2: ( ruleImport )
            {
            // InternalParser.g:3214:2: ( ruleImport )
            // InternalParser.g:3215:3: ruleImport
            {
             before(grammarAccess.getParserModelAccess().getImportBlockImportParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getParserModelAccess().getImportBlockImportParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParserModel__ImportBlockAssignment_1"


    // $ANTLR start "rule__ParserModel__ExportBlockAssignment_2"
    // InternalParser.g:3224:1: rule__ParserModel__ExportBlockAssignment_2 : ( ruleExport ) ;
    public final void rule__ParserModel__ExportBlockAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:3228:1: ( ( ruleExport ) )
            // InternalParser.g:3229:2: ( ruleExport )
            {
            // InternalParser.g:3229:2: ( ruleExport )
            // InternalParser.g:3230:3: ruleExport
            {
             before(grammarAccess.getParserModelAccess().getExportBlockExportParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExport();

            state._fsp--;

             after(grammarAccess.getParserModelAccess().getExportBlockExportParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParserModel__ExportBlockAssignment_2"


    // $ANTLR start "rule__ParserModel__GlobalBlockAssignment_3"
    // InternalParser.g:3239:1: rule__ParserModel__GlobalBlockAssignment_3 : ( ruleGlobal ) ;
    public final void rule__ParserModel__GlobalBlockAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:3243:1: ( ( ruleGlobal ) )
            // InternalParser.g:3244:2: ( ruleGlobal )
            {
            // InternalParser.g:3244:2: ( ruleGlobal )
            // InternalParser.g:3245:3: ruleGlobal
            {
             before(grammarAccess.getParserModelAccess().getGlobalBlockGlobalParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleGlobal();

            state._fsp--;

             after(grammarAccess.getParserModelAccess().getGlobalBlockGlobalParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParserModel__GlobalBlockAssignment_3"


    // $ANTLR start "rule__ParserModel__LocalBlockAssignment_4"
    // InternalParser.g:3254:1: rule__ParserModel__LocalBlockAssignment_4 : ( ruleLocal ) ;
    public final void rule__ParserModel__LocalBlockAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:3258:1: ( ( ruleLocal ) )
            // InternalParser.g:3259:2: ( ruleLocal )
            {
            // InternalParser.g:3259:2: ( ruleLocal )
            // InternalParser.g:3260:3: ruleLocal
            {
             before(grammarAccess.getParserModelAccess().getLocalBlockLocalParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleLocal();

            state._fsp--;

             after(grammarAccess.getParserModelAccess().getLocalBlockLocalParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParserModel__LocalBlockAssignment_4"


    // $ANTLR start "rule__ParserModel__BeginBlockAssignment_5"
    // InternalParser.g:3269:1: rule__ParserModel__BeginBlockAssignment_5 : ( ruleBegin ) ;
    public final void rule__ParserModel__BeginBlockAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:3273:1: ( ( ruleBegin ) )
            // InternalParser.g:3274:2: ( ruleBegin )
            {
            // InternalParser.g:3274:2: ( ruleBegin )
            // InternalParser.g:3275:3: ruleBegin
            {
             before(grammarAccess.getParserModelAccess().getBeginBlockBeginParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleBegin();

            state._fsp--;

             after(grammarAccess.getParserModelAccess().getBeginBlockBeginParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParserModel__BeginBlockAssignment_5"


    // $ANTLR start "rule__ParserModel__CloseBlockAssignment_6"
    // InternalParser.g:3284:1: rule__ParserModel__CloseBlockAssignment_6 : ( ruleClose ) ;
    public final void rule__ParserModel__CloseBlockAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:3288:1: ( ( ruleClose ) )
            // InternalParser.g:3289:2: ( ruleClose )
            {
            // InternalParser.g:3289:2: ( ruleClose )
            // InternalParser.g:3290:3: ruleClose
            {
             before(grammarAccess.getParserModelAccess().getCloseBlockCloseParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleClose();

            state._fsp--;

             after(grammarAccess.getParserModelAccess().getCloseBlockCloseParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParserModel__CloseBlockAssignment_6"


    // $ANTLR start "rule__ParserModel__TokensAssignment_7"
    // InternalParser.g:3299:1: rule__ParserModel__TokensAssignment_7 : ( ruleTokens ) ;
    public final void rule__ParserModel__TokensAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:3303:1: ( ( ruleTokens ) )
            // InternalParser.g:3304:2: ( ruleTokens )
            {
            // InternalParser.g:3304:2: ( ruleTokens )
            // InternalParser.g:3305:3: ruleTokens
            {
             before(grammarAccess.getParserModelAccess().getTokensTokensParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleTokens();

            state._fsp--;

             after(grammarAccess.getParserModelAccess().getTokensTokensParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParserModel__TokensAssignment_7"


    // $ANTLR start "rule__ParserModel__PrecedencAssignment_8"
    // InternalParser.g:3314:1: rule__ParserModel__PrecedencAssignment_8 : ( rulePrecedence ) ;
    public final void rule__ParserModel__PrecedencAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:3318:1: ( ( rulePrecedence ) )
            // InternalParser.g:3319:2: ( rulePrecedence )
            {
            // InternalParser.g:3319:2: ( rulePrecedence )
            // InternalParser.g:3320:3: rulePrecedence
            {
             before(grammarAccess.getParserModelAccess().getPrecedencPrecedenceParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            rulePrecedence();

            state._fsp--;

             after(grammarAccess.getParserModelAccess().getPrecedencPrecedenceParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParserModel__PrecedencAssignment_8"


    // $ANTLR start "rule__ParserModel__StartAssignment_9"
    // InternalParser.g:3329:1: rule__ParserModel__StartAssignment_9 : ( ruleStartSymbols ) ;
    public final void rule__ParserModel__StartAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:3333:1: ( ( ruleStartSymbols ) )
            // InternalParser.g:3334:2: ( ruleStartSymbols )
            {
            // InternalParser.g:3334:2: ( ruleStartSymbols )
            // InternalParser.g:3335:3: ruleStartSymbols
            {
             before(grammarAccess.getParserModelAccess().getStartStartSymbolsParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleStartSymbols();

            state._fsp--;

             after(grammarAccess.getParserModelAccess().getStartStartSymbolsParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParserModel__StartAssignment_9"


    // $ANTLR start "rule__ParserModel__RulesAssignment_10"
    // InternalParser.g:3344:1: rule__ParserModel__RulesAssignment_10 : ( ruleGrammerRules ) ;
    public final void rule__ParserModel__RulesAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:3348:1: ( ( ruleGrammerRules ) )
            // InternalParser.g:3349:2: ( ruleGrammerRules )
            {
            // InternalParser.g:3349:2: ( ruleGrammerRules )
            // InternalParser.g:3350:3: ruleGrammerRules
            {
             before(grammarAccess.getParserModelAccess().getRulesGrammerRulesParserRuleCall_10_0()); 
            pushFollow(FOLLOW_2);
            ruleGrammerRules();

            state._fsp--;

             after(grammarAccess.getParserModelAccess().getRulesGrammerRulesParserRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParserModel__RulesAssignment_10"


    // $ANTLR start "rule__ScannerName__NameAssignment_1"
    // InternalParser.g:3359:1: rule__ScannerName__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ScannerName__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:3363:1: ( ( RULE_ID ) )
            // InternalParser.g:3364:2: ( RULE_ID )
            {
            // InternalParser.g:3364:2: ( RULE_ID )
            // InternalParser.g:3365:3: RULE_ID
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
    // InternalParser.g:3374:1: rule__ParserName__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ParserName__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:3378:1: ( ( RULE_ID ) )
            // InternalParser.g:3379:2: ( RULE_ID )
            {
            // InternalParser.g:3379:2: ( RULE_ID )
            // InternalParser.g:3380:3: RULE_ID
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
    // InternalParser.g:3389:1: rule__Import__ContentAssignment_2 : ( ruleCodeBlock ) ;
    public final void rule__Import__ContentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:3393:1: ( ( ruleCodeBlock ) )
            // InternalParser.g:3394:2: ( ruleCodeBlock )
            {
            // InternalParser.g:3394:2: ( ruleCodeBlock )
            // InternalParser.g:3395:3: ruleCodeBlock
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
    // InternalParser.g:3404:1: rule__Export__ContentAssignment_2 : ( ruleCodeBlock ) ;
    public final void rule__Export__ContentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:3408:1: ( ( ruleCodeBlock ) )
            // InternalParser.g:3409:2: ( ruleCodeBlock )
            {
            // InternalParser.g:3409:2: ( ruleCodeBlock )
            // InternalParser.g:3410:3: ruleCodeBlock
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
    // InternalParser.g:3419:1: rule__Global__ContentAssignment_2 : ( ruleCodeBlock ) ;
    public final void rule__Global__ContentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:3423:1: ( ( ruleCodeBlock ) )
            // InternalParser.g:3424:2: ( ruleCodeBlock )
            {
            // InternalParser.g:3424:2: ( ruleCodeBlock )
            // InternalParser.g:3425:3: ruleCodeBlock
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
    // InternalParser.g:3434:1: rule__Local__ContentAssignment_2 : ( ruleCodeBlock ) ;
    public final void rule__Local__ContentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:3438:1: ( ( ruleCodeBlock ) )
            // InternalParser.g:3439:2: ( ruleCodeBlock )
            {
            // InternalParser.g:3439:2: ( ruleCodeBlock )
            // InternalParser.g:3440:3: ruleCodeBlock
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
    // InternalParser.g:3449:1: rule__Begin__ContentAssignment_2 : ( ruleCodeBlock ) ;
    public final void rule__Begin__ContentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:3453:1: ( ( ruleCodeBlock ) )
            // InternalParser.g:3454:2: ( ruleCodeBlock )
            {
            // InternalParser.g:3454:2: ( ruleCodeBlock )
            // InternalParser.g:3455:3: ruleCodeBlock
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
    // InternalParser.g:3464:1: rule__Close__ContentAssignment_2 : ( ruleCodeBlock ) ;
    public final void rule__Close__ContentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:3468:1: ( ( ruleCodeBlock ) )
            // InternalParser.g:3469:2: ( ruleCodeBlock )
            {
            // InternalParser.g:3469:2: ( ruleCodeBlock )
            // InternalParser.g:3470:3: ruleCodeBlock
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
    // InternalParser.g:3479:1: rule__Tokens__TokensAssignment_1 : ( ruleDefinedToken ) ;
    public final void rule__Tokens__TokensAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:3483:1: ( ( ruleDefinedToken ) )
            // InternalParser.g:3484:2: ( ruleDefinedToken )
            {
            // InternalParser.g:3484:2: ( ruleDefinedToken )
            // InternalParser.g:3485:3: ruleDefinedToken
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
    // InternalParser.g:3494:1: rule__DefinedToken__NameAssignment_0_0 : ( ( rule__DefinedToken__NameAlternatives_0_0_0 ) ) ;
    public final void rule__DefinedToken__NameAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:3498:1: ( ( ( rule__DefinedToken__NameAlternatives_0_0_0 ) ) )
            // InternalParser.g:3499:2: ( ( rule__DefinedToken__NameAlternatives_0_0_0 ) )
            {
            // InternalParser.g:3499:2: ( ( rule__DefinedToken__NameAlternatives_0_0_0 ) )
            // InternalParser.g:3500:3: ( rule__DefinedToken__NameAlternatives_0_0_0 )
            {
             before(grammarAccess.getDefinedTokenAccess().getNameAlternatives_0_0_0()); 
            // InternalParser.g:3501:3: ( rule__DefinedToken__NameAlternatives_0_0_0 )
            // InternalParser.g:3501:4: rule__DefinedToken__NameAlternatives_0_0_0
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
    // InternalParser.g:3509:1: rule__DefinedToken__NumberAssignment_0_1_1 : ( RULE_INT ) ;
    public final void rule__DefinedToken__NumberAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:3513:1: ( ( RULE_INT ) )
            // InternalParser.g:3514:2: ( RULE_INT )
            {
            // InternalParser.g:3514:2: ( RULE_INT )
            // InternalParser.g:3515:3: RULE_INT
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
    // InternalParser.g:3524:1: rule__DefinedToken__ExtraAssignment_0_1_2_1 : ( ruleTokenExtra ) ;
    public final void rule__DefinedToken__ExtraAssignment_0_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:3528:1: ( ( ruleTokenExtra ) )
            // InternalParser.g:3529:2: ( ruleTokenExtra )
            {
            // InternalParser.g:3529:2: ( ruleTokenExtra )
            // InternalParser.g:3530:3: ruleTokenExtra
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
    // InternalParser.g:3539:1: rule__DefinedToken__ExtraAssignment_1 : ( ruleTokenExtra ) ;
    public final void rule__DefinedToken__ExtraAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:3543:1: ( ( ruleTokenExtra ) )
            // InternalParser.g:3544:2: ( ruleTokenExtra )
            {
            // InternalParser.g:3544:2: ( ruleTokenExtra )
            // InternalParser.g:3545:3: ruleTokenExtra
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
    // InternalParser.g:3554:1: rule__TokenExtra__CostAssignment_0 : ( RULE_INT ) ;
    public final void rule__TokenExtra__CostAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:3558:1: ( ( RULE_INT ) )
            // InternalParser.g:3559:2: ( RULE_INT )
            {
            // InternalParser.g:3559:2: ( RULE_INT )
            // InternalParser.g:3560:3: RULE_INT
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
    // InternalParser.g:3569:1: rule__TokenExtra__PresentationAssignment_2 : ( RULE_STRING ) ;
    public final void rule__TokenExtra__PresentationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:3573:1: ( ( RULE_STRING ) )
            // InternalParser.g:3574:2: ( RULE_STRING )
            {
            // InternalParser.g:3574:2: ( RULE_STRING )
            // InternalParser.g:3575:3: RULE_STRING
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
    // InternalParser.g:3584:1: rule__Precedence__RowsAssignment_1 : ( rulePrecedenceRow ) ;
    public final void rule__Precedence__RowsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:3588:1: ( ( rulePrecedenceRow ) )
            // InternalParser.g:3589:2: ( rulePrecedenceRow )
            {
            // InternalParser.g:3589:2: ( rulePrecedenceRow )
            // InternalParser.g:3590:3: rulePrecedenceRow
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
    // InternalParser.g:3599:1: rule__PrecedenceRow__TypeAssignment_0 : ( rulePrecedenceType ) ;
    public final void rule__PrecedenceRow__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:3603:1: ( ( rulePrecedenceType ) )
            // InternalParser.g:3604:2: ( rulePrecedenceType )
            {
            // InternalParser.g:3604:2: ( rulePrecedenceType )
            // InternalParser.g:3605:3: rulePrecedenceType
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
    // InternalParser.g:3614:1: rule__PrecedenceRow__TokensAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__PrecedenceRow__TokensAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:3618:1: ( ( ( RULE_ID ) ) )
            // InternalParser.g:3619:2: ( ( RULE_ID ) )
            {
            // InternalParser.g:3619:2: ( ( RULE_ID ) )
            // InternalParser.g:3620:3: ( RULE_ID )
            {
             before(grammarAccess.getPrecedenceRowAccess().getTokensDefinedTokenCrossReference_1_0()); 
            // InternalParser.g:3621:3: ( RULE_ID )
            // InternalParser.g:3622:4: RULE_ID
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
    // InternalParser.g:3633:1: rule__StartSymbols__StatesAssignment_1 : ( ruleStartState ) ;
    public final void rule__StartSymbols__StatesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:3637:1: ( ( ruleStartState ) )
            // InternalParser.g:3638:2: ( ruleStartState )
            {
            // InternalParser.g:3638:2: ( ruleStartState )
            // InternalParser.g:3639:3: ruleStartState
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
    // InternalParser.g:3648:1: rule__StartState__NameAssignment : ( RULE_ID ) ;
    public final void rule__StartState__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:3652:1: ( ( RULE_ID ) )
            // InternalParser.g:3653:2: ( RULE_ID )
            {
            // InternalParser.g:3653:2: ( RULE_ID )
            // InternalParser.g:3654:3: RULE_ID
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


    // $ANTLR start "rule__GrammerRules__RulesAssignment_1"
    // InternalParser.g:3663:1: rule__GrammerRules__RulesAssignment_1 : ( ruleGrammarRule ) ;
    public final void rule__GrammerRules__RulesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:3667:1: ( ( ruleGrammarRule ) )
            // InternalParser.g:3668:2: ( ruleGrammarRule )
            {
            // InternalParser.g:3668:2: ( ruleGrammarRule )
            // InternalParser.g:3669:3: ruleGrammarRule
            {
             before(grammarAccess.getGrammerRulesAccess().getRulesGrammarRuleParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleGrammarRule();

            state._fsp--;

             after(grammarAccess.getGrammerRulesAccess().getRulesGrammarRuleParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrammerRules__RulesAssignment_1"


    // $ANTLR start "rule__GrammarRule__NameAssignment_0"
    // InternalParser.g:3678:1: rule__GrammarRule__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__GrammarRule__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:3682:1: ( ( RULE_ID ) )
            // InternalParser.g:3683:2: ( RULE_ID )
            {
            // InternalParser.g:3683:2: ( RULE_ID )
            // InternalParser.g:3684:3: RULE_ID
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
    // InternalParser.g:3693:1: rule__GrammarRule__BodyAssignment_2 : ( ruleRuleBody ) ;
    public final void rule__GrammarRule__BodyAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:3697:1: ( ( ruleRuleBody ) )
            // InternalParser.g:3698:2: ( ruleRuleBody )
            {
            // InternalParser.g:3698:2: ( ruleRuleBody )
            // InternalParser.g:3699:3: ruleRuleBody
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
    // InternalParser.g:3708:1: rule__GrammarRule__BodyAssignment_3_1 : ( ruleRuleBody ) ;
    public final void rule__GrammarRule__BodyAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:3712:1: ( ( ruleRuleBody ) )
            // InternalParser.g:3713:2: ( ruleRuleBody )
            {
            // InternalParser.g:3713:2: ( ruleRuleBody )
            // InternalParser.g:3714:3: ruleRuleBody
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
    // InternalParser.g:3723:1: rule__RuleBody__PartAssignment_0 : ( ruleRulePart ) ;
    public final void rule__RuleBody__PartAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:3727:1: ( ( ruleRulePart ) )
            // InternalParser.g:3728:2: ( ruleRulePart )
            {
            // InternalParser.g:3728:2: ( ruleRulePart )
            // InternalParser.g:3729:3: ruleRulePart
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
    // InternalParser.g:3738:1: rule__RuleBody__CodeAssignment_1 : ( ruleRuleCode ) ;
    public final void rule__RuleBody__CodeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:3742:1: ( ( ruleRuleCode ) )
            // InternalParser.g:3743:2: ( ruleRuleCode )
            {
            // InternalParser.g:3743:2: ( ruleRuleCode )
            // InternalParser.g:3744:3: ruleRuleCode
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


    // $ANTLR start "rule__RulePart__RegexAssignment_0"
    // InternalParser.g:3753:1: rule__RulePart__RegexAssignment_0 : ( RULE_STRING ) ;
    public final void rule__RulePart__RegexAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:3757:1: ( ( RULE_STRING ) )
            // InternalParser.g:3758:2: ( RULE_STRING )
            {
            // InternalParser.g:3758:2: ( RULE_STRING )
            // InternalParser.g:3759:3: RULE_STRING
            {
             before(grammarAccess.getRulePartAccess().getRegexSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getRulePartAccess().getRegexSTRINGTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RulePart__RegexAssignment_0"


    // $ANTLR start "rule__RulePart__RulesAssignment_1"
    // InternalParser.g:3768:1: rule__RulePart__RulesAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__RulePart__RulesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParser.g:3772:1: ( ( ( RULE_ID ) ) )
            // InternalParser.g:3773:2: ( ( RULE_ID ) )
            {
            // InternalParser.g:3773:2: ( ( RULE_ID ) )
            // InternalParser.g:3774:3: ( RULE_ID )
            {
             before(grammarAccess.getRulePartAccess().getRulesGrammerReferenceCrossReference_1_0()); 
            // InternalParser.g:3775:3: ( RULE_ID )
            // InternalParser.g:3776:4: RULE_ID
            {
             before(grammarAccess.getRulePartAccess().getRulesGrammerReferenceIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRulePartAccess().getRulesGrammerReferenceIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getRulePartAccess().getRulesGrammerReferenceCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RulePart__RulesAssignment_1"

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
    static final String dfa_1s = "\14\uffff";
    static final String dfa_2s = "\1\37\13\uffff";
    static final String dfa_3s = "\1\60\13\uffff";
    static final String dfa_4s = "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13";
    static final String dfa_5s = "\1\0\13\uffff}>";
    static final String[] dfa_6s = {
            "\2\13\3\uffff\1\1\1\uffff\1\2\2\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12",
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
            return "2790:3: ( ({...}? => ( ( ( rule__ParserModel__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__ParserModel__ImportBlockAssignment_1 ) ) ) ) | ({...}? => ( ( ( rule__ParserModel__ExportBlockAssignment_2 ) ) ) ) | ({...}? => ( ( ( rule__ParserModel__GlobalBlockAssignment_3 ) ) ) ) | ({...}? => ( ( ( rule__ParserModel__LocalBlockAssignment_4 ) ) ) ) | ({...}? => ( ( ( rule__ParserModel__BeginBlockAssignment_5 ) ) ) ) | ({...}? => ( ( ( rule__ParserModel__CloseBlockAssignment_6 ) ) ) ) | ({...}? => ( ( ( rule__ParserModel__TokensAssignment_7 ) ) ) ) | ({...}? => ( ( ( rule__ParserModel__PrecedencAssignment_8 ) ) ) ) | ({...}? => ( ( ( rule__ParserModel__StartAssignment_9 ) ) ) ) | ({...}? => ( ( ( rule__ParserModel__RulesAssignment_10 ) ) ) ) )";
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
                        if ( LA19_0 == 36 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup(), 0) ) {s = 1;}

                        else if ( LA19_0 == 38 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup(), 1) ) {s = 2;}

                        else if ( LA19_0 == 41 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup(), 2) ) {s = 3;}

                        else if ( LA19_0 == 42 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup(), 3) ) {s = 4;}

                        else if ( LA19_0 == 43 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup(), 4) ) {s = 5;}

                        else if ( LA19_0 == 44 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup(), 5) ) {s = 6;}

                        else if ( LA19_0 == 45 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup(), 6) ) {s = 7;}

                        else if ( LA19_0 == 46 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup(), 7) ) {s = 8;}

                        else if ( LA19_0 == 47 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup(), 8) ) {s = 9;}

                        else if ( LA19_0 == 48 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup(), 9) ) {s = 10;}

                        else if ( LA19_0 >= 31 && LA19_0 <= 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup(), 10) ) {s = 11;}

                         
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
    static final String dfa_7s = "\15\uffff";
    static final String dfa_8s = "\1\14\14\uffff";
    static final String dfa_9s = "\1\37\14\uffff";
    static final String dfa_10s = "\1\60\14\uffff";
    static final String dfa_11s = "\1\uffff\13\1\1\2";
    static final String dfa_12s = "\1\0\14\uffff}>";
    static final String[] dfa_13s = {
            "\2\13\3\uffff\1\1\1\uffff\1\2\2\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12",
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

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA20 extends DFA {

        public DFA20(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 20;
            this.eot = dfa_7;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "2970:2: ( rule__ParserModel__UnorderedGroup__1 )?";
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
                        if ( LA20_0 == 36 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup(), 0) ) {s = 1;}

                        else if ( LA20_0 == 38 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup(), 1) ) {s = 2;}

                        else if ( LA20_0 == 41 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup(), 2) ) {s = 3;}

                        else if ( LA20_0 == 42 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup(), 3) ) {s = 4;}

                        else if ( LA20_0 == 43 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup(), 4) ) {s = 5;}

                        else if ( LA20_0 == 44 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup(), 5) ) {s = 6;}

                        else if ( LA20_0 == 45 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup(), 6) ) {s = 7;}

                        else if ( LA20_0 == 46 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup(), 7) ) {s = 8;}

                        else if ( LA20_0 == 47 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup(), 8) ) {s = 9;}

                        else if ( LA20_0 == 48 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup(), 9) ) {s = 10;}

                        else if ( LA20_0 >= 31 && LA20_0 <= 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup(), 10) ) {s = 11;}

                        else if ( (LA20_0==EOF) ) {s = 12;}

                         
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
            this.eot = dfa_7;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "2982:2: ( rule__ParserModel__UnorderedGroup__2 )?";
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
                        if ( LA21_0 == 36 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup(), 0) ) {s = 1;}

                        else if ( LA21_0 == 38 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup(), 1) ) {s = 2;}

                        else if ( LA21_0 == 41 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup(), 2) ) {s = 3;}

                        else if ( LA21_0 == 42 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup(), 3) ) {s = 4;}

                        else if ( LA21_0 == 43 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup(), 4) ) {s = 5;}

                        else if ( LA21_0 == 44 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup(), 5) ) {s = 6;}

                        else if ( LA21_0 == 45 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup(), 6) ) {s = 7;}

                        else if ( LA21_0 == 46 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup(), 7) ) {s = 8;}

                        else if ( LA21_0 == 47 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup(), 8) ) {s = 9;}

                        else if ( LA21_0 == 48 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup(), 9) ) {s = 10;}

                        else if ( LA21_0 >= 31 && LA21_0 <= 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup(), 10) ) {s = 11;}

                        else if ( (LA21_0==EOF) ) {s = 12;}

                         
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
            this.eot = dfa_7;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "2994:2: ( rule__ParserModel__UnorderedGroup__3 )?";
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
                        if ( LA22_0 == 36 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup(), 0) ) {s = 1;}

                        else if ( LA22_0 == 38 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup(), 1) ) {s = 2;}

                        else if ( LA22_0 == 41 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup(), 2) ) {s = 3;}

                        else if ( LA22_0 == 42 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup(), 3) ) {s = 4;}

                        else if ( LA22_0 == 43 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup(), 4) ) {s = 5;}

                        else if ( LA22_0 == 44 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup(), 5) ) {s = 6;}

                        else if ( LA22_0 == 45 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup(), 6) ) {s = 7;}

                        else if ( LA22_0 == 46 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup(), 7) ) {s = 8;}

                        else if ( LA22_0 == 47 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup(), 8) ) {s = 9;}

                        else if ( LA22_0 == 48 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup(), 9) ) {s = 10;}

                        else if ( LA22_0 >= 31 && LA22_0 <= 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup(), 10) ) {s = 11;}

                        else if ( (LA22_0==EOF) ) {s = 12;}

                         
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
            this.eot = dfa_7;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "3006:2: ( rule__ParserModel__UnorderedGroup__4 )?";
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
                        if ( LA23_0 == 36 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup(), 0) ) {s = 1;}

                        else if ( LA23_0 == 38 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup(), 1) ) {s = 2;}

                        else if ( LA23_0 == 41 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup(), 2) ) {s = 3;}

                        else if ( LA23_0 == 42 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup(), 3) ) {s = 4;}

                        else if ( LA23_0 == 43 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup(), 4) ) {s = 5;}

                        else if ( LA23_0 == 44 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup(), 5) ) {s = 6;}

                        else if ( LA23_0 == 45 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup(), 6) ) {s = 7;}

                        else if ( LA23_0 == 46 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup(), 7) ) {s = 8;}

                        else if ( LA23_0 == 47 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup(), 8) ) {s = 9;}

                        else if ( LA23_0 == 48 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup(), 9) ) {s = 10;}

                        else if ( LA23_0 >= 31 && LA23_0 <= 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup(), 10) ) {s = 11;}

                        else if ( (LA23_0==EOF) ) {s = 12;}

                         
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
            this.eot = dfa_7;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "3018:2: ( rule__ParserModel__UnorderedGroup__5 )?";
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
                        if ( LA24_0 == 36 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup(), 0) ) {s = 1;}

                        else if ( LA24_0 == 38 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup(), 1) ) {s = 2;}

                        else if ( LA24_0 == 41 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup(), 2) ) {s = 3;}

                        else if ( LA24_0 == 42 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup(), 3) ) {s = 4;}

                        else if ( LA24_0 == 43 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup(), 4) ) {s = 5;}

                        else if ( LA24_0 == 44 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup(), 5) ) {s = 6;}

                        else if ( LA24_0 == 45 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup(), 6) ) {s = 7;}

                        else if ( LA24_0 == 46 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup(), 7) ) {s = 8;}

                        else if ( LA24_0 == 47 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup(), 8) ) {s = 9;}

                        else if ( LA24_0 == 48 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup(), 9) ) {s = 10;}

                        else if ( LA24_0 >= 31 && LA24_0 <= 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup(), 10) ) {s = 11;}

                        else if ( (LA24_0==EOF) ) {s = 12;}

                         
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
            this.eot = dfa_7;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "3030:2: ( rule__ParserModel__UnorderedGroup__6 )?";
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
                        if ( LA25_0 == 36 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup(), 0) ) {s = 1;}

                        else if ( LA25_0 == 38 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup(), 1) ) {s = 2;}

                        else if ( LA25_0 == 41 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup(), 2) ) {s = 3;}

                        else if ( LA25_0 == 42 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup(), 3) ) {s = 4;}

                        else if ( LA25_0 == 43 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup(), 4) ) {s = 5;}

                        else if ( LA25_0 == 44 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup(), 5) ) {s = 6;}

                        else if ( LA25_0 == 45 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup(), 6) ) {s = 7;}

                        else if ( LA25_0 == 46 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup(), 7) ) {s = 8;}

                        else if ( LA25_0 == 47 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup(), 8) ) {s = 9;}

                        else if ( LA25_0 == 48 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup(), 9) ) {s = 10;}

                        else if ( LA25_0 >= 31 && LA25_0 <= 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup(), 10) ) {s = 11;}

                        else if ( (LA25_0==EOF) ) {s = 12;}

                         
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
            this.eot = dfa_7;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "3042:2: ( rule__ParserModel__UnorderedGroup__7 )?";
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
                        if ( LA26_0 == 36 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup(), 0) ) {s = 1;}

                        else if ( LA26_0 == 38 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup(), 1) ) {s = 2;}

                        else if ( LA26_0 == 41 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup(), 2) ) {s = 3;}

                        else if ( LA26_0 == 42 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup(), 3) ) {s = 4;}

                        else if ( LA26_0 == 43 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup(), 4) ) {s = 5;}

                        else if ( LA26_0 == 44 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup(), 5) ) {s = 6;}

                        else if ( LA26_0 == 45 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup(), 6) ) {s = 7;}

                        else if ( LA26_0 == 46 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup(), 7) ) {s = 8;}

                        else if ( LA26_0 == 47 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup(), 8) ) {s = 9;}

                        else if ( LA26_0 == 48 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup(), 9) ) {s = 10;}

                        else if ( LA26_0 >= 31 && LA26_0 <= 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup(), 10) ) {s = 11;}

                        else if ( (LA26_0==EOF) ) {s = 12;}

                         
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
            this.eot = dfa_7;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "3054:2: ( rule__ParserModel__UnorderedGroup__8 )?";
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
                        if ( LA27_0 == 36 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup(), 0) ) {s = 1;}

                        else if ( LA27_0 == 38 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup(), 1) ) {s = 2;}

                        else if ( LA27_0 == 41 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup(), 2) ) {s = 3;}

                        else if ( LA27_0 == 42 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup(), 3) ) {s = 4;}

                        else if ( LA27_0 == 43 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup(), 4) ) {s = 5;}

                        else if ( LA27_0 == 44 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup(), 5) ) {s = 6;}

                        else if ( LA27_0 == 45 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup(), 6) ) {s = 7;}

                        else if ( LA27_0 == 46 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup(), 7) ) {s = 8;}

                        else if ( LA27_0 == 47 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup(), 8) ) {s = 9;}

                        else if ( LA27_0 == 48 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup(), 9) ) {s = 10;}

                        else if ( LA27_0 >= 31 && LA27_0 <= 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup(), 10) ) {s = 11;}

                        else if ( (LA27_0==EOF) ) {s = 12;}

                         
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
            this.eot = dfa_7;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "3066:2: ( rule__ParserModel__UnorderedGroup__9 )?";
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
                        if ( LA28_0 == 36 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup(), 0) ) {s = 1;}

                        else if ( LA28_0 == 38 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup(), 1) ) {s = 2;}

                        else if ( LA28_0 == 41 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup(), 2) ) {s = 3;}

                        else if ( LA28_0 == 42 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup(), 3) ) {s = 4;}

                        else if ( LA28_0 == 43 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup(), 4) ) {s = 5;}

                        else if ( LA28_0 == 44 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup(), 5) ) {s = 6;}

                        else if ( LA28_0 == 45 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup(), 6) ) {s = 7;}

                        else if ( LA28_0 == 46 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup(), 7) ) {s = 8;}

                        else if ( LA28_0 == 47 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup(), 8) ) {s = 9;}

                        else if ( LA28_0 == 48 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup(), 9) ) {s = 10;}

                        else if ( LA28_0 >= 31 && LA28_0 <= 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup(), 10) ) {s = 11;}

                        else if ( (LA28_0==EOF) ) {s = 12;}

                         
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
            this.eot = dfa_7;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "3078:2: ( rule__ParserModel__UnorderedGroup__10 )?";
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
                        if ( LA29_0 == 36 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup(), 0) ) {s = 1;}

                        else if ( LA29_0 == 38 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup(), 1) ) {s = 2;}

                        else if ( LA29_0 == 41 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup(), 2) ) {s = 3;}

                        else if ( LA29_0 == 42 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup(), 3) ) {s = 4;}

                        else if ( LA29_0 == 43 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup(), 4) ) {s = 5;}

                        else if ( LA29_0 == 44 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup(), 5) ) {s = 6;}

                        else if ( LA29_0 == 45 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup(), 6) ) {s = 7;}

                        else if ( LA29_0 == 46 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup(), 7) ) {s = 8;}

                        else if ( LA29_0 == 47 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup(), 8) ) {s = 9;}

                        else if ( LA29_0 == 48 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup(), 9) ) {s = 10;}

                        else if ( LA29_0 >= 31 && LA29_0 <= 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getParserModelAccess().getUnorderedGroup(), 10) ) {s = 11;}

                        else if ( (LA29_0==EOF) ) {s = 12;}

                         
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
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000807FFFF8F2L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000062L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000002000000000L});
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
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0001FE5180000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0002008000000002L});

}
