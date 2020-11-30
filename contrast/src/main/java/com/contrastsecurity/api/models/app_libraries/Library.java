package com.contrastsecurity.api.models.app_libraries;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "hash",
        "custom",
        "grade",
        "score",
        "agePenalty",
        "versionPenalty",
        "version",
        "loc",
        "vulns",
        "tags",
        "restricted",
        "licenses",
        "ossEnabled",
        "file_name",
        "app_language",
        "group",
        "file_version",
        "latest_version",
        "release_date",
        "latest_release_date",
        "classes_used",
        "class_count",
        "loc_shorthand",
        "total_vulnerabilities",
        "months_outdated",
        "versions_behind",
        "high_vulnerabilities",
        "invalid_version",
        "bugtracker_tickets"
})
public class Library {

    @JsonProperty("hash")
    private String hash;
    @JsonProperty("custom")
    private Boolean custom;
    @JsonProperty("grade")
    private String grade;
    @JsonProperty("score")
    private Long score;
    @JsonProperty("agePenalty")
    private Float agePenalty;
    @JsonProperty("versionPenalty")
    private Float versionPenalty;
    @JsonProperty("version")
    private String version;
    @JsonProperty("loc")
    private Long loc;
    @JsonProperty("vulns")
    private List<Object> vulns = null;
    @JsonProperty("tags")
    private Object tags;
    @JsonProperty("restricted")
    private Boolean restricted;
    @JsonProperty("licenses")
    private List<Object> licenses = null;
    @JsonProperty("ossEnabled")
    private Boolean ossEnabled;
    @JsonProperty("file_name")
    private String fileName;
    @JsonProperty("app_language")
    private String appLanguage;
    @JsonProperty("group")
    private String group;
    @JsonProperty("file_version")
    private String fileVersion;
    @JsonProperty("latest_version")
    private String latestVersion;
    @JsonProperty("release_date")
    private Long releaseDate;
    @JsonProperty("latest_release_date")
    private Long latestReleaseDate;
    @JsonProperty("classes_used")
    private Long classesUsed;
    @JsonProperty("class_count")
    private Long classCount;
    @JsonProperty("loc_shorthand")
    private String locShorthand;
    @JsonProperty("total_vulnerabilities")
    private Long totalVulnerabilities;
    @JsonProperty("months_outdated")
    private Long monthsOutdated;
    @JsonProperty("versions_behind")
    private Long versionsBehind;
    @JsonProperty("high_vulnerabilities")
    private Long highVulnerabilities;
    @JsonProperty("invalid_version")
    private Boolean invalidVersion;
    @JsonProperty("bugtracker_tickets")
    private List<Object> bugtrackerTickets = null;

    public Library() {
    }

