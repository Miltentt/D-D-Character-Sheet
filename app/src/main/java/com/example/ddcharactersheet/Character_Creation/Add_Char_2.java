package com.example.ddcharactersheet.Character_Creation;

import android.arch.persistence.room.Room;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.example.ddcharactersheet.Character;
import com.example.ddcharactersheet.Character_Databse;
import com.example.ddcharactersheet.R;

import java.util.LinkedList;
import java.util.List;


public class Add_Char_2 extends AppCompatActivity {
    private TextView choose;
    private int clas;
    private RadioGroup rg;
    private Character_Databse db;
    int buttonid;
    private List<Character> Characters = new LinkedList();
    String races[] = {"Dwarf","Human","Elf","Gnome","Half-Elf","Half-Orc","Halfling","Tiefling","Orog","Fey'ri","Fire Genasi"};
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.race);
        getSupportActionBar().hide();
        choose = findViewById(R.id.choose1);
        rg = findViewById(R.id.radio);

        db = Room.databaseBuilder(getApplicationContext(), Character_Databse.class, "Characters1")
                .allowMainThreadQueries()
                .build();
        Characters = db.characterdao().loadAllTasks();

    }
    public void next(View view)
    {
        Intent i = new Intent(this, Race_Main.class);
        int buttonid = rg.getCheckedRadioButtonId();
        View rb = rg.findViewById(buttonid);
        int idx = rg.indexOfChild(rb);
int number = Characters.get(Characters.size()-1).getId();

        db.characterdao().update2(races[idx],number);

        startActivity(i);
    }
}
