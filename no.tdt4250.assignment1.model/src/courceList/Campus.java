/**
 */
package courceList;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Campus</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see courceList.CourceListPackage#getCampus()
 * @model
 * @generated
 */
public enum Campus implements Enumerator {
	/**
	 * The '<em><b>Trondheim</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRONDHEIM_VALUE
	 * @generated
	 * @ordered
	 */
	TRONDHEIM(0, "Trondheim", "Trondheim"),

	/**
	 * The '<em><b>Gjøvik</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GJØVIK_VALUE
	 * @generated
	 * @ordered
	 */
	GJØVIK(1, "Gjøvik", "Gj\u00f8vik"),

	/**
	 * The '<em><b>Web</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WEB_VALUE
	 * @generated
	 * @ordered
	 */
	WEB(3, "Web", "Web"),

	/**
	 * The '<em><b>Ålesund</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ÅLESUND_VALUE
	 * @generated
	 * @ordered
	 */
	ÅLESUND(2, "Ålesund", "\u00c5lesund");

	/**
	 * The '<em><b>Trondheim</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRONDHEIM
	 * @model name="Trondheim"
	 * @generated
	 * @ordered
	 */
	public static final int TRONDHEIM_VALUE = 0;

	/**
	 * The '<em><b>Gjøvik</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GJØVIK
	 * @model name="Gjøvik"
	 * @generated
	 * @ordered
	 */
	public static final int GJØVIK_VALUE = 1;

	/**
	 * The '<em><b>Web</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WEB
	 * @model name="Web"
	 * @generated
	 * @ordered
	 */
	public static final int WEB_VALUE = 3;

	/**
	 * The '<em><b>Ålesund</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ÅLESUND
	 * @model name="Ålesund"
	 * @generated
	 * @ordered
	 */
	public static final int ÅLESUND_VALUE = 2;

	/**
	 * An array of all the '<em><b>Campus</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Campus[] VALUES_ARRAY =
		new Campus[] {
			TRONDHEIM,
			GJØVIK,
			WEB,
			ÅLESUND,
		};

	/**
	 * A public read-only list of all the '<em><b>Campus</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Campus> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Campus</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Campus get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Campus result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Campus</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Campus getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Campus result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Campus</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Campus get(int value) {
		switch (value) {
			case TRONDHEIM_VALUE: return TRONDHEIM;
			case GJØVIK_VALUE: return GJØVIK;
			case WEB_VALUE: return WEB;
			case ÅLESUND_VALUE: return ÅLESUND;
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
	private Campus(int value, String name, String literal) {
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
	
} //Campus
