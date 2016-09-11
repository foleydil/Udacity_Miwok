package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        //Create ArrayList of words
        ArrayList<Word> words = new ArrayList<>();
        words.add(new Word("one","lutti",0));
        words.add(new Word("two","otiiko",0));
        words.add(new Word("three","tolookosu",0));
        words.add(new Word("four","oyyisa",0));
        words.add(new Word("five","massokka",0));
        words.add(new Word("six","temmokka",0));
        words.add(new Word("seven","kenekaku",0));
        words.add(new Word("eight", "kawinta",0));
        words.add(new Word("nine","wo'e",0));
        words.add(new Word("ten","na'aacha",0));

        WordAdapter adapter = new WordAdapter(this, words);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
