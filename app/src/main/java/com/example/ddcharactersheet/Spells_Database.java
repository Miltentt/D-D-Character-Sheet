package com.example.ddcharactersheet;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;
@Database(entities = Spells_Entity.class, version =1,exportSchema = false)
public abstract class Spells_Database extends RoomDatabase {
    public abstract  Spells_Dao spells_dao();
}