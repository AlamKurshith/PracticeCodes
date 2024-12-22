package com.example.javaheadfirsy.DesignPatterns.Builder;

public class Director {

    public House CreateluxuryHouse(){
        return new House.HouseBuilder()
                .setWindows(20)
                .setDoors(5)
                .setGardened(true)
                .build();
    }

    public House CreateBasicHouse(){
        House basichouse = new House
                .HouseBuilder()
                .setWindows(10)
                .setDoors(3)
                .setGardened(false)
                .build();

        return basichouse;
    }

}
