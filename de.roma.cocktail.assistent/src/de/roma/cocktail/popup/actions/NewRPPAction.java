package de.roma.cocktail.popup.actions;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;

import de.roma.cocktail.assistent.wizards.NewRPPWizard;

public class NewRPPAction implements IObjectActionDelegate {

    private IWorkbenchPart wPart;
	
	/**
	 * Constructor for NewRPPAction.
	 */
	public NewRPPAction() {
		super();
	}

	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
	    wPart = targetPart;
	}

	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(IAction action) {
	    // Create the wizard
        NewRPPWizard wizard = new NewRPPWizard();
        wizard.init(PlatformUI.getWorkbench(), (IStructuredSelection) wPart.getSite().getSelectionProvider().getSelection());

        // Create the wizard dialog
        WizardDialog dialog = new WizardDialog(wPart.getSite().getShell(), wizard);
        dialog.create();
        dialog.getShell().setText(wizard.getWindowTitle());
        
        // Open the wizard dialog
        dialog.open();
	}

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
	}

}
