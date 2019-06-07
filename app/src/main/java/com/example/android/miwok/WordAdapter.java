package com.example.android.miwok;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class WordAdapter extends ArrayAdapter<Word> {
    private int mColorResourceId;
    public WordAdapter(Activity context, @NonNull ArrayList <Word> objects, int colorResourceId) {
        super(context,0, objects);
        mColorResourceId=colorResourceId;
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
        if (currentNumber.hasImage()) {
            iconImageView.setImageResource(currentNumber.getResourceId());
            iconImageView.setVisibility(View.VISIBLE);
        }
        else{
            iconImageView.setVisibility(View.GONE);
        }
        View textContainer = listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        textContainer.setBackgroundColor(color);

        return listItemView;






//        return super.getView(position, convertView, parent);
    }
}
