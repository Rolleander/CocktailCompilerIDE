/**
 * generated by Xtext 2.9.1
 */
package de.roma.cocktail.xtext.ui;

import com.google.inject.Binder;
import com.google.inject.binder.AnnotatedBindingBuilder;
import de.roma.cocktail.xtext.ui.AbstractParserUiModule;
import de.roma.cocktail.xtext.ui.hover.ParserEObjectHoverProvider;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor;
import org.eclipse.xtext.ui.editor.hover.html.DefaultEObjectHoverProvider;

/**
 * Use this class to register components to be used within the Eclipse IDE.
 */
@FinalFieldsConstructor
@SuppressWarnings("all")
public class ParserUiModule extends AbstractParserUiModule {
  @Override
  public void configure(final Binder binder) {
    super.configure(binder);
    AnnotatedBindingBuilder<DefaultEObjectHoverProvider> _bind = binder.<DefaultEObjectHoverProvider>bind(DefaultEObjectHoverProvider.class);
    _bind.to(ParserEObjectHoverProvider.class);
  }
  
  public ParserUiModule(final AbstractUIPlugin plugin) {
    super(plugin);
  }
}
