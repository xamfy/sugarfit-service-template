# Sugarfit Service Template

A production-ready Spring Boot starter template designed to serve as the
foundation for backend microservices.

This project demonstrates clean architecture, operational readiness, and
engineering best practices suitable for high-traffic production
environments.

------------------------------------------------------------------------

## Tech Stack

-   Java 17
-   Spring Boot 3.x
-   Gradle
-   Spring Actuator
-   OpenAPI (Swagger)
-   Logback (with Correlation ID support)

------------------------------------------------------------------------

## How to Run

### Prerequisites

-   Java 17+
-   Gradle 8+ (or use the Gradle wrapper)

### Build the Project

``` bash
./gradlew clean build
```

### Run the Application

``` bash
./gradlew bootRun
```

The application will start at:

    http://localhost:8080

------------------------------------------------------------------------

## API Endpoints

### 1. Health Check

    GET /health

------------------------------------------------------------------------

### 2. Data Processor

    POST /example

#### Request Body

``` json
{
  "userId": "123",
  "value": 42
}
```

#### Response

``` json
{
  "status": "SUCCESS",
  "requestId": "uuid-string"
}
```

------------------------------------------------------------------------

## Swagger Documentation

Swagger UI is available at:

    http://localhost:8080/swagger-ui.html

------------------------------------------------------------------------

## Design Decisions

### 1. Layered Architecture

-   Controller Layer -- Handles HTTP requests and responses
-   Service Layer -- Contains business logic
-   DTO Layer -- Defines request and response models
-   Config Layer -- Infrastructure configuration
-   Exception Layer -- Centralized error handling

This structure ensures maintainability and clarity in multi-engineer
environments.

------------------------------------------------------------------------

### 2. Global Exception Handling

-   Consistent error responses
-   Proper validation error handling
-   Safe fallback for unexpected exceptions
-   Inclusion of requestId for traceability

------------------------------------------------------------------------

### 3. Correlation ID & Logging

Each request is assigned a requestId:

-   Reads X-Request-Id header if provided
-   Generates one if absent
-   Stores it in MDC
-   Returns it in the response
-   Includes it in all log entries

------------------------------------------------------------------------

### 4. Production Readiness Features

-   Graceful shutdown enabled
-   Liveness and readiness probes
-   Actuator metrics exposure
-   Input validation
-   Clean dependency management
-   Docker-ready structure

Graceful shutdown configuration:

``` properties
server.shutdown=graceful
spring.lifecycle.timeout-per-shutdown-phase=30s
```

------------------------------------------------------------------------

### 5. Dependency Management

The project relies on Spring Boot's dependency management to:

-   Avoid manual version conflicts
-   Ensure compatibility
-   Reduce maintenance overhead

Only non-managed dependencies explicitly specify versions.

------------------------------------------------------------------------

## Assumptions

-   No database required for this assignment.
-   No authentication/authorization implemented.
-   Business logic intentionally simple to focus on architecture and
    operability.
-   UUID is sufficient for request ID generation in this scope.

------------------------------------------------------------------------

## Future Roadmap

1.  Spring Security with JWT authentication
2.  OpenTelemetry tracing integration
3.  Structured JSON logging (ELK-ready)
4.  Rate limiting
5.  Circuit breaker (Resilience4j)
6.  CI/CD pipeline configuration
7.  Higher test coverage (unit + integration tests)
8.  API versioning strategy
9.  Centralized configuration management
10. Multi-stage Docker build optimization

------------------------------------------------------------------------

## Purpose of This Template

This template is intentionally minimal yet production-aware.\
It focuses on:

-   Clean structure
-   Observability
-   Maintainability
-   Scalability
-   Engineering discipline

It represents a solid foundation for building real-world backend
microservices.
