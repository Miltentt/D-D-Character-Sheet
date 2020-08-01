package com.example.ddcharactersheet.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;

import com.example.ddcharactersheet.R;
import com.example.ddcharactersheet.Spells;

import java.util.LinkedList;
import java.util.List;

import androidx.recyclerview.widget.RecyclerView;

public class Adapter_Rec extends RecyclerView.Adapter<Adapter_Rec.MyViewHolder> {
private List<Spells> list = new LinkedList<>();
Context context;

public Adapter_Rec(List<Spells> list, Context context)
{
    this.context=context;
    this.list=list;
}

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v;
        v = LayoutInflater.from(context).inflate(R.layout.spells_recycle,parent,false);
        MyViewHolder vholder = new MyViewHolder(v);
    return vholder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.check.setOnCheckedChangeListener(null);
        holder.name.setText(list.get(position).getName());
        holder.benefits.setText(list.get(position).getDescription());




    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder
    {
        TextView name;
        TextView benefits;

        CheckBox check ;
        public MyViewHolder(View item)
        { super(item);
            name = item.findViewById(R.id.namee);
            benefits = item.findViewById(R.id.desc);
            check =item.findViewById(R.id.check);
        }





    }
}
