// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.avs.models.ManagementCluster;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class ManagementClusterTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ManagementCluster model =
            BinaryData
                .fromString(
                    "{\"clusterSize\":497531730,\"provisioningState\":\"Canceled\",\"clusterId\":514021855,\"hosts\":[\"wdslfhotwmcy\",\"pwlbjnpg\",\"cftadeh\"]}")
                .toObject(ManagementCluster.class);
        Assertions.assertEquals(497531730, model.clusterSize());
        Assertions.assertEquals("wdslfhotwmcy", model.hosts().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ManagementCluster model =
            new ManagementCluster()
                .withClusterSize(497531730)
                .withHosts(Arrays.asList("wdslfhotwmcy", "pwlbjnpg", "cftadeh"));
        model = BinaryData.fromObject(model).toObject(ManagementCluster.class);
        Assertions.assertEquals(497531730, model.clusterSize());
        Assertions.assertEquals("wdslfhotwmcy", model.hosts().get(0));
    }
}