/**
 */
package org.xtext.cocktail.scanner;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.xtext.cocktail.scanner.ScannerFactory
 * @model kind="package"
 * @generated
 */
public interface ScannerPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "scanner";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/cocktail/Scanner";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "scanner";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ScannerPackage eINSTANCE = org.xtext.cocktail.scanner.impl.ScannerPackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.cocktail.scanner.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.cocktail.scanner.impl.ModelImpl
   * @see org.xtext.cocktail.scanner.impl.ScannerPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Scanner</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__SCANNER = 0;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.cocktail.scanner.impl.ScannerImpl <em>Scanner</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.cocktail.scanner.impl.ScannerImpl
   * @see org.xtext.cocktail.scanner.impl.ScannerPackageImpl#getScanner()
   * @generated
   */
  int SCANNER = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCANNER__NAME = 0;

  /**
   * The number of structural features of the '<em>Scanner</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCANNER_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.cocktail.scanner.impl.ExportImpl <em>Export</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.cocktail.scanner.impl.ExportImpl
   * @see org.xtext.cocktail.scanner.impl.ScannerPackageImpl#getExport()
   * @generated
   */
  int EXPORT = 2;

  /**
   * The feature id for the '<em><b>Content</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPORT__CONTENT = 0;

  /**
   * The number of structural features of the '<em>Export</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPORT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.cocktail.scanner.impl.GlobalImpl <em>Global</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.cocktail.scanner.impl.GlobalImpl
   * @see org.xtext.cocktail.scanner.impl.ScannerPackageImpl#getGlobal()
   * @generated
   */
  int GLOBAL = 3;

  /**
   * The feature id for the '<em><b>Content</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLOBAL__CONTENT = 0;

  /**
   * The number of structural features of the '<em>Global</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLOBAL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.cocktail.scanner.impl.LocalImpl <em>Local</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.cocktail.scanner.impl.LocalImpl
   * @see org.xtext.cocktail.scanner.impl.ScannerPackageImpl#getLocal()
   * @generated
   */
  int LOCAL = 4;

  /**
   * The feature id for the '<em><b>Content</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL__CONTENT = 0;

  /**
   * The number of structural features of the '<em>Local</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.cocktail.scanner.impl.DefaultImpl <em>Default</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.cocktail.scanner.impl.DefaultImpl
   * @see org.xtext.cocktail.scanner.impl.ScannerPackageImpl#getDefault()
   * @generated
   */
  int DEFAULT = 5;

  /**
   * The feature id for the '<em><b>Content</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFAULT__CONTENT = 0;

  /**
   * The number of structural features of the '<em>Default</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFAULT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.cocktail.scanner.impl.EofImpl <em>Eof</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.cocktail.scanner.impl.EofImpl
   * @see org.xtext.cocktail.scanner.impl.ScannerPackageImpl#getEof()
   * @generated
   */
  int EOF = 6;

  /**
   * The feature id for the '<em><b>Content</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EOF__CONTENT = 0;

  /**
   * The number of structural features of the '<em>Eof</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EOF_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.cocktail.scanner.impl.DefineImpl <em>Define</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.cocktail.scanner.impl.DefineImpl
   * @see org.xtext.cocktail.scanner.impl.ScannerPackageImpl#getDefine()
   * @generated
   */
  int DEFINE = 7;

  /**
   * The feature id for the '<em><b>Defines</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINE__DEFINES = 0;

  /**
   * The number of structural features of the '<em>Define</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.cocktail.scanner.impl.DefineRuleImpl <em>Define Rule</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.cocktail.scanner.impl.DefineRuleImpl
   * @see org.xtext.cocktail.scanner.impl.ScannerPackageImpl#getDefineRule()
   * @generated
   */
  int DEFINE_RULE = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINE_RULE__NAME = 0;

  /**
   * The feature id for the '<em><b>Rule</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINE_RULE__RULE = 1;

  /**
   * The number of structural features of the '<em>Define Rule</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINE_RULE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.cocktail.scanner.impl.StartStatesImpl <em>Start States</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.cocktail.scanner.impl.StartStatesImpl
   * @see org.xtext.cocktail.scanner.impl.ScannerPackageImpl#getStartStates()
   * @generated
   */
  int START_STATES = 9;

  /**
   * The feature id for the '<em><b>Incstates</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int START_STATES__INCSTATES = 0;

  /**
   * The feature id for the '<em><b>Exstates</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int START_STATES__EXSTATES = 1;

  /**
   * The number of structural features of the '<em>Start States</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int START_STATES_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.cocktail.scanner.impl.StartStateImpl <em>Start State</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.cocktail.scanner.impl.StartStateImpl
   * @see org.xtext.cocktail.scanner.impl.ScannerPackageImpl#getStartState()
   * @generated
   */
  int START_STATE = 10;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int START_STATE__NAME = 0;

  /**
   * The number of structural features of the '<em>Start State</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int START_STATE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.cocktail.scanner.impl.RuleImpl <em>Rule</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.cocktail.scanner.impl.RuleImpl
   * @see org.xtext.cocktail.scanner.impl.ScannerPackageImpl#getRule()
   * @generated
   */
  int RULE = 11;

  /**
   * The feature id for the '<em><b>Info</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE__INFO = 0;

  /**
   * The feature id for the '<em><b>Rules</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE__RULES = 1;

  /**
   * The number of structural features of the '<em>Rule</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.cocktail.scanner.impl.SingleRuleImpl <em>Single Rule</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.cocktail.scanner.impl.SingleRuleImpl
   * @see org.xtext.cocktail.scanner.impl.ScannerPackageImpl#getSingleRule()
   * @generated
   */
  int SINGLE_RULE = 12;

  /**
   * The feature id for the '<em><b>Rule</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SINGLE_RULE__RULE = 0;

  /**
   * The feature id for the '<em><b>Content</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SINGLE_RULE__CONTENT = 1;

  /**
   * The number of structural features of the '<em>Single Rule</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SINGLE_RULE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.cocktail.scanner.impl.RuleStartImpl <em>Rule Start</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.cocktail.scanner.impl.RuleStartImpl
   * @see org.xtext.cocktail.scanner.impl.ScannerPackageImpl#getRuleStart()
   * @generated
   */
  int RULE_START = 13;

  /**
   * The feature id for the '<em><b>Rule</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_START__RULE = SINGLE_RULE__RULE;

  /**
   * The feature id for the '<em><b>Content</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_START__CONTENT = SINGLE_RULE__CONTENT;

  /**
   * The feature id for the '<em><b>State</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_START__STATE = SINGLE_RULE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Rule Start</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_START_FEATURE_COUNT = SINGLE_RULE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.cocktail.scanner.impl.ActionStatementImpl <em>Action Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.cocktail.scanner.impl.ActionStatementImpl
   * @see org.xtext.cocktail.scanner.impl.ScannerPackageImpl#getActionStatement()
   * @generated
   */
  int ACTION_STATEMENT = 14;

  /**
   * The feature id for the '<em><b>St</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_STATEMENT__ST = 0;

  /**
   * The number of structural features of the '<em>Action Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_STATEMENT_FEATURE_COUNT = 1;


  /**
   * Returns the meta object for class '{@link org.xtext.cocktail.scanner.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see org.xtext.cocktail.scanner.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.cocktail.scanner.Model#getScanner <em>Scanner</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Scanner</em>'.
   * @see org.xtext.cocktail.scanner.Model#getScanner()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Scanner();

  /**
   * Returns the meta object for class '{@link org.xtext.cocktail.scanner.Scanner <em>Scanner</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Scanner</em>'.
   * @see org.xtext.cocktail.scanner.Scanner
   * @generated
   */
  EClass getScanner();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.cocktail.scanner.Scanner#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.cocktail.scanner.Scanner#getName()
   * @see #getScanner()
   * @generated
   */
  EAttribute getScanner_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.cocktail.scanner.Export <em>Export</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Export</em>'.
   * @see org.xtext.cocktail.scanner.Export
   * @generated
   */
  EClass getExport();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.cocktail.scanner.Export#getContent <em>Content</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Content</em>'.
   * @see org.xtext.cocktail.scanner.Export#getContent()
   * @see #getExport()
   * @generated
   */
  EAttribute getExport_Content();

  /**
   * Returns the meta object for class '{@link org.xtext.cocktail.scanner.Global <em>Global</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Global</em>'.
   * @see org.xtext.cocktail.scanner.Global
   * @generated
   */
  EClass getGlobal();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.cocktail.scanner.Global#getContent <em>Content</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Content</em>'.
   * @see org.xtext.cocktail.scanner.Global#getContent()
   * @see #getGlobal()
   * @generated
   */
  EAttribute getGlobal_Content();

  /**
   * Returns the meta object for class '{@link org.xtext.cocktail.scanner.Local <em>Local</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Local</em>'.
   * @see org.xtext.cocktail.scanner.Local
   * @generated
   */
  EClass getLocal();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.cocktail.scanner.Local#getContent <em>Content</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Content</em>'.
   * @see org.xtext.cocktail.scanner.Local#getContent()
   * @see #getLocal()
   * @generated
   */
  EAttribute getLocal_Content();

  /**
   * Returns the meta object for class '{@link org.xtext.cocktail.scanner.Default <em>Default</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Default</em>'.
   * @see org.xtext.cocktail.scanner.Default
   * @generated
   */
  EClass getDefault();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.cocktail.scanner.Default#getContent <em>Content</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Content</em>'.
   * @see org.xtext.cocktail.scanner.Default#getContent()
   * @see #getDefault()
   * @generated
   */
  EAttribute getDefault_Content();

  /**
   * Returns the meta object for class '{@link org.xtext.cocktail.scanner.Eof <em>Eof</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Eof</em>'.
   * @see org.xtext.cocktail.scanner.Eof
   * @generated
   */
  EClass getEof();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.cocktail.scanner.Eof#getContent <em>Content</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Content</em>'.
   * @see org.xtext.cocktail.scanner.Eof#getContent()
   * @see #getEof()
   * @generated
   */
  EAttribute getEof_Content();

  /**
   * Returns the meta object for class '{@link org.xtext.cocktail.scanner.Define <em>Define</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Define</em>'.
   * @see org.xtext.cocktail.scanner.Define
   * @generated
   */
  EClass getDefine();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.cocktail.scanner.Define#getDefines <em>Defines</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Defines</em>'.
   * @see org.xtext.cocktail.scanner.Define#getDefines()
   * @see #getDefine()
   * @generated
   */
  EReference getDefine_Defines();

  /**
   * Returns the meta object for class '{@link org.xtext.cocktail.scanner.DefineRule <em>Define Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Define Rule</em>'.
   * @see org.xtext.cocktail.scanner.DefineRule
   * @generated
   */
  EClass getDefineRule();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.cocktail.scanner.DefineRule#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.cocktail.scanner.DefineRule#getName()
   * @see #getDefineRule()
   * @generated
   */
  EAttribute getDefineRule_Name();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.cocktail.scanner.DefineRule#getRule <em>Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Rule</em>'.
   * @see org.xtext.cocktail.scanner.DefineRule#getRule()
   * @see #getDefineRule()
   * @generated
   */
  EAttribute getDefineRule_Rule();

  /**
   * Returns the meta object for class '{@link org.xtext.cocktail.scanner.StartStates <em>Start States</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Start States</em>'.
   * @see org.xtext.cocktail.scanner.StartStates
   * @generated
   */
  EClass getStartStates();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.cocktail.scanner.StartStates#getIncstates <em>Incstates</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Incstates</em>'.
   * @see org.xtext.cocktail.scanner.StartStates#getIncstates()
   * @see #getStartStates()
   * @generated
   */
  EReference getStartStates_Incstates();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.cocktail.scanner.StartStates#getExstates <em>Exstates</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Exstates</em>'.
   * @see org.xtext.cocktail.scanner.StartStates#getExstates()
   * @see #getStartStates()
   * @generated
   */
  EReference getStartStates_Exstates();

  /**
   * Returns the meta object for class '{@link org.xtext.cocktail.scanner.StartState <em>Start State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Start State</em>'.
   * @see org.xtext.cocktail.scanner.StartState
   * @generated
   */
  EClass getStartState();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.cocktail.scanner.StartState#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.cocktail.scanner.StartState#getName()
   * @see #getStartState()
   * @generated
   */
  EAttribute getStartState_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.cocktail.scanner.Rule <em>Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rule</em>'.
   * @see org.xtext.cocktail.scanner.Rule
   * @generated
   */
  EClass getRule();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.cocktail.scanner.Rule#getInfo <em>Info</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Info</em>'.
   * @see org.xtext.cocktail.scanner.Rule#getInfo()
   * @see #getRule()
   * @generated
   */
  EAttribute getRule_Info();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.cocktail.scanner.Rule#getRules <em>Rules</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Rules</em>'.
   * @see org.xtext.cocktail.scanner.Rule#getRules()
   * @see #getRule()
   * @generated
   */
  EReference getRule_Rules();

  /**
   * Returns the meta object for class '{@link org.xtext.cocktail.scanner.SingleRule <em>Single Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Single Rule</em>'.
   * @see org.xtext.cocktail.scanner.SingleRule
   * @generated
   */
  EClass getSingleRule();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.cocktail.scanner.SingleRule#getRule <em>Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Rule</em>'.
   * @see org.xtext.cocktail.scanner.SingleRule#getRule()
   * @see #getSingleRule()
   * @generated
   */
  EAttribute getSingleRule_Rule();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.cocktail.scanner.SingleRule#getContent <em>Content</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Content</em>'.
   * @see org.xtext.cocktail.scanner.SingleRule#getContent()
   * @see #getSingleRule()
   * @generated
   */
  EAttribute getSingleRule_Content();

  /**
   * Returns the meta object for class '{@link org.xtext.cocktail.scanner.RuleStart <em>Rule Start</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rule Start</em>'.
   * @see org.xtext.cocktail.scanner.RuleStart
   * @generated
   */
  EClass getRuleStart();

  /**
   * Returns the meta object for the reference list '{@link org.xtext.cocktail.scanner.RuleStart#getState <em>State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>State</em>'.
   * @see org.xtext.cocktail.scanner.RuleStart#getState()
   * @see #getRuleStart()
   * @generated
   */
  EReference getRuleStart_State();

  /**
   * Returns the meta object for class '{@link org.xtext.cocktail.scanner.ActionStatement <em>Action Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Action Statement</em>'.
   * @see org.xtext.cocktail.scanner.ActionStatement
   * @generated
   */
  EClass getActionStatement();

  /**
   * Returns the meta object for the reference list '{@link org.xtext.cocktail.scanner.ActionStatement#getSt <em>St</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>St</em>'.
   * @see org.xtext.cocktail.scanner.ActionStatement#getSt()
   * @see #getActionStatement()
   * @generated
   */
  EReference getActionStatement_St();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  ScannerFactory getScannerFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.xtext.cocktail.scanner.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.cocktail.scanner.impl.ModelImpl
     * @see org.xtext.cocktail.scanner.impl.ScannerPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Scanner</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__SCANNER = eINSTANCE.getModel_Scanner();

    /**
     * The meta object literal for the '{@link org.xtext.cocktail.scanner.impl.ScannerImpl <em>Scanner</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.cocktail.scanner.impl.ScannerImpl
     * @see org.xtext.cocktail.scanner.impl.ScannerPackageImpl#getScanner()
     * @generated
     */
    EClass SCANNER = eINSTANCE.getScanner();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SCANNER__NAME = eINSTANCE.getScanner_Name();

    /**
     * The meta object literal for the '{@link org.xtext.cocktail.scanner.impl.ExportImpl <em>Export</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.cocktail.scanner.impl.ExportImpl
     * @see org.xtext.cocktail.scanner.impl.ScannerPackageImpl#getExport()
     * @generated
     */
    EClass EXPORT = eINSTANCE.getExport();

    /**
     * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPORT__CONTENT = eINSTANCE.getExport_Content();

    /**
     * The meta object literal for the '{@link org.xtext.cocktail.scanner.impl.GlobalImpl <em>Global</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.cocktail.scanner.impl.GlobalImpl
     * @see org.xtext.cocktail.scanner.impl.ScannerPackageImpl#getGlobal()
     * @generated
     */
    EClass GLOBAL = eINSTANCE.getGlobal();

    /**
     * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GLOBAL__CONTENT = eINSTANCE.getGlobal_Content();

    /**
     * The meta object literal for the '{@link org.xtext.cocktail.scanner.impl.LocalImpl <em>Local</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.cocktail.scanner.impl.LocalImpl
     * @see org.xtext.cocktail.scanner.impl.ScannerPackageImpl#getLocal()
     * @generated
     */
    EClass LOCAL = eINSTANCE.getLocal();

    /**
     * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOCAL__CONTENT = eINSTANCE.getLocal_Content();

    /**
     * The meta object literal for the '{@link org.xtext.cocktail.scanner.impl.DefaultImpl <em>Default</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.cocktail.scanner.impl.DefaultImpl
     * @see org.xtext.cocktail.scanner.impl.ScannerPackageImpl#getDefault()
     * @generated
     */
    EClass DEFAULT = eINSTANCE.getDefault();

    /**
     * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEFAULT__CONTENT = eINSTANCE.getDefault_Content();

    /**
     * The meta object literal for the '{@link org.xtext.cocktail.scanner.impl.EofImpl <em>Eof</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.cocktail.scanner.impl.EofImpl
     * @see org.xtext.cocktail.scanner.impl.ScannerPackageImpl#getEof()
     * @generated
     */
    EClass EOF = eINSTANCE.getEof();

    /**
     * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EOF__CONTENT = eINSTANCE.getEof_Content();

    /**
     * The meta object literal for the '{@link org.xtext.cocktail.scanner.impl.DefineImpl <em>Define</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.cocktail.scanner.impl.DefineImpl
     * @see org.xtext.cocktail.scanner.impl.ScannerPackageImpl#getDefine()
     * @generated
     */
    EClass DEFINE = eINSTANCE.getDefine();

    /**
     * The meta object literal for the '<em><b>Defines</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEFINE__DEFINES = eINSTANCE.getDefine_Defines();

    /**
     * The meta object literal for the '{@link org.xtext.cocktail.scanner.impl.DefineRuleImpl <em>Define Rule</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.cocktail.scanner.impl.DefineRuleImpl
     * @see org.xtext.cocktail.scanner.impl.ScannerPackageImpl#getDefineRule()
     * @generated
     */
    EClass DEFINE_RULE = eINSTANCE.getDefineRule();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEFINE_RULE__NAME = eINSTANCE.getDefineRule_Name();

    /**
     * The meta object literal for the '<em><b>Rule</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEFINE_RULE__RULE = eINSTANCE.getDefineRule_Rule();

    /**
     * The meta object literal for the '{@link org.xtext.cocktail.scanner.impl.StartStatesImpl <em>Start States</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.cocktail.scanner.impl.StartStatesImpl
     * @see org.xtext.cocktail.scanner.impl.ScannerPackageImpl#getStartStates()
     * @generated
     */
    EClass START_STATES = eINSTANCE.getStartStates();

    /**
     * The meta object literal for the '<em><b>Incstates</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference START_STATES__INCSTATES = eINSTANCE.getStartStates_Incstates();

    /**
     * The meta object literal for the '<em><b>Exstates</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference START_STATES__EXSTATES = eINSTANCE.getStartStates_Exstates();

    /**
     * The meta object literal for the '{@link org.xtext.cocktail.scanner.impl.StartStateImpl <em>Start State</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.cocktail.scanner.impl.StartStateImpl
     * @see org.xtext.cocktail.scanner.impl.ScannerPackageImpl#getStartState()
     * @generated
     */
    EClass START_STATE = eINSTANCE.getStartState();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute START_STATE__NAME = eINSTANCE.getStartState_Name();

    /**
     * The meta object literal for the '{@link org.xtext.cocktail.scanner.impl.RuleImpl <em>Rule</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.cocktail.scanner.impl.RuleImpl
     * @see org.xtext.cocktail.scanner.impl.ScannerPackageImpl#getRule()
     * @generated
     */
    EClass RULE = eINSTANCE.getRule();

    /**
     * The meta object literal for the '<em><b>Info</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RULE__INFO = eINSTANCE.getRule_Info();

    /**
     * The meta object literal for the '<em><b>Rules</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RULE__RULES = eINSTANCE.getRule_Rules();

    /**
     * The meta object literal for the '{@link org.xtext.cocktail.scanner.impl.SingleRuleImpl <em>Single Rule</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.cocktail.scanner.impl.SingleRuleImpl
     * @see org.xtext.cocktail.scanner.impl.ScannerPackageImpl#getSingleRule()
     * @generated
     */
    EClass SINGLE_RULE = eINSTANCE.getSingleRule();

    /**
     * The meta object literal for the '<em><b>Rule</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SINGLE_RULE__RULE = eINSTANCE.getSingleRule_Rule();

    /**
     * The meta object literal for the '<em><b>Content</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SINGLE_RULE__CONTENT = eINSTANCE.getSingleRule_Content();

    /**
     * The meta object literal for the '{@link org.xtext.cocktail.scanner.impl.RuleStartImpl <em>Rule Start</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.cocktail.scanner.impl.RuleStartImpl
     * @see org.xtext.cocktail.scanner.impl.ScannerPackageImpl#getRuleStart()
     * @generated
     */
    EClass RULE_START = eINSTANCE.getRuleStart();

    /**
     * The meta object literal for the '<em><b>State</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RULE_START__STATE = eINSTANCE.getRuleStart_State();

    /**
     * The meta object literal for the '{@link org.xtext.cocktail.scanner.impl.ActionStatementImpl <em>Action Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.cocktail.scanner.impl.ActionStatementImpl
     * @see org.xtext.cocktail.scanner.impl.ScannerPackageImpl#getActionStatement()
     * @generated
     */
    EClass ACTION_STATEMENT = eINSTANCE.getActionStatement();

    /**
     * The meta object literal for the '<em><b>St</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTION_STATEMENT__ST = eINSTANCE.getActionStatement_St();

  }

} //ScannerPackage
