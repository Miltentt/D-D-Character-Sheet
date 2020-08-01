package com.example.ddcharactersheet.Recursive;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.ddcharactersheet.Adapters.Feats_Recycler;
import com.example.ddcharactersheet.Character_Creation.Domain;
import com.example.ddcharactersheet.Character_Creation.Name;
import com.example.ddcharactersheet.Character_Pages.Character_Sheet;
import com.example.ddcharactersheet.Model.Character;
import com.example.ddcharactersheet.Model.Feats_List;
import com.example.ddcharactersheet.Model.Spells_Entity;
import com.example.ddcharactersheet.R;
import com.example.ddcharactersheet.RoomDB.Character_Databse;
import com.example.ddcharactersheet.RoomDB.Spells_Database;

import java.util.LinkedList;
import java.util.List;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;

public class Feats  extends AppCompatActivity {
 private List<Feats_List> list = new LinkedList<>();
    private Character_Databse db;
    private List<Character> Characters = new LinkedList();
    private Feats_Recycler adapter;
    private RecyclerView recycler;
    private int position;
    private int feats_amount;
    private Spells_Database FDB;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.feats);
        Bundle extras = getIntent().getExtras();
        this.position = extras.getInt("position");
        feats_amount=1;
        Populate(list);
        TextView text;
        text = findViewById(R.id.text);

        db = Room.databaseBuilder(getApplicationContext(), Character_Databse.class, "Characters1")
                .allowMainThreadQueries()
                .build();
        FDB = Room.databaseBuilder(this, Spells_Database.class, "Characters")
                .allowMainThreadQueries()
                .build();
        FDB.spells_dao().Insert(new Spells_Entity());
        Characters = db.characterdao().loadAllTasks();
        if(Characters.get(position).getRace().equals("Human") && Characters.get(position).getLevel()==1)
            feats_amount+=1;
        recycler = (RecyclerView) findViewById(R.id.recycler);
        recycler.setLayoutManager(new LinearLayoutManager(this));
        text.setText("Feats Avaliable: " + feats_amount);
        adapter = new Feats_Recycler(list, this,text, position,feats_amount);
        recycler.setAdapter(adapter);
    }

