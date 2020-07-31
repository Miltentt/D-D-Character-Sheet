package com.example.ddcharactersheet.RoomDB;

import com.example.ddcharactersheet.Model.Character;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = Character.class, version =2,exportSchema = false)
public abstract class Character_Databse extends RoomDatabase {
    public abstract CharacterDao characterdao();
    @Override
    public void clearAllTables()
    {

    }

}
