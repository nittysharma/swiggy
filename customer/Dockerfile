FROM openjdk:latest
ARG JAR_FILE=target/*.jar
ADD ${JAR_FILE} customer-service.jar
ADD src/main/resources/application.properties .
EXPOSE 5050
ENTRYPOINT ["java","-jar","/customer-service.jar"]