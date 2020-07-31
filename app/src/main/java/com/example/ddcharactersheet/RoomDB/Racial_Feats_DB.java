package com.example.ddcharactersheet.RoomDB;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import com.example.ddcharactersheet.Model.Racial_Feats_Entity;

@Database(entities = Racial_Feats_Entity.class, version =1,exportSchema = false)
public abstract class Racial_Feats_DB extends RoomDatabase {

    public abstract Racial_Feats_Dao racial_feats_dao();
    @Override
    public void clearAllTables() {

    }
}
