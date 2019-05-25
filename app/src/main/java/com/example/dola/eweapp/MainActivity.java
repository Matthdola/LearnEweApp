package com.example.dola.eweapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openNumberActivity(View v){
        Intent i = new Intent(this, NumbersActivity.class);
        startActivity(i);
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
}
