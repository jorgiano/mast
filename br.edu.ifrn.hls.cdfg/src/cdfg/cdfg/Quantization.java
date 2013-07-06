/**
 */
package cdfg.cdfg;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Quantization</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see cdfg.cdfg.cdfgPackage#getQuantization()
 * @model
 * @generated
 */
public enum Quantization implements Enumerator {
	/**
	 * The '<em><b>RND</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RND_VALUE
	 * @generated
	 * @ordered
	 */
	RND(0, "RND", "RND"),

	/**
	 * The '<em><b>RND ZERO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RND_ZERO_VALUE
	 * @generated
	 * @ordered
	 */
	RND_ZERO(1, "RND_ZERO", "RND_ZERO"),

	/**
	 * The '<em><b>RND MIN INF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RND_MIN_INF_VALUE
	 * @generated
	 * @ordered
	 */
	RND_MIN_INF(2, "RND_MIN_INF", "RND_MIN_INF"),

	/**
	 * The '<em><b>RND INF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RND_INF_VALUE
	 * @generated
	 * @ordered
	 */
	RND_INF(3, "RND_INF", "RND_INF"),

	/**
	 * The '<em><b>RND CONV</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RND_CONV_VALUE
	 * @generated
	 * @ordered
	 */
	RND_CONV(4, "RND_CONV", "RND_CONV"),

	/**
	 * The '<em><b>TRN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRN_VALUE
	 * @generated
	 * @ordered
	 */
	TRN(5, "TRN", "TRN"),

	/**
	 * The '<em><b>TRN ZERO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRN_ZERO_VALUE
	 * @generated
	 * @ordered
	 */
	TRN_ZERO(6, "TRN_ZERO", "TRN_ZERO");

	/**
	 * The '<em><b>RND</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RND</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RND
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RND_VALUE = 0;

	/**
	 * The '<em><b>RND ZERO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RND ZERO</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RND_ZERO
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RND_ZERO_VALUE = 1;

	/**
	 * The '<em><b>RND MIN INF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RND MIN INF</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RND_MIN_INF
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RND_MIN_INF_VALUE = 2;

	/**
	 * The '<em><b>RND INF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RND INF</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RND_INF
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RND_INF_VALUE = 3;

	/**
	 * The '<em><b>RND CONV</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RND CONV</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RND_CONV
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RND_CONV_VALUE = 4;

	/**
	 * The '<em><b>TRN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TRN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TRN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TRN_VALUE = 5;

	/**
	 * The '<em><b>TRN ZERO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TRN ZERO</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TRN_ZERO
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TRN_ZERO_VALUE = 6;

	/**
	 * An array of all the '<em><b>Quantization</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Quantization[] VALUES_ARRAY =
		new Quantization[] {
			RND,
			RND_ZERO,
			RND_MIN_INF,
			RND_INF,
			RND_CONV,
			TRN,
			TRN_ZERO,
		};

	/**
	 * A public read-only list of all the '<em><b>Quantization</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Quantization> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Quantization</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Quantization get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Quantization result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Quantization</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Quantization getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Quantization result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Quantization</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Quantization get(int value) {
		switch (value) {
			case RND_VALUE: return RND;
			case RND_ZERO_VALUE: return RND_ZERO;
			case RND_MIN_INF_VALUE: return RND_MIN_INF;
			case RND_INF_VALUE: return RND_INF;
			case RND_CONV_VALUE: return RND_CONV;
			case TRN_VALUE: return TRN;
			case TRN_ZERO_VALUE: return TRN_ZERO;
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
	private Quantization(int value, String name, String literal) {
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
	
} //Quantization
