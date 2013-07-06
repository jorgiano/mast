/**
 */
package cdfg.cdfg.impl;

import cdfg.cdfg.Standard;
import cdfg.cdfg.cdfgPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Float</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link cdfg.cdfg.impl.FloatImpl#getStandard <em>Standard</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FloatImpl extends DataNodeImpl implements cdfg.cdfg.Float {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FloatImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return cdfgPackage.Literals.FLOAT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Standard getStandard() {
		return (Standard)eGet(cdfgPackage.Literals.FLOAT__STANDARD, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStandard(Standard newStandard) {
		eSet(cdfgPackage.Literals.FLOAT__STANDARD, newStandard);
	}

} //FloatImpl
