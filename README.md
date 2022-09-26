# cra-task
CRA Task

# CAMEL ON SPRING BOOT REST SERVER

## Description
Simple REST server created using Apache Camel and Spring Boot, one GET endpoint exposed to provide JSON using Spring Bean
```sh
# For local usage
localhost:8080/awesome

# Docker-compose running on publicly reachable VM
http://157.245.42.12/awesome
``` 

- Apache Camel 3.18.1
- Apache Maven 3.8.6
- Java JDK 19

## Instalation

```sh
# Clone project from GitHub
git clone https://github.com/VojtechMor/cra-task.git

# Clear target directory and build the project
mvn clean install

# .jar file can be run
java -jar .\target\cra-0.0.1-SNAPSHOT.jar
```

## Project Structure
```
.                                       # main directory project 
+-- java
|   +-- beans                           # Package for beans
|   |   +-- MyGetBean.java              # Bean used to retrieve JSON on GET
|   +-- item                            # Package for items
|   |   +-- Matches.java                # Random matching items for nested entries in JSON
|   |   +-- MyFact.java                 # Base data for JSON
|   +-- route                           # Package for routes
|   |   +-- MyRoute                     # Defines route, setting basic configuration for REST/GET
|   +-- CraApplication.java             # App starting point
+-- resources 
|   +-- application.properties          # Configuration file               
```

## Run Project 
You can start this project using
```sh
mvn clean spring-boot:run

# .jar file can also be run
java -jar .\target\cra-0.0.1-SNAPSHOT.jar
```

## Docker Installation
Docker image is available on Docker Hub
https://hub.docker.com/repository/docker/vojtechmor/camel-is-awesome
```sh
docker run vojtechmor/camel-is-awesome
```

## Example GET Request

Request
```sh

GET /awesome HTTP/1.1
Host: localhost:8080
Content-Type: application/json
```
Response
```
{
  "subject" : "Camel",
  "adjective" : "Awesome",
  "matches" : {
    "hotel" : "Trivago",
    "currentDateTime" : "2022/09/26 11:26:03"
  }
}
```

## Author 
Created and maintained by Vojtech M.
