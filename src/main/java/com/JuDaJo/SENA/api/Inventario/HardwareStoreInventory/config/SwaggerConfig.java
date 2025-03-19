package com.JuDaJo.SENA.api.Inventario.HardwareStoreInventory.config;

import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {
    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("API REST de Inventario-hardwareStoreInventory")
                        .version("1.0")
                        .description("Documentación de la API REST para gestionar el inventario de la ferreteria FFIG.")
                        .license(new License()
                                .name("Java JDK17")
                                .url("https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html"))
                        .license(new License()
                                .name("SpringBoot 3.4.3")
                                .url("https://start.spring.io/"))
                        .license(new License()
                                .name("MySql 9.1.0")
                                .url("https://downloads.mysql.com/archives/community/"))
                        .contact(new Contact()
                                .name("David Ricardo Graffe Rodríguez Ficha: 2879724, Joaquín Humberto Jiménez Rosas y Juan David Gallego López Ficha: 2879723")
                                .email("Joaquin_Jimenez@soy.sena.edu.co"))
                );
    }
}
