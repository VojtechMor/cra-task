FROM openjdk:19-jdk-alpine
MAINTAINER vojtech
COPY target/cra-0.0.1-SNAPSHOT.jar cra-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/cra-0.0.1-SNAPSHOT.jar"]
EXPOSE 8080