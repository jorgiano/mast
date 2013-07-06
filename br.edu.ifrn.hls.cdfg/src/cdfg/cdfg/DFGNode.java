/**
 */
package cdfg.cdfg;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DFG Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cdfg.cdfg.DFGNode#getTo <em>To</em>}</li>
 *   <li>{@link cdfg.cdfg.DFGNode#getFrom <em>From</em>}</li>
 * </ul>
 * </p>
 *
 * @see cdfg.cdfg.cdfgPackage#getDFGNode()
 * @model abstract="true"
 * @generated
 */
public interface DFGNode extends Annotable {
	/**
	 * Returns the value of the '<em><b>To</b></em>' reference list.
	 * The list contents are of type {@link cdfg.cdfg.DFGArc}.
	 * It is bidirectional and its opposite is '{@link cdfg.cdfg.DFGArc#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference list.
	 * @see cdfg.cdfg.cdfgPackage#getDFGNode_To()
	 * @see cdfg.cdfg.DFGArc#getSource
	 * @model opposite="source"
	 * @generated
	 */
	EList<DFGArc> getTo();

	/**
	 * Returns the value of the '<em><b>From</b></em>' reference list.
	 * The list contents are of type {@link cdfg.cdfg.DFGArc}.
	 * It is bidirectional and its opposite is '{@link cdfg.cdfg.DFGArc#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference list.
	 * @see cdfg.cdfg.cdfgPackage#getDFGNode_From()
	 * @see cdfg.cdfg.DFGArc#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	EList<DFGArc> getFrom();

} // DFGNode
