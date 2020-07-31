package com.example.ddcharactersheet.Model;

public class Feats_List {
    private String name;
    private String benefits;
    private String prerequisites;
    private boolean warrior;
    private boolean Selected;

    public String getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(String prerequisites) {
        this.prerequisites = prerequisites;
    }

    public boolean isWarrior() {
        return warrior;
    }

    public void setWarrior(boolean warrior) {
        this.warrior = warrior;
    }

    public boolean isSelected() {
        return Selected;
    }

    public void setSelected(boolean selected) {
        Selected = selected;
    }

    public Feats_List(String name, String benefits, String prerequisites, boolean warrior)
    {
        this.name=name;
        this.benefits=benefits;
        this.prerequisites=prerequisites;
        this.warrior = warrior;
        this.Selected=false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBenefits() {
        return benefits;
    }

    public void setBenefits(String benefits) {
        this.benefits = benefits;
    }

    public String getPrequisites() {
        return prerequisites;
    }

    public void setPrequisites(String prequisites) {
        this.prerequisites = prequisites;
    }

    public boolean isHas() {
        return warrior;
    }

    public void setHas(boolean warrior) {
        this.warrior = warrior;
    }
}
