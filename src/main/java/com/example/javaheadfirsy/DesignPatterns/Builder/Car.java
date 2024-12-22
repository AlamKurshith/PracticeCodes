package com.example.javaheadfirsy.DesignPatterns.Builder;

public class Car {

    private String engine;
    private int wheels;
    private String color;
    private boolean hasSunRoof;


    private Car(CarBuilder carBuilder){

        this.engine = carBuilder.engine;
        this.wheels = carBuilder.wheels;
        this.color = carBuilder.color;
        this.hasSunRoof = carBuilder.hasSunRoof;

    }

    @Override
    public String toString(){
        return "Car [Engine=" + engine +
                ", Wheels=" + wheels +
                ", Color=" + color +
                ", Sun Roof = " +
                hasSunRoof + "]";
    }

    public static class CarBuilder{

        private String engine;
        private int wheels;
        private String color;
        private boolean hasSunRoof;


        public CarBuilder (String engine){
            this.engine = engine;
        }
        public CarBuilder setWheels(int wheels){
            this.wheels = wheels;
            return this;
        }
        public CarBuilder setColor(String color){
            this.color = color;
            return this;
        }
        public CarBuilder setHasSunRoof(boolean hasSunRoof){
            this.hasSunRoof = hasSunRoof;
            return this;
        }


        public Car build(){
            return new Car(this);
        }

    }



}
