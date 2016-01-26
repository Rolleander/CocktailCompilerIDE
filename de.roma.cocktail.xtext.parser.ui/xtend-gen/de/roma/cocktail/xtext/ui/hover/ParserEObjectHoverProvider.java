package de.roma.cocktail.xtext.ui.hover;

import com.google.common.base.Objects;
import de.roma.cocktail.xtext.parser.DefinedToken;
import de.roma.cocktail.xtext.parser.GrammarRule;
import de.roma.cocktail.xtext.parser.GrammerReference;
import de.roma.cocktail.xtext.parser.ParserName;
import de.roma.cocktail.xtext.parser.RuleBody;
import de.roma.cocktail.xtext.parser.RuleContent;
import de.roma.cocktail.xtext.parser.RulePart;
import de.roma.cocktail.xtext.parser.ScannerName;
import de.roma.cocktail.xtext.parser.StartState;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.ui.editor.hover.html.DefaultEObjectHoverProvider;

@SuppressWarnings("all")
public class ParserEObjectHoverProvider extends DefaultEObjectHoverProvider {
  @Override
  protected String getFirstLine(final EObject o) {
    String _xblockexpression = null;
    {
      if ((o instanceof ScannerName)) {
        String _name = ((ScannerName)o).getName();
        String _plus = ("Used scanner: <b>" + _name);
        return (_plus + "</b>");
      }
      if ((o instanceof ParserName)) {
        String _name_1 = ((ParserName)o).getName();
        String _plus_1 = ("This Parser\'s name: <b>" + _name_1);
        return (_plus_1 + "</b>");
      }
      if ((o instanceof DefinedToken)) {
        String _name_2 = ((DefinedToken)o).getName();
        String _plus_2 = ("Token: <b>" + _name_2);
        String _plus_3 = (_plus_2 + "</b> <br>Value: <b>");
        int _number = ((DefinedToken)o).getNumber();
        String _plus_4 = (_plus_3 + Integer.valueOf(_number));
        return (_plus_4 + "</b>");
      }
      if ((o instanceof StartState)) {
        String _name_3 = ((StartState)o).getName();
        String _plus_5 = ("StartState: <b>" + _name_3);
        return (_plus_5 + "</b>");
      }
      if ((o instanceof GrammarRule)) {
        String text = "";
        final EList<RuleBody> bodies = ((GrammarRule)o).getBody();
        String _text = text;
        String _name_4 = ((GrammarRule)o).getName();
        String _plus_6 = ("Grammar Rule: <b>" + _name_4);
        String _plus_7 = (_plus_6 + "</b> <br>");
        text = (_text + _plus_7);
        String _text_1 = text;
        text = (_text_1 + "<br> <ul>");
        for (final RuleBody body : bodies) {
          {
            String _text_2 = text;
            text = (_text_2 + "<li>");
            final RulePart part = body.getPart();
            final EList<RuleContent> contents = part.getContent();
            for (final RuleContent c : contents) {
              {
                final String reg = c.getRegex();
                final GrammerReference ref = c.getRef();
                boolean _notEquals = (!Objects.equal(reg, null));
                if (_notEquals) {
                  String _text_3 = text;
                  text = (_text_3 + (reg + " "));
                }
                boolean _notEquals_1 = (!Objects.equal(ref, null));
                if (_notEquals_1) {
                  String _text_4 = text;
                  String _name_5 = ref.getName();
                  String _plus_8 = ("<b>" + _name_5);
                  String _plus_9 = (_plus_8 + "</b> ");
                  text = (_text_4 + _plus_9);
                }
              }
            }
            String _text_3 = text;
            text = (_text_3 + "</li>");
          }
        }
        String _text_2 = text;
        text = (_text_2 + "</ul>");
        return text;
      }
      _xblockexpression = super.getFirstLine(o);
    }
    return _xblockexpression;
  }
}
