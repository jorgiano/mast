/**
 */
package cdfg.cdfg;

import function.function.Function;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cdfg.cdfg.OperationNode#getPrecedes <em>Precedes</em>}</li>
 *   <li>{@link cdfg.cdfg.OperationNode#getSucceeds <em>Succeeds</em>}</li>
 *   <li>{@link cdfg.cdfg.OperationNode#getFunction <em>Function</em>}</li>
 * </ul>
 * </p>
 *
 * @see cdfg.cdfg.cdfgPackage#getOperationNode()
 * @model abstract="true"
 * @generated
 */
public interface OperationNode extends DFGNode {
	/**
	 * Returns the value of the '<em><b>Precedes</b></em>' reference list.
	 * The list contents are of type {@link cdfg.cdfg.OperationNode}.
	 * It is bidirectional and its opposite is '{@link cdfg.cdfg.OperationNode#getSucceeds <em>Succeeds</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Precedes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Precedes</em>' reference list.
	 * @see cdfg.cdfg.cdfgPackage#getOperationNode_Precedes()
	 * @see cdfg.cdfg.OperationNode#getSucceeds
	 * @model opposite="succeeds"
	 * @generated
	 */
	EList<OperationNode> getPrecedes();

	/**
	 * Returns the value of the '<em><b>Succeeds</b></em>' reference list.
	 * The list contents are of type {@link cdfg.cdfg.OperationNode}.
	 * It is bidirectional and its opposite is '{@link cdfg.cdfg.OperationNode#getPrecedes <em>Precedes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Succeeds</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Succeeds</em>' reference list.
	 * @see cdfg.cdfg.cdfgPackage#getOperationNode_Succeeds()
	 * @see cdfg.cdfg.OperationNode#getPrecedes
	 * @model opposite="precedes"
	 * @generated
	 */
	EList<OperationNode> getSucceeds();

	/**
	 * Returns the value of the '<em><b>Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function</em>' reference.
	 * @see #setFunction(Function)
	 * @see cdfg.cdfg.cdfgPackage#getOperationNode_Function()
	 * @model
	 * @generated
	 */
	Function getFunction();

	/**
	 * Sets the value of the '{@link cdfg.cdfg.OperationNode#getFunction <em>Function</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function</em>' reference.
	 * @see #getFunction()
	 * @generated
	 */
	void setFunction(Function value);

} // OperationNode
