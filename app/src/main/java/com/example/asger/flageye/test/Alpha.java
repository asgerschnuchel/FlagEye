package com.example.asger.flageye.test;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.asger.flageye.R;

import layout.unknown.Unknown;

public class Alpha extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alpha);
        }

    public void error(View view) {
        Intent a = new Intent(getBaseContext(), Unknown.class);
        startActivity(a);
    }
    }


