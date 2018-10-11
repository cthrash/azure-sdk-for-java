/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.eventhub.v2015_08_01;

import com.microsoft.azure.arm.collection.SupportsCreating;
import com.microsoft.azure.arm.resources.collection.SupportsDeletingByResourceGroup;
import com.microsoft.azure.arm.resources.collection.SupportsBatchDeletion;
import com.microsoft.azure.arm.resources.collection.SupportsGettingByResourceGroup;
import rx.Observable;
import com.microsoft.azure.arm.resources.collection.SupportsListingByResourceGroup;
import com.microsoft.azure.arm.collection.SupportsListing;
import com.microsoft.azure.management.eventhub.v2015_08_01.implementation.NamespacesInner;
import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.eventhub.v2015_08_01.NamespaceSharedAccessAuthorizationRuleResource;
import rx.Completable;

/**
 * Type representing Namespaces.
 */
public interface Namespaces extends SupportsCreating<NamespaceResource.DefinitionStages.Blank>, SupportsDeletingByResourceGroup, SupportsBatchDeletion, SupportsGettingByResourceGroup<NamespaceResource>, SupportsListingByResourceGroup<NamespaceResource>, SupportsListing<NamespaceResource>, HasInner<NamespacesInner> {
    /**
     * Begins definition for a new AuthorizationRule resource.
     * @param name resource name.
     * @return the first stage of the new AuthorizationRule definition.
     */
    NamespaceSharedAccessAuthorizationRuleResource.DefinitionStages.Blank defineAuthorizationRule(String name);

    /**
     * Check the give Namespace name availability.
     *
     * @param name Name to check the namespace name availability
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<CheckNameAvailabilityResult> checkNameAvailabilityAsync(String name);

    /**
     * Gets an AuthorizationRule for a Namespace by rule name.
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name
     * @param authorizationRuleName The authorization rule name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<NamespaceSharedAccessAuthorizationRuleResource> getAuthorizationRuleAsync(String resourceGroupName, String namespaceName, String authorizationRuleName);

    /**
     * Gets a list of authorization rules for a Namespace.
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<NamespaceSharedAccessAuthorizationRuleResource> listAuthorizationRulesAsync(final String resourceGroupName, final String namespaceName);

    /**
     * Deletes an AuthorizationRule for a Namespace.
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name
     * @param authorizationRuleName The authorization rule name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAuthorizationRuleAsync(String resourceGroupName, String namespaceName, String authorizationRuleName);

    /**
     * Gets the primary and secondary connection strings for the Namespace.
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name
     * @param authorizationRuleName The authorization rule name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ResourceListKeys> listKeysAsync(String resourceGroupName, String namespaceName, String authorizationRuleName);

    /**
     * Regenerates the primary or secondary connection strings for the specified Namespace.
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name
     * @param authorizationRuleName The authorization rule name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ResourceListKeys> regenerateKeysAsync(String resourceGroupName, String namespaceName, String authorizationRuleName);

}
