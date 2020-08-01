package com.example.ddcharactersheet.Recursive;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

import com.example.ddcharactersheet.Character_Pages.Character_Sheet;
import com.example.ddcharactersheet.Model.Character;
import com.example.ddcharactersheet.R;
import com.example.ddcharactersheet.RoomDB.Character_Databse;
import com.example.ddcharactersheet.Statistics.Extra_Spells;

import java.util.LinkedList;
import java.util.List;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

public class Atribute_Level_UP extends AppCompatActivity {

    protected EditText str1;
    protected EditText dex1;
    protected EditText con1;
    protected EditText intel1;
    protected EditText wis1;
    protected EditText cha1;
    private ImageView add1;
    private ImageView add2;
    private ImageView add3;
    private ImageView add4;
    private ImageView add5;
    private ImageView add6;
    private ImageView sub1;
    private ImageView sub2;
    private ImageView sub3;
    private ImageView sub4;
    private ImageView sub5;
    private ImageView sub6;
private int position;
    private int point;
    private int clas;
    private int race;
    private Character_Databse db;
    private List<Character> Characters = new LinkedList();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.atribute_level_up);
        Bundle extras = getIntent().getExtras();
        this.position = extras.getInt("position");
        point =1;
        getSupportActionBar().hide();
        db = Room.databaseBuilder(getApplicationContext(), Character_Databse.class, "Characters1")
                .allowMainThreadQueries()
                .build();
        Characters = db.characterdao().loadAllTasks();
        str1 = findViewById(R.id.str1);
        dex1 = findViewById(R.id.dex1);
        con1 = findViewById(R.id.con1);
        intel1 = findViewById(R.id.int1);
        wis1 = findViewById(R.id.wis1);
        cha1 = findViewById(R.id.cha1);
        add1 = findViewById(R.id.add1);
        add2 = findViewById(R.id.add2);
        add3 = findViewById(R.id.add3);
        add4 = findViewById(R.id.add4);
        add5 = findViewById(R.id.add5);
        add6 = findViewById(R.id.add6);
        sub1 = findViewById(R.id.sub1);
        sub2 = findViewById(R.id.sub2);
        sub3 = findViewById(R.id.sub3);
        sub4 = findViewById(R.id.sub4);
        sub5 = findViewById(R.id.sub5);
        sub6 = findViewById(R.id.sub6);
str1.setText(Integer.toString(Characters.get(position).getStr()));
dex1.setText(Integer.toString(Characters.get(position).getDex()));
con1.setText(Integer.toString(Characters.get(position).getCon()));
intel1.setText(Integer.toString(Characters.get(position).getIntel()));
wis1.setText(Integer.toString(Characters.get(position).getWis()));
cha1.setText(Integer.toString(Characters.get(position).getCha()));
add1.setOnClickListener(e->{
    if(point>0) {
        Characters.get(position).setStr(Characters.get(position).getStr() + 1);
        str1.setText(Integer.toString(Characters.get(position).getStr()));
        point-=1;
    }
});
        add2.setOnClickListener(e->{
            if(point>0) {
                Characters.get(position).setDex(Characters.get(position).getDex() + 1);
                dex1.setText(Integer.toString(Characters.get(position).getDex()));
                point -= 1;
            }
        });
        add3.setOnClickListener(e->{
            if(point>0) {

                Characters.get(position).setCon(Characters.get(position).getCon() + 1);
                con1.setText(Integer.toString(Characters.get(position).getCon()));
                point -= 1;
            }
        });
        add4.setOnClickListener(e->{
            if(point>0) {


                Characters.get(position).setIntel(Characters.get(position).getIntel() + 1);
                intel1.setText(Integer.toString(Characters.get(position).getIntel()));
                point -= 1;
            }
        });
        add5.setOnClickListener(e->{
            if(point>0) {

                Characters.get(position).setWis(Characters.get(position).getWis() + 1);
                wis1.setText(Integer.toString(Characters.get(position).getWis()));
                point -= 1;
            }
        });
        add6.setOnClickListener(e->{
            if(point>0) {

                Characters.get(position).setCha(Characters.get(position).getCha() + 1);
                cha1.setText(Integer.toString(Characters.get(position).getCha()));
                point -= 1;
            }
        });
        sub1.setOnClickListener(e->{
            if(point==0) {

                Characters.get(position).setStr(Characters.get(position).getStr() - 1);
                str1.setText(Integer.toString(Characters.get(position).getStr()));
                point+=1;
            }
        });
        sub2.setOnClickListener(e->{
            if(point==0) {
                Characters.get(position).setDex(Characters.get(position).getDex() - 1);
                dex1.setText(Integer.toString(Characters.get(position).getDex()));
                point += 1;
            }
        });
        sub3.setOnClickListener(e->{
            if(point==0) {

                Characters.get(position).setCon(Characters.get(position).getCon() - 1);
                con1.setText(Integer.toString(Characters.get(position).getCon()));
                point += 1;
            }
        });
        sub4.setOnClickListener(e->{
            if(point==0) {

                Characters.get(position).setIntel(Characters.get(position).getIntel() - 1);
                intel1.setText(Integer.toString(Characters.get(position).getIntel()));
                point += 1;
            }
        });
        sub5.setOnClickListener(e->{
            if(point==0) {

                Characters.get(position).setWis(Characters.get(position).getWis() - 1);
                wis1.setText(Integer.toString(Characters.get(position).getWis()));
                point += 1;
            }
        });
        sub6.setOnClickListener(e->{
            if(point==0) {

                Characters.get(position).setCha(Characters.get(position).getCha() - 1);
                cha1.setText(Integer.toString(Characters.get(position).getCha()));
                point += 1;
            }
        });
    }
    void next(View v)
    {
Characters.get(position).setStrc(calculatemod(Characters.get(position).getStr()));
        Characters.get(position).setDexc(calculatemod(Characters.get(position).getDex()));
        Characters.get(position).setConc(calculatemod(Characters.get(position).getCon()));
        Characters.get(position).setIntelc(calculatemod(Characters.get(position).getIntel()));
        Characters.get(position).setWisc(calculatemod(Characters.get(position).getWis()));
        Characters.get(position).setChac(calculatemod(Characters.get(position).getCha()));
Extra_Spells.Extra_Spells(Characters.get(position));
        Characters.get(position).setAC(Characters.get(position).getAC()+Characters.get(position).getDexc());
        db.characterdao().updatechar(Characters.get(position));
        Bundle extras = new Bundle();
        Intent i = new Intent(this, Character_Sheet.class);
        extras.putInt("position", position);
        i.putExtras(extras);
        startActivity(i);

    }

    private int calculatemod(int value) {
       int calc=-6;
        for(int i =0;i<=value;i+=2)
        {
            calc++;
        }

        return calc;
    }
}