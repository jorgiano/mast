/**
 */
package cdfg.cdfg.impl;

import cdfg.cdfg.Annotation;
import cdfg.cdfg.BranchCondition;
import cdfg.cdfg.CFG;
import cdfg.cdfg.Computing;
import cdfg.cdfg.DFG;
import cdfg.cdfg.DFGArc;
import cdfg.cdfg.FixedPoint;
import cdfg.cdfg.Jump;
import cdfg.cdfg.Load;
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
public class cdfgFactoryImpl extends EFactoryImpl implements cdfgFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static cdfgFactory init() {
		try {
			cdfgFactory thecdfgFactory = (cdfgFactory)EPackage.Registry.INSTANCE.getEFactory(cdfgPackage.eNS_URI);
			if (thecdfgFactory != null) {
				return thecdfgFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new cdfgFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public cdfgFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case cdfgPackage.CFG: return (EObject)createCFG();
			case cdfgPackage.DFG: return (EObject)createDFG();
			case cdfgPackage.DFG_ARC: return (EObject)createDFGArc();
			case cdfgPackage.SOURCE: return (EObject)createSource();
			case cdfgPackage.SINK: return (EObject)createSink();
			case cdfgPackage.COMPUTING: return (EObject)createComputing();
			case cdfgPackage.LOAD: return (EObject)createLoad();
			case cdfgPackage.STORE: return (EObject)createStore();
			case cdfgPackage.JUMP: return (EObject)createJump();
			case cdfgPackage.INTEGER: return (EObject)createInteger();
			case cdfgPackage.FIXED_POINT: return (EObject)createFixedPoint();
			case cdfgPackage.FLOAT: return (EObject)createFloat();
			case cdfgPackage.BOOLEAN: return (EObject)createBoolean();
			case cdfgPackage.PHI_NODE: return (EObject)createPHI_node();
			case cdfgPackage.ANNOTATION: return (EObject)createAnnotation();
			case cdfgPackage.PHI_ARG: return (EObject)createPHI_arg();
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
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case cdfgPackage.BRANCH_CONDITION:
				return createBranchConditionFromString(eDataType, initialValue);
			case cdfgPackage.QUANTIZATION:
				return createQuantizationFromString(eDataType, initialValue);
			case cdfgPackage.OVERFLOW:
				return createOverflowFromString(eDataType, initialValue);
			case cdfgPackage.STANDARD:
				return createStandardFromString(eDataType, initialValue);
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
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case cdfgPackage.BRANCH_CONDITION:
				return convertBranchConditionToString(eDataType, instanceValue);
			case cdfgPackage.QUANTIZATION:
				return convertQuantizationToString(eDataType, instanceValue);
			case cdfgPackage.OVERFLOW:
				return convertOverflowToString(eDataType, instanceValue);
			case cdfgPackage.STANDARD:
				return convertStandardToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CFG createCFG() {
		CFGImpl cfg = new CFGImpl();
		return cfg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DFG createDFG() {
		DFGImpl dfg = new DFGImpl();
		return dfg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DFGArc createDFGArc() {
		DFGArcImpl dfgArc = new DFGArcImpl();
		return dfgArc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Source createSource() {
		SourceImpl source = new SourceImpl();
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sink createSink() {
		SinkImpl sink = new SinkImpl();
		return sink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Computing createComputing() {
		ComputingImpl computing = new ComputingImpl();
		return computing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Load createLoad() {
		LoadImpl load = new LoadImpl();
		return load;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Store createStore() {
		StoreImpl store = new StoreImpl();
		return store;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Jump createJump() {
		JumpImpl jump = new JumpImpl();
		return jump;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public cdfg.cdfg.Integer createInteger() {
		IntegerImpl integer = new IntegerImpl();
		return integer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FixedPoint createFixedPoint() {
		FixedPointImpl fixedPoint = new FixedPointImpl();
		return fixedPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public cdfg.cdfg.Float createFloat() {
		FloatImpl float_ = new FloatImpl();
		return float_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public cdfg.cdfg.Boolean createBoolean() {
		BooleanImpl boolean_ = new BooleanImpl();
		return boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PHI_node createPHI_node() {
		PHI_nodeImpl phI_node = new PHI_nodeImpl();
		return phI_node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Annotation createAnnotation() {
		AnnotationImpl annotation = new AnnotationImpl();
		return annotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PHI_arg createPHI_arg() {
		PHI_argImpl phI_arg = new PHI_argImpl();
		return phI_arg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BranchCondition createBranchConditionFromString(EDataType eDataType, String initialValue) {
		BranchCondition result = BranchCondition.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBranchConditionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quantization createQuantizationFromString(EDataType eDataType, String initialValue) {
		Quantization result = Quantization.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertQuantizationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Overflow createOverflowFromString(EDataType eDataType, String initialValue) {
		Overflow result = Overflow.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOverflowToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Standard createStandardFromString(EDataType eDataType, String initialValue) {
		Standard result = Standard.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStandardToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public cdfgPackage getcdfgPackage() {
		return (cdfgPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static cdfgPackage getPackage() {
		return cdfgPackage.eINSTANCE;
	}

} //cdfgFactoryImpl
