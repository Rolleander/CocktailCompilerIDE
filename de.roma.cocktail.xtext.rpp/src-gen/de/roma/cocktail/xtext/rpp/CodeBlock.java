/**
 * generated by Xtext 2.9.2
 */
package de.roma.cocktail.xtext.rpp;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Code Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.roma.cocktail.xtext.rpp.CodeBlock#getWall <em>Wall</em>}</li>
 *   <li>{@link de.roma.cocktail.xtext.rpp.CodeBlock#getBlock <em>Block</em>}</li>
 * </ul>
 *
 * @see de.roma.cocktail.xtext.rpp.RppPackage#getCodeBlock()
 * @model
 * @generated
 */
public interface CodeBlock extends EObject
{
  /**
   * Returns the value of the '<em><b>Wall</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Wall</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Wall</em>' attribute list.
   * @see de.roma.cocktail.xtext.rpp.RppPackage#getCodeBlock_Wall()
   * @model unique="false"
   * @generated
   */
  EList<String> getWall();

  /**
   * Returns the value of the '<em><b>Block</b></em>' containment reference list.
   * The list contents are of type {@link de.roma.cocktail.xtext.rpp.CodeBlock}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Block</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Block</em>' containment reference list.
   * @see de.roma.cocktail.xtext.rpp.RppPackage#getCodeBlock_Block()
   * @model containment="true"
   * @generated
   */
  EList<CodeBlock> getBlock();

} // CodeBlock
