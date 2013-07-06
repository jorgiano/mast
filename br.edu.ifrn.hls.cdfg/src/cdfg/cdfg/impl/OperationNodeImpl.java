/**
 */
package cdfg.cdfg.impl;

import cdfg.cdfg.OperationNode;
import cdfg.cdfg.cdfgPackage;

import function.function.Function;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link cdfg.cdfg.impl.OperationNodeImpl#getPrecedes <em>Precedes</em>}</li>
 *   <li>{@link cdfg.cdfg.impl.OperationNodeImpl#getSucceeds <em>Succeeds</em>}</li>
 *   <li>{@link cdfg.cdfg.impl.OperationNodeImpl#getFunction <em>Function</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class OperationNodeImpl extends DFGNodeImpl implements OperationNode {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return cdfgPackage.Literals.OPERATION_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<OperationNode> getPrecedes() {
		return (EList<OperationNode>)eGet(cdfgPackage.Literals.OPERATION_NODE__PRECEDES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<OperationNode> getSucceeds() {
		return (EList<OperationNode>)eGet(cdfgPackage.Literals.OPERATION_NODE__SUCCEEDS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Function getFunction() {
		return (Function)eGet(cdfgPackage.Literals.OPERATION_NODE__FUNCTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFunction(Function newFunction) {
		eSet(cdfgPackage.Literals.OPERATION_NODE__FUNCTION, newFunction);
	}

} //OperationNodeImpl
