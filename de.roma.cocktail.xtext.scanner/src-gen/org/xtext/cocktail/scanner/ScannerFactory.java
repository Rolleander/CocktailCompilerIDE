/**
 * generated by Xtext 2.9.1
 */
package org.xtext.cocktail.scanner;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.cocktail.scanner.ScannerPackage
 * @generated
 */
public interface ScannerFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ScannerFactory eINSTANCE = org.xtext.cocktail.scanner.impl.ScannerFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  Model createModel();

  /**
   * Returns a new object of class '<em>Scanner</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Scanner</em>'.
   * @generated
   */
  Scanner createScanner();

  /**
   * Returns a new object of class '<em>Export</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Export</em>'.
   * @generated
   */
  Export createExport();

  /**
   * Returns a new object of class '<em>Global</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Global</em>'.
   * @generated
   */
  Global createGlobal();

  /**
   * Returns a new object of class '<em>Local</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Local</em>'.
   * @generated
   */
  Local createLocal();

  /**
   * Returns a new object of class '<em>Default</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Default</em>'.
   * @generated
   */
  Default createDefault();

  /**
   * Returns a new object of class '<em>Eof</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Eof</em>'.
   * @generated
   */
  Eof createEof();

  /**
   * Returns a new object of class '<em>Begin</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Begin</em>'.
   * @generated
   */
  Begin createBegin();

  /**
   * Returns a new object of class '<em>Close</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Close</em>'.
   * @generated
   */
  Close createClose();

  /**
   * Returns a new object of class '<em>Define</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Define</em>'.
   * @generated
   */
  Define createDefine();

  /**
   * Returns a new object of class '<em>Define Rule</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Define Rule</em>'.
   * @generated
   */
  DefineRule createDefineRule();

  /**
   * Returns a new object of class '<em>Start States</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Start States</em>'.
   * @generated
   */
  StartStates createStartStates();

  /**
   * Returns a new object of class '<em>Start State</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Start State</em>'.
   * @generated
   */
  StartState createStartState();

  /**
   * Returns a new object of class '<em>Rule</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Rule</em>'.
   * @generated
   */
  Rule createRule();

  /**
   * Returns a new object of class '<em>Single Rule</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Single Rule</em>'.
   * @generated
   */
  SingleRule createSingleRule();

  /**
   * Returns a new object of class '<em>Rule Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Rule Definition</em>'.
   * @generated
   */
  RuleDefinition createRuleDefinition();

  /**
   * Returns a new object of class '<em>Rule Start</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Rule Start</em>'.
   * @generated
   */
  RuleStart createRuleStart();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  ScannerPackage getScannerPackage();

} //ScannerFactory
