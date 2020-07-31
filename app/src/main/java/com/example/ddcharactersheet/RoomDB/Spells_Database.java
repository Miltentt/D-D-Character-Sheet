package com.example.ddcharactersheet.RoomDB;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import com.example.ddcharactersheet.Model.Spells_Entity;

@Database(entities = Spells_Entity.class, version =1,exportSchema = false)
public abstract class Spells_Database extends RoomDatabase {
    public abstract Spells_Dao spells_dao();
}