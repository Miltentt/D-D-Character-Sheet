package com.example.ddcharactersheet.Statistics;

import com.example.ddcharactersheet.Spells;

import java.util.LinkedList;
import java.util.List;

public class Ranger_Spells {

    List<com.example.ddcharactersheet.Spells> Spells = new LinkedList<>();





    public List<com.example.ddcharactersheet.Spells> getSpells() {
        return Spells;
    }

    public void setSpells(List<com.example.ddcharactersheet.Spells> spells) {
        Spells = spells;
    }


    public void Populate() {
        Spells.add(new Spells("Magic Fang","One natural weapon of subject creature gets +1 on attack and damage rolls",1));
        Spells.add(new Spells("Alarm","Wards an area for 2 hours/level",1));
        Spells.add(new Spells("Read Magic","Read scrolls and spellbooks",1));
        Spells.add(new Spells("Endure Elements","Exist comfortably in hot or cold environments",1));
        Spells.add(new Spells("Entangle","Plants entangle everyone in 12 m.-radius",1));
        Spells.add(new Spells("Delay Poison","Stops poison from harming subject for 1 hour/level",1));
        Spells.add(new Spells("Pass without Trace","One subject/level leaves no tracks",1));
        Spells.add(new Spells("Speak with Animals","You can communicate with animals",1));
        Spells.add(new Spells("Summon Nature’s Ally I","Calls creature to fight",1));
        Spells.add(new Spells("Detect Snares and Pits","Reveals natural or primitive traps",1));
        Spells.add(new Spells("Detect Animals or Plants","Detects kinds of animals or plants",1));
        Spells.add(new Spells("Charm Animal","Makes one animal your friend",1));
        Spells.add(new Spells("Cure Light Wounds","Cures 1d8 damage +1/level (max +5)",2));
        Spells.add(new Spells("Resist Energy","Ignores 10 (or more) points of damage/attack from specified energy type",2));
        Spells.add(new Spells("Hold Animal","Paralyzes one animal for 1 round/level",2));
        Spells.add(new Spells("Speak with Plants","You can talk to normal plants and plant creatures",2));
        Spells.add(new Spells("Sleep","Puts 4 HD of creatures into magical slumber",2));
        Spells.add(new Spells("Summon Nature’s Ally II","Calls creature to fight",2));
        Spells.add(new Spells("Snare","Creates a magic booby trap",2));
        Spells.add(new Spells("Detect Chaos/Evil/Good/Law","Reveals creatures, spells, or objects of selected alignment",2));
        Spells.add(new Spells("Animal Messenger","Sends a Tiny animal to a specific place",2));
        Spells.add(new Spells("Water Walk","Subject treads on water as if solid",3));
        Spells.add(new Spells("Control Plants","Control actions of one or more plant creatures",3));
        Spells.add(new Spells("Tree Shape","You look exactly like a tree for 1 hour/level",2));
        Spells.add(new Spells("Cure Moderate Wounds","Cures 2d8 damage +1/level (max +10)",3));
        Spells.add(new Spells("Neutralize Poison","Immunizes subject against poison, detoxifies venom in or on subject",3));
        Spells.add(new Spells("Remove Disease","Cures all diseases affecting subject",3));
        Spells.add(new Spells("Summon Nature’s Ally III","Calls creature to fight",3));
        Spells.add(new Spells("Magic Fang, Greater","One natural weapon of subject creature gets +1/three levels on attack and damage rolls (max +5)",3));
        Spells.add(new Spells("Plant Growth","Grows vegetation, improves crops",3));
        Spells.add(new Spells("Diminish Plants","Reduces size or blights growth of normal plants",3));
        Spells.add(new Spells("Tree Stride","Step from one tree to another far away",4));
        Spells.add(new Spells("Cure Serious Wounds","Cures 3d8 damage +1/level (max +15)",4));
        Spells.add(new Spells("Nondetection","Hides subject from divination, scrying",4));
        Spells.add(new Spells("Polymorph Self","Gives you a new form",4));
        Spells.add(new Spells("Freedom of Movement","Subject moves normally despite impediments",4));
        Spells.add(new Spells("Wind Wall","Deflects arrows, smaller creatures, and gases",4));
        Spells.add(new Spells("Summon Nature’s Ally IV","Calls creature to fight",4));

    }





}
