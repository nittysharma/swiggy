FROM openjdk:latest
ARG JAR_FILE=eureka/target/*.jar
COPY ${JAR_FILE} eureka/eureka-service.jar
COPY eureka/src/main/resources/application.properties .
EXPOSE 8761
ENTRYPOINT ["java","-jar","/eureka-service.jar"]