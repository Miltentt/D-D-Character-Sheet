package com.example.ddcharactersheet;

import android.arch.persistence.room.Room;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;

import com.example.ddcharactersheet.Adapters.Character_adapter;
import com.example.ddcharactersheet.Character_Creation.Add_Char;
import com.example.ddcharactersheet.Character_Pages.Character_Sheet;

import java.util.LinkedList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements Character_adapter.ItemClickListener {
private List<Character> Characters = new LinkedList();
private Character_adapter adapter;
private RecyclerView recycler;
private LinearLayout linear;
private Character_Databse db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        db = Room.databaseBuilder(getApplicationContext(), Character_Databse.class, "Characters1")
                .allowMainThreadQueries()
                .build();
       Characters = db.characterdao().loadAllTasks();

        linear = (LinearLayout) findViewById(R.id.linear);
        recycler = (RecyclerView) findViewById(R.id.recycler);
        recycler.setLayoutManager(new LinearLayoutManager(this));
        adapter = new Character_adapter(this, Characters);
        adapter.setClickListener(this::onItemClick);
        recycler.setAdapter(adapter);


    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.layout.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
       int id=item.getItemId();
        switch (id)
        {
            case R.id.Add:
            {
                Intent i = new Intent(this, Add_Char.class);
                startActivityForResult(i, 1);
                break;
            }

        }
        return super.onOptionsItemSelected(item);
    }


    @Override
    public void onItemClick(View view, int position) {
        Bundle extras = new Bundle();
        Intent i = new Intent(this, Character_Sheet.class);
        extras.putInt("position",position);
        i.putExtras(extras);
        startActivity(i);

    }
}
