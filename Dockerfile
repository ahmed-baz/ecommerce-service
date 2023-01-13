FROM openjdk:8-jdk-alpine
LABEL maintainer="myFawry"
ARG JAR_FILE=target/*.jar
ADD ./target/ecommerce-app-1.0.0.jar ecommerce-app.jar
EXPOSE 9999
ENTRYPOINT ["java","-jar","/ecommerce-app.jar"]
