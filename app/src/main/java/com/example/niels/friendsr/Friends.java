package com.example.niels.friendsr;

import java.io.Serializable;

public class Friends implements Serializable {

    // Properties of the class
    private String name, bio;
    private int drawableId;
    private float rating;

    // Constructor of the class

    public Friends(String name, String bio, int drawableID) {
        this.name = name;
        this.bio = bio;
        this.drawableId = drawableID;
    }

    // Methods of the class

    public String getName() {
        return name;
    }

    public String getBio() {
        return bio;
    }

    public int getDrawableId() {
        return drawableId;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }
}
