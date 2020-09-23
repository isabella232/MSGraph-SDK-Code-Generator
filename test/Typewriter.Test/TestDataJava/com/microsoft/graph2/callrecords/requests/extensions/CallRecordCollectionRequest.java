// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph2.callrecords.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.CloudCommunications;
import com.microsoft.graph2.callrecords.models.extensions.CallRecord;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph2.callrecords.requests.extensions.ICallRecordCollectionPage;
import com.microsoft.graph2.callrecords.requests.extensions.CallRecordCollectionResponse;
import com.microsoft.graph2.callrecords.requests.extensions.ICallRecordCollectionRequestBuilder;
import com.microsoft.graph2.callrecords.requests.extensions.ICallRecordCollectionRequest;
import com.microsoft.graph2.callrecords.requests.extensions.CallRecordCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Call Record Collection Request.
 */
public class CallRecordCollectionRequest extends BaseCollectionRequest<CallRecordCollectionResponse, ICallRecordCollectionPage> implements ICallRecordCollectionRequest {

    /**
     * The request builder for this collection of CallRecord
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public CallRecordCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, CallRecordCollectionResponse.class, ICallRecordCollectionPage.class);
    }

    public void get(final ICallback<? super ICallRecordCollectionPage> callback) {
        final IExecutors executors = getBaseRequest().getClient().getExecutors();
        executors.performOnBackground(new Runnable() {
           @Override
           public void run() {
                try {
                    executors.performOnForeground(get(), callback);
                } catch (final ClientException e) {
                    executors.performOnForeground(e, callback);
                }
           }
        });
    }

    public ICallRecordCollectionPage get() throws ClientException {
        final CallRecordCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final CallRecord newCallRecord, final ICallback<? super CallRecord> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new CallRecordRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newCallRecord, callback);
    }

    public CallRecord post(final CallRecord newCallRecord) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new CallRecordRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newCallRecord);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public ICallRecordCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (CallRecordCollectionRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public ICallRecordCollectionRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (CallRecordCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public ICallRecordCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (CallRecordCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public ICallRecordCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (CallRecordCollectionRequest)this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    public ICallRecordCollectionRequest skip(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$skip", value + ""));
        return (CallRecordCollectionRequest)this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    public ICallRecordCollectionRequest skipToken(final String skipToken) {
    	addQueryOption(new QueryOption("$skiptoken", skipToken));
        return (ICallRecordCollectionRequest)this;
    }
    public ICallRecordCollectionPage buildFromResponse(final CallRecordCollectionResponse response) {
        final ICallRecordCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new CallRecordCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final CallRecordCollectionPage page = new CallRecordCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
