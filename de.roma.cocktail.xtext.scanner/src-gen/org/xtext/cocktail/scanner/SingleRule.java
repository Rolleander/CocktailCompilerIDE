/**
 * generated by Xtext 2.9.1
 */
package org.xtext.cocktail.scanner;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Single Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.cocktail.scanner.SingleRule#getRule <em>Rule</em>}</li>
 *   <li>{@link org.xtext.cocktail.scanner.SingleRule#getContent <em>Content</em>}</li>
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
   * Returns the value of the '<em><b>Rule</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rule</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rule</em>' containment reference.
   * @see #setRule(RuleDefinition)
   * @see org.xtext.cocktail.scanner.ScannerPackage#getSingleRule_Rule()
   * @model containment="true"
   * @generated
   */
  RuleDefinition getRule();

  /**
   * Sets the value of the '{@link org.xtext.cocktail.scanner.SingleRule#getRule <em>Rule</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rule</em>' containment reference.
   * @see #getRule()
   * @generated
   */
  void setRule(RuleDefinition value);

  /**
   * Returns the value of the '<em><b>Content</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Content</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Content</em>' attribute.
   * @see #setContent(String)
   * @see org.xtext.cocktail.scanner.ScannerPackage#getSingleRule_Content()
   * @model
   * @generated
   */
  String getContent();

  /**
   * Sets the value of the '{@link org.xtext.cocktail.scanner.SingleRule#getContent <em>Content</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Content</em>' attribute.
   * @see #getContent()
   * @generated
   */
  void setContent(String value);

} // SingleRule
