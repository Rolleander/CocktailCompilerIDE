/**
 * generated by Xtext 2.9.1
 */
package de.roma.cocktail.xtext.ast;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extensions</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.roma.cocktail.xtext.ast.Extensions#getNodes <em>Nodes</em>}</li>
 * </ul>
 *
 * @see de.roma.cocktail.xtext.ast.AstPackage#getExtensions()
 * @model
 * @generated
 */
public interface Extensions extends EObject
{
  /**
   * Returns the value of the '<em><b>Nodes</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nodes</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nodes</em>' containment reference.
   * @see #setNodes(RootNode)
   * @see de.roma.cocktail.xtext.ast.AstPackage#getExtensions_Nodes()
   * @model containment="true"
   * @generated
   */
  RootNode getNodes();

  /**
   * Sets the value of the '{@link de.roma.cocktail.xtext.ast.Extensions#getNodes <em>Nodes</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nodes</em>' containment reference.
   * @see #getNodes()
   * @generated
   */
  void setNodes(RootNode value);

} // Extensions
