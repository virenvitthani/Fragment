package com.example.fragment;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;

public class Fragment_Adapter extends FragmentPagerAdapter {

    ArrayList<Fragment> fragmentList = new ArrayList<>();
    ArrayList<String> fragmenTitel = new ArrayList<>();

    public Fragment_Adapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    public Fragment_Adapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return 3;
    }

    public void addFragment(Fragment fragment, String titel) {
        fragmentList.add(fragment);
        fragmenTitel.add(titel);
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return fragmenTitel.get(position);
    }
}
