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
        numberWord.add(new Word("one","lutti", R.drawable.number_one));
        numberWord.add(new Word("two","otiiko", R.drawable.number_two));
        numberWord.add(new Word("three","tolookosu", R.drawable.number_three));
        numberWord.add(new Word("four","oyyisa", R.drawable.number_four));
        numberWord.add(new Word("five","massokka", R.drawable.number_five));
        numberWord.add(new Word("six","temmokka", R.drawable.number_six));
        numberWord.add(new Word("seven","kenekaku", R.drawable.number_seven));
        numberWord.add(new Word("eight","kawinta", R.drawable.number_eight));
        numberWord.add(new Word("nine","wo'e", R.drawable.number_nine));
        numberWord.add(new Word("ten","na'aacha", R.drawable.number_ten));

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
