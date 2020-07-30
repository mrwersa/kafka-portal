package com.wersa.kafka.portal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootApplication
public class PortalApplication {

	public static void main(String[] args) {
		SpringApplication.run(PortalApplication.class);
		log.info("Application started");
	}
}
