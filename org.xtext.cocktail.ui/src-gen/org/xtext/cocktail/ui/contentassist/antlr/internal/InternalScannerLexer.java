package org.xtext.cocktail.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalScannerLexer extends Lexer {
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

    public InternalScannerLexer() {;} 
    public InternalScannerLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalScannerLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g"; }

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:11:7: ( ':-' )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:11:9: ':-'
            {
            match(":-"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:12:7: ( ':' )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:12:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:13:7: ( 'STD' )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:13:9: 'STD'
            {
            match("STD"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:14:7: ( 'SCANNER' )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:14:9: 'SCANNER'
            {
            match("SCANNER"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:15:7: ( 'EXPORT {' )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:15:9: 'EXPORT {'
            {
            match("EXPORT {"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:16:7: ( '}' )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:16:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:17:7: ( 'GLOBAL {' )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:17:9: 'GLOBAL {'
            {
            match("GLOBAL {"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:18:7: ( 'LOCAL {' )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:18:9: 'LOCAL {'
            {
            match("LOCAL {"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:19:7: ( 'DEFAULT {' )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:19:9: 'DEFAULT {'
            {
            match("DEFAULT {"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:20:7: ( 'EOF {' )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:20:9: 'EOF {'
            {
            match("EOF {"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:21:7: ( 'DEFINE' )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:21:9: 'DEFINE'
            {
            match("DEFINE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:22:7: ( '=' )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:22:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:23:7: ( '.' )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:23:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:24:7: ( 'START' )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:24:9: 'START'
            {
            match("START"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:25:7: ( ',' )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:25:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:26:7: ( 'RULE' )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:26:9: 'RULE'
            {
            match("RULE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:27:7: ( '{' )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:27:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:28:7: ( '#' )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:28:9: '#'
            {
            match('#'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "RULE_TEXT"
    public final void mRULE_TEXT() throws RecognitionException {
        try {
            int _type = RULE_TEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2408:11: ( (~ ( ':' ) )* ':' )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2408:13: (~ ( ':' ) )* ':'
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2408:13: (~ ( ':' ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='\u0000' && LA1_0<='9')||(LA1_0>=';' && LA1_0<='\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2408:13: ~ ( ':' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='9')||(input.LA(1)>=';' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TEXT"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2410:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2410:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2410:11: ( '^' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='^') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2410:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2410:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2412:10: ( ( '0' .. '9' )+ )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2412:12: ( '0' .. '9' )+
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2412:12: ( '0' .. '9' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2412:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

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

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2414:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2414:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2414:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='\"') ) {
                alt7=1;
            }
            else if ( (LA7_0=='\'') ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2414:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2414:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='!')||(LA5_0>='#' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2414:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2414:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2414:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2414:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='&')||(LA6_0>='(' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2414:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2414:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2416:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2416:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2416:24: ( options {greedy=false; } : . )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='*') ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1=='/') ) {
                        alt8=2;
                    }
                    else if ( ((LA8_1>='\u0000' && LA8_1<='.')||(LA8_1>='0' && LA8_1<='\uFFFF')) ) {
                        alt8=1;
                    }


                }
                else if ( ((LA8_0>='\u0000' && LA8_0<=')')||(LA8_0>='+' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2416:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2418:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2418:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2418:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\u0000' && LA9_0<='\t')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2418:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2418:40: ( ( '\\r' )? '\\n' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\n'||LA11_0=='\r') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2418:41: ( '\\r' )? '\\n'
                    {
                    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2418:41: ( '\\r' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='\r') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2418:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2420:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2420:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2420:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2422:16: ( . )
            // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:2422:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | RULE_TEXT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt13=26;
        alt13 = dfa13.predict(input);
        switch (alt13) {
            case 1 :
                // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1:10: T__12
                {
                mT__12(); 

                }
                break;
            case 2 :
                // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1:16: T__13
                {
                mT__13(); 

                }
                break;
            case 3 :
                // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1:22: T__14
                {
                mT__14(); 

                }
                break;
            case 4 :
                // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1:28: T__15
                {
                mT__15(); 

                }
                break;
            case 5 :
                // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1:34: T__16
                {
                mT__16(); 

                }
                break;
            case 6 :
                // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1:40: T__17
                {
                mT__17(); 

                }
                break;
            case 7 :
                // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1:46: T__18
                {
                mT__18(); 

                }
                break;
            case 8 :
                // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1:52: T__19
                {
                mT__19(); 

                }
                break;
            case 9 :
                // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1:58: T__20
                {
                mT__20(); 

                }
                break;
            case 10 :
                // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1:64: T__21
                {
                mT__21(); 

                }
                break;
            case 11 :
                // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1:70: T__22
                {
                mT__22(); 

                }
                break;
            case 12 :
                // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1:76: T__23
                {
                mT__23(); 

                }
                break;
            case 13 :
                // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1:82: T__24
                {
                mT__24(); 

                }
                break;
            case 14 :
                // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1:88: T__25
                {
                mT__25(); 

                }
                break;
            case 15 :
                // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1:94: T__26
                {
                mT__26(); 

                }
                break;
            case 16 :
                // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1:100: T__27
                {
                mT__27(); 

                }
                break;
            case 17 :
                // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1:106: T__28
                {
                mT__28(); 

                }
                break;
            case 18 :
                // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1:112: T__29
                {
                mT__29(); 

                }
                break;
            case 19 :
                // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1:118: RULE_TEXT
                {
                mRULE_TEXT(); 

                }
                break;
            case 20 :
                // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1:128: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 21 :
                // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1:136: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 22 :
                // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1:145: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 23 :
                // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1:157: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 24 :
                // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1:173: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 25 :
                // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1:189: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 26 :
                // ../org.xtext.cocktail.ui/src-gen/org/xtext/cocktail/ui/contentassist/antlr/internal/InternalScanner.g:1:197: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA13_eotS =
        "\1\uffff\1\27\2\34\1\37\3\34\1\43\1\44\1\45\1\34\1\47\1\50\1\52"+
        "\1\34\1\53\3\52\1\70\1\52\2\uffff\2\34\1\uffff\1\34\1\uffff\2\34"+
        "\1\uffff\3\34\3\uffff\1\34\2\uffff\1\34\2\uffff\1\53\1\32\2\uffff"+
        "\1\102\1\32\2\uffff\1\102\1\uffff\1\116\1\70\1\uffff\1\117\10\34"+
        "\1\uffff\1\32\1\uffff\1\32\1\uffff\1\32\2\uffff\1\32\1\116\1\uffff"+
        "\1\116\2\uffff\3\34\1\uffff\4\34\1\143\1\uffff\1\131\1\144\2\34"+
        "\1\147\4\34\2\uffff\2\34\1\uffff\1\34\1\uffff\1\34\1\161\1\162\2"+
        "\uffff\1\165\1\34\2\uffff\1\167\1\170\4\uffff\1\172\1\uffff";
    static final String DFA13_eofS =
        "\173\uffff";
    static final String DFA13_minS =
        "\1\0\1\55\24\0\2\uffff\2\0\1\uffff\1\0\1\uffff\2\0\1\uffff\3\0"+
        "\3\uffff\1\0\2\uffff\1\0\2\uffff\14\0\1\uffff\11\0\1\uffff\13\0"+
        "\2\uffff\11\0\1\uffff\11\0\2\uffff\2\0\1\uffff\11\0\2\uffff\2\0"+
        "\1\uffff\1\0\2\uffff\1\0\1\uffff";
    static final String DFA13_maxS =
        "\1\uffff\1\55\24\uffff\2\uffff\2\uffff\1\uffff\1\uffff\1\uffff"+
        "\2\uffff\1\uffff\3\uffff\3\uffff\1\uffff\2\uffff\1\uffff\2\uffff"+
        "\14\uffff\1\uffff\11\uffff\1\uffff\13\uffff\2\uffff\11\uffff\1\uffff"+
        "\11\uffff\2\uffff\2\uffff\1\uffff\11\uffff\2\uffff\2\uffff\1\uffff"+
        "\1\uffff\2\uffff\1\uffff\1\uffff";
    static final String DFA13_acceptS =
        "\26\uffff\1\1\1\2\2\uffff\1\23\1\uffff\1\24\2\uffff\1\6\3\uffff"+
        "\1\14\1\15\1\17\1\uffff\1\21\1\22\1\uffff\1\32\1\25\14\uffff\1\31"+
        "\11\uffff\1\26\13\uffff\1\30\1\3\11\uffff\1\27\11\uffff\1\20\1\16"+
        "\2\uffff\1\12\11\uffff\1\13\1\4\2\uffff\1\10\1\uffff\1\5\1\7\1\uffff"+
        "\1\11";
    static final String DFA13_specialS =
        "\1\136\1\uffff\1\63\1\33\1\101\1\125\1\127\1\47\1\6\1\15\1\25\1"+
        "\14\1\37\1\42\1\1\1\50\1\2\1\52\1\22\1\66\1\61\1\51\2\uffff\1\20"+
        "\1\54\1\uffff\1\30\1\uffff\1\64\1\117\1\uffff\1\75\1\105\1\31\3"+
        "\uffff\1\132\2\uffff\1\126\2\uffff\1\46\1\16\1\113\1\5\1\12\1\103"+
        "\1\124\1\71\1\23\1\11\1\121\1\135\1\uffff\1\26\1\130\1\55\1\65\1"+
        "\120\1\76\1\106\1\34\1\133\1\uffff\1\13\1\3\1\74\1\62\1\10\1\7\1"+
        "\0\1\104\1\73\1\21\1\53\2\uffff\1\131\1\56\1\67\1\45\1\77\1\107"+
        "\1\111\1\122\1\4\1\uffff\1\44\1\134\1\57\1\70\1\40\1\100\1\110\1"+
        "\112\1\123\2\uffff\1\60\1\72\1\uffff\1\102\1\41\1\114\1\116\1\36"+
        "\1\27\1\35\1\24\1\115\2\uffff\1\137\1\17\1\uffff\1\43\2\uffff\1"+
        "\32\1\uffff}>";
    static final String[] DFA13_transitionS = {
            "\11\25\2\24\2\25\1\24\22\25\1\24\1\25\1\21\1\15\3\25\1\22\4"+
            "\25\1\12\1\25\1\11\1\23\12\20\1\1\2\25\1\10\3\25\3\17\1\7\1"+
            "\3\1\17\1\5\4\17\1\6\5\17\1\13\1\2\7\17\3\25\1\16\1\17\1\25"+
            "\32\17\1\14\1\25\1\4\uff82\25",
            "\1\26",
            "\60\32\12\33\7\32\2\33\1\31\20\33\1\30\6\33\4\32\1\33\1\32"+
            "\32\33\uff85\32",
            "\60\32\12\33\7\32\16\33\1\36\10\33\1\35\2\33\4\32\1\33\1\32"+
            "\32\33\uff85\32",
            "\0\32",
            "\60\32\12\33\7\32\13\33\1\40\16\33\4\32\1\33\1\32\32\33\uff85"+
            "\32",
            "\60\32\12\33\7\32\16\33\1\41\13\33\4\32\1\33\1\32\32\33\uff85"+
            "\32",
            "\60\32\12\33\7\32\4\33\1\42\25\33\4\32\1\33\1\32\32\33\uff85"+
            "\32",
            "\0\32",
            "\0\32",
            "\0\32",
            "\60\32\12\33\7\32\24\33\1\46\5\33\4\32\1\33\1\32\32\33\uff85"+
            "\32",
            "\0\32",
            "\0\32",
            "\101\32\32\51\4\32\1\51\1\32\32\51\uff85\32",
            "\60\32\12\33\7\32\32\33\4\32\1\33\1\32\32\33\uff85\32",
            "\60\32\12\54\uffc6\32",
            "\42\57\1\60\27\57\1\55\41\57\1\56\uffa3\57",
            "\47\63\1\64\22\63\1\61\41\63\1\62\uffa3\63",
            "\52\32\1\65\4\32\1\66\uffd0\32",
            "\11\32\2\67\2\32\1\67\22\32\1\67\uffdf\32",
            "\0\32",
            "",
            "",
            "\60\32\12\33\7\32\1\72\2\33\1\71\26\33\4\32\1\33\1\32\32\33"+
            "\uff85\32",
            "\60\32\12\33\7\32\1\73\31\33\4\32\1\33\1\32\32\33\uff85\32",
            "",
            "\60\32\12\33\7\32\32\33\4\32\1\33\1\32\32\33\uff85\32",
            "",
            "\60\32\12\33\7\32\17\33\1\74\12\33\4\32\1\33\1\32\32\33\uff85"+
            "\32",
            "\60\32\12\33\7\32\5\33\1\75\24\33\4\32\1\33\1\32\32\33\uff85"+
            "\32",
            "",
            "\60\32\12\33\7\32\16\33\1\76\13\33\4\32\1\33\1\32\32\33\uff85"+
            "\32",
            "\60\32\12\33\7\32\2\33\1\77\27\33\4\32\1\33\1\32\32\33\uff85"+
            "\32",
            "\60\32\12\33\7\32\5\33\1\100\24\33\4\32\1\33\1\32\32\33\uff85"+
            "\32",
            "",
            "",
            "",
            "\60\32\12\33\7\32\13\33\1\101\16\33\4\32\1\33\1\32\32\33\uff85"+
            "\32",
            "",
            "",
            "\60\32\12\33\7\32\32\33\4\32\1\33\1\32\32\33\uff85\32",
            "",
            "",
            "\60\32\12\54\uffc6\32",
            "\0\102",
            "\72\104\1\103\uffc5\104",
            "\42\57\1\60\27\57\1\55\41\57\1\56\uffa3\57",
            "\0\32",
            "\0\102",
            "\72\106\1\105\uffc5\106",
            "\47\63\1\64\22\63\1\61\41\63\1\62\uffa3\63",
            "\0\32",
            "\52\111\1\110\17\111\1\107\uffc5\111",
            "\12\113\1\115\2\113\1\114\54\113\1\112\uffc5\113",
            "\11\32\2\67\2\32\1\67\22\32\1\67\uffdf\32",
            "",
            "\60\32\12\33\7\32\32\33\4\32\1\33\1\32\32\33\uff85\32",
            "\60\32\12\33\7\32\21\33\1\120\10\33\4\32\1\33\1\32\32\33\uff85"+
            "\32",
            "\60\32\12\33\7\32\15\33\1\121\14\33\4\32\1\33\1\32\32\33\uff85"+
            "\32",
            "\60\32\12\33\7\32\16\33\1\122\13\33\4\32\1\33\1\32\32\33\uff85"+
            "\32",
            "\40\32\1\123\17\32\12\33\7\32\32\33\4\32\1\33\1\32\32\33\uff85"+
            "\32",
            "\60\32\12\33\7\32\1\33\1\124\30\33\4\32\1\33\1\32\32\33\uff85"+
            "\32",
            "\60\32\12\33\7\32\1\125\31\33\4\32\1\33\1\32\32\33\uff85\32",
            "\60\32\12\33\7\32\1\126\7\33\1\127\21\33\4\32\1\33\1\32\32"+
            "\33\uff85\32",
            "\60\32\12\33\7\32\4\33\1\130\25\33\4\32\1\33\1\32\32\33\uff85"+
            "\32",
            "",
            "\0\102",
            "\42\57\1\60\27\57\1\55\41\57\1\56\uffa3\57",
            "\0\102",
            "\47\63\1\64\22\63\1\61\41\63\1\62\uffa3\63",
            "\0\131",
            "\52\111\1\110\4\111\1\132\12\111\1\107\uffc5\111",
            "\52\111\1\110\17\111\1\107\uffc5\111",
            "\0\116",
            "\12\113\1\115\2\113\1\114\54\113\1\112\uffc5\113",
            "\12\32\1\115\ufff5\32",
            "\0\32",
            "",
            "",
            "\60\32\12\33\7\32\23\33\1\133\6\33\4\32\1\33\1\32\32\33\uff85"+
            "\32",
            "\60\32\12\33\7\32\15\33\1\134\14\33\4\32\1\33\1\32\32\33\uff85"+
            "\32",
            "\60\32\12\33\7\32\21\33\1\135\10\33\4\32\1\33\1\32\32\33\uff85"+
            "\32",
            "\173\32\1\136\uff84\32",
            "\60\32\12\33\7\32\1\137\31\33\4\32\1\33\1\32\32\33\uff85\32",
            "\60\32\12\33\7\32\13\33\1\140\16\33\4\32\1\33\1\32\32\33\uff85"+
            "\32",
            "\60\32\12\33\7\32\24\33\1\141\5\33\4\32\1\33\1\32\32\33\uff85"+
            "\32",
            "\60\32\12\33\7\32\15\33\1\142\14\33\4\32\1\33\1\32\32\33\uff85"+
            "\32",
            "\60\32\12\33\7\32\32\33\4\32\1\33\1\32\32\33\uff85\32",
            "",
            "\52\111\1\110\17\111\1\107\uffc5\111",
            "\60\32\12\33\7\32\32\33\4\32\1\33\1\32\32\33\uff85\32",
            "\60\32\12\33\7\32\4\33\1\145\25\33\4\32\1\33\1\32\32\33\uff85"+
            "\32",
            "\60\32\12\33\7\32\23\33\1\146\6\33\4\32\1\33\1\32\32\33\uff85"+
            "\32",
            "\0\32",
            "\60\32\12\33\7\32\13\33\1\150\16\33\4\32\1\33\1\32\32\33\uff85"+
            "\32",
            "\40\32\1\151\17\32\12\33\7\32\32\33\4\32\1\33\1\32\32\33\uff85"+
            "\32",
            "\60\32\12\33\7\32\13\33\1\152\16\33\4\32\1\33\1\32\32\33\uff85"+
            "\32",
            "\60\32\12\33\7\32\4\33\1\153\25\33\4\32\1\33\1\32\32\33\uff85"+
            "\32",
            "",
            "",
            "\60\32\12\33\7\32\21\33\1\154\10\33\4\32\1\33\1\32\32\33\uff85"+
            "\32",
            "\40\32\1\155\17\32\12\33\7\32\32\33\4\32\1\33\1\32\32\33\uff85"+
            "\32",
            "",
            "\40\32\1\156\17\32\12\33\7\32\32\33\4\32\1\33\1\32\32\33\uff85"+
            "\32",
            "\173\32\1\157\uff84\32",
            "\60\32\12\33\7\32\23\33\1\160\6\33\4\32\1\33\1\32\32\33\uff85"+
            "\32",
            "\60\32\12\33\7\32\32\33\4\32\1\33\1\32\32\33\uff85\32",
            "\60\32\12\33\7\32\32\33\4\32\1\33\1\32\32\33\uff85\32",
            "\173\32\1\163\uff84\32",
            "\173\32\1\164\uff84\32",
            "\0\32",
            "\40\32\1\166\17\32\12\33\7\32\32\33\4\32\1\33\1\32\32\33\uff85"+
            "\32",
            "",
            "",
            "\0\32",
            "\0\32",
            "",
            "\173\32\1\171\uff84\32",
            "",
            "",
            "\0\32",
            ""
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | RULE_TEXT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA13_73 = input.LA(1);

                        s = -1;
                        if ( (LA13_73==':') ) {s = 71;}

                        else if ( (LA13_73=='*') ) {s = 72;}

                        else if ( ((LA13_73>='\u0000' && LA13_73<=')')||(LA13_73>='+' && LA13_73<='9')||(LA13_73>=';' && LA13_73<='\uFFFF')) ) {s = 73;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA13_14 = input.LA(1);

                        s = -1;
                        if ( ((LA13_14>='A' && LA13_14<='Z')||LA13_14=='_'||(LA13_14>='a' && LA13_14<='z')) ) {s = 41;}

                        else if ( ((LA13_14>='\u0000' && LA13_14<='@')||(LA13_14>='[' && LA13_14<='^')||LA13_14=='`'||(LA13_14>='{' && LA13_14<='\uFFFF')) ) {s = 26;}

                        else s = 42;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA13_16 = input.LA(1);

                        s = -1;
                        if ( ((LA13_16>='0' && LA13_16<='9')) ) {s = 44;}

                        else if ( ((LA13_16>='\u0000' && LA13_16<='/')||(LA13_16>=':' && LA13_16<='\uFFFF')) ) {s = 26;}

                        else s = 43;

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA13_68 = input.LA(1);

                        s = -1;
                        if ( (LA13_68==':') ) {s = 45;}

                        else if ( (LA13_68=='\"') ) {s = 48;}

                        else if ( (LA13_68=='\\') ) {s = 46;}

                        else if ( ((LA13_68>='\u0000' && LA13_68<='!')||(LA13_68>='#' && LA13_68<='9')||(LA13_68>=';' && LA13_68<='[')||(LA13_68>=']' && LA13_68<='\uFFFF')) ) {s = 47;}

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA13_88 = input.LA(1);

                        s = -1;
                        if ( ((LA13_88>='\u0000' && LA13_88<='/')||(LA13_88>=':' && LA13_88<='@')||(LA13_88>='[' && LA13_88<='^')||LA13_88=='`'||(LA13_88>='{' && LA13_88<='\uFFFF')) ) {s = 26;}

                        else if ( ((LA13_88>='0' && LA13_88<='9')||(LA13_88>='A' && LA13_88<='Z')||LA13_88=='_'||(LA13_88>='a' && LA13_88<='z')) ) {s = 27;}

                        else s = 99;

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA13_47 = input.LA(1);

                        s = -1;
                        if ( (LA13_47==':') ) {s = 45;}

                        else if ( (LA13_47=='\"') ) {s = 48;}

                        else if ( (LA13_47=='\\') ) {s = 46;}

                        else if ( ((LA13_47>='\u0000' && LA13_47<='!')||(LA13_47>='#' && LA13_47<='9')||(LA13_47>=';' && LA13_47<='[')||(LA13_47>=']' && LA13_47<='\uFFFF')) ) {s = 47;}

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA13_8 = input.LA(1);

                        s = -1;
                        if ( ((LA13_8>='\u0000' && LA13_8<='\uFFFF')) ) {s = 26;}

                        else s = 35;

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA13_72 = input.LA(1);

                        s = -1;
                        if ( (LA13_72=='/') ) {s = 90;}

                        else if ( (LA13_72==':') ) {s = 71;}

                        else if ( (LA13_72=='*') ) {s = 72;}

                        else if ( ((LA13_72>='\u0000' && LA13_72<=')')||(LA13_72>='+' && LA13_72<='.')||(LA13_72>='0' && LA13_72<='9')||(LA13_72>=';' && LA13_72<='\uFFFF')) ) {s = 73;}

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA13_71 = input.LA(1);

                        s = -1;
                        if ( ((LA13_71>='\u0000' && LA13_71<='\uFFFF')) ) {s = 89;}

                        else s = 26;

                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA13_53 = input.LA(1);

                        s = -1;
                        if ( (LA13_53==':') ) {s = 71;}

                        else if ( (LA13_53=='*') ) {s = 72;}

                        else if ( ((LA13_53>='\u0000' && LA13_53<=')')||(LA13_53>='+' && LA13_53<='9')||(LA13_53>=';' && LA13_53<='\uFFFF')) ) {s = 73;}

                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA13_48 = input.LA(1);

                        s = -1;
                        if ( ((LA13_48>='\u0000' && LA13_48<='\uFFFF')) ) {s = 26;}

                        else s = 66;

                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA13_67 = input.LA(1);

                        s = -1;
                        if ( ((LA13_67>='\u0000' && LA13_67<='\uFFFF')) ) {s = 66;}

                        else s = 26;

                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA13_11 = input.LA(1);

                        s = -1;
                        if ( (LA13_11=='U') ) {s = 38;}

                        else if ( ((LA13_11>='\u0000' && LA13_11<='/')||(LA13_11>=':' && LA13_11<='@')||(LA13_11>='[' && LA13_11<='^')||LA13_11=='`'||(LA13_11>='{' && LA13_11<='\uFFFF')) ) {s = 26;}

                        else if ( ((LA13_11>='0' && LA13_11<='9')||(LA13_11>='A' && LA13_11<='T')||(LA13_11>='V' && LA13_11<='Z')||LA13_11=='_'||(LA13_11>='a' && LA13_11<='z')) ) {s = 27;}

                        else s = 28;

                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA13_9 = input.LA(1);

                        s = -1;
                        if ( ((LA13_9>='\u0000' && LA13_9<='\uFFFF')) ) {s = 26;}

                        else s = 36;

                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA13_45 = input.LA(1);

                        s = -1;
                        if ( ((LA13_45>='\u0000' && LA13_45<='\uFFFF')) ) {s = 66;}

                        else s = 26;

                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA13_116 = input.LA(1);

                        s = -1;
                        if ( ((LA13_116>='\u0000' && LA13_116<='\uFFFF')) ) {s = 26;}

                        else s = 120;

                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA13_24 = input.LA(1);

                        s = -1;
                        if ( (LA13_24=='D') ) {s = 57;}

                        else if ( (LA13_24=='A') ) {s = 58;}

                        else if ( ((LA13_24>='\u0000' && LA13_24<='/')||(LA13_24>=':' && LA13_24<='@')||(LA13_24>='[' && LA13_24<='^')||LA13_24=='`'||(LA13_24>='{' && LA13_24<='\uFFFF')) ) {s = 26;}

                        else if ( ((LA13_24>='0' && LA13_24<='9')||(LA13_24>='B' && LA13_24<='C')||(LA13_24>='E' && LA13_24<='Z')||LA13_24=='_'||(LA13_24>='a' && LA13_24<='z')) ) {s = 27;}

                        else s = 28;

                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA13_76 = input.LA(1);

                        s = -1;
                        if ( ((LA13_76>='\u0000' && LA13_76<='\t')||(LA13_76>='\u000B' && LA13_76<='\uFFFF')) ) {s = 26;}

                        else if ( (LA13_76=='\n') ) {s = 77;}

                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA13_18 = input.LA(1);

                        s = -1;
                        if ( (LA13_18==':') ) {s = 49;}

                        else if ( (LA13_18=='\\') ) {s = 50;}

                        else if ( ((LA13_18>='\u0000' && LA13_18<='&')||(LA13_18>='(' && LA13_18<='9')||(LA13_18>=';' && LA13_18<='[')||(LA13_18>=']' && LA13_18<='\uFFFF')) ) {s = 51;}

                        else if ( (LA13_18=='\'') ) {s = 52;}

                        else s = 42;

                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA13_52 = input.LA(1);

                        s = -1;
                        if ( ((LA13_52>='\u0000' && LA13_52<='\uFFFF')) ) {s = 26;}

                        else s = 66;

                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA13_111 = input.LA(1);

                        s = -1;
                        if ( ((LA13_111>='\u0000' && LA13_111<='\uFFFF')) ) {s = 26;}

                        else s = 117;

                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA13_10 = input.LA(1);

                        s = -1;
                        if ( ((LA13_10>='\u0000' && LA13_10<='\uFFFF')) ) {s = 26;}

                        else s = 37;

                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA13_57 = input.LA(1);

                        s = -1;
                        if ( ((LA13_57>='\u0000' && LA13_57<='/')||(LA13_57>=':' && LA13_57<='@')||(LA13_57>='[' && LA13_57<='^')||LA13_57=='`'||(LA13_57>='{' && LA13_57<='\uFFFF')) ) {s = 26;}

                        else if ( ((LA13_57>='0' && LA13_57<='9')||(LA13_57>='A' && LA13_57<='Z')||LA13_57=='_'||(LA13_57>='a' && LA13_57<='z')) ) {s = 27;}

                        else s = 79;

                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA13_109 = input.LA(1);

                        s = -1;
                        if ( (LA13_109=='{') ) {s = 115;}

                        else if ( ((LA13_109>='\u0000' && LA13_109<='z')||(LA13_109>='|' && LA13_109<='\uFFFF')) ) {s = 26;}

                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA13_27 = input.LA(1);

                        s = -1;
                        if ( ((LA13_27>='\u0000' && LA13_27<='/')||(LA13_27>=':' && LA13_27<='@')||(LA13_27>='[' && LA13_27<='^')||LA13_27=='`'||(LA13_27>='{' && LA13_27<='\uFFFF')) ) {s = 26;}

                        else if ( ((LA13_27>='0' && LA13_27<='9')||(LA13_27>='A' && LA13_27<='Z')||LA13_27=='_'||(LA13_27>='a' && LA13_27<='z')) ) {s = 27;}

                        else s = 28;

                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA13_34 = input.LA(1);

                        s = -1;
                        if ( (LA13_34=='F') ) {s = 64;}

                        else if ( ((LA13_34>='\u0000' && LA13_34<='/')||(LA13_34>=':' && LA13_34<='@')||(LA13_34>='[' && LA13_34<='^')||LA13_34=='`'||(LA13_34>='{' && LA13_34<='\uFFFF')) ) {s = 26;}

                        else if ( ((LA13_34>='0' && LA13_34<='9')||(LA13_34>='A' && LA13_34<='E')||(LA13_34>='G' && LA13_34<='Z')||LA13_34=='_'||(LA13_34>='a' && LA13_34<='z')) ) {s = 27;}

                        else s = 28;

                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA13_121 = input.LA(1);

                        s = -1;
                        if ( ((LA13_121>='\u0000' && LA13_121<='\uFFFF')) ) {s = 26;}

                        else s = 122;

                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA13_3 = input.LA(1);

                        s = -1;
                        if ( (LA13_3=='X') ) {s = 29;}

                        else if ( (LA13_3=='O') ) {s = 30;}

                        else if ( ((LA13_3>='\u0000' && LA13_3<='/')||(LA13_3>=':' && LA13_3<='@')||(LA13_3>='[' && LA13_3<='^')||LA13_3=='`'||(LA13_3>='{' && LA13_3<='\uFFFF')) ) {s = 26;}

                        else if ( ((LA13_3>='0' && LA13_3<='9')||(LA13_3>='A' && LA13_3<='N')||(LA13_3>='P' && LA13_3<='W')||(LA13_3>='Y' && LA13_3<='Z')||LA13_3=='_'||(LA13_3>='a' && LA13_3<='z')) ) {s = 27;}

                        else s = 28;

                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA13_64 = input.LA(1);

                        s = -1;
                        if ( (LA13_64=='A') ) {s = 86;}

                        else if ( (LA13_64=='I') ) {s = 87;}

                        else if ( ((LA13_64>='\u0000' && LA13_64<='/')||(LA13_64>=':' && LA13_64<='@')||(LA13_64>='[' && LA13_64<='^')||LA13_64=='`'||(LA13_64>='{' && LA13_64<='\uFFFF')) ) {s = 26;}

                        else if ( ((LA13_64>='0' && LA13_64<='9')||(LA13_64>='B' && LA13_64<='H')||(LA13_64>='J' && LA13_64<='Z')||LA13_64=='_'||(LA13_64>='a' && LA13_64<='z')) ) {s = 27;}

                        else s = 28;

                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA13_110 = input.LA(1);

                        s = -1;
                        if ( (LA13_110=='{') ) {s = 116;}

                        else if ( ((LA13_110>='\u0000' && LA13_110<='z')||(LA13_110>='|' && LA13_110<='\uFFFF')) ) {s = 26;}

                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA13_108 = input.LA(1);

                        s = -1;
                        if ( ((LA13_108>='\u0000' && LA13_108<='/')||(LA13_108>=':' && LA13_108<='@')||(LA13_108>='[' && LA13_108<='^')||LA13_108=='`'||(LA13_108>='{' && LA13_108<='\uFFFF')) ) {s = 26;}

                        else if ( ((LA13_108>='0' && LA13_108<='9')||(LA13_108>='A' && LA13_108<='Z')||LA13_108=='_'||(LA13_108>='a' && LA13_108<='z')) ) {s = 27;}

                        else s = 114;

                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA13_12 = input.LA(1);

                        s = -1;
                        if ( ((LA13_12>='\u0000' && LA13_12<='\uFFFF')) ) {s = 26;}

                        else s = 39;

                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA13_94 = input.LA(1);

                        s = -1;
                        if ( ((LA13_94>='\u0000' && LA13_94<='\uFFFF')) ) {s = 26;}

                        else s = 103;

                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA13_105 = input.LA(1);

                        s = -1;
                        if ( (LA13_105=='{') ) {s = 111;}

                        else if ( ((LA13_105>='\u0000' && LA13_105<='z')||(LA13_105>='|' && LA13_105<='\uFFFF')) ) {s = 26;}

                        if ( s>=0 ) return s;
                        break;
                    case 34 : 
                        int LA13_13 = input.LA(1);

                        s = -1;
                        if ( ((LA13_13>='\u0000' && LA13_13<='\uFFFF')) ) {s = 26;}

                        else s = 40;

                        if ( s>=0 ) return s;
                        break;
                    case 35 : 
                        int LA13_118 = input.LA(1);

                        s = -1;
                        if ( (LA13_118=='{') ) {s = 121;}

                        else if ( ((LA13_118>='\u0000' && LA13_118<='z')||(LA13_118>='|' && LA13_118<='\uFFFF')) ) {s = 26;}

                        if ( s>=0 ) return s;
                        break;
                    case 36 : 
                        int LA13_90 = input.LA(1);

                        s = -1;
                        if ( (LA13_90==':') ) {s = 71;}

                        else if ( (LA13_90=='*') ) {s = 72;}

                        else if ( ((LA13_90>='\u0000' && LA13_90<=')')||(LA13_90>='+' && LA13_90<='9')||(LA13_90>=';' && LA13_90<='\uFFFF')) ) {s = 73;}

                        else s = 89;

                        if ( s>=0 ) return s;
                        break;
                    case 37 : 
                        int LA13_83 = input.LA(1);

                        s = -1;
                        if ( (LA13_83=='{') ) {s = 94;}

                        else if ( ((LA13_83>='\u0000' && LA13_83<='z')||(LA13_83>='|' && LA13_83<='\uFFFF')) ) {s = 26;}

                        if ( s>=0 ) return s;
                        break;
                    case 38 : 
                        int LA13_44 = input.LA(1);

                        s = -1;
                        if ( ((LA13_44>='0' && LA13_44<='9')) ) {s = 44;}

                        else if ( ((LA13_44>='\u0000' && LA13_44<='/')||(LA13_44>=':' && LA13_44<='\uFFFF')) ) {s = 26;}

                        else s = 43;

                        if ( s>=0 ) return s;
                        break;
                    case 39 : 
                        int LA13_7 = input.LA(1);

                        s = -1;
                        if ( (LA13_7=='E') ) {s = 34;}

                        else if ( ((LA13_7>='\u0000' && LA13_7<='/')||(LA13_7>=':' && LA13_7<='@')||(LA13_7>='[' && LA13_7<='^')||LA13_7=='`'||(LA13_7>='{' && LA13_7<='\uFFFF')) ) {s = 26;}

                        else if ( ((LA13_7>='0' && LA13_7<='9')||(LA13_7>='A' && LA13_7<='D')||(LA13_7>='F' && LA13_7<='Z')||LA13_7=='_'||(LA13_7>='a' && LA13_7<='z')) ) {s = 27;}

                        else s = 28;

                        if ( s>=0 ) return s;
                        break;
                    case 40 : 
                        int LA13_15 = input.LA(1);

                        s = -1;
                        if ( ((LA13_15>='\u0000' && LA13_15<='/')||(LA13_15>=':' && LA13_15<='@')||(LA13_15>='[' && LA13_15<='^')||LA13_15=='`'||(LA13_15>='{' && LA13_15<='\uFFFF')) ) {s = 26;}

                        else if ( ((LA13_15>='0' && LA13_15<='9')||(LA13_15>='A' && LA13_15<='Z')||LA13_15=='_'||(LA13_15>='a' && LA13_15<='z')) ) {s = 27;}

                        else s = 28;

                        if ( s>=0 ) return s;
                        break;
                    case 41 : 
                        int LA13_21 = input.LA(1);

                        s = -1;
                        if ( ((LA13_21>='\u0000' && LA13_21<='\uFFFF')) ) {s = 26;}

                        else s = 42;

                        if ( s>=0 ) return s;
                        break;
                    case 42 : 
                        int LA13_17 = input.LA(1);

                        s = -1;
                        if ( (LA13_17==':') ) {s = 45;}

                        else if ( (LA13_17=='\\') ) {s = 46;}

                        else if ( ((LA13_17>='\u0000' && LA13_17<='!')||(LA13_17>='#' && LA13_17<='9')||(LA13_17>=';' && LA13_17<='[')||(LA13_17>=']' && LA13_17<='\uFFFF')) ) {s = 47;}

                        else if ( (LA13_17=='\"') ) {s = 48;}

                        else s = 42;

                        if ( s>=0 ) return s;
                        break;
                    case 43 : 
                        int LA13_77 = input.LA(1);

                        s = -1;
                        if ( ((LA13_77>='\u0000' && LA13_77<='\uFFFF')) ) {s = 26;}

                        else s = 78;

                        if ( s>=0 ) return s;
                        break;
                    case 44 : 
                        int LA13_25 = input.LA(1);

                        s = -1;
                        if ( (LA13_25=='A') ) {s = 59;}

                        else if ( ((LA13_25>='\u0000' && LA13_25<='/')||(LA13_25>=':' && LA13_25<='@')||(LA13_25>='[' && LA13_25<='^')||LA13_25=='`'||(LA13_25>='{' && LA13_25<='\uFFFF')) ) {s = 26;}

                        else if ( ((LA13_25>='0' && LA13_25<='9')||(LA13_25>='B' && LA13_25<='Z')||LA13_25=='_'||(LA13_25>='a' && LA13_25<='z')) ) {s = 27;}

                        else s = 28;

                        if ( s>=0 ) return s;
                        break;
                    case 45 : 
                        int LA13_59 = input.LA(1);

                        s = -1;
                        if ( (LA13_59=='N') ) {s = 81;}

                        else if ( ((LA13_59>='\u0000' && LA13_59<='/')||(LA13_59>=':' && LA13_59<='@')||(LA13_59>='[' && LA13_59<='^')||LA13_59=='`'||(LA13_59>='{' && LA13_59<='\uFFFF')) ) {s = 26;}

                        else if ( ((LA13_59>='0' && LA13_59<='9')||(LA13_59>='A' && LA13_59<='M')||(LA13_59>='O' && LA13_59<='Z')||LA13_59=='_'||(LA13_59>='a' && LA13_59<='z')) ) {s = 27;}

                        else s = 28;

                        if ( s>=0 ) return s;
                        break;
                    case 46 : 
                        int LA13_81 = input.LA(1);

                        s = -1;
                        if ( (LA13_81=='N') ) {s = 92;}

                        else if ( ((LA13_81>='\u0000' && LA13_81<='/')||(LA13_81>=':' && LA13_81<='@')||(LA13_81>='[' && LA13_81<='^')||LA13_81=='`'||(LA13_81>='{' && LA13_81<='\uFFFF')) ) {s = 26;}

                        else if ( ((LA13_81>='0' && LA13_81<='9')||(LA13_81>='A' && LA13_81<='M')||(LA13_81>='O' && LA13_81<='Z')||LA13_81=='_'||(LA13_81>='a' && LA13_81<='z')) ) {s = 27;}

                        else s = 28;

                        if ( s>=0 ) return s;
                        break;
                    case 47 : 
                        int LA13_92 = input.LA(1);

                        s = -1;
                        if ( (LA13_92=='E') ) {s = 101;}

                        else if ( ((LA13_92>='\u0000' && LA13_92<='/')||(LA13_92>=':' && LA13_92<='@')||(LA13_92>='[' && LA13_92<='^')||LA13_92=='`'||(LA13_92>='{' && LA13_92<='\uFFFF')) ) {s = 26;}

                        else if ( ((LA13_92>='0' && LA13_92<='9')||(LA13_92>='A' && LA13_92<='D')||(LA13_92>='F' && LA13_92<='Z')||LA13_92=='_'||(LA13_92>='a' && LA13_92<='z')) ) {s = 27;}

                        else s = 28;

                        if ( s>=0 ) return s;
                        break;
                    case 48 : 
                        int LA13_101 = input.LA(1);

                        s = -1;
                        if ( (LA13_101=='R') ) {s = 108;}

                        else if ( ((LA13_101>='\u0000' && LA13_101<='/')||(LA13_101>=':' && LA13_101<='@')||(LA13_101>='[' && LA13_101<='^')||LA13_101=='`'||(LA13_101>='{' && LA13_101<='\uFFFF')) ) {s = 26;}

                        else if ( ((LA13_101>='0' && LA13_101<='9')||(LA13_101>='A' && LA13_101<='Q')||(LA13_101>='S' && LA13_101<='Z')||LA13_101=='_'||(LA13_101>='a' && LA13_101<='z')) ) {s = 27;}

                        else s = 28;

                        if ( s>=0 ) return s;
                        break;
                    case 49 : 
                        int LA13_20 = input.LA(1);

                        s = -1;
                        if ( ((LA13_20>='\u0000' && LA13_20<='\b')||(LA13_20>='\u000B' && LA13_20<='\f')||(LA13_20>='\u000E' && LA13_20<='\u001F')||(LA13_20>='!' && LA13_20<='\uFFFF')) ) {s = 26;}

                        else if ( ((LA13_20>='\t' && LA13_20<='\n')||LA13_20=='\r'||LA13_20==' ') ) {s = 55;}

                        else s = 56;

                        if ( s>=0 ) return s;
                        break;
                    case 50 : 
                        int LA13_70 = input.LA(1);

                        s = -1;
                        if ( (LA13_70=='\'') ) {s = 52;}

                        else if ( (LA13_70=='\\') ) {s = 50;}

                        else if ( (LA13_70==':') ) {s = 49;}

                        else if ( ((LA13_70>='\u0000' && LA13_70<='&')||(LA13_70>='(' && LA13_70<='9')||(LA13_70>=';' && LA13_70<='[')||(LA13_70>=']' && LA13_70<='\uFFFF')) ) {s = 51;}

                        if ( s>=0 ) return s;
                        break;
                    case 51 : 
                        int LA13_2 = input.LA(1);

                        s = -1;
                        if ( (LA13_2=='T') ) {s = 24;}

                        else if ( (LA13_2=='C') ) {s = 25;}

                        else if ( ((LA13_2>='\u0000' && LA13_2<='/')||(LA13_2>=':' && LA13_2<='@')||(LA13_2>='[' && LA13_2<='^')||LA13_2=='`'||(LA13_2>='{' && LA13_2<='\uFFFF')) ) {s = 26;}

                        else if ( ((LA13_2>='0' && LA13_2<='9')||(LA13_2>='A' && LA13_2<='B')||(LA13_2>='D' && LA13_2<='S')||(LA13_2>='U' && LA13_2<='Z')||LA13_2=='_'||(LA13_2>='a' && LA13_2<='z')) ) {s = 27;}

                        else s = 28;

                        if ( s>=0 ) return s;
                        break;
                    case 52 : 
                        int LA13_29 = input.LA(1);

                        s = -1;
                        if ( (LA13_29=='P') ) {s = 60;}

                        else if ( ((LA13_29>='\u0000' && LA13_29<='/')||(LA13_29>=':' && LA13_29<='@')||(LA13_29>='[' && LA13_29<='^')||LA13_29=='`'||(LA13_29>='{' && LA13_29<='\uFFFF')) ) {s = 26;}

                        else if ( ((LA13_29>='0' && LA13_29<='9')||(LA13_29>='A' && LA13_29<='O')||(LA13_29>='Q' && LA13_29<='Z')||LA13_29=='_'||(LA13_29>='a' && LA13_29<='z')) ) {s = 27;}

                        else s = 28;

                        if ( s>=0 ) return s;
                        break;
                    case 53 : 
                        int LA13_60 = input.LA(1);

                        s = -1;
                        if ( (LA13_60=='O') ) {s = 82;}

                        else if ( ((LA13_60>='\u0000' && LA13_60<='/')||(LA13_60>=':' && LA13_60<='@')||(LA13_60>='[' && LA13_60<='^')||LA13_60=='`'||(LA13_60>='{' && LA13_60<='\uFFFF')) ) {s = 26;}

                        else if ( ((LA13_60>='0' && LA13_60<='9')||(LA13_60>='A' && LA13_60<='N')||(LA13_60>='P' && LA13_60<='Z')||LA13_60=='_'||(LA13_60>='a' && LA13_60<='z')) ) {s = 27;}

                        else s = 28;

                        if ( s>=0 ) return s;
                        break;
                    case 54 : 
                        int LA13_19 = input.LA(1);

                        s = -1;
                        if ( (LA13_19=='*') ) {s = 53;}

                        else if ( (LA13_19=='/') ) {s = 54;}

                        else if ( ((LA13_19>='\u0000' && LA13_19<=')')||(LA13_19>='+' && LA13_19<='.')||(LA13_19>='0' && LA13_19<='\uFFFF')) ) {s = 26;}

                        else s = 42;

                        if ( s>=0 ) return s;
                        break;
                    case 55 : 
                        int LA13_82 = input.LA(1);

                        s = -1;
                        if ( (LA13_82=='R') ) {s = 93;}

                        else if ( ((LA13_82>='\u0000' && LA13_82<='/')||(LA13_82>=':' && LA13_82<='@')||(LA13_82>='[' && LA13_82<='^')||LA13_82=='`'||(LA13_82>='{' && LA13_82<='\uFFFF')) ) {s = 26;}

                        else if ( ((LA13_82>='0' && LA13_82<='9')||(LA13_82>='A' && LA13_82<='Q')||(LA13_82>='S' && LA13_82<='Z')||LA13_82=='_'||(LA13_82>='a' && LA13_82<='z')) ) {s = 27;}

                        else s = 28;

                        if ( s>=0 ) return s;
                        break;
                    case 56 : 
                        int LA13_93 = input.LA(1);

                        s = -1;
                        if ( (LA13_93=='T') ) {s = 102;}

                        else if ( ((LA13_93>='\u0000' && LA13_93<='/')||(LA13_93>=':' && LA13_93<='@')||(LA13_93>='[' && LA13_93<='^')||LA13_93=='`'||(LA13_93>='{' && LA13_93<='\uFFFF')) ) {s = 26;}

                        else if ( ((LA13_93>='0' && LA13_93<='9')||(LA13_93>='A' && LA13_93<='S')||(LA13_93>='U' && LA13_93<='Z')||LA13_93=='_'||(LA13_93>='a' && LA13_93<='z')) ) {s = 27;}

                        else s = 28;

                        if ( s>=0 ) return s;
                        break;
                    case 57 : 
                        int LA13_51 = input.LA(1);

                        s = -1;
                        if ( (LA13_51==':') ) {s = 49;}

                        else if ( (LA13_51=='\'') ) {s = 52;}

                        else if ( (LA13_51=='\\') ) {s = 50;}

                        else if ( ((LA13_51>='\u0000' && LA13_51<='&')||(LA13_51>='(' && LA13_51<='9')||(LA13_51>=';' && LA13_51<='[')||(LA13_51>=']' && LA13_51<='\uFFFF')) ) {s = 51;}

                        if ( s>=0 ) return s;
                        break;
                    case 58 : 
                        int LA13_102 = input.LA(1);

                        s = -1;
                        if ( (LA13_102==' ') ) {s = 109;}

                        else if ( ((LA13_102>='\u0000' && LA13_102<='\u001F')||(LA13_102>='!' && LA13_102<='/')||(LA13_102>=':' && LA13_102<='@')||(LA13_102>='[' && LA13_102<='^')||LA13_102=='`'||(LA13_102>='{' && LA13_102<='\uFFFF')) ) {s = 26;}

                        else if ( ((LA13_102>='0' && LA13_102<='9')||(LA13_102>='A' && LA13_102<='Z')||LA13_102=='_'||(LA13_102>='a' && LA13_102<='z')) ) {s = 27;}

                        else s = 28;

                        if ( s>=0 ) return s;
                        break;
                    case 59 : 
                        int LA13_75 = input.LA(1);

                        s = -1;
                        if ( (LA13_75=='\r') ) {s = 76;}

                        else if ( (LA13_75=='\n') ) {s = 77;}

                        else if ( (LA13_75==':') ) {s = 74;}

                        else if ( ((LA13_75>='\u0000' && LA13_75<='\t')||(LA13_75>='\u000B' && LA13_75<='\f')||(LA13_75>='\u000E' && LA13_75<='9')||(LA13_75>=';' && LA13_75<='\uFFFF')) ) {s = 75;}

                        else s = 78;

                        if ( s>=0 ) return s;
                        break;
                    case 60 : 
                        int LA13_69 = input.LA(1);

                        s = -1;
                        if ( ((LA13_69>='\u0000' && LA13_69<='\uFFFF')) ) {s = 66;}

                        else s = 26;

                        if ( s>=0 ) return s;
                        break;
                    case 61 : 
                        int LA13_32 = input.LA(1);

                        s = -1;
                        if ( (LA13_32=='O') ) {s = 62;}

                        else if ( ((LA13_32>='\u0000' && LA13_32<='/')||(LA13_32>=':' && LA13_32<='@')||(LA13_32>='[' && LA13_32<='^')||LA13_32=='`'||(LA13_32>='{' && LA13_32<='\uFFFF')) ) {s = 26;}

                        else if ( ((LA13_32>='0' && LA13_32<='9')||(LA13_32>='A' && LA13_32<='N')||(LA13_32>='P' && LA13_32<='Z')||LA13_32=='_'||(LA13_32>='a' && LA13_32<='z')) ) {s = 27;}

                        else s = 28;

                        if ( s>=0 ) return s;
                        break;
                    case 62 : 
                        int LA13_62 = input.LA(1);

                        s = -1;
                        if ( (LA13_62=='B') ) {s = 84;}

                        else if ( ((LA13_62>='\u0000' && LA13_62<='/')||(LA13_62>=':' && LA13_62<='@')||(LA13_62>='[' && LA13_62<='^')||LA13_62=='`'||(LA13_62>='{' && LA13_62<='\uFFFF')) ) {s = 26;}

                        else if ( ((LA13_62>='0' && LA13_62<='9')||LA13_62=='A'||(LA13_62>='C' && LA13_62<='Z')||LA13_62=='_'||(LA13_62>='a' && LA13_62<='z')) ) {s = 27;}

                        else s = 28;

                        if ( s>=0 ) return s;
                        break;
                    case 63 : 
                        int LA13_84 = input.LA(1);

                        s = -1;
                        if ( (LA13_84=='A') ) {s = 95;}

                        else if ( ((LA13_84>='\u0000' && LA13_84<='/')||(LA13_84>=':' && LA13_84<='@')||(LA13_84>='[' && LA13_84<='^')||LA13_84=='`'||(LA13_84>='{' && LA13_84<='\uFFFF')) ) {s = 26;}

                        else if ( ((LA13_84>='0' && LA13_84<='9')||(LA13_84>='B' && LA13_84<='Z')||LA13_84=='_'||(LA13_84>='a' && LA13_84<='z')) ) {s = 27;}

                        else s = 28;

                        if ( s>=0 ) return s;
                        break;
                    case 64 : 
                        int LA13_95 = input.LA(1);

                        s = -1;
                        if ( (LA13_95=='L') ) {s = 104;}

                        else if ( ((LA13_95>='\u0000' && LA13_95<='/')||(LA13_95>=':' && LA13_95<='@')||(LA13_95>='[' && LA13_95<='^')||LA13_95=='`'||(LA13_95>='{' && LA13_95<='\uFFFF')) ) {s = 26;}

                        else if ( ((LA13_95>='0' && LA13_95<='9')||(LA13_95>='A' && LA13_95<='K')||(LA13_95>='M' && LA13_95<='Z')||LA13_95=='_'||(LA13_95>='a' && LA13_95<='z')) ) {s = 27;}

                        else s = 28;

                        if ( s>=0 ) return s;
                        break;
                    case 65 : 
                        int LA13_4 = input.LA(1);

                        s = -1;
                        if ( ((LA13_4>='\u0000' && LA13_4<='\uFFFF')) ) {s = 26;}

                        else s = 31;

                        if ( s>=0 ) return s;
                        break;
                    case 66 : 
                        int LA13_104 = input.LA(1);

                        s = -1;
                        if ( (LA13_104==' ') ) {s = 110;}

                        else if ( ((LA13_104>='\u0000' && LA13_104<='\u001F')||(LA13_104>='!' && LA13_104<='/')||(LA13_104>=':' && LA13_104<='@')||(LA13_104>='[' && LA13_104<='^')||LA13_104=='`'||(LA13_104>='{' && LA13_104<='\uFFFF')) ) {s = 26;}

                        else if ( ((LA13_104>='0' && LA13_104<='9')||(LA13_104>='A' && LA13_104<='Z')||LA13_104=='_'||(LA13_104>='a' && LA13_104<='z')) ) {s = 27;}

                        else s = 28;

                        if ( s>=0 ) return s;
                        break;
                    case 67 : 
                        int LA13_49 = input.LA(1);

                        s = -1;
                        if ( ((LA13_49>='\u0000' && LA13_49<='\uFFFF')) ) {s = 66;}

                        else s = 26;

                        if ( s>=0 ) return s;
                        break;
                    case 68 : 
                        int LA13_74 = input.LA(1);

                        s = -1;
                        if ( ((LA13_74>='\u0000' && LA13_74<='\uFFFF')) ) {s = 78;}

                        else s = 26;

                        if ( s>=0 ) return s;
                        break;
                    case 69 : 
                        int LA13_33 = input.LA(1);

                        s = -1;
                        if ( (LA13_33=='C') ) {s = 63;}

                        else if ( ((LA13_33>='\u0000' && LA13_33<='/')||(LA13_33>=':' && LA13_33<='@')||(LA13_33>='[' && LA13_33<='^')||LA13_33=='`'||(LA13_33>='{' && LA13_33<='\uFFFF')) ) {s = 26;}

                        else if ( ((LA13_33>='0' && LA13_33<='9')||(LA13_33>='A' && LA13_33<='B')||(LA13_33>='D' && LA13_33<='Z')||LA13_33=='_'||(LA13_33>='a' && LA13_33<='z')) ) {s = 27;}

                        else s = 28;

                        if ( s>=0 ) return s;
                        break;
                    case 70 : 
                        int LA13_63 = input.LA(1);

                        s = -1;
                        if ( (LA13_63=='A') ) {s = 85;}

                        else if ( ((LA13_63>='\u0000' && LA13_63<='/')||(LA13_63>=':' && LA13_63<='@')||(LA13_63>='[' && LA13_63<='^')||LA13_63=='`'||(LA13_63>='{' && LA13_63<='\uFFFF')) ) {s = 26;}

                        else if ( ((LA13_63>='0' && LA13_63<='9')||(LA13_63>='B' && LA13_63<='Z')||LA13_63=='_'||(LA13_63>='a' && LA13_63<='z')) ) {s = 27;}

                        else s = 28;

                        if ( s>=0 ) return s;
                        break;
                    case 71 : 
                        int LA13_85 = input.LA(1);

                        s = -1;
                        if ( (LA13_85=='L') ) {s = 96;}

                        else if ( ((LA13_85>='\u0000' && LA13_85<='/')||(LA13_85>=':' && LA13_85<='@')||(LA13_85>='[' && LA13_85<='^')||LA13_85=='`'||(LA13_85>='{' && LA13_85<='\uFFFF')) ) {s = 26;}

                        else if ( ((LA13_85>='0' && LA13_85<='9')||(LA13_85>='A' && LA13_85<='K')||(LA13_85>='M' && LA13_85<='Z')||LA13_85=='_'||(LA13_85>='a' && LA13_85<='z')) ) {s = 27;}

                        else s = 28;

                        if ( s>=0 ) return s;
                        break;
                    case 72 : 
                        int LA13_96 = input.LA(1);

                        s = -1;
                        if ( (LA13_96==' ') ) {s = 105;}

                        else if ( ((LA13_96>='\u0000' && LA13_96<='\u001F')||(LA13_96>='!' && LA13_96<='/')||(LA13_96>=':' && LA13_96<='@')||(LA13_96>='[' && LA13_96<='^')||LA13_96=='`'||(LA13_96>='{' && LA13_96<='\uFFFF')) ) {s = 26;}

                        else if ( ((LA13_96>='0' && LA13_96<='9')||(LA13_96>='A' && LA13_96<='Z')||LA13_96=='_'||(LA13_96>='a' && LA13_96<='z')) ) {s = 27;}

                        else s = 28;

                        if ( s>=0 ) return s;
                        break;
                    case 73 : 
                        int LA13_86 = input.LA(1);

                        s = -1;
                        if ( (LA13_86=='U') ) {s = 97;}

                        else if ( ((LA13_86>='\u0000' && LA13_86<='/')||(LA13_86>=':' && LA13_86<='@')||(LA13_86>='[' && LA13_86<='^')||LA13_86=='`'||(LA13_86>='{' && LA13_86<='\uFFFF')) ) {s = 26;}

                        else if ( ((LA13_86>='0' && LA13_86<='9')||(LA13_86>='A' && LA13_86<='T')||(LA13_86>='V' && LA13_86<='Z')||LA13_86=='_'||(LA13_86>='a' && LA13_86<='z')) ) {s = 27;}

                        else s = 28;

                        if ( s>=0 ) return s;
                        break;
                    case 74 : 
                        int LA13_97 = input.LA(1);

                        s = -1;
                        if ( (LA13_97=='L') ) {s = 106;}

                        else if ( ((LA13_97>='\u0000' && LA13_97<='/')||(LA13_97>=':' && LA13_97<='@')||(LA13_97>='[' && LA13_97<='^')||LA13_97=='`'||(LA13_97>='{' && LA13_97<='\uFFFF')) ) {s = 26;}

                        else if ( ((LA13_97>='0' && LA13_97<='9')||(LA13_97>='A' && LA13_97<='K')||(LA13_97>='M' && LA13_97<='Z')||LA13_97=='_'||(LA13_97>='a' && LA13_97<='z')) ) {s = 27;}

                        else s = 28;

                        if ( s>=0 ) return s;
                        break;
                    case 75 : 
                        int LA13_46 = input.LA(1);

                        s = -1;
                        if ( (LA13_46==':') ) {s = 67;}

                        else if ( ((LA13_46>='\u0000' && LA13_46<='9')||(LA13_46>=';' && LA13_46<='\uFFFF')) ) {s = 68;}

                        if ( s>=0 ) return s;
                        break;
                    case 76 : 
                        int LA13_106 = input.LA(1);

                        s = -1;
                        if ( (LA13_106=='T') ) {s = 112;}

                        else if ( ((LA13_106>='\u0000' && LA13_106<='/')||(LA13_106>=':' && LA13_106<='@')||(LA13_106>='[' && LA13_106<='^')||LA13_106=='`'||(LA13_106>='{' && LA13_106<='\uFFFF')) ) {s = 26;}

                        else if ( ((LA13_106>='0' && LA13_106<='9')||(LA13_106>='A' && LA13_106<='S')||(LA13_106>='U' && LA13_106<='Z')||LA13_106=='_'||(LA13_106>='a' && LA13_106<='z')) ) {s = 27;}

                        else s = 28;

                        if ( s>=0 ) return s;
                        break;
                    case 77 : 
                        int LA13_112 = input.LA(1);

                        s = -1;
                        if ( (LA13_112==' ') ) {s = 118;}

                        else if ( ((LA13_112>='\u0000' && LA13_112<='\u001F')||(LA13_112>='!' && LA13_112<='/')||(LA13_112>=':' && LA13_112<='@')||(LA13_112>='[' && LA13_112<='^')||LA13_112=='`'||(LA13_112>='{' && LA13_112<='\uFFFF')) ) {s = 26;}

                        else if ( ((LA13_112>='0' && LA13_112<='9')||(LA13_112>='A' && LA13_112<='Z')||LA13_112=='_'||(LA13_112>='a' && LA13_112<='z')) ) {s = 27;}

                        else s = 28;

                        if ( s>=0 ) return s;
                        break;
                    case 78 : 
                        int LA13_107 = input.LA(1);

                        s = -1;
                        if ( ((LA13_107>='\u0000' && LA13_107<='/')||(LA13_107>=':' && LA13_107<='@')||(LA13_107>='[' && LA13_107<='^')||LA13_107=='`'||(LA13_107>='{' && LA13_107<='\uFFFF')) ) {s = 26;}

                        else if ( ((LA13_107>='0' && LA13_107<='9')||(LA13_107>='A' && LA13_107<='Z')||LA13_107=='_'||(LA13_107>='a' && LA13_107<='z')) ) {s = 27;}

                        else s = 113;

                        if ( s>=0 ) return s;
                        break;
                    case 79 : 
                        int LA13_30 = input.LA(1);

                        s = -1;
                        if ( (LA13_30=='F') ) {s = 61;}

                        else if ( ((LA13_30>='\u0000' && LA13_30<='/')||(LA13_30>=':' && LA13_30<='@')||(LA13_30>='[' && LA13_30<='^')||LA13_30=='`'||(LA13_30>='{' && LA13_30<='\uFFFF')) ) {s = 26;}

                        else if ( ((LA13_30>='0' && LA13_30<='9')||(LA13_30>='A' && LA13_30<='E')||(LA13_30>='G' && LA13_30<='Z')||LA13_30=='_'||(LA13_30>='a' && LA13_30<='z')) ) {s = 27;}

                        else s = 28;

                        if ( s>=0 ) return s;
                        break;
                    case 80 : 
                        int LA13_61 = input.LA(1);

                        s = -1;
                        if ( (LA13_61==' ') ) {s = 83;}

                        else if ( ((LA13_61>='\u0000' && LA13_61<='\u001F')||(LA13_61>='!' && LA13_61<='/')||(LA13_61>=':' && LA13_61<='@')||(LA13_61>='[' && LA13_61<='^')||LA13_61=='`'||(LA13_61>='{' && LA13_61<='\uFFFF')) ) {s = 26;}

                        else if ( ((LA13_61>='0' && LA13_61<='9')||(LA13_61>='A' && LA13_61<='Z')||LA13_61=='_'||(LA13_61>='a' && LA13_61<='z')) ) {s = 27;}

                        else s = 28;

                        if ( s>=0 ) return s;
                        break;
                    case 81 : 
                        int LA13_54 = input.LA(1);

                        s = -1;
                        if ( (LA13_54==':') ) {s = 74;}

                        else if ( ((LA13_54>='\u0000' && LA13_54<='\t')||(LA13_54>='\u000B' && LA13_54<='\f')||(LA13_54>='\u000E' && LA13_54<='9')||(LA13_54>=';' && LA13_54<='\uFFFF')) ) {s = 75;}

                        else if ( (LA13_54=='\r') ) {s = 76;}

                        else if ( (LA13_54=='\n') ) {s = 77;}

                        else s = 78;

                        if ( s>=0 ) return s;
                        break;
                    case 82 : 
                        int LA13_87 = input.LA(1);

                        s = -1;
                        if ( (LA13_87=='N') ) {s = 98;}

                        else if ( ((LA13_87>='\u0000' && LA13_87<='/')||(LA13_87>=':' && LA13_87<='@')||(LA13_87>='[' && LA13_87<='^')||LA13_87=='`'||(LA13_87>='{' && LA13_87<='\uFFFF')) ) {s = 26;}

                        else if ( ((LA13_87>='0' && LA13_87<='9')||(LA13_87>='A' && LA13_87<='M')||(LA13_87>='O' && LA13_87<='Z')||LA13_87=='_'||(LA13_87>='a' && LA13_87<='z')) ) {s = 27;}

                        else s = 28;

                        if ( s>=0 ) return s;
                        break;
                    case 83 : 
                        int LA13_98 = input.LA(1);

                        s = -1;
                        if ( (LA13_98=='E') ) {s = 107;}

                        else if ( ((LA13_98>='\u0000' && LA13_98<='/')||(LA13_98>=':' && LA13_98<='@')||(LA13_98>='[' && LA13_98<='^')||LA13_98=='`'||(LA13_98>='{' && LA13_98<='\uFFFF')) ) {s = 26;}

                        else if ( ((LA13_98>='0' && LA13_98<='9')||(LA13_98>='A' && LA13_98<='D')||(LA13_98>='F' && LA13_98<='Z')||LA13_98=='_'||(LA13_98>='a' && LA13_98<='z')) ) {s = 27;}

                        else s = 28;

                        if ( s>=0 ) return s;
                        break;
                    case 84 : 
                        int LA13_50 = input.LA(1);

                        s = -1;
                        if ( (LA13_50==':') ) {s = 69;}

                        else if ( ((LA13_50>='\u0000' && LA13_50<='9')||(LA13_50>=';' && LA13_50<='\uFFFF')) ) {s = 70;}

                        if ( s>=0 ) return s;
                        break;
                    case 85 : 
                        int LA13_5 = input.LA(1);

                        s = -1;
                        if ( (LA13_5=='L') ) {s = 32;}

                        else if ( ((LA13_5>='\u0000' && LA13_5<='/')||(LA13_5>=':' && LA13_5<='@')||(LA13_5>='[' && LA13_5<='^')||LA13_5=='`'||(LA13_5>='{' && LA13_5<='\uFFFF')) ) {s = 26;}

                        else if ( ((LA13_5>='0' && LA13_5<='9')||(LA13_5>='A' && LA13_5<='K')||(LA13_5>='M' && LA13_5<='Z')||LA13_5=='_'||(LA13_5>='a' && LA13_5<='z')) ) {s = 27;}

                        else s = 28;

                        if ( s>=0 ) return s;
                        break;
                    case 86 : 
                        int LA13_41 = input.LA(1);

                        s = -1;
                        if ( ((LA13_41>='\u0000' && LA13_41<='/')||(LA13_41>=':' && LA13_41<='@')||(LA13_41>='[' && LA13_41<='^')||LA13_41=='`'||(LA13_41>='{' && LA13_41<='\uFFFF')) ) {s = 26;}

                        else if ( ((LA13_41>='0' && LA13_41<='9')||(LA13_41>='A' && LA13_41<='Z')||LA13_41=='_'||(LA13_41>='a' && LA13_41<='z')) ) {s = 27;}

                        else s = 28;

                        if ( s>=0 ) return s;
                        break;
                    case 87 : 
                        int LA13_6 = input.LA(1);

                        s = -1;
                        if ( (LA13_6=='O') ) {s = 33;}

                        else if ( ((LA13_6>='\u0000' && LA13_6<='/')||(LA13_6>=':' && LA13_6<='@')||(LA13_6>='[' && LA13_6<='^')||LA13_6=='`'||(LA13_6>='{' && LA13_6<='\uFFFF')) ) {s = 26;}

                        else if ( ((LA13_6>='0' && LA13_6<='9')||(LA13_6>='A' && LA13_6<='N')||(LA13_6>='P' && LA13_6<='Z')||LA13_6=='_'||(LA13_6>='a' && LA13_6<='z')) ) {s = 27;}

                        else s = 28;

                        if ( s>=0 ) return s;
                        break;
                    case 88 : 
                        int LA13_58 = input.LA(1);

                        s = -1;
                        if ( (LA13_58=='R') ) {s = 80;}

                        else if ( ((LA13_58>='\u0000' && LA13_58<='/')||(LA13_58>=':' && LA13_58<='@')||(LA13_58>='[' && LA13_58<='^')||LA13_58=='`'||(LA13_58>='{' && LA13_58<='\uFFFF')) ) {s = 26;}

                        else if ( ((LA13_58>='0' && LA13_58<='9')||(LA13_58>='A' && LA13_58<='Q')||(LA13_58>='S' && LA13_58<='Z')||LA13_58=='_'||(LA13_58>='a' && LA13_58<='z')) ) {s = 27;}

                        else s = 28;

                        if ( s>=0 ) return s;
                        break;
                    case 89 : 
                        int LA13_80 = input.LA(1);

                        s = -1;
                        if ( (LA13_80=='T') ) {s = 91;}

                        else if ( ((LA13_80>='\u0000' && LA13_80<='/')||(LA13_80>=':' && LA13_80<='@')||(LA13_80>='[' && LA13_80<='^')||LA13_80=='`'||(LA13_80>='{' && LA13_80<='\uFFFF')) ) {s = 26;}

                        else if ( ((LA13_80>='0' && LA13_80<='9')||(LA13_80>='A' && LA13_80<='S')||(LA13_80>='U' && LA13_80<='Z')||LA13_80=='_'||(LA13_80>='a' && LA13_80<='z')) ) {s = 27;}

                        else s = 28;

                        if ( s>=0 ) return s;
                        break;
                    case 90 : 
                        int LA13_38 = input.LA(1);

                        s = -1;
                        if ( (LA13_38=='L') ) {s = 65;}

                        else if ( ((LA13_38>='\u0000' && LA13_38<='/')||(LA13_38>=':' && LA13_38<='@')||(LA13_38>='[' && LA13_38<='^')||LA13_38=='`'||(LA13_38>='{' && LA13_38<='\uFFFF')) ) {s = 26;}

                        else if ( ((LA13_38>='0' && LA13_38<='9')||(LA13_38>='A' && LA13_38<='K')||(LA13_38>='M' && LA13_38<='Z')||LA13_38=='_'||(LA13_38>='a' && LA13_38<='z')) ) {s = 27;}

                        else s = 28;

                        if ( s>=0 ) return s;
                        break;
                    case 91 : 
                        int LA13_65 = input.LA(1);

                        s = -1;
                        if ( (LA13_65=='E') ) {s = 88;}

                        else if ( ((LA13_65>='\u0000' && LA13_65<='/')||(LA13_65>=':' && LA13_65<='@')||(LA13_65>='[' && LA13_65<='^')||LA13_65=='`'||(LA13_65>='{' && LA13_65<='\uFFFF')) ) {s = 26;}

                        else if ( ((LA13_65>='0' && LA13_65<='9')||(LA13_65>='A' && LA13_65<='D')||(LA13_65>='F' && LA13_65<='Z')||LA13_65=='_'||(LA13_65>='a' && LA13_65<='z')) ) {s = 27;}

                        else s = 28;

                        if ( s>=0 ) return s;
                        break;
                    case 92 : 
                        int LA13_91 = input.LA(1);

                        s = -1;
                        if ( ((LA13_91>='\u0000' && LA13_91<='/')||(LA13_91>=':' && LA13_91<='@')||(LA13_91>='[' && LA13_91<='^')||LA13_91=='`'||(LA13_91>='{' && LA13_91<='\uFFFF')) ) {s = 26;}

                        else if ( ((LA13_91>='0' && LA13_91<='9')||(LA13_91>='A' && LA13_91<='Z')||LA13_91=='_'||(LA13_91>='a' && LA13_91<='z')) ) {s = 27;}

                        else s = 100;

                        if ( s>=0 ) return s;
                        break;
                    case 93 : 
                        int LA13_55 = input.LA(1);

                        s = -1;
                        if ( ((LA13_55>='\u0000' && LA13_55<='\b')||(LA13_55>='\u000B' && LA13_55<='\f')||(LA13_55>='\u000E' && LA13_55<='\u001F')||(LA13_55>='!' && LA13_55<='\uFFFF')) ) {s = 26;}

                        else if ( ((LA13_55>='\t' && LA13_55<='\n')||LA13_55=='\r'||LA13_55==' ') ) {s = 55;}

                        else s = 56;

                        if ( s>=0 ) return s;
                        break;
                    case 94 : 
                        int LA13_0 = input.LA(1);

                        s = -1;
                        if ( (LA13_0==':') ) {s = 1;}

                        else if ( (LA13_0=='S') ) {s = 2;}

                        else if ( (LA13_0=='E') ) {s = 3;}

                        else if ( (LA13_0=='}') ) {s = 4;}

                        else if ( (LA13_0=='G') ) {s = 5;}

                        else if ( (LA13_0=='L') ) {s = 6;}

                        else if ( (LA13_0=='D') ) {s = 7;}

                        else if ( (LA13_0=='=') ) {s = 8;}

                        else if ( (LA13_0=='.') ) {s = 9;}

                        else if ( (LA13_0==',') ) {s = 10;}

                        else if ( (LA13_0=='R') ) {s = 11;}

                        else if ( (LA13_0=='{') ) {s = 12;}

                        else if ( (LA13_0=='#') ) {s = 13;}

                        else if ( (LA13_0=='^') ) {s = 14;}

                        else if ( ((LA13_0>='A' && LA13_0<='C')||LA13_0=='F'||(LA13_0>='H' && LA13_0<='K')||(LA13_0>='M' && LA13_0<='Q')||(LA13_0>='T' && LA13_0<='Z')||LA13_0=='_'||(LA13_0>='a' && LA13_0<='z')) ) {s = 15;}

                        else if ( ((LA13_0>='0' && LA13_0<='9')) ) {s = 16;}

                        else if ( (LA13_0=='\"') ) {s = 17;}

                        else if ( (LA13_0=='\'') ) {s = 18;}

                        else if ( (LA13_0=='/') ) {s = 19;}

                        else if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {s = 20;}

                        else if ( ((LA13_0>='\u0000' && LA13_0<='\b')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\u001F')||LA13_0=='!'||(LA13_0>='$' && LA13_0<='&')||(LA13_0>='(' && LA13_0<='+')||LA13_0=='-'||(LA13_0>=';' && LA13_0<='<')||(LA13_0>='>' && LA13_0<='@')||(LA13_0>='[' && LA13_0<=']')||LA13_0=='`'||LA13_0=='|'||(LA13_0>='~' && LA13_0<='\uFFFF')) ) {s = 21;}

                        if ( s>=0 ) return s;
                        break;
                    case 95 : 
                        int LA13_115 = input.LA(1);

                        s = -1;
                        if ( ((LA13_115>='\u0000' && LA13_115<='\uFFFF')) ) {s = 26;}

                        else s = 119;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 13, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}