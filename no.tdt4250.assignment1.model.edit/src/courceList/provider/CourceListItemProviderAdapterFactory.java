/**
 */
package courceList.provider;

import courceList.util.CourceListAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CourceListItemProviderAdapterFactory extends CourceListAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CourceListItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link courceList.Department} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DepartmentItemProvider departmentItemProvider;

	/**
	 * This creates an adapter for a {@link courceList.Department}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDepartmentAdapter() {
		if (departmentItemProvider == null) {
			departmentItemProvider = new DepartmentItemProvider(this);
		}

		return departmentItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link courceList.Cource} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CourceItemProvider courceItemProvider;

	/**
	 * This creates an adapter for a {@link courceList.Cource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCourceAdapter() {
		if (courceItemProvider == null) {
			courceItemProvider = new CourceItemProvider(this);
		}

		return courceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link courceList.Student} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StudentItemProvider studentItemProvider;

	/**
	 * This creates an adapter for a {@link courceList.Student}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStudentAdapter() {
		if (studentItemProvider == null) {
			studentItemProvider = new StudentItemProvider(this);
		}

		return studentItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link courceList.StudyProgram} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StudyProgramItemProvider studyProgramItemProvider;

	/**
	 * This creates an adapter for a {@link courceList.StudyProgram}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStudyProgramAdapter() {
		if (studyProgramItemProvider == null) {
			studyProgramItemProvider = new StudyProgramItemProvider(this);
		}

		return studyProgramItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link courceList.Exam} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExamItemProvider examItemProvider;

	/**
	 * This creates an adapter for a {@link courceList.Exam}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createExamAdapter() {
		if (examItemProvider == null) {
			examItemProvider = new ExamItemProvider(this);
		}

		return examItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link courceList.EvaluationForm} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EvaluationFormItemProvider evaluationFormItemProvider;

	/**
	 * This creates an adapter for a {@link courceList.EvaluationForm}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEvaluationFormAdapter() {
		if (evaluationFormItemProvider == null) {
			evaluationFormItemProvider = new EvaluationFormItemProvider(this);
		}

		return evaluationFormItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link courceList.Work} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkItemProvider workItemProvider;

	/**
	 * This creates an adapter for a {@link courceList.Work}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createWorkAdapter() {
		if (workItemProvider == null) {
			workItemProvider = new WorkItemProvider(this);
		}

		return workItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link courceList.StudyCourceRelation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StudyCourceRelationItemProvider studyCourceRelationItemProvider;

	/**
	 * This creates an adapter for a {@link courceList.StudyCourceRelation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStudyCourceRelationAdapter() {
		if (studyCourceRelationItemProvider == null) {
			studyCourceRelationItemProvider = new StudyCourceRelationItemProvider(this);
		}

		return studyCourceRelationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link courceList.Professor} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProfessorItemProvider professorItemProvider;

	/**
	 * This creates an adapter for a {@link courceList.Professor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createProfessorAdapter() {
		if (professorItemProvider == null) {
			professorItemProvider = new ProfessorItemProvider(this);
		}

		return professorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link courceList.Specialisation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecialisationItemProvider specialisationItemProvider;

	/**
	 * This creates an adapter for a {@link courceList.Specialisation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSpecialisationAdapter() {
		if (specialisationItemProvider == null) {
			specialisationItemProvider = new SpecialisationItemProvider(this);
		}

		return specialisationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link courceList.CourceSpecification} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CourceSpecificationItemProvider courceSpecificationItemProvider;

	/**
	 * This creates an adapter for a {@link courceList.CourceSpecification}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCourceSpecificationAdapter() {
		if (courceSpecificationItemProvider == null) {
			courceSpecificationItemProvider = new CourceSpecificationItemProvider(this);
		}

		return courceSpecificationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link courceList.StudyGeneralization} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StudyGeneralizationItemProvider studyGeneralizationItemProvider;

	/**
	 * This creates an adapter for a {@link courceList.StudyGeneralization}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStudyGeneralizationAdapter() {
		if (studyGeneralizationItemProvider == null) {
			studyGeneralizationItemProvider = new StudyGeneralizationItemProvider(this);
		}

		return studyGeneralizationItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (departmentItemProvider != null) departmentItemProvider.dispose();
		if (courceItemProvider != null) courceItemProvider.dispose();
		if (studentItemProvider != null) studentItemProvider.dispose();
		if (studyProgramItemProvider != null) studyProgramItemProvider.dispose();
		if (examItemProvider != null) examItemProvider.dispose();
		if (evaluationFormItemProvider != null) evaluationFormItemProvider.dispose();
		if (workItemProvider != null) workItemProvider.dispose();
		if (studyCourceRelationItemProvider != null) studyCourceRelationItemProvider.dispose();
		if (professorItemProvider != null) professorItemProvider.dispose();
		if (specialisationItemProvider != null) specialisationItemProvider.dispose();
		if (courceSpecificationItemProvider != null) courceSpecificationItemProvider.dispose();
		if (studyGeneralizationItemProvider != null) studyGeneralizationItemProvider.dispose();
	}

}
