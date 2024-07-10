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
import java.util.Objects;
import java.util.StringJoiner;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * OpenApiListOfRunningJobsInner
 */
@JsonPropertyOrder({ OpenApiListOfRunningJobsInner.JSON_PROPERTY_OWNER, OpenApiListOfRunningJobsInner.JSON_PROPERTY_JOB_U_U_I_D,
        OpenApiListOfRunningJobsInner.JSON_PROPERTY_CONFIGURATION, OpenApiListOfRunningJobsInner.JSON_PROPERTY_PROJECT_ID,
        OpenApiListOfRunningJobsInner.JSON_PROPERTY_SINCE, OpenApiListOfRunningJobsInner.JSON_PROPERTY_STATUS })

public class OpenApiListOfRunningJobsInner implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String JSON_PROPERTY_OWNER = "owner";
    private String owner;

    public static final String JSON_PROPERTY_JOB_U_U_I_D = "jobUUID";
    private String jobUUID;

    public static final String JSON_PROPERTY_CONFIGURATION = "configuration";
    private String _configuration;

    public static final String JSON_PROPERTY_PROJECT_ID = "projectId";
    private String projectId;

    public static final String JSON_PROPERTY_SINCE = "since";
    private String since;

    public static final String JSON_PROPERTY_STATUS = "status";
    private String status;

    public OpenApiListOfRunningJobsInner() {
    }

    public OpenApiListOfRunningJobsInner owner(String owner) {
        this.owner = owner;
        return this;
    }

    /**
     * Owner of the job - means user which triggered it
     *
     * @return owner
     **/
    @javax.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_OWNER)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public String getOwner() {
        return owner;
    }

    @JsonProperty(JSON_PROPERTY_OWNER)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setOwner(String owner) {
        this.owner = owner;
    }

    public OpenApiListOfRunningJobsInner jobUUID(String jobUUID) {
        this.jobUUID = jobUUID;
        return this;
    }

    /**
     * The uuid of the running job
     *
     * @return jobUUID
     **/
    @javax.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_JOB_U_U_I_D)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public String getJobUUID() {
        return jobUUID;
    }

    @JsonProperty(JSON_PROPERTY_JOB_U_U_I_D)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setJobUUID(String jobUUID) {
        this.jobUUID = jobUUID;
    }

    public OpenApiListOfRunningJobsInner _configuration(String _configuration) {
        this._configuration = _configuration;
        return this;
    }

    /**
     * Configuration used for this job
     *
     * @return _configuration
     **/
    @javax.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_CONFIGURATION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public String getConfiguration() {
        return _configuration;
    }

    @JsonProperty(JSON_PROPERTY_CONFIGURATION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setConfiguration(String _configuration) {
        this._configuration = _configuration;
    }

    public OpenApiListOfRunningJobsInner projectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * The name of the project the job is running for
     *
     * @return projectId
     **/
    @javax.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_PROJECT_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public String getProjectId() {
        return projectId;
    }

    @JsonProperty(JSON_PROPERTY_PROJECT_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public OpenApiListOfRunningJobsInner since(String since) {
        this.since = since;
        return this;
    }

    /**
     * Timestamp since when job has been started
     *
     * @return since
     **/
    @javax.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_SINCE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public String getSince() {
        return since;
    }

    @JsonProperty(JSON_PROPERTY_SINCE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setSince(String since) {
        this.since = since;
    }

    public OpenApiListOfRunningJobsInner status(String status) {
        this.status = status;
        return this;
    }

    /**
     * A status information
     *
     * @return status
     **/
    @javax.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_STATUS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public String getStatus() {
        return status;
    }

    @JsonProperty(JSON_PROPERTY_STATUS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * Return true if this ListOfRunningJobs_inner object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OpenApiListOfRunningJobsInner listOfRunningJobsInner = (OpenApiListOfRunningJobsInner) o;
        return Objects.equals(owner, listOfRunningJobsInner.owner) && Objects.equals(jobUUID, listOfRunningJobsInner.jobUUID)
                && Objects.equals(_configuration, listOfRunningJobsInner._configuration) && Objects.equals(projectId, listOfRunningJobsInner.projectId)
                && Objects.equals(since, listOfRunningJobsInner.since) && Objects.equals(status, listOfRunningJobsInner.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(owner, jobUUID, _configuration, projectId, since, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OpenApiListOfRunningJobsInner {\n");
        sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
        sb.append("    jobUUID: ").append(toIndentedString(jobUUID)).append("\n");
        sb.append("    _configuration: ").append(toIndentedString(_configuration)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    since: ").append(toIndentedString(since)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

        // add `owner` to the URL query string
        if (getOwner() != null) {
            joiner.add(String.format("%sowner%s=%s", prefix, suffix,
                    URLEncoder.encode(String.valueOf(getOwner()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
        }

        // add `jobUUID` to the URL query string
        if (getJobUUID() != null) {
            joiner.add(String.format("%sjobUUID%s=%s", prefix, suffix,
                    URLEncoder.encode(String.valueOf(getJobUUID()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
        }

        // add `configuration` to the URL query string
        if (getConfiguration() != null) {
            joiner.add(String.format("%sconfiguration%s=%s", prefix, suffix,
                    URLEncoder.encode(String.valueOf(getConfiguration()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
        }

        // add `projectId` to the URL query string
        if (getProjectId() != null) {
            joiner.add(String.format("%sprojectId%s=%s", prefix, suffix,
                    URLEncoder.encode(String.valueOf(getProjectId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
        }

        // add `since` to the URL query string
        if (getSince() != null) {
            joiner.add(String.format("%ssince%s=%s", prefix, suffix,
                    URLEncoder.encode(String.valueOf(getSince()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
        }

        // add `status` to the URL query string
        if (getStatus() != null) {
            joiner.add(String.format("%sstatus%s=%s", prefix, suffix,
                    URLEncoder.encode(String.valueOf(getStatus()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
        }

        return joiner.toString();
    }
}
