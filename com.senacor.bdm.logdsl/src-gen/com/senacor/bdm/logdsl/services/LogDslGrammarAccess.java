/*
 * generated by Xtext 2.25.0
 */
package com.senacor.bdm.logdsl.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.EnumLiteralDeclaration;
import org.eclipse.xtext.EnumRule;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class LogDslGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class LogDocumentElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.senacor.bdm.logdsl.LogDsl.LogDocument");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cLogDocumentAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cPackageKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameQualifiedNameParserRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Assignment cMemberAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cMemberMemberParserRuleCall_3_0 = (RuleCall)cMemberAssignment_3.eContents().get(0);
		
		//LogDocument returns LogDocument:
		//    {LogDocument}
		//    'package' name=QualifiedName
		//    (member+=member)*
		//    ;
		@Override public ParserRule getRule() { return rule; }
		
		//{LogDocument}
		//'package' name=QualifiedName
		//(member+=member)*
		public Group getGroup() { return cGroup; }
		
		//{LogDocument}
		public Action getLogDocumentAction_0() { return cLogDocumentAction_0; }
		
		//'package'
		public Keyword getPackageKeyword_1() { return cPackageKeyword_1; }
		
		//name=QualifiedName
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//QualifiedName
		public RuleCall getNameQualifiedNameParserRuleCall_2_0() { return cNameQualifiedNameParserRuleCall_2_0; }
		
		//(member+=member)*
		public Assignment getMemberAssignment_3() { return cMemberAssignment_3; }
		
		//member
		public RuleCall getMemberMemberParserRuleCall_3_0() { return cMemberMemberParserRuleCall_3_0; }
	}
	public class MemberElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.senacor.bdm.logdsl.LogDsl.member");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cEntityParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cFieldParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//member returns member:
		//    Entity|Field
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//Entity|Field
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//Entity
		public RuleCall getEntityParserRuleCall_0() { return cEntityParserRuleCall_0; }
		
		//Field
		public RuleCall getFieldParserRuleCall_1() { return cFieldParserRuleCall_1; }
	}
	public class EntityElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.senacor.bdm.logdsl.LogDsl.Entity");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cEntityKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cFieldsKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cHyphenMinusKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cFieldsAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cFieldsFieldParserRuleCall_4_1_0 = (RuleCall)cFieldsAssignment_4_1.eContents().get(0);
		private final Group cGroup_4_2 = (Group)cGroup_4.eContents().get(2);
		private final Keyword cHyphenMinusKeyword_4_2_0 = (Keyword)cGroup_4_2.eContents().get(0);
		private final Assignment cFieldsAssignment_4_2_1 = (Assignment)cGroup_4_2.eContents().get(1);
		private final RuleCall cFieldsFieldParserRuleCall_4_2_1_0 = (RuleCall)cFieldsAssignment_4_2_1.eContents().get(0);
		
		//Entity returns Entity:
		//    'Entity' name=ID
		//    'Fields' ':'
		//    ('-' fields+=Field ('-' fields+=Field)*)
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'Entity' name=ID
		//'Fields' ':'
		//('-' fields+=Field ('-' fields+=Field)*)
		public Group getGroup() { return cGroup; }
		
		//'Entity'
		public Keyword getEntityKeyword_0() { return cEntityKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'Fields'
		public Keyword getFieldsKeyword_2() { return cFieldsKeyword_2; }
		
		//':'
		public Keyword getColonKeyword_3() { return cColonKeyword_3; }
		
		//('-' fields+=Field ('-' fields+=Field)*)
		public Group getGroup_4() { return cGroup_4; }
		
		//'-'
		public Keyword getHyphenMinusKeyword_4_0() { return cHyphenMinusKeyword_4_0; }
		
		//fields+=Field
		public Assignment getFieldsAssignment_4_1() { return cFieldsAssignment_4_1; }
		
		//Field
		public RuleCall getFieldsFieldParserRuleCall_4_1_0() { return cFieldsFieldParserRuleCall_4_1_0; }
		
		//('-' fields+=Field)*
		public Group getGroup_4_2() { return cGroup_4_2; }
		
		//'-'
		public Keyword getHyphenMinusKeyword_4_2_0() { return cHyphenMinusKeyword_4_2_0; }
		
		//fields+=Field
		public Assignment getFieldsAssignment_4_2_1() { return cFieldsAssignment_4_2_1; }
		
		//Field
		public RuleCall getFieldsFieldParserRuleCall_4_2_1_0() { return cFieldsFieldParserRuleCall_4_2_1_0; }
	}
	public class FieldElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.senacor.bdm.logdsl.LogDsl.Field");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Assignment cDtypeAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cDtypeDataTypesEnumRuleCall_1_0 = (RuleCall)cDtypeAssignment_1.eContents().get(0);
		
		//Field returns Field:
		//    name=ID dtype=DataTypes
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID dtype=DataTypes
		public Group getGroup() { return cGroup; }
		
		//name=ID
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0() { return cNameIDTerminalRuleCall_0_0; }
		
		//dtype=DataTypes
		public Assignment getDtypeAssignment_1() { return cDtypeAssignment_1; }
		
		//DataTypes
		public RuleCall getDtypeDataTypesEnumRuleCall_1_0() { return cDtypeDataTypesEnumRuleCall_1_0; }
	}
	public class QualifiedNameElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.senacor.bdm.logdsl.LogDsl.QualifiedName");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cGroup.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_0_0 = (RuleCall)cGroup_0.eContents().get(0);
		private final Keyword cFullStopKeyword_0_1 = (Keyword)cGroup_0.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		
		//QualifiedName:
		//    (ID '.')* ID
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//(ID '.')* ID
		public Group getGroup() { return cGroup; }
		
		//(ID '.')*
		public Group getGroup_0() { return cGroup_0; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_0_0() { return cIDTerminalRuleCall_0_0; }
		
		//'.'
		public Keyword getFullStopKeyword_0_1() { return cFullStopKeyword_0_1; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_1() { return cIDTerminalRuleCall_1; }
	}
	public class EStringElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.senacor.bdm.logdsl.LogDsl.EString");
		private final RuleCall cSTRINGTerminalRuleCall = (RuleCall)rule.eContents().get(1);
		
		//EString returns ecore::EString:
		//    STRING;
		@Override public ParserRule getRule() { return rule; }
		
		//STRING
		public RuleCall getSTRINGTerminalRuleCall() { return cSTRINGTerminalRuleCall; }
	}
	public class EIntElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.senacor.bdm.logdsl.LogDsl.EInt");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cHyphenMinusKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final RuleCall cINTTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		
		//EInt returns ecore::EInt:
		//    '-'? INT;
		@Override public ParserRule getRule() { return rule; }
		
		//'-'? INT
		public Group getGroup() { return cGroup; }
		
		//'-'?
		public Keyword getHyphenMinusKeyword_0() { return cHyphenMinusKeyword_0; }
		
		//INT
		public RuleCall getINTTerminalRuleCall_1() { return cINTTerminalRuleCall_1; }
	}
	public class EBooleanElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.senacor.bdm.logdsl.LogDsl.EBoolean");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Keyword cTrueKeyword_0 = (Keyword)cAlternatives.eContents().get(0);
		private final Keyword cFalseKeyword_1 = (Keyword)cAlternatives.eContents().get(1);
		
		//EBoolean returns ecore::EBoolean:
		//    'true' | 'false';
		@Override public ParserRule getRule() { return rule; }
		
		//'true' | 'false'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//'true'
		public Keyword getTrueKeyword_0() { return cTrueKeyword_0; }
		
		//'false'
		public Keyword getFalseKeyword_1() { return cFalseKeyword_1; }
	}
	
	public class DataTypesElements extends AbstractElementFinder.AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "com.senacor.bdm.logdsl.LogDsl.DataTypes");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cStringEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cStringStringKeyword_0_0 = (Keyword)cStringEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cNumberEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cNumberNumberKeyword_1_0 = (Keyword)cNumberEnumLiteralDeclaration_1.eContents().get(0);
		
		//enum DataTypes returns DataTypes:
		//    String = 'String' | Number = 'Number'
		//;
		public EnumRule getRule() { return rule; }
		
		//String = 'String' | Number = 'Number'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//String = 'String'
		public EnumLiteralDeclaration getStringEnumLiteralDeclaration_0() { return cStringEnumLiteralDeclaration_0; }
		
		//'String'
		public Keyword getStringStringKeyword_0_0() { return cStringStringKeyword_0_0; }
		
		//Number = 'Number'
		public EnumLiteralDeclaration getNumberEnumLiteralDeclaration_1() { return cNumberEnumLiteralDeclaration_1; }
		
		//'Number'
		public Keyword getNumberNumberKeyword_1_0() { return cNumberNumberKeyword_1_0; }
	}
	
	private final LogDocumentElements pLogDocument;
	private final MemberElements pMember;
	private final EntityElements pEntity;
	private final FieldElements pField;
	private final QualifiedNameElements pQualifiedName;
	private final EStringElements pEString;
	private final TerminalRule tID;
	private final EIntElements pEInt;
	private final EBooleanElements pEBoolean;
	private final DataTypesElements eDataTypes;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public LogDslGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pLogDocument = new LogDocumentElements();
		this.pMember = new MemberElements();
		this.pEntity = new EntityElements();
		this.pField = new FieldElements();
		this.pQualifiedName = new QualifiedNameElements();
		this.pEString = new EStringElements();
		this.tID = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "com.senacor.bdm.logdsl.LogDsl.ID");
		this.pEInt = new EIntElements();
		this.pEBoolean = new EBooleanElements();
		this.eDataTypes = new DataTypesElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("com.senacor.bdm.logdsl.LogDsl".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//LogDocument returns LogDocument:
	//    {LogDocument}
	//    'package' name=QualifiedName
	//    (member+=member)*
	//    ;
	public LogDocumentElements getLogDocumentAccess() {
		return pLogDocument;
	}
	
	public ParserRule getLogDocumentRule() {
		return getLogDocumentAccess().getRule();
	}
	
	//member returns member:
	//    Entity|Field
	//;
	public MemberElements getMemberAccess() {
		return pMember;
	}
	
	public ParserRule getMemberRule() {
		return getMemberAccess().getRule();
	}
	
	//Entity returns Entity:
	//    'Entity' name=ID
	//    'Fields' ':'
	//    ('-' fields+=Field ('-' fields+=Field)*)
	//;
	public EntityElements getEntityAccess() {
		return pEntity;
	}
	
	public ParserRule getEntityRule() {
		return getEntityAccess().getRule();
	}
	
	//Field returns Field:
	//    name=ID dtype=DataTypes
	//;
	public FieldElements getFieldAccess() {
		return pField;
	}
	
	public ParserRule getFieldRule() {
		return getFieldAccess().getRule();
	}
	
	//QualifiedName:
	//    (ID '.')* ID
	//;
	public QualifiedNameElements getQualifiedNameAccess() {
		return pQualifiedName;
	}
	
	public ParserRule getQualifiedNameRule() {
		return getQualifiedNameAccess().getRule();
	}
	
	//EString returns ecore::EString:
	//    STRING;
	public EStringElements getEStringAccess() {
		return pEString;
	}
	
	public ParserRule getEStringRule() {
		return getEStringAccess().getRule();
	}
	
	//@Override
	//terminal ID:
	//    '^'?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*
	////    '^'?('a'..'z'|'A'..'Z'|'_'|'�'|'�'|'�'|'�'|'�'|'�') ('a'..'z'|'A'..'Z'|'�'|'�'|'�'|'�'|'�'|'�'|'�'|'_'|'0'..'9')*
	//;
	public TerminalRule getIDRule() {
		return tID;
	}
	
	//EInt returns ecore::EInt:
	//    '-'? INT;
	public EIntElements getEIntAccess() {
		return pEInt;
	}
	
	public ParserRule getEIntRule() {
		return getEIntAccess().getRule();
	}
	
	//EBoolean returns ecore::EBoolean:
	//    'true' | 'false';
	public EBooleanElements getEBooleanAccess() {
		return pEBoolean;
	}
	
	public ParserRule getEBooleanRule() {
		return getEBooleanAccess().getRule();
	}
	
	//enum DataTypes returns DataTypes:
	//    String = 'String' | Number = 'Number'
	//;
	public DataTypesElements getDataTypesAccess() {
		return eDataTypes;
	}
	
	public EnumRule getDataTypesRule() {
		return getDataTypesAccess().getRule();
	}
	
	//terminal INT returns ecore::EInt: ('0'..'9')+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//            '"' ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|'"') )* '"' |
	//            "'" ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|"'") )* "'"
	//        ;
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT : '/*' -> '*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT : '//' !('\n'|'\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS         : (' '|'\t'|'\r'|'\n')+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER: .;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}