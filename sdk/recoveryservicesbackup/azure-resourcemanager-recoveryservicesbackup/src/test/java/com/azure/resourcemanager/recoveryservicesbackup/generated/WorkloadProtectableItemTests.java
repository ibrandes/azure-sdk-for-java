// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.ProtectionStatus;
import com.azure.resourcemanager.recoveryservicesbackup.models.WorkloadProtectableItem;
import org.junit.jupiter.api.Assertions;

public final class WorkloadProtectableItemTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        WorkloadProtectableItem model =
            BinaryData
                .fromString(
                    "{\"protectableItemType\":\"WorkloadProtectableItem\",\"backupManagementType\":\"hhahhxvrhmzkwpjg\",\"workloadType\":\"spughftqsxhq\",\"friendlyName\":\"j\",\"protectionState\":\"Protecting\"}")
                .toObject(WorkloadProtectableItem.class);
        Assertions.assertEquals("hhahhxvrhmzkwpjg", model.backupManagementType());
        Assertions.assertEquals("spughftqsxhq", model.workloadType());
        Assertions.assertEquals("j", model.friendlyName());
        Assertions.assertEquals(ProtectionStatus.PROTECTING, model.protectionState());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        WorkloadProtectableItem model =
            new WorkloadProtectableItem()
                .withBackupManagementType("hhahhxvrhmzkwpjg")
                .withWorkloadType("spughftqsxhq")
                .withFriendlyName("j")
                .withProtectionState(ProtectionStatus.PROTECTING);
        model = BinaryData.fromObject(model).toObject(WorkloadProtectableItem.class);
        Assertions.assertEquals("hhahhxvrhmzkwpjg", model.backupManagementType());
        Assertions.assertEquals("spughftqsxhq", model.workloadType());
        Assertions.assertEquals("j", model.friendlyName());
        Assertions.assertEquals(ProtectionStatus.PROTECTING, model.protectionState());
    }
}