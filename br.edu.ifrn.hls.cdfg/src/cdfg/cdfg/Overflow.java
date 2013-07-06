/**
 */
package cdfg.cdfg;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Overflow</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see cdfg.cdfg.cdfgPackage#getOverflow()
 * @model
 * @generated
 */
public enum Overflow implements Enumerator {
	/**
	 * The '<em><b>SAT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SAT_VALUE
	 * @generated
	 * @ordered
	 */
	SAT(0, "SAT", "SAT"),

	/**
	 * The '<em><b>SAT ZERO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SAT_ZERO_VALUE
	 * @generated
	 * @ordered
	 */
	SAT_ZERO(1, "SAT_ZERO", "SAT_ZERO"),

	/**
	 * The '<em><b>SAT SYM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SAT_SYM_VALUE
	 * @generated
	 * @ordered
	 */
	SAT_SYM(2, "SAT_SYM", "SAT_SYM"),

	/**
	 * The '<em><b>WRAP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WRAP_VALUE
	 * @generated
	 * @ordered
	 */
	WRAP(3, "WRAP", "WRAP"),

	/**
	 * The '<em><b>WRAP SM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WRAP_SM_VALUE
	 * @generated
	 * @ordered
	 */
	WRAP_SM(4, "WRAP_SM", "WRAP_SM");

	/**
	 * The '<em><b>SAT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SAT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SAT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SAT_VALUE = 0;

	/**
	 * The '<em><b>SAT ZERO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SAT ZERO</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SAT_ZERO
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SAT_ZERO_VALUE = 1;

	/**
	 * The '<em><b>SAT SYM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SAT SYM</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SAT_SYM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SAT_SYM_VALUE = 2;

	/**
	 * The '<em><b>WRAP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>WRAP</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WRAP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WRAP_VALUE = 3;

	/**
	 * The '<em><b>WRAP SM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>WRAP SM</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WRAP_SM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WRAP_SM_VALUE = 4;

	/**
	 * An array of all the '<em><b>Overflow</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Overflow[] VALUES_ARRAY =
		new Overflow[] {
			SAT,
			SAT_ZERO,
			SAT_SYM,
			WRAP,
			WRAP_SM,
		};

	/**
	 * A public read-only list of all the '<em><b>Overflow</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Overflow> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Overflow</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Overflow get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Overflow result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Overflow</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Overflow getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Overflow result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Overflow</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Overflow get(int value) {
		switch (value) {
			case SAT_VALUE: return SAT;
			case SAT_ZERO_VALUE: return SAT_ZERO;
			case SAT_SYM_VALUE: return SAT_SYM;
			case WRAP_VALUE: return WRAP;
			case WRAP_SM_VALUE: return WRAP_SM;
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
	private Overflow(int value, String name, String literal) {
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
	
} //Overflow
