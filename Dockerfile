
FROM eclipse-temurin:17
COPY target/ems.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
