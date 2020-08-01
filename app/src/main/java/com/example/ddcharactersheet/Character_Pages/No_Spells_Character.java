package com.example.ddcharactersheet.Character_Pages;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.example.ddcharactersheet.Character_Pages.Equipment.Equipment;
import com.example.ddcharactersheet.Model.Character;
import com.example.ddcharactersheet.R;
import com.example.ddcharactersheet.RoomDB.Character_Databse;

import java.util.LinkedList;
import java.util.List;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

public class No_Spells_Character extends AppCompatActivity {
    private Character_Databse db;
    private List<Character> Characters = new LinkedList();
    private int position;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.empty_spells);
        Bundle extras = getIntent().getExtras();
        this.position = extras.getInt("position");
        db = Room.databaseBuilder(getApplicationContext(), Character_Databse.class, "Characters1")
                .allowMainThreadQueries()
                .build();
        Characters = db.characterdao().loadAllTasks();
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.layout.main_menu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id=item.getItemId();
        switch (id)
        {
            case R.id.Skills:
            {
                Bundle extras = new Bundle();
                Intent i = new Intent(this, Character_Skills.class);
                extras.putInt("position",position);
                i.putExtras(extras);
                startActivity(i);
                break;
            }
            case R.id.Feats:
            {
                Bundle extras = new Bundle();
                Intent i = new Intent(this, Feat_Character.class);
                extras.putInt("position",position);
                i.putExtras(extras);
                startActivity(i);
                break;
            }
            case R.id.Spells:
            {
                if(Characters.get(position).getClas().equals("cleric"))
                {
                    Bundle extras = new Bundle();
                    Intent i = new Intent(this, Cleric_Spells_Char.class);
                    extras.putInt("position", position);
                    i.putExtras(extras);
                    startActivity(i);
                }else {
                    if(Characters.get(position).getClas().equals("wizard") || Characters.get(position).getClas().equals("sorcerer")) {
                        Bundle extras = new Bundle();
                        Intent i = new Intent(this, Spells_Character.class);
                        extras.putInt("position", position);
                        i.putExtras(extras);
                        startActivity(i);
                    } else {
                        if (Characters.get(position).getClas().equals("paladin") || Characters.get(position).getClas().equals("ranger") || Characters.get(position).getClas().equals("bard") || Characters.get(position).getClas().equals("druid")) {
                            Bundle extras = new Bundle();
                            Intent i = new Intent(this, Spells_OtherClasses.class);
                            extras.putInt("position", position);
                            i.putExtras(extras);
                            startActivity(i);
                        } else {
                            Bundle extras = new Bundle();
                            Intent i = new Intent(this, No_Spells_Character.class);
                            extras.putInt("position", position);
                            i.putExtras(extras);
                            startActivity(i);
                        }
                    }
                }
                break;
            }
            case R.id.Equipment:
            {
                Bundle extras = new Bundle();
                Intent i = new Intent(this, Equipment.class);
                extras.putInt("position",position);
                i.putExtras(extras);
                startActivity(i);
                break;
            }
            case R.id.Stats:
            {
                Bundle extras = new Bundle();
                Intent i = new Intent(this, Character_Sheet.class);
                extras.putInt("position",position);
                i.putExtras(extras);
                startActivity(i);
                break;
            }
        }
        return super.onOptionsItemSelected(item);
    }



}
