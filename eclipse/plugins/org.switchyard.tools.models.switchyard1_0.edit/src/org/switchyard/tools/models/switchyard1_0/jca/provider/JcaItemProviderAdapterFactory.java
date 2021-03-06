/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.jca.provider;

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

import org.switchyard.tools.models.switchyard1_0.jca.util.JcaAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class JcaItemProviderAdapterFactory extends JcaAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
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
    public JcaItemProviderAdapterFactory() {
        supportedTypes.add(IEditingDomainItemProvider.class);
        supportedTypes.add(IStructuredItemContentProvider.class);
        supportedTypes.add(ITreeItemContentProvider.class);
        supportedTypes.add(IItemLabelProvider.class);
        supportedTypes.add(IItemPropertySource.class);
    }

    /**
     * This keeps track of the one adapter used for all {@link org.switchyard.tools.models.switchyard1_0.jca.ActivationSpec} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ActivationSpecItemProvider activationSpecItemProvider;

    /**
     * This creates an adapter for a {@link org.switchyard.tools.models.switchyard1_0.jca.ActivationSpec}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createActivationSpecAdapter() {
        if (activationSpecItemProvider == null) {
            activationSpecItemProvider = new ActivationSpecItemProvider(this);
        }

        return activationSpecItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.switchyard.tools.models.switchyard1_0.jca.Connection} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ConnectionItemProvider connectionItemProvider;

    /**
     * This creates an adapter for a {@link org.switchyard.tools.models.switchyard1_0.jca.Connection}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createConnectionAdapter() {
        if (connectionItemProvider == null) {
            connectionItemProvider = new ConnectionItemProvider(this);
        }

        return connectionItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.switchyard.tools.models.switchyard1_0.jca.ConnectionSpec} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ConnectionSpecItemProvider connectionSpecItemProvider;

    /**
     * This creates an adapter for a {@link org.switchyard.tools.models.switchyard1_0.jca.ConnectionSpec}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createConnectionSpecAdapter() {
        if (connectionSpecItemProvider == null) {
            connectionSpecItemProvider = new ConnectionSpecItemProvider(this);
        }

        return connectionSpecItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.switchyard.tools.models.switchyard1_0.jca.DocumentRoot} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DocumentRootItemProvider documentRootItemProvider;

    /**
     * This creates an adapter for a {@link org.switchyard.tools.models.switchyard1_0.jca.DocumentRoot}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createDocumentRootAdapter() {
        if (documentRootItemProvider == null) {
            documentRootItemProvider = new DocumentRootItemProvider(this);
        }

        return documentRootItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.switchyard.tools.models.switchyard1_0.jca.JCAContextMapperType} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected JCAContextMapperTypeItemProvider jcaContextMapperTypeItemProvider;

    /**
     * This creates an adapter for a {@link org.switchyard.tools.models.switchyard1_0.jca.JCAContextMapperType}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createJCAContextMapperTypeAdapter() {
        if (jcaContextMapperTypeItemProvider == null) {
            jcaContextMapperTypeItemProvider = new JCAContextMapperTypeItemProvider(this);
        }

        return jcaContextMapperTypeItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.switchyard.tools.models.switchyard1_0.jca.JCAMessageComposerType} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected JCAMessageComposerTypeItemProvider jcaMessageComposerTypeItemProvider;

    /**
     * This creates an adapter for a {@link org.switchyard.tools.models.switchyard1_0.jca.JCAMessageComposerType}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createJCAMessageComposerTypeAdapter() {
        if (jcaMessageComposerTypeItemProvider == null) {
            jcaMessageComposerTypeItemProvider = new JCAMessageComposerTypeItemProvider(this);
        }

        return jcaMessageComposerTypeItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.switchyard.tools.models.switchyard1_0.jca.InboundOperation} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected InboundOperationItemProvider inboundOperationItemProvider;

    /**
     * This creates an adapter for a {@link org.switchyard.tools.models.switchyard1_0.jca.InboundOperation}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createInboundOperationAdapter() {
        if (inboundOperationItemProvider == null) {
            inboundOperationItemProvider = new InboundOperationItemProvider(this);
        }

        return inboundOperationItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.switchyard.tools.models.switchyard1_0.jca.InteractionSpec} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected InteractionSpecItemProvider interactionSpecItemProvider;

    /**
     * This creates an adapter for a {@link org.switchyard.tools.models.switchyard1_0.jca.InteractionSpec}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createInteractionSpecAdapter() {
        if (interactionSpecItemProvider == null) {
            interactionSpecItemProvider = new InteractionSpecItemProvider(this);
        }

        return interactionSpecItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.switchyard.tools.models.switchyard1_0.jca.JCABinding} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected JCABindingItemProvider jcaBindingItemProvider;

    /**
     * This creates an adapter for a {@link org.switchyard.tools.models.switchyard1_0.jca.JCABinding}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createJCABindingAdapter() {
        if (jcaBindingItemProvider == null) {
            jcaBindingItemProvider = new JCABindingItemProvider(this);
        }

        return jcaBindingItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.switchyard.tools.models.switchyard1_0.jca.JCAInboundConnection} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected JCAInboundConnectionItemProvider jcaInboundConnectionItemProvider;

    /**
     * This creates an adapter for a {@link org.switchyard.tools.models.switchyard1_0.jca.JCAInboundConnection}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createJCAInboundConnectionAdapter() {
        if (jcaInboundConnectionItemProvider == null) {
            jcaInboundConnectionItemProvider = new JCAInboundConnectionItemProvider(this);
        }

        return jcaInboundConnectionItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.switchyard.tools.models.switchyard1_0.jca.JCAInboundInteraction} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected JCAInboundInteractionItemProvider jcaInboundInteractionItemProvider;

    /**
     * This creates an adapter for a {@link org.switchyard.tools.models.switchyard1_0.jca.JCAInboundInteraction}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createJCAInboundInteractionAdapter() {
        if (jcaInboundInteractionItemProvider == null) {
            jcaInboundInteractionItemProvider = new JCAInboundInteractionItemProvider(this);
        }

        return jcaInboundInteractionItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.switchyard.tools.models.switchyard1_0.jca.JCAOutboundConnection} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected JCAOutboundConnectionItemProvider jcaOutboundConnectionItemProvider;

    /**
     * This creates an adapter for a {@link org.switchyard.tools.models.switchyard1_0.jca.JCAOutboundConnection}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createJCAOutboundConnectionAdapter() {
        if (jcaOutboundConnectionItemProvider == null) {
            jcaOutboundConnectionItemProvider = new JCAOutboundConnectionItemProvider(this);
        }

        return jcaOutboundConnectionItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.switchyard.tools.models.switchyard1_0.jca.JCAOutboundInteraction} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected JCAOutboundInteractionItemProvider jcaOutboundInteractionItemProvider;

    /**
     * This creates an adapter for a {@link org.switchyard.tools.models.switchyard1_0.jca.JCAOutboundInteraction}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createJCAOutboundInteractionAdapter() {
        if (jcaOutboundInteractionItemProvider == null) {
            jcaOutboundInteractionItemProvider = new JCAOutboundInteractionItemProvider(this);
        }

        return jcaOutboundInteractionItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.switchyard.tools.models.switchyard1_0.jca.Operation} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected OperationItemProvider operationItemProvider;

    /**
     * This creates an adapter for a {@link org.switchyard.tools.models.switchyard1_0.jca.Operation}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createOperationAdapter() {
        if (operationItemProvider == null) {
            operationItemProvider = new OperationItemProvider(this);
        }

        return operationItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.switchyard.tools.models.switchyard1_0.jca.Property} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PropertyItemProvider propertyItemProvider;

    /**
     * This creates an adapter for a {@link org.switchyard.tools.models.switchyard1_0.jca.Property}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createPropertyAdapter() {
        if (propertyItemProvider == null) {
            propertyItemProvider = new PropertyItemProvider(this);
        }

        return propertyItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.switchyard.tools.models.switchyard1_0.jca.ResourceAdapter} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ResourceAdapterItemProvider resourceAdapterItemProvider;

    /**
     * This creates an adapter for a {@link org.switchyard.tools.models.switchyard1_0.jca.ResourceAdapter}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createResourceAdapterAdapter() {
        if (resourceAdapterItemProvider == null) {
            resourceAdapterItemProvider = new ResourceAdapterItemProvider(this);
        }

        return resourceAdapterItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.switchyard.tools.models.switchyard1_0.jca.Processor} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ProcessorItemProvider processorItemProvider;

    /**
     * This creates an adapter for a {@link org.switchyard.tools.models.switchyard1_0.jca.Processor}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createProcessorAdapter() {
        if (processorItemProvider == null) {
            processorItemProvider = new ProcessorItemProvider(this);
        }

        return processorItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.switchyard.tools.models.switchyard1_0.jca.Endpoint} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EndpointItemProvider endpointItemProvider;

    /**
     * This creates an adapter for a {@link org.switchyard.tools.models.switchyard1_0.jca.Endpoint}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createEndpointAdapter() {
        if (endpointItemProvider == null) {
            endpointItemProvider = new EndpointItemProvider(this);
        }

        return endpointItemProvider;
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
        if (activationSpecItemProvider != null) activationSpecItemProvider.dispose();
        if (connectionItemProvider != null) connectionItemProvider.dispose();
        if (connectionSpecItemProvider != null) connectionSpecItemProvider.dispose();
        if (endpointItemProvider != null) endpointItemProvider.dispose();
        if (inboundOperationItemProvider != null) inboundOperationItemProvider.dispose();
        if (interactionSpecItemProvider != null) interactionSpecItemProvider.dispose();
        if (jcaBindingItemProvider != null) jcaBindingItemProvider.dispose();
        if (jcaInboundConnectionItemProvider != null) jcaInboundConnectionItemProvider.dispose();
        if (jcaInboundInteractionItemProvider != null) jcaInboundInteractionItemProvider.dispose();
        if (jcaOutboundConnectionItemProvider != null) jcaOutboundConnectionItemProvider.dispose();
        if (jcaOutboundInteractionItemProvider != null) jcaOutboundInteractionItemProvider.dispose();
        if (operationItemProvider != null) operationItemProvider.dispose();
        if (processorItemProvider != null) processorItemProvider.dispose();
        if (propertyItemProvider != null) propertyItemProvider.dispose();
        if (resourceAdapterItemProvider != null) resourceAdapterItemProvider.dispose();
        if (documentRootItemProvider != null) documentRootItemProvider.dispose();
        if (jcaContextMapperTypeItemProvider != null) jcaContextMapperTypeItemProvider.dispose();
        if (jcaMessageComposerTypeItemProvider != null) jcaMessageComposerTypeItemProvider.dispose();
    }

}
