package com.example.mirim_cess_master;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

public class SecondStory extends AppCompatActivity {
    private FragmentPagerAdapter fragmentPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); 
        setContentView(R.layout.activity_second_story);

        final ImageView iv = (ImageView)findViewById(R.id.imageView);
        Animation anim = AnimationUtils.loadAnimation
                (getApplicationContext(),
                        R.anim.scale);
        iv.startAnimation(anim);

        //뷰페이저 세팅
        ViewPager viewPager = findViewById(R.id.viewPager);
        fragmentPagerAdapter = new ViewPagerAdapter_Second(getSupportFragmentManager());

        TabLayout tabLayout = findViewById(R.id.tabLayout);
        viewPager.setAdapter(fragmentPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}