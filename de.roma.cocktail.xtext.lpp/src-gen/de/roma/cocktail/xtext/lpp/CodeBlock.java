/**
 * generated by Xtext 2.9.1
 */
package de.roma.cocktail.xtext.lpp;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Code Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.roma.cocktail.xtext.lpp.CodeBlock#getWall <em>Wall</em>}</li>
 *   <li>{@link de.roma.cocktail.xtext.lpp.CodeBlock#getBlock <em>Block</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.roma.cocktail.xtext.lpp.LppPackage#getCodeBlock()
 * @model
 * @generated
 */
public interface CodeBlock extends EObject
{
  /**
   * Returns the value of the '<em><b>Wall</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Wall</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Wall</em>' attribute.
   * @see #setWall(String)
   * @see de.roma.cocktail.xtext.lpp.LppPackage#getCodeBlock_Wall()
   * @model
   * @generated
   */
  String getWall();

  /**
   * Sets the value of the '{@link de.roma.cocktail.xtext.lpp.CodeBlock#getWall <em>Wall</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Wall</em>' attribute.
   * @see #getWall()
   * @generated
   */
  void setWall(String value);

  /**
   * Returns the value of the '<em><b>Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Block</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Block</em>' containment reference.
   * @see #setBlock(CodeBlock)
   * @see de.roma.cocktail.xtext.lpp.LppPackage#getCodeBlock_Block()
   * @model containment="true"
   * @generated
   */
  CodeBlock getBlock();

  /**
   * Sets the value of the '{@link de.roma.cocktail.xtext.lpp.CodeBlock#getBlock <em>Block</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Block</em>' containment reference.
   * @see #getBlock()
   * @generated
   */
  void setBlock(CodeBlock value);

} // CodeBlock
