/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.azure.common.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * HTTP POST method annotation describing the parameterized relative path to a REST endpoint for an action.
 *
 * <p>The required value can be either a relative path or an absolute path. When it's an absolute path, it must start
 * with a protocol or a parameterized segment (Otherwise the parse cannot tell if it's absolute or relative).</p>
 *
 * <p><strong>Example 1: Relative path segments</strong></p>
 *
 * <pre>
 * {@literal @}POST("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/virtualMachines/{vmName}/restart")
 *  void restart(@PathParam("resourceGroupName") String rgName, @PathParam("vmName") String vmName, @PathParam("subscriptionId") String subscriptionId);</pre>
 *
 * <p><strong>Example 2: Absolute path segment</strong></p>
 *
 * <pre>
 * {@literal @}POST(https://{functionApp}.azurewebsites.net/admin/functions/{name}/keys/{keyName})
 *  NameValuePair generateFunctionKey(@PathParam("functionApp") String functionApp, @PathParam("name") String function, @PathParam("keyName") String keyName);</pre>
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface POST {
    /**
     * Get the relative path of the annotated method's POST URL.
     * @return The relative path of the annotated method's POST URL.
     */
    String value();
}