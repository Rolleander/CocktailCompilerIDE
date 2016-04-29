/*
 * generated by Xtext 2.9.1
 */
package de.roma.cocktail.xtext.parser.antlr;

import com.google.inject.Inject;
import de.roma.cocktail.xtext.parser.antlr.internal.InternalAstParser;
import de.roma.cocktail.xtext.services.AstGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class AstParser extends AbstractAntlrParser {

	@Inject
	private AstGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalAstParser createParser(XtextTokenStream stream) {
		return new InternalAstParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Model";
	}

	public AstGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(AstGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}