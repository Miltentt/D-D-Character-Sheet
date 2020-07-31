package com.example.ddcharactersheet.Character_Pages.Equipment;

import android.arch.persistence.room.Room;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.ddcharactersheet.Model.Character;
import com.example.ddcharactersheet.RoomDB.Character_Databse;
import com.example.ddcharactersheet.RoomDB.EQ_Database;
import com.example.ddcharactersheet.Model.Equipment_Entity;
import com.example.ddcharactersheet.R;

import java.util.LinkedList;
import java.util.List;

public class Add_Shield extends AppCompatActivity {
    private EditText name;
    private EditText bonus;
    private TextView main;
    private EditText ac;
    private EditText special;
    private EQ_Database EQDB;
    private List<Equipment_Entity> EQ = new LinkedList();
    private Character_Databse db;
    private List<Character> Characters = new LinkedList();
    private int position;
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
        if (Characters.get(position).getIds1() == -1) {
            Characters.get(position).setIds1(lol);
            db.characterdao().updatechar(Characters.get(position));
        } else {
            if (Characters.get(position).getIds2() == -1) {
                Characters.get(position).setIds2(lol);
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




