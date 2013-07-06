/**
 */
package cdfg.cdfg;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PHI node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cdfg.cdfg.PHI_node#getArgs <em>Args</em>}</li>
 * </ul>
 * </p>
 *
 * @see cdfg.cdfg.cdfgPackage#getPHI_node()
 * @model
 * @generated
 */
public interface PHI_node extends OperationNode {
	/**
	 * Returns the value of the '<em><b>Args</b></em>' containment reference list.
	 * The list contents are of type {@link cdfg.cdfg.PHI_arg}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Args</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Args</em>' containment reference list.
	 * @see cdfg.cdfg.cdfgPackage#getPHI_node_Args()
	 * @model containment="true"
	 * @generated
	 */
	EList<PHI_arg> getArgs();

} // PHI_node
