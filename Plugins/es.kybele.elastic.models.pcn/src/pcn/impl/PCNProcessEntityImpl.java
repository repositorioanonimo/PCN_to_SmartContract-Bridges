/**
 */
package pcn.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import pcn.PCNProcessEntity;
import pcn.PCNProcessStep;
import pcn.PcnPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PCN Process Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pcn.impl.PCNProcessEntityImpl#getName <em>Name</em>}</li>
 *   <li>{@link pcn.impl.PCNProcessEntityImpl#getOrder <em>Order</em>}</li>
 *   <li>{@link pcn.impl.PCNProcessEntityImpl#getBackEntity <em>Back Entity</em>}</li>
 *   <li>{@link pcn.impl.PCNProcessEntityImpl#getNextEntity <em>Next Entity</em>}</li>
 *   <li>{@link pcn.impl.PCNProcessEntityImpl#getLeftDirectInteractions <em>Left Direct Interactions</em>}</li>
 *   <li>{@link pcn.impl.PCNProcessEntityImpl#getLeftSurrogateInteractions <em>Left Surrogate Interactions</em>}</li>
 *   <li>{@link pcn.impl.PCNProcessEntityImpl#getCenterIndependentInteractionsActivities <em>Center Independent Interactions Activities</em>}</li>
 *   <li>{@link pcn.impl.PCNProcessEntityImpl#getRightSurrogateInteractions <em>Right Surrogate Interactions</em>}</li>
 *   <li>{@link pcn.impl.PCNProcessEntityImpl#getRightDirectInteractions <em>Right Direct Interactions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PCNProcessEntityImpl extends MinimalEObjectImpl.Container implements PCNProcessEntity {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getOrder() <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrder()
	 * @generated
	 * @ordered
	 */
	protected static final int ORDER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getOrder() <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrder()
	 * @generated
	 * @ordered
	 */
	protected int order = ORDER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNextEntity() <em>Next Entity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextEntity()
	 * @generated
	 * @ordered
	 */
	protected PCNProcessEntity nextEntity;

	/**
	 * The cached value of the '{@link #getLeftDirectInteractions() <em>Left Direct Interactions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeftDirectInteractions()
	 * @generated
	 * @ordered
	 */
	protected EList<PCNProcessStep> leftDirectInteractions;

	/**
	 * The cached value of the '{@link #getLeftSurrogateInteractions() <em>Left Surrogate Interactions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeftSurrogateInteractions()
	 * @generated
	 * @ordered
	 */
	protected EList<PCNProcessStep> leftSurrogateInteractions;

	/**
	 * The cached value of the '{@link #getCenterIndependentInteractionsActivities() <em>Center Independent Interactions Activities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCenterIndependentInteractionsActivities()
	 * @generated
	 * @ordered
	 */
	protected EList<PCNProcessStep> centerIndependentInteractionsActivities;

	/**
	 * The cached value of the '{@link #getRightSurrogateInteractions() <em>Right Surrogate Interactions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightSurrogateInteractions()
	 * @generated
	 * @ordered
	 */
	protected EList<PCNProcessStep> rightSurrogateInteractions;

	/**
	 * The cached value of the '{@link #getRightDirectInteractions() <em>Right Direct Interactions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightDirectInteractions()
	 * @generated
	 * @ordered
	 */
	protected EList<PCNProcessStep> rightDirectInteractions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PCNProcessEntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PcnPackage.Literals.PCN_PROCESS_ENTITY;
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
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PcnPackage.PCN_PROCESS_ENTITY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getOrder() {
		return order;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrder(int newOrder) {
		int oldOrder = order;
		order = newOrder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PcnPackage.PCN_PROCESS_ENTITY__ORDER, oldOrder, order));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PCNProcessEntity getBackEntity() {
		if (eContainerFeatureID() != PcnPackage.PCN_PROCESS_ENTITY__BACK_ENTITY) return null;
		return (PCNProcessEntity)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBackEntity(PCNProcessEntity newBackEntity, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newBackEntity, PcnPackage.PCN_PROCESS_ENTITY__BACK_ENTITY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBackEntity(PCNProcessEntity newBackEntity) {
		if (newBackEntity != eInternalContainer() || (eContainerFeatureID() != PcnPackage.PCN_PROCESS_ENTITY__BACK_ENTITY && newBackEntity != null)) {
			if (EcoreUtil.isAncestor(this, newBackEntity))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newBackEntity != null)
				msgs = ((InternalEObject)newBackEntity).eInverseAdd(this, PcnPackage.PCN_PROCESS_ENTITY__NEXT_ENTITY, PCNProcessEntity.class, msgs);
			msgs = basicSetBackEntity(newBackEntity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PcnPackage.PCN_PROCESS_ENTITY__BACK_ENTITY, newBackEntity, newBackEntity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PCNProcessEntity getNextEntity() {
		return nextEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNextEntity(PCNProcessEntity newNextEntity, NotificationChain msgs) {
		PCNProcessEntity oldNextEntity = nextEntity;
		nextEntity = newNextEntity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PcnPackage.PCN_PROCESS_ENTITY__NEXT_ENTITY, oldNextEntity, newNextEntity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNextEntity(PCNProcessEntity newNextEntity) {
		if (newNextEntity != nextEntity) {
			NotificationChain msgs = null;
			if (nextEntity != null)
				msgs = ((InternalEObject)nextEntity).eInverseRemove(this, PcnPackage.PCN_PROCESS_ENTITY__BACK_ENTITY, PCNProcessEntity.class, msgs);
			if (newNextEntity != null)
				msgs = ((InternalEObject)newNextEntity).eInverseAdd(this, PcnPackage.PCN_PROCESS_ENTITY__BACK_ENTITY, PCNProcessEntity.class, msgs);
			msgs = basicSetNextEntity(newNextEntity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PcnPackage.PCN_PROCESS_ENTITY__NEXT_ENTITY, newNextEntity, newNextEntity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PCNProcessStep> getLeftDirectInteractions() {
		if (leftDirectInteractions == null) {
			leftDirectInteractions = new EObjectContainmentEList<PCNProcessStep>(PCNProcessStep.class, this, PcnPackage.PCN_PROCESS_ENTITY__LEFT_DIRECT_INTERACTIONS);
		}
		return leftDirectInteractions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PCNProcessStep> getLeftSurrogateInteractions() {
		if (leftSurrogateInteractions == null) {
			leftSurrogateInteractions = new EObjectContainmentEList<PCNProcessStep>(PCNProcessStep.class, this, PcnPackage.PCN_PROCESS_ENTITY__LEFT_SURROGATE_INTERACTIONS);
		}
		return leftSurrogateInteractions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PCNProcessStep> getCenterIndependentInteractionsActivities() {
		if (centerIndependentInteractionsActivities == null) {
			centerIndependentInteractionsActivities = new EObjectContainmentEList<PCNProcessStep>(PCNProcessStep.class, this, PcnPackage.PCN_PROCESS_ENTITY__CENTER_INDEPENDENT_INTERACTIONS_ACTIVITIES);
		}
		return centerIndependentInteractionsActivities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PCNProcessStep> getRightSurrogateInteractions() {
		if (rightSurrogateInteractions == null) {
			rightSurrogateInteractions = new EObjectContainmentEList<PCNProcessStep>(PCNProcessStep.class, this, PcnPackage.PCN_PROCESS_ENTITY__RIGHT_SURROGATE_INTERACTIONS);
		}
		return rightSurrogateInteractions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PCNProcessStep> getRightDirectInteractions() {
		if (rightDirectInteractions == null) {
			rightDirectInteractions = new EObjectContainmentEList<PCNProcessStep>(PCNProcessStep.class, this, PcnPackage.PCN_PROCESS_ENTITY__RIGHT_DIRECT_INTERACTIONS);
		}
		return rightDirectInteractions;
	}

	/**
	 * The cached invocation delegate for the '{@link #getDirectInteractions() <em>Get Direct Interactions</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirectInteractions()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_DIRECT_INTERACTIONS__EINVOCATION_DELEGATE = ((EOperation.Internal)PcnPackage.Literals.PCN_PROCESS_ENTITY___GET_DIRECT_INTERACTIONS).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<?> getDirectInteractions() {
		try {
			return (EList<?>)GET_DIRECT_INTERACTIONS__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #getSurrogateInteractions() <em>Get Surrogate Interactions</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSurrogateInteractions()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_SURROGATE_INTERACTIONS__EINVOCATION_DELEGATE = ((EOperation.Internal)PcnPackage.Literals.PCN_PROCESS_ENTITY___GET_SURROGATE_INTERACTIONS).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<?> getSurrogateInteractions() {
		try {
			return (EList<?>)GET_SURROGATE_INTERACTIONS__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #getIndependentInteractios() <em>Get Independent Interactios</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndependentInteractios()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_INDEPENDENT_INTERACTIOS__EINVOCATION_DELEGATE = ((EOperation.Internal)PcnPackage.Literals.PCN_PROCESS_ENTITY___GET_INDEPENDENT_INTERACTIOS).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<?> getIndependentInteractios() {
		try {
			return (EList<?>)GET_INDEPENDENT_INTERACTIOS__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PcnPackage.PCN_PROCESS_ENTITY__BACK_ENTITY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetBackEntity((PCNProcessEntity)otherEnd, msgs);
			case PcnPackage.PCN_PROCESS_ENTITY__NEXT_ENTITY:
				if (nextEntity != null)
					msgs = ((InternalEObject)nextEntity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PcnPackage.PCN_PROCESS_ENTITY__NEXT_ENTITY, null, msgs);
				return basicSetNextEntity((PCNProcessEntity)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PcnPackage.PCN_PROCESS_ENTITY__BACK_ENTITY:
				return basicSetBackEntity(null, msgs);
			case PcnPackage.PCN_PROCESS_ENTITY__NEXT_ENTITY:
				return basicSetNextEntity(null, msgs);
			case PcnPackage.PCN_PROCESS_ENTITY__LEFT_DIRECT_INTERACTIONS:
				return ((InternalEList<?>)getLeftDirectInteractions()).basicRemove(otherEnd, msgs);
			case PcnPackage.PCN_PROCESS_ENTITY__LEFT_SURROGATE_INTERACTIONS:
				return ((InternalEList<?>)getLeftSurrogateInteractions()).basicRemove(otherEnd, msgs);
			case PcnPackage.PCN_PROCESS_ENTITY__CENTER_INDEPENDENT_INTERACTIONS_ACTIVITIES:
				return ((InternalEList<?>)getCenterIndependentInteractionsActivities()).basicRemove(otherEnd, msgs);
			case PcnPackage.PCN_PROCESS_ENTITY__RIGHT_SURROGATE_INTERACTIONS:
				return ((InternalEList<?>)getRightSurrogateInteractions()).basicRemove(otherEnd, msgs);
			case PcnPackage.PCN_PROCESS_ENTITY__RIGHT_DIRECT_INTERACTIONS:
				return ((InternalEList<?>)getRightDirectInteractions()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case PcnPackage.PCN_PROCESS_ENTITY__BACK_ENTITY:
				return eInternalContainer().eInverseRemove(this, PcnPackage.PCN_PROCESS_ENTITY__NEXT_ENTITY, PCNProcessEntity.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PcnPackage.PCN_PROCESS_ENTITY__NAME:
				return getName();
			case PcnPackage.PCN_PROCESS_ENTITY__ORDER:
				return getOrder();
			case PcnPackage.PCN_PROCESS_ENTITY__BACK_ENTITY:
				return getBackEntity();
			case PcnPackage.PCN_PROCESS_ENTITY__NEXT_ENTITY:
				return getNextEntity();
			case PcnPackage.PCN_PROCESS_ENTITY__LEFT_DIRECT_INTERACTIONS:
				return getLeftDirectInteractions();
			case PcnPackage.PCN_PROCESS_ENTITY__LEFT_SURROGATE_INTERACTIONS:
				return getLeftSurrogateInteractions();
			case PcnPackage.PCN_PROCESS_ENTITY__CENTER_INDEPENDENT_INTERACTIONS_ACTIVITIES:
				return getCenterIndependentInteractionsActivities();
			case PcnPackage.PCN_PROCESS_ENTITY__RIGHT_SURROGATE_INTERACTIONS:
				return getRightSurrogateInteractions();
			case PcnPackage.PCN_PROCESS_ENTITY__RIGHT_DIRECT_INTERACTIONS:
				return getRightDirectInteractions();
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
			case PcnPackage.PCN_PROCESS_ENTITY__NAME:
				setName((String)newValue);
				return;
			case PcnPackage.PCN_PROCESS_ENTITY__ORDER:
				setOrder((Integer)newValue);
				return;
			case PcnPackage.PCN_PROCESS_ENTITY__BACK_ENTITY:
				setBackEntity((PCNProcessEntity)newValue);
				return;
			case PcnPackage.PCN_PROCESS_ENTITY__NEXT_ENTITY:
				setNextEntity((PCNProcessEntity)newValue);
				return;
			case PcnPackage.PCN_PROCESS_ENTITY__LEFT_DIRECT_INTERACTIONS:
				getLeftDirectInteractions().clear();
				getLeftDirectInteractions().addAll((Collection<? extends PCNProcessStep>)newValue);
				return;
			case PcnPackage.PCN_PROCESS_ENTITY__LEFT_SURROGATE_INTERACTIONS:
				getLeftSurrogateInteractions().clear();
				getLeftSurrogateInteractions().addAll((Collection<? extends PCNProcessStep>)newValue);
				return;
			case PcnPackage.PCN_PROCESS_ENTITY__CENTER_INDEPENDENT_INTERACTIONS_ACTIVITIES:
				getCenterIndependentInteractionsActivities().clear();
				getCenterIndependentInteractionsActivities().addAll((Collection<? extends PCNProcessStep>)newValue);
				return;
			case PcnPackage.PCN_PROCESS_ENTITY__RIGHT_SURROGATE_INTERACTIONS:
				getRightSurrogateInteractions().clear();
				getRightSurrogateInteractions().addAll((Collection<? extends PCNProcessStep>)newValue);
				return;
			case PcnPackage.PCN_PROCESS_ENTITY__RIGHT_DIRECT_INTERACTIONS:
				getRightDirectInteractions().clear();
				getRightDirectInteractions().addAll((Collection<? extends PCNProcessStep>)newValue);
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
			case PcnPackage.PCN_PROCESS_ENTITY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PcnPackage.PCN_PROCESS_ENTITY__ORDER:
				setOrder(ORDER_EDEFAULT);
				return;
			case PcnPackage.PCN_PROCESS_ENTITY__BACK_ENTITY:
				setBackEntity((PCNProcessEntity)null);
				return;
			case PcnPackage.PCN_PROCESS_ENTITY__NEXT_ENTITY:
				setNextEntity((PCNProcessEntity)null);
				return;
			case PcnPackage.PCN_PROCESS_ENTITY__LEFT_DIRECT_INTERACTIONS:
				getLeftDirectInteractions().clear();
				return;
			case PcnPackage.PCN_PROCESS_ENTITY__LEFT_SURROGATE_INTERACTIONS:
				getLeftSurrogateInteractions().clear();
				return;
			case PcnPackage.PCN_PROCESS_ENTITY__CENTER_INDEPENDENT_INTERACTIONS_ACTIVITIES:
				getCenterIndependentInteractionsActivities().clear();
				return;
			case PcnPackage.PCN_PROCESS_ENTITY__RIGHT_SURROGATE_INTERACTIONS:
				getRightSurrogateInteractions().clear();
				return;
			case PcnPackage.PCN_PROCESS_ENTITY__RIGHT_DIRECT_INTERACTIONS:
				getRightDirectInteractions().clear();
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
			case PcnPackage.PCN_PROCESS_ENTITY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PcnPackage.PCN_PROCESS_ENTITY__ORDER:
				return order != ORDER_EDEFAULT;
			case PcnPackage.PCN_PROCESS_ENTITY__BACK_ENTITY:
				return getBackEntity() != null;
			case PcnPackage.PCN_PROCESS_ENTITY__NEXT_ENTITY:
				return nextEntity != null;
			case PcnPackage.PCN_PROCESS_ENTITY__LEFT_DIRECT_INTERACTIONS:
				return leftDirectInteractions != null && !leftDirectInteractions.isEmpty();
			case PcnPackage.PCN_PROCESS_ENTITY__LEFT_SURROGATE_INTERACTIONS:
				return leftSurrogateInteractions != null && !leftSurrogateInteractions.isEmpty();
			case PcnPackage.PCN_PROCESS_ENTITY__CENTER_INDEPENDENT_INTERACTIONS_ACTIVITIES:
				return centerIndependentInteractionsActivities != null && !centerIndependentInteractionsActivities.isEmpty();
			case PcnPackage.PCN_PROCESS_ENTITY__RIGHT_SURROGATE_INTERACTIONS:
				return rightSurrogateInteractions != null && !rightSurrogateInteractions.isEmpty();
			case PcnPackage.PCN_PROCESS_ENTITY__RIGHT_DIRECT_INTERACTIONS:
				return rightDirectInteractions != null && !rightDirectInteractions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case PcnPackage.PCN_PROCESS_ENTITY___GET_DIRECT_INTERACTIONS:
				return getDirectInteractions();
			case PcnPackage.PCN_PROCESS_ENTITY___GET_SURROGATE_INTERACTIONS:
				return getSurrogateInteractions();
			case PcnPackage.PCN_PROCESS_ENTITY___GET_INDEPENDENT_INTERACTIOS:
				return getIndependentInteractios();
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", order: ");
		result.append(order);
		result.append(')');
		return result.toString();
	}

} //PCNProcessEntityImpl
