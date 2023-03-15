// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.formrecognizer.documentanalysis.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.Map;

/** Document classifier info. */
@Fluent
public final class DocumentClassifierDetails {
    /*
     * Unique document classifier name.
     */
    @JsonProperty(value = "classifierId", required = true)
    private String classifierId;

    /*
     * Document classifier description.
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * Date and time (UTC) when the document classifier was created.
     */
    @JsonProperty(value = "createdDateTime", required = true)
    private OffsetDateTime createdDateTime;

    /*
     * Date and time (UTC) when the document classifier will expire.
     */
    @JsonProperty(value = "expirationDateTime")
    private OffsetDateTime expirationDateTime;

    /*
     * API version used to create this document classifier.
     */
    @JsonProperty(value = "apiVersion", required = true)
    private String apiVersion;

    /*
     * List of document types to classify against.
     */
    @JsonProperty(value = "docTypes", required = true)
    private Map<String, ClassifierDocumentTypeDetails> docTypes;

    /** Creates an instance of DocumentClassifierDetails class. */
    public DocumentClassifierDetails() {}

    /**
     * Get the classifierId property: Unique document classifier name.
     *
     * @return the classifierId value.
     */
    public String getClassifierId() {
        return this.classifierId;
    }

    /**
     * Set the classifierId property: Unique document classifier name.
     *
     * @param classifierId the classifierId value to set.
     * @return the DocumentClassifierDetails object itself.
     */
    public DocumentClassifierDetails setClassifierId(String classifierId) {
        this.classifierId = classifierId;
        return this;
    }

    /**
     * Get the description property: Document classifier description.
     *
     * @return the description value.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Set the description property: Document classifier description.
     *
     * @param description the description value to set.
     * @return the DocumentClassifierDetails object itself.
     */
    public DocumentClassifierDetails setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the createdDateTime property: Date and time (UTC) when the document classifier was created.
     *
     * @return the createdDateTime value.
     */
    public OffsetDateTime getCreatedDateTime() {
        return this.createdDateTime;
    }

    /**
     * Set the createdDateTime property: Date and time (UTC) when the document classifier was created.
     *
     * @param createdDateTime the createdDateTime value to set.
     * @return the DocumentClassifierDetails object itself.
     */
    public DocumentClassifierDetails setCreatedDateTime(OffsetDateTime createdDateTime) {
        this.createdDateTime = createdDateTime;
        return this;
    }

    /**
     * Get the expirationDateTime property: Date and time (UTC) when the document classifier will expire.
     *
     * @return the expirationDateTime value.
     */
    public OffsetDateTime getExpirationDateTime() {
        return this.expirationDateTime;
    }

    /**
     * Set the expirationDateTime property: Date and time (UTC) when the document classifier will expire.
     *
     * @param expirationDateTime the expirationDateTime value to set.
     * @return the DocumentClassifierDetails object itself.
     */
    public DocumentClassifierDetails setExpirationDateTime(OffsetDateTime expirationDateTime) {
        this.expirationDateTime = expirationDateTime;
        return this;
    }

    /**
     * Get the apiVersion property: API version used to create this document classifier.
     *
     * @return the apiVersion value.
     */
    public String getApiVersion() {
        return this.apiVersion;
    }

    /**
     * Set the apiVersion property: API version used to create this document classifier.
     *
     * @param apiVersion the apiVersion value to set.
     * @return the DocumentClassifierDetails object itself.
     */
    public DocumentClassifierDetails setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    /**
     * Get the docTypes property: List of document types to classify against.
     *
     * @return the docTypes value.
     */
    public Map<String, ClassifierDocumentTypeDetails> getDocTypes() {
        return this.docTypes;
    }

    /**
     * Set the docTypes property: List of document types to classify against.
     *
     * @param docTypes the docTypes value to set.
     * @return the DocumentClassifierDetails object itself.
     */
    public DocumentClassifierDetails setDocTypes(Map<String, ClassifierDocumentTypeDetails> docTypes) {
        this.docTypes = docTypes;
        return this;
    }
}