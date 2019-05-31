package com.example.ddcharactersheet.Spells_Fragments;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.ddcharactersheet.R;
import com.example.ddcharactersheet.Spells;
import com.example.ddcharactersheet.Adapters.Spells_Adapter;

import java.util.LinkedList;
import java.util.List;

public class Fragment1 extends Fragment {
    View v;
    private RecyclerView recycler;
    Spells_Adapter adapter;
    TextView text;
    private List<Spells> list = new LinkedList<>();
    int points;
    int position;
    int tier;
public Fragment1(List<Spells> list,int point, int position, int tier)
{
    this.list=list;

    this.points=point;
    this.position=position;
    this.tier=tier;
}

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.frag1, container, false);
        text = v.findViewById(R.id.points);
        text.setText("Avaliable points: " + Integer.toString(points));
        recycler =(RecyclerView) v.findViewById(R.id.frag_recycler);
        adapter = new Spells_Adapter(list, getContext(),text,points,position,tier);
        recycler.setLayoutManager(new LinearLayoutManager(getActivity()));
        recycler.setAdapter(adapter);
        return v;
    }

}
