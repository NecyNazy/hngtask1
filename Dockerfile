# Use an official Tomcat image as a parent image
FROM tomcat:9.0-jre11-slim

# Remove the default Tomcat webapps
RUN rm -rf /usr/local/tomcat/webapps/*

# Copy your Spring Boot application WAR file into the Tomcat webapps directory
COPY target/hngtask1.war /usr/local/tomcat/webapps/ROOT.war

# Expose the default Tomcat port (8080)
EXPOSE 8080

# Start Tomcat and deploy your application
CMD ["catalina.sh", "run"]
