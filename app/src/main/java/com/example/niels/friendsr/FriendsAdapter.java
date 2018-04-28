package com.example.niels.friendsr;

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


public class FriendsAdapter extends ArrayAdapter<Friends> {

    private ArrayList<Friends> friends;

    public FriendsAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Friends> objects) {
        super(context, resource, objects);

        // Puts the list of friends from the main activity in the arraylist made adove
        friends = objects;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.grid_item, parent, false);
        }

        // makes and fills the items for the gridview
        ImageView imageView = convertView.findViewById(R.id.imageView2);
        TextView textView = convertView.findViewById(R.id.textView2);
        Friends profile = friends.get(position);
        imageView.setImageResource(profile.getDrawableId());
        textView.setText(profile.getName());


        return convertView;
    }
}