package com.contrastsecurity.api.models.organizations;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "name",
        "timezone",
        "organization_uuid",
        "date_format",
        "time_format",
        "locale",
        "creation_time",
        "protection_enabled",
        "auto_license_protection",
        "auto_license_assessment",
        "is_superadmin",
        "server_environments",
        "harmony_enabled"
})
public class Organization {

    @JsonProperty("name")
    private String name;
    @JsonProperty("timezone")
    private String timezone;
    @JsonProperty("organization_uuid")
    private String organizationUuid;
    @JsonProperty("date_format")
    private String dateFormat;
    @JsonProperty("time_format")
    private String timeFormat;
    @JsonProperty("locale")
    private String locale;
    @JsonProperty("creation_time")
    private Long creationTime;
    @JsonProperty("protection_enabled")
    private Boolean protectionEnabled;
    @JsonProperty("auto_license_protection")
    private Boolean autoLicenseProtection;
    @JsonProperty("auto_license_assessment")
    private Boolean autoLicenseAssessment;
    @JsonProperty("is_superadmin")
    private Boolean isSuperadmin;
    @JsonProperty("server_environments")
    private List<Object> serverEnvironments = null;
    @JsonProperty("harmony_enabled")
    private Boolean harmonyEnabled;

    public Organization() {
    }

    public Organization(String name, String timezone, String organizationUuid, String dateFormat, String timeFormat, String locale, Long creationTime, Boolean protectionEnabled, Boolean autoLicenseProtection, Boolean autoLicenseAssessment, Boolean isSuperadmin, List<Object> serverEnvironments, Boolean harmonyEnabled) {
        this.name = name;
        this.timezone = timezone;
        this.organizationUuid = organizationUuid;
        this.dateFormat = dateFormat;
        this.timeFormat = timeFormat;
        this.locale = locale;
        this.creationTime = creationTime;
        this.protectionEnabled = protectionEnabled;
        this.autoLicenseProtection = autoLicenseProtection;
        this.autoLicenseAssessment = autoLicenseAssessment;
        this.isSuperadmin = isSuperadmin;
        this.serverEnvironments = serverEnvironments;
        this.harmonyEnabled = harmonyEnabled;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public String getOrganizationUuid() {
        return organizationUuid;
    }

    public void setOrganizationUuid(String organizationUuid) {
        this.organizationUuid = organizationUuid;
    }

    public String getDateFormat() {
        return dateFormat;
    }

    public void setDateFormat(String dateFormat) {
        this.dateFormat = dateFormat;
    }

    public String getTimeFormat() {
        return timeFormat;
    }

    public void setTimeFormat(String timeFormat) {
        this.timeFormat = timeFormat;
    }

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public Long getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(Long creationTime) {
        this.creationTime = creationTime;
    }

    public Boolean getProtectionEnabled() {
        return protectionEnabled;
    }

    public void setProtectionEnabled(Boolean protectionEnabled) {
        this.protectionEnabled = protectionEnabled;
    }

    public Boolean getAutoLicenseProtection() {
        return autoLicenseProtection;
    }

    public void setAutoLicenseProtection(Boolean autoLicenseProtection) {
        this.autoLicenseProtection = autoLicenseProtection;
    }

    public Boolean getAutoLicenseAssessment() {
        return autoLicenseAssessment;
    }

    public void setAutoLicenseAssessment(Boolean autoLicenseAssessment) {
        this.autoLicenseAssessment = autoLicenseAssessment;
    }

    public Boolean getSuperadmin() {
        return isSuperadmin;
    }

    public void setSuperadmin(Boolean superadmin) {
        isSuperadmin = superadmin;
    }

    public List<Object> getServerEnvironments() {
        return serverEnvironments;
    }

    public void setServerEnvironments(List<Object> serverEnvironments) {
        this.serverEnvironments = serverEnvironments;
    }

    public Boolean getHarmonyEnabled() {
        return harmonyEnabled;
    }

    public void setHarmonyEnabled(Boolean harmonyEnabled) {
        this.harmonyEnabled = harmonyEnabled;
    }

    @Override
    public String toString() {
        return "Organization{" +
                "name='" + name + '\'' +
                ", timezone='" + timezone + '\'' +
                ", organizationUuid='" + organizationUuid + '\'' +
                ", dateFormat='" + dateFormat + '\'' +
                ", timeFormat='" + timeFormat + '\'' +
                ", locale='" + locale + '\'' +
                ", creationTime=" + creationTime +
                ", protectionEnabled=" + protectionEnabled +
                ", autoLicenseProtection=" + autoLicenseProtection +
                ", autoLicenseAssessment=" + autoLicenseAssessment +
                ", isSuperadmin=" + isSuperadmin +
                ", serverEnvironments=" + serverEnvironments +
                ", harmonyEnabled=" + harmonyEnabled +
                '}';
    }
}
