package com.example.ddcharactersheet.Character_Creation;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.ddcharactersheet.MainActivity;
import com.example.ddcharactersheet.Model.Character;
import com.example.ddcharactersheet.R;
import com.example.ddcharactersheet.RoomDB.Character_Databse;

import java.util.LinkedList;
import java.util.List;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

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
