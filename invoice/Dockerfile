FROM openjdk:latest
ARG JAR_FILE=invoice/target/*.jar
COPY ${JAR_FILE} invoice/invoice-service.jar
COPY invoice/src/main/resources/application.properties .
EXPOSE 3030
ENTRYPOINT ["java","-jar","/invoice-service.jar"]