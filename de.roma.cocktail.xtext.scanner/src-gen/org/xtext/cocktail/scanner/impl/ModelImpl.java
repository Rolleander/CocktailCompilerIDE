/**
 * generated by Xtext 2.9.1
 */
package org.xtext.cocktail.scanner.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.cocktail.scanner.Begin;
import org.xtext.cocktail.scanner.Close;
import org.xtext.cocktail.scanner.Default;
import org.xtext.cocktail.scanner.Define;
import org.xtext.cocktail.scanner.Eof;
import org.xtext.cocktail.scanner.Export;
import org.xtext.cocktail.scanner.Global;
import org.xtext.cocktail.scanner.Local;
import org.xtext.cocktail.scanner.Model;
import org.xtext.cocktail.scanner.Rule;
import org.xtext.cocktail.scanner.Scanner;
import org.xtext.cocktail.scanner.ScannerPackage;
import org.xtext.cocktail.scanner.StartStates;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.cocktail.scanner.impl.ModelImpl#getScanner <em>Scanner</em>}</li>
 *   <li>{@link org.xtext.cocktail.scanner.impl.ModelImpl#getExport <em>Export</em>}</li>
 *   <li>{@link org.xtext.cocktail.scanner.impl.ModelImpl#getGlobal <em>Global</em>}</li>
 *   <li>{@link org.xtext.cocktail.scanner.impl.ModelImpl#getLocal <em>Local</em>}</li>
 *   <li>{@link org.xtext.cocktail.scanner.impl.ModelImpl#getDefault <em>Default</em>}</li>
 *   <li>{@link org.xtext.cocktail.scanner.impl.ModelImpl#getEof <em>Eof</em>}</li>
 *   <li>{@link org.xtext.cocktail.scanner.impl.ModelImpl#getBegin <em>Begin</em>}</li>
 *   <li>{@link org.xtext.cocktail.scanner.impl.ModelImpl#getClose <em>Close</em>}</li>
 *   <li>{@link org.xtext.cocktail.scanner.impl.ModelImpl#getDefine <em>Define</em>}</li>
 *   <li>{@link org.xtext.cocktail.scanner.impl.ModelImpl#getStates <em>States</em>}</li>
 *   <li>{@link org.xtext.cocktail.scanner.impl.ModelImpl#getRules <em>Rules</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelImpl extends MinimalEObjectImpl.Container implements Model
{
  /**
   * The cached value of the '{@link #getScanner() <em>Scanner</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getScanner()
   * @generated
   * @ordered
   */
  protected Scanner scanner;

  /**
   * The cached value of the '{@link #getExport() <em>Export</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExport()
   * @generated
   * @ordered
   */
  protected Export export;

  /**
   * The cached value of the '{@link #getGlobal() <em>Global</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGlobal()
   * @generated
   * @ordered
   */
  protected Global global;

  /**
   * The cached value of the '{@link #getLocal() <em>Local</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLocal()
   * @generated
   * @ordered
   */
  protected Local local;

  /**
   * The cached value of the '{@link #getDefault() <em>Default</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefault()
   * @generated
   * @ordered
   */
  protected Default default_;

  /**
   * The cached value of the '{@link #getEof() <em>Eof</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEof()
   * @generated
   * @ordered
   */
  protected Eof eof;

  /**
   * The cached value of the '{@link #getBegin() <em>Begin</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBegin()
   * @generated
   * @ordered
   */
  protected Begin begin;

  /**
   * The cached value of the '{@link #getClose() <em>Close</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClose()
   * @generated
   * @ordered
   */
  protected Close close;

  /**
   * The cached value of the '{@link #getDefine() <em>Define</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefine()
   * @generated
   * @ordered
   */
  protected Define define;

  /**
   * The cached value of the '{@link #getStates() <em>States</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStates()
   * @generated
   * @ordered
   */
  protected StartStates states;

  /**
   * The cached value of the '{@link #getRules() <em>Rules</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRules()
   * @generated
   * @ordered
   */
  protected Rule rules;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModelImpl()
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
    return ScannerPackage.Literals.MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Scanner getScanner()
  {
    return scanner;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetScanner(Scanner newScanner, NotificationChain msgs)
  {
    Scanner oldScanner = scanner;
    scanner = newScanner;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ScannerPackage.MODEL__SCANNER, oldScanner, newScanner);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setScanner(Scanner newScanner)
  {
    if (newScanner != scanner)
    {
      NotificationChain msgs = null;
      if (scanner != null)
        msgs = ((InternalEObject)scanner).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ScannerPackage.MODEL__SCANNER, null, msgs);
      if (newScanner != null)
        msgs = ((InternalEObject)newScanner).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ScannerPackage.MODEL__SCANNER, null, msgs);
      msgs = basicSetScanner(newScanner, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ScannerPackage.MODEL__SCANNER, newScanner, newScanner));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Export getExport()
  {
    return export;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExport(Export newExport, NotificationChain msgs)
  {
    Export oldExport = export;
    export = newExport;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ScannerPackage.MODEL__EXPORT, oldExport, newExport);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExport(Export newExport)
  {
    if (newExport != export)
    {
      NotificationChain msgs = null;
      if (export != null)
        msgs = ((InternalEObject)export).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ScannerPackage.MODEL__EXPORT, null, msgs);
      if (newExport != null)
        msgs = ((InternalEObject)newExport).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ScannerPackage.MODEL__EXPORT, null, msgs);
      msgs = basicSetExport(newExport, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ScannerPackage.MODEL__EXPORT, newExport, newExport));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Global getGlobal()
  {
    return global;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetGlobal(Global newGlobal, NotificationChain msgs)
  {
    Global oldGlobal = global;
    global = newGlobal;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ScannerPackage.MODEL__GLOBAL, oldGlobal, newGlobal);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGlobal(Global newGlobal)
  {
    if (newGlobal != global)
    {
      NotificationChain msgs = null;
      if (global != null)
        msgs = ((InternalEObject)global).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ScannerPackage.MODEL__GLOBAL, null, msgs);
      if (newGlobal != null)
        msgs = ((InternalEObject)newGlobal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ScannerPackage.MODEL__GLOBAL, null, msgs);
      msgs = basicSetGlobal(newGlobal, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ScannerPackage.MODEL__GLOBAL, newGlobal, newGlobal));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Local getLocal()
  {
    return local;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLocal(Local newLocal, NotificationChain msgs)
  {
    Local oldLocal = local;
    local = newLocal;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ScannerPackage.MODEL__LOCAL, oldLocal, newLocal);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLocal(Local newLocal)
  {
    if (newLocal != local)
    {
      NotificationChain msgs = null;
      if (local != null)
        msgs = ((InternalEObject)local).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ScannerPackage.MODEL__LOCAL, null, msgs);
      if (newLocal != null)
        msgs = ((InternalEObject)newLocal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ScannerPackage.MODEL__LOCAL, null, msgs);
      msgs = basicSetLocal(newLocal, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ScannerPackage.MODEL__LOCAL, newLocal, newLocal));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Default getDefault()
  {
    return default_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDefault(Default newDefault, NotificationChain msgs)
  {
    Default oldDefault = default_;
    default_ = newDefault;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ScannerPackage.MODEL__DEFAULT, oldDefault, newDefault);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDefault(Default newDefault)
  {
    if (newDefault != default_)
    {
      NotificationChain msgs = null;
      if (default_ != null)
        msgs = ((InternalEObject)default_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ScannerPackage.MODEL__DEFAULT, null, msgs);
      if (newDefault != null)
        msgs = ((InternalEObject)newDefault).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ScannerPackage.MODEL__DEFAULT, null, msgs);
      msgs = basicSetDefault(newDefault, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ScannerPackage.MODEL__DEFAULT, newDefault, newDefault));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Eof getEof()
  {
    return eof;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEof(Eof newEof, NotificationChain msgs)
  {
    Eof oldEof = eof;
    eof = newEof;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ScannerPackage.MODEL__EOF, oldEof, newEof);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEof(Eof newEof)
  {
    if (newEof != eof)
    {
      NotificationChain msgs = null;
      if (eof != null)
        msgs = ((InternalEObject)eof).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ScannerPackage.MODEL__EOF, null, msgs);
      if (newEof != null)
        msgs = ((InternalEObject)newEof).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ScannerPackage.MODEL__EOF, null, msgs);
      msgs = basicSetEof(newEof, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ScannerPackage.MODEL__EOF, newEof, newEof));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Begin getBegin()
  {
    return begin;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBegin(Begin newBegin, NotificationChain msgs)
  {
    Begin oldBegin = begin;
    begin = newBegin;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ScannerPackage.MODEL__BEGIN, oldBegin, newBegin);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBegin(Begin newBegin)
  {
    if (newBegin != begin)
    {
      NotificationChain msgs = null;
      if (begin != null)
        msgs = ((InternalEObject)begin).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ScannerPackage.MODEL__BEGIN, null, msgs);
      if (newBegin != null)
        msgs = ((InternalEObject)newBegin).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ScannerPackage.MODEL__BEGIN, null, msgs);
      msgs = basicSetBegin(newBegin, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ScannerPackage.MODEL__BEGIN, newBegin, newBegin));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Close getClose()
  {
    return close;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetClose(Close newClose, NotificationChain msgs)
  {
    Close oldClose = close;
    close = newClose;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ScannerPackage.MODEL__CLOSE, oldClose, newClose);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setClose(Close newClose)
  {
    if (newClose != close)
    {
      NotificationChain msgs = null;
      if (close != null)
        msgs = ((InternalEObject)close).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ScannerPackage.MODEL__CLOSE, null, msgs);
      if (newClose != null)
        msgs = ((InternalEObject)newClose).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ScannerPackage.MODEL__CLOSE, null, msgs);
      msgs = basicSetClose(newClose, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ScannerPackage.MODEL__CLOSE, newClose, newClose));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Define getDefine()
  {
    return define;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDefine(Define newDefine, NotificationChain msgs)
  {
    Define oldDefine = define;
    define = newDefine;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ScannerPackage.MODEL__DEFINE, oldDefine, newDefine);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDefine(Define newDefine)
  {
    if (newDefine != define)
    {
      NotificationChain msgs = null;
      if (define != null)
        msgs = ((InternalEObject)define).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ScannerPackage.MODEL__DEFINE, null, msgs);
      if (newDefine != null)
        msgs = ((InternalEObject)newDefine).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ScannerPackage.MODEL__DEFINE, null, msgs);
      msgs = basicSetDefine(newDefine, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ScannerPackage.MODEL__DEFINE, newDefine, newDefine));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StartStates getStates()
  {
    return states;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStates(StartStates newStates, NotificationChain msgs)
  {
    StartStates oldStates = states;
    states = newStates;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ScannerPackage.MODEL__STATES, oldStates, newStates);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStates(StartStates newStates)
  {
    if (newStates != states)
    {
      NotificationChain msgs = null;
      if (states != null)
        msgs = ((InternalEObject)states).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ScannerPackage.MODEL__STATES, null, msgs);
      if (newStates != null)
        msgs = ((InternalEObject)newStates).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ScannerPackage.MODEL__STATES, null, msgs);
      msgs = basicSetStates(newStates, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ScannerPackage.MODEL__STATES, newStates, newStates));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Rule getRules()
  {
    return rules;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRules(Rule newRules, NotificationChain msgs)
  {
    Rule oldRules = rules;
    rules = newRules;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ScannerPackage.MODEL__RULES, oldRules, newRules);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRules(Rule newRules)
  {
    if (newRules != rules)
    {
      NotificationChain msgs = null;
      if (rules != null)
        msgs = ((InternalEObject)rules).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ScannerPackage.MODEL__RULES, null, msgs);
      if (newRules != null)
        msgs = ((InternalEObject)newRules).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ScannerPackage.MODEL__RULES, null, msgs);
      msgs = basicSetRules(newRules, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ScannerPackage.MODEL__RULES, newRules, newRules));
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
      case ScannerPackage.MODEL__SCANNER:
        return basicSetScanner(null, msgs);
      case ScannerPackage.MODEL__EXPORT:
        return basicSetExport(null, msgs);
      case ScannerPackage.MODEL__GLOBAL:
        return basicSetGlobal(null, msgs);
      case ScannerPackage.MODEL__LOCAL:
        return basicSetLocal(null, msgs);
      case ScannerPackage.MODEL__DEFAULT:
        return basicSetDefault(null, msgs);
      case ScannerPackage.MODEL__EOF:
        return basicSetEof(null, msgs);
      case ScannerPackage.MODEL__BEGIN:
        return basicSetBegin(null, msgs);
      case ScannerPackage.MODEL__CLOSE:
        return basicSetClose(null, msgs);
      case ScannerPackage.MODEL__DEFINE:
        return basicSetDefine(null, msgs);
      case ScannerPackage.MODEL__STATES:
        return basicSetStates(null, msgs);
      case ScannerPackage.MODEL__RULES:
        return basicSetRules(null, msgs);
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
      case ScannerPackage.MODEL__SCANNER:
        return getScanner();
      case ScannerPackage.MODEL__EXPORT:
        return getExport();
      case ScannerPackage.MODEL__GLOBAL:
        return getGlobal();
      case ScannerPackage.MODEL__LOCAL:
        return getLocal();
      case ScannerPackage.MODEL__DEFAULT:
        return getDefault();
      case ScannerPackage.MODEL__EOF:
        return getEof();
      case ScannerPackage.MODEL__BEGIN:
        return getBegin();
      case ScannerPackage.MODEL__CLOSE:
        return getClose();
      case ScannerPackage.MODEL__DEFINE:
        return getDefine();
      case ScannerPackage.MODEL__STATES:
        return getStates();
      case ScannerPackage.MODEL__RULES:
        return getRules();
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
      case ScannerPackage.MODEL__SCANNER:
        setScanner((Scanner)newValue);
        return;
      case ScannerPackage.MODEL__EXPORT:
        setExport((Export)newValue);
        return;
      case ScannerPackage.MODEL__GLOBAL:
        setGlobal((Global)newValue);
        return;
      case ScannerPackage.MODEL__LOCAL:
        setLocal((Local)newValue);
        return;
      case ScannerPackage.MODEL__DEFAULT:
        setDefault((Default)newValue);
        return;
      case ScannerPackage.MODEL__EOF:
        setEof((Eof)newValue);
        return;
      case ScannerPackage.MODEL__BEGIN:
        setBegin((Begin)newValue);
        return;
      case ScannerPackage.MODEL__CLOSE:
        setClose((Close)newValue);
        return;
      case ScannerPackage.MODEL__DEFINE:
        setDefine((Define)newValue);
        return;
      case ScannerPackage.MODEL__STATES:
        setStates((StartStates)newValue);
        return;
      case ScannerPackage.MODEL__RULES:
        setRules((Rule)newValue);
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
      case ScannerPackage.MODEL__SCANNER:
        setScanner((Scanner)null);
        return;
      case ScannerPackage.MODEL__EXPORT:
        setExport((Export)null);
        return;
      case ScannerPackage.MODEL__GLOBAL:
        setGlobal((Global)null);
        return;
      case ScannerPackage.MODEL__LOCAL:
        setLocal((Local)null);
        return;
      case ScannerPackage.MODEL__DEFAULT:
        setDefault((Default)null);
        return;
      case ScannerPackage.MODEL__EOF:
        setEof((Eof)null);
        return;
      case ScannerPackage.MODEL__BEGIN:
        setBegin((Begin)null);
        return;
      case ScannerPackage.MODEL__CLOSE:
        setClose((Close)null);
        return;
      case ScannerPackage.MODEL__DEFINE:
        setDefine((Define)null);
        return;
      case ScannerPackage.MODEL__STATES:
        setStates((StartStates)null);
        return;
      case ScannerPackage.MODEL__RULES:
        setRules((Rule)null);
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
      case ScannerPackage.MODEL__SCANNER:
        return scanner != null;
      case ScannerPackage.MODEL__EXPORT:
        return export != null;
      case ScannerPackage.MODEL__GLOBAL:
        return global != null;
      case ScannerPackage.MODEL__LOCAL:
        return local != null;
      case ScannerPackage.MODEL__DEFAULT:
        return default_ != null;
      case ScannerPackage.MODEL__EOF:
        return eof != null;
      case ScannerPackage.MODEL__BEGIN:
        return begin != null;
      case ScannerPackage.MODEL__CLOSE:
        return close != null;
      case ScannerPackage.MODEL__DEFINE:
        return define != null;
      case ScannerPackage.MODEL__STATES:
        return states != null;
      case ScannerPackage.MODEL__RULES:
        return rules != null;
    }
    return super.eIsSet(featureID);
  }

} //ModelImpl
