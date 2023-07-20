# Proyecto Mediplus Spring Boot 3.1.1
Este proyecto ha sido creado utilizando Spring Boot 3.1.1 y está diseñado para funcionar con el JDK 17. Este proyecto actúa como backend para el proyecto de frontend llamado mediplus-ui.

## Requisitos
- Java 17
- Docker
- Docker Compose

## Configuración Local
1. Instalación del JDK 17:

    Si no tienes instalado el JDK 17, puedes descargarlo e instalarlo desde el sitio oficial de Oracle. Asegúrate de tener configuradas las variables de entorno correctamente.

2. Instalación de Docker:

    Si no tienes Docker instalado, puedes descargarlo e instalarlo desde el sitio oficial de Docker.

3. Instalación de Docker Compose:

    Si no tienes Docker Compose instalado, puedes descargarlo e instalarlo desde el sitio oficial de Docker Compose.

## Ejecución del Proyecto
1. Levantar los servicios con Docker Compose:

    En la raíz del proyecto, ejecuta el siguiente comando para levantar los servicios necesarios con Docker Compose.

```
docker-compose up -d
```

2. Ejecutar el proyecto Spring Boot:

    En la raíz del proyecto, puedes utilizar el siguiente comando para ejecutar la aplicación Spring Boot:

```
./mvnw spring-boot:run
```

Si estás en Windows, el comando será:

```
mvnw.cmd spring-boot:run
```

3. Ejecutar el proyecto frontend (mediplus-ui):

    Ve a la carpeta del proyecto frontend y sigue las instrucciones para ejecutarlo. Este se conectará al backend que acabas de iniciar.

## Nota
Recuerda que el proyecto de frontend, mediplus-ui, debe estar en ejecución y configurado correctamente para conectarse a este backend.

## Contribuir
Para contribuir al proyecto, por favor crea un 'fork' del repositorio, realiza tus cambios y crea un 'pull request' para que puedan ser incorporados al proyecto principal.

Gracias por tu interés en nuestro proyecto.