public void next(View view)
{

    adapter.updatedatabase();
    if(Characters.get(position).getLevel()==1) {
        if (Characters.get(position).getClas().equals("warrior")) {
            Bundle extras = new Bundle();
            Intent i = new Intent(this, Bonus_Feat.class);
            extras.putInt("position", position);
            i.putExtras(extras);
            startActivity(i);
        }
        if (Characters.get(position).getClas().equals("cleric") && Characters.get(position).getLevel()==1) {
            Bundle extras = new Bundle();
            Intent i = new Intent(this, Domain.class);
            extras.putInt("position", position);
            i.putExtras(extras);
            startActivity(i);
        }
        if (Characters.get(position).getClas().equals("sorcerer")) {
            Bundle extras = new Bundle();
            Intent i = new Intent(this, Spells_Act.class);
            extras.putInt("position", position);
            i.putExtras(extras);
            startActivity(i);
        }
        if (Characters.get(position).getClas().equals("wizard")) {
            Bundle extras = new Bundle();
            Intent i = new Intent(this, Spells_Act.class);
            extras.putInt("position", position);
            i.putExtras(extras);
            startActivity(i);
        }
        if (Characters.get(position).getClas().equals("barbarian") || Characters.get(position).getClas().equals("monk") || Characters.get(position).getClas().equals("paladin") || Characters.get(position).getClas().equals("ranger") || Characters.get(position).getClas().equals("rogue") || Characters.get(position).getClas().equals("bard") || Characters.get(position).getClas().equals("druid" )) {
            Intent i = new Intent(this, Name.class);
            startActivity(i);
        }
    }
    else
    {
        Bundle extras = new Bundle();
        Intent i = new Intent(this, Character_Sheet.class);
        extras.putInt("position", position);
        i.putExtras(extras);
        startActivity(i);
    }
}











































    protected void Populate(List<Feats_List> list)
    {
list.add(new Feats_List("Alertness","+2 bonus on Listen and Spot checks ","-",false));
list.add(new Feats_List("Armor Proficiency (light)","No armor check penalty on attack rolls ","-",false));
list.add(new Feats_List("Armor Proficiency (medium)","No armor check penalty on attack rolls ","Armor Proficiency (light)",false));
list.add(new Feats_List("Armor Proficiency (heavy)","No armor check penalty on attack rolls ","Armor Proficiency (medium)",false));
        list.add(new Feats_List("Blind-Fight","Reroll miss chance for concealment ","-",true));
        list.add(new Feats_List("Combat Casting","+4 bonus on Concentration checks for defensive casting ","-",false));
        list.add(new Feats_List("Combat Expertise","Trade attack bonus for AC (max 5 points) ","Int 13 ",true));
        list.add(new Feats_List("Improved Disarm","+4 bonus on disarm attempts; no attack of opportunity ","Combat Expertise",true));
        list.add(new Feats_List("Improved Feint","Feint in combat as move action ","Combat Expertise",true));
        list.add(new Feats_List("Improved Trip","+4 bonus on trip attempts; no attack of opportunity ","Combat Expertise",true));
        list.add(new Feats_List("Whirlwind Attack","One melee attack against each opponent within reach ","Dex 13, Combat Expertise, Dodge, Mobility, Spring Attack, base attack bonus +4 ",true));
        list.add(new Feats_List("Combat Reflexes","Additional attacks of opportunity ","-",true));
        list.add(new Feats_List("Dodge","+1 dodge bonus to AC against selected target ","Dex 13",true));
        list.add(new Feats_List("Mobility","+4 dodge bonus to AC against some attacks of opportunity ","Dodge",true));
        list.add(new Feats_List("Spring Attack","Move before and after melee attack ","Mobility, base attack bonus +4",true));
        list.add(new Feats_List("Endurance","+4 bonus on checks or saves to resist nonlethal damage ","-",false));
        list.add(new Feats_List("Diehard","Remain conscious at –1 to –9 hp ","Endurance",false));
        list.add(new Feats_List("Eschew Materials","Cast spells without material components ","-",false));
        list.add(new Feats_List("Exotic Weapon Proficiency","No penalty on attacks with specific exotic weapon ","Base attack bonus +1",true));
        list.add(new Feats_List("Great Fortitude","+2 bonus on Fortitude saves ","-",false));
        list.add(new Feats_List("Improved Critical","Double threat range of weapon ","Proficient with weapon, base attack bonus +8",true));
            list.add(new Feats_List("Point Blank Shot","+1 bonus on ranged attack and damage within 30 ft ","-",true));
            list.add(new Feats_List("Far Shot","Increase range increment by 50% or 100%","Point Blank Shot",true));
            list.add(new Feats_List("Precise Shot","No –4 penalty for shooting into melee","Point Blank Shot",true));
            list.add(new Feats_List("Shot on the Run","Move before and after ranged attack","Dex 13, Dodge, Mobility, Point Blank Shot, base attack bonus +4",true));
            list.add(new Feats_List("Run","Run 5 times normal speed, +4 bonus on Jump checks Made after a running start","-",false));
            list.add(new Feats_List("Martial Weapon Proficiency","No penalty on attacks with specific martial weapon","-",false));
            list.add(new Feats_List("Simple Weapon Proficiency","No –4 penalty on attack rolls with simple weapons","-",false));
            list.add(new Feats_List("Shield Proficiency","No armor check penalty on attack rolls","-",false));
            list.add(new Feats_List("Lightning Reflexes","+2 bonus on Reflex saves ","Dodge",false));
            list.add(new Feats_List("Weapon Finesse","Use Dex modifier instead of Str modifier on attack rolls with light melee weapons","Proficiency with weapon, base attack bonus +1",true));
            list.add(new Feats_List("Mounted Combat","Negate hits on mount with Ride check","Ride 1 rank",true));
            list.add(new Feats_List("Mounted Archery","Half penalty for ranged attacks while mounted","Mounted Combat",true));
            list.add(new Feats_List("Ride-By Attack","Move before and after a mounted charge","Mounted Combat",true));
            list.add(new Feats_List("Spirited Charge","Move before and after a mounted charge","Mounted Combat",true));
            list.add(new Feats_List("Trample","Move before and after a mounted charge","Mounted Combat",true));
            list.add(new Feats_List("Vigor","+4 bonus on physical activities checks","-",false));
            list.add(new Feats_List("Ambidexterity","No penalties for using weapon in off-hand","Dex 15 ",true));
            list.add(new Feats_List("Improved Initiative","+4 bonus on initiative checks","-",true));
            list.add(new Feats_List("Improved Unarmed Strike","Considered armed even when unarmed","-",true));
            list.add(new Feats_List("Deflect Arrows","Deflect one ranged attack per round ","Dex 13, Improved Unarmed Strike",true));
            list.add(new Feats_List("Stunning Fist","Stun opponent with unarmed strike base ","Dex 13, Wis 13, Improved Unarmed Strike,attack bonus +8 ",true));
            list.add(new Feats_List("Power Attack","Trade attack bonus for damage (up to base attack bonus) ","Str 13",true));
            list.add(new Feats_List("Cleave","Extra melee attack after dropping target","Power Attack ",true));
            list.add(new Feats_List("Great Cleave","No limit to cleave attacks each round","Cleave, Power Attack, base attack bonus +4 ",true));
            list.add(new Feats_List("Improved Bull Rush","+4 bonus on bull rush attempts; no attack of opportunity","Power Attack",true));
            list.add(new Feats_List("Improved Sunder","+4 bonus on sunder attempts; no attack of opportunity ","Power Attack",true));
            list.add(new Feats_List("Spell Penetration","+2 bonus on caster level checks to defeat spell resistance ","-",false));
            list.add(new Feats_List("Quick Draw","Draw weapon as free weapon","Base attack bonus +1 ",true));
            list.add(new Feats_List("Track","Use Survival skill to track ","-",false));
            list.add(new Feats_List("Toughness","+3 hit points ","-",false));
            list.add(new Feats_List("Two-Weapon Fighting","Reduce two-weapon fighting penalties by 2","Dex 15, Ambidexterity",true));
            list.add(new Feats_List("Improved Two-Weapon Fighting","Reduce two-weapon fighting penalties by 2","Dex 15, Two-Weapon Fighting",true));
            list.add(new Feats_List("Leadership","Attract cohort and followers ","Character Level 6th",false));
            list.add(new Feats_List("Weapon Focus","+1 bonus on attack rolls with selected weapon","Proficiency with weapon, base attack bonus +1",true));
            list.add(new Feats_List("Spell Focus","+1 bonus on save DCs against specific school of magic","-",false));
            list.add(new Feats_List("Skill Focus","+3 bonus on checks with selected skill","-",false));
            list.add(new Feats_List("Iron Will","+2 bonus on Will saves","-",false));
            list.add(new Feats_List("Brew Potion","Create magic potions ","Spellcaster level 3rd ",false));
            list.add(new Feats_List("Craft Magic Arms and Armor","Create magic weapons, armor, and shields ","Spellcaster level 5th ",false));
            list.add(new Feats_List("Craft Rod","Create magic rods","Spellcaster level 9th ",false));
            list.add(new Feats_List("Craft Staff","Create magic staffs","Spellcaster level 12th",false));
            list.add(new Feats_List("Craft Wand","Create magic wands","Spellcaster level 5th",false));
            list.add(new Feats_List("Craft Wondrous Item","Create magic wondrous items","Spellcaster level 3rd",false));
            list.add(new Feats_List("Scribe Scroll","Create magic scrolls","Spellcaster level 1st",false));
            list.add(new Feats_List("Forge Ring","Create magic rings ","Spellcaster level 12th",false));
            list.add(new Feats_List("Maximize Spell","Maximize spell’s variable, numeric effects","Spellcaster",false));
            list.add(new Feats_List("Empower Spell","Increase spell’s variable, numeric effects by 50%","Spellcaster",false));
            list.add(new Feats_List("Enlarge Spell","Double spell’s range","Spellcaster",false));
            list.add(new Feats_List("Extend Spell","Double spell’s duration","Spellcaster",false));
            list.add(new Feats_List("Heighten Spell","Cast spells as higher level","Spellcaster",false));
            list.add(new Feats_List("Quicken Spell","Cast spells as free action","Spellcaster",false));
            list.add(new Feats_List("Silent Spell","Cast spells without verbal components","Spellcaster",false));
            list.add(new Feats_List("Still Spell","Cast spells without somatic components","Spellcaster",false));
            list.add(new Feats_List("Widen Spell","Double spell’s area","Spellcaster",false));
    }
