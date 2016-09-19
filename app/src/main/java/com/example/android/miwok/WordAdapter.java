package com.example.android.miwok;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by dguti on 9/18/2016.
 */
public class WordAdapter extends ArrayAdapter<Word> {

    public WordAdapter (Activity context, ArrayList<Word> words){
        super(context, 0, words);
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

        return listItemView;
    }
}
