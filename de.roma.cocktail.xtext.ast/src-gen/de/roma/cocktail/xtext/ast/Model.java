/**
 * generated by Xtext 2.9.1
 */
package de.roma.cocktail.xtext.ast;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.roma.cocktail.xtext.ast.Model#getModule <em>Module</em>}</li>
 *   <li>{@link de.roma.cocktail.xtext.ast.Model#getTree <em>Tree</em>}</li>
 *   <li>{@link de.roma.cocktail.xtext.ast.Model#getImp <em>Imp</em>}</li>
 *   <li>{@link de.roma.cocktail.xtext.ast.Model#getExp <em>Exp</em>}</li>
 *   <li>{@link de.roma.cocktail.xtext.ast.Model#getGlo <em>Glo</em>}</li>
 *   <li>{@link de.roma.cocktail.xtext.ast.Model#getLoc <em>Loc</em>}</li>
 *   <li>{@link de.roma.cocktail.xtext.ast.Model#getBeg <em>Beg</em>}</li>
 *   <li>{@link de.roma.cocktail.xtext.ast.Model#getClo <em>Clo</em>}</li>
 *   <li>{@link de.roma.cocktail.xtext.ast.Model#getPro <em>Pro</em>}</li>
 *   <li>{@link de.roma.cocktail.xtext.ast.Model#getRul <em>Rul</em>}</li>
 *   <li>{@link de.roma.cocktail.xtext.ast.Model#getDec <em>Dec</em>}</li>
 * </ul>
 *
 * @see de.roma.cocktail.xtext.ast.AstPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Module</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Module</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Module</em>' containment reference.
   * @see #setModule(Module)
   * @see de.roma.cocktail.xtext.ast.AstPackage#getModel_Module()
   * @model containment="true"
   * @generated
   */
  Module getModule();

  /**
   * Sets the value of the '{@link de.roma.cocktail.xtext.ast.Model#getModule <em>Module</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Module</em>' containment reference.
   * @see #getModule()
   * @generated
   */
  void setModule(Module value);

  /**
   * Returns the value of the '<em><b>Tree</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tree</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tree</em>' containment reference.
   * @see #setTree(Tree)
   * @see de.roma.cocktail.xtext.ast.AstPackage#getModel_Tree()
   * @model containment="true"
   * @generated
   */
  Tree getTree();

  /**
   * Sets the value of the '{@link de.roma.cocktail.xtext.ast.Model#getTree <em>Tree</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tree</em>' containment reference.
   * @see #getTree()
   * @generated
   */
  void setTree(Tree value);

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
   * @see de.roma.cocktail.xtext.ast.AstPackage#getModel_Imp()
   * @model containment="true"
   * @generated
   */
  Import getImp();

  /**
   * Sets the value of the '{@link de.roma.cocktail.xtext.ast.Model#getImp <em>Imp</em>}' containment reference.
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
   * @see de.roma.cocktail.xtext.ast.AstPackage#getModel_Exp()
   * @model containment="true"
   * @generated
   */
  Export getExp();

  /**
   * Sets the value of the '{@link de.roma.cocktail.xtext.ast.Model#getExp <em>Exp</em>}' containment reference.
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
   * @see de.roma.cocktail.xtext.ast.AstPackage#getModel_Glo()
   * @model containment="true"
   * @generated
   */
  Global getGlo();

  /**
   * Sets the value of the '{@link de.roma.cocktail.xtext.ast.Model#getGlo <em>Glo</em>}' containment reference.
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
   * @see de.roma.cocktail.xtext.ast.AstPackage#getModel_Loc()
   * @model containment="true"
   * @generated
   */
  Local getLoc();

  /**
   * Sets the value of the '{@link de.roma.cocktail.xtext.ast.Model#getLoc <em>Loc</em>}' containment reference.
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
   * @see de.roma.cocktail.xtext.ast.AstPackage#getModel_Beg()
   * @model containment="true"
   * @generated
   */
  Begin getBeg();

  /**
   * Sets the value of the '{@link de.roma.cocktail.xtext.ast.Model#getBeg <em>Beg</em>}' containment reference.
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
   * @see de.roma.cocktail.xtext.ast.AstPackage#getModel_Clo()
   * @model containment="true"
   * @generated
   */
  Close getClo();

  /**
   * Sets the value of the '{@link de.roma.cocktail.xtext.ast.Model#getClo <em>Clo</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Clo</em>' containment reference.
   * @see #getClo()
   * @generated
   */
  void setClo(Close value);

  /**
   * Returns the value of the '<em><b>Pro</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pro</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pro</em>' containment reference.
   * @see #setPro(Properties)
   * @see de.roma.cocktail.xtext.ast.AstPackage#getModel_Pro()
   * @model containment="true"
   * @generated
   */
  Properties getPro();

  /**
   * Sets the value of the '{@link de.roma.cocktail.xtext.ast.Model#getPro <em>Pro</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pro</em>' containment reference.
   * @see #getPro()
   * @generated
   */
  void setPro(Properties value);

  /**
   * Returns the value of the '<em><b>Rul</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rul</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rul</em>' containment reference.
   * @see #setRul(Rule)
   * @see de.roma.cocktail.xtext.ast.AstPackage#getModel_Rul()
   * @model containment="true"
   * @generated
   */
  Rule getRul();

  /**
   * Sets the value of the '{@link de.roma.cocktail.xtext.ast.Model#getRul <em>Rul</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rul</em>' containment reference.
   * @see #getRul()
   * @generated
   */
  void setRul(Rule value);

  /**
   * Returns the value of the '<em><b>Dec</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dec</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dec</em>' containment reference.
   * @see #setDec(Declare)
   * @see de.roma.cocktail.xtext.ast.AstPackage#getModel_Dec()
   * @model containment="true"
   * @generated
   */
  Declare getDec();

  /**
   * Sets the value of the '{@link de.roma.cocktail.xtext.ast.Model#getDec <em>Dec</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dec</em>' containment reference.
   * @see #getDec()
   * @generated
   */
  void setDec(Declare value);

} // Model