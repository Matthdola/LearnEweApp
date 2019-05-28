package com.example.dola.eweapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ColorActivity extends AppCompatActivity {

    @BindView(R.id.list)
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_words);
        ButterKnife.bind(this);

        // Create an array of words
        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("White", "Deka"));
        words.add(new Word("Black", "Eve"));
        words.add( new Word("Blue", "Eto"));
        words.add(new Word("Yellow", "Ene"));
        words.add(new Word("Red", "ato"));
        words.add(new Word("Gray", "ade"));
        words.add(new Word("Cyan", "adre"));
        words.add(new Word("Orange", "eyni"));
        words.add(new Word("green", "assieke"));
        words.add(new Word("Violet", "ewo"));
        words.add(new Word("purple", "wideke"));
        words.add(new Word("pink", "wuive"));
        
        WordAdapter itemsAdapter = new WordAdapter(this, words);

        listView.setAdapter(itemsAdapter);
    }
}
