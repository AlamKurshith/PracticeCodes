package com.example.javaheadfirsy.MessagingService;

public class SMSSender implements MessageSender{


    @Override
    public void send(Message message) {
        System.out.println("Sending SMS: " + message);
    }
}
