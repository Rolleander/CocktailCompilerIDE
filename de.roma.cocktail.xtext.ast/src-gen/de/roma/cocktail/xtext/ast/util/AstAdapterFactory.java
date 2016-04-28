/**
 * generated by Xtext 2.9.1
 */
package de.roma.cocktail.xtext.ast.util;

import de.roma.cocktail.xtext.ast.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.roma.cocktail.xtext.ast.AstPackage
 * @generated
 */
public class AstAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static AstPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AstAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = AstPackage.eINSTANCE;
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
  protected AstSwitch<Adapter> modelSwitch =
    new AstSwitch<Adapter>()
    {
      @Override
      public Adapter caseModel(Model object)
      {
        return createModelAdapter();
      }
      @Override
      public Adapter caseModule(Module object)
      {
        return createModuleAdapter();
      }
      @Override
      public Adapter caseTree(Tree object)
      {
        return createTreeAdapter();
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
      public Adapter caseProperties(Properties object)
      {
        return createPropertiesAdapter();
      }
      @Override
      public Adapter casePropertyList(PropertyList object)
      {
        return createPropertyListAdapter();
      }
      @Override
      public Adapter caseDeclare(Declare object)
      {
        return createDeclareAdapter();
      }
      @Override
      public Adapter caseDeclareNode(DeclareNode object)
      {
        return createDeclareNodeAdapter();
      }
      @Override
      public Adapter caseRule(Rule object)
      {
        return createRuleAdapter();
      }
      @Override
      public Adapter caseRootNode(RootNode object)
      {
        return createRootNodeAdapter();
      }
      @Override
      public Adapter caseBaseTypes(BaseTypes object)
      {
        return createBaseTypesAdapter();
      }
      @Override
      public Adapter caseExtensions(Extensions object)
      {
        return createExtensionsAdapter();
      }
      @Override
      public Adapter caseNodePart(NodePart object)
      {
        return createNodePartAdapter();
      }
      @Override
      public Adapter caseChildNode(ChildNode object)
      {
        return createChildNodeAdapter();
      }
      @Override
      public Adapter caseNodeAttribute(NodeAttribute object)
      {
        return createNodeAttributeAdapter();
      }
      @Override
      public Adapter caseNodeName(NodeName object)
      {
        return createNodeNameAdapter();
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
   * Creates a new adapter for an object of class '{@link de.roma.cocktail.xtext.ast.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.roma.cocktail.xtext.ast.Model
   * @generated
   */
  public Adapter createModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.roma.cocktail.xtext.ast.Module <em>Module</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.roma.cocktail.xtext.ast.Module
   * @generated
   */
  public Adapter createModuleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.roma.cocktail.xtext.ast.Tree <em>Tree</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.roma.cocktail.xtext.ast.Tree
   * @generated
   */
  public Adapter createTreeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.roma.cocktail.xtext.ast.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.roma.cocktail.xtext.ast.Import
   * @generated
   */
  public Adapter createImportAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.roma.cocktail.xtext.ast.Export <em>Export</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.roma.cocktail.xtext.ast.Export
   * @generated
   */
  public Adapter createExportAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.roma.cocktail.xtext.ast.Global <em>Global</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.roma.cocktail.xtext.ast.Global
   * @generated
   */
  public Adapter createGlobalAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.roma.cocktail.xtext.ast.Local <em>Local</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.roma.cocktail.xtext.ast.Local
   * @generated
   */
  public Adapter createLocalAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.roma.cocktail.xtext.ast.Begin <em>Begin</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.roma.cocktail.xtext.ast.Begin
   * @generated
   */
  public Adapter createBeginAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.roma.cocktail.xtext.ast.Close <em>Close</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.roma.cocktail.xtext.ast.Close
   * @generated
   */
  public Adapter createCloseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.roma.cocktail.xtext.ast.Properties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.roma.cocktail.xtext.ast.Properties
   * @generated
   */
  public Adapter createPropertiesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.roma.cocktail.xtext.ast.PropertyList <em>Property List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.roma.cocktail.xtext.ast.PropertyList
   * @generated
   */
  public Adapter createPropertyListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.roma.cocktail.xtext.ast.Declare <em>Declare</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.roma.cocktail.xtext.ast.Declare
   * @generated
   */
  public Adapter createDeclareAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.roma.cocktail.xtext.ast.DeclareNode <em>Declare Node</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.roma.cocktail.xtext.ast.DeclareNode
   * @generated
   */
  public Adapter createDeclareNodeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.roma.cocktail.xtext.ast.Rule <em>Rule</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.roma.cocktail.xtext.ast.Rule
   * @generated
   */
  public Adapter createRuleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.roma.cocktail.xtext.ast.RootNode <em>Root Node</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.roma.cocktail.xtext.ast.RootNode
   * @generated
   */
  public Adapter createRootNodeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.roma.cocktail.xtext.ast.BaseTypes <em>Base Types</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.roma.cocktail.xtext.ast.BaseTypes
   * @generated
   */
  public Adapter createBaseTypesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.roma.cocktail.xtext.ast.Extensions <em>Extensions</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.roma.cocktail.xtext.ast.Extensions
   * @generated
   */
  public Adapter createExtensionsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.roma.cocktail.xtext.ast.NodePart <em>Node Part</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.roma.cocktail.xtext.ast.NodePart
   * @generated
   */
  public Adapter createNodePartAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.roma.cocktail.xtext.ast.ChildNode <em>Child Node</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.roma.cocktail.xtext.ast.ChildNode
   * @generated
   */
  public Adapter createChildNodeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.roma.cocktail.xtext.ast.NodeAttribute <em>Node Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.roma.cocktail.xtext.ast.NodeAttribute
   * @generated
   */
  public Adapter createNodeAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.roma.cocktail.xtext.ast.NodeName <em>Node Name</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.roma.cocktail.xtext.ast.NodeName
   * @generated
   */
  public Adapter createNodeNameAdapter()
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

} //AstAdapterFactory
