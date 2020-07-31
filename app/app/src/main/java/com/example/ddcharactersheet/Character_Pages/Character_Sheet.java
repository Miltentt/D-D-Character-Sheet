package com.example.ddcharactersheet.Character_Pages;

import android.arch.persistence.room.Room;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.example.ddcharactersheet.Model.Character;
import com.example.ddcharactersheet.RoomDB.Character_Databse;
import com.example.ddcharactersheet.Character_Pages.Equipment.Equipment;
import com.example.ddcharactersheet.RoomDB.EQ_Database;
import com.example.ddcharactersheet.Recursive.HP_LVLUP;
import com.example.ddcharactersheet.R;

import java.util.LinkedList;
import java.util.List;

public class Character_Sheet extends AppCompatActivity {
    private Character_Databse db;
    private EQ_Database EQDB;
    private List<Character> Characters = new LinkedList();
    private TextView name;
    private TextView clas;
    private TextView race;
    private TextView level;
    private TextView s0;
    private TextView s1;
    private TextView d0;
    private TextView d1;
    private TextView c0;
    private TextView c1;
    private TextView i0;
    private TextView i1;
    private TextView w0;
    private TextView w1;
    private TextView ch0;
    private TextView ch1;
    private TextView fort;
    private TextView reflex;
    private TextView will;
    private TextView bab;
    private TextView oab;
    private TextView hp;
    private TextView i;
    private TextView ac;
    private TextView t0;
    private TextView t1;
    private TextView t2;
    private TextView t3;
    private TextView t4;
    private TextView t5;
    private TextView t6;
    private TextView t7;
    private TextView t8;
    private TextView t9;
    private TextView we1;
    private TextView we2;
    private TextView we3;
    private TextView ar1;
    private TextView ar2;
    private TextView sh1;
    private TextView sh2;
    private int position;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.character);
        db = Room.databaseBuilder(getApplicationContext(), Character_Databse.class, "Characters1")
                .allowMainThreadQueries()
                .build();
        Characters = db.characterdao().loadAllTasks();
        Bundle extras = getIntent().getExtras();
        this.position = extras.getInt("position");
        EQDB = Room.databaseBuilder(getApplicationContext(), EQ_Database.class, "Charactersss")
                .allowMainThreadQueries()
                .build();
        level = findViewById(R.id.level);
        name = findViewById(R.id.name);
        clas = findViewById(R.id.clas);
        race = findViewById(R.id.race);
        we1 = findViewById(R.id.we1);
        we2 = findViewById(R.id.we2);
        we3 = findViewById(R.id.we3);
        ar1 = findViewById(R.id.ar1);
        ar2 = findViewById(R.id.ar2);
        sh1 = findViewById(R.id.sh1);
        sh2 = findViewById(R.id.sh2);
        s0 = findViewById(R.id.s0);
        s1 = findViewById(R.id.s1);
        d0 = findViewById(R.id.d0);
        d1 = findViewById(R.id.d1);
        c0 = findViewById(R.id.c0);
        c1 = findViewById(R.id.c1);
        String namee = Characters.get(position).getName().substring(0,1).toUpperCase();
        name.setText( namee + Characters.get(position).getName().substring(1));
        String classs = Characters.get(position).getClas().substring(0,1).toUpperCase();
        clas.setText( classs +Characters.get(position).getClas().substring(1));
        race.setText(Characters.get(position).getRace());
        level.setText("Level " + Integer.toString(Characters.get(position).getLevel()));
        w1 = findViewById(R.id.w1);
        ch0 = findViewById(R.id.ch0);
        ch1 = findViewById(R.id.ch1);
        w0 = findViewById(R.id.w0);
        i0 = findViewById(R.id.i0);
        i1 = findViewById(R.id.i1);
        fort = findViewById(R.id.fort);
        reflex = findViewById(R.id.reflex);
        will = findViewById(R.id.will);
        bab = findViewById(R.id.bab);
        i = findViewById(R.id.i);
        hp = findViewById(R.id.hp);
        ac = findViewById(R.id.ac);
        t0 = findViewById(R.id.t0);
        t1 = findViewById(R.id.t1);
        t2 = findViewById(R.id.t2);
        t3 = findViewById(R.id.t3);
        t4 = findViewById(R.id.t4);
        t5 = findViewById(R.id.t5);
        t6 = findViewById(R.id.t6);
        t7 = findViewById(R.id.t7);
        t8 = findViewById(R.id.t8);
        t9 = findViewById(R.id.t9);
        s0.setText(Integer.toString(Characters.get(position).getStr()));
        s1.setText(Integer.toString(Characters.get(position).getStrc()));
        d0.setText(Integer.toString(Characters.get(position).getDex()));
        d1.setText(Integer.toString(Characters.get(position).getDexc()));
        c0.setText(Integer.toString(Characters.get(position).getCon()));
        c1.setText(Integer.toString(Characters.get(position).getConc()));
        i0.setText(Integer.toString(Characters.get(position).getIntel()));
        i1.setText(Integer.toString(Characters.get(position).getIntelc()));
        w0.setText(Integer.toString(Characters.get(position).getWis()));
        w1.setText(Integer.toString(Characters.get(position).getWisc()));
        ch0.setText(Integer.toString(Characters.get(position).getCha()));
        ch1.setText(Integer.toString(Characters.get(position).getChac()));
        bab.setText((Characters.get(position).getBAB()));
        i.setText(Integer.toString(Characters.get(position).getDexc()));
        hp.setText(Integer.toString(Characters.get(position).getHp()));
        ac.setText(Integer.toString(Characters.get(position).getAC()));
        fort.setText(Integer.toString(Characters.get(position).getFort()));
        will.setText(Integer.toString(Characters.get(position).getWill()));
        reflex.setText(Integer.toString(Characters.get(position).getReflex()));
        t0.setText(Integer.toString(Characters.get(position).getSp0()));
        t1.setText(Integer.toString(Characters.get(position).getSp1()));
        t2.setText(Integer.toString(Characters.get(position).getSp2()));
        t3.setText(Integer.toString(Characters.get(position).getSp3()));
        t4.setText(Integer.toString(Characters.get(position).getSp4()));
        t5.setText(Integer.toString(Characters.get(position).getSp5()));
        t6.setText(Integer.toString(Characters.get(position).getSp6()));
        t7.setText(Integer.toString(Characters.get(position).getSp7()));
        t8.setText(Integer.toString(Characters.get(position).getSp8()));
        t9.setText(Integer.toString(Characters.get(position).getSp9()));
