// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Call;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.models.extensions.Call;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.serializer.IJsonBackedObject;


// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Call With Reference Request.
 */
public interface ICallWithReferenceRequest extends IHttpRequest {

    void post(final Call newCall, final IJsonBackedObject payload, final ICallback<? super Call> callback);

    Call post(final Call newCall, final IJsonBackedObject payload) throws ClientException;

    void get(final ICallback<? super Call> callback);

    Call get() throws ClientException;

	void delete(final ICallback<? super Call> callback);

	void delete() throws ClientException;

	void patch(final Call sourceCall, final ICallback<? super Call> callback);

	Call patch(final Call sourceCall) throws ClientException;

    ICallWithReferenceRequest select(final String value);

    ICallWithReferenceRequest expand(final String value);

}
