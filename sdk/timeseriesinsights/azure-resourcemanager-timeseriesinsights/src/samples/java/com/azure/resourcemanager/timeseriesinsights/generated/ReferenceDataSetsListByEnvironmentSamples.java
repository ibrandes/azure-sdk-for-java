// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.timeseriesinsights.generated;

/** Samples for ReferenceDataSets ListByEnvironment. */
public final class ReferenceDataSetsListByEnvironmentSamples {
    /*
     * x-ms-original-file: specification/timeseriesinsights/resource-manager/Microsoft.TimeSeriesInsights/stable/2020-05-15/examples/ReferenceDataSetsListByEnvironment.json
     */
    /**
     * Sample code: ReferenceDataSetsListByEnvironment.
     *
     * @param manager Entry point to TimeSeriesInsightsManager.
     */
    public static void referenceDataSetsListByEnvironment(
        com.azure.resourcemanager.timeseriesinsights.TimeSeriesInsightsManager manager) {
        manager.referenceDataSets().listByEnvironmentWithResponse("rg1", "env1", com.azure.core.util.Context.NONE);
    }
}