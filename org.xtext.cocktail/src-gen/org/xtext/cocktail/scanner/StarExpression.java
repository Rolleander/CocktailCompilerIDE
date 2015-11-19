/**
 */
package org.xtext.cocktail.scanner;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Star Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.cocktail.scanner.StarExpression#getInnerExpression <em>Inner Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.cocktail.scanner.ScannerPackage#getStarExpression()
 * @model
 * @generated
 */
public interface StarExpression extends HighBindExpression
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
   * @see #setInnerExpression(AtomicExpression)
   * @see org.xtext.cocktail.scanner.ScannerPackage#getStarExpression_InnerExpression()
   * @model containment="true"
   * @generated
   */
  AtomicExpression getInnerExpression();

  /**
   * Sets the value of the '{@link org.xtext.cocktail.scanner.StarExpression#getInnerExpression <em>Inner Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Inner Expression</em>' containment reference.
   * @see #getInnerExpression()
   * @generated
   */
  void setInnerExpression(AtomicExpression value);

} // StarExpression
