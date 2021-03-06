/**
 * generated by Xtext 2.9.1
 */
package org.xtext.cocktail.scanner;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule Start</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.cocktail.scanner.RuleStart#getRulePrec <em>Rule Prec</em>}</li>
 *   <li>{@link org.xtext.cocktail.scanner.RuleStart#getRuleStates <em>Rule States</em>}</li>
 *   <li>{@link org.xtext.cocktail.scanner.RuleStart#getRuleDefault <em>Rule Default</em>}</li>
 * </ul>
 *
 * @see org.xtext.cocktail.scanner.ScannerPackage#getRuleStart()
 * @model
 * @generated
 */
public interface RuleStart extends EObject
{
  /**
   * Returns the value of the '<em><b>Rule Prec</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rule Prec</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rule Prec</em>' attribute.
   * @see #setRulePrec(String)
   * @see org.xtext.cocktail.scanner.ScannerPackage#getRuleStart_RulePrec()
   * @model
   * @generated
   */
  String getRulePrec();

  /**
   * Sets the value of the '{@link org.xtext.cocktail.scanner.RuleStart#getRulePrec <em>Rule Prec</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rule Prec</em>' attribute.
   * @see #getRulePrec()
   * @generated
   */
  void setRulePrec(String value);

  /**
   * Returns the value of the '<em><b>Rule States</b></em>' reference list.
   * The list contents are of type {@link org.xtext.cocktail.scanner.StartState}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rule States</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rule States</em>' reference list.
   * @see org.xtext.cocktail.scanner.ScannerPackage#getRuleStart_RuleStates()
   * @model
   * @generated
   */
  EList<StartState> getRuleStates();

  /**
   * Returns the value of the '<em><b>Rule Default</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rule Default</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rule Default</em>' attribute.
   * @see #setRuleDefault(String)
   * @see org.xtext.cocktail.scanner.ScannerPackage#getRuleStart_RuleDefault()
   * @model
   * @generated
   */
  String getRuleDefault();

  /**
   * Sets the value of the '{@link org.xtext.cocktail.scanner.RuleStart#getRuleDefault <em>Rule Default</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rule Default</em>' attribute.
   * @see #getRuleDefault()
   * @generated
   */
  void setRuleDefault(String value);

} // RuleStart
