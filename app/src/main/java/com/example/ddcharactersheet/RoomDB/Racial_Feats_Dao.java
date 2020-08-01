package com.example.ddcharactersheet.RoomDB;



import com.example.ddcharactersheet.Model.Racial_Feats_Entity;

import java.util.List;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

@Dao
public interface Racial_Feats_Dao {

    @Insert
    void Insert(Racial_Feats_Entity... feats);

    @Query("SELECT * FROM Racial_Feats_Entity")
    List<Racial_Feats_Entity> loadAllSpells();

    @Query("SELECT * FROM Racial_Feats_Entity WHERE id=:id")
    Racial_Feats_Entity Load_Spell(int id);
    @Delete
    void Delete(Racial_Feats_Entity... feats);

}
