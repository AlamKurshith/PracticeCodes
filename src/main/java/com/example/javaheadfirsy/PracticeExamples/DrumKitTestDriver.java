package com.example.javaheadfirsy.PracticeExamples;

public class DrumKitTestDriver {

    public static void main(String [] args){
        DrumKit d = new DrumKit();
        d.playSnare();
        d.snare = false;
        d.playToHat();
        if(d.snare){
            d.playSnare();
        }

    }

}
