package com.nwi.lab.kafka.producer.controller;

import com.nwi.lab.kafka.producer.KafkaProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class KafkaController {

    private final KafkaProducer kafkaProducer;

    @GetMapping(value = "/producer")
    public String sendMessage(@RequestParam("message") String message) {
        kafkaProducer.sendMessageToTopic(message);
        return "Message sent Successfully to the your learning-station-topic ";
    }

}
