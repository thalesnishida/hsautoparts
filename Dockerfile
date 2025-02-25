FROM openjdk:17-jdk-slim

WORKDIR /app

COPY build/libs/hsautocars-0.0.1-SNAPSHOT.jar /app/hsautocars.jar

EXPOSE 8080

# Comando para rodar a aplicação
ENTRYPOINT ["java", "-jar", "hsautocars.jar"]
