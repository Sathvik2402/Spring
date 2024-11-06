# Use the official Tomcat image
FROM tomcat:9-jdk17-temurin

# Remove the default webapps to avoid conflict
RUN rm -rf /usr/local/tomcat/webapps/*

# Copy the WAR file to the webapps directory of Tomcat
COPY target/chatbot.war /usr/local/tomcat/webapps/ROOT.war

# Expose the default Tomcat port
EXPOSE 8080

# Start Tomcat
CMD ["catalina.sh", "run"]