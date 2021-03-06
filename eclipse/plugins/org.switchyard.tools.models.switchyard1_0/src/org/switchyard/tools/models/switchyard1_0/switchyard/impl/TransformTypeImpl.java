/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.switchyard.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardPackage;
import org.switchyard.tools.models.switchyard1_0.switchyard.TransformType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transform Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.switchyard.impl.TransformTypeImpl#getFrom <em>From</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.switchyard.impl.TransformTypeImpl#getTo <em>To</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class TransformTypeImpl extends EObjectImpl implements TransformType {
	/**
     * The default value of the '{@link #getFrom() <em>From</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getFrom()
     * @generated
     * @ordered
     */
	protected static final String FROM_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getFrom() <em>From</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getFrom()
     * @generated
     * @ordered
     */
	protected String from = FROM_EDEFAULT;

	/**
     * The default value of the '{@link #getTo() <em>To</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getTo()
     * @generated
     * @ordered
     */
	protected static final String TO_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getTo() <em>To</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getTo()
     * @generated
     * @ordered
     */
	protected String to = TO_EDEFAULT;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected TransformTypeImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return SwitchyardPackage.Literals.TRANSFORM_TYPE;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getFrom() {
        return from;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setFrom(String newFrom) {
        String oldFrom = from;
        from = newFrom;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SwitchyardPackage.TRANSFORM_TYPE__FROM, oldFrom, from));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getTo() {
        return to;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setTo(String newTo) {
        String oldTo = to;
        to = newTo;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SwitchyardPackage.TRANSFORM_TYPE__TO, oldTo, to));
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case SwitchyardPackage.TRANSFORM_TYPE__FROM:
                return getFrom();
            case SwitchyardPackage.TRANSFORM_TYPE__TO:
                return getTo();
        }
        return super.eGet(featureID, resolve, coreType);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case SwitchyardPackage.TRANSFORM_TYPE__FROM:
                setFrom((String)newValue);
                return;
            case SwitchyardPackage.TRANSFORM_TYPE__TO:
                setTo((String)newValue);
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
            case SwitchyardPackage.TRANSFORM_TYPE__FROM:
                setFrom(FROM_EDEFAULT);
                return;
            case SwitchyardPackage.TRANSFORM_TYPE__TO:
                setTo(TO_EDEFAULT);
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
            case SwitchyardPackage.TRANSFORM_TYPE__FROM:
                return FROM_EDEFAULT == null ? from != null : !FROM_EDEFAULT.equals(from);
            case SwitchyardPackage.TRANSFORM_TYPE__TO:
                return TO_EDEFAULT == null ? to != null : !TO_EDEFAULT.equals(to);
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
        result.append(" (from: ");
        result.append(from);
        result.append(", to: ");
        result.append(to);
        result.append(')');
        return result.toString();
    }

} //TransformTypeImpl
