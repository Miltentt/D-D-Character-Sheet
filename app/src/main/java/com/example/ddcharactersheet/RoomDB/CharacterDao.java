package com.example.ddcharactersheet.RoomDB;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import com.example.ddcharactersheet.Model.Character;

import java.util.List;

@Dao
public interface CharacterDao {
    @Insert
    void Insert(Character... character);
    @Query("UPDATE Character SET class=:clas WHERE id = :id")
    void update1(String clas, int id);
    @Query("UPDATE Character SET race=:race WHERE id = :id")
    void update2(String race, int id);
    @Query("SELECT * FROM Character")
    List<Character> loadAllTasks();
    @Query ("SELECT COUNT (*) FROM Character")
    int number();
    @Update
    void updatechar(Character... character);
    @Query("UPDATE Character SET AC=:bluff WHERE id=:id")
    void updateAC(int bluff, int id);
    @Query("UPDATE Character SET name=:bluff WHERE id=:id")
    void name(String bluff, int id);
    @Query("UPDATE Character SET str=:str,dex=:dex,con=:con,int=:intel,wis=:wis,cha=:cha WHERE id = :id")
    void update3(int str, int dex, int con, int intel, int wis, int cha, int id);
    @Query("UPDATE Character SET strc=:strc,dexc=:dexc,conc=:conc,intc=:intelc,wisc=:wisc,chac=:chac WHERE id = :id")
    void update4(int strc, int dexc, int conc, int intelc, int wisc, int chac, int id);
    @Query("UPDATE Character SET bluff=:bluff WHERE id=:id")
    void Bluff(int bluff, int id);
    @Query("UPDATE Character SET FeatsID=:bluff WHERE id=:id")
    void FeatID(int bluff, int id);
    @Query("UPDATE Character SET Spellsid=:bluff WHERE id=:id")
    void SpellID(int bluff, int id);
    @Query("UPDATE Character SET `Move Silently`=:move WHERE id=:id")
    void Move(int move, int id);
    @Query("UPDATE Character SET `Spellcraft`=:move WHERE id=:id")
    void Spell(int move, int id);
    @Query("UPDATE Character SET `Diplomacy`=:move WHERE id=:id")
    void Diplo(int move, int id);
    @Query("UPDATE Character SET `Forgery`=:move WHERE id=:id")
    void Forg(int move, int id);
    @Query("UPDATE Character SET `Horsemanship`=:move WHERE id=:id")
    void Horse(int move, int id);
    @Query("UPDATE Character SET `Concentration`=:move WHERE id=:id")
    void Concren(int move, int id);
    @Query("UPDATE Character SET `Heal`=:move WHERE id=:id")
    void Heal(int move, int id);
    @Query("UPDATE Character SET `Listen`=:move WHERE id=:id")
    void Listen(int move, int id);
    @Query("UPDATE Character SET `Decipher Script`=:move WHERE id=:id")
    void Decip(int move, int id);
    @Query("UPDATE Character SET `Lockpicking`=:move WHERE id=:id")
    void Lock(int move, int id);
    @Query("UPDATE Character SET `Swimming`=:move WHERE id=:id")
    void Swim(int move, int id);
    @Query("UPDATE Character SET `Handle Animal`=:move WHERE id=:id")
    void Handle(int move, int id);
    @Query("UPDATE Character SET `Disguise`=:move WHERE id=:id")
    void Disg(int move, int id);
    @Query("UPDATE Character SET `Search`=:move WHERE id=:id")
    void Search(int move, int id);
    @Query("UPDATE Character SET `Craft`=:move WHERE id=:id")
    void Craft(int move, int id);
    @Query("UPDATE Character SET `Alchemy`=:move WHERE id=:id")
    void Alch(int move, int id);
    @Query("UPDATE Character SET `Jump`=:move WHERE id=:id")
    void Jump(int move, int id);
    @Query("UPDATE Character SET `Observation`=:move WHERE id=:id")
    void Obser(int move, int id);
    @Query("UPDATE Character SET `Apparaise`=:move WHERE id=:id")
    void Appa(int move, int id);
    @Query("UPDATE Character SET `Wilderness Lore`=:move WHERE id=:id")
    void Wild(int move, int id);
    @Query("UPDATE Character SET `Hide`=:move WHERE id=:id")
    void Hide(int move, int id);
    @Query("UPDATE Character SET `Disable Device`=:move WHERE id=:id")
    void Disable(int move, int id);
    @Query("UPDATE Character SET `Use Rope`=:move WHERE id=:id")
    void Rope(int move, int id);
    @Query("UPDATE Character SET `Use Magic Device`=:move WHERE id=:id")
    void Mdevice(int move, int id);
    @Query("UPDATE Character SET `Arcana Knowledge`=:move WHERE id=:id")
    void Arcana(int move, int id);
    @Query("UPDATE Character SET `Nature Knowledge`=:move WHERE id=:id")
    void Nature(int move, int id);
    @Query("UPDATE Character SET `Religion Knowledge`=:move WHERE id=:id")
    void Religion(int move, int id);
    @Query("UPDATE Character SET `Planes Knowledge`=:move WHERE id=:id")
    void Planes(int move, int id);
    @Query("UPDATE Character SET `Royalty Knowledge`=:move WHERE id=:id")
    void Royal(int move, int id);
    @Query("UPDATE Character SET `Climbing`=:move WHERE id=:id")
    void Climb(int move, int id);
    @Query("UPDATE Character SET `Sense Motive`=:move WHERE id=:id")
    void Motive(int move, int id);
    @Query("UPDATE Character SET `Perform`=:move WHERE id=:id")
    void Perform(int move, int id);
    @Query("UPDATE Character SET `Escape`=:move WHERE id=:id")
    void Escape(int move, int id);
    @Query("UPDATE Character SET `Balance`=:move WHERE id=:id")
    void Balance(int move, int id);
    @Query("UPDATE Character SET `Intimidation`=:move WHERE id=:id")
    void Intimid(int move, int id);
    @Query("UPDATE Character SET `Profession`=:move WHERE id=:id")
    void Prof(int move, int id);
    @Query("UPDATE Character SET `Gathering Information`=:move WHERE id=:id")
    void Gathering(int move, int id);
    @Query("UPDATE Character SET `Pick Pocketing`=:move WHERE id=:id")
    void Pick(int move, int id);
    @Query("UPDATE Character SET `Agility`=:move WHERE id=:id")
    void Agility(int move, int id);
    @Query("UPDATE Character SET `Domain1`=:move WHERE id=:id")
    void Dom1(String move, int id);
    @Query("UPDATE Character SET `Domain2`=:move WHERE id=:id")
    void Dom2(String move, int id);
}
