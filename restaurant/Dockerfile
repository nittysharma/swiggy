FROM openjdk:latest
ARG JAR_FILE=restaurant/target/*.jar
COPY ${JAR_FILE} restaurant/restaurant-service.jar
COPY restaurant/src/main/resources/application.properties .
EXPOSE 6060
ENTRYPOINT ["java","-jar","/restaurant-service.jar"]