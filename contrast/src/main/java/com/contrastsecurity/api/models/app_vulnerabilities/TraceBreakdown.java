package com.contrastsecurity.api.models.app_vulnerabilities;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "criticals",
        "highs",
        "meds",
        "lows",
        "notes",
        "safes",
        "triaged",
        "confirmed",
        "suspicious",
        "notProblem",
        "remediated",
        "reported",
        "fixed",
        "remediatedAutoVerified",
        "traces"
})
public class TraceBreakdown {

    @JsonProperty("criticals")
    private Long criticals;
    @JsonProperty("highs")
    private Long highs;
    @JsonProperty("meds")
    private Long meds;
    @JsonProperty("lows")
    private Long lows;
    @JsonProperty("notes")
    private Long notes;
    @JsonProperty("safes")
    private Long safes;
    @JsonProperty("triaged")
    private Long triaged;
    @JsonProperty("confirmed")
    private Long confirmed;
    @JsonProperty("suspicious")
    private Long suspicious;
    @JsonProperty("notProblem")
    private Long notProblem;
    @JsonProperty("remediated")
    private Long remediated;
    @JsonProperty("reported")
    private Long reported;
    @JsonProperty("fixed")
    private Long fixed;
    @JsonProperty("remediatedAutoVerified")
    private Long remediatedAutoVerified;
    @JsonProperty("traces")
    private Long traces;

    public TraceBreakdown() {
    }

    public TraceBreakdown(Long criticals, Long highs, Long meds, Long lows, Long notes, Long safes, Long triaged, Long confirmed, Long suspicious, Long notProblem, Long remediated, Long reported, Long fixed, Long remediatedAutoVerified, Long traces) {
        this.criticals = criticals;
        this.highs = highs;
        this.meds = meds;
        this.lows = lows;
        this.notes = notes;
        this.safes = safes;
        this.triaged = triaged;
        this.confirmed = confirmed;
        this.suspicious = suspicious;
        this.notProblem = notProblem;
        this.remediated = remediated;
        this.reported = reported;
        this.fixed = fixed;
        this.remediatedAutoVerified = remediatedAutoVerified;
        this.traces = traces;
    }

    public Long getCriticals() {
        return criticals;
    }

    public void setCriticals(Long criticals) {
        this.criticals = criticals;
    }

    public Long getHighs() {
        return highs;
    }

    public void setHighs(Long highs) {
        this.highs = highs;
    }

    public Long getMeds() {
        return meds;
    }

    public void setMeds(Long meds) {
        this.meds = meds;
    }

    public Long getLows() {
        return lows;
    }

    public void setLows(Long lows) {
        this.lows = lows;
    }

    public Long getNotes() {
        return notes;
    }

    public void setNotes(Long notes) {
        this.notes = notes;
    }

    public Long getSafes() {
        return safes;
    }

    public void setSafes(Long safes) {
        this.safes = safes;
    }

    public Long getTriaged() {
        return triaged;
    }

    public void setTriaged(Long triaged) {
        this.triaged = triaged;
    }

    public Long getConfirmed() {
        return confirmed;
    }

    public void setConfirmed(Long confirmed) {
        this.confirmed = confirmed;
    }

    public Long getSuspicious() {
        return suspicious;
    }

    public void setSuspicious(Long suspicious) {
        this.suspicious = suspicious;
    }

    public Long getNotProblem() {
        return notProblem;
    }

    public void setNotProblem(Long notProblem) {
        this.notProblem = notProblem;
    }

    public Long getRemediated() {
        return remediated;
    }

    public void setRemediated(Long remediated) {
        this.remediated = remediated;
    }

    public Long getReported() {
        return reported;
    }

    public void setReported(Long reported) {
        this.reported = reported;
    }

    public Long getFixed() {
        return fixed;
    }

    public void setFixed(Long fixed) {
        this.fixed = fixed;
    }

    public Long getRemediatedAutoVerified() {
        return remediatedAutoVerified;
    }

    public void setRemediatedAutoVerified(Long remediatedAutoVerified) {
        this.remediatedAutoVerified = remediatedAutoVerified;
    }

    public Long getTraces() {
        return traces;
    }

    public void setTraces(Long traces) {
        this.traces = traces;
    }

    @Override
    public String toString() {
        return "TraceBreakdown{" +
                "criticals=" + criticals +
                ", highs=" + highs +
                ", meds=" + meds +
                ", lows=" + lows +
                ", notes=" + notes +
                ", safes=" + safes +
                ", triaged=" + triaged +
                ", confirmed=" + confirmed +
                ", suspicious=" + suspicious +
                ", notProblem=" + notProblem +
                ", remediated=" + remediated +
                ", reported=" + reported +
                ", fixed=" + fixed +
                ", remediatedAutoVerified=" + remediatedAutoVerified +
                ", traces=" + traces +
                '}';
    }
}
