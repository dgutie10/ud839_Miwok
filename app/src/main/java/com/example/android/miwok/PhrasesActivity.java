package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        ArrayList<Word> words = new ArrayList<>();

        words.add(new Word("Where are you going?", "minto wuksus",-1,R.raw.phrase_where_are_you_going));
        words.add(new Word("What is your name?", "tinnә oyaase'nә",-1,R.raw.phrase_what_is_your_name));
        words.add(new Word("My name is...", "oyaaset...",-1,R.raw.phrase_my_name_is));
        words.add(new Word("How are you feeling?", "michәksәs?",-1,R.raw.phrase_how_are_you_feeling));
        words.add(new Word("I’m feeling good.", "kuchi achit",-1,R.raw.phrase_im_feeling_good));
        words.add(new Word("Are you coming?", "әәnәs'aa?",-1,R.raw.phrase_are_you_coming));
        words.add(new Word("Yes, I’m coming.", "hәә’ әәnәm",-1,R.raw.phrase_yes_im_coming));
        words.add(new Word("I’m coming.", "әәnәm",-1,R.raw.phrase_im_coming));
        words.add(new Word("Let’s go.", "yoowutis",-1,R.raw.phrase_lets_go));
        words.add(new Word("Come here.", "әnni'nem",-1,R.raw.phrase_come_here));

        WordAdapter itemAdapter = new WordAdapter(this, words,R.color.category_phrases);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemAdapter);
    }

}
