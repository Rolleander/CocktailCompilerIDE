/**
 * generated by Xtext 2.9.1
 */
package de.roma.cocktail.xtext.lpp;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Token Extra</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.roma.cocktail.xtext.lpp.TokenExtra#getCost <em>Cost</em>}</li>
 *   <li>{@link de.roma.cocktail.xtext.lpp.TokenExtra#getPresentation <em>Presentation</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.roma.cocktail.xtext.lpp.LppPackage#getTokenExtra()
 * @model
 * @generated
 */
public interface TokenExtra extends EObject
{
  /**
   * Returns the value of the '<em><b>Cost</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cost</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cost</em>' attribute.
   * @see #setCost(int)
   * @see de.roma.cocktail.xtext.lpp.LppPackage#getTokenExtra_Cost()
   * @model
   * @generated
   */
  int getCost();

  /**
   * Sets the value of the '{@link de.roma.cocktail.xtext.lpp.TokenExtra#getCost <em>Cost</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cost</em>' attribute.
   * @see #getCost()
   * @generated
   */
  void setCost(int value);

  /**
   * Returns the value of the '<em><b>Presentation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Presentation</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Presentation</em>' attribute.
   * @see #setPresentation(String)
   * @see de.roma.cocktail.xtext.lpp.LppPackage#getTokenExtra_Presentation()
   * @model
   * @generated
   */
  String getPresentation();

  /**
   * Sets the value of the '{@link de.roma.cocktail.xtext.lpp.TokenExtra#getPresentation <em>Presentation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Presentation</em>' attribute.
   * @see #getPresentation()
   * @generated
   */
  void setPresentation(String value);

} // TokenExtra
