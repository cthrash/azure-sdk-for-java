/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.eventhub.v2018_01_01_preview.implementation;

import com.microsoft.azure.management.eventhub.v2018_01_01_preview.VirtualNetworkRule;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;

class VirtualNetworkRuleImpl extends CreatableUpdatableImpl<VirtualNetworkRule, VirtualNetworkRuleInner, VirtualNetworkRuleImpl> implements VirtualNetworkRule, VirtualNetworkRule.Definition, VirtualNetworkRule.Update {
    private final EventHubManager manager;
    private String resourceGroupName;
    private String namespaceName;
    private String virtualNetworkRuleName;

    VirtualNetworkRuleImpl(String name, EventHubManager manager) {
        super(name, new VirtualNetworkRuleInner());
        this.manager = manager;
        // Set resource name
        this.virtualNetworkRuleName = name;
        //
    }

    VirtualNetworkRuleImpl(VirtualNetworkRuleInner inner, EventHubManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.virtualNetworkRuleName = inner.name();
        // resource ancestor names
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.namespaceName = IdParsingUtils.getValueFromIdByName(inner.id(), "namespaces");
        this.virtualNetworkRuleName = IdParsingUtils.getValueFromIdByName(inner.id(), "virtualnetworkrules");
        //
    }

    @Override
    public EventHubManager manager() {
        return this.manager;
    }

    @Override
    public Observable<VirtualNetworkRule> createResourceAsync() {
        NamespacesInner client = this.manager().inner().namespaces();
        return client.createOrUpdateVirtualNetworkRuleAsync(this.resourceGroupName, this.namespaceName, this.virtualNetworkRuleName)
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<VirtualNetworkRule> updateResourceAsync() {
        NamespacesInner client = this.manager().inner().namespaces();
        return client.createOrUpdateVirtualNetworkRuleAsync(this.resourceGroupName, this.namespaceName, this.virtualNetworkRuleName)
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<VirtualNetworkRuleInner> getInnerAsync() {
        NamespacesInner client = this.manager().inner().namespaces();
        return client.getVirtualNetworkRuleAsync(this.resourceGroupName, this.namespaceName, this.virtualNetworkRuleName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public String virtualNetworkSubnetId() {
        return this.inner().virtualNetworkSubnetId();
    }

    @Override
    public VirtualNetworkRuleImpl withExistingNamespace(String resourceGroupName, String namespaceName) {
        this.resourceGroupName = resourceGroupName;
        this.namespaceName = namespaceName;
        return this;
    }

}
