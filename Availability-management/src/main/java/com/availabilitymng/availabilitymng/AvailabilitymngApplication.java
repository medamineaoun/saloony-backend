package com.availabilitymng.availabilitymng;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class AvailabilitymngApplication {

	public static void main(String[] args) {
		SpringApplication.run(AvailabilitymngApplication.class, args);
	}

}
