package com.example.demo;

import lombok.RequiredArgsConstructor;
import ru.owpk.kafkamvc.annotation.KafkaMvcController;
import ru.owpk.kafkamvc.annotation.KafkaMvcMapping;
import ru.owpk.kafkamvc.annotation.Payload;

@KafkaMvcController(topic = "service-b")
@RequiredArgsConstructor
public class KafkaController {

    @KafkaMvcMapping("/hello")
    public String serviceA(@Payload String msg) {
        System.out.println("Received msg for mapping:" + "/hello");
        System.out.println(msg);
        return "hello from service B";
    }
}
