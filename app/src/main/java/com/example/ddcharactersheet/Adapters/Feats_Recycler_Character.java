package com.example.ddcharactersheet.Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.ddcharactersheet.Feats_List;
import com.example.ddcharactersheet.R;

import java.util.LinkedList;
import java.util.List;

public class Feats_Recycler_Character extends RecyclerView.Adapter<Feats_Recycler_Character.ViewHolder> {
    private List<Feats_List> list =  new LinkedList<>();
    private Context context;
    private LayoutInflater Inflater;

    public Feats_Recycler_Character(List<Feats_List> list, Context context)
    {
        this.list=list;
        this.context=context;
        this.Inflater = LayoutInflater.from(context);
    }
    @Override
    public Feats_Recycler_Character.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = Inflater.inflate(R.layout.feats_recycler_card,parent,false);

        return new Feats_Recycler_Character.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(Feats_Recycler_Character.ViewHolder holder, int position) {

        holder.name.setText(list.get(position).getName());
        holder.benefits.setText("Benefit: " + list.get(position).getBenefits());
    }
    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder

    {
        TextView name;
        TextView benefits;





        public  ViewHolder(View itemView)
        {
            super(itemView);
            name = itemView.findViewById(R.id.name);
            benefits = itemView.findViewById(R.id.benefit);


        }


    }
}
