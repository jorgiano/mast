/**
 */
package cdfg.cdfg.impl;

import cdfg.cdfg.Annotable;
import cdfg.cdfg.Annotation;
import cdfg.cdfg.BranchCondition;
import cdfg.cdfg.Computing;
import cdfg.cdfg.DFGArc;
import cdfg.cdfg.DFGNode;
import cdfg.cdfg.DataNode;
import cdfg.cdfg.FixedPoint;
import cdfg.cdfg.Jump;
import cdfg.cdfg.Load;
import cdfg.cdfg.OperationNode;
import cdfg.cdfg.Overflow;
import cdfg.cdfg.PHI_arg;
import cdfg.cdfg.PHI_node;
import cdfg.cdfg.Quantization;
import cdfg.cdfg.Sink;
import cdfg.cdfg.Source;
import cdfg.cdfg.Standard;
import cdfg.cdfg.Store;
import cdfg.cdfg.cdfgFactory;
import cdfg.cdfg.cdfgPackage;

import function.function.FunctionPackage;

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
public class cdfgPackageImpl extends EPackageImpl implements cdfgPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cfgEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dfgEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dfgArcEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dfgNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass computingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass loadEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass storeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jumpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fixedPointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass floatEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass phI_nodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass phI_argEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum branchConditionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum quantizationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum overflowEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum standardEEnum = null;

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
	 * @see cdfg.cdfg.cdfgPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private cdfgPackageImpl() {
		super(eNS_URI, cdfgFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link cdfgPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static cdfgPackage init() {
		if (isInited) return (cdfgPackage)EPackage.Registry.INSTANCE.getEPackage(cdfgPackage.eNS_URI);

		// Obtain or create and register package
		cdfgPackageImpl thecdfgPackage = (cdfgPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof cdfgPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new cdfgPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		FunctionPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		thecdfgPackage.createPackageContents();

		// Initialize created meta-data
		thecdfgPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thecdfgPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(cdfgPackage.eNS_URI, thecdfgPackage);
		return thecdfgPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCFG() {
		return cfgEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCFG_Nodes() {
		return (EReference)cfgEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCFG_Start() {
		return (EReference)cfgEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCFG_Arcs() {
		return (EReference)cfgEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDFG() {
		return dfgEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDFG_Source() {
		return (EReference)dfgEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDFG_Sink() {
		return (EReference)dfgEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDFG_Nodes() {
		return (EReference)dfgEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDFG_Arcs() {
		return (EReference)dfgEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDFG_From() {
		return (EReference)dfgEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDFG_To() {
		return (EReference)dfgEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperationNode() {
		return operationNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationNode_Precedes() {
		return (EReference)operationNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationNode_Succeeds() {
		return (EReference)operationNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationNode_Function() {
		return (EReference)operationNodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDFGArc() {
		return dfgArcEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDFGArc_Source() {
		return (EReference)dfgArcEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDFGArc_Target() {
		return (EReference)dfgArcEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSource() {
		return sourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSink() {
		return sinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDFGNode() {
		return dfgNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDFGNode_To() {
		return (EReference)dfgNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDFGNode_From() {
		return (EReference)dfgNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComputing() {
		return computingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLoad() {
		return loadEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStore() {
		return storeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJump() {
		return jumpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJump_Source() {
		return (EReference)jumpEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJump_Target() {
		return (EReference)jumpEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJump_BranchCondition() {
		return (EAttribute)jumpEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJump_Condition() {
		return (EReference)jumpEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataNode() {
		return dataNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataNode_Definition() {
		return (EReference)dataNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataNode_Used() {
		return (EReference)dataNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataNode_Constant() {
		return (EAttribute)dataNodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataNode_NumberOfBits() {
		return (EAttribute)dataNodeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataNode_Value() {
		return (EAttribute)dataNodeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInteger() {
		return integerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInteger_Signed() {
		return (EAttribute)integerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFixedPoint() {
		return fixedPointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFixedPoint_Quantization() {
		return (EAttribute)fixedPointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFixedPoint_Overflow() {
		return (EAttribute)fixedPointEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFixedPoint_Wl() {
		return (EAttribute)fixedPointEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFixedPoint_Iwl() {
		return (EAttribute)fixedPointEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFixedPoint_Nbits() {
		return (EAttribute)fixedPointEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFloat() {
		return floatEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFloat_Standard() {
		return (EAttribute)floatEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBoolean() {
		return booleanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPHI_node() {
		return phI_nodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPHI_node_Args() {
		return (EReference)phI_nodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnnotation() {
		return annotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnnotation_Key() {
		return (EAttribute)annotationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnnotation_Value() {
		return (EAttribute)annotationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnnotable() {
		return annotableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnotable_Annotations() {
		return (EReference)annotableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPHI_arg() {
		return phI_argEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPHI_arg_From() {
		return (EReference)phI_argEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPHI_arg_Data() {
		return (EReference)phI_argEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBranchCondition() {
		return branchConditionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getQuantization() {
		return quantizationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOverflow() {
		return overflowEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getStandard() {
		return standardEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public cdfgFactory getcdfgFactory() {
		return (cdfgFactory)getEFactoryInstance();
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
		cfgEClass = createEClass(CFG);
		createEReference(cfgEClass, CFG__NODES);
		createEReference(cfgEClass, CFG__START);
		createEReference(cfgEClass, CFG__ARCS);

		dfgEClass = createEClass(DFG);
		createEReference(dfgEClass, DFG__SOURCE);
		createEReference(dfgEClass, DFG__SINK);
		createEReference(dfgEClass, DFG__NODES);
		createEReference(dfgEClass, DFG__ARCS);
		createEReference(dfgEClass, DFG__FROM);
		createEReference(dfgEClass, DFG__TO);

		operationNodeEClass = createEClass(OPERATION_NODE);
		createEReference(operationNodeEClass, OPERATION_NODE__PRECEDES);
		createEReference(operationNodeEClass, OPERATION_NODE__SUCCEEDS);
		createEReference(operationNodeEClass, OPERATION_NODE__FUNCTION);

		dfgArcEClass = createEClass(DFG_ARC);
		createEReference(dfgArcEClass, DFG_ARC__SOURCE);
		createEReference(dfgArcEClass, DFG_ARC__TARGET);

		sourceEClass = createEClass(SOURCE);

		sinkEClass = createEClass(SINK);

		dfgNodeEClass = createEClass(DFG_NODE);
		createEReference(dfgNodeEClass, DFG_NODE__TO);
		createEReference(dfgNodeEClass, DFG_NODE__FROM);

		computingEClass = createEClass(COMPUTING);

		loadEClass = createEClass(LOAD);

		storeEClass = createEClass(STORE);

		jumpEClass = createEClass(JUMP);
		createEReference(jumpEClass, JUMP__SOURCE);
		createEReference(jumpEClass, JUMP__TARGET);
		createEAttribute(jumpEClass, JUMP__BRANCH_CONDITION);
		createEReference(jumpEClass, JUMP__CONDITION);

		dataNodeEClass = createEClass(DATA_NODE);
		createEReference(dataNodeEClass, DATA_NODE__DEFINITION);
		createEReference(dataNodeEClass, DATA_NODE__USED);
		createEAttribute(dataNodeEClass, DATA_NODE__CONSTANT);
		createEAttribute(dataNodeEClass, DATA_NODE__NUMBER_OF_BITS);
		createEAttribute(dataNodeEClass, DATA_NODE__VALUE);

		integerEClass = createEClass(INTEGER);
		createEAttribute(integerEClass, INTEGER__SIGNED);

		fixedPointEClass = createEClass(FIXED_POINT);
		createEAttribute(fixedPointEClass, FIXED_POINT__QUANTIZATION);
		createEAttribute(fixedPointEClass, FIXED_POINT__OVERFLOW);
		createEAttribute(fixedPointEClass, FIXED_POINT__WL);
		createEAttribute(fixedPointEClass, FIXED_POINT__IWL);
		createEAttribute(fixedPointEClass, FIXED_POINT__NBITS);

		floatEClass = createEClass(FLOAT);
		createEAttribute(floatEClass, FLOAT__STANDARD);

		booleanEClass = createEClass(BOOLEAN);

		phI_nodeEClass = createEClass(PHI_NODE);
		createEReference(phI_nodeEClass, PHI_NODE__ARGS);

		annotationEClass = createEClass(ANNOTATION);
		createEAttribute(annotationEClass, ANNOTATION__KEY);
		createEAttribute(annotationEClass, ANNOTATION__VALUE);

		annotableEClass = createEClass(ANNOTABLE);
		createEReference(annotableEClass, ANNOTABLE__ANNOTATIONS);

		phI_argEClass = createEClass(PHI_ARG);
		createEReference(phI_argEClass, PHI_ARG__FROM);
		createEReference(phI_argEClass, PHI_ARG__DATA);

		// Create enums
		branchConditionEEnum = createEEnum(BRANCH_CONDITION);
		quantizationEEnum = createEEnum(QUANTIZATION);
		overflowEEnum = createEEnum(OVERFLOW);
		standardEEnum = createEEnum(STANDARD);
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

		// Obtain other dependent packages
		FunctionPackage theFunctionPackage = (FunctionPackage)EPackage.Registry.INSTANCE.getEPackage(FunctionPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		cfgEClass.getESuperTypes().add(this.getAnnotable());
		dfgEClass.getESuperTypes().add(this.getAnnotable());
		operationNodeEClass.getESuperTypes().add(this.getDFGNode());
		dfgArcEClass.getESuperTypes().add(this.getAnnotable());
		sourceEClass.getESuperTypes().add(this.getDFGNode());
		sinkEClass.getESuperTypes().add(this.getDFGNode());
		dfgNodeEClass.getESuperTypes().add(this.getAnnotable());
		computingEClass.getESuperTypes().add(this.getOperationNode());
		loadEClass.getESuperTypes().add(this.getOperationNode());
		storeEClass.getESuperTypes().add(this.getOperationNode());
		jumpEClass.getESuperTypes().add(this.getAnnotable());
		dataNodeEClass.getESuperTypes().add(this.getDFGNode());
		integerEClass.getESuperTypes().add(this.getDataNode());
		fixedPointEClass.getESuperTypes().add(this.getDataNode());
		floatEClass.getESuperTypes().add(this.getDataNode());
		booleanEClass.getESuperTypes().add(this.getDataNode());
		phI_nodeEClass.getESuperTypes().add(this.getOperationNode());

		// Initialize classes, features, and operations; add parameters
		initEClass(cfgEClass, cdfg.cdfg.CFG.class, "CFG", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCFG_Nodes(), this.getDFG(), null, "nodes", null, 0, -1, cdfg.cdfg.CFG.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCFG_Start(), this.getDFG(), null, "start", null, 1, 1, cdfg.cdfg.CFG.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCFG_Arcs(), this.getJump(), null, "arcs", null, 0, -1, cdfg.cdfg.CFG.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dfgEClass, cdfg.cdfg.DFG.class, "DFG", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDFG_Source(), this.getSource(), null, "source", null, 1, 1, cdfg.cdfg.DFG.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDFG_Sink(), this.getSink(), null, "sink", null, 1, 1, cdfg.cdfg.DFG.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDFG_Nodes(), this.getDFGNode(), null, "nodes", null, 0, -1, cdfg.cdfg.DFG.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDFG_Arcs(), this.getDFGArc(), null, "arcs", null, 0, -1, cdfg.cdfg.DFG.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDFG_From(), this.getJump(), this.getJump_Target(), "from", null, 0, -1, cdfg.cdfg.DFG.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDFG_To(), this.getJump(), this.getJump_Source(), "to", null, 0, -1, cdfg.cdfg.DFG.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operationNodeEClass, OperationNode.class, "OperationNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOperationNode_Precedes(), this.getOperationNode(), this.getOperationNode_Succeeds(), "precedes", null, 0, -1, OperationNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperationNode_Succeeds(), this.getOperationNode(), this.getOperationNode_Precedes(), "succeeds", null, 0, -1, OperationNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperationNode_Function(), theFunctionPackage.getFunction(), null, "function", null, 0, 1, OperationNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dfgArcEClass, DFGArc.class, "DFGArc", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDFGArc_Source(), this.getDFGNode(), this.getDFGNode_To(), "source", null, 1, 1, DFGArc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDFGArc_Target(), this.getDFGNode(), this.getDFGNode_From(), "target", null, 1, 1, DFGArc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sourceEClass, Source.class, "Source", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sinkEClass, Sink.class, "Sink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dfgNodeEClass, DFGNode.class, "DFGNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDFGNode_To(), this.getDFGArc(), this.getDFGArc_Source(), "to", null, 0, -1, DFGNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDFGNode_From(), this.getDFGArc(), this.getDFGArc_Target(), "from", null, 0, -1, DFGNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(computingEClass, Computing.class, "Computing", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(loadEClass, Load.class, "Load", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(storeEClass, Store.class, "Store", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(jumpEClass, Jump.class, "Jump", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJump_Source(), this.getDFG(), this.getDFG_To(), "source", null, 1, 1, Jump.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJump_Target(), this.getDFG(), this.getDFG_From(), "target", null, 1, 1, Jump.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJump_BranchCondition(), this.getBranchCondition(), "branchCondition", null, 1, 1, Jump.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJump_Condition(), this.getDataNode(), null, "condition", null, 0, 1, Jump.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataNodeEClass, DataNode.class, "DataNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataNode_Definition(), this.getDataNode(), this.getDataNode_Used(), "definition", null, 0, 1, DataNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataNode_Used(), this.getDataNode(), this.getDataNode_Definition(), "used", null, 0, -1, DataNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataNode_Constant(), ecorePackage.getEBoolean(), "constant", null, 1, 1, DataNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataNode_NumberOfBits(), ecorePackage.getEInt(), "numberOfBits", null, 0, 1, DataNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataNode_Value(), ecorePackage.getEString(), "value", null, 0, 1, DataNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(integerEClass, cdfg.cdfg.Integer.class, "Integer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInteger_Signed(), ecorePackage.getEBoolean(), "signed", null, 0, 1, cdfg.cdfg.Integer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fixedPointEClass, FixedPoint.class, "FixedPoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFixedPoint_Quantization(), this.getQuantization(), "quantization", null, 0, 1, FixedPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFixedPoint_Overflow(), this.getOverflow(), "overflow", null, 0, 1, FixedPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFixedPoint_Wl(), ecorePackage.getEInt(), "wl", null, 0, 1, FixedPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFixedPoint_Iwl(), ecorePackage.getEInt(), "iwl", null, 0, 1, FixedPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFixedPoint_Nbits(), ecorePackage.getEInt(), "nbits", null, 0, 1, FixedPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(floatEClass, cdfg.cdfg.Float.class, "Float", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFloat_Standard(), this.getStandard(), "standard", null, 0, 1, cdfg.cdfg.Float.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(booleanEClass, cdfg.cdfg.Boolean.class, "Boolean", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(phI_nodeEClass, PHI_node.class, "PHI_node", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPHI_node_Args(), this.getPHI_arg(), null, "args", null, 0, -1, PHI_node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(annotationEClass, Annotation.class, "Annotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAnnotation_Key(), ecorePackage.getEString(), "key", null, 0, 1, Annotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnnotation_Value(), ecorePackage.getEString(), "value", null, 0, 1, Annotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(annotableEClass, Annotable.class, "Annotable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnnotable_Annotations(), this.getAnnotation(), null, "annotations", null, 0, -1, Annotable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(phI_argEClass, PHI_arg.class, "PHI_arg", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPHI_arg_From(), this.getJump(), null, "from", null, 0, 1, PHI_arg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPHI_arg_Data(), this.getDataNode(), null, "data", null, 0, 1, PHI_arg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(branchConditionEEnum, BranchCondition.class, "BranchCondition");
		addEEnumLiteral(branchConditionEEnum, BranchCondition.TRUE);
		addEEnumLiteral(branchConditionEEnum, BranchCondition.FALSE);
		addEEnumLiteral(branchConditionEEnum, BranchCondition.ALWAYS);

		initEEnum(quantizationEEnum, Quantization.class, "Quantization");
		addEEnumLiteral(quantizationEEnum, Quantization.RND);
		addEEnumLiteral(quantizationEEnum, Quantization.RND_ZERO);
		addEEnumLiteral(quantizationEEnum, Quantization.RND_MIN_INF);
		addEEnumLiteral(quantizationEEnum, Quantization.RND_INF);
		addEEnumLiteral(quantizationEEnum, Quantization.RND_CONV);
		addEEnumLiteral(quantizationEEnum, Quantization.TRN);
		addEEnumLiteral(quantizationEEnum, Quantization.TRN_ZERO);

		initEEnum(overflowEEnum, Overflow.class, "Overflow");
		addEEnumLiteral(overflowEEnum, Overflow.SAT);
		addEEnumLiteral(overflowEEnum, Overflow.SAT_ZERO);
		addEEnumLiteral(overflowEEnum, Overflow.SAT_SYM);
		addEEnumLiteral(overflowEEnum, Overflow.WRAP);
		addEEnumLiteral(overflowEEnum, Overflow.WRAP_SM);

		initEEnum(standardEEnum, Standard.class, "Standard");
		addEEnumLiteral(standardEEnum, Standard.IEEE_754_1985);
		addEEnumLiteral(standardEEnum, Standard.IEEE_754_2008);

		// Create resource
		createResource(eNS_URI);
	}

} //cdfgPackageImpl
