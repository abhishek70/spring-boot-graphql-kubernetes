FROM openjdk:8
COPY /target/spring-boot-graphql.jar spring-boot-graphql.jar
EXPOSE 8080
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","spring-boot-graphql.jar"]