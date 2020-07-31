package com.example.ddcharactersheet.Adapters;

import android.arch.persistence.room.Room;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

import com.example.ddcharactersheet.Model.Character;
import com.example.ddcharactersheet.RoomDB.Character_Databse;
import com.example.ddcharactersheet.R;
import com.example.ddcharactersheet.Recursive.Spells_Act;
import com.example.ddcharactersheet.Spells;
import com.example.ddcharactersheet.RoomDB.Spells_Database;
import com.example.ddcharactersheet.Model.Spells_Entity;

import java.util.LinkedList;
import java.util.List;

public class Spells_Adapter extends RecyclerView.Adapter<Spells_Adapter.ViewHolder> {
    private List<Spells> Spellsl =  new LinkedList<>();
    private Context context;
    private LayoutInflater Inflater;
    private Spells_Database FDB;
    private int fID;
    private List<Spells_Entity> Feats = new LinkedList<>();
    private int feats_amount;
    private TextView text;
    private List<String> Spellslist = new LinkedList<>();
    private int points;
    private int position;
    private int tier;
    private Character_Databse db;
    private List<Character> Characters = new LinkedList();
    public Spells_Adapter(List<Spells> list, Context context, TextView text, int points,int position, int tier) {
        this.Spellsl = list;
        this.context = context;
        this.text = text;
        this.position = position;
        this.tier = tier;
        FDB = Room.databaseBuilder(context, Spells_Database.class, "Characters")
                .allowMainThreadQueries()
                .build();

        Feats = FDB.spells_dao().loadAllSpells();
        db = Room.databaseBuilder(context, Character_Databse.class, "Characters1")
                .allowMainThreadQueries()
                .build();
        Characters = db.characterdao().loadAllTasks();
        fID = Feats.get(position).getId();
        this.Inflater = LayoutInflater.from(context);
        if(Characters.get(position).getClas().equals("wizard") && Characters.get(position).getLevel()!=1)
        {
            this.points = Spells_Act.wizardpoints;
        }
        else
        {
            this.points=points;
        }
        if (Feats.size() != 0) {
            switch (tier) {
                case 0:
                {
                for (int i = 0; i < Feats.get(position).getSpell0().size(); i++) {
                    Spellslist.add(Feats.get(position).getSpell0().get(i));
                }
                break;
                }
                case 1:
                {
                    for (int i = 0; i < Feats.get(position).getSpell1().size(); i++) {
                        Spellslist.add(Feats.get(position).getSpell1().get(i));
                    }
                    break;
                }
                case 2:
                {
                    for (int i = 0; i < Feats.get(position).getSpell2().size(); i++) {
                        Spellslist.add(Feats.get(position).getSpell2().get(i));
                    }
                    break;
                }
                case 3:
                {
                    for (int i = 0; i < Feats.get(position).getSpell3().size(); i++) {
                        Spellslist.add(Feats.get(position).getSpell3().get(i));
                    }
                    break;
                }
                case 4:
                {
                    for (int i = 0; i < Feats.get(position).getSpell4().size(); i++) {
                        Spellslist.add(Feats.get(position).getSpell4().get(i));
                    }
                    break;
                }
                case 5:
                {
                    for (int i = 0; i < Feats.get(position).getSpell5().size(); i++) {
                        Spellslist.add(Feats.get(position).getSpell5().get(i));
                    }
                    break;
                }
                case 6:
                {
                    for (int i = 0; i < Feats.get(position).getSpell6().size(); i++) {
                        Spellslist.add(Feats.get(position).getSpell6().get(i));
                    }
                    break;
                }
                case 7:
                {
                    for (int i = 0; i < Feats.get(position).getSpell7().size(); i++) {
                        Spellslist.add(Feats.get(position).getSpell7().get(i));
                    }
                    break;
                }
                case 8:
                {
                    for (int i = 0; i < Feats.get(position).getSpell8().size(); i++) {
                        Spellslist.add(Feats.get(position).getSpell8().get(i));
                    }
                    break;
                }
                case 9:
                {
                    for (int i = 0; i < Feats.get(position).getSpell9().size(); i++) {
                        Spellslist.add(Feats.get(position).getSpell9().get(i));
                    }
                    break;
                }

            }
            }


        }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.spells_recycle,parent,false);
        text.setText("Avaliable points: " + points);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final Spells objIncome = Spellsl.get(position);
        holder.check.setOnCheckedChangeListener(null);
