# Stage 1 - Build Gradle
FROM gradle:8.4-jdk21 AS build

WORKDIR /app

COPY . .

RUN gradle build --no-daemon

# Stage 2 - Runtime Java
FROM eclipse-temurin:21-jdk

WORKDIR /app

COPY --from=build /app/build/libs/*.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]