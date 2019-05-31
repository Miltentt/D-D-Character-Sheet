package com.example.ddcharactersheet;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.arch.persistence.room.TypeConverters;

import java.util.LinkedList;
import java.util.List;

@Entity
public class Feats_Entity {
   public Feats_Entity()
   {
       Feats = new LinkedList<>();
   }


    @PrimaryKey(autoGenerate = true)
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<String> getFeats() {
        return Feats;
    }

    public void setFeats(List<String> feats) {
        Feats = feats;
    }
@TypeConverters(TypeConverter.class)
    @ColumnInfo(name="Feats")
    private List<String> Feats;
}
