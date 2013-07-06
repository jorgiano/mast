/**
 */
package cdfg.cdfg;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DFG Arc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cdfg.cdfg.DFGArc#getSource <em>Source</em>}</li>
 *   <li>{@link cdfg.cdfg.DFGArc#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see cdfg.cdfg.cdfgPackage#getDFGArc()
 * @model
 * @generated
 */
public interface DFGArc extends Annotable {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link cdfg.cdfg.DFGNode#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(DFGNode)
	 * @see cdfg.cdfg.cdfgPackage#getDFGArc_Source()
	 * @see cdfg.cdfg.DFGNode#getTo
	 * @model opposite="to" required="true"
	 * @generated
	 */
	DFGNode getSource();

	/**
	 * Sets the value of the '{@link cdfg.cdfg.DFGArc#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(DFGNode value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link cdfg.cdfg.DFGNode#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(DFGNode)
	 * @see cdfg.cdfg.cdfgPackage#getDFGArc_Target()
	 * @see cdfg.cdfg.DFGNode#getFrom
	 * @model opposite="from" required="true"
	 * @generated
	 */
	DFGNode getTarget();

	/**
	 * Sets the value of the '{@link cdfg.cdfg.DFGArc#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(DFGNode value);

} // DFGArc
