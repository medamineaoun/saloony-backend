package com.aoun.salonmanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SalonManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(SalonManagementApplication.class, args);
	}

}
