/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2018_03_30_preview.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.management.mediaservices.v2018_03_30_preview.ApiErrorException;
import com.microsoft.azure.management.mediaservices.v2018_03_30_preview.CheckNameAvailabilityInput;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.Validator;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in Locations.
 */
public class LocationsInner {
    /** The Retrofit service to perform REST calls. */
    private LocationsService service;
    /** The service client containing this operation class. */
    private AzureMediaServicesImpl client;

    /**
     * Initializes an instance of LocationsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public LocationsInner(Retrofit retrofit, AzureMediaServicesImpl client) {
        this.service = retrofit.create(LocationsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for Locations to be
     * used by Retrofit to perform actually REST calls.
     */
    interface LocationsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.mediaservices.v2018_03_30_preview.Locations checkNameAvailability" })
        @POST("subscriptions/{subscriptionId}/providers/Microsoft.Media/locations/{locationName}/checkNameAvailability")
        Observable<Response<ResponseBody>> checkNameAvailability(@Path("subscriptionId") String subscriptionId, @Path("locationName") String locationName, @Body CheckNameAvailabilityInput parameters, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Check Name Availability.
     * Checks whether the Media Service resource name is available.
     *
     * @param locationName the String value
     * @param parameters The request parameters
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ApiErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the EntityNameAvailabilityCheckOutputInner object if successful.
     */
    public EntityNameAvailabilityCheckOutputInner checkNameAvailability(String locationName, CheckNameAvailabilityInput parameters) {
        return checkNameAvailabilityWithServiceResponseAsync(locationName, parameters).toBlocking().single().body();
    }

    /**
     * Check Name Availability.
     * Checks whether the Media Service resource name is available.
     *
     * @param locationName the String value
     * @param parameters The request parameters
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<EntityNameAvailabilityCheckOutputInner> checkNameAvailabilityAsync(String locationName, CheckNameAvailabilityInput parameters, final ServiceCallback<EntityNameAvailabilityCheckOutputInner> serviceCallback) {
        return ServiceFuture.fromResponse(checkNameAvailabilityWithServiceResponseAsync(locationName, parameters), serviceCallback);
    }

    /**
     * Check Name Availability.
     * Checks whether the Media Service resource name is available.
     *
     * @param locationName the String value
     * @param parameters The request parameters
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the EntityNameAvailabilityCheckOutputInner object
     */
    public Observable<EntityNameAvailabilityCheckOutputInner> checkNameAvailabilityAsync(String locationName, CheckNameAvailabilityInput parameters) {
        return checkNameAvailabilityWithServiceResponseAsync(locationName, parameters).map(new Func1<ServiceResponse<EntityNameAvailabilityCheckOutputInner>, EntityNameAvailabilityCheckOutputInner>() {
            @Override
            public EntityNameAvailabilityCheckOutputInner call(ServiceResponse<EntityNameAvailabilityCheckOutputInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Check Name Availability.
     * Checks whether the Media Service resource name is available.
     *
     * @param locationName the String value
     * @param parameters The request parameters
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the EntityNameAvailabilityCheckOutputInner object
     */
    public Observable<ServiceResponse<EntityNameAvailabilityCheckOutputInner>> checkNameAvailabilityWithServiceResponseAsync(String locationName, CheckNameAvailabilityInput parameters) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (locationName == null) {
            throw new IllegalArgumentException("Parameter locationName is required and cannot be null.");
        }
        if (parameters == null) {
            throw new IllegalArgumentException("Parameter parameters is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        Validator.validate(parameters);
        return service.checkNameAvailability(this.client.subscriptionId(), locationName, parameters, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<EntityNameAvailabilityCheckOutputInner>>>() {
                @Override
                public Observable<ServiceResponse<EntityNameAvailabilityCheckOutputInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<EntityNameAvailabilityCheckOutputInner> clientResponse = checkNameAvailabilityDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<EntityNameAvailabilityCheckOutputInner> checkNameAvailabilityDelegate(Response<ResponseBody> response) throws ApiErrorException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<EntityNameAvailabilityCheckOutputInner, ApiErrorException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<EntityNameAvailabilityCheckOutputInner>() { }.getType())
                .registerError(ApiErrorException.class)
                .build(response);
    }

}
