package com.example.android.miwok;

import android.app.Activity;
import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by dguti on 9/18/2016.
 */
public class WordAdapter extends ArrayAdapter<Word> {

    private int mColorResourceID;

    public WordAdapter (Activity context, ArrayList<Word> words, int background_color){
        super(context, 0, words);

        mColorResourceID = background_color;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Word currentWords = getItem(position);

        View listItemView = convertView;

        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent,false);
        }

        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.item_1);
        miwokTextView.setText(currentWords.getmMiwokTranslation());

        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.item_2);
        defaultTextView.setText(currentWords.getmDefaultTranslation());



        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        if (currentWords.hasAnImage()){
            imageView.setImageResource(currentWords.getResourceID());
            imageView.setVisibility(View.VISIBLE);
        }
        else {
            imageView.setVisibility(View.GONE);
        }
        View textContainer = listItemView.findViewById(R.id.text_container);


        textContainer.setBackgroundColor(ContextCompat.getColor(getContext(), mColorResourceID));


        return listItemView;
    }
}
