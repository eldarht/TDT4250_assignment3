/**
 */
package courceList.impl;

import courceList.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CourceListFactoryImpl extends EFactoryImpl implements CourceListFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CourceListFactory init() {
		try {
			CourceListFactory theCourceListFactory = (CourceListFactory)EPackage.Registry.INSTANCE.getEFactory(CourceListPackage.eNS_URI);
			if (theCourceListFactory != null) {
				return theCourceListFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CourceListFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CourceListFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CourceListPackage.DEPARTMENT: return createDepartment();
			case CourceListPackage.COURCE: return createCource();
			case CourceListPackage.STUDENT: return createStudent();
			case CourceListPackage.STUDY_PROGRAM: return createStudyProgram();
			case CourceListPackage.EXAM: return createExam();
			case CourceListPackage.EVALUATION_FORM: return createEvaluationForm();
			case CourceListPackage.WORK: return createWork();
			case CourceListPackage.STUDY_COURCE_RELATION: return createStudyCourceRelation();
			case CourceListPackage.PROFESSOR: return createProfessor();
			case CourceListPackage.SPECIALISATION: return createSpecialisation();
			case CourceListPackage.COURCE_SPECIFICATION: return createCourceSpecification();
			case CourceListPackage.STUDY_GENERALIZATION: return createStudyGeneralization();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case CourceListPackage.SEMESTER:
				return createSemesterFromString(eDataType, initialValue);
			case CourceListPackage.WORK_FORM:
				return createWorkFormFromString(eDataType, initialValue);
			case CourceListPackage.EDUCATION_LEVEL:
				return createEducationLevelFromString(eDataType, initialValue);
			case CourceListPackage.EVALUATION_TYPE:
				return createEvaluationTypeFromString(eDataType, initialValue);
			case CourceListPackage.CAMPUS:
				return createCampusFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case CourceListPackage.SEMESTER:
				return convertSemesterToString(eDataType, instanceValue);
			case CourceListPackage.WORK_FORM:
				return convertWorkFormToString(eDataType, instanceValue);
			case CourceListPackage.EDUCATION_LEVEL:
				return convertEducationLevelToString(eDataType, instanceValue);
			case CourceListPackage.EVALUATION_TYPE:
				return convertEvaluationTypeToString(eDataType, instanceValue);
			case CourceListPackage.CAMPUS:
				return convertCampusToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Department createDepartment() {
		DepartmentImpl department = new DepartmentImpl();
		return department;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cource createCource() {
		CourceImpl cource = new CourceImpl();
		return cource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Student createStudent() {
		StudentImpl student = new StudentImpl();
		return student;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StudyProgram createStudyProgram() {
		StudyProgramImpl studyProgram = new StudyProgramImpl();
		return studyProgram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Exam createExam() {
		ExamImpl exam = new ExamImpl();
		return exam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvaluationForm createEvaluationForm() {
		EvaluationFormImpl evaluationForm = new EvaluationFormImpl();
		return evaluationForm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Work createWork() {
		WorkImpl work = new WorkImpl();
		return work;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StudyCourceRelation createStudyCourceRelation() {
		StudyCourceRelationImpl studyCourceRelation = new StudyCourceRelationImpl();
		return studyCourceRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Professor createProfessor() {
		ProfessorImpl professor = new ProfessorImpl();
		return professor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Specialisation createSpecialisation() {
		SpecialisationImpl specialisation = new SpecialisationImpl();
		return specialisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CourceSpecification createCourceSpecification() {
		CourceSpecificationImpl courceSpecification = new CourceSpecificationImpl();
		return courceSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StudyGeneralization createStudyGeneralization() {
		StudyGeneralizationImpl studyGeneralization = new StudyGeneralizationImpl();
		return studyGeneralization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Semester createSemesterFromString(EDataType eDataType, String initialValue) {
		Semester result = Semester.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSemesterToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkForm createWorkFormFromString(EDataType eDataType, String initialValue) {
		WorkForm result = WorkForm.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWorkFormToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EducationLevel createEducationLevelFromString(EDataType eDataType, String initialValue) {
		EducationLevel result = EducationLevel.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEducationLevelToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvaluationType createEvaluationTypeFromString(EDataType eDataType, String initialValue) {
		EvaluationType result = EvaluationType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEvaluationTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Campus createCampusFromString(EDataType eDataType, String initialValue) {
		Campus result = Campus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCampusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CourceListPackage getCourceListPackage() {
		return (CourceListPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CourceListPackage getPackage() {
		return CourceListPackage.eINSTANCE;
	}

} //CourceListFactoryImpl
