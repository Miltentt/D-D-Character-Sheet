package com.example.ddcharactersheet.Adapters;

import android.content.Context;
import android.view.LayoutInflater;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class Spells_Slide extends FragmentPagerAdapter {
    private Context context;
    LayoutInflater inflater;
    private final List<String> list = new LinkedList<>();

    private final List<Fragment> stFragment = new ArrayList();

    public Spells_Slide(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return stFragment.get(position);
    }


    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return list.get(position);
    }

    @Override
    public int getCount() {
        return list.size();
    }


    public void AddFragment(Fragment fragment, String title) {
        list.add(title);
        stFragment.add(fragment);
    }
}