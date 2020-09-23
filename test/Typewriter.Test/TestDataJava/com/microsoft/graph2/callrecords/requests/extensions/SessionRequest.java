// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph2.callrecords.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph2.callrecords.models.extensions.Session;
import com.microsoft.graph2.callrecords.requests.extensions.ISegmentCollectionRequestBuilder;
import com.microsoft.graph2.callrecords.requests.extensions.ISegmentRequestBuilder;
import com.microsoft.graph2.callrecords.requests.extensions.SegmentCollectionRequestBuilder;
import com.microsoft.graph2.callrecords.requests.extensions.SegmentRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Session Request.
 */
public class SessionRequest extends BaseRequest implements ISessionRequest {
	
    /**
     * The request for the Session
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public SessionRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, Session.class);
    }

    /**
     * Gets the Session from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super Session> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the Session from the service
     *
     * @return the Session from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Session get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super Session> callback) {
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
     * Patches this Session with a source
     *
     * @param sourceSession the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final Session sourceSession, final ICallback<? super Session> callback) {
        send(HttpMethod.PATCH, callback, sourceSession);
    }

    /**
     * Patches this Session with a source
     *
     * @param sourceSession the source object with updates
     * @return the updated Session
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Session patch(final Session sourceSession) throws ClientException {
        return send(HttpMethod.PATCH, sourceSession);
    }

    /**
     * Creates a Session with a new object
     *
     * @param newSession the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final Session newSession, final ICallback<? super Session> callback) {
        send(HttpMethod.POST, callback, newSession);
    }

    /**
     * Creates a Session with a new object
     *
     * @param newSession the new object to create
     * @return the created Session
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Session post(final Session newSession) throws ClientException {
        return send(HttpMethod.POST, newSession);
    }

    /**
     * Creates a Session with a new object
     *
     * @param newSession the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final Session newSession, final ICallback<? super Session> callback) {
        send(HttpMethod.PUT, callback, newSession);
    }

    /**
     * Creates a Session with a new object
     *
     * @param newSession the object to create/update
     * @return the created Session
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Session put(final Session newSession) throws ClientException {
        return send(HttpMethod.PUT, newSession);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public ISessionRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (SessionRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public ISessionRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (SessionRequest)this;
     }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
     public ISessionRequest filter(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$filter", value));
         return (SessionRequest)this;
     }

}

