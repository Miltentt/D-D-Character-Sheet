package com.example.ddcharactersheet.Model;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.arch.persistence.room.TypeConverters;

import com.example.ddcharactersheet.TypeConverter;

import java.util.LinkedList;
import java.util.List;

@Entity
public class Racial_Feats_Entity {

public Racial_Feats_Entity()
{
    name = new LinkedList<>();
    pre = new LinkedList<>();
}

    @PrimaryKey(autoGenerate = true)
    private int id;
    @TypeConverters(TypeConverter.class)
    @ColumnInfo(name="Name")
    private List<String> name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<String> getName() {
        return name;
    }

    public void setName(List<String> name) {
        this.name = name;
    }

    public List<String> getPre() {
        return pre;
    }

    public void setPre(List<String> pre) {
        this.pre = pre;
    }

    @TypeConverters(TypeConverter.class)
    @ColumnInfo(name="Pre")
    private List<String> pre;
}
