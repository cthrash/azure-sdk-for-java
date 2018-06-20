/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2016_09_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Description of the App Service plan scale options.
 */
public class SkuCapacity {
    /**
     * Minimum number of workers for this App Service plan SKU.
     */
    @JsonProperty(value = "minimum")
    private Integer minimum;

    /**
     * Maximum number of workers for this App Service plan SKU.
     */
    @JsonProperty(value = "maximum")
    private Integer maximum;

    /**
     * Default number of workers for this App Service plan SKU.
     */
    @JsonProperty(value = "default")
    private Integer defaultProperty;

    /**
     * Available scale configurations for an App Service plan.
     */
    @JsonProperty(value = "scaleType")
    private String scaleType;

    /**
     * Get minimum number of workers for this App Service plan SKU.
     *
     * @return the minimum value
     */
    public Integer minimum() {
        return this.minimum;
    }

    /**
     * Set minimum number of workers for this App Service plan SKU.
     *
     * @param minimum the minimum value to set
     * @return the SkuCapacity object itself.
     */
    public SkuCapacity withMinimum(Integer minimum) {
        this.minimum = minimum;
        return this;
    }

    /**
     * Get maximum number of workers for this App Service plan SKU.
     *
     * @return the maximum value
     */
    public Integer maximum() {
        return this.maximum;
    }

    /**
     * Set maximum number of workers for this App Service plan SKU.
     *
     * @param maximum the maximum value to set
     * @return the SkuCapacity object itself.
     */
    public SkuCapacity withMaximum(Integer maximum) {
        this.maximum = maximum;
        return this;
    }

    /**
     * Get default number of workers for this App Service plan SKU.
     *
     * @return the defaultProperty value
     */
    public Integer defaultProperty() {
        return this.defaultProperty;
    }

    /**
     * Set default number of workers for this App Service plan SKU.
     *
     * @param defaultProperty the defaultProperty value to set
     * @return the SkuCapacity object itself.
     */
    public SkuCapacity withDefaultProperty(Integer defaultProperty) {
        this.defaultProperty = defaultProperty;
        return this;
    }

    /**
     * Get available scale configurations for an App Service plan.
     *
     * @return the scaleType value
     */
    public String scaleType() {
        return this.scaleType;
    }

    /**
     * Set available scale configurations for an App Service plan.
     *
     * @param scaleType the scaleType value to set
     * @return the SkuCapacity object itself.
     */
    public SkuCapacity withScaleType(String scaleType) {
        this.scaleType = scaleType;
        return this;
    }

}
