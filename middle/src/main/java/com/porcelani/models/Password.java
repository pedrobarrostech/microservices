package com.porcelani.models;

import org.springframework.data.cassandra.mapping.PrimaryKey;
import org.springframework.data.cassandra.mapping.Table;

import java.io.Serializable;

@Table
public class Password implements Serializable {

    @PrimaryKey
    private String passwordCharacters;
    private Integer score;
    private String complexity;

    public Password() {
    }

    public Password(String passwordCharacters, Integer score, String complexity) {
        this.passwordCharacters=passwordCharacters;
        this.score = score;
        this.complexity = complexity;
    }

    public String getPasswordCharacters() {
        return passwordCharacters;
    }

    public void setPasswordCharacters(String passwordCharacters) {
        this.passwordCharacters = passwordCharacters;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public String getComplexity() {
        return complexity;
    }

    public void setComplexity(String t) {
        this.complexity = t;
    }

}

