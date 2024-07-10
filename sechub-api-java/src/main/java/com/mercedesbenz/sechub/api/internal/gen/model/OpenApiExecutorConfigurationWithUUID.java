// SPDX-License-Identifier: MIT
/*
 * SecHub API
 * SecHub API description
 *
 * The version of the OpenAPI document: 0.0.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.mercedesbenz.sechub.api.internal.gen.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Objects;
import java.util.StringJoiner;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * OpenApiExecutorConfigurationWithUUID
 */
@JsonPropertyOrder({ OpenApiExecutorConfigurationWithUUID.JSON_PROPERTY_PRODUCT_IDENTIFIER, OpenApiExecutorConfigurationWithUUID.JSON_PROPERTY_NAME,
        OpenApiExecutorConfigurationWithUUID.JSON_PROPERTY_SETUP, OpenApiExecutorConfigurationWithUUID.JSON_PROPERTY_EXECUTOR_VERSION,
        OpenApiExecutorConfigurationWithUUID.JSON_PROPERTY_UUID, OpenApiExecutorConfigurationWithUUID.JSON_PROPERTY_ENABLED })

public class OpenApiExecutorConfigurationWithUUID implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String JSON_PROPERTY_PRODUCT_IDENTIFIER = "productIdentifier";
    private String productIdentifier;

    public static final String JSON_PROPERTY_NAME = "name";
    private String name;

    public static final String JSON_PROPERTY_SETUP = "setup";
    private OpenApiExecutorConfigurationSetup setup;

    public static final String JSON_PROPERTY_EXECUTOR_VERSION = "executorVersion";
    private BigDecimal executorVersion;

    public static final String JSON_PROPERTY_UUID = "uuid";
    private String uuid;

    public static final String JSON_PROPERTY_ENABLED = "enabled";
    private Boolean enabled;

    public OpenApiExecutorConfigurationWithUUID() {
    }

    public OpenApiExecutorConfigurationWithUUID productIdentifier(String productIdentifier) {
        this.productIdentifier = productIdentifier;
        return this;
    }

    /**
     * Executor product identifier
     *
     * @return productIdentifier
     **/
    @javax.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_PRODUCT_IDENTIFIER)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public String getProductIdentifier() {
        return productIdentifier;
    }

    @JsonProperty(JSON_PROPERTY_PRODUCT_IDENTIFIER)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setProductIdentifier(String productIdentifier) {
        this.productIdentifier = productIdentifier;
    }

    public OpenApiExecutorConfigurationWithUUID name(String name) {
        this.name = name;
        return this;
    }

    /**
     * The name of this configuration
     *
     * @return name
     **/
    @javax.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public String getName() {
        return name;
    }

    @JsonProperty(JSON_PROPERTY_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setName(String name) {
        this.name = name;
    }

    public OpenApiExecutorConfigurationWithUUID setup(OpenApiExecutorConfigurationSetup setup) {
        this.setup = setup;
        return this;
    }

    /**
     * Get setup
     *
     * @return setup
     **/
    @javax.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_SETUP)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public OpenApiExecutorConfigurationSetup getSetup() {
        return setup;
    }

    @JsonProperty(JSON_PROPERTY_SETUP)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setSetup(OpenApiExecutorConfigurationSetup setup) {
        this.setup = setup;
    }

    public OpenApiExecutorConfigurationWithUUID executorVersion(BigDecimal executorVersion) {
        this.executorVersion = executorVersion;
        return this;
    }

    /**
     * Executor version
     *
     * @return executorVersion
     **/
    @javax.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_EXECUTOR_VERSION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public BigDecimal getExecutorVersion() {
        return executorVersion;
    }

    @JsonProperty(JSON_PROPERTY_EXECUTOR_VERSION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setExecutorVersion(BigDecimal executorVersion) {
        this.executorVersion = executorVersion;
    }

    public OpenApiExecutorConfigurationWithUUID uuid(String uuid) {
        this.uuid = uuid;
        return this;
    }

    /**
     * The uuid of this configuration
     *
     * @return uuid
     **/
    @javax.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_UUID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public String getUuid() {
        return uuid;
    }

    @JsonProperty(JSON_PROPERTY_UUID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public OpenApiExecutorConfigurationWithUUID enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Enabled state of executor
     *
     * @return enabled
     **/
    @javax.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_ENABLED)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public Boolean getEnabled() {
        return enabled;
    }

    @JsonProperty(JSON_PROPERTY_ENABLED)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * Return true if this ExecutorConfigurationWithUUID object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OpenApiExecutorConfigurationWithUUID executorConfigurationWithUUID = (OpenApiExecutorConfigurationWithUUID) o;
        return Objects.equals(productIdentifier, executorConfigurationWithUUID.productIdentifier) && Objects.equals(name, executorConfigurationWithUUID.name)
                && Objects.equals(setup, executorConfigurationWithUUID.setup) && Objects.equals(executorVersion, executorConfigurationWithUUID.executorVersion)
                && Objects.equals(uuid, executorConfigurationWithUUID.uuid) && Objects.equals(enabled, executorConfigurationWithUUID.enabled);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productIdentifier, name, setup, executorVersion, uuid, enabled);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OpenApiExecutorConfigurationWithUUID {\n");
        sb.append("    productIdentifier: ").append(toIndentedString(productIdentifier)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    setup: ").append(toIndentedString(setup)).append("\n");
        sb.append("    executorVersion: ").append(toIndentedString(executorVersion)).append("\n");
        sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

    /**
     * Convert the instance into URL query string.
     *
     * @return URL query string
     */
    public String toUrlQueryString() {
        return toUrlQueryString(null);
    }

    /**
     * Convert the instance into URL query string.
     *
     * @param prefix prefix of the query string
     * @return URL query string
     */
    public String toUrlQueryString(String prefix) {
        String suffix = "";
        String containerSuffix = "";
        String containerPrefix = "";
        if (prefix == null) {
            // style=form, explode=true, e.g. /pet?name=cat&type=manx
            prefix = "";
        } else {
            // deepObject style e.g. /pet?id[name]=cat&id[type]=manx
            prefix = prefix + "[";
            suffix = "]";
            containerSuffix = "]";
            containerPrefix = "[";
        }

        StringJoiner joiner = new StringJoiner("&");

        // add `productIdentifier` to the URL query string
        if (getProductIdentifier() != null) {
            joiner.add(String.format("%sproductIdentifier%s=%s", prefix, suffix,
                    URLEncoder.encode(String.valueOf(getProductIdentifier()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
        }

        // add `name` to the URL query string
        if (getName() != null) {
            joiner.add(String.format("%sname%s=%s", prefix, suffix,
                    URLEncoder.encode(String.valueOf(getName()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
        }

        // add `setup` to the URL query string
        if (getSetup() != null) {
            joiner.add(getSetup().toUrlQueryString(prefix + "setup" + suffix));
        }

        // add `executorVersion` to the URL query string
        if (getExecutorVersion() != null) {
            joiner.add(String.format("%sexecutorVersion%s=%s", prefix, suffix,
                    URLEncoder.encode(String.valueOf(getExecutorVersion()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
        }

        // add `uuid` to the URL query string
        if (getUuid() != null) {
            joiner.add(String.format("%suuid%s=%s", prefix, suffix,
                    URLEncoder.encode(String.valueOf(getUuid()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
        }

        // add `enabled` to the URL query string
        if (getEnabled() != null) {
            joiner.add(String.format("%senabled%s=%s", prefix, suffix,
                    URLEncoder.encode(String.valueOf(getEnabled()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
        }

        return joiner.toString();
    }
}
