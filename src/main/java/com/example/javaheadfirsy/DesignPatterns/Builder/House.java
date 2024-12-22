package com.example.javaheadfirsy.DesignPatterns.Builder;

public class House {

    private final int windows;
    private final int doors;
    private final boolean gardened;

    private House(HouseBuilder houseBuilder){
        this.windows = houseBuilder.windows;
        this.doors = houseBuilder.doors;
        this.gardened = houseBuilder.gardened;
    }

    public String toString(){
        String info = "[ Windows =  " + windows + ", Doors = " + doors + ", Has Garden = " + gardened + "]";
        return info;
    }

    public static class HouseBuilder{
        private int windows;
        private int doors;
        private boolean gardened;

        public HouseBuilder setWindows(int windows){
            this.windows = windows;
            return this;
        }
        public HouseBuilder setDoors(int doors){
            this.doors = doors;
            return this;
        }
        public HouseBuilder setGardened(boolean gardened){
            this.gardened = gardened;
            return this;
        }
        public House build(){
            return new House(this);
        }
    }
}
