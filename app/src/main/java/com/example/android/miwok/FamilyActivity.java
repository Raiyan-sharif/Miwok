package com.example.android.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {
    private MediaPlayer mMediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        final ArrayList<Word> numberWord = new ArrayList<Word>();
        numberWord.add(new Word("father","әpә", R.drawable.family_father, R.raw.family_father));
        numberWord.add(new Word("mother","әṭa", R.drawable.family_mother, R.raw.family_mother));
        numberWord.add(new Word("son","angsi", R.drawable.family_son, R.raw.family_son));
        numberWord.add(new Word("daughter","tune", R.drawable.family_daughter, R.raw.family_daughter));
        numberWord.add(new Word("older brother","taachi", R.drawable.family_older_brother, R.raw.family_older_brother));
        numberWord.add(new Word("younger brother","chalitti", R.drawable.family_younger_brother, R.raw.family_younger_brother));
        numberWord.add(new Word("older sister","kolliti", R.drawable.family_older_sister, R.raw.family_older_sister));
        numberWord.add(new Word("younger sister","chiwiiṭә", R.drawable.family_younger_sister, R.raw.family_younger_sister));
        numberWord.add(new Word("grandmother","ama", R.drawable.family_grandmother, R.raw.family_grandmother));
        numberWord.add(new Word("grandfather","paapa", R.drawable.family_grandfather, R.raw.family_grandfather));

        WordAdapter itemsAdapter = new WordAdapter(this,numberWord, R.color.category_family);
        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Word word = numberWord.get(position);
                mMediaPlayer = MediaPlayer.create(FamilyActivity.this, word.getAudioResourceId());
                mMediaPlayer.start();
            }
        });



    }
}
