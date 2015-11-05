/**
 */
package org.xtext.cocktail.scanner.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.cocktail.scanner.DefineRule;
import org.xtext.cocktail.scanner.ScannerPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Define Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.cocktail.scanner.impl.DefineRuleImpl#getDefineName <em>Define Name</em>}</li>
 *   <li>{@link org.xtext.cocktail.scanner.impl.DefineRuleImpl#getDefineRule <em>Define Rule</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DefineRuleImpl extends MinimalEObjectImpl.Container implements DefineRule
{
  /**
   * The default value of the '{@link #getDefineName() <em>Define Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefineName()
   * @generated
   * @ordered
   */
  protected static final String DEFINE_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDefineName() <em>Define Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefineName()
   * @generated
   * @ordered
   */
  protected String defineName = DEFINE_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getDefineRule() <em>Define Rule</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefineRule()
   * @generated
   * @ordered
   */
  protected static final String DEFINE_RULE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDefineRule() <em>Define Rule</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefineRule()
   * @generated
   * @ordered
   */
  protected String defineRule = DEFINE_RULE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DefineRuleImpl()
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
    return ScannerPackage.Literals.DEFINE_RULE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDefineName()
  {
    return defineName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDefineName(String newDefineName)
  {
    String oldDefineName = defineName;
    defineName = newDefineName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ScannerPackage.DEFINE_RULE__DEFINE_NAME, oldDefineName, defineName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDefineRule()
  {
    return defineRule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDefineRule(String newDefineRule)
  {
    String oldDefineRule = defineRule;
    defineRule = newDefineRule;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ScannerPackage.DEFINE_RULE__DEFINE_RULE, oldDefineRule, defineRule));
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
      case ScannerPackage.DEFINE_RULE__DEFINE_NAME:
        return getDefineName();
      case ScannerPackage.DEFINE_RULE__DEFINE_RULE:
        return getDefineRule();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ScannerPackage.DEFINE_RULE__DEFINE_NAME:
        setDefineName((String)newValue);
        return;
      case ScannerPackage.DEFINE_RULE__DEFINE_RULE:
        setDefineRule((String)newValue);
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
      case ScannerPackage.DEFINE_RULE__DEFINE_NAME:
        setDefineName(DEFINE_NAME_EDEFAULT);
        return;
      case ScannerPackage.DEFINE_RULE__DEFINE_RULE:
        setDefineRule(DEFINE_RULE_EDEFAULT);
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
      case ScannerPackage.DEFINE_RULE__DEFINE_NAME:
        return DEFINE_NAME_EDEFAULT == null ? defineName != null : !DEFINE_NAME_EDEFAULT.equals(defineName);
      case ScannerPackage.DEFINE_RULE__DEFINE_RULE:
        return DEFINE_RULE_EDEFAULT == null ? defineRule != null : !DEFINE_RULE_EDEFAULT.equals(defineRule);
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
    result.append(" (defineName: ");
    result.append(defineName);
    result.append(", defineRule: ");
    result.append(defineRule);
    result.append(')');
    return result.toString();
  }

} //DefineRuleImpl
