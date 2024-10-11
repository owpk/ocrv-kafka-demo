package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import ru.owpk.kafkamvc.producer.KafkaMvcProducer;
import ru.owpk.kafkamvc.utils.KafkaMvcRequestCreator;

@Configuration
public class BeanConfig {

    @Bean
    public KafkaMvcRequestCreator requestCreator(KafkaMvcProducer kafkaSparuralProducer) {
        return new KafkaMvcRequestCreator(kafkaSparuralProducer);
    }
}
