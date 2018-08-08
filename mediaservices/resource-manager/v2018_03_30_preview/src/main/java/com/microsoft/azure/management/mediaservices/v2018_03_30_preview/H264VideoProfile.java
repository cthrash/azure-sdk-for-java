/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2018_03_30_preview;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for H264VideoProfile.
 */
public enum H264VideoProfile {
    /** Tells the encoder to automatically determine the appropriate H.264 profile. */
    AUTO("Auto"),

    /** Baseline profile. */
    BASELINE("Baseline"),

    /** Main profile. */
    MAIN("Main"),

    /** High profile. */
    HIGH("High"),

    /** High 4:2:2 profile. */
    HIGH422("High422"),

    /** High 4:4:4 predictive profile. */
    HIGH444("High444");

    /** The actual serialized value for a H264VideoProfile instance. */
    private String value;

    H264VideoProfile(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a H264VideoProfile instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed H264VideoProfile object, or null if unable to parse.
     */
    @JsonCreator
    public static H264VideoProfile fromString(String value) {
        H264VideoProfile[] items = H264VideoProfile.values();
        for (H264VideoProfile item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
