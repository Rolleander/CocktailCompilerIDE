/**
 * generated by Xtext 2.9.1
 */
package de.roma.cocktail.xtext.parser.util;

import de.roma.cocktail.xtext.parser.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de.roma.cocktail.xtext.parser.ParserPackage
 * @generated
 */
public class ParserSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static ParserPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParserSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = ParserPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case ParserPackage.PARSER_MODEL:
      {
        ParserModel parserModel = (ParserModel)theEObject;
        T result = caseParserModel(parserModel);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ParserPackage.SCANNER_NAME:
      {
        ScannerName scannerName = (ScannerName)theEObject;
        T result = caseScannerName(scannerName);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ParserPackage.PARSER_NAME:
      {
        ParserName parserName = (ParserName)theEObject;
        T result = caseParserName(parserName);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ParserPackage.IMPORT:
      {
        Import import_ = (Import)theEObject;
        T result = caseImport(import_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ParserPackage.EXPORT:
      {
        Export export = (Export)theEObject;
        T result = caseExport(export);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ParserPackage.GLOBAL:
      {
        Global global = (Global)theEObject;
        T result = caseGlobal(global);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ParserPackage.LOCAL:
      {
        Local local = (Local)theEObject;
        T result = caseLocal(local);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ParserPackage.BEGIN:
      {
        Begin begin = (Begin)theEObject;
        T result = caseBegin(begin);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ParserPackage.CLOSE:
      {
        Close close = (Close)theEObject;
        T result = caseClose(close);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ParserPackage.TOKENS:
      {
        Tokens tokens = (Tokens)theEObject;
        T result = caseTokens(tokens);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ParserPackage.DEFINED_TOKEN:
      {
        DefinedToken definedToken = (DefinedToken)theEObject;
        T result = caseDefinedToken(definedToken);
        if (result == null) result = caseGrammerReference(definedToken);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ParserPackage.TOKEN_EXTRA:
      {
        TokenExtra tokenExtra = (TokenExtra)theEObject;
        T result = caseTokenExtra(tokenExtra);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ParserPackage.PRECEDENCE:
      {
        Precedence precedence = (Precedence)theEObject;
        T result = casePrecedence(precedence);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ParserPackage.PRECEDENCE_ROW:
      {
        PrecedenceRow precedenceRow = (PrecedenceRow)theEObject;
        T result = casePrecedenceRow(precedenceRow);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ParserPackage.START_SYMBOLS:
      {
        StartSymbols startSymbols = (StartSymbols)theEObject;
        T result = caseStartSymbols(startSymbols);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ParserPackage.START_STATE:
      {
        StartState startState = (StartState)theEObject;
        T result = caseStartState(startState);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ParserPackage.GRAMMAR_RULES:
      {
        GrammarRules grammarRules = (GrammarRules)theEObject;
        T result = caseGrammarRules(grammarRules);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ParserPackage.GRAMMER_REFERENCE:
      {
        GrammerReference grammerReference = (GrammerReference)theEObject;
        T result = caseGrammerReference(grammerReference);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ParserPackage.GRAMMAR_RULE:
      {
        GrammarRule grammarRule = (GrammarRule)theEObject;
        T result = caseGrammarRule(grammarRule);
        if (result == null) result = caseGrammerReference(grammarRule);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ParserPackage.RULE_BODY:
      {
        RuleBody ruleBody = (RuleBody)theEObject;
        T result = caseRuleBody(ruleBody);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ParserPackage.RULE_CONTENT:
      {
        RuleContent ruleContent = (RuleContent)theEObject;
        T result = caseRuleContent(ruleContent);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ParserPackage.RULE_PART:
      {
        RulePart rulePart = (RulePart)theEObject;
        T result = caseRulePart(rulePart);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParserModel(ParserModel object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Scanner Name</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Scanner Name</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseScannerName(ScannerName object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Name</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Name</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParserName(ParserName object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Import</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Import</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImport(Import object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Export</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Export</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExport(Export object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Global</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Global</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGlobal(Global object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Local</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Local</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLocal(Local object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Begin</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Begin</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBegin(Begin object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Close</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Close</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseClose(Close object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Tokens</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Tokens</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTokens(Tokens object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Defined Token</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Defined Token</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDefinedToken(DefinedToken object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Token Extra</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Token Extra</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTokenExtra(TokenExtra object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Precedence</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Precedence</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePrecedence(Precedence object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Precedence Row</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Precedence Row</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePrecedenceRow(PrecedenceRow object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Start Symbols</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Start Symbols</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStartSymbols(StartSymbols object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Start State</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Start State</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStartState(StartState object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Grammar Rules</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Grammar Rules</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGrammarRules(GrammarRules object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Grammer Reference</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Grammer Reference</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGrammerReference(GrammerReference object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Grammar Rule</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Grammar Rule</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGrammarRule(GrammarRule object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Rule Body</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rule Body</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRuleBody(RuleBody object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Rule Content</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rule Content</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRuleContent(RuleContent object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Rule Part</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rule Part</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRulePart(RulePart object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //ParserSwitch
