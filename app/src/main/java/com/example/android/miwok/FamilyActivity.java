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

//        for(int i=0; i<numberWord.size();i++){
//            TextView wordView = new TextView(this);
//            wordView.setText(numberWord.get(i));
//            numbersRootView.addView(wordView);
//        }



    }
}
