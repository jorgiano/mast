/**
 */
package cdfg.cdfg.impl;

import cdfg.cdfg.cdfgPackage;

import java.lang.Boolean;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Integer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link cdfg.cdfg.impl.IntegerImpl#isSigned <em>Signed</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IntegerImpl extends DataNodeImpl implements cdfg.cdfg.Integer {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntegerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return cdfgPackage.Literals.INTEGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSigned() {
		return (Boolean)eGet(cdfgPackage.Literals.INTEGER__SIGNED, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSigned(boolean newSigned) {
		eSet(cdfgPackage.Literals.INTEGER__SIGNED, newSigned);
	}

} //IntegerImpl
