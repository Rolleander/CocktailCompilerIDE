/**
 * generated by Xtext 2.9.1
 */
package de.roma.cocktail.xtext.lpp.impl;

import de.roma.cocktail.xtext.lpp.CodeBlock;
import de.roma.cocktail.xtext.lpp.Extensions;
import de.roma.cocktail.xtext.lpp.LppPackage;
import de.roma.cocktail.xtext.lpp.NodePart;
import de.roma.cocktail.xtext.lpp.PrecedenceRow;
import de.roma.cocktail.xtext.lpp.RuleBody;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rule Body</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.roma.cocktail.xtext.lpp.impl.RuleBodyImpl#getNodetype <em>Nodetype</em>}</li>
 *   <li>{@link de.roma.cocktail.xtext.lpp.impl.RuleBodyImpl#getPart <em>Part</em>}</li>
 *   <li>{@link de.roma.cocktail.xtext.lpp.impl.RuleBodyImpl#getToken <em>Token</em>}</li>
 *   <li>{@link de.roma.cocktail.xtext.lpp.impl.RuleBodyImpl#getBlock <em>Block</em>}</li>
 *   <li>{@link de.roma.cocktail.xtext.lpp.impl.RuleBodyImpl#getExtension <em>Extension</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RuleBodyImpl extends MinimalEObjectImpl.Container implements RuleBody
{
  /**
   * The default value of the '{@link #getNodetype() <em>Nodetype</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNodetype()
   * @generated
   * @ordered
   */
  protected static final String NODETYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNodetype() <em>Nodetype</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNodetype()
   * @generated
   * @ordered
   */
  protected String nodetype = NODETYPE_EDEFAULT;

  /**
   * The cached value of the '{@link #getPart() <em>Part</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPart()
   * @generated
   * @ordered
   */
  protected EList<NodePart> part;

  /**
   * The cached value of the '{@link #getToken() <em>Token</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getToken()
   * @generated
   * @ordered
   */
  protected PrecedenceRow token;

  /**
   * The cached value of the '{@link #getBlock() <em>Block</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBlock()
   * @generated
   * @ordered
   */
  protected CodeBlock block;

  /**
   * The cached value of the '{@link #getExtension() <em>Extension</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExtension()
   * @generated
   * @ordered
   */
  protected Extensions extension;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RuleBodyImpl()
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
    return LppPackage.Literals.RULE_BODY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getNodetype()
  {
    return nodetype;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNodetype(String newNodetype)
  {
    String oldNodetype = nodetype;
    nodetype = newNodetype;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LppPackage.RULE_BODY__NODETYPE, oldNodetype, nodetype));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<NodePart> getPart()
  {
    if (part == null)
    {
      part = new EObjectContainmentEList<NodePart>(NodePart.class, this, LppPackage.RULE_BODY__PART);
    }
    return part;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PrecedenceRow getToken()
  {
    if (token != null && token.eIsProxy())
    {
      InternalEObject oldToken = (InternalEObject)token;
      token = (PrecedenceRow)eResolveProxy(oldToken);
      if (token != oldToken)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, LppPackage.RULE_BODY__TOKEN, oldToken, token));
      }
    }
    return token;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PrecedenceRow basicGetToken()
  {
    return token;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setToken(PrecedenceRow newToken)
  {
    PrecedenceRow oldToken = token;
    token = newToken;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LppPackage.RULE_BODY__TOKEN, oldToken, token));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CodeBlock getBlock()
  {
    return block;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBlock(CodeBlock newBlock, NotificationChain msgs)
  {
    CodeBlock oldBlock = block;
    block = newBlock;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LppPackage.RULE_BODY__BLOCK, oldBlock, newBlock);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBlock(CodeBlock newBlock)
  {
    if (newBlock != block)
    {
      NotificationChain msgs = null;
      if (block != null)
        msgs = ((InternalEObject)block).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LppPackage.RULE_BODY__BLOCK, null, msgs);
      if (newBlock != null)
        msgs = ((InternalEObject)newBlock).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LppPackage.RULE_BODY__BLOCK, null, msgs);
      msgs = basicSetBlock(newBlock, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LppPackage.RULE_BODY__BLOCK, newBlock, newBlock));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Extensions getExtension()
  {
    return extension;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExtension(Extensions newExtension, NotificationChain msgs)
  {
    Extensions oldExtension = extension;
    extension = newExtension;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LppPackage.RULE_BODY__EXTENSION, oldExtension, newExtension);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExtension(Extensions newExtension)
  {
    if (newExtension != extension)
    {
      NotificationChain msgs = null;
      if (extension != null)
        msgs = ((InternalEObject)extension).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LppPackage.RULE_BODY__EXTENSION, null, msgs);
      if (newExtension != null)
        msgs = ((InternalEObject)newExtension).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LppPackage.RULE_BODY__EXTENSION, null, msgs);
      msgs = basicSetExtension(newExtension, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LppPackage.RULE_BODY__EXTENSION, newExtension, newExtension));
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
      case LppPackage.RULE_BODY__PART:
        return ((InternalEList<?>)getPart()).basicRemove(otherEnd, msgs);
      case LppPackage.RULE_BODY__BLOCK:
        return basicSetBlock(null, msgs);
      case LppPackage.RULE_BODY__EXTENSION:
        return basicSetExtension(null, msgs);
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
      case LppPackage.RULE_BODY__NODETYPE:
        return getNodetype();
      case LppPackage.RULE_BODY__PART:
        return getPart();
      case LppPackage.RULE_BODY__TOKEN:
        if (resolve) return getToken();
        return basicGetToken();
      case LppPackage.RULE_BODY__BLOCK:
        return getBlock();
      case LppPackage.RULE_BODY__EXTENSION:
        return getExtension();
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
      case LppPackage.RULE_BODY__NODETYPE:
        setNodetype((String)newValue);
        return;
      case LppPackage.RULE_BODY__PART:
        getPart().clear();
        getPart().addAll((Collection<? extends NodePart>)newValue);
        return;
      case LppPackage.RULE_BODY__TOKEN:
        setToken((PrecedenceRow)newValue);
        return;
      case LppPackage.RULE_BODY__BLOCK:
        setBlock((CodeBlock)newValue);
        return;
      case LppPackage.RULE_BODY__EXTENSION:
        setExtension((Extensions)newValue);
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
      case LppPackage.RULE_BODY__NODETYPE:
        setNodetype(NODETYPE_EDEFAULT);
        return;
      case LppPackage.RULE_BODY__PART:
        getPart().clear();
        return;
      case LppPackage.RULE_BODY__TOKEN:
        setToken((PrecedenceRow)null);
        return;
      case LppPackage.RULE_BODY__BLOCK:
        setBlock((CodeBlock)null);
        return;
      case LppPackage.RULE_BODY__EXTENSION:
        setExtension((Extensions)null);
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
      case LppPackage.RULE_BODY__NODETYPE:
        return NODETYPE_EDEFAULT == null ? nodetype != null : !NODETYPE_EDEFAULT.equals(nodetype);
      case LppPackage.RULE_BODY__PART:
        return part != null && !part.isEmpty();
      case LppPackage.RULE_BODY__TOKEN:
        return token != null;
      case LppPackage.RULE_BODY__BLOCK:
        return block != null;
      case LppPackage.RULE_BODY__EXTENSION:
        return extension != null;
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
    result.append(" (nodetype: ");
    result.append(nodetype);
    result.append(')');
    return result.toString();
  }

} //RuleBodyImpl
