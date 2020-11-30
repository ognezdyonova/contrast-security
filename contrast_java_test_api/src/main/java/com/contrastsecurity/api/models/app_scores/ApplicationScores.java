package com.contrastsecurity.api.models.app_scores;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "success",
        "messages",
        "scores"
})
public class ApplicationScores {

    @JsonProperty("success")
    private Boolean success;
    @JsonProperty("messages")
    private List<String> messages = null;
    @JsonProperty("scores")
    private Scores scores;

    public ApplicationScores() {
    }

    public ApplicationScores(Boolean success, List<String> messages, Scores scores) {
        this.success = success;
        this.messages = messages;
        this.scores = scores;
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

    public Scores getScores() {
        return scores;
    }

    public void setScores(Scores scores) {
        this.scores = scores;
    }

    @Override
    public String toString() {
        return "ApplicationScores{" +
                "success=" + success +
                ", messages=" + messages +
                ", scores=" + scores +
                '}';
    }
}
