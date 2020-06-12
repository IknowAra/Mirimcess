package com.example.mirim_cess_master;


import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.mirim_cess_master.first.Frag_First_Story1;
import com.example.mirim_cess_master.fourth.Frag_Fourth_Story1;


public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void start(View view) {
        Intent intent = new Intent(MainActivity.this, StartActivity.class);
        startActivity(intent);
    }
}

