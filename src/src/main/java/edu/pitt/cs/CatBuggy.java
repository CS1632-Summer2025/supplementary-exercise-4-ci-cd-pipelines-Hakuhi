package edu.pitt.cs;

public class CatBuggy implements CatSubmissionSubmission {
    private int id;
    private String name;
    private boolean rented;

    public CatBuggy(int id, String name) {
        this.id = id;
        this.name = name;
        this.rented = false;
    }

    public void rentCat() {}
    public void returnCat() {}
    public void renameCat(String name) {}
    public String getName() { return this.name; }  // 返回实际name
    public int getId() { return this.id; }        // 返回实际id
    public boolean getRented() { return this.rented; }
    public String toString() { return "ID " + this.id + ". " + this.name; }
}