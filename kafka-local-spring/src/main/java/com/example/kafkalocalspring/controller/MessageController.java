package com.example.springkafkatest1.controller;

import com.example.springkafkatest1.kafka.KafkaProducer;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class MessageController {

    private KafkaProducer kafkaProducer;

    public MessageController(KafkaProducer kafkaProducer) {
        this.kafkaProducer = kafkaProducer;
    }

    @GetMapping("/publish")
    public ResponseEntity<String> sendMsg(@RequestParam("message")String message){
        kafkaProducer.sendMessage(message);
        return ResponseEntity.ok("Message Sent to Topic");
    }
}
