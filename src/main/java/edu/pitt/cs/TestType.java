package edu.pitt.cs;


public enum TestType {
    CatUnitTestBuggy,
    CatUnitTestSolution,
    RentACatUnitTestBuggy, 
    RentACatUnitTestSolution,
    RentACatIntegrationTestBuggy,
    RentACatIntegrationTestSolution,
    
    RentACatTest;
    
    public boolean isSolution() {
        return name().endsWith("Solution");
    }
    
    public boolean isBuggy() {
        return name().endsWith("Buggy");
    }
}