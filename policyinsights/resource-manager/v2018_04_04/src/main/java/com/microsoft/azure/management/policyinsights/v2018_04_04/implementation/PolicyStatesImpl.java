/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.policyinsights.v2018_04_04.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.policyinsights.v2018_04_04.PolicyStates;
import rx.Completable;
import rx.functions.Func1;
import rx.Observable;
import com.microsoft.azure.management.policyinsights.v2018_04_04.PolicyStatesQueryResults;
import com.microsoft.azure.management.policyinsights.v2018_04_04.SummarizeResults;
import com.microsoft.azure.management.policyinsights.v2018_04_04.PolicyStatesResource;

class PolicyStatesImpl extends WrapperImpl<PolicyStatesInner> implements PolicyStates {
    private final PolicyInsightsManager manager;

    PolicyStatesImpl(PolicyInsightsManager manager) {
        super(manager.inner().policyStates());
        this.manager = manager;
    }

    public PolicyInsightsManager manager() {
        return this.manager;
    }

    @Override
    public Observable<PolicyStatesQueryResults> listQueryResultsForManagementGroupAsync(PolicyStatesResource policyStatesResource, String managementGroupName) {
        PolicyStatesInner client = this.inner();
        return client.listQueryResultsForManagementGroupAsync(policyStatesResource, managementGroupName)
        .map(new Func1<PolicyStatesQueryResultsInner, PolicyStatesQueryResults>() {
            @Override
            public PolicyStatesQueryResults call(PolicyStatesQueryResultsInner inner) {
                return new PolicyStatesQueryResultsImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<SummarizeResults> summarizeForManagementGroupAsync(String managementGroupName) {
        PolicyStatesInner client = this.inner();
        return client.summarizeForManagementGroupAsync(managementGroupName)
        .map(new Func1<SummarizeResultsInner, SummarizeResults>() {
            @Override
            public SummarizeResults call(SummarizeResultsInner inner) {
                return new SummarizeResultsImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<PolicyStatesQueryResults> listQueryResultsForSubscriptionAsync(PolicyStatesResource policyStatesResource, String subscriptionId) {
        PolicyStatesInner client = this.inner();
        return client.listQueryResultsForSubscriptionAsync(policyStatesResource, subscriptionId)
        .map(new Func1<PolicyStatesQueryResultsInner, PolicyStatesQueryResults>() {
            @Override
            public PolicyStatesQueryResults call(PolicyStatesQueryResultsInner inner) {
                return new PolicyStatesQueryResultsImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<SummarizeResults> summarizeForSubscriptionAsync(String subscriptionId) {
        PolicyStatesInner client = this.inner();
        return client.summarizeForSubscriptionAsync(subscriptionId)
        .map(new Func1<SummarizeResultsInner, SummarizeResults>() {
            @Override
            public SummarizeResults call(SummarizeResultsInner inner) {
                return new SummarizeResultsImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<PolicyStatesQueryResults> listQueryResultsForResourceGroupAsync(PolicyStatesResource policyStatesResource, String subscriptionId, String resourceGroupName) {
        PolicyStatesInner client = this.inner();
        return client.listQueryResultsForResourceGroupAsync(policyStatesResource, subscriptionId, resourceGroupName)
        .map(new Func1<PolicyStatesQueryResultsInner, PolicyStatesQueryResults>() {
            @Override
            public PolicyStatesQueryResults call(PolicyStatesQueryResultsInner inner) {
                return new PolicyStatesQueryResultsImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<SummarizeResults> summarizeForResourceGroupAsync(String subscriptionId, String resourceGroupName) {
        PolicyStatesInner client = this.inner();
        return client.summarizeForResourceGroupAsync(subscriptionId, resourceGroupName)
        .map(new Func1<SummarizeResultsInner, SummarizeResults>() {
            @Override
            public SummarizeResults call(SummarizeResultsInner inner) {
                return new SummarizeResultsImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<PolicyStatesQueryResults> listQueryResultsForResourceAsync(PolicyStatesResource policyStatesResource, String resourceId) {
        PolicyStatesInner client = this.inner();
        return client.listQueryResultsForResourceAsync(policyStatesResource, resourceId)
        .map(new Func1<PolicyStatesQueryResultsInner, PolicyStatesQueryResults>() {
            @Override
            public PolicyStatesQueryResults call(PolicyStatesQueryResultsInner inner) {
                return new PolicyStatesQueryResultsImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<SummarizeResults> summarizeForResourceAsync(String resourceId) {
        PolicyStatesInner client = this.inner();
        return client.summarizeForResourceAsync(resourceId)
        .map(new Func1<SummarizeResultsInner, SummarizeResults>() {
            @Override
            public SummarizeResults call(SummarizeResultsInner inner) {
                return new SummarizeResultsImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<PolicyStatesQueryResults> listQueryResultsForPolicySetDefinitionAsync(PolicyStatesResource policyStatesResource, String subscriptionId, String policySetDefinitionName) {
        PolicyStatesInner client = this.inner();
        return client.listQueryResultsForPolicySetDefinitionAsync(policyStatesResource, subscriptionId, policySetDefinitionName)
        .map(new Func1<PolicyStatesQueryResultsInner, PolicyStatesQueryResults>() {
            @Override
            public PolicyStatesQueryResults call(PolicyStatesQueryResultsInner inner) {
                return new PolicyStatesQueryResultsImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<SummarizeResults> summarizeForPolicySetDefinitionAsync(String subscriptionId, String policySetDefinitionName) {
        PolicyStatesInner client = this.inner();
        return client.summarizeForPolicySetDefinitionAsync(subscriptionId, policySetDefinitionName)
        .map(new Func1<SummarizeResultsInner, SummarizeResults>() {
            @Override
            public SummarizeResults call(SummarizeResultsInner inner) {
                return new SummarizeResultsImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<PolicyStatesQueryResults> listQueryResultsForPolicyDefinitionAsync(PolicyStatesResource policyStatesResource, String subscriptionId, String policyDefinitionName) {
        PolicyStatesInner client = this.inner();
        return client.listQueryResultsForPolicyDefinitionAsync(policyStatesResource, subscriptionId, policyDefinitionName)
        .map(new Func1<PolicyStatesQueryResultsInner, PolicyStatesQueryResults>() {
            @Override
            public PolicyStatesQueryResults call(PolicyStatesQueryResultsInner inner) {
                return new PolicyStatesQueryResultsImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<SummarizeResults> summarizeForPolicyDefinitionAsync(String subscriptionId, String policyDefinitionName) {
        PolicyStatesInner client = this.inner();
        return client.summarizeForPolicyDefinitionAsync(subscriptionId, policyDefinitionName)
        .map(new Func1<SummarizeResultsInner, SummarizeResults>() {
            @Override
            public SummarizeResults call(SummarizeResultsInner inner) {
                return new SummarizeResultsImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<PolicyStatesQueryResults> listQueryResultsForSubscriptionLevelPolicyAssignmentAsync(PolicyStatesResource policyStatesResource, String subscriptionId, String policyAssignmentName) {
        PolicyStatesInner client = this.inner();
        return client.listQueryResultsForSubscriptionLevelPolicyAssignmentAsync(policyStatesResource, subscriptionId, policyAssignmentName)
        .map(new Func1<PolicyStatesQueryResultsInner, PolicyStatesQueryResults>() {
            @Override
            public PolicyStatesQueryResults call(PolicyStatesQueryResultsInner inner) {
                return new PolicyStatesQueryResultsImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<SummarizeResults> summarizeForSubscriptionLevelPolicyAssignmentAsync(String subscriptionId, String policyAssignmentName) {
        PolicyStatesInner client = this.inner();
        return client.summarizeForSubscriptionLevelPolicyAssignmentAsync(subscriptionId, policyAssignmentName)
        .map(new Func1<SummarizeResultsInner, SummarizeResults>() {
            @Override
            public SummarizeResults call(SummarizeResultsInner inner) {
                return new SummarizeResultsImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<PolicyStatesQueryResults> listQueryResultsForResourceGroupLevelPolicyAssignmentAsync(PolicyStatesResource policyStatesResource, String subscriptionId, String resourceGroupName, String policyAssignmentName) {
        PolicyStatesInner client = this.inner();
        return client.listQueryResultsForResourceGroupLevelPolicyAssignmentAsync(policyStatesResource, subscriptionId, resourceGroupName, policyAssignmentName)
        .map(new Func1<PolicyStatesQueryResultsInner, PolicyStatesQueryResults>() {
            @Override
            public PolicyStatesQueryResults call(PolicyStatesQueryResultsInner inner) {
                return new PolicyStatesQueryResultsImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<SummarizeResults> summarizeForResourceGroupLevelPolicyAssignmentAsync(String subscriptionId, String resourceGroupName, String policyAssignmentName) {
        PolicyStatesInner client = this.inner();
        return client.summarizeForResourceGroupLevelPolicyAssignmentAsync(subscriptionId, resourceGroupName, policyAssignmentName)
        .map(new Func1<SummarizeResultsInner, SummarizeResults>() {
            @Override
            public SummarizeResults call(SummarizeResultsInner inner) {
                return new SummarizeResultsImpl(inner, manager());
            }
        });
    }

    @Override
    public Completable getMetadataAsync(String scope) {
        PolicyStatesInner client = this.inner();
        return client.getMetadataAsync(scope).toCompletable();
    }

}
