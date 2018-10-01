/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactoryv2.v2017_09_01_preview.implementation;

import com.microsoft.azure.management.datafactoryv2.v2017_09_01_preview.OperationListResponse;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import java.util.List;

class OperationListResponseImpl extends WrapperImpl<OperationListResponseInner> implements OperationListResponse {
    private final DataFactoryManager manager;
    OperationListResponseImpl(OperationListResponseInner inner, DataFactoryManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public DataFactoryManager manager() {
        return this.manager;
    }

    @Override
    public String nextLink() {
        return this.inner().nextLink();
    }

    @Override
    public List<OperationInner> value() {
        return this.inner().value();
    }

}