package com.example.ddcharactersheet.Character_Creation;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.example.ddcharactersheet.Repository.Repository;
import com.example.ddcharactersheet.Statistics.Base_Stats;
import com.example.ddcharactersheet.Model.Character;
import com.example.ddcharactersheet.RoomDB.Character_Databse;
import com.example.ddcharactersheet.R;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

public class Add_Char extends AppCompatActivity {

private Typeface font;
private TextView choose;
private RadioGroup radioGroup;
private String[] clas={"barbarian","bard","cleric","druid","monk","paladin","ranger","rogue","sorcerer","warrior","wizard"};


    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_char);
        getSupportActionBar().hide();
        font = Typeface.createFromAsset(getAssets(), "fonts/Vecna.otf");
choose = findViewById(R.id.choose);
choose.setTypeface(font);
        radioGroup = findViewById(R.id.radio);
        for (int i=0;i<radioGroup.getChildCount();i++)
        {
            RadioButton a = (RadioButton)radioGroup.getChildAt(i);
            a.setTypeface(font);

        }
    }




    public void next (View view)
    {
        int buttonid = radioGroup.getCheckedRadioButtonId();
    View rb = radioGroup.findViewById(buttonid);
    int idx = radioGroup.indexOfChild(rb);
Character character = new Character(1,"lol",clas[idx]);
        Base_Stats base = new Base_Stats(this,character);

        Intent i = new Intent(this, Add_Char_2.class);
        i.putExtra("character", (Serializable)character);
        startActivity(i);

    }
}
