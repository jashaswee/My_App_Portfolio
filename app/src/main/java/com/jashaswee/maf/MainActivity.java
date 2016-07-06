package com.jashaswee.maf;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    String str=" ";
    int i=0;
    String s;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void btn1(View v) {
        i = 1;
        s="Popular Movies";
        onClick(v,s);

    }

    public void btn2(View v)
    {
        i=2;
        s="Stock Hawk";
        onClick(v,s);

    }

    public void btn3(View v)
    {
        i=3;
        s="Build It Bigger";
        onClick(v,s);

    }


    public void btn4(View v)
    {
        i=4;
        s="Make Your App Material";
        onClick(v,s);

    }


    public void btn5(View v)
    {
        i=5;
        s="Go Ubiquitious";
        onClick(v,s);

    }


    public void btn6(View v)
    {
        i=6;
        s="Capstone";
        onClick(v,s);
    }



    public void onClick(View v, String s) {
        Toast.makeText(getApplicationContext(), "This button will pop open my"+ " " +s+ " "+ "App!", Toast.LENGTH_SHORT).show();
    }
}
