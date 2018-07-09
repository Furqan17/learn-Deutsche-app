package com.example.android.deutsche_learn;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    // Constructor for word adapter
    public WordAdapter(Activity context, ArrayList<Word> words) {
        super(context, 0, words);
    }

    // Overriding getView
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;

        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // get the current Word
        Word currentWord = getItem(position);

        // takes current word, translates to german, then sets to text view
        TextView germanTextView = listItemView.findViewById(R.id.german_text_view);
        germanTextView.setText(currentWord.getGermanTranslation());

        // takes current word, translates to default language, then sets to text view
        TextView defaultTextView = listItemView.findViewById(R.id.default_text_view);
        defaultTextView.setText(currentWord.getDefaultTranslation());

        // returns full list view
        return listItemView;
    }
}
