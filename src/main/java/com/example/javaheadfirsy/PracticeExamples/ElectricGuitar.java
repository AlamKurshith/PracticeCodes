package com.example.javaheadfirsy.PracticeExamples;

public class ElectricGuitar {
    String brand;
    int numOfPickups;
    boolean rockStarUsesIt;

    String getBrand(){
        return brand;
    }
    void setBrand(String aBrand){
        brand = aBrand;
    }

    int getNumOfPickups(){
        return numOfPickups;
    }
    void setNumOfPickups(int num){
        numOfPickups = num;
    }

    boolean getRockStarUsesIt(){
        return rockStarUsesIt;
    }
    void setRockStarUsesIt(boolean YesOrNo){
        rockStarUsesIt  = YesOrNo;
    }
}
