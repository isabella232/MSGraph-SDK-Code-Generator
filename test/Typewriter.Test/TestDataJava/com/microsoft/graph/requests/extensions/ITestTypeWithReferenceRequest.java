// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.TestType;
import com.microsoft.graph.models.extensions.DerivedComplexTypeRequest;
import com.microsoft.graph.models.extensions.ResponseObject;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.models.extensions.TestType;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.serializer.IJsonBackedObject;


// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Test Type With Reference Request.
 */
public interface ITestTypeWithReferenceRequest extends IHttpRequest {

    void post(final TestType newTestType, final IJsonBackedObject payload, final ICallback<? super TestType> callback);

    TestType post(final TestType newTestType, final IJsonBackedObject payload) throws ClientException;

    void get(final ICallback<? super TestType> callback);

    TestType get() throws ClientException;

	void delete(final ICallback<? super TestType> callback);

	void delete() throws ClientException;

	void patch(final TestType sourceTestType, final ICallback<? super TestType> callback);

	TestType patch(final TestType sourceTestType) throws ClientException;

    ITestTypeWithReferenceRequest select(final String value);

    ITestTypeWithReferenceRequest expand(final String value);

}
