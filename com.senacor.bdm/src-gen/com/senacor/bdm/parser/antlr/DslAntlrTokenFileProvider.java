/*
 * generated by Xtext 2.25.0
 */
package com.senacor.bdm.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class DslAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("com/senacor/bdm/parser/antlr/internal/InternalDsl.tokens");
	}
}
