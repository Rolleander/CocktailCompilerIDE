/**
 * generated by Xtext 2.9.2
 */
package de.roma.cocktail.xtext.lpp;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.roma.cocktail.xtext.lpp.LppPackage
 * @generated
 */
public interface LppFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  LppFactory eINSTANCE = de.roma.cocktail.xtext.lpp.impl.LppFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Parser</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Parser</em>'.
   * @generated
   */
  Parser createParser();

  /**
   * Returns a new object of class '<em>Scanner Name</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Scanner Name</em>'.
   * @generated
   */
  ScannerName createScannerName();

  /**
   * Returns a new object of class '<em>Parser Name</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Parser Name</em>'.
   * @generated
   */
  ParserName createParserName();

  /**
   * Returns a new object of class '<em>Import</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Import</em>'.
   * @generated
   */
  Import createImport();

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
   * Returns a new object of class '<em>Token Extra</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Token Extra</em>'.
   * @generated
   */
  TokenExtra createTokenExtra();

  /**
   * Returns a new object of class '<em>Code Block</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Code Block</em>'.
   * @generated
   */
  CodeBlock createCodeBlock();

  /**
   * Returns a new object of class '<em>Precedence</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Precedence</em>'.
   * @generated
   */
  Precedence createPrecedence();

  /**
   * Returns a new object of class '<em>Precedence Row</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Precedence Row</em>'.
   * @generated
   */
  PrecedenceRow createPrecedenceRow();

  /**
   * Returns a new object of class '<em>Start Symbols</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Start Symbols</em>'.
   * @generated
   */
  StartSymbols createStartSymbols();

  /**
   * Returns a new object of class '<em>Start State</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Start State</em>'.
   * @generated
   */
  StartState createStartState();

  /**
   * Returns a new object of class '<em>Grammar Rules</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Grammar Rules</em>'.
   * @generated
   */
  GrammarRules createGrammarRules();

  /**
   * Returns a new object of class '<em>Grammar Rule</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Grammar Rule</em>'.
   * @generated
   */
  GrammarRule createGrammarRule();

  /**
   * Returns a new object of class '<em>Extension Rule</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Extension Rule</em>'.
   * @generated
   */
  ExtensionRule createExtensionRule();

  /**
   * Returns a new object of class '<em>Extensions</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Extensions</em>'.
   * @generated
   */
  Extensions createExtensions();

  /**
   * Returns a new object of class '<em>Node Part</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Node Part</em>'.
   * @generated
   */
  NodePart createNodePart();

  /**
   * Returns a new object of class '<em>Node</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Node</em>'.
   * @generated
   */
  Node createNode();

  /**
   * Returns a new object of class '<em>Node Attribute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Node Attribute</em>'.
   * @generated
   */
  NodeAttribute createNodeAttribute();

  /**
   * Returns a new object of class '<em>Rule Name</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Rule Name</em>'.
   * @generated
   */
  RuleName createRuleName();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  LppPackage getLppPackage();

} //LppFactory
