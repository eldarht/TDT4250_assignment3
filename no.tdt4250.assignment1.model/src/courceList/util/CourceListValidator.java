/**
 */
package courceList.util;

import courceList.*;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see courceList.CourceListPackage
 * @generated
 */
public class CourceListValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final CourceListValidator INSTANCE = new CourceListValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "courceList";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CourceListValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return CourceListPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case CourceListPackage.DEPARTMENT:
				return validateDepartment((Department)value, diagnostics, context);
			case CourceListPackage.COURCE:
				return validateCource((Cource)value, diagnostics, context);
			case CourceListPackage.STUDENT:
				return validateStudent((Student)value, diagnostics, context);
			case CourceListPackage.STUDY_PROGRAM:
				return validateStudyProgram((StudyProgram)value, diagnostics, context);
			case CourceListPackage.EXAM:
				return validateExam((Exam)value, diagnostics, context);
			case CourceListPackage.EVALUATION_FORM:
				return validateEvaluationForm((EvaluationForm)value, diagnostics, context);
			case CourceListPackage.WORK:
				return validateWork((Work)value, diagnostics, context);
			case CourceListPackage.STUDY_COURCE_RELATION:
				return validateStudyCourceRelation((StudyCourceRelation)value, diagnostics, context);
			case CourceListPackage.PROFESSOR:
				return validateProfessor((Professor)value, diagnostics, context);
			case CourceListPackage.SPECIALISATION:
				return validateSpecialisation((Specialisation)value, diagnostics, context);
			case CourceListPackage.COURCE_SPECIFICATION:
				return validateCourceSpecification((CourceSpecification)value, diagnostics, context);
			case CourceListPackage.STUDY_GENERALIZATION:
				return validateStudyGeneralization((StudyGeneralization)value, diagnostics, context);
			case CourceListPackage.SEMESTER:
				return validateSemester((Semester)value, diagnostics, context);
			case CourceListPackage.WORK_FORM:
				return validateWorkForm((WorkForm)value, diagnostics, context);
			case CourceListPackage.EDUCATION_LEVEL:
				return validateEducationLevel((EducationLevel)value, diagnostics, context);
			case CourceListPackage.EVALUATION_TYPE:
				return validateEvaluationType((EvaluationType)value, diagnostics, context);
			case CourceListPackage.CAMPUS:
				return validateCampus((Campus)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDepartment(Department department, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(department, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCource(Cource cource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(cource, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStudent(Student student, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(student, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStudyProgram(StudyProgram studyProgram, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(studyProgram, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExam(Exam exam, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(exam, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEvaluationForm(EvaluationForm evaluationForm, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(evaluationForm, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(evaluationForm, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(evaluationForm, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(evaluationForm, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(evaluationForm, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(evaluationForm, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(evaluationForm, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(evaluationForm, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(evaluationForm, diagnostics, context);
		if (result || diagnostics != null) result &= validateEvaluationForm_weightMustBeComplete(evaluationForm, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the weightMustBeComplete constraint of '<em>Evaluation Form</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String EVALUATION_FORM__WEIGHT_MUST_BE_COMPLETE__EEXPRESSION = " if not self.exam.oclIsUndefined() then \n" +
		"\tif not self.work.oclIsUndefined() then\n" +
		"\t\tself.exam.weight + self.work.weight = 100\n" +
		"\telse\n" +
		"\t\tself.exam.weight = 100\n" +
		"\tendif\n" +
		"else\n" +
		"\tif not self.work.oclIsUndefined() then\n" +
		"\t\tself.work.weight = 100\n" +
		"\telse\n" +
		"\t\tfalse\n" +
		"\tendif\n" +
		"endif";

	/**
	 * Validates the weightMustBeComplete constraint of '<em>Evaluation Form</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEvaluationForm_weightMustBeComplete(EvaluationForm evaluationForm, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(CourceListPackage.Literals.EVALUATION_FORM,
				 evaluationForm,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/acceleo/query/1.0",
				 "weightMustBeComplete",
				 EVALUATION_FORM__WEIGHT_MUST_BE_COMPLETE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWork(Work work, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(work, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStudyCourceRelation(StudyCourceRelation studyCourceRelation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(studyCourceRelation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProfessor(Professor professor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(professor, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpecialisation(Specialisation specialisation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(specialisation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCourceSpecification(CourceSpecification courceSpecification, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(courceSpecification, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStudyGeneralization(StudyGeneralization studyGeneralization, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(studyGeneralization, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSemester(Semester semester, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWorkForm(WorkForm workForm, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEducationLevel(EducationLevel educationLevel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEvaluationType(EvaluationType evaluationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCampus(Campus campus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //CourceListValidator
