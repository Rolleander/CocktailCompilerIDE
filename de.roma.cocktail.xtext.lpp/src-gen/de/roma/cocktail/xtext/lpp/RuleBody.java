/**
 * generated by Xtext 2.9.1
 */
package de.roma.cocktail.xtext.lpp;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule Body</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.roma.cocktail.xtext.lpp.RuleBody#getPart <em>Part</em>}</li>
 *   <li>{@link de.roma.cocktail.xtext.lpp.RuleBody#getCode <em>Code</em>}</li>
 * </ul>
 *
 * @see de.roma.cocktail.xtext.lpp.LppPackage#getRuleBody()
 * @model
 * @generated
 */
public interface RuleBody extends EObject
{
  /**
   * Returns the value of the '<em><b>Part</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Part</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Part</em>' containment reference.
   * @see #setPart(RulePart)
   * @see de.roma.cocktail.xtext.lpp.LppPackage#getRuleBody_Part()
   * @model containment="true"
   * @generated
   */
  RulePart getPart();

  /**
   * Sets the value of the '{@link de.roma.cocktail.xtext.lpp.RuleBody#getPart <em>Part</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Part</em>' containment reference.
   * @see #getPart()
   * @generated
   */
  void setPart(RulePart value);

  /**
   * Returns the value of the '<em><b>Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Code</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Code</em>' attribute.
   * @see #setCode(String)
   * @see de.roma.cocktail.xtext.lpp.LppPackage#getRuleBody_Code()
   * @model
   * @generated
   */
  String getCode();

  /**
   * Sets the value of the '{@link de.roma.cocktail.xtext.lpp.RuleBody#getCode <em>Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Code</em>' attribute.
   * @see #getCode()
   * @generated
   */
  void setCode(String value);

} // RuleBody
