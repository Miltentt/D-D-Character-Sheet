package com.example.ddcharactersheet.RoomDB;


import com.example.ddcharactersheet.Model.Feats_List_Database;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = Feats_List_Database.class, version =1,exportSchema = false)
public abstract class Feats_Database extends RoomDatabase {
    public abstract Feats_Dao feats_dao();
}
