package com.senacor.bdm.logdsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.senacor.bdm.logdsl.services.LogDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalLogDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'BaseEntity'", "'{'", "'}'", "'.'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int RULE_INT=5;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalLogDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalLogDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalLogDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalLogDsl.g"; }



     	private LogDslGrammarAccess grammarAccess;

        public InternalLogDslParser(TokenStream input, LogDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "LogDocument";
       	}

       	@Override
       	protected LogDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleLogDocument"
    // InternalLogDsl.g:64:1: entryRuleLogDocument returns [EObject current=null] : iv_ruleLogDocument= ruleLogDocument EOF ;
    public final EObject entryRuleLogDocument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogDocument = null;


        try {
            // InternalLogDsl.g:64:52: (iv_ruleLogDocument= ruleLogDocument EOF )
            // InternalLogDsl.g:65:2: iv_ruleLogDocument= ruleLogDocument EOF
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
    // InternalLogDsl.g:71:1: ruleLogDocument returns [EObject current=null] : ( () otherlv_1= 'package' ( (lv_name_2_0= ruleQualifiedName ) ) ( (lv_baseentities_3_0= ruleBaseEntity ) ) ) ;
    public final EObject ruleLogDocument() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_baseentities_3_0 = null;



        	enterRule();

        try {
            // InternalLogDsl.g:77:2: ( ( () otherlv_1= 'package' ( (lv_name_2_0= ruleQualifiedName ) ) ( (lv_baseentities_3_0= ruleBaseEntity ) ) ) )
            // InternalLogDsl.g:78:2: ( () otherlv_1= 'package' ( (lv_name_2_0= ruleQualifiedName ) ) ( (lv_baseentities_3_0= ruleBaseEntity ) ) )
            {
            // InternalLogDsl.g:78:2: ( () otherlv_1= 'package' ( (lv_name_2_0= ruleQualifiedName ) ) ( (lv_baseentities_3_0= ruleBaseEntity ) ) )
            // InternalLogDsl.g:79:3: () otherlv_1= 'package' ( (lv_name_2_0= ruleQualifiedName ) ) ( (lv_baseentities_3_0= ruleBaseEntity ) )
            {
            // InternalLogDsl.g:79:3: ()
            // InternalLogDsl.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLogDocumentAccess().getLogDocumentAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getLogDocumentAccess().getPackageKeyword_1());
            		
            // InternalLogDsl.g:90:3: ( (lv_name_2_0= ruleQualifiedName ) )
            // InternalLogDsl.g:91:4: (lv_name_2_0= ruleQualifiedName )
            {
            // InternalLogDsl.g:91:4: (lv_name_2_0= ruleQualifiedName )
            // InternalLogDsl.g:92:5: lv_name_2_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getLogDocumentAccess().getNameQualifiedNameParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLogDocumentRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"com.senacor.bdm.logdsl.LogDsl.QualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalLogDsl.g:109:3: ( (lv_baseentities_3_0= ruleBaseEntity ) )
            // InternalLogDsl.g:110:4: (lv_baseentities_3_0= ruleBaseEntity )
            {
            // InternalLogDsl.g:110:4: (lv_baseentities_3_0= ruleBaseEntity )
            // InternalLogDsl.g:111:5: lv_baseentities_3_0= ruleBaseEntity
            {

            					newCompositeNode(grammarAccess.getLogDocumentAccess().getBaseentitiesBaseEntityParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_baseentities_3_0=ruleBaseEntity();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLogDocumentRule());
            					}
            					add(
            						current,
            						"baseentities",
            						lv_baseentities_3_0,
            						"com.senacor.bdm.logdsl.LogDsl.BaseEntity");
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
    // $ANTLR end "ruleLogDocument"


    // $ANTLR start "entryRuleBaseEntity"
    // InternalLogDsl.g:132:1: entryRuleBaseEntity returns [EObject current=null] : iv_ruleBaseEntity= ruleBaseEntity EOF ;
    public final EObject entryRuleBaseEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBaseEntity = null;


        try {
            // InternalLogDsl.g:132:51: (iv_ruleBaseEntity= ruleBaseEntity EOF )
            // InternalLogDsl.g:133:2: iv_ruleBaseEntity= ruleBaseEntity EOF
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
    // InternalLogDsl.g:139:1: ruleBaseEntity returns [EObject current=null] : ( () otherlv_1= 'BaseEntity' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= '}' ) ;
    public final EObject ruleBaseEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalLogDsl.g:145:2: ( ( () otherlv_1= 'BaseEntity' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= '}' ) )
            // InternalLogDsl.g:146:2: ( () otherlv_1= 'BaseEntity' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= '}' )
            {
            // InternalLogDsl.g:146:2: ( () otherlv_1= 'BaseEntity' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= '}' )
            // InternalLogDsl.g:147:3: () otherlv_1= 'BaseEntity' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= '}'
            {
            // InternalLogDsl.g:147:3: ()
            // InternalLogDsl.g:148:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBaseEntityAccess().getBaseEntityAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getBaseEntityAccess().getBaseEntityKeyword_1());
            		
            // InternalLogDsl.g:158:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalLogDsl.g:159:4: (lv_name_2_0= RULE_ID )
            {
            // InternalLogDsl.g:159:4: (lv_name_2_0= RULE_ID )
            // InternalLogDsl.g:160:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_2_0, grammarAccess.getBaseEntityAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBaseEntityRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"com.senacor.bdm.logdsl.LogDsl.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getBaseEntityAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getBaseEntityAccess().getRightCurlyBracketKeyword_4());
            		

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


    // $ANTLR start "entryRuleQualifiedName"
    // InternalLogDsl.g:188:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalLogDsl.g:188:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalLogDsl.g:189:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalLogDsl.g:195:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_ID_0= RULE_ID kw= '.' )* this_ID_2= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalLogDsl.g:201:2: ( ( (this_ID_0= RULE_ID kw= '.' )* this_ID_2= RULE_ID ) )
            // InternalLogDsl.g:202:2: ( (this_ID_0= RULE_ID kw= '.' )* this_ID_2= RULE_ID )
            {
            // InternalLogDsl.g:202:2: ( (this_ID_0= RULE_ID kw= '.' )* this_ID_2= RULE_ID )
            // InternalLogDsl.g:203:3: (this_ID_0= RULE_ID kw= '.' )* this_ID_2= RULE_ID
            {
            // InternalLogDsl.g:203:3: (this_ID_0= RULE_ID kw= '.' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID) ) {
                    int LA1_1 = input.LA(2);

                    if ( (LA1_1==15) ) {
                        alt1=1;
                    }


                }


                switch (alt1) {
            	case 1 :
            	    // InternalLogDsl.g:204:4: this_ID_0= RULE_ID kw= '.'
            	    {
            	    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            	    				current.merge(this_ID_0);
            	    			

            	    				newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0_0());
            	    			
            	    kw=(Token)match(input,15,FOLLOW_3); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_0_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            this_ID_2=(Token)match(input,RULE_ID,FOLLOW_2); 

            			current.merge(this_ID_2);
            		

            			newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1());
            		

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
    // $ANTLR end "ruleQualifiedName"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});

}