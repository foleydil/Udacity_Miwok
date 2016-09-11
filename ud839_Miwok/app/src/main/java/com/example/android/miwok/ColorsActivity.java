package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        //Create ArrayList of words
        ArrayList<Word> words = new ArrayList<>();
        words.add(new Word("red","weṭeṭṭi",0));
        words.add(new Word("green","chokokki",0));
        words.add(new Word("brown","ṭakaakki",0));
        words.add(new Word("gray","ṭopoppi",0));
        words.add(new Word("black","kululli",0));
        words.add(new Word("white","kelelli",0));
        words.add(new Word("dusty yellow","ṭopiisә",0));
        words.add(new Word("mustard yellow", "chiwiiṭә",0));

        WordAdapter adapter = new WordAdapter(this, words);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
