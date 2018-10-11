/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.eventgrid.v2018_05_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This is used to express the source of an input schema mapping for a single
 * target field in the Event Grid Event schema. This is currently used in the
 * mappings for the 'subject','eventtype' and 'dataversion' properties. This
 * represents a field in the input event schema along with a default value to
 * be used, and at least one of these two properties should be provided.
 */
public class JsonFieldWithDefault {
    /**
     * Name of a field in the input event schema that's to be used as the
     * source of a mapping.
     */
    @JsonProperty(value = "sourceField")
    private String sourceField;

    /**
     * The default value to be used for mapping when a SourceField is not
     * provided or if there's no property with the specified name in the
     * published JSON event payload.
     */
    @JsonProperty(value = "defaultValue")
    private String defaultValue;

    /**
     * Get name of a field in the input event schema that's to be used as the source of a mapping.
     *
     * @return the sourceField value
     */
    public String sourceField() {
        return this.sourceField;
    }

    /**
     * Set name of a field in the input event schema that's to be used as the source of a mapping.
     *
     * @param sourceField the sourceField value to set
     * @return the JsonFieldWithDefault object itself.
     */
    public JsonFieldWithDefault withSourceField(String sourceField) {
        this.sourceField = sourceField;
        return this;
    }

    /**
     * Get the default value to be used for mapping when a SourceField is not provided or if there's no property with the specified name in the published JSON event payload.
     *
     * @return the defaultValue value
     */
    public String defaultValue() {
        return this.defaultValue;
    }

    /**
     * Set the default value to be used for mapping when a SourceField is not provided or if there's no property with the specified name in the published JSON event payload.
     *
     * @param defaultValue the defaultValue value to set
     * @return the JsonFieldWithDefault object itself.
     */
    public JsonFieldWithDefault withDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
        return this;
    }

}
