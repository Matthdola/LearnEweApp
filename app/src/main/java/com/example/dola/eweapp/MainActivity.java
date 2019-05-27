package com.example.dola.eweapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.numbers) TextView NumbersTextView;

    @BindView(R.id.family) TextView FamilyTextView ;


    @BindView(R.id.phrases) TextView PhrasesTextView;

    @BindView(R.id.color) TextView ColorsTextView ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        NumbersTextView.setOnClickListener(new View.OnClickListener() {
            // Code in this method will be executed when the numbers category is clicked on
            @Override
            public void onClick(View v) {
                //Create a new intent to open the {@link NumbersActivity }
                Intent i = new Intent(MainActivity.this, NumbersActivity.class);

                //Start the new activity
                startActivity(i);
            }
        });

        FamilyTextView.setOnClickListener(new View.OnClickListener() {
            // Code in this method will be executed when the Family category is clicked on
            @Override
            public void onClick(View v) {
                //Create a new intent to open the {@link FamilyActivity }
                Intent i = new Intent(MainActivity.this, FamilyActivity.class);

                //Start the new activity
                startActivity(i);
            }
        });

        PhrasesTextView.setOnClickListener(new View.OnClickListener() {
            // Code in this method will be executed when the phrases category is clicked on
            @Override
            public void onClick(View v) {
                //Create a new intent to open the {@link ColorsActivity }
                Intent i = new Intent(MainActivity.this, PhrasesActivity.class);

                //Start the new activity
                startActivity(i);
            }
        });

        ColorsTextView.setOnClickListener(new View.OnClickListener() {
            // Code in this method will be executed when the colors category is clicked on
            @Override
            public void onClick(View v) {
                //Create a new intent to open the {@link PhraseActivity }
                Intent i = new Intent(MainActivity.this, ColorActivity.class);

                //Start the new activity
                startActivity(i);
            }
        });
    }

    /*
    public void openNumberActivity(View v){

    }

    public void openFamilyActivity(View v){
        Intent i = new Intent(this, FamilyActivity.class);
        startActivity(i);
    }

    public void openColorActivity(View v){
        Intent i = new Intent(this, ColorActivity.class);
        startActivity(i);
    }

    public void openPhrasesActivity(View v){
        Intent i = new Intent(this, PhrasesActivity.class);
        startActivity(i);
    }
    */
}
