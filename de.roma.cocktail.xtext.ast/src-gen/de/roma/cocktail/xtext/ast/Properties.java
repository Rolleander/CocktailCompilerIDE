/**
 * generated by Xtext 2.9.1
 */
package de.roma.cocktail.xtext.ast;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.roma.cocktail.xtext.ast.Properties#getProperty <em>Property</em>}</li>
 * </ul>
 *
 * @see de.roma.cocktail.xtext.ast.AstPackage#getProperties()
 * @model
 * @generated
 */
public interface Properties extends EObject
{
  /**
   * Returns the value of the '<em><b>Property</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Property</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Property</em>' containment reference.
   * @see #setProperty(PropertyList)
   * @see de.roma.cocktail.xtext.ast.AstPackage#getProperties_Property()
   * @model containment="true"
   * @generated
   */
  PropertyList getProperty();

  /**
   * Sets the value of the '{@link de.roma.cocktail.xtext.ast.Properties#getProperty <em>Property</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Property</em>' containment reference.
   * @see #getProperty()
   * @generated
   */
  void setProperty(PropertyList value);

} // Properties
