package com.example.ddcharactersheet;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

@Dao
public interface Class_Feat_Dao {
    @Insert
    void Insert(Class_Feat_Entity... feats);

    @Query("SELECT * FROM Class_Feat_Entity")
    List<Class_Feat_Entity> loadAllSpells();

    @Query("SELECT * FROM Class_Feat_Entity WHERE id=:id")
    Class_Feat_Entity Load_Spell(int id);
    @Delete
    void Delete(Class_Feat_Entity... feats);
}
