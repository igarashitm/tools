/**
 */
package org.switchyard.tools.models.switchyard1_0.camel.amqp;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.switchyard.tools.models.switchyard1_0.camel.amqp.AmqpFactory
 * @model kind="package"
 * @generated
 */
public interface AmqpPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "amqp";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "urn:switchyard-component-camel-amqp:config:1.0";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "amqp";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    AmqpPackage eINSTANCE = org.switchyard.tools.models.switchyard1_0.camel.amqp.impl.AmqpPackageImpl.init();

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.camel.amqp.impl.BaseCamelBindingImpl <em>Base Camel Binding</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.camel.amqp.impl.BaseCamelBindingImpl
     * @see org.switchyard.tools.models.switchyard1_0.camel.amqp.impl.AmqpPackageImpl#getBaseCamelBinding()
     * @generated
     */
    int BASE_CAMEL_BINDING = 0;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASE_CAMEL_BINDING__DOCUMENTATION = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASE_CAMEL_BINDING__ANY_ATTRIBUTE = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Wire Format Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASE_CAMEL_BINDING__WIRE_FORMAT_GROUP = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__WIRE_FORMAT_GROUP;

    /**
     * The feature id for the '<em><b>Wire Format</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASE_CAMEL_BINDING__WIRE_FORMAT = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__WIRE_FORMAT;

    /**
     * The feature id for the '<em><b>Operation Selector Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASE_CAMEL_BINDING__OPERATION_SELECTOR_GROUP = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__OPERATION_SELECTOR_GROUP;

    /**
     * The feature id for the '<em><b>Operation Selector</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASE_CAMEL_BINDING__OPERATION_SELECTOR = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__OPERATION_SELECTOR;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASE_CAMEL_BINDING__NAME = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__NAME;

    /**
     * The feature id for the '<em><b>Policy Sets</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASE_CAMEL_BINDING__POLICY_SETS = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__POLICY_SETS;

    /**
     * The feature id for the '<em><b>Requires</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASE_CAMEL_BINDING__REQUIRES = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__REQUIRES;

    /**
     * The feature id for the '<em><b>Uri</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASE_CAMEL_BINDING__URI = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__URI;

    /**
     * The feature id for the '<em><b>Context Mapper</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASE_CAMEL_BINDING__CONTEXT_MAPPER = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__CONTEXT_MAPPER;

    /**
     * The feature id for the '<em><b>Message Composer</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASE_CAMEL_BINDING__MESSAGE_COMPOSER = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__MESSAGE_COMPOSER;

    /**
     * The feature id for the '<em><b>Camel Context Mapper</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASE_CAMEL_BINDING__CAMEL_CONTEXT_MAPPER = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Camel Message Composer</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASE_CAMEL_BINDING__CAMEL_MESSAGE_COMPOSER = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Base Camel Binding</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASE_CAMEL_BINDING_FEATURE_COUNT = SwitchyardPackage.SWITCH_YARD_BINDING_TYPE_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.camel.amqp.impl.CamelAmqpBindingTypeImpl <em>Camel Amqp Binding Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.camel.amqp.impl.CamelAmqpBindingTypeImpl
     * @see org.switchyard.tools.models.switchyard1_0.camel.amqp.impl.AmqpPackageImpl#getCamelAmqpBindingType()
     * @generated
     */
    int CAMEL_AMQP_BINDING_TYPE = 1;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_AMQP_BINDING_TYPE__DOCUMENTATION = BASE_CAMEL_BINDING__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_AMQP_BINDING_TYPE__ANY_ATTRIBUTE = BASE_CAMEL_BINDING__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Wire Format Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_AMQP_BINDING_TYPE__WIRE_FORMAT_GROUP = BASE_CAMEL_BINDING__WIRE_FORMAT_GROUP;

    /**
     * The feature id for the '<em><b>Wire Format</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_AMQP_BINDING_TYPE__WIRE_FORMAT = BASE_CAMEL_BINDING__WIRE_FORMAT;

    /**
     * The feature id for the '<em><b>Operation Selector Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_AMQP_BINDING_TYPE__OPERATION_SELECTOR_GROUP = BASE_CAMEL_BINDING__OPERATION_SELECTOR_GROUP;

    /**
     * The feature id for the '<em><b>Operation Selector</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_AMQP_BINDING_TYPE__OPERATION_SELECTOR = BASE_CAMEL_BINDING__OPERATION_SELECTOR;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_AMQP_BINDING_TYPE__NAME = BASE_CAMEL_BINDING__NAME;

    /**
     * The feature id for the '<em><b>Policy Sets</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_AMQP_BINDING_TYPE__POLICY_SETS = BASE_CAMEL_BINDING__POLICY_SETS;

    /**
     * The feature id for the '<em><b>Requires</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_AMQP_BINDING_TYPE__REQUIRES = BASE_CAMEL_BINDING__REQUIRES;

    /**
     * The feature id for the '<em><b>Uri</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_AMQP_BINDING_TYPE__URI = BASE_CAMEL_BINDING__URI;

    /**
     * The feature id for the '<em><b>Context Mapper</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_AMQP_BINDING_TYPE__CONTEXT_MAPPER = BASE_CAMEL_BINDING__CONTEXT_MAPPER;

    /**
     * The feature id for the '<em><b>Message Composer</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_AMQP_BINDING_TYPE__MESSAGE_COMPOSER = BASE_CAMEL_BINDING__MESSAGE_COMPOSER;

    /**
     * The feature id for the '<em><b>Camel Context Mapper</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_AMQP_BINDING_TYPE__CAMEL_CONTEXT_MAPPER = BASE_CAMEL_BINDING__CAMEL_CONTEXT_MAPPER;

    /**
     * The feature id for the '<em><b>Camel Message Composer</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_AMQP_BINDING_TYPE__CAMEL_MESSAGE_COMPOSER = BASE_CAMEL_BINDING__CAMEL_MESSAGE_COMPOSER;

    /**
     * The feature id for the '<em><b>Queue</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_AMQP_BINDING_TYPE__QUEUE = BASE_CAMEL_BINDING_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Topic</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_AMQP_BINDING_TYPE__TOPIC = BASE_CAMEL_BINDING_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Connection Factory</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_AMQP_BINDING_TYPE__CONNECTION_FACTORY = BASE_CAMEL_BINDING_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Username</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_AMQP_BINDING_TYPE__USERNAME = BASE_CAMEL_BINDING_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Password</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_AMQP_BINDING_TYPE__PASSWORD = BASE_CAMEL_BINDING_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Client Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_AMQP_BINDING_TYPE__CLIENT_ID = BASE_CAMEL_BINDING_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Durable Subscription Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_AMQP_BINDING_TYPE__DURABLE_SUBSCRIPTION_NAME = BASE_CAMEL_BINDING_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Concurrent Consumers</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_AMQP_BINDING_TYPE__CONCURRENT_CONSUMERS = BASE_CAMEL_BINDING_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Max Concurrent Consumers</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_AMQP_BINDING_TYPE__MAX_CONCURRENT_CONSUMERS = BASE_CAMEL_BINDING_FEATURE_COUNT + 8;

    /**
     * The feature id for the '<em><b>Disable Reply To</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_AMQP_BINDING_TYPE__DISABLE_REPLY_TO = BASE_CAMEL_BINDING_FEATURE_COUNT + 9;

    /**
     * The feature id for the '<em><b>Preserve Message Qos</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_AMQP_BINDING_TYPE__PRESERVE_MESSAGE_QOS = BASE_CAMEL_BINDING_FEATURE_COUNT + 10;

    /**
     * The feature id for the '<em><b>Delivery Persistent</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_AMQP_BINDING_TYPE__DELIVERY_PERSISTENT = BASE_CAMEL_BINDING_FEATURE_COUNT + 11;

    /**
     * The feature id for the '<em><b>Priority</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_AMQP_BINDING_TYPE__PRIORITY = BASE_CAMEL_BINDING_FEATURE_COUNT + 12;

    /**
     * The feature id for the '<em><b>Explicit Qos Enabled</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_AMQP_BINDING_TYPE__EXPLICIT_QOS_ENABLED = BASE_CAMEL_BINDING_FEATURE_COUNT + 13;

    /**
     * The feature id for the '<em><b>Reply To</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_AMQP_BINDING_TYPE__REPLY_TO = BASE_CAMEL_BINDING_FEATURE_COUNT + 14;

    /**
     * The feature id for the '<em><b>Reply To Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_AMQP_BINDING_TYPE__REPLY_TO_TYPE = BASE_CAMEL_BINDING_FEATURE_COUNT + 15;

    /**
     * The feature id for the '<em><b>Request Timeout</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_AMQP_BINDING_TYPE__REQUEST_TIMEOUT = BASE_CAMEL_BINDING_FEATURE_COUNT + 16;

    /**
     * The feature id for the '<em><b>Selector</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_AMQP_BINDING_TYPE__SELECTOR = BASE_CAMEL_BINDING_FEATURE_COUNT + 17;

    /**
     * The feature id for the '<em><b>Time To Live</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_AMQP_BINDING_TYPE__TIME_TO_LIVE = BASE_CAMEL_BINDING_FEATURE_COUNT + 18;

    /**
     * The feature id for the '<em><b>Transacted</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_AMQP_BINDING_TYPE__TRANSACTED = BASE_CAMEL_BINDING_FEATURE_COUNT + 19;

    /**
     * The feature id for the '<em><b>Transaction Manager</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_AMQP_BINDING_TYPE__TRANSACTION_MANAGER = BASE_CAMEL_BINDING_FEATURE_COUNT + 20;

    /**
     * The number of structural features of the '<em>Camel Amqp Binding Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAMEL_AMQP_BINDING_TYPE_FEATURE_COUNT = BASE_CAMEL_BINDING_FEATURE_COUNT + 21;

    /**
     * The meta object id for the '{@link org.switchyard.tools.models.switchyard1_0.camel.amqp.impl.DocumentRootImpl <em>Document Root</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.switchyard.tools.models.switchyard1_0.camel.amqp.impl.DocumentRootImpl
     * @see org.switchyard.tools.models.switchyard1_0.camel.amqp.impl.AmqpPackageImpl#getDocumentRoot()
     * @generated
     */
    int DOCUMENT_ROOT = 2;

    /**
     * The feature id for the '<em><b>Mixed</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__MIXED = 0;

    /**
     * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

    /**
     * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

    /**
     * The feature id for the '<em><b>Binding Amqp</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__BINDING_AMQP = 3;

    /**
     * The number of structural features of the '<em>Document Root</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT_FEATURE_COUNT = 4;


    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.camel.amqp.BaseCamelBinding <em>Base Camel Binding</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Base Camel Binding</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.amqp.BaseCamelBinding
     * @generated
     */
    EClass getBaseCamelBinding();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.camel.amqp.BaseCamelBinding#getCamelContextMapper <em>Camel Context Mapper</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Camel Context Mapper</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.amqp.BaseCamelBinding#getCamelContextMapper()
     * @see #getBaseCamelBinding()
     * @generated
     */
    EReference getBaseCamelBinding_CamelContextMapper();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.camel.amqp.BaseCamelBinding#getCamelMessageComposer <em>Camel Message Composer</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Camel Message Composer</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.amqp.BaseCamelBinding#getCamelMessageComposer()
     * @see #getBaseCamelBinding()
     * @generated
     */
    EReference getBaseCamelBinding_CamelMessageComposer();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.camel.amqp.CamelAmqpBindingType <em>Camel Amqp Binding Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Camel Amqp Binding Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.amqp.CamelAmqpBindingType
     * @generated
     */
    EClass getCamelAmqpBindingType();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.amqp.CamelAmqpBindingType#getQueue <em>Queue</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Queue</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.amqp.CamelAmqpBindingType#getQueue()
     * @see #getCamelAmqpBindingType()
     * @generated
     */
    EAttribute getCamelAmqpBindingType_Queue();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.amqp.CamelAmqpBindingType#getTopic <em>Topic</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Topic</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.amqp.CamelAmqpBindingType#getTopic()
     * @see #getCamelAmqpBindingType()
     * @generated
     */
    EAttribute getCamelAmqpBindingType_Topic();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.amqp.CamelAmqpBindingType#getConnectionFactory <em>Connection Factory</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Connection Factory</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.amqp.CamelAmqpBindingType#getConnectionFactory()
     * @see #getCamelAmqpBindingType()
     * @generated
     */
    EAttribute getCamelAmqpBindingType_ConnectionFactory();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.amqp.CamelAmqpBindingType#getUsername <em>Username</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Username</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.amqp.CamelAmqpBindingType#getUsername()
     * @see #getCamelAmqpBindingType()
     * @generated
     */
    EAttribute getCamelAmqpBindingType_Username();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.amqp.CamelAmqpBindingType#getPassword <em>Password</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Password</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.amqp.CamelAmqpBindingType#getPassword()
     * @see #getCamelAmqpBindingType()
     * @generated
     */
    EAttribute getCamelAmqpBindingType_Password();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.amqp.CamelAmqpBindingType#getClientId <em>Client Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Client Id</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.amqp.CamelAmqpBindingType#getClientId()
     * @see #getCamelAmqpBindingType()
     * @generated
     */
    EAttribute getCamelAmqpBindingType_ClientId();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.amqp.CamelAmqpBindingType#getDurableSubscriptionName <em>Durable Subscription Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Durable Subscription Name</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.amqp.CamelAmqpBindingType#getDurableSubscriptionName()
     * @see #getCamelAmqpBindingType()
     * @generated
     */
    EAttribute getCamelAmqpBindingType_DurableSubscriptionName();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.amqp.CamelAmqpBindingType#getConcurrentConsumers <em>Concurrent Consumers</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Concurrent Consumers</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.amqp.CamelAmqpBindingType#getConcurrentConsumers()
     * @see #getCamelAmqpBindingType()
     * @generated
     */
    EAttribute getCamelAmqpBindingType_ConcurrentConsumers();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.amqp.CamelAmqpBindingType#getMaxConcurrentConsumers <em>Max Concurrent Consumers</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Max Concurrent Consumers</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.amqp.CamelAmqpBindingType#getMaxConcurrentConsumers()
     * @see #getCamelAmqpBindingType()
     * @generated
     */
    EAttribute getCamelAmqpBindingType_MaxConcurrentConsumers();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.amqp.CamelAmqpBindingType#isDisableReplyTo <em>Disable Reply To</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Disable Reply To</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.amqp.CamelAmqpBindingType#isDisableReplyTo()
     * @see #getCamelAmqpBindingType()
     * @generated
     */
    EAttribute getCamelAmqpBindingType_DisableReplyTo();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.amqp.CamelAmqpBindingType#isPreserveMessageQos <em>Preserve Message Qos</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Preserve Message Qos</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.amqp.CamelAmqpBindingType#isPreserveMessageQos()
     * @see #getCamelAmqpBindingType()
     * @generated
     */
    EAttribute getCamelAmqpBindingType_PreserveMessageQos();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.amqp.CamelAmqpBindingType#isDeliveryPersistent <em>Delivery Persistent</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Delivery Persistent</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.amqp.CamelAmqpBindingType#isDeliveryPersistent()
     * @see #getCamelAmqpBindingType()
     * @generated
     */
    EAttribute getCamelAmqpBindingType_DeliveryPersistent();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.amqp.CamelAmqpBindingType#getPriority <em>Priority</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Priority</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.amqp.CamelAmqpBindingType#getPriority()
     * @see #getCamelAmqpBindingType()
     * @generated
     */
    EAttribute getCamelAmqpBindingType_Priority();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.amqp.CamelAmqpBindingType#isExplicitQosEnabled <em>Explicit Qos Enabled</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Explicit Qos Enabled</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.amqp.CamelAmqpBindingType#isExplicitQosEnabled()
     * @see #getCamelAmqpBindingType()
     * @generated
     */
    EAttribute getCamelAmqpBindingType_ExplicitQosEnabled();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.amqp.CamelAmqpBindingType#getReplyTo <em>Reply To</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Reply To</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.amqp.CamelAmqpBindingType#getReplyTo()
     * @see #getCamelAmqpBindingType()
     * @generated
     */
    EAttribute getCamelAmqpBindingType_ReplyTo();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.amqp.CamelAmqpBindingType#getReplyToType <em>Reply To Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Reply To Type</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.amqp.CamelAmqpBindingType#getReplyToType()
     * @see #getCamelAmqpBindingType()
     * @generated
     */
    EAttribute getCamelAmqpBindingType_ReplyToType();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.amqp.CamelAmqpBindingType#getRequestTimeout <em>Request Timeout</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Request Timeout</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.amqp.CamelAmqpBindingType#getRequestTimeout()
     * @see #getCamelAmqpBindingType()
     * @generated
     */
    EAttribute getCamelAmqpBindingType_RequestTimeout();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.amqp.CamelAmqpBindingType#getSelector <em>Selector</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Selector</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.amqp.CamelAmqpBindingType#getSelector()
     * @see #getCamelAmqpBindingType()
     * @generated
     */
    EAttribute getCamelAmqpBindingType_Selector();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.amqp.CamelAmqpBindingType#getTimeToLive <em>Time To Live</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Time To Live</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.amqp.CamelAmqpBindingType#getTimeToLive()
     * @see #getCamelAmqpBindingType()
     * @generated
     */
    EAttribute getCamelAmqpBindingType_TimeToLive();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.amqp.CamelAmqpBindingType#isTransacted <em>Transacted</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Transacted</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.amqp.CamelAmqpBindingType#isTransacted()
     * @see #getCamelAmqpBindingType()
     * @generated
     */
    EAttribute getCamelAmqpBindingType_Transacted();

    /**
     * Returns the meta object for the attribute '{@link org.switchyard.tools.models.switchyard1_0.camel.amqp.CamelAmqpBindingType#getTransactionManager <em>Transaction Manager</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Transaction Manager</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.amqp.CamelAmqpBindingType#getTransactionManager()
     * @see #getCamelAmqpBindingType()
     * @generated
     */
    EAttribute getCamelAmqpBindingType_TransactionManager();

    /**
     * Returns the meta object for class '{@link org.switchyard.tools.models.switchyard1_0.camel.amqp.DocumentRoot <em>Document Root</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Document Root</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.amqp.DocumentRoot
     * @generated
     */
    EClass getDocumentRoot();

    /**
     * Returns the meta object for the attribute list '{@link org.switchyard.tools.models.switchyard1_0.camel.amqp.DocumentRoot#getMixed <em>Mixed</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Mixed</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.amqp.DocumentRoot#getMixed()
     * @see #getDocumentRoot()
     * @generated
     */
    EAttribute getDocumentRoot_Mixed();

    /**
     * Returns the meta object for the map '{@link org.switchyard.tools.models.switchyard1_0.camel.amqp.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.amqp.DocumentRoot#getXMLNSPrefixMap()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_XMLNSPrefixMap();

    /**
     * Returns the meta object for the map '{@link org.switchyard.tools.models.switchyard1_0.camel.amqp.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the map '<em>XSI Schema Location</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.amqp.DocumentRoot#getXSISchemaLocation()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_XSISchemaLocation();

    /**
     * Returns the meta object for the containment reference '{@link org.switchyard.tools.models.switchyard1_0.camel.amqp.DocumentRoot#getBindingAmqp <em>Binding Amqp</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Binding Amqp</em>'.
     * @see org.switchyard.tools.models.switchyard1_0.camel.amqp.DocumentRoot#getBindingAmqp()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_BindingAmqp();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    AmqpFactory getAmqpFactory();

    /**
     * <!-- begin-user-doc -->
     * Defines literals for the meta objects that represent
     * <ul>
     *   <li>each class,</li>
     *   <li>each feature of each class,</li>
     *   <li>each enum,</li>
     *   <li>and each data type</li>
     * </ul>
     * <!-- end-user-doc -->
     * @generated
     */
    interface Literals {
        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.camel.amqp.impl.BaseCamelBindingImpl <em>Base Camel Binding</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.camel.amqp.impl.BaseCamelBindingImpl
         * @see org.switchyard.tools.models.switchyard1_0.camel.amqp.impl.AmqpPackageImpl#getBaseCamelBinding()
         * @generated
         */
        EClass BASE_CAMEL_BINDING = eINSTANCE.getBaseCamelBinding();

        /**
         * The meta object literal for the '<em><b>Camel Context Mapper</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference BASE_CAMEL_BINDING__CAMEL_CONTEXT_MAPPER = eINSTANCE.getBaseCamelBinding_CamelContextMapper();

        /**
         * The meta object literal for the '<em><b>Camel Message Composer</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference BASE_CAMEL_BINDING__CAMEL_MESSAGE_COMPOSER = eINSTANCE.getBaseCamelBinding_CamelMessageComposer();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.camel.amqp.impl.CamelAmqpBindingTypeImpl <em>Camel Amqp Binding Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.camel.amqp.impl.CamelAmqpBindingTypeImpl
         * @see org.switchyard.tools.models.switchyard1_0.camel.amqp.impl.AmqpPackageImpl#getCamelAmqpBindingType()
         * @generated
         */
        EClass CAMEL_AMQP_BINDING_TYPE = eINSTANCE.getCamelAmqpBindingType();

        /**
         * The meta object literal for the '<em><b>Queue</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_AMQP_BINDING_TYPE__QUEUE = eINSTANCE.getCamelAmqpBindingType_Queue();

        /**
         * The meta object literal for the '<em><b>Topic</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_AMQP_BINDING_TYPE__TOPIC = eINSTANCE.getCamelAmqpBindingType_Topic();

        /**
         * The meta object literal for the '<em><b>Connection Factory</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_AMQP_BINDING_TYPE__CONNECTION_FACTORY = eINSTANCE.getCamelAmqpBindingType_ConnectionFactory();

        /**
         * The meta object literal for the '<em><b>Username</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_AMQP_BINDING_TYPE__USERNAME = eINSTANCE.getCamelAmqpBindingType_Username();

        /**
         * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_AMQP_BINDING_TYPE__PASSWORD = eINSTANCE.getCamelAmqpBindingType_Password();

        /**
         * The meta object literal for the '<em><b>Client Id</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_AMQP_BINDING_TYPE__CLIENT_ID = eINSTANCE.getCamelAmqpBindingType_ClientId();

        /**
         * The meta object literal for the '<em><b>Durable Subscription Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_AMQP_BINDING_TYPE__DURABLE_SUBSCRIPTION_NAME = eINSTANCE.getCamelAmqpBindingType_DurableSubscriptionName();

        /**
         * The meta object literal for the '<em><b>Concurrent Consumers</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_AMQP_BINDING_TYPE__CONCURRENT_CONSUMERS = eINSTANCE.getCamelAmqpBindingType_ConcurrentConsumers();

        /**
         * The meta object literal for the '<em><b>Max Concurrent Consumers</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_AMQP_BINDING_TYPE__MAX_CONCURRENT_CONSUMERS = eINSTANCE.getCamelAmqpBindingType_MaxConcurrentConsumers();

        /**
         * The meta object literal for the '<em><b>Disable Reply To</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_AMQP_BINDING_TYPE__DISABLE_REPLY_TO = eINSTANCE.getCamelAmqpBindingType_DisableReplyTo();

        /**
         * The meta object literal for the '<em><b>Preserve Message Qos</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_AMQP_BINDING_TYPE__PRESERVE_MESSAGE_QOS = eINSTANCE.getCamelAmqpBindingType_PreserveMessageQos();

        /**
         * The meta object literal for the '<em><b>Delivery Persistent</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_AMQP_BINDING_TYPE__DELIVERY_PERSISTENT = eINSTANCE.getCamelAmqpBindingType_DeliveryPersistent();

        /**
         * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_AMQP_BINDING_TYPE__PRIORITY = eINSTANCE.getCamelAmqpBindingType_Priority();

        /**
         * The meta object literal for the '<em><b>Explicit Qos Enabled</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_AMQP_BINDING_TYPE__EXPLICIT_QOS_ENABLED = eINSTANCE.getCamelAmqpBindingType_ExplicitQosEnabled();

        /**
         * The meta object literal for the '<em><b>Reply To</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_AMQP_BINDING_TYPE__REPLY_TO = eINSTANCE.getCamelAmqpBindingType_ReplyTo();

        /**
         * The meta object literal for the '<em><b>Reply To Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_AMQP_BINDING_TYPE__REPLY_TO_TYPE = eINSTANCE.getCamelAmqpBindingType_ReplyToType();

        /**
         * The meta object literal for the '<em><b>Request Timeout</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_AMQP_BINDING_TYPE__REQUEST_TIMEOUT = eINSTANCE.getCamelAmqpBindingType_RequestTimeout();

        /**
         * The meta object literal for the '<em><b>Selector</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_AMQP_BINDING_TYPE__SELECTOR = eINSTANCE.getCamelAmqpBindingType_Selector();

        /**
         * The meta object literal for the '<em><b>Time To Live</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_AMQP_BINDING_TYPE__TIME_TO_LIVE = eINSTANCE.getCamelAmqpBindingType_TimeToLive();

        /**
         * The meta object literal for the '<em><b>Transacted</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_AMQP_BINDING_TYPE__TRANSACTED = eINSTANCE.getCamelAmqpBindingType_Transacted();

        /**
         * The meta object literal for the '<em><b>Transaction Manager</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CAMEL_AMQP_BINDING_TYPE__TRANSACTION_MANAGER = eINSTANCE.getCamelAmqpBindingType_TransactionManager();

        /**
         * The meta object literal for the '{@link org.switchyard.tools.models.switchyard1_0.camel.amqp.impl.DocumentRootImpl <em>Document Root</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.switchyard.tools.models.switchyard1_0.camel.amqp.impl.DocumentRootImpl
         * @see org.switchyard.tools.models.switchyard1_0.camel.amqp.impl.AmqpPackageImpl#getDocumentRoot()
         * @generated
         */
        EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

        /**
         * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

        /**
         * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

        /**
         * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

        /**
         * The meta object literal for the '<em><b>Binding Amqp</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__BINDING_AMQP = eINSTANCE.getDocumentRoot_BindingAmqp();

    }

} //AmqpPackage
