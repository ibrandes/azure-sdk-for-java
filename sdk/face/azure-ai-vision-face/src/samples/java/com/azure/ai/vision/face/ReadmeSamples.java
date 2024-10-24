// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.ai.vision.face;

import com.azure.ai.vision.face.models.CreateLivenessSessionContent;
import com.azure.ai.vision.face.models.CreateLivenessSessionResult;
import com.azure.ai.vision.face.models.CreateLivenessWithVerifySessionJsonContent;
import com.azure.ai.vision.face.models.CreateLivenessWithVerifySessionResult;
import com.azure.ai.vision.face.models.FaceAttributeType;
import com.azure.ai.vision.face.models.FaceDetectionModel;
import com.azure.ai.vision.face.models.FaceDetectionResult;
import com.azure.ai.vision.face.models.FaceRecognitionModel;
import com.azure.ai.vision.face.models.LivenessOperationMode;
import com.azure.ai.vision.face.models.LivenessResponseBody;
import com.azure.ai.vision.face.models.LivenessSession;
import com.azure.ai.vision.face.models.LivenessWithVerifySession;
import com.azure.ai.vision.face.samples.utils.ConfigurationHelper;
import com.azure.ai.vision.face.samples.utils.Resources;
import com.azure.core.credential.KeyCredential;
import com.azure.core.util.BinaryData;
import com.azure.identity.DefaultAzureCredentialBuilder;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

public final class ReadmeSamples {
    public void readmeSamples() {
        // BEGIN: com.azure.ai.vision.face.readme
        // END: com.azure.ai.vision.face.readme
    }

    public FaceClient keyAuthentication() {
        // BEGIN: com.azure.ai.vision.face.readme.keyAuthentication
        String endpoint = "https://<my-custom-subdomain>.cognitiveservices.azure.com/";
        String accountKey = "<api_key>";
        FaceClient client = new FaceClientBuilder()
            .endpoint(endpoint)
            .credential(new KeyCredential(accountKey))
            .buildClient();
        // END: com.azure.ai.vision.face.readme.keyAuthentication
        return client;
    }

    public FaceClient aadAuthentication() {
        // BEGIN: com.azure.ai.vision.face.readme.aadAuthentication
        //DefaultAzureCredential will use the values from these environment
        //variables: AZURE_CLIENT_ID, AZURE_TENANT_ID, AZURE_CLIENT_SECRET
        String endpoint = "https://<my-custom-subdomain>.cognitiveservices.azure.com/";
        FaceClient client = new FaceClientBuilder()
            .endpoint(endpoint)
            .credential(new DefaultAzureCredentialBuilder().build())
            .buildClient();
        // END: com.azure.ai.vision.face.readme.aadAuthentication
        return client;
    }

    public void detectFace() {
        String endpoint = ConfigurationHelper.getEndpoint();
        String accountKey = ConfigurationHelper.getAccountKey();
        // BEGIN: com.azure.ai.vision.face.readme.detectFace
        FaceClient client = new FaceClientBuilder()
            .endpoint(endpoint)
            .credential(new KeyCredential(accountKey))
            .buildClient();

        String imagePathString = Resources.TEST_IMAGE_PATH_DETECT_SAMPLE_IMAGE;
        Path path = Paths.get(imagePathString);
        BinaryData imageData = BinaryData.fromFile(path);
        List<FaceAttributeType> attributeTypes = Arrays.asList(
            FaceAttributeType.ModelDetection03.HEAD_POSE, FaceAttributeType.ModelDetection03.MASK, FaceAttributeType.ModelRecognition04.QUALITY_FOR_RECOGNITION);

        List<FaceDetectionResult> results = client.detect(
            imageData, FaceDetectionModel.DETECTION_03, FaceRecognitionModel.RECOGNITION_04, true,
            attributeTypes, true, true, 120);

        for (int i = 0, size = results.size(); i < size; i++) {
            System.out.println("----- Detection result: #" + i + " -----");
            FaceDetectionResult result = results.get(i);
            System.out.println("Face ID:" + result.getFaceId());
            // Do what you need for the result
        }
        // END: com.azure.ai.vision.face.readme.detectFace
    }

    public void createLivenessSessionAndGetResult() {
        String endpoint = ConfigurationHelper.getEndpoint();
        String accountKey = ConfigurationHelper.getAccountKey();
        // BEGIN: com.azure.ai.vision.face.readme.createLivenessSessionAndGetResult
        System.out.println("Create a liveness session.");
        FaceSessionClient sessionClient = new FaceSessionClientBuilder()
            .endpoint(endpoint)
            .credential(new KeyCredential(accountKey))
            .buildClient();

        String deviceCorrelationId = UUID.randomUUID().toString();
        CreateLivenessSessionContent parameters = new CreateLivenessSessionContent(LivenessOperationMode.PASSIVE)
            .setDeviceCorrelationId(deviceCorrelationId)
            .setSendResultsToClient(false);

        CreateLivenessSessionResult createLivenessSessionResult = sessionClient.createLivenessSession(parameters);
        String sessionId = createLivenessSessionResult.getSessionId();
        System.out.println("Result: " + sessionId);

        System.out.println("Get the liveness detection result.");
        LivenessSession session = sessionClient.getLivenessSessionResult(sessionId);
        System.out.println("Result: " + session.getResult().getResponse().getBody().getLivenessDecision());
        // END: com.azure.ai.vision.face.readme.createLivenessSessionAndGetResult
    }

    public void createLivenessWithVerifySessionAndGetResult() {
        String endpoint = ConfigurationHelper.getEndpoint();
        String accountKey = ConfigurationHelper.getAccountKey();
        String imagePathString = Resources.TEST_IMAGE_PATH_DETECTLIVENESS_VERIFYIMAGE;

        // BEGIN: com.azure.ai.vision.face.readme.createLivenessWithVerifySessionAndGetResult
        System.out.println("Create a liveness session.");
        FaceSessionClient sessionClient = new FaceSessionClientBuilder()
            .endpoint(endpoint)
            .credential(new KeyCredential(accountKey))
            .buildClient();

        String deviceCorrelationId = UUID.randomUUID().toString();
        CreateLivenessWithVerifySessionJsonContent parameters = new CreateLivenessWithVerifySessionJsonContent(LivenessOperationMode.PASSIVE)
            .setDeviceCorrelationId(deviceCorrelationId)
            .setSendResultsToClient(false);
        Path path = Paths.get(imagePathString);
        BinaryData verifyImage = BinaryData.fromFile(path);

        CreateLivenessWithVerifySessionResult createLivenessSessionResult = sessionClient
            .createLivenessWithVerifySession(parameters, verifyImage);
        String sessionId = createLivenessSessionResult.getSessionId();
        System.out.println("Result: " + sessionId);

        System.out.println("Get the liveness detection result.");
        LivenessWithVerifySession session = sessionClient.getLivenessWithVerifySessionResult(sessionId);
        LivenessResponseBody response = session.getResult().getResponse().getBody();
        System.out.println("Result: " + response.getLivenessDecision() + ", Verify result:" + response.getVerifyResult());
        // END: com.azure.ai.vision.face.readme.createLivenessWithVerifySessionAndGetResult
    }
}
