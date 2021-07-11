package com.senacor.bdm.techdsl.ide.contentassist.antlr.internal;

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
import com.senacor.bdm.techdsl.services.TechDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTechDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'LogDocument'", "'{'", "'}'", "'baseentities'", "','", "'BaseEntity'"
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

    	public void setGrammarAccess(TechDslGrammarAccess grammarAccess) {
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
    // InternalTechDsl.g:53:1: entryRuleLogDocument : ruleLogDocument EOF ;
    public final void entryRuleLogDocument() throws RecognitionException {
        try {
            // InternalTechDsl.g:54:1: ( ruleLogDocument EOF )
            // InternalTechDsl.g:55:1: ruleLogDocument EOF
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
    // InternalTechDsl.g:62:1: ruleLogDocument : ( ( rule__LogDocument__Group__0 ) ) ;
    public final void ruleLogDocument() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechDsl.g:66:2: ( ( ( rule__LogDocument__Group__0 ) ) )
            // InternalTechDsl.g:67:2: ( ( rule__LogDocument__Group__0 ) )
            {
            // InternalTechDsl.g:67:2: ( ( rule__LogDocument__Group__0 ) )
            // InternalTechDsl.g:68:3: ( rule__LogDocument__Group__0 )
            {
             before(grammarAccess.getLogDocumentAccess().getGroup()); 
            // InternalTechDsl.g:69:3: ( rule__LogDocument__Group__0 )
            // InternalTechDsl.g:69:4: rule__LogDocument__Group__0
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


    // $ANTLR start "entryRuleEString"
    // InternalTechDsl.g:78:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalTechDsl.g:79:1: ( ruleEString EOF )
            // InternalTechDsl.g:80:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalTechDsl.g:87:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechDsl.g:91:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalTechDsl.g:92:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalTechDsl.g:92:2: ( ( rule__EString__Alternatives ) )
            // InternalTechDsl.g:93:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalTechDsl.g:94:3: ( rule__EString__Alternatives )
            // InternalTechDsl.g:94:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleBaseEntity"
    // InternalTechDsl.g:103:1: entryRuleBaseEntity : ruleBaseEntity EOF ;
    public final void entryRuleBaseEntity() throws RecognitionException {
        try {
            // InternalTechDsl.g:104:1: ( ruleBaseEntity EOF )
            // InternalTechDsl.g:105:1: ruleBaseEntity EOF
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
    // InternalTechDsl.g:112:1: ruleBaseEntity : ( ( rule__BaseEntity__Group__0 ) ) ;
    public final void ruleBaseEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechDsl.g:116:2: ( ( ( rule__BaseEntity__Group__0 ) ) )
            // InternalTechDsl.g:117:2: ( ( rule__BaseEntity__Group__0 ) )
            {
            // InternalTechDsl.g:117:2: ( ( rule__BaseEntity__Group__0 ) )
            // InternalTechDsl.g:118:3: ( rule__BaseEntity__Group__0 )
            {
             before(grammarAccess.getBaseEntityAccess().getGroup()); 
            // InternalTechDsl.g:119:3: ( rule__BaseEntity__Group__0 )
            // InternalTechDsl.g:119:4: rule__BaseEntity__Group__0
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


    // $ANTLR start "rule__EString__Alternatives"
    // InternalTechDsl.g:127:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechDsl.g:131:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
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
                    // InternalTechDsl.g:132:2: ( RULE_STRING )
                    {
                    // InternalTechDsl.g:132:2: ( RULE_STRING )
                    // InternalTechDsl.g:133:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTechDsl.g:138:2: ( RULE_ID )
                    {
                    // InternalTechDsl.g:138:2: ( RULE_ID )
                    // InternalTechDsl.g:139:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__LogDocument__Group__0"
    // InternalTechDsl.g:148:1: rule__LogDocument__Group__0 : rule__LogDocument__Group__0__Impl rule__LogDocument__Group__1 ;
    public final void rule__LogDocument__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechDsl.g:152:1: ( rule__LogDocument__Group__0__Impl rule__LogDocument__Group__1 )
            // InternalTechDsl.g:153:2: rule__LogDocument__Group__0__Impl rule__LogDocument__Group__1
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
    // InternalTechDsl.g:160:1: rule__LogDocument__Group__0__Impl : ( () ) ;
    public final void rule__LogDocument__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechDsl.g:164:1: ( ( () ) )
            // InternalTechDsl.g:165:1: ( () )
            {
            // InternalTechDsl.g:165:1: ( () )
            // InternalTechDsl.g:166:2: ()
            {
             before(grammarAccess.getLogDocumentAccess().getLogDocumentAction_0()); 
            // InternalTechDsl.g:167:2: ()
            // InternalTechDsl.g:167:3: 
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
    // InternalTechDsl.g:175:1: rule__LogDocument__Group__1 : rule__LogDocument__Group__1__Impl rule__LogDocument__Group__2 ;
    public final void rule__LogDocument__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechDsl.g:179:1: ( rule__LogDocument__Group__1__Impl rule__LogDocument__Group__2 )
            // InternalTechDsl.g:180:2: rule__LogDocument__Group__1__Impl rule__LogDocument__Group__2
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
    // InternalTechDsl.g:187:1: rule__LogDocument__Group__1__Impl : ( 'LogDocument' ) ;
    public final void rule__LogDocument__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechDsl.g:191:1: ( ( 'LogDocument' ) )
            // InternalTechDsl.g:192:1: ( 'LogDocument' )
            {
            // InternalTechDsl.g:192:1: ( 'LogDocument' )
            // InternalTechDsl.g:193:2: 'LogDocument'
            {
             before(grammarAccess.getLogDocumentAccess().getLogDocumentKeyword_1()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getLogDocumentAccess().getLogDocumentKeyword_1()); 

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
    // InternalTechDsl.g:202:1: rule__LogDocument__Group__2 : rule__LogDocument__Group__2__Impl rule__LogDocument__Group__3 ;
    public final void rule__LogDocument__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechDsl.g:206:1: ( rule__LogDocument__Group__2__Impl rule__LogDocument__Group__3 )
            // InternalTechDsl.g:207:2: rule__LogDocument__Group__2__Impl rule__LogDocument__Group__3
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
    // InternalTechDsl.g:214:1: rule__LogDocument__Group__2__Impl : ( ( rule__LogDocument__NameAssignment_2 ) ) ;
    public final void rule__LogDocument__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechDsl.g:218:1: ( ( ( rule__LogDocument__NameAssignment_2 ) ) )
            // InternalTechDsl.g:219:1: ( ( rule__LogDocument__NameAssignment_2 ) )
            {
            // InternalTechDsl.g:219:1: ( ( rule__LogDocument__NameAssignment_2 ) )
            // InternalTechDsl.g:220:2: ( rule__LogDocument__NameAssignment_2 )
            {
             before(grammarAccess.getLogDocumentAccess().getNameAssignment_2()); 
            // InternalTechDsl.g:221:2: ( rule__LogDocument__NameAssignment_2 )
            // InternalTechDsl.g:221:3: rule__LogDocument__NameAssignment_2
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
    // InternalTechDsl.g:229:1: rule__LogDocument__Group__3 : rule__LogDocument__Group__3__Impl rule__LogDocument__Group__4 ;
    public final void rule__LogDocument__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechDsl.g:233:1: ( rule__LogDocument__Group__3__Impl rule__LogDocument__Group__4 )
            // InternalTechDsl.g:234:2: rule__LogDocument__Group__3__Impl rule__LogDocument__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__LogDocument__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LogDocument__Group__4();

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
    // InternalTechDsl.g:241:1: rule__LogDocument__Group__3__Impl : ( '{' ) ;
    public final void rule__LogDocument__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechDsl.g:245:1: ( ( '{' ) )
            // InternalTechDsl.g:246:1: ( '{' )
            {
            // InternalTechDsl.g:246:1: ( '{' )
            // InternalTechDsl.g:247:2: '{'
            {
             before(grammarAccess.getLogDocumentAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getLogDocumentAccess().getLeftCurlyBracketKeyword_3()); 

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


    // $ANTLR start "rule__LogDocument__Group__4"
    // InternalTechDsl.g:256:1: rule__LogDocument__Group__4 : rule__LogDocument__Group__4__Impl rule__LogDocument__Group__5 ;
    public final void rule__LogDocument__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechDsl.g:260:1: ( rule__LogDocument__Group__4__Impl rule__LogDocument__Group__5 )
            // InternalTechDsl.g:261:2: rule__LogDocument__Group__4__Impl rule__LogDocument__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__LogDocument__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LogDocument__Group__5();

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
    // $ANTLR end "rule__LogDocument__Group__4"


    // $ANTLR start "rule__LogDocument__Group__4__Impl"
    // InternalTechDsl.g:268:1: rule__LogDocument__Group__4__Impl : ( ( rule__LogDocument__Group_4__0 )? ) ;
    public final void rule__LogDocument__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechDsl.g:272:1: ( ( ( rule__LogDocument__Group_4__0 )? ) )
            // InternalTechDsl.g:273:1: ( ( rule__LogDocument__Group_4__0 )? )
            {
            // InternalTechDsl.g:273:1: ( ( rule__LogDocument__Group_4__0 )? )
            // InternalTechDsl.g:274:2: ( rule__LogDocument__Group_4__0 )?
            {
             before(grammarAccess.getLogDocumentAccess().getGroup_4()); 
            // InternalTechDsl.g:275:2: ( rule__LogDocument__Group_4__0 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalTechDsl.g:275:3: rule__LogDocument__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LogDocument__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLogDocumentAccess().getGroup_4()); 

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
    // $ANTLR end "rule__LogDocument__Group__4__Impl"


    // $ANTLR start "rule__LogDocument__Group__5"
    // InternalTechDsl.g:283:1: rule__LogDocument__Group__5 : rule__LogDocument__Group__5__Impl ;
    public final void rule__LogDocument__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechDsl.g:287:1: ( rule__LogDocument__Group__5__Impl )
            // InternalTechDsl.g:288:2: rule__LogDocument__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LogDocument__Group__5__Impl();

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
    // $ANTLR end "rule__LogDocument__Group__5"


    // $ANTLR start "rule__LogDocument__Group__5__Impl"
    // InternalTechDsl.g:294:1: rule__LogDocument__Group__5__Impl : ( '}' ) ;
    public final void rule__LogDocument__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechDsl.g:298:1: ( ( '}' ) )
            // InternalTechDsl.g:299:1: ( '}' )
            {
            // InternalTechDsl.g:299:1: ( '}' )
            // InternalTechDsl.g:300:2: '}'
            {
             before(grammarAccess.getLogDocumentAccess().getRightCurlyBracketKeyword_5()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getLogDocumentAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__LogDocument__Group__5__Impl"


    // $ANTLR start "rule__LogDocument__Group_4__0"
    // InternalTechDsl.g:310:1: rule__LogDocument__Group_4__0 : rule__LogDocument__Group_4__0__Impl rule__LogDocument__Group_4__1 ;
    public final void rule__LogDocument__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechDsl.g:314:1: ( rule__LogDocument__Group_4__0__Impl rule__LogDocument__Group_4__1 )
            // InternalTechDsl.g:315:2: rule__LogDocument__Group_4__0__Impl rule__LogDocument__Group_4__1
            {
            pushFollow(FOLLOW_5);
            rule__LogDocument__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LogDocument__Group_4__1();

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
    // $ANTLR end "rule__LogDocument__Group_4__0"


    // $ANTLR start "rule__LogDocument__Group_4__0__Impl"
    // InternalTechDsl.g:322:1: rule__LogDocument__Group_4__0__Impl : ( 'baseentities' ) ;
    public final void rule__LogDocument__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechDsl.g:326:1: ( ( 'baseentities' ) )
            // InternalTechDsl.g:327:1: ( 'baseentities' )
            {
            // InternalTechDsl.g:327:1: ( 'baseentities' )
            // InternalTechDsl.g:328:2: 'baseentities'
            {
             before(grammarAccess.getLogDocumentAccess().getBaseentitiesKeyword_4_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getLogDocumentAccess().getBaseentitiesKeyword_4_0()); 

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
    // $ANTLR end "rule__LogDocument__Group_4__0__Impl"


    // $ANTLR start "rule__LogDocument__Group_4__1"
    // InternalTechDsl.g:337:1: rule__LogDocument__Group_4__1 : rule__LogDocument__Group_4__1__Impl rule__LogDocument__Group_4__2 ;
    public final void rule__LogDocument__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechDsl.g:341:1: ( rule__LogDocument__Group_4__1__Impl rule__LogDocument__Group_4__2 )
            // InternalTechDsl.g:342:2: rule__LogDocument__Group_4__1__Impl rule__LogDocument__Group_4__2
            {
            pushFollow(FOLLOW_7);
            rule__LogDocument__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LogDocument__Group_4__2();

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
    // $ANTLR end "rule__LogDocument__Group_4__1"


    // $ANTLR start "rule__LogDocument__Group_4__1__Impl"
    // InternalTechDsl.g:349:1: rule__LogDocument__Group_4__1__Impl : ( '{' ) ;
    public final void rule__LogDocument__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechDsl.g:353:1: ( ( '{' ) )
            // InternalTechDsl.g:354:1: ( '{' )
            {
            // InternalTechDsl.g:354:1: ( '{' )
            // InternalTechDsl.g:355:2: '{'
            {
             before(grammarAccess.getLogDocumentAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getLogDocumentAccess().getLeftCurlyBracketKeyword_4_1()); 

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
    // $ANTLR end "rule__LogDocument__Group_4__1__Impl"


    // $ANTLR start "rule__LogDocument__Group_4__2"
    // InternalTechDsl.g:364:1: rule__LogDocument__Group_4__2 : rule__LogDocument__Group_4__2__Impl rule__LogDocument__Group_4__3 ;
    public final void rule__LogDocument__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechDsl.g:368:1: ( rule__LogDocument__Group_4__2__Impl rule__LogDocument__Group_4__3 )
            // InternalTechDsl.g:369:2: rule__LogDocument__Group_4__2__Impl rule__LogDocument__Group_4__3
            {
            pushFollow(FOLLOW_8);
            rule__LogDocument__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LogDocument__Group_4__3();

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
    // $ANTLR end "rule__LogDocument__Group_4__2"


    // $ANTLR start "rule__LogDocument__Group_4__2__Impl"
    // InternalTechDsl.g:376:1: rule__LogDocument__Group_4__2__Impl : ( ( rule__LogDocument__BaseentitiesAssignment_4_2 ) ) ;
    public final void rule__LogDocument__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechDsl.g:380:1: ( ( ( rule__LogDocument__BaseentitiesAssignment_4_2 ) ) )
            // InternalTechDsl.g:381:1: ( ( rule__LogDocument__BaseentitiesAssignment_4_2 ) )
            {
            // InternalTechDsl.g:381:1: ( ( rule__LogDocument__BaseentitiesAssignment_4_2 ) )
            // InternalTechDsl.g:382:2: ( rule__LogDocument__BaseentitiesAssignment_4_2 )
            {
             before(grammarAccess.getLogDocumentAccess().getBaseentitiesAssignment_4_2()); 
            // InternalTechDsl.g:383:2: ( rule__LogDocument__BaseentitiesAssignment_4_2 )
            // InternalTechDsl.g:383:3: rule__LogDocument__BaseentitiesAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__LogDocument__BaseentitiesAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getLogDocumentAccess().getBaseentitiesAssignment_4_2()); 

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
    // $ANTLR end "rule__LogDocument__Group_4__2__Impl"


    // $ANTLR start "rule__LogDocument__Group_4__3"
    // InternalTechDsl.g:391:1: rule__LogDocument__Group_4__3 : rule__LogDocument__Group_4__3__Impl rule__LogDocument__Group_4__4 ;
    public final void rule__LogDocument__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechDsl.g:395:1: ( rule__LogDocument__Group_4__3__Impl rule__LogDocument__Group_4__4 )
            // InternalTechDsl.g:396:2: rule__LogDocument__Group_4__3__Impl rule__LogDocument__Group_4__4
            {
            pushFollow(FOLLOW_8);
            rule__LogDocument__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LogDocument__Group_4__4();

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
    // $ANTLR end "rule__LogDocument__Group_4__3"


    // $ANTLR start "rule__LogDocument__Group_4__3__Impl"
    // InternalTechDsl.g:403:1: rule__LogDocument__Group_4__3__Impl : ( ( rule__LogDocument__Group_4_3__0 )* ) ;
    public final void rule__LogDocument__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechDsl.g:407:1: ( ( ( rule__LogDocument__Group_4_3__0 )* ) )
            // InternalTechDsl.g:408:1: ( ( rule__LogDocument__Group_4_3__0 )* )
            {
            // InternalTechDsl.g:408:1: ( ( rule__LogDocument__Group_4_3__0 )* )
            // InternalTechDsl.g:409:2: ( rule__LogDocument__Group_4_3__0 )*
            {
             before(grammarAccess.getLogDocumentAccess().getGroup_4_3()); 
            // InternalTechDsl.g:410:2: ( rule__LogDocument__Group_4_3__0 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==15) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalTechDsl.g:410:3: rule__LogDocument__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__LogDocument__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getLogDocumentAccess().getGroup_4_3()); 

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
    // $ANTLR end "rule__LogDocument__Group_4__3__Impl"


    // $ANTLR start "rule__LogDocument__Group_4__4"
    // InternalTechDsl.g:418:1: rule__LogDocument__Group_4__4 : rule__LogDocument__Group_4__4__Impl ;
    public final void rule__LogDocument__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechDsl.g:422:1: ( rule__LogDocument__Group_4__4__Impl )
            // InternalTechDsl.g:423:2: rule__LogDocument__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LogDocument__Group_4__4__Impl();

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
    // $ANTLR end "rule__LogDocument__Group_4__4"


    // $ANTLR start "rule__LogDocument__Group_4__4__Impl"
    // InternalTechDsl.g:429:1: rule__LogDocument__Group_4__4__Impl : ( '}' ) ;
    public final void rule__LogDocument__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechDsl.g:433:1: ( ( '}' ) )
            // InternalTechDsl.g:434:1: ( '}' )
            {
            // InternalTechDsl.g:434:1: ( '}' )
            // InternalTechDsl.g:435:2: '}'
            {
             before(grammarAccess.getLogDocumentAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getLogDocumentAccess().getRightCurlyBracketKeyword_4_4()); 

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
    // $ANTLR end "rule__LogDocument__Group_4__4__Impl"


    // $ANTLR start "rule__LogDocument__Group_4_3__0"
    // InternalTechDsl.g:445:1: rule__LogDocument__Group_4_3__0 : rule__LogDocument__Group_4_3__0__Impl rule__LogDocument__Group_4_3__1 ;
    public final void rule__LogDocument__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechDsl.g:449:1: ( rule__LogDocument__Group_4_3__0__Impl rule__LogDocument__Group_4_3__1 )
            // InternalTechDsl.g:450:2: rule__LogDocument__Group_4_3__0__Impl rule__LogDocument__Group_4_3__1
            {
            pushFollow(FOLLOW_7);
            rule__LogDocument__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LogDocument__Group_4_3__1();

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
    // $ANTLR end "rule__LogDocument__Group_4_3__0"


    // $ANTLR start "rule__LogDocument__Group_4_3__0__Impl"
    // InternalTechDsl.g:457:1: rule__LogDocument__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__LogDocument__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechDsl.g:461:1: ( ( ',' ) )
            // InternalTechDsl.g:462:1: ( ',' )
            {
            // InternalTechDsl.g:462:1: ( ',' )
            // InternalTechDsl.g:463:2: ','
            {
             before(grammarAccess.getLogDocumentAccess().getCommaKeyword_4_3_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getLogDocumentAccess().getCommaKeyword_4_3_0()); 

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
    // $ANTLR end "rule__LogDocument__Group_4_3__0__Impl"


    // $ANTLR start "rule__LogDocument__Group_4_3__1"
    // InternalTechDsl.g:472:1: rule__LogDocument__Group_4_3__1 : rule__LogDocument__Group_4_3__1__Impl ;
    public final void rule__LogDocument__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechDsl.g:476:1: ( rule__LogDocument__Group_4_3__1__Impl )
            // InternalTechDsl.g:477:2: rule__LogDocument__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LogDocument__Group_4_3__1__Impl();

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
    // $ANTLR end "rule__LogDocument__Group_4_3__1"


    // $ANTLR start "rule__LogDocument__Group_4_3__1__Impl"
    // InternalTechDsl.g:483:1: rule__LogDocument__Group_4_3__1__Impl : ( ( rule__LogDocument__BaseentitiesAssignment_4_3_1 ) ) ;
    public final void rule__LogDocument__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechDsl.g:487:1: ( ( ( rule__LogDocument__BaseentitiesAssignment_4_3_1 ) ) )
            // InternalTechDsl.g:488:1: ( ( rule__LogDocument__BaseentitiesAssignment_4_3_1 ) )
            {
            // InternalTechDsl.g:488:1: ( ( rule__LogDocument__BaseentitiesAssignment_4_3_1 ) )
            // InternalTechDsl.g:489:2: ( rule__LogDocument__BaseentitiesAssignment_4_3_1 )
            {
             before(grammarAccess.getLogDocumentAccess().getBaseentitiesAssignment_4_3_1()); 
            // InternalTechDsl.g:490:2: ( rule__LogDocument__BaseentitiesAssignment_4_3_1 )
            // InternalTechDsl.g:490:3: rule__LogDocument__BaseentitiesAssignment_4_3_1
            {
            pushFollow(FOLLOW_2);
            rule__LogDocument__BaseentitiesAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getLogDocumentAccess().getBaseentitiesAssignment_4_3_1()); 

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
    // $ANTLR end "rule__LogDocument__Group_4_3__1__Impl"


    // $ANTLR start "rule__BaseEntity__Group__0"
    // InternalTechDsl.g:499:1: rule__BaseEntity__Group__0 : rule__BaseEntity__Group__0__Impl rule__BaseEntity__Group__1 ;
    public final void rule__BaseEntity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechDsl.g:503:1: ( rule__BaseEntity__Group__0__Impl rule__BaseEntity__Group__1 )
            // InternalTechDsl.g:504:2: rule__BaseEntity__Group__0__Impl rule__BaseEntity__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalTechDsl.g:511:1: rule__BaseEntity__Group__0__Impl : ( () ) ;
    public final void rule__BaseEntity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechDsl.g:515:1: ( ( () ) )
            // InternalTechDsl.g:516:1: ( () )
            {
            // InternalTechDsl.g:516:1: ( () )
            // InternalTechDsl.g:517:2: ()
            {
             before(grammarAccess.getBaseEntityAccess().getBaseEntityAction_0()); 
            // InternalTechDsl.g:518:2: ()
            // InternalTechDsl.g:518:3: 
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
    // InternalTechDsl.g:526:1: rule__BaseEntity__Group__1 : rule__BaseEntity__Group__1__Impl rule__BaseEntity__Group__2 ;
    public final void rule__BaseEntity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechDsl.g:530:1: ( rule__BaseEntity__Group__1__Impl rule__BaseEntity__Group__2 )
            // InternalTechDsl.g:531:2: rule__BaseEntity__Group__1__Impl rule__BaseEntity__Group__2
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
    // InternalTechDsl.g:538:1: rule__BaseEntity__Group__1__Impl : ( 'BaseEntity' ) ;
    public final void rule__BaseEntity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechDsl.g:542:1: ( ( 'BaseEntity' ) )
            // InternalTechDsl.g:543:1: ( 'BaseEntity' )
            {
            // InternalTechDsl.g:543:1: ( 'BaseEntity' )
            // InternalTechDsl.g:544:2: 'BaseEntity'
            {
             before(grammarAccess.getBaseEntityAccess().getBaseEntityKeyword_1()); 
            match(input,16,FOLLOW_2); 
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
    // InternalTechDsl.g:553:1: rule__BaseEntity__Group__2 : rule__BaseEntity__Group__2__Impl ;
    public final void rule__BaseEntity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechDsl.g:557:1: ( rule__BaseEntity__Group__2__Impl )
            // InternalTechDsl.g:558:2: rule__BaseEntity__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BaseEntity__Group__2__Impl();

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
    // InternalTechDsl.g:564:1: rule__BaseEntity__Group__2__Impl : ( ( rule__BaseEntity__NameAssignment_2 ) ) ;
    public final void rule__BaseEntity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechDsl.g:568:1: ( ( ( rule__BaseEntity__NameAssignment_2 ) ) )
            // InternalTechDsl.g:569:1: ( ( rule__BaseEntity__NameAssignment_2 ) )
            {
            // InternalTechDsl.g:569:1: ( ( rule__BaseEntity__NameAssignment_2 ) )
            // InternalTechDsl.g:570:2: ( rule__BaseEntity__NameAssignment_2 )
            {
             before(grammarAccess.getBaseEntityAccess().getNameAssignment_2()); 
            // InternalTechDsl.g:571:2: ( rule__BaseEntity__NameAssignment_2 )
            // InternalTechDsl.g:571:3: rule__BaseEntity__NameAssignment_2
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


    // $ANTLR start "rule__LogDocument__NameAssignment_2"
    // InternalTechDsl.g:580:1: rule__LogDocument__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__LogDocument__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechDsl.g:584:1: ( ( ruleEString ) )
            // InternalTechDsl.g:585:2: ( ruleEString )
            {
            // InternalTechDsl.g:585:2: ( ruleEString )
            // InternalTechDsl.g:586:3: ruleEString
            {
             before(grammarAccess.getLogDocumentAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getLogDocumentAccess().getNameEStringParserRuleCall_2_0()); 

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


    // $ANTLR start "rule__LogDocument__BaseentitiesAssignment_4_2"
    // InternalTechDsl.g:595:1: rule__LogDocument__BaseentitiesAssignment_4_2 : ( ruleBaseEntity ) ;
    public final void rule__LogDocument__BaseentitiesAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechDsl.g:599:1: ( ( ruleBaseEntity ) )
            // InternalTechDsl.g:600:2: ( ruleBaseEntity )
            {
            // InternalTechDsl.g:600:2: ( ruleBaseEntity )
            // InternalTechDsl.g:601:3: ruleBaseEntity
            {
             before(grammarAccess.getLogDocumentAccess().getBaseentitiesBaseEntityParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleBaseEntity();

            state._fsp--;

             after(grammarAccess.getLogDocumentAccess().getBaseentitiesBaseEntityParserRuleCall_4_2_0()); 

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
    // $ANTLR end "rule__LogDocument__BaseentitiesAssignment_4_2"


    // $ANTLR start "rule__LogDocument__BaseentitiesAssignment_4_3_1"
    // InternalTechDsl.g:610:1: rule__LogDocument__BaseentitiesAssignment_4_3_1 : ( ruleBaseEntity ) ;
    public final void rule__LogDocument__BaseentitiesAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechDsl.g:614:1: ( ( ruleBaseEntity ) )
            // InternalTechDsl.g:615:2: ( ruleBaseEntity )
            {
            // InternalTechDsl.g:615:2: ( ruleBaseEntity )
            // InternalTechDsl.g:616:3: ruleBaseEntity
            {
             before(grammarAccess.getLogDocumentAccess().getBaseentitiesBaseEntityParserRuleCall_4_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBaseEntity();

            state._fsp--;

             after(grammarAccess.getLogDocumentAccess().getBaseentitiesBaseEntityParserRuleCall_4_3_1_0()); 

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
    // $ANTLR end "rule__LogDocument__BaseentitiesAssignment_4_3_1"


    // $ANTLR start "rule__BaseEntity__NameAssignment_2"
    // InternalTechDsl.g:625:1: rule__BaseEntity__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__BaseEntity__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechDsl.g:629:1: ( ( ruleEString ) )
            // InternalTechDsl.g:630:2: ( ruleEString )
            {
            // InternalTechDsl.g:630:2: ( ruleEString )
            // InternalTechDsl.g:631:3: ruleEString
            {
             before(grammarAccess.getBaseEntityAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBaseEntityAccess().getNameEStringParserRuleCall_2_0()); 

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
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008002L});

}