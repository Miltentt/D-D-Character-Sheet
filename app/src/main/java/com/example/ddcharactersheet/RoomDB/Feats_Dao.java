package com.example.ddcharactersheet.RoomDB;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import com.example.ddcharactersheet.Model.Feats_List_Database;

import java.util.List;
@Dao
public interface Feats_Dao {
    @Insert
    void Insert(Feats_List_Database... feats);
    @Query("SELECT * FROM Feats_List_Database")
    List<Feats_List_Database> loadAllTasks();
    @Query("SELECT * FROM Feats_List_Database WHERE id =:id")
    Feats_List_Database get(int id);
    @Query("UPDATE Feats_List_Database SET Alertness=:race WHERE id = :id")
    void Alert(boolean race, int id);
    @Query("UPDATE Feats_List_Database SET `Armor Proficiency (light)`=:race WHERE id = :id")
    void APL(boolean race, int id);
    @Query("UPDATE Feats_List_Database SET `Armor Proficiency (medium)`=:race WHERE id = :id")
    void APM(boolean race, int id);
    @Query("UPDATE Feats_List_Database SET `Armor Proficiency (heavy)`=:race WHERE id = :id")
    void APH(boolean race, int id);
    @Query("UPDATE Feats_List_Database SET `Blind-Fight`=:race WHERE id = :id")
    void BF(boolean race, int id);
    @Query("UPDATE Feats_List_Database SET `Combat Casting`=:race WHERE id = :id")
    void CC(boolean race, int id);
    @Query("UPDATE Feats_List_Database SET `Combat Expertise`=:race WHERE id = :id")
    void CE(boolean race, int id);
    @Query("UPDATE Feats_List_Database SET `Improved Disarm`=:race WHERE id = :id")
    void ID(boolean race, int id);
    @Query("UPDATE Feats_List_Database SET `Improved Feint`=:race WHERE id = :id")
    void IF(boolean race, int id);
    @Query("UPDATE Feats_List_Database SET `Improved Trip`=:race WHERE id = :id")
    void IT(boolean race, int id);
    @Query("UPDATE Feats_List_Database SET `Whirlwind Attack`=:race WHERE id = :id")
    void WA(boolean race, int id);
    @Query("UPDATE Feats_List_Database SET `Combat Reflexes`=:race WHERE id = :id")
    void CR(boolean race, int id);
    @Query("UPDATE Feats_List_Database SET `Dodge`=:race WHERE id = :id")
    void D(boolean race, int id);
    @Query("UPDATE Feats_List_Database SET `Mobility`=:race WHERE id = :id")
    void M(boolean race, int id);
    @Query("UPDATE Feats_List_Database SET `Spring Attack`=:race WHERE id = :id")
    void SA(boolean race, int id);
    @Query("UPDATE Feats_List_Database SET `Endurance`=:race WHERE id = :id")
    void E(boolean race, int id);
    @Query("UPDATE Feats_List_Database SET `Diehard`=:race WHERE id = :id")
    void DI(boolean race, int id);
    @Query("UPDATE Feats_List_Database SET `Eschew Materials`=:race WHERE id = :id")
    void EM(boolean race, int id);
    @Query("UPDATE Feats_List_Database SET `Exotic Weapon Proficiency`=:race WHERE id = :id")
    void EWP(boolean race, int id);
    @Query("UPDATE Feats_List_Database SET `Great Fortitude`=:race WHERE id = :id")
    void GF(boolean race, int id);
    @Query("UPDATE Feats_List_Database SET `Improved Critical`=:race WHERE id = :id")
    void IC(boolean race, int id);
    @Query("UPDATE Feats_List_Database SET `Point Blank Shot`=:race WHERE id = :id")
    void PBS(boolean race, int id);
    @Query("UPDATE Feats_List_Database SET `Far Shot`=:race WHERE id = :id")
    void FS(boolean race, int id);
    @Query("UPDATE Feats_List_Database SET `Precise Shot`=:race WHERE id = :id")
    void PS(boolean race, int id);
    @Query("UPDATE Feats_List_Database SET `Shot on the Run`=:race WHERE id = :id")
    void SotR(boolean race, int id);
    @Query("UPDATE Feats_List_Database SET `Run`=:race WHERE id = :id")
    void R(boolean race, int id);
    @Query("UPDATE Feats_List_Database SET `Martial Weapon Proficiency`=:race WHERE id = :id")
    void MWP(boolean race, int id);
    @Query("UPDATE Feats_List_Database SET `Simple Weapon Proficiency`=:race WHERE id = :id")
    void SWP(boolean race, int id);
    @Query("UPDATE Feats_List_Database SET `Shield Proficiency`=:race WHERE id = :id")
    void SP(boolean race, int id);
    @Query("UPDATE Feats_List_Database SET `Lightning Reflexes`=:race WHERE id = :id")
    void LR(boolean race, int id);
    @Query("UPDATE Feats_List_Database SET `Weapon Finesse`=:race WHERE id = :id")
    void WF(boolean race, int id);
    @Query("UPDATE Feats_List_Database SET `Mounted Combat`=:race WHERE id = :id")
    void MC(boolean race, int id);
    @Query("UPDATE Feats_List_Database SET `Mounted Archery`=:race WHERE id = :id")
    void MA(boolean race, int id);
    @Query("UPDATE Feats_List_Database SET `Ride-By Attack`=:race WHERE id = :id")
    void RBA(boolean race, int id);
    @Query("UPDATE Feats_List_Database SET `Spirited Charge`=:race WHERE id = :id")
    void SC(boolean race, int id);
    @Query("UPDATE Feats_List_Database SET `Trample`=:race WHERE id = :id")
    void T(boolean race, int id);
    @Query("UPDATE Feats_List_Database SET `Vigor`=:race WHERE id = :id")
    void V(boolean race, int id);
    @Query("UPDATE Feats_List_Database SET `Ambidexterity`=:race WHERE id = :id")
    void A(boolean race, int id);
    @Query("UPDATE Feats_List_Database SET `Improved Initiative`=:race WHERE id = :id")
    void II(boolean race, int id);
    @Query("UPDATE Feats_List_Database SET `Improved Unarmed Strike`=:race WHERE id = :id")
    void IUS(boolean race, int id);
    @Query("UPDATE Feats_List_Database SET `Deflect Arrows`=:race WHERE id = :id")
    void DA(boolean race, int id);
    @Query("UPDATE Feats_List_Database SET `Stunning Fist`=:race WHERE id = :id")
    void SF(boolean race, int id);
    @Query("UPDATE Feats_List_Database SET `Cleave`=:race WHERE id = :id")
    void C(boolean race, int id);
    @Query("UPDATE Feats_List_Database SET `Great Cleave`=:race WHERE id = :id")
    void GC(boolean race, int id);
    @Query("UPDATE Feats_List_Database SET `Power Attack`=:race WHERE id = :id")
    void PA(boolean race, int id);
    @Query("UPDATE Feats_List_Database SET `Improved Bull Rush`=:race WHERE id = :id")
    void IBR(boolean race, int id);
    @Query("UPDATE Feats_List_Database SET `Improved Sunder`=:race WHERE id = :id")
    void IS(boolean race, int id);
    @Query("UPDATE Feats_List_Database SET `Spell Penetration`=:race WHERE id = :id")
    void SPe(boolean race, int id);
    @Query("UPDATE Feats_List_Database SET `Quick Draw`=:race WHERE id = :id")
    void QD(boolean race, int id);
    @Query("UPDATE Feats_List_Database SET `Track`=:race WHERE id = :id")
    void Tr(boolean race, int id);
    @Query("UPDATE Feats_List_Database SET `Toughness`=:race WHERE id = :id")
    void Tou(boolean race, int id);
    @Query("UPDATE Feats_List_Database SET `Two-Weapon Fighting`=:race WHERE id = :id")
    void TWF(boolean race, int id);
    @Query("UPDATE Feats_List_Database SET `Improved Two-Weapon Fighting`=:race WHERE id = :id")
    void ITWF(boolean race, int id);
    @Query("UPDATE Feats_List_Database SET `Leadership`=:race WHERE id = :id")
    void L(boolean race, int id);
    @Query("UPDATE Feats_List_Database SET `Weapon Focus`=:race WHERE id = :id")
    void WFo(boolean race, int id);
    @Query("UPDATE Feats_List_Database SET `Spell Focus`=:race WHERE id = :id")
    void SFo(boolean race, int id);
    @Query("UPDATE Feats_List_Database SET `Skill Focus`=:race WHERE id = :id")
    void SFoc(boolean race, int id);
    @Query("UPDATE Feats_List_Database SET `Iron Will`=:race WHERE id = :id")
    void IW(boolean race, int id);
    @Query("UPDATE Feats_List_Database SET `Brew Potion`=:race WHERE id = :id")
    void BP(boolean race, int id);
    @Query("UPDATE Feats_List_Database SET `Craft Magic Arms and Armor`=:race WHERE id = :id")
    void CMA(boolean race, int id);
    @Query("UPDATE Feats_List_Database SET `Craft Rod`=:race WHERE id = :id")
    void CRod(boolean race, int id);
    @Query("UPDATE Feats_List_Database SET `Craft Staff`=:race WHERE id = :id")
    void CS(boolean race, int id);
    @Query("UPDATE Feats_List_Database SET `Craft Wand`=:race WHERE id = :id")
    void CW(boolean race, int id);
    @Query("UPDATE Feats_List_Database SET `Craft Wondrous Item`=:race WHERE id = :id")
    void CWI(boolean race, int id);
    @Query("UPDATE Feats_List_Database SET `Scribe Scroll`=:race WHERE id = :id")
    void SS(boolean race, int id);
    @Query("UPDATE Feats_List_Database SET `Forge Ring`=:race WHERE id = :id")
    void FR(boolean race, int id);
    @Query("UPDATE Feats_List_Database SET `Maximize Spell`=:race WHERE id = :id")
    void MS(boolean race, int id);
    @Query("UPDATE Feats_List_Database SET `Empower Spell`=:race WHERE id = :id")
    void ES(boolean race, int id);
    @Query("UPDATE Feats_List_Database SET `Enlarge Spell`=:race WHERE id = :id")
    void ESp(boolean race, int id);
    @Query("UPDATE Feats_List_Database SET `Extend Spell`=:race WHERE id = :id")
    void ESpe(boolean race, int id);
    @Query("UPDATE Feats_List_Database SET `Heighten Spell`=:race WHERE id = :id")
    void HS(boolean race, int id);
    @Query("UPDATE Feats_List_Database SET `Quicken Spell`=:race WHERE id = :id")
    void QS(boolean race, int id);
    @Query("UPDATE Feats_List_Database SET `Silent Spell`=:race WHERE id = :id")
    void SSP(boolean race, int id);
    @Query("UPDATE Feats_List_Database SET `Still Spell`=:race WHERE id = :id")
    void SSPe(boolean race, int id);
    @Query("UPDATE Feats_List_Database SET `Widen Spell`=:race WHERE id = :id")
    void WS(boolean race, int id);
}
