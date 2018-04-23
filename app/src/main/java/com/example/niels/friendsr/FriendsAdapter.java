package com.example.niels.friendsr;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.ArrayList;
import java.util.List;

public class FriendsAdapter extends ArrayAdapter<Friends> {

    private ArrayList<Friends> friends;

    public FriendsAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Friends> objects) {
        super(context, resource, objects);

        friends = objects;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.grid_item, parent, false);
        }
        convertView.findViewById(R.id.imageView2);
        Friends profile = friends.get(0);
        setBackgroundResource();getContext().getResources().getDrawable(profile.getDrawableId());

        return convertView;
    }
}