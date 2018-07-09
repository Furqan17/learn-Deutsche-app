package com.example.android.deutsche_learn;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        //Array of words of numbers
        ArrayList<Word> words = new ArrayList<>();

        //Create words using word constructor and add it to Words ArrayList
        words.add(new Word("black", "Schwarz"));
        words.add(new Word("white", "Weiß"));
        words.add(new Word("red", "Rot"));
        words.add(new Word("yellow", "Gelb"));
        words.add(new Word("blue", "Blau"));
        words.add(new Word("green", "Grün"));
        words.add(new Word("brown", "Braun"));
        words.add(new Word("pink", "Rosa"));
        words.add(new Word("orange", "Orange"));
        words.add(new Word("grey", "Grau"));
        words.add(new Word("purple/violet", "Lila/Violett"));


        //Add List View
        WordAdapter adapter = new WordAdapter(this,  words);

        // Find list view
        ListView listView = findViewById(R.id.list);

        // Add the adapter
        listView.setAdapter(adapter);
    }
}
