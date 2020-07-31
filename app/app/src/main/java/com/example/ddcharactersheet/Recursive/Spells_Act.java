package com.example.ddcharactersheet.Recursive;

import android.arch.persistence.room.Room;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.example.ddcharactersheet.Model.Character;
import com.example.ddcharactersheet.Character_Creation.Name;
import com.example.ddcharactersheet.RoomDB.Character_Databse;
import com.example.ddcharactersheet.R;
import com.example.ddcharactersheet.Spells;
import com.example.ddcharactersheet.Adapters.Spells_Adapter;
import com.example.ddcharactersheet.RoomDB.Spells_Database;
import com.example.ddcharactersheet.Model.Spells_Entity;
import com.example.ddcharactersheet.Spells_Fragments.Fragment1;
import com.example.ddcharactersheet.Adapters.Spells_Slide;
import com.example.ddcharactersheet.Statistics.Wizard_Spells;

import java.util.LinkedList;
import java.util.List;

public class Spells_Act extends AppCompatActivity {
private List<com.example.ddcharactersheet.Spells> list = new LinkedList<>();

private Spells_Adapter adapter1;
private Spells_Adapter adapter2;
private ViewPager pager;
private Spells_Slide slider;
private TabLayout tabLayout;
private Spells_Database FDB;
private  TextView points;
private List<Spells_Entity> Spells = new LinkedList<>();
    private List<Spells> list0 = new LinkedList<>();
    private List<Spells> list1 = new LinkedList<>();
    private List<Spells> list2 = new LinkedList<>();
    private List<Spells> list3 = new LinkedList<>();
    private List<Spells> list4 = new LinkedList<>();
    private List<Spells> list5 = new LinkedList<>();
    private List<Spells> list6 = new LinkedList<>();
    private List<Spells> list7 = new LinkedList<>();
    private List<Spells> list8 = new LinkedList<>();
    private List<Spells> list9 = new LinkedList<>();
    private List<String> list00 = new LinkedList<>();
    private List<String> list11 = new LinkedList<>();
    private List<String> list22 = new LinkedList<>();
    private List<String> list33 = new LinkedList<>();
    private List<String> list44 = new LinkedList<>();
    private List<String> list55 = new LinkedList<>();
    private List<String> list66 = new LinkedList<>();
    private List<String> list77 = new LinkedList<>();
    private List<String> list88 = new LinkedList<>();
    private List<String> list99 = new LinkedList<>();


    private int position;
    private Character_Databse db;
private int SID;
    private List<Character> Characters = new LinkedList();
public  int  tier0 = 0;
public int  tier1 = 0;
    public int  tier2 = 0;
    public int  tier3 = 0;
    public int  tier4 = 0;
    public int  tier5 = 0;
    public int  tier6 = 0;
    public int  tier7 = 0;
    public int  tier8 = 0;
    public int  tier9 = 0;
public static int wizardpoints = 2;
public int wizard1 =0;




    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.spells);
        points = findViewById(R.id.points);
        db = Room.databaseBuilder(this, Character_Databse.class, "Characters1")
                .allowMainThreadQueries()
                .build();
        FDB = Room.databaseBuilder(this, Spells_Database.class, "Characters")
                .allowMainThreadQueries()
                .build();
        Characters = db.characterdao().loadAllTasks();
        Bundle extras = getIntent().getExtras();
        this.position = extras.getInt("position");
        Spells = FDB.spells_dao().loadAllSpells();
        SID=Spells.get(Spells.size()-1).getId();
wizard1 = Characters.get(position).getIntelc() +3;

CheckLVL();
        tabLayout= findViewById(R.id.tab);
        pager = findViewById(R.id.pager);
Wizard_Spells wiz = new Wizard_Spells();
wiz.Populate();


list=wiz.getSpells();
        for(int i=0;i<list.size();i++) {
            switch (list.get(i).getTier()) {
                case 0:
                    list0.add(list.get(i));
                    break;

                case 1:
                    list1.add(list.get(i));
                    break;

                case 2:
                    list2.add(list.get(i));
                    break;
                case 3:
                    list3.add(list.get(i));
                    break;

                case 4:
                    list4.add(list.get(i));
                    break;

                case 5:
                    list5.add(list.get(i));
                    break;

                case 6:
                    list6.add(list.get(i));
                    break;

                case 7:
                    list7.add(list.get(i));
                    break;

                case 8:
                    list8.add(list.get(i));
                    break;

                case 9:
                    list9.add(list.get(i));
                    break;
            }
        }

