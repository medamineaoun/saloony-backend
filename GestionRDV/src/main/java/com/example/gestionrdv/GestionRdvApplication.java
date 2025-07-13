package com.example.gestionrdv;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class GestionRdvApplication {

    public static void main(String[] args) {
        SpringApplication.run(GestionRdvApplication.class, args);
    }

}
