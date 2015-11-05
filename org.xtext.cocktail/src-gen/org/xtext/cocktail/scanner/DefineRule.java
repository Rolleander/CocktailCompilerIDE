/**
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
 * <ul>
 *   <li>{@link org.xtext.cocktail.scanner.DefineRule#getDefineName <em>Define Name</em>}</li>
 *   <li>{@link org.xtext.cocktail.scanner.DefineRule#getDefineRule <em>Define Rule</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.cocktail.scanner.ScannerPackage#getDefineRule()
 * @model
 * @generated
 */
public interface DefineRule extends EObject
{
  /**
   * Returns the value of the '<em><b>Define Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Define Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Define Name</em>' attribute.
   * @see #setDefineName(String)
   * @see org.xtext.cocktail.scanner.ScannerPackage#getDefineRule_DefineName()
   * @model
   * @generated
   */
  String getDefineName();

  /**
   * Sets the value of the '{@link org.xtext.cocktail.scanner.DefineRule#getDefineName <em>Define Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Define Name</em>' attribute.
   * @see #getDefineName()
   * @generated
   */
  void setDefineName(String value);

  /**
   * Returns the value of the '<em><b>Define Rule</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Define Rule</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Define Rule</em>' attribute.
   * @see #setDefineRule(String)
   * @see org.xtext.cocktail.scanner.ScannerPackage#getDefineRule_DefineRule()
   * @model
   * @generated
   */
  String getDefineRule();

  /**
   * Sets the value of the '{@link org.xtext.cocktail.scanner.DefineRule#getDefineRule <em>Define Rule</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Define Rule</em>' attribute.
   * @see #getDefineRule()
   * @generated
   */
  void setDefineRule(String value);

} // DefineRule
