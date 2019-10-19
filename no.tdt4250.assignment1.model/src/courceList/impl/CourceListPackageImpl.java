/**
 */
package courceList.impl;

import courceList.Campus;
import courceList.Cource;
import courceList.CourceListFactory;
import courceList.CourceListPackage;
import courceList.CourceSpecification;
import courceList.Department;
import courceList.EducationLevel;
import courceList.EvaluationForm;
import courceList.EvaluationType;
import courceList.Exam;
import courceList.Professor;
import courceList.Semester;
import courceList.Specialisation;
import courceList.Student;
import courceList.StudyCourceRelation;
import courceList.StudyGeneralization;
import courceList.StudyProgram;
import courceList.Work;
import courceList.WorkForm;

import courceList.util.CourceListValidator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CourceListPackageImpl extends EPackageImpl implements CourceListPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass departmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass courceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass studentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass studyProgramEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass examEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass evaluationFormEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass studyCourceRelationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass professorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specialisationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass courceSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass studyGeneralizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum semesterEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum workFormEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum educationLevelEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum evaluationTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum campusEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see courceList.CourceListPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CourceListPackageImpl() {
		super(eNS_URI, CourceListFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link CourceListPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CourceListPackage init() {
		if (isInited) return (CourceListPackage)EPackage.Registry.INSTANCE.getEPackage(CourceListPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredCourceListPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		CourceListPackageImpl theCourceListPackage = registeredCourceListPackage instanceof CourceListPackageImpl ? (CourceListPackageImpl)registeredCourceListPackage : new CourceListPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theCourceListPackage.createPackageContents();

		// Initialize created meta-data
		theCourceListPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theCourceListPackage,
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return CourceListValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theCourceListPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CourceListPackage.eNS_URI, theCourceListPackage);
		return theCourceListPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDepartment() {
		return departmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDepartment_StudyProgram() {
		return (EReference)departmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDepartment_Course() {
		return (EReference)departmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDepartment_Professor() {
		return (EReference)departmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDepartment_Name() {
		return (EAttribute)departmentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDepartment_Abbreviation() {
		return (EAttribute)departmentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCource() {
		return courceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCource_Code() {
		return (EAttribute)courceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCource_Name() {
		return (EAttribute)courceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCource_Location() {
		return (EAttribute)courceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCource_Department() {
		return (EReference)courceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCource_CorseSpecifications() {
		return (EReference)courceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStudent() {
		return studentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStudent_StudyProgram() {
		return (EReference)studentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStudent_Nr() {
		return (EAttribute)studentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStudyProgram() {
		return studyProgramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStudyProgram_Cource() {
		return (EReference)studyProgramEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStudyProgram_Generalization() {
		return (EReference)studyProgramEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStudyProgram_Student() {
		return (EReference)studyProgramEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStudyProgram_Year() {
		return (EAttribute)studyProgramEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExam() {
		return examEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExam_Weight() {
		return (EAttribute)examEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExam_EvaluationForm() {
		return (EReference)examEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExam_Form() {
		return (EAttribute)examEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExam_Lenght() {
		return (EAttribute)examEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExam_Date() {
		return (EAttribute)examEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvaluationForm() {
		return evaluationFormEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvaluationForm_Exam() {
		return (EReference)evaluationFormEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvaluationForm_Work() {
		return (EReference)evaluationFormEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvaluationForm_Cource() {
		return (EReference)evaluationFormEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvaluationForm_EvaluationType() {
		return (EAttribute)evaluationFormEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWork() {
		return workEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWork_Weight() {
		return (EAttribute)workEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWork_EvaluationForm() {
		return (EReference)workEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStudyCourceRelation() {
		return studyCourceRelationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStudyCourceRelation_Cource() {
		return (EReference)studyCourceRelationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStudyCourceRelation_Status() {
		return (EAttribute)studyCourceRelationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStudyCourceRelation_Year() {
		return (EAttribute)studyCourceRelationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStudyCourceRelation_Specialisation() {
		return (EReference)studyCourceRelationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProfessor() {
		return professorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProfessor_Name() {
		return (EAttribute)professorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProfessor_Title() {
		return (EAttribute)professorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProfessor_Department() {
		return (EReference)professorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpecialisation() {
		return specialisationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecialisation_Cource() {
		return (EReference)specialisationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecialisation_StudyProgram() {
		return (EReference)specialisationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpecialisation_Name() {
		return (EAttribute)specialisationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpecialisation_StartSemester() {
		return (EAttribute)specialisationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecialisation_FurtherSpecialisation() {
		return (EReference)specialisationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecialisation_HostSpecialisation() {
		return (EReference)specialisationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCourceSpecification() {
		return courceSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCourceSpecification_Cource() {
		return (EReference)courceSpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCourceSpecification_Coordinator() {
		return (EReference)courceSpecificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCourceSpecification_EvaluationForm() {
		return (EReference)courceSpecificationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCourceSpecification_SpecificationYear() {
		return (EAttribute)courceSpecificationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCourceSpecification_Semester() {
		return (EAttribute)courceSpecificationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCourceSpecification_Language() {
		return (EAttribute)courceSpecificationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCourceSpecification_Version() {
		return (EAttribute)courceSpecificationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCourceSpecification_Credits() {
		return (EAttribute)courceSpecificationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCourceSpecification_Name() {
		return (EAttribute)courceSpecificationEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStudyGeneralization() {
		return studyGeneralizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStudyGeneralization_StudyProgram() {
		return (EReference)studyGeneralizationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStudyGeneralization_Department() {
		return (EReference)studyGeneralizationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStudyGeneralization_Name() {
		return (EAttribute)studyGeneralizationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStudyGeneralization_EducationLevel() {
		return (EAttribute)studyGeneralizationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStudyGeneralization_NrOfYears() {
		return (EAttribute)studyGeneralizationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStudyGeneralization_Campus() {
		return (EAttribute)studyGeneralizationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStudyGeneralization_Abbreviation() {
		return (EAttribute)studyGeneralizationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSemester() {
		return semesterEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getWorkForm() {
		return workFormEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEducationLevel() {
		return educationLevelEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEvaluationType() {
		return evaluationTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCampus() {
		return campusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CourceListFactory getCourceListFactory() {
		return (CourceListFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		departmentEClass = createEClass(DEPARTMENT);
		createEReference(departmentEClass, DEPARTMENT__STUDY_PROGRAM);
		createEReference(departmentEClass, DEPARTMENT__COURSE);
		createEReference(departmentEClass, DEPARTMENT__PROFESSOR);
		createEAttribute(departmentEClass, DEPARTMENT__NAME);
		createEAttribute(departmentEClass, DEPARTMENT__ABBREVIATION);

		courceEClass = createEClass(COURCE);
		createEAttribute(courceEClass, COURCE__CODE);
		createEAttribute(courceEClass, COURCE__NAME);
		createEAttribute(courceEClass, COURCE__LOCATION);
		createEReference(courceEClass, COURCE__DEPARTMENT);
		createEReference(courceEClass, COURCE__CORSE_SPECIFICATIONS);

		studentEClass = createEClass(STUDENT);
		createEReference(studentEClass, STUDENT__STUDY_PROGRAM);
		createEAttribute(studentEClass, STUDENT__NR);

		studyProgramEClass = createEClass(STUDY_PROGRAM);
		createEReference(studyProgramEClass, STUDY_PROGRAM__COURCE);
		createEReference(studyProgramEClass, STUDY_PROGRAM__GENERALIZATION);
		createEReference(studyProgramEClass, STUDY_PROGRAM__STUDENT);
		createEAttribute(studyProgramEClass, STUDY_PROGRAM__YEAR);

		examEClass = createEClass(EXAM);
		createEAttribute(examEClass, EXAM__WEIGHT);
		createEReference(examEClass, EXAM__EVALUATION_FORM);
		createEAttribute(examEClass, EXAM__FORM);
		createEAttribute(examEClass, EXAM__LENGHT);
		createEAttribute(examEClass, EXAM__DATE);

		evaluationFormEClass = createEClass(EVALUATION_FORM);
		createEReference(evaluationFormEClass, EVALUATION_FORM__EXAM);
		createEReference(evaluationFormEClass, EVALUATION_FORM__WORK);
		createEReference(evaluationFormEClass, EVALUATION_FORM__COURCE);
		createEAttribute(evaluationFormEClass, EVALUATION_FORM__EVALUATION_TYPE);

		workEClass = createEClass(WORK);
		createEAttribute(workEClass, WORK__WEIGHT);
		createEReference(workEClass, WORK__EVALUATION_FORM);

		studyCourceRelationEClass = createEClass(STUDY_COURCE_RELATION);
		createEReference(studyCourceRelationEClass, STUDY_COURCE_RELATION__COURCE);
		createEAttribute(studyCourceRelationEClass, STUDY_COURCE_RELATION__STATUS);
		createEAttribute(studyCourceRelationEClass, STUDY_COURCE_RELATION__YEAR);
		createEReference(studyCourceRelationEClass, STUDY_COURCE_RELATION__SPECIALISATION);

		professorEClass = createEClass(PROFESSOR);
		createEAttribute(professorEClass, PROFESSOR__NAME);
		createEAttribute(professorEClass, PROFESSOR__TITLE);
		createEReference(professorEClass, PROFESSOR__DEPARTMENT);

		specialisationEClass = createEClass(SPECIALISATION);
		createEReference(specialisationEClass, SPECIALISATION__COURCE);
		createEReference(specialisationEClass, SPECIALISATION__STUDY_PROGRAM);
		createEAttribute(specialisationEClass, SPECIALISATION__NAME);
		createEAttribute(specialisationEClass, SPECIALISATION__START_SEMESTER);
		createEReference(specialisationEClass, SPECIALISATION__FURTHER_SPECIALISATION);
		createEReference(specialisationEClass, SPECIALISATION__HOST_SPECIALISATION);

		courceSpecificationEClass = createEClass(COURCE_SPECIFICATION);
		createEReference(courceSpecificationEClass, COURCE_SPECIFICATION__COURCE);
		createEReference(courceSpecificationEClass, COURCE_SPECIFICATION__COORDINATOR);
		createEReference(courceSpecificationEClass, COURCE_SPECIFICATION__EVALUATION_FORM);
		createEAttribute(courceSpecificationEClass, COURCE_SPECIFICATION__SPECIFICATION_YEAR);
		createEAttribute(courceSpecificationEClass, COURCE_SPECIFICATION__SEMESTER);
		createEAttribute(courceSpecificationEClass, COURCE_SPECIFICATION__LANGUAGE);
		createEAttribute(courceSpecificationEClass, COURCE_SPECIFICATION__VERSION);
		createEAttribute(courceSpecificationEClass, COURCE_SPECIFICATION__CREDITS);
		createEAttribute(courceSpecificationEClass, COURCE_SPECIFICATION__NAME);

		studyGeneralizationEClass = createEClass(STUDY_GENERALIZATION);
		createEReference(studyGeneralizationEClass, STUDY_GENERALIZATION__STUDY_PROGRAM);
		createEReference(studyGeneralizationEClass, STUDY_GENERALIZATION__DEPARTMENT);
		createEAttribute(studyGeneralizationEClass, STUDY_GENERALIZATION__NAME);
		createEAttribute(studyGeneralizationEClass, STUDY_GENERALIZATION__EDUCATION_LEVEL);
		createEAttribute(studyGeneralizationEClass, STUDY_GENERALIZATION__NR_OF_YEARS);
		createEAttribute(studyGeneralizationEClass, STUDY_GENERALIZATION__CAMPUS);
		createEAttribute(studyGeneralizationEClass, STUDY_GENERALIZATION__ABBREVIATION);

		// Create enums
		semesterEEnum = createEEnum(SEMESTER);
		workFormEEnum = createEEnum(WORK_FORM);
		educationLevelEEnum = createEEnum(EDUCATION_LEVEL);
		evaluationTypeEEnum = createEEnum(EVALUATION_TYPE);
		campusEEnum = createEEnum(CAMPUS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(departmentEClass, Department.class, "Department", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDepartment_StudyProgram(), this.getStudyGeneralization(), this.getStudyGeneralization_Department(), "studyProgram", null, 1, -1, Department.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDepartment_Course(), this.getCource(), this.getCource_Department(), "course", null, 1, -1, Department.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDepartment_Professor(), this.getProfessor(), this.getProfessor_Department(), "professor", null, 1, -1, Department.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDepartment_Name(), ecorePackage.getEString(), "name", null, 0, 1, Department.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDepartment_Abbreviation(), ecorePackage.getEString(), "abbreviation", null, 0, 1, Department.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(courceEClass, Cource.class, "Cource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCource_Code(), ecorePackage.getEString(), "code", null, 1, 1, Cource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCource_Name(), ecorePackage.getEString(), "name", null, 1, 1, Cource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCource_Location(), this.getCampus(), "location", null, 0, 1, Cource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCource_Department(), this.getDepartment(), this.getDepartment_Course(), "department", null, 0, 1, Cource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCource_CorseSpecifications(), this.getCourceSpecification(), this.getCourceSpecification_Cource(), "corseSpecifications", null, 1, -1, Cource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(studentEClass, Student.class, "Student", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStudent_StudyProgram(), this.getStudyProgram(), this.getStudyProgram_Student(), "studyProgram", null, 1, 1, Student.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStudent_Nr(), ecorePackage.getEInt(), "nr", null, 0, 1, Student.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(studyProgramEClass, StudyProgram.class, "StudyProgram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStudyProgram_Cource(), this.getSpecialisation(), this.getSpecialisation_StudyProgram(), "cource", null, 0, -1, StudyProgram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStudyProgram_Generalization(), this.getStudyGeneralization(), this.getStudyGeneralization_StudyProgram(), "generalization", null, 0, 1, StudyProgram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStudyProgram_Student(), this.getStudent(), this.getStudent_StudyProgram(), "student", null, 0, -1, StudyProgram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStudyProgram_Year(), ecorePackage.getEInt(), "year", null, 1, 1, StudyProgram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(examEClass, Exam.class, "Exam", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExam_Weight(), ecorePackage.getEInt(), "weight", null, 0, 1, Exam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExam_EvaluationForm(), this.getEvaluationForm(), this.getEvaluationForm_Exam(), "evaluationForm", null, 0, 1, Exam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExam_Form(), this.getWorkForm(), "form", null, 0, 1, Exam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExam_Lenght(), ecorePackage.getEInt(), "lenght", null, 0, 1, Exam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExam_Date(), ecorePackage.getEDate(), "date", null, 0, 1, Exam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(evaluationFormEClass, EvaluationForm.class, "EvaluationForm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEvaluationForm_Exam(), this.getExam(), this.getExam_EvaluationForm(), "exam", null, 0, 1, EvaluationForm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEvaluationForm_Work(), this.getWork(), this.getWork_EvaluationForm(), "work", null, 0, 1, EvaluationForm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEvaluationForm_Cource(), this.getCourceSpecification(), this.getCourceSpecification_EvaluationForm(), "cource", null, 0, 1, EvaluationForm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvaluationForm_EvaluationType(), this.getEvaluationType(), "evaluationType", null, 1, 1, EvaluationForm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(workEClass, Work.class, "Work", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWork_Weight(), ecorePackage.getEInt(), "weight", null, 0, 1, Work.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWork_EvaluationForm(), this.getEvaluationForm(), this.getEvaluationForm_Work(), "evaluationForm", null, 0, 1, Work.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(studyCourceRelationEClass, StudyCourceRelation.class, "StudyCourceRelation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStudyCourceRelation_Cource(), this.getCourceSpecification(), null, "cource", null, 1, 1, StudyCourceRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStudyCourceRelation_Status(), ecorePackage.getEString(), "status", null, 0, 1, StudyCourceRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStudyCourceRelation_Year(), ecorePackage.getEInt(), "year", null, 0, 1, StudyCourceRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStudyCourceRelation_Specialisation(), this.getSpecialisation(), this.getSpecialisation_Cource(), "specialisation", null, 0, 1, StudyCourceRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(professorEClass, Professor.class, "Professor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProfessor_Name(), ecorePackage.getEString(), "name", null, 0, 1, Professor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProfessor_Title(), ecorePackage.getEString(), "title", null, 0, 1, Professor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProfessor_Department(), this.getDepartment(), this.getDepartment_Professor(), "department", null, 0, 1, Professor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(specialisationEClass, Specialisation.class, "Specialisation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSpecialisation_Cource(), this.getStudyCourceRelation(), this.getStudyCourceRelation_Specialisation(), "cource", null, 1, -1, Specialisation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpecialisation_StudyProgram(), this.getStudyProgram(), this.getStudyProgram_Cource(), "studyProgram", null, 0, 1, Specialisation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpecialisation_Name(), ecorePackage.getEString(), "name", null, 0, 1, Specialisation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpecialisation_StartSemester(), ecorePackage.getEInt(), "startSemester", null, 0, 1, Specialisation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpecialisation_FurtherSpecialisation(), this.getSpecialisation(), this.getSpecialisation_HostSpecialisation(), "furtherSpecialisation", null, 0, -1, Specialisation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpecialisation_HostSpecialisation(), this.getSpecialisation(), this.getSpecialisation_FurtherSpecialisation(), "hostSpecialisation", null, 0, 1, Specialisation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(courceSpecificationEClass, CourceSpecification.class, "CourceSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCourceSpecification_Cource(), this.getCource(), this.getCource_CorseSpecifications(), "cource", null, 1, 1, CourceSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCourceSpecification_Coordinator(), this.getProfessor(), null, "coordinator", null, 0, 1, CourceSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCourceSpecification_EvaluationForm(), this.getEvaluationForm(), this.getEvaluationForm_Cource(), "evaluationForm", null, 0, 1, CourceSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCourceSpecification_SpecificationYear(), ecorePackage.getEInt(), "specificationYear", null, 0, 1, CourceSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCourceSpecification_Semester(), this.getSemester(), "semester", null, 1, 2, CourceSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCourceSpecification_Language(), ecorePackage.getEString(), "language", null, 0, 1, CourceSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCourceSpecification_Version(), ecorePackage.getEString(), "version", null, 0, 1, CourceSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCourceSpecification_Credits(), ecorePackage.getEFloat(), "credits", null, 1, 1, CourceSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCourceSpecification_Name(), ecorePackage.getEString(), "name", null, 1, 1, CourceSpecification.class, !IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(studyGeneralizationEClass, StudyGeneralization.class, "StudyGeneralization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStudyGeneralization_StudyProgram(), this.getStudyProgram(), this.getStudyProgram_Generalization(), "studyProgram", null, 1, -1, StudyGeneralization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStudyGeneralization_Department(), this.getDepartment(), this.getDepartment_StudyProgram(), "department", null, 0, 1, StudyGeneralization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStudyGeneralization_Name(), ecorePackage.getEString(), "name", null, 0, 1, StudyGeneralization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStudyGeneralization_EducationLevel(), this.getEducationLevel(), "educationLevel", null, 0, 1, StudyGeneralization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStudyGeneralization_NrOfYears(), ecorePackage.getEInt(), "nrOfYears", null, 0, 1, StudyGeneralization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStudyGeneralization_Campus(), this.getCampus(), "campus", null, 1, -1, StudyGeneralization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStudyGeneralization_Abbreviation(), ecorePackage.getEString(), "abbreviation", null, 0, 1, StudyGeneralization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(semesterEEnum, Semester.class, "Semester");
		addEEnumLiteral(semesterEEnum, Semester.AUTUMN);
		addEEnumLiteral(semesterEEnum, Semester.SPRING);

		initEEnum(workFormEEnum, WorkForm.class, "WorkForm");
		addEEnumLiteral(workFormEEnum, WorkForm.ORAL);
		addEEnumLiteral(workFormEEnum, WorkForm.WRITTEN);
		addEEnumLiteral(workFormEEnum, WorkForm.HOME);

		initEEnum(educationLevelEEnum, EducationLevel.class, "EducationLevel");
		addEEnumLiteral(educationLevelEEnum, EducationLevel.BACHELOR);
		addEEnumLiteral(educationLevelEEnum, EducationLevel.MASTER);
		addEEnumLiteral(educationLevelEEnum, EducationLevel.PHD);
		addEEnumLiteral(educationLevelEEnum, EducationLevel.ONE_YEAR);

		initEEnum(evaluationTypeEEnum, EvaluationType.class, "EvaluationType");
		addEEnumLiteral(evaluationTypeEEnum, EvaluationType.GRADE);
		addEEnumLiteral(evaluationTypeEEnum, EvaluationType.APPROVED);

		initEEnum(campusEEnum, Campus.class, "Campus");
		addEEnumLiteral(campusEEnum, Campus.TRONDHEIM);
		addEEnumLiteral(campusEEnum, Campus.GJØVIK);
		addEEnumLiteral(campusEEnum, Campus.WEB);
		addEEnumLiteral(campusEEnum, Campus.ÅLESUND);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/acceleo/query/1.0
		create_1Annotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "validationDelegates", "http://www.eclipse.org/acceleo/query/1.0",
			   "settingDelegates", "http://www.eclipse.org/acceleo/query/1.0"
		   });
		addAnnotation
		  (evaluationFormEClass,
		   source,
		   new String[] {
			   "constraints", "weightMustBeComplete"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/acceleo/query/1.0</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void create_1Annotations() {
		String source = "http://www.eclipse.org/acceleo/query/1.0";
		addAnnotation
		  (evaluationFormEClass,
		   source,
		   new String[] {
			   "weightMustBeComplete", " if not self.exam.oclIsUndefined() then \n\tif not self.work.oclIsUndefined() then\n\t\tself.exam.weight + self.work.weight = 100\n\telse\n\t\tself.exam.weight = 100\n\tendif\nelse\n\tif not self.work.oclIsUndefined() then\n\t\tself.work.weight = 100\n\telse\n\t\tfalse\n\tendif\nendif"
		   });
		addAnnotation
		  (getCourceSpecification_Name(),
		   source,
		   new String[] {
			   "derivation", "self.cource.name.concat(\' (\').concat(self.specificationYear.toString()).concat(\')\')"
		   });
	}

} //CourceListPackageImpl
