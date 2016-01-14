/**
 */
package org.xtext.cocktail.scanner;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.cocktail.scanner.Rule#getInfo <em>Info</em>}</li>
 *   <li>{@link org.xtext.cocktail.scanner.Rule#getRules <em>Rules</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.cocktail.scanner.ScannerPackage#getRule()
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
   * @see org.xtext.cocktail.scanner.ScannerPackage#getRule_Info()
   * @model
   * @generated
   */
  String getInfo();

  /**
   * Sets the value of the '{@link org.xtext.cocktail.scanner.Rule#getInfo <em>Info</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Info</em>' attribute.
   * @see #getInfo()
   * @generated
   */
  void setInfo(String value);

  /**
   * Returns the value of the '<em><b>Rules</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.cocktail.scanner.SingleRule}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rules</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rules</em>' containment reference list.
   * @see org.xtext.cocktail.scanner.ScannerPackage#getRule_Rules()
   * @model containment="true"
   * @generated
   */
  EList<SingleRule> getRules();

} // Rule
