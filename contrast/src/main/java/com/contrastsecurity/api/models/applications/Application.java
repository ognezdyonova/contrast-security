package com.contrastsecurity.api.models.applications;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "name",
        "path",
        "language",
        "created",
        "status",
        "importance",
        "archived",
        "assess",
        "assessPending",
        "master",
        "notes",
        "defend",
        "defendPending",
        "roles",
        "tags",
        "techs",
        "policies",
        "missingRequiredFields",
        "links",
        "app_id",
        "last_seen",
        "last_reset",
        "size_shorthand",
        "size",
        "code_shorthand",
        "code",
        "override_url",
        "short_name",
        "importance_description",
        "total_modules",
        "attack_label",
        "active_attacks",
        "servers_without_defend",
        "first_seen"
})
public class Application {

    @JsonProperty("name")
    private String name;
    @JsonProperty("path")
    private String path;
    @JsonProperty("language")
    private String language;
    @JsonProperty("created")
    private Long created;
    @JsonProperty("status")
    private String status;
    @JsonProperty("importance")
    private Long importance;
    @JsonProperty("archived")
    private Boolean archived;
    @JsonProperty("assess")
    private Boolean assess;
    @JsonProperty("assessPending")
    private Boolean assessPending;
    @JsonProperty("master")
    private Boolean master;
    @JsonProperty("notes")
    private String notes;
    @JsonProperty("defend")
    private Boolean defend;
    @JsonProperty("defendPending")
    private Boolean defendPending;
    @JsonProperty("roles")
    private List<String> roles = null;
    @JsonProperty("tags")
    private List<String> tags = null;
    @JsonProperty("techs")
    private List<Object> techs = null;
    @JsonProperty("policies")
    private List<Object> policies = null;
    @JsonProperty("missingRequiredFields")
    private Object missingRequiredFields;
    @JsonProperty("links")
    private List<Link> links = null;
    @JsonProperty("app_id")
    private String appId;
    @JsonProperty("last_seen")
    private Long lastSeen;
    @JsonProperty("last_reset")
    private Object lastReset;
    @JsonProperty("size_shorthand")
    private String sizeShorthand;
    @JsonProperty("size")
    private Long size;
    @JsonProperty("code_shorthand")
    private String codeShorthand;
    @JsonProperty("code")
    private Long code;
    @JsonProperty("override_url")
    private Object overrideUrl;
    @JsonProperty("short_name")
    private Object shortName;
    @JsonProperty("importance_description")
    private String importanceDescription;
    @JsonProperty("total_modules")
    private Long totalModules;
    @JsonProperty("attack_label")
    private String attackLabel;
    @JsonProperty("active_attacks")
    private Long activeAttacks;
    @JsonProperty("servers_without_defend")
    private Boolean serversWithoutDefend;
    @JsonProperty("first_seen")
    private Long firstSeen;

    public Application() {
    }

