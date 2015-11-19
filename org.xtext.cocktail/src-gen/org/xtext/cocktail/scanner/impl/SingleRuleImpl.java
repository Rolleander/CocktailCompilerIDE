/**
 */
package org.xtext.cocktail.scanner.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.xtext.cocktail.scanner.ScannerPackage;
import org.xtext.cocktail.scanner.SingleRule;
import org.xtext.cocktail.scanner.StartState;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Single Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.cocktail.scanner.impl.SingleRuleImpl#getState <em>State</em>}</li>
 *   <li>{@link org.xtext.cocktail.scanner.impl.SingleRuleImpl#getRegex <em>Regex</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SingleRuleImpl extends MinimalEObjectImpl.Container implements SingleRule
{
  /**
   * The cached value of the '{@link #getState() <em>State</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getState()
   * @generated
   * @ordered
   */
  protected EList<StartState> state;

  /**
   * The cached value of the '{@link #getRegex() <em>Regex</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRegex()
   * @generated
   * @ordered
   */
  protected EList<String> regex;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SingleRuleImpl()
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
    return ScannerPackage.Literals.SINGLE_RULE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<StartState> getState()
  {
    if (state == null)
    {
      state = new EObjectResolvingEList<StartState>(StartState.class, this, ScannerPackage.SINGLE_RULE__STATE);
    }
    return state;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getRegex()
  {
    if (regex == null)
    {
      regex = new EDataTypeEList<String>(String.class, this, ScannerPackage.SINGLE_RULE__REGEX);
    }
    return regex;
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
      case ScannerPackage.SINGLE_RULE__STATE:
        return getState();
      case ScannerPackage.SINGLE_RULE__REGEX:
        return getRegex();
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
      case ScannerPackage.SINGLE_RULE__STATE:
        getState().clear();
        getState().addAll((Collection<? extends StartState>)newValue);
        return;
      case ScannerPackage.SINGLE_RULE__REGEX:
        getRegex().clear();
        getRegex().addAll((Collection<? extends String>)newValue);
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
      case ScannerPackage.SINGLE_RULE__STATE:
        getState().clear();
        return;
      case ScannerPackage.SINGLE_RULE__REGEX:
        getRegex().clear();
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
      case ScannerPackage.SINGLE_RULE__STATE:
        return state != null && !state.isEmpty();
      case ScannerPackage.SINGLE_RULE__REGEX:
        return regex != null && !regex.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (regex: ");
    result.append(regex);
    result.append(')');
    return result.toString();
  }

} //SingleRuleImpl
