package com.example.ddcharactersheet.Adapters;

import android.arch.persistence.room.Room;
import android.content.Context;
import android.graphics.Typeface;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ddcharactersheet.Character;
import com.example.ddcharactersheet.Character_Databse;
import com.example.ddcharactersheet.R;
import com.example.ddcharactersheet.Skill_List;

import java.util.LinkedList;
import java.util.List;

public class Skills_Adapter_Character extends RecyclerView.Adapter<Skills_Adapter_Character.ViewHolder> {
    private List<Skill_List> list = new LinkedList<>();
    private Typeface font;
    private String[] stat = {"STR", "DEX", "CON", "INT", "WIS", "CHA"};
    private int[] atribute;
    private Character_Databse db;
    private List<Character> Characters = new LinkedList();
    private int position;
    private int rank;
    private int sum;
    private int i;
    private int a;
    private ItemClickListener mClickListener;
    private LayoutInflater Inflater;
    private int char_position;


    public Skills_Adapter_Character(List<Skill_List> list, Context context, int char_position) {
        font = Typeface.createFromAsset(context.getAssets(), "fonts/Vecna.otf");
        this.list = list;

        this.char_position = char_position;
        db = Room.databaseBuilder(context, Character_Databse.class, "Characters1")
                .allowMainThreadQueries()
                .build();
        Characters = db.characterdao().loadAllTasks();
        atribute = new int[]{Characters.get(char_position).getStrc(), Characters.get(char_position).getDexc(), Characters.get(char_position).getConc(), Characters.get(char_position).getIntelc(), Characters.get(char_position).getWisc(), Characters.get(char_position).getChac()};
        this.Inflater = LayoutInflater.from(context);
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = Inflater.inflate(R.layout.skills_recycle_card, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.skill.setText(list.get(position).getName());
        for (i = 1; i <= list.get(position).getAtr(); i++) {
            holder.stat.setText(stat[i - 1]);
            holder.attr.setText(Integer.toString(atribute[i - 1]));

        }
        a = i;
        if (list.get(position).isAll() == true) {
            holder.image.setImageResource(R.drawable.blacksqare);
        } else {
            holder.image.setImageResource(R.drawable.empty);
        }
fill(holder.rank,position,holder.sum);

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView skill;
        TextView stat;
        TextView rank;
        TextView attr;
        TextView sum;
        ImageView image;



        public ViewHolder(View itemView) {
            super(itemView);
            skill = itemView.findViewById(R.id.skill);
            stat = itemView.findViewById(R.id.stat);
            rank = itemView.findViewById(R.id.rank);
            attr = itemView.findViewById(R.id.attr);
            image = itemView.findViewById(R.id.image);
            sum = itemView.findViewById(R.id.sum);

        }

        @Override
        public void onClick(View view) {
            if (mClickListener != null) mClickListener.onItemClick(view, getAdapterPosition());
        }

    }

    void setClickListener(ItemClickListener itemClickListener) {
        this.mClickListener = itemClickListener;
    }


    public interface ItemClickListener {
        void onItemClick(View view, int position);

    }

    private void fill(TextView rank, int position,TextView sum){
        int suma = 0;
        int point= 0;
        if (list.get(position).getName().equals("Bluff")) {
            rank.setText(Integer.toString(Characters.get(char_position).getBluff()));
            point = Characters.get(char_position).getBluff();
        }
        if (list.get(position).getName().equals("Move Silently")) {
            rank.setText(Integer.toString(Characters.get(char_position).getMove()));
            point = Characters.get(char_position).getMove();
        }
        if (list.get(position).getName().equals("Spellcraft")) {
            rank.setText(Integer.toString(Characters.get(char_position).getSpellcraft()));
            point = Characters.get(char_position).getSpellcraft();
        }
        if (list.get(position).getName().equals("Diplomacy")) {
            rank.setText(Integer.toString(Characters.get(char_position).getDiplo()));
            point = Characters.get(char_position).getDiplo();
        }
        if (list.get(position).getName().equals("Forgery")) {
            rank.setText(Integer.toString(Characters.get(char_position).getForgery()));
            point = Characters.get(char_position).getForgery();
        }
        if (list.get(position).getName().equals("Horsemanship")) {
            rank.setText(Integer.toString(Characters.get(char_position).getHorse()));
            point = Characters.get(char_position).getHorse();
        }
        if (list.get(position).getName().equals("Concentration")) {
            rank.setText(Integer.toString(Characters.get(char_position).getConce()));
            point = Characters.get(char_position).getConce();
        }
        if (list.get(position).getName().equals("Heal")) {
            rank.setText(Integer.toString(Characters.get(char_position).getHeal()));
            point = Characters.get(char_position).getHeal();
        }
        if (list.get(position).getName().equals("Listen")) {
            rank.setText(Integer.toString(Characters.get(char_position).getListen()));
            point = Characters.get(char_position).getListen();
        }
        if (list.get(position).getName().equals("Decipher Script")) {
            rank.setText(Integer.toString(Characters.get(char_position).getDecipher()));
            point = Characters.get(char_position).getDecipher();
        }
        if (list.get(position).getName().equals("Lockpicking")) {
            rank.setText(Integer.toString(Characters.get(char_position).getLock()));
            point = Characters.get(char_position).getLock();
        }
        if (list.get(position).getName().equals("Swimming")) {
            rank.setText(Integer.toString(Characters.get(char_position).getSwim()));
            point = Characters.get(char_position).getSwim();
        }
        if (list.get(position).getName().equals("Handle Animals")) {
            rank.setText(Integer.toString(Characters.get(char_position).getAnimal()));
            point = Characters.get(char_position).getAnimal();
        }
        if (list.get(position).getName().equals("Disguise")) {
            rank.setText(Integer.toString(Characters.get(char_position).getDisguise()));
            point = Characters.get(char_position).getDisguise();
        }
        if (list.get(position).getName().equals("Search")) {
            rank.setText(Integer.toString(Characters.get(char_position).getSearch()));
            point = Characters.get(char_position).getSearch();
        }
        if (list.get(position).getName().equals("Jump")) {
            rank.setText(Integer.toString(Characters.get(char_position).getJump()));
            point = Characters.get(char_position).getJump();
        }
        if (list.get(position).getName().equals("Observation")) {
            rank.setText(Integer.toString(Characters.get(char_position).getObs()));
            point = Characters.get(char_position).getObs();
        }
        if (list.get(position).getName().equals("Apparaise")) {
            rank.setText(Integer.toString(Characters.get(char_position).getAppa()));
            point = Characters.get(char_position).getAppa();
        }
        if (list.get(position).getName().equals("Hide")) {
            rank.setText(Integer.toString(Characters.get(char_position).getHide()));
            point = Characters.get(char_position).getHide();
        }
        if (list.get(position).getName().equals("Disable Device")) {
            rank.setText(Integer.toString(Characters.get(char_position).getDisable()));
            point = Characters.get(char_position).getDisable();
        }
        if (list.get(position).getName().equals("Use Rope")) {
            rank.setText(Integer.toString(Characters.get(char_position).getUserope()));
            point = Characters.get(char_position).getUserope();
        }
        if (list.get(position).getName().equals("Use Magic Device")) {
            rank.setText(Integer.toString(Characters.get(char_position).getUsemagic()));
            point = Characters.get(char_position).getUsemagic();
        }
        if (list.get(position).getName().equals("Arcana Knowledge")) {
            rank.setText(Integer.toString(Characters.get(char_position).getArcana()));
            point = Characters.get(char_position).getArcana();
        }
        if (list.get(position).getName().equals("Nature Knowledge")) {
            rank.setText(Integer.toString(Characters.get(char_position).getNature()));
            point = Characters.get(char_position).getNature();
        }
        if (list.get(position).getName().equals("Religion Knowledge")) {
            rank.setText(Integer.toString(Characters.get(char_position).getReligion()));
            point = Characters.get(char_position).getReligion();
        }
        if (list.get(position).getName().equals("Planes Knowledge")) {
            rank.setText(Integer.toString(Characters.get(char_position).getPlanes()));
            point = Characters.get(char_position).getPlanes();
        }
        if (list.get(position).getName().equals("Royalty Knowledge")) {
            rank.setText(Integer.toString(Characters.get(char_position).getRoyal()));
            point = Characters.get(char_position).getRoyal();
        }
        if (list.get(position).getName().equals("Climbing")) {
            rank.setText(Integer.toString(Characters.get(char_position).getClimb()));
            point = Characters.get(char_position).getClimb();
        }
        if (list.get(position).getName().equals("Sense Motive")) {
            rank.setText(Integer.toString(Characters.get(char_position).getSense()));
            point = Characters.get(char_position).getSense();
        }
        if (list.get(position).getName().equals("=Perform")) {
            rank.setText(Integer.toString(Characters.get(char_position).getPerform()));
            point = Characters.get(char_position).getPerform();
        }
        if (list.get(position).getName().equals("Escape")) {
            rank.setText(Integer.toString(Characters.get(char_position).getEscape()));
            point = Characters.get(char_position).getEscape();
        }
        if (list.get(position).getName().equals("Balance")) {
            rank.setText(Integer.toString(Characters.get(char_position).getBalance()));
            point = Characters.get(char_position).getBalance();
        }
        if (list.get(position).getName().equals("Intimidation")) {
            rank.setText(Integer.toString(Characters.get(char_position).getIntimid()));
            point = Characters.get(char_position).getIntimid();
        }
        if (list.get(position).getName().equals("Profession")) {
            rank.setText(Integer.toString(Characters.get(char_position).getProfe()));
            point = Characters.get(char_position).getProfe();
        }
        if (list.get(position).getName().equals("Gathering Information")) {
            rank.setText(Integer.toString(Characters.get(char_position).getGather()));
            point = Characters.get(char_position).getGather();
        }
        if (list.get(position).getName().equals("Pick Pocketing")) {
            rank.setText(Integer.toString(Characters.get(char_position).getPick()));
            point = Characters.get(char_position).getPick();
        }
        if (list.get(position).getName().equals("Agility")) {
            rank.setText(Integer.toString(Characters.get(char_position).getAgil()));
            point = Characters.get(char_position).getAgil();
        }
        if (list.get(position).getName().equals("Alchemy")) {
            rank.setText(Integer.toString(Characters.get(char_position).getAlch()));
            point = Characters.get(char_position).getAlch();
        }
        for (i = 1; i <= list.get(position).getAtr(); i++) {
            suma = atribute[i-1] + point;

        }


        sum.setText(Integer.toString(suma));


    }




}
