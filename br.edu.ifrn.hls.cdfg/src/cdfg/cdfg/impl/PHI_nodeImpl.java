/**
 */
package cdfg.cdfg.impl;

import cdfg.cdfg.PHI_arg;
import cdfg.cdfg.PHI_node;
import cdfg.cdfg.cdfgPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PHI node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link cdfg.cdfg.impl.PHI_nodeImpl#getArgs <em>Args</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PHI_nodeImpl extends OperationNodeImpl implements PHI_node {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PHI_nodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return cdfgPackage.Literals.PHI_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<PHI_arg> getArgs() {
		return (EList<PHI_arg>)eGet(cdfgPackage.Literals.PHI_NODE__ARGS, true);
	}

} //PHI_nodeImpl
