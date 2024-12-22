package com.example.javaheadfirsy.MessagingService;

public class NotificationService {

    private MessageSender messageSender;

    public NotificationService(MessageSender messageSender){
        this.messageSender = messageSender;
    }
    public void notify(Message message) {
        messageSender.send(message);
    }
}
