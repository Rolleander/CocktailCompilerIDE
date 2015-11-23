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
 * </p>
 * <ul>
 *   <li>{@link org.xtext.cocktail.scanner.SingleRule#getRule <em>Rule</em>}</li>
 *   <li>{@link org.xtext.cocktail.scanner.SingleRule#getContent <em>Content</em>}</li>
 * </ul>
 *
 * @see org.xtext.cocktail.scanner.ScannerPackage#getSingleRule()
 * @model
 * @generated
 */
public interface SingleRule extends EObject
{
  /**
   * Returns the value of the '<em><b>Rule</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rule</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rule</em>' attribute list.
   * @see org.xtext.cocktail.scanner.ScannerPackage#getSingleRule_Rule()
   * @model unique="false"
   * @generated
   */
  EList<String> getRule();

  /**
   * Returns the value of the '<em><b>Content</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Content</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Content</em>' attribute list.
   * @see org.xtext.cocktail.scanner.ScannerPackage#getSingleRule_Content()
   * @model unique="false"
   * @generated
   */
  EList<String> getContent();

} // SingleRule
