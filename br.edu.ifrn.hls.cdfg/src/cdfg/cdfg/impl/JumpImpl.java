/**
 */
package cdfg.cdfg.impl;

import cdfg.cdfg.BranchCondition;
import cdfg.cdfg.DFG;
import cdfg.cdfg.DataNode;
import cdfg.cdfg.Jump;
import cdfg.cdfg.cdfgPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Jump</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link cdfg.cdfg.impl.JumpImpl#getSource <em>Source</em>}</li>
 *   <li>{@link cdfg.cdfg.impl.JumpImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link cdfg.cdfg.impl.JumpImpl#getBranchCondition <em>Branch Condition</em>}</li>
 *   <li>{@link cdfg.cdfg.impl.JumpImpl#getCondition <em>Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JumpImpl extends AnnotableImpl implements Jump {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JumpImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return cdfgPackage.Literals.JUMP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DFG getSource() {
		return (DFG)eGet(cdfgPackage.Literals.JUMP__SOURCE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(DFG newSource) {
		eSet(cdfgPackage.Literals.JUMP__SOURCE, newSource);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DFG getTarget() {
		return (DFG)eGet(cdfgPackage.Literals.JUMP__TARGET, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(DFG newTarget) {
		eSet(cdfgPackage.Literals.JUMP__TARGET, newTarget);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BranchCondition getBranchCondition() {
		return (BranchCondition)eGet(cdfgPackage.Literals.JUMP__BRANCH_CONDITION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBranchCondition(BranchCondition newBranchCondition) {
		eSet(cdfgPackage.Literals.JUMP__BRANCH_CONDITION, newBranchCondition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataNode getCondition() {
		return (DataNode)eGet(cdfgPackage.Literals.JUMP__CONDITION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondition(DataNode newCondition) {
		eSet(cdfgPackage.Literals.JUMP__CONDITION, newCondition);
	}

} //JumpImpl
