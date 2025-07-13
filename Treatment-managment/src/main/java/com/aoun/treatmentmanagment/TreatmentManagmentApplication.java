package com.aoun.treatmentmanagment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(basePackages = "com.aoun.treatmentmanagment.feign")
public class TreatmentManagmentApplication {
	public static void main(String[] args) {
		SpringApplication.run(TreatmentManagmentApplication.class, args);
	}
}

