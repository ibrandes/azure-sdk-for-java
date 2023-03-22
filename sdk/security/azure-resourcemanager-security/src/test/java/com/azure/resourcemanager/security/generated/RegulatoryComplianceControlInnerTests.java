// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.fluent.models.RegulatoryComplianceControlInner;
import com.azure.resourcemanager.security.models.State;
import org.junit.jupiter.api.Assertions;

public final class RegulatoryComplianceControlInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        RegulatoryComplianceControlInner model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"description\":\"eljag\",\"state\":\"Skipped\",\"passedAssessments\":1903317968,\"failedAssessments\":777528334,\"skippedAssessments\":1378743202},\"id\":\"iiiojnalghf\",\"name\":\"vtvsexsowueluq\",\"type\":\"hahhxvrhmzkwpj\"}")
                .toObject(RegulatoryComplianceControlInner.class);
        Assertions.assertEquals(State.SKIPPED, model.state());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        RegulatoryComplianceControlInner model = new RegulatoryComplianceControlInner().withState(State.SKIPPED);
        model = BinaryData.fromObject(model).toObject(RegulatoryComplianceControlInner.class);
        Assertions.assertEquals(State.SKIPPED, model.state());
    }
}