FROM openjdk:latest
ARG JAR_FILE=customer/target/*.jar
COPY ${JAR_FILE} customer/customer-service.jar
COPY customer/src/main/resources/application.properties .
EXPOSE 5050
ENTRYPOINT ["java","-jar","/customer-service.jar"]