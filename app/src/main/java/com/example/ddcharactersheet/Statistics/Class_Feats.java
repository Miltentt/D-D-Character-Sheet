package com.example.ddcharactersheet.Statistics;

import android.arch.persistence.room.Room;
import android.content.Context;

import com.example.ddcharactersheet.Character;
import com.example.ddcharactersheet.Character_Databse;
import com.example.ddcharactersheet.Class_Feats_DB;

import java.util.LinkedList;
import java.util.List;

public class Class_Feats {
    public List<String> Names = new LinkedList<>();
    public List<String> pre = new LinkedList<>();
    private Character_Databse db;
    private Class_Feats_DB CFDB;
    private List<Character> Characters = new LinkedList();
    public Class_Feats(String clas, Context context) {
        switch (clas) {
            case "barbarian": {
                Names.add("Rage");
                pre.add("Required Level: 1");
                Names.add("Fast movement");
                pre.add("Required Level: 1");
                Names.add("Uncanny dodge (Bonus to AC from DEX");
                pre.add("Required Level: 2");
                Names.add("Rage 2/day");
                pre.add("Required Level: 4");
                Names.add("Improved uncanny dodge (unflankable)");
                pre.add("Required Level: 5");
                Names.add("Rage 3/day");
                pre.add("Required Level: 8");
                Names.add("Improved uncanny dodge (+1 against traps)");
                pre.add("Required Level: 10");
                Names.add("Damage reduction 1");
                pre.add("Required Level: 11");
                Names.add("Rage 4/day");
                pre.add("Required Level: 12");
                Names.add("Improved uncanny dodge (+2 against traps)");
                pre.add("Required Level: 13");
                Names.add("Damage reduction 2");
                pre.add("Required Level: 14");
                Names.add("Greater rage");
                pre.add("Required Level: 15");
                Names.add("Improved uncanny dodge (+3 against traps)");
                pre.add("Required Level: 16");
                Names.add("Rage 5/day");
                pre.add("Required Level: 16");
                Names.add("Damage reduction 3");
                pre.add("Required Level: 17");
                Names.add("Improved uncanny dodge (+4 against traps)");
                pre.add("Required Level: 18");
                Names.add("Rage 6/day (No exhaustion after Rage)");
                pre.add("Required Level: 20");
                Names.add("Damage reduction 4");
                pre.add("Required Level: 20");
                break;
            }
            case "bard":
            {
                Names.add("Bardic music");
                pre.add("Required Level: 1");
                Names.add("Bardic music");
                pre.add("bardic knowledge");
                break;
            }
            case "cleric":
            {
                Names.add("Turn or rebuke undead");
                pre.add("Required Level: 1");
                break;
            }
            case "druid":
            {
                Names.add("Nature sense");
                pre.add("Required Level: 1");
                Names.add("Animal companion");
                pre.add("Required Level: 1");
                Names.add("Woodland stride");
                pre.add("Required Level: 2");
                Names.add("Trackless step");
                pre.add("Required Level: 3");
                Names.add("Resist nature’s lure");
                pre.add("Required Level: 4");
                Names.add("Wild shape 1/day");
                pre.add("Required Level: 5");
                Names.add("Wild shape 2/day");
                pre.add("Required Level: 6");
                Names.add("Wild shape 3/day");
                pre.add("Required Level: 7");
                Names.add("Wild shape (Large)");
                pre.add("Required Level: 8");
                Names.add("Venom immunity");
                pre.add("Required Level: 9");
                Names.add("Wild shape 4/day");
                pre.add("Required Level: 10");
                Names.add("Wild shape (Tiny)");
                pre.add("Required Level: 11");
                Names.add("Wild shape (Sinister)");
                pre.add("Required Level: 12");
                Names.add("A thousand faces");
                pre.add("Required Level: 13");
                Names.add("Wild shape 5/day");
                pre.add("Required Level: 14");
                Names.add("Wild shape (Huge)");
                pre.add("Required Level: 15");
                Names.add("Timeless body");
                pre.add("Required Level: 15");
                Names.add("Wild shape (elemental 1/day)");
                pre.add("Required Level: 16");
                Names.add("Wild shape 6/day + (elemental 2/day)");
                pre.add("Required Level: 18");
                Names.add("Wild shape elemental 3/day (Huge)");
                pre.add("Required Level: 20");
                break;
            }
            case "monk": {
                Names.add("Still mind");
                pre.add("Required Level: 3");
                Names.add("Slow fall 20m");
                pre.add("Required Level: 4");
                Names.add("Purity of body");
                pre.add("Required Level: 5");
                Names.add("Slow fall 9m");
                pre.add("Required Level: 6");
                Names.add("Improved Trip");
                pre.add("Required Level: 6");
                Names.add("Wholeness of body");
                pre.add("Required Level: 7");
                Names.add("Jump into clouds");
                pre.add("Required Level: 7");
                Names.add("Slow fall 15m");
                pre.add("Required Level: 8");
                Names.add("Improved evasion");
                pre.add("Required Level: 9");
                Names.add("Ki strike (+1)");
                pre.add("Required Level: 10");
                Names.add("Diamond body");
                pre.add("Required Level: 11");
                Names.add("Abundant step");
                pre.add("Required Level: 12");
                Names.add("Diamond soul");
                Names.add("Ki strike (+2)");
                pre.add("Required Level: 12");
                pre.add("Required Level: 13");
                Names.add("Quivering palm");
                pre.add("Required Level: 15");
                Names.add("Ki strike (+3)");
                pre.add("Required Level: 16");
                Names.add("Tongue of the sun and moon");
                pre.add("Required Level: 17");
                Names.add("Timeless body");
                pre.add("Required Level: 17");
                Names.add("Slow fall (any distance)");
                pre.add("Required Level: 18");
                Names.add("Empty body");
                pre.add("Required Level: 19");
                Names.add("Perfect self");
                pre.add("Required Level: 20");
                break;
            }
            case "paladin":
            {
                Names.add("Aura of good");
                pre.add("Required Level: 1");
                Names.add("Lay on hands");
                pre.add("Required Level: 1");
                Names.add("Detect evil");
                pre.add("Required Level: 1");
                Names.add("Divine health");
                pre.add("Required Level: 1");
                Names.add("Divine grace");
                pre.add("Required Level: 1");
                Names.add("Aura of courage");
                pre.add("Required Level: 2");
                Names.add("Smite evil");
                pre.add("Required Level: 2");
                Names.add("Remove disease 1/week");
                pre.add("Required Level: 3");
                Names.add("Turn undead");
                pre.add("Required Level: 3");
                Names.add("Special mount");
                pre.add("Required Level: 5");
                Names.add("Remove disease 2/week");
                pre.add("Required Level: 6");
                Names.add("Remove disease 3/week");
                pre.add("Required Level: 9");
                Names.add("Remove disease 4/week");
                pre.add("Required Level: 12");
                Names.add("Remove disease 5/week");
                pre.add("Required Level: 15");
                Names.add("Remove disease 6/week");
                pre.add("Required Level: 18");
                break;
            }
            case "ranger":
            {
                Names.add("1st favored enemy");
                pre.add("Required Level: 1");
                Names.add("2nd favored enemy");
                pre.add("Required Level: 5");
                Names.add("3rd favored enemy");
                pre.add("Required Level: 10");
                Names.add("4th favored enemy");
                pre.add("Required Level: 15");
                Names.add("5th favored enemy");
                pre.add("Required Level: 20");
                break;
            }
            case "rogue":
            {
                Names.add("Sneak attack +1d6");
                pre.add("Required Level: 1");
                Names.add("Evasion");
                pre.add("Required Level: 2");
                Names.add("Sneak attack +2d6");
                pre.add("Required Level: 3");
                Names.add("Uncanny dodge (Bonus to AC from DEX");
                pre.add("Required Level: 3");
                Names.add("Sneak attack +3d6");
                pre.add("Required Level: 5");
                Names.add("Improved uncanny dodge (unflankable)");
                pre.add("Required Level: 6");
                Names.add("Sneak attack +4d6");
                pre.add("Required Level: 7");
                Names.add("Sneak attack +5d6");
                pre.add("Required Level: 9");
                Names.add("Special ability");
                pre.add("Required Level: 10");
                Names.add("Improved uncanny dodge (+1 against traps)");
                pre.add("Required Level: 11");
                Names.add("Sneak attack +6d6");
                pre.add("Required Level: 11");
                Names.add("Sneak attack +7d6");
                pre.add("Required Level: 13");
                Names.add("Special ability");
                pre.add("Required Level: 13");
                Names.add("Improved uncanny dodge (+2 against traps)");
                pre.add("Required Level: 14");
                Names.add("Sneak attack +8d6");
                pre.add("Required Level: 15");
                Names.add("Special ability");
                pre.add("Required Level: 16");
                Names.add("Sneak attack +9d6");
                pre.add("Required Level: 17");
                Names.add("Improved uncanny dodge (+3 against traps)");
                pre.add("Required Level: 17");
                Names.add("Sneak attack +10d6");
                pre.add("Required Level: 19");
                Names.add("Special ability");
                pre.add("Required Level: 19");
                Names.add("Improved uncanny dodge (+4 against traps)");
                pre.add("Required Level: 20");
                break;
            }
            case "warrior":
            {
                break;
            }
            case "sorcerer":
            {
                Names.add("Summon familiar");
                pre.add("Required Level: 1");
                break;
            }
            case "wizard":
            {
                Names.add("Summon familiar");
                pre.add("Required Level: 1");
                Names.add("Scribe scroll");
                pre.add("Required Level: 1");
                break;
            }
        }

    }
}
