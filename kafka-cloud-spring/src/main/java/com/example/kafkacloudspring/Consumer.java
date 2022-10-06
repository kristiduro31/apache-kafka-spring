package com.example.kafkacloudspring;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class Consumer {

    @KafkaListener(topics = "${cloudkarafka.topic}")
    public void processMessage(String message) {
        System.out.printf("%s\"\n", message);
    }

}