text.setText("Avaliable points: " + points);
        //if true, your checkbox will be selected, else unselected
        holder.check.setChecked(objIncome.isSelected());
        for(int i =0;i<Spellslist.size();i++)
        {
                if(Spellsl.get(position).getName().equals(Spellslist.get(i))) {
                    holder.check.setChecked(true);
                }
            }

        holder.name.setText(Spellsl.get(position).getName());
        holder.benefits.setText(Spellsl.get(position).getDescription());
        holder.check.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (points > 0) {
                    if (buttonView.isChecked() == true) {
                        objIncome.setSelected(isChecked);
                        Spellslist.add(Spellsl.get(position).getName());
                        points-=1;
text.setText("Avaliable points: " + points);
                        update();
                    }

                    else {
                        Spellslist.remove(Spellsl.get(position).getName());
                        points+=1;
                        text.setText("Avaliable points: " + points);
                        update();
                    }}
                else {
                    if (buttonView.isChecked() == true) {

                        holder.check.setChecked(false);
                    }
                    else
                    {
                        Spellslist.remove(Spellsl.get(position).getName());
                        points+=1;
                        text.setText("Avaliable points: " + points);
                        update();
                    }
                }
            }
        });

    }
    @Override
    public int getItemCount() {
        return Spellsl.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder

    {
        TextView name;
        TextView benefits;
        CheckBox check;



        public  ViewHolder(View itemView)
        {
            super(itemView);
            name = itemView.findViewById(R.id.namee);
            benefits = itemView.findViewById(R.id.desc);
            check =(CheckBox) itemView.findViewById(R.id.checky);

        }


    }
   void update()
   {
       Feats = FDB.spells_dao().loadAllSpells();
int id = Feats.get(position).getId();
Spells_Entity Spells = new Spells_Entity();
switch(tier) {
    case 0:
    {
        Spells.setSpell0(Spellslist);
        Spells.setSpell1(Feats.get(position).getSpell1());
        Spells.setSpell2(Feats.get(position).getSpell2());
        Spells.setSpell3(Feats.get(position).getSpell3());
        Spells.setSpell4(Feats.get(position).getSpell4());
        Spells.setSpell5(Feats.get(position).getSpell5());
        Spells.setSpell6(Feats.get(position).getSpell6());
        Spells.setSpell7(Feats.get(position).getSpell7());
        Spells.setSpell8(Feats.get(position).getSpell8());
        Spells.setSpell9(Feats.get(position).getSpell9());
        break;
}
    case 1:
    {
        Spells.setSpell0(Feats.get(position).getSpell0());
        Spells.setSpell1(Spellslist);
        Spells.setSpell2(Feats.get(position).getSpell2());
        Spells.setSpell3(Feats.get(position).getSpell3());
        Spells.setSpell4(Feats.get(position).getSpell4());
        Spells.setSpell5(Feats.get(position).getSpell5());
        Spells.setSpell6(Feats.get(position).getSpell6());
        Spells.setSpell7(Feats.get(position).getSpell7());
        Spells.setSpell8(Feats.get(position).getSpell8());
        Spells.setSpell9(Feats.get(position).getSpell9());
        break;
    }
    case 2:
    {
        Spells.setSpell0(Feats.get(position).getSpell0());
        Spells.setSpell1(Feats.get(position).getSpell1());
        Spells.setSpell2(Spellslist);
        Spells.setSpell3(Feats.get(position).getSpell3());
        Spells.setSpell4(Feats.get(position).getSpell4());
        Spells.setSpell5(Feats.get(position).getSpell5());
        Spells.setSpell6(Feats.get(position).getSpell6());
        Spells.setSpell7(Feats.get(position).getSpell7());
        Spells.setSpell8(Feats.get(position).getSpell8());
        Spells.setSpell9(Feats.get(position).getSpell9());
        break;
    }
    case 3:
    {
        Spells.setSpell0(Feats.get(position).getSpell0());
        Spells.setSpell1(Feats.get(position).getSpell1());
        Spells.setSpell2(Feats.get(position).getSpell2());
        Spells.setSpell3(Spellslist);
        Spells.setSpell4(Feats.get(position).getSpell4());
        Spells.setSpell5(Feats.get(position).getSpell5());
        Spells.setSpell6(Feats.get(position).getSpell6());
        Spells.setSpell7(Feats.get(position).getSpell7());
        Spells.setSpell8(Feats.get(position).getSpell8());
        Spells.setSpell9(Feats.get(position).getSpell9());
        break;
    }
    case 4:
    {
        Spells.setSpell0(Feats.get(position).getSpell0());
        Spells.setSpell1(Feats.get(position).getSpell1());
        Spells.setSpell2(Feats.get(position).getSpell2());
        Spells.setSpell3(Feats.get(position).getSpell4());
        Spells.setSpell4(Spellslist);
        Spells.setSpell5(Feats.get(position).getSpell5());
        Spells.setSpell6(Feats.get(position).getSpell6());
        Spells.setSpell7(Feats.get(position).getSpell7());
        Spells.setSpell8(Feats.get(position).getSpell8());
        Spells.setSpell9(Feats.get(position).getSpell9());
        break;
    }
    case 5:
    {
        Spells.setSpell0(Feats.get(position).getSpell0());
        Spells.setSpell1(Feats.get(position).getSpell1());
        Spells.setSpell2(Feats.get(position).getSpell2());
        Spells.setSpell3(Feats.get(position).getSpell4());
        Spells.setSpell4(Feats.get(position).getSpell4());
        Spells.setSpell5(Spellslist);
        Spells.setSpell6(Feats.get(position).getSpell6());
        Spells.setSpell7(Feats.get(position).getSpell7());
        Spells.setSpell8(Feats.get(position).getSpell8());
        Spells.setSpell9(Feats.get(position).getSpell9());
        break;
    }
    case 6:
    {
        Spells.setSpell0(Feats.get(position).getSpell0());
        Spells.setSpell1(Feats.get(position).getSpell1());
        Spells.setSpell2(Feats.get(position).getSpell2());
        Spells.setSpell3(Feats.get(position).getSpell4());
        Spells.setSpell4(Feats.get(position).getSpell4());
        Spells.setSpell5(Feats.get(position).getSpell5());
        Spells.setSpell6(Spellslist);
        Spells.setSpell7(Feats.get(position).getSpell7());
        Spells.setSpell8(Feats.get(position).getSpell8());
        Spells.setSpell9(Feats.get(position).getSpell9());
        break;
    }
    case 7:
    {
        Spells.setSpell0(Feats.get(position).getSpell0());
        Spells.setSpell1(Feats.get(position).getSpell1());
        Spells.setSpell2(Feats.get(position).getSpell2());
        Spells.setSpell3(Feats.get(position).getSpell4());
        Spells.setSpell4(Feats.get(position).getSpell4());
        Spells.setSpell5(Feats.get(position).getSpell5());
        Spells.setSpell6(Feats.get(position).getSpell6());
        Spells.setSpell7(Spellslist);
        Spells.setSpell8(Feats.get(position).getSpell8());
        Spells.setSpell9(Feats.get(position).getSpell9());
        break;
    }
    case 8:
    {
        Spells.setSpell0(Feats.get(position).getSpell0());
        Spells.setSpell1(Feats.get(position).getSpell1());
        Spells.setSpell2(Feats.get(position).getSpell2());
        Spells.setSpell3(Feats.get(position).getSpell4());
        Spells.setSpell4(Feats.get(position).getSpell4());
        Spells.setSpell5(Feats.get(position).getSpell5());
        Spells.setSpell6(Feats.get(position).getSpell6());
        Spells.setSpell7(Feats.get(position).getSpell7());
        Spells.setSpell8(Spellslist);
        Spells.setSpell9(Feats.get(position).getSpell9());
        break;
    }
    case 9:
    {
        Spells.setSpell0(Feats.get(position).getSpell0());
        Spells.setSpell1(Feats.get(position).getSpell1());
        Spells.setSpell2(Feats.get(position).getSpell2());
        Spells.setSpell3(Feats.get(position).getSpell4());
        Spells.setSpell4(Feats.get(position).getSpell4());
        Spells.setSpell5(Feats.get(position).getSpell5());
        Spells.setSpell6(Feats.get(position).getSpell6());
        Spells.setSpell7(Feats.get(position).getSpell7());
        Spells.setSpell8(Feats.get(position).getSpell8());
        Spells.setSpell9(Spellslist);
        break;
    }
}
Spells.setId(id);
FDB.spells_dao().Delete(Feats.get(position));
FDB.spells_dao().Insert(Spells);
db.characterdao().SpellID(id,Characters.get(position).getId());

   }

}

