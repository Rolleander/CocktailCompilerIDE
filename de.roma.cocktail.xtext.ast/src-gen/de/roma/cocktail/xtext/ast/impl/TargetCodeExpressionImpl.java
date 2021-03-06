/**
 * generated by Xtext 2.9.1
 */
package de.roma.cocktail.xtext.ast.impl;

import de.roma.cocktail.xtext.ast.AstPackage;
import de.roma.cocktail.xtext.ast.TargetCodeExpression;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Target Code Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.roma.cocktail.xtext.ast.impl.TargetCodeExpressionImpl#getCode <em>Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TargetCodeExpressionImpl extends MinimalEObjectImpl.Container implements TargetCodeExpression
{
  /**
   * The cached value of the '{@link #getCode() <em>Code</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCode()
   * @generated
   * @ordered
   */
  protected EList<String> code;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TargetCodeExpressionImpl()
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
    return AstPackage.Literals.TARGET_CODE_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getCode()
  {
    if (code == null)
    {
      code = new EDataTypeEList<String>(String.class, this, AstPackage.TARGET_CODE_EXPRESSION__CODE);
    }
    return code;
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
      case AstPackage.TARGET_CODE_EXPRESSION__CODE:
        return getCode();
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
      case AstPackage.TARGET_CODE_EXPRESSION__CODE:
        getCode().clear();
        getCode().addAll((Collection<? extends String>)newValue);
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
      case AstPackage.TARGET_CODE_EXPRESSION__CODE:
        getCode().clear();
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
      case AstPackage.TARGET_CODE_EXPRESSION__CODE:
        return code != null && !code.isEmpty();
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
    result.append(" (code: ");
    result.append(code);
    result.append(')');
    return result.toString();
  }

} //TargetCodeExpressionImpl
