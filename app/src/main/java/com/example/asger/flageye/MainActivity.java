package com.example.asger.flageye;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

import com.android.About;
import com.example.asger.flageye.test.Alpha;


import layout.bfg.BFD;
import layout.bravo.Bravo;
import layout.charlie.Charlie;
import layout.delta.Delta;
import layout.echo.Echo;
import layout.foxtrot.Foxtrot;
import layout.golf.Golf;
import layout.hotel.Hotel;
import layout.india.India;
import layout.juliet.Juliet;
import layout.kilo.Kilo;
import layout.lima.Lima;
import layout.mike.Mike;
import layout.november.November;
import layout.oscar.Oscar;
import layout.papa.Papa;
import layout.quebeck.Quebeck;
import layout.romeo.Romeo;
import layout.sierra.Sierra;
import layout.tango.Tango;
import layout.uniform.Uniform;
import layout.victor.Victor;
import layout.whisky.Whisky;
import layout.xray.Xray;
import layout.yankee.Yankee;
import layout.zulu.Zulu;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void about(View view) {
        Intent a = new Intent(getBaseContext(), About.class);
        startActivity(a);
    }
    public void alpha(View view) {
        Intent a = new Intent(getBaseContext(), Alpha.class);
        startActivity(a);
    }
    public void bravo(View view) {
        Intent a = new Intent(getBaseContext(), Bravo.class);
        startActivity(a);
    }
    public void charlie(View view) {
        Intent a = new Intent(getBaseContext(), Charlie.class);
        startActivity(a);
    }
    public void delta(View view) {
        Intent a = new Intent(getBaseContext(), Delta.class);
        startActivity(a);
    }
    public void echo(View view) {
        Intent a = new Intent(getBaseContext(), Echo.class);
        startActivity(a);
    }
    public void foxtrot(View view) {
        Intent a = new Intent(getBaseContext(), Foxtrot.class);
        startActivity(a);
    }
    public void golf(View view) {
        Intent a = new Intent(getBaseContext(), Golf.class);
        startActivity(a);
    }
    public void hotel(View view) {
        Intent a = new Intent(getBaseContext(), Hotel.class);
        startActivity(a);
    }
    public void india(View view) {
        Intent a = new Intent(getBaseContext(), India.class);
        startActivity(a);
    }
    public void juliet(View view) {
        Intent a = new Intent(getBaseContext(), Juliet.class);
        startActivity(a);
    }
    public void kilo(View view) {
        Intent a = new Intent(getBaseContext(), Kilo.class);
        startActivity(a);
    }
    public void lima(View view) {
        Intent a = new Intent(getBaseContext(), Lima.class);
        startActivity(a);
    }
    public void mike(View view) {
        Intent a = new Intent(getBaseContext(), Mike.class);
        startActivity(a);
    }
    public void november(View view) {
        Intent a = new Intent(getBaseContext(), November.class);
        startActivity(a);
    }
    public void oscar(View view) {
        Intent a = new Intent(getBaseContext(), Oscar.class);
        startActivity(a);
    }
    public void papa(View view) {
        Intent a = new Intent(getBaseContext(), Papa.class);
        startActivity(a);
    }
    public void quebeck(View view) {
        Intent a = new Intent(getBaseContext(), Quebeck.class);
        startActivity(a);
    }
    public void romeo(View view) {
        Intent a = new Intent(getBaseContext(), Romeo.class);
        startActivity(a);
    }
    public void sierra(View view) {
        Intent a = new Intent(getBaseContext(), Sierra.class);
        startActivity(a);
    }
    public void tango(View view) {
        Intent a = new Intent(getBaseContext(), Tango.class);
        startActivity(a);
    }
    public void uniform(View view) {
        Intent a = new Intent(getBaseContext(), Uniform.class);
        startActivity(a);
    }
    public void victor(View view) {
        Intent a = new Intent(getBaseContext(), Victor.class);
        startActivity(a);
    }
    public void whisky(View view) {
        Intent a = new Intent(getBaseContext(), Whisky.class);
        startActivity(a);
    }
    public void xray(View view) {
        Intent a = new Intent(getBaseContext(), Xray.class);
        startActivity(a);
    }
    public void yankee(View view) {
        Intent a = new Intent(getBaseContext(), Yankee.class);
        startActivity(a);
    }
    public void zulu(View view) {
        Intent a = new Intent(getBaseContext(), Zulu.class);
        startActivity(a);
    }
    public void bfg(View view) {
        Intent a = new Intent(getBaseContext(), BFD.class);
        startActivity(a);
    }

}

