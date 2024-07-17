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
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.StringJoiner;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * OpenApiListOfExecutorConfigurations
 */
@JsonPropertyOrder({ OpenApiListOfExecutorConfigurations.JSON_PROPERTY_TYPE, OpenApiListOfExecutorConfigurations.JSON_PROPERTY_EXECUTOR_CONFIGURATIONS })

public class OpenApiListOfExecutorConfigurations implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String JSON_PROPERTY_TYPE = "type";
    private String type;

    public static final String JSON_PROPERTY_EXECUTOR_CONFIGURATIONS = "executorConfigurations";
    private List<OpenApiListOfExecutorConfigurationsExecutorConfigurationsInner> executorConfigurations;

    public OpenApiListOfExecutorConfigurations() {
    }

    public OpenApiListOfExecutorConfigurations type(String type) {
        this.type = type;
        return this;
    }

    /**
     * Always &#x60;executorConfigurationList&#x60; as an identifier for the list
     *
     * @return type
     **/
    @javax.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public String getType() {
        return type;
    }

    @JsonProperty(JSON_PROPERTY_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setType(String type) {
        this.type = type;
    }

    public OpenApiListOfExecutorConfigurations executorConfigurations(
            List<OpenApiListOfExecutorConfigurationsExecutorConfigurationsInner> executorConfigurations) {
        this.executorConfigurations = executorConfigurations;
        return this;
    }

    public OpenApiListOfExecutorConfigurations addExecutorConfigurationsItem(
            OpenApiListOfExecutorConfigurationsExecutorConfigurationsInner executorConfigurationsItem) {
        if (executorConfigurations == null) {
            executorConfigurations = new ArrayList<>();
        }
        executorConfigurations.add(executorConfigurationsItem);
        return this;
    }

    /**
     * Get executorConfigurations
     *
     * @return executorConfigurations
     **/
    @javax.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_EXECUTOR_CONFIGURATIONS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public List<OpenApiListOfExecutorConfigurationsExecutorConfigurationsInner> getExecutorConfigurations() {
        return executorConfigurations;
    }

    @JsonProperty(JSON_PROPERTY_EXECUTOR_CONFIGURATIONS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setExecutorConfigurations(List<OpenApiListOfExecutorConfigurationsExecutorConfigurationsInner> executorConfigurations) {
        this.executorConfigurations = executorConfigurations;
    }

    /**
     * Return true if this ListOfExecutorConfigurations object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OpenApiListOfExecutorConfigurations listOfExecutorConfigurations = (OpenApiListOfExecutorConfigurations) o;
        return Objects.equals(type, listOfExecutorConfigurations.type)
                && Objects.equals(executorConfigurations, listOfExecutorConfigurations.executorConfigurations);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, executorConfigurations);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OpenApiListOfExecutorConfigurations {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    executorConfigurations: ").append(toIndentedString(executorConfigurations)).append("\n");
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

        // add `type` to the URL query string
        if (getType() != null) {
            joiner.add(String.format("%stype%s=%s", prefix, suffix,
                    URLEncoder.encode(String.valueOf(getType()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
        }

        // add `executorConfigurations` to the URL query string
        if (getExecutorConfigurations() != null) {
            for (int i = 0; i < getExecutorConfigurations().size(); i++) {
                if (getExecutorConfigurations().get(i) != null) {
                    joiner.add(getExecutorConfigurations().get(i).toUrlQueryString(String.format("%sexecutorConfigurations%s%s", prefix, suffix,
                            "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
                }
            }
        }

        return joiner.toString();
    }
}
