/*
 * generated by Xtext 2.9.1
 */
package de.roma.cocktail.xtext.parser.antlr;

import com.google.inject.Inject;
import de.roma.cocktail.xtext.parser.antlr.internal.InternalParserParser;
import de.roma.cocktail.xtext.services.ParserGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class ParserParser extends AbstractAntlrParser {

	@Inject
	private ParserGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalParserParser createParser(XtextTokenStream stream) {
		return new InternalParserParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "ParserModel";
	}

	public ParserGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(ParserGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
