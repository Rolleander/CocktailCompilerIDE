/*
 * generated by Xtext 2.9.1
 */
package de.roma.cocktail.xtext.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractLppValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(de.roma.cocktail.xtext.lpp.LppPackage.eINSTANCE);
		return result;
	}
	
}
