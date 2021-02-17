package com.dhm.kafkaspringsampletwo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/kafka")
public class ProducerObjectRestController {
    @Autowired
    private KafkaTemplate<String, Employee> kafkaTemplate;
    private String topic ="testTopic";
    @GetMapping("/publish/{name}")
    public String publishMessage(@PathVariable String name){
        kafkaTemplate.send(topic,new Employee(name,"Finance",45000.0));
        return "Message Published";
    }
}
