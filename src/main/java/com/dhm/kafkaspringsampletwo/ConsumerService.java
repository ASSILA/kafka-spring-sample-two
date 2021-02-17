package com.dhm.kafkaspringsampletwo;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {
    @KafkaListener(topics = "testTopic", groupId = "sample_consumer")
    public void onMessage(ConsumerRecord message) {
        System.out.println("Receiving message key=>" + message.key() + ""
                +
                " , Value=>" + message.value());
    }
}
