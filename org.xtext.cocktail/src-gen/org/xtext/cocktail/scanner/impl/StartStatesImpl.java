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

import org.xtext.cocktail.scanner.ScannerPackage;
import org.xtext.cocktail.scanner.StartState;
import org.xtext.cocktail.scanner.StartStates;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Start States</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.cocktail.scanner.impl.StartStatesImpl#getIncstates <em>Incstates</em>}</li>
 *   <li>{@link org.xtext.cocktail.scanner.impl.StartStatesImpl#getExstates <em>Exstates</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StartStatesImpl extends MinimalEObjectImpl.Container implements StartStates
{
  /**
   * The cached value of the '{@link #getIncstates() <em>Incstates</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIncstates()
   * @generated
   * @ordered
   */
  protected EList<StartState> incstates;

  /**
   * The cached value of the '{@link #getExstates() <em>Exstates</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExstates()
   * @generated
   * @ordered
   */
  protected EList<StartState> exstates;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StartStatesImpl()
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
    return ScannerPackage.Literals.START_STATES;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<StartState> getIncstates()
  {
    if (incstates == null)
    {
      incstates = new EObjectContainmentEList<StartState>(StartState.class, this, ScannerPackage.START_STATES__INCSTATES);
    }
    return incstates;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<StartState> getExstates()
  {
    if (exstates == null)
    {
      exstates = new EObjectContainmentEList<StartState>(StartState.class, this, ScannerPackage.START_STATES__EXSTATES);
    }
    return exstates;
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
      case ScannerPackage.START_STATES__INCSTATES:
        return ((InternalEList<?>)getIncstates()).basicRemove(otherEnd, msgs);
      case ScannerPackage.START_STATES__EXSTATES:
        return ((InternalEList<?>)getExstates()).basicRemove(otherEnd, msgs);
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
      case ScannerPackage.START_STATES__INCSTATES:
        return getIncstates();
      case ScannerPackage.START_STATES__EXSTATES:
        return getExstates();
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
      case ScannerPackage.START_STATES__INCSTATES:
        getIncstates().clear();
        getIncstates().addAll((Collection<? extends StartState>)newValue);
        return;
      case ScannerPackage.START_STATES__EXSTATES:
        getExstates().clear();
        getExstates().addAll((Collection<? extends StartState>)newValue);
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
      case ScannerPackage.START_STATES__INCSTATES:
        getIncstates().clear();
        return;
      case ScannerPackage.START_STATES__EXSTATES:
        getExstates().clear();
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
      case ScannerPackage.START_STATES__INCSTATES:
        return incstates != null && !incstates.isEmpty();
      case ScannerPackage.START_STATES__EXSTATES:
        return exstates != null && !exstates.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //StartStatesImpl
