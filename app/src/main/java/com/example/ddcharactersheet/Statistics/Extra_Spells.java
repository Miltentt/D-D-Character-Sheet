package com.example.ddcharactersheet.Statistics;

import android.content.Context;

import com.example.ddcharactersheet.Model.Character;
import com.example.ddcharactersheet.RoomDB.Character_Databse;

import java.util.LinkedList;
import java.util.List;

public class Extra_Spells {

    public static Character Extra_Spells(Character character)
    {
        switch (character.getLevel()) {

            case 1: {
                if(character.getIntelc()>0)
                {
                    character.setSp1(character.getSp1()+1);
                }
                break;
            }
            case 3:
            {
                if(character.getLevel()>1)
                {
                    character.setSp2(character.getSp2()+1);
                }
                break;
            }
            case 5:
            {
                if(character.getLevel()>2)
                {
                    character.setSp3(character.getSp3()+1);
                }
                break;
            }
            case 7:
            {
                if(character.getLevel()>3)
                {
                    character.setSp4(character.getSp4()+1);
                }
                break;
            }
            case 9:
            {
                if(character.getLevel()>4)
                {
                    character.setSp5(character.getSp5()+1);
                    character.setSp1(character.getSp1()+1);
                }
                break;
            }
            case 11:
            {
                if(character.getLevel()>5)
                {
                    character.setSp6(character.getSp6()+1);
                    character.setSp2(character.getSp2()+1);
                }
                break;
            }
            case 13:
            {
                if(character.getLevel()>6)
                {
                    character.setSp7(character.getSp7()+1);
                    character.setSp3(character.getSp3()+1);
                }
                break;
            }


    }
        return character;
}

}