/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.eventhub.v2015_08_01;

import org.joda.time.DateTime;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Parameters supplied to the Create Or Update Event Hub operation.
 */
@JsonFlatten
public class EventHubCreateOrUpdateParameters {
    /**
     * Location of the resource.
     */
    @JsonProperty(value = "location", required = true)
    private String location;

    /**
     * ARM type of the Namespace.
     */
    @JsonProperty(value = "type")
    private String type;

    /**
     * Name of the Event Hub.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Exact time the Event Hub was created.
     */
    @JsonProperty(value = "properties.createdAt", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime createdAt;

    /**
     * Number of days to retain the events for this Event Hub.
     */
    @JsonProperty(value = "properties.messageRetentionInDays")
    private Long messageRetentionInDays;

    /**
     * Number of partitions created for the Event Hub.
     */
    @JsonProperty(value = "properties.partitionCount")
    private Long partitionCount;

    /**
     * Current number of shards on the Event Hub.
     */
    @JsonProperty(value = "properties.partitionIds", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> partitionIds;

    /**
     * Enumerates the possible values for the status of the Event Hub. Possible
     * values include: 'Active', 'Disabled', 'Restoring', 'SendDisabled',
     * 'ReceiveDisabled', 'Creating', 'Deleting', 'Renaming', 'Unknown'.
     */
    @JsonProperty(value = "properties.status")
    private EntityStatus status;

    /**
     * The exact time the message was updated.
     */
    @JsonProperty(value = "properties.updatedAt", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime updatedAt;

    /**
     * Get location of the resource.
     *
     * @return the location value
     */
    public String location() {
        return this.location;
    }

    /**
     * Set location of the resource.
     *
     * @param location the location value to set
     * @return the EventHubCreateOrUpdateParameters object itself.
     */
    public EventHubCreateOrUpdateParameters withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get aRM type of the Namespace.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

    /**
     * Set aRM type of the Namespace.
     *
     * @param type the type value to set
     * @return the EventHubCreateOrUpdateParameters object itself.
     */
    public EventHubCreateOrUpdateParameters withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get name of the Event Hub.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set name of the Event Hub.
     *
     * @param name the name value to set
     * @return the EventHubCreateOrUpdateParameters object itself.
     */
    public EventHubCreateOrUpdateParameters withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get exact time the Event Hub was created.
     *
     * @return the createdAt value
     */
    public DateTime createdAt() {
        return this.createdAt;
    }

    /**
     * Get number of days to retain the events for this Event Hub.
     *
     * @return the messageRetentionInDays value
     */
    public Long messageRetentionInDays() {
        return this.messageRetentionInDays;
    }

    /**
     * Set number of days to retain the events for this Event Hub.
     *
     * @param messageRetentionInDays the messageRetentionInDays value to set
     * @return the EventHubCreateOrUpdateParameters object itself.
     */
    public EventHubCreateOrUpdateParameters withMessageRetentionInDays(Long messageRetentionInDays) {
        this.messageRetentionInDays = messageRetentionInDays;
        return this;
    }

    /**
     * Get number of partitions created for the Event Hub.
     *
     * @return the partitionCount value
     */
    public Long partitionCount() {
        return this.partitionCount;
    }

    /**
     * Set number of partitions created for the Event Hub.
     *
     * @param partitionCount the partitionCount value to set
     * @return the EventHubCreateOrUpdateParameters object itself.
     */
    public EventHubCreateOrUpdateParameters withPartitionCount(Long partitionCount) {
        this.partitionCount = partitionCount;
        return this;
    }

    /**
     * Get current number of shards on the Event Hub.
     *
     * @return the partitionIds value
     */
    public List<String> partitionIds() {
        return this.partitionIds;
    }

    /**
     * Get enumerates the possible values for the status of the Event Hub. Possible values include: 'Active', 'Disabled', 'Restoring', 'SendDisabled', 'ReceiveDisabled', 'Creating', 'Deleting', 'Renaming', 'Unknown'.
     *
     * @return the status value
     */
    public EntityStatus status() {
        return this.status;
    }

    /**
     * Set enumerates the possible values for the status of the Event Hub. Possible values include: 'Active', 'Disabled', 'Restoring', 'SendDisabled', 'ReceiveDisabled', 'Creating', 'Deleting', 'Renaming', 'Unknown'.
     *
     * @param status the status value to set
     * @return the EventHubCreateOrUpdateParameters object itself.
     */
    public EventHubCreateOrUpdateParameters withStatus(EntityStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get the exact time the message was updated.
     *
     * @return the updatedAt value
     */
    public DateTime updatedAt() {
        return this.updatedAt;
    }

}
