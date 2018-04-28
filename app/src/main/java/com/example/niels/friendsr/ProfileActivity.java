package com.example.niels.friendsr;

import android.content.Intent;
import android.content.SharedPreferences;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {

    SharedPreferences.Editor editor;
    Friends retrievedFriend;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_profile);

        // Gets the views from the profile activity
        ImageView profilePic = findViewById(R.id.profilePic);
        TextView profileName = findViewById(R.id.profileName);
        TextView profileBio = findViewById(R.id.profileBio);
        RatingBar ratingBar = findViewById(R.id.ratingBar);

        // Loads the editor, because it is onCreate it has to be loaded only once per profile activity
        editor = getSharedPreferences("settings", MODE_PRIVATE).edit();

        // Receives the intent and gets the specific Friends object
        Intent intent = getIntent();
        retrievedFriend = (Friends) intent.getSerializableExtra("clickedFriend");

        // Gets the shared preferences
        SharedPreferences prefs = getSharedPreferences("settings", MODE_PRIVATE);

        // Initializes an listener on the ratingbar
        ratingBar.setOnRatingBarChangeListener(new onRatingBarChangeListner());

        // Gets the rating if there already was one, if not set to 0 (empty)
        float aStoredFloat = prefs.getFloat(retrievedFriend.getName(), 0);

        // Fills the view in the profile activity with the data from the specific Friends object
        ratingBar.setRating(aStoredFloat);
        profilePic.setImageResource(retrievedFriend.getDrawableId());
        profileName.setText(retrievedFriend.getName());
        profileBio.setText((retrievedFriend.getBio()));


    }

    private class onRatingBarChangeListner implements RatingBar.OnRatingBarChangeListener {
        @Override
        public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {

            // Saves the rating when changed
            editor.putFloat(retrievedFriend.getName(), rating);
            editor.apply();
        }
    }
}
