/**
 * generated by Xtext 2.9.2
 */
package de.roma.cocktail.xtext.lpp;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node Part</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.roma.cocktail.xtext.lpp.NodePart#getChild <em>Child</em>}</li>
 *   <li>{@link de.roma.cocktail.xtext.lpp.NodePart#getAttribute <em>Attribute</em>}</li>
 * </ul>
 *
 * @see de.roma.cocktail.xtext.lpp.LppPackage#getNodePart()
 * @model
 * @generated
 */
public interface NodePart extends EObject
{
  /**
   * Returns the value of the '<em><b>Child</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Child</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Child</em>' containment reference.
   * @see #setChild(Node)
   * @see de.roma.cocktail.xtext.lpp.LppPackage#getNodePart_Child()
   * @model containment="true"
   * @generated
   */
  Node getChild();

  /**
   * Sets the value of the '{@link de.roma.cocktail.xtext.lpp.NodePart#getChild <em>Child</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Child</em>' containment reference.
   * @see #getChild()
   * @generated
   */
  void setChild(Node value);

  /**
   * Returns the value of the '<em><b>Attribute</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attribute</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attribute</em>' containment reference.
   * @see #setAttribute(NodeAttribute)
   * @see de.roma.cocktail.xtext.lpp.LppPackage#getNodePart_Attribute()
   * @model containment="true"
   * @generated
   */
  NodeAttribute getAttribute();

  /**
   * Sets the value of the '{@link de.roma.cocktail.xtext.lpp.NodePart#getAttribute <em>Attribute</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attribute</em>' containment reference.
   * @see #getAttribute()
   * @generated
   */
  void setAttribute(NodeAttribute value);

} // NodePart
