package com.example.javaheadfirsy.PracticeExamples;

public class TapeDeckTestDriver {

    public static void main(String [] args){

        TapeDeck t = new TapeDeck();

        t.canRecord = true;

        t.playTape();
        if(t.canRecord){
            t.recordTape();
        }

    }
}
