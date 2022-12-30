package com.driver;

import java.util.Date;

public class MailTemplate {
    Date date;
    String senderId;
    String message;
    MailTemplate(Date date,String senderId,String message){
        this.date=date;
        this.senderId=senderId;
        this.message=message;
    }
}
