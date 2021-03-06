/**
 * generated by Xtext 2.9.1
 */
package de.roma.cocktail.xtext.ui.labeling;

import de.roma.cocktail.xtext.parser.GrammarRule;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.ui.label.DefaultDescriptionLabelProvider;

/**
 * Provides labels for IEObjectDescriptions and IResourceDescriptions.
 * 
 * See https://www.eclipse.org/Xtext/documentation/304_ide_concepts.html#label-provider
 */
@SuppressWarnings("all")
public class ParserDescriptionLabelProvider extends DefaultDescriptionLabelProvider {
  @Override
  public Object text(final IEObjectDescription ele) {
    final EObject o = ele.getEObjectOrProxy();
    if ((o instanceof GrammarRule)) {
    }
    return "Das ist eine tolle GrammarRule!";
  }
}
