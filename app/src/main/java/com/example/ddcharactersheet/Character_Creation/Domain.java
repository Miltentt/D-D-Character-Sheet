package com.example.ddcharactersheet.Character_Creation;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.example.ddcharactersheet.Model.Character;
import com.example.ddcharactersheet.R;
import com.example.ddcharactersheet.RoomDB.Character_Databse;

import java.util.LinkedList;
import java.util.List;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

public class Domain extends AppCompatActivity {
private int position;

    private TextView choose;
    private RadioGroup rg;
    private Character_Databse db;
    private String[] domains = {"Chaos Domain","Good Domain","Healing Domain", "Magic Domain","Protection Domain","Fire Domain","Trickery Domain","Travel Domain","Air Domain","Law Domain","Plant Domain","Strength Domain","Sun Domain","Luck Domain","Death Domain","Knowledge Domain","Water Domain","War Domain","Earth Domain","Evil Domain","Destruction Domain", "Animal Domain"};
    private List<Character> Characters = new LinkedList();
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.domain);
        getSupportActionBar().hide();

        rg = findViewById(R.id.radio);
        Bundle extras = getIntent().getExtras();
        this.position = extras.getInt("position");
        db = Room.databaseBuilder(getApplicationContext(), Character_Databse.class, "Characters1")
                .allowMainThreadQueries()
                .build();
        Characters = db.characterdao().loadAllTasks();
    }

    public void next (View view) {
        int buttonid = rg.getCheckedRadioButtonId();
        View rb = rg.findViewById(buttonid);
        int idx = rg.indexOfChild(rb);
        if(Characters.get(position).getDom1().equals(""))
        {
            db.characterdao().Dom1(domains[idx],Characters.get(position).getId());
            Bundle extras = new Bundle();
            Intent i = new Intent(this, Domain.class);
            extras.putInt("position", position);
            i.putExtras(extras);
            startActivity(i);
        }
else
        {
            db.characterdao().Dom2(domains[idx],Characters.get(position).getId());
            Bundle extras = new Bundle();
            Intent i = new Intent(this, Name.class);
            extras.putInt("position", position);
            i.putExtras(extras);
            startActivity(i);


        }





    }







}
