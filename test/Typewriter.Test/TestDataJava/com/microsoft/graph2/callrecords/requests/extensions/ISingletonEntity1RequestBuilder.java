// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph2.callrecords.requests.extensions;
import com.microsoft.graph2.callrecords.requests.extensions.ISingletonEntity1Request;
import com.microsoft.graph.requests.extensions.ITestTypeRequestBuilder;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Singleton Entity1Request Builder.
 */
public interface ISingletonEntity1RequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @return the ISingletonEntity1Request instance
     */
    ISingletonEntity1Request buildRequest();

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the ISingletonEntity1Request instance
     */
    ISingletonEntity1Request buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);


    /**
     * Gets the request builder for TestType
     *
     * @return the ITestTypeRequestBuilder instance
     */
    ITestTypeRequestBuilder testSingleNav();

}
