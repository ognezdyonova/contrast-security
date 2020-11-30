package com.contrastsecurity.api.models.app_scores;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "grade",
        "platform",
        "security",
        "overall_scoring_type",
        "library_scoring_type",
        "letter_grade"
})
public class Scores {

    @JsonProperty("grade")
    private Long grade;
    @JsonProperty("platform")
    private Platform platform;
    @JsonProperty("security")
    private Security security;
    @JsonProperty("overall_scoring_type")
    private String overallScoringType;
    @JsonProperty("library_scoring_type")
    private String libraryScoringType;
    @JsonProperty("letter_grade")
    private String letterGrade;

    public Scores() {
    }

    public Scores(Long grade, Platform platform, Security security, String overallScoringType, String libraryScoringType, String letterGrade) {
        this.grade = grade;
        this.platform = platform;
        this.security = security;
        this.overallScoringType = overallScoringType;
        this.libraryScoringType = libraryScoringType;
        this.letterGrade = letterGrade;
    }

    public Long getGrade() {
        return grade;
    }

    public void setGrade(Long grade) {
        this.grade = grade;
    }

    public Platform getPlatform() {
        return platform;
    }

    public void setPlatform(Platform platform) {
        this.platform = platform;
    }

    public Security getSecurity() {
        return security;
    }

    public void setSecurity(Security security) {
        this.security = security;
    }

    public String getOverallScoringType() {
        return overallScoringType;
    }

    public void setOverallScoringType(String overallScoringType) {
        this.overallScoringType = overallScoringType;
    }

    public String getLibraryScoringType() {
        return libraryScoringType;
    }

    public void setLibraryScoringType(String libraryScoringType) {
        this.libraryScoringType = libraryScoringType;
    }

    public String getLetterGrade() {
        return letterGrade;
    }

    public void setLetterGrade(String letterGrade) {
        this.letterGrade = letterGrade;
    }

    @Override
    public String toString() {
        return "Scores{" +
                "grade=" + grade +
                ", platform=" + platform +
                ", security=" + security +
                ", overallScoringType='" + overallScoringType + '\'' +
                ", libraryScoringType='" + libraryScoringType + '\'' +
                ", letterGrade='" + letterGrade + '\'' +
                '}';
    }
}
