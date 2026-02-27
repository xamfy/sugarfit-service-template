FROM eclipse-temurin:17-jre-alpine
WORKDIR /app
COPY build/libs/app.jar app.jar
ENTRYPOINT ["java","-XX:+UseContainerSupport","-jar","app.jar"]
