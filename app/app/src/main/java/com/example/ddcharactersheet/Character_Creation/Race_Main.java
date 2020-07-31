package com.example.ddcharactersheet.Character_Creation;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.ddcharactersheet.Model.Character;
import com.example.ddcharactersheet.RoomDB.Character_Databse;
import com.example.ddcharactersheet.Statistics.Extra_Spells;
import com.example.ddcharactersheet.R;
import com.example.ddcharactersheet.Recursive.Skills;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

public class Race_Main extends AppCompatActivity {

    protected TextView str3;
    protected TextView dex3;
    protected TextView con3;
    protected TextView intel3;
    protected TextView wis3;
    protected TextView cha3;
    protected EditText str1;
    protected EditText dex1;
    protected EditText con1;
    protected EditText intel1;
    protected EditText wis1;
    protected EditText cha1;
    private int calc;
private Character character;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.stats);
        getSupportActionBar().hide();
       Intent i = this.getIntent();
character = (Character) i.getSerializableExtra("character");
str3 = findViewById(R.id.str3);
dex3 = findViewById(R.id.dex3);
con3=findViewById(R.id.con3);
intel3=findViewById(R.id.int3);
wis3 = findViewById(R.id.wis3);
cha3=findViewById(R.id.cha3);
str1 = findViewById(R.id.str1);
dex1 = findViewById(R.id.dex1);
con1=findViewById(R.id.con1);
intel1=findViewById(R.id.int1);
wis1 = findViewById(R.id.wis1);
cha1=findViewById(R.id.cha1);
      switch(character.getRace())
      {
          case "Dwarf":
          {
              racial(0,0,2,0,0,-2);
              break;
          }
          case "Human": {
              racial(0, 0, 0, 0, 0, 0);
              break;
          }
          case "Elf":
          {
              racial(0,2,-2,0,0,0);
              break;
          }
          case "Gnome":
          {
              racial(-2,0,2,0,0,0);
              break;
          }
          case "Half-Orc":
          {
              racial(2,0,0,-2,0,-2);
              break;
          }
          case "Half-Elf": {
              racial(0, 0, 0, 0, 0, 0);
              break;
          }
          case "Halfling": {
              racial(0, 0, 0, 0, 0, 0);
              break;
          }
          case "Tiefling":
          {
              racial(0, +2, 0, +2, 0, -2);
              break;
          }
          case "Orog":
          {
              racial(6, -2, 0, 0, -2, +2);
              break;
          }
          case "Fey'ri":
          {
              racial(0, +2, -2, +2, 0, 0);
          }
          case "Fire Genasi":
          {
              racial(0, 0, 0, 2, 0, -2);
          }

      }

    }

    protected void racial(int str, int dex, int con, int intel, int wis, int cha)
{
str3.setText(Integer.toString(str));
dex3.setText(Integer.toString(dex));
con3.setText(Integer.toString(con));
intel3.setText(Integer.toString(intel));
wis3.setText(Integer.toString(wis));
cha3.setText(Integer.toString(cha));

}

public void next(View view)
{
    int str;
    int dex;
    int con;
    int intel;
    int wis;
    int cha;
    str = Integer.parseInt(str3.getText().toString())+Integer.parseInt(str1.getText().toString());
    dex = Integer.parseInt(dex3.getText().toString())+Integer.parseInt(dex1.getText().toString());
    con = Integer.parseInt(con3.getText().toString())+Integer.parseInt(con1.getText().toString());
    intel = Integer.parseInt(intel3.getText().toString())+Integer.parseInt(intel1.getText().toString());
    wis = Integer.parseInt(wis3.getText().toString())+Integer.parseInt(wis1.getText().toString());
    cha = Integer.parseInt(cha3.getText().toString())+Integer.parseInt(cha1.getText().toString());
    Bundle extras = new Bundle();
  character.setStr(str);
    character.setDex(dex);
    character.setCon(con);
    character.setIntel(intel);
    character.setWis(wis);
    character.setCha(cha);
    character.setStrc(calculatemod(str));
    character.setDexc(calculatemod(dex));
    character.setConc(calculatemod(con));
    character.setIntelc(calculatemod(intel));
    character.setWisc(calculatemod(wis));
    character.setChac(calculatemod(cha));

    int ac =  character.getAC() + calculatemod(dex);
    character.setAC(ac);


    Extra_Spells extra = new Extra_Spells(this, character);
    Intent i = new Intent(this, Skills.class);
    i.putExtra("character", (Serializable) character);
    startActivity(i);
}
private int calculatemod(int value) {
calc=-6;
for(int i =0;i<=value;i+=2)
    {
        calc++;
    }

return calc;
}

}
