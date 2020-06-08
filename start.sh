#!/usr/bin/env bash

mvn clean install -DskipTests
docker build -t spring-boot-graphql:1.0 .
docker run -d -p 8080:8080 --name spring-boot-graphql spring-boot-graphql:1.0