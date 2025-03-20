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
                        .title("API REST de Inventario-Hardware Store Inventory FFIG")
                        .version("1.0")
                        .description("Documentación de la API REST para gestionar el inventario de la ferretería FFIG. \n\n"
                                + "### Colaboradores del proyecto:\n"
                                + "- **David Ricardo Graffe Rodríguez, Ficha:2879724**\n"
                                + "- **Joaquín Humberto Jiménez Rosas, Ficha:2879723**\n"
                                + "- **Juan David Gallego López, Ficha:2879723**\n\n"
                                + "### Repositorio GitHub: \n"
                                + "- **Git Hub**: [Ver repositorio](https://github.com/Engineer78/API_Rest_SpringBoot_JPA_Doc_Swagger)\n"
                                + "### Herramientas utilizadas:\n"
                                + "- **Java JDK17**: [Descargar aquí](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)\n"
                                + "- **Spring Boot 3.4.3**: [Visita Spring Initializr](https://start.spring.io/)\n"
                                + "- **MySQL 9.1.0**: [Descargar desde MySQL Archives](https://downloads.mysql.com/archives/community/)")
                        .license(new License()
                                .name("JuDaJo - Sena Centro de Comercio y Turismo Armenía, Regional Quindío 2024 - 2025")
                                .url("https://www.sena.edu.co")) // URL licenciada
                        .contact(new Contact()
                                .name("Joaquín Humberto Jiménez Rosas")
                                .email("Joaquin_Jimenez@soy.sena.edu.co"))
                );
    }
}

