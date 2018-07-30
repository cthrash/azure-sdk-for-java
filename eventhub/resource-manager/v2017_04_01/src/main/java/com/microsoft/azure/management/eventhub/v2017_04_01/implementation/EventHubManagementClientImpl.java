/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.eventhub.v2017_04_01.implementation;

import com.microsoft.azure.AzureClient;
import com.microsoft.azure.AzureServiceClient;
import com.microsoft.rest.credentials.ServiceClientCredentials;
import com.microsoft.rest.RestClient;

/**
 * Initializes a new instance of the EventHubManagementClientImpl class.
 */
public class EventHubManagementClientImpl extends AzureServiceClient {
    /** the {@link AzureClient} used for long running operations. */
    private AzureClient azureClient;

    /**
     * Gets the {@link AzureClient} used for long running operations.
     * @return the azure client;
     */
    public AzureClient getAzureClient() {
        return this.azureClient;
    }

    /** Subscription credentials that uniquely identify a Microsoft Azure subscription. The subscription ID forms part of the URI for every service call. */
    private String subscriptionId;

    /**
     * Gets Subscription credentials that uniquely identify a Microsoft Azure subscription. The subscription ID forms part of the URI for every service call.
     *
     * @return the subscriptionId value.
     */
    public String subscriptionId() {
        return this.subscriptionId;
    }

    /**
     * Sets Subscription credentials that uniquely identify a Microsoft Azure subscription. The subscription ID forms part of the URI for every service call.
     *
     * @param subscriptionId the subscriptionId value.
     * @return the service client itself
     */
    public EventHubManagementClientImpl withSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    /** Client API Version. */
    private String apiVersion;

    /**
     * Gets Client API Version.
     *
     * @return the apiVersion value.
     */
    public String apiVersion() {
        return this.apiVersion;
    }

    /** Gets or sets the preferred language for the response. */
    private String acceptLanguage;

    /**
     * Gets Gets or sets the preferred language for the response.
     *
     * @return the acceptLanguage value.
     */
    public String acceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * Sets Gets or sets the preferred language for the response.
     *
     * @param acceptLanguage the acceptLanguage value.
     * @return the service client itself
     */
    public EventHubManagementClientImpl withAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }

    /** Gets or sets the retry timeout in seconds for Long Running Operations. Default value is 30. */
    private int longRunningOperationRetryTimeout;

    /**
     * Gets Gets or sets the retry timeout in seconds for Long Running Operations. Default value is 30.
     *
     * @return the longRunningOperationRetryTimeout value.
     */
    public int longRunningOperationRetryTimeout() {
        return this.longRunningOperationRetryTimeout;
    }

    /**
     * Sets Gets or sets the retry timeout in seconds for Long Running Operations. Default value is 30.
     *
     * @param longRunningOperationRetryTimeout the longRunningOperationRetryTimeout value.
     * @return the service client itself
     */
    public EventHubManagementClientImpl withLongRunningOperationRetryTimeout(int longRunningOperationRetryTimeout) {
        this.longRunningOperationRetryTimeout = longRunningOperationRetryTimeout;
        return this;
    }

    /** When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true. */
    private boolean generateClientRequestId;

    /**
     * Gets When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true.
     *
     * @return the generateClientRequestId value.
     */
    public boolean generateClientRequestId() {
        return this.generateClientRequestId;
    }

    /**
     * Sets When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true.
     *
     * @param generateClientRequestId the generateClientRequestId value.
     * @return the service client itself
     */
    public EventHubManagementClientImpl withGenerateClientRequestId(boolean generateClientRequestId) {
        this.generateClientRequestId = generateClientRequestId;
        return this;
    }

    /**
     * The OperationsInner object to access its operations.
     */
    private OperationsInner operations;

    /**
     * Gets the OperationsInner object to access its operations.
     * @return the OperationsInner object.
     */
    public OperationsInner operations() {
        return this.operations;
    }

    /**
     * The NamespacesInner object to access its operations.
     */
    private NamespacesInner namespaces;

    /**
     * Gets the NamespacesInner object to access its operations.
     * @return the NamespacesInner object.
     */
    public NamespacesInner namespaces() {
        return this.namespaces;
    }

    /**
     * The DisasterRecoveryConfigsInner object to access its operations.
     */
    private DisasterRecoveryConfigsInner disasterRecoveryConfigs;

    /**
     * Gets the DisasterRecoveryConfigsInner object to access its operations.
     * @return the DisasterRecoveryConfigsInner object.
     */
    public DisasterRecoveryConfigsInner disasterRecoveryConfigs() {
        return this.disasterRecoveryConfigs;
    }

    /**
     * The EventHubsInner object to access its operations.
     */
    private EventHubsInner eventHubs;

    /**
     * Gets the EventHubsInner object to access its operations.
     * @return the EventHubsInner object.
     */
    public EventHubsInner eventHubs() {
        return this.eventHubs;
    }

    /**
     * The ConsumerGroupsInner object to access its operations.
     */
    private ConsumerGroupsInner consumerGroups;

    /**
     * Gets the ConsumerGroupsInner object to access its operations.
     * @return the ConsumerGroupsInner object.
     */
    public ConsumerGroupsInner consumerGroups() {
        return this.consumerGroups;
    }

    /**
     * The RegionsInner object to access its operations.
     */
    private RegionsInner regions;

    /**
     * Gets the RegionsInner object to access its operations.
     * @return the RegionsInner object.
     */
    public RegionsInner regions() {
        return this.regions;
    }

    /**
     * Initializes an instance of EventHubManagementClient client.
     *
     * @param credentials the management credentials for Azure
     */
    public EventHubManagementClientImpl(ServiceClientCredentials credentials) {
        this("https://management.azure.com", credentials);
    }

    /**
     * Initializes an instance of EventHubManagementClient client.
     *
     * @param baseUrl the base URL of the host
     * @param credentials the management credentials for Azure
     */
    public EventHubManagementClientImpl(String baseUrl, ServiceClientCredentials credentials) {
        super(baseUrl, credentials);
        initialize();
    }

    /**
     * Initializes an instance of EventHubManagementClient client.
     *
     * @param restClient the REST client to connect to Azure.
     */
    public EventHubManagementClientImpl(RestClient restClient) {
        super(restClient);
        initialize();
    }

    protected void initialize() {
        this.apiVersion = "2017-04-01";
        this.acceptLanguage = "en-US";
        this.longRunningOperationRetryTimeout = 30;
        this.generateClientRequestId = true;
        this.operations = new OperationsInner(restClient().retrofit(), this);
        this.namespaces = new NamespacesInner(restClient().retrofit(), this);
        this.disasterRecoveryConfigs = new DisasterRecoveryConfigsInner(restClient().retrofit(), this);
        this.eventHubs = new EventHubsInner(restClient().retrofit(), this);
        this.consumerGroups = new ConsumerGroupsInner(restClient().retrofit(), this);
        this.regions = new RegionsInner(restClient().retrofit(), this);
        this.azureClient = new AzureClient(this);
    }

    /**
     * Gets the User-Agent header for the client.
     *
     * @return the user agent string.
     */
    @Override
    public String userAgent() {
        return String.format("%s (%s, %s)", super.userAgent(), "EventHubManagementClient", "2017-04-01");
    }
}
