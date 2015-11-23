/**
 */
package org.xtext.cocktail.scanner.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.xtext.cocktail.scanner.ActionStatement;
import org.xtext.cocktail.scanner.Scanner;
import org.xtext.cocktail.scanner.ScannerPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.cocktail.scanner.impl.ActionStatementImpl#getSt <em>St</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActionStatementImpl extends MinimalEObjectImpl.Container implements ActionStatement
{
  /**
   * The cached value of the '{@link #getSt() <em>St</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSt()
   * @generated
   * @ordered
   */
  protected EList<Scanner> st;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ActionStatementImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return ScannerPackage.Literals.ACTION_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Scanner> getSt()
  {
    if (st == null)
    {
      st = new EObjectResolvingEList<Scanner>(Scanner.class, this, ScannerPackage.ACTION_STATEMENT__ST);
    }
    return st;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case ScannerPackage.ACTION_STATEMENT__ST:
        return getSt();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ScannerPackage.ACTION_STATEMENT__ST:
        getSt().clear();
        getSt().addAll((Collection<? extends Scanner>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case ScannerPackage.ACTION_STATEMENT__ST:
        getSt().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case ScannerPackage.ACTION_STATEMENT__ST:
        return st != null && !st.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ActionStatementImpl
