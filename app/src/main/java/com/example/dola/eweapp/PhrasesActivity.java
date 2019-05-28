package com.example.dola.eweapp;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class PhrasesActivity extends AppCompatActivity {

    @BindView(R.id.list)
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_words);
        ButterKnife.bind(this);

        // Create an array of words
        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("What is your name?", "Deka"));
        words.add(new Word("Where do you live?", "Eve"));
        words.add( new Word("I love you?", "Eto"));
        words.add(new Word("Do you want to be my girl friend?", "Ene"));
        words.add(new Word("Can you help me?", "ato"));
        words.add(new Word("My name is", "ade"));
        words.add(new Word("What do you do in life", "adre"));
        words.add(new Word("Do you have children", "eyni"));
        words.add(new Word("Tell me about you", "assieke"));
        words.add(new Word("Where can I find a doctor", "ewo"));
        words.add(new Word("eleven", "wideke"));
        words.add(new Word("twelve", "wuive"));
        words.add( new Word("thirthen", "wuito"));


        WordAdapter itemsAdapter = new WordAdapter(this, words);

        listView.setAdapter(itemsAdapter);
    }

}
