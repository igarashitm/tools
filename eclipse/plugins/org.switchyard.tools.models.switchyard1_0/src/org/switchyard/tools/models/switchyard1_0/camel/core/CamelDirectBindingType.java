/**
 */
package org.switchyard.tools.models.switchyard1_0.camel.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Direct Binding Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.core.CamelDirectBindingType#getNameElement <em>Name Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.camel.core.CorePackage#getCamelDirectBindingType()
 * @model extendedMetaData="name='CamelDirectBindingType' kind='elementOnly'"
 * @generated
 */
public interface CamelDirectBindingType extends BaseCamelBinding {
    /**
     * Returns the value of the '<em><b>Name Element</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Name Element</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Name Element</em>' attribute.
     * @see #setNameElement(String)
     * @see org.switchyard.tools.models.switchyard1_0.camel.core.CorePackage#getCamelDirectBindingType_NameElement()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
     *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
     * @generated
     */
    String getNameElement();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.core.CamelDirectBindingType#getNameElement <em>Name Element</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name Element</em>' attribute.
     * @see #getNameElement()
     * @generated
     */
    void setNameElement(String value);

} // CamelDirectBindingType