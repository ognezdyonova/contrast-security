package com.contrastsecurity.api.models.applications;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "success",
        "messages",
        "applications"
})
public class ApplicationsByOrg {

    @JsonProperty("success")
    private Boolean success;
    @JsonProperty("messages")
    private List<String> messages = null;
    @JsonProperty("applications")
    private List<Application> applications = null;

    public ApplicationsByOrg() {
    }

    public ApplicationsByOrg(Boolean success, List<String> messages, List<Application> applications) {
        this.success = success;
        this.messages = messages;
        this.applications = applications;
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

    public List<Application> getApplications() {
        return applications;
    }

    public void setApplications(List<Application> applications) {
        this.applications = applications;
    }

    @Override
    public String toString() {
        return "ApplicationsByOrg{" +
                "success=" + success +
                ", messages=" + messages +
                ", applications=" + applications +
                '}';
    }
}
