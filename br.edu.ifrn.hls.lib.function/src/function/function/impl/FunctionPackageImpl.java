/**
 */
package function.function.impl;

import function.function.ComputingFunction;
import function.function.Dependency;
import function.function.Function;
import function.function.FunctionFactory;
import function.function.FunctionPackage;
import function.function.Functions;
import function.function.IOFlag;
import function.function.MemoryAccess;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FunctionPackageImpl extends EPackageImpl implements FunctionPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass computingFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass memoryAccessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum ioFlagEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dependencyEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see function.function.FunctionPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private FunctionPackageImpl() {
		super(eNS_URI, FunctionFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link FunctionPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static FunctionPackage init() {
		if (isInited) return (FunctionPackage)EPackage.Registry.INSTANCE.getEPackage(FunctionPackage.eNS_URI);

		// Obtain or create and register package
		FunctionPackageImpl theFunctionPackage = (FunctionPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof FunctionPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new FunctionPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theFunctionPackage.createPackageContents();

		// Initialize created meta-data
		theFunctionPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theFunctionPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(FunctionPackage.eNS_URI, theFunctionPackage);
		return theFunctionPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctions() {
		return functionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctions_Functions() {
		return (EReference)functionsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunction() {
		return functionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunction_Name() {
		return (EAttribute)functionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunction_Inputs() {
		return (EAttribute)functionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunction_Outputs() {
		return (EAttribute)functionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComputingFunction() {
		return computingFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComputingFunction_Dependency() {
		return (EAttribute)computingFunctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComputingFunction_Commutativity() {
		return (EAttribute)computingFunctionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComputingFunction_Associativity() {
		return (EAttribute)computingFunctionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMemoryAccess() {
		return memoryAccessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMemoryAccess_Io() {
		return (EAttribute)memoryAccessEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getIOFlag() {
		return ioFlagEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDependency() {
		return dependencyEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionFactory getFunctionFactory() {
		return (FunctionFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		functionsEClass = createEClass(FUNCTIONS);
		createEReference(functionsEClass, FUNCTIONS__FUNCTIONS);

		functionEClass = createEClass(FUNCTION);
		createEAttribute(functionEClass, FUNCTION__NAME);
		createEAttribute(functionEClass, FUNCTION__INPUTS);
		createEAttribute(functionEClass, FUNCTION__OUTPUTS);

		computingFunctionEClass = createEClass(COMPUTING_FUNCTION);
		createEAttribute(computingFunctionEClass, COMPUTING_FUNCTION__DEPENDENCY);
		createEAttribute(computingFunctionEClass, COMPUTING_FUNCTION__COMMUTATIVITY);
		createEAttribute(computingFunctionEClass, COMPUTING_FUNCTION__ASSOCIATIVITY);

		memoryAccessEClass = createEClass(MEMORY_ACCESS);
		createEAttribute(memoryAccessEClass, MEMORY_ACCESS__IO);

		// Create enums
		ioFlagEEnum = createEEnum(IO_FLAG);
		dependencyEEnum = createEEnum(DEPENDENCY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		computingFunctionEClass.getESuperTypes().add(this.getFunction());
		memoryAccessEClass.getESuperTypes().add(this.getFunction());

		// Initialize classes, features, and operations; add parameters
		initEClass(functionsEClass, Functions.class, "Functions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFunctions_Functions(), this.getFunction(), null, "functions", null, 0, -1, Functions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(functionEClass, Function.class, "Function", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFunction_Name(), ecorePackage.getEString(), "name", null, 0, 1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFunction_Inputs(), ecorePackage.getEString(), "inputs", null, 0, -1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFunction_Outputs(), ecorePackage.getEString(), "outputs", null, 0, -1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(computingFunctionEClass, ComputingFunction.class, "ComputingFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComputingFunction_Dependency(), this.getDependency(), "dependency", null, 0, 1, ComputingFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComputingFunction_Commutativity(), ecorePackage.getEBoolean(), "commutativity", null, 0, 1, ComputingFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComputingFunction_Associativity(), ecorePackage.getEBoolean(), "associativity", null, 0, 1, ComputingFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(memoryAccessEClass, MemoryAccess.class, "MemoryAccess", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMemoryAccess_Io(), this.getIOFlag(), "io", null, 0, 1, MemoryAccess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(ioFlagEEnum, IOFlag.class, "IOFlag");
		addEEnumLiteral(ioFlagEEnum, IOFlag.READ);
		addEEnumLiteral(ioFlagEEnum, IOFlag.WRITE);

		initEEnum(dependencyEEnum, Dependency.class, "Dependency");
		addEEnumLiteral(dependencyEEnum, Dependency.NONE);
		addEEnumLiteral(dependencyEEnum, Dependency.MIN_INPUTS);
		addEEnumLiteral(dependencyEEnum, Dependency.MAX_INPUTS);
		addEEnumLiteral(dependencyEEnum, Dependency.ALL_INPUTS);

		// Create resource
		createResource(eNS_URI);
	}

} //FunctionPackageImpl
