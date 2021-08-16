package com.senacor.bdm.logdsl.ide.contentassist.antlr.internal;

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
import com.senacor.bdm.logdsl.services.LogDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalLogDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'String'", "'Number'", "'package'", "'Entity'", "'Fields'", "':'", "'-'", "'.'"
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

    	public void setGrammarAccess(LogDslGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleLogDocument"
    // InternalLogDsl.g:53:1: entryRuleLogDocument : ruleLogDocument EOF ;
    public final void entryRuleLogDocument() throws RecognitionException {
        try {
            // InternalLogDsl.g:54:1: ( ruleLogDocument EOF )
            // InternalLogDsl.g:55:1: ruleLogDocument EOF
            {
             before(grammarAccess.getLogDocumentRule()); 
            pushFollow(FOLLOW_1);
            ruleLogDocument();

            state._fsp--;

             after(grammarAccess.getLogDocumentRule()); 
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
    // $ANTLR end "entryRuleLogDocument"


    // $ANTLR start "ruleLogDocument"
    // InternalLogDsl.g:62:1: ruleLogDocument : ( ( rule__LogDocument__Group__0 ) ) ;
    public final void ruleLogDocument() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogDsl.g:66:2: ( ( ( rule__LogDocument__Group__0 ) ) )
            // InternalLogDsl.g:67:2: ( ( rule__LogDocument__Group__0 ) )
            {
            // InternalLogDsl.g:67:2: ( ( rule__LogDocument__Group__0 ) )
            // InternalLogDsl.g:68:3: ( rule__LogDocument__Group__0 )
            {
             before(grammarAccess.getLogDocumentAccess().getGroup()); 
            // InternalLogDsl.g:69:3: ( rule__LogDocument__Group__0 )
            // InternalLogDsl.g:69:4: rule__LogDocument__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LogDocument__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLogDocumentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLogDocument"


    // $ANTLR start "entryRulemember"
    // InternalLogDsl.g:78:1: entryRulemember : rulemember EOF ;
    public final void entryRulemember() throws RecognitionException {
        try {
            // InternalLogDsl.g:79:1: ( rulemember EOF )
            // InternalLogDsl.g:80:1: rulemember EOF
            {
             before(grammarAccess.getMemberRule()); 
            pushFollow(FOLLOW_1);
            rulemember();

            state._fsp--;

             after(grammarAccess.getMemberRule()); 
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
    // $ANTLR end "entryRulemember"


    // $ANTLR start "rulemember"
    // InternalLogDsl.g:87:1: rulemember : ( ( rule__Member__Alternatives ) ) ;
    public final void rulemember() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogDsl.g:91:2: ( ( ( rule__Member__Alternatives ) ) )
            // InternalLogDsl.g:92:2: ( ( rule__Member__Alternatives ) )
            {
            // InternalLogDsl.g:92:2: ( ( rule__Member__Alternatives ) )
            // InternalLogDsl.g:93:3: ( rule__Member__Alternatives )
            {
             before(grammarAccess.getMemberAccess().getAlternatives()); 
            // InternalLogDsl.g:94:3: ( rule__Member__Alternatives )
            // InternalLogDsl.g:94:4: rule__Member__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Member__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMemberAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulemember"


    // $ANTLR start "entryRuleEntity"
    // InternalLogDsl.g:103:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // InternalLogDsl.g:104:1: ( ruleEntity EOF )
            // InternalLogDsl.g:105:1: ruleEntity EOF
            {
             before(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_1);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getEntityRule()); 
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
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // InternalLogDsl.g:112:1: ruleEntity : ( ( rule__Entity__Group__0 ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogDsl.g:116:2: ( ( ( rule__Entity__Group__0 ) ) )
            // InternalLogDsl.g:117:2: ( ( rule__Entity__Group__0 ) )
            {
            // InternalLogDsl.g:117:2: ( ( rule__Entity__Group__0 ) )
            // InternalLogDsl.g:118:3: ( rule__Entity__Group__0 )
            {
             before(grammarAccess.getEntityAccess().getGroup()); 
            // InternalLogDsl.g:119:3: ( rule__Entity__Group__0 )
            // InternalLogDsl.g:119:4: rule__Entity__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleField"
    // InternalLogDsl.g:128:1: entryRuleField : ruleField EOF ;
    public final void entryRuleField() throws RecognitionException {
        try {
            // InternalLogDsl.g:129:1: ( ruleField EOF )
            // InternalLogDsl.g:130:1: ruleField EOF
            {
             before(grammarAccess.getFieldRule()); 
            pushFollow(FOLLOW_1);
            ruleField();

            state._fsp--;

             after(grammarAccess.getFieldRule()); 
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
    // $ANTLR end "entryRuleField"


    // $ANTLR start "ruleField"
    // InternalLogDsl.g:137:1: ruleField : ( ( rule__Field__Group__0 ) ) ;
    public final void ruleField() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogDsl.g:141:2: ( ( ( rule__Field__Group__0 ) ) )
            // InternalLogDsl.g:142:2: ( ( rule__Field__Group__0 ) )
            {
            // InternalLogDsl.g:142:2: ( ( rule__Field__Group__0 ) )
            // InternalLogDsl.g:143:3: ( rule__Field__Group__0 )
            {
             before(grammarAccess.getFieldAccess().getGroup()); 
            // InternalLogDsl.g:144:3: ( rule__Field__Group__0 )
            // InternalLogDsl.g:144:4: rule__Field__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Field__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFieldAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleField"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalLogDsl.g:153:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalLogDsl.g:154:1: ( ruleQualifiedName EOF )
            // InternalLogDsl.g:155:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalLogDsl.g:162:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogDsl.g:166:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalLogDsl.g:167:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalLogDsl.g:167:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalLogDsl.g:168:3: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // InternalLogDsl.g:169:3: ( rule__QualifiedName__Group__0 )
            // InternalLogDsl.g:169:4: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "ruleDataTypes"
    // InternalLogDsl.g:178:1: ruleDataTypes : ( ( rule__DataTypes__Alternatives ) ) ;
    public final void ruleDataTypes() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogDsl.g:182:1: ( ( ( rule__DataTypes__Alternatives ) ) )
            // InternalLogDsl.g:183:2: ( ( rule__DataTypes__Alternatives ) )
            {
            // InternalLogDsl.g:183:2: ( ( rule__DataTypes__Alternatives ) )
            // InternalLogDsl.g:184:3: ( rule__DataTypes__Alternatives )
            {
             before(grammarAccess.getDataTypesAccess().getAlternatives()); 
            // InternalLogDsl.g:185:3: ( rule__DataTypes__Alternatives )
            // InternalLogDsl.g:185:4: rule__DataTypes__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__DataTypes__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDataTypesAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDataTypes"


    // $ANTLR start "rule__Member__Alternatives"
    // InternalLogDsl.g:193:1: rule__Member__Alternatives : ( ( ruleEntity ) | ( ruleField ) );
    public final void rule__Member__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogDsl.g:197:1: ( ( ruleEntity ) | ( ruleField ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==14) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalLogDsl.g:198:2: ( ruleEntity )
                    {
                    // InternalLogDsl.g:198:2: ( ruleEntity )
                    // InternalLogDsl.g:199:3: ruleEntity
                    {
                     before(grammarAccess.getMemberAccess().getEntityParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleEntity();

                    state._fsp--;

                     after(grammarAccess.getMemberAccess().getEntityParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLogDsl.g:204:2: ( ruleField )
                    {
                    // InternalLogDsl.g:204:2: ( ruleField )
                    // InternalLogDsl.g:205:3: ruleField
                    {
                     before(grammarAccess.getMemberAccess().getFieldParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleField();

                    state._fsp--;

                     after(grammarAccess.getMemberAccess().getFieldParserRuleCall_1()); 

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
    // $ANTLR end "rule__Member__Alternatives"


    // $ANTLR start "rule__DataTypes__Alternatives"
    // InternalLogDsl.g:214:1: rule__DataTypes__Alternatives : ( ( ( 'String' ) ) | ( ( 'Number' ) ) );
    public final void rule__DataTypes__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogDsl.g:218:1: ( ( ( 'String' ) ) | ( ( 'Number' ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==12) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalLogDsl.g:219:2: ( ( 'String' ) )
                    {
                    // InternalLogDsl.g:219:2: ( ( 'String' ) )
                    // InternalLogDsl.g:220:3: ( 'String' )
                    {
                     before(grammarAccess.getDataTypesAccess().getStringEnumLiteralDeclaration_0()); 
                    // InternalLogDsl.g:221:3: ( 'String' )
                    // InternalLogDsl.g:221:4: 'String'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypesAccess().getStringEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLogDsl.g:225:2: ( ( 'Number' ) )
                    {
                    // InternalLogDsl.g:225:2: ( ( 'Number' ) )
                    // InternalLogDsl.g:226:3: ( 'Number' )
                    {
                     before(grammarAccess.getDataTypesAccess().getNumberEnumLiteralDeclaration_1()); 
                    // InternalLogDsl.g:227:3: ( 'Number' )
                    // InternalLogDsl.g:227:4: 'Number'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypesAccess().getNumberEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__DataTypes__Alternatives"


    // $ANTLR start "rule__LogDocument__Group__0"
    // InternalLogDsl.g:235:1: rule__LogDocument__Group__0 : rule__LogDocument__Group__0__Impl rule__LogDocument__Group__1 ;
    public final void rule__LogDocument__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogDsl.g:239:1: ( rule__LogDocument__Group__0__Impl rule__LogDocument__Group__1 )
            // InternalLogDsl.g:240:2: rule__LogDocument__Group__0__Impl rule__LogDocument__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__LogDocument__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LogDocument__Group__1();

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
    // $ANTLR end "rule__LogDocument__Group__0"


    // $ANTLR start "rule__LogDocument__Group__0__Impl"
    // InternalLogDsl.g:247:1: rule__LogDocument__Group__0__Impl : ( () ) ;
    public final void rule__LogDocument__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogDsl.g:251:1: ( ( () ) )
            // InternalLogDsl.g:252:1: ( () )
            {
            // InternalLogDsl.g:252:1: ( () )
            // InternalLogDsl.g:253:2: ()
            {
             before(grammarAccess.getLogDocumentAccess().getLogDocumentAction_0()); 
            // InternalLogDsl.g:254:2: ()
            // InternalLogDsl.g:254:3: 
            {
            }

             after(grammarAccess.getLogDocumentAccess().getLogDocumentAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogDocument__Group__0__Impl"


    // $ANTLR start "rule__LogDocument__Group__1"
    // InternalLogDsl.g:262:1: rule__LogDocument__Group__1 : rule__LogDocument__Group__1__Impl rule__LogDocument__Group__2 ;
    public final void rule__LogDocument__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogDsl.g:266:1: ( rule__LogDocument__Group__1__Impl rule__LogDocument__Group__2 )
            // InternalLogDsl.g:267:2: rule__LogDocument__Group__1__Impl rule__LogDocument__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__LogDocument__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LogDocument__Group__2();

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
    // $ANTLR end "rule__LogDocument__Group__1"


    // $ANTLR start "rule__LogDocument__Group__1__Impl"
    // InternalLogDsl.g:274:1: rule__LogDocument__Group__1__Impl : ( 'package' ) ;
    public final void rule__LogDocument__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogDsl.g:278:1: ( ( 'package' ) )
            // InternalLogDsl.g:279:1: ( 'package' )
            {
            // InternalLogDsl.g:279:1: ( 'package' )
            // InternalLogDsl.g:280:2: 'package'
            {
             before(grammarAccess.getLogDocumentAccess().getPackageKeyword_1()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getLogDocumentAccess().getPackageKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogDocument__Group__1__Impl"


    // $ANTLR start "rule__LogDocument__Group__2"
    // InternalLogDsl.g:289:1: rule__LogDocument__Group__2 : rule__LogDocument__Group__2__Impl rule__LogDocument__Group__3 ;
    public final void rule__LogDocument__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogDsl.g:293:1: ( rule__LogDocument__Group__2__Impl rule__LogDocument__Group__3 )
            // InternalLogDsl.g:294:2: rule__LogDocument__Group__2__Impl rule__LogDocument__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__LogDocument__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LogDocument__Group__3();

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
    // $ANTLR end "rule__LogDocument__Group__2"


    // $ANTLR start "rule__LogDocument__Group__2__Impl"
    // InternalLogDsl.g:301:1: rule__LogDocument__Group__2__Impl : ( ( rule__LogDocument__NameAssignment_2 ) ) ;
    public final void rule__LogDocument__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogDsl.g:305:1: ( ( ( rule__LogDocument__NameAssignment_2 ) ) )
            // InternalLogDsl.g:306:1: ( ( rule__LogDocument__NameAssignment_2 ) )
            {
            // InternalLogDsl.g:306:1: ( ( rule__LogDocument__NameAssignment_2 ) )
            // InternalLogDsl.g:307:2: ( rule__LogDocument__NameAssignment_2 )
            {
             before(grammarAccess.getLogDocumentAccess().getNameAssignment_2()); 
            // InternalLogDsl.g:308:2: ( rule__LogDocument__NameAssignment_2 )
            // InternalLogDsl.g:308:3: rule__LogDocument__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__LogDocument__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLogDocumentAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogDocument__Group__2__Impl"


    // $ANTLR start "rule__LogDocument__Group__3"
    // InternalLogDsl.g:316:1: rule__LogDocument__Group__3 : rule__LogDocument__Group__3__Impl ;
    public final void rule__LogDocument__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogDsl.g:320:1: ( rule__LogDocument__Group__3__Impl )
            // InternalLogDsl.g:321:2: rule__LogDocument__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LogDocument__Group__3__Impl();

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
    // $ANTLR end "rule__LogDocument__Group__3"


    // $ANTLR start "rule__LogDocument__Group__3__Impl"
    // InternalLogDsl.g:327:1: rule__LogDocument__Group__3__Impl : ( ( rule__LogDocument__MemberAssignment_3 )* ) ;
    public final void rule__LogDocument__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogDsl.g:331:1: ( ( ( rule__LogDocument__MemberAssignment_3 )* ) )
            // InternalLogDsl.g:332:1: ( ( rule__LogDocument__MemberAssignment_3 )* )
            {
            // InternalLogDsl.g:332:1: ( ( rule__LogDocument__MemberAssignment_3 )* )
            // InternalLogDsl.g:333:2: ( rule__LogDocument__MemberAssignment_3 )*
            {
             before(grammarAccess.getLogDocumentAccess().getMemberAssignment_3()); 
            // InternalLogDsl.g:334:2: ( rule__LogDocument__MemberAssignment_3 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID||LA3_0==14) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalLogDsl.g:334:3: rule__LogDocument__MemberAssignment_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__LogDocument__MemberAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getLogDocumentAccess().getMemberAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogDocument__Group__3__Impl"


    // $ANTLR start "rule__Entity__Group__0"
    // InternalLogDsl.g:343:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogDsl.g:347:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // InternalLogDsl.g:348:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Entity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__1();

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
    // $ANTLR end "rule__Entity__Group__0"


    // $ANTLR start "rule__Entity__Group__0__Impl"
    // InternalLogDsl.g:355:1: rule__Entity__Group__0__Impl : ( 'Entity' ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogDsl.g:359:1: ( ( 'Entity' ) )
            // InternalLogDsl.g:360:1: ( 'Entity' )
            {
            // InternalLogDsl.g:360:1: ( 'Entity' )
            // InternalLogDsl.g:361:2: 'Entity'
            {
             before(grammarAccess.getEntityAccess().getEntityKeyword_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getEntityKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__0__Impl"


    // $ANTLR start "rule__Entity__Group__1"
    // InternalLogDsl.g:370:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogDsl.g:374:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // InternalLogDsl.g:375:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Entity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__2();

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
    // $ANTLR end "rule__Entity__Group__1"


    // $ANTLR start "rule__Entity__Group__1__Impl"
    // InternalLogDsl.g:382:1: rule__Entity__Group__1__Impl : ( ( rule__Entity__NameAssignment_1 ) ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogDsl.g:386:1: ( ( ( rule__Entity__NameAssignment_1 ) ) )
            // InternalLogDsl.g:387:1: ( ( rule__Entity__NameAssignment_1 ) )
            {
            // InternalLogDsl.g:387:1: ( ( rule__Entity__NameAssignment_1 ) )
            // InternalLogDsl.g:388:2: ( rule__Entity__NameAssignment_1 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_1()); 
            // InternalLogDsl.g:389:2: ( rule__Entity__NameAssignment_1 )
            // InternalLogDsl.g:389:3: rule__Entity__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Entity__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__1__Impl"


    // $ANTLR start "rule__Entity__Group__2"
    // InternalLogDsl.g:397:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogDsl.g:401:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // InternalLogDsl.g:402:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__Entity__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__3();

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
    // $ANTLR end "rule__Entity__Group__2"


    // $ANTLR start "rule__Entity__Group__2__Impl"
    // InternalLogDsl.g:409:1: rule__Entity__Group__2__Impl : ( 'Fields' ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogDsl.g:413:1: ( ( 'Fields' ) )
            // InternalLogDsl.g:414:1: ( 'Fields' )
            {
            // InternalLogDsl.g:414:1: ( 'Fields' )
            // InternalLogDsl.g:415:2: 'Fields'
            {
             before(grammarAccess.getEntityAccess().getFieldsKeyword_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getFieldsKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__2__Impl"


    // $ANTLR start "rule__Entity__Group__3"
    // InternalLogDsl.g:424:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl rule__Entity__Group__4 ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogDsl.g:428:1: ( rule__Entity__Group__3__Impl rule__Entity__Group__4 )
            // InternalLogDsl.g:429:2: rule__Entity__Group__3__Impl rule__Entity__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__Entity__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__4();

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
    // $ANTLR end "rule__Entity__Group__3"


    // $ANTLR start "rule__Entity__Group__3__Impl"
    // InternalLogDsl.g:436:1: rule__Entity__Group__3__Impl : ( ':' ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogDsl.g:440:1: ( ( ':' ) )
            // InternalLogDsl.g:441:1: ( ':' )
            {
            // InternalLogDsl.g:441:1: ( ':' )
            // InternalLogDsl.g:442:2: ':'
            {
             before(grammarAccess.getEntityAccess().getColonKeyword_3()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getColonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__3__Impl"


    // $ANTLR start "rule__Entity__Group__4"
    // InternalLogDsl.g:451:1: rule__Entity__Group__4 : rule__Entity__Group__4__Impl ;
    public final void rule__Entity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogDsl.g:455:1: ( rule__Entity__Group__4__Impl )
            // InternalLogDsl.g:456:2: rule__Entity__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group__4__Impl();

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
    // $ANTLR end "rule__Entity__Group__4"


    // $ANTLR start "rule__Entity__Group__4__Impl"
    // InternalLogDsl.g:462:1: rule__Entity__Group__4__Impl : ( ( rule__Entity__Group_4__0 ) ) ;
    public final void rule__Entity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogDsl.g:466:1: ( ( ( rule__Entity__Group_4__0 ) ) )
            // InternalLogDsl.g:467:1: ( ( rule__Entity__Group_4__0 ) )
            {
            // InternalLogDsl.g:467:1: ( ( rule__Entity__Group_4__0 ) )
            // InternalLogDsl.g:468:2: ( rule__Entity__Group_4__0 )
            {
             before(grammarAccess.getEntityAccess().getGroup_4()); 
            // InternalLogDsl.g:469:2: ( rule__Entity__Group_4__0 )
            // InternalLogDsl.g:469:3: rule__Entity__Group_4__0
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group_4__0();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__4__Impl"


    // $ANTLR start "rule__Entity__Group_4__0"
    // InternalLogDsl.g:478:1: rule__Entity__Group_4__0 : rule__Entity__Group_4__0__Impl rule__Entity__Group_4__1 ;
    public final void rule__Entity__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogDsl.g:482:1: ( rule__Entity__Group_4__0__Impl rule__Entity__Group_4__1 )
            // InternalLogDsl.g:483:2: rule__Entity__Group_4__0__Impl rule__Entity__Group_4__1
            {
            pushFollow(FOLLOW_5);
            rule__Entity__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group_4__1();

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
    // $ANTLR end "rule__Entity__Group_4__0"


    // $ANTLR start "rule__Entity__Group_4__0__Impl"
    // InternalLogDsl.g:490:1: rule__Entity__Group_4__0__Impl : ( '-' ) ;
    public final void rule__Entity__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogDsl.g:494:1: ( ( '-' ) )
            // InternalLogDsl.g:495:1: ( '-' )
            {
            // InternalLogDsl.g:495:1: ( '-' )
            // InternalLogDsl.g:496:2: '-'
            {
             before(grammarAccess.getEntityAccess().getHyphenMinusKeyword_4_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getHyphenMinusKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_4__0__Impl"


    // $ANTLR start "rule__Entity__Group_4__1"
    // InternalLogDsl.g:505:1: rule__Entity__Group_4__1 : rule__Entity__Group_4__1__Impl rule__Entity__Group_4__2 ;
    public final void rule__Entity__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogDsl.g:509:1: ( rule__Entity__Group_4__1__Impl rule__Entity__Group_4__2 )
            // InternalLogDsl.g:510:2: rule__Entity__Group_4__1__Impl rule__Entity__Group_4__2
            {
            pushFollow(FOLLOW_9);
            rule__Entity__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group_4__2();

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
    // $ANTLR end "rule__Entity__Group_4__1"


    // $ANTLR start "rule__Entity__Group_4__1__Impl"
    // InternalLogDsl.g:517:1: rule__Entity__Group_4__1__Impl : ( ( rule__Entity__FieldsAssignment_4_1 ) ) ;
    public final void rule__Entity__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogDsl.g:521:1: ( ( ( rule__Entity__FieldsAssignment_4_1 ) ) )
            // InternalLogDsl.g:522:1: ( ( rule__Entity__FieldsAssignment_4_1 ) )
            {
            // InternalLogDsl.g:522:1: ( ( rule__Entity__FieldsAssignment_4_1 ) )
            // InternalLogDsl.g:523:2: ( rule__Entity__FieldsAssignment_4_1 )
            {
             before(grammarAccess.getEntityAccess().getFieldsAssignment_4_1()); 
            // InternalLogDsl.g:524:2: ( rule__Entity__FieldsAssignment_4_1 )
            // InternalLogDsl.g:524:3: rule__Entity__FieldsAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Entity__FieldsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getFieldsAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_4__1__Impl"


    // $ANTLR start "rule__Entity__Group_4__2"
    // InternalLogDsl.g:532:1: rule__Entity__Group_4__2 : rule__Entity__Group_4__2__Impl ;
    public final void rule__Entity__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogDsl.g:536:1: ( rule__Entity__Group_4__2__Impl )
            // InternalLogDsl.g:537:2: rule__Entity__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group_4__2__Impl();

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
    // $ANTLR end "rule__Entity__Group_4__2"


    // $ANTLR start "rule__Entity__Group_4__2__Impl"
    // InternalLogDsl.g:543:1: rule__Entity__Group_4__2__Impl : ( ( rule__Entity__Group_4_2__0 )* ) ;
    public final void rule__Entity__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogDsl.g:547:1: ( ( ( rule__Entity__Group_4_2__0 )* ) )
            // InternalLogDsl.g:548:1: ( ( rule__Entity__Group_4_2__0 )* )
            {
            // InternalLogDsl.g:548:1: ( ( rule__Entity__Group_4_2__0 )* )
            // InternalLogDsl.g:549:2: ( rule__Entity__Group_4_2__0 )*
            {
             before(grammarAccess.getEntityAccess().getGroup_4_2()); 
            // InternalLogDsl.g:550:2: ( rule__Entity__Group_4_2__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==17) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalLogDsl.g:550:3: rule__Entity__Group_4_2__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Entity__Group_4_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getEntityAccess().getGroup_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_4__2__Impl"


    // $ANTLR start "rule__Entity__Group_4_2__0"
    // InternalLogDsl.g:559:1: rule__Entity__Group_4_2__0 : rule__Entity__Group_4_2__0__Impl rule__Entity__Group_4_2__1 ;
    public final void rule__Entity__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogDsl.g:563:1: ( rule__Entity__Group_4_2__0__Impl rule__Entity__Group_4_2__1 )
            // InternalLogDsl.g:564:2: rule__Entity__Group_4_2__0__Impl rule__Entity__Group_4_2__1
            {
            pushFollow(FOLLOW_5);
            rule__Entity__Group_4_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group_4_2__1();

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
    // $ANTLR end "rule__Entity__Group_4_2__0"


    // $ANTLR start "rule__Entity__Group_4_2__0__Impl"
    // InternalLogDsl.g:571:1: rule__Entity__Group_4_2__0__Impl : ( '-' ) ;
    public final void rule__Entity__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogDsl.g:575:1: ( ( '-' ) )
            // InternalLogDsl.g:576:1: ( '-' )
            {
            // InternalLogDsl.g:576:1: ( '-' )
            // InternalLogDsl.g:577:2: '-'
            {
             before(grammarAccess.getEntityAccess().getHyphenMinusKeyword_4_2_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getHyphenMinusKeyword_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_4_2__0__Impl"


    // $ANTLR start "rule__Entity__Group_4_2__1"
    // InternalLogDsl.g:586:1: rule__Entity__Group_4_2__1 : rule__Entity__Group_4_2__1__Impl ;
    public final void rule__Entity__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogDsl.g:590:1: ( rule__Entity__Group_4_2__1__Impl )
            // InternalLogDsl.g:591:2: rule__Entity__Group_4_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group_4_2__1__Impl();

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
    // $ANTLR end "rule__Entity__Group_4_2__1"


    // $ANTLR start "rule__Entity__Group_4_2__1__Impl"
    // InternalLogDsl.g:597:1: rule__Entity__Group_4_2__1__Impl : ( ( rule__Entity__FieldsAssignment_4_2_1 ) ) ;
    public final void rule__Entity__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogDsl.g:601:1: ( ( ( rule__Entity__FieldsAssignment_4_2_1 ) ) )
            // InternalLogDsl.g:602:1: ( ( rule__Entity__FieldsAssignment_4_2_1 ) )
            {
            // InternalLogDsl.g:602:1: ( ( rule__Entity__FieldsAssignment_4_2_1 ) )
            // InternalLogDsl.g:603:2: ( rule__Entity__FieldsAssignment_4_2_1 )
            {
             before(grammarAccess.getEntityAccess().getFieldsAssignment_4_2_1()); 
            // InternalLogDsl.g:604:2: ( rule__Entity__FieldsAssignment_4_2_1 )
            // InternalLogDsl.g:604:3: rule__Entity__FieldsAssignment_4_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Entity__FieldsAssignment_4_2_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getFieldsAssignment_4_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_4_2__1__Impl"


    // $ANTLR start "rule__Field__Group__0"
    // InternalLogDsl.g:613:1: rule__Field__Group__0 : rule__Field__Group__0__Impl rule__Field__Group__1 ;
    public final void rule__Field__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogDsl.g:617:1: ( rule__Field__Group__0__Impl rule__Field__Group__1 )
            // InternalLogDsl.g:618:2: rule__Field__Group__0__Impl rule__Field__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Field__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Field__Group__1();

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
    // $ANTLR end "rule__Field__Group__0"


    // $ANTLR start "rule__Field__Group__0__Impl"
    // InternalLogDsl.g:625:1: rule__Field__Group__0__Impl : ( ( rule__Field__NameAssignment_0 ) ) ;
    public final void rule__Field__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogDsl.g:629:1: ( ( ( rule__Field__NameAssignment_0 ) ) )
            // InternalLogDsl.g:630:1: ( ( rule__Field__NameAssignment_0 ) )
            {
            // InternalLogDsl.g:630:1: ( ( rule__Field__NameAssignment_0 ) )
            // InternalLogDsl.g:631:2: ( rule__Field__NameAssignment_0 )
            {
             before(grammarAccess.getFieldAccess().getNameAssignment_0()); 
            // InternalLogDsl.g:632:2: ( rule__Field__NameAssignment_0 )
            // InternalLogDsl.g:632:3: rule__Field__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Field__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getFieldAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__0__Impl"


    // $ANTLR start "rule__Field__Group__1"
    // InternalLogDsl.g:640:1: rule__Field__Group__1 : rule__Field__Group__1__Impl ;
    public final void rule__Field__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogDsl.g:644:1: ( rule__Field__Group__1__Impl )
            // InternalLogDsl.g:645:2: rule__Field__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Field__Group__1__Impl();

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
    // $ANTLR end "rule__Field__Group__1"


    // $ANTLR start "rule__Field__Group__1__Impl"
    // InternalLogDsl.g:651:1: rule__Field__Group__1__Impl : ( ( rule__Field__DtypeAssignment_1 ) ) ;
    public final void rule__Field__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogDsl.g:655:1: ( ( ( rule__Field__DtypeAssignment_1 ) ) )
            // InternalLogDsl.g:656:1: ( ( rule__Field__DtypeAssignment_1 ) )
            {
            // InternalLogDsl.g:656:1: ( ( rule__Field__DtypeAssignment_1 ) )
            // InternalLogDsl.g:657:2: ( rule__Field__DtypeAssignment_1 )
            {
             before(grammarAccess.getFieldAccess().getDtypeAssignment_1()); 
            // InternalLogDsl.g:658:2: ( rule__Field__DtypeAssignment_1 )
            // InternalLogDsl.g:658:3: rule__Field__DtypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Field__DtypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFieldAccess().getDtypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // InternalLogDsl.g:667:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogDsl.g:671:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalLogDsl.g:672:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1();

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
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // InternalLogDsl.g:679:1: rule__QualifiedName__Group__0__Impl : ( ( rule__QualifiedName__Group_0__0 )* ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogDsl.g:683:1: ( ( ( rule__QualifiedName__Group_0__0 )* ) )
            // InternalLogDsl.g:684:1: ( ( rule__QualifiedName__Group_0__0 )* )
            {
            // InternalLogDsl.g:684:1: ( ( rule__QualifiedName__Group_0__0 )* )
            // InternalLogDsl.g:685:2: ( rule__QualifiedName__Group_0__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_0()); 
            // InternalLogDsl.g:686:2: ( rule__QualifiedName__Group_0__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID) ) {
                    int LA5_1 = input.LA(2);

                    if ( (LA5_1==18) ) {
                        alt5=1;
                    }


                }


                switch (alt5) {
            	case 1 :
            	    // InternalLogDsl.g:686:3: rule__QualifiedName__Group_0__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__QualifiedName__Group_0__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getQualifiedNameAccess().getGroup_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // InternalLogDsl.g:694:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogDsl.g:698:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalLogDsl.g:699:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1__Impl();

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
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // InternalLogDsl.g:705:1: rule__QualifiedName__Group__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogDsl.g:709:1: ( ( RULE_ID ) )
            // InternalLogDsl.g:710:1: ( RULE_ID )
            {
            // InternalLogDsl.g:710:1: ( RULE_ID )
            // InternalLogDsl.g:711:2: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_0__0"
    // InternalLogDsl.g:721:1: rule__QualifiedName__Group_0__0 : rule__QualifiedName__Group_0__0__Impl rule__QualifiedName__Group_0__1 ;
    public final void rule__QualifiedName__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogDsl.g:725:1: ( rule__QualifiedName__Group_0__0__Impl rule__QualifiedName__Group_0__1 )
            // InternalLogDsl.g:726:2: rule__QualifiedName__Group_0__0__Impl rule__QualifiedName__Group_0__1
            {
            pushFollow(FOLLOW_13);
            rule__QualifiedName__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_0__1();

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
    // $ANTLR end "rule__QualifiedName__Group_0__0"


    // $ANTLR start "rule__QualifiedName__Group_0__0__Impl"
    // InternalLogDsl.g:733:1: rule__QualifiedName__Group_0__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogDsl.g:737:1: ( ( RULE_ID ) )
            // InternalLogDsl.g:738:1: ( RULE_ID )
            {
            // InternalLogDsl.g:738:1: ( RULE_ID )
            // InternalLogDsl.g:739:2: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_0__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_0__1"
    // InternalLogDsl.g:748:1: rule__QualifiedName__Group_0__1 : rule__QualifiedName__Group_0__1__Impl ;
    public final void rule__QualifiedName__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogDsl.g:752:1: ( rule__QualifiedName__Group_0__1__Impl )
            // InternalLogDsl.g:753:2: rule__QualifiedName__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_0__1__Impl();

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
    // $ANTLR end "rule__QualifiedName__Group_0__1"


    // $ANTLR start "rule__QualifiedName__Group_0__1__Impl"
    // InternalLogDsl.g:759:1: rule__QualifiedName__Group_0__1__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogDsl.g:763:1: ( ( '.' ) )
            // InternalLogDsl.g:764:1: ( '.' )
            {
            // InternalLogDsl.g:764:1: ( '.' )
            // InternalLogDsl.g:765:2: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_0_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_0__1__Impl"


    // $ANTLR start "rule__LogDocument__NameAssignment_2"
    // InternalLogDsl.g:775:1: rule__LogDocument__NameAssignment_2 : ( ruleQualifiedName ) ;
    public final void rule__LogDocument__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogDsl.g:779:1: ( ( ruleQualifiedName ) )
            // InternalLogDsl.g:780:2: ( ruleQualifiedName )
            {
            // InternalLogDsl.g:780:2: ( ruleQualifiedName )
            // InternalLogDsl.g:781:3: ruleQualifiedName
            {
             before(grammarAccess.getLogDocumentAccess().getNameQualifiedNameParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getLogDocumentAccess().getNameQualifiedNameParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogDocument__NameAssignment_2"


    // $ANTLR start "rule__LogDocument__MemberAssignment_3"
    // InternalLogDsl.g:790:1: rule__LogDocument__MemberAssignment_3 : ( rulemember ) ;
    public final void rule__LogDocument__MemberAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogDsl.g:794:1: ( ( rulemember ) )
            // InternalLogDsl.g:795:2: ( rulemember )
            {
            // InternalLogDsl.g:795:2: ( rulemember )
            // InternalLogDsl.g:796:3: rulemember
            {
             before(grammarAccess.getLogDocumentAccess().getMemberMemberParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            rulemember();

            state._fsp--;

             after(grammarAccess.getLogDocumentAccess().getMemberMemberParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogDocument__MemberAssignment_3"


    // $ANTLR start "rule__Entity__NameAssignment_1"
    // InternalLogDsl.g:805:1: rule__Entity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogDsl.g:809:1: ( ( RULE_ID ) )
            // InternalLogDsl.g:810:2: ( RULE_ID )
            {
            // InternalLogDsl.g:810:2: ( RULE_ID )
            // InternalLogDsl.g:811:3: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__NameAssignment_1"


    // $ANTLR start "rule__Entity__FieldsAssignment_4_1"
    // InternalLogDsl.g:820:1: rule__Entity__FieldsAssignment_4_1 : ( ruleField ) ;
    public final void rule__Entity__FieldsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogDsl.g:824:1: ( ( ruleField ) )
            // InternalLogDsl.g:825:2: ( ruleField )
            {
            // InternalLogDsl.g:825:2: ( ruleField )
            // InternalLogDsl.g:826:3: ruleField
            {
             before(grammarAccess.getEntityAccess().getFieldsFieldParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleField();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getFieldsFieldParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__FieldsAssignment_4_1"


    // $ANTLR start "rule__Entity__FieldsAssignment_4_2_1"
    // InternalLogDsl.g:835:1: rule__Entity__FieldsAssignment_4_2_1 : ( ruleField ) ;
    public final void rule__Entity__FieldsAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogDsl.g:839:1: ( ( ruleField ) )
            // InternalLogDsl.g:840:2: ( ruleField )
            {
            // InternalLogDsl.g:840:2: ( ruleField )
            // InternalLogDsl.g:841:3: ruleField
            {
             before(grammarAccess.getEntityAccess().getFieldsFieldParserRuleCall_4_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleField();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getFieldsFieldParserRuleCall_4_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__FieldsAssignment_4_2_1"


    // $ANTLR start "rule__Field__NameAssignment_0"
    // InternalLogDsl.g:850:1: rule__Field__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Field__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogDsl.g:854:1: ( ( RULE_ID ) )
            // InternalLogDsl.g:855:2: ( RULE_ID )
            {
            // InternalLogDsl.g:855:2: ( RULE_ID )
            // InternalLogDsl.g:856:3: RULE_ID
            {
             before(grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__NameAssignment_0"


    // $ANTLR start "rule__Field__DtypeAssignment_1"
    // InternalLogDsl.g:865:1: rule__Field__DtypeAssignment_1 : ( ruleDataTypes ) ;
    public final void rule__Field__DtypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogDsl.g:869:1: ( ( ruleDataTypes ) )
            // InternalLogDsl.g:870:2: ( ruleDataTypes )
            {
            // InternalLogDsl.g:870:2: ( ruleDataTypes )
            // InternalLogDsl.g:871:3: ruleDataTypes
            {
             before(grammarAccess.getFieldAccess().getDtypeDataTypesEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDataTypes();

            state._fsp--;

             after(grammarAccess.getFieldAccess().getDtypeDataTypesEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__DtypeAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004012L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});

}