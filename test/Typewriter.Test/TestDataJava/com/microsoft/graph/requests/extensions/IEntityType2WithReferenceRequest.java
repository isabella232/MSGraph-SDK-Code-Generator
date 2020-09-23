// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.EntityType2;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.models.extensions.EntityType2;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.serializer.IJsonBackedObject;


// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Entity Type2With Reference Request.
 */
public interface IEntityType2WithReferenceRequest extends IHttpRequest {

    void post(final EntityType2 newEntityType2, final IJsonBackedObject payload, final ICallback<? super EntityType2> callback);

    EntityType2 post(final EntityType2 newEntityType2, final IJsonBackedObject payload) throws ClientException;

    void get(final ICallback<? super EntityType2> callback);

    EntityType2 get() throws ClientException;

	void delete(final ICallback<? super EntityType2> callback);

	void delete() throws ClientException;

	void patch(final EntityType2 sourceEntityType2, final ICallback<? super EntityType2> callback);

	EntityType2 patch(final EntityType2 sourceEntityType2) throws ClientException;

    IEntityType2WithReferenceRequest select(final String value);

    IEntityType2WithReferenceRequest expand(final String value);

}
