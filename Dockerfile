FROM openjdk:19-corrento

COPY build/libs/parcial-*.jar /app/parcial.jar

CMD ["java", "-jar", "/app/parcial.jar"]