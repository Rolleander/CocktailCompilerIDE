/**
 */
package org.xtext.cocktail.scanner.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.cocktail.scanner.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ScannerFactoryImpl extends EFactoryImpl implements ScannerFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ScannerFactory init()
  {
    try
    {
      ScannerFactory theScannerFactory = (ScannerFactory)EPackage.Registry.INSTANCE.getEFactory(ScannerPackage.eNS_URI);
      if (theScannerFactory != null)
      {
        return theScannerFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new ScannerFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ScannerFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case ScannerPackage.MODEL: return createModel();
      case ScannerPackage.TITLE: return createTitle();
      case ScannerPackage.EXPORT: return createExport();
      case ScannerPackage.GLOBAL: return createGlobal();
      case ScannerPackage.LOCAL: return createLocal();
      case ScannerPackage.DEFAULT: return createDefault();
      case ScannerPackage.EOF: return createEof();
      case ScannerPackage.DEFINE: return createDefine();
      case ScannerPackage.DEFINE_RULE: return createDefineRule();
      case ScannerPackage.START_STATES: return createStartStates();
      case ScannerPackage.START_STATE: return createStartState();
      case ScannerPackage.RULE: return createRule();
      case ScannerPackage.SINGLE_RULE: return createSingleRule();
      case ScannerPackage.RULE_START: return createRuleStart();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Title createTitle()
  {
    TitleImpl title = new TitleImpl();
    return title;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Export createExport()
  {
    ExportImpl export = new ExportImpl();
    return export;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Global createGlobal()
  {
    GlobalImpl global = new GlobalImpl();
    return global;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Local createLocal()
  {
    LocalImpl local = new LocalImpl();
    return local;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Default createDefault()
  {
    DefaultImpl default_ = new DefaultImpl();
    return default_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Eof createEof()
  {
    EofImpl eof = new EofImpl();
    return eof;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Define createDefine()
  {
    DefineImpl define = new DefineImpl();
    return define;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DefineRule createDefineRule()
  {
    DefineRuleImpl defineRule = new DefineRuleImpl();
    return defineRule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StartStates createStartStates()
  {
    StartStatesImpl startStates = new StartStatesImpl();
    return startStates;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StartState createStartState()
  {
    StartStateImpl startState = new StartStateImpl();
    return startState;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Rule createRule()
  {
    RuleImpl rule = new RuleImpl();
    return rule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SingleRule createSingleRule()
  {
    SingleRuleImpl singleRule = new SingleRuleImpl();
    return singleRule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RuleStart createRuleStart()
  {
    RuleStartImpl ruleStart = new RuleStartImpl();
    return ruleStart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ScannerPackage getScannerPackage()
  {
    return (ScannerPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static ScannerPackage getPackage()
  {
    return ScannerPackage.eINSTANCE;
  }

} //ScannerFactoryImpl
