package com.example.javaheadfirsy;

public class clock {

    String time;

    void setTime(String t){
        time = t;
    }

    String getTime(){
        return time;
    }
}

class ClockTestDrive{
    public static void main(String[] args){
        clock c = new clock();

        c.setTime("12:45");
        String tod = c.getTime();
        System.out.println("Time is: " + tod);
    }
}
