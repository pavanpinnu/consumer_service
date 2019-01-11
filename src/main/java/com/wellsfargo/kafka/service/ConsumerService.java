package com.wellsfargo.kafka.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {

	@KafkaListener(topics = "topic1")
	public void listen(String message) {
	    System.out.println("Received Messasge in spring-consumer: " + message);
	}

}
