/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.policyinsights;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The details of the policy triggered deployment that created or modified the
 * tracked resource.
 */
public class TrackedResourceModificationDetails {
    /**
     * The details of the policy that created or modified the tracked resource.
     */
    @JsonProperty(value = "policyDetails", access = JsonProperty.Access.WRITE_ONLY)
    private PolicyDetails policyDetails;

    /**
     * The ID of the deployment that created or modified the tracked resource.
     */
    @JsonProperty(value = "deploymentId", access = JsonProperty.Access.WRITE_ONLY)
    private String deploymentId;

    /**
     * Timestamp of the deployment that created or modified the tracked
     * resource.
     */
    @JsonProperty(value = "deploymentTime", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime deploymentTime;

    /**
     * Get the details of the policy that created or modified the tracked resource.
     *
     * @return the policyDetails value
     */
    public PolicyDetails policyDetails() {
        return this.policyDetails;
    }

    /**
     * Get the ID of the deployment that created or modified the tracked resource.
     *
     * @return the deploymentId value
     */
    public String deploymentId() {
        return this.deploymentId;
    }

    /**
     * Get timestamp of the deployment that created or modified the tracked resource.
     *
     * @return the deploymentTime value
     */
    public DateTime deploymentTime() {
        return this.deploymentTime;
    }

}
