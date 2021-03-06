/*
 * generated by Xtext 2.9.1
 */
package de.roma.cocktail.xtext.ui.contentassist

import de.roma.cocktail.xtext.rpp.Model
import de.roma.cocktail.xtext.rpp.Scanner
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.RuleCall
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor

/**
 * See https://www.eclipse.org/Xtext/documentation/304_ide_concepts.html#content-assist
 * on how to customize the content assistant.
 */
class RppProposalProvider extends AbstractRppProposalProvider {
			
	val generics= #['return']
	val commands = #['GetToken','BeginFile','BeginFileW','BeginMemory','BeginMemoryN',
			'BeginGeneric','CloseFile','BeginScanner','CloseScanner','xxMaxCharacter',
			'xxtChar','GetWord','GetLower','GetUpper','TokenPtr','TokenLength','TokenPtr',
			'TokenLength','Attribute','tScanAttribute','ErrorAttribute','Exit']
	val statements = #['yyEcho','yyLess (n)','yyStart (s)','yyPush (s)','yyPop ()',
			'yyPrevious','yyStartState','yyTab','yyTab1 (a)','yyEol (n)','input ()','unput (c)']
	
	override complete_CodeWall(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		super.complete_CodeWall(model, ruleCall, context, acceptor)	
		val root=context.rootModel as Model
		val scanner=root.scanner as Scanner
		var scannerName="Scanner"
		if(scanner!=null)
		{
			scannerName=scanner.name
		}		
		val name=scannerName
		acceptor.accept(createCompletionProposal(name, context));
		commands.forEach[command | 
  			acceptor.accept(createCompletionProposal(name+"_"+command, context));		
		]
		statements.forEach[statement | 
			acceptor.accept(createCompletionProposal(statement, context));
		]
		generics.forEach[generic | 
			acceptor.accept(createCompletionProposal(generic, context));
		]
	}
	
	
}
