package com.example.ddcharactersheet;

public class Skill_List {

 private String name;
 private boolean all;
 private int atr;
 private int points;
public Skill_List(String name, boolean all, int atr)
{
    this.name =name;
    this.all = all;
    this.atr = atr;
    points=0;
}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public boolean isAll() {
        return all;
    }

    public void setAll(boolean all) {
        this.all = all;
    }

    public int getAtr() {
        return atr;
    }

    public void setAtr(int atr) {
        this.atr = atr;
    }
}
