/**
 */
package courceList;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Education Level</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see courceList.CourceListPackage#getEducationLevel()
 * @model
 * @generated
 */
public enum EducationLevel implements Enumerator {
	/**
	 * The '<em><b>Bachelor</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BACHELOR_VALUE
	 * @generated
	 * @ordered
	 */
	BACHELOR(0, "bachelor", "bachelor"),

	/**
	 * The '<em><b>Master</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MASTER_VALUE
	 * @generated
	 * @ordered
	 */
	MASTER(1, "master", "master"),

	/**
	 * The '<em><b>Phd</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PHD_VALUE
	 * @generated
	 * @ordered
	 */
	PHD(2, "phd", "phd"),

	/**
	 * The '<em><b>One Year</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ONE_YEAR_VALUE
	 * @generated
	 * @ordered
	 */
	ONE_YEAR(3, "oneYear", "oneYear");

	/**
	 * The '<em><b>Bachelor</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BACHELOR
	 * @model name="bachelor"
	 * @generated
	 * @ordered
	 */
	public static final int BACHELOR_VALUE = 0;

	/**
	 * The '<em><b>Master</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MASTER
	 * @model name="master"
	 * @generated
	 * @ordered
	 */
	public static final int MASTER_VALUE = 1;

	/**
	 * The '<em><b>Phd</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PHD
	 * @model name="phd"
	 * @generated
	 * @ordered
	 */
	public static final int PHD_VALUE = 2;

	/**
	 * The '<em><b>One Year</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ONE_YEAR
	 * @model name="oneYear"
	 * @generated
	 * @ordered
	 */
	public static final int ONE_YEAR_VALUE = 3;

	/**
	 * An array of all the '<em><b>Education Level</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EducationLevel[] VALUES_ARRAY =
		new EducationLevel[] {
			BACHELOR,
			MASTER,
			PHD,
			ONE_YEAR,
		};

	/**
	 * A public read-only list of all the '<em><b>Education Level</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EducationLevel> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Education Level</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EducationLevel get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EducationLevel result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Education Level</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EducationLevel getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EducationLevel result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Education Level</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EducationLevel get(int value) {
		switch (value) {
			case BACHELOR_VALUE: return BACHELOR;
			case MASTER_VALUE: return MASTER;
			case PHD_VALUE: return PHD;
			case ONE_YEAR_VALUE: return ONE_YEAR;
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
	private EducationLevel(int value, String name, String literal) {
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
	
} //EducationLevel
