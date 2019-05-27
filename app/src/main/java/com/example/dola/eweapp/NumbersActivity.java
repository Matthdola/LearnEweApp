package com.example.dola.eweapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class NumbersActivity extends AppCompatActivity {

    @BindView(R.id.list)
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
        ButterKnife.bind(this);

        // Create an array of words
        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("one", "Deka"));
        words.add(new Word("two", "Eve"));
        words.add( new Word("three", "Eto"));
        words.add(new Word("four", "Ene"));
        words.add(new Word("five", "ato"));
        words.add(new Word("six", "ade"));
        words.add(new Word("seven", "adre"));
        words.add(new Word("eight", "eyni"));
        words.add(new Word("nine", "assieke"));
        words.add(new Word("ten", "ewo"));
        words.add(new Word("eleven", "wideke"));
        words.add(new Word("twelve", "wuive"));
        words.add( new Word("thirthen", "wuito"));


        WordAdapter itemsAdapter = new WordAdapter(this, words);

        listView.setAdapter(itemsAdapter);
    }
}
