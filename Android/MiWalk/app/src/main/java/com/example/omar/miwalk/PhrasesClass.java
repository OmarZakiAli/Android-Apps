package com.example.omar.miwalk;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesClass extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.word_activity);


       final ArrayList<Words> word=new ArrayList<>();
        word.add(new Words("are_you_coming","miwakphrases",-1,R.raw.phrase_are_you_coming));
        word.add(new Words("come_here","miwakphrases",-1,R.raw.phrase_come_here));
        word.add(new Words("how_are_you_feeling","miwakphrases",-1,R.raw.phrase_how_are_you_feeling));
        word.add(new Words("im_coming","miwakphrases",-1,R.raw.phrase_im_coming));
        word.add(new Words("im_feeling_good","miwakphrases",-1,R.raw.phrase_im_feeling_good));
        word.add(new Words("lets_go","miwakphrases",-1,R.raw.phrase_lets_go));
        word.add(new Words("my_name_is","miwakphrases",-1,R.raw.phrase_my_name_is));
        word.add(new Words("what_is_your_name","miwakphrases",-1,R.raw.phrase_what_is_your_name));
        word.add(new Words("where_are_you_going","miwakphrases",-1,R.raw.phrase_where_are_you_going));
        word.add(new Words("yes_im_coming","miwakphrases",-1,R.raw.phrase_yes_im_coming));



        ListView l =(ListView)findViewById(R.id.WORD);
        WordAdabter w=new WordAdabter(this,R.layout.listltem,word);
        w.setBack(300);
        l.setAdapter(w);
        l.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                MediaPlayer md=MediaPlayer.create(PhrasesClass.this,word.get(i).getAudio());
md.start();
            }
        });


    }
}
