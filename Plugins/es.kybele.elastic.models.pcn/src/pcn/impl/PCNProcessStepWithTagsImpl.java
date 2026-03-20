/**
 */
package pcn.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import pcn.PCNDecisionStep;
import pcn.PCNDelayTimeTag;
import pcn.PCNMonetaryBenefit;
import pcn.PCNMonetaryCost;
import pcn.PCNNonMonetaryBenefit;
import pcn.PCNNonMonetaryCost;
import pcn.PCNProbabilitiesTag;
import pcn.PCNProcessStepWithTags;
import pcn.PCNRegularProcessStep;
import pcn.PCNSyncTag;
import pcn.PCNTag;
import pcn.PCNTextualTag;
import pcn.PcnPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PCN Process Step With Tags</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pcn.impl.PCNProcessStepWithTagsImpl#getTags <em>Tags</em>}</li>
 *   <li>{@link pcn.impl.PCNProcessStepWithTagsImpl#getPCNStandardDependencySource <em>PCN Standard Dependency Source</em>}</li>
 *   <li>{@link pcn.impl.PCNProcessStepWithTagsImpl#getPCNDelayedDependencySource <em>PCN Delayed Dependency Source</em>}</li>
 *   <li>{@link pcn.impl.PCNProcessStepWithTagsImpl#getPCNPositiveDecisionSource <em>PCN Positive Decision Source</em>}</li>
 *   <li>{@link pcn.impl.PCNProcessStepWithTagsImpl#getPCNNegativeDecisionSource <em>PCN Negative Decision Source</em>}</li>
 *   <li>{@link pcn.impl.PCNProcessStepWithTagsImpl#getNonMonetaryBenefits <em>Non Monetary Benefits</em>}</li>
 *   <li>{@link pcn.impl.PCNProcessStepWithTagsImpl#getNonMonetaryCosts <em>Non Monetary Costs</em>}</li>
 *   <li>{@link pcn.impl.PCNProcessStepWithTagsImpl#getMonetaryBenefits <em>Monetary Benefits</em>}</li>
 *   <li>{@link pcn.impl.PCNProcessStepWithTagsImpl#getMonetaryCosts <em>Monetary Costs</em>}</li>
 *   <li>{@link pcn.impl.PCNProcessStepWithTagsImpl#getAction <em>Action</em>}</li>
 *   <li>{@link pcn.impl.PCNProcessStepWithTagsImpl#getTextualTags <em>Textual Tags</em>}</li>
 *   <li>{@link pcn.impl.PCNProcessStepWithTagsImpl#getDelayTimeTags <em>Delay Time Tags</em>}</li>
 *   <li>{@link pcn.impl.PCNProcessStepWithTagsImpl#getProbabilitiesTags <em>Probabilities Tags</em>}</li>
 *   <li>{@link pcn.impl.PCNProcessStepWithTagsImpl#getSyncTags <em>Sync Tags</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class PCNProcessStepWithTagsImpl extends MinimalEObjectImpl.Container implements PCNProcessStepWithTags {
	/**
	 * The cached value of the '{@link #getTags() <em>Tags</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTags()
	 * @generated
	 * @ordered
	 */
	protected EList<PCNTag> tags;

	/**
	 * The cached value of the '{@link #getPCNStandardDependencySource() <em>PCN Standard Dependency Source</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPCNStandardDependencySource()
	 * @generated
	 * @ordered
	 */
	protected EList<PCNRegularProcessStep> pcnStandardDependencySource;

	/**
	 * The cached value of the '{@link #getPCNDelayedDependencySource() <em>PCN Delayed Dependency Source</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPCNDelayedDependencySource()
	 * @generated
	 * @ordered
	 */
	protected EList<PCNRegularProcessStep> pcnDelayedDependencySource;

	/**
	 * The cached value of the '{@link #getPCNPositiveDecisionSource() <em>PCN Positive Decision Source</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPCNPositiveDecisionSource()
	 * @generated
	 * @ordered
	 */
	protected EList<PCNDecisionStep> pcnPositiveDecisionSource;

	/**
	 * The cached value of the '{@link #getPCNNegativeDecisionSource() <em>PCN Negative Decision Source</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPCNNegativeDecisionSource()
	 * @generated
	 * @ordered
	 */
	protected EList<PCNDecisionStep> pcnNegativeDecisionSource;

	/**
	 * The cached value of the '{@link #getNonMonetaryBenefits() <em>Non Monetary Benefits</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNonMonetaryBenefits()
	 * @generated
	 * @ordered
	 */
	protected EList<PCNNonMonetaryBenefit> nonMonetaryBenefits;

	/**
	 * The cached value of the '{@link #getNonMonetaryCosts() <em>Non Monetary Costs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNonMonetaryCosts()
	 * @generated
	 * @ordered
	 */
	protected EList<PCNNonMonetaryCost> nonMonetaryCosts;

	/**
	 * The cached value of the '{@link #getMonetaryBenefits() <em>Monetary Benefits</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonetaryBenefits()
	 * @generated
	 * @ordered
	 */
	protected EList<PCNMonetaryBenefit> monetaryBenefits;

	/**
	 * The cached value of the '{@link #getMonetaryCosts() <em>Monetary Costs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonetaryCosts()
	 * @generated
	 * @ordered
	 */
	protected EList<PCNMonetaryCost> monetaryCosts;

	/**
	 * The default value of the '{@link #getAction() <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAction() <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected String action = ACTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTextualTags() <em>Textual Tags</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextualTags()
	 * @generated
	 * @ordered
	 */
	protected EList<PCNTextualTag> textualTags;

	/**
	 * The cached value of the '{@link #getDelayTimeTags() <em>Delay Time Tags</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelayTimeTags()
	 * @generated
	 * @ordered
	 */
	protected PCNDelayTimeTag delayTimeTags;

	/**
	 * The cached value of the '{@link #getProbabilitiesTags() <em>Probabilities Tags</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProbabilitiesTags()
	 * @generated
	 * @ordered
	 */
	protected PCNProbabilitiesTag probabilitiesTags;

	/**
	 * The cached value of the '{@link #getSyncTags() <em>Sync Tags</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSyncTags()
	 * @generated
	 * @ordered
	 */
	protected PCNSyncTag syncTags;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PCNProcessStepWithTagsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PcnPackage.Literals.PCN_PROCESS_STEP_WITH_TAGS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PCNTag> getTags() {
		if (tags == null) {
			tags = new EObjectContainmentEList<PCNTag>(PCNTag.class, this, PcnPackage.PCN_PROCESS_STEP_WITH_TAGS__TAGS);
		}
		return tags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PCNRegularProcessStep> getPCNStandardDependencySource() {
		if (pcnStandardDependencySource == null) {
			pcnStandardDependencySource = new EObjectWithInverseResolvingEList.ManyInverse<PCNRegularProcessStep>(PCNRegularProcessStep.class, this, PcnPackage.PCN_PROCESS_STEP_WITH_TAGS__PCN_STANDARD_DEPENDENCY_SOURCE, PcnPackage.PCN_REGULAR_PROCESS_STEP__PCN_STANDARD_DEPENDENCY);
		}
		return pcnStandardDependencySource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PCNRegularProcessStep> getPCNDelayedDependencySource() {
		if (pcnDelayedDependencySource == null) {
			pcnDelayedDependencySource = new EObjectWithInverseResolvingEList.ManyInverse<PCNRegularProcessStep>(PCNRegularProcessStep.class, this, PcnPackage.PCN_PROCESS_STEP_WITH_TAGS__PCN_DELAYED_DEPENDENCY_SOURCE, PcnPackage.PCN_REGULAR_PROCESS_STEP__PCN_DELAYED_DEPENDENCY);
		}
		return pcnDelayedDependencySource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PCNDecisionStep> getPCNPositiveDecisionSource() {
		if (pcnPositiveDecisionSource == null) {
			pcnPositiveDecisionSource = new EObjectWithInverseResolvingEList<PCNDecisionStep>(PCNDecisionStep.class, this, PcnPackage.PCN_PROCESS_STEP_WITH_TAGS__PCN_POSITIVE_DECISION_SOURCE, PcnPackage.PCN_DECISION_STEP__PCN_POSITIVE_DECISION);
		}
		return pcnPositiveDecisionSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PCNDecisionStep> getPCNNegativeDecisionSource() {
		if (pcnNegativeDecisionSource == null) {
			pcnNegativeDecisionSource = new EObjectWithInverseResolvingEList<PCNDecisionStep>(PCNDecisionStep.class, this, PcnPackage.PCN_PROCESS_STEP_WITH_TAGS__PCN_NEGATIVE_DECISION_SOURCE, PcnPackage.PCN_DECISION_STEP__PCN_NEGATIVE_DECISION);
		}
		return pcnNegativeDecisionSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAction() {
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAction(String newAction) {
		String oldAction = action;
		action = newAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PcnPackage.PCN_PROCESS_STEP_WITH_TAGS__ACTION, oldAction, action));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PCNTextualTag> getTextualTags() {
		if (textualTags == null) {
			textualTags = new EObjectContainmentEList<PCNTextualTag>(PCNTextualTag.class, this, PcnPackage.PCN_PROCESS_STEP_WITH_TAGS__TEXTUAL_TAGS);
		}
		return textualTags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PCNDelayTimeTag getDelayTimeTags() {
		return delayTimeTags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDelayTimeTags(PCNDelayTimeTag newDelayTimeTags, NotificationChain msgs) {
		PCNDelayTimeTag oldDelayTimeTags = delayTimeTags;
		delayTimeTags = newDelayTimeTags;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PcnPackage.PCN_PROCESS_STEP_WITH_TAGS__DELAY_TIME_TAGS, oldDelayTimeTags, newDelayTimeTags);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDelayTimeTags(PCNDelayTimeTag newDelayTimeTags) {
		if (newDelayTimeTags != delayTimeTags) {
			NotificationChain msgs = null;
			if (delayTimeTags != null)
				msgs = ((InternalEObject)delayTimeTags).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PcnPackage.PCN_PROCESS_STEP_WITH_TAGS__DELAY_TIME_TAGS, null, msgs);
			if (newDelayTimeTags != null)
				msgs = ((InternalEObject)newDelayTimeTags).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PcnPackage.PCN_PROCESS_STEP_WITH_TAGS__DELAY_TIME_TAGS, null, msgs);
			msgs = basicSetDelayTimeTags(newDelayTimeTags, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PcnPackage.PCN_PROCESS_STEP_WITH_TAGS__DELAY_TIME_TAGS, newDelayTimeTags, newDelayTimeTags));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PCNProbabilitiesTag getProbabilitiesTags() {
		return probabilitiesTags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProbabilitiesTags(PCNProbabilitiesTag newProbabilitiesTags, NotificationChain msgs) {
		PCNProbabilitiesTag oldProbabilitiesTags = probabilitiesTags;
		probabilitiesTags = newProbabilitiesTags;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PcnPackage.PCN_PROCESS_STEP_WITH_TAGS__PROBABILITIES_TAGS, oldProbabilitiesTags, newProbabilitiesTags);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProbabilitiesTags(PCNProbabilitiesTag newProbabilitiesTags) {
		if (newProbabilitiesTags != probabilitiesTags) {
			NotificationChain msgs = null;
			if (probabilitiesTags != null)
				msgs = ((InternalEObject)probabilitiesTags).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PcnPackage.PCN_PROCESS_STEP_WITH_TAGS__PROBABILITIES_TAGS, null, msgs);
			if (newProbabilitiesTags != null)
				msgs = ((InternalEObject)newProbabilitiesTags).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PcnPackage.PCN_PROCESS_STEP_WITH_TAGS__PROBABILITIES_TAGS, null, msgs);
			msgs = basicSetProbabilitiesTags(newProbabilitiesTags, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PcnPackage.PCN_PROCESS_STEP_WITH_TAGS__PROBABILITIES_TAGS, newProbabilitiesTags, newProbabilitiesTags));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PCNSyncTag getSyncTags() {
		return syncTags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSyncTags(PCNSyncTag newSyncTags, NotificationChain msgs) {
		PCNSyncTag oldSyncTags = syncTags;
		syncTags = newSyncTags;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PcnPackage.PCN_PROCESS_STEP_WITH_TAGS__SYNC_TAGS, oldSyncTags, newSyncTags);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSyncTags(PCNSyncTag newSyncTags) {
		if (newSyncTags != syncTags) {
			NotificationChain msgs = null;
			if (syncTags != null)
				msgs = ((InternalEObject)syncTags).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PcnPackage.PCN_PROCESS_STEP_WITH_TAGS__SYNC_TAGS, null, msgs);
			if (newSyncTags != null)
				msgs = ((InternalEObject)newSyncTags).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PcnPackage.PCN_PROCESS_STEP_WITH_TAGS__SYNC_TAGS, null, msgs);
			msgs = basicSetSyncTags(newSyncTags, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PcnPackage.PCN_PROCESS_STEP_WITH_TAGS__SYNC_TAGS, newSyncTags, newSyncTags));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PcnPackage.PCN_PROCESS_STEP_WITH_TAGS__PCN_STANDARD_DEPENDENCY_SOURCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPCNStandardDependencySource()).basicAdd(otherEnd, msgs);
			case PcnPackage.PCN_PROCESS_STEP_WITH_TAGS__PCN_DELAYED_DEPENDENCY_SOURCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPCNDelayedDependencySource()).basicAdd(otherEnd, msgs);
			case PcnPackage.PCN_PROCESS_STEP_WITH_TAGS__PCN_POSITIVE_DECISION_SOURCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPCNPositiveDecisionSource()).basicAdd(otherEnd, msgs);
			case PcnPackage.PCN_PROCESS_STEP_WITH_TAGS__PCN_NEGATIVE_DECISION_SOURCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPCNNegativeDecisionSource()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PCNNonMonetaryBenefit> getNonMonetaryBenefits() {
		if (nonMonetaryBenefits == null) {
			nonMonetaryBenefits = new EObjectContainmentEList<PCNNonMonetaryBenefit>(PCNNonMonetaryBenefit.class, this, PcnPackage.PCN_PROCESS_STEP_WITH_TAGS__NON_MONETARY_BENEFITS);
		}
		return nonMonetaryBenefits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PCNNonMonetaryCost> getNonMonetaryCosts() {
		if (nonMonetaryCosts == null) {
			nonMonetaryCosts = new EObjectContainmentEList<PCNNonMonetaryCost>(PCNNonMonetaryCost.class, this, PcnPackage.PCN_PROCESS_STEP_WITH_TAGS__NON_MONETARY_COSTS);
		}
		return nonMonetaryCosts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PCNMonetaryBenefit> getMonetaryBenefits() {
		if (monetaryBenefits == null) {
			monetaryBenefits = new EObjectContainmentEList<PCNMonetaryBenefit>(PCNMonetaryBenefit.class, this, PcnPackage.PCN_PROCESS_STEP_WITH_TAGS__MONETARY_BENEFITS);
		}
		return monetaryBenefits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PCNMonetaryCost> getMonetaryCosts() {
		if (monetaryCosts == null) {
			monetaryCosts = new EObjectContainmentEList<PCNMonetaryCost>(PCNMonetaryCost.class, this, PcnPackage.PCN_PROCESS_STEP_WITH_TAGS__MONETARY_COSTS);
		}
		return monetaryCosts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PcnPackage.PCN_PROCESS_STEP_WITH_TAGS__TAGS:
				return ((InternalEList<?>)getTags()).basicRemove(otherEnd, msgs);
			case PcnPackage.PCN_PROCESS_STEP_WITH_TAGS__PCN_STANDARD_DEPENDENCY_SOURCE:
				return ((InternalEList<?>)getPCNStandardDependencySource()).basicRemove(otherEnd, msgs);
			case PcnPackage.PCN_PROCESS_STEP_WITH_TAGS__PCN_DELAYED_DEPENDENCY_SOURCE:
				return ((InternalEList<?>)getPCNDelayedDependencySource()).basicRemove(otherEnd, msgs);
			case PcnPackage.PCN_PROCESS_STEP_WITH_TAGS__PCN_POSITIVE_DECISION_SOURCE:
				return ((InternalEList<?>)getPCNPositiveDecisionSource()).basicRemove(otherEnd, msgs);
			case PcnPackage.PCN_PROCESS_STEP_WITH_TAGS__PCN_NEGATIVE_DECISION_SOURCE:
				return ((InternalEList<?>)getPCNNegativeDecisionSource()).basicRemove(otherEnd, msgs);
			case PcnPackage.PCN_PROCESS_STEP_WITH_TAGS__NON_MONETARY_BENEFITS:
				return ((InternalEList<?>)getNonMonetaryBenefits()).basicRemove(otherEnd, msgs);
			case PcnPackage.PCN_PROCESS_STEP_WITH_TAGS__NON_MONETARY_COSTS:
				return ((InternalEList<?>)getNonMonetaryCosts()).basicRemove(otherEnd, msgs);
			case PcnPackage.PCN_PROCESS_STEP_WITH_TAGS__MONETARY_BENEFITS:
				return ((InternalEList<?>)getMonetaryBenefits()).basicRemove(otherEnd, msgs);
			case PcnPackage.PCN_PROCESS_STEP_WITH_TAGS__MONETARY_COSTS:
				return ((InternalEList<?>)getMonetaryCosts()).basicRemove(otherEnd, msgs);
			case PcnPackage.PCN_PROCESS_STEP_WITH_TAGS__TEXTUAL_TAGS:
				return ((InternalEList<?>)getTextualTags()).basicRemove(otherEnd, msgs);
			case PcnPackage.PCN_PROCESS_STEP_WITH_TAGS__DELAY_TIME_TAGS:
				return basicSetDelayTimeTags(null, msgs);
			case PcnPackage.PCN_PROCESS_STEP_WITH_TAGS__PROBABILITIES_TAGS:
				return basicSetProbabilitiesTags(null, msgs);
			case PcnPackage.PCN_PROCESS_STEP_WITH_TAGS__SYNC_TAGS:
				return basicSetSyncTags(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PcnPackage.PCN_PROCESS_STEP_WITH_TAGS__TAGS:
				return getTags();
			case PcnPackage.PCN_PROCESS_STEP_WITH_TAGS__PCN_STANDARD_DEPENDENCY_SOURCE:
				return getPCNStandardDependencySource();
			case PcnPackage.PCN_PROCESS_STEP_WITH_TAGS__PCN_DELAYED_DEPENDENCY_SOURCE:
				return getPCNDelayedDependencySource();
			case PcnPackage.PCN_PROCESS_STEP_WITH_TAGS__PCN_POSITIVE_DECISION_SOURCE:
				return getPCNPositiveDecisionSource();
			case PcnPackage.PCN_PROCESS_STEP_WITH_TAGS__PCN_NEGATIVE_DECISION_SOURCE:
				return getPCNNegativeDecisionSource();
			case PcnPackage.PCN_PROCESS_STEP_WITH_TAGS__NON_MONETARY_BENEFITS:
				return getNonMonetaryBenefits();
			case PcnPackage.PCN_PROCESS_STEP_WITH_TAGS__NON_MONETARY_COSTS:
				return getNonMonetaryCosts();
			case PcnPackage.PCN_PROCESS_STEP_WITH_TAGS__MONETARY_BENEFITS:
				return getMonetaryBenefits();
			case PcnPackage.PCN_PROCESS_STEP_WITH_TAGS__MONETARY_COSTS:
				return getMonetaryCosts();
			case PcnPackage.PCN_PROCESS_STEP_WITH_TAGS__ACTION:
				return getAction();
			case PcnPackage.PCN_PROCESS_STEP_WITH_TAGS__TEXTUAL_TAGS:
				return getTextualTags();
			case PcnPackage.PCN_PROCESS_STEP_WITH_TAGS__DELAY_TIME_TAGS:
				return getDelayTimeTags();
			case PcnPackage.PCN_PROCESS_STEP_WITH_TAGS__PROBABILITIES_TAGS:
				return getProbabilitiesTags();
			case PcnPackage.PCN_PROCESS_STEP_WITH_TAGS__SYNC_TAGS:
				return getSyncTags();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PcnPackage.PCN_PROCESS_STEP_WITH_TAGS__TAGS:
				getTags().clear();
				getTags().addAll((Collection<? extends PCNTag>)newValue);
				return;
			case PcnPackage.PCN_PROCESS_STEP_WITH_TAGS__PCN_STANDARD_DEPENDENCY_SOURCE:
				getPCNStandardDependencySource().clear();
				getPCNStandardDependencySource().addAll((Collection<? extends PCNRegularProcessStep>)newValue);
				return;
			case PcnPackage.PCN_PROCESS_STEP_WITH_TAGS__PCN_DELAYED_DEPENDENCY_SOURCE:
				getPCNDelayedDependencySource().clear();
				getPCNDelayedDependencySource().addAll((Collection<? extends PCNRegularProcessStep>)newValue);
				return;
			case PcnPackage.PCN_PROCESS_STEP_WITH_TAGS__PCN_POSITIVE_DECISION_SOURCE:
				getPCNPositiveDecisionSource().clear();
				getPCNPositiveDecisionSource().addAll((Collection<? extends PCNDecisionStep>)newValue);
				return;
			case PcnPackage.PCN_PROCESS_STEP_WITH_TAGS__PCN_NEGATIVE_DECISION_SOURCE:
				getPCNNegativeDecisionSource().clear();
				getPCNNegativeDecisionSource().addAll((Collection<? extends PCNDecisionStep>)newValue);
				return;
			case PcnPackage.PCN_PROCESS_STEP_WITH_TAGS__NON_MONETARY_BENEFITS:
				getNonMonetaryBenefits().clear();
				getNonMonetaryBenefits().addAll((Collection<? extends PCNNonMonetaryBenefit>)newValue);
				return;
			case PcnPackage.PCN_PROCESS_STEP_WITH_TAGS__NON_MONETARY_COSTS:
				getNonMonetaryCosts().clear();
				getNonMonetaryCosts().addAll((Collection<? extends PCNNonMonetaryCost>)newValue);
				return;
			case PcnPackage.PCN_PROCESS_STEP_WITH_TAGS__MONETARY_BENEFITS:
				getMonetaryBenefits().clear();
				getMonetaryBenefits().addAll((Collection<? extends PCNMonetaryBenefit>)newValue);
				return;
			case PcnPackage.PCN_PROCESS_STEP_WITH_TAGS__MONETARY_COSTS:
				getMonetaryCosts().clear();
				getMonetaryCosts().addAll((Collection<? extends PCNMonetaryCost>)newValue);
				return;
			case PcnPackage.PCN_PROCESS_STEP_WITH_TAGS__ACTION:
				setAction((String)newValue);
				return;
			case PcnPackage.PCN_PROCESS_STEP_WITH_TAGS__TEXTUAL_TAGS:
				getTextualTags().clear();
				getTextualTags().addAll((Collection<? extends PCNTextualTag>)newValue);
				return;
			case PcnPackage.PCN_PROCESS_STEP_WITH_TAGS__DELAY_TIME_TAGS:
				setDelayTimeTags((PCNDelayTimeTag)newValue);
				return;
			case PcnPackage.PCN_PROCESS_STEP_WITH_TAGS__PROBABILITIES_TAGS:
				setProbabilitiesTags((PCNProbabilitiesTag)newValue);
				return;
			case PcnPackage.PCN_PROCESS_STEP_WITH_TAGS__SYNC_TAGS:
				setSyncTags((PCNSyncTag)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case PcnPackage.PCN_PROCESS_STEP_WITH_TAGS__TAGS:
				getTags().clear();
				return;
			case PcnPackage.PCN_PROCESS_STEP_WITH_TAGS__PCN_STANDARD_DEPENDENCY_SOURCE:
				getPCNStandardDependencySource().clear();
				return;
			case PcnPackage.PCN_PROCESS_STEP_WITH_TAGS__PCN_DELAYED_DEPENDENCY_SOURCE:
				getPCNDelayedDependencySource().clear();
				return;
			case PcnPackage.PCN_PROCESS_STEP_WITH_TAGS__PCN_POSITIVE_DECISION_SOURCE:
				getPCNPositiveDecisionSource().clear();
				return;
			case PcnPackage.PCN_PROCESS_STEP_WITH_TAGS__PCN_NEGATIVE_DECISION_SOURCE:
				getPCNNegativeDecisionSource().clear();
				return;
			case PcnPackage.PCN_PROCESS_STEP_WITH_TAGS__NON_MONETARY_BENEFITS:
				getNonMonetaryBenefits().clear();
				return;
			case PcnPackage.PCN_PROCESS_STEP_WITH_TAGS__NON_MONETARY_COSTS:
				getNonMonetaryCosts().clear();
				return;
			case PcnPackage.PCN_PROCESS_STEP_WITH_TAGS__MONETARY_BENEFITS:
				getMonetaryBenefits().clear();
				return;
			case PcnPackage.PCN_PROCESS_STEP_WITH_TAGS__MONETARY_COSTS:
				getMonetaryCosts().clear();
				return;
			case PcnPackage.PCN_PROCESS_STEP_WITH_TAGS__ACTION:
				setAction(ACTION_EDEFAULT);
				return;
			case PcnPackage.PCN_PROCESS_STEP_WITH_TAGS__TEXTUAL_TAGS:
				getTextualTags().clear();
				return;
			case PcnPackage.PCN_PROCESS_STEP_WITH_TAGS__DELAY_TIME_TAGS:
				setDelayTimeTags((PCNDelayTimeTag)null);
				return;
			case PcnPackage.PCN_PROCESS_STEP_WITH_TAGS__PROBABILITIES_TAGS:
				setProbabilitiesTags((PCNProbabilitiesTag)null);
				return;
			case PcnPackage.PCN_PROCESS_STEP_WITH_TAGS__SYNC_TAGS:
				setSyncTags((PCNSyncTag)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PcnPackage.PCN_PROCESS_STEP_WITH_TAGS__TAGS:
				return tags != null && !tags.isEmpty();
			case PcnPackage.PCN_PROCESS_STEP_WITH_TAGS__PCN_STANDARD_DEPENDENCY_SOURCE:
				return pcnStandardDependencySource != null && !pcnStandardDependencySource.isEmpty();
			case PcnPackage.PCN_PROCESS_STEP_WITH_TAGS__PCN_DELAYED_DEPENDENCY_SOURCE:
				return pcnDelayedDependencySource != null && !pcnDelayedDependencySource.isEmpty();
			case PcnPackage.PCN_PROCESS_STEP_WITH_TAGS__PCN_POSITIVE_DECISION_SOURCE:
				return pcnPositiveDecisionSource != null && !pcnPositiveDecisionSource.isEmpty();
			case PcnPackage.PCN_PROCESS_STEP_WITH_TAGS__PCN_NEGATIVE_DECISION_SOURCE:
				return pcnNegativeDecisionSource != null && !pcnNegativeDecisionSource.isEmpty();
			case PcnPackage.PCN_PROCESS_STEP_WITH_TAGS__NON_MONETARY_BENEFITS:
				return nonMonetaryBenefits != null && !nonMonetaryBenefits.isEmpty();
			case PcnPackage.PCN_PROCESS_STEP_WITH_TAGS__NON_MONETARY_COSTS:
				return nonMonetaryCosts != null && !nonMonetaryCosts.isEmpty();
			case PcnPackage.PCN_PROCESS_STEP_WITH_TAGS__MONETARY_BENEFITS:
				return monetaryBenefits != null && !monetaryBenefits.isEmpty();
			case PcnPackage.PCN_PROCESS_STEP_WITH_TAGS__MONETARY_COSTS:
				return monetaryCosts != null && !monetaryCosts.isEmpty();
			case PcnPackage.PCN_PROCESS_STEP_WITH_TAGS__ACTION:
				return ACTION_EDEFAULT == null ? action != null : !ACTION_EDEFAULT.equals(action);
			case PcnPackage.PCN_PROCESS_STEP_WITH_TAGS__TEXTUAL_TAGS:
				return textualTags != null && !textualTags.isEmpty();
			case PcnPackage.PCN_PROCESS_STEP_WITH_TAGS__DELAY_TIME_TAGS:
				return delayTimeTags != null;
			case PcnPackage.PCN_PROCESS_STEP_WITH_TAGS__PROBABILITIES_TAGS:
				return probabilitiesTags != null;
			case PcnPackage.PCN_PROCESS_STEP_WITH_TAGS__SYNC_TAGS:
				return syncTags != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (action: ");
		result.append(action);
		result.append(')');
		return result.toString();
	}

} //PCNProcessStepWithTagsImpl
