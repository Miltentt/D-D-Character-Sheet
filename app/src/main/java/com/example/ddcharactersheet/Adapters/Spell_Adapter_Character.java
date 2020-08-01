package com.example.ddcharactersheet.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.ddcharactersheet.R;
import com.example.ddcharactersheet.Spells;

import java.util.LinkedList;
import java.util.List;

import androidx.recyclerview.widget.RecyclerView;

public class Spell_Adapter_Character extends RecyclerView.Adapter<Spell_Adapter_Character.ViewHolder> {
    private List<Spells> Spellsl =  new LinkedList<>();
    private Context context;
    public Spell_Adapter_Character(List<Spells> list, Context context)
    {
        this.Spellsl=list;
        this.context=context;


    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.spells_recycle_card,parent,false);

        return new ViewHolder(view);
    }


    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.name.setText(Spellsl.get(position).getName());
        holder.benefits.setText(Spellsl.get(position).getDescription());


    }
    @Override
    public int getItemCount() {
        return Spellsl.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView name;
        TextView benefits;


        public ViewHolder(View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.namee);
            benefits = itemView.findViewById(R.id.desc);

        }
    }
}
