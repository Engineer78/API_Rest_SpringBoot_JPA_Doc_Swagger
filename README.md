# Hardware Store Inventory API
Este proyecto consiste en la creación de una API REST utilizando Spring Boot, desarrollada como parte del programa Hardware Store Inventory FFIG, específicamente para gestionar el módulo de inventario de una ferretería.

📋 Descripción
La API ofrece funcionalidades para:

Gestionar proveedores, categorías, productos y las relaciones entre ellos.

Realizar operaciones CRUD (Crear, Leer, Actualizar, Eliminar) sobre los recursos de inventario.

Estandarizar y optimizar la gestión de inventario mediante servicios REST.

Adicionalmente, la documentación de la API se genera automáticamente utilizando Swagger y SpringDoc, proporcionando una herramienta interactiva que facilita la exploración y prueba de los endpoints en tiempo real.

Este proyecto fue diseñado como un trabajo formativo y colaborativo en el marco del SENA Centro de Comercio y Turismo de Armenia - Regional Quindío.

🌟 Estructura del Proyecto
El desarrollo se realizo por el equipo de desarrollo:

develop1: Joaquín H. Jiménez Rosas (Ficha 2879723)

develop2: Juan David Gallego López (Ficha 2879723)

develop3: David Ricardo Graffe Rodríguez (Ficha 2879724)

Además, la generación de la documentación se configuró mediante la clase SwaggerConfig, que define las especificaciones iniciales, y la clase OpenApiExporter, que guarda el archivo de documentación en formato JSON dentro de la estructura del proyecto.

📚 Propósito Formativo
Este proyecto tiene como objetivo formar habilidades en:

Diseño y desarrollo de APIs REST utilizando Spring Boot.

Generación de documentación automática mediante Swagger y SpringDoc.

Gestión colaborativa del código mediante Git y GitHub.

Aplicación de conceptos básicos de arquitectura y gestión de proyectos de software.

Instructor a cargo: Carlos Alberto Fuel Tulcan, del SENA Centro de Comercio y Turismo - Regional Quindío.

🛠️ Tecnologías Utilizadas
Lenguaje de programación: Java

Framework: Spring Boot

Gestión de dependencias: Maven

Base de datos: MySQL

Control de versiones: Git / GitHub

Documentación: Swagger y SpringDoc (implementados para generar automáticamente la interfaz y los esquemas OpenAPI).

🚀 Configuración e Instalación
Sigue estos pasos para ejecutar el proyecto en tu entorno local:

Clona este repositorio:

bash
git clone https://github.com/Engineer78/API_Rest_SpringBoot_JPA_Doc_Swagger/
cd hardware-store-inventory-api
Configura la base de datos en el archivo application.properties:

properties
spring.datasource.url=jdbc:mysql://localhost:3306/inventario_api
spring.datasource.username=TU_USUARIO
spring.datasource.password=TU_CONTRASEÑA
Ejecuta el proyecto:

bash
mvn spring-boot:run
Accede a la API en:

http://localhost:8080
Explora la documentación de la API: Una vez que la API esté ejecutándose, dirígete a la siguiente URL en tu navegador para acceder a la documentación generada automáticamente por Swagger:

http://localhost:8080/swagger-ui/index.html

👥 Contribuidores
Joaquín H. Jiménez Rosas - develop1 (Ficha 2879723)

Juan David Gallego López - develop2 (Ficha 2879723)

David Ricardo Graffe Rodríguez - develop3 (Ficha 2879724)

📝 Licencia
Este proyecto es formativo y no posee una licencia de distribución. Su uso es exclusivo para fines educativos dentro del SENA.
