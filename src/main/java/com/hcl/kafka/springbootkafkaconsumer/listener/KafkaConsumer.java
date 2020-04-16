package com.hcl.kafka.springbootkafkaconsumer.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.hcl.kafka.springbootkafkaconsumer.model.User;

@Service
public class KafkaConsumer {

	// Consume String message.
	
    @KafkaListener(topics = "myTopic-3", group = "group_id")
    public void consume(String message) {
        System.out.println("Consumed message: " + message);
    }

    // consume JSON Value. 
    
    @KafkaListener(topics = "Kafka_Example_json", group = "group_json",
            containerFactory = "userKafkaListenerFactory")
    public void consumeJson(User user) {
        System.out.println("Consumed JSON Message: " + user);
    }
}
