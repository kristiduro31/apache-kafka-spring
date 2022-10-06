package com.example.springkafkatest1.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    @Bean
    public NewTopic checktest(){
        return TopicBuilder.name("test1Kafka_Spring")
                .build();
    }
}
