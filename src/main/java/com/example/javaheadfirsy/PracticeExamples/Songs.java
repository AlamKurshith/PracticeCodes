package com.example.javaheadfirsy.PracticeExamples;

public class Songs {
    String title;
    String artist;

    void setTitle(String title){
        this.title = title;
    }

    void setArtist(String artist){
        this.artist = artist;
    }

    void play(){
        System.out.println(title + " is playing now...");
    }
}
