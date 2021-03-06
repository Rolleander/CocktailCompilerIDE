/**
 * generated by Xtext 2.9.1
 */
package org.xtext.cocktail.scanner.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.xtext.cocktail.scanner.RuleStart;
import org.xtext.cocktail.scanner.ScannerPackage;
import org.xtext.cocktail.scanner.StartState;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rule Start</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.cocktail.scanner.impl.RuleStartImpl#getRulePrec <em>Rule Prec</em>}</li>
 *   <li>{@link org.xtext.cocktail.scanner.impl.RuleStartImpl#getRuleStates <em>Rule States</em>}</li>
 *   <li>{@link org.xtext.cocktail.scanner.impl.RuleStartImpl#getRuleDefault <em>Rule Default</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RuleStartImpl extends MinimalEObjectImpl.Container implements RuleStart
{
  /**
   * The default value of the '{@link #getRulePrec() <em>Rule Prec</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRulePrec()
   * @generated
   * @ordered
   */
  protected static final String RULE_PREC_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRulePrec() <em>Rule Prec</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRulePrec()
   * @generated
   * @ordered
   */
  protected String rulePrec = RULE_PREC_EDEFAULT;

  /**
   * The cached value of the '{@link #getRuleStates() <em>Rule States</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRuleStates()
   * @generated
   * @ordered
   */
  protected EList<StartState> ruleStates;

  /**
   * The default value of the '{@link #getRuleDefault() <em>Rule Default</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRuleDefault()
   * @generated
   * @ordered
   */
  protected static final String RULE_DEFAULT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRuleDefault() <em>Rule Default</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRuleDefault()
   * @generated
   * @ordered
   */
  protected String ruleDefault = RULE_DEFAULT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RuleStartImpl()
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
    return ScannerPackage.Literals.RULE_START;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getRulePrec()
  {
    return rulePrec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRulePrec(String newRulePrec)
  {
    String oldRulePrec = rulePrec;
    rulePrec = newRulePrec;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ScannerPackage.RULE_START__RULE_PREC, oldRulePrec, rulePrec));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<StartState> getRuleStates()
  {
    if (ruleStates == null)
    {
      ruleStates = new EObjectResolvingEList<StartState>(StartState.class, this, ScannerPackage.RULE_START__RULE_STATES);
    }
    return ruleStates;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getRuleDefault()
  {
    return ruleDefault;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRuleDefault(String newRuleDefault)
  {
    String oldRuleDefault = ruleDefault;
    ruleDefault = newRuleDefault;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ScannerPackage.RULE_START__RULE_DEFAULT, oldRuleDefault, ruleDefault));
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
      case ScannerPackage.RULE_START__RULE_PREC:
        return getRulePrec();
      case ScannerPackage.RULE_START__RULE_STATES:
        return getRuleStates();
      case ScannerPackage.RULE_START__RULE_DEFAULT:
        return getRuleDefault();
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
      case ScannerPackage.RULE_START__RULE_PREC:
        setRulePrec((String)newValue);
        return;
      case ScannerPackage.RULE_START__RULE_STATES:
        getRuleStates().clear();
        getRuleStates().addAll((Collection<? extends StartState>)newValue);
        return;
      case ScannerPackage.RULE_START__RULE_DEFAULT:
        setRuleDefault((String)newValue);
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
      case ScannerPackage.RULE_START__RULE_PREC:
        setRulePrec(RULE_PREC_EDEFAULT);
        return;
      case ScannerPackage.RULE_START__RULE_STATES:
        getRuleStates().clear();
        return;
      case ScannerPackage.RULE_START__RULE_DEFAULT:
        setRuleDefault(RULE_DEFAULT_EDEFAULT);
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
      case ScannerPackage.RULE_START__RULE_PREC:
        return RULE_PREC_EDEFAULT == null ? rulePrec != null : !RULE_PREC_EDEFAULT.equals(rulePrec);
      case ScannerPackage.RULE_START__RULE_STATES:
        return ruleStates != null && !ruleStates.isEmpty();
      case ScannerPackage.RULE_START__RULE_DEFAULT:
        return RULE_DEFAULT_EDEFAULT == null ? ruleDefault != null : !RULE_DEFAULT_EDEFAULT.equals(ruleDefault);
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
    result.append(" (rulePrec: ");
    result.append(rulePrec);
    result.append(", ruleDefault: ");
    result.append(ruleDefault);
    result.append(')');
    return result.toString();
  }

} //RuleStartImpl
