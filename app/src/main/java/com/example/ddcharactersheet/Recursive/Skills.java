package com.example.ddcharactersheet.Recursive;

import android.arch.persistence.room.Room;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.ddcharactersheet.Character;
import com.example.ddcharactersheet.Character_Databse;
import com.example.ddcharactersheet.Character_Pages.Character_Sheet;
import com.example.ddcharactersheet.Feats_DB;
import com.example.ddcharactersheet.Feats_Entity;
import com.example.ddcharactersheet.R;
import com.example.ddcharactersheet.Skill_List;
import com.example.ddcharactersheet.Adapters.Skills_Adapter;

import java.util.LinkedList;
import java.util.List;

public class Skills extends AppCompatActivity implements Skills_Adapter.ItemClickListener {
    private List<Skill_List> list = new LinkedList<>();
    private Skills_Adapter adapter;
    private RecyclerView recycler;
    private Character_Databse db;
    private List<Character> Characters = new LinkedList();
    private TextView pointa;
    private int pointss;
    private Feats_DB FDB;
    private int position;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.skills);
        pointa = findViewById(R.id.point);
        Populate(list);
        Bundle extras = getIntent().getExtras();
        this.position = extras.getInt("position");

        db = Room.databaseBuilder(this, Character_Databse.class, "Characters1")
                .allowMainThreadQueries()
                .build();
        FDB = Room.databaseBuilder(this, Feats_DB.class, "Characterss")
                .allowMainThreadQueries()
                .build();
        Characters = db.characterdao().loadAllTasks();
        pointss=points(Characters.get(position));
        pointa.setText("Avaliable points: " + Integer.toString(pointss));
        recycler = (RecyclerView) findViewById(R.id.recycler);
        recycler.setLayoutManager(new LinearLayoutManager(this));
        adapter = new Skills_Adapter(list, this,pointss,pointa, position);
        adapter.setClickListener(this::onItemClick);
        recycler.setAdapter(adapter);


    }
    @Override
    public void onItemClick(View view, int position) {

    }

public int points(Character character) {
    int point = 0;
    if(character.getLevel()==1) {
        if (character.getRace().equals("Human")) {
            point += 4;
        }
        switch (character.getClas()) {
            case "barbarian":
            case "bard":
            case "druid":
            case "monk":
            case "ranger": {
                point += (4 + character.getIntelc()) * 4;
                break;
            }
            case "wizard":
            case "cleric":
            case "paladin":
            case "warrior":
            case "sorcerer": {
                point += (2 + character.getIntelc()) * 4;
                break;
            }
            case "rogue": {
                point += (8 + character.getIntelc()) * 4;
                break;
            }

        }
    }
    else
    {
        if (character.getRace().equals("Human")) {
            point += 1;
        }
        point += 4+ character.getIntelc();
    }
return point;
}


public void next(View view)
{
    if(Characters.get(position).getClas().equals("wizard") && Characters.get(position).getLevel()%5 ==0) {
        Bundle extras = new Bundle();
        Intent i = new Intent(this, Bonus_Feat.class);
        extras.putInt("position", position);
        i.putExtras(extras);
        startActivity(i);
    }
    else {
        if (Characters.get(position).getClas().equals("warrior") && Characters.get(position).getLevel() % 2 == 0) {
            Bundle extras = new Bundle();
            Intent i = new Intent(this, Bonus_Feat.class);
            extras.putInt("position", position);
            i.putExtras(extras);
            startActivity(i);
        } else {
            if (Characters.get(position).getLevel() % 3 == 0) {
                Bundle extras = new Bundle();
                Intent i = new Intent(this, Feats.class);
                extras.putInt("position", position);
                i.putExtras(extras);
                startActivity(i);
            } else {
                if (Characters.get(position).getLevel() == 1) {
                    FDB.feats_dao().Insert(new Feats_Entity());
                    Bundle extras = new Bundle();
                    Intent i = new Intent(this, Feats.class);
                    extras.putInt("position", position);
                    i.putExtras(extras);
                    startActivity(i);
                } else {
                    if (Characters.get(position).getLevel() % 4 == 0 && !Characters.get(position).getClas().equals("warrior")) {
                        Bundle extras = new Bundle();
                        Intent i = new Intent(this, Atribute_Level_UP.class);
                        extras.putInt("position", position);
                        i.putExtras(extras);
                        startActivity(i);
                    } else {
                        Bundle extras = new Bundle();
                        Intent i = new Intent(this, Character_Sheet.class);
                        extras.putInt("position", position);
                        i.putExtras(extras);
                        startActivity(i);
                    }
                }
            }
        }
    }


}












    protected void Populate(List<Skill_List> list)
    {
        list.add(new Skill_List("Bluff",true,6));
        list.add(new Skill_List("Move Silently",true,2));
        list.add(new Skill_List("Spellcraft",false,4));
        list.add(new Skill_List("Diplomacy",true,6));
        list.add(new Skill_List("Forgery",true,4));
        list.add(new Skill_List("Horsemanship",true,2));
        list.add(new Skill_List("Concentration",true,3));
        list.add(new Skill_List("Heal",true,5));
        list.add(new Skill_List("Listen",true,5));
        list.add(new Skill_List("Decipher Script",false,4));
        list.add(new Skill_List("Lockpicking",false,4));
        list.add(new Skill_List("Swimming",true,1));
        list.add(new Skill_List("Handle Animals",false,6));
        list.add(new Skill_List("Disguise",true,6));
        list.add(new Skill_List("Search",true,4));
        list.add(new Skill_List("Craft",true,4));
        list.add(new Skill_List("Jump",true,1));
        list.add(new Skill_List("Observation",true,5));
        list.add(new Skill_List("Apparaise",true,4));
        list.add(new Skill_List("Wilderness Lore",true,5));
        list.add(new Skill_List("Hide",true,2));
        list.add(new Skill_List("Disable Device",false,4));
        list.add(new Skill_List("Use Rope",true,2));
        list.add(new Skill_List("Use Magic Device",false,6));
        list.add(new Skill_List("Arcana Knowledge",false,4));
        list.add(new Skill_List("Nature Knowledge",false,4));
        list.add(new Skill_List("Religion Knowledge",false,4));
        list.add(new Skill_List("Planes Knowledge",false,4));
        list.add(new Skill_List("Royalty Knowledge",false,4));
        list.add(new Skill_List("Climbing",true,1));
        list.add(new Skill_List("Sense Motive",true,5));
        list.add(new Skill_List("Perform",false,6));
        list.add(new Skill_List("Escape",true,2));
        list.add(new Skill_List("Balance",true,2));
        list.add(new Skill_List("Intimidation",true,6));
        list.add(new Skill_List("Profession",false,5));
        list.add(new Skill_List("Gathering Information",true,6));
        list.add(new Skill_List("Pick Pocketing",false,2));
        list.add(new Skill_List("Agility",false,2));
        list.add(new Skill_List("Alchemy",false,4));

        
    }


}
