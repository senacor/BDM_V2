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


    // $ANTLR start "entryRuleBaseEntity"
    // InternalLogDsl.g:78:1: entryRuleBaseEntity : ruleBaseEntity EOF ;
    public final void entryRuleBaseEntity() throws RecognitionException {
        try {
            // InternalLogDsl.g:79:1: ( ruleBaseEntity EOF )
            // InternalLogDsl.g:80:1: ruleBaseEntity EOF
            {
             before(grammarAccess.getBaseEntityRule()); 
            pushFollow(FOLLOW_1);
            ruleBaseEntity();

            state._fsp--;

             after(grammarAccess.getBaseEntityRule()); 
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
    // $ANTLR end "entryRuleBaseEntity"


    // $ANTLR start "ruleBaseEntity"
    // InternalLogDsl.g:87:1: ruleBaseEntity : ( ( rule__BaseEntity__Group__0 ) ) ;
    public final void ruleBaseEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogDsl.g:91:2: ( ( ( rule__BaseEntity__Group__0 ) ) )
            // InternalLogDsl.g:92:2: ( ( rule__BaseEntity__Group__0 ) )
            {
            // InternalLogDsl.g:92:2: ( ( rule__BaseEntity__Group__0 ) )
            // InternalLogDsl.g:93:3: ( rule__BaseEntity__Group__0 )
            {
             before(grammarAccess.getBaseEntityAccess().getGroup()); 
            // InternalLogDsl.g:94:3: ( rule__BaseEntity__Group__0 )
            // InternalLogDsl.g:94:4: rule__BaseEntity__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BaseEntity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBaseEntityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBaseEntity"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalLogDsl.g:103:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalLogDsl.g:104:1: ( ruleQualifiedName EOF )
            // InternalLogDsl.g:105:1: ruleQualifiedName EOF
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
    // InternalLogDsl.g:112:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogDsl.g:116:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalLogDsl.g:117:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalLogDsl.g:117:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalLogDsl.g:118:3: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // InternalLogDsl.g:119:3: ( rule__QualifiedName__Group__0 )
            // InternalLogDsl.g:119:4: rule__QualifiedName__Group__0
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


    // $ANTLR start "rule__LogDocument__Group__0"
    // InternalLogDsl.g:127:1: rule__LogDocument__Group__0 : rule__LogDocument__Group__0__Impl rule__LogDocument__Group__1 ;
    public final void rule__LogDocument__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogDsl.g:131:1: ( rule__LogDocument__Group__0__Impl rule__LogDocument__Group__1 )
            // InternalLogDsl.g:132:2: rule__LogDocument__Group__0__Impl rule__LogDocument__Group__1
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
    // InternalLogDsl.g:139:1: rule__LogDocument__Group__0__Impl : ( () ) ;
    public final void rule__LogDocument__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogDsl.g:143:1: ( ( () ) )
            // InternalLogDsl.g:144:1: ( () )
            {
            // InternalLogDsl.g:144:1: ( () )
            // InternalLogDsl.g:145:2: ()
            {
             before(grammarAccess.getLogDocumentAccess().getLogDocumentAction_0()); 
            // InternalLogDsl.g:146:2: ()
            // InternalLogDsl.g:146:3: 
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
    // InternalLogDsl.g:154:1: rule__LogDocument__Group__1 : rule__LogDocument__Group__1__Impl rule__LogDocument__Group__2 ;
    public final void rule__LogDocument__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogDsl.g:158:1: ( rule__LogDocument__Group__1__Impl rule__LogDocument__Group__2 )
            // InternalLogDsl.g:159:2: rule__LogDocument__Group__1__Impl rule__LogDocument__Group__2
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
    // InternalLogDsl.g:166:1: rule__LogDocument__Group__1__Impl : ( 'package' ) ;
    public final void rule__LogDocument__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogDsl.g:170:1: ( ( 'package' ) )
            // InternalLogDsl.g:171:1: ( 'package' )
            {
            // InternalLogDsl.g:171:1: ( 'package' )
            // InternalLogDsl.g:172:2: 'package'
            {
             before(grammarAccess.getLogDocumentAccess().getPackageKeyword_1()); 
            match(input,11,FOLLOW_2); 
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
    // InternalLogDsl.g:181:1: rule__LogDocument__Group__2 : rule__LogDocument__Group__2__Impl rule__LogDocument__Group__3 ;
    public final void rule__LogDocument__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogDsl.g:185:1: ( rule__LogDocument__Group__2__Impl rule__LogDocument__Group__3 )
            // InternalLogDsl.g:186:2: rule__LogDocument__Group__2__Impl rule__LogDocument__Group__3
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
    // InternalLogDsl.g:193:1: rule__LogDocument__Group__2__Impl : ( ( rule__LogDocument__NameAssignment_2 ) ) ;
    public final void rule__LogDocument__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogDsl.g:197:1: ( ( ( rule__LogDocument__NameAssignment_2 ) ) )
            // InternalLogDsl.g:198:1: ( ( rule__LogDocument__NameAssignment_2 ) )
            {
            // InternalLogDsl.g:198:1: ( ( rule__LogDocument__NameAssignment_2 ) )
            // InternalLogDsl.g:199:2: ( rule__LogDocument__NameAssignment_2 )
            {
             before(grammarAccess.getLogDocumentAccess().getNameAssignment_2()); 
            // InternalLogDsl.g:200:2: ( rule__LogDocument__NameAssignment_2 )
            // InternalLogDsl.g:200:3: rule__LogDocument__NameAssignment_2
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
    // InternalLogDsl.g:208:1: rule__LogDocument__Group__3 : rule__LogDocument__Group__3__Impl ;
    public final void rule__LogDocument__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogDsl.g:212:1: ( rule__LogDocument__Group__3__Impl )
            // InternalLogDsl.g:213:2: rule__LogDocument__Group__3__Impl
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
    // InternalLogDsl.g:219:1: rule__LogDocument__Group__3__Impl : ( ( rule__LogDocument__BaseentitiesAssignment_3 ) ) ;
    public final void rule__LogDocument__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogDsl.g:223:1: ( ( ( rule__LogDocument__BaseentitiesAssignment_3 ) ) )
            // InternalLogDsl.g:224:1: ( ( rule__LogDocument__BaseentitiesAssignment_3 ) )
            {
            // InternalLogDsl.g:224:1: ( ( rule__LogDocument__BaseentitiesAssignment_3 ) )
            // InternalLogDsl.g:225:2: ( rule__LogDocument__BaseentitiesAssignment_3 )
            {
             before(grammarAccess.getLogDocumentAccess().getBaseentitiesAssignment_3()); 
            // InternalLogDsl.g:226:2: ( rule__LogDocument__BaseentitiesAssignment_3 )
            // InternalLogDsl.g:226:3: rule__LogDocument__BaseentitiesAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__LogDocument__BaseentitiesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getLogDocumentAccess().getBaseentitiesAssignment_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__BaseEntity__Group__0"
    // InternalLogDsl.g:235:1: rule__BaseEntity__Group__0 : rule__BaseEntity__Group__0__Impl rule__BaseEntity__Group__1 ;
    public final void rule__BaseEntity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogDsl.g:239:1: ( rule__BaseEntity__Group__0__Impl rule__BaseEntity__Group__1 )
            // InternalLogDsl.g:240:2: rule__BaseEntity__Group__0__Impl rule__BaseEntity__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__BaseEntity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BaseEntity__Group__1();

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
    // $ANTLR end "rule__BaseEntity__Group__0"


    // $ANTLR start "rule__BaseEntity__Group__0__Impl"
    // InternalLogDsl.g:247:1: rule__BaseEntity__Group__0__Impl : ( () ) ;
    public final void rule__BaseEntity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogDsl.g:251:1: ( ( () ) )
            // InternalLogDsl.g:252:1: ( () )
            {
            // InternalLogDsl.g:252:1: ( () )
            // InternalLogDsl.g:253:2: ()
            {
             before(grammarAccess.getBaseEntityAccess().getBaseEntityAction_0()); 
            // InternalLogDsl.g:254:2: ()
            // InternalLogDsl.g:254:3: 
            {
            }

             after(grammarAccess.getBaseEntityAccess().getBaseEntityAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseEntity__Group__0__Impl"


    // $ANTLR start "rule__BaseEntity__Group__1"
    // InternalLogDsl.g:262:1: rule__BaseEntity__Group__1 : rule__BaseEntity__Group__1__Impl rule__BaseEntity__Group__2 ;
    public final void rule__BaseEntity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogDsl.g:266:1: ( rule__BaseEntity__Group__1__Impl rule__BaseEntity__Group__2 )
            // InternalLogDsl.g:267:2: rule__BaseEntity__Group__1__Impl rule__BaseEntity__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__BaseEntity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BaseEntity__Group__2();

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
    // $ANTLR end "rule__BaseEntity__Group__1"


    // $ANTLR start "rule__BaseEntity__Group__1__Impl"
    // InternalLogDsl.g:274:1: rule__BaseEntity__Group__1__Impl : ( 'BaseEntity' ) ;
    public final void rule__BaseEntity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogDsl.g:278:1: ( ( 'BaseEntity' ) )
            // InternalLogDsl.g:279:1: ( 'BaseEntity' )
            {
            // InternalLogDsl.g:279:1: ( 'BaseEntity' )
            // InternalLogDsl.g:280:2: 'BaseEntity'
            {
             before(grammarAccess.getBaseEntityAccess().getBaseEntityKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getBaseEntityAccess().getBaseEntityKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseEntity__Group__1__Impl"


    // $ANTLR start "rule__BaseEntity__Group__2"
    // InternalLogDsl.g:289:1: rule__BaseEntity__Group__2 : rule__BaseEntity__Group__2__Impl rule__BaseEntity__Group__3 ;
    public final void rule__BaseEntity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogDsl.g:293:1: ( rule__BaseEntity__Group__2__Impl rule__BaseEntity__Group__3 )
            // InternalLogDsl.g:294:2: rule__BaseEntity__Group__2__Impl rule__BaseEntity__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__BaseEntity__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BaseEntity__Group__3();

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
    // $ANTLR end "rule__BaseEntity__Group__2"


    // $ANTLR start "rule__BaseEntity__Group__2__Impl"
    // InternalLogDsl.g:301:1: rule__BaseEntity__Group__2__Impl : ( ( rule__BaseEntity__NameAssignment_2 ) ) ;
    public final void rule__BaseEntity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogDsl.g:305:1: ( ( ( rule__BaseEntity__NameAssignment_2 ) ) )
            // InternalLogDsl.g:306:1: ( ( rule__BaseEntity__NameAssignment_2 ) )
            {
            // InternalLogDsl.g:306:1: ( ( rule__BaseEntity__NameAssignment_2 ) )
            // InternalLogDsl.g:307:2: ( rule__BaseEntity__NameAssignment_2 )
            {
             before(grammarAccess.getBaseEntityAccess().getNameAssignment_2()); 
            // InternalLogDsl.g:308:2: ( rule__BaseEntity__NameAssignment_2 )
            // InternalLogDsl.g:308:3: rule__BaseEntity__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__BaseEntity__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getBaseEntityAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseEntity__Group__2__Impl"


    // $ANTLR start "rule__BaseEntity__Group__3"
    // InternalLogDsl.g:316:1: rule__BaseEntity__Group__3 : rule__BaseEntity__Group__3__Impl rule__BaseEntity__Group__4 ;
    public final void rule__BaseEntity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogDsl.g:320:1: ( rule__BaseEntity__Group__3__Impl rule__BaseEntity__Group__4 )
            // InternalLogDsl.g:321:2: rule__BaseEntity__Group__3__Impl rule__BaseEntity__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__BaseEntity__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BaseEntity__Group__4();

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
    // $ANTLR end "rule__BaseEntity__Group__3"


    // $ANTLR start "rule__BaseEntity__Group__3__Impl"
    // InternalLogDsl.g:328:1: rule__BaseEntity__Group__3__Impl : ( '{' ) ;
    public final void rule__BaseEntity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogDsl.g:332:1: ( ( '{' ) )
            // InternalLogDsl.g:333:1: ( '{' )
            {
            // InternalLogDsl.g:333:1: ( '{' )
            // InternalLogDsl.g:334:2: '{'
            {
             before(grammarAccess.getBaseEntityAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getBaseEntityAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseEntity__Group__3__Impl"


    // $ANTLR start "rule__BaseEntity__Group__4"
    // InternalLogDsl.g:343:1: rule__BaseEntity__Group__4 : rule__BaseEntity__Group__4__Impl ;
    public final void rule__BaseEntity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogDsl.g:347:1: ( rule__BaseEntity__Group__4__Impl )
            // InternalLogDsl.g:348:2: rule__BaseEntity__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BaseEntity__Group__4__Impl();

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
    // $ANTLR end "rule__BaseEntity__Group__4"


    // $ANTLR start "rule__BaseEntity__Group__4__Impl"
    // InternalLogDsl.g:354:1: rule__BaseEntity__Group__4__Impl : ( '}' ) ;
    public final void rule__BaseEntity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogDsl.g:358:1: ( ( '}' ) )
            // InternalLogDsl.g:359:1: ( '}' )
            {
            // InternalLogDsl.g:359:1: ( '}' )
            // InternalLogDsl.g:360:2: '}'
            {
             before(grammarAccess.getBaseEntityAccess().getRightCurlyBracketKeyword_4()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getBaseEntityAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseEntity__Group__4__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // InternalLogDsl.g:370:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogDsl.g:374:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalLogDsl.g:375:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
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
    // InternalLogDsl.g:382:1: rule__QualifiedName__Group__0__Impl : ( ( rule__QualifiedName__Group_0__0 )* ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogDsl.g:386:1: ( ( ( rule__QualifiedName__Group_0__0 )* ) )
            // InternalLogDsl.g:387:1: ( ( rule__QualifiedName__Group_0__0 )* )
            {
            // InternalLogDsl.g:387:1: ( ( rule__QualifiedName__Group_0__0 )* )
            // InternalLogDsl.g:388:2: ( rule__QualifiedName__Group_0__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_0()); 
            // InternalLogDsl.g:389:2: ( rule__QualifiedName__Group_0__0 )*
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
            	    // InternalLogDsl.g:389:3: rule__QualifiedName__Group_0__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__QualifiedName__Group_0__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
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
    // InternalLogDsl.g:397:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogDsl.g:401:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalLogDsl.g:402:2: rule__QualifiedName__Group__1__Impl
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
    // InternalLogDsl.g:408:1: rule__QualifiedName__Group__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogDsl.g:412:1: ( ( RULE_ID ) )
            // InternalLogDsl.g:413:1: ( RULE_ID )
            {
            // InternalLogDsl.g:413:1: ( RULE_ID )
            // InternalLogDsl.g:414:2: RULE_ID
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
    // InternalLogDsl.g:424:1: rule__QualifiedName__Group_0__0 : rule__QualifiedName__Group_0__0__Impl rule__QualifiedName__Group_0__1 ;
    public final void rule__QualifiedName__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogDsl.g:428:1: ( rule__QualifiedName__Group_0__0__Impl rule__QualifiedName__Group_0__1 )
            // InternalLogDsl.g:429:2: rule__QualifiedName__Group_0__0__Impl rule__QualifiedName__Group_0__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalLogDsl.g:436:1: rule__QualifiedName__Group_0__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogDsl.g:440:1: ( ( RULE_ID ) )
            // InternalLogDsl.g:441:1: ( RULE_ID )
            {
            // InternalLogDsl.g:441:1: ( RULE_ID )
            // InternalLogDsl.g:442:2: RULE_ID
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
    // InternalLogDsl.g:451:1: rule__QualifiedName__Group_0__1 : rule__QualifiedName__Group_0__1__Impl ;
    public final void rule__QualifiedName__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogDsl.g:455:1: ( rule__QualifiedName__Group_0__1__Impl )
            // InternalLogDsl.g:456:2: rule__QualifiedName__Group_0__1__Impl
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
    // InternalLogDsl.g:462:1: rule__QualifiedName__Group_0__1__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogDsl.g:466:1: ( ( '.' ) )
            // InternalLogDsl.g:467:1: ( '.' )
            {
            // InternalLogDsl.g:467:1: ( '.' )
            // InternalLogDsl.g:468:2: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_0_1()); 
            match(input,15,FOLLOW_2); 
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
    // InternalLogDsl.g:478:1: rule__LogDocument__NameAssignment_2 : ( ruleQualifiedName ) ;
    public final void rule__LogDocument__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogDsl.g:482:1: ( ( ruleQualifiedName ) )
            // InternalLogDsl.g:483:2: ( ruleQualifiedName )
            {
            // InternalLogDsl.g:483:2: ( ruleQualifiedName )
            // InternalLogDsl.g:484:3: ruleQualifiedName
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


    // $ANTLR start "rule__LogDocument__BaseentitiesAssignment_3"
    // InternalLogDsl.g:493:1: rule__LogDocument__BaseentitiesAssignment_3 : ( ruleBaseEntity ) ;
    public final void rule__LogDocument__BaseentitiesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogDsl.g:497:1: ( ( ruleBaseEntity ) )
            // InternalLogDsl.g:498:2: ( ruleBaseEntity )
            {
            // InternalLogDsl.g:498:2: ( ruleBaseEntity )
            // InternalLogDsl.g:499:3: ruleBaseEntity
            {
             before(grammarAccess.getLogDocumentAccess().getBaseentitiesBaseEntityParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleBaseEntity();

            state._fsp--;

             after(grammarAccess.getLogDocumentAccess().getBaseentitiesBaseEntityParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogDocument__BaseentitiesAssignment_3"


    // $ANTLR start "rule__BaseEntity__NameAssignment_2"
    // InternalLogDsl.g:508:1: rule__BaseEntity__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__BaseEntity__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogDsl.g:512:1: ( ( RULE_ID ) )
            // InternalLogDsl.g:513:2: ( RULE_ID )
            {
            // InternalLogDsl.g:513:2: ( RULE_ID )
            // InternalLogDsl.g:514:3: RULE_ID
            {
             before(grammarAccess.getBaseEntityAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getBaseEntityAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseEntity__NameAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});

}