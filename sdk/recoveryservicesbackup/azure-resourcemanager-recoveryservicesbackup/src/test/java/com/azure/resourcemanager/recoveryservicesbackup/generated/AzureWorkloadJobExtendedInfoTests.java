// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.AzureWorkloadJobExtendedInfo;
import com.azure.resourcemanager.recoveryservicesbackup.models.AzureWorkloadJobTaskDetails;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class AzureWorkloadJobExtendedInfoTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AzureWorkloadJobExtendedInfo model =
            BinaryData
                .fromString(
                    "{\"tasksList\":[{\"taskId\":\"sdymbrn\",\"status\":\"u\"},{\"taskId\":\"prafwgckhoc\",\"status\":\"d\"}],\"propertyBag\":{\"spave\":\"wafqroud\",\"bunzozudh\":\"hrv\",\"moy\":\"xg\"},\"dynamicErrorMessage\":\"dyuib\"}")
                .toObject(AzureWorkloadJobExtendedInfo.class);
        Assertions.assertEquals("sdymbrn", model.tasksList().get(0).taskId());
        Assertions.assertEquals("u", model.tasksList().get(0).status());
        Assertions.assertEquals("wafqroud", model.propertyBag().get("spave"));
        Assertions.assertEquals("dyuib", model.dynamicErrorMessage());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AzureWorkloadJobExtendedInfo model =
            new AzureWorkloadJobExtendedInfo()
                .withTasksList(
                    Arrays
                        .asList(
                            new AzureWorkloadJobTaskDetails().withTaskId("sdymbrn").withStatus("u"),
                            new AzureWorkloadJobTaskDetails().withTaskId("prafwgckhoc").withStatus("d")))
                .withPropertyBag(mapOf("spave", "wafqroud", "bunzozudh", "hrv", "moy", "xg"))
                .withDynamicErrorMessage("dyuib");
        model = BinaryData.fromObject(model).toObject(AzureWorkloadJobExtendedInfo.class);
        Assertions.assertEquals("sdymbrn", model.tasksList().get(0).taskId());
        Assertions.assertEquals("u", model.tasksList().get(0).status());
        Assertions.assertEquals("wafqroud", model.propertyBag().get("spave"));
        Assertions.assertEquals("dyuib", model.dynamicErrorMessage());
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}