protected  void Populate1(List<Feats_List> list)
{
    list.add(new Feats_List("Alertness","+2 bonus on Listen and Spot checks ","-",false));
    list.add(new Feats_List("Armor Proficiency (light)","No armor check penalty on attack rolls ","-",false));
    list.add(new Feats_List("Armor Proficiency (medium)","No armor check penalty on attack rolls ","Armor Proficiency (light)",false));
    list.add(new Feats_List("Armor Proficiency (heavy)","No armor check penalty on attack rolls ","Armor Proficiency (medium)",false));
    list.add(new Feats_List("Blind-Fight","Reroll miss chance for concealment ","-",false));
    list.add(new Feats_List("Combat Casting","+4 bonus on Concentration checks for defensive casting ","-",false));
    list.add(new Feats_List("Combat Expertise","Trade attack bonus for AC (max 5 points) ","Int 13 ",false));
    list.add(new Feats_List("Improved Disarm","+4 bonus on disarm attempts; no attack of opportunity ","Combat Expertise",false));
    list.add(new Feats_List("Improved Feint","Feint in combat as move action ","Combat Expertise",false));
    list.add(new Feats_List("Improved Trip","+4 bonus on trip attempts; no attack of opportunity ","Combat Expertise",false));
    list.add(new Feats_List("Whirlwind Attack","One melee attack against each opponent within reach ","Dex 13, Combat Expertise, Dodge, Mobility, Spring Attack, base attack bonus +4 ",false));
    list.add(new Feats_List("Combat Reflexes","Additional attacks of opportunity ","-",false));
    list.add(new Feats_List("Dodge","+1 dodge bonus to AC against selected target ","Dex 13",false));
    list.add(new Feats_List("Mobility","+4 dodge bonus to AC against some attacks of opportunity ","Dodge",false));
    list.add(new Feats_List("Spring Attack","Move before and after melee attack ","Mobility, base attack bonus +4",false));
    list.add(new Feats_List("Endurance","+4 bonus on checks or saves to resist nonlethal damage ","-",false));
    list.add(new Feats_List("Diehard","Remain conscious at –1 to –9 hp ","Endurance",false));
    list.add(new Feats_List("Eschew Materials","Cast spells without material components ","-",false));
    list.add(new Feats_List("Exotic Weapon Proficiency","No penalty on attacks with specific exotic weapon ","Base attack bonus +1",false));
    list.add(new Feats_List("Great Fortitude","+2 bonus on Fortitude saves ","-",false));
    list.add(new Feats_List("Improved Critical","Double threat range of weapon ","Proficient with weapon, base attack bonus +8",false));
    list.add(new Feats_List("Point Blank Shot","+1 bonus on ranged attack and damage within 30 ft ","-",false));
    list.add(new Feats_List("Far Shot","Increase range increment by 50% or 100%","Point Blank Shot",false));
    list.add(new Feats_List("Precise Shot","No –4 penalty for shooting into melee","Point Blank Shot",false));
    list.add(new Feats_List("Shot on the Run","Move before and after ranged attack","Dex 13, Dodge, Mobility, Point Blank Shot, base attack bonus +4",false));
    list.add(new Feats_List("Run","Run 5 times normal speed, +4 bonus on Jump checks Made after a running start","-",false));
    list.add(new Feats_List("Martial Weapon Proficiency","No penalty on attacks with specific martial weapon","-",false));
    list.add(new Feats_List("Simple Weapon Proficiency","No –4 penalty on attack rolls with simple weapons","-",false));
    list.add(new Feats_List("Shield Proficiency","No armor check penalty on attack rolls","-",false));
    list.add(new Feats_List("Lightning Reflexes","+2 bonus on Reflex saves ","Dodge",false));
    list.add(new Feats_List("Weapon Finesse","Use Dex modifier instead of Str modifier on attack rolls with light melee weapons","Proficiency with weapon, base attack bonus +1",false));
    list.add(new Feats_List("Mounted Combat","Negate hits on mount with Ride check","Ride 1 rank",false));
    list.add(new Feats_List("Mounted Archery","Half penalty for ranged attacks while mounted","Mounted Combat",false));
    list.add(new Feats_List("Ride-By Attack","Move before and after a mounted charge","Mounted Combat",false));
    list.add(new Feats_List("Spirited Charge","Move before and after a mounted charge","Mounted Combat",false));
    list.add(new Feats_List("Trample","Move before and after a mounted charge","Mounted Combat",false));
    list.add(new Feats_List("Vigor","+4 bonus on physical activities checks","-",false));
    list.add(new Feats_List("Ambidexterity","No penalties for using weapon in off-hand","Dex 15 ",false));
    list.add(new Feats_List("Improved Initiative","+4 bonus on initiative checks","-",false));
    list.add(new Feats_List("Improved Unarmed Strike","Considered armed even when unarmed","-",false));
    list.add(new Feats_List("Deflect Arrows","Deflect one ranged attack per round ","Dex 13, Improved Unarmed Strike",false));
    list.add(new Feats_List("Stunning Fist","Stun opponent with unarmed strike base ","Dex 13, Wis 13, Improved Unarmed Strike,attack bonus +8 ",false));
    list.add(new Feats_List("Power Attack","Trade attack bonus for damage (up to base attack bonus) ","Str 13",false));
    list.add(new Feats_List("Cleave","Extra melee attack after dropping target","Power Attack ",false));
    list.add(new Feats_List("Great Cleave","No limit to cleave attacks each round","Cleave, Power Attack, base attack bonus +4 ",false));
    list.add(new Feats_List("Improved Bull Rush","+4 bonus on bull rush attempts; no attack of opportunity","Power Attack",false));
    list.add(new Feats_List("Improved Sunder","+4 bonus on sunder attempts; no attack of opportunity ","Power Attack",false));
    list.add(new Feats_List("Spell Penetration","+2 bonus on caster level checks to defeat spell resistance ","-",false));
    list.add(new Feats_List("Quick Draw","Draw weapon as free weapon","Base attack bonus +1 ",false));
    list.add(new Feats_List("Track","Use Survival skill to track ","-",false));
    list.add(new Feats_List("Toughness","+3 hit points ","-",false));
    list.add(new Feats_List("Two-Weapon Fighting","Reduce two-weapon fighting penalties by 2","Dex 15, Ambidexterity",false));
    list.add(new Feats_List("Improved Two-Weapon Fighting","Reduce two-weapon fighting penalties by 2","Dex 15, Two-Weapon Fighting",false));
    list.add(new Feats_List("Leadership","Attract cohort and followers ","Character Level 6th",false));
    list.add(new Feats_List("Weapon Focus","+1 bonus on attack rolls with selected weapon","Proficiency with weapon, base attack bonus +1",false));
    list.add(new Feats_List("Spell Focus","+1 bonus on save DCs against specific school of magic","-",false));
    list.add(new Feats_List("Skill Focus","+3 bonus on checks with selected skill","-",false));
    list.add(new Feats_List("Iron Will","+2 bonus on Will saves","-",false));
    list.add(new Feats_List("Brew Potion","Create magic potions ","Spellcaster level 3rd ",false));
    list.add(new Feats_List("Craft Magic Arms and Armor","Create magic weapons, armor, and shields ","Spellcaster level 5th ",false));
    list.add(new Feats_List("Craft Rod","Create magic rods","Spellcaster level 9th ",false));
    list.add(new Feats_List("Craft Staff","Create magic staffs","Spellcaster level 12th",false));
    list.add(new Feats_List("Craft Wand","Create magic wands","Spellcaster level 5th",false));
    list.add(new Feats_List("Craft Wondrous Item","Create magic wondrous items","Spellcaster level 3rd",false));
    list.add(new Feats_List("Scribe Scroll","Create magic scrolls","Spellcaster level 1st",false));
    list.add(new Feats_List("Forge Ring","Create magic rings ","Spellcaster level 12th",false));
    list.add(new Feats_List("Maximize Spell","Maximize spell’s variable, numeric effects","Spellcaster",true));
    list.add(new Feats_List("Empower Spell","Increase spell’s variable, numeric effects by 50%","Spellcaster",true));
    list.add(new Feats_List("Enlarge Spell","Double spell’s range","Spellcaster",true));
    list.add(new Feats_List("Extend Spell","Double spell’s duration","Spellcaster",true));
    list.add(new Feats_List("Heighten Spell","Cast spells as higher level","Spellcaster",true));
    list.add(new Feats_List("Quicken Spell","Cast spells as free action","Spellcaster",true));
    list.add(new Feats_List("Silent Spell","Cast spells without verbal components","Spellcaster",true));
    list.add(new Feats_List("Still Spell","Cast spells without somatic components","Spellcaster",true));
    list.add(new Feats_List("Widen Spell","Double spell’s area","Spellcaster",true));
}
}
