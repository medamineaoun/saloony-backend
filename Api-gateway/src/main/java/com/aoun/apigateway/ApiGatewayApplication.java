package com.aoun.apigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.reactive.CorsWebFilter;
import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
@EnableDiscoveryClient
public class ApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiGatewayApplication.class, args);
	}

	@Bean
	public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {
		return builder.routes()
				.route("user-service-general", r -> r.path("/api/user/**")
						.uri("lb://user-management"))
				.route("user-service-auth", r -> r.path("/api/auth/**")
						.uri("lb://user-management"))
				.route("user-service-customer", r -> r.path("/api/customer/**")
						.uri("lb://user-management"))
				.route("user-service-provider", r -> r.path("/api/provider/**")
						.uri("lb://user-management"))
				.route("user-service-admin", r -> r.path("/api/admin/**")
						.uri("lb://user-management"))
				.route("salon-service", r -> r.path("/api/salon/**")
						.uri("lb://salon-management"))
				.route("treatment-service", r -> r.path("/api/treatment/**")
						.uri("lb://Treatment-managment"))
				.route("availability-service", r -> r.path("/api/availability/**")
						.uri("lb://availabilitymng"))
				.route("rdv-service", r -> r.path("/RDVs/**")
						.uri("lb://GestionRDV"))
				.build();
	}

	@Bean
	public CorsWebFilter corsWebFilter() {
		CorsConfiguration config = new CorsConfiguration();
		config.setAllowCredentials(true);
		config.setAllowedOrigins(List.of("http://localhost:4200"));
		config.setAllowedMethods(Arrays.asList("GET", "POST", "PUT", "DELETE", "OPTIONS"));
		config.setAllowedHeaders(List.of("*"));
		config.setExposedHeaders(List.of("Authorization"));
		config.setMaxAge(3600L);

		UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
		source.registerCorsConfiguration("/**", config);

		return new CorsWebFilter(source);
	}
}