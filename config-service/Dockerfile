FROM openjdk:latest
ARG JAR_FILE=config-service/target/*.jar
COPY ${JAR_FILE} config-service/config-service.jar
COPY config-service/src/main/resources/application.properties .
EXPOSE 8888
ENTRYPOINT ["java","-jar","/config-service.jar"]