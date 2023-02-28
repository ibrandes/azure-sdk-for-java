// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.synapse.fluent.models.RestorableDroppedSqlPoolProperties;

public final class RestorableDroppedSqlPoolPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        RestorableDroppedSqlPoolProperties model =
            BinaryData
                .fromString(
                    "{\"databaseName\":\"dvjdhttza\",\"edition\":\"edxihchrphkmcrj\",\"maxSizeBytes\":\"nsdfzpbgtgky\",\"serviceLevelObjective\":\"dgh\",\"elasticPoolName\":\"euutlwxezwzh\",\"creationDate\":\"2021-10-29T09:06Z\",\"deletionDate\":\"2021-09-18T08:14:23Z\",\"earliestRestoreDate\":\"2021-06-26T10:05:09Z\"}")
                .toObject(RestorableDroppedSqlPoolProperties.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        RestorableDroppedSqlPoolProperties model = new RestorableDroppedSqlPoolProperties();
        model = BinaryData.fromObject(model).toObject(RestorableDroppedSqlPoolProperties.class);
    }
}