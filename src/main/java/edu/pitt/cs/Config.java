package edu.pitt.cs;


public class Config {
    private static TestType currentTestType;
    

    public static void setTestType(TestType type) {
        currentTestType = type;
    }

    public static TestType getTestType() {
        return currentTestType;
    }
    
    public static void reset() {
        currentTestType = null;
    }
}
