FROM openjdk:latest
ARG JAR_FILE=menu/target/*.jar
COPY ${JAR_FILE} menu/customer-service.jar
COPY menu/src/main/resources/application.properties .
EXPOSE 7070
ENTRYPOINT ["java","-jar","/menu-service.jar"]