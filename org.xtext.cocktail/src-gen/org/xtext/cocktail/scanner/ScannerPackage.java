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
   * The meta object id for the '{@link org.xtext.cocktail.scanner.impl.TitleImpl <em>Title</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.cocktail.scanner.impl.TitleImpl
   * @see org.xtext.cocktail.scanner.impl.ScannerPackageImpl#getTitle()
   * @generated
   */
  int TITLE = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TITLE__NAME = 0;

  /**
   * The number of structural features of the '<em>Title</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TITLE_FEATURE_COUNT = 1;

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
   * The feature id for the '<em><b>Define Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINE_RULE__DEFINE_NAME = 0;

  /**
   * The feature id for the '<em><b>Define Rule</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINE_RULE__DEFINE_RULE = 1;

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
   * The feature id for the '<em><b>States</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int START_STATES__STATES = 0;

  /**
   * The number of structural features of the '<em>Start States</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int START_STATES_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.cocktail.scanner.impl.RuleImpl <em>Rule</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.cocktail.scanner.impl.RuleImpl
   * @see org.xtext.cocktail.scanner.impl.ScannerPackageImpl#getRule()
   * @generated
   */
  int RULE = 10;

  /**
   * The feature id for the '<em><b>Content</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE__CONTENT = 0;

  /**
   * The number of structural features of the '<em>Rule</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.cocktail.scanner.impl.RegularExpressionImpl <em>Regular Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.cocktail.scanner.impl.RegularExpressionImpl
   * @see org.xtext.cocktail.scanner.impl.ScannerPackageImpl#getRegularExpression()
   * @generated
   */
  int REGULAR_EXPRESSION = 11;

  /**
   * The number of structural features of the '<em>Regular Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGULAR_EXPRESSION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.cocktail.scanner.impl.OrExpressionImpl <em>Or Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.cocktail.scanner.impl.OrExpressionImpl
   * @see org.xtext.cocktail.scanner.impl.ScannerPackageImpl#getOrExpression()
   * @generated
   */
  int OR_EXPRESSION = 12;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_EXPRESSION__LEFT = REGULAR_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_EXPRESSION__RIGHT = REGULAR_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Or Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_EXPRESSION_FEATURE_COUNT = REGULAR_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.cocktail.scanner.impl.SequenceExpressionImpl <em>Sequence Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.cocktail.scanner.impl.SequenceExpressionImpl
   * @see org.xtext.cocktail.scanner.impl.ScannerPackageImpl#getSequenceExpression()
   * @generated
   */
  int SEQUENCE_EXPRESSION = 13;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE_EXPRESSION__LEFT = OR_EXPRESSION__LEFT;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE_EXPRESSION__RIGHT = OR_EXPRESSION__RIGHT;

  /**
   * The number of structural features of the '<em>Sequence Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE_EXPRESSION_FEATURE_COUNT = OR_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.cocktail.scanner.impl.HighBindExpressionImpl <em>High Bind Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.cocktail.scanner.impl.HighBindExpressionImpl
   * @see org.xtext.cocktail.scanner.impl.ScannerPackageImpl#getHighBindExpression()
   * @generated
   */
  int HIGH_BIND_EXPRESSION = 14;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HIGH_BIND_EXPRESSION__LEFT = SEQUENCE_EXPRESSION__LEFT;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HIGH_BIND_EXPRESSION__RIGHT = SEQUENCE_EXPRESSION__RIGHT;

  /**
   * The number of structural features of the '<em>High Bind Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HIGH_BIND_EXPRESSION_FEATURE_COUNT = SEQUENCE_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.cocktail.scanner.impl.AtomicExpressionImpl <em>Atomic Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.cocktail.scanner.impl.AtomicExpressionImpl
   * @see org.xtext.cocktail.scanner.impl.ScannerPackageImpl#getAtomicExpression()
   * @generated
   */
  int ATOMIC_EXPRESSION = 15;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATOMIC_EXPRESSION__LEFT = HIGH_BIND_EXPRESSION__LEFT;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATOMIC_EXPRESSION__RIGHT = HIGH_BIND_EXPRESSION__RIGHT;

  /**
   * The number of structural features of the '<em>Atomic Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATOMIC_EXPRESSION_FEATURE_COUNT = HIGH_BIND_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.cocktail.scanner.impl.BracedExpressionImpl <em>Braced Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.cocktail.scanner.impl.BracedExpressionImpl
   * @see org.xtext.cocktail.scanner.impl.ScannerPackageImpl#getBracedExpression()
   * @generated
   */
  int BRACED_EXPRESSION = 16;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BRACED_EXPRESSION__LEFT = ATOMIC_EXPRESSION__LEFT;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BRACED_EXPRESSION__RIGHT = ATOMIC_EXPRESSION__RIGHT;

  /**
   * The feature id for the '<em><b>Inner Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BRACED_EXPRESSION__INNER_EXPRESSION = ATOMIC_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Braced Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BRACED_EXPRESSION_FEATURE_COUNT = ATOMIC_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.cocktail.scanner.impl.AtomImpl <em>Atom</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.cocktail.scanner.impl.AtomImpl
   * @see org.xtext.cocktail.scanner.impl.ScannerPackageImpl#getAtom()
   * @generated
   */
  int ATOM = 17;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATOM__LEFT = ATOMIC_EXPRESSION__LEFT;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATOM__RIGHT = ATOMIC_EXPRESSION__RIGHT;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATOM__VALUE = ATOMIC_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Atom</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATOM_FEATURE_COUNT = ATOMIC_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.cocktail.scanner.impl.StarExpressionImpl <em>Star Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.cocktail.scanner.impl.StarExpressionImpl
   * @see org.xtext.cocktail.scanner.impl.ScannerPackageImpl#getStarExpression()
   * @generated
   */
  int STAR_EXPRESSION = 18;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STAR_EXPRESSION__LEFT = HIGH_BIND_EXPRESSION__LEFT;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STAR_EXPRESSION__RIGHT = HIGH_BIND_EXPRESSION__RIGHT;

  /**
   * The feature id for the '<em><b>Inner Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STAR_EXPRESSION__INNER_EXPRESSION = HIGH_BIND_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Star Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STAR_EXPRESSION_FEATURE_COUNT = HIGH_BIND_EXPRESSION_FEATURE_COUNT + 1;


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
   * Returns the meta object for class '{@link org.xtext.cocktail.scanner.Title <em>Title</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Title</em>'.
   * @see org.xtext.cocktail.scanner.Title
   * @generated
   */
  EClass getTitle();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.cocktail.scanner.Title#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.cocktail.scanner.Title#getName()
   * @see #getTitle()
   * @generated
   */
  EAttribute getTitle_Name();

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
   * Returns the meta object for the attribute '{@link org.xtext.cocktail.scanner.DefineRule#getDefineName <em>Define Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Define Name</em>'.
   * @see org.xtext.cocktail.scanner.DefineRule#getDefineName()
   * @see #getDefineRule()
   * @generated
   */
  EAttribute getDefineRule_DefineName();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.cocktail.scanner.DefineRule#getDefineRule <em>Define Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Define Rule</em>'.
   * @see org.xtext.cocktail.scanner.DefineRule#getDefineRule()
   * @see #getDefineRule()
   * @generated
   */
  EAttribute getDefineRule_DefineRule();

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
   * Returns the meta object for the attribute list '{@link org.xtext.cocktail.scanner.StartStates#getStates <em>States</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>States</em>'.
   * @see org.xtext.cocktail.scanner.StartStates#getStates()
   * @see #getStartStates()
   * @generated
   */
  EAttribute getStartStates_States();

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
   * Returns the meta object for the attribute '{@link org.xtext.cocktail.scanner.Rule#getContent <em>Content</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Content</em>'.
   * @see org.xtext.cocktail.scanner.Rule#getContent()
   * @see #getRule()
   * @generated
   */
  EAttribute getRule_Content();

  /**
   * Returns the meta object for class '{@link org.xtext.cocktail.scanner.RegularExpression <em>Regular Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Regular Expression</em>'.
   * @see org.xtext.cocktail.scanner.RegularExpression
   * @generated
   */
  EClass getRegularExpression();

  /**
   * Returns the meta object for class '{@link org.xtext.cocktail.scanner.OrExpression <em>Or Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Or Expression</em>'.
   * @see org.xtext.cocktail.scanner.OrExpression
   * @generated
   */
  EClass getOrExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.cocktail.scanner.OrExpression#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.xtext.cocktail.scanner.OrExpression#getLeft()
   * @see #getOrExpression()
   * @generated
   */
  EReference getOrExpression_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.cocktail.scanner.OrExpression#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.xtext.cocktail.scanner.OrExpression#getRight()
   * @see #getOrExpression()
   * @generated
   */
  EReference getOrExpression_Right();

  /**
   * Returns the meta object for class '{@link org.xtext.cocktail.scanner.SequenceExpression <em>Sequence Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sequence Expression</em>'.
   * @see org.xtext.cocktail.scanner.SequenceExpression
   * @generated
   */
  EClass getSequenceExpression();

  /**
   * Returns the meta object for class '{@link org.xtext.cocktail.scanner.HighBindExpression <em>High Bind Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>High Bind Expression</em>'.
   * @see org.xtext.cocktail.scanner.HighBindExpression
   * @generated
   */
  EClass getHighBindExpression();

  /**
   * Returns the meta object for class '{@link org.xtext.cocktail.scanner.AtomicExpression <em>Atomic Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Atomic Expression</em>'.
   * @see org.xtext.cocktail.scanner.AtomicExpression
   * @generated
   */
  EClass getAtomicExpression();

  /**
   * Returns the meta object for class '{@link org.xtext.cocktail.scanner.BracedExpression <em>Braced Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Braced Expression</em>'.
   * @see org.xtext.cocktail.scanner.BracedExpression
   * @generated
   */
  EClass getBracedExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.cocktail.scanner.BracedExpression#getInnerExpression <em>Inner Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Inner Expression</em>'.
   * @see org.xtext.cocktail.scanner.BracedExpression#getInnerExpression()
   * @see #getBracedExpression()
   * @generated
   */
  EReference getBracedExpression_InnerExpression();

  /**
   * Returns the meta object for class '{@link org.xtext.cocktail.scanner.Atom <em>Atom</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Atom</em>'.
   * @see org.xtext.cocktail.scanner.Atom
   * @generated
   */
  EClass getAtom();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.cocktail.scanner.Atom#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.xtext.cocktail.scanner.Atom#getValue()
   * @see #getAtom()
   * @generated
   */
  EAttribute getAtom_Value();

  /**
   * Returns the meta object for class '{@link org.xtext.cocktail.scanner.StarExpression <em>Star Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Star Expression</em>'.
   * @see org.xtext.cocktail.scanner.StarExpression
   * @generated
   */
  EClass getStarExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.cocktail.scanner.StarExpression#getInnerExpression <em>Inner Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Inner Expression</em>'.
   * @see org.xtext.cocktail.scanner.StarExpression#getInnerExpression()
   * @see #getStarExpression()
   * @generated
   */
  EReference getStarExpression_InnerExpression();

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
     * The meta object literal for the '{@link org.xtext.cocktail.scanner.impl.TitleImpl <em>Title</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.cocktail.scanner.impl.TitleImpl
     * @see org.xtext.cocktail.scanner.impl.ScannerPackageImpl#getTitle()
     * @generated
     */
    EClass TITLE = eINSTANCE.getTitle();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TITLE__NAME = eINSTANCE.getTitle_Name();

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
     * The meta object literal for the '<em><b>Define Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEFINE_RULE__DEFINE_NAME = eINSTANCE.getDefineRule_DefineName();

    /**
     * The meta object literal for the '<em><b>Define Rule</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEFINE_RULE__DEFINE_RULE = eINSTANCE.getDefineRule_DefineRule();

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
     * The meta object literal for the '<em><b>States</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute START_STATES__STATES = eINSTANCE.getStartStates_States();

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
     * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RULE__CONTENT = eINSTANCE.getRule_Content();

    /**
     * The meta object literal for the '{@link org.xtext.cocktail.scanner.impl.RegularExpressionImpl <em>Regular Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.cocktail.scanner.impl.RegularExpressionImpl
     * @see org.xtext.cocktail.scanner.impl.ScannerPackageImpl#getRegularExpression()
     * @generated
     */
    EClass REGULAR_EXPRESSION = eINSTANCE.getRegularExpression();

    /**
     * The meta object literal for the '{@link org.xtext.cocktail.scanner.impl.OrExpressionImpl <em>Or Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.cocktail.scanner.impl.OrExpressionImpl
     * @see org.xtext.cocktail.scanner.impl.ScannerPackageImpl#getOrExpression()
     * @generated
     */
    EClass OR_EXPRESSION = eINSTANCE.getOrExpression();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OR_EXPRESSION__LEFT = eINSTANCE.getOrExpression_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OR_EXPRESSION__RIGHT = eINSTANCE.getOrExpression_Right();

    /**
     * The meta object literal for the '{@link org.xtext.cocktail.scanner.impl.SequenceExpressionImpl <em>Sequence Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.cocktail.scanner.impl.SequenceExpressionImpl
     * @see org.xtext.cocktail.scanner.impl.ScannerPackageImpl#getSequenceExpression()
     * @generated
     */
    EClass SEQUENCE_EXPRESSION = eINSTANCE.getSequenceExpression();

    /**
     * The meta object literal for the '{@link org.xtext.cocktail.scanner.impl.HighBindExpressionImpl <em>High Bind Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.cocktail.scanner.impl.HighBindExpressionImpl
     * @see org.xtext.cocktail.scanner.impl.ScannerPackageImpl#getHighBindExpression()
     * @generated
     */
    EClass HIGH_BIND_EXPRESSION = eINSTANCE.getHighBindExpression();

    /**
     * The meta object literal for the '{@link org.xtext.cocktail.scanner.impl.AtomicExpressionImpl <em>Atomic Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.cocktail.scanner.impl.AtomicExpressionImpl
     * @see org.xtext.cocktail.scanner.impl.ScannerPackageImpl#getAtomicExpression()
     * @generated
     */
    EClass ATOMIC_EXPRESSION = eINSTANCE.getAtomicExpression();

    /**
     * The meta object literal for the '{@link org.xtext.cocktail.scanner.impl.BracedExpressionImpl <em>Braced Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.cocktail.scanner.impl.BracedExpressionImpl
     * @see org.xtext.cocktail.scanner.impl.ScannerPackageImpl#getBracedExpression()
     * @generated
     */
    EClass BRACED_EXPRESSION = eINSTANCE.getBracedExpression();

    /**
     * The meta object literal for the '<em><b>Inner Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BRACED_EXPRESSION__INNER_EXPRESSION = eINSTANCE.getBracedExpression_InnerExpression();

    /**
     * The meta object literal for the '{@link org.xtext.cocktail.scanner.impl.AtomImpl <em>Atom</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.cocktail.scanner.impl.AtomImpl
     * @see org.xtext.cocktail.scanner.impl.ScannerPackageImpl#getAtom()
     * @generated
     */
    EClass ATOM = eINSTANCE.getAtom();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATOM__VALUE = eINSTANCE.getAtom_Value();

    /**
     * The meta object literal for the '{@link org.xtext.cocktail.scanner.impl.StarExpressionImpl <em>Star Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.cocktail.scanner.impl.StarExpressionImpl
     * @see org.xtext.cocktail.scanner.impl.ScannerPackageImpl#getStarExpression()
     * @generated
     */
    EClass STAR_EXPRESSION = eINSTANCE.getStarExpression();

    /**
     * The meta object literal for the '<em><b>Inner Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STAR_EXPRESSION__INNER_EXPRESSION = eINSTANCE.getStarExpression_InnerExpression();

  }

} //ScannerPackage
