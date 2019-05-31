package com.example.ddcharactersheet.Character_Pages;

import android.arch.persistence.room.Room;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.ddcharactersheet.Character;
import com.example.ddcharactersheet.Character_Databse;
import com.example.ddcharactersheet.Character_Pages.Equipment.Equipment;
import com.example.ddcharactersheet.Statistics.Cleric_Spells;
import com.example.ddcharactersheet.Character_Pages.Equipment.Fragment_Spells_Character;
import com.example.ddcharactersheet.R;
import com.example.ddcharactersheet.Spells;
import com.example.ddcharactersheet.Spells_Database;
import com.example.ddcharactersheet.Spells_Entity;
import com.example.ddcharactersheet.Adapters.Spells_Slide;

import java.util.LinkedList;
import java.util.List;

public class Cleric_Spells_Char extends AppCompatActivity {

    private List<com.example.ddcharactersheet.Spells> list = new LinkedList<>();
    private List<Spells> list00 = new LinkedList<>();
    private List<Spells> list11 = new LinkedList<>();
    private List<Spells> list22 = new LinkedList<>();
    private List<Spells> list33 = new LinkedList<>();
    private List<Spells> list44 = new LinkedList<>();
    private List<Spells> list55 = new LinkedList<>();
    private List<Spells> list66 = new LinkedList<>();
    private List<Spells> list77 = new LinkedList<>();
    private List<Spells> list88 = new LinkedList<>();
    private List<Spells> list99 = new LinkedList<>();
    private ViewPager pager;
    private Spells_Slide slider;
    private TabLayout tabLayout;
    private Spells_Database FDB;
    private TextView dom1;
    private TextView dom2;
    private Character_Databse db;
    private List<Character> Characters = new LinkedList();
    private Spells_Entity Spells= new Spells_Entity();
    private int position;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cleric_spels);
        dom1 = findViewById(R.id.dom1);
        dom2 = findViewById(R.id.dom2);
        Bundle extras = getIntent().getExtras();
        this.position = extras.getInt("position");
        db = Room.databaseBuilder(getApplicationContext(), Character_Databse.class, "Characters1")
                .allowMainThreadQueries()
                .build();
        Characters = db.characterdao().loadAllTasks();
        FDB = Room.databaseBuilder(this, Spells_Database.class, "Characters")
                .allowMainThreadQueries()
                .build();
        Spells = FDB.spells_dao().Load_Spell(Characters.get(position).getSpellid());
        tabLayout= findViewById(R.id.tab);
        pager = findViewById(R.id.pager);
        dom1.setText(Characters.get(position).getDom1());
        dom2.setText(Characters.get(position).getDom2());
        Cleric_Spells wiz = new Cleric_Spells();
        wiz.Populate();
        list=wiz.getSpells();
        for(int i=0;i<list.size();i++) {
            switch (list.get(i).getTier()) {
                case 0:
                    list00.add(list.get(i));
                    break;

                case 1:
                    list11.add(list.get(i));
                    break;

                case 2:
                    list22.add(list.get(i));
                    break;
                case 3:
                    list33.add(list.get(i));
                    break;

                case 4:
                    list44.add(list.get(i));
                    break;

                case 5:
                    list55.add(list.get(i));
                    break;

                case 6:
                    list66.add(list.get(i));
                    break;

                case 7:
                    list77.add(list.get(i));
                    break;

                case 8:
                    list88.add(list.get(i));
                    break;

                case 9:
                    list99.add(list.get(i));
                    break;
            }
        }

        slider = new Spells_Slide(getSupportFragmentManager());

        slider.AddFragment(new Fragment_Spells_Character(list00),"T0");
        slider.AddFragment(new Fragment_Spells_Character(list11),"T1");
        slider.AddFragment(new Fragment_Spells_Character(list22),"T2");
        slider.AddFragment(new Fragment_Spells_Character(list33),"T3");
        slider.AddFragment(new Fragment_Spells_Character(list44),"T4");
        slider.AddFragment(new Fragment_Spells_Character(list55),"T5");
        slider.AddFragment(new Fragment_Spells_Character(list66),"T6");
        slider.AddFragment(new Fragment_Spells_Character(list77),"T7");
        slider.AddFragment(new Fragment_Spells_Character(list88),"T8");
        slider.AddFragment(new Fragment_Spells_Character(list99),"T9");

        pager.setAdapter(slider);
        tabLayout.setupWithViewPager(pager);





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
