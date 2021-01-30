package com.moodAnalyser;

public class MoodAnalyser extends Throwable {

    String message;

    public MoodAnalyser(String message) {
        this.message=message;
    }

    public MoodAnalyser() {

    }
       String MoodAnalyser(){
        return "SAD";
       }

    public String analyseMood(String message) throws MoodAnalyser, MoodAnalysisException {
        try {
            if (message.contains("SAD"))
                return "SAD";
            else
                return "HAPPY";
        }catch (NullPointerException e) {
            throw new MoodAnalysisException("please enter proper message");
        }
    }
}