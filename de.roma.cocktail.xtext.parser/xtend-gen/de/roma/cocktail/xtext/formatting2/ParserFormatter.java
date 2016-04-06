package de.roma.cocktail.xtext.formatting2;

import de.roma.cocktail.xtext.parser.ScannerName;
import java.util.Arrays;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.formatting2.AbstractFormatter2;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.formatting2.IHiddenRegionFormatter;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class ParserFormatter extends AbstractFormatter2 {
  @Override
  protected void _format(final EObject obj, final IFormattableDocument document) {
    InputOutput.<String>println("okkkkkkkkkkkkkkkkkkk");
    super._format(obj, document);
  }
  
  protected void _format(final ScannerName name, @Extension final IFormattableDocument document) {
    final Procedure1<IHiddenRegionFormatter> _function = new Procedure1<IHiddenRegionFormatter>() {
      @Override
      public void apply(final IHiddenRegionFormatter it) {
        it.setNewLines(0, 1, 1);
        it.noSpace();
      }
    };
    document.<ScannerName>prepend(name, _function);
  }
  
  public void format(final Object name, final IFormattableDocument document) {
    if (name instanceof XtextResource) {
      _format((XtextResource)name, document);
      return;
    } else if (name instanceof ScannerName) {
      _format((ScannerName)name, document);
      return;
    } else if (name instanceof EObject) {
      _format((EObject)name, document);
      return;
    } else if (name == null) {
      _format((Void)null, document);
      return;
    } else if (name != null) {
      _format(name, document);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(name, document).toString());
    }
  }
}
