/**
 */
package cdfg.cdfg;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fixed Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class is the same definition for a fixed point type (sc_fixed) from the SystemC spec.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cdfg.cdfg.FixedPoint#getQuantization <em>Quantization</em>}</li>
 *   <li>{@link cdfg.cdfg.FixedPoint#getOverflow <em>Overflow</em>}</li>
 *   <li>{@link cdfg.cdfg.FixedPoint#getWl <em>Wl</em>}</li>
 *   <li>{@link cdfg.cdfg.FixedPoint#getIwl <em>Iwl</em>}</li>
 *   <li>{@link cdfg.cdfg.FixedPoint#getNbits <em>Nbits</em>}</li>
 * </ul>
 * </p>
 *
 * @see cdfg.cdfg.cdfgPackage#getFixedPoint()
 * @model
 * @generated
 */
public interface FixedPoint extends DataNode {
	/**
	 * Returns the value of the '<em><b>Quantization</b></em>' attribute.
	 * The literals are from the enumeration {@link cdfg.cdfg.Quantization}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantization</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantization</em>' attribute.
	 * @see cdfg.cdfg.Quantization
	 * @see #setQuantization(Quantization)
	 * @see cdfg.cdfg.cdfgPackage#getFixedPoint_Quantization()
	 * @model
	 * @generated
	 */
	Quantization getQuantization();

	/**
	 * Sets the value of the '{@link cdfg.cdfg.FixedPoint#getQuantization <em>Quantization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantization</em>' attribute.
	 * @see cdfg.cdfg.Quantization
	 * @see #getQuantization()
	 * @generated
	 */
	void setQuantization(Quantization value);

	/**
	 * Returns the value of the '<em><b>Overflow</b></em>' attribute.
	 * The literals are from the enumeration {@link cdfg.cdfg.Overflow}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Overflow</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Overflow</em>' attribute.
	 * @see cdfg.cdfg.Overflow
	 * @see #setOverflow(Overflow)
	 * @see cdfg.cdfg.cdfgPackage#getFixedPoint_Overflow()
	 * @model
	 * @generated
	 */
	Overflow getOverflow();

	/**
	 * Sets the value of the '{@link cdfg.cdfg.FixedPoint#getOverflow <em>Overflow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Overflow</em>' attribute.
	 * @see cdfg.cdfg.Overflow
	 * @see #getOverflow()
	 * @generated
	 */
	void setOverflow(Overflow value);

	/**
	 * Returns the value of the '<em><b>Wl</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wl</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wl</em>' attribute.
	 * @see #setWl(int)
	 * @see cdfg.cdfg.cdfgPackage#getFixedPoint_Wl()
	 * @model
	 * @generated
	 */
	int getWl();

	/**
	 * Sets the value of the '{@link cdfg.cdfg.FixedPoint#getWl <em>Wl</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wl</em>' attribute.
	 * @see #getWl()
	 * @generated
	 */
	void setWl(int value);

	/**
	 * Returns the value of the '<em><b>Iwl</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Iwl</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Iwl</em>' attribute.
	 * @see #setIwl(int)
	 * @see cdfg.cdfg.cdfgPackage#getFixedPoint_Iwl()
	 * @model
	 * @generated
	 */
	int getIwl();

	/**
	 * Sets the value of the '{@link cdfg.cdfg.FixedPoint#getIwl <em>Iwl</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Iwl</em>' attribute.
	 * @see #getIwl()
	 * @generated
	 */
	void setIwl(int value);

	/**
	 * Returns the value of the '<em><b>Nbits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nbits</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nbits</em>' attribute.
	 * @see #setNbits(int)
	 * @see cdfg.cdfg.cdfgPackage#getFixedPoint_Nbits()
	 * @model
	 * @generated
	 */
	int getNbits();

	/**
	 * Sets the value of the '{@link cdfg.cdfg.FixedPoint#getNbits <em>Nbits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nbits</em>' attribute.
	 * @see #getNbits()
	 * @generated
	 */
	void setNbits(int value);

} // FixedPoint
