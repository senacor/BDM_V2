package com.senacor.bdm.techdsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.senacor.bdm.techdsl.services.TechDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTechDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'LogDocument'", "'{'", "'baseentities'", "','", "'}'", "'BaseEntity'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=4;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int RULE_INT=6;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalTechDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalTechDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalTechDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalTechDsl.g"; }



     	private TechDslGrammarAccess grammarAccess;

        public InternalTechDslParser(TokenStream input, TechDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "LogDocument";
       	}

       	@Override
       	protected TechDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleLogDocument"
    // InternalTechDsl.g:64:1: entryRuleLogDocument returns [EObject current=null] : iv_ruleLogDocument= ruleLogDocument EOF ;
    public final EObject entryRuleLogDocument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogDocument = null;


        try {
            // InternalTechDsl.g:64:52: (iv_ruleLogDocument= ruleLogDocument EOF )
            // InternalTechDsl.g:65:2: iv_ruleLogDocument= ruleLogDocument EOF
            {
             newCompositeNode(grammarAccess.getLogDocumentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogDocument=ruleLogDocument();

            state._fsp--;

             current =iv_ruleLogDocument; 
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
    // $ANTLR end "entryRuleLogDocument"


    // $ANTLR start "ruleLogDocument"
    // InternalTechDsl.g:71:1: ruleLogDocument returns [EObject current=null] : ( () otherlv_1= 'LogDocument' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'baseentities' otherlv_5= '{' ( (lv_baseentities_6_0= ruleBaseEntity ) ) (otherlv_7= ',' ( (lv_baseentities_8_0= ruleBaseEntity ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) ;
    public final EObject ruleLogDocument() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_baseentities_6_0 = null;

        EObject lv_baseentities_8_0 = null;



        	enterRule();

        try {
            // InternalTechDsl.g:77:2: ( ( () otherlv_1= 'LogDocument' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'baseentities' otherlv_5= '{' ( (lv_baseentities_6_0= ruleBaseEntity ) ) (otherlv_7= ',' ( (lv_baseentities_8_0= ruleBaseEntity ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) )
            // InternalTechDsl.g:78:2: ( () otherlv_1= 'LogDocument' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'baseentities' otherlv_5= '{' ( (lv_baseentities_6_0= ruleBaseEntity ) ) (otherlv_7= ',' ( (lv_baseentities_8_0= ruleBaseEntity ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            {
            // InternalTechDsl.g:78:2: ( () otherlv_1= 'LogDocument' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'baseentities' otherlv_5= '{' ( (lv_baseentities_6_0= ruleBaseEntity ) ) (otherlv_7= ',' ( (lv_baseentities_8_0= ruleBaseEntity ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            // InternalTechDsl.g:79:3: () otherlv_1= 'LogDocument' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'baseentities' otherlv_5= '{' ( (lv_baseentities_6_0= ruleBaseEntity ) ) (otherlv_7= ',' ( (lv_baseentities_8_0= ruleBaseEntity ) ) )* otherlv_9= '}' )? otherlv_10= '}'
            {
            // InternalTechDsl.g:79:3: ()
            // InternalTechDsl.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLogDocumentAccess().getLogDocumentAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getLogDocumentAccess().getLogDocumentKeyword_1());
            		
            // InternalTechDsl.g:90:3: ( (lv_name_2_0= ruleEString ) )
            // InternalTechDsl.g:91:4: (lv_name_2_0= ruleEString )
            {
            // InternalTechDsl.g:91:4: (lv_name_2_0= ruleEString )
            // InternalTechDsl.g:92:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getLogDocumentAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLogDocumentRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"com.senacor.bdm.techdsl.TechDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getLogDocumentAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalTechDsl.g:113:3: (otherlv_4= 'baseentities' otherlv_5= '{' ( (lv_baseentities_6_0= ruleBaseEntity ) ) (otherlv_7= ',' ( (lv_baseentities_8_0= ruleBaseEntity ) ) )* otherlv_9= '}' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalTechDsl.g:114:4: otherlv_4= 'baseentities' otherlv_5= '{' ( (lv_baseentities_6_0= ruleBaseEntity ) ) (otherlv_7= ',' ( (lv_baseentities_8_0= ruleBaseEntity ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getLogDocumentAccess().getBaseentitiesKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_6); 

                    				newLeafNode(otherlv_5, grammarAccess.getLogDocumentAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalTechDsl.g:122:4: ( (lv_baseentities_6_0= ruleBaseEntity ) )
                    // InternalTechDsl.g:123:5: (lv_baseentities_6_0= ruleBaseEntity )
                    {
                    // InternalTechDsl.g:123:5: (lv_baseentities_6_0= ruleBaseEntity )
                    // InternalTechDsl.g:124:6: lv_baseentities_6_0= ruleBaseEntity
                    {

                    						newCompositeNode(grammarAccess.getLogDocumentAccess().getBaseentitiesBaseEntityParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_baseentities_6_0=ruleBaseEntity();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLogDocumentRule());
                    						}
                    						add(
                    							current,
                    							"baseentities",
                    							lv_baseentities_6_0,
                    							"com.senacor.bdm.techdsl.TechDsl.BaseEntity");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTechDsl.g:141:4: (otherlv_7= ',' ( (lv_baseentities_8_0= ruleBaseEntity ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==14) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalTechDsl.g:142:5: otherlv_7= ',' ( (lv_baseentities_8_0= ruleBaseEntity ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_6); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getLogDocumentAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalTechDsl.g:146:5: ( (lv_baseentities_8_0= ruleBaseEntity ) )
                    	    // InternalTechDsl.g:147:6: (lv_baseentities_8_0= ruleBaseEntity )
                    	    {
                    	    // InternalTechDsl.g:147:6: (lv_baseentities_8_0= ruleBaseEntity )
                    	    // InternalTechDsl.g:148:7: lv_baseentities_8_0= ruleBaseEntity
                    	    {

                    	    							newCompositeNode(grammarAccess.getLogDocumentAccess().getBaseentitiesBaseEntityParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_baseentities_8_0=ruleBaseEntity();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getLogDocumentRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"baseentities",
                    	    								lv_baseentities_8_0,
                    	    								"com.senacor.bdm.techdsl.TechDsl.BaseEntity");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,15,FOLLOW_8); 

                    				newLeafNode(otherlv_9, grammarAccess.getLogDocumentAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_10=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getLogDocumentAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleLogDocument"


    // $ANTLR start "entryRuleEString"
    // InternalTechDsl.g:179:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalTechDsl.g:179:47: (iv_ruleEString= ruleEString EOF )
            // InternalTechDsl.g:180:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalTechDsl.g:186:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalTechDsl.g:192:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalTechDsl.g:193:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalTechDsl.g:193:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalTechDsl.g:194:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalTechDsl.g:202:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleBaseEntity"
    // InternalTechDsl.g:213:1: entryRuleBaseEntity returns [EObject current=null] : iv_ruleBaseEntity= ruleBaseEntity EOF ;
    public final EObject entryRuleBaseEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBaseEntity = null;


        try {
            // InternalTechDsl.g:213:51: (iv_ruleBaseEntity= ruleBaseEntity EOF )
            // InternalTechDsl.g:214:2: iv_ruleBaseEntity= ruleBaseEntity EOF
            {
             newCompositeNode(grammarAccess.getBaseEntityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBaseEntity=ruleBaseEntity();

            state._fsp--;

             current =iv_ruleBaseEntity; 
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
    // $ANTLR end "entryRuleBaseEntity"


    // $ANTLR start "ruleBaseEntity"
    // InternalTechDsl.g:220:1: ruleBaseEntity returns [EObject current=null] : ( () otherlv_1= 'BaseEntity' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleBaseEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalTechDsl.g:226:2: ( ( () otherlv_1= 'BaseEntity' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalTechDsl.g:227:2: ( () otherlv_1= 'BaseEntity' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalTechDsl.g:227:2: ( () otherlv_1= 'BaseEntity' ( (lv_name_2_0= ruleEString ) ) )
            // InternalTechDsl.g:228:3: () otherlv_1= 'BaseEntity' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalTechDsl.g:228:3: ()
            // InternalTechDsl.g:229:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBaseEntityAccess().getBaseEntityAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getBaseEntityAccess().getBaseEntityKeyword_1());
            		
            // InternalTechDsl.g:239:3: ( (lv_name_2_0= ruleEString ) )
            // InternalTechDsl.g:240:4: (lv_name_2_0= ruleEString )
            {
            // InternalTechDsl.g:240:4: (lv_name_2_0= ruleEString )
            // InternalTechDsl.g:241:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getBaseEntityAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBaseEntityRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"com.senacor.bdm.techdsl.TechDsl.EString");
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
    // $ANTLR end "ruleBaseEntity"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});

}