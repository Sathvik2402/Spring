FROM openjdk:17
EXPOSE 8080
ADD target/docker-sample-app.jar docker-sample-app.jar
ENTRYPOINT ["java","-jar","/docker-sample-app.jar"]