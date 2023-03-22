// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.models.AwAssumeRoleAuthenticationDetailsProperties;
import org.junit.jupiter.api.Assertions;

public final class AwAssumeRoleAuthenticationDetailsPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AwAssumeRoleAuthenticationDetailsProperties model =
            BinaryData
                .fromString(
                    "{\"authenticationType\":\"awsAssumeRole\",\"accountId\":\"kzwjiqullq\",\"awsAssumeRoleArn\":\"bdmvrscmqerndbr\",\"awsExternalId\":\"yeofltfnnxrkad\",\"authenticationProvisioningState\":\"Expired\",\"grantedPermissions\":[\"AWS::AWSSecurityHubReadOnlyAccess\",\"AWS::AWSSecurityHubReadOnlyAccess\",\"AWS::AWSSecurityHubReadOnlyAccess\"]}")
                .toObject(AwAssumeRoleAuthenticationDetailsProperties.class);
        Assertions.assertEquals("bdmvrscmqerndbr", model.awsAssumeRoleArn());
        Assertions.assertEquals("yeofltfnnxrkad", model.awsExternalId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AwAssumeRoleAuthenticationDetailsProperties model =
            new AwAssumeRoleAuthenticationDetailsProperties()
                .withAwsAssumeRoleArn("bdmvrscmqerndbr")
                .withAwsExternalId("yeofltfnnxrkad");
        model = BinaryData.fromObject(model).toObject(AwAssumeRoleAuthenticationDetailsProperties.class);
        Assertions.assertEquals("bdmvrscmqerndbr", model.awsAssumeRoleArn());
        Assertions.assertEquals("yeofltfnnxrkad", model.awsExternalId());
    }
}