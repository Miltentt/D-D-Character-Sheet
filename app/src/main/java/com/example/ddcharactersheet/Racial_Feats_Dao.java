package com.example.ddcharactersheet;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;
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
