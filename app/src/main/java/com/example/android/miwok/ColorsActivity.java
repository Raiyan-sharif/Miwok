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
        numberWord.add(new Word("red","weṭeṭṭi", R.drawable.color_red, R.raw.color_red));
        numberWord.add(new Word("green","chokokki", R.drawable.color_green, R.raw.color_green));
        numberWord.add(new Word("brown","ṭakaakki", R.drawable.color_brown, R.raw.color_brown));
        numberWord.add(new Word("gray","ṭopoppi", R.drawable.color_gray, R.raw.color_gray));
        numberWord.add(new Word("black","kululli", R.drawable.color_black, R.raw.color_black));
        numberWord.add(new Word("white","kelelli", R.drawable.color_white, R.raw.color_white));
        numberWord.add(new Word("dusty yellow","ṭopiisә", R.drawable.color_dusty_yellow, R.raw.color_dusty_yellow));
        numberWord.add(new Word("mustard yellow","chiwiiṭә", R.drawable.color_mustard_yellow, R.raw.color_mustard_yellow));

        WordAdapter itemsAdapter = new WordAdapter(this,numberWord, R.color.category_colors);
        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);

//        for(int i=0; i<numberWord.size();i++){
//            TextView wordView = new TextView(this);
//            wordView.setText(numberWord.get(i));
//            numbersRootView.addView(wordView);
//        }



    }
}
