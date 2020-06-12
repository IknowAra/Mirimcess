package com.example.mirim_cess_master;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.mirim_cess_master.second.Frag_Second_Story1;
import com.example.mirim_cess_master.second.Frag_Second_Story2;
import com.example.mirim_cess_master.second.Frag_Second_Story3;
import com.example.mirim_cess_master.second.Frag_Second_Story4;
import com.example.mirim_cess_master.second.Frag_Second_Story5;
import com.example.mirim_cess_master.second.Frag_Second_Story6;
import com.example.mirim_cess_master.second.Frag_Second_Story7;

public class ViewPagerAdapter_Second extends FragmentPagerAdapter {
    public ViewPagerAdapter_Second(@NonNull FragmentManager fm) {
        super(fm);
    }

    //프래그먼트를 교체를 보여주는 처리를 구현한 곳
    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return Frag_Second_Story1.newInstance();
            case 1:
                return Frag_Second_Story2.newInstance();
            case 2:
                return Frag_Second_Story3.newInstance();
            case 3:
                return Frag_Second_Story4.newInstance();
            case 4:
                return Frag_Second_Story5.newInstance();
            case 5:
                return Frag_Second_Story6.newInstance();
            case 6:
                return Frag_Second_Story7.newInstance();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 7;
    }
}
