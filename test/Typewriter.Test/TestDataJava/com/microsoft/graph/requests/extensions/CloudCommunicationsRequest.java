// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.CloudCommunications;
import com.microsoft.graph.requests.extensions.ICallCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ICallRequestBuilder;
import com.microsoft.graph.requests.extensions.CallCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.CallRequestBuilder;
import com.microsoft.graph2.callrecords.requests.extensions.ICallRecordCollectionRequestBuilder;
import com.microsoft.graph2.callrecords.requests.extensions.ICallRecordRequestBuilder;
import com.microsoft.graph2.callrecords.requests.extensions.CallRecordCollectionRequestBuilder;
import com.microsoft.graph2.callrecords.requests.extensions.CallRecordRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Cloud Communications Request.
 */
public class CloudCommunicationsRequest extends BaseRequest implements ICloudCommunicationsRequest {
	
    /**
     * The request for the CloudCommunications
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public CloudCommunicationsRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, CloudCommunications.class);
    }

    /**
     * Gets the CloudCommunications from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<CloudCommunications> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the CloudCommunications from the service
     *
     * @return the CloudCommunications from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public CloudCommunications get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<CloudCommunications> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {
        send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this CloudCommunications with a source
     *
     * @param sourceCloudCommunications the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final CloudCommunications sourceCloudCommunications, final ICallback<CloudCommunications> callback) {
        send(HttpMethod.PATCH, callback, sourceCloudCommunications);
    }

    /**
     * Patches this CloudCommunications with a source
     *
     * @param sourceCloudCommunications the source object with updates
     * @return the updated CloudCommunications
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public CloudCommunications patch(final CloudCommunications sourceCloudCommunications) throws ClientException {
        return send(HttpMethod.PATCH, sourceCloudCommunications);
    }

    /**
     * Creates a CloudCommunications with a new object
     *
     * @param newCloudCommunications the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final CloudCommunications newCloudCommunications, final ICallback<CloudCommunications> callback) {
        send(HttpMethod.POST, callback, newCloudCommunications);
    }

    /**
     * Creates a CloudCommunications with a new object
     *
     * @param newCloudCommunications the new object to create
     * @return the created CloudCommunications
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public CloudCommunications post(final CloudCommunications newCloudCommunications) throws ClientException {
        return send(HttpMethod.POST, newCloudCommunications);
    }

    /**
     * Creates a CloudCommunications with a new object
     *
     * @param newCloudCommunications the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final CloudCommunications newCloudCommunications, final ICallback<CloudCommunications> callback) {
        send(HttpMethod.PUT, callback, newCloudCommunications);
    }

    /**
     * Creates a CloudCommunications with a new object
     *
     * @param newCloudCommunications the object to create/update
     * @return the created CloudCommunications
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public CloudCommunications put(final CloudCommunications newCloudCommunications) throws ClientException {
        return send(HttpMethod.PUT, newCloudCommunications);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public ICloudCommunicationsRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (CloudCommunicationsRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public ICloudCommunicationsRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (CloudCommunicationsRequest)this;
     }

}

