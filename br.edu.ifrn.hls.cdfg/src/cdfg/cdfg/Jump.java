/**
 */
package cdfg.cdfg;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Jump</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cdfg.cdfg.Jump#getSource <em>Source</em>}</li>
 *   <li>{@link cdfg.cdfg.Jump#getTarget <em>Target</em>}</li>
 *   <li>{@link cdfg.cdfg.Jump#getBranchCondition <em>Branch Condition</em>}</li>
 *   <li>{@link cdfg.cdfg.Jump#getCondition <em>Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @see cdfg.cdfg.cdfgPackage#getJump()
 * @model
 * @generated
 */
public interface Jump extends Annotable {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link cdfg.cdfg.DFG#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(DFG)
	 * @see cdfg.cdfg.cdfgPackage#getJump_Source()
	 * @see cdfg.cdfg.DFG#getTo
	 * @model opposite="to" required="true"
	 * @generated
	 */
	DFG getSource();

	/**
	 * Sets the value of the '{@link cdfg.cdfg.Jump#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(DFG value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link cdfg.cdfg.DFG#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(DFG)
	 * @see cdfg.cdfg.cdfgPackage#getJump_Target()
	 * @see cdfg.cdfg.DFG#getFrom
	 * @model opposite="from" required="true"
	 * @generated
	 */
	DFG getTarget();

	/**
	 * Sets the value of the '{@link cdfg.cdfg.Jump#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(DFG value);

	/**
	 * Returns the value of the '<em><b>Branch Condition</b></em>' attribute.
	 * The literals are from the enumeration {@link cdfg.cdfg.BranchCondition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Branch Condition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Branch Condition</em>' attribute.
	 * @see cdfg.cdfg.BranchCondition
	 * @see #setBranchCondition(BranchCondition)
	 * @see cdfg.cdfg.cdfgPackage#getJump_BranchCondition()
	 * @model required="true"
	 * @generated
	 */
	BranchCondition getBranchCondition();

	/**
	 * Sets the value of the '{@link cdfg.cdfg.Jump#getBranchCondition <em>Branch Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Branch Condition</em>' attribute.
	 * @see cdfg.cdfg.BranchCondition
	 * @see #getBranchCondition()
	 * @generated
	 */
	void setBranchCondition(BranchCondition value);

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' reference.
	 * @see #setCondition(DataNode)
	 * @see cdfg.cdfg.cdfgPackage#getJump_Condition()
	 * @model
	 * @generated
	 */
	DataNode getCondition();

	/**
	 * Sets the value of the '{@link cdfg.cdfg.Jump#getCondition <em>Condition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(DataNode value);

} // Jump
