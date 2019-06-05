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

        ArrayList<Word> numberWord = new ArrayList<Word>();
        numberWord.add(new Word("red","weṭeṭṭi"));
        numberWord.add(new Word("green","chokokki"));
        numberWord.add(new Word("brown","ṭakaakki"));
        numberWord.add(new Word("gray","ṭopoppi"));
        numberWord.add(new Word("black","kululli"));
        numberWord.add(new Word("white","kelelli"));
        numberWord.add(new Word("dusty yellow","ṭopiisә"));
        numberWord.add(new Word("mustard yellow","chiwiiṭә"));

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
