/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v2014_04_01;

import rx.Observable;
import com.microsoft.azure.management.sql.v2014_04_01.implementation.DatabaseUsagesInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing DatabaseUsages.
 */
public interface DatabaseUsages extends HasInner<DatabaseUsagesInner> {
    /**
     * Returns database usages.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<DatabaseUsage> listByDatabaseAsync(String resourceGroupName, String serverName, String databaseName);

}
