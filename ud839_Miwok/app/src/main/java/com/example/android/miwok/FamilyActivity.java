package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        //Create ArrayList of words
        ArrayList<Word> words = new ArrayList<>();
        words.add(new Word("father","әpә",0));
        words.add(new Word("mother","әṭa",0));
        words.add(new Word("son","angsi",0));
        words.add(new Word("daughter","tune",0));
        words.add(new Word("older brother","taachi",0));
        words.add(new Word("younger brother","chalitti",0));
        words.add(new Word("older sister","teṭe",0));
        words.add(new Word("younger sister", "kolliti",0));
        words.add(new Word("grandmother", "ama",0));
        words.add(new Word("grandfather", "paapa",0));

        WordAdapter adapter = new WordAdapter(this, words);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}

