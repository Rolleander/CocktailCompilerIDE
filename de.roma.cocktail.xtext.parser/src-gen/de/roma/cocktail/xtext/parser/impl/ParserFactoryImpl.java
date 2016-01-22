/**
 * generated by Xtext 2.9.1
 */
package de.roma.cocktail.xtext.parser.impl;

import de.roma.cocktail.xtext.parser.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ParserFactoryImpl extends EFactoryImpl implements ParserFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ParserFactory init()
  {
    try
    {
      ParserFactory theParserFactory = (ParserFactory)EPackage.Registry.INSTANCE.getEFactory(ParserPackage.eNS_URI);
      if (theParserFactory != null)
      {
        return theParserFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new ParserFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParserFactoryImpl()
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
      case ParserPackage.PARSER_MODEL: return createParserModel();
      case ParserPackage.SCANNER_NAME: return createScannerName();
      case ParserPackage.PARSER_NAME: return createParserName();
      case ParserPackage.IMPORT: return createImport();
      case ParserPackage.EXPORT: return createExport();
      case ParserPackage.GLOBAL: return createGlobal();
      case ParserPackage.LOCAL: return createLocal();
      case ParserPackage.BEGIN: return createBegin();
      case ParserPackage.CLOSE: return createClose();
      case ParserPackage.TOKENS: return createTokens();
      case ParserPackage.DEFINED_TOKEN: return createDefinedToken();
      case ParserPackage.TOKEN_EXTRA: return createTokenExtra();
      case ParserPackage.PRECEDENCE: return createPrecedence();
      case ParserPackage.PRECEDENCE_ROW: return createPrecedenceRow();
      case ParserPackage.START_SYMBOLS: return createStartSymbols();
      case ParserPackage.START_STATE: return createStartState();
      case ParserPackage.GRAMMAR_RULES: return createGrammarRules();
      case ParserPackage.GRAMMER_REFERENCE: return createGrammerReference();
      case ParserPackage.GRAMMAR_RULE: return createGrammarRule();
      case ParserPackage.RULE_BODY: return createRuleBody();
      case ParserPackage.RULE_CONTENT: return createRuleContent();
      case ParserPackage.RULE_PART: return createRulePart();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case ParserPackage.PRECEDENCE_TYPE:
        return createPrecedenceTypeFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case ParserPackage.PRECEDENCE_TYPE:
        return convertPrecedenceTypeToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParserModel createParserModel()
  {
    ParserModelImpl parserModel = new ParserModelImpl();
    return parserModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ScannerName createScannerName()
  {
    ScannerNameImpl scannerName = new ScannerNameImpl();
    return scannerName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParserName createParserName()
  {
    ParserNameImpl parserName = new ParserNameImpl();
    return parserName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Import createImport()
  {
    ImportImpl import_ = new ImportImpl();
    return import_;
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
  public Begin createBegin()
  {
    BeginImpl begin = new BeginImpl();
    return begin;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Close createClose()
  {
    CloseImpl close = new CloseImpl();
    return close;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Tokens createTokens()
  {
    TokensImpl tokens = new TokensImpl();
    return tokens;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DefinedToken createDefinedToken()
  {
    DefinedTokenImpl definedToken = new DefinedTokenImpl();
    return definedToken;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TokenExtra createTokenExtra()
  {
    TokenExtraImpl tokenExtra = new TokenExtraImpl();
    return tokenExtra;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Precedence createPrecedence()
  {
    PrecedenceImpl precedence = new PrecedenceImpl();
    return precedence;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PrecedenceRow createPrecedenceRow()
  {
    PrecedenceRowImpl precedenceRow = new PrecedenceRowImpl();
    return precedenceRow;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StartSymbols createStartSymbols()
  {
    StartSymbolsImpl startSymbols = new StartSymbolsImpl();
    return startSymbols;
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
  public GrammarRules createGrammarRules()
  {
    GrammarRulesImpl grammarRules = new GrammarRulesImpl();
    return grammarRules;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GrammerReference createGrammerReference()
  {
    GrammerReferenceImpl grammerReference = new GrammerReferenceImpl();
    return grammerReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GrammarRule createGrammarRule()
  {
    GrammarRuleImpl grammarRule = new GrammarRuleImpl();
    return grammarRule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RuleBody createRuleBody()
  {
    RuleBodyImpl ruleBody = new RuleBodyImpl();
    return ruleBody;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RuleContent createRuleContent()
  {
    RuleContentImpl ruleContent = new RuleContentImpl();
    return ruleContent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RulePart createRulePart()
  {
    RulePartImpl rulePart = new RulePartImpl();
    return rulePart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PrecedenceType createPrecedenceTypeFromString(EDataType eDataType, String initialValue)
  {
    PrecedenceType result = PrecedenceType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertPrecedenceTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParserPackage getParserPackage()
  {
    return (ParserPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static ParserPackage getPackage()
  {
    return ParserPackage.eINSTANCE;
  }

} //ParserFactoryImpl
