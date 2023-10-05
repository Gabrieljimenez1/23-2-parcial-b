# Imagen Docker

Para crear la imagen docker correspondiente del este proyecto se debe:

-Tener un documento sin extencion llamado DockerFile, el cual debe ser de la siguiente manera:

FROM openjdk:19-corrento

COPY build/libs/parcial-*.jar /app/parcial.jar

CMD ["java", "-jar", "/app/parcial.jar"]
