/**
 */
package cdfg.cdfg.impl;

import cdfg.cdfg.DFGArc;
import cdfg.cdfg.DFGNode;
import cdfg.cdfg.cdfgPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DFG Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link cdfg.cdfg.impl.DFGNodeImpl#getTo <em>To</em>}</li>
 *   <li>{@link cdfg.cdfg.impl.DFGNodeImpl#getFrom <em>From</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class DFGNodeImpl extends AnnotableImpl implements DFGNode {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DFGNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return cdfgPackage.Literals.DFG_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<DFGArc> getTo() {
		return (EList<DFGArc>)eGet(cdfgPackage.Literals.DFG_NODE__TO, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<DFGArc> getFrom() {
		return (EList<DFGArc>)eGet(cdfgPackage.Literals.DFG_NODE__FROM, true);
	}

} //DFGNodeImpl
