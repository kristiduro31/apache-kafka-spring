package com.example.springkafkatest1.kafka;

import com.example.springkafkatest1.payload.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
public class JsonKafkaProducer {
    private static final Logger LOGGER = LoggerFactory.getLogger(JsonKafkaProducer.class);
    private final KafkaTemplate<String, User> kafkaTemplate;

    public JsonKafkaProducer(KafkaTemplate<String, User> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessage(User data){
        LOGGER.info(String.format("Message sent -> %s",data.toString()));

        Message<String> message = MessageBuilder
                .withPayload(data.toString())
                .setHeader(KafkaHeaders.TOPIC,"test1Kafka_Spring")
                .build();
        kafkaTemplate.send(message);

    }
}
