/**
 */
package cdfg.cdfg;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DFG</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cdfg.cdfg.DFG#getSource <em>Source</em>}</li>
 *   <li>{@link cdfg.cdfg.DFG#getSink <em>Sink</em>}</li>
 *   <li>{@link cdfg.cdfg.DFG#getNodes <em>Nodes</em>}</li>
 *   <li>{@link cdfg.cdfg.DFG#getArcs <em>Arcs</em>}</li>
 *   <li>{@link cdfg.cdfg.DFG#getFrom <em>From</em>}</li>
 *   <li>{@link cdfg.cdfg.DFG#getTo <em>To</em>}</li>
 * </ul>
 * </p>
 *
 * @see cdfg.cdfg.cdfgPackage#getDFG()
 * @model
 * @generated
 */
public interface DFG extends Annotable {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' containment reference.
	 * @see #setSource(Source)
	 * @see cdfg.cdfg.cdfgPackage#getDFG_Source()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Source getSource();

	/**
	 * Sets the value of the '{@link cdfg.cdfg.DFG#getSource <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' containment reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Source value);

	/**
	 * Returns the value of the '<em><b>Sink</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sink</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sink</em>' containment reference.
	 * @see #setSink(Sink)
	 * @see cdfg.cdfg.cdfgPackage#getDFG_Sink()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Sink getSink();

	/**
	 * Sets the value of the '{@link cdfg.cdfg.DFG#getSink <em>Sink</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sink</em>' containment reference.
	 * @see #getSink()
	 * @generated
	 */
	void setSink(Sink value);

	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link cdfg.cdfg.DFGNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nodes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' containment reference list.
	 * @see cdfg.cdfg.cdfgPackage#getDFG_Nodes()
	 * @model containment="true"
	 * @generated
	 */
	EList<DFGNode> getNodes();

	/**
	 * Returns the value of the '<em><b>Arcs</b></em>' containment reference list.
	 * The list contents are of type {@link cdfg.cdfg.DFGArc}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arcs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arcs</em>' containment reference list.
	 * @see cdfg.cdfg.cdfgPackage#getDFG_Arcs()
	 * @model containment="true"
	 * @generated
	 */
	EList<DFGArc> getArcs();

	/**
	 * Returns the value of the '<em><b>From</b></em>' reference list.
	 * The list contents are of type {@link cdfg.cdfg.Jump}.
	 * It is bidirectional and its opposite is '{@link cdfg.cdfg.Jump#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference list.
	 * @see cdfg.cdfg.cdfgPackage#getDFG_From()
	 * @see cdfg.cdfg.Jump#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	EList<Jump> getFrom();

	/**
	 * Returns the value of the '<em><b>To</b></em>' reference list.
	 * The list contents are of type {@link cdfg.cdfg.Jump}.
	 * It is bidirectional and its opposite is '{@link cdfg.cdfg.Jump#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference list.
	 * @see cdfg.cdfg.cdfgPackage#getDFG_To()
	 * @see cdfg.cdfg.Jump#getSource
	 * @model opposite="source"
	 * @generated
	 */
	EList<Jump> getTo();

} // DFG
