package com.example.ddcharactersheet.Recursive;

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
import com.example.ddcharactersheet.R;
import com.example.ddcharactersheet.Statistics.Base_Stats;
import com.example.ddcharactersheet.Statistics.Extra_Spells;

import java.util.LinkedList;
import java.util.List;

public class HP_LVLUP extends AppCompatActivity {
private Character_Databse db;
private List<Character> Characters = new LinkedList<>();
private Character character;
private int position;
private EditText hp;
    private TextView bonus;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
        setContentView(R.layout.hp_layout);
        db = Room.databaseBuilder(getApplicationContext(), Character_Databse.class, "Characters1")
                .allowMainThreadQueries()
                .build();
        Characters = db.characterdao().loadAllTasks();
        Bundle extras = getIntent().getExtras();
        this.position = extras.getInt("position");
        hp  =findViewById(R.id.hp);
        bonus = findViewById(R.id.bonus);
        bonus.setText(Integer.toString(Characters.get(position).getConc()));
        switch (Characters.get(position).getClas())
        {
            case "barbarian":
            {
hp.setHint("Roll a d12");
                break;
            }
            case "rogue":
            case "bard":
            {
                hp.setHint("Roll a d6");
                break;
            }
            case "monk":
            case "cleric":
            case "druid":
            {
                hp.setHint("Roll a d8");
                break;
            }
            case "wizard":
            case "sorcerer":
            {
                hp.setHint("Roll a d4");
                break;
            }
            case "warrior":
            case "paladin":
            case "ranger":
            {
                hp.setHint("Roll a d10");
                break;
            }
        }

    }

    public void next (View v)
    {
        Characters.get(position).setHp(Characters.get(position).getHp()+Integer.parseInt(hp.getText().toString())+Characters.get(position).getConc());
        Characters.get(position).setLevel(Characters.get(position).getLevel()+1);
        Base_Stats a= new Base_Stats(this,Characters.get(position));
        if(Characters.get(position).getClas().equals("barbarian") || Characters.get(position).getClas().equals("rogue"))
        {
            Characters.get(position).setAC( Characters.get(position).getAC()+  Characters.get(position).getDexc());
        }
        if(Characters.get(position).getClas().equals("monk") && Characters.get(position).getIda1()==-1 && Characters.get(position).getIda2()==-1)
        {
            Characters.get(position).setAC( Characters.get(position).getAC()+  Characters.get(position).getWisc());
        }
        Extra_Spells extra = new Extra_Spells(this,Characters.get(position));
        db.characterdao().updatechar(Characters.get(position));
        if(Characters.get(position).getClas().equals("wizard") || Characters.get(position).getClas().equals("sorcerer"))
        {
            Bundle extras = new Bundle();
            Intent i = new Intent(this, Spells_Act.class);
            extras.putInt("position", position);
            i.putExtras(extras);
            startActivity(i);
        }
        else {
            Bundle extras = new Bundle();
            Intent i = new Intent(this, Skills.class);
            extras.putInt("position", position);
            i.putExtras(extras);
            startActivity(i);
        }
    }
}
