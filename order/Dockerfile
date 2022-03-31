FROM openjdk:latest
ARG JAR_FILE=order/target/*.jar
COPY ${JAR_FILE} order/customer-service.jar
COPY order/src/main/resources/application.properties .
EXPOSE 4040
ENTRYPOINT ["java","-jar","/order-service.jar"]