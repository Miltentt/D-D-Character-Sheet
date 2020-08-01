package com.example.ddcharactersheet.RoomDB;

import com.example.ddcharactersheet.Model.Spells_Entity;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = Spells_Entity.class, version =1,exportSchema = false)
public abstract class Spells_Database extends RoomDatabase {
    public abstract Spells_Dao spells_dao();
}