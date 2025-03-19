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
                        .description("Documentación de la API REST para gestionar el inventario de la ferreteria FFIG \n\n"
                                + "Esta API utiliza las siguientes herramientas:\n"
                                + "- Java JDK17: [Descargar aquí](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)\n"
                                + "- Spring Boot 3.4.3: [Visita Spring Initializr](https://start.spring.io/)\n"
                                + "- MySQL 9.1.0: [Descargar desde MySQL Archives](https://downloads.mysql.com/archives/community/)")
                        .license(new License()
                                .name("JuDaJo - Sena Centro de Comercio y Turismo Armenía, Regional Quindío 2024 - 2025"))
                        .contact(new Contact()
                                .name("David Ricardo Graffe Rodríguez Ficha: 2879724, Joaquín Humberto Jiménez Rosas y Juan David Gallego López Ficha: 2879723")
                                .email("Joaquin_Jimenez@soy.sena.edu.co"))
                );
    }
}
