package com.example.ddcharactersheet.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.ddcharactersheet.Model.Equipment_Entity;
import com.example.ddcharactersheet.R;

import java.util.List;

import androidx.recyclerview.widget.RecyclerView;

public class Other_adapter extends RecyclerView.Adapter<Other_adapter.ViewHolder> {
        private LayoutInflater Inflater;
        private List<Equipment_Entity> list;
        private Context context;
    public Other_adapter(List<Equipment_Entity> list, Context context)
        {
            this.list=list;
            this.context=context;
            this.Inflater = LayoutInflater.from(context);
        }
        @Override
        public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = Inflater.inflate(R.layout.other_equipment, parent, false);
            return new ViewHolder(view);

        }

        @Override
        public void onBindViewHolder(ViewHolder holder, int position) {
            holder.name.setText(list.get(position).getName());
            holder.special.setText(list.get(position).getSpecial());


        }

        @Override
        public int getItemCount() {
            return list.size();
        }

        public class ViewHolder extends RecyclerView.ViewHolder {
            TextView name;
            TextView special;



            public ViewHolder(View itemView) {
                super(itemView);
                name = itemView.findViewById(R.id.name);
                special = itemView.findViewById(R.id.special);

            }


        }
}
