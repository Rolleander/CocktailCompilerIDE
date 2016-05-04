/**
 * generated by Xtext 2.9.1
 */
package de.roma.cocktail.xtext.ast;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.roma.cocktail.xtext.ast.Model#getSepcification <em>Sepcification</em>}</li>
 *   <li>{@link de.roma.cocktail.xtext.ast.Model#getModules <em>Modules</em>}</li>
 * </ul>
 *
 * @see de.roma.cocktail.xtext.ast.AstPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Sepcification</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sepcification</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sepcification</em>' containment reference.
   * @see #setSepcification(Specification)
   * @see de.roma.cocktail.xtext.ast.AstPackage#getModel_Sepcification()
   * @model containment="true"
   * @generated
   */
  Specification getSepcification();

  /**
   * Sets the value of the '{@link de.roma.cocktail.xtext.ast.Model#getSepcification <em>Sepcification</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sepcification</em>' containment reference.
   * @see #getSepcification()
   * @generated
   */
  void setSepcification(Specification value);

  /**
   * Returns the value of the '<em><b>Modules</b></em>' containment reference list.
   * The list contents are of type {@link de.roma.cocktail.xtext.ast.Modules}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Modules</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Modules</em>' containment reference list.
   * @see de.roma.cocktail.xtext.ast.AstPackage#getModel_Modules()
   * @model containment="true"
   * @generated
   */
  EList<Modules> getModules();

} // Model
