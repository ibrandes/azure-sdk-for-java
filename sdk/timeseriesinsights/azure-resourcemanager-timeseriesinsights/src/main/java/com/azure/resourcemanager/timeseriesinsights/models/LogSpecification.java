// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.timeseriesinsights.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The specification of an Azure Monitoring log. */
@Fluent
public final class LogSpecification {
    /*
     * Log name.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Log display name.
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /** Creates an instance of LogSpecification class. */
    public LogSpecification() {
    }

    /**
     * Get the name property: Log name.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Log name.
     *
     * @param name the name value to set.
     * @return the LogSpecification object itself.
     */
    public LogSpecification withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the displayName property: Log display name.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: Log display name.
     *
     * @param displayName the displayName value to set.
     * @return the LogSpecification object itself.
     */
    public LogSpecification withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}