    public Application(String name, String path, String language, Long created, String status, Long importance, Boolean archived, Boolean assess, Boolean assessPending, Boolean master, String notes, Boolean defend, Boolean defendPending, List<String> roles, List<String> tags, List<Object> techs, List<Object> policies, Object missingRequiredFields, List<Link> links, String appId, Long lastSeen, Object lastReset, String sizeShorthand, Long size, String codeShorthand, Long code, Object overrideUrl, Object shortName, String importanceDescription, Long totalModules, String attackLabel, Long activeAttacks, Boolean serversWithoutDefend, Long firstSeen) {
        this.name = name;
        this.path = path;
        this.language = language;
        this.created = created;
        this.status = status;
        this.importance = importance;
        this.archived = archived;
        this.assess = assess;
        this.assessPending = assessPending;
        this.master = master;
        this.notes = notes;
        this.defend = defend;
        this.defendPending = defendPending;
        this.roles = roles;
        this.tags = tags;
        this.techs = techs;
        this.policies = policies;
        this.missingRequiredFields = missingRequiredFields;
        this.links = links;
        this.appId = appId;
        this.lastSeen = lastSeen;
        this.lastReset = lastReset;
        this.sizeShorthand = sizeShorthand;
        this.size = size;
        this.codeShorthand = codeShorthand;
        this.code = code;
        this.overrideUrl = overrideUrl;
        this.shortName = shortName;
        this.importanceDescription = importanceDescription;
        this.totalModules = totalModules;
        this.attackLabel = attackLabel;
        this.activeAttacks = activeAttacks;
        this.serversWithoutDefend = serversWithoutDefend;
        this.firstSeen = firstSeen;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Long getCreated() {
        return created;
    }

    public void setCreated(Long created) {
        this.created = created;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Long getImportance() {
        return importance;
    }

    public void setImportance(Long importance) {
        this.importance = importance;
    }

    public Boolean getArchived() {
        return archived;
    }

    public void setArchived(Boolean archived) {
        this.archived = archived;
    }

    public Boolean getAssess() {
        return assess;
    }

    public void setAssess(Boolean assess) {
        this.assess = assess;
    }

    public Boolean getAssessPending() {
        return assessPending;
    }

    public void setAssessPending(Boolean assessPending) {
        this.assessPending = assessPending;
    }

    public Boolean getMaster() {
        return master;
    }

    public void setMaster(Boolean master) {
        this.master = master;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Boolean getDefend() {
        return defend;
    }

    public void setDefend(Boolean defend) {
        this.defend = defend;
    }

    public Boolean getDefendPending() {
        return defendPending;
    }

    public void setDefendPending(Boolean defendPending) {
        this.defendPending = defendPending;
    }

    public List<String> getRoles() {
        return roles;
    }

    public void setRoles(List<String> roles) {
        this.roles = roles;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public List<Object> getTechs() {
        return techs;
    }

    public void setTechs(List<Object> techs) {
        this.techs = techs;
    }

    public List<Object> getPolicies() {
        return policies;
    }

    public void setPolicies(List<Object> policies) {
        this.policies = policies;
    }

    public Object getMissingRequiredFields() {
        return missingRequiredFields;
    }

    public void setMissingRequiredFields(Object missingRequiredFields) {
        this.missingRequiredFields = missingRequiredFields;
    }

    public List<Link> getLinks() {
        return links;
    }

    public void setLinks(List<Link> links) {
        this.links = links;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public Long getLastSeen() {
        return lastSeen;
    }

    public void setLastSeen(Long lastSeen) {
        this.lastSeen = lastSeen;
    }

    public Object getLastReset() {
        return lastReset;
    }

    public void setLastReset(Object lastReset) {
        this.lastReset = lastReset;
    }

    public String getSizeShorthand() {
        return sizeShorthand;
    }

    public void setSizeShorthand(String sizeShorthand) {
        this.sizeShorthand = sizeShorthand;
    }

    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public String getCodeShorthand() {
        return codeShorthand;
    }

    public void setCodeShorthand(String codeShorthand) {
        this.codeShorthand = codeShorthand;
    }

    public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
    }

    public Object getOverrideUrl() {
        return overrideUrl;
    }

    public void setOverrideUrl(Object overrideUrl) {
        this.overrideUrl = overrideUrl;
    }

    public Object getShortName() {
        return shortName;
    }

    public void setShortName(Object shortName) {
        this.shortName = shortName;
    }

    public String getImportanceDescription() {
        return importanceDescription;
    }

    public void setImportanceDescription(String importanceDescription) {
        this.importanceDescription = importanceDescription;
    }

    public Long getTotalModules() {
        return totalModules;
    }

    public void setTotalModules(Long totalModules) {
        this.totalModules = totalModules;
    }

    public String getAttackLabel() {
        return attackLabel;
    }

    public void setAttackLabel(String attackLabel) {
        this.attackLabel = attackLabel;
    }

    public Long getActiveAttacks() {
        return activeAttacks;
    }

    public void setActiveAttacks(Long activeAttacks) {
        this.activeAttacks = activeAttacks;
    }

    public Boolean getServersWithoutDefend() {
        return serversWithoutDefend;
    }

    public void setServersWithoutDefend(Boolean serversWithoutDefend) {
        this.serversWithoutDefend = serversWithoutDefend;
    }

    public Long getFirstSeen() {
        return firstSeen;
    }

    public void setFirstSeen(Long firstSeen) {
        this.firstSeen = firstSeen;
    }

    @Override
    public String toString() {
        return "Application{" +
                "name='" + name + '\'' +
                ", path='" + path + '\'' +
                ", language='" + language + '\'' +
                ", created=" + created +
                ", status='" + status + '\'' +
                ", importance=" + importance +
                ", archived=" + archived +
                ", assess=" + assess +
                ", assessPending=" + assessPending +
                ", master=" + master +
                ", notes='" + notes + '\'' +
                ", defend=" + defend +
                ", defendPending=" + defendPending +
                ", roles=" + roles +
                ", tags=" + tags +
                ", techs=" + techs +
                ", policies=" + policies +
                ", missingRequiredFields=" + missingRequiredFields +
                ", links=" + links +
                ", appId='" + appId + '\'' +
                ", lastSeen=" + lastSeen +
                ", lastReset=" + lastReset +
                ", sizeShorthand='" + sizeShorthand + '\'' +
                ", size=" + size +
                ", codeShorthand='" + codeShorthand + '\'' +
                ", code=" + code +
                ", overrideUrl=" + overrideUrl +
                ", shortName=" + shortName +
                ", importanceDescription='" + importanceDescription + '\'' +
                ", totalModules=" + totalModules +
                ", attackLabel='" + attackLabel + '\'' +
                ", activeAttacks=" + activeAttacks +
                ", serversWithoutDefend=" + serversWithoutDefend +
                ", firstSeen=" + firstSeen +
                '}';
    }
}
