package com.example.demo;

import lombok.RequiredArgsConstructor;
import ru.owpk.kafkamvc.annotation.KafkaMvcController;
import ru.owpk.kafkamvc.annotation.KafkaMvcMapping;

@KafkaMvcController(topic = "service-b")
@RequiredArgsConstructor
public class KafkaController {

    @KafkaMvcMapping("/hello")
    public String serviceA(String msg) {
        System.out.println(msg);
        return "hello from service B";
    }
}
