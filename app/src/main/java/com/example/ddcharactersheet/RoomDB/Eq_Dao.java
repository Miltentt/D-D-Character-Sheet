package com.example.ddcharactersheet.RoomDB;



import com.example.ddcharactersheet.Model.Equipment_Entity;

import java.util.List;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

@Dao
public interface Eq_Dao {
    @Insert
    void Insert(Equipment_Entity... eq);
    @Delete
    void Delete(Equipment_Entity... feats);
    @Query("SELECT * FROM Equipment_Entity")
    List<Equipment_Entity> loadAllEQs();
    @Query("SELECT * FROM Equipment_Entity WHERE id=:id")
    Equipment_Entity Load_EQ(int id);
    @Update
    void Update(Equipment_Entity... eq);


}
