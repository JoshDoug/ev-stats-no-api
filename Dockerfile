FROM openjdk:11
WORKDIR /
ADD target/ev-stats-no-api-0.0.1-SNAPSHOT.jar //
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/db-exporter-0.0.1-SNAPSHOT.jar"]