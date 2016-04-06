/**
 * generated by Xtext 2.9.1
 */
package de.roma.cocktail.xtext.lpp;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Start Symbols</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.roma.cocktail.xtext.lpp.StartSymbols#getStates <em>States</em>}</li>
 * </ul>
 *
 * @see de.roma.cocktail.xtext.lpp.LppPackage#getStartSymbols()
 * @model
 * @generated
 */
public interface StartSymbols extends EObject
{
  /**
   * Returns the value of the '<em><b>States</b></em>' containment reference list.
   * The list contents are of type {@link de.roma.cocktail.xtext.lpp.StartState}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>States</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>States</em>' containment reference list.
   * @see de.roma.cocktail.xtext.lpp.LppPackage#getStartSymbols_States()
   * @model containment="true"
   * @generated
   */
  EList<StartState> getStates();

} // StartSymbols
