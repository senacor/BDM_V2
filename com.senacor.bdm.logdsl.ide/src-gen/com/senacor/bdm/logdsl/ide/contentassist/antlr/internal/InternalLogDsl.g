/*
 * generated by Xtext 2.25.0
 */
grammar InternalLogDsl;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package com.senacor.bdm.logdsl.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
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

}
@parser::members {
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
}

// Entry rule entryRuleLogDocument
entryRuleLogDocument
:
{ before(grammarAccess.getLogDocumentRule()); }
	 ruleLogDocument
{ after(grammarAccess.getLogDocumentRule()); } 
	 EOF 
;

// Rule LogDocument
ruleLogDocument 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getLogDocumentAccess().getGroup()); }
		(rule__LogDocument__Group__0)
		{ after(grammarAccess.getLogDocumentAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRulemember
entryRulemember
:
{ before(grammarAccess.getMemberRule()); }
	 rulemember
{ after(grammarAccess.getMemberRule()); } 
	 EOF 
;

// Rule member
rulemember 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getMemberAccess().getAlternatives()); }
		(rule__Member__Alternatives)
		{ after(grammarAccess.getMemberAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleEntity
entryRuleEntity
:
{ before(grammarAccess.getEntityRule()); }
	 ruleEntity
{ after(grammarAccess.getEntityRule()); } 
	 EOF 
;

// Rule Entity
ruleEntity 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEntityAccess().getGroup()); }
		(rule__Entity__Group__0)
		{ after(grammarAccess.getEntityAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleField
entryRuleField
:
{ before(grammarAccess.getFieldRule()); }
	 ruleField
{ after(grammarAccess.getFieldRule()); } 
	 EOF 
;

// Rule Field
ruleField 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getFieldAccess().getGroup()); }
		(rule__Field__Group__0)
		{ after(grammarAccess.getFieldAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleQualifiedName
entryRuleQualifiedName
:
{ before(grammarAccess.getQualifiedNameRule()); }
	 ruleQualifiedName
{ after(grammarAccess.getQualifiedNameRule()); } 
	 EOF 
;

// Rule QualifiedName
ruleQualifiedName 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getQualifiedNameAccess().getGroup()); }
		(rule__QualifiedName__Group__0)
		{ after(grammarAccess.getQualifiedNameAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Rule DataTypes
ruleDataTypes
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDataTypesAccess().getAlternatives()); }
		(rule__DataTypes__Alternatives)
		{ after(grammarAccess.getDataTypesAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Member__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMemberAccess().getEntityParserRuleCall_0()); }
		ruleEntity
		{ after(grammarAccess.getMemberAccess().getEntityParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getMemberAccess().getFieldParserRuleCall_1()); }
		ruleField
		{ after(grammarAccess.getMemberAccess().getFieldParserRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DataTypes__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDataTypesAccess().getStringEnumLiteralDeclaration_0()); }
		('String')
		{ after(grammarAccess.getDataTypesAccess().getStringEnumLiteralDeclaration_0()); }
	)
	|
	(
		{ before(grammarAccess.getDataTypesAccess().getNumberEnumLiteralDeclaration_1()); }
		('Number')
		{ after(grammarAccess.getDataTypesAccess().getNumberEnumLiteralDeclaration_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__LogDocument__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__LogDocument__Group__0__Impl
	rule__LogDocument__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__LogDocument__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLogDocumentAccess().getLogDocumentAction_0()); }
	()
	{ after(grammarAccess.getLogDocumentAccess().getLogDocumentAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__LogDocument__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__LogDocument__Group__1__Impl
	rule__LogDocument__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__LogDocument__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLogDocumentAccess().getPackageKeyword_1()); }
	'package'
	{ after(grammarAccess.getLogDocumentAccess().getPackageKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__LogDocument__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__LogDocument__Group__2__Impl
	rule__LogDocument__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__LogDocument__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLogDocumentAccess().getNameAssignment_2()); }
	(rule__LogDocument__NameAssignment_2)
	{ after(grammarAccess.getLogDocumentAccess().getNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__LogDocument__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__LogDocument__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__LogDocument__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLogDocumentAccess().getMemberAssignment_3()); }
	(rule__LogDocument__MemberAssignment_3)*
	{ after(grammarAccess.getLogDocumentAccess().getMemberAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Entity__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Entity__Group__0__Impl
	rule__Entity__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntityAccess().getEntityKeyword_0()); }
	'Entity'
	{ after(grammarAccess.getEntityAccess().getEntityKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Entity__Group__1__Impl
	rule__Entity__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntityAccess().getNameAssignment_1()); }
	(rule__Entity__NameAssignment_1)
	{ after(grammarAccess.getEntityAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Entity__Group__2__Impl
	rule__Entity__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntityAccess().getFieldsKeyword_2()); }
	'Fields'
	{ after(grammarAccess.getEntityAccess().getFieldsKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Entity__Group__3__Impl
	rule__Entity__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntityAccess().getColonKeyword_3()); }
	':'
	{ after(grammarAccess.getEntityAccess().getColonKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Entity__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntityAccess().getGroup_4()); }
	(rule__Entity__Group_4__0)
	{ after(grammarAccess.getEntityAccess().getGroup_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Entity__Group_4__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Entity__Group_4__0__Impl
	rule__Entity__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group_4__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntityAccess().getHyphenMinusKeyword_4_0()); }
	'-'
	{ after(grammarAccess.getEntityAccess().getHyphenMinusKeyword_4_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group_4__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Entity__Group_4__1__Impl
	rule__Entity__Group_4__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group_4__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntityAccess().getFieldsAssignment_4_1()); }
	(rule__Entity__FieldsAssignment_4_1)
	{ after(grammarAccess.getEntityAccess().getFieldsAssignment_4_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group_4__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Entity__Group_4__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group_4__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntityAccess().getGroup_4_2()); }
	(rule__Entity__Group_4_2__0)*
	{ after(grammarAccess.getEntityAccess().getGroup_4_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Entity__Group_4_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Entity__Group_4_2__0__Impl
	rule__Entity__Group_4_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group_4_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntityAccess().getHyphenMinusKeyword_4_2_0()); }
	'-'
	{ after(grammarAccess.getEntityAccess().getHyphenMinusKeyword_4_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group_4_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Entity__Group_4_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group_4_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntityAccess().getFieldsAssignment_4_2_1()); }
	(rule__Entity__FieldsAssignment_4_2_1)
	{ after(grammarAccess.getEntityAccess().getFieldsAssignment_4_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Field__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Field__Group__0__Impl
	rule__Field__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Field__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFieldAccess().getNameAssignment_0()); }
	(rule__Field__NameAssignment_0)
	{ after(grammarAccess.getFieldAccess().getNameAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Field__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Field__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Field__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFieldAccess().getDtypeAssignment_1()); }
	(rule__Field__DtypeAssignment_1)
	{ after(grammarAccess.getFieldAccess().getDtypeAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__QualifiedName__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QualifiedName__Group__0__Impl
	rule__QualifiedName__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedName__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQualifiedNameAccess().getGroup_0()); }
	(rule__QualifiedName__Group_0__0)*
	{ after(grammarAccess.getQualifiedNameAccess().getGroup_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedName__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QualifiedName__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedName__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1()); }
	RULE_ID
	{ after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__QualifiedName__Group_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QualifiedName__Group_0__0__Impl
	rule__QualifiedName__Group_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedName__Group_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0_0()); }
	RULE_ID
	{ after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedName__Group_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QualifiedName__Group_0__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedName__Group_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_0_1()); }
	'.'
	{ after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__LogDocument__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getLogDocumentAccess().getNameQualifiedNameParserRuleCall_2_0()); }
		ruleQualifiedName
		{ after(grammarAccess.getLogDocumentAccess().getNameQualifiedNameParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__LogDocument__MemberAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getLogDocumentAccess().getMemberMemberParserRuleCall_3_0()); }
		rulemember
		{ after(grammarAccess.getLogDocumentAccess().getMemberMemberParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__FieldsAssignment_4_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEntityAccess().getFieldsFieldParserRuleCall_4_1_0()); }
		ruleField
		{ after(grammarAccess.getEntityAccess().getFieldsFieldParserRuleCall_4_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__FieldsAssignment_4_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEntityAccess().getFieldsFieldParserRuleCall_4_2_1_0()); }
		ruleField
		{ after(grammarAccess.getEntityAccess().getFieldsFieldParserRuleCall_4_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Field__NameAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_0_0()); }
		RULE_ID
		{ after(grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Field__DtypeAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFieldAccess().getDtypeDataTypesEnumRuleCall_1_0()); }
		ruleDataTypes
		{ after(grammarAccess.getFieldAccess().getDtypeDataTypesEnumRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
