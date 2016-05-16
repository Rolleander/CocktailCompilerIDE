/**
 * generated by Xtext 2.9.1
 */
package de.roma.cocktail.xtext.lpp;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Grammar Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.roma.cocktail.xtext.lpp.GrammarRule#getName <em>Name</em>}</li>
 *   <li>{@link de.roma.cocktail.xtext.lpp.GrammarRule#getBody <em>Body</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.roma.cocktail.xtext.lpp.LppPackage#getGrammarRule()
 * @model
 * @generated
 */
public interface GrammarRule extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' containment reference.
   * @see #setName(RuleName)
   * @see de.roma.cocktail.xtext.lpp.LppPackage#getGrammarRule_Name()
   * @model containment="true"
   * @generated
   */
  RuleName getName();

  /**
   * Sets the value of the '{@link de.roma.cocktail.xtext.lpp.GrammarRule#getName <em>Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' containment reference.
   * @see #getName()
   * @generated
   */
  void setName(RuleName value);

  /**
   * Returns the value of the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Body</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Body</em>' containment reference.
   * @see #setBody(RuleBody)
   * @see de.roma.cocktail.xtext.lpp.LppPackage#getGrammarRule_Body()
   * @model containment="true"
   * @generated
   */
  RuleBody getBody();

  /**
   * Sets the value of the '{@link de.roma.cocktail.xtext.lpp.GrammarRule#getBody <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Body</em>' containment reference.
   * @see #getBody()
   * @generated
   */
  void setBody(RuleBody value);

} // GrammarRule
