package com.example.omar.miwalk;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView numbers=(TextView)findViewById(R.id.num);
        numbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i =new Intent(MainActivity.this,NumClass.class);
                startActivity(i);
            }
        });

        TextView family=(TextView)findViewById(R.id.fam);
        family.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i =new Intent(MainActivity.this,FamClass.class);
                startActivity(i);
            }
        });

        TextView phrases=(TextView)findViewById(R.id.phrases);
        phrases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i =new Intent(MainActivity.this,PhrasesClass.class);
                startActivity(i);
            }
        });

        TextView colors=(TextView)findViewById(R.id.colors);
        colors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i =new Intent(MainActivity.this,ColorClass.class);
                startActivity(i);
            }
        });
    }
}
