package com.example.ddcharactersheet.RoomDB;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import com.example.ddcharactersheet.Model.Equipment_Entity;

import java.util.List;

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
