package com.example.ddcharactersheet;
import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;
import android.support.annotation.NonNull;
@Database(entities = Class_Feat_Entity.class, version =1,exportSchema = false)
public abstract class Class_Feats_DB extends RoomDatabase {

    public abstract  Class_Feat_Dao class_feat_dao();
    @Override
    public void clearAllTables() {

    }
}
