package com.porcelani.services.component;

import org.springframework.stereotype.Component;

@Component
public class Classifier {

    public String command(int score) {
        if (score == 0) {
            return "Too Short";
        } else if (score < 20) {
            return "Very Weak";
        } else if (score < 40) {
            return "Weak";
        } else if (score < 60) {
            return "Good";
        } else if (score < 80) {
            return "Strong";
        }
        return "Very Strong";
    }
}
