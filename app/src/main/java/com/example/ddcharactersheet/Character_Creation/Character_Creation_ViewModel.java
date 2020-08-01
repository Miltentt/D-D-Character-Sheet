package com.example.ddcharactersheet.Character_Creation;


import com.example.ddcharactersheet.Model.Character;

import androidx.lifecycle.ViewModel;


public class Character_Creation_ViewModel extends ViewModel {
private Character character;
    public void updateCharacter(Character character)
    {
        this.character=character;
    }
    public Character returnCharacter()
    {
        return character;
    }
}
