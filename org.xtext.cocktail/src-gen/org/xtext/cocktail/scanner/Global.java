/**
 */
package org.xtext.cocktail.scanner;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Global</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.cocktail.scanner.Global#getContent <em>Content</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.cocktail.scanner.ScannerPackage#getGlobal()
 * @model
 * @generated
 */
public interface Global extends EObject
{
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
   * @see org.xtext.cocktail.scanner.ScannerPackage#getGlobal_Content()
   * @model
   * @generated
   */
  String getContent();

  /**
   * Sets the value of the '{@link org.xtext.cocktail.scanner.Global#getContent <em>Content</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Content</em>' attribute.
   * @see #getContent()
   * @generated
   */
  void setContent(String value);

} // Global
