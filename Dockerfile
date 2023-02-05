#base image
FROM tomcat:8.5.47-jdk8-openjdk
LABEL maintainer="ahmedbaz1024"
RUN rm -rf /usr/local/tomcat/webapps/*
ARG JAVA_OPTS=target/*.war
ADD ${JAR_FILE} /usr/local/tomcat/webapps/ecommerce-app.war
ENV JAVA_OPTS="-Dspring.profiles.active=dev"
EXPOSE 8080
#if we didn't set CMD ["catalina.sh","run"], it will inherit from the base image [tomcat:8.5.47-jdk8-openjdk]
#so we can skip it, but I will leave it
CMD ["catalina.sh","run"]
