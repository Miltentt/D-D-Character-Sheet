package com.example.ddcharactersheet.Statistics;


import android.content.Context;

import com.example.ddcharactersheet.Model.Character;
import com.example.ddcharactersheet.Repository.Repository;
import com.example.ddcharactersheet.RoomDB.Character_Databse;

import java.util.LinkedList;
import java.util.List;

public class  Base_Stats {
    private Character character;
    public Base_Stats(Context context, Character character) {


        switch (character.getClas()) {
            case "barbarian": {
                switch(character.getLevel())
                {
                    case 1: {


                        character.setHp(12);
                        character.setBAB("+1");
                        character.setReflex(0);
                        character.setFort(2);
                        character.setWill(0);
                        character.setAC(10);
                        character.setSp0(0);
                        character.setSp1(0);
                        character.setSp2(0);
                        character.setSp3(0);
                        character.setSp4(0);
                        character.setSp5(0);
                        character.setSp6(0);
                        character.setSp7(0);
                        character.setSp8(0);
                        character.setSp9(0);
                        break;
                    }
                    case 2: {
                        character.setBAB("+2");
                        character.setFort(3);
                        break;
                    }
                    case 3: {
                        character.setBAB("+3");
                        character.setReflex(1);
                        character.setWill(1);
                        break;
                    }
                    case 4: {
                        character.setBAB("+4");
                        character.setFort(4);
                        break;
                    }
                    case 5: {
                        character.setBAB("+5");
                        break;
                    }
                    case 6: {
                        character.setBAB("+6/+1");
                        character.setFort(5);
                        character.setReflex(2);
                        character.setWill(2);
                        break;
                    }
                    case 7: {
                        character.setBAB("+7/+2");
                        break;
                    }
                    case 8: {
                        character.setBAB("+8/+3");
                        character.setFort(6);
                        break;
                    }
                    case 9: {
                        character.setBAB("+9/+4");
                        character.setReflex(3);
                        character.setWill(3);
                        break;
                    }
                    case 10: {
                        character.setBAB("+10/+5");
                        character.setFort(7);
                        break;
                    }
                    case 11: {
                        character.setBAB("+11/+6/+1");
                        break;
                    }
                    case 12: {
                        character.setBAB("+12/+7/+2");
                        character.setFort(8);
                        character.setReflex(4);
                        character.setWill(4);
                        break;
                    }
                    case 13: {
                        character.setBAB("+13/+8/+3");
                        break;
                    }
                    case 14: {
                        character.setBAB("+14/+9/+4");
                        character.setFort(9);
                        break;
                    }
                    case 15: {
                        character.setBAB("+15/+9/+5");
                        character.setReflex(5);
                        character.setWill(5);
                        break;
                    }
                    case 16: {
                        character.setBAB("+16/+11/+6/+1");
                        character.setFort(10);
                        break;
                    }
                    case 17: {
                        character.setBAB("+17/+12/+7/+2");
                        break;
                    }
                    case 18: {
                        character.setBAB("+18/+13/+8/+3");
                        character.setReflex(6);
                        character.setWill(6);
                        character.setFort(11);
                        break;
                    }
                    case 19: {
                        character.setBAB("+19/+14/+9/+4");
                        break;
                    }
                    case 20: {
                        character.setBAB("+20/+15/+10/+5");
                        character.setFort(12);
                        break;
                    }




                }

break;
            }
            case "bard":
            {
                switch(character.getLevel()) {
                    case 1: {


                        character.setHp(6);
                        character.setBAB("+0");
                        character.setReflex(2);
                        character.setFort(0);
                        character.setWill(2);
                        character.setAC(10);
                        character.setSp0(2);
                        character.setSp1(0);
                        character.setSp2(0);
                        character.setSp3(0);
                        character.setSp4(0);
                        character.setSp5(0);
                        character.setSp6(0);
                        character.setSp7(0);
                        character.setSp8(0);
                        character.setSp9(0);
                        break;
                    }
                    case 2: {
                        character.setBAB("+1");
                        character.setReflex(3);
                        character.setWill(3);
                        character.setSp0(3);
                        break;
                    }
                    case 3: {
                        character.setBAB("+2");
                        character.setFort(1);
                        character.setSp1(1);
                        break;
                    }
                    case 4: {
                        character.setBAB("+3");
                        character.setReflex(4);
                        character.setWill(4);
                        character.setSp1(2);
                        break;
                    }
                    case 5: {
                        character.setSp2(1);
                        character.setSp1(3);
                        break;
                    }
                    case 6: {
                        character.setBAB("+4");
                        character.setReflex(5);
                        character.setWill(5);
                        character.setFort(2);
                        character.setSp2(2);
                        break;
                    }
                    case 7: {
                        character.setBAB("+5");
                        break;
                    }
                    case 8: {
                        character.setBAB("+6/+1");
                        character.setReflex(6);
                        character.setWill(6);
                        character.setSp3(1);
                        character.setSp2(3);
                        break;
                    }
                    case 9: {
                        character.setFort(3);
                        character.setSp3(2);
                        break;
                    }
                    case 10: {
                        character.setBAB("+7/+2");
                        character.setReflex(7);
                        character.setWill(7);
                        break;
                    }
                    case 11: {
                        character.setBAB("+8/+3");
                        character.setSp3(3);
                        character.setSp4(1);
                        break;
                    }
                    case 12: {
                        character.setBAB("+9/+4");
                        character.setReflex(8);
                        character.setWill(8);
                        character.setFort(4);
                        character.setSp4(2);
                        break;
                    }
                    case 13: {

                        break;
                    }
                    case 14: {
                        character.setBAB("+10/+5");
                        character.setReflex(9);
                        character.setWill(9);
                        character.setSp0(4);
                        character.setSp4(3);
                        character.setSp5(1);
                        break;
                    }
                    case 15: {
                        character.setBAB("+11/+6/+1");
                        character.setFort(5);
                        character.setSp1(4);
                        character.setSp5(2);
                        break;
                    }
                    case 16: {
                        character.setBAB("+12/+7/+2");
                        character.setReflex(10);
                        character.setWill(10);
                        character.setSp2(4);
                        break;
                    }
                    case 17: {

                        character.setSp3(4);
                        character.setSp6(1);
                        character.setSp5(3);
                        break;
                    }
                    case 18: {
                        character.setBAB("+13/+8/+3");
                        character.setReflex(11);
                        character.setWill(11);
                        character.setFort(6);
                        character.setSp4(4);
                        character.setSp6(2);

                        break;
                    }
                    case 19: {
                        character.setBAB("+14/+9/+4");
                        character.setSp6(3);
                        character.setSp5(4);
                        break;
                    }
                    case 20: {
                        character.setBAB("+15/+10/+5");
                        character.setSp6(4);
                        character.setReflex(12);
                        character.setWill(12);
                        break;
                    }
                }

                break;
            }
            case "cleric":
            {
                switch(character.getLevel()) {
                    case 1: {
                        character.setHp(8);
                        character.setBAB("+0");
                        character.setReflex(0);
                        character.setFort(2);
                        character.setWill(2);
                        character.setAC(10);
                        character.setSp0(3);
                        character.setSp1(1);
                        character.setSp2(0);
                        character.setSp3(0);
                        character.setSp4(0);
                        character.setSp5(0);
                        character.setSp6(0);
                        character.setSp7(0);
                        character.setSp8(0);
                        character.setSp9(0);


                        break;
                    }
                    case 2:
                    {
                        character.setBAB("+1");
                        character.setFort(3);
                        character.setWill(3);
                        character.setSp0(4);
                        character.setSp1(2);
                        break;
                    }
                    case 3:
                    {
                        character.setBAB("+2");
                        character.setReflex(1);
                        character.setSp2(2);
                        break;
                    }
                    case 4:
                    {
                        character.setBAB("+3");
                        character.setFort(4);
                        character.setWill(4);
                        character.setSp0(5);
                        character.setSp1(3);
                        character.setSp2(2);
                        break;
                    }
                    case 5:
                    {
                        character.setSp3(1);
                        break;
                    }
                    case 6:
                    {
                        character.setBAB("+4");
                        character.setFort(5);
                        character.setWill(5);
                        character.setReflex(2);
                        character.setSp3(2);
                        break;
                    }
                    case 7:
                    {
                        character.setBAB("+5");

                        character.setSp0(6);
                        character.setSp1(4);
                        character.setSp4(1);
                        break;
                    }
                    case 8:
                    {
                        character.setBAB("+6/+1");
                        character.setFort(6);
                        character.setWill(6);
                        character.setSp3(3);
                        character.setSp4(2);
                        break;
                    }
                    case 9:
                    {
                        character.setBAB("+6/+1");
                        character.setReflex(3);
                        character.setSp2(4);
                        character.setSp5(1);
                        break;
                    }
                    case 10:
                    {
                        character.setBAB("+7/+2");
                        character.setFort(7);
                        character.setWill(7);
                        character.setSp4(3);
                        character.setSp5(2);
                        break;
                    }
                    case 11:
                    {
                        character.setBAB("+8/+3");
                        character.setSp1(5);
                        character.setSp3(4);
                        character.setSp6(1);
                        break;
                    }
                    case 12:
                    {
                        character.setBAB("+9/+4");
                        character.setFort(8);
                        character.setWill(8);
                        character.setReflex(4);
                        character.setSp5(3);
                        character.setSp6(2);
                        break;
                    }
                    case 13:
                    {

                        character.setSp2(5);
                        character.setSp4(4);
                        character.setSp7(1);
                        break;
                    }
                    case 14:
                    {
                        character.setBAB("+10/+5");
                        character.setFort(9);
                        character.setWill(9);
                        character.setSp7(2);
                        character.setSp6(3);
                        break;
                    }
                    case 15:
                    {
                        character.setBAB("+11/+6/+1");
                        character.setReflex(5);
                        character.setSp5(4);
                        character.setSp8(1);
                        break;
                    }
                    case 16:
                    {
                        character.setBAB("+12/+7/+2");
                        character.setFort(10);
                        character.setWill(10);
                        character.setSp7(3);
                        character.setSp8(2);
                        break;
                    }
                    case 17:
                    {

                        character.setSp4(5);
                        character.setSp6(4);
                        character.setSp9(1);
                        break;
                    }
                    case 18:
                    {
                        character.setBAB("+13/+8/+3");
                        character.setFort(11);
                        character.setWill(11);
                        character.setReflex(6);
                        character.setSp8(3);
                        character.setSp9(2);
                        break;
                    }
                    case 19:
                    {
                        character.setBAB("+14/+9/+4");
                        character.setSp5(5);
                        character.setSp7(4);
                        character.setSp9(3);
                        break;
                    }
                    case 20:
                    {
                        character.setBAB("+15/+10/+5");
                        character.setFort(12);
                        character.setWill(12);
                        character.setSp8(4);
                        character.setSp9(4);
                        break;
                    }
                    }


                break;
            }
            case "druid":
            {
                switch(character.getLevel()) {
                    case 1: {
                        character.setHp(8);
                        character.setBAB("+0");
                        character.setReflex(0);
                        character.setFort(2);
                        character.setWill(2);
                        character.setAC(10);
                        character.setSp0(3);
                        character.setSp1(1);
                        character.setSp2(0);
                        character.setSp3(0);
                        character.setSp4(0);
                        character.setSp5(0);
                        character.setSp6(0);
                        character.setSp7(0);
                        character.setSp8(0);
                        character.setSp9(0);


                        break;
                    }
                    case 2:
                    {
                        character.setBAB("+1");
                        character.setFort(3);
                        character.setWill(3);
                        character.setSp0(4);
                        character.setSp1(2);
                        break;
                    }
                    case 3:
                    {
                        character.setBAB("+2");
                        character.setReflex(1);
                        character.setSp2(2);
                        break;
                    }
                    case 4:
                    {
                        character.setBAB("+3");
                        character.setFort(4);
                        character.setWill(4);
                        character.setSp0(5);
                        character.setSp1(3);
                        character.setSp2(2);
                        break;
                    }
                    case 5:
                    {
                        character.setSp3(1);
                        break;
                    }
                    case 6:
                    {
                        character.setBAB("+4");
                        character.setFort(5);
                        character.setWill(5);
                        character.setReflex(2);
                        character.setSp3(2);
                        break;
                    }
                    case 7:
                    {
                        character.setBAB("+5");

                        character.setSp0(6);
                        character.setSp1(4);
                        character.setSp4(1);
                        break;
                    }
                    case 8:
                    {
                        character.setBAB("+6/+1");
                        character.setFort(6);
                        character.setWill(6);
                        character.setSp3(3);
                        character.setSp4(2);
                        break;
                    }
                    case 9:
                    {
                        character.setBAB("+6/+1");
                        character.setReflex(3);
                        character.setSp2(4);
                        character.setSp5(1);
                        break;
                    }
                    case 10:
                    {
                        character.setBAB("+7/+2");
                        character.setFort(7);
                        character.setWill(7);
                        character.setSp4(3);
                        character.setSp5(2);
                        break;
                    }
                    case 11:
                    {
                        character.setBAB("+8/+3");
                        character.setSp1(5);
                        character.setSp3(4);
                        character.setSp6(1);
                        break;
                    }
                    case 12:
                    {
                        character.setBAB("+9/+4");
                        character.setFort(8);
                        character.setWill(8);
                        character.setReflex(4);
                        character.setSp5(3);
                        character.setSp6(2);
                        break;
                    }
                    case 13:
                    {

                        character.setSp2(5);
                        character.setSp4(4);
                        character.setSp7(1);
                        break;
                    }
                    case 14:
                    {
                        character.setBAB("+10/+5");
                        character.setFort(9);
                        character.setWill(9);
                        character.setSp7(2);
                        character.setSp6(3);
                        break;
                    }
                    case 15:
                    {
                        character.setBAB("+11/+6/+1");
                        character.setReflex(5);
                        character.setSp5(4);
                        character.setSp8(1);
                        break;
                    }
                    case 16:
                    {
                        character.setBAB("+12/+7/+2");
                        character.setFort(10);
                        character.setWill(10);
                        character.setSp7(3);
                        character.setSp8(2);
                        break;
                    }
                    case 17:
                    {

                        character.setSp4(5);
                        character.setSp6(4);
                        character.setSp9(1);
                        break;
                    }
                    case 18:
                    {
                        character.setBAB("+13/+8/+3");
                        character.setFort(11);
                        character.setWill(11);
                        character.setReflex(6);
                        character.setSp8(3);
                        character.setSp9(2);
                        break;
                    }
                    case 19:
                    {
                        character.setBAB("+14/+9/+4");
                        character.setSp5(5);
                        character.setSp7(4);
                        character.setSp9(3);
                        break;
                    }
                    case 20:
                    {
                        character.setBAB("+15/+10/+5");
                        character.setFort(12);
                        character.setWill(12);
                        character.setSp8(4);
                        character.setSp9(4);
                        break;
                    }
                }
break;
            }
            case "rogue":
            { switch(character.getLevel()) {
                case 1: {
                    character.setHp(6);
                    character.setBAB("+0");
                    character.setReflex(2);
                    character.setAC(10);
                    character.setSp0(0);
                    character.setSp1(0);
                    character.setSp2(0);
                    character.setSp3(0);
                    character.setSp4(0);
                    character.setSp5(0);
                    character.setSp6(0);
                    character.setSp7(0);
                    character.setSp8(0);
                    character.setSp9(0);


                    break;
                }
                case 2:
                {
                    character.setBAB("+1");
                    character.setReflex(3);

                    break;
                }
                case 3:
                {
                    character.setBAB("+2");
                    character.setFort(1);
                    character.setWill(1);
                    break;
                }
                case 4:
                {
                    character.setBAB("+3");
                    character.setReflex(4);
                    break;
                }
                case 5:
                {
                    break;
                }
                case 6:
                {
                    character.setBAB("+4");
                    character.setFort(2);
                    character.setWill(2);
                    character.setReflex(5);
                    break;
                }
                case 7:
                {
                    character.setBAB("+5");
                    break;
                }
                case 8:
                {
                    character.setBAB("+6/+1");
                    character.setReflex(6);
                    break;
                }
                case 9:
                {
                    character.setFort(3);
                    character.setWill(3);
                    break;
                }
                case 10:
                {
                    character.setBAB("+7/+2");
                    character.setReflex(7);
                    break;
                }
                case 11:
                {
                    character.setBAB("+8/+3");
                    break;
                }
                case 12:
                {
                    character.setBAB("+9/+4");
                    character.setFort(4);
                    character.setWill(4);
                    character.setReflex(8);
                    break;
                }
                case 13:
                {
                    break;
                }
                case 14:
                {
                    character.setBAB("+10/+5");
                    character.setReflex(9);
                    break;
                }
                case 15:
                {
                    character.setBAB("+11/+6/+1");
                    character.setFort(5);
                    character.setWill(5);
                    break;
                }
                case 16:
                {
                    character.setBAB("+12/+7/+2");
                    character.setReflex(10);
                    break;
                }
                case 17:
                {

                    break;
                }
                case 18:
                {
                    character.setBAB("+13/+8/+3");
                    character.setFort(6);
                    character.setWill(6);
                    character.setReflex(11);
                    break;
                }
                case 19:
                {
                    character.setBAB("+14/+9/+4");
                    break;
                }
                case 20:
                {
                    character.setBAB("+15/+10/+5");
                    character.setReflex(12);


                    break;
                }
            }



break;
            }
            case "monk":
            {
                switch(character.getLevel()) {
                    case 1: {
                        character.setHp(8);
                        character.setBAB("+0");
                        character.setReflex(2);
                        character.setWill(2);
                        character.setFort(2);
                        character.setAC(10);
                        character.setSp0(0);
                        character.setSp1(0);
                        character.setSp2(0);
                        character.setSp3(0);
                        character.setSp4(0);
                        character.setSp5(0);
                        character.setSp6(0);
                        character.setSp7(0);
                        character.setSp8(0);
                        character.setSp9(0);


                        break;
                    }
                    case 2:
                    {
                        character.setBAB("+1");
                        character.setReflex(3);
                        character.setWill(3);
                        character.setFort(3);

                        break;
                    }
                    case 3:
                    {
                        character.setBAB("+2");

                        break;
                    }
                    case 4:
                    {
                        character.setBAB("+3");
                        character.setReflex(4);
                        character.setWill(4);
                        character.setFort(4);
                        break;
                    }
                    case 5:
                    {
                        break;
                    }
                    case 6:
                    {
                        character.setBAB("+4/+1");
                        character.setReflex(5);
                        character.setWill(5);
                        character.setFort(5);
                        break;
                    }
                    case 7:
                    {
                        character.setBAB("+5/+2");
                        break;
                    }
                    case 8:
                    {
                        character.setBAB("+6/+3");
                        character.setReflex(6);
                        character.setWill(6);
                        character.setFort(6);
                        break;
                    }
                    case 9:
                    {

                        break;
                    }
                    case 10:
                    {
                        character.setBAB("+7/+4/+1");
                        character.setReflex(7);
                        character.setWill(7);
                        character.setFort(7);
                        break;
                    }
                    case 11:
                    {
                        character.setBAB("+8/+5/+2");
                        break;
                    }
                    case 12:
                    {
                        character.setBAB("+9/+6/+3");
                        character.setReflex(8);
                        character.setWill(8);
                        character.setFort(8);
                        break;
                    }
                    case 13:
                    {
                        break;
                    }
                    case 14:
                    {
                        character.setBAB("+10/+7/+4/+1");
                        character.setReflex(9);
                        character.setWill(9);
                        character.setFort(9);
                        break;
                    }
                    case 15:
                    {
                        character.setBAB("+11/+8/+5/+2");
                        break;
                    }
                    case 16:
                    {
                        character.setBAB("+12/+9/+6/+3");
                        character.setReflex(10);
                        character.setWill(10);
                        character.setFort(10);
                        break;
                    }
                    case 17:
                    {

                        break;
                    }
                    case 18:
                    {
                        character.setBAB("+13/+10/+7/+4/+1");
                        character.setReflex(11);
                        character.setWill(11);
                        character.setFort(11);
                        break;
                    }
                    case 19:
                    {
                        character.setBAB("+14/+11/+8/+5/+2");
                        break;
                    }
                    case 20:
                    {
                        character.setBAB("+15/+12/+9/+6/+3");
                        character.setReflex(12);
                        character.setWill(12);
                        character.setFort(12);


                        break;
                    }
                }
                break;
            }
            case "paladin":
            {
                switch(character.getLevel())
                {
                    case 1: {


                        character.setHp(10);
                        character.setBAB("+1");
                        character.setReflex(0);
                        character.setFort(2);
                        character.setWill(0);
                        character.setAC(10);
                        character.setSp0(0);
                        character.setSp1(0);
                        character.setSp2(0);
                        character.setSp3(0);
                        character.setSp4(0);
                        character.setSp5(0);
                        character.setSp6(0);
                        character.setSp7(0);
                        character.setSp8(0);
                        character.setSp9(0);
                        break;
                    }
                    case 2: {
                        character.setBAB("+2");
                        character.setFort(3);
                        break;
                    }
                    case 3: {
                        character.setBAB("+3");
                        character.setReflex(1);
                        character.setWill(1);
                        break;
                    }
                    case 4: {
                        character.setBAB("+4");
                        character.setFort(4);
                        break;
                    }
                    case 5: {
                        character.setBAB("+5");
                        break;
                    }
                    case 6: {
                        character.setBAB("+6/+1");
                        character.setFort(5);
                        character.setReflex(2);
                        character.setWill(2);
                        character.setSp1(1);
                        break;
                    }
                    case 7: {
                        character.setBAB("+7/+2");
                        break;
                    }
                    case 8: {
                        character.setBAB("+8/+3");
                        character.setFort(6);
                        break;
                    }
                    case 9: {
                        character.setBAB("+9/+4");
                        character.setReflex(3);
                        character.setWill(3);
                        break;
                    }
                    case 10: {
                        character.setBAB("+10/+5");
                        character.setFort(7);
                        character.setSp2(1);
                        break;
                    }
                    case 11: {
                        character.setBAB("+11/+6/+1");
                        break;
                    }
                    case 12: {
                        character.setBAB("+12/+7/+2");
                        character.setFort(8);
                        character.setReflex(4);
                        character.setWill(4);
                        character.setSp3(1);
                        break;
                    }
                    case 13: {
                        character.setBAB("+13/+8/+3");
                        break;
                    }
                    case 14: {
                        character.setBAB("+14/+9/+4");
                        character.setFort(9);
                        character.setSp1(2);
                        break;
                    }
                    case 15: {
                        character.setBAB("+15/+9/+5");
                        character.setReflex(5);
                        character.setWill(5);
                        character.setSp4(1);
                        break;
                    }
                    case 16: {
                        character.setBAB("+16/+11/+6/+1");
                        character.setFort(10);
                        character.setSp2(2);
                        break;
                    }
                    case 17: {
                        character.setBAB("+17/+12/+7/+2");
                        character.setSp3(2);
                        break;
                    }
                    case 18: {
                        character.setBAB("+18/+13/+8/+3");
                        character.setReflex(6);
                        character.setWill(6);
                        character.setFort(11);
                        character.setSp1(3);
                        break;
                    }
                    case 19: {
                        character.setBAB("+19/+14/+9/+4");
                        character.setSp2(3);
                        character.setSp3(3);
                        character.setSp4(2);
                        break;
                    }
                    case 20: {
                        character.setBAB("+20/+15/+10/+5");
                        character.setFort(12);
                        character.setSp4(3);
                        break;
                    }




                }



                break;
            }
            case "ranger":
            {
                switch(character.getLevel())
                {
                    case 1: {


                        character.setHp(10);
                        character.setBAB("+1");
                        character.setReflex(0);
                        character.setFort(2);
                        character.setWill(0);
                        character.setAC(10);
                        character.setSp0(0);
                        character.setSp1(0);
                        character.setSp2(0);
                        character.setSp3(0);
                        character.setSp4(0);
                        character.setSp5(0);
                        character.setSp6(0);
                        character.setSp7(0);
                        character.setSp8(0);
                        character.setSp9(0);
                        break;
                    }
                    case 2: {
                        character.setBAB("+2");
                        character.setFort(3);
                        break;
                    }
                    case 3: {
                        character.setBAB("+3");
                        character.setReflex(1);
                        character.setWill(1);
                        break;
                    }
                    case 4: {
                        character.setBAB("+4");
                        character.setFort(4);
                        break;
                    }
                    case 5: {
                        character.setBAB("+5");
                        break;
                    }
                    case 6: {
                        character.setBAB("+6/+1");
                        character.setFort(5);
                        character.setReflex(2);
                        character.setWill(2);
                        character.setSp1(1);
                        break;
                    }
                    case 7: {
                        character.setBAB("+7/+2");
                        break;
                    }
                    case 8: {
                        character.setBAB("+8/+3");
                        character.setFort(6);
                        break;
                    }
                    case 9: {
                        character.setBAB("+9/+4");
                        character.setReflex(3);
                        character.setWill(3);
                        break;
                    }
                    case 10: {
                        character.setBAB("+10/+5");
                        character.setFort(7);
                        character.setSp2(1);
                        break;
                    }
                    case 11: {
                        character.setBAB("+11/+6/+1");
                        break;
                    }
                    case 12: {
                        character.setBAB("+12/+7/+2");
                        character.setFort(8);
                        character.setReflex(4);
                        character.setWill(4);
                        character.setSp3(1);
                        break;
                    }
                    case 13: {
                        character.setBAB("+13/+8/+3");
                        break;
                    }
                    case 14: {
                        character.setBAB("+14/+9/+4");
                        character.setFort(9);
                        character.setSp1(2);
                        break;
                    }
                    case 15: {
                        character.setBAB("+15/+9/+5");
                        character.setReflex(5);
                        character.setWill(5);
                        character.setSp4(1);
                        break;
                    }
                    case 16: {
                        character.setBAB("+16/+11/+6/+1");
                        character.setFort(10);
                        character.setSp2(2);
                        break;
                    }
                    case 17: {
                        character.setBAB("+17/+12/+7/+2");
                        character.setSp3(2);
                        break;
                    }
                    case 18: {
                        character.setBAB("+18/+13/+8/+3");
                        character.setReflex(6);
                        character.setWill(6);
                        character.setFort(11);
                        character.setSp1(3);
                        break;
                    }
                    case 19: {
                        character.setBAB("+19/+14/+9/+4");
                        character.setSp2(3);
                        character.setSp3(3);
                        character.setSp4(2);
                        break;
                    }
                    case 20: {
                        character.setBAB("+20/+15/+10/+5");
                        character.setFort(12);
                        character.setSp4(3);
                        break;
                    }




                }
                break;
            }
            case "warrior":
            { switch(character.getLevel())
            {
                case 1: {


                    character.setHp(10);
                    character.setBAB("+1");
                    character.setReflex(0);
                    character.setFort(2);
                    character.setWill(0);
                    character.setAC(10);
                    character.setSp0(0);
                    character.setSp1(0);
                    character.setSp2(0);
                    character.setSp3(0);
                    character.setSp4(0);
                    character.setSp5(0);
                    character.setSp6(0);
                    character.setSp7(0);
                    character.setSp8(0);
                    character.setSp9(0);
                    break;
                }
                case 2: {
                    character.setBAB("+2");
                    character.setFort(3);
                    break;
                }
                case 3: {
                    character.setBAB("+3");
                    character.setReflex(1);
                    character.setWill(1);
                    break;
                }
                case 4: {
                    character.setBAB("+4");
                    character.setFort(4);
                    break;
                }
                case 5: {
                    character.setBAB("+5");
                    break;
                }
                case 6: {
                    character.setBAB("+6/+1");
                    character.setFort(5);
                    character.setReflex(2);
                    character.setWill(2);
                    break;
                }
                case 7: {
                    character.setBAB("+7/+2");
                    break;
                }
                case 8: {
                    character.setBAB("+8/+3");
                    character.setFort(6);
                    break;
                }
                case 9: {
                    character.setBAB("+9/+4");
                    character.setReflex(3);
                    character.setWill(3);
                    break;
                }
                case 10: {
                    character.setBAB("+10/+5");
                    character.setFort(7);
                    break;
                }
                case 11: {
                    character.setBAB("+11/+6/+1");
                    break;
                }
                case 12: {
                    character.setBAB("+12/+7/+2");
                    character.setFort(8);
                    character.setReflex(4);
                    character.setWill(4);
                    break;
                }
                case 13: {
                    character.setBAB("+13/+8/+3");
                    break;
                }
                case 14: {
                    character.setBAB("+14/+9/+4");
                    character.setFort(9);
                    break;
                }
                case 15: {
                    character.setBAB("+15/+9/+5");
                    character.setReflex(5);
                    character.setWill(5);
                    break;
                }
                case 16: {
                    character.setBAB("+16/+11/+6/+1");
                    character.setFort(10);
                    break;
                }
                case 17: {
                    character.setBAB("+17/+12/+7/+2");
                    break;
                }
                case 18: {
                    character.setBAB("+18/+13/+8/+3");
                    character.setReflex(6);
                    character.setWill(6);
                    character.setFort(11);
                    break;
                }
                case 19: {
                    character.setBAB("+19/+14/+9/+4");
                    break;
                }
                case 20: {
                    character.setBAB("+20/+15/+10/+5");
                    character.setFort(12);
                    break;
                }




            }
                break;
            }
            case "sorcerer" : {

                    switch (character.getLevel()) {
                        case 1: {


                            character.setHp(4);
                            character.setBAB("+0");
                            character.setReflex(0);
                            character.setFort(0);
                            character.setWill(2);
                            character.setAC(10);
                            character.setSp0(5);
                            character.setSp1(3);
                            character.setSp2(0);
                            character.setSp3(0);
                            character.setSp4(0);
                            character.setSp5(0);
                            character.setSp6(0);
                            character.setSp7(0);
                            character.setSp8(0);
                            character.setSp9(0);
                            break;
                        }
                        case 2: {
                            character.setBAB("+1");
                            character.setWill(3);
                            character.setSp0(6);
                            character.setSp1(4);
                            break;
                        }
                        case 3: {

                            character.setReflex(1);
                            character.setFort(1);
                            character.setSp1(5);
                            break;
                        }
                        case 4: {
                            character.setBAB("+2");
                            character.setWill(4);
                            character.setSp1(6);
                            character.setSp2(3);
                            break;
                        }
                        case 5: {
                            character.setSp2(4);
                            break;
                        }
                        case 6: {
                            character.setBAB("+3");
                            character.setFort(2);
                            character.setReflex(2);
                            character.setWill(5);
                            character.setSp2(5);
                            character.setSp3(3);
                            break;
                        }
                        case 7: {
                            character.setSp2(6);
                            character.setSp3(4);
                            break;
                        }
                        case 8: {
                            character.setBAB("4");
                            character.setWill(6);
                            character.setSp4(3);
                            character.setSp3(5);
                            break;
                        }
                        case 9: {
                            character.setReflex(3);
                            character.setFort(3);
                            character.setSp4(4);
                            character.setSp3(6);
                            break;
                        }
                        case 10: {
                            character.setBAB("+5");
                            character.setWill(7);
                            character.setSp4(5);
                            character.setSp5(3);
                            break;
                        }
                        case 11: {
                            character.setSp4(6);
                            character.setSp5(4);
                            break;
                        }
                        case 12: {
                            character.setBAB("+6/+1");
                            character.setWill(8);
                            character.setReflex(4);
                            character.setFort(4);
                            character.setSp5(5);
                            character.setSp6(3);
                            break;
                        }
                        case 13: {
                            character.setSp5(6);
                            character.setSp6(4);
                            break;
                        }
                        case 14: {
                            character.setBAB("+7/+2");
                            character.setWill(9);
                            character.setSp6(5);
                            character.setSp7(3);
                            break;
                        }
                        case 15: {

                            character.setFort(5);
                            character.setReflex(5);
                            character.setSp6(6);
                            character.setSp7(4);
                            break;
                        }
                        case 16: {
                            character.setBAB("+8/+3");
                            character.setWill(10);
                            character.setSp8(3);
                            character.setSp7(5);
                            break;
                        }
                        case 17: {
                            character.setSp8(4);
                            character.setSp7(6);
                            break;
                        }
                        case 18: {
                            character.setBAB("+9/+4");
                            character.setReflex(6);
                            character.setWill(11);
                            character.setFort(6);
                            character.setSp8(5);
                            character.setSp9(3);
                            break;
                        }
                        case 19: {
                            character.setSp8(6);
                            character.setSp9(4);

                            break;
                        }
                        case 20: {
                            character.setBAB("+10/+5");
                            character.setWill(12);
                            character.setSp9(6);
                            break;
                        }

                    }
                    break;

            }
                case "wizard":
                {
                    switch (character.getLevel()) {
                        case 1: {


                            character.setHp(4);
                            character.setBAB("+0");
                            character.setReflex(0);
                            character.setFort(0);
                            character.setWill(2);
                            character.setAC(10);
                            character.setSp0(3);
                            character.setSp1(1);
                            character.setSp2(0);
                            character.setSp3(0);
                            character.setSp4(0);
                            character.setSp5(0);
                            character.setSp6(0);
                            character.setSp7(0);
                            character.setSp8(0);
                            character.setSp9(0);
                            break;
                        }
                        case 2: {
                            character.setBAB("+1");
                            character.setWill(3);
                            character.setSp0(4);
                            character.setSp1(2);
                            break;
                        }
                        case 3: {

                            character.setReflex(1);
                            character.setFort(1);
                            character.setSp2(1);
                            break;
                        }
                        case 4: {
                            character.setBAB("+2");
                            character.setWill(4);
                            character.setSp1(3);
                            character.setSp2(2);
                            break;
                        }
                        case 5: {
                            character.setSp3(1);
                            break;
                        }
                        case 6: {
                            character.setBAB("+3");
                            character.setFort(2);
                            character.setReflex(2);
                            character.setWill(5);
                            character.setSp3(2);
                            character.setSp2(3);
                            break;
                        }
                        case 7: {
                            character.setSp4(1);
                            character.setSp1(4);
                            break;
                        }
                        case 8: {
                            character.setBAB("4");
                            character.setWill(6);
                            character.setSp4(2);
                            character.setSp3(3);
                            break;
                        }
                        case 9: {
                            character.setReflex(3);
                            character.setFort(3);
                            character.setSp2(4);
                            character.setSp5(1);
                            break;
                        }
                        case 10: {
                            character.setBAB("+5");
                            character.setWill(7);
                            character.setSp4(3);
                            character.setSp5(2);
                            break;
                        }
                        case 11: {
                            character.setSp3(4);
                            character.setSp6(1);
                            break;
                        }
                        case 12: {
                            character.setBAB("+6/+1");
                            character.setWill(8);
                            character.setReflex(4);
                            character.setFort(4);
                            character.setSp5(3);
                            character.setSp6(2);
                            break;
                        }
                        case 13: {
                            character.setSp4(4);
                            character.setSp7(1);
                            break;
                        }
                        case 14: {
                            character.setBAB("+7/+2");
                            character.setWill(9);
                            character.setSp6(3);
                            character.setSp7(2);
                            break;
                        }
                        case 15: {

                            character.setFort(5);
                            character.setReflex(5);
                            character.setSp5(4);
                            character.setSp8(1);
                            break;
                        }
                        case 16: {
                            character.setBAB("+8/+3");
                            character.setWill(10);
                            character.setSp8(2);
                            character.setSp7(3);
                            break;
                        }
                        case 17: {
                            character.setSp9(1);
                            character.setSp6(4);
                            break;
                        }
                        case 18: {
                            character.setBAB("+9/+4");
                            character.setReflex(6);
                            character.setWill(11);
                            character.setFort(6);
                            character.setSp8(3);
                            character.setSp9(2);
                            break;
                        }
                        case 19: {
                            character.setSp7(4);
                            character.setSp9(3);

                            break;
                        }
                        case 20: {
                            character.setBAB("+10/+5");
                            character.setWill(12);
                            character.setSp9(4);
                            character.setSp8(4);
                            break;
                        }

                    }
                    break;



                }
        }
        this.character=character;
    }
    public Character returnCharacter()
    {
        return character;
    }
}