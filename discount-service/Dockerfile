FROM openjdk:18-ea-11-jdk-alpine3.15

EXPOSE 8081

ADD target/*.jar app.jar

ENTRYPOINT ["java","-jar","app.jar"]