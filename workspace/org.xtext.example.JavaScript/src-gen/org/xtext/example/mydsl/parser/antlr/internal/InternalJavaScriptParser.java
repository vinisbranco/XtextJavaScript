package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.JavaScriptGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalJavaScriptParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'var'", "'='", "';'", "'+'", "'-'", "'.'", "'true'", "'false'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
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

        public InternalJavaScriptParser(TokenStream input, JavaScriptGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "JavaScript";
       	}

       	@Override
       	protected JavaScriptGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleJavaScript"
    // InternalJavaScript.g:64:1: entryRuleJavaScript returns [EObject current=null] : iv_ruleJavaScript= ruleJavaScript EOF ;
    public final EObject entryRuleJavaScript() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJavaScript = null;


        try {
            // InternalJavaScript.g:64:51: (iv_ruleJavaScript= ruleJavaScript EOF )
            // InternalJavaScript.g:65:2: iv_ruleJavaScript= ruleJavaScript EOF
            {
             newCompositeNode(grammarAccess.getJavaScriptRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJavaScript=ruleJavaScript();

            state._fsp--;

             current =iv_ruleJavaScript; 
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
    // $ANTLR end "entryRuleJavaScript"


    // $ANTLR start "ruleJavaScript"
    // InternalJavaScript.g:71:1: ruleJavaScript returns [EObject current=null] : (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_elements_3_0= ruleelems ) ) otherlv_4= ';' ) ;
    public final EObject ruleJavaScript() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_elements_3_0 = null;



        	enterRule();

        try {
            // InternalJavaScript.g:77:2: ( (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_elements_3_0= ruleelems ) ) otherlv_4= ';' ) )
            // InternalJavaScript.g:78:2: (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_elements_3_0= ruleelems ) ) otherlv_4= ';' )
            {
            // InternalJavaScript.g:78:2: (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_elements_3_0= ruleelems ) ) otherlv_4= ';' )
            // InternalJavaScript.g:79:3: otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_elements_3_0= ruleelems ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getJavaScriptAccess().getVarKeyword_0());
            		
            // InternalJavaScript.g:83:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalJavaScript.g:84:4: (lv_name_1_0= RULE_ID )
            {
            // InternalJavaScript.g:84:4: (lv_name_1_0= RULE_ID )
            // InternalJavaScript.g:85:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getJavaScriptAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getJavaScriptRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getJavaScriptAccess().getEqualsSignKeyword_2());
            		
            // InternalJavaScript.g:105:3: ( (lv_elements_3_0= ruleelems ) )
            // InternalJavaScript.g:106:4: (lv_elements_3_0= ruleelems )
            {
            // InternalJavaScript.g:106:4: (lv_elements_3_0= ruleelems )
            // InternalJavaScript.g:107:5: lv_elements_3_0= ruleelems
            {

            					newCompositeNode(grammarAccess.getJavaScriptAccess().getElementsElemsParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_6);
            lv_elements_3_0=ruleelems();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getJavaScriptRule());
            					}
            					set(
            						current,
            						"elements",
            						lv_elements_3_0,
            						"org.xtext.example.mydsl.JavaScript.elems");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getJavaScriptAccess().getSemicolonKeyword_4());
            		

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
    // $ANTLR end "ruleJavaScript"


    // $ANTLR start "entryRuleelems"
    // InternalJavaScript.g:132:1: entryRuleelems returns [EObject current=null] : iv_ruleelems= ruleelems EOF ;
    public final EObject entryRuleelems() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleelems = null;


        try {
            // InternalJavaScript.g:132:46: (iv_ruleelems= ruleelems EOF )
            // InternalJavaScript.g:133:2: iv_ruleelems= ruleelems EOF
            {
             newCompositeNode(grammarAccess.getElemsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleelems=ruleelems();

            state._fsp--;

             current =iv_ruleelems; 
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
    // $ANTLR end "entryRuleelems"


    // $ANTLR start "ruleelems"
    // InternalJavaScript.g:139:1: ruleelems returns [EObject current=null] : ( ( (lv_elements_0_0= rulefuncs ) ) | ( (lv_elements_1_0= ruleBoolean ) ) | ( (lv_elements_2_0= ruleOps ) ) ) ;
    public final EObject ruleelems() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_elements_0_0 = null;

        AntlrDatatypeRuleToken lv_elements_1_0 = null;

        AntlrDatatypeRuleToken lv_elements_2_0 = null;



        	enterRule();

        try {
            // InternalJavaScript.g:145:2: ( ( ( (lv_elements_0_0= rulefuncs ) ) | ( (lv_elements_1_0= ruleBoolean ) ) | ( (lv_elements_2_0= ruleOps ) ) ) )
            // InternalJavaScript.g:146:2: ( ( (lv_elements_0_0= rulefuncs ) ) | ( (lv_elements_1_0= ruleBoolean ) ) | ( (lv_elements_2_0= ruleOps ) ) )
            {
            // InternalJavaScript.g:146:2: ( ( (lv_elements_0_0= rulefuncs ) ) | ( (lv_elements_1_0= ruleBoolean ) ) | ( (lv_elements_2_0= ruleOps ) ) )
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

                if ( (LA1_2==EOF||LA1_2==13||LA1_2==16) ) {
                    alt1=1;
                }
                else if ( ((LA1_2>=14 && LA1_2<=15)) ) {
                    alt1=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 2, input);

                    throw nvae;
                }
                }
                break;
            case 17:
            case 18:
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
                    // InternalJavaScript.g:147:3: ( (lv_elements_0_0= rulefuncs ) )
                    {
                    // InternalJavaScript.g:147:3: ( (lv_elements_0_0= rulefuncs ) )
                    // InternalJavaScript.g:148:4: (lv_elements_0_0= rulefuncs )
                    {
                    // InternalJavaScript.g:148:4: (lv_elements_0_0= rulefuncs )
                    // InternalJavaScript.g:149:5: lv_elements_0_0= rulefuncs
                    {

                    					newCompositeNode(grammarAccess.getElemsAccess().getElementsFuncsParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_elements_0_0=rulefuncs();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getElemsRule());
                    					}
                    					set(
                    						current,
                    						"elements",
                    						lv_elements_0_0,
                    						"org.xtext.example.mydsl.JavaScript.funcs");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalJavaScript.g:167:3: ( (lv_elements_1_0= ruleBoolean ) )
                    {
                    // InternalJavaScript.g:167:3: ( (lv_elements_1_0= ruleBoolean ) )
                    // InternalJavaScript.g:168:4: (lv_elements_1_0= ruleBoolean )
                    {
                    // InternalJavaScript.g:168:4: (lv_elements_1_0= ruleBoolean )
                    // InternalJavaScript.g:169:5: lv_elements_1_0= ruleBoolean
                    {

                    					newCompositeNode(grammarAccess.getElemsAccess().getElementsBooleanParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_elements_1_0=ruleBoolean();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getElemsRule());
                    					}
                    					set(
                    						current,
                    						"elements",
                    						lv_elements_1_0,
                    						"org.xtext.example.mydsl.JavaScript.Boolean");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalJavaScript.g:187:3: ( (lv_elements_2_0= ruleOps ) )
                    {
                    // InternalJavaScript.g:187:3: ( (lv_elements_2_0= ruleOps ) )
                    // InternalJavaScript.g:188:4: (lv_elements_2_0= ruleOps )
                    {
                    // InternalJavaScript.g:188:4: (lv_elements_2_0= ruleOps )
                    // InternalJavaScript.g:189:5: lv_elements_2_0= ruleOps
                    {

                    					newCompositeNode(grammarAccess.getElemsAccess().getElementsOpsParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_elements_2_0=ruleOps();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getElemsRule());
                    					}
                    					set(
                    						current,
                    						"elements",
                    						lv_elements_2_0,
                    						"org.xtext.example.mydsl.JavaScript.Ops");
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
    // $ANTLR end "ruleelems"


    // $ANTLR start "entryRuleOps"
    // InternalJavaScript.g:210:1: entryRuleOps returns [String current=null] : iv_ruleOps= ruleOps EOF ;
    public final String entryRuleOps() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOps = null;


        try {
            // InternalJavaScript.g:210:43: (iv_ruleOps= ruleOps EOF )
            // InternalJavaScript.g:211:2: iv_ruleOps= ruleOps EOF
            {
             newCompositeNode(grammarAccess.getOpsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOps=ruleOps();

            state._fsp--;

             current =iv_ruleOps.getText(); 
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
    // $ANTLR end "entryRuleOps"


    // $ANTLR start "ruleOps"
    // InternalJavaScript.g:217:1: ruleOps returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_INT_0= RULE_INT kw= '+' this_INT_2= RULE_INT ) | (this_INT_3= RULE_INT kw= '-' this_INT_5= RULE_INT ) ) ;
    public final AntlrDatatypeRuleToken ruleOps() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;
        Token this_INT_3=null;
        Token this_INT_5=null;


        	enterRule();

        try {
            // InternalJavaScript.g:223:2: ( ( (this_INT_0= RULE_INT kw= '+' this_INT_2= RULE_INT ) | (this_INT_3= RULE_INT kw= '-' this_INT_5= RULE_INT ) ) )
            // InternalJavaScript.g:224:2: ( (this_INT_0= RULE_INT kw= '+' this_INT_2= RULE_INT ) | (this_INT_3= RULE_INT kw= '-' this_INT_5= RULE_INT ) )
            {
            // InternalJavaScript.g:224:2: ( (this_INT_0= RULE_INT kw= '+' this_INT_2= RULE_INT ) | (this_INT_3= RULE_INT kw= '-' this_INT_5= RULE_INT ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_INT) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==15) ) {
                    alt2=2;
                }
                else if ( (LA2_1==14) ) {
                    alt2=1;
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
                    // InternalJavaScript.g:225:3: (this_INT_0= RULE_INT kw= '+' this_INT_2= RULE_INT )
                    {
                    // InternalJavaScript.g:225:3: (this_INT_0= RULE_INT kw= '+' this_INT_2= RULE_INT )
                    // InternalJavaScript.g:226:4: this_INT_0= RULE_INT kw= '+' this_INT_2= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_7); 

                    				current.merge(this_INT_0);
                    			

                    				newLeafNode(this_INT_0, grammarAccess.getOpsAccess().getINTTerminalRuleCall_0_0());
                    			
                    kw=(Token)match(input,14,FOLLOW_8); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getOpsAccess().getPlusSignKeyword_0_1());
                    			
                    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				current.merge(this_INT_2);
                    			

                    				newLeafNode(this_INT_2, grammarAccess.getOpsAccess().getINTTerminalRuleCall_0_2());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalJavaScript.g:247:3: (this_INT_3= RULE_INT kw= '-' this_INT_5= RULE_INT )
                    {
                    // InternalJavaScript.g:247:3: (this_INT_3= RULE_INT kw= '-' this_INT_5= RULE_INT )
                    // InternalJavaScript.g:248:4: this_INT_3= RULE_INT kw= '-' this_INT_5= RULE_INT
                    {
                    this_INT_3=(Token)match(input,RULE_INT,FOLLOW_9); 

                    				current.merge(this_INT_3);
                    			

                    				newLeafNode(this_INT_3, grammarAccess.getOpsAccess().getINTTerminalRuleCall_1_0());
                    			
                    kw=(Token)match(input,15,FOLLOW_8); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getOpsAccess().getHyphenMinusKeyword_1_1());
                    			
                    this_INT_5=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				current.merge(this_INT_5);
                    			

                    				newLeafNode(this_INT_5, grammarAccess.getOpsAccess().getINTTerminalRuleCall_1_2());
                    			

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
    // $ANTLR end "ruleOps"


    // $ANTLR start "entryRulefuncs"
    // InternalJavaScript.g:272:1: entryRulefuncs returns [String current=null] : iv_rulefuncs= rulefuncs EOF ;
    public final String entryRulefuncs() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulefuncs = null;


        try {
            // InternalJavaScript.g:272:45: (iv_rulefuncs= rulefuncs EOF )
            // InternalJavaScript.g:273:2: iv_rulefuncs= rulefuncs EOF
            {
             newCompositeNode(grammarAccess.getFuncsRule()); 
            pushFollow(FOLLOW_1);
            iv_rulefuncs=rulefuncs();

            state._fsp--;

             current =iv_rulefuncs.getText(); 
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
    // $ANTLR end "entryRulefuncs"


    // $ANTLR start "rulefuncs"
    // InternalJavaScript.g:279:1: rulefuncs returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_INT_1= RULE_INT | (this_INT_2= RULE_INT kw= '.' this_INT_4= RULE_INT ) ) ;
    public final AntlrDatatypeRuleToken rulefuncs() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_INT_1=null;
        Token this_INT_2=null;
        Token kw=null;
        Token this_INT_4=null;


        	enterRule();

        try {
            // InternalJavaScript.g:285:2: ( (this_STRING_0= RULE_STRING | this_INT_1= RULE_INT | (this_INT_2= RULE_INT kw= '.' this_INT_4= RULE_INT ) ) )
            // InternalJavaScript.g:286:2: (this_STRING_0= RULE_STRING | this_INT_1= RULE_INT | (this_INT_2= RULE_INT kw= '.' this_INT_4= RULE_INT ) )
            {
            // InternalJavaScript.g:286:2: (this_STRING_0= RULE_STRING | this_INT_1= RULE_INT | (this_INT_2= RULE_INT kw= '.' this_INT_4= RULE_INT ) )
            int alt3=3;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_INT) ) {
                int LA3_2 = input.LA(2);

                if ( (LA3_2==EOF||LA3_2==13) ) {
                    alt3=2;
                }
                else if ( (LA3_2==16) ) {
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
                    // InternalJavaScript.g:287:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getFuncsAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalJavaScript.g:295:3: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			current.merge(this_INT_1);
                    		

                    			newLeafNode(this_INT_1, grammarAccess.getFuncsAccess().getINTTerminalRuleCall_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalJavaScript.g:303:3: (this_INT_2= RULE_INT kw= '.' this_INT_4= RULE_INT )
                    {
                    // InternalJavaScript.g:303:3: (this_INT_2= RULE_INT kw= '.' this_INT_4= RULE_INT )
                    // InternalJavaScript.g:304:4: this_INT_2= RULE_INT kw= '.' this_INT_4= RULE_INT
                    {
                    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_10); 

                    				current.merge(this_INT_2);
                    			

                    				newLeafNode(this_INT_2, grammarAccess.getFuncsAccess().getINTTerminalRuleCall_2_0());
                    			
                    kw=(Token)match(input,16,FOLLOW_8); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getFuncsAccess().getFullStopKeyword_2_1());
                    			
                    this_INT_4=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				current.merge(this_INT_4);
                    			

                    				newLeafNode(this_INT_4, grammarAccess.getFuncsAccess().getINTTerminalRuleCall_2_2());
                    			

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
    // $ANTLR end "rulefuncs"


    // $ANTLR start "entryRuleBoolean"
    // InternalJavaScript.g:328:1: entryRuleBoolean returns [String current=null] : iv_ruleBoolean= ruleBoolean EOF ;
    public final String entryRuleBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBoolean = null;


        try {
            // InternalJavaScript.g:328:47: (iv_ruleBoolean= ruleBoolean EOF )
            // InternalJavaScript.g:329:2: iv_ruleBoolean= ruleBoolean EOF
            {
             newCompositeNode(grammarAccess.getBooleanRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBoolean=ruleBoolean();

            state._fsp--;

             current =iv_ruleBoolean.getText(); 
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
    // $ANTLR end "entryRuleBoolean"


    // $ANTLR start "ruleBoolean"
    // InternalJavaScript.g:335:1: ruleBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalJavaScript.g:341:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalJavaScript.g:342:2: (kw= 'true' | kw= 'false' )
            {
            // InternalJavaScript.g:342:2: (kw= 'true' | kw= 'false' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            else if ( (LA4_0==18) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalJavaScript.g:343:3: kw= 'true'
                    {
                    kw=(Token)match(input,17,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBooleanAccess().getTrueKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalJavaScript.g:349:3: kw= 'false'
                    {
                    kw=(Token)match(input,18,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBooleanAccess().getFalseKeyword_1());
                    		

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
    // $ANTLR end "ruleBoolean"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000060060L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});

}