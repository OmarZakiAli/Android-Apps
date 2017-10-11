package com.example.omar.miwalk;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class NumClass extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.word_activity);

        final MediaPlayer.OnCompletionListener ON=new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {

                mediaPlayer.release();
             } };


     final    ArrayList<Words> word=new ArrayList<>();
word.add(new Words("one","miwalknumber",R.drawable.number_one));
        word.add(new Words("two","miwalknumber",R.drawable.number_two,R.raw.number_two));
        word.add(new Words("three","miwalknumber",R.drawable.number_three,R.raw.number_three));
        word.add(new Words("four","miwalknumber",R.drawable.number_four,R.raw.number_four));
        word.add(new Words("five","miwalknumber",R.drawable.number_five,R.raw.number_five));
        word.add(new Words("six","miwalknumber",R.drawable.number_six,R.raw.number_six));
        word.add(new Words("seven","miwalknumber",R.drawable.number_seven,R.raw.number_seven));
        word.add(new Words("eight","miwalknumber",R.drawable.number_eight,R.raw.number_eight));
        word.add(new Words("nine","miwalknumber",R.drawable.number_nine,R.raw.number_nine));
        word.add(new Words("ten","miwalknumber",R.drawable.number_ten,R.raw.number_ten));

        ListView l =(ListView)findViewById(R.id.WORD);
        WordAdabter w=new WordAdabter(this,R.layout.listltem,word);
        w.setBack(400);
        l.setAdapter(w);

         l.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {




                MediaPlayer md = MediaPlayer.create(NumClass.this, word.get(i).getAudio());

                md.start();
                md.setOnCompletionListener(ON);

               }
            } );
    }
    }