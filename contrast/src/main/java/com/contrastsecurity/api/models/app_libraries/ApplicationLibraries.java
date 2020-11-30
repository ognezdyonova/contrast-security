package com.contrastsecurity.api.models.app_libraries;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "success",
        "messages",
        "libraries",
        "count",
        "averageScoreLetter",
        "averageScore",
        "averageMonths",
        "quickFilters"
})
public class ApplicationLibraries {

    @JsonProperty("success")
    private Boolean success;
    @JsonProperty("messages")
    private List<String> messages = null;
    @JsonProperty("libraries")
    private List<Library> libraries = null;
    @JsonProperty("count")
    private Long count;
    @JsonProperty("averageScoreLetter")
    private String averageScoreLetter;
    @JsonProperty("averageScore")
    private Long averageScore;
    @JsonProperty("averageMonths")
    private Object averageMonths;
    @JsonProperty("quickFilters")
    private List<Object> quickFilters = null;

    public ApplicationLibraries() {
    }

    public ApplicationLibraries(Boolean success, List<String> messages, List<Library> libraries, Long count, String averageScoreLetter, Long averageScore, Object averageMonths, List<Object> quickFilters) {
        this.success = success;
        this.messages = messages;
        this.libraries = libraries;
        this.count = count;
        this.averageScoreLetter = averageScoreLetter;
        this.averageScore = averageScore;
        this.averageMonths = averageMonths;
        this.quickFilters = quickFilters;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public List<String> getMessages() {
        return messages;
    }

    public void setMessages(List<String> messages) {
        this.messages = messages;
    }

    public List<Library> getLibraries() {
        return libraries;
    }

    public void setLibraries(List<Library> libraries) {
        this.libraries = libraries;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public String getAverageScoreLetter() {
        return averageScoreLetter;
    }

    public void setAverageScoreLetter(String averageScoreLetter) {
        this.averageScoreLetter = averageScoreLetter;
    }

    public Long getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(Long averageScore) {
        this.averageScore = averageScore;
    }

    public Object getAverageMonths() {
        return averageMonths;
    }

    public void setAverageMonths(Object averageMonths) {
        this.averageMonths = averageMonths;
    }

    public List<Object> getQuickFilters() {
        return quickFilters;
    }

    public void setQuickFilters(List<Object> quickFilters) {
        this.quickFilters = quickFilters;
    }

    @Override
    public String toString() {
        return "ApplicationLibraries{" +
                "success=" + success +
                ", messages=" + messages +
                ", libraries=" + libraries +
                ", count=" + count +
                ", averageScoreLetter='" + averageScoreLetter + '\'' +
                ", averageScore=" + averageScore +
                ", averageMonths=" + averageMonths +
                ", quickFilters=" + quickFilters +
                '}';
    }
}
