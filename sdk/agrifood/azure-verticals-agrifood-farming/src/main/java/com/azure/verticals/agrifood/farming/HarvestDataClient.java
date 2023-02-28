// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.verticals.agrifood.farming;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.exception.ClientAuthenticationException;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.exception.ResourceModifiedException;
import com.azure.core.exception.ResourceNotFoundException;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import com.azure.core.util.polling.SyncPoller;

/** Initializes a new instance of the synchronous FarmBeatsClient type. */
@ServiceClient(builder = HarvestDataClientBuilder.class)
public final class HarvestDataClient {
    @Generated private final HarvestDataAsyncClient client;

    /**
     * Initializes an instance of HarvestDataClient class.
     *
     * @param client the async client.
     */
    @Generated
    HarvestDataClient(HarvestDataAsyncClient client) {
        this.client = client;
    }

    /**
     * Returns a paginated list of harvest data resources across all parties.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>minTotalYield</td><td>Double</td><td>No</td><td>Minimum Yield value(inclusive).</td></tr>
     *     <tr><td>maxTotalYield</td><td>Double</td><td>No</td><td>Maximum Yield value (inclusive).</td></tr>
     *     <tr><td>minAvgYield</td><td>Double</td><td>No</td><td>Minimum AvgYield value(inclusive).</td></tr>
     *     <tr><td>maxAvgYield</td><td>Double</td><td>No</td><td>Maximum AvgYield value (inclusive).</td></tr>
     *     <tr><td>minTotalWetMass</td><td>Double</td><td>No</td><td>Minimum Total WetMass value(inclusive).</td></tr>
     *     <tr><td>maxTotalWetMass</td><td>Double</td><td>No</td><td>Maximum Total WetMass value (inclusive).</td></tr>
     *     <tr><td>minAvgWetMass</td><td>Double</td><td>No</td><td>Minimum AvgWetMass value(inclusive).</td></tr>
     *     <tr><td>maxAvgWetMass</td><td>Double</td><td>No</td><td>Maximum AvgWetMass value (inclusive).</td></tr>
     *     <tr><td>minAvgMoisture</td><td>Double</td><td>No</td><td>Minimum AvgMoisture value(inclusive).</td></tr>
     *     <tr><td>maxAvgMoisture</td><td>Double</td><td>No</td><td>Maximum AvgMoisture value (inclusive).</td></tr>
     *     <tr><td>minAvgSpeed</td><td>Double</td><td>No</td><td>Minimum AvgSpeed value(inclusive).</td></tr>
     *     <tr><td>maxAvgSpeed</td><td>Double</td><td>No</td><td>Maximum AvgSpeed value (inclusive).</td></tr>
     *     <tr><td>sources</td><td>List&lt;String&gt;</td><td>No</td><td>Sources of the operation data. Call {@link RequestOptions#addQueryParam} to add string to array.</td></tr>
     *     <tr><td>associatedBoundaryIds</td><td>List&lt;String&gt;</td><td>No</td><td>Boundary IDs associated with operation data. Call {@link RequestOptions#addQueryParam} to add string to array.</td></tr>
     *     <tr><td>minOperationStartDateTime</td><td>OffsetDateTime</td><td>No</td><td>Minimum start date-time of the operation data, sample format: yyyy-MM-ddTHH:mm:ssZ (inclusive).</td></tr>
     *     <tr><td>maxOperationStartDateTime</td><td>OffsetDateTime</td><td>No</td><td>Maximum start date-time of the operation data, sample format: yyyy-MM-ddTHH:mm:ssZ (inclusive).</td></tr>
     *     <tr><td>minOperationEndDateTime</td><td>OffsetDateTime</td><td>No</td><td>Minimum end date-time of the operation data, sample format: yyyy-MM-ddTHH:mm:ssZ (inclusive).</td></tr>
     *     <tr><td>maxOperationEndDateTime</td><td>OffsetDateTime</td><td>No</td><td>Maximum end date-time of the operation data, sample format: yyyy-MM-ddTHH:mm:ssZ (inclusive).</td></tr>
     *     <tr><td>minOperationModifiedDateTime</td><td>OffsetDateTime</td><td>No</td><td>Minimum modified date-time of the operation data, sample format: yyyy-MM-ddTHH:mm:ssZ (inclusive).</td></tr>
     *     <tr><td>maxOperationModifiedDateTime</td><td>OffsetDateTime</td><td>No</td><td>Maximum modified date-time of the operation data, sample format: yyyy-MM-ddTHH:mm:ssZ (inclusive).</td></tr>
     *     <tr><td>minArea</td><td>Double</td><td>No</td><td>Minimum area for which operation was applied (inclusive).</td></tr>
     *     <tr><td>maxArea</td><td>Double</td><td>No</td><td>Maximum area for which operation was applied (inclusive).</td></tr>
     *     <tr><td>ids</td><td>List&lt;String&gt;</td><td>No</td><td>Ids of the resource. Call {@link RequestOptions#addQueryParam} to add string to array.</td></tr>
     *     <tr><td>names</td><td>List&lt;String&gt;</td><td>No</td><td>Names of the resource. Call {@link RequestOptions#addQueryParam} to add string to array.</td></tr>
     *     <tr><td>propertyFilters</td><td>List&lt;String&gt;</td><td>No</td><td>Filters on key-value pairs within the Properties object.
     * eg. "{testKey} eq {testValue}". Call {@link RequestOptions#addQueryParam} to add string to array.</td></tr>
     *     <tr><td>statuses</td><td>List&lt;String&gt;</td><td>No</td><td>Statuses of the resource. Call {@link RequestOptions#addQueryParam} to add string to array.</td></tr>
     *     <tr><td>minCreatedDateTime</td><td>OffsetDateTime</td><td>No</td><td>Minimum creation date of resource (inclusive).</td></tr>
     *     <tr><td>maxCreatedDateTime</td><td>OffsetDateTime</td><td>No</td><td>Maximum creation date of resource (inclusive).</td></tr>
     *     <tr><td>minLastModifiedDateTime</td><td>OffsetDateTime</td><td>No</td><td>Minimum last modified date of resource (inclusive).</td></tr>
     *     <tr><td>maxLastModifiedDateTime</td><td>OffsetDateTime</td><td>No</td><td>Maximum last modified date of resource (inclusive).</td></tr>
     *     <tr><td>maxPageSize</td><td>Integer</td><td>No</td><td>Maximum number of items needed (inclusive).
     * Minimum = 10, Maximum = 1000, Default value = 50.</td></tr>
     *     <tr><td>skipToken</td><td>String</td><td>No</td><td>Skip token for getting next set of results.</td></tr>
     * </table>
     *
     * You can add these to a request with {@link RequestOptions#addQueryParam}
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     totalYield (Optional): {
     *         unit: String (Optional)
     *         value: Double (Optional)
     *     }
     *     avgYield (Optional): (recursive schema, see avgYield above)
     *     totalWetMass (Optional): (recursive schema, see totalWetMass above)
     *     avgWetMass (Optional): (recursive schema, see avgWetMass above)
     *     avgMoisture (Optional): (recursive schema, see avgMoisture above)
     *     avgSpeed (Optional): (recursive schema, see avgSpeed above)
     *     harvestProductDetails (Optional): [
     *          (Optional){
     *             productName: String (Optional)
     *             area (Optional): (recursive schema, see area above)
     *             totalYield (Optional): (recursive schema, see totalYield above)
     *             avgYield (Optional): (recursive schema, see avgYield above)
     *             avgMoisture (Optional): (recursive schema, see avgMoisture above)
     *             totalWetMass (Optional): (recursive schema, see totalWetMass above)
     *             avgWetMass (Optional): (recursive schema, see avgWetMass above)
     *         }
     *     ]
     *     area (Optional): (recursive schema, see area above)
     *     operationModifiedDateTime: OffsetDateTime (Optional)
     *     operationStartDateTime: OffsetDateTime (Optional)
     *     operationEndDateTime: OffsetDateTime (Optional)
     *     attachmentsLink: String (Optional)
     *     associatedBoundaryId: String (Optional)
     *     partyId: String (Optional)
     *     id: String (Optional)
     *     eTag: String (Optional)
     *     status: String (Optional)
     *     createdDateTime: OffsetDateTime (Optional)
     *     modifiedDateTime: OffsetDateTime (Optional)
     *     source: String (Optional)
     *     name: String (Optional)
     *     description: String (Optional)
     *     createdBy: String (Optional)
     *     modifiedBy: String (Optional)
     *     properties (Optional): {
     *         String: Object (Optional)
     *     }
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return paged response contains list of requested objects and a URL link to get the next set of results as
     *     paginated response with {@link PagedIterable}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<BinaryData> list(RequestOptions requestOptions) {
        return new PagedIterable<>(this.client.list(requestOptions));
    }

    /**
     * Create cascade delete job for harvest data resource.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     partyId: String (Required)
     *     resourceId: String (Required)
     *     resourceType: String (Required)
     *     id: String (Optional)
     *     status: String(Waiting/Running/Succeeded/Failed/Cancelled) (Optional)
     *     durationInSeconds: Double (Optional)
     *     message: String (Optional)
     *     errorCode: String (Optional)
     *     createdDateTime: OffsetDateTime (Optional)
     *     lastActionDateTime: OffsetDateTime (Optional)
     *     startTime: OffsetDateTime (Optional)
     *     endTime: OffsetDateTime (Optional)
     * }
     * }</pre>
     *
     * @param jobId Job Id supplied by end user.
     * @param partyId Id of the party.
     * @param harvestDataId Id of the harvest data.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link SyncPoller} for polling of schema of cascade delete job.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    public SyncPoller<BinaryData, BinaryData> beginCreateCascadeDeleteJob(
            String jobId, String partyId, String harvestDataId, RequestOptions requestOptions) {
        return this.client.beginCreateCascadeDeleteJob(jobId, partyId, harvestDataId, requestOptions).getSyncPoller();
    }

    /**
     * Get cascade delete job for harvest data resource.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     partyId: String (Required)
     *     resourceId: String (Required)
     *     resourceType: String (Required)
     *     id: String (Optional)
     *     status: String(Waiting/Running/Succeeded/Failed/Cancelled) (Optional)
     *     durationInSeconds: Double (Optional)
     *     message: String (Optional)
     *     errorCode: String (Optional)
     *     createdDateTime: OffsetDateTime (Optional)
     *     lastActionDateTime: OffsetDateTime (Optional)
     *     startTime: OffsetDateTime (Optional)
     *     endTime: OffsetDateTime (Optional)
     * }
     * }</pre>
     *
     * @param jobId Id of the job.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return cascade delete job for harvest data resource along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> getCascadeDeleteJobDetailsWithResponse(String jobId, RequestOptions requestOptions) {
        return this.client.getCascadeDeleteJobDetailsWithResponse(jobId, requestOptions).block();
    }

    /**
     * Returns a paginated list of harvest data resources under a particular farm.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>minTotalYield</td><td>Double</td><td>No</td><td>Minimum Yield value(inclusive).</td></tr>
     *     <tr><td>maxTotalYield</td><td>Double</td><td>No</td><td>Maximum Yield value (inclusive).</td></tr>
     *     <tr><td>minAvgYield</td><td>Double</td><td>No</td><td>Minimum AvgYield value(inclusive).</td></tr>
     *     <tr><td>maxAvgYield</td><td>Double</td><td>No</td><td>Maximum AvgYield value (inclusive).</td></tr>
     *     <tr><td>minTotalWetMass</td><td>Double</td><td>No</td><td>Minimum Total WetMass value(inclusive).</td></tr>
     *     <tr><td>maxTotalWetMass</td><td>Double</td><td>No</td><td>Maximum Total WetMass value (inclusive).</td></tr>
     *     <tr><td>minAvgWetMass</td><td>Double</td><td>No</td><td>Minimum AvgWetMass value(inclusive).</td></tr>
     *     <tr><td>maxAvgWetMass</td><td>Double</td><td>No</td><td>Maximum AvgWetMass value (inclusive).</td></tr>
     *     <tr><td>minAvgMoisture</td><td>Double</td><td>No</td><td>Minimum AvgMoisture value(inclusive).</td></tr>
     *     <tr><td>maxAvgMoisture</td><td>Double</td><td>No</td><td>Maximum AvgMoisture value (inclusive).</td></tr>
     *     <tr><td>minAvgSpeed</td><td>Double</td><td>No</td><td>Minimum AvgSpeed value(inclusive).</td></tr>
     *     <tr><td>maxAvgSpeed</td><td>Double</td><td>No</td><td>Maximum AvgSpeed value (inclusive).</td></tr>
     *     <tr><td>sources</td><td>List&lt;String&gt;</td><td>No</td><td>Sources of the operation data. Call {@link RequestOptions#addQueryParam} to add string to array.</td></tr>
     *     <tr><td>associatedBoundaryIds</td><td>List&lt;String&gt;</td><td>No</td><td>Boundary IDs associated with operation data. Call {@link RequestOptions#addQueryParam} to add string to array.</td></tr>
     *     <tr><td>minOperationStartDateTime</td><td>OffsetDateTime</td><td>No</td><td>Minimum start date-time of the operation data, sample format: yyyy-MM-ddTHH:mm:ssZ (inclusive).</td></tr>
     *     <tr><td>maxOperationStartDateTime</td><td>OffsetDateTime</td><td>No</td><td>Maximum start date-time of the operation data, sample format: yyyy-MM-ddTHH:mm:ssZ (inclusive).</td></tr>
     *     <tr><td>minOperationEndDateTime</td><td>OffsetDateTime</td><td>No</td><td>Minimum end date-time of the operation data, sample format: yyyy-MM-ddTHH:mm:ssZ (inclusive).</td></tr>
     *     <tr><td>maxOperationEndDateTime</td><td>OffsetDateTime</td><td>No</td><td>Maximum end date-time of the operation data, sample format: yyyy-MM-ddTHH:mm:ssZ (inclusive).</td></tr>
     *     <tr><td>minOperationModifiedDateTime</td><td>OffsetDateTime</td><td>No</td><td>Minimum modified date-time of the operation data, sample format: yyyy-MM-ddTHH:mm:ssZ (inclusive).</td></tr>
     *     <tr><td>maxOperationModifiedDateTime</td><td>OffsetDateTime</td><td>No</td><td>Maximum modified date-time of the operation data, sample format: yyyy-MM-ddTHH:mm:ssZ (inclusive).</td></tr>
     *     <tr><td>minArea</td><td>Double</td><td>No</td><td>Minimum area for which operation was applied (inclusive).</td></tr>
     *     <tr><td>maxArea</td><td>Double</td><td>No</td><td>Maximum area for which operation was applied (inclusive).</td></tr>
     *     <tr><td>ids</td><td>List&lt;String&gt;</td><td>No</td><td>Ids of the resource. Call {@link RequestOptions#addQueryParam} to add string to array.</td></tr>
     *     <tr><td>names</td><td>List&lt;String&gt;</td><td>No</td><td>Names of the resource. Call {@link RequestOptions#addQueryParam} to add string to array.</td></tr>
     *     <tr><td>propertyFilters</td><td>List&lt;String&gt;</td><td>No</td><td>Filters on key-value pairs within the Properties object.
     * eg. "{testKey} eq {testValue}". Call {@link RequestOptions#addQueryParam} to add string to array.</td></tr>
     *     <tr><td>statuses</td><td>List&lt;String&gt;</td><td>No</td><td>Statuses of the resource. Call {@link RequestOptions#addQueryParam} to add string to array.</td></tr>
     *     <tr><td>minCreatedDateTime</td><td>OffsetDateTime</td><td>No</td><td>Minimum creation date of resource (inclusive).</td></tr>
     *     <tr><td>maxCreatedDateTime</td><td>OffsetDateTime</td><td>No</td><td>Maximum creation date of resource (inclusive).</td></tr>
     *     <tr><td>minLastModifiedDateTime</td><td>OffsetDateTime</td><td>No</td><td>Minimum last modified date of resource (inclusive).</td></tr>
     *     <tr><td>maxLastModifiedDateTime</td><td>OffsetDateTime</td><td>No</td><td>Maximum last modified date of resource (inclusive).</td></tr>
     *     <tr><td>maxPageSize</td><td>Integer</td><td>No</td><td>Maximum number of items needed (inclusive).
     * Minimum = 10, Maximum = 1000, Default value = 50.</td></tr>
     *     <tr><td>skipToken</td><td>String</td><td>No</td><td>Skip token for getting next set of results.</td></tr>
     * </table>
     *
     * You can add these to a request with {@link RequestOptions#addQueryParam}
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     totalYield (Optional): {
     *         unit: String (Optional)
     *         value: Double (Optional)
     *     }
     *     avgYield (Optional): (recursive schema, see avgYield above)
     *     totalWetMass (Optional): (recursive schema, see totalWetMass above)
     *     avgWetMass (Optional): (recursive schema, see avgWetMass above)
     *     avgMoisture (Optional): (recursive schema, see avgMoisture above)
     *     avgSpeed (Optional): (recursive schema, see avgSpeed above)
     *     harvestProductDetails (Optional): [
     *          (Optional){
     *             productName: String (Optional)
     *             area (Optional): (recursive schema, see area above)
     *             totalYield (Optional): (recursive schema, see totalYield above)
     *             avgYield (Optional): (recursive schema, see avgYield above)
     *             avgMoisture (Optional): (recursive schema, see avgMoisture above)
     *             totalWetMass (Optional): (recursive schema, see totalWetMass above)
     *             avgWetMass (Optional): (recursive schema, see avgWetMass above)
     *         }
     *     ]
     *     area (Optional): (recursive schema, see area above)
     *     operationModifiedDateTime: OffsetDateTime (Optional)
     *     operationStartDateTime: OffsetDateTime (Optional)
     *     operationEndDateTime: OffsetDateTime (Optional)
     *     attachmentsLink: String (Optional)
     *     associatedBoundaryId: String (Optional)
     *     partyId: String (Optional)
     *     id: String (Optional)
     *     eTag: String (Optional)
     *     status: String (Optional)
     *     createdDateTime: OffsetDateTime (Optional)
     *     modifiedDateTime: OffsetDateTime (Optional)
     *     source: String (Optional)
     *     name: String (Optional)
     *     description: String (Optional)
     *     createdBy: String (Optional)
     *     modifiedBy: String (Optional)
     *     properties (Optional): {
     *         String: Object (Optional)
     *     }
     * }
     * }</pre>
     *
     * @param partyId ID of the associated party.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return paged response contains list of requested objects and a URL link to get the next set of results as
     *     paginated response with {@link PagedIterable}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<BinaryData> listByPartyId(String partyId, RequestOptions requestOptions) {
        return new PagedIterable<>(this.client.listByPartyId(partyId, requestOptions));
    }

    /**
     * Get a specified harvest data resource under a particular party.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     totalYield (Optional): {
     *         unit: String (Optional)
     *         value: Double (Optional)
     *     }
     *     avgYield (Optional): (recursive schema, see avgYield above)
     *     totalWetMass (Optional): (recursive schema, see totalWetMass above)
     *     avgWetMass (Optional): (recursive schema, see avgWetMass above)
     *     avgMoisture (Optional): (recursive schema, see avgMoisture above)
     *     avgSpeed (Optional): (recursive schema, see avgSpeed above)
     *     harvestProductDetails (Optional): [
     *          (Optional){
     *             productName: String (Optional)
     *             area (Optional): (recursive schema, see area above)
     *             totalYield (Optional): (recursive schema, see totalYield above)
     *             avgYield (Optional): (recursive schema, see avgYield above)
     *             avgMoisture (Optional): (recursive schema, see avgMoisture above)
     *             totalWetMass (Optional): (recursive schema, see totalWetMass above)
     *             avgWetMass (Optional): (recursive schema, see avgWetMass above)
     *         }
     *     ]
     *     area (Optional): (recursive schema, see area above)
     *     operationModifiedDateTime: OffsetDateTime (Optional)
     *     operationStartDateTime: OffsetDateTime (Optional)
     *     operationEndDateTime: OffsetDateTime (Optional)
     *     attachmentsLink: String (Optional)
     *     associatedBoundaryId: String (Optional)
     *     partyId: String (Optional)
     *     id: String (Optional)
     *     eTag: String (Optional)
     *     status: String (Optional)
     *     createdDateTime: OffsetDateTime (Optional)
     *     modifiedDateTime: OffsetDateTime (Optional)
     *     source: String (Optional)
     *     name: String (Optional)
     *     description: String (Optional)
     *     createdBy: String (Optional)
     *     modifiedBy: String (Optional)
     *     properties (Optional): {
     *         String: Object (Optional)
     *     }
     * }
     * }</pre>
     *
     * @param partyId ID of the associated party resource.
     * @param harvestDataId ID of the harvest data resource.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return a specified harvest data resource under a particular party along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> getWithResponse(String partyId, String harvestDataId, RequestOptions requestOptions) {
        return this.client.getWithResponse(partyId, harvestDataId, requestOptions).block();
    }

    /**
     * Creates or updates harvest data resource under a particular party.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     totalYield (Optional): {
     *         unit: String (Optional)
     *         value: Double (Optional)
     *     }
     *     avgYield (Optional): (recursive schema, see avgYield above)
     *     totalWetMass (Optional): (recursive schema, see totalWetMass above)
     *     avgWetMass (Optional): (recursive schema, see avgWetMass above)
     *     avgMoisture (Optional): (recursive schema, see avgMoisture above)
     *     avgSpeed (Optional): (recursive schema, see avgSpeed above)
     *     harvestProductDetails (Optional): [
     *          (Optional){
     *             productName: String (Optional)
     *             area (Optional): (recursive schema, see area above)
     *             totalYield (Optional): (recursive schema, see totalYield above)
     *             avgYield (Optional): (recursive schema, see avgYield above)
     *             avgMoisture (Optional): (recursive schema, see avgMoisture above)
     *             totalWetMass (Optional): (recursive schema, see totalWetMass above)
     *             avgWetMass (Optional): (recursive schema, see avgWetMass above)
     *         }
     *     ]
     *     area (Optional): (recursive schema, see area above)
     *     operationModifiedDateTime: OffsetDateTime (Optional)
     *     operationStartDateTime: OffsetDateTime (Optional)
     *     operationEndDateTime: OffsetDateTime (Optional)
     *     attachmentsLink: String (Optional)
     *     associatedBoundaryId: String (Optional)
     *     partyId: String (Optional)
     *     id: String (Optional)
     *     eTag: String (Optional)
     *     status: String (Optional)
     *     createdDateTime: OffsetDateTime (Optional)
     *     modifiedDateTime: OffsetDateTime (Optional)
     *     source: String (Optional)
     *     name: String (Optional)
     *     description: String (Optional)
     *     createdBy: String (Optional)
     *     modifiedBy: String (Optional)
     *     properties (Optional): {
     *         String: Object (Optional)
     *     }
     * }
     * }</pre>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     totalYield (Optional): {
     *         unit: String (Optional)
     *         value: Double (Optional)
     *     }
     *     avgYield (Optional): (recursive schema, see avgYield above)
     *     totalWetMass (Optional): (recursive schema, see totalWetMass above)
     *     avgWetMass (Optional): (recursive schema, see avgWetMass above)
     *     avgMoisture (Optional): (recursive schema, see avgMoisture above)
     *     avgSpeed (Optional): (recursive schema, see avgSpeed above)
     *     harvestProductDetails (Optional): [
     *          (Optional){
     *             productName: String (Optional)
     *             area (Optional): (recursive schema, see area above)
     *             totalYield (Optional): (recursive schema, see totalYield above)
     *             avgYield (Optional): (recursive schema, see avgYield above)
     *             avgMoisture (Optional): (recursive schema, see avgMoisture above)
     *             totalWetMass (Optional): (recursive schema, see totalWetMass above)
     *             avgWetMass (Optional): (recursive schema, see avgWetMass above)
     *         }
     *     ]
     *     area (Optional): (recursive schema, see area above)
     *     operationModifiedDateTime: OffsetDateTime (Optional)
     *     operationStartDateTime: OffsetDateTime (Optional)
     *     operationEndDateTime: OffsetDateTime (Optional)
     *     attachmentsLink: String (Optional)
     *     associatedBoundaryId: String (Optional)
     *     partyId: String (Optional)
     *     id: String (Optional)
     *     eTag: String (Optional)
     *     status: String (Optional)
     *     createdDateTime: OffsetDateTime (Optional)
     *     modifiedDateTime: OffsetDateTime (Optional)
     *     source: String (Optional)
     *     name: String (Optional)
     *     description: String (Optional)
     *     createdBy: String (Optional)
     *     modifiedBy: String (Optional)
     *     properties (Optional): {
     *         String: Object (Optional)
     *     }
     * }
     * }</pre>
     *
     * @param partyId ID of the party.
     * @param harvestDataId ID of the harvest data resource.
     * @param harvestData Harvest data resource payload to create or update.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return schema of harvest data resource along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> createOrUpdateWithResponse(
            String partyId, String harvestDataId, BinaryData harvestData, RequestOptions requestOptions) {
        return this.client.createOrUpdateWithResponse(partyId, harvestDataId, harvestData, requestOptions).block();
    }

    /**
     * Deletes a specified harvest data resource under a particular party.
     *
     * @param partyId ID of the associated party resource.
     * @param harvestDataId ID of the harvest data.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> deleteWithResponse(String partyId, String harvestDataId, RequestOptions requestOptions) {
        return this.client.deleteWithResponse(partyId, harvestDataId, requestOptions).block();
    }
}