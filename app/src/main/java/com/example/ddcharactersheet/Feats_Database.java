package com.example.ddcharactersheet;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;
@Database(entities = Feats_List_Database.class, version =1,exportSchema = false)
public abstract class Feats_Database extends RoomDatabase {
    public abstract  Feats_Dao feats_dao();
}
