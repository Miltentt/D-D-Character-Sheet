package com.example.ddcharactersheet.Statistics;

import com.example.ddcharactersheet.Spells;

import java.util.LinkedList;
import java.util.List;

public class Cleric_Spells {
    List<com.example.ddcharactersheet.Spells> Spells = new LinkedList<>();




    public List<com.example.ddcharactersheet.Spells> getSpells() {
        return Spells;
    }

    public void setSpells(List<com.example.ddcharactersheet.Spells> spells) {
        Spells = spells;
    }




















    public void Populate() {
        Spells.add(new Spells("Virtue","Subject gains 1 temporary hp",0));
        Spells.add(new Spells("Read Magic","Read scrolls and spellbooks",0));
        Spells.add(new Spells("Cure Minor Wounds","Cures 1 point of damage",0));
        Spells.add(new Spells("Mending","Makes minor repairs on an object",0));
        Spells.add(new Spells("Purify Food and Drink","Purifies 30 l/level of food or water",0));
        Spells.add(new Spells("Resistance","Subject gains +1 bonus on saving throws",0));
        Spells.add(new Spells("Guidance","+1 on one attack roll, saving throw, or skill check",0));
        Spells.add(new Spells("Create Water","Creates 1 l/level of pure water",0));
        Spells.add(new Spells("Light","Object shines like a torch",0));
        Spells.add(new Spells("Detect Magic","Detects spells and magic items within 18 m",0));
        Spells.add(new Spells("Detect Poison","Detects poison in one creature or object",0));
        Spells.add(new Spells("Inflict Minor Wounds","Touch attack, 1 point of damage",0));
        Spells.add(new Spells("Bless","Allies gain +1 on attack rolls and saves against fear",1));
        Spells.add(new Spells("Divine Favor","You gain +1 per three levels on attack and damage rolls",1));
        Spells.add(new Spells("Cure Light Wounds","Cures 1d8 damage +1/level (max +5)",1));
        Spells.add(new Spells("Magic Weapon","Weapon gains +1 bonus",1));
        Spells.add(new Spells("Magic Stone","Three stones gain +1 on attack, deal 1d6 +1 damage",1));
        Spells.add(new Spells("Hide from Undead","Undead can’t perceive one subject/level",1));
        Spells.add(new Spells("Deathwatch","Undead can’t perceive one subject/level",1));
        Spells.add(new Spells("Protection from Chaos/Evil/Good/Law","+2 to AC and saves, counter mind control, hedge out elementals and outsiders",1));
        Spells.add(new Spells("Bane","Enemies take –1 on attack rolls and saves against fear",1));
        Spells.add(new Spells("Bless Water","Makes holy water",1));
        Spells.add(new Spells("Cause Fear","One creature of 5 HD or less flees for 1d4 rounds",1));
        Spells.add(new Spells("Curse Water","Makes unholy water",1));
        Spells.add(new Spells("Command","One subject obeys selected command for 1 round",1));
        Spells.add(new Spells("Comprehend Languages","You understand all spoken and written languages",1));
        Spells.add(new Spells("Sanctuary","Opponents can’t attack you, and you can’t attack",1));
        Spells.add(new Spells("Entropic Shield","Ranged attacks against you have 20% miss chance",1));
        Spells.add(new Spells("Shield of Faith","Aura grants +2 or higher deflection bonus",1));
        Spells.add(new Spells("Remove Fear","Suppresses fear or gives +4 on saves against fear for one subject + one per four levels",1));
        Spells.add(new Spells("Summon Monster I","Calls extraplanar creature to fight for you",1));
        Spells.add(new Spells("Detect Chaos/Evil/Good/Law","Reveals creatures, spells, or objects of selected alignment",1));
        Spells.add(new Spells("Detect Undead","Reveals undead within 18 m",1));
        Spells.add(new Spells("Endure Elements","Exist comfortably in hot or cold environments",1));
        Spells.add(new Spells("Obscuring Mist","Fog surrounds you",1));
        Spells.add(new Spells("Inflict Light Wounds","Touch deals 1d8 damage +1/level (max +5)",1));
        Spells.add(new Spells("Doom","One subject takes –2 on attack rolls, damage rolls, saves, and checks",1));
        Spells.add(new Spells("Spiritual Weapon","Magic weapon attacks on its own",2));
        Spells.add(new Spells("Bull’s Strength","Subject gains +4 to Str for 1 min./level",2));
        Spells.add(new Spells("Darkness","6 m. radius of supernatural shadow",2));
        Spells.add(new Spells("Consecrate","Fills area with positive energy, making undead weaker",2));
        Spells.add(new Spells("Cure Moderate Wounds","Cures 2d8 damage +1/level (max +10)",2));
        Spells.add(new Spells("Silence","Negates sound in 5 m. radius",2));
        Spells.add(new Spells("Restoration, Lesser","Dispels magical ability penalty or repairs 1d4 ability damage",2));
        Spells.add(new Spells("Undetectable Alignment","Conceals alignment for 24 hours",2));
        Spells.add(new Spells("Resist Energy","Ignores 10 (or more) points of damage/attack from specified energy type",2));
        Spells.add(new Spells("Delay Poison","Stops poison from harming subject for 1 hour/level",2));
        Spells.add(new Spells("Shield Other","You take half of subject’s damage",2));
        Spells.add(new Spells("Death Knell","Kills dying creature; you gain 1d8 temporary hp, +2 to Str, and +1 level",2));
        Spells.add(new Spells("Desecrate","Fills area with negative energy, making undead stronger",2));
        Spells.add(new Spells("Augury","Learns whether an action will be good or bad",2));
        Spells.add(new Spells("Speak with Animals","You can communicate with animals",2));
        Spells.add(new Spells("Shatter","Sonic vibration damages objects or crystalline creatures",2));
        Spells.add(new Spells("Make Whole","Repairs an object",2));
        Spells.add(new Spells("Zone of Truth","Subjects within range cannot lie",2));
        Spells.add(new Spells("Sound Burst","Deals 1d8 sonic damage to subjects; may stun them",2));
        Spells.add(new Spells("Gentle Repose","Preserves one corpse",2));
        Spells.add(new Spells("Calm Emotions","Calms creatures, negating emotion effects",2));
        Spells.add(new Spells("Remove Paralysis","Frees one or more creatures from paralysis or slow effect",2));
        Spells.add(new Spells("Summon Monster II","Calls extraplanar creature to fight for you",2));
        Spells.add(new Spells("Aid","+1 on attack rolls and saves against fear, 1d8 temporary hp +1/level (max +10)",2));
        Spells.add(new Spells("Hold Person","Paralyzes one humanoid for 1 round/level",2));
        Spells.add(new Spells("Bear’s Endurance","Subject gains +4 to Con for 1 min./level",2));
        Spells.add(new Spells("Enthrall","Captivates all within 30 m. + 3 m./level",2));
        Spells.add(new Spells("Inflict Moderate Wounds","Touch attack, 2d8 damage +1/level (max +10)",2));
        Spells.add(new Spells("Find Traps","Notice traps as a rogue does",2));
        Spells.add(new Spells("Animal Messenger","Sends a Tiny animal to a specific place",2));
        Spells.add(new Spells("Water Walk","Subject treads on water as if solid",3));
        Spells.add(new Spells("Glyph of Warding","Inscription harms those who pass it",3));
        Spells.add(new Spells("Deeper Darkness","Object sheds supernatural shadow in 18 m. radius",3));
        Spells.add(new Spells("Stone Shape","Sculpts stone into any shape",3));
        Spells.add(new Spells("Cure Serious Wounds","Cures 3d8 damage +1/level (max +15)",3));
        Spells.add(new Spells("Magic Circle against Chaos/Evil/Good/Law","As protection spells, but 3 m. radius and 10 min./level",3));
        Spells.add(new Spells("Magic Vestment","Armor or shield gains +1 enhancement per three levels",3));
        Spells.add(new Spells("Prayer","Allies +1 bonus on most rolls, enemies –1 penalty",3));
        Spells.add(new Spells("Continual Flame","Makes a permanent, heatless torch",3));
        Spells.add(new Spells("Bestow Curse"," –6 to an ability score; –4 on attack rolls, saves, and checks; or 50% chance of losing each action",3));
        Spells.add(new Spells("Protection From Negative","Subject is immune to draining of levels and attributes",3));
        Spells.add(new Spells("Protection from Energy","Absorb 12 points/level of damage from one kind of energy",3));
        Spells.add(new Spells("Water Breathing","Subjects can breathe underwater",3));
        Spells.add(new Spells("Animate Dead","Creates undead skeletons and zombies",3));
        Spells.add(new Spells("Searing Light","Ray deals 1d8/two levels damage, more against undead",3));
        Spells.add(new Spells("Helping Hand","Ghostly hand leads subject to you",3));
        Spells.add(new Spells("Speak with Plants","You can talk to normal plants and plant creatures",3));
        Spells.add(new Spells("Speak with Dead","Corpse answers one question/two levels",3));
        Spells.add(new Spells("Dispel Magic","Cancels spells and magical effects",3));
        Spells.add(new Spells("Meld into Stone","You and your gear merge with stone",3));
        Spells.add(new Spells("Create Food and Water","Feeds three humans (or one horse)/level",3));
        Spells.add(new Spells("Wind Wall","Deflects arrows, smaller creatures, and gases",3));
        Spells.add(new Spells("Blindness/Deafness","Makes subject blinded or deafened",3));
        Spells.add(new Spells("Daylight","18 m. radius of bright light",3));
        Spells.add(new Spells("Remove Disease","Cures all diseases affecting subject",3));
        Spells.add(new Spells("Remove Curse","Frees object or person from curse",3));
        Spells.add(new Spells("Remove Blindness/Deafness","Cures normal or magical conditions",3));
        Spells.add(new Spells("Summon Monster III","Calls extraplanar creature to fight for you",3));
        Spells.add(new Spells("Invisibility Purge","Dispels invisibility within 1,5 m/level",3));
        Spells.add(new Spells("Obscure Object","Masks object against scrying",3));
        Spells.add(new Spells("Inflict Serious Wounds","Touch attack, 3d8 damage +1/level (max +15)",3));
        Spells.add(new Spells("Contagion","Infects subject with chosen disease",3));
        Spells.add(new Spells("Locate Object","Senses direction toward object (specific or type)",3));
        Spells.add(new Spells("Divine Power","You gain attack bonus, 18 Str, and 1 hp/level",4));
        Spells.add(new Spells("Giant Vermin","Turns centipedes, scorpions, or spiders into giant vermin",4));
        Spells.add(new Spells("Tongues","Speak any language",4));
        Spells.add(new Spells("Control Water","Raises or lowers bodies of water",4));
        Spells.add(new Spells("Cure Critical Wounds","Cures 4d8 damage +1/level (max +20)",4));
        Spells.add(new Spells("Planar Ally, Lesser","Exchange services with a 6 HD extraplanar creature",4));
        Spells.add(new Spells("Imbue with Spell Ability","Transfer spells to subject",4));
        Spells.add(new Spells("Neutralize Poison","Immunizes subject against poison, detoxifies venom in or on subject",4));
        Spells.add(new Spells("Spell Immunity","Subject is immune to one spell per four levels",4));
        Spells.add(new Spells("Dismissal","Forces a creature to return to native plane",4));
        Spells.add(new Spells("Restoration","Restores level and ability score drains",4));
        Spells.add(new Spells("Death Ward","Grants immunity to death spells and negative energy effects",4));
        Spells.add(new Spells("Repel Vermin","Insects, spiders, and other vermin stay 3 m. away",4));
        Spells.add(new Spells("Sending","Delivers short message anywhere, instantly",4));
        Spells.add(new Spells("Status","Monitors status and location of allies",4));
        Spells.add(new Spells("Air Walk","Subject treads on air as if solid (climb at 45-degree angle)",4));
        Spells.add(new Spells("Freedom of Movement","Subject moves normally despite impediments",4));
        Spells.add(new Spells("Poison","Touch deals 1d10 Con damage, repeats in 1 min",4));
        Spells.add(new Spells("Summon Monster IV","Calls extraplanar creature to fight for you",4));
        Spells.add(new Spells("Divination","Provides useful advice for specific proposed actions",4));
        Spells.add(new Spells("Magic Weapon, Greater","+1/four levels (max +5)",4));
        Spells.add(new Spells("Discern Lies","Reveals deliberate falsehoods",4));
        Spells.add(new Spells("Dimensional Anchor","Bars extradimensional movement",4));
        Spells.add(new Spells("Inflict Critical Wounds","Touch attack, 4d8 damage +1/level (max +20)",4));
        Spells.add(new Spells("Ethereal Jaunt","You become ethereal for 1 round/level",5));
        Spells.add(new Spells("Cure Light Wounds, Mass","Heals 1d8 damage +1/level to many creatures",5));
        Spells.add(new Spells("Inflict Light Wounds, Mass","Deals 1d8 damage +1/level to many creatures",5));
        Spells.add(new Spells("Commune","Deity answers one yes-or-no question/level",5));
        Spells.add(new Spells("Spell Resistance","Subject gains SR 12 + level",5));
        Spells.add(new Spells("Flame Strike","Smite foes with divine fire (1d6/level damage)",5));
        Spells.add(new Spells("Insect Plague","Locust swarms attack creatures",5));
        Spells.add(new Spells("Atonement","Removes burden of misdeeds from subject",5));
        Spells.add(new Spells("Hallow","Designates location as holy",5));
        Spells.add(new Spells("True Seeing","Lets you see all things as they really are",5));
        Spells.add(new Spells("Unhallow","Designates location as unholy",5));
        Spells.add(new Spells("Break Enchantment","Frees subjects from enchantments, alterations, curses, and petrification",5));
        Spells.add(new Spells("Raise Dead","Restores life to subject who died as long as one day/level ago",5));
        Spells.add(new Spells("Dispel Chaos/Evil/Good/Law","+4 bonus against attacks",5));
        Spells.add(new Spells("Righteous Might","Your size increases, and you gain combat bonuses",5));
        Spells.add(new Spells("Wall of Stone","Creates a stone wall that can be shaped",5));
        Spells.add(new Spells("Summon Monster V","Calls extraplanar creature to fight for you",5));
        Spells.add(new Spells("Command, Greater","As command, but affects one subject/level",5));
        Spells.add(new Spells("Scrying","Spies on subject from a distance",5));
        Spells.add(new Spells("Slay Living","Touch attack kills subject",5));
        Spells.add(new Spells("Plane Shift","As many as eight subjects travel to another plane",5));
        Spells.add(new Spells("Mark of Justice","Designates action that will trigger curse on subject",5));
        Spells.add(new Spells("Blade Barrier","Wall of blades deals 1d6/level damage",6));
        Spells.add(new Spells("Etherealness","Travel to Ethereal Plane with companions",6));
        Spells.add(new Spells("Geas/Quest","As lesser geas, plus it affects any creature",6));
        Spells.add(new Spells("Harm","Deals 10 points/level damage to target",6));
        Spells.add(new Spells("Antilife Shell","3 m. field hedges out living creatures",6));
        Spells.add(new Spells("Animate Objects","3 m. field hedges out living creatures",6));
        Spells.add(new Spells("Planar Ally","As lesser planar ally, but up to 16 HD",6));
        Spells.add(new Spells("Wind Walk","You and your allies turn vaporous and travel fast",6));
        Spells.add(new Spells("Word of Recall","Teleports you back to designated place",6));
        Spells.add(new Spells("Create Undead","Create ghouls, ghasts, mummies, or mohrgs",6));
        Spells.add(new Spells("Heroes’ Feast","Food for one creature/level cures and grants combat bonuses",6));
        Spells.add(new Spells("Heal","Cures 10 points/level of damage, all diseases and mental conditions",6));
        Spells.add(new Spells("Summon Monster VI","Calls extraplanar creature to fight for you",6));
        Spells.add(new Spells("Atonement, Greater","Like Atonement but +20 on roll",6));
        Spells.add(new Spells("Glyph of Warding, Greater","As glyph of warding, but up to 10d8 damage or 6th-level spell",6));
        Spells.add(new Spells("Banishment","Banishes 2 HD/level of extraplanar creatures",6));
        Spells.add(new Spells("Forbiddance","Blocks planar travel, damages creatures of different alignment",6));
        Spells.add(new Spells("Find the Path","Shows most direct way to a location",6));
        Spells.add(new Spells("Refuge","Alters item to transport its possessor to you",7));
        Spells.add(new Spells("Blasphemy","Kills, paralyzes, weakens, or dazes nonevil subjects",7));
        Spells.add(new Spells("Control Weather","Changes weather in local area",7));
        Spells.add(new Spells("Regenerate","Subject’s severed limbs grow back, cures 4d8 damage +1/level (max +35)",7));
        Spells.add(new Spells("Dictum","Kills, paralyzes, slows, or deafens nonlawful subjects",7));
        Spells.add(new Spells("Word of Chaos","Kills, confuses, stuns, or deafens nonchaotic subjects",7));
        Spells.add(new Spells("Holy Word","Kills, paralyzes, blinds, or deafens nongood subjects",7));
        Spells.add(new Spells("Summon Monster VII","Calls extraplanar creature to fight for you",7));
        Spells.add(new Spells("Restoration, Greater","As Restoration, plus restores all levels and ability scores",7));
        Spells.add(new Spells("Scrying, Greater","As scrying, but faster and longer",7));
        Spells.add(new Spells("Resurrection","Fully restore dead subject",7));
        Spells.add(new Spells("Repulsion","Creatures can’t approach you",7));
        Spells.add(new Spells("Destruction","Kills subject and destroys remains",7));
        Spells.add(new Spells("Cure Critical Wounds, Mass","Cures 4d8 damage +1/level for many creatures",8));
        Spells.add(new Spells("Fire Storm","Deals 1d6/level fire damage",8));
        Spells.add(new Spells("Cloak of Chaos","+4 to AC, +4 resistance, and SR 25 against lawful spells",8));
        Spells.add(new Spells("Antimagic Field","Negates magic within 3m",8));
        Spells.add(new Spells("Unholy Aura","+4 to AC, +4 resistance, and SR 25 against good spells",8));
        Spells.add(new Spells("Create Greater Undead","Create shadows, wraiths, spectres, or devourers",8));
        Spells.add(new Spells("Symbol","Activated runes have variety of effects",8));
        Spells.add(new Spells("Holy Aura","+4 to AC, +4 resistance, and SR 25 against evil spells",8));
        Spells.add(new Spells("Shield of Law","+4 to AC, +4 resistance, and SR 25 against chaotic spells",8));
        Spells.add(new Spells("Earthquake","Intense tremor shakes 1,5 m./level radius",8));
        Spells.add(new Spells("Summon Monster VIII","Calls extraplanar creature to fight for you",8));
        Spells.add(new Spells("Planar Ally, Greater","As lesser planar ally, but up to 24 HD",8));
        Spells.add(new Spells("Discern Location","Reveals exact location of creature or object",8));
        Spells.add(new Spells("Gate","Connects two planes for travel or summoning",9));
        Spells.add(new Spells("Storm of Vengeance","Storm rains acid, lightning, and hail",9));
        Spells.add(new Spells("Miracle","Requests a deity’s intercession",9));
        Spells.add(new Spells("Implosion","Kills one creature/round",9));
        Spells.add(new Spells("True Resurrection","As resurrection, plus remains aren’t needed",9));
        Spells.add(new Spells("Astral Projection","Projects you and companions onto Astral Plane",9));
        Spells.add(new Spells("Soul Bind","Traps newly dead soul to prevent resurrection",9));
        Spells.add(new Spells("Summon Monster IX","Calls extraplanar creature to fight for you",9));
        Spells.add(new Spells("Energy Drain","Subject gains 2d4 negative levels",9));














    }
}
