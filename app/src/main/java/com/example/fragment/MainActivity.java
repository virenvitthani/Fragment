package com.example.fragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.annotation.SuppressLint;
import android.app.Fragment;
import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    Fragment_Adapter adapter;
    ViewPager viewPager;
    TabLayout tabLayout;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        adapter = new Fragment_Adapter(getSupportFragmentManager());

        adapter.addFragment(new Fragment_One(),"one");
        adapter.addFragment(new Fragment_Two(),"two");
        adapter.addFragment(new Fragment_Three(),"three");

        viewPager=findViewById(R.id.viewpager);
        viewPager.setAdapter(adapter);
        tabLayout=findViewById(R.id.tablayout);
        tabLayout.setupWithViewPager(viewPager);
    }
}