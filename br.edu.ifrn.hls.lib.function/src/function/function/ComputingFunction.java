/**
 */
package function.function;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Computing Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link function.function.ComputingFunction#getDependency <em>Dependency</em>}</li>
 *   <li>{@link function.function.ComputingFunction#isCommutativity <em>Commutativity</em>}</li>
 *   <li>{@link function.function.ComputingFunction#isAssociativity <em>Associativity</em>}</li>
 * </ul>
 * </p>
 *
 * @see function.function.FunctionPackage#getComputingFunction()
 * @model
 * @generated
 */
public interface ComputingFunction extends Function {
	/**
	 * Returns the value of the '<em><b>Dependency</b></em>' attribute.
	 * The literals are from the enumeration {@link function.function.Dependency}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dependency</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependency</em>' attribute.
	 * @see function.function.Dependency
	 * @see #setDependency(Dependency)
	 * @see function.function.FunctionPackage#getComputingFunction_Dependency()
	 * @model
	 * @generated
	 */
	Dependency getDependency();

	/**
	 * Sets the value of the '{@link function.function.ComputingFunction#getDependency <em>Dependency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dependency</em>' attribute.
	 * @see function.function.Dependency
	 * @see #getDependency()
	 * @generated
	 */
	void setDependency(Dependency value);

	/**
	 * Returns the value of the '<em><b>Commutativity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Commutativity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Commutativity</em>' attribute.
	 * @see #setCommutativity(boolean)
	 * @see function.function.FunctionPackage#getComputingFunction_Commutativity()
	 * @model
	 * @generated
	 */
	boolean isCommutativity();

	/**
	 * Sets the value of the '{@link function.function.ComputingFunction#isCommutativity <em>Commutativity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Commutativity</em>' attribute.
	 * @see #isCommutativity()
	 * @generated
	 */
	void setCommutativity(boolean value);

	/**
	 * Returns the value of the '<em><b>Associativity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Associativity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associativity</em>' attribute.
	 * @see #setAssociativity(boolean)
	 * @see function.function.FunctionPackage#getComputingFunction_Associativity()
	 * @model
	 * @generated
	 */
	boolean isAssociativity();

	/**
	 * Sets the value of the '{@link function.function.ComputingFunction#isAssociativity <em>Associativity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Associativity</em>' attribute.
	 * @see #isAssociativity()
	 * @generated
	 */
	void setAssociativity(boolean value);

} // ComputingFunction
