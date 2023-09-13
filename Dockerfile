# Use an official Tomcat image as a parent image
FROM ubuntu:latest AS build

# Remove the default Tomcat webapps
RUN rm -rf /usr/local/tomcat/webapps/*

RUN apt-get update
RUN apt-get install openjdk-17-jdk -y
COPY . .

# Copy your Spring Boot application WAR file into the Tomcat webapps directory


RUN ./gradlew bootwar --no daemon

FROM tomcat:9.0-jre11-slim

# Expose the default Tomcat port (8080)
EXPOSE 8080

COPY target/hngtask1.war /usr/local/tomcat/webapps/ROOT.war

# Start Tomcat and deploy your application
CMD ["catalina.sh", "run"]
