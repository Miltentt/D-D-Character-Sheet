package com.example.ddcharactersheet.RoomDB;



import com.example.ddcharactersheet.Model.Feats_Entity;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = Feats_Entity.class, version =1,exportSchema = false)
public abstract class Feats_DB extends RoomDatabase {
    public abstract Feat_Dao feats_dao();
}
