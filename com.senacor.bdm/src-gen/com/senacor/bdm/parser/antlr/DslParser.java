/*
 * generated by Xtext 2.25.0
 */
package com.senacor.bdm.parser.antlr;

import com.google.inject.Inject;
import com.senacor.bdm.parser.antlr.internal.InternalDslParser;
import com.senacor.bdm.services.DslGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class DslParser extends AbstractAntlrParser {

	@Inject
	private DslGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalDslParser createParser(XtextTokenStream stream) {
		return new InternalDslParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Document";
	}

	public DslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(DslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
