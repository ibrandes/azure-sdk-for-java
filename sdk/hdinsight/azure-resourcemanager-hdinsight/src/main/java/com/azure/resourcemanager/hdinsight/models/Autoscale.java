// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The autoscale request parameters.
 */
@Fluent
public final class Autoscale implements JsonSerializable<Autoscale> {
    /*
     * Parameters for load-based autoscale
     */
    private AutoscaleCapacity capacity;

    /*
     * Parameters for schedule-based autoscale
     */
    private AutoscaleRecurrence recurrence;

    /**
     * Creates an instance of Autoscale class.
     */
    public Autoscale() {
    }

    /**
     * Get the capacity property: Parameters for load-based autoscale.
     * 
     * @return the capacity value.
     */
    public AutoscaleCapacity capacity() {
        return this.capacity;
    }

    /**
     * Set the capacity property: Parameters for load-based autoscale.
     * 
     * @param capacity the capacity value to set.
     * @return the Autoscale object itself.
     */
    public Autoscale withCapacity(AutoscaleCapacity capacity) {
        this.capacity = capacity;
        return this;
    }

    /**
     * Get the recurrence property: Parameters for schedule-based autoscale.
     * 
     * @return the recurrence value.
     */
    public AutoscaleRecurrence recurrence() {
        return this.recurrence;
    }

    /**
     * Set the recurrence property: Parameters for schedule-based autoscale.
     * 
     * @param recurrence the recurrence value to set.
     * @return the Autoscale object itself.
     */
    public Autoscale withRecurrence(AutoscaleRecurrence recurrence) {
        this.recurrence = recurrence;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (capacity() != null) {
            capacity().validate();
        }
        if (recurrence() != null) {
            recurrence().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("capacity", this.capacity);
        jsonWriter.writeJsonField("recurrence", this.recurrence);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of Autoscale from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of Autoscale if the JsonReader was pointing to an instance of it, or null if it was pointing
     * to JSON null.
     * @throws IOException If an error occurs while reading the Autoscale.
     */
    public static Autoscale fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            Autoscale deserializedAutoscale = new Autoscale();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("capacity".equals(fieldName)) {
                    deserializedAutoscale.capacity = AutoscaleCapacity.fromJson(reader);
                } else if ("recurrence".equals(fieldName)) {
                    deserializedAutoscale.recurrence = AutoscaleRecurrence.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAutoscale;
        });
    }
}
