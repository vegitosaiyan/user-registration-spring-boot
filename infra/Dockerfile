FROM eclipse-temurin:21-jre-alpine
WORKDIR /app
COPY target/*.jar app.jar
EXPOSE 8080
ENV JAVA_OPTS="-Duser.timezone=UTC"
ENTRYPOINT ["sh", "-c", "java \$JAVA_OPTS -jar app.jar"]