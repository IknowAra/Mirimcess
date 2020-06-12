package com.example.mirim_cess_master;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import java.util.Timer;
import java.util.TimerTask;

public class StartActivity extends  AppCompatActivity {
    ViewPager viewPager;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        viewPager = (ViewPager) findViewById(R.id.viewPager);
        ViewPagerAdapter_MainSilde viewPagerAdapter = new ViewPagerAdapter_MainSilde(this);
        viewPager.setAdapter(viewPagerAdapter);
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new MyTimerTask(), 4000, 4000);
    }
    public void firststory (View view){
        Intent intent = new Intent(StartActivity.this, FirstStory.class);
        startActivity(intent);
    }

    public void secondstory(View view) {
        Intent intent = new Intent(StartActivity.this, SecondStory.class);
        startActivity(intent);
    }

    public void thirdstory(View view) {
        Intent intent = new Intent(StartActivity.this, ThirdStory.class);
        startActivity(intent);
    }

    public void fourthstory(View view){
        Intent intent = new Intent(StartActivity.this, FourthStory.class);
        startActivity(intent);
    }
    public class MyTimerTask extends TimerTask {
        @Override
        public void run() {
            StartActivity.this.runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    if (viewPager.getCurrentItem() == 0) {
                        viewPager.setCurrentItem(1);
                    } else if (viewPager.getCurrentItem() == 1) {
                        viewPager.setCurrentItem(2);
                    } else {
                        viewPager.setCurrentItem(0);
                    }
                }
            });
        }
    }
}
