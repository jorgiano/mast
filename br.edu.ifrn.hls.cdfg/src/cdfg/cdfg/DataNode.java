/**
 */
package cdfg.cdfg;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cdfg.cdfg.DataNode#getDefinition <em>Definition</em>}</li>
 *   <li>{@link cdfg.cdfg.DataNode#getUsed <em>Used</em>}</li>
 *   <li>{@link cdfg.cdfg.DataNode#isConstant <em>Constant</em>}</li>
 *   <li>{@link cdfg.cdfg.DataNode#getNumberOfBits <em>Number Of Bits</em>}</li>
 *   <li>{@link cdfg.cdfg.DataNode#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see cdfg.cdfg.cdfgPackage#getDataNode()
 * @model abstract="true"
 * @generated
 */
public interface DataNode extends DFGNode {
	/**
	 * Returns the value of the '<em><b>Definition</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link cdfg.cdfg.DataNode#getUsed <em>Used</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Definition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definition</em>' reference.
	 * @see #setDefinition(DataNode)
	 * @see cdfg.cdfg.cdfgPackage#getDataNode_Definition()
	 * @see cdfg.cdfg.DataNode#getUsed
	 * @model opposite="used"
	 * @generated
	 */
	DataNode getDefinition();

	/**
	 * Sets the value of the '{@link cdfg.cdfg.DataNode#getDefinition <em>Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definition</em>' reference.
	 * @see #getDefinition()
	 * @generated
	 */
	void setDefinition(DataNode value);

	/**
	 * Returns the value of the '<em><b>Used</b></em>' reference list.
	 * The list contents are of type {@link cdfg.cdfg.DataNode}.
	 * It is bidirectional and its opposite is '{@link cdfg.cdfg.DataNode#getDefinition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Used</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Used</em>' reference list.
	 * @see cdfg.cdfg.cdfgPackage#getDataNode_Used()
	 * @see cdfg.cdfg.DataNode#getDefinition
	 * @model opposite="definition"
	 * @generated
	 */
	EList<DataNode> getUsed();

	/**
	 * Returns the value of the '<em><b>Constant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constant</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constant</em>' attribute.
	 * @see #setConstant(boolean)
	 * @see cdfg.cdfg.cdfgPackage#getDataNode_Constant()
	 * @model required="true"
	 * @generated
	 */
	boolean isConstant();

	/**
	 * Sets the value of the '{@link cdfg.cdfg.DataNode#isConstant <em>Constant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constant</em>' attribute.
	 * @see #isConstant()
	 * @generated
	 */
	void setConstant(boolean value);

	/**
	 * Returns the value of the '<em><b>Number Of Bits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Of Bits</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Bits</em>' attribute.
	 * @see #setNumberOfBits(int)
	 * @see cdfg.cdfg.cdfgPackage#getDataNode_NumberOfBits()
	 * @model
	 * @generated
	 */
	int getNumberOfBits();

	/**
	 * Sets the value of the '{@link cdfg.cdfg.DataNode#getNumberOfBits <em>Number Of Bits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Bits</em>' attribute.
	 * @see #getNumberOfBits()
	 * @generated
	 */
	void setNumberOfBits(int value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see cdfg.cdfg.cdfgPackage#getDataNode_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link cdfg.cdfg.DataNode#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // DataNode
