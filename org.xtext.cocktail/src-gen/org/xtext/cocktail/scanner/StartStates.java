/**
 */
package org.xtext.cocktail.scanner;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Start States</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.cocktail.scanner.StartStates#getStates <em>States</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.cocktail.scanner.ScannerPackage#getStartStates()
 * @model
 * @generated
 */
public interface StartStates extends EObject
{
  /**
   * Returns the value of the '<em><b>States</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>States</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>States</em>' attribute list.
   * @see org.xtext.cocktail.scanner.ScannerPackage#getStartStates_States()
   * @model unique="false"
   * @generated
   */
  EList<String> getStates();

} // StartStates
