package com.example.demo;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.RequiredArgsConstructor;
import ru.owpk.kafkamvc.annotation.EnableKafkaMvcConsumer;
import ru.owpk.kafkamvc.annotation.EnableKafkaMvcProducer;

@SpringBootApplication
@EnableKafkaMvcConsumer
@EnableKafkaMvcProducer
@RequiredArgsConstructor
public class DemoApplication implements ApplicationRunner {

	private final DemoService demoService;
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		Thread.sleep(3000);
		demoService.foo();
	}

}
