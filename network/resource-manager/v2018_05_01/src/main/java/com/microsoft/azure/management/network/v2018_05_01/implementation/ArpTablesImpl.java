/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.network.v2018_05_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.network.v2018_05_01.ArpTables;
import rx.functions.Func1;
import rx.Observable;
import com.microsoft.azure.management.network.v2018_05_01.ExpressRouteCircuitsArpTableListResult;

class ArpTablesImpl extends WrapperImpl<ExpressRouteCrossConnectionsInner> implements ArpTables {
    private final NetworkManager manager;

    ArpTablesImpl(NetworkManager manager) {
        super(manager.inner().expressRouteCrossConnections());
        this.manager = manager;
    }

    public NetworkManager manager() {
        return this.manager;
    }

    @Override
    public Observable<ExpressRouteCircuitsArpTableListResult> listArpTableAsync(String resourceGroupName, String crossConnectionName, String peeringName, String devicePath) {
        ExpressRouteCrossConnectionsInner client = this.inner();
        return client.listArpTableAsync(resourceGroupName, crossConnectionName, peeringName, devicePath)
        .map(new Func1<ExpressRouteCircuitsArpTableListResultInner, ExpressRouteCircuitsArpTableListResult>() {
            @Override
            public ExpressRouteCircuitsArpTableListResult call(ExpressRouteCircuitsArpTableListResultInner inner) {
                return new ExpressRouteCircuitsArpTableListResultImpl(inner, manager());
            }
        });
    }

}
