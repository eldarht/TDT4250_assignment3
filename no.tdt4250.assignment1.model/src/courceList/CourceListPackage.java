/**
 */
package courceList;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see courceList.CourceListFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore validationDelegates='http://www.eclipse.org/acceleo/query/1.0' settingDelegates='http://www.eclipse.org/acceleo/query/1.0'"
 * @generated
 */
public interface CourceListPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "courceList";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/resource/no.tdt4250.assignment1.model/model/courceList.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "no.tdt4250.assignment1.model";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CourceListPackage eINSTANCE = courceList.impl.CourceListPackageImpl.init();

	/**
	 * The meta object id for the '{@link courceList.impl.DepartmentImpl <em>Department</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see courceList.impl.DepartmentImpl
	 * @see courceList.impl.CourceListPackageImpl#getDepartment()
	 * @generated
	 */
	int DEPARTMENT = 0;

	/**
	 * The feature id for the '<em><b>Study Program</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT__STUDY_PROGRAM = 0;

	/**
	 * The feature id for the '<em><b>Course</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT__COURSE = 1;

	/**
	 * The feature id for the '<em><b>Professor</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT__PROFESSOR = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT__NAME = 3;

	/**
	 * The feature id for the '<em><b>Abbreviation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT__ABBREVIATION = 4;

	/**
	 * The number of structural features of the '<em>Department</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Department</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link courceList.impl.CourceImpl <em>Cource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see courceList.impl.CourceImpl
	 * @see courceList.impl.CourceListPackageImpl#getCource()
	 * @generated
	 */
	int COURCE = 1;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURCE__CODE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURCE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURCE__LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Department</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURCE__DEPARTMENT = 3;

	/**
	 * The feature id for the '<em><b>Corse Specifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURCE__CORSE_SPECIFICATIONS = 4;

	/**
	 * The number of structural features of the '<em>Cource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURCE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Cource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link courceList.impl.StudentImpl <em>Student</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see courceList.impl.StudentImpl
	 * @see courceList.impl.CourceListPackageImpl#getStudent()
	 * @generated
	 */
	int STUDENT = 2;

	/**
	 * The feature id for the '<em><b>Study Program</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__STUDY_PROGRAM = 0;

	/**
	 * The feature id for the '<em><b>Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__NR = 1;

	/**
	 * The number of structural features of the '<em>Student</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Student</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link courceList.impl.StudyProgramImpl <em>Study Program</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see courceList.impl.StudyProgramImpl
	 * @see courceList.impl.CourceListPackageImpl#getStudyProgram()
	 * @generated
	 */
	int STUDY_PROGRAM = 3;

	/**
	 * The feature id for the '<em><b>Cource</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY_PROGRAM__COURCE = 0;

	/**
	 * The feature id for the '<em><b>Generalization</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY_PROGRAM__GENERALIZATION = 1;

	/**
	 * The feature id for the '<em><b>Student</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY_PROGRAM__STUDENT = 2;

	/**
	 * The feature id for the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY_PROGRAM__YEAR = 3;

	/**
	 * The number of structural features of the '<em>Study Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY_PROGRAM_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Study Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY_PROGRAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link courceList.impl.ExamImpl <em>Exam</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see courceList.impl.ExamImpl
	 * @see courceList.impl.CourceListPackageImpl#getExam()
	 * @generated
	 */
	int EXAM = 4;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAM__WEIGHT = 0;

	/**
	 * The feature id for the '<em><b>Evaluation Form</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAM__EVALUATION_FORM = 1;

	/**
	 * The feature id for the '<em><b>Form</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAM__FORM = 2;

	/**
	 * The feature id for the '<em><b>Lenght</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAM__LENGHT = 3;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAM__DATE = 4;

	/**
	 * The number of structural features of the '<em>Exam</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAM_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Exam</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link courceList.impl.EvaluationFormImpl <em>Evaluation Form</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see courceList.impl.EvaluationFormImpl
	 * @see courceList.impl.CourceListPackageImpl#getEvaluationForm()
	 * @generated
	 */
	int EVALUATION_FORM = 5;

	/**
	 * The feature id for the '<em><b>Exam</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_FORM__EXAM = 0;

	/**
	 * The feature id for the '<em><b>Work</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_FORM__WORK = 1;

	/**
	 * The feature id for the '<em><b>Cource</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_FORM__COURCE = 2;

	/**
	 * The feature id for the '<em><b>Evaluation Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_FORM__EVALUATION_TYPE = 3;

	/**
	 * The number of structural features of the '<em>Evaluation Form</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_FORM_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Evaluation Form</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_FORM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link courceList.impl.WorkImpl <em>Work</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see courceList.impl.WorkImpl
	 * @see courceList.impl.CourceListPackageImpl#getWork()
	 * @generated
	 */
	int WORK = 6;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK__WEIGHT = 0;

	/**
	 * The feature id for the '<em><b>Evaluation Form</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK__EVALUATION_FORM = 1;

	/**
	 * The number of structural features of the '<em>Work</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Work</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link courceList.impl.StudyCourceRelationImpl <em>Study Cource Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see courceList.impl.StudyCourceRelationImpl
	 * @see courceList.impl.CourceListPackageImpl#getStudyCourceRelation()
	 * @generated
	 */
	int STUDY_COURCE_RELATION = 7;

	/**
	 * The feature id for the '<em><b>Cource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY_COURCE_RELATION__COURCE = 0;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY_COURCE_RELATION__STATUS = 1;

	/**
	 * The feature id for the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY_COURCE_RELATION__YEAR = 2;

	/**
	 * The feature id for the '<em><b>Specialisation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY_COURCE_RELATION__SPECIALISATION = 3;

	/**
	 * The number of structural features of the '<em>Study Cource Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY_COURCE_RELATION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Study Cource Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY_COURCE_RELATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link courceList.impl.ProfessorImpl <em>Professor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see courceList.impl.ProfessorImpl
	 * @see courceList.impl.CourceListPackageImpl#getProfessor()
	 * @generated
	 */
	int PROFESSOR = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR__NAME = 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR__TITLE = 1;

	/**
	 * The feature id for the '<em><b>Department</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR__DEPARTMENT = 2;

	/**
	 * The number of structural features of the '<em>Professor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Professor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link courceList.impl.SpecialisationImpl <em>Specialisation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see courceList.impl.SpecialisationImpl
	 * @see courceList.impl.CourceListPackageImpl#getSpecialisation()
	 * @generated
	 */
	int SPECIALISATION = 9;

	/**
	 * The feature id for the '<em><b>Cource</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALISATION__COURCE = 0;

	/**
	 * The feature id for the '<em><b>Study Program</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALISATION__STUDY_PROGRAM = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALISATION__NAME = 2;

	/**
	 * The feature id for the '<em><b>Start Semester</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALISATION__START_SEMESTER = 3;

	/**
	 * The feature id for the '<em><b>Further Specialisation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALISATION__FURTHER_SPECIALISATION = 4;

	/**
	 * The feature id for the '<em><b>Host Specialisation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALISATION__HOST_SPECIALISATION = 5;

	/**
	 * The number of structural features of the '<em>Specialisation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALISATION_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Specialisation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALISATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link courceList.impl.CourceSpecificationImpl <em>Cource Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see courceList.impl.CourceSpecificationImpl
	 * @see courceList.impl.CourceListPackageImpl#getCourceSpecification()
	 * @generated
	 */
	int COURCE_SPECIFICATION = 10;

	/**
	 * The feature id for the '<em><b>Cource</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURCE_SPECIFICATION__COURCE = 0;

	/**
	 * The feature id for the '<em><b>Coordinator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURCE_SPECIFICATION__COORDINATOR = 1;

	/**
	 * The feature id for the '<em><b>Evaluation Form</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURCE_SPECIFICATION__EVALUATION_FORM = 2;

	/**
	 * The feature id for the '<em><b>Specification Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURCE_SPECIFICATION__SPECIFICATION_YEAR = 3;

	/**
	 * The feature id for the '<em><b>Semester</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURCE_SPECIFICATION__SEMESTER = 4;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURCE_SPECIFICATION__LANGUAGE = 5;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURCE_SPECIFICATION__VERSION = 6;

	/**
	 * The feature id for the '<em><b>Credits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURCE_SPECIFICATION__CREDITS = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURCE_SPECIFICATION__NAME = 8;

	/**
	 * The number of structural features of the '<em>Cource Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURCE_SPECIFICATION_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Cource Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURCE_SPECIFICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link courceList.impl.StudyGeneralizationImpl <em>Study Generalization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see courceList.impl.StudyGeneralizationImpl
	 * @see courceList.impl.CourceListPackageImpl#getStudyGeneralization()
	 * @generated
	 */
	int STUDY_GENERALIZATION = 11;

	/**
	 * The feature id for the '<em><b>Study Program</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY_GENERALIZATION__STUDY_PROGRAM = 0;

	/**
	 * The feature id for the '<em><b>Department</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY_GENERALIZATION__DEPARTMENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY_GENERALIZATION__NAME = 2;

	/**
	 * The feature id for the '<em><b>Education Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY_GENERALIZATION__EDUCATION_LEVEL = 3;

	/**
	 * The feature id for the '<em><b>Nr Of Years</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY_GENERALIZATION__NR_OF_YEARS = 4;

	/**
	 * The feature id for the '<em><b>Campus</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY_GENERALIZATION__CAMPUS = 5;

	/**
	 * The feature id for the '<em><b>Abbreviation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY_GENERALIZATION__ABBREVIATION = 6;

	/**
	 * The number of structural features of the '<em>Study Generalization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY_GENERALIZATION_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Study Generalization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY_GENERALIZATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link courceList.Semester <em>Semester</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see courceList.Semester
	 * @see courceList.impl.CourceListPackageImpl#getSemester()
	 * @generated
	 */
	int SEMESTER = 12;

	/**
	 * The meta object id for the '{@link courceList.WorkForm <em>Work Form</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see courceList.WorkForm
	 * @see courceList.impl.CourceListPackageImpl#getWorkForm()
	 * @generated
	 */
	int WORK_FORM = 13;

	/**
	 * The meta object id for the '{@link courceList.EducationLevel <em>Education Level</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see courceList.EducationLevel
	 * @see courceList.impl.CourceListPackageImpl#getEducationLevel()
	 * @generated
	 */
	int EDUCATION_LEVEL = 14;

	/**
	 * The meta object id for the '{@link courceList.EvaluationType <em>Evaluation Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see courceList.EvaluationType
	 * @see courceList.impl.CourceListPackageImpl#getEvaluationType()
	 * @generated
	 */
	int EVALUATION_TYPE = 15;

	/**
	 * The meta object id for the '{@link courceList.Campus <em>Campus</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see courceList.Campus
	 * @see courceList.impl.CourceListPackageImpl#getCampus()
	 * @generated
	 */
	int CAMPUS = 16;


	/**
	 * Returns the meta object for class '{@link courceList.Department <em>Department</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Department</em>'.
	 * @see courceList.Department
	 * @generated
	 */
	EClass getDepartment();

	/**
	 * Returns the meta object for the containment reference list '{@link courceList.Department#getStudyProgram <em>Study Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Study Program</em>'.
	 * @see courceList.Department#getStudyProgram()
	 * @see #getDepartment()
	 * @generated
	 */
	EReference getDepartment_StudyProgram();

	/**
	 * Returns the meta object for the containment reference list '{@link courceList.Department#getCourse <em>Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Course</em>'.
	 * @see courceList.Department#getCourse()
	 * @see #getDepartment()
	 * @generated
	 */
	EReference getDepartment_Course();

	/**
	 * Returns the meta object for the containment reference list '{@link courceList.Department#getProfessor <em>Professor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Professor</em>'.
	 * @see courceList.Department#getProfessor()
	 * @see #getDepartment()
	 * @generated
	 */
	EReference getDepartment_Professor();

	/**
	 * Returns the meta object for the attribute '{@link courceList.Department#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see courceList.Department#getName()
	 * @see #getDepartment()
	 * @generated
	 */
	EAttribute getDepartment_Name();

	/**
	 * Returns the meta object for the attribute '{@link courceList.Department#getAbbreviation <em>Abbreviation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abbreviation</em>'.
	 * @see courceList.Department#getAbbreviation()
	 * @see #getDepartment()
	 * @generated
	 */
	EAttribute getDepartment_Abbreviation();

	/**
	 * Returns the meta object for class '{@link courceList.Cource <em>Cource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cource</em>'.
	 * @see courceList.Cource
	 * @generated
	 */
	EClass getCource();

	/**
	 * Returns the meta object for the attribute '{@link courceList.Cource#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see courceList.Cource#getCode()
	 * @see #getCource()
	 * @generated
	 */
	EAttribute getCource_Code();

	/**
	 * Returns the meta object for the attribute '{@link courceList.Cource#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see courceList.Cource#getName()
	 * @see #getCource()
	 * @generated
	 */
	EAttribute getCource_Name();

	/**
	 * Returns the meta object for the attribute '{@link courceList.Cource#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see courceList.Cource#getLocation()
	 * @see #getCource()
	 * @generated
	 */
	EAttribute getCource_Location();

	/**
	 * Returns the meta object for the container reference '{@link courceList.Cource#getDepartment <em>Department</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Department</em>'.
	 * @see courceList.Cource#getDepartment()
	 * @see #getCource()
	 * @generated
	 */
	EReference getCource_Department();

	/**
	 * Returns the meta object for the containment reference list '{@link courceList.Cource#getCorseSpecifications <em>Corse Specifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Corse Specifications</em>'.
	 * @see courceList.Cource#getCorseSpecifications()
	 * @see #getCource()
	 * @generated
	 */
	EReference getCource_CorseSpecifications();

	/**
	 * Returns the meta object for class '{@link courceList.Student <em>Student</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Student</em>'.
	 * @see courceList.Student
	 * @generated
	 */
	EClass getStudent();

	/**
	 * Returns the meta object for the container reference '{@link courceList.Student#getStudyProgram <em>Study Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Study Program</em>'.
	 * @see courceList.Student#getStudyProgram()
	 * @see #getStudent()
	 * @generated
	 */
	EReference getStudent_StudyProgram();

	/**
	 * Returns the meta object for the attribute '{@link courceList.Student#getNr <em>Nr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nr</em>'.
	 * @see courceList.Student#getNr()
	 * @see #getStudent()
	 * @generated
	 */
	EAttribute getStudent_Nr();

	/**
	 * Returns the meta object for class '{@link courceList.StudyProgram <em>Study Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Study Program</em>'.
	 * @see courceList.StudyProgram
	 * @generated
	 */
	EClass getStudyProgram();

	/**
	 * Returns the meta object for the containment reference list '{@link courceList.StudyProgram#getCource <em>Cource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cource</em>'.
	 * @see courceList.StudyProgram#getCource()
	 * @see #getStudyProgram()
	 * @generated
	 */
	EReference getStudyProgram_Cource();

	/**
	 * Returns the meta object for the container reference '{@link courceList.StudyProgram#getGeneralization <em>Generalization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Generalization</em>'.
	 * @see courceList.StudyProgram#getGeneralization()
	 * @see #getStudyProgram()
	 * @generated
	 */
	EReference getStudyProgram_Generalization();

	/**
	 * Returns the meta object for the containment reference list '{@link courceList.StudyProgram#getStudent <em>Student</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Student</em>'.
	 * @see courceList.StudyProgram#getStudent()
	 * @see #getStudyProgram()
	 * @generated
	 */
	EReference getStudyProgram_Student();

	/**
	 * Returns the meta object for the attribute '{@link courceList.StudyProgram#getYear <em>Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Year</em>'.
	 * @see courceList.StudyProgram#getYear()
	 * @see #getStudyProgram()
	 * @generated
	 */
	EAttribute getStudyProgram_Year();

	/**
	 * Returns the meta object for class '{@link courceList.Exam <em>Exam</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exam</em>'.
	 * @see courceList.Exam
	 * @generated
	 */
	EClass getExam();

	/**
	 * Returns the meta object for the attribute '{@link courceList.Exam#getWeight <em>Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weight</em>'.
	 * @see courceList.Exam#getWeight()
	 * @see #getExam()
	 * @generated
	 */
	EAttribute getExam_Weight();

	/**
	 * Returns the meta object for the container reference '{@link courceList.Exam#getEvaluationForm <em>Evaluation Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Evaluation Form</em>'.
	 * @see courceList.Exam#getEvaluationForm()
	 * @see #getExam()
	 * @generated
	 */
	EReference getExam_EvaluationForm();

	/**
	 * Returns the meta object for the attribute '{@link courceList.Exam#getForm <em>Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Form</em>'.
	 * @see courceList.Exam#getForm()
	 * @see #getExam()
	 * @generated
	 */
	EAttribute getExam_Form();

	/**
	 * Returns the meta object for the attribute '{@link courceList.Exam#getLenght <em>Lenght</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lenght</em>'.
	 * @see courceList.Exam#getLenght()
	 * @see #getExam()
	 * @generated
	 */
	EAttribute getExam_Lenght();

	/**
	 * Returns the meta object for the attribute '{@link courceList.Exam#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see courceList.Exam#getDate()
	 * @see #getExam()
	 * @generated
	 */
	EAttribute getExam_Date();

	/**
	 * Returns the meta object for class '{@link courceList.EvaluationForm <em>Evaluation Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evaluation Form</em>'.
	 * @see courceList.EvaluationForm
	 * @generated
	 */
	EClass getEvaluationForm();

	/**
	 * Returns the meta object for the containment reference '{@link courceList.EvaluationForm#getExam <em>Exam</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exam</em>'.
	 * @see courceList.EvaluationForm#getExam()
	 * @see #getEvaluationForm()
	 * @generated
	 */
	EReference getEvaluationForm_Exam();

	/**
	 * Returns the meta object for the containment reference '{@link courceList.EvaluationForm#getWork <em>Work</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Work</em>'.
	 * @see courceList.EvaluationForm#getWork()
	 * @see #getEvaluationForm()
	 * @generated
	 */
	EReference getEvaluationForm_Work();

	/**
	 * Returns the meta object for the container reference '{@link courceList.EvaluationForm#getCource <em>Cource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Cource</em>'.
	 * @see courceList.EvaluationForm#getCource()
	 * @see #getEvaluationForm()
	 * @generated
	 */
	EReference getEvaluationForm_Cource();

	/**
	 * Returns the meta object for the attribute '{@link courceList.EvaluationForm#getEvaluationType <em>Evaluation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Evaluation Type</em>'.
	 * @see courceList.EvaluationForm#getEvaluationType()
	 * @see #getEvaluationForm()
	 * @generated
	 */
	EAttribute getEvaluationForm_EvaluationType();

	/**
	 * Returns the meta object for class '{@link courceList.Work <em>Work</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Work</em>'.
	 * @see courceList.Work
	 * @generated
	 */
	EClass getWork();

	/**
	 * Returns the meta object for the attribute '{@link courceList.Work#getWeight <em>Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weight</em>'.
	 * @see courceList.Work#getWeight()
	 * @see #getWork()
	 * @generated
	 */
	EAttribute getWork_Weight();

	/**
	 * Returns the meta object for the container reference '{@link courceList.Work#getEvaluationForm <em>Evaluation Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Evaluation Form</em>'.
	 * @see courceList.Work#getEvaluationForm()
	 * @see #getWork()
	 * @generated
	 */
	EReference getWork_EvaluationForm();

	/**
	 * Returns the meta object for class '{@link courceList.StudyCourceRelation <em>Study Cource Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Study Cource Relation</em>'.
	 * @see courceList.StudyCourceRelation
	 * @generated
	 */
	EClass getStudyCourceRelation();

	/**
	 * Returns the meta object for the reference '{@link courceList.StudyCourceRelation#getCource <em>Cource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cource</em>'.
	 * @see courceList.StudyCourceRelation#getCource()
	 * @see #getStudyCourceRelation()
	 * @generated
	 */
	EReference getStudyCourceRelation_Cource();

	/**
	 * Returns the meta object for the attribute '{@link courceList.StudyCourceRelation#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see courceList.StudyCourceRelation#getStatus()
	 * @see #getStudyCourceRelation()
	 * @generated
	 */
	EAttribute getStudyCourceRelation_Status();

	/**
	 * Returns the meta object for the attribute '{@link courceList.StudyCourceRelation#getYear <em>Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Year</em>'.
	 * @see courceList.StudyCourceRelation#getYear()
	 * @see #getStudyCourceRelation()
	 * @generated
	 */
	EAttribute getStudyCourceRelation_Year();

	/**
	 * Returns the meta object for the container reference '{@link courceList.StudyCourceRelation#getSpecialisation <em>Specialisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Specialisation</em>'.
	 * @see courceList.StudyCourceRelation#getSpecialisation()
	 * @see #getStudyCourceRelation()
	 * @generated
	 */
	EReference getStudyCourceRelation_Specialisation();

	/**
	 * Returns the meta object for class '{@link courceList.Professor <em>Professor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Professor</em>'.
	 * @see courceList.Professor
	 * @generated
	 */
	EClass getProfessor();

	/**
	 * Returns the meta object for the attribute '{@link courceList.Professor#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see courceList.Professor#getName()
	 * @see #getProfessor()
	 * @generated
	 */
	EAttribute getProfessor_Name();

	/**
	 * Returns the meta object for the attribute '{@link courceList.Professor#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see courceList.Professor#getTitle()
	 * @see #getProfessor()
	 * @generated
	 */
	EAttribute getProfessor_Title();

	/**
	 * Returns the meta object for the container reference '{@link courceList.Professor#getDepartment <em>Department</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Department</em>'.
	 * @see courceList.Professor#getDepartment()
	 * @see #getProfessor()
	 * @generated
	 */
	EReference getProfessor_Department();

	/**
	 * Returns the meta object for class '{@link courceList.Specialisation <em>Specialisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specialisation</em>'.
	 * @see courceList.Specialisation
	 * @generated
	 */
	EClass getSpecialisation();

	/**
	 * Returns the meta object for the containment reference list '{@link courceList.Specialisation#getCource <em>Cource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cource</em>'.
	 * @see courceList.Specialisation#getCource()
	 * @see #getSpecialisation()
	 * @generated
	 */
	EReference getSpecialisation_Cource();

	/**
	 * Returns the meta object for the container reference '{@link courceList.Specialisation#getStudyProgram <em>Study Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Study Program</em>'.
	 * @see courceList.Specialisation#getStudyProgram()
	 * @see #getSpecialisation()
	 * @generated
	 */
	EReference getSpecialisation_StudyProgram();

	/**
	 * Returns the meta object for the attribute '{@link courceList.Specialisation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see courceList.Specialisation#getName()
	 * @see #getSpecialisation()
	 * @generated
	 */
	EAttribute getSpecialisation_Name();

	/**
	 * Returns the meta object for the attribute '{@link courceList.Specialisation#getStartSemester <em>Start Semester</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Semester</em>'.
	 * @see courceList.Specialisation#getStartSemester()
	 * @see #getSpecialisation()
	 * @generated
	 */
	EAttribute getSpecialisation_StartSemester();

	/**
	 * Returns the meta object for the containment reference list '{@link courceList.Specialisation#getFurtherSpecialisation <em>Further Specialisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Further Specialisation</em>'.
	 * @see courceList.Specialisation#getFurtherSpecialisation()
	 * @see #getSpecialisation()
	 * @generated
	 */
	EReference getSpecialisation_FurtherSpecialisation();

	/**
	 * Returns the meta object for the container reference '{@link courceList.Specialisation#getHostSpecialisation <em>Host Specialisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Host Specialisation</em>'.
	 * @see courceList.Specialisation#getHostSpecialisation()
	 * @see #getSpecialisation()
	 * @generated
	 */
	EReference getSpecialisation_HostSpecialisation();

	/**
	 * Returns the meta object for class '{@link courceList.CourceSpecification <em>Cource Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cource Specification</em>'.
	 * @see courceList.CourceSpecification
	 * @generated
	 */
	EClass getCourceSpecification();

	/**
	 * Returns the meta object for the container reference '{@link courceList.CourceSpecification#getCource <em>Cource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Cource</em>'.
	 * @see courceList.CourceSpecification#getCource()
	 * @see #getCourceSpecification()
	 * @generated
	 */
	EReference getCourceSpecification_Cource();

	/**
	 * Returns the meta object for the reference '{@link courceList.CourceSpecification#getCoordinator <em>Coordinator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Coordinator</em>'.
	 * @see courceList.CourceSpecification#getCoordinator()
	 * @see #getCourceSpecification()
	 * @generated
	 */
	EReference getCourceSpecification_Coordinator();

	/**
	 * Returns the meta object for the containment reference '{@link courceList.CourceSpecification#getEvaluationForm <em>Evaluation Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Evaluation Form</em>'.
	 * @see courceList.CourceSpecification#getEvaluationForm()
	 * @see #getCourceSpecification()
	 * @generated
	 */
	EReference getCourceSpecification_EvaluationForm();

	/**
	 * Returns the meta object for the attribute '{@link courceList.CourceSpecification#getSpecificationYear <em>Specification Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Specification Year</em>'.
	 * @see courceList.CourceSpecification#getSpecificationYear()
	 * @see #getCourceSpecification()
	 * @generated
	 */
	EAttribute getCourceSpecification_SpecificationYear();

	/**
	 * Returns the meta object for the attribute list '{@link courceList.CourceSpecification#getSemester <em>Semester</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Semester</em>'.
	 * @see courceList.CourceSpecification#getSemester()
	 * @see #getCourceSpecification()
	 * @generated
	 */
	EAttribute getCourceSpecification_Semester();

	/**
	 * Returns the meta object for the attribute '{@link courceList.CourceSpecification#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see courceList.CourceSpecification#getLanguage()
	 * @see #getCourceSpecification()
	 * @generated
	 */
	EAttribute getCourceSpecification_Language();

	/**
	 * Returns the meta object for the attribute '{@link courceList.CourceSpecification#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see courceList.CourceSpecification#getVersion()
	 * @see #getCourceSpecification()
	 * @generated
	 */
	EAttribute getCourceSpecification_Version();

	/**
	 * Returns the meta object for the attribute '{@link courceList.CourceSpecification#getCredits <em>Credits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Credits</em>'.
	 * @see courceList.CourceSpecification#getCredits()
	 * @see #getCourceSpecification()
	 * @generated
	 */
	EAttribute getCourceSpecification_Credits();

	/**
	 * Returns the meta object for the attribute '{@link courceList.CourceSpecification#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see courceList.CourceSpecification#getName()
	 * @see #getCourceSpecification()
	 * @generated
	 */
	EAttribute getCourceSpecification_Name();

	/**
	 * Returns the meta object for class '{@link courceList.StudyGeneralization <em>Study Generalization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Study Generalization</em>'.
	 * @see courceList.StudyGeneralization
	 * @generated
	 */
	EClass getStudyGeneralization();

	/**
	 * Returns the meta object for the containment reference list '{@link courceList.StudyGeneralization#getStudyProgram <em>Study Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Study Program</em>'.
	 * @see courceList.StudyGeneralization#getStudyProgram()
	 * @see #getStudyGeneralization()
	 * @generated
	 */
	EReference getStudyGeneralization_StudyProgram();

	/**
	 * Returns the meta object for the container reference '{@link courceList.StudyGeneralization#getDepartment <em>Department</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Department</em>'.
	 * @see courceList.StudyGeneralization#getDepartment()
	 * @see #getStudyGeneralization()
	 * @generated
	 */
	EReference getStudyGeneralization_Department();

	/**
	 * Returns the meta object for the attribute '{@link courceList.StudyGeneralization#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see courceList.StudyGeneralization#getName()
	 * @see #getStudyGeneralization()
	 * @generated
	 */
	EAttribute getStudyGeneralization_Name();

	/**
	 * Returns the meta object for the attribute '{@link courceList.StudyGeneralization#getEducationLevel <em>Education Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Education Level</em>'.
	 * @see courceList.StudyGeneralization#getEducationLevel()
	 * @see #getStudyGeneralization()
	 * @generated
	 */
	EAttribute getStudyGeneralization_EducationLevel();

	/**
	 * Returns the meta object for the attribute '{@link courceList.StudyGeneralization#getNrOfYears <em>Nr Of Years</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nr Of Years</em>'.
	 * @see courceList.StudyGeneralization#getNrOfYears()
	 * @see #getStudyGeneralization()
	 * @generated
	 */
	EAttribute getStudyGeneralization_NrOfYears();

	/**
	 * Returns the meta object for the attribute list '{@link courceList.StudyGeneralization#getCampus <em>Campus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Campus</em>'.
	 * @see courceList.StudyGeneralization#getCampus()
	 * @see #getStudyGeneralization()
	 * @generated
	 */
	EAttribute getStudyGeneralization_Campus();

	/**
	 * Returns the meta object for the attribute '{@link courceList.StudyGeneralization#getAbbreviation <em>Abbreviation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abbreviation</em>'.
	 * @see courceList.StudyGeneralization#getAbbreviation()
	 * @see #getStudyGeneralization()
	 * @generated
	 */
	EAttribute getStudyGeneralization_Abbreviation();

	/**
	 * Returns the meta object for enum '{@link courceList.Semester <em>Semester</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Semester</em>'.
	 * @see courceList.Semester
	 * @generated
	 */
	EEnum getSemester();

	/**
	 * Returns the meta object for enum '{@link courceList.WorkForm <em>Work Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Work Form</em>'.
	 * @see courceList.WorkForm
	 * @generated
	 */
	EEnum getWorkForm();

	/**
	 * Returns the meta object for enum '{@link courceList.EducationLevel <em>Education Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Education Level</em>'.
	 * @see courceList.EducationLevel
	 * @generated
	 */
	EEnum getEducationLevel();

	/**
	 * Returns the meta object for enum '{@link courceList.EvaluationType <em>Evaluation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Evaluation Type</em>'.
	 * @see courceList.EvaluationType
	 * @generated
	 */
	EEnum getEvaluationType();

	/**
	 * Returns the meta object for enum '{@link courceList.Campus <em>Campus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Campus</em>'.
	 * @see courceList.Campus
	 * @generated
	 */
	EEnum getCampus();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CourceListFactory getCourceListFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link courceList.impl.DepartmentImpl <em>Department</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see courceList.impl.DepartmentImpl
		 * @see courceList.impl.CourceListPackageImpl#getDepartment()
		 * @generated
		 */
		EClass DEPARTMENT = eINSTANCE.getDepartment();

		/**
		 * The meta object literal for the '<em><b>Study Program</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPARTMENT__STUDY_PROGRAM = eINSTANCE.getDepartment_StudyProgram();

		/**
		 * The meta object literal for the '<em><b>Course</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPARTMENT__COURSE = eINSTANCE.getDepartment_Course();

		/**
		 * The meta object literal for the '<em><b>Professor</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPARTMENT__PROFESSOR = eINSTANCE.getDepartment_Professor();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPARTMENT__NAME = eINSTANCE.getDepartment_Name();

		/**
		 * The meta object literal for the '<em><b>Abbreviation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPARTMENT__ABBREVIATION = eINSTANCE.getDepartment_Abbreviation();

		/**
		 * The meta object literal for the '{@link courceList.impl.CourceImpl <em>Cource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see courceList.impl.CourceImpl
		 * @see courceList.impl.CourceListPackageImpl#getCource()
		 * @generated
		 */
		EClass COURCE = eINSTANCE.getCource();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURCE__CODE = eINSTANCE.getCource_Code();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURCE__NAME = eINSTANCE.getCource_Name();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURCE__LOCATION = eINSTANCE.getCource_Location();

		/**
		 * The meta object literal for the '<em><b>Department</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURCE__DEPARTMENT = eINSTANCE.getCource_Department();

		/**
		 * The meta object literal for the '<em><b>Corse Specifications</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURCE__CORSE_SPECIFICATIONS = eINSTANCE.getCource_CorseSpecifications();

		/**
		 * The meta object literal for the '{@link courceList.impl.StudentImpl <em>Student</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see courceList.impl.StudentImpl
		 * @see courceList.impl.CourceListPackageImpl#getStudent()
		 * @generated
		 */
		EClass STUDENT = eINSTANCE.getStudent();

		/**
		 * The meta object literal for the '<em><b>Study Program</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STUDENT__STUDY_PROGRAM = eINSTANCE.getStudent_StudyProgram();

		/**
		 * The meta object literal for the '<em><b>Nr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STUDENT__NR = eINSTANCE.getStudent_Nr();

		/**
		 * The meta object literal for the '{@link courceList.impl.StudyProgramImpl <em>Study Program</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see courceList.impl.StudyProgramImpl
		 * @see courceList.impl.CourceListPackageImpl#getStudyProgram()
		 * @generated
		 */
		EClass STUDY_PROGRAM = eINSTANCE.getStudyProgram();

		/**
		 * The meta object literal for the '<em><b>Cource</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STUDY_PROGRAM__COURCE = eINSTANCE.getStudyProgram_Cource();

		/**
		 * The meta object literal for the '<em><b>Generalization</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STUDY_PROGRAM__GENERALIZATION = eINSTANCE.getStudyProgram_Generalization();

		/**
		 * The meta object literal for the '<em><b>Student</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STUDY_PROGRAM__STUDENT = eINSTANCE.getStudyProgram_Student();

		/**
		 * The meta object literal for the '<em><b>Year</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STUDY_PROGRAM__YEAR = eINSTANCE.getStudyProgram_Year();

		/**
		 * The meta object literal for the '{@link courceList.impl.ExamImpl <em>Exam</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see courceList.impl.ExamImpl
		 * @see courceList.impl.CourceListPackageImpl#getExam()
		 * @generated
		 */
		EClass EXAM = eINSTANCE.getExam();

		/**
		 * The meta object literal for the '<em><b>Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXAM__WEIGHT = eINSTANCE.getExam_Weight();

		/**
		 * The meta object literal for the '<em><b>Evaluation Form</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXAM__EVALUATION_FORM = eINSTANCE.getExam_EvaluationForm();

		/**
		 * The meta object literal for the '<em><b>Form</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXAM__FORM = eINSTANCE.getExam_Form();

		/**
		 * The meta object literal for the '<em><b>Lenght</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXAM__LENGHT = eINSTANCE.getExam_Lenght();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXAM__DATE = eINSTANCE.getExam_Date();

		/**
		 * The meta object literal for the '{@link courceList.impl.EvaluationFormImpl <em>Evaluation Form</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see courceList.impl.EvaluationFormImpl
		 * @see courceList.impl.CourceListPackageImpl#getEvaluationForm()
		 * @generated
		 */
		EClass EVALUATION_FORM = eINSTANCE.getEvaluationForm();

		/**
		 * The meta object literal for the '<em><b>Exam</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVALUATION_FORM__EXAM = eINSTANCE.getEvaluationForm_Exam();

		/**
		 * The meta object literal for the '<em><b>Work</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVALUATION_FORM__WORK = eINSTANCE.getEvaluationForm_Work();

		/**
		 * The meta object literal for the '<em><b>Cource</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVALUATION_FORM__COURCE = eINSTANCE.getEvaluationForm_Cource();

		/**
		 * The meta object literal for the '<em><b>Evaluation Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVALUATION_FORM__EVALUATION_TYPE = eINSTANCE.getEvaluationForm_EvaluationType();

		/**
		 * The meta object literal for the '{@link courceList.impl.WorkImpl <em>Work</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see courceList.impl.WorkImpl
		 * @see courceList.impl.CourceListPackageImpl#getWork()
		 * @generated
		 */
		EClass WORK = eINSTANCE.getWork();

		/**
		 * The meta object literal for the '<em><b>Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK__WEIGHT = eINSTANCE.getWork_Weight();

		/**
		 * The meta object literal for the '<em><b>Evaluation Form</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK__EVALUATION_FORM = eINSTANCE.getWork_EvaluationForm();

		/**
		 * The meta object literal for the '{@link courceList.impl.StudyCourceRelationImpl <em>Study Cource Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see courceList.impl.StudyCourceRelationImpl
		 * @see courceList.impl.CourceListPackageImpl#getStudyCourceRelation()
		 * @generated
		 */
		EClass STUDY_COURCE_RELATION = eINSTANCE.getStudyCourceRelation();

		/**
		 * The meta object literal for the '<em><b>Cource</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STUDY_COURCE_RELATION__COURCE = eINSTANCE.getStudyCourceRelation_Cource();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STUDY_COURCE_RELATION__STATUS = eINSTANCE.getStudyCourceRelation_Status();

		/**
		 * The meta object literal for the '<em><b>Year</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STUDY_COURCE_RELATION__YEAR = eINSTANCE.getStudyCourceRelation_Year();

		/**
		 * The meta object literal for the '<em><b>Specialisation</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STUDY_COURCE_RELATION__SPECIALISATION = eINSTANCE.getStudyCourceRelation_Specialisation();

		/**
		 * The meta object literal for the '{@link courceList.impl.ProfessorImpl <em>Professor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see courceList.impl.ProfessorImpl
		 * @see courceList.impl.CourceListPackageImpl#getProfessor()
		 * @generated
		 */
		EClass PROFESSOR = eINSTANCE.getProfessor();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROFESSOR__NAME = eINSTANCE.getProfessor_Name();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROFESSOR__TITLE = eINSTANCE.getProfessor_Title();

		/**
		 * The meta object literal for the '<em><b>Department</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROFESSOR__DEPARTMENT = eINSTANCE.getProfessor_Department();

		/**
		 * The meta object literal for the '{@link courceList.impl.SpecialisationImpl <em>Specialisation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see courceList.impl.SpecialisationImpl
		 * @see courceList.impl.CourceListPackageImpl#getSpecialisation()
		 * @generated
		 */
		EClass SPECIALISATION = eINSTANCE.getSpecialisation();

		/**
		 * The meta object literal for the '<em><b>Cource</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIALISATION__COURCE = eINSTANCE.getSpecialisation_Cource();

		/**
		 * The meta object literal for the '<em><b>Study Program</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIALISATION__STUDY_PROGRAM = eINSTANCE.getSpecialisation_StudyProgram();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECIALISATION__NAME = eINSTANCE.getSpecialisation_Name();

		/**
		 * The meta object literal for the '<em><b>Start Semester</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECIALISATION__START_SEMESTER = eINSTANCE.getSpecialisation_StartSemester();

		/**
		 * The meta object literal for the '<em><b>Further Specialisation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIALISATION__FURTHER_SPECIALISATION = eINSTANCE.getSpecialisation_FurtherSpecialisation();

		/**
		 * The meta object literal for the '<em><b>Host Specialisation</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIALISATION__HOST_SPECIALISATION = eINSTANCE.getSpecialisation_HostSpecialisation();

		/**
		 * The meta object literal for the '{@link courceList.impl.CourceSpecificationImpl <em>Cource Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see courceList.impl.CourceSpecificationImpl
		 * @see courceList.impl.CourceListPackageImpl#getCourceSpecification()
		 * @generated
		 */
		EClass COURCE_SPECIFICATION = eINSTANCE.getCourceSpecification();

		/**
		 * The meta object literal for the '<em><b>Cource</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURCE_SPECIFICATION__COURCE = eINSTANCE.getCourceSpecification_Cource();

		/**
		 * The meta object literal for the '<em><b>Coordinator</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURCE_SPECIFICATION__COORDINATOR = eINSTANCE.getCourceSpecification_Coordinator();

		/**
		 * The meta object literal for the '<em><b>Evaluation Form</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURCE_SPECIFICATION__EVALUATION_FORM = eINSTANCE.getCourceSpecification_EvaluationForm();

		/**
		 * The meta object literal for the '<em><b>Specification Year</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURCE_SPECIFICATION__SPECIFICATION_YEAR = eINSTANCE.getCourceSpecification_SpecificationYear();

		/**
		 * The meta object literal for the '<em><b>Semester</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURCE_SPECIFICATION__SEMESTER = eINSTANCE.getCourceSpecification_Semester();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURCE_SPECIFICATION__LANGUAGE = eINSTANCE.getCourceSpecification_Language();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURCE_SPECIFICATION__VERSION = eINSTANCE.getCourceSpecification_Version();

		/**
		 * The meta object literal for the '<em><b>Credits</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURCE_SPECIFICATION__CREDITS = eINSTANCE.getCourceSpecification_Credits();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURCE_SPECIFICATION__NAME = eINSTANCE.getCourceSpecification_Name();

		/**
		 * The meta object literal for the '{@link courceList.impl.StudyGeneralizationImpl <em>Study Generalization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see courceList.impl.StudyGeneralizationImpl
		 * @see courceList.impl.CourceListPackageImpl#getStudyGeneralization()
		 * @generated
		 */
		EClass STUDY_GENERALIZATION = eINSTANCE.getStudyGeneralization();

		/**
		 * The meta object literal for the '<em><b>Study Program</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STUDY_GENERALIZATION__STUDY_PROGRAM = eINSTANCE.getStudyGeneralization_StudyProgram();

		/**
		 * The meta object literal for the '<em><b>Department</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STUDY_GENERALIZATION__DEPARTMENT = eINSTANCE.getStudyGeneralization_Department();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STUDY_GENERALIZATION__NAME = eINSTANCE.getStudyGeneralization_Name();

		/**
		 * The meta object literal for the '<em><b>Education Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STUDY_GENERALIZATION__EDUCATION_LEVEL = eINSTANCE.getStudyGeneralization_EducationLevel();

		/**
		 * The meta object literal for the '<em><b>Nr Of Years</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STUDY_GENERALIZATION__NR_OF_YEARS = eINSTANCE.getStudyGeneralization_NrOfYears();

		/**
		 * The meta object literal for the '<em><b>Campus</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STUDY_GENERALIZATION__CAMPUS = eINSTANCE.getStudyGeneralization_Campus();

		/**
		 * The meta object literal for the '<em><b>Abbreviation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STUDY_GENERALIZATION__ABBREVIATION = eINSTANCE.getStudyGeneralization_Abbreviation();

		/**
		 * The meta object literal for the '{@link courceList.Semester <em>Semester</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see courceList.Semester
		 * @see courceList.impl.CourceListPackageImpl#getSemester()
		 * @generated
		 */
		EEnum SEMESTER = eINSTANCE.getSemester();

		/**
		 * The meta object literal for the '{@link courceList.WorkForm <em>Work Form</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see courceList.WorkForm
		 * @see courceList.impl.CourceListPackageImpl#getWorkForm()
		 * @generated
		 */
		EEnum WORK_FORM = eINSTANCE.getWorkForm();

		/**
		 * The meta object literal for the '{@link courceList.EducationLevel <em>Education Level</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see courceList.EducationLevel
		 * @see courceList.impl.CourceListPackageImpl#getEducationLevel()
		 * @generated
		 */
		EEnum EDUCATION_LEVEL = eINSTANCE.getEducationLevel();

		/**
		 * The meta object literal for the '{@link courceList.EvaluationType <em>Evaluation Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see courceList.EvaluationType
		 * @see courceList.impl.CourceListPackageImpl#getEvaluationType()
		 * @generated
		 */
		EEnum EVALUATION_TYPE = eINSTANCE.getEvaluationType();

		/**
		 * The meta object literal for the '{@link courceList.Campus <em>Campus</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see courceList.Campus
		 * @see courceList.impl.CourceListPackageImpl#getCampus()
		 * @generated
		 */
		EEnum CAMPUS = eINSTANCE.getCampus();

	}

} //CourceListPackage
