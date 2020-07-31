package com.example.ddcharactersheet.Recursive;

import android.arch.persistence.room.Room;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.ddcharactersheet.Model.Character;
import com.example.ddcharactersheet.Character_Creation.Name;
import com.example.ddcharactersheet.RoomDB.Character_Databse;
import com.example.ddcharactersheet.Character_Pages.Character_Sheet;
import com.example.ddcharactersheet.RoomDB.Feats_DB;
import com.example.ddcharactersheet.Model.Feats_Entity;
import com.example.ddcharactersheet.Model.Feats_List;
import com.example.ddcharactersheet.Adapters.Feats_Recycler;
import com.example.ddcharactersheet.R;

import java.util.LinkedList;
import java.util.List;

public class Bonus_Feat extends com.example.ddcharactersheet.Recursive.Feats {
    private List<Feats_List> list = new LinkedList<>();
    private Character_Databse db;
    private List<Character> Characters = new LinkedList();
    private Feats_Recycler adapter;
    private RecyclerView recycler;
    private List<Feats_List> Warrior = new LinkedList<>();
    private List<Feats_Entity> Feats;
    private Feats_DB FDB;
    private int position;
    private List<String> Featlist = new LinkedList<>();
    private int feats_amount;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.feats);
        FDB = Room.databaseBuilder(this, Feats_DB.class, "Characterss")
                .allowMainThreadQueries()
                .build();
        db = Room.databaseBuilder(this, Character_Databse.class, "Characters1")
                .allowMainThreadQueries()
                .build();
        Characters = db.characterdao().loadAllTasks();
        Feats = FDB.feats_dao().loadAllFeats();
feats_amount =1;
        TextView text;
        Bundle extras = getIntent().getExtras();
        this.position = extras.getInt("position");
        if(Characters.get(position).getClas().equals("wizard")) {
            Populate1(list);
        }
        else {
            Populate(list);
        }
        text = findViewById(R.id.text);
        for(int i =0;i<Feats.get(Feats.size()-1).getFeats().size();i++) {
            Featlist.add(Feats.get(Feats.size() - 1).getFeats().get(i));
        }

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).isHas() == true)
                Warrior.add(list.get(i));
        }
        text = findViewById(R.id.text);
        text.setText("Feats Avaliable: " + feats_amount);
        recycler = (RecyclerView) findViewById(R.id.recycler);
        recycler.setLayoutManager(new LinearLayoutManager(this));
        adapter = new Feats_Recycler(Warrior, this, text,position,feats_amount);
        recycler.setAdapter(adapter);
    }
    public void next(View v)
    {
        adapter.updatedatabase();
        if(Characters.get(position).getLevel()%4==0)
        {
            Bundle extras = new Bundle();
            Intent i = new Intent(this, Atribute_Level_UP.class);
            extras.putInt("position",position);
            i.putExtras(extras);
            startActivity(i);

        }
else {
            if (Characters.get(position).getLevel() != 1)
            {
                Bundle extras = new Bundle();
                Intent i = new Intent(this, Character_Sheet.class);
                extras.putInt("position",position);
                i.putExtras(extras);
                startActivity(i);
            }
            else
            {
                Intent i = new Intent(this, Name.class);
                startActivity(i);
            }
        }






    }
}
