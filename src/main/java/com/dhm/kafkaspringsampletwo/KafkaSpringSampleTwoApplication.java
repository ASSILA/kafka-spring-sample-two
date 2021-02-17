package com.dhm.kafkaspringsampletwo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableKafka
public class KafkaSpringSampleTwoApplication {

    public static void main(String[] args) {
        SpringApplication.run(KafkaSpringSampleTwoApplication.class, args);
    }

}
