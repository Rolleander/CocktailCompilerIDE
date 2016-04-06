/**
 * generated by Xtext 2.9.1
 */
package de.roma.cocktail.xtext.lpp.util;

import de.roma.cocktail.xtext.lpp.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.roma.cocktail.xtext.lpp.LppPackage
 * @generated
 */
public class LppAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static LppPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LppAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = LppPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LppSwitch<Adapter> modelSwitch =
    new LppSwitch<Adapter>()
    {
      @Override
      public Adapter caseParserModel(ParserModel object)
      {
        return createParserModelAdapter();
      }
      @Override
      public Adapter caseScannerName(ScannerName object)
      {
        return createScannerNameAdapter();
      }
      @Override
      public Adapter caseParserName(ParserName object)
      {
        return createParserNameAdapter();
      }
      @Override
      public Adapter caseImport(Import object)
      {
        return createImportAdapter();
      }
      @Override
      public Adapter caseExport(Export object)
      {
        return createExportAdapter();
      }
      @Override
      public Adapter caseGlobal(Global object)
      {
        return createGlobalAdapter();
      }
      @Override
      public Adapter caseLocal(Local object)
      {
        return createLocalAdapter();
      }
      @Override
      public Adapter caseBegin(Begin object)
      {
        return createBeginAdapter();
      }
      @Override
      public Adapter caseClose(Close object)
      {
        return createCloseAdapter();
      }
      @Override
      public Adapter caseTokens(Tokens object)
      {
        return createTokensAdapter();
      }
      @Override
      public Adapter caseDefinedToken(DefinedToken object)
      {
        return createDefinedTokenAdapter();
      }
      @Override
      public Adapter caseTokenExtra(TokenExtra object)
      {
        return createTokenExtraAdapter();
      }
      @Override
      public Adapter casePrecedence(Precedence object)
      {
        return createPrecedenceAdapter();
      }
      @Override
      public Adapter casePrecedenceRow(PrecedenceRow object)
      {
        return createPrecedenceRowAdapter();
      }
      @Override
      public Adapter caseStartSymbols(StartSymbols object)
      {
        return createStartSymbolsAdapter();
      }
      @Override
      public Adapter caseStartState(StartState object)
      {
        return createStartStateAdapter();
      }
      @Override
      public Adapter caseGrammarRules(GrammarRules object)
      {
        return createGrammarRulesAdapter();
      }
      @Override
      public Adapter caseGrammerReference(GrammerReference object)
      {
        return createGrammerReferenceAdapter();
      }
      @Override
      public Adapter caseGrammarRule(GrammarRule object)
      {
        return createGrammarRuleAdapter();
      }
      @Override
      public Adapter caseSimpleRule(SimpleRule object)
      {
        return createSimpleRuleAdapter();
      }
      @Override
      public Adapter caseRuleBody(RuleBody object)
      {
        return createRuleBodyAdapter();
      }
      @Override
      public Adapter caseRuleContent(RuleContent object)
      {
        return createRuleContentAdapter();
      }
      @Override
      public Adapter caseRulePart(RulePart object)
      {
        return createRulePartAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link de.roma.cocktail.xtext.lpp.ParserModel <em>Parser Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.roma.cocktail.xtext.lpp.ParserModel
   * @generated
   */
  public Adapter createParserModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.roma.cocktail.xtext.lpp.ScannerName <em>Scanner Name</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.roma.cocktail.xtext.lpp.ScannerName
   * @generated
   */
  public Adapter createScannerNameAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.roma.cocktail.xtext.lpp.ParserName <em>Parser Name</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.roma.cocktail.xtext.lpp.ParserName
   * @generated
   */
  public Adapter createParserNameAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.roma.cocktail.xtext.lpp.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.roma.cocktail.xtext.lpp.Import
   * @generated
   */
  public Adapter createImportAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.roma.cocktail.xtext.lpp.Export <em>Export</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.roma.cocktail.xtext.lpp.Export
   * @generated
   */
  public Adapter createExportAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.roma.cocktail.xtext.lpp.Global <em>Global</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.roma.cocktail.xtext.lpp.Global
   * @generated
   */
  public Adapter createGlobalAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.roma.cocktail.xtext.lpp.Local <em>Local</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.roma.cocktail.xtext.lpp.Local
   * @generated
   */
  public Adapter createLocalAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.roma.cocktail.xtext.lpp.Begin <em>Begin</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.roma.cocktail.xtext.lpp.Begin
   * @generated
   */
  public Adapter createBeginAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.roma.cocktail.xtext.lpp.Close <em>Close</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.roma.cocktail.xtext.lpp.Close
   * @generated
   */
  public Adapter createCloseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.roma.cocktail.xtext.lpp.Tokens <em>Tokens</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.roma.cocktail.xtext.lpp.Tokens
   * @generated
   */
  public Adapter createTokensAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.roma.cocktail.xtext.lpp.DefinedToken <em>Defined Token</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.roma.cocktail.xtext.lpp.DefinedToken
   * @generated
   */
  public Adapter createDefinedTokenAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.roma.cocktail.xtext.lpp.TokenExtra <em>Token Extra</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.roma.cocktail.xtext.lpp.TokenExtra
   * @generated
   */
  public Adapter createTokenExtraAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.roma.cocktail.xtext.lpp.Precedence <em>Precedence</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.roma.cocktail.xtext.lpp.Precedence
   * @generated
   */
  public Adapter createPrecedenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.roma.cocktail.xtext.lpp.PrecedenceRow <em>Precedence Row</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.roma.cocktail.xtext.lpp.PrecedenceRow
   * @generated
   */
  public Adapter createPrecedenceRowAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.roma.cocktail.xtext.lpp.StartSymbols <em>Start Symbols</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.roma.cocktail.xtext.lpp.StartSymbols
   * @generated
   */
  public Adapter createStartSymbolsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.roma.cocktail.xtext.lpp.StartState <em>Start State</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.roma.cocktail.xtext.lpp.StartState
   * @generated
   */
  public Adapter createStartStateAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.roma.cocktail.xtext.lpp.GrammarRules <em>Grammar Rules</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.roma.cocktail.xtext.lpp.GrammarRules
   * @generated
   */
  public Adapter createGrammarRulesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.roma.cocktail.xtext.lpp.GrammerReference <em>Grammer Reference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.roma.cocktail.xtext.lpp.GrammerReference
   * @generated
   */
  public Adapter createGrammerReferenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.roma.cocktail.xtext.lpp.GrammarRule <em>Grammar Rule</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.roma.cocktail.xtext.lpp.GrammarRule
   * @generated
   */
  public Adapter createGrammarRuleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.roma.cocktail.xtext.lpp.SimpleRule <em>Simple Rule</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.roma.cocktail.xtext.lpp.SimpleRule
   * @generated
   */
  public Adapter createSimpleRuleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.roma.cocktail.xtext.lpp.RuleBody <em>Rule Body</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.roma.cocktail.xtext.lpp.RuleBody
   * @generated
   */
  public Adapter createRuleBodyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.roma.cocktail.xtext.lpp.RuleContent <em>Rule Content</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.roma.cocktail.xtext.lpp.RuleContent
   * @generated
   */
  public Adapter createRuleContentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.roma.cocktail.xtext.lpp.RulePart <em>Rule Part</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.roma.cocktail.xtext.lpp.RulePart
   * @generated
   */
  public Adapter createRulePartAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //LppAdapterFactory
