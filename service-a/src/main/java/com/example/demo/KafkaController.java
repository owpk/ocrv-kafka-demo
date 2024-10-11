package com.example.demo;

import lombok.RequiredArgsConstructor;
import ru.owpk.kafkamvc.annotation.KafkaMvcController;
import ru.owpk.kafkamvc.annotation.KafkaMvcMapping;
import ru.owpk.kafkamvc.utils.KafkaMvcRequestCreator;

@KafkaMvcController(topic = "service-a")
@RequiredArgsConstructor
public class KafkaController {

    private final KafkaMvcRequestCreator requestCreator;

    @KafkaMvcMapping("/org/structure")
    public String serviceA() {

        var asyncResponse = requestCreator.createRequestBuilder()
            .withAction("/hello").withTopicName("service-b").withRequestBody("hello from service A")
            .sendAsync();
        System.out.println(asyncResponse);

        var syncResponse = requestCreator.createRequestBuilder()
            .withAction("/hello").withTopicName("service-b")
            .withRequestBody("hello from service A")
            .sendForEntity(String.class);
        System.out.println(syncResponse);

        return "hello from service A";
    }
}
