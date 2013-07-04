/**
 */
package function.function;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Memory Access</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link function.function.MemoryAccess#getIo <em>Io</em>}</li>
 * </ul>
 * </p>
 *
 * @see function.function.FunctionPackage#getMemoryAccess()
 * @model
 * @generated
 */
public interface MemoryAccess extends Function {
	/**
	 * Returns the value of the '<em><b>Io</b></em>' attribute.
	 * The literals are from the enumeration {@link function.function.IOFlag}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Io</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Io</em>' attribute.
	 * @see function.function.IOFlag
	 * @see #setIo(IOFlag)
	 * @see function.function.FunctionPackage#getMemoryAccess_Io()
	 * @model
	 * @generated
	 */
	IOFlag getIo();

	/**
	 * Sets the value of the '{@link function.function.MemoryAccess#getIo <em>Io</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Io</em>' attribute.
	 * @see function.function.IOFlag
	 * @see #getIo()
	 * @generated
	 */
	void setIo(IOFlag value);

} // MemoryAccess