    public Library(String hash, Boolean custom, String grade, Long score, Float agePenalty, Float versionPenalty, String version, Long loc, List<Object> vulns, Object tags, Boolean restricted, List<Object> licenses, Boolean ossEnabled, String fileName, String appLanguage, String group, String fileVersion, String latestVersion, Long releaseDate, Long latestReleaseDate, Long classesUsed, Long classCount, String locShorthand, Long totalVulnerabilities, Long monthsOutdated, Long versionsBehind, Long highVulnerabilities, Boolean invalidVersion, List<Object> bugtrackerTickets) {
        this.hash = hash;
        this.custom = custom;
        this.grade = grade;
        this.score = score;
        this.agePenalty = agePenalty;
        this.versionPenalty = versionPenalty;
        this.version = version;
        this.loc = loc;
        this.vulns = vulns;
        this.tags = tags;
        this.restricted = restricted;
        this.licenses = licenses;
        this.ossEnabled = ossEnabled;
        this.fileName = fileName;
        this.appLanguage = appLanguage;
        this.group = group;
        this.fileVersion = fileVersion;
        this.latestVersion = latestVersion;
        this.releaseDate = releaseDate;
        this.latestReleaseDate = latestReleaseDate;
        this.classesUsed = classesUsed;
        this.classCount = classCount;
        this.locShorthand = locShorthand;
        this.totalVulnerabilities = totalVulnerabilities;
        this.monthsOutdated = monthsOutdated;
        this.versionsBehind = versionsBehind;
        this.highVulnerabilities = highVulnerabilities;
        this.invalidVersion = invalidVersion;
        this.bugtrackerTickets = bugtrackerTickets;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public Boolean getCustom() {
        return custom;
    }

    public void setCustom(Boolean custom) {
        this.custom = custom;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public Long getScore() {
        return score;
    }

    public void setScore(Long score) {
        this.score = score;
    }

    public Float getAgePenalty() {
        return agePenalty;
    }

    public void setAgePenalty(Float agePenalty) {
        this.agePenalty = agePenalty;
    }

    public Float getVersionPenalty() {
        return versionPenalty;
    }

    public void setVersionPenalty(Float versionPenalty) {
        this.versionPenalty = versionPenalty;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Long getLoc() {
        return loc;
    }

    public void setLoc(Long loc) {
        this.loc = loc;
    }

    public List<Object> getVulns() {
        return vulns;
    }

    public void setVulns(List<Object> vulns) {
        this.vulns = vulns;
    }

    public Object getTags() {
        return tags;
    }

    public void setTags(Object tags) {
        this.tags = tags;
    }

    public Boolean getRestricted() {
        return restricted;
    }

    public void setRestricted(Boolean restricted) {
        this.restricted = restricted;
    }

    public List<Object> getLicenses() {
        return licenses;
    }

    public void setLicenses(List<Object> licenses) {
        this.licenses = licenses;
    }

    public Boolean getOssEnabled() {
        return ossEnabled;
    }

    public void setOssEnabled(Boolean ossEnabled) {
        this.ossEnabled = ossEnabled;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getAppLanguage() {
        return appLanguage;
    }

    public void setAppLanguage(String appLanguage) {
        this.appLanguage = appLanguage;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getFileVersion() {
        return fileVersion;
    }

    public void setFileVersion(String fileVersion) {
        this.fileVersion = fileVersion;
    }

    public String getLatestVersion() {
        return latestVersion;
    }

    public void setLatestVersion(String latestVersion) {
        this.latestVersion = latestVersion;
    }

    public Long getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Long releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Long getLatestReleaseDate() {
        return latestReleaseDate;
    }

    public void setLatestReleaseDate(Long latestReleaseDate) {
        this.latestReleaseDate = latestReleaseDate;
    }

    public Long getClassesUsed() {
        return classesUsed;
    }

    public void setClassesUsed(Long classesUsed) {
        this.classesUsed = classesUsed;
    }

    public Long getClassCount() {
        return classCount;
    }

    public void setClassCount(Long classCount) {
        this.classCount = classCount;
    }

    public String getLocShorthand() {
        return locShorthand;
    }

    public void setLocShorthand(String locShorthand) {
        this.locShorthand = locShorthand;
    }

    public Long getTotalVulnerabilities() {
        return totalVulnerabilities;
    }

    public void setTotalVulnerabilities(Long totalVulnerabilities) {
        this.totalVulnerabilities = totalVulnerabilities;
    }

    public Long getMonthsOutdated() {
        return monthsOutdated;
    }

    public void setMonthsOutdated(Long monthsOutdated) {
        this.monthsOutdated = monthsOutdated;
    }

    public Long getVersionsBehind() {
        return versionsBehind;
    }

    public void setVersionsBehind(Long versionsBehind) {
        this.versionsBehind = versionsBehind;
    }

    public Long getHighVulnerabilities() {
        return highVulnerabilities;
    }

    public void setHighVulnerabilities(Long highVulnerabilities) {
        this.highVulnerabilities = highVulnerabilities;
    }

    public Boolean getInvalidVersion() {
        return invalidVersion;
    }

    public void setInvalidVersion(Boolean invalidVersion) {
        this.invalidVersion = invalidVersion;
    }

    public List<Object> getBugtrackerTickets() {
        return bugtrackerTickets;
    }

    public void setBugtrackerTickets(List<Object> bugtrackerTickets) {
        this.bugtrackerTickets = bugtrackerTickets;
    }

    @Override
    public String toString() {
        return "Library{" +
                "hash='" + hash + '\'' +
                ", custom=" + custom +
                ", grade='" + grade + '\'' +
                ", score=" + score +
                ", agePenalty=" + agePenalty +
                ", versionPenalty=" + versionPenalty +
                ", version='" + version + '\'' +
                ", loc=" + loc +
                ", vulns=" + vulns +
                ", tags=" + tags +
                ", restricted=" + restricted +
                ", licenses=" + licenses +
                ", ossEnabled=" + ossEnabled +
                ", fileName='" + fileName + '\'' +
                ", appLanguage='" + appLanguage + '\'' +
                ", group='" + group + '\'' +
                ", fileVersion='" + fileVersion + '\'' +
                ", latestVersion='" + latestVersion + '\'' +
                ", releaseDate=" + releaseDate +
                ", latestReleaseDate=" + latestReleaseDate +
                ", classesUsed=" + classesUsed +
                ", classCount=" + classCount +
                ", locShorthand='" + locShorthand + '\'' +
                ", totalVulnerabilities=" + totalVulnerabilities +
                ", monthsOutdated=" + monthsOutdated +
                ", versionsBehind=" + versionsBehind +
                ", highVulnerabilities=" + highVulnerabilities +
                ", invalidVersion=" + invalidVersion +
                ", bugtrackerTickets=" + bugtrackerTickets +
                '}';
    }
}