slider = new Spells_Slide(getSupportFragmentManager());
if(Characters.get(position).getClas().equals("wizard") && Characters.get(position).getLevel()==1) {
    slider.AddFragment(new Fragment1(list1, wizard1, position, 1), "T1");
    slider.AddFragment(new Fragment1(list2,tier2,position,2),"T2");
    slider.AddFragment(new Fragment1(list3,tier3,position,3),"T3");
    slider.AddFragment(new Fragment1(list4,tier4,position,4),"T4");
    slider.AddFragment(new Fragment1(list5,tier5,position,5),"T5");
    slider.AddFragment(new Fragment1(list6,tier6,position,6),"T6");
    slider.AddFragment(new Fragment1(list7,tier7,position,7),"T7");
    slider.AddFragment(new Fragment1(list8,tier8,position,8),"T8");
    slider.AddFragment(new Fragment1(list9,tier9,position,9),"T9");
}
else {
    if (Characters.get(position).getClas().equals("wizard")) {
        slider.AddFragment(new Fragment1(list1, tier1, position, 1), "T1");
        slider.AddFragment(new Fragment1(list2, tier2, position, 2), "T2");
        slider.AddFragment(new Fragment1(list3, tier3, position, 3), "T3");
        slider.AddFragment(new Fragment1(list4, tier4, position, 4), "T4");
        slider.AddFragment(new Fragment1(list5, tier5, position, 5), "T5");
        slider.AddFragment(new Fragment1(list6, tier6, position, 6), "T6");
        slider.AddFragment(new Fragment1(list7, tier7, position, 7), "T7");
        slider.AddFragment(new Fragment1(list8, tier8, position, 8), "T8");
        slider.AddFragment(new Fragment1(list9, tier9, position, 9), "T9");
    } else {
        slider.AddFragment(new Fragment1(list0, tier0, position, 0), "T0");
        slider.AddFragment(new Fragment1(list1, tier1, position, 1), "T1");
        slider.AddFragment(new Fragment1(list2, tier2, position, 2), "T2");
        slider.AddFragment(new Fragment1(list3, tier3, position, 3), "T3");
        slider.AddFragment(new Fragment1(list4, tier4, position, 4), "T4");
        slider.AddFragment(new Fragment1(list5, tier5, position, 5), "T5");
        slider.AddFragment(new Fragment1(list6, tier6, position, 6), "T6");
        slider.AddFragment(new Fragment1(list7, tier7, position, 7), "T7");
        slider.AddFragment(new Fragment1(list8, tier8, position, 8), "T8");
        slider.AddFragment(new Fragment1(list9, tier9, position, 9), "T9");
    }
}
pager.setAdapter(slider);
        tabLayout.setupWithViewPager(pager);





    }
    public void next(View v) {
        if (Characters.get(position).getLevel() != 1) {
            Bundle extras = new Bundle();
            Intent i = new Intent(this, Skills.class);
            extras.putInt("position", position);
            i.putExtras(extras);
            startActivity(i);
        } else {
            Intent i = new Intent(this, Name.class);
            startActivity(i);
        }
    }
