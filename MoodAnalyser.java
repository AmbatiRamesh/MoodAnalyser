package com.javaCoreConcepts;

public class MoodAnalyser {
    public String moodAnalyser(String message)
    {
        if (message.contains("Sad"))
            return "SAD";

        return "HAPPY";
    }

}
