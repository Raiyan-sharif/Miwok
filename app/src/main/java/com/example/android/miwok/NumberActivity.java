package com.example.android.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class NumberActivity extends AppCompatActivity {
    private MediaPlayer mMediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        final ArrayList<Word> numberWord = new ArrayList<Word>();
        numberWord.add(new Word("one","lutti", R.drawable.number_one, R.raw.number_one));
        numberWord.add(new Word("two","otiiko", R.drawable.number_two, R.raw.number_two));
        numberWord.add(new Word("three","tolookosu", R.drawable.number_three, R.raw.number_three));
        numberWord.add(new Word("four","oyyisa", R.drawable.number_four, R.raw.number_four));
        numberWord.add(new Word("five","massokka", R.drawable.number_five, R.raw.number_five));
        numberWord.add(new Word("six","temmokka", R.drawable.number_six, R.raw.number_six));
        numberWord.add(new Word("seven","kenekaku", R.drawable.number_seven, R.raw.number_seven));
        numberWord.add(new Word("eight","kawinta", R.drawable.number_eight, R.raw.number_eight));
        numberWord.add(new Word("nine","wo'e", R.drawable.number_nine, R.raw.number_nine));
        numberWord.add(new Word("ten","na'aacha", R.drawable.number_ten, R.raw.number_ten));

        WordAdapter itemsAdapter = new WordAdapter(this,numberWord, R.color.category_numbers);
        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Word word = numberWord.get(position);
                mMediaPlayer = MediaPlayer.create(NumberActivity.this, word.getAudioResourceId());
                mMediaPlayer.start();
            }
        });

//        for(int i=0; i<numberWord.size();i++){
//            TextView wordView = new TextView(this);
//            wordView.setText(numberWord.get(i));
//            numbersRootView.addView(wordView);
//        }



    }
}
