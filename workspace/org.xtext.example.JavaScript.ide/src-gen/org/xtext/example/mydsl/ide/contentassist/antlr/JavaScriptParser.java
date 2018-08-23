/*
 * generated by Xtext 2.12.0
 */
package org.xtext.example.mydsl.ide.contentassist.antlr;

import com.google.inject.Inject;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.xtext.example.mydsl.ide.contentassist.antlr.internal.InternalJavaScriptParser;
import org.xtext.example.mydsl.services.JavaScriptGrammarAccess;

public class JavaScriptParser extends AbstractContentAssistParser {

	@Inject
	private JavaScriptGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalJavaScriptParser createParser() {
		InternalJavaScriptParser result = new InternalJavaScriptParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getElemsAccess().getAlternatives(), "rule__Elems__Alternatives");
					put(grammarAccess.getOpsAccess().getAlternatives(), "rule__Ops__Alternatives");
					put(grammarAccess.getFuncsAccess().getAlternatives(), "rule__Funcs__Alternatives");
					put(grammarAccess.getBooleanAccess().getAlternatives(), "rule__Boolean__Alternatives");
					put(grammarAccess.getJavaScriptAccess().getGroup(), "rule__JavaScript__Group__0");
					put(grammarAccess.getOpsAccess().getGroup_0(), "rule__Ops__Group_0__0");
					put(grammarAccess.getOpsAccess().getGroup_1(), "rule__Ops__Group_1__0");
					put(grammarAccess.getFuncsAccess().getGroup_2(), "rule__Funcs__Group_2__0");
					put(grammarAccess.getJavaScriptAccess().getNameAssignment_1(), "rule__JavaScript__NameAssignment_1");
					put(grammarAccess.getJavaScriptAccess().getElementsAssignment_3(), "rule__JavaScript__ElementsAssignment_3");
					put(grammarAccess.getElemsAccess().getElementsAssignment_0(), "rule__Elems__ElementsAssignment_0");
					put(grammarAccess.getElemsAccess().getElementsAssignment_1(), "rule__Elems__ElementsAssignment_1");
					put(grammarAccess.getElemsAccess().getElementsAssignment_2(), "rule__Elems__ElementsAssignment_2");
				}
			};
		}
		return nameMappings.get(element);
	}
			
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public JavaScriptGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(JavaScriptGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
