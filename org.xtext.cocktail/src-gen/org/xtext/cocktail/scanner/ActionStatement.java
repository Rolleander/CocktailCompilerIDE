/**
 */
package org.xtext.cocktail.scanner;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.cocktail.scanner.ActionStatement#getSt <em>St</em>}</li>
 * </ul>
 *
 * @see org.xtext.cocktail.scanner.ScannerPackage#getActionStatement()
 * @model
 * @generated
 */
public interface ActionStatement extends EObject
{
  /**
   * Returns the value of the '<em><b>St</b></em>' reference list.
   * The list contents are of type {@link org.xtext.cocktail.scanner.Scanner}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>St</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>St</em>' reference list.
   * @see org.xtext.cocktail.scanner.ScannerPackage#getActionStatement_St()
   * @model
   * @generated
   */
  EList<Scanner> getSt();

} // ActionStatement
