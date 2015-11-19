/**
 */
package org.xtext.cocktail.scanner;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Single Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.cocktail.scanner.SingleRule#getState <em>State</em>}</li>
 *   <li>{@link org.xtext.cocktail.scanner.SingleRule#getRegex <em>Regex</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.cocktail.scanner.ScannerPackage#getSingleRule()
 * @model
 * @generated
 */
public interface SingleRule extends EObject
{
  /**
   * Returns the value of the '<em><b>State</b></em>' reference list.
   * The list contents are of type {@link org.xtext.cocktail.scanner.StartState}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>State</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>State</em>' reference list.
   * @see org.xtext.cocktail.scanner.ScannerPackage#getSingleRule_State()
   * @model
   * @generated
   */
  EList<StartState> getState();

  /**
   * Returns the value of the '<em><b>Regex</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Regex</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Regex</em>' attribute list.
   * @see org.xtext.cocktail.scanner.ScannerPackage#getSingleRule_Regex()
   * @model unique="false"
   * @generated
   */
  EList<String> getRegex();

} // SingleRule
