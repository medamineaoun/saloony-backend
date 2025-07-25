package com.aoun.treatmentmanagment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;



@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.aoun.treatmentmanagment.feign")
public class TreatmentManagmentApplication {
	public static void main(String[] args) {
		SpringApplication.run(TreatmentManagmentApplication.class, args);
	}
}

