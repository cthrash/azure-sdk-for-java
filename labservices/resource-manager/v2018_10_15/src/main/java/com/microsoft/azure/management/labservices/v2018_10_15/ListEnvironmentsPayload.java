/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.labservices.v2018_10_15;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents the payload to list environments owned by a user.
 */
public class ListEnvironmentsPayload {
    /**
     * The resource Id of the lab.
     */
    @JsonProperty(value = "labId")
    private String labId;

    /**
     * Get the resource Id of the lab.
     *
     * @return the labId value
     */
    public String labId() {
        return this.labId;
    }

    /**
     * Set the resource Id of the lab.
     *
     * @param labId the labId value to set
     * @return the ListEnvironmentsPayload object itself.
     */
    public ListEnvironmentsPayload withLabId(String labId) {
        this.labId = labId;
        return this;
    }

}
