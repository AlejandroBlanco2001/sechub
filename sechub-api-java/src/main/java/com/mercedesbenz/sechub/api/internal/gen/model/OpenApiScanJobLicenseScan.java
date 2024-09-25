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
 * License scan configuration block
 */
@JsonPropertyOrder({ OpenApiScanJobLicenseScan.JSON_PROPERTY_USE })

public class OpenApiScanJobLicenseScan implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String JSON_PROPERTY_USE = "use";
    private List<String> use;

    public OpenApiScanJobLicenseScan() {
    }

    public OpenApiScanJobLicenseScan use(List<String> use) {
        this.use = use;
        return this;
    }

    public OpenApiScanJobLicenseScan addUseItem(String useItem) {
        if (use == null) {
            use = new ArrayList<>();
        }
        use.add(useItem);
        return this;
    }

    /**
     * Referenced data configuration objects by their unique names
     *
     * @return use
     **/
    @javax.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_USE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public List<String> getUse() {
        return use;
    }

    @JsonProperty(JSON_PROPERTY_USE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setUse(List<String> use) {
        this.use = use;
    }

    /**
     * Return true if this ScanJob_licenseScan object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OpenApiScanJobLicenseScan scanJobLicenseScan = (OpenApiScanJobLicenseScan) o;
        return Objects.equals(use, scanJobLicenseScan.use);
    }

    @Override
    public int hashCode() {
        return Objects.hash(use);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OpenApiScanJobLicenseScan {\n");
        sb.append("    use: ").append(toIndentedString(use)).append("\n");
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

        // add `use` to the URL query string
        if (getUse() != null) {
            for (int i = 0; i < getUse().size(); i++) {
                joiner.add(String.format("%suse%s%s=%s", prefix, suffix, "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
                        URLEncoder.encode(String.valueOf(getUse().get(i)), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
            }
        }

        return joiner.toString();
    }
}
