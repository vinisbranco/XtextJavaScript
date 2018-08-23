package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

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
import org.xtext.example.mydsl.services.JavaScriptGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalJavaScriptParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'true'", "'false'", "'var'", "'='", "';'", "'+'", "'-'", "'.'"
    };
    public static final int RULE_ID=6;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=4;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int RULE_INT=5;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalJavaScriptParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalJavaScriptParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalJavaScriptParser.tokenNames; }
    public String getGrammarFileName() { return "InternalJavaScript.g"; }


    	private JavaScriptGrammarAccess grammarAccess;

    	public void setGrammarAccess(JavaScriptGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleJavaScript"
    // InternalJavaScript.g:53:1: entryRuleJavaScript : ruleJavaScript EOF ;
    public final void entryRuleJavaScript() throws RecognitionException {
        try {
            // InternalJavaScript.g:54:1: ( ruleJavaScript EOF )
            // InternalJavaScript.g:55:1: ruleJavaScript EOF
            {
             before(grammarAccess.getJavaScriptRule()); 
            pushFollow(FOLLOW_1);
            ruleJavaScript();

            state._fsp--;

             after(grammarAccess.getJavaScriptRule()); 
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
    // $ANTLR end "entryRuleJavaScript"


    // $ANTLR start "ruleJavaScript"
    // InternalJavaScript.g:62:1: ruleJavaScript : ( ( rule__JavaScript__Group__0 ) ) ;
    public final void ruleJavaScript() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaScript.g:66:2: ( ( ( rule__JavaScript__Group__0 ) ) )
            // InternalJavaScript.g:67:2: ( ( rule__JavaScript__Group__0 ) )
            {
            // InternalJavaScript.g:67:2: ( ( rule__JavaScript__Group__0 ) )
            // InternalJavaScript.g:68:3: ( rule__JavaScript__Group__0 )
            {
             before(grammarAccess.getJavaScriptAccess().getGroup()); 
            // InternalJavaScript.g:69:3: ( rule__JavaScript__Group__0 )
            // InternalJavaScript.g:69:4: rule__JavaScript__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__JavaScript__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getJavaScriptAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleJavaScript"


    // $ANTLR start "entryRuleelems"
    // InternalJavaScript.g:78:1: entryRuleelems : ruleelems EOF ;
    public final void entryRuleelems() throws RecognitionException {
        try {
            // InternalJavaScript.g:79:1: ( ruleelems EOF )
            // InternalJavaScript.g:80:1: ruleelems EOF
            {
             before(grammarAccess.getElemsRule()); 
            pushFollow(FOLLOW_1);
            ruleelems();

            state._fsp--;

             after(grammarAccess.getElemsRule()); 
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
    // $ANTLR end "entryRuleelems"


    // $ANTLR start "ruleelems"
    // InternalJavaScript.g:87:1: ruleelems : ( ( rule__Elems__Alternatives ) ) ;
    public final void ruleelems() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaScript.g:91:2: ( ( ( rule__Elems__Alternatives ) ) )
            // InternalJavaScript.g:92:2: ( ( rule__Elems__Alternatives ) )
            {
            // InternalJavaScript.g:92:2: ( ( rule__Elems__Alternatives ) )
            // InternalJavaScript.g:93:3: ( rule__Elems__Alternatives )
            {
             before(grammarAccess.getElemsAccess().getAlternatives()); 
            // InternalJavaScript.g:94:3: ( rule__Elems__Alternatives )
            // InternalJavaScript.g:94:4: rule__Elems__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Elems__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getElemsAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleelems"


    // $ANTLR start "entryRuleOps"
    // InternalJavaScript.g:103:1: entryRuleOps : ruleOps EOF ;
    public final void entryRuleOps() throws RecognitionException {
        try {
            // InternalJavaScript.g:104:1: ( ruleOps EOF )
            // InternalJavaScript.g:105:1: ruleOps EOF
            {
             before(grammarAccess.getOpsRule()); 
            pushFollow(FOLLOW_1);
            ruleOps();

            state._fsp--;

             after(grammarAccess.getOpsRule()); 
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
    // $ANTLR end "entryRuleOps"


    // $ANTLR start "ruleOps"
    // InternalJavaScript.g:112:1: ruleOps : ( ( rule__Ops__Alternatives ) ) ;
    public final void ruleOps() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaScript.g:116:2: ( ( ( rule__Ops__Alternatives ) ) )
            // InternalJavaScript.g:117:2: ( ( rule__Ops__Alternatives ) )
            {
            // InternalJavaScript.g:117:2: ( ( rule__Ops__Alternatives ) )
            // InternalJavaScript.g:118:3: ( rule__Ops__Alternatives )
            {
             before(grammarAccess.getOpsAccess().getAlternatives()); 
            // InternalJavaScript.g:119:3: ( rule__Ops__Alternatives )
            // InternalJavaScript.g:119:4: rule__Ops__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Ops__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOpsAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOps"


    // $ANTLR start "entryRulefuncs"
    // InternalJavaScript.g:128:1: entryRulefuncs : rulefuncs EOF ;
    public final void entryRulefuncs() throws RecognitionException {
        try {
            // InternalJavaScript.g:129:1: ( rulefuncs EOF )
            // InternalJavaScript.g:130:1: rulefuncs EOF
            {
             before(grammarAccess.getFuncsRule()); 
            pushFollow(FOLLOW_1);
            rulefuncs();

            state._fsp--;

             after(grammarAccess.getFuncsRule()); 
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
    // $ANTLR end "entryRulefuncs"


    // $ANTLR start "rulefuncs"
    // InternalJavaScript.g:137:1: rulefuncs : ( ( rule__Funcs__Alternatives ) ) ;
    public final void rulefuncs() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaScript.g:141:2: ( ( ( rule__Funcs__Alternatives ) ) )
            // InternalJavaScript.g:142:2: ( ( rule__Funcs__Alternatives ) )
            {
            // InternalJavaScript.g:142:2: ( ( rule__Funcs__Alternatives ) )
            // InternalJavaScript.g:143:3: ( rule__Funcs__Alternatives )
            {
             before(grammarAccess.getFuncsAccess().getAlternatives()); 
            // InternalJavaScript.g:144:3: ( rule__Funcs__Alternatives )
            // InternalJavaScript.g:144:4: rule__Funcs__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Funcs__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFuncsAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulefuncs"


    // $ANTLR start "entryRuleBoolean"
    // InternalJavaScript.g:153:1: entryRuleBoolean : ruleBoolean EOF ;
    public final void entryRuleBoolean() throws RecognitionException {
        try {
            // InternalJavaScript.g:154:1: ( ruleBoolean EOF )
            // InternalJavaScript.g:155:1: ruleBoolean EOF
            {
             before(grammarAccess.getBooleanRule()); 
            pushFollow(FOLLOW_1);
            ruleBoolean();

            state._fsp--;

             after(grammarAccess.getBooleanRule()); 
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
    // $ANTLR end "entryRuleBoolean"


    // $ANTLR start "ruleBoolean"
    // InternalJavaScript.g:162:1: ruleBoolean : ( ( rule__Boolean__Alternatives ) ) ;
    public final void ruleBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaScript.g:166:2: ( ( ( rule__Boolean__Alternatives ) ) )
            // InternalJavaScript.g:167:2: ( ( rule__Boolean__Alternatives ) )
            {
            // InternalJavaScript.g:167:2: ( ( rule__Boolean__Alternatives ) )
            // InternalJavaScript.g:168:3: ( rule__Boolean__Alternatives )
            {
             before(grammarAccess.getBooleanAccess().getAlternatives()); 
            // InternalJavaScript.g:169:3: ( rule__Boolean__Alternatives )
            // InternalJavaScript.g:169:4: rule__Boolean__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Boolean__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBooleanAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBoolean"


    // $ANTLR start "rule__Elems__Alternatives"
    // InternalJavaScript.g:177:1: rule__Elems__Alternatives : ( ( ( rule__Elems__ElementsAssignment_0 ) ) | ( ( rule__Elems__ElementsAssignment_1 ) ) | ( ( rule__Elems__ElementsAssignment_2 ) ) );
    public final void rule__Elems__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaScript.g:181:1: ( ( ( rule__Elems__ElementsAssignment_0 ) ) | ( ( rule__Elems__ElementsAssignment_1 ) ) | ( ( rule__Elems__ElementsAssignment_2 ) ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt1=1;
                }
                break;
            case RULE_INT:
                {
                int LA1_2 = input.LA(2);

                if ( ((LA1_2>=16 && LA1_2<=17)) ) {
                    alt1=3;
                }
                else if ( (LA1_2==EOF||LA1_2==15||LA1_2==18) ) {
                    alt1=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 2, input);

                    throw nvae;
                }
                }
                break;
            case 11:
            case 12:
                {
                alt1=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalJavaScript.g:182:2: ( ( rule__Elems__ElementsAssignment_0 ) )
                    {
                    // InternalJavaScript.g:182:2: ( ( rule__Elems__ElementsAssignment_0 ) )
                    // InternalJavaScript.g:183:3: ( rule__Elems__ElementsAssignment_0 )
                    {
                     before(grammarAccess.getElemsAccess().getElementsAssignment_0()); 
                    // InternalJavaScript.g:184:3: ( rule__Elems__ElementsAssignment_0 )
                    // InternalJavaScript.g:184:4: rule__Elems__ElementsAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Elems__ElementsAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getElemsAccess().getElementsAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalJavaScript.g:188:2: ( ( rule__Elems__ElementsAssignment_1 ) )
                    {
                    // InternalJavaScript.g:188:2: ( ( rule__Elems__ElementsAssignment_1 ) )
                    // InternalJavaScript.g:189:3: ( rule__Elems__ElementsAssignment_1 )
                    {
                     before(grammarAccess.getElemsAccess().getElementsAssignment_1()); 
                    // InternalJavaScript.g:190:3: ( rule__Elems__ElementsAssignment_1 )
                    // InternalJavaScript.g:190:4: rule__Elems__ElementsAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Elems__ElementsAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getElemsAccess().getElementsAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalJavaScript.g:194:2: ( ( rule__Elems__ElementsAssignment_2 ) )
                    {
                    // InternalJavaScript.g:194:2: ( ( rule__Elems__ElementsAssignment_2 ) )
                    // InternalJavaScript.g:195:3: ( rule__Elems__ElementsAssignment_2 )
                    {
                     before(grammarAccess.getElemsAccess().getElementsAssignment_2()); 
                    // InternalJavaScript.g:196:3: ( rule__Elems__ElementsAssignment_2 )
                    // InternalJavaScript.g:196:4: rule__Elems__ElementsAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Elems__ElementsAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getElemsAccess().getElementsAssignment_2()); 

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
    // $ANTLR end "rule__Elems__Alternatives"


    // $ANTLR start "rule__Ops__Alternatives"
    // InternalJavaScript.g:204:1: rule__Ops__Alternatives : ( ( ( rule__Ops__Group_0__0 ) ) | ( ( rule__Ops__Group_1__0 ) ) );
    public final void rule__Ops__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaScript.g:208:1: ( ( ( rule__Ops__Group_0__0 ) ) | ( ( rule__Ops__Group_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_INT) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==16) ) {
                    alt2=1;
                }
                else if ( (LA2_1==17) ) {
                    alt2=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalJavaScript.g:209:2: ( ( rule__Ops__Group_0__0 ) )
                    {
                    // InternalJavaScript.g:209:2: ( ( rule__Ops__Group_0__0 ) )
                    // InternalJavaScript.g:210:3: ( rule__Ops__Group_0__0 )
                    {
                     before(grammarAccess.getOpsAccess().getGroup_0()); 
                    // InternalJavaScript.g:211:3: ( rule__Ops__Group_0__0 )
                    // InternalJavaScript.g:211:4: rule__Ops__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Ops__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getOpsAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalJavaScript.g:215:2: ( ( rule__Ops__Group_1__0 ) )
                    {
                    // InternalJavaScript.g:215:2: ( ( rule__Ops__Group_1__0 ) )
                    // InternalJavaScript.g:216:3: ( rule__Ops__Group_1__0 )
                    {
                     before(grammarAccess.getOpsAccess().getGroup_1()); 
                    // InternalJavaScript.g:217:3: ( rule__Ops__Group_1__0 )
                    // InternalJavaScript.g:217:4: rule__Ops__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Ops__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getOpsAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Ops__Alternatives"


    // $ANTLR start "rule__Funcs__Alternatives"
    // InternalJavaScript.g:225:1: rule__Funcs__Alternatives : ( ( RULE_STRING ) | ( RULE_INT ) | ( ( rule__Funcs__Group_2__0 ) ) );
    public final void rule__Funcs__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaScript.g:229:1: ( ( RULE_STRING ) | ( RULE_INT ) | ( ( rule__Funcs__Group_2__0 ) ) )
            int alt3=3;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_INT) ) {
                int LA3_2 = input.LA(2);

                if ( (LA3_2==EOF||LA3_2==15) ) {
                    alt3=2;
                }
                else if ( (LA3_2==18) ) {
                    alt3=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalJavaScript.g:230:2: ( RULE_STRING )
                    {
                    // InternalJavaScript.g:230:2: ( RULE_STRING )
                    // InternalJavaScript.g:231:3: RULE_STRING
                    {
                     before(grammarAccess.getFuncsAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getFuncsAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalJavaScript.g:236:2: ( RULE_INT )
                    {
                    // InternalJavaScript.g:236:2: ( RULE_INT )
                    // InternalJavaScript.g:237:3: RULE_INT
                    {
                     before(grammarAccess.getFuncsAccess().getINTTerminalRuleCall_1()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getFuncsAccess().getINTTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalJavaScript.g:242:2: ( ( rule__Funcs__Group_2__0 ) )
                    {
                    // InternalJavaScript.g:242:2: ( ( rule__Funcs__Group_2__0 ) )
                    // InternalJavaScript.g:243:3: ( rule__Funcs__Group_2__0 )
                    {
                     before(grammarAccess.getFuncsAccess().getGroup_2()); 
                    // InternalJavaScript.g:244:3: ( rule__Funcs__Group_2__0 )
                    // InternalJavaScript.g:244:4: rule__Funcs__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Funcs__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFuncsAccess().getGroup_2()); 

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
    // $ANTLR end "rule__Funcs__Alternatives"


    // $ANTLR start "rule__Boolean__Alternatives"
    // InternalJavaScript.g:252:1: rule__Boolean__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__Boolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaScript.g:256:1: ( ( 'true' ) | ( 'false' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==11) ) {
                alt4=1;
            }
            else if ( (LA4_0==12) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalJavaScript.g:257:2: ( 'true' )
                    {
                    // InternalJavaScript.g:257:2: ( 'true' )
                    // InternalJavaScript.g:258:3: 'true'
                    {
                     before(grammarAccess.getBooleanAccess().getTrueKeyword_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getBooleanAccess().getTrueKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalJavaScript.g:263:2: ( 'false' )
                    {
                    // InternalJavaScript.g:263:2: ( 'false' )
                    // InternalJavaScript.g:264:3: 'false'
                    {
                     before(grammarAccess.getBooleanAccess().getFalseKeyword_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getBooleanAccess().getFalseKeyword_1()); 

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
    // $ANTLR end "rule__Boolean__Alternatives"


    // $ANTLR start "rule__JavaScript__Group__0"
    // InternalJavaScript.g:273:1: rule__JavaScript__Group__0 : rule__JavaScript__Group__0__Impl rule__JavaScript__Group__1 ;
    public final void rule__JavaScript__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaScript.g:277:1: ( rule__JavaScript__Group__0__Impl rule__JavaScript__Group__1 )
            // InternalJavaScript.g:278:2: rule__JavaScript__Group__0__Impl rule__JavaScript__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__JavaScript__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JavaScript__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JavaScript__Group__0"


    // $ANTLR start "rule__JavaScript__Group__0__Impl"
    // InternalJavaScript.g:285:1: rule__JavaScript__Group__0__Impl : ( 'var' ) ;
    public final void rule__JavaScript__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaScript.g:289:1: ( ( 'var' ) )
            // InternalJavaScript.g:290:1: ( 'var' )
            {
            // InternalJavaScript.g:290:1: ( 'var' )
            // InternalJavaScript.g:291:2: 'var'
            {
             before(grammarAccess.getJavaScriptAccess().getVarKeyword_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getJavaScriptAccess().getVarKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JavaScript__Group__0__Impl"


    // $ANTLR start "rule__JavaScript__Group__1"
    // InternalJavaScript.g:300:1: rule__JavaScript__Group__1 : rule__JavaScript__Group__1__Impl rule__JavaScript__Group__2 ;
    public final void rule__JavaScript__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaScript.g:304:1: ( rule__JavaScript__Group__1__Impl rule__JavaScript__Group__2 )
            // InternalJavaScript.g:305:2: rule__JavaScript__Group__1__Impl rule__JavaScript__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__JavaScript__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JavaScript__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JavaScript__Group__1"


    // $ANTLR start "rule__JavaScript__Group__1__Impl"
    // InternalJavaScript.g:312:1: rule__JavaScript__Group__1__Impl : ( ( rule__JavaScript__NameAssignment_1 ) ) ;
    public final void rule__JavaScript__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaScript.g:316:1: ( ( ( rule__JavaScript__NameAssignment_1 ) ) )
            // InternalJavaScript.g:317:1: ( ( rule__JavaScript__NameAssignment_1 ) )
            {
            // InternalJavaScript.g:317:1: ( ( rule__JavaScript__NameAssignment_1 ) )
            // InternalJavaScript.g:318:2: ( rule__JavaScript__NameAssignment_1 )
            {
             before(grammarAccess.getJavaScriptAccess().getNameAssignment_1()); 
            // InternalJavaScript.g:319:2: ( rule__JavaScript__NameAssignment_1 )
            // InternalJavaScript.g:319:3: rule__JavaScript__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__JavaScript__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getJavaScriptAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JavaScript__Group__1__Impl"


    // $ANTLR start "rule__JavaScript__Group__2"
    // InternalJavaScript.g:327:1: rule__JavaScript__Group__2 : rule__JavaScript__Group__2__Impl rule__JavaScript__Group__3 ;
    public final void rule__JavaScript__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaScript.g:331:1: ( rule__JavaScript__Group__2__Impl rule__JavaScript__Group__3 )
            // InternalJavaScript.g:332:2: rule__JavaScript__Group__2__Impl rule__JavaScript__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__JavaScript__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JavaScript__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JavaScript__Group__2"


    // $ANTLR start "rule__JavaScript__Group__2__Impl"
    // InternalJavaScript.g:339:1: rule__JavaScript__Group__2__Impl : ( '=' ) ;
    public final void rule__JavaScript__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaScript.g:343:1: ( ( '=' ) )
            // InternalJavaScript.g:344:1: ( '=' )
            {
            // InternalJavaScript.g:344:1: ( '=' )
            // InternalJavaScript.g:345:2: '='
            {
             before(grammarAccess.getJavaScriptAccess().getEqualsSignKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getJavaScriptAccess().getEqualsSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JavaScript__Group__2__Impl"


    // $ANTLR start "rule__JavaScript__Group__3"
    // InternalJavaScript.g:354:1: rule__JavaScript__Group__3 : rule__JavaScript__Group__3__Impl rule__JavaScript__Group__4 ;
    public final void rule__JavaScript__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaScript.g:358:1: ( rule__JavaScript__Group__3__Impl rule__JavaScript__Group__4 )
            // InternalJavaScript.g:359:2: rule__JavaScript__Group__3__Impl rule__JavaScript__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__JavaScript__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JavaScript__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JavaScript__Group__3"


    // $ANTLR start "rule__JavaScript__Group__3__Impl"
    // InternalJavaScript.g:366:1: rule__JavaScript__Group__3__Impl : ( ( rule__JavaScript__ElementsAssignment_3 ) ) ;
    public final void rule__JavaScript__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaScript.g:370:1: ( ( ( rule__JavaScript__ElementsAssignment_3 ) ) )
            // InternalJavaScript.g:371:1: ( ( rule__JavaScript__ElementsAssignment_3 ) )
            {
            // InternalJavaScript.g:371:1: ( ( rule__JavaScript__ElementsAssignment_3 ) )
            // InternalJavaScript.g:372:2: ( rule__JavaScript__ElementsAssignment_3 )
            {
             before(grammarAccess.getJavaScriptAccess().getElementsAssignment_3()); 
            // InternalJavaScript.g:373:2: ( rule__JavaScript__ElementsAssignment_3 )
            // InternalJavaScript.g:373:3: rule__JavaScript__ElementsAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__JavaScript__ElementsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getJavaScriptAccess().getElementsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JavaScript__Group__3__Impl"


    // $ANTLR start "rule__JavaScript__Group__4"
    // InternalJavaScript.g:381:1: rule__JavaScript__Group__4 : rule__JavaScript__Group__4__Impl ;
    public final void rule__JavaScript__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaScript.g:385:1: ( rule__JavaScript__Group__4__Impl )
            // InternalJavaScript.g:386:2: rule__JavaScript__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__JavaScript__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JavaScript__Group__4"


    // $ANTLR start "rule__JavaScript__Group__4__Impl"
    // InternalJavaScript.g:392:1: rule__JavaScript__Group__4__Impl : ( ';' ) ;
    public final void rule__JavaScript__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaScript.g:396:1: ( ( ';' ) )
            // InternalJavaScript.g:397:1: ( ';' )
            {
            // InternalJavaScript.g:397:1: ( ';' )
            // InternalJavaScript.g:398:2: ';'
            {
             before(grammarAccess.getJavaScriptAccess().getSemicolonKeyword_4()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getJavaScriptAccess().getSemicolonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JavaScript__Group__4__Impl"


    // $ANTLR start "rule__Ops__Group_0__0"
    // InternalJavaScript.g:408:1: rule__Ops__Group_0__0 : rule__Ops__Group_0__0__Impl rule__Ops__Group_0__1 ;
    public final void rule__Ops__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaScript.g:412:1: ( rule__Ops__Group_0__0__Impl rule__Ops__Group_0__1 )
            // InternalJavaScript.g:413:2: rule__Ops__Group_0__0__Impl rule__Ops__Group_0__1
            {
            pushFollow(FOLLOW_7);
            rule__Ops__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ops__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ops__Group_0__0"


    // $ANTLR start "rule__Ops__Group_0__0__Impl"
    // InternalJavaScript.g:420:1: rule__Ops__Group_0__0__Impl : ( RULE_INT ) ;
    public final void rule__Ops__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaScript.g:424:1: ( ( RULE_INT ) )
            // InternalJavaScript.g:425:1: ( RULE_INT )
            {
            // InternalJavaScript.g:425:1: ( RULE_INT )
            // InternalJavaScript.g:426:2: RULE_INT
            {
             before(grammarAccess.getOpsAccess().getINTTerminalRuleCall_0_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getOpsAccess().getINTTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ops__Group_0__0__Impl"


    // $ANTLR start "rule__Ops__Group_0__1"
    // InternalJavaScript.g:435:1: rule__Ops__Group_0__1 : rule__Ops__Group_0__1__Impl rule__Ops__Group_0__2 ;
    public final void rule__Ops__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaScript.g:439:1: ( rule__Ops__Group_0__1__Impl rule__Ops__Group_0__2 )
            // InternalJavaScript.g:440:2: rule__Ops__Group_0__1__Impl rule__Ops__Group_0__2
            {
            pushFollow(FOLLOW_8);
            rule__Ops__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ops__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ops__Group_0__1"


    // $ANTLR start "rule__Ops__Group_0__1__Impl"
    // InternalJavaScript.g:447:1: rule__Ops__Group_0__1__Impl : ( '+' ) ;
    public final void rule__Ops__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaScript.g:451:1: ( ( '+' ) )
            // InternalJavaScript.g:452:1: ( '+' )
            {
            // InternalJavaScript.g:452:1: ( '+' )
            // InternalJavaScript.g:453:2: '+'
            {
             before(grammarAccess.getOpsAccess().getPlusSignKeyword_0_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getOpsAccess().getPlusSignKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ops__Group_0__1__Impl"


    // $ANTLR start "rule__Ops__Group_0__2"
    // InternalJavaScript.g:462:1: rule__Ops__Group_0__2 : rule__Ops__Group_0__2__Impl ;
    public final void rule__Ops__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaScript.g:466:1: ( rule__Ops__Group_0__2__Impl )
            // InternalJavaScript.g:467:2: rule__Ops__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Ops__Group_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ops__Group_0__2"


    // $ANTLR start "rule__Ops__Group_0__2__Impl"
    // InternalJavaScript.g:473:1: rule__Ops__Group_0__2__Impl : ( RULE_INT ) ;
    public final void rule__Ops__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaScript.g:477:1: ( ( RULE_INT ) )
            // InternalJavaScript.g:478:1: ( RULE_INT )
            {
            // InternalJavaScript.g:478:1: ( RULE_INT )
            // InternalJavaScript.g:479:2: RULE_INT
            {
             before(grammarAccess.getOpsAccess().getINTTerminalRuleCall_0_2()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getOpsAccess().getINTTerminalRuleCall_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ops__Group_0__2__Impl"


    // $ANTLR start "rule__Ops__Group_1__0"
    // InternalJavaScript.g:489:1: rule__Ops__Group_1__0 : rule__Ops__Group_1__0__Impl rule__Ops__Group_1__1 ;
    public final void rule__Ops__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaScript.g:493:1: ( rule__Ops__Group_1__0__Impl rule__Ops__Group_1__1 )
            // InternalJavaScript.g:494:2: rule__Ops__Group_1__0__Impl rule__Ops__Group_1__1
            {
            pushFollow(FOLLOW_9);
            rule__Ops__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ops__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ops__Group_1__0"


    // $ANTLR start "rule__Ops__Group_1__0__Impl"
    // InternalJavaScript.g:501:1: rule__Ops__Group_1__0__Impl : ( RULE_INT ) ;
    public final void rule__Ops__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaScript.g:505:1: ( ( RULE_INT ) )
            // InternalJavaScript.g:506:1: ( RULE_INT )
            {
            // InternalJavaScript.g:506:1: ( RULE_INT )
            // InternalJavaScript.g:507:2: RULE_INT
            {
             before(grammarAccess.getOpsAccess().getINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getOpsAccess().getINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ops__Group_1__0__Impl"


    // $ANTLR start "rule__Ops__Group_1__1"
    // InternalJavaScript.g:516:1: rule__Ops__Group_1__1 : rule__Ops__Group_1__1__Impl rule__Ops__Group_1__2 ;
    public final void rule__Ops__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaScript.g:520:1: ( rule__Ops__Group_1__1__Impl rule__Ops__Group_1__2 )
            // InternalJavaScript.g:521:2: rule__Ops__Group_1__1__Impl rule__Ops__Group_1__2
            {
            pushFollow(FOLLOW_8);
            rule__Ops__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ops__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ops__Group_1__1"


    // $ANTLR start "rule__Ops__Group_1__1__Impl"
    // InternalJavaScript.g:528:1: rule__Ops__Group_1__1__Impl : ( '-' ) ;
    public final void rule__Ops__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaScript.g:532:1: ( ( '-' ) )
            // InternalJavaScript.g:533:1: ( '-' )
            {
            // InternalJavaScript.g:533:1: ( '-' )
            // InternalJavaScript.g:534:2: '-'
            {
             before(grammarAccess.getOpsAccess().getHyphenMinusKeyword_1_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getOpsAccess().getHyphenMinusKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ops__Group_1__1__Impl"


    // $ANTLR start "rule__Ops__Group_1__2"
    // InternalJavaScript.g:543:1: rule__Ops__Group_1__2 : rule__Ops__Group_1__2__Impl ;
    public final void rule__Ops__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaScript.g:547:1: ( rule__Ops__Group_1__2__Impl )
            // InternalJavaScript.g:548:2: rule__Ops__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Ops__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ops__Group_1__2"


    // $ANTLR start "rule__Ops__Group_1__2__Impl"
    // InternalJavaScript.g:554:1: rule__Ops__Group_1__2__Impl : ( RULE_INT ) ;
    public final void rule__Ops__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaScript.g:558:1: ( ( RULE_INT ) )
            // InternalJavaScript.g:559:1: ( RULE_INT )
            {
            // InternalJavaScript.g:559:1: ( RULE_INT )
            // InternalJavaScript.g:560:2: RULE_INT
            {
             before(grammarAccess.getOpsAccess().getINTTerminalRuleCall_1_2()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getOpsAccess().getINTTerminalRuleCall_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ops__Group_1__2__Impl"


    // $ANTLR start "rule__Funcs__Group_2__0"
    // InternalJavaScript.g:570:1: rule__Funcs__Group_2__0 : rule__Funcs__Group_2__0__Impl rule__Funcs__Group_2__1 ;
    public final void rule__Funcs__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaScript.g:574:1: ( rule__Funcs__Group_2__0__Impl rule__Funcs__Group_2__1 )
            // InternalJavaScript.g:575:2: rule__Funcs__Group_2__0__Impl rule__Funcs__Group_2__1
            {
            pushFollow(FOLLOW_10);
            rule__Funcs__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Funcs__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Funcs__Group_2__0"


    // $ANTLR start "rule__Funcs__Group_2__0__Impl"
    // InternalJavaScript.g:582:1: rule__Funcs__Group_2__0__Impl : ( RULE_INT ) ;
    public final void rule__Funcs__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaScript.g:586:1: ( ( RULE_INT ) )
            // InternalJavaScript.g:587:1: ( RULE_INT )
            {
            // InternalJavaScript.g:587:1: ( RULE_INT )
            // InternalJavaScript.g:588:2: RULE_INT
            {
             before(grammarAccess.getFuncsAccess().getINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getFuncsAccess().getINTTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Funcs__Group_2__0__Impl"


    // $ANTLR start "rule__Funcs__Group_2__1"
    // InternalJavaScript.g:597:1: rule__Funcs__Group_2__1 : rule__Funcs__Group_2__1__Impl rule__Funcs__Group_2__2 ;
    public final void rule__Funcs__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaScript.g:601:1: ( rule__Funcs__Group_2__1__Impl rule__Funcs__Group_2__2 )
            // InternalJavaScript.g:602:2: rule__Funcs__Group_2__1__Impl rule__Funcs__Group_2__2
            {
            pushFollow(FOLLOW_8);
            rule__Funcs__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Funcs__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Funcs__Group_2__1"


    // $ANTLR start "rule__Funcs__Group_2__1__Impl"
    // InternalJavaScript.g:609:1: rule__Funcs__Group_2__1__Impl : ( '.' ) ;
    public final void rule__Funcs__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaScript.g:613:1: ( ( '.' ) )
            // InternalJavaScript.g:614:1: ( '.' )
            {
            // InternalJavaScript.g:614:1: ( '.' )
            // InternalJavaScript.g:615:2: '.'
            {
             before(grammarAccess.getFuncsAccess().getFullStopKeyword_2_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getFuncsAccess().getFullStopKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Funcs__Group_2__1__Impl"


    // $ANTLR start "rule__Funcs__Group_2__2"
    // InternalJavaScript.g:624:1: rule__Funcs__Group_2__2 : rule__Funcs__Group_2__2__Impl ;
    public final void rule__Funcs__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaScript.g:628:1: ( rule__Funcs__Group_2__2__Impl )
            // InternalJavaScript.g:629:2: rule__Funcs__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Funcs__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Funcs__Group_2__2"


    // $ANTLR start "rule__Funcs__Group_2__2__Impl"
    // InternalJavaScript.g:635:1: rule__Funcs__Group_2__2__Impl : ( RULE_INT ) ;
    public final void rule__Funcs__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaScript.g:639:1: ( ( RULE_INT ) )
            // InternalJavaScript.g:640:1: ( RULE_INT )
            {
            // InternalJavaScript.g:640:1: ( RULE_INT )
            // InternalJavaScript.g:641:2: RULE_INT
            {
             before(grammarAccess.getFuncsAccess().getINTTerminalRuleCall_2_2()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getFuncsAccess().getINTTerminalRuleCall_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Funcs__Group_2__2__Impl"


    // $ANTLR start "rule__JavaScript__NameAssignment_1"
    // InternalJavaScript.g:651:1: rule__JavaScript__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__JavaScript__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaScript.g:655:1: ( ( RULE_ID ) )
            // InternalJavaScript.g:656:2: ( RULE_ID )
            {
            // InternalJavaScript.g:656:2: ( RULE_ID )
            // InternalJavaScript.g:657:3: RULE_ID
            {
             before(grammarAccess.getJavaScriptAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getJavaScriptAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JavaScript__NameAssignment_1"


    // $ANTLR start "rule__JavaScript__ElementsAssignment_3"
    // InternalJavaScript.g:666:1: rule__JavaScript__ElementsAssignment_3 : ( ruleelems ) ;
    public final void rule__JavaScript__ElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaScript.g:670:1: ( ( ruleelems ) )
            // InternalJavaScript.g:671:2: ( ruleelems )
            {
            // InternalJavaScript.g:671:2: ( ruleelems )
            // InternalJavaScript.g:672:3: ruleelems
            {
             before(grammarAccess.getJavaScriptAccess().getElementsElemsParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleelems();

            state._fsp--;

             after(grammarAccess.getJavaScriptAccess().getElementsElemsParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JavaScript__ElementsAssignment_3"


    // $ANTLR start "rule__Elems__ElementsAssignment_0"
    // InternalJavaScript.g:681:1: rule__Elems__ElementsAssignment_0 : ( rulefuncs ) ;
    public final void rule__Elems__ElementsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaScript.g:685:1: ( ( rulefuncs ) )
            // InternalJavaScript.g:686:2: ( rulefuncs )
            {
            // InternalJavaScript.g:686:2: ( rulefuncs )
            // InternalJavaScript.g:687:3: rulefuncs
            {
             before(grammarAccess.getElemsAccess().getElementsFuncsParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            rulefuncs();

            state._fsp--;

             after(grammarAccess.getElemsAccess().getElementsFuncsParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Elems__ElementsAssignment_0"


    // $ANTLR start "rule__Elems__ElementsAssignment_1"
    // InternalJavaScript.g:696:1: rule__Elems__ElementsAssignment_1 : ( ruleBoolean ) ;
    public final void rule__Elems__ElementsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaScript.g:700:1: ( ( ruleBoolean ) )
            // InternalJavaScript.g:701:2: ( ruleBoolean )
            {
            // InternalJavaScript.g:701:2: ( ruleBoolean )
            // InternalJavaScript.g:702:3: ruleBoolean
            {
             before(grammarAccess.getElemsAccess().getElementsBooleanParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBoolean();

            state._fsp--;

             after(grammarAccess.getElemsAccess().getElementsBooleanParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Elems__ElementsAssignment_1"


    // $ANTLR start "rule__Elems__ElementsAssignment_2"
    // InternalJavaScript.g:711:1: rule__Elems__ElementsAssignment_2 : ( ruleOps ) ;
    public final void rule__Elems__ElementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJavaScript.g:715:1: ( ( ruleOps ) )
            // InternalJavaScript.g:716:2: ( ruleOps )
            {
            // InternalJavaScript.g:716:2: ( ruleOps )
            // InternalJavaScript.g:717:3: ruleOps
            {
             before(grammarAccess.getElemsAccess().getElementsOpsParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleOps();

            state._fsp--;

             after(grammarAccess.getElemsAccess().getElementsOpsParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Elems__ElementsAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001830L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});

}