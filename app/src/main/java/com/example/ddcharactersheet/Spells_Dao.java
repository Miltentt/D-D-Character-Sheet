package com.example.ddcharactersheet;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

@Dao
public interface Spells_Dao {
    @Insert
    void Insert(Spells_Entity... feats);

    @Query("SELECT * FROM Spells_Entity")
    List<Spells_Entity> loadAllSpells();

    @Query("SELECT * FROM Spells_Entity WHERE id=:id")
    Spells_Entity Load_Spell(int id);

    @Query("UPDATE Spells_Entity SET 'Spells0'=:race WHERE id = :id")
    void Update0(List<String> race, int id);
    @Query("UPDATE Spells_Entity SET 'Spells1'=:race WHERE id = :id")
    void Update1(List<String> race, int id);
    @Query("UPDATE Spells_Entity SET 'Spells2'=:race WHERE id = :id")
    void Update2(List<String> race, int id);
    @Query("UPDATE Spells_Entity SET 'Spells3'=:race WHERE id = :id")
    void Update3(List<String> race, int id);
    @Query("UPDATE Spells_Entity SET 'Spells4'=:race WHERE id = :id")
    void Update4(List<String> race, int id);
    @Query("UPDATE Spells_Entity SET 'Spells5'=:race WHERE id = :id")
    void Update5(List<String> race, int id);
    @Query("UPDATE Spells_Entity SET 'Spells6'=:race WHERE id = :id")
    void Update6(List<String> race, int id);
    @Query("UPDATE Spells_Entity SET 'Spells7'=:race WHERE id = :id")
    void Update7(List<String> race, int id);
    @Query("UPDATE Spells_Entity SET 'Spells8'=:race WHERE id = :id")
    void Update8(List<String> race, int id);
    @Query("UPDATE Spells_Entity SET 'Spells9'=:race WHERE id = :id")
    void Update9(List<String> race, int id);

    @Delete
    void Delete(Spells_Entity... feats);
}