/**
 * generated by Xtext 2.9.2
 */
package de.roma.cocktail.xtext.lpp.impl;

import de.roma.cocktail.xtext.lpp.LppPackage;
import de.roma.cocktail.xtext.lpp.TokenExtra;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Token Extra</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.roma.cocktail.xtext.lpp.impl.TokenExtraImpl#getCost <em>Cost</em>}</li>
 *   <li>{@link de.roma.cocktail.xtext.lpp.impl.TokenExtraImpl#getPresentation <em>Presentation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TokenExtraImpl extends MinimalEObjectImpl.Container implements TokenExtra
{
  /**
   * The default value of the '{@link #getCost() <em>Cost</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCost()
   * @generated
   * @ordered
   */
  protected static final int COST_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getCost() <em>Cost</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCost()
   * @generated
   * @ordered
   */
  protected int cost = COST_EDEFAULT;

  /**
   * The default value of the '{@link #getPresentation() <em>Presentation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPresentation()
   * @generated
   * @ordered
   */
  protected static final String PRESENTATION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPresentation() <em>Presentation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPresentation()
   * @generated
   * @ordered
   */
  protected String presentation = PRESENTATION_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TokenExtraImpl()
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
    return LppPackage.Literals.TOKEN_EXTRA;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getCost()
  {
    return cost;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCost(int newCost)
  {
    int oldCost = cost;
    cost = newCost;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LppPackage.TOKEN_EXTRA__COST, oldCost, cost));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPresentation()
  {
    return presentation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPresentation(String newPresentation)
  {
    String oldPresentation = presentation;
    presentation = newPresentation;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LppPackage.TOKEN_EXTRA__PRESENTATION, oldPresentation, presentation));
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
      case LppPackage.TOKEN_EXTRA__COST:
        return getCost();
      case LppPackage.TOKEN_EXTRA__PRESENTATION:
        return getPresentation();
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
      case LppPackage.TOKEN_EXTRA__COST:
        setCost((Integer)newValue);
        return;
      case LppPackage.TOKEN_EXTRA__PRESENTATION:
        setPresentation((String)newValue);
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
      case LppPackage.TOKEN_EXTRA__COST:
        setCost(COST_EDEFAULT);
        return;
      case LppPackage.TOKEN_EXTRA__PRESENTATION:
        setPresentation(PRESENTATION_EDEFAULT);
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
      case LppPackage.TOKEN_EXTRA__COST:
        return cost != COST_EDEFAULT;
      case LppPackage.TOKEN_EXTRA__PRESENTATION:
        return PRESENTATION_EDEFAULT == null ? presentation != null : !PRESENTATION_EDEFAULT.equals(presentation);
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
    result.append(" (cost: ");
    result.append(cost);
    result.append(", presentation: ");
    result.append(presentation);
    result.append(')');
    return result.toString();
  }

} //TokenExtraImpl
