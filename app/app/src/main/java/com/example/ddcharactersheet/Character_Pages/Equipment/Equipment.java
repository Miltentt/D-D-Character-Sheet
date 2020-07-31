package com.example.ddcharactersheet.Character_Pages.Equipment;

import android.arch.persistence.room.Room;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.example.ddcharactersheet.Model.Character;
import com.example.ddcharactersheet.RoomDB.Character_Databse;
import com.example.ddcharactersheet.Character_Pages.Character_Sheet;
import com.example.ddcharactersheet.Character_Pages.Character_Skills;
import com.example.ddcharactersheet.Character_Pages.Cleric_Spells_Char;
import com.example.ddcharactersheet.RoomDB.EQ_Database;
import com.example.ddcharactersheet.Model.Equipment_Entity;
import com.example.ddcharactersheet.Character_Pages.Feat_Character;
import com.example.ddcharactersheet.Character_Pages.No_Spells_Character;
import com.example.ddcharactersheet.Adapters.Other_adapter;
import com.example.ddcharactersheet.R;
import com.example.ddcharactersheet.Adapters.Shield_adapter;
import com.example.ddcharactersheet.Character_Pages.Spells_Character;
import com.example.ddcharactersheet.Character_Pages.Spells_OtherClasses;
import com.example.ddcharactersheet.Adapters.Weapon_adapter;

import java.util.LinkedList;
import java.util.List;

public class Equipment extends AppCompatActivity {
    private Weapon_adapter wadapter;
    private Shield_adapter sadapter;
    private Other_adapter oadapter;
    private Shield_adapter aadapter;
    private EQ_Database EQDB;
    private List<Equipment_Entity> EQ = new LinkedList();
    private RecyclerView recycler1;
    private RecyclerView recycler2;
    private RecyclerView recycler3;
    private RecyclerView recycler4;
    private List<Equipment_Entity> weapon = new LinkedList();
    private List<Equipment_Entity> shiled = new LinkedList();
    private List<Equipment_Entity> armor = new LinkedList();
    private List<Equipment_Entity> other = new LinkedList();
    private Character_Databse db;
    private List<Character> Characters = new LinkedList();
    private int position;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eq);
        Bundle extras = getIntent().getExtras();
        this.position = extras.getInt("position");
        EQDB = Room.databaseBuilder(getApplicationContext(), EQ_Database.class, "Charactersss")
                .allowMainThreadQueries()
                .build();
        db = Room.databaseBuilder(getApplicationContext(), Character_Databse.class, "Characters1")
                .allowMainThreadQueries()
                .build();
        Characters = db.characterdao().loadAllTasks();
fill();
recycler1 = findViewById(R.id.r1);
recycler2 = findViewById(R.id.r2);
recycler3 = findViewById(R.id.r3);
recycler4 = findViewById(R.id.r4);
recycler1.setLayoutManager(new LinearLayoutManager(this));
recycler2.setLayoutManager(new LinearLayoutManager(this));
recycler3.setLayoutManager(new LinearLayoutManager(this));
recycler4.setLayoutManager(new LinearLayoutManager(this));
        wadapter = new Weapon_adapter(weapon,this);
        sadapter = new Shield_adapter(shiled,this);
        aadapter = new Shield_adapter(armor,this);
        oadapter = new Other_adapter(other,this);
        recycler1.setAdapter(wadapter);
        recycler2.setAdapter(sadapter);
        recycler3.setAdapter(aadapter);
        recycler4.setAdapter(oadapter);
    }



    void next(View v)
    {
        Bundle extras = new Bundle();
        Intent i = new Intent(this, EQ_Type.class);
        extras.putInt("position", position);
        i.putExtras(extras);
        startActivity(i);
    }

    void fill()
    {
        if(Characters.get(position).getIdw1()!=-1)
        {
            weapon.add(EQDB.EQDao().Load_EQ(Characters.get(position).getIdw1()));
        }
        if(Characters.get(position).getIdw2()!=-1)
        {
            weapon.add(EQDB.EQDao().Load_EQ(Characters.get(position).getIdw2()));
        }
        if(Characters.get(position).getIdw3()!=-1)
        {
            weapon.add(EQDB.EQDao().Load_EQ(Characters.get(position).getIdw3()));
        }
        if(Characters.get(position).getIda1()!=-1)
        {
            armor.add(EQDB.EQDao().Load_EQ(Characters.get(position).getIda1()));
        }
        if(Characters.get(position).getIda2()!=-1)
        {
            armor.add(EQDB.EQDao().Load_EQ(Characters.get(position).getIda2()));
        }
        if(Characters.get(position).getIds1()!=-1)
        {
            shiled.add(EQDB.EQDao().Load_EQ(Characters.get(position).getIds1()));
        }
        if(Characters.get(position).getIds2()!=-1)
        {
            shiled.add(EQDB.EQDao().Load_EQ(Characters.get(position).getIds2()));
        }
        if(Characters.get(position).getIdo1()!=-1)
        {
            other.add(EQDB.EQDao().Load_EQ(Characters.get(position).getIdo1()));
        }
        if(Characters.get(position).getIdo2()!=-1)
        {
            other.add(EQDB.EQDao().Load_EQ(Characters.get(position).getIdo2()));
        }
        if(Characters.get(position).getIdo3()!=-1)
        {
            other.add(EQDB.EQDao().Load_EQ(Characters.get(position).getIdo3()));
        }
        if(Characters.get(position).getIdo4()!=-1)
        {
            other.add(EQDB.EQDao().Load_EQ(Characters.get(position).getIdo4()));
        }
        if(Characters.get(position).getIdo5()!=-1)
        {
            other.add(EQDB.EQDao().Load_EQ(Characters.get(position).getIdo5()));
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
}
