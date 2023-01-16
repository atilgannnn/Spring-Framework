package com.tpe.service;

import com.tpe.domain.Message;

public class MailServis implements MessageService{

    public void sendMessage(Message message) {
        System.out.println("Ben Mail Servisiyim, size mesaj gönderiyorum : " + message.getMessage());
    }
}
