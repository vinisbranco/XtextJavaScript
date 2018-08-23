/*
 * generated by Xtext 2.12.0
 */
grammar InternalJavaScript;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

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
import org.xtext.example.mydsl.services.JavaScriptGrammarAccess;

}
@parser::members {
	private JavaScriptGrammarAccess grammarAccess;

	public void setGrammarAccess(JavaScriptGrammarAccess grammarAccess) {
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

// Entry rule entryRuleJavaScript
entryRuleJavaScript
:
{ before(grammarAccess.getJavaScriptRule()); }
	 ruleJavaScript
{ after(grammarAccess.getJavaScriptRule()); } 
	 EOF 
;

// Rule JavaScript
ruleJavaScript 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getJavaScriptAccess().getGroup()); }
		(rule__JavaScript__Group__0)
		{ after(grammarAccess.getJavaScriptAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleelems
entryRuleelems
:
{ before(grammarAccess.getElemsRule()); }
	 ruleelems
{ after(grammarAccess.getElemsRule()); } 
	 EOF 
;

// Rule elems
ruleelems 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getElemsAccess().getAlternatives()); }
		(rule__Elems__Alternatives)
		{ after(grammarAccess.getElemsAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleOps
entryRuleOps
:
{ before(grammarAccess.getOpsRule()); }
	 ruleOps
{ after(grammarAccess.getOpsRule()); } 
	 EOF 
;

// Rule Ops
ruleOps 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getOpsAccess().getAlternatives()); }
		(rule__Ops__Alternatives)
		{ after(grammarAccess.getOpsAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRulefuncs
entryRulefuncs
:
{ before(grammarAccess.getFuncsRule()); }
	 rulefuncs
{ after(grammarAccess.getFuncsRule()); } 
	 EOF 
;

// Rule funcs
rulefuncs 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getFuncsAccess().getAlternatives()); }
		(rule__Funcs__Alternatives)
		{ after(grammarAccess.getFuncsAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleBoolean
entryRuleBoolean
:
{ before(grammarAccess.getBooleanRule()); }
	 ruleBoolean
{ after(grammarAccess.getBooleanRule()); } 
	 EOF 
;

// Rule Boolean
ruleBoolean 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getBooleanAccess().getAlternatives()); }
		(rule__Boolean__Alternatives)
		{ after(grammarAccess.getBooleanAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Elems__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getElemsAccess().getElementsAssignment_0()); }
		(rule__Elems__ElementsAssignment_0)
		{ after(grammarAccess.getElemsAccess().getElementsAssignment_0()); }
	)
	|
	(
		{ before(grammarAccess.getElemsAccess().getElementsAssignment_1()); }
		(rule__Elems__ElementsAssignment_1)
		{ after(grammarAccess.getElemsAccess().getElementsAssignment_1()); }
	)
	|
	(
		{ before(grammarAccess.getElemsAccess().getElementsAssignment_2()); }
		(rule__Elems__ElementsAssignment_2)
		{ after(grammarAccess.getElemsAccess().getElementsAssignment_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Ops__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getOpsAccess().getGroup_0()); }
		(rule__Ops__Group_0__0)
		{ after(grammarAccess.getOpsAccess().getGroup_0()); }
	)
	|
	(
		{ before(grammarAccess.getOpsAccess().getGroup_1()); }
		(rule__Ops__Group_1__0)
		{ after(grammarAccess.getOpsAccess().getGroup_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Funcs__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFuncsAccess().getSTRINGTerminalRuleCall_0()); }
		RULE_STRING
		{ after(grammarAccess.getFuncsAccess().getSTRINGTerminalRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getFuncsAccess().getINTTerminalRuleCall_1()); }
		RULE_INT
		{ after(grammarAccess.getFuncsAccess().getINTTerminalRuleCall_1()); }
	)
	|
	(
		{ before(grammarAccess.getFuncsAccess().getGroup_2()); }
		(rule__Funcs__Group_2__0)
		{ after(grammarAccess.getFuncsAccess().getGroup_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Boolean__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getBooleanAccess().getTrueKeyword_0()); }
		'true'
		{ after(grammarAccess.getBooleanAccess().getTrueKeyword_0()); }
	)
	|
	(
		{ before(grammarAccess.getBooleanAccess().getFalseKeyword_1()); }
		'false'
		{ after(grammarAccess.getBooleanAccess().getFalseKeyword_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__JavaScript__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__JavaScript__Group__0__Impl
	rule__JavaScript__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__JavaScript__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getJavaScriptAccess().getVarKeyword_0()); }
	'var'
	{ after(grammarAccess.getJavaScriptAccess().getVarKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__JavaScript__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__JavaScript__Group__1__Impl
	rule__JavaScript__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__JavaScript__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getJavaScriptAccess().getNameAssignment_1()); }
	(rule__JavaScript__NameAssignment_1)
	{ after(grammarAccess.getJavaScriptAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__JavaScript__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__JavaScript__Group__2__Impl
	rule__JavaScript__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__JavaScript__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getJavaScriptAccess().getEqualsSignKeyword_2()); }
	'='
	{ after(grammarAccess.getJavaScriptAccess().getEqualsSignKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__JavaScript__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__JavaScript__Group__3__Impl
	rule__JavaScript__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__JavaScript__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getJavaScriptAccess().getElementsAssignment_3()); }
	(rule__JavaScript__ElementsAssignment_3)
	{ after(grammarAccess.getJavaScriptAccess().getElementsAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__JavaScript__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__JavaScript__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__JavaScript__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getJavaScriptAccess().getSemicolonKeyword_4()); }
	';'
	{ after(grammarAccess.getJavaScriptAccess().getSemicolonKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Ops__Group_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Ops__Group_0__0__Impl
	rule__Ops__Group_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Ops__Group_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOpsAccess().getINTTerminalRuleCall_0_0()); }
	RULE_INT
	{ after(grammarAccess.getOpsAccess().getINTTerminalRuleCall_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Ops__Group_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Ops__Group_0__1__Impl
	rule__Ops__Group_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Ops__Group_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOpsAccess().getPlusSignKeyword_0_1()); }
	'+'
	{ after(grammarAccess.getOpsAccess().getPlusSignKeyword_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Ops__Group_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Ops__Group_0__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Ops__Group_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOpsAccess().getINTTerminalRuleCall_0_2()); }
	RULE_INT
	{ after(grammarAccess.getOpsAccess().getINTTerminalRuleCall_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Ops__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Ops__Group_1__0__Impl
	rule__Ops__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Ops__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOpsAccess().getINTTerminalRuleCall_1_0()); }
	RULE_INT
	{ after(grammarAccess.getOpsAccess().getINTTerminalRuleCall_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Ops__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Ops__Group_1__1__Impl
	rule__Ops__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Ops__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOpsAccess().getHyphenMinusKeyword_1_1()); }
	'-'
	{ after(grammarAccess.getOpsAccess().getHyphenMinusKeyword_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Ops__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Ops__Group_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Ops__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOpsAccess().getINTTerminalRuleCall_1_2()); }
	RULE_INT
	{ after(grammarAccess.getOpsAccess().getINTTerminalRuleCall_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Funcs__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Funcs__Group_2__0__Impl
	rule__Funcs__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Funcs__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFuncsAccess().getINTTerminalRuleCall_2_0()); }
	RULE_INT
	{ after(grammarAccess.getFuncsAccess().getINTTerminalRuleCall_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Funcs__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Funcs__Group_2__1__Impl
	rule__Funcs__Group_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Funcs__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFuncsAccess().getFullStopKeyword_2_1()); }
	'.'
	{ after(grammarAccess.getFuncsAccess().getFullStopKeyword_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Funcs__Group_2__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Funcs__Group_2__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Funcs__Group_2__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFuncsAccess().getINTTerminalRuleCall_2_2()); }
	RULE_INT
	{ after(grammarAccess.getFuncsAccess().getINTTerminalRuleCall_2_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__JavaScript__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getJavaScriptAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getJavaScriptAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__JavaScript__ElementsAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getJavaScriptAccess().getElementsElemsParserRuleCall_3_0()); }
		ruleelems
		{ after(grammarAccess.getJavaScriptAccess().getElementsElemsParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Elems__ElementsAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getElemsAccess().getElementsFuncsParserRuleCall_0_0()); }
		rulefuncs
		{ after(grammarAccess.getElemsAccess().getElementsFuncsParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Elems__ElementsAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getElemsAccess().getElementsBooleanParserRuleCall_1_0()); }
		ruleBoolean
		{ after(grammarAccess.getElemsAccess().getElementsBooleanParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Elems__ElementsAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getElemsAccess().getElementsOpsParserRuleCall_2_0()); }
		ruleOps
		{ after(grammarAccess.getElemsAccess().getElementsOpsParserRuleCall_2_0()); }
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
