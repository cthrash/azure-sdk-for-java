/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2018_03_30_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.mediaservices.v2018_03_30_preview.implementation.MediaManager;
import com.microsoft.azure.management.mediaservices.v2018_03_30_preview.implementation.AssetStorageEncryptionKeyInner;

/**
 * Type representing AssetStorageEncryptionKey.
 */
public interface AssetStorageEncryptionKey extends HasInner<AssetStorageEncryptionKeyInner>, HasManager<MediaManager> {
    /**
     * @return the storageEncryptionKey value.
     */
    String storageEncryptionKey();

}
