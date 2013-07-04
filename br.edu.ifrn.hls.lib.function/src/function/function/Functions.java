/**
 */
package function.function;

import org.eclipse.emf.cdo.CDOObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Functions</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link function.function.Functions#getFunctions <em>Functions</em>}</li>
 * </ul>
 * </p>
 *
 * @see function.function.FunctionPackage#getFunctions()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface Functions extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Functions</b></em>' containment reference list.
	 * The list contents are of type {@link function.function.Function}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Functions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Functions</em>' containment reference list.
	 * @see function.function.FunctionPackage#getFunctions_Functions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Function> getFunctions();

} // Functions
