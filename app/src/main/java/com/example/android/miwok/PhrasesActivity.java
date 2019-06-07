package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> numberWord = new ArrayList<Word>();
        numberWord.add(new Word("Where are you going?","minto wuksus"));
        numberWord.add(new Word("What is your name?","tinnә oyaase'nә"));
        numberWord.add(new Word("My name is...","oyaaset..."));
        numberWord.add(new Word("How are you feeling?","michәksәs?"));
        numberWord.add(new Word("I’m feeling good.","kuchi achit"));
        numberWord.add(new Word("Are you coming?","әәnәs'aa?"));
        numberWord.add(new Word("Yes, I’m coming.","hәә’ әәnәm"));
        numberWord.add(new Word("I’m coming.","әәnәm"));
        numberWord.add(new Word("Let’s go.","yoowutis"));
        numberWord.add(new Word("Come here.","әnni'nem"));

        WordAdapter itemsAdapter = new WordAdapter(this,numberWord, R.color.category_phrases);
        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);

//        for(int i=0; i<numberWord.size();i++){
//            TextView wordView = new TextView(this);
//            wordView.setText(numberWord.get(i));
//            numbersRootView.addView(wordView);
//        }



    }
}
