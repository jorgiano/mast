/**
 */
package cdfg.cdfg.impl;

import cdfg.cdfg.DataNode;
import cdfg.cdfg.cdfgPackage;

import java.lang.Boolean;
import java.lang.Integer;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link cdfg.cdfg.impl.DataNodeImpl#getDefinition <em>Definition</em>}</li>
 *   <li>{@link cdfg.cdfg.impl.DataNodeImpl#getUsed <em>Used</em>}</li>
 *   <li>{@link cdfg.cdfg.impl.DataNodeImpl#isConstant <em>Constant</em>}</li>
 *   <li>{@link cdfg.cdfg.impl.DataNodeImpl#getNumberOfBits <em>Number Of Bits</em>}</li>
 *   <li>{@link cdfg.cdfg.impl.DataNodeImpl#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class DataNodeImpl extends DFGNodeImpl implements DataNode {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return cdfgPackage.Literals.DATA_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataNode getDefinition() {
		return (DataNode)eGet(cdfgPackage.Literals.DATA_NODE__DEFINITION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefinition(DataNode newDefinition) {
		eSet(cdfgPackage.Literals.DATA_NODE__DEFINITION, newDefinition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<DataNode> getUsed() {
		return (EList<DataNode>)eGet(cdfgPackage.Literals.DATA_NODE__USED, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isConstant() {
		return (Boolean)eGet(cdfgPackage.Literals.DATA_NODE__CONSTANT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstant(boolean newConstant) {
		eSet(cdfgPackage.Literals.DATA_NODE__CONSTANT, newConstant);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumberOfBits() {
		return (Integer)eGet(cdfgPackage.Literals.DATA_NODE__NUMBER_OF_BITS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfBits(int newNumberOfBits) {
		eSet(cdfgPackage.Literals.DATA_NODE__NUMBER_OF_BITS, newNumberOfBits);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return (String)eGet(cdfgPackage.Literals.DATA_NODE__VALUE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		eSet(cdfgPackage.Literals.DATA_NODE__VALUE, newValue);
	}

} //DataNodeImpl
