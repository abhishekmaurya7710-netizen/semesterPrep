# Stage 1: Build the Spring Boot application

FROM eclipse-temurin:21-jdk AS builder

# Set the working directory

WORKDIR /app

# Copy Gradle wrapper and Gradle configuration

COPY gradlew .
COPY gradle gradle
COPY build.gradle settings.gradle ./

# Copy the source code

COPY src src

# Make Gradle wrapper executable

RUN chmod +x gradlew

# Build the Spring Boot application

# Tests are skipped during the Docker build

RUN ./gradlew bootJar -x test

# Stage 2: Run the Spring Boot application

FROM eclipse-temurin:21-jre

# Set the working directory

WORKDIR /app

# Copy the generated JAR from the builder stage

# The wildcard works regardless of the exact JAR filename

COPY --from=builder /app/build/libs/*.jar app.jar

# Spring Boot application port

EXPOSE 9090

# Start the Spring Boot application

ENTRYPOINT ["java", "-jar", "app.jar"]
