package com.example.ddcharactersheet.Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.ddcharactersheet.Model.Equipment_Entity;
import com.example.ddcharactersheet.R;

import java.util.List;

public class Shield_adapter extends RecyclerView.Adapter<Shield_adapter.ViewHolder> {
    private LayoutInflater Inflater;
    private List<Equipment_Entity> list;
    private Context context;
    public Shield_adapter(List<Equipment_Entity> list, Context context)
    {
        this.list=list;
        this.context=context;
        this.Inflater = LayoutInflater.from(context);
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = Inflater.inflate(R.layout.shield_recycler, parent, false);
        return new ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.name.setText(list.get(position).getName());
        holder.ac.setText(list.get(position).getAC());
        holder.special.setText(list.get(position).getSpecial());


    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView name;
        TextView ac;
        TextView special;



        public ViewHolder(View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.name);
            ac = itemView.findViewById(R.id.ac);
            special = itemView.findViewById(R.id.special);

        }


    }
}
