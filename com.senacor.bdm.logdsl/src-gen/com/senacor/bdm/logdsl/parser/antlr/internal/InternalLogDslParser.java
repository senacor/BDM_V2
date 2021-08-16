package com.senacor.bdm.logdsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'Entity'", "'Fields'", "':'", "'-'", "'.'", "'String'", "'Number'"
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
    // InternalLogDsl.g:65:1: entryRuleLogDocument returns [EObject current=null] : iv_ruleLogDocument= ruleLogDocument EOF ;
    public final EObject entryRuleLogDocument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogDocument = null;


        try {
            // InternalLogDsl.g:65:52: (iv_ruleLogDocument= ruleLogDocument EOF )
            // InternalLogDsl.g:66:2: iv_ruleLogDocument= ruleLogDocument EOF
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
    // InternalLogDsl.g:72:1: ruleLogDocument returns [EObject current=null] : ( () otherlv_1= 'package' ( (lv_name_2_0= ruleQualifiedName ) ) ( (lv_member_3_0= rulemember ) )* ) ;
    public final EObject ruleLogDocument() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_member_3_0 = null;



        	enterRule();

        try {
            // InternalLogDsl.g:78:2: ( ( () otherlv_1= 'package' ( (lv_name_2_0= ruleQualifiedName ) ) ( (lv_member_3_0= rulemember ) )* ) )
            // InternalLogDsl.g:79:2: ( () otherlv_1= 'package' ( (lv_name_2_0= ruleQualifiedName ) ) ( (lv_member_3_0= rulemember ) )* )
            {
            // InternalLogDsl.g:79:2: ( () otherlv_1= 'package' ( (lv_name_2_0= ruleQualifiedName ) ) ( (lv_member_3_0= rulemember ) )* )
            // InternalLogDsl.g:80:3: () otherlv_1= 'package' ( (lv_name_2_0= ruleQualifiedName ) ) ( (lv_member_3_0= rulemember ) )*
            {
            // InternalLogDsl.g:80:3: ()
            // InternalLogDsl.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLogDocumentAccess().getLogDocumentAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getLogDocumentAccess().getPackageKeyword_1());
            		
            // InternalLogDsl.g:91:3: ( (lv_name_2_0= ruleQualifiedName ) )
            // InternalLogDsl.g:92:4: (lv_name_2_0= ruleQualifiedName )
            {
            // InternalLogDsl.g:92:4: (lv_name_2_0= ruleQualifiedName )
            // InternalLogDsl.g:93:5: lv_name_2_0= ruleQualifiedName
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

            // InternalLogDsl.g:110:3: ( (lv_member_3_0= rulemember ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID||LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalLogDsl.g:111:4: (lv_member_3_0= rulemember )
            	    {
            	    // InternalLogDsl.g:111:4: (lv_member_3_0= rulemember )
            	    // InternalLogDsl.g:112:5: lv_member_3_0= rulemember
            	    {

            	    					newCompositeNode(grammarAccess.getLogDocumentAccess().getMemberMemberParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_member_3_0=rulemember();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getLogDocumentRule());
            	    					}
            	    					add(
            	    						current,
            	    						"member",
            	    						lv_member_3_0,
            	    						"com.senacor.bdm.logdsl.LogDsl.member");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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


    // $ANTLR start "entryRulemember"
    // InternalLogDsl.g:133:1: entryRulemember returns [EObject current=null] : iv_rulemember= rulemember EOF ;
    public final EObject entryRulemember() throws RecognitionException {
        EObject current = null;

        EObject iv_rulemember = null;


        try {
            // InternalLogDsl.g:133:47: (iv_rulemember= rulemember EOF )
            // InternalLogDsl.g:134:2: iv_rulemember= rulemember EOF
            {
             newCompositeNode(grammarAccess.getMemberRule()); 
            pushFollow(FOLLOW_1);
            iv_rulemember=rulemember();

            state._fsp--;

             current =iv_rulemember; 
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
    // $ANTLR end "entryRulemember"


    // $ANTLR start "rulemember"
    // InternalLogDsl.g:140:1: rulemember returns [EObject current=null] : (this_Entity_0= ruleEntity | this_Field_1= ruleField ) ;
    public final EObject rulemember() throws RecognitionException {
        EObject current = null;

        EObject this_Entity_0 = null;

        EObject this_Field_1 = null;



        	enterRule();

        try {
            // InternalLogDsl.g:146:2: ( (this_Entity_0= ruleEntity | this_Field_1= ruleField ) )
            // InternalLogDsl.g:147:2: (this_Entity_0= ruleEntity | this_Field_1= ruleField )
            {
            // InternalLogDsl.g:147:2: (this_Entity_0= ruleEntity | this_Field_1= ruleField )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalLogDsl.g:148:3: this_Entity_0= ruleEntity
                    {

                    			newCompositeNode(grammarAccess.getMemberAccess().getEntityParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Entity_0=ruleEntity();

                    state._fsp--;


                    			current = this_Entity_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalLogDsl.g:157:3: this_Field_1= ruleField
                    {

                    			newCompositeNode(grammarAccess.getMemberAccess().getFieldParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Field_1=ruleField();

                    state._fsp--;


                    			current = this_Field_1;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "rulemember"


    // $ANTLR start "entryRuleEntity"
    // InternalLogDsl.g:169:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // InternalLogDsl.g:169:47: (iv_ruleEntity= ruleEntity EOF )
            // InternalLogDsl.g:170:2: iv_ruleEntity= ruleEntity EOF
            {
             newCompositeNode(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntity=ruleEntity();

            state._fsp--;

             current =iv_ruleEntity; 
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
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // InternalLogDsl.g:176:1: ruleEntity returns [EObject current=null] : (otherlv_0= 'Entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Fields' otherlv_3= ':' (otherlv_4= '-' ( (lv_fields_5_0= ruleField ) ) (otherlv_6= '-' ( (lv_fields_7_0= ruleField ) ) )* ) ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_fields_5_0 = null;

        EObject lv_fields_7_0 = null;



        	enterRule();

        try {
            // InternalLogDsl.g:182:2: ( (otherlv_0= 'Entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Fields' otherlv_3= ':' (otherlv_4= '-' ( (lv_fields_5_0= ruleField ) ) (otherlv_6= '-' ( (lv_fields_7_0= ruleField ) ) )* ) ) )
            // InternalLogDsl.g:183:2: (otherlv_0= 'Entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Fields' otherlv_3= ':' (otherlv_4= '-' ( (lv_fields_5_0= ruleField ) ) (otherlv_6= '-' ( (lv_fields_7_0= ruleField ) ) )* ) )
            {
            // InternalLogDsl.g:183:2: (otherlv_0= 'Entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Fields' otherlv_3= ':' (otherlv_4= '-' ( (lv_fields_5_0= ruleField ) ) (otherlv_6= '-' ( (lv_fields_7_0= ruleField ) ) )* ) )
            // InternalLogDsl.g:184:3: otherlv_0= 'Entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Fields' otherlv_3= ':' (otherlv_4= '-' ( (lv_fields_5_0= ruleField ) ) (otherlv_6= '-' ( (lv_fields_7_0= ruleField ) ) )* )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEntityAccess().getEntityKeyword_0());
            		
            // InternalLogDsl.g:188:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalLogDsl.g:189:4: (lv_name_1_0= RULE_ID )
            {
            // InternalLogDsl.g:189:4: (lv_name_1_0= RULE_ID )
            // InternalLogDsl.g:190:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntityRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"com.senacor.bdm.logdsl.LogDsl.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getEntityAccess().getFieldsKeyword_2());
            		
            otherlv_3=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getEntityAccess().getColonKeyword_3());
            		
            // InternalLogDsl.g:214:3: (otherlv_4= '-' ( (lv_fields_5_0= ruleField ) ) (otherlv_6= '-' ( (lv_fields_7_0= ruleField ) ) )* )
            // InternalLogDsl.g:215:4: otherlv_4= '-' ( (lv_fields_5_0= ruleField ) ) (otherlv_6= '-' ( (lv_fields_7_0= ruleField ) ) )*
            {
            otherlv_4=(Token)match(input,15,FOLLOW_8); 

            				newLeafNode(otherlv_4, grammarAccess.getEntityAccess().getHyphenMinusKeyword_4_0());
            			
            // InternalLogDsl.g:219:4: ( (lv_fields_5_0= ruleField ) )
            // InternalLogDsl.g:220:5: (lv_fields_5_0= ruleField )
            {
            // InternalLogDsl.g:220:5: (lv_fields_5_0= ruleField )
            // InternalLogDsl.g:221:6: lv_fields_5_0= ruleField
            {

            						newCompositeNode(grammarAccess.getEntityAccess().getFieldsFieldParserRuleCall_4_1_0());
            					
            pushFollow(FOLLOW_9);
            lv_fields_5_0=ruleField();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getEntityRule());
            						}
            						add(
            							current,
            							"fields",
            							lv_fields_5_0,
            							"com.senacor.bdm.logdsl.LogDsl.Field");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            // InternalLogDsl.g:238:4: (otherlv_6= '-' ( (lv_fields_7_0= ruleField ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==15) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalLogDsl.g:239:5: otherlv_6= '-' ( (lv_fields_7_0= ruleField ) )
            	    {
            	    otherlv_6=(Token)match(input,15,FOLLOW_8); 

            	    					newLeafNode(otherlv_6, grammarAccess.getEntityAccess().getHyphenMinusKeyword_4_2_0());
            	    				
            	    // InternalLogDsl.g:243:5: ( (lv_fields_7_0= ruleField ) )
            	    // InternalLogDsl.g:244:6: (lv_fields_7_0= ruleField )
            	    {
            	    // InternalLogDsl.g:244:6: (lv_fields_7_0= ruleField )
            	    // InternalLogDsl.g:245:7: lv_fields_7_0= ruleField
            	    {

            	    							newCompositeNode(grammarAccess.getEntityAccess().getFieldsFieldParserRuleCall_4_2_1_0());
            	    						
            	    pushFollow(FOLLOW_9);
            	    lv_fields_7_0=ruleField();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getEntityRule());
            	    							}
            	    							add(
            	    								current,
            	    								"fields",
            	    								lv_fields_7_0,
            	    								"com.senacor.bdm.logdsl.LogDsl.Field");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


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
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleField"
    // InternalLogDsl.g:268:1: entryRuleField returns [EObject current=null] : iv_ruleField= ruleField EOF ;
    public final EObject entryRuleField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleField = null;


        try {
            // InternalLogDsl.g:268:46: (iv_ruleField= ruleField EOF )
            // InternalLogDsl.g:269:2: iv_ruleField= ruleField EOF
            {
             newCompositeNode(grammarAccess.getFieldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleField=ruleField();

            state._fsp--;

             current =iv_ruleField; 
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
    // $ANTLR end "entryRuleField"


    // $ANTLR start "ruleField"
    // InternalLogDsl.g:275:1: ruleField returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_dtype_1_0= ruleDataTypes ) ) ) ;
    public final EObject ruleField() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Enumerator lv_dtype_1_0 = null;



        	enterRule();

        try {
            // InternalLogDsl.g:281:2: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_dtype_1_0= ruleDataTypes ) ) ) )
            // InternalLogDsl.g:282:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_dtype_1_0= ruleDataTypes ) ) )
            {
            // InternalLogDsl.g:282:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_dtype_1_0= ruleDataTypes ) ) )
            // InternalLogDsl.g:283:3: ( (lv_name_0_0= RULE_ID ) ) ( (lv_dtype_1_0= ruleDataTypes ) )
            {
            // InternalLogDsl.g:283:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalLogDsl.g:284:4: (lv_name_0_0= RULE_ID )
            {
            // InternalLogDsl.g:284:4: (lv_name_0_0= RULE_ID )
            // InternalLogDsl.g:285:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_name_0_0, grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFieldRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"com.senacor.bdm.logdsl.LogDsl.ID");
            				

            }


            }

            // InternalLogDsl.g:301:3: ( (lv_dtype_1_0= ruleDataTypes ) )
            // InternalLogDsl.g:302:4: (lv_dtype_1_0= ruleDataTypes )
            {
            // InternalLogDsl.g:302:4: (lv_dtype_1_0= ruleDataTypes )
            // InternalLogDsl.g:303:5: lv_dtype_1_0= ruleDataTypes
            {

            					newCompositeNode(grammarAccess.getFieldAccess().getDtypeDataTypesEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_dtype_1_0=ruleDataTypes();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFieldRule());
            					}
            					set(
            						current,
            						"dtype",
            						lv_dtype_1_0,
            						"com.senacor.bdm.logdsl.LogDsl.DataTypes");
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
    // $ANTLR end "ruleField"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalLogDsl.g:324:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalLogDsl.g:324:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalLogDsl.g:325:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalLogDsl.g:331:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_ID_0= RULE_ID kw= '.' )* this_ID_2= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalLogDsl.g:337:2: ( ( (this_ID_0= RULE_ID kw= '.' )* this_ID_2= RULE_ID ) )
            // InternalLogDsl.g:338:2: ( (this_ID_0= RULE_ID kw= '.' )* this_ID_2= RULE_ID )
            {
            // InternalLogDsl.g:338:2: ( (this_ID_0= RULE_ID kw= '.' )* this_ID_2= RULE_ID )
            // InternalLogDsl.g:339:3: (this_ID_0= RULE_ID kw= '.' )* this_ID_2= RULE_ID
            {
            // InternalLogDsl.g:339:3: (this_ID_0= RULE_ID kw= '.' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    int LA4_1 = input.LA(2);

                    if ( (LA4_1==16) ) {
                        alt4=1;
                    }


                }


                switch (alt4) {
            	case 1 :
            	    // InternalLogDsl.g:340:4: this_ID_0= RULE_ID kw= '.'
            	    {
            	    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            	    				current.merge(this_ID_0);
            	    			

            	    				newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0_0());
            	    			
            	    kw=(Token)match(input,16,FOLLOW_3); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_0_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop4;
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


    // $ANTLR start "ruleDataTypes"
    // InternalLogDsl.g:364:1: ruleDataTypes returns [Enumerator current=null] : ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Number' ) ) ;
    public final Enumerator ruleDataTypes() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalLogDsl.g:370:2: ( ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Number' ) ) )
            // InternalLogDsl.g:371:2: ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Number' ) )
            {
            // InternalLogDsl.g:371:2: ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Number' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            else if ( (LA5_0==18) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalLogDsl.g:372:3: (enumLiteral_0= 'String' )
                    {
                    // InternalLogDsl.g:372:3: (enumLiteral_0= 'String' )
                    // InternalLogDsl.g:373:4: enumLiteral_0= 'String'
                    {
                    enumLiteral_0=(Token)match(input,17,FOLLOW_2); 

                    				current = grammarAccess.getDataTypesAccess().getStringEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDataTypesAccess().getStringEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalLogDsl.g:380:3: (enumLiteral_1= 'Number' )
                    {
                    // InternalLogDsl.g:380:3: (enumLiteral_1= 'Number' )
                    // InternalLogDsl.g:381:4: enumLiteral_1= 'Number'
                    {
                    enumLiteral_1=(Token)match(input,18,FOLLOW_2); 

                    				current = grammarAccess.getDataTypesAccess().getNumberEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDataTypesAccess().getNumberEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleDataTypes"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001012L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010000L});

}