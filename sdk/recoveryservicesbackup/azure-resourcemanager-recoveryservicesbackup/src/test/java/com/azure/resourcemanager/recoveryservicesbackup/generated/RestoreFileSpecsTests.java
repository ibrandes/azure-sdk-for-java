// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.RestoreFileSpecs;
import org.junit.jupiter.api.Assertions;

public final class RestoreFileSpecsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        RestoreFileSpecs model =
            BinaryData
                .fromString(
                    "{\"path\":\"maehvbbxurip\",\"fileSpecType\":\"fnhtbaxkgxyw\",\"targetFolderPath\":\"kpyklyhp\"}")
                .toObject(RestoreFileSpecs.class);
        Assertions.assertEquals("maehvbbxurip", model.path());
        Assertions.assertEquals("fnhtbaxkgxyw", model.fileSpecType());
        Assertions.assertEquals("kpyklyhp", model.targetFolderPath());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        RestoreFileSpecs model =
            new RestoreFileSpecs()
                .withPath("maehvbbxurip")
                .withFileSpecType("fnhtbaxkgxyw")
                .withTargetFolderPath("kpyklyhp");
        model = BinaryData.fromObject(model).toObject(RestoreFileSpecs.class);
        Assertions.assertEquals("maehvbbxurip", model.path());
        Assertions.assertEquals("fnhtbaxkgxyw", model.fileSpecType());
        Assertions.assertEquals("kpyklyhp", model.targetFolderPath());
    }
}