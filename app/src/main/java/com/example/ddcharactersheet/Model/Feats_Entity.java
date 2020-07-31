package com.example.ddcharactersheet.Model;

import com.example.ddcharactersheet.TypeConverter;

import java.util.LinkedList;
import java.util.List;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import androidx.room.TypeConverters;

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
