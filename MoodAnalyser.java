package com.javaCoreConcepts;

public class MoodAnalyser {
    private String message;
    public MoodAnalyser(String message) {
        this.message = message;
    }
    public MoodAnalyser() {
        this.message = null;
    }
    public String moodAnalyser() {
        try {
            if (this.message.contains("Sad"))
                return "SAD";
            else
                return "HAPPY";
        } catch (NullPointerException e) {
            return "HAPPY";
        }
    }
}