/**
 */
package cdfg.cdfg;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Standard</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see cdfg.cdfg.cdfgPackage#getStandard()
 * @model
 * @generated
 */
public enum Standard implements Enumerator {
	/**
	 * The '<em><b>IEEE 754 1985</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IEEE_754_1985_VALUE
	 * @generated
	 * @ordered
	 */
	IEEE_754_1985(0, "IEEE_754_1985", "IEEE_754_1985"),

	/**
	 * The '<em><b>IEEE 754 2008</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IEEE_754_2008_VALUE
	 * @generated
	 * @ordered
	 */
	IEEE_754_2008(1, "IEEE_754_2008", "IEEE_754_2008");

	/**
	 * The '<em><b>IEEE 754 1985</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>IEEE 754 1985</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IEEE_754_1985
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IEEE_754_1985_VALUE = 0;

	/**
	 * The '<em><b>IEEE 754 2008</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>IEEE 754 2008</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IEEE_754_2008
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IEEE_754_2008_VALUE = 1;

	/**
	 * An array of all the '<em><b>Standard</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Standard[] VALUES_ARRAY =
		new Standard[] {
			IEEE_754_1985,
			IEEE_754_2008,
		};

	/**
	 * A public read-only list of all the '<em><b>Standard</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Standard> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Standard</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Standard get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Standard result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Standard</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Standard getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Standard result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Standard</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Standard get(int value) {
		switch (value) {
			case IEEE_754_1985_VALUE: return IEEE_754_1985;
			case IEEE_754_2008_VALUE: return IEEE_754_2008;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Standard(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //Standard
