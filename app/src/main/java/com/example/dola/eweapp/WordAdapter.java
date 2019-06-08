package com.example.dola.eweapp;


import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class WordAdapter extends RecyclerView.Adapter<WordAdapter.WordViewHolder> {

    ArrayList<Word> words;
    /**
     * This is our own custom constructor (it doens mirror a superclass constructor).
     * The content is used to inflate the layout file, and le list is the data we want
     * to populare into the lists.
     *
     * @param context The current context. Used to inflate the layout file
     * @param words A list of Word objecst to display in a list
     */
    public WordAdapter(ArrayList<Word> words){
        // Here, we initialize the ArrayAdapter"s internal storage for the context and the list.
        // The second argument is used when the ArrayAdapter is populating a single TextView
        // Because this is a custom adapter for two textViews and an ImageView, hte adapter is not
        // going to use this second argument, so it can be any value, Here we used 0.
        this.words = words;
    }

    @NonNull
    @Override
    public WordViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Context context = viewGroup.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        // Inflate the custom layout
        View wordView = inflater.inflate(R.layout.list_item, viewGroup, false);

        //Return a new holder instance
        WordViewHolder wordViewHolder = new WordViewHolder(wordView);

        return  wordViewHolder;
    }

    @Override
    public void onBindViewHolder(WordViewHolder wordViewHolder, int i) {
        Word word = words.get(i);

        ImageView imageView = wordViewHolder.imageView;
        if (word.getmImageResourceId() > 0) {
            imageView.setImageResource(word.getmImageResourceId());
            imageView.setVisibility(View.VISIBLE);
        } else {
            imageView.setVisibility(View.GONE);
        }


        TextView ewetextView = wordViewHolder.eweTextView;
        ewetextView.setText(word.getmEweTranslation());

        TextView defauttextView = wordViewHolder.defaultTextView;
        defauttextView.setText(word.getmDefaultTranslation());
    }

    @Override
    public int getItemCount() {
        return words.size();
    }

    /*

    @Override
    public View getView(int position,  View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        // Get the Word object located at this position in the list
        Word currentWord = getItem(position);

        // Find the the textView in the list_item layout with the ID ewe_text_view
        TextView eweTextView = listItemView.findViewById(R.id.ewe_text_view);

        // Get the ewe value from the current word object
        // Set the value to the textView
        eweTextView.setText(currentWord.getmEweTranslation());

        // Find the the textView in the list_item layout with the ID default_text_view
        TextView defaultTextView = listItemView.findViewById(R.id.default_text_view);

        // Get the default value from the current word object
        // Set the value to the textView
        defaultTextView.setText(currentWord.getmDefaultTranslation());

        return listItemView;
    }

    */

    public static class WordViewHolder extends RecyclerView.ViewHolder{
        public ImageView imageView;
        public TextView eweTextView;
        public TextView defaultTextView;

        public WordViewHolder(View itemView){
            super(itemView);

            imageView = itemView.findViewById(R.id.image);
            eweTextView = itemView.findViewById(R.id.ewe_text_view);
            defaultTextView = itemView.findViewById(R.id.default_text_view);
        }
    }
}
