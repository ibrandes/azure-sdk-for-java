// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

/**
 * Samples for Features List.
 */
public final class FeaturesListSamples {
    /*
     * x-ms-original-file:
     * specification/machinelearningservices/resource-manager/Microsoft.MachineLearningServices/stable/2024-04-01/
     * examples/Feature/list.json
     */
    /**
     * Sample code: List Feature.
     * 
     * @param manager Entry point to MachineLearningManager.
     */
    public static void listFeature(com.azure.resourcemanager.machinelearning.MachineLearningManager manager) {
        manager.features()
            .list("test-rg", "my-aml-workspace", "string", "string", null, "string", "string", "string", null, null,
                com.azure.core.util.Context.NONE);
    }
}
