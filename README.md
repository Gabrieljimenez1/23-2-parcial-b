# Imagen Docker

Para crear la imagen docker correspondiente del este proyecto se debe:

-Tener un documento sin extencion llamado DockerFile, el cual debe ser de la siguiente manera:

FROM openjdk:19-corrento

COPY build/libs/parcial-*.jar /app/parcial.jar

CMD ["java", "-jar", "/app/parcial.jar"]

Para conectar el aplicativo con sql se debe utilizar el siguiente comando:

docker run -d -p 8090:3306 -e MYSQL_ROOT_PASSWORD=yms_clave -e MYSQL_USER=yms_user -e MYSL_HOST:localhost mysql
