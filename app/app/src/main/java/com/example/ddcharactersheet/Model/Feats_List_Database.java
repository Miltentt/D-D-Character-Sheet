package com.example.ddcharactersheet.Model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Feats_List_Database {
    @PrimaryKey(autoGenerate = true)
    private int id;
    @ColumnInfo(name="Alertness")
    private boolean alert;
    @ColumnInfo(name="Armor Proficiency (light)")
    private boolean APL;
    @ColumnInfo(name="Armor Proficiency (medium)")
    private boolean APM;
    @ColumnInfo(name="Armor Proficiency (heavy)")
    private boolean APH;
    @ColumnInfo(name="Blind-Fight")
    private boolean BF;
    @ColumnInfo(name="Combat Casting")
    private boolean CC;
    @ColumnInfo(name="Combat Expertise")
    private boolean CE;
    @ColumnInfo(name="Improved Disarm")
    private boolean ID;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isAlert() {
        return alert;
    }

    public void setAlert(boolean alert) {
        this.alert = alert;
    }

    public boolean isAPL() {
        return APL;
    }

    public void setAPL(boolean APL) {
        this.APL = APL;
    }

    public boolean isAPM() {
        return APM;
    }

    public void setAPM(boolean APM) {
        this.APM = APM;
    }

    public boolean isAPH() {
        return APH;
    }

    public void setAPH(boolean APH) {
        this.APH = APH;
    }

    public boolean isBF() {
        return BF;
    }

    public void setBF(boolean BF) {
        this.BF = BF;
    }

    public boolean isCC() {
        return CC;
    }

    public void setCC(boolean CC) {
        this.CC = CC;
    }

    public boolean isCE() {
        return CE;
    }

    public void setCE(boolean CE) {
        this.CE = CE;
    }

    public boolean isID() {
        return ID;
    }

    public void setID(boolean ID) {
        this.ID = ID;
    }

    public boolean isIF() {
        return IF;
    }

    public void setIF(boolean IF) {
        this.IF = IF;
    }

    public boolean isIT() {
        return IT;
    }

    public void setIT(boolean IT) {
        this.IT = IT;
    }

    public boolean isWA() {
        return WA;
    }

    public void setWA(boolean WA) {
        this.WA = WA;
    }

    public boolean isCR() {
        return CR;
    }

    public void setCR(boolean CR) {
        this.CR = CR;
    }

    public boolean isD() {
        return D;
    }

    public void setD(boolean d) {
        D = d;
    }

    public boolean isM() {
        return M;
    }

    public void setM(boolean m) {
        M = m;
    }

    public boolean isSA() {
        return SA;
    }

    public void setSA(boolean SA) {
        this.SA = SA;
    }

    public boolean isE() {
        return E;
    }

    public void setE(boolean e) {
        E = e;
    }

    public boolean isDie() {
        return Die;
    }

    public void setDie(boolean die) {
        Die = die;
    }

    public boolean isEM() {
        return EM;
    }

    public void setEM(boolean EM) {
        this.EM = EM;
    }

    public boolean isEWP() {
        return EWP;
    }

    public void setEWP(boolean EWP) {
        this.EWP = EWP;
    }

    public boolean isGF() {
        return GF;
    }

    public void setGF(boolean GF) {
        this.GF = GF;
    }

    public boolean isIC() {
        return IC;
    }

    public void setIC(boolean IC) {
        this.IC = IC;
    }

    public boolean isPBS() {
        return PBS;
    }

    public void setPBS(boolean PBS) {
        this.PBS = PBS;
    }

    public boolean isFS() {
        return FS;
    }

    public void setFS(boolean FS) {
        this.FS = FS;
    }

    public boolean isPS() {
        return PS;
    }

    public void setPS(boolean PS) {
        this.PS = PS;
    }

    public boolean isSotR() {
        return SotR;
    }

    public void setSotR(boolean sotR) {
        SotR = sotR;
    }

    public boolean isR() {
        return R;
    }

    public void setR(boolean r) {
        R = r;
    }

    public boolean isMWP() {
        return MWP;
    }

    public void setMWP(boolean MWP) {
        this.MWP = MWP;
    }

    public boolean isSWP() {
        return SWP;
    }

    public void setSWP(boolean SWP) {
        this.SWP = SWP;
    }

    public boolean isSP() {
        return SP;
    }

    public void setSP(boolean SP) {
        this.SP = SP;
    }

    public boolean isLR() {
        return LR;
    }

    public void setLR(boolean LR) {
        this.LR = LR;
    }

    public boolean isWF() {
        return WF;
    }

    public void setWF(boolean WF) {
        this.WF = WF;
    }

    public boolean isMC() {
        return MC;
    }

    public void setMC(boolean MC) {
        this.MC = MC;
    }

    public boolean isMA() {
        return MA;
    }

    public void setMA(boolean MA) {
        this.MA = MA;
    }

    public boolean isRA() {
        return RA;
    }

    public void setRA(boolean RA) {
        this.RA = RA;
    }

    public boolean isSC() {
        return SC;
    }

    public void setSC(boolean SC) {
        this.SC = SC;
    }

    public boolean isT() {
        return T;
    }

    public void setT(boolean t) {
        T = t;
    }

    public boolean isV() {
        return V;
    }

    public void setV(boolean v) {
        V = v;
    }

    public boolean isA() {
        return A;
    }

    public void setA(boolean a) {
        A = a;
    }

    public boolean isII() {
        return II;
    }

    public void setII(boolean II) {
        this.II = II;
    }

    public boolean isIUS() {
        return IUS;
    }

    public void setIUS(boolean IUS) {
        this.IUS = IUS;
    }

    public boolean isDA() {
        return DA;
    }

    public void setDA(boolean DA) {
        this.DA = DA;
    }

    public boolean isSF() {
        return SF;
    }

    public void setSF(boolean SF) {
        this.SF = SF;
    }

    public boolean isC() {
        return C;
    }

    public void setC(boolean c) {
        C = c;
    }

    public boolean isGC() {
        return GC;
    }

    public void setGC(boolean GC) {
        this.GC = GC;
    }

    public boolean isIBR() {
        return IBR;
    }

    public void setIBR(boolean IBR) {
        this.IBR = IBR;
    }

    public boolean isIS() {
        return IS;
    }

    public void setIS(boolean IS) {
        this.IS = IS;
    }

    public boolean isSPe() {
        return SPe;
    }

    public void setSPe(boolean SPe) {
        this.SPe = SPe;
    }

    public boolean isQD() {
        return QD;
    }

    public void setQD(boolean QD) {
        this.QD = QD;
    }

    public boolean isTr() {
        return Tr;
    }

    public void setTr(boolean tr) {
        Tr = tr;
    }

    public boolean isTou() {
        return Tou;
    }

    public void setTou(boolean tou) {
        Tou = tou;
    }

    public boolean isTWF() {
        return TWF;
    }

    public void setTWF(boolean TWF) {
        this.TWF = TWF;
    }

    public boolean isITWF() {
        return ITWF;
    }

    public void setITWF(boolean ITWF) {
        this.ITWF = ITWF;
    }

    public boolean isL() {
        return L;
    }

    public void setL(boolean l) {
        L = l;
    }

    public boolean isWFo() {
        return WFo;
    }

    public void setWFo(boolean WFo) {
        this.WFo = WFo;
    }

    public boolean isSFo() {
        return SFo;
    }

    public void setSFo(boolean SFo) {
        this.SFo = SFo;
    }

    public boolean isSFoc() {
        return SFoc;
    }

    public void setSFoc(boolean SFoc) {
        this.SFoc = SFoc;
    }

    public boolean isIW() {
        return IW;
    }

    public void setIW(boolean IW) {
        this.IW = IW;
    }

    public boolean isBP() {
        return BP;
    }

    public void setBP(boolean BP) {
        this.BP = BP;
    }

    public boolean isCMA() {
        return CMA;
    }

    public void setCMA(boolean CMA) {
        this.CMA = CMA;
    }

    public boolean isCRod() {
        return CRod;
    }

    public void setCRod(boolean CRod) {
        this.CRod = CRod;
    }

    public boolean isCS() {
        return CS;
    }

    public void setCS(boolean CS) {
        this.CS = CS;
    }

    public boolean isCW() {
        return CW;
    }

    public void setCW(boolean CW) {
        this.CW = CW;
    }

    public boolean isCWI() {
        return CWI;
    }

    public void setCWI(boolean CWI) {
        this.CWI = CWI;
    }

    public boolean isSS() {
        return SS;
    }

    public void setSS(boolean SS) {
        this.SS = SS;
    }

    public boolean isFR() {
        return FR;
    }

    public void setFR(boolean FR) {
        this.FR = FR;
    }

    public boolean isMS() {
        return MS;
    }

    public void setMS(boolean MS) {
        this.MS = MS;
    }

    public boolean isES() {
        return ES;
    }

    public void setES(boolean ES) {
        this.ES = ES;
    }

    public boolean isESp() {
        return ESp;
    }

    public void setESp(boolean ESp) {
        this.ESp = ESp;
    }

    public boolean isESpe() {
        return ESpe;
    }

    public void setESpe(boolean ESpe) {
        this.ESpe = ESpe;
    }

    public boolean isHS() {
        return HS;
    }

    public void setHS(boolean HS) {
        this.HS = HS;
    }

    public boolean isQS() {
        return QS;
    }

    public void setQS(boolean QS) {
        this.QS = QS;
    }

    public boolean isSSp() {
        return SSp;
    }

    public void setSSp(boolean SSp) {
        this.SSp = SSp;
    }

    public boolean isSSpe() {
        return SSpe;
    }

    public void setSSpe(boolean SSpe) {
        this.SSpe = SSpe;
    }

    public boolean isWS() {
        return WS;
    }

    public void setWS(boolean WS) {
        this.WS = WS;
    }

    @ColumnInfo(name="Improved Feint")
    private boolean IF;
    @ColumnInfo(name="Improved Trip")
    private boolean IT;
    @ColumnInfo(name="Whirlwind Attack")
    private boolean WA;
    @ColumnInfo(name="Combat Reflexes")
    private boolean CR;
    @ColumnInfo(name="Dodge")
    private boolean D;
    @ColumnInfo(name="Mobility")
    private boolean M;
    @ColumnInfo(name="Spring Attack")
    private boolean SA;
    @ColumnInfo(name="Endurance")
    private boolean E;
    @ColumnInfo(name="Diehard")
    private boolean Die;
    @ColumnInfo(name="Eschew Materials")
    private boolean EM;
    @ColumnInfo(name="Exotic Weapon Proficiency")
    private boolean EWP;
    @ColumnInfo(name="Great Fortitude")
    private boolean GF;
    @ColumnInfo(name="Improved Critical")
    private boolean IC;
    @ColumnInfo(name="Point Blank Shot")
    private boolean PBS;
    @ColumnInfo(name="Far Shot")
    private boolean FS;
    @ColumnInfo(name="Precise Shot")
    private boolean PS;
    @ColumnInfo(name="Shot on the Run")
    private boolean SotR;
    @ColumnInfo(name="Run")
    private boolean R;
    @ColumnInfo(name="Martial Weapon Proficiency")
    private boolean MWP;
    @ColumnInfo(name="Simple Weapon Proficiency")
    private boolean SWP;
    @ColumnInfo(name="Shield Proficiency")
    private boolean SP;
    @ColumnInfo(name="Lightning Reflexes")
    private boolean LR;
    @ColumnInfo(name="Weapon Finesse")
    private boolean WF;
    @ColumnInfo(name="Mounted Combat")
    private boolean MC;
    @ColumnInfo(name="Mounted Archery")
    private boolean MA;
    @ColumnInfo(name="Ride-By Attack")
    private boolean RA;
    @ColumnInfo(name="Spirited Charge")
    private boolean SC;
    @ColumnInfo(name="Trample")
    private boolean T;
    @ColumnInfo(name="Vigor")
    private boolean V;
    @ColumnInfo(name="Ambidexterity")
    private boolean A;
    @ColumnInfo(name="Improved Initiative")
    private boolean II;
    @ColumnInfo(name="Improved Unarmed Strike")
    private boolean IUS;
    @ColumnInfo(name="Deflect Arrows")
    private boolean DA;
    @ColumnInfo(name="Stunning Fist")
    private boolean SF;

    public boolean isPA() {
        return PA;
    }

    public void setPA(boolean PA) {
        this.PA = PA;
    }

    @ColumnInfo(name="Power Attack")
    private boolean PA;
    @ColumnInfo(name="Cleave")
    private boolean C;
    @ColumnInfo(name="Great Cleave")
    private boolean GC;
    @ColumnInfo(name="Improved Bull Rush")
    private boolean IBR;
    @ColumnInfo(name="Improved Sunder")
    private boolean IS;
    @ColumnInfo(name="Spell Penetration")
    private boolean SPe;
    @ColumnInfo(name="Quick Draw")
    private boolean QD;
    @ColumnInfo(name="Track")
    private boolean Tr;
    @ColumnInfo(name="Toughness")
    private boolean Tou;
    @ColumnInfo(name="Two-Weapon Fighting")
    private boolean TWF;
    @ColumnInfo(name="Improved Two-Weapon Fighting")
    private boolean ITWF;
    @ColumnInfo(name="Leadership")
    private boolean L;
    @ColumnInfo(name="Weapon Focus")
    private boolean WFo;
    @ColumnInfo(name="Spell Focus")
    private boolean SFo;
    @ColumnInfo(name="Skill Focus")
    private boolean SFoc;
    @ColumnInfo(name="Iron Will")
    private boolean IW;
    @ColumnInfo(name="Brew Potion")
    private boolean BP;
    @ColumnInfo(name="Craft Magic Arms and Armor")
    private boolean CMA;
    @ColumnInfo(name="Craft Rod")
    private boolean CRod;
    @ColumnInfo(name="Craft Staff")
    private boolean CS;
    @ColumnInfo(name="Craft Wand")
    private boolean CW;
    @ColumnInfo(name="Craft Wondrous Item")
    private boolean CWI;
    @ColumnInfo(name="Scribe Scroll")
    private boolean SS;
    @ColumnInfo(name="Forge Ring")
    private boolean FR;
    @ColumnInfo(name="Maximize Spell")
    private boolean MS;
    @ColumnInfo(name="Empower Spell")
    private boolean ES;
    @ColumnInfo(name="Enlarge Spell")
    private boolean ESp;
    @ColumnInfo(name="Extend Spell")
    private boolean ESpe;
    @ColumnInfo(name="Heighten Spell")
    private boolean HS;
    @ColumnInfo(name="Quicken Spell")
    private boolean QS;
    @ColumnInfo(name="Silent Spell")
    private boolean SSp;
    @ColumnInfo(name="Still Spell")
    private boolean SSpe;
    @ColumnInfo(name="Widen Spell")
    private boolean WS;




}
