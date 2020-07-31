package com.example.ddcharactersheet.RoomDB;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import com.example.ddcharactersheet.Model.Feats_Entity;

import java.util.List;
@Dao
public interface Feat_Dao {
    @Insert
    void Insert (Feats_Entity... feats);
    @Query("SELECT * FROM Feats_Entity")
    List<Feats_Entity> loadAllFeats();
    @Query("SELECT * FROM Feats_Entity WHERE id=:id")
    Feats_Entity Load_Feat(int id);
    @Query("UPDATE Feats_Entity SET 'Feats'=:race WHERE id = :id")
    void Update(List<String> race, int id);
@Delete
void Delete(Feats_Entity... feats);
}
