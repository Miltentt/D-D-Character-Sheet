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
import com.example.ddcharactersheet.RoomDB.Feats_DB;
import com.example.ddcharactersheet.Model.Feats_Entity;
import com.example.ddcharactersheet.Model.Feats_List;
import com.example.ddcharactersheet.R;

import java.util.LinkedList;
import java.util.List;

public class Feats_Recycler extends RecyclerView.Adapter<Feats_Recycler.ViewHolder> {
    private List<Feats_List> list =  new LinkedList<>();
    private Context context;
    private LayoutInflater Inflater;
    private Character_Databse db;
    private List<Character> Characters = new LinkedList();
    private Feats_DB FDB;
    private int fID;
    private int positionchar;
    private List<Feats_Entity> Feats;
    private int feats_amount;
    private TextView text;
    private List<String> Featlist = new LinkedList<>();
public Feats_Recycler(List<Feats_List> list, Context context, TextView text, int positionchar, int feats_amount)
{
    this.list=list;
    this.context=context;
    this.text=text;
    this.positionchar=positionchar;
    this.feats_amount=feats_amount;
    db = Room.databaseBuilder(context, Character_Databse.class, "Characters1")
            .allowMainThreadQueries()
            .build();
    FDB = Room.databaseBuilder(context, Feats_DB.class, "Characterss")
            .allowMainThreadQueries()
            .build();
    Characters = db.characterdao().loadAllTasks();

    Feats = FDB.feats_dao().loadAllFeats();
fID = Feats.get(positionchar).getId();
    this.Inflater = LayoutInflater.from(context);
    for(int i =0;i<Feats.get(positionchar).getFeats().size();i++) {
        Featlist.add(Feats.get(Feats.size() - 1).getFeats().get(i));
    }
}
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = Inflater.inflate(R.layout.feats_recycler,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final Feats_List objIncome = list.get(position);
        holder.check.setOnCheckedChangeListener(null);

        //if true, your checkbox will be selected, else unselected
        holder.check.setChecked(objIncome.isSelected());

        holder.name.setText(list.get(position).getName());
        holder.benefits.setText("Benefit: " + list.get(position).getBenefits());
        holder.pre.setText("Prequisit: " + list.get(position).getPrequisites());
        for(int i =0;i<Featlist.size();i++)
        {
            if(list.get(position).getName().equals(Featlist.get(i))) {
                holder.check.setChecked(true);
                holder.check.setClickable(false);
            }
        }
        if(Characters.get(positionchar).getClas().equals("monk"))
        {
            if(list.get(position).getName().equals("Stunning Fist")) {
                holder.check.setChecked(true);
                holder.check.setClickable(false);
            }
            if(list.get(position).getName().equals("Improved Unarmed Strike")) {
                holder.check.setChecked(true);
                holder.check.setClickable(false);
            }
            if(list.get(position).getName().equals("Deflect Arrows")) {
                holder.check.setChecked(true);
                holder.check.setClickable(false);
            }
        }
        if(Characters.get(positionchar).getClas().equals("ranger")) {
            if (list.get(position).getName().equals("Tracking")) {
                holder.check.setChecked(true);
                holder.check.setClickable(false);
            }
        }
            holder.check.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    objIncome.setSelected(isChecked);
                    if (feats_amount > 0) {
                    if (buttonView.isChecked() == true) {

                        Featlist.add(list.get(position).getName());
                        feats_amount-=1;
                        text.setText("Feats Avaliable: " + feats_amount);
                        list.get(holder.getAdapterPosition()).setSelected(isChecked);
                    }

                     else {
                        Featlist.remove(list.get(position).getName());
                        feats_amount+=1;
                        text.setText("Feats Avaliable: " + feats_amount);

                    }}
                     else {
                        if (buttonView.isChecked() == true) {

                            holder.check.setChecked(false);
                        }
                        else
                        {
                            Featlist.remove(list.get(position).getName());
                            feats_amount+=1;
                            text.setText("Feats Avaliable: " + feats_amount);
                        }
                    }
                }
            });



    }
    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder

    {
        TextView name;
        TextView benefits;
        TextView pre;
CheckBox check ;



        public  ViewHolder(View itemView)
        {
            super(itemView);
            name = itemView.findViewById(R.id.name);
            benefits = itemView.findViewById(R.id.benefit);
            pre = itemView.findViewById(R.id.pre);
            check =itemView.findViewById(R.id.check);

        }


    }
public void updatedatabase()
{
    FDB.feats_dao().Delete(Feats.get(positionchar));
    Feats_Entity entity = new Feats_Entity();
    entity.setFeats(Featlist);
    entity.setId(fID);
    FDB.feats_dao().Insert(entity);
    db.characterdao().FeatID(fID,Characters.get(positionchar).getId());
}
}
