/**
 */
package cdfg.cdfg.util;

import cdfg.cdfg.Annotable;
import cdfg.cdfg.Annotation;
import cdfg.cdfg.CFG;
import cdfg.cdfg.Computing;
import cdfg.cdfg.DFG;
import cdfg.cdfg.DFGArc;
import cdfg.cdfg.DFGNode;
import cdfg.cdfg.DataNode;
import cdfg.cdfg.FixedPoint;
import cdfg.cdfg.Jump;
import cdfg.cdfg.Load;
import cdfg.cdfg.OperationNode;
import cdfg.cdfg.PHI_arg;
import cdfg.cdfg.PHI_node;
import cdfg.cdfg.Sink;
import cdfg.cdfg.Source;
import cdfg.cdfg.Store;
import cdfg.cdfg.cdfgPackage;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see cdfg.cdfg.cdfgPackage
 * @generated
 */
public class cdfgAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static cdfgPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public cdfgAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = cdfgPackage.eINSTANCE;
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
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
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
	protected cdfgSwitch<Adapter> modelSwitch =
		new cdfgSwitch<Adapter>() {
			@Override
			public Adapter caseCFG(CFG object) {
				return createCFGAdapter();
			}
			@Override
			public Adapter caseDFG(DFG object) {
				return createDFGAdapter();
			}
			@Override
			public Adapter caseOperationNode(OperationNode object) {
				return createOperationNodeAdapter();
			}
			@Override
			public Adapter caseDFGArc(DFGArc object) {
				return createDFGArcAdapter();
			}
			@Override
			public Adapter caseSource(Source object) {
				return createSourceAdapter();
			}
			@Override
			public Adapter caseSink(Sink object) {
				return createSinkAdapter();
			}
			@Override
			public Adapter caseDFGNode(DFGNode object) {
				return createDFGNodeAdapter();
			}
			@Override
			public Adapter caseComputing(Computing object) {
				return createComputingAdapter();
			}
			@Override
			public Adapter caseLoad(Load object) {
				return createLoadAdapter();
			}
			@Override
			public Adapter caseStore(Store object) {
				return createStoreAdapter();
			}
			@Override
			public Adapter caseJump(Jump object) {
				return createJumpAdapter();
			}
			@Override
			public Adapter caseDataNode(DataNode object) {
				return createDataNodeAdapter();
			}
			@Override
			public Adapter caseInteger(cdfg.cdfg.Integer object) {
				return createIntegerAdapter();
			}
			@Override
			public Adapter caseFixedPoint(FixedPoint object) {
				return createFixedPointAdapter();
			}
			@Override
			public Adapter caseFloat(cdfg.cdfg.Float object) {
				return createFloatAdapter();
			}
			@Override
			public Adapter caseBoolean(cdfg.cdfg.Boolean object) {
				return createBooleanAdapter();
			}
			@Override
			public Adapter casePHI_node(PHI_node object) {
				return createPHI_nodeAdapter();
			}
			@Override
			public Adapter caseAnnotation(Annotation object) {
				return createAnnotationAdapter();
			}
			@Override
			public Adapter caseAnnotable(Annotable object) {
				return createAnnotableAdapter();
			}
			@Override
			public Adapter casePHI_arg(PHI_arg object) {
				return createPHI_argAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
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
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link cdfg.cdfg.CFG <em>CFG</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cdfg.cdfg.CFG
	 * @generated
	 */
	public Adapter createCFGAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cdfg.cdfg.DFG <em>DFG</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cdfg.cdfg.DFG
	 * @generated
	 */
	public Adapter createDFGAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cdfg.cdfg.OperationNode <em>Operation Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cdfg.cdfg.OperationNode
	 * @generated
	 */
	public Adapter createOperationNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cdfg.cdfg.DFGArc <em>DFG Arc</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cdfg.cdfg.DFGArc
	 * @generated
	 */
	public Adapter createDFGArcAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cdfg.cdfg.Source <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cdfg.cdfg.Source
	 * @generated
	 */
	public Adapter createSourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cdfg.cdfg.Sink <em>Sink</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cdfg.cdfg.Sink
	 * @generated
	 */
	public Adapter createSinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cdfg.cdfg.DFGNode <em>DFG Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cdfg.cdfg.DFGNode
	 * @generated
	 */
	public Adapter createDFGNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cdfg.cdfg.Computing <em>Computing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cdfg.cdfg.Computing
	 * @generated
	 */
	public Adapter createComputingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cdfg.cdfg.Load <em>Load</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cdfg.cdfg.Load
	 * @generated
	 */
	public Adapter createLoadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cdfg.cdfg.Store <em>Store</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cdfg.cdfg.Store
	 * @generated
	 */
	public Adapter createStoreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cdfg.cdfg.Jump <em>Jump</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cdfg.cdfg.Jump
	 * @generated
	 */
	public Adapter createJumpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cdfg.cdfg.DataNode <em>Data Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cdfg.cdfg.DataNode
	 * @generated
	 */
	public Adapter createDataNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cdfg.cdfg.Integer <em>Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cdfg.cdfg.Integer
	 * @generated
	 */
	public Adapter createIntegerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cdfg.cdfg.FixedPoint <em>Fixed Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cdfg.cdfg.FixedPoint
	 * @generated
	 */
	public Adapter createFixedPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cdfg.cdfg.Float <em>Float</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cdfg.cdfg.Float
	 * @generated
	 */
	public Adapter createFloatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cdfg.cdfg.Boolean <em>Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cdfg.cdfg.Boolean
	 * @generated
	 */
	public Adapter createBooleanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cdfg.cdfg.PHI_node <em>PHI node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cdfg.cdfg.PHI_node
	 * @generated
	 */
	public Adapter createPHI_nodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cdfg.cdfg.Annotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cdfg.cdfg.Annotation
	 * @generated
	 */
	public Adapter createAnnotationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cdfg.cdfg.Annotable <em>Annotable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cdfg.cdfg.Annotable
	 * @generated
	 */
	public Adapter createAnnotableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cdfg.cdfg.PHI_arg <em>PHI arg</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cdfg.cdfg.PHI_arg
	 * @generated
	 */
	public Adapter createPHI_argAdapter() {
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
	public Adapter createEObjectAdapter() {
		return null;
	}

} //cdfgAdapterFactory
