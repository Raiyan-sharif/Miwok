package com.example.android.miwok;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class WordAdapter extends ArrayAdapter<Word> {
    public WordAdapter(Activity context, @NonNull ArrayList <Word> objects) {
        super(context,0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        Word currentNumber = getItem(position);
        TextView defaultNumberTextView = (TextView) listItemView.findViewById(R.id.default_text_view);
        defaultNumberTextView.setText(currentNumber.getDefaultTranslation());

        TextView miwokNumberTextView =(TextView) listItemView.findViewById(R.id.miwok_text_view);
        miwokNumberTextView.setText(currentNumber.getMiwokTranslation());

        ImageView iconImageView = (ImageView) listItemView.findViewById(R.id.image_icon_word);
        iconImageView.setImageResource(currentNumber.getResourceId());




        return listItemView;






//        return super.getView(position, convertView, parent);
    }
}
