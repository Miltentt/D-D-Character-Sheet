package com.example.ddcharactersheet.Character_Pages;


import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.example.ddcharactersheet.Adapters.ClassRacial_adapter;
import com.example.ddcharactersheet.Adapters.Feats_Recycler_Character;
import com.example.ddcharactersheet.Character_Pages.Equipment.Equipment;
import com.example.ddcharactersheet.Model.Character;
import com.example.ddcharactersheet.Model.Feats_Entity;
import com.example.ddcharactersheet.Model.Feats_List;
import com.example.ddcharactersheet.R;
import com.example.ddcharactersheet.RoomDB.Character_Databse;
import com.example.ddcharactersheet.RoomDB.Feats_DB;
import com.example.ddcharactersheet.Statistics.Class_Feats;
import com.example.ddcharactersheet.Statistics.Racial_Feats;

import java.util.LinkedList;
import java.util.List;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;

public class Feat_Character extends com.example.ddcharactersheet.Recursive.Feats {
    private List<Feats_List> list = new LinkedList<>();
    private Character_Databse db;
    private List<Character> Characters = new LinkedList();
    private Feats_Recycler_Character adapter;
    private RecyclerView recycler;
    private RecyclerView recycler2;
    private RecyclerView recycler3;
    private ClassRacial_adapter adapter2;
    private ClassRacial_adapter adapter3;
    private Feats_DB FDB;
    private int position;
    private List<Feats_List> list1 = new LinkedList<>();
    private Feats_Entity Feats = new Feats_Entity();

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.feat_character);
        Populate(list);
        Bundle extras = getIntent().getExtras();
        this.position = extras.getInt("position");
        db = Room.databaseBuilder(getApplicationContext(), Character_Databse.class, "Characters1")
                .allowMainThreadQueries()
                .build();
        Characters = db.characterdao().loadAllTasks();
        FDB = Room.databaseBuilder(this, Feats_DB.class, "Characterss")
                .allowMainThreadQueries()
                .build();
        Feats = FDB.feats_dao().Load_Feat(Characters.get(position).getFeatid());
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < Feats.getFeats().size(); j++)
                if (list.get(i).getName().equals(Feats.getFeats().get(j))) {
                    list1.add(list.get(i));
                }
        }

        recycler = (RecyclerView) findViewById(R.id.r1);
        recycler2 = (RecyclerView) findViewById(R.id.r2);
        recycler3 = (RecyclerView) findViewById(R.id.r3);
        recycler.setLayoutManager(new LinearLayoutManager(this));
        recycler2.setLayoutManager(new LinearLayoutManager(this));
        recycler3.setLayoutManager(new LinearLayoutManager(this));
        Class_Feats clas = new Class_Feats(Characters.get(position).getClas(),this);
        Racial_Feats racial = new Racial_Feats(Characters.get(position).getRace(),this);
        adapter = new Feats_Recycler_Character(list1, this );
        adapter2 = new ClassRacial_adapter(clas.Names,clas.pre, this );
        adapter3 = new ClassRacial_adapter(racial.Names,racial.pre, this );

        recycler.setAdapter(adapter);
        recycler2.setAdapter(adapter2);
        recycler3.setAdapter(adapter3);

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