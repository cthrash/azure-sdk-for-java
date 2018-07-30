/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.eventhub.v2015_08_01.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.AzureServiceFuture;
import com.microsoft.azure.CloudException;
import com.microsoft.azure.ListOperationCallback;
import com.microsoft.azure.management.eventhub.v2015_08_01.ConsumerGroupCreateOrUpdateParameters;
import com.microsoft.azure.Page;
import com.microsoft.azure.PagedList;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.Validator;
import java.io.IOException;
import java.util.List;
import okhttp3.ResponseBody;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.HTTP;
import retrofit2.http.Path;
import retrofit2.http.PUT;
import retrofit2.http.Query;
import retrofit2.http.Url;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in ConsumerGroups.
 */
public class ConsumerGroupsInner {
    /** The Retrofit service to perform REST calls. */
    private ConsumerGroupsService service;
    /** The service client containing this operation class. */
    private EventHubManagementClientImpl client;

    /**
     * Initializes an instance of ConsumerGroupsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public ConsumerGroupsInner(Retrofit retrofit, EventHubManagementClientImpl client) {
        this.service = retrofit.create(ConsumerGroupsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for ConsumerGroups to be
     * used by Retrofit to perform actually REST calls.
     */
    interface ConsumerGroupsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.eventhub.v2015_08_01.ConsumerGroups createOrUpdate" })
        @PUT("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.EventHub/namespaces/{namespaceName}/eventhubs/{eventHubName}/consumergroups/{consumerGroupName}")
        Observable<Response<ResponseBody>> createOrUpdate(@Path("resourceGroupName") String resourceGroupName, @Path("namespaceName") String namespaceName, @Path("eventHubName") String eventHubName, @Path("consumerGroupName") String consumerGroupName, @Path("subscriptionId") String subscriptionId, @Body ConsumerGroupCreateOrUpdateParameters parameters, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.eventhub.v2015_08_01.ConsumerGroups delete" })
        @HTTP(path = "subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.EventHub/namespaces/{namespaceName}/eventhubs/{eventHubName}/consumergroups/{consumerGroupName}", method = "DELETE", hasBody = true)
        Observable<Response<ResponseBody>> delete(@Path("resourceGroupName") String resourceGroupName, @Path("namespaceName") String namespaceName, @Path("eventHubName") String eventHubName, @Path("consumerGroupName") String consumerGroupName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.eventhub.v2015_08_01.ConsumerGroups get" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.EventHub/namespaces/{namespaceName}/eventhubs/{eventHubName}/consumergroups/{consumerGroupName}")
        Observable<Response<ResponseBody>> get(@Path("resourceGroupName") String resourceGroupName, @Path("namespaceName") String namespaceName, @Path("eventHubName") String eventHubName, @Path("consumerGroupName") String consumerGroupName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.eventhub.v2015_08_01.ConsumerGroups listAll" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.EventHub/namespaces/{namespaceName}/eventhubs/{eventHubName}/consumergroups")
        Observable<Response<ResponseBody>> listAll(@Path("resourceGroupName") String resourceGroupName, @Path("namespaceName") String namespaceName, @Path("eventHubName") String eventHubName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.eventhub.v2015_08_01.ConsumerGroups listAllNext" })
        @GET
        Observable<Response<ResponseBody>> listAllNext(@Url String nextUrl, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Creates or updates an Event Hubs consumer group as a nested resource within a Namespace.
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name
     * @param eventHubName The Event Hub name
     * @param consumerGroupName The consumer group name
     * @param parameters Parameters supplied to create or update a consumer group resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ConsumerGroupResourceInner object if successful.
     */
    public ConsumerGroupResourceInner createOrUpdate(String resourceGroupName, String namespaceName, String eventHubName, String consumerGroupName, ConsumerGroupCreateOrUpdateParameters parameters) {
        return createOrUpdateWithServiceResponseAsync(resourceGroupName, namespaceName, eventHubName, consumerGroupName, parameters).toBlocking().single().body();
    }

    /**
     * Creates or updates an Event Hubs consumer group as a nested resource within a Namespace.
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name
     * @param eventHubName The Event Hub name
     * @param consumerGroupName The consumer group name
     * @param parameters Parameters supplied to create or update a consumer group resource.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ConsumerGroupResourceInner> createOrUpdateAsync(String resourceGroupName, String namespaceName, String eventHubName, String consumerGroupName, ConsumerGroupCreateOrUpdateParameters parameters, final ServiceCallback<ConsumerGroupResourceInner> serviceCallback) {
        return ServiceFuture.fromResponse(createOrUpdateWithServiceResponseAsync(resourceGroupName, namespaceName, eventHubName, consumerGroupName, parameters), serviceCallback);
    }

    /**
     * Creates or updates an Event Hubs consumer group as a nested resource within a Namespace.
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name
     * @param eventHubName The Event Hub name
     * @param consumerGroupName The consumer group name
     * @param parameters Parameters supplied to create or update a consumer group resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ConsumerGroupResourceInner object
     */
    public Observable<ConsumerGroupResourceInner> createOrUpdateAsync(String resourceGroupName, String namespaceName, String eventHubName, String consumerGroupName, ConsumerGroupCreateOrUpdateParameters parameters) {
        return createOrUpdateWithServiceResponseAsync(resourceGroupName, namespaceName, eventHubName, consumerGroupName, parameters).map(new Func1<ServiceResponse<ConsumerGroupResourceInner>, ConsumerGroupResourceInner>() {
            @Override
            public ConsumerGroupResourceInner call(ServiceResponse<ConsumerGroupResourceInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Creates or updates an Event Hubs consumer group as a nested resource within a Namespace.
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name
     * @param eventHubName The Event Hub name
     * @param consumerGroupName The consumer group name
     * @param parameters Parameters supplied to create or update a consumer group resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ConsumerGroupResourceInner object
     */
    public Observable<ServiceResponse<ConsumerGroupResourceInner>> createOrUpdateWithServiceResponseAsync(String resourceGroupName, String namespaceName, String eventHubName, String consumerGroupName, ConsumerGroupCreateOrUpdateParameters parameters) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (namespaceName == null) {
            throw new IllegalArgumentException("Parameter namespaceName is required and cannot be null.");
        }
        if (eventHubName == null) {
            throw new IllegalArgumentException("Parameter eventHubName is required and cannot be null.");
        }
        if (consumerGroupName == null) {
            throw new IllegalArgumentException("Parameter consumerGroupName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (parameters == null) {
            throw new IllegalArgumentException("Parameter parameters is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        Validator.validate(parameters);
        return service.createOrUpdate(resourceGroupName, namespaceName, eventHubName, consumerGroupName, this.client.subscriptionId(), parameters, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ConsumerGroupResourceInner>>>() {
                @Override
                public Observable<ServiceResponse<ConsumerGroupResourceInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ConsumerGroupResourceInner> clientResponse = createOrUpdateDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<ConsumerGroupResourceInner> createOrUpdateDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<ConsumerGroupResourceInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<ConsumerGroupResourceInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Deletes a consumer group from the specified Event Hub and resource group.
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name
     * @param eventHubName The Event Hub name
     * @param consumerGroupName The consumer group name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void delete(String resourceGroupName, String namespaceName, String eventHubName, String consumerGroupName) {
        deleteWithServiceResponseAsync(resourceGroupName, namespaceName, eventHubName, consumerGroupName).toBlocking().single().body();
    }

    /**
     * Deletes a consumer group from the specified Event Hub and resource group.
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name
     * @param eventHubName The Event Hub name
     * @param consumerGroupName The consumer group name
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> deleteAsync(String resourceGroupName, String namespaceName, String eventHubName, String consumerGroupName, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(deleteWithServiceResponseAsync(resourceGroupName, namespaceName, eventHubName, consumerGroupName), serviceCallback);
    }

    /**
     * Deletes a consumer group from the specified Event Hub and resource group.
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name
     * @param eventHubName The Event Hub name
     * @param consumerGroupName The consumer group name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> deleteAsync(String resourceGroupName, String namespaceName, String eventHubName, String consumerGroupName) {
        return deleteWithServiceResponseAsync(resourceGroupName, namespaceName, eventHubName, consumerGroupName).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * Deletes a consumer group from the specified Event Hub and resource group.
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name
     * @param eventHubName The Event Hub name
     * @param consumerGroupName The consumer group name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> deleteWithServiceResponseAsync(String resourceGroupName, String namespaceName, String eventHubName, String consumerGroupName) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (namespaceName == null) {
            throw new IllegalArgumentException("Parameter namespaceName is required and cannot be null.");
        }
        if (eventHubName == null) {
            throw new IllegalArgumentException("Parameter eventHubName is required and cannot be null.");
        }
        if (consumerGroupName == null) {
            throw new IllegalArgumentException("Parameter consumerGroupName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.delete(resourceGroupName, namespaceName, eventHubName, consumerGroupName, this.client.subscriptionId(), this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = deleteDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Void> deleteDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<Void, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .register(204, new TypeToken<Void>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Gets a description for the specified consumer group.
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name
     * @param eventHubName The Event Hub name
     * @param consumerGroupName The consumer group name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ConsumerGroupResourceInner object if successful.
     */
    public ConsumerGroupResourceInner get(String resourceGroupName, String namespaceName, String eventHubName, String consumerGroupName) {
        return getWithServiceResponseAsync(resourceGroupName, namespaceName, eventHubName, consumerGroupName).toBlocking().single().body();
    }

    /**
     * Gets a description for the specified consumer group.
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name
     * @param eventHubName The Event Hub name
     * @param consumerGroupName The consumer group name
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ConsumerGroupResourceInner> getAsync(String resourceGroupName, String namespaceName, String eventHubName, String consumerGroupName, final ServiceCallback<ConsumerGroupResourceInner> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(resourceGroupName, namespaceName, eventHubName, consumerGroupName), serviceCallback);
    }

    /**
     * Gets a description for the specified consumer group.
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name
     * @param eventHubName The Event Hub name
     * @param consumerGroupName The consumer group name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ConsumerGroupResourceInner object
     */
    public Observable<ConsumerGroupResourceInner> getAsync(String resourceGroupName, String namespaceName, String eventHubName, String consumerGroupName) {
        return getWithServiceResponseAsync(resourceGroupName, namespaceName, eventHubName, consumerGroupName).map(new Func1<ServiceResponse<ConsumerGroupResourceInner>, ConsumerGroupResourceInner>() {
            @Override
            public ConsumerGroupResourceInner call(ServiceResponse<ConsumerGroupResourceInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets a description for the specified consumer group.
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name
     * @param eventHubName The Event Hub name
     * @param consumerGroupName The consumer group name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ConsumerGroupResourceInner object
     */
    public Observable<ServiceResponse<ConsumerGroupResourceInner>> getWithServiceResponseAsync(String resourceGroupName, String namespaceName, String eventHubName, String consumerGroupName) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (namespaceName == null) {
            throw new IllegalArgumentException("Parameter namespaceName is required and cannot be null.");
        }
        if (eventHubName == null) {
            throw new IllegalArgumentException("Parameter eventHubName is required and cannot be null.");
        }
        if (consumerGroupName == null) {
            throw new IllegalArgumentException("Parameter consumerGroupName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.get(resourceGroupName, namespaceName, eventHubName, consumerGroupName, this.client.subscriptionId(), this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ConsumerGroupResourceInner>>>() {
                @Override
                public Observable<ServiceResponse<ConsumerGroupResourceInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ConsumerGroupResourceInner> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<ConsumerGroupResourceInner> getDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<ConsumerGroupResourceInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<ConsumerGroupResourceInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Gets all the consumer groups in a Namespace. An empty feed is returned if no consumer group exists in the Namespace.
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name
     * @param eventHubName The Event Hub name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;ConsumerGroupResourceInner&gt; object if successful.
     */
    public PagedList<ConsumerGroupResourceInner> listAll(final String resourceGroupName, final String namespaceName, final String eventHubName) {
        ServiceResponse<Page<ConsumerGroupResourceInner>> response = listAllSinglePageAsync(resourceGroupName, namespaceName, eventHubName).toBlocking().single();
        return new PagedList<ConsumerGroupResourceInner>(response.body()) {
            @Override
            public Page<ConsumerGroupResourceInner> nextPage(String nextPageLink) {
                return listAllNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Gets all the consumer groups in a Namespace. An empty feed is returned if no consumer group exists in the Namespace.
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name
     * @param eventHubName The Event Hub name
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<ConsumerGroupResourceInner>> listAllAsync(final String resourceGroupName, final String namespaceName, final String eventHubName, final ListOperationCallback<ConsumerGroupResourceInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listAllSinglePageAsync(resourceGroupName, namespaceName, eventHubName),
            new Func1<String, Observable<ServiceResponse<Page<ConsumerGroupResourceInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ConsumerGroupResourceInner>>> call(String nextPageLink) {
                    return listAllNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Gets all the consumer groups in a Namespace. An empty feed is returned if no consumer group exists in the Namespace.
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name
     * @param eventHubName The Event Hub name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;ConsumerGroupResourceInner&gt; object
     */
    public Observable<Page<ConsumerGroupResourceInner>> listAllAsync(final String resourceGroupName, final String namespaceName, final String eventHubName) {
        return listAllWithServiceResponseAsync(resourceGroupName, namespaceName, eventHubName)
            .map(new Func1<ServiceResponse<Page<ConsumerGroupResourceInner>>, Page<ConsumerGroupResourceInner>>() {
                @Override
                public Page<ConsumerGroupResourceInner> call(ServiceResponse<Page<ConsumerGroupResourceInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Gets all the consumer groups in a Namespace. An empty feed is returned if no consumer group exists in the Namespace.
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name
     * @param eventHubName The Event Hub name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;ConsumerGroupResourceInner&gt; object
     */
    public Observable<ServiceResponse<Page<ConsumerGroupResourceInner>>> listAllWithServiceResponseAsync(final String resourceGroupName, final String namespaceName, final String eventHubName) {
        return listAllSinglePageAsync(resourceGroupName, namespaceName, eventHubName)
            .concatMap(new Func1<ServiceResponse<Page<ConsumerGroupResourceInner>>, Observable<ServiceResponse<Page<ConsumerGroupResourceInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ConsumerGroupResourceInner>>> call(ServiceResponse<Page<ConsumerGroupResourceInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listAllNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Gets all the consumer groups in a Namespace. An empty feed is returned if no consumer group exists in the Namespace.
     *
    ServiceResponse<PageImpl<ConsumerGroupResourceInner>> * @param resourceGroupName Name of the resource group within the azure subscription.
    ServiceResponse<PageImpl<ConsumerGroupResourceInner>> * @param namespaceName The Namespace name
    ServiceResponse<PageImpl<ConsumerGroupResourceInner>> * @param eventHubName The Event Hub name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;ConsumerGroupResourceInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<ConsumerGroupResourceInner>>> listAllSinglePageAsync(final String resourceGroupName, final String namespaceName, final String eventHubName) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (namespaceName == null) {
            throw new IllegalArgumentException("Parameter namespaceName is required and cannot be null.");
        }
        if (eventHubName == null) {
            throw new IllegalArgumentException("Parameter eventHubName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.listAll(resourceGroupName, namespaceName, eventHubName, this.client.subscriptionId(), this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<ConsumerGroupResourceInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ConsumerGroupResourceInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<ConsumerGroupResourceInner>> result = listAllDelegate(response);
                        return Observable.just(new ServiceResponse<Page<ConsumerGroupResourceInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<ConsumerGroupResourceInner>> listAllDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<ConsumerGroupResourceInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<ConsumerGroupResourceInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Gets all the consumer groups in a Namespace. An empty feed is returned if no consumer group exists in the Namespace.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;ConsumerGroupResourceInner&gt; object if successful.
     */
    public PagedList<ConsumerGroupResourceInner> listAllNext(final String nextPageLink) {
        ServiceResponse<Page<ConsumerGroupResourceInner>> response = listAllNextSinglePageAsync(nextPageLink).toBlocking().single();
        return new PagedList<ConsumerGroupResourceInner>(response.body()) {
            @Override
            public Page<ConsumerGroupResourceInner> nextPage(String nextPageLink) {
                return listAllNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Gets all the consumer groups in a Namespace. An empty feed is returned if no consumer group exists in the Namespace.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceFuture the ServiceFuture object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<ConsumerGroupResourceInner>> listAllNextAsync(final String nextPageLink, final ServiceFuture<List<ConsumerGroupResourceInner>> serviceFuture, final ListOperationCallback<ConsumerGroupResourceInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listAllNextSinglePageAsync(nextPageLink),
            new Func1<String, Observable<ServiceResponse<Page<ConsumerGroupResourceInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ConsumerGroupResourceInner>>> call(String nextPageLink) {
                    return listAllNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Gets all the consumer groups in a Namespace. An empty feed is returned if no consumer group exists in the Namespace.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;ConsumerGroupResourceInner&gt; object
     */
    public Observable<Page<ConsumerGroupResourceInner>> listAllNextAsync(final String nextPageLink) {
        return listAllNextWithServiceResponseAsync(nextPageLink)
            .map(new Func1<ServiceResponse<Page<ConsumerGroupResourceInner>>, Page<ConsumerGroupResourceInner>>() {
                @Override
                public Page<ConsumerGroupResourceInner> call(ServiceResponse<Page<ConsumerGroupResourceInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Gets all the consumer groups in a Namespace. An empty feed is returned if no consumer group exists in the Namespace.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;ConsumerGroupResourceInner&gt; object
     */
    public Observable<ServiceResponse<Page<ConsumerGroupResourceInner>>> listAllNextWithServiceResponseAsync(final String nextPageLink) {
        return listAllNextSinglePageAsync(nextPageLink)
            .concatMap(new Func1<ServiceResponse<Page<ConsumerGroupResourceInner>>, Observable<ServiceResponse<Page<ConsumerGroupResourceInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ConsumerGroupResourceInner>>> call(ServiceResponse<Page<ConsumerGroupResourceInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listAllNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Gets all the consumer groups in a Namespace. An empty feed is returned if no consumer group exists in the Namespace.
     *
    ServiceResponse<PageImpl<ConsumerGroupResourceInner>> * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;ConsumerGroupResourceInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<ConsumerGroupResourceInner>>> listAllNextSinglePageAsync(final String nextPageLink) {
        if (nextPageLink == null) {
            throw new IllegalArgumentException("Parameter nextPageLink is required and cannot be null.");
        }
        String nextUrl = String.format("%s", nextPageLink);
        return service.listAllNext(nextUrl, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<ConsumerGroupResourceInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ConsumerGroupResourceInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<ConsumerGroupResourceInner>> result = listAllNextDelegate(response);
                        return Observable.just(new ServiceResponse<Page<ConsumerGroupResourceInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<ConsumerGroupResourceInner>> listAllNextDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<ConsumerGroupResourceInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<ConsumerGroupResourceInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
