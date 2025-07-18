package com.availabilitymng.availabilitymng.config;

import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.OpenAPI;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {
    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Salon de Coiffure API")
                        .version("1.0")
                        .description("API pour la gestion des disponibilités d'un salon de coiffure"));
    }
}
