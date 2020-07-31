package com.example.ddcharactersheet;

public class Spells {
    private String name;
    private String description;
    private int tier;
    private boolean Selected;

    public boolean isSelected() {
        return Selected;
    }

    public void setSelected(boolean selected) {
        Selected = selected;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getTier() {
        return tier;
    }

    public void setTier(int tier) {
        this.tier = tier;
    }

    public Spells(String name, String description, int tier)
    {
        this.name=name;
        this.description=description;
        this.tier=tier;
    }

}
