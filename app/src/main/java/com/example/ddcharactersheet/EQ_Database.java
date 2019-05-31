package com.example.ddcharactersheet;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;
@Database(entities = Equipment_Entity.class, version =1,exportSchema = false)
public abstract class EQ_Database extends RoomDatabase {
    public abstract  Eq_Dao EQDao();
    @Override
    public void clearAllTables()
    {

    }
}
