package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class NumberActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number);

        ArrayList<String> numberWord = new ArrayList<String>();
        numberWord.add("One");
        numberWord.add("Two");
        numberWord.add("Three");
        numberWord.add("Four");
        numberWord.add("Five");
        numberWord.add("Six");
        numberWord.add("Seven");
        numberWord.add("Eight");
        numberWord.add("Nine");
        numberWord.add("Ten");

        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, R.layout.list_item, numberWord);
        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);

//        for(int i=0; i<numberWord.size();i++){
//            TextView wordView = new TextView(this);
//            wordView.setText(numberWord.get(i));
//            numbersRootView.addView(wordView);
//        }



    }
}
