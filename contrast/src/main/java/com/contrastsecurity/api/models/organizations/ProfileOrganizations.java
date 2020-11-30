package com.contrastsecurity.api.models.organizations;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "organizations",
        "count",
        "org_disabled"
})
public class ProfileOrganizations {

    @JsonProperty("organizations")
    private List<Organization> organizations = null;
    @JsonProperty("count")
    private Integer count;
    @JsonProperty("org_disabled")
    private List<Object> orgDisabled = null;

    public ProfileOrganizations() {
    }

    public ProfileOrganizations(List<Organization> organizations, Integer count, List<Object> orgDisabled) {
        this.organizations = organizations;
        this.count = count;
        this.orgDisabled = orgDisabled;
    }

    public List<Organization> getOrganizations() {
        return organizations;
    }

    public void setOrganizations(List<Organization> organizations) {
        this.organizations = organizations;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public List<Object> getOrgDisabled() {
        return orgDisabled;
    }

    public void setOrgDisabled(List<Object> orgDisabled) {
        this.orgDisabled = orgDisabled;
    }

    @Override
    public String toString() {
        return "ProfileOrganizations{" +
                "organizations=" + organizations +
                ", count=" + count +
                ", orgDisabled=" + orgDisabled +
                '}';
    }
}
