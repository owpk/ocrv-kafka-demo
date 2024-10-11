package com.example.demo;

import lombok.RequiredArgsConstructor;
import ru.owpk.kafkamvc.annotation.KafkaMvcController;
import ru.owpk.kafkamvc.annotation.KafkaMvcMapping;

@KafkaMvcController(topic = "service-a")
@RequiredArgsConstructor
public class KafkaController {

    private final DemoService demoService;

    @KafkaMvcMapping("/org/structure")
    public String serviceA() {
        demoService.foo();
        return "hello from service A";
    }
}
