package com.example.mirim_cess_master.third;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.mirim_cess_master.R;

public class Frag_Third_Story3 extends Fragment {
    private View view;

    public static Frag_Third_Story3 newInstance() {
        Frag_Third_Story3 frag_third_story3 = new Frag_Third_Story3();

        return frag_third_story3;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.frag_third3, container, false);

        return view;
    }
}
