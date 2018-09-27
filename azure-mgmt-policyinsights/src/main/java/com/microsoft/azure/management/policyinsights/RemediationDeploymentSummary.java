/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.policyinsights;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The deployment status summary for all deplyoments created by the
 * remediation.
 */
public class RemediationDeploymentSummary {
    /**
     * The number of deployments required by the remediation.
     */
    @JsonProperty(value = "totalDeployments")
    private Integer totalDeployments;

    /**
     * The number of deployments required by the remediation that have
     * succeeded.
     */
    @JsonProperty(value = "successfulDeployments")
    private Integer successfulDeployments;

    /**
     * The number of deployments required by the remediation that have failed.
     */
    @JsonProperty(value = "failedDeployments")
    private Integer failedDeployments;

    /**
     * Get the number of deployments required by the remediation.
     *
     * @return the totalDeployments value
     */
    public Integer totalDeployments() {
        return this.totalDeployments;
    }

    /**
     * Set the number of deployments required by the remediation.
     *
     * @param totalDeployments the totalDeployments value to set
     * @return the RemediationDeploymentSummary object itself.
     */
    public RemediationDeploymentSummary withTotalDeployments(Integer totalDeployments) {
        this.totalDeployments = totalDeployments;
        return this;
    }

    /**
     * Get the number of deployments required by the remediation that have succeeded.
     *
     * @return the successfulDeployments value
     */
    public Integer successfulDeployments() {
        return this.successfulDeployments;
    }

    /**
     * Set the number of deployments required by the remediation that have succeeded.
     *
     * @param successfulDeployments the successfulDeployments value to set
     * @return the RemediationDeploymentSummary object itself.
     */
    public RemediationDeploymentSummary withSuccessfulDeployments(Integer successfulDeployments) {
        this.successfulDeployments = successfulDeployments;
        return this;
    }

    /**
     * Get the number of deployments required by the remediation that have failed.
     *
     * @return the failedDeployments value
     */
    public Integer failedDeployments() {
        return this.failedDeployments;
    }

    /**
     * Set the number of deployments required by the remediation that have failed.
     *
     * @param failedDeployments the failedDeployments value to set
     * @return the RemediationDeploymentSummary object itself.
     */
    public RemediationDeploymentSummary withFailedDeployments(Integer failedDeployments) {
        this.failedDeployments = failedDeployments;
        return this;
    }

}
