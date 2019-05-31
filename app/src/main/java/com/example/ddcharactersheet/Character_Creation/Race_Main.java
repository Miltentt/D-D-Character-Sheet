package com.example.ddcharactersheet.Character_Creation;

import android.arch.persistence.room.Room;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.ddcharactersheet.Character;
import com.example.ddcharactersheet.Character_Databse;
import com.example.ddcharactersheet.Statistics.Extra_Spells;
import com.example.ddcharactersheet.R;
import com.example.ddcharactersheet.Recursive.Skills;

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
    private TextView text;
    private int calc;
private int clas;
private int race;
    private Character_Databse db;
    private List<Character> Characters = new LinkedList();
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.stats);
        getSupportActionBar().hide();
        db = Room.databaseBuilder(getApplicationContext(), Character_Databse.class, "Characters1")
                .allowMainThreadQueries()
                .build();
        Characters = db.characterdao().loadAllTasks();
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
      switch(Characters.get(Characters.size()-1).getRace())
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
    int position =Characters.size()-1;
  Characters.get(position).setStr(str);
    Characters.get(position).setDex(dex);
    Characters.get(position).setCon(con);
    Characters.get(position).setIntel(intel);
    Characters.get(position).setWis(wis);
    Characters.get(position).setCha(cha);
    Characters.get(position).setStrc(calculatemod(str));
    Characters.get(position).setDexc(calculatemod(dex));
    Characters.get(position).setConc(calculatemod(con));
    Characters.get(position).setIntelc(calculatemod(intel));
    Characters.get(position).setWisc(calculatemod(wis));
    Characters.get(position).setChac(calculatemod(cha));

    int ac = Characters.get(Characters.size()-1).getAC() + calculatemod(dex);
    Characters.get(position).setAC(ac);
db.characterdao().updatechar(Characters.get(position));

    Extra_Spells extra = new Extra_Spells(this,Characters.get(position));
    Intent i = new Intent(this, Skills.class);
    extras.putInt("position",position);
    i.putExtras(extras);

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
