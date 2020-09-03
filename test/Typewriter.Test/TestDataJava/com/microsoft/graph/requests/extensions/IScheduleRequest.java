// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.Schedule;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Schedule Request.
 */
public interface IScheduleRequest extends IHttpRequest {

    /**
     * Gets the Schedule from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<Schedule> callback);

    /**
     * Gets the Schedule from the service
     *
     * @return the Schedule from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Schedule get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<Schedule> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this Schedule with a source
     *
     * @param sourceSchedule the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final Schedule sourceSchedule, final ICallback<Schedule> callback);

    /**
     * Patches this Schedule with a source
     *
     * @param sourceSchedule the source object with updates
     * @return the updated Schedule
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Schedule patch(final Schedule sourceSchedule) throws ClientException;

    /**
     * Posts a Schedule with a new object
     *
     * @param newSchedule the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final Schedule newSchedule, final ICallback<Schedule> callback);

    /**
     * Posts a Schedule with a new object
     *
     * @param newSchedule the new object to create
     * @return the created Schedule
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Schedule post(final Schedule newSchedule) throws ClientException;

    /**
     * Posts a Schedule with a new object
     *
     * @param newSchedule the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final Schedule newSchedule, final ICallback<Schedule> callback);

    /**
     * Posts a Schedule with a new object
     *
     * @param newSchedule the object to create/update
     * @return the created Schedule
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Schedule put(final Schedule newSchedule) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IScheduleRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IScheduleRequest expand(final String value);

}

