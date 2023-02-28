// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagecache.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.storagecache.models.ResourceSkuCapabilities;
import org.junit.jupiter.api.Assertions;

public final class ResourceSkuCapabilitiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ResourceSkuCapabilities model =
            BinaryData
                .fromString("{\"name\":\"yc\",\"value\":\"newmdwzjeiachbo\"}")
                .toObject(ResourceSkuCapabilities.class);
        Assertions.assertEquals("yc", model.name());
        Assertions.assertEquals("newmdwzjeiachbo", model.value());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ResourceSkuCapabilities model = new ResourceSkuCapabilities().withName("yc").withValue("newmdwzjeiachbo");
        model = BinaryData.fromObject(model).toObject(ResourceSkuCapabilities.class);
        Assertions.assertEquals("yc", model.name());
        Assertions.assertEquals("newmdwzjeiachbo", model.value());
    }
}