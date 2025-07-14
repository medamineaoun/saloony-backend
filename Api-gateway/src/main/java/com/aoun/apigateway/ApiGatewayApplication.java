package com.aoun.apigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient
public class ApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiGatewayApplication.class, args);
	}

	@Bean
	public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {
		return builder.routes()

				// Salon-management (User)
				.route("user-service-general", r -> r.path("/api/user/**")
						.uri("lb://user-management"))

				// Salon-management (Customer)
				.route("user-service-customer", r -> r.path("/api/customer/**")
						.uri("lb://user-management"))

				// Salon-management (Provider)
				.route("user-service-provider", r -> r.path("/api/provider/**")
						.uri("lb://user-management"))

				// Salon-management (Admin)
				.route("user-service-admin", r -> r.path("/api/admin/**")
						.uri("lb://user-management"))


				// Salon-management
				.route("salon-service", r -> r.path("/api/salon/**")
						.uri("lb://salon-management"))

				// Treatment-management
				.route("treatment-service", r -> r.path("/api/treatment/**")
						.uri("lb://Treatment-managment"))

				// Availability-management
				.route("availability-service", r -> r.path("/api/availability/**")
						.uri("lb://availabilitymng"))

				// GestionRDV
				.route("rdv-service", r -> r.path("/RDVs/**")
						.uri("lb://GestionRDV"))

				.build();

				// Avis-service
				.route("avis-service", r -> r.path("/avis/**")
				.uri("lb://avis-service"))

				.build();
	}

}
