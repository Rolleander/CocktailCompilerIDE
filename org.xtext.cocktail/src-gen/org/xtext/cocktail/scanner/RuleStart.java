/**
 */
package org.xtext.cocktail.scanner;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule Start</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.cocktail.scanner.RuleStart#getState <em>State</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.cocktail.scanner.ScannerPackage#getRuleStart()
 * @model
 * @generated
 */
public interface RuleStart extends SingleRule
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
   * @see org.xtext.cocktail.scanner.ScannerPackage#getRuleStart_State()
   * @model
   * @generated
   */
  EList<StartState> getState();

} // RuleStart
