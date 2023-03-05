package com.javaCoreConcepts;

public class MoodAnalyser {
    private String message;
    public void MoodAnalyer(String message) {
        this.message = message;
    }
    public String moodAnalyser(String message) {
        if (message.contains("Sad")) {
            return "SAD";
        } else {
            return "HAPPY";
        }
    }
}