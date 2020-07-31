package com.example.ddcharactersheet.Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.ddcharactersheet.R;

import java.util.LinkedList;
import java.util.List;

public class ClassRacial_adapter extends RecyclerView.Adapter<ClassRacial_adapter.ViewHolder> {
    private List<String> list =  new LinkedList<>();
    private List<String> list1 =  new LinkedList<>();
    private Context context;
    private LayoutInflater Inflater;

    public ClassRacial_adapter(List<String> list,List<String> list1, Context context)
    {
        this.list=list;
        this.list1=list1;
        this.context=context;
        this.Inflater = LayoutInflater.from(context);
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = Inflater.inflate(R.layout.feats_recycler_card,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        holder.name.setText(list.get(position));
        holder.benefits.setText( list1.get(position));
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
