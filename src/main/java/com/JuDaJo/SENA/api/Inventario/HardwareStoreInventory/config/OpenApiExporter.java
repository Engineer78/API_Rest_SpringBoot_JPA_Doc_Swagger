package com.JuDaJo.SENA.api.Inventario.HardwareStoreInventory.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.io.FileWriter;
import java.io.IOException;

@Component
public class OpenApiExporter implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        // URL donde está expuesta la documentación de la API
        String url = "http://localhost:8080/v3/api-docs";
        RestTemplate restTemplate = new RestTemplate();

        try {
            // Descarga el esquema OpenAPI (JSON)
            String openApiJson = restTemplate.getForObject(url, String.class);

            // Guarda el archivo en src/main/resources/api-docs.json
            try (FileWriter fileWriter = new FileWriter("src/main/resources/api-docs.json")) {
                fileWriter.write(openApiJson);
                System.out.println("Archivo OpenAPI guardado correctamente en src/main/resources/api-docs.json");
            }
        } catch (IOException e) {
            System.err.println("Error al escribir el archivo OpenAPI: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Error al descargar el esquema OpenAPI: " + e.getMessage());
        }
    }
}
