package com.example.ddcharactersheet.Model;



import com.example.ddcharactersheet.TypeConverter;

import java.util.LinkedList;
import java.util.List;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import androidx.room.TypeConverters;

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
