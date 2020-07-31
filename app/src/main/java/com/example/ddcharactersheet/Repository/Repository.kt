package com.example.ddcharactersheet.Repository
import android.content.Context
import androidx.room.Room
import com.example.ddcharactersheet.RoomDB.Character_Databse

class Repository constructor(context : Context) {

val context = context

    companion object
    {
        var   instance : Repository? = null
        public fun Repository(context: Context): Repository? {
            if(instance==null)
            {
                instance =  Repository(context);
            }
            return instance
        }
    }

    val characterDatabse = Room.databaseBuilder<Character_Databse>(context, Character_Databse::class.java, "Characters1")
            .allowMainThreadQueries()
            .build()












}