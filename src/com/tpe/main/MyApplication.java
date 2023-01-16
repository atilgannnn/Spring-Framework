package com.tpe.main;

import com.tpe.domain.Message;
import com.tpe.service.MailServis;
import com.tpe.service.MessageService;
import com.tpe.service.SmsService;
import com.tpe.service.WhatsuppService;

public class MyApplication {

    public static void main(String[] args) {
        Message message = new Message();
        message.setMessage("Siparişler kargoya verildi");
    // 1. aşaqma ****************************************************************
    //        MessageService mailServis = new WhatsuppService();
   //        mailServis.sendMessage(message);

//        SmsService smsService = new SmsService();
//        smsService.sendMessage(message);
//
//        WhatsuppService whatsuppService = new WhatsuppService();
//        whatsuppService.sendMessage(message);

        // 2. aşaqma ****************************************************************

        String serviceName = "mailService";
        MessageService service ;

        if(args.length>0) {
           serviceName = args[0];
        }

        if(serviceName.equalsIgnoreCase("whatsAppService")) {
            service = new WhatsuppService();
        } else if (serviceName.equalsIgnoreCase("smsService")) {
            service=new SmsService();
        } else {
            service = new MailServis();
        }
        service.sendMessage(message);


    }
}


