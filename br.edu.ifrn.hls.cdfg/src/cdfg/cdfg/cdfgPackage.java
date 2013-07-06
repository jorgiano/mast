/**
 */
package cdfg.cdfg;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see cdfg.cdfg.cdfgFactory
 * @model kind="package"
 * @generated
 */
public interface cdfgPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "cdfg";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.ifrn.edu.br/cdfg/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cdfg";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	cdfgPackage eINSTANCE = cdfg.cdfg.impl.cdfgPackageImpl.init();

	/**
	 * The meta object id for the '{@link cdfg.cdfg.impl.AnnotableImpl <em>Annotable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cdfg.cdfg.impl.AnnotableImpl
	 * @see cdfg.cdfg.impl.cdfgPackageImpl#getAnnotable()
	 * @generated
	 */
	int ANNOTABLE = 18;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTABLE__ANNOTATIONS = 0;

	/**
	 * The number of structural features of the '<em>Annotable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTABLE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Annotable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cdfg.cdfg.impl.CFGImpl <em>CFG</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cdfg.cdfg.impl.CFGImpl
	 * @see cdfg.cdfg.impl.cdfgPackageImpl#getCFG()
	 * @generated
	 */
	int CFG = 0;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CFG__ANNOTATIONS = ANNOTABLE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CFG__NODES = ANNOTABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CFG__START = ANNOTABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Arcs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CFG__ARCS = ANNOTABLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>CFG</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CFG_FEATURE_COUNT = ANNOTABLE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>CFG</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CFG_OPERATION_COUNT = ANNOTABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cdfg.cdfg.impl.DFGImpl <em>DFG</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cdfg.cdfg.impl.DFGImpl
	 * @see cdfg.cdfg.impl.cdfgPackageImpl#getDFG()
	 * @generated
	 */
	int DFG = 1;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFG__ANNOTATIONS = ANNOTABLE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFG__SOURCE = ANNOTABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sink</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFG__SINK = ANNOTABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFG__NODES = ANNOTABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Arcs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFG__ARCS = ANNOTABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFG__FROM = ANNOTABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFG__TO = ANNOTABLE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>DFG</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFG_FEATURE_COUNT = ANNOTABLE_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>DFG</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFG_OPERATION_COUNT = ANNOTABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cdfg.cdfg.impl.DFGNodeImpl <em>DFG Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cdfg.cdfg.impl.DFGNodeImpl
	 * @see cdfg.cdfg.impl.cdfgPackageImpl#getDFGNode()
	 * @generated
	 */
	int DFG_NODE = 6;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFG_NODE__ANNOTATIONS = ANNOTABLE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFG_NODE__TO = ANNOTABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFG_NODE__FROM = ANNOTABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>DFG Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFG_NODE_FEATURE_COUNT = ANNOTABLE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>DFG Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFG_NODE_OPERATION_COUNT = ANNOTABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cdfg.cdfg.impl.OperationNodeImpl <em>Operation Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cdfg.cdfg.impl.OperationNodeImpl
	 * @see cdfg.cdfg.impl.cdfgPackageImpl#getOperationNode()
	 * @generated
	 */
	int OPERATION_NODE = 2;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_NODE__ANNOTATIONS = DFG_NODE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_NODE__TO = DFG_NODE__TO;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_NODE__FROM = DFG_NODE__FROM;

	/**
	 * The feature id for the '<em><b>Precedes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_NODE__PRECEDES = DFG_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Succeeds</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_NODE__SUCCEEDS = DFG_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_NODE__FUNCTION = DFG_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Operation Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_NODE_FEATURE_COUNT = DFG_NODE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Operation Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_NODE_OPERATION_COUNT = DFG_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cdfg.cdfg.impl.DFGArcImpl <em>DFG Arc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cdfg.cdfg.impl.DFGArcImpl
	 * @see cdfg.cdfg.impl.cdfgPackageImpl#getDFGArc()
	 * @generated
	 */
	int DFG_ARC = 3;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFG_ARC__ANNOTATIONS = ANNOTABLE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFG_ARC__SOURCE = ANNOTABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFG_ARC__TARGET = ANNOTABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>DFG Arc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFG_ARC_FEATURE_COUNT = ANNOTABLE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>DFG Arc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFG_ARC_OPERATION_COUNT = ANNOTABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cdfg.cdfg.impl.SourceImpl <em>Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cdfg.cdfg.impl.SourceImpl
	 * @see cdfg.cdfg.impl.cdfgPackageImpl#getSource()
	 * @generated
	 */
	int SOURCE = 4;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__ANNOTATIONS = DFG_NODE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__TO = DFG_NODE__TO;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__FROM = DFG_NODE__FROM;

	/**
	 * The number of structural features of the '<em>Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FEATURE_COUNT = DFG_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_OPERATION_COUNT = DFG_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cdfg.cdfg.impl.SinkImpl <em>Sink</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cdfg.cdfg.impl.SinkImpl
	 * @see cdfg.cdfg.impl.cdfgPackageImpl#getSink()
	 * @generated
	 */
	int SINK = 5;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK__ANNOTATIONS = DFG_NODE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK__TO = DFG_NODE__TO;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK__FROM = DFG_NODE__FROM;

	/**
	 * The number of structural features of the '<em>Sink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK_FEATURE_COUNT = DFG_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK_OPERATION_COUNT = DFG_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cdfg.cdfg.impl.ComputingImpl <em>Computing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cdfg.cdfg.impl.ComputingImpl
	 * @see cdfg.cdfg.impl.cdfgPackageImpl#getComputing()
	 * @generated
	 */
	int COMPUTING = 7;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING__ANNOTATIONS = OPERATION_NODE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING__TO = OPERATION_NODE__TO;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING__FROM = OPERATION_NODE__FROM;

	/**
	 * The feature id for the '<em><b>Precedes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING__PRECEDES = OPERATION_NODE__PRECEDES;

	/**
	 * The feature id for the '<em><b>Succeeds</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING__SUCCEEDS = OPERATION_NODE__SUCCEEDS;

	/**
	 * The feature id for the '<em><b>Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING__FUNCTION = OPERATION_NODE__FUNCTION;

	/**
	 * The number of structural features of the '<em>Computing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_FEATURE_COUNT = OPERATION_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Computing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_OPERATION_COUNT = OPERATION_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cdfg.cdfg.impl.LoadImpl <em>Load</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cdfg.cdfg.impl.LoadImpl
	 * @see cdfg.cdfg.impl.cdfgPackageImpl#getLoad()
	 * @generated
	 */
	int LOAD = 8;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD__ANNOTATIONS = OPERATION_NODE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD__TO = OPERATION_NODE__TO;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD__FROM = OPERATION_NODE__FROM;

	/**
	 * The feature id for the '<em><b>Precedes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD__PRECEDES = OPERATION_NODE__PRECEDES;

	/**
	 * The feature id for the '<em><b>Succeeds</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD__SUCCEEDS = OPERATION_NODE__SUCCEEDS;

	/**
	 * The feature id for the '<em><b>Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD__FUNCTION = OPERATION_NODE__FUNCTION;

	/**
	 * The number of structural features of the '<em>Load</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_FEATURE_COUNT = OPERATION_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Load</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_OPERATION_COUNT = OPERATION_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cdfg.cdfg.impl.StoreImpl <em>Store</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cdfg.cdfg.impl.StoreImpl
	 * @see cdfg.cdfg.impl.cdfgPackageImpl#getStore()
	 * @generated
	 */
	int STORE = 9;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE__ANNOTATIONS = OPERATION_NODE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE__TO = OPERATION_NODE__TO;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE__FROM = OPERATION_NODE__FROM;

	/**
	 * The feature id for the '<em><b>Precedes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE__PRECEDES = OPERATION_NODE__PRECEDES;

	/**
	 * The feature id for the '<em><b>Succeeds</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE__SUCCEEDS = OPERATION_NODE__SUCCEEDS;

	/**
	 * The feature id for the '<em><b>Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE__FUNCTION = OPERATION_NODE__FUNCTION;

	/**
	 * The number of structural features of the '<em>Store</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_FEATURE_COUNT = OPERATION_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Store</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_OPERATION_COUNT = OPERATION_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cdfg.cdfg.impl.JumpImpl <em>Jump</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cdfg.cdfg.impl.JumpImpl
	 * @see cdfg.cdfg.impl.cdfgPackageImpl#getJump()
	 * @generated
	 */
	int JUMP = 10;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP__ANNOTATIONS = ANNOTABLE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP__SOURCE = ANNOTABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP__TARGET = ANNOTABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Branch Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP__BRANCH_CONDITION = ANNOTABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP__CONDITION = ANNOTABLE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Jump</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP_FEATURE_COUNT = ANNOTABLE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Jump</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP_OPERATION_COUNT = ANNOTABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cdfg.cdfg.impl.DataNodeImpl <em>Data Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cdfg.cdfg.impl.DataNodeImpl
	 * @see cdfg.cdfg.impl.cdfgPackageImpl#getDataNode()
	 * @generated
	 */
	int DATA_NODE = 11;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_NODE__ANNOTATIONS = DFG_NODE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_NODE__TO = DFG_NODE__TO;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_NODE__FROM = DFG_NODE__FROM;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_NODE__DEFINITION = DFG_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Used</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_NODE__USED = DFG_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Constant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_NODE__CONSTANT = DFG_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Number Of Bits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_NODE__NUMBER_OF_BITS = DFG_NODE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_NODE__VALUE = DFG_NODE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Data Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_NODE_FEATURE_COUNT = DFG_NODE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Data Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_NODE_OPERATION_COUNT = DFG_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cdfg.cdfg.impl.IntegerImpl <em>Integer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cdfg.cdfg.impl.IntegerImpl
	 * @see cdfg.cdfg.impl.cdfgPackageImpl#getInteger()
	 * @generated
	 */
	int INTEGER = 12;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER__ANNOTATIONS = DATA_NODE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER__TO = DATA_NODE__TO;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER__FROM = DATA_NODE__FROM;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER__DEFINITION = DATA_NODE__DEFINITION;

	/**
	 * The feature id for the '<em><b>Used</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER__USED = DATA_NODE__USED;

	/**
	 * The feature id for the '<em><b>Constant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER__CONSTANT = DATA_NODE__CONSTANT;

	/**
	 * The feature id for the '<em><b>Number Of Bits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER__NUMBER_OF_BITS = DATA_NODE__NUMBER_OF_BITS;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER__VALUE = DATA_NODE__VALUE;

	/**
	 * The feature id for the '<em><b>Signed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER__SIGNED = DATA_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Integer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_FEATURE_COUNT = DATA_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Integer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_OPERATION_COUNT = DATA_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cdfg.cdfg.impl.FixedPointImpl <em>Fixed Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cdfg.cdfg.impl.FixedPointImpl
	 * @see cdfg.cdfg.impl.cdfgPackageImpl#getFixedPoint()
	 * @generated
	 */
	int FIXED_POINT = 13;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_POINT__ANNOTATIONS = DATA_NODE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_POINT__TO = DATA_NODE__TO;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_POINT__FROM = DATA_NODE__FROM;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_POINT__DEFINITION = DATA_NODE__DEFINITION;

	/**
	 * The feature id for the '<em><b>Used</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_POINT__USED = DATA_NODE__USED;

	/**
	 * The feature id for the '<em><b>Constant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_POINT__CONSTANT = DATA_NODE__CONSTANT;

	/**
	 * The feature id for the '<em><b>Number Of Bits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_POINT__NUMBER_OF_BITS = DATA_NODE__NUMBER_OF_BITS;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_POINT__VALUE = DATA_NODE__VALUE;

	/**
	 * The feature id for the '<em><b>Quantization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_POINT__QUANTIZATION = DATA_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Overflow</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_POINT__OVERFLOW = DATA_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Wl</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_POINT__WL = DATA_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Iwl</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_POINT__IWL = DATA_NODE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Nbits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_POINT__NBITS = DATA_NODE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Fixed Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_POINT_FEATURE_COUNT = DATA_NODE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Fixed Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_POINT_OPERATION_COUNT = DATA_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cdfg.cdfg.impl.FloatImpl <em>Float</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cdfg.cdfg.impl.FloatImpl
	 * @see cdfg.cdfg.impl.cdfgPackageImpl#getFloat()
	 * @generated
	 */
	int FLOAT = 14;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT__ANNOTATIONS = DATA_NODE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT__TO = DATA_NODE__TO;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT__FROM = DATA_NODE__FROM;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT__DEFINITION = DATA_NODE__DEFINITION;

	/**
	 * The feature id for the '<em><b>Used</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT__USED = DATA_NODE__USED;

	/**
	 * The feature id for the '<em><b>Constant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT__CONSTANT = DATA_NODE__CONSTANT;

	/**
	 * The feature id for the '<em><b>Number Of Bits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT__NUMBER_OF_BITS = DATA_NODE__NUMBER_OF_BITS;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT__VALUE = DATA_NODE__VALUE;

	/**
	 * The feature id for the '<em><b>Standard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT__STANDARD = DATA_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Float</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_FEATURE_COUNT = DATA_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Float</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_OPERATION_COUNT = DATA_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cdfg.cdfg.impl.BooleanImpl <em>Boolean</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cdfg.cdfg.impl.BooleanImpl
	 * @see cdfg.cdfg.impl.cdfgPackageImpl#getBoolean()
	 * @generated
	 */
	int BOOLEAN = 15;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN__ANNOTATIONS = DATA_NODE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN__TO = DATA_NODE__TO;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN__FROM = DATA_NODE__FROM;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN__DEFINITION = DATA_NODE__DEFINITION;

	/**
	 * The feature id for the '<em><b>Used</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN__USED = DATA_NODE__USED;

	/**
	 * The feature id for the '<em><b>Constant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN__CONSTANT = DATA_NODE__CONSTANT;

	/**
	 * The feature id for the '<em><b>Number Of Bits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN__NUMBER_OF_BITS = DATA_NODE__NUMBER_OF_BITS;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN__VALUE = DATA_NODE__VALUE;

	/**
	 * The number of structural features of the '<em>Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_FEATURE_COUNT = DATA_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OPERATION_COUNT = DATA_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cdfg.cdfg.impl.PHI_nodeImpl <em>PHI node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cdfg.cdfg.impl.PHI_nodeImpl
	 * @see cdfg.cdfg.impl.cdfgPackageImpl#getPHI_node()
	 * @generated
	 */
	int PHI_NODE = 16;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHI_NODE__ANNOTATIONS = OPERATION_NODE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHI_NODE__TO = OPERATION_NODE__TO;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHI_NODE__FROM = OPERATION_NODE__FROM;

	/**
	 * The feature id for the '<em><b>Precedes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHI_NODE__PRECEDES = OPERATION_NODE__PRECEDES;

	/**
	 * The feature id for the '<em><b>Succeeds</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHI_NODE__SUCCEEDS = OPERATION_NODE__SUCCEEDS;

	/**
	 * The feature id for the '<em><b>Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHI_NODE__FUNCTION = OPERATION_NODE__FUNCTION;

	/**
	 * The feature id for the '<em><b>Args</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHI_NODE__ARGS = OPERATION_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>PHI node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHI_NODE_FEATURE_COUNT = OPERATION_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>PHI node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHI_NODE_OPERATION_COUNT = OPERATION_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cdfg.cdfg.impl.AnnotationImpl <em>Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cdfg.cdfg.impl.AnnotationImpl
	 * @see cdfg.cdfg.impl.cdfgPackageImpl#getAnnotation()
	 * @generated
	 */
	int ANNOTATION = 17;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cdfg.cdfg.impl.PHI_argImpl <em>PHI arg</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cdfg.cdfg.impl.PHI_argImpl
	 * @see cdfg.cdfg.impl.cdfgPackageImpl#getPHI_arg()
	 * @generated
	 */
	int PHI_ARG = 19;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHI_ARG__FROM = 0;

	/**
	 * The feature id for the '<em><b>Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHI_ARG__DATA = 1;

	/**
	 * The number of structural features of the '<em>PHI arg</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHI_ARG_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>PHI arg</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHI_ARG_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cdfg.cdfg.BranchCondition <em>Branch Condition</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cdfg.cdfg.BranchCondition
	 * @see cdfg.cdfg.impl.cdfgPackageImpl#getBranchCondition()
	 * @generated
	 */
	int BRANCH_CONDITION = 20;

	/**
	 * The meta object id for the '{@link cdfg.cdfg.Quantization <em>Quantization</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cdfg.cdfg.Quantization
	 * @see cdfg.cdfg.impl.cdfgPackageImpl#getQuantization()
	 * @generated
	 */
	int QUANTIZATION = 21;

	/**
	 * The meta object id for the '{@link cdfg.cdfg.Overflow <em>Overflow</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cdfg.cdfg.Overflow
	 * @see cdfg.cdfg.impl.cdfgPackageImpl#getOverflow()
	 * @generated
	 */
	int OVERFLOW = 22;

	/**
	 * The meta object id for the '{@link cdfg.cdfg.Standard <em>Standard</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cdfg.cdfg.Standard
	 * @see cdfg.cdfg.impl.cdfgPackageImpl#getStandard()
	 * @generated
	 */
	int STANDARD = 23;


	/**
	 * Returns the meta object for class '{@link cdfg.cdfg.CFG <em>CFG</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CFG</em>'.
	 * @see cdfg.cdfg.CFG
	 * @generated
	 */
	EClass getCFG();

	/**
	 * Returns the meta object for the containment reference list '{@link cdfg.cdfg.CFG#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nodes</em>'.
	 * @see cdfg.cdfg.CFG#getNodes()
	 * @see #getCFG()
	 * @generated
	 */
	EReference getCFG_Nodes();

	/**
	 * Returns the meta object for the reference '{@link cdfg.cdfg.CFG#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start</em>'.
	 * @see cdfg.cdfg.CFG#getStart()
	 * @see #getCFG()
	 * @generated
	 */
	EReference getCFG_Start();

	/**
	 * Returns the meta object for the containment reference list '{@link cdfg.cdfg.CFG#getArcs <em>Arcs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arcs</em>'.
	 * @see cdfg.cdfg.CFG#getArcs()
	 * @see #getCFG()
	 * @generated
	 */
	EReference getCFG_Arcs();

	/**
	 * Returns the meta object for class '{@link cdfg.cdfg.DFG <em>DFG</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DFG</em>'.
	 * @see cdfg.cdfg.DFG
	 * @generated
	 */
	EClass getDFG();

	/**
	 * Returns the meta object for the containment reference '{@link cdfg.cdfg.DFG#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source</em>'.
	 * @see cdfg.cdfg.DFG#getSource()
	 * @see #getDFG()
	 * @generated
	 */
	EReference getDFG_Source();

	/**
	 * Returns the meta object for the containment reference '{@link cdfg.cdfg.DFG#getSink <em>Sink</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sink</em>'.
	 * @see cdfg.cdfg.DFG#getSink()
	 * @see #getDFG()
	 * @generated
	 */
	EReference getDFG_Sink();

	/**
	 * Returns the meta object for the containment reference list '{@link cdfg.cdfg.DFG#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nodes</em>'.
	 * @see cdfg.cdfg.DFG#getNodes()
	 * @see #getDFG()
	 * @generated
	 */
	EReference getDFG_Nodes();

	/**
	 * Returns the meta object for the containment reference list '{@link cdfg.cdfg.DFG#getArcs <em>Arcs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arcs</em>'.
	 * @see cdfg.cdfg.DFG#getArcs()
	 * @see #getDFG()
	 * @generated
	 */
	EReference getDFG_Arcs();

	/**
	 * Returns the meta object for the reference list '{@link cdfg.cdfg.DFG#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>From</em>'.
	 * @see cdfg.cdfg.DFG#getFrom()
	 * @see #getDFG()
	 * @generated
	 */
	EReference getDFG_From();

	/**
	 * Returns the meta object for the reference list '{@link cdfg.cdfg.DFG#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>To</em>'.
	 * @see cdfg.cdfg.DFG#getTo()
	 * @see #getDFG()
	 * @generated
	 */
	EReference getDFG_To();

	/**
	 * Returns the meta object for class '{@link cdfg.cdfg.OperationNode <em>Operation Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation Node</em>'.
	 * @see cdfg.cdfg.OperationNode
	 * @generated
	 */
	EClass getOperationNode();

	/**
	 * Returns the meta object for the reference list '{@link cdfg.cdfg.OperationNode#getPrecedes <em>Precedes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Precedes</em>'.
	 * @see cdfg.cdfg.OperationNode#getPrecedes()
	 * @see #getOperationNode()
	 * @generated
	 */
	EReference getOperationNode_Precedes();

	/**
	 * Returns the meta object for the reference list '{@link cdfg.cdfg.OperationNode#getSucceeds <em>Succeeds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Succeeds</em>'.
	 * @see cdfg.cdfg.OperationNode#getSucceeds()
	 * @see #getOperationNode()
	 * @generated
	 */
	EReference getOperationNode_Succeeds();

	/**
	 * Returns the meta object for the reference '{@link cdfg.cdfg.OperationNode#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Function</em>'.
	 * @see cdfg.cdfg.OperationNode#getFunction()
	 * @see #getOperationNode()
	 * @generated
	 */
	EReference getOperationNode_Function();

	/**
	 * Returns the meta object for class '{@link cdfg.cdfg.DFGArc <em>DFG Arc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DFG Arc</em>'.
	 * @see cdfg.cdfg.DFGArc
	 * @generated
	 */
	EClass getDFGArc();

	/**
	 * Returns the meta object for the reference '{@link cdfg.cdfg.DFGArc#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see cdfg.cdfg.DFGArc#getSource()
	 * @see #getDFGArc()
	 * @generated
	 */
	EReference getDFGArc_Source();

	/**
	 * Returns the meta object for the reference '{@link cdfg.cdfg.DFGArc#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see cdfg.cdfg.DFGArc#getTarget()
	 * @see #getDFGArc()
	 * @generated
	 */
	EReference getDFGArc_Target();

	/**
	 * Returns the meta object for class '{@link cdfg.cdfg.Source <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source</em>'.
	 * @see cdfg.cdfg.Source
	 * @generated
	 */
	EClass getSource();

	/**
	 * Returns the meta object for class '{@link cdfg.cdfg.Sink <em>Sink</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sink</em>'.
	 * @see cdfg.cdfg.Sink
	 * @generated
	 */
	EClass getSink();

	/**
	 * Returns the meta object for class '{@link cdfg.cdfg.DFGNode <em>DFG Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DFG Node</em>'.
	 * @see cdfg.cdfg.DFGNode
	 * @generated
	 */
	EClass getDFGNode();

	/**
	 * Returns the meta object for the reference list '{@link cdfg.cdfg.DFGNode#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>To</em>'.
	 * @see cdfg.cdfg.DFGNode#getTo()
	 * @see #getDFGNode()
	 * @generated
	 */
	EReference getDFGNode_To();

	/**
	 * Returns the meta object for the reference list '{@link cdfg.cdfg.DFGNode#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>From</em>'.
	 * @see cdfg.cdfg.DFGNode#getFrom()
	 * @see #getDFGNode()
	 * @generated
	 */
	EReference getDFGNode_From();

	/**
	 * Returns the meta object for class '{@link cdfg.cdfg.Computing <em>Computing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Computing</em>'.
	 * @see cdfg.cdfg.Computing
	 * @generated
	 */
	EClass getComputing();

	/**
	 * Returns the meta object for class '{@link cdfg.cdfg.Load <em>Load</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Load</em>'.
	 * @see cdfg.cdfg.Load
	 * @generated
	 */
	EClass getLoad();

	/**
	 * Returns the meta object for class '{@link cdfg.cdfg.Store <em>Store</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Store</em>'.
	 * @see cdfg.cdfg.Store
	 * @generated
	 */
	EClass getStore();

	/**
	 * Returns the meta object for class '{@link cdfg.cdfg.Jump <em>Jump</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Jump</em>'.
	 * @see cdfg.cdfg.Jump
	 * @generated
	 */
	EClass getJump();

	/**
	 * Returns the meta object for the reference '{@link cdfg.cdfg.Jump#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see cdfg.cdfg.Jump#getSource()
	 * @see #getJump()
	 * @generated
	 */
	EReference getJump_Source();

	/**
	 * Returns the meta object for the reference '{@link cdfg.cdfg.Jump#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see cdfg.cdfg.Jump#getTarget()
	 * @see #getJump()
	 * @generated
	 */
	EReference getJump_Target();

	/**
	 * Returns the meta object for the attribute '{@link cdfg.cdfg.Jump#getBranchCondition <em>Branch Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Branch Condition</em>'.
	 * @see cdfg.cdfg.Jump#getBranchCondition()
	 * @see #getJump()
	 * @generated
	 */
	EAttribute getJump_BranchCondition();

	/**
	 * Returns the meta object for the reference '{@link cdfg.cdfg.Jump#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Condition</em>'.
	 * @see cdfg.cdfg.Jump#getCondition()
	 * @see #getJump()
	 * @generated
	 */
	EReference getJump_Condition();

	/**
	 * Returns the meta object for class '{@link cdfg.cdfg.DataNode <em>Data Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Node</em>'.
	 * @see cdfg.cdfg.DataNode
	 * @generated
	 */
	EClass getDataNode();

	/**
	 * Returns the meta object for the reference '{@link cdfg.cdfg.DataNode#getDefinition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Definition</em>'.
	 * @see cdfg.cdfg.DataNode#getDefinition()
	 * @see #getDataNode()
	 * @generated
	 */
	EReference getDataNode_Definition();

	/**
	 * Returns the meta object for the reference list '{@link cdfg.cdfg.DataNode#getUsed <em>Used</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Used</em>'.
	 * @see cdfg.cdfg.DataNode#getUsed()
	 * @see #getDataNode()
	 * @generated
	 */
	EReference getDataNode_Used();

	/**
	 * Returns the meta object for the attribute '{@link cdfg.cdfg.DataNode#isConstant <em>Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constant</em>'.
	 * @see cdfg.cdfg.DataNode#isConstant()
	 * @see #getDataNode()
	 * @generated
	 */
	EAttribute getDataNode_Constant();

	/**
	 * Returns the meta object for the attribute '{@link cdfg.cdfg.DataNode#getNumberOfBits <em>Number Of Bits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Bits</em>'.
	 * @see cdfg.cdfg.DataNode#getNumberOfBits()
	 * @see #getDataNode()
	 * @generated
	 */
	EAttribute getDataNode_NumberOfBits();

	/**
	 * Returns the meta object for the attribute '{@link cdfg.cdfg.DataNode#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see cdfg.cdfg.DataNode#getValue()
	 * @see #getDataNode()
	 * @generated
	 */
	EAttribute getDataNode_Value();

	/**
	 * Returns the meta object for class '{@link cdfg.cdfg.Integer <em>Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer</em>'.
	 * @see cdfg.cdfg.Integer
	 * @generated
	 */
	EClass getInteger();

	/**
	 * Returns the meta object for the attribute '{@link cdfg.cdfg.Integer#isSigned <em>Signed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Signed</em>'.
	 * @see cdfg.cdfg.Integer#isSigned()
	 * @see #getInteger()
	 * @generated
	 */
	EAttribute getInteger_Signed();

	/**
	 * Returns the meta object for class '{@link cdfg.cdfg.FixedPoint <em>Fixed Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fixed Point</em>'.
	 * @see cdfg.cdfg.FixedPoint
	 * @generated
	 */
	EClass getFixedPoint();

	/**
	 * Returns the meta object for the attribute '{@link cdfg.cdfg.FixedPoint#getQuantization <em>Quantization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantization</em>'.
	 * @see cdfg.cdfg.FixedPoint#getQuantization()
	 * @see #getFixedPoint()
	 * @generated
	 */
	EAttribute getFixedPoint_Quantization();

	/**
	 * Returns the meta object for the attribute '{@link cdfg.cdfg.FixedPoint#getOverflow <em>Overflow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Overflow</em>'.
	 * @see cdfg.cdfg.FixedPoint#getOverflow()
	 * @see #getFixedPoint()
	 * @generated
	 */
	EAttribute getFixedPoint_Overflow();

	/**
	 * Returns the meta object for the attribute '{@link cdfg.cdfg.FixedPoint#getWl <em>Wl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wl</em>'.
	 * @see cdfg.cdfg.FixedPoint#getWl()
	 * @see #getFixedPoint()
	 * @generated
	 */
	EAttribute getFixedPoint_Wl();

	/**
	 * Returns the meta object for the attribute '{@link cdfg.cdfg.FixedPoint#getIwl <em>Iwl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Iwl</em>'.
	 * @see cdfg.cdfg.FixedPoint#getIwl()
	 * @see #getFixedPoint()
	 * @generated
	 */
	EAttribute getFixedPoint_Iwl();

	/**
	 * Returns the meta object for the attribute '{@link cdfg.cdfg.FixedPoint#getNbits <em>Nbits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nbits</em>'.
	 * @see cdfg.cdfg.FixedPoint#getNbits()
	 * @see #getFixedPoint()
	 * @generated
	 */
	EAttribute getFixedPoint_Nbits();

	/**
	 * Returns the meta object for class '{@link cdfg.cdfg.Float <em>Float</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Float</em>'.
	 * @see cdfg.cdfg.Float
	 * @generated
	 */
	EClass getFloat();

	/**
	 * Returns the meta object for the attribute '{@link cdfg.cdfg.Float#getStandard <em>Standard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Standard</em>'.
	 * @see cdfg.cdfg.Float#getStandard()
	 * @see #getFloat()
	 * @generated
	 */
	EAttribute getFloat_Standard();

	/**
	 * Returns the meta object for class '{@link cdfg.cdfg.Boolean <em>Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean</em>'.
	 * @see cdfg.cdfg.Boolean
	 * @generated
	 */
	EClass getBoolean();

	/**
	 * Returns the meta object for class '{@link cdfg.cdfg.PHI_node <em>PHI node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PHI node</em>'.
	 * @see cdfg.cdfg.PHI_node
	 * @generated
	 */
	EClass getPHI_node();

	/**
	 * Returns the meta object for the containment reference list '{@link cdfg.cdfg.PHI_node#getArgs <em>Args</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Args</em>'.
	 * @see cdfg.cdfg.PHI_node#getArgs()
	 * @see #getPHI_node()
	 * @generated
	 */
	EReference getPHI_node_Args();

	/**
	 * Returns the meta object for class '{@link cdfg.cdfg.Annotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation</em>'.
	 * @see cdfg.cdfg.Annotation
	 * @generated
	 */
	EClass getAnnotation();

	/**
	 * Returns the meta object for the attribute '{@link cdfg.cdfg.Annotation#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see cdfg.cdfg.Annotation#getKey()
	 * @see #getAnnotation()
	 * @generated
	 */
	EAttribute getAnnotation_Key();

	/**
	 * Returns the meta object for the attribute '{@link cdfg.cdfg.Annotation#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see cdfg.cdfg.Annotation#getValue()
	 * @see #getAnnotation()
	 * @generated
	 */
	EAttribute getAnnotation_Value();

	/**
	 * Returns the meta object for class '{@link cdfg.cdfg.Annotable <em>Annotable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotable</em>'.
	 * @see cdfg.cdfg.Annotable
	 * @generated
	 */
	EClass getAnnotable();

	/**
	 * Returns the meta object for the containment reference list '{@link cdfg.cdfg.Annotable#getAnnotations <em>Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annotations</em>'.
	 * @see cdfg.cdfg.Annotable#getAnnotations()
	 * @see #getAnnotable()
	 * @generated
	 */
	EReference getAnnotable_Annotations();

	/**
	 * Returns the meta object for class '{@link cdfg.cdfg.PHI_arg <em>PHI arg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PHI arg</em>'.
	 * @see cdfg.cdfg.PHI_arg
	 * @generated
	 */
	EClass getPHI_arg();

	/**
	 * Returns the meta object for the reference '{@link cdfg.cdfg.PHI_arg#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see cdfg.cdfg.PHI_arg#getFrom()
	 * @see #getPHI_arg()
	 * @generated
	 */
	EReference getPHI_arg_From();

	/**
	 * Returns the meta object for the reference '{@link cdfg.cdfg.PHI_arg#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data</em>'.
	 * @see cdfg.cdfg.PHI_arg#getData()
	 * @see #getPHI_arg()
	 * @generated
	 */
	EReference getPHI_arg_Data();

	/**
	 * Returns the meta object for enum '{@link cdfg.cdfg.BranchCondition <em>Branch Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Branch Condition</em>'.
	 * @see cdfg.cdfg.BranchCondition
	 * @generated
	 */
	EEnum getBranchCondition();

	/**
	 * Returns the meta object for enum '{@link cdfg.cdfg.Quantization <em>Quantization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Quantization</em>'.
	 * @see cdfg.cdfg.Quantization
	 * @generated
	 */
	EEnum getQuantization();

	/**
	 * Returns the meta object for enum '{@link cdfg.cdfg.Overflow <em>Overflow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Overflow</em>'.
	 * @see cdfg.cdfg.Overflow
	 * @generated
	 */
	EEnum getOverflow();

	/**
	 * Returns the meta object for enum '{@link cdfg.cdfg.Standard <em>Standard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Standard</em>'.
	 * @see cdfg.cdfg.Standard
	 * @generated
	 */
	EEnum getStandard();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	cdfgFactory getcdfgFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link cdfg.cdfg.impl.CFGImpl <em>CFG</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cdfg.cdfg.impl.CFGImpl
		 * @see cdfg.cdfg.impl.cdfgPackageImpl#getCFG()
		 * @generated
		 */
		EClass CFG = eINSTANCE.getCFG();

		/**
		 * The meta object literal for the '<em><b>Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CFG__NODES = eINSTANCE.getCFG_Nodes();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CFG__START = eINSTANCE.getCFG_Start();

		/**
		 * The meta object literal for the '<em><b>Arcs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CFG__ARCS = eINSTANCE.getCFG_Arcs();

		/**
		 * The meta object literal for the '{@link cdfg.cdfg.impl.DFGImpl <em>DFG</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cdfg.cdfg.impl.DFGImpl
		 * @see cdfg.cdfg.impl.cdfgPackageImpl#getDFG()
		 * @generated
		 */
		EClass DFG = eINSTANCE.getDFG();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DFG__SOURCE = eINSTANCE.getDFG_Source();

		/**
		 * The meta object literal for the '<em><b>Sink</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DFG__SINK = eINSTANCE.getDFG_Sink();

		/**
		 * The meta object literal for the '<em><b>Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DFG__NODES = eINSTANCE.getDFG_Nodes();

		/**
		 * The meta object literal for the '<em><b>Arcs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DFG__ARCS = eINSTANCE.getDFG_Arcs();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DFG__FROM = eINSTANCE.getDFG_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DFG__TO = eINSTANCE.getDFG_To();

		/**
		 * The meta object literal for the '{@link cdfg.cdfg.impl.OperationNodeImpl <em>Operation Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cdfg.cdfg.impl.OperationNodeImpl
		 * @see cdfg.cdfg.impl.cdfgPackageImpl#getOperationNode()
		 * @generated
		 */
		EClass OPERATION_NODE = eINSTANCE.getOperationNode();

		/**
		 * The meta object literal for the '<em><b>Precedes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_NODE__PRECEDES = eINSTANCE.getOperationNode_Precedes();

		/**
		 * The meta object literal for the '<em><b>Succeeds</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_NODE__SUCCEEDS = eINSTANCE.getOperationNode_Succeeds();

		/**
		 * The meta object literal for the '<em><b>Function</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_NODE__FUNCTION = eINSTANCE.getOperationNode_Function();

		/**
		 * The meta object literal for the '{@link cdfg.cdfg.impl.DFGArcImpl <em>DFG Arc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cdfg.cdfg.impl.DFGArcImpl
		 * @see cdfg.cdfg.impl.cdfgPackageImpl#getDFGArc()
		 * @generated
		 */
		EClass DFG_ARC = eINSTANCE.getDFGArc();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DFG_ARC__SOURCE = eINSTANCE.getDFGArc_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DFG_ARC__TARGET = eINSTANCE.getDFGArc_Target();

		/**
		 * The meta object literal for the '{@link cdfg.cdfg.impl.SourceImpl <em>Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cdfg.cdfg.impl.SourceImpl
		 * @see cdfg.cdfg.impl.cdfgPackageImpl#getSource()
		 * @generated
		 */
		EClass SOURCE = eINSTANCE.getSource();

		/**
		 * The meta object literal for the '{@link cdfg.cdfg.impl.SinkImpl <em>Sink</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cdfg.cdfg.impl.SinkImpl
		 * @see cdfg.cdfg.impl.cdfgPackageImpl#getSink()
		 * @generated
		 */
		EClass SINK = eINSTANCE.getSink();

		/**
		 * The meta object literal for the '{@link cdfg.cdfg.impl.DFGNodeImpl <em>DFG Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cdfg.cdfg.impl.DFGNodeImpl
		 * @see cdfg.cdfg.impl.cdfgPackageImpl#getDFGNode()
		 * @generated
		 */
		EClass DFG_NODE = eINSTANCE.getDFGNode();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DFG_NODE__TO = eINSTANCE.getDFGNode_To();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DFG_NODE__FROM = eINSTANCE.getDFGNode_From();

		/**
		 * The meta object literal for the '{@link cdfg.cdfg.impl.ComputingImpl <em>Computing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cdfg.cdfg.impl.ComputingImpl
		 * @see cdfg.cdfg.impl.cdfgPackageImpl#getComputing()
		 * @generated
		 */
		EClass COMPUTING = eINSTANCE.getComputing();

		/**
		 * The meta object literal for the '{@link cdfg.cdfg.impl.LoadImpl <em>Load</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cdfg.cdfg.impl.LoadImpl
		 * @see cdfg.cdfg.impl.cdfgPackageImpl#getLoad()
		 * @generated
		 */
		EClass LOAD = eINSTANCE.getLoad();

		/**
		 * The meta object literal for the '{@link cdfg.cdfg.impl.StoreImpl <em>Store</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cdfg.cdfg.impl.StoreImpl
		 * @see cdfg.cdfg.impl.cdfgPackageImpl#getStore()
		 * @generated
		 */
		EClass STORE = eINSTANCE.getStore();

		/**
		 * The meta object literal for the '{@link cdfg.cdfg.impl.JumpImpl <em>Jump</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cdfg.cdfg.impl.JumpImpl
		 * @see cdfg.cdfg.impl.cdfgPackageImpl#getJump()
		 * @generated
		 */
		EClass JUMP = eINSTANCE.getJump();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JUMP__SOURCE = eINSTANCE.getJump_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JUMP__TARGET = eINSTANCE.getJump_Target();

		/**
		 * The meta object literal for the '<em><b>Branch Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JUMP__BRANCH_CONDITION = eINSTANCE.getJump_BranchCondition();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JUMP__CONDITION = eINSTANCE.getJump_Condition();

		/**
		 * The meta object literal for the '{@link cdfg.cdfg.impl.DataNodeImpl <em>Data Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cdfg.cdfg.impl.DataNodeImpl
		 * @see cdfg.cdfg.impl.cdfgPackageImpl#getDataNode()
		 * @generated
		 */
		EClass DATA_NODE = eINSTANCE.getDataNode();

		/**
		 * The meta object literal for the '<em><b>Definition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_NODE__DEFINITION = eINSTANCE.getDataNode_Definition();

		/**
		 * The meta object literal for the '<em><b>Used</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_NODE__USED = eINSTANCE.getDataNode_Used();

		/**
		 * The meta object literal for the '<em><b>Constant</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_NODE__CONSTANT = eINSTANCE.getDataNode_Constant();

		/**
		 * The meta object literal for the '<em><b>Number Of Bits</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_NODE__NUMBER_OF_BITS = eINSTANCE.getDataNode_NumberOfBits();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_NODE__VALUE = eINSTANCE.getDataNode_Value();

		/**
		 * The meta object literal for the '{@link cdfg.cdfg.impl.IntegerImpl <em>Integer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cdfg.cdfg.impl.IntegerImpl
		 * @see cdfg.cdfg.impl.cdfgPackageImpl#getInteger()
		 * @generated
		 */
		EClass INTEGER = eINSTANCE.getInteger();

		/**
		 * The meta object literal for the '<em><b>Signed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER__SIGNED = eINSTANCE.getInteger_Signed();

		/**
		 * The meta object literal for the '{@link cdfg.cdfg.impl.FixedPointImpl <em>Fixed Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cdfg.cdfg.impl.FixedPointImpl
		 * @see cdfg.cdfg.impl.cdfgPackageImpl#getFixedPoint()
		 * @generated
		 */
		EClass FIXED_POINT = eINSTANCE.getFixedPoint();

		/**
		 * The meta object literal for the '<em><b>Quantization</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIXED_POINT__QUANTIZATION = eINSTANCE.getFixedPoint_Quantization();

		/**
		 * The meta object literal for the '<em><b>Overflow</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIXED_POINT__OVERFLOW = eINSTANCE.getFixedPoint_Overflow();

		/**
		 * The meta object literal for the '<em><b>Wl</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIXED_POINT__WL = eINSTANCE.getFixedPoint_Wl();

		/**
		 * The meta object literal for the '<em><b>Iwl</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIXED_POINT__IWL = eINSTANCE.getFixedPoint_Iwl();

		/**
		 * The meta object literal for the '<em><b>Nbits</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIXED_POINT__NBITS = eINSTANCE.getFixedPoint_Nbits();

		/**
		 * The meta object literal for the '{@link cdfg.cdfg.impl.FloatImpl <em>Float</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cdfg.cdfg.impl.FloatImpl
		 * @see cdfg.cdfg.impl.cdfgPackageImpl#getFloat()
		 * @generated
		 */
		EClass FLOAT = eINSTANCE.getFloat();

		/**
		 * The meta object literal for the '<em><b>Standard</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOAT__STANDARD = eINSTANCE.getFloat_Standard();

		/**
		 * The meta object literal for the '{@link cdfg.cdfg.impl.BooleanImpl <em>Boolean</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cdfg.cdfg.impl.BooleanImpl
		 * @see cdfg.cdfg.impl.cdfgPackageImpl#getBoolean()
		 * @generated
		 */
		EClass BOOLEAN = eINSTANCE.getBoolean();

		/**
		 * The meta object literal for the '{@link cdfg.cdfg.impl.PHI_nodeImpl <em>PHI node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cdfg.cdfg.impl.PHI_nodeImpl
		 * @see cdfg.cdfg.impl.cdfgPackageImpl#getPHI_node()
		 * @generated
		 */
		EClass PHI_NODE = eINSTANCE.getPHI_node();

		/**
		 * The meta object literal for the '<em><b>Args</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHI_NODE__ARGS = eINSTANCE.getPHI_node_Args();

		/**
		 * The meta object literal for the '{@link cdfg.cdfg.impl.AnnotationImpl <em>Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cdfg.cdfg.impl.AnnotationImpl
		 * @see cdfg.cdfg.impl.cdfgPackageImpl#getAnnotation()
		 * @generated
		 */
		EClass ANNOTATION = eINSTANCE.getAnnotation();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNOTATION__KEY = eINSTANCE.getAnnotation_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNOTATION__VALUE = eINSTANCE.getAnnotation_Value();

		/**
		 * The meta object literal for the '{@link cdfg.cdfg.impl.AnnotableImpl <em>Annotable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cdfg.cdfg.impl.AnnotableImpl
		 * @see cdfg.cdfg.impl.cdfgPackageImpl#getAnnotable()
		 * @generated
		 */
		EClass ANNOTABLE = eINSTANCE.getAnnotable();

		/**
		 * The meta object literal for the '<em><b>Annotations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNOTABLE__ANNOTATIONS = eINSTANCE.getAnnotable_Annotations();

		/**
		 * The meta object literal for the '{@link cdfg.cdfg.impl.PHI_argImpl <em>PHI arg</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cdfg.cdfg.impl.PHI_argImpl
		 * @see cdfg.cdfg.impl.cdfgPackageImpl#getPHI_arg()
		 * @generated
		 */
		EClass PHI_ARG = eINSTANCE.getPHI_arg();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHI_ARG__FROM = eINSTANCE.getPHI_arg_From();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHI_ARG__DATA = eINSTANCE.getPHI_arg_Data();

		/**
		 * The meta object literal for the '{@link cdfg.cdfg.BranchCondition <em>Branch Condition</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cdfg.cdfg.BranchCondition
		 * @see cdfg.cdfg.impl.cdfgPackageImpl#getBranchCondition()
		 * @generated
		 */
		EEnum BRANCH_CONDITION = eINSTANCE.getBranchCondition();

		/**
		 * The meta object literal for the '{@link cdfg.cdfg.Quantization <em>Quantization</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cdfg.cdfg.Quantization
		 * @see cdfg.cdfg.impl.cdfgPackageImpl#getQuantization()
		 * @generated
		 */
		EEnum QUANTIZATION = eINSTANCE.getQuantization();

		/**
		 * The meta object literal for the '{@link cdfg.cdfg.Overflow <em>Overflow</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cdfg.cdfg.Overflow
		 * @see cdfg.cdfg.impl.cdfgPackageImpl#getOverflow()
		 * @generated
		 */
		EEnum OVERFLOW = eINSTANCE.getOverflow();

		/**
		 * The meta object literal for the '{@link cdfg.cdfg.Standard <em>Standard</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cdfg.cdfg.Standard
		 * @see cdfg.cdfg.impl.cdfgPackageImpl#getStandard()
		 * @generated
		 */
		EEnum STANDARD = eINSTANCE.getStandard();

	}

} //cdfgPackage
