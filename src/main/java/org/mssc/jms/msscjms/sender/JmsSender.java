package org.mssc.jms.msscjms.sender;

import lombok.RequiredArgsConstructor;
import org.mssc.jms.msscjms.config.JmsConfig;
import org.mssc.jms.msscjms.model.MessageEntity;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
@RequiredArgsConstructor
public class JmsSender {

    private final JmsTemplate jmsTemplate;

    @Scheduled(fixedRate = 2000)
    public void sendMessage(){
        System.out.println("I'm sending Message");

        MessageEntity msg = MessageEntity.builder()
                .id(UUID.randomUUID()).message("First Massage").build();
        jmsTemplate.convertAndSend(JmsConfig.MY_QUEUE,msg);
        System.out.println("Message sent");

    }
}
