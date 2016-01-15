/**
 */
package org.xtext.cocktail.scanner;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Define</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.cocktail.scanner.Define#getDefines <em>Defines</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.cocktail.scanner.ScannerPackage#getDefine()
 * @model
 * @generated
 */
public interface Define extends EObject
{
  /**
   * Returns the value of the '<em><b>Defines</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.cocktail.scanner.DefineRule}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Defines</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Defines</em>' containment reference list.
   * @see org.xtext.cocktail.scanner.ScannerPackage#getDefine_Defines()
   * @model containment="true"
   * @generated
   */
  EList<DefineRule> getDefines();

} // Define
