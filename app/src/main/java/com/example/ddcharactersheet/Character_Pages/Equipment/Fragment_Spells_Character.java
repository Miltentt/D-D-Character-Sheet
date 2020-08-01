package com.example.ddcharactersheet.Character_Pages.Equipment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ddcharactersheet.Adapters.Spell_Adapter_Character;
import com.example.ddcharactersheet.R;
import com.example.ddcharactersheet.Spells;

import java.util.LinkedList;
import java.util.List;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class Fragment_Spells_Character extends Fragment {
    View v;
    private RecyclerView recycler;
    Spell_Adapter_Character adapter;
    private List<Spells> list = new LinkedList<>();
    public Fragment_Spells_Character(List<Spells> list)
    {
        this.list=list;

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.frag_spells_char, container, false);
        recycler =(RecyclerView) v.findViewById(R.id.frag_recycler);
        adapter = new Spell_Adapter_Character(list, getContext());
        recycler.setLayoutManager(new LinearLayoutManager(getActivity()));
        recycler.setAdapter(adapter);
        return v;
    }
}
