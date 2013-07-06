/**
 */
package cdfg.cdfg;

import org.eclipse.emf.cdo.CDOObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PHI arg</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cdfg.cdfg.PHI_arg#getFrom <em>From</em>}</li>
 *   <li>{@link cdfg.cdfg.PHI_arg#getData <em>Data</em>}</li>
 * </ul>
 * </p>
 *
 * @see cdfg.cdfg.cdfgPackage#getPHI_arg()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface PHI_arg extends CDOObject {
	/**
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(Jump)
	 * @see cdfg.cdfg.cdfgPackage#getPHI_arg_From()
	 * @model
	 * @generated
	 */
	Jump getFrom();

	/**
	 * Sets the value of the '{@link cdfg.cdfg.PHI_arg#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(Jump value);

	/**
	 * Returns the value of the '<em><b>Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' reference.
	 * @see #setData(DataNode)
	 * @see cdfg.cdfg.cdfgPackage#getPHI_arg_Data()
	 * @model
	 * @generated
	 */
	DataNode getData();

	/**
	 * Sets the value of the '{@link cdfg.cdfg.PHI_arg#getData <em>Data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data</em>' reference.
	 * @see #getData()
	 * @generated
	 */
	void setData(DataNode value);

} // PHI_arg
