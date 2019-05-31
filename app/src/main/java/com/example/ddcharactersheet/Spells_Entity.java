package com.example.ddcharactersheet;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.arch.persistence.room.TypeConverters;

import java.util.LinkedList;
import java.util.List;
@Entity
public class Spells_Entity  {
    public Spells_Entity()
    {
spell0 = new LinkedList<>();
        spell1 = new LinkedList<>();
        spell2 = new LinkedList<>();
        spell3 = new LinkedList<>();
        spell4 = new LinkedList<>();
        spell5 = new LinkedList<>();
        spell6 = new LinkedList<>();
        spell7 = new LinkedList<>();
        spell8 = new LinkedList<>();
        spell9 = new LinkedList<>();

    }


    @PrimaryKey(autoGenerate = true)
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public List<String> getSpell() {
        return spell0;
    }

    public void setSpell(List<String> spell) {
        this.spell0 = spell;
    }

    @TypeConverters(TypeConverter.class)
    @ColumnInfo(name="Spells0")
    private List<String> spell0;
    @TypeConverters(TypeConverter.class)
    @ColumnInfo(name="Spells1")
    private List<String> spell1;
    @TypeConverters(TypeConverter.class)
    @ColumnInfo(name="Spells2")
    private List<String> spell2;
    @TypeConverters(TypeConverter.class)
    @ColumnInfo(name="Spells3")
    private List<String> spell3;
    @TypeConverters(TypeConverter.class)
    @ColumnInfo(name="Spells4")
    private List<String> spell4;
    @TypeConverters(TypeConverter.class)
    @ColumnInfo(name="Spells5")
    private List<String> spell5;
    @TypeConverters(TypeConverter.class)
    @ColumnInfo(name="Spells6")
    private List<String> spell6;

    public List<String> getSpell0() {
        return spell0;
    }

    public void setSpell0(List<String> spell0) {
        this.spell0 = spell0;
    }

    public List<String> getSpell1() {
        return spell1;
    }

    public void setSpell1(List<String> spell1) {
        this.spell1 = spell1;
    }

    public List<String> getSpell2() {
        return spell2;
    }

    public void setSpell2(List<String> spell2) {
        this.spell2 = spell2;
    }

    public List<String> getSpell3() {
        return spell3;
    }

    public void setSpell3(List<String> spell3) {
        this.spell3 = spell3;
    }

    public List<String> getSpell4() {
        return spell4;
    }

    public void setSpell4(List<String> spell4) {
        this.spell4 = spell4;
    }

    public List<String> getSpell5() {
        return spell5;
    }

    public void setSpell5(List<String> spell5) {
        this.spell5 = spell5;
    }

    public List<String> getSpell6() {
        return spell6;
    }

    public void setSpell6(List<String> spell6) {
        this.spell6 = spell6;
    }

    public List<String> getSpell7() {
        return spell7;
    }

    public void setSpell7(List<String> spell7) {
        this.spell7 = spell7;
    }

    public List<String> getSpell8() {
        return spell8;
    }

    public void setSpell8(List<String> spell8) {
        this.spell8 = spell8;
    }

    public List<String> getSpell9() {
        return spell9;
    }

    public void setSpell9(List<String> spell9) {
        this.spell9 = spell9;
    }

    @TypeConverters(TypeConverter.class)
    @ColumnInfo(name="Spells7")
    private List<String> spell7;
    @TypeConverters(TypeConverter.class)
    @ColumnInfo(name="Spells8")
    private List<String> spell8;
    @TypeConverters(TypeConverter.class)
    @ColumnInfo(name="Spells9")
    private List<String> spell9;

}

