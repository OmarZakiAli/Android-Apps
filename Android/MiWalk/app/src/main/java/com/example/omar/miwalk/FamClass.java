package com.example.omar.miwalk;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class FamClass extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_activity);


        final  ArrayList<Words> word=new ArrayList<>();
        word.add(new Words("father","miwakfam",R.drawable.family_father,R.raw.family_father));
        word.add(new Words("mother","miwakfam",R.drawable.family_mother,R.raw.family_mother));
        word.add(new Words("young brother","miwakfam",R.drawable.family_younger_brother,R.raw.family_younger_brother));
        word.add(new Words("old brother","miwakfam",R.drawable.family_older_brother,R.raw.family_older_brother));
        word.add(new Words("son","miwakfam",R.drawable.family_son,R.raw.family_son));
        word.add(new Words("older sister","miwakfam",R.drawable.family_older_sister,R.raw.family_older_sister));
        word.add(new Words("younger sister","miwakfam",R.drawable.family_younger_sister,R.raw.family_younger_sister));
        word.add(new Words("grand father","miwakfam",R.drawable.family_grandfather,R.raw.family_grandfather));
        word.add(new Words("grand mother","miwakfam",R.drawable.family_grandmother,R.raw.family_grandmother));
        word.add(new Words("daughter","miwakfam",R.drawable.family_daughter,R.raw.family_daughter));


        ListView l =(ListView)findViewById(R.id.WORD);
        WordAdabter w=new WordAdabter(this,R.layout.listltem,word);
        w.setBack(200);
        l.setAdapter(w);

        l.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                MediaPlayer md=MediaPlayer.create(FamClass.this,word.get(i).getAudio());
                md.start();
            }
        });
    }
}
