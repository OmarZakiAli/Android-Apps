package com.example.omar.miwalk;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorClass extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.word_activity);

        final ArrayList<Words> word = new ArrayList<>();
        word.add(new Words("black", "miwakcolor",R.drawable.color_black,R.raw.color_black));
        word.add(new Words("red", "miwakcolor",R.drawable.color_red,R.raw.color_red));
        word.add(new Words("brown", "miwakcolor",R.drawable.color_brown,R.raw.color_brown));
        word.add(new Words("white", "miwakcolor",R.drawable.color_white,R.raw.color_white));
        word.add(new Words("green", "miwakcolor",R.drawable.color_green,R.raw.color_green));
        word.add(new Words("gray", "miwakcolor",R.drawable.color_gray,R.raw.color_gray));
        word.add(new Words("dusty yellow", "miwakcolor",R.drawable.color_dusty_yellow,R.raw.color_dusty_yellow));
        word.add(new Words("mustard yellow", "miwakcolor",R.drawable.color_mustard_yellow,R.raw.color_mustard_yellow));


        ListView l = (ListView) findViewById(R.id.WORD);
        WordAdabter w = new WordAdabter(this, R.layout.listltem, word);
        w.setBack(100);
        l.setAdapter(w);

        l.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                MediaPlayer md=MediaPlayer.create(ColorClass.this,word.get(i).getAudio());
                md.start();
            }
        });
    }
}
