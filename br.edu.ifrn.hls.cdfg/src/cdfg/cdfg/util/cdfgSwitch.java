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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see cdfg.cdfg.cdfgPackage
 * @generated
 */
public class cdfgSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static cdfgPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public cdfgSwitch() {
		if (modelPackage == null) {
			modelPackage = cdfgPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case cdfgPackage.CFG: {
				CFG cfg = (CFG)theEObject;
				T result = caseCFG(cfg);
				if (result == null) result = caseAnnotable(cfg);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case cdfgPackage.DFG: {
				DFG dfg = (DFG)theEObject;
				T result = caseDFG(dfg);
				if (result == null) result = caseAnnotable(dfg);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case cdfgPackage.OPERATION_NODE: {
				OperationNode operationNode = (OperationNode)theEObject;
				T result = caseOperationNode(operationNode);
				if (result == null) result = caseDFGNode(operationNode);
				if (result == null) result = caseAnnotable(operationNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case cdfgPackage.DFG_ARC: {
				DFGArc dfgArc = (DFGArc)theEObject;
				T result = caseDFGArc(dfgArc);
				if (result == null) result = caseAnnotable(dfgArc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case cdfgPackage.SOURCE: {
				Source source = (Source)theEObject;
				T result = caseSource(source);
				if (result == null) result = caseDFGNode(source);
				if (result == null) result = caseAnnotable(source);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case cdfgPackage.SINK: {
				Sink sink = (Sink)theEObject;
				T result = caseSink(sink);
				if (result == null) result = caseDFGNode(sink);
				if (result == null) result = caseAnnotable(sink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case cdfgPackage.DFG_NODE: {
				DFGNode dfgNode = (DFGNode)theEObject;
				T result = caseDFGNode(dfgNode);
				if (result == null) result = caseAnnotable(dfgNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case cdfgPackage.COMPUTING: {
				Computing computing = (Computing)theEObject;
				T result = caseComputing(computing);
				if (result == null) result = caseOperationNode(computing);
				if (result == null) result = caseDFGNode(computing);
				if (result == null) result = caseAnnotable(computing);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case cdfgPackage.LOAD: {
				Load load = (Load)theEObject;
				T result = caseLoad(load);
				if (result == null) result = caseOperationNode(load);
				if (result == null) result = caseDFGNode(load);
				if (result == null) result = caseAnnotable(load);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case cdfgPackage.STORE: {
				Store store = (Store)theEObject;
				T result = caseStore(store);
				if (result == null) result = caseOperationNode(store);
				if (result == null) result = caseDFGNode(store);
				if (result == null) result = caseAnnotable(store);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case cdfgPackage.JUMP: {
				Jump jump = (Jump)theEObject;
				T result = caseJump(jump);
				if (result == null) result = caseAnnotable(jump);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case cdfgPackage.DATA_NODE: {
				DataNode dataNode = (DataNode)theEObject;
				T result = caseDataNode(dataNode);
				if (result == null) result = caseDFGNode(dataNode);
				if (result == null) result = caseAnnotable(dataNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case cdfgPackage.INTEGER: {
				cdfg.cdfg.Integer integer = (cdfg.cdfg.Integer)theEObject;
				T result = caseInteger(integer);
				if (result == null) result = caseDataNode(integer);
				if (result == null) result = caseDFGNode(integer);
				if (result == null) result = caseAnnotable(integer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case cdfgPackage.FIXED_POINT: {
				FixedPoint fixedPoint = (FixedPoint)theEObject;
				T result = caseFixedPoint(fixedPoint);
				if (result == null) result = caseDataNode(fixedPoint);
				if (result == null) result = caseDFGNode(fixedPoint);
				if (result == null) result = caseAnnotable(fixedPoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case cdfgPackage.FLOAT: {
				cdfg.cdfg.Float float_ = (cdfg.cdfg.Float)theEObject;
				T result = caseFloat(float_);
				if (result == null) result = caseDataNode(float_);
				if (result == null) result = caseDFGNode(float_);
				if (result == null) result = caseAnnotable(float_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case cdfgPackage.BOOLEAN: {
				cdfg.cdfg.Boolean boolean_ = (cdfg.cdfg.Boolean)theEObject;
				T result = caseBoolean(boolean_);
				if (result == null) result = caseDataNode(boolean_);
				if (result == null) result = caseDFGNode(boolean_);
				if (result == null) result = caseAnnotable(boolean_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case cdfgPackage.PHI_NODE: {
				PHI_node phI_node = (PHI_node)theEObject;
				T result = casePHI_node(phI_node);
				if (result == null) result = caseOperationNode(phI_node);
				if (result == null) result = caseDFGNode(phI_node);
				if (result == null) result = caseAnnotable(phI_node);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case cdfgPackage.ANNOTATION: {
				Annotation annotation = (Annotation)theEObject;
				T result = caseAnnotation(annotation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case cdfgPackage.ANNOTABLE: {
				Annotable annotable = (Annotable)theEObject;
				T result = caseAnnotable(annotable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case cdfgPackage.PHI_ARG: {
				PHI_arg phI_arg = (PHI_arg)theEObject;
				T result = casePHI_arg(phI_arg);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CFG</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CFG</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCFG(CFG object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DFG</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DFG</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDFG(DFG object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationNode(OperationNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DFG Arc</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DFG Arc</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDFGArc(DFGArc object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Source</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Source</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSource(Source object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sink</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sink</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSink(Sink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DFG Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DFG Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDFGNode(DFGNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Computing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Computing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComputing(Computing object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Load</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Load</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLoad(Load object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Store</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Store</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStore(Store object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Jump</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Jump</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJump(Jump object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataNode(DataNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInteger(cdfg.cdfg.Integer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fixed Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fixed Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFixedPoint(FixedPoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Float</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Float</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFloat(cdfg.cdfg.Float object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoolean(cdfg.cdfg.Boolean object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PHI node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PHI node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePHI_node(PHI_node object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotation(Annotation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotable(Annotable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PHI arg</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PHI arg</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePHI_arg(PHI_arg object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //cdfgSwitch
