package org.xtext.cocktail.ui.syntaxcoloring;

import com.google.inject.Singleton;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.eclipse.xtext.ide.editor.syntaxcoloring.HighlightingStyles;
import org.eclipse.xtext.ui.editor.syntaxcoloring.AbstractAntlrTokenToAttributeIdMapper;

/**
 * @author Sebastian Zarnekow - Initial contribution and API
 */
@Singleton
@SuppressWarnings("all")
public class ScannerTokenMapper extends AbstractAntlrTokenToAttributeIdMapper {
  private final static Pattern QUOTED = Pattern.compile("(?:^\'([^\']*)\'$)|(?:^\"([^\"]*)\")$", Pattern.MULTILINE);
  
  private final static Pattern PUNCTUATION = Pattern.compile("\\p{Punct}*");
  
  @Override
  protected String calculateId(final String tokenName, final int tokenType) {
    Matcher _matcher = ScannerTokenMapper.PUNCTUATION.matcher(tokenName);
    boolean _matches = _matcher.matches();
    if (_matches) {
      return HighlightingStyles.PUNCTUATION_ID;
    }
    Matcher _matcher_1 = ScannerTokenMapper.QUOTED.matcher(tokenName);
    boolean _matches_1 = _matcher_1.matches();
    if (_matches_1) {
      return HighlightingStyles.KEYWORD_ID;
    }
    boolean _equals = "RULE_STRING".equals(tokenName);
    if (_equals) {
      return HighlightingStyles.STRING_ID;
    }
    boolean _equals_1 = "RULE_INT".equals(tokenName);
    if (_equals_1) {
      return HighlightingStyles.NUMBER_ID;
    }
    boolean _or = false;
    boolean _equals_2 = "RULE_ML_COMMENT".equals(tokenName);
    if (_equals_2) {
      _or = true;
    } else {
      boolean _equals_3 = "RULE_SL_COMMENT".equals(tokenName);
      _or = _equals_3;
    }
    if (_or) {
      return HighlightingStyles.COMMENT_ID;
    }
    boolean _equals_4 = "RULE_INLINE_CODE".equals(tokenName);
    if (_equals_4) {
      return HighlightingStyles.TASK_ID;
    }
    return HighlightingStyles.DEFAULT_ID;
  }
}
