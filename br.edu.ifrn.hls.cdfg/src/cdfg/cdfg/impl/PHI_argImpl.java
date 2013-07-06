/**
 */
package cdfg.cdfg.impl;

import cdfg.cdfg.DataNode;
import cdfg.cdfg.Jump;
import cdfg.cdfg.PHI_arg;
import cdfg.cdfg.cdfgPackage;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PHI arg</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link cdfg.cdfg.impl.PHI_argImpl#getFrom <em>From</em>}</li>
 *   <li>{@link cdfg.cdfg.impl.PHI_argImpl#getData <em>Data</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PHI_argImpl extends CDOObjectImpl implements PHI_arg {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PHI_argImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return cdfgPackage.Literals.PHI_ARG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Jump getFrom() {
		return (Jump)eGet(cdfgPackage.Literals.PHI_ARG__FROM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrom(Jump newFrom) {
		eSet(cdfgPackage.Literals.PHI_ARG__FROM, newFrom);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataNode getData() {
		return (DataNode)eGet(cdfgPackage.Literals.PHI_ARG__DATA, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setData(DataNode newData) {
		eSet(cdfgPackage.Literals.PHI_ARG__DATA, newData);
	}

} //PHI_argImpl
