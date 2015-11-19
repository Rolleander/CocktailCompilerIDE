/**
 */
package org.xtext.cocktail.scanner;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Braced Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.cocktail.scanner.BracedExpression#getInnerExpression <em>Inner Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.cocktail.scanner.ScannerPackage#getBracedExpression()
 * @model
 * @generated
 */
public interface BracedExpression extends AtomicExpression
{
  /**
   * Returns the value of the '<em><b>Inner Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Inner Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Inner Expression</em>' containment reference.
   * @see #setInnerExpression(RegularExpression)
   * @see org.xtext.cocktail.scanner.ScannerPackage#getBracedExpression_InnerExpression()
   * @model containment="true"
   * @generated
   */
  RegularExpression getInnerExpression();

  /**
   * Sets the value of the '{@link org.xtext.cocktail.scanner.BracedExpression#getInnerExpression <em>Inner Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Inner Expression</em>' containment reference.
   * @see #getInnerExpression()
   * @generated
   */
  void setInnerExpression(RegularExpression value);

} // BracedExpression