if(Characters.get(position).getIdw1()!=-1)
{
    we1.setText(EQDB.EQDao().Load_EQ(Characters.get(position).getIdw1()).getBonus());
}
        if(Characters.get(position).getIdw2()!=-1)
        {
            we2.setText(EQDB.EQDao().Load_EQ(Characters.get(position).getIdw2()).getBonus());
        }
        if(Characters.get(position).getIdw3()!=-1)
        {
            we3.setText(EQDB.EQDao().Load_EQ(Characters.get(position).getIdw3()).getBonus());
        }
        if(Characters.get(position).getIda1()!=-1)
        {
            ar1.setText(EQDB.EQDao().Load_EQ(Characters.get(position).getIda1()).getAC());
        }
        if(Characters.get(position).getIda2()!=-1)
        {
            ar2.setText(EQDB.EQDao().Load_EQ(Characters.get(position).getIda2()).getAC());
        }
        if(Characters.get(position).getIds1()!=-1)
        {
            sh1.setText(EQDB.EQDao().Load_EQ(Characters.get(position).getIds1()).getAC());
        }
        if(Characters.get(position).getIds2()!=-1)
        {
            sh2.setText(EQDB.EQDao().Load_EQ(Characters.get(position).getIds2()).getAC());
        }


    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.layout.main_menu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id=item.getItemId();
        switch (id)
        {
            case R.id.Skills:
            {
                Bundle extras = new Bundle();
                Intent i = new Intent(this, Character_Skills.class);
                extras.putInt("position",position);
                i.putExtras(extras);
                startActivity(i);
                break;
            }
            case R.id.Feats:
            {
                Bundle extras = new Bundle();
                Intent i = new Intent(this, Feat_Character.class);
                extras.putInt("position",position);
                i.putExtras(extras);
                startActivity(i);
                break;
            }
            case R.id.Spells:
            {
                if(Characters.get(position).getClas().equals("cleric"))
                {
                    Bundle extras = new Bundle();
                    Intent i = new Intent(this, Cleric_Spells_Char.class);
                    extras.putInt("position", position);
                    i.putExtras(extras);
                    startActivity(i);
                }else {
                if(Characters.get(position).getClas().equals("wizard") || Characters.get(position).getClas().equals("sorcerer")) {
                    Bundle extras = new Bundle();
                    Intent i = new Intent(this, Spells_Character.class);
                    extras.putInt("position", position);
                    i.putExtras(extras);
                    startActivity(i);
                } else {
                    if (Characters.get(position).getClas().equals("paladin") || Characters.get(position).getClas().equals("ranger") || Characters.get(position).getClas().equals("bard") || Characters.get(position).getClas().equals("druid")) {
                        Bundle extras = new Bundle();
                        Intent i = new Intent(this, Spells_OtherClasses.class);
                        extras.putInt("position", position);
                        i.putExtras(extras);
                        startActivity(i);
                    } else {
                        Bundle extras = new Bundle();
                        Intent i = new Intent(this, No_Spells_Character.class);
                        extras.putInt("position", position);
                        i.putExtras(extras);
                        startActivity(i);
                    }
                }
                }
                break;
            }
            case R.id.Equipment:
            {
                Bundle extras = new Bundle();
                Intent i = new Intent(this, Equipment.class);
                extras.putInt("position",position);
                i.putExtras(extras);
                startActivity(i);
                break;
            }
            case R.id.Stats:
            {
                Bundle extras = new Bundle();
                Intent i = new Intent(this, Character_Sheet.class);
                extras.putInt("position",position);
                i.putExtras(extras);
                startActivity(i);
                break;
            }
        }
        return super.onOptionsItemSelected(item);
    }


    public void Level(View v)
    {
        Bundle extras = new Bundle();
        Intent i = new Intent(this, HP_LVLUP.class);
        extras.putInt("position",position);
        i.putExtras(extras);
        startActivity(i);


    }



}
