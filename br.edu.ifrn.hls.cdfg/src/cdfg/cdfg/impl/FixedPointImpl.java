/**
 */
package cdfg.cdfg.impl;

import cdfg.cdfg.FixedPoint;
import cdfg.cdfg.Overflow;
import cdfg.cdfg.Quantization;
import cdfg.cdfg.cdfgPackage;

import java.lang.Integer;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fixed Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link cdfg.cdfg.impl.FixedPointImpl#getQuantization <em>Quantization</em>}</li>
 *   <li>{@link cdfg.cdfg.impl.FixedPointImpl#getOverflow <em>Overflow</em>}</li>
 *   <li>{@link cdfg.cdfg.impl.FixedPointImpl#getWl <em>Wl</em>}</li>
 *   <li>{@link cdfg.cdfg.impl.FixedPointImpl#getIwl <em>Iwl</em>}</li>
 *   <li>{@link cdfg.cdfg.impl.FixedPointImpl#getNbits <em>Nbits</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FixedPointImpl extends DataNodeImpl implements FixedPoint {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FixedPointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return cdfgPackage.Literals.FIXED_POINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quantization getQuantization() {
		return (Quantization)eGet(cdfgPackage.Literals.FIXED_POINT__QUANTIZATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuantization(Quantization newQuantization) {
		eSet(cdfgPackage.Literals.FIXED_POINT__QUANTIZATION, newQuantization);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Overflow getOverflow() {
		return (Overflow)eGet(cdfgPackage.Literals.FIXED_POINT__OVERFLOW, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOverflow(Overflow newOverflow) {
		eSet(cdfgPackage.Literals.FIXED_POINT__OVERFLOW, newOverflow);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getWl() {
		return (Integer)eGet(cdfgPackage.Literals.FIXED_POINT__WL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWl(int newWl) {
		eSet(cdfgPackage.Literals.FIXED_POINT__WL, newWl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getIwl() {
		return (Integer)eGet(cdfgPackage.Literals.FIXED_POINT__IWL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIwl(int newIwl) {
		eSet(cdfgPackage.Literals.FIXED_POINT__IWL, newIwl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNbits() {
		return (Integer)eGet(cdfgPackage.Literals.FIXED_POINT__NBITS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNbits(int newNbits) {
		eSet(cdfgPackage.Literals.FIXED_POINT__NBITS, newNbits);
	}

} //FixedPointImpl
