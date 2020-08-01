package com.example.ddcharactersheet.Character_Pages.Equipment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.ddcharactersheet.Model.Character;
import com.example.ddcharactersheet.Model.Equipment_Entity;
import com.example.ddcharactersheet.R;
import com.example.ddcharactersheet.RoomDB.Character_Databse;
import com.example.ddcharactersheet.RoomDB.EQ_Database;

import java.util.LinkedList;
import java.util.List;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

public class Add_Armor extends AppCompatActivity {
    private EditText name;
    private TextView main;
    private EditText ac;
    private EditText special;
    private EQ_Database EQDB;
    private int position;
    private List<Equipment_Entity> EQ = new LinkedList();
    private Character_Databse db;
    private List<Character> Characters = new LinkedList();
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_armor);
        Bundle extras = getIntent().getExtras();
        this.position = extras.getInt("position");
        main = findViewById(R.id.main);
        main.setText("Add a Shield");
        ac = findViewById(R.id.ac);
        special = findViewById(R.id.special);
        name = findViewById(R.id.name);
        EQDB = Room.databaseBuilder(getApplicationContext(), EQ_Database.class, "Charactersss")
                .allowMainThreadQueries()
                .build();
        EQ = EQDB.EQDao().loadAllEQs();
        db = Room.databaseBuilder(getApplicationContext(), Character_Databse.class, "Characters1")
                .allowMainThreadQueries()
                .build();
        Characters = db.characterdao().loadAllTasks();
    }
    void next(View v)
    {
        Equipment_Entity weaponn = new Equipment_Entity(1);
        weaponn.setName(name.getText().toString());
        weaponn.setAC(ac.getText().toString());
        weaponn.setSpecial(special.getText().toString());
        EQDB.EQDao().Insert(weaponn);
        EQ = EQDB.EQDao().loadAllEQs();
        int lol = EQ.get(EQ.size()-1).getId();
        if (Characters.get(position).getIda1() == -1) {
            Characters.get(position).setIda1(lol);
            db.characterdao().updatechar(Characters.get(position));
        } else {
            if (Characters.get(position).getIda2() == -1) {
                Characters.get(position).setIda2(lol);
                db.characterdao().updatechar(Characters.get(position));
            }

        }
        Bundle extras = new Bundle();
        Intent i = new Intent(this, Equipment.class);
        extras.putInt("position", position);
        i.putExtras(extras);
        startActivity(i);
    }

    }

