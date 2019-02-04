# Costumer
 Customer registration, for demonstrate the Spring Cloud.

## Resume

* Java
* Spring Boot
* Spring Data
* Spring Boot Actuator
* H2
* Lombok
* docker-maven-plugin
* swagger

## How to run

To use Spring Cloud first you download the costumer-config-server, costumer-eureka-server and costumer-zuul-server, run all with.

`mvn spring-boot:run`


## Create docker image

`mvn clean package docker:build`

## Swagger 

`http://localhost:8080/swagger-ui.html`

## Actuator

`http://localhost:8080/actuator`
