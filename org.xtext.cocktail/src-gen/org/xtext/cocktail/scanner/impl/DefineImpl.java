/**
 */
package org.xtext.cocktail.scanner.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.cocktail.scanner.Define;
import org.xtext.cocktail.scanner.DefineRule;
import org.xtext.cocktail.scanner.ScannerPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Define</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.cocktail.scanner.impl.DefineImpl#getDefines <em>Defines</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DefineImpl extends MinimalEObjectImpl.Container implements Define
{
  /**
   * The cached value of the '{@link #getDefines() <em>Defines</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefines()
   * @generated
   * @ordered
   */
  protected EList<DefineRule> defines;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DefineImpl()
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
    return ScannerPackage.Literals.DEFINE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DefineRule> getDefines()
  {
    if (defines == null)
    {
      defines = new EObjectContainmentEList<DefineRule>(DefineRule.class, this, ScannerPackage.DEFINE__DEFINES);
    }
    return defines;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case ScannerPackage.DEFINE__DEFINES:
        return ((InternalEList<?>)getDefines()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case ScannerPackage.DEFINE__DEFINES:
        return getDefines();
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
      case ScannerPackage.DEFINE__DEFINES:
        getDefines().clear();
        getDefines().addAll((Collection<? extends DefineRule>)newValue);
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
      case ScannerPackage.DEFINE__DEFINES:
        getDefines().clear();
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
      case ScannerPackage.DEFINE__DEFINES:
        return defines != null && !defines.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //DefineImpl
