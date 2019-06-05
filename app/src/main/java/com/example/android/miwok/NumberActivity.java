package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class NumberActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> numberWord = new ArrayList<Word>();
        numberWord.add(new Word("one","lutti"));
        numberWord.add(new Word("two","otiiko"));
        numberWord.add(new Word("three","tolookosu"));
        numberWord.add(new Word("four","oyyisa"));
        numberWord.add(new Word("five","massokka"));
        numberWord.add(new Word("six","temmokka"));
        numberWord.add(new Word("seven","kenekaku"));
        numberWord.add(new Word("eight","kawinta"));
        numberWord.add(new Word("nine","wo'e"));
        numberWord.add(new Word("ten","na'aacha"));

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
