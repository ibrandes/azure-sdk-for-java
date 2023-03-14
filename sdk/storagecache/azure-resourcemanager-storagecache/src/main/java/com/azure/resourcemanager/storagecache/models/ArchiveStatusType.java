// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagecache.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The state of the archive operation. */
public final class ArchiveStatusType extends ExpandableStringEnum<ArchiveStatusType> {
    /** Static value NotConfigured for ArchiveStatusType. */
    public static final ArchiveStatusType NOT_CONFIGURED = fromString("NotConfigured");

    /** Static value Idle for ArchiveStatusType. */
    public static final ArchiveStatusType IDLE = fromString("Idle");

    /** Static value InProgress for ArchiveStatusType. */
    public static final ArchiveStatusType IN_PROGRESS = fromString("InProgress");

    /** Static value Canceled for ArchiveStatusType. */
    public static final ArchiveStatusType CANCELED = fromString("Canceled");

    /** Static value Completed for ArchiveStatusType. */
    public static final ArchiveStatusType COMPLETED = fromString("Completed");

    /** Static value Failed for ArchiveStatusType. */
    public static final ArchiveStatusType FAILED = fromString("Failed");

    /** Static value Cancelling for ArchiveStatusType. */
    public static final ArchiveStatusType CANCELLING = fromString("Cancelling");

    /** Static value FSScanInProgress for ArchiveStatusType. */
    public static final ArchiveStatusType FSSCAN_IN_PROGRESS = fromString("FSScanInProgress");

    /**
     * Creates a new instance of ArchiveStatusType value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ArchiveStatusType() {
    }

    /**
     * Creates or finds a ArchiveStatusType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ArchiveStatusType.
     */
    @JsonCreator
    public static ArchiveStatusType fromString(String name) {
        return fromString(name, ArchiveStatusType.class);
    }

    /**
     * Gets known ArchiveStatusType values.
     *
     * @return known ArchiveStatusType values.
     */
    public static Collection<ArchiveStatusType> values() {
        return values(ArchiveStatusType.class);
    }
}