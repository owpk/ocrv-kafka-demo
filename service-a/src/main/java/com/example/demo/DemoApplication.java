package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ru.owpk.kafkamvc.annotation.EnableKafkaMvcConsumer;
import ru.owpk.kafkamvc.annotation.EnableKafkaMvcProducer;

@SpringBootApplication
@EnableKafkaMvcConsumer
@EnableKafkaMvcProducer
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
