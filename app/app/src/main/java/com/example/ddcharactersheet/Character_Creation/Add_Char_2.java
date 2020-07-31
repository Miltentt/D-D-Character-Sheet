package com.example.ddcharactersheet.Character_Creation;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.example.ddcharactersheet.Model.Character;
import com.example.ddcharactersheet.RoomDB.Character_Databse;
import com.example.ddcharactersheet.R;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;


public class Add_Char_2 extends AppCompatActivity {
    private TextView choose;
    private Character character;
    private RadioGroup rg;
    private List<Character> Characters = new LinkedList();
    String races[] = {"Dwarf","Human","Elf","Gnome","Half-Elf","Half-Orc","Halfling","Tiefling","Orog","Fey'ri","Fire Genasi"};
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.race);
        getSupportActionBar().hide();
        choose = findViewById(R.id.choose1);
        rg = findViewById(R.id.radio);
        Intent i = this.getIntent();
        character = (Character) i.getSerializableExtra("character");


    }
    public void next(View view)
    {
        Intent i = new Intent(this, Race_Main.class);
        int buttonid = rg.getCheckedRadioButtonId();
        View rb = rg.findViewById(buttonid);
        int idx = rg.indexOfChild(rb);
      character.setRace(races[idx]);
        i.putExtra("character", (Serializable)character);
        startActivity(i);
    }
}
