/**
 * generated by Xtext 2.9.1
 */
package de.roma.cocktail.xtext.ast;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.roma.cocktail.xtext.ast.Specification#getTree <em>Tree</em>}</li>
 *   <li>{@link de.roma.cocktail.xtext.ast.Specification#getCode <em>Code</em>}</li>
 *   <li>{@link de.roma.cocktail.xtext.ast.Specification#getProperties <em>Properties</em>}</li>
 *   <li>{@link de.roma.cocktail.xtext.ast.Specification#getDeclare <em>Declare</em>}</li>
 *   <li>{@link de.roma.cocktail.xtext.ast.Specification#getRules <em>Rules</em>}</li>
 * </ul>
 *
 * @see de.roma.cocktail.xtext.ast.AstPackage#getSpecification()
 * @model
 * @generated
 */
public interface Specification extends EObject
{
  /**
   * Returns the value of the '<em><b>Tree</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tree</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tree</em>' containment reference.
   * @see #setTree(Tree)
   * @see de.roma.cocktail.xtext.ast.AstPackage#getSpecification_Tree()
   * @model containment="true"
   * @generated
   */
  Tree getTree();

  /**
   * Sets the value of the '{@link de.roma.cocktail.xtext.ast.Specification#getTree <em>Tree</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tree</em>' containment reference.
   * @see #getTree()
   * @generated
   */
  void setTree(Tree value);

  /**
   * Returns the value of the '<em><b>Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Code</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Code</em>' containment reference.
   * @see #setCode(Codes)
   * @see de.roma.cocktail.xtext.ast.AstPackage#getSpecification_Code()
   * @model containment="true"
   * @generated
   */
  Codes getCode();

  /**
   * Sets the value of the '{@link de.roma.cocktail.xtext.ast.Specification#getCode <em>Code</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Code</em>' containment reference.
   * @see #getCode()
   * @generated
   */
  void setCode(Codes value);

  /**
   * Returns the value of the '<em><b>Properties</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Properties</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Properties</em>' containment reference.
   * @see #setProperties(Properties)
   * @see de.roma.cocktail.xtext.ast.AstPackage#getSpecification_Properties()
   * @model containment="true"
   * @generated
   */
  Properties getProperties();

  /**
   * Sets the value of the '{@link de.roma.cocktail.xtext.ast.Specification#getProperties <em>Properties</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Properties</em>' containment reference.
   * @see #getProperties()
   * @generated
   */
  void setProperties(Properties value);

  /**
   * Returns the value of the '<em><b>Declare</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Declare</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Declare</em>' containment reference.
   * @see #setDeclare(Declare)
   * @see de.roma.cocktail.xtext.ast.AstPackage#getSpecification_Declare()
   * @model containment="true"
   * @generated
   */
  Declare getDeclare();

  /**
   * Sets the value of the '{@link de.roma.cocktail.xtext.ast.Specification#getDeclare <em>Declare</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Declare</em>' containment reference.
   * @see #getDeclare()
   * @generated
   */
  void setDeclare(Declare value);

  /**
   * Returns the value of the '<em><b>Rules</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rules</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rules</em>' containment reference.
   * @see #setRules(Rule)
   * @see de.roma.cocktail.xtext.ast.AstPackage#getSpecification_Rules()
   * @model containment="true"
   * @generated
   */
  Rule getRules();

  /**
   * Sets the value of the '{@link de.roma.cocktail.xtext.ast.Specification#getRules <em>Rules</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rules</em>' containment reference.
   * @see #getRules()
   * @generated
   */
  void setRules(Rule value);

} // Specification
