package com.example.demo;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import ru.owpk.kafkamvc.utils.KafkaMvcRequestCreator;

@Service
@RequiredArgsConstructor
public class DemoService {

    private final KafkaMvcRequestCreator requestCreator;

    public void foo() {
        var asyncResponse = requestCreator.createRequestBuilder()
            .withAction("/hello").withTopicName("service-b").withRequestBody("hello from service A")
            .sendAsync();
        System.out.println(asyncResponse);

        var syncResponse = requestCreator.createRequestBuilder()
            .withAction("/hello").withTopicName("service-b")
            .withRequestBody("hello from service A")
            .sendForEntity(String.class);
        System.out.println(syncResponse);
    }
}
