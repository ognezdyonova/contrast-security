package com.contrastsecurity.api.models.app_scores;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "grade",
        "letter_grade"
})
public class Platform {

    @JsonProperty("grade")
    private Long grade;
    @JsonProperty("letter_grade")
    private String letterGrade;

    public Platform() {
    }

    public Platform(Long grade, String letterGrade) {
        this.grade = grade;
        this.letterGrade = letterGrade;
    }

    public Long getGrade() {
        return grade;
    }

    public void setGrade(Long grade) {
        this.grade = grade;
    }

    public String getLetterGrade() {
        return letterGrade;
    }

    public void setLetterGrade(String letterGrade) {
        this.letterGrade = letterGrade;
    }

    @Override
    public String toString() {
        return "Platform{" +
                "grade=" + grade +
                ", letterGrade='" + letterGrade + '\'' +
                '}';
    }
}
