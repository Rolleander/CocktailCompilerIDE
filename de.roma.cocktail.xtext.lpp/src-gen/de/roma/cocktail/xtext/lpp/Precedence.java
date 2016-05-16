/**
 * generated by Xtext 2.9.1
 */
package de.roma.cocktail.xtext.lpp;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Precedence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.roma.cocktail.xtext.lpp.Precedence#getRows <em>Rows</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.roma.cocktail.xtext.lpp.LppPackage#getPrecedence()
 * @model
 * @generated
 */
public interface Precedence extends EObject
{
  /**
   * Returns the value of the '<em><b>Rows</b></em>' containment reference list.
   * The list contents are of type {@link de.roma.cocktail.xtext.lpp.PrecedenceRow}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rows</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rows</em>' containment reference list.
   * @see de.roma.cocktail.xtext.lpp.LppPackage#getPrecedence_Rows()
   * @model containment="true"
   * @generated
   */
  EList<PrecedenceRow> getRows();

} // Precedence
