package com.example.niels.friendsr;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Array which holds the persons from the app
        ArrayList<Friends> friends = new ArrayList<>();

        // Creates the Friends objects
        Friends arya = new Friends("Arya", "bio komt hier", getResources().getIdentifier("arya","drawable", getPackageName()));
        Friends cercei = new Friends("Cercei", "bio komt hier", getResources().getIdentifier("cersei","drawable", getPackageName()));
        Friends daenerys = new Friends("Daenerys", "bio komt hier", getResources().getIdentifier("daenerys","drawable", getPackageName()));
        Friends jaimie = new Friends("Jaimie", "bio komt hier", getResources().getIdentifier("jaime","drawable", getPackageName()));
        Friends jon = new Friends("Jon", "bio komt hier", getResources().getIdentifier("jon","drawable", getPackageName()));
        Friends jorah = new Friends("Jorah", "bio komt hier", getResources().getIdentifier("jorah","drawable", getPackageName()));
        Friends margaery = new Friends("Margaery", "bio komt hier", getResources().getIdentifier("margaery","drawable", getPackageName()));
        Friends melisandre = new Friends("Melisandre", "bio komt hier", getResources().getIdentifier("melisandre","drawable", getPackageName()));
        Friends sansa = new Friends("Sansa", "bio komt hier", getResources().getIdentifier("sansa","drawable", getPackageName()));
        Friends tyrion = new Friends("Tyrion", "bio komt hier", getResources().getIdentifier("tyrion","drawable", getPackageName()));

        // Adds the objects to the list
        friends.add(arya);
        friends.add(cercei);
        friends.add(daenerys);
        friends.add(jaimie);
        friends.add(jon);
        friends.add(jorah);
        friends.add(margaery);
        friends.add(melisandre);
        friends.add(sansa);
        friends.add(tyrion);

        // Initiates and sets the adapter to the gridview
        FriendsAdapter adapter = new FriendsAdapter(this, R.layout.grid_item, friends);
        GridView gv = (findViewById(R.id.dynamic));
        gv.setAdapter(adapter);

        // Sets the click listner on the gridview
        gv.setOnItemClickListener(new OnItemClickListner());


    }

    private class OnItemClickListner implements AdapterView.OnItemClickListener {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            // Gets the Friends object clicked on
            Friends clickedFriend = (Friends) parent.getItemAtPosition(position);

            // Creates and activates an intent
            Intent intent = new Intent(MainActivity.this, ProfileActivity.class);
            intent.putExtra("clickedFriend", clickedFriend);
            startActivity(intent);

        }
    }
}

