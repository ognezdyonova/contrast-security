package com.contrastsecurity.api.models.app_vulnerabilities;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "success",
        "messages",
        "trace_breakdown"
})
public class ApplicationVulnerabilities {

    @JsonProperty("success")
    private Boolean success;
    @JsonProperty("messages")
    private List<String> messages = null;
    @JsonProperty("trace_breakdown")
    private TraceBreakdown traceBreakdown;

    public ApplicationVulnerabilities() {
    }

    public ApplicationVulnerabilities(Boolean success, List<String> messages, TraceBreakdown traceBreakdown) {
        this.success = success;
        this.messages = messages;
        this.traceBreakdown = traceBreakdown;
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

    public TraceBreakdown getTraceBreakdown() {
        return traceBreakdown;
    }

    public void setTraceBreakdown(TraceBreakdown traceBreakdown) {
        this.traceBreakdown = traceBreakdown;
    }

    @Override
    public String toString() {
        return "ApplicationVulnerabilities{" +
                "success=" + success +
                ", messages=" + messages +
                ", traceBreakdown=" + traceBreakdown +
                '}';
    }
}
