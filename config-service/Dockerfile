FROM openjdk:latest
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} config-server.jar
COPY src/main/resources/application.properties .
EXPOSE 8888
ENTRYPOINT ["java","-jar","/config-server.jar"]