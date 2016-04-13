/**
 * generated by Xtext 2.9.1
 */
package org.xtext.cocktail.scanner;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Export</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.cocktail.scanner.Export#getContent <em>Content</em>}</li>
 * </ul>
 *
 * @see org.xtext.cocktail.scanner.ScannerPackage#getExport()
 * @model
 * @generated
 */
public interface Export extends EObject
{
  /**
   * Returns the value of the '<em><b>Content</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Content</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Content</em>' containment reference.
   * @see #setContent(CodeBlock)
   * @see org.xtext.cocktail.scanner.ScannerPackage#getExport_Content()
   * @model containment="true"
   * @generated
   */
  CodeBlock getContent();

  /**
   * Sets the value of the '{@link org.xtext.cocktail.scanner.Export#getContent <em>Content</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Content</em>' containment reference.
   * @see #getContent()
   * @generated
   */
  void setContent(CodeBlock value);

} // Export
