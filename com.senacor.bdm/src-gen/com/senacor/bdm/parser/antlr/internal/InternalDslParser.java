package com.senacor.bdm.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.senacor.bdm.services.DslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'BaseEntity'", "'{'", "'}'", "'ExtensionSatelite'", "'Feld'", "'.'"
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
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalDsl.g"; }



     	private DslGrammarAccess grammarAccess;

        public InternalDslParser(TokenStream input, DslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "LogDocument";
       	}

       	@Override
       	protected DslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleLogDocument"
    // InternalDsl.g:64:1: entryRuleLogDocument returns [EObject current=null] : iv_ruleLogDocument= ruleLogDocument EOF ;
    public final EObject entryRuleLogDocument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogDocument = null;


        try {
            // InternalDsl.g:64:52: (iv_ruleLogDocument= ruleLogDocument EOF )
            // InternalDsl.g:65:2: iv_ruleLogDocument= ruleLogDocument EOF
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
    // InternalDsl.g:71:1: ruleLogDocument returns [EObject current=null] : ( () otherlv_1= 'package' ( (lv_name_2_0= ruleQualifiedName ) ) ( (lv_members_3_0= ruleMember ) ) ) ;
    public final EObject ruleLogDocument() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_members_3_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:77:2: ( ( () otherlv_1= 'package' ( (lv_name_2_0= ruleQualifiedName ) ) ( (lv_members_3_0= ruleMember ) ) ) )
            // InternalDsl.g:78:2: ( () otherlv_1= 'package' ( (lv_name_2_0= ruleQualifiedName ) ) ( (lv_members_3_0= ruleMember ) ) )
            {
            // InternalDsl.g:78:2: ( () otherlv_1= 'package' ( (lv_name_2_0= ruleQualifiedName ) ) ( (lv_members_3_0= ruleMember ) ) )
            // InternalDsl.g:79:3: () otherlv_1= 'package' ( (lv_name_2_0= ruleQualifiedName ) ) ( (lv_members_3_0= ruleMember ) )
            {
            // InternalDsl.g:79:3: ()
            // InternalDsl.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLogDocumentAccess().getLogDocumentAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getLogDocumentAccess().getPackageKeyword_1());
            		
            // InternalDsl.g:90:3: ( (lv_name_2_0= ruleQualifiedName ) )
            // InternalDsl.g:91:4: (lv_name_2_0= ruleQualifiedName )
            {
            // InternalDsl.g:91:4: (lv_name_2_0= ruleQualifiedName )
            // InternalDsl.g:92:5: lv_name_2_0= ruleQualifiedName
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
            						"com.senacor.bdm.Dsl.QualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDsl.g:109:3: ( (lv_members_3_0= ruleMember ) )
            // InternalDsl.g:110:4: (lv_members_3_0= ruleMember )
            {
            // InternalDsl.g:110:4: (lv_members_3_0= ruleMember )
            // InternalDsl.g:111:5: lv_members_3_0= ruleMember
            {

            					newCompositeNode(grammarAccess.getLogDocumentAccess().getMembersMemberParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_members_3_0=ruleMember();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLogDocumentRule());
            					}
            					add(
            						current,
            						"members",
            						lv_members_3_0,
            						"com.senacor.bdm.Dsl.Member");
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


    // $ANTLR start "entryRuleMember"
    // InternalDsl.g:132:1: entryRuleMember returns [EObject current=null] : iv_ruleMember= ruleMember EOF ;
    public final EObject entryRuleMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMember = null;


        try {
            // InternalDsl.g:132:47: (iv_ruleMember= ruleMember EOF )
            // InternalDsl.g:133:2: iv_ruleMember= ruleMember EOF
            {
             newCompositeNode(grammarAccess.getMemberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMember=ruleMember();

            state._fsp--;

             current =iv_ruleMember; 
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
    // $ANTLR end "entryRuleMember"


    // $ANTLR start "ruleMember"
    // InternalDsl.g:139:1: ruleMember returns [EObject current=null] : (this_BaseEntity_0= ruleBaseEntity | this_FieldDeclaration_1= ruleFieldDeclaration | this_ExtensionSatelite_2= ruleExtensionSatelite ) ;
    public final EObject ruleMember() throws RecognitionException {
        EObject current = null;

        EObject this_BaseEntity_0 = null;

        EObject this_FieldDeclaration_1 = null;

        EObject this_ExtensionSatelite_2 = null;



        	enterRule();

        try {
            // InternalDsl.g:145:2: ( (this_BaseEntity_0= ruleBaseEntity | this_FieldDeclaration_1= ruleFieldDeclaration | this_ExtensionSatelite_2= ruleExtensionSatelite ) )
            // InternalDsl.g:146:2: (this_BaseEntity_0= ruleBaseEntity | this_FieldDeclaration_1= ruleFieldDeclaration | this_ExtensionSatelite_2= ruleExtensionSatelite )
            {
            // InternalDsl.g:146:2: (this_BaseEntity_0= ruleBaseEntity | this_FieldDeclaration_1= ruleFieldDeclaration | this_ExtensionSatelite_2= ruleExtensionSatelite )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt1=1;
                }
                break;
            case 16:
                {
                alt1=2;
                }
                break;
            case 15:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalDsl.g:147:3: this_BaseEntity_0= ruleBaseEntity
                    {

                    			newCompositeNode(grammarAccess.getMemberAccess().getBaseEntityParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_BaseEntity_0=ruleBaseEntity();

                    state._fsp--;


                    			current = this_BaseEntity_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDsl.g:156:3: this_FieldDeclaration_1= ruleFieldDeclaration
                    {

                    			newCompositeNode(grammarAccess.getMemberAccess().getFieldDeclarationParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_FieldDeclaration_1=ruleFieldDeclaration();

                    state._fsp--;


                    			current = this_FieldDeclaration_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalDsl.g:165:3: this_ExtensionSatelite_2= ruleExtensionSatelite
                    {

                    			newCompositeNode(grammarAccess.getMemberAccess().getExtensionSateliteParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExtensionSatelite_2=ruleExtensionSatelite();

                    state._fsp--;


                    			current = this_ExtensionSatelite_2;
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
    // $ANTLR end "ruleMember"


    // $ANTLR start "entryRuleBaseEntity"
    // InternalDsl.g:177:1: entryRuleBaseEntity returns [EObject current=null] : iv_ruleBaseEntity= ruleBaseEntity EOF ;
    public final EObject entryRuleBaseEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBaseEntity = null;


        try {
            // InternalDsl.g:177:51: (iv_ruleBaseEntity= ruleBaseEntity EOF )
            // InternalDsl.g:178:2: iv_ruleBaseEntity= ruleBaseEntity EOF
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
    // InternalDsl.g:184:1: ruleBaseEntity returns [EObject current=null] : ( () otherlv_1= 'BaseEntity' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_fielddeclarations_4_0= ruleFieldDeclaration ) ) otherlv_5= '}' ) ;
    public final EObject ruleBaseEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_fielddeclarations_4_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:190:2: ( ( () otherlv_1= 'BaseEntity' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_fielddeclarations_4_0= ruleFieldDeclaration ) ) otherlv_5= '}' ) )
            // InternalDsl.g:191:2: ( () otherlv_1= 'BaseEntity' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_fielddeclarations_4_0= ruleFieldDeclaration ) ) otherlv_5= '}' )
            {
            // InternalDsl.g:191:2: ( () otherlv_1= 'BaseEntity' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_fielddeclarations_4_0= ruleFieldDeclaration ) ) otherlv_5= '}' )
            // InternalDsl.g:192:3: () otherlv_1= 'BaseEntity' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_fielddeclarations_4_0= ruleFieldDeclaration ) ) otherlv_5= '}'
            {
            // InternalDsl.g:192:3: ()
            // InternalDsl.g:193:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBaseEntityAccess().getBaseEntityAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getBaseEntityAccess().getBaseEntityKeyword_1());
            		
            // InternalDsl.g:203:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalDsl.g:204:4: (lv_name_2_0= RULE_ID )
            {
            // InternalDsl.g:204:4: (lv_name_2_0= RULE_ID )
            // InternalDsl.g:205:5: lv_name_2_0= RULE_ID
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
            						"com.senacor.bdm.Dsl.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getBaseEntityAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalDsl.g:225:3: ( (lv_fielddeclarations_4_0= ruleFieldDeclaration ) )
            // InternalDsl.g:226:4: (lv_fielddeclarations_4_0= ruleFieldDeclaration )
            {
            // InternalDsl.g:226:4: (lv_fielddeclarations_4_0= ruleFieldDeclaration )
            // InternalDsl.g:227:5: lv_fielddeclarations_4_0= ruleFieldDeclaration
            {

            					newCompositeNode(grammarAccess.getBaseEntityAccess().getFielddeclarationsFieldDeclarationParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_7);
            lv_fielddeclarations_4_0=ruleFieldDeclaration();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBaseEntityRule());
            					}
            					add(
            						current,
            						"fielddeclarations",
            						lv_fielddeclarations_4_0,
            						"com.senacor.bdm.Dsl.FieldDeclaration");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getBaseEntityAccess().getRightCurlyBracketKeyword_5());
            		

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


    // $ANTLR start "entryRuleExtensionSatelite"
    // InternalDsl.g:252:1: entryRuleExtensionSatelite returns [EObject current=null] : iv_ruleExtensionSatelite= ruleExtensionSatelite EOF ;
    public final EObject entryRuleExtensionSatelite() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtensionSatelite = null;


        try {
            // InternalDsl.g:252:58: (iv_ruleExtensionSatelite= ruleExtensionSatelite EOF )
            // InternalDsl.g:253:2: iv_ruleExtensionSatelite= ruleExtensionSatelite EOF
            {
             newCompositeNode(grammarAccess.getExtensionSateliteRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExtensionSatelite=ruleExtensionSatelite();

            state._fsp--;

             current =iv_ruleExtensionSatelite; 
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
    // $ANTLR end "entryRuleExtensionSatelite"


    // $ANTLR start "ruleExtensionSatelite"
    // InternalDsl.g:259:1: ruleExtensionSatelite returns [EObject current=null] : ( () otherlv_1= 'ExtensionSatelite' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_fielddeclarations_4_0= ruleFieldDeclaration ) ) otherlv_5= '}' ) ;
    public final EObject ruleExtensionSatelite() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_fielddeclarations_4_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:265:2: ( ( () otherlv_1= 'ExtensionSatelite' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_fielddeclarations_4_0= ruleFieldDeclaration ) ) otherlv_5= '}' ) )
            // InternalDsl.g:266:2: ( () otherlv_1= 'ExtensionSatelite' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_fielddeclarations_4_0= ruleFieldDeclaration ) ) otherlv_5= '}' )
            {
            // InternalDsl.g:266:2: ( () otherlv_1= 'ExtensionSatelite' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_fielddeclarations_4_0= ruleFieldDeclaration ) ) otherlv_5= '}' )
            // InternalDsl.g:267:3: () otherlv_1= 'ExtensionSatelite' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_fielddeclarations_4_0= ruleFieldDeclaration ) ) otherlv_5= '}'
            {
            // InternalDsl.g:267:3: ()
            // InternalDsl.g:268:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getExtensionSateliteAccess().getExtensionSateliteAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getExtensionSateliteAccess().getExtensionSateliteKeyword_1());
            		
            // InternalDsl.g:278:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalDsl.g:279:4: (lv_name_2_0= RULE_ID )
            {
            // InternalDsl.g:279:4: (lv_name_2_0= RULE_ID )
            // InternalDsl.g:280:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_2_0, grammarAccess.getExtensionSateliteAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExtensionSateliteRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"com.senacor.bdm.Dsl.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getExtensionSateliteAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalDsl.g:300:3: ( (lv_fielddeclarations_4_0= ruleFieldDeclaration ) )
            // InternalDsl.g:301:4: (lv_fielddeclarations_4_0= ruleFieldDeclaration )
            {
            // InternalDsl.g:301:4: (lv_fielddeclarations_4_0= ruleFieldDeclaration )
            // InternalDsl.g:302:5: lv_fielddeclarations_4_0= ruleFieldDeclaration
            {

            					newCompositeNode(grammarAccess.getExtensionSateliteAccess().getFielddeclarationsFieldDeclarationParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_7);
            lv_fielddeclarations_4_0=ruleFieldDeclaration();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExtensionSateliteRule());
            					}
            					add(
            						current,
            						"fielddeclarations",
            						lv_fielddeclarations_4_0,
            						"com.senacor.bdm.Dsl.FieldDeclaration");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getExtensionSateliteAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleExtensionSatelite"


    // $ANTLR start "entryRuleFieldDeclaration"
    // InternalDsl.g:327:1: entryRuleFieldDeclaration returns [EObject current=null] : iv_ruleFieldDeclaration= ruleFieldDeclaration EOF ;
    public final EObject entryRuleFieldDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFieldDeclaration = null;


        try {
            // InternalDsl.g:327:57: (iv_ruleFieldDeclaration= ruleFieldDeclaration EOF )
            // InternalDsl.g:328:2: iv_ruleFieldDeclaration= ruleFieldDeclaration EOF
            {
             newCompositeNode(grammarAccess.getFieldDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFieldDeclaration=ruleFieldDeclaration();

            state._fsp--;

             current =iv_ruleFieldDeclaration; 
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
    // $ANTLR end "entryRuleFieldDeclaration"


    // $ANTLR start "ruleFieldDeclaration"
    // InternalDsl.g:334:1: ruleFieldDeclaration returns [EObject current=null] : this_Field_0= ruleField ;
    public final EObject ruleFieldDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_Field_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:340:2: (this_Field_0= ruleField )
            // InternalDsl.g:341:2: this_Field_0= ruleField
            {

            		newCompositeNode(grammarAccess.getFieldDeclarationAccess().getFieldParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_Field_0=ruleField();

            state._fsp--;


            		current = this_Field_0;
            		afterParserOrEnumRuleCall();
            	

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
    // $ANTLR end "ruleFieldDeclaration"


    // $ANTLR start "entryRuleField"
    // InternalDsl.g:352:1: entryRuleField returns [EObject current=null] : iv_ruleField= ruleField EOF ;
    public final EObject entryRuleField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleField = null;


        try {
            // InternalDsl.g:352:46: (iv_ruleField= ruleField EOF )
            // InternalDsl.g:353:2: iv_ruleField= ruleField EOF
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
    // InternalDsl.g:359:1: ruleField returns [EObject current=null] : ( () otherlv_1= 'Feld' ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleField() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;


        	enterRule();

        try {
            // InternalDsl.g:365:2: ( ( () otherlv_1= 'Feld' ( (lv_name_2_0= RULE_ID ) ) ) )
            // InternalDsl.g:366:2: ( () otherlv_1= 'Feld' ( (lv_name_2_0= RULE_ID ) ) )
            {
            // InternalDsl.g:366:2: ( () otherlv_1= 'Feld' ( (lv_name_2_0= RULE_ID ) ) )
            // InternalDsl.g:367:3: () otherlv_1= 'Feld' ( (lv_name_2_0= RULE_ID ) )
            {
            // InternalDsl.g:367:3: ()
            // InternalDsl.g:368:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFieldAccess().getFieldAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getFieldAccess().getFeldKeyword_1());
            		
            // InternalDsl.g:378:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalDsl.g:379:4: (lv_name_2_0= RULE_ID )
            {
            // InternalDsl.g:379:4: (lv_name_2_0= RULE_ID )
            // InternalDsl.g:380:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_2_0, grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFieldRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"com.senacor.bdm.Dsl.ID");
            				

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
    // InternalDsl.g:400:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalDsl.g:400:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalDsl.g:401:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalDsl.g:407:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_ID_0= RULE_ID kw= '.' )* this_ID_2= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalDsl.g:413:2: ( ( (this_ID_0= RULE_ID kw= '.' )* this_ID_2= RULE_ID ) )
            // InternalDsl.g:414:2: ( (this_ID_0= RULE_ID kw= '.' )* this_ID_2= RULE_ID )
            {
            // InternalDsl.g:414:2: ( (this_ID_0= RULE_ID kw= '.' )* this_ID_2= RULE_ID )
            // InternalDsl.g:415:3: (this_ID_0= RULE_ID kw= '.' )* this_ID_2= RULE_ID
            {
            // InternalDsl.g:415:3: (this_ID_0= RULE_ID kw= '.' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    int LA2_1 = input.LA(2);

                    if ( (LA2_1==17) ) {
                        alt2=1;
                    }


                }


                switch (alt2) {
            	case 1 :
            	    // InternalDsl.g:416:4: this_ID_0= RULE_ID kw= '.'
            	    {
            	    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            	    				current.merge(this_ID_0);
            	    			

            	    				newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0_0());
            	    			
            	    kw=(Token)match(input,17,FOLLOW_3); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_0_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop2;
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
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000019000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});

}