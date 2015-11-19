/**
 */
package org.xtext.cocktail.scanner.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.cocktail.scanner.AtomicExpression;
import org.xtext.cocktail.scanner.ScannerPackage;
import org.xtext.cocktail.scanner.StarExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Star Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.cocktail.scanner.impl.StarExpressionImpl#getInnerExpression <em>Inner Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StarExpressionImpl extends HighBindExpressionImpl implements StarExpression
{
  /**
   * The cached value of the '{@link #getInnerExpression() <em>Inner Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInnerExpression()
   * @generated
   * @ordered
   */
  protected AtomicExpression innerExpression;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StarExpressionImpl()
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
    return ScannerPackage.Literals.STAR_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AtomicExpression getInnerExpression()
  {
    return innerExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInnerExpression(AtomicExpression newInnerExpression, NotificationChain msgs)
  {
    AtomicExpression oldInnerExpression = innerExpression;
    innerExpression = newInnerExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ScannerPackage.STAR_EXPRESSION__INNER_EXPRESSION, oldInnerExpression, newInnerExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInnerExpression(AtomicExpression newInnerExpression)
  {
    if (newInnerExpression != innerExpression)
    {
      NotificationChain msgs = null;
      if (innerExpression != null)
        msgs = ((InternalEObject)innerExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ScannerPackage.STAR_EXPRESSION__INNER_EXPRESSION, null, msgs);
      if (newInnerExpression != null)
        msgs = ((InternalEObject)newInnerExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ScannerPackage.STAR_EXPRESSION__INNER_EXPRESSION, null, msgs);
      msgs = basicSetInnerExpression(newInnerExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ScannerPackage.STAR_EXPRESSION__INNER_EXPRESSION, newInnerExpression, newInnerExpression));
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
      case ScannerPackage.STAR_EXPRESSION__INNER_EXPRESSION:
        return basicSetInnerExpression(null, msgs);
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
      case ScannerPackage.STAR_EXPRESSION__INNER_EXPRESSION:
        return getInnerExpression();
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
      case ScannerPackage.STAR_EXPRESSION__INNER_EXPRESSION:
        setInnerExpression((AtomicExpression)newValue);
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
      case ScannerPackage.STAR_EXPRESSION__INNER_EXPRESSION:
        setInnerExpression((AtomicExpression)null);
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
      case ScannerPackage.STAR_EXPRESSION__INNER_EXPRESSION:
        return innerExpression != null;
    }
    return super.eIsSet(featureID);
  }

} //StarExpressionImpl
