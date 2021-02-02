package com.abhishek.kafkaconsumer.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @KafkaListener(topics="topic-ab1")
    public void consumer(String message) {
        System.out.println("Consumer Message : " + message);
    }
}
