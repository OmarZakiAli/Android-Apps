package com.example.omar.basketball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Integer score1=0;
    Integer score2=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void point23(View view) {
        score2=score2+3;
        display2(score2);
    }

    public void point22(View view) {
        score2=score2+2;
        display2(score2);
    }

    public void point12(View view) {
    score2=score2+1;
        display2(score2);
    }

    public void point21(View view) {
        score1=score1+2;
        display1(score1);
    }

    public void point31(View view) {
    score1=score1+3;
        display1(score1);
    }

    public void point11(View view) {
    score1=score1+1;
        display1(score1);

    }

    public void display1(Integer sc){
    String sscore1=null;
        TextView t=(TextView)findViewById(R.id.score1);
        sscore1=sc.toString();
        t.setText(sscore1);
    }

    public void display2(Integer sc){
        String sscore2=null;
        TextView t=(TextView)findViewById(R.id.score2);
        sscore2=sc.toString();
        t.setText(sscore2);
    }

    public void reset(View view) {
        score1=0;
        score2=0;
        display1(score1);
        display2(score2);
    }
}
