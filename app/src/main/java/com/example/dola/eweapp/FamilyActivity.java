package com.example.dola.eweapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class FamilyActivity extends AppCompatActivity {

    @BindView(R.id.list)
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_words);
        ButterKnife.bind(this);

        // Create an array of words
        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("Father", "Deka"));
        words.add(new Word("Mother", "Eve"));
        words.add( new Word("Son", "Eto"));
        words.add(new Word("Girl", "Ene"));
        words.add(new Word("Boy", "ato"));
        words.add(new Word("Grand father", "ade"));
        words.add(new Word("Grand mother", "adre"));
        words.add(new Word("Ante", "eyni"));
        words.add(new Word("Uncle", "assieke"));
        words.add(new Word("Friend", "ewo"));
        words.add(new Word("Cousin", "wideke"));
        words.add(new Word("Man", "wuive"));
        words.add( new Word("Woman", "wuito"));


        WordAdapter itemsAdapter = new WordAdapter(this, words);

        listView.setAdapter(itemsAdapter);
    }
}
