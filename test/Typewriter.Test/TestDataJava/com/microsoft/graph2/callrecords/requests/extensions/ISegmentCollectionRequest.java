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
 * The interface for the Segment Collection Request.
 */
public interface ISegmentCollectionRequest {

    void get(final ICallback<ISegmentCollectionPage> callback);

    ISegmentCollectionPage get() throws ClientException;

    void post(final Segment newSegment, final ICallback<Segment> callback);

    Segment post(final Segment newSegment) throws ClientException;

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    ISegmentCollectionRequest expand(final String value);

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    ISegmentCollectionRequest select(final String value);

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    ISegmentCollectionRequest top(final int value);

}