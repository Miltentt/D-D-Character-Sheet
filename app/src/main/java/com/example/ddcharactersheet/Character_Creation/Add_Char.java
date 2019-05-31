package com.example.ddcharactersheet.Character_Creation;

import android.arch.persistence.room.Room;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.example.ddcharactersheet.Statistics.Base_Stats;
import com.example.ddcharactersheet.Character;
import com.example.ddcharactersheet.Character_Databse;
import com.example.ddcharactersheet.R;

import java.util.LinkedList;
import java.util.List;

public class Add_Char extends AppCompatActivity {

private Typeface font;
    private List<Character> Characters = new LinkedList();
private TextView choose;
private RadioGroup rg;
private Character_Databse db;
private String[] clas={"barbarian","bard","cleric","druid","monk","paladin","ranger","rogue","sorcerer","warrior","wizard"};


    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_char);
        getSupportActionBar().hide();
        font = Typeface.createFromAsset(getAssets(), "fonts/Vecna.otf");
choose = findViewById(R.id.choose);
choose.setTypeface(font);
        rg = findViewById(R.id.radio);
        for (int i=0;i<rg.getChildCount();i++)
        {
            RadioButton a = (RadioButton)rg.getChildAt(i);
            a.setTypeface(font);

        }
        db = Room.databaseBuilder(getApplicationContext(), Character_Databse.class, "Characters1")
                .allowMainThreadQueries()
                .build();

    }

    public void xd ()
    {
        setResult(RESULT_OK);

        finish();
    }
    public void next (View view)
    { int buttonid = rg.getCheckedRadioButtonId();
    View rb = rg.findViewById(buttonid);
    int idx = rg.indexOfChild(rb);
Character character = new Character(1,"lol",clas[idx]);
db.characterdao().Insert(character);
Characters = db.characterdao().loadAllTasks();
        Intent i = new Intent(this, Add_Char_2.class);
Base_Stats base = new Base_Stats(this,Characters.get(Characters.size()-1));
        startActivity(i);

    }
}
