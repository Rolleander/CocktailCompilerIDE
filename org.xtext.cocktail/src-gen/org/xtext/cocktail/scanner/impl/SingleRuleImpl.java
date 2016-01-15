/**
 */
package org.xtext.cocktail.scanner.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.xtext.cocktail.scanner.ScannerPackage;
import org.xtext.cocktail.scanner.SingleRule;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Single Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.cocktail.scanner.impl.SingleRuleImpl#getRule <em>Rule</em>}</li>
 *   <li>{@link org.xtext.cocktail.scanner.impl.SingleRuleImpl#getContent <em>Content</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SingleRuleImpl extends MinimalEObjectImpl.Container implements SingleRule
{
  /**
   * The cached value of the '{@link #getRule() <em>Rule</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRule()
   * @generated
   * @ordered
   */
  protected EList<String> rule;

  /**
   * The cached value of the '{@link #getContent() <em>Content</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContent()
   * @generated
   * @ordered
   */
  protected EList<String> content;

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
  public EList<String> getRule()
  {
    if (rule == null)
    {
      rule = new EDataTypeEList<String>(String.class, this, ScannerPackage.SINGLE_RULE__RULE);
    }
    return rule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getContent()
  {
    if (content == null)
    {
      content = new EDataTypeEList<String>(String.class, this, ScannerPackage.SINGLE_RULE__CONTENT);
    }
    return content;
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
      case ScannerPackage.SINGLE_RULE__RULE:
        return getRule();
      case ScannerPackage.SINGLE_RULE__CONTENT:
        return getContent();
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
      case ScannerPackage.SINGLE_RULE__RULE:
        getRule().clear();
        getRule().addAll((Collection<? extends String>)newValue);
        return;
      case ScannerPackage.SINGLE_RULE__CONTENT:
        getContent().clear();
        getContent().addAll((Collection<? extends String>)newValue);
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
      case ScannerPackage.SINGLE_RULE__RULE:
        getRule().clear();
        return;
      case ScannerPackage.SINGLE_RULE__CONTENT:
        getContent().clear();
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
      case ScannerPackage.SINGLE_RULE__RULE:
        return rule != null && !rule.isEmpty();
      case ScannerPackage.SINGLE_RULE__CONTENT:
        return content != null && !content.isEmpty();
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
    result.append(" (rule: ");
    result.append(rule);
    result.append(", content: ");
    result.append(content);
    result.append(')');
    return result.toString();
  }

} //SingleRuleImpl
