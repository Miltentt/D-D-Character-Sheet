package com.example.ddcharactersheet.Character_Creation;


import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.example.ddcharactersheet.Model.Character;
import com.example.ddcharactersheet.R;
import com.example.ddcharactersheet.Statistics.Base_Stats;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;


public class Add_Char extends Fragment {

    private Typeface font;
    private TextView choose;
    private RadioGroup radioGroup;
    private String[] clas = {"barbarian", "bard", "cleric", "druid", "monk", "paladin", "ranger", "rogue", "sorcerer", "warrior", "wizard"};
    private Character_Creation_ViewModel character_creation_viewModel;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.add_char, container, false);
        choose = view.findViewById(R.id.choose);
        font = Typeface.createFromAsset(getActivity().getAssets(), "fonts/Vecna.otf");
        radioGroup = view.findViewById(R.id.radio);
        return view;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        choose.setTypeface(font);
character_creation_viewModel = ViewModelProviders.of(getActivity()).get(Character_Creation_ViewModel.class);
        for (int i = 0; i < radioGroup.getChildCount(); i++) {
            RadioButton a = (RadioButton) radioGroup.getChildAt(i);
            a.setTypeface(font);

        }
    }





    public void next (View view)
    {
        int buttonid = radioGroup.getCheckedRadioButtonId();
    View rb = radioGroup.findViewById(buttonid);
    int idx = radioGroup.indexOfChild(rb);
Character character = new Character(1,"lol",clas[idx]);
    character_creation_viewModel.updateCharacter(Base_Stats.Stats(character));
    }
}
