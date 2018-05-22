/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.eventgrid.v2018_05_01_preview;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

import java.util.Collection;

/**
 * Defines values for EndpointType.
 */
public final class EndpointType extends ExpandableStringEnum<EndpointType> {
    /** Static value WebHook for EndpointType. */
    public static final EndpointType WEBHOOK = fromString("WebHook");

    /** Static value Standard for EndpointType. */
    public static final EndpointType EVENTHUB = fromString("EventHub");

    /**
     * Creates or finds a EndpointType from its string representation.
     * @param name a name to look for
     * @return the corresponding SkuName
     */
    @JsonCreator
    public static EndpointType fromString(String name) {
        return fromString(name, EndpointType.class);
    }

    /**
     * @return known EndpointType values
     */
    public static Collection<EndpointType> values() {
        return values(EndpointType.class);
    }
}
