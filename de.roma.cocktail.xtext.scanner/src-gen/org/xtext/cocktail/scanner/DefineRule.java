/**
 * generated by Xtext 2.9.1
 */
package org.xtext.cocktail.scanner;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Define Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.cocktail.scanner.DefineRule#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.cocktail.scanner.DefineRule#getRule <em>Rule</em>}</li>
 * </ul>
 *
 * @see org.xtext.cocktail.scanner.ScannerPackage#getDefineRule()
 * @model
 * @generated
 */
public interface DefineRule extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.cocktail.scanner.ScannerPackage#getDefineRule_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.cocktail.scanner.DefineRule#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Rule</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rule</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rule</em>' attribute.
   * @see #setRule(String)
   * @see org.xtext.cocktail.scanner.ScannerPackage#getDefineRule_Rule()
   * @model
   * @generated
   */
  String getRule();

  /**
   * Sets the value of the '{@link org.xtext.cocktail.scanner.DefineRule#getRule <em>Rule</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rule</em>' attribute.
   * @see #getRule()
   * @generated
   */
  void setRule(String value);

} // DefineRule
