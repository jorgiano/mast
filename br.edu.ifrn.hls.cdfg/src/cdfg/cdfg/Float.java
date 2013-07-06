/**
 */
package cdfg.cdfg;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Float</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cdfg.cdfg.Float#getStandard <em>Standard</em>}</li>
 * </ul>
 * </p>
 *
 * @see cdfg.cdfg.cdfgPackage#getFloat()
 * @model
 * @generated
 */
public interface Float extends DataNode {
	/**
	 * Returns the value of the '<em><b>Standard</b></em>' attribute.
	 * The literals are from the enumeration {@link cdfg.cdfg.Standard}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Standard</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Standard</em>' attribute.
	 * @see cdfg.cdfg.Standard
	 * @see #setStandard(Standard)
	 * @see cdfg.cdfg.cdfgPackage#getFloat_Standard()
	 * @model
	 * @generated
	 */
	Standard getStandard();

	/**
	 * Sets the value of the '{@link cdfg.cdfg.Float#getStandard <em>Standard</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Standard</em>' attribute.
	 * @see cdfg.cdfg.Standard
	 * @see #getStandard()
	 * @generated
	 */
	void setStandard(Standard value);

} // Float
