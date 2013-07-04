/**
 */
package function.function;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Dependency</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see function.function.FunctionPackage#getDependency()
 * @model
 * @generated
 */
public enum Dependency implements Enumerator {
	/**
	 * The '<em><b>None</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE_VALUE
	 * @generated
	 * @ordered
	 */
	NONE(0, "none", "none"),

	/**
	 * The '<em><b>Min inputs</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MIN_INPUTS_VALUE
	 * @generated
	 * @ordered
	 */
	MIN_INPUTS(1, "min_inputs", "min_inputs"),

	/**
	 * The '<em><b>Max inputs</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAX_INPUTS_VALUE
	 * @generated
	 * @ordered
	 */
	MAX_INPUTS(2, "max_inputs", "max_inputs"),

	/**
	 * The '<em><b>All inputs</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALL_INPUTS_VALUE
	 * @generated
	 * @ordered
	 */
	ALL_INPUTS(3, "all_inputs", "all_inputs");

	/**
	 * The '<em><b>None</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>None</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NONE
	 * @model name="none"
	 * @generated
	 * @ordered
	 */
	public static final int NONE_VALUE = 0;

	/**
	 * The '<em><b>Min inputs</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Min inputs</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MIN_INPUTS
	 * @model name="min_inputs"
	 * @generated
	 * @ordered
	 */
	public static final int MIN_INPUTS_VALUE = 1;

	/**
	 * The '<em><b>Max inputs</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Max inputs</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MAX_INPUTS
	 * @model name="max_inputs"
	 * @generated
	 * @ordered
	 */
	public static final int MAX_INPUTS_VALUE = 2;

	/**
	 * The '<em><b>All inputs</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>All inputs</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ALL_INPUTS
	 * @model name="all_inputs"
	 * @generated
	 * @ordered
	 */
	public static final int ALL_INPUTS_VALUE = 3;

	/**
	 * An array of all the '<em><b>Dependency</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Dependency[] VALUES_ARRAY =
		new Dependency[] {
			NONE,
			MIN_INPUTS,
			MAX_INPUTS,
			ALL_INPUTS,
		};

	/**
	 * A public read-only list of all the '<em><b>Dependency</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Dependency> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Dependency</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Dependency get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Dependency result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Dependency</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Dependency getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Dependency result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Dependency</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Dependency get(int value) {
		switch (value) {
			case NONE_VALUE: return NONE;
			case MIN_INPUTS_VALUE: return MIN_INPUTS;
			case MAX_INPUTS_VALUE: return MAX_INPUTS;
			case ALL_INPUTS_VALUE: return ALL_INPUTS;
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
	private Dependency(int value, String name, String literal) {
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
	
} //Dependency
