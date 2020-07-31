package com.example.ddcharactersheet.Model;



import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Character
{
    @PrimaryKey(autoGenerate = true)
    private int id;
    @ColumnInfo(name="level")
    private int level;
    @ColumnInfo(name="name")
    private String name;
    @ColumnInfo(name="BAB")
    private String BAB;
    @ColumnInfo(name="HP")
    private int hp;
    @ColumnInfo(name="Reflex")
    private int Reflex;
    @ColumnInfo(name="Fort")
    private int fort;
    @ColumnInfo(name="Will")
    private int will;
    @ColumnInfo(name="Sp0")
    private int sp0;
    @ColumnInfo(name="Sp1")
    private int sp1;
    @ColumnInfo(name="Sp2")
    private int sp2;
    @ColumnInfo(name="Sp3")
    private int sp3;
    @ColumnInfo(name="Sp4")
    private int sp4;
    @ColumnInfo(name="Sp5")
    private int sp5;
    @ColumnInfo(name="IDW1")
    private int idw1=-1;
    @ColumnInfo(name="IDW2")
    private int idw2=-1;
    @ColumnInfo(name="IDW3")
    private int idw3=-1;
    @ColumnInfo(name="IDS1")
    private int ids1=-1;
    @ColumnInfo(name="IDS2")
    private int ids2=-1;

    public int getIdw1() {
        return idw1;
    }

    public void setIdw1(int idw1) {
        this.idw1 = idw1;
    }

    public int getIdw2() {
        return idw2;
    }

    public void setIdw2(int idw2) {
        this.idw2 = idw2;
    }

    public int getIdw3() {
        return idw3;
    }

    public void setIdw3(int idw3) {
        this.idw3 = idw3;
    }

    public int getIds1() {
        return ids1;
    }

    public void setIds1(int ids1) {
        this.ids1 = ids1;
    }

    public int getIds2() {
        return ids2;
    }

    public void setIds2(int ids2) {
        this.ids2 = ids2;
    }

    public int getIda1() {
        return ida1;
    }

    public void setIda1(int ida1) {
        this.ida1 = ida1;
    }

    public int getIda2() {
        return ida2;
    }

    public void setIda2(int ida2) {
        this.ida2 = ida2;
    }

    public int getIdo1() {
        return ido1;
    }

    public void setIdo1(int ido1) {
        this.ido1 = ido1;
    }

    public int getIdo2() {
        return ido2;
    }

    public void setIdo2(int ido2) {
        this.ido2 = ido2;
    }

    public int getIdo3() {
        return ido3;
    }

    public void setIdo3(int ido3) {
        this.ido3 = ido3;
    }

    public int getIdo4() {
        return ido4;
    }

    public void setIdo4(int ido4) {
        this.ido4 = ido4;
    }

    public int getIdo5() {
        return ido5;
    }

    public void setIdo5(int ido5) {
        this.ido5 = ido5;
    }

    @ColumnInfo(name="IDA1")
    private int ida1=-1;
    @ColumnInfo(name="IDA2")
    private int ida2=-1;
    @ColumnInfo(name="IDO1")
    private int ido1=-1;
    @ColumnInfo(name="IDO2")
    private int ido2=-1;
    @ColumnInfo(name="IDO3")
    private int ido3=-1;
    @ColumnInfo(name="IDO4")
    private int ido4=-1;
    @ColumnInfo(name="IDO5")
    private int ido5=-1;


    public int getSp0() {
        return sp0;
    }

    public void setSp0(int sp0) {
        this.sp0 = sp0;
    }

    public int getSp1() {
        return sp1;
    }

    public void setSp1(int sp1) {
        this.sp1 = sp1;
    }

    public int getSp2() {
        return sp2;
    }

    public void setSp2(int sp2) {
        this.sp2 = sp2;
    }

    public int getSp3() {
        return sp3;
    }

    public void setSp3(int sp3) {
        this.sp3 = sp3;
    }

    public int getSp4() {
        return sp4;
    }

    public void setSp4(int sp4) {
        this.sp4 = sp4;
    }

    public int getSp5() {
        return sp5;
    }

    public void setSp5(int sp5) {
        this.sp5 = sp5;
    }

    public int getSp6() {
        return sp6;
    }

    public void setSp6(int sp6) {
        this.sp6 = sp6;
    }

    public int getSp7() {
        return sp7;
    }

    public void setSp7(int sp7) {
        this.sp7 = sp7;
    }

    public int getSp8() {
        return sp8;
    }

    public void setSp8(int sp8) {
        this.sp8 = sp8;
    }

    public int getSp9() {
        return sp9;
    }

    public void setSp9(int sp9) {
        this.sp9 = sp9;
    }

    @ColumnInfo(name="Sp6")
    private int sp6;
    @ColumnInfo(name="Sp7")
    private int sp7;
    @ColumnInfo(name="Sp8")
    private int sp8;
    @ColumnInfo(name="Sp9")
    private int sp9;


    public int getAC() {
        return AC;
    }

    public void setAC(int AC) {
        this.AC = AC;
    }

    @ColumnInfo(name="AC")
    private int AC;
    @ColumnInfo(name="class")
    private String clas;

    public String getBAB() {
        return BAB;
    }

    public void setBAB(String BAB) {
        this.BAB = BAB;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getReflex() {
        return Reflex;
    }

    public void setReflex(int reflex) {
        Reflex = reflex;
    }

    public int getFort() {
        return fort;
    }

    public void setFort(int fort) {
        this.fort = fort;
    }

    public int getWill() {
        return will;
    }

    public void setWill(int will) {
        this.will = will;
    }

    public int getRacialID() {
        return RacialID;
    }

    public void setRacialID(int racialID) {
        RacialID = racialID;
    }

    @ColumnInfo(name="RacialID")
    private int RacialID;
    @ColumnInfo (name="Str")
    private int str;
    @ColumnInfo (name="Dex")
    private int dex;
    @ColumnInfo (name="Con")
    private int con;
    @ColumnInfo (name="Int")
    private int intel;
    @ColumnInfo (name="Wis")
    private int wis;
    @ColumnInfo (name="Cha")
    private int cha;
    @ColumnInfo (name="Strc")
    private int strc;
    @ColumnInfo (name="Dexc")
    private int dexc;
    @ColumnInfo (name="Conc")
    private int conc;
    @ColumnInfo (name="Intc")
    private int intelc;
    @ColumnInfo (name="Wisc")
    private int wisc;
    @ColumnInfo (name="Chac")
    private int chac;

    public int getFeatid() {
        return featid;
    }

    public void setFeatid(int featid) {
        this.featid = featid;
    }

    @ColumnInfo (name="FeatsID")
private int featid;
    @ColumnInfo (name="Spellsid")
    private int spellid=-1;

    public int getSpellid() {
        return spellid;
    }

    public void setSpellid(int spellid) {
        this.spellid = spellid;
    }

    //Skills
    @ColumnInfo(name="Bluff")
    private int bluff=0;
    @ColumnInfo(name="Move Silently")
    private int move=0;
    @ColumnInfo(name="Spellcraft")
    private int spellcraft=0;
    @ColumnInfo(name="Diplomacy")
    private int diplo=0;
    @ColumnInfo(name="Forgery")
    private int forgery=0;
    @ColumnInfo(name="Horsemanship")
    private int horse=0;
    @ColumnInfo(name="Concentration")
    private int conce=0;
    @ColumnInfo(name="Heal")
    private int heal=0;
    @ColumnInfo(name="Listen")
    private int listen=0;
    @ColumnInfo(name="Decipher Script")
    private int decipher=0;
    @ColumnInfo(name="Lockpicking")
    private int lock=0;
    @ColumnInfo(name="Swimming")
    private int swim=0;
    @ColumnInfo(name="Handle Animal")
    private int animal=0;
    @ColumnInfo(name="Disguise")
    private int disguise=0;
    @ColumnInfo(name="Search")
    private int search=0;
    @ColumnInfo(name="Craft")
    private int craft=0;
    @ColumnInfo(name="Domain1")
    private String dom1;
    @ColumnInfo(name="Domain2")
    private String dom2;

    public String getDom1() {
        return dom1;
    }

    public void setDom1(String dom1) {
        this.dom1 = dom1;
    }

    public String getDom2() {
        return dom2;
    }

    public void setDom2(String dom2) {
        this.dom2 = dom2;
    }

    public int getAlch() {
        return alch;
    }

    public void setAlch(int alch) {
        this.alch = alch;
    }

    @ColumnInfo(name="Alchemy")
    private int alch=0;

    public int getStrc() {
        return strc;
    }

    public void setStrc(int strc) {
        this.strc = strc;
    }

    public int getDexc() {
        return dexc;
    }

    public void setDexc(int dexc) {
        this.dexc = dexc;
    }

    public int getConc() {
        return conc;
    }

    public void setConc(int conc) {
        this.conc = conc;
    }

    public int getIntelc() {
        return intelc;
    }

    public void setIntelc(int intelc) {
        this.intelc = intelc;
    }

    public int getWisc() {
        return wisc;
    }

    public void setWisc(int wisc) {
        this.wisc = wisc;
    }

    public int getChac() {
        return chac;
    }

    public void setChac(int chac) {
        this.chac = chac;
    }

    public int getBluff() {
        return bluff;
    }

    public void setBluff(int bluff) {
        this.bluff = bluff;
    }

    public int getMove() {
        return move;
    }

    public void setMove(int move) {
        this.move = move;
    }

    public int getSpellcraft() {
        return spellcraft;
    }

    public void setSpellcraft(int spellcraft) {
        this.spellcraft = spellcraft;
    }

    public int getDiplo() {
        return diplo;
    }

    public void setDiplo(int diplo) {
        this.diplo = diplo;
    }

    public int getForgery() {
        return forgery;
    }

    public void setForgery(int forgery) {
        this.forgery = forgery;
    }

    public int getHorse() {
        return horse;
    }

    public void setHorse(int horse) {
        this.horse = horse;
    }

    public int getConce() {
        return conce;
    }

    public void setConce(int conce) {
        this.conce = conce;
    }

    public int getHeal() {
        return heal;
    }

    public void setHeal(int heal) {
        this.heal = heal;
    }

    public int getListen() {
        return listen;
    }

    public void setListen(int listen) {
        this.listen = listen;
    }

    public int getDecipher() {
        return decipher;
    }

    public void setDecipher(int decipher) {
        this.decipher = decipher;
    }

    public int getLock() {
        return lock;
    }

    public void setLock(int lock) {
        this.lock = lock;
    }

    public int getSwim() {
        return swim;
    }

    public void setSwim(int swim) {
        this.swim = swim;
    }

    public int getAnimal() {
        return animal;
    }

    public void setAnimal(int animal) {
        this.animal = animal;
    }

    public int getDisguise() {
        return disguise;
    }

    public void setDisguise(int disguise) {
        this.disguise = disguise;
    }

    public int getSearch() {
        return search;
    }

    public void setSearch(int search) {
        this.search = search;
    }

    public int getCraft() {
        return craft;
    }

    public void setCraft(int craft) {
        this.craft = craft;
    }

    public int getJump() {
        return jump;
    }

    public void setJump(int jump) {
        this.jump = jump;
    }

    public int getObs() {
        return obs;
    }

    public void setObs(int obs) {
        this.obs = obs;
    }

    public int getAppa() {
        return appa;
    }

    public void setAppa(int appa) {
        this.appa = appa;
    }

    public int getWild() {
        return wild;
    }

    public void setWild(int wild) {
        this.wild = wild;
    }

    public int getHide() {
        return hide;
    }

    public void setHide(int hide) {
        this.hide = hide;
    }

    public int getDisable() {
        return disable;
    }

    public void setDisable(int disable) {
        this.disable = disable;
    }

    public int getUserope() {
        return userope;
    }

    public void setUserope(int userope) {
        this.userope = userope;
    }

    public int getUsemagic() {
        return usemagic;
    }

    public void setUsemagic(int usemagic) {
        this.usemagic = usemagic;
    }

    public int getArcana() {
        return arcana;
    }

    public void setArcana(int arcana) {
        this.arcana = arcana;
    }

    public int getNature() {
        return nature;
    }

    public void setNature(int nature) {
        this.nature = nature;
    }

    public int getReligion() {
        return religion;
    }

    public void setReligion(int religion) {
        this.religion = religion;
    }

    public int getPlanes() {
        return planes;
    }

    public void setPlanes(int planes) {
        this.planes = planes;
    }

    public int getRoyal() {
        return royal;
    }

    public void setRoyal(int royal) {
        this.royal = royal;
    }

    public int getClimb() {
        return climb;
    }

    public void setClimb(int climb) {
        this.climb = climb;
    }

    public int getSense() {
        return sense;
    }

    public void setSense(int sense) {
        this.sense = sense;
    }

    public int getPerform() {
        return perform;
    }

    public void setPerform(int perform) {
        this.perform = perform;
    }

    public int getEscape() {
        return escape;
    }

    public void setEscape(int escape) {
        this.escape = escape;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getIntimid() {
        return intimid;
    }

    public void setIntimid(int intimid) {
        this.intimid = intimid;
    }

    public int getProfe() {
        return profe;
    }

    public void setProfe(int profe) {
        this.profe = profe;
    }

    public int getGather() {
        return gather;
    }

    public void setGather(int gather) {
        this.gather = gather;
    }

    public int getPick() {
        return pick;
    }

    public void setPick(int pick) {
        this.pick = pick;
    }

    public int getAgil() {
        return agil;
    }

    public void setAgil(int agil) {
        this.agil = agil;
    }

    @ColumnInfo(name="Jump")
    private int jump=0;
    @ColumnInfo(name="Observation")
    private int obs=0;
    @ColumnInfo(name="Apparaise")
    private int appa=0;
    @ColumnInfo(name="Wilderness Lore")
    private int wild=0;
    @ColumnInfo(name="Hide")
    private int hide=0;
    @ColumnInfo(name="Disable Device")
    private int disable=0;
    @ColumnInfo(name="Use Rope")
    private int userope=0;
    @ColumnInfo(name="Use Magic Device")
    private int usemagic=0;
    @ColumnInfo(name="Arcana Knowledge")
    private int arcana=0;
    @ColumnInfo(name="Nature Knowledge")
    private int nature=0;
    @ColumnInfo(name="Religion Knowledge")
    private int religion=0;
    @ColumnInfo(name="Planes Knowledge")
    private int planes=0;
    @ColumnInfo(name="Royalty Knowledge")
    private int royal=0;
    @ColumnInfo(name="Climbing")
    private int climb=0;
    @ColumnInfo(name="Sense Motive")
    private int sense=0;
    @ColumnInfo(name="Perform")
    private int perform=0;
    @ColumnInfo(name="Escape")
    private int escape=0;
    @ColumnInfo(name="Balance")
    private int balance=0;
    @ColumnInfo(name="Intimidation")
    private int intimid=0;
    @ColumnInfo(name="Profession")
    private int profe=0;
    @ColumnInfo(name="Gathering Information")
    private int gather=0;
    @ColumnInfo(name="Pick Pocketing")
    private int pick=0;
    @ColumnInfo(name="Agility")
    private int agil=0;

    public int getStr() {
        return str;
    }

    public void setStr(int str) {
        this.str = str;
    }

    public int getDex() {
        return dex;
    }

    public void setDex(int dex) {
        this.dex = dex;
    }

    public int getCon() {
        return con;
    }

    public void setCon(int con) {
        this.con = con;
    }

    public int getIntel() {
        return intel;
    }

    public void setIntel(int intel) {
        this.intel = intel;
    }

    public int getWis() {
        return wis;
    }

    public void setWis(int wis) {
        this.wis = wis;
    }

    public int getCha() {
        return cha;
    }

    public void setCha(int cha) {
        this.cha = cha;
    }







    @ColumnInfo(name="race")
    private String race;
public Character(int level, String name, String clas)
{
    this.level=level;
    this.name=name;
    this.clas=clas;
    this.dom1="";
    this.dom2="";

}
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }
    public int getLevel() {
        return level;
    }

    public String getClas() {
        return clas;
    }

    public void setClas(String clas) {
        this.clas = clas;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
