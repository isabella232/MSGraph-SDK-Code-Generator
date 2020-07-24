// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph2.callrecords.requests.extensions;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph2.callrecords.models.extensions.*;
import com.microsoft.graph2.callrecords.models.generated.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph2.callrecords.requests.extensions.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Photo Stream Request Builder.
 */
public interface IPhotoStreamRequestBuilder extends IRequestBuilder {

    /**
     * Creates the request
     *
     * @return the IPhotoStreamRequest instance
     */
    IPhotoStreamRequest buildRequest();

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the IPhotoStreamRequest instance
     */
    IPhotoStreamRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);




}