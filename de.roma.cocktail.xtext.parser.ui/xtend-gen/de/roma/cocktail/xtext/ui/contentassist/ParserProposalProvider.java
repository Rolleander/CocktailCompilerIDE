/**
 * generated by Xtext 2.9.1
 */
package de.roma.cocktail.xtext.ui.contentassist;

import de.roma.cocktail.xtext.ui.contentassist.AbstractParserProposalProvider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor;

/**
 * See https://www.eclipse.org/Xtext/documentation/304_ide_concepts.html#content-assist
 * on how to customize the content assistant.
 */
@SuppressWarnings("all")
public class ParserProposalProvider extends AbstractParserProposalProvider {
  @Override
  public void complete_CodeBlock(final EObject model, final RuleCall ruleCall, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    final String proposal = "[Scanner]\'_GetWord(v);";
    ICompletionProposal _createCompletionProposal = this.createCompletionProposal(proposal, context);
    acceptor.accept(_createCompletionProposal);
  }
  
  @Override
  public void complete_CodeWall(final EObject model, final RuleCall ruleCall, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    final String proposal = "[Scanner]\'_GetWord(v);";
    ICompletionProposal _createCompletionProposal = this.createCompletionProposal(proposal, context);
    acceptor.accept(_createCompletionProposal);
  }
  
  @Override
  public void createProposals(final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    final String proposal = "[Scanner]\'_GetWord(v);";
    ICompletionProposal _createCompletionProposal = this.createCompletionProposal(proposal, context);
    acceptor.accept(_createCompletionProposal);
  }
}
