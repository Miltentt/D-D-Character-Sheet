package com.example.ddcharactersheet.Character_Creation;

import android.arch.persistence.room.Room;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

import com.example.ddcharactersheet.Model.Character;
import com.example.ddcharactersheet.RoomDB.Character_Databse;
import com.example.ddcharactersheet.MainActivity;
import com.example.ddcharactersheet.R;

import java.util.LinkedList;
import java.util.List;

public class Name extends AppCompatActivity {
private EditText text;
    private Character_Databse db;
    private List<Character> Characters = new LinkedList();
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.name);
        text = findViewById(R.id.editText);
        db = Room.databaseBuilder(getApplicationContext(), Character_Databse.class, "Characters1")
                .allowMainThreadQueries()
                .build();
        Characters = db.characterdao().loadAllTasks();
    }
    public void next(View v)
    {
db.characterdao().name(text.getText().toString(),Characters.get(Characters.size()-1).getId());
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);

    }



}
