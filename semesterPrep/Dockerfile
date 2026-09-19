# Stage 1: Build the Spring Boot application
FROM eclipse-temurin:21-jdk AS builder

# Set working directory
WORKDIR /app

# Copy Maven wrapper and project configuration
COPY mvnw .
COPY .mvn .mvn
COPY pom.xml .

# Make Maven wrapper executable
RUN chmod +x mvnw

# Download dependencies
RUN ./mvnw dependency:go-offline -DskipTests

# Copy source code
COPY src src

# Build the Spring Boot application
RUN ./mvnw clean package -DskipTests

# Stage 2: Run the Spring Boot application
FROM eclipse-temurin:21-jre

# Set working directory
WORKDIR /app

# Copy generated JAR
COPY --from=builder /app/target/*.jar app.jar

# Spring Boot application port
EXPOSE 9090

# Start application
ENTRYPOINT ["java", "-jar", "app.jar"]
