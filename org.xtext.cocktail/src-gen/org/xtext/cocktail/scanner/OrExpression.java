/**
 */
package org.xtext.cocktail.scanner;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Or Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.cocktail.scanner.OrExpression#getLeft <em>Left</em>}</li>
 *   <li>{@link org.xtext.cocktail.scanner.OrExpression#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.cocktail.scanner.ScannerPackage#getOrExpression()
 * @model
 * @generated
 */
public interface OrExpression extends RegularExpression
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(OrExpression)
   * @see org.xtext.cocktail.scanner.ScannerPackage#getOrExpression_Left()
   * @model containment="true"
   * @generated
   */
  OrExpression getLeft();

  /**
   * Sets the value of the '{@link org.xtext.cocktail.scanner.OrExpression#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(OrExpression value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(SequenceExpression)
   * @see org.xtext.cocktail.scanner.ScannerPackage#getOrExpression_Right()
   * @model containment="true"
   * @generated
   */
  SequenceExpression getRight();

  /**
   * Sets the value of the '{@link org.xtext.cocktail.scanner.OrExpression#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(SequenceExpression value);

} // OrExpression
