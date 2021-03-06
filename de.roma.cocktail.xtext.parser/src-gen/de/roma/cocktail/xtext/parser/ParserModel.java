/**
 * generated by Xtext 2.9.1
 */
package de.roma.cocktail.xtext.parser;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.roma.cocktail.xtext.parser.ParserModel#getScanner <em>Scanner</em>}</li>
 *   <li>{@link de.roma.cocktail.xtext.parser.ParserModel#getParser <em>Parser</em>}</li>
 *   <li>{@link de.roma.cocktail.xtext.parser.ParserModel#getImportBlock <em>Import Block</em>}</li>
 *   <li>{@link de.roma.cocktail.xtext.parser.ParserModel#getExportBlock <em>Export Block</em>}</li>
 *   <li>{@link de.roma.cocktail.xtext.parser.ParserModel#getGlobalBlock <em>Global Block</em>}</li>
 *   <li>{@link de.roma.cocktail.xtext.parser.ParserModel#getLocalBlock <em>Local Block</em>}</li>
 *   <li>{@link de.roma.cocktail.xtext.parser.ParserModel#getBeginBlock <em>Begin Block</em>}</li>
 *   <li>{@link de.roma.cocktail.xtext.parser.ParserModel#getCloseBlock <em>Close Block</em>}</li>
 *   <li>{@link de.roma.cocktail.xtext.parser.ParserModel#getTokens <em>Tokens</em>}</li>
 *   <li>{@link de.roma.cocktail.xtext.parser.ParserModel#getPrecedenc <em>Precedenc</em>}</li>
 *   <li>{@link de.roma.cocktail.xtext.parser.ParserModel#getStart <em>Start</em>}</li>
 *   <li>{@link de.roma.cocktail.xtext.parser.ParserModel#getRules <em>Rules</em>}</li>
 * </ul>
 *
 * @see de.roma.cocktail.xtext.parser.ParserPackage#getParserModel()
 * @model
 * @generated
 */
public interface ParserModel extends EObject
{
  /**
   * Returns the value of the '<em><b>Scanner</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Scanner</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Scanner</em>' containment reference.
   * @see #setScanner(ScannerName)
   * @see de.roma.cocktail.xtext.parser.ParserPackage#getParserModel_Scanner()
   * @model containment="true"
   * @generated
   */
  ScannerName getScanner();

  /**
   * Sets the value of the '{@link de.roma.cocktail.xtext.parser.ParserModel#getScanner <em>Scanner</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Scanner</em>' containment reference.
   * @see #getScanner()
   * @generated
   */
  void setScanner(ScannerName value);

  /**
   * Returns the value of the '<em><b>Parser</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parser</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parser</em>' containment reference.
   * @see #setParser(ParserName)
   * @see de.roma.cocktail.xtext.parser.ParserPackage#getParserModel_Parser()
   * @model containment="true"
   * @generated
   */
  ParserName getParser();

  /**
   * Sets the value of the '{@link de.roma.cocktail.xtext.parser.ParserModel#getParser <em>Parser</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parser</em>' containment reference.
   * @see #getParser()
   * @generated
   */
  void setParser(ParserName value);

  /**
   * Returns the value of the '<em><b>Import Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Import Block</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Import Block</em>' containment reference.
   * @see #setImportBlock(Import)
   * @see de.roma.cocktail.xtext.parser.ParserPackage#getParserModel_ImportBlock()
   * @model containment="true"
   * @generated
   */
  Import getImportBlock();

  /**
   * Sets the value of the '{@link de.roma.cocktail.xtext.parser.ParserModel#getImportBlock <em>Import Block</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Import Block</em>' containment reference.
   * @see #getImportBlock()
   * @generated
   */
  void setImportBlock(Import value);

  /**
   * Returns the value of the '<em><b>Export Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Export Block</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Export Block</em>' containment reference.
   * @see #setExportBlock(Export)
   * @see de.roma.cocktail.xtext.parser.ParserPackage#getParserModel_ExportBlock()
   * @model containment="true"
   * @generated
   */
  Export getExportBlock();

  /**
   * Sets the value of the '{@link de.roma.cocktail.xtext.parser.ParserModel#getExportBlock <em>Export Block</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Export Block</em>' containment reference.
   * @see #getExportBlock()
   * @generated
   */
  void setExportBlock(Export value);

  /**
   * Returns the value of the '<em><b>Global Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Global Block</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Global Block</em>' containment reference.
   * @see #setGlobalBlock(Global)
   * @see de.roma.cocktail.xtext.parser.ParserPackage#getParserModel_GlobalBlock()
   * @model containment="true"
   * @generated
   */
  Global getGlobalBlock();

  /**
   * Sets the value of the '{@link de.roma.cocktail.xtext.parser.ParserModel#getGlobalBlock <em>Global Block</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Global Block</em>' containment reference.
   * @see #getGlobalBlock()
   * @generated
   */
  void setGlobalBlock(Global value);

  /**
   * Returns the value of the '<em><b>Local Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Local Block</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Local Block</em>' containment reference.
   * @see #setLocalBlock(Local)
   * @see de.roma.cocktail.xtext.parser.ParserPackage#getParserModel_LocalBlock()
   * @model containment="true"
   * @generated
   */
  Local getLocalBlock();

  /**
   * Sets the value of the '{@link de.roma.cocktail.xtext.parser.ParserModel#getLocalBlock <em>Local Block</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Local Block</em>' containment reference.
   * @see #getLocalBlock()
   * @generated
   */
  void setLocalBlock(Local value);

  /**
   * Returns the value of the '<em><b>Begin Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Begin Block</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Begin Block</em>' containment reference.
   * @see #setBeginBlock(Begin)
   * @see de.roma.cocktail.xtext.parser.ParserPackage#getParserModel_BeginBlock()
   * @model containment="true"
   * @generated
   */
  Begin getBeginBlock();

  /**
   * Sets the value of the '{@link de.roma.cocktail.xtext.parser.ParserModel#getBeginBlock <em>Begin Block</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Begin Block</em>' containment reference.
   * @see #getBeginBlock()
   * @generated
   */
  void setBeginBlock(Begin value);

  /**
   * Returns the value of the '<em><b>Close Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Close Block</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Close Block</em>' containment reference.
   * @see #setCloseBlock(Close)
   * @see de.roma.cocktail.xtext.parser.ParserPackage#getParserModel_CloseBlock()
   * @model containment="true"
   * @generated
   */
  Close getCloseBlock();

  /**
   * Sets the value of the '{@link de.roma.cocktail.xtext.parser.ParserModel#getCloseBlock <em>Close Block</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Close Block</em>' containment reference.
   * @see #getCloseBlock()
   * @generated
   */
  void setCloseBlock(Close value);

  /**
   * Returns the value of the '<em><b>Tokens</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tokens</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tokens</em>' containment reference.
   * @see #setTokens(Tokens)
   * @see de.roma.cocktail.xtext.parser.ParserPackage#getParserModel_Tokens()
   * @model containment="true"
   * @generated
   */
  Tokens getTokens();

  /**
   * Sets the value of the '{@link de.roma.cocktail.xtext.parser.ParserModel#getTokens <em>Tokens</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tokens</em>' containment reference.
   * @see #getTokens()
   * @generated
   */
  void setTokens(Tokens value);

  /**
   * Returns the value of the '<em><b>Precedenc</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Precedenc</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Precedenc</em>' containment reference.
   * @see #setPrecedenc(Precedence)
   * @see de.roma.cocktail.xtext.parser.ParserPackage#getParserModel_Precedenc()
   * @model containment="true"
   * @generated
   */
  Precedence getPrecedenc();

  /**
   * Sets the value of the '{@link de.roma.cocktail.xtext.parser.ParserModel#getPrecedenc <em>Precedenc</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Precedenc</em>' containment reference.
   * @see #getPrecedenc()
   * @generated
   */
  void setPrecedenc(Precedence value);

  /**
   * Returns the value of the '<em><b>Start</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Start</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Start</em>' containment reference.
   * @see #setStart(StartSymbols)
   * @see de.roma.cocktail.xtext.parser.ParserPackage#getParserModel_Start()
   * @model containment="true"
   * @generated
   */
  StartSymbols getStart();

  /**
   * Sets the value of the '{@link de.roma.cocktail.xtext.parser.ParserModel#getStart <em>Start</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Start</em>' containment reference.
   * @see #getStart()
   * @generated
   */
  void setStart(StartSymbols value);

  /**
   * Returns the value of the '<em><b>Rules</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rules</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rules</em>' containment reference.
   * @see #setRules(GrammarRules)
   * @see de.roma.cocktail.xtext.parser.ParserPackage#getParserModel_Rules()
   * @model containment="true"
   * @generated
   */
  GrammarRules getRules();

  /**
   * Sets the value of the '{@link de.roma.cocktail.xtext.parser.ParserModel#getRules <em>Rules</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rules</em>' containment reference.
   * @see #getRules()
   * @generated
   */
  void setRules(GrammarRules value);

} // ParserModel
