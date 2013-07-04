/**
 */
package function.function;

import org.eclipse.emf.cdo.CDOObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link function.function.Function#getName <em>Name</em>}</li>
 *   <li>{@link function.function.Function#getInputs <em>Inputs</em>}</li>
 *   <li>{@link function.function.Function#getOutputs <em>Outputs</em>}</li>
 * </ul>
 * </p>
 *
 * @see function.function.FunctionPackage#getFunction()
 * @model abstract="true"
 * @extends CDOObject
 * @generated
 */
public interface Function extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see function.function.FunctionPackage#getFunction_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link function.function.Function#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Inputs</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inputs</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inputs</em>' attribute list.
	 * @see function.function.FunctionPackage#getFunction_Inputs()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getInputs();

	/**
	 * Returns the value of the '<em><b>Outputs</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outputs</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outputs</em>' attribute list.
	 * @see function.function.FunctionPackage#getFunction_Outputs()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getOutputs();

} // Function
