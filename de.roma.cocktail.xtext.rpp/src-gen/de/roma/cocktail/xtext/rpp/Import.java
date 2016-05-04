/**
 * generated by Xtext 2.9.2
 */
package de.roma.cocktail.xtext.rpp;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Import</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.roma.cocktail.xtext.rpp.Import#getContent <em>Content</em>}</li>
 * </ul>
 *
 * @see de.roma.cocktail.xtext.rpp.RppPackage#getImport()
 * @model
 * @generated
 */
public interface Import extends EObject
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
   * @see de.roma.cocktail.xtext.rpp.RppPackage#getImport_Content()
   * @model containment="true"
   * @generated
   */
  CodeBlock getContent();

  /**
   * Sets the value of the '{@link de.roma.cocktail.xtext.rpp.Import#getContent <em>Content</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Content</em>' containment reference.
   * @see #getContent()
   * @generated
   */
  void setContent(CodeBlock value);

} // Import
