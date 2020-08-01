package com.example.ddcharactersheet.Character_Creation;


import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;

import com.example.ddcharactersheet.Model.Character;
import com.example.ddcharactersheet.R;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;


public class Add_Char_2 extends Fragment {
    private Character character;
    private RadioGroup rg;
    private Character_Creation_ViewModel character_creation_viewModel;
    String races[] = {"Dwarf","Human","Elf","Gnome","Half-Elf","Half-Orc","Halfling","Tiefling","Orog","Fey'ri","Fire Genasi"};

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.race, container, false);
        rg = view.findViewById(R.id.radio);
        return view;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
character_creation_viewModel = ViewModelProviders.of(this).get(Character_Creation_ViewModel.class);
    }

    public void next(View view)
    {
        int buttonid = rg.getCheckedRadioButtonId();
        View rb = rg.findViewById(buttonid);
        int idx = rg.indexOfChild(rb);
character=character_creation_viewModel.returnCharacter();
      character.setRace(races[idx]);
      character_creation_viewModel.updateCharacter(character);

    }
}
