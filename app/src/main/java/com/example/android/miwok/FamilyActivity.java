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

        ArrayList<Word> numberWord = new ArrayList<Word>();
        numberWord.add(new Word("father","әpә"));
        numberWord.add(new Word("mother","әṭa"));
        numberWord.add(new Word("son","angsi"));
        numberWord.add(new Word("daughter","tune"));
        numberWord.add(new Word("older brother","taachi"));
        numberWord.add(new Word("younger brother","chalitti"));
        numberWord.add(new Word("older sister","kolliti"));
        numberWord.add(new Word("younger sister","chiwiiṭә"));
        numberWord.add(new Word("grandmother","ama"));
        numberWord.add(new Word("grandfather","paapa"));

        WordAdapter itemsAdapter = new WordAdapter(this,numberWord);
        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);

//        for(int i=0; i<numberWord.size();i++){
//            TextView wordView = new TextView(this);
//            wordView.setText(numberWord.get(i));
//            numbersRootView.addView(wordView);
//        }



    }
}
