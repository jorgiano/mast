/**
 */
package cdfg.cdfg;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CFG</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cdfg.cdfg.CFG#getNodes <em>Nodes</em>}</li>
 *   <li>{@link cdfg.cdfg.CFG#getStart <em>Start</em>}</li>
 *   <li>{@link cdfg.cdfg.CFG#getArcs <em>Arcs</em>}</li>
 * </ul>
 * </p>
 *
 * @see cdfg.cdfg.cdfgPackage#getCFG()
 * @model
 * @generated
 */
public interface CFG extends Annotable {
	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link cdfg.cdfg.DFG}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nodes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' containment reference list.
	 * @see cdfg.cdfg.cdfgPackage#getCFG_Nodes()
	 * @model containment="true"
	 * @generated
	 */
	EList<DFG> getNodes();

	/**
	 * Returns the value of the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' reference.
	 * @see #setStart(DFG)
	 * @see cdfg.cdfg.cdfgPackage#getCFG_Start()
	 * @model required="true"
	 * @generated
	 */
	DFG getStart();

	/**
	 * Sets the value of the '{@link cdfg.cdfg.CFG#getStart <em>Start</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' reference.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(DFG value);

	/**
	 * Returns the value of the '<em><b>Arcs</b></em>' containment reference list.
	 * The list contents are of type {@link cdfg.cdfg.Jump}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arcs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arcs</em>' containment reference list.
	 * @see cdfg.cdfg.cdfgPackage#getCFG_Arcs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Jump> getArcs();

} // CFG
