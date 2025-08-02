package edu.pitt.cs;

public class CatSolution implements CatSubmissionSubmission {
    private int id;
    private String name;
    private boolean rented;

    public CatSolution(int id, String name) {
        this.id = id;
        this.name = name;
        this.rented = false;
    }

    public void rentCat() { this.rented = true; }
    public void returnCat() { this.rented = false; }
    public void renameCat(String name) { 
        if (name != null) this.name = name; 
    }
    public String getName() { return this.name; }
    public int getId() { return this.id; }
    public boolean getRented() { return this.rented; }
    public String toString() { return "ID " + id + ". " + name; }
}