package com.example.ddcharactersheet.Statistics;

import android.content.Context;

import com.example.ddcharactersheet.Model.Character;
import com.example.ddcharactersheet.RoomDB.Character_Databse;
import com.example.ddcharactersheet.RoomDB.Racial_Feats_DB;

import java.util.LinkedList;
import java.util.List;

public class Racial_Feats {
public List<String> Names = new LinkedList<>();
    public List<String> pre = new LinkedList<>();
    private Character_Databse db;
    private Racial_Feats_DB RFDB;
    private List<Character> Characters = new LinkedList();
   public Racial_Feats(String clas, Context context)
   {
       switch(clas)
       {
           case "Dwarf":
           {
               Names.add("Darkvision");
               pre.add("Dwarfs can see up to 20m in dark");
               Names.add("Stonecunning");
               pre.add("This ability grants a dwarf a +2 racial bonus on Search checks to notice unusual stonework");
               Names.add("Endurance to Poison");
               pre.add("+2 racial bonus on saving throws against poison");
               Names.add("Endurance to Spells");
               pre.add(" +2 racial bonus on saving throws against spells and spell-like effects");
               Names.add("Orc Hatred");
               pre.add(" +1 racial bonus to attack rolls against orcs (including half-orcs) and goblinoids");
               Names.add("Giant Slayer");
               pre.add(" +4 dodge bonus to Armor Class against monsters of the giant type ");
               break;
           }
           case "Half-elf":
           {}
           case "Elf":
           {
               Names.add("Darkvision");
               pre.add("Dwarfs can see up to 20m in dark");
               Names.add("Endurance to Spells");
               pre.add(" Invunerability to spell 'Sleep' and +2 racial bonus on saving throws against spells and spell-like effects");
               Names.add("Bonus to Abilities");
               pre.add("+2 racial bonus on Listen, Search, and Spot");
               break;
           }
           case "Gnome":
           {

               Names.add("Darkvision");
               pre.add("Dwarfs can see up to 20m in dark");
               Names.add("Bonus to Abilities");
               pre.add("+2 racial bonus on Alchemy and Listen");
               Names.add("Giant Slayer");
               pre.add("+4 dodge bonus to Armor Class against monsters of the giant type ");
               Names.add("Endurance to Illusion Spells");
               pre.add("+2 racial bonus on saving throws against Illusion spells and spell-like effects");
               Names.add("Goblin Hatred");
               pre.add("+1 racial bonus on attack rolls against kobolds and goblinoids");
               break;
           }
           case "Half-orc":
           {
               Names.add("Darkvision");
               pre.add("Dwarfs can see up to 20m in dark");
               break;
           }
           case "Halfling":
           {
               Names.add("Bonus to Abilities");
               pre.add("+2 racial bonus on Climb, Jump, and Move Silently");
               Names.add("Halflings Luck");
               pre.add("+1 racial bonus on all saving throws");
               Names.add("Proficiency in Thrown Weapons");
               pre.add("+1 racial bonus on attack rolls with a thrown weapon and slings");
               Names.add("Small Size");
               pre.add("As a Small creature, a halfling gains a +1 size bonus to Armor Class, a +1 size bonus on attack rolls, and a +4 size bonus on Hide checks");



               break;
           }
           case "Fey'ri":
           {
               Names.add("Darkvision");
               pre.add("Dwarfs can see up to 20m in dark");
               Names.add("Endurance to Enchantment Spells");
               pre.add("+2 racial bonus on Will saves against enchantment spells and effects");
               Names.add("Alter Self");
               pre.add("Fey’ri can use alter self at will to assume any humanoid form, and can remain in that form indefinitely");
               Names.add("Bonus to Abilities");
               pre.add("+2 racial bonus on Bluff, Hide, Listen, Search, and Spot checks");
               break;
           }
           case "Tiefling":
           {
             Names.add("Deepening Darkness");
             pre.add("This spell functions like darkness, except that the object radiates shadowy illumination in a 20m radius and the darkness lasts longer.");
               Names.add("Fiendish Bloodline");
               pre.add("Once a day you can reveal your demonic nature");
              Names.add("Improved Energy Resistance");
              pre.add("You gain resistance 5 to a specific type of energy");



               break;

           }
           case "Fire Genasi": {
               Names.add("Improved Energy Resistance");
               pre.add("You gain resistance 5 to a specific type of energy, based on your elemental heritage");
               Names.add("Healing Flames");
               pre.add("You can draw energy from open flames to heal yourself");

               break;
           }
           case "Orog":
           {
               Names.add("Daylight Adaptation");
               pre.add("You no longer suffer penalties when exposed to bright light");
               Names.add("Darkvision");
               pre.add("Dwarfs can see up to 20m in dark");
               Names.add("Natural Armor");
               pre.add("+2 natural armor");
               Names.add("Resistances");
               pre.add("Orogs have fire resistance 5 and cold resistance 5");
               Names.add("Bonus to Abilities");
               pre.add("+2 racial bonus on Craft (armorsmithing) and Craft (weaponsmithing)");


               break;
           }
       }
   }

}
