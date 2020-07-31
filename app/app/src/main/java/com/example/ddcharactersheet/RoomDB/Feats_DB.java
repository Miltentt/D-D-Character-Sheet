package com.example.ddcharactersheet.RoomDB;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import com.example.ddcharactersheet.Model.Feats_Entity;

@Database(entities = Feats_Entity.class, version =1,exportSchema = false)
public abstract class Feats_DB extends RoomDatabase {
    public abstract Feat_Dao feats_dao();
}
