package com.example.ddcharactersheet.RoomDB;



import com.example.ddcharactersheet.Model.Feats_Entity;

import java.util.List;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

@Dao
public interface Feat_Dao {
    @Insert
    void Insert(Feats_Entity... feats);
    @Query("SELECT * FROM Feats_Entity")
    List<Feats_Entity> loadAllFeats();
    @Query("SELECT * FROM Feats_Entity WHERE id=:id")
    Feats_Entity Load_Feat(int id);
    @Query("UPDATE Feats_Entity SET 'Feats'=:race WHERE id = :id")
    void Update(List<String> race, int id);
@Delete
void Delete(Feats_Entity... feats);
}
