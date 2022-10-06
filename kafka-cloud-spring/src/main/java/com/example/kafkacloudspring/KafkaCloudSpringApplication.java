package com.example.kafkacloudspring;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class KafkaCloudSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(KafkaCloudSpringApplication.class, args);
    }

    @Bean
    public ApplicationRunner runner(Producer producer){
        return (args->{producer.send(new SampleMessage(1123123,"Hello there..."));});
    }
}
