package com.example.ddcharactersheet.RoomDB;



import com.example.ddcharactersheet.Model.Equipment_Entity;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = Equipment_Entity.class, version =1,exportSchema = false)
public abstract class EQ_Database extends RoomDatabase {
    public abstract Eq_Dao EQDao();
    @Override
    public void clearAllTables()
    {

    }
}
