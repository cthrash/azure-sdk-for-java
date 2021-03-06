/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v2014_04_01;

import rx.Observable;

/**
 * Type representing Capabilities.
 */
public interface Capabilities {
    /**
     * Gets the capabilities available for the specified location.
     *
     * @param locationId The location id whose capabilities are retrieved.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<LocationCapabilities> listByLocationAsync(String locationId);

}
