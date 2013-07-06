/**
 */
package cdfg.cdfg.impl;

import cdfg.cdfg.CFG;
import cdfg.cdfg.DFG;
import cdfg.cdfg.Jump;
import cdfg.cdfg.cdfgPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CFG</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link cdfg.cdfg.impl.CFGImpl#getNodes <em>Nodes</em>}</li>
 *   <li>{@link cdfg.cdfg.impl.CFGImpl#getStart <em>Start</em>}</li>
 *   <li>{@link cdfg.cdfg.impl.CFGImpl#getArcs <em>Arcs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CFGImpl extends AnnotableImpl implements CFG {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CFGImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return cdfgPackage.Literals.CFG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<DFG> getNodes() {
		return (EList<DFG>)eGet(cdfgPackage.Literals.CFG__NODES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DFG getStart() {
		return (DFG)eGet(cdfgPackage.Literals.CFG__START, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStart(DFG newStart) {
		eSet(cdfgPackage.Literals.CFG__START, newStart);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Jump> getArcs() {
		return (EList<Jump>)eGet(cdfgPackage.Literals.CFG__ARCS, true);
	}

} //CFGImpl
