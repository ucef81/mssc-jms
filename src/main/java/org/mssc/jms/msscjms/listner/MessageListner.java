package org.mssc.jms.msscjms.listner;


import org.mssc.jms.msscjms.config.JmsConfig;
import org.mssc.jms.msscjms.model.MessageEntity;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import javax.jms.Destination;
import javax.jms.Message;

@Component
public class MessageListner {

    @JmsListener(destination= JmsConfig.MY_QUEUE)
    public void listen(@Payload MessageEntity msg, @Headers MessageHeaders headers, Message message){

        System.out.println("I got a message");
        System.out.println(msg);

    }
}
