package com.javaCoreConcepts;

public class MoodAnalyser {
    public class MoodAnalyserException extends Exception {
        public enum Exception_Type {
            NULL,EMPTY
        }
        public Exception_Type type;
        public MoodAnalyserException(String message,Exception_Type type){
            super(message);
            this.type=type;
        }
    }
    private String message;

    public MoodAnalyser(String message) {
        this.message = message;
    }
    public MoodAnalyser() {
        this.message = null;
    }
    public String moodAnalyser() throws MoodAnalyserException {
        try {
            if (this.message.contains(null))
                return "SAD";
            else
                return "HAPPY";
        } catch (Exception e) {
            if (message==null)
                throw new MoodAnalyserException("Please Enter Valid Mood , Don't enter NUll",MoodAnalyserException.Exception_Type.NULL);
            else
                throw new MoodAnalyserException("Please Enter Valid Mood ,Don' keep Empty",MoodAnalyserException.Exception_Type.EMPTY);
        }
    }
}