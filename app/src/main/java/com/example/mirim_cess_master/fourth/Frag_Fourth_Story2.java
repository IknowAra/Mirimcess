package com.example.mirim_cess_master.fourth;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.mirim_cess_master.R;

public class Frag_Fourth_Story2 extends Fragment {
    private View view;

    public static Frag_Fourth_Story2 newInstance() {
        Frag_Fourth_Story2 frag_fourth_story2 = new Frag_Fourth_Story2();

        return frag_fourth_story2;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.frag_fourth2, container, false);

        return view;
    }
}
