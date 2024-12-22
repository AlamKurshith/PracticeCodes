package com.example.javaheadfirsy.DesignPatterns.Builder;

public class Test1 {

    public static void main(String[] args) {


//        Car car = new Car.CarBuilder("V7")
//                .setWheels(4)
//                .setColor("Black")
//                .setHasSunRoof(true)
//                .build();
//
//        System.out.println(car.toString());

        Director director =  new Director();

        House LuxuryHouse = director.CreateluxuryHouse();
        House BasicHouse = director.CreateBasicHouse();
        System.out.println(LuxuryHouse);
        System.out.println(BasicHouse);

        House ownhouse = new House.HouseBuilder()
                .setWindows(25)
                .setDoors(15)
                .setGardened(true)
                .build();
        System.out.println(ownhouse);
    }

}
