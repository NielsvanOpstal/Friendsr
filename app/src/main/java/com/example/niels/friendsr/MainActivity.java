package com.example.niels.friendsr;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Friends> friends = new ArrayList<>();
        Friends Arya = new Friends("Arya", "bio komt hier", getResources().getIdentifier("arya.png","id", getPackageName()));
        Friends Cercei = new Friends("Cercei", "bio komt hier", getResources().getIdentifier("cercei.png","id", getPackageName()));
        Friends Daenerys = new Friends("Daenerys", "bio komt hier", getResources().getIdentifier("daenerys.png","id", getPackageName()));
        Friends Jaimie = new Friends("Jaimie", "bio komt hier", getResources().getIdentifier("jaimie.png","id", getPackageName()));
        Friends Jon = new Friends("Jon", "bio komt hier", getResources().getIdentifier("jon.png","id", getPackageName()));
        Friends Jorah = new Friends("Jorah", "bio komt hier", getResources().getIdentifier("jorah.png","id", getPackageName()));
        Friends Margaery = new Friends("Margaery", "bio komt hier", getResources().getIdentifier("margaery.png","id", getPackageName()));
        Friends Melisandre = new Friends("Melisandre", "bio komt hier", getResources().getIdentifier("melisandre.png","id", getPackageName()));
        Friends Sansa = new Friends("Sansa", "bio komt hier", getResources().getIdentifier("sansa.png","id", getPackageName()));
        Friends Tyrion = new Friends("Tyrion", "bio komt hier", getResources().getIdentifier("tyrion.png","id", getPackageName()));

        friends.add(Arya);
        friends.add(Cercei);
        friends.add(Daenerys);
        friends.add(Jaimie);
        friends.add(Jon);
        friends.add(Jorah);
        friends.add(Margaery);
        friends.add(Melisandre);
        friends.add(Sansa);
        friends.add(Tyrion);
    }
}
