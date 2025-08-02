package edu.pitt.cs;

public class CatImpl implements CatSubmissionSubmission {

	private final int id;
	private String name;
	private boolean rented;

	public CatImpl(int id, String name) {
		this.id = id;
		this.name = name;
		this.rented = false;
	}

	public void rentCat() {
		this.rented = true;
	}

	public void returnCat() {
		this.rented = false;
	}

	public void renameCat(String name) {
		if (name == null|| name.trim().isEmpty())
		{throw new IllegalArgumentException("Cat name cannot be null or empty");}
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public int getId() {
		return this.id;
	}

	public boolean getRented() {
		return this.rented;
	}

	public String toString() {
		return "ID" + this.id + ". " + this.name;
	}

}