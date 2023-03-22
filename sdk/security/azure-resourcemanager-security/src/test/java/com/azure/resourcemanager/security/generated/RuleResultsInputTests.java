// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.models.RuleResultsInput;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class RuleResultsInputTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        RuleResultsInput model =
            BinaryData.fromString("{\"latestScan\":false,\"results\":[[\"w\"]]}").toObject(RuleResultsInput.class);
        Assertions.assertEquals(false, model.latestScan());
        Assertions.assertEquals("w", model.results().get(0).get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        RuleResultsInput model =
            new RuleResultsInput().withLatestScan(false).withResults(Arrays.asList(Arrays.asList("w")));
        model = BinaryData.fromObject(model).toObject(RuleResultsInput.class);
        Assertions.assertEquals(false, model.latestScan());
        Assertions.assertEquals("w", model.results().get(0).get(0));
    }
}