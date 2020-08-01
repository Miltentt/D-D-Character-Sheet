package com.example.ddcharactersheet.Character_Pages.Equipment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.example.ddcharactersheet.Model.Character;
import com.example.ddcharactersheet.R;
import com.example.ddcharactersheet.RoomDB.Character_Databse;
import com.example.ddcharactersheet.RoomDB.EQ_Database;

import java.util.LinkedList;
import java.util.List;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

public class EQ_Type extends AppCompatActivity {
    private RadioGroup rg;
    private RadioButton weapon;
    private RadioButton shield;
    private RadioButton armor;
    private RadioButton other;
    private int position;
    private Character_Databse db;
    private List<Character> Characters = new LinkedList();
    private EQ_Database EQDB;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eq_type);
        weapon = findViewById(R.id.weapon);
        shield = findViewById(R.id.shield);
        armor = findViewById(R.id.armor);
        other = findViewById(R.id.other);
        db = Room.databaseBuilder(getApplicationContext(), Character_Databse.class, "Characters1")
                .allowMainThreadQueries()
                .build();
        Characters = db.characterdao().loadAllTasks();
        Bundle extras = getIntent().getExtras();
        this.position = extras.getInt("position");
        EQDB = Room.databaseBuilder(getApplicationContext(), EQ_Database.class, "Charactersss")
                .allowMainThreadQueries()
                .build();


    }

    void next(View v) {
        if (weapon.isChecked() == true) {
            Bundle extras = new Bundle();
            Intent i = new Intent(this, Add_Weapon.class);
            extras.putInt("position", position);
            i.putExtras(extras);
            startActivity(i);
        }
        if (shield.isChecked() == true) {
            Bundle extras = new Bundle();
            Intent i = new Intent(this, Add_Shield.class);
            extras.putInt("position", position);
            i.putExtras(extras);
            startActivity(i);
        }
        if (armor.isChecked() == true) {
            Bundle extras = new Bundle();
            Intent i = new Intent(this, Add_Armor.class);
            extras.putInt("position", position);
            i.putExtras(extras);
            startActivity(i);
        }
        if (other.isChecked() == true) {
            Bundle extras = new Bundle();
            Intent i = new Intent(this, Add_Other.class);
            extras.putInt("position", position);
            i.putExtras(extras);
            startActivity(i);
        }


    }
}