private void CheckLVL()
{
    switch( Characters.get(position).getLevel()) {
        case 1:
        {
tier0=4;
tier1 = 2;
tier2=0;
tier3=0;
tier4=0;
tier5=0;
tier6=0;
tier7=0;
tier8=0;
tier9=0;
break;
        }
        case 2:
        {
            tier0=1;
            tier1=0;
            tier2=0;
            tier3=0;
            tier4=0;
            tier5=0;
            tier6=0;
            tier7=0;
            tier8=0;
            tier9=0;
            break;
        }
        case 3:
        {
            tier0=0;
            tier1 = 1;
            tier2=0;
            tier3=0;
            tier4=0;
            tier5=0;
            tier6=0;
            tier7=0;
            tier8=0;
            tier9=0;
            break;
        }
        case 4:
        {
            tier0=1;
            tier1 =0;
            tier2=1;
            tier3=0;
            tier4=0;
            tier5=0;
            tier6=0;
            tier7=0;
            tier8=0;
            tier9=0;
            break;
        }
        case 5:
        {
            tier0=0;
            tier1 =1;
            tier2=1;
            tier3=0;
            tier4=0;
            tier5=0;
            tier6=0;
            tier7=0;
            tier8=0;
            tier9=0;
            break;
        }
        case 6:
        {
            tier0=1;
            tier1 = 0;
            tier2=0;
            tier3=1;
            tier4=0;
            tier5=0;
            tier6=0;
            tier7=0;
            tier8=0;
            tier9=0;
            break;
        }
        case 7:
        {
            tier0=0;
            tier1 = 1;
            tier2=1;
            tier3=1;
            tier4=0;
            tier5=0;
            tier6=0;
            tier7=0;
            tier8=0;
            tier9=0;
            break;
        }
        case 8:
        {
            tier0=1;
            tier1 =0;
            tier2=0;
            tier3=0;
            tier4=1;
            tier5=0;
            tier6=0;
            tier7=0;
            tier8=0;
            tier9=0;
            break;
        }
        case 9:
        {
            tier0=0;
            tier1 = 0;
            tier2=1;
            tier3=1;
            tier4=1;
            tier5=0;
            tier6=0;
            tier7=0;
            tier8=0;
            tier9=0;
            break;
        }
        case 10:
        {
            tier0=1;
            tier1 = 0;
            tier2=0;
            tier3=0;
            tier4=0;
            tier5=1;
            tier6=0;
            tier7=0;
            tier8=0;
            tier9=0;
            break;
        }
        case 11:
        {
            tier0=0;
            tier1 = 0;
            tier2=1;
            tier3=1;
            tier4=1;
            tier5=1;
            tier6=0;
            tier7=0;
            tier8=0;
            tier9=0;
            break;
        }
        case 12:
        {
            tier0=0;
            tier1 = 0;
            tier2=0;
            tier3=0;
            tier4=0;
            tier5=0;
            tier6=1;
            tier7=0;
            tier8=0;
            tier9=0;
            break;
        }
        case 13:
        {
            tier0=0;
            tier1 = 0;
            tier2=0;
            tier3=0;
            tier4=1;
            tier5=1;
            tier6=1;
            tier7=0;
            tier8=0;
            tier9=0;
            break;
        }
        case 14:
        {
            tier0=0;
            tier1 = 0;
            tier2=0;
            tier3=0;
            tier4=0;
            tier5=0;
            tier6=0;
            tier7=1;
            tier8=0;
            tier9=0;
            break;
        }
        case 15:
        {
            tier0=0;
            tier1 = 0;
            tier2=0;
            tier3=0;
            tier4=0;
            tier5=1;
            tier6=1;
            tier7=1;
            tier8=0;
            tier9=0;
            break;
        }
        case 16:
        {
            tier0=0;
            tier1 = 0;
            tier2=0;
            tier3=0;
            tier4=0;
            tier5=0;
            tier6=0;
            tier7=0;
            tier8=1;
            tier9=0;
            break;
        }
        case 17:
        {
            tier0=0;
            tier1 = 0;
            tier2=0;
            tier3=0;
            tier4=0;
            tier5=0;
            tier6=0;
            tier7=1;
            tier8=1;
            tier9=0;
            break;
        }
        case 18:
        {
            tier0=0;
            tier1 = 0;
            tier2=0;
            tier3=0;
            tier4=0;
            tier5=0;
            tier6=0;
            tier7=0;
            tier8=0;
            tier9=1;
            break;
        }
        case 19:
        {
            tier0=0;
            tier1 = 0;
            tier2=0;
            tier3=0;
            tier4=0;
            tier5=0;
            tier6=0;
            tier7=0;
            tier8=1;
            tier9=1;
            break;
        }
        case 20:
        {
            tier0=0;
            tier1 = 0;
            tier2=0;
            tier3=0;
            tier4=0;
            tier5=0;
            tier6=0;
            tier7=0;
            tier8=0;
            tier9=1;
            break;
        }








    }







}

}
