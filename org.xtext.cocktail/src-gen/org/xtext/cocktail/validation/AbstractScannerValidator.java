/*
 * generated by Xtext
 */
package org.xtext.cocktail.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;

public class AbstractScannerValidator extends org.eclipse.xtext.validation.AbstractDeclarativeValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(org.xtext.cocktail.scanner.ScannerPackage.eINSTANCE);
		return result;
	}
}
