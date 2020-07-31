package com.example.ddcharactersheet.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

import android.support.v4.app.FragmentPagerAdapter;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ddcharactersheet.Spells_Fragments.Fragment1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

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