// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.models.AllowlistCustomAlertRule;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class AllowlistCustomAlertRuleTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AllowlistCustomAlertRule model =
            BinaryData
                .fromString(
                    "{\"ruleType\":\"AllowlistCustomAlertRule\",\"allowlistValues\":[\"ugw\",\"kcglhslaz\",\"dyggdtjixhbku\"],\"valueType\":\"String\",\"displayName\":\"e\",\"description\":\"hmenevfyexfwhybc\",\"isEnabled\":true}")
                .toObject(AllowlistCustomAlertRule.class);
        Assertions.assertEquals(true, model.isEnabled());
        Assertions.assertEquals("ugw", model.allowlistValues().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AllowlistCustomAlertRule model =
            new AllowlistCustomAlertRule()
                .withIsEnabled(true)
                .withAllowlistValues(Arrays.asList("ugw", "kcglhslaz", "dyggdtjixhbku"));
        model = BinaryData.fromObject(model).toObject(AllowlistCustomAlertRule.class);
        Assertions.assertEquals(true, model.isEnabled());
        Assertions.assertEquals("ugw", model.allowlistValues().get(0));
    }
}