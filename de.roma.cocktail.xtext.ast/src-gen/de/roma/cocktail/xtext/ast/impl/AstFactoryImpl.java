/**
 * generated by Xtext 2.9.1
 */
package de.roma.cocktail.xtext.ast.impl;

import de.roma.cocktail.xtext.ast.*;

import org.eclipse.emf.ecore.EClass;
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
public class AstFactoryImpl extends EFactoryImpl implements AstFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static AstFactory init()
  {
    try
    {
      AstFactory theAstFactory = (AstFactory)EPackage.Registry.INSTANCE.getEFactory(AstPackage.eNS_URI);
      if (theAstFactory != null)
      {
        return theAstFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new AstFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AstFactoryImpl()
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
      case AstPackage.MODEL: return createModel();
      case AstPackage.MODULE: return createModule();
      case AstPackage.TREE: return createTree();
      case AstPackage.IMPORT: return createImport();
      case AstPackage.EXPORT: return createExport();
      case AstPackage.GLOBAL: return createGlobal();
      case AstPackage.LOCAL: return createLocal();
      case AstPackage.BEGIN: return createBegin();
      case AstPackage.CLOSE: return createClose();
      case AstPackage.PROPERTIES: return createProperties();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Module createModule()
  {
    ModuleImpl module = new ModuleImpl();
    return module;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Tree createTree()
  {
    TreeImpl tree = new TreeImpl();
    return tree;
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
  public Properties createProperties()
  {
    PropertiesImpl properties = new PropertiesImpl();
    return properties;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AstPackage getAstPackage()
  {
    return (AstPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static AstPackage getPackage()
  {
    return AstPackage.eINSTANCE;
  }

} //AstFactoryImpl
