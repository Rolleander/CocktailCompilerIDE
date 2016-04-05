/**
 * generated by Xtext 2.9.1
 */
package de.roma.cocktail.xtext.parser;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule Content</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.roma.cocktail.xtext.parser.RuleContent#getRegex <em>Regex</em>}</li>
 *   <li>{@link de.roma.cocktail.xtext.parser.RuleContent#getRef <em>Ref</em>}</li>
 * </ul>
 *
 * @see de.roma.cocktail.xtext.parser.ParserPackage#getRuleContent()
 * @model
 * @generated
 */
public interface RuleContent extends EObject
{
  /**
   * Returns the value of the '<em><b>Regex</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Regex</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Regex</em>' attribute.
   * @see #setRegex(String)
   * @see de.roma.cocktail.xtext.parser.ParserPackage#getRuleContent_Regex()
   * @model
   * @generated
   */
  String getRegex();

  /**
   * Sets the value of the '{@link de.roma.cocktail.xtext.parser.RuleContent#getRegex <em>Regex</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Regex</em>' attribute.
   * @see #getRegex()
   * @generated
   */
  void setRegex(String value);

  /**
   * Returns the value of the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ref</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref</em>' reference.
   * @see #setRef(GrammerReference)
   * @see de.roma.cocktail.xtext.parser.ParserPackage#getRuleContent_Ref()
   * @model
   * @generated
   */
  GrammerReference getRef();

  /**
   * Sets the value of the '{@link de.roma.cocktail.xtext.parser.RuleContent#getRef <em>Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref</em>' reference.
   * @see #getRef()
   * @generated
   */
  void setRef(GrammerReference value);

} // RuleContent
