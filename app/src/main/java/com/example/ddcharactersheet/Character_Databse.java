package com.example.ddcharactersheet;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;
@Database(entities = Character.class, version =2,exportSchema = false)
public abstract class Character_Databse extends RoomDatabase {
    public abstract  CharacterDao characterdao();
    @Override
    public void clearAllTables()
    {

    }

}
