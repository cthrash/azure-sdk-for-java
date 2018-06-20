/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2018_02_01.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.management.appservice.v2018_02_01.ProxyOnlyResource;

/**
 * Function secrets.
 */
@JsonFlatten
public class FunctionSecretsInner extends ProxyOnlyResource {
    /**
     * Secret key.
     */
    @JsonProperty(value = "properties.key")
    private String key;

    /**
     * Trigger URL.
     */
    @JsonProperty(value = "properties.trigger_url")
    private String triggerUrl;

    /**
     * Get secret key.
     *
     * @return the key value
     */
    public String key() {
        return this.key;
    }

    /**
     * Set secret key.
     *
     * @param key the key value to set
     * @return the FunctionSecretsInner object itself.
     */
    public FunctionSecretsInner withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * Get trigger URL.
     *
     * @return the triggerUrl value
     */
    public String triggerUrl() {
        return this.triggerUrl;
    }

    /**
     * Set trigger URL.
     *
     * @param triggerUrl the triggerUrl value to set
     * @return the FunctionSecretsInner object itself.
     */
    public FunctionSecretsInner withTriggerUrl(String triggerUrl) {
        this.triggerUrl = triggerUrl;
        return this;
    }

}
