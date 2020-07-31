package com.example.ddcharactersheet.Adapters;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ddcharactersheet.Model.Character;
import com.example.ddcharactersheet.R;

import java.util.List;

public class Character_adapter extends RecyclerView.Adapter<Character_adapter.myViewHolder>{
   Context context;
   List<com.example.ddcharactersheet.Model.Character> Character;
   Typeface font;
    private ItemClickListener mClickListener;


    public Character_adapter(Context context, List<Character> Character) {
        super();
        font = Typeface.createFromAsset(context.getAssets(), "fonts/Vecna.otf");
        this.context=context;
        this.Character=Character;
    }

    @Override
    public myViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(context);
        View v = inflater.inflate(R.layout.char_card,parent,false);

        return new myViewHolder(v);
    }

    @Override
    public void onBindViewHolder(myViewHolder holder, int position) {
        String classs = Character.get(position).getClas().substring(0,1).toUpperCase();
        holder.name.setText(Character.get(position).getName());
        holder.level.setText("Level " + Integer.toString(Character.get(position).getLevel()) + " " + classs + Character.get(position).getClas().substring(1));
        holder.name.setTypeface(font);
        holder.level.setTypeface(font);
switch(Character.get(position).getClas())
{

    case "monk":
    {
holder.background.setImageResource(R.drawable.monk);
        break;
    }
    case "wizard":
    {
        holder.background.setImageResource(R.drawable.wizard);
        break;
    }
    case "barbarian":
    {
        holder.background.setImageResource(R.drawable.barbarian);
        break;
    }
    case "bard": {
        holder.background.setImageResource(R.drawable.bard);
        break;
    }
    case "cleric":
    {
        holder.background.setImageResource(R.drawable.cleric);
        break;
    }
    case "druid":
    {
        holder.background.setImageResource(R.drawable.druid1);
        break;
    }
    case "paladin":
    {
        holder.background.setImageResource(R.drawable.paladin);
        break;
    }
    case "ranger":
    {
        holder.background.setImageResource(R.drawable.ranger);
        break;
    }
    case "sorcerer":
    {
        holder.background.setImageResource(R.drawable.witch);
        break;
    }
    case "rogue": {
        holder.background.setImageResource(R.drawable.rogue);
        break;
    }
    case "warrior": {
        holder.background.setImageResource(R.drawable.warrior);
        break;
    }
}
    }

    @Override
    public int getItemCount() {
        return Character.size();
    }


    public class myViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
       ImageView background;
       TextView name;
       TextView level;
        ImageButton button;



        public myViewHolder(View itemView)
        {
            super(itemView);
            background = itemView.findViewById(R.id.imageView);
            name = itemView.findViewById(R.id.Name);
            level = itemView.findViewById(R.id.level);
            button = itemView.findViewById(R.id.button);
            button.setOnClickListener(this);
        }
        @Override
        public void onClick(View view) {
            if (mClickListener != null) mClickListener.onItemClick(view, getAdapterPosition());
        }

    }
    public void setClickListener(ItemClickListener itemClickListener) {
        this.mClickListener = itemClickListener;
    }
    public interface ItemClickListener {
        void onItemClick(View view, int position);

    }
}
