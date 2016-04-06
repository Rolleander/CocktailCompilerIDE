/**
 * generated by Xtext 2.9.1
 */
package de.roma.cocktail.xtext.lpp;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tokens</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.roma.cocktail.xtext.lpp.Tokens#getTokens <em>Tokens</em>}</li>
 * </ul>
 *
 * @see de.roma.cocktail.xtext.lpp.LppPackage#getTokens()
 * @model
 * @generated
 */
public interface Tokens extends EObject
{
  /**
   * Returns the value of the '<em><b>Tokens</b></em>' containment reference list.
   * The list contents are of type {@link de.roma.cocktail.xtext.lpp.DefinedToken}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tokens</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tokens</em>' containment reference list.
   * @see de.roma.cocktail.xtext.lpp.LppPackage#getTokens_Tokens()
   * @model containment="true"
   * @generated
   */
  EList<DefinedToken> getTokens();

} // Tokens
