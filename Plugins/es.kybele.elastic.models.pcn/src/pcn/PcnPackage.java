/**
 */
package pcn;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
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
 * @see pcn.PcnFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface PcnPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "pcn";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.kybele.es/elastic/models/pcn/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "pcn";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PcnPackage eINSTANCE = pcn.impl.PcnPackageImpl.init();

	/**
	 * The meta object id for the '{@link pcn.impl.PCNDiagramImpl <em>PCN Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcn.impl.PCNDiagramImpl
	 * @see pcn.impl.PcnPackageImpl#getPCNDiagram()
	 * @generated
	 */
	int PCN_DIAGRAM = 0;

	/**
	 * The feature id for the '<em><b>Diagram Entities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_DIAGRAM__DIAGRAM_ENTITIES = 0;

	/**
	 * The number of structural features of the '<em>PCN Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_DIAGRAM_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>PCN Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_DIAGRAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pcn.impl.PCNProcessEntityImpl <em>PCN Process Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcn.impl.PCNProcessEntityImpl
	 * @see pcn.impl.PcnPackageImpl#getPCNProcessEntity()
	 * @generated
	 */
	int PCN_PROCESS_ENTITY = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_PROCESS_ENTITY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_PROCESS_ENTITY__ORDER = 1;

	/**
	 * The feature id for the '<em><b>Back Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_PROCESS_ENTITY__BACK_ENTITY = 2;

	/**
	 * The feature id for the '<em><b>Next Entity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_PROCESS_ENTITY__NEXT_ENTITY = 3;

	/**
	 * The feature id for the '<em><b>Left Direct Interactions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_PROCESS_ENTITY__LEFT_DIRECT_INTERACTIONS = 4;

	/**
	 * The feature id for the '<em><b>Left Surrogate Interactions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_PROCESS_ENTITY__LEFT_SURROGATE_INTERACTIONS = 5;

	/**
	 * The feature id for the '<em><b>Center Independent Interactions Activities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_PROCESS_ENTITY__CENTER_INDEPENDENT_INTERACTIONS_ACTIVITIES = 6;

	/**
	 * The feature id for the '<em><b>Right Surrogate Interactions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_PROCESS_ENTITY__RIGHT_SURROGATE_INTERACTIONS = 7;

	/**
	 * The feature id for the '<em><b>Right Direct Interactions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_PROCESS_ENTITY__RIGHT_DIRECT_INTERACTIONS = 8;

	/**
	 * The number of structural features of the '<em>PCN Process Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_PROCESS_ENTITY_FEATURE_COUNT = 9;

	/**
	 * The operation id for the '<em>Get Direct Interactions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_PROCESS_ENTITY___GET_DIRECT_INTERACTIONS = 0;

	/**
	 * The operation id for the '<em>Get Surrogate Interactions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_PROCESS_ENTITY___GET_SURROGATE_INTERACTIONS = 1;

	/**
	 * The operation id for the '<em>Get Independent Interactios</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_PROCESS_ENTITY___GET_INDEPENDENT_INTERACTIOS = 2;

	/**
	 * The number of operations of the '<em>PCN Process Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_PROCESS_ENTITY_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link pcn.PCNProcessStep <em>PCN Process Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcn.PCNProcessStep
	 * @see pcn.impl.PcnPackageImpl#getPCNProcessStep()
	 * @generated
	 */
	int PCN_PROCESS_STEP = 2;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_PROCESS_STEP__TAGS = 0;

	/**
	 * The feature id for the '<em><b>PCN Standard Dependency Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_PROCESS_STEP__PCN_STANDARD_DEPENDENCY_SOURCE = 1;

	/**
	 * The feature id for the '<em><b>PCN Delayed Dependency Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_PROCESS_STEP__PCN_DELAYED_DEPENDENCY_SOURCE = 2;

	/**
	 * The feature id for the '<em><b>PCN Positive Decision Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_PROCESS_STEP__PCN_POSITIVE_DECISION_SOURCE = 3;

	/**
	 * The feature id for the '<em><b>PCN Negative Decision Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_PROCESS_STEP__PCN_NEGATIVE_DECISION_SOURCE = 4;

	/**
	 * The number of structural features of the '<em>PCN Process Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_PROCESS_STEP_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>PCN Process Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_PROCESS_STEP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pcn.impl.PCNProcessStepWithTagsImpl <em>PCN Process Step With Tags</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcn.impl.PCNProcessStepWithTagsImpl
	 * @see pcn.impl.PcnPackageImpl#getPCNProcessStepWithTags()
	 * @generated
	 */
	int PCN_PROCESS_STEP_WITH_TAGS = 3;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_PROCESS_STEP_WITH_TAGS__TAGS = PCN_PROCESS_STEP__TAGS;

	/**
	 * The feature id for the '<em><b>PCN Standard Dependency Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_PROCESS_STEP_WITH_TAGS__PCN_STANDARD_DEPENDENCY_SOURCE = PCN_PROCESS_STEP__PCN_STANDARD_DEPENDENCY_SOURCE;

	/**
	 * The feature id for the '<em><b>PCN Delayed Dependency Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_PROCESS_STEP_WITH_TAGS__PCN_DELAYED_DEPENDENCY_SOURCE = PCN_PROCESS_STEP__PCN_DELAYED_DEPENDENCY_SOURCE;

	/**
	 * The feature id for the '<em><b>PCN Positive Decision Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_PROCESS_STEP_WITH_TAGS__PCN_POSITIVE_DECISION_SOURCE = PCN_PROCESS_STEP__PCN_POSITIVE_DECISION_SOURCE;

	/**
	 * The feature id for the '<em><b>PCN Negative Decision Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_PROCESS_STEP_WITH_TAGS__PCN_NEGATIVE_DECISION_SOURCE = PCN_PROCESS_STEP__PCN_NEGATIVE_DECISION_SOURCE;

	/**
	 * The feature id for the '<em><b>Non Monetary Benefits</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_PROCESS_STEP_WITH_TAGS__NON_MONETARY_BENEFITS = PCN_PROCESS_STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Non Monetary Costs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_PROCESS_STEP_WITH_TAGS__NON_MONETARY_COSTS = PCN_PROCESS_STEP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Monetary Benefits</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_PROCESS_STEP_WITH_TAGS__MONETARY_BENEFITS = PCN_PROCESS_STEP_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Monetary Costs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_PROCESS_STEP_WITH_TAGS__MONETARY_COSTS = PCN_PROCESS_STEP_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_PROCESS_STEP_WITH_TAGS__ACTION = PCN_PROCESS_STEP_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Textual Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_PROCESS_STEP_WITH_TAGS__TEXTUAL_TAGS = PCN_PROCESS_STEP_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Delay Time Tags</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_PROCESS_STEP_WITH_TAGS__DELAY_TIME_TAGS = PCN_PROCESS_STEP_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Probabilities Tags</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_PROCESS_STEP_WITH_TAGS__PROBABILITIES_TAGS = PCN_PROCESS_STEP_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Sync Tags</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_PROCESS_STEP_WITH_TAGS__SYNC_TAGS = PCN_PROCESS_STEP_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>PCN Process Step With Tags</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_PROCESS_STEP_WITH_TAGS_FEATURE_COUNT = PCN_PROCESS_STEP_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>PCN Process Step With Tags</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_PROCESS_STEP_WITH_TAGS_OPERATION_COUNT = PCN_PROCESS_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pcn.impl.PCNReferenceImpl <em>PCN Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcn.impl.PCNReferenceImpl
	 * @see pcn.impl.PcnPackageImpl#getPCNReference()
	 * @generated
	 */
	int PCN_REFERENCE = 4;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_REFERENCE__TAGS = PCN_PROCESS_STEP__TAGS;

	/**
	 * The feature id for the '<em><b>PCN Standard Dependency Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_REFERENCE__PCN_STANDARD_DEPENDENCY_SOURCE = PCN_PROCESS_STEP__PCN_STANDARD_DEPENDENCY_SOURCE;

	/**
	 * The feature id for the '<em><b>PCN Delayed Dependency Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_REFERENCE__PCN_DELAYED_DEPENDENCY_SOURCE = PCN_PROCESS_STEP__PCN_DELAYED_DEPENDENCY_SOURCE;

	/**
	 * The feature id for the '<em><b>PCN Positive Decision Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_REFERENCE__PCN_POSITIVE_DECISION_SOURCE = PCN_PROCESS_STEP__PCN_POSITIVE_DECISION_SOURCE;

	/**
	 * The feature id for the '<em><b>PCN Negative Decision Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_REFERENCE__PCN_NEGATIVE_DECISION_SOURCE = PCN_PROCESS_STEP__PCN_NEGATIVE_DECISION_SOURCE;

	/**
	 * The feature id for the '<em><b>Letter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_REFERENCE__LETTER = PCN_PROCESS_STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_REFERENCE__NUMBER = PCN_PROCESS_STEP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>PCN Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_REFERENCE_FEATURE_COUNT = PCN_PROCESS_STEP_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>PCN Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_REFERENCE_OPERATION_COUNT = PCN_PROCESS_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pcn.impl.PCNRegularProcessStepImpl <em>PCN Regular Process Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcn.impl.PCNRegularProcessStepImpl
	 * @see pcn.impl.PcnPackageImpl#getPCNRegularProcessStep()
	 * @generated
	 */
	int PCN_REGULAR_PROCESS_STEP = 18;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_REGULAR_PROCESS_STEP__TAGS = PCN_PROCESS_STEP_WITH_TAGS__TAGS;

	/**
	 * The feature id for the '<em><b>PCN Standard Dependency Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_REGULAR_PROCESS_STEP__PCN_STANDARD_DEPENDENCY_SOURCE = PCN_PROCESS_STEP_WITH_TAGS__PCN_STANDARD_DEPENDENCY_SOURCE;

	/**
	 * The feature id for the '<em><b>PCN Delayed Dependency Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_REGULAR_PROCESS_STEP__PCN_DELAYED_DEPENDENCY_SOURCE = PCN_PROCESS_STEP_WITH_TAGS__PCN_DELAYED_DEPENDENCY_SOURCE;

	/**
	 * The feature id for the '<em><b>PCN Positive Decision Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_REGULAR_PROCESS_STEP__PCN_POSITIVE_DECISION_SOURCE = PCN_PROCESS_STEP_WITH_TAGS__PCN_POSITIVE_DECISION_SOURCE;

	/**
	 * The feature id for the '<em><b>PCN Negative Decision Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_REGULAR_PROCESS_STEP__PCN_NEGATIVE_DECISION_SOURCE = PCN_PROCESS_STEP_WITH_TAGS__PCN_NEGATIVE_DECISION_SOURCE;

	/**
	 * The feature id for the '<em><b>Non Monetary Benefits</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_REGULAR_PROCESS_STEP__NON_MONETARY_BENEFITS = PCN_PROCESS_STEP_WITH_TAGS__NON_MONETARY_BENEFITS;

	/**
	 * The feature id for the '<em><b>Non Monetary Costs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_REGULAR_PROCESS_STEP__NON_MONETARY_COSTS = PCN_PROCESS_STEP_WITH_TAGS__NON_MONETARY_COSTS;

	/**
	 * The feature id for the '<em><b>Monetary Benefits</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_REGULAR_PROCESS_STEP__MONETARY_BENEFITS = PCN_PROCESS_STEP_WITH_TAGS__MONETARY_BENEFITS;

	/**
	 * The feature id for the '<em><b>Monetary Costs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_REGULAR_PROCESS_STEP__MONETARY_COSTS = PCN_PROCESS_STEP_WITH_TAGS__MONETARY_COSTS;

	/**
	 * The feature id for the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_REGULAR_PROCESS_STEP__ACTION = PCN_PROCESS_STEP_WITH_TAGS__ACTION;

	/**
	 * The feature id for the '<em><b>Textual Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_REGULAR_PROCESS_STEP__TEXTUAL_TAGS = PCN_PROCESS_STEP_WITH_TAGS__TEXTUAL_TAGS;

	/**
	 * The feature id for the '<em><b>Delay Time Tags</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_REGULAR_PROCESS_STEP__DELAY_TIME_TAGS = PCN_PROCESS_STEP_WITH_TAGS__DELAY_TIME_TAGS;

	/**
	 * The feature id for the '<em><b>Probabilities Tags</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_REGULAR_PROCESS_STEP__PROBABILITIES_TAGS = PCN_PROCESS_STEP_WITH_TAGS__PROBABILITIES_TAGS;

	/**
	 * The feature id for the '<em><b>Sync Tags</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_REGULAR_PROCESS_STEP__SYNC_TAGS = PCN_PROCESS_STEP_WITH_TAGS__SYNC_TAGS;

	/**
	 * The feature id for the '<em><b>PCN Standard Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_REGULAR_PROCESS_STEP__PCN_STANDARD_DEPENDENCY = PCN_PROCESS_STEP_WITH_TAGS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>PCN Delayed Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_REGULAR_PROCESS_STEP__PCN_DELAYED_DEPENDENCY = PCN_PROCESS_STEP_WITH_TAGS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>PCN Regular Process Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_REGULAR_PROCESS_STEP_FEATURE_COUNT = PCN_PROCESS_STEP_WITH_TAGS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>PCN Regular Process Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_REGULAR_PROCESS_STEP_OPERATION_COUNT = PCN_PROCESS_STEP_WITH_TAGS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pcn.impl.PCNStandardStepImpl <em>PCN Standard Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcn.impl.PCNStandardStepImpl
	 * @see pcn.impl.PcnPackageImpl#getPCNStandardStep()
	 * @generated
	 */
	int PCN_STANDARD_STEP = 5;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_STANDARD_STEP__TAGS = PCN_REGULAR_PROCESS_STEP__TAGS;

	/**
	 * The feature id for the '<em><b>PCN Standard Dependency Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_STANDARD_STEP__PCN_STANDARD_DEPENDENCY_SOURCE = PCN_REGULAR_PROCESS_STEP__PCN_STANDARD_DEPENDENCY_SOURCE;

	/**
	 * The feature id for the '<em><b>PCN Delayed Dependency Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_STANDARD_STEP__PCN_DELAYED_DEPENDENCY_SOURCE = PCN_REGULAR_PROCESS_STEP__PCN_DELAYED_DEPENDENCY_SOURCE;

	/**
	 * The feature id for the '<em><b>PCN Positive Decision Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_STANDARD_STEP__PCN_POSITIVE_DECISION_SOURCE = PCN_REGULAR_PROCESS_STEP__PCN_POSITIVE_DECISION_SOURCE;

	/**
	 * The feature id for the '<em><b>PCN Negative Decision Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_STANDARD_STEP__PCN_NEGATIVE_DECISION_SOURCE = PCN_REGULAR_PROCESS_STEP__PCN_NEGATIVE_DECISION_SOURCE;

	/**
	 * The feature id for the '<em><b>Non Monetary Benefits</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_STANDARD_STEP__NON_MONETARY_BENEFITS = PCN_REGULAR_PROCESS_STEP__NON_MONETARY_BENEFITS;

	/**
	 * The feature id for the '<em><b>Non Monetary Costs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_STANDARD_STEP__NON_MONETARY_COSTS = PCN_REGULAR_PROCESS_STEP__NON_MONETARY_COSTS;

	/**
	 * The feature id for the '<em><b>Monetary Benefits</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_STANDARD_STEP__MONETARY_BENEFITS = PCN_REGULAR_PROCESS_STEP__MONETARY_BENEFITS;

	/**
	 * The feature id for the '<em><b>Monetary Costs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_STANDARD_STEP__MONETARY_COSTS = PCN_REGULAR_PROCESS_STEP__MONETARY_COSTS;

	/**
	 * The feature id for the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_STANDARD_STEP__ACTION = PCN_REGULAR_PROCESS_STEP__ACTION;

	/**
	 * The feature id for the '<em><b>Textual Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_STANDARD_STEP__TEXTUAL_TAGS = PCN_REGULAR_PROCESS_STEP__TEXTUAL_TAGS;

	/**
	 * The feature id for the '<em><b>Delay Time Tags</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_STANDARD_STEP__DELAY_TIME_TAGS = PCN_REGULAR_PROCESS_STEP__DELAY_TIME_TAGS;

	/**
	 * The feature id for the '<em><b>Probabilities Tags</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_STANDARD_STEP__PROBABILITIES_TAGS = PCN_REGULAR_PROCESS_STEP__PROBABILITIES_TAGS;

	/**
	 * The feature id for the '<em><b>Sync Tags</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_STANDARD_STEP__SYNC_TAGS = PCN_REGULAR_PROCESS_STEP__SYNC_TAGS;

	/**
	 * The feature id for the '<em><b>PCN Standard Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_STANDARD_STEP__PCN_STANDARD_DEPENDENCY = PCN_REGULAR_PROCESS_STEP__PCN_STANDARD_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>PCN Delayed Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_STANDARD_STEP__PCN_DELAYED_DEPENDENCY = PCN_REGULAR_PROCESS_STEP__PCN_DELAYED_DEPENDENCY;

	/**
	 * The number of structural features of the '<em>PCN Standard Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_STANDARD_STEP_FEATURE_COUNT = PCN_REGULAR_PROCESS_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>PCN Standard Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_STANDARD_STEP_OPERATION_COUNT = PCN_REGULAR_PROCESS_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pcn.impl.PCNDoAndWaitStepImpl <em>PCN Do And Wait Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcn.impl.PCNDoAndWaitStepImpl
	 * @see pcn.impl.PcnPackageImpl#getPCNDoAndWaitStep()
	 * @generated
	 */
	int PCN_DO_AND_WAIT_STEP = 6;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_DO_AND_WAIT_STEP__TAGS = PCN_REGULAR_PROCESS_STEP__TAGS;

	/**
	 * The feature id for the '<em><b>PCN Standard Dependency Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_DO_AND_WAIT_STEP__PCN_STANDARD_DEPENDENCY_SOURCE = PCN_REGULAR_PROCESS_STEP__PCN_STANDARD_DEPENDENCY_SOURCE;

	/**
	 * The feature id for the '<em><b>PCN Delayed Dependency Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_DO_AND_WAIT_STEP__PCN_DELAYED_DEPENDENCY_SOURCE = PCN_REGULAR_PROCESS_STEP__PCN_DELAYED_DEPENDENCY_SOURCE;

	/**
	 * The feature id for the '<em><b>PCN Positive Decision Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_DO_AND_WAIT_STEP__PCN_POSITIVE_DECISION_SOURCE = PCN_REGULAR_PROCESS_STEP__PCN_POSITIVE_DECISION_SOURCE;

	/**
	 * The feature id for the '<em><b>PCN Negative Decision Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_DO_AND_WAIT_STEP__PCN_NEGATIVE_DECISION_SOURCE = PCN_REGULAR_PROCESS_STEP__PCN_NEGATIVE_DECISION_SOURCE;

	/**
	 * The feature id for the '<em><b>Non Monetary Benefits</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_DO_AND_WAIT_STEP__NON_MONETARY_BENEFITS = PCN_REGULAR_PROCESS_STEP__NON_MONETARY_BENEFITS;

	/**
	 * The feature id for the '<em><b>Non Monetary Costs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_DO_AND_WAIT_STEP__NON_MONETARY_COSTS = PCN_REGULAR_PROCESS_STEP__NON_MONETARY_COSTS;

	/**
	 * The feature id for the '<em><b>Monetary Benefits</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_DO_AND_WAIT_STEP__MONETARY_BENEFITS = PCN_REGULAR_PROCESS_STEP__MONETARY_BENEFITS;

	/**
	 * The feature id for the '<em><b>Monetary Costs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_DO_AND_WAIT_STEP__MONETARY_COSTS = PCN_REGULAR_PROCESS_STEP__MONETARY_COSTS;

	/**
	 * The feature id for the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_DO_AND_WAIT_STEP__ACTION = PCN_REGULAR_PROCESS_STEP__ACTION;

	/**
	 * The feature id for the '<em><b>Textual Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_DO_AND_WAIT_STEP__TEXTUAL_TAGS = PCN_REGULAR_PROCESS_STEP__TEXTUAL_TAGS;

	/**
	 * The feature id for the '<em><b>Delay Time Tags</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_DO_AND_WAIT_STEP__DELAY_TIME_TAGS = PCN_REGULAR_PROCESS_STEP__DELAY_TIME_TAGS;

	/**
	 * The feature id for the '<em><b>Probabilities Tags</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_DO_AND_WAIT_STEP__PROBABILITIES_TAGS = PCN_REGULAR_PROCESS_STEP__PROBABILITIES_TAGS;

	/**
	 * The feature id for the '<em><b>Sync Tags</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_DO_AND_WAIT_STEP__SYNC_TAGS = PCN_REGULAR_PROCESS_STEP__SYNC_TAGS;

	/**
	 * The feature id for the '<em><b>PCN Standard Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_DO_AND_WAIT_STEP__PCN_STANDARD_DEPENDENCY = PCN_REGULAR_PROCESS_STEP__PCN_STANDARD_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>PCN Delayed Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_DO_AND_WAIT_STEP__PCN_DELAYED_DEPENDENCY = PCN_REGULAR_PROCESS_STEP__PCN_DELAYED_DEPENDENCY;

	/**
	 * The number of structural features of the '<em>PCN Do And Wait Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_DO_AND_WAIT_STEP_FEATURE_COUNT = PCN_REGULAR_PROCESS_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>PCN Do And Wait Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_DO_AND_WAIT_STEP_OPERATION_COUNT = PCN_REGULAR_PROCESS_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pcn.impl.PCNWaitStepImpl <em>PCN Wait Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcn.impl.PCNWaitStepImpl
	 * @see pcn.impl.PcnPackageImpl#getPCNWaitStep()
	 * @generated
	 */
	int PCN_WAIT_STEP = 7;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_WAIT_STEP__TAGS = PCN_REGULAR_PROCESS_STEP__TAGS;

	/**
	 * The feature id for the '<em><b>PCN Standard Dependency Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_WAIT_STEP__PCN_STANDARD_DEPENDENCY_SOURCE = PCN_REGULAR_PROCESS_STEP__PCN_STANDARD_DEPENDENCY_SOURCE;

	/**
	 * The feature id for the '<em><b>PCN Delayed Dependency Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_WAIT_STEP__PCN_DELAYED_DEPENDENCY_SOURCE = PCN_REGULAR_PROCESS_STEP__PCN_DELAYED_DEPENDENCY_SOURCE;

	/**
	 * The feature id for the '<em><b>PCN Positive Decision Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_WAIT_STEP__PCN_POSITIVE_DECISION_SOURCE = PCN_REGULAR_PROCESS_STEP__PCN_POSITIVE_DECISION_SOURCE;

	/**
	 * The feature id for the '<em><b>PCN Negative Decision Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_WAIT_STEP__PCN_NEGATIVE_DECISION_SOURCE = PCN_REGULAR_PROCESS_STEP__PCN_NEGATIVE_DECISION_SOURCE;

	/**
	 * The feature id for the '<em><b>Non Monetary Benefits</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_WAIT_STEP__NON_MONETARY_BENEFITS = PCN_REGULAR_PROCESS_STEP__NON_MONETARY_BENEFITS;

	/**
	 * The feature id for the '<em><b>Non Monetary Costs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_WAIT_STEP__NON_MONETARY_COSTS = PCN_REGULAR_PROCESS_STEP__NON_MONETARY_COSTS;

	/**
	 * The feature id for the '<em><b>Monetary Benefits</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_WAIT_STEP__MONETARY_BENEFITS = PCN_REGULAR_PROCESS_STEP__MONETARY_BENEFITS;

	/**
	 * The feature id for the '<em><b>Monetary Costs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_WAIT_STEP__MONETARY_COSTS = PCN_REGULAR_PROCESS_STEP__MONETARY_COSTS;

	/**
	 * The feature id for the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_WAIT_STEP__ACTION = PCN_REGULAR_PROCESS_STEP__ACTION;

	/**
	 * The feature id for the '<em><b>Textual Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_WAIT_STEP__TEXTUAL_TAGS = PCN_REGULAR_PROCESS_STEP__TEXTUAL_TAGS;

	/**
	 * The feature id for the '<em><b>Delay Time Tags</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_WAIT_STEP__DELAY_TIME_TAGS = PCN_REGULAR_PROCESS_STEP__DELAY_TIME_TAGS;

	/**
	 * The feature id for the '<em><b>Probabilities Tags</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_WAIT_STEP__PROBABILITIES_TAGS = PCN_REGULAR_PROCESS_STEP__PROBABILITIES_TAGS;

	/**
	 * The feature id for the '<em><b>Sync Tags</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_WAIT_STEP__SYNC_TAGS = PCN_REGULAR_PROCESS_STEP__SYNC_TAGS;

	/**
	 * The feature id for the '<em><b>PCN Standard Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_WAIT_STEP__PCN_STANDARD_DEPENDENCY = PCN_REGULAR_PROCESS_STEP__PCN_STANDARD_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>PCN Delayed Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_WAIT_STEP__PCN_DELAYED_DEPENDENCY = PCN_REGULAR_PROCESS_STEP__PCN_DELAYED_DEPENDENCY;

	/**
	 * The number of structural features of the '<em>PCN Wait Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_WAIT_STEP_FEATURE_COUNT = PCN_REGULAR_PROCESS_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>PCN Wait Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_WAIT_STEP_OPERATION_COUNT = PCN_REGULAR_PROCESS_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pcn.impl.PCNDecisionStepImpl <em>PCN Decision Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcn.impl.PCNDecisionStepImpl
	 * @see pcn.impl.PcnPackageImpl#getPCNDecisionStep()
	 * @generated
	 */
	int PCN_DECISION_STEP = 8;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_DECISION_STEP__TAGS = PCN_PROCESS_STEP_WITH_TAGS__TAGS;

	/**
	 * The feature id for the '<em><b>PCN Standard Dependency Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_DECISION_STEP__PCN_STANDARD_DEPENDENCY_SOURCE = PCN_PROCESS_STEP_WITH_TAGS__PCN_STANDARD_DEPENDENCY_SOURCE;

	/**
	 * The feature id for the '<em><b>PCN Delayed Dependency Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_DECISION_STEP__PCN_DELAYED_DEPENDENCY_SOURCE = PCN_PROCESS_STEP_WITH_TAGS__PCN_DELAYED_DEPENDENCY_SOURCE;

	/**
	 * The feature id for the '<em><b>PCN Positive Decision Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_DECISION_STEP__PCN_POSITIVE_DECISION_SOURCE = PCN_PROCESS_STEP_WITH_TAGS__PCN_POSITIVE_DECISION_SOURCE;

	/**
	 * The feature id for the '<em><b>PCN Negative Decision Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_DECISION_STEP__PCN_NEGATIVE_DECISION_SOURCE = PCN_PROCESS_STEP_WITH_TAGS__PCN_NEGATIVE_DECISION_SOURCE;

	/**
	 * The feature id for the '<em><b>Non Monetary Benefits</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_DECISION_STEP__NON_MONETARY_BENEFITS = PCN_PROCESS_STEP_WITH_TAGS__NON_MONETARY_BENEFITS;

	/**
	 * The feature id for the '<em><b>Non Monetary Costs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_DECISION_STEP__NON_MONETARY_COSTS = PCN_PROCESS_STEP_WITH_TAGS__NON_MONETARY_COSTS;

	/**
	 * The feature id for the '<em><b>Monetary Benefits</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_DECISION_STEP__MONETARY_BENEFITS = PCN_PROCESS_STEP_WITH_TAGS__MONETARY_BENEFITS;

	/**
	 * The feature id for the '<em><b>Monetary Costs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_DECISION_STEP__MONETARY_COSTS = PCN_PROCESS_STEP_WITH_TAGS__MONETARY_COSTS;

	/**
	 * The feature id for the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_DECISION_STEP__ACTION = PCN_PROCESS_STEP_WITH_TAGS__ACTION;

	/**
	 * The feature id for the '<em><b>Textual Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_DECISION_STEP__TEXTUAL_TAGS = PCN_PROCESS_STEP_WITH_TAGS__TEXTUAL_TAGS;

	/**
	 * The feature id for the '<em><b>Delay Time Tags</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_DECISION_STEP__DELAY_TIME_TAGS = PCN_PROCESS_STEP_WITH_TAGS__DELAY_TIME_TAGS;

	/**
	 * The feature id for the '<em><b>Probabilities Tags</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_DECISION_STEP__PROBABILITIES_TAGS = PCN_PROCESS_STEP_WITH_TAGS__PROBABILITIES_TAGS;

	/**
	 * The feature id for the '<em><b>Sync Tags</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_DECISION_STEP__SYNC_TAGS = PCN_PROCESS_STEP_WITH_TAGS__SYNC_TAGS;

	/**
	 * The feature id for the '<em><b>PCN Positive Decision</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_DECISION_STEP__PCN_POSITIVE_DECISION = PCN_PROCESS_STEP_WITH_TAGS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>PCN Negative Decision</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_DECISION_STEP__PCN_NEGATIVE_DECISION = PCN_PROCESS_STEP_WITH_TAGS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>PCN Decision Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_DECISION_STEP_FEATURE_COUNT = PCN_PROCESS_STEP_WITH_TAGS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>PCN Decision Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_DECISION_STEP_OPERATION_COUNT = PCN_PROCESS_STEP_WITH_TAGS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pcn.impl.PCNTagImpl <em>PCN Tag</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcn.impl.PCNTagImpl
	 * @see pcn.impl.PcnPackageImpl#getPCNTag()
	 * @generated
	 */
	int PCN_TAG = 9;

	/**
	 * The number of structural features of the '<em>PCN Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_TAG_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>PCN Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_TAG_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pcn.impl.PCNMonetaryTagImpl <em>PCN Monetary Tag</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcn.impl.PCNMonetaryTagImpl
	 * @see pcn.impl.PcnPackageImpl#getPCNMonetaryTag()
	 * @generated
	 */
	int PCN_MONETARY_TAG = 10;

	/**
	 * The number of structural features of the '<em>PCN Monetary Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_MONETARY_TAG_FEATURE_COUNT = PCN_TAG_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>PCN Monetary Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_MONETARY_TAG_OPERATION_COUNT = PCN_TAG_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pcn.impl.PCNMonetaryBenefitImpl <em>PCN Monetary Benefit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcn.impl.PCNMonetaryBenefitImpl
	 * @see pcn.impl.PcnPackageImpl#getPCNMonetaryBenefit()
	 * @generated
	 */
	int PCN_MONETARY_BENEFIT = 11;

	/**
	 * The number of structural features of the '<em>PCN Monetary Benefit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_MONETARY_BENEFIT_FEATURE_COUNT = PCN_MONETARY_TAG_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>PCN Monetary Benefit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_MONETARY_BENEFIT_OPERATION_COUNT = PCN_MONETARY_TAG_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pcn.impl.PCNMonetaryCostImpl <em>PCN Monetary Cost</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcn.impl.PCNMonetaryCostImpl
	 * @see pcn.impl.PcnPackageImpl#getPCNMonetaryCost()
	 * @generated
	 */
	int PCN_MONETARY_COST = 12;

	/**
	 * The number of structural features of the '<em>PCN Monetary Cost</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_MONETARY_COST_FEATURE_COUNT = PCN_MONETARY_TAG_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>PCN Monetary Cost</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_MONETARY_COST_OPERATION_COUNT = PCN_MONETARY_TAG_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pcn.impl.PCNNonMonetaryTagImpl <em>PCN Non Monetary Tag</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcn.impl.PCNNonMonetaryTagImpl
	 * @see pcn.impl.PcnPackageImpl#getPCNNonMonetaryTag()
	 * @generated
	 */
	int PCN_NON_MONETARY_TAG = 13;

	/**
	 * The number of structural features of the '<em>PCN Non Monetary Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_NON_MONETARY_TAG_FEATURE_COUNT = PCN_TAG_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>PCN Non Monetary Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_NON_MONETARY_TAG_OPERATION_COUNT = PCN_TAG_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pcn.impl.PCNNonMonetaryBenefitImpl <em>PCN Non Monetary Benefit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcn.impl.PCNNonMonetaryBenefitImpl
	 * @see pcn.impl.PcnPackageImpl#getPCNNonMonetaryBenefit()
	 * @generated
	 */
	int PCN_NON_MONETARY_BENEFIT = 14;

	/**
	 * The number of structural features of the '<em>PCN Non Monetary Benefit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_NON_MONETARY_BENEFIT_FEATURE_COUNT = PCN_NON_MONETARY_TAG_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>PCN Non Monetary Benefit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_NON_MONETARY_BENEFIT_OPERATION_COUNT = PCN_NON_MONETARY_TAG_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pcn.impl.PCNNonMonetaryCostImpl <em>PCN Non Monetary Cost</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcn.impl.PCNNonMonetaryCostImpl
	 * @see pcn.impl.PcnPackageImpl#getPCNNonMonetaryCost()
	 * @generated
	 */
	int PCN_NON_MONETARY_COST = 15;

	/**
	 * The number of structural features of the '<em>PCN Non Monetary Cost</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_NON_MONETARY_COST_FEATURE_COUNT = PCN_NON_MONETARY_TAG_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>PCN Non Monetary Cost</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_NON_MONETARY_COST_OPERATION_COUNT = PCN_NON_MONETARY_TAG_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link pcn.impl.PCNInnovationStepImpl <em>PCN Innovation Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcn.impl.PCNInnovationStepImpl
	 * @see pcn.impl.PcnPackageImpl#getPCNInnovationStep()
	 * @generated
	 */
	int PCN_INNOVATION_STEP = 16;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_INNOVATION_STEP__TAGS = PCN_REGULAR_PROCESS_STEP__TAGS;

	/**
	 * The feature id for the '<em><b>PCN Standard Dependency Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_INNOVATION_STEP__PCN_STANDARD_DEPENDENCY_SOURCE = PCN_REGULAR_PROCESS_STEP__PCN_STANDARD_DEPENDENCY_SOURCE;

	/**
	 * The feature id for the '<em><b>PCN Delayed Dependency Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_INNOVATION_STEP__PCN_DELAYED_DEPENDENCY_SOURCE = PCN_REGULAR_PROCESS_STEP__PCN_DELAYED_DEPENDENCY_SOURCE;

	/**
	 * The feature id for the '<em><b>PCN Positive Decision Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_INNOVATION_STEP__PCN_POSITIVE_DECISION_SOURCE = PCN_REGULAR_PROCESS_STEP__PCN_POSITIVE_DECISION_SOURCE;

	/**
	 * The feature id for the '<em><b>PCN Negative Decision Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_INNOVATION_STEP__PCN_NEGATIVE_DECISION_SOURCE = PCN_REGULAR_PROCESS_STEP__PCN_NEGATIVE_DECISION_SOURCE;

	/**
	 * The feature id for the '<em><b>Non Monetary Benefits</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_INNOVATION_STEP__NON_MONETARY_BENEFITS = PCN_REGULAR_PROCESS_STEP__NON_MONETARY_BENEFITS;

	/**
	 * The feature id for the '<em><b>Non Monetary Costs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_INNOVATION_STEP__NON_MONETARY_COSTS = PCN_REGULAR_PROCESS_STEP__NON_MONETARY_COSTS;

	/**
	 * The feature id for the '<em><b>Monetary Benefits</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_INNOVATION_STEP__MONETARY_BENEFITS = PCN_REGULAR_PROCESS_STEP__MONETARY_BENEFITS;

	/**
	 * The feature id for the '<em><b>Monetary Costs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_INNOVATION_STEP__MONETARY_COSTS = PCN_REGULAR_PROCESS_STEP__MONETARY_COSTS;

	/**
	 * The feature id for the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_INNOVATION_STEP__ACTION = PCN_REGULAR_PROCESS_STEP__ACTION;

	/**
	 * The feature id for the '<em><b>Textual Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_INNOVATION_STEP__TEXTUAL_TAGS = PCN_REGULAR_PROCESS_STEP__TEXTUAL_TAGS;

	/**
	 * The feature id for the '<em><b>Delay Time Tags</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_INNOVATION_STEP__DELAY_TIME_TAGS = PCN_REGULAR_PROCESS_STEP__DELAY_TIME_TAGS;

	/**
	 * The feature id for the '<em><b>Probabilities Tags</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_INNOVATION_STEP__PROBABILITIES_TAGS = PCN_REGULAR_PROCESS_STEP__PROBABILITIES_TAGS;

	/**
	 * The feature id for the '<em><b>Sync Tags</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_INNOVATION_STEP__SYNC_TAGS = PCN_REGULAR_PROCESS_STEP__SYNC_TAGS;

	/**
	 * The feature id for the '<em><b>PCN Standard Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_INNOVATION_STEP__PCN_STANDARD_DEPENDENCY = PCN_REGULAR_PROCESS_STEP__PCN_STANDARD_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>PCN Delayed Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_INNOVATION_STEP__PCN_DELAYED_DEPENDENCY = PCN_REGULAR_PROCESS_STEP__PCN_DELAYED_DEPENDENCY;

	/**
	 * The number of structural features of the '<em>PCN Innovation Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_INNOVATION_STEP_FEATURE_COUNT = PCN_REGULAR_PROCESS_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>PCN Innovation Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_INNOVATION_STEP_OPERATION_COUNT = PCN_REGULAR_PROCESS_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pcn.impl.PCNOutsourcedStepImpl <em>PCN Outsourced Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcn.impl.PCNOutsourcedStepImpl
	 * @see pcn.impl.PcnPackageImpl#getPCNOutsourcedStep()
	 * @generated
	 */
	int PCN_OUTSOURCED_STEP = 17;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_OUTSOURCED_STEP__TAGS = PCN_REGULAR_PROCESS_STEP__TAGS;

	/**
	 * The feature id for the '<em><b>PCN Standard Dependency Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_OUTSOURCED_STEP__PCN_STANDARD_DEPENDENCY_SOURCE = PCN_REGULAR_PROCESS_STEP__PCN_STANDARD_DEPENDENCY_SOURCE;

	/**
	 * The feature id for the '<em><b>PCN Delayed Dependency Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_OUTSOURCED_STEP__PCN_DELAYED_DEPENDENCY_SOURCE = PCN_REGULAR_PROCESS_STEP__PCN_DELAYED_DEPENDENCY_SOURCE;

	/**
	 * The feature id for the '<em><b>PCN Positive Decision Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_OUTSOURCED_STEP__PCN_POSITIVE_DECISION_SOURCE = PCN_REGULAR_PROCESS_STEP__PCN_POSITIVE_DECISION_SOURCE;

	/**
	 * The feature id for the '<em><b>PCN Negative Decision Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_OUTSOURCED_STEP__PCN_NEGATIVE_DECISION_SOURCE = PCN_REGULAR_PROCESS_STEP__PCN_NEGATIVE_DECISION_SOURCE;

	/**
	 * The feature id for the '<em><b>Non Monetary Benefits</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_OUTSOURCED_STEP__NON_MONETARY_BENEFITS = PCN_REGULAR_PROCESS_STEP__NON_MONETARY_BENEFITS;

	/**
	 * The feature id for the '<em><b>Non Monetary Costs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_OUTSOURCED_STEP__NON_MONETARY_COSTS = PCN_REGULAR_PROCESS_STEP__NON_MONETARY_COSTS;

	/**
	 * The feature id for the '<em><b>Monetary Benefits</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_OUTSOURCED_STEP__MONETARY_BENEFITS = PCN_REGULAR_PROCESS_STEP__MONETARY_BENEFITS;

	/**
	 * The feature id for the '<em><b>Monetary Costs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_OUTSOURCED_STEP__MONETARY_COSTS = PCN_REGULAR_PROCESS_STEP__MONETARY_COSTS;

	/**
	 * The feature id for the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_OUTSOURCED_STEP__ACTION = PCN_REGULAR_PROCESS_STEP__ACTION;

	/**
	 * The feature id for the '<em><b>Textual Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_OUTSOURCED_STEP__TEXTUAL_TAGS = PCN_REGULAR_PROCESS_STEP__TEXTUAL_TAGS;

	/**
	 * The feature id for the '<em><b>Delay Time Tags</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_OUTSOURCED_STEP__DELAY_TIME_TAGS = PCN_REGULAR_PROCESS_STEP__DELAY_TIME_TAGS;

	/**
	 * The feature id for the '<em><b>Probabilities Tags</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_OUTSOURCED_STEP__PROBABILITIES_TAGS = PCN_REGULAR_PROCESS_STEP__PROBABILITIES_TAGS;

	/**
	 * The feature id for the '<em><b>Sync Tags</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_OUTSOURCED_STEP__SYNC_TAGS = PCN_REGULAR_PROCESS_STEP__SYNC_TAGS;

	/**
	 * The feature id for the '<em><b>PCN Standard Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_OUTSOURCED_STEP__PCN_STANDARD_DEPENDENCY = PCN_REGULAR_PROCESS_STEP__PCN_STANDARD_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>PCN Delayed Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_OUTSOURCED_STEP__PCN_DELAYED_DEPENDENCY = PCN_REGULAR_PROCESS_STEP__PCN_DELAYED_DEPENDENCY;

	/**
	 * The number of structural features of the '<em>PCN Outsourced Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_OUTSOURCED_STEP_FEATURE_COUNT = PCN_REGULAR_PROCESS_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>PCN Outsourced Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_OUTSOURCED_STEP_OPERATION_COUNT = PCN_REGULAR_PROCESS_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pcn.impl.PCNTextualTagImpl <em>PCN Textual Tag</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcn.impl.PCNTextualTagImpl
	 * @see pcn.impl.PcnPackageImpl#getPCNTextualTag()
	 * @generated
	 */
	int PCN_TEXTUAL_TAG = 19;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_TEXTUAL_TAG__TAG = PCN_TAG_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>PCN Textual Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_TEXTUAL_TAG_FEATURE_COUNT = PCN_TAG_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>PCN Textual Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_TEXTUAL_TAG_OPERATION_COUNT = PCN_TAG_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pcn.impl.PCNDelayTimeTagImpl <em>PCN Delay Time Tag</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcn.impl.PCNDelayTimeTagImpl
	 * @see pcn.impl.PcnPackageImpl#getPCNDelayTimeTag()
	 * @generated
	 */
	int PCN_DELAY_TIME_TAG = 20;

	/**
	 * The feature id for the '<em><b>Delay Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_DELAY_TIME_TAG__DELAY_TIME = PCN_TAG_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>PCN Delay Time Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_DELAY_TIME_TAG_FEATURE_COUNT = PCN_TAG_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>PCN Delay Time Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_DELAY_TIME_TAG_OPERATION_COUNT = PCN_TAG_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pcn.impl.PCNProbabilitiesTagImpl <em>PCN Probabilities Tag</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcn.impl.PCNProbabilitiesTagImpl
	 * @see pcn.impl.PcnPackageImpl#getPCNProbabilitiesTag()
	 * @generated
	 */
	int PCN_PROBABILITIES_TAG = 21;

	/**
	 * The feature id for the '<em><b>Yes Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_PROBABILITIES_TAG__YES_PROBABILITY = PCN_TAG_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>No Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_PROBABILITIES_TAG__NO_PROBABILITY = PCN_TAG_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>PCN Probabilities Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_PROBABILITIES_TAG_FEATURE_COUNT = PCN_TAG_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>PCN Probabilities Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_PROBABILITIES_TAG_OPERATION_COUNT = PCN_TAG_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pcn.impl.PCNSyncTagImpl <em>PCN Sync Tag</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcn.impl.PCNSyncTagImpl
	 * @see pcn.impl.PcnPackageImpl#getPCNSyncTag()
	 * @generated
	 */
	int PCN_SYNC_TAG = 22;

	/**
	 * The number of structural features of the '<em>PCN Sync Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_SYNC_TAG_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>PCN Sync Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCN_SYNC_TAG_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link pcn.PCNDiagram <em>PCN Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PCN Diagram</em>'.
	 * @see pcn.PCNDiagram
	 * @generated
	 */
	EClass getPCNDiagram();

	/**
	 * Returns the meta object for the containment reference list '{@link pcn.PCNDiagram#getDiagramEntities <em>Diagram Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diagram Entities</em>'.
	 * @see pcn.PCNDiagram#getDiagramEntities()
	 * @see #getPCNDiagram()
	 * @generated
	 */
	EReference getPCNDiagram_DiagramEntities();

	/**
	 * Returns the meta object for class '{@link pcn.PCNProcessEntity <em>PCN Process Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PCN Process Entity</em>'.
	 * @see pcn.PCNProcessEntity
	 * @generated
	 */
	EClass getPCNProcessEntity();

	/**
	 * Returns the meta object for the attribute '{@link pcn.PCNProcessEntity#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pcn.PCNProcessEntity#getName()
	 * @see #getPCNProcessEntity()
	 * @generated
	 */
	EAttribute getPCNProcessEntity_Name();

	/**
	 * Returns the meta object for the attribute '{@link pcn.PCNProcessEntity#getOrder <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order</em>'.
	 * @see pcn.PCNProcessEntity#getOrder()
	 * @see #getPCNProcessEntity()
	 * @generated
	 */
	EAttribute getPCNProcessEntity_Order();

	/**
	 * Returns the meta object for the container reference '{@link pcn.PCNProcessEntity#getBackEntity <em>Back Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Back Entity</em>'.
	 * @see pcn.PCNProcessEntity#getBackEntity()
	 * @see #getPCNProcessEntity()
	 * @generated
	 */
	EReference getPCNProcessEntity_BackEntity();

	/**
	 * Returns the meta object for the containment reference '{@link pcn.PCNProcessEntity#getNextEntity <em>Next Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Next Entity</em>'.
	 * @see pcn.PCNProcessEntity#getNextEntity()
	 * @see #getPCNProcessEntity()
	 * @generated
	 */
	EReference getPCNProcessEntity_NextEntity();

	/**
	 * Returns the meta object for the containment reference list '{@link pcn.PCNProcessEntity#getLeftDirectInteractions <em>Left Direct Interactions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Left Direct Interactions</em>'.
	 * @see pcn.PCNProcessEntity#getLeftDirectInteractions()
	 * @see #getPCNProcessEntity()
	 * @generated
	 */
	EReference getPCNProcessEntity_LeftDirectInteractions();

	/**
	 * Returns the meta object for the containment reference list '{@link pcn.PCNProcessEntity#getLeftSurrogateInteractions <em>Left Surrogate Interactions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Left Surrogate Interactions</em>'.
	 * @see pcn.PCNProcessEntity#getLeftSurrogateInteractions()
	 * @see #getPCNProcessEntity()
	 * @generated
	 */
	EReference getPCNProcessEntity_LeftSurrogateInteractions();

	/**
	 * Returns the meta object for the containment reference list '{@link pcn.PCNProcessEntity#getCenterIndependentInteractionsActivities <em>Center Independent Interactions Activities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Center Independent Interactions Activities</em>'.
	 * @see pcn.PCNProcessEntity#getCenterIndependentInteractionsActivities()
	 * @see #getPCNProcessEntity()
	 * @generated
	 */
	EReference getPCNProcessEntity_CenterIndependentInteractionsActivities();

	/**
	 * Returns the meta object for the containment reference list '{@link pcn.PCNProcessEntity#getRightSurrogateInteractions <em>Right Surrogate Interactions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Right Surrogate Interactions</em>'.
	 * @see pcn.PCNProcessEntity#getRightSurrogateInteractions()
	 * @see #getPCNProcessEntity()
	 * @generated
	 */
	EReference getPCNProcessEntity_RightSurrogateInteractions();

	/**
	 * Returns the meta object for the containment reference list '{@link pcn.PCNProcessEntity#getRightDirectInteractions <em>Right Direct Interactions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Right Direct Interactions</em>'.
	 * @see pcn.PCNProcessEntity#getRightDirectInteractions()
	 * @see #getPCNProcessEntity()
	 * @generated
	 */
	EReference getPCNProcessEntity_RightDirectInteractions();

	/**
	 * Returns the meta object for the '{@link pcn.PCNProcessEntity#getDirectInteractions() <em>Get Direct Interactions</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Direct Interactions</em>' operation.
	 * @see pcn.PCNProcessEntity#getDirectInteractions()
	 * @generated
	 */
	EOperation getPCNProcessEntity__GetDirectInteractions();

	/**
	 * Returns the meta object for the '{@link pcn.PCNProcessEntity#getSurrogateInteractions() <em>Get Surrogate Interactions</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Surrogate Interactions</em>' operation.
	 * @see pcn.PCNProcessEntity#getSurrogateInteractions()
	 * @generated
	 */
	EOperation getPCNProcessEntity__GetSurrogateInteractions();

	/**
	 * Returns the meta object for the '{@link pcn.PCNProcessEntity#getIndependentInteractios() <em>Get Independent Interactios</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Independent Interactios</em>' operation.
	 * @see pcn.PCNProcessEntity#getIndependentInteractios()
	 * @generated
	 */
	EOperation getPCNProcessEntity__GetIndependentInteractios();

	/**
	 * Returns the meta object for class '{@link pcn.PCNProcessStep <em>PCN Process Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PCN Process Step</em>'.
	 * @see pcn.PCNProcessStep
	 * @generated
	 */
	EClass getPCNProcessStep();

	/**
	 * Returns the meta object for the containment reference list '{@link pcn.PCNProcessStep#getTags <em>Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tags</em>'.
	 * @see pcn.PCNProcessStep#getTags()
	 * @see #getPCNProcessStep()
	 * @generated
	 */
	EReference getPCNProcessStep_Tags();

	/**
	 * Returns the meta object for the reference list '{@link pcn.PCNProcessStep#getPCNStandardDependencySource <em>PCN Standard Dependency Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>PCN Standard Dependency Source</em>'.
	 * @see pcn.PCNProcessStep#getPCNStandardDependencySource()
	 * @see #getPCNProcessStep()
	 * @generated
	 */
	EReference getPCNProcessStep_PCNStandardDependencySource();

	/**
	 * Returns the meta object for the reference list '{@link pcn.PCNProcessStep#getPCNDelayedDependencySource <em>PCN Delayed Dependency Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>PCN Delayed Dependency Source</em>'.
	 * @see pcn.PCNProcessStep#getPCNDelayedDependencySource()
	 * @see #getPCNProcessStep()
	 * @generated
	 */
	EReference getPCNProcessStep_PCNDelayedDependencySource();

	/**
	 * Returns the meta object for the reference list '{@link pcn.PCNProcessStep#getPCNPositiveDecisionSource <em>PCN Positive Decision Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>PCN Positive Decision Source</em>'.
	 * @see pcn.PCNProcessStep#getPCNPositiveDecisionSource()
	 * @see #getPCNProcessStep()
	 * @generated
	 */
	EReference getPCNProcessStep_PCNPositiveDecisionSource();

	/**
	 * Returns the meta object for the reference list '{@link pcn.PCNProcessStep#getPCNNegativeDecisionSource <em>PCN Negative Decision Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>PCN Negative Decision Source</em>'.
	 * @see pcn.PCNProcessStep#getPCNNegativeDecisionSource()
	 * @see #getPCNProcessStep()
	 * @generated
	 */
	EReference getPCNProcessStep_PCNNegativeDecisionSource();

	/**
	 * Returns the meta object for class '{@link pcn.PCNProcessStepWithTags <em>PCN Process Step With Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PCN Process Step With Tags</em>'.
	 * @see pcn.PCNProcessStepWithTags
	 * @generated
	 */
	EClass getPCNProcessStepWithTags();

	/**
	 * Returns the meta object for the containment reference list '{@link pcn.PCNProcessStepWithTags#getNonMonetaryBenefits <em>Non Monetary Benefits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Non Monetary Benefits</em>'.
	 * @see pcn.PCNProcessStepWithTags#getNonMonetaryBenefits()
	 * @see #getPCNProcessStepWithTags()
	 * @generated
	 */
	EReference getPCNProcessStepWithTags_NonMonetaryBenefits();

	/**
	 * Returns the meta object for the containment reference list '{@link pcn.PCNProcessStepWithTags#getNonMonetaryCosts <em>Non Monetary Costs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Non Monetary Costs</em>'.
	 * @see pcn.PCNProcessStepWithTags#getNonMonetaryCosts()
	 * @see #getPCNProcessStepWithTags()
	 * @generated
	 */
	EReference getPCNProcessStepWithTags_NonMonetaryCosts();

	/**
	 * Returns the meta object for the containment reference list '{@link pcn.PCNProcessStepWithTags#getMonetaryBenefits <em>Monetary Benefits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Monetary Benefits</em>'.
	 * @see pcn.PCNProcessStepWithTags#getMonetaryBenefits()
	 * @see #getPCNProcessStepWithTags()
	 * @generated
	 */
	EReference getPCNProcessStepWithTags_MonetaryBenefits();

	/**
	 * Returns the meta object for the containment reference list '{@link pcn.PCNProcessStepWithTags#getMonetaryCosts <em>Monetary Costs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Monetary Costs</em>'.
	 * @see pcn.PCNProcessStepWithTags#getMonetaryCosts()
	 * @see #getPCNProcessStepWithTags()
	 * @generated
	 */
	EReference getPCNProcessStepWithTags_MonetaryCosts();

	/**
	 * Returns the meta object for the attribute '{@link pcn.PCNProcessStepWithTags#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action</em>'.
	 * @see pcn.PCNProcessStepWithTags#getAction()
	 * @see #getPCNProcessStepWithTags()
	 * @generated
	 */
	EAttribute getPCNProcessStepWithTags_Action();

	/**
	 * Returns the meta object for the containment reference list '{@link pcn.PCNProcessStepWithTags#getTextualTags <em>Textual Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Textual Tags</em>'.
	 * @see pcn.PCNProcessStepWithTags#getTextualTags()
	 * @see #getPCNProcessStepWithTags()
	 * @generated
	 */
	EReference getPCNProcessStepWithTags_TextualTags();

	/**
	 * Returns the meta object for the containment reference '{@link pcn.PCNProcessStepWithTags#getDelayTimeTags <em>Delay Time Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Delay Time Tags</em>'.
	 * @see pcn.PCNProcessStepWithTags#getDelayTimeTags()
	 * @see #getPCNProcessStepWithTags()
	 * @generated
	 */
	EReference getPCNProcessStepWithTags_DelayTimeTags();

	/**
	 * Returns the meta object for the containment reference '{@link pcn.PCNProcessStepWithTags#getProbabilitiesTags <em>Probabilities Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Probabilities Tags</em>'.
	 * @see pcn.PCNProcessStepWithTags#getProbabilitiesTags()
	 * @see #getPCNProcessStepWithTags()
	 * @generated
	 */
	EReference getPCNProcessStepWithTags_ProbabilitiesTags();

	/**
	 * Returns the meta object for the containment reference '{@link pcn.PCNProcessStepWithTags#getSyncTags <em>Sync Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sync Tags</em>'.
	 * @see pcn.PCNProcessStepWithTags#getSyncTags()
	 * @see #getPCNProcessStepWithTags()
	 * @generated
	 */
	EReference getPCNProcessStepWithTags_SyncTags();

	/**
	 * Returns the meta object for class '{@link pcn.PCNReference <em>PCN Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PCN Reference</em>'.
	 * @see pcn.PCNReference
	 * @generated
	 */
	EClass getPCNReference();

	/**
	 * Returns the meta object for the attribute '{@link pcn.PCNReference#getLetter <em>Letter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Letter</em>'.
	 * @see pcn.PCNReference#getLetter()
	 * @see #getPCNReference()
	 * @generated
	 */
	EAttribute getPCNReference_Letter();

	/**
	 * Returns the meta object for the attribute '{@link pcn.PCNReference#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see pcn.PCNReference#getNumber()
	 * @see #getPCNReference()
	 * @generated
	 */
	EAttribute getPCNReference_Number();

	/**
	 * Returns the meta object for class '{@link pcn.PCNStandardStep <em>PCN Standard Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PCN Standard Step</em>'.
	 * @see pcn.PCNStandardStep
	 * @generated
	 */
	EClass getPCNStandardStep();

	/**
	 * Returns the meta object for class '{@link pcn.PCNDoAndWaitStep <em>PCN Do And Wait Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PCN Do And Wait Step</em>'.
	 * @see pcn.PCNDoAndWaitStep
	 * @generated
	 */
	EClass getPCNDoAndWaitStep();

	/**
	 * Returns the meta object for class '{@link pcn.PCNWaitStep <em>PCN Wait Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PCN Wait Step</em>'.
	 * @see pcn.PCNWaitStep
	 * @generated
	 */
	EClass getPCNWaitStep();

	/**
	 * Returns the meta object for class '{@link pcn.PCNDecisionStep <em>PCN Decision Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PCN Decision Step</em>'.
	 * @see pcn.PCNDecisionStep
	 * @generated
	 */
	EClass getPCNDecisionStep();

	/**
	 * Returns the meta object for the reference '{@link pcn.PCNDecisionStep#getPCNPositiveDecision <em>PCN Positive Decision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>PCN Positive Decision</em>'.
	 * @see pcn.PCNDecisionStep#getPCNPositiveDecision()
	 * @see #getPCNDecisionStep()
	 * @generated
	 */
	EReference getPCNDecisionStep_PCNPositiveDecision();

	/**
	 * Returns the meta object for the reference '{@link pcn.PCNDecisionStep#getPCNNegativeDecision <em>PCN Negative Decision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>PCN Negative Decision</em>'.
	 * @see pcn.PCNDecisionStep#getPCNNegativeDecision()
	 * @see #getPCNDecisionStep()
	 * @generated
	 */
	EReference getPCNDecisionStep_PCNNegativeDecision();

	/**
	 * Returns the meta object for class '{@link pcn.PCNTag <em>PCN Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PCN Tag</em>'.
	 * @see pcn.PCNTag
	 * @generated
	 */
	EClass getPCNTag();

	/**
	 * Returns the meta object for class '{@link pcn.PCNMonetaryTag <em>PCN Monetary Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PCN Monetary Tag</em>'.
	 * @see pcn.PCNMonetaryTag
	 * @generated
	 */
	EClass getPCNMonetaryTag();

	/**
	 * Returns the meta object for class '{@link pcn.PCNMonetaryBenefit <em>PCN Monetary Benefit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PCN Monetary Benefit</em>'.
	 * @see pcn.PCNMonetaryBenefit
	 * @generated
	 */
	EClass getPCNMonetaryBenefit();

	/**
	 * Returns the meta object for class '{@link pcn.PCNMonetaryCost <em>PCN Monetary Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PCN Monetary Cost</em>'.
	 * @see pcn.PCNMonetaryCost
	 * @generated
	 */
	EClass getPCNMonetaryCost();

	/**
	 * Returns the meta object for class '{@link pcn.PCNNonMonetaryTag <em>PCN Non Monetary Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PCN Non Monetary Tag</em>'.
	 * @see pcn.PCNNonMonetaryTag
	 * @generated
	 */
	EClass getPCNNonMonetaryTag();

	/**
	 * Returns the meta object for class '{@link pcn.PCNNonMonetaryBenefit <em>PCN Non Monetary Benefit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PCN Non Monetary Benefit</em>'.
	 * @see pcn.PCNNonMonetaryBenefit
	 * @generated
	 */
	EClass getPCNNonMonetaryBenefit();

	/**
	 * Returns the meta object for class '{@link pcn.PCNNonMonetaryCost <em>PCN Non Monetary Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PCN Non Monetary Cost</em>'.
	 * @see pcn.PCNNonMonetaryCost
	 * @generated
	 */
	EClass getPCNNonMonetaryCost();

	/**
	 * Returns the meta object for class '{@link pcn.PCNInnovationStep <em>PCN Innovation Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PCN Innovation Step</em>'.
	 * @see pcn.PCNInnovationStep
	 * @generated
	 */
	EClass getPCNInnovationStep();

	/**
	 * Returns the meta object for class '{@link pcn.PCNOutsourcedStep <em>PCN Outsourced Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PCN Outsourced Step</em>'.
	 * @see pcn.PCNOutsourcedStep
	 * @generated
	 */
	EClass getPCNOutsourcedStep();

	/**
	 * Returns the meta object for class '{@link pcn.PCNRegularProcessStep <em>PCN Regular Process Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PCN Regular Process Step</em>'.
	 * @see pcn.PCNRegularProcessStep
	 * @generated
	 */
	EClass getPCNRegularProcessStep();

	/**
	 * Returns the meta object for the reference list '{@link pcn.PCNRegularProcessStep#getPCNStandardDependency <em>PCN Standard Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>PCN Standard Dependency</em>'.
	 * @see pcn.PCNRegularProcessStep#getPCNStandardDependency()
	 * @see #getPCNRegularProcessStep()
	 * @generated
	 */
	EReference getPCNRegularProcessStep_PCNStandardDependency();

	/**
	 * Returns the meta object for the reference list '{@link pcn.PCNRegularProcessStep#getPCNDelayedDependency <em>PCN Delayed Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>PCN Delayed Dependency</em>'.
	 * @see pcn.PCNRegularProcessStep#getPCNDelayedDependency()
	 * @see #getPCNRegularProcessStep()
	 * @generated
	 */
	EReference getPCNRegularProcessStep_PCNDelayedDependency();

	/**
	 * Returns the meta object for class '{@link pcn.PCNTextualTag <em>PCN Textual Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PCN Textual Tag</em>'.
	 * @see pcn.PCNTextualTag
	 * @generated
	 */
	EClass getPCNTextualTag();

	/**
	 * Returns the meta object for the attribute '{@link pcn.PCNTextualTag#getTag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tag</em>'.
	 * @see pcn.PCNTextualTag#getTag()
	 * @see #getPCNTextualTag()
	 * @generated
	 */
	EAttribute getPCNTextualTag_Tag();

	/**
	 * Returns the meta object for class '{@link pcn.PCNDelayTimeTag <em>PCN Delay Time Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PCN Delay Time Tag</em>'.
	 * @see pcn.PCNDelayTimeTag
	 * @generated
	 */
	EClass getPCNDelayTimeTag();

	/**
	 * Returns the meta object for the attribute '{@link pcn.PCNDelayTimeTag#getDelayTime <em>Delay Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delay Time</em>'.
	 * @see pcn.PCNDelayTimeTag#getDelayTime()
	 * @see #getPCNDelayTimeTag()
	 * @generated
	 */
	EAttribute getPCNDelayTimeTag_DelayTime();

	/**
	 * Returns the meta object for class '{@link pcn.PCNProbabilitiesTag <em>PCN Probabilities Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PCN Probabilities Tag</em>'.
	 * @see pcn.PCNProbabilitiesTag
	 * @generated
	 */
	EClass getPCNProbabilitiesTag();

	/**
	 * Returns the meta object for the attribute '{@link pcn.PCNProbabilitiesTag#getYesProbability <em>Yes Probability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Yes Probability</em>'.
	 * @see pcn.PCNProbabilitiesTag#getYesProbability()
	 * @see #getPCNProbabilitiesTag()
	 * @generated
	 */
	EAttribute getPCNProbabilitiesTag_YesProbability();

	/**
	 * Returns the meta object for the attribute '{@link pcn.PCNProbabilitiesTag#getNoProbability <em>No Probability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>No Probability</em>'.
	 * @see pcn.PCNProbabilitiesTag#getNoProbability()
	 * @see #getPCNProbabilitiesTag()
	 * @generated
	 */
	EAttribute getPCNProbabilitiesTag_NoProbability();

	/**
	 * Returns the meta object for class '{@link pcn.PCNSyncTag <em>PCN Sync Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PCN Sync Tag</em>'.
	 * @see pcn.PCNSyncTag
	 * @generated
	 */
	EClass getPCNSyncTag();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PcnFactory getPcnFactory();

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
		 * The meta object literal for the '{@link pcn.impl.PCNDiagramImpl <em>PCN Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcn.impl.PCNDiagramImpl
		 * @see pcn.impl.PcnPackageImpl#getPCNDiagram()
		 * @generated
		 */
		EClass PCN_DIAGRAM = eINSTANCE.getPCNDiagram();

		/**
		 * The meta object literal for the '<em><b>Diagram Entities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PCN_DIAGRAM__DIAGRAM_ENTITIES = eINSTANCE.getPCNDiagram_DiagramEntities();

		/**
		 * The meta object literal for the '{@link pcn.impl.PCNProcessEntityImpl <em>PCN Process Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcn.impl.PCNProcessEntityImpl
		 * @see pcn.impl.PcnPackageImpl#getPCNProcessEntity()
		 * @generated
		 */
		EClass PCN_PROCESS_ENTITY = eINSTANCE.getPCNProcessEntity();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PCN_PROCESS_ENTITY__NAME = eINSTANCE.getPCNProcessEntity_Name();

		/**
		 * The meta object literal for the '<em><b>Order</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PCN_PROCESS_ENTITY__ORDER = eINSTANCE.getPCNProcessEntity_Order();

		/**
		 * The meta object literal for the '<em><b>Back Entity</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PCN_PROCESS_ENTITY__BACK_ENTITY = eINSTANCE.getPCNProcessEntity_BackEntity();

		/**
		 * The meta object literal for the '<em><b>Next Entity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PCN_PROCESS_ENTITY__NEXT_ENTITY = eINSTANCE.getPCNProcessEntity_NextEntity();

		/**
		 * The meta object literal for the '<em><b>Left Direct Interactions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PCN_PROCESS_ENTITY__LEFT_DIRECT_INTERACTIONS = eINSTANCE.getPCNProcessEntity_LeftDirectInteractions();

		/**
		 * The meta object literal for the '<em><b>Left Surrogate Interactions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PCN_PROCESS_ENTITY__LEFT_SURROGATE_INTERACTIONS = eINSTANCE.getPCNProcessEntity_LeftSurrogateInteractions();

		/**
		 * The meta object literal for the '<em><b>Center Independent Interactions Activities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PCN_PROCESS_ENTITY__CENTER_INDEPENDENT_INTERACTIONS_ACTIVITIES = eINSTANCE.getPCNProcessEntity_CenterIndependentInteractionsActivities();

		/**
		 * The meta object literal for the '<em><b>Right Surrogate Interactions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PCN_PROCESS_ENTITY__RIGHT_SURROGATE_INTERACTIONS = eINSTANCE.getPCNProcessEntity_RightSurrogateInteractions();

		/**
		 * The meta object literal for the '<em><b>Right Direct Interactions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PCN_PROCESS_ENTITY__RIGHT_DIRECT_INTERACTIONS = eINSTANCE.getPCNProcessEntity_RightDirectInteractions();

		/**
		 * The meta object literal for the '<em><b>Get Direct Interactions</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PCN_PROCESS_ENTITY___GET_DIRECT_INTERACTIONS = eINSTANCE.getPCNProcessEntity__GetDirectInteractions();

		/**
		 * The meta object literal for the '<em><b>Get Surrogate Interactions</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PCN_PROCESS_ENTITY___GET_SURROGATE_INTERACTIONS = eINSTANCE.getPCNProcessEntity__GetSurrogateInteractions();

		/**
		 * The meta object literal for the '<em><b>Get Independent Interactios</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PCN_PROCESS_ENTITY___GET_INDEPENDENT_INTERACTIOS = eINSTANCE.getPCNProcessEntity__GetIndependentInteractios();

		/**
		 * The meta object literal for the '{@link pcn.PCNProcessStep <em>PCN Process Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcn.PCNProcessStep
		 * @see pcn.impl.PcnPackageImpl#getPCNProcessStep()
		 * @generated
		 */
		EClass PCN_PROCESS_STEP = eINSTANCE.getPCNProcessStep();

		/**
		 * The meta object literal for the '<em><b>Tags</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PCN_PROCESS_STEP__TAGS = eINSTANCE.getPCNProcessStep_Tags();

		/**
		 * The meta object literal for the '<em><b>PCN Standard Dependency Source</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PCN_PROCESS_STEP__PCN_STANDARD_DEPENDENCY_SOURCE = eINSTANCE.getPCNProcessStep_PCNStandardDependencySource();

		/**
		 * The meta object literal for the '<em><b>PCN Delayed Dependency Source</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PCN_PROCESS_STEP__PCN_DELAYED_DEPENDENCY_SOURCE = eINSTANCE.getPCNProcessStep_PCNDelayedDependencySource();

		/**
		 * The meta object literal for the '<em><b>PCN Positive Decision Source</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PCN_PROCESS_STEP__PCN_POSITIVE_DECISION_SOURCE = eINSTANCE.getPCNProcessStep_PCNPositiveDecisionSource();

		/**
		 * The meta object literal for the '<em><b>PCN Negative Decision Source</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PCN_PROCESS_STEP__PCN_NEGATIVE_DECISION_SOURCE = eINSTANCE.getPCNProcessStep_PCNNegativeDecisionSource();

		/**
		 * The meta object literal for the '{@link pcn.impl.PCNProcessStepWithTagsImpl <em>PCN Process Step With Tags</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcn.impl.PCNProcessStepWithTagsImpl
		 * @see pcn.impl.PcnPackageImpl#getPCNProcessStepWithTags()
		 * @generated
		 */
		EClass PCN_PROCESS_STEP_WITH_TAGS = eINSTANCE.getPCNProcessStepWithTags();

		/**
		 * The meta object literal for the '<em><b>Non Monetary Benefits</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PCN_PROCESS_STEP_WITH_TAGS__NON_MONETARY_BENEFITS = eINSTANCE.getPCNProcessStepWithTags_NonMonetaryBenefits();

		/**
		 * The meta object literal for the '<em><b>Non Monetary Costs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PCN_PROCESS_STEP_WITH_TAGS__NON_MONETARY_COSTS = eINSTANCE.getPCNProcessStepWithTags_NonMonetaryCosts();

		/**
		 * The meta object literal for the '<em><b>Monetary Benefits</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PCN_PROCESS_STEP_WITH_TAGS__MONETARY_BENEFITS = eINSTANCE.getPCNProcessStepWithTags_MonetaryBenefits();

		/**
		 * The meta object literal for the '<em><b>Monetary Costs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PCN_PROCESS_STEP_WITH_TAGS__MONETARY_COSTS = eINSTANCE.getPCNProcessStepWithTags_MonetaryCosts();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PCN_PROCESS_STEP_WITH_TAGS__ACTION = eINSTANCE.getPCNProcessStepWithTags_Action();

		/**
		 * The meta object literal for the '<em><b>Textual Tags</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PCN_PROCESS_STEP_WITH_TAGS__TEXTUAL_TAGS = eINSTANCE.getPCNProcessStepWithTags_TextualTags();

		/**
		 * The meta object literal for the '<em><b>Delay Time Tags</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PCN_PROCESS_STEP_WITH_TAGS__DELAY_TIME_TAGS = eINSTANCE.getPCNProcessStepWithTags_DelayTimeTags();

		/**
		 * The meta object literal for the '<em><b>Probabilities Tags</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PCN_PROCESS_STEP_WITH_TAGS__PROBABILITIES_TAGS = eINSTANCE.getPCNProcessStepWithTags_ProbabilitiesTags();

		/**
		 * The meta object literal for the '<em><b>Sync Tags</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PCN_PROCESS_STEP_WITH_TAGS__SYNC_TAGS = eINSTANCE.getPCNProcessStepWithTags_SyncTags();

		/**
		 * The meta object literal for the '{@link pcn.impl.PCNReferenceImpl <em>PCN Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcn.impl.PCNReferenceImpl
		 * @see pcn.impl.PcnPackageImpl#getPCNReference()
		 * @generated
		 */
		EClass PCN_REFERENCE = eINSTANCE.getPCNReference();

		/**
		 * The meta object literal for the '<em><b>Letter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PCN_REFERENCE__LETTER = eINSTANCE.getPCNReference_Letter();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PCN_REFERENCE__NUMBER = eINSTANCE.getPCNReference_Number();

		/**
		 * The meta object literal for the '{@link pcn.impl.PCNStandardStepImpl <em>PCN Standard Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcn.impl.PCNStandardStepImpl
		 * @see pcn.impl.PcnPackageImpl#getPCNStandardStep()
		 * @generated
		 */
		EClass PCN_STANDARD_STEP = eINSTANCE.getPCNStandardStep();

		/**
		 * The meta object literal for the '{@link pcn.impl.PCNDoAndWaitStepImpl <em>PCN Do And Wait Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcn.impl.PCNDoAndWaitStepImpl
		 * @see pcn.impl.PcnPackageImpl#getPCNDoAndWaitStep()
		 * @generated
		 */
		EClass PCN_DO_AND_WAIT_STEP = eINSTANCE.getPCNDoAndWaitStep();

		/**
		 * The meta object literal for the '{@link pcn.impl.PCNWaitStepImpl <em>PCN Wait Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcn.impl.PCNWaitStepImpl
		 * @see pcn.impl.PcnPackageImpl#getPCNWaitStep()
		 * @generated
		 */
		EClass PCN_WAIT_STEP = eINSTANCE.getPCNWaitStep();

		/**
		 * The meta object literal for the '{@link pcn.impl.PCNDecisionStepImpl <em>PCN Decision Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcn.impl.PCNDecisionStepImpl
		 * @see pcn.impl.PcnPackageImpl#getPCNDecisionStep()
		 * @generated
		 */
		EClass PCN_DECISION_STEP = eINSTANCE.getPCNDecisionStep();

		/**
		 * The meta object literal for the '<em><b>PCN Positive Decision</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PCN_DECISION_STEP__PCN_POSITIVE_DECISION = eINSTANCE.getPCNDecisionStep_PCNPositiveDecision();

		/**
		 * The meta object literal for the '<em><b>PCN Negative Decision</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PCN_DECISION_STEP__PCN_NEGATIVE_DECISION = eINSTANCE.getPCNDecisionStep_PCNNegativeDecision();

		/**
		 * The meta object literal for the '{@link pcn.impl.PCNTagImpl <em>PCN Tag</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcn.impl.PCNTagImpl
		 * @see pcn.impl.PcnPackageImpl#getPCNTag()
		 * @generated
		 */
		EClass PCN_TAG = eINSTANCE.getPCNTag();

		/**
		 * The meta object literal for the '{@link pcn.impl.PCNMonetaryTagImpl <em>PCN Monetary Tag</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcn.impl.PCNMonetaryTagImpl
		 * @see pcn.impl.PcnPackageImpl#getPCNMonetaryTag()
		 * @generated
		 */
		EClass PCN_MONETARY_TAG = eINSTANCE.getPCNMonetaryTag();

		/**
		 * The meta object literal for the '{@link pcn.impl.PCNMonetaryBenefitImpl <em>PCN Monetary Benefit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcn.impl.PCNMonetaryBenefitImpl
		 * @see pcn.impl.PcnPackageImpl#getPCNMonetaryBenefit()
		 * @generated
		 */
		EClass PCN_MONETARY_BENEFIT = eINSTANCE.getPCNMonetaryBenefit();

		/**
		 * The meta object literal for the '{@link pcn.impl.PCNMonetaryCostImpl <em>PCN Monetary Cost</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcn.impl.PCNMonetaryCostImpl
		 * @see pcn.impl.PcnPackageImpl#getPCNMonetaryCost()
		 * @generated
		 */
		EClass PCN_MONETARY_COST = eINSTANCE.getPCNMonetaryCost();

		/**
		 * The meta object literal for the '{@link pcn.impl.PCNNonMonetaryTagImpl <em>PCN Non Monetary Tag</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcn.impl.PCNNonMonetaryTagImpl
		 * @see pcn.impl.PcnPackageImpl#getPCNNonMonetaryTag()
		 * @generated
		 */
		EClass PCN_NON_MONETARY_TAG = eINSTANCE.getPCNNonMonetaryTag();

		/**
		 * The meta object literal for the '{@link pcn.impl.PCNNonMonetaryBenefitImpl <em>PCN Non Monetary Benefit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcn.impl.PCNNonMonetaryBenefitImpl
		 * @see pcn.impl.PcnPackageImpl#getPCNNonMonetaryBenefit()
		 * @generated
		 */
		EClass PCN_NON_MONETARY_BENEFIT = eINSTANCE.getPCNNonMonetaryBenefit();

		/**
		 * The meta object literal for the '{@link pcn.impl.PCNNonMonetaryCostImpl <em>PCN Non Monetary Cost</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcn.impl.PCNNonMonetaryCostImpl
		 * @see pcn.impl.PcnPackageImpl#getPCNNonMonetaryCost()
		 * @generated
		 */
		EClass PCN_NON_MONETARY_COST = eINSTANCE.getPCNNonMonetaryCost();

		/**
		 * The meta object literal for the '{@link pcn.impl.PCNInnovationStepImpl <em>PCN Innovation Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcn.impl.PCNInnovationStepImpl
		 * @see pcn.impl.PcnPackageImpl#getPCNInnovationStep()
		 * @generated
		 */
		EClass PCN_INNOVATION_STEP = eINSTANCE.getPCNInnovationStep();

		/**
		 * The meta object literal for the '{@link pcn.impl.PCNOutsourcedStepImpl <em>PCN Outsourced Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcn.impl.PCNOutsourcedStepImpl
		 * @see pcn.impl.PcnPackageImpl#getPCNOutsourcedStep()
		 * @generated
		 */
		EClass PCN_OUTSOURCED_STEP = eINSTANCE.getPCNOutsourcedStep();

		/**
		 * The meta object literal for the '{@link pcn.impl.PCNRegularProcessStepImpl <em>PCN Regular Process Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcn.impl.PCNRegularProcessStepImpl
		 * @see pcn.impl.PcnPackageImpl#getPCNRegularProcessStep()
		 * @generated
		 */
		EClass PCN_REGULAR_PROCESS_STEP = eINSTANCE.getPCNRegularProcessStep();

		/**
		 * The meta object literal for the '<em><b>PCN Standard Dependency</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PCN_REGULAR_PROCESS_STEP__PCN_STANDARD_DEPENDENCY = eINSTANCE.getPCNRegularProcessStep_PCNStandardDependency();

		/**
		 * The meta object literal for the '<em><b>PCN Delayed Dependency</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PCN_REGULAR_PROCESS_STEP__PCN_DELAYED_DEPENDENCY = eINSTANCE.getPCNRegularProcessStep_PCNDelayedDependency();

		/**
		 * The meta object literal for the '{@link pcn.impl.PCNTextualTagImpl <em>PCN Textual Tag</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcn.impl.PCNTextualTagImpl
		 * @see pcn.impl.PcnPackageImpl#getPCNTextualTag()
		 * @generated
		 */
		EClass PCN_TEXTUAL_TAG = eINSTANCE.getPCNTextualTag();

		/**
		 * The meta object literal for the '<em><b>Tag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PCN_TEXTUAL_TAG__TAG = eINSTANCE.getPCNTextualTag_Tag();

		/**
		 * The meta object literal for the '{@link pcn.impl.PCNDelayTimeTagImpl <em>PCN Delay Time Tag</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcn.impl.PCNDelayTimeTagImpl
		 * @see pcn.impl.PcnPackageImpl#getPCNDelayTimeTag()
		 * @generated
		 */
		EClass PCN_DELAY_TIME_TAG = eINSTANCE.getPCNDelayTimeTag();

		/**
		 * The meta object literal for the '<em><b>Delay Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PCN_DELAY_TIME_TAG__DELAY_TIME = eINSTANCE.getPCNDelayTimeTag_DelayTime();

		/**
		 * The meta object literal for the '{@link pcn.impl.PCNProbabilitiesTagImpl <em>PCN Probabilities Tag</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcn.impl.PCNProbabilitiesTagImpl
		 * @see pcn.impl.PcnPackageImpl#getPCNProbabilitiesTag()
		 * @generated
		 */
		EClass PCN_PROBABILITIES_TAG = eINSTANCE.getPCNProbabilitiesTag();

		/**
		 * The meta object literal for the '<em><b>Yes Probability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PCN_PROBABILITIES_TAG__YES_PROBABILITY = eINSTANCE.getPCNProbabilitiesTag_YesProbability();

		/**
		 * The meta object literal for the '<em><b>No Probability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PCN_PROBABILITIES_TAG__NO_PROBABILITY = eINSTANCE.getPCNProbabilitiesTag_NoProbability();

		/**
		 * The meta object literal for the '{@link pcn.impl.PCNSyncTagImpl <em>PCN Sync Tag</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcn.impl.PCNSyncTagImpl
		 * @see pcn.impl.PcnPackageImpl#getPCNSyncTag()
		 * @generated
		 */
		EClass PCN_SYNC_TAG = eINSTANCE.getPCNSyncTag();

	}

} //PcnPackage
