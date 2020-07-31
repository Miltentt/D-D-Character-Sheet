package com.example.ddcharactersheet.RoomDB;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import com.example.ddcharactersheet.Model.Equipment_Entity;

@Database(entities = Equipment_Entity.class, version =1,exportSchema = false)
public abstract class EQ_Database extends RoomDatabase {
    public abstract Eq_Dao EQDao();
    @Override
    public void clearAllTables()
    {

    }
}
