package edu.pitt.cs;

import java.util.ArrayList;

public class RentACatSolution implements RentACat {
    private ArrayList<Cat> cats = new ArrayList<>();

    public RentACatSolution() {} // 无参构造

    public boolean returnCat(int id) {
        Cat c = getCat(id);
        if (c == null || !c.getRented()) return false;
        c.returnCat();
        return true;
    }

    public boolean rentCat(int id) {
        Cat c = getCat(id);
        if (c == null || c.getRented()) return false;
        c.rentCat();
        return true;
    }

    public boolean renameCat(int id, String name) {
        Cat c = getCat(id);
        if (c == null) return false;
        c.renameCat(name);
        return true;
    }

    public String listCats() {
        StringBuilder sb = new StringBuilder();
        for (Cat c : cats) {
            if (!c.getRented()) {
                sb.append(c.toString()).append("\n");
            }
        }
        return sb.toString();
    }

    public void addCat(Cat c) {
        cats.add(c);
    }

    private Cat getCat(int id) {
        for (Cat c : cats) {
            if (c.getId() == id) return c;
        }
        return null;
    }
}