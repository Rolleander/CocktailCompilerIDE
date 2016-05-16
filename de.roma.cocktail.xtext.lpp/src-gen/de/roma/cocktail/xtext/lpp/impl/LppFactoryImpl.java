/**
 * generated by Xtext 2.9.1
 */
package de.roma.cocktail.xtext.lpp.impl;

import de.roma.cocktail.xtext.lpp.*;

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
public class LppFactoryImpl extends EFactoryImpl implements LppFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static LppFactory init()
  {
    try
    {
      LppFactory theLppFactory = (LppFactory)EPackage.Registry.INSTANCE.getEFactory(LppPackage.eNS_URI);
      if (theLppFactory != null)
      {
        return theLppFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new LppFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LppFactoryImpl()
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
      case LppPackage.PARSER: return createParser();
      case LppPackage.SCANNER_NAME: return createScannerName();
      case LppPackage.PARSER_NAME: return createParserName();
      case LppPackage.IMPORT: return createImport();
      case LppPackage.EXPORT: return createExport();
      case LppPackage.GLOBAL: return createGlobal();
      case LppPackage.LOCAL: return createLocal();
      case LppPackage.BEGIN: return createBegin();
      case LppPackage.CLOSE: return createClose();
      case LppPackage.TOKEN_EXTRA: return createTokenExtra();
      case LppPackage.CODE_BLOCK: return createCodeBlock();
      case LppPackage.PRECEDENCE: return createPrecedence();
      case LppPackage.PRECEDENCE_ROW: return createPrecedenceRow();
      case LppPackage.START_SYMBOLS: return createStartSymbols();
      case LppPackage.START_STATE: return createStartState();
      case LppPackage.GRAMMAR_RULES: return createGrammarRules();
      case LppPackage.GRAMMAR_RULE: return createGrammarRule();
      case LppPackage.EXTENSION_RULE: return createExtensionRule();
      case LppPackage.RULE_BODY: return createRuleBody();
      case LppPackage.EXTENSIONS: return createExtensions();
      case LppPackage.NODE_PART: return createNodePart();
      case LppPackage.NODE: return createNode();
      case LppPackage.NODE_ATTRIBUTE: return createNodeAttribute();
      case LppPackage.RULE_NAME: return createRuleName();
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
      case LppPackage.PRECEDENCE_TYPE:
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
      case LppPackage.PRECEDENCE_TYPE:
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
  public Parser createParser()
  {
    ParserImpl parser = new ParserImpl();
    return parser;
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
  public CodeBlock createCodeBlock()
  {
    CodeBlockImpl codeBlock = new CodeBlockImpl();
    return codeBlock;
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
  public ExtensionRule createExtensionRule()
  {
    ExtensionRuleImpl extensionRule = new ExtensionRuleImpl();
    return extensionRule;
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
  public Extensions createExtensions()
  {
    ExtensionsImpl extensions = new ExtensionsImpl();
    return extensions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NodePart createNodePart()
  {
    NodePartImpl nodePart = new NodePartImpl();
    return nodePart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Node createNode()
  {
    NodeImpl node = new NodeImpl();
    return node;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NodeAttribute createNodeAttribute()
  {
    NodeAttributeImpl nodeAttribute = new NodeAttributeImpl();
    return nodeAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RuleName createRuleName()
  {
    RuleNameImpl ruleName = new RuleNameImpl();
    return ruleName;
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
  public LppPackage getLppPackage()
  {
    return (LppPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static LppPackage getPackage()
  {
    return LppPackage.eINSTANCE;
  }

} //LppFactoryImpl
