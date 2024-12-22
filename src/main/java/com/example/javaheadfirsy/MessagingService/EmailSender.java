package com.example.javaheadfirsy.MessagingService;

public class EmailSender implements MessageSender{

    @Override
    public void send(Message message) {
        System.out.println("Sending message: " + message);
    }
}
