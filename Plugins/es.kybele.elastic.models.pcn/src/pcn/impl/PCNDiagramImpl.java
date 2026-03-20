/**
 */
package pcn.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import pcn.PCNDiagram;
import pcn.PCNProcessEntity;
import pcn.PcnPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PCN Diagram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pcn.impl.PCNDiagramImpl#getDiagramEntities <em>Diagram Entities</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PCNDiagramImpl extends MinimalEObjectImpl.Container implements PCNDiagram {
	/**
	 * The cached value of the '{@link #getDiagramEntities() <em>Diagram Entities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagramEntities()
	 * @generated
	 * @ordered
	 */
	protected EList<PCNProcessEntity> diagramEntities;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PCNDiagramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PcnPackage.Literals.PCN_DIAGRAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PCNProcessEntity> getDiagramEntities() {
		if (diagramEntities == null) {
			diagramEntities = new EObjectContainmentEList<PCNProcessEntity>(PCNProcessEntity.class, this, PcnPackage.PCN_DIAGRAM__DIAGRAM_ENTITIES);
		}
		return diagramEntities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PcnPackage.PCN_DIAGRAM__DIAGRAM_ENTITIES:
				return ((InternalEList<?>)getDiagramEntities()).basicRemove(otherEnd, msgs);
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
			case PcnPackage.PCN_DIAGRAM__DIAGRAM_ENTITIES:
				return getDiagramEntities();
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
			case PcnPackage.PCN_DIAGRAM__DIAGRAM_ENTITIES:
				getDiagramEntities().clear();
				getDiagramEntities().addAll((Collection<? extends PCNProcessEntity>)newValue);
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
			case PcnPackage.PCN_DIAGRAM__DIAGRAM_ENTITIES:
				getDiagramEntities().clear();
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
			case PcnPackage.PCN_DIAGRAM__DIAGRAM_ENTITIES:
				return diagramEntities != null && !diagramEntities.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PCNDiagramImpl
