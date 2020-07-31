package com.example.ddcharactersheet.Statistics;

import com.example.ddcharactersheet.Spells;

import java.util.LinkedList;
import java.util.List;

public class Wizard_Spells {


    List<com.example.ddcharactersheet.Spells> Spells = new LinkedList<>();





    public List<com.example.ddcharactersheet.Spells> getSpells() {
        return Spells;
    }

    public void setSpells(List<com.example.ddcharactersheet.Spells> spells) {
        Spells = spells;
    }


















   public void Populate()
    {
        Spells.add(new Spells("Ghost Sound","Figment sounds",0));
        Spells.add(new Spells("Disrupt Undead"," Deals 1d6 damage to one undead",0));
        Spells.add(new Spells("Resistance","Subject gains +1 on saving throws",0));
        Spells.add(new Spells("Ray of Frost","Ray deals 1d3 cold damage",0));
        Spells.add(new Spells("Mage Hand","2,5kg telekinesis",0));
        Spells.add(new Spells("Mending","Makes minor repairs on an object",0));
        Spells.add(new Spells("Open/Close","Opens or closes small or light things",0));
        Spells.add(new Spells("Read Magic","Read scrolls and spellbooks",0));
        Spells.add(new Spells("Prestidigitation","Performs minor tricks",0));
        Spells.add(new Spells("Arcane Mark","Inscribes a personal rune (visible or invisible)",0));
        Spells.add(new Spells("Detect Magic","Detects spells and magic items within 18m",0));
        Spells.add(new Spells("Detect Poison","Detects poison in one creature or small object",0));
        Spells.add(new Spells("Flare","Dazzles one creature (–1 on attack rolls)",0));
        Spells.add(new Spells("Light","Object shines like a torch",0));
        Spells.add(new Spells("Dancing Lights","Creates torches or other lights",0));
        Spells.add(new Spells("Daze","Humanoid creature of 4 HD or less loses next action",0));
        Spells.add(new Spells("Ventriloquism","Throws voice for 1 min./level",1));
        Spells.add(new Spells("Color Spray","Knocks unconscious, blinds, and/or stuns 1d6 weak creature",1));
        Spells.add(new Spells("Nystul’s Magic Aura","Alters object’s magic aura",1));
        Spells.add(new Spells("Silent Image","Creates minor illusion of your design",1));
        Spells.add(new Spells("Disguise Self","Changes your appearance",1));
        Spells.add(new Spells("Chill Touch","One touch/level deals 1d6 damage and possibly 1 Str damage",1));
        Spells.add(new Spells("Cause Fear","One creature of 5 HD or less flees for 1d4 rounds",1));
        Spells.add(new Spells("Ray of Enfeeblement","Ray deals 1d6 +1 per two levels Str damage",1));
        Spells.add(new Spells("Alarm","Wards an area for 2 hours/level",1));
        Spells.add(new Spells("Protection from Chaos/Evil/Good/Law","+2 to AC and saves, counter mind control, hedge out elementals and outsiders",1));
        Spells.add(new Spells("Shield","Invisible disc gives +4 to AC, blocks magic missiles",1));
        Spells.add(new Spells("Hold Portal","Holds door shut",1));
        Spells.add(new Spells("Endure Elements","Exist comfortably in hot or cold environments",1));
        Spells.add(new Spells("Unseen Servant","Invisible force obeys your commands",1));
        Spells.add(new Spells("Grease","Makes 10-ft. square or one object slippery",1));
        Spells.add(new Spells("Summon Monster I","Calls extraplanar creature to fight for you",1));
        Spells.add(new Spells("Mount","Summons riding horse for 2 hours/level",1));
        Spells.add(new Spells("Obscuring Mist","Fog surrounds you",1));
        Spells.add(new Spells("Mage Armor","Gives subject +4 armor bonus",1));
        Spells.add(new Spells("Magic Weapon","Weapon gains +1 bonus",1));
        Spells.add(new Spells("Animate Rope","Makes a rope move at your command",1));
        Spells.add(new Spells("Spider Climbing","Get ability to walk on walls and ceilings",1));
        Spells.add(new Spells("Burning Hands","1d4/level fire damage (max 5d4)",1));
        Spells.add(new Spells("Reduce Person","Humanoid creature halves in size",1));
        Spells.add(new Spells("Enlarge Person","Humanoid creature doubles in size",1));
        Spells.add(new Spells("Jump","Subject gets bonus on Jump checks",1));
        Spells.add(new Spells("Feather Fall","Objects or creatures fall slowly",1));
        Spells.add(new Spells("Expeditious Retreat","Doubles your speed",1));
        Spells.add(new Spells("Message","Whispered conversation at distance",1));
        Spells.add(new Spells("Shocking Grasp","Touch delivers 1d8+1/level electricity damage",1));
        Spells.add(new Spells("Erase","Mundane or magical writing vanishes",1));
        Spells.add(new Spells("Identify","Determines properties of magic item",1));
        Spells.add(new Spells("True Strike","+20 on your next attack roll",1));
        Spells.add(new Spells("Comprehend Languages","You understand all spoken and written languages",1));
        Spells.add(new Spells("Detect Undead","Reveals undead within 18m",1));
        Spells.add(new Spells("Detect Secret Doors","Reveals hidden doors within 18m",1));
        Spells.add(new Spells("Tenser’s Floating Disk","Creates 1 m-diameter horizontal disk that holds 50 kg/level",1));
        Spells.add(new Spells("Magic Missile","1d4+1 damage; +1 missile per two levels above 1st (max 5)",1));
        Spells.add(new Spells("Hypnotism","Fascinates 2d4 HD of creatures",1));
        Spells.add(new Spells("Sleep","Puts 4 HD of creatures into magical slumber",1));
        Spells.add(new Spells("Charm Person","Makes one person your friend",1));
        Spells.add(new Spells("Hypnotic Pattern","Fascinates (2d4 + level) HD of creatures",2));
        Spells.add(new Spells("Mirror Image","Creates decoy duplicates of you (1d4 +1 per three levels, max 8)",2));
        Spells.add(new Spells("Magic Mouth","Speaks once when triggered",2));
        Spells.add(new Spells("Minor Image","As silent image, plus some sound",2));
        Spells.add(new Spells("Leomund’s Trap","Makes item seem trapped",2));
        Spells.add(new Spells("Misdirection","Misleads divinations for one creature or object",2));
        Spells.add(new Spells("Blur","Attacks miss subject 20% of the time",2));
        Spells.add(new Spells("Ghoul Touch","Paralyzes one subject, which exudes stench that makes those nearby sickened",2));
        Spells.add(new Spells("Spectral Hand","Creates disembodied glowing hand to deliver touch attacks",2));
        Spells.add(new Spells("Scare","Panics creatures of less than 6 HD",2));
        Spells.add(new Spells("False Life","Gain 1d10 temporary hp +1/level (max +10)",2));
        Spells.add(new Spells("Protection from Arrows","Subject immune to most ranged attacks",2));
        Spells.add(new Spells("Resist Energy","Ignores first 10 (or more) points of damage/attack from specified energy type",2));
        Spells.add(new Spells("Arcane Lock","Magically locks a portal or chest",2));
        Spells.add(new Spells("Obscure Object","Masks object against scrying",2));
        Spells.add(new Spells("Fog Cloud","Fog obscures vision",2));
        Spells.add(new Spells("Melf’s Acid Arrow","Ranged touch attack; 2d4 damage for 1 round +1 round/three levels",2));
        Spells.add(new Spells("Web","Fills 6 m.-radius spread with sticky spiderwebs",2));
        Spells.add(new Spells("Glitterdust","Blinds creatures, outlines invisible creatures",2));
        Spells.add(new Spells("Summon Monster II","Calls extraplanar creature to fight for you",2));
        Spells.add(new Spells("Summon Swarm","Summons swarm of bats, rats, or spiders",2));
        Spells.add(new Spells("Bull’s Strength","Subject gains +4 to Str for 1 min./level",2));
        Spells.add(new Spells("Cat’s Grace","Subject gains +4 to Dex for 1 min./level",2));
        Spells.add(new Spells("Knock","Opens locked or magically sealed door",2));
        Spells.add(new Spells("Levitate","Subject moves up and down at your direction",2));
        Spells.add(new Spells("Pyrotechnics","Turns fire into blinding light or choking smoke",2));
        Spells.add(new Spells("Alter Self","Assume form of a similar creature",2));
        Spells.add(new Spells("Whispering Wind","Sends a short message 1,5 km/level",2));
        Spells.add(new Spells("Rope Trick","As many as eight creatures hide in extradimensional space",2));
        Spells.add(new Spells("Blindness/Deafness","Makes subject blinded or deafened",2));
        Spells.add(new Spells("Darkvision","See 20 m in total darkness",2));
        Spells.add(new Spells("Detect Thoughts","Allows “listening” to surface thoughts",2));
        Spells.add(new Spells("Bear’s Endurance","Subject gains +4 to Con for 1 min./level",2));
        Spells.add(new Spells("See Invisibility","Reveals invisible creatures or objects",2));
        Spells.add(new Spells("Locate Object","Senses direction toward object (specific or type)",2));
        Spells.add(new Spells("Darkness","6 m. radius of supernatural shadow",2));
        Spells.add(new Spells("Continual Flame","Makes a permanent, heatless torch",2));
        Spells.add(new Spells("Flaming Sphere","Creates rolling ball of fire, 2d6 damage, lasts 1 round/level",2));
        Spells.add(new Spells("Scorching Ray","Ranged touch attack deals 4d6 fire damage",2));
        Spells.add(new Spells("Shatter","Sonic vibration damages objects or crystalline creatures",2));
        Spells.add(new Spells("Tasha’s Hideous Laughter","Subject loses actions for 1 round/level",2));
        Spells.add(new Spells("Illusory Script","Only intended reader can decipher",3));
        Spells.add(new Spells("Invisibility Sphere","Makes everyone within 3 m. invisible",3));
        Spells.add(new Spells("Displacement","Attacks miss subject 50%",3));
        Spells.add(new Spells("Major Image","As silent image, plus sound, smell and thermal effect",3));
        Spells.add(new Spells("Gentle Repose","Preserves one corpse",3));
        Spells.add(new Spells("Vampiric Touch","Touch deals 1d6/two levels damage; caster gains damage as hp",3));
        Spells.add(new Spells("Halt Undead","Immobilizes undead for 1 round/level",3));
        Spells.add(new Spells("Magic Circle against Chaos/Evil/Good/Law","As protection spells, but 3 m. radius and 10 min./level",3));
        Spells.add(new Spells("Nondetection","Immobilizes undead for 1 round/level",3));
        Spells.add(new Spells("Protection from Energy","Absorb 12 points/level of damage from one kind of energy",3));
        Spells.add(new Spells("Dispel Magic","Cancels magical spells and effects",3));
        Spells.add(new Spells("Explosive Runes","Deals 6d6 damage when read",3));
        Spells.add(new Spells("Sleet Storm","Hampers vision and movement",3));
        Spells.add(new Spells("Fire Arrow","Shoots fire projectiles (extra damage) or shoots a fire impulse (4k6)",3));
        Spells.add(new Spells("Stinking Cloud","Nauseating vapors, 1 round/level",3));
        Spells.add(new Spells("Summon Monster III","Calls extraplanar creature to fight for you",3));
        Spells.add(new Spells("Sepia Snake Sigil","Creates text symbol that immobilizes reader",3));
        Spells.add(new Spells("Phantom Steed","Magic horse appears for 1 hour/level",3));
        Spells.add(new Spells("Fly","Subject flies at speed of 30 m",3));
        Spells.add(new Spells("Blink","You randomly vanish and reappear for 1 round/level",3));
        Spells.add(new Spells("Water Breathing","Subjects can breathe underwater",3));
        Spells.add(new Spells("Keen Edge","Doubles normal weapon’s threat range",3));
        Spells.add(new Spells("Haste","Extra partial action + 4AC",3));
        Spells.add(new Spells("Secret Page","Changes one page to hide its real content",3));
        Spells.add(new Spells("Shrink Item","Object shrinks to one-sixteenth size",3));
        Spells.add(new Spells("Slow","One subject/level takes only one partial action/round, –2 to AC, –2 on attack rolls",3));
        Spells.add(new Spells("Gaseous Form","Subject becomes insubstantial and can fly slowly",3));
        Spells.add(new Spells("Magic Weapon, Greater","+1/four levels (max +5)",3));
        Spells.add(new Spells("Clairaudience/Clairvoyance","Hear or see at a distance for 1 min./level",3));
        Spells.add(new Spells("Tongues","Speak any language",3));
        Spells.add(new Spells("Lightning Bolt","Electricity deals 1d6/level damage",3));
        Spells.add(new Spells("Fireball","1d6 damage per level, 6 m. radius",3));
        Spells.add(new Spells("Leomund’s Tiny Hut","Creates shelter for ten creatures",3));
        Spells.add(new Spells("Gust of Wind","Blows away or knocks down smaller creatures",3));
        Spells.add(new Spells("Wind Wall","Deflects arrows, smaller creatures, and gases",3));
        Spells.add(new Spells("Suggestion","Compels subject to follow stated course of action",3));
        Spells.add(new Spells("Hold Person","Paralyzes one humanoid for 1 round/level",3));
        Spells.add(new Spells("Shadow Conjuration","Mimics conjuration below 4th level, but only 20% real",4));
        Spells.add(new Spells("Hallucinatory Terrain","Makes one type of terrain appear like another (field into forest, or the like)",4));
        Spells.add(new Spells("Illusory Wall","Wall, floor, or ceiling looks real, but anything can pass through",4));
        Spells.add(new Spells("Rainbow Pattern","Lights fascinate 24 HD of creatures",4));
        Spells.add(new Spells("Phantasmal Killer","Fearsome illusion kills subject or deals 3d6 damage",4));
        Spells.add(new Spells("Invisibility, Greater","As invisibility, but subject can attack and stay invisible",4));
        Spells.add(new Spells("Fear","Subjects within cone flee for 1 round/level",4));
        Spells.add(new Spells("Enervation","Subject gains 1d4 negative levels",4));
        Spells.add(new Spells("Contagion","Infects subject with chosen disease",4));
        Spells.add(new Spells("Stoneskin","Ignore 10 points of damage per attack",4));
        Spells.add(new Spells("Fire Trap","Opened object deals 1d4 damage +1/level",4));
        Spells.add(new Spells("Remove Curse","Frees object or person from curse",4));
        Spells.add(new Spells("Dimensional Anchor","Bars extradimensional movement",4));
        Spells.add(new Spells("Leomund’s Secure Shelter","Creates sturdy cottage",4));
        Spells.add(new Spells("Evard’s Black Tentacles","Tentacles grapple all within 5 m. spread",4));
        Spells.add(new Spells("Minor Creation","Creates one cloth or wood object",4));
        Spells.add(new Spells("Solid Fog","Blocks vision and slows movement",4));
        Spells.add(new Spells("Summon Monster IV","Calls extraplanar creature to fight for you",4));
        Spells.add(new Spells("Bestow Curse","–6 to an ability score; –4 on attack rolls, saves, and checks; or 50% chance of losing each action",4));
        Spells.add(new Spells("Polymorph","Gives one willing subject a new form",4));
        Spells.add(new Spells("Rary’s Mnemonic Enhancer","Wizard only. Prepares extra spells or retains one just cast",4));
        Spells.add(new Spells("Dimension Door","Teleports you short distance",4));
        Spells.add(new Spells("Arcane Eye","Invisible floating eye moves 9 m./round",4));
        Spells.add(new Spells("Scrying","Spies on subject from a distance",4));
        Spells.add(new Spells("Detect Scrying","Alerts you of magical eavesdropping",4));
        Spells.add(new Spells("Locate Creature","Indicates direction to familiar creature",4));
        Spells.add(new Spells("Ice Storm","Hail deals 5d6 damage in cylinder 12 m. across",4));
        Spells.add(new Spells("Shout","Deafens all within cone and deals 5d6 sonic damage",4));
        Spells.add(new Spells("Otiluke’s Resilient Sphere","Force globe protects but traps one subject",4));
        Spells.add(new Spells("Wall of Ice","Ice plane creates wall with 15 hp +1/level, or hemisphere can trap creatures inside",4));
        Spells.add(new Spells("Wall of Fire","Deals 2d4 fire damage out to 10 ft. and 1d4 out to 20 ft. Passing through wall deals 2d6 damage +1/level",4));
        Spells.add(new Spells("Emotion","Subject someone to strong emotion",4));
        Spells.add(new Spells("Geas, Lesser","Commands subject of 7 HD or less",4));
        Spells.add(new Spells("Confusion","Subjects behave oddly for 1 round/level",4));
        Spells.add(new Spells("Charm Monster","Makes monster believe it is your ally",4));
        Spells.add(new Spells("False Vision","Fools scrying with an illusion",5));
        Spells.add(new Spells("Nightmare","Sends vision dealing 1d10 damage, fatigue",5));
        Spells.add(new Spells("Mirage Arcana","As hallucinatory terrain, plus structures",5));
        Spells.add(new Spells("Persistent Image","As major image, but no concentration required",5));
        Spells.add(new Spells("Seeming","Changes appearance of one person per two levels",5));
        Spells.add(new Spells("Dream","Sends message to anyone sleeping",5));
        Spells.add(new Spells("Magic Jar","Enables possession of another creature",5));
        Spells.add(new Spells("Animate Dead","Creates undead skeletons and zombies",5));
        Spells.add(new Spells("Dismissal","Forces a creature to return to native plane",5));
        Spells.add(new Spells("Planar Binding, Lesser","Traps extraplanar creature of 6 HD or less until it performs a task",5));
        Spells.add(new Spells("Leomund’s Secret Chest","Hides expensive chest on Ethereal Plane; you retrieve it at will",5));
        Spells.add(new Spells("Wall of Stone","Creates a stone wall that can be shaped",5));
        Spells.add(new Spells("Wall of Iron","30 hp/four levels; can topple onto foes",5));
        Spells.add(new Spells("Summon Monster V","Calls extraplanar creature to fight for you",5));
        Spells.add(new Spells("Mordenkainen’s Faithful Hound","Phantom dog can guard, attack",5));
        Spells.add(new Spells("Major Creation","As minor creation, plus stone and metal",5));
        Spells.add(new Spells("Cloudkill","Kills 3 HD or less; 4–6 HD save or die, 6+ HD take Con damage",5));
        Spells.add(new Spells("Stone Shape","Sculpts stone into any shape",5));
        Spells.add(new Spells("Passwall","Creates passage through wood or stone wall",5));
        Spells.add(new Spells("Telekinesis","Moves object, attacks creature, or hurls object or creature",5));
        Spells.add(new Spells("Teleport","Instantly transports you as far as 180 km/level",5));
        Spells.add(new Spells("Transmute Mud to Rock","Transforms two 3 m. cubes per level",5));
        Spells.add(new Spells("Transmute Rock to Mud","Transforms two 3 m. cubes per level",5));
        Spells.add(new Spells("Fabricate","Transforms raw materials into finished items",5));
        Spells.add(new Spells("Animal Growth","One animal/two levels doubles in size",5));
        Spells.add(new Spells("Permanency","Makes certain spells permanent",5));
        Spells.add(new Spells("Contact Other Plane","Lets you ask question of extraplanar entity",5));
        Spells.add(new Spells("Rary’s Telepathic Bond","Link lets allies communicate",5));
        Spells.add(new Spells("Prying Eyes","1d4 +1/level floating eyes scout for you",5));
        Spells.add(new Spells("Sending","Delivers short message anywhere, instantly",5));
        Spells.add(new Spells("Bigby’s Interposing Hand","Hand provides cover against one opponent",5));
        Spells.add(new Spells("Cone of Cold","1d6/level cold damage",5));
        Spells.add(new Spells("Wall of Force","Wall is immune to damage",5));
        Spells.add(new Spells("Dominate Person","Controls humanoid telepathically",5));
        Spells.add(new Spells("Feeblemind","Subject’s Int and Cha drop to 1",5));
        Spells.add(new Spells("Hold Monster","As hold person, but any creature",5));
        Spells.add(new Spells("Mind Fog","Subjects in fog get –10 to Wis and Will checks",5));
        Spells.add(new Spells("Permanent Image","Includes sight, sound, and smell",6));
        Spells.add(new Spells("Project Image","Illusory double can talk and cast spells",6));
        Spells.add(new Spells("Programmed Image","As major image, plus triggered by event",6));
        Spells.add(new Spells("Veil","Changes appearance of group of creatures",6));
        Spells.add(new Spells("Mislead","Turns you invisible and creates illusory double",6));
        Spells.add(new Spells("Circle of Death","Kills 1d4/level HD of creatures",6));
        Spells.add(new Spells("Globe of Invulnerability","As lesser globe of invulnerability, plus 4th-level spell effects",6));
        Spells.add(new Spells("Guards and Wards","Array of magic effects protect area",6));
        Spells.add(new Spells("Dispel Magic, Greater","As dispel magic, but +20 on check",6));
        Spells.add(new Spells("Antimagic Field","As dispel magic, but +20 on check",6));
        Spells.add(new Spells("Repulsion","Creatures can’t approach you",6));
        Spells.add(new Spells("Acid Fog","Fog deals acid damage",6));
        Spells.add(new Spells("Planar Binding","As lesser planar binding, but up to 16 HD",6));
        Spells.add(new Spells("Summon Monster VI","Calls extraplanar creature to fight for you",6));
        Spells.add(new Spells("Statue","Subject can become a statue at will",6));
        Spells.add(new Spells("Disintegrate","Makes one creature or object vanish",6));
        Spells.add(new Spells("Mordenkainen’s Lucubration","Wizard only. Recalls spell of 5th level or lower",6));
        Spells.add(new Spells("Stone to Flesh","Restores petrified creature",6));
        Spells.add(new Spells("Eyebite","Target becomes panicked, sickened, and comatose",6));
        Spells.add(new Spells("Control Weather","Changes weather in local area",6));
        Spells.add(new Spells("Control Water","Raises or lowers bodies of water",6));
        Spells.add(new Spells("Mass Haste","As Haste, but affects 1 subject/level",6));
        Spells.add(new Spells("Tenser’s Transformation","You gain combat bonuses",6));
        Spells.add(new Spells("Analyze Dweomer","Reveals magical aspects of subject",6));
        Spells.add(new Spells("True Seeing","Lets you see all things as they really are",6));
        Spells.add(new Spells("Legend Lore","Lets you learn tales about a person, place, or thing",6));
        Spells.add(new Spells("Contingency","Sets trigger condition for another spell",6));
        Spells.add(new Spells("Chain Lightning","1d6/level damage; 1 secondary bolt/level each deals half damage",6));
        Spells.add(new Spells("Bigby’s Forceful Hand","Hand pushes creatures away",6));
        Spells.add(new Spells("Otiluke’s Freezing Sphere","Freezes water or deals cold damage",6));
        Spells.add(new Spells("Geas/Quest","As lesser geas, plus it affects any creature",6));
        Spells.add(new Spells("Suggestion, Mass","As suggestion, plus one subject/level",6));
        Spells.add(new Spells("Shadow Walk","Step into shadow to travel rapidly",7));
        Spells.add(new Spells("Invisibility, Mass","As invisibility, but affects all in range",7));
        Spells.add(new Spells("Simulacrum","Creates partially real double of a creature",7));
        Spells.add(new Spells("Control Undead","Undead don’t attack you while under your command",7));
        Spells.add(new Spells("Finger of Death","Kills one subject",7));
        Spells.add(new Spells("Sequester","Subject is invisible to sight and scrying; renders creature comatose",7));
        Spells.add(new Spells("Banishment","Banishes 2 HD/level of extraplanar creatures",7));
        Spells.add(new Spells("Spell Turning","Reflect 1d4+6 spell levels back at caster",7));
        Spells.add(new Spells("Phase Door","Creates an invisible passage through wood or stone",7));
        Spells.add(new Spells("Drawmij’s Instant Summons","Prepared object appears in your hand",7));
        Spells.add(new Spells("Power Word Stun","Stuns creature with 150 hp or less",7));
        Spells.add(new Spells("Summon Monster VII","Calls extraplanar creature to fight for you",7));
        Spells.add(new Spells("Mordenkainen’s Magnificent Mansion","Door leads to extradimensional mansion",7));
        Spells.add(new Spells("Teleport, Greater","As teleport, but no range limit and no offtarget arrival",7));
        Spells.add(new Spells("Ethereal Jaunt","You become ethereal for 1 round/level",7));
        Spells.add(new Spells("Reverse Gravity","Objects and creatures fall upward",7));
        Spells.add(new Spells("Plane Shift","As many as eight subjects travel to another plane",7));
        Spells.add(new Spells("Teleport Object","As teleport, but affects a touched object",7));
        Spells.add(new Spells("Limited Wish","Alters reality—within spell limits",7));
        Spells.add(new Spells("Scrying, Greater","As scrying, but faster and longer",7));
        Spells.add(new Spells("Vision","As legend lore, but quicker and strenuous",7));
        Spells.add(new Spells("Bigby’s Grasping Hand","Hand provides cover, pushes, or grapples",7));
        Spells.add(new Spells("Forcecage","Cube or cage of force imprisons all inside",7));
        Spells.add(new Spells("Delayed Blast Fireball","1d8/level fire damage; you can postpone blast for 5 rounds",7));
        Spells.add(new Spells("Mordenkainen’s Sword","Floating magic blade strikes opponents",7));
        Spells.add(new Spells("Prismatic Spray","Rays hit subjects with variety of effects",7));
        Spells.add(new Spells("Insanity","Subject suffers continuous confusion",7));
        Spells.add(new Spells("Screen","Illusion hides area from vision, scrying",8));
        Spells.add(new Spells("Clone","Duplicate awakens when original dies",8));
        Spells.add(new Spells("Horrid Wilting","Deals 1d6/level damage within 9 m",8));
        Spells.add(new Spells("Protection from Spells","Confers +8 resistance bonus",8));
        Spells.add(new Spells("Prismatic Wall","Wall’s colors have array of effects",8));
        Spells.add(new Spells("Mind Blank","Subject is immune to mental/emotional magic and scrying",8));
        Spells.add(new Spells("Maze","Traps subject in extradimensional maze",8));
        Spells.add(new Spells("Trap the Soul","Imprisons subject within gem",8));
        Spells.add(new Spells("Power Word Blind","Blinds creature with 200 hp or less",8));
        Spells.add(new Spells("Planar Binding, Greater","As lesser planar binding, but up to 24 HD",8));
        Spells.add(new Spells("Incendiary Cloud","Cloud deals 4d6 fire damage/round",8));
        Spells.add(new Spells("Etherealness","Travel to Ethereal Plane with companions",8));
        Spells.add(new Spells("Polymorph Any Object","Changes any subject into anything else",8));
        Spells.add(new Spells("Symbol","Activated runes have variety of effects",8));
        Spells.add(new Spells("Discern Location","Reveals exact location of creature or object",8));
        Spells.add(new Spells("Sunburst","Blinds all within 10 ft., deals 6d6 damage",8));
        Spells.add(new Spells("Otiluke’s Telekinetic Sphere","As Otiluke’s resilient sphere, but you move sphere telekinetically",8));
        Spells.add(new Spells("Bigby’s Clenched Fist","Large hand provides cover, pushes, or attacks your foes",8));
        Spells.add(new Spells("Antipathy","Object or location affected by spell repels certain creatures",8));
        Spells.add(new Spells("Charm Monster, Mass","As charm monster, but all within 9 m",8));
        Spells.add(new Spells("Otto’s Irresistible Dance","Forces subject to dance",8));
        Spells.add(new Spells("Sympathy","Object or location attracts certain creatures",8));
        Spells.add(new Spells("Binding","Utilizes an array of techniques to imprison a creature",8));
        Spells.add(new Spells("Demand","As sending, plus you can send suggestion",8));
        Spells.add(new Spells("Weird","As phantasmal killer, but affects all within 9 m",9));
        Spells.add(new Spells("Astral Projection","Projects you and companions onto Astral Plane",9));
        Spells.add(new Spells("Soul Bind","Traps newly dead soul to prevent resurrection",9));
        Spells.add(new Spells("Wail of the Banshee","Kills one creature/level",9));
        Spells.add(new Spells("Energy Drain","Subject gains 2d4 negative levels",9));
        Spells.add(new Spells("Prismatic Sphere","As prismatic wall, but surrounds on all sides",9));
        Spells.add(new Spells("Mordenkainen’s Disjunction","Dispels magic, disenchants magic items",9));
        Spells.add(new Spells("Imprisonment","Entombs subject beneath the earth",9));
        Spells.add(new Spells("Freedom","Releases creature from imprisonment",9));
        Spells.add(new Spells("Gate","Connects two planes for travel or summoning",9));
        Spells.add(new Spells("Power Word Kill","Kills one creature with 100 hp or less",9));
        Spells.add(new Spells("Summon Monster IX","Calls extraplanar creature to fight for you",9));
        Spells.add(new Spells("Refuge","Alters item to transport its possessor to you",9));
        Spells.add(new Spells("Teleportation Circle","Circle teleports any creature inside to designated spot",9));
        Spells.add(new Spells("Time Stop","You act freely for 1d4+1 rounds",9));
        Spells.add(new Spells("Shapechange","Transforms you into any creature, and change forms once per round",9));
        Spells.add(new Spells("Wish","As limited wish, but with fewer limits",9));
        Spells.add(new Spells("Foresight","Sixth sense warns of impending danger",9));
        Spells.add(new Spells("Bigby’s Crushing Hand","Large hand provides cover, pushes, or crushes your foes",9));
        Spells.add(new Spells("Meteor Swarm","Four exploding spheres each deal 6d6 fire damage",9));
        Spells.add(new Spells("Dominate Monster","As dominate person, but any creature",9));

    }
}
