package org.xtext.cocktail.ui.syntaxcoloring

import java.util.regex.Pattern
import org.eclipse.xtext.ide.editor.syntaxcoloring.HighlightingStyles
import org.eclipse.xtext.ui.editor.syntaxcoloring.AbstractAntlrTokenToAttributeIdMapper
import com.google.inject.Singleton

/** 
 * @author Sebastian Zarnekow - Initial contribution and API
 */
@Singleton class ScannerTokenMapper extends AbstractAntlrTokenToAttributeIdMapper {
	static final Pattern QUOTED = Pattern.compile("(?:^'([^']*)'$)|(?:^\"([^\"]*)\")$", Pattern.MULTILINE)
	static final Pattern PUNCTUATION = Pattern.compile("\\p{Punct}*")

	override protected String calculateId(String tokenName, int tokenType) {
		if (PUNCTUATION.matcher(tokenName).matches()) {
			return HighlightingStyles.PUNCTUATION_ID
		}
		if (QUOTED.matcher(tokenName).matches()) {
			return HighlightingStyles.KEYWORD_ID
		}
		if ("RULE_STRING".equals(tokenName)) {
			return HighlightingStyles.STRING_ID
		}
		if ("RULE_INT".equals(tokenName)) {
			return HighlightingStyles.NUMBER_ID
		}
		if ("RULE_ML_COMMENT".equals(tokenName) || "RULE_SL_COMMENT".equals(tokenName)) {
			return HighlightingStyles.COMMENT_ID
		}
		if ("RULE_INLINE_CODE".equals(tokenName)) {
			return HighlightingStyles.TASK_ID
		}
		return HighlightingStyles.DEFAULT_ID
	}
}
