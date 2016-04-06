/**
 * generated by Xtext 2.9.1
 */
package de.roma.cocktail.xtext.parser;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Grammar Rules</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.roma.cocktail.xtext.parser.GrammarRules#getRules <em>Rules</em>}</li>
 * </ul>
 *
 * @see de.roma.cocktail.xtext.parser.ParserPackage#getGrammarRules()
 * @model
 * @generated
 */
public interface GrammarRules extends EObject
{
  /**
   * Returns the value of the '<em><b>Rules</b></em>' containment reference list.
   * The list contents are of type {@link de.roma.cocktail.xtext.parser.GrammarRule}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rules</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rules</em>' containment reference list.
   * @see de.roma.cocktail.xtext.parser.ParserPackage#getGrammarRules_Rules()
   * @model containment="true"
   * @generated
   */
  EList<GrammarRule> getRules();

} // GrammarRules
