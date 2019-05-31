package com.example.ddcharactersheet.Statistics;

import com.example.ddcharactersheet.Spells;

import java.util.LinkedList;
import java.util.List;

public class Paladin_Spells
    {
        List<com.example.ddcharactersheet.Spells> Spells = new LinkedList<>();





        public List<com.example.ddcharactersheet.Spells> getSpells() {
            return Spells;
        }

        public void setSpells(List<com.example.ddcharactersheet.Spells> spells) {
            Spells = spells;
        }



        public void Populate()
    {
        Spells.add(new Spells("Bless","Allies gain +1 on attack rolls and saves against fear",1));
        Spells.add(new Spells("Divine Favor","You gain +1 per three levels on attack and damage rolls",1));
        Spells.add(new Spells("Virtue","Subject gains 1 temporary hp",1));
        Spells.add(new Spells("Read Magic","Read scrolls and spellbooks",1));
        Spells.add(new Spells("Cure Light Wounds","Cures 1d8 damage +1/level (max +5)",1));
        Spells.add(new Spells("Protection from Chaos/Evil","+2 to AC and saves, counter mind control, hedge out elementals and outsiders",1));
        Spells.add(new Spells("Resistance","Subject gains +1 bonus on saving throws",1));
        Spells.add(new Spells("Bless Weapon","Weapon strikes true against evil foes",1));
        Spells.add(new Spells("Bless Water","Makes holy water",1));
        Spells.add(new Spells("Create Water","Creates 1 l/level of pure water",1));
        Spells.add(new Spells("Detect Poison","Detects poison in one creature or object",1));
        Spells.add(new Spells("Detect Undead","Reveals undead within 18 m",1));
        Spells.add(new Spells("Endure Elements","Exist comfortably in hot or cold environments",1));
        Spells.add(new Spells("Undetectable Alignment","Conceals alignment for 24 hours",2));
        Spells.add(new Spells("Resist Energy","Ignores 10 (or more) points of damage/attack from specified energy type",2));
        Spells.add(new Spells("Delay Poison","Stops poison from harming subject for 1 hour/level",2));
        Spells.add(new Spells("Shield Other","You take half of subject’s damage",2));
        Spells.add(new Spells("Cure Moderate Wounds","Cures 2d8 damage +1/level (max +10)",3));
        Spells.add(new Spells("Magic Circle against Chaos/Evil","As protection spells, but 3 m. radius and 10 min./level",3));
        Spells.add(new Spells("Prayer","Allies +1 bonus on most rolls, enemies –1 penalty",3));
        Spells.add(new Spells("Dispel Magic","Cancels spells and magical effects",3));
        Spells.add(new Spells("Remove Blindness/Deafness","Cures normal or magical conditions",3));
        Spells.add(new Spells("Heal Mount","As heal on warhorse or other special mount",3));
        Spells.add(new Spells("Magic Weapon, Greater","+1/four levels (max +5)",3));
        Spells.add(new Spells("Discern Lies","Reveals deliberate falsehoods",3));
        Spells.add(new Spells("Cure Serious Wounds","Cures 3d8 damage +1/level (max +15)",4));
        Spells.add(new Spells("Neutralize Poison","Immunizes subject against poison, detoxifies venom in or on subject",4));
        Spells.add(new Spells("Death Ward","Grants immunity to death spells and negative energy effects",4));
        Spells.add(new Spells("Dispel Chaos","+4 bonus against attacks by chaotic creatures",4));
        Spells.add(new Spells("Freedom of Movement","Subject moves normally despite impediments",4));
        Spells.add(new Spells("Holy Sword","Weapon becomes +5, deals +2d6 damage against evil",4));

    }
    }

