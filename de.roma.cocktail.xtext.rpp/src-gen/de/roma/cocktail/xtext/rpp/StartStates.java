/**
 * generated by Xtext 2.9.2
 */
package de.roma.cocktail.xtext.rpp;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Start States</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.roma.cocktail.xtext.rpp.StartStates#getIncstates <em>Incstates</em>}</li>
 *   <li>{@link de.roma.cocktail.xtext.rpp.StartStates#getExstates <em>Exstates</em>}</li>
 * </ul>
 *
 * @see de.roma.cocktail.xtext.rpp.RppPackage#getStartStates()
 * @model
 * @generated
 */
public interface StartStates extends EObject
{
  /**
   * Returns the value of the '<em><b>Incstates</b></em>' containment reference list.
   * The list contents are of type {@link de.roma.cocktail.xtext.rpp.StartState}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Incstates</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Incstates</em>' containment reference list.
   * @see de.roma.cocktail.xtext.rpp.RppPackage#getStartStates_Incstates()
   * @model containment="true"
   * @generated
   */
  EList<StartState> getIncstates();

  /**
   * Returns the value of the '<em><b>Exstates</b></em>' containment reference list.
   * The list contents are of type {@link de.roma.cocktail.xtext.rpp.StartState}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exstates</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exstates</em>' containment reference list.
   * @see de.roma.cocktail.xtext.rpp.RppPackage#getStartStates_Exstates()
   * @model containment="true"
   * @generated
   */
  EList<StartState> getExstates();

} // StartStates
