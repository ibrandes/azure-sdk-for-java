// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.netapp.fluent.models.VolumeQuotaRulesProperties;
import com.azure.resourcemanager.netapp.models.Type;
import org.junit.jupiter.api.Assertions;

public final class VolumeQuotaRulesPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        VolumeQuotaRulesProperties model =
            BinaryData
                .fromString(
                    "{\"provisioningState\":\"Moving\",\"quotaSizeInKiBs\":7362779030746859122,\"quotaType\":\"IndividualUserQuota\",\"quotaTarget\":\"z\"}")
                .toObject(VolumeQuotaRulesProperties.class);
        Assertions.assertEquals(7362779030746859122L, model.quotaSizeInKiBs());
        Assertions.assertEquals(Type.INDIVIDUAL_USER_QUOTA, model.quotaType());
        Assertions.assertEquals("z", model.quotaTarget());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        VolumeQuotaRulesProperties model =
            new VolumeQuotaRulesProperties()
                .withQuotaSizeInKiBs(7362779030746859122L)
                .withQuotaType(Type.INDIVIDUAL_USER_QUOTA)
                .withQuotaTarget("z");
        model = BinaryData.fromObject(model).toObject(VolumeQuotaRulesProperties.class);
        Assertions.assertEquals(7362779030746859122L, model.quotaSizeInKiBs());
        Assertions.assertEquals(Type.INDIVIDUAL_USER_QUOTA, model.quotaType());
        Assertions.assertEquals("z", model.quotaTarget());
    }
}