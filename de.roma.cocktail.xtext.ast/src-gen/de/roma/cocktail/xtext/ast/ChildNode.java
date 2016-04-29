/**
 * generated by Xtext 2.9.1
 */
package de.roma.cocktail.xtext.ast;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Child Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.roma.cocktail.xtext.ast.ChildNode#getSelector <em>Selector</em>}</li>
 *   <li>{@link de.roma.cocktail.xtext.ast.ChildNode#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see de.roma.cocktail.xtext.ast.AstPackage#getChildNode()
 * @model
 * @generated
 */
public interface ChildNode extends EObject
{
  /**
   * Returns the value of the '<em><b>Selector</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Selector</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Selector</em>' attribute.
   * @see #setSelector(String)
   * @see de.roma.cocktail.xtext.ast.AstPackage#getChildNode_Selector()
   * @model
   * @generated
   */
  String getSelector();

  /**
   * Sets the value of the '{@link de.roma.cocktail.xtext.ast.ChildNode#getSelector <em>Selector</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Selector</em>' attribute.
   * @see #getSelector()
   * @generated
   */
  void setSelector(String value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see #setType(String)
   * @see de.roma.cocktail.xtext.ast.AstPackage#getChildNode_Type()
   * @model
   * @generated
   */
  String getType();

  /**
   * Sets the value of the '{@link de.roma.cocktail.xtext.ast.ChildNode#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see #getType()
   * @generated
   */
  void setType(String value);

} // ChildNode