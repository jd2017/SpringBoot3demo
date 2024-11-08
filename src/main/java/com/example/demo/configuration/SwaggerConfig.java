package com.example.demo.configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;

import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;



@Configuration
public class SwaggerConfig {
    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info().title("Demo Spring Boot 3 API")
                        .description("This is a demo application for Spring Boot 3 with OpenAPI integration.")
                        .version("1.0.0")
                        .summary("summary")
                        .license(new License().name("name :JD").url("https://www.jianshu.com/u/007e515c5613"))
                        .contact(new Contact().name("JD2017").email("964321735@qq.com").url("https://www.jianshu.com/u/007e515c5613")));
    }

    @Bean
    @Primary
    public GroupedOpenApi publicApi() {
        return GroupedOpenApi.builder()
                .group("public")
                .pathsToMatch("/**")
                .build();
    }
}
