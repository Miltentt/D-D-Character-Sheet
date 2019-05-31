package com.example.ddcharactersheet.Adapters;

import android.arch.persistence.room.Room;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.LinkedList;
import java.util.List;

import com.example.ddcharactersheet.Character;
import com.example.ddcharactersheet.Character_Databse;
import com.example.ddcharactersheet.R;
import com.example.ddcharactersheet.Skill_List;

public class Skills_Adapter extends RecyclerView.Adapter<Skills_Adapter.ViewHolder> {
private List<Skill_List> list = new LinkedList<>();

private String[] stat= {"STR","DEX","CON","INT","WIS","CHA"};
private int[] atribute;
private Character_Databse db;
private List<Character> Characters = new LinkedList();
private int points;
private int rank;
private int sum;
private int i;
private int a;
private int positionchar;
private ItemClickListener mClickListener;
    private LayoutInflater Inflater;
    private TextView peints;


     public Skills_Adapter(List<Skill_List> list, Context context, int points, TextView peints, int positionchar)
    {

        this.list = list;
        this.points=points;
        this.peints=peints;
        this.positionchar=positionchar;
        db = Room.databaseBuilder(context, Character_Databse.class, "Characters1")
                .allowMainThreadQueries()
                .build();
        Characters = db.characterdao().loadAllTasks();
        atribute =new int[]{Characters.get(positionchar).getStrc(),Characters.get(positionchar).getDexc(),Characters.get(positionchar).getConc(),Characters.get(positionchar).getIntelc(),Characters.get(positionchar).getWisc(),Characters.get(positionchar).getChac()};
        this.Inflater = LayoutInflater.from(context);
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = Inflater.inflate(R.layout.skill_recycle,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
fill(holder.rank,position,holder.sum);
holder.skill.setText(list.get(position).getName());
for( i = 1;i<=list.get(position).getAtr();i++)
{
    holder.stat.setText(stat[i-1]);
holder.attr.setText(Integer.toString(atribute[i-1]));

}
        a=i;
if(list.get(position).isAll()==true)
{
    holder.image.setImageResource(R.drawable.blacksqare);
}
else
{
    holder.image.setImageResource(R.drawable.empty);
}
holder.addu.setOnClickListener(e->add(holder.rank,holder.sum,position,peints));
holder.substractu.setOnClickListener(e->substract(holder.rank,holder.sum,position,peints));


    }

    @Override
    public int getItemCount() {
        return list.size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder  implements View.OnClickListener

    {
        TextView skill;
        TextView stat;
        TextView rank;
        TextView attr;
        TextView sum;
        ImageView image;
        ImageView addu;
        ImageView substractu;



      public  ViewHolder(View itemView)
        {
            super(itemView);
            skill = itemView.findViewById(R.id.skill);
            stat = itemView.findViewById(R.id.stat);
            rank = itemView.findViewById(R.id.rank);
            attr = itemView.findViewById(R.id.attr);
            image= itemView.findViewById(R.id.image);
            addu = itemView.findViewById(R.id.add);
            substractu = itemView.findViewById(R.id.substract);
            sum = itemView.findViewById(R.id.sum);
            addu.setOnClickListener(this::onClick);
            substractu.setOnClickListener(this::onClick);
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




    public void add(TextView ranka, TextView suma, int position, TextView pointsu) {
       if(list.get(position).getPoints()<Characters.get(positionchar).getLevel()+3){
        if (points > 0) {
            if (list.get(position).getName().equals("Bluff")) {
                if (Characters.get(positionchar).getClas().equals(("bard")) || Characters.get(positionchar).getClas().equals(("rogue"))) {
                    points -= 1;
                    Characters.get(positionchar).setBluff(Characters.get(positionchar).getBluff()+1);
                    list.get(position).setPoints(Characters.get(positionchar).getBluff() );
                } else {
                    if (points > 1) {
                        points -= 2;
                        Characters.get(positionchar).setBluff(Characters.get(positionchar).getBluff()+1);
                        list.get(position).setPoints((Characters.get(positionchar).getBluff() ));
                    }
                }
            }
            if (list.get(position).getName().equals("Move Silently")) {
                if (Characters.get(positionchar).getClas().equals(("bard")) || Characters.get(positionchar).getClas().equals(("rogue")) || Characters.get(positionchar).getClas().equals(("monk")) || Characters.get(positionchar).getClas().equals(("ranger"))) {
                    points -= 1;
                    Characters.get(positionchar).setMove(Characters.get(positionchar).getMove()+1);
                    list.get(position).setPoints(Characters.get(positionchar).getMove() );
                } else {
                    if (points > 1) {
                        points -= 2;
                        Characters.get(positionchar).setMove(Characters.get(positionchar).getMove()+1);
                        list.get(position).setPoints(Characters.get(positionchar).getMove() );
                    }
                }
            }
            if (list.get(position).getName().equals("Spellcraft")) {
                if (Characters.get(positionchar).getClas().equals(("bard")) || Characters.get(positionchar).getClas().equals(("wizard")) || Characters.get(positionchar).getClas().equals(("cleric")) || Characters.get(positionchar).getClas().equals(("druid")) || Characters.get(positionchar).getClas().equals(("sorcerer"))) {
                    points -= 1;
                    Characters.get(positionchar).setSpellcraft(Characters.get(positionchar).getSpellcraft()+1);
                    list.get(position).setPoints(Characters.get(positionchar).getSpellcraft() );
                } else {
                    if (points > 1) {
                        points -= 2;
                        Characters.get(positionchar).setSpellcraft(Characters.get(positionchar).getSpellcraft()+1);
                        list.get(position).setPoints(Characters.get(positionchar).getSpellcraft() );
                    }
                }
            }
            if (list.get(position).getName().equals("Diplomacy")) {
                if (Characters.get(positionchar).getClas().equals(("bard")) || Characters.get(positionchar).getClas().equals(("rogue")) || Characters.get(positionchar).getClas().equals(("cleric")) || Characters.get(positionchar).getClas().equals(("druid")) || Characters.get(positionchar).getClas().equals(("monk")) || Characters.get(positionchar).getClas().equals(("paladin"))) {
                    points -= 1;
                    Characters.get(positionchar).setDiplo(Characters.get(positionchar).getDiplo()+1);
                    list.get(position).setPoints(Characters.get(positionchar).getDiplo() );
                } else {
                    if (points > 1) {
                        points -= 2;
                        Characters.get(positionchar).setDiplo(Characters.get(positionchar).getDiplo()+1);
                        list.get(position).setPoints(Characters.get(positionchar).getDiplo() );
                    }
                }
            }
            if (list.get(position).getName().equals("Forgery")) {
                if (Characters.get(positionchar).getClas().equals(("rogue"))) {
                    points -= 1;
                    Characters.get(positionchar).setForgery(Characters.get(positionchar).getForgery()+1);
                    list.get(position).setPoints(Characters.get(positionchar).getForgery() );
                } else {
                    if (points > 1) {
                        points -= 2;
                        Characters.get(positionchar).setForgery(Characters.get(positionchar).getForgery()+1);
                        list.get(position).setPoints(Characters.get(positionchar).getForgery() );
                    }
                }
            }
            if (list.get(position).getName().equals("Horsemanship")) {
                if (Characters.get(positionchar).getClas().equals(("barbarian")) || Characters.get(positionchar).getClas().equals(("paladin")) || Characters.get(positionchar).getClas().equals(("ranger")) || Characters.get(positionchar).getClas().equals(("warrior"))) {
                    points -= 1;
                    Characters.get(positionchar).setHorse(Characters.get(positionchar).getHorse()+1);
                    list.get(position).setPoints(Characters.get(positionchar).getHorse() );
                } else {
                    if (points > 1) {
                        points -= 2;
                        Characters.get(positionchar).setHorse(Characters.get(positionchar).getHorse()+1);
                        list.get(position).setPoints(Characters.get(positionchar).getHorse() );
                    }
                }
            }
            if (list.get(position).getName().equals("Concentration")) {
                if (Characters.get(positionchar).getClas().equals(("bard")) || Characters.get(positionchar).getClas().equals(("wizard")) || Characters.get(positionchar).getClas().equals(("druid")) || Characters.get(positionchar).getClas().equals(("cleric")) || Characters.get(positionchar).getClas().equals(("monk")) || Characters.get(positionchar).getClas().equals(("paladin")) || Characters.get(positionchar).getClas().equals(("ranger")) || Characters.get(positionchar).getClas().equals(("sorcerer"))) {
                    points -= 1;
                    Characters.get(positionchar).setConce(Characters.get(positionchar).getConce()+1);
                    list.get(position).setPoints(Characters.get(positionchar).getConce() );
                } else {
                    if (points > 1) {
                        points -= 2;
                        Characters.get(positionchar).setConce(Characters.get(positionchar).getConce()+1);
                        list.get(position).setPoints(Characters.get(positionchar).getConce());
                    }
                }
            }
            if (list.get(position).getName().equals("Heal")) {
                if (Characters.get(positionchar).getClas().equals(("druid")) || Characters.get(positionchar).getClas().equals(("cleric")) || Characters.get(positionchar).getClas().equals("paladin") || Characters.get(positionchar).getClas().equals("ranger")) {
                    points -= 1;
                    Characters.get(positionchar).setHeal(Characters.get(positionchar).getHeal()+1);
                    list.get(position).setPoints(Characters.get(positionchar).getHeal() );
                } else {
                    if (points > 1) {
                        points -= 2;
                        Characters.get(positionchar).setHeal(Characters.get(positionchar).getHeal()+1);
                        list.get(position).setPoints(Characters.get(positionchar).getHeal() );
                    }
                }
            }
            if (list.get(position).getName().equals("Listen")) {
                if (Characters.get(positionchar).getClas().equals("barbarian") || Characters.get(positionchar).getClas().equals("bard") || Characters.get(positionchar).getClas().equals("rogue") || Characters.get(positionchar).getClas().equals("ranger") || Characters.get(positionchar).getClas().equals("monk")) {
                    points -= 1;
                    Characters.get(positionchar).setListen(Characters.get(positionchar).getListen()+1);
                    list.get(position).setPoints(Characters.get(positionchar).getListen() );
                } else {
                    if (points > 1) {
                        points -= 2;
                        Characters.get(positionchar).setListen(Characters.get(positionchar).getListen()+1);
                        list.get(position).setPoints(Characters.get(positionchar).getListen() );
                    }
                }
            }
            if (list.get(position).getName().equals("Decipher Script")) {
                if (Characters.get(positionchar).getClas().equals("bard") || Characters.get(positionchar).getClas().equals("rogue")) {
                    points -= 1;
                    Characters.get(positionchar).setDecipher(Characters.get(positionchar).getDecipher()+1);
                    list.get(position).setPoints(Characters.get(positionchar).getDecipher() );
                } else {
                    if (points > 1) {
                        points -= 2;
                        Characters.get(positionchar).setDecipher(Characters.get(positionchar).getDecipher()+1);
                        list.get(position).setPoints(Characters.get(positionchar).getDecipher() );
                    }
                }
            }
            if (list.get(position).getName().equals("Lockpicking")) {
                if (Characters.get(positionchar).getClas().equals("rogue")) {
                    points -= 1;
                    Characters.get(positionchar).setLock(Characters.get(positionchar).getLock()+1);
                    list.get(position).setPoints(Characters.get(positionchar).getLock() );
                } else {
                    if (points > 1) {
                        points -= 2;
                        Characters.get(positionchar).setLock(Characters.get(positionchar).getLock()+1);
                        list.get(position).setPoints(Characters.get(positionchar).getLock() );
                    }
                }
            }
            if (list.get(position).getName().equals("Swimming")) {
                if (Characters.get(positionchar).getClas().equals("barbarian") || Characters.get(positionchar).getClas().equals("bard") || Characters.get(positionchar).getClas().equals("druid") || Characters.get(positionchar).getClas().equals("ranger") || Characters.get(positionchar).getClas().equals("monk") || Characters.get(positionchar).getClas().equals("rogue") || Characters.get(positionchar).getClas().equals("warrior")) {
                    points -= 1;
                    Characters.get(positionchar).setSwim(Characters.get(positionchar).getSwim()+1);
                    list.get(position).setPoints(Characters.get(positionchar).getSwim() );
                } else {
                    if (points > 1) {
                        points -= 2;
                        Characters.get(positionchar).setSwim(Characters.get(positionchar).getSwim()+1);
                        list.get(position).setPoints(Characters.get(positionchar).getSwim() );
                    }
                }
            }
            if (list.get(position).getName().equals("Handle Animals")) {
                if (Characters.get(positionchar).getClas().equals("barbarian") || Characters.get(positionchar).getClas().equals("druid") || Characters.get(positionchar).getClas().equals("ranger") || Characters.get(positionchar).getClas().equals("paladin") || Characters.get(positionchar).getClas().equals("warrior")) {
                    points -= 1;
                    Characters.get(positionchar).setAnimal(Characters.get(positionchar).getAnimal()+1);
                    list.get(position).setPoints(Characters.get(positionchar).getAnimal() );
                } else {
                    if (points > 1) {
                        points -= 2;
                        Characters.get(positionchar).setAnimal(Characters.get(positionchar).getAnimal()+1);
                        list.get(position).setPoints(Characters.get(positionchar).getAnimal() );
                    }
                }
            }
            if (list.get(position).getName().equals("Disguise")) {
                if (Characters.get(positionchar).getClas().equals("rogue")) {
                    points -= 1;
                    Characters.get(positionchar).setDisguise(Characters.get(positionchar).getDisguise()+1);
                    list.get(position).setPoints(Characters.get(positionchar).getDisguise() );
                } else {
                    if (points > 1) {
                        points -= 2;
                        Characters.get(positionchar).setDisguise(Characters.get(positionchar).getDisguise()+1);
                        list.get(position).setPoints(Characters.get(positionchar).getDisguise() );
                    }
                }
            }
            if (list.get(position).getName().equals("Search")) {
                if (Characters.get(positionchar).getClas().equals("rogue") || Characters.get(positionchar).getClas().equals("ranger")) {
                    points -= 1;
                    Characters.get(positionchar).setSearch(Characters.get(positionchar).getSearch()+1);
                    list.get(position).setPoints(Characters.get(positionchar).getSearch() );
                } else {
                    if (points > 1) {
                        points -= 2;
                        Characters.get(positionchar).setSearch(Characters.get(positionchar).getSearch()+1);
                        list.get(position).setPoints(Characters.get(positionchar).getSearch() );
                    }
                }
            }
            if (list.get(position).getName().equals("Craft")) {
                if (Characters.get(positionchar).getClas().equals("bard") || Characters.get(positionchar).getClas().equals("wizard") || Characters.get(positionchar).getClas().equals("druid") || Characters.get(positionchar).getClas().equals("cleric") || Characters.get(positionchar).getClas().equals("rogue") || Characters.get(positionchar).getClas().equals("monk") || Characters.get(positionchar).getClas().equals("ranger") || Characters.get(positionchar).getClas().equals("paladin") || Characters.get(positionchar).getClas().equals("sorcerer")) {
                    points -= 1;
                    Characters.get(positionchar).setCraft(Characters.get(positionchar).getCraft()+1);
                    list.get(position).setPoints(Characters.get(positionchar).getCraft() );
                } else {
                    if (points > 1) {
                        points -= 2;
                        Characters.get(positionchar).setCraft(Characters.get(positionchar).getCraft()+1);
                        list.get(position).setPoints(Characters.get(positionchar).getCraft() );
                    }
                }
            }
            if (list.get(position).getName().equals("Jump")) {
                if (Characters.get(positionchar).getClas().equals("bard") || Characters.get(positionchar).getClas().equals("barbarian") || Characters.get(position).getClas().equals("rogue") || Characters.get(position).getClas().equals("monk") || Characters.get(position).getClas().equals("ranger") || Characters.get(position).getClas().equals("warrior")) {
                    points -= 1;
                    Characters.get(positionchar).setJump(Characters.get(positionchar).getJump()+1);
                    list.get(position).setPoints(Characters.get(positionchar).getJump() );
                } else {
                    if (points > 1) {
                        points -= 2;
                        Characters.get(positionchar).setJump(Characters.get(positionchar).getJump()+1);
                        list.get(position).setPoints(Characters.get(positionchar).getJump() );
                    }
                }
            }
            if (list.get(position).getName().equals("Observation")) {
                if (Characters.get(positionchar).getClas().equals("rogue") || Characters.get(positionchar).getClas().equals("ranger")) {
                    points -= 1;
                    Characters.get(positionchar).setObs(Characters.get(positionchar).getObs()+1);
                    list.get(position).setPoints(Characters.get(positionchar).getObs() );
                } else {
                    if (points > 1) {
                        points -= 2;
                        Characters.get(positionchar).setObs(Characters.get(positionchar).getObs()+1);
                        list.get(position).setPoints(Characters.get(positionchar).getObs() );
                    }
                }
            }
            if (list.get(position).getName().equals("Apparaise")) {
                if (Characters.get(positionchar).getClas().equals("bard") || Characters.get(positionchar).getClas().equals("rogue")) {
                    points -= 1;
                    Characters.get(positionchar).setAppa(Characters.get(positionchar).getAppa()+1);
                    list.get(position).setPoints(Characters.get(positionchar).getAppa() );
                } else {
                    if (points > 1) {
                        points -= 2;
                        Characters.get(positionchar).setAppa(Characters.get(positionchar).getAppa()+1);
                        list.get(position).setPoints(Characters.get(positionchar).getAppa() );
                    }
                }
            }
            if (list.get(position).getName().equals("Wilderness Lore")) {
                if (Characters.get(positionchar).getClas().equals(("barbarian")) || Characters.get(positionchar).getClas().equals("druid") || Characters.get(positionchar).getClas().equals("ranger")) {
                    points -= 1;
                    Characters.get(positionchar).setWild(Characters.get(positionchar).getWild()+1);
                    list.get(position).setPoints(Characters.get(positionchar).getWild() );
                } else {
                    if (points > 1) {
                        points -= 2;
                        Characters.get(positionchar).setWild(Characters.get(positionchar).getWild()+1);
                        list.get(position).setPoints(Characters.get(positionchar).getWild() );
                    }
                }
            }
            if (list.get(position).getName().equals("Hide")) {
                if (Characters.get(positionchar).getClas().equals("bard") || Characters.get(positionchar).getClas().equals("rogue") || Characters.get(positionchar).getClas().equals("monk") || Characters.get(positionchar).getClas().equals("ranger")) {
                    points -= 1;
                    Characters.get(positionchar).setHide(Characters.get(positionchar).getHide()+1);
                    list.get(position).setPoints(Characters.get(positionchar).getHide() );
                } else {
                    if (points > 1) {
                        points -= 2;
                        Characters.get(positionchar).setHide(Characters.get(positionchar).getHide()+1);
                        list.get(position).setPoints(Characters.get(positionchar).getHide() );
                    }
                }
            }
            if (list.get(position).getName().equals("Disable Device")) {
                if (Characters.get(positionchar).getClas().equals("rogue")) {
                    points -= 1;
                    Characters.get(positionchar).setDisable(Characters.get(positionchar).getDisguise()+1);
                    list.get(position).setPoints(Characters.get(positionchar).getDisable() );
                } else {
                    if (points > 1) {
                        points -= 2;
                        Characters.get(positionchar).setDisable(Characters.get(positionchar).getDisguise()+1);
                        list.get(position).setPoints(Characters.get(positionchar).getDisable() );
                    }
                }
            }
            if (list.get(position).getName().equals("Use Rope")) {
                if (Characters.get(positionchar).getClas().equals("rogue") || Characters.get(positionchar).getClas().equals("ranger")) {
                    points -= 1;
                    Characters.get(positionchar).setUserope(Characters.get(positionchar).getUserope()+1);
                    list.get(position).setPoints(Characters.get(positionchar).getUserope() );
                } else {
                    if (points > 1) {
                        points -= 2;
                        Characters.get(positionchar).setUserope(Characters.get(positionchar).getUserope()+1);
                        list.get(position).setPoints(Characters.get(positionchar).getUserope() );
                    }
                }
            }
            if (list.get(position).getName().equals("Use Magic Device")) {
                if (Characters.get(positionchar).getClas().equals("bard") || Characters.get(positionchar).getClas().equals("rogue")) {
                    points -= 1;
                    Characters.get(positionchar).setUsemagic(Characters.get(positionchar).getUsemagic()+1);
                    list.get(position).setPoints(Characters.get(positionchar).getUsemagic() );
                } else {
                    if (points > 1) {
                        points -= 2;
                        Characters.get(positionchar).setUsemagic(Characters.get(positionchar).getUsemagic()+1);
                        list.get(position).setPoints(Characters.get(positionchar).getUsemagic() );
                    }
                }
            }
            if (list.get(position).getName().equals("Arcana Knowledge")) {
                if (Characters.get(positionchar).getClas().equals("bard") || Characters.get(positionchar).getClas().equals("wizard") || Characters.get(positionchar).getClas().equals("cleric") || Characters.get(positionchar).getClas().equals("sorcerer")) {
                    points -= 1;
                    Characters.get(positionchar).setArcana(Characters.get(positionchar).getArcana()+1);
                    list.get(position).setPoints(Characters.get(positionchar).getArcana() );
                } else {
                    if (points > 1) {
                        points -= 2;
                        Characters.get(positionchar).setArcana(Characters.get(positionchar).getArcana()+1);
                        list.get(position).setPoints(Characters.get(positionchar).getArcana() );
                    }
                }
            }
            if (list.get(position).getName().equals("Nature Knowledge")) {
                if (Characters.get(positionchar).getClas().equals("bard") || Characters.get(positionchar).getClas().equals("druid") || Characters.get(positionchar).getClas().equals("wizard") || Characters.get(positionchar).getClas().equals("ranger")) {
                    points -= 1;
                    Characters.get(positionchar).setNature(Characters.get(positionchar).getNature()+1);
                    list.get(position).setPoints(Characters.get(positionchar).getNature() );
                } else {
                    if (points > 1) {
                        points -= 2;
                        Characters.get(positionchar).setNature(Characters.get(positionchar).getNature()+1);
                        list.get(position).setPoints(Characters.get(positionchar).getNature() );
                    }
                }
            }
            if (list.get(position).getName().equals("Religion Knowledge")) {
                if (Characters.get(positionchar).getClas().equals("bard") || Characters.get(positionchar).getClas().equals("paladin") || Characters.get(positionchar).getClas().equals("cleric")) {
                    points -= 1;
                    Characters.get(positionchar).setReligion(Characters.get(positionchar).getReligion()+1);
                    list.get(position).setPoints(Characters.get(positionchar).getReligion() );
                } else {
                    if (points > 1) {
                        points -= 2;
                        Characters.get(positionchar).setReligion(Characters.get(positionchar).getReligion()+1);
                        list.get(position).setPoints(Characters.get(positionchar).getReligion() );
                    }
                }
            }
            if (list.get(position).getName().equals("Planes Knowledge")) {
                if (Characters.get(positionchar).getClas().equals("bard") || Characters.get(positionchar).getClas().equals("wizard") || Characters.get(positionchar).getClas().equals("sorcerer")) {
                    points -= 1;
                    Characters.get(positionchar).setPlanes(Characters.get(positionchar).getPlanes()+1);
                    list.get(position).setPoints(Characters.get(positionchar).getPlanes() );
                } else {
                    if (points > 1) {
                        points -= 2;
                        Characters.get(positionchar).setPlanes(Characters.get(positionchar).getPlanes()+1);
                        list.get(position).setPoints(Characters.get(positionchar).getPlanes() );
                    }
                }
            }
            if (list.get(position).getName().equals("Royalty Knowledge")) {
                if (Characters.get(positionchar).getClas().equals("paladin") || Characters.get(positionchar).getClas().equals("rogue") || Characters.get(positionchar).getClas().equals("cleric") || Characters.get(positionchar).getClas().equals("bard") || Characters.get(positionchar).getClas().equals("warrior")) {
                    points -= 1;
                    Characters.get(positionchar).setRoyal(Characters.get(positionchar).getRoyal()+1);
                    list.get(position).setPoints(Characters.get(positionchar).getRoyal() );
                } else {
                    if (points > 1) {
                        points -= 2;
                        Characters.get(positionchar).setRoyal(Characters.get(positionchar).getRoyal()+1);
                        list.get(position).setPoints(Characters.get(positionchar).getRoyal() );
                    }
                }
            }
            if (list.get(position).getName().equals("Climbing")) {
                if (Characters.get(positionchar).getClas().equals("barbarian") || Characters.get(positionchar).getClas().equals("bard") || Characters.get(positionchar).getClas().equals("rogue") || Characters.get(positionchar).getClas().equals("monk") || Characters.get(positionchar).getClas().equals("warrior") || Characters.get(positionchar).getClas().equals("ranger")) {
                    points -= 1;
                    Characters.get(positionchar).setClimb(Characters.get(positionchar).getClimb()+1);
                    list.get(position).setPoints(Characters.get(positionchar).getClimb() );
                } else {
                    if (points > 1) {
                        points -= 2;
                        Characters.get(positionchar).setClimb(Characters.get(positionchar).getClimb()+1);
                        list.get(position).setPoints(Characters.get(positionchar).getClimb() );
                    }
                }
            }
            if (list.get(position).getName().equals("Sense Motive")) {
                if (Characters.get(positionchar).getClas().equals("bard") || Characters.get(positionchar).getClas().equals("rogue")) {
                    points -= 1;
                    Characters.get(positionchar).setSense(Characters.get(positionchar).getSense()+1);
                    list.get(position).setPoints(Characters.get(positionchar).getSense() );
                } else {
                    if (points > 1) {
                        points -= 2;
                        Characters.get(positionchar).setSense(Characters.get(positionchar).getSense()+1);
                        list.get(position).setPoints(Characters.get(positionchar).getSense() );
                    }
                }
            }
            if (list.get(position).getName().equals("Perform")) {
                if (Characters.get(positionchar).getClas().equals("bard") || Characters.get(positionchar).getClas().equals("rogue") || Characters.get(positionchar).getClas().equals("monk")) {
                    points -= 1;
                    Characters.get(positionchar).setPerform(Characters.get(positionchar).getPerform()+1);
                    list.get(position).setPoints(Characters.get(positionchar).getPerform() );
                } else {
                    if (points > 1) {
                        points -= 2;
                        Characters.get(positionchar).setPerform(Characters.get(positionchar).getPerform()+1);
                        list.get(position).setPoints(Characters.get(positionchar).getPerform() );
                    }
                }

            }
            if (list.get(position).getName().equals("Escape")) {
                if (Characters.get(positionchar).getClas().equals("bard") || Characters.get(positionchar).getClas().equals("rogue") || Characters.get(positionchar).getClas().equals("monk")) {
                    points -= 1;
                    Characters.get(positionchar).setEscape(Characters.get(positionchar).getEscape()+1);
                    list.get(position).setPoints(Characters.get(positionchar).getEscape() );
                } else {
                    if (points > 1) {
                        points -= 2;
                        Characters.get(positionchar).setEscape(Characters.get(positionchar).getEscape()+1);
                        list.get(position).setPoints(Characters.get(positionchar).getPerform() );
                    }
                }
            }
            if (list.get(position).getName().equals("Balance")) {
                if (Characters.get(positionchar).getClas().equals("bard") || Characters.get(positionchar).getClas().equals("rogue") || Characters.get(positionchar).getClas().equals("monk")) {
                    points -= 1;
                    Characters.get(positionchar).setBalance(Characters.get(positionchar).getBalance()+1);
                    list.get(position).setPoints(Characters.get(positionchar).getBalance() );
                } else {
                    if (points > 1) {
                        points -= 2;
                        Characters.get(positionchar).setBalance(Characters.get(positionchar).getBalance()+1);
                        list.get(position).setPoints(Characters.get(positionchar).getBalance() );
                    }
                }
            }
            if (list.get(position).getName().equals("Intimidation")) {
                if (Characters.get(positionchar).getClas().equals("barbarian") || Characters.get(positionchar).getClas().equals("rogue")) {
                    points -= 1;
                    Characters.get(positionchar).setIntimid(Characters.get(positionchar).getIntimid()+1);
                    list.get(position).setPoints(Characters.get(positionchar).getIntimid() );
                } else {
                    if (points > 1) {
                        points -= 2;
                        Characters.get(positionchar).setIntimid(Characters.get(positionchar).getIntimid()+1);
                        list.get(position).setPoints(Characters.get(positionchar).getIntimid() );
                    }
                }
            }
            if (list.get(position).getName().equals("Profession")) {
                if (Characters.get(positionchar).getClas().equals("bard") || Characters.get(positionchar).getClas().equals("wizard") || Characters.get(positionchar).getClas().equals("druid") || Characters.get(positionchar).getClas().equals("cleric") || Characters.get(positionchar).getClas().equals("rogue") || Characters.get(positionchar).getClas().equals("monk") || Characters.get(positionchar).getClas().equals("ranger") || Characters.get(positionchar).getClas().equals("paladin") || Characters.get(positionchar).getClas().equals("sorcerer")) {
                    points -= 1;
                    Characters.get(positionchar).setProfe(Characters.get(positionchar).getProfe()+1);
                    list.get(position).setPoints(Characters.get(positionchar).getProfe() );
                } else {
                    if (points > 1) {
                        points -= 2;
                        Characters.get(positionchar).setProfe(Characters.get(positionchar).getProfe()+1);
                        list.get(position).setPoints(Characters.get(positionchar).getProfe() );
                    }
                }
            }
            if (list.get(position).getName().equals("Gathering Information")) {
                if (Characters.get(positionchar).getClas().equals(("bard")) || Characters.get(positionchar).getClas().equals("rogue")) {
                    points -= 1;
                    Characters.get(positionchar).setGather(Characters.get(positionchar).getGather()+1);
                    list.get(position).setPoints(Characters.get(positionchar).getGather() );
                } else {
                    if (points > 1) {
                        points -= 2;
                        Characters.get(positionchar).setGather(Characters.get(positionchar).getGather()+1);
                        list.get(position).setPoints(Characters.get(positionchar).getGather() );
                    }
                }
            }
            if (list.get(position).getName().equals("Pick Pocketing")) {
                if (Characters.get(positionchar).getClas().equals("bard") || Characters.get(positionchar).getClas().equals("rogue")) {
                    points -= 1;
                    Characters.get(positionchar).setPick(Characters.get(positionchar).getPick()+1);
                    list.get(position).setPoints(Characters.get(positionchar).getPick() );
                } else {
                    if (points > 1) {
                        points -= 2;
                        Characters.get(positionchar).setPick(Characters.get(positionchar).getPick()+1);
                        list.get(position).setPoints(Characters.get(positionchar).getPick() );
                    }
                }
            }
            if (list.get(position).getName().equals("Agility")) {
                if (Characters.get(positionchar).getClas().equals("bard") || Characters.get(positionchar).getClas().equals("rogue")) {
                    points -= 1;
                    Characters.get(positionchar).setAgil(Characters.get(positionchar).getAgil()+1);
                    list.get(position).setPoints(Characters.get(positionchar).getAgil() );
                } else {
                    if (points > 1) {
                        points -= 2;
                        Characters.get(positionchar).setAgil(Characters.get(positionchar).getAgil()+1);
                        list.get(position).setPoints(Characters.get(positionchar).getAgil() );
                    }
                }
            }
            if (list.get(position).getName().equals("Alchemy")) {
                if (Characters.get(positionchar).getClas().equals("bard") || Characters.get(positionchar).getClas().equals("wizard") || Characters.get(positionchar).getClas().equals("sorcerer")) {
                    points -= 1;
                    Characters.get(positionchar).setAlch(Characters.get(positionchar).getAlch()+1);
                    list.get(position).setPoints(Characters.get(positionchar).getAlch() );
                } else {
                    if (points > 1) {
                        points -= 2;
                        Characters.get(positionchar).setAlch(Characters.get(positionchar).getAlch()+1);
                        list.get(position).setPoints(Characters.get(positionchar).getAlch() );
                    }
                }
            }
            for (i = 1; i <= list.get(position).getAtr(); i++) {
                sum = atribute[i-1] + list.get(position).getPoints();

            }

            ranka.setText(Integer.toString(list.get(position).getPoints()));
            suma.setText(Integer.toString(sum));
            pointsu.setText("Avaliable points: " + Integer.toString(points));
            db.characterdao().updatechar(Characters.get(positionchar));
        }
        }
    }

    private void substract(TextView ranka, TextView suma, int position, TextView pointsu) {
        if (list.get(position).getPoints() > 0) {
            if (list.get(position).getName().equals("Bluff")) {
                if (Characters.get(positionchar).getClas().equals(("bard")) || Characters.get(positionchar).getClas().equals(("rogue"))) {
                    points += 1;
                    Characters.get(positionchar).setBluff(Characters.get(positionchar).getBluff()-1);
                    list.get(position).setPoints(Characters.get(positionchar).getBluff());
                } else {
                    points += 2;
                    Characters.get(positionchar).setBluff(Characters.get(positionchar).getBluff()-1);
                    list.get(position).setPoints(Characters.get(positionchar).getBluff());

                }
            }
            if (list.get(position).getName().equals("Move Silently")) {
                if (Characters.get(positionchar).getClas().equals(("bard")) || Characters.get(positionchar).getClas().equals(("rogue")) || Characters.get(positionchar).getClas().equals(("monk")) || Characters.get(positionchar).getClas().equals(("ranger"))) {
                    points += 1;
                    Characters.get(positionchar).setMove(Characters.get(positionchar).getMove()-1);
                    list.get(position).setPoints(Characters.get(positionchar).getMove());
                } else {
                    points += 2;
                    Characters.get(positionchar).setMove(Characters.get(positionchar).getMove()-1);
                    list.get(position).setPoints(Characters.get(positionchar).getMove());

                }
            }
            if (list.get(position).getName().equals("Spellcraft")) {
                if (Characters.get(positionchar).getClas().equals(("bard")) || Characters.get(positionchar).getClas().equals(("wizard")) || Characters.get(positionchar).getClas().equals(("cleric")) || Characters.get(positionchar).getClas().equals(("druid")) || Characters.get(positionchar).getClas().equals(("sorcerer"))) {
                    points += 1;
                    Characters.get(positionchar).setSpellcraft(Characters.get(positionchar).getSpellcraft()-1);
                    list.get(position).setPoints(Characters.get(positionchar).getSpellcraft());
                } else {

                    points += 2;
                    Characters.get(positionchar).setSpellcraft(Characters.get(positionchar).getSpellcraft()-1);
                    list.get(position).setPoints(Characters.get(positionchar).getSpellcraft());

                }
            }
            if (list.get(position).getName().equals("Diplomacy")) {
                if (Characters.get(positionchar).getClas().equals(("bard")) || Characters.get(positionchar).getClas().equals(("rogue")) || Characters.get(positionchar).getClas().equals(("cleric")) || Characters.get(positionchar).getClas().equals(("druid")) || Characters.get(positionchar).getClas().equals(("monk")) || Characters.get(positionchar).getClas().equals(("paladin"))) {
                    points += 1;
                    Characters.get(positionchar).setDiplo(Characters.get(positionchar).getDiplo()-1);
                    list.get(position).setPoints(Characters.get(positionchar).getDiplo());
                } else {

                    points += 2;
                    Characters.get(positionchar).setDiplo(Characters.get(positionchar).getDiplo()-1);
                    list.get(position).setPoints(Characters.get(positionchar).getDiplo());

                }
            }
            if (list.get(position).getName().equals("Forgery")) {
                if (Characters.get(positionchar).getClas().equals(("rogue"))) {
                    points += 1;
                    Characters.get(positionchar).setForgery(Characters.get(positionchar).getForgery()-1);
                    list.get(position).setPoints(Characters.get(positionchar).getForgery());
                } else {
                    points += 2;
                    Characters.get(positionchar).setForgery(Characters.get(positionchar).getForgery()-1);
                    list.get(position).setPoints(Characters.get(positionchar).getForgery());

                }
            }
            if (list.get(position).getName().equals("Horsemanship")) {
                if (Characters.get(positionchar).getClas().equals(("barbarian")) || Characters.get(positionchar).getClas().equals(("paladin")) || Characters.get(positionchar).getClas().equals(("ranger")) || Characters.get(positionchar).getClas().equals(("warrior"))) {
                    points += 1;
                    Characters.get(positionchar).setHorse(Characters.get(positionchar).getHorse()-1);
                    list.get(position).setPoints(Characters.get(positionchar).getHorse());
                } else {

                    points += 2;
                    Characters.get(positionchar).setHorse(Characters.get(positionchar).getHorse()-1);
                    list.get(position).setPoints(Characters.get(positionchar).getHorse());

                }
            }
            if (list.get(position).getName().equals("Concentration")) {
                if (Characters.get(positionchar).getClas().equals(("bard")) || Characters.get(positionchar).getClas().equals(("wizard")) || Characters.get(positionchar).getClas().equals(("druid")) || Characters.get(positionchar).getClas().equals(("cleric")) || Characters.get(positionchar).getClas().equals(("monk")) || Characters.get(positionchar).getClas().equals(("paladin")) || Characters.get(positionchar).getClas().equals(("ranger")) || Characters.get(positionchar).getClas().equals(("sorcerer"))) {
                    points += 1;
                    Characters.get(positionchar).setConce(Characters.get(positionchar).getConce()-1);
                    list.get(position).setPoints(Characters.get(positionchar).getConce());
                } else {

                    points += 2;
                    Characters.get(positionchar).setConce(Characters.get(positionchar).getConce()-1);
                    list.get(position).setPoints(Characters.get(positionchar).getConce());

                }

            }
            if (list.get(position).getName().equals("Heal")) {
                if (Characters.get(positionchar).getClas().equals(("druid")) || Characters.get(positionchar).getClas().equals(("cleric")) || Characters.get(positionchar).getClas().equals("paladin") || Characters.get(positionchar).getClas().equals("ranger")) {
                    points += 1;
                    Characters.get(positionchar).setHeal(Characters.get(positionchar).getHeal()-1);
                    list.get(position).setPoints(Characters.get(positionchar).getHeal());
                } else {

                    points += 2;
                    Characters.get(positionchar).setHeal(Characters.get(positionchar).getHeal()-1);
                    list.get(position).setPoints(Characters.get(positionchar).getHeal());

                }

            }
            if (list.get(position).getName().equals("Listen")) {
                if (Characters.get(positionchar).getClas().equals("barbarian") || Characters.get(positionchar).getClas().equals("bard") || Characters.get(positionchar).getClas().equals("rogue") || Characters.get(positionchar).getClas().equals("ranger") || Characters.get(positionchar).getClas().equals("monk")) {
                    points += 1;
                    Characters.get(positionchar).setListen(Characters.get(positionchar).getListen()-1);
                    list.get(position).setPoints(Characters.get(positionchar).getListen());
                } else {

                    points += 2;
                    Characters.get(positionchar).setListen(Characters.get(positionchar).getListen()-1);
                    list.get(position).setPoints(Characters.get(positionchar).getListen());

                }
            }
            if (list.get(position).getName().equals("Decipher Script")) {
                if (Characters.get(positionchar).getClas().equals("bard") || Characters.get(positionchar).getClas().equals("rogue")) {
                    points += 1;
                    Characters.get(positionchar).setDecipher(Characters.get(positionchar).getDecipher()-1);
                    list.get(position).setPoints(Characters.get(positionchar).getDecipher());
                } else {

                    points += 2;
                    Characters.get(positionchar).setDecipher(Characters.get(positionchar).getDecipher()-1);
                    list.get(position).setPoints(Characters.get(positionchar).getDecipher());

                }

            }
            if (list.get(position).getName().equals("Lockpicking")) {
                if (Characters.get(positionchar).getClas().equals("rogue")) {
                    points += 1;
                    Characters.get(positionchar).setLock(Characters.get(positionchar).getLock()-1);
                    list.get(position).setPoints(Characters.get(positionchar).getLock());
                } else {

                    points += 2;
                    Characters.get(positionchar).setLock(Characters.get(positionchar).getLock()-1);
                    list.get(position).setPoints(Characters.get(positionchar).getLock());

                }
            }
            if (list.get(position).getName().equals("Swimming")) {
                if (Characters.get(positionchar).getClas().equals("barbarian") || Characters.get(positionchar).getClas().equals("bard") || Characters.get(positionchar).getClas().equals("druid") || Characters.get(positionchar).getClas().equals("ranger") || Characters.get(positionchar).getClas().equals("monk") || Characters.get(positionchar).getClas().equals("rogue") || Characters.get(positionchar).getClas().equals("warrior")) {
                    points += 1;
                    Characters.get(positionchar).setSwim(Characters.get(positionchar).getSwim()-1);
                    list.get(position).setPoints(Characters.get(positionchar).getSwim());
                } else {

                    points += 2;
                    Characters.get(positionchar).setSwim(Characters.get(positionchar).getSwim()-1);
                    list.get(position).setPoints(Characters.get(positionchar).getSwim());

                }

            }
            if (list.get(position).getName().equals("Handle Animals")) {
                if (Characters.get(positionchar).getClas().equals("barbarian") || Characters.get(positionchar).getClas().equals("druid") || Characters.get(positionchar).getClas().equals("ranger") || Characters.get(positionchar).getClas().equals("paladin") || Characters.get(positionchar).getClas().equals("warrior")) {
                    points += 1;
                    Characters.get(positionchar).setAnimal(Characters.get(positionchar).getAnimal()-1);
                    list.get(position).setPoints(Characters.get(positionchar).getAnimal());
                } else {

                    points += 2;
                    Characters.get(positionchar).setAnimal(Characters.get(positionchar).getAnimal()-1);
                    list.get(position).setPoints(Characters.get(positionchar).getAnimal());

                }
            }
            if (list.get(position).getName().equals("Disguise")) {
                if (Characters.get(positionchar).getClas().equals("rogue")) {
                    points += 1;
                    Characters.get(positionchar).setDisguise(Characters.get(positionchar).getDisguise()-1);
                    list.get(position).setPoints(Characters.get(positionchar).getDisguise());
                } else {

                    points += 2;
                    Characters.get(positionchar).setDisguise(Characters.get(positionchar).getDisguise()-1);
                    list.get(position).setPoints(Characters.get(positionchar).getDisguise());

                }
            }
            if (list.get(position).getName().equals("Search")) {
                if (Characters.get(positionchar).getClas().equals("rogue") || Characters.get(positionchar).getClas().equals("ranger")) {
                    points += 1;
                    Characters.get(positionchar).setSearch(Characters.get(positionchar).getSearch()-1);
                    list.get(position).setPoints(Characters.get(positionchar).getSearch());
                } else {

                    points += 2;
                    Characters.get(positionchar).setSearch(Characters.get(positionchar).getSearch()-1);
                    list.get(position).setPoints(Characters.get(positionchar).getSearch());

                }
            }
            if (list.get(position).getName().equals("Craft")) {
                if (Characters.get(positionchar).getClas().equals("bard") || Characters.get(positionchar).getClas().equals("wizard") || Characters.get(positionchar).getClas().equals("druid") || Characters.get(positionchar).getClas().equals("cleric") || Characters.get(positionchar).getClas().equals("rogue") || Characters.get(positionchar).getClas().equals("monk") || Characters.get(positionchar).getClas().equals("ranger") || Characters.get(positionchar).getClas().equals("paladin") || Characters.get(positionchar).getClas().equals("sorcerer")) {
                    points += 1;
                    Characters.get(positionchar).setCraft(Characters.get(positionchar).getCraft()-1);
                    list.get(position).setPoints(Characters.get(positionchar).getCraft());
                } else {

                    points += 2;
                    Characters.get(positionchar).setCraft(Characters.get(positionchar).getCraft()-1);
                    list.get(position).setPoints(Characters.get(positionchar).getCraft());

                }
            }
            if (list.get(position).getName().equals("Jump")) {
                if (Characters.get(positionchar).getClas().equals("bard") || Characters.get(positionchar).getClas().equals("barbarian") || Characters.get(position).getClas().equals("rogue") || Characters.get(position).getClas().equals("monk") || Characters.get(position).getClas().equals("ranger") || Characters.get(position).getClas().equals("warrior")) {
                    points += 1;
                    Characters.get(positionchar).setJump(Characters.get(positionchar).getJump()-1);
                    list.get(position).setPoints(Characters.get(positionchar).getJump());
                } else {

                    points += 2;
                    Characters.get(positionchar).setJump(Characters.get(positionchar).getJump()-1);
                    list.get(position).setPoints(Characters.get(positionchar).getJump());

                }
            }
            if (list.get(position).getName().equals("Observation")) {
                if (Characters.get(positionchar).getClas().equals("rogue") || Characters.get(positionchar).getClas().equals("ranger")) {
                    points += 1;
                    Characters.get(positionchar).setObs(Characters.get(positionchar).getObs()-1);
                    list.get(position).setPoints(Characters.get(positionchar).getObs());
                } else {

                    points += 2;
                    Characters.get(positionchar).setObs(Characters.get(positionchar).getObs()-1);
                    list.get(position).setPoints(Characters.get(positionchar).getObs());

                }
            }
            if (list.get(position).getName().equals("Apparaise")) {
                if (Characters.get(positionchar).getClas().equals("bard") || Characters.get(positionchar).getClas().equals("rogue")) {
                    points += 1;
                    Characters.get(positionchar).setAppa(Characters.get(positionchar).getAppa()-1);
                    list.get(position).setPoints(Characters.get(positionchar).getAppa());
                } else {

                    points += 2;
                    Characters.get(positionchar).setAppa(Characters.get(positionchar).getAppa()-1);
                    list.get(position).setPoints(Characters.get(positionchar).getAppa());

                }
            }
            if (list.get(position).getName().equals("Wilderness Lore")) {
                if (Characters.get(positionchar).getClas().equals(("barbarian")) || Characters.get(positionchar).getClas().equals("druid") || Characters.get(positionchar).getClas().equals("ranger")) {
                    points += 1;
                    Characters.get(positionchar).setWild(Characters.get(positionchar).getWild()-1);
                    list.get(position).setPoints(Characters.get(positionchar).getWild());
                } else {

                    points += 2;
                    Characters.get(positionchar).setWild(Characters.get(positionchar).getWild()-1);
                    list.get(position).setPoints(Characters.get(positionchar).getWild());

                }
            }
            if (list.get(position).getName().equals("Hide")) {
                if (Characters.get(positionchar).getClas().equals("bard") || Characters.get(positionchar).getClas().equals("rogue") || Characters.get(positionchar).getClas().equals("monk") || Characters.get(positionchar).getClas().equals("ranger")) {
                    points += 1;
                    Characters.get(positionchar).setHide(Characters.get(positionchar).getHide()-1);
                    list.get(position).setPoints(Characters.get(positionchar).getHide());
                } else {

                    points += 2;
                    Characters.get(positionchar).setHide(Characters.get(positionchar).getHide()-1);
                    list.get(position).setPoints(Characters.get(positionchar).getHide());

                }

            }
            if (list.get(position).getName().equals("Disable Device")) {
                if (Characters.get(positionchar).getClas().equals("rogue")) {
                    points += 1;
                    Characters.get(positionchar).setDisable(Characters.get(positionchar).getDisable()-1);
                    list.get(position).setPoints(Characters.get(positionchar).getDisable());
                } else {

                    points += 2;
                    Characters.get(positionchar).setDisable(Characters.get(positionchar).getDisable()-1);
                    list.get(position).setPoints(Characters.get(positionchar).getDisable());

                }
            }
            if (list.get(position).getName().equals("Use Rope")) {
                if (Characters.get(positionchar).getClas().equals("rogue") || Characters.get(positionchar).getClas().equals("ranger")) {
                    points += 1;
                    Characters.get(positionchar).setUserope(Characters.get(positionchar).getUserope()-1);
                    list.get(position).setPoints(Characters.get(positionchar).getUserope());
                } else {

                    points += 2;
                    Characters.get(positionchar).setUserope(Characters.get(positionchar).getUserope()-1);
                    list.get(position).setPoints(Characters.get(positionchar).getUserope());

                }
            }
            if (list.get(position).getName().equals("Use Magic Device")) {
                if (Characters.get(positionchar).getClas().equals("bard") || Characters.get(positionchar).getClas().equals("rogue")) {
                    points += 1;
                    Characters.get(positionchar).setUsemagic(Characters.get(positionchar).getUsemagic()-1);
                    list.get(position).setPoints(Characters.get(positionchar).getUsemagic());
                } else {

                    points += 2;
                    Characters.get(positionchar).setUsemagic(Characters.get(positionchar).getUsemagic()-1);
                    list.get(position).setPoints(Characters.get(positionchar).getUsemagic());

                }
            }
            if (list.get(position).getName().equals("Arcana Knowledge")) {
                if (Characters.get(positionchar).getClas().equals("bard") || Characters.get(positionchar).getClas().equals("wizard") || Characters.get(positionchar).getClas().equals("cleric") || Characters.get(positionchar).getClas().equals("sorcerer")) {
                    points += 1;
                    Characters.get(positionchar).setArcana(Characters.get(positionchar).getArcana()-1);
                    list.get(position).setPoints(Characters.get(positionchar).getArcana());
                } else {

                    points += 2;
                    Characters.get(positionchar).setArcana(Characters.get(positionchar).getArcana()-1);
                    list.get(position).setPoints(Characters.get(positionchar).getArcana());

                }
            }
            if (list.get(position).getName().equals("Nature Knowledge")) {
                if (Characters.get(positionchar).getClas().equals("bard") || Characters.get(positionchar).getClas().equals("druid") || Characters.get(positionchar).getClas().equals("wizard") || Characters.get(positionchar).getClas().equals("ranger")) {
                    points += 1;
                    Characters.get(positionchar).setNature(Characters.get(positionchar).getNature()-1);
                    list.get(position).setPoints(Characters.get(positionchar).getNature());
                } else {

                    points += 2;
                    Characters.get(positionchar).setNature(Characters.get(positionchar).getNature()-1);
                    list.get(position).setPoints(Characters.get(positionchar).getNature());

                }
            }
            if (list.get(position).getName().equals("Religion Knowledge")) {
                if (Characters.get(positionchar).getClas().equals("bard") || Characters.get(positionchar).getClas().equals("paladin") || Characters.get(positionchar).getClas().equals("cleric")) {
                    points += 1;
                    Characters.get(positionchar).setReligion(Characters.get(positionchar).getReligion()-1);
                    list.get(position).setPoints(Characters.get(positionchar).getReligion());
                } else {

                    points += 2;
                    Characters.get(positionchar).setReligion(Characters.get(positionchar).getReligion()-1);
                    list.get(position).setPoints(Characters.get(positionchar).getReligion());

                }
            }
            if (list.get(position).getName().equals("Planes Knowledge")) {
                if (Characters.get(positionchar).getClas().equals("bard") || Characters.get(positionchar).getClas().equals("wizard") || Characters.get(positionchar).getClas().equals("sorcerer")) {
                    points += 1;
                    Characters.get(positionchar).setPlanes(Characters.get(positionchar).getPlanes()-1);
                    list.get(position).setPoints(Characters.get(positionchar).getPlanes());
                } else {

                    points += 2;
                    Characters.get(positionchar).setPlanes(Characters.get(positionchar).getPlanes()-1);
                    list.get(position).setPoints(Characters.get(positionchar).getPlanes());

                }
            }
            if (list.get(position).getName().equals("Royalty Knowledge")) {
                if (Characters.get(positionchar).getClas().equals("paladin") || Characters.get(positionchar).getClas().equals("rogue") || Characters.get(positionchar).getClas().equals("cleric") || Characters.get(positionchar).getClas().equals("bard") || Characters.get(positionchar).getClas().equals("warrior")) {
                    points += 1;
                    Characters.get(positionchar).setRoyal(Characters.get(positionchar).getRoyal()-1);
                    list.get(position).setPoints(Characters.get(positionchar).getRoyal());
                } else {

                    points += 2;
                    Characters.get(positionchar).setRoyal(Characters.get(positionchar).getRoyal()-1);
                    list.get(position).setPoints(Characters.get(positionchar).getRoyal());

                }
            }
            if (list.get(position).getName().equals("Climbing")) {
                if (Characters.get(positionchar).getClas().equals("barbarian") || Characters.get(positionchar).getClas().equals("bard") || Characters.get(positionchar).getClas().equals("rogue") || Characters.get(positionchar).getClas().equals("monk") || Characters.get(positionchar).getClas().equals("warrior") || Characters.get(positionchar).getClas().equals("ranger")) {
                    points += 1;
                    Characters.get(positionchar).setClimb(Characters.get(positionchar).getClimb()-1);
                    list.get(position).setPoints(Characters.get(positionchar).getClimb());
                } else {

                    points += 2;
                    Characters.get(positionchar).setClimb(Characters.get(positionchar).getClimb()-1);
                    list.get(position).setPoints(Characters.get(positionchar).getClimb());

                }
            }
            if (list.get(position).getName().equals("Sense Motive")) {
                if (Characters.get(positionchar).getClas().equals("bard") || Characters.get(positionchar).getClas().equals("rogue")) {
                    points += 1;
                    Characters.get(positionchar).setSense(Characters.get(positionchar).getSense()-1);
                    list.get(position).setPoints(Characters.get(positionchar).getSense());
                } else {

                    points += 2;
                    Characters.get(positionchar).setSense(Characters.get(positionchar).getSense()-1);
                    list.get(position).setPoints(Characters.get(positionchar).getSense());

                }
            }
            if (list.get(position).getName().equals("Perform")) {
                if (Characters.get(positionchar).getClas().equals("bard") || Characters.get(positionchar).getClas().equals("rogue") || Characters.get(positionchar).getClas().equals("monk")) {
                    points += 1;
                    Characters.get(positionchar).setPerform(Characters.get(positionchar).getPerform()-1);
                    list.get(position).setPoints(Characters.get(positionchar).getPerform());
                } else {

                    points += 2;
                    Characters.get(positionchar).setPerform(Characters.get(positionchar).getPerform()-1);
                    list.get(position).setPoints(Characters.get(positionchar).getPerform());

                }
            }
            if (list.get(position).getName().equals("Escape")) {
                if (Characters.get(positionchar).getClas().equals("bard") || Characters.get(positionchar).getClas().equals("rogue") || Characters.get(positionchar).getClas().equals("monk")) {
                    points += 1;
                    Characters.get(positionchar).setEscape(Characters.get(positionchar).getEscape()-1);
                    list.get(position).setPoints(Characters.get(positionchar).getEscape());
                } else {

                    points += 2;
                    Characters.get(positionchar).setEscape(Characters.get(positionchar).getEscape()-1);
                    list.get(position).setPoints(Characters.get(positionchar).getEscape());

                }
            }
            if (list.get(position).getName().equals("Balance")) {
                if (Characters.get(positionchar).getClas().equals("bard") || Characters.get(positionchar).getClas().equals("rogue") || Characters.get(positionchar).getClas().equals("monk")) {
                    points += 1;
                    Characters.get(positionchar).setBalance(Characters.get(positionchar).getBalance()-1);
                    list.get(position).setPoints(Characters.get(positionchar).getBalance());
                } else {

                    points += 2;
                    Characters.get(positionchar).setBalance(Characters.get(positionchar).getBalance()-1);
                    list.get(position).setPoints(Characters.get(positionchar).getBalance());

                }
            }
            if (list.get(position).getName().equals("Intimidation")) {
                if (Characters.get(positionchar).getClas().equals("barbarian") || Characters.get(positionchar).getClas().equals("rogue")) {
                    points += 1;
                    Characters.get(positionchar).setIntimid(Characters.get(positionchar).getIntimid()-1);
                    list.get(position).setPoints(Characters.get(positionchar).getIntimid());
                } else {

                    points += 2;
                    Characters.get(positionchar).setIntimid(Characters.get(positionchar).getIntimid()-1);
                    list.get(position).setPoints(Characters.get(positionchar).getIntimid());

                }
            }
            if (list.get(position).getName().equals("Profession")) {
                if (Characters.get(positionchar).getClas().equals("bard") || Characters.get(positionchar).getClas().equals("wizard") || Characters.get(positionchar).getClas().equals("druid") || Characters.get(positionchar).getClas().equals("cleric") || Characters.get(positionchar).getClas().equals("rogue") || Characters.get(positionchar).getClas().equals("monk") || Characters.get(positionchar).getClas().equals("ranger") || Characters.get(positionchar).getClas().equals("paladin") || Characters.get(positionchar).getClas().equals("sorcerer")) {
                    points += 1;
                    Characters.get(positionchar).setProfe(Characters.get(positionchar).getProfe()-1);
                    list.get(position).setPoints(Characters.get(positionchar).getProfe());
                } else {

                    points += 2;
                    Characters.get(positionchar).setProfe(Characters.get(positionchar).getProfe()-1);
                    list.get(position).setPoints(Characters.get(positionchar).getProfe());

                }
            }
            if (list.get(position).getName().equals("Gathering Information")) {
                if (Characters.get(positionchar).getClas().equals(("bard")) || Characters.get(positionchar).getClas().equals("rogue")) {
                    points += 1;
                    Characters.get(positionchar).setGather(Characters.get(positionchar).getGather()-1);
                    list.get(position).setPoints(Characters.get(positionchar).getGather());
                } else {

                    points += 2;
                    Characters.get(positionchar).setGather(Characters.get(positionchar).getGather()-1);
                    list.get(position).setPoints(Characters.get(positionchar).getGather());

                }
            }
            if (list.get(position).getName().equals("Pick Pocketing")) {
                if (Characters.get(positionchar).getClas().equals("bard") || Characters.get(positionchar).getClas().equals("rogue")) {
                    points += 1;
                    Characters.get(positionchar).setPick(Characters.get(positionchar).getPick()-1);
                    list.get(position).setPoints(Characters.get(positionchar).getPick());
                } else {

                    points += 2;
                    Characters.get(positionchar).setPick(Characters.get(positionchar).getPick()-1);
                    list.get(position).setPoints(Characters.get(positionchar).getPick());

                }
            }
            if (list.get(position).getName().equals("Agility")) {
                if (Characters.get(positionchar).getClas().equals("bard") || Characters.get(positionchar).getClas().equals("rogue")) {
                    points += 1;
                    Characters.get(positionchar).setAgil(Characters.get(positionchar).getAgil()-1);
                    list.get(position).setPoints(Characters.get(positionchar).getAgil());
                } else {

                    points += 2;
                    Characters.get(positionchar).setAgil(Characters.get(positionchar).getAgil()-1);
                    list.get(position).setPoints(Characters.get(positionchar).getAgil());

                }
            }
            if (list.get(position).getName().equals("Alchemy")) {
                if (Characters.get(positionchar).getClas().equals("bard") || Characters.get(positionchar).getClas().equals("wizard") || Characters.get(positionchar).getClas().equals("sorcerer")) {
                    points += 1;
                    Characters.get(positionchar).setAlch(Characters.get(positionchar).getAlch()-1);
                    list.get(position).setPoints(Characters.get(positionchar).getAlch());
                } else {

                    points += 2;
                    Characters.get(positionchar).setAlch(Characters.get(positionchar).getAlch()-1);
                    list.get(position).setPoints(Characters.get(positionchar).getAlch());

                }
            }
            for (i = 1; i <= list.get(position).getAtr(); i++) {
                sum = atribute[i-1] + list.get(position).getPoints();

            }

            ranka.setText(Integer.toString(list.get(position).getPoints()));
            suma.setText(Integer.toString(sum));
            pointsu.setText("Avaliable points: " +Integer.toString(points));
            db.characterdao().updatechar(Characters.get(positionchar));
        }
    }
public int points()
{
    return points;
}
    private void fill(TextView rank, int position,TextView sum){
        int suma = 0;
int point= 0;
        if (list.get(position).getName().equals("Bluff")) {
            rank.setText(Integer.toString(Characters.get(positionchar).getBluff()));
            point = Characters.get(positionchar).getBluff();
        }
        if (list.get(position).getName().equals("Move Silently")) {
            rank.setText(Integer.toString(Characters.get(positionchar).getMove()));
            point = Characters.get(positionchar).getMove();
        }
        if (list.get(position).getName().equals("Spellcraft")) {
            rank.setText(Integer.toString(Characters.get(positionchar).getSpellcraft()));
            point = Characters.get(positionchar).getSpellcraft();
        }
        if (list.get(position).getName().equals("Diplomacy")) {
            rank.setText(Integer.toString(Characters.get(positionchar).getDiplo()));
            point = Characters.get(positionchar).getDiplo();
        }
        if (list.get(position).getName().equals("Forgery")) {
            rank.setText(Integer.toString(Characters.get(positionchar).getForgery()));
            point = Characters.get(positionchar).getForgery();
        }
        if (list.get(position).getName().equals("Horsemanship")) {
            rank.setText(Integer.toString(Characters.get(positionchar).getHorse()));
            point = Characters.get(positionchar).getHorse();
        }
        if (list.get(position).getName().equals("Concentration")) {
            rank.setText(Integer.toString(Characters.get(positionchar).getConce()));
            point = Characters.get(positionchar).getConce();
        }
        if (list.get(position).getName().equals("Heal")) {
            rank.setText(Integer.toString(Characters.get(positionchar).getHeal()));
            point = Characters.get(positionchar).getHeal();
        }
        if (list.get(position).getName().equals("Listen")) {
            rank.setText(Integer.toString(Characters.get(positionchar).getListen()));
            point = Characters.get(positionchar).getListen();
        }
        if (list.get(position).getName().equals("Decipher Script")) {
            rank.setText(Integer.toString(Characters.get(positionchar).getDecipher()));
            point = Characters.get(positionchar).getDecipher();
        }
        if (list.get(position).getName().equals("Lockpicking")) {
            rank.setText(Integer.toString(Characters.get(positionchar).getLock()));
            point = Characters.get(positionchar).getLock();
        }
        if (list.get(position).getName().equals("Swimming")) {
            rank.setText(Integer.toString(Characters.get(positionchar).getSwim()));
            point = Characters.get(positionchar).getSwim();
        }
        if (list.get(position).getName().equals("Handle Animals")) {
            rank.setText(Integer.toString(Characters.get(positionchar).getAnimal()));
            point = Characters.get(positionchar).getAnimal();
        }
        if (list.get(position).getName().equals("Disguise")) {
            rank.setText(Integer.toString(Characters.get(positionchar).getDisguise()));
            point = Characters.get(positionchar).getDisguise();
        }
        if (list.get(position).getName().equals("Search")) {
            rank.setText(Integer.toString(Characters.get(positionchar).getSearch()));
            point = Characters.get(positionchar).getSearch();
        }
        if (list.get(position).getName().equals("Jump")) {
            rank.setText(Integer.toString(Characters.get(positionchar).getJump()));
            point = Characters.get(positionchar).getJump();
        }
        if (list.get(position).getName().equals("Observation")) {
            rank.setText(Integer.toString(Characters.get(positionchar).getObs()));
            point = Characters.get(positionchar).getObs();
        }
        if (list.get(position).getName().equals("Apparaise")) {
            rank.setText(Integer.toString(Characters.get(positionchar).getAppa()));
            point = Characters.get(positionchar).getAppa();
        }
        if (list.get(position).getName().equals("Hide")) {
            rank.setText(Integer.toString(Characters.get(positionchar).getHide()));
            point = Characters.get(positionchar).getHide();
        }
        if (list.get(position).getName().equals("Disable Device")) {
            rank.setText(Integer.toString(Characters.get(positionchar).getDisable()));
            point = Characters.get(positionchar).getDisable();
        }
        if (list.get(position).getName().equals("Use Rope")) {
            rank.setText(Integer.toString(Characters.get(positionchar).getUserope()));
            point = Characters.get(positionchar).getUserope();
        }
        if (list.get(position).getName().equals("Use Magic Device")) {
            rank.setText(Integer.toString(Characters.get(positionchar).getUsemagic()));
            point = Characters.get(positionchar).getUsemagic();
        }
        if (list.get(position).getName().equals("Arcana Knowledge")) {
            rank.setText(Integer.toString(Characters.get(positionchar).getArcana()));
            point = Characters.get(positionchar).getArcana();
        }
        if (list.get(position).getName().equals("Nature Knowledge")) {
            rank.setText(Integer.toString(Characters.get(positionchar).getNature()));
            point = Characters.get(positionchar).getNature();
        }
        if (list.get(position).getName().equals("Religion Knowledge")) {
            rank.setText(Integer.toString(Characters.get(positionchar).getReligion()));
            point = Characters.get(positionchar).getReligion();
        }
        if (list.get(position).getName().equals("Planes Knowledge")) {
            rank.setText(Integer.toString(Characters.get(positionchar).getPlanes()));
            point = Characters.get(positionchar).getPlanes();
        }
        if (list.get(position).getName().equals("Royalty Knowledge")) {
            rank.setText(Integer.toString(Characters.get(positionchar).getRoyal()));
            point = Characters.get(positionchar).getRoyal();
        }
        if (list.get(position).getName().equals("Climbing")) {
            rank.setText(Integer.toString(Characters.get(positionchar).getClimb()));
            point = Characters.get(positionchar).getClimb();
        }
        if (list.get(position).getName().equals("Sense Motive")) {
            rank.setText(Integer.toString(Characters.get(positionchar).getSense()));
            point = Characters.get(positionchar).getSense();
        }
        if (list.get(position).getName().equals("=Perform")) {
            rank.setText(Integer.toString(Characters.get(positionchar).getPerform()));
            point = Characters.get(positionchar).getPerform();
        }
        if (list.get(position).getName().equals("Escape")) {
            rank.setText(Integer.toString(Characters.get(positionchar).getEscape()));
            point = Characters.get(positionchar).getEscape();
        }
        if (list.get(position).getName().equals("Balance")) {
            rank.setText(Integer.toString(Characters.get(positionchar).getBalance()));
            point = Characters.get(positionchar).getBalance();
        }
        if (list.get(position).getName().equals("Intimidation")) {
            rank.setText(Integer.toString(Characters.get(positionchar).getIntimid()));
            point = Characters.get(positionchar).getIntimid();
        }
        if (list.get(position).getName().equals("Profession")) {
            rank.setText(Integer.toString(Characters.get(positionchar).getProfe()));
            point = Characters.get(positionchar).getProfe();
        }
        if (list.get(position).getName().equals("Gathering Information")) {
            rank.setText(Integer.toString(Characters.get(positionchar).getGather()));
            point = Characters.get(positionchar).getGather();
        }
        if (list.get(position).getName().equals("Pick Pocketing")) {
            rank.setText(Integer.toString(Characters.get(positionchar).getPick()));
            point = Characters.get(positionchar).getPick();
        }
        if (list.get(position).getName().equals("Agility")) {
            rank.setText(Integer.toString(Characters.get(positionchar).getAgil()));
            point = Characters.get(positionchar).getAgil();
        }
        if (list.get(position).getName().equals("Alchemy")) {
            rank.setText(Integer.toString(Characters.get(positionchar).getAlch()));
            point = Characters.get(positionchar).getAlch();
        }
        for (i = 1; i <= list.get(position).getAtr(); i++) {
            suma = atribute[i-1] + point;

        }


        sum.setText(Integer.toString(suma));


    }


}
