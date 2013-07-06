/**
 */
package cdfg.cdfg.impl;

import cdfg.cdfg.DFGArc;
import cdfg.cdfg.DFGNode;
import cdfg.cdfg.cdfgPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DFG Arc</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link cdfg.cdfg.impl.DFGArcImpl#getSource <em>Source</em>}</li>
 *   <li>{@link cdfg.cdfg.impl.DFGArcImpl#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DFGArcImpl extends AnnotableImpl implements DFGArc {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DFGArcImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return cdfgPackage.Literals.DFG_ARC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DFGNode getSource() {
		return (DFGNode)eGet(cdfgPackage.Literals.DFG_ARC__SOURCE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(DFGNode newSource) {
		eSet(cdfgPackage.Literals.DFG_ARC__SOURCE, newSource);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DFGNode getTarget() {
		return (DFGNode)eGet(cdfgPackage.Literals.DFG_ARC__TARGET, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(DFGNode newTarget) {
		eSet(cdfgPackage.Literals.DFG_ARC__TARGET, newTarget);
	}

} //DFGArcImpl
