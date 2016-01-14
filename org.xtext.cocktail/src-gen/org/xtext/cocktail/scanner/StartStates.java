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
 *   <li>{@link org.xtext.cocktail.scanner.StartStates#getIncstates <em>Incstates</em>}</li>
 *   <li>{@link org.xtext.cocktail.scanner.StartStates#getExstates <em>Exstates</em>}</li>
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
   * Returns the value of the '<em><b>Incstates</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.cocktail.scanner.StartState}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Incstates</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Incstates</em>' containment reference list.
   * @see org.xtext.cocktail.scanner.ScannerPackage#getStartStates_Incstates()
   * @model containment="true"
   * @generated
   */
  EList<StartState> getIncstates();

  /**
   * Returns the value of the '<em><b>Exstates</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.cocktail.scanner.StartState}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exstates</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exstates</em>' containment reference list.
   * @see org.xtext.cocktail.scanner.ScannerPackage#getStartStates_Exstates()
   * @model containment="true"
   * @generated
   */
  EList<StartState> getExstates();

} // StartStates
