FROM eclipse-temurin:17-jre-jammy
WORKDIR /app
COPY /target/*.jar ./java.jar
EXPOSE 8080
CMD ["java", "-jar", "java.jar"]