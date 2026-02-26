package com.sugarfit.service.config;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI sugarfitOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Sugarfit Service Template API")
                        .description("Starter template for building production-ready microservices.")
                        .version("v1.0.0")
                        .contact(new Contact()
                                .name("Sugarfit Engineering")
                                .email("engineering@sugarfit.com"))
                        .license(new License()
                                .name("Proprietary")))
                .externalDocs(new ExternalDocumentation()
                        .description("Internal Documentation")
                        .url("https://sugarfit.com/docs"));
    }
}
