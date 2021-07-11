/*
 * generated by Xtext 2.25.0
 */
package com.senacor.bdm.techdsl.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.senacor.bdm.techdsl.ide.contentassist.antlr.internal.InternalTechDslParser;
import com.senacor.bdm.techdsl.services.TechDslGrammarAccess;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class TechDslParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(TechDslGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, TechDslGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
			builder.put(grammarAccess.getLogDocumentAccess().getGroup(), "rule__LogDocument__Group__0");
			builder.put(grammarAccess.getLogDocumentAccess().getGroup_4(), "rule__LogDocument__Group_4__0");
			builder.put(grammarAccess.getLogDocumentAccess().getGroup_4_3(), "rule__LogDocument__Group_4_3__0");
			builder.put(grammarAccess.getBaseEntityAccess().getGroup(), "rule__BaseEntity__Group__0");
			builder.put(grammarAccess.getLogDocumentAccess().getNameAssignment_2(), "rule__LogDocument__NameAssignment_2");
			builder.put(grammarAccess.getLogDocumentAccess().getBaseentitiesAssignment_4_2(), "rule__LogDocument__BaseentitiesAssignment_4_2");
			builder.put(grammarAccess.getLogDocumentAccess().getBaseentitiesAssignment_4_3_1(), "rule__LogDocument__BaseentitiesAssignment_4_3_1");
			builder.put(grammarAccess.getBaseEntityAccess().getNameAssignment_2(), "rule__BaseEntity__NameAssignment_2");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private TechDslGrammarAccess grammarAccess;

	@Override
	protected InternalTechDslParser createParser() {
		InternalTechDslParser result = new InternalTechDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public TechDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(TechDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
