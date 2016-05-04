/**
 * generated by Xtext 2.9.1
 */
package de.roma.cocktail.xtext.ast;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Codes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.roma.cocktail.xtext.ast.Codes#getImp <em>Imp</em>}</li>
 *   <li>{@link de.roma.cocktail.xtext.ast.Codes#getExp <em>Exp</em>}</li>
 *   <li>{@link de.roma.cocktail.xtext.ast.Codes#getGlo <em>Glo</em>}</li>
 *   <li>{@link de.roma.cocktail.xtext.ast.Codes#getLoc <em>Loc</em>}</li>
 *   <li>{@link de.roma.cocktail.xtext.ast.Codes#getBeg <em>Beg</em>}</li>
 *   <li>{@link de.roma.cocktail.xtext.ast.Codes#getClo <em>Clo</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.roma.cocktail.xtext.ast.AstPackage#getCodes()
 * @model
 * @generated
 */
public interface Codes extends EObject
{
  /**
   * Returns the value of the '<em><b>Imp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imp</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imp</em>' containment reference.
   * @see #setImp(Import)
   * @see de.roma.cocktail.xtext.ast.AstPackage#getCodes_Imp()
   * @model containment="true"
   * @generated
   */
  Import getImp();

  /**
   * Sets the value of the '{@link de.roma.cocktail.xtext.ast.Codes#getImp <em>Imp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Imp</em>' containment reference.
   * @see #getImp()
   * @generated
   */
  void setImp(Import value);

  /**
   * Returns the value of the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exp</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exp</em>' containment reference.
   * @see #setExp(Export)
   * @see de.roma.cocktail.xtext.ast.AstPackage#getCodes_Exp()
   * @model containment="true"
   * @generated
   */
  Export getExp();

  /**
   * Sets the value of the '{@link de.roma.cocktail.xtext.ast.Codes#getExp <em>Exp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exp</em>' containment reference.
   * @see #getExp()
   * @generated
   */
  void setExp(Export value);

  /**
   * Returns the value of the '<em><b>Glo</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Glo</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Glo</em>' containment reference.
   * @see #setGlo(Global)
   * @see de.roma.cocktail.xtext.ast.AstPackage#getCodes_Glo()
   * @model containment="true"
   * @generated
   */
  Global getGlo();

  /**
   * Sets the value of the '{@link de.roma.cocktail.xtext.ast.Codes#getGlo <em>Glo</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Glo</em>' containment reference.
   * @see #getGlo()
   * @generated
   */
  void setGlo(Global value);

  /**
   * Returns the value of the '<em><b>Loc</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Loc</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Loc</em>' containment reference.
   * @see #setLoc(Local)
   * @see de.roma.cocktail.xtext.ast.AstPackage#getCodes_Loc()
   * @model containment="true"
   * @generated
   */
  Local getLoc();

  /**
   * Sets the value of the '{@link de.roma.cocktail.xtext.ast.Codes#getLoc <em>Loc</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Loc</em>' containment reference.
   * @see #getLoc()
   * @generated
   */
  void setLoc(Local value);

  /**
   * Returns the value of the '<em><b>Beg</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Beg</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Beg</em>' containment reference.
   * @see #setBeg(Begin)
   * @see de.roma.cocktail.xtext.ast.AstPackage#getCodes_Beg()
   * @model containment="true"
   * @generated
   */
  Begin getBeg();

  /**
   * Sets the value of the '{@link de.roma.cocktail.xtext.ast.Codes#getBeg <em>Beg</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Beg</em>' containment reference.
   * @see #getBeg()
   * @generated
   */
  void setBeg(Begin value);

  /**
   * Returns the value of the '<em><b>Clo</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Clo</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Clo</em>' containment reference.
   * @see #setClo(Close)
   * @see de.roma.cocktail.xtext.ast.AstPackage#getCodes_Clo()
   * @model containment="true"
   * @generated
   */
  Close getClo();

  /**
   * Sets the value of the '{@link de.roma.cocktail.xtext.ast.Codes#getClo <em>Clo</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Clo</em>' containment reference.
   * @see #getClo()
   * @generated
   */
  void setClo(Close value);

} // Codes