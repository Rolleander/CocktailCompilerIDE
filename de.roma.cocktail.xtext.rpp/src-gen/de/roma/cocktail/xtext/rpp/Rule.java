/**
 * generated by Xtext 2.9.2
 */
package de.roma.cocktail.xtext.rpp;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.roma.cocktail.xtext.rpp.Rule#getInfo <em>Info</em>}</li>
 *   <li>{@link de.roma.cocktail.xtext.rpp.Rule#getRules <em>Rules</em>}</li>
 * </ul>
 *
 * @see de.roma.cocktail.xtext.rpp.RppPackage#getRule()
 * @model
 * @generated
 */
public interface Rule extends EObject
{
  /**
   * Returns the value of the '<em><b>Info</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Info</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Info</em>' attribute.
   * @see #setInfo(String)
   * @see de.roma.cocktail.xtext.rpp.RppPackage#getRule_Info()
   * @model
   * @generated
   */
  String getInfo();

  /**
   * Sets the value of the '{@link de.roma.cocktail.xtext.rpp.Rule#getInfo <em>Info</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Info</em>' attribute.
   * @see #getInfo()
   * @generated
   */
  void setInfo(String value);

  /**
   * Returns the value of the '<em><b>Rules</b></em>' containment reference list.
   * The list contents are of type {@link de.roma.cocktail.xtext.rpp.SingleRule}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rules</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rules</em>' containment reference list.
   * @see de.roma.cocktail.xtext.rpp.RppPackage#getRule_Rules()
   * @model containment="true"
   * @generated
   */
  EList<SingleRule> getRules();

} // Rule
