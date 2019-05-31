package com.example.ddcharactersheet;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;
@Database(entities = Feats_Entity.class, version =1,exportSchema = false)
public abstract class Feats_DB extends RoomDatabase {
    public abstract  Feat_Dao feats_dao();
}
